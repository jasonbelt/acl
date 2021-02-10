/**
 * generated by Xtext 2.20.0
 */
package org.sireum.aadl.osate.acl.aCL;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexSubclause;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acl Subclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.acl.aCL.AclSubclause#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getAclSubclause()
 * @model
 * @generated
 */
public interface AclSubclause extends EObject, AnnexSubclause
{
  /**
   * Returns the value of the '<em><b>Contract</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract</em>' containment reference.
   * @see #setContract(AclContract)
   * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getAclSubclause_Contract()
   * @model containment="true"
   * @generated
   */
  AclContract getContract();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.acl.aCL.AclSubclause#getContract <em>Contract</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contract</em>' containment reference.
   * @see #getContract()
   * @generated
   */
  void setContract(AclContract value);

} // AclSubclause
