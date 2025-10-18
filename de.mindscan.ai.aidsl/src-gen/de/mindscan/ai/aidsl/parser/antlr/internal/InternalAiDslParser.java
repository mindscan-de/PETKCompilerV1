package de.mindscan.ai.aidsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.mindscan.ai.aidsl.services.AiDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAiDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'simpleaidsl'", "'{'", "'}'", "';'", "'('", "','", "')'", "':='", "'return'", "'if'", "'else'", "'.'", "'true'", "'false'", "'null'", "'package'", "'import'", "'datainput'", "':'", "'ui'", "'label'", "'uitype'", "'default'", "'options'", "'datadictionary'", "'extends'", "'['", "']'", "'vmnode'", "'super'", "'overlay'", "'opcode'", "'out'", "'in'", "'fields'", "'as'", "'require'", "'optional'", "'override'", "'llmtask'", "'implements'", "'@'", "'workflow'", "'=>'", "'.*'", "'string'", "'int'", "'boolean'", "'byte'", "'jsonstring'", "'upload'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAiDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAiDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAiDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAiDsl.g"; }



     	private AiDslGrammarAccess grammarAccess;

        public InternalAiDslParser(TokenStream input, AiDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AiDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAiDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAiDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAiDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAiDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_declaration_0_0 = null;

        EObject lv_import_declarations_1_0 = null;

        EObject lv_definitions_2_1 = null;

        EObject lv_definitions_2_2 = null;

        EObject lv_definitions_2_3 = null;

        EObject lv_definitions_2_4 = null;

        EObject lv_definitions_2_5 = null;

        EObject lv_definitions_2_6 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:77:2: ( ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition ) ) )* ) )
            // InternalAiDsl.g:78:2: ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition ) ) )* )
            {
            // InternalAiDsl.g:78:2: ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition ) ) )* )
            // InternalAiDsl.g:79:3: ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition ) ) )*
            {
            // InternalAiDsl.g:79:3: ( (lv_package_declaration_0_0= rulePackageDeclaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAiDsl.g:80:4: (lv_package_declaration_0_0= rulePackageDeclaration )
                    {
                    // InternalAiDsl.g:80:4: (lv_package_declaration_0_0= rulePackageDeclaration )
                    // InternalAiDsl.g:81:5: lv_package_declaration_0_0= rulePackageDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModelAccess().getPackage_declarationPackageDeclarationParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_package_declaration_0_0=rulePackageDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModelRule());
                      					}
                      					set(
                      						current,
                      						"package_declaration",
                      						lv_package_declaration_0_0,
                      						"de.mindscan.ai.aidsl.AiDsl.PackageDeclaration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAiDsl.g:98:3: ( (lv_import_declarations_1_0= ruleImportDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAiDsl.g:99:4: (lv_import_declarations_1_0= ruleImportDeclaration )
            	    {
            	    // InternalAiDsl.g:99:4: (lv_import_declarations_1_0= ruleImportDeclaration )
            	    // InternalAiDsl.g:100:5: lv_import_declarations_1_0= ruleImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getImport_declarationsImportDeclarationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_import_declarations_1_0=ruleImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"import_declarations",
            	      						lv_import_declarations_1_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.ImportDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAiDsl.g:117:3: ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11||LA4_0==28||LA4_0==35||LA4_0==39||LA4_0==50||LA4_0==53) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAiDsl.g:118:4: ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition ) )
            	    {
            	    // InternalAiDsl.g:118:4: ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition ) )
            	    // InternalAiDsl.g:119:5: (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition )
            	    {
            	    // InternalAiDsl.g:119:5: (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition | lv_definitions_2_6= ruleWorkflowFunctionsDefinition )
            	    int alt3=6;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    case 11:
            	        {
            	        alt3=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // InternalAiDsl.g:120:6: lv_definitions_2_1= ruleWorkflowDefinition
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsWorkflowDefinitionParserRuleCall_2_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_1=ruleWorkflowDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getModelRule());
            	              						}
            	              						add(
            	              							current,
            	              							"definitions",
            	              							lv_definitions_2_1,
            	              							"de.mindscan.ai.aidsl.AiDsl.WorkflowDefinition");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAiDsl.g:136:6: lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsWorkflowDataDictionaryDefinitionParserRuleCall_2_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_2=ruleWorkflowDataDictionaryDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getModelRule());
            	              						}
            	              						add(
            	              							current,
            	              							"definitions",
            	              							lv_definitions_2_2,
            	              							"de.mindscan.ai.aidsl.AiDsl.WorkflowDataDictionaryDefinition");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalAiDsl.g:152:6: lv_definitions_2_3= ruleWorkflowInputDefinition
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsWorkflowInputDefinitionParserRuleCall_2_0_2());
            	              					
            	            }
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_3=ruleWorkflowInputDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getModelRule());
            	              						}
            	              						add(
            	              							current,
            	              							"definitions",
            	              							lv_definitions_2_3,
            	              							"de.mindscan.ai.aidsl.AiDsl.WorkflowInputDefinition");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalAiDsl.g:168:6: lv_definitions_2_4= ruleLlmTaskDefinition
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsLlmTaskDefinitionParserRuleCall_2_0_3());
            	              					
            	            }
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_4=ruleLlmTaskDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getModelRule());
            	              						}
            	              						add(
            	              							current,
            	              							"definitions",
            	              							lv_definitions_2_4,
            	              							"de.mindscan.ai.aidsl.AiDsl.LlmTaskDefinition");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalAiDsl.g:184:6: lv_definitions_2_5= ruleVMNodeDefinition
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsVMNodeDefinitionParserRuleCall_2_0_4());
            	              					
            	            }
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_5=ruleVMNodeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getModelRule());
            	              						}
            	              						add(
            	              							current,
            	              							"definitions",
            	              							lv_definitions_2_5,
            	              							"de.mindscan.ai.aidsl.AiDsl.VMNodeDefinition");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // InternalAiDsl.g:200:6: lv_definitions_2_6= ruleWorkflowFunctionsDefinition
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsWorkflowFunctionsDefinitionParserRuleCall_2_0_5());
            	              					
            	            }
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_6=ruleWorkflowFunctionsDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getModelRule());
            	              						}
            	              						add(
            	              							current,
            	              							"definitions",
            	              							lv_definitions_2_6,
            	              							"de.mindscan.ai.aidsl.AiDsl.WorkflowFunctionsDefinition");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWorkflowFunctionsDefinition"
    // InternalAiDsl.g:222:1: entryRuleWorkflowFunctionsDefinition returns [EObject current=null] : iv_ruleWorkflowFunctionsDefinition= ruleWorkflowFunctionsDefinition EOF ;
    public final EObject entryRuleWorkflowFunctionsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowFunctionsDefinition = null;


        try {
            // InternalAiDsl.g:222:68: (iv_ruleWorkflowFunctionsDefinition= ruleWorkflowFunctionsDefinition EOF )
            // InternalAiDsl.g:223:2: iv_ruleWorkflowFunctionsDefinition= ruleWorkflowFunctionsDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowFunctionsDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowFunctionsDefinition=ruleWorkflowFunctionsDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowFunctionsDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowFunctionsDefinition"


    // $ANTLR start "ruleWorkflowFunctionsDefinition"
    // InternalAiDsl.g:229:1: ruleWorkflowFunctionsDefinition returns [EObject current=null] : (otherlv_0= 'simpleaidsl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSAIMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkflowFunctionsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:235:2: ( (otherlv_0= 'simpleaidsl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSAIMember ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:236:2: (otherlv_0= 'simpleaidsl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSAIMember ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:236:2: (otherlv_0= 'simpleaidsl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSAIMember ) )* otherlv_4= '}' )
            // InternalAiDsl.g:237:3: otherlv_0= 'simpleaidsl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleSAIMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkflowFunctionsDefinitionAccess().getSimpleaidslKeyword_0());
              		
            }
            // InternalAiDsl.g:241:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:242:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:242:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:243:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowFunctionsDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowFunctionsDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkflowFunctionsDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAiDsl.g:263:3: ( (lv_members_3_0= ruleSAIMember ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=56 && LA5_0<=61)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAiDsl.g:264:4: (lv_members_3_0= ruleSAIMember )
            	    {
            	    // InternalAiDsl.g:264:4: (lv_members_3_0= ruleSAIMember )
            	    // InternalAiDsl.g:265:5: lv_members_3_0= ruleSAIMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkflowFunctionsDefinitionAccess().getMembersSAIMemberParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_members_3_0=ruleSAIMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWorkflowFunctionsDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_3_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.SAIMember");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWorkflowFunctionsDefinitionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowFunctionsDefinition"


    // $ANTLR start "entryRuleSAIMember"
    // InternalAiDsl.g:290:1: entryRuleSAIMember returns [EObject current=null] : iv_ruleSAIMember= ruleSAIMember EOF ;
    public final EObject entryRuleSAIMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIMember = null;


        try {
            // InternalAiDsl.g:290:50: (iv_ruleSAIMember= ruleSAIMember EOF )
            // InternalAiDsl.g:291:2: iv_ruleSAIMember= ruleSAIMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIMember=ruleSAIMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIMember"


    // $ANTLR start "ruleSAIMember"
    // InternalAiDsl.g:297:1: ruleSAIMember returns [EObject current=null] : (this_SAIField_0= ruleSAIField | this_SAIMethod_1= ruleSAIMethod ) ;
    public final EObject ruleSAIMember() throws RecognitionException {
        EObject current = null;

        EObject this_SAIField_0 = null;

        EObject this_SAIMethod_1 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:303:2: ( (this_SAIField_0= ruleSAIField | this_SAIMethod_1= ruleSAIMethod ) )
            // InternalAiDsl.g:304:2: (this_SAIField_0= ruleSAIField | this_SAIMethod_1= ruleSAIMethod )
            {
            // InternalAiDsl.g:304:2: (this_SAIField_0= ruleSAIField | this_SAIMethod_1= ruleSAIMethod )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalAiDsl.g:305:3: this_SAIField_0= ruleSAIField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSAIMemberAccess().getSAIFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAIField_0=ruleSAIField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAIField_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:314:3: this_SAIMethod_1= ruleSAIMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSAIMemberAccess().getSAIMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAIMethod_1=ruleSAIMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAIMethod_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIMember"


    // $ANTLR start "entryRuleSAIField"
    // InternalAiDsl.g:326:1: entryRuleSAIField returns [EObject current=null] : iv_ruleSAIField= ruleSAIField EOF ;
    public final EObject entryRuleSAIField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIField = null;


        try {
            // InternalAiDsl.g:326:49: (iv_ruleSAIField= ruleSAIField EOF )
            // InternalAiDsl.g:327:2: iv_ruleSAIField= ruleSAIField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIField=ruleSAIField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIField"


    // $ANTLR start "ruleSAIField"
    // InternalAiDsl.g:333:1: ruleSAIField returns [EObject current=null] : (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ';' ) ;
    public final EObject ruleSAIField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SAITypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:339:2: ( (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ';' ) )
            // InternalAiDsl.g:340:2: (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ';' )
            {
            // InternalAiDsl.g:340:2: (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ';' )
            // InternalAiDsl.g:341:3: this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ';'
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSAIFieldRule());
              			}
              			newCompositeNode(grammarAccess.getSAIFieldAccess().getSAITypedDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_SAITypedDeclaration_0=ruleSAITypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SAITypedDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSAIFieldAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIField"


    // $ANTLR start "entryRuleSAIMethod"
    // InternalAiDsl.g:360:1: entryRuleSAIMethod returns [EObject current=null] : iv_ruleSAIMethod= ruleSAIMethod EOF ;
    public final EObject entryRuleSAIMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIMethod = null;


        try {
            // InternalAiDsl.g:360:50: (iv_ruleSAIMethod= ruleSAIMethod EOF )
            // InternalAiDsl.g:361:2: iv_ruleSAIMethod= ruleSAIMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIMethod=ruleSAIMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIMethod"


    // $ANTLR start "ruleSAIMethod"
    // InternalAiDsl.g:367:1: ruleSAIMethod returns [EObject current=null] : (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSAIParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) ) ) )? otherlv_5= ')' ( (lv_body_6_0= ruleSAIBlock ) ) ) ;
    public final EObject ruleSAIMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_SAITypedDeclaration_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:373:2: ( (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSAIParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) ) ) )? otherlv_5= ')' ( (lv_body_6_0= ruleSAIBlock ) ) ) )
            // InternalAiDsl.g:374:2: (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSAIParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) ) ) )? otherlv_5= ')' ( (lv_body_6_0= ruleSAIBlock ) ) )
            {
            // InternalAiDsl.g:374:2: (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSAIParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) ) ) )? otherlv_5= ')' ( (lv_body_6_0= ruleSAIBlock ) ) )
            // InternalAiDsl.g:375:3: this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSAIParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) ) ) )? otherlv_5= ')' ( (lv_body_6_0= ruleSAIBlock ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSAIMethodRule());
              			}
              			newCompositeNode(grammarAccess.getSAIMethodAccess().getSAITypedDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_SAITypedDeclaration_0=ruleSAITypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SAITypedDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSAIMethodAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAiDsl.g:390:3: ( ( (lv_params_2_0= ruleSAIParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=56 && LA7_0<=61)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAiDsl.g:391:4: ( (lv_params_2_0= ruleSAIParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) ) )
                    {
                    // InternalAiDsl.g:391:4: ( (lv_params_2_0= ruleSAIParameter ) )
                    // InternalAiDsl.g:392:5: (lv_params_2_0= ruleSAIParameter )
                    {
                    // InternalAiDsl.g:392:5: (lv_params_2_0= ruleSAIParameter )
                    // InternalAiDsl.g:393:6: lv_params_2_0= ruleSAIParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSAIMethodAccess().getParamsSAIParameterParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_params_2_0=ruleSAIParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSAIMethodRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_2_0,
                      							"de.mindscan.ai.aidsl.AiDsl.SAIParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAiDsl.g:410:4: (otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) ) )
                    // InternalAiDsl.g:411:5: otherlv_3= ',' ( (lv_params_4_0= ruleSAIParameter ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getSAIMethodAccess().getCommaKeyword_2_1_0());
                      				
                    }
                    // InternalAiDsl.g:415:5: ( (lv_params_4_0= ruleSAIParameter ) )
                    // InternalAiDsl.g:416:6: (lv_params_4_0= ruleSAIParameter )
                    {
                    // InternalAiDsl.g:416:6: (lv_params_4_0= ruleSAIParameter )
                    // InternalAiDsl.g:417:7: lv_params_4_0= ruleSAIParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSAIMethodAccess().getParamsSAIParameterParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
                    lv_params_4_0=ruleSAIParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSAIMethodRule());
                      							}
                      							add(
                      								current,
                      								"params",
                      								lv_params_4_0,
                      								"de.mindscan.ai.aidsl.AiDsl.SAIParameter");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSAIMethodAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAiDsl.g:440:3: ( (lv_body_6_0= ruleSAIBlock ) )
            // InternalAiDsl.g:441:4: (lv_body_6_0= ruleSAIBlock )
            {
            // InternalAiDsl.g:441:4: (lv_body_6_0= ruleSAIBlock )
            // InternalAiDsl.g:442:5: lv_body_6_0= ruleSAIBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSAIMethodAccess().getBodySAIBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleSAIBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSAIMethodRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"de.mindscan.ai.aidsl.AiDsl.SAIBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIMethod"


    // $ANTLR start "entryRuleSAIParameter"
    // InternalAiDsl.g:463:1: entryRuleSAIParameter returns [EObject current=null] : iv_ruleSAIParameter= ruleSAIParameter EOF ;
    public final EObject entryRuleSAIParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIParameter = null;


        try {
            // InternalAiDsl.g:463:53: (iv_ruleSAIParameter= ruleSAIParameter EOF )
            // InternalAiDsl.g:464:2: iv_ruleSAIParameter= ruleSAIParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIParameter=ruleSAIParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIParameter"


    // $ANTLR start "ruleSAIParameter"
    // InternalAiDsl.g:470:1: ruleSAIParameter returns [EObject current=null] : this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] ;
    public final EObject ruleSAIParameter() throws RecognitionException {
        EObject current = null;

        EObject this_SAITypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:476:2: (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] )
            // InternalAiDsl.g:477:2: this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current]
            {
            if ( state.backtracking==0 ) {

              		if (current==null) {
              			current = createModelElement(grammarAccess.getSAIParameterRule());
              		}
              		newCompositeNode(grammarAccess.getSAIParameterAccess().getSAITypedDeclarationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SAITypedDeclaration_0=ruleSAITypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SAITypedDeclaration_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIParameter"


    // $ANTLR start "entryRuleSAIBlock"
    // InternalAiDsl.g:491:1: entryRuleSAIBlock returns [EObject current=null] : iv_ruleSAIBlock= ruleSAIBlock EOF ;
    public final EObject entryRuleSAIBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIBlock = null;


        try {
            // InternalAiDsl.g:491:49: (iv_ruleSAIBlock= ruleSAIBlock EOF )
            // InternalAiDsl.g:492:2: iv_ruleSAIBlock= ruleSAIBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIBlock=ruleSAIBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIBlock"


    // $ANTLR start "ruleSAIBlock"
    // InternalAiDsl.g:498:1: ruleSAIBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSAIStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleSAIBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:504:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSAIStatement ) )* otherlv_3= '}' ) )
            // InternalAiDsl.g:505:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSAIStatement ) )* otherlv_3= '}' )
            {
            // InternalAiDsl.g:505:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSAIStatement ) )* otherlv_3= '}' )
            // InternalAiDsl.g:506:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleSAIStatement ) )* otherlv_3= '}'
            {
            // InternalAiDsl.g:506:3: ()
            // InternalAiDsl.g:507:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSAIBlockAccess().getSAIBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSAIBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalAiDsl.g:517:3: ( (lv_statements_2_0= ruleSAIStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)||(LA8_0>=19 && LA8_0<=20)||(LA8_0>=23 && LA8_0<=25)||(LA8_0>=56 && LA8_0<=61)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAiDsl.g:518:4: (lv_statements_2_0= ruleSAIStatement )
            	    {
            	    // InternalAiDsl.g:518:4: (lv_statements_2_0= ruleSAIStatement )
            	    // InternalAiDsl.g:519:5: lv_statements_2_0= ruleSAIStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSAIBlockAccess().getStatementsSAIStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_statements_2_0=ruleSAIStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSAIBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.SAIStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSAIBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIBlock"


    // $ANTLR start "entryRuleSAIStatement"
    // InternalAiDsl.g:544:1: entryRuleSAIStatement returns [EObject current=null] : iv_ruleSAIStatement= ruleSAIStatement EOF ;
    public final EObject entryRuleSAIStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIStatement = null;


        try {
            // InternalAiDsl.g:544:53: (iv_ruleSAIStatement= ruleSAIStatement EOF )
            // InternalAiDsl.g:545:2: iv_ruleSAIStatement= ruleSAIStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIStatement=ruleSAIStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIStatement"


    // $ANTLR start "ruleSAIStatement"
    // InternalAiDsl.g:551:1: ruleSAIStatement returns [EObject current=null] : (this_SAIVariableDeclaration_0= ruleSAIVariableDeclaration | this_SAIReturn_1= ruleSAIReturn | this_SAIExpression_2= ruleSAIExpression | this_SAIIfStatement_3= ruleSAIIfStatement ) ;
    public final EObject ruleSAIStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SAIVariableDeclaration_0 = null;

        EObject this_SAIReturn_1 = null;

        EObject this_SAIExpression_2 = null;

        EObject this_SAIIfStatement_3 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:557:2: ( (this_SAIVariableDeclaration_0= ruleSAIVariableDeclaration | this_SAIReturn_1= ruleSAIReturn | this_SAIExpression_2= ruleSAIExpression | this_SAIIfStatement_3= ruleSAIIfStatement ) )
            // InternalAiDsl.g:558:2: (this_SAIVariableDeclaration_0= ruleSAIVariableDeclaration | this_SAIReturn_1= ruleSAIReturn | this_SAIExpression_2= ruleSAIExpression | this_SAIIfStatement_3= ruleSAIIfStatement )
            {
            // InternalAiDsl.g:558:2: (this_SAIVariableDeclaration_0= ruleSAIVariableDeclaration | this_SAIReturn_1= ruleSAIReturn | this_SAIExpression_2= ruleSAIExpression | this_SAIIfStatement_3= ruleSAIIfStatement )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 23:
            case 24:
            case 25:
                {
                alt9=3;
                }
                break;
            case 20:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAiDsl.g:559:3: this_SAIVariableDeclaration_0= ruleSAIVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSAIStatementAccess().getSAIVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAIVariableDeclaration_0=ruleSAIVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAIVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:568:3: this_SAIReturn_1= ruleSAIReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSAIStatementAccess().getSAIReturnParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAIReturn_1=ruleSAIReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAIReturn_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:577:3: this_SAIExpression_2= ruleSAIExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSAIStatementAccess().getSAIExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAIExpression_2=ruleSAIExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAIExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:586:3: this_SAIIfStatement_3= ruleSAIIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSAIStatementAccess().getSAIIfStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAIIfStatement_3=ruleSAIIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAIIfStatement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIStatement"


    // $ANTLR start "entryRuleSAIVariableDeclaration"
    // InternalAiDsl.g:598:1: entryRuleSAIVariableDeclaration returns [EObject current=null] : iv_ruleSAIVariableDeclaration= ruleSAIVariableDeclaration EOF ;
    public final EObject entryRuleSAIVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIVariableDeclaration = null;


        try {
            // InternalAiDsl.g:598:63: (iv_ruleSAIVariableDeclaration= ruleSAIVariableDeclaration EOF )
            // InternalAiDsl.g:599:2: iv_ruleSAIVariableDeclaration= ruleSAIVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIVariableDeclaration=ruleSAIVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIVariableDeclaration"


    // $ANTLR start "ruleSAIVariableDeclaration"
    // InternalAiDsl.g:605:1: ruleSAIVariableDeclaration returns [EObject current=null] : (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ':=' ( (lv_expression_2_0= ruleSAIExpression ) ) ) ;
    public final EObject ruleSAIVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SAITypedDeclaration_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:611:2: ( (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ':=' ( (lv_expression_2_0= ruleSAIExpression ) ) ) )
            // InternalAiDsl.g:612:2: (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ':=' ( (lv_expression_2_0= ruleSAIExpression ) ) )
            {
            // InternalAiDsl.g:612:2: (this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ':=' ( (lv_expression_2_0= ruleSAIExpression ) ) )
            // InternalAiDsl.g:613:3: this_SAITypedDeclaration_0= ruleSAITypedDeclaration[$current] otherlv_1= ':=' ( (lv_expression_2_0= ruleSAIExpression ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSAIVariableDeclarationRule());
              			}
              			newCompositeNode(grammarAccess.getSAIVariableDeclarationAccess().getSAITypedDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_SAITypedDeclaration_0=ruleSAITypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SAITypedDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSAIVariableDeclarationAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalAiDsl.g:628:3: ( (lv_expression_2_0= ruleSAIExpression ) )
            // InternalAiDsl.g:629:4: (lv_expression_2_0= ruleSAIExpression )
            {
            // InternalAiDsl.g:629:4: (lv_expression_2_0= ruleSAIExpression )
            // InternalAiDsl.g:630:5: lv_expression_2_0= ruleSAIExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSAIVariableDeclarationAccess().getExpressionSAIExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleSAIExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSAIVariableDeclarationRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.SAIExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIVariableDeclaration"


    // $ANTLR start "entryRuleSAIReturn"
    // InternalAiDsl.g:651:1: entryRuleSAIReturn returns [EObject current=null] : iv_ruleSAIReturn= ruleSAIReturn EOF ;
    public final EObject entryRuleSAIReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIReturn = null;


        try {
            // InternalAiDsl.g:651:50: (iv_ruleSAIReturn= ruleSAIReturn EOF )
            // InternalAiDsl.g:652:2: iv_ruleSAIReturn= ruleSAIReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIReturn=ruleSAIReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIReturn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIReturn"


    // $ANTLR start "ruleSAIReturn"
    // InternalAiDsl.g:658:1: ruleSAIReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleSAIExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleSAIReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:664:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleSAIExpression ) ) otherlv_2= ';' ) )
            // InternalAiDsl.g:665:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleSAIExpression ) ) otherlv_2= ';' )
            {
            // InternalAiDsl.g:665:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleSAIExpression ) ) otherlv_2= ';' )
            // InternalAiDsl.g:666:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleSAIExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSAIReturnAccess().getReturnKeyword_0());
              		
            }
            // InternalAiDsl.g:670:3: ( (lv_expression_1_0= ruleSAIExpression ) )
            // InternalAiDsl.g:671:4: (lv_expression_1_0= ruleSAIExpression )
            {
            // InternalAiDsl.g:671:4: (lv_expression_1_0= ruleSAIExpression )
            // InternalAiDsl.g:672:5: lv_expression_1_0= ruleSAIExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSAIReturnAccess().getExpressionSAIExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_expression_1_0=ruleSAIExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSAIReturnRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.SAIExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSAIReturnAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIReturn"


    // $ANTLR start "entryRuleSAIIfStatement"
    // InternalAiDsl.g:697:1: entryRuleSAIIfStatement returns [EObject current=null] : iv_ruleSAIIfStatement= ruleSAIIfStatement EOF ;
    public final EObject entryRuleSAIIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIIfStatement = null;


        try {
            // InternalAiDsl.g:697:55: (iv_ruleSAIIfStatement= ruleSAIIfStatement EOF )
            // InternalAiDsl.g:698:2: iv_ruleSAIIfStatement= ruleSAIIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIIfStatement=ruleSAIIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIIfStatement"


    // $ANTLR start "ruleSAIIfStatement"
    // InternalAiDsl.g:704:1: ruleSAIIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSAIExpression ) ) otherlv_3= ')' ( (lv_thenblock_4_0= ruleSAIIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSAIIfBlock ) ) )? ) ;
    public final EObject ruleSAIIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenblock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:710:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSAIExpression ) ) otherlv_3= ')' ( (lv_thenblock_4_0= ruleSAIIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSAIIfBlock ) ) )? ) )
            // InternalAiDsl.g:711:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSAIExpression ) ) otherlv_3= ')' ( (lv_thenblock_4_0= ruleSAIIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSAIIfBlock ) ) )? )
            {
            // InternalAiDsl.g:711:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSAIExpression ) ) otherlv_3= ')' ( (lv_thenblock_4_0= ruleSAIIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSAIIfBlock ) ) )? )
            // InternalAiDsl.g:712:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSAIExpression ) ) otherlv_3= ')' ( (lv_thenblock_4_0= ruleSAIIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSAIIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSAIIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSAIIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAiDsl.g:720:3: ( (lv_expression_2_0= ruleSAIExpression ) )
            // InternalAiDsl.g:721:4: (lv_expression_2_0= ruleSAIExpression )
            {
            // InternalAiDsl.g:721:4: (lv_expression_2_0= ruleSAIExpression )
            // InternalAiDsl.g:722:5: lv_expression_2_0= ruleSAIExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSAIIfStatementAccess().getExpressionSAIExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_expression_2_0=ruleSAIExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSAIIfStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.SAIExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSAIIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAiDsl.g:743:3: ( (lv_thenblock_4_0= ruleSAIIfBlock ) )
            // InternalAiDsl.g:744:4: (lv_thenblock_4_0= ruleSAIIfBlock )
            {
            // InternalAiDsl.g:744:4: (lv_thenblock_4_0= ruleSAIIfBlock )
            // InternalAiDsl.g:745:5: lv_thenblock_4_0= ruleSAIIfBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSAIIfStatementAccess().getThenblockSAIIfBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_thenblock_4_0=ruleSAIIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSAIIfStatementRule());
              					}
              					set(
              						current,
              						"thenblock",
              						lv_thenblock_4_0,
              						"de.mindscan.ai.aidsl.AiDsl.SAIIfBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAiDsl.g:762:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSAIIfBlock ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred1_InternalAiDsl()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalAiDsl.g:763:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSAIIfBlock ) )
                    {
                    // InternalAiDsl.g:763:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalAiDsl.g:764:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSAIIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalAiDsl.g:770:4: ( (lv_elseBlock_6_0= ruleSAIIfBlock ) )
                    // InternalAiDsl.g:771:5: (lv_elseBlock_6_0= ruleSAIIfBlock )
                    {
                    // InternalAiDsl.g:771:5: (lv_elseBlock_6_0= ruleSAIIfBlock )
                    // InternalAiDsl.g:772:6: lv_elseBlock_6_0= ruleSAIIfBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSAIIfStatementAccess().getElseBlockSAIIfBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleSAIIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSAIIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_6_0,
                      							"de.mindscan.ai.aidsl.AiDsl.SAIIfBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIIfStatement"


    // $ANTLR start "entryRuleSAIIfBlock"
    // InternalAiDsl.g:794:1: entryRuleSAIIfBlock returns [EObject current=null] : iv_ruleSAIIfBlock= ruleSAIIfBlock EOF ;
    public final EObject entryRuleSAIIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIIfBlock = null;


        try {
            // InternalAiDsl.g:794:51: (iv_ruleSAIIfBlock= ruleSAIIfBlock EOF )
            // InternalAiDsl.g:795:2: iv_ruleSAIIfBlock= ruleSAIIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIIfBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIIfBlock=ruleSAIIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIIfBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIIfBlock"


    // $ANTLR start "ruleSAIIfBlock"
    // InternalAiDsl.g:801:1: ruleSAIIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleSAIStatement ) ) | this_SAIBlock_1= ruleSAIBlock ) ;
    public final EObject ruleSAIIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_SAIBlock_1 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:807:2: ( ( ( (lv_statements_0_0= ruleSAIStatement ) ) | this_SAIBlock_1= ruleSAIBlock ) )
            // InternalAiDsl.g:808:2: ( ( (lv_statements_0_0= ruleSAIStatement ) ) | this_SAIBlock_1= ruleSAIBlock )
            {
            // InternalAiDsl.g:808:2: ( ( (lv_statements_0_0= ruleSAIStatement ) ) | this_SAIBlock_1= ruleSAIBlock )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_INT)||(LA11_0>=19 && LA11_0<=20)||(LA11_0>=23 && LA11_0<=25)||(LA11_0>=56 && LA11_0<=61)) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAiDsl.g:809:3: ( (lv_statements_0_0= ruleSAIStatement ) )
                    {
                    // InternalAiDsl.g:809:3: ( (lv_statements_0_0= ruleSAIStatement ) )
                    // InternalAiDsl.g:810:4: (lv_statements_0_0= ruleSAIStatement )
                    {
                    // InternalAiDsl.g:810:4: (lv_statements_0_0= ruleSAIStatement )
                    // InternalAiDsl.g:811:5: lv_statements_0_0= ruleSAIStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSAIIfBlockAccess().getStatementsSAIStatementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_statements_0_0=ruleSAIStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSAIIfBlockRule());
                      					}
                      					add(
                      						current,
                      						"statements",
                      						lv_statements_0_0,
                      						"de.mindscan.ai.aidsl.AiDsl.SAIStatement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:829:3: this_SAIBlock_1= ruleSAIBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSAIIfBlockAccess().getSAIBlockParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SAIBlock_1=ruleSAIBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SAIBlock_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIIfBlock"


    // $ANTLR start "ruleSAITypedDeclaration"
    // InternalAiDsl.g:842:1: ruleSAITypedDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_type_0_0= ruleELEMENTTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSAITypedDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:848:2: ( ( ( (lv_type_0_0= ruleELEMENTTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAiDsl.g:849:2: ( ( (lv_type_0_0= ruleELEMENTTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAiDsl.g:849:2: ( ( (lv_type_0_0= ruleELEMENTTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAiDsl.g:850:3: ( (lv_type_0_0= ruleELEMENTTYPE ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAiDsl.g:850:3: ( (lv_type_0_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:851:4: (lv_type_0_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:851:4: (lv_type_0_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:852:5: lv_type_0_0= ruleELEMENTTYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSAITypedDeclarationAccess().getTypeELEMENTTYPEParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleELEMENTTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSAITypedDeclarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"de.mindscan.ai.aidsl.AiDsl.ELEMENTTYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAiDsl.g:869:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:870:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:870:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:871:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSAITypedDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSAITypedDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAITypedDeclaration"


    // $ANTLR start "entryRuleSAIExpression"
    // InternalAiDsl.g:891:1: entryRuleSAIExpression returns [EObject current=null] : iv_ruleSAIExpression= ruleSAIExpression EOF ;
    public final EObject entryRuleSAIExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIExpression = null;


        try {
            // InternalAiDsl.g:891:54: (iv_ruleSAIExpression= ruleSAIExpression EOF )
            // InternalAiDsl.g:892:2: iv_ruleSAIExpression= ruleSAIExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIExpression=ruleSAIExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIExpression"


    // $ANTLR start "ruleSAIExpression"
    // InternalAiDsl.g:898:1: ruleSAIExpression returns [EObject current=null] : this_SAIAssignment_0= ruleSAIAssignment ;
    public final EObject ruleSAIExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SAIAssignment_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:904:2: (this_SAIAssignment_0= ruleSAIAssignment )
            // InternalAiDsl.g:905:2: this_SAIAssignment_0= ruleSAIAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSAIExpressionAccess().getSAIAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SAIAssignment_0=ruleSAIAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SAIAssignment_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIExpression"


    // $ANTLR start "entryRuleSAIAssignment"
    // InternalAiDsl.g:916:1: entryRuleSAIAssignment returns [EObject current=null] : iv_ruleSAIAssignment= ruleSAIAssignment EOF ;
    public final EObject entryRuleSAIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAIAssignment = null;


        try {
            // InternalAiDsl.g:916:54: (iv_ruleSAIAssignment= ruleSAIAssignment EOF )
            // InternalAiDsl.g:917:2: iv_ruleSAIAssignment= ruleSAIAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAIAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAIAssignment=ruleSAIAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAIAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAIAssignment"


    // $ANTLR start "ruleSAIAssignment"
    // InternalAiDsl.g:923:1: ruleSAIAssignment returns [EObject current=null] : (this_SAISelectionExpression_0= ruleSAISelectionExpression ( () otherlv_2= ':=' ( (lv_right_3_0= ruleSAIExpression ) ) )? ) ;
    public final EObject ruleSAIAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SAISelectionExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:929:2: ( (this_SAISelectionExpression_0= ruleSAISelectionExpression ( () otherlv_2= ':=' ( (lv_right_3_0= ruleSAIExpression ) ) )? ) )
            // InternalAiDsl.g:930:2: (this_SAISelectionExpression_0= ruleSAISelectionExpression ( () otherlv_2= ':=' ( (lv_right_3_0= ruleSAIExpression ) ) )? )
            {
            // InternalAiDsl.g:930:2: (this_SAISelectionExpression_0= ruleSAISelectionExpression ( () otherlv_2= ':=' ( (lv_right_3_0= ruleSAIExpression ) ) )? )
            // InternalAiDsl.g:931:3: this_SAISelectionExpression_0= ruleSAISelectionExpression ( () otherlv_2= ':=' ( (lv_right_3_0= ruleSAIExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSAIAssignmentAccess().getSAISelectionExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_SAISelectionExpression_0=ruleSAISelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SAISelectionExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAiDsl.g:939:3: ( () otherlv_2= ':=' ( (lv_right_3_0= ruleSAIExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAiDsl.g:940:4: () otherlv_2= ':=' ( (lv_right_3_0= ruleSAIExpression ) )
                    {
                    // InternalAiDsl.g:940:4: ()
                    // InternalAiDsl.g:941:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getSAIAssignmentAccess().getSAIAssignmentLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSAIAssignmentAccess().getColonEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalAiDsl.g:951:4: ( (lv_right_3_0= ruleSAIExpression ) )
                    // InternalAiDsl.g:952:5: (lv_right_3_0= ruleSAIExpression )
                    {
                    // InternalAiDsl.g:952:5: (lv_right_3_0= ruleSAIExpression )
                    // InternalAiDsl.g:953:6: lv_right_3_0= ruleSAIExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSAIAssignmentAccess().getRightSAIExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleSAIExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSAIAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"de.mindscan.ai.aidsl.AiDsl.SAIExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAIAssignment"


    // $ANTLR start "entryRuleSAISelectionExpression"
    // InternalAiDsl.g:975:1: entryRuleSAISelectionExpression returns [EObject current=null] : iv_ruleSAISelectionExpression= ruleSAISelectionExpression EOF ;
    public final EObject entryRuleSAISelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAISelectionExpression = null;


        try {
            // InternalAiDsl.g:975:63: (iv_ruleSAISelectionExpression= ruleSAISelectionExpression EOF )
            // InternalAiDsl.g:976:2: iv_ruleSAISelectionExpression= ruleSAISelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAISelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAISelectionExpression=ruleSAISelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAISelectionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAISelectionExpression"


    // $ANTLR start "ruleSAISelectionExpression"
    // InternalAiDsl.g:982:1: ruleSAISelectionExpression returns [EObject current=null] : (this_SAITerminalExpression_0= ruleSAITerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleSAISelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_methodinvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_SAITerminalExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:988:2: ( (this_SAITerminalExpression_0= ruleSAITerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // InternalAiDsl.g:989:2: (this_SAITerminalExpression_0= ruleSAITerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // InternalAiDsl.g:989:2: (this_SAITerminalExpression_0= ruleSAITerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')' )? )* )
            // InternalAiDsl.g:990:3: this_SAITerminalExpression_0= ruleSAITerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSAISelectionExpressionAccess().getSAITerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_SAITerminalExpression_0=ruleSAITerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SAITerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAiDsl.g:998:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')' )? )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAiDsl.g:999:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalAiDsl.g:999:4: ()
            	    // InternalAiDsl.g:1000:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSAISelectionExpressionAccess().getSAIMemberSelectionReceiverAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSAISelectionExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalAiDsl.g:1010:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalAiDsl.g:1011:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAiDsl.g:1011:5: (otherlv_3= RULE_ID )
            	    // InternalAiDsl.g:1012:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSAISelectionExpressionRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getSAISelectionExpressionAccess().getMemberSAIMemberCrossReference_1_2_0());
            	      					
            	    }

            	    }


            	    }

            	    // InternalAiDsl.g:1023:4: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==15) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalAiDsl.g:1024:5: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // InternalAiDsl.g:1024:5: ( (lv_methodinvocation_4_0= '(' ) )
            	            // InternalAiDsl.g:1025:6: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // InternalAiDsl.g:1025:6: (lv_methodinvocation_4_0= '(' )
            	            // InternalAiDsl.g:1026:7: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_methodinvocation_4_0, grammarAccess.getSAISelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getSAISelectionExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "methodinvocation", lv_methodinvocation_4_0 != null, "(");
            	              						
            	            }

            	            }


            	            }

            	            // InternalAiDsl.g:1038:5: ( ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )* )?
            	            int alt14=2;
            	            int LA14_0 = input.LA(1);

            	            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_INT)||(LA14_0>=23 && LA14_0<=25)) ) {
            	                alt14=1;
            	            }
            	            switch (alt14) {
            	                case 1 :
            	                    // InternalAiDsl.g:1039:6: ( (lv_args_5_0= ruleSAIExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )*
            	                    {
            	                    // InternalAiDsl.g:1039:6: ( (lv_args_5_0= ruleSAIExpression ) )
            	                    // InternalAiDsl.g:1040:7: (lv_args_5_0= ruleSAIExpression )
            	                    {
            	                    // InternalAiDsl.g:1040:7: (lv_args_5_0= ruleSAIExpression )
            	                    // InternalAiDsl.g:1041:8: lv_args_5_0= ruleSAIExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      								newCompositeNode(grammarAccess.getSAISelectionExpressionAccess().getArgsSAIExpressionParserRuleCall_1_3_1_0_0());
            	                      							
            	                    }
            	                    pushFollow(FOLLOW_23);
            	                    lv_args_5_0=ruleSAIExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								if (current==null) {
            	                      									current = createModelElementForParent(grammarAccess.getSAISelectionExpressionRule());
            	                      								}
            	                      								add(
            	                      									current,
            	                      									"args",
            	                      									lv_args_5_0,
            	                      									"de.mindscan.ai.aidsl.AiDsl.SAIExpression");
            	                      								afterParserOrEnumRuleCall();
            	                      							
            	                    }

            	                    }


            	                    }

            	                    // InternalAiDsl.g:1058:6: (otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) ) )*
            	                    loop13:
            	                    do {
            	                        int alt13=2;
            	                        int LA13_0 = input.LA(1);

            	                        if ( (LA13_0==16) ) {
            	                            alt13=1;
            	                        }


            	                        switch (alt13) {
            	                    	case 1 :
            	                    	    // InternalAiDsl.g:1059:7: otherlv_6= ',' ( (lv_args_7_0= ruleSAIExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,16,FOLLOW_16); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      							newLeafNode(otherlv_6, grammarAccess.getSAISelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	      						
            	                    	    }
            	                    	    // InternalAiDsl.g:1063:7: ( (lv_args_7_0= ruleSAIExpression ) )
            	                    	    // InternalAiDsl.g:1064:8: (lv_args_7_0= ruleSAIExpression )
            	                    	    {
            	                    	    // InternalAiDsl.g:1064:8: (lv_args_7_0= ruleSAIExpression )
            	                    	    // InternalAiDsl.g:1065:9: lv_args_7_0= ruleSAIExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newCompositeNode(grammarAccess.getSAISelectionExpressionAccess().getArgsSAIExpressionParserRuleCall_1_3_1_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    pushFollow(FOLLOW_23);
            	                    	    lv_args_7_0=ruleSAIExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									if (current==null) {
            	                    	      										current = createModelElementForParent(grammarAccess.getSAISelectionExpressionRule());
            	                    	      									}
            	                    	      									add(
            	                    	      										current,
            	                    	      										"args",
            	                    	      										lv_args_7_0,
            	                    	      										"de.mindscan.ai.aidsl.AiDsl.SAIExpression");
            	                    	      									afterParserOrEnumRuleCall();
            	                    	      								
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop13;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,17,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_8, grammarAccess.getSAISelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAISelectionExpression"


    // $ANTLR start "entryRuleSAITerminalExpression"
    // InternalAiDsl.g:1094:1: entryRuleSAITerminalExpression returns [EObject current=null] : iv_ruleSAITerminalExpression= ruleSAITerminalExpression EOF ;
    public final EObject entryRuleSAITerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAITerminalExpression = null;


        try {
            // InternalAiDsl.g:1094:62: (iv_ruleSAITerminalExpression= ruleSAITerminalExpression EOF )
            // InternalAiDsl.g:1095:2: iv_ruleSAITerminalExpression= ruleSAITerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSAITerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSAITerminalExpression=ruleSAITerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSAITerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAITerminalExpression"


    // $ANTLR start "ruleSAITerminalExpression"
    // InternalAiDsl.g:1101:1: ruleSAITerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'null' ) ) ;
    public final EObject ruleSAITerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAiDsl.g:1107:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'null' ) ) )
            // InternalAiDsl.g:1108:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'null' ) )
            {
            // InternalAiDsl.g:1108:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'null' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case 23:
            case 24:
                {
                alt18=3;
                }
                break;
            case 25:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAiDsl.g:1109:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalAiDsl.g:1109:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalAiDsl.g:1110:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalAiDsl.g:1110:4: ()
                    // InternalAiDsl.g:1111:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSAITerminalExpressionAccess().getSAIStringConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAiDsl.g:1117:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalAiDsl.g:1118:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalAiDsl.g:1118:5: (lv_value_1_0= RULE_STRING )
                    // InternalAiDsl.g:1119:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getSAITerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSAITerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"de.mindscan.ai.aidsl.AiDsl.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:1137:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalAiDsl.g:1137:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalAiDsl.g:1138:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalAiDsl.g:1138:4: ()
                    // InternalAiDsl.g:1139:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSAITerminalExpressionAccess().getSAIIntConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAiDsl.g:1145:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalAiDsl.g:1146:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalAiDsl.g:1146:5: (lv_value_3_0= RULE_INT )
                    // InternalAiDsl.g:1147:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getSAITerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSAITerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"de.mindscan.ai.aidsl.AiDsl.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:1165:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalAiDsl.g:1165:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalAiDsl.g:1166:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalAiDsl.g:1166:4: ()
                    // InternalAiDsl.g:1167:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSAITerminalExpressionAccess().getSAIBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAiDsl.g:1173:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalAiDsl.g:1174:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalAiDsl.g:1174:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalAiDsl.g:1175:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalAiDsl.g:1175:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==23) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==24) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAiDsl.g:1176:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_1, grammarAccess.getSAITerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSAITerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalAiDsl.g:1187:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_2, grammarAccess.getSAITerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSAITerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:1202:3: ( () otherlv_7= 'null' )
                    {
                    // InternalAiDsl.g:1202:3: ( () otherlv_7= 'null' )
                    // InternalAiDsl.g:1203:4: () otherlv_7= 'null'
                    {
                    // InternalAiDsl.g:1203:4: ()
                    // InternalAiDsl.g:1204:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSAITerminalExpressionAccess().getSAINullAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSAITerminalExpressionAccess().getNullKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAITerminalExpression"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalAiDsl.g:1219:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAiDsl.g:1219:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAiDsl.g:1220:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalAiDsl.g:1226:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1232:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:1233:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:1233:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:1234:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
              		
            }
            // InternalAiDsl.g:1238:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAiDsl.g:1239:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:1239:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAiDsl.g:1240:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalAiDsl.g:1261:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // InternalAiDsl.g:1261:58: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // InternalAiDsl.g:1262:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // InternalAiDsl.g:1268:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1274:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAiDsl.g:1275:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAiDsl.g:1275:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAiDsl.g:1276:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
              		
            }
            // InternalAiDsl.g:1280:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAiDsl.g:1281:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAiDsl.g:1281:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAiDsl.g:1282:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleWorkflowInputDefinition"
    // InternalAiDsl.g:1303:1: entryRuleWorkflowInputDefinition returns [EObject current=null] : iv_ruleWorkflowInputDefinition= ruleWorkflowInputDefinition EOF ;
    public final EObject entryRuleWorkflowInputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowInputDefinition = null;


        try {
            // InternalAiDsl.g:1303:64: (iv_ruleWorkflowInputDefinition= ruleWorkflowInputDefinition EOF )
            // InternalAiDsl.g:1304:2: iv_ruleWorkflowInputDefinition= ruleWorkflowInputDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowInputDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowInputDefinition=ruleWorkflowInputDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowInputDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowInputDefinition"


    // $ANTLR start "ruleWorkflowInputDefinition"
    // InternalAiDsl.g:1310:1: ruleWorkflowInputDefinition returns [EObject current=null] : (otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkflowInputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_uiElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1316:2: ( (otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:1317:2: (otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:1317:2: (otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:1318:3: otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkflowInputDefinitionAccess().getDatainputKeyword_0());
              		
            }
            // InternalAiDsl.g:1322:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:1323:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:1323:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:1324:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowInputDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowInputDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkflowInputDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAiDsl.g:1344:3: ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAiDsl.g:1345:4: (lv_uiElements_3_0= ruleWorkflowUIElement )
            	    {
            	    // InternalAiDsl.g:1345:4: (lv_uiElements_3_0= ruleWorkflowUIElement )
            	    // InternalAiDsl.g:1346:5: lv_uiElements_3_0= ruleWorkflowUIElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkflowInputDefinitionAccess().getUiElementsWorkflowUIElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_uiElements_3_0=ruleWorkflowUIElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWorkflowInputDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"uiElements",
            	      						lv_uiElements_3_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.WorkflowUIElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWorkflowInputDefinitionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowInputDefinition"


    // $ANTLR start "entryRuleWorkflowUIElement"
    // InternalAiDsl.g:1371:1: entryRuleWorkflowUIElement returns [EObject current=null] : iv_ruleWorkflowUIElement= ruleWorkflowUIElement EOF ;
    public final EObject entryRuleWorkflowUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowUIElement = null;


        try {
            // InternalAiDsl.g:1371:58: (iv_ruleWorkflowUIElement= ruleWorkflowUIElement EOF )
            // InternalAiDsl.g:1372:2: iv_ruleWorkflowUIElement= ruleWorkflowUIElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowUIElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowUIElement=ruleWorkflowUIElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowUIElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowUIElement"


    // $ANTLR start "ruleWorkflowUIElement"
    // InternalAiDsl.g:1378:1: ruleWorkflowUIElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )? ) ;
    public final EObject ruleWorkflowUIElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_datatype_2_0 = null;

        EObject lv_uielement_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1384:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )? ) )
            // InternalAiDsl.g:1385:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )? )
            {
            // InternalAiDsl.g:1385:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )? )
            // InternalAiDsl.g:1386:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )?
            {
            // InternalAiDsl.g:1386:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalAiDsl.g:1387:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:1387:4: (lv_name_0_0= ruleQualifiedName )
            // InternalAiDsl.g:1388:5: lv_name_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkflowUIElementAccess().getNameQualifiedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWorkflowUIElementRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.mindscan.ai.aidsl.AiDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWorkflowUIElementAccess().getColonKeyword_1());
              		
            }
            // InternalAiDsl.g:1409:3: ( (lv_datatype_2_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:1410:4: (lv_datatype_2_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:1410:4: (lv_datatype_2_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:1411:5: lv_datatype_2_0= ruleELEMENTTYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkflowUIElementAccess().getDatatypeELEMENTTYPEParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_datatype_2_0=ruleELEMENTTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWorkflowUIElementRule());
              					}
              					set(
              						current,
              						"datatype",
              						lv_datatype_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.ELEMENTTYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAiDsl.g:1428:3: ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAiDsl.g:1429:4: (lv_uielement_3_0= ruleWorkflowUIElementMap )
                    {
                    // InternalAiDsl.g:1429:4: (lv_uielement_3_0= ruleWorkflowUIElementMap )
                    // InternalAiDsl.g:1430:5: lv_uielement_3_0= ruleWorkflowUIElementMap
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getWorkflowUIElementAccess().getUielementWorkflowUIElementMapParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_uielement_3_0=ruleWorkflowUIElementMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getWorkflowUIElementRule());
                      					}
                      					set(
                      						current,
                      						"uielement",
                      						lv_uielement_3_0,
                      						"de.mindscan.ai.aidsl.AiDsl.WorkflowUIElementMap");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowUIElement"


    // $ANTLR start "entryRuleWorkflowUIElementMap"
    // InternalAiDsl.g:1451:1: entryRuleWorkflowUIElementMap returns [EObject current=null] : iv_ruleWorkflowUIElementMap= ruleWorkflowUIElementMap EOF ;
    public final EObject entryRuleWorkflowUIElementMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowUIElementMap = null;


        try {
            // InternalAiDsl.g:1451:61: (iv_ruleWorkflowUIElementMap= ruleWorkflowUIElementMap EOF )
            // InternalAiDsl.g:1452:2: iv_ruleWorkflowUIElementMap= ruleWorkflowUIElementMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowUIElementMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowUIElementMap=ruleWorkflowUIElementMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowUIElementMap; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowUIElementMap"


    // $ANTLR start "ruleWorkflowUIElementMap"
    // InternalAiDsl.g:1458:1: ruleWorkflowUIElementMap returns [EObject current=null] : (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' ( (lv_options_9_0= ruleDataDictionaryArrayValue ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleWorkflowUIElementMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token lv_uitype_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_defaultvalue_7_0 = null;

        EObject lv_options_9_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1464:2: ( (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' ( (lv_options_9_0= ruleDataDictionaryArrayValue ) ) )? otherlv_10= '}' ) )
            // InternalAiDsl.g:1465:2: (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' ( (lv_options_9_0= ruleDataDictionaryArrayValue ) ) )? otherlv_10= '}' )
            {
            // InternalAiDsl.g:1465:2: (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' ( (lv_options_9_0= ruleDataDictionaryArrayValue ) ) )? otherlv_10= '}' )
            // InternalAiDsl.g:1466:3: otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' ( (lv_options_9_0= ruleDataDictionaryArrayValue ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkflowUIElementMapAccess().getUiKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWorkflowUIElementMapAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkflowUIElementMapAccess().getLabelKeyword_2());
              		
            }
            // InternalAiDsl.g:1478:3: ( (lv_label_3_0= RULE_STRING ) )
            // InternalAiDsl.g:1479:4: (lv_label_3_0= RULE_STRING )
            {
            // InternalAiDsl.g:1479:4: (lv_label_3_0= RULE_STRING )
            // InternalAiDsl.g:1480:5: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_label_3_0, grammarAccess.getWorkflowUIElementMapAccess().getLabelSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowUIElementMapRule());
              					}
              					setWithLastConsumed(
              						current,
              						"label",
              						lv_label_3_0,
              						"de.mindscan.ai.aidsl.AiDsl.STRING");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWorkflowUIElementMapAccess().getUitypeKeyword_4());
              		
            }
            // InternalAiDsl.g:1500:3: ( (lv_uitype_5_0= RULE_STRING ) )
            // InternalAiDsl.g:1501:4: (lv_uitype_5_0= RULE_STRING )
            {
            // InternalAiDsl.g:1501:4: (lv_uitype_5_0= RULE_STRING )
            // InternalAiDsl.g:1502:5: lv_uitype_5_0= RULE_STRING
            {
            lv_uitype_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_uitype_5_0, grammarAccess.getWorkflowUIElementMapAccess().getUitypeSTRINGTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowUIElementMapRule());
              					}
              					setWithLastConsumed(
              						current,
              						"uitype",
              						lv_uitype_5_0,
              						"de.mindscan.ai.aidsl.AiDsl.STRING");
              				
            }

            }


            }

            // InternalAiDsl.g:1518:3: (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAiDsl.g:1519:4: otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getWorkflowUIElementMapAccess().getDefaultKeyword_6_0());
                      			
                    }
                    // InternalAiDsl.g:1523:4: ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) )
                    // InternalAiDsl.g:1524:5: (lv_defaultvalue_7_0= ruleDataDictionaryValue )
                    {
                    // InternalAiDsl.g:1524:5: (lv_defaultvalue_7_0= ruleDataDictionaryValue )
                    // InternalAiDsl.g:1525:6: lv_defaultvalue_7_0= ruleDataDictionaryValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWorkflowUIElementMapAccess().getDefaultvalueDataDictionaryValueParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_defaultvalue_7_0=ruleDataDictionaryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWorkflowUIElementMapRule());
                      						}
                      						set(
                      							current,
                      							"defaultvalue",
                      							lv_defaultvalue_7_0,
                      							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAiDsl.g:1543:3: (otherlv_8= 'options' ( (lv_options_9_0= ruleDataDictionaryArrayValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAiDsl.g:1544:4: otherlv_8= 'options' ( (lv_options_9_0= ruleDataDictionaryArrayValue ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getWorkflowUIElementMapAccess().getOptionsKeyword_7_0());
                      			
                    }
                    // InternalAiDsl.g:1548:4: ( (lv_options_9_0= ruleDataDictionaryArrayValue ) )
                    // InternalAiDsl.g:1549:5: (lv_options_9_0= ruleDataDictionaryArrayValue )
                    {
                    // InternalAiDsl.g:1549:5: (lv_options_9_0= ruleDataDictionaryArrayValue )
                    // InternalAiDsl.g:1550:6: lv_options_9_0= ruleDataDictionaryArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWorkflowUIElementMapAccess().getOptionsDataDictionaryArrayValueParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_options_9_0=ruleDataDictionaryArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWorkflowUIElementMapRule());
                      						}
                      						set(
                      							current,
                      							"options",
                      							lv_options_9_0,
                      							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryArrayValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getWorkflowUIElementMapAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowUIElementMap"


    // $ANTLR start "entryRuleWorkflowDataDictionaryDefinition"
    // InternalAiDsl.g:1576:1: entryRuleWorkflowDataDictionaryDefinition returns [EObject current=null] : iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF ;
    public final EObject entryRuleWorkflowDataDictionaryDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDataDictionaryDefinition = null;


        try {
            // InternalAiDsl.g:1576:73: (iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF )
            // InternalAiDsl.g:1577:2: iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowDataDictionaryDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDataDictionaryDefinition=ruleWorkflowDataDictionaryDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowDataDictionaryDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowDataDictionaryDefinition"


    // $ANTLR start "ruleWorkflowDataDictionaryDefinition"
    // InternalAiDsl.g:1583:1: ruleWorkflowDataDictionaryDefinition returns [EObject current=null] : (otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkflowDataDictionaryDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_keyValuePairs_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1589:2: ( (otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:1590:2: (otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:1590:2: (otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}' )
            // InternalAiDsl.g:1591:3: otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getDatadictionaryKeyword_0());
              		
            }
            // InternalAiDsl.g:1595:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:1596:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:1596:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:1597:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowDataDictionaryDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAiDsl.g:1617:3: ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAiDsl.g:1618:4: (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair )
            	    {
            	    // InternalAiDsl.g:1618:4: (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair )
            	    // InternalAiDsl.g:1619:5: lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getKeyValuePairsDatadictionaryKeyValuePairParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_keyValuePairs_3_0=ruleDatadictionaryKeyValuePair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWorkflowDataDictionaryDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"keyValuePairs",
            	      						lv_keyValuePairs_3_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.DatadictionaryKeyValuePair");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowDataDictionaryDefinition"


    // $ANTLR start "entryRuleDatadictionaryKeyValuePair"
    // InternalAiDsl.g:1644:1: entryRuleDatadictionaryKeyValuePair returns [EObject current=null] : iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF ;
    public final EObject entryRuleDatadictionaryKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatadictionaryKeyValuePair = null;


        try {
            // InternalAiDsl.g:1644:67: (iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF )
            // InternalAiDsl.g:1645:2: iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatadictionaryKeyValuePairRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDatadictionaryKeyValuePair=ruleDatadictionaryKeyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatadictionaryKeyValuePair; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatadictionaryKeyValuePair"


    // $ANTLR start "ruleDatadictionaryKeyValuePair"
    // InternalAiDsl.g:1651:1: ruleDatadictionaryKeyValuePair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) ) ) ;
    public final EObject ruleDatadictionaryKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1657:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) ) ) )
            // InternalAiDsl.g:1658:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) ) )
            {
            // InternalAiDsl.g:1658:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) ) )
            // InternalAiDsl.g:1659:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) )
            {
            // InternalAiDsl.g:1659:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAiDsl.g:1660:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAiDsl.g:1660:4: (lv_name_0_0= RULE_ID )
            // InternalAiDsl.g:1661:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDatadictionaryKeyValuePairAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDatadictionaryKeyValuePairRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            // InternalAiDsl.g:1677:3: (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAiDsl.g:1678:4: otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDatadictionaryKeyValuePairAccess().getExtendsKeyword_1_0());
                      			
                    }
                    // InternalAiDsl.g:1682:4: ( (otherlv_2= RULE_ID ) )
                    // InternalAiDsl.g:1683:5: (otherlv_2= RULE_ID )
                    {
                    // InternalAiDsl.g:1683:5: (otherlv_2= RULE_ID )
                    // InternalAiDsl.g:1684:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDatadictionaryKeyValuePairRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getDatadictionaryKeyValuePairAccess().getExtendsDatadictionaryKeyValuePairCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDatadictionaryKeyValuePairAccess().getColonKeyword_2());
              		
            }
            // InternalAiDsl.g:1700:3: ( (lv_value_4_0= ruleDataDictionaryValue ) )
            // InternalAiDsl.g:1701:4: (lv_value_4_0= ruleDataDictionaryValue )
            {
            // InternalAiDsl.g:1701:4: (lv_value_4_0= ruleDataDictionaryValue )
            // InternalAiDsl.g:1702:5: lv_value_4_0= ruleDataDictionaryValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDatadictionaryKeyValuePairAccess().getValueDataDictionaryValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleDataDictionaryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDatadictionaryKeyValuePairRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"de.mindscan.ai.aidsl.AiDsl.DataDictionaryValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatadictionaryKeyValuePair"


    // $ANTLR start "entryRuleDataDictionaryValue"
    // InternalAiDsl.g:1723:1: entryRuleDataDictionaryValue returns [EObject current=null] : iv_ruleDataDictionaryValue= ruleDataDictionaryValue EOF ;
    public final EObject entryRuleDataDictionaryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryValue = null;


        try {
            // InternalAiDsl.g:1723:60: (iv_ruleDataDictionaryValue= ruleDataDictionaryValue EOF )
            // InternalAiDsl.g:1724:2: iv_ruleDataDictionaryValue= ruleDataDictionaryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDictionaryValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryValue=ruleDataDictionaryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDictionaryValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDictionaryValue"


    // $ANTLR start "ruleDataDictionaryValue"
    // InternalAiDsl.g:1730:1: ruleDataDictionaryValue returns [EObject current=null] : ( () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) ) ) ;
    public final EObject ruleDataDictionaryValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_1_3 = null;

        EObject lv_value_1_4 = null;

        EObject lv_value_1_5 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1736:2: ( ( () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) ) ) )
            // InternalAiDsl.g:1737:2: ( () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) ) )
            {
            // InternalAiDsl.g:1737:2: ( () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) ) )
            // InternalAiDsl.g:1738:3: () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) )
            {
            // InternalAiDsl.g:1738:3: ()
            // InternalAiDsl.g:1739:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDataDictionaryValueAccess().getDataDictionaryValueAction_0(),
              					current);
              			
            }

            }

            // InternalAiDsl.g:1745:3: ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) )
            // InternalAiDsl.g:1746:4: ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) )
            {
            // InternalAiDsl.g:1746:4: ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) )
            // InternalAiDsl.g:1747:5: (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue )
            {
            // InternalAiDsl.g:1747:5: (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt25=1;
                }
                break;
            case 25:
                {
                alt25=2;
                }
                break;
            case RULE_STRING:
                {
                alt25=3;
                }
                break;
            case 37:
                {
                alt25=4;
                }
                break;
            case 12:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAiDsl.g:1748:6: lv_value_1_1= ruleDataDictionaryBooleanValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryBooleanValueParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_1=ruleDataDictionaryBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataDictionaryValueRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_1,
                      							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryBooleanValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:1764:6: lv_value_1_2= ruleDataDictionaryNullValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryNullValueParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_2=ruleDataDictionaryNullValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataDictionaryValueRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_2,
                      							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryNullValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:1780:6: lv_value_1_3= ruleDataDictionaryStringValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryStringValueParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_3=ruleDataDictionaryStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataDictionaryValueRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_3,
                      							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryStringValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:1796:6: lv_value_1_4= ruleDataDictionaryArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryArrayValueParserRuleCall_1_0_3());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_4=ruleDataDictionaryArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataDictionaryValueRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_4,
                      							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryArrayValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalAiDsl.g:1812:6: lv_value_1_5= ruleDataDictionaryMapValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryMapValueParserRuleCall_1_0_4());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_5=ruleDataDictionaryMapValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDataDictionaryValueRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_5,
                      							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryMapValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDictionaryValue"


    // $ANTLR start "entryRuleDataDictionaryArrayValue"
    // InternalAiDsl.g:1834:1: entryRuleDataDictionaryArrayValue returns [EObject current=null] : iv_ruleDataDictionaryArrayValue= ruleDataDictionaryArrayValue EOF ;
    public final EObject entryRuleDataDictionaryArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryArrayValue = null;


        try {
            // InternalAiDsl.g:1834:65: (iv_ruleDataDictionaryArrayValue= ruleDataDictionaryArrayValue EOF )
            // InternalAiDsl.g:1835:2: iv_ruleDataDictionaryArrayValue= ruleDataDictionaryArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDictionaryArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryArrayValue=ruleDataDictionaryArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDictionaryArrayValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDictionaryArrayValue"


    // $ANTLR start "ruleDataDictionaryArrayValue"
    // InternalAiDsl.g:1841:1: ruleDataDictionaryArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleDataDictionaryArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAiDsl.g:1847:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']' ) )
            // InternalAiDsl.g:1848:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']' )
            {
            // InternalAiDsl.g:1848:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']' )
            // InternalAiDsl.g:1849:3: () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']'
            {
            // InternalAiDsl.g:1849:3: ()
            // InternalAiDsl.g:1850:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDataDictionaryArrayValueAccess().getDataDictionaryArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDataDictionaryArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalAiDsl.g:1860:3: ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAiDsl.g:1861:4: ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
                    {
                    // InternalAiDsl.g:1861:4: ( (lv_values_2_0= RULE_STRING ) )
                    // InternalAiDsl.g:1862:5: (lv_values_2_0= RULE_STRING )
                    {
                    // InternalAiDsl.g:1862:5: (lv_values_2_0= RULE_STRING )
                    // InternalAiDsl.g:1863:6: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_values_2_0, grammarAccess.getDataDictionaryArrayValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDataDictionaryArrayValueRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"values",
                      							lv_values_2_0,
                      							"de.mindscan.ai.aidsl.AiDsl.STRING");
                      					
                    }

                    }


                    }

                    // InternalAiDsl.g:1879:4: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalAiDsl.g:1880:5: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDataDictionaryArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAiDsl.g:1884:5: ( (lv_values_4_0= RULE_STRING ) )
                    	    // InternalAiDsl.g:1885:6: (lv_values_4_0= RULE_STRING )
                    	    {
                    	    // InternalAiDsl.g:1885:6: (lv_values_4_0= RULE_STRING )
                    	    // InternalAiDsl.g:1886:7: lv_values_4_0= RULE_STRING
                    	    {
                    	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_values_4_0, grammarAccess.getDataDictionaryArrayValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDataDictionaryArrayValueRule());
                    	      							}
                    	      							addWithLastConsumed(
                    	      								current,
                    	      								"values",
                    	      								lv_values_4_0,
                    	      								"de.mindscan.ai.aidsl.AiDsl.STRING");
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDataDictionaryArrayValueAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDictionaryArrayValue"


    // $ANTLR start "entryRuleDataDictionaryMapValue"
    // InternalAiDsl.g:1912:1: entryRuleDataDictionaryMapValue returns [EObject current=null] : iv_ruleDataDictionaryMapValue= ruleDataDictionaryMapValue EOF ;
    public final EObject entryRuleDataDictionaryMapValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryMapValue = null;


        try {
            // InternalAiDsl.g:1912:63: (iv_ruleDataDictionaryMapValue= ruleDataDictionaryMapValue EOF )
            // InternalAiDsl.g:1913:2: iv_ruleDataDictionaryMapValue= ruleDataDictionaryMapValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDictionaryMapValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryMapValue=ruleDataDictionaryMapValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDictionaryMapValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDictionaryMapValue"


    // $ANTLR start "ruleDataDictionaryMapValue"
    // InternalAiDsl.g:1919:1: ruleDataDictionaryMapValue returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}' ) ;
    public final EObject ruleDataDictionaryMapValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_keyValuePairs_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1925:2: ( ( () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}' ) )
            // InternalAiDsl.g:1926:2: ( () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}' )
            {
            // InternalAiDsl.g:1926:2: ( () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}' )
            // InternalAiDsl.g:1927:3: () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}'
            {
            // InternalAiDsl.g:1927:3: ()
            // InternalAiDsl.g:1928:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDataDictionaryMapValueAccess().getDataDictionaryMapValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDataDictionaryMapValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalAiDsl.g:1938:3: ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAiDsl.g:1939:4: (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair )
            	    {
            	    // InternalAiDsl.g:1939:4: (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair )
            	    // InternalAiDsl.g:1940:5: lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDataDictionaryMapValueAccess().getKeyValuePairsDatadictionaryKeyValuePairParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_keyValuePairs_2_0=ruleDatadictionaryKeyValuePair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDataDictionaryMapValueRule());
            	      					}
            	      					add(
            	      						current,
            	      						"keyValuePairs",
            	      						lv_keyValuePairs_2_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.DatadictionaryKeyValuePair");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDataDictionaryMapValueAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDictionaryMapValue"


    // $ANTLR start "entryRuleDataDictionaryBooleanValue"
    // InternalAiDsl.g:1965:1: entryRuleDataDictionaryBooleanValue returns [EObject current=null] : iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF ;
    public final EObject entryRuleDataDictionaryBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryBooleanValue = null;


        try {
            // InternalAiDsl.g:1965:67: (iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF )
            // InternalAiDsl.g:1966:2: iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDictionaryBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryBooleanValue=ruleDataDictionaryBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDictionaryBooleanValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDictionaryBooleanValue"


    // $ANTLR start "ruleDataDictionaryBooleanValue"
    // InternalAiDsl.g:1972:1: ruleDataDictionaryBooleanValue returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) ;
    public final EObject ruleDataDictionaryBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalAiDsl.g:1978:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) )
            // InternalAiDsl.g:1979:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            {
            // InternalAiDsl.g:1979:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            // InternalAiDsl.g:1980:3: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            {
            // InternalAiDsl.g:1980:3: ()
            // InternalAiDsl.g:1981:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDataDictionaryBooleanValueAccess().getDataDictionaryBooleanValueAction_0(),
              					current);
              			
            }

            }

            // InternalAiDsl.g:1987:3: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            // InternalAiDsl.g:1988:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            {
            // InternalAiDsl.g:1988:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            // InternalAiDsl.g:1989:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            {
            // InternalAiDsl.g:1989:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            else if ( (LA29_0==24) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAiDsl.g:1990:6: lv_value_1_1= 'true'
                    {
                    lv_value_1_1=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_1, grammarAccess.getDataDictionaryBooleanValueAccess().getValueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDataDictionaryBooleanValueRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:2001:6: lv_value_1_2= 'false'
                    {
                    lv_value_1_2=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_2, grammarAccess.getDataDictionaryBooleanValueAccess().getValueFalseKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDataDictionaryBooleanValueRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDictionaryBooleanValue"


    // $ANTLR start "entryRuleDataDictionaryStringValue"
    // InternalAiDsl.g:2018:1: entryRuleDataDictionaryStringValue returns [EObject current=null] : iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF ;
    public final EObject entryRuleDataDictionaryStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryStringValue = null;


        try {
            // InternalAiDsl.g:2018:66: (iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF )
            // InternalAiDsl.g:2019:2: iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDictionaryStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryStringValue=ruleDataDictionaryStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDictionaryStringValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDictionaryStringValue"


    // $ANTLR start "ruleDataDictionaryStringValue"
    // InternalAiDsl.g:2025:1: ruleDataDictionaryStringValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDataDictionaryStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:2031:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:2032:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:2032:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalAiDsl.g:2033:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalAiDsl.g:2033:3: ()
            // InternalAiDsl.g:2034:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDataDictionaryStringValueAccess().getDataDictionaryStringValueAction_0(),
              					current);
              			
            }

            }

            // InternalAiDsl.g:2040:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalAiDsl.g:2041:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalAiDsl.g:2041:4: (lv_value_1_0= RULE_STRING )
            // InternalAiDsl.g:2042:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getDataDictionaryStringValueAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDataDictionaryStringValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDictionaryStringValue"


    // $ANTLR start "entryRuleDataDictionaryNullValue"
    // InternalAiDsl.g:2062:1: entryRuleDataDictionaryNullValue returns [EObject current=null] : iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF ;
    public final EObject entryRuleDataDictionaryNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryNullValue = null;


        try {
            // InternalAiDsl.g:2062:64: (iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF )
            // InternalAiDsl.g:2063:2: iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDictionaryNullValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryNullValue=ruleDataDictionaryNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDictionaryNullValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDictionaryNullValue"


    // $ANTLR start "ruleDataDictionaryNullValue"
    // InternalAiDsl.g:2069:1: ruleDataDictionaryNullValue returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleDataDictionaryNullValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:2075:2: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // InternalAiDsl.g:2076:2: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // InternalAiDsl.g:2076:2: ( () ( (lv_value_1_0= 'null' ) ) )
            // InternalAiDsl.g:2077:3: () ( (lv_value_1_0= 'null' ) )
            {
            // InternalAiDsl.g:2077:3: ()
            // InternalAiDsl.g:2078:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDataDictionaryNullValueAccess().getDataDictionaryNullValueAction_0(),
              					current);
              			
            }

            }

            // InternalAiDsl.g:2084:3: ( (lv_value_1_0= 'null' ) )
            // InternalAiDsl.g:2085:4: (lv_value_1_0= 'null' )
            {
            // InternalAiDsl.g:2085:4: (lv_value_1_0= 'null' )
            // InternalAiDsl.g:2086:5: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getDataDictionaryNullValueAccess().getValueNullKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDataDictionaryNullValueRule());
              					}
              					setWithLastConsumed(current, "value", lv_value_1_0, "null");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDictionaryNullValue"


    // $ANTLR start "entryRuleVMNodeDefinition"
    // InternalAiDsl.g:2102:1: entryRuleVMNodeDefinition returns [EObject current=null] : iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF ;
    public final EObject entryRuleVMNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeDefinition = null;


        try {
            // InternalAiDsl.g:2102:57: (iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF )
            // InternalAiDsl.g:2103:2: iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMNodeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeDefinition=ruleVMNodeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMNodeDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMNodeDefinition"


    // $ANTLR start "ruleVMNodeDefinition"
    // InternalAiDsl.g:2109:1: ruleVMNodeDefinition returns [EObject current=null] : (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' ) ;
    public final EObject ruleVMNodeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nodetype_1_1=null;
        Token lv_nodetype_1_2=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2115:2: ( (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' ) )
            // InternalAiDsl.g:2116:2: (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' )
            {
            // InternalAiDsl.g:2116:2: (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' )
            // InternalAiDsl.g:2117:3: otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVMNodeDefinitionAccess().getVmnodeKeyword_0());
              		
            }
            // InternalAiDsl.g:2121:3: ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=40 && LA31_0<=41)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAiDsl.g:2122:4: ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) )
                    {
                    // InternalAiDsl.g:2122:4: ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) )
                    // InternalAiDsl.g:2123:5: (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' )
                    {
                    // InternalAiDsl.g:2123:5: (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==40) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==41) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAiDsl.g:2124:6: lv_nodetype_1_1= 'super'
                            {
                            lv_nodetype_1_1=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_nodetype_1_1, grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getVMNodeDefinitionRule());
                              						}
                              						setWithLastConsumed(current, "nodetype", lv_nodetype_1_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalAiDsl.g:2135:6: lv_nodetype_1_2= 'overlay'
                            {
                            lv_nodetype_1_2=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_nodetype_1_2, grammarAccess.getVMNodeDefinitionAccess().getNodetypeOverlayKeyword_1_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getVMNodeDefinitionRule());
                              						}
                              						setWithLastConsumed(current, "nodetype", lv_nodetype_1_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalAiDsl.g:2148:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:2149:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:2149:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:2150:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVMNodeDefinitionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVMNodeDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVMNodeDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalAiDsl.g:2170:3: ( (lv_elements_4_0= ruleVMNodeEleemnts ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=42 && LA32_0<=45)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAiDsl.g:2171:4: (lv_elements_4_0= ruleVMNodeEleemnts )
            	    {
            	    // InternalAiDsl.g:2171:4: (lv_elements_4_0= ruleVMNodeEleemnts )
            	    // InternalAiDsl.g:2172:5: lv_elements_4_0= ruleVMNodeEleemnts
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVMNodeDefinitionAccess().getElementsVMNodeEleemntsParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_elements_4_0=ruleVMNodeEleemnts();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVMNodeDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_4_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.VMNodeEleemnts");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVMNodeDefinitionAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMNodeDefinition"


    // $ANTLR start "entryRuleVMNodeEleemnts"
    // InternalAiDsl.g:2197:1: entryRuleVMNodeEleemnts returns [EObject current=null] : iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF ;
    public final EObject entryRuleVMNodeEleemnts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeEleemnts = null;


        try {
            // InternalAiDsl.g:2197:55: (iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF )
            // InternalAiDsl.g:2198:2: iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMNodeEleemntsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeEleemnts=ruleVMNodeEleemnts();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMNodeEleemnts; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMNodeEleemnts"


    // $ANTLR start "ruleVMNodeEleemnts"
    // InternalAiDsl.g:2204:1: ruleVMNodeEleemnts returns [EObject current=null] : (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements ) ;
    public final EObject ruleVMNodeEleemnts() throws RecognitionException {
        EObject current = null;

        EObject this_VMNodeOpCodeElement_0 = null;

        EObject this_VMNodeOutElements_1 = null;

        EObject this_VMNodeInElements_2 = null;

        EObject this_VMNodeFieldElements_3 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2210:2: ( (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements ) )
            // InternalAiDsl.g:2211:2: (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements )
            {
            // InternalAiDsl.g:2211:2: (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt33=1;
                }
                break;
            case 43:
                {
                alt33=2;
                }
                break;
            case 44:
                {
                alt33=3;
                }
                break;
            case 45:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAiDsl.g:2212:3: this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOpCodeElementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VMNodeOpCodeElement_0=ruleVMNodeOpCodeElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VMNodeOpCodeElement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:2221:3: this_VMNodeOutElements_1= ruleVMNodeOutElements
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOutElementsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VMNodeOutElements_1=ruleVMNodeOutElements();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VMNodeOutElements_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:2230:3: this_VMNodeInElements_2= ruleVMNodeInElements
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeInElementsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VMNodeInElements_2=ruleVMNodeInElements();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VMNodeInElements_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:2239:3: this_VMNodeFieldElements_3= ruleVMNodeFieldElements
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeFieldElementsParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VMNodeFieldElements_3=ruleVMNodeFieldElements();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VMNodeFieldElements_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMNodeEleemnts"


    // $ANTLR start "entryRuleVMNodeOpCodeElement"
    // InternalAiDsl.g:2251:1: entryRuleVMNodeOpCodeElement returns [EObject current=null] : iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF ;
    public final EObject entryRuleVMNodeOpCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOpCodeElement = null;


        try {
            // InternalAiDsl.g:2251:60: (iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF )
            // InternalAiDsl.g:2252:2: iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMNodeOpCodeElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeOpCodeElement=ruleVMNodeOpCodeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMNodeOpCodeElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMNodeOpCodeElement"


    // $ANTLR start "ruleVMNodeOpCodeElement"
    // InternalAiDsl.g:2258:1: ruleVMNodeOpCodeElement returns [EObject current=null] : (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVMNodeOpCodeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_opcode_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:2264:2: ( (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:2265:2: (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:2265:2: (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) )
            // InternalAiDsl.g:2266:3: otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVMNodeOpCodeElementAccess().getOpcodeKeyword_0());
              		
            }
            // InternalAiDsl.g:2270:3: ( (lv_opcode_1_0= RULE_STRING ) )
            // InternalAiDsl.g:2271:4: (lv_opcode_1_0= RULE_STRING )
            {
            // InternalAiDsl.g:2271:4: (lv_opcode_1_0= RULE_STRING )
            // InternalAiDsl.g:2272:5: lv_opcode_1_0= RULE_STRING
            {
            lv_opcode_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_opcode_1_0, grammarAccess.getVMNodeOpCodeElementAccess().getOpcodeSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVMNodeOpCodeElementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"opcode",
              						lv_opcode_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMNodeOpCodeElement"


    // $ANTLR start "entryRuleVMNodeOutElements"
    // InternalAiDsl.g:2292:1: entryRuleVMNodeOutElements returns [EObject current=null] : iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF ;
    public final EObject entryRuleVMNodeOutElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOutElements = null;


        try {
            // InternalAiDsl.g:2292:58: (iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF )
            // InternalAiDsl.g:2293:2: iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMNodeOutElementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeOutElements=ruleVMNodeOutElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMNodeOutElements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMNodeOutElements"


    // $ANTLR start "ruleVMNodeOutElements"
    // InternalAiDsl.g:2299:1: ruleVMNodeOutElements returns [EObject current=null] : ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeOutElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_outElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2305:2: ( ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:2306:2: ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:2306:2: ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:2307:3: () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:2307:3: ()
            // InternalAiDsl.g:2308:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVMNodeOutElementsAccess().getVMNodeOutElementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVMNodeOutElementsAccess().getOutKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVMNodeOutElementsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAiDsl.g:2322:3: ( (lv_outElements_3_0= ruleVMNodeOutElement ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAiDsl.g:2323:4: (lv_outElements_3_0= ruleVMNodeOutElement )
            	    {
            	    // InternalAiDsl.g:2323:4: (lv_outElements_3_0= ruleVMNodeOutElement )
            	    // InternalAiDsl.g:2324:5: lv_outElements_3_0= ruleVMNodeOutElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVMNodeOutElementsAccess().getOutElementsVMNodeOutElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_outElements_3_0=ruleVMNodeOutElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVMNodeOutElementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"outElements",
            	      						lv_outElements_3_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.VMNodeOutElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVMNodeOutElementsAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMNodeOutElements"


    // $ANTLR start "entryRuleVMNodeInElements"
    // InternalAiDsl.g:2349:1: entryRuleVMNodeInElements returns [EObject current=null] : iv_ruleVMNodeInElements= ruleVMNodeInElements EOF ;
    public final EObject entryRuleVMNodeInElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeInElements = null;


        try {
            // InternalAiDsl.g:2349:57: (iv_ruleVMNodeInElements= ruleVMNodeInElements EOF )
            // InternalAiDsl.g:2350:2: iv_ruleVMNodeInElements= ruleVMNodeInElements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMNodeInElementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeInElements=ruleVMNodeInElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMNodeInElements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMNodeInElements"


    // $ANTLR start "ruleVMNodeInElements"
    // InternalAiDsl.g:2356:1: ruleVMNodeInElements returns [EObject current=null] : ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeInElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2362:2: ( ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:2363:2: ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:2363:2: ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:2364:3: () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:2364:3: ()
            // InternalAiDsl.g:2365:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVMNodeInElementsAccess().getVMNodeInElementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVMNodeInElementsAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVMNodeInElementsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAiDsl.g:2379:3: ( (lv_inElements_3_0= ruleVMNodeInElement ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||(LA35_0>=47 && LA35_0<=48)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAiDsl.g:2380:4: (lv_inElements_3_0= ruleVMNodeInElement )
            	    {
            	    // InternalAiDsl.g:2380:4: (lv_inElements_3_0= ruleVMNodeInElement )
            	    // InternalAiDsl.g:2381:5: lv_inElements_3_0= ruleVMNodeInElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVMNodeInElementsAccess().getInElementsVMNodeInElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_inElements_3_0=ruleVMNodeInElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVMNodeInElementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"inElements",
            	      						lv_inElements_3_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.VMNodeInElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVMNodeInElementsAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMNodeInElements"


    // $ANTLR start "entryRuleVMNodeFieldElements"
    // InternalAiDsl.g:2406:1: entryRuleVMNodeFieldElements returns [EObject current=null] : iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF ;
    public final EObject entryRuleVMNodeFieldElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeFieldElements = null;


        try {
            // InternalAiDsl.g:2406:60: (iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF )
            // InternalAiDsl.g:2407:2: iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMNodeFieldElementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeFieldElements=ruleVMNodeFieldElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMNodeFieldElements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMNodeFieldElements"


    // $ANTLR start "ruleVMNodeFieldElements"
    // InternalAiDsl.g:2413:1: ruleVMNodeFieldElements returns [EObject current=null] : ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeFieldElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldELements_3_1 = null;

        EObject lv_fieldELements_3_2 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2419:2: ( ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:2420:2: ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:2420:2: ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' )
            // InternalAiDsl.g:2421:3: () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:2421:3: ()
            // InternalAiDsl.g:2422:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVMNodeFieldElementsAccess().getVMNodeFieldElementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVMNodeFieldElementsAccess().getFieldsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVMNodeFieldElementsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAiDsl.g:2436:3: ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=47 && LA37_0<=49)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAiDsl.g:2437:4: ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) )
            	    {
            	    // InternalAiDsl.g:2437:4: ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) )
            	    // InternalAiDsl.g:2438:5: (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement )
            	    {
            	    // InternalAiDsl.g:2438:5: (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( ((LA36_0>=47 && LA36_0<=48)) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==49) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalAiDsl.g:2439:6: lv_fieldELements_3_1= ruleVMFieldElement
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getVMNodeFieldElementsAccess().getFieldELementsVMFieldElementParserRuleCall_3_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_41);
            	            lv_fieldELements_3_1=ruleVMFieldElement();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getVMNodeFieldElementsRule());
            	              						}
            	              						add(
            	              							current,
            	              							"fieldELements",
            	              							lv_fieldELements_3_1,
            	              							"de.mindscan.ai.aidsl.AiDsl.VMFieldElement");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAiDsl.g:2455:6: lv_fieldELements_3_2= ruleVMOverrideFieldElement
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getVMNodeFieldElementsAccess().getFieldELementsVMOverrideFieldElementParserRuleCall_3_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_41);
            	            lv_fieldELements_3_2=ruleVMOverrideFieldElement();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getVMNodeFieldElementsRule());
            	              						}
            	              						add(
            	              							current,
            	              							"fieldELements",
            	              							lv_fieldELements_3_2,
            	              							"de.mindscan.ai.aidsl.AiDsl.VMOverrideFieldElement");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVMNodeFieldElementsAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMNodeFieldElements"


    // $ANTLR start "entryRuleVMNodeOutElement"
    // InternalAiDsl.g:2481:1: entryRuleVMNodeOutElement returns [EObject current=null] : iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF ;
    public final EObject entryRuleVMNodeOutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOutElement = null;


        try {
            // InternalAiDsl.g:2481:57: (iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF )
            // InternalAiDsl.g:2482:2: iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMNodeOutElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeOutElement=ruleVMNodeOutElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMNodeOutElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMNodeOutElement"


    // $ANTLR start "ruleVMNodeOutElement"
    // InternalAiDsl.g:2488:1: ruleVMNodeOutElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleVMNodeOutElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasrequire_3_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2494:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )? ) )
            // InternalAiDsl.g:2495:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )? )
            {
            // InternalAiDsl.g:2495:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )? )
            // InternalAiDsl.g:2496:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )?
            {
            // InternalAiDsl.g:2496:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalAiDsl.g:2497:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:2497:4: (lv_name_0_0= ruleQualifiedName )
            // InternalAiDsl.g:2498:5: lv_name_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getNameQualifiedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVMNodeOutElementRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.mindscan.ai.aidsl.AiDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVMNodeOutElementAccess().getAsKeyword_1());
              		
            }
            // InternalAiDsl.g:2519:3: ( (lv_type_2_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:2520:4: (lv_type_2_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:2520:4: (lv_type_2_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:2521:5: lv_type_2_0= ruleELEMENTTYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getTypeELEMENTTYPEParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_43);
            lv_type_2_0=ruleELEMENTTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVMNodeOutElementRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.ELEMENTTYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAiDsl.g:2538:3: ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAiDsl.g:2539:4: ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAiDsl.g:2539:4: ( (lv_hasrequire_3_0= 'require' ) )
                    // InternalAiDsl.g:2540:5: (lv_hasrequire_3_0= 'require' )
                    {
                    // InternalAiDsl.g:2540:5: (lv_hasrequire_3_0= 'require' )
                    // InternalAiDsl.g:2541:6: lv_hasrequire_3_0= 'require'
                    {
                    lv_hasrequire_3_0=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasrequire_3_0, grammarAccess.getVMNodeOutElementAccess().getHasrequireRequireKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVMNodeOutElementRule());
                      						}
                      						setWithLastConsumed(current, "hasrequire", lv_hasrequire_3_0 != null, "require");
                      					
                    }

                    }


                    }

                    // InternalAiDsl.g:2553:4: ( ( ruleQualifiedName ) )
                    // InternalAiDsl.g:2554:5: ( ruleQualifiedName )
                    {
                    // InternalAiDsl.g:2554:5: ( ruleQualifiedName )
                    // InternalAiDsl.g:2555:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVMNodeOutElementRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getInputreferenceVMNodeInElementCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMNodeOutElement"


    // $ANTLR start "entryRuleVMNodeInElement"
    // InternalAiDsl.g:2574:1: entryRuleVMNodeInElement returns [EObject current=null] : iv_ruleVMNodeInElement= ruleVMNodeInElement EOF ;
    public final EObject entryRuleVMNodeInElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeInElement = null;


        try {
            // InternalAiDsl.g:2574:56: (iv_ruleVMNodeInElement= ruleVMNodeInElement EOF )
            // InternalAiDsl.g:2575:2: iv_ruleVMNodeInElement= ruleVMNodeInElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMNodeInElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeInElement=ruleVMNodeInElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMNodeInElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMNodeInElement"


    // $ANTLR start "ruleVMNodeInElement"
    // InternalAiDsl.g:2581:1: ruleVMNodeInElement returns [EObject current=null] : ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleVMNodeInElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_1=null;
        Token lv_policy_0_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2587:2: ( ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:2588:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:2588:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:2589:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) )
            {
            // InternalAiDsl.g:2589:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=47 && LA40_0<=48)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAiDsl.g:2590:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
                    {
                    // InternalAiDsl.g:2590:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
                    // InternalAiDsl.g:2591:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
                    {
                    // InternalAiDsl.g:2591:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==47) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==48) ) {
                        alt39=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAiDsl.g:2592:6: lv_policy_0_1= 'require'
                            {
                            lv_policy_0_1=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_policy_0_1, grammarAccess.getVMNodeInElementAccess().getPolicyRequireKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getVMNodeInElementRule());
                              						}
                              						setWithLastConsumed(current, "policy", lv_policy_0_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalAiDsl.g:2603:6: lv_policy_0_2= 'optional'
                            {
                            lv_policy_0_2=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_policy_0_2, grammarAccess.getVMNodeInElementAccess().getPolicyOptionalKeyword_0_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getVMNodeInElementRule());
                              						}
                              						setWithLastConsumed(current, "policy", lv_policy_0_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalAiDsl.g:2616:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAiDsl.g:2617:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:2617:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAiDsl.g:2618:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVMNodeInElementAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVMNodeInElementRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMNodeInElement"


    // $ANTLR start "entryRuleVMFieldElement"
    // InternalAiDsl.g:2639:1: entryRuleVMFieldElement returns [EObject current=null] : iv_ruleVMFieldElement= ruleVMFieldElement EOF ;
    public final EObject entryRuleVMFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMFieldElement = null;


        try {
            // InternalAiDsl.g:2639:55: (iv_ruleVMFieldElement= ruleVMFieldElement EOF )
            // InternalAiDsl.g:2640:2: iv_ruleVMFieldElement= ruleVMFieldElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMFieldElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMFieldElement=ruleVMFieldElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMFieldElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMFieldElement"


    // $ANTLR start "ruleVMFieldElement"
    // InternalAiDsl.g:2646:1: ruleVMFieldElement returns [EObject current=null] : ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )? ) ;
    public final EObject ruleVMFieldElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_1=null;
        Token lv_policy_0_2=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_defaultvalue_4_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2652:2: ( ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )? ) )
            // InternalAiDsl.g:2653:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )? )
            {
            // InternalAiDsl.g:2653:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )? )
            // InternalAiDsl.g:2654:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )?
            {
            // InternalAiDsl.g:2654:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )
            // InternalAiDsl.g:2655:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
            {
            // InternalAiDsl.g:2655:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
            // InternalAiDsl.g:2656:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
            {
            // InternalAiDsl.g:2656:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            else if ( (LA41_0==48) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalAiDsl.g:2657:6: lv_policy_0_1= 'require'
                    {
                    lv_policy_0_1=(Token)match(input,47,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_policy_0_1, grammarAccess.getVMFieldElementAccess().getPolicyRequireKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVMFieldElementRule());
                      						}
                      						setWithLastConsumed(current, "policy", lv_policy_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:2668:6: lv_policy_0_2= 'optional'
                    {
                    lv_policy_0_2=(Token)match(input,48,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_policy_0_2, grammarAccess.getVMFieldElementAccess().getPolicyOptionalKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVMFieldElementRule());
                      						}
                      						setWithLastConsumed(current, "policy", lv_policy_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalAiDsl.g:2681:3: ( (lv_type_1_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:2682:4: (lv_type_1_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:2682:4: (lv_type_1_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:2683:5: lv_type_1_0= ruleELEMENTTYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVMFieldElementAccess().getTypeELEMENTTYPEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleELEMENTTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVMFieldElementRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.ELEMENTTYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAiDsl.g:2700:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:2701:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:2701:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:2702:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVMFieldElementAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVMFieldElementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            // InternalAiDsl.g:2718:3: (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAiDsl.g:2719:4: otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVMFieldElementAccess().getDefaultKeyword_3_0());
                      			
                    }
                    // InternalAiDsl.g:2723:4: ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) )
                    // InternalAiDsl.g:2724:5: (lv_defaultvalue_4_0= ruleDataDictionaryValue )
                    {
                    // InternalAiDsl.g:2724:5: (lv_defaultvalue_4_0= ruleDataDictionaryValue )
                    // InternalAiDsl.g:2725:6: lv_defaultvalue_4_0= ruleDataDictionaryValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVMFieldElementAccess().getDefaultvalueDataDictionaryValueParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_defaultvalue_4_0=ruleDataDictionaryValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVMFieldElementRule());
                      						}
                      						set(
                      							current,
                      							"defaultvalue",
                      							lv_defaultvalue_4_0,
                      							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMFieldElement"


    // $ANTLR start "entryRuleVMOverrideFieldElement"
    // InternalAiDsl.g:2747:1: entryRuleVMOverrideFieldElement returns [EObject current=null] : iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF ;
    public final EObject entryRuleVMOverrideFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMOverrideFieldElement = null;


        try {
            // InternalAiDsl.g:2747:63: (iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF )
            // InternalAiDsl.g:2748:2: iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVMOverrideFieldElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVMOverrideFieldElement=ruleVMOverrideFieldElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVMOverrideFieldElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVMOverrideFieldElement"


    // $ANTLR start "ruleVMOverrideFieldElement"
    // InternalAiDsl.g:2754:1: ruleVMOverrideFieldElement returns [EObject current=null] : ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleVMOverrideFieldElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_defaultvalue_4_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2760:2: ( ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:2761:2: ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:2761:2: ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )
            // InternalAiDsl.g:2762:3: ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) )
            {
            // InternalAiDsl.g:2762:3: ( (lv_policy_0_0= 'override' ) )
            // InternalAiDsl.g:2763:4: (lv_policy_0_0= 'override' )
            {
            // InternalAiDsl.g:2763:4: (lv_policy_0_0= 'override' )
            // InternalAiDsl.g:2764:5: lv_policy_0_0= 'override'
            {
            lv_policy_0_0=(Token)match(input,49,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_policy_0_0, grammarAccess.getVMOverrideFieldElementAccess().getPolicyOverrideKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVMOverrideFieldElementRule());
              					}
              					setWithLastConsumed(current, "policy", lv_policy_0_0, "override");
              				
            }

            }


            }

            // InternalAiDsl.g:2776:3: ( (lv_type_1_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:2777:4: (lv_type_1_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:2777:4: (lv_type_1_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:2778:5: lv_type_1_0= ruleELEMENTTYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVMOverrideFieldElementAccess().getTypeELEMENTTYPEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleELEMENTTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVMOverrideFieldElementRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.ELEMENTTYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAiDsl.g:2795:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:2796:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:2796:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:2797:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVMOverrideFieldElementAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVMOverrideFieldElementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVMOverrideFieldElementAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalAiDsl.g:2817:3: ( (lv_defaultvalue_4_0= RULE_STRING ) )
            // InternalAiDsl.g:2818:4: (lv_defaultvalue_4_0= RULE_STRING )
            {
            // InternalAiDsl.g:2818:4: (lv_defaultvalue_4_0= RULE_STRING )
            // InternalAiDsl.g:2819:5: lv_defaultvalue_4_0= RULE_STRING
            {
            lv_defaultvalue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_defaultvalue_4_0, grammarAccess.getVMOverrideFieldElementAccess().getDefaultvalueSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVMOverrideFieldElementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"defaultvalue",
              						lv_defaultvalue_4_0,
              						"de.mindscan.ai.aidsl.AiDsl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVMOverrideFieldElement"


    // $ANTLR start "entryRuleLlmTaskDefinition"
    // InternalAiDsl.g:2839:1: entryRuleLlmTaskDefinition returns [EObject current=null] : iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF ;
    public final EObject entryRuleLlmTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmTaskDefinition = null;


        try {
            // InternalAiDsl.g:2839:58: (iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF )
            // InternalAiDsl.g:2840:2: iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLlmTaskDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLlmTaskDefinition=ruleLlmTaskDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLlmTaskDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLlmTaskDefinition"


    // $ANTLR start "ruleLlmTaskDefinition"
    // InternalAiDsl.g:2846:1: ruleLlmTaskDefinition returns [EObject current=null] : (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' ) ;
    public final EObject ruleLlmTaskDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_annotation_interfaces_5_0 = null;

        EObject lv_annotation_interfaces_7_0 = null;

        EObject lv_assignments_9_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2852:2: ( (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' ) )
            // InternalAiDsl.g:2853:2: (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' )
            {
            // InternalAiDsl.g:2853:2: (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' )
            // InternalAiDsl.g:2854:3: otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLlmTaskDefinitionAccess().getLlmtaskKeyword_0());
              		
            }
            // InternalAiDsl.g:2858:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:2859:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:2859:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:2860:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getLlmTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLlmTaskDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLlmTaskDefinitionAccess().getLeftParenthesisKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLlmTaskDefinitionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAiDsl.g:2884:3: (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAiDsl.g:2885:4: otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )*
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLlmTaskDefinitionAccess().getImplementsKeyword_4_0());
                      			
                    }
                    // InternalAiDsl.g:2889:4: ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) )
                    // InternalAiDsl.g:2890:5: (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference )
                    {
                    // InternalAiDsl.g:2890:5: (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference )
                    // InternalAiDsl.g:2891:6: lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
                    lv_annotation_interfaces_5_0=ruleAnnotationInterfaceReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLlmTaskDefinitionRule());
                      						}
                      						add(
                      							current,
                      							"annotation_interfaces",
                      							lv_annotation_interfaces_5_0,
                      							"de.mindscan.ai.aidsl.AiDsl.AnnotationInterfaceReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAiDsl.g:2908:4: (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalAiDsl.g:2909:5: otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getLlmTaskDefinitionAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalAiDsl.g:2913:5: ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) )
                    	    // InternalAiDsl.g:2914:6: (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference )
                    	    {
                    	    // InternalAiDsl.g:2914:6: (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference )
                    	    // InternalAiDsl.g:2915:7: lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_47);
                    	    lv_annotation_interfaces_7_0=ruleAnnotationInterfaceReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLlmTaskDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"annotation_interfaces",
                    	      								lv_annotation_interfaces_7_0,
                    	      								"de.mindscan.ai.aidsl.AiDsl.AnnotationInterfaceReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getLlmTaskDefinitionAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalAiDsl.g:2938:3: ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAiDsl.g:2939:4: (lv_assignments_9_0= ruleLlmVariableAssignment )
            	    {
            	    // InternalAiDsl.g:2939:4: (lv_assignments_9_0= ruleLlmVariableAssignment )
            	    // InternalAiDsl.g:2940:5: lv_assignments_9_0= ruleLlmVariableAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentsLlmVariableAssignmentParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_assignments_9_0=ruleLlmVariableAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getLlmTaskDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"assignments",
            	      						lv_assignments_9_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.LlmVariableAssignment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getLlmTaskDefinitionAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlmTaskDefinition"


    // $ANTLR start "entryRuleAnnotationInterfaceReference"
    // InternalAiDsl.g:2965:1: entryRuleAnnotationInterfaceReference returns [EObject current=null] : iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF ;
    public final EObject entryRuleAnnotationInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationInterfaceReference = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAiDsl.g:2967:2: (iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF )
            // InternalAiDsl.g:2968:2: iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationInterfaceReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationInterfaceReference=ruleAnnotationInterfaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationInterfaceReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationInterfaceReference"


    // $ANTLR start "ruleAnnotationInterfaceReference"
    // InternalAiDsl.g:2977:1: ruleAnnotationInterfaceReference returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAnnotationInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAiDsl.g:2984:2: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAiDsl.g:2985:2: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAiDsl.g:2985:2: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            // InternalAiDsl.g:2986:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnnotationInterfaceReferenceAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalAiDsl.g:2990:3: ( (otherlv_1= RULE_ID ) )
            // InternalAiDsl.g:2991:4: (otherlv_1= RULE_ID )
            {
            // InternalAiDsl.g:2991:4: (otherlv_1= RULE_ID )
            // InternalAiDsl.g:2992:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnnotationInterfaceReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getAnnotationInterfaceReferenceAccess().getNameVMNodeDefinitionCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAnnotationInterfaceReference"


    // $ANTLR start "entryRuleLlmVariableAssignment"
    // InternalAiDsl.g:3010:1: entryRuleLlmVariableAssignment returns [EObject current=null] : iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF ;
    public final EObject entryRuleLlmVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmVariableAssignment = null;


        try {
            // InternalAiDsl.g:3010:62: (iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF )
            // InternalAiDsl.g:3011:2: iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLlmVariableAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLlmVariableAssignment=ruleLlmVariableAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLlmVariableAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLlmVariableAssignment"


    // $ANTLR start "ruleLlmVariableAssignment"
    // InternalAiDsl.g:3017:1: ruleLlmVariableAssignment returns [EObject current=null] : ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) ) ) ;
    public final EObject ruleLlmVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variablename_0_0=null;
        Token otherlv_1=null;
        EObject lv_template_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:3023:2: ( ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) ) ) )
            // InternalAiDsl.g:3024:2: ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) ) )
            {
            // InternalAiDsl.g:3024:2: ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) ) )
            // InternalAiDsl.g:3025:3: ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) )
            {
            // InternalAiDsl.g:3025:3: ( (lv_variablename_0_0= RULE_ID ) )
            // InternalAiDsl.g:3026:4: (lv_variablename_0_0= RULE_ID )
            {
            // InternalAiDsl.g:3026:4: (lv_variablename_0_0= RULE_ID )
            // InternalAiDsl.g:3027:5: lv_variablename_0_0= RULE_ID
            {
            lv_variablename_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variablename_0_0, grammarAccess.getLlmVariableAssignmentAccess().getVariablenameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLlmVariableAssignmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"variablename",
              						lv_variablename_0_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLlmVariableAssignmentAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalAiDsl.g:3047:3: ( (lv_template_2_0= ruleDataDictionaryValue ) )
            // InternalAiDsl.g:3048:4: (lv_template_2_0= ruleDataDictionaryValue )
            {
            // InternalAiDsl.g:3048:4: (lv_template_2_0= ruleDataDictionaryValue )
            // InternalAiDsl.g:3049:5: lv_template_2_0= ruleDataDictionaryValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLlmVariableAssignmentAccess().getTemplateDataDictionaryValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_template_2_0=ruleDataDictionaryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLlmVariableAssignmentRule());
              					}
              					set(
              						current,
              						"template",
              						lv_template_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.DataDictionaryValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlmVariableAssignment"


    // $ANTLR start "entryRuleWorkflowDefinition"
    // InternalAiDsl.g:3070:1: entryRuleWorkflowDefinition returns [EObject current=null] : iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF ;
    public final EObject entryRuleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinition = null;


        try {
            // InternalAiDsl.g:3070:59: (iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF )
            // InternalAiDsl.g:3071:2: iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDefinition=ruleWorkflowDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowDefinition"


    // $ANTLR start "ruleWorkflowDefinition"
    // InternalAiDsl.g:3077:1: ruleWorkflowDefinition returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}' ) ;
    public final EObject ruleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:3083:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}' ) )
            // InternalAiDsl.g:3084:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}' )
            {
            // InternalAiDsl.g:3084:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}' )
            // InternalAiDsl.g:3085:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionAccess().getWorkflowKeyword_0());
              		
            }
            // InternalAiDsl.g:3089:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:3090:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:3090:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:3091:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.mindscan.ai.aidsl.AiDsl.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkflowDefinitionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAiDsl.g:3111:3: ( (otherlv_3= RULE_ID ) )
            // InternalAiDsl.g:3112:4: (otherlv_3= RULE_ID )
            {
            // InternalAiDsl.g:3112:4: (otherlv_3= RULE_ID )
            // InternalAiDsl.g:3113:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowDefinitionRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getWorkflowDefinitionAccess().getInputWorkflowInputDefinitionCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWorkflowDefinitionAccess().getCommaKeyword_4());
              		
            }
            // InternalAiDsl.g:3128:3: ( (otherlv_5= RULE_ID ) )
            // InternalAiDsl.g:3129:4: (otherlv_5= RULE_ID )
            {
            // InternalAiDsl.g:3129:4: (otherlv_5= RULE_ID )
            // InternalAiDsl.g:3130:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowDefinitionRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getWorkflowDefinitionAccess().getDatadictionaryWorkflowDataDictionaryDefinitionCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWorkflowDefinitionAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            // InternalAiDsl.g:3149:3: ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAiDsl.g:3150:4: (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement )
            	    {
            	    // InternalAiDsl.g:3150:4: (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement )
            	    // InternalAiDsl.g:3151:5: lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getStatementsWorkflowDefinitionApplyLLMTaskStatementParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_statements_8_0=ruleWorkflowDefinitionApplyLLMTaskStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_8_0,
            	      						"de.mindscan.ai.aidsl.AiDsl.WorkflowDefinitionApplyLLMTaskStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowDefinition"


    // $ANTLR start "entryRuleWorkflowDefinitionApplyLLMTaskStatement"
    // InternalAiDsl.g:3176:1: entryRuleWorkflowDefinitionApplyLLMTaskStatement returns [EObject current=null] : iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF ;
    public final EObject entryRuleWorkflowDefinitionApplyLLMTaskStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinitionApplyLLMTaskStatement = null;


        try {
            // InternalAiDsl.g:3176:80: (iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF )
            // InternalAiDsl.g:3177:2: iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDefinitionApplyLLMTaskStatement=ruleWorkflowDefinitionApplyLLMTaskStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowDefinitionApplyLLMTaskStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowDefinitionApplyLLMTaskStatement"


    // $ANTLR start "ruleWorkflowDefinitionApplyLLMTaskStatement"
    // InternalAiDsl.g:3183:1: ruleWorkflowDefinitionApplyLLMTaskStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' ) ;
    public final EObject ruleWorkflowDefinitionApplyLLMTaskStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_noderesultassigments_5_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:3189:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' ) )
            // InternalAiDsl.g:3190:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' )
            {
            // InternalAiDsl.g:3190:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' )
            // InternalAiDsl.g:3191:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';'
            {
            // InternalAiDsl.g:3191:3: ( (otherlv_0= RULE_ID ) )
            // InternalAiDsl.g:3192:4: (otherlv_0= RULE_ID )
            {
            // InternalAiDsl.g:3192:4: (otherlv_0= RULE_ID )
            // InternalAiDsl.g:3193:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLlmtaskLlmTaskDefinitionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalAiDsl.g:3212:3: (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAiDsl.g:3213:4: otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getEqualsSignGreaterThanSignKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLeftCurlyBracketKeyword_3_1());
                      			
                    }
                    // InternalAiDsl.g:3221:4: ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalAiDsl.g:3222:5: (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment )
                    	    {
                    	    // InternalAiDsl.g:3222:5: (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment )
                    	    // InternalAiDsl.g:3223:6: lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getNoderesultassigmentsWorkflowDefinitionApplyLLMNodeResultAssignmentParserRuleCall_3_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_noderesultassigments_5_0=ruleWorkflowDefinitionApplyLLMNodeResultAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"noderesultassigments",
                    	      							lv_noderesultassigments_5_0,
                    	      							"de.mindscan.ai.aidsl.AiDsl.WorkflowDefinitionApplyLLMNodeResultAssignment");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getRightCurlyBracketKeyword_3_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowDefinitionApplyLLMTaskStatement"


    // $ANTLR start "entryRuleWorkflowDefinitionApplyLLMNodeResultAssignment"
    // InternalAiDsl.g:3253:1: entryRuleWorkflowDefinitionApplyLLMNodeResultAssignment returns [EObject current=null] : iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF ;
    public final EObject entryRuleWorkflowDefinitionApplyLLMNodeResultAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment = null;


        try {
            // InternalAiDsl.g:3253:87: (iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF )
            // InternalAiDsl.g:3254:2: iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment=ruleWorkflowDefinitionApplyLLMNodeResultAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowDefinitionApplyLLMNodeResultAssignment"


    // $ANTLR start "ruleWorkflowDefinitionApplyLLMNodeResultAssignment"
    // InternalAiDsl.g:3260:1: ruleWorkflowDefinitionApplyLLMNodeResultAssignment returns [EObject current=null] : ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleWorkflowDefinitionApplyLLMNodeResultAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_environmentresultname_0_0 = null;

        AntlrDatatypeRuleToken lv_noderesultname_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:3266:2: ( ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:3267:2: ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:3267:2: ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:3268:3: ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) )
            {
            // InternalAiDsl.g:3268:3: ( (lv_environmentresultname_0_0= ruleQualifiedName ) )
            // InternalAiDsl.g:3269:4: (lv_environmentresultname_0_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:3269:4: (lv_environmentresultname_0_0= ruleQualifiedName )
            // InternalAiDsl.g:3270:5: lv_environmentresultname_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentAccess().getEnvironmentresultnameQualifiedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_environmentresultname_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentRule());
              					}
              					set(
              						current,
              						"environmentresultname",
              						lv_environmentresultname_0_0,
              						"de.mindscan.ai.aidsl.AiDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentAccess().getColonKeyword_1());
              		
            }
            // InternalAiDsl.g:3291:3: ( (lv_noderesultname_2_0= ruleQualifiedName ) )
            // InternalAiDsl.g:3292:4: (lv_noderesultname_2_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:3292:4: (lv_noderesultname_2_0= ruleQualifiedName )
            // InternalAiDsl.g:3293:5: lv_noderesultname_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentAccess().getNoderesultnameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_noderesultname_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentRule());
              					}
              					set(
              						current,
              						"noderesultname",
              						lv_noderesultname_2_0,
              						"de.mindscan.ai.aidsl.AiDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowDefinitionApplyLLMNodeResultAssignment"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAiDsl.g:3314:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAiDsl.g:3314:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAiDsl.g:3315:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAiDsl.g:3321:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAiDsl.g:3327:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAiDsl.g:3328:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAiDsl.g:3328:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAiDsl.g:3329:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAiDsl.g:3336:3: (kw= '.' this_ID_2= RULE_ID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==22) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAiDsl.g:3337:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAiDsl.g:3354:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAiDsl.g:3354:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAiDsl.g:3355:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalAiDsl.g:3361:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:3367:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAiDsl.g:3368:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAiDsl.g:3368:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAiDsl.g:3369:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAiDsl.g:3379:3: (kw= '.*' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAiDsl.g:3380:4: kw= '.*'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleELEMENTTYPE"
    // InternalAiDsl.g:3390:1: entryRuleELEMENTTYPE returns [EObject current=null] : iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF ;
    public final EObject entryRuleELEMENTTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELEMENTTYPE = null;


        try {
            // InternalAiDsl.g:3390:52: (iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF )
            // InternalAiDsl.g:3391:2: iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getELEMENTTYPERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleELEMENTTYPE=ruleELEMENTTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleELEMENTTYPE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELEMENTTYPE"


    // $ANTLR start "ruleELEMENTTYPE"
    // InternalAiDsl.g:3397:1: ruleELEMENTTYPE returns [EObject current=null] : (this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )? ) ;
    public final EObject ruleELEMENTTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_1_0=null;
        Token otherlv_2=null;
        EObject this_BASICTYPE_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:3403:2: ( (this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )? ) )
            // InternalAiDsl.g:3404:2: (this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )? )
            {
            // InternalAiDsl.g:3404:2: (this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )? )
            // InternalAiDsl.g:3405:3: this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getELEMENTTYPEAccess().getBASICTYPEParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_BASICTYPE_0=ruleBASICTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BASICTYPE_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAiDsl.g:3413:3: ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAiDsl.g:3414:4: ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']'
                    {
                    // InternalAiDsl.g:3414:4: ( (lv_isArray_1_0= '[' ) )
                    // InternalAiDsl.g:3415:5: (lv_isArray_1_0= '[' )
                    {
                    // InternalAiDsl.g:3415:5: (lv_isArray_1_0= '[' )
                    // InternalAiDsl.g:3416:6: lv_isArray_1_0= '['
                    {
                    lv_isArray_1_0=(Token)match(input,37,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isArray_1_0, grammarAccess.getELEMENTTYPEAccess().getIsArrayLeftSquareBracketKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getELEMENTTYPERule());
                      						}
                      						setWithLastConsumed(current, "isArray", lv_isArray_1_0 != null, "[");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getELEMENTTYPEAccess().getRightSquareBracketKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELEMENTTYPE"


    // $ANTLR start "entryRuleBASICTYPE"
    // InternalAiDsl.g:3437:1: entryRuleBASICTYPE returns [EObject current=null] : iv_ruleBASICTYPE= ruleBASICTYPE EOF ;
    public final EObject entryRuleBASICTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBASICTYPE = null;


        try {
            // InternalAiDsl.g:3437:50: (iv_ruleBASICTYPE= ruleBASICTYPE EOF )
            // InternalAiDsl.g:3438:2: iv_ruleBASICTYPE= ruleBASICTYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBASICTYPERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBASICTYPE=ruleBASICTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBASICTYPE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBASICTYPE"


    // $ANTLR start "ruleBASICTYPE"
    // InternalAiDsl.g:3444:1: ruleBASICTYPE returns [EObject current=null] : ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) ) ) ;
    public final EObject ruleBASICTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_typename_0_1=null;
        Token lv_typename_0_2=null;
        Token lv_typename_0_3=null;
        Token lv_typename_0_4=null;
        Token lv_typename_0_5=null;
        Token lv_typename_0_6=null;


        	enterRule();

        try {
            // InternalAiDsl.g:3450:2: ( ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) ) ) )
            // InternalAiDsl.g:3451:2: ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) ) )
            {
            // InternalAiDsl.g:3451:2: ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) ) )
            // InternalAiDsl.g:3452:3: ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) )
            {
            // InternalAiDsl.g:3452:3: ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) )
            // InternalAiDsl.g:3453:4: (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' )
            {
            // InternalAiDsl.g:3453:4: (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt52=1;
                }
                break;
            case 57:
                {
                alt52=2;
                }
                break;
            case 58:
                {
                alt52=3;
                }
                break;
            case 59:
                {
                alt52=4;
                }
                break;
            case 60:
                {
                alt52=5;
                }
                break;
            case 61:
                {
                alt52=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalAiDsl.g:3454:5: lv_typename_0_1= 'string'
                    {
                    lv_typename_0_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_0_1, grammarAccess.getBASICTYPEAccess().getTypenameStringKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBASICTYPERule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:3465:5: lv_typename_0_2= 'int'
                    {
                    lv_typename_0_2=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_0_2, grammarAccess.getBASICTYPEAccess().getTypenameIntKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBASICTYPERule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:3476:5: lv_typename_0_3= 'boolean'
                    {
                    lv_typename_0_3=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_0_3, grammarAccess.getBASICTYPEAccess().getTypenameBooleanKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBASICTYPERule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:3487:5: lv_typename_0_4= 'byte'
                    {
                    lv_typename_0_4=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_0_4, grammarAccess.getBASICTYPEAccess().getTypenameByteKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBASICTYPERule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalAiDsl.g:3498:5: lv_typename_0_5= 'jsonstring'
                    {
                    lv_typename_0_5=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_0_5, grammarAccess.getBASICTYPEAccess().getTypenameJsonstringKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBASICTYPERule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_0_5, null);
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalAiDsl.g:3509:5: lv_typename_0_6= 'upload'
                    {
                    lv_typename_0_6=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_0_6, grammarAccess.getBASICTYPEAccess().getTypenameUploadKeyword_0_5());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBASICTYPERule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_0_6, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBASICTYPE"

    // $ANTLR start synpred1_InternalAiDsl
    public final void synpred1_InternalAiDsl_fragment() throws RecognitionException {   
        // InternalAiDsl.g:764:5: ( 'else' )
        // InternalAiDsl.g:764:6: 'else'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAiDsl

    // Delegated rules

    public final boolean synpred1_InternalAiDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAiDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\70\6\4\1\46\1\16\1\4\2\uffff";
    static final String dfa_3s = "\1\75\6\45\1\46\1\17\1\4\2\uffff";
    static final String dfa_4s = "\12\uffff\1\1\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\10\40\uffff\1\7",
            "\1\10\40\uffff\1\7",
            "\1\10\40\uffff\1\7",
            "\1\10\40\uffff\1\7",
            "\1\10\40\uffff\1\7",
            "\1\10\40\uffff\1\7",
            "\1\11",
            "\1\12\1\13",
            "\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "304:2: (this_SAIField_0= ruleSAIField | this_SAIMethod_1= ruleSAIMethod )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0024008818000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0024008810000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x3F00000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x3F00000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x3F00000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x3F00000003982060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003800060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x3F00000003981060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003820060L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002003801020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000030000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00003C0000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001800000002010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003800000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000001000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004000000000L});

}