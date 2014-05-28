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
public class Mod4jCreateAutopackageFeatureBaseTest extends AbstractSprayGeneratorTest {
  /* @Test
   */public void test() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertTrue is undefined for the type Mod4jCreateAutopackageFeatureBaseTest"
      + "\nThe method assertEquals is undefined for the type Mod4jCreateAutopackageFeatureBaseTest");
  }
  
  private CharSequence expectedContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated by Spray CreateShapeFeature.xtend");
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
    _builder.append("import org.eclipse.graphiti.features.context.ICreateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;");
    _builder.newLine();
    _builder.append("import samplepackage.Package;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAreaContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.AddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import null.BusinessDomainDslFactory;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.examples.mod4j.diagram.Mod4jModelService;");
    _builder.newLine();
    _builder.append("import samplepackage.BusinessDomainModel;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Mod4jCreateAutopackageFeatureBase extends AbstractCreateFeature {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected static String TITLE = \"Create \";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected static String USER_QUESTION = \"Enter new  name\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Mod4jModelService modelService;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected samplepackage.Package newClass = null;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Mod4jCreateAutopackageFeatureBase (final IFeatureProvider fp) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// set name and description of the creation feature");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(fp, \"Autopackage\", \"Create new Autopackage\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("modelService = Mod4jModelService.getModelService(fp.getDiagramTypeProvider());");
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
    _builder.append("public boolean canCreate(final ICreateContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// TODO: Respect the cardinality of the containment reference");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (context.getTargetContainer() instanceof Diagram) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} else if (context.getTargetContainer() instanceof ContainerShape) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// And now the new stuff");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
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
    _builder.append("public Object[] create(final ICreateContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("newClass = createAutopackage(context);");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (newClass == null ) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return EMPTY;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// do the add");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("addGraphicalRepresentation(context, newClass);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// activate direct editing after object creation");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("getFeatureProvider().getDirectEditingInfo().setActive(true);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// return newly created business object(s)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new Object[] { newClass };");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("//       org.eclipse.emf.ecore.impl.EReferenceImpl@4f7967de (name: packages) (ordered: true, unique: true, lowerBound: 0, upperBound: -1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: true, resolveProxies: false) ");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("* Creates a new {@link samplepackage.Package} instance and adds it to the containing type.");
    _builder.newLine();
    _builder.append("             ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("protected samplepackage.Package createAutopackage(final ICreateContext context) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("// create Package instance");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("final samplepackage.Package newClass = BusinessDomainDslFactory.eINSTANCE.createPackage();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("// ask user for Autopackage name");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("String newName = SampleUtil.askString(TITLE, USER_QUESTION, \"\", null);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (newName == null || newName.trim().length() == 0) {");
    _builder.newLine();
    _builder.append("                   ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("                   ");
    _builder.append("newClass.setName(newName);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("boolean isContainment = false;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (!isContainment) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("// add the element to containment reference");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("BusinessDomainModel model = modelService.getModel();");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("model.getPackages().add(newClass);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("//              And now the NEW stuff");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return newClass;");
    _builder.newLine();
    _builder.append("            ");
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
    _builder.append("protected PictogramElement addGraphicalRepresentation(final IAreaContext context, final Object newObject) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final AddContext ctx = new AddContext(context, newObject);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ctx.putProperty(PROPERTY_ALIAS, \"Autopackage\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return getFeatureProvider().addIfPossible(ctx);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
