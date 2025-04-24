// Generated from C:/UT university/PLC/CA1/phase-1-ce-MohammadJazayeri/src/main/grammar/SimpleLang.g4 by ANTLR 4.13.1
package main.grammar;

    import main.ast.nodes.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Break=2, Char=3, Const=4, Continue=5, Do=6, Double=7, Else=8, 
		Float=9, For=10, If=11, Int=12, Long=13, Return=14, Short=15, Signed=16, 
		Sizeof=17, Switch=18, Typedef=19, Unsigned=20, Void=21, While=22, Bool=23, 
		LeftParen=24, RightParen=25, LeftBracket=26, RightBracket=27, LeftBrace=28, 
		RightBrace=29, Less=30, LessEqual=31, Greater=32, GreaterEqual=33, LeftShift=34, 
		RightShift=35, Plus=36, PlusPlus=37, Minus=38, MinusMinus=39, Star=40, 
		Div=41, Mod=42, And=43, Or=44, AndAnd=45, OrOr=46, Xor=47, Not=48, Tilde=49, 
		Question=50, Colon=51, Semi=52, Comma=53, Assign=54, StarAssign=55, DivAssign=56, 
		ModAssign=57, PlusAssign=58, MinusAssign=59, LeftShiftAssign=60, RightShiftAssign=61, 
		AndAssign=62, XorAssign=63, OrAssign=64, Equal=65, NotEqual=66, Arrow=67, 
		Dot=68, Identifier=69, Constant=70, DigitSequence=71, StringLiteral=72, 
		MultiLineMacro=73, Directive=74, Whitespace=75, Newline=76, BlockComment=77, 
		LineComment=78;
	public static final int
		RULE_program = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2, 
		RULE_functionDefinition = 3, RULE_declarationList = 4, RULE_expression = 5, 
		RULE_argumentExpressionList = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_assignmentOperator = 9, RULE_declaration = 10, RULE_declarationSpecifiers = 11, 
		RULE_declarationSpecifier = 12, RULE_initDeclaratorList = 13, RULE_initDeclarator = 14, 
		RULE_typeSpecifier = 15, RULE_specifierQualifierList = 16, RULE_declarator = 17, 
		RULE_directDeclarator = 18, RULE_pointer = 19, RULE_parameterList = 20, 
		RULE_parameterDeclaration = 21, RULE_identifierList = 22, RULE_typeName = 23, 
		RULE_abstractDeclarator = 24, RULE_directAbstractDeclarator = 25, RULE_initializer = 26, 
		RULE_initializerList = 27, RULE_designation = 28, RULE_designator = 29, 
		RULE_statement = 30, RULE_compoundStatement = 31, RULE_blockItem = 32, 
		RULE_expressionStatement = 33, RULE_selectionStatement = 34, RULE_iterationStatement = 35, 
		RULE_forCondition = 36, RULE_forDeclaration = 37, RULE_forExpression = 38, 
		RULE_jumpStatement = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "translationUnit", "externalDeclaration", "functionDefinition", 
			"declarationList", "expression", "argumentExpressionList", "unaryOperator", 
			"castExpression", "assignmentOperator", "declaration", "declarationSpecifiers", 
			"declarationSpecifier", "initDeclaratorList", "initDeclarator", "typeSpecifier", 
			"specifierQualifierList", "declarator", "directDeclarator", "pointer", 
			"parameterList", "parameterDeclaration", "identifierList", "typeName", 
			"abstractDeclarator", "directAbstractDeclarator", "initializer", "initializerList", 
			"designation", "designator", "statement", "compoundStatement", "blockItem", 
			"expressionStatement", "selectionStatement", "iterationStatement", "forCondition", 
			"forDeclaration", "forExpression", "jumpStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'end'", "'break'", "'char'", "'const'", "'continue'", "'do'", 
			"'double'", "'else'", "'float'", "'for'", "'if'", "'int'", "'long'", 
			"'return'", "'short'", "'signed'", "'sizeof'", "'switch'", "'typedef'", 
			"'unsigned'", "'void'", "'while'", "'bool'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", 
			"'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", 
			"'!'", "'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", 
			"'->'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Break", "Char", "Const", "Continue", "Do", "Double", "Else", 
			"Float", "For", "If", "Int", "Long", "Return", "Short", "Signed", "Sizeof", 
			"Switch", "Typedef", "Unsigned", "Void", "While", "Bool", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
			"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
			"Or", "AndAnd", "OrOr", "Xor", "Not", "Tilde", "Question", "Colon", "Semi", 
			"Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", 
			"OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "Identifier", "Constant", 
			"DigitSequence", "StringLiteral", "MultiLineMacro", "Directive", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public TranslationUnitContext t;
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).programRet =  new Program();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504699167945368L) != 0) || _la==Identifier) {
				{
				setState(81);
				((ProgramContext)_localctx).t = translationUnit();
				 _localctx.programRet.setTranslationUnit(((ProgramContext)_localctx).t.translationUnitRet);
				}
			}

			setState(86);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TranslationUnit translationUnitRet;
		public ExternalDeclarationContext e;
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TranslationUnitContext)_localctx).translationUnitRet =  new TranslationUnit(); 
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				((TranslationUnitContext)_localctx).e = externalDeclaration();
				_localctx.translationUnitRet.addExternalDeclaration(((TranslationUnitContext)_localctx).e.externalDecRet);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4504699167945368L) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDeclarationContext extends ParserRuleContext {
		public ExternalDeclaration externalDecRet;
		public FunctionDefinitionContext f;
		public DeclarationContext d;
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_externalDeclaration);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((ExternalDeclarationContext)_localctx).f = functionDefinition();
				((ExternalDeclarationContext)_localctx).externalDecRet =  ((ExternalDeclarationContext)_localctx).f.funcDefRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(99);
				((ExternalDeclarationContext)_localctx).d = declaration();
				((ExternalDeclarationContext)_localctx).externalDecRet =  ((ExternalDeclarationContext)_localctx).d.Dec;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(Semi);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition funcDefRet;
		public DeclarationSpecifiersContext d1;
		public DeclaratorContext d;
		public DeclarationListContext d2;
		public CompoundStatementContext c;
		public Token s;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(SimpleLangParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(SimpleLangParser.Semi, i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((FunctionDefinitionContext)_localctx).funcDefRet =  new FunctionDefinition();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(106);
				((FunctionDefinitionContext)_localctx).d1 = declarationSpecifiers();
				_localctx.funcDefRet.setDeclarationSpecifiers(((FunctionDefinitionContext)_localctx).d1.decSpecsRet);
				}
				break;
			}
			{
			setState(111);
			((FunctionDefinitionContext)_localctx).d = declarator();
			_localctx.funcDefRet.setDeclarator(((FunctionDefinitionContext)_localctx).d.dec); _localctx.funcDefRet.setLine(((FunctionDefinitionContext)_localctx).d.dec.getLine());
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12169880L) != 0) || _la==Identifier) {
				{
				setState(114);
				((FunctionDefinitionContext)_localctx).d2 = declarationList();
				_localctx.funcDefRet.setDeclarationList(((FunctionDefinitionContext)_localctx).d2.decList);
				}
			}

			{
			setState(119);
			((FunctionDefinitionContext)_localctx).c = compoundStatement();
			_localctx.funcDefRet.setBody(((FunctionDefinitionContext)_localctx).c.CStmt);
			}
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(124);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Semi:
						{
						setState(122);
						((FunctionDefinitionContext)_localctx).s = match(Semi);
						}
						break;
					case T__0:
						{
						setState(123);
						match(T__0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationList decList;
		public DeclarationContext d;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclarationListContext)_localctx).decList =  new DeclarationList();
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				((DeclarationListContext)_localctx).d = declaration();
				_localctx.decList.addDeclaration(((DeclarationListContext)_localctx).d.Dec);
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 12169880L) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext e1;
		public ExpressionContext e;
		public Token i;
		public Token c;
		public TypeNameContext t;
		public InitializerListContext i1;
		public Token p;
		public Token m;
		public Token s;
		public InitializerListContext i2;
		public UnaryOperatorContext u;
		public CastExpressionContext c1;
		public Token op1;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public AssignmentOperatorContext a;
		public ArgumentExpressionListContext a1;
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(SimpleLangParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(SimpleLangParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SimpleLangParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public List<TerminalNode> Sizeof() { return getTokens(SimpleLangParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(SimpleLangParser.Sizeof, i);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(SimpleLangParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(SimpleLangParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(SimpleLangParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(SimpleLangParser.MinusMinus, i);
		}
		public TerminalNode Star() { return getToken(SimpleLangParser.Star, 0); }
		public TerminalNode Div() { return getToken(SimpleLangParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SimpleLangParser.Mod, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode LeftShift() { return getToken(SimpleLangParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(SimpleLangParser.RightShift, 0); }
		public TerminalNode Less() { return getToken(SimpleLangParser.Less, 0); }
		public TerminalNode Greater() { return getToken(SimpleLangParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(SimpleLangParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(SimpleLangParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(SimpleLangParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(SimpleLangParser.NotEqual, 0); }
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Xor() { return getToken(SimpleLangParser.Xor, 0); }
		public TerminalNode Or() { return getToken(SimpleLangParser.Or, 0); }
		public TerminalNode AndAnd() { return getToken(SimpleLangParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(SimpleLangParser.OrOr, 0); }
		public TerminalNode Question() { return getToken(SimpleLangParser.Question, 0); }
		public TerminalNode Colon() { return getToken(SimpleLangParser.Colon, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(138);
				((ExpressionContext)_localctx).i = match(Identifier);
				((ExpressionContext)_localctx).expressionRet =  new Identifier((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null));
				_localctx.expressionRet.setLine((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getLine():0));
				}
				break;
			case 2:
				{
				setState(141);
				((ExpressionContext)_localctx).c = match(Constant);
				((ExpressionContext)_localctx).expressionRet =  new Constant((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null));
				}
				break;
			case 3:
				{
				setState(144); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(143);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(146); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				setState(148);
				match(LeftParen);
				setState(149);
				((ExpressionContext)_localctx).e = expression(0);
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).e.expressionRet;
				setState(151);
				match(RightParen);
				}
				break;
			case 5:
				{
				setState(153);
				match(LeftParen);
				setState(154);
				((ExpressionContext)_localctx).t = typeName();
				setState(155);
				match(RightParen);
				setState(156);
				match(LeftBrace);
				setState(157);
				((ExpressionContext)_localctx).i1 = initializerList();
				((ExpressionContext)_localctx).expressionRet =  new A(((ExpressionContext)_localctx).t.typeNameRet, ((ExpressionContext)_localctx).i1.initialList);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(159);
					match(Comma);
					}
				}

				setState(162);
				match(RightBrace);
				}
				break;
			case 6:
				{
				ListOfExpressions l = new ListOfExpressions();
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(171);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PlusPlus:
							{
							setState(165);
							((ExpressionContext)_localctx).p = match(PlusPlus);
							l.addPrefixOperators((((ExpressionContext)_localctx).p!=null?((ExpressionContext)_localctx).p.getText():null));
							}
							break;
						case MinusMinus:
							{
							setState(167);
							((ExpressionContext)_localctx).m = match(MinusMinus);
							l.addPrefixOperators((((ExpressionContext)_localctx).m!=null?((ExpressionContext)_localctx).m.getText():null));
							}
							break;
						case Sizeof:
							{
							setState(169);
							((ExpressionContext)_localctx).s = match(Sizeof);
							l.addPrefixOperators((((ExpressionContext)_localctx).s!=null?((ExpressionContext)_localctx).s.getText():null));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(176);
					((ExpressionContext)_localctx).i = match(Identifier);
					l.setIdentifier((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null)); ((ExpressionContext)_localctx).expressionRet =  l;
					}
					break;
				case 2:
					{
					setState(178);
					((ExpressionContext)_localctx).c = match(Constant);
					l.setConstant((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null)); ((ExpressionContext)_localctx).expressionRet =  l;
					}
					break;
				case 3:
					{
					setState(181); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(180);
							match(StringLiteral);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(183); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case 4:
					{
					setState(185);
					match(LeftParen);
					setState(186);
					((ExpressionContext)_localctx).e = expression(0);
					l.setExpression(((ExpressionContext)_localctx).e.expressionRet); ((ExpressionContext)_localctx).expressionRet =  l;
					setState(188);
					match(RightParen);
					}
					break;
				case 5:
					{
					setState(190);
					match(LeftParen);
					setState(191);
					((ExpressionContext)_localctx).t = typeName();
					l.setTypeName(((ExpressionContext)_localctx).t.typeNameRet);
					setState(193);
					match(RightParen);
					setState(194);
					match(LeftBrace);
					setState(195);
					((ExpressionContext)_localctx).i2 = initializerList();
					l.setInitializerList(((ExpressionContext)_localctx).i2.initialList); ((ExpressionContext)_localctx).expressionRet =  l;
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(197);
						match(Comma);
						}
					}

					setState(200);
					match(RightBrace);
					}
					break;
				case 6:
					{
					setState(202);
					((ExpressionContext)_localctx).u = unaryOperator();
					l.setUnaryOperator(((ExpressionContext)_localctx).u.unaryOp);
					setState(204);
					((ExpressionContext)_localctx).c1 = castExpression();
					l.setCastExpression(((ExpressionContext)_localctx).c1.castExprRet); ((ExpressionContext)_localctx).expressionRet =  l;
					}
					break;
				case 7:
					{
					setState(207);
					match(Sizeof);
					setState(208);
					match(LeftParen);
					setState(209);
					((ExpressionContext)_localctx).t = typeName();
					l.setTypeName(((ExpressionContext)_localctx).t.typeNameRet); ((ExpressionContext)_localctx).expressionRet =  l;
					setState(211);
					match(RightParen);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(215);
				match(LeftParen);
				setState(216);
				((ExpressionContext)_localctx).t = typeName();
				setState(217);
				match(RightParen);
				setState(218);
				((ExpressionContext)_localctx).c1 = castExpression();
				((ExpressionContext)_localctx).expressionRet =  new Casting(((ExpressionContext)_localctx).t.typeNameRet, ((ExpressionContext)_localctx).c1.castExprRet);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(224);
						((ExpressionContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) ) {
							((ExpressionContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						((ExpressionContext)_localctx).e2 = expression(14);

						                  BinaryOperator op;
						                  if ((((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null).equals("*")){op = BinaryOperator.MULT;}
						                  else if((((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null).equals("/")){op = BinaryOperator.DIVIDE;}
						                  else{op = BinaryOperator.MOD;}
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);
						            
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(229);
						((ExpressionContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((ExpressionContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						((ExpressionContext)_localctx).e2 = expression(13);

						                  BinaryOperator op;
						                  if ((((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null).equals("+")){op = BinaryOperator.PLUS;}
						                  else{op = BinaryOperator.MINUS;}
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);
						            
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(234);
						((ExpressionContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LeftShift || _la==RightShift) ) {
							((ExpressionContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						((ExpressionContext)_localctx).e2 = expression(12);

						                  BinaryOperator op;
						                  if ((((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null).equals("<<")){op = BinaryOperator.LSHIFT;}
						                  else{op = BinaryOperator.RSHIFT;}
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);
						            
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(239);
						((ExpressionContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
							((ExpressionContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						((ExpressionContext)_localctx).e2 = expression(11);

						                  BinaryOperator op;
						                  if ((((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null).equals("<")){op = BinaryOperator.LESS;}
						                  else if((((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null).equals(">")) {op = BinaryOperator.GREATER;}
						                  else if((((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null).equals(">=")) {op = BinaryOperator.GREATEREQUAL;}
						                  else{op = BinaryOperator.LESSEQUAL;}
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);
						            
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(244);
						((ExpressionContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((ExpressionContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						((ExpressionContext)_localctx).e2 = expression(10);

						                  BinaryOperator op;
						                  if ((((ExpressionContext)_localctx).op1!=null?((ExpressionContext)_localctx).op1.getText():null).equals("==")){op = BinaryOperator.EQUAL;}
						                  else{op = BinaryOperator.NOTEQUAL;}
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);

						            
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(249);
						((ExpressionContext)_localctx).op1 = match(And);
						setState(250);
						((ExpressionContext)_localctx).e2 = expression(9);

						                  BinaryOperator op = BinaryOperator.AND;
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);
						            
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(254);
						((ExpressionContext)_localctx).op1 = match(Xor);
						setState(255);
						((ExpressionContext)_localctx).e2 = expression(8);

						                  BinaryOperator op = BinaryOperator.XOR;
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);
						            
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(259);
						((ExpressionContext)_localctx).op1 = match(Or);
						setState(260);
						((ExpressionContext)_localctx).e2 = expression(7);

						                  BinaryOperator op = BinaryOperator.OR;
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);

						            
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(264);
						((ExpressionContext)_localctx).op1 = match(AndAnd);
						setState(265);
						((ExpressionContext)_localctx).e2 = expression(6);

						                  BinaryOperator op = BinaryOperator.ANDAND;
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);

						            
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(269);
						((ExpressionContext)_localctx).op1 = match(OrOr);
						setState(270);
						((ExpressionContext)_localctx).e2 = expression(5);

						                  BinaryOperator op = BinaryOperator.OROR;
						                  ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, op);

						            
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(274);
						match(Question);
						setState(275);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(276);
						match(Colon);
						setState(277);
						((ExpressionContext)_localctx).e3 = expression(4);

						                  ((ExpressionContext)_localctx).expressionRet =  new TernaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, ((ExpressionContext)_localctx).e3.expressionRet);
						            
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(281);
						((ExpressionContext)_localctx).a = assignmentOperator();
						setState(282);
						((ExpressionContext)_localctx).e2 = expression(3);

						                  if(((ExpressionContext)_localctx).a.assignOperator == Assignment.PLUS){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.PLUS, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.MINUS){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.MINUS, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.MULT){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.MULT, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.DIVIDE){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.DIVIDE, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.MOD){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.MOD, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.LSHIFT){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.LSHIFT, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.RSHIFT){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.RSHIFT, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.XOR){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.XOR, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.AND){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.AND, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						                  else if(((ExpressionContext)_localctx).a.assignOperator == Assignment.ASSIGN){((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.ASSIGN);}
						                  else{((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet, BinaryOperator.OR, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null));}
						            
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(286);
						match(LeftBracket);
						setState(287);
						((ExpressionContext)_localctx).e2 = expression(0);
						((ExpressionContext)_localctx).expressionRet =  new ArrayAccess(((ExpressionContext)_localctx).e1.expressionRet, ((ExpressionContext)_localctx).e2.expressionRet);
						setState(289);
						match(RightBracket);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						FunctionCall functionCall = new FunctionCall(((ExpressionContext)_localctx).e.expressionRet);
						setState(293);
						match(LeftParen);
						setState(297);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
							{
							setState(294);
							((ExpressionContext)_localctx).a1 = argumentExpressionList();
							functionCall.setArgumentExpressionList(((ExpressionContext)_localctx).a1.argExprList);
							}
						}

						((ExpressionContext)_localctx).expressionRet =  functionCall;
						setState(300);
						match(RightParen);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(302);
						match(PlusPlus);
						((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e.expressionRet, UnaryOperator.POST_INC);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(305);
						match(MinusMinus);
						((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(((ExpressionContext)_localctx).e.expressionRet, UnaryOperator.POST_DEC);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						ArgumentExpressionList e = new ArgumentExpressionList(); e.addExpression(((ExpressionContext)_localctx).e1.expressionRet);
						setState(313); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(309);
								match(Comma);
								setState(310);
								((ExpressionContext)_localctx).e2 = expression(0);
								e.addExpression(((ExpressionContext)_localctx).e2.expressionRet); ((ExpressionContext)_localctx).expressionRet =  e;
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(315); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(321);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public ArgumentExpressionList argExprList;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArgumentExpressionListContext)_localctx).argExprList =  new ArgumentExpressionList();
			setState(323);
			((ArgumentExpressionListContext)_localctx).e1 = expression(0);
			_localctx.argExprList.addExpression(((ArgumentExpressionListContext)_localctx).e1.expressionRet);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(325);
				match(Comma);
				setState(326);
				((ArgumentExpressionListContext)_localctx).e2 = expression(0);
				_localctx.argExprList.addExpression(((ArgumentExpressionListContext)_localctx).e2.expressionRet);
				}
				}
				setState(333);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperator unaryOp;
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Star() { return getToken(SimpleLangParser.Star, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(SimpleLangParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(SimpleLangParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryOperator);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(And);
				((UnaryOperatorContext)_localctx).unaryOp =  UnaryOperator.AND;
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(Star);
				((UnaryOperatorContext)_localctx).unaryOp =  UnaryOperator.STAR;
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(Plus);
				((UnaryOperatorContext)_localctx).unaryOp =  UnaryOperator.PLUS;
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(Minus);
				((UnaryOperatorContext)_localctx).unaryOp =  UnaryOperator.MINUS;
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				match(Tilde);
				((UnaryOperatorContext)_localctx).unaryOp =  UnaryOperator.TILDE;
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				match(Not);
				((UnaryOperatorContext)_localctx).unaryOp =  UnaryOperator.NOT;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpression castExprRet;
		public TypeNameContext t;
		public CastExpressionContext c;
		public ExpressionContext e;
		public Token d;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(SimpleLangParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castExpression);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((CastExpressionContext)_localctx).castExprRet =  new CastExpression();
				setState(349);
				match(LeftParen);
				setState(350);
				((CastExpressionContext)_localctx).t = typeName();
				_localctx.castExprRet.setTypeName(((CastExpressionContext)_localctx).t.typeNameRet);
				setState(352);
				match(RightParen);
				setState(353);
				((CastExpressionContext)_localctx).c = castExpression();
				_localctx.castExprRet.setCastExpression(((CastExpressionContext)_localctx).c.castExprRet);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((CastExpressionContext)_localctx).castExprRet =  new CastExpression();
				setState(357);
				((CastExpressionContext)_localctx).e = expression(0);
				_localctx.castExprRet.setExpression(((CastExpressionContext)_localctx).e.expressionRet);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((CastExpressionContext)_localctx).castExprRet =  new CastExpression();
				setState(361);
				((CastExpressionContext)_localctx).d = match(DigitSequence);
				_localctx.castExprRet.setDigits((((CastExpressionContext)_localctx).d!=null?((CastExpressionContext)_localctx).d.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public Assignment assignOperator;
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(SimpleLangParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(SimpleLangParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(SimpleLangParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(SimpleLangParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(SimpleLangParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(SimpleLangParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(SimpleLangParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(SimpleLangParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(SimpleLangParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(SimpleLangParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentOperator);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(Assign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.ASSIGN;
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(StarAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.MULT;
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(DivAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.DIVIDE;
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(ModAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.MOD;
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(PlusAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.PLUS;
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				match(MinusAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.MINUS;
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 7);
				{
				setState(377);
				match(LeftShiftAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.LSHIFT;
				}
				break;
			case RightShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				match(RightShiftAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.RSHIFT;
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(381);
				match(AndAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.AND;
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(383);
				match(XorAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.XOR;
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(385);
				match(OrAssign);
				((AssignmentOperatorContext)_localctx).assignOperator =  Assignment.OR;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Declaration Dec;
		public DeclarationSpecifiersContext d;
		public InitDeclaratorListContext i;
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclarationContext)_localctx).Dec =  new Declaration();
			{
			setState(390);
			((DeclarationContext)_localctx).d = declarationSpecifiers();
			_localctx.Dec.setDecSpecs(((DeclarationContext)_localctx).d.decSpecsRet);
			}
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 35184372154369L) != 0)) {
				{
				setState(393);
				((DeclarationContext)_localctx).i = initDeclaratorList();
				_localctx.Dec.setInitDeclaratorList(((DeclarationContext)_localctx).i.initDecList);
				}
			}

			setState(398);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public DeclarationSpecifiers decSpecsRet;
		public DeclarationSpecifierContext d;
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((DeclarationSpecifiersContext)_localctx).decSpecsRet =  new DeclarationSpecifiers();
			setState(404); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(401);
					((DeclarationSpecifiersContext)_localctx).d = declarationSpecifier();
					_localctx.decSpecsRet.addDecSpecifier(((DeclarationSpecifiersContext)_localctx).d.decSpecRet);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(406); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public DeclarationSpecifier decSpecRet;
		public Token t;
		public TypeSpecifierContext t2;
		public Token c;
		public TerminalNode Typedef() { return getToken(SimpleLangParser.Typedef, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Const() { return getToken(SimpleLangParser.Const, 0); }
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarationSpecifier);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Typedef:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				((DeclarationSpecifierContext)_localctx).t = match(Typedef);
				((DeclarationSpecifierContext)_localctx).decSpecRet =  new TypeSpecifier((((DeclarationSpecifierContext)_localctx).t!=null?((DeclarationSpecifierContext)_localctx).t.getText():null));
				}
				break;
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				((DeclarationSpecifierContext)_localctx).t2 = typeSpecifier();
				((DeclarationSpecifierContext)_localctx).decSpecRet =  ((DeclarationSpecifierContext)_localctx).t2.typeSpecRet;
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				((DeclarationSpecifierContext)_localctx).c = match(Const);
				((DeclarationSpecifierContext)_localctx).decSpecRet =  new TypeSpecifier((((DeclarationSpecifierContext)_localctx).c!=null?((DeclarationSpecifierContext)_localctx).c.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorList initDecList;
		public InitDeclaratorContext i;
		public InitDeclaratorContext i_;
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InitDeclaratorListContext)_localctx).initDecList =  new InitDeclaratorList();
			{
			setState(418);
			((InitDeclaratorListContext)_localctx).i = initDeclarator();
			_localctx.initDecList.addInitDeclarators(((InitDeclaratorListContext)_localctx).i.initDec);
			}
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(421);
				match(Comma);
				{
				setState(422);
				((InitDeclaratorListContext)_localctx).i_ = initDeclarator();
				_localctx.initDecList.addInitDeclarators(((InitDeclaratorListContext)_localctx).i_.initDec);
				}
				}
				}
				setState(429);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitDeclarator initDec;
		public DeclaratorContext d;
		public InitializerContext i;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InitDeclaratorContext)_localctx).initDec =  new InitDeclarator();
			{
			setState(431);
			((InitDeclaratorContext)_localctx).d = declarator();
			_localctx.initDec.setDeclarator(((InitDeclaratorContext)_localctx).d.dec);
			}
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(434);
				match(Assign);
				setState(435);
				((InitDeclaratorContext)_localctx).i = initializer();
				_localctx.initDec.setInitializer(((InitDeclaratorContext)_localctx).i.initial);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifier typeSpecRet;
		public Token v;
		public Token c;
		public Token s;
		public Token i;
		public Token l;
		public Token f;
		public Token d;
		public Token u;
		public Token b;
		public Token id;
		public TerminalNode Void() { return getToken(SimpleLangParser.Void, 0); }
		public TerminalNode Char() { return getToken(SimpleLangParser.Char, 0); }
		public TerminalNode Short() { return getToken(SimpleLangParser.Short, 0); }
		public TerminalNode Int() { return getToken(SimpleLangParser.Int, 0); }
		public TerminalNode Long() { return getToken(SimpleLangParser.Long, 0); }
		public TerminalNode Float() { return getToken(SimpleLangParser.Float, 0); }
		public TerminalNode Double() { return getToken(SimpleLangParser.Double, 0); }
		public TerminalNode Signed() { return getToken(SimpleLangParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(SimpleLangParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(SimpleLangParser.Bool, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeSpecifier);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				((TypeSpecifierContext)_localctx).v = match(Void);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).v!=null?((TypeSpecifierContext)_localctx).v.getText():null));
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				((TypeSpecifierContext)_localctx).c = match(Char);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).c!=null?((TypeSpecifierContext)_localctx).c.getText():null));
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				((TypeSpecifierContext)_localctx).s = match(Short);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).s!=null?((TypeSpecifierContext)_localctx).s.getText():null));
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				((TypeSpecifierContext)_localctx).i = match(Int);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).i!=null?((TypeSpecifierContext)_localctx).i.getText():null));
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				((TypeSpecifierContext)_localctx).l = match(Long);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).l!=null?((TypeSpecifierContext)_localctx).l.getText():null));
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				((TypeSpecifierContext)_localctx).f = match(Float);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).f!=null?((TypeSpecifierContext)_localctx).f.getText():null));
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				((TypeSpecifierContext)_localctx).d = match(Double);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).d!=null?((TypeSpecifierContext)_localctx).d.getText():null));
				}
				break;
			case Signed:
				enterOuterAlt(_localctx, 8);
				{
				setState(454);
				((TypeSpecifierContext)_localctx).s = match(Signed);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).s!=null?((TypeSpecifierContext)_localctx).s.getText():null));
				}
				break;
			case Unsigned:
				enterOuterAlt(_localctx, 9);
				{
				setState(456);
				((TypeSpecifierContext)_localctx).u = match(Unsigned);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).u!=null?((TypeSpecifierContext)_localctx).u.getText():null));
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 10);
				{
				setState(458);
				((TypeSpecifierContext)_localctx).b = match(Bool);
				((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier((((TypeSpecifierContext)_localctx).b!=null?((TypeSpecifierContext)_localctx).b.getText():null));
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 11);
				{
				setState(460);
				((TypeSpecifierContext)_localctx).id = match(Identifier);
				Identifier identifier = new Identifier((((TypeSpecifierContext)_localctx).id!=null?((TypeSpecifierContext)_localctx).id.getText():null)); ((TypeSpecifierContext)_localctx).typeSpecRet =  new TypeSpecifier(identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public SpecifierQualifierList specQualList;
		public TypeSpecifierContext t;
		public Token c;
		public SpecifierQualifierListContext s;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Const() { return getToken(SimpleLangParser.Const, 0); }
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_specifierQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SpecifierQualifierListContext)_localctx).specQualList =  new SpecifierQualifierList();
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Identifier:
				{
				setState(465);
				((SpecifierQualifierListContext)_localctx).t = typeSpecifier();
				_localctx.specQualList.setTypeSpecifier(((SpecifierQualifierListContext)_localctx).t.typeSpecRet);
				}
				break;
			case Const:
				{
				setState(468);
				((SpecifierQualifierListContext)_localctx).c = match(Const);
				TypeSpecifier t = new TypeSpecifier((((SpecifierQualifierListContext)_localctx).c!=null?((SpecifierQualifierListContext)_localctx).c.getText():null)); _localctx.specQualList.setTypeSpecifier(t);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11645592L) != 0) || _la==Identifier) {
				{
				setState(472);
				((SpecifierQualifierListContext)_localctx).s = specifierQualifierList();
				_localctx.specQualList.setSpecifierQualifierList(((SpecifierQualifierListContext)_localctx).s.specQualList);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public Declarator dec;
		public DirectDeclaratorContext d;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(477);
				pointer();
				}
			}

			{
			setState(480);
			((DeclaratorContext)_localctx).d = directDeclarator(0);
			((DeclaratorContext)_localctx).dec =  new Declarator(); _localctx.dec.setDirectDeclarator(((DeclaratorContext)_localctx).d.directDec); _localctx.dec.setLine(((DeclaratorContext)_localctx).d.directDec.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclarator directDec;
		public DirectDeclaratorContext d_;
		public DirectDeclaratorContext d__;
		public Token i;
		public DeclaratorContext d;
		public ExpressionContext e;
		public ParameterListContext p;
		public IdentifierListContext i1;
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				((DirectDeclaratorContext)_localctx).directDec =  new DirectDeclarator();
				{
				setState(485);
				((DirectDeclaratorContext)_localctx).i = match(Identifier);
				_localctx.directDec.setIdentifier((((DirectDeclaratorContext)_localctx).i!=null?((DirectDeclaratorContext)_localctx).i.getText():null)); _localctx.directDec.setLine((((DirectDeclaratorContext)_localctx).i!=null?((DirectDeclaratorContext)_localctx).i.getLine():0));
				}
				}
				break;
			case LeftParen:
				{
				setState(487);
				match(LeftParen);
				((DirectDeclaratorContext)_localctx).directDec =  new DirectDeclarator();
				{
				setState(489);
				((DirectDeclaratorContext)_localctx).d = declarator();
				_localctx.directDec.setDeclarator(((DirectDeclaratorContext)_localctx).d.dec); _localctx.directDec.setLine(((DirectDeclaratorContext)_localctx).d.dec.getLine());
				}
				setState(492);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.d_ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(496);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						((DirectDeclaratorContext)_localctx).directDec =  new DirectDeclarator();
						_localctx.directDec.setDirectDeclarator(((DirectDeclaratorContext)_localctx).d_.directDec); _localctx.directDec.setLine(((DirectDeclaratorContext)_localctx).d_.directDec.getLine());
						setState(499);
						match(LeftBracket);
						setState(503);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
							{
							setState(500);
							((DirectDeclaratorContext)_localctx).e = expression(0);
							_localctx.directDec.setExpression(((DirectDeclaratorContext)_localctx).e.expressionRet);
							}
						}

						setState(505);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.d__ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(506);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						((DirectDeclaratorContext)_localctx).directDec =  new DirectDeclarator();
						_localctx.directDec.setDirectDeclarator(((DirectDeclaratorContext)_localctx).d__.directDec); _localctx.directDec.setLine(((DirectDeclaratorContext)_localctx).d__.directDec.getLine());
						setState(509);
						match(LeftParen);
						setState(518);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(510);
							((DirectDeclaratorContext)_localctx).p = parameterList();
							_localctx.directDec.setParameterList(((DirectDeclaratorContext)_localctx).p.paramList);
							}
							break;
						case 2:
							{
							setState(516);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Identifier) {
								{
								setState(513);
								((DirectDeclaratorContext)_localctx).i1 = identifierList();
								_localctx.directDec.setIdentifierList(((DirectDeclaratorContext)_localctx).i1.idList);
								}
							}

							}
							break;
						}
						setState(520);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> Star() { return getTokens(SimpleLangParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(SimpleLangParser.Star, i);
		}
		public List<TerminalNode> Const() { return getTokens(SimpleLangParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(SimpleLangParser.Const, i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(526);
				match(Star);
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(528); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(527);
						match(Const);
						}
						}
						setState(530); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Const );
					}
				}

				}
				}
				setState(536); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Star );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterList paramList;
		public ParameterDeclarationContext p1;
		public ParameterDeclarationContext p2;
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParameterListContext)_localctx).paramList =  new ParameterList();
			setState(539);
			((ParameterListContext)_localctx).p1 = parameterDeclaration();
			_localctx.paramList.addParameterDeclaration(((ParameterListContext)_localctx).p1.paramDec);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(541);
				match(Comma);
				setState(542);
				((ParameterListContext)_localctx).p2 = parameterDeclaration();
				_localctx.paramList.addParameterDeclaration(((ParameterListContext)_localctx).p2.paramDec);
				}
				}
				setState(549);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterDeclaration paramDec;
		public DeclarationSpecifiersContext d1;
		public DeclaratorContext d2;
		public AbstractDeclaratorContext a;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			((ParameterDeclarationContext)_localctx).d1 = declarationSpecifiers();
			((ParameterDeclarationContext)_localctx).paramDec =  new ParameterDeclaration(((ParameterDeclarationContext)_localctx).d1.decSpecsRet);
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(552);
				((ParameterDeclarationContext)_localctx).d2 = declarator();
				_localctx.paramDec.setDeclarator(((ParameterDeclarationContext)_localctx).d2.dec);
				}
				break;
			case 2:
				{
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099595513856L) != 0)) {
					{
					setState(555);
					((ParameterDeclarationContext)_localctx).a = abstractDeclarator();
					_localctx.paramDec.setAbstractDeclarator(((ParameterDeclarationContext)_localctx).a.abstDec);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierList idList;
		public Token i;
		public Token i1;
		public List<TerminalNode> Identifier() { return getTokens(SimpleLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLangParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((IdentifierListContext)_localctx).idList =  new IdentifierList();
			setState(563);
			((IdentifierListContext)_localctx).i = match(Identifier);
			_localctx.idList.addIdentifier((((IdentifierListContext)_localctx).i!=null?((IdentifierListContext)_localctx).i.getText():null));
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(565);
				match(Comma);
				setState(566);
				((IdentifierListContext)_localctx).i1 = match(Identifier);
				_localctx.idList.addIdentifier((((IdentifierListContext)_localctx).i1!=null?((IdentifierListContext)_localctx).i1.getText():null));
				}
				}
				setState(572);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TypeName typeNameRet;
		public SpecifierQualifierListContext s;
		public AbstractDeclaratorContext a;
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			((TypeNameContext)_localctx).s = specifierQualifierList();
			((TypeNameContext)_localctx).typeNameRet =  new TypeName(((TypeNameContext)_localctx).s.specQualList);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099595513856L) != 0)) {
				{
				setState(575);
				((TypeNameContext)_localctx).a = abstractDeclarator();
				_localctx.typeNameRet.setAbstractDeclarator(((TypeNameContext)_localctx).a.abstDec);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclarator abstDec;
		public DirectAbstractDeclaratorContext d;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_abstractDeclarator);
		int _la;
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((AbstractDeclaratorContext)_localctx).abstDec =  new AbstractDeclarator();
				setState(581);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(582);
					pointer();
					}
				}

				setState(585);
				((AbstractDeclaratorContext)_localctx).d = directAbstractDeclarator(0);
				_localctx.abstDec.setDirectAbstractDeclarator(((AbstractDeclaratorContext)_localctx).d.directAbstDec);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public DirectAbstractDeclarator directAbstDec;
		public DirectAbstractDeclaratorContext d;
		public ExpressionContext e;
		public AbstractDeclaratorContext a;
		public ParameterListContext p;
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDirectAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				{
				((DirectAbstractDeclaratorContext)_localctx).directAbstDec =  new DirectAbstractDeclarator();
				setState(592);
				match(LeftBracket);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
					{
					setState(593);
					((DirectAbstractDeclaratorContext)_localctx).e = expression(0);
					_localctx.directAbstDec.setExpression(((DirectAbstractDeclaratorContext)_localctx).e.expressionRet);
					}
				}

				setState(598);
				match(RightBracket);
				}
				break;
			case LeftParen:
				{
				setState(599);
				match(LeftParen);
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
				case LeftBracket:
				case Star:
					{
					setState(600);
					((DirectAbstractDeclaratorContext)_localctx).a = abstractDeclarator();
					_localctx.directAbstDec.setAbstractDeclarator(((DirectAbstractDeclaratorContext)_localctx).a.abstDec);
					}
					break;
				case Char:
				case Const:
				case Double:
				case Float:
				case Int:
				case Long:
				case Short:
				case Signed:
				case Typedef:
				case Unsigned:
				case Void:
				case Bool:
				case RightParen:
				case Identifier:
					{
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12169880L) != 0) || _la==Identifier) {
						{
						setState(603);
						((DirectAbstractDeclaratorContext)_localctx).p = parameterList();
						_localctx.directAbstDec.setParameterList(((DirectAbstractDeclaratorContext)_localctx).p.paramList);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(610);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(613);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						_localctx.directAbstDec.setDirectAbstractDeclarator(((DirectAbstractDeclaratorContext)_localctx).d.directAbstDec);
						setState(615);
						match(LeftBracket);
						setState(619);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
							{
							setState(616);
							((DirectAbstractDeclaratorContext)_localctx).e = expression(0);
							_localctx.directAbstDec.setExpression(((DirectAbstractDeclaratorContext)_localctx).e.expressionRet);
							}
						}

						setState(621);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(622);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						_localctx.directAbstDec.setDirectAbstractDeclarator(((DirectAbstractDeclaratorContext)_localctx).d.directAbstDec);
						setState(624);
						match(LeftParen);
						setState(628);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12169880L) != 0) || _la==Identifier) {
							{
							setState(625);
							((DirectAbstractDeclaratorContext)_localctx).p = parameterList();
							_localctx.directAbstDec.setParameterList(((DirectAbstractDeclaratorContext)_localctx).p.paramList);
							}
						}

						setState(630);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public Initializer initial;
		public ExpressionContext e;
		public InitializerListContext i;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SimpleLangParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initializer);
		int _la;
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				((InitializerContext)_localctx).initial =  new Initializer();
				setState(637);
				((InitializerContext)_localctx).e = expression(0);
				_localctx.initial.setExpression(((InitializerContext)_localctx).e.expressionRet);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(LeftBrace);
				setState(641);
				((InitializerContext)_localctx).i = initializerList();
				_localctx.initial.setInitializerList(((InitializerContext)_localctx).i.initialList);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(643);
					match(Comma);
					}
				}

				setState(646);
				match(RightBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerListContext extends ParserRuleContext {
		public InitializerList initialList;
		public DesignationContext d;
		public InitializerContext i;
		public DesignationContext d1;
		public InitializerContext i1;
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((InitializerListContext)_localctx).initialList =  new InitializerList();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(651);
				((InitializerListContext)_localctx).d = designation();
				_localctx.initialList.addDesignation(((InitializerListContext)_localctx).d.designation_);
				}
			}

			setState(656);
			((InitializerListContext)_localctx).i = initializer();
			_localctx.initialList.addInitializer(((InitializerListContext)_localctx).i.initial);
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					match(Comma);
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(659);
						((InitializerListContext)_localctx).d1 = designation();
						_localctx.initialList.addDesignation(((InitializerListContext)_localctx).d1.designation_);
						}
					}

					setState(664);
					((InitializerListContext)_localctx).i1 = initializer();
					_localctx.initialList.addInitializer(((InitializerListContext)_localctx).i1.initial);
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DesignationContext extends ParserRuleContext {
		public Designation designation_;
		public DesignatorContext d;
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_designation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DesignationContext)_localctx).designation_ =  new Designation();
			setState(676); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(673);
				((DesignationContext)_localctx).d = designator();
				_localctx.designation_.addDesignator(((DesignationContext)_localctx).d.designator_);
				}
				}
				setState(678); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
			setState(680);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesignatorContext extends ParserRuleContext {
		public Designator designator_;
		public ExpressionContext e;
		public Token i;
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(SimpleLangParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_designator);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				((DesignatorContext)_localctx).designator_ =  new Designator();
				setState(683);
				match(LeftBracket);
				setState(684);
				((DesignatorContext)_localctx).e = expression(0);
				_localctx.designator_.setExpression(((DesignatorContext)_localctx).e.expressionRet);
				setState(686);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				match(Dot);
				setState(689);
				((DesignatorContext)_localctx).i = match(Identifier);
				_localctx.designator_.setIdentifier((((DesignatorContext)_localctx).i!=null?((DesignatorContext)_localctx).i.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Stmt stmtRet;
		public CompoundStatementContext c;
		public ExpressionStatementContext e;
		public SelectionStatementContext s;
		public IterationStatementContext i;
		public JumpStatementContext j;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(693);
				((StatementContext)_localctx).c = compoundStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).c.CStmt;
				}
				}
				break;
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Semi:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(696);
				((StatementContext)_localctx).e = expressionStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).e.exprStmtRet;
				}
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(699);
				((StatementContext)_localctx).s = selectionStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).s.selectionStmtRet;
				}
				break;
			case Do:
			case For:
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(702);
				((StatementContext)_localctx).i = iterationStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).i.iterStmtRet;
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 5);
				{
				setState(705);
				((StatementContext)_localctx).j = jumpStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).j.jumpStmtRet;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public CompoundStmt CStmt;
		public BlockItemContext b;
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((CompoundStatementContext)_localctx).CStmt =  new CompoundStmt();
			setState(711);
			match(LeftBrace);
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5358951256030972L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0)) {
				{
				setState(715); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(712);
					((CompoundStatementContext)_localctx).b = blockItem();
					_localctx.CStmt.addItem(((CompoundStatementContext)_localctx).b.bItem);
					}
					}
					setState(717); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 5358951256030972L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
				}
			}

			setState(721);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockItemContext extends ParserRuleContext {
		public BlockItem bItem;
		public StatementContext s;
		public DeclarationContext d;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_blockItem);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((BlockItemContext)_localctx).bItem =  new BlockItem();
				{
				setState(724);
				((BlockItemContext)_localctx).s = statement();
				_localctx.bItem.setStatement(((BlockItemContext)_localctx).s.stmtRet);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((BlockItemContext)_localctx).bItem =  new BlockItem();
				{
				setState(728);
				((BlockItemContext)_localctx).d = declaration();
				_localctx.bItem.setDec(((BlockItemContext)_localctx).d.Dec);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStmt exprStmtRet;
		public ExpressionContext e;
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionStatementContext)_localctx).exprStmtRet =  new ExpressionStmt();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
				{
				setState(734);
				((ExpressionStatementContext)_localctx).e = expression(0);
				_localctx.exprStmtRet.setExpression(((ExpressionStatementContext)_localctx).e.expressionRet);
				}
			}

			setState(739);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public SelectionStmt selectionStmtRet;
		public Token i;
		public ExpressionContext e;
		public StatementContext s;
		public Token el;
		public Token els;
		public StatementContext s1;
		public List<TerminalNode> LeftParen() { return getTokens(SimpleLangParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(SimpleLangParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(SimpleLangParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(SimpleLangParser.RightParen, i);
		}
		public List<TerminalNode> If() { return getTokens(SimpleLangParser.If); }
		public TerminalNode If(int i) {
			return getToken(SimpleLangParser.If, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(SimpleLangParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(SimpleLangParser.Else, i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectionStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			((SelectionStatementContext)_localctx).i = match(If);
			setState(742);
			match(LeftParen);
			setState(743);
			((SelectionStatementContext)_localctx).e = expression(0);
			setState(744);
			match(RightParen);
			setState(745);
			((SelectionStatementContext)_localctx).s = statement();
			((SelectionStatementContext)_localctx).selectionStmtRet =  new SelectionStmt(((SelectionStatementContext)_localctx).e.expressionRet, ((SelectionStatementContext)_localctx).s.stmtRet); _localctx.selectionStmtRet.setIfLine((((SelectionStatementContext)_localctx).i!=null?((SelectionStatementContext)_localctx).i.getLine():0));
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					((SelectionStatementContext)_localctx).el = match(Else);
					setState(748);
					match(If);
					setState(749);
					match(LeftParen);
					setState(750);
					((SelectionStatementContext)_localctx).e = expression(0);
					setState(751);
					match(RightParen);
					setState(752);
					((SelectionStatementContext)_localctx).s = statement();
					_localctx.selectionStmtRet.addElseIf(((SelectionStatementContext)_localctx).s.stmtRet, ((SelectionStatementContext)_localctx).e.expressionRet); _localctx.selectionStmtRet.setElseIfLine((((SelectionStatementContext)_localctx).el!=null?((SelectionStatementContext)_localctx).el.getLine():0));
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(760);
				((SelectionStatementContext)_localctx).els = match(Else);
				setState(761);
				((SelectionStatementContext)_localctx).s1 = statement();
				_localctx.selectionStmtRet.setElseStmt(((SelectionStatementContext)_localctx).s1.stmtRet); _localctx.selectionStmtRet.setElseLine((((SelectionStatementContext)_localctx).els!=null?((SelectionStatementContext)_localctx).els.getLine():0));
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStmt iterStmtRet;
		public Token w;
		public ExpressionContext e;
		public StatementContext s;
		public Token d;
		public Token fo;
		public ForConditionContext f;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode While() { return getToken(SimpleLangParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public TerminalNode Do() { return getToken(SimpleLangParser.Do, 0); }
		public TerminalNode For() { return getToken(SimpleLangParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_iterationStatement);
		try {
			setState(795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				((IterationStatementContext)_localctx).iterStmtRet =  new IterationStmt();
				setState(767);
				((IterationStatementContext)_localctx).w = match(While);
				setState(768);
				match(LeftParen);
				setState(769);
				((IterationStatementContext)_localctx).e = expression(0);
				_localctx.iterStmtRet.setExpression(((IterationStatementContext)_localctx).e.expressionRet); _localctx.iterStmtRet.setLine((((IterationStatementContext)_localctx).w!=null?((IterationStatementContext)_localctx).w.getLine():0));
				setState(771);
				match(RightParen);
				setState(772);
				((IterationStatementContext)_localctx).s = statement();
				_localctx.iterStmtRet.setStmt(((IterationStatementContext)_localctx).s.stmtRet);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				((IterationStatementContext)_localctx).iterStmtRet =  new IterationStmt();
				setState(776);
				((IterationStatementContext)_localctx).d = match(Do);
				setState(777);
				((IterationStatementContext)_localctx).s = statement();
				_localctx.iterStmtRet.setStmt(((IterationStatementContext)_localctx).s.stmtRet); _localctx.iterStmtRet.setLine((((IterationStatementContext)_localctx).d!=null?((IterationStatementContext)_localctx).d.getLine():0));
				setState(779);
				match(While);
				setState(780);
				match(LeftParen);
				setState(781);
				((IterationStatementContext)_localctx).e = expression(0);
				_localctx.iterStmtRet.setExpression(((IterationStatementContext)_localctx).e.expressionRet);
				setState(783);
				match(RightParen);
				setState(784);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				((IterationStatementContext)_localctx).iterStmtRet =  new IterationStmt();
				setState(787);
				((IterationStatementContext)_localctx).fo = match(For);
				setState(788);
				match(LeftParen);
				setState(789);
				((IterationStatementContext)_localctx).f = forCondition();
				_localctx.iterStmtRet.setForCondition(((IterationStatementContext)_localctx).f.forConditionRet); _localctx.iterStmtRet.setLine((((IterationStatementContext)_localctx).fo!=null?((IterationStatementContext)_localctx).fo.getLine():0));
				setState(791);
				match(RightParen);
				setState(792);
				((IterationStatementContext)_localctx).s = statement();
				_localctx.iterStmtRet.setStmt(((IterationStatementContext)_localctx).s.stmtRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends ParserRuleContext {
		public ForCondition forConditionRet;
		public ForDeclarationContext f;
		public ExpressionContext e;
		public ForExpressionContext f1;
		public ForExpressionContext f2;
		public List<TerminalNode> Semi() { return getTokens(SimpleLangParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(SimpleLangParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForConditionContext)_localctx).forConditionRet =  new ForCondition();
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(798);
				((ForConditionContext)_localctx).f = forDeclaration();
				_localctx.forConditionRet.setForDeclaration(((ForConditionContext)_localctx).f.forDecRet);
				}
				break;
			case 2:
				{
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
					{
					setState(801);
					((ForConditionContext)_localctx).e = expression(0);
					_localctx.forConditionRet.setExpression(((ForConditionContext)_localctx).e.expressionRet);
					}
				}

				}
				break;
			}
			setState(808);
			match(Semi);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
				{
				setState(809);
				((ForConditionContext)_localctx).f1 = forExpression();
				_localctx.forConditionRet.setForExpression1(((ForConditionContext)_localctx).f1.forExprRet);
				}
			}

			setState(814);
			match(Semi);
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
				{
				setState(815);
				((ForConditionContext)_localctx).f2 = forExpression();
				_localctx.forConditionRet.setForExpression2(((ForConditionContext)_localctx).f2.forExprRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public ForDeclaration forDecRet;
		public DeclarationSpecifiersContext d;
		public InitDeclaratorListContext i;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			((ForDeclarationContext)_localctx).d = declarationSpecifiers();
			((ForDeclarationContext)_localctx).forDecRet =  new ForDeclaration(((ForDeclarationContext)_localctx).d.decSpecsRet);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 35184372154369L) != 0)) {
				{
				setState(822);
				((ForDeclarationContext)_localctx).i = initDeclaratorList();
				_localctx.forDecRet.setInitDeclaratorList(((ForDeclarationContext)_localctx).i.initDecList);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public ForExpression forExprRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			((ForExpressionContext)_localctx).e1 = expression(0);
			((ForExpressionContext)_localctx).forExprRet =  new ForExpression(((ForExpressionContext)_localctx).e1.expressionRet);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(829);
				match(Comma);
				setState(830);
				((ForExpressionContext)_localctx).e2 = expression(0);
				_localctx.forExprRet.addExpression(((ForExpressionContext)_localctx).e2.expressionRet);
				}
				}
				setState(837);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStmt jumpStmtRet;
		public Token t;
		public ExpressionContext e;
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public TerminalNode Continue() { return getToken(SimpleLangParser.Continue, 0); }
		public TerminalNode Break() { return getToken(SimpleLangParser.Break, 0); }
		public TerminalNode Return() { return getToken(SimpleLangParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				{
				setState(838);
				((JumpStatementContext)_localctx).t = match(Continue);
				((JumpStatementContext)_localctx).jumpStmtRet =  new JumpStmt((((JumpStatementContext)_localctx).t!=null?((JumpStatementContext)_localctx).t.getText():null));
				}
				break;
			case Break:
				{
				setState(840);
				((JumpStatementContext)_localctx).t = match(Break);
				((JumpStatementContext)_localctx).jumpStmtRet =  new JumpStmt((((JumpStatementContext)_localctx).t!=null?((JumpStatementContext)_localctx).t.getText():null));
				}
				break;
			case Return:
				{
				setState(842);
				((JumpStatementContext)_localctx).t = match(Return);
				((JumpStatementContext)_localctx).jumpStmtRet =  new JumpStmt((((JumpStatementContext)_localctx).t!=null?((JumpStatementContext)_localctx).t.getText():null));
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
					{
					setState(844);
					((JumpStatementContext)_localctx).e = expression(0);
					_localctx.jumpStmtRet.setExpression(((JumpStatementContext)_localctx).e.expressionRet);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(851);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
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
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 25:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001N\u0356\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000U\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001]\b\u0001\u000b\u0001\f\u0001^\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003n\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003v\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003}\b\u0003\n\u0003\f\u0003\u0080\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0086\b\u0004\u000b"+
		"\u0004\f\u0004\u0087\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0091\b\u0005\u000b\u0005\f"+
		"\u0005\u0092\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00ac\b\u0005\n\u0005\f\u0005\u00af\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00b6\b\u0005\u000b"+
		"\u0005\f\u0005\u00b7\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c7\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00d6\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00de\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u012a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u013a\b\u0005\u000b"+
		"\u0005\f\u0005\u013b\u0005\u0005\u013e\b\u0005\n\u0005\f\u0005\u0141\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u014a\b\u0006\n\u0006\f\u0006\u014d\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u015b\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u016c\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0184\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u018d\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u0195\b\u000b\u000b\u000b\f\u000b\u0196\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u01a0\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u01aa\b\r\n\r\f\r\u01ad\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01b7\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u01cf\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01d7\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01dc\b\u0010\u0001\u0011"+
		"\u0003\u0011\u01df\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01ef\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01f8\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0205\b\u0012\u0003\u0012\u0207\b"+
		"\u0012\u0001\u0012\u0005\u0012\u020a\b\u0012\n\u0012\f\u0012\u020d\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0004\u0013\u0211\b\u0013\u000b\u0013\f\u0013"+
		"\u0212\u0003\u0013\u0215\b\u0013\u0004\u0013\u0217\b\u0013\u000b\u0013"+
		"\f\u0013\u0218\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0222\b\u0014\n\u0014\f\u0014\u0225"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u022f\b\u0015\u0003\u0015\u0231"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0239\b\u0016\n\u0016\f\u0016\u023c\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0243\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0248\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u024d\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0255\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u025f\b\u0019\u0003\u0019\u0261\b"+
		"\u0019\u0001\u0019\u0003\u0019\u0264\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u026c\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0275\b\u0019\u0001\u0019\u0005\u0019\u0278\b\u0019"+
		"\n\u0019\f\u0019\u027b\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0285"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0289\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u028f\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0297\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u029c\b"+
		"\u001b\n\u001b\f\u001b\u029f\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0004\u001c\u02a5\b\u001c\u000b\u001c\f\u001c\u02a6\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u02b4"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02c5\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u02cc"+
		"\b\u001f\u000b\u001f\f\u001f\u02cd\u0003\u001f\u02d0\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u02dc\b \u0001!\u0001!\u0001!\u0001!\u0003!\u02e2\b!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u02f4\b\"\n\"\f\"\u02f7\t\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02fd\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u031c\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0325\b$\u0003$\u0327\b$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u032d\b$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u0333\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u033a\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u0342\b&\n&\f&\u0345\t&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0350"+
		"\b\'\u0003\'\u0352\b\'\u0001\'\u0001\'\u0001\'\u0000\u0003\n$2(\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0005\u0001\u0000(*\u0002\u0000"+
		"$$&&\u0001\u0000\"#\u0001\u0000\u001e!\u0001\u0000AB\u03b5\u0000P\u0001"+
		"\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004g\u0001\u0000\u0000"+
		"\u0000\u0006i\u0001\u0000\u0000\u0000\b\u0081\u0001\u0000\u0000\u0000"+
		"\n\u00dd\u0001\u0000\u0000\u0000\f\u0142\u0001\u0000\u0000\u0000\u000e"+
		"\u015a\u0001\u0000\u0000\u0000\u0010\u016b\u0001\u0000\u0000\u0000\u0012"+
		"\u0183\u0001\u0000\u0000\u0000\u0014\u0185\u0001\u0000\u0000\u0000\u0016"+
		"\u0190\u0001\u0000\u0000\u0000\u0018\u019f\u0001\u0000\u0000\u0000\u001a"+
		"\u01a1\u0001\u0000\u0000\u0000\u001c\u01ae\u0001\u0000\u0000\u0000\u001e"+
		"\u01ce\u0001\u0000\u0000\u0000 \u01d0\u0001\u0000\u0000\u0000\"\u01de"+
		"\u0001\u0000\u0000\u0000$\u01ee\u0001\u0000\u0000\u0000&\u0216\u0001\u0000"+
		"\u0000\u0000(\u021a\u0001\u0000\u0000\u0000*\u0226\u0001\u0000\u0000\u0000"+
		",\u0232\u0001\u0000\u0000\u0000.\u023d\u0001\u0000\u0000\u00000\u024c"+
		"\u0001\u0000\u0000\u00002\u0263\u0001\u0000\u0000\u00004\u0288\u0001\u0000"+
		"\u0000\u00006\u028a\u0001\u0000\u0000\u00008\u02a0\u0001\u0000\u0000\u0000"+
		":\u02b3\u0001\u0000\u0000\u0000<\u02c4\u0001\u0000\u0000\u0000>\u02c6"+
		"\u0001\u0000\u0000\u0000@\u02db\u0001\u0000\u0000\u0000B\u02dd\u0001\u0000"+
		"\u0000\u0000D\u02e5\u0001\u0000\u0000\u0000F\u031b\u0001\u0000\u0000\u0000"+
		"H\u031d\u0001\u0000\u0000\u0000J\u0334\u0001\u0000\u0000\u0000L\u033b"+
		"\u0001\u0000\u0000\u0000N\u0351\u0001\u0000\u0000\u0000PT\u0006\u0000"+
		"\uffff\uffff\u0000QR\u0003\u0002\u0001\u0000RS\u0006\u0000\uffff\uffff"+
		"\u0000SU\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u0000\u0000\u0001W\u0001"+
		"\u0001\u0000\u0000\u0000X\\\u0006\u0001\uffff\uffff\u0000YZ\u0003\u0004"+
		"\u0002\u0000Z[\u0006\u0001\uffff\uffff\u0000[]\u0001\u0000\u0000\u0000"+
		"\\Y\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_\u0003\u0001\u0000\u0000\u0000`a\u0003"+
		"\u0006\u0003\u0000ab\u0006\u0002\uffff\uffff\u0000bh\u0001\u0000\u0000"+
		"\u0000cd\u0003\u0014\n\u0000de\u0006\u0002\uffff\uffff\u0000eh\u0001\u0000"+
		"\u0000\u0000fh\u00054\u0000\u0000g`\u0001\u0000\u0000\u0000gc\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0005\u0001\u0000\u0000\u0000"+
		"im\u0006\u0003\uffff\uffff\u0000jk\u0003\u0016\u000b\u0000kl\u0006\u0003"+
		"\uffff\uffff\u0000ln\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0003\"\u0011\u0000"+
		"pq\u0006\u0003\uffff\uffff\u0000qu\u0001\u0000\u0000\u0000rs\u0003\b\u0004"+
		"\u0000st\u0006\u0003\uffff\uffff\u0000tv\u0001\u0000\u0000\u0000ur\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0003>\u001f\u0000xy\u0006\u0003\uffff\uffff\u0000y~\u0001\u0000\u0000"+
		"\u0000z}\u00054\u0000\u0000{}\u0005\u0001\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0007\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0085\u0006\u0004\uffff"+
		"\uffff\u0000\u0082\u0083\u0003\u0014\n\u0000\u0083\u0084\u0006\u0004\uffff"+
		"\uffff\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\t\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0006\u0005\uffff\uffff\u0000\u008a\u008b\u0005E\u0000"+
		"\u0000\u008b\u008c\u0006\u0005\uffff\uffff\u0000\u008c\u00de\u0006\u0005"+
		"\uffff\uffff\u0000\u008d\u008e\u0005F\u0000\u0000\u008e\u00de\u0006\u0005"+
		"\uffff\uffff\u0000\u008f\u0091\u0005H\u0000\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u00de\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\u0018\u0000\u0000\u0095\u0096\u0003\n\u0005"+
		"\u0000\u0096\u0097\u0006\u0005\uffff\uffff\u0000\u0097\u0098\u0005\u0019"+
		"\u0000\u0000\u0098\u00de\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0018"+
		"\u0000\u0000\u009a\u009b\u0003.\u0017\u0000\u009b\u009c\u0005\u0019\u0000"+
		"\u0000\u009c\u009d\u0005\u001c\u0000\u0000\u009d\u009e\u00036\u001b\u0000"+
		"\u009e\u00a0\u0006\u0005\uffff\uffff\u0000\u009f\u00a1\u00055\u0000\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u001d\u0000\u0000"+
		"\u00a3\u00de\u0001\u0000\u0000\u0000\u00a4\u00ad\u0006\u0005\uffff\uffff"+
		"\u0000\u00a5\u00a6\u0005%\u0000\u0000\u00a6\u00ac\u0006\u0005\uffff\uffff"+
		"\u0000\u00a7\u00a8\u0005\'\u0000\u0000\u00a8\u00ac\u0006\u0005\uffff\uffff"+
		"\u0000\u00a9\u00aa\u0005\u0011\u0000\u0000\u00aa\u00ac\u0006\u0005\uffff"+
		"\uffff\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00d5\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005E\u0000\u0000\u00b1\u00d6\u0006\u0005\uffff"+
		"\uffff\u0000\u00b2\u00b3\u0005F\u0000\u0000\u00b3\u00d6\u0006\u0005\uffff"+
		"\uffff\u0000\u00b4\u00b6\u0005H\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0018\u0000\u0000\u00ba\u00bb\u0003\n\u0005\u0000"+
		"\u00bb\u00bc\u0006\u0005\uffff\uffff\u0000\u00bc\u00bd\u0005\u0019\u0000"+
		"\u0000\u00bd\u00d6\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0018\u0000"+
		"\u0000\u00bf\u00c0\u0003.\u0017\u0000\u00c0\u00c1\u0006\u0005\uffff\uffff"+
		"\u0000\u00c1\u00c2\u0005\u0019\u0000\u0000\u00c2\u00c3\u0005\u001c\u0000"+
		"\u0000\u00c3\u00c4\u00036\u001b\u0000\u00c4\u00c6\u0006\u0005\uffff\uffff"+
		"\u0000\u00c5\u00c7\u00055\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005\u001d\u0000\u0000\u00c9\u00d6\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0003\u000e\u0007\u0000\u00cb\u00cc\u0006\u0005\uffff\uffff"+
		"\u0000\u00cc\u00cd\u0003\u0010\b\u0000\u00cd\u00ce\u0006\u0005\uffff\uffff"+
		"\u0000\u00ce\u00d6\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0011\u0000"+
		"\u0000\u00d0\u00d1\u0005\u0018\u0000\u0000\u00d1\u00d2\u0003.\u0017\u0000"+
		"\u00d2\u00d3\u0006\u0005\uffff\uffff\u0000\u00d3\u00d4\u0005\u0019\u0000"+
		"\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00b0\u0001\u0000\u0000"+
		"\u0000\u00d5\u00b2\u0001\u0000\u0000\u0000\u00d5\u00b5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00b9\u0001\u0000\u0000\u0000\u00d5\u00be\u0001\u0000\u0000"+
		"\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d6\u00de\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0018\u0000"+
		"\u0000\u00d8\u00d9\u0003.\u0017\u0000\u00d9\u00da\u0005\u0019\u0000\u0000"+
		"\u00da\u00db\u0003\u0010\b\u0000\u00db\u00dc\u0006\u0005\uffff\uffff\u0000"+
		"\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u0089\u0001\u0000\u0000\u0000"+
		"\u00dd\u008d\u0001\u0000\u0000\u0000\u00dd\u0090\u0001\u0000\u0000\u0000"+
		"\u00dd\u0094\u0001\u0000\u0000\u0000\u00dd\u0099\u0001\u0000\u0000\u0000"+
		"\u00dd\u00a4\u0001\u0000\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000"+
		"\u00de\u013f\u0001\u0000\u0000\u0000\u00df\u00e0\n\r\u0000\u0000\u00e0"+
		"\u00e1\u0007\u0000\u0000\u0000\u00e1\u00e2\u0003\n\u0005\u000e\u00e2\u00e3"+
		"\u0006\u0005\uffff\uffff\u0000\u00e3\u013e\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\n\f\u0000\u0000\u00e5\u00e6\u0007\u0001\u0000\u0000\u00e6\u00e7"+
		"\u0003\n\u0005\r\u00e7\u00e8\u0006\u0005\uffff\uffff\u0000\u00e8\u013e"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\n\u000b\u0000\u0000\u00ea\u00eb\u0007"+
		"\u0002\u0000\u0000\u00eb\u00ec\u0003\n\u0005\f\u00ec\u00ed\u0006\u0005"+
		"\uffff\uffff\u0000\u00ed\u013e\u0001\u0000\u0000\u0000\u00ee\u00ef\n\n"+
		"\u0000\u0000\u00ef\u00f0\u0007\u0003\u0000\u0000\u00f0\u00f1\u0003\n\u0005"+
		"\u000b\u00f1\u00f2\u0006\u0005\uffff\uffff\u0000\u00f2\u013e\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\n\t\u0000\u0000\u00f4\u00f5\u0007\u0004\u0000"+
		"\u0000\u00f5\u00f6\u0003\n\u0005\n\u00f6\u00f7\u0006\u0005\uffff\uffff"+
		"\u0000\u00f7\u013e\u0001\u0000\u0000\u0000\u00f8\u00f9\n\b\u0000\u0000"+
		"\u00f9\u00fa\u0005+\u0000\u0000\u00fa\u00fb\u0003\n\u0005\t\u00fb\u00fc"+
		"\u0006\u0005\uffff\uffff\u0000\u00fc\u013e\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\n\u0007\u0000\u0000\u00fe\u00ff\u0005/\u0000\u0000\u00ff\u0100"+
		"\u0003\n\u0005\b\u0100\u0101\u0006\u0005\uffff\uffff\u0000\u0101\u013e"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\n\u0006\u0000\u0000\u0103\u0104\u0005"+
		",\u0000\u0000\u0104\u0105\u0003\n\u0005\u0007\u0105\u0106\u0006\u0005"+
		"\uffff\uffff\u0000\u0106\u013e\u0001\u0000\u0000\u0000\u0107\u0108\n\u0005"+
		"\u0000\u0000\u0108\u0109\u0005-\u0000\u0000\u0109\u010a\u0003\n\u0005"+
		"\u0006\u010a\u010b\u0006\u0005\uffff\uffff\u0000\u010b\u013e\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\n\u0004\u0000\u0000\u010d\u010e\u0005.\u0000"+
		"\u0000\u010e\u010f\u0003\n\u0005\u0005\u010f\u0110\u0006\u0005\uffff\uffff"+
		"\u0000\u0110\u013e\u0001\u0000\u0000\u0000\u0111\u0112\n\u0003\u0000\u0000"+
		"\u0112\u0113\u00052\u0000\u0000\u0113\u0114\u0003\n\u0005\u0000\u0114"+
		"\u0115\u00053\u0000\u0000\u0115\u0116\u0003\n\u0005\u0004\u0116\u0117"+
		"\u0006\u0005\uffff\uffff\u0000\u0117\u013e\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\n\u0002\u0000\u0000\u0119\u011a\u0003\u0012\t\u0000\u011a\u011b"+
		"\u0003\n\u0005\u0003\u011b\u011c\u0006\u0005\uffff\uffff\u0000\u011c\u013e"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\n\u0013\u0000\u0000\u011e\u011f\u0005"+
		"\u001a\u0000\u0000\u011f\u0120\u0003\n\u0005\u0000\u0120\u0121\u0006\u0005"+
		"\uffff\uffff\u0000\u0121\u0122\u0005\u001b\u0000\u0000\u0122\u013e\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\n\u0012\u0000\u0000\u0124\u0125\u0006\u0005"+
		"\uffff\uffff\u0000\u0125\u0129\u0005\u0018\u0000\u0000\u0126\u0127\u0003"+
		"\f\u0006\u0000\u0127\u0128\u0006\u0005\uffff\uffff\u0000\u0128\u012a\u0001"+
		"\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0006"+
		"\u0005\uffff\uffff\u0000\u012c\u013e\u0005\u0019\u0000\u0000\u012d\u012e"+
		"\n\u0011\u0000\u0000\u012e\u012f\u0005%\u0000\u0000\u012f\u013e\u0006"+
		"\u0005\uffff\uffff\u0000\u0130\u0131\n\u0010\u0000\u0000\u0131\u0132\u0005"+
		"\'\u0000\u0000\u0132\u013e\u0006\u0005\uffff\uffff\u0000\u0133\u0134\n"+
		"\u0001\u0000\u0000\u0134\u0139\u0006\u0005\uffff\uffff\u0000\u0135\u0136"+
		"\u00055\u0000\u0000\u0136\u0137\u0003\n\u0005\u0000\u0137\u0138\u0006"+
		"\u0005\uffff\uffff\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0135"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e"+
		"\u0001\u0000\u0000\u0000\u013d\u00df\u0001\u0000\u0000\u0000\u013d\u00e4"+
		"\u0001\u0000\u0000\u0000\u013d\u00e9\u0001\u0000\u0000\u0000\u013d\u00ee"+
		"\u0001\u0000\u0000\u0000\u013d\u00f3\u0001\u0000\u0000\u0000\u013d\u00f8"+
		"\u0001\u0000\u0000\u0000\u013d\u00fd\u0001\u0000\u0000\u0000\u013d\u0102"+
		"\u0001\u0000\u0000\u0000\u013d\u0107\u0001\u0000\u0000\u0000\u013d\u010c"+
		"\u0001\u0000\u0000\u0000\u013d\u0111\u0001\u0000\u0000\u0000\u013d\u0118"+
		"\u0001\u0000\u0000\u0000\u013d\u011d\u0001\u0000\u0000\u0000\u013d\u0123"+
		"\u0001\u0000\u0000\u0000\u013d\u012d\u0001\u0000\u0000\u0000\u013d\u0130"+
		"\u0001\u0000\u0000\u0000\u013d\u0133\u0001\u0000\u0000\u0000\u013e\u0141"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u000b\u0001\u0000\u0000\u0000\u0141\u013f"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0006\u0006\uffff\uffff\u0000\u0143"+
		"\u0144\u0003\n\u0005\u0000\u0144\u014b\u0006\u0006\uffff\uffff\u0000\u0145"+
		"\u0146\u00055\u0000\u0000\u0146\u0147\u0003\n\u0005\u0000\u0147\u0148"+
		"\u0006\u0006\uffff\uffff\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149"+
		"\u0145\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\r\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005+\u0000\u0000\u014f\u015b\u0006\u0007\uffff\uffff\u0000\u0150\u0151"+
		"\u0005(\u0000\u0000\u0151\u015b\u0006\u0007\uffff\uffff\u0000\u0152\u0153"+
		"\u0005$\u0000\u0000\u0153\u015b\u0006\u0007\uffff\uffff\u0000\u0154\u0155"+
		"\u0005&\u0000\u0000\u0155\u015b\u0006\u0007\uffff\uffff\u0000\u0156\u0157"+
		"\u00051\u0000\u0000\u0157\u015b\u0006\u0007\uffff\uffff\u0000\u0158\u0159"+
		"\u00050\u0000\u0000\u0159\u015b\u0006\u0007\uffff\uffff\u0000\u015a\u014e"+
		"\u0001\u0000\u0000\u0000\u015a\u0150\u0001\u0000\u0000\u0000\u015a\u0152"+
		"\u0001\u0000\u0000\u0000\u015a\u0154\u0001\u0000\u0000\u0000\u015a\u0156"+
		"\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u000f"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0006\b\uffff\uffff\u0000\u015d\u015e"+
		"\u0005\u0018\u0000\u0000\u015e\u015f\u0003.\u0017\u0000\u015f\u0160\u0006"+
		"\b\uffff\uffff\u0000\u0160\u0161\u0005\u0019\u0000\u0000\u0161\u0162\u0003"+
		"\u0010\b\u0000\u0162\u0163\u0006\b\uffff\uffff\u0000\u0163\u016c\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0006\b\uffff\uffff\u0000\u0165\u0166\u0003"+
		"\n\u0005\u0000\u0166\u0167\u0006\b\uffff\uffff\u0000\u0167\u016c\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0006\b\uffff\uffff\u0000\u0169\u016a\u0005"+
		"G\u0000\u0000\u016a\u016c\u0006\b\uffff\uffff\u0000\u016b\u015c\u0001"+
		"\u0000\u0000\u0000\u016b\u0164\u0001\u0000\u0000\u0000\u016b\u0168\u0001"+
		"\u0000\u0000\u0000\u016c\u0011\u0001\u0000\u0000\u0000\u016d\u016e\u0005"+
		"6\u0000\u0000\u016e\u0184\u0006\t\uffff\uffff\u0000\u016f\u0170\u0005"+
		"7\u0000\u0000\u0170\u0184\u0006\t\uffff\uffff\u0000\u0171\u0172\u0005"+
		"8\u0000\u0000\u0172\u0184\u0006\t\uffff\uffff\u0000\u0173\u0174\u0005"+
		"9\u0000\u0000\u0174\u0184\u0006\t\uffff\uffff\u0000\u0175\u0176\u0005"+
		":\u0000\u0000\u0176\u0184\u0006\t\uffff\uffff\u0000\u0177\u0178\u0005"+
		";\u0000\u0000\u0178\u0184\u0006\t\uffff\uffff\u0000\u0179\u017a\u0005"+
		"<\u0000\u0000\u017a\u0184\u0006\t\uffff\uffff\u0000\u017b\u017c\u0005"+
		"=\u0000\u0000\u017c\u0184\u0006\t\uffff\uffff\u0000\u017d\u017e\u0005"+
		">\u0000\u0000\u017e\u0184\u0006\t\uffff\uffff\u0000\u017f\u0180\u0005"+
		"?\u0000\u0000\u0180\u0184\u0006\t\uffff\uffff\u0000\u0181\u0182\u0005"+
		"@\u0000\u0000\u0182\u0184\u0006\t\uffff\uffff\u0000\u0183\u016d\u0001"+
		"\u0000\u0000\u0000\u0183\u016f\u0001\u0000\u0000\u0000\u0183\u0171\u0001"+
		"\u0000\u0000\u0000\u0183\u0173\u0001\u0000\u0000\u0000\u0183\u0175\u0001"+
		"\u0000\u0000\u0000\u0183\u0177\u0001\u0000\u0000\u0000\u0183\u0179\u0001"+
		"\u0000\u0000\u0000\u0183\u017b\u0001\u0000\u0000\u0000\u0183\u017d\u0001"+
		"\u0000\u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u0183\u0181\u0001"+
		"\u0000\u0000\u0000\u0184\u0013\u0001\u0000\u0000\u0000\u0185\u0186\u0006"+
		"\n\uffff\uffff\u0000\u0186\u0187\u0003\u0016\u000b\u0000\u0187\u0188\u0006"+
		"\n\uffff\uffff\u0000\u0188\u018c\u0001\u0000\u0000\u0000\u0189\u018a\u0003"+
		"\u001a\r\u0000\u018a\u018b\u0006\n\uffff\uffff\u0000\u018b\u018d\u0001"+
		"\u0000\u0000\u0000\u018c\u0189\u0001\u0000\u0000\u0000\u018c\u018d\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005"+
		"4\u0000\u0000\u018f\u0015\u0001\u0000\u0000\u0000\u0190\u0194\u0006\u000b"+
		"\uffff\uffff\u0000\u0191\u0192\u0003\u0018\f\u0000\u0192\u0193\u0006\u000b"+
		"\uffff\uffff\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0191\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0017\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005\u0013\u0000\u0000\u0199\u01a0\u0006"+
		"\f\uffff\uffff\u0000\u019a\u019b\u0003\u001e\u000f\u0000\u019b\u019c\u0006"+
		"\f\uffff\uffff\u0000\u019c\u01a0\u0001\u0000\u0000\u0000\u019d\u019e\u0005"+
		"\u0004\u0000\u0000\u019e\u01a0\u0006\f\uffff\uffff\u0000\u019f\u0198\u0001"+
		"\u0000\u0000\u0000\u019f\u019a\u0001\u0000\u0000\u0000\u019f\u019d\u0001"+
		"\u0000\u0000\u0000\u01a0\u0019\u0001\u0000\u0000\u0000\u01a1\u01a2\u0006"+
		"\r\uffff\uffff\u0000\u01a2\u01a3\u0003\u001c\u000e\u0000\u01a3\u01a4\u0006"+
		"\r\uffff\uffff\u0000\u01a4\u01ab\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005"+
		"5\u0000\u0000\u01a6\u01a7\u0003\u001c\u000e\u0000\u01a7\u01a8\u0006\r"+
		"\uffff\uffff\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a5\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u001b\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u0006"+
		"\u000e\uffff\uffff\u0000\u01af\u01b0\u0003\"\u0011\u0000\u01b0\u01b1\u0006"+
		"\u000e\uffff\uffff\u0000\u01b1\u01b6\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u00056\u0000\u0000\u01b3\u01b4\u00034\u001a\u0000\u01b4\u01b5\u0006\u000e"+
		"\uffff\uffff\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u001d\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0005\u0015\u0000\u0000\u01b9\u01cf\u0006"+
		"\u000f\uffff\uffff\u0000\u01ba\u01bb\u0005\u0003\u0000\u0000\u01bb\u01cf"+
		"\u0006\u000f\uffff\uffff\u0000\u01bc\u01bd\u0005\u000f\u0000\u0000\u01bd"+
		"\u01cf\u0006\u000f\uffff\uffff\u0000\u01be\u01bf\u0005\f\u0000\u0000\u01bf"+
		"\u01cf\u0006\u000f\uffff\uffff\u0000\u01c0\u01c1\u0005\r\u0000\u0000\u01c1"+
		"\u01cf\u0006\u000f\uffff\uffff\u0000\u01c2\u01c3\u0005\t\u0000\u0000\u01c3"+
		"\u01cf\u0006\u000f\uffff\uffff\u0000\u01c4\u01c5\u0005\u0007\u0000\u0000"+
		"\u01c5\u01cf\u0006\u000f\uffff\uffff\u0000\u01c6\u01c7\u0005\u0010\u0000"+
		"\u0000\u01c7\u01cf\u0006\u000f\uffff\uffff\u0000\u01c8\u01c9\u0005\u0014"+
		"\u0000\u0000\u01c9\u01cf\u0006\u000f\uffff\uffff\u0000\u01ca\u01cb\u0005"+
		"\u0017\u0000\u0000\u01cb\u01cf\u0006\u000f\uffff\uffff\u0000\u01cc\u01cd"+
		"\u0005E\u0000\u0000\u01cd\u01cf\u0006\u000f\uffff\uffff\u0000\u01ce\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ce\u01ba\u0001\u0000\u0000\u0000\u01ce\u01bc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01be\u0001\u0000\u0000\u0000\u01ce\u01c0"+
		"\u0001\u0000\u0000\u0000\u01ce\u01c2\u0001\u0000\u0000\u0000\u01ce\u01c4"+
		"\u0001\u0000\u0000\u0000\u01ce\u01c6\u0001\u0000\u0000\u0000\u01ce\u01c8"+
		"\u0001\u0000\u0000\u0000\u01ce\u01ca\u0001\u0000\u0000\u0000\u01ce\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cf\u001f\u0001\u0000\u0000\u0000\u01d0\u01d6"+
		"\u0006\u0010\uffff\uffff\u0000\u01d1\u01d2\u0003\u001e\u000f\u0000\u01d2"+
		"\u01d3\u0006\u0010\uffff\uffff\u0000\u01d3\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0005\u0004\u0000\u0000\u01d5\u01d7\u0006\u0010\uffff\uffff"+
		"\u0000\u01d6\u01d1\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d7\u01db\u0001\u0000\u0000\u0000\u01d8\u01d9\u0003 \u0010\u0000"+
		"\u01d9\u01da\u0006\u0010\uffff\uffff\u0000\u01da\u01dc\u0001\u0000\u0000"+
		"\u0000\u01db\u01d8\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000"+
		"\u0000\u01dc!\u0001\u0000\u0000\u0000\u01dd\u01df\u0003&\u0013\u0000\u01de"+
		"\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003$\u0012\u0000\u01e1\u01e2"+
		"\u0006\u0011\uffff\uffff\u0000\u01e2#\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0006\u0012\uffff\uffff\u0000\u01e4\u01e5\u0006\u0012\uffff\uffff\u0000"+
		"\u01e5\u01e6\u0005E\u0000\u0000\u01e6\u01ef\u0006\u0012\uffff\uffff\u0000"+
		"\u01e7\u01e8\u0005\u0018\u0000\u0000\u01e8\u01e9\u0006\u0012\uffff\uffff"+
		"\u0000\u01e9\u01ea\u0003\"\u0011\u0000\u01ea\u01eb\u0006\u0012\uffff\uffff"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u0019\u0000"+
		"\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000\u01ee\u01e3\u0001\u0000\u0000"+
		"\u0000\u01ee\u01e7\u0001\u0000\u0000\u0000\u01ef\u020b\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\n\u0002\u0000\u0000\u01f1\u01f2\u0006\u0012\uffff\uffff"+
		"\u0000\u01f2\u01f3\u0006\u0012\uffff\uffff\u0000\u01f3\u01f7\u0005\u001a"+
		"\u0000\u0000\u01f4\u01f5\u0003\n\u0005\u0000\u01f5\u01f6\u0006\u0012\uffff"+
		"\uffff\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000"+
		"\u0000\u0000\u01f9\u020a\u0005\u001b\u0000\u0000\u01fa\u01fb\n\u0001\u0000"+
		"\u0000\u01fb\u01fc\u0006\u0012\uffff\uffff\u0000\u01fc\u01fd\u0006\u0012"+
		"\uffff\uffff\u0000\u01fd\u0206\u0005\u0018\u0000\u0000\u01fe\u01ff\u0003"+
		"(\u0014\u0000\u01ff\u0200\u0006\u0012\uffff\uffff\u0000\u0200\u0207\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0003,\u0016\u0000\u0202\u0203\u0006\u0012"+
		"\uffff\uffff\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u0201\u0001"+
		"\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0207\u0001"+
		"\u0000\u0000\u0000\u0206\u01fe\u0001\u0000\u0000\u0000\u0206\u0204\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020a\u0005"+
		"\u0019\u0000\u0000\u0209\u01f0\u0001\u0000\u0000\u0000\u0209\u01fa\u0001"+
		"\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c%\u0001\u0000"+
		"\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0214\u0005(\u0000"+
		"\u0000\u020f\u0211\u0005\u0004\u0000\u0000\u0210\u020f\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000"+
		"\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000"+
		"\u0000\u0214\u0210\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u020e\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\'\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0006\u0014\uffff\uffff\u0000\u021b\u021c\u0003*\u0015\u0000"+
		"\u021c\u0223\u0006\u0014\uffff\uffff\u0000\u021d\u021e\u00055\u0000\u0000"+
		"\u021e\u021f\u0003*\u0015\u0000\u021f\u0220\u0006\u0014\uffff\uffff\u0000"+
		"\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021d\u0001\u0000\u0000\u0000"+
		"\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0001\u0000\u0000\u0000\u0224)\u0001\u0000\u0000\u0000\u0225"+
		"\u0223\u0001\u0000\u0000\u0000\u0226\u0227\u0003\u0016\u000b\u0000\u0227"+
		"\u0230\u0006\u0015\uffff\uffff\u0000\u0228\u0229\u0003\"\u0011\u0000\u0229"+
		"\u022a\u0006\u0015\uffff\uffff\u0000\u022a\u0231\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u00030\u0018\u0000\u022c\u022d\u0006\u0015\uffff\uffff\u0000"+
		"\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022b\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0001\u0000\u0000\u0000"+
		"\u0230\u0228\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000"+
		"\u0231+\u0001\u0000\u0000\u0000\u0232\u0233\u0006\u0016\uffff\uffff\u0000"+
		"\u0233\u0234\u0005E\u0000\u0000\u0234\u023a\u0006\u0016\uffff\uffff\u0000"+
		"\u0235\u0236\u00055\u0000\u0000\u0236\u0237\u0005E\u0000\u0000\u0237\u0239"+
		"\u0006\u0016\uffff\uffff\u0000\u0238\u0235\u0001\u0000\u0000\u0000\u0239"+
		"\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0001\u0000\u0000\u0000\u023b-\u0001\u0000\u0000\u0000\u023c\u023a"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0003 \u0010\u0000\u023e\u0242\u0006"+
		"\u0017\uffff\uffff\u0000\u023f\u0240\u00030\u0018\u0000\u0240\u0241\u0006"+
		"\u0017\uffff\uffff\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u023f"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243/\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0006\u0018\uffff\uffff\u0000\u0245\u024d"+
		"\u0003&\u0013\u0000\u0246\u0248\u0003&\u0013\u0000\u0247\u0246\u0001\u0000"+
		"\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u00032\u0019\u0000\u024a\u024b\u0006\u0018\uffff"+
		"\uffff\u0000\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u0244\u0001\u0000"+
		"\u0000\u0000\u024c\u0247\u0001\u0000\u0000\u0000\u024d1\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0006\u0019\uffff\uffff\u0000\u024f\u0250\u0006\u0019"+
		"\uffff\uffff\u0000\u0250\u0254\u0005\u001a\u0000\u0000\u0251\u0252\u0003"+
		"\n\u0005\u0000\u0252\u0253\u0006\u0019\uffff\uffff\u0000\u0253\u0255\u0001"+
		"\u0000\u0000\u0000\u0254\u0251\u0001\u0000\u0000\u0000\u0254\u0255\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0264\u0005"+
		"\u001b\u0000\u0000\u0257\u0260\u0005\u0018\u0000\u0000\u0258\u0259\u0003"+
		"0\u0018\u0000\u0259\u025a\u0006\u0019\uffff\uffff\u0000\u025a\u0261\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0003(\u0014\u0000\u025c\u025d\u0006\u0019"+
		"\uffff\uffff\u0000\u025d\u025f\u0001\u0000\u0000\u0000\u025e\u025b\u0001"+
		"\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0261\u0001"+
		"\u0000\u0000\u0000\u0260\u0258\u0001\u0000\u0000\u0000\u0260\u025e\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0264\u0005"+
		"\u0019\u0000\u0000\u0263\u024e\u0001\u0000\u0000\u0000\u0263\u0257\u0001"+
		"\u0000\u0000\u0000\u0264\u0279\u0001\u0000\u0000\u0000\u0265\u0266\n\u0002"+
		"\u0000\u0000\u0266\u0267\u0006\u0019\uffff\uffff\u0000\u0267\u026b\u0005"+
		"\u001a\u0000\u0000\u0268\u0269\u0003\n\u0005\u0000\u0269\u026a\u0006\u0019"+
		"\uffff\uffff\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b\u0268\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0001"+
		"\u0000\u0000\u0000\u026d\u0278\u0005\u001b\u0000\u0000\u026e\u026f\n\u0001"+
		"\u0000\u0000\u026f\u0270\u0006\u0019\uffff\uffff\u0000\u0270\u0274\u0005"+
		"\u0018\u0000\u0000\u0271\u0272\u0003(\u0014\u0000\u0272\u0273\u0006\u0019"+
		"\uffff\uffff\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0271\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001"+
		"\u0000\u0000\u0000\u0276\u0278\u0005\u0019\u0000\u0000\u0277\u0265\u0001"+
		"\u0000\u0000\u0000\u0277\u026e\u0001\u0000\u0000\u0000\u0278\u027b\u0001"+
		"\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001"+
		"\u0000\u0000\u0000\u027a3\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000"+
		"\u0000\u0000\u027c\u027d\u0006\u001a\uffff\uffff\u0000\u027d\u027e\u0003"+
		"\n\u0005\u0000\u027e\u027f\u0006\u001a\uffff\uffff\u0000\u027f\u0289\u0001"+
		"\u0000\u0000\u0000\u0280\u0281\u0005\u001c\u0000\u0000\u0281\u0282\u0003"+
		"6\u001b\u0000\u0282\u0284\u0006\u001a\uffff\uffff\u0000\u0283\u0285\u0005"+
		"5\u0000\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0005\u001d"+
		"\u0000\u0000\u0287\u0289\u0001\u0000\u0000\u0000\u0288\u027c\u0001\u0000"+
		"\u0000\u0000\u0288\u0280\u0001\u0000\u0000\u0000\u02895\u0001\u0000\u0000"+
		"\u0000\u028a\u028e\u0006\u001b\uffff\uffff\u0000\u028b\u028c\u00038\u001c"+
		"\u0000\u028c\u028d\u0006\u001b\uffff\uffff\u0000\u028d\u028f\u0001\u0000"+
		"\u0000\u0000\u028e\u028b\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0291\u00034\u001a"+
		"\u0000\u0291\u029d\u0006\u001b\uffff\uffff\u0000\u0292\u0296\u00055\u0000"+
		"\u0000\u0293\u0294\u00038\u001c\u0000\u0294\u0295\u0006\u001b\uffff\uffff"+
		"\u0000\u0295\u0297\u0001\u0000\u0000\u0000\u0296\u0293\u0001\u0000\u0000"+
		"\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"+
		"\u0000\u0298\u0299\u00034\u001a\u0000\u0299\u029a\u0006\u001b\uffff\uffff"+
		"\u0000\u029a\u029c\u0001\u0000\u0000\u0000\u029b\u0292\u0001\u0000\u0000"+
		"\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e7\u0001\u0000\u0000\u0000"+
		"\u029f\u029d\u0001\u0000\u0000\u0000\u02a0\u02a4\u0006\u001c\uffff\uffff"+
		"\u0000\u02a1\u02a2\u0003:\u001d\u0000\u02a2\u02a3\u0006\u001c\uffff\uffff"+
		"\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a9\u00056\u0000\u0000\u02a99\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0006\u001d\uffff\uffff\u0000\u02ab\u02ac\u0005\u001a\u0000\u0000"+
		"\u02ac\u02ad\u0003\n\u0005\u0000\u02ad\u02ae\u0006\u001d\uffff\uffff\u0000"+
		"\u02ae\u02af\u0005\u001b\u0000\u0000\u02af\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0005D\u0000\u0000\u02b1\u02b2\u0005E\u0000\u0000\u02b2\u02b4"+
		"\u0006\u001d\uffff\uffff\u0000\u02b3\u02aa\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b4;\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0003>\u001f\u0000\u02b6\u02b7\u0006\u001e\uffff\uffff\u0000\u02b7\u02c5"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b9\u0003B!\u0000\u02b9\u02ba\u0006\u001e"+
		"\uffff\uffff\u0000\u02ba\u02c5\u0001\u0000\u0000\u0000\u02bb\u02bc\u0003"+
		"D\"\u0000\u02bc\u02bd\u0006\u001e\uffff\uffff\u0000\u02bd\u02c5\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0003F#\u0000\u02bf\u02c0\u0006\u001e\uffff"+
		"\uffff\u0000\u02c0\u02c5\u0001\u0000\u0000\u0000\u02c1\u02c2\u0003N\'"+
		"\u0000\u02c2\u02c3\u0006\u001e\uffff\uffff\u0000\u02c3\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c4\u02b5\u0001\u0000\u0000\u0000\u02c4\u02b8\u0001\u0000"+
		"\u0000\u0000\u02c4\u02bb\u0001\u0000\u0000\u0000\u02c4\u02be\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c1\u0001\u0000\u0000\u0000\u02c5=\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c7\u0006\u001f\uffff\uffff\u0000\u02c7\u02cf\u0005\u001c"+
		"\u0000\u0000\u02c8\u02c9\u0003@ \u0000\u02c9\u02ca\u0006\u001f\uffff\uffff"+
		"\u0000\u02ca\u02cc\u0001\u0000\u0000\u0000\u02cb\u02c8\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d0\u0001\u0000\u0000"+
		"\u0000\u02cf\u02cb\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005\u001d\u0000"+
		"\u0000\u02d2?\u0001\u0000\u0000\u0000\u02d3\u02d4\u0006 \uffff\uffff\u0000"+
		"\u02d4\u02d5\u0003<\u001e\u0000\u02d5\u02d6\u0006 \uffff\uffff\u0000\u02d6"+
		"\u02dc\u0001\u0000\u0000\u0000\u02d7\u02d8\u0006 \uffff\uffff\u0000\u02d8"+
		"\u02d9\u0003\u0014\n\u0000\u02d9\u02da\u0006 \uffff\uffff\u0000\u02da"+
		"\u02dc\u0001\u0000\u0000\u0000\u02db\u02d3\u0001\u0000\u0000\u0000\u02db"+
		"\u02d7\u0001\u0000\u0000\u0000\u02dcA\u0001\u0000\u0000\u0000\u02dd\u02e1"+
		"\u0006!\uffff\uffff\u0000\u02de\u02df\u0003\n\u0005\u0000\u02df\u02e0"+
		"\u0006!\uffff\uffff\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1\u02de"+
		"\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e4\u00054\u0000\u0000\u02e4C\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e6\u0005\u000b\u0000\u0000\u02e6\u02e7\u0005\u0018"+
		"\u0000\u0000\u02e7\u02e8\u0003\n\u0005\u0000\u02e8\u02e9\u0005\u0019\u0000"+
		"\u0000\u02e9\u02ea\u0003<\u001e\u0000\u02ea\u02f5\u0006\"\uffff\uffff"+
		"\u0000\u02eb\u02ec\u0005\b\u0000\u0000\u02ec\u02ed\u0005\u000b\u0000\u0000"+
		"\u02ed\u02ee\u0005\u0018\u0000\u0000\u02ee\u02ef\u0003\n\u0005\u0000\u02ef"+
		"\u02f0\u0005\u0019\u0000\u0000\u02f0\u02f1\u0003<\u001e\u0000\u02f1\u02f2"+
		"\u0006\"\uffff\uffff\u0000\u02f2\u02f4\u0001\u0000\u0000\u0000\u02f3\u02eb"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000\u0000\u0000\u02f5\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02fc"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f8\u02f9"+
		"\u0005\b\u0000\u0000\u02f9\u02fa\u0003<\u001e\u0000\u02fa\u02fb\u0006"+
		"\"\uffff\uffff\u0000\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc\u02f8\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fdE\u0001\u0000"+
		"\u0000\u0000\u02fe\u02ff\u0006#\uffff\uffff\u0000\u02ff\u0300\u0005\u0016"+
		"\u0000\u0000\u0300\u0301\u0005\u0018\u0000\u0000\u0301\u0302\u0003\n\u0005"+
		"\u0000\u0302\u0303\u0006#\uffff\uffff\u0000\u0303\u0304\u0005\u0019\u0000"+
		"\u0000\u0304\u0305\u0003<\u001e\u0000\u0305\u0306\u0006#\uffff\uffff\u0000"+
		"\u0306\u031c\u0001\u0000\u0000\u0000\u0307\u0308\u0006#\uffff\uffff\u0000"+
		"\u0308\u0309\u0005\u0006\u0000\u0000\u0309\u030a\u0003<\u001e\u0000\u030a"+
		"\u030b\u0006#\uffff\uffff\u0000\u030b\u030c\u0005\u0016\u0000\u0000\u030c"+
		"\u030d\u0005\u0018\u0000\u0000\u030d\u030e\u0003\n\u0005\u0000\u030e\u030f"+
		"\u0006#\uffff\uffff\u0000\u030f\u0310\u0005\u0019\u0000\u0000\u0310\u0311"+
		"\u00054\u0000\u0000\u0311\u031c\u0001\u0000\u0000\u0000\u0312\u0313\u0006"+
		"#\uffff\uffff\u0000\u0313\u0314\u0005\n\u0000\u0000\u0314\u0315\u0005"+
		"\u0018\u0000\u0000\u0315\u0316\u0003H$\u0000\u0316\u0317\u0006#\uffff"+
		"\uffff\u0000\u0317\u0318\u0005\u0019\u0000\u0000\u0318\u0319\u0003<\u001e"+
		"\u0000\u0319\u031a\u0006#\uffff\uffff\u0000\u031a\u031c\u0001\u0000\u0000"+
		"\u0000\u031b\u02fe\u0001\u0000\u0000\u0000\u031b\u0307\u0001\u0000\u0000"+
		"\u0000\u031b\u0312\u0001\u0000\u0000\u0000\u031cG\u0001\u0000\u0000\u0000"+
		"\u031d\u0326\u0006$\uffff\uffff\u0000\u031e\u031f\u0003J%\u0000\u031f"+
		"\u0320\u0006$\uffff\uffff\u0000\u0320\u0327\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0003\n\u0005\u0000\u0322\u0323\u0006$\uffff\uffff\u0000\u0323"+
		"\u0325\u0001\u0000\u0000\u0000\u0324\u0321\u0001\u0000\u0000\u0000\u0324"+
		"\u0325\u0001\u0000\u0000\u0000\u0325\u0327\u0001\u0000\u0000\u0000\u0326"+
		"\u031e\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327"+
		"\u0328\u0001\u0000\u0000\u0000\u0328\u032c\u00054\u0000\u0000\u0329\u032a"+
		"\u0003L&\u0000\u032a\u032b\u0006$\uffff\uffff\u0000\u032b\u032d\u0001"+
		"\u0000\u0000\u0000\u032c\u0329\u0001\u0000\u0000\u0000\u032c\u032d\u0001"+
		"\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0332\u0005"+
		"4\u0000\u0000\u032f\u0330\u0003L&\u0000\u0330\u0331\u0006$\uffff\uffff"+
		"\u0000\u0331\u0333\u0001\u0000\u0000\u0000\u0332\u032f\u0001\u0000\u0000"+
		"\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333I\u0001\u0000\u0000\u0000"+
		"\u0334\u0335\u0003\u0016\u000b\u0000\u0335\u0339\u0006%\uffff\uffff\u0000"+
		"\u0336\u0337\u0003\u001a\r\u0000\u0337\u0338\u0006%\uffff\uffff\u0000"+
		"\u0338\u033a\u0001\u0000\u0000\u0000\u0339\u0336\u0001\u0000\u0000\u0000"+
		"\u0339\u033a\u0001\u0000\u0000\u0000\u033aK\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u0003\n\u0005\u0000\u033c\u0343\u0006&\uffff\uffff\u0000\u033d"+
		"\u033e\u00055\u0000\u0000\u033e\u033f\u0003\n\u0005\u0000\u033f\u0340"+
		"\u0006&\uffff\uffff\u0000\u0340\u0342\u0001\u0000\u0000\u0000\u0341\u033d"+
		"\u0001\u0000\u0000\u0000\u0342\u0345\u0001\u0000\u0000\u0000\u0343\u0341"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344M\u0001"+
		"\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u0347\u0005"+
		"\u0005\u0000\u0000\u0347\u0352\u0006\'\uffff\uffff\u0000\u0348\u0349\u0005"+
		"\u0002\u0000\u0000\u0349\u0352\u0006\'\uffff\uffff\u0000\u034a\u034b\u0005"+
		"\u000e\u0000\u0000\u034b\u034f\u0006\'\uffff\uffff\u0000\u034c\u034d\u0003"+
		"\n\u0005\u0000\u034d\u034e\u0006\'\uffff\uffff\u0000\u034e\u0350\u0001"+
		"\u0000\u0000\u0000\u034f\u034c\u0001\u0000\u0000\u0000\u034f\u0350\u0001"+
		"\u0000\u0000\u0000\u0350\u0352\u0001\u0000\u0000\u0000\u0351\u0346\u0001"+
		"\u0000\u0000\u0000\u0351\u0348\u0001\u0000\u0000\u0000\u0351\u034a\u0001"+
		"\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0354\u0005"+
		"4\u0000\u0000\u0354O\u0001\u0000\u0000\u0000PT^gmu|~\u0087\u0092\u00a0"+
		"\u00ab\u00ad\u00b7\u00c6\u00d5\u00dd\u0129\u013b\u013d\u013f\u014b\u015a"+
		"\u016b\u0183\u018c\u0196\u019f\u01ab\u01b6\u01ce\u01d6\u01db\u01de\u01ee"+
		"\u01f7\u0204\u0206\u0209\u020b\u0212\u0214\u0218\u0223\u022e\u0230\u023a"+
		"\u0242\u0247\u024c\u0254\u025e\u0260\u0263\u026b\u0274\u0277\u0279\u0284"+
		"\u0288\u028e\u0296\u029d\u02a6\u02b3\u02c4\u02cd\u02cf\u02db\u02e1\u02f5"+
		"\u02fc\u031b\u0324\u0326\u032c\u0332\u0339\u0343\u034f\u0351";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}