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
package org.eclipselabs.spray.styles.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.styles.generator.StylesGenerator;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(/* name is null */)/* 
@XpectSetup(/* name is null */)
@XpectTestFiles( */
@Ignore("Not working as there are customization to the output configuration")
@SuppressWarnings("all")
public class StyleXpectGeneratorTest {
  @Inject
  @Extension
  private StylesGenerator generator;
  
  public /* InMemoryFileSystemAccessFormatter */Object createInMemoryFileSystemAccessFormatter() {
    throw new Error("Unresolved compilation problems:"
      + "\nInMemoryFileSystemAccessFormatter cannot be resolved.");
  }
  
  /* @Xpect
  @ParameterParser(
   */public void generated(/* @StringExpectation  */final /* IStringExpectation */Object expectation, /* @ThisResource  */final XtextResource resource, final String arg2) {
    throw new Error("Unresolved compilation problems:"
      + "\nincludeOnlyFileNamesEndingWith cannot be resolved"
      + "\napply cannot be resolved"
      + "\nassertEquals cannot be resolved");
  }
}
