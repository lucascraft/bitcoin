/**
 */
package net.sf.smbt.btc.blockchaincmd.impl;

import net.sf.smbt.btc.blockchaincmd.BlockchainCmd;
import net.sf.smbt.btc.blockchaincmd.BlockchaincmdFactory;
import net.sf.smbt.btc.blockchaincmd.BlockchaincmdPackage;

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
public class BlockchaincmdPackageImpl extends EPackageImpl implements BlockchaincmdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockchainCmdEClass = null;

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
	 * @see net.sf.smbt.btc.blockchaincmd.BlockchaincmdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BlockchaincmdPackageImpl() {
		super(eNS_URI, BlockchaincmdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BlockchaincmdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BlockchaincmdPackage init() {
		if (isInited) return (BlockchaincmdPackage)EPackage.Registry.INSTANCE.getEPackage(BlockchaincmdPackage.eNS_URI);

		// Obtain or create and register package
		BlockchaincmdPackageImpl theBlockchaincmdPackage = (BlockchaincmdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BlockchaincmdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BlockchaincmdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HttpcmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBlockchaincmdPackage.createPackageContents();

		// Initialize created meta-data
		theBlockchaincmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBlockchaincmdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlockchaincmdPackage.eNS_URI, theBlockchaincmdPackage);
		return theBlockchaincmdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockchainCmd() {
		return blockchainCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockchainCmd_JsonRcv() {
		return (EAttribute)blockchainCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockchainCmd_JsonSnd() {
		return (EAttribute)blockchainCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchaincmdFactory getBlockchaincmdFactory() {
		return (BlockchaincmdFactory)getEFactoryInstance();
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
		blockchainCmdEClass = createEClass(BLOCKCHAIN_CMD);
		createEAttribute(blockchainCmdEClass, BLOCKCHAIN_CMD__JSON_RCV);
		createEAttribute(blockchainCmdEClass, BLOCKCHAIN_CMD__JSON_SND);
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
		blockchainCmdEClass.getESuperTypes().add(theHttpcmdPackage.getHttpCommCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(blockchainCmdEClass, BlockchainCmd.class, "BlockchainCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockchainCmd_JsonRcv(), ecorePackage.getEString(), "jsonRcv", null, 0, 1, BlockchainCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockchainCmd_JsonSnd(), ecorePackage.getEString(), "jsonSnd", null, 0, 1, BlockchainCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BlockchaincmdPackageImpl
