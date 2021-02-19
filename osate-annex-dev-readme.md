# OSATE Annex Development Instructions

This guide is based on observations/examanations of the 
[EMV2](https://github.com/osate/osate2/tree/master/emv2) and 
[SecMF](https://github.com/sireum/aadl-security) projects.

## The Basics
1. Setup an OSATE Dev environment and then ``File >> New >> Project >> Xtext Project ``

1. Set fields ``Project name``, ``Language name``, ``Language Extensions`` as appropriate for your annex

1. ``Execution environment`` must be java 1.8

1. Click next.  Check ``Create Feature``, ``Create Update Site``

1. This will generate the mwe2 and xtext files 

1. Modify the xtext grammar to use OSATE artifacts similar to what's in [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/Gumbo.xtext](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/Gumbo.xtext)

1. Modify the mwe2 to resemble [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/GenerateGumbo.mwe2](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/GenerateGumbo.mwe2)

1. Add the missing ``Require-Bundle`` projects (as appropriate) to the manifest similar to [org.sireum.aadl.gumbo/META-INF/MANIFEST.MF](org.sireum.aadl.gumbo/META-INF/MANIFEST.MF)

1. Modify the launcher to use Oracle Java 8 [org.sireum.aadl.gumbo/.launch/Generate Gumbo (gumbo) Language Infrastructure.launch](org.sireum.aadl.gumbo/.launch/Generate%20Gumbo%20(gumbo)%20Language%20Infrastructure.launch)

1. Launch the launcher

1. After generation you'll need to add missing required bundles to the other projects (e.g. [ui](org.sireum.aadl.gumbo.ui/META-INF/MANIFEST.MF))

1. Add 'naming' and 'parsing' packages and add files similar to what's seen in

    [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/naming](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/naming)

    [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/parsing](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/parsing)

1. Add the parsing package artifacts as extensions as seen in [org.sireum.aadl.gumbo/plugin.xml](org.sireum.aadl.gumbo/plugin.xml)

## Language Development

1. Regenerate via the [launcher](org.sireum.aadl.gumbo/.launch/Generate%20Gumbo%20(gumbo)%20Language%20Infrastructure.launch) after making changes to the grammar

1. Rerun your regression tests.  E.g. right click [org.sireum.aadl.gumbo.tests/src/org/sireum/aadl/gumbo/tests/GumboPackageTest.xtend](org.sireum.aadl.gumbo.tests/src/org/sireum/aadl/gumbo/tests/GumboPackageTest.xtend) and choose ``Run as 'JUnit Plug-in Test'``
  
## Scoping / Symbol Resolution

Scopes need to be added for rules like the following:

```
FeatureElement returns FeatureElement:
	feature=[aadl2::NamedElement|ID];
 ```

The scopes are added via reflected calls to [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/scoping/GumboScopeProvider.xtend](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/scoping/GumboScopeProvider.xtend)

Assuming the above rule is processed while visiting an OSATE thread, the following will get the classifier for the thread, and add a scope for all its features.  These will then be used when OSATE needs to resolve the referenced symbol.

```
	def SimpleScope scope_FeatureElement_feature(FeatureElement context, EReference reference) {
		val classifier = context.getContainerOfType(Classifier)
						
		(classifier.getAllFeatures +
					if (classifier instanceof ComponentImplementation) {
						classifier.allInternalFeatures
					} else {
						emptyList
					}).scopeFor
	}
```

NOTE: OSATE will lazily resolve symbols.  So for example, navigating to the container holding a 'FeatureElement' using the debugger starting at the top level GumboSubclause might show the container pointing to a PropertyImpl.  However, the PropertyImpl will be
replaced with, for example, a DataPortImpl when the '.feature' field is accessed via a visitor/formatter/serializer/etc.

Adding something like the following can help determine what the method names are that will be called via reflection:

```
	override protected Predicate<Method> getPredicate(EObject context, EReference reference) {
		val method = super.getPredicate(context, reference)
		println(method)  
		return method
	}
```
