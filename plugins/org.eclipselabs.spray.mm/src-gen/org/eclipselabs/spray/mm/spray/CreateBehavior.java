/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.CreateBehavior#getContainmentReference <em>Containment Reference</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.CreateBehavior#getAskFor <em>Ask For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getCreateBehavior()
 * @model
 * @generated
 */
public interface CreateBehavior extends Behavior
{
  /**
   * Returns the value of the '<em><b>Containment Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Containment Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containment Reference</em>' reference.
   * @see #setContainmentReference(EReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getCreateBehavior_ContainmentReference()
   * @model
   * @generated
   */
  EReference getContainmentReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.CreateBehavior#getContainmentReference <em>Containment Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Containment Reference</em>' reference.
   * @see #getContainmentReference()
   * @generated
   */
  void setContainmentReference(EReference value);

  /**
   * Returns the value of the '<em><b>Ask For</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ask For</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ask For</em>' reference.
   * @see #setAskFor(EAttribute)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getCreateBehavior_AskFor()
   * @model
   * @generated
   */
  EAttribute getAskFor();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.CreateBehavior#getAskFor <em>Ask For</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ask For</em>' reference.
   * @see #getAskFor()
   * @generated
   */
  void setAskFor(EAttribute value);

} // CreateBehavior
