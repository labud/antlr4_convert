// Generated from D:/antlr4/ShaderParser/src/MidSL\MidSL.g4 by ANTLR 4.5.1
package MidSL;
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
		DOT=43, COLON=44, SEMICOLON=45, COMMA=46, SHARP=47, SEMANTICS=48, FUNC_KEYWORD=49, 
		DECIMAL=50, OCTAL=51, HEX=52, FLOAT_NUM=53, SCALA=54, VECTOR=55, MATRIX=56, 
		FLOAT_OPAQUE=57, INT_OPAQUE=58, U_INT_OPAQUE=59, BASIC_OPAQUE_TYPE=60, 
		INCREAMENT_OP=61, UNARY_OP=62, MULDIV_OP=63, ADDDIV_OP=64, SHIFT_OP=65, 
		COMPARE_OP=66, EQUAL_OP=67, BITWISE_OP=68, LOGIC_OP=69, ASSIGNMENT_OP=70, 
		ARITHMETIC_ASSIGNMENT_OP=71, IDENTIFIER=72, COMMENT=73, WS=74, LINE_COMMENT=75, 
		IDENTIFEIR=76;
	public static final int
		RULE_prog = 0, RULE_preprocessor = 1, RULE_version_pre = 2, RULE_type_qualifier = 3, 
		RULE_storage_qualifier = 4, RULE_type_modifier = 5, RULE_integer = 6, 
		RULE_float_num = 7, RULE_bool_num = 8, RULE_type_specifier = 9, RULE_type_specifier_nonarray = 10, 
		RULE_array_specifier = 11, RULE_struct_specifier = 12, RULE_basic_type = 13, 
		RULE_void_type = 14, RULE_scala_type = 15, RULE_vector_type = 16, RULE_matrix_type = 17, 
		RULE_opaque_type = 18, RULE_float_opaque_type = 19, RULE_int_opaque_type = 20, 
		RULE_u_int_opaque_type = 21, RULE_expression = 22, RULE_primary_expression = 23, 
		RULE_constant_expression = 24, RULE_left_value = 25, RULE_array_struct_selection = 26, 
		RULE_assignment_expression = 27, RULE_arithmetic_assignment_expression = 28, 
		RULE_function_definition = 29, RULE_function_declaration = 30, RULE_function_call = 31, 
		RULE_return_Type = 32, RULE_function_name = 33, RULE_func_decl_member = 34, 
		RULE_statement_list = 35, RULE_statement = 36, RULE_simple_statement = 37, 
		RULE_compoud_statement = 38, RULE_basic_statement = 39, RULE_declaration_statement = 40, 
		RULE_simple_declaration = 41, RULE_simple_declarator = 42, RULE_sample_declaration = 43, 
		RULE_texture_declaration = 44, RULE_struct_declaration = 45, RULE_cbuffer_declaration = 46, 
		RULE_inbuffer_declaration = 47, RULE_outbuffer_declaration = 48, RULE_inoutbuffer_declaration = 49, 
		RULE_function_definition_statement = 50, RULE_assignment_statement = 51, 
		RULE_expression_statement = 52, RULE_selection_statement = 53, RULE_selection_rest_statement = 54, 
		RULE_switch_statement = 55, RULE_case_label = 56, RULE_iteration_statement = 57, 
		RULE_for_init_statement = 58, RULE_for_cond_statement = 59, RULE_for_rest_statement = 60, 
		RULE_jump_statement = 61;
	public static final String[] ruleNames = {
		"prog", "preprocessor", "version_pre", "type_qualifier", "storage_qualifier", 
		"type_modifier", "integer", "float_num", "bool_num", "type_specifier", 
		"type_specifier_nonarray", "array_specifier", "struct_specifier", "basic_type", 
		"void_type", "scala_type", "vector_type", "matrix_type", "opaque_type", 
		"float_opaque_type", "int_opaque_type", "u_int_opaque_type", "expression", 
		"primary_expression", "constant_expression", "left_value", "array_struct_selection", 
		"assignment_expression", "arithmetic_assignment_expression", "function_definition", 
		"function_declaration", "function_call", "return_Type", "function_name", 
		"func_decl_member", "statement_list", "statement", "simple_statement", 
		"compoud_statement", "basic_statement", "declaration_statement", "simple_declaration", 
		"simple_declarator", "sample_declaration", "texture_declaration", "struct_declaration", 
		"cbuffer_declaration", "inbuffer_declaration", "outbuffer_declaration", 
		"inoutbuffer_declaration", "function_definition_statement", "assignment_statement", 
		"expression_statement", "selection_statement", "selection_rest_statement", 
		"switch_statement", "case_label", "iteration_statement", "for_init_statement", 
		"for_cond_statement", "for_rest_statement", "jump_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'static'", "'uniform'", "'extern'", "'volatile'", 
		"'shared'", "'groupshared'", "'nointerpolation'", "'precise'", "'const'", 
		"'row_major'", "'column_major'", "'true'", "'false'", "'void'", "'|'", 
		null, "'SMPBUFFER'", "'TEXBUFFER'", "'struct'", "'cbuffer'", "'inbuffer'", 
		"'outbuffer'", "'inoutbuffer'", "'if'", "'else'", "'?'", "'for'", "'do'", 
		"'while'", "'continue'", "'break'", "'return'", "'switch'", "'case'", 
		"'defualt'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "':'", "';'", 
		"','", "'#'", null, "'dot'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "VERSOIN_PROFILE", "SMPBUFFER", "TXBUFFER", 
		"STRUCT", "CBUFFER", "INBUFFER", "OUTBUFFER", "INOUTBUFFER", "IF", "ELSE", 
		"QUESTION", "FOR", "DO", "WHILE", "CONTINUE", "BREAK", "RETURN", "SWITCH", 
		"CASE", "DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "DOT", "COLON", "SEMICOLON", "COMMA", 
		"SHARP", "SEMANTICS", "FUNC_KEYWORD", "DECIMAL", "OCTAL", "HEX", "FLOAT_NUM", 
		"SCALA", "VECTOR", "MATRIX", "FLOAT_OPAQUE", "INT_OPAQUE", "U_INT_OPAQUE", 
		"BASIC_OPAQUE_TYPE", "INCREAMENT_OP", "UNARY_OP", "MULDIV_OP", "ADDDIV_OP", 
		"SHIFT_OP", "COMPARE_OP", "EQUAL_OP", "BITWISE_OP", "LOGIC_OP", "ASSIGNMENT_OP", 
		"ARITHMETIC_ASSIGNMENT_OP", "IDENTIFIER", "COMMENT", "WS", "LINE_COMMENT", 
		"IDENTIFEIR"
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
	public static class ProgContext extends ParserRuleContext {
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
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
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
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHARP) {
				{
				{
				setState(124);
				preprocessor();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SMPBUFFER) {
				{
				{
				setState(130);
				sample_declaration();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TXBUFFER) {
				{
				{
				setState(136);
				texture_declaration();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRUCT) {
				{
				{
				setState(142);
				struct_declaration();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_la = _input.LA(1);
			if (_la==CBUFFER) {
				{
				setState(148);
				cbuffer_declaration();
				}
			}

			setState(152);
			_la = _input.LA(1);
			if (_la==INBUFFER) {
				{
				setState(151);
				inbuffer_declaration();
				}
			}

			setState(155);
			_la = _input.LA(1);
			if (_la==OUTBUFFER) {
				{
				setState(154);
				outbuffer_declaration();
				}
			}

			setState(158);
			_la = _input.LA(1);
			if (_la==INOUTBUFFER) {
				{
				setState(157);
				inoutbuffer_declaration();
				}
			}

			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (SCALA - 15)) | (1L << (VECTOR - 15)) | (1L << (MATRIX - 15)) | (1L << (FLOAT_OPAQUE - 15)) | (1L << (INT_OPAQUE - 15)) | (1L << (U_INT_OPAQUE - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				{
				setState(160);
				function_declaration();
				}
				}
				setState(165);
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
		enterRule(_localctx, 2, RULE_preprocessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(SHARP);
			setState(167);
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
		enterRule(_localctx, 4, RULE_version_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__0);
			setState(170);
			integer();
			setState(172);
			_la = _input.LA(1);
			if (_la==VERSOIN_PROFILE) {
				{
				setState(171);
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
		enterRule(_localctx, 6, RULE_type_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(176);
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
					setState(174);
					storage_qualifier();
					}
					break;
				case T__9:
				case T__10:
				case T__11:
					{
					setState(175);
					type_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(178); 
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
		enterRule(_localctx, 8, RULE_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 10, RULE_type_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
		enterRule(_localctx, 12, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
		enterRule(_localctx, 14, RULE_float_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		enterRule(_localctx, 16, RULE_bool_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 18, RULE_type_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			type_specifier_nonarray();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(191);
				array_specifier();
				}
				}
				setState(196);
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
		enterRule(_localctx, 20, RULE_type_specifier_nonarray);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case T__14:
			case SCALA:
			case VECTOR:
			case MATRIX:
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				basic_type();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
		enterRule(_localctx, 22, RULE_array_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LEFT_BRACKET);
			setState(203);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (FLOAT_OPAQUE - 13)) | (1L << (INT_OPAQUE - 13)) | (1L << (U_INT_OPAQUE - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
				{
				setState(202);
				expression(0);
				}
			}

			setState(205);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_struct_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(DOT);
			setState(208);
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
		enterRule(_localctx, 26, RULE_basic_type);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				void_type();
				}
				break;
			case SCALA:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				scala_type();
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				vector_type();
				}
				break;
			case MATRIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				matrix_type();
				}
				break;
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
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
		enterRule(_localctx, 28, RULE_void_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		enterRule(_localctx, 30, RULE_scala_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 32, RULE_vector_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 34, RULE_matrix_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterOpaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitOpaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitOpaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opaque_typeContext opaque_type() throws RecognitionException {
		Opaque_typeContext _localctx = new Opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opaque_type);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case FLOAT_OPAQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				float_opaque_type();
				}
				break;
			case INT_OPAQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				int_opaque_type();
				}
				break;
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
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
		public TerminalNode FLOAT_OPAQUE() { return getToken(MidSLParser.FLOAT_OPAQUE, 0); }
		public Float_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterFloat_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitFloat_opaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitFloat_opaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_opaque_typeContext float_opaque_type() throws RecognitionException {
		Float_opaque_typeContext _localctx = new Float_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_float_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		public TerminalNode INT_OPAQUE() { return getToken(MidSLParser.INT_OPAQUE, 0); }
		public Int_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterInt_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitInt_opaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitInt_opaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_opaque_typeContext int_opaque_type() throws RecognitionException {
		Int_opaque_typeContext _localctx = new Int_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_int_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		public TerminalNode U_INT_OPAQUE() { return getToken(MidSLParser.U_INT_OPAQUE, 0); }
		public U_int_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u_int_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).enterU_int_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MidSLListener ) ((MidSLListener)listener).exitU_int_opaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MidSLVisitor ) return ((MidSLVisitor<? extends T>)visitor).visitU_int_opaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final U_int_opaque_typeContext u_int_opaque_type() throws RecognitionException {
		U_int_opaque_typeContext _localctx = new U_int_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_u_int_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			switch (_input.LA(1)) {
			case INCREAMENT_OP:
				{
				setState(237);
				match(INCREAMENT_OP);
				setState(238);
				expression(11);
				}
				break;
			case ADDDIV_OP:
				{
				setState(239);
				match(ADDDIV_OP);
				setState(240);
				expression(10);
				}
				break;
			case UNARY_OP:
				{
				setState(241);
				match(UNARY_OP);
				setState(242);
				expression(9);
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case LEFT_PAREN:
			case FUNC_KEYWORD:
			case DECIMAL:
			case OCTAL:
			case HEX:
			case FLOAT_NUM:
			case SCALA:
			case VECTOR:
			case MATRIX:
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
			case IDENTIFIER:
				{
				setState(243);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(247);
						match(MULDIV_OP);
						setState(248);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(250);
						match(ADDDIV_OP);
						setState(251);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(253);
						match(SHIFT_OP);
						setState(254);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(256);
						match(COMPARE_OP);
						setState(257);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(259);
						match(EQUAL_OP);
						setState(260);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262);
						match(BITWISE_OP);
						setState(263);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(265);
						match(LOGIC_OP);
						setState(266);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(268);
						match(QUESTION);
						setState(269);
						expression(0);
						setState(270);
						match(COLON);
						setState(271);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(274);
						match(INCREAMENT_OP);
						}
						break;
					}
					} 
				}
				setState(279);
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
		enterRule(_localctx, 46, RULE_primary_expression);
		int _la;
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				constant_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				basic_type();
				setState(282);
				match(LEFT_PAREN);
				setState(291);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (FLOAT_OPAQUE - 13)) | (1L << (INT_OPAQUE - 13)) | (1L << (U_INT_OPAQUE - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
					{
					setState(283);
					expression(0);
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(284);
						match(COMMA);
						setState(285);
						expression(0);
						}
						}
						setState(290);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(293);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(LEFT_PAREN);
				setState(296);
				type_specifier();
				setState(297);
				match(RIGHT_PAREN);
				setState(298);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				left_value();
				setState(302);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(301);
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
		enterRule(_localctx, 48, RULE_constant_expression);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case DECIMAL:
			case OCTAL:
			case HEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				integer();
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				float_num();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
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
		enterRule(_localctx, 50, RULE_left_value);
		try {
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(LEFT_PAREN);
				setState(313);
				expression(0);
				setState(314);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
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
		enterRule(_localctx, 52, RULE_array_struct_selection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(321);
					switch (_input.LA(1)) {
					case LEFT_BRACKET:
						{
						setState(319);
						array_specifier();
						}
						break;
					case DOT:
						{
						setState(320);
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
				setState(323); 
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
		enterRule(_localctx, 54, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ASSIGNMENT_OP);
			setState(326);
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
		enterRule(_localctx, 56, RULE_arithmetic_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(ARITHMETIC_ASSIGNMENT_OP);
			setState(329);
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
		enterRule(_localctx, 58, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			return_Type();
			setState(332);
			function_name();
			setState(333);
			match(LEFT_PAREN);
			setState(342);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (SCALA - 15)) | (1L << (VECTOR - 15)) | (1L << (MATRIX - 15)) | (1L << (FLOAT_OPAQUE - 15)) | (1L << (INT_OPAQUE - 15)) | (1L << (U_INT_OPAQUE - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(334);
				func_decl_member();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(335);
					match(COMMA);
					setState(336);
					func_decl_member();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(344);
			match(RIGHT_PAREN);
			setState(345);
			match(LEFT_BRACE);
			setState(346);
			statement_list();
			setState(347);
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
		enterRule(_localctx, 60, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			return_Type();
			setState(350);
			function_name();
			setState(351);
			match(LEFT_PAREN);
			setState(360);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (SCALA - 15)) | (1L << (VECTOR - 15)) | (1L << (MATRIX - 15)) | (1L << (FLOAT_OPAQUE - 15)) | (1L << (INT_OPAQUE - 15)) | (1L << (U_INT_OPAQUE - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(352);
				func_decl_member();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(353);
					match(COMMA);
					setState(354);
					func_decl_member();
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(362);
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
		enterRule(_localctx, 62, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			function_name();
			setState(365);
			match(LEFT_PAREN);
			setState(374);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (FLOAT_OPAQUE - 13)) | (1L << (INT_OPAQUE - 13)) | (1L << (U_INT_OPAQUE - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
				{
				setState(366);
				expression(0);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(367);
					match(COMMA);
					setState(368);
					expression(0);
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(376);
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
		enterRule(_localctx, 64, RULE_return_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		enterRule(_localctx, 66, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
		enterRule(_localctx, 68, RULE_func_decl_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			type_specifier();
			setState(383);
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
		enterRule(_localctx, 70, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << DO) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << SWITCH) | (1L << CASE) | (1L << DEFUALT) | (1L << LEFT_PAREN) | (1L << LEFT_BRACE) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP))) != 0) || _la==ADDDIV_OP || _la==IDENTIFIER) {
				{
				{
				setState(385);
				statement();
				}
				}
				setState(390);
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
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(393);
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
			case FUNC_KEYWORD:
			case DECIMAL:
			case OCTAL:
			case HEX:
			case FLOAT_NUM:
			case SCALA:
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
				setState(391);
				simple_statement();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
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
		enterRule(_localctx, 74, RULE_simple_statement);
		try {
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				function_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				basic_statement();
				setState(397);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				switch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				case_label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
				iteration_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(403);
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
		enterRule(_localctx, 76, RULE_compoud_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(LEFT_BRACE);
			setState(407);
			statement_list();
			setState(408);
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
		enterRule(_localctx, 78, RULE_basic_statement);
		try {
			setState(413);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
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
		enterRule(_localctx, 80, RULE_declaration_statement);
		try {
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				struct_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				simple_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
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
		enterRule(_localctx, 82, RULE_simple_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(420);
				type_qualifier();
				}
			}

			setState(423);
			type_specifier();
			setState(424);
			simple_declarator();
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(425);
					match(COMMA);
					setState(426);
					simple_declarator();
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		public TerminalNode SEMANTICS() { return getToken(MidSLParser.SEMANTICS, 0); }
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
		enterRule(_localctx, 84, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			left_value();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(433);
				array_specifier();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(439);
				match(COLON);
				setState(440);
				match(SEMANTICS);
				}
			}

			setState(444);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(443);
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

	public static class Sample_declarationContext extends ParserRuleContext {
		public TerminalNode SMPBUFFER() { return getToken(MidSLParser.SMPBUFFER, 0); }
		public List<TerminalNode> IDENTIFEIR() { return getTokens(MidSLParser.IDENTIFEIR); }
		public TerminalNode IDENTIFEIR(int i) {
			return getToken(MidSLParser.IDENTIFEIR, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 86, RULE_sample_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(SMPBUFFER);
			setState(447);
			match(IDENTIFEIR);
			setState(448);
			match(T__15);
			setState(449);
			match(IDENTIFEIR);
			setState(450);
			match(IDENTIFIER);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(451);
				array_specifier();
				}
				}
				setState(456);
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
		public List<TerminalNode> IDENTIFEIR() { return getTokens(MidSLParser.IDENTIFEIR); }
		public TerminalNode IDENTIFEIR(int i) {
			return getToken(MidSLParser.IDENTIFEIR, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(MidSLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 88, RULE_texture_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(TXBUFFER);
			setState(458);
			match(IDENTIFEIR);
			setState(459);
			match(T__15);
			setState(460);
			match(IDENTIFEIR);
			setState(461);
			match(IDENTIFIER);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(462);
				array_specifier();
				}
				}
				setState(467);
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
		enterRule(_localctx, 90, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(STRUCT);
			setState(469);
			match(IDENTIFIER);
			setState(470);
			match(LEFT_BRACE);
			setState(474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(471);
				simple_declaration();
				setState(472);
				match(SEMICOLON);
				}
				}
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(478);
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
		enterRule(_localctx, 92, RULE_cbuffer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(CBUFFER);
			setState(481);
			match(IDENTIFIER);
			setState(482);
			match(LEFT_BRACE);
			setState(486); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(483);
				simple_declaration();
				setState(484);
				match(SEMICOLON);
				}
				}
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(490);
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
		enterRule(_localctx, 94, RULE_inbuffer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(INBUFFER);
			setState(493);
			match(IDENTIFIER);
			setState(494);
			match(LEFT_BRACE);
			setState(498); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(495);
				simple_declaration();
				setState(496);
				match(SEMICOLON);
				}
				}
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(502);
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
		enterRule(_localctx, 96, RULE_outbuffer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(OUTBUFFER);
			setState(505);
			match(IDENTIFIER);
			setState(506);
			match(LEFT_BRACE);
			setState(510); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(507);
				simple_declaration();
				setState(508);
				match(SEMICOLON);
				}
				}
				setState(512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(514);
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
		enterRule(_localctx, 98, RULE_inoutbuffer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(INOUTBUFFER);
			setState(517);
			match(IDENTIFIER);
			setState(518);
			match(LEFT_BRACE);
			setState(522); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(519);
				simple_declaration();
				setState(520);
				match(SEMICOLON);
				}
				}
				setState(524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(526);
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
			setState(528);
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
		enterRule(_localctx, 102, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			left_value();
			setState(532);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET || _la==DOT) {
				{
				setState(531);
				array_struct_selection();
				}
			}

			setState(536);
			switch (_input.LA(1)) {
			case ASSIGNMENT_OP:
				{
				setState(534);
				assignment_expression();
				}
				break;
			case ARITHMETIC_ASSIGNMENT_OP:
				{
				setState(535);
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
		enterRule(_localctx, 104, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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
		enterRule(_localctx, 106, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(IF);
			setState(541);
			match(LEFT_PAREN);
			setState(542);
			expression(0);
			setState(543);
			match(RIGHT_PAREN);
			setState(544);
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
		enterRule(_localctx, 108, RULE_selection_rest_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			statement();
			setState(549);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(547);
				match(ELSE);
				setState(548);
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
		enterRule(_localctx, 110, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(SWITCH);
			setState(552);
			match(LEFT_PAREN);
			setState(553);
			expression(0);
			setState(554);
			match(RIGHT_PAREN);
			setState(555);
			match(LEFT_BRACE);
			setState(556);
			statement_list();
			setState(557);
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
		enterRule(_localctx, 112, RULE_case_label);
		try {
			setState(565);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(CASE);
				setState(560);
				expression(0);
				setState(561);
				match(COLON);
				}
				break;
			case DEFUALT:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(DEFUALT);
				setState(564);
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
		enterRule(_localctx, 114, RULE_iteration_statement);
		try {
			setState(588);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(WHILE);
				setState(568);
				match(LEFT_PAREN);
				setState(569);
				expression(0);
				setState(570);
				match(RIGHT_PAREN);
				setState(571);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(DO);
				setState(574);
				statement();
				setState(575);
				match(WHILE);
				setState(576);
				match(LEFT_PAREN);
				setState(577);
				expression(0);
				setState(578);
				match(RIGHT_PAREN);
				setState(579);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				match(FOR);
				setState(582);
				match(LEFT_PAREN);
				setState(583);
				for_init_statement();
				setState(584);
				for_cond_statement();
				setState(585);
				for_rest_statement();
				setState(586);
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
		enterRule(_localctx, 116, RULE_for_init_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP))) != 0) || _la==ADDDIV_OP || _la==IDENTIFIER) {
				{
				setState(590);
				basic_statement();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(591);
					match(COMMA);
					setState(592);
					basic_statement();
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(600);
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
		enterRule(_localctx, 118, RULE_for_cond_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			expression(0);
			setState(603);
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
		enterRule(_localctx, 120, RULE_for_rest_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP))) != 0) || _la==ADDDIV_OP || _la==IDENTIFIER) {
				{
				setState(605);
				basic_statement();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(606);
					match(COMMA);
					setState(607);
					basic_statement();
					}
					}
					setState(612);
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
		enterRule(_localctx, 122, RULE_jump_statement);
		try {
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(CONTINUE);
				setState(616);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(BREAK);
				setState(618);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				match(RETURN);
				setState(620);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(621);
				match(RETURN);
				setState(622);
				expression(0);
				setState(623);
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
		case 22:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3N\u0276\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\2\7\2\u0086\n\2\f"+
		"\2\16\2\u0089\13\2\3\2\7\2\u008c\n\2\f\2\16\2\u008f\13\2\3\2\7\2\u0092"+
		"\n\2\f\2\16\2\u0095\13\2\3\2\5\2\u0098\n\2\3\2\5\2\u009b\n\2\3\2\5\2\u009e"+
		"\n\2\3\2\5\2\u00a1\n\2\3\2\7\2\u00a4\n\2\f\2\16\2\u00a7\13\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\5\4\u00af\n\4\3\5\3\5\6\5\u00b3\n\5\r\5\16\5\u00b4\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13\u00c3\n\13\f\13\16"+
		"\13\u00c6\13\13\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\5\r\u00ce\n\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00da\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u00e7\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f7\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u0116\n\30\f\30\16\30\u0119\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0121\n\31\f\31\16\31\u0124\13\31\5\31\u0126\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0131\n\31\5\31\u0133\n\31\3"+
		"\32\3\32\3\32\5\32\u0138\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0140"+
		"\n\33\3\34\3\34\6\34\u0144\n\34\r\34\16\34\u0145\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0154\n\37\f\37\16\37\u0157"+
		"\13\37\5\37\u0159\n\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u0166"+
		"\n \f \16 \u0169\13 \5 \u016b\n \3 \3 \3!\3!\3!\3!\3!\7!\u0174\n!\f!\16"+
		"!\u0177\13!\5!\u0179\n!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\7%\u0185\n%\f"+
		"%\16%\u0188\13%\3&\3&\5&\u018c\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u0197\n\'\3(\3(\3(\3(\3)\3)\3)\5)\u01a0\n)\3*\3*\3*\5*\u01a5\n*\3"+
		"+\5+\u01a8\n+\3+\3+\3+\3+\7+\u01ae\n+\f+\16+\u01b1\13+\3,\3,\7,\u01b5"+
		"\n,\f,\16,\u01b8\13,\3,\3,\5,\u01bc\n,\3,\5,\u01bf\n,\3-\3-\3-\3-\3-\3"+
		"-\7-\u01c7\n-\f-\16-\u01ca\13-\3.\3.\3.\3.\3.\3.\7.\u01d2\n.\f.\16.\u01d5"+
		"\13.\3/\3/\3/\3/\3/\3/\6/\u01dd\n/\r/\16/\u01de\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\6\60\u01e9\n\60\r\60\16\60\u01ea\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\6\61\u01f5\n\61\r\61\16\61\u01f6\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\6\62\u0201\n\62\r\62\16\62\u0202\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\6\63\u020d\n\63\r\63\16\63\u020e\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\5\65\u0217\n\65\3\65\3\65\5\65\u021b\n\65\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\58\u0228\n8\39\39\39\39\39\39\39\3"+
		"9\3:\3:\3:\3:\3:\3:\5:\u0238\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\5;\u024f\n;\3<\3<\3<\7<\u0254\n<\f<\16<\u0257"+
		"\13<\5<\u0259\n<\3<\3<\3=\3=\3=\3>\3>\3>\7>\u0263\n>\f>\16>\u0266\13>"+
		"\5>\u0268\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0274\n?\3?\2\3.@\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|\2\7\3\2\4\13\3\2\f\16\3\2\64\66\3\2\17\20\4\2\63"+
		"\63JJ\u028f\2\u0081\3\2\2\2\4\u00a8\3\2\2\2\6\u00ab\3\2\2\2\b\u00b2\3"+
		"\2\2\2\n\u00b6\3\2\2\2\f\u00b8\3\2\2\2\16\u00ba\3\2\2\2\20\u00bc\3\2\2"+
		"\2\22\u00be\3\2\2\2\24\u00c0\3\2\2\2\26\u00c9\3\2\2\2\30\u00cb\3\2\2\2"+
		"\32\u00d1\3\2\2\2\34\u00d9\3\2\2\2\36\u00db\3\2\2\2 \u00dd\3\2\2\2\"\u00df"+
		"\3\2\2\2$\u00e1\3\2\2\2&\u00e6\3\2\2\2(\u00e8\3\2\2\2*\u00ea\3\2\2\2,"+
		"\u00ec\3\2\2\2.\u00f6\3\2\2\2\60\u0132\3\2\2\2\62\u0137\3\2\2\2\64\u013f"+
		"\3\2\2\2\66\u0143\3\2\2\28\u0147\3\2\2\2:\u014a\3\2\2\2<\u014d\3\2\2\2"+
		">\u015f\3\2\2\2@\u016e\3\2\2\2B\u017c\3\2\2\2D\u017e\3\2\2\2F\u0180\3"+
		"\2\2\2H\u0186\3\2\2\2J\u018b\3\2\2\2L\u0196\3\2\2\2N\u0198\3\2\2\2P\u019f"+
		"\3\2\2\2R\u01a4\3\2\2\2T\u01a7\3\2\2\2V\u01b2\3\2\2\2X\u01c0\3\2\2\2Z"+
		"\u01cb\3\2\2\2\\\u01d6\3\2\2\2^\u01e2\3\2\2\2`\u01ee\3\2\2\2b\u01fa\3"+
		"\2\2\2d\u0206\3\2\2\2f\u0212\3\2\2\2h\u0214\3\2\2\2j\u021c\3\2\2\2l\u021e"+
		"\3\2\2\2n\u0224\3\2\2\2p\u0229\3\2\2\2r\u0237\3\2\2\2t\u024e\3\2\2\2v"+
		"\u0258\3\2\2\2x\u025c\3\2\2\2z\u0267\3\2\2\2|\u0273\3\2\2\2~\u0080\5\4"+
		"\3\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0087\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\5X-\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5Z.\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0093\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\5\\/\2\u0091\u0090\3\2"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\5^\60\2\u0097\u0096\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\5`\61\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\5b"+
		"\62\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u00a1\5d\63\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2"+
		"\2\2\u00a2\u00a4\5> \2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\61\2\2\u00a9\u00aa\5\6\4\2\u00aa\5\3\2\2\2\u00ab\u00ac\7\3\2"+
		"\2\u00ac\u00ae\5\16\b\2\u00ad\u00af\7\23\2\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\7\3\2\2\2\u00b0\u00b3\5\n\6\2\u00b1\u00b3\5\f\7\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\t\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7"+
		"\13\3\2\2\2\u00b8\u00b9\t\3\2\2\u00b9\r\3\2\2\2\u00ba\u00bb\t\4\2\2\u00bb"+
		"\17\3\2\2\2\u00bc\u00bd\7\67\2\2\u00bd\21\3\2\2\2\u00be\u00bf\t\5\2\2"+
		"\u00bf\23\3\2\2\2\u00c0\u00c4\5\26\f\2\u00c1\u00c3\5\30\r\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\25\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\5\34\17\2\u00c8\u00ca\7J\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00cd"+
		"\7+\2\2\u00cc\u00ce\5.\30\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0\31\3\2\2\2\u00d1\u00d2\7-\2\2"+
		"\u00d2\u00d3\5.\30\2\u00d3\33\3\2\2\2\u00d4\u00da\5\36\20\2\u00d5\u00da"+
		"\5 \21\2\u00d6\u00da\5\"\22\2\u00d7\u00da\5$\23\2\u00d8\u00da\5&\24\2"+
		"\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\35\3\2\2\2\u00db\u00dc\7\21\2\2\u00dc"+
		"\37\3\2\2\2\u00dd\u00de\78\2\2\u00de!\3\2\2\2\u00df\u00e0\79\2\2\u00e0"+
		"#\3\2\2\2\u00e1\u00e2\7:\2\2\u00e2%\3\2\2\2\u00e3\u00e7\5(\25\2\u00e4"+
		"\u00e7\5*\26\2\u00e5\u00e7\5,\27\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7\'\3\2\2\2\u00e8\u00e9\7;\2\2\u00e9)\3\2"+
		"\2\2\u00ea\u00eb\7<\2\2\u00eb+\3\2\2\2\u00ec\u00ed\7=\2\2\u00ed-\3\2\2"+
		"\2\u00ee\u00ef\b\30\1\2\u00ef\u00f0\7?\2\2\u00f0\u00f7\5.\30\r\u00f1\u00f2"+
		"\7B\2\2\u00f2\u00f7\5.\30\f\u00f3\u00f4\7@\2\2\u00f4\u00f7\5.\30\13\u00f5"+
		"\u00f7\5\60\31\2\u00f6\u00ee\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f3\3"+
		"\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u0117\3\2\2\2\u00f8\u00f9\f\n\2\2\u00f9"+
		"\u00fa\7A\2\2\u00fa\u0116\5.\30\13\u00fb\u00fc\f\t\2\2\u00fc\u00fd\7B"+
		"\2\2\u00fd\u0116\5.\30\n\u00fe\u00ff\f\b\2\2\u00ff\u0100\7C\2\2\u0100"+
		"\u0116\5.\30\t\u0101\u0102\f\7\2\2\u0102\u0103\7D\2\2\u0103\u0116\5.\30"+
		"\b\u0104\u0105\f\6\2\2\u0105\u0106\7E\2\2\u0106\u0116\5.\30\7\u0107\u0108"+
		"\f\5\2\2\u0108\u0109\7F\2\2\u0109\u0116\5.\30\6\u010a\u010b\f\4\2\2\u010b"+
		"\u010c\7G\2\2\u010c\u0116\5.\30\5\u010d\u010e\f\3\2\2\u010e\u010f\7\35"+
		"\2\2\u010f\u0110\5.\30\2\u0110\u0111\7.\2\2\u0111\u0112\5.\30\4\u0112"+
		"\u0116\3\2\2\2\u0113\u0114\f\16\2\2\u0114\u0116\7?\2\2\u0115\u00f8\3\2"+
		"\2\2\u0115\u00fb\3\2\2\2\u0115\u00fe\3\2\2\2\u0115\u0101\3\2\2\2\u0115"+
		"\u0104\3\2\2\2\u0115\u0107\3\2\2\2\u0115\u010a\3\2\2\2\u0115\u010d\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118/\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u0133\5\62\32"+
		"\2\u011b\u011c\5\34\17\2\u011c\u0125\7\'\2\2\u011d\u0122\5.\30\2\u011e"+
		"\u011f\7\60\2\2\u011f\u0121\5.\30\2\u0120\u011e\3\2\2\2\u0121\u0124\3"+
		"\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\7(\2\2\u0128\u0133\3\2\2\2\u0129\u012a\7\'\2\2\u012a"+
		"\u012b\5\24\13\2\u012b\u012c\7(\2\2\u012c\u012d\5.\30\2\u012d\u0133\3"+
		"\2\2\2\u012e\u0130\5\64\33\2\u012f\u0131\5\66\34\2\u0130\u012f\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u011a\3\2\2\2\u0132\u011b"+
		"\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u012e\3\2\2\2\u0133\61\3\2\2\2\u0134"+
		"\u0138\5\16\b\2\u0135\u0138\5\20\t\2\u0136\u0138\5\22\n\2\u0137\u0134"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\63\3\2\2\2\u0139"+
		"\u0140\5@!\2\u013a\u013b\7\'\2\2\u013b\u013c\5.\30\2\u013c\u013d\7(\2"+
		"\2\u013d\u0140\3\2\2\2\u013e\u0140\7J\2\2\u013f\u0139\3\2\2\2\u013f\u013a"+
		"\3\2\2\2\u013f\u013e\3\2\2\2\u0140\65\3\2\2\2\u0141\u0144\5\30\r\2\u0142"+
		"\u0144\5\32\16\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\67\3\2\2\2\u0147"+
		"\u0148\7H\2\2\u0148\u0149\5.\30\2\u01499\3\2\2\2\u014a\u014b\7I\2\2\u014b"+
		"\u014c\5.\30\2\u014c;\3\2\2\2\u014d\u014e\5B\"\2\u014e\u014f\5D#\2\u014f"+
		"\u0158\7\'\2\2\u0150\u0155\5F$\2\u0151\u0152\7\60\2\2\u0152\u0154\5F$"+
		"\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0150\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7(\2\2\u015b\u015c\7)\2"+
		"\2\u015c\u015d\5H%\2\u015d\u015e\7*\2\2\u015e=\3\2\2\2\u015f\u0160\5B"+
		"\"\2\u0160\u0161\5D#\2\u0161\u016a\7\'\2\2\u0162\u0167\5F$\2\u0163\u0164"+
		"\7\60\2\2\u0164\u0166\5F$\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u016a\u0162\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\7(\2\2\u016d?\3\2\2\2\u016e\u016f\5D#\2\u016f\u0178\7\'\2\2\u0170"+
		"\u0175\5.\30\2\u0171\u0172\7\60\2\2\u0172\u0174\5.\30\2\u0173\u0171\3"+
		"\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0170\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7(\2\2\u017bA\3\2\2\2\u017c\u017d"+
		"\5\24\13\2\u017dC\3\2\2\2\u017e\u017f\t\6\2\2\u017fE\3\2\2\2\u0180\u0181"+
		"\5\24\13\2\u0181\u0182\7J\2\2\u0182G\3\2\2\2\u0183\u0185\5J&\2\u0184\u0183"+
		"\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"I\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018c\5L\'\2\u018a\u018c\5N(\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018cK\3\2\2\2\u018d\u0197\5f\64\2"+
		"\u018e\u018f\5P)\2\u018f\u0190\7/\2\2\u0190\u0197\3\2\2\2\u0191\u0197"+
		"\5l\67\2\u0192\u0197\5p9\2\u0193\u0197\5r:\2\u0194\u0197\5t;\2\u0195\u0197"+
		"\5|?\2\u0196\u018d\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u0191\3\2\2\2\u0196"+
		"\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197M\3\2\2\2\u0198\u0199\7)\2\2\u0199\u019a\5H%\2\u019a\u019b\7"+
		"*\2\2\u019bO\3\2\2\2\u019c\u01a0\5R*\2\u019d\u01a0\5h\65\2\u019e\u01a0"+
		"\5j\66\2\u019f\u019c\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"Q\3\2\2\2\u01a1\u01a5\5\\/\2\u01a2\u01a5\5T+\2\u01a3\u01a5\5> \2\u01a4"+
		"\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5S\3\2\2\2"+
		"\u01a6\u01a8\5\b\5\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01aa\5\24\13\2\u01aa\u01af\5V,\2\u01ab\u01ac\7\60\2\2"+
		"\u01ac\u01ae\5V,\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0U\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b6\5\64\33\2\u01b3\u01b5\5\30\r\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bb\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01ba\7.\2\2\u01ba\u01bc\7\62\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bf\58\35\2\u01be"+
		"\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfW\3\2\2\2\u01c0\u01c1\7\24\2\2"+
		"\u01c1\u01c2\7N\2\2\u01c2\u01c3\7\22\2\2\u01c3\u01c4\7N\2\2\u01c4\u01c8"+
		"\7J\2\2\u01c5\u01c7\5\30\r\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9Y\3\2\2\2\u01ca\u01c8\3\2\2\2"+
		"\u01cb\u01cc\7\25\2\2\u01cc\u01cd\7N\2\2\u01cd\u01ce\7\22\2\2\u01ce\u01cf"+
		"\7N\2\2\u01cf\u01d3\7J\2\2\u01d0\u01d2\5\30\r\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4[\3\2\2\2"+
		"\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7\26\2\2\u01d7\u01d8\7J\2\2\u01d8\u01dc"+
		"\7)\2\2\u01d9\u01da\5T+\2\u01da\u01db\7/\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01d9\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7*\2\2\u01e1]\3\2\2\2\u01e2\u01e3"+
		"\7\27\2\2\u01e3\u01e4\7J\2\2\u01e4\u01e8\7)\2\2\u01e5\u01e6\5T+\2\u01e6"+
		"\u01e7\7/\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ed\7*\2\2\u01ed_\3\2\2\2\u01ee\u01ef\7\30\2\2\u01ef\u01f0\7J\2\2\u01f0"+
		"\u01f4\7)\2\2\u01f1\u01f2\5T+\2\u01f2\u01f3\7/\2\2\u01f3\u01f5\3\2\2\2"+
		"\u01f4\u01f1\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7*\2\2\u01f9a\3\2\2\2\u01fa\u01fb"+
		"\7\31\2\2\u01fb\u01fc\7J\2\2\u01fc\u0200\7)\2\2\u01fd\u01fe\5T+\2\u01fe"+
		"\u01ff\7/\2\2\u01ff\u0201\3\2\2\2\u0200\u01fd\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\7*\2\2\u0205c\3\2\2\2\u0206\u0207\7\32\2\2\u0207\u0208\7J\2\2\u0208"+
		"\u020c\7)\2\2\u0209\u020a\5T+\2\u020a\u020b\7/\2\2\u020b\u020d\3\2\2\2"+
		"\u020c\u0209\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7*\2\2\u0211e\3\2\2\2\u0212\u0213"+
		"\5<\37\2\u0213g\3\2\2\2\u0214\u0216\5\64\33\2\u0215\u0217\5\66\34\2\u0216"+
		"\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u021b\58"+
		"\35\2\u0219\u021b\5:\36\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b"+
		"i\3\2\2\2\u021c\u021d\5.\30\2\u021dk\3\2\2\2\u021e\u021f\7\33\2\2\u021f"+
		"\u0220\7\'\2\2\u0220\u0221\5.\30\2\u0221\u0222\7(\2\2\u0222\u0223\5n8"+
		"\2\u0223m\3\2\2\2\u0224\u0227\5J&\2\u0225\u0226\7\34\2\2\u0226\u0228\5"+
		"J&\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228o\3\2\2\2\u0229\u022a"+
		"\7$\2\2\u022a\u022b\7\'\2\2\u022b\u022c\5.\30\2\u022c\u022d\7(\2\2\u022d"+
		"\u022e\7)\2\2\u022e\u022f\5H%\2\u022f\u0230\7*\2\2\u0230q\3\2\2\2\u0231"+
		"\u0232\7%\2\2\u0232\u0233\5.\30\2\u0233\u0234\7.\2\2\u0234\u0238\3\2\2"+
		"\2\u0235\u0236\7&\2\2\u0236\u0238\7.\2\2\u0237\u0231\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0238s\3\2\2\2\u0239\u023a\7 \2\2\u023a\u023b\7\'\2\2\u023b\u023c"+
		"\5.\30\2\u023c\u023d\7(\2\2\u023d\u023e\5J&\2\u023e\u024f\3\2\2\2\u023f"+
		"\u0240\7\37\2\2\u0240\u0241\5J&\2\u0241\u0242\7 \2\2\u0242\u0243\7\'\2"+
		"\2\u0243\u0244\5.\30\2\u0244\u0245\7(\2\2\u0245\u0246\7/\2\2\u0246\u024f"+
		"\3\2\2\2\u0247\u0248\7\36\2\2\u0248\u0249\7\'\2\2\u0249\u024a\5v<\2\u024a"+
		"\u024b\5x=\2\u024b\u024c\5z>\2\u024c\u024d\7(\2\2\u024d\u024f\3\2\2\2"+
		"\u024e\u0239\3\2\2\2\u024e\u023f\3\2\2\2\u024e\u0247\3\2\2\2\u024fu\3"+
		"\2\2\2\u0250\u0255\5P)\2\u0251\u0252\7\60\2\2\u0252\u0254\5P)\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0250\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\7/\2\2\u025bw\3\2\2\2\u025c"+
		"\u025d\5.\30\2\u025d\u025e\7/\2\2\u025ey\3\2\2\2\u025f\u0264\5P)\2\u0260"+
		"\u0261\7\60\2\2\u0261\u0263\5P)\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2"+
		"\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0268\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0267\u025f\3\2\2\2\u0267\u0268\3\2\2\2\u0268{\3\2\2\2"+
		"\u0269\u026a\7!\2\2\u026a\u0274\7/\2\2\u026b\u026c\7\"\2\2\u026c\u0274"+
		"\7/\2\2\u026d\u026e\7#\2\2\u026e\u0274\7/\2\2\u026f\u0270\7#\2\2\u0270"+
		"\u0271\5.\30\2\u0271\u0272\7/\2\2\u0272\u0274\3\2\2\2\u0273\u0269\3\2"+
		"\2\2\u0273\u026b\3\2\2\2\u0273\u026d\3\2\2\2\u0273\u026f\3\2\2\2\u0274"+
		"}\3\2\2\2?\u0081\u0087\u008d\u0093\u0097\u009a\u009d\u00a0\u00a5\u00ae"+
		"\u00b2\u00b4\u00c4\u00c9\u00cd\u00d9\u00e6\u00f6\u0115\u0117\u0122\u0125"+
		"\u0130\u0132\u0137\u013f\u0143\u0145\u0155\u0158\u0167\u016a\u0175\u0178"+
		"\u0186\u018b\u0196\u019f\u01a4\u01a7\u01af\u01b6\u01bb\u01be\u01c8\u01d3"+
		"\u01de\u01ea\u01f6\u0202\u020e\u0216\u021a\u0227\u0237\u024e\u0255\u0258"+
		"\u0264\u0267\u0273";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}