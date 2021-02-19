package org.sireum.aadl.gumbo.tests.scoping;

import com.google.inject.Inject;
import com.itemis.xtext.testing.XtextTest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osate.aadl2.AadlPackage;
import org.osate.testsupport.TestHelper;
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(GumboInjectorProvider.class)
@SuppressWarnings("all")
public class BuildingControlTest extends XtextTest {
  private static final String PROJECT_LOCATION = "org.sireum.aadl.gumbo.tests/models/building_control/";
  
  @Inject
  private TestHelper<AadlPackage> testHelper;
  
  @Test
  public void testBC() {
    try {
      this.ignoreSerializationDifferences();
      EObject _head = IterableExtensions.<EObject>head(this.testHelper.testFile((BuildingControlTest.PROJECT_LOCATION + "BuildingControl_BA.aadl")).getResource().getContents());
      final Procedure1<AadlPackage> _function = (AadlPackage it) -> {
        Assert.assertEquals("BuildingControl_BA", it.getName());
      };
      ObjectExtensions.<AadlPackage>operator_doubleArrow(
        ((AadlPackage) _head), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
