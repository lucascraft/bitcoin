/**
 */
package net.sf.smbt.btc.pools.bitminter.util;

import net.sf.smbt.btc.genericpools.PoolConfig;

import net.sf.smbt.btc.pools.bitminter.*;

import net.sf.smbt.comm.httpcmd.HttpCommCmd;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage
 * @generated
 */
public class BitminterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BitminterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitminterSwitch() {
		if (modelPackage == null) {
			modelPackage = BitminterPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BitminterPackage.BIT_MINTER_CMD: {
				BitMinterCmd bitMinterCmd = (BitMinterCmd)theEObject;
				T result = caseBitMinterCmd(bitMinterCmd);
				if (result == null) result = caseHttpCommCmd(bitMinterCmd);
				if (result == null) result = caseCmd(bitMinterCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.BIT_MINTER_CONFIG: {
				BitMinterConfig bitMinterConfig = (BitMinterConfig)theEObject;
				T result = caseBitMinterConfig(bitMinterConfig);
				if (result == null) result = casePoolConfig(bitMinterConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.POOL_STATS: {
				PoolStats poolStats = (PoolStats)theEObject;
				T result = casePoolStats(poolStats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.POOL_ROUND: {
				PoolRound poolRound = (PoolRound)theEObject;
				T result = casePoolRound(poolRound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.CHAIN: {
				Chain chain = (Chain)theEObject;
				T result = caseChain(chain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.USER_DATA: {
				UserData userData = (UserData)theEObject;
				T result = caseUserData(userData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.ROUND_START: {
				RoundStart roundStart = (RoundStart)theEObject;
				T result = caseRoundStart(roundStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.SHIFT: {
				Shift shift = (Shift)theEObject;
				T result = caseShift(shift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.BALANCE: {
				Balance balance = (Balance)theEObject;
				T result = caseBalance(balance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.WORKER: {
				Worker worker = (Worker)theEObject;
				T result = caseWorker(worker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.WORK: {
				Work work = (Work)theEObject;
				T result = caseWork(work);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.DATED_RATE: {
				DatedRate datedRate = (DatedRate)theEObject;
				T result = caseDatedRate(datedRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.DATED_HASH_RATE: {
				DatedHashRate datedHashRate = (DatedHashRate)theEObject;
				T result = caseDatedHashRate(datedHashRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.USER_HASH_RATE: {
				UserHashRate userHashRate = (UserHashRate)theEObject;
				T result = caseUserHashRate(userHashRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BitminterPackage.ROUND_HASH_RATE: {
				RoundHashRate roundHashRate = (RoundHashRate)theEObject;
				T result = caseRoundHashRate(roundHashRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Minter Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Minter Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitMinterCmd(BitMinterCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Minter Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Minter Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitMinterConfig(BitMinterConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool Stats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool Stats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoolStats(PoolStats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool Round</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool Round</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoolRound(PoolRound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChain(Chain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserData(UserData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundStart(RoundStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShift(Shift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Balance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Balance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBalance(Balance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorker(Worker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWork(Work object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dated Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dated Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatedRate(DatedRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dated Hash Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dated Hash Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatedHashRate(DatedHashRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Hash Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Hash Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserHashRate(UserHashRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Hash Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Hash Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundHashRate(RoundHashRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Comm Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Comm Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpCommCmd(HttpCommCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoolConfig(PoolConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BitminterSwitch
