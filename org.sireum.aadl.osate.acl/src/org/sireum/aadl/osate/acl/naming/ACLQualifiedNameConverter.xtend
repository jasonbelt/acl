package org.sireum.aadl.osate.acl.naming

import org.eclipse.xtext.naming.IQualifiedNameConverter.DefaultImpl

class ACLQualifiedNameConverter extends DefaultImpl {
	override getDelimiter() {
		"::"
	}
}