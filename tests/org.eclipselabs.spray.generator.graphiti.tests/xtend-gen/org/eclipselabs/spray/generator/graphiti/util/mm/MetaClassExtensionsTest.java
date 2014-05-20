/**
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 */
package org.eclipselabs.spray.generator.graphiti.util.mm;

import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
@SuppressWarnings("all")
public class MetaClassExtensionsTest {
  @Inject
  private MetaClassExtensions ext;
  
  @Before
  public void setUp() {
  }
  
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasNoCreateBehaviorAndHasNoName__ExpectEClassName() {
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    EClass _eClass = EcorePackage.eINSTANCE.getEClass();
    metaClass.setType(_eClass);
    final String label = this.ext.getCreateFeatureLabel(metaClass);
    Assert.assertEquals("EClass", label);
  }
  
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasNoCreateBehaviorAndHasEmptyName__ExpectEmptyName() {
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    EClass _eClass = EcorePackage.eINSTANCE.getEClass();
    metaClass.setType(_eClass);
    metaClass.setAlias("");
    final String label = this.ext.getCreateFeatureLabel(metaClass);
    Assert.assertEquals("EClass", label);
  }
  
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasCreateBehaviorThatHasName__ExpectBehaviorLabel() {
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    EClass _eClass = EcorePackage.eINSTANCE.getEClass();
    metaClass.setType(_eClass);
    metaClass.setAlias("testName");
    final CreateBehavior createBehavior = SprayFactory.eINSTANCE.createCreateBehavior();
    createBehavior.setLabel("testBehaviorName");
    EList<Behavior> _behaviors = metaClass.getBehaviors();
    _behaviors.add(createBehavior);
    final String label = this.ext.getCreateFeatureLabel(metaClass);
    Assert.assertEquals("testBehaviorName", label);
  }
  
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasCreateBehaviorThatHasNoName__ExpectMetaClassName() {
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    EClass _eClass = EcorePackage.eINSTANCE.getEClass();
    metaClass.setType(_eClass);
    metaClass.setAlias("testName");
    final CreateBehavior createBehavior = SprayFactory.eINSTANCE.createCreateBehavior();
    EList<Behavior> _behaviors = metaClass.getBehaviors();
    _behaviors.add(createBehavior);
    final String label = this.ext.getCreateFeatureLabel(metaClass);
    Assert.assertEquals("testName", label);
  }
  
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasCreateBehaviorThatHasEmptyName__ExpectMetaClassName() {
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    EClass _eClass = EcorePackage.eINSTANCE.getEClass();
    metaClass.setType(_eClass);
    metaClass.setAlias("testName");
    final CreateBehavior createBehavior = SprayFactory.eINSTANCE.createCreateBehavior();
    createBehavior.setLabel("");
    EList<Behavior> _behaviors = metaClass.getBehaviors();
    _behaviors.add(createBehavior);
    final String label = this.ext.getCreateFeatureLabel(metaClass);
    Assert.assertEquals("testName", label);
  }
  
  @Test
  public void testGetCreateFeatureLabel_WhenMetaClassHasNoCreateBehaviorAndHasName__ExpectLabel() {
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    EClass _eClass = EcorePackage.eINSTANCE.getEClass();
    metaClass.setType(_eClass);
    metaClass.setAlias("testName");
    final String label = this.ext.getCreateFeatureLabel(metaClass);
    Assert.assertEquals("testName", label);
  }
  
  @Test
  public void getCreateFeatureDescription() {
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    EClass _eClass = EcorePackage.eINSTANCE.getEClass();
    metaClass.setType(_eClass);
    final String description = this.ext.getCreateFeatureDescription(metaClass);
    Assert.assertEquals("Create new EClass", description);
  }
  
  @Test
  public void getCreateBehavior() {
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    EClass _eClass = EcorePackage.eINSTANCE.getEClass();
    metaClass.setType(_eClass);
    final CreateBehavior behavior = this.ext.getCreateBehavior(metaClass);
    Assert.assertNull(behavior);
  }
}
