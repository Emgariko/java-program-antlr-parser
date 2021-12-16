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
		SKIP_WHITESPACES=1, BOOL_TRUE=2, BOOL_FALSE=3, WHILE=4, NEW=5, JAVA_PACKAGE=6, 
		JAVA_IMPORT=7, CLASS=8, EXTENDS=9, IMPLEMENTS=10, ACCESS_MODIFIER=11, 
		STATIC=12, FINAL=13, WORD=14, INT=15, ASSIGN=16, SEMICOLON=17, LBRACKET=18, 
		RBRACKET=19, COMMA=20, QUOTE=21, DOT=22, LEFT_BRACE=23, RIGHT_BRACE=24, 
		LE=25, GR=26, EQ=27, LEQ=28, GEQ=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SKIP_WHITESPACES", "BOOL_TRUE", "BOOL_FALSE", "WHILE", "NEW", "JAVA_PACKAGE", 
			"JAVA_IMPORT", "CLASS", "EXTENDS", "IMPLEMENTS", "ACCESS_MODIFIER", "STATIC", 
			"FINAL", "WORD", "INT", "ASSIGN", "SEMICOLON", "LBRACKET", "RBRACKET", 
			"COMMA", "QUOTE", "DOT", "LEFT_BRACE", "RIGHT_BRACE", "LE", "GR", "EQ", 
			"LEQ", "GEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'true'", "'false'", "'while'", "'new'", "'package'", "'import'", 
			"'class'", "'extends'", "'implements'", null, "'static'", "'final'", 
			null, null, "'='", "';'", "'('", "')'", "','", "'\"'", "'.'", "'{'", 
			"'}'", "'<'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SKIP_WHITESPACES", "BOOL_TRUE", "BOOL_FALSE", "WHILE", "NEW", 
			"JAVA_PACKAGE", "JAVA_IMPORT", "CLASS", "EXTENDS", "IMPLEMENTS", "ACCESS_MODIFIER", 
			"STATIC", "FINAL", "WORD", "INT", "ASSIGN", "SEMICOLON", "LBRACKET", 
			"RBRACKET", "COMMA", "QUOTE", "DOT", "LEFT_BRACE", "RIGHT_BRACE", "LE", 
			"GR", "EQ", "LEQ", "GEQ"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00cf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\6\2?\n\2\r"+
		"\2\16\2@\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\6\17\u00a8\n\17\r\17\16\17\u00a9\3\20\6\20\u00ad\n"+
		"\20\r\20\16\20\u00ae\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\5\5\2\13\f\17\17\"\"\4"+
		"\2C\\c|\3\2\62;\2\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\3>\3\2\2\2\5D\3\2\2\2\7I\3\2\2\2\tO\3\2\2"+
		"\2\13U\3\2\2\2\rY\3\2\2\2\17a\3\2\2\2\21h\3\2\2\2\23n\3\2\2\2\25v\3\2"+
		"\2\2\27\u0097\3\2\2\2\31\u0099\3\2\2\2\33\u00a0\3\2\2\2\35\u00a7\3\2\2"+
		"\2\37\u00ac\3\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%\u00b4\3\2\2\2\'\u00b6"+
		"\3\2\2\2)\u00b8\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61"+
		"\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2\29\u00c9"+
		"\3\2\2\2;\u00cc\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AB\3\2\2\2BC\b\2\2\2C\4\3\2\2\2DE\7v\2\2EF\7t\2\2FG\7w\2\2GH\7g\2"+
		"\2H\6\3\2\2\2IJ\7h\2\2JK\7c\2\2KL\7n\2\2LM\7u\2\2MN\7g\2\2N\b\3\2\2\2"+
		"OP\7y\2\2PQ\7j\2\2QR\7k\2\2RS\7n\2\2ST\7g\2\2T\n\3\2\2\2UV\7p\2\2VW\7"+
		"g\2\2WX\7y\2\2X\f\3\2\2\2YZ\7r\2\2Z[\7c\2\2[\\\7e\2\2\\]\7m\2\2]^\7c\2"+
		"\2^_\7i\2\2_`\7g\2\2`\16\3\2\2\2ab\7k\2\2bc\7o\2\2cd\7r\2\2de\7q\2\2e"+
		"f\7t\2\2fg\7v\2\2g\20\3\2\2\2hi\7e\2\2ij\7n\2\2jk\7c\2\2kl\7u\2\2lm\7"+
		"u\2\2m\22\3\2\2\2no\7g\2\2op\7z\2\2pq\7v\2\2qr\7g\2\2rs\7p\2\2st\7f\2"+
		"\2tu\7u\2\2u\24\3\2\2\2vw\7k\2\2wx\7o\2\2xy\7r\2\2yz\7n\2\2z{\7g\2\2{"+
		"|\7o\2\2|}\7g\2\2}~\7p\2\2~\177\7v\2\2\177\u0080\7u\2\2\u0080\26\3\2\2"+
		"\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7x\2\2\u0085\u0086\7c\2\2\u0086\u0087\7v\2\2\u0087\u0098\7g\2\2\u0088"+
		"\u0089\7r\2\2\u0089\u008a\7w\2\2\u008a\u008b\7d\2\2\u008b\u008c\7n\2\2"+
		"\u008c\u008d\7k\2\2\u008d\u0098\7e\2\2\u008e\u008f\7r\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7q\2\2\u0091\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7e\2\2\u0094\u0095\7v\2\2\u0095\u0096\7g\2\2\u0096\u0098\7f\2\2"+
		"\u0097\u0081\3\2\2\2\u0097\u0088\3\2\2\2\u0097\u008e\3\2\2\2\u0098\30"+
		"\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7k\2\2\u009e\u009f\7e\2\2\u009f\32\3\2\2\2\u00a0"+
		"\u00a1\7h\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7c\2\2"+
		"\u00a4\u00a5\7n\2\2\u00a5\34\3\2\2\2\u00a6\u00a8\t\3\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\36\3\2\2\2\u00ab\u00ad\t\4\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af \3\2\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3$\3\2\2\2\u00b4\u00b5"+
		"\7*\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7"+
		".\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7\60"+
		"\2\2\u00bd.\3\2\2\2\u00be\u00bf\7}\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7"+
		"\177\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7>\2\2\u00c3\64\3\2\2\2\u00c4\u00c5"+
		"\7@\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7\u00c8\7?\2\2\u00c88"+
		"\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb\7?\2\2\u00cb:\3\2\2\2\u00cc\u00cd"+
		"\7>\2\2\u00cd\u00ce\7?\2\2\u00ce<\3\2\2\2\7\2@\u0097\u00a9\u00ae\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}