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
public class BPMN_Gateway_EventShapeBase extends DefaultSprayShape {
    
    public static enum TextIds {
    }
    
    public BPMN_Gateway_EventShapeBase(IFeatureProvider fp) {
        super(fp);
    }
    
    @Override
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
        // Create a ContainerShape for this Shape
        Diagram diagram = peService.getDiagramForShape(targetContainer);
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
        SprayLayoutService.setId(containerShape, "BPMN_Gateway_Event.containerShape");
        
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
        gaService.setLocationAndSize(element_0, 0, 0, 60, 60);
        
        
        createElement_1(diagram, containerShape, sprayStyle);
        
        
        // Set start values for height and width as properties on the element for Layout Feature
        SprayLayoutManager.setSizePictogramProperties(containerShape);
    }
    
    protected Shape createElement_4(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_4 = new ArrayList<Point>();
        pointList_4.add(gaService.createPoint(16, 3, 0, 0));
        pointList_4.add(gaService.createPoint(28, 11, 0, 0));
        pointList_4.add(gaService.createPoint(24, 27, 0, 0));
        pointList_4.add(gaService.createPoint(8, 27, 0, 0));
        pointList_4.add(gaService.createPoint(4, 11, 0, 0));
        pointList_4.add(gaService.createPoint(16, 3, 0, 0));
        ContainerShape shape_4 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_4, "BPMN_Gateway_Event.shape_4");
        Polyline element_4 = gaService.createPlainPolyline(shape_4, pointList_4);
        ISprayStyle style_4 = sprayStyle;
        element_4.setStyle(style_4.getStyle(diagram));
        return shape_4;
    }
    protected Shape createElement_3(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_3 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_3, "BPMN_Gateway_Event.shape_3");
        SprayLayoutService.setCompartment(shape_3, false);
        
        Ellipse element_3 = gaService.createPlainEllipse(shape_3);
        ISprayStyle style_3 = sprayStyle;
        element_3.setStyle(style_3.getStyle(diagram));
        gaService.setLocationAndSize(element_3, 2, 2, 33, 33);
        SprayLayoutService.setLayoutData(shape_3, 33, 33, true);
        createElement_4(diagram, shape_3, style_3);
        return shape_3;
    }
    protected Shape createElement_2(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        ContainerShape shape_2 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_2, "BPMN_Gateway_Event.shape_2");
        SprayLayoutService.setCompartment(shape_2, false);
        
        Ellipse element_2 = gaService.createPlainEllipse(shape_2);
        ISprayStyle style_2 = sprayStyle;
        element_2.setStyle(style_2.getStyle(diagram));
        gaService.setLocationAndSize(element_2, 12, 12, 37, 37);
        SprayLayoutService.setLayoutData(shape_2, 37, 37, true);
        createElement_3(diagram, shape_2, style_2);
        return shape_2;
    }
    protected Shape createElement_1(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_1 = new ArrayList<Point>();
        pointList_1.add(gaService.createPoint(0, 30, 0, 0));
        pointList_1.add(gaService.createPoint(30, 0, 0, 0));
        pointList_1.add(gaService.createPoint(60, 30, 0, 0));
        pointList_1.add(gaService.createPoint(30, 60, 0, 0));
        ContainerShape shape_1 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_1, "BPMN_Gateway_Event.shape_1");
        Polygon element_1 = gaService.createPlainPolygon(shape_1, pointList_1);
        ISprayStyle style_1 = sprayStyle;
        element_1.setStyle(style_1.getStyle(diagram));
        IDimension size_1 = gaService.calculateSize(element_1);
        SprayLayoutManager.resizePolygon(element_1, size_1, 1, 1);
        gaService.setLocationAndSize(element_1, element_1.getX(), element_1.getY(), size_1.getWidth(), size_1.getHeight());
        SprayLayoutService.setLayoutData(shape_1, size_1.getWidth(), size_1.getHeight(), true);
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
