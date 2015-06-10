/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import java.util.Collection;
import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.DatedRate;
import net.sf.smbt.btc.pools.bitminter.PoolStats;

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
 * An implementation of the model object '<em><b>Pool Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolStatsImpl#getHashRate <em>Hash Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolStatsImpl#getActiveWorkers <em>Active Workers</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolStatsImpl#getActiveUsers <em>Active Users</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.PoolStatsImpl#getDatedRates <em>Dated Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PoolStatsImpl extends MinimalEObjectImpl.Container implements PoolStats {
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
	 * The cached value of the '{@link #getDatedRates() <em>Dated Rates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatedRates()
	 * @generated
	 * @ordered
	 */
	protected EList<DatedRate> datedRates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.POOL_STATS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_STATS__HASH_RATE, oldHashRate, hashRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_STATS__ACTIVE_WORKERS, oldActiveWorkers, activeWorkers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.POOL_STATS__ACTIVE_USERS, oldActiveUsers, activeUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatedRate> getDatedRates() {
		if (datedRates == null) {
			datedRates = new EObjectContainmentEList<DatedRate>(DatedRate.class, this, BitminterPackage.POOL_STATS__DATED_RATES);
		}
		return datedRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BitminterPackage.POOL_STATS__DATED_RATES:
				return ((InternalEList<?>)getDatedRates()).basicRemove(otherEnd, msgs);
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
			case BitminterPackage.POOL_STATS__HASH_RATE:
				return getHashRate();
			case BitminterPackage.POOL_STATS__ACTIVE_WORKERS:
				return getActiveWorkers();
			case BitminterPackage.POOL_STATS__ACTIVE_USERS:
				return getActiveUsers();
			case BitminterPackage.POOL_STATS__DATED_RATES:
				return getDatedRates();
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
			case BitminterPackage.POOL_STATS__HASH_RATE:
				setHashRate((Float)newValue);
				return;
			case BitminterPackage.POOL_STATS__ACTIVE_WORKERS:
				setActiveWorkers((Integer)newValue);
				return;
			case BitminterPackage.POOL_STATS__ACTIVE_USERS:
				setActiveUsers((Integer)newValue);
				return;
			case BitminterPackage.POOL_STATS__DATED_RATES:
				getDatedRates().clear();
				getDatedRates().addAll((Collection<? extends DatedRate>)newValue);
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
			case BitminterPackage.POOL_STATS__HASH_RATE:
				setHashRate(HASH_RATE_EDEFAULT);
				return;
			case BitminterPackage.POOL_STATS__ACTIVE_WORKERS:
				setActiveWorkers(ACTIVE_WORKERS_EDEFAULT);
				return;
			case BitminterPackage.POOL_STATS__ACTIVE_USERS:
				setActiveUsers(ACTIVE_USERS_EDEFAULT);
				return;
			case BitminterPackage.POOL_STATS__DATED_RATES:
				getDatedRates().clear();
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
			case BitminterPackage.POOL_STATS__HASH_RATE:
				return hashRate != HASH_RATE_EDEFAULT;
			case BitminterPackage.POOL_STATS__ACTIVE_WORKERS:
				return activeWorkers != ACTIVE_WORKERS_EDEFAULT;
			case BitminterPackage.POOL_STATS__ACTIVE_USERS:
				return activeUsers != ACTIVE_USERS_EDEFAULT;
			case BitminterPackage.POOL_STATS__DATED_RATES:
				return datedRates != null && !datedRates.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PoolStatsImpl
