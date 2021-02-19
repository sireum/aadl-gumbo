package org.sireum.aadl.gumbo.tests.formatter

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider

@RunWith(XtextRunner)
@InjectWith(GumboInjectorProvider)
class FormatterTest {
	
	@Inject extension FormatterTestHelper
	
	@Test
	def void testSimple() {
		assertFormatted[
			useSerializer = false
			allowUnformattedWhitespace = false
			expectation = '''
				package SimplePackage
				public
					system A
						features
							port1: in event data port;
							port2: in event data port;
							port3: out event data port;
						annex gumbo {**
							                                                                                                                                                                                                    flows   flow1   :    port1  ,   port2   -fun->   port3	
						**};
					end A;
				end SimplePackage;'''
			toBeFormatted = '   package   SimplePackage   public   system   A   ' +   
			    'features   port1   :  in  event  data  port  ;  ' +
			    'port2   :  in  event  data  port  ;  ' +
			    'port3   :  out  event  data  port  ;  ' +
			    'annex   gumbo   {**   flows   flow1   :    port1  ,   port2   -fun->   port3	**}  ;  ' +
				'end    A   ;   end   SimplePackage   ;   '
		]
	}
	
}