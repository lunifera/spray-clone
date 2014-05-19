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

import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;

import org.eclipselabs.spray.shapes.ConnectionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ConnectionReferenceImpl#getJvmConnection <em>Jvm Connection</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ConnectionReferenceImpl#getDslConnection <em>Dsl Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionReferenceImpl extends MinimalEObjectImpl.Container implements ConnectionReference
{
  /**
   * The cached value of the '{@link #getJvmConnection() <em>Jvm Connection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvmConnection()
   * @generated
   * @ordered
   */
  protected JvmTypeReference jvmConnection;

  /**
   * The cached value of the '{@link #getDslConnection() <em>Dsl Connection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslConnection()
   * @generated
   * @ordered
   */
  protected ConnectionDefinition dslConnection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionReferenceImpl()
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
    return SprayPackage.Literals.CONNECTION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getJvmConnection()
  {
    return jvmConnection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJvmConnection(JvmTypeReference newJvmConnection, NotificationChain msgs)
  {
    JvmTypeReference oldJvmConnection = jvmConnection;
    jvmConnection = newJvmConnection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION, oldJvmConnection, newJvmConnection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJvmConnection(JvmTypeReference newJvmConnection)
  {
    if (newJvmConnection != jvmConnection)
    {
      NotificationChain msgs = null;
      if (jvmConnection != null)
        msgs = ((InternalEObject)jvmConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION, null, msgs);
      if (newJvmConnection != null)
        msgs = ((InternalEObject)newJvmConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION, null, msgs);
      msgs = basicSetJvmConnection(newJvmConnection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION, newJvmConnection, newJvmConnection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionDefinition getDslConnection()
  {
    if (dslConnection != null && dslConnection.eIsProxy())
    {
      InternalEObject oldDslConnection = (InternalEObject)dslConnection;
      dslConnection = (ConnectionDefinition)eResolveProxy(oldDslConnection);
      if (dslConnection != oldDslConnection)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.CONNECTION_REFERENCE__DSL_CONNECTION, oldDslConnection, dslConnection));
      }
    }
    return dslConnection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionDefinition basicGetDslConnection()
  {
    return dslConnection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDslConnection(ConnectionDefinition newDslConnection)
  {
    ConnectionDefinition oldDslConnection = dslConnection;
    dslConnection = newDslConnection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.CONNECTION_REFERENCE__DSL_CONNECTION, oldDslConnection, dslConnection));
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
      case SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION:
        return basicSetJvmConnection(null, msgs);
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
      case SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION:
        return getJvmConnection();
      case SprayPackage.CONNECTION_REFERENCE__DSL_CONNECTION:
        if (resolve) return getDslConnection();
        return basicGetDslConnection();
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
      case SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION:
        setJvmConnection((JvmTypeReference)newValue);
        return;
      case SprayPackage.CONNECTION_REFERENCE__DSL_CONNECTION:
        setDslConnection((ConnectionDefinition)newValue);
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
      case SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION:
        setJvmConnection((JvmTypeReference)null);
        return;
      case SprayPackage.CONNECTION_REFERENCE__DSL_CONNECTION:
        setDslConnection((ConnectionDefinition)null);
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
      case SprayPackage.CONNECTION_REFERENCE__JVM_CONNECTION:
        return jvmConnection != null;
      case SprayPackage.CONNECTION_REFERENCE__DSL_CONNECTION:
        return dslConnection != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectionReferenceImpl
