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
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(void.class)
@InjectWith(ShapeTestsInjectorProvider.class)
@SuppressWarnings("all")
public class BusmodSVGGeneratorTest /* implements XtextTest  */{
  private ShapeContainer shapeContainer;
  
  @Inject
  private GeneratorSVGDefinition generatorSVGDefinition;
  
  @Inject
  @Extension
  private CustomAssert _customAssert;
  
  @Before
  public void setUp() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field resourceRoot is undefined for the type BusmodSVGGeneratorTest"
      + "\nThe method loadModel is undefined for the type BusmodSVGGeneratorTest"
      + "\nThe method or field resourceSet is undefined for the type BusmodSVGGeneratorTest"
      + "\nThe method getRootObjectType is undefined for the type BusmodSVGGeneratorTest"
      + "\n+ cannot be resolved");
  }
  
  @Test
  public void testRectangleShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("RectangleShape".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("busmod", "RectangleShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for RectangleShape", _expectedSVGContent, _string);
  }
  
  @Test
  public void testClassShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("ClassShape".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("busmod", "ClassShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for ClassShape", _expectedSVGContent, _string);
  }
  
  @Test
  public void testTextShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("TextShape".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("busmod", "TextShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for TextShape", _expectedSVGContent, _string);
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
