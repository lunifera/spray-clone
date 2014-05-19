/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape From Dsl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeFromDslImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeFromDslImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeFromDslImpl#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeFromDslImpl extends ShapeInSprayImpl implements ShapeFromDsl
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<ShapePropertyAssignment> properties;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<ShapeCompartmentAssignment> references;

  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected ShapeReference shape;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShapeFromDslImpl()
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
    return SprayPackage.Literals.SHAPE_FROM_DSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ShapePropertyAssignment> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<ShapePropertyAssignment>(ShapePropertyAssignment.class, this, SprayPackage.SHAPE_FROM_DSL__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ShapeCompartmentAssignment> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentWithInverseEList<ShapeCompartmentAssignment>(ShapeCompartmentAssignment.class, this, SprayPackage.SHAPE_FROM_DSL__REFERENCES, SprayPackage.SHAPE_COMPARTMENT_ASSIGNMENT__SHAPE);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeReference getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShape(ShapeReference newShape, NotificationChain msgs)
  {
    ShapeReference oldShape = shape;
    shape = newShape;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_FROM_DSL__SHAPE, oldShape, newShape);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(ShapeReference newShape)
  {
    if (newShape != shape)
    {
      NotificationChain msgs = null;
      if (shape != null)
        msgs = ((InternalEObject)shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.SHAPE_FROM_DSL__SHAPE, null, msgs);
      if (newShape != null)
        msgs = ((InternalEObject)newShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.SHAPE_FROM_DSL__SHAPE, null, msgs);
      msgs = basicSetShape(newShape, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_FROM_DSL__SHAPE, newShape, newShape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SprayPackage.SHAPE_FROM_DSL__REFERENCES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
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
      case SprayPackage.SHAPE_FROM_DSL__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case SprayPackage.SHAPE_FROM_DSL__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
      case SprayPackage.SHAPE_FROM_DSL__SHAPE:
        return basicSetShape(null, msgs);
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
      case SprayPackage.SHAPE_FROM_DSL__PROPERTIES:
        return getProperties();
      case SprayPackage.SHAPE_FROM_DSL__REFERENCES:
        return getReferences();
      case SprayPackage.SHAPE_FROM_DSL__SHAPE:
        return getShape();
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
      case SprayPackage.SHAPE_FROM_DSL__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends ShapePropertyAssignment>)newValue);
        return;
      case SprayPackage.SHAPE_FROM_DSL__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends ShapeCompartmentAssignment>)newValue);
        return;
      case SprayPackage.SHAPE_FROM_DSL__SHAPE:
        setShape((ShapeReference)newValue);
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
      case SprayPackage.SHAPE_FROM_DSL__PROPERTIES:
        getProperties().clear();
        return;
      case SprayPackage.SHAPE_FROM_DSL__REFERENCES:
        getReferences().clear();
        return;
      case SprayPackage.SHAPE_FROM_DSL__SHAPE:
        setShape((ShapeReference)null);
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
      case SprayPackage.SHAPE_FROM_DSL__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case SprayPackage.SHAPE_FROM_DSL__REFERENCES:
        return references != null && !references.isEmpty();
      case SprayPackage.SHAPE_FROM_DSL__SHAPE:
        return shape != null;
    }
    return super.eIsSet(featureID);
  }

} //ShapeFromDslImpl
