package org.sireum.aadl.gumbo.tests.scoping

import com.itemis.xtext.testing.XtextTest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.osate.testsupport.TestHelper
import org.osate.aadl2.AadlPackage
import org.junit.Test
import org.osate.aadl2.DefaultAnnexSubclause
import org.sireum.aadl.gumbo.gumbo.GumboSubclause

import static extension org.junit.Assert.assertEquals
import org.osate.aadl2.EventDataPort
import static org.junit.Assert.assertTrue
import org.osate.aadl2.DirectionType
import org.osate.testsupport.AssertHelper
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.emf.common.util.URI
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement

@RunWith(XtextRunner)
@InjectWith(GumboInjectorProvider)
class GumboPackageTest extends XtextTest {

	@Inject
	TestHelper<AadlPackage> testHelper

	@Inject extension ValidationTestHelper

	extension AssertHelper assertHelper = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(
		URI.createFileURI("dummy.gumbo")).get(AssertHelper)

	@Test
	def void testInitialize() {
		val aadlText = '''
			package SimplePackage
			public
				system A
					features
						port1: in event data port;
						port2: in event data port;
						port3: out event data port;
					annex gumbo {**
						initialize
						  guarantee A1_b_0 "can just be a portRef" : port3 > 1;
						  
						  guarantee A2_no_desc : port3 > 5;
						  
						  guarantee A3 "multi
						                line?" : port3 > 0;
						                
						  guarantee A4 : { port3 > 0 };
					**};
				end systemA;
				
			end SimplePackage;
		'''

		val pkg = testHelper.parseString(aadlText)
		pkg.assertNoErrors

		assertAllCrossReferencesResolvable(pkg)

//		pkg => [
//			"SimplePackage".assertEquals(name)
//
//			(((publicSection.ownedClassifiers.head.ownedAnnexSubclauses.head as DefaultAnnexSubclause).
//				parsedAnnexSubclause as GumboSubclause).specs.initialize.specs.head as GuaranteeStatement) => [
//
//				val exp = expr // can't switch directly on expr's type
//				switch exp {
//					PortRef: {
//						// FIXME: This might not be a port.
//						val feature = exp.port
//						switch feature {
//							EventDataPort: {
//								val name = "SimplePackage::A.port3"
//								assertEquals(name, feature.getQualifiedName)
//								assertEquals(DirectionType.OUT, feature.direction)
//							}
//							default:
//								assertTrue("Unexpected feature: " + feature, false)
//						}
//					}
//					default:
//						assertTrue("Unexpected expression: " + expr, false)
//				}
//			]
//		]
	}
}
