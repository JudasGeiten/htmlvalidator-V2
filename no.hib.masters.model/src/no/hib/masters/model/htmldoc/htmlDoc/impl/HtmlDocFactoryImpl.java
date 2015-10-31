/**
 */
package no.hib.masters.model.htmldoc.htmlDoc.impl;

import no.hib.masters.model.htmldoc.htmlDoc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmlDocFactoryImpl extends EFactoryImpl implements HtmlDocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HtmlDocFactory init() {
		try {
			HtmlDocFactory theHtmlDocFactory = (HtmlDocFactory)EPackage.Registry.INSTANCE.getEFactory(HtmlDocPackage.eNS_URI);
			if (theHtmlDocFactory != null) {
				return theHtmlDocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HtmlDocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlDocFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HtmlDocPackage.DIFI_FORM: return createDifiForm();
			case HtmlDocPackage.FORM_STEP: return createFormStep();
			case HtmlDocPackage.HTML_LABEL: return createHtmlLabel();
			case HtmlDocPackage.HTML_INPUT: return createHtmlInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifiForm createDifiForm() {
		DifiFormImpl difiForm = new DifiFormImpl();
		return difiForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormStep createFormStep() {
		FormStepImpl formStep = new FormStepImpl();
		return formStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlLabel createHtmlLabel() {
		HtmlLabelImpl htmlLabel = new HtmlLabelImpl();
		return htmlLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlInput createHtmlInput() {
		HtmlInputImpl htmlInput = new HtmlInputImpl();
		return htmlInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlDocPackage getHtmlDocPackage() {
		return (HtmlDocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HtmlDocPackage getPackage() {
		return HtmlDocPackage.eINSTANCE;
	}

} //HtmlDocFactoryImpl
