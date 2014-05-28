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
package org.eclipselabs.spray.generator.graphiti.tests.mod4j.mod4j.features;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.generator.graphiti.tests.AbstractSprayGeneratorTest;
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider;

/* @RunWith(XtextRunner2.class) */@InjectWith(SprayTestsInjectorProvider.class)
@SuppressWarnings("all")
public class Mod4jResizeSimpleClassFeatureBaseTest extends AbstractSprayGeneratorTest {
  /* @Test
   */public void test() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertTrue is undefined for the type Mod4jResizeSimpleClassFeatureBaseTest"
      + "\nThe method assertEquals is undefined for the type Mod4jResizeSimpleClassFeatureBaseTest");
  }
  
  private CharSequence expectedContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("* Generated by Spray ResizeFeature.xtend");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("* This file contains generated and should not be changed.");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("* Use the extension point class (the direct subclass of this class) to add manual code");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    _builder.append("package org.eclipselabs.spray.examples.mod4j.features;");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IResizeConfiguration;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IResizeShapeContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.DefaultResizeConfiguration;");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultResizeShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.examples.mod4j.shapes.;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Mod4jResizeSimpleClassFeatureBase extends DefaultResizeShapeFeature {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SprayLayoutManager layoutManager; ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Mod4jResizeSimpleClassFeatureBase(final IFeatureProvider fp) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("layoutManager =  new (fp).getShapeLayout( );");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("public class ResizeConfiguration_null extends DefaultResizeConfiguration  {");
    _builder.newLine();
    _builder.append("                 ");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("public boolean isHorizontalResizeAllowed() {");
    _builder.newLine();
    _builder.append("                 \t\t");
    _builder.append("return layoutManager.isStretchHorizontal( );");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                 ");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("public boolean isVerticalResizeAllowed() {");
    _builder.newLine();
    _builder.append("                 \t\t");
    _builder.append("return layoutManager.isStretchVertical( );");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                 ");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                             ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("                              ");
    _builder.append("* {@inheritDoc}");
    _builder.newLine();
    _builder.append("                              ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("                             ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("public IResizeConfiguration getResizeConfiguration(IResizeShapeContext context) {");
    _builder.newLine();
    _builder.append("                 \t");
    _builder.append("return new ResizeConfiguration_null( );");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
