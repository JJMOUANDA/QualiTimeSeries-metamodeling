package org.xtext.example.qualificationdata.ide.contentassist.antlr.internal;

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
import org.xtext.example.qualificationdata.services.MyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SerieTemporelle'", "'{'", "'}'", "','", "'qualifi\\u00E9'", "'Automatique'", "'QC='", "'Algo'", "'Manuel'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMy.g"; }


    	private MyGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSerieTemporelle"
    // InternalMy.g:53:1: entryRuleSerieTemporelle : ruleSerieTemporelle EOF ;
    public final void entryRuleSerieTemporelle() throws RecognitionException {
        try {
            // InternalMy.g:54:1: ( ruleSerieTemporelle EOF )
            // InternalMy.g:55:1: ruleSerieTemporelle EOF
            {
             before(grammarAccess.getSerieTemporelleRule()); 
            pushFollow(FOLLOW_1);
            ruleSerieTemporelle();

            state._fsp--;

             after(grammarAccess.getSerieTemporelleRule()); 
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
    // $ANTLR end "entryRuleSerieTemporelle"


    // $ANTLR start "ruleSerieTemporelle"
    // InternalMy.g:62:1: ruleSerieTemporelle : ( ( rule__SerieTemporelle__Group__0 ) ) ;
    public final void ruleSerieTemporelle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:66:2: ( ( ( rule__SerieTemporelle__Group__0 ) ) )
            // InternalMy.g:67:2: ( ( rule__SerieTemporelle__Group__0 ) )
            {
            // InternalMy.g:67:2: ( ( rule__SerieTemporelle__Group__0 ) )
            // InternalMy.g:68:3: ( rule__SerieTemporelle__Group__0 )
            {
             before(grammarAccess.getSerieTemporelleAccess().getGroup()); 
            // InternalMy.g:69:3: ( rule__SerieTemporelle__Group__0 )
            // InternalMy.g:69:4: rule__SerieTemporelle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSerieTemporelleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSerieTemporelle"


    // $ANTLR start "entryRuleMesure"
    // InternalMy.g:78:1: entryRuleMesure : ruleMesure EOF ;
    public final void entryRuleMesure() throws RecognitionException {
        try {
            // InternalMy.g:79:1: ( ruleMesure EOF )
            // InternalMy.g:80:1: ruleMesure EOF
            {
             before(grammarAccess.getMesureRule()); 
            pushFollow(FOLLOW_1);
            ruleMesure();

            state._fsp--;

             after(grammarAccess.getMesureRule()); 
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
    // $ANTLR end "entryRuleMesure"


    // $ANTLR start "ruleMesure"
    // InternalMy.g:87:1: ruleMesure : ( ( rule__Mesure__Group__0 ) ) ;
    public final void ruleMesure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:91:2: ( ( ( rule__Mesure__Group__0 ) ) )
            // InternalMy.g:92:2: ( ( rule__Mesure__Group__0 ) )
            {
            // InternalMy.g:92:2: ( ( rule__Mesure__Group__0 ) )
            // InternalMy.g:93:3: ( rule__Mesure__Group__0 )
            {
             before(grammarAccess.getMesureAccess().getGroup()); 
            // InternalMy.g:94:3: ( rule__Mesure__Group__0 )
            // InternalMy.g:94:4: rule__Mesure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mesure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMesureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMesure"


    // $ANTLR start "entryRuleQualification"
    // InternalMy.g:103:1: entryRuleQualification : ruleQualification EOF ;
    public final void entryRuleQualification() throws RecognitionException {
        try {
            // InternalMy.g:104:1: ( ruleQualification EOF )
            // InternalMy.g:105:1: ruleQualification EOF
            {
             before(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getQualificationRule()); 
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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalMy.g:112:1: ruleQualification : ( ( rule__Qualification__Alternatives ) ) ;
    public final void ruleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:116:2: ( ( ( rule__Qualification__Alternatives ) ) )
            // InternalMy.g:117:2: ( ( rule__Qualification__Alternatives ) )
            {
            // InternalMy.g:117:2: ( ( rule__Qualification__Alternatives ) )
            // InternalMy.g:118:3: ( rule__Qualification__Alternatives )
            {
             before(grammarAccess.getQualificationAccess().getAlternatives()); 
            // InternalMy.g:119:3: ( rule__Qualification__Alternatives )
            // InternalMy.g:119:4: rule__Qualification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Qualification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleAutoQualification"
    // InternalMy.g:128:1: entryRuleAutoQualification : ruleAutoQualification EOF ;
    public final void entryRuleAutoQualification() throws RecognitionException {
        try {
            // InternalMy.g:129:1: ( ruleAutoQualification EOF )
            // InternalMy.g:130:1: ruleAutoQualification EOF
            {
             before(grammarAccess.getAutoQualificationRule()); 
            pushFollow(FOLLOW_1);
            ruleAutoQualification();

            state._fsp--;

             after(grammarAccess.getAutoQualificationRule()); 
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
    // $ANTLR end "entryRuleAutoQualification"


    // $ANTLR start "ruleAutoQualification"
    // InternalMy.g:137:1: ruleAutoQualification : ( ( rule__AutoQualification__Group__0 ) ) ;
    public final void ruleAutoQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:141:2: ( ( ( rule__AutoQualification__Group__0 ) ) )
            // InternalMy.g:142:2: ( ( rule__AutoQualification__Group__0 ) )
            {
            // InternalMy.g:142:2: ( ( rule__AutoQualification__Group__0 ) )
            // InternalMy.g:143:3: ( rule__AutoQualification__Group__0 )
            {
             before(grammarAccess.getAutoQualificationAccess().getGroup()); 
            // InternalMy.g:144:3: ( rule__AutoQualification__Group__0 )
            // InternalMy.g:144:4: rule__AutoQualification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutoQualification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutoQualificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutoQualification"


    // $ANTLR start "entryRuleManuelleQualification"
    // InternalMy.g:153:1: entryRuleManuelleQualification : ruleManuelleQualification EOF ;
    public final void entryRuleManuelleQualification() throws RecognitionException {
        try {
            // InternalMy.g:154:1: ( ruleManuelleQualification EOF )
            // InternalMy.g:155:1: ruleManuelleQualification EOF
            {
             before(grammarAccess.getManuelleQualificationRule()); 
            pushFollow(FOLLOW_1);
            ruleManuelleQualification();

            state._fsp--;

             after(grammarAccess.getManuelleQualificationRule()); 
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
    // $ANTLR end "entryRuleManuelleQualification"


    // $ANTLR start "ruleManuelleQualification"
    // InternalMy.g:162:1: ruleManuelleQualification : ( ( rule__ManuelleQualification__Group__0 ) ) ;
    public final void ruleManuelleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:166:2: ( ( ( rule__ManuelleQualification__Group__0 ) ) )
            // InternalMy.g:167:2: ( ( rule__ManuelleQualification__Group__0 ) )
            {
            // InternalMy.g:167:2: ( ( rule__ManuelleQualification__Group__0 ) )
            // InternalMy.g:168:3: ( rule__ManuelleQualification__Group__0 )
            {
             before(grammarAccess.getManuelleQualificationAccess().getGroup()); 
            // InternalMy.g:169:3: ( rule__ManuelleQualification__Group__0 )
            // InternalMy.g:169:4: rule__ManuelleQualification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManuelleQualification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManuelleQualificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManuelleQualification"


    // $ANTLR start "entryRuleEString"
    // InternalMy.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMy.g:179:1: ( ruleEString EOF )
            // InternalMy.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMy.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMy.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMy.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMy.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMy.g:194:3: ( rule__EString__Alternatives )
            // InternalMy.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMy.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMy.g:204:1: ( ruleEInt EOF )
            // InternalMy.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMy.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMy.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMy.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalMy.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMy.g:219:3: ( rule__EInt__Group__0 )
            // InternalMy.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDate"
    // InternalMy.g:228:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalMy.g:229:1: ( ruleEDate EOF )
            // InternalMy.g:230:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMy.g:237:1: ruleEDate : ( ( rule__EDate__Alternatives ) ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:241:2: ( ( ( rule__EDate__Alternatives ) ) )
            // InternalMy.g:242:2: ( ( rule__EDate__Alternatives ) )
            {
            // InternalMy.g:242:2: ( ( rule__EDate__Alternatives ) )
            // InternalMy.g:243:3: ( rule__EDate__Alternatives )
            {
             before(grammarAccess.getEDateAccess().getAlternatives()); 
            // InternalMy.g:244:3: ( rule__EDate__Alternatives )
            // InternalMy.g:244:4: rule__EDate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "rule__Qualification__Alternatives"
    // InternalMy.g:252:1: rule__Qualification__Alternatives : ( ( ruleAutoQualification ) | ( ruleManuelleQualification ) );
    public final void rule__Qualification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:256:1: ( ( ruleAutoQualification ) | ( ruleManuelleQualification ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMy.g:257:2: ( ruleAutoQualification )
                    {
                    // InternalMy.g:257:2: ( ruleAutoQualification )
                    // InternalMy.g:258:3: ruleAutoQualification
                    {
                     before(grammarAccess.getQualificationAccess().getAutoQualificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAutoQualification();

                    state._fsp--;

                     after(grammarAccess.getQualificationAccess().getAutoQualificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMy.g:263:2: ( ruleManuelleQualification )
                    {
                    // InternalMy.g:263:2: ( ruleManuelleQualification )
                    // InternalMy.g:264:3: ruleManuelleQualification
                    {
                     before(grammarAccess.getQualificationAccess().getManuelleQualificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleManuelleQualification();

                    state._fsp--;

                     after(grammarAccess.getQualificationAccess().getManuelleQualificationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Qualification__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMy.g:273:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:277:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMy.g:278:2: ( RULE_STRING )
                    {
                    // InternalMy.g:278:2: ( RULE_STRING )
                    // InternalMy.g:279:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMy.g:284:2: ( RULE_ID )
                    {
                    // InternalMy.g:284:2: ( RULE_ID )
                    // InternalMy.g:285:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDate__Alternatives"
    // InternalMy.g:294:1: rule__EDate__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EDate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:298:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMy.g:299:2: ( RULE_STRING )
                    {
                    // InternalMy.g:299:2: ( RULE_STRING )
                    // InternalMy.g:300:3: RULE_STRING
                    {
                     before(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMy.g:305:2: ( RULE_ID )
                    {
                    // InternalMy.g:305:2: ( RULE_ID )
                    // InternalMy.g:306:3: RULE_ID
                    {
                     before(grammarAccess.getEDateAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEDateAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDate__Alternatives"


    // $ANTLR start "rule__SerieTemporelle__Group__0"
    // InternalMy.g:315:1: rule__SerieTemporelle__Group__0 : rule__SerieTemporelle__Group__0__Impl rule__SerieTemporelle__Group__1 ;
    public final void rule__SerieTemporelle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:319:1: ( rule__SerieTemporelle__Group__0__Impl rule__SerieTemporelle__Group__1 )
            // InternalMy.g:320:2: rule__SerieTemporelle__Group__0__Impl rule__SerieTemporelle__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SerieTemporelle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group__1();

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
    // $ANTLR end "rule__SerieTemporelle__Group__0"


    // $ANTLR start "rule__SerieTemporelle__Group__0__Impl"
    // InternalMy.g:327:1: rule__SerieTemporelle__Group__0__Impl : ( 'SerieTemporelle' ) ;
    public final void rule__SerieTemporelle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:331:1: ( ( 'SerieTemporelle' ) )
            // InternalMy.g:332:1: ( 'SerieTemporelle' )
            {
            // InternalMy.g:332:1: ( 'SerieTemporelle' )
            // InternalMy.g:333:2: 'SerieTemporelle'
            {
             before(grammarAccess.getSerieTemporelleAccess().getSerieTemporelleKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSerieTemporelleAccess().getSerieTemporelleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__Group__0__Impl"


    // $ANTLR start "rule__SerieTemporelle__Group__1"
    // InternalMy.g:342:1: rule__SerieTemporelle__Group__1 : rule__SerieTemporelle__Group__1__Impl rule__SerieTemporelle__Group__2 ;
    public final void rule__SerieTemporelle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:346:1: ( rule__SerieTemporelle__Group__1__Impl rule__SerieTemporelle__Group__2 )
            // InternalMy.g:347:2: rule__SerieTemporelle__Group__1__Impl rule__SerieTemporelle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SerieTemporelle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group__2();

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
    // $ANTLR end "rule__SerieTemporelle__Group__1"


    // $ANTLR start "rule__SerieTemporelle__Group__1__Impl"
    // InternalMy.g:354:1: rule__SerieTemporelle__Group__1__Impl : ( ( rule__SerieTemporelle__IdAssignment_1 ) ) ;
    public final void rule__SerieTemporelle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:358:1: ( ( ( rule__SerieTemporelle__IdAssignment_1 ) ) )
            // InternalMy.g:359:1: ( ( rule__SerieTemporelle__IdAssignment_1 ) )
            {
            // InternalMy.g:359:1: ( ( rule__SerieTemporelle__IdAssignment_1 ) )
            // InternalMy.g:360:2: ( rule__SerieTemporelle__IdAssignment_1 )
            {
             before(grammarAccess.getSerieTemporelleAccess().getIdAssignment_1()); 
            // InternalMy.g:361:2: ( rule__SerieTemporelle__IdAssignment_1 )
            // InternalMy.g:361:3: rule__SerieTemporelle__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSerieTemporelleAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__Group__1__Impl"


    // $ANTLR start "rule__SerieTemporelle__Group__2"
    // InternalMy.g:369:1: rule__SerieTemporelle__Group__2 : rule__SerieTemporelle__Group__2__Impl rule__SerieTemporelle__Group__3 ;
    public final void rule__SerieTemporelle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:373:1: ( rule__SerieTemporelle__Group__2__Impl rule__SerieTemporelle__Group__3 )
            // InternalMy.g:374:2: rule__SerieTemporelle__Group__2__Impl rule__SerieTemporelle__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SerieTemporelle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group__3();

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
    // $ANTLR end "rule__SerieTemporelle__Group__2"


    // $ANTLR start "rule__SerieTemporelle__Group__2__Impl"
    // InternalMy.g:381:1: rule__SerieTemporelle__Group__2__Impl : ( '{' ) ;
    public final void rule__SerieTemporelle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:385:1: ( ( '{' ) )
            // InternalMy.g:386:1: ( '{' )
            {
            // InternalMy.g:386:1: ( '{' )
            // InternalMy.g:387:2: '{'
            {
             before(grammarAccess.getSerieTemporelleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSerieTemporelleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__Group__2__Impl"


    // $ANTLR start "rule__SerieTemporelle__Group__3"
    // InternalMy.g:396:1: rule__SerieTemporelle__Group__3 : rule__SerieTemporelle__Group__3__Impl rule__SerieTemporelle__Group__4 ;
    public final void rule__SerieTemporelle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:400:1: ( rule__SerieTemporelle__Group__3__Impl rule__SerieTemporelle__Group__4 )
            // InternalMy.g:401:2: rule__SerieTemporelle__Group__3__Impl rule__SerieTemporelle__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SerieTemporelle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group__4();

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
    // $ANTLR end "rule__SerieTemporelle__Group__3"


    // $ANTLR start "rule__SerieTemporelle__Group__3__Impl"
    // InternalMy.g:408:1: rule__SerieTemporelle__Group__3__Impl : ( ( rule__SerieTemporelle__MesureAssignment_3 ) ) ;
    public final void rule__SerieTemporelle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:412:1: ( ( ( rule__SerieTemporelle__MesureAssignment_3 ) ) )
            // InternalMy.g:413:1: ( ( rule__SerieTemporelle__MesureAssignment_3 ) )
            {
            // InternalMy.g:413:1: ( ( rule__SerieTemporelle__MesureAssignment_3 ) )
            // InternalMy.g:414:2: ( rule__SerieTemporelle__MesureAssignment_3 )
            {
             before(grammarAccess.getSerieTemporelleAccess().getMesureAssignment_3()); 
            // InternalMy.g:415:2: ( rule__SerieTemporelle__MesureAssignment_3 )
            // InternalMy.g:415:3: rule__SerieTemporelle__MesureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__MesureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSerieTemporelleAccess().getMesureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__Group__3__Impl"


    // $ANTLR start "rule__SerieTemporelle__Group__4"
    // InternalMy.g:423:1: rule__SerieTemporelle__Group__4 : rule__SerieTemporelle__Group__4__Impl rule__SerieTemporelle__Group__5 ;
    public final void rule__SerieTemporelle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:427:1: ( rule__SerieTemporelle__Group__4__Impl rule__SerieTemporelle__Group__5 )
            // InternalMy.g:428:2: rule__SerieTemporelle__Group__4__Impl rule__SerieTemporelle__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SerieTemporelle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group__5();

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
    // $ANTLR end "rule__SerieTemporelle__Group__4"


    // $ANTLR start "rule__SerieTemporelle__Group__4__Impl"
    // InternalMy.g:435:1: rule__SerieTemporelle__Group__4__Impl : ( ( rule__SerieTemporelle__Group_4__0 )* ) ;
    public final void rule__SerieTemporelle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:439:1: ( ( ( rule__SerieTemporelle__Group_4__0 )* ) )
            // InternalMy.g:440:1: ( ( rule__SerieTemporelle__Group_4__0 )* )
            {
            // InternalMy.g:440:1: ( ( rule__SerieTemporelle__Group_4__0 )* )
            // InternalMy.g:441:2: ( rule__SerieTemporelle__Group_4__0 )*
            {
             before(grammarAccess.getSerieTemporelleAccess().getGroup_4()); 
            // InternalMy.g:442:2: ( rule__SerieTemporelle__Group_4__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMy.g:442:3: rule__SerieTemporelle__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SerieTemporelle__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSerieTemporelleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__Group__4__Impl"


    // $ANTLR start "rule__SerieTemporelle__Group__5"
    // InternalMy.g:450:1: rule__SerieTemporelle__Group__5 : rule__SerieTemporelle__Group__5__Impl ;
    public final void rule__SerieTemporelle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:454:1: ( rule__SerieTemporelle__Group__5__Impl )
            // InternalMy.g:455:2: rule__SerieTemporelle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group__5__Impl();

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
    // $ANTLR end "rule__SerieTemporelle__Group__5"


    // $ANTLR start "rule__SerieTemporelle__Group__5__Impl"
    // InternalMy.g:461:1: rule__SerieTemporelle__Group__5__Impl : ( '}' ) ;
    public final void rule__SerieTemporelle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:465:1: ( ( '}' ) )
            // InternalMy.g:466:1: ( '}' )
            {
            // InternalMy.g:466:1: ( '}' )
            // InternalMy.g:467:2: '}'
            {
             before(grammarAccess.getSerieTemporelleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSerieTemporelleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__Group__5__Impl"


    // $ANTLR start "rule__SerieTemporelle__Group_4__0"
    // InternalMy.g:477:1: rule__SerieTemporelle__Group_4__0 : rule__SerieTemporelle__Group_4__0__Impl rule__SerieTemporelle__Group_4__1 ;
    public final void rule__SerieTemporelle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:481:1: ( rule__SerieTemporelle__Group_4__0__Impl rule__SerieTemporelle__Group_4__1 )
            // InternalMy.g:482:2: rule__SerieTemporelle__Group_4__0__Impl rule__SerieTemporelle__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__SerieTemporelle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group_4__1();

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
    // $ANTLR end "rule__SerieTemporelle__Group_4__0"


    // $ANTLR start "rule__SerieTemporelle__Group_4__0__Impl"
    // InternalMy.g:489:1: rule__SerieTemporelle__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SerieTemporelle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:493:1: ( ( ',' ) )
            // InternalMy.g:494:1: ( ',' )
            {
            // InternalMy.g:494:1: ( ',' )
            // InternalMy.g:495:2: ','
            {
             before(grammarAccess.getSerieTemporelleAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSerieTemporelleAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__Group_4__0__Impl"


    // $ANTLR start "rule__SerieTemporelle__Group_4__1"
    // InternalMy.g:504:1: rule__SerieTemporelle__Group_4__1 : rule__SerieTemporelle__Group_4__1__Impl ;
    public final void rule__SerieTemporelle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:508:1: ( rule__SerieTemporelle__Group_4__1__Impl )
            // InternalMy.g:509:2: rule__SerieTemporelle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__Group_4__1__Impl();

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
    // $ANTLR end "rule__SerieTemporelle__Group_4__1"


    // $ANTLR start "rule__SerieTemporelle__Group_4__1__Impl"
    // InternalMy.g:515:1: rule__SerieTemporelle__Group_4__1__Impl : ( ( rule__SerieTemporelle__MesureAssignment_4_1 ) ) ;
    public final void rule__SerieTemporelle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:519:1: ( ( ( rule__SerieTemporelle__MesureAssignment_4_1 ) ) )
            // InternalMy.g:520:1: ( ( rule__SerieTemporelle__MesureAssignment_4_1 ) )
            {
            // InternalMy.g:520:1: ( ( rule__SerieTemporelle__MesureAssignment_4_1 ) )
            // InternalMy.g:521:2: ( rule__SerieTemporelle__MesureAssignment_4_1 )
            {
             before(grammarAccess.getSerieTemporelleAccess().getMesureAssignment_4_1()); 
            // InternalMy.g:522:2: ( rule__SerieTemporelle__MesureAssignment_4_1 )
            // InternalMy.g:522:3: rule__SerieTemporelle__MesureAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SerieTemporelle__MesureAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSerieTemporelleAccess().getMesureAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__Group_4__1__Impl"


    // $ANTLR start "rule__Mesure__Group__0"
    // InternalMy.g:531:1: rule__Mesure__Group__0 : rule__Mesure__Group__0__Impl rule__Mesure__Group__1 ;
    public final void rule__Mesure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:535:1: ( rule__Mesure__Group__0__Impl rule__Mesure__Group__1 )
            // InternalMy.g:536:2: rule__Mesure__Group__0__Impl rule__Mesure__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Mesure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesure__Group__1();

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
    // $ANTLR end "rule__Mesure__Group__0"


    // $ANTLR start "rule__Mesure__Group__0__Impl"
    // InternalMy.g:543:1: rule__Mesure__Group__0__Impl : ( ( rule__Mesure__ValeurAssignment_0 ) ) ;
    public final void rule__Mesure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:547:1: ( ( ( rule__Mesure__ValeurAssignment_0 ) ) )
            // InternalMy.g:548:1: ( ( rule__Mesure__ValeurAssignment_0 ) )
            {
            // InternalMy.g:548:1: ( ( rule__Mesure__ValeurAssignment_0 ) )
            // InternalMy.g:549:2: ( rule__Mesure__ValeurAssignment_0 )
            {
             before(grammarAccess.getMesureAccess().getValeurAssignment_0()); 
            // InternalMy.g:550:2: ( rule__Mesure__ValeurAssignment_0 )
            // InternalMy.g:550:3: rule__Mesure__ValeurAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mesure__ValeurAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMesureAccess().getValeurAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesure__Group__0__Impl"


    // $ANTLR start "rule__Mesure__Group__1"
    // InternalMy.g:558:1: rule__Mesure__Group__1 : rule__Mesure__Group__1__Impl rule__Mesure__Group__2 ;
    public final void rule__Mesure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:562:1: ( rule__Mesure__Group__1__Impl rule__Mesure__Group__2 )
            // InternalMy.g:563:2: rule__Mesure__Group__1__Impl rule__Mesure__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Mesure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesure__Group__2();

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
    // $ANTLR end "rule__Mesure__Group__1"


    // $ANTLR start "rule__Mesure__Group__1__Impl"
    // InternalMy.g:570:1: rule__Mesure__Group__1__Impl : ( ( rule__Mesure__TimestampAssignment_1 ) ) ;
    public final void rule__Mesure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:574:1: ( ( ( rule__Mesure__TimestampAssignment_1 ) ) )
            // InternalMy.g:575:1: ( ( rule__Mesure__TimestampAssignment_1 ) )
            {
            // InternalMy.g:575:1: ( ( rule__Mesure__TimestampAssignment_1 ) )
            // InternalMy.g:576:2: ( rule__Mesure__TimestampAssignment_1 )
            {
             before(grammarAccess.getMesureAccess().getTimestampAssignment_1()); 
            // InternalMy.g:577:2: ( rule__Mesure__TimestampAssignment_1 )
            // InternalMy.g:577:3: rule__Mesure__TimestampAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesure__TimestampAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMesureAccess().getTimestampAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesure__Group__1__Impl"


    // $ANTLR start "rule__Mesure__Group__2"
    // InternalMy.g:585:1: rule__Mesure__Group__2 : rule__Mesure__Group__2__Impl ;
    public final void rule__Mesure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:589:1: ( rule__Mesure__Group__2__Impl )
            // InternalMy.g:590:2: rule__Mesure__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesure__Group__2__Impl();

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
    // $ANTLR end "rule__Mesure__Group__2"


    // $ANTLR start "rule__Mesure__Group__2__Impl"
    // InternalMy.g:596:1: rule__Mesure__Group__2__Impl : ( ( rule__Mesure__Group_2__0 )? ) ;
    public final void rule__Mesure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:600:1: ( ( ( rule__Mesure__Group_2__0 )? ) )
            // InternalMy.g:601:1: ( ( rule__Mesure__Group_2__0 )? )
            {
            // InternalMy.g:601:1: ( ( rule__Mesure__Group_2__0 )? )
            // InternalMy.g:602:2: ( rule__Mesure__Group_2__0 )?
            {
             before(grammarAccess.getMesureAccess().getGroup_2()); 
            // InternalMy.g:603:2: ( rule__Mesure__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMy.g:603:3: rule__Mesure__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesure__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMesureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesure__Group__2__Impl"


    // $ANTLR start "rule__Mesure__Group_2__0"
    // InternalMy.g:612:1: rule__Mesure__Group_2__0 : rule__Mesure__Group_2__0__Impl rule__Mesure__Group_2__1 ;
    public final void rule__Mesure__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:616:1: ( rule__Mesure__Group_2__0__Impl rule__Mesure__Group_2__1 )
            // InternalMy.g:617:2: rule__Mesure__Group_2__0__Impl rule__Mesure__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Mesure__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesure__Group_2__1();

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
    // $ANTLR end "rule__Mesure__Group_2__0"


    // $ANTLR start "rule__Mesure__Group_2__0__Impl"
    // InternalMy.g:624:1: rule__Mesure__Group_2__0__Impl : ( 'qualifi\\u00E9' ) ;
    public final void rule__Mesure__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:628:1: ( ( 'qualifi\\u00E9' ) )
            // InternalMy.g:629:1: ( 'qualifi\\u00E9' )
            {
            // InternalMy.g:629:1: ( 'qualifi\\u00E9' )
            // InternalMy.g:630:2: 'qualifi\\u00E9'
            {
             before(grammarAccess.getMesureAccess().getQualifiKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMesureAccess().getQualifiKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesure__Group_2__0__Impl"


    // $ANTLR start "rule__Mesure__Group_2__1"
    // InternalMy.g:639:1: rule__Mesure__Group_2__1 : rule__Mesure__Group_2__1__Impl ;
    public final void rule__Mesure__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:643:1: ( rule__Mesure__Group_2__1__Impl )
            // InternalMy.g:644:2: rule__Mesure__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesure__Group_2__1__Impl();

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
    // $ANTLR end "rule__Mesure__Group_2__1"


    // $ANTLR start "rule__Mesure__Group_2__1__Impl"
    // InternalMy.g:650:1: rule__Mesure__Group_2__1__Impl : ( ( rule__Mesure__QualificationAssignment_2_1 ) ) ;
    public final void rule__Mesure__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:654:1: ( ( ( rule__Mesure__QualificationAssignment_2_1 ) ) )
            // InternalMy.g:655:1: ( ( rule__Mesure__QualificationAssignment_2_1 ) )
            {
            // InternalMy.g:655:1: ( ( rule__Mesure__QualificationAssignment_2_1 ) )
            // InternalMy.g:656:2: ( rule__Mesure__QualificationAssignment_2_1 )
            {
             before(grammarAccess.getMesureAccess().getQualificationAssignment_2_1()); 
            // InternalMy.g:657:2: ( rule__Mesure__QualificationAssignment_2_1 )
            // InternalMy.g:657:3: rule__Mesure__QualificationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesure__QualificationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMesureAccess().getQualificationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesure__Group_2__1__Impl"


    // $ANTLR start "rule__AutoQualification__Group__0"
    // InternalMy.g:666:1: rule__AutoQualification__Group__0 : rule__AutoQualification__Group__0__Impl rule__AutoQualification__Group__1 ;
    public final void rule__AutoQualification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:670:1: ( rule__AutoQualification__Group__0__Impl rule__AutoQualification__Group__1 )
            // InternalMy.g:671:2: rule__AutoQualification__Group__0__Impl rule__AutoQualification__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AutoQualification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoQualification__Group__1();

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
    // $ANTLR end "rule__AutoQualification__Group__0"


    // $ANTLR start "rule__AutoQualification__Group__0__Impl"
    // InternalMy.g:678:1: rule__AutoQualification__Group__0__Impl : ( 'Automatique' ) ;
    public final void rule__AutoQualification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:682:1: ( ( 'Automatique' ) )
            // InternalMy.g:683:1: ( 'Automatique' )
            {
            // InternalMy.g:683:1: ( 'Automatique' )
            // InternalMy.g:684:2: 'Automatique'
            {
             before(grammarAccess.getAutoQualificationAccess().getAutomatiqueKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAutoQualificationAccess().getAutomatiqueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoQualification__Group__0__Impl"


    // $ANTLR start "rule__AutoQualification__Group__1"
    // InternalMy.g:693:1: rule__AutoQualification__Group__1 : rule__AutoQualification__Group__1__Impl rule__AutoQualification__Group__2 ;
    public final void rule__AutoQualification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:697:1: ( rule__AutoQualification__Group__1__Impl rule__AutoQualification__Group__2 )
            // InternalMy.g:698:2: rule__AutoQualification__Group__1__Impl rule__AutoQualification__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AutoQualification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoQualification__Group__2();

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
    // $ANTLR end "rule__AutoQualification__Group__1"


    // $ANTLR start "rule__AutoQualification__Group__1__Impl"
    // InternalMy.g:705:1: rule__AutoQualification__Group__1__Impl : ( 'QC=' ) ;
    public final void rule__AutoQualification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:709:1: ( ( 'QC=' ) )
            // InternalMy.g:710:1: ( 'QC=' )
            {
            // InternalMy.g:710:1: ( 'QC=' )
            // InternalMy.g:711:2: 'QC='
            {
             before(grammarAccess.getAutoQualificationAccess().getQCKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAutoQualificationAccess().getQCKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoQualification__Group__1__Impl"


    // $ANTLR start "rule__AutoQualification__Group__2"
    // InternalMy.g:720:1: rule__AutoQualification__Group__2 : rule__AutoQualification__Group__2__Impl rule__AutoQualification__Group__3 ;
    public final void rule__AutoQualification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:724:1: ( rule__AutoQualification__Group__2__Impl rule__AutoQualification__Group__3 )
            // InternalMy.g:725:2: rule__AutoQualification__Group__2__Impl rule__AutoQualification__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AutoQualification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoQualification__Group__3();

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
    // $ANTLR end "rule__AutoQualification__Group__2"


    // $ANTLR start "rule__AutoQualification__Group__2__Impl"
    // InternalMy.g:732:1: rule__AutoQualification__Group__2__Impl : ( ( rule__AutoQualification__QualitycodeAssignment_2 ) ) ;
    public final void rule__AutoQualification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:736:1: ( ( ( rule__AutoQualification__QualitycodeAssignment_2 ) ) )
            // InternalMy.g:737:1: ( ( rule__AutoQualification__QualitycodeAssignment_2 ) )
            {
            // InternalMy.g:737:1: ( ( rule__AutoQualification__QualitycodeAssignment_2 ) )
            // InternalMy.g:738:2: ( rule__AutoQualification__QualitycodeAssignment_2 )
            {
             before(grammarAccess.getAutoQualificationAccess().getQualitycodeAssignment_2()); 
            // InternalMy.g:739:2: ( rule__AutoQualification__QualitycodeAssignment_2 )
            // InternalMy.g:739:3: rule__AutoQualification__QualitycodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AutoQualification__QualitycodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAutoQualificationAccess().getQualitycodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoQualification__Group__2__Impl"


    // $ANTLR start "rule__AutoQualification__Group__3"
    // InternalMy.g:747:1: rule__AutoQualification__Group__3 : rule__AutoQualification__Group__3__Impl ;
    public final void rule__AutoQualification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:751:1: ( rule__AutoQualification__Group__3__Impl )
            // InternalMy.g:752:2: rule__AutoQualification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutoQualification__Group__3__Impl();

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
    // $ANTLR end "rule__AutoQualification__Group__3"


    // $ANTLR start "rule__AutoQualification__Group__3__Impl"
    // InternalMy.g:758:1: rule__AutoQualification__Group__3__Impl : ( ( rule__AutoQualification__Group_3__0 )? ) ;
    public final void rule__AutoQualification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:762:1: ( ( ( rule__AutoQualification__Group_3__0 )? ) )
            // InternalMy.g:763:1: ( ( rule__AutoQualification__Group_3__0 )? )
            {
            // InternalMy.g:763:1: ( ( rule__AutoQualification__Group_3__0 )? )
            // InternalMy.g:764:2: ( rule__AutoQualification__Group_3__0 )?
            {
             before(grammarAccess.getAutoQualificationAccess().getGroup_3()); 
            // InternalMy.g:765:2: ( rule__AutoQualification__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMy.g:765:3: rule__AutoQualification__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutoQualification__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutoQualificationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoQualification__Group__3__Impl"


    // $ANTLR start "rule__AutoQualification__Group_3__0"
    // InternalMy.g:774:1: rule__AutoQualification__Group_3__0 : rule__AutoQualification__Group_3__0__Impl rule__AutoQualification__Group_3__1 ;
    public final void rule__AutoQualification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:778:1: ( rule__AutoQualification__Group_3__0__Impl rule__AutoQualification__Group_3__1 )
            // InternalMy.g:779:2: rule__AutoQualification__Group_3__0__Impl rule__AutoQualification__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__AutoQualification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoQualification__Group_3__1();

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
    // $ANTLR end "rule__AutoQualification__Group_3__0"


    // $ANTLR start "rule__AutoQualification__Group_3__0__Impl"
    // InternalMy.g:786:1: rule__AutoQualification__Group_3__0__Impl : ( 'Algo' ) ;
    public final void rule__AutoQualification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:790:1: ( ( 'Algo' ) )
            // InternalMy.g:791:1: ( 'Algo' )
            {
            // InternalMy.g:791:1: ( 'Algo' )
            // InternalMy.g:792:2: 'Algo'
            {
             before(grammarAccess.getAutoQualificationAccess().getAlgoKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAutoQualificationAccess().getAlgoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoQualification__Group_3__0__Impl"


    // $ANTLR start "rule__AutoQualification__Group_3__1"
    // InternalMy.g:801:1: rule__AutoQualification__Group_3__1 : rule__AutoQualification__Group_3__1__Impl ;
    public final void rule__AutoQualification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:805:1: ( rule__AutoQualification__Group_3__1__Impl )
            // InternalMy.g:806:2: rule__AutoQualification__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutoQualification__Group_3__1__Impl();

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
    // $ANTLR end "rule__AutoQualification__Group_3__1"


    // $ANTLR start "rule__AutoQualification__Group_3__1__Impl"
    // InternalMy.g:812:1: rule__AutoQualification__Group_3__1__Impl : ( ( rule__AutoQualification__AlgoAssignment_3_1 ) ) ;
    public final void rule__AutoQualification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:816:1: ( ( ( rule__AutoQualification__AlgoAssignment_3_1 ) ) )
            // InternalMy.g:817:1: ( ( rule__AutoQualification__AlgoAssignment_3_1 ) )
            {
            // InternalMy.g:817:1: ( ( rule__AutoQualification__AlgoAssignment_3_1 ) )
            // InternalMy.g:818:2: ( rule__AutoQualification__AlgoAssignment_3_1 )
            {
             before(grammarAccess.getAutoQualificationAccess().getAlgoAssignment_3_1()); 
            // InternalMy.g:819:2: ( rule__AutoQualification__AlgoAssignment_3_1 )
            // InternalMy.g:819:3: rule__AutoQualification__AlgoAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AutoQualification__AlgoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAutoQualificationAccess().getAlgoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoQualification__Group_3__1__Impl"


    // $ANTLR start "rule__ManuelleQualification__Group__0"
    // InternalMy.g:828:1: rule__ManuelleQualification__Group__0 : rule__ManuelleQualification__Group__0__Impl rule__ManuelleQualification__Group__1 ;
    public final void rule__ManuelleQualification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:832:1: ( rule__ManuelleQualification__Group__0__Impl rule__ManuelleQualification__Group__1 )
            // InternalMy.g:833:2: rule__ManuelleQualification__Group__0__Impl rule__ManuelleQualification__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ManuelleQualification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManuelleQualification__Group__1();

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
    // $ANTLR end "rule__ManuelleQualification__Group__0"


    // $ANTLR start "rule__ManuelleQualification__Group__0__Impl"
    // InternalMy.g:840:1: rule__ManuelleQualification__Group__0__Impl : ( 'Manuel' ) ;
    public final void rule__ManuelleQualification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:844:1: ( ( 'Manuel' ) )
            // InternalMy.g:845:1: ( 'Manuel' )
            {
            // InternalMy.g:845:1: ( 'Manuel' )
            // InternalMy.g:846:2: 'Manuel'
            {
             before(grammarAccess.getManuelleQualificationAccess().getManuelKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getManuelleQualificationAccess().getManuelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManuelleQualification__Group__0__Impl"


    // $ANTLR start "rule__ManuelleQualification__Group__1"
    // InternalMy.g:855:1: rule__ManuelleQualification__Group__1 : rule__ManuelleQualification__Group__1__Impl rule__ManuelleQualification__Group__2 ;
    public final void rule__ManuelleQualification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:859:1: ( rule__ManuelleQualification__Group__1__Impl rule__ManuelleQualification__Group__2 )
            // InternalMy.g:860:2: rule__ManuelleQualification__Group__1__Impl rule__ManuelleQualification__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ManuelleQualification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManuelleQualification__Group__2();

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
    // $ANTLR end "rule__ManuelleQualification__Group__1"


    // $ANTLR start "rule__ManuelleQualification__Group__1__Impl"
    // InternalMy.g:867:1: rule__ManuelleQualification__Group__1__Impl : ( 'QC=' ) ;
    public final void rule__ManuelleQualification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:871:1: ( ( 'QC=' ) )
            // InternalMy.g:872:1: ( 'QC=' )
            {
            // InternalMy.g:872:1: ( 'QC=' )
            // InternalMy.g:873:2: 'QC='
            {
             before(grammarAccess.getManuelleQualificationAccess().getQCKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getManuelleQualificationAccess().getQCKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManuelleQualification__Group__1__Impl"


    // $ANTLR start "rule__ManuelleQualification__Group__2"
    // InternalMy.g:882:1: rule__ManuelleQualification__Group__2 : rule__ManuelleQualification__Group__2__Impl rule__ManuelleQualification__Group__3 ;
    public final void rule__ManuelleQualification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:886:1: ( rule__ManuelleQualification__Group__2__Impl rule__ManuelleQualification__Group__3 )
            // InternalMy.g:887:2: rule__ManuelleQualification__Group__2__Impl rule__ManuelleQualification__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ManuelleQualification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManuelleQualification__Group__3();

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
    // $ANTLR end "rule__ManuelleQualification__Group__2"


    // $ANTLR start "rule__ManuelleQualification__Group__2__Impl"
    // InternalMy.g:894:1: rule__ManuelleQualification__Group__2__Impl : ( ( rule__ManuelleQualification__QualitycodeAssignment_2 ) ) ;
    public final void rule__ManuelleQualification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:898:1: ( ( ( rule__ManuelleQualification__QualitycodeAssignment_2 ) ) )
            // InternalMy.g:899:1: ( ( rule__ManuelleQualification__QualitycodeAssignment_2 ) )
            {
            // InternalMy.g:899:1: ( ( rule__ManuelleQualification__QualitycodeAssignment_2 ) )
            // InternalMy.g:900:2: ( rule__ManuelleQualification__QualitycodeAssignment_2 )
            {
             before(grammarAccess.getManuelleQualificationAccess().getQualitycodeAssignment_2()); 
            // InternalMy.g:901:2: ( rule__ManuelleQualification__QualitycodeAssignment_2 )
            // InternalMy.g:901:3: rule__ManuelleQualification__QualitycodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ManuelleQualification__QualitycodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getManuelleQualificationAccess().getQualitycodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManuelleQualification__Group__2__Impl"


    // $ANTLR start "rule__ManuelleQualification__Group__3"
    // InternalMy.g:909:1: rule__ManuelleQualification__Group__3 : rule__ManuelleQualification__Group__3__Impl ;
    public final void rule__ManuelleQualification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:913:1: ( rule__ManuelleQualification__Group__3__Impl )
            // InternalMy.g:914:2: rule__ManuelleQualification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManuelleQualification__Group__3__Impl();

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
    // $ANTLR end "rule__ManuelleQualification__Group__3"


    // $ANTLR start "rule__ManuelleQualification__Group__3__Impl"
    // InternalMy.g:920:1: rule__ManuelleQualification__Group__3__Impl : ( ( rule__ManuelleQualification__CommentaireAssignment_3 )? ) ;
    public final void rule__ManuelleQualification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:924:1: ( ( ( rule__ManuelleQualification__CommentaireAssignment_3 )? ) )
            // InternalMy.g:925:1: ( ( rule__ManuelleQualification__CommentaireAssignment_3 )? )
            {
            // InternalMy.g:925:1: ( ( rule__ManuelleQualification__CommentaireAssignment_3 )? )
            // InternalMy.g:926:2: ( rule__ManuelleQualification__CommentaireAssignment_3 )?
            {
             before(grammarAccess.getManuelleQualificationAccess().getCommentaireAssignment_3()); 
            // InternalMy.g:927:2: ( rule__ManuelleQualification__CommentaireAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMy.g:927:3: rule__ManuelleQualification__CommentaireAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManuelleQualification__CommentaireAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManuelleQualificationAccess().getCommentaireAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManuelleQualification__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMy.g:936:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:940:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMy.g:941:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMy.g:948:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:952:1: ( ( ( '-' )? ) )
            // InternalMy.g:953:1: ( ( '-' )? )
            {
            // InternalMy.g:953:1: ( ( '-' )? )
            // InternalMy.g:954:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMy.g:955:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMy.g:955:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMy.g:963:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:967:1: ( rule__EInt__Group__1__Impl )
            // InternalMy.g:968:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMy.g:974:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:978:1: ( ( RULE_INT ) )
            // InternalMy.g:979:1: ( RULE_INT )
            {
            // InternalMy.g:979:1: ( RULE_INT )
            // InternalMy.g:980:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__SerieTemporelle__IdAssignment_1"
    // InternalMy.g:990:1: rule__SerieTemporelle__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__SerieTemporelle__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:994:1: ( ( RULE_ID ) )
            // InternalMy.g:995:2: ( RULE_ID )
            {
            // InternalMy.g:995:2: ( RULE_ID )
            // InternalMy.g:996:3: RULE_ID
            {
             before(grammarAccess.getSerieTemporelleAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSerieTemporelleAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__IdAssignment_1"


    // $ANTLR start "rule__SerieTemporelle__MesureAssignment_3"
    // InternalMy.g:1005:1: rule__SerieTemporelle__MesureAssignment_3 : ( ruleMesure ) ;
    public final void rule__SerieTemporelle__MesureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1009:1: ( ( ruleMesure ) )
            // InternalMy.g:1010:2: ( ruleMesure )
            {
            // InternalMy.g:1010:2: ( ruleMesure )
            // InternalMy.g:1011:3: ruleMesure
            {
             before(grammarAccess.getSerieTemporelleAccess().getMesureMesureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMesure();

            state._fsp--;

             after(grammarAccess.getSerieTemporelleAccess().getMesureMesureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__MesureAssignment_3"


    // $ANTLR start "rule__SerieTemporelle__MesureAssignment_4_1"
    // InternalMy.g:1020:1: rule__SerieTemporelle__MesureAssignment_4_1 : ( ruleMesure ) ;
    public final void rule__SerieTemporelle__MesureAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1024:1: ( ( ruleMesure ) )
            // InternalMy.g:1025:2: ( ruleMesure )
            {
            // InternalMy.g:1025:2: ( ruleMesure )
            // InternalMy.g:1026:3: ruleMesure
            {
             before(grammarAccess.getSerieTemporelleAccess().getMesureMesureParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMesure();

            state._fsp--;

             after(grammarAccess.getSerieTemporelleAccess().getMesureMesureParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerieTemporelle__MesureAssignment_4_1"


    // $ANTLR start "rule__Mesure__ValeurAssignment_0"
    // InternalMy.g:1035:1: rule__Mesure__ValeurAssignment_0 : ( ruleEInt ) ;
    public final void rule__Mesure__ValeurAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1039:1: ( ( ruleEInt ) )
            // InternalMy.g:1040:2: ( ruleEInt )
            {
            // InternalMy.g:1040:2: ( ruleEInt )
            // InternalMy.g:1041:3: ruleEInt
            {
             before(grammarAccess.getMesureAccess().getValeurEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMesureAccess().getValeurEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesure__ValeurAssignment_0"


    // $ANTLR start "rule__Mesure__TimestampAssignment_1"
    // InternalMy.g:1050:1: rule__Mesure__TimestampAssignment_1 : ( ruleEDate ) ;
    public final void rule__Mesure__TimestampAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1054:1: ( ( ruleEDate ) )
            // InternalMy.g:1055:2: ( ruleEDate )
            {
            // InternalMy.g:1055:2: ( ruleEDate )
            // InternalMy.g:1056:3: ruleEDate
            {
             before(grammarAccess.getMesureAccess().getTimestampEDateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getMesureAccess().getTimestampEDateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesure__TimestampAssignment_1"


    // $ANTLR start "rule__Mesure__QualificationAssignment_2_1"
    // InternalMy.g:1065:1: rule__Mesure__QualificationAssignment_2_1 : ( ruleQualification ) ;
    public final void rule__Mesure__QualificationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1069:1: ( ( ruleQualification ) )
            // InternalMy.g:1070:2: ( ruleQualification )
            {
            // InternalMy.g:1070:2: ( ruleQualification )
            // InternalMy.g:1071:3: ruleQualification
            {
             before(grammarAccess.getMesureAccess().getQualificationQualificationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getMesureAccess().getQualificationQualificationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesure__QualificationAssignment_2_1"


    // $ANTLR start "rule__AutoQualification__QualitycodeAssignment_2"
    // InternalMy.g:1080:1: rule__AutoQualification__QualitycodeAssignment_2 : ( ruleEInt ) ;
    public final void rule__AutoQualification__QualitycodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1084:1: ( ( ruleEInt ) )
            // InternalMy.g:1085:2: ( ruleEInt )
            {
            // InternalMy.g:1085:2: ( ruleEInt )
            // InternalMy.g:1086:3: ruleEInt
            {
             before(grammarAccess.getAutoQualificationAccess().getQualitycodeEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAutoQualificationAccess().getQualitycodeEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoQualification__QualitycodeAssignment_2"


    // $ANTLR start "rule__AutoQualification__AlgoAssignment_3_1"
    // InternalMy.g:1095:1: rule__AutoQualification__AlgoAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AutoQualification__AlgoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1099:1: ( ( ruleEString ) )
            // InternalMy.g:1100:2: ( ruleEString )
            {
            // InternalMy.g:1100:2: ( ruleEString )
            // InternalMy.g:1101:3: ruleEString
            {
             before(grammarAccess.getAutoQualificationAccess().getAlgoEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutoQualificationAccess().getAlgoEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoQualification__AlgoAssignment_3_1"


    // $ANTLR start "rule__ManuelleQualification__QualitycodeAssignment_2"
    // InternalMy.g:1110:1: rule__ManuelleQualification__QualitycodeAssignment_2 : ( ruleEInt ) ;
    public final void rule__ManuelleQualification__QualitycodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1114:1: ( ( ruleEInt ) )
            // InternalMy.g:1115:2: ( ruleEInt )
            {
            // InternalMy.g:1115:2: ( ruleEInt )
            // InternalMy.g:1116:3: ruleEInt
            {
             before(grammarAccess.getManuelleQualificationAccess().getQualitycodeEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getManuelleQualificationAccess().getQualitycodeEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManuelleQualification__QualitycodeAssignment_2"


    // $ANTLR start "rule__ManuelleQualification__CommentaireAssignment_3"
    // InternalMy.g:1125:1: rule__ManuelleQualification__CommentaireAssignment_3 : ( ruleEString ) ;
    public final void rule__ManuelleQualification__CommentaireAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMy.g:1129:1: ( ( ruleEString ) )
            // InternalMy.g:1130:2: ( ruleEString )
            {
            // InternalMy.g:1130:2: ( ruleEString )
            // InternalMy.g:1131:3: ruleEString
            {
             before(grammarAccess.getManuelleQualificationAccess().getCommentaireEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManuelleQualificationAccess().getCommentaireEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManuelleQualification__CommentaireAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}