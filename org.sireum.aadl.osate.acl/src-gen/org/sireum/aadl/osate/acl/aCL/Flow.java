/**
 * generated by Xtext 2.20.0
 */
package org.sireum.aadl.osate.acl.aCL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.acl.aCL.Flow#getFlowId <em>Flow Id</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.acl.aCL.Flow#getSrcPorts <em>Src Ports</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.acl.aCL.Flow#getDstPorts <em>Dst Ports</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EObject
{
  /**
   * Returns the value of the '<em><b>Flow Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow Id</em>' attribute.
   * @see #setFlowId(String)
   * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getFlow_FlowId()
   * @model
   * @generated
   */
  String getFlowId();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.acl.aCL.Flow#getFlowId <em>Flow Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flow Id</em>' attribute.
   * @see #getFlowId()
   * @generated
   */
  void setFlowId(String value);

  /**
   * Returns the value of the '<em><b>Src Ports</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.NamedElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src Ports</em>' reference list.
   * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getFlow_SrcPorts()
   * @model
   * @generated
   */
  EList<NamedElement> getSrcPorts();

  /**
   * Returns the value of the '<em><b>Dst Ports</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.NamedElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dst Ports</em>' reference list.
   * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getFlow_DstPorts()
   * @model
   * @generated
   */
  EList<NamedElement> getDstPorts();

} // Flow
