/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipselabs.spray.shapes.ShapeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeReference#getDslShape <em>Dsl Shape</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeReference#getJvmShape <em>Jvm Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeReference()
 * @model
 * @generated
 */
public interface ShapeReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl Shape</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Shape</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Shape</em>' reference.
   * @see #setDslShape(ShapeDefinition)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeReference_DslShape()
   * @model
   * @generated
   */
  ShapeDefinition getDslShape();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeReference#getDslShape <em>Dsl Shape</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Shape</em>' reference.
   * @see #getDslShape()
   * @generated
   */
  void setDslShape(ShapeDefinition value);

  /**
   * Returns the value of the '<em><b>Jvm Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jvm Shape</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jvm Shape</em>' containment reference.
   * @see #setJvmShape(JvmTypeReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeReference_JvmShape()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getJvmShape();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeReference#getJvmShape <em>Jvm Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jvm Shape</em>' containment reference.
   * @see #getJvmShape()
   * @generated
   */
  void setJvmShape(JvmTypeReference value);

} // ShapeReference
