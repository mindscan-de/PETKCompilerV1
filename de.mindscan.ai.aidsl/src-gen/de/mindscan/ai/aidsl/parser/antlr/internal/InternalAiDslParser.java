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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'datainput'", "'{'", "'}'", "':'", "'ui'", "'label'", "'uitype'", "'default'", "'options'", "'['", "','", "']'", "'datadictionary'", "'extends'", "'true'", "'false'", "'null'", "'vmnode'", "'super'", "'overlay'", "'opcode'", "'out'", "'in'", "'fields'", "'as'", "'require'", "'optional'", "'override'", "':='", "'llmtask'", "'('", "')'", "'implements'", "'@'", "'workflow'", "'=>'", "';'", "'.'", "'.*'", "'string'", "'int'", "'boolean'", "'byte'", "'jsonstring'", "'upload'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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

                if ( (LA4_0==13||LA4_0==25||LA4_0==30||LA4_0==42||LA4_0==47) ) {
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
            	    case 47:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 13:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case 30:
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
    // InternalAiDsl.g:445:1: ruleWorkflowUIElementMap returns [EObject current=null] : (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' otherlv_9= '[' ( (lv_options_10_0= RULE_STRING ) ) (otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) ) ) otherlv_13= ']' )? otherlv_14= '}' ) ;
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
        Token otherlv_9=null;
        Token lv_options_10_0=null;
        Token otherlv_11=null;
        Token lv_options_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_defaultvalue_7_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:451:2: ( (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' otherlv_9= '[' ( (lv_options_10_0= RULE_STRING ) ) (otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) ) ) otherlv_13= ']' )? otherlv_14= '}' ) )
            // InternalAiDsl.g:452:2: (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' otherlv_9= '[' ( (lv_options_10_0= RULE_STRING ) ) (otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) ) ) otherlv_13= ']' )? otherlv_14= '}' )
            {
            // InternalAiDsl.g:452:2: (otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' otherlv_9= '[' ( (lv_options_10_0= RULE_STRING ) ) (otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) ) ) otherlv_13= ']' )? otherlv_14= '}' )
            // InternalAiDsl.g:453:3: otherlv_0= 'ui' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= 'uitype' ( (lv_uitype_5_0= RULE_STRING ) ) (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )? (otherlv_8= 'options' otherlv_9= '[' ( (lv_options_10_0= RULE_STRING ) ) (otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) ) ) otherlv_13= ']' )? otherlv_14= '}'
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

            // InternalAiDsl.g:505:3: (otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAiDsl.g:506:4: otherlv_6= 'default' ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkflowUIElementMapAccess().getDefaultKeyword_6_0());
                    			
                    // InternalAiDsl.g:510:4: ( (lv_defaultvalue_7_0= ruleDataDictionaryValue ) )
                    // InternalAiDsl.g:511:5: (lv_defaultvalue_7_0= ruleDataDictionaryValue )
                    {
                    // InternalAiDsl.g:511:5: (lv_defaultvalue_7_0= ruleDataDictionaryValue )
                    // InternalAiDsl.g:512:6: lv_defaultvalue_7_0= ruleDataDictionaryValue
                    {

                    						newCompositeNode(grammarAccess.getWorkflowUIElementMapAccess().getDefaultvalueDataDictionaryValueParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_defaultvalue_7_0=ruleDataDictionaryValue();

                    state._fsp--;


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
                    break;

            }

            // InternalAiDsl.g:530:3: (otherlv_8= 'options' otherlv_9= '[' ( (lv_options_10_0= RULE_STRING ) ) (otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) ) ) otherlv_13= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAiDsl.g:531:4: otherlv_8= 'options' otherlv_9= '[' ( (lv_options_10_0= RULE_STRING ) ) (otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) ) ) otherlv_13= ']'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkflowUIElementMapAccess().getOptionsKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getWorkflowUIElementMapAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalAiDsl.g:539:4: ( (lv_options_10_0= RULE_STRING ) )
                    // InternalAiDsl.g:540:5: (lv_options_10_0= RULE_STRING )
                    {
                    // InternalAiDsl.g:540:5: (lv_options_10_0= RULE_STRING )
                    // InternalAiDsl.g:541:6: lv_options_10_0= RULE_STRING
                    {
                    lv_options_10_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_options_10_0, grammarAccess.getWorkflowUIElementMapAccess().getOptionsSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkflowUIElementMapRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"options",
                    							lv_options_10_0,
                    							"de.mindscan.ai.aidsl.AiDsl.STRING");
                    					

                    }


                    }

                    // InternalAiDsl.g:557:4: (otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) ) )
                    // InternalAiDsl.g:558:5: otherlv_11= ',' ( (lv_options_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_12); 

                    					newLeafNode(otherlv_11, grammarAccess.getWorkflowUIElementMapAccess().getCommaKeyword_7_3_0());
                    				
                    // InternalAiDsl.g:562:5: ( (lv_options_12_0= RULE_STRING ) )
                    // InternalAiDsl.g:563:6: (lv_options_12_0= RULE_STRING )
                    {
                    // InternalAiDsl.g:563:6: (lv_options_12_0= RULE_STRING )
                    // InternalAiDsl.g:564:7: lv_options_12_0= RULE_STRING
                    {
                    lv_options_12_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    							newLeafNode(lv_options_12_0, grammarAccess.getWorkflowUIElementMapAccess().getOptionsSTRINGTerminalRuleCall_7_3_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getWorkflowUIElementMapRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"options",
                    								lv_options_12_0,
                    								"de.mindscan.ai.aidsl.AiDsl.STRING");
                    						

                    }


                    }


                    }

                    otherlv_13=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getWorkflowUIElementMapAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getWorkflowUIElementMapAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalAiDsl.g:594:1: entryRuleWorkflowDataDictionaryDefinition returns [EObject current=null] : iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF ;
    public final EObject entryRuleWorkflowDataDictionaryDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDataDictionaryDefinition = null;


        try {
            // InternalAiDsl.g:594:73: (iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF )
            // InternalAiDsl.g:595:2: iv_ruleWorkflowDataDictionaryDefinition= ruleWorkflowDataDictionaryDefinition EOF
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
    // InternalAiDsl.g:601:1: ruleWorkflowDataDictionaryDefinition returns [EObject current=null] : (otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkflowDataDictionaryDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_keyValuePairs_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:607:2: ( (otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:608:2: (otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:608:2: (otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}' )
            // InternalAiDsl.g:609:3: otherlv_0= 'datadictionary' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getDatadictionaryKeyword_0());
            		
            // InternalAiDsl.g:613:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:614:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:614:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:615:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:635:3: ( (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAiDsl.g:636:4: (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair )
            	    {
            	    // InternalAiDsl.g:636:4: (lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair )
            	    // InternalAiDsl.g:637:5: lv_keyValuePairs_3_0= ruleDatadictionaryKeyValuePair
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDataDictionaryDefinitionAccess().getKeyValuePairsDatadictionaryKeyValuePairParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_keyValuePairs_3_0=ruleDatadictionaryKeyValuePair();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "entryRuleDatadictionaryKeyValuePair"
    // InternalAiDsl.g:662:1: entryRuleDatadictionaryKeyValuePair returns [EObject current=null] : iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF ;
    public final EObject entryRuleDatadictionaryKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatadictionaryKeyValuePair = null;


        try {
            // InternalAiDsl.g:662:67: (iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF )
            // InternalAiDsl.g:663:2: iv_ruleDatadictionaryKeyValuePair= ruleDatadictionaryKeyValuePair EOF
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
    // InternalAiDsl.g:669:1: ruleDatadictionaryKeyValuePair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) ) ) ;
    public final EObject ruleDatadictionaryKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:675:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) ) ) )
            // InternalAiDsl.g:676:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) ) )
            {
            // InternalAiDsl.g:676:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) ) )
            // InternalAiDsl.g:677:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? otherlv_3= ':' ( (lv_value_4_0= ruleDataDictionaryValue ) )
            {
            // InternalAiDsl.g:677:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAiDsl.g:678:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAiDsl.g:678:4: (lv_name_0_0= RULE_ID )
            // InternalAiDsl.g:679:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDatadictionaryKeyValuePairAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            // InternalAiDsl.g:695:3: (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAiDsl.g:696:4: otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatadictionaryKeyValuePairAccess().getExtendsKeyword_1_0());
                    			
                    // InternalAiDsl.g:700:4: ( (otherlv_2= RULE_ID ) )
                    // InternalAiDsl.g:701:5: (otherlv_2= RULE_ID )
                    {
                    // InternalAiDsl.g:701:5: (otherlv_2= RULE_ID )
                    // InternalAiDsl.g:702:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDatadictionaryKeyValuePairRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_2, grammarAccess.getDatadictionaryKeyValuePairAccess().getExtendsDatadictionaryKeyValuePairCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getDatadictionaryKeyValuePairAccess().getColonKeyword_2());
            		
            // InternalAiDsl.g:718:3: ( (lv_value_4_0= ruleDataDictionaryValue ) )
            // InternalAiDsl.g:719:4: (lv_value_4_0= ruleDataDictionaryValue )
            {
            // InternalAiDsl.g:719:4: (lv_value_4_0= ruleDataDictionaryValue )
            // InternalAiDsl.g:720:5: lv_value_4_0= ruleDataDictionaryValue
            {

            					newCompositeNode(grammarAccess.getDatadictionaryKeyValuePairAccess().getValueDataDictionaryValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleDataDictionaryValue();

            state._fsp--;


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


    // $ANTLR start "entryRuleDataDictionaryValue"
    // InternalAiDsl.g:741:1: entryRuleDataDictionaryValue returns [EObject current=null] : iv_ruleDataDictionaryValue= ruleDataDictionaryValue EOF ;
    public final EObject entryRuleDataDictionaryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryValue = null;


        try {
            // InternalAiDsl.g:741:60: (iv_ruleDataDictionaryValue= ruleDataDictionaryValue EOF )
            // InternalAiDsl.g:742:2: iv_ruleDataDictionaryValue= ruleDataDictionaryValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryValue=ruleDataDictionaryValue();

            state._fsp--;

             current =iv_ruleDataDictionaryValue; 
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
    // $ANTLR end "entryRuleDataDictionaryValue"


    // $ANTLR start "ruleDataDictionaryValue"
    // InternalAiDsl.g:748:1: ruleDataDictionaryValue returns [EObject current=null] : ( () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) ) ) ;
    public final EObject ruleDataDictionaryValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_1_3 = null;

        EObject lv_value_1_4 = null;

        EObject lv_value_1_5 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:754:2: ( ( () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) ) ) )
            // InternalAiDsl.g:755:2: ( () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) ) )
            {
            // InternalAiDsl.g:755:2: ( () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) ) )
            // InternalAiDsl.g:756:3: () ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) )
            {
            // InternalAiDsl.g:756:3: ()
            // InternalAiDsl.g:757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDictionaryValueAccess().getDataDictionaryValueAction_0(),
            					current);
            			

            }

            // InternalAiDsl.g:763:3: ( ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) ) )
            // InternalAiDsl.g:764:4: ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) )
            {
            // InternalAiDsl.g:764:4: ( (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue ) )
            // InternalAiDsl.g:765:5: (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue )
            {
            // InternalAiDsl.g:765:5: (lv_value_1_1= ruleDataDictionaryBooleanValue | lv_value_1_2= ruleDataDictionaryNullValue | lv_value_1_3= ruleDataDictionaryStringValue | lv_value_1_4= ruleDataDictionaryArrayValue | lv_value_1_5= ruleDataDictionaryMapValue )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 14:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAiDsl.g:766:6: lv_value_1_1= ruleDataDictionaryBooleanValue
                    {

                    						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryBooleanValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_1=ruleDataDictionaryBooleanValue();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalAiDsl.g:782:6: lv_value_1_2= ruleDataDictionaryNullValue
                    {

                    						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryNullValueParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_2=ruleDataDictionaryNullValue();

                    state._fsp--;


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
                    break;
                case 3 :
                    // InternalAiDsl.g:798:6: lv_value_1_3= ruleDataDictionaryStringValue
                    {

                    						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryStringValueParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_3=ruleDataDictionaryStringValue();

                    state._fsp--;


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
                    break;
                case 4 :
                    // InternalAiDsl.g:814:6: lv_value_1_4= ruleDataDictionaryArrayValue
                    {

                    						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryArrayValueParserRuleCall_1_0_3());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_4=ruleDataDictionaryArrayValue();

                    state._fsp--;


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
                    break;
                case 5 :
                    // InternalAiDsl.g:830:6: lv_value_1_5= ruleDataDictionaryMapValue
                    {

                    						newCompositeNode(grammarAccess.getDataDictionaryValueAccess().getValueDataDictionaryMapValueParserRuleCall_1_0_4());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_5=ruleDataDictionaryMapValue();

                    state._fsp--;


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
    // $ANTLR end "ruleDataDictionaryValue"


    // $ANTLR start "entryRuleDataDictionaryArrayValue"
    // InternalAiDsl.g:852:1: entryRuleDataDictionaryArrayValue returns [EObject current=null] : iv_ruleDataDictionaryArrayValue= ruleDataDictionaryArrayValue EOF ;
    public final EObject entryRuleDataDictionaryArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryArrayValue = null;


        try {
            // InternalAiDsl.g:852:65: (iv_ruleDataDictionaryArrayValue= ruleDataDictionaryArrayValue EOF )
            // InternalAiDsl.g:853:2: iv_ruleDataDictionaryArrayValue= ruleDataDictionaryArrayValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryArrayValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryArrayValue=ruleDataDictionaryArrayValue();

            state._fsp--;

             current =iv_ruleDataDictionaryArrayValue; 
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
    // $ANTLR end "entryRuleDataDictionaryArrayValue"


    // $ANTLR start "ruleDataDictionaryArrayValue"
    // InternalAiDsl.g:859:1: ruleDataDictionaryArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleDataDictionaryArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAiDsl.g:865:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']' ) )
            // InternalAiDsl.g:866:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']' )
            {
            // InternalAiDsl.g:866:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']' )
            // InternalAiDsl.g:867:3: () otherlv_1= '[' ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )? otherlv_5= ']'
            {
            // InternalAiDsl.g:867:3: ()
            // InternalAiDsl.g:868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDictionaryArrayValueAccess().getDataDictionaryArrayValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDataDictionaryArrayValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAiDsl.g:878:3: ( ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAiDsl.g:879:4: ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
                    {
                    // InternalAiDsl.g:879:4: ( (lv_values_2_0= RULE_STRING ) )
                    // InternalAiDsl.g:880:5: (lv_values_2_0= RULE_STRING )
                    {
                    // InternalAiDsl.g:880:5: (lv_values_2_0= RULE_STRING )
                    // InternalAiDsl.g:881:6: lv_values_2_0= RULE_STRING
                    {
                    lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_values_2_0, grammarAccess.getDataDictionaryArrayValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0());
                    					

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

                    // InternalAiDsl.g:897:4: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==23) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalAiDsl.g:898:5: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getDataDictionaryArrayValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAiDsl.g:902:5: ( (lv_values_4_0= RULE_STRING ) )
                    	    // InternalAiDsl.g:903:6: (lv_values_4_0= RULE_STRING )
                    	    {
                    	    // InternalAiDsl.g:903:6: (lv_values_4_0= RULE_STRING )
                    	    // InternalAiDsl.g:904:7: lv_values_4_0= RULE_STRING
                    	    {
                    	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    	    							newLeafNode(lv_values_4_0, grammarAccess.getDataDictionaryArrayValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0());
                    	    						

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
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDataDictionaryArrayValueAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleDataDictionaryArrayValue"


    // $ANTLR start "entryRuleDataDictionaryMapValue"
    // InternalAiDsl.g:930:1: entryRuleDataDictionaryMapValue returns [EObject current=null] : iv_ruleDataDictionaryMapValue= ruleDataDictionaryMapValue EOF ;
    public final EObject entryRuleDataDictionaryMapValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryMapValue = null;


        try {
            // InternalAiDsl.g:930:63: (iv_ruleDataDictionaryMapValue= ruleDataDictionaryMapValue EOF )
            // InternalAiDsl.g:931:2: iv_ruleDataDictionaryMapValue= ruleDataDictionaryMapValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryMapValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryMapValue=ruleDataDictionaryMapValue();

            state._fsp--;

             current =iv_ruleDataDictionaryMapValue; 
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
    // $ANTLR end "entryRuleDataDictionaryMapValue"


    // $ANTLR start "ruleDataDictionaryMapValue"
    // InternalAiDsl.g:937:1: ruleDataDictionaryMapValue returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}' ) ;
    public final EObject ruleDataDictionaryMapValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_keyValuePairs_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:943:2: ( ( () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}' ) )
            // InternalAiDsl.g:944:2: ( () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}' )
            {
            // InternalAiDsl.g:944:2: ( () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}' )
            // InternalAiDsl.g:945:3: () otherlv_1= '{' ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )* otherlv_3= '}'
            {
            // InternalAiDsl.g:945:3: ()
            // InternalAiDsl.g:946:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDictionaryMapValueAccess().getDataDictionaryMapValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDataDictionaryMapValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAiDsl.g:956:3: ( (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAiDsl.g:957:4: (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair )
            	    {
            	    // InternalAiDsl.g:957:4: (lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair )
            	    // InternalAiDsl.g:958:5: lv_keyValuePairs_2_0= ruleDatadictionaryKeyValuePair
            	    {

            	    					newCompositeNode(grammarAccess.getDataDictionaryMapValueAccess().getKeyValuePairsDatadictionaryKeyValuePairParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_keyValuePairs_2_0=ruleDatadictionaryKeyValuePair();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDataDictionaryMapValueAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleDataDictionaryMapValue"


    // $ANTLR start "entryRuleDataDictionaryBooleanValue"
    // InternalAiDsl.g:983:1: entryRuleDataDictionaryBooleanValue returns [EObject current=null] : iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF ;
    public final EObject entryRuleDataDictionaryBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryBooleanValue = null;


        try {
            // InternalAiDsl.g:983:67: (iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF )
            // InternalAiDsl.g:984:2: iv_ruleDataDictionaryBooleanValue= ruleDataDictionaryBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryBooleanValue=ruleDataDictionaryBooleanValue();

            state._fsp--;

             current =iv_ruleDataDictionaryBooleanValue; 
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
    // InternalAiDsl.g:990:1: ruleDataDictionaryBooleanValue returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) ;
    public final EObject ruleDataDictionaryBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalAiDsl.g:996:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) )
            // InternalAiDsl.g:997:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            {
            // InternalAiDsl.g:997:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            // InternalAiDsl.g:998:3: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            {
            // InternalAiDsl.g:998:3: ()
            // InternalAiDsl.g:999:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDictionaryBooleanValueAccess().getDataDictionaryBooleanValueAction_0(),
            					current);
            			

            }

            // InternalAiDsl.g:1005:3: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            // InternalAiDsl.g:1006:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            {
            // InternalAiDsl.g:1006:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            // InternalAiDsl.g:1007:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            {
            // InternalAiDsl.g:1007:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAiDsl.g:1008:6: lv_value_1_1= 'true'
                    {
                    lv_value_1_1=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_value_1_1, grammarAccess.getDataDictionaryBooleanValueAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataDictionaryBooleanValueRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:1019:6: lv_value_1_2= 'false'
                    {
                    lv_value_1_2=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_value_1_2, grammarAccess.getDataDictionaryBooleanValueAccess().getValueFalseKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataDictionaryBooleanValueRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_2, null);
                    					

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
    // $ANTLR end "ruleDataDictionaryBooleanValue"


    // $ANTLR start "entryRuleDataDictionaryStringValue"
    // InternalAiDsl.g:1036:1: entryRuleDataDictionaryStringValue returns [EObject current=null] : iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF ;
    public final EObject entryRuleDataDictionaryStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryStringValue = null;


        try {
            // InternalAiDsl.g:1036:66: (iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF )
            // InternalAiDsl.g:1037:2: iv_ruleDataDictionaryStringValue= ruleDataDictionaryStringValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryStringValue=ruleDataDictionaryStringValue();

            state._fsp--;

             current =iv_ruleDataDictionaryStringValue; 
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
    // InternalAiDsl.g:1043:1: ruleDataDictionaryStringValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDataDictionaryStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:1049:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:1050:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:1050:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalAiDsl.g:1051:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalAiDsl.g:1051:3: ()
            // InternalAiDsl.g:1052:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDictionaryStringValueAccess().getDataDictionaryStringValueAction_0(),
            					current);
            			

            }

            // InternalAiDsl.g:1058:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalAiDsl.g:1059:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalAiDsl.g:1059:4: (lv_value_1_0= RULE_STRING )
            // InternalAiDsl.g:1060:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getDataDictionaryStringValueAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

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
    // InternalAiDsl.g:1080:1: entryRuleDataDictionaryNullValue returns [EObject current=null] : iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF ;
    public final EObject entryRuleDataDictionaryNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDictionaryNullValue = null;


        try {
            // InternalAiDsl.g:1080:64: (iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF )
            // InternalAiDsl.g:1081:2: iv_ruleDataDictionaryNullValue= ruleDataDictionaryNullValue EOF
            {
             newCompositeNode(grammarAccess.getDataDictionaryNullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDictionaryNullValue=ruleDataDictionaryNullValue();

            state._fsp--;

             current =iv_ruleDataDictionaryNullValue; 
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
    // InternalAiDsl.g:1087:1: ruleDataDictionaryNullValue returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleDataDictionaryNullValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:1093:2: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // InternalAiDsl.g:1094:2: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // InternalAiDsl.g:1094:2: ( () ( (lv_value_1_0= 'null' ) ) )
            // InternalAiDsl.g:1095:3: () ( (lv_value_1_0= 'null' ) )
            {
            // InternalAiDsl.g:1095:3: ()
            // InternalAiDsl.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataDictionaryNullValueAccess().getDataDictionaryNullValueAction_0(),
            					current);
            			

            }

            // InternalAiDsl.g:1102:3: ( (lv_value_1_0= 'null' ) )
            // InternalAiDsl.g:1103:4: (lv_value_1_0= 'null' )
            {
            // InternalAiDsl.g:1103:4: (lv_value_1_0= 'null' )
            // InternalAiDsl.g:1104:5: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,29,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getDataDictionaryNullValueAccess().getValueNullKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDictionaryNullValueRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_1_0, "null");
            				

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
    // $ANTLR end "ruleDataDictionaryNullValue"


    // $ANTLR start "entryRuleVMNodeDefinition"
    // InternalAiDsl.g:1120:1: entryRuleVMNodeDefinition returns [EObject current=null] : iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF ;
    public final EObject entryRuleVMNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeDefinition = null;


        try {
            // InternalAiDsl.g:1120:57: (iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF )
            // InternalAiDsl.g:1121:2: iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF
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
    // InternalAiDsl.g:1127:1: ruleVMNodeDefinition returns [EObject current=null] : (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' ) ;
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
            // InternalAiDsl.g:1133:2: ( (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' ) )
            // InternalAiDsl.g:1134:2: (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' )
            {
            // InternalAiDsl.g:1134:2: (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' )
            // InternalAiDsl.g:1135:3: otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getVMNodeDefinitionAccess().getVmnodeKeyword_0());
            		
            // InternalAiDsl.g:1139:3: ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=31 && LA17_0<=32)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAiDsl.g:1140:4: ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) )
                    {
                    // InternalAiDsl.g:1140:4: ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) )
                    // InternalAiDsl.g:1141:5: (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' )
                    {
                    // InternalAiDsl.g:1141:5: (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==31) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==32) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAiDsl.g:1142:6: lv_nodetype_1_1= 'super'
                            {
                            lv_nodetype_1_1=(Token)match(input,31,FOLLOW_5); 

                            						newLeafNode(lv_nodetype_1_1, grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVMNodeDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "nodetype", lv_nodetype_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalAiDsl.g:1153:6: lv_nodetype_1_2= 'overlay'
                            {
                            lv_nodetype_1_2=(Token)match(input,32,FOLLOW_5); 

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

            // InternalAiDsl.g:1166:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:1167:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:1167:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:1168:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getVMNodeDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAiDsl.g:1188:3: ( (lv_elements_4_0= ruleVMNodeEleemnts ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=36)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAiDsl.g:1189:4: (lv_elements_4_0= ruleVMNodeEleemnts )
            	    {
            	    // InternalAiDsl.g:1189:4: (lv_elements_4_0= ruleVMNodeEleemnts )
            	    // InternalAiDsl.g:1190:5: lv_elements_4_0= ruleVMNodeEleemnts
            	    {

            	    					newCompositeNode(grammarAccess.getVMNodeDefinitionAccess().getElementsVMNodeEleemntsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop18;
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
    // InternalAiDsl.g:1215:1: entryRuleVMNodeEleemnts returns [EObject current=null] : iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF ;
    public final EObject entryRuleVMNodeEleemnts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeEleemnts = null;


        try {
            // InternalAiDsl.g:1215:55: (iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF )
            // InternalAiDsl.g:1216:2: iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF
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
    // InternalAiDsl.g:1222:1: ruleVMNodeEleemnts returns [EObject current=null] : (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements ) ;
    public final EObject ruleVMNodeEleemnts() throws RecognitionException {
        EObject current = null;

        EObject this_VMNodeOpCodeElement_0 = null;

        EObject this_VMNodeOutElements_1 = null;

        EObject this_VMNodeInElements_2 = null;

        EObject this_VMNodeFieldElements_3 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1228:2: ( (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements ) )
            // InternalAiDsl.g:1229:2: (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements )
            {
            // InternalAiDsl.g:1229:2: (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElements_1= ruleVMNodeOutElements | this_VMNodeInElements_2= ruleVMNodeInElements | this_VMNodeFieldElements_3= ruleVMNodeFieldElements )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            case 36:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAiDsl.g:1230:3: this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement
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
                    // InternalAiDsl.g:1239:3: this_VMNodeOutElements_1= ruleVMNodeOutElements
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
                    // InternalAiDsl.g:1248:3: this_VMNodeInElements_2= ruleVMNodeInElements
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
                    // InternalAiDsl.g:1257:3: this_VMNodeFieldElements_3= ruleVMNodeFieldElements
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
    // InternalAiDsl.g:1269:1: entryRuleVMNodeOpCodeElement returns [EObject current=null] : iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF ;
    public final EObject entryRuleVMNodeOpCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOpCodeElement = null;


        try {
            // InternalAiDsl.g:1269:60: (iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF )
            // InternalAiDsl.g:1270:2: iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF
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
    // InternalAiDsl.g:1276:1: ruleVMNodeOpCodeElement returns [EObject current=null] : (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVMNodeOpCodeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_opcode_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:1282:2: ( (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:1283:2: (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:1283:2: (otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) ) )
            // InternalAiDsl.g:1284:3: otherlv_0= 'opcode' ( (lv_opcode_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVMNodeOpCodeElementAccess().getOpcodeKeyword_0());
            		
            // InternalAiDsl.g:1288:3: ( (lv_opcode_1_0= RULE_STRING ) )
            // InternalAiDsl.g:1289:4: (lv_opcode_1_0= RULE_STRING )
            {
            // InternalAiDsl.g:1289:4: (lv_opcode_1_0= RULE_STRING )
            // InternalAiDsl.g:1290:5: lv_opcode_1_0= RULE_STRING
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
    // InternalAiDsl.g:1310:1: entryRuleVMNodeOutElements returns [EObject current=null] : iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF ;
    public final EObject entryRuleVMNodeOutElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOutElements = null;


        try {
            // InternalAiDsl.g:1310:58: (iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF )
            // InternalAiDsl.g:1311:2: iv_ruleVMNodeOutElements= ruleVMNodeOutElements EOF
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
    // InternalAiDsl.g:1317:1: ruleVMNodeOutElements returns [EObject current=null] : ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeOutElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_outElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1323:2: ( ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:1324:2: ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:1324:2: ( () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:1325:3: () otherlv_1= 'out' otherlv_2= '{' ( (lv_outElements_3_0= ruleVMNodeOutElement ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:1325:3: ()
            // InternalAiDsl.g:1326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVMNodeOutElementsAccess().getVMNodeOutElementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVMNodeOutElementsAccess().getOutKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVMNodeOutElementsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:1340:3: ( (lv_outElements_3_0= ruleVMNodeOutElement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAiDsl.g:1341:4: (lv_outElements_3_0= ruleVMNodeOutElement )
            	    {
            	    // InternalAiDsl.g:1341:4: (lv_outElements_3_0= ruleVMNodeOutElement )
            	    // InternalAiDsl.g:1342:5: lv_outElements_3_0= ruleVMNodeOutElement
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
            	    break loop20;
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
    // InternalAiDsl.g:1367:1: entryRuleVMNodeInElements returns [EObject current=null] : iv_ruleVMNodeInElements= ruleVMNodeInElements EOF ;
    public final EObject entryRuleVMNodeInElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeInElements = null;


        try {
            // InternalAiDsl.g:1367:57: (iv_ruleVMNodeInElements= ruleVMNodeInElements EOF )
            // InternalAiDsl.g:1368:2: iv_ruleVMNodeInElements= ruleVMNodeInElements EOF
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
    // InternalAiDsl.g:1374:1: ruleVMNodeInElements returns [EObject current=null] : ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeInElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inElements_3_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1380:2: ( ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:1381:2: ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:1381:2: ( () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}' )
            // InternalAiDsl.g:1382:3: () otherlv_1= 'in' otherlv_2= '{' ( (lv_inElements_3_0= ruleVMNodeInElement ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:1382:3: ()
            // InternalAiDsl.g:1383:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVMNodeInElementsAccess().getVMNodeInElementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVMNodeInElementsAccess().getInKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getVMNodeInElementsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:1397:3: ( (lv_inElements_3_0= ruleVMNodeInElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=38 && LA21_0<=39)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAiDsl.g:1398:4: (lv_inElements_3_0= ruleVMNodeInElement )
            	    {
            	    // InternalAiDsl.g:1398:4: (lv_inElements_3_0= ruleVMNodeInElement )
            	    // InternalAiDsl.g:1399:5: lv_inElements_3_0= ruleVMNodeInElement
            	    {

            	    					newCompositeNode(grammarAccess.getVMNodeInElementsAccess().getInElementsVMNodeInElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop21;
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
    // InternalAiDsl.g:1424:1: entryRuleVMNodeFieldElements returns [EObject current=null] : iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF ;
    public final EObject entryRuleVMNodeFieldElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeFieldElements = null;


        try {
            // InternalAiDsl.g:1424:60: (iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF )
            // InternalAiDsl.g:1425:2: iv_ruleVMNodeFieldElements= ruleVMNodeFieldElements EOF
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
    // InternalAiDsl.g:1431:1: ruleVMNodeFieldElements returns [EObject current=null] : ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVMNodeFieldElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldELements_3_1 = null;

        EObject lv_fieldELements_3_2 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1437:2: ( ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' ) )
            // InternalAiDsl.g:1438:2: ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' )
            {
            // InternalAiDsl.g:1438:2: ( () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}' )
            // InternalAiDsl.g:1439:3: () otherlv_1= 'fields' otherlv_2= '{' ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )* otherlv_4= '}'
            {
            // InternalAiDsl.g:1439:3: ()
            // InternalAiDsl.g:1440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVMNodeFieldElementsAccess().getVMNodeFieldElementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVMNodeFieldElementsAccess().getFieldsKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getVMNodeFieldElementsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAiDsl.g:1454:3: ( ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=38 && LA23_0<=40)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAiDsl.g:1455:4: ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) )
            	    {
            	    // InternalAiDsl.g:1455:4: ( (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement ) )
            	    // InternalAiDsl.g:1456:5: (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement )
            	    {
            	    // InternalAiDsl.g:1456:5: (lv_fieldELements_3_1= ruleVMFieldElement | lv_fieldELements_3_2= ruleVMOverrideFieldElement )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( ((LA22_0>=38 && LA22_0<=39)) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==40) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalAiDsl.g:1457:6: lv_fieldELements_3_1= ruleVMFieldElement
            	            {

            	            						newCompositeNode(grammarAccess.getVMNodeFieldElementsAccess().getFieldELementsVMFieldElementParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_27);
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
            	            // InternalAiDsl.g:1473:6: lv_fieldELements_3_2= ruleVMOverrideFieldElement
            	            {

            	            						newCompositeNode(grammarAccess.getVMNodeFieldElementsAccess().getFieldELementsVMOverrideFieldElementParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_27);
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
            	    break loop23;
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
    // InternalAiDsl.g:1499:1: entryRuleVMNodeOutElement returns [EObject current=null] : iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF ;
    public final EObject entryRuleVMNodeOutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOutElement = null;


        try {
            // InternalAiDsl.g:1499:57: (iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF )
            // InternalAiDsl.g:1500:2: iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF
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
    // InternalAiDsl.g:1506:1: ruleVMNodeOutElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleVMNodeOutElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasrequire_3_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1512:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )? ) )
            // InternalAiDsl.g:1513:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )? )
            {
            // InternalAiDsl.g:1513:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )? )
            // InternalAiDsl.g:1514:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleELEMENTTYPE ) ) ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )?
            {
            // InternalAiDsl.g:1514:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalAiDsl.g:1515:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:1515:4: (lv_name_0_0= ruleQualifiedName )
            // InternalAiDsl.g:1516:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_1=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVMNodeOutElementAccess().getAsKeyword_1());
            		
            // InternalAiDsl.g:1537:3: ( (lv_type_2_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:1538:4: (lv_type_2_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:1538:4: (lv_type_2_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:1539:5: lv_type_2_0= ruleELEMENTTYPE
            {

            					newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getTypeELEMENTTYPEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalAiDsl.g:1556:3: ( ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAiDsl.g:1557:4: ( (lv_hasrequire_3_0= 'require' ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAiDsl.g:1557:4: ( (lv_hasrequire_3_0= 'require' ) )
                    // InternalAiDsl.g:1558:5: (lv_hasrequire_3_0= 'require' )
                    {
                    // InternalAiDsl.g:1558:5: (lv_hasrequire_3_0= 'require' )
                    // InternalAiDsl.g:1559:6: lv_hasrequire_3_0= 'require'
                    {
                    lv_hasrequire_3_0=(Token)match(input,38,FOLLOW_5); 

                    						newLeafNode(lv_hasrequire_3_0, grammarAccess.getVMNodeOutElementAccess().getHasrequireRequireKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMNodeOutElementRule());
                    						}
                    						setWithLastConsumed(current, "hasrequire", lv_hasrequire_3_0 != null, "require");
                    					

                    }


                    }

                    // InternalAiDsl.g:1571:4: ( ( ruleQualifiedName ) )
                    // InternalAiDsl.g:1572:5: ( ruleQualifiedName )
                    {
                    // InternalAiDsl.g:1572:5: ( ruleQualifiedName )
                    // InternalAiDsl.g:1573:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMNodeOutElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getInputreferenceVMNodeInElementCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


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
    // InternalAiDsl.g:1592:1: entryRuleVMNodeInElement returns [EObject current=null] : iv_ruleVMNodeInElement= ruleVMNodeInElement EOF ;
    public final EObject entryRuleVMNodeInElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeInElement = null;


        try {
            // InternalAiDsl.g:1592:56: (iv_ruleVMNodeInElement= ruleVMNodeInElement EOF )
            // InternalAiDsl.g:1593:2: iv_ruleVMNodeInElement= ruleVMNodeInElement EOF
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
    // InternalAiDsl.g:1599:1: ruleVMNodeInElement returns [EObject current=null] : ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleVMNodeInElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_1=null;
        Token lv_policy_0_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1605:2: ( ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:1606:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:1606:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:1607:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )? ( (lv_name_1_0= ruleQualifiedName ) )
            {
            // InternalAiDsl.g:1607:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=38 && LA26_0<=39)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAiDsl.g:1608:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
                    {
                    // InternalAiDsl.g:1608:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
                    // InternalAiDsl.g:1609:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
                    {
                    // InternalAiDsl.g:1609:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==38) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==39) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAiDsl.g:1610:6: lv_policy_0_1= 'require'
                            {
                            lv_policy_0_1=(Token)match(input,38,FOLLOW_5); 

                            						newLeafNode(lv_policy_0_1, grammarAccess.getVMNodeInElementAccess().getPolicyRequireKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVMNodeInElementRule());
                            						}
                            						setWithLastConsumed(current, "policy", lv_policy_0_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalAiDsl.g:1621:6: lv_policy_0_2= 'optional'
                            {
                            lv_policy_0_2=(Token)match(input,39,FOLLOW_5); 

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

            // InternalAiDsl.g:1634:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAiDsl.g:1635:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:1635:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAiDsl.g:1636:5: lv_name_1_0= ruleQualifiedName
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
    // InternalAiDsl.g:1657:1: entryRuleVMFieldElement returns [EObject current=null] : iv_ruleVMFieldElement= ruleVMFieldElement EOF ;
    public final EObject entryRuleVMFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMFieldElement = null;


        try {
            // InternalAiDsl.g:1657:55: (iv_ruleVMFieldElement= ruleVMFieldElement EOF )
            // InternalAiDsl.g:1658:2: iv_ruleVMFieldElement= ruleVMFieldElement EOF
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
    // InternalAiDsl.g:1664:1: ruleVMFieldElement returns [EObject current=null] : ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )? ) ;
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
            // InternalAiDsl.g:1670:2: ( ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )? ) )
            // InternalAiDsl.g:1671:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )? )
            {
            // InternalAiDsl.g:1671:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )? )
            // InternalAiDsl.g:1672:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )?
            {
            // InternalAiDsl.g:1672:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )
            // InternalAiDsl.g:1673:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
            {
            // InternalAiDsl.g:1673:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
            // InternalAiDsl.g:1674:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
            {
            // InternalAiDsl.g:1674:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            else if ( (LA27_0==39) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAiDsl.g:1675:6: lv_policy_0_1= 'require'
                    {
                    lv_policy_0_1=(Token)match(input,38,FOLLOW_9); 

                    						newLeafNode(lv_policy_0_1, grammarAccess.getVMFieldElementAccess().getPolicyRequireKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMFieldElementRule());
                    						}
                    						setWithLastConsumed(current, "policy", lv_policy_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:1686:6: lv_policy_0_2= 'optional'
                    {
                    lv_policy_0_2=(Token)match(input,39,FOLLOW_9); 

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

            // InternalAiDsl.g:1699:3: ( (lv_type_1_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:1700:4: (lv_type_1_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:1700:4: (lv_type_1_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:1701:5: lv_type_1_0= ruleELEMENTTYPE
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

            // InternalAiDsl.g:1718:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:1719:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:1719:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:1720:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            // InternalAiDsl.g:1736:3: (otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAiDsl.g:1737:4: otherlv_3= 'default' ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getVMFieldElementAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAiDsl.g:1741:4: ( (lv_defaultvalue_4_0= ruleDataDictionaryValue ) )
                    // InternalAiDsl.g:1742:5: (lv_defaultvalue_4_0= ruleDataDictionaryValue )
                    {
                    // InternalAiDsl.g:1742:5: (lv_defaultvalue_4_0= ruleDataDictionaryValue )
                    // InternalAiDsl.g:1743:6: lv_defaultvalue_4_0= ruleDataDictionaryValue
                    {

                    						newCompositeNode(grammarAccess.getVMFieldElementAccess().getDefaultvalueDataDictionaryValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_defaultvalue_4_0=ruleDataDictionaryValue();

                    state._fsp--;


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
    // InternalAiDsl.g:1765:1: entryRuleVMOverrideFieldElement returns [EObject current=null] : iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF ;
    public final EObject entryRuleVMOverrideFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMOverrideFieldElement = null;


        try {
            // InternalAiDsl.g:1765:63: (iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF )
            // InternalAiDsl.g:1766:2: iv_ruleVMOverrideFieldElement= ruleVMOverrideFieldElement EOF
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
    // InternalAiDsl.g:1772:1: ruleVMOverrideFieldElement returns [EObject current=null] : ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleVMOverrideFieldElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_defaultvalue_4_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:1778:2: ( ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:1779:2: ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:1779:2: ( ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )
            // InternalAiDsl.g:1780:3: ( (lv_policy_0_0= 'override' ) ) ( (lv_type_1_0= ruleELEMENTTYPE ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_defaultvalue_4_0= RULE_STRING ) )
            {
            // InternalAiDsl.g:1780:3: ( (lv_policy_0_0= 'override' ) )
            // InternalAiDsl.g:1781:4: (lv_policy_0_0= 'override' )
            {
            // InternalAiDsl.g:1781:4: (lv_policy_0_0= 'override' )
            // InternalAiDsl.g:1782:5: lv_policy_0_0= 'override'
            {
            lv_policy_0_0=(Token)match(input,40,FOLLOW_9); 

            					newLeafNode(lv_policy_0_0, grammarAccess.getVMOverrideFieldElementAccess().getPolicyOverrideKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVMOverrideFieldElementRule());
            					}
            					setWithLastConsumed(current, "policy", lv_policy_0_0, "override");
            				

            }


            }

            // InternalAiDsl.g:1794:3: ( (lv_type_1_0= ruleELEMENTTYPE ) )
            // InternalAiDsl.g:1795:4: (lv_type_1_0= ruleELEMENTTYPE )
            {
            // InternalAiDsl.g:1795:4: (lv_type_1_0= ruleELEMENTTYPE )
            // InternalAiDsl.g:1796:5: lv_type_1_0= ruleELEMENTTYPE
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

            // InternalAiDsl.g:1813:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:1814:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:1814:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:1815:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_3=(Token)match(input,41,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getVMOverrideFieldElementAccess().getColonEqualsSignKeyword_3());
            		
            // InternalAiDsl.g:1835:3: ( (lv_defaultvalue_4_0= RULE_STRING ) )
            // InternalAiDsl.g:1836:4: (lv_defaultvalue_4_0= RULE_STRING )
            {
            // InternalAiDsl.g:1836:4: (lv_defaultvalue_4_0= RULE_STRING )
            // InternalAiDsl.g:1837:5: lv_defaultvalue_4_0= RULE_STRING
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
    // InternalAiDsl.g:1857:1: entryRuleLlmTaskDefinition returns [EObject current=null] : iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF ;
    public final EObject entryRuleLlmTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmTaskDefinition = null;


        try {
            // InternalAiDsl.g:1857:58: (iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF )
            // InternalAiDsl.g:1858:2: iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF
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
    // InternalAiDsl.g:1864:1: ruleLlmTaskDefinition returns [EObject current=null] : (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' ) ;
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
            // InternalAiDsl.g:1870:2: ( (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' ) )
            // InternalAiDsl.g:1871:2: (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' )
            {
            // InternalAiDsl.g:1871:2: (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' )
            // InternalAiDsl.g:1872:3: otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLlmTaskDefinitionAccess().getLlmtaskKeyword_0());
            		
            // InternalAiDsl.g:1876:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:1877:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:1877:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:1878:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            otherlv_2=(Token)match(input,43,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getLlmTaskDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getLlmTaskDefinitionAccess().getRightParenthesisKeyword_3());
            		
            // InternalAiDsl.g:1902:3: (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAiDsl.g:1903:4: otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )*
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getLlmTaskDefinitionAccess().getImplementsKeyword_4_0());
                    			
                    // InternalAiDsl.g:1907:4: ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) )
                    // InternalAiDsl.g:1908:5: (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference )
                    {
                    // InternalAiDsl.g:1908:5: (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference )
                    // InternalAiDsl.g:1909:6: lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference
                    {

                    						newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

                    // InternalAiDsl.g:1926:4: (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==23) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalAiDsl.g:1927:5: otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,23,FOLLOW_35); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLlmTaskDefinitionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalAiDsl.g:1931:5: ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) )
                    	    // InternalAiDsl.g:1932:6: (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference )
                    	    {
                    	    // InternalAiDsl.g:1932:6: (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference )
                    	    // InternalAiDsl.g:1933:7: lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getLlmTaskDefinitionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAiDsl.g:1956:3: ( (lv_assignments_9_0= ruleLlmVariableAssignment ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAiDsl.g:1957:4: (lv_assignments_9_0= ruleLlmVariableAssignment )
            	    {
            	    // InternalAiDsl.g:1957:4: (lv_assignments_9_0= ruleLlmVariableAssignment )
            	    // InternalAiDsl.g:1958:5: lv_assignments_9_0= ruleLlmVariableAssignment
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
            	    break loop31;
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
    // InternalAiDsl.g:1983:1: entryRuleAnnotationInterfaceReference returns [EObject current=null] : iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF ;
    public final EObject entryRuleAnnotationInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationInterfaceReference = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAiDsl.g:1985:2: (iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF )
            // InternalAiDsl.g:1986:2: iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF
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
    // InternalAiDsl.g:1995:1: ruleAnnotationInterfaceReference returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAnnotationInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAiDsl.g:2002:2: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAiDsl.g:2003:2: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAiDsl.g:2003:2: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            // InternalAiDsl.g:2004:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationInterfaceReferenceAccess().getCommercialAtKeyword_0());
            		
            // InternalAiDsl.g:2008:3: ( (otherlv_1= RULE_ID ) )
            // InternalAiDsl.g:2009:4: (otherlv_1= RULE_ID )
            {
            // InternalAiDsl.g:2009:4: (otherlv_1= RULE_ID )
            // InternalAiDsl.g:2010:5: otherlv_1= RULE_ID
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
    // InternalAiDsl.g:2028:1: entryRuleLlmVariableAssignment returns [EObject current=null] : iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF ;
    public final EObject entryRuleLlmVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmVariableAssignment = null;


        try {
            // InternalAiDsl.g:2028:62: (iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF )
            // InternalAiDsl.g:2029:2: iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF
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
    // InternalAiDsl.g:2035:1: ruleLlmVariableAssignment returns [EObject current=null] : ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) ) ) ;
    public final EObject ruleLlmVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variablename_0_0=null;
        Token otherlv_1=null;
        EObject lv_template_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2041:2: ( ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) ) ) )
            // InternalAiDsl.g:2042:2: ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) ) )
            {
            // InternalAiDsl.g:2042:2: ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) ) )
            // InternalAiDsl.g:2043:3: ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= ruleDataDictionaryValue ) )
            {
            // InternalAiDsl.g:2043:3: ( (lv_variablename_0_0= RULE_ID ) )
            // InternalAiDsl.g:2044:4: (lv_variablename_0_0= RULE_ID )
            {
            // InternalAiDsl.g:2044:4: (lv_variablename_0_0= RULE_ID )
            // InternalAiDsl.g:2045:5: lv_variablename_0_0= RULE_ID
            {
            lv_variablename_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLlmVariableAssignmentAccess().getColonEqualsSignKeyword_1());
            		
            // InternalAiDsl.g:2065:3: ( (lv_template_2_0= ruleDataDictionaryValue ) )
            // InternalAiDsl.g:2066:4: (lv_template_2_0= ruleDataDictionaryValue )
            {
            // InternalAiDsl.g:2066:4: (lv_template_2_0= ruleDataDictionaryValue )
            // InternalAiDsl.g:2067:5: lv_template_2_0= ruleDataDictionaryValue
            {

            					newCompositeNode(grammarAccess.getLlmVariableAssignmentAccess().getTemplateDataDictionaryValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_template_2_0=ruleDataDictionaryValue();

            state._fsp--;


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
    // InternalAiDsl.g:2088:1: entryRuleWorkflowDefinition returns [EObject current=null] : iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF ;
    public final EObject entryRuleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinition = null;


        try {
            // InternalAiDsl.g:2088:59: (iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF )
            // InternalAiDsl.g:2089:2: iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF
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
    // InternalAiDsl.g:2095:1: ruleWorkflowDefinition returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}' ) ;
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
            // InternalAiDsl.g:2101:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}' ) )
            // InternalAiDsl.g:2102:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}' )
            {
            // InternalAiDsl.g:2102:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}' )
            // InternalAiDsl.g:2103:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionAccess().getWorkflowKeyword_0());
            		
            // InternalAiDsl.g:2107:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:2108:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:2108:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:2109:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            otherlv_2=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAiDsl.g:2129:3: ( (otherlv_3= RULE_ID ) )
            // InternalAiDsl.g:2130:4: (otherlv_3= RULE_ID )
            {
            // InternalAiDsl.g:2130:4: (otherlv_3= RULE_ID )
            // InternalAiDsl.g:2131:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowDefinitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkflowDefinitionAccess().getInputWorkflowInputDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowDefinitionAccess().getCommaKeyword_4());
            		
            // InternalAiDsl.g:2146:3: ( (otherlv_5= RULE_ID ) )
            // InternalAiDsl.g:2147:4: (otherlv_5= RULE_ID )
            {
            // InternalAiDsl.g:2147:4: (otherlv_5= RULE_ID )
            // InternalAiDsl.g:2148:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowDefinitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkflowDefinitionAccess().getDatadictionaryWorkflowDataDictionaryDefinitionCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkflowDefinitionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalAiDsl.g:2167:3: ( (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAiDsl.g:2168:4: (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement )
            	    {
            	    // InternalAiDsl.g:2168:4: (lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement )
            	    // InternalAiDsl.g:2169:5: lv_statements_8_0= ruleWorkflowDefinitionApplyLLMTaskStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getStatementsWorkflowDefinitionApplyLLMTaskStatementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_8_0=ruleWorkflowDefinitionApplyLLMTaskStatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalAiDsl.g:2194:1: entryRuleWorkflowDefinitionApplyLLMTaskStatement returns [EObject current=null] : iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF ;
    public final EObject entryRuleWorkflowDefinitionApplyLLMTaskStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinitionApplyLLMTaskStatement = null;


        try {
            // InternalAiDsl.g:2194:80: (iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF )
            // InternalAiDsl.g:2195:2: iv_ruleWorkflowDefinitionApplyLLMTaskStatement= ruleWorkflowDefinitionApplyLLMTaskStatement EOF
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
    // InternalAiDsl.g:2201:1: ruleWorkflowDefinitionApplyLLMTaskStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' ) ;
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
            // InternalAiDsl.g:2207:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' ) )
            // InternalAiDsl.g:2208:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' )
            {
            // InternalAiDsl.g:2208:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';' )
            // InternalAiDsl.g:2209:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )? otherlv_7= ';'
            {
            // InternalAiDsl.g:2209:3: ( (otherlv_0= RULE_ID ) )
            // InternalAiDsl.g:2210:4: (otherlv_0= RULE_ID )
            {
            // InternalAiDsl.g:2210:4: (otherlv_0= RULE_ID )
            // InternalAiDsl.g:2211:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLlmtaskLlmTaskDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getRightParenthesisKeyword_2());
            		
            // InternalAiDsl.g:2230:3: (otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAiDsl.g:2231:4: otherlv_3= '=>' otherlv_4= '{' ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getEqualsSignGreaterThanSignKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAiDsl.g:2239:4: ( (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalAiDsl.g:2240:5: (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment )
                    	    {
                    	    // InternalAiDsl.g:2240:5: (lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment )
                    	    // InternalAiDsl.g:2241:6: lv_noderesultassigments_5_0= ruleWorkflowDefinitionApplyLLMNodeResultAssignment
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkflowDefinitionApplyLLMTaskStatementAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,49,FOLLOW_2); 

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
    // InternalAiDsl.g:2271:1: entryRuleWorkflowDefinitionApplyLLMNodeResultAssignment returns [EObject current=null] : iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF ;
    public final EObject entryRuleWorkflowDefinitionApplyLLMNodeResultAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment = null;


        try {
            // InternalAiDsl.g:2271:87: (iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF )
            // InternalAiDsl.g:2272:2: iv_ruleWorkflowDefinitionApplyLLMNodeResultAssignment= ruleWorkflowDefinitionApplyLLMNodeResultAssignment EOF
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
    // InternalAiDsl.g:2278:1: ruleWorkflowDefinitionApplyLLMNodeResultAssignment returns [EObject current=null] : ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleWorkflowDefinitionApplyLLMNodeResultAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_environmentresultname_0_0 = null;

        AntlrDatatypeRuleToken lv_noderesultname_2_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2284:2: ( ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:2285:2: ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:2285:2: ( ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:2286:3: ( (lv_environmentresultname_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_noderesultname_2_0= ruleQualifiedName ) )
            {
            // InternalAiDsl.g:2286:3: ( (lv_environmentresultname_0_0= ruleQualifiedName ) )
            // InternalAiDsl.g:2287:4: (lv_environmentresultname_0_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:2287:4: (lv_environmentresultname_0_0= ruleQualifiedName )
            // InternalAiDsl.g:2288:5: lv_environmentresultname_0_0= ruleQualifiedName
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
            		
            // InternalAiDsl.g:2309:3: ( (lv_noderesultname_2_0= ruleQualifiedName ) )
            // InternalAiDsl.g:2310:4: (lv_noderesultname_2_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:2310:4: (lv_noderesultname_2_0= ruleQualifiedName )
            // InternalAiDsl.g:2311:5: lv_noderesultname_2_0= ruleQualifiedName
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
    // InternalAiDsl.g:2332:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAiDsl.g:2332:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAiDsl.g:2333:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAiDsl.g:2339:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAiDsl.g:2345:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAiDsl.g:2346:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAiDsl.g:2346:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAiDsl.g:2347:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAiDsl.g:2354:3: (kw= '.' this_ID_2= RULE_ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==50) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAiDsl.g:2355:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalAiDsl.g:2372:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAiDsl.g:2372:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAiDsl.g:2373:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAiDsl.g:2379:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2385:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAiDsl.g:2386:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAiDsl.g:2386:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAiDsl.g:2387:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAiDsl.g:2397:3: (kw= '.*' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAiDsl.g:2398:4: kw= '.*'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAiDsl.g:2408:1: entryRuleELEMENTTYPE returns [EObject current=null] : iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF ;
    public final EObject entryRuleELEMENTTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELEMENTTYPE = null;


        try {
            // InternalAiDsl.g:2408:52: (iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF )
            // InternalAiDsl.g:2409:2: iv_ruleELEMENTTYPE= ruleELEMENTTYPE EOF
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
    // InternalAiDsl.g:2415:1: ruleELEMENTTYPE returns [EObject current=null] : (this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )? ) ;
    public final EObject ruleELEMENTTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_1_0=null;
        Token otherlv_2=null;
        EObject this_BASICTYPE_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:2421:2: ( (this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )? ) )
            // InternalAiDsl.g:2422:2: (this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )? )
            {
            // InternalAiDsl.g:2422:2: (this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )? )
            // InternalAiDsl.g:2423:3: this_BASICTYPE_0= ruleBASICTYPE ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )?
            {

            			newCompositeNode(grammarAccess.getELEMENTTYPEAccess().getBASICTYPEParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_BASICTYPE_0=ruleBASICTYPE();

            state._fsp--;


            			current = this_BASICTYPE_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAiDsl.g:2431:3: ( ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAiDsl.g:2432:4: ( (lv_isArray_1_0= '[' ) ) otherlv_2= ']'
                    {
                    // InternalAiDsl.g:2432:4: ( (lv_isArray_1_0= '[' ) )
                    // InternalAiDsl.g:2433:5: (lv_isArray_1_0= '[' )
                    {
                    // InternalAiDsl.g:2433:5: (lv_isArray_1_0= '[' )
                    // InternalAiDsl.g:2434:6: lv_isArray_1_0= '['
                    {
                    lv_isArray_1_0=(Token)match(input,22,FOLLOW_19); 

                    						newLeafNode(lv_isArray_1_0, grammarAccess.getELEMENTTYPEAccess().getIsArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELEMENTTYPERule());
                    						}
                    						setWithLastConsumed(current, "isArray", lv_isArray_1_0 != null, "[");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getELEMENTTYPEAccess().getRightSquareBracketKeyword_1_1());
                    			

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
    // $ANTLR end "ruleELEMENTTYPE"


    // $ANTLR start "entryRuleBASICTYPE"
    // InternalAiDsl.g:2455:1: entryRuleBASICTYPE returns [EObject current=null] : iv_ruleBASICTYPE= ruleBASICTYPE EOF ;
    public final EObject entryRuleBASICTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBASICTYPE = null;


        try {
            // InternalAiDsl.g:2455:50: (iv_ruleBASICTYPE= ruleBASICTYPE EOF )
            // InternalAiDsl.g:2456:2: iv_ruleBASICTYPE= ruleBASICTYPE EOF
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
    // InternalAiDsl.g:2462:1: ruleBASICTYPE returns [EObject current=null] : ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) ) ) ;
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
            // InternalAiDsl.g:2468:2: ( ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) ) ) )
            // InternalAiDsl.g:2469:2: ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) ) )
            {
            // InternalAiDsl.g:2469:2: ( ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) ) )
            // InternalAiDsl.g:2470:3: ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) )
            {
            // InternalAiDsl.g:2470:3: ( (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' ) )
            // InternalAiDsl.g:2471:4: (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' )
            {
            // InternalAiDsl.g:2471:4: (lv_typename_0_1= 'string' | lv_typename_0_2= 'int' | lv_typename_0_3= 'boolean' | lv_typename_0_4= 'byte' | lv_typename_0_5= 'jsonstring' | lv_typename_0_6= 'upload' )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt38=1;
                }
                break;
            case 53:
                {
                alt38=2;
                }
                break;
            case 54:
                {
                alt38=3;
                }
                break;
            case 55:
                {
                alt38=4;
                }
                break;
            case 56:
                {
                alt38=5;
                }
                break;
            case 57:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalAiDsl.g:2472:5: lv_typename_0_1= 'string'
                    {
                    lv_typename_0_1=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_1, grammarAccess.getBASICTYPEAccess().getTypenameStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:2483:5: lv_typename_0_2= 'int'
                    {
                    lv_typename_0_2=(Token)match(input,53,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_2, grammarAccess.getBASICTYPEAccess().getTypenameIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:2494:5: lv_typename_0_3= 'boolean'
                    {
                    lv_typename_0_3=(Token)match(input,54,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_3, grammarAccess.getBASICTYPEAccess().getTypenameBooleanKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:2505:5: lv_typename_0_4= 'byte'
                    {
                    lv_typename_0_4=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_4, grammarAccess.getBASICTYPEAccess().getTypenameByteKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalAiDsl.g:2516:5: lv_typename_0_5= 'jsonstring'
                    {
                    lv_typename_0_5=(Token)match(input,56,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_5, grammarAccess.getBASICTYPEAccess().getTypenameJsonstringKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalAiDsl.g:2527:5: lv_typename_0_6= 'upload'
                    {
                    lv_typename_0_6=(Token)match(input,57,FOLLOW_2); 

                    					newLeafNode(lv_typename_0_6, grammarAccess.getBASICTYPEAccess().getTypenameUploadKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBASICTYPERule());
                    					}
                    					setWithLastConsumed(current, "typename", lv_typename_0_6, null);
                    				

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000840042003002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000840042002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000038404020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001E00008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C000008010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001C000008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000400002L});

}