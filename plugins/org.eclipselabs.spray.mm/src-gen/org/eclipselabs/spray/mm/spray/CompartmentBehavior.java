/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.CompartmentBehavior#getCompartmentReference <em>Compartment Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getCompartmentBehavior()
 * @model
 * @generated
 */
public interface CompartmentBehavior extends Behavior
{
  /**
   * Returns the value of the '<em><b>Compartment Reference</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compartment Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compartment Reference</em>' reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getCompartmentBehavior_CompartmentReference()
   * @model
   * @generated
   */
  EList<EReference> getCompartmentReference();

} // CompartmentBehavior
