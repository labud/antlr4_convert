// Generated from D:/antlr4/ShaderParser/src/MidSL\MidSL.g4 by ANTLR 4.5.1
package MidSL.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MidSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, VERSOIN_PROFILE=17, 
		SMPBUFFER=18, TXBUFFER=19, STRUCT=20, CBUFFER=21, INBUFFER=22, OUTBUFFER=23, 
		INOUTBUFFER=24, IF=25, ELSE=26, QUESTION=27, FOR=28, DO=29, WHILE=30, 
		CONTINUE=31, BREAK=32, RETURN=33, SWITCH=34, CASE=35, DEFUALT=36, LEFT_PAREN=37, 
		RIGHT_PAREN=38, LEFT_BRACE=39, RIGHT_BRACE=40, LEFT_BRACKET=41, RIGHT_BRACKET=42, 
		DOT=43, COLON=44, SEMICOLON=45, COMMA=46, SHARP=47, FUNC_KEYWORD=48, DECIMAL=49, 
		OCTAL=50, HEX=51, FLOAT_NUM=52, SCALA=53, VECTOR=54, MATRIX=55, INCREAMENT_OP=56, 
		UNARY_OP=57, MULDIV_OP=58, ADDDIV_OP=59, SHIFT_OP=60, COMPARE_OP=61, EQUAL_OP=62, 
		BITWISE_OP=63, LOGIC_OP=64, ASSIGNMENT_OP=65, ARITHMETIC_ASSIGNMENT_OP=66, 
		IDENTIFIER=67, COMMENT=68, WS=69, LINE_COMMENT=70;
	public static final int
		RULE_test = 0, RULE_prog = 1, RULE_preprocessor = 2, RULE_version_pre = 3, 
		RULE_type_qualifier = 4, RULE_storage_qualifier = 5, RULE_type_modifier = 6, 
		RULE_integer = 7, RULE_float_num = 8, RULE_bool_num = 9, RULE_type_specifier = 10, 
		RULE_type_specifier_nonarray = 11, RULE_array_specifier = 12, RULE_struct_specifier = 13, 
		RULE_basic_type = 14, RULE_void_type = 15, RULE_scala_type = 16, RULE_vector_type = 17, 
		RULE_matrix_type = 18, RULE_expression = 19, RULE_primary_expression = 20, 
		RULE_constant_expression = 21, RULE_left_value = 22, RULE_array_struct_selection = 23, 
		RULE_assignment_expression = 24, RULE_arithmetic_assignment_expression = 25, 
		RULE_function_definition = 26, RULE_function_declaration = 27, RULE_function_call = 28, 
		RULE_return_Type = 29, RULE_function_name = 30, RULE_func_decl_member = 31, 
		RULE_statement_list = 32, RULE_statement = 33, RULE_simple_statement = 34, 
		RULE_compoud_statement = 35, RULE_basic_statement = 36, RULE_declaration_statement = 37, 
		RULE_simple_declaration = 38, RULE_simple_declarator = 39, RULE_semantics = 40, 
		RULE_sample_declaration = 41, RULE_texture_declaration = 42, RULE_struct_declaration = 43, 
		RULE_cbuffer_declaration = 44, RULE_inbuffer_declaration = 45, RULE_outbuffer_declaration = 46, 
		RULE_inoutbuffer_declaration = 47, RULE_assignment_statement = 48, RULE_expression_statement = 49, 
		RULE_function_definition_statement = 50, RULE_selection_statement = 51, 
		RULE_selection_rest_statement = 52, RULE_switch_statement = 53, RULE_case_label = 54, 
		RULE_iteration_statement = 55, RULE_for_init_statement = 56, RULE_for_cond_statement = 57, 
		RULE_for_rest_statement = 58, RULE_jump_statement = 59;
	public static final String[] ruleNames = {
		"test", "prog", "preprocessor", "version_pre", "type_qualifier", "storage_qualifier", 
		"type_modifier", "integer", "float_num", "bool_num", "type_specifier", 
		"type_specifier_nonarray", "array_specifier", "struct_specifier", "basic_type", 
		"void_type", "scala_type", "vector_type", "matrix_type", "expression", 
		"primary_expression", "constant_expression", "left_value", "array_struct_selection", 
		"assignment_expression", "arithmetic_assignment_expression", "function_definition", 
		"function_declaration", "function_call", "return_Type", "function_name", 
		"func_decl_member", "statement_list", "statement", "simple_statement", 
		"compoud_statement", "basic_statement", "declaration_statement", "simple_declaration", 
		"simple_declarator", "semantics", "sample_declaration", "texture_declaration", 
		"struct_declaration", "cbuffer_declaration", "inbuffer_declaration", "outbuffer_declaration", 
		"inoutbuffer_declaration", "assignment_statement", "expression_statement", 
		"function_definition_statement", "selection_statement", "selection_rest_statement", 
		"switch_statement", "case_label", "iteration_statement", "for_init_statement", 
		"for_cond_statement", "for_rest_statement", "jump_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'static'", "'uniform'", "'extern'", "'volatile'", 
		"'shared'", "'groupshared'", "'nointerpolation'", "'precise'", "'const'", 
		"'row_major'", "'column_major'", "'true'", "'false'", "'void'", "'|'", 
		null, "'samplebuffer'", "'texturebuffer'", "'struct'", "'cbuffer'", "'inbuffer'", 
		"'outbuffer'", "'inoutbuffer'", "'if'", "'else'", "'?'", "'for'", "'do'", 
		"'while'", "'continue'", "'break'", "'return'", "'switch'", "'case'", 
		"'defualt'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "':'", "';'", 
		"','", "'#'", "'MATMUL'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "VERSOIN_PROFILE", "SMPBUFFER", "TXBUFFER", 
		"STRUCT", "CBUFFER", "INBUFFER", "OUTBUFFER", "INOUTBUFFER", "IF", "ELSE", 
		"QUESTION", "FOR", "DO", "WHILE", "CONTINUE", "BREAK", "RETURN", "SWITCH", 
		"CASE", "DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "DOT", "COLON", "SEMICOLON", "COMMA", 
		"SHARP", "FUNC_KEYWORD", "DECIMAL", "OCTAL", "HEX", "FLOAT_NUM", "SCALA", 
		"VECTOR", "MATRIX", "INCREAMENT_OP", "UNARY_OP", "MULDIV_OP", "ADDDIV_OP", 
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
	public String getGrammarFileName() { return "MidSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MidSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		public List<Sample_declarationContext> sample_declaration() {
			return getRuleContexts(Sample_declarationContext.class);
		}
		public Sample_declarationContext sample_declaration(int i) {
			return getRuleContext(Sample_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MidSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MidSLParser.SEMICOLON, i);
		}
		public List<Texture_declarationContext> texture_declaration() {
			return getRuleContexts(Texture_declarationContext.class);
		}
		public Texture_declarationContext texture_declaration(int i) {
			return getRuleContext(Texture_declarationContext.class,i);
		}
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Cbuffer_declarationContext cbuffer_declaration() {
			return getRuleContext(Cbuffer_declarationContext.class,0);
		}
		public Inbuffer_declarationContext inbuffer_declaration() {
			return getRuleContext(Inbuffer_declarationContext.class,0);
		}
		public Outbuffer_declarationContext outbuffer_declaration() {
			return getRuleContext(Outbuffer_declarationContext.class,0);
		}
		public Inoutbuffer_declarationContext inoutbuffer_declaration() {
			return getRuleContext(Inoutbuffer_declarationContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHARP) {
				{
				{
				setState(122);
				preprocessor();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SMPBUFFER) {
				{
				{
				setState(128);
				sample_declaration();
				setState(129);
				match(SEMICOLON);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TXBUFFER) {
				{
				{
				setState(136);
				texture_declaration();
				setState(137);
				match(SEMICOLON);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					struct_declaration();
					setState(145);
					match(SEMICOLON);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(155);
			_la = _input.LA(1);
			if (_la==CBUFFER) {
				{
				setState(152);
				cbuffer_declaration();
				setState(153);
				match(SEMICOLON);
				}
			}

			setState(160);
			_la = _input.LA(1);
			if (_la==INBUFFER) {
				{
				setState(157);
				inbuffer_declaration();
				setState(158);
				match(SEMICOLON);
				}
			}

			setState(165);
			_la = _input.LA(1);
			if (_la==OUTBUFFER) {
				{
				setState(162);
				outbuffer_declaration();
				setState(163);
				match(SEMICOLON);
				}
			}

			setState(170);
			_la = _input.LA(1);
			if (_la==INOUTBUFFER) {
				{
				setState(167);
				inoutbuffer_declaration();
				setState(168);
				match(SEMICOLON);
				}
			}

			setState(172);
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
		public TerminalNode SHARP() { return getToken(MidSLParser.SHARP, 0); }
		public Version_preContext version_pre() {
			return getRuleContext(Version_preContext.class,0);
		}
		public PreprocessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterPreprocessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitPreprocessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitPreprocessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreprocessorContext preprocessor() throws RecognitionException {
		PreprocessorContext _localctx = new PreprocessorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(SHARP);
			setState(175);
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
		public TerminalNode VERSOIN_PROFILE() { return getToken(MidSLParser.VERSOIN_PROFILE, 0); }
		public Version_preContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterVersion_pre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitVersion_pre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitVersion_pre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Version_preContext version_pre() throws RecognitionException {
		Version_preContext _localctx = new Version_preContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_version_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__0);
			setState(178);
			integer();
			setState(180);
			_la = _input.LA(1);
			if (_la==VERSOIN_PROFILE) {
				{
				setState(179);
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
		public List<Type_modifierContext> type_modifier() {
			return getRuleContexts(Type_modifierContext.class);
		}
		public Type_modifierContext type_modifier(int i) {
			return getRuleContext(Type_modifierContext.class,i);
		}
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitType_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitType_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(184);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
					{
					setState(182);
					storage_qualifier();
					}
					break;
				case T__9:
				case T__10:
				case T__11:
					{
					setState(183);
					type_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) );
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterStorage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitStorage_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitStorage_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class Type_modifierContext extends ParserRuleContext {
		public Type_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterType_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitType_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitType_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_modifierContext type_modifier() throws RecognitionException {
		Type_modifierContext _localctx = new Type_modifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(MidSLParser.DECIMAL, 0); }
		public TerminalNode OCTAL() { return getToken(MidSLParser.OCTAL, 0); }
		public TerminalNode HEX() { return getToken(MidSLParser.HEX, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		public TerminalNode FLOAT_NUM() { return getToken(MidSLParser.FLOAT_NUM, 0); }
		public Float_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFloat_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFloat_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFloat_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_numContext float_num() throws RecognitionException {
		Float_numContext _localctx = new Float_numContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_float_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterBool_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitBool_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitBool_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_numContext bool_num() throws RecognitionException {
		Bool_numContext _localctx = new Bool_numContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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
		public List<Array_specifierContext> array_specifier() {
			return getRuleContexts(Array_specifierContext.class);
		}
		public Array_specifierContext array_specifier(int i) {
			return getRuleContext(Array_specifierContext.class,i);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitType_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_specifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			type_specifier_nonarray();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					array_specifier();
					}
					} 
				}
				setState(204);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifier_nonarrayContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public Type_specifier_nonarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier_nonarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterType_specifier_nonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitType_specifier_nonarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitType_specifier_nonarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifier_nonarrayContext type_specifier_nonarray() throws RecognitionException {
		Type_specifier_nonarrayContext _localctx = new Type_specifier_nonarrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_specifier_nonarray);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case T__14:
			case SCALA:
			case VECTOR:
			case MATRIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				basic_type();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
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
		public TerminalNode LEFT_BRACKET() { return getToken(MidSLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MidSLParser.RIGHT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterArray_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitArray_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitArray_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_specifierContext array_specifier() throws RecognitionException {
		Array_specifierContext _localctx = new Array_specifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LEFT_BRACKET);
			setState(211);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (LEFT_BRACKET - 13)) | (1L << (DOT - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
				{
				setState(210);
				expression(0);
				}
			}

			setState(213);
			match(RIGHT_BRACKET);
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

	public static class Struct_specifierContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MidSLParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<Array_specifierContext> array_specifier() {
			return getRuleContexts(Array_specifierContext.class);
		}
		public Array_specifierContext array_specifier(int i) {
			return getRuleContext(Array_specifierContext.class,i);
		}
		public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterStruct_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitStruct_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitStruct_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_struct_specifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(DOT);
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(216);
				match(IDENTIFIER);
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(217);
						array_specifier();
						}
						} 
					}
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(223);
				function_call();
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
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitBasic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitBasic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_basic_type);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				void_type();
				}
				break;
			case SCALA:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				scala_type();
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				vector_type();
				}
				break;
			case MATRIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				matrix_type();
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterVoid_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitVoid_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitVoid_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void_typeContext void_type() throws RecognitionException {
		Void_typeContext _localctx = new Void_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_void_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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

	public static class Scala_typeContext extends ParserRuleContext {
		public TerminalNode SCALA() { return getToken(MidSLParser.SCALA, 0); }
		public Scala_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterScala_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitScala_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitScala_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scala_typeContext scala_type() throws RecognitionException {
		Scala_typeContext _localctx = new Scala_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scala_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(SCALA);
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
		public TerminalNode VECTOR() { return getToken(MidSLParser.VECTOR, 0); }
		public Vector_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterVector_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitVector_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitVector_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector_typeContext vector_type() throws RecognitionException {
		Vector_typeContext _localctx = new Vector_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_vector_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		public TerminalNode MATRIX() { return getToken(MidSLParser.MATRIX, 0); }
		public Matrix_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterMatrix_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitMatrix_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitMatrix_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_typeContext matrix_type() throws RecognitionException {
		Matrix_typeContext _localctx = new Matrix_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_matrix_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INCREAMENT_OP() { return getToken(MidSLParser.INCREAMENT_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADDDIV_OP() { return getToken(MidSLParser.ADDDIV_OP, 0); }
		public TerminalNode UNARY_OP() { return getToken(MidSLParser.UNARY_OP, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode MULDIV_OP() { return getToken(MidSLParser.MULDIV_OP, 0); }
		public TerminalNode SHIFT_OP() { return getToken(MidSLParser.SHIFT_OP, 0); }
		public TerminalNode COMPARE_OP() { return getToken(MidSLParser.COMPARE_OP, 0); }
		public TerminalNode EQUAL_OP() { return getToken(MidSLParser.EQUAL_OP, 0); }
		public TerminalNode BITWISE_OP() { return getToken(MidSLParser.BITWISE_OP, 0); }
		public TerminalNode LOGIC_OP() { return getToken(MidSLParser.LOGIC_OP, 0); }
		public TerminalNode QUESTION() { return getToken(MidSLParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(MidSLParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			switch (_input.LA(1)) {
			case INCREAMENT_OP:
				{
				setState(241);
				match(INCREAMENT_OP);
				setState(242);
				expression(11);
				}
				break;
			case ADDDIV_OP:
				{
				setState(243);
				match(ADDDIV_OP);
				setState(244);
				expression(10);
				}
				break;
			case UNARY_OP:
				{
				setState(245);
				match(UNARY_OP);
				setState(246);
				expression(9);
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case LEFT_PAREN:
			case LEFT_BRACKET:
			case DOT:
			case FUNC_KEYWORD:
			case DECIMAL:
			case OCTAL:
			case HEX:
			case FLOAT_NUM:
			case SCALA:
			case VECTOR:
			case MATRIX:
			case IDENTIFIER:
				{
				setState(247);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(251);
						match(MULDIV_OP);
						setState(252);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(254);
						match(ADDDIV_OP);
						setState(255);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(257);
						match(SHIFT_OP);
						setState(258);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(260);
						match(COMPARE_OP);
						setState(261);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(263);
						match(EQUAL_OP);
						setState(264);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(266);
						match(BITWISE_OP);
						setState(267);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(269);
						match(LOGIC_OP);
						setState(270);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(272);
						match(QUESTION);
						setState(273);
						expression(0);
						setState(274);
						match(COLON);
						setState(275);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(278);
						match(INCREAMENT_OP);
						}
						break;
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MidSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MidSLParser.COMMA, i);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Left_valueContext left_value() {
			return getRuleContext(Left_valueContext.class,0);
		}
		public Array_struct_selectionContext array_struct_selection() {
			return getRuleContext(Array_struct_selectionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primary_expression);
		int _la;
		try {
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				constant_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				basic_type();
				setState(286);
				match(LEFT_PAREN);
				setState(295);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (LEFT_BRACKET - 13)) | (1L << (DOT - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
					{
					setState(287);
					expression(0);
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(288);
						match(COMMA);
						setState(289);
						expression(0);
						}
						}
						setState(294);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(297);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(LEFT_PAREN);
				setState(300);
				type_specifier();
				setState(301);
				match(RIGHT_PAREN);
				setState(302);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				left_value();
				setState(306);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(305);
					array_struct_selection();
					}
					break;
				}
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constant_expression);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case DECIMAL:
			case OCTAL:
			case HEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				integer();
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				float_num();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
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

	public static class Left_valueContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public Left_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterLeft_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitLeft_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitLeft_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_valueContext left_value() throws RecognitionException {
		Left_valueContext _localctx = new Left_valueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_left_value);
		try {
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(LEFT_PAREN);
				setState(317);
				expression(0);
				setState(318);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
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

	public static class Array_struct_selectionContext extends ParserRuleContext {
		public List<Array_specifierContext> array_specifier() {
			return getRuleContexts(Array_specifierContext.class);
		}
		public Array_specifierContext array_specifier(int i) {
			return getRuleContext(Array_specifierContext.class,i);
		}
		public List<Struct_specifierContext> struct_specifier() {
			return getRuleContexts(Struct_specifierContext.class);
		}
		public Struct_specifierContext struct_specifier(int i) {
			return getRuleContext(Struct_specifierContext.class,i);
		}
		public Array_struct_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_struct_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterArray_struct_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitArray_struct_selection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitArray_struct_selection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_struct_selectionContext array_struct_selection() throws RecognitionException {
		Array_struct_selectionContext _localctx = new Array_struct_selectionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_struct_selection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(325);
					switch (_input.LA(1)) {
					case LEFT_BRACKET:
						{
						setState(323);
						array_specifier();
						}
						break;
					case DOT:
						{
						setState(324);
						struct_specifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode ASSIGNMENT_OP() { return getToken(MidSLParser.ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(ASSIGNMENT_OP);
			setState(330);
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
		public TerminalNode ARITHMETIC_ASSIGNMENT_OP() { return getToken(MidSLParser.ARITHMETIC_ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arithmetic_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterArithmetic_assignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitArithmetic_assignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitArithmetic_assignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_assignment_expressionContext arithmetic_assignment_expression() throws RecognitionException {
		Arithmetic_assignment_expressionContext _localctx = new Arithmetic_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arithmetic_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(ARITHMETIC_ASSIGNMENT_OP);
			setState(333);
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
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MidSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(MidSLParser.RIGHT_BRACE, 0); }
		public List<Func_decl_memberContext> func_decl_member() {
			return getRuleContexts(Func_decl_memberContext.class);
		}
		public Func_decl_memberContext func_decl_member(int i) {
			return getRuleContext(Func_decl_memberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MidSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MidSLParser.COMMA, i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			return_Type();
			setState(336);
			function_name();
			setState(337);
			match(LEFT_PAREN);
			setState(346);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (SCALA - 15)) | (1L << (VECTOR - 15)) | (1L << (MATRIX - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(338);
				func_decl_member();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(339);
					match(COMMA);
					setState(340);
					func_decl_member();
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(348);
			match(RIGHT_PAREN);
			setState(349);
			match(LEFT_BRACE);
			setState(350);
			statement_list();
			setState(351);
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
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public List<Func_decl_memberContext> func_decl_member() {
			return getRuleContexts(Func_decl_memberContext.class);
		}
		public Func_decl_memberContext func_decl_member(int i) {
			return getRuleContext(Func_decl_memberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MidSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MidSLParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			return_Type();
			setState(354);
			function_name();
			setState(355);
			match(LEFT_PAREN);
			setState(364);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (SCALA - 15)) | (1L << (VECTOR - 15)) | (1L << (MATRIX - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(356);
				func_decl_member();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(357);
					match(COMMA);
					setState(358);
					func_decl_member();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(366);
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
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public Array_struct_selectionContext array_struct_selection() {
			return getRuleContext(Array_struct_selectionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MidSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MidSLParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET || _la==DOT) {
				{
				setState(368);
				array_struct_selection();
				}
			}

			setState(371);
			function_name();
			setState(372);
			match(LEFT_PAREN);
			setState(381);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (LEFT_BRACKET - 13)) | (1L << (DOT - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
				{
				setState(373);
				expression(0);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(374);
					match(COMMA);
					setState(375);
					expression(0);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(383);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterReturn_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitReturn_Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitReturn_Type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_TypeContext return_Type() throws RecognitionException {
		Return_TypeContext _localctx = new Return_TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		public TerminalNode FUNC_KEYWORD() { return getToken(MidSLParser.FUNC_KEYWORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !(_la==FUNC_KEYWORD || _la==IDENTIFIER) ) {
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

	public static class Func_decl_memberContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public Func_decl_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFunc_decl_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFunc_decl_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFunc_decl_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_decl_memberContext func_decl_member() throws RecognitionException {
		Func_decl_memberContext _localctx = new Func_decl_memberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_func_decl_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			type_specifier();
			setState(390);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << DO) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << SWITCH) | (1L << CASE) | (1L << DEFUALT) | (1L << LEFT_PAREN) | (1L << LEFT_BRACE) | (1L << LEFT_BRACKET) | (1L << DOT) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(392);
				statement();
				}
				}
				setState(397);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		try {
			setState(400);
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
			case LEFT_BRACKET:
			case DOT:
			case FUNC_KEYWORD:
			case DECIMAL:
			case OCTAL:
			case HEX:
			case FLOAT_NUM:
			case SCALA:
			case VECTOR:
			case MATRIX:
			case INCREAMENT_OP:
			case UNARY_OP:
			case ADDDIV_OP:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				simple_statement();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
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
		public TerminalNode SEMICOLON() { return getToken(MidSLParser.SEMICOLON, 0); }
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_simple_statement);
		try {
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				function_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				basic_statement();
				setState(404);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				switch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(408);
				case_label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				iteration_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(410);
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
		public TerminalNode LEFT_BRACE() { return getToken(MidSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(MidSLParser.RIGHT_BRACE, 0); }
		public Compoud_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoud_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterCompoud_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitCompoud_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitCompoud_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compoud_statementContext compoud_statement() throws RecognitionException {
		Compoud_statementContext _localctx = new Compoud_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_compoud_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(LEFT_BRACE);
			setState(414);
			statement_list();
			setState(415);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterBasic_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitBasic_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitBasic_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_statementContext basic_statement() throws RecognitionException {
		Basic_statementContext _localctx = new Basic_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_basic_statement);
		try {
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitDeclaration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitDeclaration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declaration_statement);
		try {
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				struct_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				simple_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
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
		public List<TerminalNode> COMMA() { return getTokens(MidSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MidSLParser.COMMA, i);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterSimple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitSimple_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitSimple_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_simple_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(427);
				type_qualifier();
				}
			}

			setState(430);
			type_specifier();
			setState(431);
			simple_declarator();
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(432);
					match(COMMA);
					setState(433);
					simple_declarator();
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public Left_valueContext left_value() {
			return getRuleContext(Left_valueContext.class,0);
		}
		public List<Array_specifierContext> array_specifier() {
			return getRuleContexts(Array_specifierContext.class);
		}
		public Array_specifierContext array_specifier(int i) {
			return getRuleContext(Array_specifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(MidSLParser.COLON, 0); }
		public SemanticsContext semantics() {
			return getRuleContext(SemanticsContext.class,0);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterSimple_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitSimple_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitSimple_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			left_value();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(440);
				array_specifier();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(446);
				match(COLON);
				setState(447);
				semantics();
				}
			}

			setState(451);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(450);
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

	public static class SemanticsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public SemanticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semantics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterSemantics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitSemantics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitSemantics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemanticsContext semantics() throws RecognitionException {
		SemanticsContext _localctx = new SemanticsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_semantics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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

	public static class Sample_declarationContext extends ParserRuleContext {
		public TerminalNode SMPBUFFER() { return getToken(MidSLParser.SMPBUFFER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MidSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MidSLParser.IDENTIFIER, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public List<Array_specifierContext> array_specifier() {
			return getRuleContexts(Array_specifierContext.class);
		}
		public Array_specifierContext array_specifier(int i) {
			return getRuleContext(Array_specifierContext.class,i);
		}
		public Sample_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterSample_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitSample_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitSample_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sample_declarationContext sample_declaration() throws RecognitionException {
		Sample_declarationContext _localctx = new Sample_declarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sample_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(SMPBUFFER);
			setState(457);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(456);
				type_qualifier();
				}
			}

			setState(459);
			match(LEFT_PAREN);
			setState(460);
			match(IDENTIFIER);
			setState(461);
			match(T__15);
			setState(462);
			match(IDENTIFIER);
			setState(463);
			match(RIGHT_PAREN);
			setState(464);
			match(IDENTIFIER);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(465);
				array_specifier();
				}
				}
				setState(470);
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

	public static class Texture_declarationContext extends ParserRuleContext {
		public TerminalNode TXBUFFER() { return getToken(MidSLParser.TXBUFFER, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MidSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MidSLParser.IDENTIFIER, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public List<Array_specifierContext> array_specifier() {
			return getRuleContexts(Array_specifierContext.class);
		}
		public Array_specifierContext array_specifier(int i) {
			return getRuleContext(Array_specifierContext.class,i);
		}
		public Texture_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texture_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterTexture_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitTexture_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitTexture_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Texture_declarationContext texture_declaration() throws RecognitionException {
		Texture_declarationContext _localctx = new Texture_declarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_texture_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(TXBUFFER);
			setState(473);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(472);
				type_qualifier();
				}
			}

			setState(475);
			match(LEFT_PAREN);
			setState(476);
			match(IDENTIFIER);
			setState(477);
			match(T__15);
			setState(478);
			match(IDENTIFIER);
			setState(479);
			match(RIGHT_PAREN);
			setState(480);
			match(IDENTIFIER);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(481);
				array_specifier();
				}
				}
				setState(486);
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(MidSLParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MidSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MidSLParser.RIGHT_BRACE, 0); }
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MidSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MidSLParser.SEMICOLON, i);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(STRUCT);
			setState(488);
			match(IDENTIFIER);
			setState(489);
			match(LEFT_BRACE);
			setState(493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(490);
				simple_declaration();
				setState(491);
				match(SEMICOLON);
				}
				}
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX))) != 0) || _la==IDENTIFIER );
			setState(497);
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

	public static class Cbuffer_declarationContext extends ParserRuleContext {
		public TerminalNode CBUFFER() { return getToken(MidSLParser.CBUFFER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MidSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MidSLParser.RIGHT_BRACE, 0); }
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MidSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MidSLParser.SEMICOLON, i);
		}
		public Cbuffer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cbuffer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterCbuffer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitCbuffer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitCbuffer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cbuffer_declarationContext cbuffer_declaration() throws RecognitionException {
		Cbuffer_declarationContext _localctx = new Cbuffer_declarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_cbuffer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(CBUFFER);
			setState(500);
			match(IDENTIFIER);
			setState(501);
			match(LEFT_BRACE);
			setState(505); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				simple_declaration();
				setState(503);
				match(SEMICOLON);
				}
				}
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX))) != 0) || _la==IDENTIFIER );
			setState(509);
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

	public static class Inbuffer_declarationContext extends ParserRuleContext {
		public TerminalNode INBUFFER() { return getToken(MidSLParser.INBUFFER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MidSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MidSLParser.RIGHT_BRACE, 0); }
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MidSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MidSLParser.SEMICOLON, i);
		}
		public Inbuffer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inbuffer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterInbuffer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitInbuffer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitInbuffer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inbuffer_declarationContext inbuffer_declaration() throws RecognitionException {
		Inbuffer_declarationContext _localctx = new Inbuffer_declarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inbuffer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(INBUFFER);
			setState(512);
			match(IDENTIFIER);
			setState(513);
			match(LEFT_BRACE);
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(514);
				simple_declaration();
				setState(515);
				match(SEMICOLON);
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX))) != 0) || _la==IDENTIFIER );
			setState(521);
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

	public static class Outbuffer_declarationContext extends ParserRuleContext {
		public TerminalNode OUTBUFFER() { return getToken(MidSLParser.OUTBUFFER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MidSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MidSLParser.RIGHT_BRACE, 0); }
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MidSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MidSLParser.SEMICOLON, i);
		}
		public Outbuffer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outbuffer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterOutbuffer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitOutbuffer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitOutbuffer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outbuffer_declarationContext outbuffer_declaration() throws RecognitionException {
		Outbuffer_declarationContext _localctx = new Outbuffer_declarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_outbuffer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(OUTBUFFER);
			setState(524);
			match(IDENTIFIER);
			setState(525);
			match(LEFT_BRACE);
			setState(529); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(526);
				simple_declaration();
				setState(527);
				match(SEMICOLON);
				}
				}
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX))) != 0) || _la==IDENTIFIER );
			setState(533);
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

	public static class Inoutbuffer_declarationContext extends ParserRuleContext {
		public TerminalNode INOUTBUFFER() { return getToken(MidSLParser.INOUTBUFFER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MidSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MidSLParser.RIGHT_BRACE, 0); }
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MidSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MidSLParser.SEMICOLON, i);
		}
		public Inoutbuffer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inoutbuffer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterInoutbuffer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitInoutbuffer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitInoutbuffer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inoutbuffer_declarationContext inoutbuffer_declaration() throws RecognitionException {
		Inoutbuffer_declarationContext _localctx = new Inoutbuffer_declarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_inoutbuffer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(INOUTBUFFER);
			setState(536);
			match(IDENTIFIER);
			setState(537);
			match(LEFT_BRACE);
			setState(541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(538);
				simple_declaration();
				setState(539);
				match(SEMICOLON);
				}
				}
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX))) != 0) || _la==IDENTIFIER );
			setState(545);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public Left_valueContext left_value() {
			return getRuleContext(Left_valueContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Arithmetic_assignment_expressionContext arithmetic_assignment_expression() {
			return getRuleContext(Arithmetic_assignment_expressionContext.class,0);
		}
		public Array_struct_selectionContext array_struct_selection() {
			return getRuleContext(Array_struct_selectionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			left_value();
			setState(549);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET || _la==DOT) {
				{
				setState(548);
				array_struct_selection();
				}
			}

			setState(553);
			switch (_input.LA(1)) {
			case ASSIGNMENT_OP:
				{
				setState(551);
				assignment_expression();
				}
				break;
			case ARITHMETIC_ASSIGNMENT_OP:
				{
				setState(552);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFunction_definition_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFunction_definition_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFunction_definition_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_statementContext function_definition_statement() throws RecognitionException {
		Function_definition_statementContext _localctx = new Function_definition_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_function_definition_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MidSLParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public Selection_rest_statementContext selection_rest_statement() {
			return getRuleContext(Selection_rest_statementContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitSelection_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(IF);
			setState(560);
			match(LEFT_PAREN);
			setState(561);
			expression(0);
			setState(562);
			match(RIGHT_PAREN);
			setState(563);
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
		public TerminalNode ELSE() { return getToken(MidSLParser.ELSE, 0); }
		public Selection_rest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_rest_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterSelection_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitSelection_rest_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitSelection_rest_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_rest_statementContext selection_rest_statement() throws RecognitionException {
		Selection_rest_statementContext _localctx = new Selection_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selection_rest_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			statement();
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(566);
				match(ELSE);
				setState(567);
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
		public TerminalNode SWITCH() { return getToken(MidSLParser.SWITCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MidSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(MidSLParser.RIGHT_BRACE, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(SWITCH);
			setState(571);
			match(LEFT_PAREN);
			setState(572);
			expression(0);
			setState(573);
			match(RIGHT_PAREN);
			setState(574);
			match(LEFT_BRACE);
			setState(575);
			statement_list();
			setState(576);
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
		public TerminalNode CASE() { return getToken(MidSLParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MidSLParser.COLON, 0); }
		public TerminalNode DEFUALT() { return getToken(MidSLParser.DEFUALT, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_case_label);
		try {
			setState(584);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(CASE);
				setState(579);
				expression(0);
				setState(580);
				match(COLON);
				}
				break;
			case DEFUALT:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(DEFUALT);
				setState(583);
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
		public TerminalNode WHILE() { return getToken(MidSLParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MidSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MidSLParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(MidSLParser.DO, 0); }
		public TerminalNode SEMICOLON() { return getToken(MidSLParser.SEMICOLON, 0); }
		public TerminalNode FOR() { return getToken(MidSLParser.FOR, 0); }
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitIteration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitIteration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_iteration_statement);
		try {
			setState(607);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(WHILE);
				setState(587);
				match(LEFT_PAREN);
				setState(588);
				expression(0);
				setState(589);
				match(RIGHT_PAREN);
				setState(590);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(DO);
				setState(593);
				statement();
				setState(594);
				match(WHILE);
				setState(595);
				match(LEFT_PAREN);
				setState(596);
				expression(0);
				setState(597);
				match(RIGHT_PAREN);
				setState(598);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				match(FOR);
				setState(601);
				match(LEFT_PAREN);
				setState(602);
				for_init_statement();
				setState(603);
				for_cond_statement();
				setState(604);
				for_rest_statement();
				setState(605);
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
		public TerminalNode SEMICOLON() { return getToken(MidSLParser.SEMICOLON, 0); }
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFor_init_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFor_init_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_for_init_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << DOT) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				setState(609);
				basic_statement();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(610);
					match(COMMA);
					setState(611);
					basic_statement();
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(619);
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
		public TerminalNode SEMICOLON() { return getToken(MidSLParser.SEMICOLON, 0); }
		public For_cond_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cond_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFor_cond_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFor_cond_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFor_cond_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cond_statementContext for_cond_statement() throws RecognitionException {
		For_cond_statementContext _localctx = new For_cond_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_for_cond_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			expression(0);
			setState(622);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFor_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFor_rest_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFor_rest_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rest_statementContext for_rest_statement() throws RecognitionException {
		For_rest_statementContext _localctx = new For_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_for_rest_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << LEFT_BRACKET) | (1L << DOT) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				setState(624);
				basic_statement();
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(625);
					match(COMMA);
					setState(626);
					basic_statement();
					}
					}
					setState(631);
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
		public TerminalNode CONTINUE() { return getToken(MidSLParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MidSLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(MidSLParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(MidSLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitJump_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jump_statement);
		try {
			setState(644);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(CONTINUE);
				setState(635);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(BREAK);
				setState(637);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				match(RETURN);
				setState(639);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				match(RETURN);
				setState(641);
				expression(0);
				setState(642);
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
		case 19:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u0289\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\7\3~\n\3\f\3\16\3\u0081\13\3\3\3\3\3\3\3\7\3\u0086\n\3\f"+
		"\3\16\3\u0089\13\3\3\3\3\3\3\3\7\3\u008e\n\3\f\3\16\3\u0091\13\3\3\3\3"+
		"\3\3\3\7\3\u0096\n\3\f\3\16\3\u0099\13\3\3\3\3\3\3\3\5\3\u009e\n\3\3\3"+
		"\3\3\3\3\5\3\u00a3\n\3\3\3\3\3\3\3\5\3\u00a8\n\3\3\3\3\3\3\3\5\3\u00ad"+
		"\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u00b7\n\5\3\6\3\6\6\6\u00bb\n"+
		"\6\r\6\16\6\u00bc\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\7"+
		"\f\u00cb\n\f\f\f\16\f\u00ce\13\f\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\5\16"+
		"\u00d6\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u00dd\n\17\f\17\16\17\u00e0"+
		"\13\17\3\17\5\17\u00e3\n\17\3\20\3\20\3\20\3\20\5\20\u00e9\n\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u00fb\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u011a\n\25\f\25\16\25\u011d\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0125\n\26\f\26\16\26\u0128\13\26\5\26"+
		"\u012a\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0135\n"+
		"\26\5\26\u0137\n\26\3\27\3\27\3\27\5\27\u013c\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0144\n\30\3\31\3\31\6\31\u0148\n\31\r\31\16\31\u0149"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0158"+
		"\n\34\f\34\16\34\u015b\13\34\5\34\u015d\n\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35"+
		"\5\35\u016f\n\35\3\35\3\35\3\36\5\36\u0174\n\36\3\36\3\36\3\36\3\36\3"+
		"\36\7\36\u017b\n\36\f\36\16\36\u017e\13\36\5\36\u0180\n\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3\"\7\"\u018c\n\"\f\"\16\"\u018f\13\"\3#\3#\5"+
		"#\u0193\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u019e\n$\3%\3%\3%\3%\3&\3&\3"+
		"&\5&\u01a7\n&\3\'\3\'\3\'\5\'\u01ac\n\'\3(\5(\u01af\n(\3(\3(\3(\3(\7("+
		"\u01b5\n(\f(\16(\u01b8\13(\3)\3)\7)\u01bc\n)\f)\16)\u01bf\13)\3)\3)\5"+
		")\u01c3\n)\3)\5)\u01c6\n)\3*\3*\3+\3+\5+\u01cc\n+\3+\3+\3+\3+\3+\3+\3"+
		"+\7+\u01d5\n+\f+\16+\u01d8\13+\3,\3,\5,\u01dc\n,\3,\3,\3,\3,\3,\3,\3,"+
		"\7,\u01e5\n,\f,\16,\u01e8\13,\3-\3-\3-\3-\3-\3-\6-\u01f0\n-\r-\16-\u01f1"+
		"\3-\3-\3.\3.\3.\3.\3.\3.\6.\u01fc\n.\r.\16.\u01fd\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\6/\u0208\n/\r/\16/\u0209\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\6\60"+
		"\u0214\n\60\r\60\16\60\u0215\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\6"+
		"\61\u0220\n\61\r\61\16\61\u0221\3\61\3\61\3\62\3\62\5\62\u0228\n\62\3"+
		"\62\3\62\5\62\u022c\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\5\66\u023b\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\58\u024b\n8\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\59\u0262\n9\3:\3:\3:\7:\u0267\n:\f:\16:\u026a"+
		"\13:\5:\u026c\n:\3:\3:\3;\3;\3;\3<\3<\3<\7<\u0276\n<\f<\16<\u0279\13<"+
		"\5<\u027b\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0287\n=\3=\2\3(>\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvx\2\7\3\2\4\13\3\2\f\16\3\2\63\65\3\2\17\20\4\2\62\62"+
		"EE\u02a5\2z\3\2\2\2\4\177\3\2\2\2\6\u00b0\3\2\2\2\b\u00b3\3\2\2\2\n\u00ba"+
		"\3\2\2\2\f\u00be\3\2\2\2\16\u00c0\3\2\2\2\20\u00c2\3\2\2\2\22\u00c4\3"+
		"\2\2\2\24\u00c6\3\2\2\2\26\u00c8\3\2\2\2\30\u00d1\3\2\2\2\32\u00d3\3\2"+
		"\2\2\34\u00d9\3\2\2\2\36\u00e8\3\2\2\2 \u00ea\3\2\2\2\"\u00ec\3\2\2\2"+
		"$\u00ee\3\2\2\2&\u00f0\3\2\2\2(\u00fa\3\2\2\2*\u0136\3\2\2\2,\u013b\3"+
		"\2\2\2.\u0143\3\2\2\2\60\u0147\3\2\2\2\62\u014b\3\2\2\2\64\u014e\3\2\2"+
		"\2\66\u0151\3\2\2\28\u0163\3\2\2\2:\u0173\3\2\2\2<\u0183\3\2\2\2>\u0185"+
		"\3\2\2\2@\u0187\3\2\2\2B\u018d\3\2\2\2D\u0192\3\2\2\2F\u019d\3\2\2\2H"+
		"\u019f\3\2\2\2J\u01a6\3\2\2\2L\u01ab\3\2\2\2N\u01ae\3\2\2\2P\u01b9\3\2"+
		"\2\2R\u01c7\3\2\2\2T\u01c9\3\2\2\2V\u01d9\3\2\2\2X\u01e9\3\2\2\2Z\u01f5"+
		"\3\2\2\2\\\u0201\3\2\2\2^\u020d\3\2\2\2`\u0219\3\2\2\2b\u0225\3\2\2\2"+
		"d\u022d\3\2\2\2f\u022f\3\2\2\2h\u0231\3\2\2\2j\u0237\3\2\2\2l\u023c\3"+
		"\2\2\2n\u024a\3\2\2\2p\u0261\3\2\2\2r\u026b\3\2\2\2t\u026f\3\2\2\2v\u027a"+
		"\3\2\2\2x\u0286\3\2\2\2z{\7E\2\2{\3\3\2\2\2|~\5\6\4\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0087\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\5T+\2\u0083\u0084\7/\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008f\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5V,\2\u008b\u008c"+
		"\7/\2\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0097\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\5X-\2\u0093\u0094\7/\2\2\u0094\u0096\3\2\2\2\u0095\u0092"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009d\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5Z.\2\u009b\u009c\7/\2"+
		"\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a2"+
		"\3\2\2\2\u009f\u00a0\5\\/\2\u00a0\u00a1\7/\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u009f\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a5\5^"+
		"\60\2\u00a5\u00a6\7/\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00aa\5`\61\2\u00aa\u00ab\7/"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\5B\"\2\u00af\5\3\2\2\2\u00b0\u00b1\7\61\2\2"+
		"\u00b1\u00b2\5\b\5\2\u00b2\7\3\2\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b6\5"+
		"\20\t\2\u00b5\u00b7\7\23\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\t\3\2\2\2\u00b8\u00bb\5\f\7\2\u00b9\u00bb\5\16\b\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\13\3\2\2\2\u00be\u00bf\t\2\2\2\u00bf\r\3\2\2\2\u00c0\u00c1"+
		"\t\3\2\2\u00c1\17\3\2\2\2\u00c2\u00c3\t\4\2\2\u00c3\21\3\2\2\2\u00c4\u00c5"+
		"\7\66\2\2\u00c5\23\3\2\2\2\u00c6\u00c7\t\5\2\2\u00c7\25\3\2\2\2\u00c8"+
		"\u00cc\5\30\r\2\u00c9\u00cb\5\32\16\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\27\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d2\5\36\20\2\u00d0\u00d2\7E\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d5\7+\2\2\u00d4\u00d6"+
		"\5(\25\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\7,\2\2\u00d8\33\3\2\2\2\u00d9\u00e2\7-\2\2\u00da\u00de\7E\2\2\u00db"+
		"\u00dd\5\32\16\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e3\5:\36\2\u00e2\u00da\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\35\3\2\2"+
		"\2\u00e4\u00e9\5 \21\2\u00e5\u00e9\5\"\22\2\u00e6\u00e9\5$\23\2\u00e7"+
		"\u00e9\5&\24\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e7\3\2\2\2\u00e9\37\3\2\2\2\u00ea\u00eb\7\21\2\2\u00eb!"+
		"\3\2\2\2\u00ec\u00ed\7\67\2\2\u00ed#\3\2\2\2\u00ee\u00ef\78\2\2\u00ef"+
		"%\3\2\2\2\u00f0\u00f1\79\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\b\25\1\2\u00f3"+
		"\u00f4\7:\2\2\u00f4\u00fb\5(\25\r\u00f5\u00f6\7=\2\2\u00f6\u00fb\5(\25"+
		"\f\u00f7\u00f8\7;\2\2\u00f8\u00fb\5(\25\13\u00f9\u00fb\5*\26\2\u00fa\u00f2"+
		"\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u011b\3\2\2\2\u00fc\u00fd\f\n\2\2\u00fd\u00fe\7<\2\2\u00fe\u011a\5(\25"+
		"\13\u00ff\u0100\f\t\2\2\u0100\u0101\7=\2\2\u0101\u011a\5(\25\n\u0102\u0103"+
		"\f\b\2\2\u0103\u0104\7>\2\2\u0104\u011a\5(\25\t\u0105\u0106\f\7\2\2\u0106"+
		"\u0107\7?\2\2\u0107\u011a\5(\25\b\u0108\u0109\f\6\2\2\u0109\u010a\7@\2"+
		"\2\u010a\u011a\5(\25\7\u010b\u010c\f\5\2\2\u010c\u010d\7A\2\2\u010d\u011a"+
		"\5(\25\6\u010e\u010f\f\4\2\2\u010f\u0110\7B\2\2\u0110\u011a\5(\25\5\u0111"+
		"\u0112\f\3\2\2\u0112\u0113\7\35\2\2\u0113\u0114\5(\25\2\u0114\u0115\7"+
		".\2\2\u0115\u0116\5(\25\4\u0116\u011a\3\2\2\2\u0117\u0118\f\16\2\2\u0118"+
		"\u011a\7:\2\2\u0119\u00fc\3\2\2\2\u0119\u00ff\3\2\2\2\u0119\u0102\3\2"+
		"\2\2\u0119\u0105\3\2\2\2\u0119\u0108\3\2\2\2\u0119\u010b\3\2\2\2\u0119"+
		"\u010e\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c)\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011e\u0137\5,\27\2\u011f\u0120\5\36\20\2\u0120\u0129\7\'\2\2"+
		"\u0121\u0126\5(\25\2\u0122\u0123\7\60\2\2\u0123\u0125\5(\25\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7(\2\2\u012c\u0137\3\2\2\2\u012d"+
		"\u012e\7\'\2\2\u012e\u012f\5\26\f\2\u012f\u0130\7(\2\2\u0130\u0131\5("+
		"\25\2\u0131\u0137\3\2\2\2\u0132\u0134\5.\30\2\u0133\u0135\5\60\31\2\u0134"+
		"\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u011e\3\2"+
		"\2\2\u0136\u011f\3\2\2\2\u0136\u012d\3\2\2\2\u0136\u0132\3\2\2\2\u0137"+
		"+\3\2\2\2\u0138\u013c\5\20\t\2\u0139\u013c\5\22\n\2\u013a\u013c\5\24\13"+
		"\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c-"+
		"\3\2\2\2\u013d\u0144\5:\36\2\u013e\u013f\7\'\2\2\u013f\u0140\5(\25\2\u0140"+
		"\u0141\7(\2\2\u0141\u0144\3\2\2\2\u0142\u0144\7E\2\2\u0143\u013d\3\2\2"+
		"\2\u0143\u013e\3\2\2\2\u0143\u0142\3\2\2\2\u0144/\3\2\2\2\u0145\u0148"+
		"\5\32\16\2\u0146\u0148\5\34\17\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2"+
		"\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\61"+
		"\3\2\2\2\u014b\u014c\7C\2\2\u014c\u014d\5(\25\2\u014d\63\3\2\2\2\u014e"+
		"\u014f\7D\2\2\u014f\u0150\5(\25\2\u0150\65\3\2\2\2\u0151\u0152\5<\37\2"+
		"\u0152\u0153\5> \2\u0153\u015c\7\'\2\2\u0154\u0159\5@!\2\u0155\u0156\7"+
		"\60\2\2\u0156\u0158\5@!\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u0154\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\7(\2\2\u015f\u0160\7)\2\2\u0160\u0161\5B\"\2\u0161\u0162\7*\2\2"+
		"\u0162\67\3\2\2\2\u0163\u0164\5<\37\2\u0164\u0165\5> \2\u0165\u016e\7"+
		"\'\2\2\u0166\u016b\5@!\2\u0167\u0168\7\60\2\2\u0168\u016a\5@!\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0166\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7(\2\2\u01719\3\2\2\2\u0172"+
		"\u0174\5\60\31\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3"+
		"\2\2\2\u0175\u0176\5> \2\u0176\u017f\7\'\2\2\u0177\u017c\5(\25\2\u0178"+
		"\u0179\7\60\2\2\u0179\u017b\5(\25\2\u017a\u0178\3\2\2\2\u017b\u017e\3"+
		"\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0177\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\7(\2\2\u0182;\3\2\2\2\u0183\u0184\5\26\f\2\u0184=\3\2"+
		"\2\2\u0185\u0186\t\6\2\2\u0186?\3\2\2\2\u0187\u0188\5\26\f\2\u0188\u0189"+
		"\7E\2\2\u0189A\3\2\2\2\u018a\u018c\5D#\2\u018b\u018a\3\2\2\2\u018c\u018f"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018eC\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0193\5F$\2\u0191\u0193\5H%\2\u0192\u0190\3\2\2\2"+
		"\u0192\u0191\3\2\2\2\u0193E\3\2\2\2\u0194\u019e\5f\64\2\u0195\u0196\5"+
		"J&\2\u0196\u0197\7/\2\2\u0197\u019e\3\2\2\2\u0198\u019e\5h\65\2\u0199"+
		"\u019e\5l\67\2\u019a\u019e\5n8\2\u019b\u019e\5p9\2\u019c\u019e\5x=\2\u019d"+
		"\u0194\3\2\2\2\u019d\u0195\3\2\2\2\u019d\u0198\3\2\2\2\u019d\u0199\3\2"+
		"\2\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"G\3\2\2\2\u019f\u01a0\7)\2\2\u01a0\u01a1\5B\"\2\u01a1\u01a2\7*\2\2\u01a2"+
		"I\3\2\2\2\u01a3\u01a7\5L\'\2\u01a4\u01a7\5b\62\2\u01a5\u01a7\5d\63\2\u01a6"+
		"\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7K\3\2\2\2"+
		"\u01a8\u01ac\5X-\2\u01a9\u01ac\5N(\2\u01aa\u01ac\58\35\2\u01ab\u01a8\3"+
		"\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01acM\3\2\2\2\u01ad\u01af"+
		"\5\n\6\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\5\26\f\2\u01b1\u01b6\5P)\2\u01b2\u01b3\7\60\2\2\u01b3\u01b5\5P"+
		")\2\u01b4\u01b2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7O\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bd\5.\30\2"+
		"\u01ba\u01bc\5\32\16\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c2\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0"+
		"\u01c1\7.\2\2\u01c1\u01c3\5R*\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\5\62\32\2\u01c5\u01c4\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6Q\3\2\2\2\u01c7\u01c8\7E\2\2\u01c8S\3\2\2\2\u01c9"+
		"\u01cb\7\24\2\2\u01ca\u01cc\5\n\6\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3"+
		"\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7\'\2\2\u01ce\u01cf\7E\2\2\u01cf"+
		"\u01d0\7\22\2\2\u01d0\u01d1\7E\2\2\u01d1\u01d2\7(\2\2\u01d2\u01d6\7E\2"+
		"\2\u01d3\u01d5\5\32\16\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7U\3\2\2\2\u01d8\u01d6\3\2\2\2"+
		"\u01d9\u01db\7\25\2\2\u01da\u01dc\5\n\6\2\u01db\u01da\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7\'\2\2\u01de\u01df\7E\2\2\u01df"+
		"\u01e0\7\22\2\2\u01e0\u01e1\7E\2\2\u01e1\u01e2\7(\2\2\u01e2\u01e6\7E\2"+
		"\2\u01e3\u01e5\5\32\16\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7W\3\2\2\2\u01e8\u01e6\3\2\2\2"+
		"\u01e9\u01ea\7\26\2\2\u01ea\u01eb\7E\2\2\u01eb\u01ef\7)\2\2\u01ec\u01ed"+
		"\5N(\2\u01ed\u01ee\7/\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ec\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f4\7*\2\2\u01f4Y\3\2\2\2\u01f5\u01f6\7\27\2\2\u01f6\u01f7"+
		"\7E\2\2\u01f7\u01fb\7)\2\2\u01f8\u01f9\5N(\2\u01f9\u01fa\7/\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7*\2\2\u0200"+
		"[\3\2\2\2\u0201\u0202\7\30\2\2\u0202\u0203\7E\2\2\u0203\u0207\7)\2\2\u0204"+
		"\u0205\5N(\2\u0205\u0206\7/\2\2\u0206\u0208\3\2\2\2\u0207\u0204\3\2\2"+
		"\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020b\u020c\7*\2\2\u020c]\3\2\2\2\u020d\u020e\7\31\2\2\u020e"+
		"\u020f\7E\2\2\u020f\u0213\7)\2\2\u0210\u0211\5N(\2\u0211\u0212\7/\2\2"+
		"\u0212\u0214\3\2\2\2\u0213\u0210\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7*\2\2\u0218"+
		"_\3\2\2\2\u0219\u021a\7\32\2\2\u021a\u021b\7E\2\2\u021b\u021f\7)\2\2\u021c"+
		"\u021d\5N(\2\u021d\u021e\7/\2\2\u021e\u0220\3\2\2\2\u021f\u021c\3\2\2"+
		"\2\u0220\u0221\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u0224\7*\2\2\u0224a\3\2\2\2\u0225\u0227\5.\30\2\u0226\u0228"+
		"\5\60\31\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022b\3\2\2\2"+
		"\u0229\u022c\5\62\32\2\u022a\u022c\5\64\33\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022a\3\2\2\2\u022cc\3\2\2\2\u022d\u022e\5(\25\2\u022ee\3\2\2\2\u022f"+
		"\u0230\5\66\34\2\u0230g\3\2\2\2\u0231\u0232\7\33\2\2\u0232\u0233\7\'\2"+
		"\2\u0233\u0234\5(\25\2\u0234\u0235\7(\2\2\u0235\u0236\5j\66\2\u0236i\3"+
		"\2\2\2\u0237\u023a\5D#\2\u0238\u0239\7\34\2\2\u0239\u023b\5D#\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023bk\3\2\2\2\u023c\u023d\7$\2\2\u023d"+
		"\u023e\7\'\2\2\u023e\u023f\5(\25\2\u023f\u0240\7(\2\2\u0240\u0241\7)\2"+
		"\2\u0241\u0242\5B\"\2\u0242\u0243\7*\2\2\u0243m\3\2\2\2\u0244\u0245\7"+
		"%\2\2\u0245\u0246\5(\25\2\u0246\u0247\7.\2\2\u0247\u024b\3\2\2\2\u0248"+
		"\u0249\7&\2\2\u0249\u024b\7.\2\2\u024a\u0244\3\2\2\2\u024a\u0248\3\2\2"+
		"\2\u024bo\3\2\2\2\u024c\u024d\7 \2\2\u024d\u024e\7\'\2\2\u024e\u024f\5"+
		"(\25\2\u024f\u0250\7(\2\2\u0250\u0251\5D#\2\u0251\u0262\3\2\2\2\u0252"+
		"\u0253\7\37\2\2\u0253\u0254\5D#\2\u0254\u0255\7 \2\2\u0255\u0256\7\'\2"+
		"\2\u0256\u0257\5(\25\2\u0257\u0258\7(\2\2\u0258\u0259\7/\2\2\u0259\u0262"+
		"\3\2\2\2\u025a\u025b\7\36\2\2\u025b\u025c\7\'\2\2\u025c\u025d\5r:\2\u025d"+
		"\u025e\5t;\2\u025e\u025f\5v<\2\u025f\u0260\7(\2\2\u0260\u0262\3\2\2\2"+
		"\u0261\u024c\3\2\2\2\u0261\u0252\3\2\2\2\u0261\u025a\3\2\2\2\u0262q\3"+
		"\2\2\2\u0263\u0268\5J&\2\u0264\u0265\7\60\2\2\u0265\u0267\5J&\2\u0266"+
		"\u0264\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u0263\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\7/\2\2\u026es\3\2\2\2\u026f"+
		"\u0270\5(\25\2\u0270\u0271\7/\2\2\u0271u\3\2\2\2\u0272\u0277\5J&\2\u0273"+
		"\u0274\7\60\2\2\u0274\u0276\5J&\2\u0275\u0273\3\2\2\2\u0276\u0279\3\2"+
		"\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u027a\u0272\3\2\2\2\u027a\u027b\3\2\2\2\u027bw\3\2\2\2"+
		"\u027c\u027d\7!\2\2\u027d\u0287\7/\2\2\u027e\u027f\7\"\2\2\u027f\u0287"+
		"\7/\2\2\u0280\u0281\7#\2\2\u0281\u0287\7/\2\2\u0282\u0283\7#\2\2\u0283"+
		"\u0284\5(\25\2\u0284\u0285\7/\2\2\u0285\u0287\3\2\2\2\u0286\u027c\3\2"+
		"\2\2\u0286\u027e\3\2\2\2\u0286\u0280\3\2\2\2\u0286\u0282\3\2\2\2\u0287"+
		"y\3\2\2\2B\177\u0087\u008f\u0097\u009d\u00a2\u00a7\u00ac\u00b6\u00ba\u00bc"+
		"\u00cc\u00d1\u00d5\u00de\u00e2\u00e8\u00fa\u0119\u011b\u0126\u0129\u0134"+
		"\u0136\u013b\u0143\u0147\u0149\u0159\u015c\u016b\u016e\u0173\u017c\u017f"+
		"\u018d\u0192\u019d\u01a6\u01ab\u01ae\u01b6\u01bd\u01c2\u01c5\u01cb\u01d6"+
		"\u01db\u01e6\u01f1\u01fd\u0209\u0215\u0221\u0227\u022b\u023a\u024a\u0261"+
		"\u0268\u026b\u0277\u027a\u0286";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}