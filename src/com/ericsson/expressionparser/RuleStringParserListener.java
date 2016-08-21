package com.ericsson.expressionparser;// Generated from RuleStringParser.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleStringParser}.
 */
public interface RuleStringParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleStringParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(RuleStringParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleStringParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(RuleStringParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleStringParser#attributeName1}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName1(RuleStringParser.AttributeName1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RuleStringParser#attributeName1}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName1(RuleStringParser.AttributeName1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RuleStringParser#simpleAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAttributeValue(RuleStringParser.SimpleAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleStringParser#simpleAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAttributeValue(RuleStringParser.SimpleAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributeNumericComparisonSubrule}
	 * labeled alternative in {@link RuleStringParser#attributeFilter}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNumericComparisonSubrule(RuleStringParser.AttributeNumericComparisonSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributeNumericComparisonSubrule}
	 * labeled alternative in {@link RuleStringParser#attributeFilter}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNumericComparisonSubrule(RuleStringParser.AttributeNumericComparisonSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributeNumericOperationSubrule}
	 * labeled alternative in {@link RuleStringParser#attributeFilter}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNumericOperationSubrule(RuleStringParser.AttributeNumericOperationSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributeNumericOperationSubrule}
	 * labeled alternative in {@link RuleStringParser#attributeFilter}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNumericOperationSubrule(RuleStringParser.AttributeNumericOperationSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void enterLessThanSubrule(RuleStringParser.LessThanSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void exitLessThanSubrule(RuleStringParser.LessThanSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanSubrule(RuleStringParser.GreaterThanSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanSubrule(RuleStringParser.GreaterThanSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanOrEqualToSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualToSubrule(RuleStringParser.LessThanOrEqualToSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanOrEqualToSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualToSubrule(RuleStringParser.LessThanOrEqualToSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanOrEqualToSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualToSubrule(RuleStringParser.GreaterThanOrEqualToSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanOrEqualToSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualToSubrule(RuleStringParser.GreaterThanOrEqualToSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualToSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualToSubrule(RuleStringParser.NotEqualToSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualToSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualToSubrule(RuleStringParser.NotEqualToSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notLessThanSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void enterNotLessThanSubrule(RuleStringParser.NotLessThanSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notLessThanSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void exitNotLessThanSubrule(RuleStringParser.NotLessThanSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notGreaterThanSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void enterNotGreaterThanSubrule(RuleStringParser.NotGreaterThanSubruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notGreaterThanSubrule}
	 * labeled alternative in {@link RuleStringParser#numericComparison}.
	 * @param ctx the parse tree
	 */
	void exitNotGreaterThanSubrule(RuleStringParser.NotGreaterThanSubruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link RuleStringParser#numericOperation}.
	 * @param ctx the parse tree
	 */
	void enterAdd(RuleStringParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link RuleStringParser#numericOperation}.
	 * @param ctx the parse tree
	 */
	void exitAdd(RuleStringParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleStringParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RuleStringParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleStringParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RuleStringParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleStringParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(RuleStringParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleStringParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(RuleStringParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleStringParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(RuleStringParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleStringParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(RuleStringParser.StringContext ctx);
}