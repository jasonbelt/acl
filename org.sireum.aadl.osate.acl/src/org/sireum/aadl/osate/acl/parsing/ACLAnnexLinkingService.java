package org.sireum.aadl.osate.acl.parsing;

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
import org.sireum.aadl.osate.acl.naming.ACLQualifiedNameProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class ACLAnnexLinkingService implements AnnexLinkingService {

	@Inject
	private DefaultLinkingService linkingService;

	@Inject
	private ACLQualifiedNameProvider nameProvider;

	public ACLAnnexLinkingService() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.acl")).get(Injector.class);
		injector.injectMembers(this);
	}

	@Override
	public List<EObject> resolveAnnexReference(String annexName, EObject context, EReference reference, INode node) {
		if (annexName.equalsIgnoreCase("ACL")) {
			return linkingService.getLinkedObjects(context,  reference, node);
		} else {
			return Collections.<EObject> emptyList();
		}
	}

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {

		QualifiedName t = nameProvider.getFullyQualifiedName(obj);
		return t;
	}

}
