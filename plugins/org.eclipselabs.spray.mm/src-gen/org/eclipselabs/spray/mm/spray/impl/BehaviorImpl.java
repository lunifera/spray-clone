/**
 */
package org.eclipselabs.spray.mm.spray.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.BehaviorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.BehaviorImpl#getMetaClass <em>Meta Class</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.BehaviorImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.BehaviorImpl#getPaletteCompartment <em>Palette Compartment</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.BehaviorImpl#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorImpl extends MinimalEObjectImpl.Container implements Behavior
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getPaletteCompartment() <em>Palette Compartment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaletteCompartment()
   * @generated
   * @ordered
   */
  protected static final String PALETTE_COMPARTMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPaletteCompartment() <em>Palette Compartment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaletteCompartment()
   * @generated
   * @ordered
   */
  protected String paletteCompartment = PALETTE_COMPARTMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRealizedBy() <em>Realized By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizedBy()
   * @generated
   * @ordered
   */
  protected JvmTypeReference realizedBy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BehaviorImpl()
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
    return SprayPackage.Literals.BEHAVIOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.BEHAVIOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaClass getMetaClass()
  {
    if (eContainerFeatureID() != SprayPackage.BEHAVIOR__META_CLASS) return null;
    return (MetaClass)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaClass basicGetMetaClass()
  {
    if (eContainerFeatureID() != SprayPackage.BEHAVIOR__META_CLASS) return null;
    return (MetaClass)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaClass(MetaClass newMetaClass, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newMetaClass, SprayPackage.BEHAVIOR__META_CLASS, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaClass(MetaClass newMetaClass)
  {
    if (newMetaClass != eInternalContainer() || (eContainerFeatureID() != SprayPackage.BEHAVIOR__META_CLASS && newMetaClass != null))
    {
      if (EcoreUtil.isAncestor(this, newMetaClass))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newMetaClass != null)
        msgs = ((InternalEObject)newMetaClass).eInverseAdd(this, SprayPackage.META_CLASS__BEHAVIORS, MetaClass.class, msgs);
      msgs = basicSetMetaClass(newMetaClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.BEHAVIOR__META_CLASS, newMetaClass, newMetaClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.BEHAVIOR__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPaletteCompartment()
  {
    return paletteCompartment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPaletteCompartment(String newPaletteCompartment)
  {
    String oldPaletteCompartment = paletteCompartment;
    paletteCompartment = newPaletteCompartment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.BEHAVIOR__PALETTE_COMPARTMENT, oldPaletteCompartment, paletteCompartment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getRealizedBy()
  {
    return realizedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRealizedBy(JvmTypeReference newRealizedBy, NotificationChain msgs)
  {
    JvmTypeReference oldRealizedBy = realizedBy;
    realizedBy = newRealizedBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.BEHAVIOR__REALIZED_BY, oldRealizedBy, newRealizedBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealizedBy(JvmTypeReference newRealizedBy)
  {
    if (newRealizedBy != realizedBy)
    {
      NotificationChain msgs = null;
      if (realizedBy != null)
        msgs = ((InternalEObject)realizedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.BEHAVIOR__REALIZED_BY, null, msgs);
      if (newRealizedBy != null)
        msgs = ((InternalEObject)newRealizedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.BEHAVIOR__REALIZED_BY, null, msgs);
      msgs = basicSetRealizedBy(newRealizedBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.BEHAVIOR__REALIZED_BY, newRealizedBy, newRealizedBy));
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
      case SprayPackage.BEHAVIOR__META_CLASS:
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
      case SprayPackage.BEHAVIOR__META_CLASS:
        return basicSetMetaClass(null, msgs);
      case SprayPackage.BEHAVIOR__REALIZED_BY:
        return basicSetRealizedBy(null, msgs);
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
      case SprayPackage.BEHAVIOR__META_CLASS:
        return eInternalContainer().eInverseRemove(this, SprayPackage.META_CLASS__BEHAVIORS, MetaClass.class, msgs);
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
      case SprayPackage.BEHAVIOR__NAME:
        return getName();
      case SprayPackage.BEHAVIOR__META_CLASS:
        if (resolve) return getMetaClass();
        return basicGetMetaClass();
      case SprayPackage.BEHAVIOR__LABEL:
        return getLabel();
      case SprayPackage.BEHAVIOR__PALETTE_COMPARTMENT:
        return getPaletteCompartment();
      case SprayPackage.BEHAVIOR__REALIZED_BY:
        return getRealizedBy();
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
      case SprayPackage.BEHAVIOR__NAME:
        setName((String)newValue);
        return;
      case SprayPackage.BEHAVIOR__META_CLASS:
        setMetaClass((MetaClass)newValue);
        return;
      case SprayPackage.BEHAVIOR__LABEL:
        setLabel((String)newValue);
        return;
      case SprayPackage.BEHAVIOR__PALETTE_COMPARTMENT:
        setPaletteCompartment((String)newValue);
        return;
      case SprayPackage.BEHAVIOR__REALIZED_BY:
        setRealizedBy((JvmTypeReference)newValue);
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
      case SprayPackage.BEHAVIOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SprayPackage.BEHAVIOR__META_CLASS:
        setMetaClass((MetaClass)null);
        return;
      case SprayPackage.BEHAVIOR__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case SprayPackage.BEHAVIOR__PALETTE_COMPARTMENT:
        setPaletteCompartment(PALETTE_COMPARTMENT_EDEFAULT);
        return;
      case SprayPackage.BEHAVIOR__REALIZED_BY:
        setRealizedBy((JvmTypeReference)null);
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
      case SprayPackage.BEHAVIOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SprayPackage.BEHAVIOR__META_CLASS:
        return basicGetMetaClass() != null;
      case SprayPackage.BEHAVIOR__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case SprayPackage.BEHAVIOR__PALETTE_COMPARTMENT:
        return PALETTE_COMPARTMENT_EDEFAULT == null ? paletteCompartment != null : !PALETTE_COMPARTMENT_EDEFAULT.equals(paletteCompartment);
      case SprayPackage.BEHAVIOR__REALIZED_BY:
        return realizedBy != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", paletteCompartment: ");
    result.append(paletteCompartment);
    result.append(')');
    return result.toString();
  }

} //BehaviorImpl
