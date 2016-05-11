package org.neclipse.emfcompare.smalljavadsl.internal

import org.eclipse.emf.common.util.Monitor
import org.eclipse.emf.compare.Comparison
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.conflict.DefaultConflictDetector
import org.eclipse.emf.compare.diff.DefaultDiffEngine
import org.eclipse.emf.compare.equi.DefaultEquiEngine
import org.eclipse.emf.compare.match.DefaultComparisonFactory
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
import org.eclipse.emf.compare.match.DefaultMatchEngine
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl
import org.eclipse.emf.compare.req.DefaultReqEngine
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Attribute
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.ClassType
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.DataType
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Namespace
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallClazz

class ResourceSetCompare {

	def compare(ResourceSet newResourceSet, ResourceSet oldResourceSet) {
		val comparisonScope = getComparisonScope(newResourceSet, oldResourceSet)
		val configuredEmfComparator = configuredEmfCompareObjectBuilder.build()
		val comparison = configuredEmfComparator.compare(comparisonScope)
		return comparison.getDifferences()
	}

	private def getConfiguredEmfCompareObjectBuilder() {
		return EMFCompare.builder => [
			matchEngineFactoryRegistry = matchEngineFactoryRegistry
			diffEngine = customDiffEngine
			equivalenceEngine = customEquivalenceEngine
			requirementEngine = customRequirementEngine
			conflictDetector = customConflictDetector
		]
	}

	private def getComparisonScope(ResourceSet newResourceSet, ResourceSet oldResourceSet) {
		return new DefaultComparisonScope(newResourceSet, oldResourceSet, null) => [
			resourceSetContentFilter = [it instanceof LazyLinkingResource]
			resourceContentFilter = [
				return switch it {
					Namespace,
					SmallClazz,
					Attribute,
					DataType: true
					default: false
				}
			]
		]
	}

	private def getCustomRequirementEngine() {
		return new DefaultReqEngine() {
			override computeRequirements(Comparison comparison, Monitor monitor) {
				return
			}
		}
	}

	private def getCustomEquivalenceEngine() {
		return new DefaultEquiEngine() {
			override computeEquivalences(Comparison comparison, Monitor monitor) {
				return
			}
		}
	}

	private def getCustomConflictDetector() {
		return new DefaultConflictDetector() {
			override detect(Comparison comparison, Monitor monitor) {
				return
			}
		}
	}

	private def getCustomDiffEngine() {
		return new DefaultDiffEngine(new CustomDiffBuilder()) {
			override protected createFeatureFilter() {
				return new CustomFeatureFilter()
			}
		}
	}

	private def getCustomMatcher() {
		val matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE)
		return new IdentifierEObjectMatcher(matcher, [
			val FALL_BACK_TO_OTHER_MATCHERS = null
			return switch it {
				SmallClazz: {
					val namespace = eContainer as Namespace
					'''«namespace.name».«name»'''
				}
				ClassType: {
					'''«type.name»'''
				}
				default:
					FALL_BACK_TO_OTHER_MATCHERS
			}
		]);
	}

	private def getMatchEngineFactoryRegistry() {
		val matchEngineFactory = new MatchEngineFactoryImpl(customMatcher, comparisonFactory)
		matchEngineFactory.setRanking(20)

		val matchEngineRegistry = new MatchEngineFactoryRegistryImpl()
		matchEngineRegistry.add(matchEngineFactory)

		return matchEngineRegistry
	}

	private def getComparisonFactory() {
		return new DefaultComparisonFactory(new DefaultEqualityHelperFactory())
	}
}
