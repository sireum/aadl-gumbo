# https://github.com/sireum/aadl-gumbo
1. Switch to the sysmlv2 branch

1. Rebase master onto the sysmlv2 branch and always select 'ours' (ie. master) when resolving conflict

1. In the Compute and Handler_Clause xtext rules, make sure (or modify if needed) that 'cases' is changed to 'compute_cases'

1. in GenerateGumbo.mwe2, make sure the parser.antlr.XtextAntlrGeneratorFragment2 options has ``ignoreCase=false`` (otherwise a tokens file will be generated).

1. Run the ``Generate Gumbo (gumbo) Language Infrastructure`` task (ignore any build errors as we just care about the generated ANTLR grammar)

1. Ensure org.sireum.aadl.gumbo/src-gen/org/sireum/aadl/gumbo/parser/antlr/internal/InternalGumbo.g exists (and it probably should have updates).  
	
1. Commit and push the relevant changes to the sysmlv2 branch

	```
	git add --force org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/Gumbo.xtext \\
	org.sireum.aadl.gumbo/src/org/sireum/aadl/gumbo/GenerateGumbo.mwe2  \\
	org.sireum.aadl.gumbo/src-gen/org/sireum/aadl/gumbo/parser/antlr/internal/InternalGumbo.g
	git commit -m "updated gumbo"
	git push --force
	```

1. In the root of the aadl-gumbo repo directory, run ``bin/rtag.sh``

# https://github.com/sireum/hamr-sysml-parser.git

1. In ``bin/regen.cmd``, set ``gumboVersion`` to be the generated tag name

1. Run ``bin/regen.cmd``

1. Commit the changes

1. Run ``bin/publish.cmd`` and copy/paste the version text to in kekinian's version.properties file.  Refresh the IVE workspace and try out the changes.  Once done, push the changes to ``hamr-sysml-parser`` and also to kekinian's versions.properties file.