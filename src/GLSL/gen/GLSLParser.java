// Generated from D:/antlr4/ShaderParser/src/GLSL\GLSL.g4 by ANTLR 4.5.1
package GLSL.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, VERSOIN_PROFILE=20, STRUCT=21, IF=22, ELSE=23, QUESTION=24, 
		FOR=25, DO=26, WHILE=27, CONTINUE=28, BREAK=29, RETURN=30, SWITCH=31, 
		CASE=32, DEFUALT=33, LEFT_PAREN=34, RIGHT_PAREN=35, LEFT_BRACE=36, RIGHT_BRACE=37, 
		LEFT_BRACKET=38, RIGHT_BRACKET=39, DOT=40, COLON=41, SEMICOLON=42, COMMA=43, 
		SHARP=44, DECIMAL=45, OCTAL=46, HEX=47, FLOAT_NUM=48, SCALA=49, VECTOR=50, 
		MATRIX=51, FLOAT_OPAQUE=52, INT_OPAQUE=53, U_INT_OPAQUE=54, BASIC_OPAQUE_TYPE=55, 
		INCREAMENT_OP=56, UNARY_OP=57, MULDIV_OP=58, ADDDIV_OP=59, SHIFT_OP=60, 
		COMPARE_OP=61, EQUAL_OP=62, BITWISE_OP=63, LOGIC_OP=64, ASSIGNMENT_OP=65, 
		ARITHMETIC_ASSIGNMENT_OP=66, IDENTIFIER=67, COMMENT=68, WS=69, LINE_COMMENT=70;
	public static final int
		RULE_prog = 0, RULE_preprocessor = 1, RULE_version_pre = 2, RULE_type_qualifier = 3, 
		RULE_layout_qualifier = 4, RULE_layout_qualifier_id = 5, RULE_storage_qualifier = 6, 
		RULE_precision_qualifier = 7, RULE_interpolation_qualifier = 8, RULE_invariant_qualifier = 9, 
		RULE_precise_qualifier = 10, RULE_integer = 11, RULE_float_num = 12, RULE_bool_num = 13, 
		RULE_type_specifier = 14, RULE_type_specifier_nonarray = 15, RULE_array_specifier = 16, 
		RULE_struct_specifier = 17, RULE_basic_type = 18, RULE_void_type = 19, 
		RULE_scala_type = 20, RULE_vector_type = 21, RULE_matrix_type = 22, RULE_opaque_type = 23, 
		RULE_float_opaque_type = 24, RULE_int_opaque_type = 25, RULE_u_int_opaque_type = 26, 
		RULE_expression = 27, RULE_primary_expression = 28, RULE_constant_expression = 29, 
		RULE_left_value = 30, RULE_array_struct_selection = 31, RULE_assignment_expression = 32, 
		RULE_arithmetic_assignment_expression = 33, RULE_function_definition = 34, 
		RULE_function_declaration = 35, RULE_function_call = 36, RULE_return_Type = 37, 
		RULE_function_name = 38, RULE_func_decl_member = 39, RULE_statement_list = 40, 
		RULE_statement = 41, RULE_simple_statement = 42, RULE_compoud_statement = 43, 
		RULE_basic_statement = 44, RULE_declaration_statement = 45, RULE_simple_declaration = 46, 
		RULE_simple_declarator = 47, RULE_struct_declaration = 48, RULE_function_definition_statement = 49, 
		RULE_assignment_statement = 50, RULE_expression_statement = 51, RULE_selection_statement = 52, 
		RULE_selection_rest_statement = 53, RULE_switch_statement = 54, RULE_case_label = 55, 
		RULE_iteration_statement = 56, RULE_for_init_statement = 57, RULE_for_cond_statement = 58, 
		RULE_for_rest_statement = 59, RULE_jump_statement = 60;
	public static final String[] ruleNames = {
		"prog", "preprocessor", "version_pre", "type_qualifier", "layout_qualifier", 
		"layout_qualifier_id", "storage_qualifier", "precision_qualifier", "interpolation_qualifier", 
		"invariant_qualifier", "precise_qualifier", "integer", "float_num", "bool_num", 
		"type_specifier", "type_specifier_nonarray", "array_specifier", "struct_specifier", 
		"basic_type", "void_type", "scala_type", "vector_type", "matrix_type", 
		"opaque_type", "float_opaque_type", "int_opaque_type", "u_int_opaque_type", 
		"expression", "primary_expression", "constant_expression", "left_value", 
		"array_struct_selection", "assignment_expression", "arithmetic_assignment_expression", 
		"function_definition", "function_declaration", "function_call", "return_Type", 
		"function_name", "func_decl_member", "statement_list", "statement", "simple_statement", 
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
		"'false'", "'void'", null, "'struct'", "'if'", "'else'", "'?'", "'for'", 
		"'do'", "'while'", "'continue'", "'break'", "'return'", "'switch'", "'case'", 
		"'defualt'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "':'", "';'", 
		"','", "'#'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "VERSOIN_PROFILE", "STRUCT", 
		"IF", "ELSE", "QUESTION", "FOR", "DO", "WHILE", "CONTINUE", "BREAK", "RETURN", 
		"SWITCH", "CASE", "DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "DOT", "COLON", "SEMICOLON", 
		"COMMA", "SHARP", "DECIMAL", "OCTAL", "HEX", "FLOAT_NUM", "SCALA", "VECTOR", 
		"MATRIX", "FLOAT_OPAQUE", "INT_OPAQUE", "U_INT_OPAQUE", "BASIC_OPAQUE_TYPE", 
		"INCREAMENT_OP", "UNARY_OP", "MULDIV_OP", "ADDDIV_OP", "SHIFT_OP", "COMPARE_OP", 
		"EQUAL_OP", "BITWISE_OP", "LOGIC_OP", "ASSIGNMENT_OP", "ARITHMETIC_ASSIGNMENT_OP", 
		"IDENTIFIER", "COMMENT", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "GLSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GLSLParser(TokenStream input) {
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitProg(this);
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
			setState(128);
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
		public TerminalNode SHARP() { return getToken(GLSLParser.SHARP, 0); }
		public Version_preContext version_pre() {
			return getRuleContext(Version_preContext.class,0);
		}
		public PreprocessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterPreprocessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitPreprocessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitPreprocessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreprocessorContext preprocessor() throws RecognitionException {
		PreprocessorContext _localctx = new PreprocessorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preprocessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(SHARP);
			setState(131);
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
		public TerminalNode VERSOIN_PROFILE() { return getToken(GLSLParser.VERSOIN_PROFILE, 0); }
		public Version_preContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterVersion_pre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitVersion_pre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitVersion_pre(this);
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
			setState(133);
			match(T__0);
			setState(134);
			integer();
			setState(136);
			_la = _input.LA(1);
			if (_la==VERSOIN_PROFILE) {
				{
				setState(135);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitType_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitType_qualifier(this);
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
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(144);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
					{
					setState(138);
					storage_qualifier();
					}
					break;
				case T__1:
					{
					setState(139);
					layout_qualifier();
					}
					break;
				case T__8:
				case T__9:
				case T__10:
					{
					setState(140);
					precision_qualifier();
					}
					break;
				case T__11:
				case T__12:
				case T__13:
					{
					setState(141);
					interpolation_qualifier();
					}
					break;
				case T__14:
					{
					setState(142);
					invariant_qualifier();
					}
					break;
				case T__15:
					{
					setState(143);
					precise_qualifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146); 
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
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Layout_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterLayout_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitLayout_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitLayout_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Layout_qualifierContext layout_qualifier() throws RecognitionException {
		Layout_qualifierContext _localctx = new Layout_qualifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_layout_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__1);
			setState(149);
			layout_qualifier_id();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				layout_qualifier_id();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Layout_qualifier_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout_qualifier_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterLayout_qualifier_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitLayout_qualifier_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitLayout_qualifier_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Layout_qualifier_idContext layout_qualifier_id() throws RecognitionException {
		Layout_qualifier_idContext _localctx = new Layout_qualifier_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_layout_qualifier_id);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(IDENTIFIER);
				setState(161);
				match(ASSIGNMENT_OP);
				setState(162);
				constant_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStorage_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStorage_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitStorage_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_qualifierContext storage_qualifier() throws RecognitionException {
		Storage_qualifierContext _localctx = new Storage_qualifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_storage_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterPrecision_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitPrecision_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitPrecision_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precision_qualifierContext precision_qualifier() throws RecognitionException {
		Precision_qualifierContext _localctx = new Precision_qualifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_precision_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterInterpolation_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitInterpolation_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitInterpolation_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolation_qualifierContext interpolation_qualifier() throws RecognitionException {
		Interpolation_qualifierContext _localctx = new Interpolation_qualifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interpolation_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterInvariant_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitInvariant_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitInvariant_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invariant_qualifierContext invariant_qualifier() throws RecognitionException {
		Invariant_qualifierContext _localctx = new Invariant_qualifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_invariant_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterPrecise_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitPrecise_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitPrecise_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precise_qualifierContext precise_qualifier() throws RecognitionException {
		Precise_qualifierContext _localctx = new Precise_qualifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_precise_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		public TerminalNode DECIMAL() { return getToken(GLSLParser.DECIMAL, 0); }
		public TerminalNode OCTAL() { return getToken(GLSLParser.OCTAL, 0); }
		public TerminalNode HEX() { return getToken(GLSLParser.HEX, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		public TerminalNode FLOAT_NUM() { return getToken(GLSLParser.FLOAT_NUM, 0); }
		public Float_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFloat_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFloat_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFloat_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_numContext float_num() throws RecognitionException {
		Float_numContext _localctx = new Float_numContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_float_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterBool_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitBool_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitBool_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_numContext bool_num() throws RecognitionException {
		Bool_numContext _localctx = new Bool_numContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitType_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			type_specifier_nonarray();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(183);
				array_specifier();
				}
				}
				setState(188);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Type_specifier_nonarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier_nonarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterType_specifier_nonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitType_specifier_nonarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitType_specifier_nonarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifier_nonarrayContext type_specifier_nonarray() throws RecognitionException {
		Type_specifier_nonarrayContext _localctx = new Type_specifier_nonarrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_specifier_nonarray);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case T__18:
			case SCALA:
			case VECTOR:
			case MATRIX:
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				basic_type();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
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
		public TerminalNode LEFT_BRACKET() { return getToken(GLSLParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(GLSLParser.RIGHT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterArray_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitArray_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitArray_specifier(this);
			else return visitor.visitChildren(this);
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
			match(LEFT_BRACKET);
			setState(195);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (LEFT_PAREN - 17)) | (1L << (DECIMAL - 17)) | (1L << (OCTAL - 17)) | (1L << (HEX - 17)) | (1L << (FLOAT_NUM - 17)) | (1L << (SCALA - 17)) | (1L << (VECTOR - 17)) | (1L << (MATRIX - 17)) | (1L << (FLOAT_OPAQUE - 17)) | (1L << (INT_OPAQUE - 17)) | (1L << (U_INT_OPAQUE - 17)) | (1L << (INCREAMENT_OP - 17)) | (1L << (UNARY_OP - 17)) | (1L << (ADDDIV_OP - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
				{
				setState(194);
				expression(0);
				}
			}

			setState(197);
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
		public TerminalNode DOT() { return getToken(GLSLParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStruct_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStruct_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitStruct_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_struct_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(DOT);
			setState(200);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitBasic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitBasic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_basic_type);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				void_type();
				}
				break;
			case SCALA:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				scala_type();
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				vector_type();
				}
				break;
			case MATRIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				matrix_type();
				}
				break;
			case FLOAT_OPAQUE:
			case INT_OPAQUE:
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterVoid_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitVoid_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitVoid_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void_typeContext void_type() throws RecognitionException {
		Void_typeContext _localctx = new Void_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_void_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		public TerminalNode SCALA() { return getToken(GLSLParser.SCALA, 0); }
		public Scala_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterScala_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitScala_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitScala_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scala_typeContext scala_type() throws RecognitionException {
		Scala_typeContext _localctx = new Scala_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scala_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		public TerminalNode VECTOR() { return getToken(GLSLParser.VECTOR, 0); }
		public Vector_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterVector_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitVector_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitVector_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector_typeContext vector_type() throws RecognitionException {
		Vector_typeContext _localctx = new Vector_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_vector_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		public TerminalNode MATRIX() { return getToken(GLSLParser.MATRIX, 0); }
		public Matrix_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterMatrix_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitMatrix_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitMatrix_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_typeContext matrix_type() throws RecognitionException {
		Matrix_typeContext _localctx = new Matrix_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_matrix_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterOpaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitOpaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitOpaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opaque_typeContext opaque_type() throws RecognitionException {
		Opaque_typeContext _localctx = new Opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opaque_type);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case FLOAT_OPAQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				float_opaque_type();
				}
				break;
			case INT_OPAQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				int_opaque_type();
				}
				break;
			case U_INT_OPAQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
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
		public TerminalNode FLOAT_OPAQUE() { return getToken(GLSLParser.FLOAT_OPAQUE, 0); }
		public Float_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFloat_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFloat_opaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFloat_opaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_opaque_typeContext float_opaque_type() throws RecognitionException {
		Float_opaque_typeContext _localctx = new Float_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_float_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		public TerminalNode INT_OPAQUE() { return getToken(GLSLParser.INT_OPAQUE, 0); }
		public Int_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterInt_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitInt_opaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitInt_opaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_opaque_typeContext int_opaque_type() throws RecognitionException {
		Int_opaque_typeContext _localctx = new Int_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_int_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		public TerminalNode U_INT_OPAQUE() { return getToken(GLSLParser.U_INT_OPAQUE, 0); }
		public U_int_opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u_int_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterU_int_opaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitU_int_opaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitU_int_opaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final U_int_opaque_typeContext u_int_opaque_type() throws RecognitionException {
		U_int_opaque_typeContext _localctx = new U_int_opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_u_int_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		public TerminalNode INCREAMENT_OP() { return getToken(GLSLParser.INCREAMENT_OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADDDIV_OP() { return getToken(GLSLParser.ADDDIV_OP, 0); }
		public TerminalNode UNARY_OP() { return getToken(GLSLParser.UNARY_OP, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode MULDIV_OP() { return getToken(GLSLParser.MULDIV_OP, 0); }
		public TerminalNode SHIFT_OP() { return getToken(GLSLParser.SHIFT_OP, 0); }
		public TerminalNode COMPARE_OP() { return getToken(GLSLParser.COMPARE_OP, 0); }
		public TerminalNode EQUAL_OP() { return getToken(GLSLParser.EQUAL_OP, 0); }
		public TerminalNode BITWISE_OP() { return getToken(GLSLParser.BITWISE_OP, 0); }
		public TerminalNode LOGIC_OP() { return getToken(GLSLParser.LOGIC_OP, 0); }
		public TerminalNode QUESTION() { return getToken(GLSLParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			switch (_input.LA(1)) {
			case INCREAMENT_OP:
				{
				setState(229);
				match(INCREAMENT_OP);
				setState(230);
				expression(11);
				}
				break;
			case ADDDIV_OP:
				{
				setState(231);
				match(ADDDIV_OP);
				setState(232);
				expression(10);
				}
				break;
			case UNARY_OP:
				{
				setState(233);
				match(UNARY_OP);
				setState(234);
				expression(9);
				}
				break;
			case T__16:
			case T__17:
			case T__18:
			case LEFT_PAREN:
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
				setState(235);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(239);
						match(MULDIV_OP);
						setState(240);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(242);
						match(ADDDIV_OP);
						setState(243);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(245);
						match(SHIFT_OP);
						setState(246);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(248);
						match(COMPARE_OP);
						setState(249);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(251);
						match(EQUAL_OP);
						setState(252);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(254);
						match(BITWISE_OP);
						setState(255);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(257);
						match(LOGIC_OP);
						setState(258);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(260);
						match(QUESTION);
						setState(261);
						expression(0);
						setState(262);
						match(COLON);
						setState(263);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(266);
						match(INCREAMENT_OP);
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primary_expression);
		int _la;
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				constant_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				basic_type();
				setState(274);
				match(LEFT_PAREN);
				setState(283);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (LEFT_PAREN - 17)) | (1L << (DECIMAL - 17)) | (1L << (OCTAL - 17)) | (1L << (HEX - 17)) | (1L << (FLOAT_NUM - 17)) | (1L << (SCALA - 17)) | (1L << (VECTOR - 17)) | (1L << (MATRIX - 17)) | (1L << (FLOAT_OPAQUE - 17)) | (1L << (INT_OPAQUE - 17)) | (1L << (U_INT_OPAQUE - 17)) | (1L << (INCREAMENT_OP - 17)) | (1L << (UNARY_OP - 17)) | (1L << (ADDDIV_OP - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
					{
					setState(275);
					expression(0);
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(276);
						match(COMMA);
						setState(277);
						expression(0);
						}
						}
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(285);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(LEFT_PAREN);
				setState(288);
				type_specifier();
				setState(289);
				match(RIGHT_PAREN);
				setState(290);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				left_value();
				setState(294);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(293);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant_expression);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case DECIMAL:
			case OCTAL:
			case HEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				integer();
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				float_num();
				}
				break;
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
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
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Left_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterLeft_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitLeft_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitLeft_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_valueContext left_value() throws RecognitionException {
		Left_valueContext _localctx = new Left_valueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_left_value);
		try {
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(LEFT_PAREN);
				setState(305);
				expression(0);
				setState(306);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterArray_struct_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitArray_struct_selection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitArray_struct_selection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_struct_selectionContext array_struct_selection() throws RecognitionException {
		Array_struct_selectionContext _localctx = new Array_struct_selectionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array_struct_selection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(313);
					switch (_input.LA(1)) {
					case LEFT_BRACKET:
						{
						setState(311);
						array_specifier();
						}
						break;
					case DOT:
						{
						setState(312);
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
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public TerminalNode ASSIGNMENT_OP() { return getToken(GLSLParser.ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(ASSIGNMENT_OP);
			setState(318);
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
		public TerminalNode ARITHMETIC_ASSIGNMENT_OP() { return getToken(GLSLParser.ARITHMETIC_ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arithmetic_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterArithmetic_assignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitArithmetic_assignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitArithmetic_assignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_assignment_expressionContext arithmetic_assignment_expression() throws RecognitionException {
		Arithmetic_assignment_expressionContext _localctx = new Arithmetic_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arithmetic_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(ARITHMETIC_ASSIGNMENT_OP);
			setState(321);
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
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public List<Func_decl_memberContext> func_decl_member() {
			return getRuleContexts(Func_decl_memberContext.class);
		}
		public Func_decl_memberContext func_decl_member(int i) {
			return getRuleContext(Func_decl_memberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			return_Type();
			setState(324);
			function_name();
			setState(325);
			match(LEFT_PAREN);
			setState(334);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (SCALA - 19)) | (1L << (VECTOR - 19)) | (1L << (MATRIX - 19)) | (1L << (FLOAT_OPAQUE - 19)) | (1L << (INT_OPAQUE - 19)) | (1L << (U_INT_OPAQUE - 19)) | (1L << (IDENTIFIER - 19)))) != 0)) {
				{
				setState(326);
				func_decl_member();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(327);
					match(COMMA);
					setState(328);
					func_decl_member();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(336);
			match(RIGHT_PAREN);
			setState(337);
			match(LEFT_BRACE);
			setState(338);
			statement_list();
			setState(339);
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
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public List<Func_decl_memberContext> func_decl_member() {
			return getRuleContexts(Func_decl_memberContext.class);
		}
		public Func_decl_memberContext func_decl_member(int i) {
			return getRuleContext(Func_decl_memberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			return_Type();
			setState(342);
			function_name();
			setState(343);
			match(LEFT_PAREN);
			setState(352);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (SCALA - 19)) | (1L << (VECTOR - 19)) | (1L << (MATRIX - 19)) | (1L << (FLOAT_OPAQUE - 19)) | (1L << (INT_OPAQUE - 19)) | (1L << (U_INT_OPAQUE - 19)) | (1L << (IDENTIFIER - 19)))) != 0)) {
				{
				setState(344);
				func_decl_member();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(345);
					match(COMMA);
					setState(346);
					func_decl_member();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(354);
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
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			function_name();
			setState(357);
			match(LEFT_PAREN);
			setState(366);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__18 - 17)) | (1L << (LEFT_PAREN - 17)) | (1L << (DECIMAL - 17)) | (1L << (OCTAL - 17)) | (1L << (HEX - 17)) | (1L << (FLOAT_NUM - 17)) | (1L << (SCALA - 17)) | (1L << (VECTOR - 17)) | (1L << (MATRIX - 17)) | (1L << (FLOAT_OPAQUE - 17)) | (1L << (INT_OPAQUE - 17)) | (1L << (U_INT_OPAQUE - 17)) | (1L << (INCREAMENT_OP - 17)) | (1L << (UNARY_OP - 17)) | (1L << (ADDDIV_OP - 17)) | (1L << (IDENTIFIER - 17)))) != 0)) {
				{
				setState(358);
				expression(0);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(359);
					match(COMMA);
					setState(360);
					expression(0);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(368);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterReturn_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitReturn_Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitReturn_Type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_TypeContext return_Type() throws RecognitionException {
		Return_TypeContext _localctx = new Return_TypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_return_Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public Func_decl_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunc_decl_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunc_decl_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFunc_decl_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_decl_memberContext func_decl_member() throws RecognitionException {
		Func_decl_memberContext _localctx = new Func_decl_memberContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_func_decl_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			type_specifier();
			setState(375);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << STRUCT) | (1L << IF) | (1L << FOR) | (1L << DO) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << SWITCH) | (1L << CASE) | (1L << DEFUALT) | (1L << LEFT_PAREN) | (1L << LEFT_BRACE) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(377);
				statement();
				}
				}
				setState(382);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_statement);
		try {
			setState(385);
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
				setState(383);
				simple_statement();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
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
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simple_statement);
		try {
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				function_definition_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				basic_statement();
				setState(389);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				selection_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				switch_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				case_label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				iteration_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(395);
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
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public Compoud_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoud_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterCompoud_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitCompoud_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitCompoud_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compoud_statementContext compoud_statement() throws RecognitionException {
		Compoud_statementContext _localctx = new Compoud_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_compoud_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(LEFT_BRACE);
			setState(399);
			statement_list();
			setState(400);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterBasic_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitBasic_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitBasic_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_statementContext basic_statement() throws RecognitionException {
		Basic_statementContext _localctx = new Basic_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_basic_statement);
		try {
			setState(405);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				declaration_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitDeclaration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitDeclaration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_declaration_statement);
		try {
			setState(410);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				struct_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				simple_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
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
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSimple_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSimple_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitSimple_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_simple_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(412);
				type_qualifier();
				}
			}

			setState(415);
			type_specifier();
			setState(416);
			simple_declarator();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					match(COMMA);
					setState(418);
					simple_declarator();
					}
					} 
				}
				setState(423);
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
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSimple_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSimple_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitSimple_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			left_value();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(425);
				array_specifier();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(431);
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
		public TerminalNode STRUCT() { return getToken(GLSLParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GLSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GLSLParser.SEMICOLON, i);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(434);
				type_qualifier();
				}
			}

			setState(437);
			match(STRUCT);
			setState(438);
			match(IDENTIFIER);
			setState(439);
			match(LEFT_BRACE);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(440);
				simple_declaration();
				setState(441);
				match(SEMICOLON);
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE))) != 0) || _la==IDENTIFIER );
			setState(447);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFunction_definition_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFunction_definition_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFunction_definition_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definition_statementContext function_definition_statement() throws RecognitionException {
		Function_definition_statementContext _localctx = new Function_definition_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_function_definition_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			left_value();
			setState(453);
			_la = _input.LA(1);
			if (_la==LEFT_BRACKET || _la==DOT) {
				{
				setState(452);
				array_struct_selection();
				}
			}

			setState(457);
			switch (_input.LA(1)) {
			case ASSIGNMENT_OP:
				{
				setState(455);
				assignment_expression();
				}
				break;
			case ARITHMETIC_ASSIGNMENT_OP:
				{
				setState(456);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		public TerminalNode IF() { return getToken(GLSLParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public Selection_rest_statementContext selection_rest_statement() {
			return getRuleContext(Selection_rest_statementContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSelection_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(IF);
			setState(462);
			match(LEFT_PAREN);
			setState(463);
			expression(0);
			setState(464);
			match(RIGHT_PAREN);
			setState(465);
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
		public TerminalNode ELSE() { return getToken(GLSLParser.ELSE, 0); }
		public Selection_rest_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_rest_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSelection_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSelection_rest_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitSelection_rest_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_rest_statementContext selection_rest_statement() throws RecognitionException {
		Selection_rest_statementContext _localctx = new Selection_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selection_rest_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			statement();
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(468);
				match(ELSE);
				setState(469);
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
		public TerminalNode SWITCH() { return getToken(GLSLParser.SWITCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(GLSLParser.LEFT_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GLSLParser.RIGHT_BRACE, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(SWITCH);
			setState(473);
			match(LEFT_PAREN);
			setState(474);
			expression(0);
			setState(475);
			match(RIGHT_PAREN);
			setState(476);
			match(LEFT_BRACE);
			setState(477);
			statement_list();
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

	public static class Case_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GLSLParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public TerminalNode DEFUALT() { return getToken(GLSLParser.DEFUALT, 0); }
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_case_label);
		try {
			setState(486);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(CASE);
				setState(481);
				expression(0);
				setState(482);
				match(COLON);
				}
				break;
			case DEFUALT:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(DEFUALT);
				setState(485);
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
		public TerminalNode WHILE() { return getToken(GLSLParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(GLSLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(GLSLParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(GLSLParser.DO, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode FOR() { return getToken(GLSLParser.FOR, 0); }
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitIteration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitIteration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_iteration_statement);
		try {
			setState(509);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(WHILE);
				setState(489);
				match(LEFT_PAREN);
				setState(490);
				expression(0);
				setState(491);
				match(RIGHT_PAREN);
				setState(492);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(DO);
				setState(495);
				statement();
				setState(496);
				match(WHILE);
				setState(497);
				match(LEFT_PAREN);
				setState(498);
				expression(0);
				setState(499);
				match(RIGHT_PAREN);
				setState(500);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				match(FOR);
				setState(503);
				match(LEFT_PAREN);
				setState(504);
				for_init_statement();
				setState(505);
				for_cond_statement();
				setState(506);
				for_rest_statement();
				setState(507);
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
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFor_init_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFor_init_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_for_init_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				setState(511);
				basic_statement();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(512);
					match(COMMA);
					setState(513);
					basic_statement();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(521);
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
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public For_cond_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cond_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFor_cond_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFor_cond_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFor_cond_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cond_statementContext for_cond_statement() throws RecognitionException {
		For_cond_statementContext _localctx = new For_cond_statementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_for_cond_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			expression(0);
			setState(524);
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
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterFor_rest_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitFor_rest_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitFor_rest_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rest_statementContext for_rest_statement() throws RecognitionException {
		For_rest_statementContext _localctx = new For_rest_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_for_rest_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << STRUCT) | (1L << LEFT_PAREN) | (1L << DECIMAL) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT_NUM) | (1L << SCALA) | (1L << VECTOR) | (1L << MATRIX) | (1L << FLOAT_OPAQUE) | (1L << INT_OPAQUE) | (1L << U_INT_OPAQUE) | (1L << INCREAMENT_OP) | (1L << UNARY_OP) | (1L << ADDDIV_OP))) != 0) || _la==IDENTIFIER) {
				{
				setState(526);
				basic_statement();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(527);
					match(COMMA);
					setState(528);
					basic_statement();
					}
					}
					setState(533);
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
		public TerminalNode CONTINUE() { return getToken(GLSLParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(GLSLParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(GLSLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLListener ) ((GLSLListener)listener).exitJump_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLVisitor ) return ((GLSLVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_jump_statement);
		try {
			setState(546);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(CONTINUE);
				setState(537);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(BREAK);
				setState(539);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				match(RETURN);
				setState(541);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				match(RETURN);
				setState(543);
				expression(0);
				setState(544);
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
		case 27:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u0227\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\7\2~\n\2\f\2\16\2\u0081\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\5\4\u008b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0093\n\5\r\5\16\5\u0094"+
		"\3\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00a7\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20\u00bb\n\20\f\20\16\20\u00be\13\20"+
		"\3\21\3\21\5\21\u00c2\n\21\3\22\3\22\5\22\u00c6\n\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d2\n\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\5\31\u00df\n\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ef\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u010e\n\35\f\35\16\35\u0111\13\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0119\n\36\f\36\16\36\u011c\13\36\5\36\u011e\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0129\n\36\5\36\u012b\n\36\3\37\3"+
		"\37\3\37\5\37\u0130\n\37\3 \3 \3 \3 \3 \3 \5 \u0138\n \3!\3!\6!\u013c"+
		"\n!\r!\16!\u013d\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\7$\u014c\n$\f"+
		"$\16$\u014f\13$\5$\u0151\n$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\7%\u015e"+
		"\n%\f%\16%\u0161\13%\5%\u0163\n%\3%\3%\3&\3&\3&\3&\3&\7&\u016c\n&\f&\16"+
		"&\u016f\13&\5&\u0171\n&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\7*\u017d\n*\f"+
		"*\16*\u0180\13*\3+\3+\5+\u0184\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u018f"+
		"\n,\3-\3-\3-\3-\3.\3.\3.\5.\u0198\n.\3/\3/\3/\5/\u019d\n/\3\60\5\60\u01a0"+
		"\n\60\3\60\3\60\3\60\3\60\7\60\u01a6\n\60\f\60\16\60\u01a9\13\60\3\61"+
		"\3\61\7\61\u01ad\n\61\f\61\16\61\u01b0\13\61\3\61\5\61\u01b3\n\61\3\62"+
		"\5\62\u01b6\n\62\3\62\3\62\3\62\3\62\3\62\3\62\6\62\u01be\n\62\r\62\16"+
		"\62\u01bf\3\62\3\62\3\63\3\63\3\64\3\64\5\64\u01c8\n\64\3\64\3\64\5\64"+
		"\u01cc\n\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67"+
		"\u01d9\n\67\38\38\38\38\38\38\38\38\39\39\39\39\39\39\59\u01e9\n9\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0200\n"+
		":\3;\3;\3;\7;\u0205\n;\f;\16;\u0208\13;\5;\u020a\n;\3;\3;\3<\3<\3<\3="+
		"\3=\3=\7=\u0214\n=\f=\16=\u0217\13=\5=\u0219\n=\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\5>\u0225\n>\3>\2\38?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\7\3\2\5\n\3\2"+
		"\13\r\3\2\16\20\3\2/\61\3\2\23\24\u023a\2\177\3\2\2\2\4\u0084\3\2\2\2"+
		"\6\u0087\3\2\2\2\b\u0092\3\2\2\2\n\u0096\3\2\2\2\f\u00a6\3\2\2\2\16\u00a8"+
		"\3\2\2\2\20\u00aa\3\2\2\2\22\u00ac\3\2\2\2\24\u00ae\3\2\2\2\26\u00b0\3"+
		"\2\2\2\30\u00b2\3\2\2\2\32\u00b4\3\2\2\2\34\u00b6\3\2\2\2\36\u00b8\3\2"+
		"\2\2 \u00c1\3\2\2\2\"\u00c3\3\2\2\2$\u00c9\3\2\2\2&\u00d1\3\2\2\2(\u00d3"+
		"\3\2\2\2*\u00d5\3\2\2\2,\u00d7\3\2\2\2.\u00d9\3\2\2\2\60\u00de\3\2\2\2"+
		"\62\u00e0\3\2\2\2\64\u00e2\3\2\2\2\66\u00e4\3\2\2\28\u00ee\3\2\2\2:\u012a"+
		"\3\2\2\2<\u012f\3\2\2\2>\u0137\3\2\2\2@\u013b\3\2\2\2B\u013f\3\2\2\2D"+
		"\u0142\3\2\2\2F\u0145\3\2\2\2H\u0157\3\2\2\2J\u0166\3\2\2\2L\u0174\3\2"+
		"\2\2N\u0176\3\2\2\2P\u0178\3\2\2\2R\u017e\3\2\2\2T\u0183\3\2\2\2V\u018e"+
		"\3\2\2\2X\u0190\3\2\2\2Z\u0197\3\2\2\2\\\u019c\3\2\2\2^\u019f\3\2\2\2"+
		"`\u01aa\3\2\2\2b\u01b5\3\2\2\2d\u01c3\3\2\2\2f\u01c5\3\2\2\2h\u01cd\3"+
		"\2\2\2j\u01cf\3\2\2\2l\u01d5\3\2\2\2n\u01da\3\2\2\2p\u01e8\3\2\2\2r\u01ff"+
		"\3\2\2\2t\u0209\3\2\2\2v\u020d\3\2\2\2x\u0218\3\2\2\2z\u0224\3\2\2\2|"+
		"~\5\4\3\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5R*\2\u0083\3\3\2\2\2\u0084"+
		"\u0085\7.\2\2\u0085\u0086\5\6\4\2\u0086\5\3\2\2\2\u0087\u0088\7\3\2\2"+
		"\u0088\u008a\5\30\r\2\u0089\u008b\7\26\2\2\u008a\u0089\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\7\3\2\2\2\u008c\u0093\5\16\b\2\u008d\u0093\5\n\6\2\u008e"+
		"\u0093\5\20\t\2\u008f\u0093\5\22\n\2\u0090\u0093\5\24\13\2\u0091\u0093"+
		"\5\26\f\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2"+
		"\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\t\3\2\2\2\u0096"+
		"\u0097\7\4\2\2\u0097\u009c\5\f\7\2\u0098\u0099\7-\2\2\u0099\u009b\5\f"+
		"\7\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7%"+
		"\2\2\u00a0\13\3\2\2\2\u00a1\u00a7\7E\2\2\u00a2\u00a3\7E\2\2\u00a3\u00a4"+
		"\7C\2\2\u00a4\u00a7\5<\37\2\u00a5\u00a7\7\5\2\2\u00a6\u00a1\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\r\3\2\2\2\u00a8\u00a9\t\2\2\2"+
		"\u00a9\17\3\2\2\2\u00aa\u00ab\t\3\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\t\4"+
		"\2\2\u00ad\23\3\2\2\2\u00ae\u00af\7\21\2\2\u00af\25\3\2\2\2\u00b0\u00b1"+
		"\7\22\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\t\5\2\2\u00b3\31\3\2\2\2\u00b4"+
		"\u00b5\7\62\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7\35\3\2\2\2"+
		"\u00b8\u00bc\5 \21\2\u00b9\u00bb\5\"\22\2\u00ba\u00b9\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\37\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c2\5&\24\2\u00c0\u00c2\7E\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c5\7(\2\2\u00c4\u00c6"+
		"\58\35\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\7)\2\2\u00c8#\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cb\58\35\2\u00cb"+
		"%\3\2\2\2\u00cc\u00d2\5(\25\2\u00cd\u00d2\5*\26\2\u00ce\u00d2\5,\27\2"+
		"\u00cf\u00d2\5.\30\2\u00d0\u00d2\5\60\31\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd"+
		"\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\'\3\2\2\2\u00d3\u00d4\7\25\2\2\u00d4)\3\2\2\2\u00d5\u00d6\7\63\2\2\u00d6"+
		"+\3\2\2\2\u00d7\u00d8\7\64\2\2\u00d8-\3\2\2\2\u00d9\u00da\7\65\2\2\u00da"+
		"/\3\2\2\2\u00db\u00df\5\62\32\2\u00dc\u00df\5\64\33\2\u00dd\u00df\5\66"+
		"\34\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\61\3\2\2\2\u00e0\u00e1\7\66\2\2\u00e1\63\3\2\2\2\u00e2\u00e3\7\67\2\2"+
		"\u00e3\65\3\2\2\2\u00e4\u00e5\78\2\2\u00e5\67\3\2\2\2\u00e6\u00e7\b\35"+
		"\1\2\u00e7\u00e8\7:\2\2\u00e8\u00ef\58\35\r\u00e9\u00ea\7=\2\2\u00ea\u00ef"+
		"\58\35\f\u00eb\u00ec\7;\2\2\u00ec\u00ef\58\35\13\u00ed\u00ef\5:\36\2\u00ee"+
		"\u00e6\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u010f\3\2\2\2\u00f0\u00f1\f\n\2\2\u00f1\u00f2\7<\2\2\u00f2"+
		"\u010e\58\35\13\u00f3\u00f4\f\t\2\2\u00f4\u00f5\7=\2\2\u00f5\u010e\58"+
		"\35\n\u00f6\u00f7\f\b\2\2\u00f7\u00f8\7>\2\2\u00f8\u010e\58\35\t\u00f9"+
		"\u00fa\f\7\2\2\u00fa\u00fb\7?\2\2\u00fb\u010e\58\35\b\u00fc\u00fd\f\6"+
		"\2\2\u00fd\u00fe\7@\2\2\u00fe\u010e\58\35\7\u00ff\u0100\f\5\2\2\u0100"+
		"\u0101\7A\2\2\u0101\u010e\58\35\6\u0102\u0103\f\4\2\2\u0103\u0104\7B\2"+
		"\2\u0104\u010e\58\35\5\u0105\u0106\f\3\2\2\u0106\u0107\7\32\2\2\u0107"+
		"\u0108\58\35\2\u0108\u0109\7+\2\2\u0109\u010a\58\35\4\u010a\u010e\3\2"+
		"\2\2\u010b\u010c\f\16\2\2\u010c\u010e\7:\2\2\u010d\u00f0\3\2\2\2\u010d"+
		"\u00f3\3\2\2\2\u010d\u00f6\3\2\2\2\u010d\u00f9\3\2\2\2\u010d\u00fc\3\2"+
		"\2\2\u010d\u00ff\3\2\2\2\u010d\u0102\3\2\2\2\u010d\u0105\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u01109\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u012b\5<\37\2\u0113\u0114"+
		"\5&\24\2\u0114\u011d\7$\2\2\u0115\u011a\58\35\2\u0116\u0117\7-\2\2\u0117"+
		"\u0119\58\35\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0115\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7%"+
		"\2\2\u0120\u012b\3\2\2\2\u0121\u0122\7$\2\2\u0122\u0123\5\36\20\2\u0123"+
		"\u0124\7%\2\2\u0124\u0125\58\35\2\u0125\u012b\3\2\2\2\u0126\u0128\5> "+
		"\2\u0127\u0129\5@!\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b"+
		"\3\2\2\2\u012a\u0112\3\2\2\2\u012a\u0113\3\2\2\2\u012a\u0121\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012b;\3\2\2\2\u012c\u0130\5\30\r\2\u012d\u0130\5\32\16"+
		"\2\u012e\u0130\5\34\17\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u012e\3\2\2\2\u0130=\3\2\2\2\u0131\u0138\5J&\2\u0132\u0133\7$\2\2\u0133"+
		"\u0134\58\35\2\u0134\u0135\7%\2\2\u0135\u0138\3\2\2\2\u0136\u0138\7E\2"+
		"\2\u0137\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0136\3\2\2\2\u0138?"+
		"\3\2\2\2\u0139\u013c\5\"\22\2\u013a\u013c\5$\23\2\u013b\u0139\3\2\2\2"+
		"\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013eA\3\2\2\2\u013f\u0140\7C\2\2\u0140\u0141\58\35\2\u0141C"+
		"\3\2\2\2\u0142\u0143\7D\2\2\u0143\u0144\58\35\2\u0144E\3\2\2\2\u0145\u0146"+
		"\5L\'\2\u0146\u0147\5N(\2\u0147\u0150\7$\2\2\u0148\u014d\5P)\2\u0149\u014a"+
		"\7-\2\2\u014a\u014c\5P)\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u0150\u0148\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\7%\2\2\u0153\u0154\7&\2\2\u0154\u0155\5R*\2\u0155\u0156\7\'\2\2"+
		"\u0156G\3\2\2\2\u0157\u0158\5L\'\2\u0158\u0159\5N(\2\u0159\u0162\7$\2"+
		"\2\u015a\u015f\5P)\2\u015b\u015c\7-\2\2\u015c\u015e\5P)\2\u015d\u015b"+
		"\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7%\2\2\u0165I\3\2\2\2\u0166\u0167"+
		"\5N(\2\u0167\u0170\7$\2\2\u0168\u016d\58\35\2\u0169\u016a\7-\2\2\u016a"+
		"\u016c\58\35\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0168\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7%"+
		"\2\2\u0173K\3\2\2\2\u0174\u0175\5\36\20\2\u0175M\3\2\2\2\u0176\u0177\7"+
		"E\2\2\u0177O\3\2\2\2\u0178\u0179\5\36\20\2\u0179\u017a\7E\2\2\u017aQ\3"+
		"\2\2\2\u017b\u017d\5T+\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017fS\3\2\2\2\u0180\u017e\3\2\2\2"+
		"\u0181\u0184\5V,\2\u0182\u0184\5X-\2\u0183\u0181\3\2\2\2\u0183\u0182\3"+
		"\2\2\2\u0184U\3\2\2\2\u0185\u018f\5d\63\2\u0186\u0187\5Z.\2\u0187\u0188"+
		"\7,\2\2\u0188\u018f\3\2\2\2\u0189\u018f\5j\66\2\u018a\u018f\5n8\2\u018b"+
		"\u018f\5p9\2\u018c\u018f\5r:\2\u018d\u018f\5z>\2\u018e\u0185\3\2\2\2\u018e"+
		"\u0186\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018fW\3\2\2\2\u0190\u0191"+
		"\7&\2\2\u0191\u0192\5R*\2\u0192\u0193\7\'\2\2\u0193Y\3\2\2\2\u0194\u0198"+
		"\5\\/\2\u0195\u0198\5f\64\2\u0196\u0198\5h\65\2\u0197\u0194\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198[\3\2\2\2\u0199\u019d\5b\62\2"+
		"\u019a\u019d\5^\60\2\u019b\u019d\5H%\2\u019c\u0199\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019d]\3\2\2\2\u019e\u01a0\5\b\5\2\u019f"+
		"\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\5\36"+
		"\20\2\u01a2\u01a7\5`\61\2\u01a3\u01a4\7-\2\2\u01a4\u01a6\5`\61\2\u01a5"+
		"\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8_\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ae\5> \2\u01ab\u01ad"+
		"\5\"\22\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3"+
		"\5B\"\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3a\3\2\2\2\u01b4\u01b6"+
		"\5\b\5\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\7\27\2\2\u01b8\u01b9\7E\2\2\u01b9\u01bd\7&\2\2\u01ba\u01bb\5^\60"+
		"\2\u01bb\u01bc\7,\2\2\u01bc\u01be\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c2\7\'\2\2\u01c2c\3\2\2\2\u01c3\u01c4\5F$\2\u01c4e\3\2\2\2\u01c5\u01c7"+
		"\5> \2\u01c6\u01c8\5@!\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01cb\3\2\2\2\u01c9\u01cc\5B\"\2\u01ca\u01cc\5D#\2\u01cb\u01c9\3\2\2"+
		"\2\u01cb\u01ca\3\2\2\2\u01ccg\3\2\2\2\u01cd\u01ce\58\35\2\u01cei\3\2\2"+
		"\2\u01cf\u01d0\7\30\2\2\u01d0\u01d1\7$\2\2\u01d1\u01d2\58\35\2\u01d2\u01d3"+
		"\7%\2\2\u01d3\u01d4\5l\67\2\u01d4k\3\2\2\2\u01d5\u01d8\5T+\2\u01d6\u01d7"+
		"\7\31\2\2\u01d7\u01d9\5T+\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"m\3\2\2\2\u01da\u01db\7!\2\2\u01db\u01dc\7$\2\2\u01dc\u01dd\58\35\2\u01dd"+
		"\u01de\7%\2\2\u01de\u01df\7&\2\2\u01df\u01e0\5R*\2\u01e0\u01e1\7\'\2\2"+
		"\u01e1o\3\2\2\2\u01e2\u01e3\7\"\2\2\u01e3\u01e4\58\35\2\u01e4\u01e5\7"+
		"+\2\2\u01e5\u01e9\3\2\2\2\u01e6\u01e7\7#\2\2\u01e7\u01e9\7+\2\2\u01e8"+
		"\u01e2\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9q\3\2\2\2\u01ea\u01eb\7\35\2\2"+
		"\u01eb\u01ec\7$\2\2\u01ec\u01ed\58\35\2\u01ed\u01ee\7%\2\2\u01ee\u01ef"+
		"\5T+\2\u01ef\u0200\3\2\2\2\u01f0\u01f1\7\34\2\2\u01f1\u01f2\5T+\2\u01f2"+
		"\u01f3\7\35\2\2\u01f3\u01f4\7$\2\2\u01f4\u01f5\58\35\2\u01f5\u01f6\7%"+
		"\2\2\u01f6\u01f7\7,\2\2\u01f7\u0200\3\2\2\2\u01f8\u01f9\7\33\2\2\u01f9"+
		"\u01fa\7$\2\2\u01fa\u01fb\5t;\2\u01fb\u01fc\5v<\2\u01fc\u01fd\5x=\2\u01fd"+
		"\u01fe\7%\2\2\u01fe\u0200\3\2\2\2\u01ff\u01ea\3\2\2\2\u01ff\u01f0\3\2"+
		"\2\2\u01ff\u01f8\3\2\2\2\u0200s\3\2\2\2\u0201\u0206\5Z.\2\u0202\u0203"+
		"\7-\2\2\u0203\u0205\5Z.\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0209\u0201\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\7,\2\2\u020cu\3\2\2\2\u020d\u020e\58\35\2\u020e\u020f\7,\2\2\u020f"+
		"w\3\2\2\2\u0210\u0215\5Z.\2\u0211\u0212\7-\2\2\u0212\u0214\5Z.\2\u0213"+
		"\u0211\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0210\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219y\3\2\2\2\u021a\u021b\7\36\2\2\u021b\u0225\7,\2\2"+
		"\u021c\u021d\7\37\2\2\u021d\u0225\7,\2\2\u021e\u021f\7 \2\2\u021f\u0225"+
		"\7,\2\2\u0220\u0221\7 \2\2\u0221\u0222\58\35\2\u0222\u0223\7,\2\2\u0223"+
		"\u0225\3\2\2\2\u0224\u021a\3\2\2\2\u0224\u021c\3\2\2\2\u0224\u021e\3\2"+
		"\2\2\u0224\u0220\3\2\2\2\u0225{\3\2\2\2\63\177\u008a\u0092\u0094\u009c"+
		"\u00a6\u00bc\u00c1\u00c5\u00d1\u00de\u00ee\u010d\u010f\u011a\u011d\u0128"+
		"\u012a\u012f\u0137\u013b\u013d\u014d\u0150\u015f\u0162\u016d\u0170\u017e"+
		"\u0183\u018e\u0197\u019c\u019f\u01a7\u01ae\u01b2\u01b5\u01bf\u01c7\u01cb"+
		"\u01d8\u01e8\u01ff\u0206\u0209\u0215\u0218\u0224";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}