/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.Work;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl#getTotalAccepted <em>Total Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl#getTotalRejected <em>Total Rejected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl#getRoundAccepted <em>Round Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl#getRoundRejected <em>Round Rejected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl#getCheckPointAccepted <em>Check Point Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.WorkImpl#getCheckPointRejected <em>Check Point Rejected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkImpl extends MinimalEObjectImpl.Container implements Work {
	/**
	 * The default value of the '{@link #getChainID() <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainID()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChainID() <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainID()
	 * @generated
	 * @ordered
	 */
	protected String chainID = CHAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAccepted() <em>Total Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_ACCEPTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalAccepted() <em>Total Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAccepted()
	 * @generated
	 * @ordered
	 */
	protected long totalAccepted = TOTAL_ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalRejected() <em>Total Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRejected()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_REJECTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalRejected() <em>Total Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRejected()
	 * @generated
	 * @ordered
	 */
	protected long totalRejected = TOTAL_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoundAccepted() <em>Round Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final long ROUND_ACCEPTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRoundAccepted() <em>Round Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundAccepted()
	 * @generated
	 * @ordered
	 */
	protected long roundAccepted = ROUND_ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoundRejected() <em>Round Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundRejected()
	 * @generated
	 * @ordered
	 */
	protected static final long ROUND_REJECTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRoundRejected() <em>Round Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundRejected()
	 * @generated
	 * @ordered
	 */
	protected long roundRejected = ROUND_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckPointAccepted() <em>Check Point Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckPointAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final long CHECK_POINT_ACCEPTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCheckPointAccepted() <em>Check Point Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckPointAccepted()
	 * @generated
	 * @ordered
	 */
	protected long checkPointAccepted = CHECK_POINT_ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckPointRejected() <em>Check Point Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckPointRejected()
	 * @generated
	 * @ordered
	 */
	protected static final long CHECK_POINT_REJECTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCheckPointRejected() <em>Check Point Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckPointRejected()
	 * @generated
	 * @ordered
	 */
	protected long checkPointRejected = CHECK_POINT_REJECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChainID() {
		return chainID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainID(String newChainID) {
		String oldChainID = chainID;
		chainID = newChainID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORK__CHAIN_ID, oldChainID, chainID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotalAccepted() {
		return totalAccepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalAccepted(long newTotalAccepted) {
		long oldTotalAccepted = totalAccepted;
		totalAccepted = newTotalAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORK__TOTAL_ACCEPTED, oldTotalAccepted, totalAccepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotalRejected() {
		return totalRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalRejected(long newTotalRejected) {
		long oldTotalRejected = totalRejected;
		totalRejected = newTotalRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORK__TOTAL_REJECTED, oldTotalRejected, totalRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRoundAccepted() {
		return roundAccepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundAccepted(long newRoundAccepted) {
		long oldRoundAccepted = roundAccepted;
		roundAccepted = newRoundAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORK__ROUND_ACCEPTED, oldRoundAccepted, roundAccepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRoundRejected() {
		return roundRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundRejected(long newRoundRejected) {
		long oldRoundRejected = roundRejected;
		roundRejected = newRoundRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORK__ROUND_REJECTED, oldRoundRejected, roundRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCheckPointAccepted() {
		return checkPointAccepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckPointAccepted(long newCheckPointAccepted) {
		long oldCheckPointAccepted = checkPointAccepted;
		checkPointAccepted = newCheckPointAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORK__CHECK_POINT_ACCEPTED, oldCheckPointAccepted, checkPointAccepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCheckPointRejected() {
		return checkPointRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckPointRejected(long newCheckPointRejected) {
		long oldCheckPointRejected = checkPointRejected;
		checkPointRejected = newCheckPointRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.WORK__CHECK_POINT_REJECTED, oldCheckPointRejected, checkPointRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitminterPackage.WORK__CHAIN_ID:
				return getChainID();
			case BitminterPackage.WORK__TOTAL_ACCEPTED:
				return getTotalAccepted();
			case BitminterPackage.WORK__TOTAL_REJECTED:
				return getTotalRejected();
			case BitminterPackage.WORK__ROUND_ACCEPTED:
				return getRoundAccepted();
			case BitminterPackage.WORK__ROUND_REJECTED:
				return getRoundRejected();
			case BitminterPackage.WORK__CHECK_POINT_ACCEPTED:
				return getCheckPointAccepted();
			case BitminterPackage.WORK__CHECK_POINT_REJECTED:
				return getCheckPointRejected();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BitminterPackage.WORK__CHAIN_ID:
				setChainID((String)newValue);
				return;
			case BitminterPackage.WORK__TOTAL_ACCEPTED:
				setTotalAccepted((Long)newValue);
				return;
			case BitminterPackage.WORK__TOTAL_REJECTED:
				setTotalRejected((Long)newValue);
				return;
			case BitminterPackage.WORK__ROUND_ACCEPTED:
				setRoundAccepted((Long)newValue);
				return;
			case BitminterPackage.WORK__ROUND_REJECTED:
				setRoundRejected((Long)newValue);
				return;
			case BitminterPackage.WORK__CHECK_POINT_ACCEPTED:
				setCheckPointAccepted((Long)newValue);
				return;
			case BitminterPackage.WORK__CHECK_POINT_REJECTED:
				setCheckPointRejected((Long)newValue);
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
			case BitminterPackage.WORK__CHAIN_ID:
				setChainID(CHAIN_ID_EDEFAULT);
				return;
			case BitminterPackage.WORK__TOTAL_ACCEPTED:
				setTotalAccepted(TOTAL_ACCEPTED_EDEFAULT);
				return;
			case BitminterPackage.WORK__TOTAL_REJECTED:
				setTotalRejected(TOTAL_REJECTED_EDEFAULT);
				return;
			case BitminterPackage.WORK__ROUND_ACCEPTED:
				setRoundAccepted(ROUND_ACCEPTED_EDEFAULT);
				return;
			case BitminterPackage.WORK__ROUND_REJECTED:
				setRoundRejected(ROUND_REJECTED_EDEFAULT);
				return;
			case BitminterPackage.WORK__CHECK_POINT_ACCEPTED:
				setCheckPointAccepted(CHECK_POINT_ACCEPTED_EDEFAULT);
				return;
			case BitminterPackage.WORK__CHECK_POINT_REJECTED:
				setCheckPointRejected(CHECK_POINT_REJECTED_EDEFAULT);
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
			case BitminterPackage.WORK__CHAIN_ID:
				return CHAIN_ID_EDEFAULT == null ? chainID != null : !CHAIN_ID_EDEFAULT.equals(chainID);
			case BitminterPackage.WORK__TOTAL_ACCEPTED:
				return totalAccepted != TOTAL_ACCEPTED_EDEFAULT;
			case BitminterPackage.WORK__TOTAL_REJECTED:
				return totalRejected != TOTAL_REJECTED_EDEFAULT;
			case BitminterPackage.WORK__ROUND_ACCEPTED:
				return roundAccepted != ROUND_ACCEPTED_EDEFAULT;
			case BitminterPackage.WORK__ROUND_REJECTED:
				return roundRejected != ROUND_REJECTED_EDEFAULT;
			case BitminterPackage.WORK__CHECK_POINT_ACCEPTED:
				return checkPointAccepted != CHECK_POINT_ACCEPTED_EDEFAULT;
			case BitminterPackage.WORK__CHECK_POINT_REJECTED:
				return checkPointRejected != CHECK_POINT_REJECTED_EDEFAULT;
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
		result.append(" (chainID: ");
		result.append(chainID);
		result.append(", totalAccepted: ");
		result.append(totalAccepted);
		result.append(", totalRejected: ");
		result.append(totalRejected);
		result.append(", roundAccepted: ");
		result.append(roundAccepted);
		result.append(", roundRejected: ");
		result.append(roundRejected);
		result.append(", checkPointAccepted: ");
		result.append(checkPointAccepted);
		result.append(", checkPointRejected: ");
		result.append(checkPointRejected);
		result.append(')');
		return result.toString();
	}

} //WorkImpl
