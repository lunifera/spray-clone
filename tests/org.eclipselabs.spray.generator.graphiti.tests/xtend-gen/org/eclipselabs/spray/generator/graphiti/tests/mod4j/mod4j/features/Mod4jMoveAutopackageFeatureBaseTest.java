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
public class Mod4jMoveAutopackageFeatureBaseTest extends AbstractSprayGeneratorTest {
  /* @Test
   */public void test() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertTrue is undefined for the type Mod4jMoveAutopackageFeatureBaseTest"
      + "\nThe method assertEquals is undefined for the type Mod4jMoveAutopackageFeatureBaseTest");
  }
  
  private CharSequence expectedContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated by Spray MoveFeature.xtend");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains generated and should not be changed.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Use the extension point class (the direct subclass of this class) to add manual code");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    _builder.append("package org.eclipselabs.spray.examples.mod4j.features;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IRemoveFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IMoveShapeContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.AddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.RemoveContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayFixedLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayTopLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayDiagramLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.examples.mod4j.shapes.;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Mod4jMoveAutopackageFeatureBase extends DefaultMoveShapeFeature {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("SprayLayoutManager layoutManager; ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Mod4jMoveAutopackageFeatureBase(final IFeatureProvider fp) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("layoutManager =  new (fp).getShapeLayout( );");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("     ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("* {@inheritDoc}");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canMoveShape(IMoveShapeContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Shape sourceShape = (Shape) context.getPictogramElement();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape targetContainer = context.getTargetContainer();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object source = getBusinessObjectForPictogramElement(sourceShape );");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object target = getBusinessObjectForPictogramElement(targetContainer);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// check whether it can move in the same container");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if( sourceShape.eContainer() == targetContainer ){");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayFixedLayoutManager)) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayTopLayoutManager)) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayDiagramLayoutManager)) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return super.canMoveShape(context);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* {@inheritDoc}");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void moveShape(IMoveShapeContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("PictogramElement sourceShape = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape targetContainer = context.getTargetContainer();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape sourceContainer = context.getSourceContainer();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object sourceParent = getBusinessObjectForPictogramElement(sourceContainer);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object source = getBusinessObjectForPictogramElement(sourceShape);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object target = getBusinessObjectForPictogramElement(targetContainer);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if( sourceShape.eContainer() == targetContainer ){ ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("super.moveShape(context);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return;   ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
