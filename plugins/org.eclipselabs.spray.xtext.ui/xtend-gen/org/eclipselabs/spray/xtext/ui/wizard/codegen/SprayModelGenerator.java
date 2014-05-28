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
package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo;
import org.eclipselabs.spray.xtext.ui.wizard.codegen.PackageHelper;

@SuppressWarnings("all")
public class SprayModelGenerator {
  @Inject
  @Extension
  private PackageHelper _packageHelper;
  
  public void doGenerate(final SprayProjectInfo info, final IFileSystemAccess fsa) {
    String _sprayModelDir = info.getSprayModelDir();
    String _plus = this.operator_plus(_sprayModelDir, "/");
    String _diagramTypeName = info.getDiagramTypeName();
    String _plus_1 = this.operator_plus(_plus, _diagramTypeName);
    String _plus_2 = this.operator_plus(_plus_1, ProjectProperties.SPRAY_FILE_EXTENSION);
    String _projectName = info.getProjectName();
    CharSequence _generateModel = this.generateModel(info);
    fsa.generateFile(_plus_2, _projectName, _generateModel);
    String _sprayModelDir_1 = info.getSprayModelDir();
    String _plus_3 = this.operator_plus(_sprayModelDir_1, "/");
    String _diagramTypeName_1 = info.getDiagramTypeName();
    String _plus_4 = this.operator_plus(_plus_3, _diagramTypeName_1);
    String _plus_5 = this.operator_plus(_plus_4, ProjectProperties.SHAPES_FILE_EXTENSION);
    String _projectName_1 = info.getProjectName();
    CharSequence _generateShapes = this.generateShapes(info);
    fsa.generateFile(_plus_5, _projectName_1, _generateShapes);
    String _sprayModelDir_2 = info.getSprayModelDir();
    String _plus_6 = this.operator_plus(_sprayModelDir_2, "/");
    String _diagramTypeName_2 = info.getDiagramTypeName();
    String _plus_7 = this.operator_plus(_plus_6, _diagramTypeName_2);
    String _plus_8 = this.operator_plus(_plus_7, ProjectProperties.STYLES_FILE_EXTENSION);
    String _projectName_2 = info.getProjectName();
    CharSequence _generateStyles = this.generateStyles(info);
    fsa.generateFile(_plus_8, _projectName_2, _generateStyles);
    String _sprayModelDir_3 = info.getSprayModelDir();
    String _plus_9 = this.operator_plus(_sprayModelDir_3, "/");
    String _plus_10 = this.operator_plus(_plus_9, ProjectProperties.SPRAY_PROPERTY_FILENAME);
    String _projectName_3 = info.getProjectName();
    CharSequence _generateProperties = this.generateProperties(info);
    fsa.generateFile(_plus_10, _projectName_3, _generateProperties);
  }
  
  public String operator_plus(final Object a, final String b) {
    String _string = a.toString();
    return _string.concat(b);
  }
  
  public CharSequence generateModel(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Spray diagram definition");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains the definition of a graphical editor using the Spray Language.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* See also ");
    String _diagramTypeName = info.getDiagramTypeName();
    _builder.append(_diagramTypeName, " ");
    _builder.append(".properties to configure generator properties.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    _builder.append("// Add import statements here");
    _builder.newLine();
    _builder.append("import ");
    String _epackageURI = info.getEpackageURI();
    String _modelTypeName = info.getModelTypeName();
    String _package = this._packageHelper.getPackage(_epackageURI, _modelTypeName);
    _builder.append(_package, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("diagram My");
    String _diagramTypeName_1 = info.getDiagramTypeName();
    _builder.append(_diagramTypeName_1, "");
    _builder.append(" for ");
    String _modelTypeName_1 = info.getModelTypeName();
    String _modelTypeName_2 = info.getModelTypeName();
    int _lastIndexOf = _modelTypeName_2.lastIndexOf(".");
    int _plus = (_lastIndexOf + 1);
    String _substring = _modelTypeName_1.substring(_plus);
    _builder.append(_substring, "");
    _builder.append(" style ");
    String _diagramTypeName_2 = info.getDiagramTypeName();
    String _firstUpper = StringExtensions.toFirstUpper(_diagramTypeName_2);
    _builder.append(_firstUpper, "");
    _builder.append("DefaultStyle");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Add class mappings here. Refer to EClasses here. Don\'t forget to configure a");
    _builder.newLine();
    _builder.append("// dependency to the plugin defining the EMF metamodel in META-INF/MANIFEST.MF.");
    _builder.newLine();
    _builder.append("// It is required to have a genmodel for the metamodel.");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Example class mapping:");
    _builder.newLine();
    _builder.append("//   class BusinessClass icon \"ecore/EClass.gif\" {");
    _builder.newLine();
    _builder.append("//     shape RectangleShape");
    _builder.newLine();
    _builder.append("//     behavior {");
    _builder.newLine();
    _builder.append("//       // Enable create feature for this class and add it to the palette \"Shapes\"");
    _builder.newLine();
    _builder.append("//       create into types palette \"Shapes\";");
    _builder.newLine();
    _builder.append("//     }");
    _builder.newLine();
    _builder.append("//   }");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Example association mapping:");
    _builder.newLine();
    _builder.append("//   class Association icon \"connection16.gif\" {");
    _builder.newLine();
    _builder.append("//     connection ArrowConnection {");
    _builder.newLine();
    _builder.append("//       from source;");
    _builder.newLine();
    _builder.append("//       to target;");
    _builder.newLine();
    _builder.append("//     }");
    _builder.newLine();
    _builder.append("//   }");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateShapes(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Spray shapes definition");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains the definition of graphical figures using the Shapes Language.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Add definition of shapes here.");
    _builder.newLine();
    _builder.append("// shape RectangleShape {");
    _builder.newLine();
    _builder.append("//     rectangle {");
    _builder.newLine();
    _builder.append("//         position(x=0,y=0)");
    _builder.newLine();
    _builder.append("//         size(width=100,height=100)");
    _builder.newLine();
    _builder.append("//     }");
    _builder.newLine();
    _builder.append("// }");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// connection ArrowConnection {");
    _builder.newLine();
    _builder.append("//     placing {");
    _builder.newLine();
    _builder.append("//         position (offset=1.0)");
    _builder.newLine();
    _builder.append("//         polygon {");
    _builder.newLine();
    _builder.append("//             point (x=-10, y=-5)");
    _builder.newLine();
    _builder.append("//             point (x=0, y=0)");
    _builder.newLine();
    _builder.append("//             point (x=-10, y=5)");
    _builder.newLine();
    _builder.append("//             style (background-color=black)");
    _builder.newLine();
    _builder.append("//         }");
    _builder.newLine();
    _builder.append("//     }");
    _builder.newLine();
    _builder.append("// }");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateStyles(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Spray styles definition");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains the definition of style classes using the Styles Language.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Add definition of styles here.");
    _builder.newLine();
    _builder.append("style ");
    String _diagramTypeName = info.getDiagramTypeName();
    String _firstUpper = StringExtensions.toFirstUpper(_diagramTypeName);
    _builder.append(_firstUpper, "");
    _builder.append("DefaultStyle {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("description = \"The default style of the ");
    String _diagramTypeName_1 = info.getDiagramTypeName();
    _builder.append(_diagramTypeName_1, "    ");
    _builder.append(" diagram type.\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// transparency = 0.95");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// background-color = black");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// line-color = black");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// line-style = solid");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// line-width = 1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// font-color = black");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// font-name = \"Tahoma\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("font-size = 12");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// font-bold = yes");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateProperties(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("modelFileExtension = ");
    String _modelFileExtension = info.getModelFileExtension();
    _builder.append(_modelFileExtension, "");
    _builder.newLineIfNotEmpty();
    _builder.append("pluginId        = ");
    String _projectName = info.getProjectName();
    _builder.append(_projectName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("mainPackage     = ");
    String _basePackage = info.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.newLineIfNotEmpty();
    _builder.append("diagramPackage  = ");
    String _basePackage_1 = info.getBasePackage();
    _builder.append(_basePackage_1, "");
    _builder.append(".");
    String _diagramPackage = info.getDiagramPackage();
    _builder.append(_diagramPackage, "");
    _builder.newLineIfNotEmpty();
    _builder.append("featurePackage  = ");
    String _basePackage_2 = info.getBasePackage();
    _builder.append(_basePackage_2, "");
    _builder.append(".");
    String _featurePackage = info.getFeaturePackage();
    _builder.append(_featurePackage, "");
    _builder.newLineIfNotEmpty();
    _builder.append("propertyPackage = ");
    String _basePackage_3 = info.getBasePackage();
    _builder.append(_basePackage_3, "");
    _builder.append(".");
    String _propertyPackage = info.getPropertyPackage();
    _builder.append(_propertyPackage, "");
    _builder.newLineIfNotEmpty();
    _builder.append("stylesPackage   = ");
    String _basePackage_4 = info.getBasePackage();
    _builder.append(_basePackage_4, "");
    _builder.append(".");
    String _stylesPackage = info.getStylesPackage();
    _builder.append(_stylesPackage, "");
    _builder.newLineIfNotEmpty();
    _builder.append("gradientsPackage= ");
    String _basePackage_5 = info.getBasePackage();
    _builder.append(_basePackage_5, "");
    _builder.append(".");
    String _gradientsPackage = info.getGradientsPackage();
    _builder.append(_gradientsPackage, "");
    _builder.newLineIfNotEmpty();
    _builder.append("shapesPackage   = ");
    String _basePackage_6 = info.getBasePackage();
    _builder.append(_basePackage_6, "");
    _builder.append(".");
    String _shapesPackage = info.getShapesPackage();
    _builder.append(_shapesPackage, "");
    _builder.newLineIfNotEmpty();
    _builder.append("utilPackage     = org.eclipselabs.spray.runtime.graphiti.containers");
    _builder.newLine();
    _builder.newLine();
    _builder.append("srcManPath      = ");
    String _javaMainSrcDir = info.getJavaMainSrcDir();
    _builder.append(_javaMainSrcDir, "");
    _builder.newLineIfNotEmpty();
    _builder.append("srcGenPath      = ");
    String _javaGenSrcDir = info.getJavaGenSrcDir();
    _builder.append(_javaGenSrcDir, "");
    _builder.newLineIfNotEmpty();
    _builder.append("resourceManPath = ");
    String _resourceManDir = info.getResourceManDir();
    _builder.append(_resourceManDir, "");
    _builder.newLineIfNotEmpty();
    _builder.append("resourceGenPath = ");
    String _resourceGenDir = info.getResourceGenDir();
    _builder.append(_resourceGenDir, "");
    _builder.newLineIfNotEmpty();
    _builder.append("projectPath     = ./");
    String _projectName_1 = info.getProjectName();
    _builder.append(_projectName_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("headerTimestamp = ");
    boolean _isCreateTimestamp = info.isCreateTimestamp();
    _builder.append(_isCreateTimestamp, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
