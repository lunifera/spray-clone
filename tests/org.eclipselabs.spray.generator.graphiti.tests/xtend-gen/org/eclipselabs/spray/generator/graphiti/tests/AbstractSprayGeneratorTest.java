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

import javax.inject.Inject;
import org.eclipselabs.spray.generator.graphiti.SprayGenerator;
import org.eclipselabs.spray.generator.graphiti.tests.InMemoryFilesystemAccessExt;

/* @Ignore
 */@SuppressWarnings("all")
public abstract class AbstractSprayGeneratorTest /* implements XtextTest  */{
  @Inject
  private SprayGenerator sprayGenerator;
  
  @Inject
  private InMemoryFilesystemAccessExt fsa;
  
  private static InMemoryFilesystemAccessExt filledFsa = null;
  
  public InMemoryFilesystemAccessExt triggerGenerator(final String path) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method loadModel is undefined for the type AbstractSprayGeneratorTest"
      + "\nThe method or field resourceSet is undefined for the type AbstractSprayGeneratorTest"
      + "\nThe method getRootObjectType is undefined for the type AbstractSprayGeneratorTest"
      + "\neResource cannot be resolved");
  }
}
