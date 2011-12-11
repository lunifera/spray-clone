package org.eclipselabs.spray.generator.graphiti;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipselabs.spray.generator.graphiti.SprayGraphitiGenerator;

@SuppressWarnings("all")
public class SprayGenerator implements IGenerator {
  @Inject
  private SprayGraphitiGenerator graphitiGenerator;
  
  @Inject
  private JvmModelGenerator jvmModelGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      this.jvmModelGenerator.doGenerate(resource, fsa);
      this.graphitiGenerator.doGenerate(resource, fsa);
  }
}
