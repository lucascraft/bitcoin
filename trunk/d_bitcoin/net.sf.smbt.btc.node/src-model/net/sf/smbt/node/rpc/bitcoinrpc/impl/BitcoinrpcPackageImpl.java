/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc.impl;

import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcFactory;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage;
import net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo;
import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BitcoinrpcPackageImpl extends EPackageImpl implements BitcoinrpcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitcoinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btcInfoEClass = null;

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
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BitcoinrpcPackageImpl() {
		super(eNS_URI, BitcoinrpcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BitcoinrpcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BitcoinrpcPackage init() {
		if (isInited) return (BitcoinrpcPackage)EPackage.Registry.INSTANCE.getEPackage(BitcoinrpcPackage.eNS_URI);

		// Obtain or create and register package
		BitcoinrpcPackageImpl theBitcoinrpcPackage = (BitcoinrpcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BitcoinrpcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BitcoinrpcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EnginePackage.eINSTANCE.eClass();
		CmdPackage.eINSTANCE.eClass();
		XcpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBitcoinrpcPackage.createPackageContents();

		// Initialize created meta-data
		theBitcoinrpcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBitcoinrpcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BitcoinrpcPackage.eNS_URI, theBitcoinrpcPackage);
		return theBitcoinrpcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitcoinNode() {
		return bitcoinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitcoinNode_Info() {
		return (EReference)bitcoinNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinNode_BtcAddr() {
		return (EAttribute)bitcoinNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitcoinNode_InetAddr() {
		return (EReference)bitcoinNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBtcInfo() {
		return btcInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBtcInfo_Balance() {
		return (EAttribute)btcInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBtcInfo_Errors() {
		return (EAttribute)btcInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBtcInfo_Paytxfee() {
		return (EAttribute)btcInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBtcInfo_Connected() {
		return (EAttribute)btcInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBtcInfo_Testnet() {
		return (EAttribute)btcInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBtcInfo_Difficulty() {
		return (EAttribute)btcInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBtcInfo_Blocks() {
		return (EAttribute)btcInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoinrpcFactory getBitcoinrpcFactory() {
		return (BitcoinrpcFactory)getEFactoryInstance();
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
		bitcoinNodeEClass = createEClass(BITCOIN_NODE);
		createEReference(bitcoinNodeEClass, BITCOIN_NODE__INFO);
		createEAttribute(bitcoinNodeEClass, BITCOIN_NODE__BTC_ADDR);
		createEReference(bitcoinNodeEClass, BITCOIN_NODE__INET_ADDR);

		btcInfoEClass = createEClass(BTC_INFO);
		createEAttribute(btcInfoEClass, BTC_INFO__BALANCE);
		createEAttribute(btcInfoEClass, BTC_INFO__ERRORS);
		createEAttribute(btcInfoEClass, BTC_INFO__PAYTXFEE);
		createEAttribute(btcInfoEClass, BTC_INFO__CONNECTED);
		createEAttribute(btcInfoEClass, BTC_INFO__TESTNET);
		createEAttribute(btcInfoEClass, BTC_INFO__DIFFICULTY);
		createEAttribute(btcInfoEClass, BTC_INFO__BLOCKS);
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
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		XcpPackage theXcpPackage = (XcpPackage)EPackage.Registry.INSTANCE.getEPackage(XcpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bitcoinNodeEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(bitcoinNodeEClass, BitcoinNode.class, "BitcoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBitcoinNode_Info(), this.getBtcInfo(), null, "info", null, 0, 1, BitcoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinNode_BtcAddr(), theEcorePackage.getEString(), "btcAddr", null, 0, 1, BitcoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBitcoinNode_InetAddr(), theXcpPackage.getXCPAddress(), null, "inetAddr", null, 0, 1, BitcoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btcInfoEClass, BtcInfo.class, "BtcInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBtcInfo_Balance(), theEcorePackage.getEDouble(), "balance", null, 0, 1, BtcInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBtcInfo_Errors(), theEcorePackage.getEString(), "errors", null, 0, 1, BtcInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBtcInfo_Paytxfee(), theEcorePackage.getEFloat(), "paytxfee", null, 0, 1, BtcInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBtcInfo_Connected(), theEcorePackage.getEInt(), "connected", null, 0, 1, BtcInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBtcInfo_Testnet(), theEcorePackage.getEBoolean(), "testnet", null, 0, 1, BtcInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBtcInfo_Difficulty(), theEcorePackage.getEDouble(), "difficulty", null, 0, 1, BtcInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBtcInfo_Blocks(), theEcorePackage.getELong(), "blocks", null, 0, 1, BtcInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BitcoinrpcPackageImpl
