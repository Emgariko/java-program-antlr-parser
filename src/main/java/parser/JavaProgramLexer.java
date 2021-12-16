// Generated from /Users/emgariko/work/itmo/translation_methods/lab3/src/main/java/parser/JavaProgram.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SKIP_WHITESPACES=1, RETURN_KEYWORD=2, BOOL_TRUE=3, BOOL_FALSE=4, WHILE=5, 
		NEW=6, JAVA_PACKAGE=7, JAVA_IMPORT=8, CLASS=9, EXTENDS=10, IMPLEMENTS=11, 
		ACCESS_MODIFIER=12, STATIC=13, FINAL=14, WORD=15, INT=16, ASSIGN=17, SEMICOLON=18, 
		LBRACKET=19, RBRACKET=20, COMMA=21, QUOTE=22, DOT=23, LEFT_BRACE=24, RIGHT_BRACE=25, 
		LE=26, GR=27, EQ=28, LEQ=29, GEQ=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SKIP_WHITESPACES", "RETURN_KEYWORD", "BOOL_TRUE", "BOOL_FALSE", "WHILE", 
			"NEW", "JAVA_PACKAGE", "JAVA_IMPORT", "CLASS", "EXTENDS", "IMPLEMENTS", 
			"ACCESS_MODIFIER", "STATIC", "FINAL", "WORD", "INT", "ASSIGN", "SEMICOLON", 
			"LBRACKET", "RBRACKET", "COMMA", "QUOTE", "DOT", "LEFT_BRACE", "RIGHT_BRACE", 
			"LE", "GR", "EQ", "LEQ", "GEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'return'", "'true'", "'false'", "'while'", "'new'", "'package'", 
			"'import'", "'class'", "'extends'", "'implements'", null, "'static'", 
			"'final'", null, null, "'='", "';'", "'('", "')'", "','", "'\"'", "'.'", 
			"'{'", "'}'", "'<'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SKIP_WHITESPACES", "RETURN_KEYWORD", "BOOL_TRUE", "BOOL_FALSE", 
			"WHILE", "NEW", "JAVA_PACKAGE", "JAVA_IMPORT", "CLASS", "EXTENDS", "IMPLEMENTS", 
			"ACCESS_MODIFIER", "STATIC", "FINAL", "WORD", "INT", "ASSIGN", "SEMICOLON", 
			"LBRACKET", "RBRACKET", "COMMA", "QUOTE", "DOT", "LEFT_BRACE", "RIGHT_BRACE", 
			"LE", "GR", "EQ", "LEQ", "GEQ"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public JavaProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaProgram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2A"+
		"\n\2\r\2\16\2B\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00b1\n\20"+
		"\r\20\16\20\u00b2\3\21\6\21\u00b6\n\21\r\21\16\21\u00b7\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= \3\2\5\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u00dc\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\3@\3\2\2\2\5F\3\2\2\2\7M\3\2\2\2\tR\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2"+
		"\17b\3\2\2\2\21j\3\2\2\2\23q\3\2\2\2\25w\3\2\2\2\27\177\3\2\2\2\31\u00a0"+
		"\3\2\2\2\33\u00a2\3\2\2\2\35\u00a9\3\2\2\2\37\u00b0\3\2\2\2!\u00b5\3\2"+
		"\2\2#\u00b9\3\2\2\2%\u00bb\3\2\2\2\'\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c1"+
		"\3\2\2\2-\u00c3\3\2\2\2/\u00c5\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2"+
		"\2\65\u00cb\3\2\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d2\3\2\2\2=\u00d5"+
		"\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2D"+
		"E\b\2\2\2E\4\3\2\2\2FG\7t\2\2GH\7g\2\2HI\7v\2\2IJ\7w\2\2JK\7t\2\2KL\7"+
		"p\2\2L\6\3\2\2\2MN\7v\2\2NO\7t\2\2OP\7w\2\2PQ\7g\2\2Q\b\3\2\2\2RS\7h\2"+
		"\2ST\7c\2\2TU\7n\2\2UV\7u\2\2VW\7g\2\2W\n\3\2\2\2XY\7y\2\2YZ\7j\2\2Z["+
		"\7k\2\2[\\\7n\2\2\\]\7g\2\2]\f\3\2\2\2^_\7p\2\2_`\7g\2\2`a\7y\2\2a\16"+
		"\3\2\2\2bc\7r\2\2cd\7c\2\2de\7e\2\2ef\7m\2\2fg\7c\2\2gh\7i\2\2hi\7g\2"+
		"\2i\20\3\2\2\2jk\7k\2\2kl\7o\2\2lm\7r\2\2mn\7q\2\2no\7t\2\2op\7v\2\2p"+
		"\22\3\2\2\2qr\7e\2\2rs\7n\2\2st\7c\2\2tu\7u\2\2uv\7u\2\2v\24\3\2\2\2w"+
		"x\7g\2\2xy\7z\2\2yz\7v\2\2z{\7g\2\2{|\7p\2\2|}\7f\2\2}~\7u\2\2~\26\3\2"+
		"\2\2\177\u0080\7k\2\2\u0080\u0081\7o\2\2\u0081\u0082\7r\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7g\2\2\u0084\u0085\7o\2\2\u0085\u0086\7g\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7u\2\2\u0089\30\3\2\2\2\u008a"+
		"\u008b\7r\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7x\2\2"+
		"\u008e\u008f\7c\2\2\u008f\u0090\7v\2\2\u0090\u00a1\7g\2\2\u0091\u0092"+
		"\7r\2\2\u0092\u0093\7w\2\2\u0093\u0094\7d\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u00a1\7e\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009a\7q\2\2\u009a\u009b\7v\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7e\2\2\u009d\u009e\7v\2\2\u009e\u009f\7g\2\2\u009f\u00a1\7f\2\2\u00a0"+
		"\u008a\3\2\2\2\u00a0\u0091\3\2\2\2\u00a0\u0097\3\2\2\2\u00a1\32\3\2\2"+
		"\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7e\2\2\u00a8\34\3\2\2\2\u00a9\u00aa"+
		"\7h\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\36\3\2\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3 \3"+
		"\2\2\2\u00b4\u00b6\t\4\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7?\2\2"+
		"\u00ba$\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc&\3\2\2\2\u00bd\u00be\7*\2\2\u00be"+
		"(\3\2\2\2\u00bf\u00c0\7+\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7.\2\2\u00c2,"+
		"\3\2\2\2\u00c3\u00c4\7$\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6"+
		"\60\3\2\2\2\u00c7\u00c8\7}\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7\177\2\2"+
		"\u00ca\64\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7@\2"+
		"\2\u00ce8\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7?\2\2\u00d1:\3\2\2\2"+
		"\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7>\2"+
		"\2\u00d6\u00d7\7?\2\2\u00d7>\3\2\2\2\7\2B\u00a0\u00b2\u00b7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}