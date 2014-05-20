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
package org.eclipselabs.spray.generator.graphiti.tests;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipselabs.spray.generator.graphiti.SprayGenerator;
import org.eclipselabs.spray.generator.graphiti.tests.InMemoryFilesystemAccessExt;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Ignore;

@Ignore
@SuppressWarnings("all")
public abstract class AbstractSprayGeneratorTest extends XtextTest {
  @Inject
  private SprayGenerator sprayGenerator;
  
  @Inject
  private InMemoryFilesystemAccessExt fsa;
  
  private static InMemoryFilesystemAccessExt filledFsa = null;
  
  public InMemoryFilesystemAccessExt triggerGenerator(final String path) {
    InMemoryFilesystemAccessExt _xblockexpression = null;
    {
      boolean _equals = Objects.equal(AbstractSprayGeneratorTest.filledFsa, null);
      if (_equals) {
        AbstractSprayGeneratorTest.filledFsa = this.fsa;
        final URI uri = URI.createURI(("model/" + path));
        Class<? extends EObject> _rootObjectType = this.getRootObjectType(uri);
        final EObject model = this.loadModel(this.resourceSet, uri, _rootObjectType);
        Resource _eResource = model.eResource();
        this.sprayGenerator.doGenerate(_eResource, AbstractSprayGeneratorTest.filledFsa);
      }
      _xblockexpression = AbstractSprayGeneratorTest.filledFsa;
    }
    return _xblockexpression;
  }
}
