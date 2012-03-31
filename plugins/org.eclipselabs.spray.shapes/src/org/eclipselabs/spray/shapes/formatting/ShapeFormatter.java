/*
 * generated by Xtext
 */
package org.eclipselabs.spray.shapes.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipselabs.spray.shapes.services.ShapeGrammarAccess;

import com.google.inject.Inject;

/**
 * This class contains custom formatting description.
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class ShapeFormatter extends AbstractDeclarativeFormatter {
    @Inject
    private ShapeGrammarAccess grammar;

    @Override
    protected void configureFormatting(FormattingConfig c) {
        c.setLinewrap(0, 1, 2).before(grammar.getSL_COMMENTRule());
        c.setLinewrap(0, 1, 2).before(grammar.getML_COMMENTRule());
        c.setLinewrap(0, 1, 1).after(grammar.getML_COMMENTRule());

        c.setAutoLinewrap(120);

        //        c.setIndentation(beginElement, endElement)
        handleBlocks(c);

        for (Pair<Keyword, Keyword> kw : grammar.findKeywordPairs("(", ")")) {
            c.setSpace(" ").before(kw.getFirst());
            c.setNoSpace().after(kw.getFirst());
            c.setNoSpace().before(kw.getSecond());
        }
        //        c.setSpace(" ").before(grammar.getRoundedRectangleLayoutAccess().getLeftParenthesisKeyword_1_1_1());
        // c.setSpace(" ").before(grammar.getRoundedRectangleLayoutAccess().getCurveKeyword_1_1_0());

        // no space around =, except for text value assignment
        for (Keyword kw : grammar.findKeywords("=")) {
            c.setNoSpace().around(kw);
        }
        // no space befor comma, one space after
        for (Keyword kw : grammar.findKeywords(",")) {
            c.setNoSpace().before(kw);
            c.setSpace(" ").after(kw);
        }

        handleNoSpaceBeforeINT(c);

        handleLineWrapBeforeKeywords(c);
    }

    protected void handleLineWrapBeforeKeywords(FormattingConfig c) {
        // line wraps
        c.setLinewrap().before(grammar.getShapeRule());
        c.setLinewrap().before(grammar.getPointRule());
        c.setLinewrap().before(grammar.getAnchorPositionRule());
        c.setLinewrap().before(grammar.getCommonLayoutAccess().getPositionKeyword_1_0_0());
        c.setLinewrap().before(grammar.getCommonLayoutAccess().getSizeKeyword_1_1_0());
        c.setLinewrap().before(grammar.getRoundedRectangleLayoutAccess().getCurveKeyword_1_1_0());
        for (Keyword kw : grammar.findKeywords("line", "ellipse", "rectangle", "rounded-rectangle", "polyline")) {
            c.setLinewrap().before(kw);
        }
    }

    protected void handleNoSpaceBeforeINT(FormattingConfig c) {
        // no space before integers
        c.setNoSpace().before(grammar.getCommonLayoutAccess().getXcorN_INTParserRuleCall_1_0_3_0());
        c.setNoSpace().before(grammar.getCommonLayoutAccess().getYcorN_INTParserRuleCall_1_0_6_0());
        c.setNoSpace().before(grammar.getPointAccess().getXcorN_INTParserRuleCall_1_3_0());
        c.setNoSpace().before(grammar.getPointAccess().getYcorN_INTParserRuleCall_1_6_0());
        c.setNoSpace().before(grammar.getAnchorFixPointPositionAccess().getXcorINTTerminalRuleCall_1_0());
        c.setNoSpace().before(grammar.getAnchorFixPointPositionAccess().getYcorINTTerminalRuleCall_4_0());
    }

    protected void handleBlocks(FormattingConfig c) {
        for (Pair<Keyword, Keyword> kw : grammar.findKeywordPairs("{", "}")) {
            c.setLinewrap().after(kw.getFirst());
            c.setLinewrap().around(kw.getSecond());
            c.setIndentation(kw.getFirst(), kw.getSecond());
        }
    }

}
