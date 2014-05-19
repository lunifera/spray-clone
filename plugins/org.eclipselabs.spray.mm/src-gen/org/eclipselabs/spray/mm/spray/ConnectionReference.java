/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipselabs.spray.shapes.ConnectionDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ConnectionReference#getJvmConnection <em>Jvm Connection</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ConnectionReference#getDslConnection <em>Dsl Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getConnectionReference()
 * @model
 * @generated
 */
public interface ConnectionReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Jvm Connection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jvm Connection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jvm Connection</em>' containment reference.
   * @see #setJvmConnection(JvmTypeReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getConnectionReference_JvmConnection()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getJvmConnection();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ConnectionReference#getJvmConnection <em>Jvm Connection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jvm Connection</em>' containment reference.
   * @see #getJvmConnection()
   * @generated
   */
  void setJvmConnection(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Dsl Connection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Connection</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Connection</em>' reference.
   * @see #setDslConnection(ConnectionDefinition)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getConnectionReference_DslConnection()
   * @model
   * @generated
   */
  ConnectionDefinition getDslConnection();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ConnectionReference#getDslConnection <em>Dsl Connection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Connection</em>' reference.
   * @see #getDslConnection()
   * @generated
   */
  void setDslConnection(ConnectionDefinition value);

} // ConnectionReference
