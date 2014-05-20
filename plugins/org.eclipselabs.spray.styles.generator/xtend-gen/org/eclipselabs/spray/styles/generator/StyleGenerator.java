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
package org.eclipselabs.spray.styles.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.ColorOrGradient;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.GradientAllignment;
import org.eclipselabs.spray.styles.GradientRef;
import org.eclipselabs.spray.styles.HighlightingValues;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.Transparent;
import org.eclipselabs.spray.styles.YesNoBool;
import org.eclipselabs.spray.styles.generator.GradientGenerator;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class StyleGenerator extends FileGenerator<Style> {
  @Inject
  @Extension
  private GradientGenerator gradientGenerator;
  
  public String filepath(final Style s) {
    String _packagePath = this.packagePath(s);
    String _className = this.className(s);
    String _plus = (_packagePath + _className);
    return (_plus + ".java");
  }
  
  public String gapClassName(final Style s) {
    String _name = s.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public String className(final Style s) {
    String _gapClassName = this.gapClassName(s);
    return (_gapClassName + "Base");
  }
  
  public String packageName(final Style s) {
    return ProjectProperties.getStylesPackage();
  }
  
  public String packagePath(final Style s) {
    String _stylesPackage = ProjectProperties.getStylesPackage();
    return ProjectProperties.toPath(_stylesPackage);
  }
  
  public String generate(final Style style, final GenFile genFile) {
    String _xblockexpression = null;
    {
      String _packageName = this.packageName(style);
      String _gapClassName = this.gapClassName(style);
      ((JavaGenFile) genFile).setPackageAndClass(_packageName, _gapClassName);
      _xblockexpression = super.generate(style, genFile);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateBaseFile(final Style style) {
    return this.compile(style);
  }
  
  public CharSequence generateExtensionFile(final Style style) {
    return this.mainExtensionPointFile(style);
  }
  
  public CharSequence mainExtensionPointFile(final Style style) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdextensionHeader(this)\ufffd\ufffd");
    _builder.newLine();
    _builder.append("package \ufffd\ufffdstyle.packageName\ufffd\ufffd;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("public class \ufffd\ufffdstyle.gapClassName\ufffd\ufffd extends \ufffd\ufffdstyle.className\ufffd\ufffd {");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffds.head\ufffd\ufffd");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\ufffd\ufffds.body\ufffd\ufffd");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence head(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Style class for Spray.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package \ufffd\ufffds.packageName\ufffd\ufffd;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Style;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Color;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.ColorConstant;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IColorConstant;");
    _builder.newLine();
    _builder.append("\ufffd\ufffdIF s.superStyle == null\ufffd\ufffd");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("import \ufffd\ufffds.superStyle.qualifiedName\ufffd\ufffd;");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("\ufffd\ufffdIF s.superStyleFromDsl != null\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("import \ufffd\ufffds.packageName\ufffd\ufffd.\ufffd\ufffds.superStyleFromDsl.name\ufffd\ufffd;");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IGradientType;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IPredefinedRenderingStyle;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Style class for Spray.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Description: \ufffd\ufffds.description\ufffd\ufffd");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class \ufffd\ufffds.className\ufffd\ufffd extends \ufffd\ufffds.createSuperStyle\ufffd\ufffd {");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The IGaService instance for the whole class.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method creates and defines a Style and returns it. ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Description: \ufffd\ufffds.description\ufffd\ufffd");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return The defined Style");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Style newStyle(Diagram diagram) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Style style = super.newStyle(diagram);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("style.setId(\"\ufffd\ufffds.name\ufffd\ufffd\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("style.setDescription(\"\ufffd\ufffds.description\ufffd\ufffd\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("defineStyleTransparency(diagram, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("defineBackground(diagram, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("defineLineAttributes(diagram, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("defineFontAttributes(diagram, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return style;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method will be called from the newStyle-method for defining the Style transparency.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param diagram the diagram attribute");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param style the Style attribute, where the transparency will be set.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void defineStyleTransparency(Diagram diagram, Style style) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\ufffd\ufffds.layout.createTransparencyAttributes\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method will be called from the newStyle-method for defining the Style background.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* If a gradient is been used, then a color schema will be set for the background.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param diagram the diagram attribute");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param style the Style attribute, where the background will be set.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void defineBackground(Diagram diagram, Style style) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\ufffd\ufffdIF s.layout.checkColorSchemaNecessary\ufffd\ufffd");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("\ufffd\ufffdsetColorSchema\ufffd\ufffd");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("\ufffd\ufffds.layout.createBackgroundAttributes\ufffd\ufffd");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method will be called from the newStyle-method for defining the Style line attributes.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param diagram the diagram attribute");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param style the Style attribute, where the line attributes will be set.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void defineLineAttributes(Diagram diagram, Style style) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\ufffd\ufffds.layout.createLineAttributes\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method will be called from the newStyle-method for defining the Style font attributes.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param diagram the diagram attribute");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param style the Style attribute, where the font attributes will be set.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void defineFontAttributes(Diagram diagram, Style style) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\ufffd\ufffds.layout.createFontAttributes\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method returns the font color for the style. ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The font color will be returned separatly, because Graphiti allows just the foreground color.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The foreground color will be used for lines and fonts at the same time.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Color getFontColor(Diagram diagram) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\ufffd\ufffds.layout.createFontColor\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method returns Color Schema of the Style");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public AdaptedGradientColoredAreas getColorSchema() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\ufffd\ufffds.layout.createStyleColorSchema(s)\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String createSuperStyle(final Style s) {
    String _xifexpression = null;
    JvmTypeReference _superStyle = s.getSuperStyle();
    boolean _equals = Objects.equal(_superStyle, null);
    if (_equals) {
      String _xifexpression_1 = null;
      Style _superStyleFromDsl = s.getSuperStyleFromDsl();
      boolean _equals_1 = Objects.equal(_superStyleFromDsl, null);
      if (_equals_1) {
        _xifexpression_1 = "org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle";
      } else {
        Style _superStyleFromDsl_1 = s.getSuperStyleFromDsl();
        _xifexpression_1 = _superStyleFromDsl_1.getName();
      }
      _xifexpression = _xifexpression_1;
    } else {
      JvmTypeReference _superStyle_1 = s.getSuperStyle();
      _xifexpression = _superStyle_1.getSimpleName();
    }
    return _xifexpression;
  }
  
  public CharSequence getStyle(final Style s) {
    CharSequence _xifexpression = null;
    JvmTypeReference _superStyle = s.getSuperStyle();
    boolean _equals = Objects.equal(_superStyle, null);
    if (_equals) {
      CharSequence _xifexpression_1 = null;
      Style _superStyleFromDsl = s.getSuperStyleFromDsl();
      boolean _equals_1 = Objects.equal(_superStyleFromDsl, null);
      if (_equals_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("gaService.createStyle(diagram, \"\ufffd\ufffds.name\ufffd\ufffd\");");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("super.getStyle(diagram);");
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("super.getStyle(diagram);");
      _xifexpression = _builder_2;
    }
    return _xifexpression;
  }
  
  public CharSequence createTransparencyAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdIF !(l == null || l.transparency == Double::MIN_VALUE)\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setTransparency(\ufffd\ufffdl.transparency\ufffd\ufffd);");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createBackgroundAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdIF l == null || l.background == null\ufffd\ufffd");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSEIF l.background instanceof Transparent\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setFilled(false);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setBackground(null);");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setFilled(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setBackground(gaService.manageColor(diagram, \ufffd\ufffdl.background.createColorValue\ufffd\ufffd));");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createLineAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdIF l == null || l.lineColor == null\ufffd\ufffd");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSEIF l.lineColor instanceof Transparent\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setLineVisible(false);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setForeground(null);");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setLineVisible(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("style.setForeground(gaService.manageColor(diagram, \ufffd\ufffdl.lineColor.createColorValue\ufffd\ufffd));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\ufffd\ufffdIF l.lineWidth > 0\ufffd\ufffd");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("style.setLineWidth(\ufffd\ufffdMath::max(l.lineWidth, 1)\ufffd\ufffd);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\ufffd\ufffdIF l.lineStyle != LineStyle::NULL\ufffd\ufffd");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("style.setLineStyle(LineStyle.\ufffd\ufffdl.lineStyle.getName\ufffd\ufffd);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createFontAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdIF l == null || l.fontName == null\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String fontName = style.getFont().getName();");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String fontName = \"\ufffd\ufffdl.fontName\ufffd\ufffd\";");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("\ufffd\ufffdIF l == null || l.fontSize == Integer::MIN_VALUE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("int fontSize = style.getFont().getSize();");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("int fontSize = \ufffd\ufffdl.fontSize\ufffd\ufffd;");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("\ufffd\ufffdIF l == null || l.fontItalic == YesNoBool::NULL\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("boolean fontItalic = style.getFont().isItalic();");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("boolean fontItalic = \ufffd\ufffdl.fontItalic.transformYesNoToBoolean\ufffd\ufffd;");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("\ufffd\ufffdIF l == null || l.fontBold == YesNoBool::NULL\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("boolean fontBold = style.getFont().isBold();");
    _builder.newLine();
    _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("boolean fontBold = \ufffd\ufffdl.fontBold.transformYesNoToBoolean\ufffd\ufffd;");
    _builder.newLine();
    _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
    _builder.newLine();
    _builder.append("style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createFontColor(final StyleLayout l) {
    CharSequence _xifexpression = null;
    boolean _or = false;
    boolean _equals = Objects.equal(l, null);
    if (_equals) {
      _or = true;
    } else {
      Color _fontColor = l.getFontColor();
      boolean _equals_1 = Objects.equal(_fontColor, null);
      _or = _equals_1;
    }
    if (_or) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return super.getFontColor(diagram);");
      _xifexpression = _builder;
    } else {
      Color _fontColor_1 = l.getFontColor();
      _xifexpression = this.createFontColor(_fontColor_1);
    }
    return _xifexpression;
  }
  
  public CharSequence createFontColor(final ColorWithTransparency c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("return gaService.manageColor(diagram, \ufffd\ufffdc.createColorValue\ufffd\ufffd);");
    _builder.newLine();
    return _builder;
  }
  
  public String transformYesNoToBoolean(final YesNoBool yesNo) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(yesNo, YesNoBool.YES);
    if (_equals) {
      _xifexpression = "true";
    } else {
      _xifexpression = "false";
    }
    return _xifexpression;
  }
  
  protected CharSequence _createColorValue(final Transparent c) {
    return "null";
  }
  
  protected CharSequence _createColorValue(final ColorConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IColorConstant.\ufffd\ufffdc.value.getName\ufffd\ufffd");
    return _builder;
  }
  
  protected CharSequence _createColorValue(final RGBColor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ColorConstant(\ufffd\ufffdc.red\ufffd\ufffd, \ufffd\ufffdc.green\ufffd\ufffd, \ufffd\ufffdc.blue\ufffd\ufffd)");
    return _builder;
  }
  
  public CharSequence createStyleColorSchema(final StyleLayout l, final Style s) {
    CharSequence _xblockexpression = null;
    {
      GradientAllignment _gradient_orientation = l.getGradient_orientation();
      CharSequence gradientOrientation = this.mapGradientOrientation(_gradient_orientation);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\ufffd\ufffdIF l.checkColorSchemaNecessary == false\ufffd\ufffd");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\ufffd\ufffdELSE\ufffd\ufffd");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("final AdaptedGradientColoredAreas agca =");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("agca.setDefinedStyleId(\"\ufffd\ufffds.createStyleGradientID\ufffd\ufffd\");");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("agca.setGradientType(\ufffd\ufffdgradientOrientation\ufffd\ufffd);");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\ufffd\ufffdIF l.background != null\ufffd\ufffd");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT, \ufffd\ufffdl.background.gradientColoredAreas\ufffd\ufffd);");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\ufffd\ufffdIF l.highlighting != null\ufffd\ufffd");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\ufffd\ufffdIF l.highlighting.selected != null\ufffd\ufffd");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED, \ufffd\ufffdl.highlighting.selected.gradientColoredAreas\ufffd\ufffd);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\ufffd\ufffdIF l.highlighting.multiselected != null\ufffd\ufffd");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED, \ufffd\ufffdl.highlighting.multiselected.gradientColoredAreas\ufffd\ufffd);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\ufffd\ufffdIF l.highlighting.allowed != null\ufffd\ufffd");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_ALLOWED, \ufffd\ufffdl.highlighting.allowed.gradientColoredAreas\ufffd\ufffd);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\ufffd\ufffdIF l.highlighting.unallowed != null\ufffd\ufffd");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_FORBIDDEN, \ufffd\ufffdl.highlighting.unallowed.gradientColoredAreas\ufffd\ufffd);");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("return agca;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence mapGradientOrientation(final GradientAllignment ga) {
    CharSequence _xifexpression = null;
    boolean _equals = Objects.equal(ga, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IGradientType.\ufffd\ufffdGradientAllignment::VERTICAL.getName\ufffd\ufffd");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _equals_1 = Objects.equal(ga, GradientAllignment.HORIZONTAL);
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("IGradientType.\ufffd\ufffdGradientAllignment::HORIZONTAL.getName\ufffd\ufffd");
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("IGradientType.\ufffd\ufffdGradientAllignment::VERTICAL.getName\ufffd\ufffd");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public boolean checkColorSchemaNecessary(final StyleLayout l) {
    boolean _and = false;
    HighlightingValues _highlighting = l.getHighlighting();
    boolean _equals = Objects.equal(_highlighting, null);
    if (!_equals) {
      _and = false;
    } else {
      _and = (!(l.getBackground() instanceof GradientRef));
    }
    if (_and) {
      return false;
    } else {
      return true;
    }
  }
  
  public CharSequence createStyleGradientID(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffds.className\ufffd\ufffd_Color_Schema_ID");
    return _builder;
  }
  
  public CharSequence setColorSchema() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("gaService.setRenderingStyle(style, getColorSchema());");
    return _builder;
  }
  
  protected CharSequence _gradientColoredAreas(final GradientRef cg) {
    CharSequence _xifexpression = null;
    JvmTypeReference _gradientRef = cg.getGradientRef();
    boolean _notEquals = (!Objects.equal(_gradientRef, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("new \ufffd\ufffdcg.gradientRef.qualifiedName\ufffd\ufffd().getGradientColoredAreas( )");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("new \ufffd\ufffdgradientGenerator.packageName(null)\ufffd\ufffd.\ufffd\ufffdcg.gradientRefFromDsl.name\ufffd\ufffd().getGradientColoredAreas( )");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _gradientColoredAreas(final Color cg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("GradientUtilClass.getOneColorGradient(\"\ufffd\ufffdcg.createColorHexValue\ufffd\ufffd\")");
    return _builder;
  }
  
  protected CharSequence _gradientColoredAreas(final Transparent cg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("GradientUtilClass.getOneColorGradient(\ufffd\ufffdcg\ufffd\ufffd)");
    return _builder;
  }
  
  protected CharSequence _createColorHexValue(final ColorConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdGradientUtilClass::colorConstantToHexString(c)\ufffd\ufffd");
    return _builder;
  }
  
  protected CharSequence _createColorHexValue(final RGBColor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdGradientUtilClass::RGBColorToHexString(c)\ufffd\ufffd");
    return _builder;
  }
  
  public CharSequence createColorValue(final EObject c) {
    if (c instanceof ColorConstantRef) {
      return _createColorValue((ColorConstantRef)c);
    } else if (c instanceof RGBColor) {
      return _createColorValue((RGBColor)c);
    } else if (c instanceof Transparent) {
      return _createColorValue((Transparent)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
  
  public CharSequence gradientColoredAreas(final ColorOrGradient cg) {
    if (cg instanceof Color) {
      return _gradientColoredAreas((Color)cg);
    } else if (cg instanceof GradientRef) {
      return _gradientColoredAreas((GradientRef)cg);
    } else if (cg instanceof Transparent) {
      return _gradientColoredAreas((Transparent)cg);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cg).toString());
    }
  }
  
  public CharSequence createColorHexValue(final Color c) {
    if (c instanceof ColorConstantRef) {
      return _createColorHexValue((ColorConstantRef)c);
    } else if (c instanceof RGBColor) {
      return _createColorHexValue((RGBColor)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
