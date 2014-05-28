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
package org.eclipselabs.spray.shapes.jvmmodel;

import com.google.common.base.Objects;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection;
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.ShapeDefinition;

@SuppressWarnings("all")
public class ShapeJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private TypeReferences typeReferences;
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IJvmTypeProvider.Factory typeProviderFactory;
  
  public void infer(final ShapeDefinition element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final JvmTypeReference superTypeRef = this.calculateSuperTypeRef(element);
    final IJvmTypeProvider typeProvider = this.typeProviderFactory.createTypeProvider();
    String _packageName = this.getPackageName(element);
    String _plus = this.operator_plus(_packageName, ".");
    String _className = this.getClassName(element);
    String _plus_1 = this.operator_plus(_plus, _className);
    JvmType existingClass = typeProvider.findTypeByName(_plus_1);
    boolean _equals = Objects.equal(existingClass, null);
    if (_equals) {
      String _packageName_1 = this.getPackageName(element);
      String _plus_2 = this.operator_plus(_packageName_1, ".");
      String _className_1 = this.getClassName(element);
      String _plus_3 = this.operator_plus(_plus_2, _className_1);
      JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus_3);
      IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          boolean _notEquals = (!Objects.equal(superTypeRef, null));
          if (_notEquals) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmTypeReference _cloneWithProxies = ShapeJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(superTypeRef);
            ShapeJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
          }
        }
      };
      _accept.initializeLater(_function);
    } else {
      if ((existingClass instanceof JvmDeclaredType)) {
        this._jvmTypesBuilder.<JvmDeclaredType>associate(element, ((JvmDeclaredType)existingClass));
        acceptor.<JvmDeclaredType>accept(((JvmDeclaredType)existingClass));
      }
    }
  }
  
  public String operator_plus(final Object a, final String b) {
    return this.operator_plus(a, b);
  }
  
  public void infer(final ConnectionDefinition element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final JvmTypeReference superTypeRef = this.calculateSuperTypeRef(element);
    final IJvmTypeProvider typeProvider = this.typeProviderFactory.createTypeProvider();
    String _packageName = this.getPackageName(element);
    String _plus = this.operator_plus(_packageName, ".");
    String _className = this.getClassName(element);
    String _plus_1 = this.operator_plus(_plus, _className);
    JvmType existingClass = typeProvider.findTypeByName(_plus_1);
    boolean _equals = Objects.equal(existingClass, null);
    if (_equals) {
      String _packageName_1 = this.getPackageName(element);
      String _plus_2 = this.operator_plus(_packageName_1, ".");
      String _className_1 = this.getClassName(element);
      String _plus_3 = this.operator_plus(_plus_2, _className_1);
      JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus_3);
      IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          boolean _notEquals = (!Objects.equal(superTypeRef, null));
          if (_notEquals) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmTypeReference _cloneWithProxies = ShapeJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(superTypeRef);
            ShapeJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
          }
        }
      };
      _accept.initializeLater(_function);
    } else {
      if ((existingClass instanceof JvmDeclaredType)) {
        this._jvmTypesBuilder.<JvmDeclaredType>associate(element, ((JvmDeclaredType)existingClass));
        acceptor.<JvmDeclaredType>accept(((JvmDeclaredType)existingClass));
      }
    }
  }
  
  protected JvmTypeReference _calculateSuperTypeRef(final ShapeDefinition shape) {
    JvmTypeReference _xblockexpression = null;
    {
      JvmTypeReference varSuperTypeRef = null;
      final JvmType superType = this.typeReferences.findDeclaredType(DefaultSprayShape.class, shape);
      boolean _notEquals = (!Objects.equal(superType, null));
      if (_notEquals) {
        JvmParameterizedTypeReference _createTypeRef = this.typeReferences.createTypeRef(superType);
        varSuperTypeRef = _createTypeRef;
      }
      _xblockexpression = varSuperTypeRef;
    }
    return _xblockexpression;
  }
  
  protected JvmTypeReference _calculateSuperTypeRef(final ConnectionDefinition shape) {
    JvmTypeReference _xblockexpression = null;
    {
      JvmTypeReference varSuperTypeRef = null;
      final JvmType superType = this.typeReferences.findDeclaredType(DefaultSprayConnection.class, shape);
      boolean _notEquals = (!Objects.equal(superType, null));
      if (_notEquals) {
        JvmParameterizedTypeReference _createTypeRef = this.typeReferences.createTypeRef(superType);
        varSuperTypeRef = _createTypeRef;
      }
      _xblockexpression = varSuperTypeRef;
    }
    return _xblockexpression;
  }
  
  protected String _getPackageName(final ShapeDefinition shapeDefinition) {
    return ProjectProperties.getShapesPackage();
  }
  
  protected String _getPackageName(final ConnectionDefinition connectionDefinition) {
    return ProjectProperties.getShapesPackage();
  }
  
  protected String _getClassName(final ShapeDefinition shapeDefinition) {
    String _name = shapeDefinition.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  protected String _getClassName(final ConnectionDefinition connectionDefinition) {
    String _name = connectionDefinition.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public JvmTypeReference calculateSuperTypeRef(final ShapeContainerElement shape) {
    if (shape instanceof ConnectionDefinition) {
      return _calculateSuperTypeRef((ConnectionDefinition)shape);
    } else if (shape instanceof ShapeDefinition) {
      return _calculateSuperTypeRef((ShapeDefinition)shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public String getPackageName(final ShapeContainerElement connectionDefinition) {
    if (connectionDefinition instanceof ConnectionDefinition) {
      return _getPackageName((ConnectionDefinition)connectionDefinition);
    } else if (connectionDefinition instanceof ShapeDefinition) {
      return _getPackageName((ShapeDefinition)connectionDefinition);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(connectionDefinition).toString());
    }
  }
  
  public String getClassName(final ShapeContainerElement connectionDefinition) {
    if (connectionDefinition instanceof ConnectionDefinition) {
      return _getClassName((ConnectionDefinition)connectionDefinition);
    } else if (connectionDefinition instanceof ShapeDefinition) {
      return _getClassName((ShapeDefinition)connectionDefinition);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(connectionDefinition).toString());
    }
  }
}
