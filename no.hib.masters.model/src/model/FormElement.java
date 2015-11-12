/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.FormElement#getElementStyle <em>Element Style</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getFormElement()
 * @model abstract="true"
 * @generated
 */
public interface FormElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Style</b></em>' reference list.
	 * The list contents are of type {@link model.CssStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Style</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Style</em>' reference list.
	 * @see model.ModelPackage#getFormElement_ElementStyle()
	 * @model
	 * @generated
	 */
	EList<CssStyle> getElementStyle();

} // FormElement
