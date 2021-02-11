package org.sireum.aadl.osate.acl.serializer;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.sireum.aadl.osate.acl.aCL.AclSubclause;
import org.sireum.aadl.osate.acl.services.ACLGrammarAccess;

@SuppressWarnings("all")
public class ACLSerializer extends Serializer {
  @Inject
  private ACLGrammarAccess grammarAccess;
  
  @Override
  protected ISerializationContext getIContext(final EObject semanticObject) {
    ISerializationContext _switchResult = null;
    boolean _matched = false;
    if (semanticObject instanceof AclSubclause) {
      _matched=true;
      final Function1<ISerializationContext, Boolean> _function = (ISerializationContext it) -> {
        ParserRule _parserRule = it.getParserRule();
        ParserRule _aclSubclauseRule = this.grammarAccess.getAclSubclauseRule();
        return Boolean.valueOf(Objects.equal(_parserRule, _aclSubclauseRule));
      };
      _switchResult = IterableExtensions.<ISerializationContext>findFirst(this.contextFinder.findByContents(semanticObject, null), _function);
    }
    return _switchResult;
  }
}
