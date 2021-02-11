package org.sireum.aadl.osate.acl.naming;

import org.eclipse.xtext.naming.IQualifiedNameConverter;

@SuppressWarnings("all")
public class ACLQualifiedNameConverter extends IQualifiedNameConverter.DefaultImpl {
  @Override
  public String getDelimiter() {
    return "::";
  }
}
