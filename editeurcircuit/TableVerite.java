/**
 */
package editeurcircuit;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Verite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link editeurcircuit.TableVerite#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see editeurcircuit.EditeurcircuitPackage#getTableVerite()
 * @model
 * @generated
 */
public interface TableVerite extends TableVeriteObserver {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(Map)
	 * @see editeurcircuit.EditeurcircuitPackage#getTableVerite_Table()
	 * @model transient="true"
	 * @generated
	 */
	Map getTable();

	/**
	 * Sets the value of the '{@link editeurcircuit.TableVerite#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Map value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculer();

} // TableVerite
