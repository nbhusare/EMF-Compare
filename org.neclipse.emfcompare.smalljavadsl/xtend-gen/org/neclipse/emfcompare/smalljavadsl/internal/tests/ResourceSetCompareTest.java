package org.neclipse.emfcompare.smalljavadsl.internal.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.utils.MatchUtil;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neclipse.emfcompare.smalljavadsl.internal.ResourceSetCompare;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.BasicType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.ClassType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Namespace;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallClazz;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Visibility;
import org.neclipse.xtext.smalljavadsl.tests.SmallJavaDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaDslInjectorProvider.class)
@SuppressWarnings("all")
public class ResourceSetCompareTest {
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private ParseHelper<Namespace> _parseHelper;
  
  @Test
  public void testAdditionOfSmallClazzes() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, newRs);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Bar {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(2, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof ReferenceChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, Boolean> _function_1 = (Diff it) -> {
        EStructuralFeature _structuralFeature = MatchUtil.getStructuralFeature(it);
        return Boolean.valueOf(Objects.equal(_structuralFeature, SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ));
      };
      boolean _forall_1 = IterableExtensions.<Diff>forall(differences, _function_1);
      Assert.assertTrue(_forall_1);
      final Function1<Diff, Boolean> _function_2 = (Diff it) -> {
        DifferenceKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, DifferenceKind.ADD));
      };
      boolean _forall_2 = IterableExtensions.<Diff>forall(differences, _function_2);
      Assert.assertTrue(_forall_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDeletionOfSmallClazzes() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Bar {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(2, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof ReferenceChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, Boolean> _function_1 = (Diff it) -> {
        EStructuralFeature _structuralFeature = MatchUtil.getStructuralFeature(it);
        return Boolean.valueOf(Objects.equal(_structuralFeature, SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ));
      };
      boolean _forall_1 = IterableExtensions.<Diff>forall(differences, _function_1);
      Assert.assertTrue(_forall_1);
      final Function1<Diff, Boolean> _function_2 = (Diff it) -> {
        DifferenceKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, DifferenceKind.DELETE));
      };
      boolean _forall_2 = IterableExtensions.<Diff>forall(differences, _function_2);
      Assert.assertTrue(_forall_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSmallClazzRename() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Bar {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(1, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof ReferenceChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, Boolean> _function_1 = (Diff it) -> {
        EStructuralFeature _structuralFeature = MatchUtil.getStructuralFeature(it);
        return Boolean.valueOf(Objects.equal(_structuralFeature, SmallJavaDslPackage.Literals.NAMESPACE__SMALL_CLAZZ));
      };
      boolean _forall_1 = IterableExtensions.<Diff>forall(differences, _function_1);
      Assert.assertTrue(_forall_1);
      final Function1<Diff, Boolean> _function_2 = (Diff it) -> {
        DifferenceKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, DifferenceKind.CHANGE));
      };
      boolean _forall_2 = IterableExtensions.<Diff>forall(differences, _function_2);
      Assert.assertTrue(_forall_2);
      final Function1<Diff, Boolean> _function_3 = (Diff it) -> {
        Object _value = MatchUtil.getValue(it);
        return Boolean.valueOf((_value instanceof SmallClazz));
      };
      boolean _forall_3 = IterableExtensions.<Diff>forall(differences, _function_3);
      Assert.assertTrue(_forall_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSmallClazzVisibilityChange() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("public clazz Foo {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(1, _size);
      final Diff difference = IterableExtensions.<Diff>head(differences);
      Assert.assertTrue((difference instanceof AttributeChange));
      final AttributeChange attributeChange = ((AttributeChange) difference);
      EAttribute _attribute = attributeChange.getAttribute();
      boolean _equals = Objects.equal(_attribute, SmallJavaDslPackage.Literals.SMALL_CLAZZ__VISIBILITY);
      Assert.assertTrue(_equals);
      DifferenceKind _kind = difference.getKind();
      boolean _equals_1 = Objects.equal(_kind, DifferenceKind.CHANGE);
      Assert.assertTrue(_equals_1);
      Object _value = MatchUtil.getValue(difference);
      boolean _equals_2 = Objects.equal(_value, Visibility.PUBLIC);
      Assert.assertTrue(_equals_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testChangeAttributeTypeToAnArray() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String names");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Foo {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("String[] names");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(1, _size);
      Diff _head = IterableExtensions.<Diff>head(differences);
      Assert.assertTrue((_head instanceof AttributeChange));
      Diff _head_1 = IterableExtensions.<Diff>head(differences);
      final AttributeChange attributeChange = ((AttributeChange) _head_1);
      EAttribute _attribute = attributeChange.getAttribute();
      boolean _equals = Objects.equal(_attribute, SmallJavaDslPackage.Literals.ATTRIBUTE__ARRAY);
      Assert.assertTrue(_equals);
      DifferenceKind _kind = attributeChange.getKind();
      boolean _equals_1 = Objects.equal(_kind, DifferenceKind.CHANGE);
      Assert.assertTrue(_equals_1);
      Object _value = attributeChange.getValue();
      boolean _equals_2 = Objects.equal(_value, Boolean.TRUE);
      Assert.assertTrue(_equals_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeRename() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String name");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String address");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Foo {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("String newName");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("String newAddress");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(2, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof AttributeChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, String> _function_1 = (Diff it) -> {
        Object _value = MatchUtil.getValue(it);
        return ((String) _value);
      };
      List<String> _map = ListExtensions.<Diff, String>map(differences, _function_1);
      this.assertListEquals(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("newName", "newAddress")), _map);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributesAddedToSmallClazz() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Foo {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("String newName");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("String newAddress");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(2, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof ReferenceChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, Boolean> _function_1 = (Diff it) -> {
        EStructuralFeature _structuralFeature = MatchUtil.getStructuralFeature(it);
        return Boolean.valueOf(Objects.equal(_structuralFeature, SmallJavaDslPackage.Literals.SMALL_CLAZZ__ATTRIBUTES));
      };
      boolean _forall_1 = IterableExtensions.<Diff>forall(differences, _function_1);
      Assert.assertTrue(_forall_1);
      final Function1<Diff, Boolean> _function_2 = (Diff it) -> {
        DifferenceKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, DifferenceKind.ADD));
      };
      boolean _forall_2 = IterableExtensions.<Diff>forall(differences, _function_2);
      Assert.assertTrue(_forall_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributesDeletedFromSmallClazz() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String newName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String newAddress\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Foo {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(2, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof ReferenceChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, Boolean> _function_1 = (Diff it) -> {
        EStructuralFeature _structuralFeature = MatchUtil.getStructuralFeature(it);
        return Boolean.valueOf(Objects.equal(_structuralFeature, SmallJavaDslPackage.Literals.SMALL_CLAZZ__ATTRIBUTES));
      };
      boolean _forall_1 = IterableExtensions.<Diff>forall(differences, _function_1);
      Assert.assertTrue(_forall_1);
      final Function1<Diff, Boolean> _function_2 = (Diff it) -> {
        DifferenceKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, DifferenceKind.DELETE));
      };
      boolean _forall_2 = IterableExtensions.<Diff>forall(differences, _function_2);
      Assert.assertTrue(_forall_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeDatatypeChangedFromBasicTypeToBasicType() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String attribute");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String attribute02");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Foo {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Integer attribute");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Integer attribute02");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(2, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof ReferenceChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, Boolean> _function_1 = (Diff it) -> {
        EStructuralFeature _structuralFeature = MatchUtil.getStructuralFeature(it);
        return Boolean.valueOf(Objects.equal(_structuralFeature, SmallJavaDslPackage.Literals.ATTRIBUTE__DATATYPE));
      };
      boolean _forall_1 = IterableExtensions.<Diff>forall(differences, _function_1);
      Assert.assertTrue(_forall_1);
      final Function1<Diff, Boolean> _function_2 = (Diff it) -> {
        DifferenceKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, DifferenceKind.CHANGE));
      };
      boolean _forall_2 = IterableExtensions.<Diff>forall(differences, _function_2);
      Assert.assertTrue(_forall_2);
      final Function1<Diff, Boolean> _function_3 = (Diff it) -> {
        Object _value = MatchUtil.getValue(it);
        return Boolean.valueOf((_value instanceof BasicType));
      };
      boolean _forall_3 = IterableExtensions.<Diff>forall(differences, _function_3);
      Assert.assertTrue(_forall_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeDatatypeChangedFromBasicTypeToClazzType() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String attribute");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String attribute02");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("private clazz Bar {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("String attribute");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("String attribute02");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("namespace test.models");
      _builder_2.newLine();
      _builder_2.append("private clazz Foo {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("String attribute");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("String attribute02");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this._parseHelper.parse(_builder_2, newRs);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("namespace test.models");
      _builder_3.newLine();
      _builder_3.append("import test.models.*");
      _builder_3.newLine();
      _builder_3.append("private clazz Bar {");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("Foo attribute");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("Foo attribute02");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      this._parseHelper.parse(_builder_3, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(2, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof ReferenceChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, Boolean> _function_1 = (Diff it) -> {
        EStructuralFeature _structuralFeature = MatchUtil.getStructuralFeature(it);
        return Boolean.valueOf(Objects.equal(_structuralFeature, SmallJavaDslPackage.Literals.ATTRIBUTE__DATATYPE));
      };
      boolean _forall_1 = IterableExtensions.<Diff>forall(differences, _function_1);
      Assert.assertTrue(_forall_1);
      final Function1<Diff, Boolean> _function_2 = (Diff it) -> {
        DifferenceKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, DifferenceKind.CHANGE));
      };
      boolean _forall_2 = IterableExtensions.<Diff>forall(differences, _function_2);
      Assert.assertTrue(_forall_2);
      final Function1<Diff, Boolean> _function_3 = (Diff it) -> {
        Object _value = MatchUtil.getValue(it);
        return Boolean.valueOf((_value instanceof ClassType));
      };
      boolean _forall_3 = IterableExtensions.<Diff>forall(differences, _function_3);
      Assert.assertTrue(_forall_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeDatatypeChangedFromClazzTypeToClazzType() {
    try {
      final XtextResourceSet oldRs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("namespace test.models");
      _builder.newLine();
      _builder.append("private clazz Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String attribute");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String attribute02");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder, oldRs);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("namespace test.models");
      _builder_1.newLine();
      _builder_1.append("import test.models.*");
      _builder_1.newLine();
      _builder_1.append("private clazz Bar {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Foo attribute");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Foo attribute02");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, oldRs);
      final XtextResourceSet newRs = this.resourceSetProvider.get();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("namespace test.models");
      _builder_2.newLine();
      _builder_2.append("private clazz Foo {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("String attribute");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("String attribute02");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this._parseHelper.parse(_builder_2, newRs);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("namespace test.models");
      _builder_3.newLine();
      _builder_3.append("private clazz Bar {");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("Bar attribute");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("Bar attribute02");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      this._parseHelper.parse(_builder_3, newRs);
      ResourceSetCompare _resourceSetCompare = new ResourceSetCompare();
      final EList<Diff> differences = _resourceSetCompare.compare(newRs, oldRs);
      int _size = differences.size();
      Assert.assertEquals(2, _size);
      final Function1<Diff, Boolean> _function = (Diff it) -> {
        return Boolean.valueOf((it instanceof ReferenceChange));
      };
      boolean _forall = IterableExtensions.<Diff>forall(differences, _function);
      Assert.assertTrue(_forall);
      final Function1<Diff, Boolean> _function_1 = (Diff it) -> {
        EStructuralFeature _structuralFeature = MatchUtil.getStructuralFeature(it);
        return Boolean.valueOf(Objects.equal(_structuralFeature, SmallJavaDslPackage.Literals.ATTRIBUTE__DATATYPE));
      };
      boolean _forall_1 = IterableExtensions.<Diff>forall(differences, _function_1);
      Assert.assertTrue(_forall_1);
      final Function1<Diff, Boolean> _function_2 = (Diff it) -> {
        DifferenceKind _kind = it.getKind();
        return Boolean.valueOf(Objects.equal(_kind, DifferenceKind.CHANGE));
      };
      boolean _forall_2 = IterableExtensions.<Diff>forall(differences, _function_2);
      Assert.assertTrue(_forall_2);
      final Function1<Diff, Boolean> _function_3 = (Diff it) -> {
        Object _value = MatchUtil.getValue(it);
        return Boolean.valueOf((_value instanceof ClassType));
      };
      boolean _forall_3 = IterableExtensions.<Diff>forall(differences, _function_3);
      Assert.assertTrue(_forall_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertListEquals(final List<String> expected, final List<String> actual) {
    List<String> _sort = IterableExtensions.<String>sort(expected);
    List<String> _sort_1 = IterableExtensions.<String>sort(actual);
    Assert.assertEquals(_sort, _sort_1);
  }
}
