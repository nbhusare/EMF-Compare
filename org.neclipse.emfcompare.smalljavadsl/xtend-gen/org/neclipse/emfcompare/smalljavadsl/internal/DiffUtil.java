package org.neclipse.emfcompare.smalljavadsl.internal;

import com.google.common.base.Objects;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage;

@SuppressWarnings("all")
public class DiffUtil {
  public static boolean isSmallClazzAdded(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) {
    return (((Objects.equal(reference, SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ) && Objects.equal(kind, DifferenceKind.ADD)) && 
      (!Objects.equal(match.getLeft(), null))) && Objects.equal(match.getRight(), null));
  }
  
  public static boolean isSmallClazzDeleted(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) {
    return (((Objects.equal(reference, SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ) && Objects.equal(kind, DifferenceKind.DELETE)) && 
      Objects.equal(match.getLeft(), null)) && (!Objects.equal(match.getRight(), null)));
  }
  
  public static boolean isSmallClazzRenamed(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) {
    return (((Objects.equal(reference, SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ) && Objects.equal(kind, DifferenceKind.ADD)) && 
      (!Objects.equal(match.getLeft(), null))) && (!Objects.equal(match.getRight(), null)));
  }
  
  public static boolean isVisibilityChanged(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) {
    return (((Objects.equal(reference, SmallJavaDslPackage.Literals.SMALL_CLAZZ__VISIBILITY) && Objects.equal(kind, DifferenceKind.ADD)) && 
      (!Objects.equal(match.getLeft(), null))) && (!Objects.equal(match.getRight(), null)));
  }
  
  public static boolean isAttributeAdded(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) {
    return (Objects.equal(reference, SmallJavaDslPackage.Literals.SMALL_CLAZZ__ATTRIBUTES) && Objects.equal(kind, DifferenceKind.ADD));
  }
  
  public static boolean isAttributeDeleted(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) {
    return (Objects.equal(reference, SmallJavaDslPackage.Literals.SMALL_CLAZZ__ATTRIBUTES) && Objects.equal(kind, DifferenceKind.DELETE));
  }
  
  public static boolean isDatatypeChanged(final Match match, final EReference reference, final EObject value, final DifferenceKind kind, final DifferenceSource source) {
    return (((Objects.equal(reference, SmallJavaDslPackage.Literals.ATTRIBUTE__DATATYPE) && Objects.equal(kind, DifferenceKind.ADD)) && 
      (!Objects.equal(match.getLeft(), null))) && (!Objects.equal(match.getRight(), null)));
  }
}
