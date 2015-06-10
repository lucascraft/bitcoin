/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import java.util.Collection;

import net.sf.smbt.btc.pools.bitminter.Balance;
import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.RoundStart;
import net.sf.smbt.btc.pools.bitminter.Shift;
import net.sf.smbt.btc.pools.bitminter.UserData;
import net.sf.smbt.btc.pools.bitminter.UserHashRate;
import net.sf.smbt.btc.pools.bitminter.Worker;

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
 * An implementation of the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl#getActiveWorkers <em>Active Workers</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl#getHashRate <em>Hash Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl#getNow <em>Now</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl#getRoundStarts <em>Round Starts</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl#getBalances <em>Balances</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl#getWorkers <em>Workers</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.UserDataImpl#getUserHashRates <em>User Hash Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDataImpl extends MinimalEObjectImpl.Container implements UserData {
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
	 * The default value of the '{@link #getNow() <em>Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNow()
	 * @generated
	 * @ordered
	 */
	protected static final long NOW_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNow() <em>Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNow()
	 * @generated
	 * @ordered
	 */
	protected long now = NOW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoundStarts() <em>Round Starts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundStarts()
	 * @generated
	 * @ordered
	 */
	protected EList<RoundStart> roundStarts;

	/**
	 * The cached value of the '{@link #getShift() <em>Shift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected Shift shift;

	/**
	 * The cached value of the '{@link #getBalances() <em>Balances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalances()
	 * @generated
	 * @ordered
	 */
	protected EList<Balance> balances;

	/**
	 * The cached value of the '{@link #getWorkers() <em>Workers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkers()
	 * @generated
	 * @ordered
	 */
	protected EList<Worker> workers;

	/**
	 * The cached value of the '{@link #getUserHashRates() <em>User Hash Rates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserHashRates()
	 * @generated
	 * @ordered
	 */
	protected EList<UserHashRate> userHashRates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.USER_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.USER_DATA__ACTIVE_WORKERS, oldActiveWorkers, activeWorkers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.USER_DATA__HASH_RATE, oldHashRate, hashRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNow() {
		return now;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNow(long newNow) {
		long oldNow = now;
		now = newNow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.USER_DATA__NOW, oldNow, now));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoundStart> getRoundStarts() {
		if (roundStarts == null) {
			roundStarts = new EObjectContainmentEList<RoundStart>(RoundStart.class, this, BitminterPackage.USER_DATA__ROUND_STARTS);
		}
		return roundStarts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift getShift() {
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShift(Shift newShift, NotificationChain msgs) {
		Shift oldShift = shift;
		shift = newShift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BitminterPackage.USER_DATA__SHIFT, oldShift, newShift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShift(Shift newShift) {
		if (newShift != shift) {
			NotificationChain msgs = null;
			if (shift != null)
				msgs = ((InternalEObject)shift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BitminterPackage.USER_DATA__SHIFT, null, msgs);
			if (newShift != null)
				msgs = ((InternalEObject)newShift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BitminterPackage.USER_DATA__SHIFT, null, msgs);
			msgs = basicSetShift(newShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.USER_DATA__SHIFT, newShift, newShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Balance> getBalances() {
		if (balances == null) {
			balances = new EObjectContainmentEList<Balance>(Balance.class, this, BitminterPackage.USER_DATA__BALANCES);
		}
		return balances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Worker> getWorkers() {
		if (workers == null) {
			workers = new EObjectContainmentEList<Worker>(Worker.class, this, BitminterPackage.USER_DATA__WORKERS);
		}
		return workers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserHashRate> getUserHashRates() {
		if (userHashRates == null) {
			userHashRates = new EObjectContainmentEList<UserHashRate>(UserHashRate.class, this, BitminterPackage.USER_DATA__USER_HASH_RATES);
		}
		return userHashRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BitminterPackage.USER_DATA__ROUND_STARTS:
				return ((InternalEList<?>)getRoundStarts()).basicRemove(otherEnd, msgs);
			case BitminterPackage.USER_DATA__SHIFT:
				return basicSetShift(null, msgs);
			case BitminterPackage.USER_DATA__BALANCES:
				return ((InternalEList<?>)getBalances()).basicRemove(otherEnd, msgs);
			case BitminterPackage.USER_DATA__WORKERS:
				return ((InternalEList<?>)getWorkers()).basicRemove(otherEnd, msgs);
			case BitminterPackage.USER_DATA__USER_HASH_RATES:
				return ((InternalEList<?>)getUserHashRates()).basicRemove(otherEnd, msgs);
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
			case BitminterPackage.USER_DATA__ACTIVE_WORKERS:
				return getActiveWorkers();
			case BitminterPackage.USER_DATA__HASH_RATE:
				return getHashRate();
			case BitminterPackage.USER_DATA__NOW:
				return getNow();
			case BitminterPackage.USER_DATA__ROUND_STARTS:
				return getRoundStarts();
			case BitminterPackage.USER_DATA__SHIFT:
				return getShift();
			case BitminterPackage.USER_DATA__BALANCES:
				return getBalances();
			case BitminterPackage.USER_DATA__WORKERS:
				return getWorkers();
			case BitminterPackage.USER_DATA__USER_HASH_RATES:
				return getUserHashRates();
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
			case BitminterPackage.USER_DATA__ACTIVE_WORKERS:
				setActiveWorkers((Integer)newValue);
				return;
			case BitminterPackage.USER_DATA__HASH_RATE:
				setHashRate((Float)newValue);
				return;
			case BitminterPackage.USER_DATA__NOW:
				setNow((Long)newValue);
				return;
			case BitminterPackage.USER_DATA__ROUND_STARTS:
				getRoundStarts().clear();
				getRoundStarts().addAll((Collection<? extends RoundStart>)newValue);
				return;
			case BitminterPackage.USER_DATA__SHIFT:
				setShift((Shift)newValue);
				return;
			case BitminterPackage.USER_DATA__BALANCES:
				getBalances().clear();
				getBalances().addAll((Collection<? extends Balance>)newValue);
				return;
			case BitminterPackage.USER_DATA__WORKERS:
				getWorkers().clear();
				getWorkers().addAll((Collection<? extends Worker>)newValue);
				return;
			case BitminterPackage.USER_DATA__USER_HASH_RATES:
				getUserHashRates().clear();
				getUserHashRates().addAll((Collection<? extends UserHashRate>)newValue);
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
			case BitminterPackage.USER_DATA__ACTIVE_WORKERS:
				setActiveWorkers(ACTIVE_WORKERS_EDEFAULT);
				return;
			case BitminterPackage.USER_DATA__HASH_RATE:
				setHashRate(HASH_RATE_EDEFAULT);
				return;
			case BitminterPackage.USER_DATA__NOW:
				setNow(NOW_EDEFAULT);
				return;
			case BitminterPackage.USER_DATA__ROUND_STARTS:
				getRoundStarts().clear();
				return;
			case BitminterPackage.USER_DATA__SHIFT:
				setShift((Shift)null);
				return;
			case BitminterPackage.USER_DATA__BALANCES:
				getBalances().clear();
				return;
			case BitminterPackage.USER_DATA__WORKERS:
				getWorkers().clear();
				return;
			case BitminterPackage.USER_DATA__USER_HASH_RATES:
				getUserHashRates().clear();
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
			case BitminterPackage.USER_DATA__ACTIVE_WORKERS:
				return activeWorkers != ACTIVE_WORKERS_EDEFAULT;
			case BitminterPackage.USER_DATA__HASH_RATE:
				return hashRate != HASH_RATE_EDEFAULT;
			case BitminterPackage.USER_DATA__NOW:
				return now != NOW_EDEFAULT;
			case BitminterPackage.USER_DATA__ROUND_STARTS:
				return roundStarts != null && !roundStarts.isEmpty();
			case BitminterPackage.USER_DATA__SHIFT:
				return shift != null;
			case BitminterPackage.USER_DATA__BALANCES:
				return balances != null && !balances.isEmpty();
			case BitminterPackage.USER_DATA__WORKERS:
				return workers != null && !workers.isEmpty();
			case BitminterPackage.USER_DATA__USER_HASH_RATES:
				return userHashRates != null && !userHashRates.isEmpty();
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
		result.append(" (activeWorkers: ");
		result.append(activeWorkers);
		result.append(", hashRate: ");
		result.append(hashRate);
		result.append(", now: ");
		result.append(now);
		result.append(')');
		return result.toString();
	}

} //UserDataImpl
