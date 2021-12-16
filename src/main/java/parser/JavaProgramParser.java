// Generated from /Users/emgariko/work/itmo/translation_methods/lab3/src/main/java/parser/JavaProgram.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaProgramParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_java_package = 1, RULE_java_imports = 2, RULE_class_definition = 3, 
		RULE_java_extends = 4, RULE_java_implements = 5, RULE_class_body = 6, 
		RULE_class_member = 7, RULE_variable = 8, RULE_variable_type = 9, RULE_method = 10, 
		RULE_acceess_modifier = 11, RULE_static_modifier = 12, RULE_final_modifier = 13, 
		RULE_method_body = 14, RULE_value = 15, RULE_string = 16, RULE_int_value = 17, 
		RULE_method_call = 18, RULE_dot_separated_words = 19, RULE_args = 20, 
		RULE_new_call = 21, RULE_while_loop = 22, RULE_cond = 23, RULE_bool_value = 24, 
		RULE_comp = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "java_package", "java_imports", "class_definition", "java_extends", 
			"java_implements", "class_body", "class_member", "variable", "variable_type", 
			"method", "acceess_modifier", "static_modifier", "final_modifier", "method_body", 
			"value", "string", "int_value", "method_call", "dot_separated_words", 
			"args", "new_call", "while_loop", "cond", "bool_value", "comp"
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

	@Override
	public String getGrammarFileName() { return "JavaProgram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public String str;
		public Java_packageContext java_package;
		public Java_importsContext java_imports;
		public Class_definitionContext class_definition;
		public Java_packageContext java_package() {
			return getRuleContext(Java_packageContext.class,0);
		}
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public List<Java_importsContext> java_imports() {
			return getRuleContexts(Java_importsContext.class);
		}
		public Java_importsContext java_imports(int i) {
			return getRuleContext(Java_importsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		((ProgramContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((ProgramContext)_localctx).java_package = java_package();
			_localctx.str += ((ProgramContext)_localctx).java_package.str + "<br>\n";
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_IMPORT) {
				{
				{
				setState(54);
				((ProgramContext)_localctx).java_imports = java_imports();
				_localctx.str += ((ProgramContext)_localctx).java_imports.str;
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			((ProgramContext)_localctx).class_definition = class_definition();
			_localctx.str += "<br>\n" + ((ProgramContext)_localctx).class_definition.str;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_packageContext extends ParserRuleContext {
		public String str;
		public Token JAVA_PACKAGE;
		public Token x;
		public Token DOT;
		public Token y;
		public Token SEMICOLON;
		public TerminalNode JAVA_PACKAGE() { return getToken(JavaProgramParser.JAVA_PACKAGE, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaProgramParser.SEMICOLON, 0); }
		public List<TerminalNode> WORD() { return getTokens(JavaProgramParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavaProgramParser.WORD, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaProgramParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaProgramParser.DOT, i);
		}
		public Java_packageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterJava_package(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitJava_package(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitJava_package(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_packageContext java_package() throws RecognitionException {
		Java_packageContext _localctx = new Java_packageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_java_package);
		((Java_packageContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((Java_packageContext)_localctx).JAVA_PACKAGE = match(JAVA_PACKAGE);
			_localctx.str += "<span style=\"color: blue\">" + (((Java_packageContext)_localctx).JAVA_PACKAGE!=null?((Java_packageContext)_localctx).JAVA_PACKAGE.getText():null) + "</span>";
			setState(67);
			((Java_packageContext)_localctx).x = match(WORD);
			_localctx.str += " " + (((Java_packageContext)_localctx).x!=null?((Java_packageContext)_localctx).x.getText():null);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(69);
				((Java_packageContext)_localctx).DOT = match(DOT);
				setState(70);
				((Java_packageContext)_localctx).y = match(WORD);
				_localctx.str += (((Java_packageContext)_localctx).DOT!=null?((Java_packageContext)_localctx).DOT.getText():null) + (((Java_packageContext)_localctx).y!=null?((Java_packageContext)_localctx).y.getText():null);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			((Java_packageContext)_localctx).SEMICOLON = match(SEMICOLON);
			_localctx.str += (((Java_packageContext)_localctx).SEMICOLON!=null?((Java_packageContext)_localctx).SEMICOLON.getText():null) + "<br>\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_importsContext extends ParserRuleContext {
		public String str;
		public Token JAVA_IMPORT;
		public Token x;
		public Token DOT;
		public Token y;
		public Token SEMICOLON;
		public TerminalNode JAVA_IMPORT() { return getToken(JavaProgramParser.JAVA_IMPORT, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaProgramParser.SEMICOLON, 0); }
		public List<TerminalNode> WORD() { return getTokens(JavaProgramParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavaProgramParser.WORD, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaProgramParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaProgramParser.DOT, i);
		}
		public Java_importsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterJava_imports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitJava_imports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitJava_imports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_importsContext java_imports() throws RecognitionException {
		Java_importsContext _localctx = new Java_importsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_java_imports);
		((Java_importsContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((Java_importsContext)_localctx).JAVA_IMPORT = match(JAVA_IMPORT);
			_localctx.str += "<span style=\"color: blue\">" + (((Java_importsContext)_localctx).JAVA_IMPORT!=null?((Java_importsContext)_localctx).JAVA_IMPORT.getText():null) + "</span>";
			setState(82);
			((Java_importsContext)_localctx).x = match(WORD);
			_localctx.str += " " + (((Java_importsContext)_localctx).x!=null?((Java_importsContext)_localctx).x.getText():null);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(84);
				((Java_importsContext)_localctx).DOT = match(DOT);
				setState(85);
				((Java_importsContext)_localctx).y = match(WORD);
				_localctx.str += (((Java_importsContext)_localctx).DOT!=null?((Java_importsContext)_localctx).DOT.getText():null) + (((Java_importsContext)_localctx).y!=null?((Java_importsContext)_localctx).y.getText():null);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			((Java_importsContext)_localctx).SEMICOLON = match(SEMICOLON);
			_localctx.str += (((Java_importsContext)_localctx).SEMICOLON!=null?((Java_importsContext)_localctx).SEMICOLON.getText():null) + "<br>\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_definitionContext extends ParserRuleContext {
		public String str;
		public Acceess_modifierContext acceess_modifier;
		public Token CLASS;
		public Token WORD;
		public Java_extendsContext java_extends;
		public Java_implementsContext java_implements;
		public Token LEFT_BRACE;
		public Class_bodyContext class_body;
		public Token RIGHT_BRACE;
		public TerminalNode CLASS() { return getToken(JavaProgramParser.CLASS, 0); }
		public TerminalNode WORD() { return getToken(JavaProgramParser.WORD, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(JavaProgramParser.LEFT_BRACE, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(JavaProgramParser.RIGHT_BRACE, 0); }
		public Acceess_modifierContext acceess_modifier() {
			return getRuleContext(Acceess_modifierContext.class,0);
		}
		public Java_extendsContext java_extends() {
			return getRuleContext(Java_extendsContext.class,0);
		}
		public Java_implementsContext java_implements() {
			return getRuleContext(Java_implementsContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitClass_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_definition);
		((Class_definitionContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS_MODIFIER) {
				{
				setState(95);
				((Class_definitionContext)_localctx).acceess_modifier = acceess_modifier();
				_localctx.str += ((Class_definitionContext)_localctx).acceess_modifier.str + " ";
				}
			}

			setState(100);
			((Class_definitionContext)_localctx).CLASS = match(CLASS);
			_localctx.str += "<span style=\"color: blue\">" + (((Class_definitionContext)_localctx).CLASS!=null?((Class_definitionContext)_localctx).CLASS.getText():null) + "</span>";
			setState(102);
			((Class_definitionContext)_localctx).WORD = match(WORD);
			_localctx.str += " " + (((Class_definitionContext)_localctx).WORD!=null?((Class_definitionContext)_localctx).WORD.getText():null);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(104);
				((Class_definitionContext)_localctx).java_extends = java_extends();
				_localctx.str += " " + ((Class_definitionContext)_localctx).java_extends.str;
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(109);
				((Class_definitionContext)_localctx).java_implements = java_implements();
				_localctx.str += " " + ((Class_definitionContext)_localctx).java_implements.str;
				}
			}

			setState(114);
			((Class_definitionContext)_localctx).LEFT_BRACE = match(LEFT_BRACE);
			setState(115);
			((Class_definitionContext)_localctx).class_body = class_body(4);
			setState(116);
			((Class_definitionContext)_localctx).RIGHT_BRACE = match(RIGHT_BRACE);
			_localctx.str += " " + (((Class_definitionContext)_localctx).LEFT_BRACE!=null?((Class_definitionContext)_localctx).LEFT_BRACE.getText():null) + "<br>\n" + ((Class_definitionContext)_localctx).class_body.str + (((Class_definitionContext)_localctx).RIGHT_BRACE!=null?((Class_definitionContext)_localctx).RIGHT_BRACE.getText():null) + "<br>\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_extendsContext extends ParserRuleContext {
		public String str;
		public Token EXTENDS;
		public Token x;
		public TerminalNode EXTENDS() { return getToken(JavaProgramParser.EXTENDS, 0); }
		public TerminalNode WORD() { return getToken(JavaProgramParser.WORD, 0); }
		public Java_extendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_extends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterJava_extends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitJava_extends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitJava_extends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_extendsContext java_extends() throws RecognitionException {
		Java_extendsContext _localctx = new Java_extendsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_java_extends);
		((Java_extendsContext)_localctx).str =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((Java_extendsContext)_localctx).EXTENDS = match(EXTENDS);
			setState(120);
			((Java_extendsContext)_localctx).x = match(WORD);
			_localctx.str += (((Java_extendsContext)_localctx).EXTENDS!=null?((Java_extendsContext)_localctx).EXTENDS.getText():null) + " " +
			            "<span style=\"color: blue\">" + (((Java_extendsContext)_localctx).x!=null?((Java_extendsContext)_localctx).x.getText():null) + "</span>";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_implementsContext extends ParserRuleContext {
		public String str;
		public Token IMPLEMENTS;
		public Token x;
		public Token COMMA;
		public Token y;
		public TerminalNode IMPLEMENTS() { return getToken(JavaProgramParser.IMPLEMENTS, 0); }
		public List<TerminalNode> WORD() { return getTokens(JavaProgramParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavaProgramParser.WORD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaProgramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaProgramParser.COMMA, i);
		}
		public Java_implementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_implements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterJava_implements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitJava_implements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitJava_implements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_implementsContext java_implements() throws RecognitionException {
		Java_implementsContext _localctx = new Java_implementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_java_implements);
		((Java_implementsContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((Java_implementsContext)_localctx).IMPLEMENTS = match(IMPLEMENTS);
			setState(124);
			((Java_implementsContext)_localctx).x = match(WORD);
			_localctx.str += (((Java_implementsContext)_localctx).IMPLEMENTS!=null?((Java_implementsContext)_localctx).IMPLEMENTS.getText():null) + " " +
			                "<span style=\"color: blue\">" + (((Java_implementsContext)_localctx).x!=null?((Java_implementsContext)_localctx).x.getText():null) + "</span>";
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				((Java_implementsContext)_localctx).COMMA = match(COMMA);
				setState(127);
				((Java_implementsContext)_localctx).y = match(WORD);
				_localctx.str += (((Java_implementsContext)_localctx).COMMA!=null?((Java_implementsContext)_localctx).COMMA.getText():null) + " " +
				                    "<span style=\"color: blue\">" + (((Java_implementsContext)_localctx).y!=null?((Java_implementsContext)_localctx).y.getText():null) + "</span>";
				}
				}
				setState(133);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public int indent;
		public String str;
		public Class_memberContext x;
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Class_bodyContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body(int indent) throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState(), indent);
		enterRule(_localctx, 12, RULE_class_body);
		((Class_bodyContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS_MODIFIER) | (1L << STATIC) | (1L << FINAL) | (1L << WORD))) != 0)) {
				{
				{
				setState(134);
				((Class_bodyContext)_localctx).x = class_member(indent);
				_localctx.str += ((Class_bodyContext)_localctx).x.str;
				}
				}
				setState(141);
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

	public static class Class_memberContext extends ParserRuleContext {
		public int indent;
		public String str;
		public VariableContext variable;
		public MethodContext method;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Class_memberContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterClass_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitClass_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitClass_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member(int indent) throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState(), indent);
		enterRule(_localctx, 14, RULE_class_member);
		((Class_memberContext)_localctx).str =  "&nbsp;".repeat(indent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(142);
				((Class_memberContext)_localctx).variable = variable(0);
				_localctx.str += ((Class_memberContext)_localctx).variable.str;
				}
				break;
			case 2:
				{
				setState(145);
				((Class_memberContext)_localctx).method = method(indent);
				_localctx.str += ((Class_memberContext)_localctx).method.str;
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

	public static class VariableContext extends ParserRuleContext {
		public int indent;
		public String str;
		public Acceess_modifierContext acceess_modifier;
		public Static_modifierContext static_modifier;
		public Final_modifierContext final_modifier;
		public Variable_typeContext variable_type;
		public Token x;
		public Token ASSIGN;
		public ValueContext xx;
		public Token y;
		public Token COMMA;
		public ValueContext yy;
		public Token SEMICOLON;
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(JavaProgramParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(JavaProgramParser.ASSIGN, i);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaProgramParser.SEMICOLON, 0); }
		public Acceess_modifierContext acceess_modifier() {
			return getRuleContext(Acceess_modifierContext.class,0);
		}
		public Static_modifierContext static_modifier() {
			return getRuleContext(Static_modifierContext.class,0);
		}
		public Final_modifierContext final_modifier() {
			return getRuleContext(Final_modifierContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(JavaProgramParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavaProgramParser.WORD, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaProgramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaProgramParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable(int indent) throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState(), indent);
		enterRule(_localctx, 16, RULE_variable);
		((VariableContext)_localctx).str =  "&nbsp;".repeat(indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS_MODIFIER) {
				{
				setState(150);
				((VariableContext)_localctx).acceess_modifier = acceess_modifier();
				_localctx.str += ((VariableContext)_localctx).acceess_modifier.str + " ";
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(155);
				((VariableContext)_localctx).static_modifier = static_modifier();
				_localctx.str += ((VariableContext)_localctx).static_modifier.str + " ";
				}
			}

			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(160);
				((VariableContext)_localctx).final_modifier = final_modifier();
				_localctx.str += ((VariableContext)_localctx).final_modifier.str + " ";
				}
				break;
			}
			setState(165);
			((VariableContext)_localctx).variable_type = variable_type();
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(166);
				((VariableContext)_localctx).x = match(WORD);
				setState(167);
				((VariableContext)_localctx).ASSIGN = match(ASSIGN);
				setState(168);
				((VariableContext)_localctx).xx = value();
				_localctx.str += ((VariableContext)_localctx).variable_type.str + " " + (((VariableContext)_localctx).x!=null?((VariableContext)_localctx).x.getText():null) + " " + (((VariableContext)_localctx).ASSIGN!=null?((VariableContext)_localctx).ASSIGN.getText():null) + " " + ((VariableContext)_localctx).xx.str;
				}
				break;
			case 2:
				{
				setState(171);
				((VariableContext)_localctx).y = match(WORD);
				_localctx.str += ((VariableContext)_localctx).variable_type.str + " " + (((VariableContext)_localctx).y!=null?((VariableContext)_localctx).y.getText():null);
				}
				break;
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				((VariableContext)_localctx).COMMA = match(COMMA);
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(176);
					((VariableContext)_localctx).y = match(WORD);
					setState(177);
					((VariableContext)_localctx).ASSIGN = match(ASSIGN);
					setState(178);
					((VariableContext)_localctx).yy = value();
					_localctx.str += (((VariableContext)_localctx).COMMA!=null?((VariableContext)_localctx).COMMA.getText():null) + " " + (((VariableContext)_localctx).y!=null?((VariableContext)_localctx).y.getText():null) + " " + (((VariableContext)_localctx).ASSIGN!=null?((VariableContext)_localctx).ASSIGN.getText():null) + " " + ((VariableContext)_localctx).yy.str;
					}
					break;
				case 2:
					{
					setState(181);
					((VariableContext)_localctx).y = match(WORD);
					_localctx.str += (((VariableContext)_localctx).COMMA!=null?((VariableContext)_localctx).COMMA.getText():null) + " " + (((VariableContext)_localctx).y!=null?((VariableContext)_localctx).y.getText():null);
					}
					break;
				}
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(190);
			((VariableContext)_localctx).SEMICOLON = match(SEMICOLON);
			_localctx.str += (((VariableContext)_localctx).SEMICOLON!=null?((VariableContext)_localctx).SEMICOLON.getText():null) + "<br>\n";
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

	public static class Variable_typeContext extends ParserRuleContext {
		public String str;
		public Token WORD;
		public TerminalNode WORD() { return getToken(JavaProgramParser.WORD, 0); }
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterVariable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitVariable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitVariable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_type);
		((Variable_typeContext)_localctx).str =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((Variable_typeContext)_localctx).WORD = match(WORD);
			_localctx.str += "<span style=\"color: blue\">" + (((Variable_typeContext)_localctx).WORD!=null?((Variable_typeContext)_localctx).WORD.getText():null) + "</span>";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public int indent;
		public String str;
		public Acceess_modifierContext acceess_modifier;
		public Static_modifierContext static_modifier;
		public Final_modifierContext final_modifier;
		public Variable_typeContext vt;
		public Token w;
		public Token LBRACKET;
		public Variable_typeContext tx;
		public Token x;
		public Token COMMA;
		public Variable_typeContext ty;
		public Token y;
		public Token RBRACKET;
		public Token LEFT_BRACE;
		public Method_bodyContext method_body;
		public Token RIGHT_BRACE;
		public TerminalNode LBRACKET() { return getToken(JavaProgramParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(JavaProgramParser.RBRACKET, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(JavaProgramParser.LEFT_BRACE, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(JavaProgramParser.RIGHT_BRACE, 0); }
		public List<Variable_typeContext> variable_type() {
			return getRuleContexts(Variable_typeContext.class);
		}
		public Variable_typeContext variable_type(int i) {
			return getRuleContext(Variable_typeContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(JavaProgramParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavaProgramParser.WORD, i);
		}
		public Acceess_modifierContext acceess_modifier() {
			return getRuleContext(Acceess_modifierContext.class,0);
		}
		public Static_modifierContext static_modifier() {
			return getRuleContext(Static_modifierContext.class,0);
		}
		public Final_modifierContext final_modifier() {
			return getRuleContext(Final_modifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaProgramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaProgramParser.COMMA, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method(int indent) throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState(), indent);
		enterRule(_localctx, 20, RULE_method);
		((MethodContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS_MODIFIER) {
				{
				setState(196);
				((MethodContext)_localctx).acceess_modifier = acceess_modifier();
				_localctx.str += ((MethodContext)_localctx).acceess_modifier.str + " ";
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(201);
				((MethodContext)_localctx).static_modifier = static_modifier();
				_localctx.str += ((MethodContext)_localctx).static_modifier.str + " " ;
				}
			}

			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(206);
				((MethodContext)_localctx).final_modifier = final_modifier();
				_localctx.str += ((MethodContext)_localctx).final_modifier.str + " ";
				}
				break;
			}
			setState(211);
			((MethodContext)_localctx).vt = variable_type();
			setState(212);
			((MethodContext)_localctx).w = match(WORD);
			setState(213);
			((MethodContext)_localctx).LBRACKET = match(LBRACKET);
			_localctx.str += ((MethodContext)_localctx).vt.str + " " + (((MethodContext)_localctx).w!=null?((MethodContext)_localctx).w.getText():null) + (((MethodContext)_localctx).LBRACKET!=null?((MethodContext)_localctx).LBRACKET.getText():null);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(215);
				((MethodContext)_localctx).tx = variable_type();
				setState(216);
				((MethodContext)_localctx).x = match(WORD);
				_localctx.str += ((MethodContext)_localctx).tx.str + " " + (((MethodContext)_localctx).x!=null?((MethodContext)_localctx).x.getText():null);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(218);
					((MethodContext)_localctx).COMMA = match(COMMA);
					setState(219);
					((MethodContext)_localctx).ty = variable_type();
					setState(220);
					((MethodContext)_localctx).y = match(WORD);
					_localctx.str += (((MethodContext)_localctx).COMMA!=null?((MethodContext)_localctx).COMMA.getText():null) + " " + ((MethodContext)_localctx).ty.str + " " + (((MethodContext)_localctx).y!=null?((MethodContext)_localctx).y.getText():null);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(230);
			((MethodContext)_localctx).RBRACKET = match(RBRACKET);
			setState(231);
			((MethodContext)_localctx).LEFT_BRACE = match(LEFT_BRACE);
			_localctx.str += (((MethodContext)_localctx).RBRACKET!=null?((MethodContext)_localctx).RBRACKET.getText():null) + " " + (((MethodContext)_localctx).LEFT_BRACE!=null?((MethodContext)_localctx).LEFT_BRACE.getText():null) + "<br>";
			setState(233);
			((MethodContext)_localctx).method_body = method_body(indent + 4);
			_localctx.str += ((MethodContext)_localctx).method_body.str;
			setState(235);
			((MethodContext)_localctx).RIGHT_BRACE = match(RIGHT_BRACE);
			_localctx.str += "&nbsp;".repeat(indent) + (((MethodContext)_localctx).RIGHT_BRACE!=null?((MethodContext)_localctx).RIGHT_BRACE.getText():null) + "<br>\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Acceess_modifierContext extends ParserRuleContext {
		public String str;
		public Token ACCESS_MODIFIER;
		public TerminalNode ACCESS_MODIFIER() { return getToken(JavaProgramParser.ACCESS_MODIFIER, 0); }
		public Acceess_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceess_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterAcceess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitAcceess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitAcceess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acceess_modifierContext acceess_modifier() throws RecognitionException {
		Acceess_modifierContext _localctx = new Acceess_modifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_acceess_modifier);
		((Acceess_modifierContext)_localctx).str =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((Acceess_modifierContext)_localctx).ACCESS_MODIFIER = match(ACCESS_MODIFIER);
			_localctx.str += "<span style=\"color: blue\">" + (((Acceess_modifierContext)_localctx).ACCESS_MODIFIER!=null?((Acceess_modifierContext)_localctx).ACCESS_MODIFIER.getText():null) + "</span>" + " ";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_modifierContext extends ParserRuleContext {
		public String str;
		public Token STATIC;
		public TerminalNode STATIC() { return getToken(JavaProgramParser.STATIC, 0); }
		public Static_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterStatic_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitStatic_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitStatic_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_modifierContext static_modifier() throws RecognitionException {
		Static_modifierContext _localctx = new Static_modifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_static_modifier);
		((Static_modifierContext)_localctx).str =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(241);
			((Static_modifierContext)_localctx).STATIC = match(STATIC);
			_localctx.str += "<span style=\"color: blue\">" + (((Static_modifierContext)_localctx).STATIC!=null?((Static_modifierContext)_localctx).STATIC.getText():null) + "</span>" + " ";
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

	public static class Final_modifierContext extends ParserRuleContext {
		public String str;
		public Token FINAL;
		public TerminalNode FINAL() { return getToken(JavaProgramParser.FINAL, 0); }
		public Final_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterFinal_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitFinal_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitFinal_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Final_modifierContext final_modifier() throws RecognitionException {
		Final_modifierContext _localctx = new Final_modifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_final_modifier);
		((Final_modifierContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(244);
				((Final_modifierContext)_localctx).FINAL = match(FINAL);
				_localctx.str += "<span style=\"color: blue\">" + (((Final_modifierContext)_localctx).FINAL!=null?((Final_modifierContext)_localctx).FINAL.getText():null) + "</span>" + " ";
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

	public static class Method_bodyContext extends ParserRuleContext {
		public int indent;
		public String str;
		public VariableContext variable;
		public Method_callContext method_call;
		public Token SEMICOLON;
		public New_callContext new_call;
		public While_loopContext while_loop;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Method_callContext> method_call() {
			return getRuleContexts(Method_callContext.class);
		}
		public Method_callContext method_call(int i) {
			return getRuleContext(Method_callContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaProgramParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaProgramParser.SEMICOLON, i);
		}
		public List<New_callContext> new_call() {
			return getRuleContexts(New_callContext.class);
		}
		public New_callContext new_call(int i) {
			return getRuleContext(New_callContext.class,i);
		}
		public List<While_loopContext> while_loop() {
			return getRuleContexts(While_loopContext.class);
		}
		public While_loopContext while_loop(int i) {
			return getRuleContext(While_loopContext.class,i);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Method_bodyContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body(int indent) throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState(), indent);
		enterRule(_localctx, 28, RULE_method_body);
		((Method_bodyContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << NEW) | (1L << ACCESS_MODIFIER) | (1L << STATIC) | (1L << FINAL) | (1L << WORD))) != 0)) {
				{
				setState(262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(248);
					((Method_bodyContext)_localctx).variable = variable(indent);
					_localctx.str += ((Method_bodyContext)_localctx).variable.str;
					}
					break;
				case 2:
					{
					{
					setState(251);
					((Method_bodyContext)_localctx).method_call = method_call(indent);
					setState(252);
					((Method_bodyContext)_localctx).SEMICOLON = match(SEMICOLON);
					_localctx.str += ((Method_bodyContext)_localctx).method_call.str + (((Method_bodyContext)_localctx).SEMICOLON!=null?((Method_bodyContext)_localctx).SEMICOLON.getText():null) + "<br>\n";
					}
					}
					break;
				case 3:
					{
					{
					setState(255);
					((Method_bodyContext)_localctx).new_call = new_call(indent);
					setState(256);
					((Method_bodyContext)_localctx).SEMICOLON = match(SEMICOLON);
					_localctx.str += ((Method_bodyContext)_localctx).new_call.str + (((Method_bodyContext)_localctx).SEMICOLON!=null?((Method_bodyContext)_localctx).SEMICOLON.getText():null) + "<br>\n";
					}
					}
					break;
				case 4:
					{
					{
					setState(259);
					((Method_bodyContext)_localctx).while_loop = while_loop(indent);
					_localctx.str += ((Method_bodyContext)_localctx).while_loop.str;
					}
					}
					break;
				}
				}
				setState(266);
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

	public static class ValueContext extends ParserRuleContext {
		public String str;
		public Int_valueContext int_value;
		public StringContext string;
		public Method_callContext method_call;
		public New_callContext new_call;
		public Token WORD;
		public Int_valueContext int_value() {
			return getRuleContext(Int_valueContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public New_callContext new_call() {
			return getRuleContext(New_callContext.class,0);
		}
		public TerminalNode WORD() { return getToken(JavaProgramParser.WORD, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		((ValueContext)_localctx).str =  "";
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				((ValueContext)_localctx).int_value = int_value();
				_localctx.str += ((ValueContext)_localctx).int_value.str;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				((ValueContext)_localctx).string = string();
				_localctx.str += ((ValueContext)_localctx).string.str;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				((ValueContext)_localctx).method_call = method_call(0);
				_localctx.str += ((ValueContext)_localctx).method_call.str;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				((ValueContext)_localctx).new_call = new_call(0);
				_localctx.str += ((ValueContext)_localctx).new_call.str;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				((ValueContext)_localctx).WORD = match(WORD);
				_localctx.str += (((ValueContext)_localctx).WORD!=null?((ValueContext)_localctx).WORD.getText():null);
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

	public static class StringContext extends ParserRuleContext {
		public String str;
		public Token x;
		public Token WORD;
		public Int_valueContext int_value;
		public Token y;
		public List<TerminalNode> QUOTE() { return getTokens(JavaProgramParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(JavaProgramParser.QUOTE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(JavaProgramParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavaProgramParser.WORD, i);
		}
		public List<Int_valueContext> int_value() {
			return getRuleContexts(Int_valueContext.class);
		}
		public Int_valueContext int_value(int i) {
			return getRuleContext(Int_valueContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		((StringContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((StringContext)_localctx).x = match(QUOTE);
			_localctx.str += (((StringContext)_localctx).x!=null?((StringContext)_localctx).x.getText():null);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD || _la==INT) {
				{
				setState(290);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(285);
					((StringContext)_localctx).WORD = match(WORD);
					_localctx.str +=
					            "<span style=\"color: rgb(3 106 7)\">" + (((StringContext)_localctx).WORD!=null?((StringContext)_localctx).WORD.getText():null) + "</span>";
					}
					break;
				case INT:
					{
					setState(287);
					((StringContext)_localctx).int_value = int_value();
					_localctx.str += ((StringContext)_localctx).int_value.str;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			((StringContext)_localctx).y = match(QUOTE);
			_localctx.str += (((StringContext)_localctx).y!=null?((StringContext)_localctx).y.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_valueContext extends ParserRuleContext {
		public String str;
		public Token INT;
		public TerminalNode INT() { return getToken(JavaProgramParser.INT, 0); }
		public Int_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterInt_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitInt_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitInt_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_valueContext int_value() throws RecognitionException {
		Int_valueContext _localctx = new Int_valueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_int_value);
		((Int_valueContext)_localctx).str =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((Int_valueContext)_localctx).INT = match(INT);
			_localctx.str += "<span style=\"color: #a04caf\">" + (((Int_valueContext)_localctx).INT!=null?((Int_valueContext)_localctx).INT.getText():null) + "</span>";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public int indent;
		public String str;
		public Dot_separated_wordsContext dt;
		public Token LBRACKET;
		public ArgsContext args;
		public Token RBRACKET;
		public TerminalNode LBRACKET() { return getToken(JavaProgramParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(JavaProgramParser.RBRACKET, 0); }
		public Dot_separated_wordsContext dot_separated_words() {
			return getRuleContext(Dot_separated_wordsContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Method_callContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call(int indent) throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState(), indent);
		enterRule(_localctx, 36, RULE_method_call);
		((Method_callContext)_localctx).str =  "&nbsp;".repeat(indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((Method_callContext)_localctx).dt = dot_separated_words();
			setState(302);
			((Method_callContext)_localctx).LBRACKET = match(LBRACKET);
			_localctx.str += ((Method_callContext)_localctx).dt.str + (((Method_callContext)_localctx).LBRACKET!=null?((Method_callContext)_localctx).LBRACKET.getText():null);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << WORD) | (1L << INT) | (1L << QUOTE))) != 0)) {
				{
				setState(304);
				((Method_callContext)_localctx).args = args();
				_localctx.str += ((Method_callContext)_localctx).args.str;
				}
			}

			setState(309);
			((Method_callContext)_localctx).RBRACKET = match(RBRACKET);
			_localctx.str += (((Method_callContext)_localctx).RBRACKET!=null?((Method_callContext)_localctx).RBRACKET.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_separated_wordsContext extends ParserRuleContext {
		public String str;
		public Token x;
		public Token DOT;
		public Token y;
		public List<TerminalNode> WORD() { return getTokens(JavaProgramParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavaProgramParser.WORD, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaProgramParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaProgramParser.DOT, i);
		}
		public Dot_separated_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_separated_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterDot_separated_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitDot_separated_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitDot_separated_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_separated_wordsContext dot_separated_words() throws RecognitionException {
		Dot_separated_wordsContext _localctx = new Dot_separated_wordsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dot_separated_words);
		((Dot_separated_wordsContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((Dot_separated_wordsContext)_localctx).x = match(WORD);
			_localctx.str += " " + (((Dot_separated_wordsContext)_localctx).x!=null?((Dot_separated_wordsContext)_localctx).x.getText():null);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(314);
				((Dot_separated_wordsContext)_localctx).DOT = match(DOT);
				setState(315);
				((Dot_separated_wordsContext)_localctx).y = match(WORD);
				_localctx.str += (((Dot_separated_wordsContext)_localctx).DOT!=null?((Dot_separated_wordsContext)_localctx).DOT.getText():null) + (((Dot_separated_wordsContext)_localctx).y!=null?((Dot_separated_wordsContext)_localctx).y.getText():null);
				}
				}
				setState(321);
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

	public static class ArgsContext extends ParserRuleContext {
		public String str;
		public ValueContext x;
		public Token COMMA;
		public ValueContext y;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaProgramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaProgramParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		((ArgsContext)_localctx).str =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			((ArgsContext)_localctx).x = value();
			_localctx.str += ((ArgsContext)_localctx).x.str;
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(324);
				((ArgsContext)_localctx).COMMA = match(COMMA);
				setState(325);
				((ArgsContext)_localctx).y = value();
				_localctx.str += (((ArgsContext)_localctx).COMMA!=null?((ArgsContext)_localctx).COMMA.getText():null) + " " + ((ArgsContext)_localctx).y.str;
				}
				}
				setState(332);
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

	public static class New_callContext extends ParserRuleContext {
		public int indent;
		public String str;
		public Token NEW;
		public Token WORD;
		public Token LBRACKET;
		public ArgsContext args;
		public Token RBRACKET;
		public TerminalNode NEW() { return getToken(JavaProgramParser.NEW, 0); }
		public TerminalNode WORD() { return getToken(JavaProgramParser.WORD, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaProgramParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(JavaProgramParser.RBRACKET, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public New_callContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public New_callContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_new_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterNew_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitNew_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitNew_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_callContext new_call(int indent) throws RecognitionException {
		New_callContext _localctx = new New_callContext(_ctx, getState(), indent);
		enterRule(_localctx, 42, RULE_new_call);
		((New_callContext)_localctx).str =  "&nbsp;".repeat(indent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((New_callContext)_localctx).NEW = match(NEW);
			_localctx.str += "<span style=\"color: blue\">" + (((New_callContext)_localctx).NEW!=null?((New_callContext)_localctx).NEW.getText():null) + "</span>" + " ";
			setState(335);
			((New_callContext)_localctx).WORD = match(WORD);
			setState(336);
			((New_callContext)_localctx).LBRACKET = match(LBRACKET);
			_localctx.str += (((New_callContext)_localctx).WORD!=null?((New_callContext)_localctx).WORD.getText():null) + (((New_callContext)_localctx).LBRACKET!=null?((New_callContext)_localctx).LBRACKET.getText():null);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << WORD) | (1L << INT) | (1L << QUOTE))) != 0)) {
				{
				setState(338);
				((New_callContext)_localctx).args = args();
				_localctx.str += ((New_callContext)_localctx).args.str;
				}
			}

			setState(343);
			((New_callContext)_localctx).RBRACKET = match(RBRACKET);
			_localctx.str += (((New_callContext)_localctx).RBRACKET!=null?((New_callContext)_localctx).RBRACKET.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public int indent;
		public String str;
		public Token WHILE;
		public Token LBRACKET;
		public CondContext cond;
		public Token RBRACKET;
		public Token LEFT_BRACE;
		public Method_bodyContext method_body;
		public Token RIGHT_BRACE;
		public TerminalNode WHILE() { return getToken(JavaProgramParser.WHILE, 0); }
		public TerminalNode LBRACKET() { return getToken(JavaProgramParser.LBRACKET, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(JavaProgramParser.RBRACKET, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(JavaProgramParser.LEFT_BRACE, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(JavaProgramParser.RIGHT_BRACE, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public While_loopContext(ParserRuleContext parent, int invokingState, int indent) {
			super(parent, invokingState);
			this.indent = indent;
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop(int indent) throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState(), indent);
		enterRule(_localctx, 44, RULE_while_loop);
		((While_loopContext)_localctx).str =  "&nbsp;".repeat(indent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((While_loopContext)_localctx).WHILE = match(WHILE);
			_localctx.str += "<span style=\"color: blue\">" + (((While_loopContext)_localctx).WHILE!=null?((While_loopContext)_localctx).WHILE.getText():null) + "</span>" + " ";
			setState(348);
			((While_loopContext)_localctx).LBRACKET = match(LBRACKET);
			_localctx.str += (((While_loopContext)_localctx).LBRACKET!=null?((While_loopContext)_localctx).LBRACKET.getText():null);
			setState(350);
			((While_loopContext)_localctx).cond = cond();
			_localctx.str += ((While_loopContext)_localctx).cond.str;
			setState(352);
			((While_loopContext)_localctx).RBRACKET = match(RBRACKET);
			_localctx.str += (((While_loopContext)_localctx).RBRACKET!=null?((While_loopContext)_localctx).RBRACKET.getText():null) + " ";
			setState(354);
			((While_loopContext)_localctx).LEFT_BRACE = match(LEFT_BRACE);
			_localctx.str += (((While_loopContext)_localctx).LEFT_BRACE!=null?((While_loopContext)_localctx).LEFT_BRACE.getText():null) + "<br>\n";
			setState(356);
			((While_loopContext)_localctx).method_body = method_body(indent + 4);
			_localctx.str += ((While_loopContext)_localctx).method_body.str;
			setState(358);
			((While_loopContext)_localctx).RIGHT_BRACE = match(RIGHT_BRACE);
			_localctx.str += "&nbsp;".repeat(indent) + (((While_loopContext)_localctx).RIGHT_BRACE!=null?((While_loopContext)_localctx).RIGHT_BRACE.getText():null) + "<br>\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public String str;
		public ValueContext x;
		public CompContext comp;
		public ValueContext y;
		public Bool_valueContext bool_value;
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Bool_valueContext bool_value() {
			return getRuleContext(Bool_valueContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond);
		((CondContext)_localctx).str =  "";
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case WORD:
			case INT:
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(361);
				((CondContext)_localctx).x = value();
				_localctx.str += ((CondContext)_localctx).x.str + " ";
				setState(363);
				((CondContext)_localctx).comp = comp();
				_localctx.str += ((CondContext)_localctx).comp.str + " " ;
				setState(365);
				((CondContext)_localctx).y = value();
				_localctx.str += ((CondContext)_localctx).y.str;
				}
				}
				break;
			case BOOL_TRUE:
			case BOOL_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				((CondContext)_localctx).bool_value = bool_value();
				_localctx.str += ((CondContext)_localctx).bool_value.str;
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

	public static class Bool_valueContext extends ParserRuleContext {
		public String str;
		public Token BOOL_TRUE;
		public Token BOOL_FALSE;
		public TerminalNode BOOL_TRUE() { return getToken(JavaProgramParser.BOOL_TRUE, 0); }
		public TerminalNode BOOL_FALSE() { return getToken(JavaProgramParser.BOOL_FALSE, 0); }
		public Bool_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterBool_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitBool_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitBool_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valueContext bool_value() throws RecognitionException {
		Bool_valueContext _localctx = new Bool_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bool_value);
		((Bool_valueContext)_localctx).str =  "";
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(373);
				((Bool_valueContext)_localctx).BOOL_TRUE = match(BOOL_TRUE);
				_localctx.str += "<span style=\"color: blue\">" + (((Bool_valueContext)_localctx).BOOL_TRUE!=null?((Bool_valueContext)_localctx).BOOL_TRUE.getText():null) + "</span>";
				}
				}
				break;
			case BOOL_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(375);
				((Bool_valueContext)_localctx).BOOL_FALSE = match(BOOL_FALSE);
				_localctx.str += "<span style=\"color: blue\">" + (((Bool_valueContext)_localctx).BOOL_FALSE!=null?((Bool_valueContext)_localctx).BOOL_FALSE.getText():null) + "</span>";
				}
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

	public static class CompContext extends ParserRuleContext {
		public String str;
		public Token LE;
		public Token GR;
		public Token EQ;
		public Token LEQ;
		public Token GEQ;
		public TerminalNode LE() { return getToken(JavaProgramParser.LE, 0); }
		public TerminalNode GR() { return getToken(JavaProgramParser.GR, 0); }
		public TerminalNode EQ() { return getToken(JavaProgramParser.EQ, 0); }
		public TerminalNode LEQ() { return getToken(JavaProgramParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(JavaProgramParser.GEQ, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comp);
		((CompContext)_localctx).str =  "";
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(379);
				((CompContext)_localctx).LE = match(LE);
				_localctx.str += (((CompContext)_localctx).LE!=null?((CompContext)_localctx).LE.getText():null);
				}
				}
				break;
			case GR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(381);
				((CompContext)_localctx).GR = match(GR);
				_localctx.str += (((CompContext)_localctx).GR!=null?((CompContext)_localctx).GR.getText():null);
				}
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(383);
				((CompContext)_localctx).EQ = match(EQ);
				_localctx.str += (((CompContext)_localctx).EQ!=null?((CompContext)_localctx).EQ.getText():null);
				}
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(385);
				((CompContext)_localctx).LEQ = match(LEQ);
				_localctx.str += (((CompContext)_localctx).LEQ!=null?((CompContext)_localctx).LEQ.getText():null);
				}
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(387);
				((CompContext)_localctx).GEQ = match(GEQ);
				_localctx.str += (((CompContext)_localctx).GEQ!=null?((CompContext)_localctx).GEQ.getText():null);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u018a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\5\5e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\5\5s"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0084"+
		"\n\7\f\7\16\7\u0087\13\7\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0097\n\t\3\n\3\n\3\n\5\n\u009c\n\n\3\n\3"+
		"\n\3\n\5\n\u00a1\n\n\3\n\3\n\3\n\5\n\u00a6\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00b0\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ba\n\n\7"+
		"\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\5\f\u00ca\n\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f\3\f\5\f\u00d4\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e2\n\f\f\f\16\f"+
		"\u00e5\13\f\5\f\u00e7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\5\17\u00f9\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0109\n\20\f\20\16\20\u010c"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u011c\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0125\n"+
		"\22\f\22\16\22\u0128\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0136\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0140\n\25\f\25\16\25\u0143\13\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u014b\n\26\f\26\16\26\u014e\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0158\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0176\n\31\3\32\3\32\3\32\3\32\5\32\u017c"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0188\n\33"+
		"\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\2\2\2\u0198\2\66\3\2\2\2\4C\3\2\2\2\6R\3\2\2\2\bd\3\2\2\2\ny\3\2\2\2"+
		"\f}\3\2\2\2\16\u008d\3\2\2\2\20\u0096\3\2\2\2\22\u009b\3\2\2\2\24\u00c3"+
		"\3\2\2\2\26\u00c9\3\2\2\2\30\u00f0\3\2\2\2\32\u00f3\3\2\2\2\34\u00f8\3"+
		"\2\2\2\36\u010a\3\2\2\2 \u011b\3\2\2\2\"\u011d\3\2\2\2$\u012c\3\2\2\2"+
		"&\u012f\3\2\2\2(\u013a\3\2\2\2*\u0144\3\2\2\2,\u014f\3\2\2\2.\u015c\3"+
		"\2\2\2\60\u0175\3\2\2\2\62\u017b\3\2\2\2\64\u0187\3\2\2\2\66\67\5\4\3"+
		"\2\67=\b\2\1\289\5\6\4\29:\b\2\1\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2"+
		"\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\5\b\5\2AB\b\2\1\2B\3\3\2\2\2CD\7"+
		"\b\2\2DE\b\3\1\2EF\7\20\2\2FL\b\3\1\2GH\7\30\2\2HI\7\20\2\2IK\b\3\1\2"+
		"JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\23\2"+
		"\2PQ\b\3\1\2Q\5\3\2\2\2RS\7\t\2\2ST\b\4\1\2TU\7\20\2\2U[\b\4\1\2VW\7\30"+
		"\2\2WX\7\20\2\2XZ\b\4\1\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^"+
		"\3\2\2\2][\3\2\2\2^_\7\23\2\2_`\b\4\1\2`\7\3\2\2\2ab\5\30\r\2bc\b\5\1"+
		"\2ce\3\2\2\2da\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\n\2\2gh\b\5\1\2hi\7\20"+
		"\2\2im\b\5\1\2jk\5\n\6\2kl\b\5\1\2ln\3\2\2\2mj\3\2\2\2mn\3\2\2\2nr\3\2"+
		"\2\2op\5\f\7\2pq\b\5\1\2qs\3\2\2\2ro\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\31"+
		"\2\2uv\5\16\b\2vw\7\32\2\2wx\b\5\1\2x\t\3\2\2\2yz\7\13\2\2z{\7\20\2\2"+
		"{|\b\6\1\2|\13\3\2\2\2}~\7\f\2\2~\177\7\20\2\2\177\u0085\b\7\1\2\u0080"+
		"\u0081\7\26\2\2\u0081\u0082\7\20\2\2\u0082\u0084\b\7\1\2\u0083\u0080\3"+
		"\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\r\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\20\t\2\u0089\u008a\b\b\1"+
		"\2\u008a\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\17\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\5\22\n\2\u0091\u0092\b\t\1\2\u0092\u0097\3\2\2\2\u0093\u0094\5"+
		"\26\f\2\u0094\u0095\b\t\1\2\u0095\u0097\3\2\2\2\u0096\u0090\3\2\2\2\u0096"+
		"\u0093\3\2\2\2\u0097\21\3\2\2\2\u0098\u0099\5\30\r\2\u0099\u009a\b\n\1"+
		"\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0"+
		"\3\2\2\2\u009d\u009e\5\32\16\2\u009e\u009f\b\n\1\2\u009f\u00a1\3\2\2\2"+
		"\u00a0\u009d\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a3"+
		"\5\34\17\2\u00a3\u00a4\b\n\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00af\5\24\13\2\u00a8\u00a9"+
		"\7\20\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\b\n\1\2"+
		"\u00ac\u00b0\3\2\2\2\u00ad\u00ae\7\20\2\2\u00ae\u00b0\b\n\1\2\u00af\u00a8"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00bd\3\2\2\2\u00b1\u00b9\7\26\2\2"+
		"\u00b2\u00b3\7\20\2\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6"+
		"\b\n\1\2\u00b6\u00ba\3\2\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00ba\b\n\1\2"+
		"\u00b9\u00b2\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b1"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\b"+
		"\n\1\2\u00c2\23\3\2\2\2\u00c3\u00c4\7\20\2\2\u00c4\u00c5\b\13\1\2\u00c5"+
		"\25\3\2\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\b\f\1\2\u00c8\u00ca\3\2\2"+
		"\2\u00c9\u00c6\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cc"+
		"\5\32\16\2\u00cc\u00cd\b\f\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00cb\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2"+
		"\b\f\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\5\24\13\2\u00d6\u00d7\7\20\2\2\u00d7\u00d8"+
		"\7\24\2\2\u00d8\u00e6\b\f\1\2\u00d9\u00da\5\24\13\2\u00da\u00db\7\20\2"+
		"\2\u00db\u00e3\b\f\1\2\u00dc\u00dd\7\26\2\2\u00dd\u00de\5\24\13\2\u00de"+
		"\u00df\7\20\2\2\u00df\u00e0\b\f\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00dc\3"+
		"\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\25\2\2\u00e9\u00ea\7\31\2\2\u00ea"+
		"\u00eb\b\f\1\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\b\f\1\2\u00ed\u00ee\7"+
		"\32\2\2\u00ee\u00ef\b\f\1\2\u00ef\27\3\2\2\2\u00f0\u00f1\7\r\2\2\u00f1"+
		"\u00f2\b\r\1\2\u00f2\31\3\2\2\2\u00f3\u00f4\7\16\2\2\u00f4\u00f5\b\16"+
		"\1\2\u00f5\33\3\2\2\2\u00f6\u00f7\7\17\2\2\u00f7\u00f9\b\17\1\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00fb\5\22\n"+
		"\2\u00fb\u00fc\b\20\1\2\u00fc\u0109\3\2\2\2\u00fd\u00fe\5&\24\2\u00fe"+
		"\u00ff\7\23\2\2\u00ff\u0100\b\20\1\2\u0100\u0109\3\2\2\2\u0101\u0102\5"+
		",\27\2\u0102\u0103\7\23\2\2\u0103\u0104\b\20\1\2\u0104\u0109\3\2\2\2\u0105"+
		"\u0106\5.\30\2\u0106\u0107\b\20\1\2\u0107\u0109\3\2\2\2\u0108\u00fa\3"+
		"\2\2\2\u0108\u00fd\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0105\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\37\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010d\u010e\5$\23\2\u010e\u010f\b\21\1\2\u010f"+
		"\u011c\3\2\2\2\u0110\u0111\5\"\22\2\u0111\u0112\b\21\1\2\u0112\u011c\3"+
		"\2\2\2\u0113\u0114\5&\24\2\u0114\u0115\b\21\1\2\u0115\u011c\3\2\2\2\u0116"+
		"\u0117\5,\27\2\u0117\u0118\b\21\1\2\u0118\u011c\3\2\2\2\u0119\u011a\7"+
		"\20\2\2\u011a\u011c\b\21\1\2\u011b\u010d\3\2\2\2\u011b\u0110\3\2\2\2\u011b"+
		"\u0113\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0119\3\2\2\2\u011c!\3\2\2\2"+
		"\u011d\u011e\7\27\2\2\u011e\u0126\b\22\1\2\u011f\u0120\7\20\2\2\u0120"+
		"\u0125\b\22\1\2\u0121\u0122\5$\23\2\u0122\u0123\b\22\1\2\u0123\u0125\3"+
		"\2\2\2\u0124\u011f\3\2\2\2\u0124\u0121\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012a\7\27\2\2\u012a\u012b\b\22\1\2\u012b#\3\2\2\2\u012c\u012d"+
		"\7\21\2\2\u012d\u012e\b\23\1\2\u012e%\3\2\2\2\u012f\u0130\5(\25\2\u0130"+
		"\u0131\7\24\2\2\u0131\u0135\b\24\1\2\u0132\u0133\5*\26\2\u0133\u0134\b"+
		"\24\1\2\u0134\u0136\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\7\25\2\2\u0138\u0139\b\24\1\2\u0139\'\3\2\2"+
		"\2\u013a\u013b\7\20\2\2\u013b\u0141\b\25\1\2\u013c\u013d\7\30\2\2\u013d"+
		"\u013e\7\20\2\2\u013e\u0140\b\25\1\2\u013f\u013c\3\2\2\2\u0140\u0143\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142)\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0145\5 \21\2\u0145\u014c\b\26\1\2\u0146\u0147\7\26\2\2"+
		"\u0147\u0148\5 \21\2\u0148\u0149\b\26\1\2\u0149\u014b\3\2\2\2\u014a\u0146"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"+\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\7\2\2\u0150\u0151\b\27\1\2"+
		"\u0151\u0152\7\20\2\2\u0152\u0153\7\24\2\2\u0153\u0157\b\27\1\2\u0154"+
		"\u0155\5*\26\2\u0155\u0156\b\27\1\2\u0156\u0158\3\2\2\2\u0157\u0154\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\25\2\2\u015a"+
		"\u015b\b\27\1\2\u015b-\3\2\2\2\u015c\u015d\7\6\2\2\u015d\u015e\b\30\1"+
		"\2\u015e\u015f\7\24\2\2\u015f\u0160\b\30\1\2\u0160\u0161\5\60\31\2\u0161"+
		"\u0162\b\30\1\2\u0162\u0163\7\25\2\2\u0163\u0164\b\30\1\2\u0164\u0165"+
		"\7\31\2\2\u0165\u0166\b\30\1\2\u0166\u0167\5\36\20\2\u0167\u0168\b\30"+
		"\1\2\u0168\u0169\7\32\2\2\u0169\u016a\b\30\1\2\u016a/\3\2\2\2\u016b\u016c"+
		"\5 \21\2\u016c\u016d\b\31\1\2\u016d\u016e\5\64\33\2\u016e\u016f\b\31\1"+
		"\2\u016f\u0170\5 \21\2\u0170\u0171\b\31\1\2\u0171\u0176\3\2\2\2\u0172"+
		"\u0173\5\62\32\2\u0173\u0174\b\31\1\2\u0174\u0176\3\2\2\2\u0175\u016b"+
		"\3\2\2\2\u0175\u0172\3\2\2\2\u0176\61\3\2\2\2\u0177\u0178\7\4\2\2\u0178"+
		"\u017c\b\32\1\2\u0179\u017a\7\5\2\2\u017a\u017c\b\32\1\2\u017b\u0177\3"+
		"\2\2\2\u017b\u0179\3\2\2\2\u017c\63\3\2\2\2\u017d\u017e\7\33\2\2\u017e"+
		"\u0188\b\33\1\2\u017f\u0180\7\34\2\2\u0180\u0188\b\33\1\2\u0181\u0182"+
		"\7\35\2\2\u0182\u0188\b\33\1\2\u0183\u0184\7\36\2\2\u0184\u0188\b\33\1"+
		"\2\u0185\u0186\7\37\2\2\u0186\u0188\b\33\1\2\u0187\u017d\3\2\2\2\u0187"+
		"\u017f\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0188\65\3\2\2\2#=L[dmr\u0085\u008d\u0096\u009b\u00a0\u00a5\u00af"+
		"\u00b9\u00bd\u00c9\u00ce\u00d3\u00e3\u00e6\u00f8\u0108\u010a\u011b\u0124"+
		"\u0126\u0135\u0141\u014c\u0157\u0175\u017b\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}