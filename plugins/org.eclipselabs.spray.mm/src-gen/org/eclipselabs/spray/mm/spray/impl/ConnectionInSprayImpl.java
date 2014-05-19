/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment;
import org.eclipselabs.spray.mm.spray.SprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection In Spray</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ConnectionInSprayImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ConnectionInSprayImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ConnectionInSprayImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ConnectionInSprayImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionInSprayImpl extends ShapeInSprayImpl implements ConnectionInSpray
{
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected EReference from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected EReference to;

  /**
   * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected ConnectionReference connection;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionInSprayImpl()
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
    return SprayPackage.Literals.CONNECTION_IN_SPRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (EReference)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.CONNECTION_IN_SPRAY__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(EReference newFrom)
  {
    EReference oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.CONNECTION_IN_SPRAY__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (EReference)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.CONNECTION_IN_SPRAY__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(EReference newTo)
  {
    EReference oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.CONNECTION_IN_SPRAY__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionReference getConnection()
  {
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConnection(ConnectionReference newConnection, NotificationChain msgs)
  {
    ConnectionReference oldConnection = connection;
    connection = newConnection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.CONNECTION_IN_SPRAY__CONNECTION, oldConnection, newConnection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnection(ConnectionReference newConnection)
  {
    if (newConnection != connection)
    {
      NotificationChain msgs = null;
      if (connection != null)
        msgs = ((InternalEObject)connection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.CONNECTION_IN_SPRAY__CONNECTION, null, msgs);
      if (newConnection != null)
        msgs = ((InternalEObject)newConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.CONNECTION_IN_SPRAY__CONNECTION, null, msgs);
      msgs = basicSetConnection(newConnection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.CONNECTION_IN_SPRAY__CONNECTION, newConnection, newConnection));
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
      properties = new EObjectContainmentEList<ShapePropertyAssignment>(ShapePropertyAssignment.class, this, SprayPackage.CONNECTION_IN_SPRAY__PROPERTIES);
    }
    return properties;
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
      case SprayPackage.CONNECTION_IN_SPRAY__CONNECTION:
        return basicSetConnection(null, msgs);
      case SprayPackage.CONNECTION_IN_SPRAY__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case SprayPackage.CONNECTION_IN_SPRAY__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case SprayPackage.CONNECTION_IN_SPRAY__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case SprayPackage.CONNECTION_IN_SPRAY__CONNECTION:
        return getConnection();
      case SprayPackage.CONNECTION_IN_SPRAY__PROPERTIES:
        return getProperties();
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
      case SprayPackage.CONNECTION_IN_SPRAY__FROM:
        setFrom((EReference)newValue);
        return;
      case SprayPackage.CONNECTION_IN_SPRAY__TO:
        setTo((EReference)newValue);
        return;
      case SprayPackage.CONNECTION_IN_SPRAY__CONNECTION:
        setConnection((ConnectionReference)newValue);
        return;
      case SprayPackage.CONNECTION_IN_SPRAY__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends ShapePropertyAssignment>)newValue);
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
      case SprayPackage.CONNECTION_IN_SPRAY__FROM:
        setFrom((EReference)null);
        return;
      case SprayPackage.CONNECTION_IN_SPRAY__TO:
        setTo((EReference)null);
        return;
      case SprayPackage.CONNECTION_IN_SPRAY__CONNECTION:
        setConnection((ConnectionReference)null);
        return;
      case SprayPackage.CONNECTION_IN_SPRAY__PROPERTIES:
        getProperties().clear();
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
      case SprayPackage.CONNECTION_IN_SPRAY__FROM:
        return from != null;
      case SprayPackage.CONNECTION_IN_SPRAY__TO:
        return to != null;
      case SprayPackage.CONNECTION_IN_SPRAY__CONNECTION:
        return connection != null;
      case SprayPackage.CONNECTION_IN_SPRAY__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConnectionInSprayImpl
