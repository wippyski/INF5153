/**
 */
package editeurcircuit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see editeurcircuit.EditeurcircuitFactory
 * @model kind="package"
 * @generated
 */
public interface EditeurcircuitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "editeurcircuit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/editeurcircuit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "editeurcircuit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditeurcircuitPackage eINSTANCE = editeurcircuit.impl.EditeurcircuitPackageImpl.init();

	/**
	 * The meta object id for the '{@link editeurcircuit.impl.CircuitImpl <em>Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.impl.CircuitImpl
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getCircuit()
	 * @generated
	 */
	int CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__VALIDE = 0;

	/**
	 * The feature id for the '<em><b>Sauvegarder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__SAUVEGARDER = 1;

	/**
	 * The feature id for the '<em><b>Est Definit Par</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__EST_DEFINIT_PAR = 2;

	/**
	 * The feature id for the '<em><b>Est Compose</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__EST_COMPOSE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__ID = 4;

	/**
	 * The feature id for the '<em><b>New EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__NEW_EREFERENCE3 = 5;

	/**
	 * The number of structural features of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Ajouter Porte</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___AJOUTER_PORTE__TYPEPORTE = 0;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___VALIDER = 1;

	/**
	 * The operation id for the '<em>Supprimer Porte</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___SUPPRIMER_PORTE__INT = 2;

	/**
	 * The operation id for the '<em>Ajouter Signal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___AJOUTER_SIGNAL__TYPESIGNAL = 3;

	/**
	 * The operation id for the '<em>Supprimer Signal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___SUPPRIMER_SIGNAL__INT = 4;

	/**
	 * The number of operations of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link editeurcircuit.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.impl.SignalImpl
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NOM = 2;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__LIEN = 3;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link editeurcircuit.impl.PorteImpl <em>Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.impl.PorteImpl
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getPorte()
	 * @generated
	 */
	int PORTE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__ID = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NOM = 1;

	/**
	 * The number of structural features of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link editeurcircuit.impl.Porte_ANDImpl <em>Porte AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.impl.Porte_ANDImpl
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getPorte_AND()
	 * @generated
	 */
	int PORTE_AND = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_AND__ID = PORTE__ID;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_AND__NOM = PORTE__NOM;

	/**
	 * The feature id for the '<em><b>Entree2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_AND__ENTREE2 = PORTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entree1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_AND__ENTREE1 = PORTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sortie1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_AND__SORTIE1 = PORTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Porte AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_AND_FEATURE_COUNT = PORTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Porte AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_AND_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editeurcircuit.impl.Porte_ORImpl <em>Porte OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.impl.Porte_ORImpl
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getPorte_OR()
	 * @generated
	 */
	int PORTE_OR = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OR__ID = PORTE__ID;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OR__NOM = PORTE__NOM;

	/**
	 * The feature id for the '<em><b>Entree2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OR__ENTREE2 = PORTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entree1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OR__ENTREE1 = PORTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sortie1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OR__SORTIE1 = PORTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Porte OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OR_FEATURE_COUNT = PORTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Porte OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OR_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editeurcircuit.impl.Porte_NOTImpl <em>Porte NOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.impl.Porte_NOTImpl
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getPorte_NOT()
	 * @generated
	 */
	int PORTE_NOT = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__ID = PORTE__ID;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__NOM = PORTE__NOM;

	/**
	 * The feature id for the '<em><b>Entree1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__ENTREE1 = PORTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sortie1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__SORTIE1 = PORTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Porte NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT_FEATURE_COUNT = PORTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Porte NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editeurcircuit.TableVeriteObserver <em>Table Verite Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.TableVeriteObserver
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getTableVeriteObserver()
	 * @generated
	 */
	int TABLE_VERITE_OBSERVER = 6;

	/**
	 * The feature id for the '<em><b>Liste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_OBSERVER__LISTE = 0;

	/**
	 * The number of structural features of the '<em>Table Verite Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_OBSERVER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Attacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_OBSERVER___ATTACHER = 0;

	/**
	 * The operation id for the '<em>Detacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_OBSERVER___DETACHER = 1;

	/**
	 * The operation id for the '<em>Notifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_OBSERVER___NOTIFIER = 2;

	/**
	 * The number of operations of the '<em>Table Verite Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_OBSERVER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link editeurcircuit.impl.TableVeriteImpl <em>Table Verite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.impl.TableVeriteImpl
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getTableVerite()
	 * @generated
	 */
	int TABLE_VERITE = 7;

	/**
	 * The feature id for the '<em><b>Liste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE__LISTE = TABLE_VERITE_OBSERVER__LISTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE__TABLE = TABLE_VERITE_OBSERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_FEATURE_COUNT = TABLE_VERITE_OBSERVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Attacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE___ATTACHER = TABLE_VERITE_OBSERVER___ATTACHER;

	/**
	 * The operation id for the '<em>Detacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE___DETACHER = TABLE_VERITE_OBSERVER___DETACHER;

	/**
	 * The operation id for the '<em>Notifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE___NOTIFIER = TABLE_VERITE_OBSERVER___NOTIFIER;

	/**
	 * The operation id for the '<em>Calculer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE___CALCULER = TABLE_VERITE_OBSERVER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_OPERATION_COUNT = TABLE_VERITE_OBSERVER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link editeurcircuit.TypeSignal <em>Type Signal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.TypeSignal
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getTypeSignal()
	 * @generated
	 */
	int TYPE_SIGNAL = 8;

	/**
	 * The meta object id for the '{@link editeurcircuit.TypePorte <em>Type Porte</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editeurcircuit.TypePorte
	 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getTypePorte()
	 * @generated
	 */
	int TYPE_PORTE = 9;


	/**
	 * Returns the meta object for class '{@link editeurcircuit.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit</em>'.
	 * @see editeurcircuit.Circuit
	 * @generated
	 */
	EClass getCircuit();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Circuit#isValide <em>Valide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valide</em>'.
	 * @see editeurcircuit.Circuit#isValide()
	 * @see #getCircuit()
	 * @generated
	 */
	EAttribute getCircuit_Valide();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Circuit#isSauvegarder <em>Sauvegarder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sauvegarder</em>'.
	 * @see editeurcircuit.Circuit#isSauvegarder()
	 * @see #getCircuit()
	 * @generated
	 */
	EAttribute getCircuit_Sauvegarder();

	/**
	 * Returns the meta object for the containment reference list '{@link editeurcircuit.Circuit#getEstDefinitPar <em>Est Definit Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Est Definit Par</em>'.
	 * @see editeurcircuit.Circuit#getEstDefinitPar()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_EstDefinitPar();

	/**
	 * Returns the meta object for the containment reference list '{@link editeurcircuit.Circuit#getEstCompose <em>Est Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Est Compose</em>'.
	 * @see editeurcircuit.Circuit#getEstCompose()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_EstCompose();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Circuit#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see editeurcircuit.Circuit#getID()
	 * @see #getCircuit()
	 * @generated
	 */
	EAttribute getCircuit_ID();

	/**
	 * Returns the meta object for the reference '{@link editeurcircuit.Circuit#getNewEReference3 <em>New EReference3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New EReference3</em>'.
	 * @see editeurcircuit.Circuit#getNewEReference3()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_NewEReference3();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.Circuit#AjouterPorte(editeurcircuit.TypePorte) <em>Ajouter Porte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter Porte</em>' operation.
	 * @see editeurcircuit.Circuit#AjouterPorte(editeurcircuit.TypePorte)
	 * @generated
	 */
	EOperation getCircuit__AjouterPorte__TypePorte();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.Circuit#Valider() <em>Valider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valider</em>' operation.
	 * @see editeurcircuit.Circuit#Valider()
	 * @generated
	 */
	EOperation getCircuit__Valider();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.Circuit#SupprimerPorte(int) <em>Supprimer Porte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer Porte</em>' operation.
	 * @see editeurcircuit.Circuit#SupprimerPorte(int)
	 * @generated
	 */
	EOperation getCircuit__SupprimerPorte__int();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.Circuit#AjouterSignal(editeurcircuit.TypeSignal) <em>Ajouter Signal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter Signal</em>' operation.
	 * @see editeurcircuit.Circuit#AjouterSignal(editeurcircuit.TypeSignal)
	 * @generated
	 */
	EOperation getCircuit__AjouterSignal__TypeSignal();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.Circuit#SupprimerSignal(int) <em>Supprimer Signal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer Signal</em>' operation.
	 * @see editeurcircuit.Circuit#SupprimerSignal(int)
	 * @generated
	 */
	EOperation getCircuit__SupprimerSignal__int();

	/**
	 * Returns the meta object for class '{@link editeurcircuit.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see editeurcircuit.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Signal#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see editeurcircuit.Signal#getID()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_ID();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Signal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see editeurcircuit.Signal#getType()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Type();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Signal#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see editeurcircuit.Signal#getNom()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Nom();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Signal#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see editeurcircuit.Signal#getLien()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Lien();

	/**
	 * Returns the meta object for class '{@link editeurcircuit.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte</em>'.
	 * @see editeurcircuit.Porte
	 * @generated
	 */
	EClass getPorte();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see editeurcircuit.Porte#getID()
	 * @see #getPorte()
	 * @generated
	 */
	EAttribute getPorte_ID();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see editeurcircuit.Porte#getNom()
	 * @see #getPorte()
	 * @generated
	 */
	EAttribute getPorte_Nom();

	/**
	 * Returns the meta object for class '{@link editeurcircuit.Porte_AND <em>Porte AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte AND</em>'.
	 * @see editeurcircuit.Porte_AND
	 * @generated
	 */
	EClass getPorte_AND();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte_AND#getEntree1 <em>Entree1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entree1</em>'.
	 * @see editeurcircuit.Porte_AND#getEntree1()
	 * @see #getPorte_AND()
	 * @generated
	 */
	EAttribute getPorte_AND_Entree1();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte_AND#getEntree2 <em>Entree2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entree2</em>'.
	 * @see editeurcircuit.Porte_AND#getEntree2()
	 * @see #getPorte_AND()
	 * @generated
	 */
	EAttribute getPorte_AND_Entree2();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte_AND#getSortie1 <em>Sortie1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortie1</em>'.
	 * @see editeurcircuit.Porte_AND#getSortie1()
	 * @see #getPorte_AND()
	 * @generated
	 */
	EAttribute getPorte_AND_Sortie1();

	/**
	 * Returns the meta object for class '{@link editeurcircuit.Porte_OR <em>Porte OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte OR</em>'.
	 * @see editeurcircuit.Porte_OR
	 * @generated
	 */
	EClass getPorte_OR();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte_OR#getEntree1 <em>Entree1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entree1</em>'.
	 * @see editeurcircuit.Porte_OR#getEntree1()
	 * @see #getPorte_OR()
	 * @generated
	 */
	EAttribute getPorte_OR_Entree1();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte_OR#getEntree2 <em>Entree2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entree2</em>'.
	 * @see editeurcircuit.Porte_OR#getEntree2()
	 * @see #getPorte_OR()
	 * @generated
	 */
	EAttribute getPorte_OR_Entree2();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte_OR#getSortie1 <em>Sortie1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortie1</em>'.
	 * @see editeurcircuit.Porte_OR#getSortie1()
	 * @see #getPorte_OR()
	 * @generated
	 */
	EAttribute getPorte_OR_Sortie1();

	/**
	 * Returns the meta object for class '{@link editeurcircuit.Porte_NOT <em>Porte NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte NOT</em>'.
	 * @see editeurcircuit.Porte_NOT
	 * @generated
	 */
	EClass getPorte_NOT();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte_NOT#getEntree1 <em>Entree1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entree1</em>'.
	 * @see editeurcircuit.Porte_NOT#getEntree1()
	 * @see #getPorte_NOT()
	 * @generated
	 */
	EAttribute getPorte_NOT_Entree1();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.Porte_NOT#getSortie1 <em>Sortie1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortie1</em>'.
	 * @see editeurcircuit.Porte_NOT#getSortie1()
	 * @see #getPorte_NOT()
	 * @generated
	 */
	EAttribute getPorte_NOT_Sortie1();

	/**
	 * Returns the meta object for class '{@link editeurcircuit.TableVeriteObserver <em>Table Verite Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Verite Observer</em>'.
	 * @see editeurcircuit.TableVeriteObserver
	 * @generated
	 */
	EClass getTableVeriteObserver();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.TableVeriteObserver#getListe <em>Liste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Liste</em>'.
	 * @see editeurcircuit.TableVeriteObserver#getListe()
	 * @see #getTableVeriteObserver()
	 * @generated
	 */
	EAttribute getTableVeriteObserver_Liste();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.TableVeriteObserver#attacher() <em>Attacher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attacher</em>' operation.
	 * @see editeurcircuit.TableVeriteObserver#attacher()
	 * @generated
	 */
	EOperation getTableVeriteObserver__Attacher();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.TableVeriteObserver#detacher() <em>Detacher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detacher</em>' operation.
	 * @see editeurcircuit.TableVeriteObserver#detacher()
	 * @generated
	 */
	EOperation getTableVeriteObserver__Detacher();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.TableVeriteObserver#notifier() <em>Notifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notifier</em>' operation.
	 * @see editeurcircuit.TableVeriteObserver#notifier()
	 * @generated
	 */
	EOperation getTableVeriteObserver__Notifier();

	/**
	 * Returns the meta object for class '{@link editeurcircuit.TableVerite <em>Table Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Verite</em>'.
	 * @see editeurcircuit.TableVerite
	 * @generated
	 */
	EClass getTableVerite();

	/**
	 * Returns the meta object for the attribute '{@link editeurcircuit.TableVerite#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see editeurcircuit.TableVerite#getTable()
	 * @see #getTableVerite()
	 * @generated
	 */
	EAttribute getTableVerite_Table();

	/**
	 * Returns the meta object for the '{@link editeurcircuit.TableVerite#calculer() <em>Calculer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculer</em>' operation.
	 * @see editeurcircuit.TableVerite#calculer()
	 * @generated
	 */
	EOperation getTableVerite__Calculer();

	/**
	 * Returns the meta object for enum '{@link editeurcircuit.TypeSignal <em>Type Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Signal</em>'.
	 * @see editeurcircuit.TypeSignal
	 * @generated
	 */
	EEnum getTypeSignal();

	/**
	 * Returns the meta object for enum '{@link editeurcircuit.TypePorte <em>Type Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Porte</em>'.
	 * @see editeurcircuit.TypePorte
	 * @generated
	 */
	EEnum getTypePorte();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EditeurcircuitFactory getEditeurcircuitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link editeurcircuit.impl.CircuitImpl <em>Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.impl.CircuitImpl
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getCircuit()
		 * @generated
		 */
		EClass CIRCUIT = eINSTANCE.getCircuit();

		/**
		 * The meta object literal for the '<em><b>Valide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT__VALIDE = eINSTANCE.getCircuit_Valide();

		/**
		 * The meta object literal for the '<em><b>Sauvegarder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT__SAUVEGARDER = eINSTANCE.getCircuit_Sauvegarder();

		/**
		 * The meta object literal for the '<em><b>Est Definit Par</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__EST_DEFINIT_PAR = eINSTANCE.getCircuit_EstDefinitPar();

		/**
		 * The meta object literal for the '<em><b>Est Compose</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__EST_COMPOSE = eINSTANCE.getCircuit_EstCompose();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT__ID = eINSTANCE.getCircuit_ID();

		/**
		 * The meta object literal for the '<em><b>New EReference3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__NEW_EREFERENCE3 = eINSTANCE.getCircuit_NewEReference3();

		/**
		 * The meta object literal for the '<em><b>Ajouter Porte</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___AJOUTER_PORTE__TYPEPORTE = eINSTANCE.getCircuit__AjouterPorte__TypePorte();

		/**
		 * The meta object literal for the '<em><b>Valider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___VALIDER = eINSTANCE.getCircuit__Valider();

		/**
		 * The meta object literal for the '<em><b>Supprimer Porte</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___SUPPRIMER_PORTE__INT = eINSTANCE.getCircuit__SupprimerPorte__int();

		/**
		 * The meta object literal for the '<em><b>Ajouter Signal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___AJOUTER_SIGNAL__TYPESIGNAL = eINSTANCE.getCircuit__AjouterSignal__TypeSignal();

		/**
		 * The meta object literal for the '<em><b>Supprimer Signal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___SUPPRIMER_SIGNAL__INT = eINSTANCE.getCircuit__SupprimerSignal__int();

		/**
		 * The meta object literal for the '{@link editeurcircuit.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.impl.SignalImpl
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__ID = eINSTANCE.getSignal_ID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__TYPE = eINSTANCE.getSignal_Type();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__NOM = eINSTANCE.getSignal_Nom();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__LIEN = eINSTANCE.getSignal_Lien();

		/**
		 * The meta object literal for the '{@link editeurcircuit.impl.PorteImpl <em>Porte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.impl.PorteImpl
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getPorte()
		 * @generated
		 */
		EClass PORTE = eINSTANCE.getPorte();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE__ID = eINSTANCE.getPorte_ID();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE__NOM = eINSTANCE.getPorte_Nom();

		/**
		 * The meta object literal for the '{@link editeurcircuit.impl.Porte_ANDImpl <em>Porte AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.impl.Porte_ANDImpl
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getPorte_AND()
		 * @generated
		 */
		EClass PORTE_AND = eINSTANCE.getPorte_AND();

		/**
		 * The meta object literal for the '<em><b>Entree1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_AND__ENTREE1 = eINSTANCE.getPorte_AND_Entree1();

		/**
		 * The meta object literal for the '<em><b>Entree2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_AND__ENTREE2 = eINSTANCE.getPorte_AND_Entree2();

		/**
		 * The meta object literal for the '<em><b>Sortie1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_AND__SORTIE1 = eINSTANCE.getPorte_AND_Sortie1();

		/**
		 * The meta object literal for the '{@link editeurcircuit.impl.Porte_ORImpl <em>Porte OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.impl.Porte_ORImpl
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getPorte_OR()
		 * @generated
		 */
		EClass PORTE_OR = eINSTANCE.getPorte_OR();

		/**
		 * The meta object literal for the '<em><b>Entree1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_OR__ENTREE1 = eINSTANCE.getPorte_OR_Entree1();

		/**
		 * The meta object literal for the '<em><b>Entree2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_OR__ENTREE2 = eINSTANCE.getPorte_OR_Entree2();

		/**
		 * The meta object literal for the '<em><b>Sortie1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_OR__SORTIE1 = eINSTANCE.getPorte_OR_Sortie1();

		/**
		 * The meta object literal for the '{@link editeurcircuit.impl.Porte_NOTImpl <em>Porte NOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.impl.Porte_NOTImpl
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getPorte_NOT()
		 * @generated
		 */
		EClass PORTE_NOT = eINSTANCE.getPorte_NOT();

		/**
		 * The meta object literal for the '<em><b>Entree1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_NOT__ENTREE1 = eINSTANCE.getPorte_NOT_Entree1();

		/**
		 * The meta object literal for the '<em><b>Sortie1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_NOT__SORTIE1 = eINSTANCE.getPorte_NOT_Sortie1();

		/**
		 * The meta object literal for the '{@link editeurcircuit.TableVeriteObserver <em>Table Verite Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.TableVeriteObserver
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getTableVeriteObserver()
		 * @generated
		 */
		EClass TABLE_VERITE_OBSERVER = eINSTANCE.getTableVeriteObserver();

		/**
		 * The meta object literal for the '<em><b>Liste</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_VERITE_OBSERVER__LISTE = eINSTANCE.getTableVeriteObserver_Liste();

		/**
		 * The meta object literal for the '<em><b>Attacher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VERITE_OBSERVER___ATTACHER = eINSTANCE.getTableVeriteObserver__Attacher();

		/**
		 * The meta object literal for the '<em><b>Detacher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VERITE_OBSERVER___DETACHER = eINSTANCE.getTableVeriteObserver__Detacher();

		/**
		 * The meta object literal for the '<em><b>Notifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VERITE_OBSERVER___NOTIFIER = eINSTANCE.getTableVeriteObserver__Notifier();

		/**
		 * The meta object literal for the '{@link editeurcircuit.impl.TableVeriteImpl <em>Table Verite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.impl.TableVeriteImpl
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getTableVerite()
		 * @generated
		 */
		EClass TABLE_VERITE = eINSTANCE.getTableVerite();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_VERITE__TABLE = eINSTANCE.getTableVerite_Table();

		/**
		 * The meta object literal for the '<em><b>Calculer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VERITE___CALCULER = eINSTANCE.getTableVerite__Calculer();

		/**
		 * The meta object literal for the '{@link editeurcircuit.TypeSignal <em>Type Signal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.TypeSignal
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getTypeSignal()
		 * @generated
		 */
		EEnum TYPE_SIGNAL = eINSTANCE.getTypeSignal();

		/**
		 * The meta object literal for the '{@link editeurcircuit.TypePorte <em>Type Porte</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editeurcircuit.TypePorte
		 * @see editeurcircuit.impl.EditeurcircuitPackageImpl#getTypePorte()
		 * @generated
		 */
		EEnum TYPE_PORTE = eINSTANCE.getTypePorte();

	}

} //EditeurcircuitPackage
