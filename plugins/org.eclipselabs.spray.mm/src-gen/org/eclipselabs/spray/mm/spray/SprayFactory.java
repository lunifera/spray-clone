/**
 */
package org.eclipselabs.spray.mm.spray;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.mm.spray.SprayPackage
 * @generated
 */
public interface SprayFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SprayFactory eINSTANCE = org.eclipselabs.spray.mm.spray.impl.SprayFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram</em>'.
   * @generated
   */
  Diagram createDiagram();

  /**
   * Returns a new object of class '<em>Connection In Spray</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection In Spray</em>'.
   * @generated
   */
  ConnectionInSpray createConnectionInSpray();

  /**
   * Returns a new object of class '<em>Meta Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Class</em>'.
   * @generated
   */
  MetaClass createMetaClass();

  /**
   * Returns a new object of class '<em>Meta Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Reference</em>'.
   * @generated
   */
  MetaReference createMetaReference();

  /**
   * Returns a new object of class '<em>Create Behavior</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Behavior</em>'.
   * @generated
   */
  CreateBehavior createCreateBehavior();

  /**
   * Returns a new object of class '<em>Custom Behavior</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Behavior</em>'.
   * @generated
   */
  CustomBehavior createCustomBehavior();

  /**
   * Returns a new object of class '<em>Behavior Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Behavior Group</em>'.
   * @generated
   */
  BehaviorGroup createBehaviorGroup();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Shape From Dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape From Dsl</em>'.
   * @generated
   */
  ShapeFromDsl createShapeFromDsl();

  /**
   * Returns a new object of class '<em>Shape Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Property Assignment</em>'.
   * @generated
   */
  ShapePropertyAssignment createShapePropertyAssignment();

  /**
   * Returns a new object of class '<em>Style Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style Ref</em>'.
   * @generated
   */
  SprayStyleRef createSprayStyleRef();

  /**
   * Returns a new object of class '<em>Compartment Behavior</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compartment Behavior</em>'.
   * @generated
   */
  CompartmentBehavior createCompartmentBehavior();

  /**
   * Returns a new object of class '<em>Shape Compartment Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Compartment Assignment</em>'.
   * @generated
   */
  ShapeCompartmentAssignment createShapeCompartmentAssignment();

  /**
   * Returns a new object of class '<em>Shape Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Reference</em>'.
   * @generated
   */
  ShapeReference createShapeReference();

  /**
   * Returns a new object of class '<em>Connection Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection Reference</em>'.
   * @generated
   */
  ConnectionReference createConnectionReference();

  /**
   * Returns a new object of class '<em>Shape Dsl Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape Dsl Key</em>'.
   * @generated
   */
  ShapeDslKey createShapeDslKey();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SprayPackage getSprayPackage();

} //SprayFactory
