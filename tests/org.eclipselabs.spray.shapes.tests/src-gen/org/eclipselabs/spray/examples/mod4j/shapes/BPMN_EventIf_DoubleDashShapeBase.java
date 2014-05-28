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
public class BPMN_EventIf_DoubleDashShapeBase extends DefaultSprayShape {
    
    public static enum TextIds {
    }
    
    public BPMN_EventIf_DoubleDashShapeBase(IFeatureProvider fp) {
        super(fp);
    }
    
    @Override
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
        // Create a ContainerShape for this Shape
        Diagram diagram = peService.getDiagramForShape(targetContainer);
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
        SprayLayoutService.setId(containerShape, "BPMN_EventIf_DoubleDash.containerShape");
        
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
        gaService.setLocationAndSize(element_0, 0, 0, 50, 50);
        
        
        createElement_1(diagram, containerShape, sprayStyle);
        
        
        // Set start values for height and width as properties on the element for Layout Feature
        SprayLayoutManager.setSizePictogramProperties(containerShape);
    }
    
    protected Shape createElement_4(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_4 = new ArrayList<Point>();
        pointList_4.add(gaService.createPoint(2, 2, 0, 0));
        pointList_4.add(gaService.createPoint(18, 2, 0, 0));
        Shape shape_4 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_4, "BPMN_EventIf_DoubleDash.shape_4");
        Polyline element_4 = gaService.createPlainPolyline(shape_4, pointList_4);
        ISprayStyle style_4 = sprayStyle;
        element_4.setStyle(style_4.getStyle(diagram));
        return shape_4;
    }
    protected Shape createElement_5(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_5 = new ArrayList<Point>();
        pointList_5.add(gaService.createPoint(2, 8, 0, 0));
        pointList_5.add(gaService.createPoint(18, 8, 0, 0));
        Shape shape_5 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_5, "BPMN_EventIf_DoubleDash.shape_5");
        Polyline element_5 = gaService.createPlainPolyline(shape_5, pointList_5);
        ISprayStyle style_5 = sprayStyle;
        element_5.setStyle(style_5.getStyle(diagram));
        return shape_5;
    }
    protected Shape createElement_6(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_6 = new ArrayList<Point>();
        pointList_6.add(gaService.createPoint(2, 16, 0, 0));
        pointList_6.add(gaService.createPoint(18, 16, 0, 0));
        Shape shape_6 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_6, "BPMN_EventIf_DoubleDash.shape_6");
        Polyline element_6 = gaService.createPlainPolyline(shape_6, pointList_6);
        ISprayStyle style_6 = sprayStyle;
        element_6.setStyle(style_6.getStyle(diagram));
        return shape_6;
    }
    protected Shape createElement_7(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_7 = new ArrayList<Point>();
        pointList_7.add(gaService.createPoint(2, 22, 0, 0));
        pointList_7.add(gaService.createPoint(18, 22, 0, 0));
        Shape shape_7 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_7, "BPMN_EventIf_DoubleDash.shape_7");
        Polyline element_7 = gaService.createPlainPolyline(shape_7, pointList_7);
        ISprayStyle style_7 = sprayStyle;
        element_7.setStyle(style_7.getStyle(diagram));
        return shape_7;
    }
    protected Shape createElement_3(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_3 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_3, "BPMN_EventIf_DoubleDash.shape_3");
        SprayLayoutService.setCompartment(shape_3, false);
        Rectangle element_3 = gaService.createPlainRectangle(shape_3);
        ISprayStyle style_3 = sprayStyle;
        element_3.setStyle(style_3.getStyle(diagram));
        gaService.setLocationAndSize(element_3, 13, 10, 20, 25);
        SprayLayoutService.setLayoutData(shape_3, 20, 25, true);
        createElement_4(diagram, shape_3, style_3);
        createElement_5(diagram, shape_3, style_3);
        createElement_6(diagram, shape_3, style_3);
        createElement_7(diagram, shape_3, style_3);
        return shape_3;
    }
    protected Shape createElement_2(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_2 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_2, "BPMN_EventIf_DoubleDash.shape_2");
        SprayLayoutService.setCompartment(shape_2, false);
        
        Ellipse element_2 = gaService.createPlainEllipse(shape_2);
        ISprayStyle style_2 = sprayStyle;
        element_2.setStyle(style_2.getStyle(diagram));
        gaService.setLocationAndSize(element_2, 2, 2, 46, 46);
        SprayLayoutService.setLayoutData(shape_2, 46, 46, true);
        element_2.setLineStyle(LineStyle.DASH);
        createElement_3(diagram, shape_2, style_2);
        return shape_2;
    }
    protected Shape createElement_1(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_1 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_1, "BPMN_EventIf_DoubleDash.shape_1");
        SprayLayoutService.setCompartment(shape_1, false);
        
        Ellipse element_1 = gaService.createPlainEllipse(shape_1);
        ISprayStyle style_1 = sprayStyle;
        element_1.setStyle(style_1.getStyle(diagram));
        gaService.setLocationAndSize(element_1, 0, 0, 50, 50);
        SprayLayoutService.setLayoutData(shape_1, 50, 50, true);
        element_1.setLineStyle(LineStyle.DASH);
        createElement_2(diagram, shape_1, style_1);
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
