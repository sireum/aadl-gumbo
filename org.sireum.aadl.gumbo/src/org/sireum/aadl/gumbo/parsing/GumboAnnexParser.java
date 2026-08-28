package org.sireum.aadl.gumbo.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParseUtil;
import org.osate.annexsupport.AnnexParser;
import org.sireum.aadl.gumbo.parser.antlr.GumboParser;
import org.sireum.aadl.gumbo.services.GumboGrammarAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;

import antlr.RecognitionException;

public class GumboAnnexParser implements AnnexParser {

	@Inject
	private GumboParser gumboParser;

	public GumboAnnexParser() {
		URI dummyUri = URI.createFileURI("dummy.gumbo");

		// Check if the provider registry is missing for your new URI schema
		if (org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(dummyUri) == null) {
			// Force the generated Xtext standalone setup to register your new namespace URI
			org.sireum.aadl.gumbo.GumboStandaloneSetup.doSetup();
		}

		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(dummyUri)
				.get(Injector.class);
		injector.injectMembers(this);
	}

	protected GumboGrammarAccess getGrammarAccess() {
		return gumboParser.getGrammarAccess();
	}

	@Override
	public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) throws RecognitionException {
		AnnexLibrary gal = (AnnexLibrary) AnnexParseUtil.parse(gumboParser, source,
				getGrammarAccess().getAnnexLibraryRule(), filename, line, column, errReporter);
		return gal;
	}

	@Override
	public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) throws RecognitionException {
		AnnexSubclause eas = (AnnexSubclause) AnnexParseUtil.parse(gumboParser, source,
				getGrammarAccess().getGumboSubclauseRule(), filename, line, column, errReporter);
		return eas;
	}

	@Override
	public String getFileExtension() {
		return "gumbo";
	}

}
