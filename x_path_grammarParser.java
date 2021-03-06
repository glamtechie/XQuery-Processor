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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		Id=39, String_constant=40, Ws=41;
	public static final int
		RULE_r = 0, RULE_ap = 1, RULE_rp = 2, RULE_f = 3, RULE_oxq = 4, RULE_xq = 5, 
		RULE_list = 6, RULE_id = 7, RULE_forJ = 8, RULE_path = 9, RULE_condJ = 10, 
		RULE_returnJ = 11, RULE_forClause = 12, RULE_letClause = 13, RULE_whereClause = 14, 
		RULE_returnClause = 15, RULE_cond = 16, RULE_var = 17;
	public static final String[] ruleNames = {
		"r", "ap", "rp", "f", "oxq", "xq", "list", "id", "forJ", "path", "condJ", 
		"returnJ", "forClause", "letClause", "whereClause", "returnClause", "cond", 
		"var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'document'", "'(\"'", "'\")'", "'/'", "'//'", "'*'", "'.'", "'..'", 
		"'text()'", "'('", "')'", "'['", "']'", "','", "'@'", "'='", "'eq'", "'=='", 
		"'is'", "'and'", "'or'", "'not'", "'for'", "'where'", "'return'", "'<'", 
		"'>'", "'{'", "'}'", "'</'", "'join'", "'in'", "'let'", "':='", "'empty'", 
		"'some'", "'satisfies'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Id", "String_constant", "Ws"
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
		public OxqContext oxq() {
			return getRuleContext(OxqContext.class,0);
		}
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
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				oxq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				xq(0);
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
		public Token tag;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode Id() { return getToken(x_path_grammarParser.Id, 0); }
		public ApSlashContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitApSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApDeepContext extends ApContext {
		public Token tag;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode Id() { return getToken(x_path_grammarParser.Id, 0); }
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
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ApSlashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__0);
				setState(41);
				match(T__1);
				setState(42);
				((ApSlashContext)_localctx).tag = match(Id);
				setState(43);
				match(T__2);
				setState(44);
				match(T__3);
				setState(45);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApDeepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__0);
				setState(47);
				match(T__1);
				setState(48);
				((ApDeepContext)_localctx).tag = match(Id);
				setState(49);
				match(T__2);
				setState(50);
				match(T__4);
				setState(51);
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
			setState(66);
			switch (_input.LA(1)) {
			case Id:
				{
				_localctx = new RpTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(55);
				match(Id);
				}
				break;
			case T__5:
				{
				_localctx = new RpStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new RpCurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new RpParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new RpTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new RpPlainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(T__9);
				setState(61);
				rp(0);
				setState(62);
				match(T__10);
				}
				break;
			case T__14:
				{
				_localctx = new RpAttrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(T__14);
				setState(65);
				match(Id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new RpNextContext(new RpContext(_parentctx, _parentState));
						((RpNextContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(68);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(69);
						match(T__3);
						setState(70);
						((RpNextContext)_localctx).right = rp(6);
						}
						break;
					case 2:
						{
						_localctx = new RpDeepContext(new RpContext(_parentctx, _parentState));
						((RpDeepContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(71);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(72);
						match(T__4);
						setState(73);
						((RpDeepContext)_localctx).right = rp(5);
						}
						break;
					case 3:
						{
						_localctx = new RpIndContext(new RpContext(_parentctx, _parentState));
						((RpIndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(74);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(75);
						match(T__13);
						setState(76);
						((RpIndContext)_localctx).right = rp(3);
						}
						break;
					case 4:
						{
						_localctx = new RpCondContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(77);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(78);
						match(T__11);
						setState(79);
						f(0);
						setState(80);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new FNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(T__21);
				setState(89);
				f(1);
				}
				break;
			case 2:
				{
				_localctx = new FRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				((FEqContext)_localctx).left = rp(0);
				setState(92);
				match(T__15);
				setState(93);
				((FEqContext)_localctx).right = rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				((FEqContext)_localctx).left = rp(0);
				setState(96);
				match(T__16);
				setState(97);
				((FEqContext)_localctx).right = rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				((FIsContext)_localctx).left = rp(0);
				setState(100);
				match(T__17);
				setState(101);
				((FIsContext)_localctx).right = rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				((FIsContext)_localctx).left = rp(0);
				setState(104);
				match(T__18);
				setState(105);
				((FIsContext)_localctx).right = rp(0);
				}
				break;
			case 7:
				{
				_localctx = new FIndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(T__9);
				setState(108);
				f(0);
				setState(109);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new FAndContext(new FContext(_parentctx, _parentState));
						((FAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						match(T__19);
						setState(115);
						((FAndContext)_localctx).right = f(4);
						}
						break;
					case 2:
						{
						_localctx = new FOrContext(new FContext(_parentctx, _parentState));
						((FOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(117);
						match(T__20);
						setState(118);
						((FOrContext)_localctx).right = f(3);
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class OxqContext extends ParserRuleContext {
		public OxqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oxq; }
	 
		public OxqContext() { }
		public void copyFrom(OxqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RewriteXqContext extends OxqContext {
		public ForJContext forJ() {
			return getRuleContext(ForJContext.class,0);
		}
		public CondJContext condJ() {
			return getRuleContext(CondJContext.class,0);
		}
		public ReturnJContext returnJ() {
			return getRuleContext(ReturnJContext.class,0);
		}
		public RewriteXqContext(OxqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRewriteXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OxqContext oxq() throws RecognitionException {
		OxqContext _localctx = new OxqContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_oxq);
		try {
			_localctx = new RewriteXqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__22);
			setState(125);
			forJ();
			setState(126);
			match(T__23);
			setState(127);
			condJ(0);
			setState(128);
			match(T__24);
			setState(129);
			returnJ(0);
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

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XIndContext extends XqContext {
		public XqContext left;
		public XqContext right;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XIndContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXInd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XLetContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XLetContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XStateContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public XStateContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XApContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XApContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXAp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XVarContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public XVarContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XNodeContext extends XqContext {
		public Token lt;
		public Token rt;
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(x_path_grammarParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(x_path_grammarParser.Id, i);
		}
		public XNodeContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XJoinContext extends XqContext {
		public XqContext left;
		public XqContext right;
		public ListContext leftlist;
		public ListContext rightlist;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public XJoinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XSlashContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XSlashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XPlainContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XPlainContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXPlain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XStrContext extends XqContext {
		public TerminalNode String_constant() { return getToken(x_path_grammarParser.String_constant, 0); }
		public XStrContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XDeepContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XDeepContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitXDeep(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			switch (_input.LA(1)) {
			case T__32:
				{
				_localctx = new XLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				letClause();
				setState(133);
				xq(2);
				}
				break;
			case T__37:
				{
				_localctx = new XVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				var();
				}
				break;
			case String_constant:
				{
				_localctx = new XStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(String_constant);
				}
				break;
			case T__0:
				{
				_localctx = new XApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				ap();
				}
				break;
			case T__9:
				{
				_localctx = new XPlainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(T__9);
				setState(139);
				xq(0);
				setState(140);
				match(T__10);
				}
				break;
			case T__25:
				{
				_localctx = new XNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(T__25);
				setState(143);
				((XNodeContext)_localctx).lt = match(Id);
				setState(144);
				match(T__26);
				setState(145);
				match(T__27);
				setState(146);
				xq(0);
				setState(147);
				match(T__28);
				setState(148);
				match(T__29);
				setState(149);
				((XNodeContext)_localctx).rt = match(Id);
				setState(150);
				match(T__26);
				}
				break;
			case T__22:
				{
				_localctx = new XStateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				forClause();
				setState(154);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(153);
					letClause();
					}
				}

				setState(157);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(156);
					whereClause();
					}
				}

				setState(159);
				returnClause();
				}
				break;
			case T__30:
				{
				_localctx = new XJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(T__30);
				setState(162);
				match(T__9);
				setState(163);
				((XJoinContext)_localctx).left = xq(0);
				setState(164);
				match(T__13);
				setState(165);
				((XJoinContext)_localctx).right = xq(0);
				setState(166);
				match(T__13);
				setState(167);
				((XJoinContext)_localctx).leftlist = list();
				setState(168);
				match(T__13);
				setState(169);
				((XJoinContext)_localctx).rightlist = list();
				setState(170);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new XIndContext(new XqContext(_parentctx, _parentState));
						((XIndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(174);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(175);
						match(T__13);
						setState(176);
						((XIndContext)_localctx).right = xq(8);
						}
						break;
					case 2:
						{
						_localctx = new XSlashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(177);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(178);
						match(T__3);
						setState(179);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XDeepContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(180);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(181);
						match(T__4);
						setState(182);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__11);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Id) {
				{
				{
				setState(189);
				id();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(190);
					match(T__13);
					setState(191);
					id();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__12);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(x_path_grammarParser.Id, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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

	public static class ForJContext extends ParserRuleContext {
		public ForJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forJ; }
	 
		public ForJContext() { }
		public void copyFrom(ForJContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JforContext extends ForJContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public JforContext(ForJContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitJfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForJContext forJ() throws RecognitionException {
		ForJContext _localctx = new ForJContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forJ);
		int _la;
		try {
			_localctx = new JforContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			var();
			setState(207);
			match(T__31);
			setState(208);
			path();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(209);
				match(T__13);
				setState(210);
				var();
				setState(211);
				match(T__31);
				setState(212);
				path();
				}
				}
				setState(218);
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

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PathSlashContext extends PathContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public PathSlashContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitPathSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathApContext extends PathContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public PathApContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitPathAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_path);
		int _la;
		try {
			setState(224);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new PathApContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				ap();
				}
				break;
			case T__37:
				_localctx = new PathSlashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				var();
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(222);
				rp(0);
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

	public static class CondJContext extends ParserRuleContext {
		public CondJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condJ; }
	 
		public CondJContext() { }
		public void copyFrom(CondJContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JEqContext extends CondJContext {
		public VarContext left;
		public VarContext right;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public JEqContext(CondJContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitJEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JEqSContext extends CondJContext {
		public VarContext lt;
		public Token rt;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode String_constant() { return getToken(x_path_grammarParser.String_constant, 0); }
		public JEqSContext(CondJContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitJEqS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JandContext extends CondJContext {
		public CondJContext left;
		public CondJContext right;
		public List<CondJContext> condJ() {
			return getRuleContexts(CondJContext.class);
		}
		public CondJContext condJ(int i) {
			return getRuleContext(CondJContext.class,i);
		}
		public JandContext(CondJContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitJand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondJContext condJ() throws RecognitionException {
		return condJ(0);
	}

	private CondJContext condJ(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondJContext _localctx = new CondJContext(_ctx, _parentState);
		CondJContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condJ, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new JEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(227);
				((JEqContext)_localctx).left = var();
				setState(228);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(229);
				((JEqContext)_localctx).right = var();
				}
				break;
			case 2:
				{
				_localctx = new JEqSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				((JEqSContext)_localctx).lt = var();
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(233);
				((JEqSContext)_localctx).rt = match(String_constant);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JandContext(new CondJContext(_parentctx, _parentState));
					((JandContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_condJ);
					setState(237);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(238);
					match(T__19);
					setState(239);
					((JandContext)_localctx).right = condJ(2);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ReturnJContext extends ParserRuleContext {
		public Token lt;
		public Token rt;
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ReturnJContext> returnJ() {
			return getRuleContexts(ReturnJContext.class);
		}
		public ReturnJContext returnJ(int i) {
			return getRuleContext(ReturnJContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(x_path_grammarParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(x_path_grammarParser.Id, i);
		}
		public ReturnJContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnJ; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitReturnJ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnJContext returnJ() throws RecognitionException {
		return returnJ(0);
	}

	private ReturnJContext returnJ(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReturnJContext _localctx = new ReturnJContext(_ctx, _parentState);
		ReturnJContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_returnJ, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(246);
				path();
				}
				break;
			case 2:
				{
				setState(247);
				var();
				}
				break;
			case 3:
				{
				setState(248);
				match(T__9);
				setState(249);
				returnJ(0);
				setState(250);
				match(T__10);
				setState(251);
				match(T__13);
				setState(252);
				match(T__9);
				setState(253);
				returnJ(0);
				setState(254);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(256);
				match(T__25);
				setState(257);
				((ReturnJContext)_localctx).lt = match(Id);
				setState(258);
				match(T__26);
				setState(259);
				match(T__27);
				setState(260);
				returnJ(0);
				setState(261);
				match(T__28);
				setState(262);
				match(T__29);
				setState(263);
				((ReturnJContext)_localctx).rt = match(Id);
				setState(264);
				match(T__26);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ReturnJContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_returnJ);
					setState(268);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(269);
					match(T__13);
					setState(270);
					returnJ(3);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 24, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__22);
			setState(277);
			var();
			setState(278);
			match(T__31);
			setState(279);
			xq(0);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(280);
				match(T__13);
				setState(281);
				var();
				setState(282);
				match(T__31);
				setState(283);
				xq(0);
				}
				}
				setState(289);
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
		enterRule(_localctx, 26, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__32);
			setState(291);
			var();
			setState(292);
			match(T__33);
			setState(293);
			xq(0);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(294);
				match(T__13);
				setState(295);
				var();
				setState(296);
				match(T__33);
				setState(297);
				xq(0);
				}
				}
				setState(303);
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
		enterRule(_localctx, 28, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__23);
			setState(305);
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
		enterRule(_localctx, 30, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__24);
			setState(308);
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
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondEqContext extends CondContext {
		public XqContext left;
		public XqContext right;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondEqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCondEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondSomeContext extends CondContext {
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
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondSomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCondSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondIsContext extends CondContext {
		public XqContext left;
		public XqContext right;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCondIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEmpContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public CondEmpContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCondEmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndContext extends CondContext {
		public CondContext left;
		public CondContext right;
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOrContext extends CondContext {
		public CondContext left;
		public CondContext right;
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCondOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondPlainContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondPlainContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCondPlain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondNotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitCondNot(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(311);
				match(T__35);
				setState(312);
				var();
				setState(313);
				match(T__31);
				setState(314);
				xq(0);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(315);
					match(T__13);
					setState(316);
					var();
					setState(317);
					match(T__31);
					setState(318);
					xq(0);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(T__36);
				setState(326);
				cond(5);
				}
				break;
			case 2:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(T__21);
				setState(329);
				cond(1);
				}
				break;
			case 3:
				{
				_localctx = new CondEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				((CondEqContext)_localctx).left = xq(0);
				setState(331);
				match(T__15);
				setState(332);
				((CondEqContext)_localctx).right = xq(0);
				}
				break;
			case 4:
				{
				_localctx = new CondEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				((CondEqContext)_localctx).left = xq(0);
				setState(335);
				match(T__16);
				setState(336);
				((CondEqContext)_localctx).right = xq(0);
				}
				break;
			case 5:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				((CondIsContext)_localctx).left = xq(0);
				setState(339);
				match(T__17);
				setState(340);
				((CondIsContext)_localctx).right = xq(0);
				}
				break;
			case 6:
				{
				_localctx = new CondIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				((CondIsContext)_localctx).left = xq(0);
				setState(343);
				match(T__18);
				setState(344);
				((CondIsContext)_localctx).right = xq(0);
				}
				break;
			case 7:
				{
				_localctx = new CondEmpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				match(T__34);
				setState(347);
				match(T__9);
				setState(348);
				xq(0);
				setState(349);
				match(T__10);
				}
				break;
			case 8:
				{
				_localctx = new CondPlainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				match(T__9);
				setState(352);
				cond(0);
				setState(353);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(363);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(357);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(358);
						match(T__19);
						setState(359);
						((CondAndContext)_localctx).right = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(360);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(361);
						match(T__20);
						setState(362);
						((CondOrContext)_localctx).right = cond(3);
						}
						break;
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 34, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__37);
			setState(369);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 3:
			return f_sempred((FContext)_localctx, predIndex);
		case 5:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 10:
			return condJ_sempred((CondJContext)_localctx, predIndex);
		case 11:
			return returnJ_sempred((ReturnJContext)_localctx, predIndex);
		case 16:
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
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean condJ_sempred(CondJContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean returnJ_sempred(ReturnJContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"E\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4U\n\4"+
		"\f\4\16\4X\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5z\n\5\f\5\16\5}\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u009d\n\7\3\7\5\7\u00a0\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00af\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\b\3\b\3\b\3\b\7\b\u00c3\n\b\f"+
		"\b\16\b\u00c6\13\b\7\b\u00c8\n\b\f\b\16\b\u00cb\13\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d9\n\n\f\n\16\n\u00dc\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00e3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00ee\n\f\3\f\3\f\3\f\7\f\u00f3\n\f\f\f\16\f\u00f6\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u010d\n\r\3\r\3\r\3\r\7\r\u0112\n\r\f\r\16\r\u0115\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0120\n\16\f\16\16\16\u0123"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u012e\n\17\f"+
		"\17\16\17\u0131\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0143\n\22\f\22\16\22\u0146\13\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0166\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u016e\n"+
		"\22\f\22\16\22\u0171\13\22\3\23\3\23\3\23\3\23\2\b\6\b\f\26\30\"\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\6\7\3\2\22\23\u0199"+
		"\2(\3\2\2\2\4\66\3\2\2\2\6D\3\2\2\2\bq\3\2\2\2\n~\3\2\2\2\f\u00ae\3\2"+
		"\2\2\16\u00be\3\2\2\2\20\u00ce\3\2\2\2\22\u00d0\3\2\2\2\24\u00e2\3\2\2"+
		"\2\26\u00ed\3\2\2\2\30\u010c\3\2\2\2\32\u0116\3\2\2\2\34\u0124\3\2\2\2"+
		"\36\u0132\3\2\2\2 \u0135\3\2\2\2\"\u0165\3\2\2\2$\u0172\3\2\2\2&)\5\n"+
		"\6\2\')\5\f\7\2(&\3\2\2\2(\'\3\2\2\2)\3\3\2\2\2*+\7\3\2\2+,\7\4\2\2,-"+
		"\7)\2\2-.\7\5\2\2./\7\6\2\2/\67\5\6\4\2\60\61\7\3\2\2\61\62\7\4\2\2\62"+
		"\63\7)\2\2\63\64\7\5\2\2\64\65\7\7\2\2\65\67\5\6\4\2\66*\3\2\2\2\66\60"+
		"\3\2\2\2\67\5\3\2\2\289\b\4\1\29E\7)\2\2:E\7\b\2\2;E\7\t\2\2<E\7\n\2\2"+
		"=E\7\13\2\2>?\7\f\2\2?@\5\6\4\2@A\7\r\2\2AE\3\2\2\2BC\7\21\2\2CE\7)\2"+
		"\2D8\3\2\2\2D:\3\2\2\2D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2D>\3\2\2\2DB\3\2\2"+
		"\2EV\3\2\2\2FG\f\7\2\2GH\7\6\2\2HU\5\6\4\bIJ\f\6\2\2JK\7\7\2\2KU\5\6\4"+
		"\7LM\f\4\2\2MN\7\20\2\2NU\5\6\4\5OP\f\5\2\2PQ\7\16\2\2QR\5\b\5\2RS\7\17"+
		"\2\2SU\3\2\2\2TF\3\2\2\2TI\3\2\2\2TL\3\2\2\2TO\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2W\7\3\2\2\2XV\3\2\2\2YZ\b\5\1\2Z[\7\30\2\2[r\5\b\5\3\\r"+
		"\5\6\4\2]^\5\6\4\2^_\7\22\2\2_`\5\6\4\2`r\3\2\2\2ab\5\6\4\2bc\7\23\2\2"+
		"cd\5\6\4\2dr\3\2\2\2ef\5\6\4\2fg\7\24\2\2gh\5\6\4\2hr\3\2\2\2ij\5\6\4"+
		"\2jk\7\25\2\2kl\5\6\4\2lr\3\2\2\2mn\7\f\2\2no\5\b\5\2op\7\r\2\2pr\3\2"+
		"\2\2qY\3\2\2\2q\\\3\2\2\2q]\3\2\2\2qa\3\2\2\2qe\3\2\2\2qi\3\2\2\2qm\3"+
		"\2\2\2r{\3\2\2\2st\f\5\2\2tu\7\26\2\2uz\5\b\5\6vw\f\4\2\2wx\7\27\2\2x"+
		"z\5\b\5\5ys\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\t\3\2\2\2"+
		"}{\3\2\2\2~\177\7\31\2\2\177\u0080\5\22\n\2\u0080\u0081\7\32\2\2\u0081"+
		"\u0082\5\26\f\2\u0082\u0083\7\33\2\2\u0083\u0084\5\30\r\2\u0084\13\3\2"+
		"\2\2\u0085\u0086\b\7\1\2\u0086\u0087\5\34\17\2\u0087\u0088\5\f\7\4\u0088"+
		"\u00af\3\2\2\2\u0089\u00af\5$\23\2\u008a\u00af\7*\2\2\u008b\u00af\5\4"+
		"\3\2\u008c\u008d\7\f\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\r\2\2\u008f"+
		"\u00af\3\2\2\2\u0090\u0091\7\34\2\2\u0091\u0092\7)\2\2\u0092\u0093\7\35"+
		"\2\2\u0093\u0094\7\36\2\2\u0094\u0095\5\f\7\2\u0095\u0096\7\37\2\2\u0096"+
		"\u0097\7 \2\2\u0097\u0098\7)\2\2\u0098\u0099\7\35\2\2\u0099\u00af\3\2"+
		"\2\2\u009a\u009c\5\32\16\2\u009b\u009d\5\34\17\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5\36\20\2\u009f\u009e\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5 \21\2\u00a2"+
		"\u00af\3\2\2\2\u00a3\u00a4\7!\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\5\f"+
		"\7\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7\20\2\2\u00a9"+
		"\u00aa\5\16\b\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\5\16\b\2\u00ac\u00ad"+
		"\7\r\2\2\u00ad\u00af\3\2\2\2\u00ae\u0085\3\2\2\2\u00ae\u0089\3\2\2\2\u00ae"+
		"\u008a\3\2\2\2\u00ae\u008b\3\2\2\2\u00ae\u008c\3\2\2\2\u00ae\u0090\3\2"+
		"\2\2\u00ae\u009a\3\2\2\2\u00ae\u00a3\3\2\2\2\u00af\u00bb\3\2\2\2\u00b0"+
		"\u00b1\f\t\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00ba\5\f\7\n\u00b3\u00b4\f"+
		"\b\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00ba\5\6\4\2\u00b6\u00b7\f\7\2\2\u00b7"+
		"\u00b8\7\7\2\2\u00b8\u00ba\5\6\4\2\u00b9\u00b0\3\2\2\2\u00b9\u00b3\3\2"+
		"\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c9\7\16\2"+
		"\2\u00bf\u00c4\5\20\t\2\u00c0\u00c1\7\20\2\2\u00c1\u00c3\5\20\t\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\17\2\2\u00cd\17\3\2\2\2\u00ce\u00cf"+
		"\7)\2\2\u00cf\21\3\2\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d2\7\"\2\2\u00d2"+
		"\u00da\5\24\13\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5\5$\23\2\u00d5\u00d6"+
		"\7\"\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00d9\3\2\2\2\u00d8\u00d3\3\2\2\2"+
		"\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\23"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e3\5\4\3\2\u00de\u00df\5$\23\2\u00df"+
		"\u00e0\t\2\2\2\u00e0\u00e1\5\6\4\2\u00e1\u00e3\3\2\2\2\u00e2\u00dd\3\2"+
		"\2\2\u00e2\u00de\3\2\2\2\u00e3\25\3\2\2\2\u00e4\u00e5\b\f\1\2\u00e5\u00e6"+
		"\5$\23\2\u00e6\u00e7\t\3\2\2\u00e7\u00e8\5$\23\2\u00e8\u00ee\3\2\2\2\u00e9"+
		"\u00ea\5$\23\2\u00ea\u00eb\t\3\2\2\u00eb\u00ec\7*\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\u00f4\3\2\2\2\u00ef"+
		"\u00f0\f\3\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f3\5\26\f\4\u00f2\u00ef\3"+
		"\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\27\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\r\1\2\u00f8\u010d\5\24\13"+
		"\2\u00f9\u010d\5$\23\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\5\30\r\2\u00fc"+
		"\u00fd\7\r\2\2\u00fd\u00fe\7\20\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\5"+
		"\30\r\2\u0100\u0101\7\r\2\2\u0101\u010d\3\2\2\2\u0102\u0103\7\34\2\2\u0103"+
		"\u0104\7)\2\2\u0104\u0105\7\35\2\2\u0105\u0106\7\36\2\2\u0106\u0107\5"+
		"\30\r\2\u0107\u0108\7\37\2\2\u0108\u0109\7 \2\2\u0109\u010a\7)\2\2\u010a"+
		"\u010b\7\35\2\2\u010b\u010d\3\2\2\2\u010c\u00f7\3\2\2\2\u010c\u00f9\3"+
		"\2\2\2\u010c\u00fa\3\2\2\2\u010c\u0102\3\2\2\2\u010d\u0113\3\2\2\2\u010e"+
		"\u010f\f\4\2\2\u010f\u0110\7\20\2\2\u0110\u0112\5\30\r\5\u0111\u010e\3"+
		"\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\31\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\31\2\2\u0117\u0118\5$\23"+
		"\2\u0118\u0119\7\"\2\2\u0119\u0121\5\f\7\2\u011a\u011b\7\20\2\2\u011b"+
		"\u011c\5$\23\2\u011c\u011d\7\"\2\2\u011d\u011e\5\f\7\2\u011e\u0120\3\2"+
		"\2\2\u011f\u011a\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\33\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7#\2\2"+
		"\u0125\u0126\5$\23\2\u0126\u0127\7$\2\2\u0127\u012f\5\f\7\2\u0128\u0129"+
		"\7\20\2\2\u0129\u012a\5$\23\2\u012a\u012b\7$\2\2\u012b\u012c\5\f\7\2\u012c"+
		"\u012e\3\2\2\2\u012d\u0128\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\35\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133"+
		"\7\32\2\2\u0133\u0134\5\"\22\2\u0134\37\3\2\2\2\u0135\u0136\7\33\2\2\u0136"+
		"\u0137\5\f\7\2\u0137!\3\2\2\2\u0138\u0139\b\22\1\2\u0139\u013a\7&\2\2"+
		"\u013a\u013b\5$\23\2\u013b\u013c\7\"\2\2\u013c\u0144\5\f\7\2\u013d\u013e"+
		"\7\20\2\2\u013e\u013f\5$\23\2\u013f\u0140\7\"\2\2\u0140\u0141\5\f\7\2"+
		"\u0141\u0143\3\2\2\2\u0142\u013d\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0148\7\'\2\2\u0148\u0149\5\"\22\7\u0149\u0166\3\2\2\2\u014a\u014b\7"+
		"\30\2\2\u014b\u0166\5\"\22\3\u014c\u014d\5\f\7\2\u014d\u014e\7\22\2\2"+
		"\u014e\u014f\5\f\7\2\u014f\u0166\3\2\2\2\u0150\u0151\5\f\7\2\u0151\u0152"+
		"\7\23\2\2\u0152\u0153\5\f\7\2\u0153\u0166\3\2\2\2\u0154\u0155\5\f\7\2"+
		"\u0155\u0156\7\24\2\2\u0156\u0157\5\f\7\2\u0157\u0166\3\2\2\2\u0158\u0159"+
		"\5\f\7\2\u0159\u015a\7\25\2\2\u015a\u015b\5\f\7\2\u015b\u0166\3\2\2\2"+
		"\u015c\u015d\7%\2\2\u015d\u015e\7\f\2\2\u015e\u015f\5\f\7\2\u015f\u0160"+
		"\7\r\2\2\u0160\u0166\3\2\2\2\u0161\u0162\7\f\2\2\u0162\u0163\5\"\22\2"+
		"\u0163\u0164\7\r\2\2\u0164\u0166\3\2\2\2\u0165\u0138\3\2\2\2\u0165\u014a"+
		"\3\2\2\2\u0165\u014c\3\2\2\2\u0165\u0150\3\2\2\2\u0165\u0154\3\2\2\2\u0165"+
		"\u0158\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u0161\3\2\2\2\u0166\u016f\3\2"+
		"\2\2\u0167\u0168\f\5\2\2\u0168\u0169\7\26\2\2\u0169\u016e\5\"\22\6\u016a"+
		"\u016b\f\4\2\2\u016b\u016c\7\27\2\2\u016c\u016e\5\"\22\5\u016d\u0167\3"+
		"\2\2\2\u016d\u016a\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170#\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7(\2\2\u0173"+
		"\u0174\7)\2\2\u0174%\3\2\2\2\35(\66DTVqy{\u009c\u009f\u00ae\u00b9\u00bb"+
		"\u00c4\u00c9\u00da\u00e2\u00ed\u00f4\u010c\u0113\u0121\u012f\u0144\u0165"+
		"\u016d\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}