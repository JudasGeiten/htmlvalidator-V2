/**
 */
package model.impl;

import java.util.Collection;

import model.CssStyle;
import model.FormElement;
import model.FormStep;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.FormStepImpl#getStepTitle <em>Step Title</em>}</li>
 *   <li>{@link model.impl.FormStepImpl#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link model.impl.FormStepImpl#getStepStyle <em>Step Style</em>}</li>
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
	protected EList<FormElement> formElements;

	/**
	 * The cached value of the '{@link #getStepStyle() <em>Step Style</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<CssStyle> stepStyle;

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
		return ModelPackage.Literals.FORM_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORM_STEP__STEP_TITLE, oldStepTitle, stepTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormElement> getFormElements() {
		if (formElements == null) {
			formElements = new EObjectContainmentEList<FormElement>(FormElement.class, this, ModelPackage.FORM_STEP__FORM_ELEMENTS);
		}
		return formElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CssStyle> getStepStyle() {
		if (stepStyle == null) {
			stepStyle = new EObjectResolvingEList<CssStyle>(CssStyle.class, this, ModelPackage.FORM_STEP__STEP_STYLE);
		}
		return stepStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FORM_STEP__FORM_ELEMENTS:
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
			case ModelPackage.FORM_STEP__STEP_TITLE:
				return getStepTitle();
			case ModelPackage.FORM_STEP__FORM_ELEMENTS:
				return getFormElements();
			case ModelPackage.FORM_STEP__STEP_STYLE:
				return getStepStyle();
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
			case ModelPackage.FORM_STEP__STEP_TITLE:
				setStepTitle((String)newValue);
				return;
			case ModelPackage.FORM_STEP__FORM_ELEMENTS:
				getFormElements().clear();
				getFormElements().addAll((Collection<? extends FormElement>)newValue);
				return;
			case ModelPackage.FORM_STEP__STEP_STYLE:
				getStepStyle().clear();
				getStepStyle().addAll((Collection<? extends CssStyle>)newValue);
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
			case ModelPackage.FORM_STEP__STEP_TITLE:
				setStepTitle(STEP_TITLE_EDEFAULT);
				return;
			case ModelPackage.FORM_STEP__FORM_ELEMENTS:
				getFormElements().clear();
				return;
			case ModelPackage.FORM_STEP__STEP_STYLE:
				getStepStyle().clear();
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
			case ModelPackage.FORM_STEP__STEP_TITLE:
				return STEP_TITLE_EDEFAULT == null ? stepTitle != null : !STEP_TITLE_EDEFAULT.equals(stepTitle);
			case ModelPackage.FORM_STEP__FORM_ELEMENTS:
				return formElements != null && !formElements.isEmpty();
			case ModelPackage.FORM_STEP__STEP_STYLE:
				return stepStyle != null && !stepStyle.isEmpty();
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
