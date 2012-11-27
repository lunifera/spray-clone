package org.eclipselabs.spray.shapes.tests.util;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.shapes.ShapeRuntimeModule;
import org.eclipselabs.spray.shapes.ShapeStandaloneSetup;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.styles.StyleRuntimeModule;
import org.eclipselabs.spray.styles.StylesPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ShapeTestsStandaloneSetup extends ShapeStandaloneSetup {
    @Override
    public Injector createInjector() {
        return Guice.createInjector(Modules2.mixin(new StyleRuntimeModule(), new ShapeRuntimeModule(), new ShapeTestsModule()));
    }

    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(StylesPackage.eNS_URI, StylesPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, ShapesPackage.eINSTANCE);
        return super.createInjectorAndDoEMFRegistration();
    }
}
