package org.eclipselabs.spray.generator.graphiti.tests.mod4j.mod4j.property;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.generator.graphiti.tests.AbstractSprayGeneratorTest;
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider;

/* @RunWith(XtextRunner2.class) */@InjectWith(SprayTestsInjectorProvider.class)
@SuppressWarnings("all")
public class BusinessRuleNameSectionBaseTest extends AbstractSprayGeneratorTest {
  /* @Test
   */public void test() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertTrue is undefined for the type BusinessRuleNameSectionBaseTest"
      + "\nThe method assertEquals is undefined for the type BusinessRuleNameSectionBaseTest");
  }
  
  private CharSequence expectedContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated by Spray PropertySection.xtend");
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
    _builder.append("package org.eclipselabs.spray.examples.mod4j.property;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.transaction.RecordingCommand;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.transaction.TransactionalEditingDomain;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.platform.GFPropertySection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;");
    _builder.newLine();
    _builder.append("import org.eclipse.jface.action.IStatusLineManager;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.SWT;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.custom.CLabel;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.FocusEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.FocusListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.ModifyEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.ModifyListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionAdapter;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.FormAttachment;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.FormData;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Composite;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Text;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.custom.CCombo;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import samplepackage.ModelElement;");
    _builder.newLine();
    _builder.append("import samplepackage.ModelElement;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class BusinessRuleNameSectionBase extends GFPropertySection implements ITabbedPropertyConstants {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ModelElement bc = null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Text         nameWidget;");
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
    _builder.append("public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.createControls(parent, tabbedPropertySheetPage);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final Composite composite = factory.createFlatFormComposite(parent);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("FormData data;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("nameWidget = factory.createText(composite, \"\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data = new FormData();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.right = new FormAttachment(100, 0);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.top = new FormAttachment(0, VSPACE);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("nameWidget.setLayoutData(data);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("CLabel valueLabel = factory.createCLabel(composite, \"Name\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data = new FormData();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.left = new FormAttachment(0, 0);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.right = new FormAttachment(nameWidget, -HSPACE);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("data.top = new FormAttachment(nameWidget, 0, SWT.CENTER);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("valueLabel.setLayoutData(data);");
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
    _builder.append("public void refresh() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("nameWidget.removeModifyListener(nameListener);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final PictogramElement pe = getSelectedPictogramElement();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (pe != null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final EObject bo = (EObject) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// the filter assured, that it is a ModelElement");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (bo == null)");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("bc = (ModelElement) bo;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("String value = \"\";");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("value = bc.getName();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("nameWidget.setText(value == null ? \"\" : value);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("nameWidget.addModifyListener(nameListener);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ModifyListener nameListener = new ModifyListener() {");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("public void modifyText(ModifyEvent arg0) {");
    _builder.newLine();
    _builder.append("                                                ");
    _builder.append("TransactionalEditingDomain editingDomain = getDiagramEditor().getEditingDomain();");
    _builder.newLine();
    _builder.append("                                                ");
    _builder.append("editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {");
    _builder.newLine();
    _builder.append("                                                    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("                                                    ");
    _builder.append("protected void doExecute() {");
    _builder.newLine();
    _builder.append("                                                        ");
    _builder.append("changePropertyValue();");
    _builder.newLine();
    _builder.append("                                                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                                                ");
    _builder.append("});");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void changePropertyValue() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String newValue = nameWidget.getText();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!newValue.equals(bc.getName())) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("bc.setName(newValue);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
