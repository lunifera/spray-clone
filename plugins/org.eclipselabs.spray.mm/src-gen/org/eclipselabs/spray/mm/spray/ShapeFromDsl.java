/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape From Dsl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeFromDsl()
 * @model
 * @generated
 */
public interface ShapeFromDsl extends ShapeInSpray
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.ShapePropertyAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeFromDsl_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ShapePropertyAssignment> getProperties();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment}.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeFromDsl_References()
   * @see org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShape
   * @model opposite="shape" containment="true"
   * @generated
   */
  EList<ShapeCompartmentAssignment> getReferences();

  /**
   * Returns the value of the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' containment reference.
   * @see #setShape(ShapeReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeFromDsl_Shape()
   * @model containment="true"
   * @generated
   */
  ShapeReference getShape();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl#getShape <em>Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' containment reference.
   * @see #getShape()
   * @generated
   */
  void setShape(ShapeReference value);

} // ShapeFromDsl
