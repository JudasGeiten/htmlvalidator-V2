/**
 */
package no.hib.masters.model.htmldoc.htmlDoc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel#getValue <em>Value</em>}</li>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel#getFor <em>For</em>}</li>
 * </ul>
 *
 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getHtmlLabel()
 * @model
 * @generated
 */
public interface HtmlLabel extends HtmlElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getHtmlLabel_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(HtmlInput)
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getHtmlLabel_For()
	 * @model required="true"
	 * @generated
	 */
	HtmlInput getFor();

	/**
	 * Sets the value of the '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlLabel#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(HtmlInput value);

} // HtmlLabel
