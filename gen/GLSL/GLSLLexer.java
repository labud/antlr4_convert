// Generated from D:/antlr4/ShaderParser/src/GLSL\GLSL.g4 by ANTLR 4.5.1
package GLSL;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Assignment_Op=15, Binary_Op=16, 
		Prefix_or_Postfix_Op=17, Unary_Op=18, Comma_Op=19, VETION_PROFILE=20, 
		Dimension=21, OPAQUE_NUMBER_TYPE=22, NUMBER_SIGN=23, IDENTIFIER=24, INT=25, 
		COMMENT=26, WS=27, LINE_COMMENT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "Assignment_Op", "Binary_Op", 
		"Prefix_or_Postfix_Op", "Unary_Op", "Comma_Op", "VETION_PROFILE", "Dimension", 
		"OPAQUE_NUMBER_TYPE", "NUMBER_SIGN", "LETTER", "DIGIT", "IDENTIFIER", 
		"INT", "COMMENT", "WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'bool'", "'int'", "'uint'", "'float'", "'double'", 
		"'void'", "'x'", "'vec'", "'dvec'", "'ivec'", "'uvec'", "'mat'", "'dmat'", 
		null, null, null, null, "','", null, null, null, "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Assignment_Op", "Binary_Op", "Prefix_or_Postfix_Op", 
		"Unary_Op", "Comma_Op", "VETION_PROFILE", "Dimension", "OPAQUE_NUMBER_TYPE", 
		"NUMBER_SIGN", "IDENTIFIER", "INT", "COMMENT", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "GLSL/GLSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00fd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u008a\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u009f\n\21\3\22\3\22\3\22\3\22\5\22\u00a5\n\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u00be\n\25\3\26\3\26\3\27\3\27\5\27"+
		"\u00c4\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u00cf\n"+
		"\33\f\33\16\33\u00d2\13\33\3\34\6\34\u00d5\n\34\r\34\16\34\u00d6\3\35"+
		"\3\35\3\35\3\35\7\35\u00dd\n\35\f\35\16\35\u00e0\13\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\6\36\u00e8\n\36\r\36\16\36\u00e9\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\7\37\u00f2\n\37\f\37\16\37\u00f5\13\37\3\37\5\37\u00f8\n\37\3"+
		"\37\3\37\3\37\3\37\3\u00de\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\2\63\2\65\32\67\339\34;\35=\36\3\2\n\6\2\'\',-//\61\61\4\2((~~\4\2>>"+
		"@@\6\2##--//\u0080\u0080\4\2kkww\5\2C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f"+
		"\17\17\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\3?\3\2\2\2\5G\3\2\2\2\7L\3\2\2\2\tP\3\2\2\2\13U\3\2\2\2\r[\3\2\2\2"+
		"\17b\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25m\3\2\2\2\27r\3\2\2\2\31w\3\2\2"+
		"\2\33|\3\2\2\2\35\u0080\3\2\2\2\37\u0089\3\2\2\2!\u009e\3\2\2\2#\u00a4"+
		"\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2"+
		"-\u00c3\3\2\2\2/\u00c5\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb"+
		"\3\2\2\2\67\u00d4\3\2\2\29\u00d8\3\2\2\2;\u00e7\3\2\2\2=\u00ed\3\2\2\2"+
		"?@\7x\2\2@A\7g\2\2AB\7t\2\2BC\7u\2\2CD\7k\2\2DE\7q\2\2EF\7p\2\2F\4\3\2"+
		"\2\2GH\7d\2\2HI\7q\2\2IJ\7q\2\2JK\7n\2\2K\6\3\2\2\2LM\7k\2\2MN\7p\2\2"+
		"NO\7v\2\2O\b\3\2\2\2PQ\7w\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2T\n\3\2\2\2UV"+
		"\7h\2\2VW\7n\2\2WX\7q\2\2XY\7c\2\2YZ\7v\2\2Z\f\3\2\2\2[\\\7f\2\2\\]\7"+
		"q\2\2]^\7w\2\2^_\7d\2\2_`\7n\2\2`a\7g\2\2a\16\3\2\2\2bc\7x\2\2cd\7q\2"+
		"\2de\7k\2\2ef\7f\2\2f\20\3\2\2\2gh\7z\2\2h\22\3\2\2\2ij\7x\2\2jk\7g\2"+
		"\2kl\7e\2\2l\24\3\2\2\2mn\7f\2\2no\7x\2\2op\7g\2\2pq\7e\2\2q\26\3\2\2"+
		"\2rs\7k\2\2st\7x\2\2tu\7g\2\2uv\7e\2\2v\30\3\2\2\2wx\7w\2\2xy\7x\2\2y"+
		"z\7g\2\2z{\7e\2\2{\32\3\2\2\2|}\7o\2\2}~\7c\2\2~\177\7v\2\2\177\34\3\2"+
		"\2\2\u0080\u0081\7f\2\2\u0081\u0082\7o\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7v\2\2\u0084\36\3\2\2\2\u0085\u008a\7?\2\2\u0086\u0087\5!\21\2\u0087"+
		"\u0088\7?\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2"+
		"\2\2\u008a \3\2\2\2\u008b\u009f\t\2\2\2\u008c\u008d\7>\2\2\u008d\u009f"+
		"\7>\2\2\u008e\u008f\7@\2\2\u008f\u009f\7@\2\2\u0090\u009f\t\3\2\2\u0091"+
		"\u0092\7~\2\2\u0092\u009f\7~\2\2\u0093\u0094\7(\2\2\u0094\u009f\7(\2\2"+
		"\u0095\u009f\t\4\2\2\u0096\u0097\7?\2\2\u0097\u009f\7?\2\2\u0098\u0099"+
		"\7#\2\2\u0099\u009f\7?\2\2\u009a\u009b\7>\2\2\u009b\u009f\7?\2\2\u009c"+
		"\u009d\7@\2\2\u009d\u009f\7?\2\2\u009e\u008b\3\2\2\2\u009e\u008c\3\2\2"+
		"\2\u009e\u008e\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0093"+
		"\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u0098\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009e\u009c\3\2\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7-\2\2"+
		"\u00a1\u00a5\7-\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a5\7/\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5$\3\2\2\2\u00a6\u00a7\t\5\2\2\u00a7"+
		"&\3\2\2\2\u00a8\u00a9\7.\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac"+
		"\7q\2\2\u00ac\u00ad\7t\2\2\u00ad\u00be\7g\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7c\2\2"+
		"\u00b3\u00b4\7v\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00be\7{\2\2\u00bb\u00bc\7g\2\2\u00bc\u00be\7u\2\2\u00bd\u00aa\3\2\2"+
		"\2\u00bd\u00ae\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be*\3\2\2\2\u00bf\u00c0"+
		"\4\64\66\2\u00c0,\3\2\2\2\u00c2\u00c4\t\6\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7%\2\2\u00c6\60\3\2\2\2\u00c7"+
		"\u00c8\t\7\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\4\62;\2\u00ca\64\3\2\2\2\u00cb"+
		"\u00d0\5\61\31\2\u00cc\u00cf\5\61\31\2\u00cd\u00cf\5\63\32\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\66\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\5\63\32"+
		"\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d78\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00da\7,\2\2\u00da"+
		"\u00de\3\2\2\2\u00db\u00dd\13\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\b\35\2\2\u00e5:\3\2\2\2\u00e6\u00e8\t\b\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\b\36\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7\61\2"+
		"\2\u00ee\u00ef\7\61\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\n\t\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\17\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\f"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b\37\2\2\u00fc>\3\2\2\2\17\2\u0089"+
		"\u009e\u00a4\u00bd\u00c3\u00ce\u00d0\u00d6\u00de\u00e9\u00f3\u00f7\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}