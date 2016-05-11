package org.neclipse.xtext.smalljavadsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.smalljavadsl.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'", "'clazz'", "'extends'", "'{'", "'}'", "'[]'", "'String'", "'Boolean'", "'Integer'", "'Long'", "'Double'", "'public'", "'private'"
    };
    public static final int RULE_STRING=6;
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
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallJavaDsl.g"; }



     	private SmallJavaDslGrammarAccess grammarAccess;

        public InternalSmallJavaDslParser(TokenStream input, SmallJavaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Namespace";
       	}

       	@Override
       	protected SmallJavaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNamespace"
    // InternalSmallJavaDsl.g:65:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalSmallJavaDsl.g:65:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalSmallJavaDsl.g:66:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalSmallJavaDsl.g:72:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_importDeclaration_2_0= ruleImportDeclaration ) ) ( (lv_smallClazz_3_0= ruleSmallClazz ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_importDeclaration_2_0 = null;

        EObject lv_smallClazz_3_0 = null;



        	enterRule();

        try {
            // InternalSmallJavaDsl.g:78:2: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_importDeclaration_2_0= ruleImportDeclaration ) ) ( (lv_smallClazz_3_0= ruleSmallClazz ) ) ) )
            // InternalSmallJavaDsl.g:79:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_importDeclaration_2_0= ruleImportDeclaration ) ) ( (lv_smallClazz_3_0= ruleSmallClazz ) ) )
            {
            // InternalSmallJavaDsl.g:79:2: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_importDeclaration_2_0= ruleImportDeclaration ) ) ( (lv_smallClazz_3_0= ruleSmallClazz ) ) )
            // InternalSmallJavaDsl.g:80:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifedName ) ) ( (lv_importDeclaration_2_0= ruleImportDeclaration ) ) ( (lv_smallClazz_3_0= ruleSmallClazz ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
            		
            // InternalSmallJavaDsl.g:84:3: ( (lv_name_1_0= ruleQualifedName ) )
            // InternalSmallJavaDsl.g:85:4: (lv_name_1_0= ruleQualifedName )
            {
            // InternalSmallJavaDsl.g:85:4: (lv_name_1_0= ruleQualifedName )
            // InternalSmallJavaDsl.g:86:5: lv_name_1_0= ruleQualifedName
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.QualifedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallJavaDsl.g:103:3: ( (lv_importDeclaration_2_0= ruleImportDeclaration ) )
            // InternalSmallJavaDsl.g:104:4: (lv_importDeclaration_2_0= ruleImportDeclaration )
            {
            // InternalSmallJavaDsl.g:104:4: (lv_importDeclaration_2_0= ruleImportDeclaration )
            // InternalSmallJavaDsl.g:105:5: lv_importDeclaration_2_0= ruleImportDeclaration
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getImportDeclarationImportDeclarationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_importDeclaration_2_0=ruleImportDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					set(
            						current,
            						"importDeclaration",
            						lv_importDeclaration_2_0,
            						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.ImportDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallJavaDsl.g:122:3: ( (lv_smallClazz_3_0= ruleSmallClazz ) )
            // InternalSmallJavaDsl.g:123:4: (lv_smallClazz_3_0= ruleSmallClazz )
            {
            // InternalSmallJavaDsl.g:123:4: (lv_smallClazz_3_0= ruleSmallClazz )
            // InternalSmallJavaDsl.g:124:5: lv_smallClazz_3_0= ruleSmallClazz
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getSmallClazzSmallClazzParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_smallClazz_3_0=ruleSmallClazz();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					set(
            						current,
            						"smallClazz",
            						lv_smallClazz_3_0,
            						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.SmallClazz");
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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalSmallJavaDsl.g:145:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // InternalSmallJavaDsl.g:145:58: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // InternalSmallJavaDsl.g:146:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
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
    // InternalSmallJavaDsl.g:152:1: ruleImportDeclaration returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;



        	enterRule();

        try {
            // InternalSmallJavaDsl.g:158:2: ( ( () ( (lv_imports_1_0= ruleImport ) )* ) )
            // InternalSmallJavaDsl.g:159:2: ( () ( (lv_imports_1_0= ruleImport ) )* )
            {
            // InternalSmallJavaDsl.g:159:2: ( () ( (lv_imports_1_0= ruleImport ) )* )
            // InternalSmallJavaDsl.g:160:3: () ( (lv_imports_1_0= ruleImport ) )*
            {
            // InternalSmallJavaDsl.g:160:3: ()
            // InternalSmallJavaDsl.g:161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0(),
            					current);
            			

            }

            // InternalSmallJavaDsl.g:167:3: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallJavaDsl.g:168:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalSmallJavaDsl.g:168:4: (lv_imports_1_0= ruleImport )
            	    // InternalSmallJavaDsl.g:169:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleImport"
    // InternalSmallJavaDsl.g:190:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSmallJavaDsl.g:190:47: (iv_ruleImport= ruleImport EOF )
            // InternalSmallJavaDsl.g:191:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSmallJavaDsl.g:197:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalSmallJavaDsl.g:203:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) ) )
            // InternalSmallJavaDsl.g:204:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) )
            {
            // InternalSmallJavaDsl.g:204:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) ) )
            // InternalSmallJavaDsl.g:205:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalSmallJavaDsl.g:209:3: ( (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard ) )
            // InternalSmallJavaDsl.g:210:4: (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard )
            {
            // InternalSmallJavaDsl.g:210:4: (lv_importedNamespace_1_0= ruleQualifedNameWithWildcard )
            // InternalSmallJavaDsl.g:211:5: lv_importedNamespace_1_0= ruleQualifedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.QualifedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifedName"
    // InternalSmallJavaDsl.g:232:1: entryRuleQualifedName returns [String current=null] : iv_ruleQualifedName= ruleQualifedName EOF ;
    public final String entryRuleQualifedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedName = null;


        try {
            // InternalSmallJavaDsl.g:232:52: (iv_ruleQualifedName= ruleQualifedName EOF )
            // InternalSmallJavaDsl.g:233:2: iv_ruleQualifedName= ruleQualifedName EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifedName=ruleQualifedName();

            state._fsp--;

             current =iv_ruleQualifedName.getText(); 
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
    // $ANTLR end "entryRuleQualifedName"


    // $ANTLR start "ruleQualifedName"
    // InternalSmallJavaDsl.g:239:1: ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSmallJavaDsl.g:245:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSmallJavaDsl.g:246:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSmallJavaDsl.g:246:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSmallJavaDsl.g:247:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSmallJavaDsl.g:254:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmallJavaDsl.g:255:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleQualifedName"


    // $ANTLR start "entryRuleQualifedNameWithWildcard"
    // InternalSmallJavaDsl.g:272:1: entryRuleQualifedNameWithWildcard returns [String current=null] : iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF ;
    public final String entryRuleQualifedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifedNameWithWildcard = null;


        try {
            // InternalSmallJavaDsl.g:272:64: (iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF )
            // InternalSmallJavaDsl.g:273:2: iv_ruleQualifedNameWithWildcard= ruleQualifedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifedNameWithWildcard=ruleQualifedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifedNameWithWildcard"


    // $ANTLR start "ruleQualifedNameWithWildcard"
    // InternalSmallJavaDsl.g:279:1: ruleQualifedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifedName_0= ruleQualifedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifedName_0 = null;



        	enterRule();

        try {
            // InternalSmallJavaDsl.g:285:2: ( (this_QualifedName_0= ruleQualifedName (kw= '.*' )? ) )
            // InternalSmallJavaDsl.g:286:2: (this_QualifedName_0= ruleQualifedName (kw= '.*' )? )
            {
            // InternalSmallJavaDsl.g:286:2: (this_QualifedName_0= ruleQualifedName (kw= '.*' )? )
            // InternalSmallJavaDsl.g:287:3: this_QualifedName_0= ruleQualifedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_QualifedName_0=ruleQualifedName();

            state._fsp--;


            			current.merge(this_QualifedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSmallJavaDsl.g:297:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallJavaDsl.g:298:4: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifedNameWithWildcard"


    // $ANTLR start "entryRuleSmallClazz"
    // InternalSmallJavaDsl.g:308:1: entryRuleSmallClazz returns [EObject current=null] : iv_ruleSmallClazz= ruleSmallClazz EOF ;
    public final EObject entryRuleSmallClazz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallClazz = null;


        try {
            // InternalSmallJavaDsl.g:308:51: (iv_ruleSmallClazz= ruleSmallClazz EOF )
            // InternalSmallJavaDsl.g:309:2: iv_ruleSmallClazz= ruleSmallClazz EOF
            {
             newCompositeNode(grammarAccess.getSmallClazzRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmallClazz=ruleSmallClazz();

            state._fsp--;

             current =iv_ruleSmallClazz; 
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
    // $ANTLR end "entryRuleSmallClazz"


    // $ANTLR start "ruleSmallClazz"
    // InternalSmallJavaDsl.g:315:1: ruleSmallClazz returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= 'clazz' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) ;
    public final EObject ruleSmallClazz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalSmallJavaDsl.g:321:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= 'clazz' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' ) )
            // InternalSmallJavaDsl.g:322:2: ( ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= 'clazz' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            {
            // InternalSmallJavaDsl.g:322:2: ( ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= 'clazz' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )
            // InternalSmallJavaDsl.g:323:3: ( (lv_visibility_0_0= ruleVisibility ) ) otherlv_1= 'clazz' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}'
            {
            // InternalSmallJavaDsl.g:323:3: ( (lv_visibility_0_0= ruleVisibility ) )
            // InternalSmallJavaDsl.g:324:4: (lv_visibility_0_0= ruleVisibility )
            {
            // InternalSmallJavaDsl.g:324:4: (lv_visibility_0_0= ruleVisibility )
            // InternalSmallJavaDsl.g:325:5: lv_visibility_0_0= ruleVisibility
            {

            					newCompositeNode(grammarAccess.getSmallClazzAccess().getVisibilityVisibilityEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_visibility_0_0=ruleVisibility();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmallClazzRule());
            					}
            					set(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.Visibility");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSmallClazzAccess().getClazzKeyword_1());
            		
            // InternalSmallJavaDsl.g:346:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallJavaDsl.g:347:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallJavaDsl.g:347:4: (lv_name_2_0= RULE_ID )
            // InternalSmallJavaDsl.g:348:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSmallClazzAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmallClazzRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSmallJavaDsl.g:364:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallJavaDsl.g:365:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSmallClazzAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSmallJavaDsl.g:369:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSmallJavaDsl.g:370:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSmallJavaDsl.g:370:5: (otherlv_4= RULE_ID )
                    // InternalSmallJavaDsl.g:371:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSmallClazzRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_4, grammarAccess.getSmallClazzAccess().getSuperClassSmallClazzCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSmallClazzAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallJavaDsl.g:387:3: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=20 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallJavaDsl.g:388:4: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // InternalSmallJavaDsl.g:388:4: (lv_attributes_6_0= ruleAttribute )
            	    // InternalSmallJavaDsl.g:389:5: lv_attributes_6_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getSmallClazzAccess().getAttributesAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSmallClazzRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_6_0,
            	    						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSmallClazzAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSmallClazz"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallJavaDsl.g:414:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallJavaDsl.g:414:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallJavaDsl.g:415:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallJavaDsl.g:421:1: ruleAttribute returns [EObject current=null] : ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_datatype_0_0 = null;



        	enterRule();

        try {
            // InternalSmallJavaDsl.g:427:2: ( ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSmallJavaDsl.g:428:2: ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSmallJavaDsl.g:428:2: ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSmallJavaDsl.g:429:3: ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalSmallJavaDsl.g:429:3: ( (lv_datatype_0_0= ruleDataType ) )
            // InternalSmallJavaDsl.g:430:4: (lv_datatype_0_0= ruleDataType )
            {
            // InternalSmallJavaDsl.g:430:4: (lv_datatype_0_0= ruleDataType )
            // InternalSmallJavaDsl.g:431:5: lv_datatype_0_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_datatype_0_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"datatype",
            						lv_datatype_0_0,
            						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallJavaDsl.g:448:3: ( (lv_array_1_0= '[]' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallJavaDsl.g:449:4: (lv_array_1_0= '[]' )
                    {
                    // InternalSmallJavaDsl.g:449:4: (lv_array_1_0= '[]' )
                    // InternalSmallJavaDsl.g:450:5: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "array", true, "[]");
                    				

                    }


                    }
                    break;

            }

            // InternalSmallJavaDsl.g:462:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallJavaDsl.g:463:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallJavaDsl.g:463:4: (lv_name_2_0= RULE_ID )
            // InternalSmallJavaDsl.g:464:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // InternalSmallJavaDsl.g:484:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalSmallJavaDsl.g:484:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalSmallJavaDsl.g:485:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalSmallJavaDsl.g:491:1: ruleDataType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_ClassType_1 = null;



        	enterRule();

        try {
            // InternalSmallJavaDsl.g:497:2: ( (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType ) )
            // InternalSmallJavaDsl.g:498:2: (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType )
            {
            // InternalSmallJavaDsl.g:498:2: (this_BasicType_0= ruleBasicType | this_ClassType_1= ruleClassType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=24)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallJavaDsl.g:499:3: this_BasicType_0= ruleBasicType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    			current = this_BasicType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallJavaDsl.g:508:3: this_ClassType_1= ruleClassType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassType_1=ruleClassType();

                    state._fsp--;


                    			current = this_ClassType_1;
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleBasicType"
    // InternalSmallJavaDsl.g:520:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalSmallJavaDsl.g:520:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalSmallJavaDsl.g:521:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalSmallJavaDsl.g:527:1: ruleBasicType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_IntegerType_2= ruleIntegerType | this_LongType_3= ruleLongType | this_DoubleType_4= ruleDoubleType ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_IntegerType_2 = null;

        EObject this_LongType_3 = null;

        EObject this_DoubleType_4 = null;



        	enterRule();

        try {
            // InternalSmallJavaDsl.g:533:2: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_IntegerType_2= ruleIntegerType | this_LongType_3= ruleLongType | this_DoubleType_4= ruleDoubleType ) )
            // InternalSmallJavaDsl.g:534:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_IntegerType_2= ruleIntegerType | this_LongType_3= ruleLongType | this_DoubleType_4= ruleDoubleType )
            {
            // InternalSmallJavaDsl.g:534:2: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_IntegerType_2= ruleIntegerType | this_LongType_3= ruleLongType | this_DoubleType_4= ruleDoubleType )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSmallJavaDsl.g:535:3: this_StringType_0= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getBasicTypeAccess().getStringTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_0=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallJavaDsl.g:544:3: this_BooleanType_1= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getBasicTypeAccess().getBooleanTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallJavaDsl.g:553:3: this_IntegerType_2= ruleIntegerType
                    {

                    			newCompositeNode(grammarAccess.getBasicTypeAccess().getIntegerTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerType_2=ruleIntegerType();

                    state._fsp--;


                    			current = this_IntegerType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallJavaDsl.g:562:3: this_LongType_3= ruleLongType
                    {

                    			newCompositeNode(grammarAccess.getBasicTypeAccess().getLongTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LongType_3=ruleLongType();

                    state._fsp--;


                    			current = this_LongType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallJavaDsl.g:571:3: this_DoubleType_4= ruleDoubleType
                    {

                    			newCompositeNode(grammarAccess.getBasicTypeAccess().getDoubleTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleType_4=ruleDoubleType();

                    state._fsp--;


                    			current = this_DoubleType_4;
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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleStringType"
    // InternalSmallJavaDsl.g:583:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalSmallJavaDsl.g:583:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalSmallJavaDsl.g:584:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalSmallJavaDsl.g:590:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallJavaDsl.g:596:2: ( ( () otherlv_1= 'String' ) )
            // InternalSmallJavaDsl.g:597:2: ( () otherlv_1= 'String' )
            {
            // InternalSmallJavaDsl.g:597:2: ( () otherlv_1= 'String' )
            // InternalSmallJavaDsl.g:598:3: () otherlv_1= 'String'
            {
            // InternalSmallJavaDsl.g:598:3: ()
            // InternalSmallJavaDsl.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
            		

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalSmallJavaDsl.g:613:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalSmallJavaDsl.g:613:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalSmallJavaDsl.g:614:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalSmallJavaDsl.g:620:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallJavaDsl.g:626:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalSmallJavaDsl.g:627:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalSmallJavaDsl.g:627:2: ( () otherlv_1= 'Boolean' )
            // InternalSmallJavaDsl.g:628:3: () otherlv_1= 'Boolean'
            {
            // InternalSmallJavaDsl.g:628:3: ()
            // InternalSmallJavaDsl.g:629:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
            		

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalSmallJavaDsl.g:643:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalSmallJavaDsl.g:643:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalSmallJavaDsl.g:644:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalSmallJavaDsl.g:650:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallJavaDsl.g:656:2: ( ( () otherlv_1= 'Integer' ) )
            // InternalSmallJavaDsl.g:657:2: ( () otherlv_1= 'Integer' )
            {
            // InternalSmallJavaDsl.g:657:2: ( () otherlv_1= 'Integer' )
            // InternalSmallJavaDsl.g:658:3: () otherlv_1= 'Integer'
            {
            // InternalSmallJavaDsl.g:658:3: ()
            // InternalSmallJavaDsl.g:659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
            		

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleLongType"
    // InternalSmallJavaDsl.g:673:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // InternalSmallJavaDsl.g:673:49: (iv_ruleLongType= ruleLongType EOF )
            // InternalSmallJavaDsl.g:674:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
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
    // $ANTLR end "entryRuleLongType"


    // $ANTLR start "ruleLongType"
    // InternalSmallJavaDsl.g:680:1: ruleLongType returns [EObject current=null] : ( () otherlv_1= 'Long' ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallJavaDsl.g:686:2: ( ( () otherlv_1= 'Long' ) )
            // InternalSmallJavaDsl.g:687:2: ( () otherlv_1= 'Long' )
            {
            // InternalSmallJavaDsl.g:687:2: ( () otherlv_1= 'Long' )
            // InternalSmallJavaDsl.g:688:3: () otherlv_1= 'Long'
            {
            // InternalSmallJavaDsl.g:688:3: ()
            // InternalSmallJavaDsl.g:689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLongTypeAccess().getLongTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLongTypeAccess().getLongKeyword_1());
            		

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
    // $ANTLR end "ruleLongType"


    // $ANTLR start "entryRuleDoubleType"
    // InternalSmallJavaDsl.g:703:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // InternalSmallJavaDsl.g:703:51: (iv_ruleDoubleType= ruleDoubleType EOF )
            // InternalSmallJavaDsl.g:704:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
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
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // InternalSmallJavaDsl.g:710:1: ruleDoubleType returns [EObject current=null] : ( () otherlv_1= 'Double' ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallJavaDsl.g:716:2: ( ( () otherlv_1= 'Double' ) )
            // InternalSmallJavaDsl.g:717:2: ( () otherlv_1= 'Double' )
            {
            // InternalSmallJavaDsl.g:717:2: ( () otherlv_1= 'Double' )
            // InternalSmallJavaDsl.g:718:3: () otherlv_1= 'Double'
            {
            // InternalSmallJavaDsl.g:718:3: ()
            // InternalSmallJavaDsl.g:719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1());
            		

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
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleClassType"
    // InternalSmallJavaDsl.g:733:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalSmallJavaDsl.g:733:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalSmallJavaDsl.g:734:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalSmallJavaDsl.g:740:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSmallJavaDsl.g:746:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSmallJavaDsl.g:747:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSmallJavaDsl.g:747:2: ( (otherlv_0= RULE_ID ) )
            // InternalSmallJavaDsl.g:748:3: (otherlv_0= RULE_ID )
            {
            // InternalSmallJavaDsl.g:748:3: (otherlv_0= RULE_ID )
            // InternalSmallJavaDsl.g:749:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getClassTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getTypeSmallClazzCrossReference_0());
            			

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "ruleVisibility"
    // InternalSmallJavaDsl.g:763:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmallJavaDsl.g:769:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalSmallJavaDsl.g:770:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalSmallJavaDsl.g:770:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallJavaDsl.g:771:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSmallJavaDsl.g:771:3: (enumLiteral_0= 'public' )
                    // InternalSmallJavaDsl.g:772:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJavaDsl.g:779:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSmallJavaDsl.g:779:3: (enumLiteral_1= 'private' )
                    // InternalSmallJavaDsl.g:780:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleVisibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001F40010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});

}