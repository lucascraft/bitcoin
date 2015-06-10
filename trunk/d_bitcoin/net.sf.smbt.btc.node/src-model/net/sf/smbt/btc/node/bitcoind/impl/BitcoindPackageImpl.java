/**
 */
package net.sf.smbt.btc.node.bitcoind.impl;

import net.sf.smbt.btc.node.bitcoind.BitcoinCmd;
import net.sf.smbt.btc.node.bitcoind.BitcoindFactory;
import net.sf.smbt.btc.node.bitcoind.BitcoindPackage;
import net.sf.smbt.btc.node.bitcoind.GetInfoCmd;
import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BitcoindPackageImpl extends EPackageImpl implements BitcoindPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitcoinCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getInfoCmdEClass = null;

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
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoindPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BitcoindPackageImpl() {
		super(eNS_URI, BitcoindFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BitcoindPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BitcoindPackage init() {
		if (isInited) return (BitcoindPackage)EPackage.Registry.INSTANCE.getEPackage(BitcoindPackage.eNS_URI);

		// Obtain or create and register package
		BitcoindPackageImpl theBitcoindPackage = (BitcoindPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BitcoindPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BitcoindPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HttpcmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBitcoindPackage.createPackageContents();

		// Initialize created meta-data
		theBitcoindPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBitcoindPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BitcoindPackage.eNS_URI, theBitcoindPackage);
		return theBitcoindPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitcoinCmd() {
		return bitcoinCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinCmd_JsonRcv() {
		return (EAttribute)bitcoinCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinCmd_JsonSnd() {
		return (EAttribute)bitcoinCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinCmd_BtcAddr() {
		return (EAttribute)bitcoinCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetInfoCmd() {
		return getInfoCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInfoCmd_Balance() {
		return (EAttribute)getInfoCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoindFactory getBitcoindFactory() {
		return (BitcoindFactory)getEFactoryInstance();
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
		bitcoinCmdEClass = createEClass(BITCOIN_CMD);
		createEAttribute(bitcoinCmdEClass, BITCOIN_CMD__JSON_RCV);
		createEAttribute(bitcoinCmdEClass, BITCOIN_CMD__JSON_SND);
		createEAttribute(bitcoinCmdEClass, BITCOIN_CMD__BTC_ADDR);

		getInfoCmdEClass = createEClass(GET_INFO_CMD);
		createEAttribute(getInfoCmdEClass, GET_INFO_CMD__BALANCE);
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

		// Obtain other dependent packages
		HttpcmdPackage theHttpcmdPackage = (HttpcmdPackage)EPackage.Registry.INSTANCE.getEPackage(HttpcmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bitcoinCmdEClass.getESuperTypes().add(theHttpcmdPackage.getHttpCommCmd());
		getInfoCmdEClass.getESuperTypes().add(this.getBitcoinCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(bitcoinCmdEClass, BitcoinCmd.class, "BitcoinCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitcoinCmd_JsonRcv(), ecorePackage.getEString(), "jsonRcv", null, 0, 1, BitcoinCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinCmd_JsonSnd(), ecorePackage.getEString(), "jsonSnd", null, 0, 1, BitcoinCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinCmd_BtcAddr(), ecorePackage.getEString(), "btcAddr", null, 0, 1, BitcoinCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getInfoCmdEClass, GetInfoCmd.class, "GetInfoCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetInfoCmd_Balance(), ecorePackage.getEDouble(), "balance", null, 0, 1, GetInfoCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BitcoindPackageImpl
