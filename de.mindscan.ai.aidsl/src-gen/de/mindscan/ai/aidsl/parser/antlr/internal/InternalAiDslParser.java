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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'workflow'", "'('", "')'", "'{'", "'}'", "'vmnode'", "'super'", "'overlay'", "'opcode'", "'out'", "'as'", "'require'", "'optional'", "'default'", "'llmtask'", "'implements'", "','", "'@'", "':='", "'.'", "'.*'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalAiDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_declaration_0_0 = null;

        EObject lv_import_declarations_1_0 = null;

        EObject lv_definitions_2_1 = null;

        EObject lv_definitions_2_2 = null;

        EObject lv_definitions_2_3 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:77:2: ( ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition ) ) )* ) )
            // InternalAiDsl.g:78:2: ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition ) ) )* )
            {
            // InternalAiDsl.g:78:2: ( ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition ) ) )* )
            // InternalAiDsl.g:79:3: ( (lv_package_declaration_0_0= rulePackageDeclaration ) )? ( (lv_import_declarations_1_0= ruleImportDeclaration ) )* ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition ) ) )*
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

            // InternalAiDsl.g:117:3: ( ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13||LA4_0==18||LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAiDsl.g:118:4: ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition ) )
            	    {
            	    // InternalAiDsl.g:118:4: ( (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition ) )
            	    // InternalAiDsl.g:119:5: (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition )
            	    {
            	    // InternalAiDsl.g:119:5: (lv_definitions_2_1= ruleWorkflowDefinition | lv_definitions_2_2= ruleLlmTaskDefinition | lv_definitions_2_3= ruleVMNodeDefinition )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt3=3;
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
            	            // InternalAiDsl.g:136:6: lv_definitions_2_2= ruleLlmTaskDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsLlmTaskDefinitionParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_2=ruleLlmTaskDefinition();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getModelRule());
            	            						}
            	            						add(
            	            							current,
            	            							"definitions",
            	            							lv_definitions_2_2,
            	            							"de.mindscan.ai.aidsl.AiDsl.LlmTaskDefinition");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalAiDsl.g:152:6: lv_definitions_2_3= ruleVMNodeDefinition
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getDefinitionsVMNodeDefinitionParserRuleCall_2_0_2());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_definitions_2_3=ruleVMNodeDefinition();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getModelRule());
            	            						}
            	            						add(
            	            							current,
            	            							"definitions",
            	            							lv_definitions_2_3,
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
    // InternalAiDsl.g:174:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAiDsl.g:174:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAiDsl.g:175:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalAiDsl.g:181:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:187:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalAiDsl.g:188:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalAiDsl.g:188:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalAiDsl.g:189:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAiDsl.g:193:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAiDsl.g:194:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:194:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAiDsl.g:195:5: lv_name_1_0= ruleQualifiedName
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
    // InternalAiDsl.g:216:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // InternalAiDsl.g:216:58: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // InternalAiDsl.g:217:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
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
    // InternalAiDsl.g:223:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:229:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAiDsl.g:230:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAiDsl.g:230:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAiDsl.g:231:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
            		
            // InternalAiDsl.g:235:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAiDsl.g:236:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAiDsl.g:236:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAiDsl.g:237:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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


    // $ANTLR start "entryRuleWorkflowDefinition"
    // InternalAiDsl.g:258:1: entryRuleWorkflowDefinition returns [EObject current=null] : iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF ;
    public final EObject entryRuleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinition = null;


        try {
            // InternalAiDsl.g:258:59: (iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF )
            // InternalAiDsl.g:259:2: iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF
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
    // InternalAiDsl.g:265:1: ruleWorkflowDefinition returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAiDsl.g:271:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}' ) )
            // InternalAiDsl.g:272:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}' )
            {
            // InternalAiDsl.g:272:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}' )
            // InternalAiDsl.g:273:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionAccess().getWorkflowKeyword_0());
            		
            // InternalAiDsl.g:277:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:278:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:278:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:279:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkflowDefinitionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleVMNodeDefinition"
    // InternalAiDsl.g:315:1: entryRuleVMNodeDefinition returns [EObject current=null] : iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF ;
    public final EObject entryRuleVMNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeDefinition = null;


        try {
            // InternalAiDsl.g:315:57: (iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF )
            // InternalAiDsl.g:316:2: iv_ruleVMNodeDefinition= ruleVMNodeDefinition EOF
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
    // InternalAiDsl.g:322:1: ruleVMNodeDefinition returns [EObject current=null] : (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' ) ;
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
            // InternalAiDsl.g:328:2: ( (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' ) )
            // InternalAiDsl.g:329:2: (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' )
            {
            // InternalAiDsl.g:329:2: (otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}' )
            // InternalAiDsl.g:330:3: otherlv_0= 'vmnode' ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleVMNodeEleemnts ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getVMNodeDefinitionAccess().getVmnodeKeyword_0());
            		
            // InternalAiDsl.g:334:3: ( ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAiDsl.g:335:4: ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) )
                    {
                    // InternalAiDsl.g:335:4: ( (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' ) )
                    // InternalAiDsl.g:336:5: (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' )
                    {
                    // InternalAiDsl.g:336:5: (lv_nodetype_1_1= 'super' | lv_nodetype_1_2= 'overlay' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==20) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAiDsl.g:337:6: lv_nodetype_1_1= 'super'
                            {
                            lv_nodetype_1_1=(Token)match(input,19,FOLLOW_5); 

                            						newLeafNode(lv_nodetype_1_1, grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVMNodeDefinitionRule());
                            						}
                            						setWithLastConsumed(current, "nodetype", lv_nodetype_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalAiDsl.g:348:6: lv_nodetype_1_2= 'overlay'
                            {
                            lv_nodetype_1_2=(Token)match(input,20,FOLLOW_5); 

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

            // InternalAiDsl.g:361:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:362:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:362:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:363:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getVMNodeDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAiDsl.g:383:3: ( (lv_elements_4_0= ruleVMNodeEleemnts ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=22)||(LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAiDsl.g:384:4: (lv_elements_4_0= ruleVMNodeEleemnts )
            	    {
            	    // InternalAiDsl.g:384:4: (lv_elements_4_0= ruleVMNodeEleemnts )
            	    // InternalAiDsl.g:385:5: lv_elements_4_0= ruleVMNodeEleemnts
            	    {

            	    					newCompositeNode(grammarAccess.getVMNodeDefinitionAccess().getElementsVMNodeEleemntsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAiDsl.g:410:1: entryRuleVMNodeEleemnts returns [EObject current=null] : iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF ;
    public final EObject entryRuleVMNodeEleemnts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeEleemnts = null;


        try {
            // InternalAiDsl.g:410:55: (iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF )
            // InternalAiDsl.g:411:2: iv_ruleVMNodeEleemnts= ruleVMNodeEleemnts EOF
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
    // InternalAiDsl.g:417:1: ruleVMNodeEleemnts returns [EObject current=null] : (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElement_1= ruleVMNodeOutElement | this_VMNodeElement_2= ruleVMNodeElement ) ;
    public final EObject ruleVMNodeEleemnts() throws RecognitionException {
        EObject current = null;

        EObject this_VMNodeOpCodeElement_0 = null;

        EObject this_VMNodeOutElement_1 = null;

        EObject this_VMNodeElement_2 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:423:2: ( (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElement_1= ruleVMNodeOutElement | this_VMNodeElement_2= ruleVMNodeElement ) )
            // InternalAiDsl.g:424:2: (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElement_1= ruleVMNodeOutElement | this_VMNodeElement_2= ruleVMNodeElement )
            {
            // InternalAiDsl.g:424:2: (this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement | this_VMNodeOutElement_1= ruleVMNodeOutElement | this_VMNodeElement_2= ruleVMNodeElement )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 24:
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAiDsl.g:425:3: this_VMNodeOpCodeElement_0= ruleVMNodeOpCodeElement
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
                    // InternalAiDsl.g:434:3: this_VMNodeOutElement_1= ruleVMNodeOutElement
                    {

                    			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOutElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VMNodeOutElement_1=ruleVMNodeOutElement();

                    state._fsp--;


                    			current = this_VMNodeOutElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:443:3: this_VMNodeElement_2= ruleVMNodeElement
                    {

                    			newCompositeNode(grammarAccess.getVMNodeEleemntsAccess().getVMNodeElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VMNodeElement_2=ruleVMNodeElement();

                    state._fsp--;


                    			current = this_VMNodeElement_2;
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
    // InternalAiDsl.g:455:1: entryRuleVMNodeOpCodeElement returns [EObject current=null] : iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF ;
    public final EObject entryRuleVMNodeOpCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOpCodeElement = null;


        try {
            // InternalAiDsl.g:455:60: (iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF )
            // InternalAiDsl.g:456:2: iv_ruleVMNodeOpCodeElement= ruleVMNodeOpCodeElement EOF
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
    // InternalAiDsl.g:462:1: ruleVMNodeOpCodeElement returns [EObject current=null] : (otherlv_0= 'opcode' ( (lv_code_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVMNodeOpCodeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_code_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:468:2: ( (otherlv_0= 'opcode' ( (lv_code_1_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:469:2: (otherlv_0= 'opcode' ( (lv_code_1_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:469:2: (otherlv_0= 'opcode' ( (lv_code_1_0= RULE_STRING ) ) )
            // InternalAiDsl.g:470:3: otherlv_0= 'opcode' ( (lv_code_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVMNodeOpCodeElementAccess().getOpcodeKeyword_0());
            		
            // InternalAiDsl.g:474:3: ( (lv_code_1_0= RULE_STRING ) )
            // InternalAiDsl.g:475:4: (lv_code_1_0= RULE_STRING )
            {
            // InternalAiDsl.g:475:4: (lv_code_1_0= RULE_STRING )
            // InternalAiDsl.g:476:5: lv_code_1_0= RULE_STRING
            {
            lv_code_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_code_1_0, grammarAccess.getVMNodeOpCodeElementAccess().getCodeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVMNodeOpCodeElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_1_0,
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


    // $ANTLR start "entryRuleVMNodeOutElement"
    // InternalAiDsl.g:496:1: entryRuleVMNodeOutElement returns [EObject current=null] : iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF ;
    public final EObject entryRuleVMNodeOutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeOutElement = null;


        try {
            // InternalAiDsl.g:496:57: (iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF )
            // InternalAiDsl.g:497:2: iv_ruleVMNodeOutElement= ruleVMNodeOutElement EOF
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
    // InternalAiDsl.g:503:1: ruleVMNodeOutElement returns [EObject current=null] : (otherlv_0= 'out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_type_3_0= RULE_ID ) ) ) ;
    public final EObject ruleVMNodeOutElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:509:2: ( (otherlv_0= 'out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_type_3_0= RULE_ID ) ) ) )
            // InternalAiDsl.g:510:2: (otherlv_0= 'out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_type_3_0= RULE_ID ) ) )
            {
            // InternalAiDsl.g:510:2: (otherlv_0= 'out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_type_3_0= RULE_ID ) ) )
            // InternalAiDsl.g:511:3: otherlv_0= 'out' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_type_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVMNodeOutElementAccess().getOutKeyword_0());
            		
            // InternalAiDsl.g:515:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAiDsl.g:516:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAiDsl.g:516:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAiDsl.g:517:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getVMNodeOutElementAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVMNodeOutElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.mindscan.ai.aidsl.AiDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVMNodeOutElementAccess().getAsKeyword_2());
            		
            // InternalAiDsl.g:538:3: ( (lv_type_3_0= RULE_ID ) )
            // InternalAiDsl.g:539:4: (lv_type_3_0= RULE_ID )
            {
            // InternalAiDsl.g:539:4: (lv_type_3_0= RULE_ID )
            // InternalAiDsl.g:540:5: lv_type_3_0= RULE_ID
            {
            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_3_0, grammarAccess.getVMNodeOutElementAccess().getTypeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVMNodeOutElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"de.mindscan.ai.aidsl.AiDsl.ID");
            				

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
    // $ANTLR end "ruleVMNodeOutElement"


    // $ANTLR start "entryRuleVMNodeElement"
    // InternalAiDsl.g:560:1: entryRuleVMNodeElement returns [EObject current=null] : iv_ruleVMNodeElement= ruleVMNodeElement EOF ;
    public final EObject entryRuleVMNodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVMNodeElement = null;


        try {
            // InternalAiDsl.g:560:54: (iv_ruleVMNodeElement= ruleVMNodeElement EOF )
            // InternalAiDsl.g:561:2: iv_ruleVMNodeElement= ruleVMNodeElement EOF
            {
             newCompositeNode(grammarAccess.getVMNodeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVMNodeElement=ruleVMNodeElement();

            state._fsp--;

             current =iv_ruleVMNodeElement; 
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
    // $ANTLR end "entryRuleVMNodeElement"


    // $ANTLR start "ruleVMNodeElement"
    // InternalAiDsl.g:567:1: ruleVMNodeElement returns [EObject current=null] : ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVMNodeElement() throws RecognitionException {
        EObject current = null;

        Token lv_policy_0_1=null;
        Token lv_policy_0_2=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_defaultvalue_4_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:573:2: ( ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )? ) )
            // InternalAiDsl.g:574:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )? )
            {
            // InternalAiDsl.g:574:2: ( ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )? )
            // InternalAiDsl.g:575:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) ) ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )?
            {
            // InternalAiDsl.g:575:3: ( ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) ) )
            // InternalAiDsl.g:576:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
            {
            // InternalAiDsl.g:576:4: ( (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' ) )
            // InternalAiDsl.g:577:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
            {
            // InternalAiDsl.g:577:5: (lv_policy_0_1= 'require' | lv_policy_0_2= 'optional' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAiDsl.g:578:6: lv_policy_0_1= 'require'
                    {
                    lv_policy_0_1=(Token)match(input,24,FOLLOW_5); 

                    						newLeafNode(lv_policy_0_1, grammarAccess.getVMNodeElementAccess().getPolicyRequireKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMNodeElementRule());
                    						}
                    						setWithLastConsumed(current, "policy", lv_policy_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:589:6: lv_policy_0_2= 'optional'
                    {
                    lv_policy_0_2=(Token)match(input,25,FOLLOW_5); 

                    						newLeafNode(lv_policy_0_2, grammarAccess.getVMNodeElementAccess().getPolicyOptionalKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMNodeElementRule());
                    						}
                    						setWithLastConsumed(current, "policy", lv_policy_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalAiDsl.g:602:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalAiDsl.g:603:4: (lv_type_1_0= RULE_ID )
            {
            // InternalAiDsl.g:603:4: (lv_type_1_0= RULE_ID )
            // InternalAiDsl.g:604:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_type_1_0, grammarAccess.getVMNodeElementAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVMNodeElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.mindscan.ai.aidsl.AiDsl.ID");
            				

            }


            }

            // InternalAiDsl.g:620:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAiDsl.g:621:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAiDsl.g:621:4: (lv_name_2_0= RULE_ID )
            // InternalAiDsl.g:622:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVMNodeElementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVMNodeElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.mindscan.ai.aidsl.AiDsl.ID");
            				

            }


            }

            // InternalAiDsl.g:638:3: (otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAiDsl.g:639:4: otherlv_3= 'default' ( (lv_defaultvalue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getVMNodeElementAccess().getDefaultKeyword_3_0());
                    			
                    // InternalAiDsl.g:643:4: ( (lv_defaultvalue_4_0= RULE_STRING ) )
                    // InternalAiDsl.g:644:5: (lv_defaultvalue_4_0= RULE_STRING )
                    {
                    // InternalAiDsl.g:644:5: (lv_defaultvalue_4_0= RULE_STRING )
                    // InternalAiDsl.g:645:6: lv_defaultvalue_4_0= RULE_STRING
                    {
                    lv_defaultvalue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_defaultvalue_4_0, grammarAccess.getVMNodeElementAccess().getDefaultvalueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVMNodeElementRule());
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
    // $ANTLR end "ruleVMNodeElement"


    // $ANTLR start "entryRuleLlmTaskDefinition"
    // InternalAiDsl.g:666:1: entryRuleLlmTaskDefinition returns [EObject current=null] : iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF ;
    public final EObject entryRuleLlmTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmTaskDefinition = null;


        try {
            // InternalAiDsl.g:666:58: (iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF )
            // InternalAiDsl.g:667:2: iv_ruleLlmTaskDefinition= ruleLlmTaskDefinition EOF
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
    // InternalAiDsl.g:673:1: ruleLlmTaskDefinition returns [EObject current=null] : (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignment_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' ) ;
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

        EObject lv_assignment_9_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:679:2: ( (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignment_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' ) )
            // InternalAiDsl.g:680:2: (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignment_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' )
            {
            // InternalAiDsl.g:680:2: (otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignment_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}' )
            // InternalAiDsl.g:681:3: otherlv_0= 'llmtask' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )? otherlv_8= '{' ( (lv_assignment_9_0= ruleLlmVariableAssignment ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLlmTaskDefinitionAccess().getLlmtaskKeyword_0());
            		
            // InternalAiDsl.g:685:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:686:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:686:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:687:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLlmTaskDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getLlmTaskDefinitionAccess().getRightParenthesisKeyword_3());
            		
            // InternalAiDsl.g:711:3: (otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAiDsl.g:712:4: otherlv_4= 'implements' ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) ) (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )*
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getLlmTaskDefinitionAccess().getImplementsKeyword_4_0());
                    			
                    // InternalAiDsl.g:716:4: ( (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference ) )
                    // InternalAiDsl.g:717:5: (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference )
                    {
                    // InternalAiDsl.g:717:5: (lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference )
                    // InternalAiDsl.g:718:6: lv_annotation_interfaces_5_0= ruleAnnotationInterfaceReference
                    {

                    						newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

                    // InternalAiDsl.g:735:4: (otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==29) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAiDsl.g:736:5: otherlv_6= ',' ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,29,FOLLOW_16); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLlmTaskDefinitionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalAiDsl.g:740:5: ( (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference ) )
                    	    // InternalAiDsl.g:741:6: (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference )
                    	    {
                    	    // InternalAiDsl.g:741:6: (lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference )
                    	    // InternalAiDsl.g:742:7: lv_annotation_interfaces_7_0= ruleAnnotationInterfaceReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getLlmTaskDefinitionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAiDsl.g:765:3: ( (lv_assignment_9_0= ruleLlmVariableAssignment ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAiDsl.g:766:4: (lv_assignment_9_0= ruleLlmVariableAssignment )
            	    {
            	    // InternalAiDsl.g:766:4: (lv_assignment_9_0= ruleLlmVariableAssignment )
            	    // InternalAiDsl.g:767:5: lv_assignment_9_0= ruleLlmVariableAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentLlmVariableAssignmentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_assignment_9_0=ruleLlmVariableAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLlmTaskDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignment",
            	    						lv_assignment_9_0,
            	    						"de.mindscan.ai.aidsl.AiDsl.LlmVariableAssignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAiDsl.g:792:1: entryRuleAnnotationInterfaceReference returns [EObject current=null] : iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF ;
    public final EObject entryRuleAnnotationInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationInterfaceReference = null;


        try {
            // InternalAiDsl.g:792:69: (iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF )
            // InternalAiDsl.g:793:2: iv_ruleAnnotationInterfaceReference= ruleAnnotationInterfaceReference EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationInterfaceReference"


    // $ANTLR start "ruleAnnotationInterfaceReference"
    // InternalAiDsl.g:799:1: ruleAnnotationInterfaceReference returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnnotationInterfaceReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:805:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAiDsl.g:806:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAiDsl.g:806:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAiDsl.g:807:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationInterfaceReferenceAccess().getCommercialAtKeyword_0());
            		
            // InternalAiDsl.g:811:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiDsl.g:812:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiDsl.g:812:4: (lv_name_1_0= RULE_ID )
            // InternalAiDsl.g:813:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnnotationInterfaceReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationInterfaceReferenceRule());
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
    // $ANTLR end "ruleAnnotationInterfaceReference"


    // $ANTLR start "entryRuleLlmVariableAssignment"
    // InternalAiDsl.g:833:1: entryRuleLlmVariableAssignment returns [EObject current=null] : iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF ;
    public final EObject entryRuleLlmVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmVariableAssignment = null;


        try {
            // InternalAiDsl.g:833:62: (iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF )
            // InternalAiDsl.g:834:2: iv_ruleLlmVariableAssignment= ruleLlmVariableAssignment EOF
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
    // InternalAiDsl.g:840:1: ruleLlmVariableAssignment returns [EObject current=null] : ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLlmVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variablename_0_0=null;
        Token otherlv_1=null;
        Token lv_template_2_0=null;


        	enterRule();

        try {
            // InternalAiDsl.g:846:2: ( ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) ) ) )
            // InternalAiDsl.g:847:2: ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) ) )
            {
            // InternalAiDsl.g:847:2: ( ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) ) )
            // InternalAiDsl.g:848:3: ( (lv_variablename_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_template_2_0= RULE_STRING ) )
            {
            // InternalAiDsl.g:848:3: ( (lv_variablename_0_0= RULE_ID ) )
            // InternalAiDsl.g:849:4: (lv_variablename_0_0= RULE_ID )
            {
            // InternalAiDsl.g:849:4: (lv_variablename_0_0= RULE_ID )
            // InternalAiDsl.g:850:5: lv_variablename_0_0= RULE_ID
            {
            lv_variablename_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLlmVariableAssignmentAccess().getColonEqualsSignKeyword_1());
            		
            // InternalAiDsl.g:870:3: ( (lv_template_2_0= RULE_STRING ) )
            // InternalAiDsl.g:871:4: (lv_template_2_0= RULE_STRING )
            {
            // InternalAiDsl.g:871:4: (lv_template_2_0= RULE_STRING )
            // InternalAiDsl.g:872:5: lv_template_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAiDsl.g:892:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAiDsl.g:892:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAiDsl.g:893:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAiDsl.g:899:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAiDsl.g:905:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAiDsl.g:906:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAiDsl.g:906:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAiDsl.g:907:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAiDsl.g:914:3: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAiDsl.g:915:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalAiDsl.g:932:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAiDsl.g:932:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAiDsl.g:933:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAiDsl.g:939:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAiDsl.g:945:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAiDsl.g:946:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAiDsl.g:946:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAiDsl.g:947:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAiDsl.g:957:3: (kw= '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAiDsl.g:958:4: kw= '.*'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008043002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008042002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003620000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});

}