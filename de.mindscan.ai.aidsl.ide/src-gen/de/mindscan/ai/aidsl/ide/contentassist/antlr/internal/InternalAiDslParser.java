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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'super'", "'overlay'", "'require'", "'optional'", "'package'", "'import'", "'workflow'", "'('", "')'", "'{'", "'}'", "'vmnode'", "'opcode'", "'out'", "'as'", "'in'", "'default'", "':='", "'llmtask'", "'implements'", "','", "'@'", "'.'", "'.*'", "'override'"
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
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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


    // $ANTLR start "entryRuleVMNodeInElement"
    // InternalAiDsl.g:253:1: entryRuleVMNodeInElement : ruleVMNodeInElement EOF ;
    public final void entryRuleVMNodeInElement() throws RecognitionException {
        try {
            // InternalAiDsl.g:254:1: ( ruleVMNodeInElement EOF )
            // InternalAiDsl.g:255:1: ruleVMNodeInElement EOF
            {
             before(grammarAccess.getVMNodeInElementRule()); 
            pushFollow(FOLLOW_1);
            ruleVMNodeInElement();

            state._fsp--;

             after(grammarAccess.getVMNodeInElementRule()); 
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
    // $ANTLR end "entryRuleVMNodeInElement"


    // $ANTLR start "ruleVMNodeInElement"
    // InternalAiDsl.g:262:1: ruleVMNodeInElement : ( ( rule__VMNodeInElement__Group__0 ) ) ;
    public final void ruleVMNodeInElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:266:2: ( ( ( rule__VMNodeInElement__Group__0 ) ) )
            // InternalAiDsl.g:267:2: ( ( rule__VMNodeInElement__Group__0 ) )
            {
            // InternalAiDsl.g:267:2: ( ( rule__VMNodeInElement__Group__0 ) )
            // InternalAiDsl.g:268:3: ( rule__VMNodeInElement__Group__0 )
            {
             before(grammarAccess.getVMNodeInElementAccess().getGroup()); 
            // InternalAiDsl.g:269:3: ( rule__VMNodeInElement__Group__0 )
            // InternalAiDsl.g:269:4: rule__VMNodeInElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeInElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeInElementAccess().getGroup()); 

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
    // $ANTLR end "ruleVMNodeInElement"


    // $ANTLR start "entryRuleVMNodeElement"
    // InternalAiDsl.g:278:1: entryRuleVMNodeElement : ruleVMNodeElement EOF ;
    public final void entryRuleVMNodeElement() throws RecognitionException {
        try {
            // InternalAiDsl.g:279:1: ( ruleVMNodeElement EOF )
            // InternalAiDsl.g:280:1: ruleVMNodeElement EOF
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
    // InternalAiDsl.g:287:1: ruleVMNodeElement : ( ( rule__VMNodeElement__Group__0 ) ) ;
    public final void ruleVMNodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:291:2: ( ( ( rule__VMNodeElement__Group__0 ) ) )
            // InternalAiDsl.g:292:2: ( ( rule__VMNodeElement__Group__0 ) )
            {
            // InternalAiDsl.g:292:2: ( ( rule__VMNodeElement__Group__0 ) )
            // InternalAiDsl.g:293:3: ( rule__VMNodeElement__Group__0 )
            {
             before(grammarAccess.getVMNodeElementAccess().getGroup()); 
            // InternalAiDsl.g:294:3: ( rule__VMNodeElement__Group__0 )
            // InternalAiDsl.g:294:4: rule__VMNodeElement__Group__0
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


    // $ANTLR start "entryRuleVMOverrideElement"
    // InternalAiDsl.g:303:1: entryRuleVMOverrideElement : ruleVMOverrideElement EOF ;
    public final void entryRuleVMOverrideElement() throws RecognitionException {
        try {
            // InternalAiDsl.g:304:1: ( ruleVMOverrideElement EOF )
            // InternalAiDsl.g:305:1: ruleVMOverrideElement EOF
            {
             before(grammarAccess.getVMOverrideElementRule()); 
            pushFollow(FOLLOW_1);
            ruleVMOverrideElement();

            state._fsp--;

             after(grammarAccess.getVMOverrideElementRule()); 
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
    // $ANTLR end "entryRuleVMOverrideElement"


    // $ANTLR start "ruleVMOverrideElement"
    // InternalAiDsl.g:312:1: ruleVMOverrideElement : ( ( rule__VMOverrideElement__Group__0 ) ) ;
    public final void ruleVMOverrideElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:316:2: ( ( ( rule__VMOverrideElement__Group__0 ) ) )
            // InternalAiDsl.g:317:2: ( ( rule__VMOverrideElement__Group__0 ) )
            {
            // InternalAiDsl.g:317:2: ( ( rule__VMOverrideElement__Group__0 ) )
            // InternalAiDsl.g:318:3: ( rule__VMOverrideElement__Group__0 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getGroup()); 
            // InternalAiDsl.g:319:3: ( rule__VMOverrideElement__Group__0 )
            // InternalAiDsl.g:319:4: rule__VMOverrideElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVMOverrideElementAccess().getGroup()); 

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
    // $ANTLR end "ruleVMOverrideElement"


    // $ANTLR start "entryRuleLlmTaskDefinition"
    // InternalAiDsl.g:328:1: entryRuleLlmTaskDefinition : ruleLlmTaskDefinition EOF ;
    public final void entryRuleLlmTaskDefinition() throws RecognitionException {
        try {
            // InternalAiDsl.g:329:1: ( ruleLlmTaskDefinition EOF )
            // InternalAiDsl.g:330:1: ruleLlmTaskDefinition EOF
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
    // InternalAiDsl.g:337:1: ruleLlmTaskDefinition : ( ( rule__LlmTaskDefinition__Group__0 ) ) ;
    public final void ruleLlmTaskDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:341:2: ( ( ( rule__LlmTaskDefinition__Group__0 ) ) )
            // InternalAiDsl.g:342:2: ( ( rule__LlmTaskDefinition__Group__0 ) )
            {
            // InternalAiDsl.g:342:2: ( ( rule__LlmTaskDefinition__Group__0 ) )
            // InternalAiDsl.g:343:3: ( rule__LlmTaskDefinition__Group__0 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup()); 
            // InternalAiDsl.g:344:3: ( rule__LlmTaskDefinition__Group__0 )
            // InternalAiDsl.g:344:4: rule__LlmTaskDefinition__Group__0
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
    // InternalAiDsl.g:353:1: entryRuleAnnotationInterfaceReference : ruleAnnotationInterfaceReference EOF ;
    public final void entryRuleAnnotationInterfaceReference() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAiDsl.g:357:1: ( ruleAnnotationInterfaceReference EOF )
            // InternalAiDsl.g:358:1: ruleAnnotationInterfaceReference EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotationInterfaceReference"


    // $ANTLR start "ruleAnnotationInterfaceReference"
    // InternalAiDsl.g:368:1: ruleAnnotationInterfaceReference : ( ( rule__AnnotationInterfaceReference__Group__0 ) ) ;
    public final void ruleAnnotationInterfaceReference() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:373:2: ( ( ( rule__AnnotationInterfaceReference__Group__0 ) ) )
            // InternalAiDsl.g:374:2: ( ( rule__AnnotationInterfaceReference__Group__0 ) )
            {
            // InternalAiDsl.g:374:2: ( ( rule__AnnotationInterfaceReference__Group__0 ) )
            // InternalAiDsl.g:375:3: ( rule__AnnotationInterfaceReference__Group__0 )
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getGroup()); 
            // InternalAiDsl.g:376:3: ( rule__AnnotationInterfaceReference__Group__0 )
            // InternalAiDsl.g:376:4: rule__AnnotationInterfaceReference__Group__0
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationInterfaceReference"


    // $ANTLR start "entryRuleLlmVariableAssignment"
    // InternalAiDsl.g:386:1: entryRuleLlmVariableAssignment : ruleLlmVariableAssignment EOF ;
    public final void entryRuleLlmVariableAssignment() throws RecognitionException {
        try {
            // InternalAiDsl.g:387:1: ( ruleLlmVariableAssignment EOF )
            // InternalAiDsl.g:388:1: ruleLlmVariableAssignment EOF
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
    // InternalAiDsl.g:395:1: ruleLlmVariableAssignment : ( ( rule__LlmVariableAssignment__Group__0 ) ) ;
    public final void ruleLlmVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:399:2: ( ( ( rule__LlmVariableAssignment__Group__0 ) ) )
            // InternalAiDsl.g:400:2: ( ( rule__LlmVariableAssignment__Group__0 ) )
            {
            // InternalAiDsl.g:400:2: ( ( rule__LlmVariableAssignment__Group__0 ) )
            // InternalAiDsl.g:401:3: ( rule__LlmVariableAssignment__Group__0 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getGroup()); 
            // InternalAiDsl.g:402:3: ( rule__LlmVariableAssignment__Group__0 )
            // InternalAiDsl.g:402:4: rule__LlmVariableAssignment__Group__0
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
    // InternalAiDsl.g:411:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAiDsl.g:412:1: ( ruleQualifiedName EOF )
            // InternalAiDsl.g:413:1: ruleQualifiedName EOF
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
    // InternalAiDsl.g:420:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:424:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAiDsl.g:425:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAiDsl.g:425:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAiDsl.g:426:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAiDsl.g:427:3: ( rule__QualifiedName__Group__0 )
            // InternalAiDsl.g:427:4: rule__QualifiedName__Group__0
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
    // InternalAiDsl.g:436:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalAiDsl.g:437:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalAiDsl.g:438:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalAiDsl.g:445:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:449:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalAiDsl.g:450:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalAiDsl.g:450:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalAiDsl.g:451:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalAiDsl.g:452:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalAiDsl.g:452:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalAiDsl.g:460:1: rule__Model__DefinitionsAlternatives_2_0 : ( ( ruleWorkflowDefinition ) | ( ruleLlmTaskDefinition ) | ( ruleVMNodeDefinition ) );
    public final void rule__Model__DefinitionsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:464:1: ( ( ruleWorkflowDefinition ) | ( ruleLlmTaskDefinition ) | ( ruleVMNodeDefinition ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 29:
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
                    // InternalAiDsl.g:465:2: ( ruleWorkflowDefinition )
                    {
                    // InternalAiDsl.g:465:2: ( ruleWorkflowDefinition )
                    // InternalAiDsl.g:466:3: ruleWorkflowDefinition
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
                    // InternalAiDsl.g:471:2: ( ruleLlmTaskDefinition )
                    {
                    // InternalAiDsl.g:471:2: ( ruleLlmTaskDefinition )
                    // InternalAiDsl.g:472:3: ruleLlmTaskDefinition
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
                    // InternalAiDsl.g:477:2: ( ruleVMNodeDefinition )
                    {
                    // InternalAiDsl.g:477:2: ( ruleVMNodeDefinition )
                    // InternalAiDsl.g:478:3: ruleVMNodeDefinition
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
    // InternalAiDsl.g:487:1: rule__VMNodeDefinition__NodetypeAlternatives_1_0 : ( ( 'super' ) | ( 'overlay' ) );
    public final void rule__VMNodeDefinition__NodetypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:491:1: ( ( 'super' ) | ( 'overlay' ) )
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
                    // InternalAiDsl.g:492:2: ( 'super' )
                    {
                    // InternalAiDsl.g:492:2: ( 'super' )
                    // InternalAiDsl.g:493:3: 'super'
                    {
                     before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:498:2: ( 'overlay' )
                    {
                    // InternalAiDsl.g:498:2: ( 'overlay' )
                    // InternalAiDsl.g:499:3: 'overlay'
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
    // InternalAiDsl.g:508:1: rule__VMNodeEleemnts__Alternatives : ( ( ruleVMNodeOpCodeElement ) | ( ruleVMNodeOutElement ) | ( ruleVMNodeInElement ) | ( ruleVMNodeElement ) | ( ruleVMOverrideElement ) );
    public final void rule__VMNodeEleemnts__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:512:1: ( ( ruleVMNodeOpCodeElement ) | ( ruleVMNodeOutElement ) | ( ruleVMNodeInElement ) | ( ruleVMNodeElement ) | ( ruleVMOverrideElement ) )
            int alt3=5;
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
            case 26:
                {
                alt3=3;
                }
                break;
            case 13:
            case 14:
                {
                alt3=4;
                }
                break;
            case 35:
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
                    // InternalAiDsl.g:513:2: ( ruleVMNodeOpCodeElement )
                    {
                    // InternalAiDsl.g:513:2: ( ruleVMNodeOpCodeElement )
                    // InternalAiDsl.g:514:3: ruleVMNodeOpCodeElement
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
                    // InternalAiDsl.g:519:2: ( ruleVMNodeOutElement )
                    {
                    // InternalAiDsl.g:519:2: ( ruleVMNodeOutElement )
                    // InternalAiDsl.g:520:3: ruleVMNodeOutElement
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
                    // InternalAiDsl.g:525:2: ( ruleVMNodeInElement )
                    {
                    // InternalAiDsl.g:525:2: ( ruleVMNodeInElement )
                    // InternalAiDsl.g:526:3: ruleVMNodeInElement
                    {
                     before(grammarAccess.getVMNodeEleemntsAccess().getVMNodeInElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVMNodeInElement();

                    state._fsp--;

                     after(grammarAccess.getVMNodeEleemntsAccess().getVMNodeInElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:531:2: ( ruleVMNodeElement )
                    {
                    // InternalAiDsl.g:531:2: ( ruleVMNodeElement )
                    // InternalAiDsl.g:532:3: ruleVMNodeElement
                    {
                     before(grammarAccess.getVMNodeEleemntsAccess().getVMNodeElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVMNodeElement();

                    state._fsp--;

                     after(grammarAccess.getVMNodeEleemntsAccess().getVMNodeElementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAiDsl.g:537:2: ( ruleVMOverrideElement )
                    {
                    // InternalAiDsl.g:537:2: ( ruleVMOverrideElement )
                    // InternalAiDsl.g:538:3: ruleVMOverrideElement
                    {
                     before(grammarAccess.getVMNodeEleemntsAccess().getVMOverrideElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVMOverrideElement();

                    state._fsp--;

                     after(grammarAccess.getVMNodeEleemntsAccess().getVMOverrideElementParserRuleCall_4()); 

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


    // $ANTLR start "rule__VMNodeInElement__PolicyAlternatives_1_0"
    // InternalAiDsl.g:547:1: rule__VMNodeInElement__PolicyAlternatives_1_0 : ( ( 'require' ) | ( 'optional' ) );
    public final void rule__VMNodeInElement__PolicyAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:551:1: ( ( 'require' ) | ( 'optional' ) )
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
                    // InternalAiDsl.g:552:2: ( 'require' )
                    {
                    // InternalAiDsl.g:552:2: ( 'require' )
                    // InternalAiDsl.g:553:3: 'require'
                    {
                     before(grammarAccess.getVMNodeInElementAccess().getPolicyRequireKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVMNodeInElementAccess().getPolicyRequireKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:558:2: ( 'optional' )
                    {
                    // InternalAiDsl.g:558:2: ( 'optional' )
                    // InternalAiDsl.g:559:3: 'optional'
                    {
                     before(grammarAccess.getVMNodeInElementAccess().getPolicyOptionalKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVMNodeInElementAccess().getPolicyOptionalKeyword_1_0_1()); 

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
    // $ANTLR end "rule__VMNodeInElement__PolicyAlternatives_1_0"


    // $ANTLR start "rule__VMNodeElement__PolicyAlternatives_0_0"
    // InternalAiDsl.g:568:1: rule__VMNodeElement__PolicyAlternatives_0_0 : ( ( 'require' ) | ( 'optional' ) );
    public final void rule__VMNodeElement__PolicyAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:572:1: ( ( 'require' ) | ( 'optional' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAiDsl.g:573:2: ( 'require' )
                    {
                    // InternalAiDsl.g:573:2: ( 'require' )
                    // InternalAiDsl.g:574:3: 'require'
                    {
                     before(grammarAccess.getVMNodeElementAccess().getPolicyRequireKeyword_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVMNodeElementAccess().getPolicyRequireKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:579:2: ( 'optional' )
                    {
                    // InternalAiDsl.g:579:2: ( 'optional' )
                    // InternalAiDsl.g:580:3: 'optional'
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
    // InternalAiDsl.g:589:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:593:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAiDsl.g:594:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAiDsl.g:601:1: rule__Model__Group__0__Impl : ( ( rule__Model__Package_declarationAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:605:1: ( ( ( rule__Model__Package_declarationAssignment_0 )? ) )
            // InternalAiDsl.g:606:1: ( ( rule__Model__Package_declarationAssignment_0 )? )
            {
            // InternalAiDsl.g:606:1: ( ( rule__Model__Package_declarationAssignment_0 )? )
            // InternalAiDsl.g:607:2: ( rule__Model__Package_declarationAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getPackage_declarationAssignment_0()); 
            // InternalAiDsl.g:608:2: ( rule__Model__Package_declarationAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAiDsl.g:608:3: rule__Model__Package_declarationAssignment_0
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
    // InternalAiDsl.g:616:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:620:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAiDsl.g:621:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAiDsl.g:628:1: rule__Model__Group__1__Impl : ( ( rule__Model__Import_declarationsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:632:1: ( ( ( rule__Model__Import_declarationsAssignment_1 )* ) )
            // InternalAiDsl.g:633:1: ( ( rule__Model__Import_declarationsAssignment_1 )* )
            {
            // InternalAiDsl.g:633:1: ( ( rule__Model__Import_declarationsAssignment_1 )* )
            // InternalAiDsl.g:634:2: ( rule__Model__Import_declarationsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImport_declarationsAssignment_1()); 
            // InternalAiDsl.g:635:2: ( rule__Model__Import_declarationsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAiDsl.g:635:3: rule__Model__Import_declarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Import_declarationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalAiDsl.g:643:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:647:1: ( rule__Model__Group__2__Impl )
            // InternalAiDsl.g:648:2: rule__Model__Group__2__Impl
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
    // InternalAiDsl.g:654:1: rule__Model__Group__2__Impl : ( ( rule__Model__DefinitionsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:658:1: ( ( ( rule__Model__DefinitionsAssignment_2 )* ) )
            // InternalAiDsl.g:659:1: ( ( rule__Model__DefinitionsAssignment_2 )* )
            {
            // InternalAiDsl.g:659:1: ( ( rule__Model__DefinitionsAssignment_2 )* )
            // InternalAiDsl.g:660:2: ( rule__Model__DefinitionsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDefinitionsAssignment_2()); 
            // InternalAiDsl.g:661:2: ( rule__Model__DefinitionsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17||LA8_0==22||LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAiDsl.g:661:3: rule__Model__DefinitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__DefinitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAiDsl.g:670:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:674:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAiDsl.g:675:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAiDsl.g:682:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:686:1: ( ( 'package' ) )
            // InternalAiDsl.g:687:1: ( 'package' )
            {
            // InternalAiDsl.g:687:1: ( 'package' )
            // InternalAiDsl.g:688:2: 'package'
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
    // InternalAiDsl.g:697:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:701:1: ( rule__PackageDeclaration__Group__1__Impl )
            // InternalAiDsl.g:702:2: rule__PackageDeclaration__Group__1__Impl
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
    // InternalAiDsl.g:708:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:712:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAiDsl.g:713:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:713:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAiDsl.g:714:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:715:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAiDsl.g:715:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAiDsl.g:724:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:728:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // InternalAiDsl.g:729:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
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
    // InternalAiDsl.g:736:1: rule__ImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:740:1: ( ( 'import' ) )
            // InternalAiDsl.g:741:1: ( 'import' )
            {
            // InternalAiDsl.g:741:1: ( 'import' )
            // InternalAiDsl.g:742:2: 'import'
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
    // InternalAiDsl.g:751:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:755:1: ( rule__ImportDeclaration__Group__1__Impl )
            // InternalAiDsl.g:756:2: rule__ImportDeclaration__Group__1__Impl
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
    // InternalAiDsl.g:762:1: rule__ImportDeclaration__Group__1__Impl : ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:766:1: ( ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) ) )
            // InternalAiDsl.g:767:1: ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAiDsl.g:767:1: ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) )
            // InternalAiDsl.g:768:2: ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportDeclarationAccess().getImportedNamespaceAssignment_1()); 
            // InternalAiDsl.g:769:2: ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 )
            // InternalAiDsl.g:769:3: rule__ImportDeclaration__ImportedNamespaceAssignment_1
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
    // InternalAiDsl.g:778:1: rule__WorkflowDefinition__Group__0 : rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1 ;
    public final void rule__WorkflowDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:782:1: ( rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1 )
            // InternalAiDsl.g:783:2: rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1
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
    // InternalAiDsl.g:790:1: rule__WorkflowDefinition__Group__0__Impl : ( 'workflow' ) ;
    public final void rule__WorkflowDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:794:1: ( ( 'workflow' ) )
            // InternalAiDsl.g:795:1: ( 'workflow' )
            {
            // InternalAiDsl.g:795:1: ( 'workflow' )
            // InternalAiDsl.g:796:2: 'workflow'
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
    // InternalAiDsl.g:805:1: rule__WorkflowDefinition__Group__1 : rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2 ;
    public final void rule__WorkflowDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:809:1: ( rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2 )
            // InternalAiDsl.g:810:2: rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2
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
    // InternalAiDsl.g:817:1: rule__WorkflowDefinition__Group__1__Impl : ( ( rule__WorkflowDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkflowDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:821:1: ( ( ( rule__WorkflowDefinition__NameAssignment_1 ) ) )
            // InternalAiDsl.g:822:1: ( ( rule__WorkflowDefinition__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:822:1: ( ( rule__WorkflowDefinition__NameAssignment_1 ) )
            // InternalAiDsl.g:823:2: ( rule__WorkflowDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:824:2: ( rule__WorkflowDefinition__NameAssignment_1 )
            // InternalAiDsl.g:824:3: rule__WorkflowDefinition__NameAssignment_1
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
    // InternalAiDsl.g:832:1: rule__WorkflowDefinition__Group__2 : rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3 ;
    public final void rule__WorkflowDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:836:1: ( rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3 )
            // InternalAiDsl.g:837:2: rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3
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
    // InternalAiDsl.g:844:1: rule__WorkflowDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__WorkflowDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:848:1: ( ( '(' ) )
            // InternalAiDsl.g:849:1: ( '(' )
            {
            // InternalAiDsl.g:849:1: ( '(' )
            // InternalAiDsl.g:850:2: '('
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
    // InternalAiDsl.g:859:1: rule__WorkflowDefinition__Group__3 : rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4 ;
    public final void rule__WorkflowDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:863:1: ( rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4 )
            // InternalAiDsl.g:864:2: rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4
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
    // InternalAiDsl.g:871:1: rule__WorkflowDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__WorkflowDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:875:1: ( ( ')' ) )
            // InternalAiDsl.g:876:1: ( ')' )
            {
            // InternalAiDsl.g:876:1: ( ')' )
            // InternalAiDsl.g:877:2: ')'
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
    // InternalAiDsl.g:886:1: rule__WorkflowDefinition__Group__4 : rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5 ;
    public final void rule__WorkflowDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:890:1: ( rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5 )
            // InternalAiDsl.g:891:2: rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5
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
    // InternalAiDsl.g:898:1: rule__WorkflowDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__WorkflowDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:902:1: ( ( '{' ) )
            // InternalAiDsl.g:903:1: ( '{' )
            {
            // InternalAiDsl.g:903:1: ( '{' )
            // InternalAiDsl.g:904:2: '{'
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
    // InternalAiDsl.g:913:1: rule__WorkflowDefinition__Group__5 : rule__WorkflowDefinition__Group__5__Impl ;
    public final void rule__WorkflowDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:917:1: ( rule__WorkflowDefinition__Group__5__Impl )
            // InternalAiDsl.g:918:2: rule__WorkflowDefinition__Group__5__Impl
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
    // InternalAiDsl.g:924:1: rule__WorkflowDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__WorkflowDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:928:1: ( ( '}' ) )
            // InternalAiDsl.g:929:1: ( '}' )
            {
            // InternalAiDsl.g:929:1: ( '}' )
            // InternalAiDsl.g:930:2: '}'
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
    // InternalAiDsl.g:940:1: rule__VMNodeDefinition__Group__0 : rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1 ;
    public final void rule__VMNodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:944:1: ( rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1 )
            // InternalAiDsl.g:945:2: rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1
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
    // InternalAiDsl.g:952:1: rule__VMNodeDefinition__Group__0__Impl : ( 'vmnode' ) ;
    public final void rule__VMNodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:956:1: ( ( 'vmnode' ) )
            // InternalAiDsl.g:957:1: ( 'vmnode' )
            {
            // InternalAiDsl.g:957:1: ( 'vmnode' )
            // InternalAiDsl.g:958:2: 'vmnode'
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
    // InternalAiDsl.g:967:1: rule__VMNodeDefinition__Group__1 : rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2 ;
    public final void rule__VMNodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:971:1: ( rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2 )
            // InternalAiDsl.g:972:2: rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2
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
    // InternalAiDsl.g:979:1: rule__VMNodeDefinition__Group__1__Impl : ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? ) ;
    public final void rule__VMNodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:983:1: ( ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? ) )
            // InternalAiDsl.g:984:1: ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? )
            {
            // InternalAiDsl.g:984:1: ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? )
            // InternalAiDsl.g:985:2: ( rule__VMNodeDefinition__NodetypeAssignment_1 )?
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeAssignment_1()); 
            // InternalAiDsl.g:986:2: ( rule__VMNodeDefinition__NodetypeAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAiDsl.g:986:3: rule__VMNodeDefinition__NodetypeAssignment_1
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
    // InternalAiDsl.g:994:1: rule__VMNodeDefinition__Group__2 : rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3 ;
    public final void rule__VMNodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:998:1: ( rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3 )
            // InternalAiDsl.g:999:2: rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3
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
    // InternalAiDsl.g:1006:1: rule__VMNodeDefinition__Group__2__Impl : ( ( rule__VMNodeDefinition__NameAssignment_2 ) ) ;
    public final void rule__VMNodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1010:1: ( ( ( rule__VMNodeDefinition__NameAssignment_2 ) ) )
            // InternalAiDsl.g:1011:1: ( ( rule__VMNodeDefinition__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:1011:1: ( ( rule__VMNodeDefinition__NameAssignment_2 ) )
            // InternalAiDsl.g:1012:2: ( rule__VMNodeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:1013:2: ( rule__VMNodeDefinition__NameAssignment_2 )
            // InternalAiDsl.g:1013:3: rule__VMNodeDefinition__NameAssignment_2
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
    // InternalAiDsl.g:1021:1: rule__VMNodeDefinition__Group__3 : rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4 ;
    public final void rule__VMNodeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1025:1: ( rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4 )
            // InternalAiDsl.g:1026:2: rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4
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
    // InternalAiDsl.g:1033:1: rule__VMNodeDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__VMNodeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1037:1: ( ( '{' ) )
            // InternalAiDsl.g:1038:1: ( '{' )
            {
            // InternalAiDsl.g:1038:1: ( '{' )
            // InternalAiDsl.g:1039:2: '{'
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
    // InternalAiDsl.g:1048:1: rule__VMNodeDefinition__Group__4 : rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5 ;
    public final void rule__VMNodeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1052:1: ( rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5 )
            // InternalAiDsl.g:1053:2: rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5
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
    // InternalAiDsl.g:1060:1: rule__VMNodeDefinition__Group__4__Impl : ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* ) ;
    public final void rule__VMNodeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1064:1: ( ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* ) )
            // InternalAiDsl.g:1065:1: ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* )
            {
            // InternalAiDsl.g:1065:1: ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* )
            // InternalAiDsl.g:1066:2: ( rule__VMNodeDefinition__ElementsAssignment_4 )*
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getElementsAssignment_4()); 
            // InternalAiDsl.g:1067:2: ( rule__VMNodeDefinition__ElementsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)||(LA10_0>=23 && LA10_0<=24)||LA10_0==26||LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAiDsl.g:1067:3: rule__VMNodeDefinition__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VMNodeDefinition__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalAiDsl.g:1075:1: rule__VMNodeDefinition__Group__5 : rule__VMNodeDefinition__Group__5__Impl ;
    public final void rule__VMNodeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1079:1: ( rule__VMNodeDefinition__Group__5__Impl )
            // InternalAiDsl.g:1080:2: rule__VMNodeDefinition__Group__5__Impl
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
    // InternalAiDsl.g:1086:1: rule__VMNodeDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__VMNodeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1090:1: ( ( '}' ) )
            // InternalAiDsl.g:1091:1: ( '}' )
            {
            // InternalAiDsl.g:1091:1: ( '}' )
            // InternalAiDsl.g:1092:2: '}'
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
    // InternalAiDsl.g:1102:1: rule__VMNodeOpCodeElement__Group__0 : rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1 ;
    public final void rule__VMNodeOpCodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1106:1: ( rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1 )
            // InternalAiDsl.g:1107:2: rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1
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
    // InternalAiDsl.g:1114:1: rule__VMNodeOpCodeElement__Group__0__Impl : ( 'opcode' ) ;
    public final void rule__VMNodeOpCodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1118:1: ( ( 'opcode' ) )
            // InternalAiDsl.g:1119:1: ( 'opcode' )
            {
            // InternalAiDsl.g:1119:1: ( 'opcode' )
            // InternalAiDsl.g:1120:2: 'opcode'
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
    // InternalAiDsl.g:1129:1: rule__VMNodeOpCodeElement__Group__1 : rule__VMNodeOpCodeElement__Group__1__Impl ;
    public final void rule__VMNodeOpCodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1133:1: ( rule__VMNodeOpCodeElement__Group__1__Impl )
            // InternalAiDsl.g:1134:2: rule__VMNodeOpCodeElement__Group__1__Impl
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
    // InternalAiDsl.g:1140:1: rule__VMNodeOpCodeElement__Group__1__Impl : ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) ) ;
    public final void rule__VMNodeOpCodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1144:1: ( ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) ) )
            // InternalAiDsl.g:1145:1: ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) )
            {
            // InternalAiDsl.g:1145:1: ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) )
            // InternalAiDsl.g:1146:2: ( rule__VMNodeOpCodeElement__CodeAssignment_1 )
            {
             before(grammarAccess.getVMNodeOpCodeElementAccess().getCodeAssignment_1()); 
            // InternalAiDsl.g:1147:2: ( rule__VMNodeOpCodeElement__CodeAssignment_1 )
            // InternalAiDsl.g:1147:3: rule__VMNodeOpCodeElement__CodeAssignment_1
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
    // InternalAiDsl.g:1156:1: rule__VMNodeOutElement__Group__0 : rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1 ;
    public final void rule__VMNodeOutElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1160:1: ( rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1 )
            // InternalAiDsl.g:1161:2: rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1
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
    // InternalAiDsl.g:1168:1: rule__VMNodeOutElement__Group__0__Impl : ( 'out' ) ;
    public final void rule__VMNodeOutElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1172:1: ( ( 'out' ) )
            // InternalAiDsl.g:1173:1: ( 'out' )
            {
            // InternalAiDsl.g:1173:1: ( 'out' )
            // InternalAiDsl.g:1174:2: 'out'
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
    // InternalAiDsl.g:1183:1: rule__VMNodeOutElement__Group__1 : rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2 ;
    public final void rule__VMNodeOutElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1187:1: ( rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2 )
            // InternalAiDsl.g:1188:2: rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2
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
    // InternalAiDsl.g:1195:1: rule__VMNodeOutElement__Group__1__Impl : ( ( rule__VMNodeOutElement__NameAssignment_1 ) ) ;
    public final void rule__VMNodeOutElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1199:1: ( ( ( rule__VMNodeOutElement__NameAssignment_1 ) ) )
            // InternalAiDsl.g:1200:1: ( ( rule__VMNodeOutElement__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:1200:1: ( ( rule__VMNodeOutElement__NameAssignment_1 ) )
            // InternalAiDsl.g:1201:2: ( rule__VMNodeOutElement__NameAssignment_1 )
            {
             before(grammarAccess.getVMNodeOutElementAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:1202:2: ( rule__VMNodeOutElement__NameAssignment_1 )
            // InternalAiDsl.g:1202:3: rule__VMNodeOutElement__NameAssignment_1
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
    // InternalAiDsl.g:1210:1: rule__VMNodeOutElement__Group__2 : rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3 ;
    public final void rule__VMNodeOutElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1214:1: ( rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3 )
            // InternalAiDsl.g:1215:2: rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3
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
    // InternalAiDsl.g:1222:1: rule__VMNodeOutElement__Group__2__Impl : ( 'as' ) ;
    public final void rule__VMNodeOutElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1226:1: ( ( 'as' ) )
            // InternalAiDsl.g:1227:1: ( 'as' )
            {
            // InternalAiDsl.g:1227:1: ( 'as' )
            // InternalAiDsl.g:1228:2: 'as'
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
    // InternalAiDsl.g:1237:1: rule__VMNodeOutElement__Group__3 : rule__VMNodeOutElement__Group__3__Impl ;
    public final void rule__VMNodeOutElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1241:1: ( rule__VMNodeOutElement__Group__3__Impl )
            // InternalAiDsl.g:1242:2: rule__VMNodeOutElement__Group__3__Impl
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
    // InternalAiDsl.g:1248:1: rule__VMNodeOutElement__Group__3__Impl : ( ( rule__VMNodeOutElement__TypeAssignment_3 ) ) ;
    public final void rule__VMNodeOutElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1252:1: ( ( ( rule__VMNodeOutElement__TypeAssignment_3 ) ) )
            // InternalAiDsl.g:1253:1: ( ( rule__VMNodeOutElement__TypeAssignment_3 ) )
            {
            // InternalAiDsl.g:1253:1: ( ( rule__VMNodeOutElement__TypeAssignment_3 ) )
            // InternalAiDsl.g:1254:2: ( rule__VMNodeOutElement__TypeAssignment_3 )
            {
             before(grammarAccess.getVMNodeOutElementAccess().getTypeAssignment_3()); 
            // InternalAiDsl.g:1255:2: ( rule__VMNodeOutElement__TypeAssignment_3 )
            // InternalAiDsl.g:1255:3: rule__VMNodeOutElement__TypeAssignment_3
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


    // $ANTLR start "rule__VMNodeInElement__Group__0"
    // InternalAiDsl.g:1264:1: rule__VMNodeInElement__Group__0 : rule__VMNodeInElement__Group__0__Impl rule__VMNodeInElement__Group__1 ;
    public final void rule__VMNodeInElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1268:1: ( rule__VMNodeInElement__Group__0__Impl rule__VMNodeInElement__Group__1 )
            // InternalAiDsl.g:1269:2: rule__VMNodeInElement__Group__0__Impl rule__VMNodeInElement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__VMNodeInElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeInElement__Group__1();

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
    // $ANTLR end "rule__VMNodeInElement__Group__0"


    // $ANTLR start "rule__VMNodeInElement__Group__0__Impl"
    // InternalAiDsl.g:1276:1: rule__VMNodeInElement__Group__0__Impl : ( 'in' ) ;
    public final void rule__VMNodeInElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1280:1: ( ( 'in' ) )
            // InternalAiDsl.g:1281:1: ( 'in' )
            {
            // InternalAiDsl.g:1281:1: ( 'in' )
            // InternalAiDsl.g:1282:2: 'in'
            {
             before(grammarAccess.getVMNodeInElementAccess().getInKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVMNodeInElementAccess().getInKeyword_0()); 

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
    // $ANTLR end "rule__VMNodeInElement__Group__0__Impl"


    // $ANTLR start "rule__VMNodeInElement__Group__1"
    // InternalAiDsl.g:1291:1: rule__VMNodeInElement__Group__1 : rule__VMNodeInElement__Group__1__Impl rule__VMNodeInElement__Group__2 ;
    public final void rule__VMNodeInElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1295:1: ( rule__VMNodeInElement__Group__1__Impl rule__VMNodeInElement__Group__2 )
            // InternalAiDsl.g:1296:2: rule__VMNodeInElement__Group__1__Impl rule__VMNodeInElement__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__VMNodeInElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMNodeInElement__Group__2();

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
    // $ANTLR end "rule__VMNodeInElement__Group__1"


    // $ANTLR start "rule__VMNodeInElement__Group__1__Impl"
    // InternalAiDsl.g:1303:1: rule__VMNodeInElement__Group__1__Impl : ( ( rule__VMNodeInElement__PolicyAssignment_1 )? ) ;
    public final void rule__VMNodeInElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1307:1: ( ( ( rule__VMNodeInElement__PolicyAssignment_1 )? ) )
            // InternalAiDsl.g:1308:1: ( ( rule__VMNodeInElement__PolicyAssignment_1 )? )
            {
            // InternalAiDsl.g:1308:1: ( ( rule__VMNodeInElement__PolicyAssignment_1 )? )
            // InternalAiDsl.g:1309:2: ( rule__VMNodeInElement__PolicyAssignment_1 )?
            {
             before(grammarAccess.getVMNodeInElementAccess().getPolicyAssignment_1()); 
            // InternalAiDsl.g:1310:2: ( rule__VMNodeInElement__PolicyAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=13 && LA11_0<=14)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAiDsl.g:1310:3: rule__VMNodeInElement__PolicyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VMNodeInElement__PolicyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVMNodeInElementAccess().getPolicyAssignment_1()); 

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
    // $ANTLR end "rule__VMNodeInElement__Group__1__Impl"


    // $ANTLR start "rule__VMNodeInElement__Group__2"
    // InternalAiDsl.g:1318:1: rule__VMNodeInElement__Group__2 : rule__VMNodeInElement__Group__2__Impl ;
    public final void rule__VMNodeInElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1322:1: ( rule__VMNodeInElement__Group__2__Impl )
            // InternalAiDsl.g:1323:2: rule__VMNodeInElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeInElement__Group__2__Impl();

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
    // $ANTLR end "rule__VMNodeInElement__Group__2"


    // $ANTLR start "rule__VMNodeInElement__Group__2__Impl"
    // InternalAiDsl.g:1329:1: rule__VMNodeInElement__Group__2__Impl : ( ( rule__VMNodeInElement__NameAssignment_2 ) ) ;
    public final void rule__VMNodeInElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1333:1: ( ( ( rule__VMNodeInElement__NameAssignment_2 ) ) )
            // InternalAiDsl.g:1334:1: ( ( rule__VMNodeInElement__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:1334:1: ( ( rule__VMNodeInElement__NameAssignment_2 ) )
            // InternalAiDsl.g:1335:2: ( rule__VMNodeInElement__NameAssignment_2 )
            {
             before(grammarAccess.getVMNodeInElementAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:1336:2: ( rule__VMNodeInElement__NameAssignment_2 )
            // InternalAiDsl.g:1336:3: rule__VMNodeInElement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeInElement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeInElementAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__VMNodeInElement__Group__2__Impl"


    // $ANTLR start "rule__VMNodeElement__Group__0"
    // InternalAiDsl.g:1345:1: rule__VMNodeElement__Group__0 : rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1 ;
    public final void rule__VMNodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1349:1: ( rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1 )
            // InternalAiDsl.g:1350:2: rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1
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
    // InternalAiDsl.g:1357:1: rule__VMNodeElement__Group__0__Impl : ( ( rule__VMNodeElement__PolicyAssignment_0 ) ) ;
    public final void rule__VMNodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1361:1: ( ( ( rule__VMNodeElement__PolicyAssignment_0 ) ) )
            // InternalAiDsl.g:1362:1: ( ( rule__VMNodeElement__PolicyAssignment_0 ) )
            {
            // InternalAiDsl.g:1362:1: ( ( rule__VMNodeElement__PolicyAssignment_0 ) )
            // InternalAiDsl.g:1363:2: ( rule__VMNodeElement__PolicyAssignment_0 )
            {
             before(grammarAccess.getVMNodeElementAccess().getPolicyAssignment_0()); 
            // InternalAiDsl.g:1364:2: ( rule__VMNodeElement__PolicyAssignment_0 )
            // InternalAiDsl.g:1364:3: rule__VMNodeElement__PolicyAssignment_0
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
    // InternalAiDsl.g:1372:1: rule__VMNodeElement__Group__1 : rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2 ;
    public final void rule__VMNodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1376:1: ( rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2 )
            // InternalAiDsl.g:1377:2: rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2
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
    // InternalAiDsl.g:1384:1: rule__VMNodeElement__Group__1__Impl : ( ( rule__VMNodeElement__TypeAssignment_1 ) ) ;
    public final void rule__VMNodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1388:1: ( ( ( rule__VMNodeElement__TypeAssignment_1 ) ) )
            // InternalAiDsl.g:1389:1: ( ( rule__VMNodeElement__TypeAssignment_1 ) )
            {
            // InternalAiDsl.g:1389:1: ( ( rule__VMNodeElement__TypeAssignment_1 ) )
            // InternalAiDsl.g:1390:2: ( rule__VMNodeElement__TypeAssignment_1 )
            {
             before(grammarAccess.getVMNodeElementAccess().getTypeAssignment_1()); 
            // InternalAiDsl.g:1391:2: ( rule__VMNodeElement__TypeAssignment_1 )
            // InternalAiDsl.g:1391:3: rule__VMNodeElement__TypeAssignment_1
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
    // InternalAiDsl.g:1399:1: rule__VMNodeElement__Group__2 : rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3 ;
    public final void rule__VMNodeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1403:1: ( rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3 )
            // InternalAiDsl.g:1404:2: rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalAiDsl.g:1411:1: rule__VMNodeElement__Group__2__Impl : ( ( rule__VMNodeElement__NameAssignment_2 ) ) ;
    public final void rule__VMNodeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1415:1: ( ( ( rule__VMNodeElement__NameAssignment_2 ) ) )
            // InternalAiDsl.g:1416:1: ( ( rule__VMNodeElement__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:1416:1: ( ( rule__VMNodeElement__NameAssignment_2 ) )
            // InternalAiDsl.g:1417:2: ( rule__VMNodeElement__NameAssignment_2 )
            {
             before(grammarAccess.getVMNodeElementAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:1418:2: ( rule__VMNodeElement__NameAssignment_2 )
            // InternalAiDsl.g:1418:3: rule__VMNodeElement__NameAssignment_2
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
    // InternalAiDsl.g:1426:1: rule__VMNodeElement__Group__3 : rule__VMNodeElement__Group__3__Impl ;
    public final void rule__VMNodeElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1430:1: ( rule__VMNodeElement__Group__3__Impl )
            // InternalAiDsl.g:1431:2: rule__VMNodeElement__Group__3__Impl
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
    // InternalAiDsl.g:1437:1: rule__VMNodeElement__Group__3__Impl : ( ( rule__VMNodeElement__Group_3__0 )? ) ;
    public final void rule__VMNodeElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1441:1: ( ( ( rule__VMNodeElement__Group_3__0 )? ) )
            // InternalAiDsl.g:1442:1: ( ( rule__VMNodeElement__Group_3__0 )? )
            {
            // InternalAiDsl.g:1442:1: ( ( rule__VMNodeElement__Group_3__0 )? )
            // InternalAiDsl.g:1443:2: ( rule__VMNodeElement__Group_3__0 )?
            {
             before(grammarAccess.getVMNodeElementAccess().getGroup_3()); 
            // InternalAiDsl.g:1444:2: ( rule__VMNodeElement__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAiDsl.g:1444:3: rule__VMNodeElement__Group_3__0
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
    // InternalAiDsl.g:1453:1: rule__VMNodeElement__Group_3__0 : rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1 ;
    public final void rule__VMNodeElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1457:1: ( rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1 )
            // InternalAiDsl.g:1458:2: rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1
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
    // InternalAiDsl.g:1465:1: rule__VMNodeElement__Group_3__0__Impl : ( 'default' ) ;
    public final void rule__VMNodeElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1469:1: ( ( 'default' ) )
            // InternalAiDsl.g:1470:1: ( 'default' )
            {
            // InternalAiDsl.g:1470:1: ( 'default' )
            // InternalAiDsl.g:1471:2: 'default'
            {
             before(grammarAccess.getVMNodeElementAccess().getDefaultKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAiDsl.g:1480:1: rule__VMNodeElement__Group_3__1 : rule__VMNodeElement__Group_3__1__Impl ;
    public final void rule__VMNodeElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1484:1: ( rule__VMNodeElement__Group_3__1__Impl )
            // InternalAiDsl.g:1485:2: rule__VMNodeElement__Group_3__1__Impl
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
    // InternalAiDsl.g:1491:1: rule__VMNodeElement__Group_3__1__Impl : ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) ) ;
    public final void rule__VMNodeElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1495:1: ( ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) ) )
            // InternalAiDsl.g:1496:1: ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) )
            {
            // InternalAiDsl.g:1496:1: ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) )
            // InternalAiDsl.g:1497:2: ( rule__VMNodeElement__DefaultvalueAssignment_3_1 )
            {
             before(grammarAccess.getVMNodeElementAccess().getDefaultvalueAssignment_3_1()); 
            // InternalAiDsl.g:1498:2: ( rule__VMNodeElement__DefaultvalueAssignment_3_1 )
            // InternalAiDsl.g:1498:3: rule__VMNodeElement__DefaultvalueAssignment_3_1
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


    // $ANTLR start "rule__VMOverrideElement__Group__0"
    // InternalAiDsl.g:1507:1: rule__VMOverrideElement__Group__0 : rule__VMOverrideElement__Group__0__Impl rule__VMOverrideElement__Group__1 ;
    public final void rule__VMOverrideElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1511:1: ( rule__VMOverrideElement__Group__0__Impl rule__VMOverrideElement__Group__1 )
            // InternalAiDsl.g:1512:2: rule__VMOverrideElement__Group__0__Impl rule__VMOverrideElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VMOverrideElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__Group__1();

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
    // $ANTLR end "rule__VMOverrideElement__Group__0"


    // $ANTLR start "rule__VMOverrideElement__Group__0__Impl"
    // InternalAiDsl.g:1519:1: rule__VMOverrideElement__Group__0__Impl : ( ( rule__VMOverrideElement__PolicyAssignment_0 ) ) ;
    public final void rule__VMOverrideElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1523:1: ( ( ( rule__VMOverrideElement__PolicyAssignment_0 ) ) )
            // InternalAiDsl.g:1524:1: ( ( rule__VMOverrideElement__PolicyAssignment_0 ) )
            {
            // InternalAiDsl.g:1524:1: ( ( rule__VMOverrideElement__PolicyAssignment_0 ) )
            // InternalAiDsl.g:1525:2: ( rule__VMOverrideElement__PolicyAssignment_0 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getPolicyAssignment_0()); 
            // InternalAiDsl.g:1526:2: ( rule__VMOverrideElement__PolicyAssignment_0 )
            // InternalAiDsl.g:1526:3: rule__VMOverrideElement__PolicyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__PolicyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVMOverrideElementAccess().getPolicyAssignment_0()); 

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
    // $ANTLR end "rule__VMOverrideElement__Group__0__Impl"


    // $ANTLR start "rule__VMOverrideElement__Group__1"
    // InternalAiDsl.g:1534:1: rule__VMOverrideElement__Group__1 : rule__VMOverrideElement__Group__1__Impl rule__VMOverrideElement__Group__2 ;
    public final void rule__VMOverrideElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1538:1: ( rule__VMOverrideElement__Group__1__Impl rule__VMOverrideElement__Group__2 )
            // InternalAiDsl.g:1539:2: rule__VMOverrideElement__Group__1__Impl rule__VMOverrideElement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__VMOverrideElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__Group__2();

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
    // $ANTLR end "rule__VMOverrideElement__Group__1"


    // $ANTLR start "rule__VMOverrideElement__Group__1__Impl"
    // InternalAiDsl.g:1546:1: rule__VMOverrideElement__Group__1__Impl : ( ( rule__VMOverrideElement__TypeAssignment_1 ) ) ;
    public final void rule__VMOverrideElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1550:1: ( ( ( rule__VMOverrideElement__TypeAssignment_1 ) ) )
            // InternalAiDsl.g:1551:1: ( ( rule__VMOverrideElement__TypeAssignment_1 ) )
            {
            // InternalAiDsl.g:1551:1: ( ( rule__VMOverrideElement__TypeAssignment_1 ) )
            // InternalAiDsl.g:1552:2: ( rule__VMOverrideElement__TypeAssignment_1 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getTypeAssignment_1()); 
            // InternalAiDsl.g:1553:2: ( rule__VMOverrideElement__TypeAssignment_1 )
            // InternalAiDsl.g:1553:3: rule__VMOverrideElement__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVMOverrideElementAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__VMOverrideElement__Group__1__Impl"


    // $ANTLR start "rule__VMOverrideElement__Group__2"
    // InternalAiDsl.g:1561:1: rule__VMOverrideElement__Group__2 : rule__VMOverrideElement__Group__2__Impl rule__VMOverrideElement__Group__3 ;
    public final void rule__VMOverrideElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1565:1: ( rule__VMOverrideElement__Group__2__Impl rule__VMOverrideElement__Group__3 )
            // InternalAiDsl.g:1566:2: rule__VMOverrideElement__Group__2__Impl rule__VMOverrideElement__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__VMOverrideElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__Group__3();

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
    // $ANTLR end "rule__VMOverrideElement__Group__2"


    // $ANTLR start "rule__VMOverrideElement__Group__2__Impl"
    // InternalAiDsl.g:1573:1: rule__VMOverrideElement__Group__2__Impl : ( ( rule__VMOverrideElement__NameAssignment_2 ) ) ;
    public final void rule__VMOverrideElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1577:1: ( ( ( rule__VMOverrideElement__NameAssignment_2 ) ) )
            // InternalAiDsl.g:1578:1: ( ( rule__VMOverrideElement__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:1578:1: ( ( rule__VMOverrideElement__NameAssignment_2 ) )
            // InternalAiDsl.g:1579:2: ( rule__VMOverrideElement__NameAssignment_2 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:1580:2: ( rule__VMOverrideElement__NameAssignment_2 )
            // InternalAiDsl.g:1580:3: rule__VMOverrideElement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVMOverrideElementAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__VMOverrideElement__Group__2__Impl"


    // $ANTLR start "rule__VMOverrideElement__Group__3"
    // InternalAiDsl.g:1588:1: rule__VMOverrideElement__Group__3 : rule__VMOverrideElement__Group__3__Impl rule__VMOverrideElement__Group__4 ;
    public final void rule__VMOverrideElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1592:1: ( rule__VMOverrideElement__Group__3__Impl rule__VMOverrideElement__Group__4 )
            // InternalAiDsl.g:1593:2: rule__VMOverrideElement__Group__3__Impl rule__VMOverrideElement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__VMOverrideElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__Group__4();

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
    // $ANTLR end "rule__VMOverrideElement__Group__3"


    // $ANTLR start "rule__VMOverrideElement__Group__3__Impl"
    // InternalAiDsl.g:1600:1: rule__VMOverrideElement__Group__3__Impl : ( ':=' ) ;
    public final void rule__VMOverrideElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1604:1: ( ( ':=' ) )
            // InternalAiDsl.g:1605:1: ( ':=' )
            {
            // InternalAiDsl.g:1605:1: ( ':=' )
            // InternalAiDsl.g:1606:2: ':='
            {
             before(grammarAccess.getVMOverrideElementAccess().getColonEqualsSignKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVMOverrideElementAccess().getColonEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__VMOverrideElement__Group__3__Impl"


    // $ANTLR start "rule__VMOverrideElement__Group__4"
    // InternalAiDsl.g:1615:1: rule__VMOverrideElement__Group__4 : rule__VMOverrideElement__Group__4__Impl ;
    public final void rule__VMOverrideElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1619:1: ( rule__VMOverrideElement__Group__4__Impl )
            // InternalAiDsl.g:1620:2: rule__VMOverrideElement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__Group__4__Impl();

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
    // $ANTLR end "rule__VMOverrideElement__Group__4"


    // $ANTLR start "rule__VMOverrideElement__Group__4__Impl"
    // InternalAiDsl.g:1626:1: rule__VMOverrideElement__Group__4__Impl : ( ( rule__VMOverrideElement__DefaultvalueAssignment_4 ) ) ;
    public final void rule__VMOverrideElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1630:1: ( ( ( rule__VMOverrideElement__DefaultvalueAssignment_4 ) ) )
            // InternalAiDsl.g:1631:1: ( ( rule__VMOverrideElement__DefaultvalueAssignment_4 ) )
            {
            // InternalAiDsl.g:1631:1: ( ( rule__VMOverrideElement__DefaultvalueAssignment_4 ) )
            // InternalAiDsl.g:1632:2: ( rule__VMOverrideElement__DefaultvalueAssignment_4 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getDefaultvalueAssignment_4()); 
            // InternalAiDsl.g:1633:2: ( rule__VMOverrideElement__DefaultvalueAssignment_4 )
            // InternalAiDsl.g:1633:3: rule__VMOverrideElement__DefaultvalueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VMOverrideElement__DefaultvalueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVMOverrideElementAccess().getDefaultvalueAssignment_4()); 

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
    // $ANTLR end "rule__VMOverrideElement__Group__4__Impl"


    // $ANTLR start "rule__LlmTaskDefinition__Group__0"
    // InternalAiDsl.g:1642:1: rule__LlmTaskDefinition__Group__0 : rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1 ;
    public final void rule__LlmTaskDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1646:1: ( rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1 )
            // InternalAiDsl.g:1647:2: rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1
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
    // InternalAiDsl.g:1654:1: rule__LlmTaskDefinition__Group__0__Impl : ( 'llmtask' ) ;
    public final void rule__LlmTaskDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1658:1: ( ( 'llmtask' ) )
            // InternalAiDsl.g:1659:1: ( 'llmtask' )
            {
            // InternalAiDsl.g:1659:1: ( 'llmtask' )
            // InternalAiDsl.g:1660:2: 'llmtask'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getLlmtaskKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAiDsl.g:1669:1: rule__LlmTaskDefinition__Group__1 : rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2 ;
    public final void rule__LlmTaskDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1673:1: ( rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2 )
            // InternalAiDsl.g:1674:2: rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2
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
    // InternalAiDsl.g:1681:1: rule__LlmTaskDefinition__Group__1__Impl : ( ( rule__LlmTaskDefinition__NameAssignment_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1685:1: ( ( ( rule__LlmTaskDefinition__NameAssignment_1 ) ) )
            // InternalAiDsl.g:1686:1: ( ( rule__LlmTaskDefinition__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:1686:1: ( ( rule__LlmTaskDefinition__NameAssignment_1 ) )
            // InternalAiDsl.g:1687:2: ( rule__LlmTaskDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:1688:2: ( rule__LlmTaskDefinition__NameAssignment_1 )
            // InternalAiDsl.g:1688:3: rule__LlmTaskDefinition__NameAssignment_1
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
    // InternalAiDsl.g:1696:1: rule__LlmTaskDefinition__Group__2 : rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3 ;
    public final void rule__LlmTaskDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1700:1: ( rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3 )
            // InternalAiDsl.g:1701:2: rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3
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
    // InternalAiDsl.g:1708:1: rule__LlmTaskDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__LlmTaskDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1712:1: ( ( '(' ) )
            // InternalAiDsl.g:1713:1: ( '(' )
            {
            // InternalAiDsl.g:1713:1: ( '(' )
            // InternalAiDsl.g:1714:2: '('
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
    // InternalAiDsl.g:1723:1: rule__LlmTaskDefinition__Group__3 : rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4 ;
    public final void rule__LlmTaskDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1727:1: ( rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4 )
            // InternalAiDsl.g:1728:2: rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalAiDsl.g:1735:1: rule__LlmTaskDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__LlmTaskDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1739:1: ( ( ')' ) )
            // InternalAiDsl.g:1740:1: ( ')' )
            {
            // InternalAiDsl.g:1740:1: ( ')' )
            // InternalAiDsl.g:1741:2: ')'
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
    // InternalAiDsl.g:1750:1: rule__LlmTaskDefinition__Group__4 : rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5 ;
    public final void rule__LlmTaskDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1754:1: ( rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5 )
            // InternalAiDsl.g:1755:2: rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalAiDsl.g:1762:1: rule__LlmTaskDefinition__Group__4__Impl : ( ( rule__LlmTaskDefinition__Group_4__0 )? ) ;
    public final void rule__LlmTaskDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1766:1: ( ( ( rule__LlmTaskDefinition__Group_4__0 )? ) )
            // InternalAiDsl.g:1767:1: ( ( rule__LlmTaskDefinition__Group_4__0 )? )
            {
            // InternalAiDsl.g:1767:1: ( ( rule__LlmTaskDefinition__Group_4__0 )? )
            // InternalAiDsl.g:1768:2: ( rule__LlmTaskDefinition__Group_4__0 )?
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup_4()); 
            // InternalAiDsl.g:1769:2: ( rule__LlmTaskDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAiDsl.g:1769:3: rule__LlmTaskDefinition__Group_4__0
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
    // InternalAiDsl.g:1777:1: rule__LlmTaskDefinition__Group__5 : rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6 ;
    public final void rule__LlmTaskDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1781:1: ( rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6 )
            // InternalAiDsl.g:1782:2: rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalAiDsl.g:1789:1: rule__LlmTaskDefinition__Group__5__Impl : ( '{' ) ;
    public final void rule__LlmTaskDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1793:1: ( ( '{' ) )
            // InternalAiDsl.g:1794:1: ( '{' )
            {
            // InternalAiDsl.g:1794:1: ( '{' )
            // InternalAiDsl.g:1795:2: '{'
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
    // InternalAiDsl.g:1804:1: rule__LlmTaskDefinition__Group__6 : rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7 ;
    public final void rule__LlmTaskDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1808:1: ( rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7 )
            // InternalAiDsl.g:1809:2: rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalAiDsl.g:1816:1: rule__LlmTaskDefinition__Group__6__Impl : ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* ) ;
    public final void rule__LlmTaskDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1820:1: ( ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* ) )
            // InternalAiDsl.g:1821:1: ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* )
            {
            // InternalAiDsl.g:1821:1: ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* )
            // InternalAiDsl.g:1822:2: ( rule__LlmTaskDefinition__AssignmentAssignment_6 )*
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentAssignment_6()); 
            // InternalAiDsl.g:1823:2: ( rule__LlmTaskDefinition__AssignmentAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAiDsl.g:1823:3: rule__LlmTaskDefinition__AssignmentAssignment_6
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__LlmTaskDefinition__AssignmentAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalAiDsl.g:1831:1: rule__LlmTaskDefinition__Group__7 : rule__LlmTaskDefinition__Group__7__Impl ;
    public final void rule__LlmTaskDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1835:1: ( rule__LlmTaskDefinition__Group__7__Impl )
            // InternalAiDsl.g:1836:2: rule__LlmTaskDefinition__Group__7__Impl
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
    // InternalAiDsl.g:1842:1: rule__LlmTaskDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__LlmTaskDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1846:1: ( ( '}' ) )
            // InternalAiDsl.g:1847:1: ( '}' )
            {
            // InternalAiDsl.g:1847:1: ( '}' )
            // InternalAiDsl.g:1848:2: '}'
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
    // InternalAiDsl.g:1858:1: rule__LlmTaskDefinition__Group_4__0 : rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1 ;
    public final void rule__LlmTaskDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1862:1: ( rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1 )
            // InternalAiDsl.g:1863:2: rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAiDsl.g:1870:1: rule__LlmTaskDefinition__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__LlmTaskDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1874:1: ( ( 'implements' ) )
            // InternalAiDsl.g:1875:1: ( 'implements' )
            {
            // InternalAiDsl.g:1875:1: ( 'implements' )
            // InternalAiDsl.g:1876:2: 'implements'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getImplementsKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAiDsl.g:1885:1: rule__LlmTaskDefinition__Group_4__1 : rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2 ;
    public final void rule__LlmTaskDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1889:1: ( rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2 )
            // InternalAiDsl.g:1890:2: rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalAiDsl.g:1897:1: rule__LlmTaskDefinition__Group_4__1__Impl : ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1901:1: ( ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) ) )
            // InternalAiDsl.g:1902:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) )
            {
            // InternalAiDsl.g:1902:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) )
            // InternalAiDsl.g:1903:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAssignment_4_1()); 
            // InternalAiDsl.g:1904:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 )
            // InternalAiDsl.g:1904:3: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1
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
    // InternalAiDsl.g:1912:1: rule__LlmTaskDefinition__Group_4__2 : rule__LlmTaskDefinition__Group_4__2__Impl ;
    public final void rule__LlmTaskDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1916:1: ( rule__LlmTaskDefinition__Group_4__2__Impl )
            // InternalAiDsl.g:1917:2: rule__LlmTaskDefinition__Group_4__2__Impl
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
    // InternalAiDsl.g:1923:1: rule__LlmTaskDefinition__Group_4__2__Impl : ( ( rule__LlmTaskDefinition__Group_4_2__0 )* ) ;
    public final void rule__LlmTaskDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1927:1: ( ( ( rule__LlmTaskDefinition__Group_4_2__0 )* ) )
            // InternalAiDsl.g:1928:1: ( ( rule__LlmTaskDefinition__Group_4_2__0 )* )
            {
            // InternalAiDsl.g:1928:1: ( ( rule__LlmTaskDefinition__Group_4_2__0 )* )
            // InternalAiDsl.g:1929:2: ( rule__LlmTaskDefinition__Group_4_2__0 )*
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup_4_2()); 
            // InternalAiDsl.g:1930:2: ( rule__LlmTaskDefinition__Group_4_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAiDsl.g:1930:3: rule__LlmTaskDefinition__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__LlmTaskDefinition__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalAiDsl.g:1939:1: rule__LlmTaskDefinition__Group_4_2__0 : rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1 ;
    public final void rule__LlmTaskDefinition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1943:1: ( rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1 )
            // InternalAiDsl.g:1944:2: rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAiDsl.g:1951:1: rule__LlmTaskDefinition__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__LlmTaskDefinition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1955:1: ( ( ',' ) )
            // InternalAiDsl.g:1956:1: ( ',' )
            {
            // InternalAiDsl.g:1956:1: ( ',' )
            // InternalAiDsl.g:1957:2: ','
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getCommaKeyword_4_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAiDsl.g:1966:1: rule__LlmTaskDefinition__Group_4_2__1 : rule__LlmTaskDefinition__Group_4_2__1__Impl ;
    public final void rule__LlmTaskDefinition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1970:1: ( rule__LlmTaskDefinition__Group_4_2__1__Impl )
            // InternalAiDsl.g:1971:2: rule__LlmTaskDefinition__Group_4_2__1__Impl
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
    // InternalAiDsl.g:1977:1: rule__LlmTaskDefinition__Group_4_2__1__Impl : ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1981:1: ( ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) ) )
            // InternalAiDsl.g:1982:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) )
            {
            // InternalAiDsl.g:1982:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) )
            // InternalAiDsl.g:1983:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAssignment_4_2_1()); 
            // InternalAiDsl.g:1984:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 )
            // InternalAiDsl.g:1984:3: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1
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
    // InternalAiDsl.g:1993:1: rule__AnnotationInterfaceReference__Group__0 : rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1 ;
    public final void rule__AnnotationInterfaceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1997:1: ( rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1 )
            // InternalAiDsl.g:1998:2: rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1
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
    // InternalAiDsl.g:2005:1: rule__AnnotationInterfaceReference__Group__0__Impl : ( '@' ) ;
    public final void rule__AnnotationInterfaceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2009:1: ( ( '@' ) )
            // InternalAiDsl.g:2010:1: ( '@' )
            {
            // InternalAiDsl.g:2010:1: ( '@' )
            // InternalAiDsl.g:2011:2: '@'
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getCommercialAtKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAiDsl.g:2020:1: rule__AnnotationInterfaceReference__Group__1 : rule__AnnotationInterfaceReference__Group__1__Impl ;
    public final void rule__AnnotationInterfaceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2024:1: ( rule__AnnotationInterfaceReference__Group__1__Impl )
            // InternalAiDsl.g:2025:2: rule__AnnotationInterfaceReference__Group__1__Impl
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
    // InternalAiDsl.g:2031:1: rule__AnnotationInterfaceReference__Group__1__Impl : ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) ) ;
    public final void rule__AnnotationInterfaceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2035:1: ( ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) ) )
            // InternalAiDsl.g:2036:1: ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:2036:1: ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) )
            // InternalAiDsl.g:2037:2: ( rule__AnnotationInterfaceReference__NameAssignment_1 )
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:2038:2: ( rule__AnnotationInterfaceReference__NameAssignment_1 )
            // InternalAiDsl.g:2038:3: rule__AnnotationInterfaceReference__NameAssignment_1
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
    // InternalAiDsl.g:2047:1: rule__LlmVariableAssignment__Group__0 : rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1 ;
    public final void rule__LlmVariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2051:1: ( rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1 )
            // InternalAiDsl.g:2052:2: rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalAiDsl.g:2059:1: rule__LlmVariableAssignment__Group__0__Impl : ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) ) ;
    public final void rule__LlmVariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2063:1: ( ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) ) )
            // InternalAiDsl.g:2064:1: ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) )
            {
            // InternalAiDsl.g:2064:1: ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) )
            // InternalAiDsl.g:2065:2: ( rule__LlmVariableAssignment__VariablenameAssignment_0 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getVariablenameAssignment_0()); 
            // InternalAiDsl.g:2066:2: ( rule__LlmVariableAssignment__VariablenameAssignment_0 )
            // InternalAiDsl.g:2066:3: rule__LlmVariableAssignment__VariablenameAssignment_0
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
    // InternalAiDsl.g:2074:1: rule__LlmVariableAssignment__Group__1 : rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2 ;
    public final void rule__LlmVariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2078:1: ( rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2 )
            // InternalAiDsl.g:2079:2: rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2
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
    // InternalAiDsl.g:2086:1: rule__LlmVariableAssignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__LlmVariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2090:1: ( ( ':=' ) )
            // InternalAiDsl.g:2091:1: ( ':=' )
            {
            // InternalAiDsl.g:2091:1: ( ':=' )
            // InternalAiDsl.g:2092:2: ':='
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getColonEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAiDsl.g:2101:1: rule__LlmVariableAssignment__Group__2 : rule__LlmVariableAssignment__Group__2__Impl ;
    public final void rule__LlmVariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2105:1: ( rule__LlmVariableAssignment__Group__2__Impl )
            // InternalAiDsl.g:2106:2: rule__LlmVariableAssignment__Group__2__Impl
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
    // InternalAiDsl.g:2112:1: rule__LlmVariableAssignment__Group__2__Impl : ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) ) ;
    public final void rule__LlmVariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2116:1: ( ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) ) )
            // InternalAiDsl.g:2117:1: ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) )
            {
            // InternalAiDsl.g:2117:1: ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) )
            // InternalAiDsl.g:2118:2: ( rule__LlmVariableAssignment__TemplateAssignment_2 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getTemplateAssignment_2()); 
            // InternalAiDsl.g:2119:2: ( rule__LlmVariableAssignment__TemplateAssignment_2 )
            // InternalAiDsl.g:2119:3: rule__LlmVariableAssignment__TemplateAssignment_2
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
    // InternalAiDsl.g:2128:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2132:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAiDsl.g:2133:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAiDsl.g:2140:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2144:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2145:1: ( RULE_ID )
            {
            // InternalAiDsl.g:2145:1: ( RULE_ID )
            // InternalAiDsl.g:2146:2: RULE_ID
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
    // InternalAiDsl.g:2155:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2159:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAiDsl.g:2160:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAiDsl.g:2166:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2170:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAiDsl.g:2171:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAiDsl.g:2171:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAiDsl.g:2172:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAiDsl.g:2173:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAiDsl.g:2173:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAiDsl.g:2182:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2186:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAiDsl.g:2187:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAiDsl.g:2194:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2198:1: ( ( '.' ) )
            // InternalAiDsl.g:2199:1: ( '.' )
            {
            // InternalAiDsl.g:2199:1: ( '.' )
            // InternalAiDsl.g:2200:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAiDsl.g:2209:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2213:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAiDsl.g:2214:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAiDsl.g:2220:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2224:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2225:1: ( RULE_ID )
            {
            // InternalAiDsl.g:2225:1: ( RULE_ID )
            // InternalAiDsl.g:2226:2: RULE_ID
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
    // InternalAiDsl.g:2236:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2240:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAiDsl.g:2241:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAiDsl.g:2248:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2252:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2253:1: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2253:1: ( ruleQualifiedName )
            // InternalAiDsl.g:2254:2: ruleQualifiedName
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
    // InternalAiDsl.g:2263:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2267:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAiDsl.g:2268:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAiDsl.g:2274:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2278:1: ( ( ( '.*' )? ) )
            // InternalAiDsl.g:2279:1: ( ( '.*' )? )
            {
            // InternalAiDsl.g:2279:1: ( ( '.*' )? )
            // InternalAiDsl.g:2280:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAiDsl.g:2281:2: ( '.*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAiDsl.g:2281:3: '.*'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalAiDsl.g:2290:1: rule__Model__Package_declarationAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__Model__Package_declarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2294:1: ( ( rulePackageDeclaration ) )
            // InternalAiDsl.g:2295:2: ( rulePackageDeclaration )
            {
            // InternalAiDsl.g:2295:2: ( rulePackageDeclaration )
            // InternalAiDsl.g:2296:3: rulePackageDeclaration
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
    // InternalAiDsl.g:2305:1: rule__Model__Import_declarationsAssignment_1 : ( ruleImportDeclaration ) ;
    public final void rule__Model__Import_declarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2309:1: ( ( ruleImportDeclaration ) )
            // InternalAiDsl.g:2310:2: ( ruleImportDeclaration )
            {
            // InternalAiDsl.g:2310:2: ( ruleImportDeclaration )
            // InternalAiDsl.g:2311:3: ruleImportDeclaration
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
    // InternalAiDsl.g:2320:1: rule__Model__DefinitionsAssignment_2 : ( ( rule__Model__DefinitionsAlternatives_2_0 ) ) ;
    public final void rule__Model__DefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2324:1: ( ( ( rule__Model__DefinitionsAlternatives_2_0 ) ) )
            // InternalAiDsl.g:2325:2: ( ( rule__Model__DefinitionsAlternatives_2_0 ) )
            {
            // InternalAiDsl.g:2325:2: ( ( rule__Model__DefinitionsAlternatives_2_0 ) )
            // InternalAiDsl.g:2326:3: ( rule__Model__DefinitionsAlternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getDefinitionsAlternatives_2_0()); 
            // InternalAiDsl.g:2327:3: ( rule__Model__DefinitionsAlternatives_2_0 )
            // InternalAiDsl.g:2327:4: rule__Model__DefinitionsAlternatives_2_0
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
    // InternalAiDsl.g:2335:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2339:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2340:2: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2340:2: ( ruleQualifiedName )
            // InternalAiDsl.g:2341:3: ruleQualifiedName
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
    // InternalAiDsl.g:2350:1: rule__ImportDeclaration__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__ImportDeclaration__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2354:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAiDsl.g:2355:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAiDsl.g:2355:2: ( ruleQualifiedNameWithWildcard )
            // InternalAiDsl.g:2356:3: ruleQualifiedNameWithWildcard
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
    // InternalAiDsl.g:2365:1: rule__WorkflowDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkflowDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2369:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2370:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2370:2: ( RULE_ID )
            // InternalAiDsl.g:2371:3: RULE_ID
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
    // InternalAiDsl.g:2380:1: rule__VMNodeDefinition__NodetypeAssignment_1 : ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) ) ;
    public final void rule__VMNodeDefinition__NodetypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2384:1: ( ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) ) )
            // InternalAiDsl.g:2385:2: ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) )
            {
            // InternalAiDsl.g:2385:2: ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) )
            // InternalAiDsl.g:2386:3: ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 )
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeAlternatives_1_0()); 
            // InternalAiDsl.g:2387:3: ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 )
            // InternalAiDsl.g:2387:4: rule__VMNodeDefinition__NodetypeAlternatives_1_0
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
    // InternalAiDsl.g:2395:1: rule__VMNodeDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VMNodeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2399:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2400:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2400:2: ( RULE_ID )
            // InternalAiDsl.g:2401:3: RULE_ID
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
    // InternalAiDsl.g:2410:1: rule__VMNodeDefinition__ElementsAssignment_4 : ( ruleVMNodeEleemnts ) ;
    public final void rule__VMNodeDefinition__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2414:1: ( ( ruleVMNodeEleemnts ) )
            // InternalAiDsl.g:2415:2: ( ruleVMNodeEleemnts )
            {
            // InternalAiDsl.g:2415:2: ( ruleVMNodeEleemnts )
            // InternalAiDsl.g:2416:3: ruleVMNodeEleemnts
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
    // InternalAiDsl.g:2425:1: rule__VMNodeOpCodeElement__CodeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VMNodeOpCodeElement__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2429:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2430:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2430:2: ( RULE_STRING )
            // InternalAiDsl.g:2431:3: RULE_STRING
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
    // InternalAiDsl.g:2440:1: rule__VMNodeOutElement__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__VMNodeOutElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2444:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2445:2: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2445:2: ( ruleQualifiedName )
            // InternalAiDsl.g:2446:3: ruleQualifiedName
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
    // InternalAiDsl.g:2455:1: rule__VMNodeOutElement__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__VMNodeOutElement__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2459:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2460:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2460:2: ( RULE_ID )
            // InternalAiDsl.g:2461:3: RULE_ID
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


    // $ANTLR start "rule__VMNodeInElement__PolicyAssignment_1"
    // InternalAiDsl.g:2470:1: rule__VMNodeInElement__PolicyAssignment_1 : ( ( rule__VMNodeInElement__PolicyAlternatives_1_0 ) ) ;
    public final void rule__VMNodeInElement__PolicyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2474:1: ( ( ( rule__VMNodeInElement__PolicyAlternatives_1_0 ) ) )
            // InternalAiDsl.g:2475:2: ( ( rule__VMNodeInElement__PolicyAlternatives_1_0 ) )
            {
            // InternalAiDsl.g:2475:2: ( ( rule__VMNodeInElement__PolicyAlternatives_1_0 ) )
            // InternalAiDsl.g:2476:3: ( rule__VMNodeInElement__PolicyAlternatives_1_0 )
            {
             before(grammarAccess.getVMNodeInElementAccess().getPolicyAlternatives_1_0()); 
            // InternalAiDsl.g:2477:3: ( rule__VMNodeInElement__PolicyAlternatives_1_0 )
            // InternalAiDsl.g:2477:4: rule__VMNodeInElement__PolicyAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VMNodeInElement__PolicyAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVMNodeInElementAccess().getPolicyAlternatives_1_0()); 

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
    // $ANTLR end "rule__VMNodeInElement__PolicyAssignment_1"


    // $ANTLR start "rule__VMNodeInElement__NameAssignment_2"
    // InternalAiDsl.g:2485:1: rule__VMNodeInElement__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__VMNodeInElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2489:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2490:2: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2490:2: ( ruleQualifiedName )
            // InternalAiDsl.g:2491:3: ruleQualifiedName
            {
             before(grammarAccess.getVMNodeInElementAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getVMNodeInElementAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VMNodeInElement__NameAssignment_2"


    // $ANTLR start "rule__VMNodeElement__PolicyAssignment_0"
    // InternalAiDsl.g:2500:1: rule__VMNodeElement__PolicyAssignment_0 : ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) ) ;
    public final void rule__VMNodeElement__PolicyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2504:1: ( ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) ) )
            // InternalAiDsl.g:2505:2: ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) )
            {
            // InternalAiDsl.g:2505:2: ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) )
            // InternalAiDsl.g:2506:3: ( rule__VMNodeElement__PolicyAlternatives_0_0 )
            {
             before(grammarAccess.getVMNodeElementAccess().getPolicyAlternatives_0_0()); 
            // InternalAiDsl.g:2507:3: ( rule__VMNodeElement__PolicyAlternatives_0_0 )
            // InternalAiDsl.g:2507:4: rule__VMNodeElement__PolicyAlternatives_0_0
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
    // InternalAiDsl.g:2515:1: rule__VMNodeElement__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__VMNodeElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2519:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2520:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2520:2: ( RULE_ID )
            // InternalAiDsl.g:2521:3: RULE_ID
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
    // InternalAiDsl.g:2530:1: rule__VMNodeElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VMNodeElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2534:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2535:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2535:2: ( RULE_ID )
            // InternalAiDsl.g:2536:3: RULE_ID
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
    // InternalAiDsl.g:2545:1: rule__VMNodeElement__DefaultvalueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__VMNodeElement__DefaultvalueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2549:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2550:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2550:2: ( RULE_STRING )
            // InternalAiDsl.g:2551:3: RULE_STRING
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


    // $ANTLR start "rule__VMOverrideElement__PolicyAssignment_0"
    // InternalAiDsl.g:2560:1: rule__VMOverrideElement__PolicyAssignment_0 : ( ( 'override' ) ) ;
    public final void rule__VMOverrideElement__PolicyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2564:1: ( ( ( 'override' ) ) )
            // InternalAiDsl.g:2565:2: ( ( 'override' ) )
            {
            // InternalAiDsl.g:2565:2: ( ( 'override' ) )
            // InternalAiDsl.g:2566:3: ( 'override' )
            {
             before(grammarAccess.getVMOverrideElementAccess().getPolicyOverrideKeyword_0_0()); 
            // InternalAiDsl.g:2567:3: ( 'override' )
            // InternalAiDsl.g:2568:4: 'override'
            {
             before(grammarAccess.getVMOverrideElementAccess().getPolicyOverrideKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVMOverrideElementAccess().getPolicyOverrideKeyword_0_0()); 

            }

             after(grammarAccess.getVMOverrideElementAccess().getPolicyOverrideKeyword_0_0()); 

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
    // $ANTLR end "rule__VMOverrideElement__PolicyAssignment_0"


    // $ANTLR start "rule__VMOverrideElement__TypeAssignment_1"
    // InternalAiDsl.g:2579:1: rule__VMOverrideElement__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__VMOverrideElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2583:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2584:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2584:2: ( RULE_ID )
            // InternalAiDsl.g:2585:3: RULE_ID
            {
             before(grammarAccess.getVMOverrideElementAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVMOverrideElementAccess().getTypeIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VMOverrideElement__TypeAssignment_1"


    // $ANTLR start "rule__VMOverrideElement__NameAssignment_2"
    // InternalAiDsl.g:2594:1: rule__VMOverrideElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VMOverrideElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2598:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2599:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2599:2: ( RULE_ID )
            // InternalAiDsl.g:2600:3: RULE_ID
            {
             before(grammarAccess.getVMOverrideElementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVMOverrideElementAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__VMOverrideElement__NameAssignment_2"


    // $ANTLR start "rule__VMOverrideElement__DefaultvalueAssignment_4"
    // InternalAiDsl.g:2609:1: rule__VMOverrideElement__DefaultvalueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__VMOverrideElement__DefaultvalueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2613:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2614:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2614:2: ( RULE_STRING )
            // InternalAiDsl.g:2615:3: RULE_STRING
            {
             before(grammarAccess.getVMOverrideElementAccess().getDefaultvalueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVMOverrideElementAccess().getDefaultvalueSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__VMOverrideElement__DefaultvalueAssignment_4"


    // $ANTLR start "rule__LlmTaskDefinition__NameAssignment_1"
    // InternalAiDsl.g:2624:1: rule__LlmTaskDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LlmTaskDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2628:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2629:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2629:2: ( RULE_ID )
            // InternalAiDsl.g:2630:3: RULE_ID
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
    // InternalAiDsl.g:2639:1: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 : ( ruleAnnotationInterfaceReference ) ;
    public final void rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2643:1: ( ( ruleAnnotationInterfaceReference ) )
            // InternalAiDsl.g:2644:2: ( ruleAnnotationInterfaceReference )
            {
            // InternalAiDsl.g:2644:2: ( ruleAnnotationInterfaceReference )
            // InternalAiDsl.g:2645:3: ruleAnnotationInterfaceReference
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
    // InternalAiDsl.g:2654:1: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 : ( ruleAnnotationInterfaceReference ) ;
    public final void rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2658:1: ( ( ruleAnnotationInterfaceReference ) )
            // InternalAiDsl.g:2659:2: ( ruleAnnotationInterfaceReference )
            {
            // InternalAiDsl.g:2659:2: ( ruleAnnotationInterfaceReference )
            // InternalAiDsl.g:2660:3: ruleAnnotationInterfaceReference
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
    // InternalAiDsl.g:2669:1: rule__LlmTaskDefinition__AssignmentAssignment_6 : ( ruleLlmVariableAssignment ) ;
    public final void rule__LlmTaskDefinition__AssignmentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2673:1: ( ( ruleLlmVariableAssignment ) )
            // InternalAiDsl.g:2674:2: ( ruleLlmVariableAssignment )
            {
            // InternalAiDsl.g:2674:2: ( ruleLlmVariableAssignment )
            // InternalAiDsl.g:2675:3: ruleLlmVariableAssignment
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
    // InternalAiDsl.g:2684:1: rule__AnnotationInterfaceReference__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AnnotationInterfaceReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2688:1: ( ( ( RULE_ID ) ) )
            // InternalAiDsl.g:2689:2: ( ( RULE_ID ) )
            {
            // InternalAiDsl.g:2689:2: ( ( RULE_ID ) )
            // InternalAiDsl.g:2690:3: ( RULE_ID )
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameVMNodeDefinitionCrossReference_1_0()); 
            // InternalAiDsl.g:2691:3: ( RULE_ID )
            // InternalAiDsl.g:2692:4: RULE_ID
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameVMNodeDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameVMNodeDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameVMNodeDefinitionCrossReference_1_0()); 

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
    // InternalAiDsl.g:2703:1: rule__LlmVariableAssignment__VariablenameAssignment_0 : ( RULE_ID ) ;
    public final void rule__LlmVariableAssignment__VariablenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2707:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2708:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2708:2: ( RULE_ID )
            // InternalAiDsl.g:2709:3: RULE_ID
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
    // InternalAiDsl.g:2718:1: rule__LlmVariableAssignment__TemplateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LlmVariableAssignment__TemplateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2722:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2723:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2723:2: ( RULE_STRING )
            // InternalAiDsl.g:2724:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020430000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020420002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000805A06000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000805806002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});

}