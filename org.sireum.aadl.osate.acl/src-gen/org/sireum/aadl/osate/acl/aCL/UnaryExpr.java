/**
 * generated by Xtext 2.20.0
 */
package org.sireum.aadl.osate.acl.aCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.acl.aCL.UnaryExpr#getOp <em>Op</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.acl.aCL.UnaryExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getUnaryExpr()
 * @model
 * @generated
 */
public interface UnaryExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getUnaryExpr_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.acl.aCL.UnaryExpr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.sireum.aadl.osate.acl.aCL.ACLPackage#getUnaryExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.acl.aCL.UnaryExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // UnaryExpr