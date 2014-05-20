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
package org.eclipselabs.spray.shapes.generator.shapes;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.shapes.ShapestyleLayout;
import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorOrGradient;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.LineStyle;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.YesNoBool;
import org.eclipselabs.spray.styles.generator.StyleGenerator;

@SuppressWarnings("all")
public class ShapeTypeStyleGenerator {
  @Inject
  @Extension
  private StyleGenerator _styleGenerator;
  
  public CharSequence generateStyleForElement(final String attName, final ShapestyleLayout ssl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(ssl, null));
      if (!_notEquals) {
        _and = false;
      } else {
        StyleLayout _layout = ssl.getLayout();
        boolean _notEquals_1 = (!Objects.equal(_layout, null));
        _and = _notEquals_1;
      }
      if (_and) {
        {
          StyleLayout _layout_1 = ssl.getLayout();
          ColorOrGradient _background = _layout_1.getBackground();
          boolean _notEquals_2 = (!Objects.equal(_background, null));
          if (_notEquals_2) {
            _builder.append(attName, "");
            _builder.append(".setBackground(gaService.manageColor(diagram,");
            StyleLayout _layout_2 = ssl.getLayout();
            ColorOrGradient _background_1 = _layout_2.getBackground();
            CharSequence _createColorValue = this._styleGenerator.createColorValue(_background_1);
            _builder.append(_createColorValue, "");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_3 = ssl.getLayout();
          double _transparency = _layout_3.getTransparency();
          boolean _notEquals_3 = (_transparency != Double.MIN_VALUE);
          if (_notEquals_3) {
            _builder.append(attName, "");
            _builder.append(".setTransparency(");
            StyleLayout _layout_4 = ssl.getLayout();
            double _transparency_1 = _layout_4.getTransparency();
            _builder.append(_transparency_1, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        CharSequence _createLineAttributes = this.createLineAttributes(attName, ssl);
        _builder.append(_createLineAttributes, "");
        _builder.newLineIfNotEmpty();
        CharSequence _createFontAttributes = this.createFontAttributes(attName, ssl);
        _builder.append(_createFontAttributes, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createFontAttributes(final String attName, final ShapestyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _or_2 = false;
      boolean _or_3 = false;
      StyleLayout _layout = l.getLayout();
      String _fontName = _layout.getFontName();
      boolean _notEquals = (!Objects.equal(_fontName, null));
      if (_notEquals) {
        _or_3 = true;
      } else {
        StyleLayout _layout_1 = l.getLayout();
        int _fontSize = _layout_1.getFontSize();
        boolean _notEquals_1 = (_fontSize != Integer.MIN_VALUE);
        _or_3 = _notEquals_1;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        StyleLayout _layout_2 = l.getLayout();
        YesNoBool _fontItalic = _layout_2.getFontItalic();
        boolean _notEquals_2 = (!Objects.equal(_fontItalic, YesNoBool.NULL));
        _or_2 = _notEquals_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        StyleLayout _layout_3 = l.getLayout();
        YesNoBool _fontBold = _layout_3.getFontBold();
        boolean _notEquals_3 = (!Objects.equal(_fontBold, YesNoBool.NULL));
        _or_1 = _notEquals_3;
      }
      if (_or_1) {
        _or = true;
      } else {
        StyleLayout _layout_4 = l.getLayout();
        Color _fontColor = _layout_4.getFontColor();
        boolean _notEquals_4 = (!Objects.equal(_fontColor, null));
        _or = _notEquals_4;
      }
      if (_or) {
        _builder.append("{");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("Style style = ");
        _builder.append(attName, "    ");
        _builder.append(".getStyle();");
        _builder.newLineIfNotEmpty();
        {
          StyleLayout _layout_5 = l.getLayout();
          String _fontName_1 = _layout_5.getFontName();
          boolean _equals = Objects.equal(_fontName_1, null);
          if (_equals) {
            _builder.append("    ");
            _builder.append("String fontName = style.getFont().getName();");
            _builder.newLine();
          } else {
            _builder.append("    ");
            _builder.append("String fontName = \"");
            StyleLayout _layout_6 = l.getLayout();
            String _fontName_2 = _layout_6.getFontName();
            _builder.append(_fontName_2, "    ");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_7 = l.getLayout();
          int _fontSize_1 = _layout_7.getFontSize();
          boolean _equals_1 = (_fontSize_1 == Integer.MIN_VALUE);
          if (_equals_1) {
            _builder.append("    ");
            _builder.append("int fontSize = style.getFont().getSize();");
            _builder.newLine();
          } else {
            _builder.append("    ");
            _builder.append("int fontSize = ");
            StyleLayout _layout_8 = l.getLayout();
            int _fontSize_2 = _layout_8.getFontSize();
            _builder.append(_fontSize_2, "    ");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_9 = l.getLayout();
          Color _fontColor_1 = _layout_9.getFontColor();
          boolean _equals_2 = Objects.equal(_fontColor_1, null);
          if (_equals_2) {
            _builder.append("    ");
            _builder.append(attName, "    ");
            _builder.append(".setForeground(style.getForeground());");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("    ");
            _builder.append(attName, "    ");
            _builder.append(".setForeground(gaService.manageColor(diagram,");
            StyleLayout _layout_10 = l.getLayout();
            Color _fontColor_2 = _layout_10.getFontColor();
            CharSequence _createColorValue = this._styleGenerator.createColorValue(_fontColor_2);
            _builder.append(_createColorValue, "    ");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_11 = l.getLayout();
          YesNoBool _fontItalic_1 = _layout_11.getFontItalic();
          boolean _equals_3 = Objects.equal(_fontItalic_1, YesNoBool.NULL);
          if (_equals_3) {
            _builder.append("    ");
            _builder.append("boolean fontItalic = style.getFont().isItalic();");
            _builder.newLine();
          } else {
            _builder.append("    ");
            _builder.append("boolean fontItalic = ");
            StyleLayout _layout_12 = l.getLayout();
            YesNoBool _fontItalic_2 = _layout_12.getFontItalic();
            String _transformYesNoToBoolean = this._styleGenerator.transformYesNoToBoolean(_fontItalic_2);
            _builder.append(_transformYesNoToBoolean, "    ");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_13 = l.getLayout();
          YesNoBool _fontBold_1 = _layout_13.getFontBold();
          boolean _equals_4 = Objects.equal(_fontBold_1, YesNoBool.NULL);
          if (_equals_4) {
            _builder.append("    ");
            _builder.append("boolean fontBold = style.getFont().isBold();");
            _builder.newLine();
          } else {
            _builder.append("    ");
            _builder.append("boolean fontBold = ");
            StyleLayout _layout_14 = l.getLayout();
            YesNoBool _fontBold_2 = _layout_14.getFontBold();
            String _transformYesNoToBoolean_1 = this._styleGenerator.transformYesNoToBoolean(_fontBold_2);
            _builder.append(_transformYesNoToBoolean_1, "    ");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    ");
        _builder.append("style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence createLineAttributes(final String attName, final ShapestyleLayout ssl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      StyleLayout _layout = ssl.getLayout();
      ColorWithTransparency _lineColor = _layout.getLineColor();
      boolean _notEquals = (!Objects.equal(_lineColor, null));
      if (_notEquals) {
        _builder.append(attName, "");
        _builder.append(".setForeground(gaService.manageColor(diagram,");
        StyleLayout _layout_1 = ssl.getLayout();
        ColorWithTransparency _lineColor_1 = _layout_1.getLineColor();
        CharSequence _createColorValue = this._styleGenerator.createColorValue(_lineColor_1);
        _builder.append(_createColorValue, "");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _and = false;
      StyleLayout _layout_2 = ssl.getLayout();
      LineStyle _lineStyle = _layout_2.getLineStyle();
      boolean _notEquals_1 = (!Objects.equal(_lineStyle, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        StyleLayout _layout_3 = ssl.getLayout();
        LineStyle _lineStyle_1 = _layout_3.getLineStyle();
        boolean _notEquals_2 = (!Objects.equal(_lineStyle_1, LineStyle.NULL));
        _and = _notEquals_2;
      }
      if (_and) {
        _builder.append(attName, "");
        _builder.append(".setLineStyle(LineStyle.");
        StyleLayout _layout_4 = ssl.getLayout();
        LineStyle _lineStyle_2 = _layout_4.getLineStyle();
        String _name = _lineStyle_2.getName();
        _builder.append(_name, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      StyleLayout _layout_5 = ssl.getLayout();
      int _lineWidth = _layout_5.getLineWidth();
      boolean _notEquals_3 = (_lineWidth != Integer.MIN_VALUE);
      if (_notEquals_3) {
        _builder.append(attName, "");
        _builder.append(".setLineWidth(");
        StyleLayout _layout_6 = ssl.getLayout();
        int _lineWidth_1 = _layout_6.getLineWidth();
        _builder.append(_lineWidth_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
