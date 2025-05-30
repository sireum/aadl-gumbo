package org.sireum.aadl.osate.gumbo2air;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.Port;
import org.sireum.Option;
import org.sireum.aadl.gumbo.gumbo.QuantifiedExp;
import org.sireum.aadl.osate.util.SlangUtil;
import org.sireum.aadl.osate.util.VisitorUtil;
import org.sireum.aadl.osate.util.VisitorUtil.Pair;
import org.sireum.hamr.ir.AadlASTFactory;
import org.sireum.hamr.ir.Name;
import org.sireum.hamr.codegen.common.util.GclUtil;
import org.sireum.lang.ast.Attr;
import org.sireum.lang.ast.Attr$;
import org.sireum.lang.ast.*;
import org.sireum.lang.ast.Exp;
import org.sireum.lang.ast.Exp.Binary;
import org.sireum.lang.ast.Exp.Binary$;
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
import org.sireum.lang.ast.Typed;
import org.sireum.lang.ast.TypedAttr;
import org.sireum.lang.ast.TypedAttr$;
import org.sireum.message.FlatPos;
import org.sireum.message.FlatPos$;
import org.sireum.message.Position;

public class GumboUtil {

	protected final static AadlASTFactory factory = new AadlASTFactory();

	// https://github.com/sireum/slang/blob/ea2960f17c78b653094c1ff038a8386f6f22d32b/ast/shared/src/main/scala/org/sireum/lang/ast/AST.scala#L1643
	public static String toSlangBinaryOp(String op) {
		switch (op.toLowerCase()) {
		case "+":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Add();
		case "-":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Sub();
		case "*":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Mul();
		case "/":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Div();
		case "%":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Rem();
		case "==":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Eq();
		case "===":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Equiv();
		case "≡":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.EquivUni();
		case "!=":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Ne();
		case "=!=":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Inequiv();
		case "≢":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.InequivUni();
		case "~~":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.FpEq();
		case "!~":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.FpNe();
		case "<<":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Shl();
		case ">>":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Shr();
		case ">>>":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Ushr();
		case "<":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Lt();
		case "<=":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Le();
		case ">":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Gt();
		case ">=":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Ge();
		case "&":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.And();
		case "|":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Or();
		case "|^":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Xor();

		case "__>:":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Imply();
		case "->:":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Imply();
		case "~>:":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Imply();

		case "&&":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.CondAnd();
		case "||":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.CondOr();

		case "___>:":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.CondImply();
		case "~~>:":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.CondImply();

		case ":+":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Append();
		case "+:":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Prepend();
		case "++":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.AppendAll();
		case "--":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.RemoveAll();
		case "~>":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.MapsTo();
		case "=>:":
			return org.sireum.lang.ast.Exp.BinaryOp$.MODULE$.Arrow();

		default:
			throw new RuntimeException("Binary operator '" + op + "' not supported");
		}

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
		} else if (op.equalsIgnoreCase("+")) {
			return UnaryOp.Plus;
		} else if (op.equalsIgnoreCase("~")) {
			return UnaryOp.Complement;
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

	public static Attr buildAttr(EObject object) {
		Position p = VisitorUtil.buildPosition(object);
		return buildAttr(p == null ? SlangUtil.toNone() : SlangUtil.toSome(p));
	}

	public static Attr buildAttr(Option<Position> p) {
		return Attr$.MODULE$.apply(p);
	}

	public static ResolvedAttr buildResolvedAttr(EObject object) {
		Position p = VisitorUtil.buildPosition(object);
		return buildResolvedAttr(p == null ? SlangUtil.toNone() : SlangUtil.toSome(p));
	}
	
	public static ResolvedAttr buildResolvedAttr_BuiltIn_Apply(Option<Position> p) {
		ResolvedAttr ret = buildResolvedAttr(p);
		return ret.apply( //
				ret.posOpt(), //
				SlangUtil.toSome(ResolvedInfo.BuiltIn$.MODULE$.apply(
						GclUtil.SlangAstBridge$.MODULE$.getResolvedInfo_BuiltIn_Kind("Apply"))), //
				ret.getTypedOpt());
	}

	public static ResolvedAttr buildResolvedAttr(Option<Position> p) {
		return ResolvedAttr$.MODULE$.apply(p, SlangUtil.toNone(), SlangUtil.toNone());
	}

	public static TypedAttr buildTypedAttr(EObject object) {
		return buildTypedAttr(object, null);
	}

	public static TypedAttr buildTypedAttr(EObject object, Typed ta) {
		Position p = VisitorUtil.buildPosition(object);
		return TypedAttr$.MODULE$.apply(p == null ? SlangUtil.toNone() : SlangUtil.toSome(p),
				ta == null ? SlangUtil.toNone() : SlangUtil.toSome(ta));
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
			return SlangUtil.toSome(buildPos(//
					af.getUriOpt(), //
					af.getBeginLine32(), af.getBeginColumn32(), //
					bf.getEndLine32(), bf.getEndColumn32(), //
					af.getOffset32(), //
					length));
		}
	}

	public static Option<org.sireum.String> getOptionalSlangString(String s) {
		return s == null ? SlangUtil.toNone() : SlangUtil.toSome(getSlangString(s));
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

			return SlangUtil.toSome(buildPos(//
					fp.getUriOpt(), //
					fp.getBeginLine32(), fp.getBeginColumn32(), //
					fp.getBeginLine32(), fp.getBeginColumn32() + newLength, //
					fp.offset32(), //
					newLength));
		}
	}
	
	public static Position buildPos(Option<org.sireum.String> uriOpt, int beginLine, int beginCol, int endLine, int endCol, int offset, int length) {
		return FlatPos$.MODULE$.apply(uriOpt, beginLine, beginCol, endLine, endCol, offset, length);
	}
	
	public static Exp convertExpStackToBinary(Exp lhs, Stack<Pair<String, Exp>> stack) {
		if (stack.isEmpty()) {
			return lhs;
		} else {
			while (stack.size() > 1) {
				Pair<String, Exp> right = stack.pop();
				Pair<String, Exp> left = stack.pop();
				Option<Position> posOpt = mergePositions(left.t2.posOpt(), right.t2.posOpt());
				Binary b = Binary$.MODULE$.apply(left.t2, right.t1, right.t2, GumboUtil.buildResolvedAttr(posOpt), posOpt);
				stack.push(new Pair<>(left.t1, b));
				
			}
			Pair<String, Exp> right = stack.pop();
			Option<Position> posOpt = mergePositions(lhs.posOpt(), right.t2.posOpt());
			return Binary$.MODULE$.apply(lhs, right.t1, right.t2, GumboUtil.buildResolvedAttr(posOpt), posOpt);
		}
				
	}

	public static Exp convertIdStackToSelect(Stack<Object> names) {
		assert (names.size() >= 1);

		if (names.size() > 1) {
			while (names.size() > 1) {
				Object a = names.pop();
				Id b = (Id) names.pop();

				if (a instanceof Id) {
					Id aAsId = (Id) a;
					Option<Position> optPos = (a != null && b != null)
							? GumboUtil.mergePositions(aAsId.getAttr().getPosOpt(), b.attr().getPosOpt())
							: SlangUtil.toNone();
					Ident ident = Ident$.MODULE$.apply(aAsId, GumboUtil.buildResolvedAttr(aAsId.getAttr().getPosOpt()));
					names.push(Select$.MODULE$.apply(SlangUtil.toSome(ident), b, VisitorUtil.toISZ(),
							GumboUtil.buildResolvedAttr(optPos)));
				} else {
					Select aAsSelect = (Select) a;
					Option<Position> optPos = (a != null && b != null)
							? GumboUtil.mergePositions(aAsSelect.getAttr().getPosOpt(), b.attr().getPosOpt())
							: SlangUtil.toNone();
					names.push(Select$.MODULE$.apply(SlangUtil.toSome((Select) a), b, VisitorUtil.toISZ(),
							GumboUtil.buildResolvedAttr(optPos)));
				}
			}
			return (Select) names.pop();
		} else {
			Id id = (Id) names.get(0);
			return Ident$.MODULE$.apply(id, GumboUtil.buildResolvedAttr(id.getAttr().getPosOpt()));
		}

	}

	public static Type.Named buildTypeNamed(DataSubcomponentType typ, EObject object) {
		List<Id> retTypeIds = new ArrayList<>();
		List<org.sireum.String> retTypeStrings = new ArrayList<>();
		for (String seg : typ.getQualifiedName().split("::")) {
			retTypeIds.add(Id$.MODULE$.apply(seg, GumboUtil.buildAttr(object)));
			retTypeStrings.add(new org.sireum.String(seg));
		}
		org.sireum.lang.ast.Name retTypeName = Name$.MODULE$.apply(VisitorUtil.toISZ(retTypeIds),
				GumboUtil.buildAttr(object));
		List<Type> retTypeArgs = new ArrayList<>();

		Typed.Name typedName = Typed.Name$.MODULE$.apply(VisitorUtil.toISZ(retTypeStrings), VisitorUtil.toISZ());
		TypedAttr retTypedAttr = TypedAttr$.MODULE$.apply(VisitorUtil.buildPositionOpt(object),
				SlangUtil.toSome(typedName));

		return Type.Named$.MODULE$.apply(retTypeName, VisitorUtil.toISZ(retTypeArgs), retTypedAttr);
	}

	public static ComponentType getComponentType(Classifier classifier) {
		if (classifier instanceof ComponentType) {
			return (ComponentType) classifier;
		} else if (classifier instanceof ComponentImplementation) {
			return ((ComponentImplementation) classifier).getType();
		} else {
			return null;
		}
	}

	// VarKind is defined in Typed object. Its '.Type' is not
	// accessible in Java contexts (e.g. Eclipse), but its byName(..)
	// still works, so using Java enums with identical names so
	// the slang enum value can be retrieved via byName
	public enum Typed_VarKind {
		Mutable, Immutable, Index
	}

	public static org.sireum.hamr.ir.Attr toAttr(EObject e) {
		return org.sireum.hamr.ir.Attr$.MODULE$.apply(VisitorUtil.buildPositionOpt(e));
	}
}