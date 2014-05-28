/**
 * This is a generated Style class for Spray.
 */
package org.eclipselabs.spray.examples.mod4j.styles;

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.util.IGradientType;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;

/**
 * This is a generated Style class for Spray.
 * Description: 
 */
@SuppressWarnings("all")
public class LWC2012CorporateStyleBase extends org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle {
    
    /**
     * The IGaService instance for the whole class.
     */
    private IGaService gaService = Graphiti.getGaService();
    
    /**
     * This method creates and defines a Style and returns it. 
     * Description: 
     * 
     * @return The defined Style
     */
    @Override
    public Style newStyle(Diagram diagram) {
        Style style = super.newStyle(diagram);
        style.setId("LWC2012CorporateStyle");
        style.setDescription("");
        
        defineStyleTransparency(diagram, style);
        defineBackground(diagram, style);
        defineLineAttributes(diagram, style);
        defineFontAttributes(diagram, style);
        
        return style;
    }
    
    /**
     * This method will be called from the newStyle-method for defining the Style transparency.
     * @param diagram the diagram attribute
     * @param style the Style attribute, where the transparency will be set.
     */
    protected void defineStyleTransparency(Diagram diagram, Style style) {
    }
    
    /**
     * This method will be called from the newStyle-method for defining the Style background.
     * If a gradient is been used, then a color schema will be set for the background.
     * @param diagram the diagram attribute
     * @param style the Style attribute, where the background will be set.
     */
    protected void defineBackground(Diagram diagram, Style style) {
        gaService.setRenderingStyle(style, getColorSchema());
    }
    
    /**
     * This method will be called from the newStyle-method for defining the Style line attributes.
     * @param diagram the diagram attribute
     * @param style the Style attribute, where the line attributes will be set.
     */
    protected void defineLineAttributes(Diagram diagram, Style style) {
        style.setLineVisible(true);
        style.setForeground(gaService.manageColor(diagram, IColorConstant.DARK_GREEN));
    }
    
    /**
     * This method will be called from the newStyle-method for defining the Style font attributes.
     * @param diagram the diagram attribute
     * @param style the Style attribute, where the font attributes will be set.
     */
    protected void defineFontAttributes(Diagram diagram, Style style) {
        String fontName = "Lucida Sans";
        int fontSize = 8;
        boolean fontItalic = style.getFont().isItalic();
        boolean fontBold = style.getFont().isBold();
        style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
    }
    
    /**
     * This method returns the font color for the style. 
     * The font color will be returned separatly, because Graphiti allows just the foreground color.
     * The foreground color will be used for lines and fonts at the same time.
     */
    @Override
    public Color getFontColor(Diagram diagram) {
        IGaService gaService = Graphiti.getGaService();
        return gaService.manageColor(diagram, IColorConstant.BLUE);
    }
    
    /**
     * This method returns Color Schema of the Style
     */
    public AdaptedGradientColoredAreas getColorSchema() {
        final AdaptedGradientColoredAreas agca =
        StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
        agca.setDefinedStyleId("LWC2012CorporateStyleBase_Color_Schema_ID");
        agca.setGradientType(IGradientType.HORIZONTAL);
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT, new gradients.GreenToOrange().getGradientColoredAreas( ));
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED, new gradients.GreenToOrange().getGradientColoredAreas( ));
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED, new gradients.GreenToYellow().getGradientColoredAreas( ));
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_ALLOWED, GradientUtilClass.getOneColorGradient("00FF00"));
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_FORBIDDEN, new gradients.GreenToRed().getGradientColoredAreas( ));
        return agca;
    }
}
