package org.sireum.aadl.gumbo.naming;

import org.eclipse.xtext.naming.IQualifiedNameConverter;

@SuppressWarnings("all")
public class GumboQualifiedNameConverter extends IQualifiedNameConverter.DefaultImpl {
  @Override
  public String getDelimiter() {
    return "::";
  }
}
