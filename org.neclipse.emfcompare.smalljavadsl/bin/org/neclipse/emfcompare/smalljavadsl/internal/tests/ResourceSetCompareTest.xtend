package org.neclipse.emfcompare.smalljavadsl.internal.tests

import com.google.inject.Inject
import com.google.inject.Provider
import java.util.List
import org.eclipse.emf.compare.AttributeChange
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith
import org.neclipse.emfcompare.smalljavadsl.internal.ResourceSetCompare
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.ClassType
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Namespace
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage
import org.neclipse.xtext.smalljavadsl.tests.SmallJavaDslInjectorProvider

import static org.junit.Assert.*

import static extension org.eclipse.emf.compare.utils.MatchUtil.*
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.BasicType
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallClazz
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Visibility

@RunWith(XtextRunner)
@InjectWith(SmallJavaDslInjectorProvider)
class ResourceSetCompareTest {

	@Inject Provider<XtextResourceSet> resourceSetProvider

	@Inject private extension ParseHelper<Namespace>

	@Test
	def void testAdditionOfSmallClazzes() {
		val oldRs = resourceSetProvider.get

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
			}
		'''.parse(newRs)
		'''
			namespace test.models
			private clazz Bar {
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(2, differences.size)
		assertTrue(differences.forall[it instanceof ReferenceChange])
		assertTrue(differences.forall[it.getStructuralFeature() == SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ])
		assertTrue(differences.forall[it.kind == DifferenceKind.ADD])
	}

	@Test
	def void testDeletionOfSmallClazzes() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
			}
		'''.parse(oldRs)
		'''
			namespace test.models
			private clazz Bar {
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(2, differences.size)
		assertTrue(differences.forall[it instanceof ReferenceChange])
		assertTrue(differences.forall[it.getStructuralFeature() == SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ])
		assertTrue(differences.forall[it.kind == DifferenceKind.DELETE])
	}

	@Test
	def void testSmallClazzRename() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Bar {
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(1, differences.size)
		assertTrue(differences.forall[it instanceof ReferenceChange])
		assertTrue(differences.forall[it.getStructuralFeature() == SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ])
		assertTrue(differences.forall[it.kind == DifferenceKind.CHANGE])
		assertTrue(differences.forall[it.value instanceof SmallClazz])
	}

	@Test
	def void testSmallClazzVisibilityChange() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			public clazz Foo {
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(1, differences.size)

		val difference = differences.head
		assertTrue(difference instanceof AttributeChange)

		val attributeChange = difference as AttributeChange
		assertTrue(attributeChange.attribute == SmallJavaDslPackage.Literals.SMALL_CLAZZ__VISIBILITY)
		assertTrue(difference.kind == DifferenceKind.CHANGE)
		assertTrue(difference.value == Visibility.PUBLIC)
	}

	@Test
	def void testChangeAttributeTypeToAnArray() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String names
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String[] names
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(1, differences.size)
		assertTrue(differences.head instanceof AttributeChange)

		val attributeChange = differences.head as AttributeChange
		assertTrue(attributeChange.attribute == SmallJavaDslPackage.Literals.ATTRIBUTE__ARRAY)
		assertTrue(attributeChange.kind == DifferenceKind.CHANGE)
		assertTrue(attributeChange.value == Boolean.TRUE)
	}

	@Test
	def void testAttributeRename() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String name
				String address
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String newName
				String newAddress
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(2, differences.size)
		assertTrue(differences.forall[it instanceof AttributeChange])
		assertListEquals(#["newName", "newAddress"], differences.map[value as String])
	}

	@Test
	def void testAttributesAddedToSmallClazz() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String newName
				String newAddress
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(2, differences.size)
		assertTrue(differences.forall[it instanceof ReferenceChange])
		assertTrue(differences.
			forall[it.getStructuralFeature() == SmallJavaDslPackage.Literals.SMALL_CLAZZ__ATTRIBUTES])
		assertTrue(differences.forall[it.kind == DifferenceKind.ADD])
	}

	@Test
	def void testAttributesDeletedFromSmallClazz() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String newName
				String newAddress				
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(2, differences.size)
		assertTrue(differences.forall[it instanceof ReferenceChange])
		assertTrue(differences.
			forall[it.getStructuralFeature() == SmallJavaDslPackage.Literals.SMALL_CLAZZ__ATTRIBUTES])
		assertTrue(differences.forall[it.kind == DifferenceKind.DELETE])
	}

	@Test
	def void testAttributeDatatypeChangedFromBasicTypeToBasicType() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String attribute
				String attribute02
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				Integer attribute
				Integer attribute02
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(2, differences.size)
		assertTrue(differences.forall[it instanceof ReferenceChange])
		assertTrue(differences.forall[it.getStructuralFeature() == SmallJavaDslPackage.Literals.ATTRIBUTE__DATATYPE])
		assertTrue(differences.forall[it.kind == DifferenceKind.CHANGE])
		assertTrue(differences.forall[it.value instanceof BasicType])
	}

	@Test
	def void testAttributeDatatypeChangedFromBasicTypeToClazzType() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String attribute
				String attribute02
			}
		'''.parse(oldRs)
		'''
			namespace test.models
			private clazz Bar {
				String attribute
				String attribute02
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String attribute
				String attribute02
			}
		'''.parse(newRs)
		'''
			namespace test.models
			import test.models.*
			private clazz Bar {
				Foo attribute
				Foo attribute02
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(2, differences.size)
		assertTrue(differences.forall[it instanceof ReferenceChange])
		assertTrue(differences.forall[it.getStructuralFeature() == SmallJavaDslPackage.Literals.ATTRIBUTE__DATATYPE])
		assertTrue(differences.forall[it.kind == DifferenceKind.CHANGE])
		assertTrue(differences.forall[it.value instanceof ClassType])
	}

	@Test
	def void testAttributeDatatypeChangedFromClazzTypeToClazzType() {
		val oldRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String attribute
				String attribute02
			}
		'''.parse(oldRs)
		'''
			namespace test.models
			import test.models.*
			private clazz Bar {
				Foo attribute
				Foo attribute02
			}
		'''.parse(oldRs)

		val newRs = resourceSetProvider.get
		'''
			namespace test.models
			private clazz Foo {
				String attribute
				String attribute02
			}
		'''.parse(newRs)
		'''
			namespace test.models
			private clazz Bar {
				Bar attribute
				Bar attribute02
			}
		'''.parse(newRs)

		val differences = new ResourceSetCompare().compare(newRs, oldRs)
		assertEquals(2, differences.size)
		assertTrue(differences.forall[it instanceof ReferenceChange])
		assertTrue(differences.forall[it.getStructuralFeature() == SmallJavaDslPackage.Literals.ATTRIBUTE__DATATYPE])
		assertTrue(differences.forall[it.kind == DifferenceKind.CHANGE])
		assertTrue(differences.forall[it.value instanceof ClassType])
	}

	private def assertListEquals(List<String> expected, List<String> actual) {
		assertEquals(expected.sort, actual.sort)
	}

}
