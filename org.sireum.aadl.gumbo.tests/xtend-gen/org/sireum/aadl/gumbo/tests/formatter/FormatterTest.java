package org.sireum.aadl.gumbo.tests.formatter;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(GumboInjectorProvider.class)
@SuppressWarnings("all")
public class FormatterTest {
  @Inject
  @Extension
  private FormatterTestHelper _formatterTestHelper;
  
  @Test
  public void testSimple() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      it.setUseSerializer(false);
      it.setAllowUnformattedWhitespace(false);
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
      _builder.append("flows   flow1   :    port1  ,   port2   -fun->   port3\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("**};");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("end A;");
      _builder.newLine();
      _builder.append("end SimplePackage;");
      it.setExpectation(_builder);
      it.setToBeFormatted(((((("   package   SimplePackage   public   system   A   " + 
        "features   port1   :  in  event  data  port  ;  ") + 
        "port2   :  in  event  data  port  ;  ") + 
        "port3   :  out  event  data  port  ;  ") + 
        "annex   gumbo   {**   flows   flow1   :    port1  ,   port2   -fun->   port3\t**}  ;  ") + 
        "end    A   ;   end   SimplePackage   ;   "));
    };
    this._formatterTestHelper.assertFormatted(_function);
  }
}
