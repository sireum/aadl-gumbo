# OSATE Annex Development Instructions

## The Basics
1. In an OSATE Dev environment ``File >> New >> Project >> Xtext Project ``

1. Set fields ``Project name``, ``Language name``, ``Language Extensions``

1. ``Execution environment`` must be java 1.8

1. Click next.  Check ``Create Feature``, ``Create Update Site``

1. This will generate the mwe2 and xtext files 

1. Modify the xtext grammar to use OSATE artifcates similar to what's in [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/Gumbo.xtext](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/Gumbo.xtext)

1. Modify the mwe2 to resemble [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/GenerateGumbo.mwe2](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/GenerateGumbo.mwe2)

1. Add the missing ``Require-Bundle`` projects (as appropriate) to the manifest similar to [org.sireum.aadl.gumbo/META-INF/MANIFEST.MF](org.sireum.aadl.gumbo/META-INF/MANIFEST.MF)

1. Modify the launcher to use Oracle Java 8 [org.sireum.aadl.gumbo/.launch/Generate Gumbo (gumbo) Language Infrastructure.launch](org.sireum.aadl.gumbo/.launch/Generate%20Gumbo%20(gumbo)%20Language%20Infrastructure.launch)

1. Launch the launcher

1. After generation you'll need to add missing required bundles to the other projects (e.g. [ui](org.sireum.aadl.gumbo.ui/META-INF/MANIFEST.MF))

1. Add 'naming' and 'parsing' packages and add files similar to what's seen in

    [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/naming](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/naming)

    [org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/parsing](org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/parsing)

1. Add the parsing package artifacts as extensions as seen in [org.sireum.aadl.gumbo/plugin.xml](org.sireum.aadl.gumbo/plugin.xml)