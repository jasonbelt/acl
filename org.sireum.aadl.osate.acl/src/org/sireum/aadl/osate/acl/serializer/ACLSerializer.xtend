package org.sireum.aadl.osate.acl.serializer

import org.eclipse.xtext.serializer.impl.Serializer
import com.google.inject.Inject
import org.sireum.aadl.osate.acl.services.ACLGrammarAccess
import org.eclipse.emf.ecore.EObject
import org.sireum.aadl.osate.acl.aCL.AclSubclause

class ACLSerializer extends Serializer {
	@Inject ACLGrammarAccess grammarAccess
	
	override protected getIContext(EObject semanticObject) {
		switch semanticObject {
			AclSubclause: contextFinder.findByContents(semanticObject, null).findFirst[parserRule == grammarAccess.getAclSubclauseRule]
		}
	}
}