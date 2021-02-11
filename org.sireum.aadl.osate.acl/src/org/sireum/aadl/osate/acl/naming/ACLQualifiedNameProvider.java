package org.sireum.aadl.osate.acl.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.NamedElement;
import org.sireum.aadl.osate.acl.aCL.AclSubclause;

public class ACLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		if (obj instanceof AclSubclause) {

			NamedElement namedElement = (NamedElement) obj;
			NamedElement root = namedElement.getElementRoot();
			if (namedElement.getName() == null) {
				return null;
			}
			return getConverter().toQualifiedName(getTheName(namedElement));
		}
		if (obj instanceof AadlPackage) {
			return getConverter().toQualifiedName(((AadlPackage) obj).getName());
		}
		return null;
	}

	protected String getTheName(NamedElement nameElement) {
		NamedElement root = nameElement.getElementRoot();

		return "acl$" + root.getName() + "::" + nameElement.getName();
	}
}
