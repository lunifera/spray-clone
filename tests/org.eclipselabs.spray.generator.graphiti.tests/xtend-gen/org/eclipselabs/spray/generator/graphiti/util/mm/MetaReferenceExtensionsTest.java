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
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions;

/* @RunWith(XtextRunner2.class) */@InjectWith(SprayTestsInjectorProvider.class)
@SuppressWarnings("all")
public class MetaReferenceExtensionsTest {
  @Inject
  private MetaReferenceExtensions sut;
  
  /* @Test
   */public Object testGetDiagram() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNotNull is undefined for the type MetaReferenceExtensionsTest"
      + "\nThe method assertEquals is undefined for the type MetaReferenceExtensionsTest");
  }
  
  /* @Test
   */public Object testGetDiagram_WhenReferenceHasNoDiagramInHierarchy__ExpectNoDiagram() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertNull is undefined for the type MetaReferenceExtensionsTest");
  }
}
