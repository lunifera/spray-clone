/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipselabs.spray.mm.spray.AliasableElement;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.BehaviorGroup;
import org.eclipselabs.spray.mm.spray.CompartmentBehavior;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.Figure;
import org.eclipselabs.spray.mm.spray.Import;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.NamedElement;
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.mm.spray.SprayStyleRef;

import org.eclipselabs.spray.shapes.ShapesPackage;

import org.eclipselabs.spray.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SprayPackageImpl extends EPackageImpl implements SprayPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeInSprayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sprayElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectionInSprayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createBehaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customBehaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behaviorGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeFromDslEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapePropertyAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sprayStyleRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compartmentBehaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeCompartmentAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectionReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeDslKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum figureEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipselabs.spray.mm.spray.SprayPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SprayPackageImpl()
  {
    super(eNS_URI, SprayFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SprayPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SprayPackage init()
  {
    if (isInited) return (SprayPackage)EPackage.Registry.INSTANCE.getEPackage(SprayPackage.eNS_URI);

    // Obtain or create and register package
    SprayPackageImpl theSprayPackage = (SprayPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SprayPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SprayPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();
    ShapesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSprayPackage.createPackageContents();

    // Initialize created meta-data
    theSprayPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSprayPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SprayPackage.eNS_URI, theSprayPackage);
    return theSprayPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiagram()
  {
    return diagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_Imports()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_ModelType()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_BehaviourGroups()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_MetaClasses()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagram_Style()
  {
    return (EReference)diagramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeInSpray()
  {
    return shapeInSprayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeInSpray_Represents()
  {
    return (EReference)shapeInSprayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSprayElement()
  {
    return sprayElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectionInSpray()
  {
    return connectionInSprayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionInSpray_From()
  {
    return (EReference)connectionInSprayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionInSpray_To()
  {
    return (EReference)connectionInSprayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionInSpray_Connection()
  {
    return (EReference)connectionInSprayEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionInSpray_Properties()
  {
    return (EReference)connectionInSprayEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaClass()
  {
    return metaClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_RepresentedBy()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_Diagram()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_References()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaClass_Icon()
  {
    return (EAttribute)metaClassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_Behaviors()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_BehaviorGroups()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_Type()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_HasStyle()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_Style()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaReference()
  {
    return metaReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaReference_RepresentedBy()
  {
    return (EReference)metaReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaReference_MetaClass()
  {
    return (EReference)metaReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaReference_Target()
  {
    return (EReference)metaReferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehavior()
  {
    return behaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBehavior_Name()
  {
    return (EAttribute)behaviorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehavior_MetaClass()
  {
    return (EReference)behaviorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBehavior_Label()
  {
    return (EAttribute)behaviorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBehavior_PaletteCompartment()
  {
    return (EAttribute)behaviorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehavior_RealizedBy()
  {
    return (EReference)behaviorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateBehavior()
  {
    return createBehaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateBehavior_ContainmentReference()
  {
    return (EReference)createBehaviorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreateBehavior_AskFor()
  {
    return (EReference)createBehaviorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomBehavior()
  {
    return customBehaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehaviorGroup()
  {
    return behaviorGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviorGroup_Behaviors()
  {
    return (EReference)behaviorGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAliasableElement()
  {
    return aliasableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAliasableElement_Alias()
  {
    return (EAttribute)aliasableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeFromDsl()
  {
    return shapeFromDslEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeFromDsl_Properties()
  {
    return (EReference)shapeFromDslEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeFromDsl_References()
  {
    return (EReference)shapeFromDslEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeFromDsl_Shape()
  {
    return (EReference)shapeFromDslEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapePropertyAssignment()
  {
    return shapePropertyAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapePropertyAssignment_Key()
  {
    return (EReference)shapePropertyAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapePropertyAssignment_Value()
  {
    return (EReference)shapePropertyAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapePropertyAssignment_Attribute()
  {
    return (EReference)shapePropertyAssignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSprayStyleRef()
  {
    return sprayStyleRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSprayStyleRef_JavaStyle()
  {
    return (EReference)sprayStyleRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSprayStyleRef_DslStyle()
  {
    return (EReference)sprayStyleRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompartmentBehavior()
  {
    return compartmentBehaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentBehavior_CompartmentReference()
  {
    return (EReference)compartmentBehaviorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeCompartmentAssignment()
  {
    return shapeCompartmentAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeCompartmentAssignment_Value()
  {
    return (EReference)shapeCompartmentAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeCompartmentAssignment_Reference()
  {
    return (EReference)shapeCompartmentAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeCompartmentAssignment_Shape()
  {
    return (EReference)shapeCompartmentAssignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeCompartmentAssignment_ShapeDslKey()
  {
    return (EReference)shapeCompartmentAssignmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeReference()
  {
    return shapeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeReference_DslShape()
  {
    return (EReference)shapeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeReference_JvmShape()
  {
    return (EReference)shapeReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectionReference()
  {
    return connectionReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionReference_JvmConnection()
  {
    return (EReference)connectionReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectionReference_DslConnection()
  {
    return (EReference)connectionReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeDslKey()
  {
    return shapeDslKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeDslKey_JvmKey()
  {
    return (EReference)shapeDslKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShapeDslKey_DslKey()
  {
    return (EAttribute)shapeDslKeyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFigure()
  {
    return figureEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayFactory getSprayFactory()
  {
    return (SprayFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    diagramEClass = createEClass(DIAGRAM);
    createEReference(diagramEClass, DIAGRAM__IMPORTS);
    createEReference(diagramEClass, DIAGRAM__MODEL_TYPE);
    createEReference(diagramEClass, DIAGRAM__BEHAVIOUR_GROUPS);
    createEReference(diagramEClass, DIAGRAM__META_CLASSES);
    createEReference(diagramEClass, DIAGRAM__STYLE);

    shapeInSprayEClass = createEClass(SHAPE_IN_SPRAY);
    createEReference(shapeInSprayEClass, SHAPE_IN_SPRAY__REPRESENTS);

    sprayElementEClass = createEClass(SPRAY_ELEMENT);

    connectionInSprayEClass = createEClass(CONNECTION_IN_SPRAY);
    createEReference(connectionInSprayEClass, CONNECTION_IN_SPRAY__FROM);
    createEReference(connectionInSprayEClass, CONNECTION_IN_SPRAY__TO);
    createEReference(connectionInSprayEClass, CONNECTION_IN_SPRAY__CONNECTION);
    createEReference(connectionInSprayEClass, CONNECTION_IN_SPRAY__PROPERTIES);

    metaClassEClass = createEClass(META_CLASS);
    createEReference(metaClassEClass, META_CLASS__REPRESENTED_BY);
    createEReference(metaClassEClass, META_CLASS__DIAGRAM);
    createEReference(metaClassEClass, META_CLASS__REFERENCES);
    createEAttribute(metaClassEClass, META_CLASS__ICON);
    createEReference(metaClassEClass, META_CLASS__BEHAVIORS);
    createEReference(metaClassEClass, META_CLASS__BEHAVIOR_GROUPS);
    createEReference(metaClassEClass, META_CLASS__TYPE);
    createEReference(metaClassEClass, META_CLASS__HAS_STYLE);
    createEReference(metaClassEClass, META_CLASS__STYLE);

    metaReferenceEClass = createEClass(META_REFERENCE);
    createEReference(metaReferenceEClass, META_REFERENCE__REPRESENTED_BY);
    createEReference(metaReferenceEClass, META_REFERENCE__META_CLASS);
    createEReference(metaReferenceEClass, META_REFERENCE__TARGET);

    behaviorEClass = createEClass(BEHAVIOR);
    createEAttribute(behaviorEClass, BEHAVIOR__NAME);
    createEReference(behaviorEClass, BEHAVIOR__META_CLASS);
    createEAttribute(behaviorEClass, BEHAVIOR__LABEL);
    createEAttribute(behaviorEClass, BEHAVIOR__PALETTE_COMPARTMENT);
    createEReference(behaviorEClass, BEHAVIOR__REALIZED_BY);

    createBehaviorEClass = createEClass(CREATE_BEHAVIOR);
    createEReference(createBehaviorEClass, CREATE_BEHAVIOR__CONTAINMENT_REFERENCE);
    createEReference(createBehaviorEClass, CREATE_BEHAVIOR__ASK_FOR);

    customBehaviorEClass = createEClass(CUSTOM_BEHAVIOR);

    behaviorGroupEClass = createEClass(BEHAVIOR_GROUP);
    createEReference(behaviorGroupEClass, BEHAVIOR_GROUP__BEHAVIORS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    aliasableElementEClass = createEClass(ALIASABLE_ELEMENT);
    createEAttribute(aliasableElementEClass, ALIASABLE_ELEMENT__ALIAS);

    shapeFromDslEClass = createEClass(SHAPE_FROM_DSL);
    createEReference(shapeFromDslEClass, SHAPE_FROM_DSL__PROPERTIES);
    createEReference(shapeFromDslEClass, SHAPE_FROM_DSL__REFERENCES);
    createEReference(shapeFromDslEClass, SHAPE_FROM_DSL__SHAPE);

    shapePropertyAssignmentEClass = createEClass(SHAPE_PROPERTY_ASSIGNMENT);
    createEReference(shapePropertyAssignmentEClass, SHAPE_PROPERTY_ASSIGNMENT__KEY);
    createEReference(shapePropertyAssignmentEClass, SHAPE_PROPERTY_ASSIGNMENT__VALUE);
    createEReference(shapePropertyAssignmentEClass, SHAPE_PROPERTY_ASSIGNMENT__ATTRIBUTE);

    sprayStyleRefEClass = createEClass(SPRAY_STYLE_REF);
    createEReference(sprayStyleRefEClass, SPRAY_STYLE_REF__JAVA_STYLE);
    createEReference(sprayStyleRefEClass, SPRAY_STYLE_REF__DSL_STYLE);

    compartmentBehaviorEClass = createEClass(COMPARTMENT_BEHAVIOR);
    createEReference(compartmentBehaviorEClass, COMPARTMENT_BEHAVIOR__COMPARTMENT_REFERENCE);

    shapeCompartmentAssignmentEClass = createEClass(SHAPE_COMPARTMENT_ASSIGNMENT);
    createEReference(shapeCompartmentAssignmentEClass, SHAPE_COMPARTMENT_ASSIGNMENT__VALUE);
    createEReference(shapeCompartmentAssignmentEClass, SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE);
    createEReference(shapeCompartmentAssignmentEClass, SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE);
    createEReference(shapeCompartmentAssignmentEClass, SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY);

    shapeReferenceEClass = createEClass(SHAPE_REFERENCE);
    createEReference(shapeReferenceEClass, SHAPE_REFERENCE__DSL_SHAPE);
    createEReference(shapeReferenceEClass, SHAPE_REFERENCE__JVM_SHAPE);

    connectionReferenceEClass = createEClass(CONNECTION_REFERENCE);
    createEReference(connectionReferenceEClass, CONNECTION_REFERENCE__JVM_CONNECTION);
    createEReference(connectionReferenceEClass, CONNECTION_REFERENCE__DSL_CONNECTION);

    shapeDslKeyEClass = createEClass(SHAPE_DSL_KEY);
    createEReference(shapeDslKeyEClass, SHAPE_DSL_KEY__JVM_KEY);
    createEAttribute(shapeDslKeyEClass, SHAPE_DSL_KEY__DSL_KEY);

    // Create enums
    figureEEnum = createEEnum(FIGURE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    StylesPackage theStylesPackage = (StylesPackage)EPackage.Registry.INSTANCE.getEPackage(StylesPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
    ShapesPackage theShapesPackage = (ShapesPackage)EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    diagramEClass.getESuperTypes().add(this.getNamedElement());
    shapeInSprayEClass.getESuperTypes().add(this.getSprayElement());
    shapeInSprayEClass.getESuperTypes().add(this.getAliasableElement());
    connectionInSprayEClass.getESuperTypes().add(this.getShapeInSpray());
    metaClassEClass.getESuperTypes().add(this.getAliasableElement());
    metaReferenceEClass.getESuperTypes().add(this.getSprayElement());
    createBehaviorEClass.getESuperTypes().add(this.getBehavior());
    customBehaviorEClass.getESuperTypes().add(this.getBehavior());
    behaviorGroupEClass.getESuperTypes().add(this.getSprayElement());
    behaviorGroupEClass.getESuperTypes().add(this.getNamedElement());
    shapeFromDslEClass.getESuperTypes().add(this.getShapeInSpray());
    compartmentBehaviorEClass.getESuperTypes().add(this.getBehavior());

    // Initialize classes, features, and operations; add parameters
    initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiagram_Imports(), this.getImport(), null, "imports", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_ModelType(), theEcorePackage.getEClass(), null, "modelType", null, 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_BehaviourGroups(), this.getBehaviorGroup(), null, "behaviourGroups", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_MetaClasses(), this.getMetaClass(), this.getMetaClass_Diagram(), "metaClasses", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagram_Style(), this.getSprayStyleRef(), null, "style", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shapeInSprayEClass, ShapeInSpray.class, "ShapeInSpray", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShapeInSpray_Represents(), this.getMetaClass(), this.getMetaClass_RepresentedBy(), "represents", null, 0, 1, ShapeInSpray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sprayElementEClass, SprayElement.class, "SprayElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(connectionInSprayEClass, ConnectionInSpray.class, "ConnectionInSpray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnectionInSpray_From(), theEcorePackage.getEReference(), null, "from", null, 0, 1, ConnectionInSpray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectionInSpray_To(), theEcorePackage.getEReference(), null, "to", null, 0, 1, ConnectionInSpray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectionInSpray_Connection(), this.getConnectionReference(), null, "connection", null, 0, 1, ConnectionInSpray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectionInSpray_Properties(), this.getShapePropertyAssignment(), null, "properties", null, 0, -1, ConnectionInSpray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaClassEClass, MetaClass.class, "MetaClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaClass_RepresentedBy(), this.getShapeInSpray(), this.getShapeInSpray_Represents(), "representedBy", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_Diagram(), this.getDiagram(), this.getDiagram_MetaClasses(), "diagram", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_References(), this.getMetaReference(), this.getMetaReference_MetaClass(), "references", null, 0, -1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaClass_Icon(), theEcorePackage.getEString(), "icon", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_Behaviors(), this.getBehavior(), this.getBehavior_MetaClass(), "behaviors", null, 0, -1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_BehaviorGroups(), this.getBehaviorGroup(), null, "behaviorGroups", null, 0, -1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_Type(), theEcorePackage.getEClass(), null, "type", null, 1, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_HasStyle(), theStylesPackage.getStyle(), null, "hasStyle", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_Style(), this.getSprayStyleRef(), null, "style", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaReferenceEClass, MetaReference.class, "MetaReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaReference_RepresentedBy(), this.getConnectionInSpray(), null, "representedBy", null, 0, 1, MetaReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaReference_MetaClass(), this.getMetaClass(), this.getMetaClass_References(), "metaClass", null, 0, 1, MetaReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaReference_Target(), theEcorePackage.getEReference(), null, "target", null, 1, 1, MetaReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBehavior_Name(), theEcorePackage.getEString(), "name", "", 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehavior_MetaClass(), this.getMetaClass(), this.getMetaClass_Behaviors(), "metaClass", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBehavior_Label(), theEcorePackage.getEString(), "label", "", 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBehavior_PaletteCompartment(), theEcorePackage.getEString(), "paletteCompartment", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehavior_RealizedBy(), theTypesPackage.getJvmTypeReference(), null, "realizedBy", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createBehaviorEClass, CreateBehavior.class, "CreateBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateBehavior_ContainmentReference(), theEcorePackage.getEReference(), null, "containmentReference", null, 0, 1, CreateBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateBehavior_AskFor(), theEcorePackage.getEAttribute(), null, "askFor", null, 0, 1, CreateBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customBehaviorEClass, CustomBehavior.class, "CustomBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(behaviorGroupEClass, BehaviorGroup.class, "BehaviorGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBehaviorGroup_Behaviors(), this.getBehavior(), null, "behaviors", null, 0, -1, BehaviorGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aliasableElementEClass, AliasableElement.class, "AliasableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAliasableElement_Alias(), theEcorePackage.getEString(), "alias", null, 0, 1, AliasableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shapeFromDslEClass, ShapeFromDsl.class, "ShapeFromDsl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShapeFromDsl_Properties(), this.getShapePropertyAssignment(), null, "properties", null, 0, -1, ShapeFromDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShapeFromDsl_References(), this.getShapeCompartmentAssignment(), this.getShapeCompartmentAssignment_Shape(), "references", null, 0, -1, ShapeFromDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShapeFromDsl_Shape(), this.getShapeReference(), null, "shape", null, 0, 1, ShapeFromDsl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shapePropertyAssignmentEClass, ShapePropertyAssignment.class, "ShapePropertyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShapePropertyAssignment_Key(), this.getShapeDslKey(), null, "key", null, 0, 1, ShapePropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShapePropertyAssignment_Value(), theXbasePackage.getXExpression(), null, "value", null, 0, 1, ShapePropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShapePropertyAssignment_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 0, 1, ShapePropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sprayStyleRefEClass, SprayStyleRef.class, "SprayStyleRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSprayStyleRef_JavaStyle(), theTypesPackage.getJvmTypeReference(), null, "javaStyle", null, 0, 1, SprayStyleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSprayStyleRef_DslStyle(), theStylesPackage.getStyle(), null, "dslStyle", null, 0, 1, SprayStyleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compartmentBehaviorEClass, CompartmentBehavior.class, "CompartmentBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompartmentBehavior_CompartmentReference(), theEcorePackage.getEReference(), null, "compartmentReference", null, 0, -1, CompartmentBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shapeCompartmentAssignmentEClass, ShapeCompartmentAssignment.class, "ShapeCompartmentAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShapeCompartmentAssignment_Value(), theXbasePackage.getXExpression(), null, "value", null, 0, 1, ShapeCompartmentAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShapeCompartmentAssignment_Reference(), theEcorePackage.getEReference(), null, "reference", null, 0, 1, ShapeCompartmentAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShapeCompartmentAssignment_Shape(), this.getShapeFromDsl(), this.getShapeFromDsl_References(), "shape", null, 0, 1, ShapeCompartmentAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShapeCompartmentAssignment_ShapeDslKey(), this.getShapeDslKey(), null, "shapeDslKey", null, 0, 1, ShapeCompartmentAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shapeReferenceEClass, ShapeReference.class, "ShapeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShapeReference_DslShape(), theShapesPackage.getShapeDefinition(), null, "dslShape", null, 0, 1, ShapeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShapeReference_JvmShape(), theTypesPackage.getJvmTypeReference(), null, "jvmShape", null, 0, 1, ShapeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectionReferenceEClass, ConnectionReference.class, "ConnectionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnectionReference_JvmConnection(), theTypesPackage.getJvmTypeReference(), null, "jvmConnection", null, 0, 1, ConnectionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnectionReference_DslConnection(), theShapesPackage.getConnectionDefinition(), null, "dslConnection", null, 0, 1, ConnectionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shapeDslKeyEClass, ShapeDslKey.class, "ShapeDslKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShapeDslKey_JvmKey(), theTypesPackage.getJvmEnumerationLiteral(), null, "jvmKey", null, 0, 1, ShapeDslKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getShapeDslKey_DslKey(), theEcorePackage.getEString(), "dslKey", null, 0, 1, ShapeDslKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(figureEEnum, Figure.class, "Figure");

    // Create resource
    createResource(eNS_URI);
  }

} //SprayPackageImpl
