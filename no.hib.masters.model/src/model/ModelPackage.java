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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Element Style</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__ELEMENT_STYLE = 1;

	/**
	 * The number of structural features of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LabelImpl
	 * @see model.impl.ModelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = FORM_ELEMENT__ID;

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
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = FORM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InputImpl
	 * @see model.impl.ModelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = FORM_ELEMENT__ID;

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
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input</em>' class.
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
	 * The meta object id for the '{@link model.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ImageImpl
	 * @see model.impl.ModelPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = FORM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Element Style</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ELEMENT_STYLE = FORM_ELEMENT__ELEMENT_STYLE;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALT = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = FORM_ELEMENT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link model.FormElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.FormElement#getID()
	 * @see #getFormElement()
	 * @generated
	 */
	EAttribute getFormElement_ID();

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
	 * Returns the meta object for class '{@link model.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see model.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link model.Label#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.Label#getValue()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Value();

	/**
	 * Returns the meta object for the reference '{@link model.Label#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see model.Label#getFor()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_For();

	/**
	 * Returns the meta object for the attribute '{@link model.Label#getConstrastRatio <em>Constrast Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constrast Ratio</em>'.
	 * @see model.Label#getConstrastRatio()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_ConstrastRatio();

	/**
	 * Returns the meta object for class '{@link model.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see model.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link model.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the reference '{@link model.Input#getLabelledBy <em>Labelled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labelled By</em>'.
	 * @see model.Input#getLabelledBy()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_LabelledBy();

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
	 * Returns the meta object for class '{@link model.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see model.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link model.Image#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see model.Image#getAlt()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Alt();

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
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ELEMENT__ID = eINSTANCE.getFormElement_ID();

		/**
		 * The meta object literal for the '<em><b>Element Style</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_ELEMENT__ELEMENT_STYLE = eINSTANCE.getFormElement_ElementStyle();

		/**
		 * The meta object literal for the '{@link model.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LabelImpl
		 * @see model.impl.ModelPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__VALUE = eINSTANCE.getLabel_Value();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__FOR = eINSTANCE.getLabel_For();

		/**
		 * The meta object literal for the '<em><b>Constrast Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__CONSTRAST_RATIO = eINSTANCE.getLabel_ConstrastRatio();

		/**
		 * The meta object literal for the '{@link model.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.InputImpl
		 * @see model.impl.ModelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Labelled By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__LABELLED_BY = eINSTANCE.getInput_LabelledBy();

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
		 * The meta object literal for the '{@link model.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ImageImpl
		 * @see model.impl.ModelPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALT = eINSTANCE.getImage_Alt();

	}

} //ModelPackage
