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
public class Mod4jDirectEditAutopackageFeatureBaseTest extends AbstractSprayGeneratorTest {
  /* @Test
   */public void test() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertTrue is undefined for the type Mod4jDirectEditAutopackageFeatureBaseTest"
      + "\nThe method assertEquals is undefined for the type Mod4jDirectEditAutopackageFeatureBaseTest");
  }
  
  private CharSequence expectedContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated by Spray DirectEditFeature.xtend");
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
    _builder.append("import org.eclipse.graphiti.features.context.IDirectEditingContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.AbstractText;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractDirectEditingFeature;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Mod4jDirectEditAutopackageFeatureBase extends AbstractDirectEditingFeature {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected IPeService peService = Graphiti.getPeService();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Mod4jDirectEditAutopackageFeatureBase(IFeatureProvider fp) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
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
    _builder.append("public boolean canDirectEdit(IDirectEditingContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("PictogramElement pe = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object bo = getBusinessObjectForPictogramElement(pe);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("GraphicsAlgorithm ga = context.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// support direct editing, if it is a samplepackage.Package, and the user clicked");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// directly on the text and not somewhere else in the rectangle");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (bo instanceof samplepackage.Package && ga instanceof AbstractText) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// direct editing not supported in all other cases");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
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
    _builder.append("public String getInitialValue(IDirectEditingContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// return the initial value of the clicked text on the samplepackage.Package");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("PictogramElement pe = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("samplepackage.Package eClass = (samplepackage.Package) getBusinessObjectForPictogramElement(pe);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AbstractText gAlg = (AbstractText) context.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String id = peService.getPropertyValue(gAlg, TEXT_ID);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return \"\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
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
    _builder.append("public int getEditingType() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return TYPE_TEXT;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
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
    _builder.append("public void setValue(final String value, final IDirectEditingContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// set the new value on the samplepackage.Package");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final PictogramElement pe = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("samplepackage.Package eClass = (samplepackage.Package) getBusinessObjectForPictogramElement(pe);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AbstractText gAlg = (AbstractText) context.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String id = peService.getPropertyValue(gAlg, TEXT_ID);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("updatePictogramElement(pe);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
