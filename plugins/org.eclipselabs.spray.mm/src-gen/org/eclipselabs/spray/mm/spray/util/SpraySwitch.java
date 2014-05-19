/**
 */
package org.eclipselabs.spray.mm.spray.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.spray.mm.spray.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.mm.spray.SprayPackage
 * @generated
 */
public class SpraySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SprayPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpraySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SprayPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SprayPackage.DIAGRAM:
      {
        Diagram diagram = (Diagram)theEObject;
        T result = caseDiagram(diagram);
        if (result == null) result = caseNamedElement(diagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.SHAPE_IN_SPRAY:
      {
        ShapeInSpray shapeInSpray = (ShapeInSpray)theEObject;
        T result = caseShapeInSpray(shapeInSpray);
        if (result == null) result = caseSprayElement(shapeInSpray);
        if (result == null) result = caseAliasableElement(shapeInSpray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.SPRAY_ELEMENT:
      {
        SprayElement sprayElement = (SprayElement)theEObject;
        T result = caseSprayElement(sprayElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.CONNECTION_IN_SPRAY:
      {
        ConnectionInSpray connectionInSpray = (ConnectionInSpray)theEObject;
        T result = caseConnectionInSpray(connectionInSpray);
        if (result == null) result = caseShapeInSpray(connectionInSpray);
        if (result == null) result = caseSprayElement(connectionInSpray);
        if (result == null) result = caseAliasableElement(connectionInSpray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.META_CLASS:
      {
        MetaClass metaClass = (MetaClass)theEObject;
        T result = caseMetaClass(metaClass);
        if (result == null) result = caseAliasableElement(metaClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.META_REFERENCE:
      {
        MetaReference metaReference = (MetaReference)theEObject;
        T result = caseMetaReference(metaReference);
        if (result == null) result = caseSprayElement(metaReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.BEHAVIOR:
      {
        Behavior behavior = (Behavior)theEObject;
        T result = caseBehavior(behavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.CREATE_BEHAVIOR:
      {
        CreateBehavior createBehavior = (CreateBehavior)theEObject;
        T result = caseCreateBehavior(createBehavior);
        if (result == null) result = caseBehavior(createBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.CUSTOM_BEHAVIOR:
      {
        CustomBehavior customBehavior = (CustomBehavior)theEObject;
        T result = caseCustomBehavior(customBehavior);
        if (result == null) result = caseBehavior(customBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.BEHAVIOR_GROUP:
      {
        BehaviorGroup behaviorGroup = (BehaviorGroup)theEObject;
        T result = caseBehaviorGroup(behaviorGroup);
        if (result == null) result = caseSprayElement(behaviorGroup);
        if (result == null) result = caseNamedElement(behaviorGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.ALIASABLE_ELEMENT:
      {
        AliasableElement aliasableElement = (AliasableElement)theEObject;
        T result = caseAliasableElement(aliasableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.SHAPE_FROM_DSL:
      {
        ShapeFromDsl shapeFromDsl = (ShapeFromDsl)theEObject;
        T result = caseShapeFromDsl(shapeFromDsl);
        if (result == null) result = caseShapeInSpray(shapeFromDsl);
        if (result == null) result = caseSprayElement(shapeFromDsl);
        if (result == null) result = caseAliasableElement(shapeFromDsl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.SHAPE_PROPERTY_ASSIGNMENT:
      {
        ShapePropertyAssignment shapePropertyAssignment = (ShapePropertyAssignment)theEObject;
        T result = caseShapePropertyAssignment(shapePropertyAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.SPRAY_STYLE_REF:
      {
        SprayStyleRef sprayStyleRef = (SprayStyleRef)theEObject;
        T result = caseSprayStyleRef(sprayStyleRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.COMPARTMENT_BEHAVIOR:
      {
        CompartmentBehavior compartmentBehavior = (CompartmentBehavior)theEObject;
        T result = caseCompartmentBehavior(compartmentBehavior);
        if (result == null) result = caseBehavior(compartmentBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT:
      {
        ShapeCompartmentAssignment shapeCompartmentAssignment = (ShapeCompartmentAssignment)theEObject;
        T result = caseShapeCompartmentAssignment(shapeCompartmentAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.SHAPE_REFERENCE:
      {
        ShapeReference shapeReference = (ShapeReference)theEObject;
        T result = caseShapeReference(shapeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.CONNECTION_REFERENCE:
      {
        ConnectionReference connectionReference = (ConnectionReference)theEObject;
        T result = caseConnectionReference(connectionReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SprayPackage.SHAPE_DSL_KEY:
      {
        ShapeDslKey shapeDslKey = (ShapeDslKey)theEObject;
        T result = caseShapeDslKey(shapeDslKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiagram(Diagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape In Spray</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape In Spray</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeInSpray(ShapeInSpray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSprayElement(SprayElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connection In Spray</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connection In Spray</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectionInSpray(ConnectionInSpray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaClass(MetaClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaReference(MetaReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehavior(Behavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateBehavior(CreateBehavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomBehavior(CustomBehavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviorGroup(BehaviorGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aliasable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aliasable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasableElement(AliasableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape From Dsl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape From Dsl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeFromDsl(ShapeFromDsl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Property Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapePropertyAssignment(ShapePropertyAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Style Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Style Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSprayStyleRef(SprayStyleRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compartment Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compartment Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompartmentBehavior(CompartmentBehavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Compartment Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Compartment Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeCompartmentAssignment(ShapeCompartmentAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeReference(ShapeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connection Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connection Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectionReference(ConnectionReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Dsl Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Dsl Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeDslKey(ShapeDslKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SpraySwitch
