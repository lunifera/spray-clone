/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.spray.mm.spray.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SprayFactoryImpl extends EFactoryImpl implements SprayFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SprayFactory init()
  {
    try
    {
      SprayFactory theSprayFactory = (SprayFactory)EPackage.Registry.INSTANCE.getEFactory(SprayPackage.eNS_URI);
      if (theSprayFactory != null)
      {
        return theSprayFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SprayFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SprayPackage.DIAGRAM: return createDiagram();
      case SprayPackage.CONNECTION_IN_SPRAY: return createConnectionInSpray();
      case SprayPackage.META_CLASS: return createMetaClass();
      case SprayPackage.META_REFERENCE: return createMetaReference();
      case SprayPackage.CREATE_BEHAVIOR: return createCreateBehavior();
      case SprayPackage.CUSTOM_BEHAVIOR: return createCustomBehavior();
      case SprayPackage.BEHAVIOR_GROUP: return createBehaviorGroup();
      case SprayPackage.IMPORT: return createImport();
      case SprayPackage.SHAPE_FROM_DSL: return createShapeFromDsl();
      case SprayPackage.SHAPE_PROPERTY_ASSIGNMENT: return createShapePropertyAssignment();
      case SprayPackage.SPRAY_STYLE_REF: return createSprayStyleRef();
      case SprayPackage.COMPARTMENT_BEHAVIOR: return createCompartmentBehavior();
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT: return createShapeCompartmentAssignment();
      case SprayPackage.SHAPE_REFERENCE: return createShapeReference();
      case SprayPackage.CONNECTION_REFERENCE: return createConnectionReference();
      case SprayPackage.SHAPE_DSL_KEY: return createShapeDslKey();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SprayPackage.FIGURE:
        return createFigureFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SprayPackage.FIGURE:
        return convertFigureToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagram createDiagram()
  {
    DiagramImpl diagram = new DiagramImpl();
    return diagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionInSpray createConnectionInSpray()
  {
    ConnectionInSprayImpl connectionInSpray = new ConnectionInSprayImpl();
    return connectionInSpray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaClass createMetaClass()
  {
    MetaClassImpl metaClass = new MetaClassImpl();
    return metaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaReference createMetaReference()
  {
    MetaReferenceImpl metaReference = new MetaReferenceImpl();
    return metaReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateBehavior createCreateBehavior()
  {
    CreateBehaviorImpl createBehavior = new CreateBehaviorImpl();
    return createBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomBehavior createCustomBehavior()
  {
    CustomBehaviorImpl customBehavior = new CustomBehaviorImpl();
    return customBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorGroup createBehaviorGroup()
  {
    BehaviorGroupImpl behaviorGroup = new BehaviorGroupImpl();
    return behaviorGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeFromDsl createShapeFromDsl()
  {
    ShapeFromDslImpl shapeFromDsl = new ShapeFromDslImpl();
    return shapeFromDsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapePropertyAssignment createShapePropertyAssignment()
  {
    ShapePropertyAssignmentImpl shapePropertyAssignment = new ShapePropertyAssignmentImpl();
    return shapePropertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayStyleRef createSprayStyleRef()
  {
    SprayStyleRefImpl sprayStyleRef = new SprayStyleRefImpl();
    return sprayStyleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentBehavior createCompartmentBehavior()
  {
    CompartmentBehaviorImpl compartmentBehavior = new CompartmentBehaviorImpl();
    return compartmentBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeCompartmentAssignment createShapeCompartmentAssignment()
  {
    ShapeCompartmentAssignmentImpl shapeCompartmentAssignment = new ShapeCompartmentAssignmentImpl();
    return shapeCompartmentAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeReference createShapeReference()
  {
    ShapeReferenceImpl shapeReference = new ShapeReferenceImpl();
    return shapeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionReference createConnectionReference()
  {
    ConnectionReferenceImpl connectionReference = new ConnectionReferenceImpl();
    return connectionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeDslKey createShapeDslKey()
  {
    ShapeDslKeyImpl shapeDslKey = new ShapeDslKeyImpl();
    return shapeDslKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Figure createFigureFromString(EDataType eDataType, String initialValue)
  {
    Figure result = Figure.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFigureToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayPackage getSprayPackage()
  {
    return (SprayPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SprayPackage getPackage()
  {
    return SprayPackage.eINSTANCE;
  }

} //SprayFactoryImpl
