/**
 */
package org.eclipselabs.spray.mm.spray;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape In Spray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.ShapeInSpray#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeInSpray()
 * @model abstract="true"
 * @generated
 */
public interface ShapeInSpray extends SprayElement, AliasableElement
{
  /**
   * Returns the value of the '<em><b>Represents</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.MetaClass#getRepresentedBy <em>Represented By</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Represents</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Represents</em>' container reference.
   * @see #setRepresents(MetaClass)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getShapeInSpray_Represents()
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getRepresentedBy
   * @model opposite="representedBy" transient="false"
   * @generated
   */
  MetaClass getRepresents();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.ShapeInSpray#getRepresents <em>Represents</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Represents</em>' container reference.
   * @see #getRepresents()
   * @generated
   */
  void setRepresents(MetaClass value);

} // ShapeInSpray
