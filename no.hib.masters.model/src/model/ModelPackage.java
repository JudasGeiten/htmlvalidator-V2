/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/htmlDoc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "htmlDoc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.HtmlRootImpl <em>Html Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.HtmlRootImpl
	 * @see model.impl.ModelPackageImpl#getHtmlRoot()
	 * @generated
	 */
	int HTML_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ROOT__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Css Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ROOT__CSS_STYLES = 1;

	/**
	 * The number of structural features of the '<em>Html Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Html Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.FormStepImpl <em>Form Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FormStepImpl
	 * @see model.impl.ModelPackageImpl#getFormStep()
	 * @generated
	 */
	int FORM_STEP = 1;

	/**
	 * The feature id for the '<em><b>Step Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_STEP__STEP_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Form Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_STEP__FORM_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Step Style</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_STEP__STEP_STYLE = 2;

	/**
	 * The number of structural features of the '<em>Form Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_STEP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Form Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.FormElementImpl <em>Form Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FormElementImpl
	 * @see model.impl.ModelPackageImpl#getFormElement()
	 * @generated
	 */
	int FORM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Element Style</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__ELEMENT_STYLE = 0;

	/**
	 * The number of structural features of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.labelImpl <em>label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.labelImpl
	 * @see model.impl.ModelPackageImpl#getlabel()
	 * @generated
	 */
	int LABEL = 3;

	/**
	 * The feature id for the '<em><b>Element Style</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ELEMENT_STYLE = FORM_ELEMENT__ELEMENT_STYLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VALUE = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOR = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constrast Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONSTRAST_RATIO = FORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = FORM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = FORM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.inputImpl <em>input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.inputImpl
	 * @see model.impl.ModelPackageImpl#getinput()
	 * @generated
	 */
	int INPUT = 4;

	/**
	 * The feature id for the '<em><b>Element Style</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ELEMENT_STYLE = FORM_ELEMENT__ELEMENT_STYLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labelled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LABELLED_BY = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = FORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = FORM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.CssStyleImpl <em>Css Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CssStyleImpl
	 * @see model.impl.ModelPackageImpl#getCssStyle()
	 * @generated
	 */
	int CSS_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_STYLE__SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Css Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_STYLE__CSS_DECLARATIONS = 1;

	/**
	 * The number of structural features of the '<em>Css Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_STYLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Css Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.CssDeclarationImpl <em>Css Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CssDeclarationImpl
	 * @see model.impl.ModelPackageImpl#getCssDeclaration()
	 * @generated
	 */
	int CSS_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_DECLARATION__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_DECLARATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Css Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Css Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.imgImpl <em>img</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.imgImpl
	 * @see model.impl.ModelPackageImpl#getimg()
	 * @generated
	 */
	int IMG = 7;

	/**
	 * The feature id for the '<em><b>Element Style</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__ELEMENT_STYLE = FORM_ELEMENT__ELEMENT_STYLE;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__ALT = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>img</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>img</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_OPERATION_COUNT = FORM_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link model.HtmlRoot <em>Html Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Root</em>'.
	 * @see model.HtmlRoot
	 * @generated
	 */
	EClass getHtmlRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link model.HtmlRoot#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see model.HtmlRoot#getSteps()
	 * @see #getHtmlRoot()
	 * @generated
	 */
	EReference getHtmlRoot_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link model.HtmlRoot#getCssStyles <em>Css Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Css Styles</em>'.
	 * @see model.HtmlRoot#getCssStyles()
	 * @see #getHtmlRoot()
	 * @generated
	 */
	EReference getHtmlRoot_CssStyles();

	/**
	 * Returns the meta object for class '{@link model.FormStep <em>Form Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Step</em>'.
	 * @see model.FormStep
	 * @generated
	 */
	EClass getFormStep();

	/**
	 * Returns the meta object for the attribute '{@link model.FormStep#getStepTitle <em>Step Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Title</em>'.
	 * @see model.FormStep#getStepTitle()
	 * @see #getFormStep()
	 * @generated
	 */
	EAttribute getFormStep_StepTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link model.FormStep#getFormElements <em>Form Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Elements</em>'.
	 * @see model.FormStep#getFormElements()
	 * @see #getFormStep()
	 * @generated
	 */
	EReference getFormStep_FormElements();

	/**
	 * Returns the meta object for the reference list '{@link model.FormStep#getStepStyle <em>Step Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Step Style</em>'.
	 * @see model.FormStep#getStepStyle()
	 * @see #getFormStep()
	 * @generated
	 */
	EReference getFormStep_StepStyle();

	/**
	 * Returns the meta object for class '{@link model.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Element</em>'.
	 * @see model.FormElement
	 * @generated
	 */
	EClass getFormElement();

	/**
	 * Returns the meta object for the reference list '{@link model.FormElement#getElementStyle <em>Element Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Style</em>'.
	 * @see model.FormElement#getElementStyle()
	 * @see #getFormElement()
	 * @generated
	 */
	EReference getFormElement_ElementStyle();

	/**
	 * Returns the meta object for class '{@link model.label <em>label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>label</em>'.
	 * @see model.label
	 * @generated
	 */
	EClass getlabel();

	/**
	 * Returns the meta object for the attribute '{@link model.label#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.label#getValue()
	 * @see #getlabel()
	 * @generated
	 */
	EAttribute getlabel_Value();

	/**
	 * Returns the meta object for the reference '{@link model.label#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see model.label#getFor()
	 * @see #getlabel()
	 * @generated
	 */
	EReference getlabel_For();

	/**
	 * Returns the meta object for the attribute '{@link model.label#getConstrastRatio <em>Constrast Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constrast Ratio</em>'.
	 * @see model.label#getConstrastRatio()
	 * @see #getlabel()
	 * @generated
	 */
	EAttribute getlabel_ConstrastRatio();

	/**
	 * Returns the meta object for the attribute '{@link model.label#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.label#getId()
	 * @see #getlabel()
	 * @generated
	 */
	EAttribute getlabel_Id();

	/**
	 * Returns the meta object for class '{@link model.input <em>input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>input</em>'.
	 * @see model.input
	 * @generated
	 */
	EClass getinput();

	/**
	 * Returns the meta object for the attribute '{@link model.input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.input#getType()
	 * @see #getinput()
	 * @generated
	 */
	EAttribute getinput_Type();

	/**
	 * Returns the meta object for the reference '{@link model.input#getLabelledBy <em>Labelled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labelled By</em>'.
	 * @see model.input#getLabelledBy()
	 * @see #getinput()
	 * @generated
	 */
	EReference getinput_LabelledBy();

	/**
	 * Returns the meta object for the attribute '{@link model.input#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.input#getId()
	 * @see #getinput()
	 * @generated
	 */
	EAttribute getinput_Id();

	/**
	 * Returns the meta object for class '{@link model.CssStyle <em>Css Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Css Style</em>'.
	 * @see model.CssStyle
	 * @generated
	 */
	EClass getCssStyle();

	/**
	 * Returns the meta object for the attribute '{@link model.CssStyle#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see model.CssStyle#getSelector()
	 * @see #getCssStyle()
	 * @generated
	 */
	EAttribute getCssStyle_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link model.CssStyle#getCssDeclarations <em>Css Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Css Declarations</em>'.
	 * @see model.CssStyle#getCssDeclarations()
	 * @see #getCssStyle()
	 * @generated
	 */
	EReference getCssStyle_CssDeclarations();

	/**
	 * Returns the meta object for class '{@link model.CssDeclaration <em>Css Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Css Declaration</em>'.
	 * @see model.CssDeclaration
	 * @generated
	 */
	EClass getCssDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link model.CssDeclaration#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see model.CssDeclaration#getProperty()
	 * @see #getCssDeclaration()
	 * @generated
	 */
	EAttribute getCssDeclaration_Property();

	/**
	 * Returns the meta object for the attribute '{@link model.CssDeclaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.CssDeclaration#getValue()
	 * @see #getCssDeclaration()
	 * @generated
	 */
	EAttribute getCssDeclaration_Value();

	/**
	 * Returns the meta object for class '{@link model.img <em>img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>img</em>'.
	 * @see model.img
	 * @generated
	 */
	EClass getimg();

	/**
	 * Returns the meta object for the attribute '{@link model.img#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see model.img#getAlt()
	 * @see #getimg()
	 * @generated
	 */
	EAttribute getimg_Alt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.HtmlRootImpl <em>Html Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.HtmlRootImpl
		 * @see model.impl.ModelPackageImpl#getHtmlRoot()
		 * @generated
		 */
		EClass HTML_ROOT = eINSTANCE.getHtmlRoot();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_ROOT__STEPS = eINSTANCE.getHtmlRoot_Steps();

		/**
		 * The meta object literal for the '<em><b>Css Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_ROOT__CSS_STYLES = eINSTANCE.getHtmlRoot_CssStyles();

		/**
		 * The meta object literal for the '{@link model.impl.FormStepImpl <em>Form Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FormStepImpl
		 * @see model.impl.ModelPackageImpl#getFormStep()
		 * @generated
		 */
		EClass FORM_STEP = eINSTANCE.getFormStep();

		/**
		 * The meta object literal for the '<em><b>Step Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_STEP__STEP_TITLE = eINSTANCE.getFormStep_StepTitle();

		/**
		 * The meta object literal for the '<em><b>Form Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_STEP__FORM_ELEMENTS = eINSTANCE.getFormStep_FormElements();

		/**
		 * The meta object literal for the '<em><b>Step Style</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_STEP__STEP_STYLE = eINSTANCE.getFormStep_StepStyle();

		/**
		 * The meta object literal for the '{@link model.impl.FormElementImpl <em>Form Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FormElementImpl
		 * @see model.impl.ModelPackageImpl#getFormElement()
		 * @generated
		 */
		EClass FORM_ELEMENT = eINSTANCE.getFormElement();

		/**
		 * The meta object literal for the '<em><b>Element Style</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_ELEMENT__ELEMENT_STYLE = eINSTANCE.getFormElement_ElementStyle();

		/**
		 * The meta object literal for the '{@link model.impl.labelImpl <em>label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.labelImpl
		 * @see model.impl.ModelPackageImpl#getlabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getlabel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__VALUE = eINSTANCE.getlabel_Value();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__FOR = eINSTANCE.getlabel_For();

		/**
		 * The meta object literal for the '<em><b>Constrast Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__CONSTRAST_RATIO = eINSTANCE.getlabel_ConstrastRatio();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ID = eINSTANCE.getlabel_Id();

		/**
		 * The meta object literal for the '{@link model.impl.inputImpl <em>input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.inputImpl
		 * @see model.impl.ModelPackageImpl#getinput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getinput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getinput_Type();

		/**
		 * The meta object literal for the '<em><b>Labelled By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__LABELLED_BY = eINSTANCE.getinput_LabelledBy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__ID = eINSTANCE.getinput_Id();

		/**
		 * The meta object literal for the '{@link model.impl.CssStyleImpl <em>Css Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CssStyleImpl
		 * @see model.impl.ModelPackageImpl#getCssStyle()
		 * @generated
		 */
		EClass CSS_STYLE = eINSTANCE.getCssStyle();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSS_STYLE__SELECTOR = eINSTANCE.getCssStyle_Selector();

		/**
		 * The meta object literal for the '<em><b>Css Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSS_STYLE__CSS_DECLARATIONS = eINSTANCE.getCssStyle_CssDeclarations();

		/**
		 * The meta object literal for the '{@link model.impl.CssDeclarationImpl <em>Css Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CssDeclarationImpl
		 * @see model.impl.ModelPackageImpl#getCssDeclaration()
		 * @generated
		 */
		EClass CSS_DECLARATION = eINSTANCE.getCssDeclaration();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSS_DECLARATION__PROPERTY = eINSTANCE.getCssDeclaration_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSS_DECLARATION__VALUE = eINSTANCE.getCssDeclaration_Value();

		/**
		 * The meta object literal for the '{@link model.impl.imgImpl <em>img</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.imgImpl
		 * @see model.impl.ModelPackageImpl#getimg()
		 * @generated
		 */
		EClass IMG = eINSTANCE.getimg();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__ALT = eINSTANCE.getimg_Alt();

	}

} //ModelPackage
