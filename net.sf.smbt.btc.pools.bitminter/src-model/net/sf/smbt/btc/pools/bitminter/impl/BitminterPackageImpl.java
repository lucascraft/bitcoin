/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import net.sf.smbt.btc.genericpools.GenericpoolsPackage;

import net.sf.smbt.btc.pools.bitminter.Balance;
import net.sf.smbt.btc.pools.bitminter.BitMinterCmd;
import net.sf.smbt.btc.pools.bitminter.BitMinterConfig;
import net.sf.smbt.btc.pools.bitminter.BitminterFactory;
import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.Chain;
import net.sf.smbt.btc.pools.bitminter.DatedHashRate;
import net.sf.smbt.btc.pools.bitminter.DatedRate;
import net.sf.smbt.btc.pools.bitminter.PoolRound;
import net.sf.smbt.btc.pools.bitminter.PoolStats;

import net.sf.smbt.btc.pools.bitminter.RoundHashRate;
import net.sf.smbt.btc.pools.bitminter.RoundStart;
import net.sf.smbt.btc.pools.bitminter.Shift;
import net.sf.smbt.btc.pools.bitminter.UserData;
import net.sf.smbt.btc.pools.bitminter.UserHashRate;
import net.sf.smbt.btc.pools.bitminter.Work;
import net.sf.smbt.btc.pools.bitminter.Worker;
import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BitminterPackageImpl extends EPackageImpl implements BitminterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitMinterCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitMinterConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolRoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass balanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datedRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datedHashRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userHashRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundHashRateEClass = null;

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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BitminterPackageImpl() {
		super(eNS_URI, BitminterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BitminterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BitminterPackage init() {
		if (isInited) return (BitminterPackage)EPackage.Registry.INSTANCE.getEPackage(BitminterPackage.eNS_URI);

		// Obtain or create and register package
		BitminterPackageImpl theBitminterPackage = (BitminterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BitminterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BitminterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenericpoolsPackage.eINSTANCE.eClass();
		HttpcmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBitminterPackage.createPackageContents();

		// Initialize created meta-data
		theBitminterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBitminterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BitminterPackage.eNS_URI, theBitminterPackage);
		return theBitminterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitMinterCmd() {
		return bitMinterCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitMinterCmd_Json() {
		return (EAttribute)bitMinterCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitMinterConfig() {
		return bitMinterConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitMinterConfig_Name() {
		return (EAttribute)bitMinterConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitMinterConfig_Stats() {
		return (EReference)bitMinterConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitMinterConfig_Round() {
		return (EReference)bitMinterConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitMinterConfig_Data() {
		return (EReference)bitMinterConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitMinterConfig_Selection() {
		return (EAttribute)bitMinterConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoolStats() {
		return poolStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolStats_HashRate() {
		return (EAttribute)poolStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolStats_ActiveWorkers() {
		return (EAttribute)poolStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolStats_ActiveUsers() {
		return (EAttribute)poolStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoolStats_DatedRates() {
		return (EReference)poolStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoolRound() {
		return poolRoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoolRound_Chains() {
		return (EReference)poolRoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolRound_HashRate() {
		return (EAttribute)poolRoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolRound_ActiveWorkers() {
		return (EAttribute)poolRoundEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolRound_ActiveUsers() {
		return (EAttribute)poolRoundEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolRound_ShiftAccepted() {
		return (EAttribute)poolRoundEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolRound_ShiftRejected() {
		return (EAttribute)poolRoundEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolRound_ShiftDuration() {
		return (EAttribute)poolRoundEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolRound_ShiftScore() {
		return (EAttribute)poolRoundEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoolRound_RoundHashRates() {
		return (EReference)poolRoundEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChain() {
		return chainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChain_Accepted() {
		return (EAttribute)chainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChain_Rejected() {
		return (EAttribute)chainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChain_Duration() {
		return (EAttribute)chainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChain_Difficulty() {
		return (EAttribute)chainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChain_Id() {
		return (EAttribute)chainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserData() {
		return userDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_ActiveWorkers() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_HashRate() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_Now() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_RoundStarts() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_Shift() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_Balances() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_Workers() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_UserHashRates() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundStart() {
		return roundStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundStart_ChainID() {
		return (EAttribute)roundStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundStart_Shift() {
		return (EAttribute)roundStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShift() {
		return shiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_Start() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_Accepted() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_User_score() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShift_Total_score() {
		return (EAttribute)shiftEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBalance() {
		return balanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalance_ChainID() {
		return (EAttribute)balanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalance_Balance() {
		return (EAttribute)balanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorker() {
		return workerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorker_Name() {
		return (EAttribute)workerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorker_LastWork() {
		return (EAttribute)workerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorker_HashRate() {
		return (EAttribute)workerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorker_Alive() {
		return (EAttribute)workerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorker_Works() {
		return (EReference)workerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorker_HashRates() {
		return (EReference)workerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWork() {
		return workEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_ChainID() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_TotalAccepted() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_TotalRejected() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_RoundAccepted() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_RoundRejected() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_CheckPointAccepted() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_CheckPointRejected() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatedRate() {
		return datedRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatedRate_Date() {
		return (EAttribute)datedRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatedRate_Value() {
		return (EAttribute)datedRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatedHashRate() {
		return datedHashRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatedHashRate_Date() {
		return (EAttribute)datedHashRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatedHashRate_Rate() {
		return (EAttribute)datedHashRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserHashRate() {
		return userHashRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserHashRate_Date() {
		return (EAttribute)userHashRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserHashRate_Value() {
		return (EAttribute)userHashRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundHashRate() {
		return roundHashRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundHashRate_Date() {
		return (EAttribute)roundHashRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundHashRate_Value() {
		return (EAttribute)roundHashRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitminterFactory getBitminterFactory() {
		return (BitminterFactory)getEFactoryInstance();
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
		bitMinterCmdEClass = createEClass(BIT_MINTER_CMD);
		createEAttribute(bitMinterCmdEClass, BIT_MINTER_CMD__JSON);

		bitMinterConfigEClass = createEClass(BIT_MINTER_CONFIG);
		createEAttribute(bitMinterConfigEClass, BIT_MINTER_CONFIG__NAME);
		createEReference(bitMinterConfigEClass, BIT_MINTER_CONFIG__STATS);
		createEReference(bitMinterConfigEClass, BIT_MINTER_CONFIG__ROUND);
		createEReference(bitMinterConfigEClass, BIT_MINTER_CONFIG__DATA);
		createEAttribute(bitMinterConfigEClass, BIT_MINTER_CONFIG__SELECTION);

		poolStatsEClass = createEClass(POOL_STATS);
		createEAttribute(poolStatsEClass, POOL_STATS__HASH_RATE);
		createEAttribute(poolStatsEClass, POOL_STATS__ACTIVE_WORKERS);
		createEAttribute(poolStatsEClass, POOL_STATS__ACTIVE_USERS);
		createEReference(poolStatsEClass, POOL_STATS__DATED_RATES);

		poolRoundEClass = createEClass(POOL_ROUND);
		createEReference(poolRoundEClass, POOL_ROUND__CHAINS);
		createEAttribute(poolRoundEClass, POOL_ROUND__HASH_RATE);
		createEAttribute(poolRoundEClass, POOL_ROUND__ACTIVE_WORKERS);
		createEAttribute(poolRoundEClass, POOL_ROUND__ACTIVE_USERS);
		createEAttribute(poolRoundEClass, POOL_ROUND__SHIFT_ACCEPTED);
		createEAttribute(poolRoundEClass, POOL_ROUND__SHIFT_REJECTED);
		createEAttribute(poolRoundEClass, POOL_ROUND__SHIFT_DURATION);
		createEAttribute(poolRoundEClass, POOL_ROUND__SHIFT_SCORE);
		createEReference(poolRoundEClass, POOL_ROUND__ROUND_HASH_RATES);

		chainEClass = createEClass(CHAIN);
		createEAttribute(chainEClass, CHAIN__ACCEPTED);
		createEAttribute(chainEClass, CHAIN__REJECTED);
		createEAttribute(chainEClass, CHAIN__DURATION);
		createEAttribute(chainEClass, CHAIN__DIFFICULTY);
		createEAttribute(chainEClass, CHAIN__ID);

		userDataEClass = createEClass(USER_DATA);
		createEAttribute(userDataEClass, USER_DATA__ACTIVE_WORKERS);
		createEAttribute(userDataEClass, USER_DATA__HASH_RATE);
		createEAttribute(userDataEClass, USER_DATA__NOW);
		createEReference(userDataEClass, USER_DATA__ROUND_STARTS);
		createEReference(userDataEClass, USER_DATA__SHIFT);
		createEReference(userDataEClass, USER_DATA__BALANCES);
		createEReference(userDataEClass, USER_DATA__WORKERS);
		createEReference(userDataEClass, USER_DATA__USER_HASH_RATES);

		roundStartEClass = createEClass(ROUND_START);
		createEAttribute(roundStartEClass, ROUND_START__CHAIN_ID);
		createEAttribute(roundStartEClass, ROUND_START__SHIFT);

		shiftEClass = createEClass(SHIFT);
		createEAttribute(shiftEClass, SHIFT__START);
		createEAttribute(shiftEClass, SHIFT__ACCEPTED);
		createEAttribute(shiftEClass, SHIFT__USER_SCORE);
		createEAttribute(shiftEClass, SHIFT__TOTAL_SCORE);

		balanceEClass = createEClass(BALANCE);
		createEAttribute(balanceEClass, BALANCE__CHAIN_ID);
		createEAttribute(balanceEClass, BALANCE__BALANCE);

		workerEClass = createEClass(WORKER);
		createEAttribute(workerEClass, WORKER__NAME);
		createEAttribute(workerEClass, WORKER__LAST_WORK);
		createEAttribute(workerEClass, WORKER__HASH_RATE);
		createEAttribute(workerEClass, WORKER__ALIVE);
		createEReference(workerEClass, WORKER__WORKS);
		createEReference(workerEClass, WORKER__HASH_RATES);

		workEClass = createEClass(WORK);
		createEAttribute(workEClass, WORK__CHAIN_ID);
		createEAttribute(workEClass, WORK__TOTAL_ACCEPTED);
		createEAttribute(workEClass, WORK__TOTAL_REJECTED);
		createEAttribute(workEClass, WORK__ROUND_ACCEPTED);
		createEAttribute(workEClass, WORK__ROUND_REJECTED);
		createEAttribute(workEClass, WORK__CHECK_POINT_ACCEPTED);
		createEAttribute(workEClass, WORK__CHECK_POINT_REJECTED);

		datedRateEClass = createEClass(DATED_RATE);
		createEAttribute(datedRateEClass, DATED_RATE__DATE);
		createEAttribute(datedRateEClass, DATED_RATE__VALUE);

		datedHashRateEClass = createEClass(DATED_HASH_RATE);
		createEAttribute(datedHashRateEClass, DATED_HASH_RATE__DATE);
		createEAttribute(datedHashRateEClass, DATED_HASH_RATE__RATE);

		userHashRateEClass = createEClass(USER_HASH_RATE);
		createEAttribute(userHashRateEClass, USER_HASH_RATE__DATE);
		createEAttribute(userHashRateEClass, USER_HASH_RATE__VALUE);

		roundHashRateEClass = createEClass(ROUND_HASH_RATE);
		createEAttribute(roundHashRateEClass, ROUND_HASH_RATE__DATE);
		createEAttribute(roundHashRateEClass, ROUND_HASH_RATE__VALUE);
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
		GenericpoolsPackage theGenericpoolsPackage = (GenericpoolsPackage)EPackage.Registry.INSTANCE.getEPackage(GenericpoolsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bitMinterCmdEClass.getESuperTypes().add(theHttpcmdPackage.getHttpCommCmd());
		bitMinterConfigEClass.getESuperTypes().add(theGenericpoolsPackage.getPoolConfig());

		// Initialize classes and features; add operations and parameters
		initEClass(bitMinterCmdEClass, BitMinterCmd.class, "BitMinterCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitMinterCmd_Json(), ecorePackage.getEString(), "json", null, 0, 1, BitMinterCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitMinterConfigEClass, BitMinterConfig.class, "BitMinterConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitMinterConfig_Name(), ecorePackage.getEString(), "name", null, 0, 1, BitMinterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBitMinterConfig_Stats(), this.getPoolStats(), null, "stats", null, 0, 1, BitMinterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBitMinterConfig_Round(), this.getPoolRound(), null, "round", null, 0, 1, BitMinterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBitMinterConfig_Data(), this.getUserData(), null, "data", null, 0, 1, BitMinterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitMinterConfig_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, BitMinterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolStatsEClass, PoolStats.class, "PoolStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoolStats_HashRate(), ecorePackage.getEFloat(), "hashRate", null, 0, 1, PoolStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolStats_ActiveWorkers(), ecorePackage.getEInt(), "activeWorkers", null, 0, 1, PoolStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolStats_ActiveUsers(), ecorePackage.getEInt(), "activeUsers", null, 0, 1, PoolStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoolStats_DatedRates(), this.getDatedRate(), null, "datedRates", null, 0, -1, PoolStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolRoundEClass, PoolRound.class, "PoolRound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoolRound_Chains(), this.getChain(), null, "chains", null, 0, -1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolRound_HashRate(), ecorePackage.getEFloat(), "hashRate", null, 0, 1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolRound_ActiveWorkers(), ecorePackage.getEInt(), "activeWorkers", null, 0, 1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolRound_ActiveUsers(), ecorePackage.getEInt(), "activeUsers", null, 0, 1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolRound_ShiftAccepted(), ecorePackage.getEInt(), "shiftAccepted", null, 0, 1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolRound_ShiftRejected(), ecorePackage.getEInt(), "shiftRejected", null, 0, 1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolRound_ShiftDuration(), ecorePackage.getEInt(), "shiftDuration", null, 0, 1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoolRound_ShiftScore(), ecorePackage.getEFloat(), "shiftScore", null, 0, 1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoolRound_RoundHashRates(), this.getRoundHashRate(), null, "roundHashRates", null, 0, -1, PoolRound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainEClass, Chain.class, "Chain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChain_Accepted(), ecorePackage.getELong(), "accepted", null, 0, 1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChain_Rejected(), ecorePackage.getELong(), "rejected", null, 0, 1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChain_Duration(), ecorePackage.getELong(), "duration", null, 0, 1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChain_Difficulty(), ecorePackage.getEFloat(), "difficulty", null, 0, 1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChain_Id(), ecorePackage.getEString(), "id", null, 0, 1, Chain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDataEClass, UserData.class, "UserData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserData_ActiveWorkers(), ecorePackage.getEInt(), "activeWorkers", null, 0, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserData_HashRate(), ecorePackage.getEFloat(), "hashRate", null, 0, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserData_Now(), ecorePackage.getELong(), "now", null, 0, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserData_RoundStarts(), this.getRoundStart(), null, "roundStarts", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserData_Shift(), this.getShift(), null, "shift", null, 0, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserData_Balances(), this.getBalance(), null, "balances", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserData_Workers(), this.getWorker(), null, "workers", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserData_UserHashRates(), this.getUserHashRate(), null, "userHashRates", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundStartEClass, RoundStart.class, "RoundStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoundStart_ChainID(), ecorePackage.getEString(), "chainID", null, 0, 1, RoundStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundStart_Shift(), ecorePackage.getEInt(), "shift", null, 0, 1, RoundStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shiftEClass, Shift.class, "Shift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShift_Start(), ecorePackage.getELong(), "start", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_Accepted(), ecorePackage.getEInt(), "accepted", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_User_score(), ecorePackage.getEFloat(), "user_score", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShift_Total_score(), ecorePackage.getEFloat(), "total_score", null, 0, 1, Shift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(balanceEClass, Balance.class, "Balance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBalance_ChainID(), ecorePackage.getEString(), "chainID", null, 0, 1, Balance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBalance_Balance(), ecorePackage.getEFloat(), "balance", null, 0, 1, Balance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workerEClass, Worker.class, "Worker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorker_Name(), ecorePackage.getEString(), "name", null, 0, 1, Worker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorker_LastWork(), ecorePackage.getELong(), "lastWork", null, 0, 1, Worker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorker_HashRate(), ecorePackage.getEFloat(), "hashRate", null, 0, 1, Worker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorker_Alive(), ecorePackage.getEInt(), "alive", null, 0, 1, Worker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorker_Works(), this.getWork(), null, "works", null, 0, -1, Worker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorker_HashRates(), this.getDatedHashRate(), null, "hashRates", null, 0, -1, Worker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEClass, Work.class, "Work", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWork_ChainID(), ecorePackage.getEString(), "chainID", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_TotalAccepted(), ecorePackage.getELong(), "totalAccepted", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_TotalRejected(), ecorePackage.getELong(), "totalRejected", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_RoundAccepted(), ecorePackage.getELong(), "roundAccepted", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_RoundRejected(), ecorePackage.getELong(), "roundRejected", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_CheckPointAccepted(), ecorePackage.getELong(), "checkPointAccepted", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_CheckPointRejected(), ecorePackage.getELong(), "checkPointRejected", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datedRateEClass, DatedRate.class, "DatedRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatedRate_Date(), ecorePackage.getEDate(), "date", null, 0, 1, DatedRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatedRate_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, DatedRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datedHashRateEClass, DatedHashRate.class, "DatedHashRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatedHashRate_Date(), ecorePackage.getEDate(), "date", null, 0, 1, DatedHashRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatedHashRate_Rate(), ecorePackage.getEFloat(), "rate", null, 0, 1, DatedHashRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userHashRateEClass, UserHashRate.class, "UserHashRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserHashRate_Date(), ecorePackage.getEDate(), "date", null, 0, 1, UserHashRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserHashRate_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, UserHashRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundHashRateEClass, RoundHashRate.class, "RoundHashRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoundHashRate_Date(), ecorePackage.getEDate(), "date", null, 0, 1, RoundHashRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundHashRate_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, RoundHashRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BitminterPackageImpl
