package org.neclipse.emfcompare.smalljavadsl.internal;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.conflict.DefaultConflictDetector;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.equi.DefaultEquiEngine;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.req.DefaultReqEngine;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.neclipse.emfcompare.smalljavadsl.internal.CustomDiffBuilder;
import org.neclipse.emfcompare.smalljavadsl.internal.CustomFeatureFilter;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Attribute;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.ClassType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.DataType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Namespace;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallClazz;

@SuppressWarnings("all")
public class ResourceSetCompare {
  public EList<Diff> compare(final ResourceSet newResourceSet, final ResourceSet oldResourceSet) {
    final DefaultComparisonScope comparisonScope = this.getComparisonScope(newResourceSet, oldResourceSet);
    EMFCompare.Builder _configuredEmfCompareObjectBuilder = this.getConfiguredEmfCompareObjectBuilder();
    final EMFCompare configuredEmfComparator = _configuredEmfCompareObjectBuilder.build();
    final Comparison comparison = configuredEmfComparator.compare(comparisonScope);
    return comparison.getDifferences();
  }
  
  private EMFCompare.Builder getConfiguredEmfCompareObjectBuilder() {
    EMFCompare.Builder _builder = EMFCompare.builder();
    final Procedure1<EMFCompare.Builder> _function = (EMFCompare.Builder it) -> {
      MatchEngineFactoryRegistryImpl _matchEngineFactoryRegistry = this.getMatchEngineFactoryRegistry();
      it.setMatchEngineFactoryRegistry(_matchEngineFactoryRegistry);
      DefaultDiffEngine _customDiffEngine = this.getCustomDiffEngine();
      it.setDiffEngine(_customDiffEngine);
      DefaultEquiEngine _customEquivalenceEngine = this.getCustomEquivalenceEngine();
      it.setEquivalenceEngine(_customEquivalenceEngine);
      DefaultReqEngine _customRequirementEngine = this.getCustomRequirementEngine();
      it.setRequirementEngine(_customRequirementEngine);
      DefaultConflictDetector _customConflictDetector = this.getCustomConflictDetector();
      it.setConflictDetector(_customConflictDetector);
    };
    return ObjectExtensions.<EMFCompare.Builder>operator_doubleArrow(_builder, _function);
  }
  
  private DefaultComparisonScope getComparisonScope(final ResourceSet newResourceSet, final ResourceSet oldResourceSet) {
    DefaultComparisonScope _defaultComparisonScope = new DefaultComparisonScope(newResourceSet, oldResourceSet, null);
    final Procedure1<DefaultComparisonScope> _function = (DefaultComparisonScope it) -> {
      final Predicate<Resource> _function_1 = (Resource it_1) -> {
        return (it_1 instanceof LazyLinkingResource);
      };
      it.setResourceSetContentFilter(_function_1);
      final Predicate<EObject> _function_2 = (EObject it_1) -> {
        boolean _switchResult = false;
        boolean _matched = false;
        if (it_1 instanceof Namespace) {
          _matched=true;
        }
        if (!_matched) {
          if (it_1 instanceof SmallClazz) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (it_1 instanceof Attribute) {
            _matched=true;
          }
        }
        if (!_matched) {
          if (it_1 instanceof DataType) {
            _matched=true;
          }
        }
        if (_matched) {
          _switchResult = true;
        }
        if (!_matched) {
          _switchResult = false;
        }
        return _switchResult;
      };
      it.setResourceContentFilter(_function_2);
    };
    return ObjectExtensions.<DefaultComparisonScope>operator_doubleArrow(_defaultComparisonScope, _function);
  }
  
  private DefaultReqEngine getCustomRequirementEngine() {
    return new DefaultReqEngine() {
      @Override
      public void computeRequirements(final Comparison comparison, final Monitor monitor) {
        return;
      }
    };
  }
  
  private DefaultEquiEngine getCustomEquivalenceEngine() {
    return new DefaultEquiEngine() {
      @Override
      public void computeEquivalences(final Comparison comparison, final Monitor monitor) {
        return;
      }
    };
  }
  
  private DefaultConflictDetector getCustomConflictDetector() {
    return new DefaultConflictDetector() {
      @Override
      public void detect(final Comparison comparison, final Monitor monitor) {
        return;
      }
    };
  }
  
  private DefaultDiffEngine getCustomDiffEngine() {
    CustomDiffBuilder _customDiffBuilder = new CustomDiffBuilder();
    return new DefaultDiffEngine(_customDiffBuilder) {
      @Override
      protected FeatureFilter createFeatureFilter() {
        return new CustomFeatureFilter();
      }
    };
  }
  
  private IdentifierEObjectMatcher getCustomMatcher() {
    final IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
    final Function<EObject, String> _function = (EObject it) -> {
      final Object FALL_BACK_TO_OTHER_MATCHERS = null;
      String _switchResult = null;
      boolean _matched = false;
      if (it instanceof SmallClazz) {
        _matched=true;
        String _xblockexpression = null;
        {
          EObject _eContainer = ((SmallClazz)it).eContainer();
          final Namespace namespace = ((Namespace) _eContainer);
          StringConcatenation _builder = new StringConcatenation();
          String _name = namespace.getName();
          _builder.append(_name, "");
          _builder.append(".");
          String _name_1 = ((SmallClazz)it).getName();
          _builder.append(_name_1, "");
          _xblockexpression = _builder.toString();
        }
        _switchResult = _xblockexpression;
      }
      if (!_matched) {
        if (it instanceof ClassType) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          SmallClazz _type = ((ClassType)it).getType();
          String _name = _type.getName();
          _builder.append(_name, "");
          _switchResult = _builder.toString();
        }
      }
      if (!_matched) {
        _switchResult = ((String)FALL_BACK_TO_OTHER_MATCHERS);
      }
      return _switchResult;
    };
    return new IdentifierEObjectMatcher(matcher, _function);
  }
  
  private MatchEngineFactoryRegistryImpl getMatchEngineFactoryRegistry() {
    IdentifierEObjectMatcher _customMatcher = this.getCustomMatcher();
    DefaultComparisonFactory _comparisonFactory = this.getComparisonFactory();
    final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(_customMatcher, _comparisonFactory);
    matchEngineFactory.setRanking(20);
    final MatchEngineFactoryRegistryImpl matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
    matchEngineRegistry.add(matchEngineFactory);
    return matchEngineRegistry;
  }
  
  private DefaultComparisonFactory getComparisonFactory() {
    DefaultEqualityHelperFactory _defaultEqualityHelperFactory = new DefaultEqualityHelperFactory();
    return new DefaultComparisonFactory(_defaultEqualityHelperFactory);
  }
}
