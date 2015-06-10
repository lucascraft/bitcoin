/**
 */
package net.sf.smbt.btc.genericpools.impl;

import static net.sf.smbt.btc.genericpools.GenericpoolsPackage.SETTING;
import net.sf.smbt.btc.genericpools.AsicBatchWork;
import net.sf.smbt.btc.genericpools.GenericpoolsFactory;
import net.sf.smbt.btc.genericpools.GenericpoolsPackage;
import net.sf.smbt.btc.genericpools.PoolConfig;
import net.sf.smbt.btc.genericpools.PoolsManager;
import net.sf.smbt.btc.genericpools.Setting;
import net.sf.smbt.btc.pools.utils.getwork.miner.WorkState;
import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericpoolsPackageImpl extends EPackageImpl implements GenericpoolsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolsManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asicBatchWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workStateEDataType = null;

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
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericpoolsPackageImpl() {
		super(eNS_URI, GenericpoolsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenericpoolsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericpoolsPackage init() {
		if (isInited) return (GenericpoolsPackage)EPackage.Registry.INSTANCE.getEPackage(GenericpoolsPackage.eNS_URI);

		// Obtain or create and register package
		GenericpoolsPackageImpl theGenericpoolsPackage = (GenericpoolsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenericpoolsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenericpoolsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XcpPackage.eINSTANCE.eClass();
		EnginePackage.eINSTANCE.eClass();
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGenericpoolsPackage.createPackageContents();

		// Initialize created meta-data
		theGenericpoolsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenericpoolsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericpoolsPackage.eNS_URI, theGenericpoolsPackage);
		return theGenericpoolsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoolConfig() {
		return poolConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolConfig_Url() {
		return (EAttribute)poolConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolConfig_User() {
		return (EAttribute)poolConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolConfig_Pwd() {
		return (EAttribute)poolConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolConfig_Worker() {
		return (EAttribute)poolConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolConfig_Key() {
		return (EAttribute)poolConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoolConfig_Settings() {
		return (EReference)poolConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolConfig_Port() {
		return (EAttribute)poolConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolConfig_Pool() {
		return (EAttribute)poolConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoolConfig_LastAddress() {
		return (EReference)poolConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetting() {
		return settingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetting_Key() {
		return (EAttribute)settingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetting_Value() {
		return (EAttribute)settingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoolsManager() {
		return poolsManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolsManager_Name() {
		return (EAttribute)poolsManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoolsManager_Configurations() {
		return (EReference)poolsManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsicBatchWork() {
		return asicBatchWorkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsicBatchWork_Data() {
		return (EAttribute)asicBatchWorkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsicBatchWork_AsicDevicePipe() {
		return (EReference)asicBatchWorkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWorkState() {
		return workStateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericpoolsFactory getGenericpoolsFactory() {
		return (GenericpoolsFactory)getEFactoryInstance();
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
		poolConfigEClass = createEClass(POOL_CONFIG);
		createEAttribute(poolConfigEClass, POOL_CONFIG__URL);
		createEAttribute(poolConfigEClass, POOL_CONFIG__USER);
		createEAttribute(poolConfigEClass, POOL_CONFIG__PWD);
		createEAttribute(poolConfigEClass, POOL_CONFIG__WORKER);
		createEAttribute(poolConfigEClass, POOL_CONFIG__KEY);
		createEReference(poolConfigEClass, POOL_CONFIG__SETTINGS);
		createEAttribute(poolConfigEClass, POOL_CONFIG__PORT);
		createEAttribute(poolConfigEClass, POOL_CONFIG__POOL);
		createEReference(poolConfigEClass, POOL_CONFIG__LAST_ADDRESS);

		settingEClass = createEClass(SETTING);
		createEAttribute(settingEClass, SETTING__KEY);
		createEAttribute(settingEClass, SETTING__VALUE);

		poolsManagerEClass = createEClass(POOLS_MANAGER);
		createEAttribute(poolsManagerEClass, POOLS_MANAGER__NAME);
		createEReference(poolsManagerEClass, POOLS_MANAGER__CONFIGURATIONS);

		asicBatchWorkEClass = createEClass(ASIC_BATCH_WORK);
		createEAttribute(asicBatchWorkEClass, ASIC_BATCH_WORK__DATA);
		createEReference(asicBatchWorkEClass, ASIC_BATCH_WORK__ASIC_DEVICE_PIPE);

		// Create data types
		workStateEDataType = createEDataType(WORK_STATE);
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
		XcpPackage theXcpPackage = (XcpPackage)EPackage.Registry.INSTANCE.getEPackage(XcpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		poolConfigEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(poolConfigEClass, PoolConfig.class, "PoolConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoolConfig_Url(), ecorePackage.getEString(), "url", null, 0, 1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolConfig_User(), ecorePackage.getEString(), "user", null, 0, 1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolConfig_Pwd(), ecorePackage.getEString(), "pwd", null, 0, 1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolConfig_Worker(), ecorePackage.getEString(), "worker", null, 0, 1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolConfig_Key(), ecorePackage.getEString(), "key", null, 0, 1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoolConfig_Settings(), this.getSetting(), null, "settings", null, 0, -1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolConfig_Port(), ecorePackage.getEString(), "port", null, 0, 1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolConfig_Pool(), ecorePackage.getEString(), "pool", null, 0, 1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoolConfig_LastAddress(), theXcpPackage.getXCPAddress(), null, "lastAddress", null, 0, 1, PoolConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingEClass, Setting.class, "Setting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetting_Key(), ecorePackage.getEString(), "key", null, 0, 1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetting_Value(), ecorePackage.getEString(), "value", null, 0, 1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolsManagerEClass, PoolsManager.class, "PoolsManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoolsManager_Name(), ecorePackage.getEString(), "name", null, 0, 1, PoolsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoolsManager_Configurations(), this.getPoolConfig(), null, "configurations", null, 0, -1, PoolsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asicBatchWorkEClass, AsicBatchWork.class, "AsicBatchWork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsicBatchWork_Data(), this.getWorkState(), "data", null, 0, 1, AsicBatchWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsicBatchWork_AsicDevicePipe(), theXcpPackage.getXCPAddress(), null, "asicDevicePipe", null, 0, 1, AsicBatchWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(workStateEDataType, WorkState.class, "WorkState", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GenericpoolsPackageImpl
