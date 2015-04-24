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
		T__17=18, T__18=19, T__19=20, Tagname=21, File_name=22, WS=23, File_Name=24;
	public static final int
		RULE_r = 0, RULE_ap = 1, RULE_rp = 2, RULE_f = 3;
	public static final String[] ruleNames = {
		"r", "ap", "rp", "f"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc'", "'('", "')'", "'/'", "'//'", "'*'", "'.'", "'..'", "'text()'", 
		"'['", "']'", "','", "'@'", "'='", "'eq'", "'=='", "'is'", "'and'", "'or'", 
		"'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Tagname", "File_name", 
		"WS", "File_Name"
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
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
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
			setState(10);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				ap();
				}
				break;
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__12:
			case Tagname:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
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

	public static class ApContext extends ParserRuleContext {
		public TerminalNode File_Name() { return getToken(x_path_grammarParser.File_Name, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ap);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(T__0);
				setState(13);
				match(T__1);
				setState(14);
				match(File_Name);
				setState(15);
				match(T__2);
				setState(16);
				match(T__3);
				setState(17);
				rp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(T__0);
				setState(19);
				match(T__1);
				setState(20);
				match(File_Name);
				setState(21);
				match(T__2);
				setState(22);
				match(T__4);
				setState(23);
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
		public TerminalNode Tagname() { return getToken(x_path_grammarParser.Tagname, 0); }
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitRp(this);
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
			setState(38);
			switch (_input.LA(1)) {
			case Tagname:
				{
				setState(27);
				match(Tagname);
				}
				break;
			case T__5:
				{
				setState(28);
				match(T__5);
				}
				break;
			case T__6:
				{
				setState(29);
				match(T__6);
				}
				break;
			case T__7:
				{
				setState(30);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(31);
				match(T__8);
				}
				break;
			case T__1:
				{
				setState(32);
				match(T__1);
				setState(33);
				rp(0);
				setState(34);
				match(T__2);
				}
				break;
			case T__12:
				{
				setState(36);
				match(T__12);
				setState(37);
				match(Tagname);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(54);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(40);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(41);
						match(T__3);
						setState(42);
						rp(6);
						}
						break;
					case 2:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44);
						match(T__4);
						setState(45);
						rp(5);
						}
						break;
					case 3:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(46);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(47);
						match(T__11);
						setState(48);
						rp(3);
						}
						break;
					case 4:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50);
						match(T__9);
						setState(51);
						f(0);
						setState(52);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(58);
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
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof x_path_grammarVisitor ) return ((x_path_grammarVisitor<? extends T>)visitor).visitF(this);
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
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(60);
				match(T__19);
				setState(61);
				f(1);
				}
				break;
			case 2:
				{
				setState(62);
				rp(0);
				}
				break;
			case 3:
				{
				setState(63);
				rp(0);
				setState(64);
				match(T__13);
				setState(65);
				rp(0);
				}
				break;
			case 4:
				{
				setState(67);
				rp(0);
				setState(68);
				match(T__14);
				setState(69);
				rp(0);
				}
				break;
			case 5:
				{
				setState(71);
				rp(0);
				setState(72);
				match(T__15);
				setState(73);
				rp(0);
				}
				break;
			case 6:
				{
				setState(75);
				rp(0);
				setState(76);
				match(T__16);
				setState(77);
				rp(0);
				}
				break;
			case 7:
				{
				setState(79);
				match(T__1);
				setState(80);
				f(0);
				setState(81);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(85);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(86);
						match(T__17);
						setState(87);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(88);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(89);
						match(T__18);
						setState(90);
						f(3);
						}
						break;
					}
					} 
				}
				setState(95);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 3:
			return f_sempred((FContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5V\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3\5\2\4\6\b\6\2\4\6\b\2\2r\2\f"+
		"\3\2\2\2\4\32\3\2\2\2\6(\3\2\2\2\bU\3\2\2\2\n\r\5\4\3\2\13\r\5\6\4\2\f"+
		"\n\3\2\2\2\f\13\3\2\2\2\r\3\3\2\2\2\16\17\7\3\2\2\17\20\7\4\2\2\20\21"+
		"\7\32\2\2\21\22\7\5\2\2\22\23\7\6\2\2\23\33\5\6\4\2\24\25\7\3\2\2\25\26"+
		"\7\4\2\2\26\27\7\32\2\2\27\30\7\5\2\2\30\31\7\7\2\2\31\33\5\6\4\2\32\16"+
		"\3\2\2\2\32\24\3\2\2\2\33\5\3\2\2\2\34\35\b\4\1\2\35)\7\27\2\2\36)\7\b"+
		"\2\2\37)\7\t\2\2 )\7\n\2\2!)\7\13\2\2\"#\7\4\2\2#$\5\6\4\2$%\7\5\2\2%"+
		")\3\2\2\2&\'\7\17\2\2\')\7\27\2\2(\34\3\2\2\2(\36\3\2\2\2(\37\3\2\2\2"+
		"( \3\2\2\2(!\3\2\2\2(\"\3\2\2\2(&\3\2\2\2):\3\2\2\2*+\f\7\2\2+,\7\6\2"+
		"\2,9\5\6\4\b-.\f\6\2\2./\7\7\2\2/9\5\6\4\7\60\61\f\4\2\2\61\62\7\16\2"+
		"\2\629\5\6\4\5\63\64\f\5\2\2\64\65\7\f\2\2\65\66\5\b\5\2\66\67\7\r\2\2"+
		"\679\3\2\2\28*\3\2\2\28-\3\2\2\28\60\3\2\2\28\63\3\2\2\29<\3\2\2\2:8\3"+
		"\2\2\2:;\3\2\2\2;\7\3\2\2\2<:\3\2\2\2=>\b\5\1\2>?\7\26\2\2?V\5\b\5\3@"+
		"V\5\6\4\2AB\5\6\4\2BC\7\20\2\2CD\5\6\4\2DV\3\2\2\2EF\5\6\4\2FG\7\21\2"+
		"\2GH\5\6\4\2HV\3\2\2\2IJ\5\6\4\2JK\7\22\2\2KL\5\6\4\2LV\3\2\2\2MN\5\6"+
		"\4\2NO\7\23\2\2OP\5\6\4\2PV\3\2\2\2QR\7\4\2\2RS\5\b\5\2ST\7\5\2\2TV\3"+
		"\2\2\2U=\3\2\2\2U@\3\2\2\2UA\3\2\2\2UE\3\2\2\2UI\3\2\2\2UM\3\2\2\2UQ\3"+
		"\2\2\2V_\3\2\2\2WX\f\5\2\2XY\7\24\2\2Y^\5\b\5\6Z[\f\4\2\2[\\\7\25\2\2"+
		"\\^\5\b\5\5]W\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\t\3\2\2"+
		"\2a_\3\2\2\2\n\f\32(8:U]_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}