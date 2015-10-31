/**
 */
package no.hib.masters.model.htmldoc.htmlDoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.FormStep#getStepTitle <em>Step Title</em>}</li>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.FormStep#getFormElements <em>Form Elements</em>}</li>
 * </ul>
 *
 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getFormStep()
 * @model
 * @generated
 */
public interface FormStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Title</em>' attribute.
	 * @see #setStepTitle(String)
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getFormStep_StepTitle()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getStepTitle();

	/**
	 * Sets the value of the '{@link no.hib.masters.model.htmldoc.htmlDoc.FormStep#getStepTitle <em>Step Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Title</em>' attribute.
	 * @see #getStepTitle()
	 * @generated
	 */
	void setStepTitle(String value);

	/**
	 * Returns the value of the '<em><b>Form Elements</b></em>' containment reference list.
	 * The list contents are of type {@link no.hib.masters.model.htmldoc.htmlDoc.HtmlElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Elements</em>' containment reference list.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getFormStep_FormElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<HtmlElement> getFormElements();

} // FormStep
