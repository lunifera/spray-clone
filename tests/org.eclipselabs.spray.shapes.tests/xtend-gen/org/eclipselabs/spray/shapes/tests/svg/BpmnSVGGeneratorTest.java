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
package org.eclipselabs.spray.shapes.tests.svg;

import java.io.File;
import java.util.Scanner;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition;
import org.eclipselabs.spray.shapes.tests.svg.CustomAssert;
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(ShapeTestsInjectorProvider.class)
@SuppressWarnings("all")
public class BpmnSVGGeneratorTest extends XtextTest {
  private ShapeContainer shapeContainer;
  
  @Inject
  private GeneratorSVGDefinition generatorSVGDefinition;
  
  @Inject
  @Extension
  private CustomAssert _customAssert;
  
  @Before
  public void setUp() {
    final URI uri = URI.createURI((this.resourceRoot + "/testcases/svgs/bpmn/bpmn.shape"));
    Class<? extends EObject> _rootObjectType = this.getRootObjectType(uri);
    EObject _loadModel = this.loadModel(this.resourceSet, uri, _rootObjectType);
    this.shapeContainer = ((ShapeContainer) _loadModel);
  }
  
  @Test
  public void testBPMN_EventStart_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventStart_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventStart_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventStart_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventEnd_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventEnd_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventEnd_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventEnd_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventEnd_used() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventEnd_used".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventEnd_used");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventEnd_used", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMail() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMail".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMail");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMail", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMail_Dash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMail_Dash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMail_Dash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMail_Dash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMail_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMail_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMail_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMail_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMail_DoubleDash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMail_DoubleDash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMail_DoubleDash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMail_DoubleDash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMailInvert_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMailInvert_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMailInvert_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMailInvert_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMailInvert_Bold() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMailInvert_Bold".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMailInvert_Bold");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMailInvert_Bold", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventTimer_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventTimer_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventTimer_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventTimer_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventTimer_Dash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventTimer_Dash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventTimer_Dash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventTimer_Dash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventTimer_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventTimer_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventTimer_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventTimer_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventTimer_DoubleDash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventTimer_DoubleDash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventTimer_DoubleDash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventTimer_DoubleDash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventEskalation_Start() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventEskalation_Start".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventEskalation_Start");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventEskalation_Start", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventEskalation_Dash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventEskalation_Dash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventEskalation_Dash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventEskalation_Dash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventEskalation_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventEskalation_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventEskalation_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventEskalation_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventEskalation_DoubleDash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventEskalation_DoubleDash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventEskalation_DoubleDash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventEskalation_DoubleDash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventEskalation_DoubleInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventEskalation_DoubleInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventEskalation_DoubleInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventEskalation_DoubleInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventEskalation_BoldInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventEskalation_BoldInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventEskalation_BoldInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventEskalation_BoldInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventIf_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventIf_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventIf_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventIf_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventIf_Dash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventIf_Dash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventIf_Dash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventIf_Dash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventIf_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventIf_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventIf_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventIf_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventIf_DoubleDash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventIf_DoubleDash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventIf_DoubleDash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventIf_DoubleDash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventLink_entered() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventLink_entered".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventLink_entered");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventLink_entered", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventLink_triggered() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventLink_triggered".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventLink_triggered");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventLink_triggered", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventError_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventError_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventError_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventError_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventError_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventError_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventError_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventError_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventError_BoldInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventError_BoldInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventError_BoldInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventError_BoldInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventCancel_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventCancel_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventCancel_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventCancel_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventCancel_BoldInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventCancel_BoldInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventCancel_BoldInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventCancel_BoldInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventCompensation_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventCompensation_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventCompensation_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventCompensation_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventCompensation_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventCompensation_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventCompensation_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventCompensation_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventCompensation_DoubleInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventCompensation_DoubleInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventCompensation_DoubleInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventCompensation_DoubleInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventCompensation_BoldInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventCompensation_BoldInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventCompensation_BoldInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventCompensation_BoldInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventSignal_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventSignal_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventSignal_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventSignal_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventSignal_dash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventSignal_dash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventSignal_dash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventSignal_dash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventSignal_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventSignal_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventSignal_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventSignal_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventSignal_DoubleDash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventSignal_DoubleDash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventSignal_DoubleDash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventSignal_DoubleDash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventSignal_DoubleInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventSignal_DoubleInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventSignal_DoubleInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventSignal_DoubleInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventSignal_BoldInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventSignal_BoldInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventSignal_BoldInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventSignal_BoldInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMulti_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMulti_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMulti_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMulti_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMulti_dash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMulti_dash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMulti_dash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMulti_dash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMulti_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMulti_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMulti_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMulti_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMulti_DoubleDash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMulti_DoubleDash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMulti_DoubleDash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMulti_DoubleDash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMulti_DoubleInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMulti_DoubleInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMulti_DoubleInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMulti_DoubleInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventMulti_BoldInvert() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventMulti_BoldInvert".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventMulti_BoldInvert");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventMulti_BoldInvert", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventParallel_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventParallel_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventParallel_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventParallel_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventParallel_dash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventParallel_dash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventParallel_dash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventParallel_dash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventParallel_Double() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventParallel_Double".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventParallel_Double");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventParallel_Double", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventParallel_DoubleDash() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventParallel_DoubleDash".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventParallel_DoubleDash");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventParallel_DoubleDash", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_EventTermination() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_EventTermination".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_EventTermination");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_EventTermination", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Activity_Task() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Activity_Task".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Activity_Task");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Activity_Task", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Activity_Transaction() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Activity_Transaction".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Activity_Transaction");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Activity_Transaction", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Activity_EventSubProcess() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Activity_EventSubProcess".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Activity_EventSubProcess");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Activity_EventSubProcess", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Activity_CallActivity() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Activity_CallActivity".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Activity_CallActivity");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Activity_CallActivity", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Gateway_XOR_1() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Gateway_XOR_1".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Gateway_XOR_1");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Gateway_XOR_1", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Gateway_XOR_2() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Gateway_XOR_2".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Gateway_XOR_2");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Gateway_XOR_2", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Gateway_Event() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Gateway_Event".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Gateway_Event");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Gateway_Event", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Gateway_AND() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Gateway_AND".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Gateway_AND");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Gateway_AND", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Gateway_OR() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Gateway_OR".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Gateway_OR");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Gateway_OR", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Gateway_complex() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Gateway_complex".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Gateway_complex");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Gateway_complex", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Gateway_XEvent() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Gateway_XEvent".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Gateway_XEvent");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Gateway_XEvent", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Gateway_AND_Event() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Gateway_AND_Event".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Gateway_AND_Event");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Gateway_AND_Event", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Conversation_default() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Conversation_default".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Conversation_default");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Conversation_default", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_Conversation_Bold() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_Conversation_Bold".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_Conversation_Bold");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_Conversation_Bold", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_OneData() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_OneData".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_OneData");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_OneData", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_ListData() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_ListData".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_ListData");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_ListData", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_DataStorage() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_DataStorage".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_DataStorage");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_DataStorage", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_SequenceFlow() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_SequenceFlow".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_SequenceFlow");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_SequenceFlow", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_DefaultFlow() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_DefaultFlow".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_DefaultFlow");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_DefaultFlow", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_ConditionalFlow() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_ConditionalFlow".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_ConditionalFlow");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_ConditionalFlow", _expectedSVGContent, _string);
  }
  
  @Test
  public void testBPMN_DataAssoziation() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("BPMN_DataAssoziation".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("bpmn", "BPMN_DataAssoziation");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for BPMN_DataAssoziation", _expectedSVGContent, _string);
  }
  
  private String getExpectedSVGContent(final String pathSegment, final String shapeContainerElementName) {
    try {
      String _xblockexpression = null;
      {
        File _file = new File((((("model//testcases/svgs/" + pathSegment) + "/expected/") + shapeContainerElementName) + ".svg"));
        final Scanner scanner = new Scanner(_file);
        Scanner _useDelimiter = scanner.useDelimiter("\\A");
        final String expectedSVG = _useDelimiter.next();
        scanner.close();
        _xblockexpression = expectedSVG;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
