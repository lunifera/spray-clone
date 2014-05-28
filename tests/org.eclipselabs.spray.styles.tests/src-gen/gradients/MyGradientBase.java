/**
 * This is a generated Gradient class for Spray.
 */
package gradients;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.util.IGradientType;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient;
import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
import org.eclipse.graphiti.util.PredefinedColoredAreas;

/**
 * Description: 
 */
@SuppressWarnings("all")
public class MyGradientBase extends PredefinedColoredAreas implements ISprayGradient {
    
    /**
     * This method returns the gradient color area.
     * Description: 
     */
     public GradientColoredAreas getGradientColoredAreas( ) {
         final GradientColoredAreas gradientColoredAreas = org.eclipse.graphiti.mm.algorithms.styles.StylesFactory.eINSTANCE.createGradientColoredAreas();
         final EList<org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();
         
         return gradientColoredAreas;
     }

}
