// Generated from x_path_grammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link x_path_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface x_path_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link x_path_grammarParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(x_path_grammarParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link x_path_grammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp(x_path_grammarParser.ApContext ctx);
	/**
	 * Visit a parse tree produced by {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp(x_path_grammarParser.RpContext ctx);
	/**
	 * Visit a parse tree produced by {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(x_path_grammarParser.FContext ctx);
}