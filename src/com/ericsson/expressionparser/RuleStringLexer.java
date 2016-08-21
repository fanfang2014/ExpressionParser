package com.ericsson.expressionparser;// Generated from RuleStringLexer.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleStringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMA=2, SEMI=3, EQ=4, EQEQ=5, NEQ=6, NLT=7, NGT=8, LT=9, GT=10, 
		NUMINT=11, ADD=12, LTEQ=13, GTEQ=14, LPAREN=15, RPAREN=16, LSQBRACKET=17, 
		RSQBRACKET=18, DOT=19, ID=20, ATSIGN=21, ALIAS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMA", "SEMI", "EQ", "EQEQ", "NEQ", "NLT", "NGT", "LT", "GT", 
		"NUMINT", "ADD", "LTEQ", "GTEQ", "LPAREN", "RPAREN", "LSQBRACKET", "RSQBRACKET", 
		"DOT", "ID", "ATSIGN", "ALIAS", "ENFORCE_WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "';'", "'='", null, "'!='", "'!<'", "'!>'", "'<'", 
		"'>'", null, "'+'", "'<='", "'>='", "'('", "')'", "'['", "']'", "'.'", 
		null, "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMA", "SEMI", "EQ", "EQEQ", "NEQ", "NLT", "NGT", "LT", 
		"GT", "NUMINT", "ADD", "LTEQ", "GTEQ", "LPAREN", "RPAREN", "LSQBRACKET", 
		"RSQBRACKET", "DOT", "ID", "ATSIGN", "ALIAS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    boolean ignoreWhitespace = true;


	public RuleStringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RuleStringLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			ENFORCE_WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 if(ignoreWhitespace) skip(); 
			break;
		}
	}
	private void ENFORCE_WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 ignoreWhitespace = false; 
			break;
		case 2:
			 ignoreWhitespace = true; 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\63"+
		"\n\2\r\2\16\2\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fP\n\f\r\f\16\fQ\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\7\25h\n\25\f\25\16\25k\13\25\3\26\3\26\3\27"+
		"\3\27\7\27q\n\27\f\27\16\27t\13\27\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\2\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\6\2\62;"+
		"C\\aac|{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\3\62\3\2\2\2\58\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\rA\3\2\2\2"+
		"\17D\3\2\2\2\21G\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27O\3\2\2\2\31S\3\2\2"+
		"\2\33U\3\2\2\2\35X\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_\3\2\2\2%a\3\2\2\2\'"+
		"c\3\2\2\2)e\3\2\2\2+l\3\2\2\2-n\3\2\2\2/u\3\2\2\2\61\63\t\2\2\2\62\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\b\2\2\2\67\4\3\2\2\289\7.\2\29\6\3\2\2\2:;\7=\2\2;\b\3\2\2\2<=\7?\2\2"+
		"=\n\3\2\2\2>?\5\t\5\2?@\5\t\5\2@\f\3\2\2\2AB\7#\2\2BC\7?\2\2C\16\3\2\2"+
		"\2DE\7#\2\2EF\7>\2\2F\20\3\2\2\2GH\7#\2\2HI\7@\2\2I\22\3\2\2\2JK\7>\2"+
		"\2K\24\3\2\2\2LM\7@\2\2M\26\3\2\2\2NP\t\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2R\30\3\2\2\2ST\7-\2\2T\32\3\2\2\2UV\7>\2\2VW\7?\2\2W\34"+
		"\3\2\2\2XY\7@\2\2YZ\7?\2\2Z\36\3\2\2\2[\\\7*\2\2\\ \3\2\2\2]^\7+\2\2^"+
		"\"\3\2\2\2_`\7]\2\2`$\3\2\2\2ab\7_\2\2b&\3\2\2\2cd\7\60\2\2d(\3\2\2\2"+
		"ei\t\4\2\2fh\t\4\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j*\3\2\2\2"+
		"ki\3\2\2\2lm\7B\2\2m,\3\2\2\2nr\t\4\2\2oq\t\4\2\2po\3\2\2\2qt\3\2\2\2"+
		"rp\3\2\2\2rs\3\2\2\2s.\3\2\2\2tr\3\2\2\2uv\b\30\3\2vw\5\3\2\2wx\b\30\4"+
		"\2x\60\3\2\2\2\7\2\64Qir\5\3\2\2\3\30\3\3\30\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}