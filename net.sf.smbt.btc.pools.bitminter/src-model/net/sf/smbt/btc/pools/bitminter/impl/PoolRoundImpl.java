/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import java.util.Collection;

import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.Chain;
import net.sf.smbt.btc.pools.bitminter.PoolRound;

import net.sf.smbt.btc.pools.bitminter.RoundHashRate;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pool Round</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getChains <em>Chains</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getHashRate <em>Hash Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getActiveWorkers <em>Active Workers</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getActiveUsers <em>Active Users</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getShiftAccepted <em>Shift Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getShiftRejected <em>Shift Rejected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getShiftDuration <em>Shift Duration</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getShiftScore <em>Shift Score</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolRoundImpl#getRoundHashRates <em>Round Hash Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PoolRoundImpl extends MinimalEObjectImpl.Container implements PoolRound {
	/**
	 * The cached value of the '{@link #getChains() <em>Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<Chain> chains;

	/**
	 * The default value of the '{@link #getHashRate() <em>Hash Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashRate()
	 * @generated
	 * @ordered
	 */
	protected static final float HASH_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHashRate() <em>Hash Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashRate()
	 * @generated
	 * @ordered
	 */
	protected float hashRate = HASH_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveWorkers() <em>Active Workers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveWorkers()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVE_WORKERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActiveWorkers() <em>Active Workers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveWorkers()
	 * @generated
	 * @ordered
	 */
	protected int activeWorkers = ACTIVE_WORKERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveUsers() <em>Active Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveUsers()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVE_USERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActiveUsers() <em>Active Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveUsers()
	 * @generated
	 * @ordered
	 */
	protected int activeUsers = ACTIVE_USERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShiftAccepted() <em>Shift Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final int SHIFT_ACCEPTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShiftAccepted() <em>Shift Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftAccepted()
	 * @generated
	 * @ordered
	 */
	protected int shiftAccepted = SHIFT_ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getShiftRejected() <em>Shift Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftRejected()
	 * @generated
	 * @ordered
	 */
	protected static final int SHIFT_REJECTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShiftRejected() <em>Shift Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftRejected()
	 * @generated
	 * @ordered
	 */
	protected int shiftRejected = SHIFT_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getShiftDuration() <em>Shift Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int SHIFT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShiftDuration() <em>Shift Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftDuration()
	 * @generated
	 * @ordered
	 */
	protected int shiftDuration = SHIFT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShiftScore() <em>Shift Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftScore()
	 * @generated
	 * @ordered
	 */
	protected static final float SHIFT_SCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShiftScore() <em>Shift Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftScore()
	 * @generated
	 * @ordered
	 */
	protected float shiftScore = SHIFT_SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoundHashRates() <em>Round Hash Rates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundHashRates()
	 * @generated
	 * @ordered
	 */
	protected EList<RoundHashRate> roundHashRates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolRoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.POOL_ROUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chain> getChains() {
		if (chains == null) {
			chains = new EObjectContainmentEList<Chain>(Chain.class, this, BitminterPackage.POOL_ROUND__CHAINS);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHashRate() {
		return hashRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashRate(float newHashRate) {
		float oldHashRate = hashRate;
		hashRate = newHashRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_ROUND__HASH_RATE, oldHashRate, hashRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActiveWorkers() {
		return activeWorkers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveWorkers(int newActiveWorkers) {
		int oldActiveWorkers = activeWorkers;
		activeWorkers = newActiveWorkers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_ROUND__ACTIVE_WORKERS, oldActiveWorkers, activeWorkers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActiveUsers() {
		return activeUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveUsers(int newActiveUsers) {
		int oldActiveUsers = activeUsers;
		activeUsers = newActiveUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_ROUND__ACTIVE_USERS, oldActiveUsers, activeUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShiftAccepted() {
		return shiftAccepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShiftAccepted(int newShiftAccepted) {
		int oldShiftAccepted = shiftAccepted;
		shiftAccepted = newShiftAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_ROUND__SHIFT_ACCEPTED, oldShiftAccepted, shiftAccepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShiftRejected() {
		return shiftRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShiftRejected(int newShiftRejected) {
		int oldShiftRejected = shiftRejected;
		shiftRejected = newShiftRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_ROUND__SHIFT_REJECTED, oldShiftRejected, shiftRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShiftDuration() {
		return shiftDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShiftDuration(int newShiftDuration) {
		int oldShiftDuration = shiftDuration;
		shiftDuration = newShiftDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_ROUND__SHIFT_DURATION, oldShiftDuration, shiftDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShiftScore() {
		return shiftScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShiftScore(float newShiftScore) {
		float oldShiftScore = shiftScore;
		shiftScore = newShiftScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_ROUND__SHIFT_SCORE, oldShiftScore, shiftScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoundHashRate> getRoundHashRates() {
		if (roundHashRates == null) {
			roundHashRates = new EObjectContainmentEList<RoundHashRate>(RoundHashRate.class, this, BitminterPackage.POOL_ROUND__ROUND_HASH_RATES);
		}
		return roundHashRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BitminterPackage.POOL_ROUND__CHAINS:
				return ((InternalEList<?>)getChains()).basicRemove(otherEnd, msgs);
			case BitminterPackage.POOL_ROUND__ROUND_HASH_RATES:
				return ((InternalEList<?>)getRoundHashRates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitminterPackage.POOL_ROUND__CHAINS:
				return getChains();
			case BitminterPackage.POOL_ROUND__HASH_RATE:
				return getHashRate();
			case BitminterPackage.POOL_ROUND__ACTIVE_WORKERS:
				return getActiveWorkers();
			case BitminterPackage.POOL_ROUND__ACTIVE_USERS:
				return getActiveUsers();
			case BitminterPackage.POOL_ROUND__SHIFT_ACCEPTED:
				return getShiftAccepted();
			case BitminterPackage.POOL_ROUND__SHIFT_REJECTED:
				return getShiftRejected();
			case BitminterPackage.POOL_ROUND__SHIFT_DURATION:
				return getShiftDuration();
			case BitminterPackage.POOL_ROUND__SHIFT_SCORE:
				return getShiftScore();
			case BitminterPackage.POOL_ROUND__ROUND_HASH_RATES:
				return getRoundHashRates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BitminterPackage.POOL_ROUND__CHAINS:
				getChains().clear();
				getChains().addAll((Collection<? extends Chain>)newValue);
				return;
			case BitminterPackage.POOL_ROUND__HASH_RATE:
				setHashRate((Float)newValue);
				return;
			case BitminterPackage.POOL_ROUND__ACTIVE_WORKERS:
				setActiveWorkers((Integer)newValue);
				return;
			case BitminterPackage.POOL_ROUND__ACTIVE_USERS:
				setActiveUsers((Integer)newValue);
				return;
			case BitminterPackage.POOL_ROUND__SHIFT_ACCEPTED:
				setShiftAccepted((Integer)newValue);
				return;
			case BitminterPackage.POOL_ROUND__SHIFT_REJECTED:
				setShiftRejected((Integer)newValue);
				return;
			case BitminterPackage.POOL_ROUND__SHIFT_DURATION:
				setShiftDuration((Integer)newValue);
				return;
			case BitminterPackage.POOL_ROUND__SHIFT_SCORE:
				setShiftScore((Float)newValue);
				return;
			case BitminterPackage.POOL_ROUND__ROUND_HASH_RATES:
				getRoundHashRates().clear();
				getRoundHashRates().addAll((Collection<? extends RoundHashRate>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BitminterPackage.POOL_ROUND__CHAINS:
				getChains().clear();
				return;
			case BitminterPackage.POOL_ROUND__HASH_RATE:
				setHashRate(HASH_RATE_EDEFAULT);
				return;
			case BitminterPackage.POOL_ROUND__ACTIVE_WORKERS:
				setActiveWorkers(ACTIVE_WORKERS_EDEFAULT);
				return;
			case BitminterPackage.POOL_ROUND__ACTIVE_USERS:
				setActiveUsers(ACTIVE_USERS_EDEFAULT);
				return;
			case BitminterPackage.POOL_ROUND__SHIFT_ACCEPTED:
				setShiftAccepted(SHIFT_ACCEPTED_EDEFAULT);
				return;
			case BitminterPackage.POOL_ROUND__SHIFT_REJECTED:
				setShiftRejected(SHIFT_REJECTED_EDEFAULT);
				return;
			case BitminterPackage.POOL_ROUND__SHIFT_DURATION:
				setShiftDuration(SHIFT_DURATION_EDEFAULT);
				return;
			case BitminterPackage.POOL_ROUND__SHIFT_SCORE:
				setShiftScore(SHIFT_SCORE_EDEFAULT);
				return;
			case BitminterPackage.POOL_ROUND__ROUND_HASH_RATES:
				getRoundHashRates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BitminterPackage.POOL_ROUND__CHAINS:
				return chains != null && !chains.isEmpty();
			case BitminterPackage.POOL_ROUND__HASH_RATE:
				return hashRate != HASH_RATE_EDEFAULT;
			case BitminterPackage.POOL_ROUND__ACTIVE_WORKERS:
				return activeWorkers != ACTIVE_WORKERS_EDEFAULT;
			case BitminterPackage.POOL_ROUND__ACTIVE_USERS:
				return activeUsers != ACTIVE_USERS_EDEFAULT;
			case BitminterPackage.POOL_ROUND__SHIFT_ACCEPTED:
				return shiftAccepted != SHIFT_ACCEPTED_EDEFAULT;
			case BitminterPackage.POOL_ROUND__SHIFT_REJECTED:
				return shiftRejected != SHIFT_REJECTED_EDEFAULT;
			case BitminterPackage.POOL_ROUND__SHIFT_DURATION:
				return shiftDuration != SHIFT_DURATION_EDEFAULT;
			case BitminterPackage.POOL_ROUND__SHIFT_SCORE:
				return shiftScore != SHIFT_SCORE_EDEFAULT;
			case BitminterPackage.POOL_ROUND__ROUND_HASH_RATES:
				return roundHashRates != null && !roundHashRates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hashRate: ");
		result.append(hashRate);
		result.append(", activeWorkers: ");
		result.append(activeWorkers);
		result.append(", activeUsers: ");
		result.append(activeUsers);
		result.append(", shiftAccepted: ");
		result.append(shiftAccepted);
		result.append(", shiftRejected: ");
		result.append(shiftRejected);
		result.append(", shiftDuration: ");
		result.append(shiftDuration);
		result.append(", shiftScore: ");
		result.append(shiftScore);
		result.append(')');
		return result.toString();
	}

} //PoolRoundImpl
