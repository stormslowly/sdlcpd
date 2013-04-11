lexer grammar TNSDL;
options {
  filter=false;

}
@members {
	private static Hashtable literals = new Hashtable();
	static{
		literals.put("abstract", new Integer(ABSTRACT));
		literals.put("accepts", new Integer( ACCEPTS ));
		literals.put("adding", new Integer(ADDING));
		literals.put("alarm", new Integer(ALARM));
		literals.put("all", new Integer(ALL));
		literals.put("alternative", new Integer(ALTERNATIVE));
		literals.put("and", new Integer(AND));
		literals.put("array", new Integer(ARRAY));
		literals.put("async", new Integer(ASYNC));
		literals.put("axioms", new Integer(AXIOMS));
		literals.put("bits", new Integer(BITS));
		literals.put("bitstruct", new Integer(BITSTRUCT));
		literals.put("call", new Integer(CALL));
		literals.put("commands", new Integer(COMMANDS));
		literals.put("comment", new Integer(COMMENT));
		literals.put("constant", new Integer(CONSTANT));
		literals.put("create", new Integer(CREATE));
		literals.put("database", new Integer(DATABASE));
		literals.put("dcl", new Integer(DCL));
		literals.put("decision", new Integer(DECISION));
		literals.put("distributed", new Integer(DISTRIBUTED));
		literals.put("else", new Integer(ELSE));
		literals.put("endalternative", new Integer(ENDALTERNATIVE));
		literals.put("endbitstruct", new Integer(ENDBITSTRUCT));
		literals.put("enddecision", new Integer(ENDDECISION));
		literals.put("endenum", new Integer(ENDENUM));
		literals.put("endgenerator", new Integer(ENDGENERATOR));
		literals.put("endimplementation", new Integer(ENDIMPLEMENTATION));
		literals.put("endlibrary", new Integer(ENDLIBRARY));
		literals.put("endmacro", new Integer(ENDMACRO));
		literals.put("endmodule", new Integer(ENDMODULE));
		literals.put("endprocedure", new Integer(ENDPROCEDURE));
		literals.put("endprocess", new Integer(ENDPROCESS));
		literals.put("endprogramblock", new Integer(ENDPROGRAMBLOCK));
		literals.put("endselect", new Integer(ENDSELECT));
		literals.put("endserviceblock", new Integer(ENDSERVICEBLOCK));
		literals.put("endstate", new Integer(ENDSTATE));
		literals.put("endstruct", new Integer(ENDSTRUCT));
		literals.put("endsubautomaton", new Integer(ENDSUBAUTOMATON));
		literals.put("endsystem", new Integer(ENDSYSTEM));
		literals.put("endsystemblock", new Integer(ENDSYSTEMBLOCK));
		literals.put("endtype", new Integer(ENDTYPE));
		literals.put("endunion", new Integer(ENDUNION));
		literals.put("endwhile", new Integer(ENDWHILE));
		literals.put("enum", new Integer(ENUM));
		literals.put("exit", new Integer(EXIT));
		literals.put("external", new Integer(EXTERNAL));
		literals.put("far", new Integer(FAR));
		literals.put("fpar", new Integer(FPAR));
		literals.put("generator", new Integer(GENERATOR));
		literals.put("has", new Integer(HAS));
		literals.put("if", new Integer(IF));
		literals.put("inherits", new Integer(INHERITS));
		literals.put("internal", new Integer(INTERNAL));
		literals.put("implementation", new Integer(IMPLEMENTATION));
		literals.put("in", new Integer(IN));
		literals.put("indicates", new Integer(INDICATES));
		literals.put("input", new Integer(INPUT));
		literals.put("join", new Integer(JOIN));
		literals.put("library", new Integer(LIBRARY));
		literals.put("literals", new Integer(LITERALS));
		literals.put("macro", new Integer(MACRO));
		literals.put("macrodefinition", new Integer(MACRODEFINITION));
		literals.put("macroid", new Integer(MACROID));
		literals.put("master", new Integer(MASTER));
		literals.put("mod", new Integer(MOD));
		literals.put("module", new Integer(MODULE));
		literals.put("near", new Integer(NEAR));
		literals.put("nextstate", new Integer(NEXTSTATE));
		literals.put("not", new Integer(NOT));
		literals.put("of", new Integer(OF));
		literals.put("operators", new Integer(OPERATORS));
		literals.put("or", new Integer(OR));
		literals.put("out", new Integer(OUT));
		literals.put("output", new Integer(OUTPUT));
		literals.put("packed", new Integer(PACKED));
		literals.put("pointer", new Integer(POINTER));
		literals.put("procedure", new Integer(PROCEDURE));
		literals.put("process", new Integer(PROCESS));
		literals.put("programblock", new Integer(PROGRAMBLOCK));
		literals.put("provided", new Integer(PROVIDED));
		literals.put("provides", new Integer(PROVIDES));
		literals.put("representation", new Integer(REPRESENTATION));
		literals.put("reset", new Integer(RESET));
		literals.put("return", new Integer(RETURN));
		literals.put("returns", new Integer(RETURNS));
		literals.put("revealed", new Integer(REVEALED));
		literals.put("save", new Integer(SAVE));
		literals.put("select", new Integer(SELECT));
		literals.put("serviceblock", new Integer(SERVICEBLOCK));
		literals.put("services", new Integer(SERVICES));
		literals.put("set", new Integer(SET));
		literals.put("signal", new Integer(SIGNAL));
		literals.put("signalset", new Integer(SIGNALSET));
		literals.put("sizeof", new Integer(SIZEOF));
		literals.put("skip", new Integer(SKIP));
		literals.put("start", new Integer(START));
		literals.put("state", new Integer(STATE));
		literals.put("stop", new Integer(STOP));
		literals.put("struct", new Integer(STRUCT));
		literals.put("subautomaton", new Integer(SUBAUTOMATON));
		literals.put("sync", new Integer(SYNC));
		literals.put("synonym", new Integer(SYNONYM));
		literals.put("system", new Integer(SYSTEM));
		literals.put("systemblock", new Integer(SYSTEMBLOCK));
		literals.put("task", new Integer(TASK));
		literals.put("timer", new Integer(TIMER));
		literals.put("to", new Integer(TO));
		literals.put("type", new Integer(TYPE));
		literals.put("union", new Integer(UNION));
		literals.put("uses", new Integer(USES));
		literals.put("viewed", new Integer(VIEWED));
		literals.put("where", new Integer(WHERE));
		literals.put("while", new Integer(WHILE));
		literals.put("withwarming", new Integer(WITHWARMING));
		literals.put("xor", new Integer(XOR));
	}
	
    private int checkKeywordsTable(String NameText)
    {	
        Integer tokenType = (Integer) literals.get(NameText.toLowerCase());
    	if(tokenType != null){
    		return tokenType.intValue();
    	}
        return Name;
    }
}
@header {
import java.util.Hashtable;
}

// $ANTLR src "TNSDL.g" 690
Name :
  
  Letter (Letter | Digit)* { $type = checkKeywordsTable(getText()); }
  
;
 

// $ANTLR src "TNSDL.g" 697
PreprocDirective :
        '#' (~'\n')* 
        {$channel=HIDDEN;}
;

// $ANTLR src "TNSDL.g" 702
NumericLiteral:

   ( ( Digit )+ ( '.' ) )=> ( Digit )+ '.' ( Digit )* ( Exponent )? { $type = RealConstant; }
   |(Digit)+  { $type = IntegerConstant; }
   |'0' ('X'|'x') (HexDigit)+ { $type = IntegerConstant; }
   | '0' ('B'|'b') (Bit)+ { $type = IntegerConstant; }
   
;

// $ANTLR src "TNSDL.g" 711
StringConstant :
ShorterStringConstant 
| LongerStringConstant;

 
// $ANTLR src "TNSDL.g" 716
fragment Letter:

  'A'..'Z'|'a'..'z'|'_'

;

// $ANTLR src "TNSDL.g" 722
fragment Exponent :  
   ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
;

// $ANTLR src "TNSDL.g" 726
fragment Bit:
 '0'|'1'
;



// $ANTLR src "TNSDL.g" 732
fragment ShorterStringConstant : // YFR_0902_TNSDL_GRAMMAR.pdf 5.5.1

  '\''!
  (   ~('\'' | '\r' | '\n')
    | Escape
    | ( '\'' '\'' ) =>
      '\'' '\''! 
    | ('\'' '\\' ('\r')? '\n' (' '|'\t')* '\'') =>
      '\''! '\\'! ('\r'!)? '\n'! (' '!|'\t'!)* '\''! 
    | ('\'' (' '|'\t')* ('\r')? '\n' (' '|'\t')* '\'') =>
      '\''! (' '!|'\t'!)* ('\r'!)? '\n' (' '!|'\t'!)* '\''!)*
  '\''!
;

// $ANTLR src "TNSDL.g" 746
fragment Escape : 
    '\''
    ('a' | 'b' | 'e' | 'f' | 'n' | 'r' | 't' | 'v' | 'x' HexDigit HexDigit )

;

// $ANTLR src "TNSDL.g" 752
fragment Digit:

  '0'..'9'

;

// $ANTLR src "TNSDL.g" 758
fragment HexDigit:

	Digit | 'A'..'F'|'a'..'f'
	
;

// $ANTLR src "TNSDL.g" 764
fragment LongerStringConstant : // YFR_0902_TNSDL_GRAMMAR.pdf 5.5.2
  '`'! '`'!
  (   
    ~('`'|' '|'\r'|'\t'|'\n') 
    | ( '`' '`' (' '|'\t')* ('\r')? '\n' (' '|'\t')* '`' '`' ) =>
     '`'! '`'! (' '!|'\t'!)* ('\r'!)? '\n' (' '!|'\t'!)* '`'! '`'!
    | '`' ~'`' )*
  '`'! '`'!
;

// $ANTLR src "TNSDL.g" 774
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
;
    
// $ANTLR src "TNSDL.g" 777
Comment :
  '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
; 

/*specials*/
// $ANTLR src "TNSDL.g" 782
VariableParameterSign   : '...';
// $ANTLR src "TNSDL.g" 783
InterleavingSign		: '|||';//LOTOS interleaving

// $ANTLR src "TNSDL.g" 785
ResultSign              : '->'; //service visibility flag
// $ANTLR src "TNSDL.g" 786
CompositeBeginSign      : '(.';
// $ANTLR src "TNSDL.g" 787
CompositeEndSign        : '.)';
// $ANTLR src "TNSDL.g" 788
GreaterThanOrEqualsSign : '>=';
// $ANTLR src "TNSDL.g" 789
ImpliesSign             : '=>';
// $ANTLR src "TNSDL.g" 790
IsAssignedSign          : ':=';
// $ANTLR src "TNSDL.g" 791
LessThanOrEqualsSign    : '<=';
// $ANTLR src "TNSDL.g" 792
NotEqualsSign           : '/=';
// $ANTLR src "TNSDL.g" 793
BitwiseLeftShift     	: '<<';
// $ANTLR src "TNSDL.g" 794
BitwiseRightShift       : '>>'; //LOTOS enabling operator also
// $ANTLR src "TNSDL.g" 795
ChoiceSign				: '[]'; //LOTOS choice
// $ANTLR src "TNSDL.g" 796
DisablingSign			: '[>'; //LOTOS disabling

// $ANTLR src "TNSDL.g" 798
ExclamationMark         : '!';
// $ANTLR src "TNSDL.g" 799
QuotationMark           : '\"';
// $ANTLR src "TNSDL.g" 800
LeftParenthesis         : '(';
// $ANTLR src "TNSDL.g" 801
RightParenthesis        : ')';
// $ANTLR src "TNSDL.g" 802
Asterisk                : '*';
// $ANTLR src "TNSDL.g" 803
Dot		                : '.';
// $ANTLR src "TNSDL.g" 804
Dollar					: '$';
// $ANTLR src "TNSDL.g" 805
ATail					: '@';
// $ANTLR src "TNSDL.g" 806
PlusSign                : '+';
// $ANTLR src "TNSDL.g" 807
Comma                   : ',';
// $ANTLR src "TNSDL.g" 808
Hyphen                  : '-';
// $ANTLR src "TNSDL.g" 809
Colon                   : ':';
// $ANTLR src "TNSDL.g" 810
BitwiseNot				: '~';
// $ANTLR src "TNSDL.g" 811
BitwiseXor				: '^';
// $ANTLR src "TNSDL.g" 812
BitwiseAnd				: '&';
// $ANTLR src "TNSDL.g" 813
BitwiseOr				: '|';
// $ANTLR src "TNSDL.g" 814
Semicolon               : ';';
// $ANTLR src "TNSDL.g" 815
LessThanSign            : '<';
// $ANTLR src "TNSDL.g" 816
EqualsSign              : '=';
// $ANTLR src "TNSDL.g" 817
GreaterThanSign         : '>';
// $ANTLR src "TNSDL.g" 818
QuestionMark			: '?';
// $ANTLR src "TNSDL.g" 819
Solidus 				: '/';

 /* key words*/
 // $ANTLR src "TNSDL.g" 822
fragment    ABSTRACT:;
 // $ANTLR src "TNSDL.g" 823
fragment    ACCEPTS:;
 // $ANTLR src "TNSDL.g" 824
fragment    ADDING:;
 // $ANTLR src "TNSDL.g" 825
fragment    ALARM:;
 // $ANTLR src "TNSDL.g" 826
fragment    ALL:;
 // $ANTLR src "TNSDL.g" 827
fragment    ALTERNATIVE:;
 // $ANTLR src "TNSDL.g" 828
fragment    AND:;
 // $ANTLR src "TNSDL.g" 829
fragment    ARRAY:;
 // $ANTLR src "TNSDL.g" 830
fragment    ASYNC:;
 // $ANTLR src "TNSDL.g" 831
fragment    AXIOMS:;
 // $ANTLR src "TNSDL.g" 832
fragment    BITS:;
 // $ANTLR src "TNSDL.g" 833
fragment    BITSTRUCT:;
 // $ANTLR src "TNSDL.g" 834
fragment    CALL:;
 // $ANTLR src "TNSDL.g" 835
fragment    COMMANDS:;
 // $ANTLR src "TNSDL.g" 836
fragment    COMMENT:;
 // $ANTLR src "TNSDL.g" 837
fragment    CONSTANT:;
 // $ANTLR src "TNSDL.g" 838
fragment    CREATE:;
 // $ANTLR src "TNSDL.g" 839
fragment    DATABASE:;
 // $ANTLR src "TNSDL.g" 840
fragment    DCL:;
 // $ANTLR src "TNSDL.g" 841
fragment    DECISION:;
 // $ANTLR src "TNSDL.g" 842
fragment    DISTRIBUTED:;
 // $ANTLR src "TNSDL.g" 843
fragment    ELSE:;
 // $ANTLR src "TNSDL.g" 844
fragment    ENDALTERNATIVE:;
 // $ANTLR src "TNSDL.g" 845
fragment    ENDBITSTRUCT:;
 // $ANTLR src "TNSDL.g" 846
fragment    ENDDECISION:;
 // $ANTLR src "TNSDL.g" 847
fragment    ENDENUM:;
 // $ANTLR src "TNSDL.g" 848
fragment    ENDGENERATOR:;
 // $ANTLR src "TNSDL.g" 849
fragment    ENDIMPLEMENTATION:;
 // $ANTLR src "TNSDL.g" 850
fragment    ENDLIBRARY:;
 // $ANTLR src "TNSDL.g" 851
fragment    ENDMACRO:;
 // $ANTLR src "TNSDL.g" 852
fragment    ENDMODULE:;
 // $ANTLR src "TNSDL.g" 853
fragment    ENDPROCEDURE:;
 // $ANTLR src "TNSDL.g" 854
fragment    ENDPROCESS:;
 // $ANTLR src "TNSDL.g" 855
fragment    ENDPROGRAMBLOCK:;
 // $ANTLR src "TNSDL.g" 856
fragment    ENDSELECT:;
 // $ANTLR src "TNSDL.g" 857
fragment    ENDSERVICEBLOCK:;
 // $ANTLR src "TNSDL.g" 858
fragment    ENDSTATE:;
 // $ANTLR src "TNSDL.g" 859
fragment    ENDSTRUCT:;
 // $ANTLR src "TNSDL.g" 860
fragment    ENDSUBAUTOMATON:;
 // $ANTLR src "TNSDL.g" 861
fragment    ENDSYSTEM:;
 // $ANTLR src "TNSDL.g" 862
fragment    ENDSYSTEMBLOCK:;
 // $ANTLR src "TNSDL.g" 863
fragment    ENDTYPE:;
 // $ANTLR src "TNSDL.g" 864
fragment    ENDUNION:;
 // $ANTLR src "TNSDL.g" 865
fragment    ENDWHILE:;
 // $ANTLR src "TNSDL.g" 866
fragment    ENUM:;
 // $ANTLR src "TNSDL.g" 867
fragment    EXIT:;
 // $ANTLR src "TNSDL.g" 868
fragment    EXTERNAL:;
 // $ANTLR src "TNSDL.g" 869
fragment	   FAR:;
 // $ANTLR src "TNSDL.g" 870
fragment	   FPAR:;
 // $ANTLR src "TNSDL.g" 871
fragment	   GENERATOR:;
 // $ANTLR src "TNSDL.g" 872
fragment	   HAS:;
 // $ANTLR src "TNSDL.g" 873
fragment    IF:;
 // $ANTLR src "TNSDL.g" 874
fragment    INHERITS:;
 // $ANTLR src "TNSDL.g" 875
fragment    INTERNAL:;
 // $ANTLR src "TNSDL.g" 876
fragment    IMPLEMENTATION:;
 // $ANTLR src "TNSDL.g" 877
fragment    IN:;
 // $ANTLR src "TNSDL.g" 878
fragment    INDICATES:;
 // $ANTLR src "TNSDL.g" 879
fragment    INPUT:;
 // $ANTLR src "TNSDL.g" 880
fragment    JOIN:;
 // $ANTLR src "TNSDL.g" 881
fragment    LIBRARY:;
 // $ANTLR src "TNSDL.g" 882
fragment    LITERALS:;
 // $ANTLR src "TNSDL.g" 883
fragment    MACRO:;
 // $ANTLR src "TNSDL.g" 884
fragment    MACRODEFINITION:;
 // $ANTLR src "TNSDL.g" 885
fragment    MACROID:;
 // $ANTLR src "TNSDL.g" 886
fragment    MASTER:;
 // $ANTLR src "TNSDL.g" 887
fragment    MOD:;
 // $ANTLR src "TNSDL.g" 888
fragment    MODULE:;
 // $ANTLR src "TNSDL.g" 889
fragment    NEAR:;
 // $ANTLR src "TNSDL.g" 890
fragment    NEXTSTATE:;
 // $ANTLR src "TNSDL.g" 891
fragment    NOT:;
 // $ANTLR src "TNSDL.g" 892
fragment	   OF:;
 // $ANTLR src "TNSDL.g" 893
fragment    OPERATORS:;
 // $ANTLR src "TNSDL.g" 894
fragment    OR:;
 // $ANTLR src "TNSDL.g" 895
fragment    OUT:;
 // $ANTLR src "TNSDL.g" 896
fragment    OUTPUT:;
 // $ANTLR src "TNSDL.g" 897
fragment    PACKED:;
 // $ANTLR src "TNSDL.g" 898
fragment    POINTER:;
 // $ANTLR src "TNSDL.g" 899
fragment    PROCEDURE:;
 // $ANTLR src "TNSDL.g" 900
fragment    PROCESS:;
 // $ANTLR src "TNSDL.g" 901
fragment    PROGRAMBLOCK:;
 // $ANTLR src "TNSDL.g" 902
fragment    PROVIDED:;
 // $ANTLR src "TNSDL.g" 903
fragment    PROVIDES:;
 // $ANTLR src "TNSDL.g" 904
fragment    REPRESENTATION:;
 // $ANTLR src "TNSDL.g" 905
fragment    RESET:;
 // $ANTLR src "TNSDL.g" 906
fragment    RETURN:;
 // $ANTLR src "TNSDL.g" 907
fragment    RETURNS:;
 // $ANTLR src "TNSDL.g" 908
fragment    REVEALED:;
 // $ANTLR src "TNSDL.g" 909
fragment    SAVE:;
 // $ANTLR src "TNSDL.g" 910
fragment    SELECT:;
 // $ANTLR src "TNSDL.g" 911
fragment    SERVICEBLOCK:;
 // $ANTLR src "TNSDL.g" 912
fragment    SERVICES:;
 // $ANTLR src "TNSDL.g" 913
fragment    SET:;
 // $ANTLR src "TNSDL.g" 914
fragment    SIGNAL:;
 // $ANTLR src "TNSDL.g" 915
fragment    SIGNALSET:;
 // $ANTLR src "TNSDL.g" 916
fragment    SIZEOF:;
 // $ANTLR src "TNSDL.g" 917
fragment    SKIP:;
 // $ANTLR src "TNSDL.g" 918
fragment    START:;
 // $ANTLR src "TNSDL.g" 919
fragment    STATE:;
 // $ANTLR src "TNSDL.g" 920
fragment    STOP:;
 // $ANTLR src "TNSDL.g" 921
fragment    STRUCT:;
 // $ANTLR src "TNSDL.g" 922
fragment    SUBAUTOMATON:;
 // $ANTLR src "TNSDL.g" 923
fragment    SYNC:;
 // $ANTLR src "TNSDL.g" 924
fragment    SYNONYM:;
 // $ANTLR src "TNSDL.g" 925
fragment    SYSTEM:;
 // $ANTLR src "TNSDL.g" 926
fragment    SYSTEMBLOCK:;
 // $ANTLR src "TNSDL.g" 927
fragment    TASK:;
 // $ANTLR src "TNSDL.g" 928
fragment    TIMER:;
 // $ANTLR src "TNSDL.g" 929
fragment    TO:;
 // $ANTLR src "TNSDL.g" 930
fragment    TYPE:;
 // $ANTLR src "TNSDL.g" 931
fragment    UNION:;
 // $ANTLR src "TNSDL.g" 932
fragment    USES:;
 // $ANTLR src "TNSDL.g" 933
fragment    VIEWED:;
 // $ANTLR src "TNSDL.g" 934
fragment    WHERE:;
 // $ANTLR src "TNSDL.g" 935
fragment    WHILE:;
 // $ANTLR src "TNSDL.g" 936
fragment    WITHWARMING:;
 // $ANTLR src "TNSDL.g" 937
fragment    XOR:;

 /*constants*/
 // $ANTLR src "TNSDL.g" 940
fragment    IntegerConstant:;
 // $ANTLR src "TNSDL.g" 941
fragment 	 RealConstant:;
