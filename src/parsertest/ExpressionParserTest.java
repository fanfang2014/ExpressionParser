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

import java.util.Iterator;
import java.util.Map;

import javax.script.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.ericsson.expressionparser.RuleStringLexer;
import com.ericsson.expressionparser.RuleStringParser;

public class ExpressionParserTest {

    private boolean testStringwithAntlr(String stringUnderParse, String...inputParameter)
    {
     // TODO Auto-generated method stub
        final ANTLRInputStream antlrInputStream = new ANTLRInputStream(stringUnderParse);//"@UC.primaryCpichPower>=500");
        final RuleStringLexer cmCommandLexer = new RuleStringLexer(antlrInputStream);
        final CommonTokenStream tokens = new CommonTokenStream(cmCommandLexer);
        final RuleStringParser cmCommandParser = new RuleStringParser(tokens);
        final ParseTree tree = cmCommandParser.attributeFilter();
        final ParseTreeWalker walker = new ParseTreeWalker();
        RuleStringWalker cmCommandWalker = new RuleStringWalker();
        walker.walk(cmCommandWalker, tree);
        ParserResult parserResult = cmCommandWalker.parserResult;
        boolean validateResult = false;
        StringBuilder finalEvaluationExpression = new StringBuilder();
        int argIndex = 0;
        Iterator it = parserResult.Tokens.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (Boolean.parseBoolean(pair.getValue().toString()))
            {
                finalEvaluationExpression.append(inputParameter[argIndex]);
                argIndex++;
            }
            else
            {
                finalEvaluationExpression.append(pair.getKey().toString());
            }
        }
        /*switch (parserResult.operator) {
            case "<":
                validateResult = Integer.parseInt(parserResult.attributeInput) < Integer.parseInt(parserResult.valueAccordingToRule);
            case ">=":
                validateResult = Integer.parseInt(parserResult.attributeInput) >= Integer.parseInt(parserResult.valueAccordingToRule);
        }*/
        
        //use the javax.scriptengine to parse the result immediately
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine e = sem.getEngineByName("ECMAScript");
        ScriptEngineFactory f = e.getFactory();
        String statement = finalEvaluationExpression.toString();
        String[] statements = { statement
        //"print("a + b = " + c);"
        };
        String program = f.getProgram(statements);
        Object result = null;
        try {
            result = e.eval(program);
            return Boolean.parseBoolean(result.toString());
        } catch (ScriptException ex) {
            ex.printStackTrace();
        }
        return Boolean.parseBoolean(result.toString());
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        ExpressionParserTest expressionParserTest = new ExpressionParserTest();
        boolean result;
        result = expressionParserTest.testStringwithAntlr("@UC.primaryCpichPower>=500", "300");
        System.out.println(result);
        result = expressionParserTest.testStringwithAntlr("@UC.primaryCpichPower>=500", "500");
        System.out.println(result);
        result = expressionParserTest.testStringwithAntlr("@UC.primaryCpichPower + @UC.secondaryCpichPower<500", "200", "300");
        System.out.println(result);
        result = expressionParserTest.testStringwithAntlr("@UC.primaryCpichPower + @UC.secondaryCpichPower<500", "200", "200");
        System.out.println(result);

    }

}
