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

import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipselabs.spray.xtext.generator.IPostProcessor;

@SuppressWarnings("all")
public class InMemoryFilesystemAccessExt extends InMemoryFileSystemAccess {
  @Inject
  @Named("java")
  private IPostProcessor javaPostProcessor;
  
  @Inject
  private IOutputConfigurationProvider configurationProvider;
  
  private boolean init;
  
  public void generateFile(final String fileName, final String outputConfigName, final CharSequence contents) {
    if ((!this.init)) {
      this.initOutputConfigurations();
      this.init = true;
    }
    CharSequence localContents = contents;
    boolean _accepts = this.javaPostProcessor.accepts(fileName);
    if (_accepts) {
      CharSequence _process = this.javaPostProcessor.process(fileName, contents);
      localContents = _process;
    }
    super.generateFile(fileName, outputConfigName, localContents);
  }
  
  private void initOutputConfigurations() {
    Set<OutputConfiguration> _outputConfigurations = this.configurationProvider.getOutputConfigurations();
    for (final OutputConfiguration out : _outputConfigurations) {
      Map<String,OutputConfiguration> _outputConfigurations_1 = this.getOutputConfigurations();
      String _name = out.getName();
      _outputConfigurations_1.put(_name, out);
    }
  }
}
