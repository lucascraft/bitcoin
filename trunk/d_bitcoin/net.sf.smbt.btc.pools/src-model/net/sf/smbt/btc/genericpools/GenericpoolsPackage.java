/**
 */
package net.sf.smbt.btc.genericpools;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.genericpools.GenericpoolsFactory
 * @model kind="package"
 * @generated
 */
public interface GenericpoolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericpools";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericpools/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genericpools";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericpoolsPackage eINSTANCE = net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl <em>Pool Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.genericpools.impl.PoolConfigImpl
	 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getPoolConfig()
	 * @generated
	 */
	int POOL_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__URL = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__USER = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__PWD = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Worker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__WORKER = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__KEY = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__SETTINGS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__PORT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__POOL = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG__LAST_ADDRESS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Pool Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_CONFIG_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.genericpools.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.genericpools.impl.SettingImpl
	 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getSetting()
	 * @generated
	 */
	int SETTING = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.genericpools.impl.PoolsManagerImpl <em>Pools Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.genericpools.impl.PoolsManagerImpl
	 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getPoolsManager()
	 * @generated
	 */
	int POOLS_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLS_MANAGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLS_MANAGER__CONFIGURATIONS = 1;

	/**
	 * The number of structural features of the '<em>Pools Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLS_MANAGER_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.genericpools.impl.AsicBatchWorkImpl <em>Asic Batch Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.genericpools.impl.AsicBatchWorkImpl
	 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getAsicBatchWork()
	 * @generated
	 */
	int ASIC_BATCH_WORK = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIC_BATCH_WORK__DATA = 0;

	/**
	 * The feature id for the '<em><b>Asic Device Pipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIC_BATCH_WORK__ASIC_DEVICE_PIPE = 1;

	/**
	 * The number of structural features of the '<em>Asic Batch Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIC_BATCH_WORK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Work State</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.utils.getwork.miner.WorkState
	 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getWorkState()
	 * @generated
	 */
	int WORK_STATE = 4;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.genericpools.PoolConfig <em>Pool Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool Config</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig
	 * @generated
	 */
	EClass getPoolConfig();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.PoolConfig#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getUrl()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EAttribute getPoolConfig_Url();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.PoolConfig#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getUser()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EAttribute getPoolConfig_User();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.PoolConfig#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getPwd()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EAttribute getPoolConfig_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.PoolConfig#getWorker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getWorker()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EAttribute getPoolConfig_Worker();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.PoolConfig#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getKey()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EAttribute getPoolConfig_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.genericpools.PoolConfig#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getSettings()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EReference getPoolConfig_Settings();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.PoolConfig#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getPort()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EAttribute getPoolConfig_Port();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.PoolConfig#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getPool()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EAttribute getPoolConfig_Pool();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.genericpools.PoolConfig#getLastAddress <em>Last Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Address</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig#getLastAddress()
	 * @see #getPoolConfig()
	 * @generated
	 */
	EReference getPoolConfig_LastAddress();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.genericpools.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see net.sf.smbt.btc.genericpools.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.Setting#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.sf.smbt.btc.genericpools.Setting#getKey()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Key();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.Setting#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.btc.genericpools.Setting#getValue()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.genericpools.PoolsManager <em>Pools Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pools Manager</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolsManager
	 * @generated
	 */
	EClass getPoolsManager();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.PoolsManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolsManager#getName()
	 * @see #getPoolsManager()
	 * @generated
	 */
	EAttribute getPoolsManager_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.genericpools.PoolsManager#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see net.sf.smbt.btc.genericpools.PoolsManager#getConfigurations()
	 * @see #getPoolsManager()
	 * @generated
	 */
	EReference getPoolsManager_Configurations();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.genericpools.AsicBatchWork <em>Asic Batch Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asic Batch Work</em>'.
	 * @see net.sf.smbt.btc.genericpools.AsicBatchWork
	 * @generated
	 */
	EClass getAsicBatchWork();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.genericpools.AsicBatchWork#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.btc.genericpools.AsicBatchWork#getData()
	 * @see #getAsicBatchWork()
	 * @generated
	 */
	EAttribute getAsicBatchWork_Data();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.genericpools.AsicBatchWork#getAsicDevicePipe <em>Asic Device Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asic Device Pipe</em>'.
	 * @see net.sf.smbt.btc.genericpools.AsicBatchWork#getAsicDevicePipe()
	 * @see #getAsicBatchWork()
	 * @generated
	 */
	EReference getAsicBatchWork_AsicDevicePipe();

	/**
	 * Returns the meta object for data type '{@link net.sf.smbt.btc.pools.utils.getwork.miner.WorkState <em>Work State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Work State</em>'.
	 * @see net.sf.smbt.btc.pools.utils.getwork.miner.WorkState
	 * @model instanceClass="net.sf.smbt.btc.pools.utils.getwork.miner.WorkState"
	 * @generated
	 */
	EDataType getWorkState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericpoolsFactory getGenericpoolsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl <em>Pool Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.genericpools.impl.PoolConfigImpl
		 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getPoolConfig()
		 * @generated
		 */
		EClass POOL_CONFIG = eINSTANCE.getPoolConfig();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_CONFIG__URL = eINSTANCE.getPoolConfig_Url();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_CONFIG__USER = eINSTANCE.getPoolConfig_User();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_CONFIG__PWD = eINSTANCE.getPoolConfig_Pwd();

		/**
		 * The meta object literal for the '<em><b>Worker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_CONFIG__WORKER = eINSTANCE.getPoolConfig_Worker();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_CONFIG__KEY = eINSTANCE.getPoolConfig_Key();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL_CONFIG__SETTINGS = eINSTANCE.getPoolConfig_Settings();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_CONFIG__PORT = eINSTANCE.getPoolConfig_Port();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_CONFIG__POOL = eINSTANCE.getPoolConfig_Pool();

		/**
		 * The meta object literal for the '<em><b>Last Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL_CONFIG__LAST_ADDRESS = eINSTANCE.getPoolConfig_LastAddress();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.genericpools.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.genericpools.impl.SettingImpl
		 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getSetting()
		 * @generated
		 */
		EClass SETTING = eINSTANCE.getSetting();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__KEY = eINSTANCE.getSetting_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__VALUE = eINSTANCE.getSetting_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.genericpools.impl.PoolsManagerImpl <em>Pools Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.genericpools.impl.PoolsManagerImpl
		 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getPoolsManager()
		 * @generated
		 */
		EClass POOLS_MANAGER = eINSTANCE.getPoolsManager();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOLS_MANAGER__NAME = eINSTANCE.getPoolsManager_Name();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOLS_MANAGER__CONFIGURATIONS = eINSTANCE.getPoolsManager_Configurations();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.genericpools.impl.AsicBatchWorkImpl <em>Asic Batch Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.genericpools.impl.AsicBatchWorkImpl
		 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getAsicBatchWork()
		 * @generated
		 */
		EClass ASIC_BATCH_WORK = eINSTANCE.getAsicBatchWork();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIC_BATCH_WORK__DATA = eINSTANCE.getAsicBatchWork_Data();

		/**
		 * The meta object literal for the '<em><b>Asic Device Pipe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIC_BATCH_WORK__ASIC_DEVICE_PIPE = eINSTANCE.getAsicBatchWork_AsicDevicePipe();

		/**
		 * The meta object literal for the '<em>Work State</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.utils.getwork.miner.WorkState
		 * @see net.sf.smbt.btc.genericpools.impl.GenericpoolsPackageImpl#getWorkState()
		 * @generated
		 */
		EDataType WORK_STATE = eINSTANCE.getWorkState();

	}

} //GenericpoolsPackage
