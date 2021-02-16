package org.sireum.aadl.gumbo.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.NamedElement;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;

public class GumboQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	// Enable to limit indexing to global items
	// Duplicates checking only applies to global items
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		if (obj instanceof GumboSubclause) {
			/*
			 * It is important that we return null if obj is not in an
			 * AadlPackage or in a EMV2Root. This happens when serializing an
			 * aadl file with an error model annex. See EMV2AnnexUnparser. If
			 * this check is not here, then a ClassCastException occurs during
			 * serialization.
			 */
			NamedElement namedElement = (NamedElement) obj;
			NamedElement root = namedElement.getElementRoot();
			if (namedElement.getName() == null || !(root instanceof AadlPackage) || (obj instanceof GumboSubclause)) {
				return null;
			}
			return getConverter().toQualifiedName(getTheName(namedElement));
		}
		if (obj instanceof AadlPackage) {
			return getConverter().toQualifiedName(((AadlPackage) obj).getName());
		}
		return null;
	}

	protected String getTheName(NamedElement namedElement) {
		NamedElement root = namedElement.getElementRoot();
		return "gumbo$" + root.getName() + "::" + namedElement.getName();
	}
}
