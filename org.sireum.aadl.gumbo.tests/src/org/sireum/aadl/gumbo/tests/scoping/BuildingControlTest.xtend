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

@RunWith(XtextRunner)
@InjectWith(GumboInjectorProvider)
class BuildingControlTest extends XtextTest {
	val static PROJECT_LOCATION = "org.sireum.aadl.gumbo.tests/models/building_control/"
	
	@Inject
	TestHelper<AadlPackage> testHelper
	
	@Test
	def void testBC() {
		ignoreSerializationDifferences
		testHelper.testFile(PROJECT_LOCATION + "BuildingControl_BA.aadl").resource.contents.head as AadlPackage => [
			"BuildingControl_BA".assertEquals(name)
		]
	}
}