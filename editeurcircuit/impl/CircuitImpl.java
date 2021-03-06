/**
 */
package editeurcircuit.impl;

import editeurcircuit.Circuit;
import editeurcircuit.EditeurcircuitFactory;
import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Porte;
import editeurcircuit.Porte_AND;
import editeurcircuit.Signal;
import editeurcircuit.TableVeriteObserver;
import editeurcircuit.TypePorte;
import editeurcircuit.TypeSignal;
import editeurcircuit.impl.Porte_ANDImpl;
import editeurcircuit.impl.Porte_NOTImpl;
import editeurcircuit.impl.Porte_ORImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vueTableVerite.Observeur;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Circuit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link editeurcircuit.impl.CircuitImpl#isValide <em>Valide</em>}</li>
 * <li>{@link editeurcircuit.impl.CircuitImpl#isSauvegarder <em>Sauvegarder
 * </em>}</li>
 * <li>{@link editeurcircuit.impl.CircuitImpl#getEstDefinitPar <em>Est Definit
 * Par</em>}</li>
 * <li>{@link editeurcircuit.impl.CircuitImpl#getEstCompose <em>Est Compose
 * </em>}</li>
 * <li>{@link editeurcircuit.impl.CircuitImpl#getID <em>ID</em>}</li>
 * <li>{@link editeurcircuit.impl.CircuitImpl#getPORTE_COMPTEUR <em>PORTE
 * COMPTEUR</em>}</li>
 * <li>{@link editeurcircuit.impl.CircuitImpl#getNewEReference3 <em>New
 * EReference3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitImpl extends MinimalEObjectImpl.Container implements
		Circuit {

	public enum typeObject {
		Porte_AND, Porte_OR, Porte_NOT, Signal_ENTREE, Signal_SORTIE
	}

	/**
	 * The default value of the '{@link #isValide() <em>Valide</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isValide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValide() <em>Valide</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isValide()
	 * @generated
	 * @ordered
	 */
	protected boolean valide = VALIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSauvegarder() <em>Sauvegarder</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSauvegarder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAUVEGARDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSauvegarder() <em>Sauvegarder</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSauvegarder()
	 * @generated
	 * @ordered
	 */
	protected boolean sauvegarder = SAUVEGARDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstDefinitPar()
	 * <em>Est Definit Par</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEstDefinitPar()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> estDefinitPar;

	/**
	 * The cached value of the '{@link #getEstCompose() <em>Est Compose</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEstCompose()
	 * @generated
	 * @ordered
	 */
	protected EList<Porte> estCompose;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPORTE_COMPTEUR()
	 * <em>PORTE COMPTEUR</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPORTE_COMPTEUR()
	 * @generated
	 * @ordered
	 */
	protected static final int PORTE_COMPTEUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPORTE_COMPTEUR()
	 * <em>PORTE COMPTEUR</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPORTE_COMPTEUR()
	 * @generated
	 * @ordered
	 */
	protected int portE_COMPTEUR = PORTE_COMPTEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewEReference3()
	 * <em>New EReference3</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getNewEReference3()
	 * @generated
	 * @ordered
	 */

	protected TableVeriteObserver newEReference3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected CircuitImpl() {
		super();

		portE_COMPTEUR = 1;

		// D�finition des listes
		estDefinitPar = new EObjectContainmentEList<Signal>(Signal.class, this,
				EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR);
		estCompose = new EObjectContainmentEList<Porte>(Porte.class, this,
				EditeurcircuitPackage.CIRCUIT__EST_COMPOSE);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditeurcircuitPackage.Literals.CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isValide() {
		return valide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValide(boolean newValide) {
		boolean oldValide = valide;
		valide = newValide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EditeurcircuitPackage.CIRCUIT__VALIDE, oldValide, valide));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSauvegarder() {
		return sauvegarder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSauvegarder(boolean newSauvegarder) {
		boolean oldSauvegarder = sauvegarder;
		sauvegarder = newSauvegarder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EditeurcircuitPackage.CIRCUIT__SAUVEGARDER, oldSauvegarder,
					sauvegarder));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Signal> getEstDefinitPar() {
		if (estDefinitPar == null) {
			estDefinitPar = new EObjectContainmentEList<Signal>(Signal.class,
					this, EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR);
		}
		return estDefinitPar;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Porte> getEstCompose() {
		if (estCompose == null) {
			estCompose = new EObjectContainmentEList<Porte>(Porte.class, this,
					EditeurcircuitPackage.CIRCUIT__EST_COMPOSE);
		}
		return estCompose;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EditeurcircuitPackage.CIRCUIT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableVeriteObserver getNewEReference3() {
		if (newEReference3 != null && newEReference3.eIsProxy()) {
			InternalEObject oldNewEReference3 = (InternalEObject) newEReference3;
			newEReference3 = (TableVeriteObserver) eResolveProxy(oldNewEReference3);
			if (newEReference3 != oldNewEReference3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EditeurcircuitPackage.CIRCUIT__NEW_EREFERENCE3,
							oldNewEReference3, newEReference3));
			}
		}
		return newEReference3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableVeriteObserver basicGetNewEReference3() {
		return newEReference3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNewEReference3(TableVeriteObserver newNewEReference3) {
		TableVeriteObserver oldNewEReference3 = newEReference3;
		newEReference3 = newNewEReference3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EditeurcircuitPackage.CIRCUIT__NEW_EREFERENCE3,
					oldNewEReference3, newEReference3));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int AjouterPorte(TypePorte typePorte) {
		if (this.getEstCompose().size() < 50) {
			switch (typePorte) {
			case AND:
				Porte v_porte_and = EditeurcircuitFactory.eINSTANCE
						.createPorte_AND();
				v_porte_and.setID(portE_COMPTEUR);
				v_porte_and.setNom("P_AND" + portE_COMPTEUR);
				estCompose.add(v_porte_and);
				portE_COMPTEUR++;
				return v_porte_and.getID();
			case OR:
				Porte v_porte_or = EditeurcircuitFactory.eINSTANCE
						.createPorte_OR();
				v_porte_or.setID(portE_COMPTEUR);
				v_porte_or.setNom("P_OR" + portE_COMPTEUR);
				estCompose.add(v_porte_or);
				portE_COMPTEUR++;
				return v_porte_or.getID();
			case NOT:
				Porte v_porte_not = EditeurcircuitFactory.eINSTANCE
						.createPorte_NOT();
				v_porte_not.setID(portE_COMPTEUR);
				v_porte_not.setNom("P_NOT" + portE_COMPTEUR);
				estCompose.add(v_porte_not);
				portE_COMPTEUR++;
				return v_porte_not.getID();
			}
		} else {
			System.out.println("Limite de portes atteintes.");
			return -1;
		}
		return -1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void Valider() {
		boolean  v_valide = true;
		int 	 v_compteur_sortie = 0;        
		int 	 v_compteur_entree = 0;
		int 	 v_porte_id = -1;
		
		// Boucle pour parcourir les Entr�es et Sorties
		for (Iterator<Signal> iterSignal = estDefinitPar.listIterator(); iterSignal.hasNext();)
		{
			Signal s = iterSignal.next();
			
			// v�rifier si tous les liens sont remplis 			
			if (s.getLien() < 1){
				v_valide = false;
				break;
				}	
			
			if(v_valide == true) {	

				// Trouver la destination et v�rifier si le lien est valide dans la table des portes.
				for (Iterator<Porte> iterPorteDest = estCompose.listIterator(); iterPorteDest.hasNext();)
				{
					Porte v_porteDest = iterPorteDest.next();										
			    										
						if (v_porteDest instanceof Porte_NOTImpl){
							if  (((Porte_NOTImpl) v_porteDest).getID() == s.getLien()
							  && ((Porte_NOTImpl) v_porteDest).getEntree1() != s.getID()
							  && ((Porte_NOTImpl) v_porteDest).getSortie1() != s.getID()) {						
								v_valide = false;
								break;
							}
						}
						else if (v_porteDest instanceof Porte_ANDImpl) {
							if  (((Porte_ANDImpl) v_porteDest).getID() == s.getLien()
							  && ((Porte_ANDImpl) v_porteDest).getEntree1() != s.getID()
							  && ((Porte_ANDImpl) v_porteDest).getEntree2() != s.getID() 
							  && ((Porte_ANDImpl) v_porteDest).getSortie1() != s.getID()) {
										v_valide = false;
										break;
									}
						}
						else if (v_porteDest instanceof Porte_ORImpl) {
							if  (((Porte_ORImpl) v_porteDest).getID() == s.getLien()
							  && ((Porte_ORImpl) v_porteDest).getEntree1() != s.getID()
							  && ((Porte_ORImpl) v_porteDest).getEntree2() != s.getID() 
							  && ((Porte_ORImpl) v_porteDest).getSortie1() != s.getID()) {
									   v_valide = false;
									   break;
									}
						
						} // Fin si					
			    
				} // Fin boucle des portes pour la destination des Entr�es/Sortie
				

				if(v_valide == true) {	
					
				
					// V�rifier que les signaux de type sortie soient associ�s � une seule porte
					v_compteur_sortie = 0;
					if (s.getType() == TypeSignal.SORTIE){
											
						for (Iterator<Porte> iterPorte = estCompose.listIterator(); iterPorte.hasNext();)
						{
							Porte v_porte = iterPorte.next();	
							
							if (v_porte instanceof Porte_NOTImpl){
								if (((Porte_NOTImpl) v_porte).getSortie1() == s.getID()) {						
									v_compteur_sortie++;	
								}
							}
							else if (v_porte instanceof Porte_ORImpl){
								if (((Porte_ORImpl) v_porte).getSortie1() == s.getID()) {						
									v_compteur_sortie++;	
								}
							}						
							else if (v_porte instanceof Porte_ANDImpl){
								if (((Porte_ANDImpl) v_porte).getSortie1() == s.getID()) {						
									v_compteur_sortie++;	
								}
							}
						
																	
						}		
						if (v_compteur_sortie > 1)
							v_valide = false;

					} // Fin si typeSignal == SORTIE  
				
				} // Fin si v_valide == true				
				
				// V�rifier que les entr�es ne pointe pas sur une autre entr�es
				// et qu'une sortie de pointe pas sur une autre sortie
				if(v_valide == true) {					
						
					 Signal v_signal_dest = (Signal) this.RechercherSignalParID(s.getLien());
					 if (v_signal_dest != null && v_signal_dest.getType() == s.getType())
							 v_valide = false;				 							 					
					
					
				} // Fin si v_valide == true
				
				
			} // Fin si v_valide == true
					
		 } // Fin de la boucle des signaux
		 
			   
		if(v_valide == true) {
			
				// V�rifier que toutes les entree1, entree2 et sortie1 soient diff�rents et non null
			    for (Iterator<Porte> iterP = estCompose.listIterator(); iterP.hasNext();)
				{
					Porte v_porte_null = iterP.next();	
								    	
			    	// V�rifier les nulls
					if (v_porte_null instanceof Porte_NOTImpl){
						if   (((Porte_NOTImpl) v_porte_null).getEntree1() == -1 
						  ||  ((Porte_NOTImpl) v_porte_null).getSortie1() == -1
						  ||  ((Porte_NOTImpl) v_porte_null).getEntree1() == ((Porte_NOTImpl) v_porte_null).getSortie1())
						{						
							v_valide = false;						
							break;	
						}
					}
					else if (v_porte_null instanceof Porte_ORImpl){
						if   (((Porte_ORImpl) v_porte_null).getEntree1() == -1 
						  ||  ((Porte_ORImpl) v_porte_null).getEntree2() == -1
						  ||  ((Porte_ORImpl) v_porte_null).getSortie1() == -1
						  ||  ((Porte_ORImpl) v_porte_null).getEntree1() == ((Porte_ORImpl) v_porte_null).getSortie1()
						  ||  ((Porte_ORImpl) v_porte_null).getEntree2() == ((Porte_ORImpl) v_porte_null).getSortie1()
						  ||  ((Porte_ORImpl) v_porte_null).getEntree1() == ((Porte_ORImpl) v_porte_null).getEntree2())
						{
							v_valide = false;													
							break;	
						}
					}						
					else if (v_porte_null instanceof Porte_ANDImpl){
						if   (((Porte_ANDImpl) v_porte_null).getEntree1() == -1 
						  ||  ((Porte_ANDImpl) v_porte_null).getEntree2() == -1
						  ||  ((Porte_ANDImpl) v_porte_null).getSortie1() == -1
						  ||  ((Porte_ANDImpl) v_porte_null).getEntree1() == ((Porte_ANDImpl) v_porte_null).getSortie1()
						  ||  ((Porte_ANDImpl) v_porte_null).getEntree2() == ((Porte_ANDImpl) v_porte_null).getSortie1()
						  ||  ((Porte_ANDImpl) v_porte_null).getEntree1() == ((Porte_ANDImpl) v_porte_null).getEntree2())
						{
							v_valide = false;													
							break;	
						}
					}
					
					
					if (v_valide == true){
						// Si c'est toujours valide, v�rifier que pour chaque porte, elle ne se retrouve pas plus d'une fois 
						// dans les entr�es des autres portes.
						
						v_compteur_entree = 0;
						if (v_porte_null instanceof Porte_NOTImpl)
							v_porte_id = ((Porte_NOTImpl) v_porte_null).getID();
						else if (v_porte_null instanceof Porte_ORImpl)
							v_porte_id = ((Porte_ORImpl) v_porte_null).getID();
						else if (v_porte_null instanceof Porte_ANDImpl)
							v_porte_id = ((Porte_ANDImpl) v_porte_null).getID();
													
						
						for (Iterator<Porte> iterEntreeP = estCompose.listIterator(); iterEntreeP.hasNext();)
						{
							Porte v_porte_entree = iterEntreeP.next();	
						
							// Compter le nombre de fois qu'il y a une r�f�rence de type "Entree" � la porte
							// afin de s'assurer qu'il n'y ait seulement une sortie par porte.

							// Porte NOT
							if (v_porte_entree instanceof Porte_NOTImpl){								
								if   (((Porte_NOTImpl) v_porte_entree).getEntree1() == v_porte_id)
									v_compteur_entree++;
							}
							
							// Porte OR
							if (v_porte_entree instanceof Porte_ORImpl){								
								if   (((Porte_ORImpl) v_porte_entree).getEntree1() == v_porte_id)
									v_compteur_entree++;
							}							 
							if (v_porte_entree instanceof Porte_ORImpl){								
								if   (((Porte_ORImpl) v_porte_entree).getEntree2() == v_porte_id)
									v_compteur_entree++;
							}
							
							// Porte AND
							if (v_porte_entree instanceof Porte_ANDImpl){								
								if   (((Porte_ANDImpl) v_porte_entree).getEntree1() == v_porte_id)
									v_compteur_entree++;
							}							 
							if (v_porte_entree instanceof Porte_ANDImpl){								
								if   (((Porte_ANDImpl) v_porte_entree).getEntree2() == v_porte_id)
									v_compteur_entree++;
							}
							
							if (v_compteur_entree > 1){
								v_valide = false;
								break;	
							}
							
						} // Fin boucle des autres portes (iterEntreeP)
						
						
					 } // Fin si v_valide == true				
					
					if (v_valide == false)													
						break;		
					
				} // Fin boucle FOR
				
				
		 } // Fin si v_valide == true
				
		this.setValide(v_valide);		
		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void SupprimerPorte(int p_ID) {
		final int v_null_value = -1;

		// Suppression des liens dans la porte
		for (Iterator<Signal> iter = estDefinitPar.listIterator(); iter
				.hasNext();) {
			Signal s = iter.next();
			if (s.getLien() == p_ID) {
				s.setLien(v_null_value);
			}
		}

		// Suppression des liens dans les portes
		for (Iterator<Porte> iter = estCompose.listIterator(); iter.hasNext();) {

			Porte p = iter.next();

			if (p instanceof Porte_ANDImpl) {
				if (((Porte_ANDImpl) p).getEntree1() == p_ID) {
					((Porte_ANDImpl) p).setEntree1(v_null_value);
				}

				else if (((Porte_ANDImpl) p).getEntree2() == p_ID) {
					((Porte_ANDImpl) p).setEntree2(v_null_value);
				}

				else if (((Porte_ANDImpl) p).getSortie1() == p_ID) {
					((Porte_ANDImpl) p).setSortie1(v_null_value);
				}
			}

			else if (p instanceof Porte_ORImpl) {

				if (((Porte_ORImpl) p).getEntree1() == p_ID) {
					((Porte_ORImpl) p).setEntree1(v_null_value);
				}

				if (((Porte_ORImpl) p).getEntree2() == p_ID) {
					((Porte_ORImpl) p).setEntree2(v_null_value);
				}

				if (((Porte_ORImpl) p).getSortie1() == p_ID) {
					((Porte_ORImpl) p).setSortie1(v_null_value);
				}

			}

			else if (p instanceof Porte_NOTImpl) {

				if (((Porte_NOTImpl) p).getEntree1() == p_ID) {
					((Porte_NOTImpl) p).setEntree1(v_null_value);
				}

				if (((Porte_NOTImpl) p).getSortie1() == p_ID) {
					((Porte_NOTImpl) p).setSortie1(v_null_value);
				}

			}
		}
		// Suppression de la porte
		for (Iterator<Porte> iter = estCompose.listIterator(); iter.hasNext();) {
			Porte p = iter.next();
			if (p.getID() == p_ID) {
				iter.remove();
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int AjouterSignal(TypeSignal p_typeSignal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// throw new UnsupportedOperationException();
		int id = 0;
		int v_nb_entree = 0;
		int v_nb_sortie = 0;

		// Comptage du nombre de signal Entree et Sortie
		for (Signal s : estDefinitPar) {

			if (s.getType() == TypeSignal.ENTREE) {
				v_nb_entree++;
			} else if (s.getType() == TypeSignal.SORTIE) {
				v_nb_sortie++;
			} else {
				System.out.println("ERREUR : Un signal a un type ind�fini !");
			}

		}

		// Creation d'un signal entree
		if (p_typeSignal == TypeSignal.ENTREE && v_nb_entree < 5) {
			Signal v_SignalToAdd = EditeurcircuitFactory.eINSTANCE
					.createSignal();

			v_SignalToAdd.setID(portE_COMPTEUR);
			portE_COMPTEUR++;

			v_SignalToAdd.setType(TypeSignal.ENTREE);

			v_SignalToAdd.setNom("E" + v_SignalToAdd.getID());

			estDefinitPar.add(v_nb_entree, v_SignalToAdd);
			id = v_SignalToAdd.getID();
		}
		// Creation d'un signal sortie
		else if (p_typeSignal == TypeSignal.SORTIE && v_nb_sortie < 5) {
			Signal v_SignalToAdd = EditeurcircuitFactory.eINSTANCE
					.createSignal();

			v_SignalToAdd.setID(portE_COMPTEUR);
			portE_COMPTEUR++;

			v_SignalToAdd.setType(TypeSignal.SORTIE);

			v_SignalToAdd.setNom("S" + v_SignalToAdd.getID());

			estDefinitPar.add(v_SignalToAdd);
			id = v_SignalToAdd.getID();
		}
		// ERREUR : Il existe d�j� 5 signal de type p_typeSignal
		else {

			if (v_nb_sortie >= 5)
				System.out
						.println("ERREUR : Nombre de sortie limite atteint. L'ajout d'une sortie est annul�e.");
			if (v_nb_entree >= 5)
				System.out
						.println("ERREUR : Nombre d'entrees limite atteint. L'ajout d'une entree est annul�e.");
		}
		
		TableVeriteImpl.getInstance().construct(getNbEntree(), getNbSortie(), estDefinitPar);
		
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void SupprimerSignal(int p_ID) {

		final int v_null_value = -1;

		// Suppression des liens dans les signals
		for (Iterator<Signal> iter = estDefinitPar.listIterator(); iter
				.hasNext();) {
			Signal s = iter.next();
			if (s.getLien() == p_ID) {
				s.setLien(v_null_value);
			}
		}

		// Suppression des liens dans les portes
		for (Iterator<Porte> iter = estCompose.listIterator(); iter.hasNext();) {

			Porte p = iter.next();

			if (p instanceof Porte_ANDImpl) {
				if (((Porte_ANDImpl) p).getEntree1() == p_ID) {
					((Porte_ANDImpl) p).setEntree1(v_null_value);
				}

				else if (((Porte_ANDImpl) p).getEntree2() == p_ID) {
					((Porte_ANDImpl) p).setEntree2(v_null_value);
				}

				else if (((Porte_ANDImpl) p).getSortie1() == p_ID) {
					((Porte_ANDImpl) p).setSortie1(v_null_value);
				}
			}

			else if (p instanceof Porte_ORImpl) {

				if (((Porte_ORImpl) p).getEntree1() == p_ID) {
					((Porte_ORImpl) p).setEntree1(v_null_value);
				}

				if (((Porte_ORImpl) p).getEntree2() == p_ID) {
					((Porte_ORImpl) p).setEntree2(v_null_value);
				}

				if (((Porte_ORImpl) p).getSortie1() == p_ID) {
					((Porte_ORImpl) p).setSortie1(v_null_value);
				}

			}

			else if (p instanceof Porte_NOTImpl) {

				if (((Porte_NOTImpl) p).getEntree1() == p_ID) {
					((Porte_NOTImpl) p).setEntree1(v_null_value);
				}

				if (((Porte_NOTImpl) p).getSortie1() == p_ID) {
					((Porte_NOTImpl) p).setSortie1(v_null_value);
				}

			}
		}

		// Suppression du signal
		for (Iterator<Signal> iter = estDefinitPar.listIterator(); iter
				.hasNext();) {
			Signal s = iter.next();
			if (s.getID() == p_ID) {
				iter.remove();
			}
		}
		TableVeriteImpl.getInstance().construct(getNbEntree(), getNbSortie(), estDefinitPar);
		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR:
			return ((InternalEList<?>) getEstDefinitPar()).basicRemove(
					otherEnd, msgs);
		case EditeurcircuitPackage.CIRCUIT__EST_COMPOSE:
			return ((InternalEList<?>) getEstCompose()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EditeurcircuitPackage.CIRCUIT__VALIDE:
			return isValide();
		case EditeurcircuitPackage.CIRCUIT__SAUVEGARDER:
			return isSauvegarder();
		case EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR:
			return getEstDefinitPar();
		case EditeurcircuitPackage.CIRCUIT__EST_COMPOSE:
			return getEstCompose();
		case EditeurcircuitPackage.CIRCUIT__ID:
			return getID();
		case EditeurcircuitPackage.CIRCUIT__NEW_EREFERENCE3:
			if (resolve)
				return getNewEReference3();
			return basicGetNewEReference3();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EditeurcircuitPackage.CIRCUIT__VALIDE:
			setValide((Boolean) newValue);
			return;
		case EditeurcircuitPackage.CIRCUIT__SAUVEGARDER:
			setSauvegarder((Boolean) newValue);
			return;
		case EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR:
			getEstDefinitPar().clear();
			getEstDefinitPar().addAll((Collection<? extends Signal>) newValue);
			return;
		case EditeurcircuitPackage.CIRCUIT__EST_COMPOSE:
			getEstCompose().clear();
			getEstCompose().addAll((Collection<? extends Porte>) newValue);
			return;
		case EditeurcircuitPackage.CIRCUIT__ID:
			setID((Integer) newValue);
			return;
		case EditeurcircuitPackage.CIRCUIT__NEW_EREFERENCE3:
			setNewEReference3((TableVeriteObserver) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EditeurcircuitPackage.CIRCUIT__VALIDE:
			setValide(VALIDE_EDEFAULT);
			return;
		case EditeurcircuitPackage.CIRCUIT__SAUVEGARDER:
			setSauvegarder(SAUVEGARDER_EDEFAULT);
			return;
		case EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR:
			getEstDefinitPar().clear();
			return;
		case EditeurcircuitPackage.CIRCUIT__EST_COMPOSE:
			getEstCompose().clear();
			return;
		case EditeurcircuitPackage.CIRCUIT__ID:
			setID(ID_EDEFAULT);
			return;
		case EditeurcircuitPackage.CIRCUIT__NEW_EREFERENCE3:
			setNewEReference3((TableVeriteObserver) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EditeurcircuitPackage.CIRCUIT__VALIDE:
			return valide != VALIDE_EDEFAULT;
		case EditeurcircuitPackage.CIRCUIT__SAUVEGARDER:
			return sauvegarder != SAUVEGARDER_EDEFAULT;
		case EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR:
			return estDefinitPar != null && !estDefinitPar.isEmpty();
		case EditeurcircuitPackage.CIRCUIT__EST_COMPOSE:
			return estCompose != null && !estCompose.isEmpty();
		case EditeurcircuitPackage.CIRCUIT__ID:
			return id != ID_EDEFAULT;
		case EditeurcircuitPackage.CIRCUIT__NEW_EREFERENCE3:
			return newEReference3 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case EditeurcircuitPackage.CIRCUIT___AJOUTER_PORTE__TYPEPORTE:
			AjouterPorte((TypePorte) arguments.get(0));
			return null;
		case EditeurcircuitPackage.CIRCUIT___VALIDER:
			Valider();
			return null;
		case EditeurcircuitPackage.CIRCUIT___SUPPRIMER_PORTE__INT:
			SupprimerPorte((Integer) arguments.get(0));
			return null;
		case EditeurcircuitPackage.CIRCUIT___AJOUTER_SIGNAL__TYPESIGNAL:
			AjouterSignal((TypeSignal) arguments.get(0));
			return null;
		case EditeurcircuitPackage.CIRCUIT___SUPPRIMER_SIGNAL__INT:
			SupprimerSignal((Integer) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Valide: ");
		result.append(valide);
		result.append(", Sauvegarder: ");
		result.append(sauvegarder);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public void ajouterLien(String p_Gauche, String p_Droite) {
		typeObject type_gauche = this.getTypeObjet(p_Gauche);
		typeObject type_droite = this.getTypeObjet(p_Droite);

		// Entree - Sortie
		if ((type_gauche == typeObject.Signal_ENTREE)
				&& (type_droite == typeObject.Signal_SORTIE)) {
			Signal signal_gauche = (Signal) this
					.RechercherSignalParNom(p_Gauche);
			Signal signal_droite = (Signal) this
					.RechercherSignalParNom(p_Droite);
			signal_gauche.setLien(signal_droite.getID());
			signal_droite.setLien(signal_gauche.getID());
		}

		// Entree - Porte
		if ((type_gauche == typeObject.Signal_ENTREE)
				&& ((type_droite == typeObject.Porte_AND)
						|| (type_droite == typeObject.Porte_OR) || (type_droite == typeObject.Porte_NOT))) {
			Signal signal_gauche = (Signal) this
					.RechercherSignalParNom(p_Gauche);

			switch (type_droite) {
			case Porte_NOT:
				Porte_NOTImpl porte_droite_not = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Droite);
				porte_droite_not.setEntree1(signal_gauche.getID());
				break;
			case Porte_OR:
				Porte_ORImpl porte_droite_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Droite);
				if (porte_droite_or.getEntree1() != -1) {
					porte_droite_or.setEntree2(signal_gauche.getID());
				} else {
					porte_droite_or.setEntree1(signal_gauche.getID());
				}
				break;
			case Porte_AND:
				Porte_AND porte_droite_and = (Porte_AND) this
						.RechercherPorteParNom(p_Droite);
				if (porte_droite_and.getEntree1() != -1) {
					porte_droite_and.setEntree2(signal_gauche.getID());
				} else {
					porte_droite_and.setEntree1(signal_gauche.getID());
				}
				break;
			}

			Porte porte_droite = this.RechercherPorteParNom(p_Droite);
			signal_gauche.setLien(porte_droite.getID());

		}

		// Porte - Porte
		if (((type_gauche == typeObject.Porte_AND)
				|| (type_gauche == typeObject.Porte_OR) || (type_gauche == typeObject.Porte_NOT))
				&& ((type_droite == typeObject.Porte_AND)
						|| (type_droite == typeObject.Porte_OR) || (type_droite == typeObject.Porte_NOT))) {
			Porte porte_gauche = this.RechercherPorteParNom(p_Gauche);

			switch (type_droite) {
			case Porte_NOT:
				Porte_NOTImpl porte_droite_not = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Droite);
				porte_droite_not.setEntree1(porte_gauche.getID());
				break;
			case Porte_OR:
				Porte_ORImpl porte_droite_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Droite);
				if (porte_droite_or.getEntree1() != -1) {
					porte_droite_or.setEntree2(porte_gauche.getID());
				} else {
					porte_droite_or.setEntree1(porte_gauche.getID());
				}
				break;
			case Porte_AND:
				Porte_AND porte_droite_and = (Porte_AND) this
						.RechercherPorteParNom(p_Droite);
				if (porte_droite_and.getEntree1() != -1) {
					porte_droite_and.setEntree2(porte_gauche.getID());
				} else {
					porte_droite_and.setEntree1(porte_gauche.getID());
				}
				break;
			}

			if ((type_gauche == typeObject.Porte_AND)) {
				Porte_AND porte_gauche1 = (Porte_AND) this
						.RechercherPorteParNom(p_Gauche);
				Porte porte_droite = this.RechercherPorteParNom(p_Droite);
				porte_gauche1.setSortie1(porte_droite.getID());
			}

			if ((type_gauche == typeObject.Porte_OR)) {
				Porte_ORImpl porte_gauche1 = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Gauche);
				Porte porte_droite = this.RechercherPorteParNom(p_Droite);
				porte_gauche1.setSortie1(porte_droite.getID());
			}

			if ((type_gauche == typeObject.Porte_NOT)) {
				Porte_NOTImpl porte_gauche1 = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Gauche);
				Porte porte_droite = this.RechercherPorteParNom(p_Droite);
				porte_gauche1.setSortie1(porte_droite.getID());
			}
		}

		// Porte - Sortie
		if (((type_gauche == typeObject.Porte_AND)
				|| (type_gauche == typeObject.Porte_OR) || (type_gauche == typeObject.Porte_NOT))
				&& (type_droite == typeObject.Signal_SORTIE)) {
			switch (type_gauche) {
			case Porte_AND:
				Porte_AND porte_gauche_and = (Porte_AND) this
						.RechercherPorteParNom(p_Gauche);
				Signal signal_droite1 = (Signal) this
						.RechercherSignalParNom(p_Droite);
				porte_gauche_and.setSortie1(signal_droite1.getID());
				signal_droite1.setLien(porte_gauche_and.getID());
				break;
			case Porte_OR:
				Porte_ORImpl porte_gauche_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Gauche);
				Signal signal_droite2 = (Signal) this
						.RechercherSignalParNom(p_Droite);
				porte_gauche_or.setSortie1(signal_droite2.getID());
				signal_droite2.setLien(porte_gauche_or.getID());
				break;
			case Porte_NOT:
				Porte_NOTImpl porte_gauche_not = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Gauche);
				Signal signal_droite3 = (Signal) this
						.RechercherSignalParNom(p_Droite);
				porte_gauche_not.setSortie1(signal_droite3.getID());
				signal_droite3.setLien(porte_gauche_not.getID());
				break;
			}

		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public void supprimerLien(String p_Gauche, String p_Droite) {
		typeObject type_gauche = this.getTypeObjet(p_Gauche);
		typeObject type_droite = this.getTypeObjet(p_Droite);

		// Entree - Sortie
		if ((type_gauche == typeObject.Signal_ENTREE)
				&& (type_droite == typeObject.Signal_SORTIE)) {
			Signal signal_gauche = (Signal) this
					.RechercherSignalParNom(p_Gauche);
			Signal signal_droite = (Signal) this
					.RechercherSignalParNom(p_Droite);
			signal_gauche.setLien(0);
			signal_droite.setLien(0);
		}

		// Entree - Porte
		if ((type_gauche == typeObject.Signal_ENTREE)
				&& ((type_droite == typeObject.Porte_AND)
						|| (type_droite == typeObject.Porte_OR) || (type_droite == typeObject.Porte_NOT))) {
			Signal signal_gauche = (Signal) this
					.RechercherSignalParNom(p_Gauche);
			int id_gauche = signal_gauche.getID();
			switch (type_droite) {
			case Porte_NOT:
				Porte_NOTImpl porte_droite_not = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Droite);
				porte_droite_not.setEntree1(0);
				break;
			case Porte_OR:
				Porte_ORImpl porte_droite_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Droite);
				if (porte_droite_or.getEntree1() == id_gauche) {
					porte_droite_or.setEntree1(0);
				} else {
					porte_droite_or.setEntree2(0);
				}
				break;
			case Porte_AND:
				Porte_AND porte_droite_and = (Porte_AND) this
						.RechercherPorteParNom(p_Droite);
				if (porte_droite_and.getEntree1() == id_gauche) {
					porte_droite_and.setEntree1(0);
				} else {
					porte_droite_and.setEntree2(0);
				}
				break;
			}

			signal_gauche.setLien(0);
		}

		// Porte - Porte
		if (((type_gauche == typeObject.Porte_AND)
				|| (type_gauche == typeObject.Porte_OR) || (type_gauche == typeObject.Porte_NOT))
				&& ((type_droite == typeObject.Porte_AND)
						|| (type_droite == typeObject.Porte_OR) || (type_droite == typeObject.Porte_NOT))) {
			Porte porte_gauche = this.RechercherPorteParNom(p_Gauche);
			int id_gauche = porte_gauche.getID();

			switch (type_droite) {
			case Porte_NOT:
				Porte_NOTImpl porte_droite_not = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Droite);
				porte_droite_not.setEntree1(0);
				break;
			case Porte_OR:
				Porte_ORImpl porte_droite_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Droite);
				int id_droite_or = porte_droite_or.getID();
				if (porte_droite_or.getEntree1() == id_gauche) {
					porte_droite_or.setEntree1(0);
				} else {
					porte_droite_or.setEntree2(0);
				}
				break;
			case Porte_AND:
				Porte_AND porte_droite_and = (Porte_AND) this
						.RechercherPorteParNom(p_Droite);
				int id_droite_and = porte_droite_and.getID();
				if (porte_droite_and.getEntree1() == id_gauche) {
					porte_droite_and.setEntree1(0);
				} else {
					porte_droite_and.setEntree2(0);
				}
				break;
			}

			if ((type_gauche == typeObject.Porte_AND)) {
				Porte_AND porte_gauche1 = (Porte_AND) this
						.RechercherPorteParNom(p_Gauche);							
				porte_gauche1.setSortie1(0);
			}

			if ((type_gauche == typeObject.Porte_OR)) {
				Porte_ORImpl porte_gauche1 = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Gauche);								
				porte_gauche1.setSortie1(0);
			}

			if ((type_gauche == typeObject.Porte_NOT)) {
				Porte_NOTImpl porte_gauche1 = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Gauche);							
				porte_gauche1.setSortie1(0);
			}
		}

		// Porte - Sortie
		if (((type_gauche == typeObject.Porte_AND)
				|| (type_gauche == typeObject.Porte_OR) || (type_gauche == typeObject.Porte_NOT))
				&& (type_droite == typeObject.Signal_SORTIE)) {
			switch (type_gauche) {
			case Porte_AND:
				Porte_AND porte_gauche_and = (Porte_AND) this
						.RechercherPorteParNom(p_Gauche);
				Signal signal_droite1 = (Signal) this
						.RechercherSignalParNom(p_Droite);
				porte_gauche_and.setSortie1(0);
				signal_droite1.setLien(0);
				break;
			case Porte_OR:
				Porte_ORImpl porte_gauche_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Gauche);
				Signal signal_droite2 = (Signal) this
						.RechercherSignalParNom(p_Droite);
				porte_gauche_or.setSortie1(0);
				signal_droite2.setLien(0);
				break;
			case Porte_NOT:
				Porte_NOTImpl porte_gauche_not = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Gauche);
				Signal signal_droite3 = (Signal) this
						.RechercherSignalParNom(p_Droite);
				porte_gauche_not.setSortie1(0);
				signal_droite3.setLien(0);
				break;
			}

		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Porte RechercherPorteParID(int p_ID) {
		for (int i = 0; i <= this.getEstCompose().size(); i++) {
			if (this.getEstCompose().get(i).getID() == p_ID) {
				return this.getEstCompose().get(i);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Signal RechercherSignalParID(int p_ID) {
		
		for (int i = 0; i < this.getEstDefinitPar().size(); i++) {
			if (this.getEstDefinitPar().get(i).getID() == p_ID) {
				return this.getEstDefinitPar().get(i);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Porte RechercherPorteParNom(String p_Nom) {
		for (int i = 0; i < this.getEstCompose().size(); i++) {
			if (this.getEstCompose().get(i).getNom().equals(p_Nom)) {
				return this.getEstCompose().get(i);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Signal RechercherSignalParNom(String p_Nom) {
		for (int i = 0; i < this.getEstDefinitPar().size(); i++) {
			if (this.getEstDefinitPar().get(i).getNom().equals(p_Nom)) {
				return this.getEstDefinitPar().get(i);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public typeObject getTypeObjet(String p_Nom) {

		// M�thode r��crite car l'ancienne fa�on se basait
		// sur le nom de la porte pour trouver le type
		// (nom qui peut �tre changer par l'utilisation)

		for (Porte p : estCompose) {
			if (p.getNom().compareTo(p_Nom) == 0) {
				if (p instanceof Porte_ANDImpl) {
					return typeObject.Porte_AND;
				}

				if (p instanceof Porte_ORImpl) {
					return typeObject.Porte_OR;
				}

				if (p instanceof Porte_NOTImpl) {
					return typeObject.Porte_NOT;
				}

			}
		}

		for (Signal s : estDefinitPar) {
			if (s.getNom().compareTo(p_Nom) == 0) {

				if (s.getType() == TypeSignal.ENTREE) {
					return typeObject.Signal_ENTREE;
				}

				if (s.getType() == TypeSignal.SORTIE) {
					return typeObject.Signal_SORTIE;
				}
			}
		}
		return null;
	}

		
		public int getNbEntree(){
		
				int v_nb_entree = 0;
		
				// Comptage du nombre de signal Entree
				for (Signal s : getEstDefinitPar()) {
		
					if (s.getType() == TypeSignal.ENTREE)
						v_nb_entree++;
				}
				
				return v_nb_entree; 
		
		}
	
		public int getNbSortie(){
				
				int v_nb_sortie = 0;
			
				// Comptage du nombre de signal Entree
				for (Signal s : getEstDefinitPar()) {
			
					if (s.getType() == TypeSignal.SORTIE)
						v_nb_sortie++;
				}
				
				return v_nb_sortie; 
			
		}
		
		public void calculerTable(){
			
			TableVeriteImpl.getInstance().calculer(estDefinitPar, estCompose, this.getNbEntree(), this.getNbSortie()); 
		}
		
		public void reconstruireTable(){
			
			TableVeriteImpl.getInstance().reconstruireTable(estDefinitPar, this.getNbEntree(), this.getNbSortie()); 
		}
		
		//A appeler APR�S avoir loader un circuit
		public void resetID(){
			int v_id = 0;
			
			for(Signal s : estDefinitPar){
				if(s.getID() > v_id){
					v_id = s.getID(); 
				}
			}
				
			for(Porte p : estCompose){
				if(p.getID() > v_id){
					v_id = p.getID(); 
				}
			}
			
			this.portE_COMPTEUR = v_id + 1;
		}
	 
	
} // CircuitImpl
