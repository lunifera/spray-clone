/**
 */
package org.eclipselabs.spray.mm.spray.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.spray.mm.spray.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.mm.spray.SprayPackage
 * @generated
 */
public class SprayAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SprayPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SprayPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpraySwitch<Adapter> modelSwitch =
    new SpraySwitch<Adapter>()
    {
      @Override
      public Adapter caseDiagram(Diagram object)
      {
        return createDiagramAdapter();
      }
      @Override
      public Adapter caseShapeInSpray(ShapeInSpray object)
      {
        return createShapeInSprayAdapter();
      }
      @Override
      public Adapter caseSprayElement(SprayElement object)
      {
        return createSprayElementAdapter();
      }
      @Override
      public Adapter caseConnectionInSpray(ConnectionInSpray object)
      {
        return createConnectionInSprayAdapter();
      }
      @Override
      public Adapter caseMetaClass(MetaClass object)
      {
        return createMetaClassAdapter();
      }
      @Override
      public Adapter caseMetaReference(MetaReference object)
      {
        return createMetaReferenceAdapter();
      }
      @Override
      public Adapter caseBehavior(Behavior object)
      {
        return createBehaviorAdapter();
      }
      @Override
      public Adapter caseCreateBehavior(CreateBehavior object)
      {
        return createCreateBehaviorAdapter();
      }
      @Override
      public Adapter caseCustomBehavior(CustomBehavior object)
      {
        return createCustomBehaviorAdapter();
      }
      @Override
      public Adapter caseBehaviorGroup(BehaviorGroup object)
      {
        return createBehaviorGroupAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAliasableElement(AliasableElement object)
      {
        return createAliasableElementAdapter();
      }
      @Override
      public Adapter caseShapeFromDsl(ShapeFromDsl object)
      {
        return createShapeFromDslAdapter();
      }
      @Override
      public Adapter caseShapePropertyAssignment(ShapePropertyAssignment object)
      {
        return createShapePropertyAssignmentAdapter();
      }
      @Override
      public Adapter caseSprayStyleRef(SprayStyleRef object)
      {
        return createSprayStyleRefAdapter();
      }
      @Override
      public Adapter caseCompartmentBehavior(CompartmentBehavior object)
      {
        return createCompartmentBehaviorAdapter();
      }
      @Override
      public Adapter caseShapeCompartmentAssignment(ShapeCompartmentAssignment object)
      {
        return createShapeCompartmentAssignmentAdapter();
      }
      @Override
      public Adapter caseShapeReference(ShapeReference object)
      {
        return createShapeReferenceAdapter();
      }
      @Override
      public Adapter caseConnectionReference(ConnectionReference object)
      {
        return createConnectionReferenceAdapter();
      }
      @Override
      public Adapter caseShapeDslKey(ShapeDslKey object)
      {
        return createShapeDslKeyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.Diagram
   * @generated
   */
  public Adapter createDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.ShapeInSpray <em>Shape In Spray</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.ShapeInSpray
   * @generated
   */
  public Adapter createShapeInSprayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.SprayElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.SprayElement
   * @generated
   */
  public Adapter createSprayElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.ConnectionInSpray <em>Connection In Spray</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.ConnectionInSpray
   * @generated
   */
  public Adapter createConnectionInSprayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.MetaClass <em>Meta Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.MetaClass
   * @generated
   */
  public Adapter createMetaClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.MetaReference <em>Meta Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.MetaReference
   * @generated
   */
  public Adapter createMetaReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.Behavior
   * @generated
   */
  public Adapter createBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.CreateBehavior <em>Create Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.CreateBehavior
   * @generated
   */
  public Adapter createCreateBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.CustomBehavior <em>Custom Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.CustomBehavior
   * @generated
   */
  public Adapter createCustomBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.BehaviorGroup <em>Behavior Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.BehaviorGroup
   * @generated
   */
  public Adapter createBehaviorGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.AliasableElement <em>Aliasable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.AliasableElement
   * @generated
   */
  public Adapter createAliasableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.ShapeFromDsl <em>Shape From Dsl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.ShapeFromDsl
   * @generated
   */
  public Adapter createShapeFromDslAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.ShapePropertyAssignment <em>Shape Property Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.ShapePropertyAssignment
   * @generated
   */
  public Adapter createShapePropertyAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.SprayStyleRef <em>Style Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.SprayStyleRef
   * @generated
   */
  public Adapter createSprayStyleRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.CompartmentBehavior <em>Compartment Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.CompartmentBehavior
   * @generated
   */
  public Adapter createCompartmentBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment <em>Shape Compartment Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment
   * @generated
   */
  public Adapter createShapeCompartmentAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.ShapeReference <em>Shape Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.ShapeReference
   * @generated
   */
  public Adapter createShapeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.ConnectionReference <em>Connection Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.ConnectionReference
   * @generated
   */
  public Adapter createConnectionReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.mm.spray.ShapeDslKey <em>Shape Dsl Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.spray.mm.spray.ShapeDslKey
   * @generated
   */
  public Adapter createShapeDslKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SprayAdapterFactory
