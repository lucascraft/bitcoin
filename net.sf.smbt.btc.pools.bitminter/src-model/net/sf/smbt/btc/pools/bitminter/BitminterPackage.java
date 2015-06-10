/**
 */
package net.sf.smbt.btc.pools.bitminter;

import net.sf.smbt.btc.genericpools.GenericpoolsPackage;

import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.btc.pools.bitminter.BitminterFactory
 * @model kind="package"
 * @generated
 */
public interface BitminterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bitminter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bitminter/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bitminter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BitminterPackage eINSTANCE = net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterCmdImpl <em>Bit Minter Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitMinterCmdImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getBitMinterCmd()
	 * @generated
	 */
	int BIT_MINTER_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CMD__PRIORITY = HttpcmdPackage.HTTP_COMM_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CMD__STAMP = HttpcmdPackage.HTTP_COMM_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CMD__PROPERTIES = HttpcmdPackage.HTTP_COMM_CMD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CMD__METHOD = HttpcmdPackage.HTTP_COMM_CMD__METHOD;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CMD__COMMAND = HttpcmdPackage.HTTP_COMM_CMD__COMMAND;

	/**
	 * The feature id for the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CMD__JSON = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Minter Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CMD_FEATURE_COUNT = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl <em>Bit Minter Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getBitMinterConfig()
	 * @generated
	 */
	int BIT_MINTER_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__URL = GenericpoolsPackage.POOL_CONFIG__URL;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__USER = GenericpoolsPackage.POOL_CONFIG__USER;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__PWD = GenericpoolsPackage.POOL_CONFIG__PWD;

	/**
	 * The feature id for the '<em><b>Worker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__WORKER = GenericpoolsPackage.POOL_CONFIG__WORKER;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__KEY = GenericpoolsPackage.POOL_CONFIG__KEY;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__SETTINGS = GenericpoolsPackage.POOL_CONFIG__SETTINGS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__PORT = GenericpoolsPackage.POOL_CONFIG__PORT;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__POOL = GenericpoolsPackage.POOL_CONFIG__POOL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__NAME = GenericpoolsPackage.POOL_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__STATS = GenericpoolsPackage.POOL_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Round</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__ROUND = GenericpoolsPackage.POOL_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__DATA = GenericpoolsPackage.POOL_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG__SELECTION = GenericpoolsPackage.POOL_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bit Minter Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_MINTER_CONFIG_FEATURE_COUNT = GenericpoolsPackage.POOL_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.PoolStatsImpl <em>Pool Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.PoolStatsImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getPoolStats()
	 * @generated
	 */
	int POOL_STATS = 2;

	/**
	 * The feature id for the '<em><b>Hash Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_STATS__HASH_RATE = 0;

	/**
	 * The feature id for the '<em><b>Active Workers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_STATS__ACTIVE_WORKERS = 1;

	/**
	 * The feature id for the '<em><b>Active Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_STATS__ACTIVE_USERS = 2;

	/**
	 * The feature id for the '<em><b>Dated Rates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_STATS__DATED_RATES = 3;

	/**
	 * The number of structural features of the '<em>Pool Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_STATS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl <em>Pool Round</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getPoolRound()
	 * @generated
	 */
	int POOL_ROUND = 3;

	/**
	 * The feature id for the '<em><b>Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__CHAINS = 0;

	/**
	 * The feature id for the '<em><b>Hash Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__HASH_RATE = 1;

	/**
	 * The feature id for the '<em><b>Active Workers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__ACTIVE_WORKERS = 2;

	/**
	 * The feature id for the '<em><b>Active Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__ACTIVE_USERS = 3;

	/**
	 * The feature id for the '<em><b>Shift Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__SHIFT_ACCEPTED = 4;

	/**
	 * The feature id for the '<em><b>Shift Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__SHIFT_REJECTED = 5;

	/**
	 * The feature id for the '<em><b>Shift Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__SHIFT_DURATION = 6;

	/**
	 * The feature id for the '<em><b>Shift Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__SHIFT_SCORE = 7;

	/**
	 * The feature id for the '<em><b>Round Hash Rates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND__ROUND_HASH_RATES = 8;

	/**
	 * The number of structural features of the '<em>Pool Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_ROUND_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.ChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.ChainImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getChain()
	 * @generated
	 */
	int CHAIN = 4;

	/**
	 * The feature id for the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__ACCEPTED = 0;

	/**
	 * The feature id for the '<em><b>Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__REJECTED = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__DIFFICULTY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN__ID = 4;

	/**
	 * The number of structural features of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl <em>User Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getUserData()
	 * @generated
	 */
	int USER_DATA = 5;

	/**
	 * The feature id for the '<em><b>Active Workers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__ACTIVE_WORKERS = 0;

	/**
	 * The feature id for the '<em><b>Hash Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__HASH_RATE = 1;

	/**
	 * The feature id for the '<em><b>Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__NOW = 2;

	/**
	 * The feature id for the '<em><b>Round Starts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__ROUND_STARTS = 3;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__SHIFT = 4;

	/**
	 * The feature id for the '<em><b>Balances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__BALANCES = 5;

	/**
	 * The feature id for the '<em><b>Workers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__WORKERS = 6;

	/**
	 * The feature id for the '<em><b>User Hash Rates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__USER_HASH_RATES = 7;

	/**
	 * The number of structural features of the '<em>User Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.RoundStartImpl <em>Round Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.RoundStartImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getRoundStart()
	 * @generated
	 */
	int ROUND_START = 6;

	/**
	 * The feature id for the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_START__CHAIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_START__SHIFT = 1;

	/**
	 * The number of structural features of the '<em>Round Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_START_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.ShiftImpl <em>Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.ShiftImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getShift()
	 * @generated
	 */
	int SHIFT = 7;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__START = 0;

	/**
	 * The feature id for the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__ACCEPTED = 1;

	/**
	 * The feature id for the '<em><b>User score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__USER_SCORE = 2;

	/**
	 * The feature id for the '<em><b>Total score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__TOTAL_SCORE = 3;

	/**
	 * The number of structural features of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.BalanceImpl <em>Balance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BalanceImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getBalance()
	 * @generated
	 */
	int BALANCE = 8;

	/**
	 * The feature id for the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCE__CHAIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCE__BALANCE = 1;

	/**
	 * The number of structural features of the '<em>Balance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl <em>Worker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getWorker()
	 * @generated
	 */
	int WORKER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__LAST_WORK = 1;

	/**
	 * The feature id for the '<em><b>Hash Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__HASH_RATE = 2;

	/**
	 * The feature id for the '<em><b>Alive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ALIVE = 3;

	/**
	 * The feature id for the '<em><b>Works</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__WORKS = 4;

	/**
	 * The feature id for the '<em><b>Hash Rates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__HASH_RATES = 5;

	/**
	 * The number of structural features of the '<em>Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl <em>Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.WorkImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getWork()
	 * @generated
	 */
	int WORK = 10;

	/**
	 * The feature id for the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__CHAIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Total Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__TOTAL_ACCEPTED = 1;

	/**
	 * The feature id for the '<em><b>Total Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__TOTAL_REJECTED = 2;

	/**
	 * The feature id for the '<em><b>Round Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__ROUND_ACCEPTED = 3;

	/**
	 * The feature id for the '<em><b>Round Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__ROUND_REJECTED = 4;

	/**
	 * The feature id for the '<em><b>Check Point Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__CHECK_POINT_ACCEPTED = 5;

	/**
	 * The feature id for the '<em><b>Check Point Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__CHECK_POINT_REJECTED = 6;

	/**
	 * The number of structural features of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FEATURE_COUNT = 7;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.DatedRateImpl <em>Dated Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.DatedRateImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getDatedRate()
	 * @generated
	 */
	int DATED_RATE = 11;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_RATE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_RATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Dated Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_RATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.DatedHashRateImpl <em>Dated Hash Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.DatedHashRateImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getDatedHashRate()
	 * @generated
	 */
	int DATED_HASH_RATE = 12;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_HASH_RATE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_HASH_RATE__RATE = 1;

	/**
	 * The number of structural features of the '<em>Dated Hash Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_HASH_RATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.UserHashRateImpl <em>User Hash Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.UserHashRateImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getUserHashRate()
	 * @generated
	 */
	int USER_HASH_RATE = 13;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HASH_RATE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HASH_RATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>User Hash Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HASH_RATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.bitminter.impl.RoundHashRateImpl <em>Round Hash Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.bitminter.impl.RoundHashRateImpl
	 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getRoundHashRate()
	 * @generated
	 */
	int ROUND_HASH_RATE = 14;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_HASH_RATE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_HASH_RATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Round Hash Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_HASH_RATE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.BitMinterCmd <em>Bit Minter Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Minter Cmd</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterCmd
	 * @generated
	 */
	EClass getBitMinterCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.BitMinterCmd#getJson <em>Json</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterCmd#getJson()
	 * @see #getBitMinterCmd()
	 * @generated
	 */
	EAttribute getBitMinterCmd_Json();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig <em>Bit Minter Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Minter Config</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterConfig
	 * @generated
	 */
	EClass getBitMinterConfig();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getName()
	 * @see #getBitMinterConfig()
	 * @generated
	 */
	EAttribute getBitMinterConfig_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stats</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getStats()
	 * @see #getBitMinterConfig()
	 * @generated
	 */
	EReference getBitMinterConfig_Stats();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getRound <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Round</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getRound()
	 * @see #getBitMinterConfig()
	 * @generated
	 */
	EReference getBitMinterConfig_Round();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getData()
	 * @see #getBitMinterConfig()
	 * @generated
	 */
	EReference getBitMinterConfig_Data();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getSelection()
	 * @see #getBitMinterConfig()
	 * @generated
	 */
	EAttribute getBitMinterConfig_Selection();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.PoolStats <em>Pool Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool Stats</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolStats
	 * @generated
	 */
	EClass getPoolStats();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getHashRate <em>Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolStats#getHashRate()
	 * @see #getPoolStats()
	 * @generated
	 */
	EAttribute getPoolStats_HashRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getActiveWorkers <em>Active Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Workers</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolStats#getActiveWorkers()
	 * @see #getPoolStats()
	 * @generated
	 */
	EAttribute getPoolStats_ActiveWorkers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getActiveUsers <em>Active Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Users</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolStats#getActiveUsers()
	 * @see #getPoolStats()
	 * @generated
	 */
	EAttribute getPoolStats_ActiveUsers();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getDatedRates <em>Dated Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dated Rates</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolStats#getDatedRates()
	 * @see #getPoolStats()
	 * @generated
	 */
	EReference getPoolStats_DatedRates();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.PoolRound <em>Pool Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool Round</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound
	 * @generated
	 */
	EClass getPoolRound();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getChains <em>Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chains</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getChains()
	 * @see #getPoolRound()
	 * @generated
	 */
	EReference getPoolRound_Chains();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getHashRate <em>Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getHashRate()
	 * @see #getPoolRound()
	 * @generated
	 */
	EAttribute getPoolRound_HashRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getActiveWorkers <em>Active Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Workers</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getActiveWorkers()
	 * @see #getPoolRound()
	 * @generated
	 */
	EAttribute getPoolRound_ActiveWorkers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getActiveUsers <em>Active Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Users</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getActiveUsers()
	 * @see #getPoolRound()
	 * @generated
	 */
	EAttribute getPoolRound_ActiveUsers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftAccepted <em>Shift Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift Accepted</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftAccepted()
	 * @see #getPoolRound()
	 * @generated
	 */
	EAttribute getPoolRound_ShiftAccepted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftRejected <em>Shift Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift Rejected</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftRejected()
	 * @see #getPoolRound()
	 * @generated
	 */
	EAttribute getPoolRound_ShiftRejected();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftDuration <em>Shift Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift Duration</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftDuration()
	 * @see #getPoolRound()
	 * @generated
	 */
	EAttribute getPoolRound_ShiftDuration();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftScore <em>Shift Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift Score</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftScore()
	 * @see #getPoolRound()
	 * @generated
	 */
	EAttribute getPoolRound_ShiftScore();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getRoundHashRates <em>Round Hash Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Round Hash Rates</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound#getRoundHashRates()
	 * @see #getPoolRound()
	 * @generated
	 */
	EReference getPoolRound_RoundHashRates();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.Chain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Chain
	 * @generated
	 */
	EClass getChain();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Chain#getAccepted <em>Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Chain#getAccepted()
	 * @see #getChain()
	 * @generated
	 */
	EAttribute getChain_Accepted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Chain#getRejected <em>Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejected</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Chain#getRejected()
	 * @see #getChain()
	 * @generated
	 */
	EAttribute getChain_Rejected();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Chain#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Chain#getDuration()
	 * @see #getChain()
	 * @generated
	 */
	EAttribute getChain_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Chain#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Chain#getDifficulty()
	 * @see #getChain()
	 * @generated
	 */
	EAttribute getChain_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Chain#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Chain#getId()
	 * @see #getChain()
	 * @generated
	 */
	EAttribute getChain_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.UserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Data</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData
	 * @generated
	 */
	EClass getUserData();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.UserData#getActiveWorkers <em>Active Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Workers</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData#getActiveWorkers()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_ActiveWorkers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.UserData#getHashRate <em>Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData#getHashRate()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_HashRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.UserData#getNow <em>Now</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Now</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData#getNow()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_Now();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.UserData#getRoundStarts <em>Round Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Round Starts</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData#getRoundStarts()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_RoundStarts();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.pools.bitminter.UserData#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shift</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData#getShift()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_Shift();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.UserData#getBalances <em>Balances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Balances</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData#getBalances()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_Balances();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.UserData#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workers</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData#getWorkers()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_Workers();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.UserData#getUserHashRates <em>User Hash Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Hash Rates</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData#getUserHashRates()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_UserHashRates();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.RoundStart <em>Round Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Start</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.RoundStart
	 * @generated
	 */
	EClass getRoundStart();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.RoundStart#getChainID <em>Chain ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain ID</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.RoundStart#getChainID()
	 * @see #getRoundStart()
	 * @generated
	 */
	EAttribute getRoundStart_ChainID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.RoundStart#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.RoundStart#getShift()
	 * @see #getRoundStart()
	 * @generated
	 */
	EAttribute getRoundStart_Shift();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.Shift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Shift
	 * @generated
	 */
	EClass getShift();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Shift#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Shift#getStart()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Shift#getAccepted <em>Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Shift#getAccepted()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_Accepted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Shift#getUser_score <em>User score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User score</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Shift#getUser_score()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_User_score();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Shift#getTotal_score <em>Total score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total score</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Shift#getTotal_score()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_Total_score();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.Balance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balance</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Balance
	 * @generated
	 */
	EClass getBalance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Balance#getChainID <em>Chain ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain ID</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Balance#getChainID()
	 * @see #getBalance()
	 * @generated
	 */
	EAttribute getBalance_ChainID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Balance#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Balance#getBalance()
	 * @see #getBalance()
	 * @generated
	 */
	EAttribute getBalance_Balance();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.Worker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Worker
	 * @generated
	 */
	EClass getWorker();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Worker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Worker#getName()
	 * @see #getWorker()
	 * @generated
	 */
	EAttribute getWorker_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Worker#getLastWork <em>Last Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Work</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Worker#getLastWork()
	 * @see #getWorker()
	 * @generated
	 */
	EAttribute getWorker_LastWork();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Worker#getHashRate <em>Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Worker#getHashRate()
	 * @see #getWorker()
	 * @generated
	 */
	EAttribute getWorker_HashRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Worker#getAlive <em>Alive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alive</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Worker#getAlive()
	 * @see #getWorker()
	 * @generated
	 */
	EAttribute getWorker_Alive();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.Worker#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Works</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Worker#getWorks()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Works();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.pools.bitminter.Worker#getHashRates <em>Hash Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hash Rates</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Worker#getHashRates()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_HashRates();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.Work <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Work
	 * @generated
	 */
	EClass getWork();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Work#getChainID <em>Chain ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain ID</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Work#getChainID()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_ChainID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Work#getTotalAccepted <em>Total Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Accepted</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Work#getTotalAccepted()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_TotalAccepted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Work#getTotalRejected <em>Total Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Rejected</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Work#getTotalRejected()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_TotalRejected();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Work#getRoundAccepted <em>Round Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Round Accepted</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Work#getRoundAccepted()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_RoundAccepted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Work#getRoundRejected <em>Round Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Round Rejected</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Work#getRoundRejected()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_RoundRejected();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Work#getCheckPointAccepted <em>Check Point Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Point Accepted</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Work#getCheckPointAccepted()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_CheckPointAccepted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.Work#getCheckPointRejected <em>Check Point Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Point Rejected</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.Work#getCheckPointRejected()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_CheckPointRejected();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.DatedRate <em>Dated Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dated Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.DatedRate
	 * @generated
	 */
	EClass getDatedRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.DatedRate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.DatedRate#getDate()
	 * @see #getDatedRate()
	 * @generated
	 */
	EAttribute getDatedRate_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.DatedRate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.DatedRate#getValue()
	 * @see #getDatedRate()
	 * @generated
	 */
	EAttribute getDatedRate_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.DatedHashRate <em>Dated Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dated Hash Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.DatedHashRate
	 * @generated
	 */
	EClass getDatedHashRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.DatedHashRate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.DatedHashRate#getDate()
	 * @see #getDatedHashRate()
	 * @generated
	 */
	EAttribute getDatedHashRate_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.DatedHashRate#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.DatedHashRate#getRate()
	 * @see #getDatedHashRate()
	 * @generated
	 */
	EAttribute getDatedHashRate_Rate();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.UserHashRate <em>User Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Hash Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserHashRate
	 * @generated
	 */
	EClass getUserHashRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.UserHashRate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserHashRate#getDate()
	 * @see #getUserHashRate()
	 * @generated
	 */
	EAttribute getUserHashRate_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.UserHashRate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.UserHashRate#getValue()
	 * @see #getUserHashRate()
	 * @generated
	 */
	EAttribute getUserHashRate_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.bitminter.RoundHashRate <em>Round Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Hash Rate</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.RoundHashRate
	 * @generated
	 */
	EClass getRoundHashRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.RoundHashRate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.RoundHashRate#getDate()
	 * @see #getRoundHashRate()
	 * @generated
	 */
	EAttribute getRoundHashRate_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.bitminter.RoundHashRate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.btc.pools.bitminter.RoundHashRate#getValue()
	 * @see #getRoundHashRate()
	 * @generated
	 */
	EAttribute getRoundHashRate_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BitminterFactory getBitminterFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterCmdImpl <em>Bit Minter Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitMinterCmdImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getBitMinterCmd()
		 * @generated
		 */
		EClass BIT_MINTER_CMD = eINSTANCE.getBitMinterCmd();

		/**
		 * The meta object literal for the '<em><b>Json</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT_MINTER_CMD__JSON = eINSTANCE.getBitMinterCmd_Json();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl <em>Bit Minter Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getBitMinterConfig()
		 * @generated
		 */
		EClass BIT_MINTER_CONFIG = eINSTANCE.getBitMinterConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT_MINTER_CONFIG__NAME = eINSTANCE.getBitMinterConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_MINTER_CONFIG__STATS = eINSTANCE.getBitMinterConfig_Stats();

		/**
		 * The meta object literal for the '<em><b>Round</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_MINTER_CONFIG__ROUND = eINSTANCE.getBitMinterConfig_Round();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_MINTER_CONFIG__DATA = eINSTANCE.getBitMinterConfig_Data();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT_MINTER_CONFIG__SELECTION = eINSTANCE.getBitMinterConfig_Selection();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.PoolStatsImpl <em>Pool Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.PoolStatsImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getPoolStats()
		 * @generated
		 */
		EClass POOL_STATS = eINSTANCE.getPoolStats();

		/**
		 * The meta object literal for the '<em><b>Hash Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_STATS__HASH_RATE = eINSTANCE.getPoolStats_HashRate();

		/**
		 * The meta object literal for the '<em><b>Active Workers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_STATS__ACTIVE_WORKERS = eINSTANCE.getPoolStats_ActiveWorkers();

		/**
		 * The meta object literal for the '<em><b>Active Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_STATS__ACTIVE_USERS = eINSTANCE.getPoolStats_ActiveUsers();

		/**
		 * The meta object literal for the '<em><b>Dated Rates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL_STATS__DATED_RATES = eINSTANCE.getPoolStats_DatedRates();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl <em>Pool Round</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getPoolRound()
		 * @generated
		 */
		EClass POOL_ROUND = eINSTANCE.getPoolRound();

		/**
		 * The meta object literal for the '<em><b>Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL_ROUND__CHAINS = eINSTANCE.getPoolRound_Chains();

		/**
		 * The meta object literal for the '<em><b>Hash Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_ROUND__HASH_RATE = eINSTANCE.getPoolRound_HashRate();

		/**
		 * The meta object literal for the '<em><b>Active Workers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_ROUND__ACTIVE_WORKERS = eINSTANCE.getPoolRound_ActiveWorkers();

		/**
		 * The meta object literal for the '<em><b>Active Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_ROUND__ACTIVE_USERS = eINSTANCE.getPoolRound_ActiveUsers();

		/**
		 * The meta object literal for the '<em><b>Shift Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_ROUND__SHIFT_ACCEPTED = eINSTANCE.getPoolRound_ShiftAccepted();

		/**
		 * The meta object literal for the '<em><b>Shift Rejected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_ROUND__SHIFT_REJECTED = eINSTANCE.getPoolRound_ShiftRejected();

		/**
		 * The meta object literal for the '<em><b>Shift Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_ROUND__SHIFT_DURATION = eINSTANCE.getPoolRound_ShiftDuration();

		/**
		 * The meta object literal for the '<em><b>Shift Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL_ROUND__SHIFT_SCORE = eINSTANCE.getPoolRound_ShiftScore();

		/**
		 * The meta object literal for the '<em><b>Round Hash Rates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL_ROUND__ROUND_HASH_RATES = eINSTANCE.getPoolRound_RoundHashRates();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.ChainImpl <em>Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.ChainImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getChain()
		 * @generated
		 */
		EClass CHAIN = eINSTANCE.getChain();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN__ACCEPTED = eINSTANCE.getChain_Accepted();

		/**
		 * The meta object literal for the '<em><b>Rejected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN__REJECTED = eINSTANCE.getChain_Rejected();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN__DURATION = eINSTANCE.getChain_Duration();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN__DIFFICULTY = eINSTANCE.getChain_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN__ID = eINSTANCE.getChain_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl <em>User Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getUserData()
		 * @generated
		 */
		EClass USER_DATA = eINSTANCE.getUserData();

		/**
		 * The meta object literal for the '<em><b>Active Workers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__ACTIVE_WORKERS = eINSTANCE.getUserData_ActiveWorkers();

		/**
		 * The meta object literal for the '<em><b>Hash Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__HASH_RATE = eINSTANCE.getUserData_HashRate();

		/**
		 * The meta object literal for the '<em><b>Now</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__NOW = eINSTANCE.getUserData_Now();

		/**
		 * The meta object literal for the '<em><b>Round Starts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__ROUND_STARTS = eINSTANCE.getUserData_RoundStarts();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__SHIFT = eINSTANCE.getUserData_Shift();

		/**
		 * The meta object literal for the '<em><b>Balances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__BALANCES = eINSTANCE.getUserData_Balances();

		/**
		 * The meta object literal for the '<em><b>Workers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__WORKERS = eINSTANCE.getUserData_Workers();

		/**
		 * The meta object literal for the '<em><b>User Hash Rates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__USER_HASH_RATES = eINSTANCE.getUserData_UserHashRates();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.RoundStartImpl <em>Round Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.RoundStartImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getRoundStart()
		 * @generated
		 */
		EClass ROUND_START = eINSTANCE.getRoundStart();

		/**
		 * The meta object literal for the '<em><b>Chain ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_START__CHAIN_ID = eINSTANCE.getRoundStart_ChainID();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_START__SHIFT = eINSTANCE.getRoundStart_Shift();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.ShiftImpl <em>Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.ShiftImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getShift()
		 * @generated
		 */
		EClass SHIFT = eINSTANCE.getShift();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__START = eINSTANCE.getShift_Start();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__ACCEPTED = eINSTANCE.getShift_Accepted();

		/**
		 * The meta object literal for the '<em><b>User score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__USER_SCORE = eINSTANCE.getShift_User_score();

		/**
		 * The meta object literal for the '<em><b>Total score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__TOTAL_SCORE = eINSTANCE.getShift_Total_score();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.BalanceImpl <em>Balance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BalanceImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getBalance()
		 * @generated
		 */
		EClass BALANCE = eINSTANCE.getBalance();

		/**
		 * The meta object literal for the '<em><b>Chain ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALANCE__CHAIN_ID = eINSTANCE.getBalance_ChainID();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALANCE__BALANCE = eINSTANCE.getBalance_Balance();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl <em>Worker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getWorker()
		 * @generated
		 */
		EClass WORKER = eINSTANCE.getWorker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER__NAME = eINSTANCE.getWorker_Name();

		/**
		 * The meta object literal for the '<em><b>Last Work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER__LAST_WORK = eINSTANCE.getWorker_LastWork();

		/**
		 * The meta object literal for the '<em><b>Hash Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER__HASH_RATE = eINSTANCE.getWorker_HashRate();

		/**
		 * The meta object literal for the '<em><b>Alive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER__ALIVE = eINSTANCE.getWorker_Alive();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__WORKS = eINSTANCE.getWorker_Works();

		/**
		 * The meta object literal for the '<em><b>Hash Rates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__HASH_RATES = eINSTANCE.getWorker_HashRates();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl <em>Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.WorkImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getWork()
		 * @generated
		 */
		EClass WORK = eINSTANCE.getWork();

		/**
		 * The meta object literal for the '<em><b>Chain ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__CHAIN_ID = eINSTANCE.getWork_ChainID();

		/**
		 * The meta object literal for the '<em><b>Total Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__TOTAL_ACCEPTED = eINSTANCE.getWork_TotalAccepted();

		/**
		 * The meta object literal for the '<em><b>Total Rejected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__TOTAL_REJECTED = eINSTANCE.getWork_TotalRejected();

		/**
		 * The meta object literal for the '<em><b>Round Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__ROUND_ACCEPTED = eINSTANCE.getWork_RoundAccepted();

		/**
		 * The meta object literal for the '<em><b>Round Rejected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__ROUND_REJECTED = eINSTANCE.getWork_RoundRejected();

		/**
		 * The meta object literal for the '<em><b>Check Point Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__CHECK_POINT_ACCEPTED = eINSTANCE.getWork_CheckPointAccepted();

		/**
		 * The meta object literal for the '<em><b>Check Point Rejected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__CHECK_POINT_REJECTED = eINSTANCE.getWork_CheckPointRejected();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.DatedRateImpl <em>Dated Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.DatedRateImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getDatedRate()
		 * @generated
		 */
		EClass DATED_RATE = eINSTANCE.getDatedRate();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATED_RATE__DATE = eINSTANCE.getDatedRate_Date();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATED_RATE__VALUE = eINSTANCE.getDatedRate_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.DatedHashRateImpl <em>Dated Hash Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.DatedHashRateImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getDatedHashRate()
		 * @generated
		 */
		EClass DATED_HASH_RATE = eINSTANCE.getDatedHashRate();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATED_HASH_RATE__DATE = eINSTANCE.getDatedHashRate_Date();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATED_HASH_RATE__RATE = eINSTANCE.getDatedHashRate_Rate();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.UserHashRateImpl <em>User Hash Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.UserHashRateImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getUserHashRate()
		 * @generated
		 */
		EClass USER_HASH_RATE = eINSTANCE.getUserHashRate();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_HASH_RATE__DATE = eINSTANCE.getUserHashRate_Date();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_HASH_RATE__VALUE = eINSTANCE.getUserHashRate_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.bitminter.impl.RoundHashRateImpl <em>Round Hash Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.bitminter.impl.RoundHashRateImpl
		 * @see net.sf.smbt.btc.pools.bitminter.impl.BitminterPackageImpl#getRoundHashRate()
		 * @generated
		 */
		EClass ROUND_HASH_RATE = eINSTANCE.getRoundHashRate();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_HASH_RATE__DATE = eINSTANCE.getRoundHashRate_Date();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_HASH_RATE__VALUE = eINSTANCE.getRoundHashRate_Value();

	}

} //BitminterPackage
