/**
 */
package no.hib.masters.model.htmldoc.htmlDoc;

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
 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocFactory
 * @model kind="package"
 * @generated
 */
public interface HtmlDocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "htmlDoc";

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
	HtmlDocPackage eINSTANCE = no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.DifiFormImpl <em>Difi Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.DifiFormImpl
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getDifiForm()
	 * @generated
	 */
	int DIFI_FORM = 0;

	/**
	 * The feature id for the '<em><b>Skjema ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFI_FORM__SKJEMA_ID = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFI_FORM__STEPS = 1;

	/**
	 * The number of structural features of the '<em>Difi Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFI_FORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Difi Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFI_FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.FormStepImpl <em>Form Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.FormStepImpl
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getFormStep()
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
	 * The number of structural features of the '<em>Form Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Form Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlElementImpl <em>Html Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlElementImpl
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getHtmlElement()
	 * @generated
	 */
	int HTML_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Html Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Html Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlLabelImpl <em>Html Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlLabelImpl
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getHtmlLabel()
	 * @generated
	 */
	int HTML_LABEL = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LABEL__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LABEL__VALUE = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LABEL__FOR = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Html Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LABEL_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Html Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_LABEL_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlInputImpl <em>Html Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlInputImpl
	 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getHtmlInput()
	 * @generated
	 */
	int HTML_INPUT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_INPUT__ID = HTML_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_INPUT__TYPE = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labelled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_INPUT__LABELLED_BY = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Html Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_INPUT_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Html Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_INPUT_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hib.masters.model.htmldoc.htmlDoc.DifiForm <em>Difi Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difi Form</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.DifiForm
	 * @generated
	 */
	EClass getDifiForm();

	/**
	 * Returns the meta object for the attribute '{@link no.hib.masters.model.htmldoc.htmlDoc.DifiForm#getSkjemaID <em>Skjema ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skjema ID</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.DifiForm#getSkjemaID()
	 * @see #getDifiForm()
	 * @generated
	 */
	EAttribute getDifiForm_SkjemaID();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hib.masters.model.htmldoc.htmlDoc.DifiForm#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.DifiForm#getSteps()
	 * @see #getDifiForm()
	 * @generated
	 */
	EReference getDifiForm_Steps();

	/**
	 * Returns the meta object for class '{@link no.hib.masters.model.htmldoc.htmlDoc.FormStep <em>Form Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Step</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.FormStep
	 * @generated
	 */
	EClass getFormStep();

	/**
	 * Returns the meta object for the attribute '{@link no.hib.masters.model.htmldoc.htmlDoc.FormStep#getStepTitle <em>Step Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Title</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.FormStep#getStepTitle()
	 * @see #getFormStep()
	 * @generated
	 */
	EAttribute getFormStep_StepTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hib.masters.model.htmldoc.htmlDoc.FormStep#getFormElements <em>Form Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Elements</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.FormStep#getFormElements()
	 * @see #getFormStep()
	 * @generated
	 */
	EReference getFormStep_FormElements();

	/**
	 * Returns the meta object for class '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlElement <em>Html Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Element</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlElement
	 * @generated
	 */
	EClass getHtmlElement();

	/**
	 * Returns the meta object for the attribute '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlElement#getID()
	 * @see #getHtmlElement()
	 * @generated
	 */
	EAttribute getHtmlElement_ID();

	/**
	 * Returns the meta object for class '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel <em>Html Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Label</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel
	 * @generated
	 */
	EClass getHtmlLabel();

	/**
	 * Returns the meta object for the attribute '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel#getValue()
	 * @see #getHtmlLabel()
	 * @generated
	 */
	EAttribute getHtmlLabel_Value();

	/**
	 * Returns the meta object for the reference '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel#getFor()
	 * @see #getHtmlLabel()
	 * @generated
	 */
	EReference getHtmlLabel_For();

	/**
	 * Returns the meta object for class '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlInput <em>Html Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Input</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlInput
	 * @generated
	 */
	EClass getHtmlInput();

	/**
	 * Returns the meta object for the attribute '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlInput#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlInput#getType()
	 * @see #getHtmlInput()
	 * @generated
	 */
	EAttribute getHtmlInput_Type();

	/**
	 * Returns the meta object for the reference '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlInput#getLabelledBy <em>Labelled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labelled By</em>'.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlInput#getLabelledBy()
	 * @see #getHtmlInput()
	 * @generated
	 */
	EReference getHtmlInput_LabelledBy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HtmlDocFactory getHtmlDocFactory();

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
		 * The meta object literal for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.DifiFormImpl <em>Difi Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.DifiFormImpl
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getDifiForm()
		 * @generated
		 */
		EClass DIFI_FORM = eINSTANCE.getDifiForm();

		/**
		 * The meta object literal for the '<em><b>Skjema ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFI_FORM__SKJEMA_ID = eINSTANCE.getDifiForm_SkjemaID();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFI_FORM__STEPS = eINSTANCE.getDifiForm_Steps();

		/**
		 * The meta object literal for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.FormStepImpl <em>Form Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.FormStepImpl
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getFormStep()
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
		 * The meta object literal for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlElementImpl <em>Html Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlElementImpl
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getHtmlElement()
		 * @generated
		 */
		EClass HTML_ELEMENT = eINSTANCE.getHtmlElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__ID = eINSTANCE.getHtmlElement_ID();

		/**
		 * The meta object literal for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlLabelImpl <em>Html Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlLabelImpl
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getHtmlLabel()
		 * @generated
		 */
		EClass HTML_LABEL = eINSTANCE.getHtmlLabel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_LABEL__VALUE = eINSTANCE.getHtmlLabel_Value();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_LABEL__FOR = eINSTANCE.getHtmlLabel_For();

		/**
		 * The meta object literal for the '{@link no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlInputImpl <em>Html Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlInputImpl
		 * @see no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocPackageImpl#getHtmlInput()
		 * @generated
		 */
		EClass HTML_INPUT = eINSTANCE.getHtmlInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_INPUT__TYPE = eINSTANCE.getHtmlInput_Type();

		/**
		 * The meta object literal for the '<em><b>Labelled By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_INPUT__LABELLED_BY = eINSTANCE.getHtmlInput_LabelledBy();

	}

} //HtmlDocPackage
