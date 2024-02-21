// Generated from C:/NewUniversity/TM/FourthGradle/src/main/antlr/com/ix8oio8xi/parser/Gramparser.g4 by ANTLR 4.13.1
package com.ix8oio8xi.gram.file.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramparserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SKIPKEYWORD=1, GRAMMARKEYWORD=2, GRAMNAME=3, NTNAME=4, TNAME=5, TYPEVAR=6, 
		RETURN=7, REGEXP=8, CODE=9, LPAR=10, RPAR=11, LBR=12, RBR=13, COLON=14, 
		SEMICOLON=15, COMMA=16, OR=17, INHERITED=18, SYNTHESIZED=19, IMPORTBLOCK=20, 
		INITBLOCK=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SKIPKEYWORD", "GRAMMARKEYWORD", "GRAMNAME", "NTNAME", "TNAME", "TYPEVAR", 
			"RETURN", "REGEXP", "CODE", "LPAR", "RPAR", "LBR", "RBR", "COLON", "SEMICOLON", 
			"COMMA", "OR", "INHERITED", "SYNTHESIZED", "IMPORTBLOCK", "INITBLOCK", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'skip'", "'grammar'", null, null, null, null, "'~>'", null, null, 
			"'('", "')'", "'['", "']'", "':'", "';'", "','", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SKIPKEYWORD", "GRAMMARKEYWORD", "GRAMNAME", "NTNAME", "TNAME", 
			"TYPEVAR", "RETURN", "REGEXP", "CODE", "LPAR", "RPAR", "LBR", "RBR", 
			"COLON", "SEMICOLON", "COMMA", "OR", "INHERITED", "SYNTHESIZED", "IMPORTBLOCK", 
			"INITBLOCK", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GramparserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u00b2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"=\b\u0002\n\u0002\f\u0002@\t\u0002\u0001\u0003\u0004\u0003C\b\u0003\u000b"+
		"\u0003\f\u0003D\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004\f\u0004I"+
		"\u0001\u0005\u0004\u0005M\b\u0005\u000b\u0005\f\u0005N\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007V\b\u0007\n\u0007"+
		"\f\u0007Y\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b_\b\b"+
		"\n\b\f\bb\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005"+
		"\u0011x\b\u0011\n\u0011\f\u0011{\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0081\b\u0012\n\u0012\f\u0012\u0084\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0093\b\u0013\n\u0013\f\u0013\u0096\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00a4\b\u0014\n\u0014\f\u0014\u00a7\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0004\u0015\u00ad\b\u0015\u000b\u0015\f\u0015"+
		"\u00ae\u0001\u0015\u0001\u0015\u0006W`y\u0082\u0094\u00a5\u0000\u0016"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001"+
		"\u0000\u0004\u0001\u0000AZ\u0001\u0000az\u0002\u0000AZaz\u0003\u0000\t"+
		"\n\r\r  \u00bc\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u00032\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000\u0000\u0007"+
		"B\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bL\u0001\u0000"+
		"\u0000\u0000\rP\u0001\u0000\u0000\u0000\u000fS\u0001\u0000\u0000\u0000"+
		"\u0011\\\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000\u0000\u0015"+
		"g\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019k\u0001"+
		"\u0000\u0000\u0000\u001bm\u0001\u0000\u0000\u0000\u001do\u0001\u0000\u0000"+
		"\u0000\u001fq\u0001\u0000\u0000\u0000!s\u0001\u0000\u0000\u0000#u\u0001"+
		"\u0000\u0000\u0000%~\u0001\u0000\u0000\u0000\'\u0087\u0001\u0000\u0000"+
		"\u0000)\u009a\u0001\u0000\u0000\u0000+\u00ac\u0001\u0000\u0000\u0000-"+
		".\u0005s\u0000\u0000./\u0005k\u0000\u0000/0\u0005i\u0000\u000001\u0005"+
		"p\u0000\u00001\u0002\u0001\u0000\u0000\u000023\u0005g\u0000\u000034\u0005"+
		"r\u0000\u000045\u0005a\u0000\u000056\u0005m\u0000\u000067\u0005m\u0000"+
		"\u000078\u0005a\u0000\u000089\u0005r\u0000\u00009\u0004\u0001\u0000\u0000"+
		"\u0000:>\u0007\u0000\u0000\u0000;=\u0007\u0001\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000AC\u0007\u0001\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\b\u0001"+
		"\u0000\u0000\u0000FH\u0007\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000J\n\u0001\u0000\u0000\u0000KM\u0007\u0002\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000O\f\u0001\u0000\u0000\u0000PQ\u0005~\u0000\u0000QR\u0005"+
		">\u0000\u0000R\u000e\u0001\u0000\u0000\u0000SW\u0005\"\u0000\u0000TV\t"+
		"\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\"\u0000\u0000[\u0010\u0001\u0000"+
		"\u0000\u0000\\`\u0005{\u0000\u0000]_\t\u0000\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_b\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"cd\u0005}\u0000\u0000d\u0012\u0001\u0000\u0000\u0000ef\u0005(\u0000\u0000"+
		"f\u0014\u0001\u0000\u0000\u0000gh\u0005)\u0000\u0000h\u0016\u0001\u0000"+
		"\u0000\u0000ij\u0005[\u0000\u0000j\u0018\u0001\u0000\u0000\u0000kl\u0005"+
		"]\u0000\u0000l\u001a\u0001\u0000\u0000\u0000mn\u0005:\u0000\u0000n\u001c"+
		"\u0001\u0000\u0000\u0000op\u0005;\u0000\u0000p\u001e\u0001\u0000\u0000"+
		"\u0000qr\u0005,\u0000\u0000r \u0001\u0000\u0000\u0000st\u0005|\u0000\u0000"+
		"t\"\u0001\u0000\u0000\u0000uy\u0003\u0013\t\u0000vx\t\u0000\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|}\u0003\u0015\n\u0000}$\u0001\u0000\u0000\u0000~\u0082\u0003"+
		"\u0017\u000b\u0000\u007f\u0081\t\u0000\u0000\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u0019"+
		"\f\u0000\u0086&\u0001\u0000\u0000\u0000\u0087\u0088\u0005@\u0000\u0000"+
		"\u0088\u0089\u0005i\u0000\u0000\u0089\u008a\u0005m\u0000\u0000\u008a\u008b"+
		"\u0005p\u0000\u0000\u008b\u008c\u0005o\u0000\u0000\u008c\u008d\u0005r"+
		"\u0000\u0000\u008d\u008e\u0005t\u0000\u0000\u008e\u008f\u0005/\u0000\u0000"+
		"\u008f\u0090\u0005#\u0000\u0000\u0090\u0094\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\t\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005#\u0000\u0000\u0098\u0099\u0005"+
		"/\u0000\u0000\u0099(\u0001\u0000\u0000\u0000\u009a\u009b\u0005@\u0000"+
		"\u0000\u009b\u009c\u0005i\u0000\u0000\u009c\u009d\u0005n\u0000\u0000\u009d"+
		"\u009e\u0005i\u0000\u0000\u009e\u009f\u0005t\u0000\u0000\u009f\u00a0\u0005"+
		"/\u0000\u0000\u00a0\u00a1\u0005#\u0000\u0000\u00a1\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\t\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005#\u0000\u0000\u00a9"+
		"\u00aa\u0005/\u0000\u0000\u00aa*\u0001\u0000\u0000\u0000\u00ab\u00ad\u0007"+
		"\u0003\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0006"+
		"\u0015\u0000\u0000\u00b1,\u0001\u0000\u0000\u0000\f\u0000>DINW`y\u0082"+
		"\u0094\u00a5\u00ae\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}