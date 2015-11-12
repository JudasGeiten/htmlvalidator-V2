/**
 */
package model.impl;

import java.util.Collection;

import model.CssStyle;
import model.FormElement;
import model.ModelPackage;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.FormElementImpl#getElementStyle <em>Element Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FormElementImpl extends MinimalEObjectImpl.Container implements FormElement {
	/**
	 * The cached value of the '{@link #getElementStyle() <em>Element Style</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<CssStyle> elementStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FORM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CssStyle> getElementStyle() {
		if (elementStyle == null) {
			elementStyle = new EObjectResolvingEList<CssStyle>(CssStyle.class, this, ModelPackage.FORM_ELEMENT__ELEMENT_STYLE);
		}
		return elementStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FORM_ELEMENT__ELEMENT_STYLE:
				return getElementStyle();
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
			case ModelPackage.FORM_ELEMENT__ELEMENT_STYLE:
				getElementStyle().clear();
				getElementStyle().addAll((Collection<? extends CssStyle>)newValue);
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
			case ModelPackage.FORM_ELEMENT__ELEMENT_STYLE:
				getElementStyle().clear();
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
			case ModelPackage.FORM_ELEMENT__ELEMENT_STYLE:
				return elementStyle != null && !elementStyle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormElementImpl
