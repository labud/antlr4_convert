// Generated from D:/antlr4/ShaderParser/src/HLSL\HLSL.g4 by ANTLR 4.5.1
package HLSL.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HLSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		VERSOIN_PROFILE=25, STRUCT=26, IF=27, ELSE=28, QUESTION=29, FOR=30, DO=31, 
		WHILE=32, CONTINUE=33, BREAK=34, RETURN=35, SWITCH=36, CASE=37, DEFUALT=38, 
		LEFT_PAREN=39, RIGHT_PAREN=40, LEFT_BRACE=41, RIGHT_BRACE=42, LEFT_BRACKET=43, 
		RIGHT_BRACKET=44, DOT=45, COLON=46, SEMICOLON=47, COMMA=48, SHARP=49, 
		DECIMAL=50, OCTAL=51, HEX=52, FLOAT_NUM=53, VECTOR=54, MATRIX=55, FLOAT_OPAQUE=56, 
		INT_OPAQUE=57, U_INT_OPAQUE=58, BASIC_OPAQUE_TYPE=59, INCREAMENT_OP=60, 
		UNARY_OP=61, MULDIV_OP=62, ADDDIV_OP=63, SHIFT_OP=64, COMPARE_OP=65, EQUAL_OP=66, 
		BITWISE_OP=67, LOGIC_OP=68, ASSIGNMENT_OP=69, ARITHMETIC_ASSIGNMENT_OP=70, 
		IDENTIFIER=71, COMMENT=72, WS=73, LINE_COMMENT=74;
	public static final int
		RULE_prog = 0, RULE_preprocessor = 1, RULE_version_pre = 2, RULE_type_qualifier = 3, 
		RULE_layout_qualifier = 4, RULE_layout_qualifier_id = 5, RULE_storage_qualifier = 6, 
		RULE_precision_qualifier = 7, RULE_interpolation_qualifier = 8, RULE_invariant_qualifier = 9, 
		RULE_precise_qualifier = 10, RULE_integer = 11, RULE_float_num = 12, RULE_bool_num = 13, 
		RULE_type_specifier = 14, RULE_type_specifier_nonarray = 15, RULE_array_specifier = 16, 
		RULE_basic_type = 17, RULE_void_type = 18, RULE_scala_type = 19, RULE_vector_type = 20, 
		RULE_matrix_type = 21, RULE_opaque_type = 22, RULE_float_opaque_type = 23, 
		RULE_int_opaque_type = 24, RULE_u_int_opaque_type = 25, RULE_expression = 26, 
		RULE_primary_expression = 27, RULE_constant_expression = 28, RULE_array_expressoin = 29, 
		RULE_struct_expression = 30, RULE_assignment_expression = 31, RULE_arithmetic_assignment_expression = 32, 
		RULE_function_definition = 33, RULE_function_declaration = 34, RULE_function_call = 35, 
		RULE_return_Type = 36, RULE_function_name = 37, RULE_func_decl_member = 38, 
		RULE_statement_list = 39, RULE_statement = 40, RULE_simple_statement = 41, 
		RULE_compoud_statement = 42, RULE_basic_statement = 43, RULE_declaration_statement = 44, 
		RULE_simple_declaration = 45, RULE_simple_declarator = 46, RULE_struct_declaration = 47, 
		RULE_function_definition_statement = 48, RULE_assignment_statement = 49, 
		RULE_expression_statement = 50, RULE_selection_statement = 51, RULE_selection_rest_statement = 52, 
		RULE_switch_statement = 53, RULE_case_label = 54, RULE_iteration_statement = 55, 
		RULE_for_init_statement = 56, RULE_for_cond_statement = 57, RULE_for_rest_statement = 58, 
		RULE_jump_statement = 59;
	public static final String[] ruleNames = {
		"prog", "preprocessor", "version_pre", "type_qualifier", "layout_qualifier", 
		"layout_qualifier_id", "storage_qualifier", "precision_qualifier", "interpolation_qualifier", 
		"invariant_qualifier", "precise_qualifier", "integer", "float_num", "bool_num", 
		"type_specifier", "type_specifier_nonarray", "array_specifier", "basic_type", 
		"void_type", "scala_type", "vector_type", "matrix_type", "opaque_type", 
		"float_opaque_type", "int_opaque_type", "u_int_opaque_type", "expression", 
		"primary_expression", "constant_expression", "array_expressoin", "struct_expression", 
		"assignment_expression", "arithmetic_assignment_expression", "function_definition", 
		"function_declaration", "function_call", "return_Type", "function_name", 
		"func_decl_member", "statement_list", "statement", "simple_statement", 
		"compoud_statement", "basic_statement", "declaration_statement", "simple_declaration", 
		"simple_declarator", "struct_declaration", "function_definition_statement", 
		"assignment_statement", "expression_statement", "selection_statement", 
		"selection_rest_statement", "switch_statement", "case_label", "iteration_statement", 
		"for_init_statement", "for_cond_statement", "for_rest_statement", "jump_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'layout ('", "'shared'", "'const'", "'in'", "'out'", 
		"'uniform'", "'buffer'", "'high_precision'", "'medium_precision'", "'low_precision'", 
		"'smooth'", "'flat'", "'noperspective'", "'invariant'", "'precise'", "'true'", 
		"'false'", "'void'", "'bool'", "'int'", "'uint'", "'float'", "'double'", 
		null, "'struct'", "'if'", "'else'", "'?'", "'for'", "'do'", "'while'", 
		"'continue'", "'break'", "'return'", "'switch'", "'case'", "'defualt'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "':'", "';'", "','", 
		"'#'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "VERSOIN_PROFILE", "STRUCT", "IF", "ELSE", "QUESTION", "FOR", "DO", 
		"WHILE", "CONTINUE", "BREAK", "RETURN", "SWITCH", "CASE", "DEFUALT", "LEFT_PAREN", 
		"RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"DOT", "COLON", "SEMICOLON", "COMMA", "SHARP", "DECIMAL", "OCTAL", "HEX", 
		"FLOAT_NUM", "VECTOR", "MATRIX", "FLOAT_OPAQUE", "INT_OPAQUE", "U_INT_OPAQUE", 
		"BASIC_OPAQUE_TYPE", "INCREAMENT_OP", "UNARY_OP", "MULDIV_OP", "ADDDIV_OP", 
		"SHIFT_OP", "COMPARE_OP", "EQUAL_OP", "BITWISE_OP", "LOGIC_OP", "ASSIGNMENT_OP", 
		"ARITHMETIC_ASSIGNMENT_OP", "IDENTIFIER", "COMMENT", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "HLSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HLSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<PreprocessorContext> preprocessor() {
			return getRuleContexts(PreprocessorContext.class);
		}
		public PreprocessorContext preprocessor(int i) {
			return getRuleContext(PreprocessorContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHARP) {
				{
				{
				setState(120);
				preprocessor();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			statement_list();
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

	public static class PreprocessorContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(HLSLParser.SHARP, 0); }
		public Version_preContext version_pre() {
			return getRuleContext(Version_preContext.class,0);
		}
		public PreprocessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterPreprocessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitPreprocessor(this);
		}
	}

	public final PreprocessorContext preprocessor() throws RecognitionException {
		PreprocessorContext _localctx = new PreprocessorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preprocessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(SHARP);
			setState(129);
			version_pre();
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

	public static class Version_preContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode VERSOIN_PROFILE() { return getToken(HLSLParser.VERSOIN_PROFILE, 0); }
		public Version_preContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterVersion_pre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitVersion_pre(this);
		}
	}

	public final Version_preContext version_pre() throws RecognitionException {
		Version_preContext _localctx = new Version_preContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_version_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__0);
			setState(132);
			integer();
			setState(134);
			_la = _input.LA(1);
			if (_la==VERSOIN_PROFILE) {
				{
				setState(133);
				match(VERSOIN_PROFILE);
				}
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

	public static class Type_qualifierContext extends ParserRuleContext {
		public List<Storage_qualifierContext> storage_qualifier() {
			return getRuleContexts(Storage_qualifierContext.class);
		}
		public Storage_qualifierContext storage_qualifier(int i) {
			return getRuleContext(Storage_qualifierContext.class,i);
		}
		public List<Layout_qualifierContext> layout_qualifier() {
			return getRuleContexts(Layout_qualifierContext.class);
		}
		public Layout_qualifierContext layout_qualifier(int i) {
			return getRuleContext(Layout_qualifierContext.class,i);
		}
		public List<Precision_qualifierContext> precision_qualifier() {
			return getRuleContexts(Precision_qualifierContext.class);
		}
		public Precision_qualifierContext precision_qualifier(int i) {
			return getRuleContext(Precision_qualifierContext.class,i);
		}
		public List<Interpolation_qualifierContext> interpolation_qualifier() {
			return getRuleContexts(Interpolation_qualifierContext.class);
		}
		public Interpolation_qualifierContext interpolation_qualifier(int i) {
			return getRuleContext(Interpolation_qualifierContext.class,i);
		}
		public List<Invariant_qualifierContext> invariant_qualifier() {
			return getRuleContexts(Invariant_qualifierContext.class);
		}
		public Invariant_qualifierContext invariant_qualifier(int i) {
			return getRuleContext(Invariant_qualifierContext.class,i);
		}
		public List<Precise_qualifierContext> precise_qualifier() {
			return getRuleContexts(Precise_qualifierContext.class);
		}
		public Precise_qualifierContext precise_qualifier(int i) {
			return getRuleContext(Precise_qualifierContext.class,i);
		}
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(142);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
					{
					setState(136);
					storage_qualifier();
					}
					break;
				case T__1:
					{
					setState(137);
					layout_qualifier();
					}
					break;
				case T__8:
				case T__9:
				case T__10:
					{
					setState(138);
					precision_qualifier();
					}
					break;
				case T__11:
				case T__12:
				case T__13:
					{
					setState(139);
					interpolation_qualifier();
					}
					break;
				case T__14:
					{
					setState(140);
					invariant_qualifier();
					}
					break;
				case T__15:
					{
					setState(141);
					precise_qualifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0) );
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

	public static class Layout_qualifierContext extends ParserRuleContext {
		public List<Layout_qualifier_idContext> layout_qualifier_id() {
			return getRuleContexts(Layout_qualifier_idContext.class);
		}
		public Layout_qualifier_idContext layout_qualifier_id(int i) {
			return getRuleContext(Layout_qualifier_idContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HLSLParser.COMMA, i);
		}
		public Layout_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterLayout_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitLayout_qualifier(this);
		}
	}

	public final Layout_qualifierContext layout_qualifier() throws RecognitionException {
		Layout_qualifierContext _localctx = new Layout_qualifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_layout_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__1);
			setState(147);
			layout_qualifier_id();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(148);
				match(COMMA);
				setState(149);
				layout_qualifier_id();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(RIGHT_PAREN);
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

	public static class Layout_qualifier_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Layout_qualifier_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterLayout_qualifier_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitLayout_qualifier_id(this);
		}
	}

	public final Layout_qualifier_idContext layout_qualifier_id() throws RecognitionException {
		Layout_qualifier_idContext _localctx = new Layout_qualifier_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_layout_qualifier_id);
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(ASSIGNMENT_OP);
				setState(160);
				constant_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
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

	public static class Storage_qualifierContext extends ParserRuleContext {
		public Storage_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterStorage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitStorage_qualifier(this);
		}
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Precision_qualifierContext extends ParserRuleContext {
		public Precision_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterPrecision_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitPrecision_qualifier(this);
		}
	}

	public final Precision_qualifierContext precision_qualifier() throws RecognitionException {
		Precision_qualifierContext _localctx = new Precision_qualifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_precision_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Interpolation_qualifierContext extends ParserRuleContext {
		public Interpolation_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterInterpolation_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitInterpolation_qualifier(this);
		}
	}

	public final Interpolation_qualifierContext interpolation_qualifier() throws RecognitionException {
		Interpolation_qualifierContext _localctx = new Interpolation_qualifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interpolation_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Invariant_qualifierContext extends ParserRuleContext {
		public Invariant_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterInvariant_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitInvariant_qualifier(this);
		}
	}

	public final Invariant_qualifierContext invariant_qualifier() throws RecognitionException {
		Invariant_qualifierContext _localctx = new Invariant_qualifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_invariant_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__14);
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

	public static class Precise_qualifierContext extends ParserRuleContext {
		public Precise_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precise_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterPrecise_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitPrecise_qualifier(this);
		}
	}

	public final Precise_qualifierContext precise_qualifier() throws RecognitionException {
		Precise_qualifierContext _localctx = new Precise_qualifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_precise_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__15);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(HLSLParser.DECIMAL, 0); }
		public TerminalNode OCTAL() { return getToken(HLSLParser.OCTAL, 0); }
		public TerminalNode HEX() { return getToken(HLSLParser.HEX, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << OCTAL) | (1L << HEX))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Float_numContext extends ParserRuleContext {
		public TerminalNode FLOAT_NUM() { return getToken(HLSLParser.FLOAT_NUM, 0); }
		public Float_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFloat_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFloat_num(this);
		}
	}

	public final Float_numContext float_num() throws RecognitionException {
		Float_numContext _localctx = new Float_numContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_float_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(FLOAT_NUM);
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

	public static class Bool_numContext extends ParserRuleContext {
		public Bool_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterBool_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitBool_num(this);
		}
	}

	public final Bool_numContext bool_num() throws RecognitionException {
		Bool_numContext _localctx = new Bool_numContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Type_specifier_nonarrayContext type_specifier_nonarray() {
			return getRuleContext(Type_specifier_nonarrayContext.class,0);
		}
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			type_specifier_nonarray();
			setState(182);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(181);
				array_specifier();
				}
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

	public static class Type_specifier_nonarrayContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public Type_specifier_nonarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier_nonarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterType_specifier_nonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitType_specifier_nonarray(this);
		}
	}

	public final Type_specifier_nonarrayContext type_specifier_nonarray() throws RecognitionException {
		Type_specifier_nonarrayContext _localctx = new Type_specifier_nonarrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_specifier_nonarray);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case VECTOR:
			case MATRIX:
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				basic_type();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(IDENTIFIER);
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

	public static class Array_specifierContext extends ParserRuleContext {
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(HLSLParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(HLSLParser.LEFT_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(HLSLParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(HLSLParser.RIGHT_BRACKET, i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterArray_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitArray_specifier(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				match(LEFT_BRACKET);
				setState(190);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM))) != 0)) {
					{
					setState(189);
					constant_expression();
					}
				}

				setState(192);
				match(RIGHT_BRACKET);
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_BRACKET );
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

	public static class Basic_typeContext extends ParserRuleContext {
		public Void_typeContext void_type() {
			return getRuleContext(Void_typeContext.class,0);
		}
		public Scala_typeContext scala_type() {
			return getRuleContext(Scala_typeContext.class,0);
		}
		public Vector_typeContext vector_type() {
			return getRuleContext(Vector_typeContext.class,0);
		}
		public Matrix_typeContext matrix_type() {
			return getRuleContext(Matrix_typeContext.class,0);
		}
		public Opaque_typeContext opaque_type() {
			return getRuleContext(Opaque_typeContext.class,0);
		}
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitBasic_type(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_basic_type);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				void_type();
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				scala_type();
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				vector_type();
				}
				break;
			case MATRIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				matrix_type();
				}
				break;
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				opaque_type();
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

	public static class Void_typeContext extends ParserRuleContext {
		public Void_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterVoid_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitVoid_type(this);
		}
	}

	public final Void_typeContext void_type() throws RecognitionException {
		Void_typeContext _localctx = new Void_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_void_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__18);
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

	public static class Scala_typeContext extends ParserRuleContext {
		public Scala_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterScala_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitScala_type(this);
		}
	}

	public final Scala_typeContext scala_type() throws RecognitionException {
		Scala_typeContext _localctx = new Scala_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scala_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Vector_typeContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(HLSLParser.VECTOR, 0); }
		public Vector_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterVector_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitVector_type(this);
		}
	}

	public final Vector_typeContext vector_type() throws RecognitionException {
		Vector_typeContext _localctx = new Vector_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vector_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(VECTOR);
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

	public static class Matrix_typeContext extends ParserRuleContext {
		public TerminalNode MATRIX() { return getToken(HLSLParser.MATRIX, 0); }
		public Matrix_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterMatrix_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitMatrix_type(this);
		}
	}

	public final Matrix_typeContext matrix_type() throws RecognitionException {
		Matrix_typeContext _localctx = new Matrix_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_matrix_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(MATRIX);
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

	public static class Opaque_typeContext extends ParserRuleContext {
		public Float_opaque_typeContext float_opaque_type() {
			return getRuleContext(Float_opaque_typeContext.class,0);
		}
		public Int_opaque_typeContext int_opaque_type() {
			return getRuleContext(Int_opaque_typeContext.class,0);
		}
		public U_int_opaque_typeContext u_int_opaque_type() {
			return getRuleContext(U_int_opaque_typeContext.class,0);
		}
		public Opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterOpaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitOpaque_type(this);
		}
	}

	public final Opaque_typeContext opaque_type() throws RecognitionException {
		Opaque_typeContext _localctx = new Opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opaque_type);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case FLOAT_OPAQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				float_opaque_type();
				}
				break;
			case INT_OPAQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				int_opaque_type();
				}
				break;
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				u_int_opaque_type();
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

	public static class Float_opaque_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT_OPAQUE() { return getToken(HLSLParser.FLOAT_OPAQUE, 0); }
		public Float_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFloat_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFloat_opaque_type(this);
		}
	}

	public final Float_opaque_typeContext float_opaque_type() throws RecognitionException {
		Float_opaque_typeContext _localctx = new Float_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_float_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(FLOAT_OPAQUE);
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

	public static class Int_opaque_typeContext extends ParserRuleContext {
		public TerminalNode INT_OPAQUE() { return getToken(HLSLParser.INT_OPAQUE, 0); }
		public Int_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterInt_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitInt_opaque_type(this);
		}
	}

	public final Int_opaque_typeContext int_opaque_type() throws RecognitionException {
		Int_opaque_typeContext _localctx = new Int_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_int_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(INT_OPAQUE);
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

	public static class U_int_opaque_typeContext extends ParserRuleContext {
		public TerminalNode U_INT_OPAQUE() { return getToken(HLSLParser.U_INT_OPAQUE, 0); }
		public U_int_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u_int_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterU_int_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitU_int_opaque_type(this);
		}
	}

	public final U_int_opaque_typeContext u_int_opaque_type() throws RecognitionException {
		U_int_opaque_typeContext _localctx = new U_int_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_u_int_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(U_INT_OPAQUE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INCREAMENT_OP() { return getToken(HLSLParser.INCREAMENT_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADDDIV_OP() { return getToken(HLSLParser.ADDDIV_OP, 0); }
		public TerminalNode UNARY_OP() { return getToken(HLSLParser.UNARY_OP, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode MULDIV_OP() { return getToken(HLSLParser.MULDIV_OP, 0); }
		public TerminalNode SHIFT_OP() { return getToken(HLSLParser.SHIFT_OP, 0); }
		public TerminalNode COMPARE_OP() { return getToken(HLSLParser.COMPARE_OP, 0); }
		public TerminalNode EQUAL_OP() { return getToken(HLSLParser.EQUAL_OP, 0); }
		public TerminalNode BITWISE_OP() { return getToken(HLSLParser.BITWISE_OP, 0); }
		public TerminalNode LOGIC_OP() { return getToken(HLSLParser.LOGIC_OP, 0); }
		public TerminalNode QUESTION() { return getToken(HLSLParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(HLSLParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch (_input.LA(1)) {
			case INCREAMENT_OP:
				{
				setState(224);
				match(INCREAMENT_OP);
				setState(225);
				expression(11);
				}
				break;
			case ADDDIV_OP:
				{
				setState(226);
				match(ADDDIV_OP);
				setState(227);
				expression(10);
				}
				break;
			case UNARY_OP:
				{
				setState(228);
				match(UNARY_OP);
				setState(229);
				expression(9);
				}
				break;
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case LEFT_PAREN:
			case DECIMAL:
			case OCTAL:
			case HEX:
			case FLOAT_NUM:
			case VECTOR:
			case MATRIX:
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
			case IDENTIFIER:
				{
				setState(230);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(234);
						match(MULDIV_OP);
						setState(235);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(237);
						match(ADDDIV_OP);
						setState(238);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(240);
						match(SHIFT_OP);
						setState(241);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(243);
						match(COMPARE_OP);
						setState(244);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(246);
						match(EQUAL_OP);
						setState(247);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(249);
						match(BITWISE_OP);
						setState(250);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(252);
						match(LOGIC_OP);
						setState(253);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(255);
						match(QUESTION);
						setState(256);
						expression(0);
						setState(257);
						match(COLON);
						setState(258);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(261);
						match(INCREAMENT_OP);
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(HLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HLSLParser.COMMA, i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Array_expressoinContext array_expressoin() {
			return getRuleContext(Array_expressoinContext.class,0);
		}
		public Struct_expressionContext struct_expression() {
			return getRuleContext(Struct_expressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_expression);
		int _la;
		try {
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				constant_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				basic_type();
				setState(269);
				match(LEFT_PAREN);
				setState(278);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (T__19 - 17)) | (1L << (T__20 - 17)) | (1L << (T__21 - 17)) | (1L << (T__22 - 17)) | (1L << (T__23 - 17)) | (1L << (LEFT_PAREN - 17)) | (1L << (DECIMAL - 17)) | (1L << (OCTAL - 17)) | (1L << (HEX - 17)) | (1L << (FLOAT_NUM - 17)) | (1L << (VECTOR - 17)) | (1L << (MATRIX - 17)) | (1L << (FLOAT_OPAQUE - 17)) | (1L << (INT_OPAQUE - 17)) | (1L << (U_INT_OPAQUE - 17)) | (1L << (INCREAMENT_OP - 17)) | (1L << (UNARY_OP - 17)) | (1L << (ADDDIV_OP - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
					{
					setState(270);
					expression(0);
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(271);
						match(COMMA);
						setState(272);
						expression(0);
						}
						}
						setState(277);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(280);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				array_expressoin();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				struct_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(LEFT_PAREN);
				setState(286);
				expression(0);
				setState(287);
				match(RIGHT_PAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(IDENTIFIER);
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Float_numContext float_num() {
			return getRuleContext(Float_numContext.class,0);
		}
		public Bool_numContext bool_num() {
			return getRuleContext(Bool_numContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constant_expression);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case DECIMAL:
			case OCTAL:
			case HEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				integer();
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				float_num();
				}
				break;
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				bool_num();
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

	public static class Array_expressoinContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(HLSLParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(HLSLParser.LEFT_BRACKET, i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(HLSLParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(HLSLParser.RIGHT_BRACKET, i);
		}
		public Array_expressoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expressoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterArray_expressoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitArray_expressoin(this);
		}
	}

	public final Array_expressoinContext array_expressoin() throws RecognitionException {
		Array_expressoinContext _localctx = new Array_expressoinContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array_expressoin);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(IDENTIFIER);
			setState(302); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(298);
					match(LEFT_BRACKET);
					setState(299);
					integer();
					setState(300);
					match(RIGHT_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(304); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Struct_expressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HLSLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HLSLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HLSLParser.DOT, i);
		}
		public Struct_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterStruct_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitStruct_expression(this);
		}
	}

	public final Struct_expressionContext struct_expression() throws RecognitionException {
		Struct_expressionContext _localctx = new Struct_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_struct_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IDENTIFIER);
			setState(309); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(307);
					match(DOT);
					setState(308);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(311); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT_OP() { return getToken(HLSLParser.ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ASSIGNMENT_OP);
			setState(314);
			expression(0);
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

	public static class Arithmetic_assignment_expressionContext extends ParserRuleContext {
		public TerminalNode ARITHMETIC_ASSIGNMENT_OP() { return getToken(HLSLParser.ARITHMETIC_ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arithmetic_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterArithmetic_assignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitArithmetic_assignment_expression(this);
		}
	}

	public final Arithmetic_assignment_expressionContext arithmetic_assignment_expression() throws RecognitionException {
		Arithmetic_assignment_expressionContext _localctx = new Arithmetic_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arithmetic_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(ARITHMETIC_ASSIGNMENT_OP);
			setState(317);
			expression(0);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Return_TypeContext return_Type() {
			return getRuleContext(Return_TypeContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(HLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(HLSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(HLSLParser.RIGHT_BRACE, 0); }
		public List<Func_decl_memberContext> func_decl_member() {
			return getRuleContexts(Func_decl_memberContext.class);
		}
		public Func_decl_memberContext func_decl_member(int i) {
			return getRuleContext(Func_decl_memberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HLSLParser.COMMA, i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			return_Type();
			setState(320);
			function_name();
			setState(321);
			match(LEFT_PAREN);
			setState(330);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (T__19 - 19)) | (1L << (T__20 - 19)) | (1L << (T__21 - 19)) | (1L << (T__22 - 19)) | (1L << (T__23 - 19)) | (1L << (VECTOR - 19)) | (1L << (MATRIX - 19)) | (1L << (FLOAT_OPAQUE - 19)) | (1L << (INT_OPAQUE - 19)) | (1L << (U_INT_OPAQUE - 19)) | (1L << (IDENTIFIER - 19)))) != 0)) {
				{
				setState(322);
				func_decl_member();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(323);
					match(COMMA);
					setState(324);
					func_decl_member();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(332);
			match(RIGHT_PAREN);
			setState(333);
			match(LEFT_BRACE);
			setState(334);
			statement_list();
			setState(335);
			match(RIGHT_BRACE);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Return_TypeContext return_Type() {
			return getRuleContext(Return_TypeContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(HLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public List<Func_decl_memberContext> func_decl_member() {
			return getRuleContexts(Func_decl_memberContext.class);
		}
		public Func_decl_memberContext func_decl_member(int i) {
			return getRuleContext(Func_decl_memberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HLSLParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			return_Type();
			setState(338);
			function_name();
			setState(339);
			match(LEFT_PAREN);
			setState(348);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (T__19 - 19)) | (1L << (T__20 - 19)) | (1L << (T__21 - 19)) | (1L << (T__22 - 19)) | (1L << (T__23 - 19)) | (1L << (VECTOR - 19)) | (1L << (MATRIX - 19)) | (1L << (FLOAT_OPAQUE - 19)) | (1L << (INT_OPAQUE - 19)) | (1L << (U_INT_OPAQUE - 19)) | (1L << (IDENTIFIER - 19)))) != 0)) {
				{
				setState(340);
				func_decl_member();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(341);
					match(COMMA);
					setState(342);
					func_decl_member();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(350);
			match(RIGHT_PAREN);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(HLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HLSLParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			function_name();
			setState(353);
			match(LEFT_PAREN);
			setState(362);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (T__19 - 17)) | (1L << (T__20 - 17)) | (1L << (T__21 - 17)) | (1L << (T__22 - 17)) | (1L << (T__23 - 17)) | (1L << (LEFT_PAREN - 17)) | (1L << (DECIMAL - 17)) | (1L << (OCTAL - 17)) | (1L << (HEX - 17)) | (1L << (FLOAT_NUM - 17)) | (1L << (VECTOR - 17)) | (1L << (MATRIX - 17)) | (1L << (FLOAT_OPAQUE - 17)) | (1L << (INT_OPAQUE - 17)) | (1L << (U_INT_OPAQUE - 17)) | (1L << (INCREAMENT_OP - 17)) | (1L << (UNARY_OP - 17)) | (1L << (ADDDIV_OP - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
				{
				setState(354);
				expression(0);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(355);
					match(COMMA);
					setState(356);
					expression(0);
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(364);
			match(RIGHT_PAREN);
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

	public static class Return_TypeContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Return_TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterReturn_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitReturn_Type(this);
		}
	}

	public final Return_TypeContext return_Type() throws RecognitionException {
		Return_TypeContext _localctx = new Return_TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			type_specifier();
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(IDENTIFIER);
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

	public static class Func_decl_memberContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public Func_decl_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFunc_decl_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFunc_decl_member(this);
		}
	}

	public final Func_decl_memberContext func_decl_member() throws RecognitionException {
		Func_decl_memberContext _localctx = new Func_decl_memberContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_func_decl_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			type_specifier();
			setState(371);
			match(IDENTIFIER);
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

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << DO) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << SWITCH) | (1L << CASE) | (1L << DEFUALT) | (1L << LEFT_PAREN) | (1L << LEFT_BRACE) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(373);
				statement();
				}
				}
				setState(378);
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

	public static class StatementContext extends ParserRuleContext {
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public Compoud_statementContext compoud_statement() {
			return getRuleContext(Compoud_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		try {
			setState(381);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case STRUCT:
			case IF:
			case FOR:
			case DO:
			case WHILE:
			case CONTINUE:
			case BREAK:
			case RETURN:
			case SWITCH:
			case CASE:
			case DEFUALT:
			case LEFT_PAREN:
			case DECIMAL:
			case OCTAL:
			case HEX:
			case FLOAT_NUM:
			case VECTOR:
			case MATRIX:
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
			case INCREAMENT_OP:
			case UNARY_OP:
			case ADDDIV_OP:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				simple_statement();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				compoud_statement();
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

	public static class Simple_statementContext extends ParserRuleContext {
		public Function_definition_statementContext function_definition_statement() {
			return getRuleContext(Function_definition_statementContext.class,0);
		}
		public Basic_statementContext basic_statement() {
			return getRuleContext(Basic_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HLSLParser.SEMICOLON, 0); }
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitSimple_statement(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_simple_statement);
		try {
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				function_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				basic_statement();
				setState(385);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				switch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				case_label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(390);
				iteration_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(391);
				jump_statement();
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

	public static class Compoud_statementContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(HLSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(HLSLParser.RIGHT_BRACE, 0); }
		public Compoud_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoud_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterCompoud_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitCompoud_statement(this);
		}
	}

	public final Compoud_statementContext compoud_statement() throws RecognitionException {
		Compoud_statementContext _localctx = new Compoud_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compoud_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(LEFT_BRACE);
			setState(395);
			statement_list();
			setState(396);
			match(RIGHT_BRACE);
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

	public static class Basic_statementContext extends ParserRuleContext {
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Basic_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterBasic_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitBasic_statement(this);
		}
	}

	public final Basic_statementContext basic_statement() throws RecognitionException {
		Basic_statementContext _localctx = new Basic_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_basic_statement);
		try {
			setState(401);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				expression_statement();
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declaration_statement);
		try {
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				struct_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				simple_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				function_declaration();
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

	public static class Simple_declarationContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public List<Simple_declaratorContext> simple_declarator() {
			return getRuleContexts(Simple_declaratorContext.class);
		}
		public Simple_declaratorContext simple_declarator(int i) {
			return getRuleContext(Simple_declaratorContext.class,i);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HLSLParser.COMMA, i);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterSimple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitSimple_declaration(this);
		}
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simple_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(408);
				type_qualifier();
				}
			}

			setState(411);
			type_specifier();
			setState(412);
			simple_declarator();
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413);
					match(COMMA);
					setState(414);
					simple_declarator();
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Simple_declaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public Array_specifierContext array_specifier() {
			return getRuleContext(Array_specifierContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterSimple_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitSimple_declarator(this);
		}
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(IDENTIFIER);
			setState(422);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET) {
				{
				setState(421);
				array_specifier();
				}
			}

			setState(425);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(424);
				assignment_expression();
				}
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(HLSLParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(HLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(HLSLParser.RIGHT_BRACE, 0); }
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(HLSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(HLSLParser.SEMICOLON, i);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(427);
				type_qualifier();
				}
			}

			setState(430);
			match(STRUCT);
			setState(431);
			match(IDENTIFIER);
			setState(432);
			match(LEFT_BRACE);
			setState(436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(433);
				simple_declaration();
				setState(434);
				match(SEMICOLON);
				}
				}
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(440);
			match(RIGHT_BRACE);
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

	public static class Function_definition_statementContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Function_definition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFunction_definition_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFunction_definition_statement(this);
		}
	}

	public final Function_definition_statementContext function_definition_statement() throws RecognitionException {
		Function_definition_statementContext _localctx = new Function_definition_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_function_definition_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			function_definition();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Arithmetic_assignment_expressionContext arithmetic_assignment_expression() {
			return getRuleContext(Arithmetic_assignment_expressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(IDENTIFIER);
			setState(447);
			switch (_input.LA(1)) {
			case ASSIGNMENT_OP:
				{
				setState(445);
				assignment_expression();
				}
				break;
			case ARITHMETIC_ASSIGNMENT_OP:
				{
				setState(446);
				arithmetic_assignment_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			expression(0);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HLSLParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(HLSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public Selection_rest_statementContext selection_rest_statement() {
			return getRuleContext(Selection_rest_statementContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(IF);
			setState(452);
			match(LEFT_PAREN);
			setState(453);
			expression(0);
			setState(454);
			match(RIGHT_PAREN);
			setState(455);
			selection_rest_statement();
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

	public static class Selection_rest_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HLSLParser.ELSE, 0); }
		public Selection_rest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_rest_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterSelection_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitSelection_rest_statement(this);
		}
	}

	public final Selection_rest_statementContext selection_rest_statement() throws RecognitionException {
		Selection_rest_statementContext _localctx = new Selection_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selection_rest_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			statement();
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(458);
				match(ELSE);
				setState(459);
				statement();
				}
				break;
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

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(HLSLParser.SWITCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(HLSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(HLSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(HLSLParser.RIGHT_BRACE, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(SWITCH);
			setState(463);
			match(LEFT_PAREN);
			setState(464);
			expression(0);
			setState(465);
			match(RIGHT_PAREN);
			setState(466);
			match(LEFT_BRACE);
			setState(467);
			statement_list();
			setState(468);
			match(RIGHT_BRACE);
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

	public static class Case_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(HLSLParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HLSLParser.COLON, 0); }
		public TerminalNode DEFUALT() { return getToken(HLSLParser.DEFUALT, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitCase_label(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_case_label);
		try {
			setState(476);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(CASE);
				setState(471);
				expression(0);
				setState(472);
				match(COLON);
				}
				break;
			case DEFUALT:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(DEFUALT);
				setState(475);
				match(COLON);
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HLSLParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(HLSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(HLSLParser.DO, 0); }
		public TerminalNode SEMICOLON() { return getToken(HLSLParser.SEMICOLON, 0); }
		public TerminalNode FOR() { return getToken(HLSLParser.FOR, 0); }
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public For_cond_statementContext for_cond_statement() {
			return getRuleContext(For_cond_statementContext.class,0);
		}
		public For_rest_statementContext for_rest_statement() {
			return getRuleContext(For_rest_statementContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_iteration_statement);
		try {
			setState(499);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(WHILE);
				setState(479);
				match(LEFT_PAREN);
				setState(480);
				expression(0);
				setState(481);
				match(RIGHT_PAREN);
				setState(482);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(DO);
				setState(485);
				statement();
				setState(486);
				match(WHILE);
				setState(487);
				match(LEFT_PAREN);
				setState(488);
				expression(0);
				setState(489);
				match(RIGHT_PAREN);
				setState(490);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(FOR);
				setState(493);
				match(LEFT_PAREN);
				setState(494);
				for_init_statement();
				setState(495);
				for_cond_statement();
				setState(496);
				for_rest_statement();
				setState(497);
				match(RIGHT_PAREN);
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

	public static class For_init_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(HLSLParser.SEMICOLON, 0); }
		public List<Basic_statementContext> basic_statement() {
			return getRuleContexts(Basic_statementContext.class);
		}
		public Basic_statementContext basic_statement(int i) {
			return getRuleContext(Basic_statementContext.class,i);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFor_init_statement(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_for_init_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				setState(501);
				basic_statement();
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(502);
					match(COMMA);
					setState(503);
					basic_statement();
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(511);
			match(SEMICOLON);
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

	public static class For_cond_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HLSLParser.SEMICOLON, 0); }
		public For_cond_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cond_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFor_cond_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFor_cond_statement(this);
		}
	}

	public final For_cond_statementContext for_cond_statement() throws RecognitionException {
		For_cond_statementContext _localctx = new For_cond_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_for_cond_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			expression(0);
			setState(514);
			match(SEMICOLON);
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

	public static class For_rest_statementContext extends ParserRuleContext {
		public List<Basic_statementContext> basic_statement() {
			return getRuleContexts(Basic_statementContext.class);
		}
		public Basic_statementContext basic_statement(int i) {
			return getRuleContext(Basic_statementContext.class,i);
		}
		public For_rest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rest_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterFor_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitFor_rest_statement(this);
		}
	}

	public final For_rest_statementContext for_rest_statement() throws RecognitionException {
		For_rest_statementContext _localctx = new For_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_for_rest_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				setState(516);
				basic_statement();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(517);
					match(COMMA);
					setState(518);
					basic_statement();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(HLSLParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(HLSLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(HLSLParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(HLSLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jump_statement);
		try {
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(CONTINUE);
				setState(527);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(BREAK);
				setState(529);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(RETURN);
				setState(531);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				match(RETURN);
				setState(533);
				expression(0);
				setState(534);
				match(SEMICOLON);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u021d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u0089"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0091\n\5\r\5\16\5\u0092\3\6\3\6\3\6"+
		"\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00a5\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\5\20\u00b9\n\20\3\21\3\21\5\21\u00bd\n\21\3\22\3"+
		"\22\5\22\u00c1\n\22\3\22\6\22\u00c4\n\22\r\22\16\22\u00c5\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00cd\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\5\30\u00da\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00ea\n\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0109\n\34\f\34"+
		"\16\34\u010c\13\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0114\n\35\f\35"+
		"\16\35\u0117\13\35\5\35\u0119\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0125\n\35\3\36\3\36\3\36\5\36\u012a\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\6\37\u0131\n\37\r\37\16\37\u0132\3 \3 \3 \6 \u0138"+
		"\n \r \16 \u0139\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u0148\n#\f"+
		"#\16#\u014b\13#\5#\u014d\n#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\7$\u015a"+
		"\n$\f$\16$\u015d\13$\5$\u015f\n$\3$\3$\3%\3%\3%\3%\3%\7%\u0168\n%\f%\16"+
		"%\u016b\13%\5%\u016d\n%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\7)\u0179\n)\f"+
		")\16)\u017c\13)\3*\3*\5*\u0180\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u018b"+
		"\n+\3,\3,\3,\3,\3-\3-\3-\5-\u0194\n-\3.\3.\3.\5.\u0199\n.\3/\5/\u019c"+
		"\n/\3/\3/\3/\3/\7/\u01a2\n/\f/\16/\u01a5\13/\3\60\3\60\5\60\u01a9\n\60"+
		"\3\60\5\60\u01ac\n\60\3\61\5\61\u01af\n\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\6\61\u01b7\n\61\r\61\16\61\u01b8\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\5\63\u01c2\n\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\5\66\u01cf\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\58\u01df\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\59\u01f6\n9\3:\3:\3:\7:\u01fb\n:\f:\16:\u01fe\13:\5:\u0200"+
		"\n:\3:\3:\3;\3;\3;\3<\3<\3<\7<\u020a\n<\f<\16<\u020d\13<\5<\u020f\n<\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u021b\n=\3=\2\3\66>\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvx\2\b\3\2\5\n\3\2\13\r\3\2\16\20\3\2\64\66\3\2\23\24\3\2\26\32\u0231"+
		"\2}\3\2\2\2\4\u0082\3\2\2\2\6\u0085\3\2\2\2\b\u0090\3\2\2\2\n\u0094\3"+
		"\2\2\2\f\u00a4\3\2\2\2\16\u00a6\3\2\2\2\20\u00a8\3\2\2\2\22\u00aa\3\2"+
		"\2\2\24\u00ac\3\2\2\2\26\u00ae\3\2\2\2\30\u00b0\3\2\2\2\32\u00b2\3\2\2"+
		"\2\34\u00b4\3\2\2\2\36\u00b6\3\2\2\2 \u00bc\3\2\2\2\"\u00c3\3\2\2\2$\u00cc"+
		"\3\2\2\2&\u00ce\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00d4\3\2\2\2."+
		"\u00d9\3\2\2\2\60\u00db\3\2\2\2\62\u00dd\3\2\2\2\64\u00df\3\2\2\2\66\u00e9"+
		"\3\2\2\28\u0124\3\2\2\2:\u0129\3\2\2\2<\u012b\3\2\2\2>\u0134\3\2\2\2@"+
		"\u013b\3\2\2\2B\u013e\3\2\2\2D\u0141\3\2\2\2F\u0153\3\2\2\2H\u0162\3\2"+
		"\2\2J\u0170\3\2\2\2L\u0172\3\2\2\2N\u0174\3\2\2\2P\u017a\3\2\2\2R\u017f"+
		"\3\2\2\2T\u018a\3\2\2\2V\u018c\3\2\2\2X\u0193\3\2\2\2Z\u0198\3\2\2\2\\"+
		"\u019b\3\2\2\2^\u01a6\3\2\2\2`\u01ae\3\2\2\2b\u01bc\3\2\2\2d\u01be\3\2"+
		"\2\2f\u01c3\3\2\2\2h\u01c5\3\2\2\2j\u01cb\3\2\2\2l\u01d0\3\2\2\2n\u01de"+
		"\3\2\2\2p\u01f5\3\2\2\2r\u01ff\3\2\2\2t\u0203\3\2\2\2v\u020e\3\2\2\2x"+
		"\u021a\3\2\2\2z|\5\4\3\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\5P)\2\u0081\3\3\2\2\2\u0082\u0083\7"+
		"\63\2\2\u0083\u0084\5\6\4\2\u0084\5\3\2\2\2\u0085\u0086\7\3\2\2\u0086"+
		"\u0088\5\30\r\2\u0087\u0089\7\33\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\7\3\2\2\2\u008a\u0091\5\16\b\2\u008b\u0091\5\n\6\2\u008c"+
		"\u0091\5\20\t\2\u008d\u0091\5\22\n\2\u008e\u0091\5\24\13\2\u008f\u0091"+
		"\5\26\f\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2"+
		"\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\t\3\2\2\2\u0094"+
		"\u0095\7\4\2\2\u0095\u009a\5\f\7\2\u0096\u0097\7\62\2\2\u0097\u0099\5"+
		"\f\7\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7*"+
		"\2\2\u009e\13\3\2\2\2\u009f\u00a5\7I\2\2\u00a0\u00a1\7I\2\2\u00a1\u00a2"+
		"\7G\2\2\u00a2\u00a5\5:\36\2\u00a3\u00a5\7\5\2\2\u00a4\u009f\3\2\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\t\2\2\2"+
		"\u00a7\17\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\t\4"+
		"\2\2\u00ab\23\3\2\2\2\u00ac\u00ad\7\21\2\2\u00ad\25\3\2\2\2\u00ae\u00af"+
		"\7\22\2\2\u00af\27\3\2\2\2\u00b0\u00b1\t\5\2\2\u00b1\31\3\2\2\2\u00b2"+
		"\u00b3\7\67\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\t\6\2\2\u00b5\35\3\2\2\2"+
		"\u00b6\u00b8\5 \21\2\u00b7\u00b9\5\"\22\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\37\3\2\2\2\u00ba\u00bd\5$\23\2\u00bb\u00bd\7I\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd!\3\2\2\2\u00be\u00c0\7-\2\2\u00bf"+
		"\u00c1\5:\36\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\7.\2\2\u00c3\u00be\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00cd\5&\24\2"+
		"\u00c8\u00cd\5(\25\2\u00c9\u00cd\5*\26\2\u00ca\u00cd\5,\27\2\u00cb\u00cd"+
		"\5.\30\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cf\7\25\2\2"+
		"\u00cf\'\3\2\2\2\u00d0\u00d1\t\7\2\2\u00d1)\3\2\2\2\u00d2\u00d3\78\2\2"+
		"\u00d3+\3\2\2\2\u00d4\u00d5\79\2\2\u00d5-\3\2\2\2\u00d6\u00da\5\60\31"+
		"\2\u00d7\u00da\5\62\32\2\u00d8\u00da\5\64\33\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da/\3\2\2\2\u00db\u00dc\7:\2\2\u00dc"+
		"\61\3\2\2\2\u00dd\u00de\7;\2\2\u00de\63\3\2\2\2\u00df\u00e0\7<\2\2\u00e0"+
		"\65\3\2\2\2\u00e1\u00e2\b\34\1\2\u00e2\u00e3\7>\2\2\u00e3\u00ea\5\66\34"+
		"\r\u00e4\u00e5\7A\2\2\u00e5\u00ea\5\66\34\f\u00e6\u00e7\7?\2\2\u00e7\u00ea"+
		"\5\66\34\13\u00e8\u00ea\58\35\2\u00e9\u00e1\3\2\2\2\u00e9\u00e4\3\2\2"+
		"\2\u00e9\u00e6\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u010a\3\2\2\2\u00eb\u00ec"+
		"\f\n\2\2\u00ec\u00ed\7@\2\2\u00ed\u0109\5\66\34\13\u00ee\u00ef\f\t\2\2"+
		"\u00ef\u00f0\7A\2\2\u00f0\u0109\5\66\34\n\u00f1\u00f2\f\b\2\2\u00f2\u00f3"+
		"\7B\2\2\u00f3\u0109\5\66\34\t\u00f4\u00f5\f\7\2\2\u00f5\u00f6\7C\2\2\u00f6"+
		"\u0109\5\66\34\b\u00f7\u00f8\f\6\2\2\u00f8\u00f9\7D\2\2\u00f9\u0109\5"+
		"\66\34\7\u00fa\u00fb\f\5\2\2\u00fb\u00fc\7E\2\2\u00fc\u0109\5\66\34\6"+
		"\u00fd\u00fe\f\4\2\2\u00fe\u00ff\7F\2\2\u00ff\u0109\5\66\34\5\u0100\u0101"+
		"\f\3\2\2\u0101\u0102\7\37\2\2\u0102\u0103\5\66\34\2\u0103\u0104\7\60\2"+
		"\2\u0104\u0105\5\66\34\4\u0105\u0109\3\2\2\2\u0106\u0107\f\16\2\2\u0107"+
		"\u0109\7>\2\2\u0108\u00eb\3\2\2\2\u0108\u00ee\3\2\2\2\u0108\u00f1\3\2"+
		"\2\2\u0108\u00f4\3\2\2\2\u0108\u00f7\3\2\2\2\u0108\u00fa\3\2\2\2\u0108"+
		"\u00fd\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\67\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010d\u0125\5:\36\2\u010e\u010f\5$\23\2\u010f\u0118\7)\2\2\u0110"+
		"\u0115\5\66\34\2\u0111\u0112\7\62\2\2\u0112\u0114\5\66\34\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0110\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7*\2\2\u011b\u0125\3\2\2\2\u011c"+
		"\u0125\5H%\2\u011d\u0125\5<\37\2\u011e\u0125\5> \2\u011f\u0120\7)\2\2"+
		"\u0120\u0121\5\66\34\2\u0121\u0122\7*\2\2\u0122\u0125\3\2\2\2\u0123\u0125"+
		"\7I\2\2\u0124\u010d\3\2\2\2\u0124\u010e\3\2\2\2\u0124\u011c\3\2\2\2\u0124"+
		"\u011d\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0123\3\2"+
		"\2\2\u01259\3\2\2\2\u0126\u012a\5\30\r\2\u0127\u012a\5\32\16\2\u0128\u012a"+
		"\5\34\17\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2"+
		"\u012a;\3\2\2\2\u012b\u0130\7I\2\2\u012c\u012d\7-\2\2\u012d\u012e\5\30"+
		"\r\2\u012e\u012f\7.\2\2\u012f\u0131\3\2\2\2\u0130\u012c\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133=\3\2\2\2"+
		"\u0134\u0137\7I\2\2\u0135\u0136\7/\2\2\u0136\u0138\7I\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"?\3\2\2\2\u013b\u013c\7G\2\2\u013c\u013d\5\66\34\2\u013dA\3\2\2\2\u013e"+
		"\u013f\7H\2\2\u013f\u0140\5\66\34\2\u0140C\3\2\2\2\u0141\u0142\5J&\2\u0142"+
		"\u0143\5L\'\2\u0143\u014c\7)\2\2\u0144\u0149\5N(\2\u0145\u0146\7\62\2"+
		"\2\u0146\u0148\5N(\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u0144\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7*"+
		"\2\2\u014f\u0150\7+\2\2\u0150\u0151\5P)\2\u0151\u0152\7,\2\2\u0152E\3"+
		"\2\2\2\u0153\u0154\5J&\2\u0154\u0155\5L\'\2\u0155\u015e\7)\2\2\u0156\u015b"+
		"\5N(\2\u0157\u0158\7\62\2\2\u0158\u015a\5N(\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u0156\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\7*\2\2\u0161G\3\2\2\2\u0162\u0163\5L\'\2\u0163"+
		"\u016c\7)\2\2\u0164\u0169\5\66\34\2\u0165\u0166\7\62\2\2\u0166\u0168\5"+
		"\66\34\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0164\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7*\2\2\u016f"+
		"I\3\2\2\2\u0170\u0171\5\36\20\2\u0171K\3\2\2\2\u0172\u0173\7I\2\2\u0173"+
		"M\3\2\2\2\u0174\u0175\5\36\20\2\u0175\u0176\7I\2\2\u0176O\3\2\2\2\u0177"+
		"\u0179\5R*\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2"+
		"\2\u017a\u017b\3\2\2\2\u017bQ\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0180"+
		"\5T+\2\u017e\u0180\5V,\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180"+
		"S\3\2\2\2\u0181\u018b\5b\62\2\u0182\u0183\5X-\2\u0183\u0184\7\61\2\2\u0184"+
		"\u018b\3\2\2\2\u0185\u018b\5h\65\2\u0186\u018b\5l\67\2\u0187\u018b\5n"+
		"8\2\u0188\u018b\5p9\2\u0189\u018b\5x=\2\u018a\u0181\3\2\2\2\u018a\u0182"+
		"\3\2\2\2\u018a\u0185\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018bU\3\2\2\2\u018c\u018d\7+\2\2\u018d"+
		"\u018e\5P)\2\u018e\u018f\7,\2\2\u018fW\3\2\2\2\u0190\u0194\5Z.\2\u0191"+
		"\u0194\5d\63\2\u0192\u0194\5f\64\2\u0193\u0190\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0193\u0192\3\2\2\2\u0194Y\3\2\2\2\u0195\u0199\5`\61\2\u0196\u0199"+
		"\5\\/\2\u0197\u0199\5F$\2\u0198\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199[\3\2\2\2\u019a\u019c\5\b\5\2\u019b\u019a\3\2\2\2"+
		"\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5\36\20\2\u019e\u01a3"+
		"\5^\60\2\u019f\u01a0\7\62\2\2\u01a0\u01a2\5^\60\2\u01a1\u019f\3\2\2\2"+
		"\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4]\3"+
		"\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\7I\2\2\u01a7\u01a9\5\"\22\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5@"+
		"!\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac_\3\2\2\2\u01ad\u01af"+
		"\5\b\5\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\7\34\2\2\u01b1\u01b2\7I\2\2\u01b2\u01b6\7+\2\2\u01b3\u01b4\5\\"+
		"/\2\u01b4\u01b5\7\61\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bb\7,\2\2\u01bba\3\2\2\2\u01bc\u01bd\5D#\2\u01bdc\3\2\2"+
		"\2\u01be\u01c1\7I\2\2\u01bf\u01c2\5@!\2\u01c0\u01c2\5B\"\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2e\3\2\2\2\u01c3\u01c4\5\66\34\2\u01c4"+
		"g\3\2\2\2\u01c5\u01c6\7\35\2\2\u01c6\u01c7\7)\2\2\u01c7\u01c8\5\66\34"+
		"\2\u01c8\u01c9\7*\2\2\u01c9\u01ca\5j\66\2\u01cai\3\2\2\2\u01cb\u01ce\5"+
		"R*\2\u01cc\u01cd\7\36\2\2\u01cd\u01cf\5R*\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cfk\3\2\2\2\u01d0\u01d1\7&\2\2\u01d1\u01d2\7)\2\2\u01d2"+
		"\u01d3\5\66\34\2\u01d3\u01d4\7*\2\2\u01d4\u01d5\7+\2\2\u01d5\u01d6\5P"+
		")\2\u01d6\u01d7\7,\2\2\u01d7m\3\2\2\2\u01d8\u01d9\7\'\2\2\u01d9\u01da"+
		"\5\66\34\2\u01da\u01db\7\60\2\2\u01db\u01df\3\2\2\2\u01dc\u01dd\7(\2\2"+
		"\u01dd\u01df\7\60\2\2\u01de\u01d8\3\2\2\2\u01de\u01dc\3\2\2\2\u01dfo\3"+
		"\2\2\2\u01e0\u01e1\7\"\2\2\u01e1\u01e2\7)\2\2\u01e2\u01e3\5\66\34\2\u01e3"+
		"\u01e4\7*\2\2\u01e4\u01e5\5R*\2\u01e5\u01f6\3\2\2\2\u01e6\u01e7\7!\2\2"+
		"\u01e7\u01e8\5R*\2\u01e8\u01e9\7\"\2\2\u01e9\u01ea\7)\2\2\u01ea\u01eb"+
		"\5\66\34\2\u01eb\u01ec\7*\2\2\u01ec\u01ed\7\61\2\2\u01ed\u01f6\3\2\2\2"+
		"\u01ee\u01ef\7 \2\2\u01ef\u01f0\7)\2\2\u01f0\u01f1\5r:\2\u01f1\u01f2\5"+
		"t;\2\u01f2\u01f3\5v<\2\u01f3\u01f4\7*\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01e0"+
		"\3\2\2\2\u01f5\u01e6\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f6q\3\2\2\2\u01f7"+
		"\u01fc\5X-\2\u01f8\u01f9\7\62\2\2\u01f9\u01fb\5X-\2\u01fa\u01f8\3\2\2"+
		"\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0202\7\61\2\2\u0202s\3\2\2\2\u0203\u0204\5\66\34"+
		"\2\u0204\u0205\7\61\2\2\u0205u\3\2\2\2\u0206\u020b\5X-\2\u0207\u0208\7"+
		"\62\2\2\u0208\u020a\5X-\2\u0209\u0207\3\2\2\2\u020a\u020d\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020e\u0206\3\2\2\2\u020e\u020f\3\2\2\2\u020fw\3\2\2\2\u0210\u0211"+
		"\7#\2\2\u0211\u021b\7\61\2\2\u0212\u0213\7$\2\2\u0213\u021b\7\61\2\2\u0214"+
		"\u0215\7%\2\2\u0215\u021b\7\61\2\2\u0216\u0217\7%\2\2\u0217\u0218\5\66"+
		"\34\2\u0218\u0219\7\61\2\2\u0219\u021b\3\2\2\2\u021a\u0210\3\2\2\2\u021a"+
		"\u0212\3\2\2\2\u021a\u0214\3\2\2\2\u021a\u0216\3\2\2\2\u021by\3\2\2\2"+
		"\61}\u0088\u0090\u0092\u009a\u00a4\u00b8\u00bc\u00c0\u00c5\u00cc\u00d9"+
		"\u00e9\u0108\u010a\u0115\u0118\u0124\u0129\u0132\u0139\u0149\u014c\u015b"+
		"\u015e\u0169\u016c\u017a\u017f\u018a\u0193\u0198\u019b\u01a3\u01a8\u01ab"+
		"\u01ae\u01b8\u01c1\u01ce\u01de\u01f5\u01fc\u01ff\u020b\u020e\u021a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}