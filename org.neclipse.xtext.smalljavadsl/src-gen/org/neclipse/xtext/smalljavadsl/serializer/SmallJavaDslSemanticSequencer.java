/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.neclipse.xtext.smalljavadsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.neclipse.xtext.smalljavadsl.services.SmallJavaDslGrammarAccess;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Attribute;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.BooleanType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.ClassType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.DoubleType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Import;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.ImportDeclaration;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.IntegerType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.LongType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Namespace;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallClazz;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.StringType;

@SuppressWarnings("all")
public class SmallJavaDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallJavaDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmallJavaDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmallJavaDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SmallJavaDslPackage.BOOLEAN_TYPE:
				sequence_BooleanType(context, (BooleanType) semanticObject); 
				return; 
			case SmallJavaDslPackage.CLASS_TYPE:
				sequence_ClassType(context, (ClassType) semanticObject); 
				return; 
			case SmallJavaDslPackage.DOUBLE_TYPE:
				sequence_DoubleType(context, (DoubleType) semanticObject); 
				return; 
			case SmallJavaDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case SmallJavaDslPackage.IMPORT_DECLARATION:
				sequence_ImportDeclaration(context, (ImportDeclaration) semanticObject); 
				return; 
			case SmallJavaDslPackage.INTEGER_TYPE:
				sequence_IntegerType(context, (IntegerType) semanticObject); 
				return; 
			case SmallJavaDslPackage.LONG_TYPE:
				sequence_LongType(context, (LongType) semanticObject); 
				return; 
			case SmallJavaDslPackage.NAMESPACE:
				sequence_Namespace(context, (Namespace) semanticObject); 
				return; 
			case SmallJavaDslPackage.SMALL_CLAZZ:
				sequence_SmallClazz(context, (SmallClazz) semanticObject); 
				return; 
			case SmallJavaDslPackage.STRING_TYPE:
				sequence_StringType(context, (StringType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (datatype=DataType array?='[]'? name=ID)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns BooleanType
	 *     BasicType returns BooleanType
	 *     BooleanType returns BooleanType
	 *
	 * Constraint:
	 *     {BooleanType}
	 */
	protected void sequence_BooleanType(ISerializationContext context, BooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns ClassType
	 *     ClassType returns ClassType
	 *
	 * Constraint:
	 *     type=[SmallClazz|ID]
	 */
	protected void sequence_ClassType(ISerializationContext context, ClassType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.CLASS_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.CLASS_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassTypeAccess().getTypeSmallClazzIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns DoubleType
	 *     BasicType returns DoubleType
	 *     DoubleType returns DoubleType
	 *
	 * Constraint:
	 *     {DoubleType}
	 */
	protected void sequence_DoubleType(ISerializationContext context, DoubleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportDeclaration returns ImportDeclaration
	 *
	 * Constraint:
	 *     imports+=Import*
	 */
	protected void sequence_ImportDeclaration(ISerializationContext context, ImportDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns IntegerType
	 *     BasicType returns IntegerType
	 *     IntegerType returns IntegerType
	 *
	 * Constraint:
	 *     {IntegerType}
	 */
	protected void sequence_IntegerType(ISerializationContext context, IntegerType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns LongType
	 *     BasicType returns LongType
	 *     LongType returns LongType
	 *
	 * Constraint:
	 *     {LongType}
	 */
	protected void sequence_LongType(ISerializationContext context, LongType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns Namespace
	 *
	 * Constraint:
	 *     (name=QualifedName importDeclaration=ImportDeclaration smallClazz=SmallClazz)
	 */
	protected void sequence_Namespace(ISerializationContext context, Namespace semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.NAMESPACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.NAMESPACE__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.NAMESPACE__IMPORT_DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.NAMESPACE__IMPORT_DECLARATION));
			if (transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamespaceAccess().getNameQualifedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamespaceAccess().getImportDeclarationImportDeclarationParserRuleCall_2_0(), semanticObject.getImportDeclaration());
		feeder.accept(grammarAccess.getNamespaceAccess().getSmallClazzSmallClazzParserRuleCall_3_0(), semanticObject.getSmallClazz());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SmallClazz returns SmallClazz
	 *
	 * Constraint:
	 *     (visibility=Visibility name=ID superClass=[SmallClazz|ID]? attributes+=Attribute*)
	 */
	protected void sequence_SmallClazz(ISerializationContext context, SmallClazz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns StringType
	 *     BasicType returns StringType
	 *     StringType returns StringType
	 *
	 * Constraint:
	 *     {StringType}
	 */
	protected void sequence_StringType(ISerializationContext context, StringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
