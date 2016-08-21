/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package parsertest;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.ericsson.expressionparser.RuleStringParser;
import com.ericsson.expressionparser.RuleStringParserBaseListener;
import com.ericsson.expressionparser.RuleStringParser.AttributeNameContext;
import com.ericsson.expressionparser.RuleStringParser.SimpleAttributeValueContext;

public class RuleStringWalker extends RuleStringParserBaseListener {
    public ParserResult parserResult = new ParserResult();
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAttributeName(RuleStringParser.AttributeNameContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAttributeName(RuleStringParser.AttributeNameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAttributeName1(RuleStringParser.AttributeName1Context ctx) { 
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAttributeName1(RuleStringParser.AttributeName1Context ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSimpleAttributeValue(RuleStringParser.SimpleAttributeValueContext ctx) { 

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSimpleAttributeValue(RuleStringParser.SimpleAttributeValueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAttributeNumericComparisonSubrule(RuleStringParser.AttributeNumericComparisonSubruleContext ctx) { 
        /*AttributeNameContext attributeNameContext = ctx.attributeName();
        System.out.println(attributeNameContext.getText());
        System.out.println(ctx.getText());
        //parserResult.Tokens.put(ctx.getText(), new Boolean(false));
        SimpleAttributeValueContext simpleAttributeValueContext = ctx.simpleAttributeValue();
        List<org.antlr.v4.runtime.tree.ParseTree> parseTree = ctx.children;*/
        System.out.println(ctx.attributeName().getText());
        parserResult.Tokens.put(ctx.attributeName().getText(), new Boolean(true));
        System.out.println(ctx.numericComparison().getText());
        parserResult.Tokens.put(ctx.numericComparison().getText(), new Boolean(false));
        System.out.println(ctx.simpleAttributeValue().getText());
        parserResult.Tokens.put(ctx.simpleAttributeValue().getText(), new Boolean(false));
        
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAttributeNumericComparisonSubrule(RuleStringParser.AttributeNumericComparisonSubruleContext ctx) { 
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAttributeNumericOperationSubrule(RuleStringParser.AttributeNumericOperationSubruleContext ctx) { 
        System.out.println(ctx.getText());
        System.out.println(ctx.attributeName().getText());
        parserResult.Tokens.put(ctx.attributeName().getText(), new Boolean(true));
        System.out.println(ctx.numericOperation().getText());
        parserResult.Tokens.put(ctx.numericOperation().getText(), new Boolean(false));
        System.out.println(ctx.attributeName1().getText());
        parserResult.Tokens.put(ctx.attributeName1().getText(), new Boolean(true));
        System.out.println(ctx.numericComparison().getText());
        parserResult.Tokens.put(ctx.numericComparison().getText(), new Boolean(false));
        System.out.println(ctx.simpleAttributeValue().getText());
        parserResult.Tokens.put(ctx.simpleAttributeValue().getText(), new Boolean(false));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAttributeNumericOperationSubrule(RuleStringParser.AttributeNumericOperationSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLessThanSubrule(RuleStringParser.LessThanSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLessThanSubrule(RuleStringParser.LessThanSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterGreaterThanSubrule(RuleStringParser.GreaterThanSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGreaterThanSubrule(RuleStringParser.GreaterThanSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLessThanOrEqualToSubrule(RuleStringParser.LessThanOrEqualToSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLessThanOrEqualToSubrule(RuleStringParser.LessThanOrEqualToSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterGreaterThanOrEqualToSubrule(RuleStringParser.GreaterThanOrEqualToSubruleContext ctx) { 
        TerminalNode terminalNode = ctx.GTEQ();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGreaterThanOrEqualToSubrule(RuleStringParser.GreaterThanOrEqualToSubruleContext ctx) { 
        
        parserResult.operator = ">=";
        
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNotEqualToSubrule(RuleStringParser.NotEqualToSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNotEqualToSubrule(RuleStringParser.NotEqualToSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNotLessThanSubrule(RuleStringParser.NotLessThanSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNotLessThanSubrule(RuleStringParser.NotLessThanSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNotGreaterThanSubrule(RuleStringParser.NotGreaterThanSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNotGreaterThanSubrule(RuleStringParser.NotGreaterThanSubruleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAdd(RuleStringParser.AddContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAdd(RuleStringParser.AddContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterType(RuleStringParser.TypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitType(RuleStringParser.TypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterName(RuleStringParser.NameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitName(RuleStringParser.NameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterString(RuleStringParser.StringContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitString(RuleStringParser.StringContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }
}
