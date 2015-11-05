/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Input#getType <em>Type</em>}</li>
 *   <li>{@link model.Input#getLabelledBy <em>Labelled By</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends FormElement {
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
	 * @see model.ModelPackage#getInput_Type()
	 * @model default="text" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link model.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Labelled By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.Label#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labelled By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelled By</em>' reference.
	 * @see #setLabelledBy(Label)
	 * @see model.ModelPackage#getInput_LabelledBy()
	 * @see model.Label#getFor
	 * @model opposite="for" required="true"
	 * @generated
	 */
	Label getLabelledBy();

	/**
	 * Sets the value of the '{@link model.Input#getLabelledBy <em>Labelled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labelled By</em>' reference.
	 * @see #getLabelledBy()
	 * @generated
	 */
	void setLabelledBy(Label value);

} // Input
