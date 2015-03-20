/**
 */
package editeurcircuit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link editeurcircuit.Circuit#isValide <em>Valide</em>}</li>
 *   <li>{@link editeurcircuit.Circuit#isSauvegarder <em>Sauvegarder</em>}</li>
 *   <li>{@link editeurcircuit.Circuit#getEstDefinitPar <em>Est Definit Par</em>}</li>
 *   <li>{@link editeurcircuit.Circuit#getEstCompose <em>Est Compose</em>}</li>
 *   <li>{@link editeurcircuit.Circuit#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see editeurcircuit.EditeurcircuitPackage#getCircuit()
 * @model
 * @generated
 */
public interface Circuit extends EObject {
	/**
	 * Returns the value of the '<em><b>Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valide</em>' attribute.
	 * @see #setValide(boolean)
	 * @see editeurcircuit.EditeurcircuitPackage#getCircuit_Valide()
	 * @model
	 * @generated
	 */
	boolean isValide();

	/**
	 * Sets the value of the '{@link editeurcircuit.Circuit#isValide <em>Valide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valide</em>' attribute.
	 * @see #isValide()
	 * @generated
	 */
	void setValide(boolean value);

	/**
	 * Returns the value of the '<em><b>Sauvegarder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sauvegarder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sauvegarder</em>' attribute.
	 * @see #setSauvegarder(boolean)
	 * @see editeurcircuit.EditeurcircuitPackage#getCircuit_Sauvegarder()
	 * @model
	 * @generated
	 */
	boolean isSauvegarder();

	/**
	 * Sets the value of the '{@link editeurcircuit.Circuit#isSauvegarder <em>Sauvegarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sauvegarder</em>' attribute.
	 * @see #isSauvegarder()
	 * @generated
	 */
	void setSauvegarder(boolean value);

	/**
	 * Returns the value of the '<em><b>Est Definit Par</b></em>' containment reference list.
	 * The list contents are of type {@link editeurcircuit.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Definit Par</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Definit Par</em>' containment reference list.
	 * @see editeurcircuit.EditeurcircuitPackage#getCircuit_EstDefinitPar()
	 * @model containment="true" upper="10"
	 * @generated
	 */
	EList<Signal> getEstDefinitPar();

	/**
	 * Returns the value of the '<em><b>Est Compose</b></em>' containment reference list.
	 * The list contents are of type {@link editeurcircuit.Porte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Compose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Compose</em>' containment reference list.
	 * @see editeurcircuit.EditeurcircuitPackage#getCircuit_EstCompose()
	 * @model containment="true" upper="50"
	 * @generated
	 */
	EList<Porte> getEstCompose();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see editeurcircuit.EditeurcircuitPackage#getCircuit_ID()
	 * @model id="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link editeurcircuit.Circuit#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AjouterPorte(TypePorte p_typePorte);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Valider();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SupprimerPorte(int p_ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AjouterSignal(TypeSignal p_typeSignal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SupprimerSignal(int p_ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Sauvegarder();

} // Circuit
