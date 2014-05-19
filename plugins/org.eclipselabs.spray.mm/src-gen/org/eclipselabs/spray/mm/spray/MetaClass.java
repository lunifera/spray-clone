/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipselabs.spray.styles.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getBehaviorGroups <em>Behavior Groups</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getHasStyle <em>Has Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.MetaClass#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass()
 * @model
 * @generated
 */
public interface MetaClass extends AliasableElement
{
  /**
   * Returns the value of the '<em><b>Represented By</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.ShapeInSpray#getRepresents <em>Represents</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Represented By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Represented By</em>' containment reference.
   * @see #setRepresentedBy(ShapeInSpray)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_RepresentedBy()
   * @see org.eclipselabs.spray.mm.spray.ShapeInSpray#getRepresents
   * @model opposite="represents" containment="true"
   * @generated
   */
  ShapeInSpray getRepresentedBy();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaClass#getRepresentedBy <em>Represented By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Represented By</em>' containment reference.
   * @see #getRepresentedBy()
   * @generated
   */
  void setRepresentedBy(ShapeInSpray value);

  /**
   * Returns the value of the '<em><b>Diagram</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.Diagram#getMetaClasses <em>Meta Classes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Diagram</em>' container reference.
   * @see #setDiagram(Diagram)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_Diagram()
   * @see org.eclipselabs.spray.mm.spray.Diagram#getMetaClasses
   * @model opposite="metaClasses" transient="false"
   * @generated
   */
  Diagram getDiagram();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaClass#getDiagram <em>Diagram</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Diagram</em>' container reference.
   * @see #getDiagram()
   * @generated
   */
  void setDiagram(Diagram value);

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.MetaReference}.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.MetaReference#getMetaClass <em>Meta Class</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_References()
   * @see org.eclipselabs.spray.mm.spray.MetaReference#getMetaClass
   * @model opposite="metaClass" containment="true"
   * @generated
   */
  EList<MetaReference> getReferences();

  /**
   * Returns the value of the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' attribute.
   * @see #setIcon(String)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_Icon()
   * @model unique="false"
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaClass#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

  /**
   * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.Behavior}.
   * It is bidirectional and its opposite is '{@link org.eclipselabs.spray.mm.spray.Behavior#getMetaClass <em>Meta Class</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviors</em>' containment reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_Behaviors()
   * @see org.eclipselabs.spray.mm.spray.Behavior#getMetaClass
   * @model opposite="metaClass" containment="true"
   * @generated
   */
  EList<Behavior> getBehaviors();

  /**
   * Returns the value of the '<em><b>Behavior Groups</b></em>' reference list.
   * The list contents are of type {@link org.eclipselabs.spray.mm.spray.BehaviorGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior Groups</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior Groups</em>' reference list.
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_BehaviorGroups()
   * @model
   * @generated
   */
  EList<BehaviorGroup> getBehaviorGroups();

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EClass)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_Type()
   * @model required="true"
   * @generated
   */
  EClass getType();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaClass#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EClass value);

  /**
   * Returns the value of the '<em><b>Has Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Style</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Style</em>' reference.
   * @see #setHasStyle(Style)
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_HasStyle()
   * @model
   * @generated
   */
  Style getHasStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaClass#getHasStyle <em>Has Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Style</em>' reference.
   * @see #getHasStyle()
   * @generated
   */
  void setHasStyle(Style value);

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
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#getMetaClass_Style()
   * @model containment="true"
   * @generated
   */
  SprayStyleRef getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.mm.spray.MetaClass#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(SprayStyleRef value);

} // MetaClass
