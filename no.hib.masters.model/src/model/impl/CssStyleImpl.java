/**
 */
package model.impl;

import java.util.Collection;

import model.CssDeclaration;
import model.CssStyle;
import model.ModelPackage;

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
 * An implementation of the model object '<em><b>Css Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.CssStyleImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link model.impl.CssStyleImpl#getCssDeclarations <em>Css Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CssStyleImpl extends MinimalEObjectImpl.Container implements CssStyle {
	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected String selector = SELECTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCssDeclarations() <em>Css Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<CssDeclaration> cssDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CssStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CSS_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		String oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CSS_STYLE__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CssDeclaration> getCssDeclarations() {
		if (cssDeclarations == null) {
			cssDeclarations = new EObjectContainmentEList<CssDeclaration>(CssDeclaration.class, this, ModelPackage.CSS_STYLE__CSS_DECLARATIONS);
		}
		return cssDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CSS_STYLE__CSS_DECLARATIONS:
				return ((InternalEList<?>)getCssDeclarations()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.CSS_STYLE__SELECTOR:
				return getSelector();
			case ModelPackage.CSS_STYLE__CSS_DECLARATIONS:
				return getCssDeclarations();
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
			case ModelPackage.CSS_STYLE__SELECTOR:
				setSelector((String)newValue);
				return;
			case ModelPackage.CSS_STYLE__CSS_DECLARATIONS:
				getCssDeclarations().clear();
				getCssDeclarations().addAll((Collection<? extends CssDeclaration>)newValue);
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
			case ModelPackage.CSS_STYLE__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case ModelPackage.CSS_STYLE__CSS_DECLARATIONS:
				getCssDeclarations().clear();
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
			case ModelPackage.CSS_STYLE__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
			case ModelPackage.CSS_STYLE__CSS_DECLARATIONS:
				return cssDeclarations != null && !cssDeclarations.isEmpty();
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
		result.append(" (selector: ");
		result.append(selector);
		result.append(')');
		return result.toString();
	}

} //CssStyleImpl
