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
public class UniqueRuleShapeShapeBase extends DefaultSprayShape {
    
    public static enum TextIds {
        DUMMY,
        uniqueRuleName,
        properties
    }
    
    public UniqueRuleShapeShapeBase(IFeatureProvider fp) {
        super(fp);
    }
    
    @Override
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
        // Create a ContainerShape for this Shape
        Diagram diagram = peService.getDiagramForShape(targetContainer);
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
        SprayLayoutService.setId(containerShape, "UniqueRuleShape.containerShape");
        
        // define general layout for ContainerShape
        sprayStyle = new org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle();
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
        gaService.setLocationAndSize(element_0, 0, 0, 90, 20);
        
        
        createElement_1(diagram, containerShape, sprayStyle);
        
        
        // Set start values for height and width as properties on the element for Layout Feature
        SprayLayoutManager.setSizePictogramProperties(containerShape);
    }
    
    protected Shape createElement_2(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        Shape shape_2 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_2, "UniqueRuleShape.shape_2");
        Text element_2 = gaService.createPlainText(shape_2);
        ISprayStyle style_2 = new org.eclipselabs.spray.examples.mod4j.styles.FontStyle();
        element_2.setStyle(style_2.getStyle(diagram));
        gaService.setLocationAndSize(element_2, 0, 0, 20, 25);
        SprayLayoutService.setLayoutData(shape_2, 20, 25, true);
        element_2.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        element_2.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
        peService.setPropertyValue(element_2, ISprayConstants.TEXT_ID, TextIds.uniqueRuleName.name());
        peService.setPropertyValue(shape_2, ISprayConstants.TEXT_ID, TextIds.uniqueRuleName.name());
        element_2.setValue("");
        getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(element_2);
        return shape_2;
    }
    protected Shape createElement_3(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_3 = peCreateService.createContainerShape(parentShape, true);
        SprayLayoutService.setId(shape_3, "UniqueRuleShape.shape_3");
        SprayLayoutService.setCompartment(shape_3, true);
        GraphitiProperties.set(shape_3, ISprayConstants.TEXT_ID, "properties");
        SprayLayoutType layout_3 = SprayLayoutType.VERTICAL;
        SprayLayoutService.setLayoutManager(shape_3, layout_3, 5, 5, true);
        SprayLayoutService.setLayoutData(shape_3, 90, 20);
        Rectangle element_3 = gaService.createPlainRectangle(shape_3);
        ISprayStyle style_3 = sprayStyle;
        element_3.setStyle(style_3.getStyle(diagram));
        gaService.setLocationAndSize(element_3, 0, 0, 90, 20);
        SprayLayoutService.setLayoutData(shape_3, 90, 20, true);
        element_3.setFilled(false);
        element_3.setLineVisible(false);
        return shape_3;
    }
    protected Shape createElement_1(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_1 = peCreateService.createContainerShape(parentShape, true);
        SprayLayoutService.setId(shape_1, "UniqueRuleShape.shape_1");
        SprayLayoutService.setCompartment(shape_1, true);
        GraphitiProperties.set(shape_1, ISprayConstants.TEXT_ID, "DUMMY");
        SprayLayoutType layout_1 = SprayLayoutType.HORIZONTAL;
        SprayLayoutService.setLayoutManager(shape_1, layout_1, 5, 5, true);
        SprayLayoutService.setLayoutData(shape_1, 90, 20);
        Rectangle element_1 = gaService.createPlainRectangle(shape_1);
        ISprayStyle style_1 = new org.eclipselabs.spray.examples.mod4j.styles.Unique();
        element_1.setStyle(style_1.getStyle(diagram));
        gaService.setLocationAndSize(element_1, 0, 0, 90, 20);
        SprayLayoutService.setLayoutData(shape_1, 90, 20, true);
        createElement_2(diagram, shape_1, style_1);
        createElement_3(diagram, shape_1, style_1);
        return shape_1;
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
