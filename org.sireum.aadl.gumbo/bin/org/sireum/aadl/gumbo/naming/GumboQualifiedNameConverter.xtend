package org.sireum.aadl.gumbo.naming

import org.eclipse.xtext.naming.IQualifiedNameConverter

class GumboQualifiedNameConverter extends IQualifiedNameConverter.DefaultImpl {
  override getDelimiter() {
    "::"
  }
  
}