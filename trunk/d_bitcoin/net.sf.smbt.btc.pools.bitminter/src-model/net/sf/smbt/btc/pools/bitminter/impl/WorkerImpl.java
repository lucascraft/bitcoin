/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import java.util.Collection;

import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.DatedHashRate;
import net.sf.smbt.btc.pools.bitminter.Work;
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
 * An implementation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl#getLastWork <em>Last Work</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl#getHashRate <em>Hash Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl#getAlive <em>Alive</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkerImpl#getHashRates <em>Hash Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkerImpl extends MinimalEObjectImpl.Container implements Worker {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastWork() <em>Last Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastWork()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_WORK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLastWork() <em>Last Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastWork()
	 * @generated
	 * @ordered
	 */
	protected long lastWork = LAST_WORK_EDEFAULT;

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
	 * The default value of the '{@link #getAlive() <em>Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlive()
	 * @generated
	 * @ordered
	 */
	protected static final int ALIVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlive() <em>Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlive()
	 * @generated
	 * @ordered
	 */
	protected int alive = ALIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

	/**
	 * The cached value of the '{@link #getHashRates() <em>Hash Rates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashRates()
	 * @generated
	 * @ordered
	 */
	protected EList<DatedHashRate> hashRates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.WORKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORKER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastWork() {
		return lastWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastWork(long newLastWork) {
		long oldLastWork = lastWork;
		lastWork = newLastWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORKER__LAST_WORK, oldLastWork, lastWork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORKER__HASH_RATE, oldHashRate, hashRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlive() {
		return alive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlive(int newAlive) {
		int oldAlive = alive;
		alive = newAlive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORKER__ALIVE, oldAlive, alive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new EObjectContainmentEList<Work>(Work.class, this, BitminterPackage.WORKER__WORKS);
		}
		return works;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatedHashRate> getHashRates() {
		if (hashRates == null) {
			hashRates = new EObjectContainmentEList<DatedHashRate>(DatedHashRate.class, this, BitminterPackage.WORKER__HASH_RATES);
		}
		return hashRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BitminterPackage.WORKER__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case BitminterPackage.WORKER__HASH_RATES:
				return ((InternalEList<?>)getHashRates()).basicRemove(otherEnd, msgs);
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
			case BitminterPackage.WORKER__NAME:
				return getName();
			case BitminterPackage.WORKER__LAST_WORK:
				return getLastWork();
			case BitminterPackage.WORKER__HASH_RATE:
				return getHashRate();
			case BitminterPackage.WORKER__ALIVE:
				return getAlive();
			case BitminterPackage.WORKER__WORKS:
				return getWorks();
			case BitminterPackage.WORKER__HASH_RATES:
				return getHashRates();
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
			case BitminterPackage.WORKER__NAME:
				setName((String)newValue);
				return;
			case BitminterPackage.WORKER__LAST_WORK:
				setLastWork((Long)newValue);
				return;
			case BitminterPackage.WORKER__HASH_RATE:
				setHashRate((Float)newValue);
				return;
			case BitminterPackage.WORKER__ALIVE:
				setAlive((Integer)newValue);
				return;
			case BitminterPackage.WORKER__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case BitminterPackage.WORKER__HASH_RATES:
				getHashRates().clear();
				getHashRates().addAll((Collection<? extends DatedHashRate>)newValue);
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
			case BitminterPackage.WORKER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BitminterPackage.WORKER__LAST_WORK:
				setLastWork(LAST_WORK_EDEFAULT);
				return;
			case BitminterPackage.WORKER__HASH_RATE:
				setHashRate(HASH_RATE_EDEFAULT);
				return;
			case BitminterPackage.WORKER__ALIVE:
				setAlive(ALIVE_EDEFAULT);
				return;
			case BitminterPackage.WORKER__WORKS:
				getWorks().clear();
				return;
			case BitminterPackage.WORKER__HASH_RATES:
				getHashRates().clear();
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
			case BitminterPackage.WORKER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BitminterPackage.WORKER__LAST_WORK:
				return lastWork != LAST_WORK_EDEFAULT;
			case BitminterPackage.WORKER__HASH_RATE:
				return hashRate != HASH_RATE_EDEFAULT;
			case BitminterPackage.WORKER__ALIVE:
				return alive != ALIVE_EDEFAULT;
			case BitminterPackage.WORKER__WORKS:
				return works != null && !works.isEmpty();
			case BitminterPackage.WORKER__HASH_RATES:
				return hashRates != null && !hashRates.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", lastWork: ");
		result.append(lastWork);
		result.append(", hashRate: ");
		result.append(hashRate);
		result.append(", alive: ");
		result.append(alive);
		result.append(')');
		return result.toString();
	}

} //WorkerImpl
