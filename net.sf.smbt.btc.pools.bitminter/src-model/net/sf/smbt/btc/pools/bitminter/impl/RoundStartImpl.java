/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.RoundStart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Round Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.RoundStartImpl#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.RoundStartImpl#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoundStartImpl extends MinimalEObjectImpl.Container implements RoundStart {
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
	 * The default value of the '{@link #getShift() <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected static final int SHIFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShift() <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected int shift = SHIFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.ROUND_START;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.ROUND_START__CHAIN_ID, oldChainID, chainID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShift() {
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShift(int newShift) {
		int oldShift = shift;
		shift = newShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.ROUND_START__SHIFT, oldShift, shift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitminterPackage.ROUND_START__CHAIN_ID:
				return getChainID();
			case BitminterPackage.ROUND_START__SHIFT:
				return getShift();
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
			case BitminterPackage.ROUND_START__CHAIN_ID:
				setChainID((String)newValue);
				return;
			case BitminterPackage.ROUND_START__SHIFT:
				setShift((Integer)newValue);
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
			case BitminterPackage.ROUND_START__CHAIN_ID:
				setChainID(CHAIN_ID_EDEFAULT);
				return;
			case BitminterPackage.ROUND_START__SHIFT:
				setShift(SHIFT_EDEFAULT);
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
			case BitminterPackage.ROUND_START__CHAIN_ID:
				return CHAIN_ID_EDEFAULT == null ? chainID != null : !CHAIN_ID_EDEFAULT.equals(chainID);
			case BitminterPackage.ROUND_START__SHIFT:
				return shift != SHIFT_EDEFAULT;
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
		result.append(", shift: ");
		result.append(shift);
		result.append(')');
		return result.toString();
	}

} //RoundStartImpl
