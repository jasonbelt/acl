/**
 * generated by Xtext 2.20.0
 */
package org.sireum.aadl.osate.acl.aCL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sireum.aadl.osate.acl.aCL.ACLPackage
 * @generated
 */
public interface ACLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ACLFactory eINSTANCE = org.sireum.aadl.osate.acl.aCL.impl.ACLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Acl Subclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acl Subclause</em>'.
   * @generated
   */
  AclSubclause createAclSubclause();

  /**
   * Returns a new object of class '<em>Contract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contract</em>'.
   * @generated
   */
  Contract createContract();

  /**
   * Returns a new object of class '<em>Spec Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spec Section</em>'.
   * @generated
   */
  SpecSection createSpecSection();

  /**
   * Returns a new object of class '<em>Computational Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Computational Model</em>'.
   * @generated
   */
  ComputationalModel createComputationalModel();

  /**
   * Returns a new object of class '<em>Flows</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flows</em>'.
   * @generated
   */
  Flows createFlows();

  /**
   * Returns a new object of class '<em>Contracts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contracts</em>'.
   * @generated
   */
  Contracts createContracts();

  /**
   * Returns a new object of class '<em>Acl Contract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acl Contract</em>'.
   * @generated
   */
  AclContract createAclContract();

  /**
   * Returns a new object of class '<em>Periodic Computational Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Periodic Computational Model</em>'.
   * @generated
   */
  PeriodicComputationalModel createPeriodicComputationalModel();

  /**
   * Returns a new object of class '<em>Hyperperiod Computational Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hyperperiod Computational Model</em>'.
   * @generated
   */
  HyperperiodComputationalModel createHyperperiodComputationalModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ACLPackage getACLPackage();

} //ACLFactory