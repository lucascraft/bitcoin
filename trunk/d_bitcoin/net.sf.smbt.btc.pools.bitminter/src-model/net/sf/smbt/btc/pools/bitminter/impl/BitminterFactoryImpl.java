/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import net.sf.smbt.btc.pools.bitminter.*;

import org.eclipse.emf.ecore.EClass;
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
public class BitminterFactoryImpl extends EFactoryImpl implements BitminterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitminterFactory init() {
		try {
			BitminterFactory theBitminterFactory = (BitminterFactory)EPackage.Registry.INSTANCE.getEFactory("http://bitminter/1.0"); 
			if (theBitminterFactory != null) {
				return theBitminterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BitminterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitminterFactoryImpl() {
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
			case BitminterPackage.BIT_MINTER_CMD: return createBitMinterCmd();
			case BitminterPackage.BIT_MINTER_CONFIG: return createBitMinterConfig();
			case BitminterPackage.POOL_STATS: return createPoolStats();
			case BitminterPackage.POOL_ROUND: return createPoolRound();
			case BitminterPackage.CHAIN: return createChain();
			case BitminterPackage.USER_DATA: return createUserData();
			case BitminterPackage.ROUND_START: return createRoundStart();
			case BitminterPackage.SHIFT: return createShift();
			case BitminterPackage.BALANCE: return createBalance();
			case BitminterPackage.WORKER: return createWorker();
			case BitminterPackage.WORK: return createWork();
			case BitminterPackage.DATED_RATE: return createDatedRate();
			case BitminterPackage.DATED_HASH_RATE: return createDatedHashRate();
			case BitminterPackage.USER_HASH_RATE: return createUserHashRate();
			case BitminterPackage.ROUND_HASH_RATE: return createRoundHashRate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitMinterCmd createBitMinterCmd() {
		BitMinterCmdImpl bitMinterCmd = new BitMinterCmdImpl();
		return bitMinterCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitMinterConfig createBitMinterConfig() {
		BitMinterConfigImpl bitMinterConfig = new BitMinterConfigImpl();
		return bitMinterConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolStats createPoolStats() {
		PoolStatsImpl poolStats = new PoolStatsImpl();
		return poolStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolRound createPoolRound() {
		PoolRoundImpl poolRound = new PoolRoundImpl();
		return poolRound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chain createChain() {
		ChainImpl chain = new ChainImpl();
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData createUserData() {
		UserDataImpl userData = new UserDataImpl();
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundStart createRoundStart() {
		RoundStartImpl roundStart = new RoundStartImpl();
		return roundStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift createShift() {
		ShiftImpl shift = new ShiftImpl();
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balance createBalance() {
		BalanceImpl balance = new BalanceImpl();
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Worker createWorker() {
		WorkerImpl worker = new WorkerImpl();
		return worker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work createWork() {
		WorkImpl work = new WorkImpl();
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatedRate createDatedRate() {
		DatedRateImpl datedRate = new DatedRateImpl();
		return datedRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatedHashRate createDatedHashRate() {
		DatedHashRateImpl datedHashRate = new DatedHashRateImpl();
		return datedHashRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHashRate createUserHashRate() {
		UserHashRateImpl userHashRate = new UserHashRateImpl();
		return userHashRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundHashRate createRoundHashRate() {
		RoundHashRateImpl roundHashRate = new RoundHashRateImpl();
		return roundHashRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitminterPackage getBitminterPackage() {
		return (BitminterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BitminterPackage getPackage() {
		return BitminterPackage.eINSTANCE;
	}

} //BitminterFactoryImpl
