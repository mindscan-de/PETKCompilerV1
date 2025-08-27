package de.mindscan.ai.aidsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.mindscan.ai.aidsl.services.AiDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAiDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'super'", "'overlay'", "'require'", "'optional'", "'package'", "'import'", "'workflow'", "'('", "')'", "'{'", "'}'", "'vmnode'", "'opcode'", "'out'", "'as'", "'default'", "'llmtask'", "'implements'", "','", "'@'", "':='", "'.'", "'.*'"
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

    	public void setGrammarAccess(AiDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalAiDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAiDsl.g:54:1: ( ruleModel EOF )
            // InternalAiDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAiDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAiDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAiDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalAiDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAiDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalAiDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalAiDsl.g:78:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalAiDsl.g:79:1: ( rulePackageDeclaration EOF )
            // InternalAiDsl.g:80:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalAiDsl.g:87:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:91:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalAiDsl.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalAiDsl.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalAiDsl.g:93:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalAiDsl.g:94:3: ( rule__PackageDeclaration__Group__0 )
            // InternalAiDsl.g:94:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalAiDsl.g:103:1: entryRuleImportDeclaration : ruleImportDeclaration EOF ;
    public final void entryRuleImportDeclaration() throws RecognitionException {
        try {
            // InternalAiDsl.g:104:1: ( ruleImportDeclaration EOF )
            // InternalAiDsl.g:105:1: ruleImportDeclaration EOF
            {
             before(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // InternalAiDsl.g:112:1: ruleImportDeclaration : ( ( rule__ImportDeclaration__Group__0 ) ) ;
    public final void ruleImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:116:2: ( ( ( rule__ImportDeclaration__Group__0 ) ) )
            // InternalAiDsl.g:117:2: ( ( rule__ImportDeclaration__Group__0 ) )
            {
            // InternalAiDsl.g:117:2: ( ( rule__ImportDeclaration__Group__0 ) )
            // InternalAiDsl.g:118:3: ( rule__ImportDeclaration__Group__0 )
            {
             before(grammarAccess.getImportDeclarationAccess().getGroup()); 
            // InternalAiDsl.g:119:3: ( rule__ImportDeclaration__Group__0 )
            // InternalAiDsl.g:119:4: rule__ImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleWorkflowDefinition"
    // InternalAiDsl.g:128:1: entryRuleWorkflowDefinition : ruleWorkflowDefinition EOF ;
    public final void entryRuleWorkflowDefinition() throws RecognitionException {
        try {
            // InternalAiDsl.g:129:1: ( ruleWorkflowDefinition EOF )
            // InternalAiDsl.g:130:1: ruleWorkflowDefinition EOF
            {
             before(grammarAccess.getWorkflowDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkflowDefinition();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkflowDefinition"


    // $ANTLR start "ruleWorkflowDefinition"
    // InternalAiDsl.g:137:1: ruleWorkflowDefinition : ( ( rule__WorkflowDefinition__Group__0 ) ) ;
    public final void ruleWorkflowDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:141:2: ( ( ( rule__WorkflowDefinition__Group__0 ) ) )
            // InternalAiDsl.g:142:2: ( ( rule__WorkflowDefinition__Group__0 ) )
            {
            // InternalAiDsl.g:142:2: ( ( rule__WorkflowDefinition__Group__0 ) )
            // InternalAiDsl.g:143:3: ( rule__WorkflowDefinition__Group__0 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getGroup()); 
            // InternalAiDsl.g:144:3: ( rule__WorkflowDefinition__Group__0 )
            // InternalAiDsl.g:144:4: rule__WorkflowDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkflowDefinition"


    // $ANTLR start "entryRuleVMNodeDefinition"
    // InternalAiDsl.g:153:1: entryRuleVMNodeDefinition : ruleVMNodeDefinition EOF ;
    public final void entryRuleVMNodeDefinition() throws RecognitionException {
        try {
            // InternalAiDsl.g:154:1: ( ruleVMNodeDefinition EOF )
            // InternalAiDsl.g:155:1: ruleVMNodeDefinition EOF
            {
             before(grammarAccess.getVMNodeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleVMNodeDefinition();

            state._fsp--;

             after(grammarAccess.getVMNodeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVMNodeDefinition"


    // $ANTLR start "ruleVMNodeDefinition"
    // InternalAiDsl.g:162:1: ruleVMNodeDefinition : ( ( rule__VMNodeDefinition__Group__0 ) ) ;
    public final void ruleVMNodeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:166:2: ( ( ( rule__VMNodeDefinition__Group__0 ) ) )
            // InternalAiDsl.g:167:2: ( ( rule__VMNodeDefinition__Group__0 ) )
            {
            // InternalAiDsl.g:167:2: ( ( rule__VMNodeDefinition__Group__0 ) )
            // InternalAiDsl.g:168:3: ( rule__VMNodeDefinition__Group__0 )
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getGroup()); 
            // InternalAiDsl.g:169:3: ( rule__VMNodeDefinition__Group__0 )
            // InternalAiDsl.g:169:4: rule__VMNodeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVMNodeDefinition"


    // $ANTLR start "entryRuleVMNodeEleemnts"
    // InternalAiDsl.g:178:1: entryRuleVMNodeEleemnts : ruleVMNodeEleemnts EOF ;
    public final void entryRuleVMNodeEleemnts() throws RecognitionException {
        try {
            // InternalAiDsl.g:179:1: ( ruleVMNodeEleemnts EOF )
            // InternalAiDsl.g:180:1: ruleVMNodeEleemnts EOF
            {
             before(grammarAccess.getVMNodeEleemntsRule()); 
            pushFollow(FOLLOW_1);
            ruleVMNodeEleemnts();

            state._fsp--;

             after(grammarAccess.getVMNodeEleemntsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVMNodeEleemnts"


    // $ANTLR start "ruleVMNodeEleemnts"
    // InternalAiDsl.g:187:1: ruleVMNodeEleemnts : ( ( rule__VMNodeEleemnts__Alternatives ) ) ;
    public final void ruleVMNodeEleemnts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:191:2: ( ( ( rule__VMNodeEleemnts__Alternatives ) ) )
            // InternalAiDsl.g:192:2: ( ( rule__VMNodeEleemnts__Alternatives ) )
            {
            // InternalAiDsl.g:192:2: ( ( rule__VMNodeEleemnts__Alternatives ) )
            // InternalAiDsl.g:193:3: ( rule__VMNodeEleemnts__Alternatives )
            {
             before(grammarAccess.getVMNodeEleemntsAccess().getAlternatives()); 
            // InternalAiDsl.g:194:3: ( rule__VMNodeEleemnts__Alternatives )
            // InternalAiDsl.g:194:4: rule__VMNodeEleemnts__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeEleemnts__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeEleemntsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVMNodeEleemnts"


    // $ANTLR start "entryRuleVMNodeOpCodeElement"
    // InternalAiDsl.g:203:1: entryRuleVMNodeOpCodeElement : ruleVMNodeOpCodeElement EOF ;
    public final void entryRuleVMNodeOpCodeElement() throws RecognitionException {
        try {
            // InternalAiDsl.g:204:1: ( ruleVMNodeOpCodeElement EOF )
            // InternalAiDsl.g:205:1: ruleVMNodeOpCodeElement EOF
            {
             before(grammarAccess.getVMNodeOpCodeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleVMNodeOpCodeElement();

            state._fsp--;

             after(grammarAccess.getVMNodeOpCodeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVMNodeOpCodeElement"


    // $ANTLR start "ruleVMNodeOpCodeElement"
    // InternalAiDsl.g:212:1: ruleVMNodeOpCodeElement : ( ( rule__VMNodeOpCodeElement__Group__0 ) ) ;
    public final void ruleVMNodeOpCodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:216:2: ( ( ( rule__VMNodeOpCodeElement__Group__0 ) ) )
            // InternalAiDsl.g:217:2: ( ( rule__VMNodeOpCodeElement__Group__0 ) )
            {
            // InternalAiDsl.g:217:2: ( ( rule__VMNodeOpCodeElement__Group__0 ) )
            // InternalAiDsl.g:218:3: ( rule__VMNodeOpCodeElement__Group__0 )
            {
             before(grammarAccess.getVMNodeOpCodeElementAccess().getGroup()); 
            // InternalAiDsl.g:219:3: ( rule__VMNodeOpCodeElement__Group__0 )
            // InternalAiDsl.g:219:4: rule__VMNodeOpCodeElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeOpCodeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeOpCodeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVMNodeOpCodeElement"


    // $ANTLR start "entryRuleVMNodeOutElement"
    // InternalAiDsl.g:228:1: entryRuleVMNodeOutElement : ruleVMNodeOutElement EOF ;
    public final void entryRuleVMNodeOutElement() throws RecognitionException {
        try {
            // InternalAiDsl.g:229:1: ( ruleVMNodeOutElement EOF )
            // InternalAiDsl.g:230:1: ruleVMNodeOutElement EOF
            {
             before(grammarAccess.getVMNodeOutElementRule()); 
            pushFollow(FOLLOW_1);
            ruleVMNodeOutElement();

            state._fsp--;

             after(grammarAccess.getVMNodeOutElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVMNodeOutElement"


    // $ANTLR start "ruleVMNodeOutElement"
    // InternalAiDsl.g:237:1: ruleVMNodeOutElement : ( ( rule__VMNodeOutElement__Group__0 ) ) ;
    public final void ruleVMNodeOutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:241:2: ( ( ( rule__VMNodeOutElement__Group__0 ) ) )
            // InternalAiDsl.g:242:2: ( ( rule__VMNodeOutElement__Group__0 ) )
            {
            // InternalAiDsl.g:242:2: ( ( rule__VMNodeOutElement__Group__0 ) )
            // InternalAiDsl.g:243:3: ( rule__VMNodeOutElement__Group__0 )
            {
             before(grammarAccess.getVMNodeOutElementAccess().getGroup()); 
            // InternalAiDsl.g:244:3: ( rule__VMNodeOutElement__Group__0 )
            // InternalAiDsl.g:244:4: rule__VMNodeOutElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeOutElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeOutElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVMNodeOutElement"


    // $ANTLR start "entryRuleVMNodeElement"
    // InternalAiDsl.g:253:1: entryRuleVMNodeElement : ruleVMNodeElement EOF ;
    public final void entryRuleVMNodeElement() throws RecognitionException {
        try {
            // InternalAiDsl.g:254:1: ( ruleVMNodeElement EOF )
            // InternalAiDsl.g:255:1: ruleVMNodeElement EOF
            {
             before(grammarAccess.getVMNodeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleVMNodeElement();

            state._fsp--;

             after(grammarAccess.getVMNodeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVMNodeElement"


    // $ANTLR start "ruleVMNodeElement"
    // InternalAiDsl.g:262:1: ruleVMNodeElement : ( ( rule__VMNodeElement__Group__0 ) ) ;
    public final void ruleVMNodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:266:2: ( ( ( rule__VMNodeElement__Group__0 ) ) )
            // InternalAiDsl.g:267:2: ( ( rule__VMNodeElement__Group__0 ) )
            {
            // InternalAiDsl.g:267:2: ( ( rule__VMNodeElement__Group__0 ) )
            // InternalAiDsl.g:268:3: ( rule__VMNodeElement__Group__0 )
            {
             before(grammarAccess.getVMNodeElementAccess().getGroup()); 
            // InternalAiDsl.g:269:3: ( rule__VMNodeElement__Group__0 )
            // InternalAiDsl.g:269:4: rule__VMNodeElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVMNodeElement"


    // $ANTLR start "entryRuleLlmTaskDefinition"
    // InternalAiDsl.g:278:1: entryRuleLlmTaskDefinition : ruleLlmTaskDefinition EOF ;
    public final void entryRuleLlmTaskDefinition() throws RecognitionException {
        try {
            // InternalAiDsl.g:279:1: ( ruleLlmTaskDefinition EOF )
            // InternalAiDsl.g:280:1: ruleLlmTaskDefinition EOF
            {
             before(grammarAccess.getLlmTaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleLlmTaskDefinition();

            state._fsp--;

             after(grammarAccess.getLlmTaskDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLlmTaskDefinition"


    // $ANTLR start "ruleLlmTaskDefinition"
    // InternalAiDsl.g:287:1: ruleLlmTaskDefinition : ( ( rule__LlmTaskDefinition__Group__0 ) ) ;
    public final void ruleLlmTaskDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:291:2: ( ( ( rule__LlmTaskDefinition__Group__0 ) ) )
            // InternalAiDsl.g:292:2: ( ( rule__LlmTaskDefinition__Group__0 ) )
            {
            // InternalAiDsl.g:292:2: ( ( rule__LlmTaskDefinition__Group__0 ) )
            // InternalAiDsl.g:293:3: ( rule__LlmTaskDefinition__Group__0 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup()); 
            // InternalAiDsl.g:294:3: ( rule__LlmTaskDefinition__Group__0 )
            // InternalAiDsl.g:294:4: rule__LlmTaskDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLlmTaskDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLlmTaskDefinition"


    // $ANTLR start "entryRuleAnnotationInterfaceReference"
    // InternalAiDsl.g:303:1: entryRuleAnnotationInterfaceReference : ruleAnnotationInterfaceReference EOF ;
    public final void entryRuleAnnotationInterfaceReference() throws RecognitionException {
        try {
            // InternalAiDsl.g:304:1: ( ruleAnnotationInterfaceReference EOF )
            // InternalAiDsl.g:305:1: ruleAnnotationInterfaceReference EOF
            {
             before(grammarAccess.getAnnotationInterfaceReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotationInterfaceReference();

            state._fsp--;

             after(grammarAccess.getAnnotationInterfaceReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotationInterfaceReference"


    // $ANTLR start "ruleAnnotationInterfaceReference"
    // InternalAiDsl.g:312:1: ruleAnnotationInterfaceReference : ( ( rule__AnnotationInterfaceReference__Group__0 ) ) ;
    public final void ruleAnnotationInterfaceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:316:2: ( ( ( rule__AnnotationInterfaceReference__Group__0 ) ) )
            // InternalAiDsl.g:317:2: ( ( rule__AnnotationInterfaceReference__Group__0 ) )
            {
            // InternalAiDsl.g:317:2: ( ( rule__AnnotationInterfaceReference__Group__0 ) )
            // InternalAiDsl.g:318:3: ( rule__AnnotationInterfaceReference__Group__0 )
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getGroup()); 
            // InternalAiDsl.g:319:3: ( rule__AnnotationInterfaceReference__Group__0 )
            // InternalAiDsl.g:319:4: rule__AnnotationInterfaceReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInterfaceReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationInterfaceReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationInterfaceReference"


    // $ANTLR start "entryRuleLlmVariableAssignment"
    // InternalAiDsl.g:328:1: entryRuleLlmVariableAssignment : ruleLlmVariableAssignment EOF ;
    public final void entryRuleLlmVariableAssignment() throws RecognitionException {
        try {
            // InternalAiDsl.g:329:1: ( ruleLlmVariableAssignment EOF )
            // InternalAiDsl.g:330:1: ruleLlmVariableAssignment EOF
            {
             before(grammarAccess.getLlmVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleLlmVariableAssignment();

            state._fsp--;

             after(grammarAccess.getLlmVariableAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLlmVariableAssignment"


    // $ANTLR start "ruleLlmVariableAssignment"
    // InternalAiDsl.g:337:1: ruleLlmVariableAssignment : ( ( rule__LlmVariableAssignment__Group__0 ) ) ;
    public final void ruleLlmVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:341:2: ( ( ( rule__LlmVariableAssignment__Group__0 ) ) )
            // InternalAiDsl.g:342:2: ( ( rule__LlmVariableAssignment__Group__0 ) )
            {
            // InternalAiDsl.g:342:2: ( ( rule__LlmVariableAssignment__Group__0 ) )
            // InternalAiDsl.g:343:3: ( rule__LlmVariableAssignment__Group__0 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getGroup()); 
            // InternalAiDsl.g:344:3: ( rule__LlmVariableAssignment__Group__0 )
            // InternalAiDsl.g:344:4: rule__LlmVariableAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LlmVariableAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLlmVariableAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLlmVariableAssignment"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAiDsl.g:353:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAiDsl.g:354:1: ( ruleQualifiedName EOF )
            // InternalAiDsl.g:355:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAiDsl.g:362:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:366:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAiDsl.g:367:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAiDsl.g:367:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAiDsl.g:368:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAiDsl.g:369:3: ( rule__QualifiedName__Group__0 )
            // InternalAiDsl.g:369:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAiDsl.g:378:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalAiDsl.g:379:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalAiDsl.g:380:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalAiDsl.g:387:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:391:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalAiDsl.g:392:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalAiDsl.g:392:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalAiDsl.g:393:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalAiDsl.g:394:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalAiDsl.g:394:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "rule__Model__DefinitionsAlternatives_2_0"
    // InternalAiDsl.g:402:1: rule__Model__DefinitionsAlternatives_2_0 : ( ( ruleWorkflowDefinition ) | ( ruleLlmTaskDefinition ) | ( ruleVMNodeDefinition ) );
    public final void rule__Model__DefinitionsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:406:1: ( ( ruleWorkflowDefinition ) | ( ruleLlmTaskDefinition ) | ( ruleVMNodeDefinition ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAiDsl.g:407:2: ( ruleWorkflowDefinition )
                    {
                    // InternalAiDsl.g:407:2: ( ruleWorkflowDefinition )
                    // InternalAiDsl.g:408:3: ruleWorkflowDefinition
                    {
                     before(grammarAccess.getModelAccess().getDefinitionsWorkflowDefinitionParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkflowDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDefinitionsWorkflowDefinitionParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:413:2: ( ruleLlmTaskDefinition )
                    {
                    // InternalAiDsl.g:413:2: ( ruleLlmTaskDefinition )
                    // InternalAiDsl.g:414:3: ruleLlmTaskDefinition
                    {
                     before(grammarAccess.getModelAccess().getDefinitionsLlmTaskDefinitionParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLlmTaskDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDefinitionsLlmTaskDefinitionParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:419:2: ( ruleVMNodeDefinition )
                    {
                    // InternalAiDsl.g:419:2: ( ruleVMNodeDefinition )
                    // InternalAiDsl.g:420:3: ruleVMNodeDefinition
                    {
                     before(grammarAccess.getModelAccess().getDefinitionsVMNodeDefinitionParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVMNodeDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDefinitionsVMNodeDefinitionParserRuleCall_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefinitionsAlternatives_2_0"


    // $ANTLR start "rule__VMNodeDefinition__NodetypeAlternatives_1_0"
    // InternalAiDsl.g:429:1: rule__VMNodeDefinition__NodetypeAlternatives_1_0 : ( ( 'super' ) | ( 'overlay' ) );
    public final void rule__VMNodeDefinition__NodetypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:433:1: ( ( 'super' ) | ( 'overlay' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAiDsl.g:434:2: ( 'super' )
                    {
                    // InternalAiDsl.g:434:2: ( 'super' )
                    // InternalAiDsl.g:435:3: 'super'
                    {
                     before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:440:2: ( 'overlay' )
                    {
                    // InternalAiDsl.g:440:2: ( 'overlay' )
                    // InternalAiDsl.g:441:3: 'overlay'
                    {
                     before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeOverlayKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getVMNodeDefinitionAccess().getNodetypeOverlayKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__NodetypeAlternatives_1_0"


    // $ANTLR start "rule__VMNodeEleemnts__Alternatives"
    // InternalAiDsl.g:450:1: rule__VMNodeEleemnts__Alternatives : ( ( ruleVMNodeOpCodeElement ) | ( ruleVMNodeOutElement ) | ( ruleVMNodeElement ) );
    public final void rule__VMNodeEleemnts__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:454:1: ( ( ruleVMNodeOpCodeElement ) | ( ruleVMNodeOutElement ) | ( ruleVMNodeElement ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 13:
            case 14:
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
                    // InternalAiDsl.g:455:2: ( ruleVMNodeOpCodeElement )
                    {
                    // InternalAiDsl.g:455:2: ( ruleVMNodeOpCodeElement )
                    // InternalAiDsl.g:456:3: ruleVMNodeOpCodeElement
                    {
                     before(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOpCodeElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVMNodeOpCodeElement();

                    state._fsp--;

                     after(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOpCodeElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:461:2: ( ruleVMNodeOutElement )
                    {
                    // InternalAiDsl.g:461:2: ( ruleVMNodeOutElement )
                    // InternalAiDsl.g:462:3: ruleVMNodeOutElement
                    {
                     before(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOutElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVMNodeOutElement();

                    state._fsp--;

                     after(grammarAccess.getVMNodeEleemntsAccess().getVMNodeOutElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAiDsl.g:467:2: ( ruleVMNodeElement )
                    {
                    // InternalAiDsl.g:467:2: ( ruleVMNodeElement )
                    // InternalAiDsl.g:468:3: ruleVMNodeElement
                    {
                     before(grammarAccess.getVMNodeEleemntsAccess().getVMNodeElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVMNodeElement();

                    state._fsp--;

                     after(grammarAccess.getVMNodeEleemntsAccess().getVMNodeElementParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeEleemnts__Alternatives"


    // $ANTLR start "rule__VMNodeElement__PolicyAlternatives_0_0"
    // InternalAiDsl.g:477:1: rule__VMNodeElement__PolicyAlternatives_0_0 : ( ( 'require' ) | ( 'optional' ) );
    public final void rule__VMNodeElement__PolicyAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:481:1: ( ( 'require' ) | ( 'optional' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAiDsl.g:482:2: ( 'require' )
                    {
                    // InternalAiDsl.g:482:2: ( 'require' )
                    // InternalAiDsl.g:483:3: 'require'
                    {
                     before(grammarAccess.getVMNodeElementAccess().getPolicyRequireKeyword_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVMNodeElementAccess().getPolicyRequireKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:488:2: ( 'optional' )
                    {
                    // InternalAiDsl.g:488:2: ( 'optional' )
                    // InternalAiDsl.g:489:3: 'optional'
                    {
                     before(grammarAccess.getVMNodeElementAccess().getPolicyOptionalKeyword_0_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVMNodeElementAccess().getPolicyOptionalKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__PolicyAlternatives_0_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAiDsl.g:498:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:502:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAiDsl.g:503:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAiDsl.g:510:1: rule__Model__Group__0__Impl : ( ( rule__Model__Package_declarationAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:514:1: ( ( ( rule__Model__Package_declarationAssignment_0 )? ) )
            // InternalAiDsl.g:515:1: ( ( rule__Model__Package_declarationAssignment_0 )? )
            {
            // InternalAiDsl.g:515:1: ( ( rule__Model__Package_declarationAssignment_0 )? )
            // InternalAiDsl.g:516:2: ( rule__Model__Package_declarationAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getPackage_declarationAssignment_0()); 
            // InternalAiDsl.g:517:2: ( rule__Model__Package_declarationAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAiDsl.g:517:3: rule__Model__Package_declarationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Package_declarationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getPackage_declarationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAiDsl.g:525:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:529:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAiDsl.g:530:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAiDsl.g:537:1: rule__Model__Group__1__Impl : ( ( rule__Model__Import_declarationsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:541:1: ( ( ( rule__Model__Import_declarationsAssignment_1 )* ) )
            // InternalAiDsl.g:542:1: ( ( rule__Model__Import_declarationsAssignment_1 )* )
            {
            // InternalAiDsl.g:542:1: ( ( rule__Model__Import_declarationsAssignment_1 )* )
            // InternalAiDsl.g:543:2: ( rule__Model__Import_declarationsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImport_declarationsAssignment_1()); 
            // InternalAiDsl.g:544:2: ( rule__Model__Import_declarationsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAiDsl.g:544:3: rule__Model__Import_declarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Import_declarationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImport_declarationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalAiDsl.g:552:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:556:1: ( rule__Model__Group__2__Impl )
            // InternalAiDsl.g:557:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalAiDsl.g:563:1: rule__Model__Group__2__Impl : ( ( rule__Model__DefinitionsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:567:1: ( ( ( rule__Model__DefinitionsAssignment_2 )* ) )
            // InternalAiDsl.g:568:1: ( ( rule__Model__DefinitionsAssignment_2 )* )
            {
            // InternalAiDsl.g:568:1: ( ( rule__Model__DefinitionsAssignment_2 )* )
            // InternalAiDsl.g:569:2: ( rule__Model__DefinitionsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDefinitionsAssignment_2()); 
            // InternalAiDsl.g:570:2: ( rule__Model__DefinitionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==22||LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAiDsl.g:570:3: rule__Model__DefinitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__DefinitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefinitionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalAiDsl.g:579:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:583:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAiDsl.g:584:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalAiDsl.g:591:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:595:1: ( ( 'package' ) )
            // InternalAiDsl.g:596:1: ( 'package' )
            {
            // InternalAiDsl.g:596:1: ( 'package' )
            // InternalAiDsl.g:597:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalAiDsl.g:606:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:610:1: ( rule__PackageDeclaration__Group__1__Impl )
            // InternalAiDsl.g:611:2: rule__PackageDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalAiDsl.g:617:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:621:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAiDsl.g:622:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:622:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAiDsl.g:623:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:624:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAiDsl.g:624:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__0"
    // InternalAiDsl.g:633:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:637:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // InternalAiDsl.g:638:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ImportDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__0"


    // $ANTLR start "rule__ImportDeclaration__Group__0__Impl"
    // InternalAiDsl.g:645:1: rule__ImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:649:1: ( ( 'import' ) )
            // InternalAiDsl.g:650:1: ( 'import' )
            {
            // InternalAiDsl.g:650:1: ( 'import' )
            // InternalAiDsl.g:651:2: 'import'
            {
             before(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__1"
    // InternalAiDsl.g:660:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:664:1: ( rule__ImportDeclaration__Group__1__Impl )
            // InternalAiDsl.g:665:2: rule__ImportDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__1"


    // $ANTLR start "rule__ImportDeclaration__Group__1__Impl"
    // InternalAiDsl.g:671:1: rule__ImportDeclaration__Group__1__Impl : ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:675:1: ( ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) ) )
            // InternalAiDsl.g:676:1: ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAiDsl.g:676:1: ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) )
            // InternalAiDsl.g:677:2: ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportDeclarationAccess().getImportedNamespaceAssignment_1()); 
            // InternalAiDsl.g:678:2: ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 )
            // InternalAiDsl.g:678:3: rule__ImportDeclaration__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportDeclaration__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__Group__1__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__0"
    // InternalAiDsl.g:687:1: rule__WorkflowDefinition__Group__0 : rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1 ;
    public final void rule__WorkflowDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:691:1: ( rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1 )
            // InternalAiDsl.g:692:2: rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WorkflowDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__0"


    // $ANTLR start "rule__WorkflowDefinition__Group__0__Impl"
    // InternalAiDsl.g:699:1: rule__WorkflowDefinition__Group__0__Impl : ( 'workflow' ) ;
    public final void rule__WorkflowDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:703:1: ( ( 'workflow' ) )
            // InternalAiDsl.g:704:1: ( 'workflow' )
            {
            // InternalAiDsl.g:704:1: ( 'workflow' )
            // InternalAiDsl.g:705:2: 'workflow'
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getWorkflowKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getWorkflowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__1"
    // InternalAiDsl.g:714:1: rule__WorkflowDefinition__Group__1 : rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2 ;
    public final void rule__WorkflowDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:718:1: ( rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2 )
            // InternalAiDsl.g:719:2: rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__WorkflowDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__1"


    // $ANTLR start "rule__WorkflowDefinition__Group__1__Impl"
    // InternalAiDsl.g:726:1: rule__WorkflowDefinition__Group__1__Impl : ( ( rule__WorkflowDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkflowDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:730:1: ( ( ( rule__WorkflowDefinition__NameAssignment_1 ) ) )
            // InternalAiDsl.g:731:1: ( ( rule__WorkflowDefinition__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:731:1: ( ( rule__WorkflowDefinition__NameAssignment_1 ) )
            // InternalAiDsl.g:732:2: ( rule__WorkflowDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:733:2: ( rule__WorkflowDefinition__NameAssignment_1 )
            // InternalAiDsl.g:733:3: rule__WorkflowDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__2"
    // InternalAiDsl.g:741:1: rule__WorkflowDefinition__Group__2 : rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3 ;
    public final void rule__WorkflowDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:745:1: ( rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3 )
            // InternalAiDsl.g:746:2: rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__WorkflowDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__2"


    // $ANTLR start "rule__WorkflowDefinition__Group__2__Impl"
    // InternalAiDsl.g:753:1: rule__WorkflowDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__WorkflowDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:757:1: ( ( '(' ) )
            // InternalAiDsl.g:758:1: ( '(' )
            {
            // InternalAiDsl.g:758:1: ( '(' )
            // InternalAiDsl.g:759:2: '('
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__3"
    // InternalAiDsl.g:768:1: rule__WorkflowDefinition__Group__3 : rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4 ;
    public final void rule__WorkflowDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:772:1: ( rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4 )
            // InternalAiDsl.g:773:2: rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__WorkflowDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__3"


    // $ANTLR start "rule__WorkflowDefinition__Group__3__Impl"
    // InternalAiDsl.g:780:1: rule__WorkflowDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__WorkflowDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:784:1: ( ( ')' ) )
            // InternalAiDsl.g:785:1: ( ')' )
            {
            // InternalAiDsl.g:785:1: ( ')' )
            // InternalAiDsl.g:786:2: ')'
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__4"
    // InternalAiDsl.g:795:1: rule__WorkflowDefinition__Group__4 : rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5 ;
    public final void rule__WorkflowDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:799:1: ( rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5 )
            // InternalAiDsl.g:800:2: rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__WorkflowDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__4"


    // $ANTLR start "rule__WorkflowDefinition__Group__4__Impl"
    // InternalAiDsl.g:807:1: rule__WorkflowDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__WorkflowDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:811:1: ( ( '{' ) )
            // InternalAiDsl.g:812:1: ( '{' )
            {
            // InternalAiDsl.g:812:1: ( '{' )
            // InternalAiDsl.g:813:2: '{'
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__5"
    // InternalAiDsl.g:822:1: rule__WorkflowDefinition__Group__5 : rule__WorkflowDefinition__Group__5__Impl ;
    public final void rule__WorkflowDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:826:1: ( rule__WorkflowDefinition__Group__5__Impl )
            // InternalAiDsl.g:827:2: rule__WorkflowDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__5"


    // $ANTLR start "rule__WorkflowDefinition__Group__5__Impl"
    // InternalAiDsl.g:833:1: rule__WorkflowDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__WorkflowDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:837:1: ( ( '}' ) )
            // InternalAiDsl.g:838:1: ( '}' )
            {
            // InternalAiDsl.g:838:1: ( '}' )
            // InternalAiDsl.g:839:2: '}'
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__5__Impl"


    // $ANTLR start "rule__VMNodeDefinition__Group__0"
    // InternalAiDsl.g:849:1: rule__VMNodeDefinition__Group__0 : rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1 ;
    public final void rule__VMNodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:853:1: ( rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1 )
            // InternalAiDsl.g:854:2: rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VMNodeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__0"


    // $ANTLR start "rule__VMNodeDefinition__Group__0__Impl"
    // InternalAiDsl.g:861:1: rule__VMNodeDefinition__Group__0__Impl : ( 'vmnode' ) ;
    public final void rule__VMNodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:865:1: ( ( 'vmnode' ) )
            // InternalAiDsl.g:866:1: ( 'vmnode' )
            {
            // InternalAiDsl.g:866:1: ( 'vmnode' )
            // InternalAiDsl.g:867:2: 'vmnode'
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getVmnodeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVMNodeDefinitionAccess().getVmnodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__0__Impl"


    // $ANTLR start "rule__VMNodeDefinition__Group__1"
    // InternalAiDsl.g:876:1: rule__VMNodeDefinition__Group__1 : rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2 ;
    public final void rule__VMNodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:880:1: ( rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2 )
            // InternalAiDsl.g:881:2: rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VMNodeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__1"


    // $ANTLR start "rule__VMNodeDefinition__Group__1__Impl"
    // InternalAiDsl.g:888:1: rule__VMNodeDefinition__Group__1__Impl : ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? ) ;
    public final void rule__VMNodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:892:1: ( ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? ) )
            // InternalAiDsl.g:893:1: ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? )
            {
            // InternalAiDsl.g:893:1: ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? )
            // InternalAiDsl.g:894:2: ( rule__VMNodeDefinition__NodetypeAssignment_1 )?
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeAssignment_1()); 
            // InternalAiDsl.g:895:2: ( rule__VMNodeDefinition__NodetypeAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAiDsl.g:895:3: rule__VMNodeDefinition__NodetypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VMNodeDefinition__NodetypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVMNodeDefinitionAccess().getNodetypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__1__Impl"


    // $ANTLR start "rule__VMNodeDefinition__Group__2"
    // InternalAiDsl.g:903:1: rule__VMNodeDefinition__Group__2 : rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3 ;
    public final void rule__VMNodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:907:1: ( rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3 )
            // InternalAiDsl.g:908:2: rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__VMNodeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__2"


    // $ANTLR start "rule__VMNodeDefinition__Group__2__Impl"
    // InternalAiDsl.g:915:1: rule__VMNodeDefinition__Group__2__Impl : ( ( rule__VMNodeDefinition__NameAssignment_2 ) ) ;
    public final void rule__VMNodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:919:1: ( ( ( rule__VMNodeDefinition__NameAssignment_2 ) ) )
            // InternalAiDsl.g:920:1: ( ( rule__VMNodeDefinition__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:920:1: ( ( rule__VMNodeDefinition__NameAssignment_2 ) )
            // InternalAiDsl.g:921:2: ( rule__VMNodeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:922:2: ( rule__VMNodeDefinition__NameAssignment_2 )
            // InternalAiDsl.g:922:3: rule__VMNodeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__2__Impl"


    // $ANTLR start "rule__VMNodeDefinition__Group__3"
    // InternalAiDsl.g:930:1: rule__VMNodeDefinition__Group__3 : rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4 ;
    public final void rule__VMNodeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:934:1: ( rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4 )
            // InternalAiDsl.g:935:2: rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__VMNodeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__3"


    // $ANTLR start "rule__VMNodeDefinition__Group__3__Impl"
    // InternalAiDsl.g:942:1: rule__VMNodeDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__VMNodeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:946:1: ( ( '{' ) )
            // InternalAiDsl.g:947:1: ( '{' )
            {
            // InternalAiDsl.g:947:1: ( '{' )
            // InternalAiDsl.g:948:2: '{'
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVMNodeDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__3__Impl"


    // $ANTLR start "rule__VMNodeDefinition__Group__4"
    // InternalAiDsl.g:957:1: rule__VMNodeDefinition__Group__4 : rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5 ;
    public final void rule__VMNodeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:961:1: ( rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5 )
            // InternalAiDsl.g:962:2: rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__VMNodeDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__4"


    // $ANTLR start "rule__VMNodeDefinition__Group__4__Impl"
    // InternalAiDsl.g:969:1: rule__VMNodeDefinition__Group__4__Impl : ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* ) ;
    public final void rule__VMNodeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:973:1: ( ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* ) )
            // InternalAiDsl.g:974:1: ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* )
            {
            // InternalAiDsl.g:974:1: ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* )
            // InternalAiDsl.g:975:2: ( rule__VMNodeDefinition__ElementsAssignment_4 )*
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getElementsAssignment_4()); 
            // InternalAiDsl.g:976:2: ( rule__VMNodeDefinition__ElementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)||(LA9_0>=23 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAiDsl.g:976:3: rule__VMNodeDefinition__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VMNodeDefinition__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getVMNodeDefinitionAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__4__Impl"


    // $ANTLR start "rule__VMNodeDefinition__Group__5"
    // InternalAiDsl.g:984:1: rule__VMNodeDefinition__Group__5 : rule__VMNodeDefinition__Group__5__Impl ;
    public final void rule__VMNodeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:988:1: ( rule__VMNodeDefinition__Group__5__Impl )
            // InternalAiDsl.g:989:2: rule__VMNodeDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__5"


    // $ANTLR start "rule__VMNodeDefinition__Group__5__Impl"
    // InternalAiDsl.g:995:1: rule__VMNodeDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__VMNodeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:999:1: ( ( '}' ) )
            // InternalAiDsl.g:1000:1: ( '}' )
            {
            // InternalAiDsl.g:1000:1: ( '}' )
            // InternalAiDsl.g:1001:2: '}'
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVMNodeDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__Group__5__Impl"


    // $ANTLR start "rule__VMNodeOpCodeElement__Group__0"
    // InternalAiDsl.g:1011:1: rule__VMNodeOpCodeElement__Group__0 : rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1 ;
    public final void rule__VMNodeOpCodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1015:1: ( rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1 )
            // InternalAiDsl.g:1016:2: rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__VMNodeOpCodeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeOpCodeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOpCodeElement__Group__0"


    // $ANTLR start "rule__VMNodeOpCodeElement__Group__0__Impl"
    // InternalAiDsl.g:1023:1: rule__VMNodeOpCodeElement__Group__0__Impl : ( 'opcode' ) ;
    public final void rule__VMNodeOpCodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1027:1: ( ( 'opcode' ) )
            // InternalAiDsl.g:1028:1: ( 'opcode' )
            {
            // InternalAiDsl.g:1028:1: ( 'opcode' )
            // InternalAiDsl.g:1029:2: 'opcode'
            {
             before(grammarAccess.getVMNodeOpCodeElementAccess().getOpcodeKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVMNodeOpCodeElementAccess().getOpcodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOpCodeElement__Group__0__Impl"


    // $ANTLR start "rule__VMNodeOpCodeElement__Group__1"
    // InternalAiDsl.g:1038:1: rule__VMNodeOpCodeElement__Group__1 : rule__VMNodeOpCodeElement__Group__1__Impl ;
    public final void rule__VMNodeOpCodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1042:1: ( rule__VMNodeOpCodeElement__Group__1__Impl )
            // InternalAiDsl.g:1043:2: rule__VMNodeOpCodeElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeOpCodeElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOpCodeElement__Group__1"


    // $ANTLR start "rule__VMNodeOpCodeElement__Group__1__Impl"
    // InternalAiDsl.g:1049:1: rule__VMNodeOpCodeElement__Group__1__Impl : ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) ) ;
    public final void rule__VMNodeOpCodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1053:1: ( ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) ) )
            // InternalAiDsl.g:1054:1: ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) )
            {
            // InternalAiDsl.g:1054:1: ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) )
            // InternalAiDsl.g:1055:2: ( rule__VMNodeOpCodeElement__CodeAssignment_1 )
            {
             before(grammarAccess.getVMNodeOpCodeElementAccess().getCodeAssignment_1()); 
            // InternalAiDsl.g:1056:2: ( rule__VMNodeOpCodeElement__CodeAssignment_1 )
            // InternalAiDsl.g:1056:3: rule__VMNodeOpCodeElement__CodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeOpCodeElement__CodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeOpCodeElementAccess().getCodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOpCodeElement__Group__1__Impl"


    // $ANTLR start "rule__VMNodeOutElement__Group__0"
    // InternalAiDsl.g:1065:1: rule__VMNodeOutElement__Group__0 : rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1 ;
    public final void rule__VMNodeOutElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1069:1: ( rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1 )
            // InternalAiDsl.g:1070:2: rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VMNodeOutElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeOutElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__Group__0"


    // $ANTLR start "rule__VMNodeOutElement__Group__0__Impl"
    // InternalAiDsl.g:1077:1: rule__VMNodeOutElement__Group__0__Impl : ( 'out' ) ;
    public final void rule__VMNodeOutElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1081:1: ( ( 'out' ) )
            // InternalAiDsl.g:1082:1: ( 'out' )
            {
            // InternalAiDsl.g:1082:1: ( 'out' )
            // InternalAiDsl.g:1083:2: 'out'
            {
             before(grammarAccess.getVMNodeOutElementAccess().getOutKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVMNodeOutElementAccess().getOutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__Group__0__Impl"


    // $ANTLR start "rule__VMNodeOutElement__Group__1"
    // InternalAiDsl.g:1092:1: rule__VMNodeOutElement__Group__1 : rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2 ;
    public final void rule__VMNodeOutElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1096:1: ( rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2 )
            // InternalAiDsl.g:1097:2: rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__VMNodeOutElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeOutElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__Group__1"


    // $ANTLR start "rule__VMNodeOutElement__Group__1__Impl"
    // InternalAiDsl.g:1104:1: rule__VMNodeOutElement__Group__1__Impl : ( ( rule__VMNodeOutElement__NameAssignment_1 ) ) ;
    public final void rule__VMNodeOutElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1108:1: ( ( ( rule__VMNodeOutElement__NameAssignment_1 ) ) )
            // InternalAiDsl.g:1109:1: ( ( rule__VMNodeOutElement__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:1109:1: ( ( rule__VMNodeOutElement__NameAssignment_1 ) )
            // InternalAiDsl.g:1110:2: ( rule__VMNodeOutElement__NameAssignment_1 )
            {
             before(grammarAccess.getVMNodeOutElementAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:1111:2: ( rule__VMNodeOutElement__NameAssignment_1 )
            // InternalAiDsl.g:1111:3: rule__VMNodeOutElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeOutElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeOutElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__Group__1__Impl"


    // $ANTLR start "rule__VMNodeOutElement__Group__2"
    // InternalAiDsl.g:1119:1: rule__VMNodeOutElement__Group__2 : rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3 ;
    public final void rule__VMNodeOutElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1123:1: ( rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3 )
            // InternalAiDsl.g:1124:2: rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VMNodeOutElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeOutElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__Group__2"


    // $ANTLR start "rule__VMNodeOutElement__Group__2__Impl"
    // InternalAiDsl.g:1131:1: rule__VMNodeOutElement__Group__2__Impl : ( 'as' ) ;
    public final void rule__VMNodeOutElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1135:1: ( ( 'as' ) )
            // InternalAiDsl.g:1136:1: ( 'as' )
            {
            // InternalAiDsl.g:1136:1: ( 'as' )
            // InternalAiDsl.g:1137:2: 'as'
            {
             before(grammarAccess.getVMNodeOutElementAccess().getAsKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVMNodeOutElementAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__Group__2__Impl"


    // $ANTLR start "rule__VMNodeOutElement__Group__3"
    // InternalAiDsl.g:1146:1: rule__VMNodeOutElement__Group__3 : rule__VMNodeOutElement__Group__3__Impl ;
    public final void rule__VMNodeOutElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1150:1: ( rule__VMNodeOutElement__Group__3__Impl )
            // InternalAiDsl.g:1151:2: rule__VMNodeOutElement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeOutElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__Group__3"


    // $ANTLR start "rule__VMNodeOutElement__Group__3__Impl"
    // InternalAiDsl.g:1157:1: rule__VMNodeOutElement__Group__3__Impl : ( ( rule__VMNodeOutElement__TypeAssignment_3 ) ) ;
    public final void rule__VMNodeOutElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1161:1: ( ( ( rule__VMNodeOutElement__TypeAssignment_3 ) ) )
            // InternalAiDsl.g:1162:1: ( ( rule__VMNodeOutElement__TypeAssignment_3 ) )
            {
            // InternalAiDsl.g:1162:1: ( ( rule__VMNodeOutElement__TypeAssignment_3 ) )
            // InternalAiDsl.g:1163:2: ( rule__VMNodeOutElement__TypeAssignment_3 )
            {
             before(grammarAccess.getVMNodeOutElementAccess().getTypeAssignment_3()); 
            // InternalAiDsl.g:1164:2: ( rule__VMNodeOutElement__TypeAssignment_3 )
            // InternalAiDsl.g:1164:3: rule__VMNodeOutElement__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeOutElement__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeOutElementAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__Group__3__Impl"


    // $ANTLR start "rule__VMNodeElement__Group__0"
    // InternalAiDsl.g:1173:1: rule__VMNodeElement__Group__0 : rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1 ;
    public final void rule__VMNodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1177:1: ( rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1 )
            // InternalAiDsl.g:1178:2: rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VMNodeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group__0"


    // $ANTLR start "rule__VMNodeElement__Group__0__Impl"
    // InternalAiDsl.g:1185:1: rule__VMNodeElement__Group__0__Impl : ( ( rule__VMNodeElement__PolicyAssignment_0 ) ) ;
    public final void rule__VMNodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1189:1: ( ( ( rule__VMNodeElement__PolicyAssignment_0 ) ) )
            // InternalAiDsl.g:1190:1: ( ( rule__VMNodeElement__PolicyAssignment_0 ) )
            {
            // InternalAiDsl.g:1190:1: ( ( rule__VMNodeElement__PolicyAssignment_0 ) )
            // InternalAiDsl.g:1191:2: ( rule__VMNodeElement__PolicyAssignment_0 )
            {
             before(grammarAccess.getVMNodeElementAccess().getPolicyAssignment_0()); 
            // InternalAiDsl.g:1192:2: ( rule__VMNodeElement__PolicyAssignment_0 )
            // InternalAiDsl.g:1192:3: rule__VMNodeElement__PolicyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeElement__PolicyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeElementAccess().getPolicyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group__0__Impl"


    // $ANTLR start "rule__VMNodeElement__Group__1"
    // InternalAiDsl.g:1200:1: rule__VMNodeElement__Group__1 : rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2 ;
    public final void rule__VMNodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1204:1: ( rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2 )
            // InternalAiDsl.g:1205:2: rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__VMNodeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group__1"


    // $ANTLR start "rule__VMNodeElement__Group__1__Impl"
    // InternalAiDsl.g:1212:1: rule__VMNodeElement__Group__1__Impl : ( ( rule__VMNodeElement__TypeAssignment_1 ) ) ;
    public final void rule__VMNodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1216:1: ( ( ( rule__VMNodeElement__TypeAssignment_1 ) ) )
            // InternalAiDsl.g:1217:1: ( ( rule__VMNodeElement__TypeAssignment_1 ) )
            {
            // InternalAiDsl.g:1217:1: ( ( rule__VMNodeElement__TypeAssignment_1 ) )
            // InternalAiDsl.g:1218:2: ( rule__VMNodeElement__TypeAssignment_1 )
            {
             before(grammarAccess.getVMNodeElementAccess().getTypeAssignment_1()); 
            // InternalAiDsl.g:1219:2: ( rule__VMNodeElement__TypeAssignment_1 )
            // InternalAiDsl.g:1219:3: rule__VMNodeElement__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeElement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeElementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group__1__Impl"


    // $ANTLR start "rule__VMNodeElement__Group__2"
    // InternalAiDsl.g:1227:1: rule__VMNodeElement__Group__2 : rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3 ;
    public final void rule__VMNodeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1231:1: ( rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3 )
            // InternalAiDsl.g:1232:2: rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__VMNodeElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group__2"


    // $ANTLR start "rule__VMNodeElement__Group__2__Impl"
    // InternalAiDsl.g:1239:1: rule__VMNodeElement__Group__2__Impl : ( ( rule__VMNodeElement__NameAssignment_2 ) ) ;
    public final void rule__VMNodeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1243:1: ( ( ( rule__VMNodeElement__NameAssignment_2 ) ) )
            // InternalAiDsl.g:1244:1: ( ( rule__VMNodeElement__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:1244:1: ( ( rule__VMNodeElement__NameAssignment_2 ) )
            // InternalAiDsl.g:1245:2: ( rule__VMNodeElement__NameAssignment_2 )
            {
             before(grammarAccess.getVMNodeElementAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:1246:2: ( rule__VMNodeElement__NameAssignment_2 )
            // InternalAiDsl.g:1246:3: rule__VMNodeElement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeElement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeElementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group__2__Impl"


    // $ANTLR start "rule__VMNodeElement__Group__3"
    // InternalAiDsl.g:1254:1: rule__VMNodeElement__Group__3 : rule__VMNodeElement__Group__3__Impl ;
    public final void rule__VMNodeElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1258:1: ( rule__VMNodeElement__Group__3__Impl )
            // InternalAiDsl.g:1259:2: rule__VMNodeElement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group__3"


    // $ANTLR start "rule__VMNodeElement__Group__3__Impl"
    // InternalAiDsl.g:1265:1: rule__VMNodeElement__Group__3__Impl : ( ( rule__VMNodeElement__Group_3__0 )? ) ;
    public final void rule__VMNodeElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1269:1: ( ( ( rule__VMNodeElement__Group_3__0 )? ) )
            // InternalAiDsl.g:1270:1: ( ( rule__VMNodeElement__Group_3__0 )? )
            {
            // InternalAiDsl.g:1270:1: ( ( rule__VMNodeElement__Group_3__0 )? )
            // InternalAiDsl.g:1271:2: ( rule__VMNodeElement__Group_3__0 )?
            {
             before(grammarAccess.getVMNodeElementAccess().getGroup_3()); 
            // InternalAiDsl.g:1272:2: ( rule__VMNodeElement__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAiDsl.g:1272:3: rule__VMNodeElement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VMNodeElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVMNodeElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group__3__Impl"


    // $ANTLR start "rule__VMNodeElement__Group_3__0"
    // InternalAiDsl.g:1281:1: rule__VMNodeElement__Group_3__0 : rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1 ;
    public final void rule__VMNodeElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1285:1: ( rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1 )
            // InternalAiDsl.g:1286:2: rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__VMNodeElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group_3__0"


    // $ANTLR start "rule__VMNodeElement__Group_3__0__Impl"
    // InternalAiDsl.g:1293:1: rule__VMNodeElement__Group_3__0__Impl : ( 'default' ) ;
    public final void rule__VMNodeElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1297:1: ( ( 'default' ) )
            // InternalAiDsl.g:1298:1: ( 'default' )
            {
            // InternalAiDsl.g:1298:1: ( 'default' )
            // InternalAiDsl.g:1299:2: 'default'
            {
             before(grammarAccess.getVMNodeElementAccess().getDefaultKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVMNodeElementAccess().getDefaultKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group_3__0__Impl"


    // $ANTLR start "rule__VMNodeElement__Group_3__1"
    // InternalAiDsl.g:1308:1: rule__VMNodeElement__Group_3__1 : rule__VMNodeElement__Group_3__1__Impl ;
    public final void rule__VMNodeElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1312:1: ( rule__VMNodeElement__Group_3__1__Impl )
            // InternalAiDsl.g:1313:2: rule__VMNodeElement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeElement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group_3__1"


    // $ANTLR start "rule__VMNodeElement__Group_3__1__Impl"
    // InternalAiDsl.g:1319:1: rule__VMNodeElement__Group_3__1__Impl : ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) ) ;
    public final void rule__VMNodeElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1323:1: ( ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) ) )
            // InternalAiDsl.g:1324:1: ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) )
            {
            // InternalAiDsl.g:1324:1: ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) )
            // InternalAiDsl.g:1325:2: ( rule__VMNodeElement__DefaultvalueAssignment_3_1 )
            {
             before(grammarAccess.getVMNodeElementAccess().getDefaultvalueAssignment_3_1()); 
            // InternalAiDsl.g:1326:2: ( rule__VMNodeElement__DefaultvalueAssignment_3_1 )
            // InternalAiDsl.g:1326:3: rule__VMNodeElement__DefaultvalueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeElement__DefaultvalueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeElementAccess().getDefaultvalueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__Group_3__1__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__0"
    // InternalAiDsl.g:1335:1: rule__LlmTaskDefinition__Group__0 : rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1 ;
    public final void rule__LlmTaskDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1339:1: ( rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1 )
            // InternalAiDsl.g:1340:2: rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LlmTaskDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__0"


    // $ANTLR start "rule__LlmTaskDefinition__Group__0__Impl"
    // InternalAiDsl.g:1347:1: rule__LlmTaskDefinition__Group__0__Impl : ( 'llmtask' ) ;
    public final void rule__LlmTaskDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1351:1: ( ( 'llmtask' ) )
            // InternalAiDsl.g:1352:1: ( 'llmtask' )
            {
            // InternalAiDsl.g:1352:1: ( 'llmtask' )
            // InternalAiDsl.g:1353:2: 'llmtask'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getLlmtaskKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLlmTaskDefinitionAccess().getLlmtaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__0__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__1"
    // InternalAiDsl.g:1362:1: rule__LlmTaskDefinition__Group__1 : rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2 ;
    public final void rule__LlmTaskDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1366:1: ( rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2 )
            // InternalAiDsl.g:1367:2: rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LlmTaskDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__1"


    // $ANTLR start "rule__LlmTaskDefinition__Group__1__Impl"
    // InternalAiDsl.g:1374:1: rule__LlmTaskDefinition__Group__1__Impl : ( ( rule__LlmTaskDefinition__NameAssignment_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1378:1: ( ( ( rule__LlmTaskDefinition__NameAssignment_1 ) ) )
            // InternalAiDsl.g:1379:1: ( ( rule__LlmTaskDefinition__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:1379:1: ( ( rule__LlmTaskDefinition__NameAssignment_1 ) )
            // InternalAiDsl.g:1380:2: ( rule__LlmTaskDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:1381:2: ( rule__LlmTaskDefinition__NameAssignment_1 )
            // InternalAiDsl.g:1381:3: rule__LlmTaskDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLlmTaskDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__1__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__2"
    // InternalAiDsl.g:1389:1: rule__LlmTaskDefinition__Group__2 : rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3 ;
    public final void rule__LlmTaskDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1393:1: ( rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3 )
            // InternalAiDsl.g:1394:2: rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LlmTaskDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__2"


    // $ANTLR start "rule__LlmTaskDefinition__Group__2__Impl"
    // InternalAiDsl.g:1401:1: rule__LlmTaskDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__LlmTaskDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1405:1: ( ( '(' ) )
            // InternalAiDsl.g:1406:1: ( '(' )
            {
            // InternalAiDsl.g:1406:1: ( '(' )
            // InternalAiDsl.g:1407:2: '('
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLlmTaskDefinitionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__2__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__3"
    // InternalAiDsl.g:1416:1: rule__LlmTaskDefinition__Group__3 : rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4 ;
    public final void rule__LlmTaskDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1420:1: ( rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4 )
            // InternalAiDsl.g:1421:2: rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__LlmTaskDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__3"


    // $ANTLR start "rule__LlmTaskDefinition__Group__3__Impl"
    // InternalAiDsl.g:1428:1: rule__LlmTaskDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__LlmTaskDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1432:1: ( ( ')' ) )
            // InternalAiDsl.g:1433:1: ( ')' )
            {
            // InternalAiDsl.g:1433:1: ( ')' )
            // InternalAiDsl.g:1434:2: ')'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLlmTaskDefinitionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__3__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__4"
    // InternalAiDsl.g:1443:1: rule__LlmTaskDefinition__Group__4 : rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5 ;
    public final void rule__LlmTaskDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1447:1: ( rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5 )
            // InternalAiDsl.g:1448:2: rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__LlmTaskDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__4"


    // $ANTLR start "rule__LlmTaskDefinition__Group__4__Impl"
    // InternalAiDsl.g:1455:1: rule__LlmTaskDefinition__Group__4__Impl : ( ( rule__LlmTaskDefinition__Group_4__0 )? ) ;
    public final void rule__LlmTaskDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1459:1: ( ( ( rule__LlmTaskDefinition__Group_4__0 )? ) )
            // InternalAiDsl.g:1460:1: ( ( rule__LlmTaskDefinition__Group_4__0 )? )
            {
            // InternalAiDsl.g:1460:1: ( ( rule__LlmTaskDefinition__Group_4__0 )? )
            // InternalAiDsl.g:1461:2: ( rule__LlmTaskDefinition__Group_4__0 )?
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup_4()); 
            // InternalAiDsl.g:1462:2: ( rule__LlmTaskDefinition__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAiDsl.g:1462:3: rule__LlmTaskDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LlmTaskDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLlmTaskDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__4__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__5"
    // InternalAiDsl.g:1470:1: rule__LlmTaskDefinition__Group__5 : rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6 ;
    public final void rule__LlmTaskDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1474:1: ( rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6 )
            // InternalAiDsl.g:1475:2: rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__LlmTaskDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__5"


    // $ANTLR start "rule__LlmTaskDefinition__Group__5__Impl"
    // InternalAiDsl.g:1482:1: rule__LlmTaskDefinition__Group__5__Impl : ( '{' ) ;
    public final void rule__LlmTaskDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1486:1: ( ( '{' ) )
            // InternalAiDsl.g:1487:1: ( '{' )
            {
            // InternalAiDsl.g:1487:1: ( '{' )
            // InternalAiDsl.g:1488:2: '{'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLlmTaskDefinitionAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__5__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__6"
    // InternalAiDsl.g:1497:1: rule__LlmTaskDefinition__Group__6 : rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7 ;
    public final void rule__LlmTaskDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1501:1: ( rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7 )
            // InternalAiDsl.g:1502:2: rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__LlmTaskDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__6"


    // $ANTLR start "rule__LlmTaskDefinition__Group__6__Impl"
    // InternalAiDsl.g:1509:1: rule__LlmTaskDefinition__Group__6__Impl : ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* ) ;
    public final void rule__LlmTaskDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1513:1: ( ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* ) )
            // InternalAiDsl.g:1514:1: ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* )
            {
            // InternalAiDsl.g:1514:1: ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* )
            // InternalAiDsl.g:1515:2: ( rule__LlmTaskDefinition__AssignmentAssignment_6 )*
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentAssignment_6()); 
            // InternalAiDsl.g:1516:2: ( rule__LlmTaskDefinition__AssignmentAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAiDsl.g:1516:3: rule__LlmTaskDefinition__AssignmentAssignment_6
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__LlmTaskDefinition__AssignmentAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__6__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__7"
    // InternalAiDsl.g:1524:1: rule__LlmTaskDefinition__Group__7 : rule__LlmTaskDefinition__Group__7__Impl ;
    public final void rule__LlmTaskDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1528:1: ( rule__LlmTaskDefinition__Group__7__Impl )
            // InternalAiDsl.g:1529:2: rule__LlmTaskDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__7"


    // $ANTLR start "rule__LlmTaskDefinition__Group__7__Impl"
    // InternalAiDsl.g:1535:1: rule__LlmTaskDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__LlmTaskDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1539:1: ( ( '}' ) )
            // InternalAiDsl.g:1540:1: ( '}' )
            {
            // InternalAiDsl.g:1540:1: ( '}' )
            // InternalAiDsl.g:1541:2: '}'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLlmTaskDefinitionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group__7__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4__0"
    // InternalAiDsl.g:1551:1: rule__LlmTaskDefinition__Group_4__0 : rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1 ;
    public final void rule__LlmTaskDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1555:1: ( rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1 )
            // InternalAiDsl.g:1556:2: rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__LlmTaskDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4__0"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4__0__Impl"
    // InternalAiDsl.g:1563:1: rule__LlmTaskDefinition__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__LlmTaskDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1567:1: ( ( 'implements' ) )
            // InternalAiDsl.g:1568:1: ( 'implements' )
            {
            // InternalAiDsl.g:1568:1: ( 'implements' )
            // InternalAiDsl.g:1569:2: 'implements'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getImplementsKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLlmTaskDefinitionAccess().getImplementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4__1"
    // InternalAiDsl.g:1578:1: rule__LlmTaskDefinition__Group_4__1 : rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2 ;
    public final void rule__LlmTaskDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1582:1: ( rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2 )
            // InternalAiDsl.g:1583:2: rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__LlmTaskDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4__1"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4__1__Impl"
    // InternalAiDsl.g:1590:1: rule__LlmTaskDefinition__Group_4__1__Impl : ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1594:1: ( ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) ) )
            // InternalAiDsl.g:1595:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) )
            {
            // InternalAiDsl.g:1595:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) )
            // InternalAiDsl.g:1596:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAssignment_4_1()); 
            // InternalAiDsl.g:1597:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 )
            // InternalAiDsl.g:1597:3: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4__2"
    // InternalAiDsl.g:1605:1: rule__LlmTaskDefinition__Group_4__2 : rule__LlmTaskDefinition__Group_4__2__Impl ;
    public final void rule__LlmTaskDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1609:1: ( rule__LlmTaskDefinition__Group_4__2__Impl )
            // InternalAiDsl.g:1610:2: rule__LlmTaskDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4__2"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4__2__Impl"
    // InternalAiDsl.g:1616:1: rule__LlmTaskDefinition__Group_4__2__Impl : ( ( rule__LlmTaskDefinition__Group_4_2__0 )* ) ;
    public final void rule__LlmTaskDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1620:1: ( ( ( rule__LlmTaskDefinition__Group_4_2__0 )* ) )
            // InternalAiDsl.g:1621:1: ( ( rule__LlmTaskDefinition__Group_4_2__0 )* )
            {
            // InternalAiDsl.g:1621:1: ( ( rule__LlmTaskDefinition__Group_4_2__0 )* )
            // InternalAiDsl.g:1622:2: ( rule__LlmTaskDefinition__Group_4_2__0 )*
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup_4_2()); 
            // InternalAiDsl.g:1623:2: ( rule__LlmTaskDefinition__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAiDsl.g:1623:3: rule__LlmTaskDefinition__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__LlmTaskDefinition__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getLlmTaskDefinitionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4_2__0"
    // InternalAiDsl.g:1632:1: rule__LlmTaskDefinition__Group_4_2__0 : rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1 ;
    public final void rule__LlmTaskDefinition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1636:1: ( rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1 )
            // InternalAiDsl.g:1637:2: rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1
            {
            pushFollow(FOLLOW_20);
            rule__LlmTaskDefinition__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4_2__0"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4_2__0__Impl"
    // InternalAiDsl.g:1644:1: rule__LlmTaskDefinition__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__LlmTaskDefinition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1648:1: ( ( ',' ) )
            // InternalAiDsl.g:1649:1: ( ',' )
            {
            // InternalAiDsl.g:1649:1: ( ',' )
            // InternalAiDsl.g:1650:2: ','
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getCommaKeyword_4_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLlmTaskDefinitionAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4_2__0__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4_2__1"
    // InternalAiDsl.g:1659:1: rule__LlmTaskDefinition__Group_4_2__1 : rule__LlmTaskDefinition__Group_4_2__1__Impl ;
    public final void rule__LlmTaskDefinition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1663:1: ( rule__LlmTaskDefinition__Group_4_2__1__Impl )
            // InternalAiDsl.g:1664:2: rule__LlmTaskDefinition__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4_2__1"


    // $ANTLR start "rule__LlmTaskDefinition__Group_4_2__1__Impl"
    // InternalAiDsl.g:1670:1: rule__LlmTaskDefinition__Group_4_2__1__Impl : ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1674:1: ( ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) ) )
            // InternalAiDsl.g:1675:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) )
            {
            // InternalAiDsl.g:1675:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) )
            // InternalAiDsl.g:1676:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAssignment_4_2_1()); 
            // InternalAiDsl.g:1677:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 )
            // InternalAiDsl.g:1677:3: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Group_4_2__1__Impl"


    // $ANTLR start "rule__AnnotationInterfaceReference__Group__0"
    // InternalAiDsl.g:1686:1: rule__AnnotationInterfaceReference__Group__0 : rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1 ;
    public final void rule__AnnotationInterfaceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1690:1: ( rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1 )
            // InternalAiDsl.g:1691:2: rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AnnotationInterfaceReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInterfaceReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInterfaceReference__Group__0"


    // $ANTLR start "rule__AnnotationInterfaceReference__Group__0__Impl"
    // InternalAiDsl.g:1698:1: rule__AnnotationInterfaceReference__Group__0__Impl : ( '@' ) ;
    public final void rule__AnnotationInterfaceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1702:1: ( ( '@' ) )
            // InternalAiDsl.g:1703:1: ( '@' )
            {
            // InternalAiDsl.g:1703:1: ( '@' )
            // InternalAiDsl.g:1704:2: '@'
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getCommercialAtKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAnnotationInterfaceReferenceAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInterfaceReference__Group__0__Impl"


    // $ANTLR start "rule__AnnotationInterfaceReference__Group__1"
    // InternalAiDsl.g:1713:1: rule__AnnotationInterfaceReference__Group__1 : rule__AnnotationInterfaceReference__Group__1__Impl ;
    public final void rule__AnnotationInterfaceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1717:1: ( rule__AnnotationInterfaceReference__Group__1__Impl )
            // InternalAiDsl.g:1718:2: rule__AnnotationInterfaceReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInterfaceReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInterfaceReference__Group__1"


    // $ANTLR start "rule__AnnotationInterfaceReference__Group__1__Impl"
    // InternalAiDsl.g:1724:1: rule__AnnotationInterfaceReference__Group__1__Impl : ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) ) ;
    public final void rule__AnnotationInterfaceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1728:1: ( ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) ) )
            // InternalAiDsl.g:1729:1: ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:1729:1: ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) )
            // InternalAiDsl.g:1730:2: ( rule__AnnotationInterfaceReference__NameAssignment_1 )
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:1731:2: ( rule__AnnotationInterfaceReference__NameAssignment_1 )
            // InternalAiDsl.g:1731:3: rule__AnnotationInterfaceReference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInterfaceReference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInterfaceReference__Group__1__Impl"


    // $ANTLR start "rule__LlmVariableAssignment__Group__0"
    // InternalAiDsl.g:1740:1: rule__LlmVariableAssignment__Group__0 : rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1 ;
    public final void rule__LlmVariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1744:1: ( rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1 )
            // InternalAiDsl.g:1745:2: rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__LlmVariableAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmVariableAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmVariableAssignment__Group__0"


    // $ANTLR start "rule__LlmVariableAssignment__Group__0__Impl"
    // InternalAiDsl.g:1752:1: rule__LlmVariableAssignment__Group__0__Impl : ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) ) ;
    public final void rule__LlmVariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1756:1: ( ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) ) )
            // InternalAiDsl.g:1757:1: ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) )
            {
            // InternalAiDsl.g:1757:1: ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) )
            // InternalAiDsl.g:1758:2: ( rule__LlmVariableAssignment__VariablenameAssignment_0 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getVariablenameAssignment_0()); 
            // InternalAiDsl.g:1759:2: ( rule__LlmVariableAssignment__VariablenameAssignment_0 )
            // InternalAiDsl.g:1759:3: rule__LlmVariableAssignment__VariablenameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LlmVariableAssignment__VariablenameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLlmVariableAssignmentAccess().getVariablenameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmVariableAssignment__Group__0__Impl"


    // $ANTLR start "rule__LlmVariableAssignment__Group__1"
    // InternalAiDsl.g:1767:1: rule__LlmVariableAssignment__Group__1 : rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2 ;
    public final void rule__LlmVariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1771:1: ( rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2 )
            // InternalAiDsl.g:1772:2: rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__LlmVariableAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmVariableAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmVariableAssignment__Group__1"


    // $ANTLR start "rule__LlmVariableAssignment__Group__1__Impl"
    // InternalAiDsl.g:1779:1: rule__LlmVariableAssignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__LlmVariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1783:1: ( ( ':=' ) )
            // InternalAiDsl.g:1784:1: ( ':=' )
            {
            // InternalAiDsl.g:1784:1: ( ':=' )
            // InternalAiDsl.g:1785:2: ':='
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getColonEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLlmVariableAssignmentAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmVariableAssignment__Group__1__Impl"


    // $ANTLR start "rule__LlmVariableAssignment__Group__2"
    // InternalAiDsl.g:1794:1: rule__LlmVariableAssignment__Group__2 : rule__LlmVariableAssignment__Group__2__Impl ;
    public final void rule__LlmVariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1798:1: ( rule__LlmVariableAssignment__Group__2__Impl )
            // InternalAiDsl.g:1799:2: rule__LlmVariableAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LlmVariableAssignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmVariableAssignment__Group__2"


    // $ANTLR start "rule__LlmVariableAssignment__Group__2__Impl"
    // InternalAiDsl.g:1805:1: rule__LlmVariableAssignment__Group__2__Impl : ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) ) ;
    public final void rule__LlmVariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1809:1: ( ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) ) )
            // InternalAiDsl.g:1810:1: ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) )
            {
            // InternalAiDsl.g:1810:1: ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) )
            // InternalAiDsl.g:1811:2: ( rule__LlmVariableAssignment__TemplateAssignment_2 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getTemplateAssignment_2()); 
            // InternalAiDsl.g:1812:2: ( rule__LlmVariableAssignment__TemplateAssignment_2 )
            // InternalAiDsl.g:1812:3: rule__LlmVariableAssignment__TemplateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LlmVariableAssignment__TemplateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLlmVariableAssignmentAccess().getTemplateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmVariableAssignment__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAiDsl.g:1821:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1825:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAiDsl.g:1826:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalAiDsl.g:1833:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1837:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:1838:1: ( RULE_ID )
            {
            // InternalAiDsl.g:1838:1: ( RULE_ID )
            // InternalAiDsl.g:1839:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalAiDsl.g:1848:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1852:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAiDsl.g:1853:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalAiDsl.g:1859:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1863:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAiDsl.g:1864:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAiDsl.g:1864:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAiDsl.g:1865:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAiDsl.g:1866:2: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAiDsl.g:1866:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalAiDsl.g:1875:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1879:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAiDsl.g:1880:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalAiDsl.g:1887:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1891:1: ( ( '.' ) )
            // InternalAiDsl.g:1892:1: ( '.' )
            {
            // InternalAiDsl.g:1892:1: ( '.' )
            // InternalAiDsl.g:1893:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalAiDsl.g:1902:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1906:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAiDsl.g:1907:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalAiDsl.g:1913:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1917:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:1918:1: ( RULE_ID )
            {
            // InternalAiDsl.g:1918:1: ( RULE_ID )
            // InternalAiDsl.g:1919:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalAiDsl.g:1929:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1933:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAiDsl.g:1934:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalAiDsl.g:1941:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1945:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:1946:1: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:1946:1: ( ruleQualifiedName )
            // InternalAiDsl.g:1947:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalAiDsl.g:1956:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1960:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAiDsl.g:1961:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalAiDsl.g:1967:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1971:1: ( ( ( '.*' )? ) )
            // InternalAiDsl.g:1972:1: ( ( '.*' )? )
            {
            // InternalAiDsl.g:1972:1: ( ( '.*' )? )
            // InternalAiDsl.g:1973:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAiDsl.g:1974:2: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAiDsl.g:1974:3: '.*'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Model__Package_declarationAssignment_0"
    // InternalAiDsl.g:1983:1: rule__Model__Package_declarationAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__Model__Package_declarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1987:1: ( ( rulePackageDeclaration ) )
            // InternalAiDsl.g:1988:2: ( rulePackageDeclaration )
            {
            // InternalAiDsl.g:1988:2: ( rulePackageDeclaration )
            // InternalAiDsl.g:1989:3: rulePackageDeclaration
            {
             before(grammarAccess.getModelAccess().getPackage_declarationPackageDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackage_declarationPackageDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Package_declarationAssignment_0"


    // $ANTLR start "rule__Model__Import_declarationsAssignment_1"
    // InternalAiDsl.g:1998:1: rule__Model__Import_declarationsAssignment_1 : ( ruleImportDeclaration ) ;
    public final void rule__Model__Import_declarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2002:1: ( ( ruleImportDeclaration ) )
            // InternalAiDsl.g:2003:2: ( ruleImportDeclaration )
            {
            // InternalAiDsl.g:2003:2: ( ruleImportDeclaration )
            // InternalAiDsl.g:2004:3: ruleImportDeclaration
            {
             before(grammarAccess.getModelAccess().getImport_declarationsImportDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImport_declarationsImportDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Import_declarationsAssignment_1"


    // $ANTLR start "rule__Model__DefinitionsAssignment_2"
    // InternalAiDsl.g:2013:1: rule__Model__DefinitionsAssignment_2 : ( ( rule__Model__DefinitionsAlternatives_2_0 ) ) ;
    public final void rule__Model__DefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2017:1: ( ( ( rule__Model__DefinitionsAlternatives_2_0 ) ) )
            // InternalAiDsl.g:2018:2: ( ( rule__Model__DefinitionsAlternatives_2_0 ) )
            {
            // InternalAiDsl.g:2018:2: ( ( rule__Model__DefinitionsAlternatives_2_0 ) )
            // InternalAiDsl.g:2019:3: ( rule__Model__DefinitionsAlternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getDefinitionsAlternatives_2_0()); 
            // InternalAiDsl.g:2020:3: ( rule__Model__DefinitionsAlternatives_2_0 )
            // InternalAiDsl.g:2020:4: rule__Model__DefinitionsAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__DefinitionsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDefinitionsAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefinitionsAssignment_2"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalAiDsl.g:2028:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2032:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2033:2: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2033:2: ( ruleQualifiedName )
            // InternalAiDsl.g:2034:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ImportDeclaration__ImportedNamespaceAssignment_1"
    // InternalAiDsl.g:2043:1: rule__ImportDeclaration__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__ImportDeclaration__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2047:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAiDsl.g:2048:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAiDsl.g:2048:2: ( ruleQualifiedNameWithWildcard )
            // InternalAiDsl.g:2049:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclaration__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__WorkflowDefinition__NameAssignment_1"
    // InternalAiDsl.g:2058:1: rule__WorkflowDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkflowDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2062:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2063:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2063:2: ( RULE_ID )
            // InternalAiDsl.g:2064:3: RULE_ID
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__NameAssignment_1"


    // $ANTLR start "rule__VMNodeDefinition__NodetypeAssignment_1"
    // InternalAiDsl.g:2073:1: rule__VMNodeDefinition__NodetypeAssignment_1 : ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) ) ;
    public final void rule__VMNodeDefinition__NodetypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2077:1: ( ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) ) )
            // InternalAiDsl.g:2078:2: ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) )
            {
            // InternalAiDsl.g:2078:2: ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) )
            // InternalAiDsl.g:2079:3: ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 )
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeAlternatives_1_0()); 
            // InternalAiDsl.g:2080:3: ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 )
            // InternalAiDsl.g:2080:4: rule__VMNodeDefinition__NodetypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeDefinition__NodetypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeDefinitionAccess().getNodetypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__NodetypeAssignment_1"


    // $ANTLR start "rule__VMNodeDefinition__NameAssignment_2"
    // InternalAiDsl.g:2088:1: rule__VMNodeDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VMNodeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2092:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2093:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2093:2: ( RULE_ID )
            // InternalAiDsl.g:2094:3: RULE_ID
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVMNodeDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__NameAssignment_2"


    // $ANTLR start "rule__VMNodeDefinition__ElementsAssignment_4"
    // InternalAiDsl.g:2103:1: rule__VMNodeDefinition__ElementsAssignment_4 : ( ruleVMNodeEleemnts ) ;
    public final void rule__VMNodeDefinition__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2107:1: ( ( ruleVMNodeEleemnts ) )
            // InternalAiDsl.g:2108:2: ( ruleVMNodeEleemnts )
            {
            // InternalAiDsl.g:2108:2: ( ruleVMNodeEleemnts )
            // InternalAiDsl.g:2109:3: ruleVMNodeEleemnts
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getElementsVMNodeEleemntsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVMNodeEleemnts();

            state._fsp--;

             after(grammarAccess.getVMNodeDefinitionAccess().getElementsVMNodeEleemntsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeDefinition__ElementsAssignment_4"


    // $ANTLR start "rule__VMNodeOpCodeElement__CodeAssignment_1"
    // InternalAiDsl.g:2118:1: rule__VMNodeOpCodeElement__CodeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VMNodeOpCodeElement__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2122:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2123:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2123:2: ( RULE_STRING )
            // InternalAiDsl.g:2124:3: RULE_STRING
            {
             before(grammarAccess.getVMNodeOpCodeElementAccess().getCodeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVMNodeOpCodeElementAccess().getCodeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOpCodeElement__CodeAssignment_1"


    // $ANTLR start "rule__VMNodeOutElement__NameAssignment_1"
    // InternalAiDsl.g:2133:1: rule__VMNodeOutElement__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__VMNodeOutElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2137:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2138:2: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2138:2: ( ruleQualifiedName )
            // InternalAiDsl.g:2139:3: ruleQualifiedName
            {
             before(grammarAccess.getVMNodeOutElementAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getVMNodeOutElementAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__NameAssignment_1"


    // $ANTLR start "rule__VMNodeOutElement__TypeAssignment_3"
    // InternalAiDsl.g:2148:1: rule__VMNodeOutElement__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__VMNodeOutElement__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2152:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2153:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2153:2: ( RULE_ID )
            // InternalAiDsl.g:2154:3: RULE_ID
            {
             before(grammarAccess.getVMNodeOutElementAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVMNodeOutElementAccess().getTypeIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeOutElement__TypeAssignment_3"


    // $ANTLR start "rule__VMNodeElement__PolicyAssignment_0"
    // InternalAiDsl.g:2163:1: rule__VMNodeElement__PolicyAssignment_0 : ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) ) ;
    public final void rule__VMNodeElement__PolicyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2167:1: ( ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) ) )
            // InternalAiDsl.g:2168:2: ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) )
            {
            // InternalAiDsl.g:2168:2: ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) )
            // InternalAiDsl.g:2169:3: ( rule__VMNodeElement__PolicyAlternatives_0_0 )
            {
             before(grammarAccess.getVMNodeElementAccess().getPolicyAlternatives_0_0()); 
            // InternalAiDsl.g:2170:3: ( rule__VMNodeElement__PolicyAlternatives_0_0 )
            // InternalAiDsl.g:2170:4: rule__VMNodeElement__PolicyAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeElement__PolicyAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeElementAccess().getPolicyAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__PolicyAssignment_0"


    // $ANTLR start "rule__VMNodeElement__TypeAssignment_1"
    // InternalAiDsl.g:2178:1: rule__VMNodeElement__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__VMNodeElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2182:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2183:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2183:2: ( RULE_ID )
            // InternalAiDsl.g:2184:3: RULE_ID
            {
             before(grammarAccess.getVMNodeElementAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVMNodeElementAccess().getTypeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__TypeAssignment_1"


    // $ANTLR start "rule__VMNodeElement__NameAssignment_2"
    // InternalAiDsl.g:2193:1: rule__VMNodeElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VMNodeElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2197:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2198:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2198:2: ( RULE_ID )
            // InternalAiDsl.g:2199:3: RULE_ID
            {
             before(grammarAccess.getVMNodeElementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVMNodeElementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__NameAssignment_2"


    // $ANTLR start "rule__VMNodeElement__DefaultvalueAssignment_3_1"
    // InternalAiDsl.g:2208:1: rule__VMNodeElement__DefaultvalueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__VMNodeElement__DefaultvalueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2212:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2213:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2213:2: ( RULE_STRING )
            // InternalAiDsl.g:2214:3: RULE_STRING
            {
             before(grammarAccess.getVMNodeElementAccess().getDefaultvalueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVMNodeElementAccess().getDefaultvalueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VMNodeElement__DefaultvalueAssignment_3_1"


    // $ANTLR start "rule__LlmTaskDefinition__NameAssignment_1"
    // InternalAiDsl.g:2223:1: rule__LlmTaskDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LlmTaskDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2227:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2228:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2228:2: ( RULE_ID )
            // InternalAiDsl.g:2229:3: RULE_ID
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLlmTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__NameAssignment_1"


    // $ANTLR start "rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1"
    // InternalAiDsl.g:2238:1: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 : ( ruleAnnotationInterfaceReference ) ;
    public final void rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2242:1: ( ( ruleAnnotationInterfaceReference ) )
            // InternalAiDsl.g:2243:2: ( ruleAnnotationInterfaceReference )
            {
            // InternalAiDsl.g:2243:2: ( ruleAnnotationInterfaceReference )
            // InternalAiDsl.g:2244:3: ruleAnnotationInterfaceReference
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotationInterfaceReference();

            state._fsp--;

             after(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1"


    // $ANTLR start "rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1"
    // InternalAiDsl.g:2253:1: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 : ( ruleAnnotationInterfaceReference ) ;
    public final void rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2257:1: ( ( ruleAnnotationInterfaceReference ) )
            // InternalAiDsl.g:2258:2: ( ruleAnnotationInterfaceReference )
            {
            // InternalAiDsl.g:2258:2: ( ruleAnnotationInterfaceReference )
            // InternalAiDsl.g:2259:3: ruleAnnotationInterfaceReference
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotationInterfaceReference();

            state._fsp--;

             after(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAnnotationInterfaceReferenceParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1"


    // $ANTLR start "rule__LlmTaskDefinition__AssignmentAssignment_6"
    // InternalAiDsl.g:2268:1: rule__LlmTaskDefinition__AssignmentAssignment_6 : ( ruleLlmVariableAssignment ) ;
    public final void rule__LlmTaskDefinition__AssignmentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2272:1: ( ( ruleLlmVariableAssignment ) )
            // InternalAiDsl.g:2273:2: ( ruleLlmVariableAssignment )
            {
            // InternalAiDsl.g:2273:2: ( ruleLlmVariableAssignment )
            // InternalAiDsl.g:2274:3: ruleLlmVariableAssignment
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentLlmVariableAssignmentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLlmVariableAssignment();

            state._fsp--;

             after(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentLlmVariableAssignmentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmTaskDefinition__AssignmentAssignment_6"


    // $ANTLR start "rule__AnnotationInterfaceReference__NameAssignment_1"
    // InternalAiDsl.g:2283:1: rule__AnnotationInterfaceReference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnnotationInterfaceReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2287:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2288:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2288:2: ( RULE_ID )
            // InternalAiDsl.g:2289:3: RULE_ID
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInterfaceReference__NameAssignment_1"


    // $ANTLR start "rule__LlmVariableAssignment__VariablenameAssignment_0"
    // InternalAiDsl.g:2298:1: rule__LlmVariableAssignment__VariablenameAssignment_0 : ( RULE_ID ) ;
    public final void rule__LlmVariableAssignment__VariablenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2302:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2303:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2303:2: ( RULE_ID )
            // InternalAiDsl.g:2304:3: RULE_ID
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getVariablenameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLlmVariableAssignmentAccess().getVariablenameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmVariableAssignment__VariablenameAssignment_0"


    // $ANTLR start "rule__LlmVariableAssignment__TemplateAssignment_2"
    // InternalAiDsl.g:2313:1: rule__LlmVariableAssignment__TemplateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LlmVariableAssignment__TemplateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2317:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2318:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2318:2: ( RULE_STRING )
            // InternalAiDsl.g:2319:3: RULE_STRING
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getTemplateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLlmVariableAssignmentAccess().getTemplateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmVariableAssignment__TemplateAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008430000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008420002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001A06000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001806002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});

}