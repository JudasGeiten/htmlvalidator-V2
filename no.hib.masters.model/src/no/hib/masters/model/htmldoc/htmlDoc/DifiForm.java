/**
 */
package no.hib.masters.model.htmldoc.htmlDoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Difi Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.DifiForm#getSkjemaID <em>Skjema ID</em>}</li>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.DifiForm#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getDifiForm()
 * @model
 * @generated
 */
public interface DifiForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Skjema ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skjema ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skjema ID</em>' attribute.
	 * @see #setSkjemaID(String)
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getDifiForm_SkjemaID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getSkjemaID();

	/**
	 * Sets the value of the '{@link no.hib.masters.model.htmldoc.htmlDoc.DifiForm#getSkjemaID <em>Skjema ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skjema ID</em>' attribute.
	 * @see #getSkjemaID()
	 * @generated
	 */
	void setSkjemaID(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link no.hib.masters.model.htmldoc.htmlDoc.FormStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getDifiForm_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FormStep> getSteps();

} // DifiForm
