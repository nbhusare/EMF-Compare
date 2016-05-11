/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.neclipse.xtext.smalljavadsl.smallJavaDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Attribute;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.BasicType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.BooleanType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.ClassType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.DataType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.DoubleType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Import;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.ImportDeclaration;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.IntegerType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.LongType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Namespace;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallClazz;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslFactory;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.StringType;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallJavaDslPackageImpl extends EPackageImpl implements SmallJavaDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smallClazzEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visibilityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SmallJavaDslPackageImpl()
  {
    super(eNS_URI, SmallJavaDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SmallJavaDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SmallJavaDslPackage init()
  {
    if (isInited) return (SmallJavaDslPackage)EPackage.Registry.INSTANCE.getEPackage(SmallJavaDslPackage.eNS_URI);

    // Obtain or create and register package
    SmallJavaDslPackageImpl theSmallJavaDslPackage = (SmallJavaDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmallJavaDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmallJavaDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSmallJavaDslPackage.createPackageContents();

    // Initialize created meta-data
    theSmallJavaDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSmallJavaDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SmallJavaDslPackage.eNS_URI, theSmallJavaDslPackage);
    return theSmallJavaDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace()
  {
    return namespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_Name()
  {
    return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_ImportDeclaration()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_SmallClazz()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportDeclaration()
  {
    return importDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportDeclaration_Imports()
  {
    return (EReference)importDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmallClazz()
  {
    return smallClazzEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSmallClazz_Visibility()
  {
    return (EAttribute)smallClazzEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSmallClazz_Name()
  {
    return (EAttribute)smallClazzEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmallClazz_SuperClass()
  {
    return (EReference)smallClazzEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmallClazz_Attributes()
  {
    return (EReference)smallClazzEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Datatype()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Array()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicType()
  {
    return basicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringType()
  {
    return stringTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanType()
  {
    return booleanTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerType()
  {
    return integerTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongType()
  {
    return longTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleType()
  {
    return doubleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassType()
  {
    return classTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassType_Type()
  {
    return (EReference)classTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibility()
  {
    return visibilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaDslFactory getSmallJavaDslFactory()
  {
    return (SmallJavaDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    namespaceEClass = createEClass(NAMESPACE);
    createEAttribute(namespaceEClass, NAMESPACE__NAME);
    createEReference(namespaceEClass, NAMESPACE__IMPORT_DECLARATION);
    createEReference(namespaceEClass, NAMESPACE__SMALL_CLAZZ);

    importDeclarationEClass = createEClass(IMPORT_DECLARATION);
    createEReference(importDeclarationEClass, IMPORT_DECLARATION__IMPORTS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    smallClazzEClass = createEClass(SMALL_CLAZZ);
    createEAttribute(smallClazzEClass, SMALL_CLAZZ__VISIBILITY);
    createEAttribute(smallClazzEClass, SMALL_CLAZZ__NAME);
    createEReference(smallClazzEClass, SMALL_CLAZZ__SUPER_CLASS);
    createEReference(smallClazzEClass, SMALL_CLAZZ__ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEReference(attributeEClass, ATTRIBUTE__DATATYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__ARRAY);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);

    dataTypeEClass = createEClass(DATA_TYPE);

    basicTypeEClass = createEClass(BASIC_TYPE);

    stringTypeEClass = createEClass(STRING_TYPE);

    booleanTypeEClass = createEClass(BOOLEAN_TYPE);

    integerTypeEClass = createEClass(INTEGER_TYPE);

    longTypeEClass = createEClass(LONG_TYPE);

    doubleTypeEClass = createEClass(DOUBLE_TYPE);

    classTypeEClass = createEClass(CLASS_TYPE);
    createEReference(classTypeEClass, CLASS_TYPE__TYPE);

    // Create enums
    visibilityEEnum = createEEnum(VISIBILITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    basicTypeEClass.getESuperTypes().add(this.getDataType());
    stringTypeEClass.getESuperTypes().add(this.getBasicType());
    booleanTypeEClass.getESuperTypes().add(this.getBasicType());
    integerTypeEClass.getESuperTypes().add(this.getBasicType());
    longTypeEClass.getESuperTypes().add(this.getBasicType());
    doubleTypeEClass.getESuperTypes().add(this.getBasicType());
    classTypeEClass.getESuperTypes().add(this.getDataType());

    // Initialize classes and features; add operations and parameters
    initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_ImportDeclaration(), this.getImportDeclaration(), null, "importDeclaration", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_SmallClazz(), this.getSmallClazz(), null, "smallClazz", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importDeclarationEClass, ImportDeclaration.class, "ImportDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportDeclaration_Imports(), this.getImport(), null, "imports", null, 0, -1, ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smallClazzEClass, SmallClazz.class, "SmallClazz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSmallClazz_Visibility(), this.getVisibility(), "visibility", null, 0, 1, SmallClazz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSmallClazz_Name(), ecorePackage.getEString(), "name", null, 0, 1, SmallClazz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmallClazz_SuperClass(), this.getSmallClazz(), null, "superClass", null, 0, 1, SmallClazz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmallClazz_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, SmallClazz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribute_Datatype(), this.getDataType(), null, "datatype", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longTypeEClass, LongType.class, "LongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleTypeEClass, DoubleType.class, "DoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classTypeEClass, ClassType.class, "ClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassType_Type(), this.getSmallClazz(), null, "type", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
    addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);

    // Create resource
    createResource(eNS_URI);
  }

} //SmallJavaDslPackageImpl