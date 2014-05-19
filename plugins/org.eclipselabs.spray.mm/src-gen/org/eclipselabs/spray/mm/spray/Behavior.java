/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Behavior#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Behavior#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Behavior#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Behavior#getPaletteCompartment <em>Palette Compartment</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Behavior#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getBehavior_Name()
   * @model default="" unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.Behavior#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Meta Class</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.MetaClass#getBehaviors <em>Behaviors</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Class</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Class</em>' container reference.
   * @see #setMetaClass(MetaClass)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getBehavior_MetaClass()
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getBehaviors
   * @model opposite="behaviors" transient="false"
   * @generated
   */
  MetaClass getMetaClass();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.Behavior#getMetaClass <em>Meta Class</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Class</em>' container reference.
   * @see #getMetaClass()
   * @generated
   */
  void setMetaClass(MetaClass value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getBehavior_Label()
   * @model default="" unique="false"
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.Behavior#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Palette Compartment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Palette Compartment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Palette Compartment</em>' attribute.
   * @see #setPaletteCompartment(String)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getBehavior_PaletteCompartment()
   * @model unique="false"
   * @generated
   */
  String getPaletteCompartment();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.Behavior#getPaletteCompartment <em>Palette Compartment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Palette Compartment</em>' attribute.
   * @see #getPaletteCompartment()
   * @generated
   */
  void setPaletteCompartment(String value);

  /**
   * Returns the value of the '<em><b>Realized By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Realized By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realized By</em>' containment reference.
   * @see #setRealizedBy(JvmTypeReference)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getBehavior_RealizedBy()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getRealizedBy();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.Behavior#getRealizedBy <em>Realized By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realized By</em>' containment reference.
   * @see #getRealizedBy()
   * @generated
   */
  void setRealizedBy(JvmTypeReference value);

} // Behavior
