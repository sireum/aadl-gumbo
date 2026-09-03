package org.sireum.aadl.gumbo.tests.formatter;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
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

  @Inject
  private ParseHelper<EObject> parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  public String preProcess(final String s) {
    try {
      this._validationTestHelper.assertNoErrors(this.parseHelper.parse(s));
      return s;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testSimple() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      it.setUseSerializer(false);
      it.setAllowUnformattedWhitespace(true);
      it.setAllowSyntaxErrors(false);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package   SimplePackage public     system   A");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("features   port1   :  in  event  data  port  ;  port2   :  in  event  data  port  ;  ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("port3   :  out  event  data  port  ;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("annex   gumbo   {**  initialize guarantee \"title\" : 1; \t**}  ;  ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("end    A   ;   end   SimplePackage   ;   ");
      it.setToBeFormatted(this.preProcess(_builder.toString()));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package SimplePackage");
      _builder_1.newLine();
      _builder_1.append("public");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("system A");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("features");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("port1: in event data port;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("port2: in event data port;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("port3: out event data port;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("annex gumbo {**");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("initialize guarantee \"title\" : 1; \t");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("**};");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("end A;");
      _builder_1.newLine();
      _builder_1.append("end SimplePackage;");
      it.setExpectation(_builder_1);
    };
    this._formatterTestHelper.assertFormatted(_function);
  }
}
