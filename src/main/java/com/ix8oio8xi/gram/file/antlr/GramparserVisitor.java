// Generated from C:/NewUniversity/TM/FourthGradle/src/main/antlr/com/ix8oio8xi/parser/Gramparser.g4 by ANTLR 4.13.1
package com.ix8oio8xi.gram.file.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramparserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramparserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramparserParser#gram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGram(GramparserParser.GramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#importblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportblock(GramparserParser.ImportblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#initblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitblock(GramparserParser.InitblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#gramname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGramname(GramparserParser.GramnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#skipline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipline(GramparserParser.SkiplineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#terminalLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalLine(GramparserParser.TerminalLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#nonTerminalLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalLine(GramparserParser.NonTerminalLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#rulesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulesList(GramparserParser.RulesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(GramparserParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#inherited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherited(GramparserParser.InheritedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#synthesized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthesized(GramparserParser.SynthesizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramparserParser#rulepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulepart(GramparserParser.RulepartContext ctx);
}