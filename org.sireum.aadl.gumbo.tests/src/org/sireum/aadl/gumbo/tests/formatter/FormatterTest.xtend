package org.sireum.aadl.gumbo.tests.formatter

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.testing.validation.ValidationTestHelper

@RunWith(XtextRunner)
@InjectWith(GumboInjectorProvider)
class FormatterTest {

	@Inject extension FormatterTestHelper

	@Inject ParseHelper<EObject> parseHelper;

	@Inject extension ValidationTestHelper

	def String preProcess(String s) {
		parseHelper.parse(s).assertNoErrors
		return s
	}

	@Test
	def void testSimple() {

		assertFormatted[
			useSerializer = false
			allowUnformattedWhitespace = true
			allowSyntaxErrors = false
			toBeFormatted = preProcess(
				'''package   SimplePackage public     system   A
					features   port1   :  in  event  data  port  ;  port2   :  in  event  data  port  ;  
					port3   :  out  event  data  port  ;
					annex   gumbo   {**  initialize guarantee "title" : 1; 	**}  ;  
					end    A   ;   end   SimplePackage   ;   ''')
			expectation = '''
			package SimplePackage
			public
				system A
					features
						port1: in event data port;
						port2: in event data port;
						port3: out event data port;
					annex gumbo {**
						initialize guarantee "title" : 1; 	
					**};
				end A;
			end SimplePackage;'''
		]
	}
}
