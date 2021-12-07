package org.sireum.aadl.gumbo.tests.scoping

import com.google.inject.Inject
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider
import org.eclipse.xtext.testing.XtextRunner
import org.osate.testsupport.TestHelper
import org.osate.aadl2.AadlPackage
import org.junit.Test
import com.itemis.xtext.testing.XtextTest

import static extension org.junit.Assert.assertEquals
import static org.junit.Assert.assertTrue
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.osate.aadl2.ThreadType
import org.sireum.aadl.gumbo.gumbo.GumboSubclause
import org.osate.aadl2.Classifier
import org.eclipse.xtext.EcoreUtil2
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement
import org.sireum.aadl.gumbo.gumbo.BinaryExpr
import org.osate.aadl2.DataPort

@RunWith(XtextRunner)
@InjectWith(GumboInjectorProvider)
class ScopingTest extends XtextTest {
	val static MODELS_LOCATION = "org.sireum.aadl.gumbo.tests/models/"
	
	@Inject
	TestHelper<AadlPackage> testHelper
	
	@Inject extension ValidationTestHelper
	
	def GumboSubclause getGumboSubclause(Classifier c) {
		val subclauses = EcoreUtil2.eAllOfType(c, GumboSubclause)
		
		assertEquals("Unexpected number of gumbo subclauses", 1, subclauses.size)
		
		return subclauses.get(0)
	}
	
	@Test
	def void testFooBar() {
		
		ignoreSerializationDifferences
		
		val resource = testHelper.testFile(MODELS_LOCATION + "foo_bar/FooBar.aadl").resource
		
		resource.assertNoErrors
		
		resource.contents.head as AadlPackage => [
			val c1 = publicSection.ownedClassifiers.findFirst[t | t.name == "C1"] as ThreadType
			
			val clause = getGumboSubclause(c1)
			
			assertEquals(1, clause.specs.initialize.specs.size)
			
			// guarantee "guarantee title": port outC1 = 1;
			// FIXME: Make this work with a containment path.
//			val port = (((((clause.specs.initialize.specs.head as GuaranteeStatement).expr 
//				as BinaryExpr).left) as PortRef).port).feature
//			
//			switch port {
//				DataPort: assertEquals("outC1", port.name)
//				default: assertTrue("Unexpected feature: " + port, false)
//			}
		]
	}
}