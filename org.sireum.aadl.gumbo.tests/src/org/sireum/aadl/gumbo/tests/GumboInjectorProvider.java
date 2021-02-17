package org.sireum.aadl.gumbo.tests;

import org.osate.testsupport.Aadl2InjectorProvider;
import org.sireum.aadl.gumbo.GumboStandaloneSetup;
import com.google.inject.Injector;

public class GumboInjectorProvider extends Aadl2InjectorProvider {
	@Override
	protected Injector internalCreateInjector() {
		GumboStandaloneSetup.doSetup();
		// new Aadl2InjectorProvider().getInjector();
		return super.internalCreateInjector();
	}
}
