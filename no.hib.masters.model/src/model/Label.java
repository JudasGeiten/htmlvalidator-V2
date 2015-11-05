/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Label#getValue <em>Value</em>}</li>
 *   <li>{@link model.Label#getFor <em>For</em>}</li>
 *   <li>{@link model.Label#getConstrastRatio <em>Constrast Ratio</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getLabel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot null='constrastRatio >= 7'"
 * @generated
 */
public interface Label extends FormElement {
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
	 * @see model.ModelPackage#getLabel_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link model.Label#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.Input#getLabelledBy <em>Labelled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' reference.
	 * @see #setFor(Input)
	 * @see model.ModelPackage#getLabel_For()
	 * @see model.Input#getLabelledBy
	 * @model opposite="labelledBy" required="true"
	 * @generated
	 */
	Input getFor();

	/**
	 * Sets the value of the '{@link model.Label#getFor <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(Input value);

	/**
	 * Returns the value of the '<em><b>Constrast Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrast Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrast Ratio</em>' attribute.
	 * @see #setConstrastRatio(double)
	 * @see model.ModelPackage#getLabel_ConstrastRatio()
	 * @model
	 * @generated
	 */
	double getConstrastRatio();

	/**
	 * Sets the value of the '{@link model.Label#getConstrastRatio <em>Constrast Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrast Ratio</em>' attribute.
	 * @see #getConstrastRatio()
	 * @generated
	 */
	void setConstrastRatio(double value);

} // Label
