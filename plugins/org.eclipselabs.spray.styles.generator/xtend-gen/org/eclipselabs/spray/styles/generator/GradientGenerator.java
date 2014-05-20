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

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientColorArea;
import org.eclipselabs.spray.styles.GradientLayout;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class GradientGenerator extends FileGenerator<Gradient> {
  public String filepath(final Gradient g) {
    String _packagePath = this.packagePath(g);
    String _className = this.className(g);
    String _plus = (_packagePath + _className);
    return (_plus + ".java");
  }
  
  public String gapClassName(final Gradient g) {
    String _name = g.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public String className(final Gradient g) {
    String _name = g.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "Base");
  }
  
  public String packageName(final Gradient s) {
    return ProjectProperties.getGradientsPackage();
  }
  
  public String packagePath(final Gradient s) {
    String _gradientsPackage = ProjectProperties.getGradientsPackage();
    return ProjectProperties.toPath(_gradientsPackage);
  }
  
  private int elementIndex = 0;
  
  public String generate(final Gradient gradient, final GenFile genFile) {
    String _xblockexpression = null;
    {
      String _packageName = this.packageName(gradient);
      String _gapClassName = this.gapClassName(gradient);
      ((JavaGenFile) genFile).setPackageAndClass(_packageName, _gapClassName);
      _xblockexpression = super.generate(gradient, genFile);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateBaseFile(final Gradient gradient) {
    return this.compile(gradient);
  }
  
  public CharSequence generateExtensionFile(final Gradient gradient) {
    return this.mainExtensionPointFile(gradient);
  }
  
  public CharSequence mainExtensionPointFile(final Gradient gradient) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdextensionHeader(this)\ufffd\ufffd");
    _builder.newLine();
    _builder.append("package \ufffd\ufffdgradient.packageName\ufffd\ufffd;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("public class \ufffd\ufffdgradient.gapClassName\ufffd\ufffd extends \ufffd\ufffdgradient.className\ufffd\ufffd {");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compile(final Gradient g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdg.head\ufffd\ufffd");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\ufffd\ufffdg.body\ufffd\ufffd");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence head(final Gradient g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Gradient class for Spray.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package \ufffd\ufffdg.packageName\ufffd\ufffd;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.EList;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.LocationType;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IGradientType;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IPredefinedRenderingStyle;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.PredefinedColoredAreas;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final Gradient g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Description: \ufffd\ufffdg.description\ufffd\ufffd");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class \ufffd\ufffdg.className\ufffd\ufffd extends PredefinedColoredAreas implements ISprayGradient {");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method returns the gradient color area.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Description: \ufffd\ufffdg.description\ufffd\ufffd");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public GradientColoredAreas getGradientColoredAreas( ) {");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("final GradientColoredAreas gradientColoredAreas = org.eclipse.graphiti.mm.algorithms.styles.StylesFactory.eINSTANCE.createGradientColoredAreas();");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("final EList<org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("\ufffd\ufffdg.layout.createColorAreas\ufffd\ufffd");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("return gradientColoredAreas;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createColorAreas(final GradientLayout l) {
    CharSequence _xblockexpression = null;
    {
      EList<GradientColorArea> _area = l.getArea();
      final Function1<GradientColorArea,Double> _function = new Function1<GradientColorArea,Double>() {
        public Double apply(final GradientColorArea entity) {
          return Double.valueOf(entity.getOffset());
        }
      };
      IterableExtensions.<GradientColorArea, Double>sortBy(_area, _function);
      this.elementIndex = (-1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\ufffd\ufffdFOR element : l.area\ufffd\ufffd");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\ufffd\ufffdIF(increaseCounter < l.area.size - 1)\ufffd\ufffd");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\ufffd\ufffdcreateArea(element,l.area.get(elementIndex+1))\ufffd\ufffd");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\ufffd\ufffdELSEIF(l.area.size == 1)\ufffd\ufffd");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\ufffd\ufffdENDIF\ufffd\ufffd");
      _builder.newLine();
      _builder.append("      \t");
      _builder.append("\ufffd\ufffdENDFOR\ufffd\ufffd");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createArea(final GradientColorArea first, final GradientColorArea second) {
    CharSequence _xblockexpression = null;
    {
      double _offset = first.getOffset();
      double _multiply = (_offset * 100);
      int offset_1 = Double.valueOf(_multiply).intValue();
      double _offset_1 = second.getOffset();
      double _multiply_1 = (_offset_1 * 100);
      int offset_2 = Double.valueOf(_multiply_1).intValue();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("addGradientColoredArea(gcas,\"\ufffd\ufffdfirst.color.createColorValue\ufffd\ufffd\",\ufffd\ufffdoffset_1\ufffd\ufffd,org.eclipse.graphiti.mm.algorithms.styles.LocationType.LOCATION_TYPE_RELATIVE, \"\ufffd\ufffdsecond.color.createColorValue\ufffd\ufffd\",\ufffd\ufffdoffset_2\ufffd\ufffd,org.eclipse.graphiti.mm.algorithms.styles.LocationType.LOCATION_TYPE_RELATIVE);");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createColorValue(final ColorConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdGradientUtilClass::colorConstantToHexString(c)\ufffd\ufffd");
    return _builder;
  }
  
  protected CharSequence _createColorValue(final RGBColor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\ufffd\ufffdGradientUtilClass::RGBColorToHexString(c)\ufffd\ufffd");
    return _builder;
  }
  
  public int increaseCounter() {
    return this.elementIndex = (this.elementIndex + 1);
  }
  
  public CharSequence createColorValue(final Color c) {
    if (c instanceof ColorConstantRef) {
      return _createColorValue((ColorConstantRef)c);
    } else if (c instanceof RGBColor) {
      return _createColorValue((RGBColor)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
