/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.HtmlRoot#getSteps <em>Steps</em>}</li>
 *   <li>{@link model.HtmlRoot#getCssStyles <em>Css Styles</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getHtmlRoot()
 * @model
 * @generated
 */
public interface HtmlRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link model.FormStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see model.ModelPackage#getHtmlRoot_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FormStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Css Styles</b></em>' containment reference list.
	 * The list contents are of type {@link model.CssStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css Styles</em>' containment reference list.
	 * @see model.ModelPackage#getHtmlRoot_CssStyles()
	 * @model containment="true"
	 * @generated
	 */
	EList<CssStyle> getCssStyles();

} // HtmlRoot
