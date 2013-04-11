// $ANTLR 3.0.1 TNSDL.g 2007-10-18 10:54:01

package net.sourceforge.pmd.cpd.tnsdl;

import org.antlr.runtime.*;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class TNSDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CompilationUnit", "SystemDefinition", "SystemImpl", "SystemBlockDefinition", "SystemBlockImpl", "ServiceBlockDefinition", "ServiceBlockImpl", "ProgramBlockDefinition", "ProgramBlockImpl", "ProcessDefinition", "ModuleDefinition", "ModuleImpl", "ServiceDefinitions", "SynchronousServices", "AsynchronousServices", "SyncServiceLibrary", "AsyncServiceLibrary", "SystemImplDeclarations", "SynchronousDefinition", "LimitedSynchronousServices", "LimitedSynchronousDefinition", "ViewDefinition", "ViewDeclarationList", "ViewDeclaration", "AsynchronousDefinition", "AsynchronousServiceDefinitions", "AsynchronousServiceDefinition", "BehaviouralE3", "BehaviouralFactor", "BehaviouralFactor0", "SystemBlockReferences", "NameList", "UsualDefinition", "ExternalSynonymDefinition", "AlarmDeclarationList", "AlarmDeclaration", "AlarmAuxiliaryInfoList", "AlarmInfo", "ComparedFieldsList", "AlarmParameters", "SignalDeclarationList", "SignalDeclaration", "SignalFieldDeclarationList", "SignalFieldDeclaration", "TypeDefinition", "SimpleTypeDefinition", "GeneratorDefinition", "GeneratorFormals", "GeneratorFormal", "HasList", "HasClause", "Properties", "OperatorSignatureList", "OperatorSignature", "TypedParameterList0", "TypedPrameterList", "TypedParameter", "OptCallingSequence", "StackingDirection", "CallingMethod", "ConstantDeclarationList", "ConstantDeclaration", "Factor", "Designator", "ExpressionList", "StructurePrimary", "SimpleTypeDefinitions", "RepresentationClause", "UserGeneratorInstantiation", "GeneratorActuals", "GroundTypeExpression", "IntegerSubrange", "Enumeration", "EnumConstDeclarationsPart", "EnumConstDecCommaList", "EnumConstDecSemicList", "EnumConstDeclaration", "StructDeclaration", "FieldDeclarationList", "FieldDeclaration", "BitStructDeclaration", "BitFieldDeclarationList", "BitFieldDeclaration", "UnionDeclaration", "TaggedFieldDeclarationList", "TaggedFieldDeclaration", "ElseFieldOpt", "PredefinedTypeGeneratorInstantiation", "ArrayDeclaration", "PointerDeclaration", "BitsDeclaration", "SubscriptDeclarations", "SubscriptDeclaration", "ProvidesPart", "UsesPart", "IndicatesPart", "AcceptsPart", "SystemBlockImplDeclarations", "SystemBlockImplDeclaration", "ServiceBlockReference", "NumberOfInstances", "ProcessFormalParameters", "ProcessFormalDeclarations", "ProcessFormalDeclaration", "ValidInputSignalSet", "ProcessDeclarations", "ProcessLocals", "ProcessLocal", "VariableDefinition", "VariableModifier", "VariableDeclarationList", "VariableDeclaration", "WarmingSpecification", "TimerDefinition", "OptTimerAttribute", "TimerDeclarationList", "TimerDeclaration", "TypedParameterList", "ProcedureDefinition", "ProcedureFormalParameters", "ProcedureFormalDeclarations", "ProcedureFormalDeclaration", "ProcedureResult", "ProcedureDeclarations", "ProcedureLocals", "ProcedureLocal", "ProcessBodyOrDecomposition", "ProcessBody", "Transition", "ActionStatementList", "ActionStatement", "Label", "Action", "TaskBody", "AsignmentStatementList", "AssignmentStatement", "ActualParameters", "OutputBody", "SignalPacketList", "SignalPacket", "OutputSignalParameters", "OptOutputAttributes", "OutputAttributeList", "OutputAttribute", "CreateRequest", "CreateOptions", "CreateOption", "CreateOptionList", "OptTimeQuota", "SpecificProcess", "DecisionBody", "AnswerPartList", "AnswerPart", "ModuleImplDeclaration", "ModuleImplDeclarations", "ModuleReferences", "DatabaseReferences", "ProcessSignature", "ProcessSignatures", "SlaveProcessReferences", "MasterProcessReference", "ProcessReferences", "ProgramBlockImplDeclaration", "ProgramBlockImplDeclarations", "ProgramBlockReferences", "ServiceBlockImplDeclaration", "SubautomatonDefinition", "SubautomatonDecomposition", "OptStateListing", "SaveList", "SavePart", "VariableDefinitionList", "OptVariableDefinitionList", "ReceptionParameter", "ReceptionParameterList", "ReceptionParameterDef", "ReceptionList", "StimulusList", "Stimulus", "AsteriskSignalListing", "InputList", "InternalFlag", "InputPart", "InputOrSave", "NextStateLogics", "AsteriskStateListing", "StateListing", "OptReturnValue", "NextstateBody", "Terminator", "TerminatorStatement", "ProcedureCall", "AlarmReset", "ResetStatement", "ResetStatementList", "ResetStatementListOrAlarmReset", "ActionReset", "AlarmRange", "OptTransition", "RangeList", "Range", "ClosedRange", "OpenRange", "RelationSymbol", "ElsePart", "WhileLoop", "OptOutLabel", "TransitionOption", "SetStatementList", "SetStatement", "EqualsSign", "NotEqualsSign", "LessThanSign", "GreaterThanSign", "LessThanOrEqualsSign", "GreaterThanOrEqualsSign", "Colon", "OR", "XOR", "ImpliesSign", "AND", "BitwiseOr", "BitwiseXor", "BitwiseAnd", "BitwiseLeftShift", "BitwiseRightShift", "PlusSign", "Hyphen", "Asterisk", "Solidus", "MOD", "BitwiseNot", "NOT", "LeftParenthesis", "RightParenthesis", "ATail", "StringConstant", "SIZEOF", "IntegerConstant", "RealConstant", "Dollar", "Dot", "ResultSign", "Name", "Comma", "CompositeBeginSign", "CompositeEndSign", "TYPE", "ENDTYPE", "COMMENT", "Semicolon", "ABSTRACT", "OPERATORS", "PROCEDURE", "VariableParameterSign", "MACRO", "IN", "OUT", "VIEWED", "CONSTANT", "ENUM", "ENDENUM", "PACKED", "STRUCT", "ENDSTRUCT", "BITSTRUCT", "ENDBITSTRUCT", "UNION", "OF", "ENDUNION", "ELSE", "ARRAY", "POINTER", "BITS", "NEAR", "FAR", "REPRESENTATION", "Letter", "Digit", "PreprocDirective", "Exponent", "HexDigit", "Bit", "NumericLiteral", "ShorterStringConstant", "LongerStringConstant", "Escape", "WS", "Comment", "InterleavingSign", "IsAssignedSign", "ChoiceSign", "DisablingSign", "ExclamationMark", "QuotationMark", "QuestionMark", "ACCEPTS", "ADDING", "ALARM", "ALL", "ALTERNATIVE", "ASYNC", "AXIOMS", "CALL", "COMMANDS", "CREATE", "DATABASE", "DCL", "DECISION", "DISTRIBUTED", "ENDALTERNATIVE", "ENDDECISION", "ENDGENERATOR", "ENDIMPLEMENTATION", "ENDLIBRARY", "ENDMACRO", "ENDMODULE", "ENDPROCEDURE", "ENDPROCESS", "ENDPROGRAMBLOCK", "ENDSELECT", "ENDSERVICEBLOCK", "ENDSTATE", "ENDSUBAUTOMATON", "ENDSYSTEM", "ENDSYSTEMBLOCK", "ENDWHILE", "EXIT", "EXTERNAL", "FPAR", "GENERATOR", "HAS", "IF", "INHERITS", "INTERNAL", "IMPLEMENTATION", "INDICATES", "INPUT", "JOIN", "LIBRARY", "LITERALS", "MACRODEFINITION", "MACROID", "MASTER", "MODULE", "NEXTSTATE", "OUTPUT", "PROCESS", "PROGRAMBLOCK", "PROVIDED", "PROVIDES", "RESET", "RETURN", "RETURNS", "REVEALED", "SAVE", "SELECT", "SERVICEBLOCK", "SERVICES", "SET", "SIGNAL", "SIGNALSET", "SKIP", "START", "STATE", "STOP", "SUBAUTOMATON", "SYNC", "SYNONYM", "SYSTEM", "SYSTEMBLOCK", "TASK", "TIMER", "TO", "USES", "WHERE", "WHILE", "WITHWARMING"
    };
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
    public static final int OptReturnValue=191;
    public static final int RETURN=356;
    public static final int BehaviouralE3=31;
    public static final int DisablingSign=296;
    public static final int ENDTYPE=252;
    public static final int Dollar=244;
    public static final int BehaviouralFactor0=33;
    public static final int StackingDirection=62;
    public static final int BitwiseNot=235;
    public static final int BITSTRUCT=269;
    public static final int ModuleImpl=15;
    public static final int STOP=369;
    public static final int Action=136;
    public static final int WhileLoop=209;
    public static final int GENERATOR=334;
    public static final int Range=204;
    public static final int ProcedureDefinition=122;
    public static final int PACKED=266;
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
    public static final int ProcessFormalDeclaration=107;
    public static final int SYSTEM=373;
    public static final int INHERITS=337;
    public static final int SignalDeclarationList=44;
    public static final int SubscriptDeclaration=96;
    public static final int ProcedureCall=195;
    public static final int OptCallingSequence=61;
    public static final int COMMENT=253;
    public static final int SELECT=360;
    public static final int ENDALTERNATIVE=314;
    public static final int EnumConstDeclarationsPart=77;
    public static final int ATail=239;
    public static final int ARRAY=275;
    public static final int ENDBITSTRUCT=270;
    public static final int EXIT=331;
    public static final int AsynchronousServices=18;
    public static final int Colon=220;
    public static final int TaskBody=137;
    public static final int InputOrSave=187;
    public static final int OF=272;
    public static final int ProcedureLocal=129;
    public static final int StimulusList=181;
    public static final int SystemBlockImplDeclaration=102;
    public static final int ServiceDefinitions=16;
    public static final int ExternalSynonymDefinition=37;
    public static final int ENDSYSTEMBLOCK=329;
    public static final int ENDIMPLEMENTATION=317;
    public static final int OR=221;
    public static final int SIZEOF=241;
    public static final int HasList=53;
    public static final int OutputBody=141;
    public static final int SystemBlockDefinition=7;
    public static final int ENDPROCEDURE=321;
    public static final int GreaterThanOrEqualsSign=219;
    public static final int Letter=281;
    public static final int OUTPUT=350;
    public static final int FieldDeclaration=83;
    public static final int WHERE=379;
    public static final int SystemBlockReferences=34;
    public static final int StructDeclaration=81;
    public static final int LimitedSynchronousDefinition=24;
    public static final int ABSTRACT=255;
    public static final int ConstantDeclaration=65;
    public static final int ENDSTATE=326;
    public static final int ALARM=302;
    public static final int ModuleImplDeclaration=157;
    public static final int IndicatesPart=99;
    public static final int IF=336;
    public static final int PreprocDirective=283;
    public static final int InternalFlag=185;
    public static final int IN=260;
    public static final int Factor=66;
    public static final int ReceptionParameterDef=179;
    public static final int ENDMODULE=320;
    public static final int OPERATORS=256;
    public static final int CreateOptions=149;
    public static final int BitsDeclaration=94;
    public static final int SyncServiceLibrary=19;
    public static final int ChoiceSign=295;
    public static final int ServiceBlockReference=103;
    public static final int Asterisk=232;
    public static final int OperatorSignatureList=56;
    public static final int DCL=311;
    public static final int ENDPROCESS=322;
    public static final int ElsePart=208;
    public static final int TimerDeclarationList=119;
    public static final int SAVE=359;
    public static final int CreateRequest=148;
    public static final int AlarmParameters=43;
    public static final int PROCEDURE=257;
    public static final int ResultSign=246;
    public static final int OutputAttribute=147;
    public static final int SystemDefinition=5;
    public static final int DecisionBody=154;
    public static final int VariableParameterSign=258;
    public static final int UsualDefinition=36;
    public static final int ImpliesSign=223;
    public static final int BitFieldDeclaration=86;
    public static final int SetStatementList=212;
    public static final int ALTERNATIVE=304;
    public static final int ProgramBlockImpl=12;
    public static final int QuestionMark=299;
    public static final int SIGNALSET=365;
    public static final int UserGeneratorInstantiation=72;
    public static final int UnionDeclaration=87;
    public static final int OptTimeQuota=152;
    public static final int AlarmDeclaration=39;
    public static final int SlaveProcessReferences=163;
    public static final int GeneratorActuals=73;
    public static final int MOD=234;
    public static final int GeneratorFormal=52;
    public static final int VariableDefinitionList=175;
    public static final int AsignmentStatementList=138;
    public static final int IntegerConstant=242;
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

        public TNSDLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[178+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "TNSDL.g"; }


    public static class relationSymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationSymbol
    // TNSDL.g:170:1: relationSymbol : ( EqualsSign -> ^( RelationSymbol EqualsSign ) | NotEqualsSign -> ^( RelationSymbol NotEqualsSign ) | LessThanSign -> ^( RelationSymbol LessThanSign ) | GreaterThanSign -> ^( RelationSymbol GreaterThanSign ) | LessThanOrEqualsSign -> ^( RelationSymbol LessThanOrEqualsSign ) | GreaterThanOrEqualsSign -> ^( RelationSymbol GreaterThanOrEqualsSign ) );
    public final relationSymbol_return relationSymbol() throws RecognitionException {
        relationSymbol_return retval = new relationSymbol_return();
        retval.start = input.LT(1);
        int relationSymbol_StartIndex = input.index();
        Object root_0 = null;

        Token EqualsSign1=null;
        Token NotEqualsSign2=null;
        Token LessThanSign3=null;
        Token GreaterThanSign4=null;
        Token LessThanOrEqualsSign5=null;
        Token GreaterThanOrEqualsSign6=null;

        Object EqualsSign1_tree=null;
        Object NotEqualsSign2_tree=null;
        Object LessThanSign3_tree=null;
        Object GreaterThanSign4_tree=null;
        Object LessThanOrEqualsSign5_tree=null;
        Object GreaterThanOrEqualsSign6_tree=null;
        RewriteRuleTokenStream stream_LessThanOrEqualsSign=new RewriteRuleTokenStream(adaptor,"token LessThanOrEqualsSign");
        RewriteRuleTokenStream stream_GreaterThanOrEqualsSign=new RewriteRuleTokenStream(adaptor,"token GreaterThanOrEqualsSign");
        RewriteRuleTokenStream stream_GreaterThanSign=new RewriteRuleTokenStream(adaptor,"token GreaterThanSign");
        RewriteRuleTokenStream stream_EqualsSign=new RewriteRuleTokenStream(adaptor,"token EqualsSign");
        RewriteRuleTokenStream stream_LessThanSign=new RewriteRuleTokenStream(adaptor,"token LessThanSign");
        RewriteRuleTokenStream stream_NotEqualsSign=new RewriteRuleTokenStream(adaptor,"token NotEqualsSign");

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // TNSDL.g:170:15: ( EqualsSign -> ^( RelationSymbol EqualsSign ) | NotEqualsSign -> ^( RelationSymbol NotEqualsSign ) | LessThanSign -> ^( RelationSymbol LessThanSign ) | GreaterThanSign -> ^( RelationSymbol GreaterThanSign ) | LessThanOrEqualsSign -> ^( RelationSymbol LessThanOrEqualsSign ) | GreaterThanOrEqualsSign -> ^( RelationSymbol GreaterThanOrEqualsSign ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt1=1;
                }
                break;
            case NotEqualsSign:
                {
                alt1=2;
                }
                break;
            case LessThanSign:
                {
                alt1=3;
                }
                break;
            case GreaterThanSign:
                {
                alt1=4;
                }
                break;
            case LessThanOrEqualsSign:
                {
                alt1=5;
                }
                break;
            case GreaterThanOrEqualsSign:
                {
                alt1=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("170:1: relationSymbol : ( EqualsSign -> ^( RelationSymbol EqualsSign ) | NotEqualsSign -> ^( RelationSymbol NotEqualsSign ) | LessThanSign -> ^( RelationSymbol LessThanSign ) | GreaterThanSign -> ^( RelationSymbol GreaterThanSign ) | LessThanOrEqualsSign -> ^( RelationSymbol LessThanOrEqualsSign ) | GreaterThanOrEqualsSign -> ^( RelationSymbol GreaterThanOrEqualsSign ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // TNSDL.g:171:2: EqualsSign
                    {
                    EqualsSign1=(Token)input.LT(1);
                    match(input,EqualsSign,FOLLOW_EqualsSign_in_relationSymbol742); if (failed) return retval;
                    if ( backtracking==0 ) stream_EqualsSign.add(EqualsSign1);


                    // AST REWRITE
                    // elements: EqualsSign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:14: -> ^( RelationSymbol EqualsSign )
                    {
                        // TNSDL.g:171:17: ^( RelationSymbol EqualsSign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RelationSymbol, "RelationSymbol"), root_1);

                        adaptor.addChild(root_1, stream_EqualsSign.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:172:4: NotEqualsSign
                    {
                    NotEqualsSign2=(Token)input.LT(1);
                    match(input,NotEqualsSign,FOLLOW_NotEqualsSign_in_relationSymbol756); if (failed) return retval;
                    if ( backtracking==0 ) stream_NotEqualsSign.add(NotEqualsSign2);


                    // AST REWRITE
                    // elements: NotEqualsSign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:19: -> ^( RelationSymbol NotEqualsSign )
                    {
                        // TNSDL.g:172:22: ^( RelationSymbol NotEqualsSign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RelationSymbol, "RelationSymbol"), root_1);

                        adaptor.addChild(root_1, stream_NotEqualsSign.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:173:4: LessThanSign
                    {
                    LessThanSign3=(Token)input.LT(1);
                    match(input,LessThanSign,FOLLOW_LessThanSign_in_relationSymbol770); if (failed) return retval;
                    if ( backtracking==0 ) stream_LessThanSign.add(LessThanSign3);


                    // AST REWRITE
                    // elements: LessThanSign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:18: -> ^( RelationSymbol LessThanSign )
                    {
                        // TNSDL.g:173:21: ^( RelationSymbol LessThanSign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RelationSymbol, "RelationSymbol"), root_1);

                        adaptor.addChild(root_1, stream_LessThanSign.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 4 :
                    // TNSDL.g:174:4: GreaterThanSign
                    {
                    GreaterThanSign4=(Token)input.LT(1);
                    match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_relationSymbol784); if (failed) return retval;
                    if ( backtracking==0 ) stream_GreaterThanSign.add(GreaterThanSign4);


                    // AST REWRITE
                    // elements: GreaterThanSign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:21: -> ^( RelationSymbol GreaterThanSign )
                    {
                        // TNSDL.g:174:24: ^( RelationSymbol GreaterThanSign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RelationSymbol, "RelationSymbol"), root_1);

                        adaptor.addChild(root_1, stream_GreaterThanSign.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 5 :
                    // TNSDL.g:175:4: LessThanOrEqualsSign
                    {
                    LessThanOrEqualsSign5=(Token)input.LT(1);
                    match(input,LessThanOrEqualsSign,FOLLOW_LessThanOrEqualsSign_in_relationSymbol798); if (failed) return retval;
                    if ( backtracking==0 ) stream_LessThanOrEqualsSign.add(LessThanOrEqualsSign5);


                    // AST REWRITE
                    // elements: LessThanOrEqualsSign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:26: -> ^( RelationSymbol LessThanOrEqualsSign )
                    {
                        // TNSDL.g:175:29: ^( RelationSymbol LessThanOrEqualsSign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RelationSymbol, "RelationSymbol"), root_1);

                        adaptor.addChild(root_1, stream_LessThanOrEqualsSign.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 6 :
                    // TNSDL.g:176:4: GreaterThanOrEqualsSign
                    {
                    GreaterThanOrEqualsSign6=(Token)input.LT(1);
                    match(input,GreaterThanOrEqualsSign,FOLLOW_GreaterThanOrEqualsSign_in_relationSymbol812); if (failed) return retval;
                    if ( backtracking==0 ) stream_GreaterThanOrEqualsSign.add(GreaterThanOrEqualsSign6);


                    // AST REWRITE
                    // elements: GreaterThanOrEqualsSign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:29: -> ^( RelationSymbol GreaterThanOrEqualsSign )
                    {
                        // TNSDL.g:176:32: ^( RelationSymbol GreaterThanOrEqualsSign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RelationSymbol, "RelationSymbol"), root_1);

                        adaptor.addChild(root_1, stream_GreaterThanOrEqualsSign.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, relationSymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end relationSymbol

    public static class range_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start range
    // TNSDL.g:179:1: range : ( closedRange -> ^( Range closedRange ) | openRange -> ^( Range openRange ) );
    public final range_return range() throws RecognitionException {
        range_return retval = new range_return();
        retval.start = input.LT(1);
        int range_StartIndex = input.index();
        Object root_0 = null;

        closedRange_return closedRange7 = null;

        openRange_return openRange8 = null;


        RewriteRuleSubtreeStream stream_closedRange=new RewriteRuleSubtreeStream(adaptor,"rule closedRange");
        RewriteRuleSubtreeStream stream_openRange=new RewriteRuleSubtreeStream(adaptor,"rule openRange");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // TNSDL.g:179:6: ( closedRange -> ^( Range closedRange ) | openRange -> ^( Range openRange ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Hyphen||(LA2_0>=BitwiseNot && LA2_0<=LeftParenthesis)||(LA2_0>=ATail && LA2_0<=Dollar)||LA2_0==Name) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=EqualsSign && LA2_0<=GreaterThanOrEqualsSign)) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("179:1: range : ( closedRange -> ^( Range closedRange ) | openRange -> ^( Range openRange ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // TNSDL.g:180:2: closedRange
                    {
                    pushFollow(FOLLOW_closedRange_in_range830);
                    closedRange7=closedRange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_closedRange.add(closedRange7.getTree());

                    // AST REWRITE
                    // elements: closedRange
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:14: -> ^( Range closedRange )
                    {
                        // TNSDL.g:180:17: ^( Range closedRange )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Range, "Range"), root_1);

                        adaptor.addChild(root_1, stream_closedRange.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:180:40: openRange
                    {
                    pushFollow(FOLLOW_openRange_in_range842);
                    openRange8=openRange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_openRange.add(openRange8.getTree());

                    // AST REWRITE
                    // elements: openRange
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:51: -> ^( Range openRange )
                    {
                        // TNSDL.g:180:54: ^( Range openRange )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Range, "Range"), root_1);

                        adaptor.addChild(root_1, stream_openRange.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, range_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end range

    public static class closedRange_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start closedRange
    // TNSDL.g:183:1: closedRange : e1= constantExpression Colon e2= constantExpression -> ^( ClosedRange $e1 $e2) ;
    public final closedRange_return closedRange() throws RecognitionException {
        closedRange_return retval = new closedRange_return();
        retval.start = input.LT(1);
        int closedRange_StartIndex = input.index();
        Object root_0 = null;

        Token Colon9=null;
        constantExpression_return e1 = null;

        constantExpression_return e2 = null;


        Object Colon9_tree=null;
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // TNSDL.g:183:12: (e1= constantExpression Colon e2= constantExpression -> ^( ClosedRange $e1 $e2) )
            // TNSDL.g:184:2: e1= constantExpression Colon e2= constantExpression
            {
            pushFollow(FOLLOW_constantExpression_in_closedRange862);
            e1=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(e1.getTree());
            Colon9=(Token)input.LT(1);
            match(input,Colon,FOLLOW_Colon_in_closedRange864); if (failed) return retval;
            if ( backtracking==0 ) stream_Colon.add(Colon9);

            pushFollow(FOLLOW_constantExpression_in_closedRange868);
            e2=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(e2.getTree());

            // AST REWRITE
            // elements: e1, e2
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"token e2",e2!=null?e2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:52: -> ^( ClosedRange $e1 $e2)
            {
                // TNSDL.g:184:55: ^( ClosedRange $e1 $e2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ClosedRange, "ClosedRange"), root_1);

                adaptor.addChild(root_1, stream_e1.next());
                adaptor.addChild(root_1, stream_e2.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, closedRange_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end closedRange

    public static class openRange_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start openRange
    // TNSDL.g:187:1: openRange : relationSymbol expression -> ^( OpenRange relationSymbol expression ) ;
    public final openRange_return openRange() throws RecognitionException {
        openRange_return retval = new openRange_return();
        retval.start = input.LT(1);
        int openRange_StartIndex = input.index();
        Object root_0 = null;

        relationSymbol_return relationSymbol10 = null;

        expression_return expression11 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_relationSymbol=new RewriteRuleSubtreeStream(adaptor,"rule relationSymbol");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // TNSDL.g:187:10: ( relationSymbol expression -> ^( OpenRange relationSymbol expression ) )
            // TNSDL.g:188:2: relationSymbol expression
            {
            pushFollow(FOLLOW_relationSymbol_in_openRange889);
            relationSymbol10=relationSymbol();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_relationSymbol.add(relationSymbol10.getTree());
            pushFollow(FOLLOW_expression_in_openRange891);
            expression11=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression11.getTree());

            // AST REWRITE
            // elements: expression, relationSymbol
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:28: -> ^( OpenRange relationSymbol expression )
            {
                // TNSDL.g:188:31: ^( OpenRange relationSymbol expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OpenRange, "OpenRange"), root_1);

                adaptor.addChild(root_1, stream_relationSymbol.next());
                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, openRange_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end openRange

    public static class constantExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constantExpression
    // TNSDL.g:191:1: constantExpression : groundExpression ;
    public final constantExpression_return constantExpression() throws RecognitionException {
        constantExpression_return retval = new constantExpression_return();
        retval.start = input.LT(1);
        int constantExpression_StartIndex = input.index();
        Object root_0 = null;

        groundExpression_return groundExpression12 = null;



        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // TNSDL.g:191:19: ( groundExpression )
            // TNSDL.g:192:2: groundExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_groundExpression_in_constantExpression912);
            groundExpression12=groundExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, groundExpression12.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, constantExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantExpression

    public static class groundExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start groundExpression
    // TNSDL.g:195:1: groundExpression : expression ;
    public final groundExpression_return groundExpression() throws RecognitionException {
        groundExpression_return retval = new groundExpression_return();
        retval.start = input.LT(1);
        int groundExpression_StartIndex = input.index();
        Object root_0 = null;

        expression_return expression13 = null;



        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // TNSDL.g:195:17: ( expression )
            // TNSDL.g:196:2: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_groundExpression924);
            expression13=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression13.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, groundExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end groundExpression

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression
    // TNSDL.g:199:1: expression : exp0 ( ( OR | XOR | ImpliesSign ) exp0 )* ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Token OR15=null;
        Token XOR16=null;
        Token ImpliesSign17=null;
        exp0_return exp014 = null;

        exp0_return exp018 = null;


        Object OR15_tree=null;
        Object XOR16_tree=null;
        Object ImpliesSign17_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // TNSDL.g:199:11: ( exp0 ( ( OR | XOR | ImpliesSign ) exp0 )* )
            // TNSDL.g:200:2: exp0 ( ( OR | XOR | ImpliesSign ) exp0 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exp0_in_expression936);
            exp014=exp0();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exp014.getTree());
            // TNSDL.g:200:7: ( ( OR | XOR | ImpliesSign ) exp0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=OR && LA4_0<=ImpliesSign)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // TNSDL.g:200:8: ( OR | XOR | ImpliesSign ) exp0
            	    {
            	    // TNSDL.g:200:8: ( OR | XOR | ImpliesSign )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case OR:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case XOR:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case ImpliesSign:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("200:8: ( OR | XOR | ImpliesSign )", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // TNSDL.g:200:9: OR
            	            {
            	            OR15=(Token)input.LT(1);
            	            match(input,OR,FOLLOW_OR_in_expression940); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            OR15_tree = (Object)adaptor.create(OR15);
            	            root_0 = (Object)adaptor.becomeRoot(OR15_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TNSDL.g:200:13: XOR
            	            {
            	            XOR16=(Token)input.LT(1);
            	            match(input,XOR,FOLLOW_XOR_in_expression943); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            XOR16_tree = (Object)adaptor.create(XOR16);
            	            root_0 = (Object)adaptor.becomeRoot(XOR16_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // TNSDL.g:200:18: ImpliesSign
            	            {
            	            ImpliesSign17=(Token)input.LT(1);
            	            match(input,ImpliesSign,FOLLOW_ImpliesSign_in_expression946); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            ImpliesSign17_tree = (Object)adaptor.create(ImpliesSign17);
            	            root_0 = (Object)adaptor.becomeRoot(ImpliesSign17_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_exp0_in_expression950);
            	    exp018=exp0();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, exp018.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end expression

    public static class exp0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exp0
    // TNSDL.g:203:1: exp0 : exp1 ( AND exp1 )* ;
    public final exp0_return exp0() throws RecognitionException {
        exp0_return retval = new exp0_return();
        retval.start = input.LT(1);
        int exp0_StartIndex = input.index();
        Object root_0 = null;

        Token AND20=null;
        exp1_return exp119 = null;

        exp1_return exp121 = null;


        Object AND20_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // TNSDL.g:203:5: ( exp1 ( AND exp1 )* )
            // TNSDL.g:204:2: exp1 ( AND exp1 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exp1_in_exp0961);
            exp119=exp1();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exp119.getTree());
            // TNSDL.g:204:7: ( AND exp1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AND) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // TNSDL.g:204:8: AND exp1
            	    {
            	    AND20=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_exp0964); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    AND20_tree = (Object)adaptor.create(AND20);
            	    root_0 = (Object)adaptor.becomeRoot(AND20_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exp1_in_exp0967);
            	    exp121=exp1();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, exp121.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, exp0_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exp0

    public static class exp1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exp1
    // TNSDL.g:207:1: exp1 : exp2 ( ( GreaterThanSign | LessThanSign | GreaterThanOrEqualsSign | LessThanOrEqualsSign | NotEqualsSign | EqualsSign ) exp2 )* ;
    public final exp1_return exp1() throws RecognitionException {
        exp1_return retval = new exp1_return();
        retval.start = input.LT(1);
        int exp1_StartIndex = input.index();
        Object root_0 = null;

        Token GreaterThanSign23=null;
        Token LessThanSign24=null;
        Token GreaterThanOrEqualsSign25=null;
        Token LessThanOrEqualsSign26=null;
        Token NotEqualsSign27=null;
        Token EqualsSign28=null;
        exp2_return exp222 = null;

        exp2_return exp229 = null;


        Object GreaterThanSign23_tree=null;
        Object LessThanSign24_tree=null;
        Object GreaterThanOrEqualsSign25_tree=null;
        Object LessThanOrEqualsSign26_tree=null;
        Object NotEqualsSign27_tree=null;
        Object EqualsSign28_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // TNSDL.g:207:5: ( exp2 ( ( GreaterThanSign | LessThanSign | GreaterThanOrEqualsSign | LessThanOrEqualsSign | NotEqualsSign | EqualsSign ) exp2 )* )
            // TNSDL.g:208:2: exp2 ( ( GreaterThanSign | LessThanSign | GreaterThanOrEqualsSign | LessThanOrEqualsSign | NotEqualsSign | EqualsSign ) exp2 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exp2_in_exp1979);
            exp222=exp2();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exp222.getTree());
            // TNSDL.g:209:2: ( ( GreaterThanSign | LessThanSign | GreaterThanOrEqualsSign | LessThanOrEqualsSign | NotEqualsSign | EqualsSign ) exp2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=EqualsSign && LA7_0<=GreaterThanOrEqualsSign)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // TNSDL.g:210:2: ( GreaterThanSign | LessThanSign | GreaterThanOrEqualsSign | LessThanOrEqualsSign | NotEqualsSign | EqualsSign ) exp2
            	    {
            	    // TNSDL.g:210:2: ( GreaterThanSign | LessThanSign | GreaterThanOrEqualsSign | LessThanOrEqualsSign | NotEqualsSign | EqualsSign )
            	    int alt6=6;
            	    switch ( input.LA(1) ) {
            	    case GreaterThanSign:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case LessThanSign:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case GreaterThanOrEqualsSign:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case LessThanOrEqualsSign:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case NotEqualsSign:
            	        {
            	        alt6=5;
            	        }
            	        break;
            	    case EqualsSign:
            	        {
            	        alt6=6;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("210:2: ( GreaterThanSign | LessThanSign | GreaterThanOrEqualsSign | LessThanOrEqualsSign | NotEqualsSign | EqualsSign )", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // TNSDL.g:210:3: GreaterThanSign
            	            {
            	            GreaterThanSign23=(Token)input.LT(1);
            	            match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_exp1987); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GreaterThanSign23_tree = (Object)adaptor.create(GreaterThanSign23);
            	            root_0 = (Object)adaptor.becomeRoot(GreaterThanSign23_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TNSDL.g:211:3: LessThanSign
            	            {
            	            LessThanSign24=(Token)input.LT(1);
            	            match(input,LessThanSign,FOLLOW_LessThanSign_in_exp1992); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LessThanSign24_tree = (Object)adaptor.create(LessThanSign24);
            	            root_0 = (Object)adaptor.becomeRoot(LessThanSign24_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // TNSDL.g:212:3: GreaterThanOrEqualsSign
            	            {
            	            GreaterThanOrEqualsSign25=(Token)input.LT(1);
            	            match(input,GreaterThanOrEqualsSign,FOLLOW_GreaterThanOrEqualsSign_in_exp1997); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GreaterThanOrEqualsSign25_tree = (Object)adaptor.create(GreaterThanOrEqualsSign25);
            	            root_0 = (Object)adaptor.becomeRoot(GreaterThanOrEqualsSign25_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // TNSDL.g:213:3: LessThanOrEqualsSign
            	            {
            	            LessThanOrEqualsSign26=(Token)input.LT(1);
            	            match(input,LessThanOrEqualsSign,FOLLOW_LessThanOrEqualsSign_in_exp11002); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LessThanOrEqualsSign26_tree = (Object)adaptor.create(LessThanOrEqualsSign26);
            	            root_0 = (Object)adaptor.becomeRoot(LessThanOrEqualsSign26_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // TNSDL.g:214:3: NotEqualsSign
            	            {
            	            NotEqualsSign27=(Token)input.LT(1);
            	            match(input,NotEqualsSign,FOLLOW_NotEqualsSign_in_exp11007); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NotEqualsSign27_tree = (Object)adaptor.create(NotEqualsSign27);
            	            root_0 = (Object)adaptor.becomeRoot(NotEqualsSign27_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // TNSDL.g:215:3: EqualsSign
            	            {
            	            EqualsSign28=(Token)input.LT(1);
            	            match(input,EqualsSign,FOLLOW_EqualsSign_in_exp11012); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EqualsSign28_tree = (Object)adaptor.create(EqualsSign28);
            	            root_0 = (Object)adaptor.becomeRoot(EqualsSign28_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_exp2_in_exp11016);
            	    exp229=exp2();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, exp229.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, exp1_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exp1

    public static class exp2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exp2
    // TNSDL.g:218:1: exp2 : exp3 ( BitwiseOr exp3 )* ;
    public final exp2_return exp2() throws RecognitionException {
        exp2_return retval = new exp2_return();
        retval.start = input.LT(1);
        int exp2_StartIndex = input.index();
        Object root_0 = null;

        Token BitwiseOr31=null;
        exp3_return exp330 = null;

        exp3_return exp332 = null;


        Object BitwiseOr31_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // TNSDL.g:218:5: ( exp3 ( BitwiseOr exp3 )* )
            // TNSDL.g:219:2: exp3 ( BitwiseOr exp3 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exp3_in_exp21027);
            exp330=exp3();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exp330.getTree());
            // TNSDL.g:219:7: ( BitwiseOr exp3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BitwiseOr) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // TNSDL.g:219:8: BitwiseOr exp3
            	    {
            	    BitwiseOr31=(Token)input.LT(1);
            	    match(input,BitwiseOr,FOLLOW_BitwiseOr_in_exp21030); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BitwiseOr31_tree = (Object)adaptor.create(BitwiseOr31);
            	    root_0 = (Object)adaptor.becomeRoot(BitwiseOr31_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exp3_in_exp21033);
            	    exp332=exp3();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, exp332.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, exp2_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exp2

    public static class exp3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exp3
    // TNSDL.g:222:1: exp3 : exp4 ( BitwiseXor exp4 )* ;
    public final exp3_return exp3() throws RecognitionException {
        exp3_return retval = new exp3_return();
        retval.start = input.LT(1);
        int exp3_StartIndex = input.index();
        Object root_0 = null;

        Token BitwiseXor34=null;
        exp4_return exp433 = null;

        exp4_return exp435 = null;


        Object BitwiseXor34_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // TNSDL.g:222:5: ( exp4 ( BitwiseXor exp4 )* )
            // TNSDL.g:223:2: exp4 ( BitwiseXor exp4 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exp4_in_exp31044);
            exp433=exp4();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exp433.getTree());
            // TNSDL.g:223:7: ( BitwiseXor exp4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==BitwiseXor) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // TNSDL.g:223:8: BitwiseXor exp4
            	    {
            	    BitwiseXor34=(Token)input.LT(1);
            	    match(input,BitwiseXor,FOLLOW_BitwiseXor_in_exp31047); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BitwiseXor34_tree = (Object)adaptor.create(BitwiseXor34);
            	    root_0 = (Object)adaptor.becomeRoot(BitwiseXor34_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exp4_in_exp31050);
            	    exp435=exp4();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, exp435.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, exp3_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exp3

    public static class exp4_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exp4
    // TNSDL.g:226:1: exp4 : exp5 ( BitwiseAnd exp5 )* ;
    public final exp4_return exp4() throws RecognitionException {
        exp4_return retval = new exp4_return();
        retval.start = input.LT(1);
        int exp4_StartIndex = input.index();
        Object root_0 = null;

        Token BitwiseAnd37=null;
        exp5_return exp536 = null;

        exp5_return exp538 = null;


        Object BitwiseAnd37_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // TNSDL.g:226:5: ( exp5 ( BitwiseAnd exp5 )* )
            // TNSDL.g:227:2: exp5 ( BitwiseAnd exp5 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exp5_in_exp41061);
            exp536=exp5();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exp536.getTree());
            // TNSDL.g:227:7: ( BitwiseAnd exp5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==BitwiseAnd) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // TNSDL.g:227:8: BitwiseAnd exp5
            	    {
            	    BitwiseAnd37=(Token)input.LT(1);
            	    match(input,BitwiseAnd,FOLLOW_BitwiseAnd_in_exp41064); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BitwiseAnd37_tree = (Object)adaptor.create(BitwiseAnd37);
            	    root_0 = (Object)adaptor.becomeRoot(BitwiseAnd37_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_exp5_in_exp41067);
            	    exp538=exp5();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, exp538.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, exp4_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exp4

    public static class exp5_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exp5
    // TNSDL.g:230:1: exp5 : exp6 ( ( BitwiseLeftShift | BitwiseRightShift ) exp6 )* ;
    public final exp5_return exp5() throws RecognitionException {
        exp5_return retval = new exp5_return();
        retval.start = input.LT(1);
        int exp5_StartIndex = input.index();
        Object root_0 = null;

        Token BitwiseLeftShift40=null;
        Token BitwiseRightShift41=null;
        exp6_return exp639 = null;

        exp6_return exp642 = null;


        Object BitwiseLeftShift40_tree=null;
        Object BitwiseRightShift41_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // TNSDL.g:230:5: ( exp6 ( ( BitwiseLeftShift | BitwiseRightShift ) exp6 )* )
            // TNSDL.g:231:2: exp6 ( ( BitwiseLeftShift | BitwiseRightShift ) exp6 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exp6_in_exp51078);
            exp639=exp6();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exp639.getTree());
            // TNSDL.g:231:7: ( ( BitwiseLeftShift | BitwiseRightShift ) exp6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=BitwiseLeftShift && LA12_0<=BitwiseRightShift)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // TNSDL.g:231:8: ( BitwiseLeftShift | BitwiseRightShift ) exp6
            	    {
            	    // TNSDL.g:231:8: ( BitwiseLeftShift | BitwiseRightShift )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==BitwiseLeftShift) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==BitwiseRightShift) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("231:8: ( BitwiseLeftShift | BitwiseRightShift )", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // TNSDL.g:231:9: BitwiseLeftShift
            	            {
            	            BitwiseLeftShift40=(Token)input.LT(1);
            	            match(input,BitwiseLeftShift,FOLLOW_BitwiseLeftShift_in_exp51082); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BitwiseLeftShift40_tree = (Object)adaptor.create(BitwiseLeftShift40);
            	            root_0 = (Object)adaptor.becomeRoot(BitwiseLeftShift40_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TNSDL.g:231:27: BitwiseRightShift
            	            {
            	            BitwiseRightShift41=(Token)input.LT(1);
            	            match(input,BitwiseRightShift,FOLLOW_BitwiseRightShift_in_exp51085); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BitwiseRightShift41_tree = (Object)adaptor.create(BitwiseRightShift41);
            	            root_0 = (Object)adaptor.becomeRoot(BitwiseRightShift41_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_exp6_in_exp51089);
            	    exp642=exp6();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, exp642.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, exp5_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exp5

    public static class exp6_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exp6
    // TNSDL.g:234:1: exp6 : exp7 ( ( PlusSign | Hyphen ) exp7 )* ;
    public final exp6_return exp6() throws RecognitionException {
        exp6_return retval = new exp6_return();
        retval.start = input.LT(1);
        int exp6_StartIndex = input.index();
        Object root_0 = null;

        Token PlusSign44=null;
        Token Hyphen45=null;
        exp7_return exp743 = null;

        exp7_return exp746 = null;


        Object PlusSign44_tree=null;
        Object Hyphen45_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // TNSDL.g:234:5: ( exp7 ( ( PlusSign | Hyphen ) exp7 )* )
            // TNSDL.g:235:2: exp7 ( ( PlusSign | Hyphen ) exp7 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exp7_in_exp61100);
            exp743=exp7();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exp743.getTree());
            // TNSDL.g:235:7: ( ( PlusSign | Hyphen ) exp7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=PlusSign && LA14_0<=Hyphen)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // TNSDL.g:235:8: ( PlusSign | Hyphen ) exp7
            	    {
            	    // TNSDL.g:235:8: ( PlusSign | Hyphen )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==PlusSign) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==Hyphen) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("235:8: ( PlusSign | Hyphen )", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // TNSDL.g:235:9: PlusSign
            	            {
            	            PlusSign44=(Token)input.LT(1);
            	            match(input,PlusSign,FOLLOW_PlusSign_in_exp61104); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PlusSign44_tree = (Object)adaptor.create(PlusSign44);
            	            root_0 = (Object)adaptor.becomeRoot(PlusSign44_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TNSDL.g:235:19: Hyphen
            	            {
            	            Hyphen45=(Token)input.LT(1);
            	            match(input,Hyphen,FOLLOW_Hyphen_in_exp61107); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            Hyphen45_tree = (Object)adaptor.create(Hyphen45);
            	            root_0 = (Object)adaptor.becomeRoot(Hyphen45_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_exp7_in_exp61111);
            	    exp746=exp7();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, exp746.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, exp6_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exp6

    public static class exp7_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exp7
    // TNSDL.g:238:1: exp7 : factor ( ( Asterisk | Solidus | MOD ) factor )* ;
    public final exp7_return exp7() throws RecognitionException {
        exp7_return retval = new exp7_return();
        retval.start = input.LT(1);
        int exp7_StartIndex = input.index();
        Object root_0 = null;

        Token Asterisk48=null;
        Token Solidus49=null;
        Token MOD50=null;
        factor_return factor47 = null;

        factor_return factor51 = null;


        Object Asterisk48_tree=null;
        Object Solidus49_tree=null;
        Object MOD50_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // TNSDL.g:238:5: ( factor ( ( Asterisk | Solidus | MOD ) factor )* )
            // TNSDL.g:239:2: factor ( ( Asterisk | Solidus | MOD ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_exp71122);
            factor47=factor();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, factor47.getTree());
            // TNSDL.g:239:9: ( ( Asterisk | Solidus | MOD ) factor )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=Asterisk && LA16_0<=MOD)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // TNSDL.g:239:10: ( Asterisk | Solidus | MOD ) factor
            	    {
            	    // TNSDL.g:239:10: ( Asterisk | Solidus | MOD )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("239:10: ( Asterisk | Solidus | MOD )", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // TNSDL.g:239:11: Asterisk
            	            {
            	            Asterisk48=(Token)input.LT(1);
            	            match(input,Asterisk,FOLLOW_Asterisk_in_exp71126); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            Asterisk48_tree = (Object)adaptor.create(Asterisk48);
            	            root_0 = (Object)adaptor.becomeRoot(Asterisk48_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TNSDL.g:239:21: Solidus
            	            {
            	            Solidus49=(Token)input.LT(1);
            	            match(input,Solidus,FOLLOW_Solidus_in_exp71129); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            Solidus49_tree = (Object)adaptor.create(Solidus49);
            	            root_0 = (Object)adaptor.becomeRoot(Solidus49_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // TNSDL.g:239:30: MOD
            	            {
            	            MOD50=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_exp71132); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MOD50_tree = (Object)adaptor.create(MOD50);
            	            root_0 = (Object)adaptor.becomeRoot(MOD50_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_factor_in_exp71136);
            	    factor51=factor();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, factor51.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, exp7_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end exp7

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start factor
    // TNSDL.g:242:1: factor : ( Hyphen factor -> ^( Factor Hyphen factor ) | BitwiseNot factor -> ^( Factor BitwiseNot factor ) | NOT factor -> ^( Factor NOT factor ) | LeftParenthesis expression RightParenthesis -> ^( Factor expression ) | ATail identifierDesignator -> ^( Factor ATail identifierDesignator ) | ATail StringConstant -> ^( Factor ATail StringConstant ) | SIZEOF LeftParenthesis designator RightParenthesis -> ^( Factor SIZEOF designator ) | SIZEOF typeName -> ^( Factor SIZEOF typeName ) | designator -> ^( Factor designator ) | IntegerConstant -> ^( Factor IntegerConstant ) | RealConstant -> ^( Factor RealConstant ) | StringConstant -> ^( Factor StringConstant ) | structurePrimary -> ^( Factor structurePrimary ) );
    public final factor_return factor() throws RecognitionException {
        factor_return retval = new factor_return();
        retval.start = input.LT(1);
        int factor_StartIndex = input.index();
        Object root_0 = null;

        Token Hyphen52=null;
        Token BitwiseNot54=null;
        Token NOT56=null;
        Token LeftParenthesis58=null;
        Token RightParenthesis60=null;
        Token ATail61=null;
        Token ATail63=null;
        Token StringConstant64=null;
        Token SIZEOF65=null;
        Token LeftParenthesis66=null;
        Token RightParenthesis68=null;
        Token SIZEOF69=null;
        Token IntegerConstant72=null;
        Token RealConstant73=null;
        Token StringConstant74=null;
        factor_return factor53 = null;

        factor_return factor55 = null;

        factor_return factor57 = null;

        expression_return expression59 = null;

        identifierDesignator_return identifierDesignator62 = null;

        designator_return designator67 = null;

        typeName_return typeName70 = null;

        designator_return designator71 = null;

        structurePrimary_return structurePrimary75 = null;


        Object Hyphen52_tree=null;
        Object BitwiseNot54_tree=null;
        Object NOT56_tree=null;
        Object LeftParenthesis58_tree=null;
        Object RightParenthesis60_tree=null;
        Object ATail61_tree=null;
        Object ATail63_tree=null;
        Object StringConstant64_tree=null;
        Object SIZEOF65_tree=null;
        Object LeftParenthesis66_tree=null;
        Object RightParenthesis68_tree=null;
        Object SIZEOF69_tree=null;
        Object IntegerConstant72_tree=null;
        Object RealConstant73_tree=null;
        Object StringConstant74_tree=null;
        RewriteRuleTokenStream stream_SIZEOF=new RewriteRuleTokenStream(adaptor,"token SIZEOF");
        RewriteRuleTokenStream stream_StringConstant=new RewriteRuleTokenStream(adaptor,"token StringConstant");
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_Hyphen=new RewriteRuleTokenStream(adaptor,"token Hyphen");
        RewriteRuleTokenStream stream_IntegerConstant=new RewriteRuleTokenStream(adaptor,"token IntegerConstant");
        RewriteRuleTokenStream stream_BitwiseNot=new RewriteRuleTokenStream(adaptor,"token BitwiseNot");
        RewriteRuleTokenStream stream_RealConstant=new RewriteRuleTokenStream(adaptor,"token RealConstant");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleTokenStream stream_ATail=new RewriteRuleTokenStream(adaptor,"token ATail");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifierDesignator=new RewriteRuleSubtreeStream(adaptor,"rule identifierDesignator");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        RewriteRuleSubtreeStream stream_designator=new RewriteRuleSubtreeStream(adaptor,"rule designator");
        RewriteRuleSubtreeStream stream_structurePrimary=new RewriteRuleSubtreeStream(adaptor,"rule structurePrimary");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // TNSDL.g:242:7: ( Hyphen factor -> ^( Factor Hyphen factor ) | BitwiseNot factor -> ^( Factor BitwiseNot factor ) | NOT factor -> ^( Factor NOT factor ) | LeftParenthesis expression RightParenthesis -> ^( Factor expression ) | ATail identifierDesignator -> ^( Factor ATail identifierDesignator ) | ATail StringConstant -> ^( Factor ATail StringConstant ) | SIZEOF LeftParenthesis designator RightParenthesis -> ^( Factor SIZEOF designator ) | SIZEOF typeName -> ^( Factor SIZEOF typeName ) | designator -> ^( Factor designator ) | IntegerConstant -> ^( Factor IntegerConstant ) | RealConstant -> ^( Factor RealConstant ) | StringConstant -> ^( Factor StringConstant ) | structurePrimary -> ^( Factor structurePrimary ) )
            int alt17=13;
            switch ( input.LA(1) ) {
            case Hyphen:
                {
                alt17=1;
                }
                break;
            case BitwiseNot:
                {
                alt17=2;
                }
                break;
            case NOT:
                {
                alt17=3;
                }
                break;
            case LeftParenthesis:
                {
                alt17=4;
                }
                break;
            case ATail:
                {
                int LA17_5 = input.LA(2);

                if ( (LA17_5==StringConstant) ) {
                    alt17=6;
                }
                else if ( (LA17_5==Name) ) {
                    alt17=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("242:1: factor : ( Hyphen factor -> ^( Factor Hyphen factor ) | BitwiseNot factor -> ^( Factor BitwiseNot factor ) | NOT factor -> ^( Factor NOT factor ) | LeftParenthesis expression RightParenthesis -> ^( Factor expression ) | ATail identifierDesignator -> ^( Factor ATail identifierDesignator ) | ATail StringConstant -> ^( Factor ATail StringConstant ) | SIZEOF LeftParenthesis designator RightParenthesis -> ^( Factor SIZEOF designator ) | SIZEOF typeName -> ^( Factor SIZEOF typeName ) | designator -> ^( Factor designator ) | IntegerConstant -> ^( Factor IntegerConstant ) | RealConstant -> ^( Factor RealConstant ) | StringConstant -> ^( Factor StringConstant ) | structurePrimary -> ^( Factor structurePrimary ) );", 17, 5, input);

                    throw nvae;
                }
                }
                break;
            case SIZEOF:
                {
                int LA17_6 = input.LA(2);

                if ( (LA17_6==LeftParenthesis) ) {
                    alt17=7;
                }
                else if ( (LA17_6==Name) ) {
                    alt17=8;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("242:1: factor : ( Hyphen factor -> ^( Factor Hyphen factor ) | BitwiseNot factor -> ^( Factor BitwiseNot factor ) | NOT factor -> ^( Factor NOT factor ) | LeftParenthesis expression RightParenthesis -> ^( Factor expression ) | ATail identifierDesignator -> ^( Factor ATail identifierDesignator ) | ATail StringConstant -> ^( Factor ATail StringConstant ) | SIZEOF LeftParenthesis designator RightParenthesis -> ^( Factor SIZEOF designator ) | SIZEOF typeName -> ^( Factor SIZEOF typeName ) | designator -> ^( Factor designator ) | IntegerConstant -> ^( Factor IntegerConstant ) | RealConstant -> ^( Factor RealConstant ) | StringConstant -> ^( Factor StringConstant ) | structurePrimary -> ^( Factor structurePrimary ) );", 17, 6, input);

                    throw nvae;
                }
                }
                break;
            case Dollar:
                {
                alt17=9;
                }
                break;
            case Name:
                {
                int LA17_8 = input.LA(2);

                if ( (LA17_8==CompositeBeginSign) ) {
                    alt17=13;
                }
                else if ( (LA17_8==EOF||(LA17_8>=EqualsSign && LA17_8<=MOD)||(LA17_8>=LeftParenthesis && LA17_8<=RightParenthesis)||(LA17_8>=Dot && LA17_8<=ResultSign)||LA17_8==Comma||LA17_8==CompositeEndSign||(LA17_8>=COMMENT && LA17_8<=Semicolon)||LA17_8==ENDENUM) ) {
                    alt17=9;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("242:1: factor : ( Hyphen factor -> ^( Factor Hyphen factor ) | BitwiseNot factor -> ^( Factor BitwiseNot factor ) | NOT factor -> ^( Factor NOT factor ) | LeftParenthesis expression RightParenthesis -> ^( Factor expression ) | ATail identifierDesignator -> ^( Factor ATail identifierDesignator ) | ATail StringConstant -> ^( Factor ATail StringConstant ) | SIZEOF LeftParenthesis designator RightParenthesis -> ^( Factor SIZEOF designator ) | SIZEOF typeName -> ^( Factor SIZEOF typeName ) | designator -> ^( Factor designator ) | IntegerConstant -> ^( Factor IntegerConstant ) | RealConstant -> ^( Factor RealConstant ) | StringConstant -> ^( Factor StringConstant ) | structurePrimary -> ^( Factor structurePrimary ) );", 17, 8, input);

                    throw nvae;
                }
                }
                break;
            case IntegerConstant:
                {
                alt17=10;
                }
                break;
            case RealConstant:
                {
                alt17=11;
                }
                break;
            case StringConstant:
                {
                alt17=12;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("242:1: factor : ( Hyphen factor -> ^( Factor Hyphen factor ) | BitwiseNot factor -> ^( Factor BitwiseNot factor ) | NOT factor -> ^( Factor NOT factor ) | LeftParenthesis expression RightParenthesis -> ^( Factor expression ) | ATail identifierDesignator -> ^( Factor ATail identifierDesignator ) | ATail StringConstant -> ^( Factor ATail StringConstant ) | SIZEOF LeftParenthesis designator RightParenthesis -> ^( Factor SIZEOF designator ) | SIZEOF typeName -> ^( Factor SIZEOF typeName ) | designator -> ^( Factor designator ) | IntegerConstant -> ^( Factor IntegerConstant ) | RealConstant -> ^( Factor RealConstant ) | StringConstant -> ^( Factor StringConstant ) | structurePrimary -> ^( Factor structurePrimary ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // TNSDL.g:243:2: Hyphen factor
                    {
                    Hyphen52=(Token)input.LT(1);
                    match(input,Hyphen,FOLLOW_Hyphen_in_factor1147); if (failed) return retval;
                    if ( backtracking==0 ) stream_Hyphen.add(Hyphen52);

                    pushFollow(FOLLOW_factor_in_factor1149);
                    factor53=factor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_factor.add(factor53.getTree());

                    // AST REWRITE
                    // elements: factor, Hyphen
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:17: -> ^( Factor Hyphen factor )
                    {
                        // TNSDL.g:243:20: ^( Factor Hyphen factor )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_Hyphen.next());
                        adaptor.addChild(root_1, stream_factor.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:244:4: BitwiseNot factor
                    {
                    BitwiseNot54=(Token)input.LT(1);
                    match(input,BitwiseNot,FOLLOW_BitwiseNot_in_factor1165); if (failed) return retval;
                    if ( backtracking==0 ) stream_BitwiseNot.add(BitwiseNot54);

                    pushFollow(FOLLOW_factor_in_factor1167);
                    factor55=factor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_factor.add(factor55.getTree());

                    // AST REWRITE
                    // elements: BitwiseNot, factor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:22: -> ^( Factor BitwiseNot factor )
                    {
                        // TNSDL.g:244:25: ^( Factor BitwiseNot factor )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_BitwiseNot.next());
                        adaptor.addChild(root_1, stream_factor.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:245:4: NOT factor
                    {
                    NOT56=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_factor1182); if (failed) return retval;
                    if ( backtracking==0 ) stream_NOT.add(NOT56);

                    pushFollow(FOLLOW_factor_in_factor1184);
                    factor57=factor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_factor.add(factor57.getTree());

                    // AST REWRITE
                    // elements: factor, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:16: -> ^( Factor NOT factor )
                    {
                        // TNSDL.g:245:19: ^( Factor NOT factor )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_NOT.next());
                        adaptor.addChild(root_1, stream_factor.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 4 :
                    // TNSDL.g:246:4: LeftParenthesis expression RightParenthesis
                    {
                    LeftParenthesis58=(Token)input.LT(1);
                    match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_factor1200); if (failed) return retval;
                    if ( backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis58);

                    pushFollow(FOLLOW_expression_in_factor1202);
                    expression59=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expression.add(expression59.getTree());
                    RightParenthesis60=(Token)input.LT(1);
                    match(input,RightParenthesis,FOLLOW_RightParenthesis_in_factor1204); if (failed) return retval;
                    if ( backtracking==0 ) stream_RightParenthesis.add(RightParenthesis60);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:48: -> ^( Factor expression )
                    {
                        // TNSDL.g:246:51: ^( Factor expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_expression.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 5 :
                    // TNSDL.g:247:4: ATail identifierDesignator
                    {
                    ATail61=(Token)input.LT(1);
                    match(input,ATail,FOLLOW_ATail_in_factor1217); if (failed) return retval;
                    if ( backtracking==0 ) stream_ATail.add(ATail61);

                    pushFollow(FOLLOW_identifierDesignator_in_factor1219);
                    identifierDesignator62=identifierDesignator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_identifierDesignator.add(identifierDesignator62.getTree());

                    // AST REWRITE
                    // elements: identifierDesignator, ATail
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:31: -> ^( Factor ATail identifierDesignator )
                    {
                        // TNSDL.g:247:34: ^( Factor ATail identifierDesignator )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_ATail.next());
                        adaptor.addChild(root_1, stream_identifierDesignator.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 6 :
                    // TNSDL.g:248:4: ATail StringConstant
                    {
                    ATail63=(Token)input.LT(1);
                    match(input,ATail,FOLLOW_ATail_in_factor1234); if (failed) return retval;
                    if ( backtracking==0 ) stream_ATail.add(ATail63);

                    StringConstant64=(Token)input.LT(1);
                    match(input,StringConstant,FOLLOW_StringConstant_in_factor1236); if (failed) return retval;
                    if ( backtracking==0 ) stream_StringConstant.add(StringConstant64);


                    // AST REWRITE
                    // elements: ATail, StringConstant
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:26: -> ^( Factor ATail StringConstant )
                    {
                        // TNSDL.g:248:29: ^( Factor ATail StringConstant )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_ATail.next());
                        adaptor.addChild(root_1, stream_StringConstant.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 7 :
                    // TNSDL.g:249:4: SIZEOF LeftParenthesis designator RightParenthesis
                    {
                    SIZEOF65=(Token)input.LT(1);
                    match(input,SIZEOF,FOLLOW_SIZEOF_in_factor1252); if (failed) return retval;
                    if ( backtracking==0 ) stream_SIZEOF.add(SIZEOF65);

                    LeftParenthesis66=(Token)input.LT(1);
                    match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_factor1254); if (failed) return retval;
                    if ( backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis66);

                    pushFollow(FOLLOW_designator_in_factor1256);
                    designator67=designator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_designator.add(designator67.getTree());
                    RightParenthesis68=(Token)input.LT(1);
                    match(input,RightParenthesis,FOLLOW_RightParenthesis_in_factor1258); if (failed) return retval;
                    if ( backtracking==0 ) stream_RightParenthesis.add(RightParenthesis68);


                    // AST REWRITE
                    // elements: designator, SIZEOF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:56: -> ^( Factor SIZEOF designator )
                    {
                        // TNSDL.g:249:59: ^( Factor SIZEOF designator )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_SIZEOF.next());
                        adaptor.addChild(root_1, stream_designator.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 8 :
                    // TNSDL.g:250:4: SIZEOF typeName
                    {
                    SIZEOF69=(Token)input.LT(1);
                    match(input,SIZEOF,FOLLOW_SIZEOF_in_factor1274); if (failed) return retval;
                    if ( backtracking==0 ) stream_SIZEOF.add(SIZEOF69);

                    pushFollow(FOLLOW_typeName_in_factor1276);
                    typeName70=typeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeName.add(typeName70.getTree());

                    // AST REWRITE
                    // elements: SIZEOF, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:21: -> ^( Factor SIZEOF typeName )
                    {
                        // TNSDL.g:250:24: ^( Factor SIZEOF typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_SIZEOF.next());
                        adaptor.addChild(root_1, stream_typeName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 9 :
                    // TNSDL.g:251:4: designator
                    {
                    pushFollow(FOLLOW_designator_in_factor1292);
                    designator71=designator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_designator.add(designator71.getTree());

                    // AST REWRITE
                    // elements: designator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:16: -> ^( Factor designator )
                    {
                        // TNSDL.g:251:19: ^( Factor designator )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_designator.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 10 :
                    // TNSDL.g:252:4: IntegerConstant
                    {
                    IntegerConstant72=(Token)input.LT(1);
                    match(input,IntegerConstant,FOLLOW_IntegerConstant_in_factor1306); if (failed) return retval;
                    if ( backtracking==0 ) stream_IntegerConstant.add(IntegerConstant72);


                    // AST REWRITE
                    // elements: IntegerConstant
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:22: -> ^( Factor IntegerConstant )
                    {
                        // TNSDL.g:252:25: ^( Factor IntegerConstant )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_IntegerConstant.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 11 :
                    // TNSDL.g:253:4: RealConstant
                    {
                    RealConstant73=(Token)input.LT(1);
                    match(input,RealConstant,FOLLOW_RealConstant_in_factor1321); if (failed) return retval;
                    if ( backtracking==0 ) stream_RealConstant.add(RealConstant73);


                    // AST REWRITE
                    // elements: RealConstant
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:18: -> ^( Factor RealConstant )
                    {
                        // TNSDL.g:253:21: ^( Factor RealConstant )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_RealConstant.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 12 :
                    // TNSDL.g:254:4: StringConstant
                    {
                    StringConstant74=(Token)input.LT(1);
                    match(input,StringConstant,FOLLOW_StringConstant_in_factor1335); if (failed) return retval;
                    if ( backtracking==0 ) stream_StringConstant.add(StringConstant74);


                    // AST REWRITE
                    // elements: StringConstant
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:20: -> ^( Factor StringConstant )
                    {
                        // TNSDL.g:254:23: ^( Factor StringConstant )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_StringConstant.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 13 :
                    // TNSDL.g:255:4: structurePrimary
                    {
                    pushFollow(FOLLOW_structurePrimary_in_factor1349);
                    structurePrimary75=structurePrimary();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_structurePrimary.add(structurePrimary75.getTree());

                    // AST REWRITE
                    // elements: structurePrimary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 255:22: -> ^( Factor structurePrimary )
                    {
                        // TNSDL.g:255:25: ^( Factor structurePrimary )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Factor, "Factor"), root_1);

                        adaptor.addChild(root_1, stream_structurePrimary.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, factor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end factor

    public static class designator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start designator
    // TNSDL.g:258:1: designator : ( Dollar designator -> ^( Designator Dollar designator ) | identifierDesignator -> ^( Designator identifierDesignator ) );
    public final designator_return designator() throws RecognitionException {
        designator_return retval = new designator_return();
        retval.start = input.LT(1);
        int designator_StartIndex = input.index();
        Object root_0 = null;

        Token Dollar76=null;
        designator_return designator77 = null;

        identifierDesignator_return identifierDesignator78 = null;


        Object Dollar76_tree=null;
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleSubtreeStream stream_identifierDesignator=new RewriteRuleSubtreeStream(adaptor,"rule identifierDesignator");
        RewriteRuleSubtreeStream stream_designator=new RewriteRuleSubtreeStream(adaptor,"rule designator");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // TNSDL.g:258:11: ( Dollar designator -> ^( Designator Dollar designator ) | identifierDesignator -> ^( Designator identifierDesignator ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Dollar) ) {
                alt18=1;
            }
            else if ( (LA18_0==Name) ) {
                alt18=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("258:1: designator : ( Dollar designator -> ^( Designator Dollar designator ) | identifierDesignator -> ^( Designator identifierDesignator ) );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // TNSDL.g:259:2: Dollar designator
                    {
                    Dollar76=(Token)input.LT(1);
                    match(input,Dollar,FOLLOW_Dollar_in_designator1367); if (failed) return retval;
                    if ( backtracking==0 ) stream_Dollar.add(Dollar76);

                    pushFollow(FOLLOW_designator_in_designator1369);
                    designator77=designator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_designator.add(designator77.getTree());

                    // AST REWRITE
                    // elements: designator, Dollar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 259:20: -> ^( Designator Dollar designator )
                    {
                        // TNSDL.g:259:23: ^( Designator Dollar designator )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Designator, "Designator"), root_1);

                        adaptor.addChild(root_1, stream_Dollar.next());
                        adaptor.addChild(root_1, stream_designator.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:260:4: identifierDesignator
                    {
                    pushFollow(FOLLOW_identifierDesignator_in_designator1384);
                    identifierDesignator78=identifierDesignator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_identifierDesignator.add(identifierDesignator78.getTree());

                    // AST REWRITE
                    // elements: identifierDesignator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 260:25: -> ^( Designator identifierDesignator )
                    {
                        // TNSDL.g:260:28: ^( Designator identifierDesignator )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(Designator, "Designator"), root_1);

                        adaptor.addChild(root_1, stream_identifierDesignator.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, designator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end designator

    public static class identifierDesignator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start identifierDesignator
    // TNSDL.g:264:1: identifierDesignator : parametrizedIdentifier ( ( Dot | ResultSign ) parametrizedIdentifier )* ;
    public final identifierDesignator_return identifierDesignator() throws RecognitionException {
        identifierDesignator_return retval = new identifierDesignator_return();
        retval.start = input.LT(1);
        int identifierDesignator_StartIndex = input.index();
        Object root_0 = null;

        Token Dot80=null;
        Token ResultSign81=null;
        parametrizedIdentifier_return parametrizedIdentifier79 = null;

        parametrizedIdentifier_return parametrizedIdentifier82 = null;


        Object Dot80_tree=null;
        Object ResultSign81_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // TNSDL.g:264:21: ( parametrizedIdentifier ( ( Dot | ResultSign ) parametrizedIdentifier )* )
            // TNSDL.g:265:2: parametrizedIdentifier ( ( Dot | ResultSign ) parametrizedIdentifier )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parametrizedIdentifier_in_identifierDesignator1403);
            parametrizedIdentifier79=parametrizedIdentifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, parametrizedIdentifier79.getTree());
            // TNSDL.g:265:25: ( ( Dot | ResultSign ) parametrizedIdentifier )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=Dot && LA20_0<=ResultSign)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // TNSDL.g:265:27: ( Dot | ResultSign ) parametrizedIdentifier
            	    {
            	    // TNSDL.g:265:27: ( Dot | ResultSign )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==Dot) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==ResultSign) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("265:27: ( Dot | ResultSign )", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // TNSDL.g:265:28: Dot
            	            {
            	            Dot80=(Token)input.LT(1);
            	            match(input,Dot,FOLLOW_Dot_in_identifierDesignator1408); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            Dot80_tree = (Object)adaptor.create(Dot80);
            	            root_0 = (Object)adaptor.becomeRoot(Dot80_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TNSDL.g:265:33: ResultSign
            	            {
            	            ResultSign81=(Token)input.LT(1);
            	            match(input,ResultSign,FOLLOW_ResultSign_in_identifierDesignator1411); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            ResultSign81_tree = (Object)adaptor.create(ResultSign81);
            	            root_0 = (Object)adaptor.becomeRoot(ResultSign81_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_parametrizedIdentifier_in_identifierDesignator1415);
            	    parametrizedIdentifier82=parametrizedIdentifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, parametrizedIdentifier82.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, identifierDesignator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end identifierDesignator

    public static class parametrizedIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start parametrizedIdentifier
    // TNSDL.g:268:1: parametrizedIdentifier : ( ( Name LeftParenthesis )=> Name ( explicitParameters )+ | Name );
    public final parametrizedIdentifier_return parametrizedIdentifier() throws RecognitionException {
        parametrizedIdentifier_return retval = new parametrizedIdentifier_return();
        retval.start = input.LT(1);
        int parametrizedIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token Name83=null;
        Token Name85=null;
        explicitParameters_return explicitParameters84 = null;


        Object Name83_tree=null;
        Object Name85_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // TNSDL.g:268:23: ( ( Name LeftParenthesis )=> Name ( explicitParameters )+ | Name )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Name) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||(LA22_1>=EqualsSign && LA22_1<=MOD)||LA22_1==RightParenthesis||(LA22_1>=Dot && LA22_1<=ResultSign)||LA22_1==Comma||LA22_1==CompositeEndSign||(LA22_1>=COMMENT && LA22_1<=Semicolon)||LA22_1==ENDENUM) ) {
                    alt22=2;
                }
                else if ( (LA22_1==LeftParenthesis) && (synpred42())) {
                    alt22=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("268:1: parametrizedIdentifier : ( ( Name LeftParenthesis )=> Name ( explicitParameters )+ | Name );", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("268:1: parametrizedIdentifier : ( ( Name LeftParenthesis )=> Name ( explicitParameters )+ | Name );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // TNSDL.g:269:2: ( Name LeftParenthesis )=> Name ( explicitParameters )+
                    {
                    root_0 = (Object)adaptor.nil();

                    Name83=(Token)input.LT(1);
                    match(input,Name,FOLLOW_Name_in_parametrizedIdentifier1436); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Name83_tree = (Object)adaptor.create(Name83);
                    adaptor.addChild(root_0, Name83_tree);
                    }
                    // TNSDL.g:270:7: ( explicitParameters )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==LeftParenthesis) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // TNSDL.g:270:8: explicitParameters
                    	    {
                    	    pushFollow(FOLLOW_explicitParameters_in_parametrizedIdentifier1439);
                    	    explicitParameters84=explicitParameters();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, explicitParameters84.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // TNSDL.g:271:4: Name
                    {
                    root_0 = (Object)adaptor.nil();

                    Name85=(Token)input.LT(1);
                    match(input,Name,FOLLOW_Name_in_parametrizedIdentifier1446); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Name85_tree = (Object)adaptor.create(Name85);
                    adaptor.addChild(root_0, Name85_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, parametrizedIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end parametrizedIdentifier

    public static class typeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typeName
    // TNSDL.g:275:1: typeName : Name ;
    public final typeName_return typeName() throws RecognitionException {
        typeName_return retval = new typeName_return();
        retval.start = input.LT(1);
        int typeName_StartIndex = input.index();
        Object root_0 = null;

        Token Name86=null;

        Object Name86_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // TNSDL.g:275:9: ( Name )
            // TNSDL.g:277:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name86=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_typeName1457); if (failed) return retval;
            if ( backtracking==0 ) {
            Name86_tree = (Object)adaptor.create(Name86);
            adaptor.addChild(root_0, Name86_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, typeName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeName

    public static class explicitParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start explicitParameters
    // TNSDL.g:282:1: explicitParameters : ( LeftParenthesis RightParenthesis | LeftParenthesis expressionList RightParenthesis );
    public final explicitParameters_return explicitParameters() throws RecognitionException {
        explicitParameters_return retval = new explicitParameters_return();
        retval.start = input.LT(1);
        int explicitParameters_StartIndex = input.index();
        Object root_0 = null;

        Token LeftParenthesis87=null;
        Token RightParenthesis88=null;
        Token LeftParenthesis89=null;
        Token RightParenthesis91=null;
        expressionList_return expressionList90 = null;


        Object LeftParenthesis87_tree=null;
        Object RightParenthesis88_tree=null;
        Object LeftParenthesis89_tree=null;
        Object RightParenthesis91_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // TNSDL.g:282:19: ( LeftParenthesis RightParenthesis | LeftParenthesis expressionList RightParenthesis )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftParenthesis) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RightParenthesis) ) {
                    alt23=1;
                }
                else if ( (LA23_1==Hyphen||(LA23_1>=BitwiseNot && LA23_1<=LeftParenthesis)||(LA23_1>=ATail && LA23_1<=Dollar)||LA23_1==Name) ) {
                    alt23=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("282:1: explicitParameters : ( LeftParenthesis RightParenthesis | LeftParenthesis expressionList RightParenthesis );", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("282:1: explicitParameters : ( LeftParenthesis RightParenthesis | LeftParenthesis expressionList RightParenthesis );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // TNSDL.g:283:2: LeftParenthesis RightParenthesis
                    {
                    root_0 = (Object)adaptor.nil();

                    LeftParenthesis87=(Token)input.LT(1);
                    match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_explicitParameters1469); if (failed) return retval;
                    RightParenthesis88=(Token)input.LT(1);
                    match(input,RightParenthesis,FOLLOW_RightParenthesis_in_explicitParameters1472); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // TNSDL.g:284:4: LeftParenthesis expressionList RightParenthesis
                    {
                    root_0 = (Object)adaptor.nil();

                    LeftParenthesis89=(Token)input.LT(1);
                    match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_explicitParameters1478); if (failed) return retval;
                    pushFollow(FOLLOW_expressionList_in_explicitParameters1481);
                    expressionList90=expressionList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expressionList90.getTree());
                    RightParenthesis91=(Token)input.LT(1);
                    match(input,RightParenthesis,FOLLOW_RightParenthesis_in_explicitParameters1483); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, explicitParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end explicitParameters

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionList
    // TNSDL.g:288:1: expressionList : expression ( Comma expression )* -> ^( ExpressionList ( expression )+ ) ;
    public final expressionList_return expressionList() throws RecognitionException {
        expressionList_return retval = new expressionList_return();
        retval.start = input.LT(1);
        int expressionList_StartIndex = input.index();
        Object root_0 = null;

        Token Comma93=null;
        expression_return expression92 = null;

        expression_return expression94 = null;


        Object Comma93_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // TNSDL.g:288:15: ( expression ( Comma expression )* -> ^( ExpressionList ( expression )+ ) )
            // TNSDL.g:289:2: expression ( Comma expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList1494);
            expression92=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression92.getTree());
            // TNSDL.g:289:13: ( Comma expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // TNSDL.g:289:15: Comma expression
            	    {
            	    Comma93=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_expressionList1498); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma93);

            	    pushFollow(FOLLOW_expression_in_expressionList1500);
            	    expression94=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_expression.add(expression94.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 290:2: -> ^( ExpressionList ( expression )+ )
            {
                // TNSDL.g:290:5: ^( ExpressionList ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ExpressionList, "ExpressionList"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.next());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 22, expressionList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end expressionList

    public static class structurePrimary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start structurePrimary
    // TNSDL.g:293:1: structurePrimary : typeName CompositeBeginSign expressionList CompositeEndSign -> ^( StructurePrimary typeName expressionList ) ;
    public final structurePrimary_return structurePrimary() throws RecognitionException {
        structurePrimary_return retval = new structurePrimary_return();
        retval.start = input.LT(1);
        int structurePrimary_StartIndex = input.index();
        Object root_0 = null;

        Token CompositeBeginSign96=null;
        Token CompositeEndSign98=null;
        typeName_return typeName95 = null;

        expressionList_return expressionList97 = null;


        Object CompositeBeginSign96_tree=null;
        Object CompositeEndSign98_tree=null;
        RewriteRuleTokenStream stream_CompositeBeginSign=new RewriteRuleTokenStream(adaptor,"token CompositeBeginSign");
        RewriteRuleTokenStream stream_CompositeEndSign=new RewriteRuleTokenStream(adaptor,"token CompositeEndSign");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // TNSDL.g:293:17: ( typeName CompositeBeginSign expressionList CompositeEndSign -> ^( StructurePrimary typeName expressionList ) )
            // TNSDL.g:294:2: typeName CompositeBeginSign expressionList CompositeEndSign
            {
            pushFollow(FOLLOW_typeName_in_structurePrimary1524);
            typeName95=typeName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_typeName.add(typeName95.getTree());
            CompositeBeginSign96=(Token)input.LT(1);
            match(input,CompositeBeginSign,FOLLOW_CompositeBeginSign_in_structurePrimary1526); if (failed) return retval;
            if ( backtracking==0 ) stream_CompositeBeginSign.add(CompositeBeginSign96);

            pushFollow(FOLLOW_expressionList_in_structurePrimary1528);
            expressionList97=expressionList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expressionList.add(expressionList97.getTree());
            CompositeEndSign98=(Token)input.LT(1);
            match(input,CompositeEndSign,FOLLOW_CompositeEndSign_in_structurePrimary1530); if (failed) return retval;
            if ( backtracking==0 ) stream_CompositeEndSign.add(CompositeEndSign98);


            // AST REWRITE
            // elements: expressionList, typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:2: -> ^( StructurePrimary typeName expressionList )
            {
                // TNSDL.g:295:5: ^( StructurePrimary typeName expressionList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(StructurePrimary, "StructurePrimary"), root_1);

                adaptor.addChild(root_1, stream_typeName.next());
                adaptor.addChild(root_1, stream_expressionList.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, structurePrimary_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end structurePrimary

    public static class simpleTypeDefinitions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start simpleTypeDefinitions
    // TNSDL.g:298:1: simpleTypeDefinitions : ( simpleTypeDefinition )* -> ^( SimpleTypeDefinitions ( simpleTypeDefinition )* ) ;
    public final simpleTypeDefinitions_return simpleTypeDefinitions() throws RecognitionException {
        simpleTypeDefinitions_return retval = new simpleTypeDefinitions_return();
        retval.start = input.LT(1);
        int simpleTypeDefinitions_StartIndex = input.index();
        Object root_0 = null;

        simpleTypeDefinition_return simpleTypeDefinition99 = null;


        RewriteRuleSubtreeStream stream_simpleTypeDefinition=new RewriteRuleSubtreeStream(adaptor,"rule simpleTypeDefinition");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // TNSDL.g:298:22: ( ( simpleTypeDefinition )* -> ^( SimpleTypeDefinitions ( simpleTypeDefinition )* ) )
            // TNSDL.g:299:2: ( simpleTypeDefinition )*
            {
            // TNSDL.g:299:2: ( simpleTypeDefinition )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==TYPE||LA25_0==ABSTRACT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // TNSDL.g:0:0: simpleTypeDefinition
            	    {
            	    pushFollow(FOLLOW_simpleTypeDefinition_in_simpleTypeDefinitions1551);
            	    simpleTypeDefinition99=simpleTypeDefinition();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_simpleTypeDefinition.add(simpleTypeDefinition99.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // AST REWRITE
            // elements: simpleTypeDefinition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 300:2: -> ^( SimpleTypeDefinitions ( simpleTypeDefinition )* )
            {
                // TNSDL.g:300:5: ^( SimpleTypeDefinitions ( simpleTypeDefinition )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SimpleTypeDefinitions, "SimpleTypeDefinitions"), root_1);

                // TNSDL.g:300:29: ( simpleTypeDefinition )*
                while ( stream_simpleTypeDefinition.hasNext() ) {
                    adaptor.addChild(root_1, stream_simpleTypeDefinition.next());

                }
                stream_simpleTypeDefinition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, simpleTypeDefinitions_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end simpleTypeDefinitions

    public static class simpleTypeDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start simpleTypeDefinition
    // TNSDL.g:303:1: simpleTypeDefinition : ( abstFlag )? TYPE typeName properties ENDTYPE ( nameReminder )? end -> ^( SimpleTypeDefinition ( abstFlag )? typeName properties end ) ;
    public final simpleTypeDefinition_return simpleTypeDefinition() throws RecognitionException {
        simpleTypeDefinition_return retval = new simpleTypeDefinition_return();
        retval.start = input.LT(1);
        int simpleTypeDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token TYPE101=null;
        Token ENDTYPE104=null;
        abstFlag_return abstFlag100 = null;

        typeName_return typeName102 = null;

        properties_return properties103 = null;

        nameReminder_return nameReminder105 = null;

        end_return end106 = null;


        Object TYPE101_tree=null;
        Object ENDTYPE104_tree=null;
        RewriteRuleTokenStream stream_ENDTYPE=new RewriteRuleTokenStream(adaptor,"token ENDTYPE");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_nameReminder=new RewriteRuleSubtreeStream(adaptor,"rule nameReminder");
        RewriteRuleSubtreeStream stream_abstFlag=new RewriteRuleSubtreeStream(adaptor,"rule abstFlag");
        RewriteRuleSubtreeStream stream_properties=new RewriteRuleSubtreeStream(adaptor,"rule properties");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // TNSDL.g:303:21: ( ( abstFlag )? TYPE typeName properties ENDTYPE ( nameReminder )? end -> ^( SimpleTypeDefinition ( abstFlag )? typeName properties end ) )
            // TNSDL.g:305:2: ( abstFlag )? TYPE typeName properties ENDTYPE ( nameReminder )? end
            {
            // TNSDL.g:305:2: ( abstFlag )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ABSTRACT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // TNSDL.g:0:0: abstFlag
                    {
                    pushFollow(FOLLOW_abstFlag_in_simpleTypeDefinition1575);
                    abstFlag100=abstFlag();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_abstFlag.add(abstFlag100.getTree());

                    }
                    break;

            }

            TYPE101=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_simpleTypeDefinition1578); if (failed) return retval;
            if ( backtracking==0 ) stream_TYPE.add(TYPE101);

            pushFollow(FOLLOW_typeName_in_simpleTypeDefinition1580);
            typeName102=typeName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_typeName.add(typeName102.getTree());
            pushFollow(FOLLOW_properties_in_simpleTypeDefinition1583);
            properties103=properties();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_properties.add(properties103.getTree());
            ENDTYPE104=(Token)input.LT(1);
            match(input,ENDTYPE,FOLLOW_ENDTYPE_in_simpleTypeDefinition1586); if (failed) return retval;
            if ( backtracking==0 ) stream_ENDTYPE.add(ENDTYPE104);

            // TNSDL.g:307:10: ( nameReminder )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Name) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // TNSDL.g:0:0: nameReminder
                    {
                    pushFollow(FOLLOW_nameReminder_in_simpleTypeDefinition1588);
                    nameReminder105=nameReminder();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_nameReminder.add(nameReminder105.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_end_in_simpleTypeDefinition1591);
            end106=end();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_end.add(end106.getTree());

            // AST REWRITE
            // elements: abstFlag, end, properties, typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 308:2: -> ^( SimpleTypeDefinition ( abstFlag )? typeName properties end )
            {
                // TNSDL.g:308:5: ^( SimpleTypeDefinition ( abstFlag )? typeName properties end )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SimpleTypeDefinition, "SimpleTypeDefinition"), root_1);

                // TNSDL.g:308:28: ( abstFlag )?
                if ( stream_abstFlag.hasNext() ) {
                    adaptor.addChild(root_1, stream_abstFlag.next());

                }
                stream_abstFlag.reset();
                adaptor.addChild(root_1, stream_typeName.next());
                adaptor.addChild(root_1, stream_properties.next());
                adaptor.addChild(root_1, stream_end.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 25, simpleTypeDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end simpleTypeDefinition

    public static class nameReminder_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nameReminder
    // TNSDL.g:313:1: nameReminder : Name ;
    public final nameReminder_return nameReminder() throws RecognitionException {
        nameReminder_return retval = new nameReminder_return();
        retval.start = input.LT(1);
        int nameReminder_StartIndex = input.index();
        Object root_0 = null;

        Token Name107=null;

        Object Name107_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // TNSDL.g:313:13: ( Name )
            // TNSDL.g:315:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name107=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_nameReminder1620); if (failed) return retval;
            if ( backtracking==0 ) {
            Name107_tree = (Object)adaptor.create(Name107);
            adaptor.addChild(root_0, Name107_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, nameReminder_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end nameReminder

    public static class end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start end
    // TNSDL.g:319:1: end : ( COMMENT StringConstant )? Semicolon ;
    public final end_return end() throws RecognitionException {
        end_return retval = new end_return();
        retval.start = input.LT(1);
        int end_StartIndex = input.index();
        Object root_0 = null;

        Token COMMENT108=null;
        Token StringConstant109=null;
        Token Semicolon110=null;

        Object COMMENT108_tree=null;
        Object StringConstant109_tree=null;
        Object Semicolon110_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // TNSDL.g:319:4: ( ( COMMENT StringConstant )? Semicolon )
            // TNSDL.g:320:2: ( COMMENT StringConstant )? Semicolon
            {
            root_0 = (Object)adaptor.nil();

            // TNSDL.g:320:2: ( COMMENT StringConstant )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==COMMENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // TNSDL.g:320:3: COMMENT StringConstant
                    {
                    COMMENT108=(Token)input.LT(1);
                    match(input,COMMENT,FOLLOW_COMMENT_in_end1635); if (failed) return retval;
                    if ( backtracking==0 ) {
                    COMMENT108_tree = (Object)adaptor.create(COMMENT108);
                    root_0 = (Object)adaptor.becomeRoot(COMMENT108_tree, root_0);
                    }
                    StringConstant109=(Token)input.LT(1);
                    match(input,StringConstant,FOLLOW_StringConstant_in_end1638); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringConstant109_tree = (Object)adaptor.create(StringConstant109);
                    adaptor.addChild(root_0, StringConstant109_tree);
                    }

                    }
                    break;

            }

            Semicolon110=(Token)input.LT(1);
            match(input,Semicolon,FOLLOW_Semicolon_in_end1643); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, end_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end end

    public static class abstFlag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start abstFlag
    // TNSDL.g:324:1: abstFlag : ABSTRACT ;
    public final abstFlag_return abstFlag() throws RecognitionException {
        abstFlag_return retval = new abstFlag_return();
        retval.start = input.LT(1);
        int abstFlag_StartIndex = input.index();
        Object root_0 = null;

        Token ABSTRACT111=null;

        Object ABSTRACT111_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // TNSDL.g:324:9: ( ABSTRACT )
            // TNSDL.g:326:2: ABSTRACT
            {
            root_0 = (Object)adaptor.nil();

            ABSTRACT111=(Token)input.LT(1);
            match(input,ABSTRACT,FOLLOW_ABSTRACT_in_abstFlag1661); if (failed) return retval;
            if ( backtracking==0 ) {
            ABSTRACT111_tree = (Object)adaptor.create(ABSTRACT111);
            adaptor.addChild(root_0, ABSTRACT111_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, abstFlag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end abstFlag

    public static class properties_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start properties
    // TNSDL.g:331:1: properties : constants simpleTypeDefinitions representation ( signatures )? -> ^( Properties constants simpleTypeDefinitions representation ( signatures )? ) ;
    public final properties_return properties() throws RecognitionException {
        properties_return retval = new properties_return();
        retval.start = input.LT(1);
        int properties_StartIndex = input.index();
        Object root_0 = null;

        constants_return constants112 = null;

        simpleTypeDefinitions_return simpleTypeDefinitions113 = null;

        representation_return representation114 = null;

        signatures_return signatures115 = null;


        RewriteRuleSubtreeStream stream_representation=new RewriteRuleSubtreeStream(adaptor,"rule representation");
        RewriteRuleSubtreeStream stream_constants=new RewriteRuleSubtreeStream(adaptor,"rule constants");
        RewriteRuleSubtreeStream stream_signatures=new RewriteRuleSubtreeStream(adaptor,"rule signatures");
        RewriteRuleSubtreeStream stream_simpleTypeDefinitions=new RewriteRuleSubtreeStream(adaptor,"rule simpleTypeDefinitions");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // TNSDL.g:331:11: ( constants simpleTypeDefinitions representation ( signatures )? -> ^( Properties constants simpleTypeDefinitions representation ( signatures )? ) )
            // TNSDL.g:333:2: constants simpleTypeDefinitions representation ( signatures )?
            {
            pushFollow(FOLLOW_constants_in_properties1674);
            constants112=constants();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constants.add(constants112.getTree());
            pushFollow(FOLLOW_simpleTypeDefinitions_in_properties1677);
            simpleTypeDefinitions113=simpleTypeDefinitions();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_simpleTypeDefinitions.add(simpleTypeDefinitions113.getTree());
            pushFollow(FOLLOW_representation_in_properties1680);
            representation114=representation();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_representation.add(representation114.getTree());
            // TNSDL.g:336:2: ( signatures )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==OPERATORS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // TNSDL.g:0:0: signatures
                    {
                    pushFollow(FOLLOW_signatures_in_properties1683);
                    signatures115=signatures();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_signatures.add(signatures115.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: representation, signatures, constants, simpleTypeDefinitions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 337:2: -> ^( Properties constants simpleTypeDefinitions representation ( signatures )? )
            {
                // TNSDL.g:337:5: ^( Properties constants simpleTypeDefinitions representation ( signatures )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(Properties, "Properties"), root_1);

                adaptor.addChild(root_1, stream_constants.next());
                adaptor.addChild(root_1, stream_simpleTypeDefinitions.next());
                adaptor.addChild(root_1, stream_representation.next());
                // TNSDL.g:337:65: ( signatures )?
                if ( stream_signatures.hasNext() ) {
                    adaptor.addChild(root_1, stream_signatures.next());

                }
                stream_signatures.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 29, properties_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end properties

    public static class signatures_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start signatures
    // TNSDL.g:341:1: signatures : OPERATORS operatorSignatureList ;
    public final signatures_return signatures() throws RecognitionException {
        signatures_return retval = new signatures_return();
        retval.start = input.LT(1);
        int signatures_StartIndex = input.index();
        Object root_0 = null;

        Token OPERATORS116=null;
        operatorSignatureList_return operatorSignatureList117 = null;


        Object OPERATORS116_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // TNSDL.g:341:11: ( OPERATORS operatorSignatureList )
            // TNSDL.g:343:2: OPERATORS operatorSignatureList
            {
            root_0 = (Object)adaptor.nil();

            OPERATORS116=(Token)input.LT(1);
            match(input,OPERATORS,FOLLOW_OPERATORS_in_signatures1712); if (failed) return retval;
            pushFollow(FOLLOW_operatorSignatureList_in_signatures1715);
            operatorSignatureList117=operatorSignatureList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, operatorSignatureList117.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, signatures_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end signatures

    public static class operatorSignatureList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start operatorSignatureList
    // TNSDL.g:347:1: operatorSignatureList : ( operatorSignature )+ -> ^( OperatorSignatureList ( operatorSignature )+ ) ;
    public final operatorSignatureList_return operatorSignatureList() throws RecognitionException {
        operatorSignatureList_return retval = new operatorSignatureList_return();
        retval.start = input.LT(1);
        int operatorSignatureList_StartIndex = input.index();
        Object root_0 = null;

        operatorSignature_return operatorSignature118 = null;


        RewriteRuleSubtreeStream stream_operatorSignature=new RewriteRuleSubtreeStream(adaptor,"rule operatorSignature");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // TNSDL.g:347:22: ( ( operatorSignature )+ -> ^( OperatorSignatureList ( operatorSignature )+ ) )
            // TNSDL.g:349:2: ( operatorSignature )+
            {
            // TNSDL.g:349:2: ( operatorSignature )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Name||LA30_0==PROCEDURE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // TNSDL.g:349:3: operatorSignature
            	    {
            	    pushFollow(FOLLOW_operatorSignature_in_operatorSignatureList1728);
            	    operatorSignature118=operatorSignature();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_operatorSignature.add(operatorSignature118.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            // AST REWRITE
            // elements: operatorSignature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 350:2: -> ^( OperatorSignatureList ( operatorSignature )+ )
            {
                // TNSDL.g:350:5: ^( OperatorSignatureList ( operatorSignature )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OperatorSignatureList, "OperatorSignatureList"), root_1);

                if ( !(stream_operatorSignature.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_operatorSignature.hasNext() ) {
                    adaptor.addChild(root_1, stream_operatorSignature.next());

                }
                stream_operatorSignature.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, operatorSignatureList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end operatorSignatureList

    public static class operatorSignature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start operatorSignature
    // TNSDL.g:354:1: operatorSignature : moduleProcedure operatorName LeftParenthesis ( typedParameterList0 )? RightParenthesis ResultSign operatorResultType ( optCallingSequence )? end -> ^( OperatorSignature moduleProcedure operatorName ( typedParameterList0 )? operatorResultType ( optCallingSequence )? end ) ;
    public final operatorSignature_return operatorSignature() throws RecognitionException {
        operatorSignature_return retval = new operatorSignature_return();
        retval.start = input.LT(1);
        int operatorSignature_StartIndex = input.index();
        Object root_0 = null;

        Token LeftParenthesis121=null;
        Token RightParenthesis123=null;
        Token ResultSign124=null;
        moduleProcedure_return moduleProcedure119 = null;

        operatorName_return operatorName120 = null;

        typedParameterList0_return typedParameterList0122 = null;

        operatorResultType_return operatorResultType125 = null;

        optCallingSequence_return optCallingSequence126 = null;

        end_return end127 = null;


        Object LeftParenthesis121_tree=null;
        Object RightParenthesis123_tree=null;
        Object ResultSign124_tree=null;
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleTokenStream stream_ResultSign=new RewriteRuleTokenStream(adaptor,"token ResultSign");
        RewriteRuleSubtreeStream stream_typedParameterList0=new RewriteRuleSubtreeStream(adaptor,"rule typedParameterList0");
        RewriteRuleSubtreeStream stream_operatorName=new RewriteRuleSubtreeStream(adaptor,"rule operatorName");
        RewriteRuleSubtreeStream stream_moduleProcedure=new RewriteRuleSubtreeStream(adaptor,"rule moduleProcedure");
        RewriteRuleSubtreeStream stream_operatorResultType=new RewriteRuleSubtreeStream(adaptor,"rule operatorResultType");
        RewriteRuleSubtreeStream stream_optCallingSequence=new RewriteRuleSubtreeStream(adaptor,"rule optCallingSequence");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // TNSDL.g:354:18: ( moduleProcedure operatorName LeftParenthesis ( typedParameterList0 )? RightParenthesis ResultSign operatorResultType ( optCallingSequence )? end -> ^( OperatorSignature moduleProcedure operatorName ( typedParameterList0 )? operatorResultType ( optCallingSequence )? end ) )
            // TNSDL.g:356:2: moduleProcedure operatorName LeftParenthesis ( typedParameterList0 )? RightParenthesis ResultSign operatorResultType ( optCallingSequence )? end
            {
            pushFollow(FOLLOW_moduleProcedure_in_operatorSignature1752);
            moduleProcedure119=moduleProcedure();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_moduleProcedure.add(moduleProcedure119.getTree());
            pushFollow(FOLLOW_operatorName_in_operatorSignature1754);
            operatorName120=operatorName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_operatorName.add(operatorName120.getTree());
            LeftParenthesis121=(Token)input.LT(1);
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_operatorSignature1756); if (failed) return retval;
            if ( backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis121);

            // TNSDL.g:356:47: ( typedParameterList0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Asterisk||LA31_0==Name||(LA31_0>=IN && LA31_0<=OUT)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // TNSDL.g:0:0: typedParameterList0
                    {
                    pushFollow(FOLLOW_typedParameterList0_in_operatorSignature1758);
                    typedParameterList0122=typedParameterList0();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typedParameterList0.add(typedParameterList0122.getTree());

                    }
                    break;

            }

            RightParenthesis123=(Token)input.LT(1);
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_operatorSignature1761); if (failed) return retval;
            if ( backtracking==0 ) stream_RightParenthesis.add(RightParenthesis123);

            ResultSign124=(Token)input.LT(1);
            match(input,ResultSign,FOLLOW_ResultSign_in_operatorSignature1764); if (failed) return retval;
            if ( backtracking==0 ) stream_ResultSign.add(ResultSign124);

            pushFollow(FOLLOW_operatorResultType_in_operatorSignature1766);
            operatorResultType125=operatorResultType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_operatorResultType.add(operatorResultType125.getTree());
            // TNSDL.g:357:32: ( optCallingSequence )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Comma) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // TNSDL.g:0:0: optCallingSequence
                    {
                    pushFollow(FOLLOW_optCallingSequence_in_operatorSignature1768);
                    optCallingSequence126=optCallingSequence();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_optCallingSequence.add(optCallingSequence126.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_end_in_operatorSignature1771);
            end127=end();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_end.add(end127.getTree());

            // AST REWRITE
            // elements: operatorResultType, typedParameterList0, moduleProcedure, operatorName, optCallingSequence, end
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 358:2: -> ^( OperatorSignature moduleProcedure operatorName ( typedParameterList0 )? operatorResultType ( optCallingSequence )? end )
            {
                // TNSDL.g:358:5: ^( OperatorSignature moduleProcedure operatorName ( typedParameterList0 )? operatorResultType ( optCallingSequence )? end )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OperatorSignature, "OperatorSignature"), root_1);

                adaptor.addChild(root_1, stream_moduleProcedure.next());
                adaptor.addChild(root_1, stream_operatorName.next());
                // TNSDL.g:358:54: ( typedParameterList0 )?
                if ( stream_typedParameterList0.hasNext() ) {
                    adaptor.addChild(root_1, stream_typedParameterList0.next());

                }
                stream_typedParameterList0.reset();
                adaptor.addChild(root_1, stream_operatorResultType.next());
                // TNSDL.g:358:94: ( optCallingSequence )?
                if ( stream_optCallingSequence.hasNext() ) {
                    adaptor.addChild(root_1, stream_optCallingSequence.next());

                }
                stream_optCallingSequence.reset();
                adaptor.addChild(root_1, stream_end.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 32, operatorSignature_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end operatorSignature

    public static class moduleProcedure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start moduleProcedure
    // TNSDL.g:361:1: moduleProcedure : ( PROCEDURE )? ;
    public final moduleProcedure_return moduleProcedure() throws RecognitionException {
        moduleProcedure_return retval = new moduleProcedure_return();
        retval.start = input.LT(1);
        int moduleProcedure_StartIndex = input.index();
        Object root_0 = null;

        Token PROCEDURE128=null;

        Object PROCEDURE128_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // TNSDL.g:361:16: ( ( PROCEDURE )? )
            // TNSDL.g:362:2: ( PROCEDURE )?
            {
            root_0 = (Object)adaptor.nil();

            // TNSDL.g:362:2: ( PROCEDURE )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==PROCEDURE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // TNSDL.g:362:3: PROCEDURE
                    {
                    PROCEDURE128=(Token)input.LT(1);
                    match(input,PROCEDURE,FOLLOW_PROCEDURE_in_moduleProcedure1802); if (failed) return retval;
                    if ( backtracking==0 ) {
                    PROCEDURE128_tree = (Object)adaptor.create(PROCEDURE128);
                    adaptor.addChild(root_0, PROCEDURE128_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 33, moduleProcedure_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end moduleProcedure

    public static class operatorName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start operatorName
    // TNSDL.g:365:1: operatorName : Name ;
    public final operatorName_return operatorName() throws RecognitionException {
        operatorName_return retval = new operatorName_return();
        retval.start = input.LT(1);
        int operatorName_StartIndex = input.index();
        Object root_0 = null;

        Token Name129=null;

        Object Name129_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // TNSDL.g:365:13: ( Name )
            // TNSDL.g:366:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name129=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_operatorName1813); if (failed) return retval;
            if ( backtracking==0 ) {
            Name129_tree = (Object)adaptor.create(Name129);
            adaptor.addChild(root_0, Name129_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 34, operatorName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end operatorName

    public static class typedParameterList0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typedParameterList0
    // TNSDL.g:369:1: typedParameterList0 : typedPrameterList varParamsSpec -> ^( TypedParameterList0 typedPrameterList varParamsSpec ) ;
    public final typedParameterList0_return typedParameterList0() throws RecognitionException {
        typedParameterList0_return retval = new typedParameterList0_return();
        retval.start = input.LT(1);
        int typedParameterList0_StartIndex = input.index();
        Object root_0 = null;

        typedPrameterList_return typedPrameterList130 = null;

        varParamsSpec_return varParamsSpec131 = null;


        RewriteRuleSubtreeStream stream_typedPrameterList=new RewriteRuleSubtreeStream(adaptor,"rule typedPrameterList");
        RewriteRuleSubtreeStream stream_varParamsSpec=new RewriteRuleSubtreeStream(adaptor,"rule varParamsSpec");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // TNSDL.g:369:20: ( typedPrameterList varParamsSpec -> ^( TypedParameterList0 typedPrameterList varParamsSpec ) )
            // TNSDL.g:371:2: typedPrameterList varParamsSpec
            {
            pushFollow(FOLLOW_typedPrameterList_in_typedParameterList01824);
            typedPrameterList130=typedPrameterList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_typedPrameterList.add(typedPrameterList130.getTree());
            pushFollow(FOLLOW_varParamsSpec_in_typedParameterList01826);
            varParamsSpec131=varParamsSpec();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_varParamsSpec.add(varParamsSpec131.getTree());

            // AST REWRITE
            // elements: varParamsSpec, typedPrameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 372:2: -> ^( TypedParameterList0 typedPrameterList varParamsSpec )
            {
                // TNSDL.g:372:5: ^( TypedParameterList0 typedPrameterList varParamsSpec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(TypedParameterList0, "TypedParameterList0"), root_1);

                adaptor.addChild(root_1, stream_typedPrameterList.next());
                adaptor.addChild(root_1, stream_varParamsSpec.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 35, typedParameterList0_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typedParameterList0

    public static class typedPrameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typedPrameterList
    // TNSDL.g:376:1: typedPrameterList : typedParameter ( Comma typedParameter )* -> ^( TypedPrameterList ( typedParameter )+ ) ;
    public final typedPrameterList_return typedPrameterList() throws RecognitionException {
        typedPrameterList_return retval = new typedPrameterList_return();
        retval.start = input.LT(1);
        int typedPrameterList_StartIndex = input.index();
        Object root_0 = null;

        Token Comma133=null;
        typedParameter_return typedParameter132 = null;

        typedParameter_return typedParameter134 = null;


        Object Comma133_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_typedParameter=new RewriteRuleSubtreeStream(adaptor,"rule typedParameter");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // TNSDL.g:376:18: ( typedParameter ( Comma typedParameter )* -> ^( TypedPrameterList ( typedParameter )+ ) )
            // TNSDL.g:378:2: typedParameter ( Comma typedParameter )*
            {
            pushFollow(FOLLOW_typedParameter_in_typedPrameterList1849);
            typedParameter132=typedParameter();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_typedParameter.add(typedParameter132.getTree());
            // TNSDL.g:378:17: ( Comma typedParameter )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==Asterisk||LA34_1==Name||(LA34_1>=IN && LA34_1<=OUT)) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // TNSDL.g:378:19: Comma typedParameter
            	    {
            	    Comma133=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_typedPrameterList1853); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma133);

            	    pushFollow(FOLLOW_typedParameter_in_typedPrameterList1855);
            	    typedParameter134=typedParameter();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_typedParameter.add(typedParameter134.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // AST REWRITE
            // elements: typedParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 379:2: -> ^( TypedPrameterList ( typedParameter )+ )
            {
                // TNSDL.g:379:5: ^( TypedPrameterList ( typedParameter )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(TypedPrameterList, "TypedPrameterList"), root_1);

                if ( !(stream_typedParameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_typedParameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_typedParameter.next());

                }
                stream_typedParameter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 36, typedPrameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typedPrameterList

    public static class typedParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typedParameter
    // TNSDL.g:383:1: typedParameter : ( callingMethod pointerKind paramName typeName -> ^( TypedParameter callingMethod pointerKind paramName typeName ) | parameterName typeName -> ^( TypedParameter parameterName typeName ) | parameterName Asterisk typeName -> ^( TypedParameter parameterName Asterisk typeName ) | typeName -> ^( TypedParameter typeName ) | Asterisk typeName -> ^( TypedParameter Asterisk typeName ) );
    public final typedParameter_return typedParameter() throws RecognitionException {
        typedParameter_return retval = new typedParameter_return();
        retval.start = input.LT(1);
        int typedParameter_StartIndex = input.index();
        Object root_0 = null;

        Token Asterisk142=null;
        Token Asterisk145=null;
        callingMethod_return callingMethod135 = null;

        pointerKind_return pointerKind136 = null;

        paramName_return paramName137 = null;

        typeName_return typeName138 = null;

        parameterName_return parameterName139 = null;

        typeName_return typeName140 = null;

        parameterName_return parameterName141 = null;

        typeName_return typeName143 = null;

        typeName_return typeName144 = null;

        typeName_return typeName146 = null;


        Object Asterisk142_tree=null;
        Object Asterisk145_tree=null;
        RewriteRuleTokenStream stream_Asterisk=new RewriteRuleTokenStream(adaptor,"token Asterisk");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_pointerKind=new RewriteRuleSubtreeStream(adaptor,"rule pointerKind");
        RewriteRuleSubtreeStream stream_callingMethod=new RewriteRuleSubtreeStream(adaptor,"rule callingMethod");
        RewriteRuleSubtreeStream stream_parameterName=new RewriteRuleSubtreeStream(adaptor,"rule parameterName");
        RewriteRuleSubtreeStream stream_paramName=new RewriteRuleSubtreeStream(adaptor,"rule paramName");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // TNSDL.g:383:15: ( callingMethod pointerKind paramName typeName -> ^( TypedParameter callingMethod pointerKind paramName typeName ) | parameterName typeName -> ^( TypedParameter parameterName typeName ) | parameterName Asterisk typeName -> ^( TypedParameter parameterName Asterisk typeName ) | typeName -> ^( TypedParameter typeName ) | Asterisk typeName -> ^( TypedParameter Asterisk typeName ) )
            int alt35=5;
            switch ( input.LA(1) ) {
            case IN:
            case OUT:
                {
                alt35=1;
                }
                break;
            case Name:
                {
                switch ( input.LA(2) ) {
                case Name:
                    {
                    alt35=2;
                    }
                    break;
                case EOF:
                case RightParenthesis:
                case Comma:
                    {
                    alt35=4;
                    }
                    break;
                case Asterisk:
                    {
                    alt35=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("383:1: typedParameter : ( callingMethod pointerKind paramName typeName -> ^( TypedParameter callingMethod pointerKind paramName typeName ) | parameterName typeName -> ^( TypedParameter parameterName typeName ) | parameterName Asterisk typeName -> ^( TypedParameter parameterName Asterisk typeName ) | typeName -> ^( TypedParameter typeName ) | Asterisk typeName -> ^( TypedParameter Asterisk typeName ) );", 35, 3, input);

                    throw nvae;
                }

                }
                break;
            case Asterisk:
                {
                alt35=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("383:1: typedParameter : ( callingMethod pointerKind paramName typeName -> ^( TypedParameter callingMethod pointerKind paramName typeName ) | parameterName typeName -> ^( TypedParameter parameterName typeName ) | parameterName Asterisk typeName -> ^( TypedParameter parameterName Asterisk typeName ) | typeName -> ^( TypedParameter typeName ) | Asterisk typeName -> ^( TypedParameter Asterisk typeName ) );", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // TNSDL.g:384:2: callingMethod pointerKind paramName typeName
                    {
                    pushFollow(FOLLOW_callingMethod_in_typedParameter1877);
                    callingMethod135=callingMethod();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_callingMethod.add(callingMethod135.getTree());
                    pushFollow(FOLLOW_pointerKind_in_typedParameter1879);
                    pointerKind136=pointerKind();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_pointerKind.add(pointerKind136.getTree());
                    pushFollow(FOLLOW_paramName_in_typedParameter1881);
                    paramName137=paramName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_paramName.add(paramName137.getTree());
                    pushFollow(FOLLOW_typeName_in_typedParameter1883);
                    typeName138=typeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeName.add(typeName138.getTree());

                    // AST REWRITE
                    // elements: typeName, pointerKind, callingMethod, paramName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:48: -> ^( TypedParameter callingMethod pointerKind paramName typeName )
                    {
                        // TNSDL.g:384:51: ^( TypedParameter callingMethod pointerKind paramName typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(TypedParameter, "TypedParameter"), root_1);

                        adaptor.addChild(root_1, stream_callingMethod.next());
                        adaptor.addChild(root_1, stream_pointerKind.next());
                        adaptor.addChild(root_1, stream_paramName.next());
                        adaptor.addChild(root_1, stream_typeName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:385:4: parameterName typeName
                    {
                    pushFollow(FOLLOW_parameterName_in_typedParameter1903);
                    parameterName139=parameterName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_parameterName.add(parameterName139.getTree());
                    pushFollow(FOLLOW_typeName_in_typedParameter1905);
                    typeName140=typeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeName.add(typeName140.getTree());

                    // AST REWRITE
                    // elements: typeName, parameterName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 385:28: -> ^( TypedParameter parameterName typeName )
                    {
                        // TNSDL.g:385:31: ^( TypedParameter parameterName typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(TypedParameter, "TypedParameter"), root_1);

                        adaptor.addChild(root_1, stream_parameterName.next());
                        adaptor.addChild(root_1, stream_typeName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:386:4: parameterName Asterisk typeName
                    {
                    pushFollow(FOLLOW_parameterName_in_typedParameter1921);
                    parameterName141=parameterName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_parameterName.add(parameterName141.getTree());
                    Asterisk142=(Token)input.LT(1);
                    match(input,Asterisk,FOLLOW_Asterisk_in_typedParameter1923); if (failed) return retval;
                    if ( backtracking==0 ) stream_Asterisk.add(Asterisk142);

                    pushFollow(FOLLOW_typeName_in_typedParameter1925);
                    typeName143=typeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeName.add(typeName143.getTree());

                    // AST REWRITE
                    // elements: typeName, Asterisk, parameterName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 386:36: -> ^( TypedParameter parameterName Asterisk typeName )
                    {
                        // TNSDL.g:386:39: ^( TypedParameter parameterName Asterisk typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(TypedParameter, "TypedParameter"), root_1);

                        adaptor.addChild(root_1, stream_parameterName.next());
                        adaptor.addChild(root_1, stream_Asterisk.next());
                        adaptor.addChild(root_1, stream_typeName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 4 :
                    // TNSDL.g:387:4: typeName
                    {
                    pushFollow(FOLLOW_typeName_in_typedParameter1942);
                    typeName144=typeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeName.add(typeName144.getTree());

                    // AST REWRITE
                    // elements: typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 387:14: -> ^( TypedParameter typeName )
                    {
                        // TNSDL.g:387:17: ^( TypedParameter typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(TypedParameter, "TypedParameter"), root_1);

                        adaptor.addChild(root_1, stream_typeName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 5 :
                    // TNSDL.g:388:4: Asterisk typeName
                    {
                    Asterisk145=(Token)input.LT(1);
                    match(input,Asterisk,FOLLOW_Asterisk_in_typedParameter1956); if (failed) return retval;
                    if ( backtracking==0 ) stream_Asterisk.add(Asterisk145);

                    pushFollow(FOLLOW_typeName_in_typedParameter1958);
                    typeName146=typeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeName.add(typeName146.getTree());

                    // AST REWRITE
                    // elements: typeName, Asterisk
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 388:22: -> ^( TypedParameter Asterisk typeName )
                    {
                        // TNSDL.g:388:25: ^( TypedParameter Asterisk typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(TypedParameter, "TypedParameter"), root_1);

                        adaptor.addChild(root_1, stream_Asterisk.next());
                        adaptor.addChild(root_1, stream_typeName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 37, typedParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typedParameter

    public static class paramName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start paramName
    // TNSDL.g:392:1: paramName : Name ;
    public final paramName_return paramName() throws RecognitionException {
        paramName_return retval = new paramName_return();
        retval.start = input.LT(1);
        int paramName_StartIndex = input.index();
        Object root_0 = null;

        Token Name147=null;

        Object Name147_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // TNSDL.g:392:10: ( Name )
            // TNSDL.g:393:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name147=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_paramName1978); if (failed) return retval;
            if ( backtracking==0 ) {
            Name147_tree = (Object)adaptor.create(Name147);
            adaptor.addChild(root_0, Name147_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 38, paramName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end paramName

    public static class parameterName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start parameterName
    // TNSDL.g:396:1: parameterName : Name ;
    public final parameterName_return parameterName() throws RecognitionException {
        parameterName_return retval = new parameterName_return();
        retval.start = input.LT(1);
        int parameterName_StartIndex = input.index();
        Object root_0 = null;

        Token Name148=null;

        Object Name148_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // TNSDL.g:396:14: ( Name )
            // TNSDL.g:397:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name148=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_parameterName1988); if (failed) return retval;
            if ( backtracking==0 ) {
            Name148_tree = (Object)adaptor.create(Name148);
            adaptor.addChild(root_0, Name148_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 39, parameterName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end parameterName

    public static class varParamsSpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start varParamsSpec
    // TNSDL.g:400:1: varParamsSpec : ( Comma VariableParameterSign )? ;
    public final varParamsSpec_return varParamsSpec() throws RecognitionException {
        varParamsSpec_return retval = new varParamsSpec_return();
        retval.start = input.LT(1);
        int varParamsSpec_StartIndex = input.index();
        Object root_0 = null;

        Token Comma149=null;
        Token VariableParameterSign150=null;

        Object Comma149_tree=null;
        Object VariableParameterSign150_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // TNSDL.g:400:14: ( ( Comma VariableParameterSign )? )
            // TNSDL.g:401:2: ( Comma VariableParameterSign )?
            {
            root_0 = (Object)adaptor.nil();

            // TNSDL.g:401:2: ( Comma VariableParameterSign )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Comma) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // TNSDL.g:401:3: Comma VariableParameterSign
                    {
                    Comma149=(Token)input.LT(1);
                    match(input,Comma,FOLLOW_Comma_in_varParamsSpec1998); if (failed) return retval;
                    VariableParameterSign150=(Token)input.LT(1);
                    match(input,VariableParameterSign,FOLLOW_VariableParameterSign_in_varParamsSpec2001); if (failed) return retval;
                    if ( backtracking==0 ) {
                    VariableParameterSign150_tree = (Object)adaptor.create(VariableParameterSign150);
                    adaptor.addChild(root_0, VariableParameterSign150_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 40, varParamsSpec_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end varParamsSpec

    public static class operatorResultType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start operatorResultType
    // TNSDL.g:404:1: operatorResultType : ( typeName )? ;
    public final operatorResultType_return operatorResultType() throws RecognitionException {
        operatorResultType_return retval = new operatorResultType_return();
        retval.start = input.LT(1);
        int operatorResultType_StartIndex = input.index();
        Object root_0 = null;

        typeName_return typeName151 = null;



        try {
            if ( backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // TNSDL.g:404:19: ( ( typeName )? )
            // TNSDL.g:405:2: ( typeName )?
            {
            root_0 = (Object)adaptor.nil();

            // TNSDL.g:405:2: ( typeName )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Name) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // TNSDL.g:405:3: typeName
                    {
                    pushFollow(FOLLOW_typeName_in_operatorResultType2013);
                    typeName151=typeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeName151.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 41, operatorResultType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end operatorResultType

    public static class optCallingSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start optCallingSequence
    // TNSDL.g:409:1: optCallingSequence : Comma pointerKind stackingDirection -> ^( OptCallingSequence pointerKind stackingDirection ) ;
    public final optCallingSequence_return optCallingSequence() throws RecognitionException {
        optCallingSequence_return retval = new optCallingSequence_return();
        retval.start = input.LT(1);
        int optCallingSequence_StartIndex = input.index();
        Object root_0 = null;

        Token Comma152=null;
        pointerKind_return pointerKind153 = null;

        stackingDirection_return stackingDirection154 = null;


        Object Comma152_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_pointerKind=new RewriteRuleSubtreeStream(adaptor,"rule pointerKind");
        RewriteRuleSubtreeStream stream_stackingDirection=new RewriteRuleSubtreeStream(adaptor,"rule stackingDirection");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // TNSDL.g:409:19: ( Comma pointerKind stackingDirection -> ^( OptCallingSequence pointerKind stackingDirection ) )
            // TNSDL.g:411:2: Comma pointerKind stackingDirection
            {
            Comma152=(Token)input.LT(1);
            match(input,Comma,FOLLOW_Comma_in_optCallingSequence2026); if (failed) return retval;
            if ( backtracking==0 ) stream_Comma.add(Comma152);

            pushFollow(FOLLOW_pointerKind_in_optCallingSequence2028);
            pointerKind153=pointerKind();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_pointerKind.add(pointerKind153.getTree());
            pushFollow(FOLLOW_stackingDirection_in_optCallingSequence2030);
            stackingDirection154=stackingDirection();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_stackingDirection.add(stackingDirection154.getTree());

            // AST REWRITE
            // elements: pointerKind, stackingDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 412:2: -> ^( OptCallingSequence pointerKind stackingDirection )
            {
                // TNSDL.g:412:5: ^( OptCallingSequence pointerKind stackingDirection )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OptCallingSequence, "OptCallingSequence"), root_1);

                adaptor.addChild(root_1, stream_pointerKind.next());
                adaptor.addChild(root_1, stream_stackingDirection.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 42, optCallingSequence_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end optCallingSequence

    public static class stackingDirection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start stackingDirection
    // TNSDL.g:416:1: stackingDirection : ( ImpliesSign -> ^( StackingDirection ImpliesSign ) | LessThanOrEqualsSign -> ^( StackingDirection LessThanOrEqualsSign ) | MACRO -> ^( StackingDirection MACRO ) );
    public final stackingDirection_return stackingDirection() throws RecognitionException {
        stackingDirection_return retval = new stackingDirection_return();
        retval.start = input.LT(1);
        int stackingDirection_StartIndex = input.index();
        Object root_0 = null;

        Token ImpliesSign155=null;
        Token LessThanOrEqualsSign156=null;
        Token MACRO157=null;

        Object ImpliesSign155_tree=null;
        Object LessThanOrEqualsSign156_tree=null;
        Object MACRO157_tree=null;
        RewriteRuleTokenStream stream_LessThanOrEqualsSign=new RewriteRuleTokenStream(adaptor,"token LessThanOrEqualsSign");
        RewriteRuleTokenStream stream_MACRO=new RewriteRuleTokenStream(adaptor,"token MACRO");
        RewriteRuleTokenStream stream_ImpliesSign=new RewriteRuleTokenStream(adaptor,"token ImpliesSign");

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // TNSDL.g:416:18: ( ImpliesSign -> ^( StackingDirection ImpliesSign ) | LessThanOrEqualsSign -> ^( StackingDirection LessThanOrEqualsSign ) | MACRO -> ^( StackingDirection MACRO ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case ImpliesSign:
                {
                alt38=1;
                }
                break;
            case LessThanOrEqualsSign:
                {
                alt38=2;
                }
                break;
            case MACRO:
                {
                alt38=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("416:1: stackingDirection : ( ImpliesSign -> ^( StackingDirection ImpliesSign ) | LessThanOrEqualsSign -> ^( StackingDirection LessThanOrEqualsSign ) | MACRO -> ^( StackingDirection MACRO ) );", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // TNSDL.g:417:2: ImpliesSign
                    {
                    ImpliesSign155=(Token)input.LT(1);
                    match(input,ImpliesSign,FOLLOW_ImpliesSign_in_stackingDirection2051); if (failed) return retval;
                    if ( backtracking==0 ) stream_ImpliesSign.add(ImpliesSign155);


                    // AST REWRITE
                    // elements: ImpliesSign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 417:14: -> ^( StackingDirection ImpliesSign )
                    {
                        // TNSDL.g:417:17: ^( StackingDirection ImpliesSign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(StackingDirection, "StackingDirection"), root_1);

                        adaptor.addChild(root_1, stream_ImpliesSign.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:418:4: LessThanOrEqualsSign
                    {
                    LessThanOrEqualsSign156=(Token)input.LT(1);
                    match(input,LessThanOrEqualsSign,FOLLOW_LessThanOrEqualsSign_in_stackingDirection2064); if (failed) return retval;
                    if ( backtracking==0 ) stream_LessThanOrEqualsSign.add(LessThanOrEqualsSign156);


                    // AST REWRITE
                    // elements: LessThanOrEqualsSign
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 418:25: -> ^( StackingDirection LessThanOrEqualsSign )
                    {
                        // TNSDL.g:418:28: ^( StackingDirection LessThanOrEqualsSign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(StackingDirection, "StackingDirection"), root_1);

                        adaptor.addChild(root_1, stream_LessThanOrEqualsSign.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:419:4: MACRO
                    {
                    MACRO157=(Token)input.LT(1);
                    match(input,MACRO,FOLLOW_MACRO_in_stackingDirection2077); if (failed) return retval;
                    if ( backtracking==0 ) stream_MACRO.add(MACRO157);


                    // AST REWRITE
                    // elements: MACRO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 419:10: -> ^( StackingDirection MACRO )
                    {
                        // TNSDL.g:419:13: ^( StackingDirection MACRO )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(StackingDirection, "StackingDirection"), root_1);

                        adaptor.addChild(root_1, stream_MACRO.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 43, stackingDirection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end stackingDirection

    public static class callingMethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start callingMethod
    // TNSDL.g:423:1: callingMethod : ( IN -> ^( CallingMethod IN ) | IN Solidus OUT -> ^( CallingMethod IN Solidus OUT ) | IN VIEWED -> ^( CallingMethod IN VIEWED ) | OUT -> ^( CallingMethod OUT ) );
    public final callingMethod_return callingMethod() throws RecognitionException {
        callingMethod_return retval = new callingMethod_return();
        retval.start = input.LT(1);
        int callingMethod_StartIndex = input.index();
        Object root_0 = null;

        Token IN158=null;
        Token IN159=null;
        Token Solidus160=null;
        Token OUT161=null;
        Token IN162=null;
        Token VIEWED163=null;
        Token OUT164=null;

        Object IN158_tree=null;
        Object IN159_tree=null;
        Object Solidus160_tree=null;
        Object OUT161_tree=null;
        Object IN162_tree=null;
        Object VIEWED163_tree=null;
        Object OUT164_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_Solidus=new RewriteRuleTokenStream(adaptor,"token Solidus");
        RewriteRuleTokenStream stream_OUT=new RewriteRuleTokenStream(adaptor,"token OUT");
        RewriteRuleTokenStream stream_VIEWED=new RewriteRuleTokenStream(adaptor,"token VIEWED");

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // TNSDL.g:423:14: ( IN -> ^( CallingMethod IN ) | IN Solidus OUT -> ^( CallingMethod IN Solidus OUT ) | IN VIEWED -> ^( CallingMethod IN VIEWED ) | OUT -> ^( CallingMethod OUT ) )
            int alt39=4;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IN) ) {
                switch ( input.LA(2) ) {
                case VIEWED:
                    {
                    alt39=3;
                    }
                    break;
                case Solidus:
                    {
                    alt39=2;
                    }
                    break;
                case Name:
                case NEAR:
                case FAR:
                    {
                    alt39=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("423:1: callingMethod : ( IN -> ^( CallingMethod IN ) | IN Solidus OUT -> ^( CallingMethod IN Solidus OUT ) | IN VIEWED -> ^( CallingMethod IN VIEWED ) | OUT -> ^( CallingMethod OUT ) );", 39, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA39_0==OUT) ) {
                alt39=4;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("423:1: callingMethod : ( IN -> ^( CallingMethod IN ) | IN Solidus OUT -> ^( CallingMethod IN Solidus OUT ) | IN VIEWED -> ^( CallingMethod IN VIEWED ) | OUT -> ^( CallingMethod OUT ) );", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // TNSDL.g:424:2: IN
                    {
                    IN158=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_callingMethod2095); if (failed) return retval;
                    if ( backtracking==0 ) stream_IN.add(IN158);


                    // AST REWRITE
                    // elements: IN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 424:6: -> ^( CallingMethod IN )
                    {
                        // TNSDL.g:424:9: ^( CallingMethod IN )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CallingMethod, "CallingMethod"), root_1);

                        adaptor.addChild(root_1, stream_IN.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:425:4: IN Solidus OUT
                    {
                    IN159=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_callingMethod2109); if (failed) return retval;
                    if ( backtracking==0 ) stream_IN.add(IN159);

                    Solidus160=(Token)input.LT(1);
                    match(input,Solidus,FOLLOW_Solidus_in_callingMethod2111); if (failed) return retval;
                    if ( backtracking==0 ) stream_Solidus.add(Solidus160);

                    OUT161=(Token)input.LT(1);
                    match(input,OUT,FOLLOW_OUT_in_callingMethod2113); if (failed) return retval;
                    if ( backtracking==0 ) stream_OUT.add(OUT161);


                    // AST REWRITE
                    // elements: Solidus, IN, OUT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:20: -> ^( CallingMethod IN Solidus OUT )
                    {
                        // TNSDL.g:425:23: ^( CallingMethod IN Solidus OUT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CallingMethod, "CallingMethod"), root_1);

                        adaptor.addChild(root_1, stream_IN.next());
                        adaptor.addChild(root_1, stream_Solidus.next());
                        adaptor.addChild(root_1, stream_OUT.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:426:4: IN VIEWED
                    {
                    IN162=(Token)input.LT(1);
                    match(input,IN,FOLLOW_IN_in_callingMethod2131); if (failed) return retval;
                    if ( backtracking==0 ) stream_IN.add(IN162);

                    VIEWED163=(Token)input.LT(1);
                    match(input,VIEWED,FOLLOW_VIEWED_in_callingMethod2133); if (failed) return retval;
                    if ( backtracking==0 ) stream_VIEWED.add(VIEWED163);


                    // AST REWRITE
                    // elements: VIEWED, IN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 426:15: -> ^( CallingMethod IN VIEWED )
                    {
                        // TNSDL.g:426:18: ^( CallingMethod IN VIEWED )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CallingMethod, "CallingMethod"), root_1);

                        adaptor.addChild(root_1, stream_IN.next());
                        adaptor.addChild(root_1, stream_VIEWED.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 4 :
                    // TNSDL.g:427:4: OUT
                    {
                    OUT164=(Token)input.LT(1);
                    match(input,OUT,FOLLOW_OUT_in_callingMethod2149); if (failed) return retval;
                    if ( backtracking==0 ) stream_OUT.add(OUT164);


                    // AST REWRITE
                    // elements: OUT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 427:9: -> ^( CallingMethod OUT )
                    {
                        // TNSDL.g:427:12: ^( CallingMethod OUT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CallingMethod, "CallingMethod"), root_1);

                        adaptor.addChild(root_1, stream_OUT.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 44, callingMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end callingMethod

    public static class constants_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constants
    // TNSDL.g:432:1: constants : ( constantDefinition )? ;
    public final constants_return constants() throws RecognitionException {
        constants_return retval = new constants_return();
        retval.start = input.LT(1);
        int constants_StartIndex = input.index();
        Object root_0 = null;

        constantDefinition_return constantDefinition165 = null;



        try {
            if ( backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // TNSDL.g:432:10: ( ( constantDefinition )? )
            // TNSDL.g:434:2: ( constantDefinition )?
            {
            root_0 = (Object)adaptor.nil();

            // TNSDL.g:434:2: ( constantDefinition )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==CONSTANT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // TNSDL.g:434:3: constantDefinition
                    {
                    pushFollow(FOLLOW_constantDefinition_in_constants2173);
                    constantDefinition165=constantDefinition();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, constantDefinition165.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 45, constants_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constants

    public static class constantDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constantDefinition
    // TNSDL.g:438:1: constantDefinition : CONSTANT constantDeclarationList ;
    public final constantDefinition_return constantDefinition() throws RecognitionException {
        constantDefinition_return retval = new constantDefinition_return();
        retval.start = input.LT(1);
        int constantDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token CONSTANT166=null;
        constantDeclarationList_return constantDeclarationList167 = null;


        Object CONSTANT166_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // TNSDL.g:438:19: ( CONSTANT constantDeclarationList )
            // TNSDL.g:439:2: CONSTANT constantDeclarationList
            {
            root_0 = (Object)adaptor.nil();

            CONSTANT166=(Token)input.LT(1);
            match(input,CONSTANT,FOLLOW_CONSTANT_in_constantDefinition2187); if (failed) return retval;
            pushFollow(FOLLOW_constantDeclarationList_in_constantDefinition2190);
            constantDeclarationList167=constantDeclarationList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, constantDeclarationList167.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 46, constantDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantDefinition

    public static class constantDeclarationList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constantDeclarationList
    // TNSDL.g:442:1: constantDeclarationList : ( constantDeclaration )+ -> ^( ConstantDeclarationList ( constantDeclaration )+ ) ;
    public final constantDeclarationList_return constantDeclarationList() throws RecognitionException {
        constantDeclarationList_return retval = new constantDeclarationList_return();
        retval.start = input.LT(1);
        int constantDeclarationList_StartIndex = input.index();
        Object root_0 = null;

        constantDeclaration_return constantDeclaration168 = null;


        RewriteRuleSubtreeStream stream_constantDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // TNSDL.g:442:24: ( ( constantDeclaration )+ -> ^( ConstantDeclarationList ( constantDeclaration )+ ) )
            // TNSDL.g:443:2: ( constantDeclaration )+
            {
            // TNSDL.g:443:2: ( constantDeclaration )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Name) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // TNSDL.g:443:3: constantDeclaration
            	    {
            	    pushFollow(FOLLOW_constantDeclaration_in_constantDeclarationList2203);
            	    constantDeclaration168=constantDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_constantDeclaration.add(constantDeclaration168.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


            // AST REWRITE
            // elements: constantDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 444:2: -> ^( ConstantDeclarationList ( constantDeclaration )+ )
            {
                // TNSDL.g:444:5: ^( ConstantDeclarationList ( constantDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ConstantDeclarationList, "ConstantDeclarationList"), root_1);

                if ( !(stream_constantDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constantDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_constantDeclaration.next());

                }
                stream_constantDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 47, constantDeclarationList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantDeclarationList

    public static class constantDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constantDeclaration
    // TNSDL.g:447:1: constantDeclaration : constantName EqualsSign constantExpression end -> ^( ConstantDeclaration constantName constantExpression end ) ;
    public final constantDeclaration_return constantDeclaration() throws RecognitionException {
        constantDeclaration_return retval = new constantDeclaration_return();
        retval.start = input.LT(1);
        int constantDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token EqualsSign170=null;
        constantName_return constantName169 = null;

        constantExpression_return constantExpression171 = null;

        end_return end172 = null;


        Object EqualsSign170_tree=null;
        RewriteRuleTokenStream stream_EqualsSign=new RewriteRuleTokenStream(adaptor,"token EqualsSign");
        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        RewriteRuleSubtreeStream stream_constantName=new RewriteRuleSubtreeStream(adaptor,"rule constantName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // TNSDL.g:447:20: ( constantName EqualsSign constantExpression end -> ^( ConstantDeclaration constantName constantExpression end ) )
            // TNSDL.g:448:2: constantName EqualsSign constantExpression end
            {
            pushFollow(FOLLOW_constantName_in_constantDeclaration2227);
            constantName169=constantName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantName.add(constantName169.getTree());
            EqualsSign170=(Token)input.LT(1);
            match(input,EqualsSign,FOLLOW_EqualsSign_in_constantDeclaration2229); if (failed) return retval;
            if ( backtracking==0 ) stream_EqualsSign.add(EqualsSign170);

            pushFollow(FOLLOW_constantExpression_in_constantDeclaration2231);
            constantExpression171=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(constantExpression171.getTree());
            pushFollow(FOLLOW_end_in_constantDeclaration2233);
            end172=end();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_end.add(end172.getTree());

            // AST REWRITE
            // elements: constantExpression, constantName, end
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 449:2: -> ^( ConstantDeclaration constantName constantExpression end )
            {
                // TNSDL.g:449:5: ^( ConstantDeclaration constantName constantExpression end )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ConstantDeclaration, "ConstantDeclaration"), root_1);

                adaptor.addChild(root_1, stream_constantName.next());
                adaptor.addChild(root_1, stream_constantExpression.next());
                adaptor.addChild(root_1, stream_end.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 48, constantDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantDeclaration

    public static class constantName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constantName
    // TNSDL.g:452:1: constantName : Name ;
    public final constantName_return constantName() throws RecognitionException {
        constantName_return retval = new constantName_return();
        retval.start = input.LT(1);
        int constantName_StartIndex = input.index();
        Object root_0 = null;

        Token Name173=null;

        Object Name173_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // TNSDL.g:452:13: ( Name )
            // TNSDL.g:453:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name173=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_constantName2257); if (failed) return retval;
            if ( backtracking==0 ) {
            Name173_tree = (Object)adaptor.create(Name173);
            adaptor.addChild(root_0, Name173_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 49, constantName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end constantName

    public static class groundTypeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start groundTypeExpression
    // TNSDL.g:456:1: groundTypeExpression : ( typeName -> ^( GroundTypeExpression typeName ) | integerSubrange -> ^( GroundTypeExpression integerSubrange ) | enumeration -> ^( GroundTypeExpression enumeration ) | predefinedTypeGeneratorInstantiation -> ^( GroundTypeExpression predefinedTypeGeneratorInstantiation ) | structDeclaration -> ^( GroundTypeExpression structDeclaration ) | bitStructDeclaration -> ^( GroundTypeExpression bitStructDeclaration ) | unionDeclaration -> ^( GroundTypeExpression unionDeclaration ) );
    public final groundTypeExpression_return groundTypeExpression() throws RecognitionException {
        groundTypeExpression_return retval = new groundTypeExpression_return();
        retval.start = input.LT(1);
        int groundTypeExpression_StartIndex = input.index();
        Object root_0 = null;

        typeName_return typeName174 = null;

        integerSubrange_return integerSubrange175 = null;

        enumeration_return enumeration176 = null;

        predefinedTypeGeneratorInstantiation_return predefinedTypeGeneratorInstantiation177 = null;

        structDeclaration_return structDeclaration178 = null;

        bitStructDeclaration_return bitStructDeclaration179 = null;

        unionDeclaration_return unionDeclaration180 = null;


        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_predefinedTypeGeneratorInstantiation=new RewriteRuleSubtreeStream(adaptor,"rule predefinedTypeGeneratorInstantiation");
        RewriteRuleSubtreeStream stream_bitStructDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule bitStructDeclaration");
        RewriteRuleSubtreeStream stream_integerSubrange=new RewriteRuleSubtreeStream(adaptor,"rule integerSubrange");
        RewriteRuleSubtreeStream stream_enumeration=new RewriteRuleSubtreeStream(adaptor,"rule enumeration");
        RewriteRuleSubtreeStream stream_unionDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule unionDeclaration");
        RewriteRuleSubtreeStream stream_structDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule structDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // TNSDL.g:456:21: ( typeName -> ^( GroundTypeExpression typeName ) | integerSubrange -> ^( GroundTypeExpression integerSubrange ) | enumeration -> ^( GroundTypeExpression enumeration ) | predefinedTypeGeneratorInstantiation -> ^( GroundTypeExpression predefinedTypeGeneratorInstantiation ) | structDeclaration -> ^( GroundTypeExpression structDeclaration ) | bitStructDeclaration -> ^( GroundTypeExpression bitStructDeclaration ) | unionDeclaration -> ^( GroundTypeExpression unionDeclaration ) )
            int alt42=7;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt42=1;
                }
                break;
            case LeftParenthesis:
                {
                alt42=2;
                }
                break;
            case ENUM:
                {
                alt42=3;
                }
                break;
            case ARRAY:
            case POINTER:
            case BITS:
                {
                alt42=4;
                }
                break;
            case PACKED:
            case STRUCT:
                {
                alt42=5;
                }
                break;
            case BITSTRUCT:
                {
                alt42=6;
                }
                break;
            case UNION:
                {
                alt42=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("456:1: groundTypeExpression : ( typeName -> ^( GroundTypeExpression typeName ) | integerSubrange -> ^( GroundTypeExpression integerSubrange ) | enumeration -> ^( GroundTypeExpression enumeration ) | predefinedTypeGeneratorInstantiation -> ^( GroundTypeExpression predefinedTypeGeneratorInstantiation ) | structDeclaration -> ^( GroundTypeExpression structDeclaration ) | bitStructDeclaration -> ^( GroundTypeExpression bitStructDeclaration ) | unionDeclaration -> ^( GroundTypeExpression unionDeclaration ) );", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // TNSDL.g:458:2: typeName
                    {
                    pushFollow(FOLLOW_typeName_in_groundTypeExpression2268);
                    typeName174=typeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeName.add(typeName174.getTree());

                    // AST REWRITE
                    // elements: typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 458:11: -> ^( GroundTypeExpression typeName )
                    {
                        // TNSDL.g:458:14: ^( GroundTypeExpression typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(GroundTypeExpression, "GroundTypeExpression"), root_1);

                        adaptor.addChild(root_1, stream_typeName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:459:3: integerSubrange
                    {
                    pushFollow(FOLLOW_integerSubrange_in_groundTypeExpression2280);
                    integerSubrange175=integerSubrange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_integerSubrange.add(integerSubrange175.getTree());

                    // AST REWRITE
                    // elements: integerSubrange
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 459:19: -> ^( GroundTypeExpression integerSubrange )
                    {
                        // TNSDL.g:459:22: ^( GroundTypeExpression integerSubrange )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(GroundTypeExpression, "GroundTypeExpression"), root_1);

                        adaptor.addChild(root_1, stream_integerSubrange.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:460:3: enumeration
                    {
                    pushFollow(FOLLOW_enumeration_in_groundTypeExpression2292);
                    enumeration176=enumeration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_enumeration.add(enumeration176.getTree());

                    // AST REWRITE
                    // elements: enumeration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 460:15: -> ^( GroundTypeExpression enumeration )
                    {
                        // TNSDL.g:460:18: ^( GroundTypeExpression enumeration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(GroundTypeExpression, "GroundTypeExpression"), root_1);

                        adaptor.addChild(root_1, stream_enumeration.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 4 :
                    // TNSDL.g:461:3: predefinedTypeGeneratorInstantiation
                    {
                    pushFollow(FOLLOW_predefinedTypeGeneratorInstantiation_in_groundTypeExpression2304);
                    predefinedTypeGeneratorInstantiation177=predefinedTypeGeneratorInstantiation();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_predefinedTypeGeneratorInstantiation.add(predefinedTypeGeneratorInstantiation177.getTree());

                    // AST REWRITE
                    // elements: predefinedTypeGeneratorInstantiation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 461:40: -> ^( GroundTypeExpression predefinedTypeGeneratorInstantiation )
                    {
                        // TNSDL.g:461:43: ^( GroundTypeExpression predefinedTypeGeneratorInstantiation )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(GroundTypeExpression, "GroundTypeExpression"), root_1);

                        adaptor.addChild(root_1, stream_predefinedTypeGeneratorInstantiation.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 5 :
                    // TNSDL.g:462:3: structDeclaration
                    {
                    pushFollow(FOLLOW_structDeclaration_in_groundTypeExpression2316);
                    structDeclaration178=structDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_structDeclaration.add(structDeclaration178.getTree());

                    // AST REWRITE
                    // elements: structDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 462:21: -> ^( GroundTypeExpression structDeclaration )
                    {
                        // TNSDL.g:462:24: ^( GroundTypeExpression structDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(GroundTypeExpression, "GroundTypeExpression"), root_1);

                        adaptor.addChild(root_1, stream_structDeclaration.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 6 :
                    // TNSDL.g:463:3: bitStructDeclaration
                    {
                    pushFollow(FOLLOW_bitStructDeclaration_in_groundTypeExpression2328);
                    bitStructDeclaration179=bitStructDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_bitStructDeclaration.add(bitStructDeclaration179.getTree());

                    // AST REWRITE
                    // elements: bitStructDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 463:24: -> ^( GroundTypeExpression bitStructDeclaration )
                    {
                        // TNSDL.g:463:27: ^( GroundTypeExpression bitStructDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(GroundTypeExpression, "GroundTypeExpression"), root_1);

                        adaptor.addChild(root_1, stream_bitStructDeclaration.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 7 :
                    // TNSDL.g:464:3: unionDeclaration
                    {
                    pushFollow(FOLLOW_unionDeclaration_in_groundTypeExpression2340);
                    unionDeclaration180=unionDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_unionDeclaration.add(unionDeclaration180.getTree());

                    // AST REWRITE
                    // elements: unionDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 464:20: -> ^( GroundTypeExpression unionDeclaration )
                    {
                        // TNSDL.g:464:23: ^( GroundTypeExpression unionDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(GroundTypeExpression, "GroundTypeExpression"), root_1);

                        adaptor.addChild(root_1, stream_unionDeclaration.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 50, groundTypeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end groundTypeExpression

    public static class integerSubrange_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start integerSubrange
    // TNSDL.g:467:1: integerSubrange : LeftParenthesis e1= constantExpression Colon e2= constantExpression RightParenthesis -> ^( IntegerSubrange $e1 $e2) ;
    public final integerSubrange_return integerSubrange() throws RecognitionException {
        integerSubrange_return retval = new integerSubrange_return();
        retval.start = input.LT(1);
        int integerSubrange_StartIndex = input.index();
        Object root_0 = null;

        Token LeftParenthesis181=null;
        Token Colon182=null;
        Token RightParenthesis183=null;
        constantExpression_return e1 = null;

        constantExpression_return e2 = null;


        Object LeftParenthesis181_tree=null;
        Object Colon182_tree=null;
        Object RightParenthesis183_tree=null;
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // TNSDL.g:467:16: ( LeftParenthesis e1= constantExpression Colon e2= constantExpression RightParenthesis -> ^( IntegerSubrange $e1 $e2) )
            // TNSDL.g:469:3: LeftParenthesis e1= constantExpression Colon e2= constantExpression RightParenthesis
            {
            LeftParenthesis181=(Token)input.LT(1);
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_integerSubrange2359); if (failed) return retval;
            if ( backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis181);

            pushFollow(FOLLOW_constantExpression_in_integerSubrange2363);
            e1=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(e1.getTree());
            Colon182=(Token)input.LT(1);
            match(input,Colon,FOLLOW_Colon_in_integerSubrange2365); if (failed) return retval;
            if ( backtracking==0 ) stream_Colon.add(Colon182);

            pushFollow(FOLLOW_constantExpression_in_integerSubrange2369);
            e2=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(e2.getTree());
            RightParenthesis183=(Token)input.LT(1);
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_integerSubrange2371); if (failed) return retval;
            if ( backtracking==0 ) stream_RightParenthesis.add(RightParenthesis183);


            // AST REWRITE
            // elements: e2, e1
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"token e2",e2!=null?e2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 470:3: -> ^( IntegerSubrange $e1 $e2)
            {
                // TNSDL.g:470:6: ^( IntegerSubrange $e1 $e2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IntegerSubrange, "IntegerSubrange"), root_1);

                adaptor.addChild(root_1, stream_e1.next());
                adaptor.addChild(root_1, stream_e2.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 51, integerSubrange_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end integerSubrange

    public static class enumeration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enumeration
    // TNSDL.g:474:1: enumeration : ENUM enumConstDeclarationsPart ENDENUM -> ^( Enumeration enumConstDeclarationsPart ) ;
    public final enumeration_return enumeration() throws RecognitionException {
        enumeration_return retval = new enumeration_return();
        retval.start = input.LT(1);
        int enumeration_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM184=null;
        Token ENDENUM186=null;
        enumConstDeclarationsPart_return enumConstDeclarationsPart185 = null;


        Object ENUM184_tree=null;
        Object ENDENUM186_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_ENDENUM=new RewriteRuleTokenStream(adaptor,"token ENDENUM");
        RewriteRuleSubtreeStream stream_enumConstDeclarationsPart=new RewriteRuleSubtreeStream(adaptor,"rule enumConstDeclarationsPart");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // TNSDL.g:474:12: ( ENUM enumConstDeclarationsPart ENDENUM -> ^( Enumeration enumConstDeclarationsPart ) )
            // TNSDL.g:476:2: ENUM enumConstDeclarationsPart ENDENUM
            {
            ENUM184=(Token)input.LT(1);
            match(input,ENUM,FOLLOW_ENUM_in_enumeration2396); if (failed) return retval;
            if ( backtracking==0 ) stream_ENUM.add(ENUM184);

            pushFollow(FOLLOW_enumConstDeclarationsPart_in_enumeration2398);
            enumConstDeclarationsPart185=enumConstDeclarationsPart();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_enumConstDeclarationsPart.add(enumConstDeclarationsPart185.getTree());
            ENDENUM186=(Token)input.LT(1);
            match(input,ENDENUM,FOLLOW_ENDENUM_in_enumeration2400); if (failed) return retval;
            if ( backtracking==0 ) stream_ENDENUM.add(ENDENUM186);


            // AST REWRITE
            // elements: enumConstDeclarationsPart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 477:2: -> ^( Enumeration enumConstDeclarationsPart )
            {
                // TNSDL.g:477:5: ^( Enumeration enumConstDeclarationsPart )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(Enumeration, "Enumeration"), root_1);

                adaptor.addChild(root_1, stream_enumConstDeclarationsPart.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 52, enumeration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumeration

    public static class enumConstDeclarationsPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enumConstDeclarationsPart
    // TNSDL.g:480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );
    public final enumConstDeclarationsPart_return enumConstDeclarationsPart() throws RecognitionException {
        enumConstDeclarationsPart_return retval = new enumConstDeclarationsPart_return();
        retval.start = input.LT(1);
        int enumConstDeclarationsPart_StartIndex = input.index();
        Object root_0 = null;

        enumConstDecSemicList_return enumConstDecSemicList187 = null;

        enumConstDecCommaList_return enumConstDecCommaList188 = null;


        RewriteRuleSubtreeStream stream_enumConstDecSemicList=new RewriteRuleSubtreeStream(adaptor,"rule enumConstDecSemicList");
        RewriteRuleSubtreeStream stream_enumConstDecCommaList=new RewriteRuleSubtreeStream(adaptor,"rule enumConstDecCommaList");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // TNSDL.g:480:26: ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Name) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==Comma||LA43_1==ENDENUM) ) {
                    alt43=2;
                }
                else if ( (LA43_1==COMMENT) && (synpred75())) {
                    alt43=1;
                }
                else if ( (LA43_1==Semicolon) && (synpred75())) {
                    alt43=1;
                }
                else if ( (LA43_1==EqualsSign) ) {
                    switch ( input.LA(3) ) {
                    case Hyphen:
                        {
                        int LA43_7 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BitwiseNot:
                        {
                        int LA43_8 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NOT:
                        {
                        int LA43_9 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LeftParenthesis:
                        {
                        int LA43_10 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ATail:
                        {
                        int LA43_11 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case SIZEOF:
                        {
                        int LA43_12 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Dollar:
                        {
                        int LA43_13 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Name:
                        {
                        int LA43_14 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 14, input);

                            throw nvae;
                        }
                        }
                        break;
                    case IntegerConstant:
                        {
                        int LA43_15 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 15, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RealConstant:
                        {
                        int LA43_16 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case StringConstant:
                        {
                        int LA43_17 = input.LA(4);

                        if ( (synpred75()) ) {
                            alt43=1;
                        }
                        else if ( (true) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 17, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 6, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("480:1: enumConstDeclarationsPart : ( ( enumConstDeclaration end )=> enumConstDecSemicList -> ^( EnumConstDeclarationsPart enumConstDecSemicList ) | enumConstDecCommaList -> ^( EnumConstDeclarationsPart enumConstDecCommaList ) );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // TNSDL.g:482:2: ( enumConstDeclaration end )=> enumConstDecSemicList
                    {
                    pushFollow(FOLLOW_enumConstDecSemicList_in_enumConstDeclarationsPart2427);
                    enumConstDecSemicList187=enumConstDecSemicList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_enumConstDecSemicList.add(enumConstDecSemicList187.getTree());

                    // AST REWRITE
                    // elements: enumConstDecSemicList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 482:54: -> ^( EnumConstDeclarationsPart enumConstDecSemicList )
                    {
                        // TNSDL.g:482:57: ^( EnumConstDeclarationsPart enumConstDecSemicList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(EnumConstDeclarationsPart, "EnumConstDeclarationsPart"), root_1);

                        adaptor.addChild(root_1, stream_enumConstDecSemicList.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:483:3: enumConstDecCommaList
                    {
                    pushFollow(FOLLOW_enumConstDecCommaList_in_enumConstDeclarationsPart2439);
                    enumConstDecCommaList188=enumConstDecCommaList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_enumConstDecCommaList.add(enumConstDecCommaList188.getTree());

                    // AST REWRITE
                    // elements: enumConstDecCommaList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 483:25: -> ^( EnumConstDeclarationsPart enumConstDecCommaList )
                    {
                        // TNSDL.g:483:28: ^( EnumConstDeclarationsPart enumConstDecCommaList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(EnumConstDeclarationsPart, "EnumConstDeclarationsPart"), root_1);

                        adaptor.addChild(root_1, stream_enumConstDecCommaList.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 53, enumConstDeclarationsPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstDeclarationsPart

    public static class enumConstDecCommaList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enumConstDecCommaList
    // TNSDL.g:487:1: enumConstDecCommaList : enumConstDeclaration ( Comma enumConstDeclaration )* -> ^( EnumConstDecCommaList ( enumConstDeclaration )+ ) ;
    public final enumConstDecCommaList_return enumConstDecCommaList() throws RecognitionException {
        enumConstDecCommaList_return retval = new enumConstDecCommaList_return();
        retval.start = input.LT(1);
        int enumConstDecCommaList_StartIndex = input.index();
        Object root_0 = null;

        Token Comma190=null;
        enumConstDeclaration_return enumConstDeclaration189 = null;

        enumConstDeclaration_return enumConstDeclaration191 = null;


        Object Comma190_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_enumConstDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule enumConstDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // TNSDL.g:487:22: ( enumConstDeclaration ( Comma enumConstDeclaration )* -> ^( EnumConstDecCommaList ( enumConstDeclaration )+ ) )
            // TNSDL.g:489:2: enumConstDeclaration ( Comma enumConstDeclaration )*
            {
            pushFollow(FOLLOW_enumConstDeclaration_in_enumConstDecCommaList2459);
            enumConstDeclaration189=enumConstDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_enumConstDeclaration.add(enumConstDeclaration189.getTree());
            // TNSDL.g:489:23: ( Comma enumConstDeclaration )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Comma) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // TNSDL.g:489:24: Comma enumConstDeclaration
            	    {
            	    Comma190=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_enumConstDecCommaList2462); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma190);

            	    pushFollow(FOLLOW_enumConstDeclaration_in_enumConstDecCommaList2464);
            	    enumConstDeclaration191=enumConstDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_enumConstDeclaration.add(enumConstDeclaration191.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            // AST REWRITE
            // elements: enumConstDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 490:2: -> ^( EnumConstDecCommaList ( enumConstDeclaration )+ )
            {
                // TNSDL.g:490:5: ^( EnumConstDecCommaList ( enumConstDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(EnumConstDecCommaList, "EnumConstDecCommaList"), root_1);

                if ( !(stream_enumConstDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_enumConstDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumConstDeclaration.next());

                }
                stream_enumConstDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 54, enumConstDecCommaList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstDecCommaList

    public static class enumConstDecSemicList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enumConstDecSemicList
    // TNSDL.g:494:1: enumConstDecSemicList : ( enumConstDeclarationWithEnd )+ -> ^( EnumConstDecSemicList ( enumConstDeclarationWithEnd )+ ) ;
    public final enumConstDecSemicList_return enumConstDecSemicList() throws RecognitionException {
        enumConstDecSemicList_return retval = new enumConstDecSemicList_return();
        retval.start = input.LT(1);
        int enumConstDecSemicList_StartIndex = input.index();
        Object root_0 = null;

        enumConstDeclarationWithEnd_return enumConstDeclarationWithEnd192 = null;


        RewriteRuleSubtreeStream stream_enumConstDeclarationWithEnd=new RewriteRuleSubtreeStream(adaptor,"rule enumConstDeclarationWithEnd");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // TNSDL.g:494:22: ( ( enumConstDeclarationWithEnd )+ -> ^( EnumConstDecSemicList ( enumConstDeclarationWithEnd )+ ) )
            // TNSDL.g:496:2: ( enumConstDeclarationWithEnd )+
            {
            // TNSDL.g:496:2: ( enumConstDeclarationWithEnd )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==Name) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // TNSDL.g:0:0: enumConstDeclarationWithEnd
            	    {
            	    pushFollow(FOLLOW_enumConstDeclarationWithEnd_in_enumConstDecSemicList2488);
            	    enumConstDeclarationWithEnd192=enumConstDeclarationWithEnd();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_enumConstDeclarationWithEnd.add(enumConstDeclarationWithEnd192.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


            // AST REWRITE
            // elements: enumConstDeclarationWithEnd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 497:2: -> ^( EnumConstDecSemicList ( enumConstDeclarationWithEnd )+ )
            {
                // TNSDL.g:497:5: ^( EnumConstDecSemicList ( enumConstDeclarationWithEnd )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(EnumConstDecSemicList, "EnumConstDecSemicList"), root_1);

                if ( !(stream_enumConstDeclarationWithEnd.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_enumConstDeclarationWithEnd.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumConstDeclarationWithEnd.next());

                }
                stream_enumConstDeclarationWithEnd.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 55, enumConstDecSemicList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstDecSemicList

    public static class enumConstDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enumConstDeclaration
    // TNSDL.g:500:1: enumConstDeclaration : ( enumConstName EqualsSign constantExpression -> ^( EnumConstDeclaration enumConstName constantExpression ) | enumConstName -> ^( EnumConstDeclaration enumConstName ) );
    public final enumConstDeclaration_return enumConstDeclaration() throws RecognitionException {
        enumConstDeclaration_return retval = new enumConstDeclaration_return();
        retval.start = input.LT(1);
        int enumConstDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token EqualsSign194=null;
        enumConstName_return enumConstName193 = null;

        constantExpression_return constantExpression195 = null;

        enumConstName_return enumConstName196 = null;


        Object EqualsSign194_tree=null;
        RewriteRuleTokenStream stream_EqualsSign=new RewriteRuleTokenStream(adaptor,"token EqualsSign");
        RewriteRuleSubtreeStream stream_enumConstName=new RewriteRuleSubtreeStream(adaptor,"rule enumConstName");
        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // TNSDL.g:500:21: ( enumConstName EqualsSign constantExpression -> ^( EnumConstDeclaration enumConstName constantExpression ) | enumConstName -> ^( EnumConstDeclaration enumConstName ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Name) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==EqualsSign) ) {
                    alt46=1;
                }
                else if ( (LA46_1==EOF||LA46_1==Comma||(LA46_1>=COMMENT && LA46_1<=Semicolon)||LA46_1==ENDENUM) ) {
                    alt46=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("500:1: enumConstDeclaration : ( enumConstName EqualsSign constantExpression -> ^( EnumConstDeclaration enumConstName constantExpression ) | enumConstName -> ^( EnumConstDeclaration enumConstName ) );", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("500:1: enumConstDeclaration : ( enumConstName EqualsSign constantExpression -> ^( EnumConstDeclaration enumConstName constantExpression ) | enumConstName -> ^( EnumConstDeclaration enumConstName ) );", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // TNSDL.g:502:2: enumConstName EqualsSign constantExpression
                    {
                    pushFollow(FOLLOW_enumConstName_in_enumConstDeclaration2509);
                    enumConstName193=enumConstName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_enumConstName.add(enumConstName193.getTree());
                    EqualsSign194=(Token)input.LT(1);
                    match(input,EqualsSign,FOLLOW_EqualsSign_in_enumConstDeclaration2511); if (failed) return retval;
                    if ( backtracking==0 ) stream_EqualsSign.add(EqualsSign194);

                    pushFollow(FOLLOW_constantExpression_in_enumConstDeclaration2513);
                    constantExpression195=constantExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_constantExpression.add(constantExpression195.getTree());

                    // AST REWRITE
                    // elements: constantExpression, enumConstName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 502:46: -> ^( EnumConstDeclaration enumConstName constantExpression )
                    {
                        // TNSDL.g:502:49: ^( EnumConstDeclaration enumConstName constantExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(EnumConstDeclaration, "EnumConstDeclaration"), root_1);

                        adaptor.addChild(root_1, stream_enumConstName.next());
                        adaptor.addChild(root_1, stream_constantExpression.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:503:4: enumConstName
                    {
                    pushFollow(FOLLOW_enumConstName_in_enumConstDeclaration2528);
                    enumConstName196=enumConstName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_enumConstName.add(enumConstName196.getTree());

                    // AST REWRITE
                    // elements: enumConstName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 503:18: -> ^( EnumConstDeclaration enumConstName )
                    {
                        // TNSDL.g:503:21: ^( EnumConstDeclaration enumConstName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(EnumConstDeclaration, "EnumConstDeclaration"), root_1);

                        adaptor.addChild(root_1, stream_enumConstName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 56, enumConstDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstDeclaration

    public static class enumConstName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enumConstName
    // TNSDL.g:506:1: enumConstName : Name ;
    public final enumConstName_return enumConstName() throws RecognitionException {
        enumConstName_return retval = new enumConstName_return();
        retval.start = input.LT(1);
        int enumConstName_StartIndex = input.index();
        Object root_0 = null;

        Token Name197=null;

        Object Name197_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // TNSDL.g:506:14: ( Name )
            // TNSDL.g:507:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name197=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_enumConstName2545); if (failed) return retval;
            if ( backtracking==0 ) {
            Name197_tree = (Object)adaptor.create(Name197);
            adaptor.addChild(root_0, Name197_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 57, enumConstName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstName

    public static class enumConstDeclarationWithEnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enumConstDeclarationWithEnd
    // TNSDL.g:510:1: enumConstDeclarationWithEnd : enumConstDeclaration end ;
    public final enumConstDeclarationWithEnd_return enumConstDeclarationWithEnd() throws RecognitionException {
        enumConstDeclarationWithEnd_return retval = new enumConstDeclarationWithEnd_return();
        retval.start = input.LT(1);
        int enumConstDeclarationWithEnd_StartIndex = input.index();
        Object root_0 = null;

        enumConstDeclaration_return enumConstDeclaration198 = null;

        end_return end199 = null;



        try {
            if ( backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // TNSDL.g:510:28: ( enumConstDeclaration end )
            // TNSDL.g:512:2: enumConstDeclaration end
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumConstDeclaration_in_enumConstDeclarationWithEnd2555);
            enumConstDeclaration198=enumConstDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, enumConstDeclaration198.getTree());
            pushFollow(FOLLOW_end_in_enumConstDeclarationWithEnd2557);
            end199=end();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, end199.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 58, enumConstDeclarationWithEnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end enumConstDeclarationWithEnd

    public static class structDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start structDeclaration
    // TNSDL.g:516:1: structDeclaration : ( PACKED )? STRUCT fieldDeclarationList ENDSTRUCT -> ^( StructDeclaration ( PACKED )? fieldDeclarationList ) ;
    public final structDeclaration_return structDeclaration() throws RecognitionException {
        structDeclaration_return retval = new structDeclaration_return();
        retval.start = input.LT(1);
        int structDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token PACKED200=null;
        Token STRUCT201=null;
        Token ENDSTRUCT203=null;
        fieldDeclarationList_return fieldDeclarationList202 = null;


        Object PACKED200_tree=null;
        Object STRUCT201_tree=null;
        Object ENDSTRUCT203_tree=null;
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_PACKED=new RewriteRuleTokenStream(adaptor,"token PACKED");
        RewriteRuleTokenStream stream_ENDSTRUCT=new RewriteRuleTokenStream(adaptor,"token ENDSTRUCT");
        RewriteRuleSubtreeStream stream_fieldDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclarationList");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // TNSDL.g:516:18: ( ( PACKED )? STRUCT fieldDeclarationList ENDSTRUCT -> ^( StructDeclaration ( PACKED )? fieldDeclarationList ) )
            // TNSDL.g:518:2: ( PACKED )? STRUCT fieldDeclarationList ENDSTRUCT
            {
            // TNSDL.g:518:2: ( PACKED )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==PACKED) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // TNSDL.g:518:3: PACKED
                    {
                    PACKED200=(Token)input.LT(1);
                    match(input,PACKED,FOLLOW_PACKED_in_structDeclaration2570); if (failed) return retval;
                    if ( backtracking==0 ) stream_PACKED.add(PACKED200);


                    }
                    break;

            }

            STRUCT201=(Token)input.LT(1);
            match(input,STRUCT,FOLLOW_STRUCT_in_structDeclaration2574); if (failed) return retval;
            if ( backtracking==0 ) stream_STRUCT.add(STRUCT201);

            pushFollow(FOLLOW_fieldDeclarationList_in_structDeclaration2576);
            fieldDeclarationList202=fieldDeclarationList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fieldDeclarationList.add(fieldDeclarationList202.getTree());
            ENDSTRUCT203=(Token)input.LT(1);
            match(input,ENDSTRUCT,FOLLOW_ENDSTRUCT_in_structDeclaration2578); if (failed) return retval;
            if ( backtracking==0 ) stream_ENDSTRUCT.add(ENDSTRUCT203);


            // AST REWRITE
            // elements: fieldDeclarationList, PACKED
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 519:2: -> ^( StructDeclaration ( PACKED )? fieldDeclarationList )
            {
                // TNSDL.g:519:5: ^( StructDeclaration ( PACKED )? fieldDeclarationList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(StructDeclaration, "StructDeclaration"), root_1);

                // TNSDL.g:519:25: ( PACKED )?
                if ( stream_PACKED.hasNext() ) {
                    adaptor.addChild(root_1, stream_PACKED.next());

                }
                stream_PACKED.reset();
                adaptor.addChild(root_1, stream_fieldDeclarationList.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 59, structDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end structDeclaration

    public static class fieldDeclarationList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fieldDeclarationList
    // TNSDL.g:523:1: fieldDeclarationList : ( fieldDeclaration )+ -> ^( FieldDeclarationList ( fieldDeclaration )+ ) ;
    public final fieldDeclarationList_return fieldDeclarationList() throws RecognitionException {
        fieldDeclarationList_return retval = new fieldDeclarationList_return();
        retval.start = input.LT(1);
        int fieldDeclarationList_StartIndex = input.index();
        Object root_0 = null;

        fieldDeclaration_return fieldDeclaration204 = null;


        RewriteRuleSubtreeStream stream_fieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // TNSDL.g:523:21: ( ( fieldDeclaration )+ -> ^( FieldDeclarationList ( fieldDeclaration )+ ) )
            // TNSDL.g:525:2: ( fieldDeclaration )+
            {
            // TNSDL.g:525:2: ( fieldDeclaration )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Name) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // TNSDL.g:0:0: fieldDeclaration
            	    {
            	    pushFollow(FOLLOW_fieldDeclaration_in_fieldDeclarationList2603);
            	    fieldDeclaration204=fieldDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_fieldDeclaration.add(fieldDeclaration204.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            // AST REWRITE
            // elements: fieldDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 526:2: -> ^( FieldDeclarationList ( fieldDeclaration )+ )
            {
                // TNSDL.g:526:5: ^( FieldDeclarationList ( fieldDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FieldDeclarationList, "FieldDeclarationList"), root_1);

                if ( !(stream_fieldDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fieldDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_fieldDeclaration.next());

                }
                stream_fieldDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 60, fieldDeclarationList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end fieldDeclarationList

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fieldDeclaration
    // TNSDL.g:530:1: fieldDeclaration : fieldName groundTypeExpression end -> ^( FieldDeclaration fieldName groundTypeExpression end ) ;
    public final fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        fieldDeclaration_return retval = new fieldDeclaration_return();
        retval.start = input.LT(1);
        int fieldDeclaration_StartIndex = input.index();
        Object root_0 = null;

        fieldName_return fieldName205 = null;

        groundTypeExpression_return groundTypeExpression206 = null;

        end_return end207 = null;


        RewriteRuleSubtreeStream stream_groundTypeExpression=new RewriteRuleSubtreeStream(adaptor,"rule groundTypeExpression");
        RewriteRuleSubtreeStream stream_fieldName=new RewriteRuleSubtreeStream(adaptor,"rule fieldName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // TNSDL.g:530:17: ( fieldName groundTypeExpression end -> ^( FieldDeclaration fieldName groundTypeExpression end ) )
            // TNSDL.g:532:2: fieldName groundTypeExpression end
            {
            pushFollow(FOLLOW_fieldName_in_fieldDeclaration2626);
            fieldName205=fieldName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fieldName.add(fieldName205.getTree());
            pushFollow(FOLLOW_groundTypeExpression_in_fieldDeclaration2628);
            groundTypeExpression206=groundTypeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_groundTypeExpression.add(groundTypeExpression206.getTree());
            pushFollow(FOLLOW_end_in_fieldDeclaration2630);
            end207=end();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_end.add(end207.getTree());

            // AST REWRITE
            // elements: fieldName, end, groundTypeExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 533:2: -> ^( FieldDeclaration fieldName groundTypeExpression end )
            {
                // TNSDL.g:533:5: ^( FieldDeclaration fieldName groundTypeExpression end )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FieldDeclaration, "FieldDeclaration"), root_1);

                adaptor.addChild(root_1, stream_fieldName.next());
                adaptor.addChild(root_1, stream_groundTypeExpression.next());
                adaptor.addChild(root_1, stream_end.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 61, fieldDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end fieldDeclaration

    public static class fieldName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fieldName
    // TNSDL.g:537:1: fieldName : Name ;
    public final fieldName_return fieldName() throws RecognitionException {
        fieldName_return retval = new fieldName_return();
        retval.start = input.LT(1);
        int fieldName_StartIndex = input.index();
        Object root_0 = null;

        Token Name208=null;

        Object Name208_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // TNSDL.g:537:10: ( Name )
            // TNSDL.g:538:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name208=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_fieldName2654); if (failed) return retval;
            if ( backtracking==0 ) {
            Name208_tree = (Object)adaptor.create(Name208);
            adaptor.addChild(root_0, Name208_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 62, fieldName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end fieldName

    public static class bitStructDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitStructDeclaration
    // TNSDL.g:542:1: bitStructDeclaration : BITSTRUCT bitFieldDeclarationList ENDBITSTRUCT -> ^( BitStructDeclaration bitFieldDeclarationList ) ;
    public final bitStructDeclaration_return bitStructDeclaration() throws RecognitionException {
        bitStructDeclaration_return retval = new bitStructDeclaration_return();
        retval.start = input.LT(1);
        int bitStructDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token BITSTRUCT209=null;
        Token ENDBITSTRUCT211=null;
        bitFieldDeclarationList_return bitFieldDeclarationList210 = null;


        Object BITSTRUCT209_tree=null;
        Object ENDBITSTRUCT211_tree=null;
        RewriteRuleTokenStream stream_ENDBITSTRUCT=new RewriteRuleTokenStream(adaptor,"token ENDBITSTRUCT");
        RewriteRuleTokenStream stream_BITSTRUCT=new RewriteRuleTokenStream(adaptor,"token BITSTRUCT");
        RewriteRuleSubtreeStream stream_bitFieldDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule bitFieldDeclarationList");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // TNSDL.g:542:21: ( BITSTRUCT bitFieldDeclarationList ENDBITSTRUCT -> ^( BitStructDeclaration bitFieldDeclarationList ) )
            // TNSDL.g:544:2: BITSTRUCT bitFieldDeclarationList ENDBITSTRUCT
            {
            BITSTRUCT209=(Token)input.LT(1);
            match(input,BITSTRUCT,FOLLOW_BITSTRUCT_in_bitStructDeclaration2665); if (failed) return retval;
            if ( backtracking==0 ) stream_BITSTRUCT.add(BITSTRUCT209);

            pushFollow(FOLLOW_bitFieldDeclarationList_in_bitStructDeclaration2667);
            bitFieldDeclarationList210=bitFieldDeclarationList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_bitFieldDeclarationList.add(bitFieldDeclarationList210.getTree());
            ENDBITSTRUCT211=(Token)input.LT(1);
            match(input,ENDBITSTRUCT,FOLLOW_ENDBITSTRUCT_in_bitStructDeclaration2669); if (failed) return retval;
            if ( backtracking==0 ) stream_ENDBITSTRUCT.add(ENDBITSTRUCT211);


            // AST REWRITE
            // elements: bitFieldDeclarationList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 545:2: -> ^( BitStructDeclaration bitFieldDeclarationList )
            {
                // TNSDL.g:545:5: ^( BitStructDeclaration bitFieldDeclarationList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BitStructDeclaration, "BitStructDeclaration"), root_1);

                adaptor.addChild(root_1, stream_bitFieldDeclarationList.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 63, bitStructDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end bitStructDeclaration

    public static class bitFieldDeclarationList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitFieldDeclarationList
    // TNSDL.g:549:1: bitFieldDeclarationList : ( bitFieldDeclaration )+ -> ^( BitFieldDeclarationList ( bitFieldDeclaration )+ ) ;
    public final bitFieldDeclarationList_return bitFieldDeclarationList() throws RecognitionException {
        bitFieldDeclarationList_return retval = new bitFieldDeclarationList_return();
        retval.start = input.LT(1);
        int bitFieldDeclarationList_StartIndex = input.index();
        Object root_0 = null;

        bitFieldDeclaration_return bitFieldDeclaration212 = null;


        RewriteRuleSubtreeStream stream_bitFieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule bitFieldDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // TNSDL.g:549:24: ( ( bitFieldDeclaration )+ -> ^( BitFieldDeclarationList ( bitFieldDeclaration )+ ) )
            // TNSDL.g:551:2: ( bitFieldDeclaration )+
            {
            // TNSDL.g:551:2: ( bitFieldDeclaration )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==Name) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // TNSDL.g:0:0: bitFieldDeclaration
            	    {
            	    pushFollow(FOLLOW_bitFieldDeclaration_in_bitFieldDeclarationList2689);
            	    bitFieldDeclaration212=bitFieldDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_bitFieldDeclaration.add(bitFieldDeclaration212.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);


            // AST REWRITE
            // elements: bitFieldDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 552:2: -> ^( BitFieldDeclarationList ( bitFieldDeclaration )+ )
            {
                // TNSDL.g:552:5: ^( BitFieldDeclarationList ( bitFieldDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BitFieldDeclarationList, "BitFieldDeclarationList"), root_1);

                if ( !(stream_bitFieldDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_bitFieldDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_bitFieldDeclaration.next());

                }
                stream_bitFieldDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 64, bitFieldDeclarationList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end bitFieldDeclarationList

    public static class bitFieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitFieldDeclaration
    // TNSDL.g:556:1: bitFieldDeclaration : fieldName constantExpression end -> ^( BitFieldDeclaration fieldName constantExpression end ) ;
    public final bitFieldDeclaration_return bitFieldDeclaration() throws RecognitionException {
        bitFieldDeclaration_return retval = new bitFieldDeclaration_return();
        retval.start = input.LT(1);
        int bitFieldDeclaration_StartIndex = input.index();
        Object root_0 = null;

        fieldName_return fieldName213 = null;

        constantExpression_return constantExpression214 = null;

        end_return end215 = null;


        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        RewriteRuleSubtreeStream stream_fieldName=new RewriteRuleSubtreeStream(adaptor,"rule fieldName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // TNSDL.g:556:20: ( fieldName constantExpression end -> ^( BitFieldDeclaration fieldName constantExpression end ) )
            // TNSDL.g:558:2: fieldName constantExpression end
            {
            pushFollow(FOLLOW_fieldName_in_bitFieldDeclaration2711);
            fieldName213=fieldName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fieldName.add(fieldName213.getTree());
            pushFollow(FOLLOW_constantExpression_in_bitFieldDeclaration2713);
            constantExpression214=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(constantExpression214.getTree());
            pushFollow(FOLLOW_end_in_bitFieldDeclaration2715);
            end215=end();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_end.add(end215.getTree());

            // AST REWRITE
            // elements: constantExpression, fieldName, end
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 559:2: -> ^( BitFieldDeclaration fieldName constantExpression end )
            {
                // TNSDL.g:559:5: ^( BitFieldDeclaration fieldName constantExpression end )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BitFieldDeclaration, "BitFieldDeclaration"), root_1);

                adaptor.addChild(root_1, stream_fieldName.next());
                adaptor.addChild(root_1, stream_constantExpression.next());
                adaptor.addChild(root_1, stream_end.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 65, bitFieldDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end bitFieldDeclaration

    public static class unionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unionDeclaration
    // TNSDL.g:563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );
    public final unionDeclaration_return unionDeclaration() throws RecognitionException {
        unionDeclaration_return retval = new unionDeclaration_return();
        retval.start = input.LT(1);
        int unionDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token UNION216=null;
        Token OF218=null;
        Token ENDUNION221=null;
        Token UNION222=null;
        Token ENDUNION224=null;
        fieldDeclaration_return fieldDeclaration217 = null;

        taggedFieldDeclarationList_return taggedFieldDeclarationList219 = null;

        elseFieldOpt_return elseFieldOpt220 = null;

        fieldDeclarationList_return fieldDeclarationList223 = null;


        Object UNION216_tree=null;
        Object OF218_tree=null;
        Object ENDUNION221_tree=null;
        Object UNION222_tree=null;
        Object ENDUNION224_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
        RewriteRuleTokenStream stream_ENDUNION=new RewriteRuleTokenStream(adaptor,"token ENDUNION");
        RewriteRuleSubtreeStream stream_taggedFieldDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule taggedFieldDeclarationList");
        RewriteRuleSubtreeStream stream_elseFieldOpt=new RewriteRuleSubtreeStream(adaptor,"rule elseFieldOpt");
        RewriteRuleSubtreeStream stream_fieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclaration");
        RewriteRuleSubtreeStream stream_fieldDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclarationList");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // TNSDL.g:563:17: ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==UNION) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==Name) ) {
                    switch ( input.LA(3) ) {
                    case Name:
                        {
                        int LA50_3 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LeftParenthesis:
                        {
                        int LA50_4 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ENUM:
                        {
                        int LA50_5 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ARRAY:
                        {
                        int LA50_6 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case POINTER:
                        {
                        int LA50_7 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BITS:
                        {
                        int LA50_8 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PACKED:
                        {
                        int LA50_9 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRUCT:
                        {
                        int LA50_10 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BITSTRUCT:
                        {
                        int LA50_11 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case UNION:
                        {
                        int LA50_12 = input.LA(4);

                        if ( (synpred82()) ) {
                            alt50=1;
                        }
                        else if ( (true) ) {
                            alt50=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("563:1: unionDeclaration : ( ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt ) | UNION fieldDeclarationList ENDUNION -> ^( UnionDeclaration fieldDeclarationList ) );", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // TNSDL.g:565:2: ( UNION fieldDeclaration OF )=> UNION fieldDeclaration OF taggedFieldDeclarationList elseFieldOpt ENDUNION
                    {
                    UNION216=(Token)input.LT(1);
                    match(input,UNION,FOLLOW_UNION_in_unionDeclaration2752); if (failed) return retval;
                    if ( backtracking==0 ) stream_UNION.add(UNION216);

                    pushFollow(FOLLOW_fieldDeclaration_in_unionDeclaration2754);
                    fieldDeclaration217=fieldDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fieldDeclaration.add(fieldDeclaration217.getTree());
                    OF218=(Token)input.LT(1);
                    match(input,OF,FOLLOW_OF_in_unionDeclaration2756); if (failed) return retval;
                    if ( backtracking==0 ) stream_OF.add(OF218);

                    pushFollow(FOLLOW_taggedFieldDeclarationList_in_unionDeclaration2759);
                    taggedFieldDeclarationList219=taggedFieldDeclarationList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_taggedFieldDeclarationList.add(taggedFieldDeclarationList219.getTree());
                    pushFollow(FOLLOW_elseFieldOpt_in_unionDeclaration2763);
                    elseFieldOpt220=elseFieldOpt();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_elseFieldOpt.add(elseFieldOpt220.getTree());
                    ENDUNION221=(Token)input.LT(1);
                    match(input,ENDUNION,FOLLOW_ENDUNION_in_unionDeclaration2767); if (failed) return retval;
                    if ( backtracking==0 ) stream_ENDUNION.add(ENDUNION221);


                    // AST REWRITE
                    // elements: fieldDeclaration, taggedFieldDeclarationList, elseFieldOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 569:11: -> ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt )
                    {
                        // TNSDL.g:569:14: ^( UnionDeclaration fieldDeclaration taggedFieldDeclarationList elseFieldOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(UnionDeclaration, "UnionDeclaration"), root_1);

                        adaptor.addChild(root_1, stream_fieldDeclaration.next());
                        adaptor.addChild(root_1, stream_taggedFieldDeclarationList.next());
                        adaptor.addChild(root_1, stream_elseFieldOpt.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:570:4: UNION fieldDeclarationList ENDUNION
                    {
                    UNION222=(Token)input.LT(1);
                    match(input,UNION,FOLLOW_UNION_in_unionDeclaration2784); if (failed) return retval;
                    if ( backtracking==0 ) stream_UNION.add(UNION222);

                    pushFollow(FOLLOW_fieldDeclarationList_in_unionDeclaration2786);
                    fieldDeclarationList223=fieldDeclarationList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fieldDeclarationList.add(fieldDeclarationList223.getTree());
                    ENDUNION224=(Token)input.LT(1);
                    match(input,ENDUNION,FOLLOW_ENDUNION_in_unionDeclaration2788); if (failed) return retval;
                    if ( backtracking==0 ) stream_ENDUNION.add(ENDUNION224);


                    // AST REWRITE
                    // elements: fieldDeclarationList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 570:40: -> ^( UnionDeclaration fieldDeclarationList )
                    {
                        // TNSDL.g:570:43: ^( UnionDeclaration fieldDeclarationList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(UnionDeclaration, "UnionDeclaration"), root_1);

                        adaptor.addChild(root_1, stream_fieldDeclarationList.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 66, unionDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end unionDeclaration

    public static class taggedFieldDeclarationList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start taggedFieldDeclarationList
    // TNSDL.g:574:1: taggedFieldDeclarationList : ( taggedFieldDeclaration )+ -> ^( TaggedFieldDeclarationList ( taggedFieldDeclaration )+ ) ;
    public final taggedFieldDeclarationList_return taggedFieldDeclarationList() throws RecognitionException {
        taggedFieldDeclarationList_return retval = new taggedFieldDeclarationList_return();
        retval.start = input.LT(1);
        int taggedFieldDeclarationList_StartIndex = input.index();
        Object root_0 = null;

        taggedFieldDeclaration_return taggedFieldDeclaration225 = null;


        RewriteRuleSubtreeStream stream_taggedFieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule taggedFieldDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // TNSDL.g:574:28: ( ( taggedFieldDeclaration )+ -> ^( TaggedFieldDeclarationList ( taggedFieldDeclaration )+ ) )
            // TNSDL.g:576:2: ( taggedFieldDeclaration )+
            {
            // TNSDL.g:576:2: ( taggedFieldDeclaration )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Hyphen||(LA51_0>=BitwiseNot && LA51_0<=LeftParenthesis)||(LA51_0>=ATail && LA51_0<=Dollar)||LA51_0==Name) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // TNSDL.g:0:0: taggedFieldDeclaration
            	    {
            	    pushFollow(FOLLOW_taggedFieldDeclaration_in_taggedFieldDeclarationList2810);
            	    taggedFieldDeclaration225=taggedFieldDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_taggedFieldDeclaration.add(taggedFieldDeclaration225.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            // AST REWRITE
            // elements: taggedFieldDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 577:2: -> ^( TaggedFieldDeclarationList ( taggedFieldDeclaration )+ )
            {
                // TNSDL.g:577:5: ^( TaggedFieldDeclarationList ( taggedFieldDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(TaggedFieldDeclarationList, "TaggedFieldDeclarationList"), root_1);

                if ( !(stream_taggedFieldDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_taggedFieldDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_taggedFieldDeclaration.next());

                }
                stream_taggedFieldDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 67, taggedFieldDeclarationList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end taggedFieldDeclarationList

    public static class taggedFieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start taggedFieldDeclaration
    // TNSDL.g:581:1: taggedFieldDeclaration : constantExpression Colon fieldName groundTypeExpression end -> ^( TaggedFieldDeclaration constantExpression fieldName groundTypeExpression end ) ;
    public final taggedFieldDeclaration_return taggedFieldDeclaration() throws RecognitionException {
        taggedFieldDeclaration_return retval = new taggedFieldDeclaration_return();
        retval.start = input.LT(1);
        int taggedFieldDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token Colon227=null;
        constantExpression_return constantExpression226 = null;

        fieldName_return fieldName228 = null;

        groundTypeExpression_return groundTypeExpression229 = null;

        end_return end230 = null;


        Object Colon227_tree=null;
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        RewriteRuleSubtreeStream stream_groundTypeExpression=new RewriteRuleSubtreeStream(adaptor,"rule groundTypeExpression");
        RewriteRuleSubtreeStream stream_fieldName=new RewriteRuleSubtreeStream(adaptor,"rule fieldName");
        RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // TNSDL.g:581:23: ( constantExpression Colon fieldName groundTypeExpression end -> ^( TaggedFieldDeclaration constantExpression fieldName groundTypeExpression end ) )
            // TNSDL.g:583:2: constantExpression Colon fieldName groundTypeExpression end
            {
            pushFollow(FOLLOW_constantExpression_in_taggedFieldDeclaration2833);
            constantExpression226=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(constantExpression226.getTree());
            Colon227=(Token)input.LT(1);
            match(input,Colon,FOLLOW_Colon_in_taggedFieldDeclaration2835); if (failed) return retval;
            if ( backtracking==0 ) stream_Colon.add(Colon227);

            pushFollow(FOLLOW_fieldName_in_taggedFieldDeclaration2837);
            fieldName228=fieldName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fieldName.add(fieldName228.getTree());
            pushFollow(FOLLOW_groundTypeExpression_in_taggedFieldDeclaration2839);
            groundTypeExpression229=groundTypeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_groundTypeExpression.add(groundTypeExpression229.getTree());
            pushFollow(FOLLOW_end_in_taggedFieldDeclaration2841);
            end230=end();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_end.add(end230.getTree());

            // AST REWRITE
            // elements: groundTypeExpression, end, constantExpression, fieldName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 584:2: -> ^( TaggedFieldDeclaration constantExpression fieldName groundTypeExpression end )
            {
                // TNSDL.g:584:5: ^( TaggedFieldDeclaration constantExpression fieldName groundTypeExpression end )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(TaggedFieldDeclaration, "TaggedFieldDeclaration"), root_1);

                adaptor.addChild(root_1, stream_constantExpression.next());
                adaptor.addChild(root_1, stream_fieldName.next());
                adaptor.addChild(root_1, stream_groundTypeExpression.next());
                adaptor.addChild(root_1, stream_end.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 68, taggedFieldDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end taggedFieldDeclaration

    public static class elseFieldOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elseFieldOpt
    // TNSDL.g:588:1: elseFieldOpt : ( ELSE fieldDeclaration )? -> ( ^( ElseFieldOpt fieldDeclaration ) )? ;
    public final elseFieldOpt_return elseFieldOpt() throws RecognitionException {
        elseFieldOpt_return retval = new elseFieldOpt_return();
        retval.start = input.LT(1);
        int elseFieldOpt_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE231=null;
        fieldDeclaration_return fieldDeclaration232 = null;


        Object ELSE231_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_fieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // TNSDL.g:588:13: ( ( ELSE fieldDeclaration )? -> ( ^( ElseFieldOpt fieldDeclaration ) )? )
            // TNSDL.g:590:2: ( ELSE fieldDeclaration )?
            {
            // TNSDL.g:590:2: ( ELSE fieldDeclaration )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ELSE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // TNSDL.g:590:3: ELSE fieldDeclaration
                    {
                    ELSE231=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_elseFieldOpt2869); if (failed) return retval;
                    if ( backtracking==0 ) stream_ELSE.add(ELSE231);

                    pushFollow(FOLLOW_fieldDeclaration_in_elseFieldOpt2871);
                    fieldDeclaration232=fieldDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fieldDeclaration.add(fieldDeclaration232.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: fieldDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 591:2: -> ( ^( ElseFieldOpt fieldDeclaration ) )?
            {
                // TNSDL.g:591:5: ( ^( ElseFieldOpt fieldDeclaration ) )?
                if ( stream_fieldDeclaration.hasNext() ) {
                    // TNSDL.g:591:5: ^( ElseFieldOpt fieldDeclaration )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(adaptor.create(ElseFieldOpt, "ElseFieldOpt"), root_1);

                    adaptor.addChild(root_1, stream_fieldDeclaration.next());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_fieldDeclaration.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 69, elseFieldOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end elseFieldOpt

    public static class predefinedTypeGeneratorInstantiation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start predefinedTypeGeneratorInstantiation
    // TNSDL.g:595:1: predefinedTypeGeneratorInstantiation : ( arrayDeclaration -> ^( PredefinedTypeGeneratorInstantiation arrayDeclaration ) | pointerDeclaration -> ^( PredefinedTypeGeneratorInstantiation pointerDeclaration ) | bitsDeclaration -> ^( PredefinedTypeGeneratorInstantiation bitsDeclaration ) );
    public final predefinedTypeGeneratorInstantiation_return predefinedTypeGeneratorInstantiation() throws RecognitionException {
        predefinedTypeGeneratorInstantiation_return retval = new predefinedTypeGeneratorInstantiation_return();
        retval.start = input.LT(1);
        int predefinedTypeGeneratorInstantiation_StartIndex = input.index();
        Object root_0 = null;

        arrayDeclaration_return arrayDeclaration233 = null;

        pointerDeclaration_return pointerDeclaration234 = null;

        bitsDeclaration_return bitsDeclaration235 = null;


        RewriteRuleSubtreeStream stream_arrayDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclaration");
        RewriteRuleSubtreeStream stream_pointerDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule pointerDeclaration");
        RewriteRuleSubtreeStream stream_bitsDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule bitsDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // TNSDL.g:595:37: ( arrayDeclaration -> ^( PredefinedTypeGeneratorInstantiation arrayDeclaration ) | pointerDeclaration -> ^( PredefinedTypeGeneratorInstantiation pointerDeclaration ) | bitsDeclaration -> ^( PredefinedTypeGeneratorInstantiation bitsDeclaration ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case ARRAY:
                {
                alt53=1;
                }
                break;
            case POINTER:
                {
                alt53=2;
                }
                break;
            case BITS:
                {
                alt53=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("595:1: predefinedTypeGeneratorInstantiation : ( arrayDeclaration -> ^( PredefinedTypeGeneratorInstantiation arrayDeclaration ) | pointerDeclaration -> ^( PredefinedTypeGeneratorInstantiation pointerDeclaration ) | bitsDeclaration -> ^( PredefinedTypeGeneratorInstantiation bitsDeclaration ) );", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // TNSDL.g:597:2: arrayDeclaration
                    {
                    pushFollow(FOLLOW_arrayDeclaration_in_predefinedTypeGeneratorInstantiation2895);
                    arrayDeclaration233=arrayDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_arrayDeclaration.add(arrayDeclaration233.getTree());

                    // AST REWRITE
                    // elements: arrayDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 597:19: -> ^( PredefinedTypeGeneratorInstantiation arrayDeclaration )
                    {
                        // TNSDL.g:597:22: ^( PredefinedTypeGeneratorInstantiation arrayDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(PredefinedTypeGeneratorInstantiation, "PredefinedTypeGeneratorInstantiation"), root_1);

                        adaptor.addChild(root_1, stream_arrayDeclaration.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:598:4: pointerDeclaration
                    {
                    pushFollow(FOLLOW_pointerDeclaration_in_predefinedTypeGeneratorInstantiation2908);
                    pointerDeclaration234=pointerDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_pointerDeclaration.add(pointerDeclaration234.getTree());

                    // AST REWRITE
                    // elements: pointerDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 598:23: -> ^( PredefinedTypeGeneratorInstantiation pointerDeclaration )
                    {
                        // TNSDL.g:598:26: ^( PredefinedTypeGeneratorInstantiation pointerDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(PredefinedTypeGeneratorInstantiation, "PredefinedTypeGeneratorInstantiation"), root_1);

                        adaptor.addChild(root_1, stream_pointerDeclaration.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:599:4: bitsDeclaration
                    {
                    pushFollow(FOLLOW_bitsDeclaration_in_predefinedTypeGeneratorInstantiation2921);
                    bitsDeclaration235=bitsDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_bitsDeclaration.add(bitsDeclaration235.getTree());

                    // AST REWRITE
                    // elements: bitsDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 599:20: -> ^( PredefinedTypeGeneratorInstantiation bitsDeclaration )
                    {
                        // TNSDL.g:599:23: ^( PredefinedTypeGeneratorInstantiation bitsDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(PredefinedTypeGeneratorInstantiation, "PredefinedTypeGeneratorInstantiation"), root_1);

                        adaptor.addChild(root_1, stream_bitsDeclaration.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 70, predefinedTypeGeneratorInstantiation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end predefinedTypeGeneratorInstantiation

    public static class arrayDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arrayDeclaration
    // TNSDL.g:603:1: arrayDeclaration : ARRAY subscriptDeclarations OF groundTypeExpression -> ^( ArrayDeclaration subscriptDeclarations groundTypeExpression ) ;
    public final arrayDeclaration_return arrayDeclaration() throws RecognitionException {
        arrayDeclaration_return retval = new arrayDeclaration_return();
        retval.start = input.LT(1);
        int arrayDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token ARRAY236=null;
        Token OF238=null;
        subscriptDeclarations_return subscriptDeclarations237 = null;

        groundTypeExpression_return groundTypeExpression239 = null;


        Object ARRAY236_tree=null;
        Object OF238_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_groundTypeExpression=new RewriteRuleSubtreeStream(adaptor,"rule groundTypeExpression");
        RewriteRuleSubtreeStream stream_subscriptDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule subscriptDeclarations");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // TNSDL.g:603:17: ( ARRAY subscriptDeclarations OF groundTypeExpression -> ^( ArrayDeclaration subscriptDeclarations groundTypeExpression ) )
            // TNSDL.g:605:2: ARRAY subscriptDeclarations OF groundTypeExpression
            {
            ARRAY236=(Token)input.LT(1);
            match(input,ARRAY,FOLLOW_ARRAY_in_arrayDeclaration2942); if (failed) return retval;
            if ( backtracking==0 ) stream_ARRAY.add(ARRAY236);

            pushFollow(FOLLOW_subscriptDeclarations_in_arrayDeclaration2944);
            subscriptDeclarations237=subscriptDeclarations();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_subscriptDeclarations.add(subscriptDeclarations237.getTree());
            OF238=(Token)input.LT(1);
            match(input,OF,FOLLOW_OF_in_arrayDeclaration2946); if (failed) return retval;
            if ( backtracking==0 ) stream_OF.add(OF238);

            pushFollow(FOLLOW_groundTypeExpression_in_arrayDeclaration2950);
            groundTypeExpression239=groundTypeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_groundTypeExpression.add(groundTypeExpression239.getTree());

            // AST REWRITE
            // elements: groundTypeExpression, subscriptDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 607:2: -> ^( ArrayDeclaration subscriptDeclarations groundTypeExpression )
            {
                // TNSDL.g:607:5: ^( ArrayDeclaration subscriptDeclarations groundTypeExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ArrayDeclaration, "ArrayDeclaration"), root_1);

                adaptor.addChild(root_1, stream_subscriptDeclarations.next());
                adaptor.addChild(root_1, stream_groundTypeExpression.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 71, arrayDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end arrayDeclaration

    public static class pointerDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pointerDeclaration
    // TNSDL.g:611:1: pointerDeclaration : POINTER pointerKind LeftParenthesis typeName RightParenthesis -> ^( PointerDeclaration pointerKind typeName ) ;
    public final pointerDeclaration_return pointerDeclaration() throws RecognitionException {
        pointerDeclaration_return retval = new pointerDeclaration_return();
        retval.start = input.LT(1);
        int pointerDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token POINTER240=null;
        Token LeftParenthesis242=null;
        Token RightParenthesis244=null;
        pointerKind_return pointerKind241 = null;

        typeName_return typeName243 = null;


        Object POINTER240_tree=null;
        Object LeftParenthesis242_tree=null;
        Object RightParenthesis244_tree=null;
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleTokenStream stream_POINTER=new RewriteRuleTokenStream(adaptor,"token POINTER");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_pointerKind=new RewriteRuleSubtreeStream(adaptor,"rule pointerKind");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // TNSDL.g:611:19: ( POINTER pointerKind LeftParenthesis typeName RightParenthesis -> ^( PointerDeclaration pointerKind typeName ) )
            // TNSDL.g:613:2: POINTER pointerKind LeftParenthesis typeName RightParenthesis
            {
            POINTER240=(Token)input.LT(1);
            match(input,POINTER,FOLLOW_POINTER_in_pointerDeclaration2973); if (failed) return retval;
            if ( backtracking==0 ) stream_POINTER.add(POINTER240);

            pushFollow(FOLLOW_pointerKind_in_pointerDeclaration2975);
            pointerKind241=pointerKind();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_pointerKind.add(pointerKind241.getTree());
            LeftParenthesis242=(Token)input.LT(1);
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_pointerDeclaration2977); if (failed) return retval;
            if ( backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis242);

            pushFollow(FOLLOW_typeName_in_pointerDeclaration2979);
            typeName243=typeName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_typeName.add(typeName243.getTree());
            RightParenthesis244=(Token)input.LT(1);
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_pointerDeclaration2981); if (failed) return retval;
            if ( backtracking==0 ) stream_RightParenthesis.add(RightParenthesis244);


            // AST REWRITE
            // elements: typeName, pointerKind
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 614:2: -> ^( PointerDeclaration pointerKind typeName )
            {
                // TNSDL.g:614:5: ^( PointerDeclaration pointerKind typeName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(PointerDeclaration, "PointerDeclaration"), root_1);

                adaptor.addChild(root_1, stream_pointerKind.next());
                adaptor.addChild(root_1, stream_typeName.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 72, pointerDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end pointerDeclaration

    public static class bitsDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bitsDeclaration
    // TNSDL.g:618:1: bitsDeclaration : BITS LeftParenthesis constantExpression RightParenthesis -> ^( BitsDeclaration constantExpression ) ;
    public final bitsDeclaration_return bitsDeclaration() throws RecognitionException {
        bitsDeclaration_return retval = new bitsDeclaration_return();
        retval.start = input.LT(1);
        int bitsDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token BITS245=null;
        Token LeftParenthesis246=null;
        Token RightParenthesis248=null;
        constantExpression_return constantExpression247 = null;


        Object BITS245_tree=null;
        Object LeftParenthesis246_tree=null;
        Object RightParenthesis248_tree=null;
        RewriteRuleTokenStream stream_BITS=new RewriteRuleTokenStream(adaptor,"token BITS");
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // TNSDL.g:618:16: ( BITS LeftParenthesis constantExpression RightParenthesis -> ^( BitsDeclaration constantExpression ) )
            // TNSDL.g:620:2: BITS LeftParenthesis constantExpression RightParenthesis
            {
            BITS245=(Token)input.LT(1);
            match(input,BITS,FOLLOW_BITS_in_bitsDeclaration3003); if (failed) return retval;
            if ( backtracking==0 ) stream_BITS.add(BITS245);

            LeftParenthesis246=(Token)input.LT(1);
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_bitsDeclaration3005); if (failed) return retval;
            if ( backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis246);

            pushFollow(FOLLOW_constantExpression_in_bitsDeclaration3007);
            constantExpression247=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(constantExpression247.getTree());
            RightParenthesis248=(Token)input.LT(1);
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_bitsDeclaration3009); if (failed) return retval;
            if ( backtracking==0 ) stream_RightParenthesis.add(RightParenthesis248);


            // AST REWRITE
            // elements: constantExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 621:2: -> ^( BitsDeclaration constantExpression )
            {
                // TNSDL.g:621:5: ^( BitsDeclaration constantExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BitsDeclaration, "BitsDeclaration"), root_1);

                adaptor.addChild(root_1, stream_constantExpression.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 73, bitsDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end bitsDeclaration

    public static class pointerKind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pointerKind
    // TNSDL.g:626:1: pointerKind : ( NEAR | FAR )? ;
    public final pointerKind_return pointerKind() throws RecognitionException {
        pointerKind_return retval = new pointerKind_return();
        retval.start = input.LT(1);
        int pointerKind_StartIndex = input.index();
        Object root_0 = null;

        Token set249=null;

        Object set249_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // TNSDL.g:626:12: ( ( NEAR | FAR )? )
            // TNSDL.g:628:2: ( NEAR | FAR )?
            {
            root_0 = (Object)adaptor.nil();

            // TNSDL.g:628:2: ( NEAR | FAR )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=NEAR && LA54_0<=FAR)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // TNSDL.g:
                    {
                    set249=(Token)input.LT(1);
                    if ( (input.LA(1)>=NEAR && input.LA(1)<=FAR) ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set249));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_pointerKind3030);    throw mse;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 74, pointerKind_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end pointerKind

    public static class subscriptDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start subscriptDeclarations
    // TNSDL.g:632:1: subscriptDeclarations : ( subscriptDeclaration )+ -> ^( SubscriptDeclarations ( subscriptDeclaration )+ ) ;
    public final subscriptDeclarations_return subscriptDeclarations() throws RecognitionException {
        subscriptDeclarations_return retval = new subscriptDeclarations_return();
        retval.start = input.LT(1);
        int subscriptDeclarations_StartIndex = input.index();
        Object root_0 = null;

        subscriptDeclaration_return subscriptDeclaration250 = null;


        RewriteRuleSubtreeStream stream_subscriptDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule subscriptDeclaration");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // TNSDL.g:632:22: ( ( subscriptDeclaration )+ -> ^( SubscriptDeclarations ( subscriptDeclaration )+ ) )
            // TNSDL.g:634:2: ( subscriptDeclaration )+
            {
            // TNSDL.g:634:2: ( subscriptDeclaration )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==LeftParenthesis) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // TNSDL.g:0:0: subscriptDeclaration
            	    {
            	    pushFollow(FOLLOW_subscriptDeclaration_in_subscriptDeclarations3046);
            	    subscriptDeclaration250=subscriptDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_subscriptDeclaration.add(subscriptDeclaration250.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            // AST REWRITE
            // elements: subscriptDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 635:2: -> ^( SubscriptDeclarations ( subscriptDeclaration )+ )
            {
                // TNSDL.g:635:5: ^( SubscriptDeclarations ( subscriptDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SubscriptDeclarations, "SubscriptDeclarations"), root_1);

                if ( !(stream_subscriptDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_subscriptDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_subscriptDeclaration.next());

                }
                stream_subscriptDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 75, subscriptDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end subscriptDeclarations

    public static class subscriptDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start subscriptDeclaration
    // TNSDL.g:639:1: subscriptDeclaration : LeftParenthesis constantExpression RightParenthesis -> ^( SubscriptDeclaration constantExpression ) ;
    public final subscriptDeclaration_return subscriptDeclaration() throws RecognitionException {
        subscriptDeclaration_return retval = new subscriptDeclaration_return();
        retval.start = input.LT(1);
        int subscriptDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token LeftParenthesis251=null;
        Token RightParenthesis253=null;
        constantExpression_return constantExpression252 = null;


        Object LeftParenthesis251_tree=null;
        Object RightParenthesis253_tree=null;
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleSubtreeStream stream_constantExpression=new RewriteRuleSubtreeStream(adaptor,"rule constantExpression");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // TNSDL.g:639:21: ( LeftParenthesis constantExpression RightParenthesis -> ^( SubscriptDeclaration constantExpression ) )
            // TNSDL.g:641:3: LeftParenthesis constantExpression RightParenthesis
            {
            LeftParenthesis251=(Token)input.LT(1);
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_subscriptDeclaration3069); if (failed) return retval;
            if ( backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis251);

            pushFollow(FOLLOW_constantExpression_in_subscriptDeclaration3071);
            constantExpression252=constantExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_constantExpression.add(constantExpression252.getTree());
            RightParenthesis253=(Token)input.LT(1);
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_subscriptDeclaration3073); if (failed) return retval;
            if ( backtracking==0 ) stream_RightParenthesis.add(RightParenthesis253);


            // AST REWRITE
            // elements: constantExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 642:2: -> ^( SubscriptDeclaration constantExpression )
            {
                // TNSDL.g:642:5: ^( SubscriptDeclaration constantExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SubscriptDeclaration, "SubscriptDeclaration"), root_1);

                adaptor.addChild(root_1, stream_constantExpression.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 76, subscriptDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end subscriptDeclaration

    public static class representation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start representation
    // TNSDL.g:645:1: representation : ( REPRESENTATION representationClause end )? ;
    public final representation_return representation() throws RecognitionException {
        representation_return retval = new representation_return();
        retval.start = input.LT(1);
        int representation_StartIndex = input.index();
        Object root_0 = null;

        Token REPRESENTATION254=null;
        representationClause_return representationClause255 = null;

        end_return end256 = null;


        Object REPRESENTATION254_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // TNSDL.g:645:15: ( ( REPRESENTATION representationClause end )? )
            // TNSDL.g:647:2: ( REPRESENTATION representationClause end )?
            {
            root_0 = (Object)adaptor.nil();

            // TNSDL.g:647:2: ( REPRESENTATION representationClause end )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==REPRESENTATION) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // TNSDL.g:647:3: REPRESENTATION representationClause end
                    {
                    REPRESENTATION254=(Token)input.LT(1);
                    match(input,REPRESENTATION,FOLLOW_REPRESENTATION_in_representation3093); if (failed) return retval;
                    if ( backtracking==0 ) {
                    REPRESENTATION254_tree = (Object)adaptor.create(REPRESENTATION254);
                    root_0 = (Object)adaptor.becomeRoot(REPRESENTATION254_tree, root_0);
                    }
                    pushFollow(FOLLOW_representationClause_in_representation3096);
                    representationClause255=representationClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, representationClause255.getTree());
                    pushFollow(FOLLOW_end_in_representation3098);
                    end256=end();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, end256.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 77, representation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end representation

    public static class representationClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start representationClause
    // TNSDL.g:651:1: representationClause : ( ( Name LeftParenthesis )=> userGeneratorInstantiation -> ^( RepresentationClause userGeneratorInstantiation ) | groundTypeExpression -> ^( RepresentationClause groundTypeExpression ) );
    public final representationClause_return representationClause() throws RecognitionException {
        representationClause_return retval = new representationClause_return();
        retval.start = input.LT(1);
        int representationClause_StartIndex = input.index();
        Object root_0 = null;

        userGeneratorInstantiation_return userGeneratorInstantiation257 = null;

        groundTypeExpression_return groundTypeExpression258 = null;


        RewriteRuleSubtreeStream stream_userGeneratorInstantiation=new RewriteRuleSubtreeStream(adaptor,"rule userGeneratorInstantiation");
        RewriteRuleSubtreeStream stream_groundTypeExpression=new RewriteRuleSubtreeStream(adaptor,"rule groundTypeExpression");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // TNSDL.g:651:21: ( ( Name LeftParenthesis )=> userGeneratorInstantiation -> ^( RepresentationClause userGeneratorInstantiation ) | groundTypeExpression -> ^( RepresentationClause groundTypeExpression ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Name) ) {
                int LA57_1 = input.LA(2);

                if ( ((LA57_1>=COMMENT && LA57_1<=Semicolon)) ) {
                    alt57=2;
                }
                else if ( (LA57_1==LeftParenthesis) && (synpred91())) {
                    alt57=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("651:1: representationClause : ( ( Name LeftParenthesis )=> userGeneratorInstantiation -> ^( RepresentationClause userGeneratorInstantiation ) | groundTypeExpression -> ^( RepresentationClause groundTypeExpression ) );", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==LeftParenthesis||LA57_0==ENUM||(LA57_0>=PACKED && LA57_0<=STRUCT)||LA57_0==BITSTRUCT||LA57_0==UNION||(LA57_0>=ARRAY && LA57_0<=BITS)) ) {
                alt57=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("651:1: representationClause : ( ( Name LeftParenthesis )=> userGeneratorInstantiation -> ^( RepresentationClause userGeneratorInstantiation ) | groundTypeExpression -> ^( RepresentationClause groundTypeExpression ) );", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // TNSDL.g:653:2: ( Name LeftParenthesis )=> userGeneratorInstantiation
                    {
                    pushFollow(FOLLOW_userGeneratorInstantiation_in_representationClause3121);
                    userGeneratorInstantiation257=userGeneratorInstantiation();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_userGeneratorInstantiation.add(userGeneratorInstantiation257.getTree());

                    // AST REWRITE
                    // elements: userGeneratorInstantiation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 653:54: -> ^( RepresentationClause userGeneratorInstantiation )
                    {
                        // TNSDL.g:653:57: ^( RepresentationClause userGeneratorInstantiation )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RepresentationClause, "RepresentationClause"), root_1);

                        adaptor.addChild(root_1, stream_userGeneratorInstantiation.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // TNSDL.g:654:4: groundTypeExpression
                    {
                    pushFollow(FOLLOW_groundTypeExpression_in_representationClause3134);
                    groundTypeExpression258=groundTypeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_groundTypeExpression.add(groundTypeExpression258.getTree());

                    // AST REWRITE
                    // elements: groundTypeExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 654:25: -> ^( RepresentationClause groundTypeExpression )
                    {
                        // TNSDL.g:654:29: ^( RepresentationClause groundTypeExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RepresentationClause, "RepresentationClause"), root_1);

                        adaptor.addChild(root_1, stream_groundTypeExpression.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 78, representationClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end representationClause

    public static class userGeneratorInstantiation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start userGeneratorInstantiation
    // TNSDL.g:657:1: userGeneratorInstantiation : generatorName LeftParenthesis generatorActuals RightParenthesis -> ^( UserGeneratorInstantiation generatorName generatorActuals ) ;
    public final userGeneratorInstantiation_return userGeneratorInstantiation() throws RecognitionException {
        userGeneratorInstantiation_return retval = new userGeneratorInstantiation_return();
        retval.start = input.LT(1);
        int userGeneratorInstantiation_StartIndex = input.index();
        Object root_0 = null;

        Token LeftParenthesis260=null;
        Token RightParenthesis262=null;
        generatorName_return generatorName259 = null;

        generatorActuals_return generatorActuals261 = null;


        Object LeftParenthesis260_tree=null;
        Object RightParenthesis262_tree=null;
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleSubtreeStream stream_generatorActuals=new RewriteRuleSubtreeStream(adaptor,"rule generatorActuals");
        RewriteRuleSubtreeStream stream_generatorName=new RewriteRuleSubtreeStream(adaptor,"rule generatorName");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // TNSDL.g:657:27: ( generatorName LeftParenthesis generatorActuals RightParenthesis -> ^( UserGeneratorInstantiation generatorName generatorActuals ) )
            // TNSDL.g:659:2: generatorName LeftParenthesis generatorActuals RightParenthesis
            {
            pushFollow(FOLLOW_generatorName_in_userGeneratorInstantiation3156);
            generatorName259=generatorName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_generatorName.add(generatorName259.getTree());
            LeftParenthesis260=(Token)input.LT(1);
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_userGeneratorInstantiation3158); if (failed) return retval;
            if ( backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis260);

            pushFollow(FOLLOW_generatorActuals_in_userGeneratorInstantiation3160);
            generatorActuals261=generatorActuals();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_generatorActuals.add(generatorActuals261.getTree());
            RightParenthesis262=(Token)input.LT(1);
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_userGeneratorInstantiation3162); if (failed) return retval;
            if ( backtracking==0 ) stream_RightParenthesis.add(RightParenthesis262);


            // AST REWRITE
            // elements: generatorName, generatorActuals
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 660:2: -> ^( UserGeneratorInstantiation generatorName generatorActuals )
            {
                // TNSDL.g:660:5: ^( UserGeneratorInstantiation generatorName generatorActuals )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(UserGeneratorInstantiation, "UserGeneratorInstantiation"), root_1);

                adaptor.addChild(root_1, stream_generatorName.next());
                adaptor.addChild(root_1, stream_generatorActuals.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 79, userGeneratorInstantiation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end userGeneratorInstantiation

    public static class generatorName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start generatorName
    // TNSDL.g:664:1: generatorName : Name ;
    public final generatorName_return generatorName() throws RecognitionException {
        generatorName_return retval = new generatorName_return();
        retval.start = input.LT(1);
        int generatorName_StartIndex = input.index();
        Object root_0 = null;

        Token Name263=null;

        Object Name263_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // TNSDL.g:664:14: ( Name )
            // TNSDL.g:666:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name263=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_generatorName3187); if (failed) return retval;
            if ( backtracking==0 ) {
            Name263_tree = (Object)adaptor.create(Name263);
            adaptor.addChild(root_0, Name263_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 80, generatorName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end generatorName

    public static class generatorActuals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start generatorActuals
    // TNSDL.g:670:1: generatorActuals : ( generatorActual ( Comma generatorActual )* )? -> ( ^( GeneratorActuals ( generatorActual )+ ) )? ;
    public final generatorActuals_return generatorActuals() throws RecognitionException {
        generatorActuals_return retval = new generatorActuals_return();
        retval.start = input.LT(1);
        int generatorActuals_StartIndex = input.index();
        Object root_0 = null;

        Token Comma265=null;
        generatorActual_return generatorActual264 = null;

        generatorActual_return generatorActual266 = null;


        Object Comma265_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_generatorActual=new RewriteRuleSubtreeStream(adaptor,"rule generatorActual");
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // TNSDL.g:670:17: ( ( generatorActual ( Comma generatorActual )* )? -> ( ^( GeneratorActuals ( generatorActual )+ ) )? )
            // TNSDL.g:672:2: ( generatorActual ( Comma generatorActual )* )?
            {
            // TNSDL.g:672:2: ( generatorActual ( Comma generatorActual )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=IntegerConstant && LA59_0<=RealConstant)||LA59_0==Name) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // TNSDL.g:672:3: generatorActual ( Comma generatorActual )*
                    {
                    pushFollow(FOLLOW_generatorActual_in_generatorActuals3203);
                    generatorActual264=generatorActual();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_generatorActual.add(generatorActual264.getTree());
                    // TNSDL.g:672:19: ( Comma generatorActual )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==Comma) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // TNSDL.g:672:20: Comma generatorActual
                    	    {
                    	    Comma265=(Token)input.LT(1);
                    	    match(input,Comma,FOLLOW_Comma_in_generatorActuals3206); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_Comma.add(Comma265);

                    	    pushFollow(FOLLOW_generatorActual_in_generatorActuals3208);
                    	    generatorActual266=generatorActual();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_generatorActual.add(generatorActual266.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: generatorActual
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 673:2: -> ( ^( GeneratorActuals ( generatorActual )+ ) )?
            {
                // TNSDL.g:673:5: ( ^( GeneratorActuals ( generatorActual )+ ) )?
                if ( stream_generatorActual.hasNext() ) {
                    // TNSDL.g:673:5: ^( GeneratorActuals ( generatorActual )+ )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(adaptor.create(GeneratorActuals, "GeneratorActuals"), root_1);

                    if ( !(stream_generatorActual.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_generatorActual.hasNext() ) {
                        adaptor.addChild(root_1, stream_generatorActual.next());

                    }
                    stream_generatorActual.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_generatorActual.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 81, generatorActuals_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end generatorActuals

    public static class generatorActual_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start generatorActual
    // TNSDL.g:677:1: generatorActual : ( typeOrConstantName | IntegerConstant | RealConstant );
    public final generatorActual_return generatorActual() throws RecognitionException {
        generatorActual_return retval = new generatorActual_return();
        retval.start = input.LT(1);
        int generatorActual_StartIndex = input.index();
        Object root_0 = null;

        Token IntegerConstant268=null;
        Token RealConstant269=null;
        typeOrConstantName_return typeOrConstantName267 = null;


        Object IntegerConstant268_tree=null;
        Object RealConstant269_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // TNSDL.g:677:16: ( typeOrConstantName | IntegerConstant | RealConstant )
            int alt60=3;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt60=1;
                }
                break;
            case IntegerConstant:
                {
                alt60=2;
                }
                break;
            case RealConstant:
                {
                alt60=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("677:1: generatorActual : ( typeOrConstantName | IntegerConstant | RealConstant );", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // TNSDL.g:679:2: typeOrConstantName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeOrConstantName_in_generatorActual3236);
                    typeOrConstantName267=typeOrConstantName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeOrConstantName267.getTree());

                    }
                    break;
                case 2 :
                    // TNSDL.g:680:3: IntegerConstant
                    {
                    root_0 = (Object)adaptor.nil();

                    IntegerConstant268=(Token)input.LT(1);
                    match(input,IntegerConstant,FOLLOW_IntegerConstant_in_generatorActual3240); if (failed) return retval;
                    if ( backtracking==0 ) {
                    IntegerConstant268_tree = (Object)adaptor.create(IntegerConstant268);
                    adaptor.addChild(root_0, IntegerConstant268_tree);
                    }

                    }
                    break;
                case 3 :
                    // TNSDL.g:680:21: RealConstant
                    {
                    root_0 = (Object)adaptor.nil();

                    RealConstant269=(Token)input.LT(1);
                    match(input,RealConstant,FOLLOW_RealConstant_in_generatorActual3244); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RealConstant269_tree = (Object)adaptor.create(RealConstant269);
                    adaptor.addChild(root_0, RealConstant269_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 82, generatorActual_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end generatorActual

    public static class typeOrConstantName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typeOrConstantName
    // TNSDL.g:684:1: typeOrConstantName : Name ;
    public final typeOrConstantName_return typeOrConstantName() throws RecognitionException {
        typeOrConstantName_return retval = new typeOrConstantName_return();
        retval.start = input.LT(1);
        int typeOrConstantName_StartIndex = input.index();
        Object root_0 = null;

        Token Name270=null;

        Object Name270_tree=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // TNSDL.g:684:19: ( Name )
            // TNSDL.g:685:2: Name
            {
            root_0 = (Object)adaptor.nil();

            Name270=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_typeOrConstantName3257); if (failed) return retval;
            if ( backtracking==0 ) {
            Name270_tree = (Object)adaptor.create(Name270);
            adaptor.addChild(root_0, Name270_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 83, typeOrConstantName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end typeOrConstantName

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // TNSDL.g:269:2: ( Name LeftParenthesis )
        // TNSDL.g:269:3: Name LeftParenthesis
        {
        match(input,Name,FOLLOW_Name_in_synpred421428); if (failed) return ;
        match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_synpred421430); if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // TNSDL.g:482:2: ( enumConstDeclaration end )
        // TNSDL.g:482:3: enumConstDeclaration end
        {
        pushFollow(FOLLOW_enumConstDeclaration_in_synpred752420);
        enumConstDeclaration();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_end_in_synpred752422);
        end();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // TNSDL.g:565:2: ( UNION fieldDeclaration OF )
        // TNSDL.g:565:3: UNION fieldDeclaration OF
        {
        match(input,UNION,FOLLOW_UNION_in_synpred822741); if (failed) return ;
        pushFollow(FOLLOW_fieldDeclaration_in_synpred822743);
        fieldDeclaration();
        _fsp--;
        if (failed) return ;
        match(input,OF,FOLLOW_OF_in_synpred822745); if (failed) return ;

        }
    }
    // $ANTLR end synpred82

    // $ANTLR start synpred91
    public final void synpred91_fragment() throws RecognitionException {   
        // TNSDL.g:653:2: ( Name LeftParenthesis )
        // TNSDL.g:653:3: Name LeftParenthesis
        {
        match(input,Name,FOLLOW_Name_in_synpred913115); if (failed) return ;
        match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_synpred913117); if (failed) return ;

        }
    }
    // $ANTLR end synpred91

    public final boolean synpred82() {
        backtracking++;
        int start = input.mark();
        try {
            synpred82_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred75() {
        backtracking++;
        int start = input.mark();
        try {
            synpred75_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred91() {
        backtracking++;
        int start = input.mark();
        try {
            synpred91_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_EqualsSign_in_relationSymbol742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NotEqualsSign_in_relationSymbol756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSign_in_relationSymbol770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanSign_in_relationSymbol784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanOrEqualsSign_in_relationSymbol798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanOrEqualsSign_in_relationSymbol812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closedRange_in_range830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_openRange_in_range842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantExpression_in_closedRange862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_Colon_in_closedRange864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_closedRange868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationSymbol_in_openRange889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_expression_in_openRange891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groundExpression_in_constantExpression912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_groundExpression924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp0_in_expression936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_OR_in_expression940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_expression943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ImpliesSign_in_expression946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_exp0_in_expression950 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_exp1_in_exp0961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_AND_in_exp0964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_exp1_in_exp0967 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_exp2_in_exp1979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000FC00000L});
    public static final BitSet FOLLOW_GreaterThanSign_in_exp1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanSign_in_exp1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GreaterThanOrEqualsSign_in_exp1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanOrEqualsSign_in_exp11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NotEqualsSign_in_exp11007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_exp11012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_exp2_in_exp11016 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000000FC00000L});
    public static final BitSet FOLLOW_exp3_in_exp21027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_BitwiseOr_in_exp21030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_exp3_in_exp21033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_exp4_in_exp31044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_BitwiseXor_in_exp31047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_exp4_in_exp31050 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_exp5_in_exp41061 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_BitwiseAnd_in_exp41064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_exp5_in_exp41067 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_exp6_in_exp51078 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_BitwiseLeftShift_in_exp51082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BitwiseRightShift_in_exp51085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_exp6_in_exp51089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_exp7_in_exp61100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_PlusSign_in_exp61104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Hyphen_in_exp61107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_exp7_in_exp61111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_factor_in_exp71122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_Asterisk_in_exp71126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Solidus_in_exp71129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_exp71132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_factor_in_exp71136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_Hyphen_in_factor1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_factor_in_factor1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BitwiseNot_in_factor1165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_factor_in_factor1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_factor_in_factor1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_factor1200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_expression_in_factor1202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_factor1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATail_in_factor1217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_identifierDesignator_in_factor1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATail_in_factor1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringConstant_in_factor1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_factor1252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_factor1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_designator_in_factor1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_factor1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZEOF_in_factor1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_typeName_in_factor1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_designator_in_factor1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerConstant_in_factor1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RealConstant_in_factor1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringConstant_in_factor1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structurePrimary_in_factor1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_designator1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_designator_in_designator1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierDesignator_in_designator1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametrizedIdentifier_in_identifierDesignator1403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_Dot_in_identifierDesignator1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ResultSign_in_identifierDesignator1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_parametrizedIdentifier_in_identifierDesignator1415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_Name_in_parametrizedIdentifier1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_explicitParameters_in_parametrizedIdentifier1439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_Name_in_parametrizedIdentifier1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_typeName1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_explicitParameters1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_explicitParameters1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_explicitParameters1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_expressionList_in_explicitParameters1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_explicitParameters1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_Comma_in_expressionList1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_expression_in_expressionList1500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_typeName_in_structurePrimary1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_CompositeBeginSign_in_structurePrimary1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_expressionList_in_structurePrimary1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_CompositeEndSign_in_structurePrimary1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleTypeDefinition_in_simpleTypeDefinitions1551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x8800000000000000L});
    public static final BitSet FOLLOW_abstFlag_in_simpleTypeDefinition1575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_TYPE_in_simpleTypeDefinition1578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_typeName_in_simpleTypeDefinition1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x9800000000000000L,0x0000000001000081L});
    public static final BitSet FOLLOW_properties_in_simpleTypeDefinition1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ENDTYPE_in_simpleTypeDefinition1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6080000000000000L});
    public static final BitSet FOLLOW_nameReminder_in_simpleTypeDefinition1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_simpleTypeDefinition1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_nameReminder1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_end1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringConstant_in_end1638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_end1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_abstFlag1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constants_in_properties1674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x8800000000000000L,0x0000000001000001L});
    public static final BitSet FOLLOW_simpleTypeDefinitions_in_properties1677 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000001L});
    public static final BitSet FOLLOW_representation_in_properties1680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_signatures_in_properties1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATORS_in_signatures1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_operatorSignatureList_in_signatures1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operatorSignature_in_operatorSignatureList1728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_moduleProcedure_in_operatorSignature1752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_operatorName_in_operatorSignature1754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_operatorSignature1756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080410000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_typedParameterList0_in_operatorSignature1758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_operatorSignature1761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ResultSign_in_operatorSignature1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6180000000000000L});
    public static final BitSet FOLLOW_operatorResultType_in_operatorSignature1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6100000000000000L});
    public static final BitSet FOLLOW_optCallingSequence_in_operatorSignature1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_operatorSignature1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_moduleProcedure1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_operatorName1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedPrameterList_in_typedParameterList01824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_varParamsSpec_in_typedParameterList01826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedParameter_in_typedPrameterList1849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_Comma_in_typedPrameterList1853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080010000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_typedParameter_in_typedPrameterList1855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_callingMethod_in_typedParameter1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_pointerKind_in_typedParameter1879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_paramName_in_typedParameter1881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_typeName_in_typedParameter1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterName_in_typedParameter1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_typeName_in_typedParameter1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterName_in_typedParameter1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_Asterisk_in_typedParameter1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_typeName_in_typedParameter1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_typedParameter1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Asterisk_in_typedParameter1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_typeName_in_typedParameter1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_paramName1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_parameterName1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_varParamsSpec1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_VariableParameterSign_in_varParamsSpec2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_operatorResultType2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_optCallingSequence2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000084000000L,0x0000000000C00008L});
    public static final BitSet FOLLOW_pointerKind_in_optCallingSequence2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000084000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_stackingDirection_in_optCallingSequence2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ImpliesSign_in_stackingDirection2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LessThanOrEqualsSign_in_stackingDirection2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MACRO_in_stackingDirection2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_callingMethod2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_callingMethod2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_Solidus_in_callingMethod2111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OUT_in_callingMethod2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_callingMethod2131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_VIEWED_in_callingMethod2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_in_callingMethod2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDefinition_in_constants2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_constantDefinition2187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_constantDeclarationList_in_constantDefinition2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclaration_in_constantDeclarationList2203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_constantName_in_constantDeclaration2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EqualsSign_in_constantDeclaration2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_constantDeclaration2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_constantDeclaration2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_constantName2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_groundTypeExpression2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerSubrange_in_groundTypeExpression2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_in_groundTypeExpression2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predefinedTypeGeneratorInstantiation_in_groundTypeExpression2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structDeclaration_in_groundTypeExpression2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitStructDeclaration_in_groundTypeExpression2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unionDeclaration_in_groundTypeExpression2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_integerSubrange2359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_integerSubrange2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_Colon_in_integerSubrange2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_integerSubrange2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_integerSubrange2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration2396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_enumConstDeclarationsPart_in_enumeration2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ENDENUM_in_enumeration2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstDecSemicList_in_enumConstDeclarationsPart2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstDecCommaList_in_enumConstDeclarationsPart2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstDeclaration_in_enumConstDecCommaList2459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_Comma_in_enumConstDecCommaList2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_enumConstDeclaration_in_enumConstDecCommaList2464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_enumConstDeclarationWithEnd_in_enumConstDecSemicList2488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_enumConstName_in_enumConstDeclaration2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EqualsSign_in_enumConstDeclaration2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_enumConstDeclaration2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstName_in_enumConstDeclaration2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_enumConstName2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstDeclaration_in_enumConstDeclarationWithEnd2555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_enumConstDeclarationWithEnd2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKED_in_structDeclaration2570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_STRUCT_in_structDeclaration2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_fieldDeclarationList_in_structDeclaration2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ENDSTRUCT_in_structDeclaration2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_fieldDeclarationList2603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_fieldName_in_fieldDeclaration2626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080200000000000L,0x000000000038AD00L});
    public static final BitSet FOLLOW_groundTypeExpression_in_fieldDeclaration2628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_fieldDeclaration2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_fieldName2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITSTRUCT_in_bitStructDeclaration2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_bitFieldDeclarationList_in_bitStructDeclaration2667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ENDBITSTRUCT_in_bitStructDeclaration2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitFieldDeclaration_in_bitFieldDeclarationList2689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_fieldName_in_bitFieldDeclaration2711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_bitFieldDeclaration2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_bitFieldDeclaration2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNION_in_unionDeclaration2752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_unionDeclaration2754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_OF_in_unionDeclaration2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_taggedFieldDeclarationList_in_unionDeclaration2759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_elseFieldOpt_in_unionDeclaration2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ENDUNION_in_unionDeclaration2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNION_in_unionDeclaration2784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_fieldDeclarationList_in_unionDeclaration2786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ENDUNION_in_unionDeclaration2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taggedFieldDeclaration_in_taggedFieldDeclarationList2810 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_taggedFieldDeclaration2833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_Colon_in_taggedFieldDeclaration2835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_fieldName_in_taggedFieldDeclaration2837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080200000000000L,0x000000000038AD00L});
    public static final BitSet FOLLOW_groundTypeExpression_in_taggedFieldDeclaration2839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_taggedFieldDeclaration2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseFieldOpt2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_elseFieldOpt2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_predefinedTypeGeneratorInstantiation2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointerDeclaration_in_predefinedTypeGeneratorInstantiation2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitsDeclaration_in_predefinedTypeGeneratorInstantiation2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayDeclaration2942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_subscriptDeclarations_in_arrayDeclaration2944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_OF_in_arrayDeclaration2946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080200000000000L,0x000000000038AD00L});
    public static final BitSet FOLLOW_groundTypeExpression_in_arrayDeclaration2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_in_pointerDeclaration2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_pointerKind_in_pointerDeclaration2975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_pointerDeclaration2977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_typeName_in_pointerDeclaration2979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_pointerDeclaration2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BITS_in_bitsDeclaration3003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_bitsDeclaration3005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_bitsDeclaration3007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_bitsDeclaration3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_pointerKind3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subscriptDeclaration_in_subscriptDeclarations3046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_subscriptDeclaration3069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x009FB88000000000L});
    public static final BitSet FOLLOW_constantExpression_in_subscriptDeclaration3071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_subscriptDeclaration3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPRESENTATION_in_representation3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080200000000000L,0x000000000038AD00L});
    public static final BitSet FOLLOW_representationClause_in_representation3096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_representation3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userGeneratorInstantiation_in_representationClause3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groundTypeExpression_in_representationClause3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generatorName_in_userGeneratorInstantiation3156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_userGeneratorInstantiation3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x008C400000000000L});
    public static final BitSet FOLLOW_generatorActuals_in_userGeneratorInstantiation3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_userGeneratorInstantiation3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_generatorName3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generatorActual_in_generatorActuals3203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_Comma_in_generatorActuals3206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x008C000000000000L});
    public static final BitSet FOLLOW_generatorActual_in_generatorActuals3208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_typeOrConstantName_in_generatorActual3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerConstant_in_generatorActual3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RealConstant_in_generatorActual3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_typeOrConstantName3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_synpred421428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_synpred421430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstDeclaration_in_synpred752420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_end_in_synpred752422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNION_in_synpred822741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_synpred822743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_OF_in_synpred822745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Name_in_synpred913115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_synpred913117 = new BitSet(new long[]{0x0000000000000002L});

}