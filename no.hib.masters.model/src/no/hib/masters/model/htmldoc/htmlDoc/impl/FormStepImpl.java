/**
 */
package no.hib.masters.model.htmldoc.htmlDoc.impl;

import java.util.Collection;

import no.hib.masters.model.htmldoc.htmlDoc.FormStep;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.impl.FormStepImpl#getStepTitle <em>Step Title</em>}</li>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.impl.FormStepImpl#getFormElements <em>Form Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormStepImpl extends MinimalEObjectImpl.Container implements FormStep {
	/**
	 * The default value of the '{@link #getStepTitle() <em>Step Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepTitle() <em>Step Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepTitle()
	 * @generated
	 * @ordered
	 */
	protected String stepTitle = STEP_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormElements() <em>Form Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HtmlElement> formElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlDocPackage.Literals.FORM_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStepTitle() {
		return stepTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepTitle(String newStepTitle) {
		String oldStepTitle = stepTitle;
		stepTitle = newStepTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlDocPackage.FORM_STEP__STEP_TITLE, oldStepTitle, stepTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HtmlElement> getFormElements() {
		if (formElements == null) {
			formElements = new EObjectContainmentEList<HtmlElement>(HtmlElement.class, this, HtmlDocPackage.FORM_STEP__FORM_ELEMENTS);
		}
		return formElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlDocPackage.FORM_STEP__FORM_ELEMENTS:
				return ((InternalEList<?>)getFormElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlDocPackage.FORM_STEP__STEP_TITLE:
				return getStepTitle();
			case HtmlDocPackage.FORM_STEP__FORM_ELEMENTS:
				return getFormElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HtmlDocPackage.FORM_STEP__STEP_TITLE:
				setStepTitle((String)newValue);
				return;
			case HtmlDocPackage.FORM_STEP__FORM_ELEMENTS:
				getFormElements().clear();
				getFormElements().addAll((Collection<? extends HtmlElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HtmlDocPackage.FORM_STEP__STEP_TITLE:
				setStepTitle(STEP_TITLE_EDEFAULT);
				return;
			case HtmlDocPackage.FORM_STEP__FORM_ELEMENTS:
				getFormElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HtmlDocPackage.FORM_STEP__STEP_TITLE:
				return STEP_TITLE_EDEFAULT == null ? stepTitle != null : !STEP_TITLE_EDEFAULT.equals(stepTitle);
			case HtmlDocPackage.FORM_STEP__FORM_ELEMENTS:
				return formElements != null && !formElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stepTitle: ");
		result.append(stepTitle);
		result.append(')');
		return result.toString();
	}

} //FormStepImpl
