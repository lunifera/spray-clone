/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.SprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.CreateBehaviorImpl#getContainmentReference <em>Containment Reference</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.CreateBehaviorImpl#getAskFor <em>Ask For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateBehaviorImpl extends BehaviorImpl implements CreateBehavior
{
  /**
   * The cached value of the '{@link #getContainmentReference() <em>Containment Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainmentReference()
   * @generated
   * @ordered
   */
  protected EReference containmentReference;

  /**
   * The cached value of the '{@link #getAskFor() <em>Ask For</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAskFor()
   * @generated
   * @ordered
   */
  protected EAttribute askFor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateBehaviorImpl()
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
    return SprayPackage.Literals.CREATE_BEHAVIOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainmentReference()
  {
    if (containmentReference != null && containmentReference.eIsProxy())
    {
      InternalEObject oldContainmentReference = (InternalEObject)containmentReference;
      containmentReference = (EReference)eResolveProxy(oldContainmentReference);
      if (containmentReference != oldContainmentReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.CREATE_BEHAVIOR__CONTAINMENT_REFERENCE, oldContainmentReference, containmentReference));
      }
    }
    return containmentReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetContainmentReference()
  {
    return containmentReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainmentReference(EReference newContainmentReference)
  {
    EReference oldContainmentReference = containmentReference;
    containmentReference = newContainmentReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.CREATE_BEHAVIOR__CONTAINMENT_REFERENCE, oldContainmentReference, containmentReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAskFor()
  {
    if (askFor != null && askFor.eIsProxy())
    {
      InternalEObject oldAskFor = (InternalEObject)askFor;
      askFor = (EAttribute)eResolveProxy(oldAskFor);
      if (askFor != oldAskFor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.CREATE_BEHAVIOR__ASK_FOR, oldAskFor, askFor));
      }
    }
    return askFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetAskFor()
  {
    return askFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAskFor(EAttribute newAskFor)
  {
    EAttribute oldAskFor = askFor;
    askFor = newAskFor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.CREATE_BEHAVIOR__ASK_FOR, oldAskFor, askFor));
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
      case SprayPackage.CREATE_BEHAVIOR__CONTAINMENT_REFERENCE:
        if (resolve) return getContainmentReference();
        return basicGetContainmentReference();
      case SprayPackage.CREATE_BEHAVIOR__ASK_FOR:
        if (resolve) return getAskFor();
        return basicGetAskFor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SprayPackage.CREATE_BEHAVIOR__CONTAINMENT_REFERENCE:
        setContainmentReference((EReference)newValue);
        return;
      case SprayPackage.CREATE_BEHAVIOR__ASK_FOR:
        setAskFor((EAttribute)newValue);
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
      case SprayPackage.CREATE_BEHAVIOR__CONTAINMENT_REFERENCE:
        setContainmentReference((EReference)null);
        return;
      case SprayPackage.CREATE_BEHAVIOR__ASK_FOR:
        setAskFor((EAttribute)null);
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
      case SprayPackage.CREATE_BEHAVIOR__CONTAINMENT_REFERENCE:
        return containmentReference != null;
      case SprayPackage.CREATE_BEHAVIOR__ASK_FOR:
        return askFor != null;
    }
    return super.eIsSet(featureID);
  }

} //CreateBehaviorImpl
