// $ANTLR 3.0.1 TNSDL.g 2007-10-18 10:54:02
package net.sourceforge.pmd.cpd.tnsdl;

import java.util.Hashtable;


import org.antlr.runtime.*;
import java.util.HashMap;
public class TNSDLLexer extends Lexer {
    public static final int ViewDeclarationList=26;
    public static final int ValidInputSignalSet=108;
    public static final int SimpleTypeDefinition=49;
    public static final int RangeList=203;
    public static final int POINTER=276;
    public static final int BitwiseOr=225;
    public static final int FAR=279;
    public static final int Solidus=233;
    public static final int SavePart=174;
    public static final int StateListing=190;
    public static final int ACCEPTS=300;
    public static final int CREATE=309;
    public static final int VariableModifier=113;
    public static final int AsynchronousDefinition=28;
    public static final int EnumConstDecCommaList=78;
    public static final int RETURN=356;
    public static final int OptReturnValue=191;
    public static final int BehaviouralE3=31;
    public static final int DisablingSign=296;
    public static final int ENDTYPE=252;
    public static final int Dollar=244;
    public static final int BehaviouralFactor0=33;
    public static final int StackingDirection=62;
    public static final int BITSTRUCT=269;
    public static final int BitwiseNot=235;
    public static final int ModuleImpl=15;
    public static final int STOP=369;
    public static final int Action=136;
    public static final int GENERATOR=334;
    public static final int WhileLoop=209;
    public static final int Range=204;
    public static final int PACKED=266;
    public static final int ProcedureDefinition=122;
    public static final int ExpressionList=68;
    public static final int USES=378;
    public static final int OptVariableDefinitionList=176;
    public static final int CONSTANT=263;
    public static final int TimerDefinition=117;
    public static final int DatabaseReferences=160;
    public static final int CallingMethod=63;
    public static final int SpecificProcess=153;
    public static final int ModuleDefinition=14;
    public static final int ShorterStringConstant=288;
    public static final int ProgramBlockImplDeclaration=166;
    public static final int ClosedRange=205;
    public static final int BitwiseLeftShift=228;
    public static final int ENDMACRO=319;
    public static final int ModuleImplDeclarations=158;
    public static final int VariableDeclarationList=114;
    public static final int HexDigit=285;
    public static final int ActionStatementList=133;
    public static final int AssignmentStatement=139;
    public static final int ConstantDeclarationList=64;
    public static final int ASYNC=305;
    public static final int SystemImpl=6;
    public static final int ReceptionList=180;
    public static final int ENDLIBRARY=318;
    public static final int Transition=132;
    public static final int SignalFieldDeclaration=47;
    public static final int OutputSignalParameters=144;
    public static final int AlarmInfo=41;
    public static final int RETURNS=357;
    public static final int OptOutputAttributes=145;
    public static final int CompositeBeginSign=249;
    public static final int REPRESENTATION=280;
    public static final int NextstateBody=192;
    public static final int SetStatement=213;
    public static final int MODULE=348;
    public static final int Tokens=382;
    public static final int Escape=290;
    public static final int DATABASE=310;
    public static final int AlarmReset=196;
    public static final int ReceptionParameter=177;
    public static final int SaveList=173;
    public static final int HasClause=54;
    public static final int GeneratorFormals=51;
    public static final int RepresentationClause=71;
    public static final int DECISION=312;
    public static final int EqualsSign=214;
    public static final int OpenRange=206;
    public static final int InputList=184;
    public static final int RESET=355;
    public static final int ExclamationMark=297;
    public static final int ENDPROGRAMBLOCK=323;
    public static final int CompositeEndSign=250;
    public static final int AnswerPartList=155;
    public static final int RelationSymbol=207;
    public static final int ProcedureFormalDeclaration=125;
    public static final int OptOutLabel=210;
    public static final int HAS=335;
    public static final int TypedParameterList0=58;
    public static final int SYSTEM=373;
    public static final int ProcessFormalDeclaration=107;
    public static final int INHERITS=337;
    public static final int SignalDeclarationList=44;
    public static final int SubscriptDeclaration=96;
    public static final int ProcedureCall=195;
    public static final int OptCallingSequence=61;
    public static final int COMMENT=253;
    public static final int SELECT=360;
    public static final int ENDALTERNATIVE=314;
    public static final int ARRAY=275;
    public static final int ATail=239;
    public static final int EnumConstDeclarationsPart=77;
    public static final int EXIT=331;
    public static final int ENDBITSTRUCT=270;
    public static final int AsynchronousServices=18;
    public static final int Colon=220;
    public static final int TaskBody=137;
    public static final int OF=272;
    public static final int InputOrSave=187;
    public static final int ProcedureLocal=129;
    public static final int StimulusList=181;
    public static final int SystemBlockImplDeclaration=102;
    public static final int ServiceDefinitions=16;
    public static final int ENDSYSTEMBLOCK=329;
    public static final int ExternalSynonymDefinition=37;
    public static final int ENDIMPLEMENTATION=317;
    public static final int OR=221;
    public static final int SIZEOF=241;
    public static final int HasList=53;
    public static final int OutputBody=141;
    public static final int ENDPROCEDURE=321;
    public static final int SystemBlockDefinition=7;
    public static final int GreaterThanOrEqualsSign=219;
    public static final int OUTPUT=350;
    public static final int Letter=281;
    public static final int FieldDeclaration=83;
    public static final int WHERE=379;
    public static final int SystemBlockReferences=34;
    public static final int StructDeclaration=81;
    public static final int LimitedSynchronousDefinition=24;
    public static final int ABSTRACT=255;
    public static final int ENDSTATE=326;
    public static final int ConstantDeclaration=65;
    public static final int ALARM=302;
    public static final int IndicatesPart=99;
    public static final int ModuleImplDeclaration=157;
    public static final int IF=336;
    public static final int PreprocDirective=283;
    public static final int InternalFlag=185;
    public static final int IN=260;
    public static final int Factor=66;
    public static final int ENDMODULE=320;
    public static final int ReceptionParameterDef=179;
    public static final int OPERATORS=256;
    public static final int CreateOptions=149;
    public static final int BitsDeclaration=94;
    public static final int SyncServiceLibrary=19;
    public static final int ChoiceSign=295;
    public static final int Asterisk=232;
    public static final int ServiceBlockReference=103;
    public static final int OperatorSignatureList=56;
    public static final int ENDPROCESS=322;
    public static final int DCL=311;
    public static final int ElsePart=208;
    public static final int TimerDeclarationList=119;
    public static final int SAVE=359;
    public static final int PROCEDURE=257;
    public static final int AlarmParameters=43;
    public static final int CreateRequest=148;
    public static final int ResultSign=246;
    public static final int OutputAttribute=147;
    public static final int SystemDefinition=5;
    public static final int DecisionBody=154;
    public static final int VariableParameterSign=258;
    public static final int UsualDefinition=36;
    public static final int ImpliesSign=223;
    public static final int SetStatementList=212;
    public static final int BitFieldDeclaration=86;
    public static final int ALTERNATIVE=304;
    public static final int ProgramBlockImpl=12;
    public static final int QuestionMark=299;
    public static final int SIGNALSET=365;
    public static final int UnionDeclaration=87;
    public static final int UserGeneratorInstantiation=72;
    public static final int AlarmDeclaration=39;
    public static final int OptTimeQuota=152;
    public static final int SlaveProcessReferences=163;
    public static final int GeneratorActuals=73;
    public static final int MOD=234;
    public static final int GeneratorFormal=52;
    public static final int IntegerConstant=242;
    public static final int AsignmentStatementList=138;
    public static final int VariableDefinitionList=175;
    public static final int VariableDeclaration=115;
    public static final int NOT=236;
    public static final int EOF=-1;
    public static final int TYPE=251;
    public static final int LessThanOrEqualsSign=218;
    public static final int COMMANDS=308;
    public static final int FPAR=333;
    public static final int PredefinedTypeGeneratorInstantiation=91;
    public static final int ComparedFieldsList=42;
    public static final int QuotationMark=298;
    public static final int NEXTSTATE=349;
    public static final int ProcessFormalParameters=105;
    public static final int FieldDeclarationList=82;
    public static final int ProcessDefinition=13;
    public static final int ServiceBlockImpl=10;
    public static final int MACROID=346;
    public static final int AsynchronousServiceDefinition=30;
    public static final int NumericLiteral=287;
    public static final int BitwiseRightShift=229;
    public static final int ADDING=301;
    public static final int UsesPart=98;
    public static final int ELSE=274;
    public static final int ResetStatement=197;
    public static final int SignalFieldDeclarationList=46;
    public static final int TransitionOption=211;
    public static final int ProcedureResult=126;
    public static final int NameList=35;
    public static final int WS=291;
    public static final int SimpleTypeDefinitions=70;
    public static final int REVEALED=358;
    public static final int OUT=261;
    public static final int TimerDeclaration=120;
    public static final int SystemBlockImpl=8;
    public static final int ViewDeclaration=27;
    public static final int ServiceBlockImplDeclaration=169;
    public static final int CALL=307;
    public static final int SystemImplDeclarations=21;
    public static final int Label=135;
    public static final int TaggedFieldDeclarationList=88;
    public static final int INDICATES=340;
    public static final int SignalPacket=143;
    public static final int ProvidesPart=97;
    public static final int INPUT=341;
    public static final int SynchronousServices=17;
    public static final int LIBRARY=343;
    public static final int MASTER=347;
    public static final int CreateOption=150;
    public static final int SubscriptDeclarations=95;
    public static final int ActualParameters=140;
    public static final int ENDUNION=273;
    public static final int Hyphen=231;
    public static final int ProcessBody=131;
    public static final int SynchronousDefinition=22;
    public static final int ENDDECISION=315;
    public static final int ProcessFormalDeclarations=106;
    public static final int ProgramBlockDefinition=11;
    public static final int NotEqualsSign=215;
    public static final int SIGNAL=364;
    public static final int ENDSYSTEM=328;
    public static final int ProcedureFormalDeclarations=124;
    public static final int Bit=286;
    public static final int AlarmAuxiliaryInfoList=40;
    public static final int STATE=368;
    public static final int WITHWARMING=381;
    public static final int ProgramBlockImplDeclarations=167;
    public static final int PointerDeclaration=93;
    public static final int SignalDeclaration=45;
    public static final int TO=377;
    public static final int TypeDefinition=48;
    public static final int AnswerPart=156;
    public static final int ProcedureDeclarations=127;
    public static final int ProcessSignature=161;
    public static final int SET=363;
    public static final int TypedParameterList=121;
    public static final int BehaviouralFactor=32;
    public static final int NextStateLogics=188;
    public static final int InputPart=186;
    public static final int OutputAttributeList=146;
    public static final int UNION=271;
    public static final int AsteriskStateListing=189;
    public static final int ENUM=264;
    public static final int Enumeration=76;
    public static final int ENDSUBAUTOMATON=327;
    public static final int START=367;
    public static final int PROCESS=351;
    public static final int IsAssignedSign=294;
    public static final int BITS=277;
    public static final int INTERNAL=338;
    public static final int AXIOMS=306;
    public static final int EXTERNAL=332;
    public static final int ENDGENERATOR=316;
    public static final int WHILE=380;
    public static final int RightParenthesis=238;
    public static final int SignalPacketList=142;
    public static final int ProcessLocals=110;
    public static final int SERVICEBLOCK=361;
    public static final int ResetStatementListOrAlarmReset=199;
    public static final int LeftParenthesis=237;
    public static final int ENDSELECT=324;
    public static final int LITERALS=344;
    public static final int SubautomatonDecomposition=171;
    public static final int ReceptionParameterList=178;
    public static final int NumberOfInstances=104;
    public static final int ActionStatement=134;
    public static final int AsyncServiceLibrary=20;
    public static final int EnumConstDeclaration=80;
    public static final int Comment=292;
    public static final int LessThanSign=216;
    public static final int SystemBlockImplDeclarations=101;
    public static final int IMPLEMENTATION=339;
    public static final int ENDWHILE=330;
    public static final int ENDSERVICEBLOCK=325;
    public static final int SYNONYM=372;
    public static final int TaggedFieldDeclaration=89;
    public static final int LongerStringConstant=289;
    public static final int NEAR=278;
    public static final int MACRODEFINITION=345;
    public static final int BitwiseXor=226;
    public static final int Properties=55;
    public static final int AsteriskSignalListing=183;
    public static final int TypedParameter=60;
    public static final int TASK=375;
    public static final int Stimulus=182;
    public static final int AcceptsPart=100;
    public static final int SKIP=366;
    public static final int PROGRAMBLOCK=352;
    public static final int ActionReset=200;
    public static final int SYSTEMBLOCK=374;
    public static final int ProgramBlockReferences=168;
    public static final int ServiceBlockDefinition=9;
    public static final int EnumConstDecSemicList=79;
    public static final int SubautomatonDefinition=170;
    public static final int OperatorSignature=57;
    public static final int Terminator=193;
    public static final int ElseFieldOpt=90;
    public static final int BitFieldDeclarationList=85;
    public static final int BitwiseAnd=227;
    public static final int Exponent=284;
    public static final int DISTRIBUTED=313;
    public static final int AND=224;
    public static final int GreaterThanSign=217;
    public static final int VIEWED=262;
    public static final int ENDSTRUCT=268;
    public static final int AlarmRange=201;
    public static final int Designator=67;
    public static final int ENDENUM=265;
    public static final int OptStateListing=172;
    public static final int OptTimerAttribute=118;
    public static final int MasterProcessReference=164;
    public static final int StructurePrimary=69;
    public static final int PROVIDED=353;
    public static final int ProcessDeclarations=109;
    public static final int ALL=303;
    public static final int GroundTypeExpression=74;
    public static final int ProcessReferences=165;
    public static final int SERVICES=362;
    public static final int PROVIDES=354;
    public static final int GeneratorDefinition=50;
    public static final int AsynchronousServiceDefinitions=29;
    public static final int ArrayDeclaration=92;
    public static final int OptTransition=202;
    public static final int ModuleReferences=159;
    public static final int BitStructDeclaration=84;
    public static final int StringConstant=240;
    public static final int XOR=222;
    public static final int SUBAUTOMATON=370;
    public static final int SYNC=371;
    public static final int CompilationUnit=4;
    public static final int TypedPrameterList=59;
    public static final int IntegerSubrange=75;
    public static final int ResetStatementList=198;
    public static final int ProcessBodyOrDecomposition=130;
    public static final int STRUCT=267;
    public static final int RealConstant=243;
    public static final int TerminatorStatement=194;
    public static final int Semicolon=254;
    public static final int Digit=282;
    public static final int JOIN=342;
    public static final int InterleavingSign=293;
    public static final int ProcedureLocals=128;
    public static final int PlusSign=230;
    public static final int VariableDefinition=112;
    public static final int AlarmDeclarationList=38;
    public static final int CreateOptionList=151;
    public static final int LimitedSynchronousServices=23;
    public static final int Dot=245;
    public static final int Name=247;
    public static final int ProcessLocal=111;
    public static final int ProcessSignatures=162;
    public static final int WarmingSpecification=116;
    public static final int ViewDefinition=25;
    public static final int Comma=248;
    public static final int MACRO=259;
    public static final int TIMER=376;
    public static final int ProcedureFormalParameters=123;
    
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

    public TNSDLLexer() {;} 
    public TNSDLLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[174+1];
     }
    public String getGrammarFileName() { return "TNSDL.g"; }

    // $ANTLR start Name
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            // TNSDL.g:690:6: ( Letter ( Letter | Digit )* )
            // TNSDL.g:692:3: Letter ( Letter | Digit )*
            {
            mLetter(); if (failed) return ;
            // TNSDL.g:692:10: ( Letter | Digit )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TNSDL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( backtracking==0 ) {
               _type = checkKeywordsTable(getText()); 
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Name

    // $ANTLR start PreprocDirective
    public final void mPreprocDirective() throws RecognitionException {
        try {
            int _type = PreprocDirective;
            // TNSDL.g:697:18: ( '#' (~ '\\n' )* )
            // TNSDL.g:698:9: '#' (~ '\\n' )*
            {
            match('#'); if (failed) return ;
            // TNSDL.g:698:13: (~ '\\n' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // TNSDL.g:698:14: ~ '\\n'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( backtracking==0 ) {
              channel=HIDDEN;
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PreprocDirective

    // $ANTLR start NumericLiteral
    public final void mNumericLiteral() throws RecognitionException {
        try {
            int _type = NumericLiteral;
            // TNSDL.g:702:15: ( ( ( Digit )+ ( '.' ) )=> ( Digit )+ '.' ( Digit )* ( Exponent )? | ( Digit )+ | '0' ( 'X' | 'x' ) ( HexDigit )+ | '0' ( 'B' | 'b' ) ( Bit )+ )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // TNSDL.g:704:4: ( ( Digit )+ ( '.' ) )=> ( Digit )+ '.' ( Digit )* ( Exponent )?
                    {
                    // TNSDL.g:704:29: ( Digit )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // TNSDL.g:704:31: Digit
                    	    {
                    	    mDigit(); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    match('.'); if (failed) return ;
                    // TNSDL.g:704:44: ( Digit )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // TNSDL.g:704:46: Digit
                    	    {
                    	    mDigit(); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // TNSDL.g:704:55: ( Exponent )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // TNSDL.g:704:57: Exponent
                            {
                            mExponent(); if (failed) return ;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       _type = RealConstant; 
                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:705:5: ( Digit )+
                    {
                    // TNSDL.g:705:5: ( Digit )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // TNSDL.g:705:6: Digit
                    	    {
                    	    mDigit(); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    if ( backtracking==0 ) {
                       _type = IntegerConstant; 
                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:706:5: '0' ( 'X' | 'x' ) ( HexDigit )+
                    {
                    match('0'); if (failed) return ;
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();
                    failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // TNSDL.g:706:19: ( HexDigit )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // TNSDL.g:706:20: HexDigit
                    	    {
                    	    mHexDigit(); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    if ( backtracking==0 ) {
                       _type = IntegerConstant; 
                    }

                    }
                    break;
                case 4 :
                    // TNSDL.g:707:6: '0' ( 'B' | 'b' ) ( Bit )+
                    {
                    match('0'); if (failed) return ;
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();
                    failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // TNSDL.g:707:20: ( Bit )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='1')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // TNSDL.g:707:21: Bit
                    	    {
                    	    mBit(); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    if ( backtracking==0 ) {
                       _type = IntegerConstant; 
                    }

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NumericLiteral

    // $ANTLR start StringConstant
    public final void mStringConstant() throws RecognitionException {
        try {
            int _type = StringConstant;
            // TNSDL.g:711:16: ( ShorterStringConstant | LongerStringConstant )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\'') ) {
                alt10=1;
            }
            else if ( (LA10_0=='`') ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("711:1: StringConstant : ( ShorterStringConstant | LongerStringConstant );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // TNSDL.g:712:1: ShorterStringConstant
                    {
                    mShorterStringConstant(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // TNSDL.g:713:3: LongerStringConstant
                    {
                    mLongerStringConstant(); if (failed) return ;

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringConstant

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // TNSDL.g:716:16: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // TNSDL.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start Exponent
    public final void mExponent() throws RecognitionException {
        try {
            // TNSDL.g:722:19: ( ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+ )
            // TNSDL.g:723:4: ( 'e' | 'E' ) ( '+' | '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // TNSDL.g:723:18: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // TNSDL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // TNSDL.g:723:33: ( Digit )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // TNSDL.g:723:35: Digit
            	    {
            	    mDigit(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Exponent

    // $ANTLR start Bit
    public final void mBit() throws RecognitionException {
        try {
            // TNSDL.g:726:13: ( '0' | '1' )
            // TNSDL.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Bit

    // $ANTLR start ShorterStringConstant
    public final void mShorterStringConstant() throws RecognitionException {
        try {
            // TNSDL.g:732:32: ( '\\'' (~ ( '\\'' | '\\r' | '\\n' ) | Escape | ( '\\'' '\\'' )=> '\\'' '\\'' | ( '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )=> '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' | ( '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )=> '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )* '\\'' )
            // TNSDL.g:734:3: '\\'' (~ ( '\\'' | '\\r' | '\\n' ) | Escape | ( '\\'' '\\'' )=> '\\'' '\\'' | ( '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )=> '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' | ( '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )=> '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )* '\\''
            {
            match('\''); if (failed) return ;
            // TNSDL.g:735:3: (~ ( '\\'' | '\\r' | '\\n' ) | Escape | ( '\\'' '\\'' )=> '\\'' '\\'' | ( '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )=> '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' | ( '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )=> '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )*
            loop18:
            do {
                int alt18=6;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\'') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='\\') && (synpred3())) {
                        alt18=4;
                    }
                    else if ( (LA18_1=='\'') && (synpred2())) {
                        alt18=3;
                    }
                    else if ( ((LA18_1>='a' && LA18_1<='b')||(LA18_1>='e' && LA18_1<='f')||LA18_1=='n'||LA18_1=='r'||LA18_1=='t'||LA18_1=='v'||LA18_1=='x') ) {
                        alt18=2;
                    }
                    else if ( (LA18_1==' ') && (synpred4())) {
                        alt18=5;
                    }
                    else if ( (LA18_1=='\t') && (synpred4())) {
                        alt18=5;
                    }
                    else if ( (LA18_1=='\r') && (synpred4())) {
                        alt18=5;
                    }
                    else if ( (LA18_1=='\n') && (synpred4())) {
                        alt18=5;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='\uFFFE')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // TNSDL.g:735:7: ~ ( '\\'' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // TNSDL.g:736:7: Escape
            	    {
            	    mEscape(); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // TNSDL.g:737:7: ( '\\'' '\\'' )=> '\\'' '\\''
            	    {
            	    match('\''); if (failed) return ;
            	    match('\''); if (failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // TNSDL.g:739:7: ( '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )=> '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\''
            	    {
            	    match('\''); if (failed) return ;
            	    match('\\'); if (failed) return ;
            	    // TNSDL.g:740:19: ( '\\r' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='\r') ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // TNSDL.g:740:20: '\\r'
            	            {
            	            match('\r'); if (failed) return ;

            	            }
            	            break;

            	    }

            	    match('\n'); if (failed) return ;
            	    // TNSDL.g:740:34: ( ' ' | '\\t' )*
            	    loop14:
            	    do {
            	        int alt14=3;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==' ') ) {
            	            alt14=1;
            	        }
            	        else if ( (LA14_0=='\t') ) {
            	            alt14=2;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // TNSDL.g:740:35: ' '
            	    	    {
            	    	    match(' '); if (failed) return ;

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // TNSDL.g:740:40: '\\t'
            	    	    {
            	    	    match('\t'); if (failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    match('\''); if (failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // TNSDL.g:741:7: ( '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )=> '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\''
            	    {
            	    match('\''); if (failed) return ;
            	    // TNSDL.g:742:13: ( ' ' | '\\t' )*
            	    loop15:
            	    do {
            	        int alt15=3;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==' ') ) {
            	            alt15=1;
            	        }
            	        else if ( (LA15_0=='\t') ) {
            	            alt15=2;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // TNSDL.g:742:14: ' '
            	    	    {
            	    	    match(' '); if (failed) return ;

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // TNSDL.g:742:19: '\\t'
            	    	    {
            	    	    match('\t'); if (failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    // TNSDL.g:742:27: ( '\\r' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0=='\r') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // TNSDL.g:742:28: '\\r'
            	            {
            	            match('\r'); if (failed) return ;

            	            }
            	            break;

            	    }

            	    match('\n'); if (failed) return ;
            	    // TNSDL.g:742:41: ( ' ' | '\\t' )*
            	    loop17:
            	    do {
            	        int alt17=3;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==' ') ) {
            	            alt17=1;
            	        }
            	        else if ( (LA17_0=='\t') ) {
            	            alt17=2;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // TNSDL.g:742:42: ' '
            	    	    {
            	    	    match(' '); if (failed) return ;

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // TNSDL.g:742:47: '\\t'
            	    	    {
            	    	    match('\t'); if (failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    match('\''); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\''); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end ShorterStringConstant

    // $ANTLR start Escape
    public final void mEscape() throws RecognitionException {
        try {
            // TNSDL.g:746:17: ( '\\'' ( 'a' | 'b' | 'e' | 'f' | 'n' | 'r' | 't' | 'v' | 'x' HexDigit HexDigit ) )
            // TNSDL.g:747:5: '\\'' ( 'a' | 'b' | 'e' | 'f' | 'n' | 'r' | 't' | 'v' | 'x' HexDigit HexDigit )
            {
            match('\''); if (failed) return ;
            // TNSDL.g:748:5: ( 'a' | 'b' | 'e' | 'f' | 'n' | 'r' | 't' | 'v' | 'x' HexDigit HexDigit )
            int alt19=9;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt19=1;
                }
                break;
            case 'b':
                {
                alt19=2;
                }
                break;
            case 'e':
                {
                alt19=3;
                }
                break;
            case 'f':
                {
                alt19=4;
                }
                break;
            case 'n':
                {
                alt19=5;
                }
                break;
            case 'r':
                {
                alt19=6;
                }
                break;
            case 't':
                {
                alt19=7;
                }
                break;
            case 'v':
                {
                alt19=8;
                }
                break;
            case 'x':
                {
                alt19=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("748:5: ( 'a' | 'b' | 'e' | 'f' | 'n' | 'r' | 't' | 'v' | 'x' HexDigit HexDigit )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // TNSDL.g:748:6: 'a'
                    {
                    match('a'); if (failed) return ;

                    }
                    break;
                case 2 :
                    // TNSDL.g:748:12: 'b'
                    {
                    match('b'); if (failed) return ;

                    }
                    break;
                case 3 :
                    // TNSDL.g:748:18: 'e'
                    {
                    match('e'); if (failed) return ;

                    }
                    break;
                case 4 :
                    // TNSDL.g:748:24: 'f'
                    {
                    match('f'); if (failed) return ;

                    }
                    break;
                case 5 :
                    // TNSDL.g:748:30: 'n'
                    {
                    match('n'); if (failed) return ;

                    }
                    break;
                case 6 :
                    // TNSDL.g:748:36: 'r'
                    {
                    match('r'); if (failed) return ;

                    }
                    break;
                case 7 :
                    // TNSDL.g:748:42: 't'
                    {
                    match('t'); if (failed) return ;

                    }
                    break;
                case 8 :
                    // TNSDL.g:748:48: 'v'
                    {
                    match('v'); if (failed) return ;

                    }
                    break;
                case 9 :
                    // TNSDL.g:748:54: 'x' HexDigit HexDigit
                    {
                    match('x'); if (failed) return ;
                    mHexDigit(); if (failed) return ;
                    mHexDigit(); if (failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Escape

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // TNSDL.g:752:15: ( '0' .. '9' )
            // TNSDL.g:754:3: '0' .. '9'
            {
            matchRange('0','9'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // TNSDL.g:758:18: ( Digit | 'A' .. 'F' | 'a' .. 'f' )
            // TNSDL.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start LongerStringConstant
    public final void mLongerStringConstant() throws RecognitionException {
        try {
            // TNSDL.g:764:31: ( '`' '`' (~ ( '`' | ' ' | '\\r' | '\\t' | '\\n' ) | ( '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`' )=> '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`' | '`' ~ '`' )* '`' '`' )
            // TNSDL.g:765:3: '`' '`' (~ ( '`' | ' ' | '\\r' | '\\t' | '\\n' ) | ( '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`' )=> '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`' | '`' ~ '`' )* '`' '`'
            {
            match('`'); if (failed) return ;
            match('`'); if (failed) return ;
            // TNSDL.g:766:3: (~ ( '`' | ' ' | '\\r' | '\\t' | '\\n' ) | ( '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`' )=> '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`' | '`' ~ '`' )*
            loop23:
            do {
                int alt23=4;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='`') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='`') ) {
                        int LA23_3 = input.LA(3);

                        if ( (LA23_3==' ') && (synpred5())) {
                            alt23=2;
                        }
                        else if ( (LA23_3=='\t') && (synpred5())) {
                            alt23=2;
                        }
                        else if ( (LA23_3=='\r') && (synpred5())) {
                            alt23=2;
                        }
                        else if ( (LA23_3=='\n') && (synpred5())) {
                            alt23=2;
                        }


                    }
                    else if ( ((LA23_1>='\u0000' && LA23_1<='_')||(LA23_1>='a' && LA23_1<='\uFFFE')) ) {
                        alt23=3;
                    }


                }
                else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||(LA23_0>='!' && LA23_0<='_')||(LA23_0>='a' && LA23_0<='\uFFFE')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // TNSDL.g:767:5: ~ ( '`' | ' ' | '\\r' | '\\t' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // TNSDL.g:768:7: ( '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`' )=> '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`'
            	    {
            	    match('`'); if (failed) return ;
            	    match('`'); if (failed) return ;
            	    // TNSDL.g:769:16: ( ' ' | '\\t' )*
            	    loop20:
            	    do {
            	        int alt20=3;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==' ') ) {
            	            alt20=1;
            	        }
            	        else if ( (LA20_0=='\t') ) {
            	            alt20=2;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // TNSDL.g:769:17: ' '
            	    	    {
            	    	    match(' '); if (failed) return ;

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // TNSDL.g:769:22: '\\t'
            	    	    {
            	    	    match('\t'); if (failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);

            	    // TNSDL.g:769:30: ( '\\r' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0=='\r') ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // TNSDL.g:769:31: '\\r'
            	            {
            	            match('\r'); if (failed) return ;

            	            }
            	            break;

            	    }

            	    match('\n'); if (failed) return ;
            	    // TNSDL.g:769:44: ( ' ' | '\\t' )*
            	    loop22:
            	    do {
            	        int alt22=3;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==' ') ) {
            	            alt22=1;
            	        }
            	        else if ( (LA22_0=='\t') ) {
            	            alt22=2;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // TNSDL.g:769:45: ' '
            	    	    {
            	    	    match(' '); if (failed) return ;

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // TNSDL.g:769:50: '\\t'
            	    	    {
            	    	    match('\t'); if (failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    match('`'); if (failed) return ;
            	    match('`'); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // TNSDL.g:770:7: '`' ~ '`'
            	    {
            	    match('`'); if (failed) return ;
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match('`'); if (failed) return ;
            match('`'); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end LongerStringConstant

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // TNSDL.g:774:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // TNSDL.g:774:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( backtracking==0 ) {
              channel=HIDDEN;
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start Comment
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            // TNSDL.g:777:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // TNSDL.g:778:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (failed) return ;

            // TNSDL.g:778:8: ( options {greedy=false; } : . )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='*') ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1=='/') ) {
                        alt24=2;
                    }
                    else if ( ((LA24_1>='\u0000' && LA24_1<='.')||(LA24_1>='0' && LA24_1<='\uFFFE')) ) {
                        alt24=1;
                    }


                }
                else if ( ((LA24_0>='\u0000' && LA24_0<=')')||(LA24_0>='+' && LA24_0<='\uFFFE')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // TNSDL.g:778:35: .
            	    {
            	    matchAny(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match("*/"); if (failed) return ;

            if ( backtracking==0 ) {
              channel=HIDDEN;
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Comment

    // $ANTLR start VariableParameterSign
    public final void mVariableParameterSign() throws RecognitionException {
        try {
            int _type = VariableParameterSign;
            // TNSDL.g:782:25: ( '...' )
            // TNSDL.g:782:27: '...'
            {
            match("..."); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VariableParameterSign

    // $ANTLR start InterleavingSign
    public final void mInterleavingSign() throws RecognitionException {
        try {
            int _type = InterleavingSign;
            // TNSDL.g:783:19: ( '|||' )
            // TNSDL.g:783:21: '|||'
            {
            match("|||"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end InterleavingSign

    // $ANTLR start ResultSign
    public final void mResultSign() throws RecognitionException {
        try {
            int _type = ResultSign;
            // TNSDL.g:785:25: ( '->' )
            // TNSDL.g:785:27: '->'
            {
            match("->"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ResultSign

    // $ANTLR start CompositeBeginSign
    public final void mCompositeBeginSign() throws RecognitionException {
        try {
            int _type = CompositeBeginSign;
            // TNSDL.g:786:25: ( '(.' )
            // TNSDL.g:786:27: '(.'
            {
            match("(."); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CompositeBeginSign

    // $ANTLR start CompositeEndSign
    public final void mCompositeEndSign() throws RecognitionException {
        try {
            int _type = CompositeEndSign;
            // TNSDL.g:787:25: ( '.)' )
            // TNSDL.g:787:27: '.)'
            {
            match(".)"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CompositeEndSign

    // $ANTLR start GreaterThanOrEqualsSign
    public final void mGreaterThanOrEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanOrEqualsSign;
            // TNSDL.g:788:25: ( '>=' )
            // TNSDL.g:788:27: '>='
            {
            match(">="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GreaterThanOrEqualsSign

    // $ANTLR start ImpliesSign
    public final void mImpliesSign() throws RecognitionException {
        try {
            int _type = ImpliesSign;
            // TNSDL.g:789:25: ( '=>' )
            // TNSDL.g:789:27: '=>'
            {
            match("=>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ImpliesSign

    // $ANTLR start IsAssignedSign
    public final void mIsAssignedSign() throws RecognitionException {
        try {
            int _type = IsAssignedSign;
            // TNSDL.g:790:25: ( ':=' )
            // TNSDL.g:790:27: ':='
            {
            match(":="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IsAssignedSign

    // $ANTLR start LessThanOrEqualsSign
    public final void mLessThanOrEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanOrEqualsSign;
            // TNSDL.g:791:25: ( '<=' )
            // TNSDL.g:791:27: '<='
            {
            match("<="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LessThanOrEqualsSign

    // $ANTLR start NotEqualsSign
    public final void mNotEqualsSign() throws RecognitionException {
        try {
            int _type = NotEqualsSign;
            // TNSDL.g:792:25: ( '/=' )
            // TNSDL.g:792:27: '/='
            {
            match("/="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NotEqualsSign

    // $ANTLR start BitwiseLeftShift
    public final void mBitwiseLeftShift() throws RecognitionException {
        try {
            int _type = BitwiseLeftShift;
            // TNSDL.g:793:23: ( '<<' )
            // TNSDL.g:793:25: '<<'
            {
            match("<<"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BitwiseLeftShift

    // $ANTLR start BitwiseRightShift
    public final void mBitwiseRightShift() throws RecognitionException {
        try {
            int _type = BitwiseRightShift;
            // TNSDL.g:794:25: ( '>>' )
            // TNSDL.g:794:27: '>>'
            {
            match(">>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BitwiseRightShift

    // $ANTLR start ChoiceSign
    public final void mChoiceSign() throws RecognitionException {
        try {
            int _type = ChoiceSign;
            // TNSDL.g:795:15: ( '[]' )
            // TNSDL.g:795:17: '[]'
            {
            match("[]"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ChoiceSign

    // $ANTLR start DisablingSign
    public final void mDisablingSign() throws RecognitionException {
        try {
            int _type = DisablingSign;
            // TNSDL.g:796:17: ( '[>' )
            // TNSDL.g:796:19: '[>'
            {
            match("[>"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DisablingSign

    // $ANTLR start ExclamationMark
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            // TNSDL.g:798:25: ( '!' )
            // TNSDL.g:798:27: '!'
            {
            match('!'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ExclamationMark

    // $ANTLR start QuotationMark
    public final void mQuotationMark() throws RecognitionException {
        try {
            int _type = QuotationMark;
            // TNSDL.g:799:25: ( '\\\"' )
            // TNSDL.g:799:27: '\\\"'
            {
            match('\"'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QuotationMark

    // $ANTLR start LeftParenthesis
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            // TNSDL.g:800:25: ( '(' )
            // TNSDL.g:800:27: '('
            {
            match('('); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LeftParenthesis

    // $ANTLR start RightParenthesis
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            // TNSDL.g:801:25: ( ')' )
            // TNSDL.g:801:27: ')'
            {
            match(')'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RightParenthesis

    // $ANTLR start Asterisk
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            // TNSDL.g:802:25: ( '*' )
            // TNSDL.g:802:27: '*'
            {
            match('*'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Asterisk

    // $ANTLR start Dot
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            // TNSDL.g:803:22: ( '.' )
            // TNSDL.g:803:24: '.'
            {
            match('.'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Dot

    // $ANTLR start Dollar
    public final void mDollar() throws RecognitionException {
        try {
            int _type = Dollar;
            // TNSDL.g:804:12: ( '$' )
            // TNSDL.g:804:14: '$'
            {
            match('$'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Dollar

    // $ANTLR start ATail
    public final void mATail() throws RecognitionException {
        try {
            int _type = ATail;
            // TNSDL.g:805:11: ( '@' )
            // TNSDL.g:805:13: '@'
            {
            match('@'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ATail

    // $ANTLR start PlusSign
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            // TNSDL.g:806:25: ( '+' )
            // TNSDL.g:806:27: '+'
            {
            match('+'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PlusSign

    // $ANTLR start Comma
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            // TNSDL.g:807:25: ( ',' )
            // TNSDL.g:807:27: ','
            {
            match(','); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Comma

    // $ANTLR start Hyphen
    public final void mHyphen() throws RecognitionException {
        try {
            int _type = Hyphen;
            // TNSDL.g:808:25: ( '-' )
            // TNSDL.g:808:27: '-'
            {
            match('-'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Hyphen

    // $ANTLR start Colon
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            // TNSDL.g:809:25: ( ':' )
            // TNSDL.g:809:27: ':'
            {
            match(':'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Colon

    // $ANTLR start BitwiseNot
    public final void mBitwiseNot() throws RecognitionException {
        try {
            int _type = BitwiseNot;
            // TNSDL.g:810:15: ( '~' )
            // TNSDL.g:810:17: '~'
            {
            match('~'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BitwiseNot

    // $ANTLR start BitwiseXor
    public final void mBitwiseXor() throws RecognitionException {
        try {
            int _type = BitwiseXor;
            // TNSDL.g:811:15: ( '^' )
            // TNSDL.g:811:17: '^'
            {
            match('^'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BitwiseXor

    // $ANTLR start BitwiseAnd
    public final void mBitwiseAnd() throws RecognitionException {
        try {
            int _type = BitwiseAnd;
            // TNSDL.g:812:15: ( '&' )
            // TNSDL.g:812:17: '&'
            {
            match('&'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BitwiseAnd

    // $ANTLR start BitwiseOr
    public final void mBitwiseOr() throws RecognitionException {
        try {
            int _type = BitwiseOr;
            // TNSDL.g:813:14: ( '|' )
            // TNSDL.g:813:16: '|'
            {
            match('|'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BitwiseOr

    // $ANTLR start Semicolon
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            // TNSDL.g:814:25: ( ';' )
            // TNSDL.g:814:27: ';'
            {
            match(';'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Semicolon

    // $ANTLR start LessThanSign
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            // TNSDL.g:815:25: ( '<' )
            // TNSDL.g:815:27: '<'
            {
            match('<'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LessThanSign

    // $ANTLR start EqualsSign
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            // TNSDL.g:816:25: ( '=' )
            // TNSDL.g:816:27: '='
            {
            match('='); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EqualsSign

    // $ANTLR start GreaterThanSign
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            // TNSDL.g:817:25: ( '>' )
            // TNSDL.g:817:27: '>'
            {
            match('>'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GreaterThanSign

    // $ANTLR start QuestionMark
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            // TNSDL.g:818:16: ( '?' )
            // TNSDL.g:818:18: '?'
            {
            match('?'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QuestionMark

    // $ANTLR start Solidus
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            // TNSDL.g:819:13: ( '/' )
            // TNSDL.g:819:15: '/'
            {
            match('/'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Solidus

    // $ANTLR start ABSTRACT
    public final void mABSTRACT() throws RecognitionException {
        try {
            // TNSDL.g:822:21: ()
            // TNSDL.g:822:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ABSTRACT

    // $ANTLR start ACCEPTS
    public final void mACCEPTS() throws RecognitionException {
        try {
            // TNSDL.g:823:20: ()
            // TNSDL.g:823:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ACCEPTS

    // $ANTLR start ADDING
    public final void mADDING() throws RecognitionException {
        try {
            // TNSDL.g:824:19: ()
            // TNSDL.g:824:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ADDING

    // $ANTLR start ALARM
    public final void mALARM() throws RecognitionException {
        try {
            // TNSDL.g:825:18: ()
            // TNSDL.g:825:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ALARM

    // $ANTLR start ALL
    public final void mALL() throws RecognitionException {
        try {
            // TNSDL.g:826:16: ()
            // TNSDL.g:826:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ALL

    // $ANTLR start ALTERNATIVE
    public final void mALTERNATIVE() throws RecognitionException {
        try {
            // TNSDL.g:827:24: ()
            // TNSDL.g:827:25: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ALTERNATIVE

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            // TNSDL.g:828:16: ()
            // TNSDL.g:828:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start ARRAY
    public final void mARRAY() throws RecognitionException {
        try {
            // TNSDL.g:829:18: ()
            // TNSDL.g:829:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ARRAY

    // $ANTLR start ASYNC
    public final void mASYNC() throws RecognitionException {
        try {
            // TNSDL.g:830:18: ()
            // TNSDL.g:830:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ASYNC

    // $ANTLR start AXIOMS
    public final void mAXIOMS() throws RecognitionException {
        try {
            // TNSDL.g:831:19: ()
            // TNSDL.g:831:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end AXIOMS

    // $ANTLR start BITS
    public final void mBITS() throws RecognitionException {
        try {
            // TNSDL.g:832:17: ()
            // TNSDL.g:832:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end BITS

    // $ANTLR start BITSTRUCT
    public final void mBITSTRUCT() throws RecognitionException {
        try {
            // TNSDL.g:833:22: ()
            // TNSDL.g:833:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end BITSTRUCT

    // $ANTLR start CALL
    public final void mCALL() throws RecognitionException {
        try {
            // TNSDL.g:834:17: ()
            // TNSDL.g:834:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end CALL

    // $ANTLR start COMMANDS
    public final void mCOMMANDS() throws RecognitionException {
        try {
            // TNSDL.g:835:21: ()
            // TNSDL.g:835:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end COMMANDS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            // TNSDL.g:836:20: ()
            // TNSDL.g:836:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start CONSTANT
    public final void mCONSTANT() throws RecognitionException {
        try {
            // TNSDL.g:837:21: ()
            // TNSDL.g:837:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end CONSTANT

    // $ANTLR start CREATE
    public final void mCREATE() throws RecognitionException {
        try {
            // TNSDL.g:838:19: ()
            // TNSDL.g:838:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end CREATE

    // $ANTLR start DATABASE
    public final void mDATABASE() throws RecognitionException {
        try {
            // TNSDL.g:839:21: ()
            // TNSDL.g:839:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end DATABASE

    // $ANTLR start DCL
    public final void mDCL() throws RecognitionException {
        try {
            // TNSDL.g:840:16: ()
            // TNSDL.g:840:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end DCL

    // $ANTLR start DECISION
    public final void mDECISION() throws RecognitionException {
        try {
            // TNSDL.g:841:21: ()
            // TNSDL.g:841:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end DECISION

    // $ANTLR start DISTRIBUTED
    public final void mDISTRIBUTED() throws RecognitionException {
        try {
            // TNSDL.g:842:24: ()
            // TNSDL.g:842:25: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end DISTRIBUTED

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            // TNSDL.g:843:17: ()
            // TNSDL.g:843:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start ENDALTERNATIVE
    public final void mENDALTERNATIVE() throws RecognitionException {
        try {
            // TNSDL.g:844:27: ()
            // TNSDL.g:844:28: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDALTERNATIVE

    // $ANTLR start ENDBITSTRUCT
    public final void mENDBITSTRUCT() throws RecognitionException {
        try {
            // TNSDL.g:845:25: ()
            // TNSDL.g:845:26: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDBITSTRUCT

    // $ANTLR start ENDDECISION
    public final void mENDDECISION() throws RecognitionException {
        try {
            // TNSDL.g:846:24: ()
            // TNSDL.g:846:25: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDDECISION

    // $ANTLR start ENDENUM
    public final void mENDENUM() throws RecognitionException {
        try {
            // TNSDL.g:847:20: ()
            // TNSDL.g:847:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDENUM

    // $ANTLR start ENDGENERATOR
    public final void mENDGENERATOR() throws RecognitionException {
        try {
            // TNSDL.g:848:25: ()
            // TNSDL.g:848:26: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDGENERATOR

    // $ANTLR start ENDIMPLEMENTATION
    public final void mENDIMPLEMENTATION() throws RecognitionException {
        try {
            // TNSDL.g:849:30: ()
            // TNSDL.g:849:31: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDIMPLEMENTATION

    // $ANTLR start ENDLIBRARY
    public final void mENDLIBRARY() throws RecognitionException {
        try {
            // TNSDL.g:850:23: ()
            // TNSDL.g:850:24: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDLIBRARY

    // $ANTLR start ENDMACRO
    public final void mENDMACRO() throws RecognitionException {
        try {
            // TNSDL.g:851:21: ()
            // TNSDL.g:851:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDMACRO

    // $ANTLR start ENDMODULE
    public final void mENDMODULE() throws RecognitionException {
        try {
            // TNSDL.g:852:22: ()
            // TNSDL.g:852:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDMODULE

    // $ANTLR start ENDPROCEDURE
    public final void mENDPROCEDURE() throws RecognitionException {
        try {
            // TNSDL.g:853:25: ()
            // TNSDL.g:853:26: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDPROCEDURE

    // $ANTLR start ENDPROCESS
    public final void mENDPROCESS() throws RecognitionException {
        try {
            // TNSDL.g:854:23: ()
            // TNSDL.g:854:24: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDPROCESS

    // $ANTLR start ENDPROGRAMBLOCK
    public final void mENDPROGRAMBLOCK() throws RecognitionException {
        try {
            // TNSDL.g:855:28: ()
            // TNSDL.g:855:29: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDPROGRAMBLOCK

    // $ANTLR start ENDSELECT
    public final void mENDSELECT() throws RecognitionException {
        try {
            // TNSDL.g:856:22: ()
            // TNSDL.g:856:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDSELECT

    // $ANTLR start ENDSERVICEBLOCK
    public final void mENDSERVICEBLOCK() throws RecognitionException {
        try {
            // TNSDL.g:857:28: ()
            // TNSDL.g:857:29: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDSERVICEBLOCK

    // $ANTLR start ENDSTATE
    public final void mENDSTATE() throws RecognitionException {
        try {
            // TNSDL.g:858:21: ()
            // TNSDL.g:858:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDSTATE

    // $ANTLR start ENDSTRUCT
    public final void mENDSTRUCT() throws RecognitionException {
        try {
            // TNSDL.g:859:22: ()
            // TNSDL.g:859:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDSTRUCT

    // $ANTLR start ENDSUBAUTOMATON
    public final void mENDSUBAUTOMATON() throws RecognitionException {
        try {
            // TNSDL.g:860:28: ()
            // TNSDL.g:860:29: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDSUBAUTOMATON

    // $ANTLR start ENDSYSTEM
    public final void mENDSYSTEM() throws RecognitionException {
        try {
            // TNSDL.g:861:22: ()
            // TNSDL.g:861:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDSYSTEM

    // $ANTLR start ENDSYSTEMBLOCK
    public final void mENDSYSTEMBLOCK() throws RecognitionException {
        try {
            // TNSDL.g:862:27: ()
            // TNSDL.g:862:28: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDSYSTEMBLOCK

    // $ANTLR start ENDTYPE
    public final void mENDTYPE() throws RecognitionException {
        try {
            // TNSDL.g:863:20: ()
            // TNSDL.g:863:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDTYPE

    // $ANTLR start ENDUNION
    public final void mENDUNION() throws RecognitionException {
        try {
            // TNSDL.g:864:21: ()
            // TNSDL.g:864:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDUNION

    // $ANTLR start ENDWHILE
    public final void mENDWHILE() throws RecognitionException {
        try {
            // TNSDL.g:865:21: ()
            // TNSDL.g:865:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENDWHILE

    // $ANTLR start ENUM
    public final void mENUM() throws RecognitionException {
        try {
            // TNSDL.g:866:17: ()
            // TNSDL.g:866:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end ENUM

    // $ANTLR start EXIT
    public final void mEXIT() throws RecognitionException {
        try {
            // TNSDL.g:867:17: ()
            // TNSDL.g:867:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end EXIT

    // $ANTLR start EXTERNAL
    public final void mEXTERNAL() throws RecognitionException {
        try {
            // TNSDL.g:868:21: ()
            // TNSDL.g:868:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end EXTERNAL

    // $ANTLR start FAR
    public final void mFAR() throws RecognitionException {
        try {
            // TNSDL.g:869:16: ()
            // TNSDL.g:869:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end FAR

    // $ANTLR start FPAR
    public final void mFPAR() throws RecognitionException {
        try {
            // TNSDL.g:870:17: ()
            // TNSDL.g:870:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end FPAR

    // $ANTLR start GENERATOR
    public final void mGENERATOR() throws RecognitionException {
        try {
            // TNSDL.g:871:22: ()
            // TNSDL.g:871:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end GENERATOR

    // $ANTLR start HAS
    public final void mHAS() throws RecognitionException {
        try {
            // TNSDL.g:872:16: ()
            // TNSDL.g:872:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end HAS

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            // TNSDL.g:873:15: ()
            // TNSDL.g:873:16: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start INHERITS
    public final void mINHERITS() throws RecognitionException {
        try {
            // TNSDL.g:874:21: ()
            // TNSDL.g:874:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end INHERITS

    // $ANTLR start INTERNAL
    public final void mINTERNAL() throws RecognitionException {
        try {
            // TNSDL.g:875:21: ()
            // TNSDL.g:875:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end INTERNAL

    // $ANTLR start IMPLEMENTATION
    public final void mIMPLEMENTATION() throws RecognitionException {
        try {
            // TNSDL.g:876:27: ()
            // TNSDL.g:876:28: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end IMPLEMENTATION

    // $ANTLR start IN
    public final void mIN() throws RecognitionException {
        try {
            // TNSDL.g:877:15: ()
            // TNSDL.g:877:16: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end IN

    // $ANTLR start INDICATES
    public final void mINDICATES() throws RecognitionException {
        try {
            // TNSDL.g:878:22: ()
            // TNSDL.g:878:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end INDICATES

    // $ANTLR start INPUT
    public final void mINPUT() throws RecognitionException {
        try {
            // TNSDL.g:879:18: ()
            // TNSDL.g:879:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end INPUT

    // $ANTLR start JOIN
    public final void mJOIN() throws RecognitionException {
        try {
            // TNSDL.g:880:17: ()
            // TNSDL.g:880:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end JOIN

    // $ANTLR start LIBRARY
    public final void mLIBRARY() throws RecognitionException {
        try {
            // TNSDL.g:881:20: ()
            // TNSDL.g:881:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end LIBRARY

    // $ANTLR start LITERALS
    public final void mLITERALS() throws RecognitionException {
        try {
            // TNSDL.g:882:21: ()
            // TNSDL.g:882:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end LITERALS

    // $ANTLR start MACRO
    public final void mMACRO() throws RecognitionException {
        try {
            // TNSDL.g:883:18: ()
            // TNSDL.g:883:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end MACRO

    // $ANTLR start MACRODEFINITION
    public final void mMACRODEFINITION() throws RecognitionException {
        try {
            // TNSDL.g:884:28: ()
            // TNSDL.g:884:29: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end MACRODEFINITION

    // $ANTLR start MACROID
    public final void mMACROID() throws RecognitionException {
        try {
            // TNSDL.g:885:20: ()
            // TNSDL.g:885:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end MACROID

    // $ANTLR start MASTER
    public final void mMASTER() throws RecognitionException {
        try {
            // TNSDL.g:886:19: ()
            // TNSDL.g:886:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end MASTER

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            // TNSDL.g:887:16: ()
            // TNSDL.g:887:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start MODULE
    public final void mMODULE() throws RecognitionException {
        try {
            // TNSDL.g:888:19: ()
            // TNSDL.g:888:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end MODULE

    // $ANTLR start NEAR
    public final void mNEAR() throws RecognitionException {
        try {
            // TNSDL.g:889:17: ()
            // TNSDL.g:889:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end NEAR

    // $ANTLR start NEXTSTATE
    public final void mNEXTSTATE() throws RecognitionException {
        try {
            // TNSDL.g:890:22: ()
            // TNSDL.g:890:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end NEXTSTATE

    // $ANTLR start NOT
    public final void mNOT() throws RecognitionException {
        try {
            // TNSDL.g:891:16: ()
            // TNSDL.g:891:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end NOT

    // $ANTLR start OF
    public final void mOF() throws RecognitionException {
        try {
            // TNSDL.g:892:15: ()
            // TNSDL.g:892:16: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end OF

    // $ANTLR start OPERATORS
    public final void mOPERATORS() throws RecognitionException {
        try {
            // TNSDL.g:893:22: ()
            // TNSDL.g:893:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end OPERATORS

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            // TNSDL.g:894:15: ()
            // TNSDL.g:894:16: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start OUT
    public final void mOUT() throws RecognitionException {
        try {
            // TNSDL.g:895:16: ()
            // TNSDL.g:895:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end OUT

    // $ANTLR start OUTPUT
    public final void mOUTPUT() throws RecognitionException {
        try {
            // TNSDL.g:896:19: ()
            // TNSDL.g:896:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end OUTPUT

    // $ANTLR start PACKED
    public final void mPACKED() throws RecognitionException {
        try {
            // TNSDL.g:897:19: ()
            // TNSDL.g:897:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end PACKED

    // $ANTLR start POINTER
    public final void mPOINTER() throws RecognitionException {
        try {
            // TNSDL.g:898:20: ()
            // TNSDL.g:898:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end POINTER

    // $ANTLR start PROCEDURE
    public final void mPROCEDURE() throws RecognitionException {
        try {
            // TNSDL.g:899:22: ()
            // TNSDL.g:899:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end PROCEDURE

    // $ANTLR start PROCESS
    public final void mPROCESS() throws RecognitionException {
        try {
            // TNSDL.g:900:20: ()
            // TNSDL.g:900:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end PROCESS

    // $ANTLR start PROGRAMBLOCK
    public final void mPROGRAMBLOCK() throws RecognitionException {
        try {
            // TNSDL.g:901:25: ()
            // TNSDL.g:901:26: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end PROGRAMBLOCK

    // $ANTLR start PROVIDED
    public final void mPROVIDED() throws RecognitionException {
        try {
            // TNSDL.g:902:21: ()
            // TNSDL.g:902:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end PROVIDED

    // $ANTLR start PROVIDES
    public final void mPROVIDES() throws RecognitionException {
        try {
            // TNSDL.g:903:21: ()
            // TNSDL.g:903:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end PROVIDES

    // $ANTLR start REPRESENTATION
    public final void mREPRESENTATION() throws RecognitionException {
        try {
            // TNSDL.g:904:27: ()
            // TNSDL.g:904:28: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end REPRESENTATION

    // $ANTLR start RESET
    public final void mRESET() throws RecognitionException {
        try {
            // TNSDL.g:905:18: ()
            // TNSDL.g:905:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end RESET

    // $ANTLR start RETURN
    public final void mRETURN() throws RecognitionException {
        try {
            // TNSDL.g:906:19: ()
            // TNSDL.g:906:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end RETURN

    // $ANTLR start RETURNS
    public final void mRETURNS() throws RecognitionException {
        try {
            // TNSDL.g:907:20: ()
            // TNSDL.g:907:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end RETURNS

    // $ANTLR start REVEALED
    public final void mREVEALED() throws RecognitionException {
        try {
            // TNSDL.g:908:21: ()
            // TNSDL.g:908:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end REVEALED

    // $ANTLR start SAVE
    public final void mSAVE() throws RecognitionException {
        try {
            // TNSDL.g:909:17: ()
            // TNSDL.g:909:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SAVE

    // $ANTLR start SELECT
    public final void mSELECT() throws RecognitionException {
        try {
            // TNSDL.g:910:19: ()
            // TNSDL.g:910:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SELECT

    // $ANTLR start SERVICEBLOCK
    public final void mSERVICEBLOCK() throws RecognitionException {
        try {
            // TNSDL.g:911:25: ()
            // TNSDL.g:911:26: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SERVICEBLOCK

    // $ANTLR start SERVICES
    public final void mSERVICES() throws RecognitionException {
        try {
            // TNSDL.g:912:21: ()
            // TNSDL.g:912:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SERVICES

    // $ANTLR start SET
    public final void mSET() throws RecognitionException {
        try {
            // TNSDL.g:913:16: ()
            // TNSDL.g:913:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SET

    // $ANTLR start SIGNAL
    public final void mSIGNAL() throws RecognitionException {
        try {
            // TNSDL.g:914:19: ()
            // TNSDL.g:914:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SIGNAL

    // $ANTLR start SIGNALSET
    public final void mSIGNALSET() throws RecognitionException {
        try {
            // TNSDL.g:915:22: ()
            // TNSDL.g:915:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SIGNALSET

    // $ANTLR start SIZEOF
    public final void mSIZEOF() throws RecognitionException {
        try {
            // TNSDL.g:916:19: ()
            // TNSDL.g:916:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SIZEOF

    // $ANTLR start SKIP
    public final void mSKIP() throws RecognitionException {
        try {
            // TNSDL.g:917:17: ()
            // TNSDL.g:917:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SKIP

    // $ANTLR start START
    public final void mSTART() throws RecognitionException {
        try {
            // TNSDL.g:918:18: ()
            // TNSDL.g:918:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end START

    // $ANTLR start STATE
    public final void mSTATE() throws RecognitionException {
        try {
            // TNSDL.g:919:18: ()
            // TNSDL.g:919:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end STATE

    // $ANTLR start STOP
    public final void mSTOP() throws RecognitionException {
        try {
            // TNSDL.g:920:17: ()
            // TNSDL.g:920:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end STOP

    // $ANTLR start STRUCT
    public final void mSTRUCT() throws RecognitionException {
        try {
            // TNSDL.g:921:19: ()
            // TNSDL.g:921:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end STRUCT

    // $ANTLR start SUBAUTOMATON
    public final void mSUBAUTOMATON() throws RecognitionException {
        try {
            // TNSDL.g:922:25: ()
            // TNSDL.g:922:26: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SUBAUTOMATON

    // $ANTLR start SYNC
    public final void mSYNC() throws RecognitionException {
        try {
            // TNSDL.g:923:17: ()
            // TNSDL.g:923:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SYNC

    // $ANTLR start SYNONYM
    public final void mSYNONYM() throws RecognitionException {
        try {
            // TNSDL.g:924:20: ()
            // TNSDL.g:924:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SYNONYM

    // $ANTLR start SYSTEM
    public final void mSYSTEM() throws RecognitionException {
        try {
            // TNSDL.g:925:19: ()
            // TNSDL.g:925:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SYSTEM

    // $ANTLR start SYSTEMBLOCK
    public final void mSYSTEMBLOCK() throws RecognitionException {
        try {
            // TNSDL.g:926:24: ()
            // TNSDL.g:926:25: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end SYSTEMBLOCK

    // $ANTLR start TASK
    public final void mTASK() throws RecognitionException {
        try {
            // TNSDL.g:927:17: ()
            // TNSDL.g:927:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end TASK

    // $ANTLR start TIMER
    public final void mTIMER() throws RecognitionException {
        try {
            // TNSDL.g:928:18: ()
            // TNSDL.g:928:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end TIMER

    // $ANTLR start TO
    public final void mTO() throws RecognitionException {
        try {
            // TNSDL.g:929:15: ()
            // TNSDL.g:929:16: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end TO

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            // TNSDL.g:930:17: ()
            // TNSDL.g:930:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end TYPE

    // $ANTLR start UNION
    public final void mUNION() throws RecognitionException {
        try {
            // TNSDL.g:931:18: ()
            // TNSDL.g:931:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end UNION

    // $ANTLR start USES
    public final void mUSES() throws RecognitionException {
        try {
            // TNSDL.g:932:17: ()
            // TNSDL.g:932:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end USES

    // $ANTLR start VIEWED
    public final void mVIEWED() throws RecognitionException {
        try {
            // TNSDL.g:933:19: ()
            // TNSDL.g:933:20: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end VIEWED

    // $ANTLR start WHERE
    public final void mWHERE() throws RecognitionException {
        try {
            // TNSDL.g:934:18: ()
            // TNSDL.g:934:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end WHERE

    // $ANTLR start WHILE
    public final void mWHILE() throws RecognitionException {
        try {
            // TNSDL.g:935:18: ()
            // TNSDL.g:935:19: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end WHILE

    // $ANTLR start WITHWARMING
    public final void mWITHWARMING() throws RecognitionException {
        try {
            // TNSDL.g:936:24: ()
            // TNSDL.g:936:25: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end WITHWARMING

    // $ANTLR start XOR
    public final void mXOR() throws RecognitionException {
        try {
            // TNSDL.g:937:16: ()
            // TNSDL.g:937:17: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end XOR

    // $ANTLR start IntegerConstant
    public final void mIntegerConstant() throws RecognitionException {
        try {
            // TNSDL.g:940:28: ()
            // TNSDL.g:940:29: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end IntegerConstant

    // $ANTLR start RealConstant
    public final void mRealConstant() throws RecognitionException {
        try {
            // TNSDL.g:941:24: ()
            // TNSDL.g:941:25: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end RealConstant

    public void mTokens() throws RecognitionException {
        // TNSDL.g:1:8: ( Name | PreprocDirective | NumericLiteral | StringConstant | WS | Comment | VariableParameterSign | InterleavingSign | ResultSign | CompositeBeginSign | CompositeEndSign | GreaterThanOrEqualsSign | ImpliesSign | IsAssignedSign | LessThanOrEqualsSign | NotEqualsSign | BitwiseLeftShift | BitwiseRightShift | ChoiceSign | DisablingSign | ExclamationMark | QuotationMark | LeftParenthesis | RightParenthesis | Asterisk | Dot | Dollar | ATail | PlusSign | Comma | Hyphen | Colon | BitwiseNot | BitwiseXor | BitwiseAnd | BitwiseOr | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | Solidus )
        int alt25=42;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt25=1;
            }
            break;
        case '#':
            {
            alt25=2;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt25=3;
            }
            break;
        case '\'':
        case '`':
            {
            alt25=4;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt25=5;
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt25=6;
                }
                break;
            case '=':
                {
                alt25=16;
                }
                break;
            default:
                alt25=42;}

            }
            break;
        case '.':
            {
            switch ( input.LA(2) ) {
            case '.':
                {
                alt25=7;
                }
                break;
            case ')':
                {
                alt25=11;
                }
                break;
            default:
                alt25=26;}

            }
            break;
        case '|':
            {
            int LA25_8 = input.LA(2);

            if ( (LA25_8=='|') ) {
                alt25=8;
            }
            else {
                alt25=36;}
            }
            break;
        case '-':
            {
            int LA25_9 = input.LA(2);

            if ( (LA25_9=='>') ) {
                alt25=9;
            }
            else {
                alt25=31;}
            }
            break;
        case '(':
            {
            int LA25_10 = input.LA(2);

            if ( (LA25_10=='.') ) {
                alt25=10;
            }
            else {
                alt25=23;}
            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt25=18;
                }
                break;
            case '=':
                {
                alt25=12;
                }
                break;
            default:
                alt25=40;}

            }
            break;
        case '=':
            {
            int LA25_12 = input.LA(2);

            if ( (LA25_12=='>') ) {
                alt25=13;
            }
            else {
                alt25=39;}
            }
            break;
        case ':':
            {
            int LA25_13 = input.LA(2);

            if ( (LA25_13=='=') ) {
                alt25=14;
            }
            else {
                alt25=32;}
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '<':
                {
                alt25=17;
                }
                break;
            case '=':
                {
                alt25=15;
                }
                break;
            default:
                alt25=38;}

            }
            break;
        case '[':
            {
            int LA25_15 = input.LA(2);

            if ( (LA25_15=='>') ) {
                alt25=20;
            }
            else if ( (LA25_15==']') ) {
                alt25=19;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( Name | PreprocDirective | NumericLiteral | StringConstant | WS | Comment | VariableParameterSign | InterleavingSign | ResultSign | CompositeBeginSign | CompositeEndSign | GreaterThanOrEqualsSign | ImpliesSign | IsAssignedSign | LessThanOrEqualsSign | NotEqualsSign | BitwiseLeftShift | BitwiseRightShift | ChoiceSign | DisablingSign | ExclamationMark | QuotationMark | LeftParenthesis | RightParenthesis | Asterisk | Dot | Dollar | ATail | PlusSign | Comma | Hyphen | Colon | BitwiseNot | BitwiseXor | BitwiseAnd | BitwiseOr | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | Solidus );", 25, 15, input);

                throw nvae;
            }
            }
            break;
        case '!':
            {
            alt25=21;
            }
            break;
        case '\"':
            {
            alt25=22;
            }
            break;
        case ')':
            {
            alt25=24;
            }
            break;
        case '*':
            {
            alt25=25;
            }
            break;
        case '$':
            {
            alt25=27;
            }
            break;
        case '@':
            {
            alt25=28;
            }
            break;
        case '+':
            {
            alt25=29;
            }
            break;
        case ',':
            {
            alt25=30;
            }
            break;
        case '~':
            {
            alt25=33;
            }
            break;
        case '^':
            {
            alt25=34;
            }
            break;
        case '&':
            {
            alt25=35;
            }
            break;
        case ';':
            {
            alt25=37;
            }
            break;
        case '?':
            {
            alt25=41;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( Name | PreprocDirective | NumericLiteral | StringConstant | WS | Comment | VariableParameterSign | InterleavingSign | ResultSign | CompositeBeginSign | CompositeEndSign | GreaterThanOrEqualsSign | ImpliesSign | IsAssignedSign | LessThanOrEqualsSign | NotEqualsSign | BitwiseLeftShift | BitwiseRightShift | ChoiceSign | DisablingSign | ExclamationMark | QuotationMark | LeftParenthesis | RightParenthesis | Asterisk | Dot | Dollar | ATail | PlusSign | Comma | Hyphen | Colon | BitwiseNot | BitwiseXor | BitwiseAnd | BitwiseOr | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | Solidus );", 25, 0, input);

            throw nvae;
        }

        switch (alt25) {
            case 1 :
                // TNSDL.g:1:10: Name
                {
                mName(); if (failed) return ;

                }
                break;
            case 2 :
                // TNSDL.g:1:15: PreprocDirective
                {
                mPreprocDirective(); if (failed) return ;

                }
                break;
            case 3 :
                // TNSDL.g:1:32: NumericLiteral
                {
                mNumericLiteral(); if (failed) return ;

                }
                break;
            case 4 :
                // TNSDL.g:1:47: StringConstant
                {
                mStringConstant(); if (failed) return ;

                }
                break;
            case 5 :
                // TNSDL.g:1:62: WS
                {
                mWS(); if (failed) return ;

                }
                break;
            case 6 :
                // TNSDL.g:1:65: Comment
                {
                mComment(); if (failed) return ;

                }
                break;
            case 7 :
                // TNSDL.g:1:73: VariableParameterSign
                {
                mVariableParameterSign(); if (failed) return ;

                }
                break;
            case 8 :
                // TNSDL.g:1:95: InterleavingSign
                {
                mInterleavingSign(); if (failed) return ;

                }
                break;
            case 9 :
                // TNSDL.g:1:112: ResultSign
                {
                mResultSign(); if (failed) return ;

                }
                break;
            case 10 :
                // TNSDL.g:1:123: CompositeBeginSign
                {
                mCompositeBeginSign(); if (failed) return ;

                }
                break;
            case 11 :
                // TNSDL.g:1:142: CompositeEndSign
                {
                mCompositeEndSign(); if (failed) return ;

                }
                break;
            case 12 :
                // TNSDL.g:1:159: GreaterThanOrEqualsSign
                {
                mGreaterThanOrEqualsSign(); if (failed) return ;

                }
                break;
            case 13 :
                // TNSDL.g:1:183: ImpliesSign
                {
                mImpliesSign(); if (failed) return ;

                }
                break;
            case 14 :
                // TNSDL.g:1:195: IsAssignedSign
                {
                mIsAssignedSign(); if (failed) return ;

                }
                break;
            case 15 :
                // TNSDL.g:1:210: LessThanOrEqualsSign
                {
                mLessThanOrEqualsSign(); if (failed) return ;

                }
                break;
            case 16 :
                // TNSDL.g:1:231: NotEqualsSign
                {
                mNotEqualsSign(); if (failed) return ;

                }
                break;
            case 17 :
                // TNSDL.g:1:245: BitwiseLeftShift
                {
                mBitwiseLeftShift(); if (failed) return ;

                }
                break;
            case 18 :
                // TNSDL.g:1:262: BitwiseRightShift
                {
                mBitwiseRightShift(); if (failed) return ;

                }
                break;
            case 19 :
                // TNSDL.g:1:280: ChoiceSign
                {
                mChoiceSign(); if (failed) return ;

                }
                break;
            case 20 :
                // TNSDL.g:1:291: DisablingSign
                {
                mDisablingSign(); if (failed) return ;

                }
                break;
            case 21 :
                // TNSDL.g:1:305: ExclamationMark
                {
                mExclamationMark(); if (failed) return ;

                }
                break;
            case 22 :
                // TNSDL.g:1:321: QuotationMark
                {
                mQuotationMark(); if (failed) return ;

                }
                break;
            case 23 :
                // TNSDL.g:1:335: LeftParenthesis
                {
                mLeftParenthesis(); if (failed) return ;

                }
                break;
            case 24 :
                // TNSDL.g:1:351: RightParenthesis
                {
                mRightParenthesis(); if (failed) return ;

                }
                break;
            case 25 :
                // TNSDL.g:1:368: Asterisk
                {
                mAsterisk(); if (failed) return ;

                }
                break;
            case 26 :
                // TNSDL.g:1:377: Dot
                {
                mDot(); if (failed) return ;

                }
                break;
            case 27 :
                // TNSDL.g:1:381: Dollar
                {
                mDollar(); if (failed) return ;

                }
                break;
            case 28 :
                // TNSDL.g:1:388: ATail
                {
                mATail(); if (failed) return ;

                }
                break;
            case 29 :
                // TNSDL.g:1:394: PlusSign
                {
                mPlusSign(); if (failed) return ;

                }
                break;
            case 30 :
                // TNSDL.g:1:403: Comma
                {
                mComma(); if (failed) return ;

                }
                break;
            case 31 :
                // TNSDL.g:1:409: Hyphen
                {
                mHyphen(); if (failed) return ;

                }
                break;
            case 32 :
                // TNSDL.g:1:416: Colon
                {
                mColon(); if (failed) return ;

                }
                break;
            case 33 :
                // TNSDL.g:1:422: BitwiseNot
                {
                mBitwiseNot(); if (failed) return ;

                }
                break;
            case 34 :
                // TNSDL.g:1:433: BitwiseXor
                {
                mBitwiseXor(); if (failed) return ;

                }
                break;
            case 35 :
                // TNSDL.g:1:444: BitwiseAnd
                {
                mBitwiseAnd(); if (failed) return ;

                }
                break;
            case 36 :
                // TNSDL.g:1:455: BitwiseOr
                {
                mBitwiseOr(); if (failed) return ;

                }
                break;
            case 37 :
                // TNSDL.g:1:465: Semicolon
                {
                mSemicolon(); if (failed) return ;

                }
                break;
            case 38 :
                // TNSDL.g:1:475: LessThanSign
                {
                mLessThanSign(); if (failed) return ;

                }
                break;
            case 39 :
                // TNSDL.g:1:488: EqualsSign
                {
                mEqualsSign(); if (failed) return ;

                }
                break;
            case 40 :
                // TNSDL.g:1:499: GreaterThanSign
                {
                mGreaterThanSign(); if (failed) return ;

                }
                break;
            case 41 :
                // TNSDL.g:1:515: QuestionMark
                {
                mQuestionMark(); if (failed) return ;

                }
                break;
            case 42 :
                // TNSDL.g:1:528: Solidus
                {
                mSolidus(); if (failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // TNSDL.g:704:4: ( ( Digit )+ ( '.' ) )
        // TNSDL.g:704:6: ( Digit )+ ( '.' )
        {
        // TNSDL.g:704:6: ( Digit )+
        int cnt26=0;
        loop26:
        do {
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                alt26=1;
            }


            switch (alt26) {
        	case 1 :
        	    // TNSDL.g:704:8: Digit
        	    {
        	    mDigit(); if (failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt26 >= 1 ) break loop26;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(26, input);
                    throw eee;
            }
            cnt26++;
        } while (true);

        // TNSDL.g:704:17: ( '.' )
        // TNSDL.g:704:19: '.'
        {
        match('.'); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // TNSDL.g:737:7: ( '\\'' '\\'' )
        // TNSDL.g:737:9: '\\'' '\\''
        {
        match('\''); if (failed) return ;
        match('\''); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // TNSDL.g:739:7: ( '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )
        // TNSDL.g:739:8: '\\'' '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\''
        {
        match('\''); if (failed) return ;
        match('\\'); if (failed) return ;
        // TNSDL.g:739:18: ( '\\r' )?
        int alt27=2;
        int LA27_0 = input.LA(1);

        if ( (LA27_0=='\r') ) {
            alt27=1;
        }
        switch (alt27) {
            case 1 :
                // TNSDL.g:739:19: '\\r'
                {
                match('\r'); if (failed) return ;

                }
                break;

        }

        match('\n'); if (failed) return ;
        // TNSDL.g:739:31: ( ' ' | '\\t' )*
        loop28:
        do {
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\t'||LA28_0==' ') ) {
                alt28=1;
            }


            switch (alt28) {
        	case 1 :
        	    // TNSDL.g:
        	    {
        	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
        	        input.consume();
        	    failed=false;
        	    }
        	    else {
        	        if (backtracking>0) {failed=true; return ;}
        	        MismatchedSetException mse =
        	            new MismatchedSetException(null,input);
        	        recover(mse);    throw mse;
        	    }


        	    }
        	    break;

        	default :
        	    break loop28;
            }
        } while (true);

        match('\''); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // TNSDL.g:741:7: ( '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\'' )
        // TNSDL.g:741:8: '\\'' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '\\''
        {
        match('\''); if (failed) return ;
        // TNSDL.g:741:13: ( ' ' | '\\t' )*
        loop29:
        do {
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\t'||LA29_0==' ') ) {
                alt29=1;
            }


            switch (alt29) {
        	case 1 :
        	    // TNSDL.g:
        	    {
        	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
        	        input.consume();
        	    failed=false;
        	    }
        	    else {
        	        if (backtracking>0) {failed=true; return ;}
        	        MismatchedSetException mse =
        	            new MismatchedSetException(null,input);
        	        recover(mse);    throw mse;
        	    }


        	    }
        	    break;

        	default :
        	    break loop29;
            }
        } while (true);

        // TNSDL.g:741:25: ( '\\r' )?
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0=='\r') ) {
            alt30=1;
        }
        switch (alt30) {
            case 1 :
                // TNSDL.g:741:26: '\\r'
                {
                match('\r'); if (failed) return ;

                }
                break;

        }

        match('\n'); if (failed) return ;
        // TNSDL.g:741:38: ( ' ' | '\\t' )*
        loop31:
        do {
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\t'||LA31_0==' ') ) {
                alt31=1;
            }


            switch (alt31) {
        	case 1 :
        	    // TNSDL.g:
        	    {
        	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
        	        input.consume();
        	    failed=false;
        	    }
        	    else {
        	        if (backtracking>0) {failed=true; return ;}
        	        MismatchedSetException mse =
        	            new MismatchedSetException(null,input);
        	        recover(mse);    throw mse;
        	    }


        	    }
        	    break;

        	default :
        	    break loop31;
            }
        } while (true);

        match('\''); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // TNSDL.g:768:7: ( '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`' )
        // TNSDL.g:768:9: '`' '`' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( ' ' | '\\t' )* '`' '`'
        {
        match('`'); if (failed) return ;
        match('`'); if (failed) return ;
        // TNSDL.g:768:17: ( ' ' | '\\t' )*
        loop32:
        do {
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\t'||LA32_0==' ') ) {
                alt32=1;
            }


            switch (alt32) {
        	case 1 :
        	    // TNSDL.g:
        	    {
        	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
        	        input.consume();
        	    failed=false;
        	    }
        	    else {
        	        if (backtracking>0) {failed=true; return ;}
        	        MismatchedSetException mse =
        	            new MismatchedSetException(null,input);
        	        recover(mse);    throw mse;
        	    }


        	    }
        	    break;

        	default :
        	    break loop32;
            }
        } while (true);

        // TNSDL.g:768:29: ( '\\r' )?
        int alt33=2;
        int LA33_0 = input.LA(1);

        if ( (LA33_0=='\r') ) {
            alt33=1;
        }
        switch (alt33) {
            case 1 :
                // TNSDL.g:768:30: '\\r'
                {
                match('\r'); if (failed) return ;

                }
                break;

        }

        match('\n'); if (failed) return ;
        // TNSDL.g:768:42: ( ' ' | '\\t' )*
        loop34:
        do {
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\t'||LA34_0==' ') ) {
                alt34=1;
            }


            switch (alt34) {
        	case 1 :
        	    // TNSDL.g:
        	    {
        	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
        	        input.consume();
        	    failed=false;
        	    }
        	    else {
        	        if (backtracking>0) {failed=true; return ;}
        	        MismatchedSetException mse =
        	            new MismatchedSetException(null,input);
        	        recover(mse);    throw mse;
        	    }


        	    }
        	    break;

        	default :
        	    break loop34;
            }
        } while (true);

        match('`'); if (failed) return ;
        match('`'); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\2\5\4\uffff";
    static final String DFA9_eofS =
        "\7\uffff";
    static final String DFA9_minS =
        "\1\60\2\56\4\uffff";
    static final String DFA9_maxS =
        "\1\71\1\170\1\71\4\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\4\1\3\1\2\1\1";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\11\2",
            "\1\6\1\uffff\12\2\10\uffff\1\3\25\uffff\1\4\11\uffff\1\3\25"+
            "\uffff\1\4",
            "\1\6\1\uffff\12\2",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "702:1: NumericLiteral : ( ( ( Digit )+ ( '.' ) )=> ( Digit )+ '.' ( Digit )* ( Exponent )? | ( Digit )+ | '0' ( 'X' | 'x' ) ( HexDigit )+ | '0' ( 'B' | 'b' ) ( Bit )+ );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_1=='B'||LA9_1=='b') ) {s = 3;}

                        else if ( (LA9_1=='X'||LA9_1=='x') ) {s = 4;}

                        else if ( ((LA9_1>='0' && LA9_1<='9')) ) {s = 2;}

                        else if ( (LA9_1=='.') && (synpred1())) {s = 6;}

                        else s = 5;

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA9_2>='0' && LA9_2<='9')) ) {s = 2;}

                        else if ( (LA9_2=='.') && (synpred1())) {s = 6;}

                        else s = 5;

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}