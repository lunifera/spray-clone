/**
 * This is a generated Shape for Spray
 */
package org.eclipselabs.spray.examples.mod4j.shapes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.*;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayConnection;


@SuppressWarnings("all")
public class ConnectionWithTextConnectionBase extends DefaultSprayConnection {
	
	private IGaService gaService = Graphiti.getGaService();
	private IPeService peService = Graphiti.getPeService();
	private IPeCreateService peCreateService = Graphiti.getPeCreateService();
	
	public static enum TextIds {
		text1,
		text2
	}
	   
	   public ConnectionWithTextConnectionBase(final IFeatureProvider fp) {
	super(fp);
	}
	   
	@Override
	public Connection getConnection(final Diagram diagram, ISprayStyle sprayStyle, final Anchor startAnchor, final Anchor endAnchor) {
		final Connection connection = peCreateService.createFreeFormConnection(diagram);
		connection.setStart(startAnchor);
		connection.setEnd(endAnchor);
		
		
		final Polyline polyline = gaService.createPolyline(connection);
		polyline.setStyle(sprayStyle.getStyle(diagram));

		// Define general layout of connection
		
		// Set the Placings of the connection
		createConnectionDecorators(diagram, connection, sprayStyle);
		
		return connection;
	}
	
	// START GENERATING CONNECTION DECORATOR METHODS
	protected void createConnectionDecorators(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {
	    createDecorator_1(diagram, connection, sprayStyle);
	    createDecorator_2(diagram, connection, sprayStyle);
	    createDecorator_3(diagram, connection, sprayStyle);
	    createDecorator_4(diagram, connection, sprayStyle);
	}
	
	protected ConnectionDecorator createDecorator_1(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {
		ConnectionDecorator decorator_1 = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		List<Point> pointList = new ArrayList<Point>();
		pointList.add(gaService.createPoint(-10, 10, 0, 0));
		pointList.add(gaService.createPoint(0, 0, 0, 0));
		pointList.add(gaService.createPoint(-10, -10, 0, 0));
		Polygon element = gaService.createPolygon(decorator_1, pointList);
		ISprayStyle style = sprayStyle;
		element.setStyle(style.getStyle(diagram));
		element.setBackground(gaService.manageColor(diagram,IColorConstant.BLACK));
		return decorator_1;
	}
	protected ConnectionDecorator createDecorator_2(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {
		ConnectionDecorator decorator_2 = peCreateService.createConnectionDecorator(connection, false, 0.0, true);
		List<Point> pointList = new ArrayList<Point>();
		pointList.add(gaService.createPoint(0, 0, 0, 0));
		pointList.add(gaService.createPoint(-20, 10, 0, 0));
		pointList.add(gaService.createPoint(-40, 0, 0, 0));
		pointList.add(gaService.createPoint(-20, -10, 0, 0));
		Polygon element = gaService.createPolygon(decorator_2, pointList);
		ISprayStyle style = sprayStyle;
		element.setStyle(style.getStyle(diagram));
		return decorator_2;
	}
	protected ConnectionDecorator createDecorator_3(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {
		ConnectionDecorator decorator_3 = peCreateService.createConnectionDecorator(connection, false, 0.5, true);
		decorator_3.setActive(true);
		Text element = gaService.createText(decorator_3);
		ISprayStyle style = sprayStyle;
		element.setStyle(style.getStyle(diagram));
		element.setForeground(style.getFontColor(diagram));
		gaService.setLocationAndSize(element, 0, -20, 100, 20);
		element.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		element.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		element.setValue("");
		peService.setPropertyValue(element, ISprayConstants.TEXT_ID, TextIds.text1.name());
		IDirectEditingInfo deinfo = getFeatureProvider().getDirectEditingInfo();
		deinfo.setMainPictogramElement(connection);
		deinfo.setPictogramElement(decorator_3);
		deinfo.setGraphicsAlgorithm(element);
		return decorator_3;
	}
	protected ConnectionDecorator createDecorator_4(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {
		ConnectionDecorator decorator_4 = peCreateService.createConnectionDecorator(connection, false, 0.5, true);
		decorator_4.setActive(true);
		Text element = gaService.createText(decorator_4);
		ISprayStyle style = sprayStyle;
		element.setStyle(style.getStyle(diagram));
		element.setForeground(style.getFontColor(diagram));
		gaService.setLocationAndSize(element, 0, 20, 100, 20);
		element.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		element.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		element.setValue("");
		peService.setPropertyValue(element, ISprayConstants.TEXT_ID, TextIds.text2.name());
		IDirectEditingInfo deinfo = getFeatureProvider().getDirectEditingInfo();
		deinfo.setMainPictogramElement(connection);
		deinfo.setPictogramElement(decorator_4);
		deinfo.setGraphicsAlgorithm(element);
		return decorator_4;
	}
	// STOP GENERATING CONNECTION DECORATOR METHODS
	
}
