/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.Chain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ChainImpl#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ChainImpl#getRejected <em>Rejected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ChainImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ChainImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ChainImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainImpl extends MinimalEObjectImpl.Container implements Chain {
	/**
	 * The default value of the '{@link #getAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final long ACCEPTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccepted()
	 * @generated
	 * @ordered
	 */
	protected long accepted = ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRejected() <em>Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejected()
	 * @generated
	 * @ordered
	 */
	protected static final long REJECTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRejected() <em>Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejected()
	 * @generated
	 * @ordered
	 */
	protected long rejected = REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final float DIFFICULTY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected float difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAccepted() {
		return accepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccepted(long newAccepted) {
		long oldAccepted = accepted;
		accepted = newAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.CHAIN__ACCEPTED, oldAccepted, accepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRejected() {
		return rejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRejected(long newRejected) {
		long oldRejected = rejected;
		rejected = newRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.CHAIN__REJECTED, oldRejected, rejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(long newDuration) {
		long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.CHAIN__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifficulty(float newDifficulty) {
		float oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.CHAIN__DIFFICULTY, oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.CHAIN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitminterPackage.CHAIN__ACCEPTED:
				return getAccepted();
			case BitminterPackage.CHAIN__REJECTED:
				return getRejected();
			case BitminterPackage.CHAIN__DURATION:
				return getDuration();
			case BitminterPackage.CHAIN__DIFFICULTY:
				return getDifficulty();
			case BitminterPackage.CHAIN__ID:
				return getId();
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
			case BitminterPackage.CHAIN__ACCEPTED:
				setAccepted((Long)newValue);
				return;
			case BitminterPackage.CHAIN__REJECTED:
				setRejected((Long)newValue);
				return;
			case BitminterPackage.CHAIN__DURATION:
				setDuration((Long)newValue);
				return;
			case BitminterPackage.CHAIN__DIFFICULTY:
				setDifficulty((Float)newValue);
				return;
			case BitminterPackage.CHAIN__ID:
				setId((String)newValue);
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
			case BitminterPackage.CHAIN__ACCEPTED:
				setAccepted(ACCEPTED_EDEFAULT);
				return;
			case BitminterPackage.CHAIN__REJECTED:
				setRejected(REJECTED_EDEFAULT);
				return;
			case BitminterPackage.CHAIN__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case BitminterPackage.CHAIN__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case BitminterPackage.CHAIN__ID:
				setId(ID_EDEFAULT);
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
			case BitminterPackage.CHAIN__ACCEPTED:
				return accepted != ACCEPTED_EDEFAULT;
			case BitminterPackage.CHAIN__REJECTED:
				return rejected != REJECTED_EDEFAULT;
			case BitminterPackage.CHAIN__DURATION:
				return duration != DURATION_EDEFAULT;
			case BitminterPackage.CHAIN__DIFFICULTY:
				return difficulty != DIFFICULTY_EDEFAULT;
			case BitminterPackage.CHAIN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (accepted: ");
		result.append(accepted);
		result.append(", rejected: ");
		result.append(rejected);
		result.append(", duration: ");
		result.append(duration);
		result.append(", difficulty: ");
		result.append(difficulty);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ChainImpl
