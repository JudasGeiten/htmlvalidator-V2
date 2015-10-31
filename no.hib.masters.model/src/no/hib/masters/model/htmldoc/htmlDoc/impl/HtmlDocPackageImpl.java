/**
 */
package no.hib.masters.model.htmldoc.htmlDoc.impl;

import no.hib.masters.model.htmldoc.htmlDoc.DifiForm;
import no.hib.masters.model.htmldoc.htmlDoc.FormStep;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlDocFactory;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlElement;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlInput;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmlDocPackageImpl extends EPackageImpl implements HtmlDocPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass difiFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlInputEClass = null;

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
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HtmlDocPackageImpl() {
		super(eNS_URI, HtmlDocFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HtmlDocPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HtmlDocPackage init() {
		if (isInited) return (HtmlDocPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlDocPackage.eNS_URI);

		// Obtain or create and register package
		HtmlDocPackageImpl theHtmlDocPackage = (HtmlDocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HtmlDocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HtmlDocPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHtmlDocPackage.createPackageContents();

		// Initialize created meta-data
		theHtmlDocPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHtmlDocPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HtmlDocPackage.eNS_URI, theHtmlDocPackage);
		return theHtmlDocPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifiForm() {
		return difiFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifiForm_SkjemaID() {
		return (EAttribute)difiFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifiForm_Steps() {
		return (EReference)difiFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormStep() {
		return formStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormStep_StepTitle() {
		return (EAttribute)formStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormStep_FormElements() {
		return (EReference)formStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHtmlElement() {
		return htmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHtmlElement_ID() {
		return (EAttribute)htmlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHtmlLabel() {
		return htmlLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHtmlLabel_Value() {
		return (EAttribute)htmlLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHtmlLabel_For() {
		return (EReference)htmlLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHtmlInput() {
		return htmlInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHtmlInput_Type() {
		return (EAttribute)htmlInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlDocFactory getHtmlDocFactory() {
		return (HtmlDocFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		difiFormEClass = createEClass(DIFI_FORM);
		createEAttribute(difiFormEClass, DIFI_FORM__SKJEMA_ID);
		createEReference(difiFormEClass, DIFI_FORM__STEPS);

		formStepEClass = createEClass(FORM_STEP);
		createEAttribute(formStepEClass, FORM_STEP__STEP_TITLE);
		createEReference(formStepEClass, FORM_STEP__FORM_ELEMENTS);

		htmlElementEClass = createEClass(HTML_ELEMENT);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__ID);

		htmlLabelEClass = createEClass(HTML_LABEL);
		createEAttribute(htmlLabelEClass, HTML_LABEL__VALUE);
		createEReference(htmlLabelEClass, HTML_LABEL__FOR);

		htmlInputEClass = createEClass(HTML_INPUT);
		createEAttribute(htmlInputEClass, HTML_INPUT__TYPE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		htmlLabelEClass.getESuperTypes().add(this.getHtmlElement());
		htmlInputEClass.getESuperTypes().add(this.getHtmlElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(difiFormEClass, DifiForm.class, "DifiForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifiForm_SkjemaID(), ecorePackage.getEString(), "SkjemaID", null, 1, 1, DifiForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifiForm_Steps(), this.getFormStep(), null, "steps", null, 1, -1, DifiForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formStepEClass, FormStep.class, "FormStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormStep_StepTitle(), ecorePackage.getEString(), "stepTitle", null, 1, 1, FormStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormStep_FormElements(), this.getHtmlElement(), null, "formElements", null, 0, -1, FormStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlElementEClass, HtmlElement.class, "HtmlElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHtmlElement_ID(), ecorePackage.getEString(), "ID", null, 0, 1, HtmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlLabelEClass, HtmlLabel.class, "HtmlLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHtmlLabel_Value(), ecorePackage.getEString(), "value", null, 0, 1, HtmlLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHtmlLabel_For(), this.getHtmlInput(), null, "for", null, 1, 1, HtmlLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlInputEClass, HtmlInput.class, "HtmlInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHtmlInput_Type(), ecorePackage.getEString(), "type", "text", 1, 1, HtmlInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HtmlDocPackageImpl
