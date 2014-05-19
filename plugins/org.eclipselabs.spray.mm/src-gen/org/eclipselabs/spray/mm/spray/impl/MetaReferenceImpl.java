/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaReferenceImpl#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaReferenceImpl#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaReferenceImpl extends SprayElementImpl implements MetaReference
{
  /**
   * The cached value of the '{@link #getRepresentedBy() <em>Represented By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresentedBy()
   * @generated
   * @ordered
   */
  protected ConnectionInSpray representedBy;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EReference target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaReferenceImpl()
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
    return SprayPackage.Literals.META_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionInSpray getRepresentedBy()
  {
    return representedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepresentedBy(ConnectionInSpray newRepresentedBy, NotificationChain msgs)
  {
    ConnectionInSpray oldRepresentedBy = representedBy;
    representedBy = newRepresentedBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.META_REFERENCE__REPRESENTED_BY, oldRepresentedBy, newRepresentedBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepresentedBy(ConnectionInSpray newRepresentedBy)
  {
    if (newRepresentedBy != representedBy)
    {
      NotificationChain msgs = null;
      if (representedBy != null)
        msgs = ((InternalEObject)representedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.META_REFERENCE__REPRESENTED_BY, null, msgs);
      if (newRepresentedBy != null)
        msgs = ((InternalEObject)newRepresentedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.META_REFERENCE__REPRESENTED_BY, null, msgs);
      msgs = basicSetRepresentedBy(newRepresentedBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_REFERENCE__REPRESENTED_BY, newRepresentedBy, newRepresentedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaClass getMetaClass()
  {
    if (eContainerFeatureID() != SprayPackage.META_REFERENCE__META_CLASS) return null;
    return (MetaClass)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaClass basicGetMetaClass()
  {
    if (eContainerFeatureID() != SprayPackage.META_REFERENCE__META_CLASS) return null;
    return (MetaClass)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaClass(MetaClass newMetaClass, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newMetaClass, SprayPackage.META_REFERENCE__META_CLASS, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaClass(MetaClass newMetaClass)
  {
    if (newMetaClass != eInternalContainer() || (eContainerFeatureID() != SprayPackage.META_REFERENCE__META_CLASS && newMetaClass != null))
    {
      if (EcoreUtil.isAncestor(this, newMetaClass))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newMetaClass != null)
        msgs = ((InternalEObject)newMetaClass).eInverseAdd(this, SprayPackage.META_CLASS__REFERENCES, MetaClass.class, msgs);
      msgs = basicSetMetaClass(newMetaClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_REFERENCE__META_CLASS, newMetaClass, newMetaClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (EReference)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.META_REFERENCE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(EReference newTarget)
  {
    EReference oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_REFERENCE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SprayPackage.META_REFERENCE__META_CLASS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetMetaClass((MetaClass)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SprayPackage.META_REFERENCE__REPRESENTED_BY:
        return basicSetRepresentedBy(null, msgs);
      case SprayPackage.META_REFERENCE__META_CLASS:
        return basicSetMetaClass(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case SprayPackage.META_REFERENCE__META_CLASS:
        return eInternalContainer().eInverseRemove(this, SprayPackage.META_CLASS__REFERENCES, MetaClass.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case SprayPackage.META_REFERENCE__REPRESENTED_BY:
        return getRepresentedBy();
      case SprayPackage.META_REFERENCE__META_CLASS:
        if (resolve) return getMetaClass();
        return basicGetMetaClass();
      case SprayPackage.META_REFERENCE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case SprayPackage.META_REFERENCE__REPRESENTED_BY:
        setRepresentedBy((ConnectionInSpray)newValue);
        return;
      case SprayPackage.META_REFERENCE__META_CLASS:
        setMetaClass((MetaClass)newValue);
        return;
      case SprayPackage.META_REFERENCE__TARGET:
        setTarget((EReference)newValue);
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
      case SprayPackage.META_REFERENCE__REPRESENTED_BY:
        setRepresentedBy((ConnectionInSpray)null);
        return;
      case SprayPackage.META_REFERENCE__META_CLASS:
        setMetaClass((MetaClass)null);
        return;
      case SprayPackage.META_REFERENCE__TARGET:
        setTarget((EReference)null);
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
      case SprayPackage.META_REFERENCE__REPRESENTED_BY:
        return representedBy != null;
      case SprayPackage.META_REFERENCE__META_CLASS:
        return basicGetMetaClass() != null;
      case SprayPackage.META_REFERENCE__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //MetaReferenceImpl
