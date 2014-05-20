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
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
@SuppressWarnings("all")
public class MetaReferenceExtensionsTest {
  @Inject
  private MetaReferenceExtensions sut;
  
  @Test
  public void testGetDiagram() {
    final Diagram diagram = SprayFactory.eINSTANCE.createDiagram();
    final MetaClass metaClass = SprayFactory.eINSTANCE.createMetaClass();
    final MetaReference reference = SprayFactory.eINSTANCE.createMetaReference();
    EList<MetaReference> _references = metaClass.getReferences();
    _references.add(reference);
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    _metaClasses.add(metaClass);
    final Diagram foundDiagram = this.sut.getDiagram(reference);
    Assert.assertNotNull("found diagram", foundDiagram);
    Assert.assertEquals("found expected diagram", foundDiagram, diagram);
  }
  
  @Test
  public void testGetDiagram_WhenReferenceHasNoDiagramInHierarchy__ExpectNoDiagram() {
    final MetaReference reference = SprayFactory.eINSTANCE.createMetaReference();
    final Diagram foundDiagram = this.sut.getDiagram(reference);
    Assert.assertNull("found no diagram", foundDiagram);
  }
}
