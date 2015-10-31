/**
 */
package no.hib.masters.model.htmldoc.htmlDoc.impl;

import java.util.Collection;

import no.hib.masters.model.htmldoc.htmlDoc.DifiForm;
import no.hib.masters.model.htmldoc.htmlDoc.FormStep;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage;

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
 * An implementation of the model object '<em><b>Difi Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.impl.DifiFormImpl#getSkjemaID <em>Skjema ID</em>}</li>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.impl.DifiFormImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DifiFormImpl extends MinimalEObjectImpl.Container implements DifiForm {
	/**
	 * The default value of the '{@link #getSkjemaID() <em>Skjema ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkjemaID()
	 * @generated
	 * @ordered
	 */
	protected static final String SKJEMA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkjemaID() <em>Skjema ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkjemaID()
	 * @generated
	 * @ordered
	 */
	protected String skjemaID = SKJEMA_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<FormStep> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifiFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlDocPackage.Literals.DIFI_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkjemaID() {
		return skjemaID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkjemaID(String newSkjemaID) {
		String oldSkjemaID = skjemaID;
		skjemaID = newSkjemaID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlDocPackage.DIFI_FORM__SKJEMA_ID, oldSkjemaID, skjemaID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<FormStep>(FormStep.class, this, HtmlDocPackage.DIFI_FORM__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlDocPackage.DIFI_FORM__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case HtmlDocPackage.DIFI_FORM__SKJEMA_ID:
				return getSkjemaID();
			case HtmlDocPackage.DIFI_FORM__STEPS:
				return getSteps();
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
			case HtmlDocPackage.DIFI_FORM__SKJEMA_ID:
				setSkjemaID((String)newValue);
				return;
			case HtmlDocPackage.DIFI_FORM__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends FormStep>)newValue);
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
			case HtmlDocPackage.DIFI_FORM__SKJEMA_ID:
				setSkjemaID(SKJEMA_ID_EDEFAULT);
				return;
			case HtmlDocPackage.DIFI_FORM__STEPS:
				getSteps().clear();
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
			case HtmlDocPackage.DIFI_FORM__SKJEMA_ID:
				return SKJEMA_ID_EDEFAULT == null ? skjemaID != null : !SKJEMA_ID_EDEFAULT.equals(skjemaID);
			case HtmlDocPackage.DIFI_FORM__STEPS:
				return steps != null && !steps.isEmpty();
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
		result.append(" (SkjemaID: ");
		result.append(skjemaID);
		result.append(')');
		return result.toString();
	}

} //DifiFormImpl
