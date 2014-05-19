/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;

import org.eclipselabs.spray.shapes.ShapeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeReferenceImpl#getDslShape <em>Dsl Shape</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeReferenceImpl#getJvmShape <em>Jvm Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeReferenceImpl extends MinimalEObjectImpl.Container implements ShapeReference
{
  /**
   * The cached value of the '{@link #getDslShape() <em>Dsl Shape</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslShape()
   * @generated
   * @ordered
   */
  protected ShapeDefinition dslShape;

  /**
   * The cached value of the '{@link #getJvmShape() <em>Jvm Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvmShape()
   * @generated
   * @ordered
   */
  protected JvmTypeReference jvmShape;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShapeReferenceImpl()
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
    return SprayPackage.Literals.SHAPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeDefinition getDslShape()
  {
    if (dslShape != null && dslShape.eIsProxy())
    {
      InternalEObject oldDslShape = (InternalEObject)dslShape;
      dslShape = (ShapeDefinition)eResolveProxy(oldDslShape);
      if (dslShape != oldDslShape)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.SHAPE_REFERENCE__DSL_SHAPE, oldDslShape, dslShape));
      }
    }
    return dslShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeDefinition basicGetDslShape()
  {
    return dslShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDslShape(ShapeDefinition newDslShape)
  {
    ShapeDefinition oldDslShape = dslShape;
    dslShape = newDslShape;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_REFERENCE__DSL_SHAPE, oldDslShape, dslShape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getJvmShape()
  {
    return jvmShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJvmShape(JvmTypeReference newJvmShape, NotificationChain msgs)
  {
    JvmTypeReference oldJvmShape = jvmShape;
    jvmShape = newJvmShape;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_REFERENCE__JVM_SHAPE, oldJvmShape, newJvmShape);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJvmShape(JvmTypeReference newJvmShape)
  {
    if (newJvmShape != jvmShape)
    {
      NotificationChain msgs = null;
      if (jvmShape != null)
        msgs = ((InternalEObject)jvmShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.SHAPE_REFERENCE__JVM_SHAPE, null, msgs);
      if (newJvmShape != null)
        msgs = ((InternalEObject)newJvmShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.SHAPE_REFERENCE__JVM_SHAPE, null, msgs);
      msgs = basicSetJvmShape(newJvmShape, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_REFERENCE__JVM_SHAPE, newJvmShape, newJvmShape));
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
      case SprayPackage.SHAPE_REFERENCE__JVM_SHAPE:
        return basicSetJvmShape(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SprayPackage.SHAPE_REFERENCE__DSL_SHAPE:
        if (resolve) return getDslShape();
        return basicGetDslShape();
      case SprayPackage.SHAPE_REFERENCE__JVM_SHAPE:
        return getJvmShape();
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
      case SprayPackage.SHAPE_REFERENCE__DSL_SHAPE:
        setDslShape((ShapeDefinition)newValue);
        return;
      case SprayPackage.SHAPE_REFERENCE__JVM_SHAPE:
        setJvmShape((JvmTypeReference)newValue);
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
      case SprayPackage.SHAPE_REFERENCE__DSL_SHAPE:
        setDslShape((ShapeDefinition)null);
        return;
      case SprayPackage.SHAPE_REFERENCE__JVM_SHAPE:
        setJvmShape((JvmTypeReference)null);
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
      case SprayPackage.SHAPE_REFERENCE__DSL_SHAPE:
        return dslShape != null;
      case SprayPackage.SHAPE_REFERENCE__JVM_SHAPE:
        return jvmShape != null;
    }
    return super.eIsSet(featureID);
  }

} //ShapeReferenceImpl
