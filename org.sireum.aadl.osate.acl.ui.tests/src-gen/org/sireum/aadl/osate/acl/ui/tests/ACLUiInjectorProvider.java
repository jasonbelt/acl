/*
 * generated by Xtext 2.20.0
 */
package org.sireum.aadl.osate.acl.ui.tests;

import org.eclipse.xtext.testing.IInjectorProvider;
import org.sireum.aadl.osate.acl.ui.internal.ACLActivator;

import com.google.inject.Injector;

public class ACLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ACLActivator.getInstance().getInjector("org.sireum.aadl.osate.acl.ACL");
	}

}