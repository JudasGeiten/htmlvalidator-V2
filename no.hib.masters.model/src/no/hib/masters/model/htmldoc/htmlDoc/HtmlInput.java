/**
 */
package no.hib.masters.model.htmldoc.htmlDoc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlInput#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getHtmlInput()
 * @model
 * @generated
 */
public interface HtmlInput extends HtmlElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"text"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage#getHtmlInput_Type()
	 * @model default="text" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link no.hib.masters.model.htmldoc.htmlDoc.HtmlInput#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // HtmlInput