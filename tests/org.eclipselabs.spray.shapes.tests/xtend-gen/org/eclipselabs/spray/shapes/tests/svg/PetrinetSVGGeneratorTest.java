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
public class PetrinetSVGGeneratorTest extends XtextTest {
  private ShapeContainer shapeContainer;
  
  @Inject
  private GeneratorSVGDefinition generatorSVGDefinition;
  
  @Inject
  @Extension
  private CustomAssert _customAssert;
  
  @Before
  public void setUp() {
    final URI uri = URI.createURI((this.resourceRoot + "/testcases/svgs/petrinet/petrinet.shape"));
    Class<? extends EObject> _rootObjectType = this.getRootObjectType(uri);
    EObject _loadModel = this.loadModel(this.resourceSet, uri, _rootObjectType);
    this.shapeContainer = ((ShapeContainer) _loadModel);
  }
  
  @Test
  public void testPlaceShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("PlaceShape".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("petrinet", "PlaceShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for PlaceShape", _expectedSVGContent, _string);
  }
  
  @Test
  public void testTransitionShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("TransitionShape".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("petrinet", "TransitionShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for TransitionShape", _expectedSVGContent, _string);
  }
  
  @Test
  public void testEmptyTransitionShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("EmptyTransitionShape".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("petrinet", "EmptyTransitionShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for EmptyTransitionShape", _expectedSVGContent, _string);
  }
  
  @Test
  public void testTokenShape() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("TokenShape".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("petrinet", "TokenShape");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for TokenShape", _expectedSVGContent, _string);
  }
  
  @Test
  public void testArcConnection() {
    EList<ShapeContainerElement> _shapeContainerElement = this.shapeContainer.getShapeContainerElement();
    final Function1<ShapeContainerElement,Boolean> _function = new Function1<ShapeContainerElement,Boolean>() {
      public Boolean apply(final ShapeContainerElement sd) {
        String _name = sd.getName();
        return Boolean.valueOf("ArcConnection".matches(_name));
      }
    };
    Iterable<ShapeContainerElement> _filter = IterableExtensions.<ShapeContainerElement>filter(_shapeContainerElement, _function);
    final ShapeContainerElement element = IterableExtensions.<ShapeContainerElement>head(_filter);
    String _expectedSVGContent = this.getExpectedSVGContent("petrinet", "ArcConnection");
    CharSequence _compile = this.generatorSVGDefinition.compile(element);
    String _string = _compile.toString();
    this._customAssert.assertEquals("SVG generated for ArcConnection", _expectedSVGContent, _string);
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
