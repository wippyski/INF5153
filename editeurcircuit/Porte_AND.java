/**
 */
package editeurcircuit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Porte AND</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link editeurcircuit.Porte_AND#getEntree2 <em>Entree2</em>}</li>
 *   <li>{@link editeurcircuit.Porte_AND#getEntree1 <em>Entree1</em>}</li>
 *   <li>{@link editeurcircuit.Porte_AND#getSortie1 <em>Sortie1</em>}</li>
 * </ul>
 * </p>
 *
 * @see editeurcircuit.EditeurcircuitPackage#getPorte_AND()
 * @model
 * @generated
 */
public interface Porte_AND extends Porte {
	/**
	 * Returns the value of the '<em><b>Entree1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entree1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree1</em>' attribute.
	 * @see #setEntree1(int)
	 * @see editeurcircuit.EditeurcircuitPackage#getPorte_AND_Entree1()
	 * @model
	 * @generated
	 */
	int getEntree1();

	/**
	 * Sets the value of the '{@link editeurcircuit.Porte_AND#getEntree1 <em>Entree1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree1</em>' attribute.
	 * @see #getEntree1()
	 * @generated
	 */
	void setEntree1(int value);

	/**
	 * Returns the value of the '<em><b>Entree2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entree2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree2</em>' attribute.
	 * @see #setEntree2(int)
	 * @see editeurcircuit.EditeurcircuitPackage#getPorte_AND_Entree2()
	 * @model
	 * @generated
	 */
	int getEntree2();

	/**
	 * Sets the value of the '{@link editeurcircuit.Porte_AND#getEntree2 <em>Entree2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree2</em>' attribute.
	 * @see #getEntree2()
	 * @generated
	 */
	void setEntree2(int value);

	/**
	 * Returns the value of the '<em><b>Sortie1</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortie1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie1</em>' attribute.
	 * @see #setSortie1(int)
	 * @see editeurcircuit.EditeurcircuitPackage#getPorte_AND_Sortie1()
	 * @model default="0"
	 * @generated
	 */
	int getSortie1();

	/**
	 * Sets the value of the '{@link editeurcircuit.Porte_AND#getSortie1 <em>Sortie1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie1</em>' attribute.
	 * @see #getSortie1()
	 * @generated
	 */
	void setSortie1(int value);

} // Porte_AND
