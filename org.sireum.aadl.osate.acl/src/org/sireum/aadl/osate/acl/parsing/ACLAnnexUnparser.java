package org.sireum.aadl.osate.acl.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.annexsupport.AnnexUnparser;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class ACLAnnexUnparser implements AnnexUnparser {

	@Inject
	ISerializer serializer;

	public ACLAnnexUnparser() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.acl")).get(Injector.class);
		injector.injectMembers(this);
	}

	@Override
	public String unparseAnnexLibrary(AnnexLibrary library, String indent) {
		// TODO Auto-generated method stub
		return serializer.serialize(library);
	}

	@Override
	public String unparseAnnexSubclause(AnnexSubclause subclause, String indent) {
		// TODO Auto-generated method stub
		subclause.setName("unamed_subclause");
		return serializer.serialize(subclause);
	}

}
