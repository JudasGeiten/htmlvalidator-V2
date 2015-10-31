/**
 */
package no.hib.masters.model.htmldoc.htmlDoc.util;

import no.hib.masters.model.htmldoc.htmlDoc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage
 * @generated
 */
public class HtmlDocAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HtmlDocPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlDocAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HtmlDocPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HtmlDocSwitch<Adapter> modelSwitch =
		new HtmlDocSwitch<Adapter>() {
			@Override
			public Adapter caseDifiForm(DifiForm object) {
				return createDifiFormAdapter();
			}
			@Override
			public Adapter caseFormStep(FormStep object) {
				return createFormStepAdapter();
			}
			@Override
			public Adapter caseHtmlElement(HtmlElement object) {
				return createHtmlElementAdapter();
			}
			@Override
			public Adapter caseHtmlLabel(HtmlLabel object) {
				return createHtmlLabelAdapter();
			}
			@Override
			public Adapter caseHtmlInput(HtmlInput object) {
				return createHtmlInputAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hib.masters.model.htmldoc.htmlDoc.DifiForm <em>Difi Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.DifiForm
	 * @generated
	 */
	public Adapter createDifiFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hib.masters.model.htmldoc.htmlDoc.FormStep <em>Form Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.FormStep
	 * @generated
	 */
	public Adapter createFormStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlElement <em>Html Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlElement
	 * @generated
	 */
	public Adapter createHtmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel <em>Html Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel
	 * @generated
	 */
	public Adapter createHtmlLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlInput <em>Html Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlInput
	 * @generated
	 */
	public Adapter createHtmlInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HtmlDocAdapterFactory
