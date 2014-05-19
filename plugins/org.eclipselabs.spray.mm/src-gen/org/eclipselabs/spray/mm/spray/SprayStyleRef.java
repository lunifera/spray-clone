/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipselabs.spray.styles.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.SprayStyleRef#getJavaStyle <em>Java Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.SprayStyleRef#getDslStyle <em>Dsl Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getSprayStyleRef()
 * @model
 * @generated
 */
public interface SprayStyleRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Java Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Style</em>' containment reference.
   * @see #setJavaStyle(JvmTypeReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getSprayStyleRef_JavaStyle()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getJavaStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.SprayStyleRef#getJavaStyle <em>Java Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Style</em>' containment reference.
   * @see #getJavaStyle()
   * @generated
   */
  void setJavaStyle(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Dsl Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Style</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Style</em>' reference.
   * @see #setDslStyle(Style)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getSprayStyleRef_DslStyle()
   * @model
   * @generated
   */
  Style getDslStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.SprayStyleRef#getDslStyle <em>Dsl Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Style</em>' reference.
   * @see #getDslStyle()
   * @generated
   */
  void setDslStyle(Style value);

} // SprayStyleRef
