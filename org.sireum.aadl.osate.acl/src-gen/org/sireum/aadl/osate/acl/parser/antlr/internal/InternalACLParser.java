package org.sireum.aadl.osate.acl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sireum.aadl.osate.acl.services.ACLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalACLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Hyperperiod", "Classifier", "Contracts", "Guarantee", "Reference", "Constant", "Periodic", "TracesTo", "Andthen", "Applies", "Binding", "Compute", "Implies", "Fun", "Assume", "Orelse", "Delta", "False", "Flows", "Modes", "True", "With", "PlusSignEqualsSignGreaterThanSign", "And", "For", "Not", "FullStopFullStop", "ColonColon", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "In", "Or", "To", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "RightCurlyBracket", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_BASED_INTEGER", "RULE_INTEGER_LIT", "RULE_EXTENDED_DIGIT", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int LessThanSignGreaterThanSign=33;
    public static final int Or=37;
    public static final int EqualsSignGreaterThanSign=34;
    public static final int True=24;
    public static final int False=21;
    public static final int Periodic=10;
    public static final int LessThanSign=50;
    public static final int RULE_INT_EXPONENT=61;
    public static final int PercentSign=39;
    public static final int Implies=16;
    public static final int PlusSignEqualsSignGreaterThanSign=26;
    public static final int LeftParenthesis=40;
    public static final int FullStopFullStop=30;
    public static final int TracesTo=11;
    public static final int To=38;
    public static final int Applies=13;
    public static final int RULE_BASED_INTEGER=63;
    public static final int RightSquareBracket=54;
    public static final int Binding=14;
    public static final int GreaterThanSign=52;
    public static final int RULE_ID=67;
    public static final int For=28;
    public static final int RightParenthesis=41;
    public static final int RULE_DIGIT=59;
    public static final int GreaterThanSignEqualsSign=35;
    public static final int ColonColon=31;
    public static final int Not=29;
    public static final int Hyperperiod=4;
    public static final int Andthen=12;
    public static final int And=27;
    public static final int PlusSign=43;
    public static final int Assume=18;
    public static final int LeftSquareBracket=53;
    public static final int RULE_INTEGER_LIT=64;
    public static final int In=36;
    public static final int Constant=9;
    public static final int RULE_REAL_LIT=62;
    public static final int RULE_STRING=66;
    public static final int Classifier=5;
    public static final int With=25;
    public static final int RULE_SL_COMMENT=58;
    public static final int Comma=44;
    public static final int EqualsSign=51;
    public static final int HyphenMinus=45;
    public static final int Guarantee=7;
    public static final int LessThanSignEqualsSign=32;
    public static final int Solidus=47;
    public static final int Colon=48;
    public static final int RightCurlyBracket=57;
    public static final int EOF=-1;
    public static final int Asterisk=42;
    public static final int Contracts=6;
    public static final int Fun=17;
    public static final int Modes=23;
    public static final int FullStop=46;
    public static final int RULE_WS=68;
    public static final int Reference=8;
    public static final int Flows=22;
    public static final int LeftCurlyBracket=56;
    public static final int CircumflexAccent=55;
    public static final int Semicolon=49;
    public static final int RULE_EXPONENT=60;
    public static final int Delta=20;
    public static final int Compute=15;
    public static final int Orelse=19;
    public static final int RULE_EXTENDED_DIGIT=65;

    // delegates
    // delegators


        public InternalACLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalACLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalACLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalACLParser.g"; }




    	private ACLGrammarAccess grammarAccess;
    	 	
    	public InternalACLParser(TokenStream input, ACLGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "AnnexSubclause";	
    	} 
    	   	   	
    	@Override
    	protected ACLGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleAnnexSubclause"
    // InternalACLParser.g:61:1: entryRuleAnnexSubclause returns [EObject current=null] : iv_ruleAnnexSubclause= ruleAnnexSubclause EOF ;
    public final EObject entryRuleAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnexSubclause = null;


        try {
            // InternalACLParser.g:62:2: (iv_ruleAnnexSubclause= ruleAnnexSubclause EOF )
            // InternalACLParser.g:63:2: iv_ruleAnnexSubclause= ruleAnnexSubclause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnexSubclauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnexSubclause=ruleAnnexSubclause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnexSubclause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnexSubclause"


    // $ANTLR start "ruleAnnexSubclause"
    // InternalACLParser.g:70:1: ruleAnnexSubclause returns [EObject current=null] : this_AclSubclause_0= ruleAclSubclause ;
    public final EObject ruleAnnexSubclause() throws RecognitionException {
        EObject current = null;

        EObject this_AclSubclause_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:73:28: (this_AclSubclause_0= ruleAclSubclause )
            // InternalACLParser.g:75:5: this_AclSubclause_0= ruleAclSubclause
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAnnexSubclauseAccess().getAclSubclauseParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_AclSubclause_0=ruleAclSubclause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AclSubclause_0;
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
    // $ANTLR end "ruleAnnexSubclause"


    // $ANTLR start "entryRuleAclSubclause"
    // InternalACLParser.g:91:1: entryRuleAclSubclause returns [EObject current=null] : iv_ruleAclSubclause= ruleAclSubclause EOF ;
    public final EObject entryRuleAclSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAclSubclause = null;


        try {
            // InternalACLParser.g:92:2: (iv_ruleAclSubclause= ruleAclSubclause EOF )
            // InternalACLParser.g:93:2: iv_ruleAclSubclause= ruleAclSubclause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAclSubclauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAclSubclause=ruleAclSubclause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAclSubclause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAclSubclause"


    // $ANTLR start "ruleAclSubclause"
    // InternalACLParser.g:100:1: ruleAclSubclause returns [EObject current=null] : ( () ( (lv_contract_1_0= ruleAclContract ) ) ) ;
    public final EObject ruleAclSubclause() throws RecognitionException {
        EObject current = null;

        EObject lv_contract_1_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:103:28: ( ( () ( (lv_contract_1_0= ruleAclContract ) ) ) )
            // InternalACLParser.g:104:1: ( () ( (lv_contract_1_0= ruleAclContract ) ) )
            {
            // InternalACLParser.g:104:1: ( () ( (lv_contract_1_0= ruleAclContract ) ) )
            // InternalACLParser.g:104:2: () ( (lv_contract_1_0= ruleAclContract ) )
            {
            // InternalACLParser.g:104:2: ()
            // InternalACLParser.g:105:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAclSubclauseAccess().getAclSubclauseAction_0(),
                          current);
                  
            }

            }

            // InternalACLParser.g:110:2: ( (lv_contract_1_0= ruleAclContract ) )
            // InternalACLParser.g:111:1: (lv_contract_1_0= ruleAclContract )
            {
            // InternalACLParser.g:111:1: (lv_contract_1_0= ruleAclContract )
            // InternalACLParser.g:112:3: lv_contract_1_0= ruleAclContract
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAclSubclauseAccess().getContractAclContractParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_contract_1_0=ruleAclContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAclSubclauseRule());
              	        }
                     		set(
                     			current, 
                     			"contract",
                      		lv_contract_1_0, 
                      		"org.sireum.aadl.osate.acl.ACL.AclContract");
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
    // $ANTLR end "ruleAclSubclause"


    // $ANTLR start "entryRuleAclContract"
    // InternalACLParser.g:136:1: entryRuleAclContract returns [EObject current=null] : iv_ruleAclContract= ruleAclContract EOF ;
    public final EObject entryRuleAclContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAclContract = null;


        try {
            // InternalACLParser.g:137:2: (iv_ruleAclContract= ruleAclContract EOF )
            // InternalACLParser.g:138:2: iv_ruleAclContract= ruleAclContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAclContractRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAclContract=ruleAclContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAclContract; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAclContract"


    // $ANTLR start "ruleAclContract"
    // InternalACLParser.g:145:1: ruleAclContract returns [EObject current=null] : ( () ( (lv_specs_1_0= ruleSpecSection ) )* ) ;
    public final EObject ruleAclContract() throws RecognitionException {
        EObject current = null;

        EObject lv_specs_1_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:148:28: ( ( () ( (lv_specs_1_0= ruleSpecSection ) )* ) )
            // InternalACLParser.g:149:1: ( () ( (lv_specs_1_0= ruleSpecSection ) )* )
            {
            // InternalACLParser.g:149:1: ( () ( (lv_specs_1_0= ruleSpecSection ) )* )
            // InternalACLParser.g:149:2: () ( (lv_specs_1_0= ruleSpecSection ) )*
            {
            // InternalACLParser.g:149:2: ()
            // InternalACLParser.g:150:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAclContractAccess().getAclContractAction_0(),
                          current);
                  
            }

            }

            // InternalACLParser.g:155:2: ( (lv_specs_1_0= ruleSpecSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Hyperperiod||LA1_0==Contracts||LA1_0==Periodic||LA1_0==Flows) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalACLParser.g:156:1: (lv_specs_1_0= ruleSpecSection )
            	    {
            	    // InternalACLParser.g:156:1: (lv_specs_1_0= ruleSpecSection )
            	    // InternalACLParser.g:157:3: lv_specs_1_0= ruleSpecSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAclContractAccess().getSpecsSpecSectionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_specs_1_0=ruleSpecSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAclContractRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"specs",
            	              		lv_specs_1_0, 
            	              		"org.sireum.aadl.osate.acl.ACL.SpecSection");
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
    // $ANTLR end "ruleAclContract"


    // $ANTLR start "entryRuleSpecSection"
    // InternalACLParser.g:181:1: entryRuleSpecSection returns [EObject current=null] : iv_ruleSpecSection= ruleSpecSection EOF ;
    public final EObject entryRuleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecSection = null;


        try {
            // InternalACLParser.g:182:2: (iv_ruleSpecSection= ruleSpecSection EOF )
            // InternalACLParser.g:183:2: iv_ruleSpecSection= ruleSpecSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecSectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecSection=ruleSpecSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecSection; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSpecSection"


    // $ANTLR start "ruleSpecSection"
    // InternalACLParser.g:190:1: ruleSpecSection returns [EObject current=null] : (this_ComputationalModel_0= ruleComputationalModel | this_Flows_1= ruleFlows | this_Contract_2= ruleContract ) ;
    public final EObject ruleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject this_ComputationalModel_0 = null;

        EObject this_Flows_1 = null;

        EObject this_Contract_2 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:193:28: ( (this_ComputationalModel_0= ruleComputationalModel | this_Flows_1= ruleFlows | this_Contract_2= ruleContract ) )
            // InternalACLParser.g:194:1: (this_ComputationalModel_0= ruleComputationalModel | this_Flows_1= ruleFlows | this_Contract_2= ruleContract )
            {
            // InternalACLParser.g:194:1: (this_ComputationalModel_0= ruleComputationalModel | this_Flows_1= ruleFlows | this_Contract_2= ruleContract )
            int alt2=3;
            switch ( input.LA(1) ) {
            case Hyperperiod:
            case Periodic:
                {
                alt2=1;
                }
                break;
            case Flows:
                {
                alt2=2;
                }
                break;
            case Contracts:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalACLParser.g:195:5: this_ComputationalModel_0= ruleComputationalModel
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecSectionAccess().getComputationalModelParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComputationalModel_0=ruleComputationalModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ComputationalModel_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalACLParser.g:205:5: this_Flows_1= ruleFlows
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecSectionAccess().getFlowsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Flows_1=ruleFlows();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Flows_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalACLParser.g:215:5: this_Contract_2= ruleContract
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSpecSectionAccess().getContractParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Contract_2=ruleContract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Contract_2;
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
    // $ANTLR end "ruleSpecSection"


    // $ANTLR start "entryRuleComputationalModel"
    // InternalACLParser.g:231:1: entryRuleComputationalModel returns [EObject current=null] : iv_ruleComputationalModel= ruleComputationalModel EOF ;
    public final EObject entryRuleComputationalModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationalModel = null;


        try {
            // InternalACLParser.g:232:2: (iv_ruleComputationalModel= ruleComputationalModel EOF )
            // InternalACLParser.g:233:2: iv_ruleComputationalModel= ruleComputationalModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputationalModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComputationalModel=ruleComputationalModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComputationalModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComputationalModel"


    // $ANTLR start "ruleComputationalModel"
    // InternalACLParser.g:240:1: ruleComputationalModel returns [EObject current=null] : ( ( () otherlv_1= Periodic ) | ( () otherlv_3= Hyperperiod otherlv_4= With ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )* ) ) ) ;
    public final EObject ruleComputationalModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:243:28: ( ( ( () otherlv_1= Periodic ) | ( () otherlv_3= Hyperperiod otherlv_4= With ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )* ) ) ) )
            // InternalACLParser.g:244:1: ( ( () otherlv_1= Periodic ) | ( () otherlv_3= Hyperperiod otherlv_4= With ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )* ) ) )
            {
            // InternalACLParser.g:244:1: ( ( () otherlv_1= Periodic ) | ( () otherlv_3= Hyperperiod otherlv_4= With ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )* ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Periodic) ) {
                alt4=1;
            }
            else if ( (LA4_0==Hyperperiod) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalACLParser.g:244:2: ( () otherlv_1= Periodic )
                    {
                    // InternalACLParser.g:244:2: ( () otherlv_1= Periodic )
                    // InternalACLParser.g:244:3: () otherlv_1= Periodic
                    {
                    // InternalACLParser.g:244:3: ()
                    // InternalACLParser.g:245:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getComputationalModelAccess().getPeriodicComputationalModelAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,Periodic,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getComputationalModelAccess().getPeriodicKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalACLParser.g:256:6: ( () otherlv_3= Hyperperiod otherlv_4= With ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )* ) )
                    {
                    // InternalACLParser.g:256:6: ( () otherlv_3= Hyperperiod otherlv_4= With ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )* ) )
                    // InternalACLParser.g:256:7: () otherlv_3= Hyperperiod otherlv_4= With ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )* )
                    {
                    // InternalACLParser.g:256:7: ()
                    // InternalACLParser.g:257:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getComputationalModelAccess().getHyperperiodComputationalModelAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,Hyperperiod,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getComputationalModelAccess().getHyperperiodKeyword_1_1());
                          
                    }
                    otherlv_4=(Token)match(input,With,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getComputationalModelAccess().getWithKeyword_1_2());
                          
                    }
                    // InternalACLParser.g:272:1: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )* )
                    // InternalACLParser.g:272:2: ( (otherlv_5= RULE_ID ) ) (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )*
                    {
                    // InternalACLParser.g:272:2: ( (otherlv_5= RULE_ID ) )
                    // InternalACLParser.g:273:1: (otherlv_5= RULE_ID )
                    {
                    // InternalACLParser.g:273:1: (otherlv_5= RULE_ID )
                    // InternalACLParser.g:274:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getComputationalModelRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getComputationalModelAccess().getConstraintsNamedElementCrossReference_1_3_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalACLParser.g:285:2: (otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==LessThanSign) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalACLParser.g:286:2: otherlv_6= LessThanSign ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getComputationalModelAccess().getLessThanSignKeyword_1_3_1_0());
                    	          
                    	    }
                    	    // InternalACLParser.g:290:1: ( (otherlv_7= RULE_ID ) )
                    	    // InternalACLParser.g:291:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalACLParser.g:291:1: (otherlv_7= RULE_ID )
                    	    // InternalACLParser.g:292:3: otherlv_7= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getComputationalModelRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_7, grammarAccess.getComputationalModelAccess().getConstraintsNamedElementCrossReference_1_3_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


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
    // $ANTLR end "ruleComputationalModel"


    // $ANTLR start "entryRuleFlows"
    // InternalACLParser.g:311:1: entryRuleFlows returns [EObject current=null] : iv_ruleFlows= ruleFlows EOF ;
    public final EObject entryRuleFlows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlows = null;


        try {
            // InternalACLParser.g:312:2: (iv_ruleFlows= ruleFlows EOF )
            // InternalACLParser.g:313:2: iv_ruleFlows= ruleFlows EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFlows=ruleFlows();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlows; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlows"


    // $ANTLR start "ruleFlows"
    // InternalACLParser.g:320:1: ruleFlows returns [EObject current=null] : (otherlv_0= Flows ( ( ( RULE_ID ) )=> (lv_flows_1_0= ruleFlow ) )+ ) ;
    public final EObject ruleFlows() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_flows_1_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:323:28: ( (otherlv_0= Flows ( ( ( RULE_ID ) )=> (lv_flows_1_0= ruleFlow ) )+ ) )
            // InternalACLParser.g:324:1: (otherlv_0= Flows ( ( ( RULE_ID ) )=> (lv_flows_1_0= ruleFlow ) )+ )
            {
            // InternalACLParser.g:324:1: (otherlv_0= Flows ( ( ( RULE_ID ) )=> (lv_flows_1_0= ruleFlow ) )+ )
            // InternalACLParser.g:325:2: otherlv_0= Flows ( ( ( RULE_ID ) )=> (lv_flows_1_0= ruleFlow ) )+
            {
            otherlv_0=(Token)match(input,Flows,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFlowsAccess().getFlowsKeyword_0());
                  
            }
            // InternalACLParser.g:329:1: ( ( ( RULE_ID ) )=> (lv_flows_1_0= ruleFlow ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) && (synpred1_InternalACLParser())) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalACLParser.g:329:2: ( ( RULE_ID ) )=> (lv_flows_1_0= ruleFlow )
            	    {
            	    // InternalACLParser.g:335:1: (lv_flows_1_0= ruleFlow )
            	    // InternalACLParser.g:336:3: lv_flows_1_0= ruleFlow
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFlowsAccess().getFlowsFlowParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_flows_1_0=ruleFlow();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFlowsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"flows",
            	              		lv_flows_1_0, 
            	              		"org.sireum.aadl.osate.acl.ACL.Flow");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleFlows"


    // $ANTLR start "entryRuleFlow"
    // InternalACLParser.g:360:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // InternalACLParser.g:361:2: (iv_ruleFlow= ruleFlow EOF )
            // InternalACLParser.g:362:2: iv_ruleFlow= ruleFlow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFlow=ruleFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlow; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // InternalACLParser.g:369:1: ruleFlow returns [EObject current=null] : ( ( ( ( RULE_ID ) )=> (lv_flowId_0_0= RULE_ID ) ) otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= Fun ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token lv_flowId_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:372:28: ( ( ( ( ( RULE_ID ) )=> (lv_flowId_0_0= RULE_ID ) ) otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= Fun ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* ) )
            // InternalACLParser.g:373:1: ( ( ( ( RULE_ID ) )=> (lv_flowId_0_0= RULE_ID ) ) otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= Fun ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* )
            {
            // InternalACLParser.g:373:1: ( ( ( ( RULE_ID ) )=> (lv_flowId_0_0= RULE_ID ) ) otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= Fun ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )* )
            // InternalACLParser.g:373:2: ( ( ( RULE_ID ) )=> (lv_flowId_0_0= RULE_ID ) ) otherlv_1= Colon ( (otherlv_2= RULE_ID ) ) (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )* otherlv_5= Fun ( (otherlv_6= RULE_ID ) ) (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )*
            {
            // InternalACLParser.g:373:2: ( ( ( RULE_ID ) )=> (lv_flowId_0_0= RULE_ID ) )
            // InternalACLParser.g:373:3: ( ( RULE_ID ) )=> (lv_flowId_0_0= RULE_ID )
            {
            // InternalACLParser.g:379:1: (lv_flowId_0_0= RULE_ID )
            // InternalACLParser.g:380:3: lv_flowId_0_0= RULE_ID
            {
            lv_flowId_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_flowId_0_0, grammarAccess.getFlowAccess().getFlowIdIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFlowRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"flowId",
                      		lv_flowId_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFlowAccess().getColonKeyword_1());
                  
            }
            // InternalACLParser.g:401:1: ( (otherlv_2= RULE_ID ) )
            // InternalACLParser.g:402:1: (otherlv_2= RULE_ID )
            {
            // InternalACLParser.g:402:1: (otherlv_2= RULE_ID )
            // InternalACLParser.g:403:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFlowRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getFlowAccess().getSrcPortsNamedElementCrossReference_2_0()); 
              	
            }

            }


            }

            // InternalACLParser.g:414:2: (otherlv_3= Comma ( (otherlv_4= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Comma) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalACLParser.g:415:2: otherlv_3= Comma ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getFlowAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalACLParser.g:419:1: ( (otherlv_4= RULE_ID ) )
            	    // InternalACLParser.g:420:1: (otherlv_4= RULE_ID )
            	    {
            	    // InternalACLParser.g:420:1: (otherlv_4= RULE_ID )
            	    // InternalACLParser.g:421:3: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFlowRule());
            	      	        }
            	              
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_4, grammarAccess.getFlowAccess().getSrcPortsNamedElementCrossReference_3_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,Fun,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFlowAccess().getFunKeyword_4());
                  
            }
            // InternalACLParser.g:437:1: ( (otherlv_6= RULE_ID ) )
            // InternalACLParser.g:438:1: (otherlv_6= RULE_ID )
            {
            // InternalACLParser.g:438:1: (otherlv_6= RULE_ID )
            // InternalACLParser.g:439:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFlowRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getFlowAccess().getDstPortsNamedElementCrossReference_5_0()); 
              	
            }

            }


            }

            // InternalACLParser.g:450:2: (otherlv_7= Comma ( (otherlv_8= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalACLParser.g:451:2: otherlv_7= Comma ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,Comma,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getFlowAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalACLParser.g:455:1: ( (otherlv_8= RULE_ID ) )
            	    // InternalACLParser.g:456:1: (otherlv_8= RULE_ID )
            	    {
            	    // InternalACLParser.g:456:1: (otherlv_8= RULE_ID )
            	    // InternalACLParser.g:457:3: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFlowRule());
            	      	        }
            	              
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_8, grammarAccess.getFlowAccess().getDstPortsNamedElementCrossReference_6_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleContract"
    // InternalACLParser.g:476:1: entryRuleContract returns [EObject current=null] : iv_ruleContract= ruleContract EOF ;
    public final EObject entryRuleContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContract = null;


        try {
            // InternalACLParser.g:477:2: (iv_ruleContract= ruleContract EOF )
            // InternalACLParser.g:478:2: iv_ruleContract= ruleContract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContract=ruleContract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContract; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContract"


    // $ANTLR start "ruleContract"
    // InternalACLParser.g:485:1: ruleContract returns [EObject current=null] : (otherlv_0= Contracts ( (lv_specs_1_0= ruleSpecStatement ) )+ ) ;
    public final EObject ruleContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_specs_1_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:488:28: ( (otherlv_0= Contracts ( (lv_specs_1_0= ruleSpecStatement ) )+ ) )
            // InternalACLParser.g:489:1: (otherlv_0= Contracts ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            {
            // InternalACLParser.g:489:1: (otherlv_0= Contracts ( (lv_specs_1_0= ruleSpecStatement ) )+ )
            // InternalACLParser.g:490:2: otherlv_0= Contracts ( (lv_specs_1_0= ruleSpecStatement ) )+
            {
            otherlv_0=(Token)match(input,Contracts,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractsKeyword_0());
                  
            }
            // InternalACLParser.g:494:1: ( (lv_specs_1_0= ruleSpecStatement ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Guarantee||LA8_0==Assume) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalACLParser.g:495:1: (lv_specs_1_0= ruleSpecStatement )
            	    {
            	    // InternalACLParser.g:495:1: (lv_specs_1_0= ruleSpecStatement )
            	    // InternalACLParser.g:496:3: lv_specs_1_0= ruleSpecStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContractAccess().getSpecsSpecStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_specs_1_0=ruleSpecStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContractRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"specs",
            	              		lv_specs_1_0, 
            	              		"org.sireum.aadl.osate.acl.ACL.SpecStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleContract"


    // $ANTLR start "entryRuleSpecStatement"
    // InternalACLParser.g:520:1: entryRuleSpecStatement returns [EObject current=null] : iv_ruleSpecStatement= ruleSpecStatement EOF ;
    public final EObject entryRuleSpecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecStatement = null;


        try {
            // InternalACLParser.g:521:2: (iv_ruleSpecStatement= ruleSpecStatement EOF )
            // InternalACLParser.g:522:2: iv_ruleSpecStatement= ruleSpecStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecStatement=ruleSpecStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecStatement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSpecStatement"


    // $ANTLR start "ruleSpecStatement"
    // InternalACLParser.g:529:1: ruleSpecStatement returns [EObject current=null] : ( ( () otherlv_1= Assume (otherlv_2= For ( (otherlv_3= RULE_ID ) ) )? ( (lv_assumeTitle_4_0= RULE_STRING ) ) otherlv_5= Colon ( (lv_pred_6_0= rulePREDICATE ) ) (otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign )? ) | ( () otherlv_12= Guarantee ( (lv_guaranteeTitle_13_0= RULE_STRING ) ) otherlv_14= Colon ( (lv_expr_15_0= ruleExpr ) ) ) ) ;
    public final EObject ruleSpecStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_assumeTitle_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_tracesTo_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_guaranteeTitle_13_0=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_pred_6_0 = null;

        EObject lv_expr_15_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:532:28: ( ( ( () otherlv_1= Assume (otherlv_2= For ( (otherlv_3= RULE_ID ) ) )? ( (lv_assumeTitle_4_0= RULE_STRING ) ) otherlv_5= Colon ( (lv_pred_6_0= rulePREDICATE ) ) (otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign )? ) | ( () otherlv_12= Guarantee ( (lv_guaranteeTitle_13_0= RULE_STRING ) ) otherlv_14= Colon ( (lv_expr_15_0= ruleExpr ) ) ) ) )
            // InternalACLParser.g:533:1: ( ( () otherlv_1= Assume (otherlv_2= For ( (otherlv_3= RULE_ID ) ) )? ( (lv_assumeTitle_4_0= RULE_STRING ) ) otherlv_5= Colon ( (lv_pred_6_0= rulePREDICATE ) ) (otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign )? ) | ( () otherlv_12= Guarantee ( (lv_guaranteeTitle_13_0= RULE_STRING ) ) otherlv_14= Colon ( (lv_expr_15_0= ruleExpr ) ) ) )
            {
            // InternalACLParser.g:533:1: ( ( () otherlv_1= Assume (otherlv_2= For ( (otherlv_3= RULE_ID ) ) )? ( (lv_assumeTitle_4_0= RULE_STRING ) ) otherlv_5= Colon ( (lv_pred_6_0= rulePREDICATE ) ) (otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign )? ) | ( () otherlv_12= Guarantee ( (lv_guaranteeTitle_13_0= RULE_STRING ) ) otherlv_14= Colon ( (lv_expr_15_0= ruleExpr ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Assume) ) {
                alt11=1;
            }
            else if ( (LA11_0==Guarantee) ) {
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
                    // InternalACLParser.g:533:2: ( () otherlv_1= Assume (otherlv_2= For ( (otherlv_3= RULE_ID ) ) )? ( (lv_assumeTitle_4_0= RULE_STRING ) ) otherlv_5= Colon ( (lv_pred_6_0= rulePREDICATE ) ) (otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign )? )
                    {
                    // InternalACLParser.g:533:2: ( () otherlv_1= Assume (otherlv_2= For ( (otherlv_3= RULE_ID ) ) )? ( (lv_assumeTitle_4_0= RULE_STRING ) ) otherlv_5= Colon ( (lv_pred_6_0= rulePREDICATE ) ) (otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign )? )
                    // InternalACLParser.g:533:3: () otherlv_1= Assume (otherlv_2= For ( (otherlv_3= RULE_ID ) ) )? ( (lv_assumeTitle_4_0= RULE_STRING ) ) otherlv_5= Colon ( (lv_pred_6_0= rulePREDICATE ) ) (otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign )?
                    {
                    // InternalACLParser.g:533:3: ()
                    // InternalACLParser.g:534:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSpecStatementAccess().getAssumeStatementAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,Assume,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSpecStatementAccess().getAssumeKeyword_0_1());
                          
                    }
                    // InternalACLParser.g:544:1: (otherlv_2= For ( (otherlv_3= RULE_ID ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==For) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalACLParser.g:545:2: otherlv_2= For ( (otherlv_3= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,For,FollowSets000.FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getSpecStatementAccess().getForKeyword_0_2_0());
                                  
                            }
                            // InternalACLParser.g:549:1: ( (otherlv_3= RULE_ID ) )
                            // InternalACLParser.g:550:1: (otherlv_3= RULE_ID )
                            {
                            // InternalACLParser.g:550:1: (otherlv_3= RULE_ID )
                            // InternalACLParser.g:551:3: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getSpecStatementRule());
                              	        }
                                      
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_3, grammarAccess.getSpecStatementAccess().getForPortNamedElementCrossReference_0_2_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalACLParser.g:562:4: ( (lv_assumeTitle_4_0= RULE_STRING ) )
                    // InternalACLParser.g:563:1: (lv_assumeTitle_4_0= RULE_STRING )
                    {
                    // InternalACLParser.g:563:1: (lv_assumeTitle_4_0= RULE_STRING )
                    // InternalACLParser.g:564:3: lv_assumeTitle_4_0= RULE_STRING
                    {
                    lv_assumeTitle_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_assumeTitle_4_0, grammarAccess.getSpecStatementAccess().getAssumeTitleSTRINGTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSpecStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"assumeTitle",
                              		lv_assumeTitle_4_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,Colon,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSpecStatementAccess().getColonKeyword_0_4());
                          
                    }
                    // InternalACLParser.g:585:1: ( (lv_pred_6_0= rulePREDICATE ) )
                    // InternalACLParser.g:586:1: (lv_pred_6_0= rulePREDICATE )
                    {
                    // InternalACLParser.g:586:1: (lv_pred_6_0= rulePREDICATE )
                    // InternalACLParser.g:587:3: lv_pred_6_0= rulePREDICATE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpecStatementAccess().getPredPREDICATEParserRuleCall_0_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_pred_6_0=rulePREDICATE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSpecStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"pred",
                              		lv_pred_6_0, 
                              		"org.sireum.aadl.osate.acl.ACL.PREDICATE");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalACLParser.g:603:2: (otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==TracesTo) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalACLParser.g:604:2: otherlv_7= TracesTo otherlv_8= LessThanSign ( (lv_tracesTo_9_0= RULE_ID ) ) otherlv_10= GreaterThanSign
                            {
                            otherlv_7=(Token)match(input,TracesTo,FollowSets000.FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSpecStatementAccess().getTracesToKeyword_0_6_0());
                                  
                            }
                            otherlv_8=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getSpecStatementAccess().getLessThanSignKeyword_0_6_1());
                                  
                            }
                            // InternalACLParser.g:613:1: ( (lv_tracesTo_9_0= RULE_ID ) )
                            // InternalACLParser.g:614:1: (lv_tracesTo_9_0= RULE_ID )
                            {
                            // InternalACLParser.g:614:1: (lv_tracesTo_9_0= RULE_ID )
                            // InternalACLParser.g:615:3: lv_tracesTo_9_0= RULE_ID
                            {
                            lv_tracesTo_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_tracesTo_9_0, grammarAccess.getSpecStatementAccess().getTracesToIDTerminalRuleCall_0_6_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSpecStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"tracesTo",
                                      		lv_tracesTo_9_0, 
                                      		"org.osate.xtext.aadl2.properties.Properties.ID");
                              	    
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,GreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getSpecStatementAccess().getGreaterThanSignKeyword_0_6_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalACLParser.g:637:6: ( () otherlv_12= Guarantee ( (lv_guaranteeTitle_13_0= RULE_STRING ) ) otherlv_14= Colon ( (lv_expr_15_0= ruleExpr ) ) )
                    {
                    // InternalACLParser.g:637:6: ( () otherlv_12= Guarantee ( (lv_guaranteeTitle_13_0= RULE_STRING ) ) otherlv_14= Colon ( (lv_expr_15_0= ruleExpr ) ) )
                    // InternalACLParser.g:637:7: () otherlv_12= Guarantee ( (lv_guaranteeTitle_13_0= RULE_STRING ) ) otherlv_14= Colon ( (lv_expr_15_0= ruleExpr ) )
                    {
                    // InternalACLParser.g:637:7: ()
                    // InternalACLParser.g:638:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSpecStatementAccess().getGuaranteeStatementAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,Guarantee,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSpecStatementAccess().getGuaranteeKeyword_1_1());
                          
                    }
                    // InternalACLParser.g:648:1: ( (lv_guaranteeTitle_13_0= RULE_STRING ) )
                    // InternalACLParser.g:649:1: (lv_guaranteeTitle_13_0= RULE_STRING )
                    {
                    // InternalACLParser.g:649:1: (lv_guaranteeTitle_13_0= RULE_STRING )
                    // InternalACLParser.g:650:3: lv_guaranteeTitle_13_0= RULE_STRING
                    {
                    lv_guaranteeTitle_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_guaranteeTitle_13_0, grammarAccess.getSpecStatementAccess().getGuaranteeTitleSTRINGTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSpecStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"guaranteeTitle",
                              		lv_guaranteeTitle_13_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.STRING");
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,Colon,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getSpecStatementAccess().getColonKeyword_1_3());
                          
                    }
                    // InternalACLParser.g:671:1: ( (lv_expr_15_0= ruleExpr ) )
                    // InternalACLParser.g:672:1: (lv_expr_15_0= ruleExpr )
                    {
                    // InternalACLParser.g:672:1: (lv_expr_15_0= ruleExpr )
                    // InternalACLParser.g:673:3: lv_expr_15_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpecStatementAccess().getExprExprParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expr_15_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSpecStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_15_0, 
                              		"org.sireum.aadl.osate.acl.ACL.Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleSpecStatement"


    // $ANTLR start "entryRulePREDICATE"
    // InternalACLParser.g:697:1: entryRulePREDICATE returns [String current=null] : iv_rulePREDICATE= rulePREDICATE EOF ;
    public final String entryRulePREDICATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePREDICATE = null;


        try {
            // InternalACLParser.g:698:1: (iv_rulePREDICATE= rulePREDICATE EOF )
            // InternalACLParser.g:699:2: iv_rulePREDICATE= rulePREDICATE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPREDICATERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePREDICATE=rulePREDICATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePREDICATE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePREDICATE"


    // $ANTLR start "rulePREDICATE"
    // InternalACLParser.g:706:1: rulePREDICATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulePREDICATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:710:6: (this_ID_0= RULE_ID )
            // InternalACLParser.g:711:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPREDICATEAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "rulePREDICATE"


    // $ANTLR start "entryRuleExpr"
    // InternalACLParser.g:726:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalACLParser.g:727:2: (iv_ruleExpr= ruleExpr EOF )
            // InternalACLParser.g:728:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalACLParser.g:735:1: ruleExpr returns [EObject current=null] : this_ImpliesExpr_0= ruleImpliesExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:738:28: (this_ImpliesExpr_0= ruleImpliesExpr )
            // InternalACLParser.g:740:5: this_ImpliesExpr_0= ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAccess().getImpliesExprParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ImpliesExpr_0;
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // InternalACLParser.g:756:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // InternalACLParser.g:757:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // InternalACLParser.g:758:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // InternalACLParser.g:765:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:768:28: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? ) )
            // InternalACLParser.g:769:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? )
            {
            // InternalACLParser.g:769:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )? )
            // InternalACLParser.g:770:5: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_19);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_OrExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalACLParser.g:778:1: ( ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EqualsSignGreaterThanSign) && (synpred3_InternalACLParser())) {
                alt13=1;
            }
            else if ( (LA13_0==Implies) && (synpred3_InternalACLParser())) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalACLParser.g:778:2: ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) ) ( (lv_right_4_0= ruleImpliesExpr ) )
                    {
                    // InternalACLParser.g:778:2: ( ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) ) )
                    // InternalACLParser.g:778:3: ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )=> ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) )
                    {
                    // InternalACLParser.g:784:6: ( () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies ) )
                    // InternalACLParser.g:784:7: () (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies )
                    {
                    // InternalACLParser.g:784:7: ()
                    // InternalACLParser.g:785:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalACLParser.g:790:2: (otherlv_2= EqualsSignGreaterThanSign | otherlv_3= Implies )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==EqualsSignGreaterThanSign) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==Implies) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalACLParser.g:791:2: otherlv_2= EqualsSignGreaterThanSign
                            {
                            otherlv_2=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getImpliesExprAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalACLParser.g:797:2: otherlv_3= Implies
                            {
                            otherlv_3=(Token)match(input,Implies,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getImpliesExprAccess().getImpliesKeyword_1_0_0_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalACLParser.g:801:4: ( (lv_right_4_0= ruleImpliesExpr ) )
                    // InternalACLParser.g:802:1: (lv_right_4_0= ruleImpliesExpr )
                    {
                    // InternalACLParser.g:802:1: (lv_right_4_0= ruleImpliesExpr )
                    // InternalACLParser.g:803:3: lv_right_4_0= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_4_0=ruleImpliesExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImpliesExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_4_0, 
                              		"org.sireum.aadl.osate.acl.ACL.ImpliesExpr");
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
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalACLParser.g:827:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalACLParser.g:828:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalACLParser.g:829:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalACLParser.g:836:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:839:28: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* ) )
            // InternalACLParser.g:840:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* )
            {
            // InternalACLParser.g:840:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )* )
            // InternalACLParser.g:841:5: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AndExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalACLParser.g:849:1: ( ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Or) && (synpred4_InternalACLParser())) {
                    alt15=1;
                }
                else if ( (LA15_0==Orelse) && (synpred4_InternalACLParser())) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalACLParser.g:849:2: ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) ) ( (lv_right_4_0= ruleAndExpr ) )
            	    {
            	    // InternalACLParser.g:849:2: ( ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) ) )
            	    // InternalACLParser.g:849:3: ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )=> ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) )
            	    {
            	    // InternalACLParser.g:865:7: ( () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) ) )
            	    // InternalACLParser.g:865:8: () ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) )
            	    {
            	    // InternalACLParser.g:865:8: ()
            	    // InternalACLParser.g:866:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalACLParser.g:871:2: ( ( (lv_op_2_0= Or ) ) | ( (lv_op_3_0= Orelse ) ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==Or) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==Orelse) ) {
            	        alt14=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalACLParser.g:871:3: ( (lv_op_2_0= Or ) )
            	            {
            	            // InternalACLParser.g:871:3: ( (lv_op_2_0= Or ) )
            	            // InternalACLParser.g:872:1: (lv_op_2_0= Or )
            	            {
            	            // InternalACLParser.g:872:1: (lv_op_2_0= Or )
            	            // InternalACLParser.g:873:3: lv_op_2_0= Or
            	            {
            	            lv_op_2_0=(Token)match(input,Or,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_0, grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOrExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalACLParser.g:888:6: ( (lv_op_3_0= Orelse ) )
            	            {
            	            // InternalACLParser.g:888:6: ( (lv_op_3_0= Orelse ) )
            	            // InternalACLParser.g:889:1: (lv_op_3_0= Orelse )
            	            {
            	            // InternalACLParser.g:889:1: (lv_op_3_0= Orelse )
            	            // InternalACLParser.g:890:3: lv_op_3_0= Orelse
            	            {
            	            lv_op_3_0=(Token)match(input,Orelse,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_3_0, grammarAccess.getOrExprAccess().getOpOrelseKeyword_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOrExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_3_0, "orelse");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalACLParser.g:904:5: ( (lv_right_4_0= ruleAndExpr ) )
            	    // InternalACLParser.g:905:1: (lv_right_4_0= ruleAndExpr )
            	    {
            	    // InternalACLParser.g:905:1: (lv_right_4_0= ruleAndExpr )
            	    // InternalACLParser.g:906:3: lv_right_4_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_right_4_0=ruleAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"org.sireum.aadl.osate.acl.ACL.AndExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalACLParser.g:930:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalACLParser.g:931:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalACLParser.g:932:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalACLParser.g:939:1: ruleAndExpr returns [EObject current=null] : (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        EObject this_RelationalExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:942:28: ( (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* ) )
            // InternalACLParser.g:943:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            {
            // InternalACLParser.g:943:1: (this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )* )
            // InternalACLParser.g:944:5: this_RelationalExpr_0= ruleRelationalExpr ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getRelationalExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_RelationalExpr_0=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_RelationalExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalACLParser.g:952:1: ( ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==And) && (synpred5_InternalACLParser())) {
                    alt17=1;
                }
                else if ( (LA17_0==Andthen) && (synpred5_InternalACLParser())) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalACLParser.g:952:2: ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) ) ( (lv_right_4_0= ruleRelationalExpr ) )
            	    {
            	    // InternalACLParser.g:952:2: ( ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) ) )
            	    // InternalACLParser.g:952:3: ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )=> ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) )
            	    {
            	    // InternalACLParser.g:968:7: ( () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) ) )
            	    // InternalACLParser.g:968:8: () ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) )
            	    {
            	    // InternalACLParser.g:968:8: ()
            	    // InternalACLParser.g:969:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalACLParser.g:974:2: ( ( (lv_op_2_0= And ) ) | ( (lv_op_3_0= Andthen ) ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==And) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==Andthen) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalACLParser.g:974:3: ( (lv_op_2_0= And ) )
            	            {
            	            // InternalACLParser.g:974:3: ( (lv_op_2_0= And ) )
            	            // InternalACLParser.g:975:1: (lv_op_2_0= And )
            	            {
            	            // InternalACLParser.g:975:1: (lv_op_2_0= And )
            	            // InternalACLParser.g:976:3: lv_op_2_0= And
            	            {
            	            lv_op_2_0=(Token)match(input,And,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAndExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalACLParser.g:991:6: ( (lv_op_3_0= Andthen ) )
            	            {
            	            // InternalACLParser.g:991:6: ( (lv_op_3_0= Andthen ) )
            	            // InternalACLParser.g:992:1: (lv_op_3_0= Andthen )
            	            {
            	            // InternalACLParser.g:992:1: (lv_op_3_0= Andthen )
            	            // InternalACLParser.g:993:3: lv_op_3_0= Andthen
            	            {
            	            lv_op_3_0=(Token)match(input,Andthen,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_3_0, grammarAccess.getAndExprAccess().getOpAndthenKeyword_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAndExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_3_0, "andthen");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalACLParser.g:1007:5: ( (lv_right_4_0= ruleRelationalExpr ) )
            	    // InternalACLParser.g:1008:1: (lv_right_4_0= ruleRelationalExpr )
            	    {
            	    // InternalACLParser.g:1008:1: (lv_right_4_0= ruleRelationalExpr )
            	    // InternalACLParser.g:1009:3: lv_right_4_0= ruleRelationalExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightRelationalExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_right_4_0=ruleRelationalExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"org.sireum.aadl.osate.acl.ACL.RelationalExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleRelationalOp"
    // InternalACLParser.g:1033:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // InternalACLParser.g:1034:1: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // InternalACLParser.g:1035:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOp.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // InternalACLParser.g:1042:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:1046:6: ( (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign ) )
            // InternalACLParser.g:1047:1: (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign )
            {
            // InternalACLParser.g:1047:1: (kw= LessThanSign | kw= LessThanSignEqualsSign | kw= GreaterThanSign | kw= GreaterThanSignEqualsSign | kw= EqualsSign | kw= LessThanSignGreaterThanSign )
            int alt18=6;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt18=1;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt18=2;
                }
                break;
            case GreaterThanSign:
                {
                alt18=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt18=4;
                }
                break;
            case EqualsSign:
                {
                alt18=5;
                }
                break;
            case LessThanSignGreaterThanSign:
                {
                alt18=6;
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
                    // InternalACLParser.g:1048:2: kw= LessThanSign
                    {
                    kw=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalACLParser.g:1055:2: kw= LessThanSignEqualsSign
                    {
                    kw=(Token)match(input,LessThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalACLParser.g:1062:2: kw= GreaterThanSign
                    {
                    kw=(Token)match(input,GreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalACLParser.g:1069:2: kw= GreaterThanSignEqualsSign
                    {
                    kw=(Token)match(input,GreaterThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalACLParser.g:1076:2: kw= EqualsSign
                    {
                    kw=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalACLParser.g:1083:2: kw= LessThanSignGreaterThanSign
                    {
                    kw=(Token)match(input,LessThanSignGreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
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
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleRelationalExpr"
    // InternalACLParser.g:1096:1: entryRuleRelationalExpr returns [EObject current=null] : iv_ruleRelationalExpr= ruleRelationalExpr EOF ;
    public final EObject entryRuleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpr = null;


        try {
            // InternalACLParser.g:1097:2: (iv_ruleRelationalExpr= ruleRelationalExpr EOF )
            // InternalACLParser.g:1098:2: iv_ruleRelationalExpr= ruleRelationalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationalExpr=ruleRelationalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalExpr"


    // $ANTLR start "ruleRelationalExpr"
    // InternalACLParser.g:1105:1: ruleRelationalExpr returns [EObject current=null] : (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) ;
    public final EObject ruleRelationalExpr() throws RecognitionException {
        EObject current = null;

        EObject this_PlusExpr_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1108:28: ( (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? ) )
            // InternalACLParser.g:1109:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            {
            // InternalACLParser.g:1109:1: (this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )? )
            // InternalACLParser.g:1110:5: this_PlusExpr_0= rulePlusExpr ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExprAccess().getPlusExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_PlusExpr_0=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_PlusExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalACLParser.g:1118:1: ( ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LessThanSign) && (synpred6_InternalACLParser())) {
                alt19=1;
            }
            else if ( (LA19_0==LessThanSignEqualsSign) && (synpred6_InternalACLParser())) {
                alt19=1;
            }
            else if ( (LA19_0==GreaterThanSign) && (synpred6_InternalACLParser())) {
                alt19=1;
            }
            else if ( (LA19_0==GreaterThanSignEqualsSign) && (synpred6_InternalACLParser())) {
                alt19=1;
            }
            else if ( (LA19_0==EqualsSign) && (synpred6_InternalACLParser())) {
                alt19=1;
            }
            else if ( (LA19_0==LessThanSignGreaterThanSign) && (synpred6_InternalACLParser())) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalACLParser.g:1118:2: ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) ) ( (lv_right_3_0= rulePlusExpr ) )
                    {
                    // InternalACLParser.g:1118:2: ( ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) ) )
                    // InternalACLParser.g:1118:3: ( ( () ( ( ruleRelationalOp ) ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOp ) ) )
                    {
                    // InternalACLParser.g:1123:6: ( () ( (lv_op_2_0= ruleRelationalOp ) ) )
                    // InternalACLParser.g:1123:7: () ( (lv_op_2_0= ruleRelationalOp ) )
                    {
                    // InternalACLParser.g:1123:7: ()
                    // InternalACLParser.g:1124:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalACLParser.g:1129:2: ( (lv_op_2_0= ruleRelationalOp ) )
                    // InternalACLParser.g:1130:1: (lv_op_2_0= ruleRelationalOp )
                    {
                    // InternalACLParser.g:1130:1: (lv_op_2_0= ruleRelationalOp )
                    // InternalACLParser.g:1131:3: lv_op_2_0= ruleRelationalOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExprAccess().getOpRelationalOpParserRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_op_2_0=ruleRelationalOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"org.sireum.aadl.osate.acl.ACL.RelationalOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // InternalACLParser.g:1147:4: ( (lv_right_3_0= rulePlusExpr ) )
                    // InternalACLParser.g:1148:1: (lv_right_3_0= rulePlusExpr )
                    {
                    // InternalACLParser.g:1148:1: (lv_right_3_0= rulePlusExpr )
                    // InternalACLParser.g:1149:3: lv_right_3_0= rulePlusExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExprAccess().getRightPlusExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=rulePlusExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"org.sireum.aadl.osate.acl.ACL.PlusExpr");
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
    // $ANTLR end "ruleRelationalExpr"


    // $ANTLR start "entryRulePlusExpr"
    // InternalACLParser.g:1173:1: entryRulePlusExpr returns [EObject current=null] : iv_rulePlusExpr= rulePlusExpr EOF ;
    public final EObject entryRulePlusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusExpr = null;


        try {
            // InternalACLParser.g:1174:2: (iv_rulePlusExpr= rulePlusExpr EOF )
            // InternalACLParser.g:1175:2: iv_rulePlusExpr= rulePlusExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePlusExpr=rulePlusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusExpr"


    // $ANTLR start "rulePlusExpr"
    // InternalACLParser.g:1182:1: rulePlusExpr returns [EObject current=null] : (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* ) ;
    public final EObject rulePlusExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_TimesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1185:28: ( (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* ) )
            // InternalACLParser.g:1186:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* )
            {
            // InternalACLParser.g:1186:1: (this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )* )
            // InternalACLParser.g:1187:5: this_TimesExpr_0= ruleTimesExpr ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusExprAccess().getTimesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_23);
            this_TimesExpr_0=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_TimesExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalACLParser.g:1195:1: ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==PlusSign) && (synpred7_InternalACLParser())) {
                    alt21=1;
                }
                else if ( (LA21_0==HyphenMinus) && (synpred7_InternalACLParser())) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalACLParser.g:1195:2: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleTimesExpr ) )
            	    {
            	    // InternalACLParser.g:1195:2: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) )
            	    // InternalACLParser.g:1195:3: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
            	    {
            	    // InternalACLParser.g:1210:6: ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
            	    // InternalACLParser.g:1210:7: () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    {
            	    // InternalACLParser.g:1210:7: ()
            	    // InternalACLParser.g:1211:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalACLParser.g:1216:2: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    // InternalACLParser.g:1217:1: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    {
            	    // InternalACLParser.g:1217:1: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    // InternalACLParser.g:1218:1: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    {
            	    // InternalACLParser.g:1218:1: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==PlusSign) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==HyphenMinus) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalACLParser.g:1219:3: lv_op_2_1= PlusSign
            	            {
            	            lv_op_2_1=(Token)match(input,PlusSign,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getPlusExprAccess().getOpPlusSignKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPlusExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalACLParser.g:1232:8: lv_op_2_2= HyphenMinus
            	            {
            	            lv_op_2_2=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getPlusExprAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getPlusExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalACLParser.g:1248:4: ( (lv_right_3_0= ruleTimesExpr ) )
            	    // InternalACLParser.g:1249:1: (lv_right_3_0= ruleTimesExpr )
            	    {
            	    // InternalACLParser.g:1249:1: (lv_right_3_0= ruleTimesExpr )
            	    // InternalACLParser.g:1250:3: lv_right_3_0= ruleTimesExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusExprAccess().getRightTimesExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_right_3_0=ruleTimesExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPlusExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"org.sireum.aadl.osate.acl.ACL.TimesExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "rulePlusExpr"


    // $ANTLR start "entryRuleTimesExpr"
    // InternalACLParser.g:1274:1: entryRuleTimesExpr returns [EObject current=null] : iv_ruleTimesExpr= ruleTimesExpr EOF ;
    public final EObject entryRuleTimesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimesExpr = null;


        try {
            // InternalACLParser.g:1275:2: (iv_ruleTimesExpr= ruleTimesExpr EOF )
            // InternalACLParser.g:1276:2: iv_ruleTimesExpr= ruleTimesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTimesExpr=ruleTimesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimesExpr"


    // $ANTLR start "ruleTimesExpr"
    // InternalACLParser.g:1283:1: ruleTimesExpr returns [EObject current=null] : (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* ) ;
    public final EObject ruleTimesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExpExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1286:28: ( (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* ) )
            // InternalACLParser.g:1287:1: (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* )
            {
            // InternalACLParser.g:1287:1: (this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )* )
            // InternalACLParser.g:1288:5: this_ExpExpr_0= ruleExpExpr ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTimesExprAccess().getExpExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_24);
            this_ExpExpr_0=ruleExpExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ExpExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalACLParser.g:1296:1: ( ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Asterisk) && (synpred8_InternalACLParser())) {
                    alt23=1;
                }
                else if ( (LA23_0==Solidus) && (synpred8_InternalACLParser())) {
                    alt23=1;
                }
                else if ( (LA23_0==PercentSign) && (synpred8_InternalACLParser())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalACLParser.g:1296:2: ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) ) ( (lv_right_3_0= ruleExpExpr ) )
            	    {
            	    // InternalACLParser.g:1296:2: ( ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) ) )
            	    // InternalACLParser.g:1296:3: ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) )
            	    {
            	    // InternalACLParser.g:1315:6: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) ) )
            	    // InternalACLParser.g:1315:7: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) )
            	    {
            	    // InternalACLParser.g:1315:7: ()
            	    // InternalACLParser.g:1316:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalACLParser.g:1321:2: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) ) )
            	    // InternalACLParser.g:1322:1: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
            	    {
            	    // InternalACLParser.g:1322:1: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign ) )
            	    // InternalACLParser.g:1323:1: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
            	    {
            	    // InternalACLParser.g:1323:1: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= PercentSign )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case PercentSign:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalACLParser.g:1324:3: lv_op_2_1= Asterisk
            	            {
            	            lv_op_2_1=(Token)match(input,Asterisk,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getTimesExprAccess().getOpAsteriskKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalACLParser.g:1337:8: lv_op_2_2= Solidus
            	            {
            	            lv_op_2_2=(Token)match(input,Solidus,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getTimesExprAccess().getOpSolidusKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalACLParser.g:1350:8: lv_op_2_3= PercentSign
            	            {
            	            lv_op_2_3=(Token)match(input,PercentSign,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getTimesExprAccess().getOpPercentSignKeyword_1_0_0_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getTimesExprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalACLParser.g:1366:4: ( (lv_right_3_0= ruleExpExpr ) )
            	    // InternalACLParser.g:1367:1: (lv_right_3_0= ruleExpExpr )
            	    {
            	    // InternalACLParser.g:1367:1: (lv_right_3_0= ruleExpExpr )
            	    // InternalACLParser.g:1368:3: lv_right_3_0= ruleExpExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTimesExprAccess().getRightExpExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    lv_right_3_0=ruleExpExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTimesExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"org.sireum.aadl.osate.acl.ACL.ExpExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleTimesExpr"


    // $ANTLR start "entryRuleExpExpr"
    // InternalACLParser.g:1392:1: entryRuleExpExpr returns [EObject current=null] : iv_ruleExpExpr= ruleExpExpr EOF ;
    public final EObject entryRuleExpExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpExpr = null;


        try {
            // InternalACLParser.g:1393:2: (iv_ruleExpExpr= ruleExpExpr EOF )
            // InternalACLParser.g:1394:2: iv_ruleExpExpr= ruleExpExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpExpr=ruleExpExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpExpr"


    // $ANTLR start "ruleExpExpr"
    // InternalACLParser.g:1401:1: ruleExpExpr returns [EObject current=null] : (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) ;
    public final EObject ruleExpExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_PrefixExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1404:28: ( (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* ) )
            // InternalACLParser.g:1405:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            {
            // InternalACLParser.g:1405:1: (this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )* )
            // InternalACLParser.g:1406:5: this_PrefixExpr_0= rulePrefixExpr ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpExprAccess().getPrefixExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_PrefixExpr_0=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_PrefixExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalACLParser.g:1414:1: ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==CircumflexAccent) && (synpred9_InternalACLParser())) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalACLParser.g:1414:2: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= rulePrefixExpr ) )
            	    {
            	    // InternalACLParser.g:1414:2: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) )
            	    // InternalACLParser.g:1414:3: ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) )
            	    {
            	    // InternalACLParser.g:1422:6: ( () ( (lv_op_2_0= CircumflexAccent ) ) )
            	    // InternalACLParser.g:1422:7: () ( (lv_op_2_0= CircumflexAccent ) )
            	    {
            	    // InternalACLParser.g:1422:7: ()
            	    // InternalACLParser.g:1423:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalACLParser.g:1428:2: ( (lv_op_2_0= CircumflexAccent ) )
            	    // InternalACLParser.g:1429:1: (lv_op_2_0= CircumflexAccent )
            	    {
            	    // InternalACLParser.g:1429:1: (lv_op_2_0= CircumflexAccent )
            	    // InternalACLParser.g:1430:3: lv_op_2_0= CircumflexAccent
            	    {
            	    lv_op_2_0=(Token)match(input,CircumflexAccent,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExpExprRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "^");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalACLParser.g:1444:4: ( (lv_right_3_0= rulePrefixExpr ) )
            	    // InternalACLParser.g:1445:1: (lv_right_3_0= rulePrefixExpr )
            	    {
            	    // InternalACLParser.g:1445:1: (lv_right_3_0= rulePrefixExpr )
            	    // InternalACLParser.g:1446:3: lv_right_3_0= rulePrefixExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpExprAccess().getRightPrefixExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_right_3_0=rulePrefixExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"org.sireum.aadl.osate.acl.ACL.PrefixExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleExpExpr"


    // $ANTLR start "entryRulePrefixExpr"
    // InternalACLParser.g:1470:1: entryRulePrefixExpr returns [EObject current=null] : iv_rulePrefixExpr= rulePrefixExpr EOF ;
    public final EObject entryRulePrefixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixExpr = null;


        try {
            // InternalACLParser.g:1471:2: (iv_rulePrefixExpr= rulePrefixExpr EOF )
            // InternalACLParser.g:1472:2: iv_rulePrefixExpr= rulePrefixExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixExpr=rulePrefixExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixExpr"


    // $ANTLR start "rulePrefixExpr"
    // InternalACLParser.g:1479:1: rulePrefixExpr returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr ) ;
    public final EObject rulePrefixExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_expr_2_0 = null;

        EObject this_AtomicExpr_3 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1482:28: ( ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr ) )
            // InternalACLParser.g:1483:1: ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr )
            {
            // InternalACLParser.g:1483:1: ( ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) ) | this_AtomicExpr_3= ruleAtomicExpr )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Not||LA26_0==HyphenMinus) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalACLParser.g:1483:2: ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    {
                    // InternalACLParser.g:1483:2: ( () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) ) )
                    // InternalACLParser.g:1483:3: () ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) ) ( (lv_expr_2_0= rulePrefixExpr ) )
                    {
                    // InternalACLParser.g:1483:3: ()
                    // InternalACLParser.g:1484:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixExprAccess().getUnaryExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalACLParser.g:1489:2: ( ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) ) )
                    // InternalACLParser.g:1490:1: ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) )
                    {
                    // InternalACLParser.g:1490:1: ( (lv_op_1_1= HyphenMinus | lv_op_1_2= Not ) )
                    // InternalACLParser.g:1491:1: (lv_op_1_1= HyphenMinus | lv_op_1_2= Not )
                    {
                    // InternalACLParser.g:1491:1: (lv_op_1_1= HyphenMinus | lv_op_1_2= Not )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==HyphenMinus) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==Not) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalACLParser.g:1492:3: lv_op_1_1= HyphenMinus
                            {
                            lv_op_1_1=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_1, grammarAccess.getPrefixExprAccess().getOpHyphenMinusKeyword_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalACLParser.g:1505:8: lv_op_1_2= Not
                            {
                            lv_op_1_2=(Token)match(input,Not,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_2, grammarAccess.getPrefixExprAccess().getOpNotKeyword_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrefixExprRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalACLParser.g:1521:2: ( (lv_expr_2_0= rulePrefixExpr ) )
                    // InternalACLParser.g:1522:1: (lv_expr_2_0= rulePrefixExpr )
                    {
                    // InternalACLParser.g:1522:1: (lv_expr_2_0= rulePrefixExpr )
                    // InternalACLParser.g:1523:3: lv_expr_2_0= rulePrefixExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixExprAccess().getExprPrefixExprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expr_2_0=rulePrefixExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"org.sireum.aadl.osate.acl.ACL.PrefixExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalACLParser.g:1541:5: this_AtomicExpr_3= ruleAtomicExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixExprAccess().getAtomicExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpr_3=ruleAtomicExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AtomicExpr_3;
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
    // $ANTLR end "rulePrefixExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // InternalACLParser.g:1557:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // InternalACLParser.g:1558:2: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // InternalACLParser.g:1559:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicExpr"


    // $ANTLR start "ruleAtomicExpr"
    // InternalACLParser.g:1566:1: ruleAtomicExpr returns [EObject current=null] : ( () ( ( ruleQCREF ) ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:1569:28: ( ( () ( ( ruleQCREF ) ) ) )
            // InternalACLParser.g:1570:1: ( () ( ( ruleQCREF ) ) )
            {
            // InternalACLParser.g:1570:1: ( () ( ( ruleQCREF ) ) )
            // InternalACLParser.g:1570:2: () ( ( ruleQCREF ) )
            {
            // InternalACLParser.g:1570:2: ()
            // InternalACLParser.g:1571:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAtomicExprAccess().getIdExprAction_0(),
                          current);
                  
            }

            }

            // InternalACLParser.g:1576:2: ( ( ruleQCREF ) )
            // InternalACLParser.g:1577:1: ( ruleQCREF )
            {
            // InternalACLParser.g:1577:1: ( ruleQCREF )
            // InternalACLParser.g:1578:3: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAtomicExprRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAtomicExprAccess().getIdNamedElementCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleAtomicExpr"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // InternalACLParser.g:1602:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalACLParser.g:1603:2: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalACLParser.g:1604:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainedPropertyAssociation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainedPropertyAssociation"


    // $ANTLR start "ruleContainedPropertyAssociation"
    // InternalACLParser.g:1611:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
    public final EObject ruleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_append_2_0=null;
        Token lv_constant_3_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_ownedValue_4_0 = null;

        EObject lv_ownedValue_6_0 = null;

        EObject lv_appliesTo_8_0 = null;

        EObject lv_appliesTo_10_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1614:28: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalACLParser.g:1615:1: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalACLParser.g:1615:1: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalACLParser.g:1615:2: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalACLParser.g:1615:2: ( ( ruleQPREF ) )
            // InternalACLParser.g:1616:1: ( ruleQPREF )
            {
            // InternalACLParser.g:1616:1: ( ruleQPREF )
            // InternalACLParser.g:1617:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalACLParser.g:1631:2: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EqualsSignGreaterThanSign) ) {
                alt27=1;
            }
            else if ( (LA27_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalACLParser.g:1632:2: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalACLParser.g:1637:6: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalACLParser.g:1637:6: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalACLParser.g:1638:1: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalACLParser.g:1638:1: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalACLParser.g:1639:3: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "append", true, "+=>");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalACLParser.g:1653:3: ( (lv_constant_3_0= Constant ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Constant) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalACLParser.g:1654:1: (lv_constant_3_0= Constant )
                    {
                    // InternalACLParser.g:1654:1: (lv_constant_3_0= Constant )
                    // InternalACLParser.g:1655:3: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "constant");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalACLParser.g:1669:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalACLParser.g:1669:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalACLParser.g:1669:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalACLParser.g:1670:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalACLParser.g:1670:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalACLParser.g:1671:3: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_ownedValue_4_0=ruleOptionalModalPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
              	        }
                     		add(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_4_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalACLParser.g:1687:2: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalACLParser.g:1688:2: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	          
            	    }
            	    // InternalACLParser.g:1692:1: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalACLParser.g:1693:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalACLParser.g:1693:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalACLParser.g:1694:3: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    lv_ownedValue_6_0=ruleOptionalModalPropertyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedValue",
            	              		lv_ownedValue_6_0, 
            	              		"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            // InternalACLParser.g:1710:5: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Applies) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalACLParser.g:1711:5: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    ruleAppliesToKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalACLParser.g:1718:1: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalACLParser.g:1719:1: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalACLParser.g:1719:1: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalACLParser.g:1720:3: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_appliesTo_8_0=ruleContainmentPath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		add(
                             			current, 
                             			"appliesTo",
                              		lv_appliesTo_8_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalACLParser.g:1736:2: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==Comma) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalACLParser.g:1737:2: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalACLParser.g:1741:1: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalACLParser.g:1742:1: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalACLParser.g:1742:1: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalACLParser.g:1743:3: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    lv_appliesTo_10_0=ruleContainmentPath();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"appliesTo",
                    	              		lv_appliesTo_10_0, 
                    	              		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalACLParser.g:1759:6: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==In) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalACLParser.g:1760:5: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    ruleInBindingKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_12=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
                          
                    }
                    // InternalACLParser.g:1772:1: ( ( ruleQCREF ) )
                    // InternalACLParser.g:1773:1: ( ruleQCREF )
                    {
                    // InternalACLParser.g:1773:1: ( ruleQCREF )
                    // InternalACLParser.g:1774:3: ruleQCREF
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleContainedPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPath"
    // InternalACLParser.g:1810:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalACLParser.g:1811:2: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalACLParser.g:1812:2: iv_ruleContainmentPath= ruleContainmentPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentPathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainmentPath=ruleContainmentPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainmentPath; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainmentPath"


    // $ANTLR start "ruleContainmentPath"
    // InternalACLParser.g:1819:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1822:28: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalACLParser.g:1823:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalACLParser.g:1823:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalACLParser.g:1824:1: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalACLParser.g:1824:1: (lv_path_0_0= ruleContainmentPathElement )
            // InternalACLParser.g:1825:3: lv_path_0_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_path_0_0=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainmentPathRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleContainmentPath"


    // $ANTLR start "entryRuleOptionalModalPropertyValue"
    // InternalACLParser.g:1851:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalACLParser.g:1852:2: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalACLParser.g:1853:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalModalPropertyValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOptionalModalPropertyValue"


    // $ANTLR start "ruleOptionalModalPropertyValue"
    // InternalACLParser.g:1860:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
    public final EObject ruleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1863:28: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalACLParser.g:1864:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalACLParser.g:1864:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalACLParser.g:1864:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalACLParser.g:1864:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalACLParser.g:1865:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalACLParser.g:1865:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalACLParser.g:1866:3: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_33);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalACLParser.g:1882:2: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==In) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==Modes) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalACLParser.g:1883:5: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    ruleInModesKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // InternalACLParser.g:1895:1: ( (otherlv_3= RULE_ID ) )
                    // InternalACLParser.g:1896:1: (otherlv_3= RULE_ID )
                    {
                    // InternalACLParser.g:1896:1: (otherlv_3= RULE_ID )
                    // InternalACLParser.g:1897:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    // InternalACLParser.g:1908:2: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==Comma) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalACLParser.g:1909:2: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // InternalACLParser.g:1913:1: ( (otherlv_5= RULE_ID ) )
                    	    // InternalACLParser.g:1914:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalACLParser.g:1914:1: (otherlv_5= RULE_ID )
                    	    // InternalACLParser.g:1915:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4());
                          
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
    // $ANTLR end "ruleOptionalModalPropertyValue"


    // $ANTLR start "entryRulePropertyValue"
    // InternalACLParser.g:1939:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalACLParser.g:1940:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalACLParser.g:1941:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalACLParser.g:1948:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1951:28: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalACLParser.g:1952:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalACLParser.g:1952:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalACLParser.g:1953:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalACLParser.g:1953:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalACLParser.g:1954:3: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyValueRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyExpression"
    // InternalACLParser.g:1978:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalACLParser.g:1979:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalACLParser.g:1980:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // InternalACLParser.g:1987:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RecordTerm_0 = null;

        EObject this_ReferenceTerm_1 = null;

        EObject this_ComponentClassifierTerm_2 = null;

        EObject this_ComputedTerm_3 = null;

        EObject this_StringTerm_4 = null;

        EObject this_NumericRangeTerm_5 = null;

        EObject this_RealTerm_6 = null;

        EObject this_IntegerTerm_7 = null;

        EObject this_ListTerm_8 = null;

        EObject this_BooleanLiteral_9 = null;

        EObject this_LiteralorReferenceTerm_10 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:1990:28: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalACLParser.g:1991:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalACLParser.g:1991:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt35=11;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalACLParser.g:1992:5: this_RecordTerm_0= ruleRecordTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_RecordTerm_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalACLParser.g:2002:5: this_ReferenceTerm_1= ruleReferenceTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceTerm_1=ruleReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ReferenceTerm_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalACLParser.g:2012:5: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComponentClassifierTerm_2=ruleComponentClassifierTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ComponentClassifierTerm_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalACLParser.g:2022:5: this_ComputedTerm_3= ruleComputedTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComputedTerm_3=ruleComputedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ComputedTerm_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalACLParser.g:2032:5: this_StringTerm_4= ruleStringTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringTerm_4=ruleStringTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringTerm_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalACLParser.g:2042:5: this_NumericRangeTerm_5= ruleNumericRangeTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumericRangeTerm_5=ruleNumericRangeTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NumericRangeTerm_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalACLParser.g:2052:5: this_RealTerm_6= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealTerm_6=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_RealTerm_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalACLParser.g:2062:5: this_IntegerTerm_7= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerTerm_7=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_IntegerTerm_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalACLParser.g:2072:5: this_ListTerm_8= ruleListTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ListTerm_8=ruleListTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ListTerm_8;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalACLParser.g:2082:5: this_BooleanLiteral_9= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteral_9=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BooleanLiteral_9;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalACLParser.g:2092:5: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralorReferenceTerm_10;
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
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRuleLiteralorReferenceTerm"
    // InternalACLParser.g:2108:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalACLParser.g:2109:2: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalACLParser.g:2110:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralorReferenceTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralorReferenceTerm"


    // $ANTLR start "ruleLiteralorReferenceTerm"
    // InternalACLParser.g:2117:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:2120:28: ( ( ( ruleQPREF ) ) )
            // InternalACLParser.g:2121:1: ( ( ruleQPREF ) )
            {
            // InternalACLParser.g:2121:1: ( ( ruleQPREF ) )
            // InternalACLParser.g:2122:1: ( ruleQPREF )
            {
            // InternalACLParser.g:2122:1: ( ruleQPREF )
            // InternalACLParser.g:2123:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleLiteralorReferenceTerm"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalACLParser.g:2145:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalACLParser.g:2146:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalACLParser.g:2147:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalACLParser.g:2154:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:2157:28: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalACLParser.g:2158:1: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalACLParser.g:2158:1: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalACLParser.g:2158:2: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalACLParser.g:2158:2: ()
            // InternalACLParser.g:2159:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalACLParser.g:2164:2: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==True) ) {
                alt36=1;
            }
            else if ( (LA36_0==False) ) {
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
                    // InternalACLParser.g:2164:3: ( (lv_value_1_0= True ) )
                    {
                    // InternalACLParser.g:2164:3: ( (lv_value_1_0= True ) )
                    // InternalACLParser.g:2165:1: (lv_value_1_0= True )
                    {
                    // InternalACLParser.g:2165:1: (lv_value_1_0= True )
                    // InternalACLParser.g:2166:3: lv_value_1_0= True
                    {
                    lv_value_1_0=(Token)match(input,True,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalACLParser.g:2182:2: otherlv_2= False
                    {
                    otherlv_2=(Token)match(input,False,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                          
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // InternalACLParser.g:2194:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalACLParser.g:2195:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalACLParser.g:2196:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalACLParser.g:2203:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:2206:28: ( ( ( ruleQPREF ) ) )
            // InternalACLParser.g:2207:1: ( ( ruleQPREF ) )
            {
            // InternalACLParser.g:2207:1: ( ( ruleQPREF ) )
            // InternalACLParser.g:2208:1: ( ruleQPREF )
            {
            // InternalACLParser.g:2208:1: ( ruleQPREF )
            // InternalACLParser.g:2209:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleReferenceTerm"
    // InternalACLParser.g:2231:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalACLParser.g:2232:2: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalACLParser.g:2233:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceTerm=ruleReferenceTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceTerm"


    // $ANTLR start "ruleReferenceTerm"
    // InternalACLParser.g:2240:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2243:28: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalACLParser.g:2244:1: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalACLParser.g:2244:1: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalACLParser.g:2245:2: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalACLParser.g:2254:1: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalACLParser.g:2255:1: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalACLParser.g:2255:1: (lv_path_2_0= ruleContainmentPathElement )
            // InternalACLParser.g:2256:3: lv_path_2_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_path_2_0=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleReferenceTerm"


    // $ANTLR start "entryRuleRecordTerm"
    // InternalACLParser.g:2285:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalACLParser.g:2286:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalACLParser.g:2287:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // InternalACLParser.g:2294:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2297:28: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalACLParser.g:2298:1: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalACLParser.g:2298:1: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalACLParser.g:2299:2: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // InternalACLParser.g:2303:1: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalACLParser.g:2304:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalACLParser.g:2304:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalACLParser.g:2305:3: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedFieldValue",
            	              		lv_ownedFieldValue_1_0, 
            	              		"org.osate.xtext.aadl2.properties.Properties.FieldPropertyAssociation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_2=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());
                  
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
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleComputedTerm"
    // InternalACLParser.g:2336:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalACLParser.g:2337:2: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalACLParser.g:2338:2: iv_ruleComputedTerm= ruleComputedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputedTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComputedTerm=ruleComputedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComputedTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComputedTerm"


    // $ANTLR start "ruleComputedTerm"
    // InternalACLParser.g:2345:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:2348:28: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalACLParser.g:2349:1: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalACLParser.g:2349:1: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalACLParser.g:2350:2: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalACLParser.g:2359:1: ( (lv_function_2_0= RULE_ID ) )
            // InternalACLParser.g:2360:1: (lv_function_2_0= RULE_ID )
            {
            // InternalACLParser.g:2360:1: (lv_function_2_0= RULE_ID )
            // InternalACLParser.g:2361:3: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComputedTermRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"function",
                      		lv_function_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleComputedTerm"


    // $ANTLR start "entryRuleComponentClassifierTerm"
    // InternalACLParser.g:2390:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalACLParser.g:2391:2: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalACLParser.g:2392:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentClassifierTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentClassifierTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentClassifierTerm"


    // $ANTLR start "ruleComponentClassifierTerm"
    // InternalACLParser.g:2399:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:2402:28: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalACLParser.g:2403:1: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalACLParser.g:2403:1: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalACLParser.g:2404:2: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalACLParser.g:2413:1: ( ( ruleQCREF ) )
            // InternalACLParser.g:2414:1: ( ruleQCREF )
            {
            // InternalACLParser.g:2414:1: ( ruleQCREF )
            // InternalACLParser.g:2415:3: ruleQCREF
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentClassifierTermRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_31);
            ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleComponentClassifierTerm"


    // $ANTLR start "entryRuleListTerm"
    // InternalACLParser.g:2442:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalACLParser.g:2443:2: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalACLParser.g:2444:2: iv_ruleListTerm= ruleListTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListTerm"


    // $ANTLR start "ruleListTerm"
    // InternalACLParser.g:2451:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2454:28: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalACLParser.g:2455:1: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalACLParser.g:2455:1: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalACLParser.g:2455:2: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalACLParser.g:2455:2: ()
            // InternalACLParser.g:2456:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getListTermAccess().getListValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalACLParser.g:2466:1: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Classifier||LA39_0==Reference||LA39_0==Compute||LA39_0==False||LA39_0==True||LA39_0==LeftParenthesis||LA39_0==PlusSign||LA39_0==HyphenMinus||LA39_0==LeftSquareBracket||LA39_0==RULE_REAL_LIT||LA39_0==RULE_INTEGER_LIT||(LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalACLParser.g:2466:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalACLParser.g:2466:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalACLParser.g:2467:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalACLParser.g:2467:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalACLParser.g:2468:3: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_ownedListElement_2_0=rulePropertyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListTermRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedListElement",
                              		lv_ownedListElement_2_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalACLParser.g:2484:2: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==Comma) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalACLParser.g:2485:2: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalACLParser.g:2489:1: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalACLParser.g:2490:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalACLParser.g:2490:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalACLParser.g:2491:3: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    lv_ownedListElement_4_0=rulePropertyExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getListTermRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedListElement",
                    	              		lv_ownedListElement_4_0, 
                    	              		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleListTerm"


    // $ANTLR start "entryRuleFieldPropertyAssociation"
    // InternalACLParser.g:2520:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalACLParser.g:2521:2: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalACLParser.g:2522:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldPropertyAssociation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldPropertyAssociation"


    // $ANTLR start "ruleFieldPropertyAssociation"
    // InternalACLParser.g:2529:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2532:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalACLParser.g:2533:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalACLParser.g:2533:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalACLParser.g:2533:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalACLParser.g:2533:2: ( (otherlv_0= RULE_ID ) )
            // InternalACLParser.g:2534:1: (otherlv_0= RULE_ID )
            {
            // InternalACLParser.g:2534:1: (otherlv_0= RULE_ID )
            // InternalACLParser.g:2535:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // InternalACLParser.g:2551:1: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalACLParser.g:2552:1: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalACLParser.g:2552:1: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalACLParser.g:2553:3: lv_ownedValue_2_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_ownedValue_2_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleFieldPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPathElement"
    // InternalACLParser.g:2582:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalACLParser.g:2583:2: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalACLParser.g:2584:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentPathElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainmentPathElement=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainmentPathElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainmentPathElement"


    // $ANTLR start "ruleContainmentPathElement"
    // InternalACLParser.g:2591:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2594:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalACLParser.g:2595:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalACLParser.g:2595:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalACLParser.g:2595:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalACLParser.g:2595:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalACLParser.g:2595:3: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalACLParser.g:2595:3: ( (otherlv_0= RULE_ID ) )
            // InternalACLParser.g:2596:1: (otherlv_0= RULE_ID )
            {
            // InternalACLParser.g:2596:1: (otherlv_0= RULE_ID )
            // InternalACLParser.g:2597:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainmentPathElementRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); 
              	
            }

            }


            }

            // InternalACLParser.g:2608:2: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LeftSquareBracket) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalACLParser.g:2609:1: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalACLParser.g:2609:1: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalACLParser.g:2610:3: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_arrayRange_1_0=ruleArrayRange();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arrayRange",
            	              		lv_arrayRange_1_0, 
            	              		"org.osate.xtext.aadl2.properties.Properties.ArrayRange");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            // InternalACLParser.g:2626:4: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==FullStop) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalACLParser.g:2627:2: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                          
                    }
                    // InternalACLParser.g:2631:1: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalACLParser.g:2632:1: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalACLParser.g:2632:1: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalACLParser.g:2633:3: lv_path_3_0= ruleContainmentPathElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_path_3_0=ruleContainmentPathElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
                      	        }
                             		set(
                             			current, 
                             			"path",
                              		lv_path_3_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
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
    // $ANTLR end "ruleContainmentPathElement"


    // $ANTLR start "entryRulePlusMinus"
    // InternalACLParser.g:2659:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalACLParser.g:2660:1: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalACLParser.g:2661:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusMinusRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusMinus.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalACLParser.g:2668:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:2672:6: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalACLParser.g:2673:1: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalACLParser.g:2673:1: (kw= PlusSign | kw= HyphenMinus )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==PlusSign) ) {
                alt42=1;
            }
            else if ( (LA42_0==HyphenMinus) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalACLParser.g:2674:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalACLParser.g:2681:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleStringTerm"
    // InternalACLParser.g:2694:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalACLParser.g:2695:2: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalACLParser.g:2696:2: iv_ruleStringTerm= ruleStringTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringTerm=ruleStringTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringTerm"


    // $ANTLR start "ruleStringTerm"
    // InternalACLParser.g:2703:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2706:28: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalACLParser.g:2707:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalACLParser.g:2707:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalACLParser.g:2708:1: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalACLParser.g:2708:1: (lv_value_0_0= ruleNoQuoteString )
            // InternalACLParser.g:2709:3: lv_value_0_0= ruleNoQuoteString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_0_0=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.NoQuoteString");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleStringTerm"


    // $ANTLR start "entryRuleNoQuoteString"
    // InternalACLParser.g:2733:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalACLParser.g:2734:1: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalACLParser.g:2735:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoQuoteString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNoQuoteString"


    // $ANTLR start "ruleNoQuoteString"
    // InternalACLParser.g:2742:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:2746:6: (this_STRING_0= RULE_STRING )
            // InternalACLParser.g:2747:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleNoQuoteString"


    // $ANTLR start "entryRuleArrayRange"
    // InternalACLParser.g:2762:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalACLParser.g:2763:2: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalACLParser.g:2764:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayRange; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayRange"


    // $ANTLR start "ruleArrayRange"
    // InternalACLParser.g:2771:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2774:28: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalACLParser.g:2775:1: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalACLParser.g:2775:1: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalACLParser.g:2775:2: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalACLParser.g:2775:2: ()
            // InternalACLParser.g:2776:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalACLParser.g:2786:1: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalACLParser.g:2787:1: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalACLParser.g:2787:1: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalACLParser.g:2788:3: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_lowerBound_2_0=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalACLParser.g:2804:2: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==FullStopFullStop) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalACLParser.g:2805:2: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                          
                    }
                    // InternalACLParser.g:2809:1: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalACLParser.g:2810:1: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalACLParser.g:2810:1: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalACLParser.g:2811:3: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_upperBound_4_0=ruleINTVALUE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_4_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
                  
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
    // $ANTLR end "ruleArrayRange"


    // $ANTLR start "entryRuleSignedConstant"
    // InternalACLParser.g:2840:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalACLParser.g:2841:2: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalACLParser.g:2842:2: iv_ruleSignedConstant= ruleSignedConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedConstant=ruleSignedConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedConstant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignedConstant"


    // $ANTLR start "ruleSignedConstant"
    // InternalACLParser.g:2849:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2852:28: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalACLParser.g:2853:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalACLParser.g:2853:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalACLParser.g:2853:2: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalACLParser.g:2853:2: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalACLParser.g:2854:1: (lv_op_0_0= rulePlusMinus )
            {
            // InternalACLParser.g:2854:1: (lv_op_0_0= rulePlusMinus )
            // InternalACLParser.g:2855:3: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_op_0_0=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.PlusMinus");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalACLParser.g:2871:2: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalACLParser.g:2872:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalACLParser.g:2872:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalACLParser.g:2873:3: lv_ownedPropertyExpression_1_0= ruleConstantValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedPropertyExpression_1_0=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
              	        }
                     		add(
                     			current, 
                     			"ownedPropertyExpression",
                      		lv_ownedPropertyExpression_1_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ConstantValue");
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
    // $ANTLR end "ruleSignedConstant"


    // $ANTLR start "entryRuleIntegerTerm"
    // InternalACLParser.g:2897:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalACLParser.g:2898:2: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalACLParser.g:2899:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerTerm=ruleIntegerTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerTerm"


    // $ANTLR start "ruleIntegerTerm"
    // InternalACLParser.g:2906:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:2909:28: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalACLParser.g:2910:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalACLParser.g:2910:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalACLParser.g:2910:2: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalACLParser.g:2910:2: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalACLParser.g:2911:1: (lv_value_0_0= ruleSignedInt )
            {
            // InternalACLParser.g:2911:1: (lv_value_0_0= ruleSignedInt )
            // InternalACLParser.g:2912:3: lv_value_0_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.SignedInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalACLParser.g:2928:2: ( (otherlv_1= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalACLParser.g:2929:1: (otherlv_1= RULE_ID )
                    {
                    // InternalACLParser.g:2929:1: (otherlv_1= RULE_ID )
                    // InternalACLParser.g:2930:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getIntegerTermRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                      	
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
    // $ANTLR end "ruleIntegerTerm"


    // $ANTLR start "entryRuleSignedInt"
    // InternalACLParser.g:2949:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalACLParser.g:2950:1: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalACLParser.g:2951:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalACLParser.g:2958:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:2962:6: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalACLParser.g:2963:1: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalACLParser.g:2963:1: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalACLParser.g:2963:2: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalACLParser.g:2963:2: (kw= PlusSign | kw= HyphenMinus )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==PlusSign) ) {
                alt45=1;
            }
            else if ( (LA45_0==HyphenMinus) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // InternalACLParser.g:2964:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalACLParser.g:2971:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INTEGER_LIT_2=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INTEGER_LIT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INTEGER_LIT_2, grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleRealTerm"
    // InternalACLParser.g:2991:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalACLParser.g:2992:2: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalACLParser.g:2993:2: iv_ruleRealTerm= ruleRealTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRealTerm=ruleRealTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealTerm"


    // $ANTLR start "ruleRealTerm"
    // InternalACLParser.g:3000:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:3003:28: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalACLParser.g:3004:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalACLParser.g:3004:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalACLParser.g:3004:2: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalACLParser.g:3004:2: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalACLParser.g:3005:1: (lv_value_0_0= ruleSignedReal )
            {
            // InternalACLParser.g:3005:1: (lv_value_0_0= ruleSignedReal )
            // InternalACLParser.g:3006:3: lv_value_0_0= ruleSignedReal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_7);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRealTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.SignedReal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalACLParser.g:3022:2: ( (otherlv_1= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalACLParser.g:3023:1: (otherlv_1= RULE_ID )
                    {
                    // InternalACLParser.g:3023:1: (otherlv_1= RULE_ID )
                    // InternalACLParser.g:3024:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRealTermRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                      	
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
    // $ANTLR end "ruleRealTerm"


    // $ANTLR start "entryRuleSignedReal"
    // InternalACLParser.g:3043:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalACLParser.g:3044:1: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalACLParser.g:3045:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedRealRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedReal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignedReal"


    // $ANTLR start "ruleSignedReal"
    // InternalACLParser.g:3052:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:3056:6: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalACLParser.g:3057:1: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalACLParser.g:3057:1: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalACLParser.g:3057:2: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalACLParser.g:3057:2: (kw= PlusSign | kw= HyphenMinus )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==PlusSign) ) {
                alt47=1;
            }
            else if ( (LA47_0==HyphenMinus) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // InternalACLParser.g:3058:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalACLParser.g:3065:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_REAL_LIT_2=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_REAL_LIT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_REAL_LIT_2, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleSignedReal"


    // $ANTLR start "entryRuleNumericRangeTerm"
    // InternalACLParser.g:3085:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalACLParser.g:3086:2: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalACLParser.g:3087:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericRangeTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumericRangeTerm=ruleNumericRangeTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericRangeTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericRangeTerm"


    // $ANTLR start "ruleNumericRangeTerm"
    // InternalACLParser.g:3094:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:3097:28: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalACLParser.g:3098:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalACLParser.g:3098:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalACLParser.g:3098:2: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalACLParser.g:3098:2: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalACLParser.g:3099:1: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalACLParser.g:3099:1: (lv_minimum_0_0= ruleNumAlt )
            // InternalACLParser.g:3100:3: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_44);
            lv_minimum_0_0=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
              	        }
                     		set(
                     			current, 
                     			"minimum",
                      		lv_minimum_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
                  
            }
            // InternalACLParser.g:3121:1: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalACLParser.g:3122:1: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalACLParser.g:3122:1: (lv_maximum_2_0= ruleNumAlt )
            // InternalACLParser.g:3123:3: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_45);
            lv_maximum_2_0=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
              	        }
                     		set(
                     			current, 
                     			"maximum",
                      		lv_maximum_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalACLParser.g:3139:2: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Delta) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalACLParser.g:3140:2: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                          
                    }
                    // InternalACLParser.g:3144:1: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalACLParser.g:3145:1: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalACLParser.g:3145:1: (lv_delta_4_0= ruleNumAlt )
                    // InternalACLParser.g:3146:3: lv_delta_4_0= ruleNumAlt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_delta_4_0=ruleNumAlt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"delta",
                              		lv_delta_4_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
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
    // $ANTLR end "ruleNumericRangeTerm"


    // $ANTLR start "entryRuleNumAlt"
    // InternalACLParser.g:3170:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalACLParser.g:3171:2: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalACLParser.g:3172:2: iv_ruleNumAlt= ruleNumAlt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumAltRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumAlt=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumAlt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumAlt"


    // $ANTLR start "ruleNumAlt"
    // InternalACLParser.g:3179:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;


         enterRule(); 
            
        try {
            // InternalACLParser.g:3182:28: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalACLParser.g:3183:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalACLParser.g:3183:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt49=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt49=3;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt49=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt49=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt49=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt49=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt49=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt49=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt49=2;
                }
                break;
            case RULE_ID:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalACLParser.g:3184:5: this_RealTerm_0= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealTerm_0=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_RealTerm_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalACLParser.g:3194:5: this_IntegerTerm_1= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerTerm_1=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_IntegerTerm_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalACLParser.g:3204:5: this_SignedConstant_2= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SignedConstant_2=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SignedConstant_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalACLParser.g:3214:5: this_ConstantValue_3= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConstantValue_3=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ConstantValue_3;
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
    // $ANTLR end "ruleNumAlt"


    // $ANTLR start "entryRuleAppliesToKeywords"
    // InternalACLParser.g:3230:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalACLParser.g:3231:1: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalACLParser.g:3232:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliesToKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAppliesToKeywords=ruleAppliesToKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliesToKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAppliesToKeywords"


    // $ANTLR start "ruleAppliesToKeywords"
    // InternalACLParser.g:3239:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:3243:6: ( (kw= Applies kw= To ) )
            // InternalACLParser.g:3244:1: (kw= Applies kw= To )
            {
            // InternalACLParser.g:3244:1: (kw= Applies kw= To )
            // InternalACLParser.g:3245:2: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0()); 
                  
            }
            kw=(Token)match(input,To,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1()); 
                  
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
    // $ANTLR end "ruleAppliesToKeywords"


    // $ANTLR start "entryRuleInBindingKeywords"
    // InternalACLParser.g:3264:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalACLParser.g:3265:1: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalACLParser.g:3266:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInBindingKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInBindingKeywords=ruleInBindingKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInBindingKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInBindingKeywords"


    // $ANTLR start "ruleInBindingKeywords"
    // InternalACLParser.g:3273:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:3277:6: ( (kw= In kw= Binding ) )
            // InternalACLParser.g:3278:1: (kw= In kw= Binding )
            {
            // InternalACLParser.g:3278:1: (kw= In kw= Binding )
            // InternalACLParser.g:3279:2: kw= In kw= Binding
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0()); 
                  
            }
            kw=(Token)match(input,Binding,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1()); 
                  
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
    // $ANTLR end "ruleInBindingKeywords"


    // $ANTLR start "entryRuleInModesKeywords"
    // InternalACLParser.g:3298:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalACLParser.g:3299:1: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalACLParser.g:3300:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInModesKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInModesKeywords=ruleInModesKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInModesKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInModesKeywords"


    // $ANTLR start "ruleInModesKeywords"
    // InternalACLParser.g:3307:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:3311:6: ( (kw= In kw= Modes ) )
            // InternalACLParser.g:3312:1: (kw= In kw= Modes )
            {
            // InternalACLParser.g:3312:1: (kw= In kw= Modes )
            // InternalACLParser.g:3313:2: kw= In kw= Modes
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0()); 
                  
            }
            kw=(Token)match(input,Modes,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getModesKeyword_1()); 
                  
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
    // $ANTLR end "ruleInModesKeywords"


    // $ANTLR start "entryRuleINTVALUE"
    // InternalACLParser.g:3332:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalACLParser.g:3333:1: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalACLParser.g:3334:2: iv_ruleINTVALUE= ruleINTVALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTVALUERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleINTVALUE=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTVALUE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleINTVALUE"


    // $ANTLR start "ruleINTVALUE"
    // InternalACLParser.g:3341:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:3345:6: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalACLParser.g:3346:5: this_INTEGER_LIT_0= RULE_INTEGER_LIT
            {
            this_INTEGER_LIT_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INTEGER_LIT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleINTVALUE"


    // $ANTLR start "entryRuleQPREF"
    // InternalACLParser.g:3363:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalACLParser.g:3364:1: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalACLParser.g:3365:2: iv_ruleQPREF= ruleQPREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQPREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQPREF.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQPREF"


    // $ANTLR start "ruleQPREF"
    // InternalACLParser.g:3372:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:3376:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalACLParser.g:3377:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalACLParser.g:3377:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalACLParser.g:3377:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalACLParser.g:3384:1: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ColonColon) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalACLParser.g:3385:2: kw= ColonColon this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
                          
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
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQCREF"
    // InternalACLParser.g:3405:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalACLParser.g:3406:1: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalACLParser.g:3407:2: iv_ruleQCREF= ruleQCREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQCREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQCREF.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQCREF"


    // $ANTLR start "ruleQCREF"
    // InternalACLParser.g:3414:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:3418:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalACLParser.g:3419:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalACLParser.g:3419:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalACLParser.g:3419:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalACLParser.g:3419:2: (this_ID_0= RULE_ID kw= ColonColon )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==ColonColon) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalACLParser.g:3419:7: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // InternalACLParser.g:3439:1: (kw= FullStop this_ID_4= RULE_ID )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==FullStop) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalACLParser.g:3440:2: kw= FullStop this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); 
                          
                    }
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); 
                          
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
    // $ANTLR end "ruleQCREF"


    // $ANTLR start "entryRuleSTAR"
    // InternalACLParser.g:3460:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalACLParser.g:3461:1: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalACLParser.g:3462:2: iv_ruleSTAR= ruleSTAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSTARRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSTAR.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSTAR"


    // $ANTLR start "ruleSTAR"
    // InternalACLParser.g:3469:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalACLParser.g:3473:6: (kw= Asterisk )
            // InternalACLParser.g:3475:2: kw= Asterisk
            {
            kw=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword()); 
                  
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
    // $ANTLR end "ruleSTAR"

    // $ANTLR start synpred1_InternalACLParser
    public final void synpred1_InternalACLParser_fragment() throws RecognitionException {   
        // InternalACLParser.g:329:2: ( ( RULE_ID ) )
        // InternalACLParser.g:330:1: ( RULE_ID )
        {
        // InternalACLParser.g:330:1: ( RULE_ID )
        // InternalACLParser.g:331:1: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalACLParser

    // $ANTLR start synpred3_InternalACLParser
    public final void synpred3_InternalACLParser_fragment() throws RecognitionException {   
        // InternalACLParser.g:778:3: ( ( () ( EqualsSignGreaterThanSign | Implies ) ) )
        // InternalACLParser.g:778:4: ( () ( EqualsSignGreaterThanSign | Implies ) )
        {
        // InternalACLParser.g:778:4: ( () ( EqualsSignGreaterThanSign | Implies ) )
        // InternalACLParser.g:778:5: () ( EqualsSignGreaterThanSign | Implies )
        {
        // InternalACLParser.g:778:5: ()
        // InternalACLParser.g:779:1: 
        {
        }

        if ( input.LA(1)==Implies||input.LA(1)==EqualsSignGreaterThanSign ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred3_InternalACLParser

    // $ANTLR start synpred4_InternalACLParser
    public final void synpred4_InternalACLParser_fragment() throws RecognitionException {   
        // InternalACLParser.g:849:3: ( ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) ) )
        // InternalACLParser.g:849:4: ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) )
        {
        // InternalACLParser.g:849:4: ( () ( ( ( Or ) ) | ( ( Orelse ) ) ) )
        // InternalACLParser.g:849:5: () ( ( ( Or ) ) | ( ( Orelse ) ) )
        {
        // InternalACLParser.g:849:5: ()
        // InternalACLParser.g:850:1: 
        {
        }

        // InternalACLParser.g:850:2: ( ( ( Or ) ) | ( ( Orelse ) ) )
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( (LA53_0==Or) ) {
            alt53=1;
        }
        else if ( (LA53_0==Orelse) ) {
            alt53=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 53, 0, input);

            throw nvae;
        }
        switch (alt53) {
            case 1 :
                // InternalACLParser.g:850:3: ( ( Or ) )
                {
                // InternalACLParser.g:850:3: ( ( Or ) )
                // InternalACLParser.g:851:1: ( Or )
                {
                // InternalACLParser.g:851:1: ( Or )
                // InternalACLParser.g:853:1: Or
                {
                match(input,Or,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalACLParser.g:858:6: ( ( Orelse ) )
                {
                // InternalACLParser.g:858:6: ( ( Orelse ) )
                // InternalACLParser.g:859:1: ( Orelse )
                {
                // InternalACLParser.g:859:1: ( Orelse )
                // InternalACLParser.g:861:1: Orelse
                {
                match(input,Orelse,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalACLParser

    // $ANTLR start synpred5_InternalACLParser
    public final void synpred5_InternalACLParser_fragment() throws RecognitionException {   
        // InternalACLParser.g:952:3: ( ( () ( ( ( And ) ) | ( ( Andthen ) ) ) ) )
        // InternalACLParser.g:952:4: ( () ( ( ( And ) ) | ( ( Andthen ) ) ) )
        {
        // InternalACLParser.g:952:4: ( () ( ( ( And ) ) | ( ( Andthen ) ) ) )
        // InternalACLParser.g:952:5: () ( ( ( And ) ) | ( ( Andthen ) ) )
        {
        // InternalACLParser.g:952:5: ()
        // InternalACLParser.g:953:1: 
        {
        }

        // InternalACLParser.g:953:2: ( ( ( And ) ) | ( ( Andthen ) ) )
        int alt54=2;
        int LA54_0 = input.LA(1);

        if ( (LA54_0==And) ) {
            alt54=1;
        }
        else if ( (LA54_0==Andthen) ) {
            alt54=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 54, 0, input);

            throw nvae;
        }
        switch (alt54) {
            case 1 :
                // InternalACLParser.g:953:3: ( ( And ) )
                {
                // InternalACLParser.g:953:3: ( ( And ) )
                // InternalACLParser.g:954:1: ( And )
                {
                // InternalACLParser.g:954:1: ( And )
                // InternalACLParser.g:956:1: And
                {
                match(input,And,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalACLParser.g:961:6: ( ( Andthen ) )
                {
                // InternalACLParser.g:961:6: ( ( Andthen ) )
                // InternalACLParser.g:962:1: ( Andthen )
                {
                // InternalACLParser.g:962:1: ( Andthen )
                // InternalACLParser.g:964:1: Andthen
                {
                match(input,Andthen,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalACLParser

    // $ANTLR start synpred6_InternalACLParser
    public final void synpred6_InternalACLParser_fragment() throws RecognitionException {   
        // InternalACLParser.g:1118:3: ( ( () ( ( ruleRelationalOp ) ) ) )
        // InternalACLParser.g:1118:4: ( () ( ( ruleRelationalOp ) ) )
        {
        // InternalACLParser.g:1118:4: ( () ( ( ruleRelationalOp ) ) )
        // InternalACLParser.g:1118:5: () ( ( ruleRelationalOp ) )
        {
        // InternalACLParser.g:1118:5: ()
        // InternalACLParser.g:1119:1: 
        {
        }

        // InternalACLParser.g:1119:2: ( ( ruleRelationalOp ) )
        // InternalACLParser.g:1120:1: ( ruleRelationalOp )
        {
        // InternalACLParser.g:1120:1: ( ruleRelationalOp )
        // InternalACLParser.g:1121:1: ruleRelationalOp
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleRelationalOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalACLParser

    // $ANTLR start synpred7_InternalACLParser
    public final void synpred7_InternalACLParser_fragment() throws RecognitionException {   
        // InternalACLParser.g:1195:3: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )
        // InternalACLParser.g:1195:4: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        {
        // InternalACLParser.g:1195:4: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        // InternalACLParser.g:1195:5: () ( ( ( PlusSign | HyphenMinus ) ) )
        {
        // InternalACLParser.g:1195:5: ()
        // InternalACLParser.g:1196:1: 
        {
        }

        // InternalACLParser.g:1196:2: ( ( ( PlusSign | HyphenMinus ) ) )
        // InternalACLParser.g:1197:1: ( ( PlusSign | HyphenMinus ) )
        {
        // InternalACLParser.g:1197:1: ( ( PlusSign | HyphenMinus ) )
        // InternalACLParser.g:1198:1: ( PlusSign | HyphenMinus )
        {
        if ( input.LA(1)==PlusSign||input.LA(1)==HyphenMinus ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalACLParser

    // $ANTLR start synpred8_InternalACLParser
    public final void synpred8_InternalACLParser_fragment() throws RecognitionException {   
        // InternalACLParser.g:1296:3: ( ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) ) )
        // InternalACLParser.g:1296:4: ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) )
        {
        // InternalACLParser.g:1296:4: ( () ( ( ( Asterisk | Solidus | PercentSign ) ) ) )
        // InternalACLParser.g:1296:5: () ( ( ( Asterisk | Solidus | PercentSign ) ) )
        {
        // InternalACLParser.g:1296:5: ()
        // InternalACLParser.g:1297:1: 
        {
        }

        // InternalACLParser.g:1297:2: ( ( ( Asterisk | Solidus | PercentSign ) ) )
        // InternalACLParser.g:1298:1: ( ( Asterisk | Solidus | PercentSign ) )
        {
        // InternalACLParser.g:1298:1: ( ( Asterisk | Solidus | PercentSign ) )
        // InternalACLParser.g:1299:1: ( Asterisk | Solidus | PercentSign )
        {
        if ( input.LA(1)==PercentSign||input.LA(1)==Asterisk||input.LA(1)==Solidus ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalACLParser

    // $ANTLR start synpred9_InternalACLParser
    public final void synpred9_InternalACLParser_fragment() throws RecognitionException {   
        // InternalACLParser.g:1414:3: ( ( () ( ( CircumflexAccent ) ) ) )
        // InternalACLParser.g:1414:4: ( () ( ( CircumflexAccent ) ) )
        {
        // InternalACLParser.g:1414:4: ( () ( ( CircumflexAccent ) ) )
        // InternalACLParser.g:1414:5: () ( ( CircumflexAccent ) )
        {
        // InternalACLParser.g:1414:5: ()
        // InternalACLParser.g:1415:1: 
        {
        }

        // InternalACLParser.g:1415:2: ( ( CircumflexAccent ) )
        // InternalACLParser.g:1416:1: ( CircumflexAccent )
        {
        // InternalACLParser.g:1416:1: ( CircumflexAccent )
        // InternalACLParser.g:1418:1: CircumflexAccent
        {
        match(input,CircumflexAccent,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalACLParser

    // Delegated rules

    public final boolean synpred1_InternalACLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalACLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalACLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalACLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalACLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalACLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalACLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalACLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalACLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalACLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalACLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalACLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalACLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalACLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalACLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalACLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_3s = "\1\5\5\uffff\2\76\3\15\3\uffff\1\15\1\uffff\1\15\1\uffff\1\103\1\uffff\1\15";
    static final String dfa_4s = "\1\103\5\uffff\4\103\1\61\3\uffff\1\61\1\uffff\1\61\1\uffff\1\103\1\uffff\1\61";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\2\uffff\1\2\6\uffff\1\4\5\uffff\1\14\2\uffff\1\14\17\uffff\1\13\2\uffff\1\6\1\uffff\1\7\7\uffff\1\1\10\uffff\1\10\1\uffff\1\11\1\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\uffff\1\11\2\uffff\1\15",
            "\1\10\1\uffff\1\11\2\uffff\1\15",
            "\1\17\20\uffff\1\15\5\uffff\1\17\4\uffff\1\17\2\uffff\1\17\4\uffff\1\17\21\uffff\1\16",
            "\1\21\20\uffff\1\15\5\uffff\1\21\4\uffff\1\21\2\uffff\1\21\4\uffff\1\21\21\uffff\1\20",
            "\1\23\20\uffff\1\15\1\22\4\uffff\1\23\4\uffff\1\23\2\uffff\1\23\4\uffff\1\23",
            "",
            "",
            "",
            "\1\17\20\uffff\1\15\5\uffff\1\17\4\uffff\1\17\2\uffff\1\17\4\uffff\1\17",
            "",
            "\1\21\20\uffff\1\15\5\uffff\1\21\4\uffff\1\21\2\uffff\1\21\4\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\20\uffff\1\15\5\uffff\1\23\4\uffff\1\23\2\uffff\1\23\4\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1991:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400452L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040080L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040082L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200020000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400010002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000080002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008001002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x001C000B00000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000280000000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000848000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4020290001208320L,0x000000000000000DL});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002101000002000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002101000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x40202B0001208320L,0x000000000000000DL});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020400000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000040000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000280000000000L,0x0000000000000009L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000002L});
    }


}