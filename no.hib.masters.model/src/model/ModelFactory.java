/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Html Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Html Root</em>'.
	 * @generated
	 */
	HtmlRoot createHtmlRoot();

	/**
	 * Returns a new object of class '<em>Form Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Step</em>'.
	 * @generated
	 */
	FormStep createFormStep();

	/**
	 * Returns a new object of class '<em>label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>label</em>'.
	 * @generated
	 */
	label createlabel();

	/**
	 * Returns a new object of class '<em>input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>input</em>'.
	 * @generated
	 */
	input createinput();

	/**
	 * Returns a new object of class '<em>Css Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Css Style</em>'.
	 * @generated
	 */
	CssStyle createCssStyle();

	/**
	 * Returns a new object of class '<em>Css Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Css Declaration</em>'.
	 * @generated
	 */
	CssDeclaration createCssDeclaration();

	/**
	 * Returns a new object of class '<em>img</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>img</em>'.
	 * @generated
	 */
	img createimg();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
