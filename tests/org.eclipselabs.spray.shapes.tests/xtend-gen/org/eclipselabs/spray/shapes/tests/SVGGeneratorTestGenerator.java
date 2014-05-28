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
package org.eclipselabs.spray.shapes.tests;

import java.io.FileWriter;
import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(void.class)
@InjectWith(ShapeTestsInjectorProvider.class)
@SuppressWarnings("all")
public class SVGGeneratorTestGenerator /* implements XtextTest  */{
  @Ignore
  @Test
  public void generate() {
    this.generate("bpmn", "bpmn");
    this.generate("busmod", "mydiagram");
    this.generate("lwc2012", "lwc2012");
    this.generate("petrinet", "petrinet");
  }
  
  private void generate(final String segment, final String shapeFileName) {
    try {
      String _firstUpper = StringExtensions.toFirstUpper(segment);
      String _plus = ("src/org/eclipselabs/spray/shapes/tests/svg/" + _firstUpper);
      final String path = (_plus + "SVGGeneratorTest.xtend");
      final FileWriter fw = new FileWriter(path);
      CharSequence _generateTest = this.generateTest(segment, shapeFileName);
      String _string = _generateTest.toString();
      fw.write(_string);
      fw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private CharSequence generateTest(final String segment, final String shapeFileName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.eclipselabs.spray.shapes.tests.svg");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.xtext.utils.unittesting.XtextRunner2");
    _builder.newLine();
    _builder.append("import org.junit.runner.RunWith");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.junit4.InjectWith");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.shapes.ShapeInjectorProvider");
    _builder.newLine();
    _builder.append("import org.eclipselabs.xtext.utils.unittesting.XtextTest");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI");
    _builder.newLine();
    _builder.append("import org.junit.Before");
    _builder.newLine();
    _builder.append("import org.junit.Test");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.shapes.ShapeContainer");
    _builder.newLine();
    _builder.append("import javax.inject.Inject");
    _builder.newLine();
    _builder.append("import java.util.Scanner");
    _builder.newLine();
    _builder.append("import java.io.File");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import static org.junit.Assert.*");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RunWith(typeof(XtextRunner2))");
    _builder.newLine();
    _builder.append("@InjectWith(typeof(ShapeInjectorProvider))");
    _builder.newLine();
    _builder.append("class ");
    String _firstUpper = StringExtensions.toFirstUpper(segment);
    _builder.append(_firstUpper, "");
    _builder.append("SVGGeneratorTest extends XtextTest {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private var ShapeContainer shapeContainer");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private GeneratorSVGDefinition generatorSVGDefinition");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Before");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void setUp() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val uri = URI::createURI(resourceRoot + \"/testcases/svgs/");
    _builder.append(segment, "\t\t");
    _builder.append("/");
    _builder.append(shapeFileName, "\t\t");
    _builder.append(".shape\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) as ShapeContainer;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      ArrayList<CharSequence> _generateTests = this.generateTests(segment, shapeFileName);
      for(final CharSequence method : _generateTests) {
        _builder.append("\t");
        _builder.append(method, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def private getExpectedSVGContent(String pathSegment, ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String shapeContainerElementName) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val scanner = new Scanner(new File(\t\"model//testcases/svgs/\" + ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("pathSegment + \"/expected/\" + shapeContainerElementName + \".svg\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val expectedSVG = scanner.useDelimiter(\"\\\\A\").next();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("scanner.close();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("expectedSVG");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private ArrayList<CharSequence> generateTests(final String pathSegment, final String shapeFileName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field resourceRoot is undefined for the type SVGGeneratorTestGenerator"
      + "\nThe method loadModel is undefined for the type SVGGeneratorTestGenerator"
      + "\nThe method or field resourceSet is undefined for the type SVGGeneratorTestGenerator"
      + "\nThe method getRootObjectType is undefined for the type SVGGeneratorTestGenerator"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  private ArrayList<CharSequence> generateTestMethods(final String pathSegment, final String shapeFileName, final Iterable<? extends ShapeContainerElement> elements) {
    ArrayList<CharSequence> _xblockexpression = null;
    {
      final ArrayList<CharSequence> list = CollectionLiterals.<CharSequence>newArrayList();
      for (final ShapeContainerElement element : elements) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@Test");
        _builder.newLine();
        _builder.append("def void test");
        String _name = element.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("val element = shapeContainer.shapeContainerElement.filter(sd|\"");
        String _name_1 = element.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\".matches(sd.name)).head");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("assertEquals(\"SVG generated for ");
        String _name_2 = element.getName();
        _builder.append(_name_2, "\t");
        _builder.append("\", getExpectedSVGContent(\"");
        _builder.append(pathSegment, "\t");
        _builder.append("\", \"");
        String _name_3 = element.getName();
        _builder.append(_name_3, "\t");
        _builder.append("\"), generatorSVGDefinition.compile(element).toString)");
        _builder.newLineIfNotEmpty();
        _builder.append("}\t");
        _builder.newLine();
        list.add(_builder);
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
}
