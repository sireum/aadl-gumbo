package org.sireum.aadl.gumbo.tests.scoping;

import com.google.inject.Inject;
import com.itemis.xtext.testing.XtextTest;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ThreadType;
import org.osate.testsupport.TestHelper;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(GumboInjectorProvider.class)
@SuppressWarnings("all")
public class ScopingTest extends XtextTest {
  private static final String MODELS_LOCATION = "org.sireum.aadl.gumbo.tests/models/";

  @Inject
  private TestHelper<AadlPackage> testHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  public GumboSubclause getGumboSubclause(final Classifier c) {
    final List<GumboSubclause> subclauses = EcoreUtil2.<GumboSubclause>eAllOfType(c, GumboSubclause.class);
    Assert.assertEquals("Unexpected number of gumbo subclauses", 1, subclauses.size());
    return subclauses.get(0);
  }

  @Test
  public void testFooBar() {
    try {
      this.ignoreSerializationDifferences();
      final Resource resource = this.testHelper.testFile((ScopingTest.MODELS_LOCATION + "foo_bar/FooBar.aadl")).getResource();
      this._validationTestHelper.assertNoErrors(resource);
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      final Procedure1<AadlPackage> _function = (AadlPackage it) -> {
        final Function1<Classifier, Boolean> _function_1 = (Classifier t) -> {
          String _name = t.getName();
          return Boolean.valueOf(Objects.equals(_name, "C1"));
        };
        Classifier _findFirst = IterableExtensions.<Classifier>findFirst(it.getPublicSection().getOwnedClassifiers(), _function_1);
        final ThreadType c1 = ((ThreadType) _findFirst);
        final GumboSubclause clause = this.getGumboSubclause(c1);
        Assert.assertEquals(1, clause.getSpecs().getInitialize().getSpecs().size());
      };
      ObjectExtensions.<AadlPackage>operator_doubleArrow(
        ((AadlPackage) _head), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
