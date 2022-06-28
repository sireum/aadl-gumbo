package org.sireum.aadl.osate.gumbo2air;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.Port;
import org.sireum.Option;
import org.sireum.aadl.osate.architecture.VisitorUtil;
import org.sireum.aadl.osate.util.SlangUtils;
import org.sireum.hamr.ir.AadlASTFactory;
import org.sireum.hamr.ir.Name;
import org.sireum.lang.ast.Attr;
import org.sireum.lang.ast.Attr$;
import org.sireum.lang.ast.Exp.Ident;
import org.sireum.lang.ast.Exp.Ident$;
import org.sireum.lang.ast.Exp.Select;
import org.sireum.lang.ast.Exp.Select$;
import org.sireum.lang.ast.Id;
import org.sireum.lang.ast.Id$;
import org.sireum.lang.ast.Name$;
import org.sireum.lang.ast.ResolvedAttr;
import org.sireum.lang.ast.ResolvedAttr$;
import org.sireum.lang.ast.Type;
import org.sireum.lang.ast.TypedAttr;
import org.sireum.lang.ast.TypedAttr$;
import org.sireum.message.FlatPos;
import org.sireum.message.FlatPos$;
import org.sireum.message.Position;

import scala.Function1;
import scala.Tuple2;

public class GumboUtils {

	protected final static AadlASTFactory factory = new AadlASTFactory();

	// refer to BinaryOp defined in
	// https://github.com/sireum/slang/blob/0e73b8bf13022f876bf6961c442c65022cbaecfc/ast/shared/src/main/scala/org/sireum/lang/ast/AST.scala#L1264
	final static org.sireum.Map<String, String> binaryOps = //
			(org.sireum.Map$.MODULE$.apply(VisitorUtil.toISZ( //
					"+", "-", "*", "/", "%", //
					"==", "===", "!=", "=!=", //
					"<<", ">>", ">>>", //
					"<", "<=", ">", ">=", "&", "|", "|^", //
					"->:", "&&", "||", //
					// "-->:" invalid symbol in AADL
					":+", "+:", "++", "--", //
					"~>").map((Function1<String, Tuple2<String, String>>) (String key) -> {
						return Tuple2.apply(key, key);
					}))) //
					.$plus(Tuple2.apply("~>:", "->:")) // also allow non-standard '~>:' variant
					.$plus(Tuple2.apply("~~>:", "-->:")); // can't use '-->:' since '--' is and aadl comment

	public static String toSlangBinaryOp(String op) {
		String lop = op.toLowerCase();
		if (binaryOps.contains(lop)) {
			return binaryOps.get(lop).get();
		}
		throw new RuntimeException("Binary operator '" + op + "' not supported");
	}

	// UnaryOp is nested inside an object. Its '.Type' is not
	// accessible in Java contexts (e.g. Eclipse), but its byName(..)
	// still works, so using Java enums with identical names so
	// the slang enum value can be retrieved via byName
	public enum UnaryOp {
		Not, Plus, Minus, Complement
	}

	public static UnaryOp toSlangUnaryOp(String op) {
		if (op.equalsIgnoreCase("-")) {
			return UnaryOp.Minus;
		} else if (op.equalsIgnoreCase("!")) {
			return UnaryOp.Not;
		}

		throw new RuntimeException("Unary operator '" + op + "' not supported");
	}

	public static Name toName(List<String> _path) {
		return factory.name(_path, null);
	}

	public static Name toName(String n, List<String> _path) {
		return toName(VisitorUtil.add(_path, n));
	}

	public static Name toName(String n) {
		return toName(n, VisitorUtil.iList());
	}

	public static Name toName(Port p) {
		return toName(p.getName());
	}

	public static Name emptyName() {
		return toName(VisitorUtil.iList());
	}

	public static Option<Position> buildPosInfo(EObject object) {
		Position p = VisitorUtil.buildPosInfo(object);
		return p == null ? SlangUtils.toNone() : SlangUtils.toSome(p);
	}

	public static Attr buildAttr(EObject object) {
		Position p = VisitorUtil.buildPosInfo(object);
		return buildAttr(p == null ? SlangUtils.toNone() : SlangUtils.toSome(p));
	}

	public static Attr buildAttr(Option<Position> p) {
		return Attr$.MODULE$.apply(p);
	}

	public static ResolvedAttr buildResolvedAttr(EObject object) {
		Position p = VisitorUtil.buildPosInfo(object);
		return buildResolvedAttr(p == null ? SlangUtils.toNone() : SlangUtils.toSome(p));
	}

	public static ResolvedAttr buildResolvedAttr(Option<Position> p) {
		return ResolvedAttr$.MODULE$.apply(p, SlangUtils.toNone(), SlangUtils.toNone());
	}

	public static TypedAttr buildTypedAttr(EObject object) {
		Position p = VisitorUtil.buildPosInfo(object);
		return TypedAttr$.MODULE$.apply(p == null ? SlangUtils.toNone() : SlangUtils.toSome(p), SlangUtils.toNone());
	}

	public static Option<Position> mergePositions(Option<Position> a, Option<Position> b) {
		if (a.isEmpty()) {
			return b;
		} else if (b.isEmpty()) {
			return a;
		} else {
			FlatPos af = (FlatPos) a.get();
			FlatPos bf = (FlatPos) b.get();
			assert af.getOffset32() <= bf.getOffset32() : af.getOffset32() + " vs " + bf.getOffset32();

			int length = (bf.getOffset32() - af.getOffset32()) + bf.length32();
			return SlangUtils.toSome(FlatPos$.MODULE$.apply(af.getUriOpt(), //
					af.getBeginLine32(), af.getBeginColumn32(), //
					bf.getEndLine32(), bf.getEndColumn32(), //
					af.getOffset32(), //
					length));
		}
	}

	public static Option<org.sireum.String> getOptionalSlangString(String s) {
		return s == null ? SlangUtils.toNone() : SlangUtils.toSome(getSlangString(s));
	}

	public static org.sireum.String getSlangString(String s) {
		return new org.sireum.String(s.substring(1, s.length() - 1)); // remove quotes
	}

	public static Option<Position> shrinkPos(Option<Position> o, int newLength) {
		if (o.isEmpty()) {
			return o;
		} else {
			FlatPos fp = (FlatPos) o.get();

			assert fp.getBeginColumn32() + newLength <= fp.getEndColumn32();

			return SlangUtils.toSome(FlatPos$.MODULE$.apply(fp.getUriOpt(), //
					fp.getBeginLine32(), fp.getBeginColumn32(), //
					fp.getBeginLine32(), fp.getBeginColumn32() + newLength, //
					fp.offset32(), //
					newLength));
		}
	}

	public static Select convertIdStackToSelect(Stack<Object> names) {
		assert (names.size() >= 2);

		while (names.size() > 1) {
			Object a = names.pop();
			Id b = (Id) names.pop();

			if (a instanceof Id) {
				Id aAsId = (Id) a;
				Option<Position> optPos = GumboUtils.mergePositions(aAsId.getAttr().getPosOpt(), b.attr().getPosOpt());
				Ident ident = Ident$.MODULE$.apply(aAsId, GumboUtils.buildResolvedAttr(aAsId.getAttr().getPosOpt()));
				names.push(Select$.MODULE$.apply(SlangUtils.toSome(ident), b, VisitorUtil.toISZ(),
						GumboUtils.buildResolvedAttr(optPos)));
			} else {
				Select aAsSelect = (Select) a;
				Option<Position> optPos = GumboUtils.mergePositions(aAsSelect.getAttr().getPosOpt(),
						b.attr().getPosOpt());
				names.push(Select$.MODULE$.apply(SlangUtils.toSome((Select) a), b, VisitorUtil.toISZ(),
						GumboUtils.buildResolvedAttr(optPos)));
			}
		}

		return (Select) names.pop();
	}

	public static Type.Named buildTypeNamed(DataSubcomponentType typ, EObject object) {
		List<Id> retTypeIds = new ArrayList<>();
		for (String seg : typ.getQualifiedName().split("::")) {
			retTypeIds.add(Id$.MODULE$.apply(seg, GumboUtils.buildAttr(object)));
		}
		org.sireum.lang.ast.Name retTypeName = Name$.MODULE$.apply(VisitorUtil.toISZ(retTypeIds),
				GumboUtils.buildAttr(object));
		List<Type> retTypeArgs = new ArrayList<>();
		TypedAttr retTypedAttr = TypedAttr$.MODULE$.apply(GumboUtils.buildPosInfo(object), SlangUtils.toNone());
		return Type.Named$.MODULE$.apply(retTypeName, VisitorUtil.toISZ(retTypeArgs), retTypedAttr);
	}
}