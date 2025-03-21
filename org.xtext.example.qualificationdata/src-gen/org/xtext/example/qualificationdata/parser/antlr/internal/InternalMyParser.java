package org.xtext.example.qualificationdata.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.qualificationdata.services.MyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SerieTemporelle'", "'{'", "','", "'}'", "'qualifi\\u00E9'", "'Automatique'", "'QC='", "'Algo'", "'Manuel'", "'-'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

        public InternalMyParser(TokenStream input, MyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SerieTemporelle";
       	}

       	@Override
       	protected MyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSerieTemporelle"
    // InternalMy.g:64:1: entryRuleSerieTemporelle returns [EObject current=null] : iv_ruleSerieTemporelle= ruleSerieTemporelle EOF ;
    public final EObject entryRuleSerieTemporelle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerieTemporelle = null;


        try {
            // InternalMy.g:64:56: (iv_ruleSerieTemporelle= ruleSerieTemporelle EOF )
            // InternalMy.g:65:2: iv_ruleSerieTemporelle= ruleSerieTemporelle EOF
            {
             newCompositeNode(grammarAccess.getSerieTemporelleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSerieTemporelle=ruleSerieTemporelle();

            state._fsp--;

             current =iv_ruleSerieTemporelle; 
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
    // $ANTLR end "entryRuleSerieTemporelle"


    // $ANTLR start "ruleSerieTemporelle"
    // InternalMy.g:71:1: ruleSerieTemporelle returns [EObject current=null] : (otherlv_0= 'SerieTemporelle' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mesure_3_0= ruleMesure ) ) (otherlv_4= ',' ( (lv_mesure_5_0= ruleMesure ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleSerieTemporelle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_mesure_3_0 = null;

        EObject lv_mesure_5_0 = null;



        	enterRule();

        try {
            // InternalMy.g:77:2: ( (otherlv_0= 'SerieTemporelle' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mesure_3_0= ruleMesure ) ) (otherlv_4= ',' ( (lv_mesure_5_0= ruleMesure ) ) )* otherlv_6= '}' ) )
            // InternalMy.g:78:2: (otherlv_0= 'SerieTemporelle' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mesure_3_0= ruleMesure ) ) (otherlv_4= ',' ( (lv_mesure_5_0= ruleMesure ) ) )* otherlv_6= '}' )
            {
            // InternalMy.g:78:2: (otherlv_0= 'SerieTemporelle' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mesure_3_0= ruleMesure ) ) (otherlv_4= ',' ( (lv_mesure_5_0= ruleMesure ) ) )* otherlv_6= '}' )
            // InternalMy.g:79:3: otherlv_0= 'SerieTemporelle' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mesure_3_0= ruleMesure ) ) (otherlv_4= ',' ( (lv_mesure_5_0= ruleMesure ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSerieTemporelleAccess().getSerieTemporelleKeyword_0());
            		
            // InternalMy.g:83:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMy.g:84:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMy.g:84:4: (lv_id_1_0= RULE_ID )
            // InternalMy.g:85:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSerieTemporelleAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSerieTemporelleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSerieTemporelleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMy.g:105:3: ( (lv_mesure_3_0= ruleMesure ) )
            // InternalMy.g:106:4: (lv_mesure_3_0= ruleMesure )
            {
            // InternalMy.g:106:4: (lv_mesure_3_0= ruleMesure )
            // InternalMy.g:107:5: lv_mesure_3_0= ruleMesure
            {

            					newCompositeNode(grammarAccess.getSerieTemporelleAccess().getMesureMesureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_mesure_3_0=ruleMesure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSerieTemporelleRule());
            					}
            					add(
            						current,
            						"mesure",
            						lv_mesure_3_0,
            						"org.xtext.example.qualificationdata.My.Mesure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMy.g:124:3: (otherlv_4= ',' ( (lv_mesure_5_0= ruleMesure ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMy.g:125:4: otherlv_4= ',' ( (lv_mesure_5_0= ruleMesure ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSerieTemporelleAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMy.g:129:4: ( (lv_mesure_5_0= ruleMesure ) )
            	    // InternalMy.g:130:5: (lv_mesure_5_0= ruleMesure )
            	    {
            	    // InternalMy.g:130:5: (lv_mesure_5_0= ruleMesure )
            	    // InternalMy.g:131:6: lv_mesure_5_0= ruleMesure
            	    {

            	    						newCompositeNode(grammarAccess.getSerieTemporelleAccess().getMesureMesureParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_mesure_5_0=ruleMesure();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSerieTemporelleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mesure",
            	    							lv_mesure_5_0,
            	    							"org.xtext.example.qualificationdata.My.Mesure");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSerieTemporelleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSerieTemporelle"


    // $ANTLR start "entryRuleMesure"
    // InternalMy.g:157:1: entryRuleMesure returns [EObject current=null] : iv_ruleMesure= ruleMesure EOF ;
    public final EObject entryRuleMesure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesure = null;


        try {
            // InternalMy.g:157:47: (iv_ruleMesure= ruleMesure EOF )
            // InternalMy.g:158:2: iv_ruleMesure= ruleMesure EOF
            {
             newCompositeNode(grammarAccess.getMesureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMesure=ruleMesure();

            state._fsp--;

             current =iv_ruleMesure; 
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
    // $ANTLR end "entryRuleMesure"


    // $ANTLR start "ruleMesure"
    // InternalMy.g:164:1: ruleMesure returns [EObject current=null] : ( ( (lv_valeur_0_0= ruleEInt ) ) ( (lv_timestamp_1_0= ruleEDate ) ) (otherlv_2= 'qualifi\\u00E9' ( (lv_qualification_3_0= ruleQualification ) ) )? ) ;
    public final EObject ruleMesure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_valeur_0_0 = null;

        AntlrDatatypeRuleToken lv_timestamp_1_0 = null;

        EObject lv_qualification_3_0 = null;



        	enterRule();

        try {
            // InternalMy.g:170:2: ( ( ( (lv_valeur_0_0= ruleEInt ) ) ( (lv_timestamp_1_0= ruleEDate ) ) (otherlv_2= 'qualifi\\u00E9' ( (lv_qualification_3_0= ruleQualification ) ) )? ) )
            // InternalMy.g:171:2: ( ( (lv_valeur_0_0= ruleEInt ) ) ( (lv_timestamp_1_0= ruleEDate ) ) (otherlv_2= 'qualifi\\u00E9' ( (lv_qualification_3_0= ruleQualification ) ) )? )
            {
            // InternalMy.g:171:2: ( ( (lv_valeur_0_0= ruleEInt ) ) ( (lv_timestamp_1_0= ruleEDate ) ) (otherlv_2= 'qualifi\\u00E9' ( (lv_qualification_3_0= ruleQualification ) ) )? )
            // InternalMy.g:172:3: ( (lv_valeur_0_0= ruleEInt ) ) ( (lv_timestamp_1_0= ruleEDate ) ) (otherlv_2= 'qualifi\\u00E9' ( (lv_qualification_3_0= ruleQualification ) ) )?
            {
            // InternalMy.g:172:3: ( (lv_valeur_0_0= ruleEInt ) )
            // InternalMy.g:173:4: (lv_valeur_0_0= ruleEInt )
            {
            // InternalMy.g:173:4: (lv_valeur_0_0= ruleEInt )
            // InternalMy.g:174:5: lv_valeur_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMesureAccess().getValeurEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_valeur_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMesureRule());
            					}
            					set(
            						current,
            						"valeur",
            						lv_valeur_0_0,
            						"org.xtext.example.qualificationdata.My.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMy.g:191:3: ( (lv_timestamp_1_0= ruleEDate ) )
            // InternalMy.g:192:4: (lv_timestamp_1_0= ruleEDate )
            {
            // InternalMy.g:192:4: (lv_timestamp_1_0= ruleEDate )
            // InternalMy.g:193:5: lv_timestamp_1_0= ruleEDate
            {

            					newCompositeNode(grammarAccess.getMesureAccess().getTimestampEDateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_timestamp_1_0=ruleEDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMesureRule());
            					}
            					set(
            						current,
            						"timestamp",
            						lv_timestamp_1_0,
            						"org.xtext.example.qualificationdata.My.EDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMy.g:210:3: (otherlv_2= 'qualifi\\u00E9' ( (lv_qualification_3_0= ruleQualification ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMy.g:211:4: otherlv_2= 'qualifi\\u00E9' ( (lv_qualification_3_0= ruleQualification ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMesureAccess().getQualifiKeyword_2_0());
                    			
                    // InternalMy.g:215:4: ( (lv_qualification_3_0= ruleQualification ) )
                    // InternalMy.g:216:5: (lv_qualification_3_0= ruleQualification )
                    {
                    // InternalMy.g:216:5: (lv_qualification_3_0= ruleQualification )
                    // InternalMy.g:217:6: lv_qualification_3_0= ruleQualification
                    {

                    						newCompositeNode(grammarAccess.getMesureAccess().getQualificationQualificationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_qualification_3_0=ruleQualification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMesureRule());
                    						}
                    						set(
                    							current,
                    							"qualification",
                    							lv_qualification_3_0,
                    							"org.xtext.example.qualificationdata.My.Qualification");
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
    // $ANTLR end "ruleMesure"


    // $ANTLR start "entryRuleQualification"
    // InternalMy.g:239:1: entryRuleQualification returns [EObject current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final EObject entryRuleQualification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualification = null;


        try {
            // InternalMy.g:239:54: (iv_ruleQualification= ruleQualification EOF )
            // InternalMy.g:240:2: iv_ruleQualification= ruleQualification EOF
            {
             newCompositeNode(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualification=ruleQualification();

            state._fsp--;

             current =iv_ruleQualification; 
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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalMy.g:246:1: ruleQualification returns [EObject current=null] : (this_AutoQualification_0= ruleAutoQualification | this_ManuelleQualification_1= ruleManuelleQualification ) ;
    public final EObject ruleQualification() throws RecognitionException {
        EObject current = null;

        EObject this_AutoQualification_0 = null;

        EObject this_ManuelleQualification_1 = null;



        	enterRule();

        try {
            // InternalMy.g:252:2: ( (this_AutoQualification_0= ruleAutoQualification | this_ManuelleQualification_1= ruleManuelleQualification ) )
            // InternalMy.g:253:2: (this_AutoQualification_0= ruleAutoQualification | this_ManuelleQualification_1= ruleManuelleQualification )
            {
            // InternalMy.g:253:2: (this_AutoQualification_0= ruleAutoQualification | this_ManuelleQualification_1= ruleManuelleQualification )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMy.g:254:3: this_AutoQualification_0= ruleAutoQualification
                    {

                    			newCompositeNode(grammarAccess.getQualificationAccess().getAutoQualificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutoQualification_0=ruleAutoQualification();

                    state._fsp--;


                    			current = this_AutoQualification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMy.g:263:3: this_ManuelleQualification_1= ruleManuelleQualification
                    {

                    			newCompositeNode(grammarAccess.getQualificationAccess().getManuelleQualificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManuelleQualification_1=ruleManuelleQualification();

                    state._fsp--;


                    			current = this_ManuelleQualification_1;
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
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleAutoQualification"
    // InternalMy.g:275:1: entryRuleAutoQualification returns [EObject current=null] : iv_ruleAutoQualification= ruleAutoQualification EOF ;
    public final EObject entryRuleAutoQualification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoQualification = null;


        try {
            // InternalMy.g:275:58: (iv_ruleAutoQualification= ruleAutoQualification EOF )
            // InternalMy.g:276:2: iv_ruleAutoQualification= ruleAutoQualification EOF
            {
             newCompositeNode(grammarAccess.getAutoQualificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutoQualification=ruleAutoQualification();

            state._fsp--;

             current =iv_ruleAutoQualification; 
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
    // $ANTLR end "entryRuleAutoQualification"


    // $ANTLR start "ruleAutoQualification"
    // InternalMy.g:282:1: ruleAutoQualification returns [EObject current=null] : (otherlv_0= 'Automatique' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) (otherlv_3= 'Algo' ( (lv_algo_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleAutoQualification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_qualitycode_2_0 = null;

        AntlrDatatypeRuleToken lv_algo_4_0 = null;



        	enterRule();

        try {
            // InternalMy.g:288:2: ( (otherlv_0= 'Automatique' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) (otherlv_3= 'Algo' ( (lv_algo_4_0= ruleEString ) ) )? ) )
            // InternalMy.g:289:2: (otherlv_0= 'Automatique' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) (otherlv_3= 'Algo' ( (lv_algo_4_0= ruleEString ) ) )? )
            {
            // InternalMy.g:289:2: (otherlv_0= 'Automatique' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) (otherlv_3= 'Algo' ( (lv_algo_4_0= ruleEString ) ) )? )
            // InternalMy.g:290:3: otherlv_0= 'Automatique' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) (otherlv_3= 'Algo' ( (lv_algo_4_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoQualificationAccess().getAutomatiqueKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAutoQualificationAccess().getQCKeyword_1());
            		
            // InternalMy.g:298:3: ( (lv_qualitycode_2_0= ruleEInt ) )
            // InternalMy.g:299:4: (lv_qualitycode_2_0= ruleEInt )
            {
            // InternalMy.g:299:4: (lv_qualitycode_2_0= ruleEInt )
            // InternalMy.g:300:5: lv_qualitycode_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAutoQualificationAccess().getQualitycodeEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_qualitycode_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutoQualificationRule());
            					}
            					set(
            						current,
            						"qualitycode",
            						lv_qualitycode_2_0,
            						"org.xtext.example.qualificationdata.My.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMy.g:317:3: (otherlv_3= 'Algo' ( (lv_algo_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMy.g:318:4: otherlv_3= 'Algo' ( (lv_algo_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutoQualificationAccess().getAlgoKeyword_3_0());
                    			
                    // InternalMy.g:322:4: ( (lv_algo_4_0= ruleEString ) )
                    // InternalMy.g:323:5: (lv_algo_4_0= ruleEString )
                    {
                    // InternalMy.g:323:5: (lv_algo_4_0= ruleEString )
                    // InternalMy.g:324:6: lv_algo_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutoQualificationAccess().getAlgoEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_algo_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutoQualificationRule());
                    						}
                    						set(
                    							current,
                    							"algo",
                    							lv_algo_4_0,
                    							"org.xtext.example.qualificationdata.My.EString");
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
    // $ANTLR end "ruleAutoQualification"


    // $ANTLR start "entryRuleManuelleQualification"
    // InternalMy.g:346:1: entryRuleManuelleQualification returns [EObject current=null] : iv_ruleManuelleQualification= ruleManuelleQualification EOF ;
    public final EObject entryRuleManuelleQualification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManuelleQualification = null;


        try {
            // InternalMy.g:346:62: (iv_ruleManuelleQualification= ruleManuelleQualification EOF )
            // InternalMy.g:347:2: iv_ruleManuelleQualification= ruleManuelleQualification EOF
            {
             newCompositeNode(grammarAccess.getManuelleQualificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManuelleQualification=ruleManuelleQualification();

            state._fsp--;

             current =iv_ruleManuelleQualification; 
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
    // $ANTLR end "entryRuleManuelleQualification"


    // $ANTLR start "ruleManuelleQualification"
    // InternalMy.g:353:1: ruleManuelleQualification returns [EObject current=null] : (otherlv_0= 'Manuel' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) ( (lv_commentaire_3_0= ruleEString ) )? ) ;
    public final EObject ruleManuelleQualification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_qualitycode_2_0 = null;

        AntlrDatatypeRuleToken lv_commentaire_3_0 = null;



        	enterRule();

        try {
            // InternalMy.g:359:2: ( (otherlv_0= 'Manuel' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) ( (lv_commentaire_3_0= ruleEString ) )? ) )
            // InternalMy.g:360:2: (otherlv_0= 'Manuel' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) ( (lv_commentaire_3_0= ruleEString ) )? )
            {
            // InternalMy.g:360:2: (otherlv_0= 'Manuel' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) ( (lv_commentaire_3_0= ruleEString ) )? )
            // InternalMy.g:361:3: otherlv_0= 'Manuel' otherlv_1= 'QC=' ( (lv_qualitycode_2_0= ruleEInt ) ) ( (lv_commentaire_3_0= ruleEString ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getManuelleQualificationAccess().getManuelKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getManuelleQualificationAccess().getQCKeyword_1());
            		
            // InternalMy.g:369:3: ( (lv_qualitycode_2_0= ruleEInt ) )
            // InternalMy.g:370:4: (lv_qualitycode_2_0= ruleEInt )
            {
            // InternalMy.g:370:4: (lv_qualitycode_2_0= ruleEInt )
            // InternalMy.g:371:5: lv_qualitycode_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getManuelleQualificationAccess().getQualitycodeEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_qualitycode_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManuelleQualificationRule());
            					}
            					set(
            						current,
            						"qualitycode",
            						lv_qualitycode_2_0,
            						"org.xtext.example.qualificationdata.My.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMy.g:388:3: ( (lv_commentaire_3_0= ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMy.g:389:4: (lv_commentaire_3_0= ruleEString )
                    {
                    // InternalMy.g:389:4: (lv_commentaire_3_0= ruleEString )
                    // InternalMy.g:390:5: lv_commentaire_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getManuelleQualificationAccess().getCommentaireEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_commentaire_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getManuelleQualificationRule());
                    					}
                    					set(
                    						current,
                    						"commentaire",
                    						lv_commentaire_3_0,
                    						"org.xtext.example.qualificationdata.My.EString");
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
    // $ANTLR end "ruleManuelleQualification"


    // $ANTLR start "entryRuleEString"
    // InternalMy.g:411:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMy.g:411:47: (iv_ruleEString= ruleEString EOF )
            // InternalMy.g:412:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMy.g:418:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMy.g:424:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMy.g:425:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMy.g:425:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMy.g:426:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMy.g:434:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMy.g:445:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMy.g:445:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMy.g:446:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMy.g:452:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMy.g:458:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMy.g:459:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMy.g:459:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMy.g:460:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMy.g:460:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMy.g:461:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDate"
    // InternalMy.g:478:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalMy.g:478:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalMy.g:479:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMy.g:485:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMy.g:491:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMy.g:492:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMy.g:492:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMy.g:493:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMy.g:501:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEDateAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEDate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});

}