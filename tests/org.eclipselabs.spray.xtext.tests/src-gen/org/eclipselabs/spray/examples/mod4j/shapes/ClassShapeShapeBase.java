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
public class ClassShapeShapeBase extends DefaultSprayShape {
    
    public static enum TextIds {
        classname,
        attributes,
        businessrules
    }
    
    public ClassShapeShapeBase(IFeatureProvider fp) {
        super(fp);
    }
    
    @Override
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
        // Create a ContainerShape for this Shape
        Diagram diagram = peService.getDiagramForShape(targetContainer);
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
        SprayLayoutService.setId(containerShape, "ClassShape.containerShape");
        
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
        gaService.setLocationAndSize(element_0, 0, 0, 100, 80);
        
        
        createElement_1(diagram, containerShape, sprayStyle);
        
        
        // Set start values for height and width as properties on the element for Layout Feature
        SprayLayoutManager.setSizePictogramProperties(containerShape);
    }
    
    protected Shape createElement_2(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        Shape shape_2 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_2, "ClassShape.shape_2");
        Text element_2 = gaService.createPlainText(shape_2);
        ISprayStyle style_2 = new org.eclipselabs.spray.examples.mod4j.styles.FontStyle();
        element_2.setStyle(style_2.getStyle(diagram));
        gaService.setLocationAndSize(element_2, 0, 0, 100, 20);
        SprayLayoutService.setLayoutData(shape_2, 100, 20, true);
        element_2.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        element_2.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
        peService.setPropertyValue(element_2, ISprayConstants.TEXT_ID, TextIds.classname.name());
        peService.setPropertyValue(shape_2, ISprayConstants.TEXT_ID, TextIds.classname.name());
        element_2.setValue("");
        getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(element_2);
        return shape_2;
    }
    protected Shape createElement_3(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_3 = new ArrayList<Point>();
        pointList_3.add(gaService.createPoint(0, 21, 0, 0));
        pointList_3.add(gaService.createPoint(100, 21, 0, 0));
        Shape shape_3 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_3, "ClassShape.shape_3");
        Polyline element_3 = gaService.createPlainPolyline(shape_3, pointList_3);
        ISprayStyle style_3 = sprayStyle;
        element_3.setStyle(style_3.getStyle(diagram));
        return shape_3;
    }
    protected Shape createElement_4(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_4 = peCreateService.createContainerShape(parentShape, true);
        SprayLayoutService.setId(shape_4, "ClassShape.shape_4");
        SprayLayoutService.setCompartment(shape_4, true);
        GraphitiProperties.set(shape_4, ISprayConstants.TEXT_ID, "attributes");
        SprayLayoutType layout_4 = SprayLayoutType.VERTICAL;
        SprayLayoutService.setLayoutManager(shape_4, layout_4, 5, 1, true);
        SprayLayoutService.setLayoutData(shape_4, 100, 26);
        SprayLayoutService.getLayoutData(shape_4).setHorizontalStrechable(true);
        Rectangle element_4 = gaService.createPlainRectangle(shape_4);
        ISprayStyle style_4 = sprayStyle;
        element_4.setStyle(style_4.getStyle(diagram));
        gaService.setLocationAndSize(element_4, 0, 22, 100, 26);
        SprayLayoutService.setLayoutData(shape_4, 100, 26, true);
        element_4.setFilled(false);
        element_4.setLineVisible(false);
        return shape_4;
    }
    protected Shape createElement_5(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_5 = new ArrayList<Point>();
        pointList_5.add(gaService.createPoint(0, 48, 0, 0));
        pointList_5.add(gaService.createPoint(100, 48, 0, 0));
        Shape shape_5 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_5, "ClassShape.shape_5");
        Polyline element_5 = gaService.createPlainPolyline(shape_5, pointList_5);
        ISprayStyle style_5 = sprayStyle;
        element_5.setStyle(style_5.getStyle(diagram));
        return shape_5;
    }
    protected Shape createElement_6(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_6 = peCreateService.createContainerShape(parentShape, true);
        SprayLayoutService.setId(shape_6, "ClassShape.shape_6");
        SprayLayoutService.setCompartment(shape_6, true);
        GraphitiProperties.set(shape_6, ISprayConstants.TEXT_ID, "businessrules");
        SprayLayoutType layout_6 = SprayLayoutType.VERTICAL;
        SprayLayoutService.setLayoutManager(shape_6, layout_6, 20, 10, true);
        SprayLayoutService.setLayoutData(shape_6, 100, 26);
        Rectangle element_6 = gaService.createPlainRectangle(shape_6);
        ISprayStyle style_6 = sprayStyle;
        element_6.setStyle(style_6.getStyle(diagram));
        gaService.setLocationAndSize(element_6, 0, 48, 100, 26);
        SprayLayoutService.setLayoutData(shape_6, 100, 26, true);
        element_6.setFilled(false);
        element_6.setLineVisible(false);
        return shape_6;
    }
    protected Shape createElement_1(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_1 = peCreateService.createContainerShape(parentShape, true);
        SprayLayoutService.setId(shape_1, "ClassShape.shape_1");
        SprayLayoutService.setCompartment(shape_1, true);
        SprayLayoutType layout_1 = SprayLayoutType.VERTICAL;
        SprayLayoutService.setLayoutManager(shape_1, layout_1, 0, 0, true);
        SprayLayoutService.setLayoutData(shape_1, 100, 80);
        Rectangle element_1 = gaService.createPlainRectangle(shape_1);
        ISprayStyle style_1 = sprayStyle;
        element_1.setStyle(style_1.getStyle(diagram));
        gaService.setLocationAndSize(element_1, 0, 0, 100, 80);
        SprayLayoutService.setLayoutData(shape_1, 100, 80, true);
        createElement_2(diagram, shape_1, style_1);
        createElement_3(diagram, shape_1, style_1);
        createElement_4(diagram, shape_1, style_1);
        createElement_5(diagram, shape_1, style_1);
        createElement_6(diagram, shape_1, style_1);
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
