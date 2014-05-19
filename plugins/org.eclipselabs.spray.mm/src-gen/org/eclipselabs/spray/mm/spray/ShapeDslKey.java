/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmEnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Dsl Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeDslKey#getJvmKey <em>Jvm Key</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeDslKey#getDslKey <em>Dsl Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeDslKey()
 * @model
 * @generated
 */
public interface ShapeDslKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Jvm Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jvm Key</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jvm Key</em>' reference.
   * @see #setJvmKey(JvmEnumerationLiteral)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeDslKey_JvmKey()
   * @model
   * @generated
   */
  JvmEnumerationLiteral getJvmKey();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeDslKey#getJvmKey <em>Jvm Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jvm Key</em>' reference.
   * @see #getJvmKey()
   * @generated
   */
  void setJvmKey(JvmEnumerationLiteral value);

  /**
   * Returns the value of the '<em><b>Dsl Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Key</em>' attribute.
   * @see #setDslKey(String)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeDslKey_DslKey()
   * @model unique="false"
   * @generated
   */
  String getDslKey();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeDslKey#getDslKey <em>Dsl Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Key</em>' attribute.
   * @see #getDslKey()
   * @generated
   */
  void setDslKey(String value);

} // ShapeDslKey
