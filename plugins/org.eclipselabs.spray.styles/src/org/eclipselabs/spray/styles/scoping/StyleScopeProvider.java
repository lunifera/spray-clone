/*
 * generated by Xtext
 */
package org.eclipselabs.spray.styles.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.eclipselabs.spray.styles.styles.GradientRef;
import org.eclipselabs.spray.styles.styles.Style;

import com.google.common.base.Predicate;

/**
 * This class contains custom scoping description. see :
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on how
 * and when to use it
 */
public class StyleScopeProvider extends AbstractDeclarativeScopeProvider {

//	@Inject
//	private IJvmModelAssociations associations;
//
//	@Inject
//	IJvmModelAssociator jvmModelAssociator;
//
//	@Inject
//	private TypesFactory typesFactory;
//
//	@Inject
//	private IJvmTypeProvider.Factory typeProviderFactory;
//
//	@Inject
//	private IQualifiedNameProvider qualifiedNameProvider;
//
//	@Inject
//	TypeReferences typeReferences;

//	protected IScope getJvmTypeScope(EObject context, EReference reference) {
//		IScope parent = super.getJvmTypeScope(context, reference);
//
//		return parent;
//	}

//	protected IScope createTypeScope(EObject context, EReference reference) {
//		final IScope parentScope = super.getScope(context, reference);
//		JvmIdentifiableElement logicalContainer = logicalContainerProvider
//				.getNearestLogicalContainer(context);
//		if (logicalContainer != null) {
//			return createTypeScope(logicalContainer, reference, parentScope);
//		}
//		return parentScope;
//	}

//	@Override
//	protected IScope createTypeScope(JvmIdentifiableElement context,
//			EReference reference, IScope parentScope) {
//		if (context == null)
//			return parentScope;
//		if (context.eContainer() instanceof JvmIdentifiableElement) {
//			parentScope = createTypeScope(
//					(JvmIdentifiableElement) context.eContainer(), reference,
//					parentScope);
//		}
//		if (context instanceof JvmGenericType) {
//			JvmGenericType genericType = (JvmGenericType) context;
//			List<IEObjectDescription> descriptions = Lists.newArrayList();
//			if (genericType.getSimpleName() != null) {
//				QualifiedName inferredDeclaringTypeName = QualifiedName
//						.create(genericType.getSimpleName());
//				descriptions.add(EObjectDescription.create(
//						inferredDeclaringTypeName, genericType));
//			}
//			for (JvmTypeParameter param : genericType.getTypeParameters()) {
//				if (param.getSimpleName() != null) {
//					QualifiedName paramName = QualifiedName.create(param
//							.getSimpleName());
//					descriptions.add(EObjectDescription
//							.create(paramName, param));
//				}
//			}
//			if (!descriptions.isEmpty())
//				return MapBasedScope.createScope(parentScope, descriptions);
//		} else if (context instanceof JvmExecutable) {
//			JvmExecutable executable = (JvmExecutable) context;
//			List<IEObjectDescription> descriptions = null;
//			for (JvmTypeParameter param : executable.getTypeParameters()) {
//				if (param.getSimpleName() != null) {
//					if (descriptions == null)
//						descriptions = Lists.newArrayList();
//					QualifiedName paramName = QualifiedName.create(param
//							.getSimpleName());
//					descriptions.add(EObjectDescription
//							.create(paramName, param));
//				}
//			}
//			if (descriptions != null && !descriptions.isEmpty())
//				return MapBasedScope.createScope(parentScope, descriptions);
//		}
//		return parentScope;
//	}

//	@Override
//	public IScope createSimpleFeatureCallScope(EObject context,
//			EReference reference, Resource resource,
//			boolean includeCurrentBlock, int idx) {
//		IScope parent = super.createSimpleFeatureCallScope(context, reference,
//				resource, includeCurrentBlock, idx);
//		if (context instanceof JvmTypeReference) {
//			List<IEObjectDescription> descriptions = new ArrayList<IEObjectDescription>();
//			EObject sourceElement = associations
//					.getPrimarySourceElement(context);
//			descriptions.add(EObjectDescription.create(
//					qualifiedNameProvider.getFullyQualifiedName(sourceElement),
//					sourceElement));
//			return MapBasedScope.createScope(parent, descriptions);
//		} else {
//			return parent;
//		}
//	}

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE) {
			GradientRef gradientRef = EcoreUtil2.getContainerOfType(context,
					GradientRef.class);
			if (gradientRef != null) {
				return getGradientTypeScope(gradientRef);
			}
			Style style = EcoreUtil2.getContainerOfType(context, Style.class);
			if (style != null) {
				return getStyleTypeScope(style);
			}
		}
		return super.getScope(context, reference);
	}

	protected IScope getStyleTypeScope(Style style) {
		IScope typesScope = delegateGetScope(style,
				TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE);
		Predicate<IEObjectDescription> stylesFilter = new StyleScopeRestrictor();
		IScope result = new FilteringScope(typesScope, stylesFilter);
		return result;
	}

	protected IScope getGradientTypeScope(GradientRef gradientRef) {
		IScope typesScope = delegateGetScope(gradientRef,
				TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE);
		Predicate<IEObjectDescription> gradientFilter = new GradientScopeRestrictor();
		IScope result = new FilteringScope(typesScope, gradientFilter);
		return result;
	}

//	protected IScope getGradientTypeScope(GradientRef gradientRef) {
//		IScope typesScope = delegateGetScope(gradientRef,
//				TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE);
//		List<IEObjectDescription> descs = new ArrayList<IEObjectDescription>();
//		for (Resource res : getVisibleResources(gradientRef.eResource())) {
//			for (EObject root : res.getContents()) {
//				if (root instanceof StyleContainer) {
//					StyleContainer container = (StyleContainer) root;
//					for (StyleContainerElement element : container
//							.getStyleContainerElement()) {
//						if (element instanceof Gradient) {
//							Gradient gradient = (Gradient) element;
//							IJvmTypeProvider typeProvider = typeProviderFactory.findOrCreateTypeProvider(gradient.eResource().getResourceSet());
//							JvmType type = typeProvider.findTypeByName("org.eclipselabs.spray.styles.gradients." + gradient.getName());
//							if(type == null) {
//								JvmType superType = typeReferences.findDeclaredType(PredefinedColoredAreas.class, element);
//								JvmParameterizedTypeReference superTypeRef = typeReferences.createTypeRef(superType);
//								JvmType interfaceType = typeReferences.findDeclaredType(ISprayGradient.class, element);
//								JvmParameterizedTypeReference interfaceTypeRef = typeReferences.createTypeRef(interfaceType);
//								JvmGenericType genericType = typesFactory.createJvmGenericType();
//								genericType.setPackageName("org.eclipselabs.spray.styles.gradients");
//								genericType.setSimpleName(gradient.getName());
//								genericType.getSuperTypes().add(superTypeRef);
//								genericType.getSuperTypes().add(interfaceTypeRef);
//								genericType.setVisibility(JvmVisibility.PUBLIC);
//								jvmModelAssociator.associatePrimary(element, genericType);
//								type = genericType;
//							}
//							descs.add(EObjectDescription.create(
//									type.getIdentifier(),
//									type));
//						}
//					}
//				}
//			}
//		}
//	
//		Predicate<IEObjectDescription> gradientFilter = new GradientScopeRestrictor();
//		IScope result = new FilteringScope(typesScope, gradientFilter);
//		for (IEObjectDescription element : result.getAllElements()) {
//			System.err.println(element);
//		}
//		IScope newResult = new SimpleScope(descs);
//		return newResult;
//	}

//	@Inject
//	private ResourceDescriptionsProvider resourceDescriptionsProvider;
//	
//	@Inject
//	IContainer.Manager manager;
//	
//	public EList<Resource> getVisibleResources(Resource myResource) {
//		IResourceDescriptions descriptions = resourceDescriptionsProvider
//				.getResourceDescriptions(myResource);
//		return getVisibleResources(myResource, descriptions);
//	}
//	
//	private EList<Resource> getVisibleResources(Resource origin,
//			IResourceDescriptions index) {
//		IResourceDescription descr = index.getResourceDescription(origin
//				.getURI());
//		EList<Resource> result = new BasicEList<Resource>();
//		if (descr != null) {
//			for (IContainer visibleContainer : manager.getVisibleContainers(
//					descr, index)) {
//				for (IResourceDescription visibleResourceDesc : visibleContainer
//						.getResourceDescriptions()) {
//					result.add(origin.getResourceSet().getResource(
//							visibleResourceDesc.getURI(), true));
//				}
//			}
//		}
//		return result;
//	}
}
