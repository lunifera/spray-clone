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
package org.eclipselabs.spray.generator.graphiti.tests;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.graphiti.tests.AbstractSprayGeneratorTest;
import org.eclipselabs.spray.generator.graphiti.tests.InMemoryFilesystemAccessExt;
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider;

/* @RunWith(XtextRunner2.class) */@InjectWith(SprayTestsInjectorProvider.class)
@SuppressWarnings("all")
public class Mod4JTestGenerator extends AbstractSprayGeneratorTest {
  private final String PREFIX = "DEFAULT_OUTPUT";
  
  private final String PREFIX_LONG = (this.PREFIX + "org/eclipselabs/spray/examples/");
  
  public void test() {
    try {
      final InMemoryFilesystemAccessExt fsa = this.triggerGenerator("mod4j/mod4j-busmod.spray");
      Map<String,CharSequence> _files = fsa.getFiles();
      Set<String> _keySet = _files.keySet();
      for (final String key : _keySet) {
        {
          final String packageName = this.getPackageName(key);
          final String className = this.getFileName(key);
          Map<String,CharSequence> _files_1 = fsa.getFiles();
          final CharSequence content = _files_1.get(key);
          String _replace = packageName.replace(".", "/");
          String _plus = ("src/" + _replace);
          String _plus_1 = (_plus + "/");
          String _plus_2 = (_plus_1 + className);
          final String path = (_plus_2 + ".xtend");
          final CharSequence testClassContent = this.assertionClassContent(packageName, className, key, content);
          final File file = new File(path);
          File _parentFile = file.getParentFile();
          _parentFile.mkdirs();
          final FileWriter fileWriter = new FileWriter(file);
          String _string = testClassContent.toString();
          fileWriter.write(_string);
          fileWriter.flush();
          fileWriter.close();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String getPackageName(final String key) {
    String _xifexpression = null;
    boolean _contains = key.contains(this.PREFIX_LONG);
    if (_contains) {
      String _replace = key.replace(this.PREFIX_LONG, "");
      String[] _split = _replace.split("/");
      List<String> _reverse = ListExtensions.<String>reverse(((List<String>)Conversions.doWrapArray(_split)));
      Iterable<String> _tail = IterableExtensions.<String>tail(_reverse);
      List<String> _list = IterableExtensions.<String>toList(_tail);
      List<String> _reverse_1 = ListExtensions.<String>reverse(_list);
      String _join = IterableExtensions.join(_reverse_1, ".");
      _xifexpression = ("org.eclipselabs.spray.generator.graphiti.tests.mod4j." + _join);
    } else {
      _xifexpression = "org.eclipselabs.spray.generator.graphiti.tests.mod4j";
    }
    return _xifexpression;
  }
  
  private String getFileName(final String key) {
    String _xifexpression = null;
    boolean _endsWith = key.endsWith(".java");
    if (_endsWith) {
      String[] _split = key.split("/");
      String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
      String _replace = _last.replace(".java", "");
      _xifexpression = (_replace + "Test");
    } else {
      String[] _split_1 = key.split("/");
      String _last_1 = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split_1)));
      String _replace_1 = _last_1.replace(this.PREFIX, "");
      String _replace_2 = _replace_1.replace(".", "");
      String _firstUpper = StringExtensions.toFirstUpper(_replace_2);
      _xifexpression = (_firstUpper + "Test");
    }
    return _xifexpression;
  }
  
  public CharSequence assertionClassContent(final String packageName, final String className, final String key, final CharSequence content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.junit4.InjectWith");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.generator.graphiti.tests.AbstractSprayGeneratorTest");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider");
    _builder.newLine();
    _builder.append("import org.eclipselabs.xtext.utils.unittesting.XtextRunner2");
    _builder.newLine();
    _builder.append("import org.junit.Test");
    _builder.newLine();
    _builder.append("import org.junit.runner.RunWith");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import static org.junit.Assert.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RunWith(typeof(XtextRunner2))");
    _builder.newLine();
    _builder.append("@InjectWith(typeof(SprayTestsInjectorProvider))");
    _builder.newLine();
    _builder.append("class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractSprayGeneratorTest {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Test");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def void test() {");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("val fsa = triggerGenerator(\"mod4j/mod4j-busmod.spray\")");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("val keyClass = \"");
    _builder.append(key, "       ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("       ");
    _builder.append("assertTrue(keyClass + \" should have been generated\", fsa.files.containsKey(keyClass))");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("assertEquals(keyClass + \" should have the expected content\", fsa.files.get(keyClass).toString, expectedContent.toString)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def private expectedContent() ");
    _builder.append("\'\'\'", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append(content, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("\'\'\'", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
