/**
 */
package editeurcircuit.impl;

import editeurcircuit.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditeurcircuitFactoryImpl extends EFactoryImpl implements EditeurcircuitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EditeurcircuitFactory init() {
		try {
			EditeurcircuitFactory theEditeurcircuitFactory = (EditeurcircuitFactory)EPackage.Registry.INSTANCE.getEFactory(EditeurcircuitPackage.eNS_URI);
			if (theEditeurcircuitFactory != null) {
				return theEditeurcircuitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EditeurcircuitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditeurcircuitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EditeurcircuitPackage.CIRCUIT: return createCircuit();
			case EditeurcircuitPackage.SIGNAL: return createSignal();
			case EditeurcircuitPackage.PORTE: return createPorte();
			case EditeurcircuitPackage.PORTE_AND: return createPorte_AND();
			case EditeurcircuitPackage.PORTE_OR: return createPorte_OR();
			case EditeurcircuitPackage.PORTE_NOT: return createPorte_NOT();
			case EditeurcircuitPackage.TABLE_VERITE: return createTableVerite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EditeurcircuitPackage.TYPE_SIGNAL:
				return createTypeSignalFromString(eDataType, initialValue);
			case EditeurcircuitPackage.TYPE_PORTE:
				return createTypePorteFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EditeurcircuitPackage.TYPE_SIGNAL:
				return convertTypeSignalToString(eDataType, instanceValue);
			case EditeurcircuitPackage.TYPE_PORTE:
				return convertTypePorteToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit createCircuit() {
		CircuitImpl circuit = new CircuitImpl();
		return circuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte createPorte() {
		PorteImpl porte = new PorteImpl();
		return porte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte_AND createPorte_AND() {
		Porte_ANDImpl porte_AND = new Porte_ANDImpl();
		return porte_AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte_OR createPorte_OR() {
		Porte_ORImpl porte_OR = new Porte_ORImpl();
		return porte_OR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte_NOT createPorte_NOT() {
		Porte_NOTImpl porte_NOT = new Porte_NOTImpl();
		return porte_NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSignal createTypeSignalFromString(EDataType eDataType, String initialValue) {
		TypeSignal result = TypeSignal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeSignalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePorte createTypePorteFromString(EDataType eDataType, String initialValue) {
		TypePorte result = TypePorte.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypePorteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditeurcircuitPackage getEditeurcircuitPackage() {
		return (EditeurcircuitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EditeurcircuitPackage getPackage() {
		return EditeurcircuitPackage.eINSTANCE;
	}

	@Override
	public TableVerite createTableVerite() {
		// TODO Auto-generated method stub
		return null;
	}

} //EditeurcircuitFactoryImpl
