// Generated from D:/Infa sem1/2Jezyki formalne i kompilatory/laby/moj_projekt\Demo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DemoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#newblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewblock(DemoParser.NewblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DemoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printstring}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstring(DemoParser.PrintstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DemoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(DemoParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncall}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(DemoParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaratestring}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratestring(DemoParser.DeclaratestringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_ID}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_ID(DemoParser.Single_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_and_else}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_and_else(DemoParser.If_and_elseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(DemoParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(DemoParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DemoParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#fblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFblock(DemoParser.FblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle0(DemoParser.Single0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(DemoParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(DemoParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle1(DemoParser.Single1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(DemoParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(DemoParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(DemoParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(DemoParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DemoParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToint(DemoParser.TointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToreal(DemoParser.TorealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(DemoParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functioncall_in_expr}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall_in_expr(DemoParser.Functioncall_in_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarateint}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarateint(DemoParser.DeclarateintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaratereal}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratereal(DemoParser.DeclaraterealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code just_id}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJust_id(DemoParser.Just_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_equal}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_equal(DemoParser.Is_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_not_equal}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_not_equal(DemoParser.Is_not_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_greater}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_greater(DemoParser.Is_greaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_less}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_less(DemoParser.Is_lessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DemoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#blockif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockif(DemoParser.BlockifContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#blockif_and_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockif_and_else(DemoParser.Blockif_and_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#block_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_else(DemoParser.Block_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#repetitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitions(DemoParser.RepetitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DemoParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#funid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunid(DemoParser.FunidContext ctx);
}