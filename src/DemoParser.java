// Generated from D:/Infa sem1/2Jezyki formalne i kompilatory/laby/moj_projekt\Demo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		READ=18, PRINT=19, TOINT=20, TOREAL=21, ID=22, ADD=23, MULT=24, SUB=25, 
		DIV=26, REAL=27, INT=28, STRING=29, NEWLINE=30, COMMENT=31, WS=32;
	public static final int
		RULE_prog = 0, RULE_newblock = 1, RULE_start = 2, RULE_function = 3, RULE_fblock = 4, 
		RULE_expr0 = 5, RULE_expr1 = 6, RULE_expr2 = 7, RULE_var = 8, RULE_icmp = 9, 
		RULE_number = 10, RULE_blockif = 11, RULE_blockif_and_else = 12, RULE_block_else = 13, 
		RULE_repetitions = 14, RULE_value = 15, RULE_funid = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "newblock", "start", "function", "fblock", "expr0", "expr1", 
			"expr2", "var", "icmp", "number", "blockif", "blockif_and_else", "block_else", 
			"repetitions", "value", "funid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'string'", "'if'", "'{'", "'}'", "'else'", 
			"'loop'", "'def'", "'return'", "'int'", "'real'", "'=='", "'!='", "'>'", 
			"'<'", "'read'", "'print'", "'(int)'", "'(real)'", null, "'+'", "'*'", 
			"'-'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "READ", "PRINT", "TOINT", "TOREAL", 
			"ID", "ADD", "MULT", "SUB", "DIV", "REAL", "INT", "STRING", "NEWLINE", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DemoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public NewblockContext newblock() {
			return getRuleContext(NewblockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			newblock();
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

	public static class NewblockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public NewblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterNewblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitNewblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitNewblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewblockContext newblock() throws RecognitionException {
		NewblockContext _localctx = new NewblockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << READ) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__4:
				case T__8:
				case T__11:
				case T__12:
				case READ:
				case PRINT:
				case ID:
					{
					setState(36);
					start();
					}
					break;
				case T__9:
					{
					setState(37);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(40);
				match(NEWLINE);
				}
				}
				setState(45);
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

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_and_elseContext extends StartContext {
		public IcmpContext icmp() {
			return getRuleContext(IcmpContext.class,0);
		}
		public Blockif_and_elseContext blockif_and_else() {
			return getRuleContext(Blockif_and_elseContext.class,0);
		}
		public Block_elseContext block_else() {
			return getRuleContext(Block_elseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public If_and_elseContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIf_and_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIf_and_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitIf_and_else(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StartContext {
		public TerminalNode PRINT() { return getToken(DemoParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public PrintContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintstringContext extends StartContext {
		public TerminalNode PRINT() { return getToken(DemoParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public PrintstringContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterPrintstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitPrintstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPrintstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StartContext {
		public TerminalNode READ() { return getToken(DemoParser.READ, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public ReadContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctioncallContext extends StartContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public FunctioncallContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatContext extends StartContext {
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public NewblockContext newblock() {
			return getRuleContext(NewblockContext.class,0);
		}
		public RepeatContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaratestringContext extends StartContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public DeclaratestringContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterDeclaratestring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitDeclaratestring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitDeclaratestring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_IDContext extends StartContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Single_IDContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSingle_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSingle_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitSingle_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StartContext {
		public IcmpContext icmp() {
			return getRuleContext(IcmpContext.class,0);
		}
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public IfContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StartContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				var();
				setState(47);
				match(T__0);
				setState(48);
				expr0(0);
				}
				break;
			case 2:
				_localctx = new PrintstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(PRINT);
				setState(51);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(PRINT);
				setState(53);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(READ);
				setState(55);
				match(ID);
				}
				break;
			case 5:
				_localctx = new FunctioncallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				match(ID);
				setState(57);
				match(T__1);
				setState(58);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new DeclaratestringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				match(T__3);
				setState(60);
				match(ID);
				setState(61);
				match(T__0);
				setState(62);
				match(STRING);
				}
				break;
			case 7:
				_localctx = new Single_IDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				var();
				}
				break;
			case 8:
				_localctx = new If_and_elseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				match(T__4);
				setState(65);
				match(T__1);
				setState(66);
				icmp();
				setState(67);
				match(T__2);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(68);
					match(NEWLINE);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(T__5);
				setState(75);
				blockif_and_else();
				setState(76);
				match(T__6);
				setState(77);
				match(T__7);
				setState(78);
				match(T__5);
				setState(79);
				block_else();
				setState(80);
				match(T__6);
				}
				break;
			case 9:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
				match(T__4);
				setState(83);
				match(T__1);
				setState(84);
				icmp();
				setState(85);
				match(T__2);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(86);
					match(NEWLINE);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__5);
				setState(93);
				blockif();
				setState(94);
				match(T__6);
				}
				break;
			case 10:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(96);
				match(T__8);
				setState(97);
				repetitions();
				setState(98);
				match(T__5);
				setState(99);
				newblock();
				setState(100);
				match(T__6);
				}
				break;
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

	public static class FunctionContext extends ParserRuleContext {
		public FunidContext funid() {
			return getRuleContext(FunidContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__9);
			setState(105);
			funid();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(106);
				match(NEWLINE);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__5);
			setState(113);
			fblock();
			setState(114);
			match(T__10);
			setState(115);
			value();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(116);
				match(NEWLINE);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__6);
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

	public static class FblockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << READ) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << READ) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(124);
					start();
					}
				}

				setState(127);
				match(NEWLINE);
				}
				}
				setState(132);
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

	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSingle0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitSingle0(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends Expr0Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode ADD() { return getToken(DemoParser.ADD, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends Expr0Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode SUB() { return getToken(DemoParser.SUB, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public SubContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		return expr0(0);
	}

	private Expr0Context expr0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr0Context _localctx = new Expr0Context(_ctx, _parentState);
		Expr0Context _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single0Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(134);
			expr1();
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new Expr0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(137);
						match(ADD);
						setState(138);
						expr1();
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new Expr0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(139);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(140);
						match(SUB);
						setState(141);
						expr1();
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode DIV() { return getToken(DemoParser.DIV, 0); }
		public DivContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSingle1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitSingle1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(DemoParser.MULT, 0); }
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr1);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				expr2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				expr2();
				setState(149);
				match(MULT);
				setState(150);
				expr2();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				expr2();
				setState(153);
				match(DIV);
				setState(154);
				expr2();
				}
				break;
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends Expr2Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(DemoParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitToint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitToint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TorealContext extends Expr2Context {
		public TerminalNode TOREAL() { return getToken(DemoParser.TOREAL, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TorealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterToreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitToreal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitToreal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealContext extends Expr2Context {
		public TerminalNode REAL() { return getToken(DemoParser.REAL, 0); }
		public RealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends Expr2Context {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public IdContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Functioncall_in_exprContext extends Expr2Context {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public Functioncall_in_exprContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFunctioncall_in_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFunctioncall_in_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFunctioncall_in_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends Expr2Context {
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public IntContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr2);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(INT);
				}
				break;
			case 2:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(REAL);
				}
				break;
			case 3:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(ID);
				}
				break;
			case 4:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(TOINT);
				setState(162);
				expr2();
				}
				break;
			case 5:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(TOREAL);
				setState(164);
				expr2();
				}
				break;
			case 6:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(T__1);
				setState(166);
				expr0(0);
				setState(167);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new Functioncall_in_exprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				match(ID);
				setState(170);
				match(T__1);
				setState(171);
				match(T__2);
				}
				break;
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

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Just_idContext extends VarContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public Just_idContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterJust_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitJust_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitJust_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarateintContext extends VarContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public DeclarateintContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterDeclarateint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitDeclarateint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitDeclarateint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaraterealContext extends VarContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public DeclaraterealContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterDeclaratereal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitDeclaratereal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitDeclaratereal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new DeclarateintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__11);
				setState(175);
				match(ID);
				}
				break;
			case T__12:
				_localctx = new DeclaraterealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__12);
				setState(177);
				match(ID);
				}
				break;
			case ID:
				_localctx = new Just_idContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(ID);
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

	public static class IcmpContext extends ParserRuleContext {
		public IcmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icmp; }
	 
		public IcmpContext() { }
		public void copyFrom(IcmpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Is_greaterContext extends IcmpContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Is_greaterContext(IcmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIs_greater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIs_greater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitIs_greater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is_not_equalContext extends IcmpContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Is_not_equalContext(IcmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIs_not_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIs_not_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitIs_not_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is_lessContext extends IcmpContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Is_lessContext(IcmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIs_less(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIs_less(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitIs_less(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is_equalContext extends IcmpContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Is_equalContext(IcmpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIs_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIs_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitIs_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IcmpContext icmp() throws RecognitionException {
		IcmpContext _localctx = new IcmpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_icmp);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Is_equalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(ID);
				setState(182);
				match(T__13);
				setState(183);
				number();
				}
				break;
			case 2:
				_localctx = new Is_not_equalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(ID);
				setState(185);
				match(T__14);
				setState(186);
				number();
				}
				break;
			case 3:
				_localctx = new Is_greaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(ID);
				setState(188);
				match(T__15);
				setState(189);
				number();
				}
				break;
			case 4:
				_localctx = new Is_lessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(ID);
				setState(191);
				match(T__16);
				setState(192);
				number();
				}
				break;
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode REAL() { return getToken(DemoParser.REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BlockifContext extends ParserRuleContext {
		public NewblockContext newblock() {
			return getRuleContext(NewblockContext.class,0);
		}
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBlockif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBlockif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitBlockif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			newblock();
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

	public static class Blockif_and_elseContext extends ParserRuleContext {
		public NewblockContext newblock() {
			return getRuleContext(NewblockContext.class,0);
		}
		public Blockif_and_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif_and_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBlockif_and_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBlockif_and_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitBlockif_and_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Blockif_and_elseContext blockif_and_else() throws RecognitionException {
		Blockif_and_elseContext _localctx = new Blockif_and_elseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockif_and_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			newblock();
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

	public static class Block_elseContext extends ParserRuleContext {
		public NewblockContext newblock() {
			return getRuleContext(NewblockContext.class,0);
		}
		public Block_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBlock_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBlock_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitBlock_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_elseContext block_else() throws RecognitionException {
		Block_elseContext _localctx = new Block_elseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			newblock();
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

	public static class RepetitionsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitRepetitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitRepetitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repetitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public FunidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFunid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFunid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFunid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunidContext funid() throws RecognitionException {
		FunidContext _localctx = new FunidContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr0_sempred((Expr0Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr0_sempred(Expr0Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\5\3)\n\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4i\n\4\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\6\5\6\u0080\n\6\3\6\7\6\u0083\n\6"+
		"\f\6\16\6\u0086\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0091\n\7"+
		"\f\7\16\7\u0094\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00af\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00c4\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\3\f\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\4\3\2\35\36\4\2\30\30\36\36\2\u00e3\2$\3\2"+
		"\2\2\4-\3\2\2\2\6h\3\2\2\2\bj\3\2\2\2\n\u0084\3\2\2\2\f\u0087\3\2\2\2"+
		"\16\u009e\3\2\2\2\20\u00ae\3\2\2\2\22\u00b5\3\2\2\2\24\u00c3\3\2\2\2\26"+
		"\u00c5\3\2\2\2\30\u00c7\3\2\2\2\32\u00c9\3\2\2\2\34\u00cb\3\2\2\2\36\u00cd"+
		"\3\2\2\2 \u00cf\3\2\2\2\"\u00d1\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&)\5\6\4\2"+
		"\')\5\b\5\2(&\3\2\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*,\7 \2\2+(\3\2\2"+
		"\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/-\3\2\2\2\60\61\5\22\n\2\61"+
		"\62\7\3\2\2\62\63\5\f\7\2\63i\3\2\2\2\64\65\7\25\2\2\65i\7\37\2\2\66\67"+
		"\7\25\2\2\67i\7\30\2\289\7\24\2\29i\7\30\2\2:;\7\30\2\2;<\7\4\2\2<i\7"+
		"\5\2\2=>\7\6\2\2>?\7\30\2\2?@\7\3\2\2@i\7\37\2\2Ai\5\22\n\2BC\7\7\2\2"+
		"CD\7\4\2\2DE\5\24\13\2EI\7\5\2\2FH\7 \2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\b\2\2MN\5\32\16\2NO\7\t\2\2OP\7\n"+
		"\2\2PQ\7\b\2\2QR\5\34\17\2RS\7\t\2\2Si\3\2\2\2TU\7\7\2\2UV\7\4\2\2VW\5"+
		"\24\13\2W[\7\5\2\2XZ\7 \2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"^\3\2\2\2][\3\2\2\2^_\7\b\2\2_`\5\30\r\2`a\7\t\2\2ai\3\2\2\2bc\7\13\2"+
		"\2cd\5\36\20\2de\7\b\2\2ef\5\4\3\2fg\7\t\2\2gi\3\2\2\2h\60\3\2\2\2h\64"+
		"\3\2\2\2h\66\3\2\2\2h8\3\2\2\2h:\3\2\2\2h=\3\2\2\2hA\3\2\2\2hB\3\2\2\2"+
		"hT\3\2\2\2hb\3\2\2\2i\7\3\2\2\2jk\7\f\2\2ko\5\"\22\2ln\7 \2\2ml\3\2\2"+
		"\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\b\2\2st\5\n\6"+
		"\2tu\7\r\2\2uy\5 \21\2vx\7 \2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z|\3\2\2\2{y\3\2\2\2|}\7\t\2\2}\t\3\2\2\2~\u0080\5\6\4\2\177~\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7 \2\2\u0082\177"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\13\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\7\1\2\u0088\u0089\5\16\b"+
		"\2\u0089\u0092\3\2\2\2\u008a\u008b\f\4\2\2\u008b\u008c\7\31\2\2\u008c"+
		"\u0091\5\16\b\2\u008d\u008e\f\3\2\2\u008e\u008f\7\33\2\2\u008f\u0091\5"+
		"\16\b\2\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\r\3\2\2\2\u0094\u0092\3\2\2\2"+
		"\u0095\u009f\5\20\t\2\u0096\u0097\5\20\t\2\u0097\u0098\7\32\2\2\u0098"+
		"\u0099\5\20\t\2\u0099\u009f\3\2\2\2\u009a\u009b\5\20\t\2\u009b\u009c\7"+
		"\34\2\2\u009c\u009d\5\20\t\2\u009d\u009f\3\2\2\2\u009e\u0095\3\2\2\2\u009e"+
		"\u0096\3\2\2\2\u009e\u009a\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00af\7\36\2"+
		"\2\u00a1\u00af\7\35\2\2\u00a2\u00af\7\30\2\2\u00a3\u00a4\7\26\2\2\u00a4"+
		"\u00af\5\20\t\2\u00a5\u00a6\7\27\2\2\u00a6\u00af\5\20\t\2\u00a7\u00a8"+
		"\7\4\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\7\5\2\2\u00aa\u00af\3\2\2\2\u00ab"+
		"\u00ac\7\30\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00af\7\5\2\2\u00ae\u00a0\3"+
		"\2\2\2\u00ae\u00a1\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae"+
		"\u00a5\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\21\3\2\2"+
		"\2\u00b0\u00b1\7\16\2\2\u00b1\u00b6\7\30\2\2\u00b2\u00b3\7\17\2\2\u00b3"+
		"\u00b6\7\30\2\2\u00b4\u00b6\7\30\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b2\3"+
		"\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b8\7\30\2\2\u00b8"+
		"\u00b9\7\20\2\2\u00b9\u00c4\5\26\f\2\u00ba\u00bb\7\30\2\2\u00bb\u00bc"+
		"\7\21\2\2\u00bc\u00c4\5\26\f\2\u00bd\u00be\7\30\2\2\u00be\u00bf\7\22\2"+
		"\2\u00bf\u00c4\5\26\f\2\u00c0\u00c1\7\30\2\2\u00c1\u00c2\7\23\2\2\u00c2"+
		"\u00c4\5\26\f\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3"+
		"\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\25\3\2\2\2\u00c5\u00c6\t\2\2\2\u00c6"+
		"\27\3\2\2\2\u00c7\u00c8\5\4\3\2\u00c8\31\3\2\2\2\u00c9\u00ca\5\4\3\2\u00ca"+
		"\33\3\2\2\2\u00cb\u00cc\5\4\3\2\u00cc\35\3\2\2\2\u00cd\u00ce\t\3\2\2\u00ce"+
		"\37\3\2\2\2\u00cf\u00d0\t\3\2\2\u00d0!\3\2\2\2\u00d1\u00d2\7\30\2\2\u00d2"+
		"#\3\2\2\2\21(-I[hoy\177\u0084\u0090\u0092\u009e\u00ae\u00b5\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}