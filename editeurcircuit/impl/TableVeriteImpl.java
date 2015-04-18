/**
 */
package editeurcircuit.impl;

import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Signal;
import editeurcircuit.TableVerite;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Verite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link editeurcircuit.impl.TableVeriteImpl#getListe <em>Liste</em>}</li>
 *   <li>{@link editeurcircuit.impl.TableVeriteImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableVeriteImpl extends MinimalEObjectImpl.Container implements TableVerite {
	/**
	 * The cached value of the '{@link #getListe() <em>Liste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListe()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayList<Boolean>> liste;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Map<Integer, ArrayList<Boolean>> table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableVeriteImpl() {
		super();
		liste = new EObjectContainmentEList<ArrayList<Boolean>>(ArrayList.class, this,
				EditeurcircuitPackage.TABLE_VERITE__LISTE);
		
		table = new TreeMap<Integer, ArrayList<Boolean>>(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditeurcircuitPackage.Literals.TABLE_VERITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getListe() {
		return liste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListe(EList newListe) {
		EList oldListe = liste;
		liste = newListe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.TABLE_VERITE__LISTE, oldListe, liste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Map newTable) {
		Map oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.TABLE_VERITE__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void attacher() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void detacher() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifier() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditeurcircuitPackage.TABLE_VERITE__LISTE:
				return getListe();
			case EditeurcircuitPackage.TABLE_VERITE__TABLE:
				return getTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EditeurcircuitPackage.TABLE_VERITE__LISTE:
				setListe((EList)newValue);
				return;
			case EditeurcircuitPackage.TABLE_VERITE__TABLE:
				setTable((Map)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EditeurcircuitPackage.TABLE_VERITE__LISTE:
				setListe((EList)null);
				return;
			case EditeurcircuitPackage.TABLE_VERITE__TABLE:
				setTable((Map)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EditeurcircuitPackage.TABLE_VERITE__LISTE:
				return liste != null;
			case EditeurcircuitPackage.TABLE_VERITE__TABLE:
				return table != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EditeurcircuitPackage.TABLE_VERITE___CALCULER:
				calculer();
				return null;
			case EditeurcircuitPackage.TABLE_VERITE___ATTACHER:
				attacher();
				return null;
			case EditeurcircuitPackage.TABLE_VERITE___DETACHER:
				detacher();
				return null;
			case EditeurcircuitPackage.TABLE_VERITE___NOTIFIER:
				notifier();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (liste: ");
		result.append(liste);
		result.append(", table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}
	
	//Construit la table
	public void construct(int nbEntre, int nbSortie){
		
		table.clear(); 
		
		int nbLines = (int) Math.pow(2, nbEntre);
		
		for(int i = 0; i < nbLines; ++i){
			
			table.put(i, new ArrayList<Boolean>());  
			
			for(int j = 0; j < nbEntre + nbSortie; ++j){
				table.get(i).add(false);
			}
		}
	
		

		
		setEntree(nbEntre, nbLines);
		
	}
	
	//Génère les valeurs par défaut dans la table 
	public void setEntree(int nbEntree, int nbLignes){
		
		for(int i = 0; i < nbLignes; ++i){
			
			String bin = Integer.toBinaryString(i);
			int k = bin.length() - 1; 
			
			for(int j = nbEntree - 1; j >= 0 ; --j){
				
				if(k < 0 ){
					break; 
				}
				
				if(bin.charAt(k) == '1'){
					table.get(i).set(j, true);
				}

				k--;
			}
		}
		
		afficheTable(); 
	}
	
	//affiche la table dans la console
	void afficheTable(){
		
		System.out.println("---------------------NEW TABLE---------------------");
		
		for(int i = 0; i < table.size(); ++i){
			for(int j = 0; j < table.get(i).size() ; ++j){
				if(table.get(i).get(j) == true) System.out.print("1 ");
				else System.out.print("0 ");
			}
				System.out.println("\n");
		}
		
	}
		


} //TableVeriteImpl
