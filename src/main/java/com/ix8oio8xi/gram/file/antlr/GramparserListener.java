// Generated from C:/NewUniversity/TM/FourthGradle/src/main/antlr/com/ix8oio8xi/parser/Gramparser.g4 by ANTLR 4.13.1
package com.ix8oio8xi.gram.file.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramparserParser}.
 */
public interface GramparserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramparserParser#gram}.
	 * @param ctx the parse tree
	 */
	void enterGram(GramparserParser.GramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#gram}.
	 * @param ctx the parse tree
	 */
	void exitGram(GramparserParser.GramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#importblock}.
	 * @param ctx the parse tree
	 */
	void enterImportblock(GramparserParser.ImportblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#importblock}.
	 * @param ctx the parse tree
	 */
	void exitImportblock(GramparserParser.ImportblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#initblock}.
	 * @param ctx the parse tree
	 */
	void enterInitblock(GramparserParser.InitblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#initblock}.
	 * @param ctx the parse tree
	 */
	void exitInitblock(GramparserParser.InitblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#gramname}.
	 * @param ctx the parse tree
	 */
	void enterGramname(GramparserParser.GramnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#gramname}.
	 * @param ctx the parse tree
	 */
	void exitGramname(GramparserParser.GramnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#skipline}.
	 * @param ctx the parse tree
	 */
	void enterSkipline(GramparserParser.SkiplineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#skipline}.
	 * @param ctx the parse tree
	 */
	void exitSkipline(GramparserParser.SkiplineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#terminalLine}.
	 * @param ctx the parse tree
	 */
	void enterTerminalLine(GramparserParser.TerminalLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#terminalLine}.
	 * @param ctx the parse tree
	 */
	void exitTerminalLine(GramparserParser.TerminalLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#nonTerminalLine}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalLine(GramparserParser.NonTerminalLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#nonTerminalLine}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalLine(GramparserParser.NonTerminalLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#rulesList}.
	 * @param ctx the parse tree
	 */
	void enterRulesList(GramparserParser.RulesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#rulesList}.
	 * @param ctx the parse tree
	 */
	void exitRulesList(GramparserParser.RulesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(GramparserParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(GramparserParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#inherited}.
	 * @param ctx the parse tree
	 */
	void enterInherited(GramparserParser.InheritedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#inherited}.
	 * @param ctx the parse tree
	 */
	void exitInherited(GramparserParser.InheritedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#synthesized}.
	 * @param ctx the parse tree
	 */
	void enterSynthesized(GramparserParser.SynthesizedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#synthesized}.
	 * @param ctx the parse tree
	 */
	void exitSynthesized(GramparserParser.SynthesizedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramparserParser#rulepart}.
	 * @param ctx the parse tree
	 */
	void enterRulepart(GramparserParser.RulepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramparserParser#rulepart}.
	 * @param ctx the parse tree
	 */
	void exitRulepart(GramparserParser.RulepartContext ctx);
}