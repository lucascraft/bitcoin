/**
 */
package net.sf.smbt.btc.mtgox.impl;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.CurrencyWalletData;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.btc.mtgox.WithdrawInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currency Wallet Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl#getMaxWithdrawLimit <em>Max Withdraw Limit</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl#getMonthlyLimit <em>Monthly Limit</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl#getDailyLimit <em>Daily Limit</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrencyWalletDataImpl extends MinimalEObjectImpl.Container implements CurrencyWalletData {
	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final BtcCurrency CURRENCY_EDEFAULT = BtcCurrency.EUR;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected BtcCurrency currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperations() <em>Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected int operations = OPERATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaxWithdrawLimit() <em>Max Withdraw Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWithdrawLimit()
	 * @generated
	 * @ordered
	 */
	protected WithdrawInfo maxWithdrawLimit;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected WithdrawInfo orders;

	/**
	 * The cached value of the '{@link #getMonthlyLimit() <em>Monthly Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthlyLimit()
	 * @generated
	 * @ordered
	 */
	protected WithdrawInfo monthlyLimit;

	/**
	 * The cached value of the '{@link #getDailyLimit() <em>Daily Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyLimit()
	 * @generated
	 * @ordered
	 */
	protected WithdrawInfo dailyLimit;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected WithdrawInfo balance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrencyWalletDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.CURRENCY_WALLET_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcCurrency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(BtcCurrency newCurrency) {
		BtcCurrency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.CURRENCY_WALLET_DATA__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo getBalance() {
		if (balance != null && balance.eIsProxy()) {
			InternalEObject oldBalance = (InternalEObject)balance;
			balance = (WithdrawInfo)eResolveProxy(oldBalance);
			if (balance != oldBalance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.CURRENCY_WALLET_DATA__BALANCE, oldBalance, balance));
			}
		}
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo basicGetBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(WithdrawInfo newBalance) {
		WithdrawInfo oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.CURRENCY_WALLET_DATA__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperations() {
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperations(int newOperations) {
		int oldOperations = operations;
		operations = newOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.CURRENCY_WALLET_DATA__OPERATIONS, oldOperations, operations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo getMaxWithdrawLimit() {
		if (maxWithdrawLimit != null && maxWithdrawLimit.eIsProxy()) {
			InternalEObject oldMaxWithdrawLimit = (InternalEObject)maxWithdrawLimit;
			maxWithdrawLimit = (WithdrawInfo)eResolveProxy(oldMaxWithdrawLimit);
			if (maxWithdrawLimit != oldMaxWithdrawLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT, oldMaxWithdrawLimit, maxWithdrawLimit));
			}
		}
		return maxWithdrawLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo basicGetMaxWithdrawLimit() {
		return maxWithdrawLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWithdrawLimit(WithdrawInfo newMaxWithdrawLimit) {
		WithdrawInfo oldMaxWithdrawLimit = maxWithdrawLimit;
		maxWithdrawLimit = newMaxWithdrawLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT, oldMaxWithdrawLimit, maxWithdrawLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo getOrders() {
		if (orders != null && orders.eIsProxy()) {
			InternalEObject oldOrders = (InternalEObject)orders;
			orders = (WithdrawInfo)eResolveProxy(oldOrders);
			if (orders != oldOrders) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.CURRENCY_WALLET_DATA__ORDERS, oldOrders, orders));
			}
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo basicGetOrders() {
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrders(WithdrawInfo newOrders) {
		WithdrawInfo oldOrders = orders;
		orders = newOrders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.CURRENCY_WALLET_DATA__ORDERS, oldOrders, orders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo getMonthlyLimit() {
		if (monthlyLimit != null && monthlyLimit.eIsProxy()) {
			InternalEObject oldMonthlyLimit = (InternalEObject)monthlyLimit;
			monthlyLimit = (WithdrawInfo)eResolveProxy(oldMonthlyLimit);
			if (monthlyLimit != oldMonthlyLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.CURRENCY_WALLET_DATA__MONTHLY_LIMIT, oldMonthlyLimit, monthlyLimit));
			}
		}
		return monthlyLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo basicGetMonthlyLimit() {
		return monthlyLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthlyLimit(WithdrawInfo newMonthlyLimit) {
		WithdrawInfo oldMonthlyLimit = monthlyLimit;
		monthlyLimit = newMonthlyLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.CURRENCY_WALLET_DATA__MONTHLY_LIMIT, oldMonthlyLimit, monthlyLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo getDailyLimit() {
		if (dailyLimit != null && dailyLimit.eIsProxy()) {
			InternalEObject oldDailyLimit = (InternalEObject)dailyLimit;
			dailyLimit = (WithdrawInfo)eResolveProxy(oldDailyLimit);
			if (dailyLimit != oldDailyLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.CURRENCY_WALLET_DATA__DAILY_LIMIT, oldDailyLimit, dailyLimit));
			}
		}
		return dailyLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo basicGetDailyLimit() {
		return dailyLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyLimit(WithdrawInfo newDailyLimit) {
		WithdrawInfo oldDailyLimit = dailyLimit;
		dailyLimit = newDailyLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.CURRENCY_WALLET_DATA__DAILY_LIMIT, oldDailyLimit, dailyLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.CURRENCY_WALLET_DATA__CURRENCY:
				return getCurrency();
			case MtgoxPackage.CURRENCY_WALLET_DATA__OPERATIONS:
				return getOperations();
			case MtgoxPackage.CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT:
				if (resolve) return getMaxWithdrawLimit();
				return basicGetMaxWithdrawLimit();
			case MtgoxPackage.CURRENCY_WALLET_DATA__ORDERS:
				if (resolve) return getOrders();
				return basicGetOrders();
			case MtgoxPackage.CURRENCY_WALLET_DATA__MONTHLY_LIMIT:
				if (resolve) return getMonthlyLimit();
				return basicGetMonthlyLimit();
			case MtgoxPackage.CURRENCY_WALLET_DATA__DAILY_LIMIT:
				if (resolve) return getDailyLimit();
				return basicGetDailyLimit();
			case MtgoxPackage.CURRENCY_WALLET_DATA__BALANCE:
				if (resolve) return getBalance();
				return basicGetBalance();
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
			case MtgoxPackage.CURRENCY_WALLET_DATA__CURRENCY:
				setCurrency((BtcCurrency)newValue);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__OPERATIONS:
				setOperations((Integer)newValue);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT:
				setMaxWithdrawLimit((WithdrawInfo)newValue);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__ORDERS:
				setOrders((WithdrawInfo)newValue);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__MONTHLY_LIMIT:
				setMonthlyLimit((WithdrawInfo)newValue);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__DAILY_LIMIT:
				setDailyLimit((WithdrawInfo)newValue);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__BALANCE:
				setBalance((WithdrawInfo)newValue);
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
			case MtgoxPackage.CURRENCY_WALLET_DATA__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__OPERATIONS:
				setOperations(OPERATIONS_EDEFAULT);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT:
				setMaxWithdrawLimit((WithdrawInfo)null);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__ORDERS:
				setOrders((WithdrawInfo)null);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__MONTHLY_LIMIT:
				setMonthlyLimit((WithdrawInfo)null);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__DAILY_LIMIT:
				setDailyLimit((WithdrawInfo)null);
				return;
			case MtgoxPackage.CURRENCY_WALLET_DATA__BALANCE:
				setBalance((WithdrawInfo)null);
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
			case MtgoxPackage.CURRENCY_WALLET_DATA__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case MtgoxPackage.CURRENCY_WALLET_DATA__OPERATIONS:
				return operations != OPERATIONS_EDEFAULT;
			case MtgoxPackage.CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT:
				return maxWithdrawLimit != null;
			case MtgoxPackage.CURRENCY_WALLET_DATA__ORDERS:
				return orders != null;
			case MtgoxPackage.CURRENCY_WALLET_DATA__MONTHLY_LIMIT:
				return monthlyLimit != null;
			case MtgoxPackage.CURRENCY_WALLET_DATA__DAILY_LIMIT:
				return dailyLimit != null;
			case MtgoxPackage.CURRENCY_WALLET_DATA__BALANCE:
				return balance != null;
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
		result.append(" (currency: ");
		result.append(currency);
		result.append(", operations: ");
		result.append(operations);
		result.append(')');
		return result.toString();
	}

} //CurrencyWalletDataImpl
