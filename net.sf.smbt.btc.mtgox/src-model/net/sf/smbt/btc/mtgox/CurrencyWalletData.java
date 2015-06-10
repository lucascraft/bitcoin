/**
 */
package net.sf.smbt.btc.mtgox;

import net.sf.smbt.btc.BtcCurrency;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency Wallet Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getOperations <em>Operations</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getMaxWithdrawLimit <em>Max Withdraw Limit</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getOrders <em>Orders</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getMonthlyLimit <em>Monthly Limit</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getDailyLimit <em>Daily Limit</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCurrencyWalletData()
 * @model
 * @generated
 */
public interface CurrencyWalletData extends EObject {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.btc.BtcCurrency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #setCurrency(BtcCurrency)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCurrencyWalletData_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(BtcCurrency value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' reference.
	 * @see #setBalance(WithdrawInfo)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCurrencyWalletData_Balance()
	 * @model
	 * @generated
	 */
	WithdrawInfo getBalance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getBalance <em>Balance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' reference.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(WithdrawInfo value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' attribute.
	 * @see #setOperations(int)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCurrencyWalletData_Operations()
	 * @model
	 * @generated
	 */
	int getOperations();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getOperations <em>Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' attribute.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(int value);

	/**
	 * Returns the value of the '<em><b>Max Withdraw Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Withdraw Limit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Withdraw Limit</em>' reference.
	 * @see #setMaxWithdrawLimit(WithdrawInfo)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCurrencyWalletData_MaxWithdrawLimit()
	 * @model
	 * @generated
	 */
	WithdrawInfo getMaxWithdrawLimit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getMaxWithdrawLimit <em>Max Withdraw Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Withdraw Limit</em>' reference.
	 * @see #getMaxWithdrawLimit()
	 * @generated
	 */
	void setMaxWithdrawLimit(WithdrawInfo value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' reference.
	 * @see #setOrders(WithdrawInfo)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCurrencyWalletData_Orders()
	 * @model
	 * @generated
	 */
	WithdrawInfo getOrders();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getOrders <em>Orders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orders</em>' reference.
	 * @see #getOrders()
	 * @generated
	 */
	void setOrders(WithdrawInfo value);

	/**
	 * Returns the value of the '<em><b>Monthly Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monthly Limit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monthly Limit</em>' reference.
	 * @see #setMonthlyLimit(WithdrawInfo)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCurrencyWalletData_MonthlyLimit()
	 * @model
	 * @generated
	 */
	WithdrawInfo getMonthlyLimit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getMonthlyLimit <em>Monthly Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monthly Limit</em>' reference.
	 * @see #getMonthlyLimit()
	 * @generated
	 */
	void setMonthlyLimit(WithdrawInfo value);

	/**
	 * Returns the value of the '<em><b>Daily Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Limit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Limit</em>' reference.
	 * @see #setDailyLimit(WithdrawInfo)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCurrencyWalletData_DailyLimit()
	 * @model
	 * @generated
	 */
	WithdrawInfo getDailyLimit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getDailyLimit <em>Daily Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Limit</em>' reference.
	 * @see #getDailyLimit()
	 * @generated
	 */
	void setDailyLimit(WithdrawInfo value);

} // CurrencyWalletData
