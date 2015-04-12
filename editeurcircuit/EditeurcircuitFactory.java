/**
 */
package editeurcircuit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see editeurcircuit.EditeurcircuitPackage
 * @generated
 */
public interface EditeurcircuitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditeurcircuitFactory eINSTANCE = editeurcircuit.impl.EditeurcircuitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit</em>'.
	 * @generated
	 */
	Circuit createCircuit();

	/**
	 * Returns a new object of class '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal</em>'.
	 * @generated
	 */
	Signal createSignal();

	/**
	 * Returns a new object of class '<em>Porte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte</em>'.
	 * @generated
	 */
	Porte createPorte();

	/**
	 * Returns a new object of class '<em>Porte AND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte AND</em>'.
	 * @generated
	 */
	Porte_AND createPorte_AND();

	/**
	 * Returns a new object of class '<em>Porte OR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte OR</em>'.
	 * @generated
	 */
	Porte_OR createPorte_OR();

	/**
	 * Returns a new object of class '<em>Porte NOT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte NOT</em>'.
	 * @generated
	 */
	Porte_NOT createPorte_NOT();

	/**
	 * Returns a new object of class '<em>Table Verite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Verite</em>'.
	 * @generated
	 */
	TableVerite createTableVerite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EditeurcircuitPackage getEditeurcircuitPackage();

} //EditeurcircuitFactory
