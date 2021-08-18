# OSATE Annex Development Instructions

This guide is based on observations/examinations of the 
[EMV2](https://github.com/osate/osate2/tree/master/emv2) and 
[SecMF](https://github.com/sireum/aadl-security) projects.

## General Steps for Creating a New Xtext Project for OSATE
1. Setup an OSATE Dev environment and then *__File >> New >> Project >> Xtext Project__*

1. Set fields ``Project name``, ``Language name``, ``Language Extensions`` as appropriate for your annex

1. Click next.  Check ``Create Feature``, ``Create Update Site``

1. This will generate the mwe2 and xtext files 

1. Modify the xtext grammar to use OSATE artifacts similar to what's in [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/Gumbo.xtext](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/Gumbo.xtext)

1. Modify the mwe2 to resemble [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/GenerateGumbo.mwe2](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/GenerateGumbo.mwe2)

1. Add the missing ``Require-Bundle`` projects (as appropriate) to the manifest similar to [org.sireum.aadl.gumbo/META-INF/MANIFEST.MF](org.sireum.aadl.gumbo/META-INF/MANIFEST.MF)

1. Launch the launcher.  E.g for GUMBO, click the down arrow next to the play/run button in the toolbar and select *__Generate Gumbo (gumbo) Language Infrastructure__*

1. After generation you'll need to add missing required bundles to the other projects (e.g. [ui](org.sireum.aadl.gumbo.ui/META-INF/MANIFEST.MF))

1. Add 'naming' and 'parsing' packages and add files similar to what's seen in

    [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/naming](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/naming)

    [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/parsing](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/parsing)

1. Add the parsing package artifacts as extensions as seen in [org.sireum.aadl.gumbo/plugin.xml](org.sireum.aadl.gumbo/plugin.xml)

## Language Development for GUMBO

1. If you've made changes to the grammar then regenerate via the 
   [launcher](org.sireum.aadl.gumbo/.launch/Generate%20Gumbo%20(gumbo)%20Language%20Infrastructure.launch)
   by clicking the down arrow next to the play/run button in the toolbar and select *__Generate Gumbo (gumbo) Language__* 

1. Rerun your regression tests after changes.  E.g. right click the project 
   [org.sireum.aadl.gumbo.tests](org.sireum.aadl.gumbo.tests) and choose ``Run as 'JUnit Plug-in Test'``
  
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
