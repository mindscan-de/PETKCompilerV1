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

@SuppressWarnings("all")
public class InternalAiDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'datainput'", "'{'", "'}'", "':'", "'ui'", "'label'", "'uitype'", "'datadictionary'", "'data'", "'extends'", "'true'", "'false'", "'null'", "'vmnode'", "'super'", "'overlay'", "'opcode'", "'out'", "'in'", "'fields'", "'as'", "'require'", "'optional'", "'default'", "'override'", "':='", "'llmtask'", "'('", "')'", "'implements'", "','", "'@'", "'workflow'", "'=>'", "';'", "'.'", "'.*'", "'string'", "'int'", "'boolean'", "'jsonstring'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_declaration_0_0 = null;

        EObject lv_import_declarations_1_0 = null;

        EObject lv_definitions_2_1 = null;

        EObject lv_definitions_2_2 = null;

        EObject lv_definitions_2_3 = null;

        EObject lv_definitions_2_4 = null;

        EObject lv_definitions_2_5 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:77:2: ( ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition ) ) )* ) )
            // InternalAiDsl.g:78:2: ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition ) ) )* )
            {
            // InternalAiDsl.g:78:2: ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition ) ) )* )
            // InternalAiDsl.g:79:3: ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition ) ) )*
            {
            // InternalAiDsl.g:79:3: ( (lv_package_declaration_0_0= rulePackageDeclaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAiDsl.g:80:4: (lv_package_declaration_0_0= rulePackageDeclaration )
                    {
                    // InternalAiDsl.g:80:4: (lv_package_declaration_0_0= rulePackageDeclaration )
                    // InternalAiDsl.g:81:5: lv_package_declaration_0_0= rulePackageDeclaration
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getPackage_declarationPackageDeclarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_package_declaration_0_0=rulePackageDeclaration();

                    state._fsp--;


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
                    break;

            }

            // InternalAiDsl.g:98:3: ( (lv_import_declarations_1_0= ruleImportDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAiDsl.g:99:4: (lv_import_declarations_1_0= ruleImportDeclaration )
            	    {
            	    // InternalAiDsl.g:99:4: (lv_import_declarations_1_0= ruleImportDeclaration )
            	    // InternalAiDsl.g:100:5: lv_import_declarations_1_0= ruleImportDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImport_declarationsImportDeclarationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_import_declarations_1_0=ruleImportDeclaration();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAiDsl.g:117:3: ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13||LA4_0==20||LA4_0==26||LA4_0==39||LA4_0==45) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAiDsl.g:118:4: ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition ) )
            	    {
            	    // InternalAiDsl.g:118:4: ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition ) )
            	    // InternalAiDsl.g:119:5: (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition )
            	    {
            	    // InternalAiDsl.g:119:5: (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition | lv_definitions_2_3= ruleWorkflowInputDefinition | lv_definitions_2_4= ruleLlmTaskDefinition | lv_definitions_2_5= ruleVMNodeDefinition )
            	    int alt3=5;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 13:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // InternalAiDsl.g:120:6: lv_definitions_2_1= ruleWorkflowDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsWorkflowDefinitionParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_1=ruleWorkflowDefinition();

            	            state._fsp--;


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
            	            break;
            	        case 2 :
            	            // InternalAiDsl.g:136:6: lv_definitions_2_2= ruleWorkflowDataDictionaryDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsWorkflowDataDictionaryDefinitionParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_2=ruleWorkflowDataDictionaryDefinition();

            	            state._fsp--;


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
            	            break;
            	        case 3 :
            	            // InternalAiDsl.g:152:6: lv_definitions_2_3= ruleWorkflowInputDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsWorkflowInputDefinitionParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_3=ruleWorkflowInputDefinition();

            	            state._fsp--;


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
            	            break;
            	        case 4 :
            	            // InternalAiDsl.g:168:6: lv_definitions_2_4= ruleLlmTaskDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsLlmTaskDefinitionParserRuleCall_2_0_3());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_4=ruleLlmTaskDefinition();

            	            state._fsp--;


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
            	            break;
            	        case 5 :
            	            // InternalAiDsl.g:184:6: lv_definitions_2_5= ruleVMNodeDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsVMNodeDefinitionParserRuleCall_2_0_4());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_5=ruleVMNodeDefinition();

            	            state._fsp--;


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


            	leaveRule();

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


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalAiDsl.g:206:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAiDsl.g:206:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAiDsl.g:207:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:213:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:219:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:220:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:220:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:221:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAiDsl.g:225:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAiDsl.g:226:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:226:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAiDsl.g:227:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


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


            	leaveRule();

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
    // InternalAiDsl.g:248:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // InternalAiDsl.g:248:58: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // InternalAiDsl.g:249:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:255:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:261:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAiDsl.g:262:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAiDsl.g:262:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAiDsl.g:263:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
            		
            // InternalAiDsl.g:267:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAiDsl.g:268:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAiDsl.g:268:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAiDsl.g:269:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


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


            	leaveRule();

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
    // InternalAiDsl.g:290:1: entryRuleWorkflowInputDefinition returns [EObject current=null] : iv_ruleWorkflowInputDefinition= ruleWorkflowInputDefinition EOF ;
    public final EObject entryRuleWorkflowInputDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowInputDefinition = null;


        try {
            // InternalAiDsl.g:290:64: (iv_ruleWorkflowInputDefinition= ruleWorkflowInputDefinition EOF )
            // InternalAiDsl.g:291:2: iv_ruleWorkflowInputDefinition= ruleWorkflowInputDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkflowInputDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowInputDefinition=ruleWorkflowInputDefinition();

            state._fsp--;

             current =iv_ruleWorkflowInputDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:297:1: ruleWorkflowInputDefinition returns [EObject current=null] : (otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkflowInputDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_uiElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:303:2: ( (otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:304:2: (otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:304:2: (otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:305:3: otherlv_0= 'datainput' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowInputDefinitionAccess().getDatainputKeyword_0());
            		
            // InternalAiDsl.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:311:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowInputDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowInputDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:331:3: ( (lv_uiElements_3_0= ruleWorkflowUIElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAiDsl.g:332:4: (lv_uiElements_3_0= ruleWorkflowUIElement )
            	    {
            	    // InternalAiDsl.g:332:4: (lv_uiElements_3_0= ruleWorkflowUIElement )
            	    // InternalAiDsl.g:333:5: lv_uiElements_3_0= ruleWorkflowUIElement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowInputDefinitionAccess().getUiElementsWorkflowUIElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_uiElements_3_0=ruleWorkflowUIElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowInputDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:358:1: entryRuleWorkflowUIElement returns [EObject current=null] : iv_ruleWorkflowUIElement= ruleWorkflowUIElement EOF ;
    public final EObject entryRuleWorkflowUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowUIElement = null;


        try {
            // InternalAiDsl.g:358:58: (iv_ruleWorkflowUIElement= ruleWorkflowUIElement EOF )
            // InternalAiDsl.g:359:2: iv_ruleWorkflowUIElement= ruleWorkflowUIElement EOF
            {
             newCompositeNode(grammarAccess.getWorkflowUIElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowUIElement=ruleWorkflowUIElement();

            state._fsp--;

             current =iv_ruleWorkflowUIElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:365:1: ruleWorkflowUIElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )? ) ;
    public final EObject ruleWorkflowUIElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_datatype_2_0 = null;

        EObject lv_uielement_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:371:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )? ) )
            // InternalAiDsl.g:372:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )? )
            {
            // InternalAiDsl.g:372:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )? )
            // InternalAiDsl.g:373:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_datatype_2_0= ruleELEMENTTYPE ) ) ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )?
            {
            // InternalAiDsl.g:373:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalAiDsl.g:374:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:374:4: (lv_name_0_0= ruleQualifiedName )
            // InternalAiDsl.g:375:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getWorkflowUIElementAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowUIElementAccess().getColonKeyword_1());
            		
            // InternalAiDsl.g:396:3: ( (lv_datatype_2_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:397:4: (lv_datatype_2_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:397:4: (lv_datatype_2_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:398:5: lv_datatype_2_0= ruleELEMENTTYPE
            {

            					newCompositeNode(grammarAccess.getWorkflowUIElementAccess().getDatatypeELEMENTTYPEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_datatype_2_0=ruleELEMENTTYPE();

            state._fsp--;


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

            // InternalAiDsl.g:415:3: ( (lv_uielement_3_0= ruleWorkflowUIElementMap ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAiDsl.g:416:4: (lv_uielement_3_0= ruleWorkflowUIElementMap )
                    {
                    // InternalAiDsl.g:416:4: (lv_uielement_3_0= ruleWorkflowUIElementMap )
                    // InternalAiDsl.g:417:5: lv_uielement_3_0= ruleWorkflowUIElementMap
                    {

                    					newCompositeNode(grammarAccess.getWorkflowUIElementAccess().getUielementWorkflowUIElementMapParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_uielement_3_0=ruleWorkflowUIElementMap();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:438:1: entryRuleWorkflowUIElementMap returns [EObject current=null] : iv_ruleWorkflowUIElementMap= ruleWorkflowUIElementMap EOF ;
    public final EObject entryRuleWorkflowUIElementMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowUIElementMap = null;


        try {
            // InternalAiDsl.g:438:61: (iv_ruleWorkflowUIElementMap= ruleWorkflowUIElementMap EOF )
            // InternalAiDsl.g:439:2: iv_ruleWorkflowUIElementMap= ruleWorkflowUIElementMap EOF
            {
             newCompositeNode(grammarAccess.getWorkflowUIElementMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowUIElementMap=ruleWorkflowUIElementMap();

            state._fsp--;

             current =iv_ruleWorkflowUIElementMap; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:445:1: ruleWorkflowUIElementMap returns [EObject current=null] : (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleWorkflowUIElementMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token lv_uitype_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAiDsl.g:451:2: ( (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalAiDsl.g:452:2: (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalAiDsl.g:452:2: (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalAiDsl.g:453:3: otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowUIElementMapAccess().getUiKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowUIElementMapAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowUIElementMapAccess().getLabelKeyword_2());
            		
            // InternalAiDsl.g:465:3: ( (lv_label_3_0= RULE_STRING ) )
            // InternalAiDsl.g:466:4: (lv_label_3_0= RULE_STRING )
            {
            // InternalAiDsl.g:466:4: (lv_label_3_0= RULE_STRING )
            // InternalAiDsl.g:467:5: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_label_3_0, grammarAccess.getWorkflowUIElementMapAccess().getLabelSTRINGTerminalRuleCall_3_0());
            				

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

            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowUIElementMapAccess().getUitypeKeyword_4());
            		
            // InternalAiDsl.g:487:3: ( (lv_uitype_5_0= RULE_STRING ) )
            // InternalAiDsl.g:488:4: (lv_uitype_5_0= RULE_STRING )
            {
            // InternalAiDsl.g:488:4: (lv_uitype_5_0= RULE_STRING )
            // InternalAiDsl.g:489:5: lv_uitype_5_0= RULE_STRING
            {
            lv_uitype_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_uitype_5_0, grammarAccess.getWorkflowUIElementMapAccess().getUitypeSTRINGTerminalRuleCall_5_0());
            				

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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkflowUIElementMapAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:513:1: entryRuleWorkflowDataDictionaryDefinition returns [EObject current=null] : iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF ;
    public final EObject entryRuleWorkflowDataDictionaryDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDataDictionaryDefinition = null;


        try {
            // InternalAiDsl.g:513:73: (iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF )
            // InternalAiDsl.g:514:2: iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkflowDataDictionaryDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDataDictionaryDefinition=ruleWorkflowDataDictionaryDefinition();

            state._fsp--;

             current =iv_ruleWorkflowDataDictionaryDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:520:1: ruleWorkflowDataDictionaryDefinition returns [EObject current=null] : ( () otherlv_1= 'datadictionary' otherlv_2= '{' ( (lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkflowDataDictionaryDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dataDictionaryElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:526:2: ( ( () otherlv_1= 'datadictionary' otherlv_2= '{' ( (lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:527:2: ( () otherlv_1= 'datadictionary' otherlv_2= '{' ( (lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:527:2: ( () otherlv_1= 'datadictionary' otherlv_2= '{' ( (lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:528:3: () otherlv_1= 'datadictionary' otherlv_2= '{' ( (lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:528:3: ()
            // InternalAiDsl.g:529:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getWorkflowDataDictionaryDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getDatadictionaryKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:543:3: ( (lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAiDsl.g:544:4: (lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement )
            	    {
            	    // InternalAiDsl.g:544:4: (lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement )
            	    // InternalAiDsl.g:545:5: lv_dataDictionaryElements_3_0= ruleWorkflowDataDictionaryElement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getDataDictionaryElementsWorkflowDataDictionaryElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_dataDictionaryElements_3_0=ruleWorkflowDataDictionaryElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDataDictionaryDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataDictionaryElements",
            	    						lv_dataDictionaryElements_3_0,
            	    						"de.mindscan.ai.aidsl.AiDsl.WorkflowDataDictionaryElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleWorkflowDataDictionaryElement"
    // InternalAiDsl.g:570:1: entryRuleWorkflowDataDictionaryElement returns [EObject current=null] : iv_ruleWorkflowDataDictionaryElement= ruleWorkflowDataDictionaryElement EOF ;
    public final EObject entryRuleWorkflowDataDictionaryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDataDictionaryElement = null;


        try {
            // InternalAiDsl.g:570:70: (iv_ruleWorkflowDataDictionaryElement= ruleWorkflowDataDictionaryElement EOF )
            // InternalAiDsl.g:571:2: iv_ruleWorkflowDataDictionaryElement= ruleWorkflowDataDictionaryElement EOF
            {
             newCompositeNode(grammarAccess.getWorkflowDataDictionaryElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDataDictionaryElement=ruleWorkflowDataDictionaryElement();

            state._fsp--;

             current =iv_ruleWorkflowDataDictionaryElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkflowDataDictionaryElement"


    // $ANTLR start "ruleWorkflowDataDictionaryElement"
    // InternalAiDsl.g:577:1: ruleWorkflowDataDictionaryElement returns [EObject current=null] : (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair ) )* otherlv_6= '}' ) ;
    public final EObject ruleWorkflowDataDictionaryElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_keyValuePairs_5_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:583:2: ( (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair ) )* otherlv_6= '}' ) )
            // InternalAiDsl.g:584:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair ) )* otherlv_6= '}' )
            {
            // InternalAiDsl.g:584:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair ) )* otherlv_6= '}' )
            // InternalAiDsl.g:585:3: otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowDataDictionaryElementAccess().getDataKeyword_0());
            		
            // InternalAiDsl.g:589:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:590:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:590:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:591:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowDataDictionaryElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowDataDictionaryElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.mindscan.ai.aidsl.AiDsl.ID");
            				

            }


            }

            // InternalAiDsl.g:607:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAiDsl.g:608:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkflowDataDictionaryElementAccess().getExtendsKeyword_2_0());
                    			
                    // InternalAiDsl.g:612:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAiDsl.g:613:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAiDsl.g:613:5: (otherlv_3= RULE_ID )
                    // InternalAiDsl.g:614:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkflowDataDictionaryElementRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getWorkflowDataDictionaryElementAccess().getExtendsWorkflowDataDictionaryElementCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowDataDictionaryElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAiDsl.g:630:3: ( (lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAiDsl.g:631:4: (lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair )
            	    {
            	    // InternalAiDsl.g:631:4: (lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair )
            	    // InternalAiDsl.g:632:5: lv_keyValuePairs_5_0= ruleDatadictionaryKeyValuePair
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDataDictionaryElementAccess().getKeyValuePairsDatadictionaryKeyValuePairParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_keyValuePairs_5_0=ruleDatadictionaryKeyValuePair();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDataDictionaryElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"keyValuePairs",
            	    						lv_keyValuePairs_5_0,
            	    						"de.mindscan.ai.aidsl.AiDsl.DatadictionaryKeyValuePair");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkflowDataDictionaryElementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowDataDictionaryElement"


    // $ANTLR start "entryRuleDatadictionaryKeyValuePair"
    // InternalAiDsl.g:657:1: entryRuleDatadictionaryKeyValuePair returns [EObject current=null] : iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF ;
    public final EObject entryRuleDatadictionaryKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatadictionaryKeyValuePair = null;


        try {
            // InternalAiDsl.g:657:67: (iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF )
            // InternalAiDsl.g:658:2: iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getDatadictionaryKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatadictionaryKeyValuePair=ruleDatadictionaryKeyValuePair();

            state._fsp--;

             current =iv_ruleDatadictionaryKeyValuePair; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:664:1: ruleDatadictionaryKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue ) ) ) ) ;
    public final EObject ruleDatadictionaryKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_1 = null;

        AntlrDatatypeRuleToken lv_value_2_2 = null;

        AntlrDatatypeRuleToken lv_value_2_3 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:670:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue ) ) ) ) )
            // InternalAiDsl.g:671:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue ) ) ) )
            {
            // InternalAiDsl.g:671:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue ) ) ) )
            // InternalAiDsl.g:672:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue ) ) )
            {
            // InternalAiDsl.g:672:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalAiDsl.g:673:4: (lv_key_0_0= RULE_ID )
            {
            // InternalAiDsl.g:673:4: (lv_key_0_0= RULE_ID )
            // InternalAiDsl.g:674:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getDatadictionaryKeyValuePairAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatadictionaryKeyValuePairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"de.mindscan.ai.aidsl.AiDsl.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDatadictionaryKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalAiDsl.g:694:3: ( ( (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue ) ) )
            // InternalAiDsl.g:695:4: ( (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue ) )
            {
            // InternalAiDsl.g:695:4: ( (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue ) )
            // InternalAiDsl.g:696:5: (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue )
            {
            // InternalAiDsl.g:696:5: (lv_value_2_1= ruleDataDictionaryBooleanValue | lv_value_2_2= ruleDataDictionaryStringValue | lv_value_2_3= ruleDataDictionaryNullValue )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAiDsl.g:697:6: lv_value_2_1= ruleDataDictionaryBooleanValue
                    {

                    						newCompositeNode(grammarAccess.getDatadictionaryKeyValuePairAccess().getValueDataDictionaryBooleanValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_1=ruleDataDictionaryBooleanValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatadictionaryKeyValuePairRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryBooleanValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:713:6: lv_value_2_2= ruleDataDictionaryStringValue
                    {

                    						newCompositeNode(grammarAccess.getDatadictionaryKeyValuePairAccess().getValueDataDictionaryStringValueParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_2=ruleDataDictionaryStringValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatadictionaryKeyValuePairRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryStringValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:729:6: lv_value_2_3= ruleDataDictionaryNullValue
                    {

                    						newCompositeNode(grammarAccess.getDatadictionaryKeyValuePairAccess().getValueDataDictionaryNullValueParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_3=ruleDataDictionaryNullValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatadictionaryKeyValuePairRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_3,
                    							"de.mindscan.ai.aidsl.AiDsl.DataDictionaryNullValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDataDictionaryBooleanValue"
    // InternalAiDsl.g:751:1: entryRuleDataDictionaryBooleanValue returns [String current=null] : iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF ;
    public final String entryRuleDataDictionaryBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataDictionaryBooleanValue = null;


        try {
            // InternalAiDsl.g:751:66: (iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF )
            // InternalAiDsl.g:752:2: iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryBooleanValue=ruleDataDictionaryBooleanValue();

            state._fsp--;

             current =iv_ruleDataDictionaryBooleanValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:758:1: ruleDataDictionaryBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleDataDictionaryBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAiDsl.g:764:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAiDsl.g:765:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAiDsl.g:765:2: (kw= 'true' | kw= 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAiDsl.g:766:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataDictionaryBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:772:3: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataDictionaryBooleanValueAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:781:1: entryRuleDataDictionaryStringValue returns [String current=null] : iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF ;
    public final String entryRuleDataDictionaryStringValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataDictionaryStringValue = null;


        try {
            // InternalAiDsl.g:781:65: (iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF )
            // InternalAiDsl.g:782:2: iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryStringValue=ruleDataDictionaryStringValue();

            state._fsp--;

             current =iv_ruleDataDictionaryStringValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:788:1: ruleDataDictionaryStringValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDataDictionaryStringValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:794:2: (this_STRING_0= RULE_STRING )
            // InternalAiDsl.g:795:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getDataDictionaryStringValueAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalAiDsl.g:805:1: entryRuleDataDictionaryNullValue returns [String current=null] : iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF ;
    public final String entryRuleDataDictionaryNullValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataDictionaryNullValue = null;


        try {
            // InternalAiDsl.g:805:63: (iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF )
            // InternalAiDsl.g:806:2: iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryNullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryNullValue=ruleDataDictionaryNullValue();

            state._fsp--;

             current =iv_ruleDataDictionaryNullValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:812:1: ruleDataDictionaryNullValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleDataDictionaryNullValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAiDsl.g:818:2: (kw= 'null' )
            // InternalAiDsl.g:819:2: kw= 'null'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDataDictionaryNullValueAccess().getNullKeyword());
            	

            }


            	leaveRule();

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
    // InternalAiDsl.g:827:1: entryRuleVMNodeDefinition returns [EObject current=null] : iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF ;
    public final EObject entryRuleVMNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeDefinition = null;


        try {
            // InternalAiDsl.g:827:57: (iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF )
            // InternalAiDsl.g:828:2: iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF
            {
             newCompositeNode(grammarAccess.getVMNodeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeDefinition=ruleVMNodeDefinition();

            state._fsp--;

             current =iv_ruleVMNodeDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:834:1: ruleVMNodeDefinition returns [EObject current=null] : (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' ) ;
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
            // InternalAiDsl.g:840:2: ( (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' ) )
            // InternalAiDsl.g:841:2: (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' )
            {
            // InternalAiDsl.g:841:2: (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' )
            // InternalAiDsl.g:842:3: otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getVMNodeDefinitionAccess().getVmnodeKeyword_0());
            		
            // InternalAiDsl.g:846:3: ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=27 && LA13_0<=28)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAiDsl.g:847:4: ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) )
                    {
                    // InternalAiDsl.g:847:4: ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) )
                    // InternalAiDsl.g:848:5: (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' )
                    {
                    // InternalAiDsl.g:848:5: (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==27) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==28) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalAiDsl.g:849:6: lv_nodetype_1_1= 'super'
                            {
                            lv_nodetype_1_1=(Token)match(input,27,FOLLOW_5); 

                            						newLeafNode(lv_nodetype_1_1, grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVMNodeDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "nodetype", lv_nodetype_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalAiDsl.g:860:6: lv_nodetype_1_2= 'overlay'
                            {
                            lv_nodetype_1_2=(Token)match(input,28,FOLLOW_5); 

                            						newLeafNode(lv_nodetype_1_2, grammarAccess.getVMNodeDefinitionAccess().getNodetypeOverlayKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVMNodeDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "nodetype", lv_nodetype_1_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalAiDsl.g:873:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:874:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:874:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:875:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVMNodeDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getVMNodeDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAiDsl.g:895:3: ( (lv_elements_4_0= ruleVMNodeEleemnts ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=32)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAiDsl.g:896:4: (lv_elements_4_0= ruleVMNodeEleemnts )
            	    {
            	    // InternalAiDsl.g:896:4: (lv_elements_4_0= ruleVMNodeEleemnts )
            	    // InternalAiDsl.g:897:5: lv_elements_4_0= ruleVMNodeEleemnts
            	    {

            	    					newCompositeNode(grammarAccess.getVMNodeDefinitionAccess().getElementsVMNodeEleemntsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_elements_4_0=ruleVMNodeEleemnts();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVMNodeDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:922:1: entryRuleVMNodeEleemnts returns [EObject current=null] : iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF ;
    public final EObject entryRuleVMNodeEleemnts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeEleemnts = null;


        try {
            // InternalAiDsl.g:922:55: (iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF )
            // InternalAiDsl.g:923:2: iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF
            {
             newCompositeNode(grammarAccess.getVMNodeEleemntsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeEleemnts=ruleVMNodeEleemnts();

            state._fsp--;

             current =iv_ruleVMNodeEleemnts; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:929:1: ruleVMNodeEleemnts returns [EObject current=null] : (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements ) ;
    public final EObject ruleVMNodeEleemnts() throws RecognitionException {
        EObject current = null;

        EObject this_VMNodeOpCodeElement_0 = null;

        EObject this_VMNodeOutElements_1 = null;

        EObject this_VMNodeInElements_2 = null;

        EObject this_VMNodeFieldElements_3 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:935:2: ( (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements ) )
            // InternalAiDsl.g:936:2: (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements )
            {
            // InternalAiDsl.g:936:2: (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAiDsl.g:937:3: this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement
                    {

                    			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOpCodeElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VMNodeOpCodeElement_0=ruleVMNodeOpCodeElement();

                    state._fsp--;


                    			current = this_VMNodeOpCodeElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:946:3: this_VMNodeOutElements_1= ruleVMNodeOutElements
                    {

                    			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOutElementsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VMNodeOutElements_1=ruleVMNodeOutElements();

                    state._fsp--;


                    			current = this_VMNodeOutElements_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:955:3: this_VMNodeInElements_2= ruleVMNodeInElements
                    {

                    			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeInElementsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VMNodeInElements_2=ruleVMNodeInElements();

                    state._fsp--;


                    			current = this_VMNodeInElements_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:964:3: this_VMNodeFieldElements_3= ruleVMNodeFieldElements
                    {

                    			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeFieldElementsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VMNodeFieldElements_3=ruleVMNodeFieldElements();

                    state._fsp--;


                    			current = this_VMNodeFieldElements_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:976:1: entryRuleVMNodeOpCodeElement returns [EObject current=null] : iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF ;
    public final EObject entryRuleVMNodeOpCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOpCodeElement = null;


        try {
            // InternalAiDsl.g:976:60: (iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF )
            // InternalAiDsl.g:977:2: iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF
            {
             newCompositeNode(grammarAccess.getVMNodeOpCodeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeOpCodeElement=ruleVMNodeOpCodeElement();

            state._fsp--;

             current =iv_ruleVMNodeOpCodeElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:983:1: ruleVMNodeOpCodeElement returns [EObject current=null] : (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVMNodeOpCodeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_opcode_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:989:2: ( (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:990:2: (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:990:2: (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) )
            // InternalAiDsl.g:991:3: otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVMNodeOpCodeElementAccess().getOpcodeKeyword_0());
            		
            // InternalAiDsl.g:995:3: ( (lv_opcode_1_0= RULE_STRING ) )
            // InternalAiDsl.g:996:4: (lv_opcode_1_0= RULE_STRING )
            {
            // InternalAiDsl.g:996:4: (lv_opcode_1_0= RULE_STRING )
            // InternalAiDsl.g:997:5: lv_opcode_1_0= RULE_STRING
            {
            lv_opcode_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_opcode_1_0, grammarAccess.getVMNodeOpCodeElementAccess().getOpcodeSTRINGTerminalRuleCall_1_0());
            				

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


            	leaveRule();

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
    // InternalAiDsl.g:1017:1: entryRuleVMNodeOutElements returns [EObject current=null] : iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF ;
    public final EObject entryRuleVMNodeOutElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOutElements = null;


        try {
            // InternalAiDsl.g:1017:58: (iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF )
            // InternalAiDsl.g:1018:2: iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF
            {
             newCompositeNode(grammarAccess.getVMNodeOutElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeOutElements=ruleVMNodeOutElements();

            state._fsp--;

             current =iv_ruleVMNodeOutElements; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1024:1: ruleVMNodeOutElements returns [EObject current=null] : ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeOutElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_outElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1030:2: ( ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:1031:2: ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:1031:2: ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:1032:3: () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:1032:3: ()
            // InternalAiDsl.g:1033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVMNodeOutElementsAccess().getVMNodeOutElementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVMNodeOutElementsAccess().getOutKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVMNodeOutElementsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:1047:3: ( (lv_outElements_3_0= ruleVMNodeOutElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAiDsl.g:1048:4: (lv_outElements_3_0= ruleVMNodeOutElement )
            	    {
            	    // InternalAiDsl.g:1048:4: (lv_outElements_3_0= ruleVMNodeOutElement )
            	    // InternalAiDsl.g:1049:5: lv_outElements_3_0= ruleVMNodeOutElement
            	    {

            	    					newCompositeNode(grammarAccess.getVMNodeOutElementsAccess().getOutElementsVMNodeOutElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_outElements_3_0=ruleVMNodeOutElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVMNodeOutElementsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1074:1: entryRuleVMNodeInElements returns [EObject current=null] : iv_ruleVMNodeInElements= ruleVMNodeInElements EOF ;
    public final EObject entryRuleVMNodeInElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeInElements = null;


        try {
            // InternalAiDsl.g:1074:57: (iv_ruleVMNodeInElements= ruleVMNodeInElements EOF )
            // InternalAiDsl.g:1075:2: iv_ruleVMNodeInElements= ruleVMNodeInElements EOF
            {
             newCompositeNode(grammarAccess.getVMNodeInElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeInElements=ruleVMNodeInElements();

            state._fsp--;

             current =iv_ruleVMNodeInElements; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1081:1: ruleVMNodeInElements returns [EObject current=null] : ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeInElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1087:2: ( ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:1088:2: ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:1088:2: ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:1089:3: () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:1089:3: ()
            // InternalAiDsl.g:1090:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVMNodeInElementsAccess().getVMNodeInElementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVMNodeInElementsAccess().getInKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getVMNodeInElementsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:1104:3: ( (lv_inElements_3_0= ruleVMNodeInElement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=34 && LA17_0<=35)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAiDsl.g:1105:4: (lv_inElements_3_0= ruleVMNodeInElement )
            	    {
            	    // InternalAiDsl.g:1105:4: (lv_inElements_3_0= ruleVMNodeInElement )
            	    // InternalAiDsl.g:1106:5: lv_inElements_3_0= ruleVMNodeInElement
            	    {

            	    					newCompositeNode(grammarAccess.getVMNodeInElementsAccess().getInElementsVMNodeInElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_inElements_3_0=ruleVMNodeInElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVMNodeInElementsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1131:1: entryRuleVMNodeFieldElements returns [EObject current=null] : iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF ;
    public final EObject entryRuleVMNodeFieldElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeFieldElements = null;


        try {
            // InternalAiDsl.g:1131:60: (iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF )
            // InternalAiDsl.g:1132:2: iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF
            {
             newCompositeNode(grammarAccess.getVMNodeFieldElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeFieldElements=ruleVMNodeFieldElements();

            state._fsp--;

             current =iv_ruleVMNodeFieldElements; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1138:1: ruleVMNodeFieldElements returns [EObject current=null] : ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeFieldElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldELements_3_1 = null;

        EObject lv_fieldELements_3_2 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1144:2: ( ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:1145:2: ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:1145:2: ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' )
            // InternalAiDsl.g:1146:3: () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:1146:3: ()
            // InternalAiDsl.g:1147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVMNodeFieldElementsAccess().getVMNodeFieldElementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVMNodeFieldElementsAccess().getFieldsKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getVMNodeFieldElementsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:1161:3: ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=34 && LA19_0<=35)||LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAiDsl.g:1162:4: ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) )
            	    {
            	    // InternalAiDsl.g:1162:4: ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) )
            	    // InternalAiDsl.g:1163:5: (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement )
            	    {
            	    // InternalAiDsl.g:1163:5: (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( ((LA18_0>=34 && LA18_0<=35)) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==37) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalAiDsl.g:1164:6: lv_fieldELements_3_1= ruleVMFieldElement
            	            {

            	            						newCompositeNode(grammarAccess.getVMNodeFieldElementsAccess().getFieldELementsVMFieldElementParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_21);
            	            lv_fieldELements_3_1=ruleVMFieldElement();

            	            state._fsp--;


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
            	            break;
            	        case 2 :
            	            // InternalAiDsl.g:1180:6: lv_fieldELements_3_2= ruleVMOverrideFieldElement
            	            {

            	            						newCompositeNode(grammarAccess.getVMNodeFieldElementsAccess().getFieldELementsVMOverrideFieldElementParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_21);
            	            lv_fieldELements_3_2=ruleVMOverrideFieldElement();

            	            state._fsp--;


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
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVMNodeFieldElementsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1206:1: entryRuleVMNodeOutElement returns [EObject current=null] : iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF ;
    public final EObject entryRuleVMNodeOutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOutElement = null;


        try {
            // InternalAiDsl.g:1206:57: (iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF )
            // InternalAiDsl.g:1207:2: iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF
            {
             newCompositeNode(grammarAccess.getVMNodeOutElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeOutElement=ruleVMNodeOutElement();

            state._fsp--;

             current =iv_ruleVMNodeOutElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1213:1: ruleVMNodeOutElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( (lv_inputreference_4_0= ruleQualifiedName ) ) )? ) ;
    public final EObject ruleVMNodeOutElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasrequire_3_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_inputreference_4_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1219:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( (lv_inputreference_4_0= ruleQualifiedName ) ) )? ) )
            // InternalAiDsl.g:1220:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( (lv_inputreference_4_0= ruleQualifiedName ) ) )? )
            {
            // InternalAiDsl.g:1220:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( (lv_inputreference_4_0= ruleQualifiedName ) ) )? )
            // InternalAiDsl.g:1221:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( (lv_inputreference_4_0= ruleQualifiedName ) ) )?
            {
            // InternalAiDsl.g:1221:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalAiDsl.g:1222:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:1222:4: (lv_name_0_0= ruleQualifiedName )
            // InternalAiDsl.g:1223:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_1=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVMNodeOutElementAccess().getAsKeyword_1());
            		
            // InternalAiDsl.g:1244:3: ( (lv_type_2_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:1245:4: (lv_type_2_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:1245:4: (lv_type_2_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:1246:5: lv_type_2_0= ruleELEMENTTYPE
            {

            					newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getTypeELEMENTTYPEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_2_0=ruleELEMENTTYPE();

            state._fsp--;


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

            // InternalAiDsl.g:1263:3: ( ( (lv_hasrequire_3_0= 'require' ) ) ( (lv_inputreference_4_0= ruleQualifiedName ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAiDsl.g:1264:4: ( (lv_hasrequire_3_0= 'require' ) ) ( (lv_inputreference_4_0= ruleQualifiedName ) )
                    {
                    // InternalAiDsl.g:1264:4: ( (lv_hasrequire_3_0= 'require' ) )
                    // InternalAiDsl.g:1265:5: (lv_hasrequire_3_0= 'require' )
                    {
                    // InternalAiDsl.g:1265:5: (lv_hasrequire_3_0= 'require' )
                    // InternalAiDsl.g:1266:6: lv_hasrequire_3_0= 'require'
                    {
                    lv_hasrequire_3_0=(Token)match(input,34,FOLLOW_5); 

                    						newLeafNode(lv_hasrequire_3_0, grammarAccess.getVMNodeOutElementAccess().getHasrequireRequireKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMNodeOutElementRule());
                    						}
                    						setWithLastConsumed(current, "hasrequire", lv_hasrequire_3_0 != null, "require");
                    					

                    }


                    }

                    // InternalAiDsl.g:1278:4: ( (lv_inputreference_4_0= ruleQualifiedName ) )
                    // InternalAiDsl.g:1279:5: (lv_inputreference_4_0= ruleQualifiedName )
                    {
                    // InternalAiDsl.g:1279:5: (lv_inputreference_4_0= ruleQualifiedName )
                    // InternalAiDsl.g:1280:6: lv_inputreference_4_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getInputreferenceQualifiedNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inputreference_4_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVMNodeOutElementRule());
                    						}
                    						set(
                    							current,
                    							"inputreference",
                    							lv_inputreference_4_0,
                    							"de.mindscan.ai.aidsl.AiDsl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1302:1: entryRuleVMNodeInElement returns [EObject current=null] : iv_ruleVMNodeInElement= ruleVMNodeInElement EOF ;
    public final EObject entryRuleVMNodeInElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeInElement = null;


        try {
            // InternalAiDsl.g:1302:56: (iv_ruleVMNodeInElement= ruleVMNodeInElement EOF )
            // InternalAiDsl.g:1303:2: iv_ruleVMNodeInElement= ruleVMNodeInElement EOF
            {
             newCompositeNode(grammarAccess.getVMNodeInElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeInElement=ruleVMNodeInElement();

            state._fsp--;

             current =iv_ruleVMNodeInElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1309:1: ruleVMNodeInElement returns [EObject current=null] : ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleVMNodeInElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_1=null;
        Token lv_policy_0_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1315:2: ( ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:1316:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:1316:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:1317:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) )
            {
            // InternalAiDsl.g:1317:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=34 && LA22_0<=35)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAiDsl.g:1318:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
                    {
                    // InternalAiDsl.g:1318:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
                    // InternalAiDsl.g:1319:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
                    {
                    // InternalAiDsl.g:1319:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==34) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==35) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAiDsl.g:1320:6: lv_policy_0_1= 'require'
                            {
                            lv_policy_0_1=(Token)match(input,34,FOLLOW_5); 

                            						newLeafNode(lv_policy_0_1, grammarAccess.getVMNodeInElementAccess().getPolicyRequireKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVMNodeInElementRule());
                            						}
                            						setWithLastConsumed(current, "policy", lv_policy_0_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalAiDsl.g:1331:6: lv_policy_0_2= 'optional'
                            {
                            lv_policy_0_2=(Token)match(input,35,FOLLOW_5); 

                            						newLeafNode(lv_policy_0_2, grammarAccess.getVMNodeInElementAccess().getPolicyOptionalKeyword_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVMNodeInElementRule());
                            						}
                            						setWithLastConsumed(current, "policy", lv_policy_0_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalAiDsl.g:1344:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAiDsl.g:1345:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:1345:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAiDsl.g:1346:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getVMNodeInElementAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


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


            	leaveRule();

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
    // InternalAiDsl.g:1367:1: entryRuleVMFieldElement returns [EObject current=null] : iv_ruleVMFieldElement= ruleVMFieldElement EOF ;
    public final EObject entryRuleVMFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMFieldElement = null;


        try {
            // InternalAiDsl.g:1367:55: (iv_ruleVMFieldElement= ruleVMFieldElement EOF )
            // InternalAiDsl.g:1368:2: iv_ruleVMFieldElement= ruleVMFieldElement EOF
            {
             newCompositeNode(grammarAccess.getVMFieldElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMFieldElement=ruleVMFieldElement();

            state._fsp--;

             current =iv_ruleVMFieldElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1374:1: ruleVMFieldElement returns [EObject current=null] : ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVMFieldElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_1=null;
        Token lv_policy_0_2=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_defaultvalue_4_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1380:2: ( ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )? ) )
            // InternalAiDsl.g:1381:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )? )
            {
            // InternalAiDsl.g:1381:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )? )
            // InternalAiDsl.g:1382:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )?
            {
            // InternalAiDsl.g:1382:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )
            // InternalAiDsl.g:1383:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
            {
            // InternalAiDsl.g:1383:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
            // InternalAiDsl.g:1384:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
            {
            // InternalAiDsl.g:1384:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAiDsl.g:1385:6: lv_policy_0_1= 'require'
                    {
                    lv_policy_0_1=(Token)match(input,34,FOLLOW_9); 

                    						newLeafNode(lv_policy_0_1, grammarAccess.getVMFieldElementAccess().getPolicyRequireKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMFieldElementRule());
                    						}
                    						setWithLastConsumed(current, "policy", lv_policy_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:1396:6: lv_policy_0_2= 'optional'
                    {
                    lv_policy_0_2=(Token)match(input,35,FOLLOW_9); 

                    						newLeafNode(lv_policy_0_2, grammarAccess.getVMFieldElementAccess().getPolicyOptionalKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMFieldElementRule());
                    						}
                    						setWithLastConsumed(current, "policy", lv_policy_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalAiDsl.g:1409:3: ( (lv_type_1_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:1410:4: (lv_type_1_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:1410:4: (lv_type_1_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:1411:5: lv_type_1_0= ruleELEMENTTYPE
            {

            					newCompositeNode(grammarAccess.getVMFieldElementAccess().getTypeELEMENTTYPEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleELEMENTTYPE();

            state._fsp--;


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

            // InternalAiDsl.g:1428:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:1429:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:1429:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:1430:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVMFieldElementAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            // InternalAiDsl.g:1446:3: (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAiDsl.g:1447:4: otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getVMFieldElementAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAiDsl.g:1451:4: ( (lv_defaultvalue_4_0= RULE_STRING ) )
                    // InternalAiDsl.g:1452:5: (lv_defaultvalue_4_0= RULE_STRING )
                    {
                    // InternalAiDsl.g:1452:5: (lv_defaultvalue_4_0= RULE_STRING )
                    // InternalAiDsl.g:1453:6: lv_defaultvalue_4_0= RULE_STRING
                    {
                    lv_defaultvalue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_defaultvalue_4_0, grammarAccess.getVMFieldElementAccess().getDefaultvalueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMFieldElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultvalue",
                    							lv_defaultvalue_4_0,
                    							"de.mindscan.ai.aidsl.AiDsl.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1474:1: entryRuleVMOverrideFieldElement returns [EObject current=null] : iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF ;
    public final EObject entryRuleVMOverrideFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMOverrideFieldElement = null;


        try {
            // InternalAiDsl.g:1474:63: (iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF )
            // InternalAiDsl.g:1475:2: iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF
            {
             newCompositeNode(grammarAccess.getVMOverrideFieldElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMOverrideFieldElement=ruleVMOverrideFieldElement();

            state._fsp--;

             current =iv_ruleVMOverrideFieldElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1481:1: ruleVMOverrideFieldElement returns [EObject current=null] : ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleVMOverrideFieldElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_defaultvalue_4_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1487:2: ( ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:1488:2: ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:1488:2: ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )
            // InternalAiDsl.g:1489:3: ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) )
            {
            // InternalAiDsl.g:1489:3: ( (lv_policy_0_0= 'override' ) )
            // InternalAiDsl.g:1490:4: (lv_policy_0_0= 'override' )
            {
            // InternalAiDsl.g:1490:4: (lv_policy_0_0= 'override' )
            // InternalAiDsl.g:1491:5: lv_policy_0_0= 'override'
            {
            lv_policy_0_0=(Token)match(input,37,FOLLOW_9); 

            					newLeafNode(lv_policy_0_0, grammarAccess.getVMOverrideFieldElementAccess().getPolicyOverrideKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVMOverrideFieldElementRule());
            					}
            					setWithLastConsumed(current, "policy", lv_policy_0_0, "override");
            				

            }


            }

            // InternalAiDsl.g:1503:3: ( (lv_type_1_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:1504:4: (lv_type_1_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:1504:4: (lv_type_1_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:1505:5: lv_type_1_0= ruleELEMENTTYPE
            {

            					newCompositeNode(grammarAccess.getVMOverrideFieldElementAccess().getTypeELEMENTTYPEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleELEMENTTYPE();

            state._fsp--;


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

            // InternalAiDsl.g:1522:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:1523:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:1523:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:1524:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVMOverrideFieldElementAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getVMOverrideFieldElementAccess().getColonEqualsSignKeyword_3());
            		
            // InternalAiDsl.g:1544:3: ( (lv_defaultvalue_4_0= RULE_STRING ) )
            // InternalAiDsl.g:1545:4: (lv_defaultvalue_4_0= RULE_STRING )
            {
            // InternalAiDsl.g:1545:4: (lv_defaultvalue_4_0= RULE_STRING )
            // InternalAiDsl.g:1546:5: lv_defaultvalue_4_0= RULE_STRING
            {
            lv_defaultvalue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_defaultvalue_4_0, grammarAccess.getVMOverrideFieldElementAccess().getDefaultvalueSTRINGTerminalRuleCall_4_0());
            				

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


            	leaveRule();

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
    // InternalAiDsl.g:1566:1: entryRuleLlmTaskDefinition returns [EObject current=null] : iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF ;
    public final EObject entryRuleLlmTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmTaskDefinition = null;


        try {
            // InternalAiDsl.g:1566:58: (iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF )
            // InternalAiDsl.g:1567:2: iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF
            {
             newCompositeNode(grammarAccess.getLlmTaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlmTaskDefinition=ruleLlmTaskDefinition();

            state._fsp--;

             current =iv_ruleLlmTaskDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1573:1: ruleLlmTaskDefinition returns [EObject current=null] : (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' ) ;
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
            // InternalAiDsl.g:1579:2: ( (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' ) )
            // InternalAiDsl.g:1580:2: (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' )
            {
            // InternalAiDsl.g:1580:2: (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' )
            // InternalAiDsl.g:1581:3: otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLlmTaskDefinitionAccess().getLlmtaskKeyword_0());
            		
            // InternalAiDsl.g:1585:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:1586:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:1586:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:1587:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLlmTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,40,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getLlmTaskDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getLlmTaskDefinitionAccess().getRightParenthesisKeyword_3());
            		
            // InternalAiDsl.g:1611:3: (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAiDsl.g:1612:4: otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )*
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getLlmTaskDefinitionAccess().getImplementsKeyword_4_0());
                    			
                    // InternalAiDsl.g:1616:4: ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) )
                    // InternalAiDsl.g:1617:5: (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference )
                    {
                    // InternalAiDsl.g:1617:5: (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference )
                    // InternalAiDsl.g:1618:6: lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference
                    {

                    						newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_annotation_interfaces_5_0=ruleAnnotationInterfaceReference();

                    state._fsp--;


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

                    // InternalAiDsl.g:1635:4: (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==43) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalAiDsl.g:1636:5: otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,43,FOLLOW_29); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLlmTaskDefinitionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalAiDsl.g:1640:5: ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) )
                    	    // InternalAiDsl.g:1641:6: (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference )
                    	    {
                    	    // InternalAiDsl.g:1641:6: (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference )
                    	    // InternalAiDsl.g:1642:7: lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_annotation_interfaces_7_0=ruleAnnotationInterfaceReference();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getLlmTaskDefinitionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAiDsl.g:1665:3: ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAiDsl.g:1666:4: (lv_assignments_9_0= ruleLlmVariableAssignment )
            	    {
            	    // InternalAiDsl.g:1666:4: (lv_assignments_9_0= ruleLlmVariableAssignment )
            	    // InternalAiDsl.g:1667:5: lv_assignments_9_0= ruleLlmVariableAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentsLlmVariableAssignmentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_assignments_9_0=ruleLlmVariableAssignment();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLlmTaskDefinitionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1692:1: entryRuleAnnotationInterfaceReference returns [EObject current=null] : iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF ;
    public final EObject entryRuleAnnotationInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationInterfaceReference = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAiDsl.g:1694:2: (iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF )
            // InternalAiDsl.g:1695:2: iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF
            {
             newCompositeNode(grammarAccess.getAnnotationInterfaceReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationInterfaceReference=ruleAnnotationInterfaceReference();

            state._fsp--;

             current =iv_ruleAnnotationInterfaceReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1704:1: ruleAnnotationInterfaceReference returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAnnotationInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAiDsl.g:1711:2: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAiDsl.g:1712:2: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAiDsl.g:1712:2: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            // InternalAiDsl.g:1713:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationInterfaceReferenceAccess().getCommercialAtKeyword_0());
            		
            // InternalAiDsl.g:1717:3: ( (otherlv_1= RULE_ID ) )
            // InternalAiDsl.g:1718:4: (otherlv_1= RULE_ID )
            {
            // InternalAiDsl.g:1718:4: (otherlv_1= RULE_ID )
            // InternalAiDsl.g:1719:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationInterfaceReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAnnotationInterfaceReferenceAccess().getNameVMNodeDefinitionCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1737:1: entryRuleLlmVariableAssignment returns [EObject current=null] : iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF ;
    public final EObject entryRuleLlmVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmVariableAssignment = null;


        try {
            // InternalAiDsl.g:1737:62: (iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF )
            // InternalAiDsl.g:1738:2: iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getLlmVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlmVariableAssignment=ruleLlmVariableAssignment();

            state._fsp--;

             current =iv_ruleLlmVariableAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1744:1: ruleLlmVariableAssignment returns [EObject current=null] : ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLlmVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variablename_0_0=null;
        Token otherlv_1=null;
        Token lv_template_2_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:1750:2: ( ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:1751:2: ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:1751:2: ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) ) )
            // InternalAiDsl.g:1752:3: ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) )
            {
            // InternalAiDsl.g:1752:3: ( (lv_variablename_0_0= RULE_ID ) )
            // InternalAiDsl.g:1753:4: (lv_variablename_0_0= RULE_ID )
            {
            // InternalAiDsl.g:1753:4: (lv_variablename_0_0= RULE_ID )
            // InternalAiDsl.g:1754:5: lv_variablename_0_0= RULE_ID
            {
            lv_variablename_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_variablename_0_0, grammarAccess.getLlmVariableAssignmentAccess().getVariablenameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLlmVariableAssignmentAccess().getColonEqualsSignKeyword_1());
            		
            // InternalAiDsl.g:1774:3: ( (lv_template_2_0= RULE_STRING ) )
            // InternalAiDsl.g:1775:4: (lv_template_2_0= RULE_STRING )
            {
            // InternalAiDsl.g:1775:4: (lv_template_2_0= RULE_STRING )
            // InternalAiDsl.g:1776:5: lv_template_2_0= RULE_STRING
            {
            lv_template_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_template_2_0, grammarAccess.getLlmVariableAssignmentAccess().getTemplateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLlmVariableAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"template",
            						lv_template_2_0,
            						"de.mindscan.ai.aidsl.AiDsl.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1796:1: entryRuleWorkflowDefinition returns [EObject current=null] : iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF ;
    public final EObject entryRuleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinition = null;


        try {
            // InternalAiDsl.g:1796:59: (iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF )
            // InternalAiDsl.g:1797:2: iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkflowDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDefinition=ruleWorkflowDefinition();

            state._fsp--;

             current =iv_ruleWorkflowDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1803:1: ruleWorkflowDefinition returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_7= '}' ) ;
    public final EObject ruleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1809:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_7= '}' ) )
            // InternalAiDsl.g:1810:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_7= '}' )
            {
            // InternalAiDsl.g:1810:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_7= '}' )
            // InternalAiDsl.g:1811:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionAccess().getWorkflowKeyword_0());
            		
            // InternalAiDsl.g:1815:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:1816:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:1816:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:1817:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAiDsl.g:1837:3: ( (otherlv_3= RULE_ID ) )
            // InternalAiDsl.g:1838:4: (otherlv_3= RULE_ID )
            {
            // InternalAiDsl.g:1838:4: (otherlv_3= RULE_ID )
            // InternalAiDsl.g:1839:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowDefinitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkflowDefinitionAccess().getInputWorkflowInputDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowDefinitionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAiDsl.g:1858:3: ( (lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAiDsl.g:1859:4: (lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement )
            	    {
            	    // InternalAiDsl.g:1859:4: (lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement )
            	    // InternalAiDsl.g:1860:5: lv_statements_6_0= ruleWorkflowDefinitionApplyLLMTaskStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getStatementsWorkflowDefinitionApplyLLMTaskStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_6_0=ruleWorkflowDefinitionApplyLLMTaskStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_6_0,
            	    						"de.mindscan.ai.aidsl.AiDsl.WorkflowDefinitionApplyLLMTaskStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1885:1: entryRuleWorkflowDefinitionApplyLLMTaskStatement returns [EObject current=null] : iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF ;
    public final EObject entryRuleWorkflowDefinitionApplyLLMTaskStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinitionApplyLLMTaskStatement = null;


        try {
            // InternalAiDsl.g:1885:80: (iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF )
            // InternalAiDsl.g:1886:2: iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF
            {
             newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDefinitionApplyLLMTaskStatement=ruleWorkflowDefinitionApplyLLMTaskStatement();

            state._fsp--;

             current =iv_ruleWorkflowDefinitionApplyLLMTaskStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1892:1: ruleWorkflowDefinitionApplyLLMTaskStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' ) ;
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
            // InternalAiDsl.g:1898:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' ) )
            // InternalAiDsl.g:1899:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' )
            {
            // InternalAiDsl.g:1899:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' )
            // InternalAiDsl.g:1900:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';'
            {
            // InternalAiDsl.g:1900:3: ( (otherlv_0= RULE_ID ) )
            // InternalAiDsl.g:1901:4: (otherlv_0= RULE_ID )
            {
            // InternalAiDsl.g:1901:4: (otherlv_0= RULE_ID )
            // InternalAiDsl.g:1902:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLlmtaskLlmTaskDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getRightParenthesisKeyword_2());
            		
            // InternalAiDsl.g:1921:3: (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAiDsl.g:1922:4: otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getEqualsSignGreaterThanSignKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAiDsl.g:1930:4: ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalAiDsl.g:1931:5: (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment )
                    	    {
                    	    // InternalAiDsl.g:1931:5: (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment )
                    	    // InternalAiDsl.g:1932:6: lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getNoderesultassigmentsWorkflowDefinitionApplyLLMNodeResultAssignmentParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_noderesultassigments_5_0=ruleWorkflowDefinitionApplyLLMNodeResultAssignment();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:1962:1: entryRuleWorkflowDefinitionApplyLLMNodeResultAssignment returns [EObject current=null] : iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF ;
    public final EObject entryRuleWorkflowDefinitionApplyLLMNodeResultAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment = null;


        try {
            // InternalAiDsl.g:1962:87: (iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF )
            // InternalAiDsl.g:1963:2: iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF
            {
             newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment=ruleWorkflowDefinitionApplyLLMNodeResultAssignment();

            state._fsp--;

             current =iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:1969:1: ruleWorkflowDefinitionApplyLLMNodeResultAssignment returns [EObject current=null] : ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleWorkflowDefinitionApplyLLMNodeResultAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_environmentresultname_0_0 = null;

        AntlrDatatypeRuleToken lv_noderesultname_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1975:2: ( ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:1976:2: ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:1976:2: ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:1977:3: ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) )
            {
            // InternalAiDsl.g:1977:3: ( (lv_environmentresultname_0_0= ruleQualifiedName ) )
            // InternalAiDsl.g:1978:4: (lv_environmentresultname_0_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:1978:4: (lv_environmentresultname_0_0= ruleQualifiedName )
            // InternalAiDsl.g:1979:5: lv_environmentresultname_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentAccess().getEnvironmentresultnameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_environmentresultname_0_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentAccess().getColonKeyword_1());
            		
            // InternalAiDsl.g:2000:3: ( (lv_noderesultname_2_0= ruleQualifiedName ) )
            // InternalAiDsl.g:2001:4: (lv_noderesultname_2_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:2001:4: (lv_noderesultname_2_0= ruleQualifiedName )
            // InternalAiDsl.g:2002:5: lv_noderesultname_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getWorkflowDefinitionApplyLLMNodeResultAssignmentAccess().getNoderesultnameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_noderesultname_2_0=ruleQualifiedName();

            state._fsp--;


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


            	leaveRule();

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
    // InternalAiDsl.g:2023:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAiDsl.g:2023:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAiDsl.g:2024:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:2030:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAiDsl.g:2036:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAiDsl.g:2037:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAiDsl.g:2037:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAiDsl.g:2038:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAiDsl.g:2045:3: (kw= '.' this_ID_2= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==48) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAiDsl.g:2046:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,48,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:2063:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAiDsl.g:2063:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAiDsl.g:2064:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:2070:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2076:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAiDsl.g:2077:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAiDsl.g:2077:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAiDsl.g:2078:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAiDsl.g:2088:3: (kw= '.*' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAiDsl.g:2089:4: kw= '.*'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalAiDsl.g:2099:1: entryRuleELEMENTTYPE returns [EObject current=null] : iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF ;
    public final EObject entryRuleELEMENTTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELEMENTTYPE = null;


        try {
            // InternalAiDsl.g:2099:52: (iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF )
            // InternalAiDsl.g:2100:2: iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF
            {
             newCompositeNode(grammarAccess.getELEMENTTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELEMENTTYPE=ruleELEMENTTYPE();

            state._fsp--;

             current =iv_ruleELEMENTTYPE; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:2106:1: ruleELEMENTTYPE returns [EObject current=null] : this_BASICTYPE_0= ruleBASICTYPE ;
    public final EObject ruleELEMENTTYPE() throws RecognitionException {
        EObject current = null;

        EObject this_BASICTYPE_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2112:2: (this_BASICTYPE_0= ruleBASICTYPE )
            // InternalAiDsl.g:2113:2: this_BASICTYPE_0= ruleBASICTYPE
            {

            		newCompositeNode(grammarAccess.getELEMENTTYPEAccess().getBASICTYPEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BASICTYPE_0=ruleBASICTYPE();

            state._fsp--;


            		current = this_BASICTYPE_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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
    // InternalAiDsl.g:2124:1: entryRuleBASICTYPE returns [EObject current=null] : iv_ruleBASICTYPE= ruleBASICTYPE EOF ;
    public final EObject entryRuleBASICTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBASICTYPE = null;


        try {
            // InternalAiDsl.g:2124:50: (iv_ruleBASICTYPE= ruleBASICTYPE EOF )
            // InternalAiDsl.g:2125:2: iv_ruleBASICTYPE= ruleBASICTYPE EOF
            {
             newCompositeNode(grammarAccess.getBASICTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBASICTYPE=ruleBASICTYPE();

            state._fsp--;

             current =iv_ruleBASICTYPE; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAiDsl.g:2131:1: ruleBASICTYPE returns [EObject current=null] : ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'jsonstring' ) ) ) ;
    public final EObject ruleBASICTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_typename_0_1=null;
        Token lv_typename_0_2=null;
        Token lv_typename_0_3=null;
        Token lv_typename_0_4=null;


        	enterRule();

        try {
            // InternalAiDsl.g:2137:2: ( ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'jsonstring' ) ) ) )
            // InternalAiDsl.g:2138:2: ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'jsonstring' ) ) )
            {
            // InternalAiDsl.g:2138:2: ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'jsonstring' ) ) )
            // InternalAiDsl.g:2139:3: ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'jsonstring' ) )
            {
            // InternalAiDsl.g:2139:3: ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'jsonstring' ) )
            // InternalAiDsl.g:2140:4: (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'jsonstring' )
            {
            // InternalAiDsl.g:2140:4: (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'jsonstring' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt33=1;
                }
                break;
            case 51:
                {
                alt33=2;
                }
                break;
            case 52:
                {
                alt33=3;
                }
                break;
            case 53:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAiDsl.g:2141:5: lv_typename_0_1= 'string'
                    {
                    lv_typename_0_1=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_1, grammarAccess.getBASICTYPEAccess().getTypenameStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:2152:5: lv_typename_0_2= 'int'
                    {
                    lv_typename_0_2=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_2, grammarAccess.getBASICTYPEAccess().getTypenameIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:2163:5: lv_typename_0_3= 'boolean'
                    {
                    lv_typename_0_3=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_3, grammarAccess.getBASICTYPEAccess().getTypenameBooleanKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:2174:5: lv_typename_0_4= 'jsonstring'
                    {
                    lv_typename_0_4=(Token)match(input,53,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_4, grammarAccess.getBASICTYPEAccess().getTypenameJsonstringKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000208004103002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000208004102002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003800020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001E0008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000C00008010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002C00008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000002L});

}