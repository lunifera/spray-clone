/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.mm.spray.SprayFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/org.eclipselabs.spray.mm/src-gen' forceOverwrite='true' modelName='Spray' updateClasspath='false' importerID='org.eclipse.emf.importer.ecore' complianceLevel='5.0' runtimeVersion='2.8' basePackage='org.eclipselabs.spray.mm'"
 * @generated
 */
public interface SprayPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spray";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://code.google.com/a/eclipselabs.org/p/spray";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spray";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SprayPackage eINSTANCE = org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.NamedElement <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.NamedElement
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.DiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.DiagramImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getDiagram()
   * @generated
   */
  int DIAGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__MODEL_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Behaviour Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__BEHAVIOUR_GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Meta Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__META_CLASSES = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__STYLE = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.SprayElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.SprayElementImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getSprayElement()
   * @generated
   */
  int SPRAY_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeInSprayImpl <em>Shape In Spray</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ShapeInSprayImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeInSpray()
   * @generated
   */
  int SHAPE_IN_SPRAY = 1;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_IN_SPRAY__ALIAS = SPRAY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Represents</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_IN_SPRAY__REPRESENTS = SPRAY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Shape In Spray</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_IN_SPRAY_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Shape In Spray</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_IN_SPRAY_OPERATION_COUNT = SPRAY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ConnectionInSprayImpl <em>Connection In Spray</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ConnectionInSprayImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getConnectionInSpray()
   * @generated
   */
  int CONNECTION_IN_SPRAY = 3;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_IN_SPRAY__ALIAS = SHAPE_IN_SPRAY__ALIAS;

  /**
   * The feature id for the '<em><b>Represents</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_IN_SPRAY__REPRESENTS = SHAPE_IN_SPRAY__REPRESENTS;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_IN_SPRAY__FROM = SHAPE_IN_SPRAY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_IN_SPRAY__TO = SHAPE_IN_SPRAY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Connection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_IN_SPRAY__CONNECTION = SHAPE_IN_SPRAY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_IN_SPRAY__PROPERTIES = SHAPE_IN_SPRAY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Connection In Spray</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_IN_SPRAY_FEATURE_COUNT = SHAPE_IN_SPRAY_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>Connection In Spray</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_IN_SPRAY_OPERATION_COUNT = SHAPE_IN_SPRAY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.AliasableElement <em>Aliasable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.AliasableElement
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getAliasableElement()
   * @generated
   */
  int ALIASABLE_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASABLE_ELEMENT__ALIAS = 0;

  /**
   * The number of structural features of the '<em>Aliasable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASABLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Aliasable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASABLE_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl <em>Meta Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.MetaClassImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getMetaClass()
   * @generated
   */
  int META_CLASS = 4;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__ALIAS = ALIASABLE_ELEMENT__ALIAS;

  /**
   * The feature id for the '<em><b>Represented By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__REPRESENTED_BY = ALIASABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Diagram</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__DIAGRAM = ALIASABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__REFERENCES = ALIASABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__ICON = ALIASABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__BEHAVIORS = ALIASABLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Behavior Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__BEHAVIOR_GROUPS = ALIASABLE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__TYPE = ALIASABLE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Has Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__HAS_STYLE = ALIASABLE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__STYLE = ALIASABLE_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Meta Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS_FEATURE_COUNT = ALIASABLE_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The number of operations of the '<em>Meta Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS_OPERATION_COUNT = ALIASABLE_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.MetaReferenceImpl <em>Meta Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.MetaReferenceImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getMetaReference()
   * @generated
   */
  int META_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Represented By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_REFERENCE__REPRESENTED_BY = SPRAY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Meta Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_REFERENCE__META_CLASS = SPRAY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_REFERENCE__TARGET = SPRAY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Meta Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_REFERENCE_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Meta Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_REFERENCE_OPERATION_COUNT = SPRAY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.BehaviorImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Meta Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__META_CLASS = 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__LABEL = 2;

  /**
   * The feature id for the '<em><b>Palette Compartment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__PALETTE_COMPARTMENT = 3;

  /**
   * The feature id for the '<em><b>Realized By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__REALIZED_BY = 4;

  /**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.CreateBehaviorImpl <em>Create Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.CreateBehaviorImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getCreateBehavior()
   * @generated
   */
  int CREATE_BEHAVIOR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR__NAME = BEHAVIOR__NAME;

  /**
   * The feature id for the '<em><b>Meta Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR__META_CLASS = BEHAVIOR__META_CLASS;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR__LABEL = BEHAVIOR__LABEL;

  /**
   * The feature id for the '<em><b>Palette Compartment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR__PALETTE_COMPARTMENT = BEHAVIOR__PALETTE_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Realized By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR__REALIZED_BY = BEHAVIOR__REALIZED_BY;

  /**
   * The feature id for the '<em><b>Containment Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR__CONTAINMENT_REFERENCE = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ask For</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR__ASK_FOR = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Create Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.CustomBehaviorImpl <em>Custom Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.CustomBehaviorImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getCustomBehavior()
   * @generated
   */
  int CUSTOM_BEHAVIOR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_BEHAVIOR__NAME = BEHAVIOR__NAME;

  /**
   * The feature id for the '<em><b>Meta Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_BEHAVIOR__META_CLASS = BEHAVIOR__META_CLASS;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_BEHAVIOR__LABEL = BEHAVIOR__LABEL;

  /**
   * The feature id for the '<em><b>Palette Compartment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_BEHAVIOR__PALETTE_COMPARTMENT = BEHAVIOR__PALETTE_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Realized By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_BEHAVIOR__REALIZED_BY = BEHAVIOR__REALIZED_BY;

  /**
   * The number of structural features of the '<em>Custom Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Custom Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.BehaviorGroupImpl <em>Behavior Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.BehaviorGroupImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getBehaviorGroup()
   * @generated
   */
  int BEHAVIOR_GROUP = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_GROUP__NAME = SPRAY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_GROUP__BEHAVIORS = SPRAY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Behavior Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_GROUP_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Behavior Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_GROUP_OPERATION_COUNT = SPRAY_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ImportImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 10;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeFromDslImpl <em>Shape From Dsl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ShapeFromDslImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeFromDsl()
   * @generated
   */
  int SHAPE_FROM_DSL = 13;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FROM_DSL__ALIAS = SHAPE_IN_SPRAY__ALIAS;

  /**
   * The feature id for the '<em><b>Represents</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FROM_DSL__REPRESENTS = SHAPE_IN_SPRAY__REPRESENTS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FROM_DSL__PROPERTIES = SHAPE_IN_SPRAY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FROM_DSL__REFERENCES = SHAPE_IN_SPRAY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FROM_DSL__SHAPE = SHAPE_IN_SPRAY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Shape From Dsl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FROM_DSL_FEATURE_COUNT = SHAPE_IN_SPRAY_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Shape From Dsl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FROM_DSL_OPERATION_COUNT = SHAPE_IN_SPRAY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapePropertyAssignmentImpl <em>Shape Property Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ShapePropertyAssignmentImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapePropertyAssignment()
   * @generated
   */
  int SHAPE_PROPERTY_ASSIGNMENT = 14;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_PROPERTY_ASSIGNMENT__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_PROPERTY_ASSIGNMENT__VALUE = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_PROPERTY_ASSIGNMENT__ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>Shape Property Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_PROPERTY_ASSIGNMENT_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Shape Property Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_PROPERTY_ASSIGNMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.SprayStyleRefImpl <em>Style Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.SprayStyleRefImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getSprayStyleRef()
   * @generated
   */
  int SPRAY_STYLE_REF = 15;

  /**
   * The feature id for the '<em><b>Java Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_STYLE_REF__JAVA_STYLE = 0;

  /**
   * The feature id for the '<em><b>Dsl Style</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_STYLE_REF__DSL_STYLE = 1;

  /**
   * The number of structural features of the '<em>Style Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_STYLE_REF_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Style Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPRAY_STYLE_REF_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.CompartmentBehaviorImpl <em>Compartment Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.CompartmentBehaviorImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getCompartmentBehavior()
   * @generated
   */
  int COMPARTMENT_BEHAVIOR = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_BEHAVIOR__NAME = BEHAVIOR__NAME;

  /**
   * The feature id for the '<em><b>Meta Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_BEHAVIOR__META_CLASS = BEHAVIOR__META_CLASS;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_BEHAVIOR__LABEL = BEHAVIOR__LABEL;

  /**
   * The feature id for the '<em><b>Palette Compartment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_BEHAVIOR__PALETTE_COMPARTMENT = BEHAVIOR__PALETTE_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Realized By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_BEHAVIOR__REALIZED_BY = BEHAVIOR__REALIZED_BY;

  /**
   * The feature id for the '<em><b>Compartment Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_BEHAVIOR__COMPARTMENT_REFERENCE = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compartment Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Compartment Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeCompartmentAssignmentImpl <em>Shape Compartment Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ShapeCompartmentAssignmentImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeCompartmentAssignment()
   * @generated
   */
  int SHAPE_COMPARTMENT_ASSIGNMENT = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_COMPARTMENT_ASSIGNMENT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Shape</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE = 2;

  /**
   * The feature id for the '<em><b>Shape Dsl Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY = 3;

  /**
   * The number of structural features of the '<em>Shape Compartment Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_COMPARTMENT_ASSIGNMENT_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Shape Compartment Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_COMPARTMENT_ASSIGNMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeReferenceImpl <em>Shape Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ShapeReferenceImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeReference()
   * @generated
   */
  int SHAPE_REFERENCE = 18;

  /**
   * The feature id for the '<em><b>Dsl Shape</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_REFERENCE__DSL_SHAPE = 0;

  /**
   * The feature id for the '<em><b>Jvm Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_REFERENCE__JVM_SHAPE = 1;

  /**
   * The number of structural features of the '<em>Shape Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Shape Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_REFERENCE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ConnectionReferenceImpl <em>Connection Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ConnectionReferenceImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getConnectionReference()
   * @generated
   */
  int CONNECTION_REFERENCE = 19;

  /**
   * The feature id for the '<em><b>Jvm Connection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_REFERENCE__JVM_CONNECTION = 0;

  /**
   * The feature id for the '<em><b>Dsl Connection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_REFERENCE__DSL_CONNECTION = 1;

  /**
   * The number of structural features of the '<em>Connection Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Connection Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_REFERENCE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeDslKeyImpl <em>Shape Dsl Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.impl.ShapeDslKeyImpl
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeDslKey()
   * @generated
   */
  int SHAPE_DSL_KEY = 20;

  /**
   * The feature id for the '<em><b>Jvm Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DSL_KEY__JVM_KEY = 0;

  /**
   * The feature id for the '<em><b>Dsl Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DSL_KEY__DSL_KEY = 1;

  /**
   * The number of structural features of the '<em>Shape Dsl Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DSL_KEY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Shape Dsl Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_DSL_KEY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.spray.mm.spray.Figure <em>Figure</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.spray.mm.spray.Figure
   * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getFigure()
   * @generated
   */
  int FIGURE = 21;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see org.eclipselabs.spray.mm.spray.Diagram
   * @generated
   */
  EClass getDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.Diagram#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipselabs.spray.mm.spray.Diagram#getImports()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Imports();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.Diagram#getModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model Type</em>'.
   * @see org.eclipselabs.spray.mm.spray.Diagram#getModelType()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_ModelType();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.Diagram#getBehaviourGroups <em>Behaviour Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviour Groups</em>'.
   * @see org.eclipselabs.spray.mm.spray.Diagram#getBehaviourGroups()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_BehaviourGroups();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.Diagram#getMetaClasses <em>Meta Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Classes</em>'.
   * @see org.eclipselabs.spray.mm.spray.Diagram#getMetaClasses()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_MetaClasses();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.Diagram#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.eclipselabs.spray.mm.spray.Diagram#getStyle()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Style();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.ShapeInSpray <em>Shape In Spray</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape In Spray</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeInSpray
   * @generated
   */
  EClass getShapeInSpray();

  /**
   * Returns the meta object for the container reference '{@link org.eclipselabs.spray.mm.spray.ShapeInSpray#getRepresents <em>Represents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Represents</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeInSpray#getRepresents()
   * @see #getShapeInSpray()
   * @generated
   */
  EReference getShapeInSpray_Represents();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.SprayElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.eclipselabs.spray.mm.spray.SprayElement
   * @generated
   */
  EClass getSprayElement();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray <em>Connection In Spray</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection In Spray</em>'.
   * @see org.eclipselabs.spray.mm.spray.ConnectionInSpray
   * @generated
   */
  EClass getConnectionInSpray();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see org.eclipselabs.spray.mm.spray.ConnectionInSpray#getFrom()
   * @see #getConnectionInSpray()
   * @generated
   */
  EReference getConnectionInSpray_From();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.eclipselabs.spray.mm.spray.ConnectionInSpray#getTo()
   * @see #getConnectionInSpray()
   * @generated
   */
  EReference getConnectionInSpray_To();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getConnection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Connection</em>'.
   * @see org.eclipselabs.spray.mm.spray.ConnectionInSpray#getConnection()
   * @see #getConnectionInSpray()
   * @generated
   */
  EReference getConnectionInSpray_Connection();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipselabs.spray.mm.spray.ConnectionInSpray#getProperties()
   * @see #getConnectionInSpray()
   * @generated
   */
  EReference getConnectionInSpray_Properties();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.MetaClass <em>Meta Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Class</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass
   * @generated
   */
  EClass getMetaClass();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.MetaClass#getRepresentedBy <em>Represented By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Represented By</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getRepresentedBy()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_RepresentedBy();

  /**
   * Returns the meta object for the container reference '{@link org.eclipselabs.spray.mm.spray.MetaClass#getDiagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Diagram</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getDiagram()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_Diagram();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.MetaClass#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getReferences()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_References();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.mm.spray.MetaClass#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getIcon()
   * @see #getMetaClass()
   * @generated
   */
  EAttribute getMetaClass_Icon();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.MetaClass#getBehaviors <em>Behaviors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviors</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getBehaviors()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_Behaviors();

  /**
   * Returns the meta object for the reference list '{@link org.eclipselabs.spray.mm.spray.MetaClass#getBehaviorGroups <em>Behavior Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Behavior Groups</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getBehaviorGroups()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_BehaviorGroups();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.MetaClass#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getType()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_Type();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.MetaClass#getHasStyle <em>Has Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Has Style</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getHasStyle()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_HasStyle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.MetaClass#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaClass#getStyle()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_Style();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.MetaReference <em>Meta Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Reference</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaReference
   * @generated
   */
  EClass getMetaReference();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.MetaReference#getRepresentedBy <em>Represented By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Represented By</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaReference#getRepresentedBy()
   * @see #getMetaReference()
   * @generated
   */
  EReference getMetaReference_RepresentedBy();

  /**
   * Returns the meta object for the container reference '{@link org.eclipselabs.spray.mm.spray.MetaReference#getMetaClass <em>Meta Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Meta Class</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaReference#getMetaClass()
   * @see #getMetaReference()
   * @generated
   */
  EReference getMetaReference_MetaClass();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.MetaReference#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.eclipselabs.spray.mm.spray.MetaReference#getTarget()
   * @see #getMetaReference()
   * @generated
   */
  EReference getMetaReference_Target();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see org.eclipselabs.spray.mm.spray.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.mm.spray.Behavior#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.spray.mm.spray.Behavior#getName()
   * @see #getBehavior()
   * @generated
   */
  EAttribute getBehavior_Name();

  /**
   * Returns the meta object for the container reference '{@link org.eclipselabs.spray.mm.spray.Behavior#getMetaClass <em>Meta Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Meta Class</em>'.
   * @see org.eclipselabs.spray.mm.spray.Behavior#getMetaClass()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_MetaClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.mm.spray.Behavior#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.eclipselabs.spray.mm.spray.Behavior#getLabel()
   * @see #getBehavior()
   * @generated
   */
  EAttribute getBehavior_Label();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.mm.spray.Behavior#getPaletteCompartment <em>Palette Compartment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Palette Compartment</em>'.
   * @see org.eclipselabs.spray.mm.spray.Behavior#getPaletteCompartment()
   * @see #getBehavior()
   * @generated
   */
  EAttribute getBehavior_PaletteCompartment();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.Behavior#getRealizedBy <em>Realized By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Realized By</em>'.
   * @see org.eclipselabs.spray.mm.spray.Behavior#getRealizedBy()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_RealizedBy();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.CreateBehavior <em>Create Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Behavior</em>'.
   * @see org.eclipselabs.spray.mm.spray.CreateBehavior
   * @generated
   */
  EClass getCreateBehavior();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.CreateBehavior#getContainmentReference <em>Containment Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Containment Reference</em>'.
   * @see org.eclipselabs.spray.mm.spray.CreateBehavior#getContainmentReference()
   * @see #getCreateBehavior()
   * @generated
   */
  EReference getCreateBehavior_ContainmentReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.CreateBehavior#getAskFor <em>Ask For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ask For</em>'.
   * @see org.eclipselabs.spray.mm.spray.CreateBehavior#getAskFor()
   * @see #getCreateBehavior()
   * @generated
   */
  EReference getCreateBehavior_AskFor();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.CustomBehavior <em>Custom Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Behavior</em>'.
   * @see org.eclipselabs.spray.mm.spray.CustomBehavior
   * @generated
   */
  EClass getCustomBehavior();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.BehaviorGroup <em>Behavior Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior Group</em>'.
   * @see org.eclipselabs.spray.mm.spray.BehaviorGroup
   * @generated
   */
  EClass getBehaviorGroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.BehaviorGroup#getBehaviors <em>Behaviors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviors</em>'.
   * @see org.eclipselabs.spray.mm.spray.BehaviorGroup#getBehaviors()
   * @see #getBehaviorGroup()
   * @generated
   */
  EReference getBehaviorGroup_Behaviors();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipselabs.spray.mm.spray.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.mm.spray.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipselabs.spray.mm.spray.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.eclipselabs.spray.mm.spray.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.mm.spray.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.spray.mm.spray.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.AliasableElement <em>Aliasable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aliasable Element</em>'.
   * @see org.eclipselabs.spray.mm.spray.AliasableElement
   * @generated
   */
  EClass getAliasableElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.mm.spray.AliasableElement#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.eclipselabs.spray.mm.spray.AliasableElement#getAlias()
   * @see #getAliasableElement()
   * @generated
   */
  EAttribute getAliasableElement_Alias();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl <em>Shape From Dsl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape From Dsl</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeFromDsl
   * @generated
   */
  EClass getShapeFromDsl();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeFromDsl#getProperties()
   * @see #getShapeFromDsl()
   * @generated
   */
  EReference getShapeFromDsl_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeFromDsl#getReferences()
   * @see #getShapeFromDsl()
   * @generated
   */
  EReference getShapeFromDsl_References();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeFromDsl#getShape()
   * @see #getShapeFromDsl()
   * @generated
   */
  EReference getShapeFromDsl_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.ShapePropertyAssignment <em>Shape Property Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Property Assignment</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapePropertyAssignment
   * @generated
   */
  EClass getShapePropertyAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.ShapePropertyAssignment#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapePropertyAssignment#getKey()
   * @see #getShapePropertyAssignment()
   * @generated
   */
  EReference getShapePropertyAssignment_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.ShapePropertyAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapePropertyAssignment#getValue()
   * @see #getShapePropertyAssignment()
   * @generated
   */
  EReference getShapePropertyAssignment_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.ShapePropertyAssignment#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapePropertyAssignment#getAttribute()
   * @see #getShapePropertyAssignment()
   * @generated
   */
  EReference getShapePropertyAssignment_Attribute();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.SprayStyleRef <em>Style Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Ref</em>'.
   * @see org.eclipselabs.spray.mm.spray.SprayStyleRef
   * @generated
   */
  EClass getSprayStyleRef();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.SprayStyleRef#getJavaStyle <em>Java Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Java Style</em>'.
   * @see org.eclipselabs.spray.mm.spray.SprayStyleRef#getJavaStyle()
   * @see #getSprayStyleRef()
   * @generated
   */
  EReference getSprayStyleRef_JavaStyle();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.SprayStyleRef#getDslStyle <em>Dsl Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Style</em>'.
   * @see org.eclipselabs.spray.mm.spray.SprayStyleRef#getDslStyle()
   * @see #getSprayStyleRef()
   * @generated
   */
  EReference getSprayStyleRef_DslStyle();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.CompartmentBehavior <em>Compartment Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Behavior</em>'.
   * @see org.eclipselabs.spray.mm.spray.CompartmentBehavior
   * @generated
   */
  EClass getCompartmentBehavior();

  /**
   * Returns the meta object for the reference list '{@link org.eclipselabs.spray.mm.spray.CompartmentBehavior#getCompartmentReference <em>Compartment Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Compartment Reference</em>'.
   * @see org.eclipselabs.spray.mm.spray.CompartmentBehavior#getCompartmentReference()
   * @see #getCompartmentBehavior()
   * @generated
   */
  EReference getCompartmentBehavior_CompartmentReference();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment <em>Shape Compartment Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Compartment Assignment</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment
   * @generated
   */
  EClass getShapeCompartmentAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getValue()
   * @see #getShapeCompartmentAssignment()
   * @generated
   */
  EReference getShapeCompartmentAssignment_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getReference()
   * @see #getShapeCompartmentAssignment()
   * @generated
   */
  EReference getShapeCompartmentAssignment_Reference();

  /**
   * Returns the meta object for the container reference '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Shape</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShape()
   * @see #getShapeCompartmentAssignment()
   * @generated
   */
  EReference getShapeCompartmentAssignment_Shape();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShapeDslKey <em>Shape Dsl Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape Dsl Key</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment#getShapeDslKey()
   * @see #getShapeCompartmentAssignment()
   * @generated
   */
  EReference getShapeCompartmentAssignment_ShapeDslKey();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.ShapeReference <em>Shape Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Reference</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeReference
   * @generated
   */
  EClass getShapeReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.ShapeReference#getDslShape <em>Dsl Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Shape</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeReference#getDslShape()
   * @see #getShapeReference()
   * @generated
   */
  EReference getShapeReference_DslShape();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.ShapeReference#getJvmShape <em>Jvm Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jvm Shape</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeReference#getJvmShape()
   * @see #getShapeReference()
   * @generated
   */
  EReference getShapeReference_JvmShape();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.ConnectionReference <em>Connection Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection Reference</em>'.
   * @see org.eclipselabs.spray.mm.spray.ConnectionReference
   * @generated
   */
  EClass getConnectionReference();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.mm.spray.ConnectionReference#getJvmConnection <em>Jvm Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jvm Connection</em>'.
   * @see org.eclipselabs.spray.mm.spray.ConnectionReference#getJvmConnection()
   * @see #getConnectionReference()
   * @generated
   */
  EReference getConnectionReference_JvmConnection();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.ConnectionReference#getDslConnection <em>Dsl Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Connection</em>'.
   * @see org.eclipselabs.spray.mm.spray.ConnectionReference#getDslConnection()
   * @see #getConnectionReference()
   * @generated
   */
  EReference getConnectionReference_DslConnection();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.spray.mm.spray.ShapeDslKey <em>Shape Dsl Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Dsl Key</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeDslKey
   * @generated
   */
  EClass getShapeDslKey();

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.spray.mm.spray.ShapeDslKey#getJvmKey <em>Jvm Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Jvm Key</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeDslKey#getJvmKey()
   * @see #getShapeDslKey()
   * @generated
   */
  EReference getShapeDslKey_JvmKey();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.spray.mm.spray.ShapeDslKey#getDslKey <em>Dsl Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dsl Key</em>'.
   * @see org.eclipselabs.spray.mm.spray.ShapeDslKey#getDslKey()
   * @see #getShapeDslKey()
   * @generated
   */
  EAttribute getShapeDslKey_DslKey();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.spray.mm.spray.Figure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Figure</em>'.
   * @see org.eclipselabs.spray.mm.spray.Figure
   * @generated
   */
  EEnum getFigure();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SprayFactory getSprayFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.DiagramImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getDiagram()
     * @generated
     */
    EClass DIAGRAM = eINSTANCE.getDiagram();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__IMPORTS = eINSTANCE.getDiagram_Imports();

    /**
     * The meta object literal for the '<em><b>Model Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__MODEL_TYPE = eINSTANCE.getDiagram_ModelType();

    /**
     * The meta object literal for the '<em><b>Behaviour Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__BEHAVIOUR_GROUPS = eINSTANCE.getDiagram_BehaviourGroups();

    /**
     * The meta object literal for the '<em><b>Meta Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__META_CLASSES = eINSTANCE.getDiagram_MetaClasses();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__STYLE = eINSTANCE.getDiagram_Style();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeInSprayImpl <em>Shape In Spray</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ShapeInSprayImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeInSpray()
     * @generated
     */
    EClass SHAPE_IN_SPRAY = eINSTANCE.getShapeInSpray();

    /**
     * The meta object literal for the '<em><b>Represents</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_IN_SPRAY__REPRESENTS = eINSTANCE.getShapeInSpray_Represents();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.SprayElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.SprayElementImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getSprayElement()
     * @generated
     */
    EClass SPRAY_ELEMENT = eINSTANCE.getSprayElement();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ConnectionInSprayImpl <em>Connection In Spray</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ConnectionInSprayImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getConnectionInSpray()
     * @generated
     */
    EClass CONNECTION_IN_SPRAY = eINSTANCE.getConnectionInSpray();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_IN_SPRAY__FROM = eINSTANCE.getConnectionInSpray_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_IN_SPRAY__TO = eINSTANCE.getConnectionInSpray_To();

    /**
     * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_IN_SPRAY__CONNECTION = eINSTANCE.getConnectionInSpray_Connection();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_IN_SPRAY__PROPERTIES = eINSTANCE.getConnectionInSpray_Properties();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl <em>Meta Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.MetaClassImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getMetaClass()
     * @generated
     */
    EClass META_CLASS = eINSTANCE.getMetaClass();

    /**
     * The meta object literal for the '<em><b>Represented By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__REPRESENTED_BY = eINSTANCE.getMetaClass_RepresentedBy();

    /**
     * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__DIAGRAM = eINSTANCE.getMetaClass_Diagram();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__REFERENCES = eINSTANCE.getMetaClass_References();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_CLASS__ICON = eINSTANCE.getMetaClass_Icon();

    /**
     * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__BEHAVIORS = eINSTANCE.getMetaClass_Behaviors();

    /**
     * The meta object literal for the '<em><b>Behavior Groups</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__BEHAVIOR_GROUPS = eINSTANCE.getMetaClass_BehaviorGroups();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__TYPE = eINSTANCE.getMetaClass_Type();

    /**
     * The meta object literal for the '<em><b>Has Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__HAS_STYLE = eINSTANCE.getMetaClass_HasStyle();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__STYLE = eINSTANCE.getMetaClass_Style();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.MetaReferenceImpl <em>Meta Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.MetaReferenceImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getMetaReference()
     * @generated
     */
    EClass META_REFERENCE = eINSTANCE.getMetaReference();

    /**
     * The meta object literal for the '<em><b>Represented By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_REFERENCE__REPRESENTED_BY = eINSTANCE.getMetaReference_RepresentedBy();

    /**
     * The meta object literal for the '<em><b>Meta Class</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_REFERENCE__META_CLASS = eINSTANCE.getMetaReference_MetaClass();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_REFERENCE__TARGET = eINSTANCE.getMetaReference_Target();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.BehaviorImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getBehavior()
     * @generated
     */
    EClass BEHAVIOR = eINSTANCE.getBehavior();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR__NAME = eINSTANCE.getBehavior_Name();

    /**
     * The meta object literal for the '<em><b>Meta Class</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__META_CLASS = eINSTANCE.getBehavior_MetaClass();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR__LABEL = eINSTANCE.getBehavior_Label();

    /**
     * The meta object literal for the '<em><b>Palette Compartment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR__PALETTE_COMPARTMENT = eINSTANCE.getBehavior_PaletteCompartment();

    /**
     * The meta object literal for the '<em><b>Realized By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__REALIZED_BY = eINSTANCE.getBehavior_RealizedBy();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.CreateBehaviorImpl <em>Create Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.CreateBehaviorImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getCreateBehavior()
     * @generated
     */
    EClass CREATE_BEHAVIOR = eINSTANCE.getCreateBehavior();

    /**
     * The meta object literal for the '<em><b>Containment Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_BEHAVIOR__CONTAINMENT_REFERENCE = eINSTANCE.getCreateBehavior_ContainmentReference();

    /**
     * The meta object literal for the '<em><b>Ask For</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_BEHAVIOR__ASK_FOR = eINSTANCE.getCreateBehavior_AskFor();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.CustomBehaviorImpl <em>Custom Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.CustomBehaviorImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getCustomBehavior()
     * @generated
     */
    EClass CUSTOM_BEHAVIOR = eINSTANCE.getCustomBehavior();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.BehaviorGroupImpl <em>Behavior Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.BehaviorGroupImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getBehaviorGroup()
     * @generated
     */
    EClass BEHAVIOR_GROUP = eINSTANCE.getBehaviorGroup();

    /**
     * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_GROUP__BEHAVIORS = eINSTANCE.getBehaviorGroup_Behaviors();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ImportImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.NamedElement <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.NamedElement
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.AliasableElement <em>Aliasable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.AliasableElement
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getAliasableElement()
     * @generated
     */
    EClass ALIASABLE_ELEMENT = eINSTANCE.getAliasableElement();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIASABLE_ELEMENT__ALIAS = eINSTANCE.getAliasableElement_Alias();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeFromDslImpl <em>Shape From Dsl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ShapeFromDslImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeFromDsl()
     * @generated
     */
    EClass SHAPE_FROM_DSL = eINSTANCE.getShapeFromDsl();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_FROM_DSL__PROPERTIES = eINSTANCE.getShapeFromDsl_Properties();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_FROM_DSL__REFERENCES = eINSTANCE.getShapeFromDsl_References();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_FROM_DSL__SHAPE = eINSTANCE.getShapeFromDsl_Shape();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapePropertyAssignmentImpl <em>Shape Property Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ShapePropertyAssignmentImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapePropertyAssignment()
     * @generated
     */
    EClass SHAPE_PROPERTY_ASSIGNMENT = eINSTANCE.getShapePropertyAssignment();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_PROPERTY_ASSIGNMENT__KEY = eINSTANCE.getShapePropertyAssignment_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_PROPERTY_ASSIGNMENT__VALUE = eINSTANCE.getShapePropertyAssignment_Value();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_PROPERTY_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getShapePropertyAssignment_Attribute();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.SprayStyleRefImpl <em>Style Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.SprayStyleRefImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getSprayStyleRef()
     * @generated
     */
    EClass SPRAY_STYLE_REF = eINSTANCE.getSprayStyleRef();

    /**
     * The meta object literal for the '<em><b>Java Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPRAY_STYLE_REF__JAVA_STYLE = eINSTANCE.getSprayStyleRef_JavaStyle();

    /**
     * The meta object literal for the '<em><b>Dsl Style</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPRAY_STYLE_REF__DSL_STYLE = eINSTANCE.getSprayStyleRef_DslStyle();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.CompartmentBehaviorImpl <em>Compartment Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.CompartmentBehaviorImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getCompartmentBehavior()
     * @generated
     */
    EClass COMPARTMENT_BEHAVIOR = eINSTANCE.getCompartmentBehavior();

    /**
     * The meta object literal for the '<em><b>Compartment Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_BEHAVIOR__COMPARTMENT_REFERENCE = eINSTANCE.getCompartmentBehavior_CompartmentReference();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeCompartmentAssignmentImpl <em>Shape Compartment Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ShapeCompartmentAssignmentImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeCompartmentAssignment()
     * @generated
     */
    EClass SHAPE_COMPARTMENT_ASSIGNMENT = eINSTANCE.getShapeCompartmentAssignment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_COMPARTMENT_ASSIGNMENT__VALUE = eINSTANCE.getShapeCompartmentAssignment_Value();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE = eINSTANCE.getShapeCompartmentAssignment_Reference();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE = eINSTANCE.getShapeCompartmentAssignment_Shape();

    /**
     * The meta object literal for the '<em><b>Shape Dsl Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY = eINSTANCE.getShapeCompartmentAssignment_ShapeDslKey();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeReferenceImpl <em>Shape Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ShapeReferenceImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeReference()
     * @generated
     */
    EClass SHAPE_REFERENCE = eINSTANCE.getShapeReference();

    /**
     * The meta object literal for the '<em><b>Dsl Shape</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_REFERENCE__DSL_SHAPE = eINSTANCE.getShapeReference_DslShape();

    /**
     * The meta object literal for the '<em><b>Jvm Shape</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_REFERENCE__JVM_SHAPE = eINSTANCE.getShapeReference_JvmShape();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ConnectionReferenceImpl <em>Connection Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ConnectionReferenceImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getConnectionReference()
     * @generated
     */
    EClass CONNECTION_REFERENCE = eINSTANCE.getConnectionReference();

    /**
     * The meta object literal for the '<em><b>Jvm Connection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_REFERENCE__JVM_CONNECTION = eINSTANCE.getConnectionReference_JvmConnection();

    /**
     * The meta object literal for the '<em><b>Dsl Connection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_REFERENCE__DSL_CONNECTION = eINSTANCE.getConnectionReference_DslConnection();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.impl.ShapeDslKeyImpl <em>Shape Dsl Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.impl.ShapeDslKeyImpl
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getShapeDslKey()
     * @generated
     */
    EClass SHAPE_DSL_KEY = eINSTANCE.getShapeDslKey();

    /**
     * The meta object literal for the '<em><b>Jvm Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE_DSL_KEY__JVM_KEY = eINSTANCE.getShapeDslKey_JvmKey();

    /**
     * The meta object literal for the '<em><b>Dsl Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHAPE_DSL_KEY__DSL_KEY = eINSTANCE.getShapeDslKey_DslKey();

    /**
     * The meta object literal for the '{@link org.eclipselabs.spray.mm.spray.Figure <em>Figure</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.mm.spray.Figure
     * @see org.eclipselabs.spray.mm.spray.impl.SprayPackageImpl#getFigure()
     * @generated
     */
    EEnum FIGURE = eINSTANCE.getFigure();

  }

} //SprayPackage
