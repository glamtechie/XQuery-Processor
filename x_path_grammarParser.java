// Generated from x_path_grammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class x_path_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Id=37, String_constant=38, 
		Ws=39;
	public static final int
		RULE_r = 0, RULE_ap = 1, RULE_rp = 2, RULE_f = 3, RULE_xq = 4, RULE_forClause = 5, 
		RULE_letClause = 6, RULE_whereClause = 7, RULE_returnClause = 8, RULE_cond = 9, 
		RULE_var = 10, RULE_file_name = 11;
	public static final String[] ruleNames = {
		"r", "ap", "rp", "f", "xq", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "var", "file_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'document(\"'", "'\")/'", "'\")//'", "'*'", "'.'", "'..'", "'text()'", 
		"'('", "')'", "'/'", "'//'", "'['", "']'", "','", "'@'", "'='", "'eq'", 
		"'=='", "'is'", "'and'", "'or'", "'not'", "'<'", "'>{'", "'}</'", "'>'", 
		"'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'empty('", "'some'", 
		"'satisfies'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Id", "String_constant", "Ws"
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

	@Override
	public String getGrammarFileName() { return "x_path_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public x_path_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			xq(0);
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

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApSlashContext extends ApContext {
		public File_nameContext tag;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ApSlashContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitApSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApDeepContext extends ApContext {
		public File_nameContext tag;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ApDeepContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitApDeep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ap);
		try {
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApSlashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__0);
				setState(27);
				((ApSlashContext)_localctx).tag = file_name();
				setState(28);
				match(T__1);
				setState(29);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApDeepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__0);
				setState(32);
				((ApDeepContext)_localctx).tag = file_name();
				setState(33);
				match(T__2);
				setState(34);
				rp(0);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RpTextContext extends RpContext {
		public RpTextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpCondContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpCondContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpPlainContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpPlainContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpPlain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpTagContext extends RpContext {
		public TerminalNode Id() { return getToken(x_path_grammarParser.Id, 0); }
		public RpTagContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpNextContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpNextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpNext(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpParentContext extends RpContext {
		public RpParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpDeepContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpDeepContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpDeep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpStarContext extends RpContext {
		public RpStarContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpCurrentContext extends RpContext {
		public RpCurrentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpCurrent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpIndContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpIndContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpInd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpAttrContext extends RpContext {
		public TerminalNode Id() { return getToken(x_path_grammarParser.Id, 0); }
		public RpAttrContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRpAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			switch (_input.LA(1)) {
			case Id:
				{
				_localctx = new RpTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(Id);
				}
				break;
			case T__3:
				{
				_localctx = new RpStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__3);
				}
				break;
			case T__4:
				{
				_localctx = new RpCurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__4);
				}
				break;
			case T__5:
				{
				_localctx = new RpParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new RpTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new RpPlainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(T__7);
				setState(45);
				rp(0);
				setState(46);
				match(T__8);
				}
				break;
			case T__14:
				{
				_localctx = new RpAttrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(T__14);
				setState(49);
				match(Id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RpNextContext(new RpContext(_parentctx, _parentState));
						((RpNextContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(52);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(53);
						match(T__9);
						setState(54);
						((RpNextContext)_localctx).right = rp(6);
						}
						break;
					case 2:
						{
						_localctx = new RpDeepContext(new RpContext(_parentctx, _parentState));
						((RpDeepContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(55);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(56);
						match(T__10);
						setState(57);
						((RpDeepContext)_localctx).right = rp(5);
						}
						break;
					case 3:
						{
						_localctx = new RpIndContext(new RpContext(_parentctx, _parentState));
						((RpIndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(58);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(59);
						match(T__13);
						setState(60);
						((RpIndContext)_localctx).right = rp(3);
						}
						break;
					case 4:
						{
						_localctx = new RpCondContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(61);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(62);
						match(T__11);
						setState(63);
						f(0);
						setState(64);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FIsContext extends FContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FIsContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitFIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FNotContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FNotContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitFNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FEqContext extends FContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FEqContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitFEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRpContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FRpContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitFRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FIndContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FIndContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitFInd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FOrContext extends FContext {
		public FContext left;
		public FContext right;
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FOrContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitFOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FAndContext extends FContext {
		public FContext left;
		public FContext right;
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FAndContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitFAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				match(T__21);
				setState(73);
				f(1);
				}
				break;
			case 2:
				{
				_localctx = new FRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				((FEqContext)_localctx).left = rp(0);
				setState(76);
				match(T__15);
				setState(77);
				((FEqContext)_localctx).right = rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				((FEqContext)_localctx).left = rp(0);
				setState(80);
				match(T__16);
				setState(81);
				((FEqContext)_localctx).right = rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				((FIsContext)_localctx).left = rp(0);
				setState(84);
				match(T__17);
				setState(85);
				((FIsContext)_localctx).right = rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				((FIsContext)_localctx).left = rp(0);
				setState(88);
				match(T__18);
				setState(89);
				((FIsContext)_localctx).right = rp(0);
				}
				break;
			case 7:
				{
				_localctx = new FIndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__7);
				setState(92);
				f(0);
				setState(93);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FAndContext(new FContext(_parentctx, _parentState));
						((FAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(97);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(98);
						match(T__19);
						setState(99);
						((FAndContext)_localctx).right = f(4);
						}
						break;
					case 2:
						{
						_localctx = new FOrContext(new FContext(_parentctx, _parentState));
						((FOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(100);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(101);
						match(T__20);
						setState(102);
						((FOrContext)_localctx).right = f(3);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class XqContext extends ParserRuleContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode String_constant() { return getToken(x_path_grammarParser.String_constant, 0); }
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(x_path_grammarParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(x_path_grammarParser.Id, i);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(109);
				letClause();
				setState(110);
				xq(1);
				}
				break;
			case T__35:
				{
				setState(112);
				var();
				}
				break;
			case String_constant:
				{
				setState(113);
				match(String_constant);
				}
				break;
			case T__0:
				{
				setState(114);
				ap();
				}
				break;
			case T__7:
				{
				setState(115);
				match(T__7);
				setState(116);
				xq(0);
				setState(117);
				match(T__8);
				}
				break;
			case T__22:
				{
				setState(119);
				match(T__22);
				setState(120);
				match(Id);
				setState(121);
				match(T__23);
				setState(122);
				xq(0);
				setState(123);
				match(T__24);
				setState(124);
				match(Id);
				setState(125);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(127);
				forClause();
				setState(129);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(128);
					letClause();
					}
				}

				setState(132);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(131);
					whereClause();
					}
				}

				setState(134);
				returnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(139);
						match(T__13);
						setState(140);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(142);
						match(T__9);
						setState(143);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__26);
			setState(150);
			var();
			setState(151);
			match(T__27);
			setState(152);
			xq(0);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(153);
				match(T__13);
				setState(154);
				var();
				setState(155);
				match(T__27);
				setState(156);
				xq(0);
				}
				}
				setState(162);
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

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__28);
			setState(164);
			var();
			setState(165);
			match(T__29);
			setState(166);
			xq(0);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(167);
				match(T__13);
				setState(168);
				var();
				setState(169);
				match(T__29);
				setState(170);
				xq(0);
				}
				}
				setState(176);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__30);
			setState(178);
			cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__31);
			setState(181);
			xq(0);
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

	public static class CondContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(184);
				match(T__33);
				setState(185);
				var();
				setState(186);
				match(T__27);
				setState(187);
				xq(0);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(188);
					match(T__13);
					setState(189);
					var();
					setState(190);
					match(T__27);
					setState(191);
					xq(0);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(T__34);
				setState(199);
				cond(5);
				}
				break;
			case 2:
				{
				setState(201);
				match(T__21);
				setState(202);
				cond(1);
				}
				break;
			case 3:
				{
				setState(203);
				xq(0);
				setState(204);
				match(T__15);
				setState(205);
				xq(0);
				}
				break;
			case 4:
				{
				setState(207);
				xq(0);
				setState(208);
				match(T__16);
				setState(209);
				xq(0);
				}
				break;
			case 5:
				{
				setState(211);
				xq(0);
				setState(212);
				match(T__17);
				setState(213);
				xq(0);
				}
				break;
			case 6:
				{
				setState(215);
				xq(0);
				setState(216);
				match(T__18);
				setState(217);
				xq(0);
				}
				break;
			case 7:
				{
				setState(219);
				match(T__32);
				setState(220);
				xq(0);
				setState(221);
				match(T__8);
				}
				break;
			case 8:
				{
				setState(223);
				match(T__7);
				setState(224);
				cond(0);
				setState(225);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(229);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(230);
						match(T__19);
						setState(231);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(232);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(233);
						match(T__20);
						setState(234);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(x_path_grammarParser.Id, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__35);
			setState(241);
			match(Id);
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

	public static class File_nameContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(x_path_grammarParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(x_path_grammarParser.Id, i);
		}
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_file_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(Id);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(244);
				match(T__4);
				setState(245);
				match(Id);
				}
				}
				setState(250);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 3:
			return f_sempred((FContext)_localctx, predIndex);
		case 4:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 9:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4E\n\4\f\4\16"+
		"\4H\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5j\n\5\f\5\16\5m\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n\6\3\6\5\6\u0087\n\6\3"+
		"\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0093\n\6\f\6\16\6\u0096"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a1\n\7\f\7\16\7\u00a4"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00af\n\b\f\b\16\b\u00b2"+
		"\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00c4\n\13\f\13\16\13\u00c7\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e6\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ee\n\13\f\13\16\13\u00f1\13\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00f9\n\r\f\r\16\r\u00fc\13\r\3\r\2\6\6\b"+
		"\n\24\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u011b\2\32\3\2\2\2\4&\3\2\2"+
		"\2\6\64\3\2\2\2\ba\3\2\2\2\n\u008a\3\2\2\2\f\u0097\3\2\2\2\16\u00a5\3"+
		"\2\2\2\20\u00b3\3\2\2\2\22\u00b6\3\2\2\2\24\u00e5\3\2\2\2\26\u00f2\3\2"+
		"\2\2\30\u00f5\3\2\2\2\32\33\5\n\6\2\33\3\3\2\2\2\34\35\7\3\2\2\35\36\5"+
		"\30\r\2\36\37\7\4\2\2\37 \5\6\4\2 \'\3\2\2\2!\"\7\3\2\2\"#\5\30\r\2#$"+
		"\7\5\2\2$%\5\6\4\2%\'\3\2\2\2&\34\3\2\2\2&!\3\2\2\2\'\5\3\2\2\2()\b\4"+
		"\1\2)\65\7\'\2\2*\65\7\6\2\2+\65\7\7\2\2,\65\7\b\2\2-\65\7\t\2\2./\7\n"+
		"\2\2/\60\5\6\4\2\60\61\7\13\2\2\61\65\3\2\2\2\62\63\7\21\2\2\63\65\7\'"+
		"\2\2\64(\3\2\2\2\64*\3\2\2\2\64+\3\2\2\2\64,\3\2\2\2\64-\3\2\2\2\64.\3"+
		"\2\2\2\64\62\3\2\2\2\65F\3\2\2\2\66\67\f\7\2\2\678\7\f\2\28E\5\6\4\b9"+
		":\f\6\2\2:;\7\r\2\2;E\5\6\4\7<=\f\4\2\2=>\7\20\2\2>E\5\6\4\5?@\f\5\2\2"+
		"@A\7\16\2\2AB\5\b\5\2BC\7\17\2\2CE\3\2\2\2D\66\3\2\2\2D9\3\2\2\2D<\3\2"+
		"\2\2D?\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IJ\b"+
		"\5\1\2JK\7\30\2\2Kb\5\b\5\3Lb\5\6\4\2MN\5\6\4\2NO\7\22\2\2OP\5\6\4\2P"+
		"b\3\2\2\2QR\5\6\4\2RS\7\23\2\2ST\5\6\4\2Tb\3\2\2\2UV\5\6\4\2VW\7\24\2"+
		"\2WX\5\6\4\2Xb\3\2\2\2YZ\5\6\4\2Z[\7\25\2\2[\\\5\6\4\2\\b\3\2\2\2]^\7"+
		"\n\2\2^_\5\b\5\2_`\7\13\2\2`b\3\2\2\2aI\3\2\2\2aL\3\2\2\2aM\3\2\2\2aQ"+
		"\3\2\2\2aU\3\2\2\2aY\3\2\2\2a]\3\2\2\2bk\3\2\2\2cd\f\5\2\2de\7\26\2\2"+
		"ej\5\b\5\6fg\f\4\2\2gh\7\27\2\2hj\5\b\5\5ic\3\2\2\2if\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2kl\3\2\2\2l\t\3\2\2\2mk\3\2\2\2no\b\6\1\2op\5\16\b\2pq\5\n"+
		"\6\3q\u008b\3\2\2\2r\u008b\5\26\f\2s\u008b\7(\2\2t\u008b\5\4\3\2uv\7\n"+
		"\2\2vw\5\n\6\2wx\7\13\2\2x\u008b\3\2\2\2yz\7\31\2\2z{\7\'\2\2{|\7\32\2"+
		"\2|}\5\n\6\2}~\7\33\2\2~\177\7\'\2\2\177\u0080\7\34\2\2\u0080\u008b\3"+
		"\2\2\2\u0081\u0083\5\f\7\2\u0082\u0084\5\16\b\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\5\20\t\2\u0086\u0085\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\22\n\2\u0089"+
		"\u008b\3\2\2\2\u008an\3\2\2\2\u008ar\3\2\2\2\u008as\3\2\2\2\u008at\3\2"+
		"\2\2\u008au\3\2\2\2\u008ay\3\2\2\2\u008a\u0081\3\2\2\2\u008b\u0094\3\2"+
		"\2\2\u008c\u008d\f\7\2\2\u008d\u008e\7\20\2\2\u008e\u0093\5\n\6\b\u008f"+
		"\u0090\f\6\2\2\u0090\u0091\7\f\2\2\u0091\u0093\5\6\4\2\u0092\u008c\3\2"+
		"\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\13\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\35\2"+
		"\2\u0098\u0099\5\26\f\2\u0099\u009a\7\36\2\2\u009a\u00a2\5\n\6\2\u009b"+
		"\u009c\7\20\2\2\u009c\u009d\5\26\f\2\u009d\u009e\7\36\2\2\u009e\u009f"+
		"\5\n\6\2\u009f\u00a1\3\2\2\2\u00a0\u009b\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\r\3\2\2\2\u00a4\u00a2\3\2\2\2"+
		"\u00a5\u00a6\7\37\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\7 \2\2\u00a8\u00b0"+
		"\5\n\6\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\7 \2\2"+
		"\u00ac\u00ad\5\n\6\2\u00ad\u00af\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\17\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\5\24\13\2\u00b5\21\3\2\2"+
		"\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\5\n\6\2\u00b8\23\3\2\2\2\u00b9\u00ba"+
		"\b\13\1\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\5\26\f\2\u00bc\u00bd\7\36\2\2"+
		"\u00bd\u00c5\5\n\6\2\u00be\u00bf\7\20\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1"+
		"\7\36\2\2\u00c1\u00c2\5\n\6\2\u00c2\u00c4\3\2\2\2\u00c3\u00be\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7%\2\2\u00c9\u00ca\5\24\13\7"+
		"\u00ca\u00e6\3\2\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00e6\5\24\13\3\u00cd"+
		"\u00ce\5\n\6\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\5\n\6\2\u00d0\u00e6\3"+
		"\2\2\2\u00d1\u00d2\5\n\6\2\u00d2\u00d3\7\23\2\2\u00d3\u00d4\5\n\6\2\u00d4"+
		"\u00e6\3\2\2\2\u00d5\u00d6\5\n\6\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\5"+
		"\n\6\2\u00d8\u00e6\3\2\2\2\u00d9\u00da\5\n\6\2\u00da\u00db\7\25\2\2\u00db"+
		"\u00dc\5\n\6\2\u00dc\u00e6\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df\5\n"+
		"\6\2\u00df\u00e0\7\13\2\2\u00e0\u00e6\3\2\2\2\u00e1\u00e2\7\n\2\2\u00e2"+
		"\u00e3\5\24\13\2\u00e3\u00e4\7\13\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00b9"+
		"\3\2\2\2\u00e5\u00cb\3\2\2\2\u00e5\u00cd\3\2\2\2\u00e5\u00d1\3\2\2\2\u00e5"+
		"\u00d5\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e1\3\2"+
		"\2\2\u00e6\u00ef\3\2\2\2\u00e7\u00e8\f\5\2\2\u00e8\u00e9\7\26\2\2\u00e9"+
		"\u00ee\5\24\13\6\u00ea\u00eb\f\4\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00ee"+
		"\5\24\13\5\u00ed\u00e7\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\25\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\7\'\2\2\u00f4\27\3\2\2\2\u00f5"+
		"\u00fa\7\'\2\2\u00f6\u00f7\7\7\2\2\u00f7\u00f9\7\'\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\31\3\2\2\2\u00fc\u00fa\3\2\2\2\25&\64DFaik\u0083\u0086\u008a\u0092\u0094"+
		"\u00a2\u00b0\u00c5\u00e5\u00ed\u00ef\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}