package org.neclipse.emfcompare.smalljavadsl.internal

import org.eclipse.emf.compare.CompareFactory
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.DifferenceSource
import org.eclipse.emf.compare.Match
import org.eclipse.emf.compare.MatchResource
import org.eclipse.emf.compare.diff.DiffBuilder
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference

import static org.neclipse.emfcompare.smalljavadsl.internal.DiffUtil.*

class CustomDiffBuilder extends DiffBuilder {

	override attributeChange(Match match, EAttribute attribute, Object value, DifferenceKind kind,
		DifferenceSource source) {
		super.attributeChange(match, attribute, value, kind, source)
	}

	override referenceChange(Match match, EReference reference, EObject value, DifferenceKind kind,
		DifferenceSource source) {
		if (isSmallClazzAdded(match, reference, value, kind, source) ||
			isSmallClazzDeleted(match, reference, value, kind, source)) {
			super.referenceChange(match, reference, value, kind, source)
		} else if (isSmallClazzRenamed(match, reference, value, kind, source)) {
			val referenceChange = CompareFactory.eINSTANCE.createReferenceChange();
			referenceChange.setMatch(match);
			referenceChange.setReference(reference);
			referenceChange.setValue(value);
			referenceChange.setKind(DifferenceKind.CHANGE); // Changed from ADD to CHANGE for convenience
			referenceChange.setSource(source);
		} else if (isAttributeAdded(match, reference, value, kind, source) ||
			isAttributeDeleted(match, reference, value, kind, source)) {
			super.referenceChange(match, reference, value, kind, source)
		} else if (isDatatypeChanged(match, reference, value, kind, source)) {
			val referenceChange = CompareFactory.eINSTANCE.createReferenceChange();
			referenceChange.setMatch(match);
			referenceChange.setReference(reference);
			referenceChange.setValue(value);
			referenceChange.setKind(DifferenceKind.CHANGE); // Changed from ADD to CHANGE for convenience
			referenceChange.setSource(source);
		}

		//super.referenceChange(match, reference, value, kind, source)
	}

	override resourceAttachmentChange(Match match, String uri, DifferenceKind kind, DifferenceSource source) {
		return
	}

	override resourceLocationChange(MatchResource matchResource, String baseLocation, String changedLocation,
		DifferenceKind kind, DifferenceSource source) {
		return
	}

	override featureMapChange(Match match, EAttribute attribute, Object value, DifferenceKind kind,
		DifferenceSource source) {
		return
	}

}
