/**
 */
package editeurcircuit.impl;

import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Porte;
import editeurcircuit.Signal;
import editeurcircuit.TableVerite;
import editeurcircuit.TypeSignal;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import vueTableVerite.Observeur;

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
	protected ArrayList<Observeur> listeObs = new ArrayList<Observeur>();
	
	/**
	 * The cached value of the '{@link #getListe() <em>Liste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListe()
	 * @generated NOT
	 * @ordered
	 */
	protected EList<String> liste;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated NOT
	 * @ordered
	 */
	protected Map<Integer, ArrayList<Boolean>> table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	protected ArrayList<String> nomColonne; 
	
	protected TableVeriteImpl() {
		super();
		nomColonne = new ArrayList<String>(); 
		table = new TreeMap<Integer, ArrayList<Boolean>>(); 
	}
	
	public ArrayList<String> getNomColonne(){
		return nomColonne; 
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
		return liste ;
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
	 * @generated NOT
	 */
	public void calculer(EList<Signal> p_signals, EList<Porte> p_portes, int nbEntree, int nbSortie ) {
		
		TreeMap<Integer, Boolean> mapID = new TreeMap<Integer, Boolean>(); 
		
		//Map<ID, valeur boolean>
		for(Signal s : p_signals){
			mapID.put(s.getID(), null);
		}
		
		for(Porte p : p_portes){
			mapID.put(p.getID(), null);
		}
		
		for(int i = 0; i < table.size(); ++i){
			calculerLigne(table.get(i), mapID, nbEntree, nbSortie, p_signals, p_portes);
			
			for(Map.Entry<Integer, Boolean> it : mapID.entrySet()){
				it.setValue(null); 
			}
		}
		
		afficheTable(); 
	}
	
	private void calculerLigne(ArrayList<Boolean> ligne, Map<Integer, Boolean> mapID, int nbEntree, int nbSortie, EList<Signal> p_signals, EList<Porte> p_portes){
		
		//Mettre entree dans mapID aux bonnes valeurs selon la ligne
		int i = 0; 
			
		for(Signal s : p_signals){
				
			if(s.getType() == TypeSignal.ENTREE){

				if(ligne.get(i) == true){
					mapID.put(s.getID(), true);
				}
				else {
					mapID.put(s.getID(), false); 
				}
				i++; 
			}
		}
		
		//Trouver la valeur de chacune des sorties pour la ligne
		for(Signal s : p_signals){
			
			if(s.getType() == TypeSignal.SORTIE){
				
				int precedentID = s.getLien(); 
				mapID.put(s.getID(), getPrecedentValue(precedentID, p_signals, p_portes, mapID));
				
			}
			
		}
		
		int j = nbEntree; 
		
		//Mettre la valeur des sorties dans la ligne de table
		
		for(Signal s : p_signals){
			if(s.getType() == TypeSignal.SORTIE){
				ligne.set(j, mapID.get(s.getID())); 
				j++; 
			}
		}
		
		/*for(Map.Entry<Integer, Boolean> it : mapID.entrySet()){
			int id = it.getKey(); 
			
			for(Signal s : p_signals){
				if( id == s.getID()){
					ligne.set(j, it.getValue());
				}
			}
		}*/
	}
	
	private boolean getPrecedentValue(int precedentID, EList<Signal> p_signals, EList<Porte> p_portes, Map<Integer, Boolean> mapID){
		
		Boolean temp_bool = null;
		
		//Cas où precedentId est un signal
		
		for(Signal s : p_signals){
			if(s.getID() == precedentID){
				temp_bool =  mapID.get(s.getID()); 
			}
		}
		
		
		//Cas où precedentID est une porte
		for(Porte p : p_portes){
			if(p.getID() == precedentID){
				if(p instanceof Porte_ANDImpl){
					boolean value1 = getPrecedentValue( ((Porte_ANDImpl) p).getEntree1(), p_signals, p_portes, mapID);
					boolean value2 = getPrecedentValue( ((Porte_ANDImpl) p).getEntree2(), p_signals, p_portes, mapID);  
					temp_bool = (value1 && value2); 
				}
				if(p instanceof Porte_ORImpl){
					boolean value1 = getPrecedentValue( ((Porte_ORImpl) p).getEntree1(), p_signals, p_portes, mapID);  
					boolean value2 = getPrecedentValue( ((Porte_ORImpl) p).getEntree2(), p_signals, p_portes, mapID);  
					temp_bool = (value1 || value2); 
				}
				if(p instanceof Porte_NOTImpl){
					boolean value1 = getPrecedentValue( ((Porte_NOTImpl) p).getEntree1(), p_signals, p_portes, mapID);   
					temp_bool = !value1;  
				}
			}
		}
		
		return temp_bool;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void attacher(Observeur p_observeur) {
		if( listeObs.contains( p_observeur ) == false )
		{
		   listeObs.add(p_observeur);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean detacher(Observeur p_observeur) {
		return listeObs.remove( p_observeur );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void notifier() {
		  for( Observeur o : listeObs )
		  {
		   o.update(this);
		  }
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
				calculer(null, null, operationID, operationID);
				return null;
			case EditeurcircuitPackage.TABLE_VERITE___ATTACHER:
				attacher(null);
				return null;
			case EditeurcircuitPackage.TABLE_VERITE___DETACHER:
				detacher(null);
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
	public void construct(int nbEntre, int nbSortie, EList<Signal> p_signals){
		
		table.clear(); 
		nomColonne.clear(); 
		
		for(Signal s : p_signals){
			nomColonne.add(s.getNom());
		}
		
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
			
			//On convertit la numéro de la ligne en binaire
			String bin = Integer.toBinaryString(i);
			int k = bin.length() - 1; 
			
			//On entre le numéro de la ligne en binaire dans la ligne 
			//en partant de la droite
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
		
		for(String s : nomColonne){
			System.out.print(s + " ");
		}

		
		System.out.println();
		
		for(int i = 0; i < table.size(); ++i){
			for(int j = 0; j < table.get(i).size() ; ++j){
				if(table.get(i).get(j) == true) System.out.print("1 ");
				else System.out.print("0 ");
			}
				System.out.println("\n");
		}
		
	}


	
} //TableVeriteImpl
