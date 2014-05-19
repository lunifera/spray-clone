/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaReference#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaReference#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaReference#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaReference()
 * @model
 * @generated
 */
public interface MetaReference extends SprayElement
{
  /**
   * Returns the value of the '<em><b>Represented By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Represented By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Represented By</em>' containment reference.
   * @see #setRepresentedBy(ConnectionInSpray)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaReference_RepresentedBy()
   * @model containment="true"
   * @generated
   */
  ConnectionInSpray getRepresentedBy();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaReference#getRepresentedBy <em>Represented By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Represented By</em>' containment reference.
   * @see #getRepresentedBy()
   * @generated
   */
  void setRepresentedBy(ConnectionInSpray value);

  /**
   * Returns the value of the '<em><b>Meta Class</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.MetaClass#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Class</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Class</em>' container reference.
   * @see #setMetaClass(MetaClass)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaReference_MetaClass()
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getReferences
   * @model opposite="references" transient="false"
   * @generated
   */
  MetaClass getMetaClass();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaReference#getMetaClass <em>Meta Class</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Class</em>' container reference.
   * @see #getMetaClass()
   * @generated
   */
  void setMetaClass(MetaClass value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(EReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaReference_Target()
   * @model required="true"
   * @generated
   */
  EReference getTarget();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaReference#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(EReference value);

} // MetaReference
