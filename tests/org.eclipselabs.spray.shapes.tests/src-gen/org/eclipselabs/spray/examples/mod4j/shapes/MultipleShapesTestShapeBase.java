/**
 * This is a generated Shape for Spray
 */
package org.eclipselabs.spray.examples.mod4j.shapes;

import java.util.List;
import java.util.ArrayList;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.*;

import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayAbstractLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutType;

import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

@SuppressWarnings("all")
public class MultipleShapesTestShapeBase extends DefaultSprayShape {
    
    public static enum TextIds {
    }
    
    public MultipleShapesTestShapeBase(IFeatureProvider fp) {
        super(fp);
    }
    
    @Override
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
        // Create a ContainerShape for this Shape
        Diagram diagram = peService.getDiagramForShape(targetContainer);
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
        SprayLayoutService.setId(containerShape, "MultipleShapesTest.containerShape");
        
        // define general layout for ContainerShape
        sprayStyle.getStyle(diagram).setProportional(false);
        sprayStyle.getStyle(diagram).setStretchH(false);
        sprayStyle.getStyle(diagram).setStretchV(false);
        
        // layout data
        SprayLayoutType containerLayout = SprayLayoutType.FIT;
        SprayLayoutService.setLayoutManager(containerShape, containerLayout, 0, 0, true);
        SprayLayoutService.getLayoutData(containerShape).setVisible(true);
        
        createCascadedElements(diagram, containerShape, sprayStyle);
        createAnchorPoints(diagram, containerShape);
        
        // Fix the broken coordinate syaten for not active container shapes
        SprayAbstractLayoutManager.fixOffset(containerShape);
        
        return containerShape;
    }
    
    // START GENERATING CASCADED ELEMENTS
    protected void createCascadedElements(Diagram diagram, ContainerShape containerShape, ISprayStyle sprayStyle) {
        IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
        directEditingInfo.setMainPictogramElement(containerShape);
        directEditingInfo.setPictogramElement(containerShape);
        
        GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
        element_0.setStyle(sprayStyle.getStyle(diagram));
        SprayLayoutService.setShapeFromDsl(containerShape, true);
        gaService.setLocationAndSize(element_0, 0, 0, 500, 500);
        
        // Invisible rectangle around the elements (because more then one element is on first layer).
        ContainerShape invisibleShape = peCreateService.createContainerShape(containerShape, false);
        SprayLayoutService.setId(invisibleShape, "MultipleShapesTest.invisibleShape");
        SprayLayoutType layout_1 = SprayLayoutType.TOP;
        SprayLayoutService.setLayoutManager(containerShape, layout_1, 0, 0);
        
        GraphicsAlgorithm element_1 = gaService.createPlainRectangle(invisibleShape);
        element_1.setStyle(sprayStyle.getStyle(diagram));
        element_1.setFilled(false);
        element_1.setLineVisible(false);
        gaService.setLocationAndSize(element_1, 0, 0, 500, 500);
        
        createElement_2(diagram, containerShape, sprayStyle);
        createElement_3(diagram, containerShape, sprayStyle);
        
        
        // Set start values for height and width as properties on the element for Layout Feature
        SprayLayoutManager.setSizePictogramProperties(containerShape);
    }
    
    protected Shape createElement_2(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_2 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_2, "MultipleShapesTest.shape_2");
        SprayLayoutService.setCompartment(shape_2, false);
        
        Ellipse element_2 = gaService.createPlainEllipse(shape_2);
        ISprayStyle style_2 = sprayStyle;
        element_2.setStyle(style_2.getStyle(diagram));
        gaService.setLocationAndSize(element_2, 0, 0, 500, 500);
        SprayLayoutService.setLayoutData(shape_2, 500, 500, true);
        return shape_2;
    }
    protected Shape createElement_3(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_3 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_3, "MultipleShapesTest.shape_3");
        SprayLayoutService.setCompartment(shape_3, false);
        Rectangle element_3 = gaService.createPlainRectangle(shape_3);
        ISprayStyle style_3 = sprayStyle;
        element_3.setStyle(style_3.getStyle(diagram));
        gaService.setLocationAndSize(element_3, 0, 450, 50, 50);
        SprayLayoutService.setLayoutData(shape_3, 50, 50, true);
        return shape_3;
    }
    // STOP GENERATING CASCADED ELEMENTS
    
    protected void createAnchorPoints(Diagram diagram, ContainerShape containerShape) {
        peCreateService.createChopboxAnchor(containerShape);
    }
    
    public SprayLayoutManager getShapeLayout() {
        SprayLayoutManager layoutManager = new SprayLayoutManager();
        layoutManager.setMinSizeWidth(-1);
        layoutManager.setMaxSizeWidth(-1);
        layoutManager.setMinSizeHeight(-1);
        layoutManager.setMaxSizeHeight(-1);
        layoutManager.setStretchHorizontal(true);
        layoutManager.setStretchVertical(true);
        return layoutManager;
    }
    
}
