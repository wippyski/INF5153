/**
 */
package editeurcircuit.impl;

import editeurcircuit.Circuit;
import editeurcircuit.EditeurcircuitFactory;
import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Porte;
import editeurcircuit.Porte_AND;
import editeurcircuit.Signal;
import editeurcircuit.TypePorte;
import editeurcircuit.TypeSignal;
import editeurcircuit.impl.Porte_ANDImpl;
import editeurcircuit.impl.Porte_NOTImpl;
import editeurcircuit.impl.Porte_ORImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitImpl extends MinimalEObjectImpl.Container implements
		Circuit {

	private static int PORTE_COMPTEUR = 0;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected CircuitImpl() {
		super();

		// Définition des listes
		estDefinitPar = new EObjectContainmentEList<Signal>(Signal.class, this,
				EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR);
		estCompose = new EObjectContainmentEList<Porte>(Porte.class, this,
				EditeurcircuitPackage.CIRCUIT__EST_COMPOSE);

		// Ajout des signals réglementaires
		AjouterSignal(TypeSignal.ENTREE);
		AjouterSignal(TypeSignal.ENTREE);
		AjouterSignal(TypeSignal.SORTIE);
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
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void AjouterPorte(TypePorte typePorte) {
		if (this.getEstCompose().size() < 50) {
			switch (typePorte) {
			case AND:
				Porte v_porte_and = EditeurcircuitFactory.eINSTANCE
						.createPorte_AND();
				v_porte_and.setID(PORTE_COMPTEUR);
				v_porte_and.setNom("P_AND" + PORTE_COMPTEUR);
				estCompose.add(v_porte_and);
				PORTE_COMPTEUR++;
				break;
			case OR:
				Porte v_porte_or = EditeurcircuitFactory.eINSTANCE
						.createPorte_OR();
				v_porte_or.setID(PORTE_COMPTEUR);
				v_porte_or.setNom("P_OR" + PORTE_COMPTEUR);
				estCompose.add(v_porte_or);
				PORTE_COMPTEUR++;
				break;
			case NOT:
				Porte v_porte_not = EditeurcircuitFactory.eINSTANCE
						.createPorte_NOT();
				v_porte_not.setID(PORTE_COMPTEUR);
				v_porte_not.setNom("P_NOT" + PORTE_COMPTEUR);
				estCompose.add(v_porte_not);
				PORTE_COMPTEUR++;
				break;
			}
		} else {
			System.out.println("Limite de portes atteintes.");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void Valider() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
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
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void AjouterSignal(TypeSignal p_typeSignal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// throw new UnsupportedOperationException();

		int v_nb_entree = 0;
		int v_nb_sortie = 0;

		// Comptage du nombre de signal Entree et Sortie
		for (Signal s : estDefinitPar) {

			if (s.getType() == TypeSignal.ENTREE) {
				v_nb_entree++;
			} else if (s.getType() == TypeSignal.SORTIE) {
				v_nb_sortie++;
			} else {
				System.out.println("ERREUR : Un signal a un type indéfini !");
			}

		}

		// Creation d'un signal entree
		if (p_typeSignal == TypeSignal.ENTREE && v_nb_entree < 5) {
			Signal v_SignalToAdd = EditeurcircuitFactory.eINSTANCE
					.createSignal();

			v_SignalToAdd.setID(PORTE_COMPTEUR);
			PORTE_COMPTEUR++;

			v_SignalToAdd.setType(TypeSignal.ENTREE);

			v_SignalToAdd.setNom("E" + v_SignalToAdd.getID());

			estDefinitPar.add(v_SignalToAdd);
		}
		// Creation d'un signal sortie
		else if (p_typeSignal == TypeSignal.SORTIE && v_nb_sortie < 5) {
			Signal v_SignalToAdd = EditeurcircuitFactory.eINSTANCE
					.createSignal();

			v_SignalToAdd.setID(PORTE_COMPTEUR);
			PORTE_COMPTEUR++;

			v_SignalToAdd.setType(TypeSignal.SORTIE);

			v_SignalToAdd.setNom("S" + v_SignalToAdd.getID());

			estDefinitPar.add(v_SignalToAdd);
		}
		// ERREUR : Il existe déjà 5 signal de type p_typeSignal
		else {

			if (v_nb_sortie >= 5)
				System.out
						.println("ERREUR : Nombre de sortie limite atteint. L'ajout d'une sortie est annulée.");
			if (v_nb_entree >= 5)
				System.out
						.println("ERREUR : Nombre d'entrees limite atteint. L'ajout d'une entree est annulée.");
		}
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
		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void Sauvegarder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case EditeurcircuitPackage.CIRCUIT___SAUVEGARDER:
			Sauvegarder();
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
		int type_gauche = this.getTypeObjet(p_Gauche);
		int type_droite = this.getTypeObjet(p_Droite);

		// Entree - Sortie
		if ((type_gauche == 4) && (type_droite == 5)) {
			Signal signal_gauche = (Signal) this
					.RechercherSignalParNom(p_Gauche);
			Signal signal_droite = (Signal) this
					.RechercherSignalParNom(p_Droite);
			signal_gauche.setLien(signal_droite.getID());
			signal_droite.setLien(signal_gauche.getID());
		}

		// Entree - Porte
		if ((type_gauche == 4)
				&& ((type_droite == 1) || (type_droite == 2) || (type_droite == 3))) {
			Signal signal_gauche = (Signal) this
					.RechercherSignalParNom(p_Gauche);

			switch (type_droite) {
			case (3):
				Porte_NOTImpl porte_droite_not = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Droite);
				porte_droite_not.setEntree1(signal_gauche.getID());
				break;
			case (2):
				Porte_ORImpl porte_droite_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Droite);
				porte_droite_or.setEntree1(signal_gauche.getID());
				if (porte_droite_or.getEntree1() != 0) {
					porte_droite_or.setEntree2(signal_gauche.getID());
				} else {
					porte_droite_or.setEntree1(signal_gauche.getID());
				}
				break;
			case (1):
				Porte_AND porte_droite_and = (Porte_AND) this
						.RechercherPorteParNom(p_Droite);
				porte_droite_and.setEntree1(signal_gauche.getID());
				if (porte_droite_and.getEntree1() != 0) {
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
		if (((type_gauche == 1) || (type_gauche == 2) || (type_gauche == 3))
				&& ((type_droite == 1) || (type_droite == 2) || (type_droite == 3))) {
			Porte porte_gauche = this.RechercherPorteParNom(p_Gauche);

			switch (type_droite) {
			case (3):
				Porte_NOTImpl porte_droite_not = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Droite);
				porte_droite_not.setEntree1(porte_gauche.getID());
				break;
			case (2):
				Porte_ORImpl porte_droite_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Droite);
				if (porte_droite_or.getEntree1() != 0) {
					porte_droite_or.setEntree2(porte_gauche.getID());
				} else {
					porte_droite_or.setEntree1(porte_gauche.getID());
				}
				break;
			case (1):
				Porte_AND porte_droite_and = (Porte_AND) this
						.RechercherPorteParNom(p_Droite);
				if (porte_droite_and.getEntree1() != 0) {
					porte_droite_and.setEntree2(porte_gauche.getID());
				} else {
					porte_droite_and.setEntree1(porte_gauche.getID());
				}
				break;
			}

			if ((type_gauche == 1)) {
				Porte_AND porte_gauche1 = (Porte_AND) this
						.RechercherPorteParNom(p_Gauche);
				Porte porte_droite = this.RechercherPorteParNom(p_Droite);
				porte_gauche1.setSortie1(porte_droite.getID());
			}

			if ((type_gauche == 2)) {
				Porte_ORImpl porte_gauche1 = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Gauche);
				Porte porte_droite = this.RechercherPorteParNom(p_Droite);
				porte_gauche1.setSortie1(porte_droite.getID());
			}

			if ((type_gauche == 3)) {
				Porte_NOTImpl porte_gauche1 = (Porte_NOTImpl) this
						.RechercherPorteParNom(p_Gauche);
				Porte porte_droite = this.RechercherPorteParNom(p_Droite);
				porte_gauche1.setSortie1(porte_droite.getID());
			}
		}

		// Porte - Sortie
		if (((type_gauche == 1) || (type_gauche == 2) || (type_gauche == 3))
				&& (type_droite == 5)) {
			switch (type_gauche) {
			case (1):
				Porte_AND porte_gauche_and = (Porte_AND) this
						.RechercherPorteParNom(p_Gauche);
				Signal signal_droite1 = (Signal) this
						.RechercherSignalParNom(p_Droite);
				porte_gauche_and.setSortie1(signal_droite1.getID());
				signal_droite1.setLien(porte_gauche_and.getID());
				break;
			case (2):
				Porte_ORImpl porte_gauche_or = (Porte_ORImpl) this
						.RechercherPorteParNom(p_Gauche);
				Signal signal_droite2 = (Signal) this
						.RechercherSignalParNom(p_Droite);
				porte_gauche_or.setSortie1(signal_droite2.getID());
				signal_droite2.setLien(porte_gauche_or.getID());
				break;
			case (3):
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
	public Porte RechercherPorteParNom(String p_Nom) {
		for (int i = 0; i <= this.getEstCompose().size(); i++) {
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
		for (int i = 0; i <= this.getEstDefinitPar().size(); i++) {
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
	public int getTypeObjet(String p_Nom) {
		Pattern patternAND, patternOR, patternNOT, patternEntree, patternSortie;
		patternAND = Pattern.compile("(AND)");
		patternOR = Pattern.compile("(OR)");
		patternNOT = Pattern.compile("(NOT)");
		patternEntree = Pattern.compile("(E)");
		patternSortie = Pattern.compile("(S)");
		Matcher matcher;

		matcher = patternAND.matcher(p_Nom);
		if (matcher.find()) {
			return 1;
		}
		matcher = patternOR.matcher(p_Nom);
		if (matcher.find()) {
			return 2;
		}
		matcher = patternNOT.matcher(p_Nom);
		if (matcher.find()) {
			return 3;
		}
		matcher = patternEntree.matcher(p_Nom);
		if (matcher.find()) {
			return 4;
		}
		matcher = patternSortie.matcher(p_Nom);
		if (matcher.find()) {
			return 5;
		}
		return -1;
	}

} // CircuitImpl
