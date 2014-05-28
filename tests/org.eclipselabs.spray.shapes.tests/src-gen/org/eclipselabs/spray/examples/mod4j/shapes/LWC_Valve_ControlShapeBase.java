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
public class LWC_Valve_ControlShapeBase extends DefaultSprayShape {
    
    public static enum TextIds {
        shapeName
    }
    
    public LWC_Valve_ControlShapeBase(IFeatureProvider fp) {
        super(fp);
    }
    
    @Override
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
        // Create a ContainerShape for this Shape
        Diagram diagram = peService.getDiagramForShape(targetContainer);
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
        SprayLayoutService.setId(containerShape, "LWC_Valve_Control.containerShape");
        
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
        gaService.setLocationAndSize(element_0, 0, 0, 120, 120);
        
        // Invisible rectangle around the elements (because more then one element is on first layer).
        ContainerShape invisibleShape = peCreateService.createContainerShape(containerShape, false);
        SprayLayoutService.setId(invisibleShape, "LWC_Valve_Control.invisibleShape");
        SprayLayoutType layout_1 = SprayLayoutType.TOP;
        SprayLayoutService.setLayoutManager(containerShape, layout_1, 0, 0);
        
        GraphicsAlgorithm element_1 = gaService.createPlainRectangle(invisibleShape);
        element_1.setStyle(sprayStyle.getStyle(diagram));
        element_1.setFilled(false);
        element_1.setLineVisible(false);
        gaService.setLocationAndSize(element_1, 0, 0, 120, 120);
        
        createElement_2(diagram, containerShape, sprayStyle);
        createElement_3(diagram, containerShape, sprayStyle);
        createElement_4(diagram, containerShape, sprayStyle);
        createElement_5(diagram, containerShape, sprayStyle);
        
        
        // Set start values for height and width as properties on the element for Layout Feature
        SprayLayoutManager.setSizePictogramProperties(containerShape);
    }
    
    protected Shape createElement_2(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_2 = new ArrayList<Point>();
        pointList_2.add(gaService.createPoint(0, 60, 0, 0));
        pointList_2.add(gaService.createPoint(120, 120, 0, 0));
        pointList_2.add(gaService.createPoint(120, 60, 0, 0));
        pointList_2.add(gaService.createPoint(0, 120, 0, 0));
        ContainerShape shape_2 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_2, "LWC_Valve_Control.shape_2");
        Polygon element_2 = gaService.createPlainPolygon(shape_2, pointList_2);
        ISprayStyle style_2 = sprayStyle;
        element_2.setStyle(style_2.getStyle(diagram));
        IDimension size_2 = gaService.calculateSize(element_2);
        SprayLayoutManager.resizePolygon(element_2, size_2, 1, 1);
        gaService.setLocationAndSize(element_2, element_2.getX(), element_2.getY(), size_2.getWidth(), size_2.getHeight());
        SprayLayoutService.setLayoutData(shape_2, size_2.getWidth(), size_2.getHeight(), true);
        return shape_2;
    }
    protected Shape createElement_3(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_3 = new ArrayList<Point>();
        pointList_3.add(gaService.createPoint(60, 30, 0, 0));
        pointList_3.add(gaService.createPoint(60, 90, 0, 0));
        Shape shape_3 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_3, "LWC_Valve_Control.shape_3");
        Polyline element_3 = gaService.createPlainPolyline(shape_3, pointList_3);
        ISprayStyle style_3 = sprayStyle;
        element_3.setStyle(style_3.getStyle(diagram));
        return shape_3;
    }
    protected Shape createElement_4(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_4 = new ArrayList<Point>();
        pointList_4.add(gaService.createPoint(40, 30, 0, 0));
        pointList_4.add(gaService.createPoint(60, 0, 30, 30));
        pointList_4.add(gaService.createPoint(80, 30, 0, 0));
        ContainerShape shape_4 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_4, "LWC_Valve_Control.shape_4");
        Polygon element_4 = gaService.createPlainPolygon(shape_4, pointList_4);
        ISprayStyle style_4 = sprayStyle;
        element_4.setStyle(style_4.getStyle(diagram));
        IDimension size_4 = gaService.calculateSize(element_4);
        SprayLayoutManager.resizePolygon(element_4, size_4, 1, 1);
        gaService.setLocationAndSize(element_4, element_4.getX(), element_4.getY(), size_4.getWidth(), size_4.getHeight());
        SprayLayoutService.setLayoutData(shape_4, size_4.getWidth(), size_4.getHeight(), true);
        return shape_4;
    }
    protected Shape createElement_5(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        Shape shape_5 = peCreateService.createShape(parentShape, false);
        SprayLayoutService.setId(shape_5, "LWC_Valve_Control.shape_5");
        Text element_5 = gaService.createPlainText(shape_5);
        ISprayStyle style_5 = sprayStyle;
        element_5.setStyle(style_5.getStyle(diagram));
        gaService.setLocationAndSize(element_5, 30, 100, 60, 20);
        SprayLayoutService.setLayoutData(shape_5, 60, 20, true);
        element_5.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        element_5.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
        peService.setPropertyValue(element_5, ISprayConstants.TEXT_ID, TextIds.shapeName.name());
        peService.setPropertyValue(shape_5, ISprayConstants.TEXT_ID, TextIds.shapeName.name());
        element_5.setValue("");
        getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(element_5);
        return shape_5;
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
