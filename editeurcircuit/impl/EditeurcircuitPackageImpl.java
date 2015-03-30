/**
 */
package editeurcircuit.impl;

import editeurcircuit.Circuit;
import editeurcircuit.EditeurcircuitFactory;
import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Porte;
import editeurcircuit.Porte_AND;
import editeurcircuit.Porte_NOT;
import editeurcircuit.Porte_OR;
import editeurcircuit.Signal;
import editeurcircuit.TypePorte;
import editeurcircuit.TypeSignal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditeurcircuitPackageImpl extends EPackageImpl implements EditeurcircuitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porte_ANDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porte_OREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porte_NOTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeSignalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typePorteEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see editeurcircuit.EditeurcircuitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EditeurcircuitPackageImpl() {
		super(eNS_URI, EditeurcircuitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EditeurcircuitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EditeurcircuitPackage init() {
		if (isInited) return (EditeurcircuitPackage)EPackage.Registry.INSTANCE.getEPackage(EditeurcircuitPackage.eNS_URI);

		// Obtain or create and register package
		EditeurcircuitPackageImpl theEditeurcircuitPackage = (EditeurcircuitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditeurcircuitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditeurcircuitPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEditeurcircuitPackage.createPackageContents();

		// Initialize created meta-data
		theEditeurcircuitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEditeurcircuitPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EditeurcircuitPackage.eNS_URI, theEditeurcircuitPackage);
		return theEditeurcircuitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuit() {
		return circuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuit_Valide() {
		return (EAttribute)circuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuit_Sauvegarder() {
		return (EAttribute)circuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_EstDefinitPar() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_EstCompose() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuit_ID() {
		return (EAttribute)circuitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuit_PORTE_COMPTEUR() {
		return (EAttribute)circuitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__AjouterPorte__TypePorte() {
		return circuitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Valider() {
		return circuitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__SupprimerPorte__int() {
		return circuitEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__AjouterSignal__TypeSignal() {
		return circuitEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__SupprimerSignal__int() {
		return circuitEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Sauvegarder() {
		return circuitEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignal_ID() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignal_Type() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignal_Nom() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignal_Lien() {
		return (EAttribute)signalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorte() {
		return porteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_ID() {
		return (EAttribute)porteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_Nom() {
		return (EAttribute)porteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPorte__Supprimer() {
		return porteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorte_AND() {
		return porte_ANDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_AND_Entree1() {
		return (EAttribute)porte_ANDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_AND_Entree2() {
		return (EAttribute)porte_ANDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_AND_Sortie1() {
		return (EAttribute)porte_ANDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorte_OR() {
		return porte_OREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_OR_Entree1() {
		return (EAttribute)porte_OREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_OR_Entree2() {
		return (EAttribute)porte_OREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_OR_Sortie1() {
		return (EAttribute)porte_OREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorte_NOT() {
		return porte_NOTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_NOT_Entree1() {
		return (EAttribute)porte_NOTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_NOT_Sortie1() {
		return (EAttribute)porte_NOTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeSignal() {
		return typeSignalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypePorte() {
		return typePorteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditeurcircuitFactory getEditeurcircuitFactory() {
		return (EditeurcircuitFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		circuitEClass = createEClass(CIRCUIT);
		createEAttribute(circuitEClass, CIRCUIT__VALIDE);
		createEAttribute(circuitEClass, CIRCUIT__SAUVEGARDER);
		createEReference(circuitEClass, CIRCUIT__EST_DEFINIT_PAR);
		createEReference(circuitEClass, CIRCUIT__EST_COMPOSE);
		createEAttribute(circuitEClass, CIRCUIT__ID);
		createEAttribute(circuitEClass, CIRCUIT__PORTE_COMPTEUR);
		createEOperation(circuitEClass, CIRCUIT___AJOUTER_PORTE__TYPEPORTE);
		createEOperation(circuitEClass, CIRCUIT___VALIDER);
		createEOperation(circuitEClass, CIRCUIT___SUPPRIMER_PORTE__INT);
		createEOperation(circuitEClass, CIRCUIT___AJOUTER_SIGNAL__TYPESIGNAL);
		createEOperation(circuitEClass, CIRCUIT___SUPPRIMER_SIGNAL__INT);
		createEOperation(circuitEClass, CIRCUIT___SAUVEGARDER);

		signalEClass = createEClass(SIGNAL);
		createEAttribute(signalEClass, SIGNAL__ID);
		createEAttribute(signalEClass, SIGNAL__TYPE);
		createEAttribute(signalEClass, SIGNAL__NOM);
		createEAttribute(signalEClass, SIGNAL__LIEN);

		porteEClass = createEClass(PORTE);
		createEAttribute(porteEClass, PORTE__ID);
		createEAttribute(porteEClass, PORTE__NOM);
		createEOperation(porteEClass, PORTE___SUPPRIMER);

		porte_ANDEClass = createEClass(PORTE_AND);
		createEAttribute(porte_ANDEClass, PORTE_AND__ENTREE1);
		createEAttribute(porte_ANDEClass, PORTE_AND__ENTREE2);
		createEAttribute(porte_ANDEClass, PORTE_AND__SORTIE1);

		porte_OREClass = createEClass(PORTE_OR);
		createEAttribute(porte_OREClass, PORTE_OR__ENTREE1);
		createEAttribute(porte_OREClass, PORTE_OR__ENTREE2);
		createEAttribute(porte_OREClass, PORTE_OR__SORTIE1);

		porte_NOTEClass = createEClass(PORTE_NOT);
		createEAttribute(porte_NOTEClass, PORTE_NOT__ENTREE1);
		createEAttribute(porte_NOTEClass, PORTE_NOT__SORTIE1);

		// Create enums
		typeSignalEEnum = createEEnum(TYPE_SIGNAL);
		typePorteEEnum = createEEnum(TYPE_PORTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		porte_ANDEClass.getESuperTypes().add(this.getPorte());
		porte_OREClass.getESuperTypes().add(this.getPorte());
		porte_NOTEClass.getESuperTypes().add(this.getPorte());

		// Initialize classes, features, and operations; add parameters
		initEClass(circuitEClass, Circuit.class, "Circuit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircuit_Valide(), ecorePackage.getEBoolean(), "Valide", null, 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuit_Sauvegarder(), ecorePackage.getEBoolean(), "Sauvegarder", null, 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuit_EstDefinitPar(), this.getSignal(), null, "estDefinitPar", null, 0, 10, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuit_EstCompose(), this.getPorte(), null, "estCompose", null, 0, 50, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuit_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuit_PORTE_COMPTEUR(), ecorePackage.getEInt(), "PORTE_COMPTEUR", "0", 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCircuit__AjouterPorte__TypePorte(), null, "AjouterPorte", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypePorte(), "p_typePorte", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuit__Valider(), null, "Valider", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__SupprimerPorte__int(), null, "SupprimerPorte", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "p_ID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__AjouterSignal__TypeSignal(), null, "AjouterSignal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeSignal(), "p_typeSignal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__SupprimerSignal__int(), null, "SupprimerSignal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "p_ID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuit__Sauvegarder(), null, "Sauvegarder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignal_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_Type(), this.getTypeSignal(), "Type", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_Lien(), ecorePackage.getEInt(), "Lien", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(porteEClass, Porte.class, "Porte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPorte_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Porte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPorte_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, Porte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPorte__Supprimer(), null, "Supprimer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(porte_ANDEClass, Porte_AND.class, "Porte_AND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPorte_AND_Entree1(), ecorePackage.getEInt(), "Entree1", null, 0, 1, Porte_AND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPorte_AND_Entree2(), ecorePackage.getEInt(), "Entree2", null, 0, 1, Porte_AND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPorte_AND_Sortie1(), ecorePackage.getEInt(), "Sortie1", null, 0, 1, Porte_AND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(porte_OREClass, Porte_OR.class, "Porte_OR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPorte_OR_Entree1(), ecorePackage.getEInt(), "Entree1", null, 0, 1, Porte_OR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPorte_OR_Entree2(), ecorePackage.getEInt(), "Entree2", null, 0, 1, Porte_OR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPorte_OR_Sortie1(), ecorePackage.getEInt(), "Sortie1", null, 0, 1, Porte_OR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(porte_NOTEClass, Porte_NOT.class, "Porte_NOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPorte_NOT_Entree1(), ecorePackage.getEInt(), "Entree1", null, 0, 1, Porte_NOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPorte_NOT_Sortie1(), ecorePackage.getEInt(), "Sortie1", null, 0, 1, Porte_NOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeSignalEEnum, TypeSignal.class, "TypeSignal");
		addEEnumLiteral(typeSignalEEnum, TypeSignal.ENTREE);
		addEEnumLiteral(typeSignalEEnum, TypeSignal.SORTIE);

		initEEnum(typePorteEEnum, TypePorte.class, "TypePorte");
		addEEnumLiteral(typePorteEEnum, TypePorte.AND);
		addEEnumLiteral(typePorteEEnum, TypePorte.OR);
		addEEnumLiteral(typePorteEEnum, TypePorte.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //EditeurcircuitPackageImpl
