/**
 */
package editeurcircuit.util;

import editeurcircuit.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see editeurcircuit.EditeurcircuitPackage
 * @generated
 */
public class EditeurcircuitSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EditeurcircuitPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditeurcircuitSwitch() {
		if (modelPackage == null) {
			modelPackage = EditeurcircuitPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EditeurcircuitPackage.CIRCUIT: {
				Circuit circuit = (Circuit)theEObject;
				T result = caseCircuit(circuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EditeurcircuitPackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EditeurcircuitPackage.PORTE: {
				Porte porte = (Porte)theEObject;
				T result = casePorte(porte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EditeurcircuitPackage.PORTE_AND: {
				Porte_AND porte_AND = (Porte_AND)theEObject;
				T result = casePorte_AND(porte_AND);
				if (result == null) result = casePorte(porte_AND);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EditeurcircuitPackage.PORTE_OR: {
				Porte_OR porte_OR = (Porte_OR)theEObject;
				T result = casePorte_OR(porte_OR);
				if (result == null) result = casePorte(porte_OR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EditeurcircuitPackage.PORTE_NOT: {
				Porte_NOT porte_NOT = (Porte_NOT)theEObject;
				T result = casePorte_NOT(porte_NOT);
				if (result == null) result = casePorte(porte_NOT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EditeurcircuitPackage.TABLE_VERITE_OBSERVER: {
				TableVeriteObserver tableVeriteObserver = (TableVeriteObserver)theEObject;
				T result = caseTableVeriteObserver(tableVeriteObserver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EditeurcircuitPackage.TABLE_VERITE: {
				TableVerite tableVerite = (TableVerite)theEObject;
				T result = caseTableVerite(tableVerite);
				if (result == null) result = caseTableVeriteObserver(tableVerite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuit(Circuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorte(Porte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte AND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte AND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorte_AND(Porte_AND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorte_OR(Porte_OR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte NOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte NOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorte_NOT(Porte_NOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Verite Observer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Verite Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableVeriteObserver(TableVeriteObserver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Verite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Verite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableVerite(TableVerite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EditeurcircuitSwitch
