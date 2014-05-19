/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.BehaviorGroup#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getBehaviorGroup()
 * @model
 * @generated
 */
public interface BehaviorGroup extends SprayElement, NamedElement
{
  /**
   * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.Behavior}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviors</em>' containment reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getBehaviorGroup_Behaviors()
   * @model containment="true"
   * @generated
   */
  EList<Behavior> getBehaviors();

} // BehaviorGroup
