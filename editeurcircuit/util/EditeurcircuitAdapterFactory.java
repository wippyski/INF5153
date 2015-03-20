/**
 */
package editeurcircuit.util;

import editeurcircuit.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see editeurcircuit.EditeurcircuitPackage
 * @generated
 */
public class EditeurcircuitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EditeurcircuitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditeurcircuitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EditeurcircuitPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditeurcircuitSwitch<Adapter> modelSwitch =
		new EditeurcircuitSwitch<Adapter>() {
			@Override
			public Adapter caseCircuit(Circuit object) {
				return createCircuitAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter casePorte(Porte object) {
				return createPorteAdapter();
			}
			@Override
			public Adapter casePorte_AND(Porte_AND object) {
				return createPorte_ANDAdapter();
			}
			@Override
			public Adapter casePorte_OR(Porte_OR object) {
				return createPorte_ORAdapter();
			}
			@Override
			public Adapter casePorte_NOT(Porte_NOT object) {
				return createPorte_NOTAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link editeurcircuit.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editeurcircuit.Circuit
	 * @generated
	 */
	public Adapter createCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editeurcircuit.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editeurcircuit.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editeurcircuit.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editeurcircuit.Porte
	 * @generated
	 */
	public Adapter createPorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editeurcircuit.Porte_AND <em>Porte AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editeurcircuit.Porte_AND
	 * @generated
	 */
	public Adapter createPorte_ANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editeurcircuit.Porte_OR <em>Porte OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editeurcircuit.Porte_OR
	 * @generated
	 */
	public Adapter createPorte_ORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editeurcircuit.Porte_NOT <em>Porte NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editeurcircuit.Porte_NOT
	 * @generated
	 */
	public Adapter createPorte_NOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EditeurcircuitAdapterFactory
