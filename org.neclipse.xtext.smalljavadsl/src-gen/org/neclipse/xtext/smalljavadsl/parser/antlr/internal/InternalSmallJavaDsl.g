/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
grammar InternalSmallJavaDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.neclipse.xtext.smalljavadsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleNamespace
entryRuleNamespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamespaceRule()); }
	iv_ruleNamespace=ruleNamespace
	{ $current=$iv_ruleNamespace.current; }
	EOF;

// Rule Namespace
ruleNamespace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='namespace'
		{
			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.QualifedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getImportDeclarationImportDeclarationParserRuleCall_2_0());
				}
				lv_importDeclaration_2_0=ruleImportDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"importDeclaration",
						lv_importDeclaration_2_0,
						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.ImportDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getSmallClazzSmallClazzParserRuleCall_3_0());
				}
				lv_smallClazz_3_0=ruleSmallClazz
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"smallClazz",
						lv_smallClazz_3_0,
						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.SmallClazz");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleImportDeclaration
entryRuleImportDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportDeclarationRule()); }
	iv_ruleImportDeclaration=ruleImportDeclaration
	{ $current=$iv_ruleImportDeclaration.current; }
	EOF;

// Rule ImportDeclaration
ruleImportDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0());
				}
				lv_imports_1_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
					}
					add(
						$current,
						"imports",
						lv_imports_1_0,
						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifedNameWithWildcard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.QualifedNameWithWildcard");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifedName
entryRuleQualifedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifedNameRule()); }
	iv_ruleQualifedName=ruleQualifedName
	{ $current=$iv_ruleQualifedName.current.getText(); }
	EOF;

// Rule QualifedName
ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleQualifedNameWithWildcard
entryRuleQualifedNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifedNameWithWildcardRule()); }
	iv_ruleQualifedNameWithWildcard=ruleQualifedNameWithWildcard
	{ $current=$iv_ruleQualifedNameWithWildcard.current.getText(); }
	EOF;

// Rule QualifedNameWithWildcard
ruleQualifedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0());
		}
		this_QualifedName_0=ruleQualifedName
		{
			$current.merge(this_QualifedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleSmallClazz
entryRuleSmallClazz returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSmallClazzRule()); }
	iv_ruleSmallClazz=ruleSmallClazz
	{ $current=$iv_ruleSmallClazz.current; }
	EOF;

// Rule SmallClazz
ruleSmallClazz returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSmallClazzAccess().getVisibilityVisibilityEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibility
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSmallClazzRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.Visibility");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='clazz'
		{
			newLeafNode(otherlv_1, grammarAccess.getSmallClazzAccess().getClazzKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSmallClazzAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSmallClazzRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='extends'
			{
				newLeafNode(otherlv_3, grammarAccess.getSmallClazzAccess().getExtendsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSmallClazzRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getSmallClazzAccess().getSuperClassSmallClazzCrossReference_3_1_0());
					}
				)
			)
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getSmallClazzAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSmallClazzAccess().getAttributesAttributeParserRuleCall_5_0());
				}
				lv_attributes_6_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSmallClazzRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_6_0,
						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getSmallClazzAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0());
				}
				lv_datatype_0_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"datatype",
						lv_datatype_0_0,
						"org.neclipse.xtext.smalljavadsl.SmallJavaDsl.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_array_1_0='[]'
				{
					newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed($current, "array", true, "[]");
				}
			)
		)?
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0());
		}
		this_BasicType_0=ruleBasicType
		{
			$current = $this_BasicType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1());
		}
		this_ClassType_1=ruleClassType
		{
			$current = $this_ClassType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBasicType
entryRuleBasicType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBasicTypeRule()); }
	iv_ruleBasicType=ruleBasicType
	{ $current=$iv_ruleBasicType.current; }
	EOF;

// Rule BasicType
ruleBasicType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBasicTypeAccess().getStringTypeParserRuleCall_0());
		}
		this_StringType_0=ruleStringType
		{
			$current = $this_StringType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBasicTypeAccess().getBooleanTypeParserRuleCall_1());
		}
		this_BooleanType_1=ruleBooleanType
		{
			$current = $this_BooleanType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBasicTypeAccess().getIntegerTypeParserRuleCall_2());
		}
		this_IntegerType_2=ruleIntegerType
		{
			$current = $this_IntegerType_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBasicTypeAccess().getLongTypeParserRuleCall_3());
		}
		this_LongType_3=ruleLongType
		{
			$current = $this_LongType_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBasicTypeAccess().getDoubleTypeParserRuleCall_4());
		}
		this_DoubleType_4=ruleDoubleType
		{
			$current = $this_DoubleType_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStringType
entryRuleStringType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringTypeRule()); }
	iv_ruleStringType=ruleStringType
	{ $current=$iv_ruleStringType.current; }
	EOF;

// Rule StringType
ruleStringType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
					$current);
			}
		)
		otherlv_1='String'
		{
			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
		}
	)
;

// Entry rule entryRuleBooleanType
entryRuleBooleanType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanTypeRule()); }
	iv_ruleBooleanType=ruleBooleanType
	{ $current=$iv_ruleBooleanType.current; }
	EOF;

// Rule BooleanType
ruleBooleanType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
					$current);
			}
		)
		otherlv_1='Boolean'
		{
			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
		}
	)
;

// Entry rule entryRuleIntegerType
entryRuleIntegerType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerTypeRule()); }
	iv_ruleIntegerType=ruleIntegerType
	{ $current=$iv_ruleIntegerType.current; }
	EOF;

// Rule IntegerType
ruleIntegerType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
					$current);
			}
		)
		otherlv_1='Integer'
		{
			newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
		}
	)
;

// Entry rule entryRuleLongType
entryRuleLongType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLongTypeRule()); }
	iv_ruleLongType=ruleLongType
	{ $current=$iv_ruleLongType.current; }
	EOF;

// Rule LongType
ruleLongType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLongTypeAccess().getLongTypeAction_0(),
					$current);
			}
		)
		otherlv_1='Long'
		{
			newLeafNode(otherlv_1, grammarAccess.getLongTypeAccess().getLongKeyword_1());
		}
	)
;

// Entry rule entryRuleDoubleType
entryRuleDoubleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDoubleTypeRule()); }
	iv_ruleDoubleType=ruleDoubleType
	{ $current=$iv_ruleDoubleType.current; }
	EOF;

// Rule DoubleType
ruleDoubleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
					$current);
			}
		)
		otherlv_1='Double'
		{
			newLeafNode(otherlv_1, grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1());
		}
	)
;

// Entry rule entryRuleClassType
entryRuleClassType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassTypeRule()); }
	iv_ruleClassType=ruleClassType
	{ $current=$iv_ruleClassType.current; }
	EOF;

// Rule ClassType
ruleClassType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getClassTypeRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getTypeSmallClazzCrossReference_0());
			}
		)
	)
;

// Rule Visibility
ruleVisibility returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='public'
			{
				$current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='private'
			{
				$current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
