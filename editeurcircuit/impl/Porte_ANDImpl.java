/**
 */
package editeurcircuit.impl;

import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Porte_AND;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Porte AND</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link editeurcircuit.impl.Porte_ANDImpl#getEntree1 <em>Entree1</em>}</li>
 *   <li>{@link editeurcircuit.impl.Porte_ANDImpl#getEntree2 <em>Entree2</em>}</li>
 *   <li>{@link editeurcircuit.impl.Porte_ANDImpl#getSortie1 <em>Sortie1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Porte_ANDImpl extends PorteImpl implements Porte_AND {
	/**
	 * The default value of the '{@link #getEntree1() <em>Entree1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree1()
	 * @generated
	 * @ordered
	 */
	protected static final int ENTREE1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEntree1() <em>Entree1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree1()
	 * @generated
	 * @ordered
	 */
	protected int entree1 = ENTREE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntree2() <em>Entree2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree2()
	 * @generated
	 * @ordered
	 */
	protected static final int ENTREE2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEntree2() <em>Entree2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree2()
	 * @generated
	 * @ordered
	 */
	protected int entree2 = ENTREE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortie1() <em>Sortie1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie1()
	 * @generated
	 * @ordered
	 */
	protected static final int SORTIE1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortie1() <em>Sortie1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie1()
	 * @generated
	 * @ordered
	 */
	protected int sortie1 = SORTIE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Porte_ANDImpl() {
		super();
		
		entree1 = -1;
		entree2 = -1;
		sortie1 = -1; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditeurcircuitPackage.Literals.PORTE_AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEntree1() {
		return entree1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntree1(int newEntree1) {
		int oldEntree1 = entree1;
		entree1 = newEntree1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.PORTE_AND__ENTREE1, oldEntree1, entree1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEntree2() {
		return entree2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntree2(int newEntree2) {
		int oldEntree2 = entree2;
		entree2 = newEntree2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.PORTE_AND__ENTREE2, oldEntree2, entree2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortie1() {
		return sortie1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortie1(int newSortie1) {
		int oldSortie1 = sortie1;
		sortie1 = newSortie1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditeurcircuitPackage.PORTE_AND__SORTIE1, oldSortie1, sortie1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditeurcircuitPackage.PORTE_AND__ENTREE1:
				return getEntree1();
			case EditeurcircuitPackage.PORTE_AND__ENTREE2:
				return getEntree2();
			case EditeurcircuitPackage.PORTE_AND__SORTIE1:
				return getSortie1();
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
			case EditeurcircuitPackage.PORTE_AND__ENTREE1:
				setEntree1((Integer)newValue);
				return;
			case EditeurcircuitPackage.PORTE_AND__ENTREE2:
				setEntree2((Integer)newValue);
				return;
			case EditeurcircuitPackage.PORTE_AND__SORTIE1:
				setSortie1((Integer)newValue);
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
			case EditeurcircuitPackage.PORTE_AND__ENTREE1:
				setEntree1(ENTREE1_EDEFAULT);
				return;
			case EditeurcircuitPackage.PORTE_AND__ENTREE2:
				setEntree2(ENTREE2_EDEFAULT);
				return;
			case EditeurcircuitPackage.PORTE_AND__SORTIE1:
				setSortie1(SORTIE1_EDEFAULT);
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
			case EditeurcircuitPackage.PORTE_AND__ENTREE1:
				return entree1 != ENTREE1_EDEFAULT;
			case EditeurcircuitPackage.PORTE_AND__ENTREE2:
				return entree2 != ENTREE2_EDEFAULT;
			case EditeurcircuitPackage.PORTE_AND__SORTIE1:
				return sortie1 != SORTIE1_EDEFAULT;
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
		result.append(" (Entree1: ");
		result.append(entree1);
		result.append(", Entree2: ");
		result.append(entree2);
		result.append(", Sortie1: ");
		result.append(sortie1);
		result.append(')');
		return result.toString();
	}

} //Porte_ANDImpl
