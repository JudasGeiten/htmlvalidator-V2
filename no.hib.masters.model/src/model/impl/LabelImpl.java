/**
 */
package model.impl;

import model.Input;
import model.Label;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.LabelImpl#getValue <em>Value</em>}</li>
 *   <li>{@link model.impl.LabelImpl#getFor <em>For</em>}</li>
 *   <li>{@link model.impl.LabelImpl#getConstrastRatio <em>Constrast Ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends FormElementImpl implements Label {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected Input for_;

	/**
	 * The default value of the '{@link #getConstrastRatio() <em>Constrast Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrastRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSTRAST_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConstrastRatio() <em>Constrast Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrastRatio()
	 * @generated
	 * @ordered
	 */
	protected double constrastRatio = CONSTRAST_RATIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LABEL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getFor() {
		if (for_ != null && for_.eIsProxy()) {
			InternalEObject oldFor = (InternalEObject)for_;
			for_ = (Input)eResolveProxy(oldFor);
			if (for_ != oldFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.LABEL__FOR, oldFor, for_));
			}
		}
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(Input newFor, NotificationChain msgs) {
		Input oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.LABEL__FOR, oldFor, newFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(Input newFor) {
		if (newFor != for_) {
			NotificationChain msgs = null;
			if (for_ != null)
				msgs = ((InternalEObject)for_).eInverseRemove(this, ModelPackage.INPUT__LABELLED_BY, Input.class, msgs);
			if (newFor != null)
				msgs = ((InternalEObject)newFor).eInverseAdd(this, ModelPackage.INPUT__LABELLED_BY, Input.class, msgs);
			msgs = basicSetFor(newFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LABEL__FOR, newFor, newFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConstrastRatio() {
		return constrastRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrastRatio(double newConstrastRatio) {
		double oldConstrastRatio = constrastRatio;
		constrastRatio = newConstrastRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LABEL__CONSTRAST_RATIO, oldConstrastRatio, constrastRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LABEL__FOR:
				if (for_ != null)
					msgs = ((InternalEObject)for_).eInverseRemove(this, ModelPackage.INPUT__LABELLED_BY, Input.class, msgs);
				return basicSetFor((Input)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LABEL__FOR:
				return basicSetFor(null, msgs);
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
			case ModelPackage.LABEL__VALUE:
				return getValue();
			case ModelPackage.LABEL__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case ModelPackage.LABEL__CONSTRAST_RATIO:
				return getConstrastRatio();
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
			case ModelPackage.LABEL__VALUE:
				setValue((String)newValue);
				return;
			case ModelPackage.LABEL__FOR:
				setFor((Input)newValue);
				return;
			case ModelPackage.LABEL__CONSTRAST_RATIO:
				setConstrastRatio((Double)newValue);
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
			case ModelPackage.LABEL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModelPackage.LABEL__FOR:
				setFor((Input)null);
				return;
			case ModelPackage.LABEL__CONSTRAST_RATIO:
				setConstrastRatio(CONSTRAST_RATIO_EDEFAULT);
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
			case ModelPackage.LABEL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ModelPackage.LABEL__FOR:
				return for_ != null;
			case ModelPackage.LABEL__CONSTRAST_RATIO:
				return constrastRatio != CONSTRAST_RATIO_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", constrastRatio: ");
		result.append(constrastRatio);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
