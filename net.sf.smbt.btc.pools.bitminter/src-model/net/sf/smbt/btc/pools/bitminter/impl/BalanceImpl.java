/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import net.sf.smbt.btc.pools.bitminter.Balance;
import net.sf.smbt.btc.pools.bitminter.BitminterPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.BalanceImpl#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.BalanceImpl#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BalanceImpl extends MinimalEObjectImpl.Container implements Balance {
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
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected float balance = BALANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BalanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.BALANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.BALANCE__CHAIN_ID, oldChainID, chainID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(float newBalance) {
		float oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.BALANCE__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitminterPackage.BALANCE__CHAIN_ID:
				return getChainID();
			case BitminterPackage.BALANCE__BALANCE:
				return getBalance();
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
			case BitminterPackage.BALANCE__CHAIN_ID:
				setChainID((String)newValue);
				return;
			case BitminterPackage.BALANCE__BALANCE:
				setBalance((Float)newValue);
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
			case BitminterPackage.BALANCE__CHAIN_ID:
				setChainID(CHAIN_ID_EDEFAULT);
				return;
			case BitminterPackage.BALANCE__BALANCE:
				setBalance(BALANCE_EDEFAULT);
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
			case BitminterPackage.BALANCE__CHAIN_ID:
				return CHAIN_ID_EDEFAULT == null ? chainID != null : !CHAIN_ID_EDEFAULT.equals(chainID);
			case BitminterPackage.BALANCE__BALANCE:
				return balance != BALANCE_EDEFAULT;
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
		result.append(", balance: ");
		result.append(balance);
		result.append(')');
		return result.toString();
	}

} //BalanceImpl
