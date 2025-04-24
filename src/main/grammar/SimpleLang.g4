grammar SimpleLang;

@header{
    import main.ast.nodes.*;
}

program returns [Program programRet]
    : {$programRet = new Program();}
     (t = translationUnit{ $programRet.setTranslationUnit($t.translationUnitRet);})? EOF ;

translationUnit returns [TranslationUnit translationUnitRet]
    : {$translationUnitRet = new TranslationUnit(); }
    (e = externalDeclaration {$translationUnitRet.addExternalDeclaration($e.externalDecRet);})+ ;

externalDeclaration returns [ExternalDeclaration externalDecRet]
    :
     f = functionDefinition {$externalDecRet = $f.funcDefRet;}
     | (d = declaration {$externalDecRet = $d.Dec;})
     | Semi ; // stray ;

functionDefinition returns [FunctionDefinition funcDefRet]
    : {$funcDefRet = new FunctionDefinition();}
     (d1 = declarationSpecifiers {$funcDefRet.setDeclarationSpecifiers($d1.decSpecsRet);})?
     (d = declarator {$funcDefRet.setDeclarator($d.dec); $funcDefRet.setLine($d.dec.getLine());})
     (d2 = declarationList {$funcDefRet.setDeclarationList($d2.decList);})?
     (c = compoundStatement {$funcDefRet.setBody($c.CStmt);})
     (s = Semi | 'end')*;

declarationList returns [DeclarationList decList]
    :{$decList = new DeclarationList();}
     (d = declaration {$decList.addDeclaration($d.Dec);})+ ;

expression returns [Expression expressionRet]
  : i = Identifier {$expressionRet = new Identifier($i.text);} {$expressionRet.setLine($i.line);}
  | c = Constant {$expressionRet = new Constant($c.text); $expressionRet.setLine($c.line);}
  | StringLiteral+
  | LeftParen e = expression {$expressionRet = $e.expressionRet;} RightParen
  | LeftParen t = typeName RightParen LeftBrace i1 = initializerList {$expressionRet = new A($t.typeNameRet, $i1.initialList);}Comma? RightBrace
  | e1 = expression LeftBracket e2 = expression {$expressionRet = new ArrayAccess($e1.expressionRet, $e2.expressionRet);} RightBracket                                // Array indexing
  | e = expression {FunctionCall functionCall = new FunctionCall($e.expressionRet);} LeftParen (a1 = argumentExpressionList {functionCall.setArgumentExpressionList($a1.argExprList);})? {$expressionRet = functionCall;}RightParen                       // Function call
  | e = expression o = PlusPlus {UnaryExpression expr = new UnaryExpression($e.expressionRet, UnaryOperator.POST_INC);
                             expr.setLine($o.line);
                             $expressionRet = expr;}                                                          // Postfix increment
  | e = expression o = MinusMinus {UnaryExpression expr = new UnaryExpression($e.expressionRet, UnaryOperator.POST_DEC);
                                    expr.setLine($o.line);
                                    $expressionRet = expr;}                                                        // Postfix decrement
  | {ListOfExpressions l = new ListOfExpressions();} (p = PlusPlus {l.addPrefixOperators($p.text);}
  | m = MinusMinus {l.addPrefixOperators($m.text);}
  | s = Sizeof {l.addPrefixOperators($s.text);})* (                                          // Prefix operators (zero or more)
         i = Identifier {l.setIdentifier($i.text); $expressionRet = l;}
       | c = Constant {l.setConstant($i.text); $expressionRet = l;}
       | StringLiteral+
       | LeftParen e = expression {l.setExpression($e.expressionRet); $expressionRet = l;} RightParen
       | LeftParen t = typeName {l.setTypeName($t.typeNameRet);} RightParen LeftBrace i2 = initializerList {l.setInitializerList($i2.initialList); $expressionRet = l;} Comma? RightBrace
       | u = unaryOperator {l.setUnaryOperator($u.unaryOp);} c1 = castExpression {l.setCastExpression($c1.castExprRet); $expressionRet = l;}
       | Sizeof LeftParen t = typeName {l.setTypeName($t.typeNameRet); $expressionRet = l;} RightParen
    )
  | LeftParen t = typeName RightParen c1 = castExpression {$expressionRet = new Casting($t.typeNameRet, $c1.castExprRet);}                                  // Cast expression
  | e1 = expression op1 = (Star | Div | Mod) e2 = expression {
        BinaryOperator op;
        if ($op1.text.equals("*")){op = BinaryOperator.MULT;}
        else if($op1.text.equals("/")){op = BinaryOperator.DIVIDE;}
        else{op = BinaryOperator.MOD;}
        BinaryExpression expr = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);
        expr.setLine($op1.line);
        $expressionRet = expr;
  }                                      // Multiplicative`
  | e1 = expression op1 = (Plus | Minus) e2 = expression {
        BinaryOperator op;
        if ($op1.text.equals("+")){op = BinaryOperator.PLUS;}
        else{op = BinaryOperator.MINUS;}
        BinaryExpression expr = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);
        expr.setLine($op1.line);
        $expressionRet = expr;
  }                                          // Additive
  | e1 = expression op1 = (LeftShift | RightShift) e2 = expression {
        BinaryOperator op;
        if ($op1.text.equals("<<")){op = BinaryOperator.LSHIFT;}
        else{op = BinaryOperator.RSHIFT;}
        $expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);
  }                                // Shift
  | e1 = expression op1 = (Less | Greater | LessEqual | GreaterEqual) e2 = expression {
        BinaryOperator op;
        if ($op1.text.equals("<")){op = BinaryOperator.LESS;}
        else if($op1.text.equals(">")) {op = BinaryOperator.GREATER;}
        else if($op1.text.equals(">=")) {op = BinaryOperator.GREATEREQUAL;}
        else{op = BinaryOperator.LESSEQUAL;}
        $expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);
  }             // Relational
  | e1 = expression op1 = (Equal | NotEqual) e2 = expression {
        BinaryOperator op;
        if ($op1.text.equals("==")){op = BinaryOperator.EQUAL;}
        else{op = BinaryOperator.NOTEQUAL;}
        $expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);

  }                                      // Equality
  | e1 = expression op1 = And e2 = expression {
        BinaryOperator op = BinaryOperator.AND;
        $expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);
  }                                                     // Bitwise AND
  | e1 = expression op1 = Xor e2 = expression {
        BinaryOperator op = BinaryOperator.XOR;
        $expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);
  }                                                     // Bitwise XOR
  | e1 = expression op1 = Or e2 = expression {
        BinaryOperator op = BinaryOperator.OR;
        $expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);

  }                                                      // Bitwise OR
  | e1 = expression op1 = AndAnd e2 = expression {
        BinaryOperator op = BinaryOperator.ANDAND;
        $expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);

  }                                                  // Logical AND
  | e1 = expression op1 = OrOr e2 = expression {
        BinaryOperator op = BinaryOperator.OROR;
        $expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, op);

  }                                                    // Logical OR
  | e1 = expression Question e2 = expression Colon e3 = expression {
        $expressionRet = new TernaryExpression($e1.expressionRet, $e2.expressionRet, $e3.expressionRet);
  }                               // Conditional operator
  | e1 = expression a = assignmentOperator e2 = expression {
        if($a.assignOperator == Assignment.PLUS){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.PLUS, $e1.text);}
        else if($a.assignOperator == Assignment.MINUS){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.MINUS, $e1.text);}
        else if($a.assignOperator == Assignment.MULT){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.MULT, $e1.text);}
        else if($a.assignOperator == Assignment.DIVIDE){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.DIVIDE, $e1.text);}
        else if($a.assignOperator == Assignment.MOD){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.MOD, $e1.text);}
        else if($a.assignOperator == Assignment.LSHIFT){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.LSHIFT, $e1.text);}
        else if($a.assignOperator == Assignment.RSHIFT){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.RSHIFT, $e1.text);}
        else if($a.assignOperator == Assignment.XOR){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.XOR, $e1.text);}
        else if($a.assignOperator == Assignment.AND){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.AND, $e1.text);}
        else if($a.assignOperator == Assignment.ASSIGN){$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.ASSIGN);}
        else{$expressionRet = new BinaryExpression($e1.expressionRet, $e2.expressionRet, BinaryOperator.OR, $e1.text);}
  }                                     // Assignment
  | e1 = expression {ArgumentExpressionList e = new ArgumentExpressionList(); e.addExpression($e1.expressionRet);}
  (Comma e2 = expression {e.addExpression($e2.expressionRet); $expressionRet = e;})+ ;                                              // Comma operator

argumentExpressionList returns [ArgumentExpressionList argExprList]
  : {$argExprList = new ArgumentExpressionList();}
   e1 = expression {$argExprList.addExpression($e1.expressionRet);} (Comma e2 = expression {$argExprList.addExpression($e2.expressionRet);})* ;

unaryOperator returns [UnaryOperator unaryOp]
  : And {$unaryOp = UnaryOperator.AND;}
  | Star {$unaryOp = UnaryOperator.STAR;}
  | Plus {$unaryOp = UnaryOperator.PLUS;}
  | Minus {$unaryOp = UnaryOperator.MINUS;}
  | Tilde {$unaryOp = UnaryOperator.TILDE;}
  | Not {$unaryOp = UnaryOperator.NOT;};

castExpression returns [CastExpression castExprRet]
  : {$castExprRet = new CastExpression();}
   LeftParen t = typeName {$castExprRet.setTypeName($t.typeNameRet);} RightParen c = castExpression {$castExprRet.setCastExpression($c.castExprRet);}
   | {$castExprRet = new CastExpression();} e = expression {$castExprRet.setExpression($e.expressionRet);}
   | {$castExprRet = new CastExpression();} d = DigitSequence {$castExprRet.setDigits($d.text);} ;

assignmentOperator returns [Assignment assignOperator]
  :
   Assign {$assignOperator = Assignment.ASSIGN;}
   | StarAssign {$assignOperator = Assignment.MULT;}
   | DivAssign {$assignOperator = Assignment.DIVIDE;}
   | ModAssign {$assignOperator = Assignment.MOD;}
   | PlusAssign {$assignOperator = Assignment.PLUS;}
   | MinusAssign {$assignOperator = Assignment.MINUS;}
   | LeftShiftAssign {$assignOperator = Assignment.LSHIFT;}
   | RightShiftAssign {$assignOperator = Assignment.RSHIFT;}
   | AndAssign {$assignOperator = Assignment.AND;}
   | XorAssign {$assignOperator = Assignment.XOR;}
   | OrAssign {$assignOperator = Assignment.OR;}
   ;

declaration returns [Declaration Dec]
    : {$Dec = new Declaration();}
     (d = declarationSpecifiers {$Dec.setDecSpecs($d.decSpecsRet);})
     (i = initDeclaratorList {$Dec.setInitDeclaratorList($i.initDecList);})? Semi ;

declarationSpecifiers returns [DeclarationSpecifiers decSpecsRet]
    : {$decSpecsRet = new DeclarationSpecifiers();}
    (d = declarationSpecifier {$decSpecsRet.addDecSpecifier($d.decSpecRet);})+ ;

declarationSpecifier returns [DeclarationSpecifier decSpecRet]
    : t = Typedef {$decSpecRet = new TypeSpecifier($t.text);} | t2 = typeSpecifier {$decSpecRet = $t2.typeSpecRet;} | c = Const {$decSpecRet = new TypeSpecifier($c.text);} ;

initDeclaratorList returns [InitDeclaratorList initDecList]
    :{$initDecList = new InitDeclaratorList();}
     (i = initDeclarator {$initDecList.addInitDeclarators($i.initDec);})
     (Comma (i_ = initDeclarator {$initDecList.addInitDeclarators($i_.initDec);}))* ;

initDeclarator returns [InitDeclarator initDec]
    : {$initDec = new InitDeclarator();}
    (d = declarator {$initDec.setDeclarator($d.dec);})
    (Assign i = initializer {$initDec.setInitializer($i.initial);})? ;

typeSpecifier returns [TypeSpecifier typeSpecRet]
    : v = Void {$typeSpecRet = new TypeSpecifier($v.text);}
    | c = Char {$typeSpecRet = new TypeSpecifier($c.text);}
    | s = Short {$typeSpecRet = new TypeSpecifier($s.text);}
    | i = Int {$typeSpecRet = new TypeSpecifier($i.text);}
    | l = Long {$typeSpecRet = new TypeSpecifier($l.text);}
    | f = Float {$typeSpecRet = new TypeSpecifier($f.text);}
    | d = Double {$typeSpecRet = new TypeSpecifier($d.text);}
    | s = Signed {$typeSpecRet = new TypeSpecifier($s.text);}
    | u = Unsigned {$typeSpecRet = new TypeSpecifier($u.text);}
    | b = Bool {$typeSpecRet = new TypeSpecifier($b.text);}
    | id = Identifier {Identifier identifier = new Identifier($id.text); $typeSpecRet = new TypeSpecifier(identifier);}  ;

specifierQualifierList returns [SpecifierQualifierList specQualList]
    : {$specQualList = new SpecifierQualifierList();}
     (t = typeSpecifier {$specQualList.setTypeSpecifier($t.typeSpecRet);}| c = Const {TypeSpecifier t = new TypeSpecifier($c.text); $specQualList.setTypeSpecifier(t);})
     (s = specifierQualifierList {$specQualList.setSpecifierQualifierList($s.specQualList);})? ;

declarator returns [Declarator dec]
    : pointer? (d = directDeclarator {$dec = new Declarator(); $dec.setDirectDeclarator($d.directDec); $dec.setLine($d.directDec.getLine());}) ;

directDeclarator returns [DirectDeclarator directDec]
    : {$directDec = new DirectDeclarator();}(i = Identifier {$directDec.setIdentifier($i.text); $directDec.setLine($i.line);})
    | LeftParen {$directDec = new DirectDeclarator();} (d = declarator {$directDec.setDeclarator($d.dec); $directDec.setLine($d.dec.getLine());}) RightParen
    | d_ = directDeclarator {$directDec = new DirectDeclarator();} {$directDec.setDirectDeclarator($d_.directDec); $directDec.setLine($d_.directDec.getLine());} LeftBracket (e = expression {$directDec.setExpression($e.expressionRet);})? RightBracket
    | d__ = directDeclarator {$directDec = new DirectDeclarator();} {$directDec.setDirectDeclarator($d__.directDec); $directDec.setLine($d__.directDec.getLine());} LeftParen  (p = parameterList {$directDec.setParameterList($p.paramList);}| (i1 = identifierList {$directDec.setIdentifierList($i1.idList);})?) RightParen ;

pointer
    : ((Star) (Const+)?)+ ;

parameterList returns [ParameterList paramList]
    : {$paramList = new ParameterList();} p1 = parameterDeclaration {$paramList.addParameterDeclaration($p1.paramDec);}
     (Comma p2 = parameterDeclaration {$paramList.addParameterDeclaration($p2.paramDec);})* ;

parameterDeclaration returns [ParameterDeclaration paramDec]
    :d1 = declarationSpecifiers {$paramDec = new ParameterDeclaration($d1.decSpecsRet);}
     (d2 = declarator {$paramDec.setDeclarator($d2.dec);} | (a = abstractDeclarator {$paramDec.setAbstractDeclarator($a.abstDec);})?) ;

identifierList returns [IdentifierList idList]
    : {$idList = new IdentifierList();}
     i = Identifier {$idList.addIdentifier($i.text);} (Comma i1 = Identifier {$idList.addIdentifier($i1.text);})* ;

typeName returns [TypeName typeNameRet]
    : s = specifierQualifierList {$typeNameRet = new TypeName($s.specQualList);} (a = abstractDeclarator {$typeNameRet.setAbstractDeclarator($a.abstDec);})? ;

abstractDeclarator returns [AbstractDeclarator abstDec]
    : {$abstDec = new AbstractDeclarator();}
     pointer | pointer? d = directAbstractDeclarator {$abstDec.setDirectAbstractDeclarator($d.directAbstDec);};

directAbstractDeclarator returns [DirectAbstractDeclarator directAbstDec]
    :{$directAbstDec = new DirectAbstractDeclarator();}
     LeftBracket (e = expression {$directAbstDec.setExpression($e.expressionRet);})? RightBracket
    | LeftParen  (a = abstractDeclarator {$directAbstDec.setAbstractDeclarator($a.abstDec);} | (p = parameterList {$directAbstDec.setParameterList($p.paramList);})?) RightParen
    | d = directAbstractDeclarator {$directAbstDec.setDirectAbstractDeclarator($d.directAbstDec);} LeftBracket (e = expression {$directAbstDec.setExpression($e.expressionRet);})? RightBracket
    | d = directAbstractDeclarator {$directAbstDec.setDirectAbstractDeclarator($d.directAbstDec);} LeftParen (p = parameterList {$directAbstDec.setParameterList($p.paramList);})? RightParen ;

initializer returns [Initializer initial]
    : {$initial = new Initializer();}
     e = expression {$initial.setExpression($e.expressionRet);}
     | LeftBrace i = initializerList {$initial.setInitializerList($i.initialList);} Comma? RightBrace ;

initializerList returns [InitializerList initialList]
    : {$initialList = new InitializerList();}
     (d = designation {$initialList.addDesignation($d.designation_);})?
      i = initializer {$initialList.addInitializer($i.initial);}
      (Comma (d1 = designation {$initialList.addDesignation($d1.designation_);})?
      i1 = initializer {$initialList.addInitializer($i1.initial);})* ;

designation returns [Designation designation_]
    : {$designation_ = new Designation();}
     (d = designator {$designation_.addDesignator($d.designator_);})+ Assign ;

designator returns [Designator designator_]
    : {$designator_ = new Designator();}
     LeftBracket e = expression {$designator_.setExpression($e.expressionRet);} RightBracket | Dot i = Identifier {$designator_.setIdentifier($i.text);} ;

statement returns [Stmt stmtRet]
    : (c = compoundStatement {$stmtRet = $c.CStmt;})
    | (e = expressionStatement {$stmtRet = $e.exprStmtRet;})
    | s = selectionStatement {$stmtRet = $s.selectionStmtRet;}
    | i = iterationStatement {$stmtRet = $i.iterStmtRet;}
    | j = jumpStatement {$stmtRet = $j.jumpStmtRet;} ;

compoundStatement returns [CompoundStmt CStmt]
    : {$CStmt = new CompoundStmt();}
     LeftBrace ((b = blockItem {$CStmt.addItem($b.bItem);})+)? RightBrace ;

blockItem returns [BlockItem bItem]
    : {$bItem = new BlockItem();} (s = statement {$bItem.setStatement($s.stmtRet);})
    | {$bItem = new BlockItem();} (d = declaration {$bItem.setDec($d.Dec);}) ;

expressionStatement returns [ExpressionStmt exprStmtRet]
    : {$exprStmtRet = new ExpressionStmt();}
     (e = expression {$exprStmtRet.setExpression($e.expressionRet);})? Semi ;

selectionStatement returns [SelectionStmt selectionStmtRet]
    : i = If LeftParen e = expression RightParen s = statement {$selectionStmtRet = new SelectionStmt($e.expressionRet, $s.stmtRet); $selectionStmtRet.setIfLine($i.line);}
     (el = Else If LeftParen e = expression RightParen s = statement {$selectionStmtRet.addElseIf($s.stmtRet, $e.expressionRet); $selectionStmtRet.setElseIfLine($el.line);})*
     (els = Else s1 = statement {$selectionStmtRet.setElseStmt($s1.stmtRet); $selectionStmtRet.setElseLine($els.line);})? ;

iterationStatement returns [IterationStmt iterStmtRet]
    : {$iterStmtRet = new IterationStmt();}
     w = While LeftParen e = expression {$iterStmtRet.setExpression($e.expressionRet); $iterStmtRet.setLine($w.line);} RightParen s = statement {$iterStmtRet.setStmt($s.stmtRet);}
    |{$iterStmtRet = new IterationStmt();}
     d = Do s = statement {$iterStmtRet.setStmt($s.stmtRet); $iterStmtRet.setLine($d.line);} While LeftParen e = expression {$iterStmtRet.setExpression($e.expressionRet);} RightParen Semi
    |{$iterStmtRet = new IterationStmt();}
     fo = For LeftParen f = forCondition {$iterStmtRet.setForCondition($f.forConditionRet); $iterStmtRet.setLine($fo.line);} RightParen s = statement {$iterStmtRet.setStmt($s.stmtRet);} ;

forCondition returns [ForCondition forConditionRet]
    : {$forConditionRet = new ForCondition();}
     (f = forDeclaration {$forConditionRet.setForDeclaration($f.forDecRet);} | (e = expression {$forConditionRet.setExpression($e.expressionRet);})?) Semi
     (f1 = forExpression {$forConditionRet.setForExpression1($f1.forExprRet);})? Semi (f2 = forExpression {$forConditionRet.setForExpression2($f2.forExprRet);})? ;

forDeclaration returns [ForDeclaration forDecRet]
    : d = declarationSpecifiers {$forDecRet = new ForDeclaration($d.decSpecsRet);} (i = initDeclaratorList {$forDecRet.setInitDeclaratorList($i.initDecList);})? ;

forExpression returns [ForExpression forExprRet]
    : e1 = expression {$forExprRet = new ForExpression($e1.expressionRet);} (Comma e2 = expression {$forExprRet.addExpression($e2.expressionRet);})* ;

jumpStatement returns [JumpStmt jumpStmtRet]
    : ( t = Continue {$jumpStmtRet = new JumpStmt($t.text); $jumpStmtRet.setLine($t.line);}
    | t = Break {$jumpStmtRet = new JumpStmt($t.text); $jumpStmtRet.setLine($t.line);}
    | t = Return {$jumpStmtRet = new JumpStmt($t.text); $jumpStmtRet.setLine($t.line);} (e = expression {$jumpStmtRet.setExpression($e.expressionRet);})? ) Semi ;

Break                 : 'break'                 ;
Char                  : 'char'                  ;
Const                 : 'const'                 ;
Continue              : 'continue'              ;
Do                    : 'do'                    ;
Double                : 'double'                ;
Else                  : 'else'                  ;
Float                 : 'float'                 ;
For                   : 'for'                   ;
If                    : 'if'                    ;
Int                   : 'int'                   ;
Long                  : 'long'                  ;
Return                : 'return'                ;
Short                 : 'short'                 ;
Signed                : 'signed'                ;
Sizeof                : 'sizeof'                ;
Switch                : 'switch'                ;
Typedef               : 'typedef'               ;
Unsigned              : 'unsigned'              ;
Void                  : 'void'                  ;
While                 : 'while'                 ;
Bool                  : 'bool'                  ;
LeftParen             : '('                     ;
RightParen            : ')'                     ;
LeftBracket           : '['                     ;
RightBracket          : ']'                     ;
LeftBrace             : '{'                     ;
RightBrace            : '}'                     ;
Less                  : '<'                     ;
LessEqual             : '<='                    ;
Greater               : '>'                     ;
GreaterEqual          : '>='                    ;
LeftShift             : '<<'                    ;
RightShift            : '>>'                    ;
Plus                  : '+'                     ;
PlusPlus              : '++'                    ;
Minus                 : '-'                     ;
MinusMinus            : '--'                    ;
Star                  : '*'                     ;
Div                   : '/'                     ;
Mod                   : '%'                     ;
And                   : '&'                     ;
Or                    : '|'                     ;
AndAnd                : '&&'                    ;
OrOr                  : '||'                    ;
Xor                   : '^'                     ;
Not                   : '!'                     ;
Tilde                 : '~'                     ;
Question              : '?'                     ;
Colon                 : ':'                     ;
Semi                  : ';'                     ;
Comma                 : ','                     ;
Assign                : '='                     ;
StarAssign            : '*='                    ;
DivAssign             : '/='                    ;
ModAssign             : '%='                    ;
PlusAssign            : '+='                    ;
MinusAssign           : '-='                    ;
LeftShiftAssign       : '<<='                   ;
RightShiftAssign      : '>>='                   ;
AndAssign             : '&='                    ;
XorAssign             : '^='                    ;
OrAssign              : '|='                    ;
Equal                 : '=='                    ;
NotEqual              : '!='                    ;
Arrow                 : '->'                    ;
Dot                   : '.'                     ;

Identifier
    : IdentifierNondigit (IdentifierNondigit | Digit)* ;

fragment IdentifierNondigit
    : Nondigit | UniversalCharacterName ;

fragment Nondigit
    : [a-zA-Z_] ;

fragment Digit
    : [0-9] ;

fragment UniversalCharacterName
    : '\\u' HexQuad | '\\U' HexQuad HexQuad ;

fragment HexQuad
    : HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit ;

Constant
    : IntegerConstant | FloatingConstant | CharacterConstant ;

fragment IntegerConstant
    : DecimalConstant IntegerSuffix?
    | OctalConstant IntegerSuffix?
    | HexadecimalConstant IntegerSuffix?
    | BinaryConstant ;

fragment BinaryConstant
    : '0' [bB] [0-1]+ ;

fragment DecimalConstant
    : NonzeroDigit Digit* ;

fragment OctalConstant
    : '0' OctalDigit* ;

fragment HexadecimalConstant
    : HexadecimalPrefix HexadecimalDigit+ ;

fragment HexadecimalPrefix
    : '0' [xX] ;

fragment NonzeroDigit
    : [1-9] ;

fragment OctalDigit
    : [0-7] ;

fragment HexadecimalDigit
    : [0-9a-fA-F] ;

fragment IntegerSuffix
    : UnsignedSuffix LongSuffix? | UnsignedSuffix LongLongSuffix | LongSuffix UnsignedSuffix? | LongLongSuffix UnsignedSuffix? ;

fragment UnsignedSuffix
    : [uU] ;

fragment LongSuffix
    : [lL] ;

fragment LongLongSuffix
    : 'll' | 'LL' ;

fragment FloatingConstant
    : DecimalFloatingConstant | HexadecimalFloatingConstant ;

fragment DecimalFloatingConstant
    : FractionalConstant ExponentPart? FloatingSuffix? | DigitSequence ExponentPart FloatingSuffix? ;

fragment HexadecimalFloatingConstant
    : HexadecimalPrefix (HexadecimalFractionalConstant | HexadecimalDigitSequence) BinaryExponentPart FloatingSuffix? ;

fragment FractionalConstant
    : DigitSequence? Dot DigitSequence | DigitSequence Dot ;

fragment ExponentPart
    : [eE] Sign? DigitSequence ;

fragment Sign
    : [+-] ;

DigitSequence
    : Digit+ ;

fragment HexadecimalFractionalConstant
    : HexadecimalDigitSequence? Dot HexadecimalDigitSequence | HexadecimalDigitSequence Dot ;

fragment BinaryExponentPart
    : [pP] Sign? DigitSequence ;

fragment HexadecimalDigitSequence
    : HexadecimalDigit+ ;

fragment FloatingSuffix
    : [flFL] ;

fragment CharacterConstant
    : '\'' CCharSequence '\'' | 'L\'' CCharSequence '\''| 'u\'' CCharSequence '\'' | 'U\'' CCharSequence '\''
    ;

fragment CCharSequence
    : CChar+ ;

fragment CChar
    : ~['\\\r\n] | EscapeSequence ;

fragment EscapeSequence
    : SimpleEscapeSequence | OctalEscapeSequence | HexadecimalEscapeSequence | UniversalCharacterName ;

fragment SimpleEscapeSequence
    : '\\' ['"?abfnrtv\\] ;

fragment OctalEscapeSequence
    : '\\' OctalDigit OctalDigit? OctalDigit? ;

fragment HexadecimalEscapeSequence
    : '\\x' HexadecimalDigit+ ;

StringLiteral
    : EncodingPrefix? '"' SCharSequence? '"' ;

fragment EncodingPrefix
    : 'u8' | 'u' | 'U' | 'L' ;

fragment SCharSequence
    : SChar+ ;

fragment SChar
    : ~["\\\r\n] | EscapeSequence | '\\\n' | '\\\r\n' ;

MultiLineMacro
    : '#' (~[\n]*? '\\' '\r'? '\n')+ ~ [\n]+ -> channel(HIDDEN) ;

Directive
    : '#' ~[\n]* -> channel(HIDDEN) ;

Whitespace
    : [ \t]+ -> channel(HIDDEN) ;

Newline
    : ('\r' '\n'? | '\n') -> channel(HIDDEN) ;

BlockComment
    : '/*' .*? '*/' -> channel(HIDDEN) ;

LineComment
    : '//' ~[\r\n]* -> channel(HIDDEN) ;