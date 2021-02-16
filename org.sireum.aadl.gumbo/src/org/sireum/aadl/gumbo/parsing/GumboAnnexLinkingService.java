package org.sireum.aadl.gumbo.parsing;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.annexsupport.AnnexLinkingService;
import org.sireum.aadl.gumbo.naming.GumboQualifiedNameProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class GumboAnnexLinkingService implements AnnexLinkingService {

	@Inject
	private DefaultLinkingService linkingService;

	@Inject
	private GumboQualifiedNameProvider nameProvider;

	public GumboAnnexLinkingService() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.gumbo")).get(Injector.class);
		injector.injectMembers(this);
	}

	@Override
	public List<EObject> resolveAnnexReference(String annexName, EObject context, EReference reference, INode node) {
		if (annexName.equalsIgnoreCase("GUMBO")) {
			return linkingService.getLinkedObjects(context, reference, node);
		} else {
			return Collections.<EObject> emptyList();
		}
	}

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		return nameProvider.getFullyQualifiedName(obj);
	}

}
