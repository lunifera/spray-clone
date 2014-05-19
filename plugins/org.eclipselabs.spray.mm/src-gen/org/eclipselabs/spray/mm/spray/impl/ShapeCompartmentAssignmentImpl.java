/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.SprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Compartment Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeCompartmentAssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeCompartmentAssignmentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeCompartmentAssignmentImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeCompartmentAssignmentImpl#getShapeDslKey <em>Shape Dsl Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeCompartmentAssignmentImpl extends MinimalEObjectImpl.Container implements ShapeCompartmentAssignment
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected XExpression value;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected EReference reference;

  /**
   * The cached value of the '{@link #getShapeDslKey() <em>Shape Dsl Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShapeDslKey()
   * @generated
   * @ordered
   */
  protected ShapeDslKey shapeDslKey;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShapeCompartmentAssignmentImpl()
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
    return SprayPackage.Literals.SHAPE_COMPARTMENT_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(XExpression newValue, NotificationChain msgs)
  {
    XExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(XExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (EReference)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(EReference newReference)
  {
    EReference oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeFromDsl getShape()
  {
    if (eContainerFeatureID() != SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE) return null;
    return (ShapeFromDsl)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeFromDsl basicGetShape()
  {
    if (eContainerFeatureID() != SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE) return null;
    return (ShapeFromDsl)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShape(ShapeFromDsl newShape, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newShape, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(ShapeFromDsl newShape)
  {
    if (newShape != eInternalContainer() || (eContainerFeatureID() != SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE && newShape != null))
    {
      if (EcoreUtil.isAncestor(this, newShape))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newShape != null)
        msgs = ((InternalEObject)newShape).eInverseAdd(this, SprayPackage.SHAPE_FROM_DSL__REFERENCES, ShapeFromDsl.class, msgs);
      msgs = basicSetShape(newShape, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE, newShape, newShape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeDslKey getShapeDslKey()
  {
    return shapeDslKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShapeDslKey(ShapeDslKey newShapeDslKey, NotificationChain msgs)
  {
    ShapeDslKey oldShapeDslKey = shapeDslKey;
    shapeDslKey = newShapeDslKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY, oldShapeDslKey, newShapeDslKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShapeDslKey(ShapeDslKey newShapeDslKey)
  {
    if (newShapeDslKey != shapeDslKey)
    {
      NotificationChain msgs = null;
      if (shapeDslKey != null)
        msgs = ((InternalEObject)shapeDslKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY, null, msgs);
      if (newShapeDslKey != null)
        msgs = ((InternalEObject)newShapeDslKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY, null, msgs);
      msgs = basicSetShapeDslKey(newShapeDslKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY, newShapeDslKey, newShapeDslKey));
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
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetShape((ShapeFromDsl)otherEnd, msgs);
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
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE:
        return basicSetValue(null, msgs);
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE:
        return basicSetShape(null, msgs);
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY:
        return basicSetShapeDslKey(null, msgs);
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
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE:
        return eInternalContainer().eInverseRemove(this, SprayPackage.SHAPE_FROM_DSL__REFERENCES, ShapeFromDsl.class, msgs);
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
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE:
        return getValue();
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE:
        if (resolve) return getShape();
        return basicGetShape();
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY:
        return getShapeDslKey();
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
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE:
        setValue((XExpression)newValue);
        return;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE:
        setReference((EReference)newValue);
        return;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE:
        setShape((ShapeFromDsl)newValue);
        return;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY:
        setShapeDslKey((ShapeDslKey)newValue);
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
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE:
        setValue((XExpression)null);
        return;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE:
        setReference((EReference)null);
        return;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE:
        setShape((ShapeFromDsl)null);
        return;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY:
        setShapeDslKey((ShapeDslKey)null);
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
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__VALUE:
        return value != null;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__REFERENCE:
        return reference != null;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE:
        return basicGetShape() != null;
      case SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE_DSL_KEY:
        return shapeDslKey != null;
    }
    return super.eIsSet(featureID);
  }

} //ShapeCompartmentAssignmentImpl
