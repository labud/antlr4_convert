// Generated from D:/antlr4/ShaderParser/src/MidSL\MidSL.g4 by ANTLR 4.5.1
package MidSL.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MidSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		VERSOIN_PROFILE=18, SMPBUFFER=19, TXBUFFER=20, STRUCT=21, CBUFFER=22, 
		INBUFFER=23, OUTBUFFER=24, INOUTBUFFER=25, IF=26, ELSE=27, QUESTION=28, 
		FOR=29, DO=30, WHILE=31, CONTINUE=32, BREAK=33, RETURN=34, SWITCH=35, 
		CASE=36, DEFUALT=37, LEFT_PAREN=38, RIGHT_PAREN=39, LEFT_BRACE=40, RIGHT_BRACE=41, 
		LEFT_BRACKET=42, RIGHT_BRACKET=43, DOT=44, COLON=45, SEMICOLON=46, COMMA=47, 
		SHARP=48, FUNC_KEYWORD=49, DECIMAL=50, OCTAL=51, HEX=52, FLOAT_NUM=53, 
		SCALA=54, VECTOR=55, MATRIX=56, INCREAMENT_OP=57, UNARY_OP=58, MULDIV_OP=59, 
		ADDDIV_OP=60, SHIFT_OP=61, COMPARE_OP=62, EQUAL_OP=63, BITWISE_OP=64, 
		LOGIC_OP=65, ASSIGNMENT_OP=66, ARITHMETIC_ASSIGNMENT_OP=67, IDENTIFIER=68, 
		COMMENT=69, WS=70, LINE_COMMENT=71;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"VERSOIN_PROFILE", "SMPBUFFER", "TXBUFFER", "STRUCT", "CBUFFER", "INBUFFER", 
		"OUTBUFFER", "INOUTBUFFER", "IF", "ELSE", "QUESTION", "FOR", "DO", "WHILE", 
		"CONTINUE", "BREAK", "RETURN", "SWITCH", "CASE", "DEFUALT", "LEFT_PAREN", 
		"RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"DOT", "COLON", "SEMICOLON", "COMMA", "SHARP", "FUNC_KEYWORD", "DECIMAL", 
		"OCTAL", "HEX", "FLOAT_NUM", "SCALA", "VECTOR", "MATRIX", "INCREAMENT_OP", 
		"UNARY_OP", "MULDIV_OP", "ADDDIV_OP", "SHIFT_OP", "COMPARE_OP", "EQUAL_OP", 
		"BITWISE_OP", "LOGIC_OP", "ASSIGNMENT_OP", "ARITHMETIC_ASSIGNMENT_OP", 
		"DIGIT", "HEX_DIGIT", "OCTAL_DIGIT", "INTEGER_SUFFIX", "EXPONENT", "FLOAT_SUFFIX", 
		"LETTER", "IDENTIFIER", "COMMENT", "WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'static'", "'uniform'", "'extern'", "'volatile'", 
		"'shared'", "'groupshared'", "'nointerpolation'", "'precise'", "'const'", 
		"'row_major'", "'column_major'", "'true'", "'false'", "'void'", "'_'", 
		"'|'", null, "'samplebuffer'", "'texturebuffer'", "'struct'", "'cbuffer'", 
		"'inbuffer'", "'outbuffer'", "'inoutbuffer'", "'if'", "'else'", "'?'", 
		"'for'", "'do'", "'while'", "'continue'", "'break'", "'return'", "'switch'", 
		"'case'", "'defualt'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", 
		"':'", "';'", "','", "'#'", "'dot'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "VERSOIN_PROFILE", "SMPBUFFER", "TXBUFFER", 
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


	public MidSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MidSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2I\u02cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0136\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\63\6\63\u01dd\n\63\r\63\16\63\u01de\3\63\5\63\u01e2\n\63\3\64\3\64\7"+
		"\64\u01e6\n\64\f\64\16\64\u01e9\13\64\3\64\5\64\u01ec\n\64\3\65\3\65\3"+
		"\65\3\65\6\65\u01f2\n\65\r\65\16\65\u01f3\3\65\5\65\u01f7\n\65\3\66\6"+
		"\66\u01fa\n\66\r\66\16\66\u01fb\3\66\3\66\7\66\u0200\n\66\f\66\16\66\u0203"+
		"\13\66\3\66\5\66\u0206\n\66\3\66\5\66\u0209\n\66\3\66\3\66\6\66\u020d"+
		"\n\66\r\66\16\66\u020e\3\66\5\66\u0212\n\66\3\66\5\66\u0215\n\66\3\66"+
		"\6\66\u0218\n\66\r\66\16\66\u0219\3\66\3\66\5\66\u021e\n\66\5\66\u0220"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0234\n\67\38\38\38\38\38\38\38\38\38\5"+
		"8\u023f\n8\39\39\39\39\59\u0245\n9\39\39\39\39\39\39\59\u024d\n9\3:\3"+
		":\3:\3:\5:\u0253\n:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\5>\u025f\n>\3?\3?\3"+
		"?\3?\3?\5?\u0266\n?\3@\3@\3@\3@\5@\u026c\n@\3A\3A\3B\3B\3B\3B\3B\3B\5"+
		"B\u0276\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0286\nD\3E\3"+
		"E\3F\5F\u028b\nF\3G\3G\3H\3H\3I\3I\5I\u0293\nI\3I\6I\u0296\nI\rI\16I\u0297"+
		"\3J\3J\3K\5K\u029d\nK\3L\3L\3L\7L\u02a2\nL\fL\16L\u02a5\13L\3M\3M\3M\3"+
		"M\7M\u02ab\nM\fM\16M\u02ae\13M\3M\3M\3M\3M\3M\3N\6N\u02b6\nN\rN\16N\u02b7"+
		"\3N\3N\3O\3O\3O\3O\7O\u02c0\nO\fO\16O\u02c3\13O\3O\5O\u02c6\nO\3O\3O\3"+
		"O\3O\3\u02ac\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097F\u0099G\u009b"+
		"H\u009dI\3\2\21\3\2\64\66\4\2##\u0080\u0080\5\2\'\',,\61\61\4\2--//\4"+
		"\2>>@@\5\2((``~~\3\2\62;\5\2\62;CHch\3\2\629\4\2WWww\4\2GGgg\4\2HHhh\4"+
		"\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u02ee\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u009f"+
		"\3\2\2\2\5\u00a7\3\2\2\2\7\u00ae\3\2\2\2\t\u00b6\3\2\2\2\13\u00bd\3\2"+
		"\2\2\r\u00c6\3\2\2\2\17\u00cd\3\2\2\2\21\u00d9\3\2\2\2\23\u00e9\3\2\2"+
		"\2\25\u00f1\3\2\2\2\27\u00f7\3\2\2\2\31\u0101\3\2\2\2\33\u010e\3\2\2\2"+
		"\35\u0113\3\2\2\2\37\u0119\3\2\2\2!\u011e\3\2\2\2#\u0120\3\2\2\2%\u0135"+
		"\3\2\2\2\'\u0137\3\2\2\2)\u0144\3\2\2\2+\u0152\3\2\2\2-\u0159\3\2\2\2"+
		"/\u0161\3\2\2\2\61\u016a\3\2\2\2\63\u0174\3\2\2\2\65\u0180\3\2\2\2\67"+
		"\u0183\3\2\2\29\u0188\3\2\2\2;\u018a\3\2\2\2=\u018e\3\2\2\2?\u0191\3\2"+
		"\2\2A\u0197\3\2\2\2C\u01a0\3\2\2\2E\u01a6\3\2\2\2G\u01ad\3\2\2\2I\u01b4"+
		"\3\2\2\2K\u01b9\3\2\2\2M\u01c1\3\2\2\2O\u01c3\3\2\2\2Q\u01c5\3\2\2\2S"+
		"\u01c7\3\2\2\2U\u01c9\3\2\2\2W\u01cb\3\2\2\2Y\u01cd\3\2\2\2[\u01cf\3\2"+
		"\2\2]\u01d1\3\2\2\2_\u01d3\3\2\2\2a\u01d5\3\2\2\2c\u01d7\3\2\2\2e\u01dc"+
		"\3\2\2\2g\u01e3\3\2\2\2i\u01ed\3\2\2\2k\u021f\3\2\2\2m\u0233\3\2\2\2o"+
		"\u023e\3\2\2\2q\u024c\3\2\2\2s\u0252\3\2\2\2u\u0254\3\2\2\2w\u0256\3\2"+
		"\2\2y\u0258\3\2\2\2{\u025e\3\2\2\2}\u0265\3\2\2\2\177\u026b\3\2\2\2\u0081"+
		"\u026d\3\2\2\2\u0083\u0275\3\2\2\2\u0085\u0277\3\2\2\2\u0087\u0285\3\2"+
		"\2\2\u0089\u0287\3\2\2\2\u008b\u028a\3\2\2\2\u008d\u028c\3\2\2\2\u008f"+
		"\u028e\3\2\2\2\u0091\u0290\3\2\2\2\u0093\u0299\3\2\2\2\u0095\u029c\3\2"+
		"\2\2\u0097\u029e\3\2\2\2\u0099\u02a6\3\2\2\2\u009b\u02b5\3\2\2\2\u009d"+
		"\u02bb\3\2\2\2\u009f\u00a0\7x\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7t\2"+
		"\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\4\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7e\2\2\u00ad"+
		"\6\3\2\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7h\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7o\2\2"+
		"\u00b5\b\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7z\2\2\u00b8\u00b9\7v"+
		"\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc\n"+
		"\3\2\2\2\u00bd\u00be\7x\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7n\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7n\2\2"+
		"\u00c4\u00c5\7g\2\2\u00c5\f\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7j"+
		"\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7f\2\2\u00cc\16\3\2\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0"+
		"\7q\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d4\7j\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7\u00d8\7f\2\2\u00d8\20\3\2\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7"+
		"q\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7v\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7q\2\2\u00e2"+
		"\u00e3\7n\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2"+
		"\u00e6\u00e7\7q\2\2\u00e7\u00e8\7p\2\2\u00e8\22\3\2\2\2\u00e9\u00ea\7"+
		"r\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7g\2\2\u00f0\24\3\2\2\2\u00f1\u00f2"+
		"\7e\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7u\2\2\u00f5"+
		"\u00f6\7v\2\2\u00f6\26\3\2\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7q\2\2\u00f9"+
		"\u00fa\7y\2\2\u00fa\u00fb\7a\2\2\u00fb\u00fc\7o\2\2\u00fc\u00fd\7c\2\2"+
		"\u00fd\u00fe\7l\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7t\2\2\u0100\30\3\2"+
		"\2\2\u0101\u0102\7e\2\2\u0102\u0103\7q\2\2\u0103\u0104\7n\2\2\u0104\u0105"+
		"\7w\2\2\u0105\u0106\7o\2\2\u0106\u0107\7p\2\2\u0107\u0108\7a\2\2\u0108"+
		"\u0109\7o\2\2\u0109\u010a\7c\2\2\u010a\u010b\7l\2\2\u010b\u010c\7q\2\2"+
		"\u010c\u010d\7t\2\2\u010d\32\3\2\2\2\u010e\u010f\7v\2\2\u010f\u0110\7"+
		"t\2\2\u0110\u0111\7w\2\2\u0111\u0112\7g\2\2\u0112\34\3\2\2\2\u0113\u0114"+
		"\7h\2\2\u0114\u0115\7c\2\2\u0115\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117"+
		"\u0118\7g\2\2\u0118\36\3\2\2\2\u0119\u011a\7x\2\2\u011a\u011b\7q\2\2\u011b"+
		"\u011c\7k\2\2\u011c\u011d\7f\2\2\u011d \3\2\2\2\u011e\u011f\7a\2\2\u011f"+
		"\"\3\2\2\2\u0120\u0121\7~\2\2\u0121$\3\2\2\2\u0122\u0123\7e\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\7t\2\2\u0125\u0136\7g\2\2\u0126\u0127\7e\2\2"+
		"\u0127\u0128\7q\2\2\u0128\u0129\7o\2\2\u0129\u012a\7r\2\2\u012a\u012b"+
		"\7c\2\2\u012b\u012c\7v\2\2\u012c\u012d\7k\2\2\u012d\u012e\7d\2\2\u012e"+
		"\u012f\7k\2\2\u012f\u0130\7n\2\2\u0130\u0131\7k\2\2\u0131\u0132\7v\2\2"+
		"\u0132\u0136\7{\2\2\u0133\u0134\7g\2\2\u0134\u0136\7u\2\2\u0135\u0122"+
		"\3\2\2\2\u0135\u0126\3\2\2\2\u0135\u0133\3\2\2\2\u0136&\3\2\2\2\u0137"+
		"\u0138\7u\2\2\u0138\u0139\7c\2\2\u0139\u013a\7o\2\2\u013a\u013b\7r\2\2"+
		"\u013b\u013c\7n\2\2\u013c\u013d\7g\2\2\u013d\u013e\7d\2\2\u013e\u013f"+
		"\7w\2\2\u013f\u0140\7h\2\2\u0140\u0141\7h\2\2\u0141\u0142\7g\2\2\u0142"+
		"\u0143\7t\2\2\u0143(\3\2\2\2\u0144\u0145\7v\2\2\u0145\u0146\7g\2\2\u0146"+
		"\u0147\7z\2\2\u0147\u0148\7v\2\2\u0148\u0149\7w\2\2\u0149\u014a\7t\2\2"+
		"\u014a\u014b\7g\2\2\u014b\u014c\7d\2\2\u014c\u014d\7w\2\2\u014d\u014e"+
		"\7h\2\2\u014e\u014f\7h\2\2\u014f\u0150\7g\2\2\u0150\u0151\7t\2\2\u0151"+
		"*\3\2\2\2\u0152\u0153\7u\2\2\u0153\u0154\7v\2\2\u0154\u0155\7t\2\2\u0155"+
		"\u0156\7w\2\2\u0156\u0157\7e\2\2\u0157\u0158\7v\2\2\u0158,\3\2\2\2\u0159"+
		"\u015a\7e\2\2\u015a\u015b\7d\2\2\u015b\u015c\7w\2\2\u015c\u015d\7h\2\2"+
		"\u015d\u015e\7h\2\2\u015e\u015f\7g\2\2\u015f\u0160\7t\2\2\u0160.\3\2\2"+
		"\2\u0161\u0162\7k\2\2\u0162\u0163\7p\2\2\u0163\u0164\7d\2\2\u0164\u0165"+
		"\7w\2\2\u0165\u0166\7h\2\2\u0166\u0167\7h\2\2\u0167\u0168\7g\2\2\u0168"+
		"\u0169\7t\2\2\u0169\60\3\2\2\2\u016a\u016b\7q\2\2\u016b\u016c\7w\2\2\u016c"+
		"\u016d\7v\2\2\u016d\u016e\7d\2\2\u016e\u016f\7w\2\2\u016f\u0170\7h\2\2"+
		"\u0170\u0171\7h\2\2\u0171\u0172\7g\2\2\u0172\u0173\7t\2\2\u0173\62\3\2"+
		"\2\2\u0174\u0175\7k\2\2\u0175\u0176\7p\2\2\u0176\u0177\7q\2\2\u0177\u0178"+
		"\7w\2\2\u0178\u0179\7v\2\2\u0179\u017a\7d\2\2\u017a\u017b\7w\2\2\u017b"+
		"\u017c\7h\2\2\u017c\u017d\7h\2\2\u017d\u017e\7g\2\2\u017e\u017f\7t\2\2"+
		"\u017f\64\3\2\2\2\u0180\u0181\7k\2\2\u0181\u0182\7h\2\2\u0182\66\3\2\2"+
		"\2\u0183\u0184\7g\2\2\u0184\u0185\7n\2\2\u0185\u0186\7u\2\2\u0186\u0187"+
		"\7g\2\2\u01878\3\2\2\2\u0188\u0189\7A\2\2\u0189:\3\2\2\2\u018a\u018b\7"+
		"h\2\2\u018b\u018c\7q\2\2\u018c\u018d\7t\2\2\u018d<\3\2\2\2\u018e\u018f"+
		"\7f\2\2\u018f\u0190\7q\2\2\u0190>\3\2\2\2\u0191\u0192\7y\2\2\u0192\u0193"+
		"\7j\2\2\u0193\u0194\7k\2\2\u0194\u0195\7n\2\2\u0195\u0196\7g\2\2\u0196"+
		"@\3\2\2\2\u0197\u0198\7e\2\2\u0198\u0199\7q\2\2\u0199\u019a\7p\2\2\u019a"+
		"\u019b\7v\2\2\u019b\u019c\7k\2\2\u019c\u019d\7p\2\2\u019d\u019e\7w\2\2"+
		"\u019e\u019f\7g\2\2\u019fB\3\2\2\2\u01a0\u01a1\7d\2\2\u01a1\u01a2\7t\2"+
		"\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7m\2\2\u01a5D\3\2"+
		"\2\2\u01a6\u01a7\7t\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa"+
		"\7w\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7p\2\2\u01acF\3\2\2\2\u01ad\u01ae"+
		"\7u\2\2\u01ae\u01af\7y\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1\7v\2\2\u01b1"+
		"\u01b2\7e\2\2\u01b2\u01b3\7j\2\2\u01b3H\3\2\2\2\u01b4\u01b5\7e\2\2\u01b5"+
		"\u01b6\7c\2\2\u01b6\u01b7\7u\2\2\u01b7\u01b8\7g\2\2\u01b8J\3\2\2\2\u01b9"+
		"\u01ba\7f\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7h\2\2\u01bc\u01bd\7w\2\2"+
		"\u01bd\u01be\7c\2\2\u01be\u01bf\7n\2\2\u01bf\u01c0\7v\2\2\u01c0L\3\2\2"+
		"\2\u01c1\u01c2\7*\2\2\u01c2N\3\2\2\2\u01c3\u01c4\7+\2\2\u01c4P\3\2\2\2"+
		"\u01c5\u01c6\7}\2\2\u01c6R\3\2\2\2\u01c7\u01c8\7\177\2\2\u01c8T\3\2\2"+
		"\2\u01c9\u01ca\7]\2\2\u01caV\3\2\2\2\u01cb\u01cc\7_\2\2\u01ccX\3\2\2\2"+
		"\u01cd\u01ce\7\60\2\2\u01ceZ\3\2\2\2\u01cf\u01d0\7<\2\2\u01d0\\\3\2\2"+
		"\2\u01d1\u01d2\7=\2\2\u01d2^\3\2\2\2\u01d3\u01d4\7.\2\2\u01d4`\3\2\2\2"+
		"\u01d5\u01d6\7%\2\2\u01d6b\3\2\2\2\u01d7\u01d8\7f\2\2\u01d8\u01d9\7q\2"+
		"\2\u01d9\u01da\7v\2\2\u01dad\3\2\2\2\u01db\u01dd\5\u0089E\2\u01dc\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01e2\5\u008fH\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2f\3\2\2\2\u01e3\u01e7\7^\2\2\u01e4\u01e6\5\u008dG\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\5\u008fH\2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ech\3\2\2\2\u01ed\u01ee\7^\2\2\u01ee"+
		"\u01ef\7z\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01f2\5\u008bF\2\u01f1\u01f0\3"+
		"\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01f7\5\u008fH\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7j\3\2\2\2\u01f8\u01fa\5\u0089E\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\u0201\5Y-\2\u01fe\u0200\5\u0089E\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0205\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0204\u0206\5\u0091I\2\u0205\u0204\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0209\5\u0093J\2\u0208\u0207"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0220\3\2\2\2\u020a\u020c\5Y-\2\u020b"+
		"\u020d\5\u0089E\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u0212\5\u0091I"+
		"\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215"+
		"\5\u0093J\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0220\3\2\2"+
		"\2\u0216\u0218\5\u0089E\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\5\u0091"+
		"I\2\u021c\u021e\5\u0093J\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u01f9\3\2\2\2\u021f\u020a\3\2\2\2\u021f\u0217\3\2"+
		"\2\2\u0220l\3\2\2\2\u0221\u0222\7d\2\2\u0222\u0223\7q\2\2\u0223\u0224"+
		"\7q\2\2\u0224\u0234\7n\2\2\u0225\u0226\7k\2\2\u0226\u0227\7p\2\2\u0227"+
		"\u0234\7v\2\2\u0228\u0229\7h\2\2\u0229\u022a\7n\2\2\u022a\u022b\7q\2\2"+
		"\u022b\u022c\7c\2\2\u022c\u0234\7v\2\2\u022d\u022e\7f\2\2\u022e\u022f"+
		"\7q\2\2\u022f\u0230\7w\2\2\u0230\u0231\7d\2\2\u0231\u0232\7n\2\2\u0232"+
		"\u0234\7g\2\2\u0233\u0221\3\2\2\2\u0233\u0225\3\2\2\2\u0233\u0228\3\2"+
		"\2\2\u0233\u022d\3\2\2\2\u0234n\3\2\2\2\u0235\u0236\5m\67\2\u0236\u0237"+
		"\t\2\2\2\u0237\u023f\3\2\2\2\u0238\u0239\7x\2\2\u0239\u023a\7g\2\2\u023a"+
		"\u023b\7e\2\2\u023b\u023c\7v\2\2\u023c\u023d\7q\2\2\u023d\u023f\7t\2\2"+
		"\u023e\u0235\3\2\2\2\u023e\u0238\3\2\2\2\u023fp\3\2\2\2\u0240\u0241\5"+
		"m\67\2\u0241\u0244\t\2\2\2\u0242\u0243\7z\2\2\u0243\u0245\t\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u024d\3\2\2\2\u0246\u0247\7o"+
		"\2\2\u0247\u0248\7c\2\2\u0248\u0249\7v\2\2\u0249\u024a\7t\2\2\u024a\u024b"+
		"\7k\2\2\u024b\u024d\7z\2\2\u024c\u0240\3\2\2\2\u024c\u0246\3\2\2\2\u024d"+
		"r\3\2\2\2\u024e\u024f\7-\2\2\u024f\u0253\7-\2\2\u0250\u0251\7/\2\2\u0251"+
		"\u0253\7/\2\2\u0252\u024e\3\2\2\2\u0252\u0250\3\2\2\2\u0253t\3\2\2\2\u0254"+
		"\u0255\t\3\2\2\u0255v\3\2\2\2\u0256\u0257\t\4\2\2\u0257x\3\2\2\2\u0258"+
		"\u0259\t\5\2\2\u0259z\3\2\2\2\u025a\u025b\7>\2\2\u025b\u025f\7>\2\2\u025c"+
		"\u025d\7@\2\2\u025d\u025f\7@\2\2\u025e\u025a\3\2\2\2\u025e\u025c\3\2\2"+
		"\2\u025f|\3\2\2\2\u0260\u0266\t\6\2\2\u0261\u0262\7>\2\2\u0262\u0266\7"+
		"?\2\2\u0263\u0264\7@\2\2\u0264\u0266\7?\2\2\u0265\u0260\3\2\2\2\u0265"+
		"\u0261\3\2\2\2\u0265\u0263\3\2\2\2\u0266~\3\2\2\2\u0267\u0268\7?\2\2\u0268"+
		"\u026c\7?\2\2\u0269\u026a\7#\2\2\u026a\u026c\7?\2\2\u026b\u0267\3\2\2"+
		"\2\u026b\u0269\3\2\2\2\u026c\u0080\3\2\2\2\u026d\u026e\t\7\2\2\u026e\u0082"+
		"\3\2\2\2\u026f\u0270\7(\2\2\u0270\u0276\7(\2\2\u0271\u0272\7`\2\2\u0272"+
		"\u0276\7`\2\2\u0273\u0274\7~\2\2\u0274\u0276\7~\2\2\u0275\u026f\3\2\2"+
		"\2\u0275\u0271\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0084\3\2\2\2\u0277\u0278"+
		"\7?\2\2\u0278\u0086\3\2\2\2\u0279\u027a\5w<\2\u027a\u027b\5\u0085C\2\u027b"+
		"\u0286\3\2\2\2\u027c\u027d\5y=\2\u027d\u027e\5\u0085C\2\u027e\u0286\3"+
		"\2\2\2\u027f\u0280\5{>\2\u0280\u0281\5\u0085C\2\u0281\u0286\3\2\2\2\u0282"+
		"\u0283\5\u0081A\2\u0283\u0284\5\u0085C\2\u0284\u0286\3\2\2\2\u0285\u0279"+
		"\3\2\2\2\u0285\u027c\3\2\2\2\u0285\u027f\3\2\2\2\u0285\u0282\3\2\2\2\u0286"+
		"\u0088\3\2\2\2\u0287\u0288\t\b\2\2\u0288\u008a\3\2\2\2\u0289\u028b\t\t"+
		"\2\2\u028a\u0289\3\2\2\2\u028b\u008c\3\2\2\2\u028c\u028d\t\n\2\2\u028d"+
		"\u008e\3\2\2\2\u028e\u028f\t\13\2\2\u028f\u0090\3\2\2\2\u0290\u0292\t"+
		"\f\2\2\u0291\u0293\5y=\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0295\3\2\2\2\u0294\u0296\4\62;\2\u0295\u0294\3\2\2\2\u0296\u0297\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0092\3\2\2\2\u0299"+
		"\u029a\t\r\2\2\u029a\u0094\3\2\2\2\u029b\u029d\t\16\2\2\u029c\u029b\3"+
		"\2\2\2\u029d\u0096\3\2\2\2\u029e\u02a3\5\u0095K\2\u029f\u02a2\5\u0095"+
		"K\2\u02a0\u02a2\5\u0089E\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u0098\3\2"+
		"\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\7\61\2\2\u02a7\u02a8\7,\2\2\u02a8"+
		"\u02ac\3\2\2\2\u02a9\u02ab\13\2\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ae\3"+
		"\2\2\2\u02ac\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b0\7,\2\2\u02b0\u02b1\7\61\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02b3\bM\2\2\u02b3\u009a\3\2\2\2\u02b4\u02b6\t\17\2\2\u02b5"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\bN\2\2\u02ba\u009c\3\2\2\2\u02bb"+
		"\u02bc\7\61\2\2\u02bc\u02bd\7\61\2\2\u02bd\u02c1\3\2\2\2\u02be\u02c0\n"+
		"\20\2\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c6\7\17"+
		"\2\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02c8\7\f\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\bO\2\2\u02ca\u009e\3\2"+
		"\2\2(\2\u0135\u01de\u01e1\u01e7\u01eb\u01f3\u01f6\u01fb\u0201\u0205\u0208"+
		"\u020e\u0211\u0214\u0219\u021d\u021f\u0233\u023e\u0244\u024c\u0252\u025e"+
		"\u0265\u026b\u0275\u0285\u028a\u0292\u0297\u029c\u02a1\u02a3\u02ac\u02b7"+
		"\u02c1\u02c5\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}