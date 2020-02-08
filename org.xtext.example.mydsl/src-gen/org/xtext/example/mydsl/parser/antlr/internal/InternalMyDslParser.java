package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'state'", "','", "'tr'", "'isFinal'", "'trigger'", "'->'", "'initial'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( (lv_initialstate_2_0= ruleInitialState ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | (otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )* ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_initialstate_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_transition_8_0 = null;

        EObject lv_transition_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( (lv_initialstate_2_0= ruleInitialState ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | (otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )* ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( (lv_initialstate_2_0= ruleInitialState ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | (otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )* ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( (lv_initialstate_2_0= ruleInitialState ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | (otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )* ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) ( (lv_initialstate_2_0= ruleInitialState ) ) ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | (otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )* ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:102:3: ( (lv_initialstate_2_0= ruleInitialState ) )
            // InternalMyDsl.g:103:4: (lv_initialstate_2_0= ruleInitialState )
            {
            // InternalMyDsl.g:103:4: (lv_initialstate_2_0= ruleInitialState )
            // InternalMyDsl.g:104:5: lv_initialstate_2_0= ruleInitialState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getInitialstateInitialStateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_initialstate_2_0=ruleInitialState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"initialstate",
            						lv_initialstate_2_0,
            						"org.xtext.example.mydsl.MyDsl.InitialState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:121:3: ( (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* ) | (otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )* ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }
                else if ( (LA3_0==14) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:122:4: (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* )
            	    {
            	    // InternalMyDsl.g:122:4: (otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )* )
            	    // InternalMyDsl.g:123:5: otherlv_3= 'state' ( (lv_state_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )*
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_6); 

            	    					newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getStateKeyword_3_0_0());
            	    				
            	    // InternalMyDsl.g:127:5: ( (lv_state_4_0= ruleState ) )
            	    // InternalMyDsl.g:128:6: (lv_state_4_0= ruleState )
            	    {
            	    // InternalMyDsl.g:128:6: (lv_state_4_0= ruleState )
            	    // InternalMyDsl.g:129:7: lv_state_4_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_state_4_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_4_0,
            	    								"org.xtext.example.mydsl.MyDsl.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:146:5: (otherlv_5= ',' ( (lv_state_6_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==13) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:147:6: otherlv_5= ',' ( (lv_state_6_0= ruleState ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,13,FOLLOW_6); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getCommaKeyword_3_0_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:151:6: ( (lv_state_6_0= ruleState ) )
            	    	    // InternalMyDsl.g:152:7: (lv_state_6_0= ruleState )
            	    	    {
            	    	    // InternalMyDsl.g:152:7: (lv_state_6_0= ruleState )
            	    	    // InternalMyDsl.g:153:8: lv_state_6_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_3_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_state_6_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_6_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:173:4: (otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )* )
            	    {
            	    // InternalMyDsl.g:173:4: (otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )* )
            	    // InternalMyDsl.g:174:5: otherlv_7= 'tr' ( (lv_transition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getTrKeyword_3_1_0());
            	    				
            	    // InternalMyDsl.g:178:5: ( (lv_transition_8_0= ruleTransition ) )
            	    // InternalMyDsl.g:179:6: (lv_transition_8_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:179:6: (lv_transition_8_0= ruleTransition )
            	    // InternalMyDsl.g:180:7: lv_transition_8_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_transition_8_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transition",
            	    								lv_transition_8_0,
            	    								"org.xtext.example.mydsl.MyDsl.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:197:5: (otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==13) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:198:6: otherlv_9= ',' ( (lv_transition_10_0= ruleTransition ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,13,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getCommaKeyword_3_1_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:202:6: ( (lv_transition_10_0= ruleTransition ) )
            	    	    // InternalMyDsl.g:203:7: (lv_transition_10_0= ruleTransition )
            	    	    {
            	    	    // InternalMyDsl.g:203:7: (lv_transition_10_0= ruleTransition )
            	    	    // InternalMyDsl.g:204:8: lv_transition_10_0= ruleTransition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_3_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_transition_10_0=ruleTransition();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"transition",
            	    	    									lv_transition_10_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.Transition");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:228:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:228:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:229:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:235:1: ruleState returns [EObject current=null] : (this_State_Impl_0= ruleState_Impl | this_InitialState_1= ruleInitialState ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_State_Impl_0 = null;

        EObject this_InitialState_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:241:2: ( (this_State_Impl_0= ruleState_Impl | this_InitialState_1= ruleInitialState ) )
            // InternalMyDsl.g:242:2: (this_State_Impl_0= ruleState_Impl | this_InitialState_1= ruleInitialState )
            {
            // InternalMyDsl.g:242:2: (this_State_Impl_0= ruleState_Impl | this_InitialState_1= ruleInitialState )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:243:3: this_State_Impl_0= ruleState_Impl
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_Impl_0=ruleState_Impl();

                    state._fsp--;


                    			current = this_State_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:252:3: this_InitialState_1= ruleInitialState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getInitialStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialState_1=ruleInitialState();

                    state._fsp--;


                    			current = this_InitialState_1;
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:264:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:264:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:265:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:271:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:277:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:278:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:278:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:279:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:287:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleState_Impl"
    // InternalMyDsl.g:298:1: entryRuleState_Impl returns [EObject current=null] : iv_ruleState_Impl= ruleState_Impl EOF ;
    public final EObject entryRuleState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState_Impl = null;


        try {
            // InternalMyDsl.g:298:51: (iv_ruleState_Impl= ruleState_Impl EOF )
            // InternalMyDsl.g:299:2: iv_ruleState_Impl= ruleState_Impl EOF
            {
             newCompositeNode(grammarAccess.getState_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState_Impl=ruleState_Impl();

            state._fsp--;

             current =iv_ruleState_Impl; 
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
    // $ANTLR end "entryRuleState_Impl"


    // $ANTLR start "ruleState_Impl"
    // InternalMyDsl.g:305:1: ruleState_Impl returns [EObject current=null] : ( () ( (lv_isFinal_1_0= 'isFinal' ) )? ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleState_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_isFinal_1_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:311:2: ( ( () ( (lv_isFinal_1_0= 'isFinal' ) )? ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:312:2: ( () ( (lv_isFinal_1_0= 'isFinal' ) )? ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:312:2: ( () ( (lv_isFinal_1_0= 'isFinal' ) )? ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:313:3: () ( (lv_isFinal_1_0= 'isFinal' ) )? ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:313:3: ()
            // InternalMyDsl.g:314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getState_ImplAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:320:3: ( (lv_isFinal_1_0= 'isFinal' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:321:4: (lv_isFinal_1_0= 'isFinal' )
                    {
                    // InternalMyDsl.g:321:4: (lv_isFinal_1_0= 'isFinal' )
                    // InternalMyDsl.g:322:5: lv_isFinal_1_0= 'isFinal'
                    {
                    lv_isFinal_1_0=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(lv_isFinal_1_0, grammarAccess.getState_ImplAccess().getIsFinalIsFinalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getState_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isFinal", true, "isFinal");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:334:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:335:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:335:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:336:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getState_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleState_Impl"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:357:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:357:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:358:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:364:1: ruleTransition returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_trigger_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:371:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:371:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) )
            // InternalMyDsl.g:372:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'trigger' ( (lv_trigger_3_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) )
            {
            // InternalMyDsl.g:372:3: ()
            // InternalMyDsl.g:373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:379:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:380:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:380:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:381:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTriggerKeyword_2());
            		
            // InternalMyDsl.g:402:3: ( (lv_trigger_3_0= ruleEString ) )
            // InternalMyDsl.g:403:4: (lv_trigger_3_0= ruleEString )
            {
            // InternalMyDsl.g:403:4: (lv_trigger_3_0= ruleEString )
            // InternalMyDsl.g:404:5: lv_trigger_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getTriggerEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_trigger_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:421:3: ( ( ruleEString ) )
            // InternalMyDsl.g:422:4: ( ruleEString )
            {
            // InternalMyDsl.g:422:4: ( ruleEString )
            // InternalMyDsl.g:423:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalMyDsl.g:441:3: ( ( ruleEString ) )
            // InternalMyDsl.g:442:4: ( ruleEString )
            {
            // InternalMyDsl.g:442:4: ( ruleEString )
            // InternalMyDsl.g:443:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInitialState"
    // InternalMyDsl.g:461:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalMyDsl.g:461:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalMyDsl.g:462:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
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
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalMyDsl.g:468:1: ruleInitialState returns [EObject current=null] : (otherlv_0= 'initial' () ( (lv_isFinal_2_0= 'isFinal' ) )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFinal_2_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:474:2: ( (otherlv_0= 'initial' () ( (lv_isFinal_2_0= 'isFinal' ) )? ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalMyDsl.g:475:2: (otherlv_0= 'initial' () ( (lv_isFinal_2_0= 'isFinal' ) )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:475:2: (otherlv_0= 'initial' () ( (lv_isFinal_2_0= 'isFinal' ) )? ( (lv_name_3_0= ruleEString ) ) )
            // InternalMyDsl.g:476:3: otherlv_0= 'initial' () ( (lv_isFinal_2_0= 'isFinal' ) )? ( (lv_name_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialStateAccess().getInitialKeyword_0());
            		
            // InternalMyDsl.g:480:3: ()
            // InternalMyDsl.g:481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialStateAccess().getInitialStateAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:487:3: ( (lv_isFinal_2_0= 'isFinal' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:488:4: (lv_isFinal_2_0= 'isFinal' )
                    {
                    // InternalMyDsl.g:488:4: (lv_isFinal_2_0= 'isFinal' )
                    // InternalMyDsl.g:489:5: lv_isFinal_2_0= 'isFinal'
                    {
                    lv_isFinal_2_0=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(lv_isFinal_2_0, grammarAccess.getInitialStateAccess().getIsFinalIsFinalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialStateRule());
                    					}
                    					setWithLastConsumed(current, "isFinal", true, "isFinal");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:501:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:502:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:502:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:503:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleInitialState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008030L});

}