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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'super'", "'overlay'", "'require'", "'optional'", "'package'", "'import'", "'workflow'", "'('", "')'", "'{'", "'}'", "'vmnode'", "'opcode'", "'out'", "'as'", "'default'", "':='", "'llmtask'", "'implements'", "','", "'@'", "'.'", "'.*'", "'override'"
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


    // $ANTLR start "entryRuleVMOverrideElement"
    // InternalAiDsl.g:278:1: entryRuleVMOverrideElement : ruleVMOverrideElement EOF ;
    public final void entryRuleVMOverrideElement() throws RecognitionException {
        try {
            // InternalAiDsl.g:279:1: ( ruleVMOverrideElement EOF )
            // InternalAiDsl.g:280:1: ruleVMOverrideElement EOF
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
    // InternalAiDsl.g:287:1: ruleVMOverrideElement : ( ( rule__VMOverrideElement__Group__0 ) ) ;
    public final void ruleVMOverrideElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:291:2: ( ( ( rule__VMOverrideElement__Group__0 ) ) )
            // InternalAiDsl.g:292:2: ( ( rule__VMOverrideElement__Group__0 ) )
            {
            // InternalAiDsl.g:292:2: ( ( rule__VMOverrideElement__Group__0 ) )
            // InternalAiDsl.g:293:3: ( rule__VMOverrideElement__Group__0 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getGroup()); 
            // InternalAiDsl.g:294:3: ( rule__VMOverrideElement__Group__0 )
            // InternalAiDsl.g:294:4: rule__VMOverrideElement__Group__0
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
    // InternalAiDsl.g:303:1: entryRuleLlmTaskDefinition : ruleLlmTaskDefinition EOF ;
    public final void entryRuleLlmTaskDefinition() throws RecognitionException {
        try {
            // InternalAiDsl.g:304:1: ( ruleLlmTaskDefinition EOF )
            // InternalAiDsl.g:305:1: ruleLlmTaskDefinition EOF
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
    // InternalAiDsl.g:312:1: ruleLlmTaskDefinition : ( ( rule__LlmTaskDefinition__Group__0 ) ) ;
    public final void ruleLlmTaskDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:316:2: ( ( ( rule__LlmTaskDefinition__Group__0 ) ) )
            // InternalAiDsl.g:317:2: ( ( rule__LlmTaskDefinition__Group__0 ) )
            {
            // InternalAiDsl.g:317:2: ( ( rule__LlmTaskDefinition__Group__0 ) )
            // InternalAiDsl.g:318:3: ( rule__LlmTaskDefinition__Group__0 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup()); 
            // InternalAiDsl.g:319:3: ( rule__LlmTaskDefinition__Group__0 )
            // InternalAiDsl.g:319:4: rule__LlmTaskDefinition__Group__0
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
    // InternalAiDsl.g:328:1: entryRuleAnnotationInterfaceReference : ruleAnnotationInterfaceReference EOF ;
    public final void entryRuleAnnotationInterfaceReference() throws RecognitionException {
        try {
            // InternalAiDsl.g:329:1: ( ruleAnnotationInterfaceReference EOF )
            // InternalAiDsl.g:330:1: ruleAnnotationInterfaceReference EOF
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
    // InternalAiDsl.g:337:1: ruleAnnotationInterfaceReference : ( ( rule__AnnotationInterfaceReference__Group__0 ) ) ;
    public final void ruleAnnotationInterfaceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:341:2: ( ( ( rule__AnnotationInterfaceReference__Group__0 ) ) )
            // InternalAiDsl.g:342:2: ( ( rule__AnnotationInterfaceReference__Group__0 ) )
            {
            // InternalAiDsl.g:342:2: ( ( rule__AnnotationInterfaceReference__Group__0 ) )
            // InternalAiDsl.g:343:3: ( rule__AnnotationInterfaceReference__Group__0 )
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getGroup()); 
            // InternalAiDsl.g:344:3: ( rule__AnnotationInterfaceReference__Group__0 )
            // InternalAiDsl.g:344:4: rule__AnnotationInterfaceReference__Group__0
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
    // InternalAiDsl.g:353:1: entryRuleLlmVariableAssignment : ruleLlmVariableAssignment EOF ;
    public final void entryRuleLlmVariableAssignment() throws RecognitionException {
        try {
            // InternalAiDsl.g:354:1: ( ruleLlmVariableAssignment EOF )
            // InternalAiDsl.g:355:1: ruleLlmVariableAssignment EOF
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
    // InternalAiDsl.g:362:1: ruleLlmVariableAssignment : ( ( rule__LlmVariableAssignment__Group__0 ) ) ;
    public final void ruleLlmVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:366:2: ( ( ( rule__LlmVariableAssignment__Group__0 ) ) )
            // InternalAiDsl.g:367:2: ( ( rule__LlmVariableAssignment__Group__0 ) )
            {
            // InternalAiDsl.g:367:2: ( ( rule__LlmVariableAssignment__Group__0 ) )
            // InternalAiDsl.g:368:3: ( rule__LlmVariableAssignment__Group__0 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getGroup()); 
            // InternalAiDsl.g:369:3: ( rule__LlmVariableAssignment__Group__0 )
            // InternalAiDsl.g:369:4: rule__LlmVariableAssignment__Group__0
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
    // InternalAiDsl.g:378:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAiDsl.g:379:1: ( ruleQualifiedName EOF )
            // InternalAiDsl.g:380:1: ruleQualifiedName EOF
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
    // InternalAiDsl.g:387:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:391:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAiDsl.g:392:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAiDsl.g:392:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAiDsl.g:393:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAiDsl.g:394:3: ( rule__QualifiedName__Group__0 )
            // InternalAiDsl.g:394:4: rule__QualifiedName__Group__0
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
    // InternalAiDsl.g:403:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalAiDsl.g:404:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalAiDsl.g:405:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalAiDsl.g:412:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:416:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalAiDsl.g:417:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalAiDsl.g:417:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalAiDsl.g:418:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalAiDsl.g:419:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalAiDsl.g:419:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalAiDsl.g:427:1: rule__Model__DefinitionsAlternatives_2_0 : ( ( ruleWorkflowDefinition ) | ( ruleLlmTaskDefinition ) | ( ruleVMNodeDefinition ) );
    public final void rule__Model__DefinitionsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:431:1: ( ( ruleWorkflowDefinition ) | ( ruleLlmTaskDefinition ) | ( ruleVMNodeDefinition ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 28:
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
                    // InternalAiDsl.g:432:2: ( ruleWorkflowDefinition )
                    {
                    // InternalAiDsl.g:432:2: ( ruleWorkflowDefinition )
                    // InternalAiDsl.g:433:3: ruleWorkflowDefinition
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
                    // InternalAiDsl.g:438:2: ( ruleLlmTaskDefinition )
                    {
                    // InternalAiDsl.g:438:2: ( ruleLlmTaskDefinition )
                    // InternalAiDsl.g:439:3: ruleLlmTaskDefinition
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
                    // InternalAiDsl.g:444:2: ( ruleVMNodeDefinition )
                    {
                    // InternalAiDsl.g:444:2: ( ruleVMNodeDefinition )
                    // InternalAiDsl.g:445:3: ruleVMNodeDefinition
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
    // InternalAiDsl.g:454:1: rule__VMNodeDefinition__NodetypeAlternatives_1_0 : ( ( 'super' ) | ( 'overlay' ) );
    public final void rule__VMNodeDefinition__NodetypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:458:1: ( ( 'super' ) | ( 'overlay' ) )
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
                    // InternalAiDsl.g:459:2: ( 'super' )
                    {
                    // InternalAiDsl.g:459:2: ( 'super' )
                    // InternalAiDsl.g:460:3: 'super'
                    {
                     before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getVMNodeDefinitionAccess().getNodetypeSuperKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:465:2: ( 'overlay' )
                    {
                    // InternalAiDsl.g:465:2: ( 'overlay' )
                    // InternalAiDsl.g:466:3: 'overlay'
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
    // InternalAiDsl.g:475:1: rule__VMNodeEleemnts__Alternatives : ( ( ruleVMNodeOpCodeElement ) | ( ruleVMNodeOutElement ) | ( ruleVMNodeElement ) | ( ruleVMOverrideElement ) );
    public final void rule__VMNodeEleemnts__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:479:1: ( ( ruleVMNodeOpCodeElement ) | ( ruleVMNodeOutElement ) | ( ruleVMNodeElement ) | ( ruleVMOverrideElement ) )
            int alt3=4;
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
            case 34:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAiDsl.g:480:2: ( ruleVMNodeOpCodeElement )
                    {
                    // InternalAiDsl.g:480:2: ( ruleVMNodeOpCodeElement )
                    // InternalAiDsl.g:481:3: ruleVMNodeOpCodeElement
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
                    // InternalAiDsl.g:486:2: ( ruleVMNodeOutElement )
                    {
                    // InternalAiDsl.g:486:2: ( ruleVMNodeOutElement )
                    // InternalAiDsl.g:487:3: ruleVMNodeOutElement
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
                    // InternalAiDsl.g:492:2: ( ruleVMNodeElement )
                    {
                    // InternalAiDsl.g:492:2: ( ruleVMNodeElement )
                    // InternalAiDsl.g:493:3: ruleVMNodeElement
                    {
                     before(grammarAccess.getVMNodeEleemntsAccess().getVMNodeElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVMNodeElement();

                    state._fsp--;

                     after(grammarAccess.getVMNodeEleemntsAccess().getVMNodeElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAiDsl.g:498:2: ( ruleVMOverrideElement )
                    {
                    // InternalAiDsl.g:498:2: ( ruleVMOverrideElement )
                    // InternalAiDsl.g:499:3: ruleVMOverrideElement
                    {
                     before(grammarAccess.getVMNodeEleemntsAccess().getVMOverrideElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVMOverrideElement();

                    state._fsp--;

                     after(grammarAccess.getVMNodeEleemntsAccess().getVMOverrideElementParserRuleCall_3()); 

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
    // InternalAiDsl.g:508:1: rule__VMNodeElement__PolicyAlternatives_0_0 : ( ( 'require' ) | ( 'optional' ) );
    public final void rule__VMNodeElement__PolicyAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:512:1: ( ( 'require' ) | ( 'optional' ) )
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
                    // InternalAiDsl.g:513:2: ( 'require' )
                    {
                    // InternalAiDsl.g:513:2: ( 'require' )
                    // InternalAiDsl.g:514:3: 'require'
                    {
                     before(grammarAccess.getVMNodeElementAccess().getPolicyRequireKeyword_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVMNodeElementAccess().getPolicyRequireKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAiDsl.g:519:2: ( 'optional' )
                    {
                    // InternalAiDsl.g:519:2: ( 'optional' )
                    // InternalAiDsl.g:520:3: 'optional'
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
    // InternalAiDsl.g:529:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:533:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAiDsl.g:534:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAiDsl.g:541:1: rule__Model__Group__0__Impl : ( ( rule__Model__Package_declarationAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:545:1: ( ( ( rule__Model__Package_declarationAssignment_0 )? ) )
            // InternalAiDsl.g:546:1: ( ( rule__Model__Package_declarationAssignment_0 )? )
            {
            // InternalAiDsl.g:546:1: ( ( rule__Model__Package_declarationAssignment_0 )? )
            // InternalAiDsl.g:547:2: ( rule__Model__Package_declarationAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getPackage_declarationAssignment_0()); 
            // InternalAiDsl.g:548:2: ( rule__Model__Package_declarationAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAiDsl.g:548:3: rule__Model__Package_declarationAssignment_0
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
    // InternalAiDsl.g:556:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:560:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAiDsl.g:561:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAiDsl.g:568:1: rule__Model__Group__1__Impl : ( ( rule__Model__Import_declarationsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:572:1: ( ( ( rule__Model__Import_declarationsAssignment_1 )* ) )
            // InternalAiDsl.g:573:1: ( ( rule__Model__Import_declarationsAssignment_1 )* )
            {
            // InternalAiDsl.g:573:1: ( ( rule__Model__Import_declarationsAssignment_1 )* )
            // InternalAiDsl.g:574:2: ( rule__Model__Import_declarationsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImport_declarationsAssignment_1()); 
            // InternalAiDsl.g:575:2: ( rule__Model__Import_declarationsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAiDsl.g:575:3: rule__Model__Import_declarationsAssignment_1
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
    // InternalAiDsl.g:583:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:587:1: ( rule__Model__Group__2__Impl )
            // InternalAiDsl.g:588:2: rule__Model__Group__2__Impl
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
    // InternalAiDsl.g:594:1: rule__Model__Group__2__Impl : ( ( rule__Model__DefinitionsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:598:1: ( ( ( rule__Model__DefinitionsAssignment_2 )* ) )
            // InternalAiDsl.g:599:1: ( ( rule__Model__DefinitionsAssignment_2 )* )
            {
            // InternalAiDsl.g:599:1: ( ( rule__Model__DefinitionsAssignment_2 )* )
            // InternalAiDsl.g:600:2: ( rule__Model__DefinitionsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDefinitionsAssignment_2()); 
            // InternalAiDsl.g:601:2: ( rule__Model__DefinitionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==22||LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAiDsl.g:601:3: rule__Model__DefinitionsAssignment_2
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
    // InternalAiDsl.g:610:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:614:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAiDsl.g:615:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAiDsl.g:622:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:626:1: ( ( 'package' ) )
            // InternalAiDsl.g:627:1: ( 'package' )
            {
            // InternalAiDsl.g:627:1: ( 'package' )
            // InternalAiDsl.g:628:2: 'package'
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
    // InternalAiDsl.g:637:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:641:1: ( rule__PackageDeclaration__Group__1__Impl )
            // InternalAiDsl.g:642:2: rule__PackageDeclaration__Group__1__Impl
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
    // InternalAiDsl.g:648:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:652:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAiDsl.g:653:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:653:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAiDsl.g:654:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:655:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAiDsl.g:655:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAiDsl.g:664:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:668:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // InternalAiDsl.g:669:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
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
    // InternalAiDsl.g:676:1: rule__ImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:680:1: ( ( 'import' ) )
            // InternalAiDsl.g:681:1: ( 'import' )
            {
            // InternalAiDsl.g:681:1: ( 'import' )
            // InternalAiDsl.g:682:2: 'import'
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
    // InternalAiDsl.g:691:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:695:1: ( rule__ImportDeclaration__Group__1__Impl )
            // InternalAiDsl.g:696:2: rule__ImportDeclaration__Group__1__Impl
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
    // InternalAiDsl.g:702:1: rule__ImportDeclaration__Group__1__Impl : ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:706:1: ( ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) ) )
            // InternalAiDsl.g:707:1: ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAiDsl.g:707:1: ( ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 ) )
            // InternalAiDsl.g:708:2: ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportDeclarationAccess().getImportedNamespaceAssignment_1()); 
            // InternalAiDsl.g:709:2: ( rule__ImportDeclaration__ImportedNamespaceAssignment_1 )
            // InternalAiDsl.g:709:3: rule__ImportDeclaration__ImportedNamespaceAssignment_1
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
    // InternalAiDsl.g:718:1: rule__WorkflowDefinition__Group__0 : rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1 ;
    public final void rule__WorkflowDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:722:1: ( rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1 )
            // InternalAiDsl.g:723:2: rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1
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
    // InternalAiDsl.g:730:1: rule__WorkflowDefinition__Group__0__Impl : ( 'workflow' ) ;
    public final void rule__WorkflowDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:734:1: ( ( 'workflow' ) )
            // InternalAiDsl.g:735:1: ( 'workflow' )
            {
            // InternalAiDsl.g:735:1: ( 'workflow' )
            // InternalAiDsl.g:736:2: 'workflow'
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
    // InternalAiDsl.g:745:1: rule__WorkflowDefinition__Group__1 : rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2 ;
    public final void rule__WorkflowDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:749:1: ( rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2 )
            // InternalAiDsl.g:750:2: rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2
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
    // InternalAiDsl.g:757:1: rule__WorkflowDefinition__Group__1__Impl : ( ( rule__WorkflowDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkflowDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:761:1: ( ( ( rule__WorkflowDefinition__NameAssignment_1 ) ) )
            // InternalAiDsl.g:762:1: ( ( rule__WorkflowDefinition__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:762:1: ( ( rule__WorkflowDefinition__NameAssignment_1 ) )
            // InternalAiDsl.g:763:2: ( rule__WorkflowDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:764:2: ( rule__WorkflowDefinition__NameAssignment_1 )
            // InternalAiDsl.g:764:3: rule__WorkflowDefinition__NameAssignment_1
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
    // InternalAiDsl.g:772:1: rule__WorkflowDefinition__Group__2 : rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3 ;
    public final void rule__WorkflowDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:776:1: ( rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3 )
            // InternalAiDsl.g:777:2: rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3
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
    // InternalAiDsl.g:784:1: rule__WorkflowDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__WorkflowDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:788:1: ( ( '(' ) )
            // InternalAiDsl.g:789:1: ( '(' )
            {
            // InternalAiDsl.g:789:1: ( '(' )
            // InternalAiDsl.g:790:2: '('
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
    // InternalAiDsl.g:799:1: rule__WorkflowDefinition__Group__3 : rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4 ;
    public final void rule__WorkflowDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:803:1: ( rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4 )
            // InternalAiDsl.g:804:2: rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4
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
    // InternalAiDsl.g:811:1: rule__WorkflowDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__WorkflowDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:815:1: ( ( ')' ) )
            // InternalAiDsl.g:816:1: ( ')' )
            {
            // InternalAiDsl.g:816:1: ( ')' )
            // InternalAiDsl.g:817:2: ')'
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
    // InternalAiDsl.g:826:1: rule__WorkflowDefinition__Group__4 : rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5 ;
    public final void rule__WorkflowDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:830:1: ( rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5 )
            // InternalAiDsl.g:831:2: rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5
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
    // InternalAiDsl.g:838:1: rule__WorkflowDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__WorkflowDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:842:1: ( ( '{' ) )
            // InternalAiDsl.g:843:1: ( '{' )
            {
            // InternalAiDsl.g:843:1: ( '{' )
            // InternalAiDsl.g:844:2: '{'
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
    // InternalAiDsl.g:853:1: rule__WorkflowDefinition__Group__5 : rule__WorkflowDefinition__Group__5__Impl ;
    public final void rule__WorkflowDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:857:1: ( rule__WorkflowDefinition__Group__5__Impl )
            // InternalAiDsl.g:858:2: rule__WorkflowDefinition__Group__5__Impl
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
    // InternalAiDsl.g:864:1: rule__WorkflowDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__WorkflowDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:868:1: ( ( '}' ) )
            // InternalAiDsl.g:869:1: ( '}' )
            {
            // InternalAiDsl.g:869:1: ( '}' )
            // InternalAiDsl.g:870:2: '}'
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
    // InternalAiDsl.g:880:1: rule__VMNodeDefinition__Group__0 : rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1 ;
    public final void rule__VMNodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:884:1: ( rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1 )
            // InternalAiDsl.g:885:2: rule__VMNodeDefinition__Group__0__Impl rule__VMNodeDefinition__Group__1
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
    // InternalAiDsl.g:892:1: rule__VMNodeDefinition__Group__0__Impl : ( 'vmnode' ) ;
    public final void rule__VMNodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:896:1: ( ( 'vmnode' ) )
            // InternalAiDsl.g:897:1: ( 'vmnode' )
            {
            // InternalAiDsl.g:897:1: ( 'vmnode' )
            // InternalAiDsl.g:898:2: 'vmnode'
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
    // InternalAiDsl.g:907:1: rule__VMNodeDefinition__Group__1 : rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2 ;
    public final void rule__VMNodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:911:1: ( rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2 )
            // InternalAiDsl.g:912:2: rule__VMNodeDefinition__Group__1__Impl rule__VMNodeDefinition__Group__2
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
    // InternalAiDsl.g:919:1: rule__VMNodeDefinition__Group__1__Impl : ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? ) ;
    public final void rule__VMNodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:923:1: ( ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? ) )
            // InternalAiDsl.g:924:1: ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? )
            {
            // InternalAiDsl.g:924:1: ( ( rule__VMNodeDefinition__NodetypeAssignment_1 )? )
            // InternalAiDsl.g:925:2: ( rule__VMNodeDefinition__NodetypeAssignment_1 )?
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeAssignment_1()); 
            // InternalAiDsl.g:926:2: ( rule__VMNodeDefinition__NodetypeAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAiDsl.g:926:3: rule__VMNodeDefinition__NodetypeAssignment_1
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
    // InternalAiDsl.g:934:1: rule__VMNodeDefinition__Group__2 : rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3 ;
    public final void rule__VMNodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:938:1: ( rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3 )
            // InternalAiDsl.g:939:2: rule__VMNodeDefinition__Group__2__Impl rule__VMNodeDefinition__Group__3
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
    // InternalAiDsl.g:946:1: rule__VMNodeDefinition__Group__2__Impl : ( ( rule__VMNodeDefinition__NameAssignment_2 ) ) ;
    public final void rule__VMNodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:950:1: ( ( ( rule__VMNodeDefinition__NameAssignment_2 ) ) )
            // InternalAiDsl.g:951:1: ( ( rule__VMNodeDefinition__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:951:1: ( ( rule__VMNodeDefinition__NameAssignment_2 ) )
            // InternalAiDsl.g:952:2: ( rule__VMNodeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:953:2: ( rule__VMNodeDefinition__NameAssignment_2 )
            // InternalAiDsl.g:953:3: rule__VMNodeDefinition__NameAssignment_2
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
    // InternalAiDsl.g:961:1: rule__VMNodeDefinition__Group__3 : rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4 ;
    public final void rule__VMNodeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:965:1: ( rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4 )
            // InternalAiDsl.g:966:2: rule__VMNodeDefinition__Group__3__Impl rule__VMNodeDefinition__Group__4
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
    // InternalAiDsl.g:973:1: rule__VMNodeDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__VMNodeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:977:1: ( ( '{' ) )
            // InternalAiDsl.g:978:1: ( '{' )
            {
            // InternalAiDsl.g:978:1: ( '{' )
            // InternalAiDsl.g:979:2: '{'
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
    // InternalAiDsl.g:988:1: rule__VMNodeDefinition__Group__4 : rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5 ;
    public final void rule__VMNodeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:992:1: ( rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5 )
            // InternalAiDsl.g:993:2: rule__VMNodeDefinition__Group__4__Impl rule__VMNodeDefinition__Group__5
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
    // InternalAiDsl.g:1000:1: rule__VMNodeDefinition__Group__4__Impl : ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* ) ;
    public final void rule__VMNodeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1004:1: ( ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* ) )
            // InternalAiDsl.g:1005:1: ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* )
            {
            // InternalAiDsl.g:1005:1: ( ( rule__VMNodeDefinition__ElementsAssignment_4 )* )
            // InternalAiDsl.g:1006:2: ( rule__VMNodeDefinition__ElementsAssignment_4 )*
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getElementsAssignment_4()); 
            // InternalAiDsl.g:1007:2: ( rule__VMNodeDefinition__ElementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)||(LA9_0>=23 && LA9_0<=24)||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAiDsl.g:1007:3: rule__VMNodeDefinition__ElementsAssignment_4
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
    // InternalAiDsl.g:1015:1: rule__VMNodeDefinition__Group__5 : rule__VMNodeDefinition__Group__5__Impl ;
    public final void rule__VMNodeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1019:1: ( rule__VMNodeDefinition__Group__5__Impl )
            // InternalAiDsl.g:1020:2: rule__VMNodeDefinition__Group__5__Impl
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
    // InternalAiDsl.g:1026:1: rule__VMNodeDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__VMNodeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1030:1: ( ( '}' ) )
            // InternalAiDsl.g:1031:1: ( '}' )
            {
            // InternalAiDsl.g:1031:1: ( '}' )
            // InternalAiDsl.g:1032:2: '}'
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
    // InternalAiDsl.g:1042:1: rule__VMNodeOpCodeElement__Group__0 : rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1 ;
    public final void rule__VMNodeOpCodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1046:1: ( rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1 )
            // InternalAiDsl.g:1047:2: rule__VMNodeOpCodeElement__Group__0__Impl rule__VMNodeOpCodeElement__Group__1
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
    // InternalAiDsl.g:1054:1: rule__VMNodeOpCodeElement__Group__0__Impl : ( 'opcode' ) ;
    public final void rule__VMNodeOpCodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1058:1: ( ( 'opcode' ) )
            // InternalAiDsl.g:1059:1: ( 'opcode' )
            {
            // InternalAiDsl.g:1059:1: ( 'opcode' )
            // InternalAiDsl.g:1060:2: 'opcode'
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
    // InternalAiDsl.g:1069:1: rule__VMNodeOpCodeElement__Group__1 : rule__VMNodeOpCodeElement__Group__1__Impl ;
    public final void rule__VMNodeOpCodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1073:1: ( rule__VMNodeOpCodeElement__Group__1__Impl )
            // InternalAiDsl.g:1074:2: rule__VMNodeOpCodeElement__Group__1__Impl
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
    // InternalAiDsl.g:1080:1: rule__VMNodeOpCodeElement__Group__1__Impl : ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) ) ;
    public final void rule__VMNodeOpCodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1084:1: ( ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) ) )
            // InternalAiDsl.g:1085:1: ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) )
            {
            // InternalAiDsl.g:1085:1: ( ( rule__VMNodeOpCodeElement__CodeAssignment_1 ) )
            // InternalAiDsl.g:1086:2: ( rule__VMNodeOpCodeElement__CodeAssignment_1 )
            {
             before(grammarAccess.getVMNodeOpCodeElementAccess().getCodeAssignment_1()); 
            // InternalAiDsl.g:1087:2: ( rule__VMNodeOpCodeElement__CodeAssignment_1 )
            // InternalAiDsl.g:1087:3: rule__VMNodeOpCodeElement__CodeAssignment_1
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
    // InternalAiDsl.g:1096:1: rule__VMNodeOutElement__Group__0 : rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1 ;
    public final void rule__VMNodeOutElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1100:1: ( rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1 )
            // InternalAiDsl.g:1101:2: rule__VMNodeOutElement__Group__0__Impl rule__VMNodeOutElement__Group__1
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
    // InternalAiDsl.g:1108:1: rule__VMNodeOutElement__Group__0__Impl : ( 'out' ) ;
    public final void rule__VMNodeOutElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1112:1: ( ( 'out' ) )
            // InternalAiDsl.g:1113:1: ( 'out' )
            {
            // InternalAiDsl.g:1113:1: ( 'out' )
            // InternalAiDsl.g:1114:2: 'out'
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
    // InternalAiDsl.g:1123:1: rule__VMNodeOutElement__Group__1 : rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2 ;
    public final void rule__VMNodeOutElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1127:1: ( rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2 )
            // InternalAiDsl.g:1128:2: rule__VMNodeOutElement__Group__1__Impl rule__VMNodeOutElement__Group__2
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
    // InternalAiDsl.g:1135:1: rule__VMNodeOutElement__Group__1__Impl : ( ( rule__VMNodeOutElement__NameAssignment_1 ) ) ;
    public final void rule__VMNodeOutElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1139:1: ( ( ( rule__VMNodeOutElement__NameAssignment_1 ) ) )
            // InternalAiDsl.g:1140:1: ( ( rule__VMNodeOutElement__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:1140:1: ( ( rule__VMNodeOutElement__NameAssignment_1 ) )
            // InternalAiDsl.g:1141:2: ( rule__VMNodeOutElement__NameAssignment_1 )
            {
             before(grammarAccess.getVMNodeOutElementAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:1142:2: ( rule__VMNodeOutElement__NameAssignment_1 )
            // InternalAiDsl.g:1142:3: rule__VMNodeOutElement__NameAssignment_1
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
    // InternalAiDsl.g:1150:1: rule__VMNodeOutElement__Group__2 : rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3 ;
    public final void rule__VMNodeOutElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1154:1: ( rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3 )
            // InternalAiDsl.g:1155:2: rule__VMNodeOutElement__Group__2__Impl rule__VMNodeOutElement__Group__3
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
    // InternalAiDsl.g:1162:1: rule__VMNodeOutElement__Group__2__Impl : ( 'as' ) ;
    public final void rule__VMNodeOutElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1166:1: ( ( 'as' ) )
            // InternalAiDsl.g:1167:1: ( 'as' )
            {
            // InternalAiDsl.g:1167:1: ( 'as' )
            // InternalAiDsl.g:1168:2: 'as'
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
    // InternalAiDsl.g:1177:1: rule__VMNodeOutElement__Group__3 : rule__VMNodeOutElement__Group__3__Impl ;
    public final void rule__VMNodeOutElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1181:1: ( rule__VMNodeOutElement__Group__3__Impl )
            // InternalAiDsl.g:1182:2: rule__VMNodeOutElement__Group__3__Impl
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
    // InternalAiDsl.g:1188:1: rule__VMNodeOutElement__Group__3__Impl : ( ( rule__VMNodeOutElement__TypeAssignment_3 ) ) ;
    public final void rule__VMNodeOutElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1192:1: ( ( ( rule__VMNodeOutElement__TypeAssignment_3 ) ) )
            // InternalAiDsl.g:1193:1: ( ( rule__VMNodeOutElement__TypeAssignment_3 ) )
            {
            // InternalAiDsl.g:1193:1: ( ( rule__VMNodeOutElement__TypeAssignment_3 ) )
            // InternalAiDsl.g:1194:2: ( rule__VMNodeOutElement__TypeAssignment_3 )
            {
             before(grammarAccess.getVMNodeOutElementAccess().getTypeAssignment_3()); 
            // InternalAiDsl.g:1195:2: ( rule__VMNodeOutElement__TypeAssignment_3 )
            // InternalAiDsl.g:1195:3: rule__VMNodeOutElement__TypeAssignment_3
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
    // InternalAiDsl.g:1204:1: rule__VMNodeElement__Group__0 : rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1 ;
    public final void rule__VMNodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1208:1: ( rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1 )
            // InternalAiDsl.g:1209:2: rule__VMNodeElement__Group__0__Impl rule__VMNodeElement__Group__1
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
    // InternalAiDsl.g:1216:1: rule__VMNodeElement__Group__0__Impl : ( ( rule__VMNodeElement__PolicyAssignment_0 ) ) ;
    public final void rule__VMNodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1220:1: ( ( ( rule__VMNodeElement__PolicyAssignment_0 ) ) )
            // InternalAiDsl.g:1221:1: ( ( rule__VMNodeElement__PolicyAssignment_0 ) )
            {
            // InternalAiDsl.g:1221:1: ( ( rule__VMNodeElement__PolicyAssignment_0 ) )
            // InternalAiDsl.g:1222:2: ( rule__VMNodeElement__PolicyAssignment_0 )
            {
             before(grammarAccess.getVMNodeElementAccess().getPolicyAssignment_0()); 
            // InternalAiDsl.g:1223:2: ( rule__VMNodeElement__PolicyAssignment_0 )
            // InternalAiDsl.g:1223:3: rule__VMNodeElement__PolicyAssignment_0
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
    // InternalAiDsl.g:1231:1: rule__VMNodeElement__Group__1 : rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2 ;
    public final void rule__VMNodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1235:1: ( rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2 )
            // InternalAiDsl.g:1236:2: rule__VMNodeElement__Group__1__Impl rule__VMNodeElement__Group__2
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
    // InternalAiDsl.g:1243:1: rule__VMNodeElement__Group__1__Impl : ( ( rule__VMNodeElement__TypeAssignment_1 ) ) ;
    public final void rule__VMNodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1247:1: ( ( ( rule__VMNodeElement__TypeAssignment_1 ) ) )
            // InternalAiDsl.g:1248:1: ( ( rule__VMNodeElement__TypeAssignment_1 ) )
            {
            // InternalAiDsl.g:1248:1: ( ( rule__VMNodeElement__TypeAssignment_1 ) )
            // InternalAiDsl.g:1249:2: ( rule__VMNodeElement__TypeAssignment_1 )
            {
             before(grammarAccess.getVMNodeElementAccess().getTypeAssignment_1()); 
            // InternalAiDsl.g:1250:2: ( rule__VMNodeElement__TypeAssignment_1 )
            // InternalAiDsl.g:1250:3: rule__VMNodeElement__TypeAssignment_1
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
    // InternalAiDsl.g:1258:1: rule__VMNodeElement__Group__2 : rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3 ;
    public final void rule__VMNodeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1262:1: ( rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3 )
            // InternalAiDsl.g:1263:2: rule__VMNodeElement__Group__2__Impl rule__VMNodeElement__Group__3
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
    // InternalAiDsl.g:1270:1: rule__VMNodeElement__Group__2__Impl : ( ( rule__VMNodeElement__NameAssignment_2 ) ) ;
    public final void rule__VMNodeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1274:1: ( ( ( rule__VMNodeElement__NameAssignment_2 ) ) )
            // InternalAiDsl.g:1275:1: ( ( rule__VMNodeElement__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:1275:1: ( ( rule__VMNodeElement__NameAssignment_2 ) )
            // InternalAiDsl.g:1276:2: ( rule__VMNodeElement__NameAssignment_2 )
            {
             before(grammarAccess.getVMNodeElementAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:1277:2: ( rule__VMNodeElement__NameAssignment_2 )
            // InternalAiDsl.g:1277:3: rule__VMNodeElement__NameAssignment_2
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
    // InternalAiDsl.g:1285:1: rule__VMNodeElement__Group__3 : rule__VMNodeElement__Group__3__Impl ;
    public final void rule__VMNodeElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1289:1: ( rule__VMNodeElement__Group__3__Impl )
            // InternalAiDsl.g:1290:2: rule__VMNodeElement__Group__3__Impl
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
    // InternalAiDsl.g:1296:1: rule__VMNodeElement__Group__3__Impl : ( ( rule__VMNodeElement__Group_3__0 )? ) ;
    public final void rule__VMNodeElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1300:1: ( ( ( rule__VMNodeElement__Group_3__0 )? ) )
            // InternalAiDsl.g:1301:1: ( ( rule__VMNodeElement__Group_3__0 )? )
            {
            // InternalAiDsl.g:1301:1: ( ( rule__VMNodeElement__Group_3__0 )? )
            // InternalAiDsl.g:1302:2: ( rule__VMNodeElement__Group_3__0 )?
            {
             before(grammarAccess.getVMNodeElementAccess().getGroup_3()); 
            // InternalAiDsl.g:1303:2: ( rule__VMNodeElement__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAiDsl.g:1303:3: rule__VMNodeElement__Group_3__0
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
    // InternalAiDsl.g:1312:1: rule__VMNodeElement__Group_3__0 : rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1 ;
    public final void rule__VMNodeElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1316:1: ( rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1 )
            // InternalAiDsl.g:1317:2: rule__VMNodeElement__Group_3__0__Impl rule__VMNodeElement__Group_3__1
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
    // InternalAiDsl.g:1324:1: rule__VMNodeElement__Group_3__0__Impl : ( 'default' ) ;
    public final void rule__VMNodeElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1328:1: ( ( 'default' ) )
            // InternalAiDsl.g:1329:1: ( 'default' )
            {
            // InternalAiDsl.g:1329:1: ( 'default' )
            // InternalAiDsl.g:1330:2: 'default'
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
    // InternalAiDsl.g:1339:1: rule__VMNodeElement__Group_3__1 : rule__VMNodeElement__Group_3__1__Impl ;
    public final void rule__VMNodeElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1343:1: ( rule__VMNodeElement__Group_3__1__Impl )
            // InternalAiDsl.g:1344:2: rule__VMNodeElement__Group_3__1__Impl
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
    // InternalAiDsl.g:1350:1: rule__VMNodeElement__Group_3__1__Impl : ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) ) ;
    public final void rule__VMNodeElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1354:1: ( ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) ) )
            // InternalAiDsl.g:1355:1: ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) )
            {
            // InternalAiDsl.g:1355:1: ( ( rule__VMNodeElement__DefaultvalueAssignment_3_1 ) )
            // InternalAiDsl.g:1356:2: ( rule__VMNodeElement__DefaultvalueAssignment_3_1 )
            {
             before(grammarAccess.getVMNodeElementAccess().getDefaultvalueAssignment_3_1()); 
            // InternalAiDsl.g:1357:2: ( rule__VMNodeElement__DefaultvalueAssignment_3_1 )
            // InternalAiDsl.g:1357:3: rule__VMNodeElement__DefaultvalueAssignment_3_1
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
    // InternalAiDsl.g:1366:1: rule__VMOverrideElement__Group__0 : rule__VMOverrideElement__Group__0__Impl rule__VMOverrideElement__Group__1 ;
    public final void rule__VMOverrideElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1370:1: ( rule__VMOverrideElement__Group__0__Impl rule__VMOverrideElement__Group__1 )
            // InternalAiDsl.g:1371:2: rule__VMOverrideElement__Group__0__Impl rule__VMOverrideElement__Group__1
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
    // InternalAiDsl.g:1378:1: rule__VMOverrideElement__Group__0__Impl : ( ( rule__VMOverrideElement__PolicyAssignment_0 ) ) ;
    public final void rule__VMOverrideElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1382:1: ( ( ( rule__VMOverrideElement__PolicyAssignment_0 ) ) )
            // InternalAiDsl.g:1383:1: ( ( rule__VMOverrideElement__PolicyAssignment_0 ) )
            {
            // InternalAiDsl.g:1383:1: ( ( rule__VMOverrideElement__PolicyAssignment_0 ) )
            // InternalAiDsl.g:1384:2: ( rule__VMOverrideElement__PolicyAssignment_0 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getPolicyAssignment_0()); 
            // InternalAiDsl.g:1385:2: ( rule__VMOverrideElement__PolicyAssignment_0 )
            // InternalAiDsl.g:1385:3: rule__VMOverrideElement__PolicyAssignment_0
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
    // InternalAiDsl.g:1393:1: rule__VMOverrideElement__Group__1 : rule__VMOverrideElement__Group__1__Impl rule__VMOverrideElement__Group__2 ;
    public final void rule__VMOverrideElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1397:1: ( rule__VMOverrideElement__Group__1__Impl rule__VMOverrideElement__Group__2 )
            // InternalAiDsl.g:1398:2: rule__VMOverrideElement__Group__1__Impl rule__VMOverrideElement__Group__2
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
    // InternalAiDsl.g:1405:1: rule__VMOverrideElement__Group__1__Impl : ( ( rule__VMOverrideElement__TypeAssignment_1 ) ) ;
    public final void rule__VMOverrideElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1409:1: ( ( ( rule__VMOverrideElement__TypeAssignment_1 ) ) )
            // InternalAiDsl.g:1410:1: ( ( rule__VMOverrideElement__TypeAssignment_1 ) )
            {
            // InternalAiDsl.g:1410:1: ( ( rule__VMOverrideElement__TypeAssignment_1 ) )
            // InternalAiDsl.g:1411:2: ( rule__VMOverrideElement__TypeAssignment_1 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getTypeAssignment_1()); 
            // InternalAiDsl.g:1412:2: ( rule__VMOverrideElement__TypeAssignment_1 )
            // InternalAiDsl.g:1412:3: rule__VMOverrideElement__TypeAssignment_1
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
    // InternalAiDsl.g:1420:1: rule__VMOverrideElement__Group__2 : rule__VMOverrideElement__Group__2__Impl rule__VMOverrideElement__Group__3 ;
    public final void rule__VMOverrideElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1424:1: ( rule__VMOverrideElement__Group__2__Impl rule__VMOverrideElement__Group__3 )
            // InternalAiDsl.g:1425:2: rule__VMOverrideElement__Group__2__Impl rule__VMOverrideElement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalAiDsl.g:1432:1: rule__VMOverrideElement__Group__2__Impl : ( ( rule__VMOverrideElement__NameAssignment_2 ) ) ;
    public final void rule__VMOverrideElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1436:1: ( ( ( rule__VMOverrideElement__NameAssignment_2 ) ) )
            // InternalAiDsl.g:1437:1: ( ( rule__VMOverrideElement__NameAssignment_2 ) )
            {
            // InternalAiDsl.g:1437:1: ( ( rule__VMOverrideElement__NameAssignment_2 ) )
            // InternalAiDsl.g:1438:2: ( rule__VMOverrideElement__NameAssignment_2 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getNameAssignment_2()); 
            // InternalAiDsl.g:1439:2: ( rule__VMOverrideElement__NameAssignment_2 )
            // InternalAiDsl.g:1439:3: rule__VMOverrideElement__NameAssignment_2
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
    // InternalAiDsl.g:1447:1: rule__VMOverrideElement__Group__3 : rule__VMOverrideElement__Group__3__Impl rule__VMOverrideElement__Group__4 ;
    public final void rule__VMOverrideElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1451:1: ( rule__VMOverrideElement__Group__3__Impl rule__VMOverrideElement__Group__4 )
            // InternalAiDsl.g:1452:2: rule__VMOverrideElement__Group__3__Impl rule__VMOverrideElement__Group__4
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
    // InternalAiDsl.g:1459:1: rule__VMOverrideElement__Group__3__Impl : ( ':=' ) ;
    public final void rule__VMOverrideElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1463:1: ( ( ':=' ) )
            // InternalAiDsl.g:1464:1: ( ':=' )
            {
            // InternalAiDsl.g:1464:1: ( ':=' )
            // InternalAiDsl.g:1465:2: ':='
            {
             before(grammarAccess.getVMOverrideElementAccess().getColonEqualsSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAiDsl.g:1474:1: rule__VMOverrideElement__Group__4 : rule__VMOverrideElement__Group__4__Impl ;
    public final void rule__VMOverrideElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1478:1: ( rule__VMOverrideElement__Group__4__Impl )
            // InternalAiDsl.g:1479:2: rule__VMOverrideElement__Group__4__Impl
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
    // InternalAiDsl.g:1485:1: rule__VMOverrideElement__Group__4__Impl : ( ( rule__VMOverrideElement__DefaultvalueAssignment_4 ) ) ;
    public final void rule__VMOverrideElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1489:1: ( ( ( rule__VMOverrideElement__DefaultvalueAssignment_4 ) ) )
            // InternalAiDsl.g:1490:1: ( ( rule__VMOverrideElement__DefaultvalueAssignment_4 ) )
            {
            // InternalAiDsl.g:1490:1: ( ( rule__VMOverrideElement__DefaultvalueAssignment_4 ) )
            // InternalAiDsl.g:1491:2: ( rule__VMOverrideElement__DefaultvalueAssignment_4 )
            {
             before(grammarAccess.getVMOverrideElementAccess().getDefaultvalueAssignment_4()); 
            // InternalAiDsl.g:1492:2: ( rule__VMOverrideElement__DefaultvalueAssignment_4 )
            // InternalAiDsl.g:1492:3: rule__VMOverrideElement__DefaultvalueAssignment_4
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
    // InternalAiDsl.g:1501:1: rule__LlmTaskDefinition__Group__0 : rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1 ;
    public final void rule__LlmTaskDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1505:1: ( rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1 )
            // InternalAiDsl.g:1506:2: rule__LlmTaskDefinition__Group__0__Impl rule__LlmTaskDefinition__Group__1
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
    // InternalAiDsl.g:1513:1: rule__LlmTaskDefinition__Group__0__Impl : ( 'llmtask' ) ;
    public final void rule__LlmTaskDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1517:1: ( ( 'llmtask' ) )
            // InternalAiDsl.g:1518:1: ( 'llmtask' )
            {
            // InternalAiDsl.g:1518:1: ( 'llmtask' )
            // InternalAiDsl.g:1519:2: 'llmtask'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getLlmtaskKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAiDsl.g:1528:1: rule__LlmTaskDefinition__Group__1 : rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2 ;
    public final void rule__LlmTaskDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1532:1: ( rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2 )
            // InternalAiDsl.g:1533:2: rule__LlmTaskDefinition__Group__1__Impl rule__LlmTaskDefinition__Group__2
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
    // InternalAiDsl.g:1540:1: rule__LlmTaskDefinition__Group__1__Impl : ( ( rule__LlmTaskDefinition__NameAssignment_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1544:1: ( ( ( rule__LlmTaskDefinition__NameAssignment_1 ) ) )
            // InternalAiDsl.g:1545:1: ( ( rule__LlmTaskDefinition__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:1545:1: ( ( rule__LlmTaskDefinition__NameAssignment_1 ) )
            // InternalAiDsl.g:1546:2: ( rule__LlmTaskDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:1547:2: ( rule__LlmTaskDefinition__NameAssignment_1 )
            // InternalAiDsl.g:1547:3: rule__LlmTaskDefinition__NameAssignment_1
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
    // InternalAiDsl.g:1555:1: rule__LlmTaskDefinition__Group__2 : rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3 ;
    public final void rule__LlmTaskDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1559:1: ( rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3 )
            // InternalAiDsl.g:1560:2: rule__LlmTaskDefinition__Group__2__Impl rule__LlmTaskDefinition__Group__3
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
    // InternalAiDsl.g:1567:1: rule__LlmTaskDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__LlmTaskDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1571:1: ( ( '(' ) )
            // InternalAiDsl.g:1572:1: ( '(' )
            {
            // InternalAiDsl.g:1572:1: ( '(' )
            // InternalAiDsl.g:1573:2: '('
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
    // InternalAiDsl.g:1582:1: rule__LlmTaskDefinition__Group__3 : rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4 ;
    public final void rule__LlmTaskDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1586:1: ( rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4 )
            // InternalAiDsl.g:1587:2: rule__LlmTaskDefinition__Group__3__Impl rule__LlmTaskDefinition__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalAiDsl.g:1594:1: rule__LlmTaskDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__LlmTaskDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1598:1: ( ( ')' ) )
            // InternalAiDsl.g:1599:1: ( ')' )
            {
            // InternalAiDsl.g:1599:1: ( ')' )
            // InternalAiDsl.g:1600:2: ')'
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
    // InternalAiDsl.g:1609:1: rule__LlmTaskDefinition__Group__4 : rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5 ;
    public final void rule__LlmTaskDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1613:1: ( rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5 )
            // InternalAiDsl.g:1614:2: rule__LlmTaskDefinition__Group__4__Impl rule__LlmTaskDefinition__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalAiDsl.g:1621:1: rule__LlmTaskDefinition__Group__4__Impl : ( ( rule__LlmTaskDefinition__Group_4__0 )? ) ;
    public final void rule__LlmTaskDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1625:1: ( ( ( rule__LlmTaskDefinition__Group_4__0 )? ) )
            // InternalAiDsl.g:1626:1: ( ( rule__LlmTaskDefinition__Group_4__0 )? )
            {
            // InternalAiDsl.g:1626:1: ( ( rule__LlmTaskDefinition__Group_4__0 )? )
            // InternalAiDsl.g:1627:2: ( rule__LlmTaskDefinition__Group_4__0 )?
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup_4()); 
            // InternalAiDsl.g:1628:2: ( rule__LlmTaskDefinition__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAiDsl.g:1628:3: rule__LlmTaskDefinition__Group_4__0
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
    // InternalAiDsl.g:1636:1: rule__LlmTaskDefinition__Group__5 : rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6 ;
    public final void rule__LlmTaskDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1640:1: ( rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6 )
            // InternalAiDsl.g:1641:2: rule__LlmTaskDefinition__Group__5__Impl rule__LlmTaskDefinition__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalAiDsl.g:1648:1: rule__LlmTaskDefinition__Group__5__Impl : ( '{' ) ;
    public final void rule__LlmTaskDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1652:1: ( ( '{' ) )
            // InternalAiDsl.g:1653:1: ( '{' )
            {
            // InternalAiDsl.g:1653:1: ( '{' )
            // InternalAiDsl.g:1654:2: '{'
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
    // InternalAiDsl.g:1663:1: rule__LlmTaskDefinition__Group__6 : rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7 ;
    public final void rule__LlmTaskDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1667:1: ( rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7 )
            // InternalAiDsl.g:1668:2: rule__LlmTaskDefinition__Group__6__Impl rule__LlmTaskDefinition__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalAiDsl.g:1675:1: rule__LlmTaskDefinition__Group__6__Impl : ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* ) ;
    public final void rule__LlmTaskDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1679:1: ( ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* ) )
            // InternalAiDsl.g:1680:1: ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* )
            {
            // InternalAiDsl.g:1680:1: ( ( rule__LlmTaskDefinition__AssignmentAssignment_6 )* )
            // InternalAiDsl.g:1681:2: ( rule__LlmTaskDefinition__AssignmentAssignment_6 )*
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAssignmentAssignment_6()); 
            // InternalAiDsl.g:1682:2: ( rule__LlmTaskDefinition__AssignmentAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAiDsl.g:1682:3: rule__LlmTaskDefinition__AssignmentAssignment_6
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalAiDsl.g:1690:1: rule__LlmTaskDefinition__Group__7 : rule__LlmTaskDefinition__Group__7__Impl ;
    public final void rule__LlmTaskDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1694:1: ( rule__LlmTaskDefinition__Group__7__Impl )
            // InternalAiDsl.g:1695:2: rule__LlmTaskDefinition__Group__7__Impl
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
    // InternalAiDsl.g:1701:1: rule__LlmTaskDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__LlmTaskDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1705:1: ( ( '}' ) )
            // InternalAiDsl.g:1706:1: ( '}' )
            {
            // InternalAiDsl.g:1706:1: ( '}' )
            // InternalAiDsl.g:1707:2: '}'
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
    // InternalAiDsl.g:1717:1: rule__LlmTaskDefinition__Group_4__0 : rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1 ;
    public final void rule__LlmTaskDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1721:1: ( rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1 )
            // InternalAiDsl.g:1722:2: rule__LlmTaskDefinition__Group_4__0__Impl rule__LlmTaskDefinition__Group_4__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAiDsl.g:1729:1: rule__LlmTaskDefinition__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__LlmTaskDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1733:1: ( ( 'implements' ) )
            // InternalAiDsl.g:1734:1: ( 'implements' )
            {
            // InternalAiDsl.g:1734:1: ( 'implements' )
            // InternalAiDsl.g:1735:2: 'implements'
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getImplementsKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAiDsl.g:1744:1: rule__LlmTaskDefinition__Group_4__1 : rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2 ;
    public final void rule__LlmTaskDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1748:1: ( rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2 )
            // InternalAiDsl.g:1749:2: rule__LlmTaskDefinition__Group_4__1__Impl rule__LlmTaskDefinition__Group_4__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalAiDsl.g:1756:1: rule__LlmTaskDefinition__Group_4__1__Impl : ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1760:1: ( ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) ) )
            // InternalAiDsl.g:1761:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) )
            {
            // InternalAiDsl.g:1761:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 ) )
            // InternalAiDsl.g:1762:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAssignment_4_1()); 
            // InternalAiDsl.g:1763:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 )
            // InternalAiDsl.g:1763:3: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1
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
    // InternalAiDsl.g:1771:1: rule__LlmTaskDefinition__Group_4__2 : rule__LlmTaskDefinition__Group_4__2__Impl ;
    public final void rule__LlmTaskDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1775:1: ( rule__LlmTaskDefinition__Group_4__2__Impl )
            // InternalAiDsl.g:1776:2: rule__LlmTaskDefinition__Group_4__2__Impl
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
    // InternalAiDsl.g:1782:1: rule__LlmTaskDefinition__Group_4__2__Impl : ( ( rule__LlmTaskDefinition__Group_4_2__0 )* ) ;
    public final void rule__LlmTaskDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1786:1: ( ( ( rule__LlmTaskDefinition__Group_4_2__0 )* ) )
            // InternalAiDsl.g:1787:1: ( ( rule__LlmTaskDefinition__Group_4_2__0 )* )
            {
            // InternalAiDsl.g:1787:1: ( ( rule__LlmTaskDefinition__Group_4_2__0 )* )
            // InternalAiDsl.g:1788:2: ( rule__LlmTaskDefinition__Group_4_2__0 )*
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getGroup_4_2()); 
            // InternalAiDsl.g:1789:2: ( rule__LlmTaskDefinition__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAiDsl.g:1789:3: rule__LlmTaskDefinition__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_23);
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
    // InternalAiDsl.g:1798:1: rule__LlmTaskDefinition__Group_4_2__0 : rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1 ;
    public final void rule__LlmTaskDefinition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1802:1: ( rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1 )
            // InternalAiDsl.g:1803:2: rule__LlmTaskDefinition__Group_4_2__0__Impl rule__LlmTaskDefinition__Group_4_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAiDsl.g:1810:1: rule__LlmTaskDefinition__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__LlmTaskDefinition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1814:1: ( ( ',' ) )
            // InternalAiDsl.g:1815:1: ( ',' )
            {
            // InternalAiDsl.g:1815:1: ( ',' )
            // InternalAiDsl.g:1816:2: ','
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getCommaKeyword_4_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAiDsl.g:1825:1: rule__LlmTaskDefinition__Group_4_2__1 : rule__LlmTaskDefinition__Group_4_2__1__Impl ;
    public final void rule__LlmTaskDefinition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1829:1: ( rule__LlmTaskDefinition__Group_4_2__1__Impl )
            // InternalAiDsl.g:1830:2: rule__LlmTaskDefinition__Group_4_2__1__Impl
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
    // InternalAiDsl.g:1836:1: rule__LlmTaskDefinition__Group_4_2__1__Impl : ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) ) ;
    public final void rule__LlmTaskDefinition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1840:1: ( ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) ) )
            // InternalAiDsl.g:1841:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) )
            {
            // InternalAiDsl.g:1841:1: ( ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 ) )
            // InternalAiDsl.g:1842:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 )
            {
             before(grammarAccess.getLlmTaskDefinitionAccess().getAnnotation_interfacesAssignment_4_2_1()); 
            // InternalAiDsl.g:1843:2: ( rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 )
            // InternalAiDsl.g:1843:3: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1
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
    // InternalAiDsl.g:1852:1: rule__AnnotationInterfaceReference__Group__0 : rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1 ;
    public final void rule__AnnotationInterfaceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1856:1: ( rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1 )
            // InternalAiDsl.g:1857:2: rule__AnnotationInterfaceReference__Group__0__Impl rule__AnnotationInterfaceReference__Group__1
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
    // InternalAiDsl.g:1864:1: rule__AnnotationInterfaceReference__Group__0__Impl : ( '@' ) ;
    public final void rule__AnnotationInterfaceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1868:1: ( ( '@' ) )
            // InternalAiDsl.g:1869:1: ( '@' )
            {
            // InternalAiDsl.g:1869:1: ( '@' )
            // InternalAiDsl.g:1870:2: '@'
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getCommercialAtKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAiDsl.g:1879:1: rule__AnnotationInterfaceReference__Group__1 : rule__AnnotationInterfaceReference__Group__1__Impl ;
    public final void rule__AnnotationInterfaceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1883:1: ( rule__AnnotationInterfaceReference__Group__1__Impl )
            // InternalAiDsl.g:1884:2: rule__AnnotationInterfaceReference__Group__1__Impl
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
    // InternalAiDsl.g:1890:1: rule__AnnotationInterfaceReference__Group__1__Impl : ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) ) ;
    public final void rule__AnnotationInterfaceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1894:1: ( ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) ) )
            // InternalAiDsl.g:1895:1: ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) )
            {
            // InternalAiDsl.g:1895:1: ( ( rule__AnnotationInterfaceReference__NameAssignment_1 ) )
            // InternalAiDsl.g:1896:2: ( rule__AnnotationInterfaceReference__NameAssignment_1 )
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameAssignment_1()); 
            // InternalAiDsl.g:1897:2: ( rule__AnnotationInterfaceReference__NameAssignment_1 )
            // InternalAiDsl.g:1897:3: rule__AnnotationInterfaceReference__NameAssignment_1
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
    // InternalAiDsl.g:1906:1: rule__LlmVariableAssignment__Group__0 : rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1 ;
    public final void rule__LlmVariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1910:1: ( rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1 )
            // InternalAiDsl.g:1911:2: rule__LlmVariableAssignment__Group__0__Impl rule__LlmVariableAssignment__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalAiDsl.g:1918:1: rule__LlmVariableAssignment__Group__0__Impl : ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) ) ;
    public final void rule__LlmVariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1922:1: ( ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) ) )
            // InternalAiDsl.g:1923:1: ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) )
            {
            // InternalAiDsl.g:1923:1: ( ( rule__LlmVariableAssignment__VariablenameAssignment_0 ) )
            // InternalAiDsl.g:1924:2: ( rule__LlmVariableAssignment__VariablenameAssignment_0 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getVariablenameAssignment_0()); 
            // InternalAiDsl.g:1925:2: ( rule__LlmVariableAssignment__VariablenameAssignment_0 )
            // InternalAiDsl.g:1925:3: rule__LlmVariableAssignment__VariablenameAssignment_0
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
    // InternalAiDsl.g:1933:1: rule__LlmVariableAssignment__Group__1 : rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2 ;
    public final void rule__LlmVariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1937:1: ( rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2 )
            // InternalAiDsl.g:1938:2: rule__LlmVariableAssignment__Group__1__Impl rule__LlmVariableAssignment__Group__2
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
    // InternalAiDsl.g:1945:1: rule__LlmVariableAssignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__LlmVariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1949:1: ( ( ':=' ) )
            // InternalAiDsl.g:1950:1: ( ':=' )
            {
            // InternalAiDsl.g:1950:1: ( ':=' )
            // InternalAiDsl.g:1951:2: ':='
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getColonEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAiDsl.g:1960:1: rule__LlmVariableAssignment__Group__2 : rule__LlmVariableAssignment__Group__2__Impl ;
    public final void rule__LlmVariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1964:1: ( rule__LlmVariableAssignment__Group__2__Impl )
            // InternalAiDsl.g:1965:2: rule__LlmVariableAssignment__Group__2__Impl
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
    // InternalAiDsl.g:1971:1: rule__LlmVariableAssignment__Group__2__Impl : ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) ) ;
    public final void rule__LlmVariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1975:1: ( ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) ) )
            // InternalAiDsl.g:1976:1: ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) )
            {
            // InternalAiDsl.g:1976:1: ( ( rule__LlmVariableAssignment__TemplateAssignment_2 ) )
            // InternalAiDsl.g:1977:2: ( rule__LlmVariableAssignment__TemplateAssignment_2 )
            {
             before(grammarAccess.getLlmVariableAssignmentAccess().getTemplateAssignment_2()); 
            // InternalAiDsl.g:1978:2: ( rule__LlmVariableAssignment__TemplateAssignment_2 )
            // InternalAiDsl.g:1978:3: rule__LlmVariableAssignment__TemplateAssignment_2
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
    // InternalAiDsl.g:1987:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:1991:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAiDsl.g:1992:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAiDsl.g:1999:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2003:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2004:1: ( RULE_ID )
            {
            // InternalAiDsl.g:2004:1: ( RULE_ID )
            // InternalAiDsl.g:2005:2: RULE_ID
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
    // InternalAiDsl.g:2014:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2018:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAiDsl.g:2019:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAiDsl.g:2025:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2029:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAiDsl.g:2030:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAiDsl.g:2030:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAiDsl.g:2031:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAiDsl.g:2032:2: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAiDsl.g:2032:3: rule__QualifiedName__Group_1__0
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
    // InternalAiDsl.g:2041:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2045:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAiDsl.g:2046:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAiDsl.g:2053:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2057:1: ( ( '.' ) )
            // InternalAiDsl.g:2058:1: ( '.' )
            {
            // InternalAiDsl.g:2058:1: ( '.' )
            // InternalAiDsl.g:2059:2: '.'
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
    // InternalAiDsl.g:2068:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2072:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAiDsl.g:2073:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAiDsl.g:2079:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2083:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2084:1: ( RULE_ID )
            {
            // InternalAiDsl.g:2084:1: ( RULE_ID )
            // InternalAiDsl.g:2085:2: RULE_ID
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
    // InternalAiDsl.g:2095:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2099:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAiDsl.g:2100:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAiDsl.g:2107:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2111:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2112:1: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2112:1: ( ruleQualifiedName )
            // InternalAiDsl.g:2113:2: ruleQualifiedName
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
    // InternalAiDsl.g:2122:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2126:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAiDsl.g:2127:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAiDsl.g:2133:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2137:1: ( ( ( '.*' )? ) )
            // InternalAiDsl.g:2138:1: ( ( '.*' )? )
            {
            // InternalAiDsl.g:2138:1: ( ( '.*' )? )
            // InternalAiDsl.g:2139:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAiDsl.g:2140:2: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAiDsl.g:2140:3: '.*'
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
    // InternalAiDsl.g:2149:1: rule__Model__Package_declarationAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__Model__Package_declarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2153:1: ( ( rulePackageDeclaration ) )
            // InternalAiDsl.g:2154:2: ( rulePackageDeclaration )
            {
            // InternalAiDsl.g:2154:2: ( rulePackageDeclaration )
            // InternalAiDsl.g:2155:3: rulePackageDeclaration
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
    // InternalAiDsl.g:2164:1: rule__Model__Import_declarationsAssignment_1 : ( ruleImportDeclaration ) ;
    public final void rule__Model__Import_declarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2168:1: ( ( ruleImportDeclaration ) )
            // InternalAiDsl.g:2169:2: ( ruleImportDeclaration )
            {
            // InternalAiDsl.g:2169:2: ( ruleImportDeclaration )
            // InternalAiDsl.g:2170:3: ruleImportDeclaration
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
    // InternalAiDsl.g:2179:1: rule__Model__DefinitionsAssignment_2 : ( ( rule__Model__DefinitionsAlternatives_2_0 ) ) ;
    public final void rule__Model__DefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2183:1: ( ( ( rule__Model__DefinitionsAlternatives_2_0 ) ) )
            // InternalAiDsl.g:2184:2: ( ( rule__Model__DefinitionsAlternatives_2_0 ) )
            {
            // InternalAiDsl.g:2184:2: ( ( rule__Model__DefinitionsAlternatives_2_0 ) )
            // InternalAiDsl.g:2185:3: ( rule__Model__DefinitionsAlternatives_2_0 )
            {
             before(grammarAccess.getModelAccess().getDefinitionsAlternatives_2_0()); 
            // InternalAiDsl.g:2186:3: ( rule__Model__DefinitionsAlternatives_2_0 )
            // InternalAiDsl.g:2186:4: rule__Model__DefinitionsAlternatives_2_0
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
    // InternalAiDsl.g:2194:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2198:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2199:2: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2199:2: ( ruleQualifiedName )
            // InternalAiDsl.g:2200:3: ruleQualifiedName
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
    // InternalAiDsl.g:2209:1: rule__ImportDeclaration__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__ImportDeclaration__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2213:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAiDsl.g:2214:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAiDsl.g:2214:2: ( ruleQualifiedNameWithWildcard )
            // InternalAiDsl.g:2215:3: ruleQualifiedNameWithWildcard
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
    // InternalAiDsl.g:2224:1: rule__WorkflowDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkflowDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2228:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2229:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2229:2: ( RULE_ID )
            // InternalAiDsl.g:2230:3: RULE_ID
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
    // InternalAiDsl.g:2239:1: rule__VMNodeDefinition__NodetypeAssignment_1 : ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) ) ;
    public final void rule__VMNodeDefinition__NodetypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2243:1: ( ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) ) )
            // InternalAiDsl.g:2244:2: ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) )
            {
            // InternalAiDsl.g:2244:2: ( ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 ) )
            // InternalAiDsl.g:2245:3: ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 )
            {
             before(grammarAccess.getVMNodeDefinitionAccess().getNodetypeAlternatives_1_0()); 
            // InternalAiDsl.g:2246:3: ( rule__VMNodeDefinition__NodetypeAlternatives_1_0 )
            // InternalAiDsl.g:2246:4: rule__VMNodeDefinition__NodetypeAlternatives_1_0
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
    // InternalAiDsl.g:2254:1: rule__VMNodeDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VMNodeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2258:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2259:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2259:2: ( RULE_ID )
            // InternalAiDsl.g:2260:3: RULE_ID
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
    // InternalAiDsl.g:2269:1: rule__VMNodeDefinition__ElementsAssignment_4 : ( ruleVMNodeEleemnts ) ;
    public final void rule__VMNodeDefinition__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2273:1: ( ( ruleVMNodeEleemnts ) )
            // InternalAiDsl.g:2274:2: ( ruleVMNodeEleemnts )
            {
            // InternalAiDsl.g:2274:2: ( ruleVMNodeEleemnts )
            // InternalAiDsl.g:2275:3: ruleVMNodeEleemnts
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
    // InternalAiDsl.g:2284:1: rule__VMNodeOpCodeElement__CodeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VMNodeOpCodeElement__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2288:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2289:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2289:2: ( RULE_STRING )
            // InternalAiDsl.g:2290:3: RULE_STRING
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
    // InternalAiDsl.g:2299:1: rule__VMNodeOutElement__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__VMNodeOutElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2303:1: ( ( ruleQualifiedName ) )
            // InternalAiDsl.g:2304:2: ( ruleQualifiedName )
            {
            // InternalAiDsl.g:2304:2: ( ruleQualifiedName )
            // InternalAiDsl.g:2305:3: ruleQualifiedName
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
    // InternalAiDsl.g:2314:1: rule__VMNodeOutElement__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__VMNodeOutElement__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2318:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2319:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2319:2: ( RULE_ID )
            // InternalAiDsl.g:2320:3: RULE_ID
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
    // InternalAiDsl.g:2329:1: rule__VMNodeElement__PolicyAssignment_0 : ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) ) ;
    public final void rule__VMNodeElement__PolicyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2333:1: ( ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) ) )
            // InternalAiDsl.g:2334:2: ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) )
            {
            // InternalAiDsl.g:2334:2: ( ( rule__VMNodeElement__PolicyAlternatives_0_0 ) )
            // InternalAiDsl.g:2335:3: ( rule__VMNodeElement__PolicyAlternatives_0_0 )
            {
             before(grammarAccess.getVMNodeElementAccess().getPolicyAlternatives_0_0()); 
            // InternalAiDsl.g:2336:3: ( rule__VMNodeElement__PolicyAlternatives_0_0 )
            // InternalAiDsl.g:2336:4: rule__VMNodeElement__PolicyAlternatives_0_0
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
    // InternalAiDsl.g:2344:1: rule__VMNodeElement__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__VMNodeElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2348:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2349:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2349:2: ( RULE_ID )
            // InternalAiDsl.g:2350:3: RULE_ID
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
    // InternalAiDsl.g:2359:1: rule__VMNodeElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VMNodeElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2363:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2364:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2364:2: ( RULE_ID )
            // InternalAiDsl.g:2365:3: RULE_ID
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
    // InternalAiDsl.g:2374:1: rule__VMNodeElement__DefaultvalueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__VMNodeElement__DefaultvalueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2378:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2379:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2379:2: ( RULE_STRING )
            // InternalAiDsl.g:2380:3: RULE_STRING
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
    // InternalAiDsl.g:2389:1: rule__VMOverrideElement__PolicyAssignment_0 : ( ( 'override' ) ) ;
    public final void rule__VMOverrideElement__PolicyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2393:1: ( ( ( 'override' ) ) )
            // InternalAiDsl.g:2394:2: ( ( 'override' ) )
            {
            // InternalAiDsl.g:2394:2: ( ( 'override' ) )
            // InternalAiDsl.g:2395:3: ( 'override' )
            {
             before(grammarAccess.getVMOverrideElementAccess().getPolicyOverrideKeyword_0_0()); 
            // InternalAiDsl.g:2396:3: ( 'override' )
            // InternalAiDsl.g:2397:4: 'override'
            {
             before(grammarAccess.getVMOverrideElementAccess().getPolicyOverrideKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAiDsl.g:2408:1: rule__VMOverrideElement__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__VMOverrideElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2412:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2413:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2413:2: ( RULE_ID )
            // InternalAiDsl.g:2414:3: RULE_ID
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
    // InternalAiDsl.g:2423:1: rule__VMOverrideElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VMOverrideElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2427:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2428:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2428:2: ( RULE_ID )
            // InternalAiDsl.g:2429:3: RULE_ID
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
    // InternalAiDsl.g:2438:1: rule__VMOverrideElement__DefaultvalueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__VMOverrideElement__DefaultvalueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2442:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2443:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2443:2: ( RULE_STRING )
            // InternalAiDsl.g:2444:3: RULE_STRING
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
    // InternalAiDsl.g:2453:1: rule__LlmTaskDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LlmTaskDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2457:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2458:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2458:2: ( RULE_ID )
            // InternalAiDsl.g:2459:3: RULE_ID
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
    // InternalAiDsl.g:2468:1: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1 : ( ruleAnnotationInterfaceReference ) ;
    public final void rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2472:1: ( ( ruleAnnotationInterfaceReference ) )
            // InternalAiDsl.g:2473:2: ( ruleAnnotationInterfaceReference )
            {
            // InternalAiDsl.g:2473:2: ( ruleAnnotationInterfaceReference )
            // InternalAiDsl.g:2474:3: ruleAnnotationInterfaceReference
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
    // InternalAiDsl.g:2483:1: rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1 : ( ruleAnnotationInterfaceReference ) ;
    public final void rule__LlmTaskDefinition__Annotation_interfacesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2487:1: ( ( ruleAnnotationInterfaceReference ) )
            // InternalAiDsl.g:2488:2: ( ruleAnnotationInterfaceReference )
            {
            // InternalAiDsl.g:2488:2: ( ruleAnnotationInterfaceReference )
            // InternalAiDsl.g:2489:3: ruleAnnotationInterfaceReference
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
    // InternalAiDsl.g:2498:1: rule__LlmTaskDefinition__AssignmentAssignment_6 : ( ruleLlmVariableAssignment ) ;
    public final void rule__LlmTaskDefinition__AssignmentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2502:1: ( ( ruleLlmVariableAssignment ) )
            // InternalAiDsl.g:2503:2: ( ruleLlmVariableAssignment )
            {
            // InternalAiDsl.g:2503:2: ( ruleLlmVariableAssignment )
            // InternalAiDsl.g:2504:3: ruleLlmVariableAssignment
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
    // InternalAiDsl.g:2513:1: rule__AnnotationInterfaceReference__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AnnotationInterfaceReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2517:1: ( ( ( RULE_ID ) ) )
            // InternalAiDsl.g:2518:2: ( ( RULE_ID ) )
            {
            // InternalAiDsl.g:2518:2: ( ( RULE_ID ) )
            // InternalAiDsl.g:2519:3: ( RULE_ID )
            {
             before(grammarAccess.getAnnotationInterfaceReferenceAccess().getNameVMNodeDefinitionCrossReference_1_0()); 
            // InternalAiDsl.g:2520:3: ( RULE_ID )
            // InternalAiDsl.g:2521:4: RULE_ID
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
    // InternalAiDsl.g:2532:1: rule__LlmVariableAssignment__VariablenameAssignment_0 : ( RULE_ID ) ;
    public final void rule__LlmVariableAssignment__VariablenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2536:1: ( ( RULE_ID ) )
            // InternalAiDsl.g:2537:2: ( RULE_ID )
            {
            // InternalAiDsl.g:2537:2: ( RULE_ID )
            // InternalAiDsl.g:2538:3: RULE_ID
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
    // InternalAiDsl.g:2547:1: rule__LlmVariableAssignment__TemplateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LlmVariableAssignment__TemplateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiDsl.g:2551:1: ( ( RULE_STRING ) )
            // InternalAiDsl.g:2552:2: ( RULE_STRING )
            {
            // InternalAiDsl.g:2552:2: ( RULE_STRING )
            // InternalAiDsl.g:2553:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010430000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010420002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000401A06000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000401806002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});

}