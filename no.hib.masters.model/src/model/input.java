/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.input#getType <em>Type</em>}</li>
 *   <li>{@link model.input#getLabelledBy <em>Labelled By</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getinput()
 * @model
 * @generated
 */
public interface input extends FormElement {
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
	 * @see model.ModelPackage#getinput_Type()
	 * @model default="text" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link model.input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Labelled By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.label#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labelled By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelled By</em>' reference.
	 * @see #setLabelledBy(label)
	 * @see model.ModelPackage#getinput_LabelledBy()
	 * @see model.label#getFor
	 * @model opposite="for" required="true"
	 * @generated
	 */
	label getLabelledBy();

	/**
	 * Sets the value of the '{@link model.input#getLabelledBy <em>Labelled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labelled By</em>' reference.
	 * @see #getLabelledBy()
	 * @generated
	 */
	void setLabelledBy(label value);

} // input
