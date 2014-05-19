/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.spray.styles.StyleLayout;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shapestyle Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.ShapestyleLayout#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapestyleLayout()
 * @model
 * @generated
 */
public interface ShapestyleLayout extends EObject
{
  /**
   * Returns the value of the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' containment reference.
   * @see #setLayout(StyleLayout)
   * @see org.eclipselabs.spray.shapes.ShapesPackage#getShapestyleLayout_Layout()
   * @model containment="true"
   * @generated
   */
  StyleLayout getLayout();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.ShapestyleLayout#getLayout <em>Layout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' containment reference.
   * @see #getLayout()
   * @generated
   */
  void setLayout(StyleLayout value);

} // ShapestyleLayout
