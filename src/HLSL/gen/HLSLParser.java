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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, VERSOIN_PROFILE=16, 
		CBUFFER=17, STRUCT=18, IF=19, ELSE=20, QUESTION=21, FOR=22, DO=23, WHILE=24, 
		CONTINUE=25, BREAK=26, RETURN=27, SWITCH=28, CASE=29, DEFUALT=30, LEFT_PAREN=31, 
		RIGHT_PAREN=32, LEFT_BRACE=33, RIGHT_BRACE=34, LEFT_BRACKET=35, RIGHT_BRACKET=36, 
		DOT=37, COLON=38, SEMICOLON=39, COMMA=40, SHARP=41, SEMANTICS=42, SHADER_SEMANTICS=43, 
		SV_SEMANTICS=44, FUNC_KEYWORD=45, DECIMAL=46, OCTAL=47, HEX=48, FLOAT_NUM=49, 
		SCALA=50, VECTOR=51, MATRIX=52, FLOAT_OPAQUE=53, INT_OPAQUE=54, U_INT_OPAQUE=55, 
		BASIC_OPAQUE_TYPE=56, INCREAMENT_OP=57, UNARY_OP=58, MULDIV_OP=59, ADDDIV_OP=60, 
		SHIFT_OP=61, COMPARE_OP=62, EQUAL_OP=63, BITWISE_OP=64, LOGIC_OP=65, ASSIGNMENT_OP=66, 
		ARITHMETIC_ASSIGNMENT_OP=67, IDENTIFIER=68, COMMENT=69, WS=70, LINE_COMMENT=71;
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
		RULE_simple_declaration = 41, RULE_simple_declarator = 42, RULE_cbufer_declaration = 43, 
		RULE_struct_declaration = 44, RULE_function_definition_statement = 45, 
		RULE_assignment_statement = 46, RULE_expression_statement = 47, RULE_selection_statement = 48, 
		RULE_selection_rest_statement = 49, RULE_switch_statement = 50, RULE_case_label = 51, 
		RULE_iteration_statement = 52, RULE_for_init_statement = 53, RULE_for_cond_statement = 54, 
		RULE_for_rest_statement = 55, RULE_jump_statement = 56;
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
		"simple_declarator", "cbufer_declaration", "struct_declaration", "function_definition_statement", 
		"assignment_statement", "expression_statement", "selection_statement", 
		"selection_rest_statement", "switch_statement", "case_label", "iteration_statement", 
		"for_init_statement", "for_cond_statement", "for_rest_statement", "jump_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'static'", "'uniform'", "'extern'", "'volatile'", 
		"'shared'", "'groupshared'", "'nointerpolation'", "'precise'", "'const'", 
		"'row_major'", "'column_major'", "'true'", "'false'", "'void'", null, 
		"'cbuffer'", "'struct'", "'if'", "'else'", "'?'", "'for'", "'do'", "'while'", 
		"'continue'", "'break'", "'return'", "'switch'", "'case'", "'defualt'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "':'", "';'", "','", 
		"'#'", null, null, null, "'dot'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "VERSOIN_PROFILE", "CBUFFER", "STRUCT", "IF", 
		"ELSE", "QUESTION", "FOR", "DO", "WHILE", "CONTINUE", "BREAK", "RETURN", 
		"SWITCH", "CASE", "DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "DOT", "COLON", "SEMICOLON", 
		"COMMA", "SHARP", "SEMANTICS", "SHADER_SEMANTICS", "SV_SEMANTICS", "FUNC_KEYWORD", 
		"DECIMAL", "OCTAL", "HEX", "FLOAT_NUM", "SCALA", "VECTOR", "MATRIX", "FLOAT_OPAQUE", 
		"INT_OPAQUE", "U_INT_OPAQUE", "BASIC_OPAQUE_TYPE", "INCREAMENT_OP", "UNARY_OP", 
		"MULDIV_OP", "ADDDIV_OP", "SHIFT_OP", "COMPARE_OP", "EQUAL_OP", "BITWISE_OP", 
		"LOGIC_OP", "ASSIGNMENT_OP", "ARITHMETIC_ASSIGNMENT_OP", "IDENTIFIER", 
		"COMMENT", "WS", "LINE_COMMENT"
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHARP) {
				{
				{
				setState(114);
				preprocessor();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
			setState(122);
			match(SHARP);
			setState(123);
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
			setState(125);
			match(T__0);
			setState(126);
			integer();
			setState(128);
			_la = _input.LA(1);
			if (_la==VERSOIN_PROFILE) {
				{
				setState(127);
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
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(132);
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
					setState(130);
					storage_qualifier();
					}
					break;
				case T__9:
				case T__10:
				case T__11:
					{
					setState(131);
					type_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134); 
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
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterStorage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitStorage_qualifier(this);
		}
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterType_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitType_modifier(this);
		}
	}

	public final Type_modifierContext type_modifier() throws RecognitionException {
		Type_modifierContext _localctx = new Type_modifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 12, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		enterRule(_localctx, 14, RULE_float_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		enterRule(_localctx, 16, RULE_bool_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			type_specifier_nonarray();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(147);
				array_specifier();
				}
				}
				setState(152);
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
		enterRule(_localctx, 20, RULE_type_specifier_nonarray);
		try {
			setState(155);
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
				setState(153);
				basic_type();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
		public TerminalNode LEFT_BRACKET() { return getToken(HLSLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(HLSLParser.RIGHT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 22, RULE_array_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(LEFT_BRACKET);
			setState(159);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (FLOAT_OPAQUE - 13)) | (1L << (INT_OPAQUE - 13)) | (1L << (U_INT_OPAQUE - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
				{
				setState(158);
				expression(0);
				}
			}

			setState(161);
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
		public TerminalNode DOT() { return getToken(HLSLParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterStruct_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitStruct_specifier(this);
		}
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_struct_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(DOT);
			setState(164);
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
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitBasic_type(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_basic_type);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				void_type();
				}
				break;
			case SCALA:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				scala_type();
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				vector_type();
				}
				break;
			case MATRIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				matrix_type();
				}
				break;
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
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
		enterRule(_localctx, 28, RULE_void_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		public TerminalNode SCALA() { return getToken(HLSLParser.SCALA, 0); }
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
		enterRule(_localctx, 30, RULE_scala_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		enterRule(_localctx, 32, RULE_vector_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 34, RULE_matrix_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 36, RULE_opaque_type);
		try {
			setState(184);
			switch (_input.LA(1)) {
			case FLOAT_OPAQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				float_opaque_type();
				}
				break;
			case INT_OPAQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				int_opaque_type();
				}
				break;
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
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
		enterRule(_localctx, 38, RULE_float_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		enterRule(_localctx, 40, RULE_int_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 42, RULE_u_int_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			switch (_input.LA(1)) {
			case INCREAMENT_OP:
				{
				setState(193);
				match(INCREAMENT_OP);
				setState(194);
				expression(11);
				}
				break;
			case ADDDIV_OP:
				{
				setState(195);
				match(ADDDIV_OP);
				setState(196);
				expression(10);
				}
				break;
			case UNARY_OP:
				{
				setState(197);
				match(UNARY_OP);
				setState(198);
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
				setState(199);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(203);
						match(MULDIV_OP);
						setState(204);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(206);
						match(ADDDIV_OP);
						setState(207);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(209);
						match(SHIFT_OP);
						setState(210);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(212);
						match(COMPARE_OP);
						setState(213);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(215);
						match(EQUAL_OP);
						setState(216);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(218);
						match(BITWISE_OP);
						setState(219);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(221);
						match(LOGIC_OP);
						setState(222);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(224);
						match(QUESTION);
						setState(225);
						expression(0);
						setState(226);
						match(COLON);
						setState(227);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(230);
						match(INCREAMENT_OP);
						}
						break;
					}
					} 
				}
				setState(235);
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
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary_expression);
		int _la;
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				constant_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				basic_type();
				setState(238);
				match(LEFT_PAREN);
				setState(247);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (FLOAT_OPAQUE - 13)) | (1L << (INT_OPAQUE - 13)) | (1L << (U_INT_OPAQUE - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
					{
					setState(239);
					expression(0);
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(240);
						match(COMMA);
						setState(241);
						expression(0);
						}
						}
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(249);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(LEFT_PAREN);
				setState(252);
				type_specifier();
				setState(253);
				match(RIGHT_PAREN);
				setState(254);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				left_value();
				setState(258);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(257);
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
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constant_expression);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case DECIMAL:
			case OCTAL:
			case HEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				integer();
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				float_num();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
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
		public TerminalNode LEFT_PAREN() { return getToken(HLSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(HLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public Left_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterLeft_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitLeft_value(this);
		}
	}

	public final Left_valueContext left_value() throws RecognitionException {
		Left_valueContext _localctx = new Left_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_left_value);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(LEFT_PAREN);
				setState(269);
				expression(0);
				setState(270);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
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
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterArray_struct_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitArray_struct_selection(this);
		}
	}

	public final Array_struct_selectionContext array_struct_selection() throws RecognitionException {
		Array_struct_selectionContext _localctx = new Array_struct_selectionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_struct_selection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(277);
					switch (_input.LA(1)) {
					case LEFT_BRACKET:
						{
						setState(275);
						array_specifier();
						}
						break;
					case DOT:
						{
						setState(276);
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
				setState(279); 
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
		enterRule(_localctx, 54, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ASSIGNMENT_OP);
			setState(282);
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
		enterRule(_localctx, 56, RULE_arithmetic_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ARITHMETIC_ASSIGNMENT_OP);
			setState(285);
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
		public TerminalNode COLON() { return getToken(HLSLParser.COLON, 0); }
		public TerminalNode SEMANTICS() { return getToken(HLSLParser.SEMANTICS, 0); }
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
		enterRule(_localctx, 58, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			return_Type();
			setState(288);
			function_name();
			setState(289);
			match(LEFT_PAREN);
			setState(298);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (SCALA - 15)) | (1L << (VECTOR - 15)) | (1L << (MATRIX - 15)) | (1L << (FLOAT_OPAQUE - 15)) | (1L << (INT_OPAQUE - 15)) | (1L << (U_INT_OPAQUE - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(290);
				func_decl_member();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(291);
					match(COMMA);
					setState(292);
					func_decl_member();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(300);
			match(RIGHT_PAREN);
			setState(303);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(301);
				match(COLON);
				setState(302);
				match(SEMANTICS);
				}
			}

			setState(305);
			match(LEFT_BRACE);
			setState(306);
			statement_list();
			setState(307);
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
		public TerminalNode COLON() { return getToken(HLSLParser.COLON, 0); }
		public TerminalNode SEMANTICS() { return getToken(HLSLParser.SEMANTICS, 0); }
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
		enterRule(_localctx, 60, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			return_Type();
			setState(310);
			function_name();
			setState(311);
			match(LEFT_PAREN);
			setState(320);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (SCALA - 15)) | (1L << (VECTOR - 15)) | (1L << (MATRIX - 15)) | (1L << (FLOAT_OPAQUE - 15)) | (1L << (INT_OPAQUE - 15)) | (1L << (U_INT_OPAQUE - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
				{
				setState(312);
				func_decl_member();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(313);
					match(COMMA);
					setState(314);
					func_decl_member();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(322);
			match(RIGHT_PAREN);
			setState(325);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(323);
				match(COLON);
				setState(324);
				match(SEMANTICS);
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
		enterRule(_localctx, 62, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			function_name();
			setState(328);
			match(LEFT_PAREN);
			setState(337);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__13 - 13)) | (1L << (T__14 - 13)) | (1L << (LEFT_PAREN - 13)) | (1L << (FUNC_KEYWORD - 13)) | (1L << (DECIMAL - 13)) | (1L << (OCTAL - 13)) | (1L << (HEX - 13)) | (1L << (FLOAT_NUM - 13)) | (1L << (SCALA - 13)) | (1L << (VECTOR - 13)) | (1L << (MATRIX - 13)) | (1L << (FLOAT_OPAQUE - 13)) | (1L << (INT_OPAQUE - 13)) | (1L << (U_INT_OPAQUE - 13)) | (1L << (INCREAMENT_OP - 13)) | (1L << (UNARY_OP - 13)) | (1L << (ADDDIV_OP - 13)) | (1L << (IDENTIFIER - 13)))) != 0)) {
				{
				setState(329);
				expression(0);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(330);
					match(COMMA);
					setState(331);
					expression(0);
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(339);
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
		enterRule(_localctx, 64, RULE_return_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		public TerminalNode FUNC_KEYWORD() { return getToken(HLSLParser.FUNC_KEYWORD, 0); }
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
		enterRule(_localctx, 66, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		enterRule(_localctx, 68, RULE_func_decl_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			type_specifier();
			setState(346);
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
		enterRule(_localctx, 70, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << CBUFFER) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << DO) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << SWITCH) | (1L << CASE) | (1L << DEFUALT) | (1L << LEFT_PAREN) | (1L << LEFT_BRACE) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(348);
				statement();
				}
				}
				setState(353);
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
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(356);
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
			case CBUFFER:
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
				setState(354);
				simple_statement();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
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
		enterRule(_localctx, 74, RULE_simple_statement);
		try {
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				function_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				basic_statement();
				setState(360);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				switch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				case_label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				iteration_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
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
		enterRule(_localctx, 76, RULE_compoud_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LEFT_BRACE);
			setState(370);
			statement_list();
			setState(371);
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
		enterRule(_localctx, 78, RULE_basic_statement);
		try {
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
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
		public Cbufer_declarationContext cbufer_declaration() {
			return getRuleContext(Cbufer_declarationContext.class,0);
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
		enterRule(_localctx, 80, RULE_declaration_statement);
		try {
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				struct_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				cbufer_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				simple_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
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
		enterRule(_localctx, 82, RULE_simple_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(384);
				type_qualifier();
				}
			}

			setState(387);
			type_specifier();
			setState(388);
			simple_declarator();
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					match(COMMA);
					setState(390);
					simple_declarator();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public TerminalNode COLON() { return getToken(HLSLParser.COLON, 0); }
		public TerminalNode SEMANTICS() { return getToken(HLSLParser.SEMANTICS, 0); }
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
		enterRule(_localctx, 84, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			left_value();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(397);
				array_specifier();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(403);
				match(COLON);
				setState(404);
				match(SEMANTICS);
				}
			}

			setState(408);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(407);
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

	public static class Cbufer_declarationContext extends ParserRuleContext {
		public TerminalNode CBUFFER() { return getToken(HLSLParser.CBUFFER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HLSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(HLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(HLSLParser.RIGHT_BRACE, 0); }
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
		public Cbufer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cbufer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterCbufer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitCbufer_declaration(this);
		}
	}

	public final Cbufer_declarationContext cbufer_declaration() throws RecognitionException {
		Cbufer_declarationContext _localctx = new Cbufer_declarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cbufer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(CBUFFER);
			setState(411);
			match(IDENTIFIER);
			setState(412);
			match(LEFT_BRACE);
			setState(416); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				simple_declaration();
				setState(414);
				match(SEMICOLON);
				}
				}
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(420);
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
		enterRule(_localctx, 88, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(422);
				type_qualifier();
				}
			}

			setState(425);
			match(STRUCT);
			setState(426);
			match(IDENTIFIER);
			setState(427);
			match(LEFT_BRACE);
			setState(431); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(428);
				simple_declaration();
				setState(429);
				match(SEMICOLON);
				}
				}
				setState(433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(435);
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
		enterRule(_localctx, 90, RULE_function_definition_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLSLListener ) ((HLSLListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			left_value();
			setState(441);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET || _la==DOT) {
				{
				setState(440);
				array_struct_selection();
				}
			}

			setState(445);
			switch (_input.LA(1)) {
			case ASSIGNMENT_OP:
				{
				setState(443);
				assignment_expression();
				}
				break;
			case ARITHMETIC_ASSIGNMENT_OP:
				{
				setState(444);
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
		enterRule(_localctx, 94, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		enterRule(_localctx, 96, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(IF);
			setState(450);
			match(LEFT_PAREN);
			setState(451);
			expression(0);
			setState(452);
			match(RIGHT_PAREN);
			setState(453);
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
		enterRule(_localctx, 98, RULE_selection_rest_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			statement();
			setState(458);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(456);
				match(ELSE);
				setState(457);
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
		enterRule(_localctx, 100, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(SWITCH);
			setState(461);
			match(LEFT_PAREN);
			setState(462);
			expression(0);
			setState(463);
			match(RIGHT_PAREN);
			setState(464);
			match(LEFT_BRACE);
			setState(465);
			statement_list();
			setState(466);
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
		enterRule(_localctx, 102, RULE_case_label);
		try {
			setState(474);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(CASE);
				setState(469);
				expression(0);
				setState(470);
				match(COLON);
				}
				break;
			case DEFUALT:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(DEFUALT);
				setState(473);
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
		enterRule(_localctx, 104, RULE_iteration_statement);
		try {
			setState(497);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(WHILE);
				setState(477);
				match(LEFT_PAREN);
				setState(478);
				expression(0);
				setState(479);
				match(RIGHT_PAREN);
				setState(480);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(DO);
				setState(483);
				statement();
				setState(484);
				match(WHILE);
				setState(485);
				match(LEFT_PAREN);
				setState(486);
				expression(0);
				setState(487);
				match(RIGHT_PAREN);
				setState(488);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(FOR);
				setState(491);
				match(LEFT_PAREN);
				setState(492);
				for_init_statement();
				setState(493);
				for_cond_statement();
				setState(494);
				for_rest_statement();
				setState(495);
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
		enterRule(_localctx, 106, RULE_for_init_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << CBUFFER) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				setState(499);
				basic_statement();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(500);
					match(COMMA);
					setState(501);
					basic_statement();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(509);
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
		enterRule(_localctx, 108, RULE_for_cond_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			expression(0);
			setState(512);
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
		enterRule(_localctx, 110, RULE_for_rest_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << CBUFFER) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << FUNC_KEYWORD) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				setState(514);
				basic_statement();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(515);
					match(COMMA);
					setState(516);
					basic_statement();
					}
					}
					setState(521);
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
		enterRule(_localctx, 112, RULE_jump_statement);
		try {
			setState(534);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(CONTINUE);
				setState(525);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(BREAK);
				setState(527);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(RETURN);
				setState(529);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				match(RETURN);
				setState(531);
				expression(0);
				setState(532);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u021b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\7\2v\n\2\f\2\16"+
		"\2y\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u0083\n\4\3\5\3\5\6\5\u0087"+
		"\n\5\r\5\16\5\u0088\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\7\13\u0097\n\13\f\13\16\13\u009a\13\13\3\f\3\f\5\f\u009e\n\f\3\r\3\r"+
		"\5\r\u00a2\n\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ae"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u00bb"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00cb\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u00ea\n\30\f\30\16\30\u00ed\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u00f5\n\31\f\31\16\31\u00f8\13\31\5\31"+
		"\u00fa\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0105\n"+
		"\31\5\31\u0107\n\31\3\32\3\32\3\32\5\32\u010c\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0114\n\33\3\34\3\34\6\34\u0118\n\34\r\34\16\34\u0119"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0128"+
		"\n\37\f\37\16\37\u012b\13\37\5\37\u012d\n\37\3\37\3\37\3\37\5\37\u0132"+
		"\n\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u013e\n \f \16 \u0141\13"+
		" \5 \u0143\n \3 \3 \3 \5 \u0148\n \3!\3!\3!\3!\3!\7!\u014f\n!\f!\16!\u0152"+
		"\13!\5!\u0154\n!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\7%\u0160\n%\f%\16%\u0163"+
		"\13%\3&\3&\5&\u0167\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0172\n"+
		"\'\3(\3(\3(\3(\3)\3)\3)\5)\u017b\n)\3*\3*\3*\3*\5*\u0181\n*\3+\5+\u0184"+
		"\n+\3+\3+\3+\3+\7+\u018a\n+\f+\16+\u018d\13+\3,\3,\7,\u0191\n,\f,\16,"+
		"\u0194\13,\3,\3,\5,\u0198\n,\3,\5,\u019b\n,\3-\3-\3-\3-\3-\3-\6-\u01a3"+
		"\n-\r-\16-\u01a4\3-\3-\3.\5.\u01aa\n.\3.\3.\3.\3.\3.\3.\6.\u01b2\n.\r"+
		".\16.\u01b3\3.\3.\3/\3/\3\60\3\60\5\60\u01bc\n\60\3\60\3\60\5\60\u01c0"+
		"\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5\63\u01cd"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u01dd\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01f4\n\66"+
		"\3\67\3\67\3\67\7\67\u01f9\n\67\f\67\16\67\u01fc\13\67\5\67\u01fe\n\67"+
		"\3\67\3\67\38\38\38\39\39\39\79\u0208\n9\f9\169\u020b\139\59\u020d\n9"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0219\n:\3:\2\3.;\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnpr\2\7\3\2\4\13\3\2\f\16\3\2\60\62\3\2\17\20\4\2//FF\u0230\2w\3\2\2"+
		"\2\4|\3\2\2\2\6\177\3\2\2\2\b\u0086\3\2\2\2\n\u008a\3\2\2\2\f\u008c\3"+
		"\2\2\2\16\u008e\3\2\2\2\20\u0090\3\2\2\2\22\u0092\3\2\2\2\24\u0094\3\2"+
		"\2\2\26\u009d\3\2\2\2\30\u009f\3\2\2\2\32\u00a5\3\2\2\2\34\u00ad\3\2\2"+
		"\2\36\u00af\3\2\2\2 \u00b1\3\2\2\2\"\u00b3\3\2\2\2$\u00b5\3\2\2\2&\u00ba"+
		"\3\2\2\2(\u00bc\3\2\2\2*\u00be\3\2\2\2,\u00c0\3\2\2\2.\u00ca\3\2\2\2\60"+
		"\u0106\3\2\2\2\62\u010b\3\2\2\2\64\u0113\3\2\2\2\66\u0117\3\2\2\28\u011b"+
		"\3\2\2\2:\u011e\3\2\2\2<\u0121\3\2\2\2>\u0137\3\2\2\2@\u0149\3\2\2\2B"+
		"\u0157\3\2\2\2D\u0159\3\2\2\2F\u015b\3\2\2\2H\u0161\3\2\2\2J\u0166\3\2"+
		"\2\2L\u0171\3\2\2\2N\u0173\3\2\2\2P\u017a\3\2\2\2R\u0180\3\2\2\2T\u0183"+
		"\3\2\2\2V\u018e\3\2\2\2X\u019c\3\2\2\2Z\u01a9\3\2\2\2\\\u01b7\3\2\2\2"+
		"^\u01b9\3\2\2\2`\u01c1\3\2\2\2b\u01c3\3\2\2\2d\u01c9\3\2\2\2f\u01ce\3"+
		"\2\2\2h\u01dc\3\2\2\2j\u01f3\3\2\2\2l\u01fd\3\2\2\2n\u0201\3\2\2\2p\u020c"+
		"\3\2\2\2r\u0218\3\2\2\2tv\5\4\3\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2"+
		"\2\2xz\3\2\2\2yw\3\2\2\2z{\5H%\2{\3\3\2\2\2|}\7+\2\2}~\5\6\4\2~\5\3\2"+
		"\2\2\177\u0080\7\3\2\2\u0080\u0082\5\16\b\2\u0081\u0083\7\22\2\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\7\3\2\2\2\u0084\u0087\5\n\6\2"+
		"\u0085\u0087\5\f\7\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\t\3\2\2\2\u008a"+
		"\u008b\t\2\2\2\u008b\13\3\2\2\2\u008c\u008d\t\3\2\2\u008d\r\3\2\2\2\u008e"+
		"\u008f\t\4\2\2\u008f\17\3\2\2\2\u0090\u0091\7\63\2\2\u0091\21\3\2\2\2"+
		"\u0092\u0093\t\5\2\2\u0093\23\3\2\2\2\u0094\u0098\5\26\f\2\u0095\u0097"+
		"\5\30\r\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\25\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009e"+
		"\5\34\17\2\u009c\u009e\7F\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\27\3\2\2\2\u009f\u00a1\7%\2\2\u00a0\u00a2\5.\30\2\u00a1\u00a0\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7&\2\2\u00a4"+
		"\31\3\2\2\2\u00a5\u00a6\7\'\2\2\u00a6\u00a7\5.\30\2\u00a7\33\3\2\2\2\u00a8"+
		"\u00ae\5\36\20\2\u00a9\u00ae\5 \21\2\u00aa\u00ae\5\"\22\2\u00ab\u00ae"+
		"\5$\23\2\u00ac\u00ae\5&\24\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\35\3\2\2"+
		"\2\u00af\u00b0\7\21\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\7\64\2\2\u00b2!\3"+
		"\2\2\2\u00b3\u00b4\7\65\2\2\u00b4#\3\2\2\2\u00b5\u00b6\7\66\2\2\u00b6"+
		"%\3\2\2\2\u00b7\u00bb\5(\25\2\u00b8\u00bb\5*\26\2\u00b9\u00bb\5,\27\2"+
		"\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\'\3"+
		"\2\2\2\u00bc\u00bd\7\67\2\2\u00bd)\3\2\2\2\u00be\u00bf\78\2\2\u00bf+\3"+
		"\2\2\2\u00c0\u00c1\79\2\2\u00c1-\3\2\2\2\u00c2\u00c3\b\30\1\2\u00c3\u00c4"+
		"\7;\2\2\u00c4\u00cb\5.\30\r\u00c5\u00c6\7>\2\2\u00c6\u00cb\5.\30\f\u00c7"+
		"\u00c8\7<\2\2\u00c8\u00cb\5.\30\13\u00c9\u00cb\5\60\31\2\u00ca\u00c2\3"+
		"\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00eb\3\2\2\2\u00cc\u00cd\f\n\2\2\u00cd\u00ce\7=\2\2\u00ce\u00ea\5.\30"+
		"\13\u00cf\u00d0\f\t\2\2\u00d0\u00d1\7>\2\2\u00d1\u00ea\5.\30\n\u00d2\u00d3"+
		"\f\b\2\2\u00d3\u00d4\7?\2\2\u00d4\u00ea\5.\30\t\u00d5\u00d6\f\7\2\2\u00d6"+
		"\u00d7\7@\2\2\u00d7\u00ea\5.\30\b\u00d8\u00d9\f\6\2\2\u00d9\u00da\7A\2"+
		"\2\u00da\u00ea\5.\30\7\u00db\u00dc\f\5\2\2\u00dc\u00dd\7B\2\2\u00dd\u00ea"+
		"\5.\30\6\u00de\u00df\f\4\2\2\u00df\u00e0\7C\2\2\u00e0\u00ea\5.\30\5\u00e1"+
		"\u00e2\f\3\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\5.\30\2\u00e4\u00e5\7"+
		"(\2\2\u00e5\u00e6\5.\30\4\u00e6\u00ea\3\2\2\2\u00e7\u00e8\f\16\2\2\u00e8"+
		"\u00ea\7;\2\2\u00e9\u00cc\3\2\2\2\u00e9\u00cf\3\2\2\2\u00e9\u00d2\3\2"+
		"\2\2\u00e9\u00d5\3\2\2\2\u00e9\u00d8\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9"+
		"\u00de\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec/\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u0107\5\62\32\2\u00ef\u00f0\5\34\17\2\u00f0\u00f9\7!\2"+
		"\2\u00f1\u00f6\5.\30\2\u00f2\u00f3\7*\2\2\u00f3\u00f5\5.\30\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\"\2\2\u00fc\u0107\3\2\2\2\u00fd"+
		"\u00fe\7!\2\2\u00fe\u00ff\5\24\13\2\u00ff\u0100\7\"\2\2\u0100\u0101\5"+
		".\30\2\u0101\u0107\3\2\2\2\u0102\u0104\5\64\33\2\u0103\u0105\5\66\34\2"+
		"\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u00ee"+
		"\3\2\2\2\u0106\u00ef\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u0102\3\2\2\2\u0107"+
		"\61\3\2\2\2\u0108\u010c\5\16\b\2\u0109\u010c\5\20\t\2\u010a\u010c\5\22"+
		"\n\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c"+
		"\63\3\2\2\2\u010d\u0114\5@!\2\u010e\u010f\7!\2\2\u010f\u0110\5.\30\2\u0110"+
		"\u0111\7\"\2\2\u0111\u0114\3\2\2\2\u0112\u0114\7F\2\2\u0113\u010d\3\2"+
		"\2\2\u0113\u010e\3\2\2\2\u0113\u0112\3\2\2\2\u0114\65\3\2\2\2\u0115\u0118"+
		"\5\30\r\2\u0116\u0118\5\32\16\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2"+
		"\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\67"+
		"\3\2\2\2\u011b\u011c\7D\2\2\u011c\u011d\5.\30\2\u011d9\3\2\2\2\u011e\u011f"+
		"\7E\2\2\u011f\u0120\5.\30\2\u0120;\3\2\2\2\u0121\u0122\5B\"\2\u0122\u0123"+
		"\5D#\2\u0123\u012c\7!\2\2\u0124\u0129\5F$\2\u0125\u0126\7*\2\2\u0126\u0128"+
		"\5F$\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0124\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\7\"\2\2\u012f"+
		"\u0130\7(\2\2\u0130\u0132\7,\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0134\7#\2\2\u0134\u0135\5H%\2\u0135\u0136"+
		"\7$\2\2\u0136=\3\2\2\2\u0137\u0138\5B\"\2\u0138\u0139\5D#\2\u0139\u0142"+
		"\7!\2\2\u013a\u013f\5F$\2\u013b\u013c\7*\2\2\u013c\u013e\5F$\2\u013d\u013b"+
		"\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u013a\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0147\7\"\2\2\u0145\u0146\7(\2\2\u0146"+
		"\u0148\7,\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148?\3\2\2\2\u0149"+
		"\u014a\5D#\2\u014a\u0153\7!\2\2\u014b\u0150\5.\30\2\u014c\u014d\7*\2\2"+
		"\u014d\u014f\5.\30\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u014b\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\""+
		"\2\2\u0156A\3\2\2\2\u0157\u0158\5\24\13\2\u0158C\3\2\2\2\u0159\u015a\t"+
		"\6\2\2\u015aE\3\2\2\2\u015b\u015c\5\24\13\2\u015c\u015d\7F\2\2\u015dG"+
		"\3\2\2\2\u015e\u0160\5J&\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162I\3\2\2\2\u0163\u0161\3\2\2\2"+
		"\u0164\u0167\5L\'\2\u0165\u0167\5N(\2\u0166\u0164\3\2\2\2\u0166\u0165"+
		"\3\2\2\2\u0167K\3\2\2\2\u0168\u0172\5\\/\2\u0169\u016a\5P)\2\u016a\u016b"+
		"\7)\2\2\u016b\u0172\3\2\2\2\u016c\u0172\5b\62\2\u016d\u0172\5f\64\2\u016e"+
		"\u0172\5h\65\2\u016f\u0172\5j\66\2\u0170\u0172\5r:\2\u0171\u0168\3\2\2"+
		"\2\u0171\u0169\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016e"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172M\3\2\2\2\u0173"+
		"\u0174\7#\2\2\u0174\u0175\5H%\2\u0175\u0176\7$\2\2\u0176O\3\2\2\2\u0177"+
		"\u017b\5R*\2\u0178\u017b\5^\60\2\u0179\u017b\5`\61\2\u017a\u0177\3\2\2"+
		"\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017bQ\3\2\2\2\u017c\u0181"+
		"\5Z.\2\u017d\u0181\5X-\2\u017e\u0181\5T+\2\u017f\u0181\5> \2\u0180\u017c"+
		"\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"S\3\2\2\2\u0182\u0184\5\b\5\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2"+
		"\u0184\u0185\3\2\2\2\u0185\u0186\5\24\13\2\u0186\u018b\5V,\2\u0187\u0188"+
		"\7*\2\2\u0188\u018a\5V,\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cU\3\2\2\2\u018d\u018b\3\2\2\2"+
		"\u018e\u0192\5\64\33\2\u018f\u0191\5\30\r\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0197\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7(\2\2\u0196\u0198\7,\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b\58\35\2\u019a"+
		"\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019bW\3\2\2\2\u019c\u019d\7\23\2\2"+
		"\u019d\u019e\7F\2\2\u019e\u01a2\7#\2\2\u019f\u01a0\5T+\2\u01a0\u01a1\7"+
		")\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7$"+
		"\2\2\u01a7Y\3\2\2\2\u01a8\u01aa\5\b\5\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\24\2\2\u01ac\u01ad\7F\2\2\u01ad"+
		"\u01b1\7#\2\2\u01ae\u01af\5T+\2\u01af\u01b0\7)\2\2\u01b0\u01b2\3\2\2\2"+
		"\u01b1\u01ae\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7$\2\2\u01b6[\3\2\2\2\u01b7\u01b8"+
		"\5<\37\2\u01b8]\3\2\2\2\u01b9\u01bb\5\64\33\2\u01ba\u01bc\5\66\34\2\u01bb"+
		"\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01c0\58"+
		"\35\2\u01be\u01c0\5:\36\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"_\3\2\2\2\u01c1\u01c2\5.\30\2\u01c2a\3\2\2\2\u01c3\u01c4\7\25\2\2\u01c4"+
		"\u01c5\7!\2\2\u01c5\u01c6\5.\30\2\u01c6\u01c7\7\"\2\2\u01c7\u01c8\5d\63"+
		"\2\u01c8c\3\2\2\2\u01c9\u01cc\5J&\2\u01ca\u01cb\7\26\2\2\u01cb\u01cd\5"+
		"J&\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cde\3\2\2\2\u01ce\u01cf"+
		"\7\36\2\2\u01cf\u01d0\7!\2\2\u01d0\u01d1\5.\30\2\u01d1\u01d2\7\"\2\2\u01d2"+
		"\u01d3\7#\2\2\u01d3\u01d4\5H%\2\u01d4\u01d5\7$\2\2\u01d5g\3\2\2\2\u01d6"+
		"\u01d7\7\37\2\2\u01d7\u01d8\5.\30\2\u01d8\u01d9\7(\2\2\u01d9\u01dd\3\2"+
		"\2\2\u01da\u01db\7 \2\2\u01db\u01dd\7(\2\2\u01dc\u01d6\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01ddi\3\2\2\2\u01de\u01df\7\32\2\2\u01df\u01e0\7!\2\2\u01e0"+
		"\u01e1\5.\30\2\u01e1\u01e2\7\"\2\2\u01e2\u01e3\5J&\2\u01e3\u01f4\3\2\2"+
		"\2\u01e4\u01e5\7\31\2\2\u01e5\u01e6\5J&\2\u01e6\u01e7\7\32\2\2\u01e7\u01e8"+
		"\7!\2\2\u01e8\u01e9\5.\30\2\u01e9\u01ea\7\"\2\2\u01ea\u01eb\7)\2\2\u01eb"+
		"\u01f4\3\2\2\2\u01ec\u01ed\7\30\2\2\u01ed\u01ee\7!\2\2\u01ee\u01ef\5l"+
		"\67\2\u01ef\u01f0\5n8\2\u01f0\u01f1\5p9\2\u01f1\u01f2\7\"\2\2\u01f2\u01f4"+
		"\3\2\2\2\u01f3\u01de\3\2\2\2\u01f3\u01e4\3\2\2\2\u01f3\u01ec\3\2\2\2\u01f4"+
		"k\3\2\2\2\u01f5\u01fa\5P)\2\u01f6\u01f7\7*\2\2\u01f7\u01f9\5P)\2\u01f8"+
		"\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01f5\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7)\2\2\u0200m\3\2\2\2\u0201"+
		"\u0202\5.\30\2\u0202\u0203\7)\2\2\u0203o\3\2\2\2\u0204\u0209\5P)\2\u0205"+
		"\u0206\7*\2\2\u0206\u0208\5P)\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2"+
		"\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209"+
		"\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u020d\3\2\2\2\u020dq\3\2\2\2\u020e"+
		"\u020f\7\33\2\2\u020f\u0219\7)\2\2\u0210\u0211\7\34\2\2\u0211\u0219\7"+
		")\2\2\u0212\u0213\7\35\2\2\u0213\u0219\7)\2\2\u0214\u0215\7\35\2\2\u0215"+
		"\u0216\5.\30\2\u0216\u0217\7)\2\2\u0217\u0219\3\2\2\2\u0218\u020e\3\2"+
		"\2\2\u0218\u0210\3\2\2\2\u0218\u0212\3\2\2\2\u0218\u0214\3\2\2\2\u0219"+
		"s\3\2\2\2\65w\u0082\u0086\u0088\u0098\u009d\u00a1\u00ad\u00ba\u00ca\u00e9"+
		"\u00eb\u00f6\u00f9\u0104\u0106\u010b\u0113\u0117\u0119\u0129\u012c\u0131"+
		"\u013f\u0142\u0147\u0150\u0153\u0161\u0166\u0171\u017a\u0180\u0183\u018b"+
		"\u0192\u0197\u019a\u01a4\u01a9\u01b3\u01bb\u01bf\u01cc\u01dc\u01f3\u01fa"+
		"\u01fd\u0209\u020c\u0218";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}