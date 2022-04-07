package org.sireum.aadl.osate.gumbo2air;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.Port;
import org.sireum.Option;
import org.sireum.aadl.osate.architecture.VisitorUtil;
import org.sireum.aadl.osate.util.SlangUtils;
import org.sireum.hamr.ir.AadlASTFactory;
import org.sireum.hamr.ir.Name;
import org.sireum.lang.ast.Attr;
import org.sireum.lang.ast.Attr$;
import org.sireum.lang.ast.ResolvedAttr;
import org.sireum.lang.ast.ResolvedAttr$;
import org.sireum.lang.ast.TypedAttr;
import org.sireum.lang.ast.TypedAttr$;
import org.sireum.message.FlatPos;
import org.sireum.message.FlatPos$;
import org.sireum.message.Position;

public class GumboUtils {

	protected final static AadlASTFactory factory = new AadlASTFactory();

	/*
	 * val Add: String = "+"
	 * val Sub: String = "-"
	 * val Mul: String = "*"
	 * val Div: String = "/"
	 * val Rem: String = "%"
	 * val Eq: String = "=="
	 * val Eq3: String = "==="
	 * val Ne: String = "!="
	 * val Ne3: String = "=!="
	 * val Shl: String = "<<"
	 * val Shr: String = ">>"
	 * val Ushr: String = ">>>"
	 * val Lt: String = "<"
	 * val Le: String = "<="
	 * val Gt: String = ">"
	 * val Ge: String = ">="
	 * val And: String = "&"
	 * val Or: String = "|"
	 * val Xor: String = "|^"
	 * val Imply: String = "->:"
	 * val CondAnd: String = "&&"
	 * val CondOr: String = "||"
	 * val CondImply: String = "-->:"
	 * val Append: String = ":+"
	 * val Prepend: String = "+:"
	 * val AppendAll: String = "++"
	 * val RemoveAll: String = "--"
	 * val MapsTo: String = "~>"
	 */

	public static String toSlangBinaryOp(String op) {
		if (op.equalsIgnoreCase("=>") || op.equalsIgnoreCase("implies")) {
			return "->:";
		} //
		else if (op.equalsIgnoreCase("|")) {
			return "|";
		} //
		else if (op.equalsIgnoreCase("||")) {
			return "||";
		} //
		else if (op.equalsIgnoreCase("&")) {
			return "&";
		} //
		else if (op.equalsIgnoreCase("&&")) {
			return "&&";
		} //
		else if (op.equalsIgnoreCase("<")) {
			return "<";
		} //
		else if (op.equalsIgnoreCase("<=")) {
			return "<=";
		} //
		else if (op.equalsIgnoreCase(">")) {
			return ">";
		} //
		else if (op.equalsIgnoreCase(">=")) {
			return ">=";
		} //
		else if (op.equalsIgnoreCase("==")) {
			return "==";
		} //
		else if (op.equalsIgnoreCase("!=")) {
			return "!=";
		} //
		else if (op.equalsIgnoreCase("+")) {
			return "+";
		} //
		else if (op.equalsIgnoreCase("-")) {
			return "-";
		} //
		else if (op.equalsIgnoreCase("*")) {
			return "*";
		} //
		else if (op.equalsIgnoreCase("/")) {
			return "/";
		} //
		else if (op.equalsIgnoreCase("%")) {
			return "%";
		} //

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
			assert af.getOffset32() < bf.getOffset32() : af.getOffset32() + " vs " + bf.getOffset32();

			int length = (bf.getOffset32() - af.getOffset32()) + bf.length32();
			return SlangUtils.toSome(FlatPos$.MODULE$.apply(af.getUriOpt(), //
					af.getBeginLine32(), af.getBeginColumn32(), //
					bf.getEndLine32(), bf.getEndColumn32(), //
					af.getOffset32(), //
					length));
		}
	}

	public static String getSlangString(String s) {
		return s.substring(1, s.length() - 1);
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
}