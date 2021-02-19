package org.sireum.aadl.gumbo.tests.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.itemis.xtext.testing.XtextTest;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.DirectionType;
import org.osate.aadl2.EventDataPort;
import org.osate.aadl2.NamedElement;
import org.osate.testsupport.AssertHelper;
import org.osate.testsupport.TestHelper;
import org.sireum.aadl.gumbo.gumbo.FeatureElement;
import org.sireum.aadl.gumbo.gumbo.Flow;
import org.sireum.aadl.gumbo.gumbo.Flows;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.tests.GumboInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(GumboInjectorProvider.class)
@SuppressWarnings("all")
public class GumboPackageTest extends XtextTest {
  @Inject
  private TestHelper<AadlPackage> testHelper;
  
  @Extension
  private AssertHelper assertHelper = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(
    URI.createFileURI("dummy.gumbo")).<AssertHelper>get(AssertHelper.class);
  
  @Test
  public void testFlows() {
    try {
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
      _builder.append("flows");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("flow1: port1, port2 -fun-> port3");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("**};");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("end systemA;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("end SimplePackage;");
      _builder.newLine();
      final String aadlText = _builder.toString();
      final AadlPackage pkg = this.testHelper.parseString(aadlText);
      final Procedure1<AadlPackage> _function = (AadlPackage it) -> {
        Assert.assertEquals("SimplePackage", it.getName());
        AnnexSubclause _head = IterableExtensions.<AnnexSubclause>head(IterableExtensions.<Classifier>head(it.getPublicSection().getOwnedClassifiers()).getOwnedAnnexSubclauses());
        AnnexSubclause _parsedAnnexSubclause = ((DefaultAnnexSubclause) _head).getParsedAnnexSubclause();
        SpecSection _head_1 = IterableExtensions.<SpecSection>head(((GumboSubclause) _parsedAnnexSubclause).getSpecs());
        Flow _head_2 = IterableExtensions.<Flow>head(((Flows) _head_1).getFlows());
        final Procedure1<Flow> _function_1 = (Flow it_1) -> {
          Assert.assertEquals(it_1.getFlowId(), "flow1");
          int _size = it_1.getSrcPorts().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
          for (final Integer i : _doubleDotLessThan) {
            {
              final NamedElement src = it_1.getSrcPorts().get((i).intValue()).getFeature();
              boolean _matched = false;
              if (src instanceof EventDataPort) {
                _matched=true;
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("SimplePackage::A.port");
                _builder_1.append(((i).intValue() + 1));
                final String name = _builder_1.toString();
                Assert.assertTrue((Objects.equal(((EventDataPort)src).getQualifiedName(), name) && Objects.equal(((EventDataPort)src).getDirection(), DirectionType.IN)));
              }
              if (!_matched) {
                Assert.assertTrue(("Unexpected feature: " + src), false);
              }
            }
          }
          final NamedElement dst = IterableExtensions.<FeatureElement>head(it_1.getDstPorts()).getFeature();
          boolean _matched = false;
          if (dst instanceof EventDataPort) {
            _matched=true;
            String _qualifiedName = ((EventDataPort)dst).getQualifiedName();
            boolean _equals = Objects.equal(_qualifiedName, "SimplePackage::A.port3");
            Assert.assertTrue(_equals);
            DirectionType _direction = ((EventDataPort)dst).getDirection();
            boolean _equals_1 = Objects.equal(_direction, DirectionType.OUT);
            Assert.assertTrue(_equals_1);
          }
          if (!_matched) {
            Assert.assertTrue(false);
          }
        };
        ObjectExtensions.<Flow>operator_doubleArrow(_head_2, _function_1);
      };
      ObjectExtensions.<AadlPackage>operator_doubleArrow(pkg, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
