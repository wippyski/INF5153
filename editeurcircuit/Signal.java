/**
 */
package editeurcircuit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link editeurcircuit.Signal#getID <em>ID</em>}</li>
 *   <li>{@link editeurcircuit.Signal#getType <em>Type</em>}</li>
 *   <li>{@link editeurcircuit.Signal#getNom <em>Nom</em>}</li>
 *   <li>{@link editeurcircuit.Signal#getLien <em>Lien</em>}</li>
 * </ul>
 * </p>
 *
 * @see editeurcircuit.EditeurcircuitPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject {
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
	 * @see editeurcircuit.EditeurcircuitPackage#getSignal_ID()
	 * @model id="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link editeurcircuit.Signal#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link editeurcircuit.TypeSignal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see editeurcircuit.TypeSignal
	 * @see #setType(TypeSignal)
	 * @see editeurcircuit.EditeurcircuitPackage#getSignal_Type()
	 * @model
	 * @generated
	 */
	TypeSignal getType();

	/**
	 * Sets the value of the '{@link editeurcircuit.Signal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see editeurcircuit.TypeSignal
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeSignal value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see editeurcircuit.EditeurcircuitPackage#getSignal_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link editeurcircuit.Signal#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' attribute.
	 * @see #setLien(int)
	 * @see editeurcircuit.EditeurcircuitPackage#getSignal_Lien()
	 * @model
	 * @generated
	 */
	int getLien();

	/**
	 * Sets the value of the '{@link editeurcircuit.Signal#getLien <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien</em>' attribute.
	 * @see #getLien()
	 * @generated
	 */
	void setLien(int value);

} // Signal
