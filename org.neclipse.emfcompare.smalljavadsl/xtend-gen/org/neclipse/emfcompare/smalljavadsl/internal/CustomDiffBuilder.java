package org.neclipse.emfcompare.smalljavadsl.internal;

import org.eclipse.emf.compare.CompareFactory;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.MatchResource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.neclipse.emfcompare.smalljavadsl.internal.DiffUtil;

@SuppressWarnings("all")
public class CustomDiffBuilder extends DiffBuilder {
  @Override
  public void attributeChange(final Match match, final EAttribute attribute, final Object value, final DifferenceKind kind, final DifferenceSource source) {
    super.attributeChange(match, attribute, value, kind, source);
  }
  
  @Override
  public void referenceChange(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) {
    if ((DiffUtil.isSmallClazzAdded(match, reference, value, kind, source) || 
      DiffUtil.isSmallClazzDeleted(match, reference, value, kind, source))) {
      super.referenceChange(match, reference, value, kind, source);
    } else {
      boolean _isSmallClazzRenamed = DiffUtil.isSmallClazzRenamed(match, reference, value, kind, source);
      if (_isSmallClazzRenamed) {
        final ReferenceChange referenceChange = CompareFactory.eINSTANCE.createReferenceChange();
        referenceChange.setMatch(match);
        referenceChange.setReference(reference);
        referenceChange.setValue(value);
        referenceChange.setKind(DifferenceKind.CHANGE);
        referenceChange.setSource(source);
      } else {
        if ((DiffUtil.isAttributeAdded(match, reference, value, kind, source) || 
          DiffUtil.isAttributeDeleted(match, reference, value, kind, source))) {
          super.referenceChange(match, reference, value, kind, source);
        } else {
          boolean _isDatatypeChanged = DiffUtil.isDatatypeChanged(match, reference, value, kind, source);
          if (_isDatatypeChanged) {
            final ReferenceChange referenceChange_1 = CompareFactory.eINSTANCE.createReferenceChange();
            referenceChange_1.setMatch(match);
            referenceChange_1.setReference(reference);
            referenceChange_1.setValue(value);
            referenceChange_1.setKind(DifferenceKind.CHANGE);
            referenceChange_1.setSource(source);
          }
        }
      }
    }
  }
  
  @Override
  public void resourceAttachmentChange(final Match match, final String uri, final DifferenceKind kind, final DifferenceSource source) {
    return;
  }
  
  @Override
  public void resourceLocationChange(final MatchResource matchResource, final String baseLocation, final String changedLocation, final DifferenceKind kind, final DifferenceSource source) {
    return;
  }
  
  @Override
  public void featureMapChange(final Match match, final EAttribute attribute, final Object value, final DifferenceKind kind, final DifferenceSource source) {
    return;
  }
}
