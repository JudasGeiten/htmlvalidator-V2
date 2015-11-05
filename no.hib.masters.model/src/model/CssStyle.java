/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Css Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.CssStyle#getSelector <em>Selector</em>}</li>
 *   <li>{@link model.CssStyle#getCssDeclarations <em>Css Declarations</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getCssStyle()
 * @model
 * @generated
 */
public interface CssStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see model.ModelPackage#getCssStyle_Selector()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link model.CssStyle#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Css Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link model.CssDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css Declarations</em>' containment reference list.
	 * @see model.ModelPackage#getCssStyle_CssDeclarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CssDeclaration> getCssDeclarations();

} // CssStyle
