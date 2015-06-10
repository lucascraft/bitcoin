/**
 */
package net.sf.smbt.btc.pools.bitminter.util;

import net.sf.smbt.btc.genericpools.PoolConfig;

import net.sf.smbt.btc.pools.bitminter.*;

import net.sf.smbt.comm.httpcmd.HttpCommCmd;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage
 * @generated
 */
public class BitminterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BitminterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitminterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BitminterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitminterSwitch<Adapter> modelSwitch =
		new BitminterSwitch<Adapter>() {
			@Override
			public Adapter caseBitMinterCmd(BitMinterCmd object) {
				return createBitMinterCmdAdapter();
			}
			@Override
			public Adapter caseBitMinterConfig(BitMinterConfig object) {
				return createBitMinterConfigAdapter();
			}
			@Override
			public Adapter casePoolStats(PoolStats object) {
				return createPoolStatsAdapter();
			}
			@Override
			public Adapter casePoolRound(PoolRound object) {
				return createPoolRoundAdapter();
			}
			@Override
			public Adapter caseChain(Chain object) {
				return createChainAdapter();
			}
			@Override
			public Adapter caseUserData(UserData object) {
				return createUserDataAdapter();
			}
			@Override
			public Adapter caseRoundStart(RoundStart object) {
				return createRoundStartAdapter();
			}
			@Override
			public Adapter caseShift(Shift object) {
				return createShiftAdapter();
			}
			@Override
			public Adapter caseBalance(Balance object) {
				return createBalanceAdapter();
			}
			@Override
			public Adapter caseWorker(Worker object) {
				return createWorkerAdapter();
			}
			@Override
			public Adapter caseWork(Work object) {
				return createWorkAdapter();
			}
			@Override
			public Adapter caseDatedRate(DatedRate object) {
				return createDatedRateAdapter();
			}
			@Override
			public Adapter caseDatedHashRate(DatedHashRate object) {
				return createDatedHashRateAdapter();
			}
			@Override
			public Adapter caseUserHashRate(UserHashRate object) {
				return createUserHashRateAdapter();
			}
			@Override
			public Adapter caseRoundHashRate(RoundHashRate object) {
				return createRoundHashRateAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseHttpCommCmd(HttpCommCmd object) {
				return createHttpCommCmdAdapter();
			}
			@Override
			public Adapter casePoolConfig(PoolConfig object) {
				return createPoolConfigAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.BitMinterCmd <em>Bit Minter Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterCmd
	 * @generated
	 */
	public Adapter createBitMinterCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig <em>Bit Minter Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.BitMinterConfig
	 * @generated
	 */
	public Adapter createBitMinterConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.PoolStats <em>Pool Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolStats
	 * @generated
	 */
	public Adapter createPoolStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.PoolRound <em>Pool Round</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.PoolRound
	 * @generated
	 */
	public Adapter createPoolRoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.Chain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.Chain
	 * @generated
	 */
	public Adapter createChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.UserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.UserData
	 * @generated
	 */
	public Adapter createUserDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.RoundStart <em>Round Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.RoundStart
	 * @generated
	 */
	public Adapter createRoundStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.Shift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.Shift
	 * @generated
	 */
	public Adapter createShiftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.Balance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.Balance
	 * @generated
	 */
	public Adapter createBalanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.Worker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.Worker
	 * @generated
	 */
	public Adapter createWorkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.Work <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.Work
	 * @generated
	 */
	public Adapter createWorkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.DatedRate <em>Dated Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.DatedRate
	 * @generated
	 */
	public Adapter createDatedRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.DatedHashRate <em>Dated Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.DatedHashRate
	 * @generated
	 */
	public Adapter createDatedHashRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.UserHashRate <em>User Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.UserHashRate
	 * @generated
	 */
	public Adapter createUserHashRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.pools.bitminter.RoundHashRate <em>Round Hash Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.pools.bitminter.RoundHashRate
	 * @generated
	 */
	public Adapter createRoundHashRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.httpcmd.HttpCommCmd <em>Http Comm Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.httpcmd.HttpCommCmd
	 * @generated
	 */
	public Adapter createHttpCommCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.genericpools.PoolConfig <em>Pool Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.genericpools.PoolConfig
	 * @generated
	 */
	public Adapter createPoolConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BitminterAdapterFactory
