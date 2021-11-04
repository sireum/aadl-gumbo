package org.sireum.aadl.gumbo.tests.scoping;

import com.google.inject.Inject;
import com.itemis.xtext.testing.XtextTest;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osate.aadl2.AadlPackage;
import org.osate.testsupport.AssertHelper;
import org.osate.testsupport.TestHelper;
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(GumboInjectorProvider.class)
@SuppressWarnings("all")
public class GumboPackageTest extends XtextTest {
  @Inject
  private TestHelper<AadlPackage> testHelper;
  
  @Extension
  private AssertHelper assertHelper = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(
    URI.createFileURI("dummy.gumbo")).<AssertHelper>get(AssertHelper.class);
  
  @Test
  public void testFlows() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package SimplePackage");
    _builder.newLine();
    _builder.append("public");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("system A");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("features");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("port1: in event data port;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("port2: in event data port;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("port3: out event data port;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("annex gumbo {**");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("flows");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("flow1: port1, port2 -fun-> port3");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("**};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("end systemA;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("end SimplePackage;");
    _builder.newLine();
    final String aadlText = _builder.toString();
  }
}
