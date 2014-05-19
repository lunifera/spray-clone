/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Compartment Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShape <em>Shape</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShapeDslKey <em>Shape Dsl Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeCompartmentAssignment()
 * @model
 * @generated
 */
public interface ShapeCompartmentAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(XExpression)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeCompartmentAssignment_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(EReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeCompartmentAssignment_Reference()
   * @model
   * @generated
   */
  EReference getReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(EReference value);

  /**
   * Returns the value of the '<em><b>Shape</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' container reference.
   * @see #setShape(ShapeFromDsl)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeCompartmentAssignment_Shape()
   * @see org.eclipselabs.spray.mm.spray.ShapeFromDsl#getReferences
   * @model opposite="references" transient="false"
   * @generated
   */
  ShapeFromDsl getShape();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShape <em>Shape</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' container reference.
   * @see #getShape()
   * @generated
   */
  void setShape(ShapeFromDsl value);

  /**
   * Returns the value of the '<em><b>Shape Dsl Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape Dsl Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape Dsl Key</em>' containment reference.
   * @see #setShapeDslKey(ShapeDslKey)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeCompartmentAssignment_ShapeDslKey()
   * @model containment="true"
   * @generated
   */
  ShapeDslKey getShapeDslKey();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShapeDslKey <em>Shape Dsl Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape Dsl Key</em>' containment reference.
   * @see #getShapeDslKey()
   * @generated
   */
  void setShapeDslKey(ShapeDslKey value);

} // ShapeCompartmentAssignment
