/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipselabs.spray.mm.spray.CompartmentBehavior;
import org.eclipselabs.spray.mm.spray.SprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.CompartmentBehaviorImpl#getCompartmentReference <em>Compartment Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentBehaviorImpl extends BehaviorImpl implements CompartmentBehavior
{
  /**
   * The cached value of the '{@link #getCompartmentReference() <em>Compartment Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompartmentReference()
   * @generated
   * @ordered
   */
  protected EList<EReference> compartmentReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentBehaviorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SprayPackage.Literals.COMPARTMENT_BEHAVIOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EReference> getCompartmentReference()
  {
    if (compartmentReference == null)
    {
      compartmentReference = new EObjectResolvingEList<EReference>(EReference.class, this, SprayPackage.COMPARTMENT_BEHAVIOR__COMPARTMENT_REFERENCE);
    }
    return compartmentReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SprayPackage.COMPARTMENT_BEHAVIOR__COMPARTMENT_REFERENCE:
        return getCompartmentReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SprayPackage.COMPARTMENT_BEHAVIOR__COMPARTMENT_REFERENCE:
        getCompartmentReference().clear();
        getCompartmentReference().addAll((Collection<? extends EReference>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SprayPackage.COMPARTMENT_BEHAVIOR__COMPARTMENT_REFERENCE:
        getCompartmentReference().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SprayPackage.COMPARTMENT_BEHAVIOR__COMPARTMENT_REFERENCE:
        return compartmentReference != null && !compartmentReference.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompartmentBehaviorImpl
