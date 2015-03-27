/**
 */
package editeurcircuit.impl;

import editeurcircuit.Circuit;
import editeurcircuit.EditeurcircuitFactory;
import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Porte;
import editeurcircuit.Signal;
import editeurcircuit.TypePorte;
import editeurcircuit.TypeSignal;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link editeurcircuit.impl.CircuitImpl#isValide <em>Valide</em>}</li>
 *   <li>{@link editeurcircuit.impl.CircuitImpl#isSauvegarder <em>Sauvegarder</em>}</li>
 *   <li>{@link editeurcircuit.impl.CircuitImpl#getEstDefinitPar <em>Est Definit Par</em>}</li>
 *   <li>{@link editeurcircuit.impl.CircuitImpl#getEstCompose <em>Est Compose</em>}</li>
 *   <li>{@link editeurcircuit.impl.CircuitImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitImpl extends MinimalEObjectImpl.Container implements Circuit {
	/**
	 * The default value of the '{@link #isValide() <em>Valide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValide() <em>Valide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValide()
	 * @generated
	 * @ordered
	 */
	protected boolean valide = VALIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSauvegarder() <em>Sauvegarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSauvegarder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAUVEGARDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSauvegarder() <em>Sauvegarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSauvegarder()
	 * @generated
	 * @ordered
	 */
	protected boolean sauvegarder = SAUVEGARDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstDefinitPar() <em>Est Definit Par</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDefinitPar()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> estDefinitPar;

	/**
	 * The cached value of the '{@link #getEstCompose() <em>Est Compose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCompose()
	 * @generated
	 * @ordered
	 */
	protected EList<Porte> estCompose;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitImpl() {
		super();
		
		//Définition des listes
		estDefinitPar = new EObjectContainmentEList<Signal>(Signal.class, this, EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR);
		estCompose = new EObjectContainmentEList<Porte>(Porte.class, this, EditeurcircuitPackage.CIRCUIT__EST_COMPOSE);
		
		//Ajout des signals réglementaires
		AjouterSignal(TypeSignal.ENTREE);
		AjouterSignal(TypeSignal.ENTREE);
		AjouterSignal(TypeSignal.SORTIE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditeurcircuitPackage.Literals.CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValide() {
		return valide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValide(boolean newValide) {
		boolean oldValide = valide;
		valide = newValide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.CIRCUIT__VALIDE, oldValide, valide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSauvegarder() {
		return sauvegarder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSauvegarder(boolean newSauvegarder) {
		boolean oldSauvegarder = sauvegarder;
		sauvegarder = newSauvegarder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.CIRCUIT__SAUVEGARDER, oldSauvegarder, sauvegarder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getEstDefinitPar() {
		if (estDefinitPar == null) {
			estDefinitPar = new EObjectContainmentEList<Signal>(Signal.class, this, EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR);
		}
		return estDefinitPar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Porte> getEstCompose() {
		if (estCompose == null) {
			estCompose = new EObjectContainmentEList<Porte>(Porte.class, this, EditeurcircuitPackage.CIRCUIT__EST_COMPOSE);
		}
		return estCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.CIRCUIT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
				// System.out.println(v_porte_and.getNom());
				break;
			case OR:
				Porte v_porte_or = EditeurcircuitFactory.eINSTANCE
						.createPorte_OR();
				v_porte_or.setID(PORTE_COMPTEUR);
				v_porte_or.setNom("P_OR" + PORTE_COMPTEUR);
				estCompose.add(v_porte_or);
				PORTE_COMPTEUR++;
				// System.out.println(v_porte_or.getNom());
				break;
			case NOT:
				Porte v_porte_not = EditeurcircuitFactory.eINSTANCE
						.createPorte_NOT();
				v_porte_not.setID(PORTE_COMPTEUR);
				v_porte_not.setNom("P_NOT" + PORTE_COMPTEUR);
				estCompose.add(v_porte_not);
				PORTE_COMPTEUR++;
				// System.out.println(v_porte_not.getNom());
				break;
			}
		} else {
			System.out.println("Limite de portes atteintes.");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Valider() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SupprimerPorte(int p_ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void AjouterSignal(TypeSignal p_typeSignal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
				
				
				
		Signal v_SignalToAdd = EditeurcircuitFactory.eINSTANCE.createSignal();
				
		//SignalImpl.ID_EDEFAULT = SignalImpl.ID_EDEFAULT + 1; 
				
		v_SignalToAdd.setID(SignalImpl.ID_EDEFAULT);
		v_SignalToAdd.setType(p_typeSignal);
				
		if(p_typeSignal == TypeSignal.ENTREE)
				v_SignalToAdd.setNom("E"+v_SignalToAdd.getID());
		else
				v_SignalToAdd.setNom("S"+v_SignalToAdd.getID());
			
		estDefinitPar.add(v_SignalToAdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SupprimerSignal(int p_ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Sauvegarder() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR:
				return ((InternalEList<?>)getEstDefinitPar()).basicRemove(otherEnd, msgs);
			case EditeurcircuitPackage.CIRCUIT__EST_COMPOSE:
				return ((InternalEList<?>)getEstCompose()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EditeurcircuitPackage.CIRCUIT__VALIDE:
				setValide((Boolean)newValue);
				return;
			case EditeurcircuitPackage.CIRCUIT__SAUVEGARDER:
				setSauvegarder((Boolean)newValue);
				return;
			case EditeurcircuitPackage.CIRCUIT__EST_DEFINIT_PAR:
				getEstDefinitPar().clear();
				getEstDefinitPar().addAll((Collection<? extends Signal>)newValue);
				return;
			case EditeurcircuitPackage.CIRCUIT__EST_COMPOSE:
				getEstCompose().clear();
				getEstCompose().addAll((Collection<? extends Porte>)newValue);
				return;
			case EditeurcircuitPackage.CIRCUIT__ID:
				setID((Integer)newValue);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EditeurcircuitPackage.CIRCUIT___AJOUTER_PORTE__TYPEPORTE:
				AjouterPorte((TypePorte)arguments.get(0));
				return null;
			case EditeurcircuitPackage.CIRCUIT___VALIDER:
				Valider();
				return null;
			case EditeurcircuitPackage.CIRCUIT___SUPPRIMER_PORTE__INT:
				SupprimerPorte((Integer)arguments.get(0));
				return null;
			case EditeurcircuitPackage.CIRCUIT___AJOUTER_SIGNAL__TYPESIGNAL:
				AjouterSignal((TypeSignal)arguments.get(0));
				return null;
			case EditeurcircuitPackage.CIRCUIT___SUPPRIMER_SIGNAL__INT:
				SupprimerSignal((Integer)arguments.get(0));
				return null;
			case EditeurcircuitPackage.CIRCUIT___SAUVEGARDER:
				Sauvegarder();
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
		result.append(" (Valide: ");
		result.append(valide);
		result.append(", Sauvegarder: ");
		result.append(sauvegarder);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CircuitImpl
