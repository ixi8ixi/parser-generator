// Generated from C:/NewUniversity/TM/FourthGradle/src/main/antlr/com/ix8oio8xi/parser/Gramparser.g4 by ANTLR 4.13.1
package com.ix8oio8xi.gram.file.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SKIPKEYWORD=1, GRAMMARKEYWORD=2, GRAMNAME=3, NTNAME=4, TNAME=5, TYPEVAR=6, 
		RETURN=7, REGEXP=8, CODE=9, LPAR=10, RPAR=11, LBR=12, RBR=13, COLON=14, 
		SEMICOLON=15, COMMA=16, OR=17, INHERITED=18, SYNTHESIZED=19, IMPORTBLOCK=20, 
		INITBLOCK=21, WS=22;
	public static final int
		RULE_gram = 0, RULE_importblock = 1, RULE_initblock = 2, RULE_gramname = 3, 
		RULE_skipline = 4, RULE_terminalLine = 5, RULE_nonTerminalLine = 6, RULE_rulesList = 7, 
		RULE_rule = 8, RULE_inherited = 9, RULE_synthesized = 10, RULE_rulepart = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"gram", "importblock", "initblock", "gramname", "skipline", "terminalLine", 
			"nonTerminalLine", "rulesList", "rule", "inherited", "synthesized", "rulepart"
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

	@Override
	public String getGrammarFileName() { return "Gramparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GramContext extends ParserRuleContext {
		public GramnameContext gramname() {
			return getRuleContext(GramnameContext.class,0);
		}
		public ImportblockContext importblock() {
			return getRuleContext(ImportblockContext.class,0);
		}
		public InitblockContext initblock() {
			return getRuleContext(InitblockContext.class,0);
		}
		public List<TerminalLineContext> terminalLine() {
			return getRuleContexts(TerminalLineContext.class);
		}
		public TerminalLineContext terminalLine(int i) {
			return getRuleContext(TerminalLineContext.class,i);
		}
		public List<NonTerminalLineContext> nonTerminalLine() {
			return getRuleContexts(NonTerminalLineContext.class);
		}
		public NonTerminalLineContext nonTerminalLine(int i) {
			return getRuleContext(NonTerminalLineContext.class,i);
		}
		public List<SkiplineContext> skipline() {
			return getRuleContexts(SkiplineContext.class);
		}
		public SkiplineContext skipline(int i) {
			return getRuleContext(SkiplineContext.class,i);
		}
		public GramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterGram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitGram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitGram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GramContext gram() throws RecognitionException {
		GramContext _localctx = new GramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			gramname();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTBLOCK) {
				{
				setState(25);
				importblock();
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITBLOCK) {
				{
				setState(28);
				initblock();
				}
			}

			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TNAME:
					{
					setState(31);
					terminalLine();
					}
					break;
				case NTNAME:
					{
					setState(32);
					nonTerminalLine();
					}
					break;
				case SKIPKEYWORD:
					{
					setState(33);
					skipline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportblockContext extends ParserRuleContext {
		public TerminalNode IMPORTBLOCK() { return getToken(GramparserParser.IMPORTBLOCK, 0); }
		public ImportblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterImportblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitImportblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitImportblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportblockContext importblock() throws RecognitionException {
		ImportblockContext _localctx = new ImportblockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(IMPORTBLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitblockContext extends ParserRuleContext {
		public TerminalNode INITBLOCK() { return getToken(GramparserParser.INITBLOCK, 0); }
		public InitblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterInitblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitInitblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitInitblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitblockContext initblock() throws RecognitionException {
		InitblockContext _localctx = new InitblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(INITBLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GramnameContext extends ParserRuleContext {
		public TerminalNode GRAMMARKEYWORD() { return getToken(GramparserParser.GRAMMARKEYWORD, 0); }
		public TerminalNode GRAMNAME() { return getToken(GramparserParser.GRAMNAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramparserParser.SEMICOLON, 0); }
		public GramnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterGramname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitGramname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitGramname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GramnameContext gramname() throws RecognitionException {
		GramnameContext _localctx = new GramnameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gramname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(GRAMMARKEYWORD);
			setState(43);
			match(GRAMNAME);
			setState(44);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkiplineContext extends ParserRuleContext {
		public TerminalNode SKIPKEYWORD() { return getToken(GramparserParser.SKIPKEYWORD, 0); }
		public TerminalNode REGEXP() { return getToken(GramparserParser.REGEXP, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramparserParser.SEMICOLON, 0); }
		public SkiplineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterSkipline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitSkipline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitSkipline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkiplineContext skipline() throws RecognitionException {
		SkiplineContext _localctx = new SkiplineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_skipline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SKIPKEYWORD);
			setState(47);
			match(REGEXP);
			setState(48);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminalLineContext extends ParserRuleContext {
		public TerminalNode TNAME() { return getToken(GramparserParser.TNAME, 0); }
		public TerminalNode RETURN() { return getToken(GramparserParser.RETURN, 0); }
		public TerminalNode REGEXP() { return getToken(GramparserParser.REGEXP, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramparserParser.SEMICOLON, 0); }
		public TerminalLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterTerminalLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitTerminalLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitTerminalLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalLineContext terminalLine() throws RecognitionException {
		TerminalLineContext _localctx = new TerminalLineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_terminalLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(TNAME);
			setState(51);
			match(RETURN);
			setState(52);
			match(REGEXP);
			setState(53);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonTerminalLineContext extends ParserRuleContext {
		public TerminalNode NTNAME() { return getToken(GramparserParser.NTNAME, 0); }
		public InheritedContext inherited() {
			return getRuleContext(InheritedContext.class,0);
		}
		public SynthesizedContext synthesized() {
			return getRuleContext(SynthesizedContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(GramparserParser.RETURN, 0); }
		public RulesListContext rulesList() {
			return getRuleContext(RulesListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramparserParser.SEMICOLON, 0); }
		public NonTerminalLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterNonTerminalLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitNonTerminalLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitNonTerminalLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalLineContext nonTerminalLine() throws RecognitionException {
		NonTerminalLineContext _localctx = new NonTerminalLineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonTerminalLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(NTNAME);
			setState(56);
			inherited();
			setState(57);
			synthesized();
			setState(58);
			match(RETURN);
			setState(59);
			rulesList();
			setState(60);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesListContext extends ParserRuleContext {
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GramparserParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GramparserParser.OR, i);
		}
		public RulesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterRulesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitRulesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitRulesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesListContext rulesList() throws RecognitionException {
		RulesListContext _localctx = new RulesListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rulesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			rule_();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(63);
				match(OR);
				setState(64);
				rule_();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public List<RulepartContext> rulepart() {
			return getRuleContexts(RulepartContext.class);
		}
		public RulepartContext rulepart(int i) {
			return getRuleContext(RulepartContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				rulepart();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritedContext extends ParserRuleContext {
		public TerminalNode INHERITED() { return getToken(GramparserParser.INHERITED, 0); }
		public InheritedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterInherited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitInherited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitInherited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritedContext inherited() throws RecognitionException {
		InheritedContext _localctx = new InheritedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inherited);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(INHERITED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SynthesizedContext extends ParserRuleContext {
		public TerminalNode SYNTHESIZED() { return getToken(GramparserParser.SYNTHESIZED, 0); }
		public SynthesizedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthesized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterSynthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitSynthesized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitSynthesized(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthesizedContext synthesized() throws RecognitionException {
		SynthesizedContext _localctx = new SynthesizedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_synthesized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SYNTHESIZED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulepartContext extends ParserRuleContext {
		public TerminalNode NTNAME() { return getToken(GramparserParser.NTNAME, 0); }
		public InheritedContext inherited() {
			return getRuleContext(InheritedContext.class,0);
		}
		public TerminalNode TNAME() { return getToken(GramparserParser.TNAME, 0); }
		public TerminalNode CODE() { return getToken(GramparserParser.CODE, 0); }
		public RulepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).enterRulepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramparserListener ) ((GramparserListener)listener).exitRulepart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramparserVisitor ) return ((GramparserVisitor<? extends T>)visitor).visitRulepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulepartContext rulepart() throws RecognitionException {
		RulepartContext _localctx = new RulepartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rulepart);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NTNAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(79);
				match(NTNAME);
				setState(80);
				inherited();
				}
				}
				break;
			case TNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(TNAME);
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(CODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016V\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000\u0003\u0000\u001e"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b"+
		"\u0000\f\u0000$\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007B\b"+
		"\u0007\n\u0007\f\u0007E\t\u0007\u0001\b\u0004\bH\b\b\u000b\b\f\bI\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000bT\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000R\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000"+
		"\u0006*\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000\n2\u0001\u0000"+
		"\u0000\u0000\f7\u0001\u0000\u0000\u0000\u000e>\u0001\u0000\u0000\u0000"+
		"\u0010G\u0001\u0000\u0000\u0000\u0012K\u0001\u0000\u0000\u0000\u0014M"+
		"\u0001\u0000\u0000\u0000\u0016S\u0001\u0000\u0000\u0000\u0018\u001a\u0003"+
		"\u0006\u0003\u0000\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\"\u0001\u0000"+
		"\u0000\u0000\u001f#\u0003\n\u0005\u0000 #\u0003\f\u0006\u0000!#\u0003"+
		"\b\u0004\u0000\"\u001f\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&\'\u0005"+
		"\u0014\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\u0015\u0000"+
		"\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000+,\u0005"+
		"\u0003\u0000\u0000,-\u0005\u000f\u0000\u0000-\u0007\u0001\u0000\u0000"+
		"\u0000./\u0005\u0001\u0000\u0000/0\u0005\b\u0000\u000001\u0005\u000f\u0000"+
		"\u00001\t\u0001\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0005\u0007"+
		"\u0000\u000045\u0005\b\u0000\u000056\u0005\u000f\u0000\u00006\u000b\u0001"+
		"\u0000\u0000\u000078\u0005\u0004\u0000\u000089\u0003\u0012\t\u00009:\u0003"+
		"\u0014\n\u0000:;\u0005\u0007\u0000\u0000;<\u0003\u000e\u0007\u0000<=\u0005"+
		"\u000f\u0000\u0000=\r\u0001\u0000\u0000\u0000>C\u0003\u0010\b\u0000?@"+
		"\u0005\u0011\u0000\u0000@B\u0003\u0010\b\u0000A?\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u000f\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0003"+
		"\u0016\u000b\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0011\u0001\u0000"+
		"\u0000\u0000KL\u0005\u0012\u0000\u0000L\u0013\u0001\u0000\u0000\u0000"+
		"MN\u0005\u0013\u0000\u0000N\u0015\u0001\u0000\u0000\u0000OP\u0005\u0004"+
		"\u0000\u0000PT\u0003\u0012\t\u0000QT\u0005\u0005\u0000\u0000RT\u0005\t"+
		"\u0000\u0000SO\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000T\u0017\u0001\u0000\u0000\u0000\u0007\u001a\u001d\""+
		"$CIS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}