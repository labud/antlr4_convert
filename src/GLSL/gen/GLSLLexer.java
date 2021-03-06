// Generated from D:/antlr4/ShaderParser/src/GLSL\GLSL.g4 by ANTLR 4.5.1
package GLSL.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "VERSOIN_PROFILE", "STRUCT", "IF", "ELSE", "QUESTION", 
		"FOR", "DO", "WHILE", "CONTINUE", "BREAK", "RETURN", "SWITCH", "CASE", 
		"DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "DOT", "COLON", "SEMICOLON", "COMMA", "SHARP", "DECIMAL", 
		"OCTAL", "HEX", "FLOAT_NUM", "SCALA", "VECTOR", "MATRIX", "FLOAT_OPAQUE", 
		"INT_OPAQUE", "U_INT_OPAQUE", "BASIC_OPAQUE_TYPE", "INCREAMENT_OP", "UNARY_OP", 
		"MULDIV_OP", "ADDDIV_OP", "SHIFT_OP", "COMPARE_OP", "EQUAL_OP", "BITWISE_OP", 
		"LOGIC_OP", "ASSIGNMENT_OP", "ARITHMETIC_ASSIGNMENT_OP", "DIGIT", "HEX_DIGIT", 
		"OCTAL_DIGIT", "INTEGER_SUFFIX", "EXPONENT", "FLOAT_SUFFIX", "LETTER", 
		"IDENTIFIER", "COMMENT", "WS", "LINE_COMMENT"
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


	public GLSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GLSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2H\u0389\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u014f"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\7.\u01b1\n"+
		".\f.\16.\u01b4\13.\3.\5.\u01b7\n.\3/\3/\7/\u01bb\n/\f/\16/\u01be\13/\3"+
		"/\5/\u01c1\n/\3\60\3\60\3\60\3\60\5\60\u01c7\n\60\3\60\6\60\u01ca\n\60"+
		"\r\60\16\60\u01cb\3\60\5\60\u01cf\n\60\3\61\6\61\u01d2\n\61\r\61\16\61"+
		"\u01d3\3\61\3\61\7\61\u01d8\n\61\f\61\16\61\u01db\13\61\3\61\5\61\u01de"+
		"\n\61\3\61\5\61\u01e1\n\61\3\61\3\61\6\61\u01e5\n\61\r\61\16\61\u01e6"+
		"\3\61\5\61\u01ea\n\61\3\61\5\61\u01ed\n\61\3\61\6\61\u01f0\n\61\r\61\16"+
		"\61\u01f1\3\61\3\61\5\61\u01f6\n\61\5\61\u01f8\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u0210\n\62\3\63\5\63\u0213\n\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\5\64\u021c\n\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0225\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02a8\n\65\5\65\u02aa\n\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u02bc\n\67\38\38\38\38\38\38\38\38\38\38\38\38\58\u02ca"+
		"\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u0306\n8\39\39\39\39\59\u030c"+
		"\n9\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\5=\u0318\n=\3>\3>\3>\3>\3>\5>\u031f"+
		"\n>\3?\3?\3?\3?\5?\u0325\n?\3@\3@\3A\3A\3A\3A\3A\3A\5A\u032f\nA\3B\3B"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u033f\nC\3D\3D\3E\5E\u0344\nE"+
		"\3F\3F\3G\3G\3H\3H\5H\u034c\nH\3H\6H\u034f\nH\rH\16H\u0350\3I\3I\3I\3"+
		"I\3I\5I\u0358\nI\3J\5J\u035b\nJ\3K\3K\3K\7K\u0360\nK\fK\16K\u0363\13K"+
		"\3L\3L\3L\3L\7L\u0369\nL\fL\16L\u036c\13L\3L\3L\3L\3L\3L\3M\6M\u0374\n"+
		"M\rM\16M\u0375\3M\3M\3N\3N\3N\3N\7N\u037e\nN\fN\16N\u0381\13N\3N\5N\u0384"+
		"\nN\3N\3N\3N\3N\3\u036a\2O\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095E\u0097F\u0099"+
		"G\u009bH\3\2\23\3\2\63;\6\2ddffkkww\3\2\64\66\4\2##\u0080\u0080\5\2\'"+
		"\',,\61\61\4\2--//\4\2>>@@\5\2((``~~\3\2\62;\5\2\62;CHch\3\2\629\4\2W"+
		"Www\4\2GGgg\4\2HHhh\5\2C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u03c3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\3\u009d\3\2\2\2\5\u00a5\3\2\2\2\7\u00ae\3\2\2\2\t\u00b5\3\2\2\2\13"+
		"\u00bb\3\2\2\2\r\u00be\3\2\2\2\17\u00c2\3\2\2\2\21\u00ca\3\2\2\2\23\u00d1"+
		"\3\2\2\2\25\u00e0\3\2\2\2\27\u00f1\3\2\2\2\31\u00ff\3\2\2\2\33\u0106\3"+
		"\2\2\2\35\u010b\3\2\2\2\37\u0119\3\2\2\2!\u0123\3\2\2\2#\u012b\3\2\2\2"+
		"%\u0130\3\2\2\2\'\u0136\3\2\2\2)\u014e\3\2\2\2+\u0150\3\2\2\2-\u0157\3"+
		"\2\2\2/\u015a\3\2\2\2\61\u015f\3\2\2\2\63\u0161\3\2\2\2\65\u0165\3\2\2"+
		"\2\67\u0168\3\2\2\29\u016e\3\2\2\2;\u0177\3\2\2\2=\u017d\3\2\2\2?\u0184"+
		"\3\2\2\2A\u018b\3\2\2\2C\u0190\3\2\2\2E\u0198\3\2\2\2G\u019a\3\2\2\2I"+
		"\u019c\3\2\2\2K\u019e\3\2\2\2M\u01a0\3\2\2\2O\u01a2\3\2\2\2Q\u01a4\3\2"+
		"\2\2S\u01a6\3\2\2\2U\u01a8\3\2\2\2W\u01aa\3\2\2\2Y\u01ac\3\2\2\2[\u01ae"+
		"\3\2\2\2]\u01b8\3\2\2\2_\u01c6\3\2\2\2a\u01f7\3\2\2\2c\u020f\3\2\2\2e"+
		"\u0212\3\2\2\2g\u021b\3\2\2\2i\u02a9\3\2\2\2k\u02ab\3\2\2\2m\u02bb\3\2"+
		"\2\2o\u02c9\3\2\2\2q\u030b\3\2\2\2s\u030d\3\2\2\2u\u030f\3\2\2\2w\u0311"+
		"\3\2\2\2y\u0317\3\2\2\2{\u031e\3\2\2\2}\u0324\3\2\2\2\177\u0326\3\2\2"+
		"\2\u0081\u032e\3\2\2\2\u0083\u0330\3\2\2\2\u0085\u033e\3\2\2\2\u0087\u0340"+
		"\3\2\2\2\u0089\u0343\3\2\2\2\u008b\u0345\3\2\2\2\u008d\u0347\3\2\2\2\u008f"+
		"\u0349\3\2\2\2\u0091\u0357\3\2\2\2\u0093\u035a\3\2\2\2\u0095\u035c\3\2"+
		"\2\2\u0097\u0364\3\2\2\2\u0099\u0373\3\2\2\2\u009b\u0379\3\2\2\2\u009d"+
		"\u009e\7x\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\u00a2\7k\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7p\2\2\u00a4\4\3\2"+
		"\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7{\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7\"\2\2\u00ac"+
		"\u00ad\7*\2\2\u00ad\6\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7j\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7f\2\2"+
		"\u00b4\b\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p"+
		"\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7v\2\2\u00ba\n\3\2\2\2\u00bb\u00bc"+
		"\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\f\3\2\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7w\2\2\u00c0\u00c1\7v\2\2\u00c1\16\3\2\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4"+
		"\7p\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7q\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\u00c9\7o\2\2\u00c9\20\3\2\2\2\u00ca\u00cb\7d\2\2\u00cb"+
		"\u00cc\7w\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7g\2\2"+
		"\u00cf\u00d0\7t\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7"+
		"k\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7a\2\2\u00d6\u00d7"+
		"\7r\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7e\2\2\u00da"+
		"\u00db\7k\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7q\2\2"+
		"\u00de\u00df\7p\2\2\u00df\24\3\2\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7"+
		"g\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6"+
		"\7o\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7u\2\2"+
		"\u00ed\u00ee\7k\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7p\2\2\u00f0\26\3\2"+
		"\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7y\2\2\u00f4\u00f5"+
		"\7a\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8"+
		"\u00f9\7e\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7k\2\2"+
		"\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\30\3\2\2\2\u00ff\u0100\7"+
		"u\2\2\u0100\u0101\7o\2\2\u0101\u0102\7q\2\2\u0102\u0103\7q\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7j\2\2\u0105\32\3\2\2\2\u0106\u0107\7h\2\2\u0107\u0108"+
		"\7n\2\2\u0108\u0109\7c\2\2\u0109\u010a\7v\2\2\u010a\34\3\2\2\2\u010b\u010c"+
		"\7p\2\2\u010c\u010d\7q\2\2\u010d\u010e\7r\2\2\u010e\u010f\7g\2\2\u010f"+
		"\u0110\7t\2\2\u0110\u0111\7u\2\2\u0111\u0112\7r\2\2\u0112\u0113\7g\2\2"+
		"\u0113\u0114\7e\2\2\u0114\u0115\7v\2\2\u0115\u0116\7k\2\2\u0116\u0117"+
		"\7x\2\2\u0117\u0118\7g\2\2\u0118\36\3\2\2\2\u0119\u011a\7k\2\2\u011a\u011b"+
		"\7p\2\2\u011b\u011c\7x\2\2\u011c\u011d\7c\2\2\u011d\u011e\7t\2\2\u011e"+
		"\u011f\7k\2\2\u011f\u0120\7c\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2"+
		"\u0122 \3\2\2\2\u0123\u0124\7r\2\2\u0124\u0125\7t\2\2\u0125\u0126\7g\2"+
		"\2\u0126\u0127\7e\2\2\u0127\u0128\7k\2\2\u0128\u0129\7u\2\2\u0129\u012a"+
		"\7g\2\2\u012a\"\3\2\2\2\u012b\u012c\7v\2\2\u012c\u012d\7t\2\2\u012d\u012e"+
		"\7w\2\2\u012e\u012f\7g\2\2\u012f$\3\2\2\2\u0130\u0131\7h\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7n\2\2\u0133\u0134\7u\2\2\u0134\u0135\7g\2\2\u0135"+
		"&\3\2\2\2\u0136\u0137\7x\2\2\u0137\u0138\7q\2\2\u0138\u0139\7k\2\2\u0139"+
		"\u013a\7f\2\2\u013a(\3\2\2\2\u013b\u013c\7e\2\2\u013c\u013d\7q\2\2\u013d"+
		"\u013e\7t\2\2\u013e\u014f\7g\2\2\u013f\u0140\7e\2\2\u0140\u0141\7q\2\2"+
		"\u0141\u0142\7o\2\2\u0142\u0143\7r\2\2\u0143\u0144\7c\2\2\u0144\u0145"+
		"\7v\2\2\u0145\u0146\7k\2\2\u0146\u0147\7d\2\2\u0147\u0148\7k\2\2\u0148"+
		"\u0149\7n\2\2\u0149\u014a\7k\2\2\u014a\u014b\7v\2\2\u014b\u014f\7{\2\2"+
		"\u014c\u014d\7g\2\2\u014d\u014f\7u\2\2\u014e\u013b\3\2\2\2\u014e\u013f"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014f*\3\2\2\2\u0150\u0151\7u\2\2\u0151\u0152"+
		"\7v\2\2\u0152\u0153\7t\2\2\u0153\u0154\7w\2\2\u0154\u0155\7e\2\2\u0155"+
		"\u0156\7v\2\2\u0156,\3\2\2\2\u0157\u0158\7k\2\2\u0158\u0159\7h\2\2\u0159"+
		".\3\2\2\2\u015a\u015b\7g\2\2\u015b\u015c\7n\2\2\u015c\u015d\7u\2\2\u015d"+
		"\u015e\7g\2\2\u015e\60\3\2\2\2\u015f\u0160\7A\2\2\u0160\62\3\2\2\2\u0161"+
		"\u0162\7h\2\2\u0162\u0163\7q\2\2\u0163\u0164\7t\2\2\u0164\64\3\2\2\2\u0165"+
		"\u0166\7f\2\2\u0166\u0167\7q\2\2\u0167\66\3\2\2\2\u0168\u0169\7y\2\2\u0169"+
		"\u016a\7j\2\2\u016a\u016b\7k\2\2\u016b\u016c\7n\2\2\u016c\u016d\7g\2\2"+
		"\u016d8\3\2\2\2\u016e\u016f\7e\2\2\u016f\u0170\7q\2\2\u0170\u0171\7p\2"+
		"\2\u0171\u0172\7v\2\2\u0172\u0173\7k\2\2\u0173\u0174\7p\2\2\u0174\u0175"+
		"\7w\2\2\u0175\u0176\7g\2\2\u0176:\3\2\2\2\u0177\u0178\7d\2\2\u0178\u0179"+
		"\7t\2\2\u0179\u017a\7g\2\2\u017a\u017b\7c\2\2\u017b\u017c\7m\2\2\u017c"+
		"<\3\2\2\2\u017d\u017e\7t\2\2\u017e\u017f\7g\2\2\u017f\u0180\7v\2\2\u0180"+
		"\u0181\7w\2\2\u0181\u0182\7t\2\2\u0182\u0183\7p\2\2\u0183>\3\2\2\2\u0184"+
		"\u0185\7u\2\2\u0185\u0186\7y\2\2\u0186\u0187\7k\2\2\u0187\u0188\7v\2\2"+
		"\u0188\u0189\7e\2\2\u0189\u018a\7j\2\2\u018a@\3\2\2\2\u018b\u018c\7e\2"+
		"\2\u018c\u018d\7c\2\2\u018d\u018e\7u\2\2\u018e\u018f\7g\2\2\u018fB\3\2"+
		"\2\2\u0190\u0191\7f\2\2\u0191\u0192\7g\2\2\u0192\u0193\7h\2\2\u0193\u0194"+
		"\7w\2\2\u0194\u0195\7c\2\2\u0195\u0196\7n\2\2\u0196\u0197\7v\2\2\u0197"+
		"D\3\2\2\2\u0198\u0199\7*\2\2\u0199F\3\2\2\2\u019a\u019b\7+\2\2\u019bH"+
		"\3\2\2\2\u019c\u019d\7}\2\2\u019dJ\3\2\2\2\u019e\u019f\7\177\2\2\u019f"+
		"L\3\2\2\2\u01a0\u01a1\7]\2\2\u01a1N\3\2\2\2\u01a2\u01a3\7_\2\2\u01a3P"+
		"\3\2\2\2\u01a4\u01a5\7\60\2\2\u01a5R\3\2\2\2\u01a6\u01a7\7<\2\2\u01a7"+
		"T\3\2\2\2\u01a8\u01a9\7=\2\2\u01a9V\3\2\2\2\u01aa\u01ab\7.\2\2\u01abX"+
		"\3\2\2\2\u01ac\u01ad\7%\2\2\u01adZ\3\2\2\2\u01ae\u01b2\t\2\2\2\u01af\u01b1"+
		"\5\u0087D\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2"+
		"\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b7"+
		"\5\u008dG\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\\\3\2\2\2\u01b8"+
		"\u01bc\7\62\2\2\u01b9\u01bb\5\u008bF\2\u01ba\u01b9\3\2\2\2\u01bb\u01be"+
		"\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c1\5\u008dG\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1^\3\2\2\2\u01c2\u01c3\7\62\2\2\u01c3\u01c7\7z\2\2\u01c4"+
		"\u01c5\7\62\2\2\u01c5\u01c7\7Z\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\5\u0089E\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2"+
		"\2\2\u01cd\u01cf\5\u008dG\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"`\3\2\2\2\u01d0\u01d2\5\u0087D\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3\3\2\2"+
		"\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d9"+
		"\5Q)\2\u01d6\u01d8\5\u0087D\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u01de\5\u008fH\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2"+
		"\2\u01de\u01e0\3\2\2\2\u01df\u01e1\5\u0091I\2\u01e0\u01df\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01f8\3\2\2\2\u01e2\u01e4\5Q)\2\u01e3\u01e5\5\u0087"+
		"D\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01ea\5\u008fH\2\u01e9\u01e8"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ed\5\u0091I"+
		"\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f8\3\2\2\2\u01ee\u01f0"+
		"\5\u0087D\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2"+
		"\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\5\u008fH\2\u01f4"+
		"\u01f6\5\u0091I\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8"+
		"\3\2\2\2\u01f7\u01d1\3\2\2\2\u01f7\u01e2\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f8"+
		"b\3\2\2\2\u01f9\u01fa\7d\2\2\u01fa\u01fb\7q\2\2\u01fb\u01fc\7q\2\2\u01fc"+
		"\u0210\7n\2\2\u01fd\u01fe\7k\2\2\u01fe\u01ff\7p\2\2\u01ff\u0210\7v\2\2"+
		"\u0200\u0201\7w\2\2\u0201\u0202\7k\2\2\u0202\u0203\7p\2\2\u0203\u0210"+
		"\7v\2\2\u0204\u0205\7h\2\2\u0205\u0206\7n\2\2\u0206\u0207\7q\2\2\u0207"+
		"\u0208\7c\2\2\u0208\u0210\7v\2\2\u0209\u020a\7f\2\2\u020a\u020b\7q\2\2"+
		"\u020b\u020c\7w\2\2\u020c\u020d\7d\2\2\u020d\u020e\7n\2\2\u020e\u0210"+
		"\7g\2\2\u020f\u01f9\3\2\2\2\u020f\u01fd\3\2\2\2\u020f\u0200\3\2\2\2\u020f"+
		"\u0204\3\2\2\2\u020f\u0209\3\2\2\2\u0210d\3\2\2\2\u0211\u0213\t\3\2\2"+
		"\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215"+
		"\7x\2\2\u0215\u0216\7g\2\2\u0216\u0217\7e\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\t\4\2\2\u0219f\3\2\2\2\u021a\u021c\7f\2\2\u021b\u021a\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7o\2\2\u021e\u021f\7c\2"+
		"\2\u021f\u0220\7v\2\2\u0220\u0221\3\2\2\2\u0221\u0224\t\4\2\2\u0222\u0223"+
		"\7z\2\2\u0223\u0225\t\4\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"h\3\2\2\2\u0226\u02aa\5o8\2\u0227\u0228\7u\2\2\u0228\u0229\7c\2\2\u0229"+
		"\u022a\7o\2\2\u022a\u022b\7r\2\2\u022b\u022c\7n\2\2\u022c\u022d\7g\2\2"+
		"\u022d\u022e\7t\2\2\u022e\u022f\7\63\2\2\u022f\u0230\7F\2\2\u0230\u0231"+
		"\7U\2\2\u0231\u0232\7j\2\2\u0232\u0233\7c\2\2\u0233\u0234\7f\2\2\u0234"+
		"\u0235\7q\2\2\u0235\u02a8\7y\2\2\u0236\u0237\7u\2\2\u0237\u0238\7c\2\2"+
		"\u0238\u0239\7o\2\2\u0239\u023a\7r\2\2\u023a\u023b\7n\2\2\u023b\u023c"+
		"\7g\2\2\u023c\u023d\7t\2\2\u023d\u023e\7\64\2\2\u023e\u023f\7F\2\2\u023f"+
		"\u0240\7U\2\2\u0240\u0241\7j\2\2\u0241\u0242\7c\2\2\u0242\u0243\7f\2\2"+
		"\u0243\u0244\7q\2\2\u0244\u02a8\7y\2\2\u0245\u0246\7u\2\2\u0246\u0247"+
		"\7c\2\2\u0247\u0248\7o\2\2\u0248\u0249\7r\2\2\u0249\u024a\7n\2\2\u024a"+
		"\u024b\7g\2\2\u024b\u024c\7t\2\2\u024c\u024d\7\64\2\2\u024d\u024e\7F\2"+
		"\2\u024e\u024f\7T\2\2\u024f\u0250\7g\2\2\u0250\u0251\7e\2\2\u0251\u0252"+
		"\7v\2\2\u0252\u0253\7U\2\2\u0253\u0254\7j\2\2\u0254\u0255\7c\2\2\u0255"+
		"\u0256\7f\2\2\u0256\u0257\7q\2\2\u0257\u02a8\7y\2\2\u0258\u0259\7u\2\2"+
		"\u0259\u025a\7c\2\2\u025a\u025b\7o\2\2\u025b\u025c\7r\2\2\u025c\u025d"+
		"\7n\2\2\u025d\u025e\7g\2\2\u025e\u025f\7t\2\2\u025f\u0260\7\63\2\2\u0260"+
		"\u0261\7F\2\2\u0261\u0262\7C\2\2\u0262\u0263\7t\2\2\u0263\u0264\7t\2\2"+
		"\u0264\u0265\7c\2\2\u0265\u0266\7{\2\2\u0266\u0267\7U\2\2\u0267\u0268"+
		"\7j\2\2\u0268\u0269\7c\2\2\u0269\u026a\7f\2\2\u026a\u026b\7q\2\2\u026b"+
		"\u02a8\7y\2\2\u026c\u026d\7u\2\2\u026d\u026e\7c\2\2\u026e\u026f\7o\2\2"+
		"\u026f\u0270\7r\2\2\u0270\u0271\7n\2\2\u0271\u0272\7g\2\2\u0272\u0273"+
		"\7t\2\2\u0273\u0274\7\64\2\2\u0274\u0275\7F\2\2\u0275\u0276\7C\2\2\u0276"+
		"\u0277\7t\2\2\u0277\u0278\7t\2\2\u0278\u0279\7c\2\2\u0279\u027a\7{\2\2"+
		"\u027a\u027b\7U\2\2\u027b\u027c\7j\2\2\u027c\u027d\7c\2\2\u027d\u027e"+
		"\7f\2\2\u027e\u027f\7q\2\2\u027f\u02a8\7y\2\2\u0280\u0281\7u\2\2\u0281"+
		"\u0282\7c\2\2\u0282\u0283\7o\2\2\u0283\u0284\7r\2\2\u0284\u0285\7n\2\2"+
		"\u0285\u0286\7g\2\2\u0286\u0287\7t\2\2\u0287\u0288\7E\2\2\u0288\u0289"+
		"\7w\2\2\u0289\u028a\7d\2\2\u028a\u028b\7g\2\2\u028b\u028c\7U\2\2\u028c"+
		"\u028d\7j\2\2\u028d\u028e\7c\2\2\u028e\u028f\7f\2\2\u028f\u0290\7q\2\2"+
		"\u0290\u02a8\7y\2\2\u0291\u0292\7u\2\2\u0292\u0293\7c\2\2\u0293\u0294"+
		"\7o\2\2\u0294\u0295\7r\2\2\u0295\u0296\7n\2\2\u0296\u0297\7g\2\2\u0297"+
		"\u0298\7t\2\2\u0298\u0299\7E\2\2\u0299\u029a\7w\2\2\u029a\u029b\7d\2\2"+
		"\u029b\u029c\7g\2\2\u029c\u029d\7C\2\2\u029d\u029e\7t\2\2\u029e\u029f"+
		"\7t\2\2\u029f\u02a0\7c\2\2\u02a0\u02a1\7{\2\2\u02a1\u02a2\7U\2\2\u02a2"+
		"\u02a3\7j\2\2\u02a3\u02a4\7c\2\2\u02a4\u02a5\7f\2\2\u02a5\u02a6\7q\2\2"+
		"\u02a6\u02a8\7y\2\2\u02a7\u0227\3\2\2\2\u02a7\u0236\3\2\2\2\u02a7\u0245"+
		"\3\2\2\2\u02a7\u0258\3\2\2\2\u02a7\u026c\3\2\2\2\u02a7\u0280\3\2\2\2\u02a7"+
		"\u0291\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u0226\3\2\2\2\u02a9\u02a7\3\2"+
		"\2\2\u02aaj\3\2\2\2\u02ab\u02ac\7k\2\2\u02ac\u02ad\5o8\2\u02adl\3\2\2"+
		"\2\u02ae\u02af\7w\2\2\u02af\u02bc\5o8\2\u02b0\u02b1\7c\2\2\u02b1\u02b2"+
		"\7v\2\2\u02b2\u02b3\7q\2\2\u02b3\u02b4\7o\2\2\u02b4\u02b5\7k\2\2\u02b5"+
		"\u02b6\7e\2\2\u02b6\u02b7\7a\2\2\u02b7\u02b8\7w\2\2\u02b8\u02b9\7k\2\2"+
		"\u02b9\u02ba\7p\2\2\u02ba\u02bc\7v\2\2\u02bb\u02ae\3\2\2\2\u02bb\u02b0"+
		"\3\2\2\2\u02bcn\3\2\2\2\u02bd\u02be\7u\2\2\u02be\u02bf\7c\2\2\u02bf\u02c0"+
		"\7o\2\2\u02c0\u02c1\7r\2\2\u02c1\u02c2\7n\2\2\u02c2\u02c3\7g\2\2\u02c3"+
		"\u02ca\7t\2\2\u02c4\u02c5\7k\2\2\u02c5\u02c6\7o\2\2\u02c6\u02c7\7c\2\2"+
		"\u02c7\u02c8\7i\2\2\u02c8\u02ca\7g\2\2\u02c9\u02bd\3\2\2\2\u02c9\u02c4"+
		"\3\2\2\2\u02ca\u0305\3\2\2\2\u02cb\u02cc\7\63\2\2\u02cc\u0306\7F\2\2\u02cd"+
		"\u02ce\7\64\2\2\u02ce\u0306\7F\2\2\u02cf\u02d0\7\65\2\2\u02d0\u0306\7"+
		"F\2\2\u02d1\u02d2\7E\2\2\u02d2\u02d3\7w\2\2\u02d3\u02d4\7d\2\2\u02d4\u0306"+
		"\7g\2\2\u02d5\u02d6\7\64\2\2\u02d6\u02d7\7F\2\2\u02d7\u02d8\7T\2\2\u02d8"+
		"\u02d9\7g\2\2\u02d9\u02da\7e\2\2\u02da\u0306\7v\2\2\u02db\u02dc\7\63\2"+
		"\2\u02dc\u02dd\7F\2\2\u02dd\u02de\7C\2\2\u02de\u02df\7t\2\2\u02df\u02e0"+
		"\7t\2\2\u02e0\u02e1\7c\2\2\u02e1\u0306\7{\2\2\u02e2\u02e3\7\64\2\2\u02e3"+
		"\u02e4\7F\2\2\u02e4\u02e5\7C\2\2\u02e5\u02e6\7t\2\2\u02e6\u02e7\7t\2\2"+
		"\u02e7\u02e8\7c\2\2\u02e8\u0306\7{\2\2\u02e9\u02ea\7D\2\2\u02ea\u02eb"+
		"\7w\2\2\u02eb\u02ec\7h\2\2\u02ec\u02ed\7h\2\2\u02ed\u02ee\7g\2\2\u02ee"+
		"\u0306\7t\2\2\u02ef\u02f0\7\64\2\2\u02f0\u02f1\7F\2\2\u02f1\u02f2\7O\2"+
		"\2\u02f2\u0306\7U\2\2\u02f3\u02f4\7\64\2\2\u02f4\u02f5\7F\2\2\u02f5\u02f6"+
		"\7O\2\2\u02f6\u02f7\7U\2\2\u02f7\u02f8\7C\2\2\u02f8\u02f9\7t\2\2\u02f9"+
		"\u02fa\7t\2\2\u02fa\u02fb\7c\2\2\u02fb\u0306\7{\2\2\u02fc\u02fd\7E\2\2"+
		"\u02fd\u02fe\7w\2\2\u02fe\u02ff\7d\2\2\u02ff\u0300\7g\2\2\u0300\u0301"+
		"\7C\2\2\u0301\u0302\7t\2\2\u0302\u0303\7t\2\2\u0303\u0304\7c\2\2\u0304"+
		"\u0306\7{\2\2\u0305\u02cb\3\2\2\2\u0305\u02cd\3\2\2\2\u0305\u02cf\3\2"+
		"\2\2\u0305\u02d1\3\2\2\2\u0305\u02d5\3\2\2\2\u0305\u02db\3\2\2\2\u0305"+
		"\u02e2\3\2\2\2\u0305\u02e9\3\2\2\2\u0305\u02ef\3\2\2\2\u0305\u02f3\3\2"+
		"\2\2\u0305\u02fc\3\2\2\2\u0306p\3\2\2\2\u0307\u0308\7-\2\2\u0308\u030c"+
		"\7-\2\2\u0309\u030a\7/\2\2\u030a\u030c\7/\2\2\u030b\u0307\3\2\2\2\u030b"+
		"\u0309\3\2\2\2\u030cr\3\2\2\2\u030d\u030e\t\5\2\2\u030et\3\2\2\2\u030f"+
		"\u0310\t\6\2\2\u0310v\3\2\2\2\u0311\u0312\t\7\2\2\u0312x\3\2\2\2\u0313"+
		"\u0314\7>\2\2\u0314\u0318\7>\2\2\u0315\u0316\7@\2\2\u0316\u0318\7@\2\2"+
		"\u0317\u0313\3\2\2\2\u0317\u0315\3\2\2\2\u0318z\3\2\2\2\u0319\u031f\t"+
		"\b\2\2\u031a\u031b\7>\2\2\u031b\u031f\7?\2\2\u031c\u031d\7@\2\2\u031d"+
		"\u031f\7?\2\2\u031e\u0319\3\2\2\2\u031e\u031a\3\2\2\2\u031e\u031c\3\2"+
		"\2\2\u031f|\3\2\2\2\u0320\u0321\7?\2\2\u0321\u0325\7?\2\2\u0322\u0323"+
		"\7#\2\2\u0323\u0325\7?\2\2\u0324\u0320\3\2\2\2\u0324\u0322\3\2\2\2\u0325"+
		"~\3\2\2\2\u0326\u0327\t\t\2\2\u0327\u0080\3\2\2\2\u0328\u0329\7(\2\2\u0329"+
		"\u032f\7(\2\2\u032a\u032b\7`\2\2\u032b\u032f\7`\2\2\u032c\u032d\7~\2\2"+
		"\u032d\u032f\7~\2\2\u032e\u0328\3\2\2\2\u032e\u032a\3\2\2\2\u032e\u032c"+
		"\3\2\2\2\u032f\u0082\3\2\2\2\u0330\u0331\7?\2\2\u0331\u0084\3\2\2\2\u0332"+
		"\u0333\5u;\2\u0333\u0334\5\u0083B\2\u0334\u033f\3\2\2\2\u0335\u0336\5"+
		"w<\2\u0336\u0337\5\u0083B\2\u0337\u033f\3\2\2\2\u0338\u0339\5y=\2\u0339"+
		"\u033a\5\u0083B\2\u033a\u033f\3\2\2\2\u033b\u033c\5\177@\2\u033c\u033d"+
		"\5\u0083B\2\u033d\u033f\3\2\2\2\u033e\u0332\3\2\2\2\u033e\u0335\3\2\2"+
		"\2\u033e\u0338\3\2\2\2\u033e\u033b\3\2\2\2\u033f\u0086\3\2\2\2\u0340\u0341"+
		"\t\n\2\2\u0341\u0088\3\2\2\2\u0342\u0344\t\13\2\2\u0343\u0342\3\2\2\2"+
		"\u0344\u008a\3\2\2\2\u0345\u0346\t\f\2\2\u0346\u008c\3\2\2\2\u0347\u0348"+
		"\t\r\2\2\u0348\u008e\3\2\2\2\u0349\u034b\t\16\2\2\u034a\u034c\5w<\2\u034b"+
		"\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034f\4\62"+
		";\2\u034e\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0090\3\2\2\2\u0352\u0358\t\17\2\2\u0353\u0354\7"+
		"n\2\2\u0354\u0358\7h\2\2\u0355\u0356\7N\2\2\u0356\u0358\7H\2\2\u0357\u0352"+
		"\3\2\2\2\u0357\u0353\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0092\3\2\2\2\u0359"+
		"\u035b\t\20\2\2\u035a\u0359\3\2\2\2\u035b\u0094\3\2\2\2\u035c\u0361\5"+
		"\u0093J\2\u035d\u0360\5\u0093J\2\u035e\u0360\5\u0087D\2\u035f\u035d\3"+
		"\2\2\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361"+
		"\u0362\3\2\2\2\u0362\u0096\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365\7\61"+
		"\2\2\u0365\u0366\7,\2\2\u0366\u036a\3\2\2\2\u0367\u0369\13\2\2\2\u0368"+
		"\u0367\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u036b\3\2\2\2\u036a\u0368\3\2"+
		"\2\2\u036b\u036d\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036e\7,\2\2\u036e"+
		"\u036f\7\61\2\2\u036f\u0370\3\2\2\2\u0370\u0371\bL\2\2\u0371\u0098\3\2"+
		"\2\2\u0372\u0374\t\21\2\2\u0373\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\bM"+
		"\2\2\u0378\u009a\3\2\2\2\u0379\u037a\7\61\2\2\u037a\u037b\7\61\2\2\u037b"+
		"\u037f\3\2\2\2\u037c\u037e\n\22\2\2\u037d\u037c\3\2\2\2\u037e\u0381\3"+
		"\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0383\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0382\u0384\7\17\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3"+
		"\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\7\f\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u0388\bN\2\2\u0388\u009c\3\2\2\2/\2\u014e\u01b2\u01b6\u01bc\u01c0\u01c6"+
		"\u01cb\u01ce\u01d3\u01d9\u01dd\u01e0\u01e6\u01e9\u01ec\u01f1\u01f5\u01f7"+
		"\u020f\u0212\u021b\u0224\u02a7\u02a9\u02bb\u02c9\u0305\u030b\u0317\u031e"+
		"\u0324\u032e\u033e\u0343\u034b\u0350\u0357\u035a\u035f\u0361\u036a\u0375"+
		"\u037f\u0383\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}