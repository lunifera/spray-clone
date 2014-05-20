package org.eclipselabs.spray.examples.lwc2012;

import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.mwe.NameBasedFilter;
import org.eclipse.xtext.mwe.Reader;
import org.eclipse.xtext.mwe.SlotEntry;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.examples.lwc2012.Lwc2012TestsInjectorProvider;
import org.eclipselabs.spray.generator.graphiti.SprayGenerator;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeStandaloneSetup;
import org.eclipselabs.spray.shapes.generator.ShapeGenerator;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleStandaloneSetup;
import org.eclipselabs.spray.styles.generator.StylesGenerator;
import org.eclipselabs.spray.xtext.SprayStandaloneSetup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(Lwc2012TestsInjectorProvider.class)
@SuppressWarnings("all")
public class Lwc2012Test {
  @Inject
  private Injector injector;
  
  @Inject
  private StylesGenerator styleGenerator;
  
  @Inject
  private ShapeGenerator shapeGenerator;
  
  @Inject
  private SprayGenerator sprayGenerator;
  
  private Reader reader;
  
  private IWorkflowContext context;
  
  public Reader createReader(final String filterExpression) {
    Reader _xblockexpression = null;
    {
      Reader _instance = this.injector.<Reader>getInstance(Reader.class);
      this.reader = _instance;
      SprayStandaloneSetup _sprayStandaloneSetup = new SprayStandaloneSetup();
      this.reader.addRegister(_sprayStandaloneSetup);
      StyleStandaloneSetup _styleStandaloneSetup = new StyleStandaloneSetup();
      this.reader.addRegister(_styleStandaloneSetup);
      ShapeStandaloneSetup _shapeStandaloneSetup = new ShapeStandaloneSetup();
      this.reader.addRegister(_shapeStandaloneSetup);
      this.reader.addPath("model");
      this.createAndAddSlots(this.reader);
      _xblockexpression = this.reader;
    }
    return _xblockexpression;
  }
  
  public void createFilter(final Reader reader, final String filterExpression) {
    final NameBasedFilter filter = new NameBasedFilter();
    String _xifexpression = null;
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(filterExpression);
    if (_isNullOrEmpty) {
      _xifexpression = "\\.spray|\\.style|\\.shape";
    } else {
      _xifexpression = filterExpression;
    }
    filter.setRegularExpression(_xifexpression);
    reader.setUriFilter(filter);
  }
  
  public void createAndAddSlots(final Reader reader) {
    Pair<String,Class<Diagram>> _pair = new Pair<String, Class<Diagram>>("model_diagram", Diagram.class);
    Pair _pair_1 = new Pair("model_style", Style.class);
    Pair _pair_2 = new Pair("model_gradient", Gradient.class);
    Pair _pair_3 = new Pair("model_shape", ShapeDefinition.class);
    Pair _pair_4 = new Pair("model_connection", ConnectionDefinition.class);
    final ArrayList<Pair<String,Class<Diagram>>> configurations = CollectionLiterals.<Pair<String,Class<Diagram>>>newArrayList(_pair, _pair_1, _pair_2, _pair_3, _pair_4);
    final Procedure1<Pair<String,Class<Diagram>>> _function = new Procedure1<Pair<String,Class<Diagram>>>() {
      public void apply(final Pair<String,Class<Diagram>> it) {
        String _key = it.getKey();
        Class<Diagram> _value = it.getValue();
        Lwc2012Test.this.createAndAddSlot(reader, _key, _value);
      }
    };
    IterableExtensions.<Pair<String,Class<Diagram>>>forEach(configurations, _function);
  }
  
  public void createAndAddSlot(final Reader reader, final String name, final Class<?> type) {
    final SlotEntry slot = new SlotEntry();
    slot.setSlot(name);
    String _simpleName = type.getSimpleName();
    slot.setType(_simpleName);
    reader.addLoad(slot);
  }
  
  @Before
  public void setUp() {
    IWorkflowContext _instance = this.injector.<IWorkflowContext>getInstance(IWorkflowContext.class);
    this.context = _instance;
    Reader _createReader = this.createReader(null);
    this.reader = _createReader;
  }
  
  @Test
  public void testJvmTypeScoping() {
    this.createFilter(this.reader, "lwc2012gradients.style|lwc2012.style");
    this.reader.invoke(this.context);
    Object _get = this.context.get("model_gradient");
    final List gradientList = ((List) _get);
    Object _get_1 = this.context.get("model_style");
    final List stylesList = ((List) _get_1);
  }
  
  @Test
  public void testGradientsGeneration() {
    this.createFilter(this.reader, "lwc2012gradients.style");
    this.reader.invoke(this.context);
    Object _get = this.context.get("model_gradient");
    final List list = ((List) _get);
    Iterable<Gradient> _filter = Iterables.<Gradient>filter(list, Gradient.class);
    final Gradient gradient = IterableExtensions.<Gradient>head(_filter);
    Assert.assertNotNull(gradient);
    final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
    Resource _eResource = gradient.eResource();
    this.styleGenerator.doGenerate(_eResource, fsa);
    final String sep = "/";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DEFAULT_OUTPUTorg");
    _builder.append(sep, "");
    _builder.append("eclipselabs");
    _builder.append(sep, "");
    _builder.append("spray");
    _builder.append(sep, "");
    _builder.append("styles");
    _builder.append(sep, "");
    _builder.append("gradients");
    _builder.append(sep, "");
    final String path = _builder.toString();
    final Procedure1<String> _function = new Procedure1<String>() {
      public void apply(final String s) {
        Map<String,CharSequence> _files = fsa.getFiles();
        boolean _containsKey = _files.containsKey(((path + s) + ".java"));
        Assert.assertTrue((s + ".java generiert"), _containsKey);
      }
    };
    final Procedure1<? super String> assertGradientGenerated = _function;
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("GreenToWhite", "GreenToOrange", "GreenToYellow", "GreenToRed");
    final Procedure1<String> _function_1 = new Procedure1<String>() {
      public void apply(final String it) {
        assertGradientGenerated.apply(it);
      }
    };
    IterableExtensions.<String>forEach(_newArrayList, _function_1);
  }
}
