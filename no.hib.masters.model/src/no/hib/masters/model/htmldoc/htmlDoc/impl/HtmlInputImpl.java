/**
 */
package no.hib.masters.model.htmldoc.htmlDoc.impl;

import no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage;
import no.hib.masters.model.htmldoc.htmlDoc.HtmlInput;

import no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Html Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlInputImpl#getType <em>Type</em>}</li>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlInputImpl#getLabelledBy <em>Labelled By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HtmlInputImpl extends HtmlElementImpl implements HtmlInput {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "text";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabelledBy() <em>Labelled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelledBy()
	 * @generated
	 * @ordered
	 */
	protected HtmlLabel labelledBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HtmlInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlDocPackage.Literals.HTML_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlDocPackage.HTML_INPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlLabel getLabelledBy() {
		if (labelledBy != null && labelledBy.eIsProxy()) {
			InternalEObject oldLabelledBy = (InternalEObject)labelledBy;
			labelledBy = (HtmlLabel)eResolveProxy(oldLabelledBy);
			if (labelledBy != oldLabelledBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HtmlDocPackage.HTML_INPUT__LABELLED_BY, oldLabelledBy, labelledBy));
			}
		}
		return labelledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlLabel basicGetLabelledBy() {
		return labelledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelledBy(HtmlLabel newLabelledBy) {
		HtmlLabel oldLabelledBy = labelledBy;
		labelledBy = newLabelledBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlDocPackage.HTML_INPUT__LABELLED_BY, oldLabelledBy, labelledBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlDocPackage.HTML_INPUT__TYPE:
				return getType();
			case HtmlDocPackage.HTML_INPUT__LABELLED_BY:
				if (resolve) return getLabelledBy();
				return basicGetLabelledBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HtmlDocPackage.HTML_INPUT__TYPE:
				setType((String)newValue);
				return;
			case HtmlDocPackage.HTML_INPUT__LABELLED_BY:
				setLabelledBy((HtmlLabel)newValue);
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
			case HtmlDocPackage.HTML_INPUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HtmlDocPackage.HTML_INPUT__LABELLED_BY:
				setLabelledBy((HtmlLabel)null);
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
			case HtmlDocPackage.HTML_INPUT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case HtmlDocPackage.HTML_INPUT__LABELLED_BY:
				return labelledBy != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //HtmlInputImpl
