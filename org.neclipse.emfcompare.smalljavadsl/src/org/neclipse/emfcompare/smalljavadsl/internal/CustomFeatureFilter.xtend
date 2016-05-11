package org.neclipse.emfcompare.smalljavadsl.internal

import org.eclipse.emf.compare.diff.FeatureFilter
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.compare.Match
import org.eclipse.emf.ecore.EReference
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage

class CustomFeatureFilter extends FeatureFilter {

	override checkForOrderingChanges(EStructuralFeature feature) {
		false
	}

	override protected isIgnoredAttribute(EAttribute attribute) {
		val IGNORE_ATTRIBUTE = true
		return switch attribute {
			case SmallJavaDslPackage.Literals.NAMESPACE__NAME,
			case SmallJavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE: IGNORE_ATTRIBUTE
			default: super.isIgnoredAttribute(attribute)
		}
	}

	override protected isIgnoredReference(Match match, EReference reference) {
		val IGNORE_REFERENCE = true
		if (reference == SmallJavaDslPackage.Literals.NAMESPACE__IMPORT_DECLARATION) {
			return IGNORE_REFERENCE
		}
		super.isIgnoredReference(match, reference)
	}

}
