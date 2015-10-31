/**
 */
package no.hib.masters.model.htmldoc.htmlDoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hib.masters.model.htmldoc.htmlDoc.HtmlDocPackage
 * @generated
 */
public interface HtmlDocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HtmlDocFactory eINSTANCE = no.hib.masters.model.htmldoc.htmlDoc.impl.HtmlDocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Difi Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Difi Form</em>'.
	 * @generated
	 */
	DifiForm createDifiForm();

	/**
	 * Returns a new object of class '<em>Form Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Step</em>'.
	 * @generated
	 */
	FormStep createFormStep();

	/**
	 * Returns a new object of class '<em>Html Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Html Label</em>'.
	 * @generated
	 */
	HtmlLabel createHtmlLabel();

	/**
	 * Returns a new object of class '<em>Html Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Html Input</em>'.
	 * @generated
	 */
	HtmlInput createHtmlInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HtmlDocPackage getHtmlDocPackage();

} //HtmlDocFactory
