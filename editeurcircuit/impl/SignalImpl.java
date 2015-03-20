/**
 */
package editeurcircuit.impl;

import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Signal;
import editeurcircuit.TypeSignal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link editeurcircuit.impl.SignalImpl#getID <em>ID</em>}</li>
 *   <li>{@link editeurcircuit.impl.SignalImpl#getType <em>Type</em>}</li>
 *   <li>{@link editeurcircuit.impl.SignalImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link editeurcircuit.impl.SignalImpl#getLien <em>Lien</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalImpl extends MinimalEObjectImpl.Container implements Signal {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeSignal TYPE_EDEFAULT = TypeSignal.ENTREE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeSignal type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLien() <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected static final int LIEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLien() <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected int lien = LIEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditeurcircuitPackage.Literals.SIGNAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.SIGNAL__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSignal getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeSignal newType) {
		TypeSignal oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.SIGNAL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.SIGNAL__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLien() {
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLien(int newLien) {
		int oldLien = lien;
		lien = newLien;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.SIGNAL__LIEN, oldLien, lien));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditeurcircuitPackage.SIGNAL__ID:
				return getID();
			case EditeurcircuitPackage.SIGNAL__TYPE:
				return getType();
			case EditeurcircuitPackage.SIGNAL__NOM:
				return getNom();
			case EditeurcircuitPackage.SIGNAL__LIEN:
				return getLien();
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
			case EditeurcircuitPackage.SIGNAL__ID:
				setID((Integer)newValue);
				return;
			case EditeurcircuitPackage.SIGNAL__TYPE:
				setType((TypeSignal)newValue);
				return;
			case EditeurcircuitPackage.SIGNAL__NOM:
				setNom((String)newValue);
				return;
			case EditeurcircuitPackage.SIGNAL__LIEN:
				setLien((Integer)newValue);
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
			case EditeurcircuitPackage.SIGNAL__ID:
				setID(ID_EDEFAULT);
				return;
			case EditeurcircuitPackage.SIGNAL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EditeurcircuitPackage.SIGNAL__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case EditeurcircuitPackage.SIGNAL__LIEN:
				setLien(LIEN_EDEFAULT);
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
			case EditeurcircuitPackage.SIGNAL__ID:
				return id != ID_EDEFAULT;
			case EditeurcircuitPackage.SIGNAL__TYPE:
				return type != TYPE_EDEFAULT;
			case EditeurcircuitPackage.SIGNAL__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case EditeurcircuitPackage.SIGNAL__LIEN:
				return lien != LIEN_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", Type: ");
		result.append(type);
		result.append(", Nom: ");
		result.append(nom);
		result.append(", Lien: ");
		result.append(lien);
		result.append(')');
		return result.toString();
	}

} //SignalImpl
