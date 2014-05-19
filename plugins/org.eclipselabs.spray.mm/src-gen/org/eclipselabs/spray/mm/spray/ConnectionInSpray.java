/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection In Spray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getConnectionInSpray()
 * @model
 * @generated
 */
public interface ConnectionInSpray extends ShapeInSpray
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(EReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getConnectionInSpray_From()
   * @model
   * @generated
   */
  EReference getFrom();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(EReference value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(EReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getConnectionInSpray_To()
   * @model
   * @generated
   */
  EReference getTo();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(EReference value);

  /**
   * Returns the value of the '<em><b>Connection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection</em>' containment reference.
   * @see #setConnection(ConnectionReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getConnectionInSpray_Connection()
   * @model containment="true"
   * @generated
   */
  ConnectionReference getConnection();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getConnection <em>Connection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection</em>' containment reference.
   * @see #getConnection()
   * @generated
   */
  void setConnection(ConnectionReference value);

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
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getConnectionInSpray_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ShapePropertyAssignment> getProperties();

} // ConnectionInSpray
