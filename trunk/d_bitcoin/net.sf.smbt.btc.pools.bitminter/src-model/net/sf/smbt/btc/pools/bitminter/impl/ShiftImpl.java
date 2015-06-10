/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.Shift;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ShiftImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ShiftImpl#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ShiftImpl#getUser_score <em>User score</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.ShiftImpl#getTotal_score <em>Total score</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShiftImpl extends MinimalEObjectImpl.Container implements Shift {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final long START_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected long start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCEPTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccepted()
	 * @generated
	 * @ordered
	 */
	protected int accepted = ACCEPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser_score() <em>User score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_score()
	 * @generated
	 * @ordered
	 */
	protected static final float USER_SCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUser_score() <em>User score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_score()
	 * @generated
	 * @ordered
	 */
	protected float user_score = USER_SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_score() <em>Total score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_score()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_SCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotal_score() <em>Total score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_score()
	 * @generated
	 * @ordered
	 */
	protected float total_score = TOTAL_SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.SHIFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(long newStart) {
		long oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.SHIFT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAccepted() {
		return accepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccepted(int newAccepted) {
		int oldAccepted = accepted;
		accepted = newAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.SHIFT__ACCEPTED, oldAccepted, accepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUser_score() {
		return user_score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_score(float newUser_score) {
		float oldUser_score = user_score;
		user_score = newUser_score;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.SHIFT__USER_SCORE, oldUser_score, user_score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotal_score() {
		return total_score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_score(float newTotal_score) {
		float oldTotal_score = total_score;
		total_score = newTotal_score;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.SHIFT__TOTAL_SCORE, oldTotal_score, total_score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitminterPackage.SHIFT__START:
				return getStart();
			case BitminterPackage.SHIFT__ACCEPTED:
				return getAccepted();
			case BitminterPackage.SHIFT__USER_SCORE:
				return getUser_score();
			case BitminterPackage.SHIFT__TOTAL_SCORE:
				return getTotal_score();
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
			case BitminterPackage.SHIFT__START:
				setStart((Long)newValue);
				return;
			case BitminterPackage.SHIFT__ACCEPTED:
				setAccepted((Integer)newValue);
				return;
			case BitminterPackage.SHIFT__USER_SCORE:
				setUser_score((Float)newValue);
				return;
			case BitminterPackage.SHIFT__TOTAL_SCORE:
				setTotal_score((Float)newValue);
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
			case BitminterPackage.SHIFT__START:
				setStart(START_EDEFAULT);
				return;
			case BitminterPackage.SHIFT__ACCEPTED:
				setAccepted(ACCEPTED_EDEFAULT);
				return;
			case BitminterPackage.SHIFT__USER_SCORE:
				setUser_score(USER_SCORE_EDEFAULT);
				return;
			case BitminterPackage.SHIFT__TOTAL_SCORE:
				setTotal_score(TOTAL_SCORE_EDEFAULT);
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
			case BitminterPackage.SHIFT__START:
				return start != START_EDEFAULT;
			case BitminterPackage.SHIFT__ACCEPTED:
				return accepted != ACCEPTED_EDEFAULT;
			case BitminterPackage.SHIFT__USER_SCORE:
				return user_score != USER_SCORE_EDEFAULT;
			case BitminterPackage.SHIFT__TOTAL_SCORE:
				return total_score != TOTAL_SCORE_EDEFAULT;
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
		result.append(" (start: ");
		result.append(start);
		result.append(", accepted: ");
		result.append(accepted);
		result.append(", user_score: ");
		result.append(user_score);
		result.append(", total_score: ");
		result.append(total_score);
		result.append(')');
		return result.toString();
	}

} //ShiftImpl
