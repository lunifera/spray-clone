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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.BehaviorGroup;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.mm.spray.SprayStyleRef;

import org.eclipselabs.spray.styles.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getBehaviorGroups <em>Behavior Groups</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getHasStyle <em>Has Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.mm.spray.impl.MetaClassImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaClassImpl extends MinimalEObjectImpl.Container implements MetaClass
{
  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getRepresentedBy() <em>Represented By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresentedBy()
   * @generated
   * @ordered
   */
  protected ShapeInSpray representedBy;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<MetaReference> references;

  /**
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviors()
   * @generated
   * @ordered
   */
  protected EList<Behavior> behaviors;

  /**
   * The cached value of the '{@link #getBehaviorGroups() <em>Behavior Groups</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviorGroups()
   * @generated
   * @ordered
   */
  protected EList<BehaviorGroup> behaviorGroups;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EClass type;

  /**
   * The cached value of the '{@link #getHasStyle() <em>Has Style</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasStyle()
   * @generated
   * @ordered
   */
  protected Style hasStyle;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected SprayStyleRef style;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaClassImpl()
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
    return SprayPackage.Literals.META_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeInSpray getRepresentedBy()
  {
    return representedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepresentedBy(ShapeInSpray newRepresentedBy, NotificationChain msgs)
  {
    ShapeInSpray oldRepresentedBy = representedBy;
    representedBy = newRepresentedBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__REPRESENTED_BY, oldRepresentedBy, newRepresentedBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepresentedBy(ShapeInSpray newRepresentedBy)
  {
    if (newRepresentedBy != representedBy)
    {
      NotificationChain msgs = null;
      if (representedBy != null)
        msgs = ((InternalEObject)representedBy).eInverseRemove(this, SprayPackage.SHAPE_IN_SPRAY__REPRESENTS, ShapeInSpray.class, msgs);
      if (newRepresentedBy != null)
        msgs = ((InternalEObject)newRepresentedBy).eInverseAdd(this, SprayPackage.SHAPE_IN_SPRAY__REPRESENTS, ShapeInSpray.class, msgs);
      msgs = basicSetRepresentedBy(newRepresentedBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__REPRESENTED_BY, newRepresentedBy, newRepresentedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagram getDiagram()
  {
    if (eContainerFeatureID() != SprayPackage.META_CLASS__DIAGRAM) return null;
    return (Diagram)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagram basicGetDiagram()
  {
    if (eContainerFeatureID() != SprayPackage.META_CLASS__DIAGRAM) return null;
    return (Diagram)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newDiagram, SprayPackage.META_CLASS__DIAGRAM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiagram(Diagram newDiagram)
  {
    if (newDiagram != eInternalContainer() || (eContainerFeatureID() != SprayPackage.META_CLASS__DIAGRAM && newDiagram != null))
    {
      if (EcoreUtil.isAncestor(this, newDiagram))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newDiagram != null)
        msgs = ((InternalEObject)newDiagram).eInverseAdd(this, SprayPackage.DIAGRAM__META_CLASSES, Diagram.class, msgs);
      msgs = basicSetDiagram(newDiagram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__DIAGRAM, newDiagram, newDiagram));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetaReference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentWithInverseEList<MetaReference>(MetaReference.class, this, SprayPackage.META_CLASS__REFERENCES, SprayPackage.META_REFERENCE__META_CLASS);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Behavior> getBehaviors()
  {
    if (behaviors == null)
    {
      behaviors = new EObjectContainmentWithInverseEList<Behavior>(Behavior.class, this, SprayPackage.META_CLASS__BEHAVIORS, SprayPackage.BEHAVIOR__META_CLASS);
    }
    return behaviors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviorGroup> getBehaviorGroups()
  {
    if (behaviorGroups == null)
    {
      behaviorGroups = new EObjectResolvingEList<BehaviorGroup>(BehaviorGroup.class, this, SprayPackage.META_CLASS__BEHAVIOR_GROUPS);
    }
    return behaviorGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (EClass)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.META_CLASS__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EClass newType)
  {
    EClass oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style getHasStyle()
  {
    if (hasStyle != null && hasStyle.eIsProxy())
    {
      InternalEObject oldHasStyle = (InternalEObject)hasStyle;
      hasStyle = (Style)eResolveProxy(oldHasStyle);
      if (hasStyle != oldHasStyle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SprayPackage.META_CLASS__HAS_STYLE, oldHasStyle, hasStyle));
      }
    }
    return hasStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style basicGetHasStyle()
  {
    return hasStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasStyle(Style newHasStyle)
  {
    Style oldHasStyle = hasStyle;
    hasStyle = newHasStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__HAS_STYLE, oldHasStyle, hasStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SprayStyleRef getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(SprayStyleRef newStyle, NotificationChain msgs)
  {
    SprayStyleRef oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__STYLE, oldStyle, newStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(SprayStyleRef newStyle)
  {
    if (newStyle != style)
    {
      NotificationChain msgs = null;
      if (style != null)
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.META_CLASS__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SprayPackage.META_CLASS__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SprayPackage.META_CLASS__STYLE, newStyle, newStyle));
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
      case SprayPackage.META_CLASS__REPRESENTED_BY:
        if (representedBy != null)
          msgs = ((InternalEObject)representedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SprayPackage.META_CLASS__REPRESENTED_BY, null, msgs);
        return basicSetRepresentedBy((ShapeInSpray)otherEnd, msgs);
      case SprayPackage.META_CLASS__DIAGRAM:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetDiagram((Diagram)otherEnd, msgs);
      case SprayPackage.META_CLASS__REFERENCES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
      case SprayPackage.META_CLASS__BEHAVIORS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehaviors()).basicAdd(otherEnd, msgs);
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
      case SprayPackage.META_CLASS__REPRESENTED_BY:
        return basicSetRepresentedBy(null, msgs);
      case SprayPackage.META_CLASS__DIAGRAM:
        return basicSetDiagram(null, msgs);
      case SprayPackage.META_CLASS__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
      case SprayPackage.META_CLASS__BEHAVIORS:
        return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
      case SprayPackage.META_CLASS__STYLE:
        return basicSetStyle(null, msgs);
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
      case SprayPackage.META_CLASS__DIAGRAM:
        return eInternalContainer().eInverseRemove(this, SprayPackage.DIAGRAM__META_CLASSES, Diagram.class, msgs);
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
      case SprayPackage.META_CLASS__ALIAS:
        return getAlias();
      case SprayPackage.META_CLASS__REPRESENTED_BY:
        return getRepresentedBy();
      case SprayPackage.META_CLASS__DIAGRAM:
        if (resolve) return getDiagram();
        return basicGetDiagram();
      case SprayPackage.META_CLASS__REFERENCES:
        return getReferences();
      case SprayPackage.META_CLASS__ICON:
        return getIcon();
      case SprayPackage.META_CLASS__BEHAVIORS:
        return getBehaviors();
      case SprayPackage.META_CLASS__BEHAVIOR_GROUPS:
        return getBehaviorGroups();
      case SprayPackage.META_CLASS__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SprayPackage.META_CLASS__HAS_STYLE:
        if (resolve) return getHasStyle();
        return basicGetHasStyle();
      case SprayPackage.META_CLASS__STYLE:
        return getStyle();
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
      case SprayPackage.META_CLASS__ALIAS:
        setAlias((String)newValue);
        return;
      case SprayPackage.META_CLASS__REPRESENTED_BY:
        setRepresentedBy((ShapeInSpray)newValue);
        return;
      case SprayPackage.META_CLASS__DIAGRAM:
        setDiagram((Diagram)newValue);
        return;
      case SprayPackage.META_CLASS__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends MetaReference>)newValue);
        return;
      case SprayPackage.META_CLASS__ICON:
        setIcon((String)newValue);
        return;
      case SprayPackage.META_CLASS__BEHAVIORS:
        getBehaviors().clear();
        getBehaviors().addAll((Collection<? extends Behavior>)newValue);
        return;
      case SprayPackage.META_CLASS__BEHAVIOR_GROUPS:
        getBehaviorGroups().clear();
        getBehaviorGroups().addAll((Collection<? extends BehaviorGroup>)newValue);
        return;
      case SprayPackage.META_CLASS__TYPE:
        setType((EClass)newValue);
        return;
      case SprayPackage.META_CLASS__HAS_STYLE:
        setHasStyle((Style)newValue);
        return;
      case SprayPackage.META_CLASS__STYLE:
        setStyle((SprayStyleRef)newValue);
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
      case SprayPackage.META_CLASS__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case SprayPackage.META_CLASS__REPRESENTED_BY:
        setRepresentedBy((ShapeInSpray)null);
        return;
      case SprayPackage.META_CLASS__DIAGRAM:
        setDiagram((Diagram)null);
        return;
      case SprayPackage.META_CLASS__REFERENCES:
        getReferences().clear();
        return;
      case SprayPackage.META_CLASS__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case SprayPackage.META_CLASS__BEHAVIORS:
        getBehaviors().clear();
        return;
      case SprayPackage.META_CLASS__BEHAVIOR_GROUPS:
        getBehaviorGroups().clear();
        return;
      case SprayPackage.META_CLASS__TYPE:
        setType((EClass)null);
        return;
      case SprayPackage.META_CLASS__HAS_STYLE:
        setHasStyle((Style)null);
        return;
      case SprayPackage.META_CLASS__STYLE:
        setStyle((SprayStyleRef)null);
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
      case SprayPackage.META_CLASS__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case SprayPackage.META_CLASS__REPRESENTED_BY:
        return representedBy != null;
      case SprayPackage.META_CLASS__DIAGRAM:
        return basicGetDiagram() != null;
      case SprayPackage.META_CLASS__REFERENCES:
        return references != null && !references.isEmpty();
      case SprayPackage.META_CLASS__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case SprayPackage.META_CLASS__BEHAVIORS:
        return behaviors != null && !behaviors.isEmpty();
      case SprayPackage.META_CLASS__BEHAVIOR_GROUPS:
        return behaviorGroups != null && !behaviorGroups.isEmpty();
      case SprayPackage.META_CLASS__TYPE:
        return type != null;
      case SprayPackage.META_CLASS__HAS_STYLE:
        return hasStyle != null;
      case SprayPackage.META_CLASS__STYLE:
        return style != null;
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
    result.append(" (alias: ");
    result.append(alias);
    result.append(", icon: ");
    result.append(icon);
    result.append(')');
    return result.toString();
  }

} //MetaClassImpl
