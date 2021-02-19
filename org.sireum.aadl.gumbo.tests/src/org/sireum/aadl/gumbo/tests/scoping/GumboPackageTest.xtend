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
import org.sireum.aadl.gumbo.gumbo.Flows
import org.osate.aadl2.EventDataPort
import static org.junit.Assert.assertTrue
import org.osate.aadl2.DirectionType
import org.osate.testsupport.AssertHelper
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.emf.common.util.URI
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider

@RunWith(XtextRunner)
@InjectWith(GumboInjectorProvider)
class GumboPackageTest extends XtextTest {

	@Inject
	TestHelper<AadlPackage> testHelper

	extension AssertHelper assertHelper = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(
		URI.createFileURI("dummy.gumbo")).get(AssertHelper)

	@Test
	def void testFlows() {
		val aadlText = '''
			package SimplePackage
			public
				system A
					features
						port1: in event data port;
						port2: in event data port;
						port3: out event data port;
					annex gumbo {**
						flows
							flow1: port1, port2 -fun-> port3
					**};
				end systemA;
				
			end SimplePackage;
		'''

		val pkg = testHelper.parseString(aadlText)

		pkg => [
			"SimplePackage".assertEquals(name)

			(((publicSection.ownedClassifiers.head.ownedAnnexSubclauses.head as DefaultAnnexSubclause).
				parsedAnnexSubclause as GumboSubclause).specs.head as Flows).flows.head => [

				flowId.assertEquals("flow1")

				for (i : 0 ..< srcPorts.size) {
					val src = srcPorts.get(i).feature
					switch src {
						EventDataPort: {
							val name = '''SimplePackage::A.port«i+1»'''
							assertTrue(src.getQualifiedName == name && src.direction == DirectionType.IN)

						// assertScope(GumboPackage.eINSTANCE.featureElement_Feature, #["port" + (i + 1)])
						}
						default:
							assertTrue("Unexpected feature: " + src, false)
					}
				}

				val dst = dstPorts.head.feature

				switch dst {
					EventDataPort: {
						assertTrue(dst.getQualifiedName == "SimplePackage::A.port3")
						assertTrue(dst.direction == DirectionType.OUT)
					}
					default:
						assertTrue(false)
				}
			]
		]
	}
}
