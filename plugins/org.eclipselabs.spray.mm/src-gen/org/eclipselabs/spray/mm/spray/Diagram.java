/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Diagram#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Diagram#getModelType <em>Model Type</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Diagram#getBehaviourGroups <em>Behaviour Groups</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Diagram#getMetaClasses <em>Meta Classes</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.Diagram#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getDiagram_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Model Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Type</em>' reference.
   * @see #setModelType(EClass)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getDiagram_ModelType()
   * @model required="true"
   * @generated
   */
  EClass getModelType();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.Diagram#getModelType <em>Model Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Type</em>' reference.
   * @see #getModelType()
   * @generated
   */
  void setModelType(EClass value);

  /**
   * Returns the value of the '<em><b>Behaviour Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.BehaviorGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviour Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour Groups</em>' containment reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getDiagram_BehaviourGroups()
   * @model containment="true"
   * @generated
   */
  EList<BehaviorGroup> getBehaviourGroups();

  /**
   * Returns the value of the '<em><b>Meta Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.MetaClass}.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.MetaClass#getDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Classes</em>' containment reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getDiagram_MetaClasses()
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getDiagram
   * @model opposite="diagram" containment="true"
   * @generated
   */
  EList<MetaClass> getMetaClasses();

  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(SprayStyleRef)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getDiagram_Style()
   * @model containment="true"
   * @generated
   */
  SprayStyleRef getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.Diagram#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(SprayStyleRef value);

} // Diagram
