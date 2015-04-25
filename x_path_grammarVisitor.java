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
	 * Visit a parse tree produced by the {@code apSlash}
	 * labeled alternative in {@link x_path_grammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApSlash(x_path_grammarParser.ApSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apDeep}
	 * labeled alternative in {@link x_path_grammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApDeep(x_path_grammarParser.ApDeepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpCond}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpCond(x_path_grammarParser.RpCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpPlain}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpPlain(x_path_grammarParser.RpPlainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpTag}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpTag(x_path_grammarParser.RpTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpNext}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpNext(x_path_grammarParser.RpNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpParent}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpParent(x_path_grammarParser.RpParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDeep}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDeep(x_path_grammarParser.RpDeepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpStar}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpStar(x_path_grammarParser.RpStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpCurrent}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpCurrent(x_path_grammarParser.RpCurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpTest}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpTest(x_path_grammarParser.RpTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpInd}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpInd(x_path_grammarParser.RpIndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpAttr}
	 * labeled alternative in {@link x_path_grammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAttr(x_path_grammarParser.RpAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fIs}
	 * labeled alternative in {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFIs(x_path_grammarParser.FIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fNot}
	 * labeled alternative in {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFNot(x_path_grammarParser.FNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fEq}
	 * labeled alternative in {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFEq(x_path_grammarParser.FEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fVal}
	 * labeled alternative in {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFVal(x_path_grammarParser.FValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fRp}
	 * labeled alternative in {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRp(x_path_grammarParser.FRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fInd}
	 * labeled alternative in {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFInd(x_path_grammarParser.FIndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fOr}
	 * labeled alternative in {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOr(x_path_grammarParser.FOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fAnd}
	 * labeled alternative in {@link x_path_grammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAnd(x_path_grammarParser.FAndContext ctx);
}