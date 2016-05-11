package org.neclipse.emfcompare.smalljavadsl.internal;

import com.google.common.base.Objects;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage;

@SuppressWarnings("all")
public class CustomFeatureFilter extends FeatureFilter {
  @Override
  public boolean checkForOrderingChanges(final EStructuralFeature feature) {
    return false;
  }
  
  @Override
  protected boolean isIgnoredAttribute(final EAttribute attribute) {
    final boolean IGNORE_ATTRIBUTE = true;
    boolean _switchResult = false;
    boolean _matched = false;
    if (Objects.equal(attribute, SmallJavaDslPackage.Literals.NAMESPACE__NAME)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(attribute, SmallJavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE)) {
        _matched=true;
      }
    }
    if (_matched) {
      _switchResult = IGNORE_ATTRIBUTE;
    }
    if (!_matched) {
      _switchResult = super.isIgnoredAttribute(attribute);
    }
    return _switchResult;
  }
  
  @Override
  protected boolean isIgnoredReference(final Match match, final EReference reference) {
    boolean _xblockexpression = false;
    {
      final boolean IGNORE_REFERENCE = true;
      boolean _equals = Objects.equal(reference, SmallJavaDslPackage.Literals.NAMESPACE__IMPORT_DECLARATION);
      if (_equals) {
        return IGNORE_REFERENCE;
      }
      _xblockexpression = super.isIgnoredReference(match, reference);
    }
    return _xblockexpression;
  }
}
