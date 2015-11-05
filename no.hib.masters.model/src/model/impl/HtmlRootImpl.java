/**
 */
package model.impl;

import java.util.Collection;

import model.CssStyle;
import model.FormStep;
import model.HtmlRoot;
import model.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Html Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.HtmlRootImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link model.impl.HtmlRootImpl#getCssStyles <em>Css Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HtmlRootImpl extends MinimalEObjectImpl.Container implements HtmlRoot {
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
	 * The cached value of the '{@link #getCssStyles() <em>Css Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<CssStyle> cssStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HtmlRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.HTML_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<FormStep>(FormStep.class, this, ModelPackage.HTML_ROOT__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CssStyle> getCssStyles() {
		if (cssStyles == null) {
			cssStyles = new EObjectContainmentEList<CssStyle>(CssStyle.class, this, ModelPackage.HTML_ROOT__CSS_STYLES);
		}
		return cssStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.HTML_ROOT__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case ModelPackage.HTML_ROOT__CSS_STYLES:
				return ((InternalEList<?>)getCssStyles()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.HTML_ROOT__STEPS:
				return getSteps();
			case ModelPackage.HTML_ROOT__CSS_STYLES:
				return getCssStyles();
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
			case ModelPackage.HTML_ROOT__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends FormStep>)newValue);
				return;
			case ModelPackage.HTML_ROOT__CSS_STYLES:
				getCssStyles().clear();
				getCssStyles().addAll((Collection<? extends CssStyle>)newValue);
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
			case ModelPackage.HTML_ROOT__STEPS:
				getSteps().clear();
				return;
			case ModelPackage.HTML_ROOT__CSS_STYLES:
				getCssStyles().clear();
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
			case ModelPackage.HTML_ROOT__STEPS:
				return steps != null && !steps.isEmpty();
			case ModelPackage.HTML_ROOT__CSS_STYLES:
				return cssStyles != null && !cssStyles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HtmlRootImpl
