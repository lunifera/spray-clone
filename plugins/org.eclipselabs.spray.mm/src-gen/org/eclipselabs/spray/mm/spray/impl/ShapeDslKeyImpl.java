/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmEnumerationLiteral;

import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.SprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Dsl Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeDslKeyImpl#getJvmKey <em>Jvm Key</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.ShapeDslKeyImpl#getDslKey <em>Dsl Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeDslKeyImpl extends MinimalEObjectImpl.Container implements ShapeDslKey
{
  /**
   * The cached value of the '{@link #getJvmKey() <em>Jvm Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvmKey()
   * @generated
   * @ordered
   */
  protected JvmEnumerationLiteral jvmKey;

  /**
   * The default value of the '{@link #getDslKey() <em>Dsl Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslKey()
   * @generated
   * @ordered
   */
  protected static final String DSL_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDslKey() <em>Dsl Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslKey()
   * @generated
   * @ordered
   */
  protected String dslKey = DSL_KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShapeDslKeyImpl()
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
    return SprayPackage.Literals.SHAPE_DSL_KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnumerationLiteral getJvmKey()
  {
    if (jvmKey != null && jvmKey.eIsProxy())
    {
      InternalEObject oldJvmKey = (InternalEObject)jvmKey;
      jvmKey = (JvmEnumerationLiteral)eResolveProxy(oldJvmKey);
      if (jvmKey != oldJvmKey)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.SHAPE_DSL_KEY__JVM_KEY, oldJvmKey, jvmKey));
      }
    }
    return jvmKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmEnumerationLiteral basicGetJvmKey()
  {
    return jvmKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJvmKey(JvmEnumerationLiteral newJvmKey)
  {
    JvmEnumerationLiteral oldJvmKey = jvmKey;
    jvmKey = newJvmKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_DSL_KEY__JVM_KEY, oldJvmKey, jvmKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDslKey()
  {
    return dslKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDslKey(String newDslKey)
  {
    String oldDslKey = dslKey;
    dslKey = newDslKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.SHAPE_DSL_KEY__DSL_KEY, oldDslKey, dslKey));
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
      case SprayPackage.SHAPE_DSL_KEY__JVM_KEY:
        if (resolve) return getJvmKey();
        return basicGetJvmKey();
      case SprayPackage.SHAPE_DSL_KEY__DSL_KEY:
        return getDslKey();
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
      case SprayPackage.SHAPE_DSL_KEY__JVM_KEY:
        setJvmKey((JvmEnumerationLiteral)newValue);
        return;
      case SprayPackage.SHAPE_DSL_KEY__DSL_KEY:
        setDslKey((String)newValue);
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
      case SprayPackage.SHAPE_DSL_KEY__JVM_KEY:
        setJvmKey((JvmEnumerationLiteral)null);
        return;
      case SprayPackage.SHAPE_DSL_KEY__DSL_KEY:
        setDslKey(DSL_KEY_EDEFAULT);
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
      case SprayPackage.SHAPE_DSL_KEY__JVM_KEY:
        return jvmKey != null;
      case SprayPackage.SHAPE_DSL_KEY__DSL_KEY:
        return DSL_KEY_EDEFAULT == null ? dslKey != null : !DSL_KEY_EDEFAULT.equals(dslKey);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dslKey: ");
    result.append(dslKey);
    result.append(')');
    return result.toString();
  }

} //ShapeDslKeyImpl
