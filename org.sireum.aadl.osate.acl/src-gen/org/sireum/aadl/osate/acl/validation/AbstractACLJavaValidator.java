/*
 * generated by Xtext
 */
package org.sireum.aadl.osate.acl.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractACLJavaValidator extends org.osate.xtext.aadl2.properties.validation.PropertiesJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.sireum.aadl.osate.acl.aCL.ACLPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://aadl.info/AADL/2.0"));
		return result;
	}

}
