parser grammar RuleStringParser;
options { tokenVocab=RuleStringLexer; }

/**
 *  A T T R I B U T E - R U L E S
 */


attributeName :
    ATSIGN ID DOT ID
;

attributeName1 :
    ATSIGN ID DOT ID
;

simpleAttributeValue :
    NUMINT
;


attributeFilter :
    attributeName numericComparison simpleAttributeValue# attributeNumericComparisonSubrule
	|
	attributeName numericOperation attributeName1 numericComparison simpleAttributeValue# attributeNumericOperationSubrule
;


numericComparison :
    LT # lessThanSubrule
    |
    GT # greaterThanSubrule
    |
    LTEQ # lessThanOrEqualToSubrule
    |
    GTEQ # greaterThanOrEqualToSubrule
    |
    NEQ # notEqualToSubrule
    |
	NLT # notLessThanSubrule
	|
	NGT # notGreaterThanSubrule
;

numericOperation :
    ADD # add
;
	


/**
 *  C O M M O N - R U L E S
 */

type :
	ID
;

name :
    ID
;

string :
    STRING
    |
    // match a blank string
;


