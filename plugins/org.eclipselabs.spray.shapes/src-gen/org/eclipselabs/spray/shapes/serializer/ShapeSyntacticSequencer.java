package org.eclipselabs.spray.shapes.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipselabs.spray.shapes.services.ShapeGrammarAccess;

@SuppressWarnings("all")
public class ShapeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ShapeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q;
	protected AbstractElementAlias match_GradientColorArea_RightParenthesisKeyword_9_p;
	protected AbstractElementAlias match_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a;
	protected AbstractElementAlias match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a;
	protected AbstractElementAlias match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ShapeGrammarAccess) access;
		match_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDescriptionAccess().getAlignKeyword_1_3_0()), new TokenAlias(false, false, grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_1_3_1()), new TokenAlias(false, false, grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_1_3_3()));
		match_GradientColorArea_RightParenthesisKeyword_9_p = new TokenAlias(true, false, grammarAccess.getGradientColorAreaAccess().getRightParenthesisKeyword_9());
		match_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getAlignKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getLeftParenthesisKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getRightParenthesisKeyword_1_1_3()));
		match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getRightParenthesisKeyword_1_1_3()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getAlignKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getLeftParenthesisKeyword_1_1_1()));
		match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getRightParenthesisKeyword_1_1_3()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getAlignKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTextLayoutAccess().getLeftParenthesisKeyword_1_1_1()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2()));
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q.equals(syntax))
				emit_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GradientColorArea_RightParenthesisKeyword_9_p.equals(syntax))
				emit_GradientColorArea_RightParenthesisKeyword_9_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a.equals(syntax))
				emit_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a.equals(syntax))
				emit_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p.equals(syntax))
				emit_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q.equals(syntax))
				emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('align' '(' ')')?
	 */
	protected void emit_Description___AlignKeyword_1_3_0_LeftParenthesisKeyword_1_3_1_RightParenthesisKeyword_1_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'+
	 */
	protected void emit_GradientColorArea_RightParenthesisKeyword_9_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('align' '(' ')')*
	 */
	protected void emit_TextLayout___AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1_RightParenthesisKeyword_1_1_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (')' 'align' '(')*
	 */
	protected void emit_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (')' 'align' '(')+
	 */
	protected void emit_TextLayout___RightParenthesisKeyword_1_1_3_AlignKeyword_1_1_0_LeftParenthesisKeyword_1_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
