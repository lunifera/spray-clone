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
public class LWC_SystemEndShapeBase extends DefaultSprayShape {
    
    public static enum TextIds {
    }
    
    public LWC_SystemEndShapeBase(IFeatureProvider fp) {
        super(fp);
    }
    
    @Override
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
        // Create a ContainerShape for this Shape
        Diagram diagram = peService.getDiagramForShape(targetContainer);
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
        SprayLayoutService.setId(containerShape, "LWC_SystemEnd.containerShape");
        
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
        gaService.setLocationAndSize(element_0, 0, 0, 20, 90);
        
        
        createElement_1(diagram, containerShape, sprayStyle);
        
        
        // Set start values for height and width as properties on the element for Layout Feature
        SprayLayoutManager.setSizePictogramProperties(containerShape);
    }
    
    protected Shape createElement_1(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {
        List<Point> pointList_1 = new ArrayList<Point>();
        pointList_1.add(gaService.createPoint(10, 30, 0, 0));
        pointList_1.add(gaService.createPoint(20, 45, 30, 30));
        pointList_1.add(gaService.createPoint(10, 60, 0, 0));
        pointList_1.add(gaService.createPoint(0, 75, 30, 30));
        pointList_1.add(gaService.createPoint(10, 90, 0, 0));
        ContainerShape shape_1 = peCreateService.createContainerShape(parentShape, false);
        SprayLayoutService.setId(shape_1, "LWC_SystemEnd.shape_1");
        Polyline element_1 = gaService.createPlainPolyline(shape_1, pointList_1);
        ISprayStyle style_1 = sprayStyle;
        element_1.setStyle(style_1.getStyle(diagram));
        element_1.setLineWidth(3);
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
