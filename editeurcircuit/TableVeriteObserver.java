/**
 */
package editeurcircuit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Verite Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link editeurcircuit.TableVeriteObserver#getListe <em>Liste</em>}</li>
 * </ul>
 * </p>
 *
 * @see editeurcircuit.EditeurcircuitPackage#getTableVeriteObserver()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TableVeriteObserver extends EObject {
	/**
	 * Returns the value of the '<em><b>Liste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste</em>' attribute.
	 * @see #setListe(EList)
	 * @see editeurcircuit.EditeurcircuitPackage#getTableVeriteObserver_Liste()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList getListe();

	/**
	 * Sets the value of the '{@link editeurcircuit.TableVeriteObserver#getListe <em>Liste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liste</em>' attribute.
	 * @see #getListe()
	 * @generated
	 */
	void setListe(EList value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void attacher();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void detacher();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void notifier();

} // TableVeriteObserver
