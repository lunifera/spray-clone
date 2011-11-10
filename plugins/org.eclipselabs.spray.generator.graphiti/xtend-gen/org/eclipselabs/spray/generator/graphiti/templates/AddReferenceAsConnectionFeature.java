package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.Layout;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

@SuppressWarnings("all")
public class AddReferenceAsConnectionFeature extends FileGenerator {
  @Inject
  private SprayExtensions _sprayExtensions;
  
  @Inject
  private LayoutExtensions _layoutExtensions;
  
  @Inject
  private GenModelHelper _genModelHelper;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((MetaReference) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((MetaReference) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final MetaReference metaReference, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final MetaReference reference, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    EReference _reference = reference.getReference();
    final EReference target = _reference;
    _builder.newLineIfNotEmpty();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddConnectionContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.AbstractAddFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.AnchorContainer;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Connection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Polyline;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeCreateService;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends  AbstractAddFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public PictogramElement add(IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("IAddConnectionContext addConContext = (IAddConnectionContext) context;");
    _builder.newLine();
    _builder.append("        ");
    MetaClass _metaClass = reference.getMetaClass();
    EClass _type = _metaClass.getType();
    String _javaInterfaceName = this._genModelHelper.getJavaInterfaceName(_type);
    String _shortName = this.shortName(_javaInterfaceName);
    _builder.append(_shortName, "        ");
    _builder.append(" addedDomainObject = (");
    MetaClass _metaClass_1 = reference.getMetaClass();
    String _name = this._sprayExtensions.getName(_metaClass_1);
    _builder.append(_name, "        ");
    _builder.append(") context.getNewObject();");
    _builder.newLineIfNotEmpty();
    {
      int _upperBound = target.getUpperBound();
      boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)_upperBound), ((Integer)1));
      if (_operator_equals) {
        _builder.append("    ");
        _builder.append("removeExisting(context);");
        _builder.newLine();
      }
    }
    _builder.append("        ");
    _builder.append("IPeCreateService peCreateService = Graphiti.getPeCreateService();");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// CONNECTION WITH POLYLINE");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Connection connection = peCreateService.createFreeFormConnection(getDiagram());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("connection.setStart(addConContext.getSourceAnchor());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("connection.setEnd(addConContext.getTargetAnchor());");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// TRY");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AnchorContainer parent = connection.getStart().getParent();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object start = getBusinessObjectForPictogramElement(parent);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AnchorContainer child = connection.getEnd().getParent();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object end = getBusinessObjectForPictogramElement(child);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("//END TRY");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Polyline polyline = gaService.createPolyline(connection);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("polyline.setLineWidth(");
    Connection _representedBy = reference.getRepresentedBy();
    Layout _layout = _representedBy.getLayout();
    int _lineWidth = _layout.getLineWidth();
    _builder.append(_lineWidth, "        ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("polyline.setForeground(manageColor(");
    String _lineColor = this._layoutExtensions.lineColor(reference);
    _builder.append(_lineColor, "        ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// create link and wire it");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Graphiti.getPeService().setPropertyValue(connection, \"MODEL_TYPE\", \"");
    MetaClass _metaClass_2 = reference.getMetaClass();
    String _name_1 = this._sprayExtensions.getName(_metaClass_2);
    _builder.append(_name_1, "        ");
    _builder.append(".");
    String _name_2 = target.getName();
    _builder.append(_name_2, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("Graphiti.getPeService().setPropertyValue(connection, \"REFERENCE\", (String)context.getProperty(\"REFERENCE\"));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Graphiti.getPeService().setPropertyValue(connection, \"TARGETOBJECT\", (String)context.getProperty(\"TARGETOBJECT\"));");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("//       link(connection, addedDomainObject);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// add static graphical decorator");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ConnectionDecorator cd;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);");
    _builder.newLine();
    _builder.append("//      No arraows");
    _builder.newLine();
    _builder.append("//        createArrow(cd);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return connection;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canAdd(IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// return true if given business object is an ");
    MetaClass _metaClass_3 = reference.getMetaClass();
    String _name_3 = this._sprayExtensions.getName(_metaClass_3);
    _builder.append(_name_3, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// note, that the context must be an instance of IAddConnectionContext");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (context instanceof IAddConnectionContext");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("&& context.getNewObject() instanceof ");
    MetaClass _metaClass_4 = reference.getMetaClass();
    String _name_4 = this._sprayExtensions.getName(_metaClass_4);
    _builder.append(_name_4, "            ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void removeExisting(IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("IAddConnectionContext addConContext = (IAddConnectionContext) context;");
    _builder.newLine();
    _builder.append("        ");
    MetaClass _metaClass_5 = reference.getMetaClass();
    String _name_5 = this._sprayExtensions.getName(_metaClass_5);
    _builder.append(_name_5, "        ");
    _builder.append(" addedDomainObject = (");
    MetaClass _metaClass_6 = reference.getMetaClass();
    String _name_6 = this._sprayExtensions.getName(_metaClass_6);
    _builder.append(_name_6, "        ");
    _builder.append(") context.getNewObject();");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("Object[] pictogramElements = Graphiti.getPeService().getLinkedPictogramElements(new EObject[] { addedDomainObject }, getDiagram());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (Object pict : pictogramElements) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if( pict instanceof PictogramElement){");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("PictogramElement p = (PictogramElement)pict;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("String reference = Graphiti.getPeService().getPropertyValue(p, \"REFERENCE\");");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if( \"");
    String _name_7 = this._sprayExtensions.getName(reference);
    _builder.append(_name_7, "                ");
    _builder.append("\".equals(reference)){");
    _builder.newLineIfNotEmpty();
    _builder.append("                    ");
    _builder.append("Graphiti.getPeService().deletePictogramElement(p) ;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Polyline polyline = Graphiti.getGaCreateService().createPolyline(gaContainer, new int[] { -15, 10, 0, 0, -15, -10 });");
    _builder.newLine();
    _builder.append("//        polyline.setStyle(StyleUtil.getStyleForEClass(getDiagram()));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("polyline.setLineWidth(");
    Connection _representedBy_1 = reference.getRepresentedBy();
    Layout _layout_1 = _representedBy_1.getLayout();
    int _lineWidth_1 = _layout_1.getLineWidth();
    _builder.append(_lineWidth_1, "        ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("polyline.setForeground(manageColor(");
    String _lineColor_1 = this._layoutExtensions.lineColor(reference);
    _builder.append(_lineColor_1, "        ");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return polyline;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean hasDoneChanges() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canUndo(IContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
