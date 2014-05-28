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
public class AssociationConnectionConnectionBase extends DefaultSprayConnection {
	
	private IGaService gaService = Graphiti.getGaService();
	private IPeService peService = Graphiti.getPeService();
	private IPeCreateService peCreateService = Graphiti.getPeCreateService();
	
	public static enum TextIds {
		assocText
	}
	   
	   public AssociationConnectionConnectionBase(final IFeatureProvider fp) {
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
	}
	
	protected ConnectionDecorator createDecorator_1(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {
		ConnectionDecorator decorator_1 = peCreateService.createConnectionDecorator(connection, false, 0.5, true);
		decorator_1.setActive(true);
		Text element = gaService.createText(decorator_1);
		ISprayStyle style = new org.eclipselabs.spray.examples.mod4j.styles.FontStyle();
		element.setStyle(style.getStyle(diagram));
		element.setForeground(style.getFontColor(diagram));
		gaService.setLocationAndSize(element, 0, -10, 60, 20);
		element.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		element.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
		element.setValue("");
		peService.setPropertyValue(element, ISprayConstants.TEXT_ID, TextIds.assocText.name());
		IDirectEditingInfo deinfo = getFeatureProvider().getDirectEditingInfo();
		deinfo.setMainPictogramElement(connection);
		deinfo.setPictogramElement(decorator_1);
		deinfo.setGraphicsAlgorithm(element);
		return decorator_1;
	}
	// STOP GENERATING CONNECTION DECORATOR METHODS
	
}
