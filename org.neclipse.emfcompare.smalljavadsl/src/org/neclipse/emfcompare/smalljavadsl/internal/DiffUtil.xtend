package org.neclipse.emfcompare.smalljavadsl.internal

import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.DifferenceSource
import org.eclipse.emf.compare.Match
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage

class DiffUtil {

	def static isSmallClazzAdded(Match match, EReference reference, EObject value, DifferenceKind kind,
		DifferenceSource source) {
		reference == SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ && kind == DifferenceKind.ADD &&
			match.left != null && match.right == null
	}

	def static isSmallClazzDeleted(Match match, EReference reference, EObject value, DifferenceKind kind,
		DifferenceSource source) {
		reference == SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ && kind == DifferenceKind.DELETE &&
			match.left == null && match.right != null
	}

	def static isSmallClazzRenamed(Match match, EReference reference, EObject value, DifferenceKind kind,
		DifferenceSource source) {
		reference == SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ && kind == DifferenceKind.ADD &&
			match.left != null && match.right != null
	}

	def static isVisibilityChanged(Match match, EReference reference, EObject value, DifferenceKind kind,
		DifferenceSource source) {
		reference == SmallJavaDslPackage.Literals.SMALL_CLAZZ__VISIBILITY && kind == DifferenceKind.ADD &&
			match.left != null && match.right != null
	}

	def static isAttributeAdded(Match match, EReference reference, EObject value, DifferenceKind kind,
		DifferenceSource source) {
		reference == SmallJavaDslPackage.Literals.SMALL_CLAZZ__ATTRIBUTES && kind == DifferenceKind.ADD
	}

	def static isAttributeDeleted(Match match, EReference reference, EObject value, DifferenceKind kind,
		DifferenceSource source) {
		reference == SmallJavaDslPackage.Literals.SMALL_CLAZZ__ATTRIBUTES && kind == DifferenceKind.DELETE
	}

	def static isDatatypeChanged(Match match, EReference reference, EObject value, DifferenceKind kind,
		DifferenceSource source) {
		reference == SmallJavaDslPackage.Literals.ATTRIBUTE__DATATYPE && kind == DifferenceKind.ADD &&
			match.left != null && match.right != null
	}
}
