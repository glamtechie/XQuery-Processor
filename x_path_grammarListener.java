// Generated from x_path_grammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link x_path_grammarParser}.
 */
public interface x_path_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link x_path_grammarParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(x_path_grammarParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link x_path_grammarParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(x_path_grammarParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link x_path_grammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(x_path_grammarParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link x_path_grammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(x_path_grammarParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp(x_path_grammarParser.RpContext ctx);
	/**
	 * Exit a parse tree produced by {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp(x_path_grammarParser.RpContext ctx);
	/**
	 * Enter a parse tree produced by {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(x_path_grammarParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(x_path_grammarParser.FContext ctx);
}