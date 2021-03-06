/*
 * generated by Xtext
 */
package org.sireum.aadl.osate.acl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ArrayRange;
import org.osate.aadl2.BasicPropertyAssociation;
import org.osate.aadl2.BooleanLiteral;
import org.osate.aadl2.ClassifierValue;
import org.osate.aadl2.ComputedValue;
import org.osate.aadl2.ContainedNamedElement;
import org.osate.aadl2.ContainmentPathElement;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.NamedValue;
import org.osate.aadl2.Operation;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.RangeValue;
import org.osate.aadl2.RealLiteral;
import org.osate.aadl2.RecordValue;
import org.osate.aadl2.ReferenceValue;
import org.osate.aadl2.StringLiteral;
import org.osate.xtext.aadl2.properties.serializer.PropertiesSemanticSequencer;
import org.sireum.aadl.osate.acl.aCL.ACLPackage;
import org.sireum.aadl.osate.acl.aCL.AclContract;
import org.sireum.aadl.osate.acl.aCL.AclSubclause;
import org.sireum.aadl.osate.acl.aCL.AssumeStatement;
import org.sireum.aadl.osate.acl.aCL.BinaryExpr;
import org.sireum.aadl.osate.acl.aCL.Contract;
import org.sireum.aadl.osate.acl.aCL.Flow;
import org.sireum.aadl.osate.acl.aCL.Flows;
import org.sireum.aadl.osate.acl.aCL.GuaranteeStatement;
import org.sireum.aadl.osate.acl.aCL.HyperperiodComputationalModel;
import org.sireum.aadl.osate.acl.aCL.IdExpr;
import org.sireum.aadl.osate.acl.aCL.PeriodicComputationalModel;
import org.sireum.aadl.osate.acl.aCL.UnaryExpr;
import org.sireum.aadl.osate.acl.services.ACLGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractACLSemanticSequencer extends PropertiesSemanticSequencer {

	@Inject
	private ACLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ACLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ACLPackage.ACL_CONTRACT:
				sequence_AclContract(context, (AclContract) semanticObject); 
				return; 
			case ACLPackage.ACL_SUBCLAUSE:
				sequence_AclSubclause(context, (AclSubclause) semanticObject); 
				return; 
			case ACLPackage.ASSUME_STATEMENT:
				sequence_SpecStatement(context, (AssumeStatement) semanticObject); 
				return; 
			case ACLPackage.BINARY_EXPR:
				if (rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getImpliesExprRule()) {
					sequence_AndExpr_ExpExpr_ImpliesExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0()
						|| rule == grammarAccess.getOrExprRule()
						|| action == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AndExpr_ExpExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAndExprRule()
						|| action == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AndExpr_ExpExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpExprRule()
						|| action == grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_ExpExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRelationalExprRule()) {
					sequence_ExpExpr_PlusExpr_RelationalExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getRelationalExprAccess().getBinaryExprLeftAction_1_0_0_0()
						|| rule == grammarAccess.getPlusExprRule()
						|| action == grammarAccess.getPlusExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_ExpExpr_PlusExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTimesExprRule()
						|| action == grammarAccess.getTimesExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_ExpExpr_TimesExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else break;
			case ACLPackage.CONTRACT:
				sequence_Contract(context, (Contract) semanticObject); 
				return; 
			case ACLPackage.FLOW:
				sequence_Flow(context, (Flow) semanticObject); 
				return; 
			case ACLPackage.FLOWS:
				sequence_Flows(context, (Flows) semanticObject); 
				return; 
			case ACLPackage.GUARANTEE_STATEMENT:
				sequence_SpecStatement(context, (GuaranteeStatement) semanticObject); 
				return; 
			case ACLPackage.HYPERPERIOD_COMPUTATIONAL_MODEL:
				sequence_ComputationalModel(context, (HyperperiodComputationalModel) semanticObject); 
				return; 
			case ACLPackage.ID_EXPR:
				sequence_AtomicExpr(context, (IdExpr) semanticObject); 
				return; 
			case ACLPackage.PERIODIC_COMPUTATIONAL_MODEL:
				sequence_ComputationalModel(context, (PeriodicComputationalModel) semanticObject); 
				return; 
			case ACLPackage.UNARY_EXPR:
				sequence_PrefixExpr(context, (UnaryExpr) semanticObject); 
				return; 
			}
		else if (epackage == Aadl2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Aadl2Package.ARRAY_RANGE:
				sequence_ArrayRange(context, (ArrayRange) semanticObject); 
				return; 
			case Aadl2Package.BASIC_PROPERTY_ASSOCIATION:
				sequence_FieldPropertyAssociation(context, (BasicPropertyAssociation) semanticObject); 
				return; 
			case Aadl2Package.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case Aadl2Package.CLASSIFIER_VALUE:
				sequence_ComponentClassifierTerm(context, (ClassifierValue) semanticObject); 
				return; 
			case Aadl2Package.COMPUTED_VALUE:
				sequence_ComputedTerm(context, (ComputedValue) semanticObject); 
				return; 
			case Aadl2Package.CONTAINED_NAMED_ELEMENT:
				sequence_ContainmentPath(context, (ContainedNamedElement) semanticObject); 
				return; 
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT:
				sequence_ContainmentPathElement(context, (ContainmentPathElement) semanticObject); 
				return; 
			case Aadl2Package.INTEGER_LITERAL:
				sequence_IntegerTerm(context, (IntegerLiteral) semanticObject); 
				return; 
			case Aadl2Package.LIST_VALUE:
				sequence_ListTerm(context, (ListValue) semanticObject); 
				return; 
			case Aadl2Package.MODAL_PROPERTY_VALUE:
				if (rule == grammarAccess.getModalPropertyValueRule()) {
					sequence_ModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOptionalModalPropertyValueRule()) {
					sequence_OptionalModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyValueRule()) {
					sequence_PropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.NAMED_VALUE:
				if (rule == grammarAccess.getConstantValueRule()
						|| rule == grammarAccess.getNumAltRule()) {
					sequence_ConstantValue(context, (NamedValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyExpressionRule()
						|| rule == grammarAccess.getLiteralorReferenceTermRule()) {
					sequence_LiteralorReferenceTerm(context, (NamedValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.OPERATION:
				sequence_SignedConstant(context, (Operation) semanticObject); 
				return; 
			case Aadl2Package.PROPERTY_ASSOCIATION:
				if (rule == grammarAccess.getBasicPropertyAssociationRule()) {
					sequence_BasicPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPModelRule()
						|| rule == grammarAccess.getContainedPropertyAssociationRule()) {
					sequence_ContainedPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyAssociationRule()) {
					sequence_PropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.RANGE_VALUE:
				sequence_NumericRangeTerm(context, (RangeValue) semanticObject); 
				return; 
			case Aadl2Package.REAL_LITERAL:
				sequence_RealTerm(context, (RealLiteral) semanticObject); 
				return; 
			case Aadl2Package.RECORD_VALUE:
				if (rule == grammarAccess.getOldRecordTermRule()) {
					sequence_OldRecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyExpressionRule()
						|| rule == grammarAccess.getRecordTermRule()) {
					sequence_RecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.REFERENCE_VALUE:
				sequence_ReferenceTerm(context, (ReferenceValue) semanticObject); 
				return; 
			case Aadl2Package.STRING_LITERAL:
				sequence_StringTerm(context, (StringLiteral) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AclContract returns AclContract
	 *
	 * Constraint:
	 *     specs+=SpecSection*
	 */
	protected void sequence_AclContract(ISerializationContext context, AclContract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AnnexSubclause returns AclSubclause
	 *     AclSubclause returns AclSubclause
	 *
	 * Constraint:
	 *     contract=AclContract
	 */
	protected void sequence_AclSubclause(ISerializationContext context, AclSubclause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ACLPackage.Literals.ACL_SUBCLAUSE__CONTRACT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ACLPackage.Literals.ACL_SUBCLAUSE__CONTRACT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAclSubclauseAccess().getContractAclContractParserRuleCall_1_0(), semanticObject.getContract());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns BinaryExpr
	 *     ImpliesExpr returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=ImpliesExpr_BinaryExpr_1_0_0_0 right=ImpliesExpr) | 
	 *         (left=OrExpr_BinaryExpr_1_0_0_0 (op='or' | op='orelse') right=AndExpr) | 
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 (op='and' | op='andthen') right=RelationalExpr) | 
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=PlusExpr) | 
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ExpExpr_ImpliesExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     OrExpr returns BinaryExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=OrExpr_BinaryExpr_1_0_0_0 (op='or' | op='orelse') right=AndExpr) | 
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 (op='and' | op='andthen') right=RelationalExpr) | 
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=PlusExpr) | 
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ExpExpr_OrExpr_PlusExpr_RelationalExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns BinaryExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 (op='and' | op='andthen') right=RelationalExpr) | 
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=PlusExpr) | 
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ExpExpr_PlusExpr_RelationalExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns IdExpr
	 *     ImpliesExpr returns IdExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     OrExpr returns IdExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     AndExpr returns IdExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     RelationalExpr returns IdExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     PlusExpr returns IdExpr
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     TimesExpr returns IdExpr
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     ExpExpr returns IdExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns IdExpr
	 *     PrefixExpr returns IdExpr
	 *     AtomicExpr returns IdExpr
	 *
	 * Constraint:
	 *     id=[NamedElement|QCREF]
	 */
	protected void sequence_AtomicExpr(ISerializationContext context, IdExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ACLPackage.Literals.ID_EXPR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ACLPackage.Literals.ID_EXPR__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExprAccess().getIdNamedElementQCREFParserRuleCall_1_0_1(), semanticObject.eGet(ACLPackage.Literals.ID_EXPR__ID, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns HyperperiodComputationalModel
	 *     ComputationalModel returns HyperperiodComputationalModel
	 *
	 * Constraint:
	 *     (constraints+=[NamedElement|ID] constraints+=[NamedElement|ID]*)
	 */
	protected void sequence_ComputationalModel(ISerializationContext context, HyperperiodComputationalModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns PeriodicComputationalModel
	 *     ComputationalModel returns PeriodicComputationalModel
	 *
	 * Constraint:
	 *     {PeriodicComputationalModel}
	 */
	protected void sequence_ComputationalModel(ISerializationContext context, PeriodicComputationalModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns Contract
	 *     Contract returns Contract
	 *
	 * Constraint:
	 *     specs+=SpecStatement+
	 */
	protected void sequence_Contract(ISerializationContext context, Contract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpExpr returns BinaryExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 */
	protected void sequence_ExpExpr(ISerializationContext context, BinaryExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ACLPackage.Literals.BINARY_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ACLPackage.Literals.BINARY_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, ACLPackage.Literals.BINARY_EXPR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ACLPackage.Literals.BINARY_EXPR__OP));
			if (transientValues.isValueTransient(semanticObject, ACLPackage.Literals.BINARY_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ACLPackage.Literals.BINARY_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpExprAccess().getBinaryExprLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpExprAccess().getOpCircumflexAccentKeyword_1_0_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExpExprAccess().getRightPrefixExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RelationalExpr returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=PlusExpr) | 
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_ExpExpr_PlusExpr_RelationalExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *     PlusExpr returns BinaryExpr
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     (
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=TimesExpr) | 
	 *         (left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | 
	 *         (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr)
	 *     )
	 */
	protected void sequence_ExpExpr_PlusExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimesExpr returns BinaryExpr
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns BinaryExpr
	 *
	 * Constraint:
	 *     ((left=TimesExpr_BinaryExpr_1_0_0_0 (op='*' | op='/' | op='%') right=ExpExpr) | (left=ExpExpr_BinaryExpr_1_0_0_0 op='^' right=PrefixExpr))
	 */
	protected void sequence_ExpExpr_TimesExpr(ISerializationContext context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Flow returns Flow
	 *
	 * Constraint:
	 *     (flowId=ID srcPorts+=[NamedElement|ID] srcPorts+=[NamedElement|ID]* dstPorts+=[NamedElement|ID] dstPorts+=[NamedElement|ID]*)
	 */
	protected void sequence_Flow(ISerializationContext context, Flow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecSection returns Flows
	 *     Flows returns Flows
	 *
	 * Constraint:
	 *     flows+=Flow+
	 */
	protected void sequence_Flows(ISerializationContext context, Flows semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns UnaryExpr
	 *     ImpliesExpr returns UnaryExpr
	 *     ImpliesExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     OrExpr returns UnaryExpr
	 *     OrExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     AndExpr returns UnaryExpr
	 *     AndExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     RelationalExpr returns UnaryExpr
	 *     RelationalExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     PlusExpr returns UnaryExpr
	 *     PlusExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     TimesExpr returns UnaryExpr
	 *     TimesExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     ExpExpr returns UnaryExpr
	 *     ExpExpr.BinaryExpr_1_0_0_0 returns UnaryExpr
	 *     PrefixExpr returns UnaryExpr
	 *
	 * Constraint:
	 *     ((op='-' | op='not') expr=PrefixExpr)
	 */
	protected void sequence_PrefixExpr(ISerializationContext context, UnaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecStatement returns AssumeStatement
	 *
	 * Constraint:
	 *     (forPort=[NamedElement|ID]? assumeTitle=STRING pred=PREDICATE tracesTo=ID?)
	 */
	protected void sequence_SpecStatement(ISerializationContext context, AssumeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecStatement returns GuaranteeStatement
	 *
	 * Constraint:
	 *     (guaranteeTitle=STRING expr=Expr)
	 */
	protected void sequence_SpecStatement(ISerializationContext context, GuaranteeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ACLPackage.Literals.GUARANTEE_STATEMENT__GUARANTEE_TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ACLPackage.Literals.GUARANTEE_STATEMENT__GUARANTEE_TITLE));
			if (transientValues.isValueTransient(semanticObject, ACLPackage.Literals.GUARANTEE_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ACLPackage.Literals.GUARANTEE_STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSpecStatementAccess().getGuaranteeTitleSTRINGTerminalRuleCall_1_2_0(), semanticObject.getGuaranteeTitle());
		feeder.accept(grammarAccess.getSpecStatementAccess().getExprExprParserRuleCall_1_4_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
}
