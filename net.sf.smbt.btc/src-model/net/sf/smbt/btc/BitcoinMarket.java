/**
 */
package net.sf.smbt.btc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bitcoin Market</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getExchangeRates <em>Exchange Rates</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getOrders <em>Orders</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getBroker <em>Broker</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getHigh <em>High</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getLow <em>Low</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getBuy <em>Buy</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getSell <em>Sell</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getLast <em>Last</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getHistory <em>History</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getWallets <em>Wallets</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getAverage <em>Average</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getLastLocal <em>Last Local</em>}</li>
 *   <li>{@link net.sf.smbt.btc.BitcoinMarket#getLastOrig <em>Last Orig</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket()
 * @model
 * @generated
 */
public interface BitcoinMarket extends EObject {
	/**
	 * Returns the value of the '<em><b>Exchange Rates</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.ExchangeRate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Rates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Rates</em>' containment reference list.
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_ExchangeRates()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangeRate> getExchangeRates();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Broker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker</em>' attribute.
	 * @see #setBroker(String)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Broker()
	 * @model
	 * @generated
	 */
	String getBroker();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getBroker <em>Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker</em>' attribute.
	 * @see #getBroker()
	 * @generated
	 */
	void setBroker(String value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #setHigh(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_High()
	 * @model
	 * @generated
	 */
	float getHigh();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(float value);

	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #setLow(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Low()
	 * @model
	 * @generated
	 */
	float getLow();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(float value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Buy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buy</em>' attribute.
	 * @see #setBuy(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Buy()
	 * @model
	 * @generated
	 */
	float getBuy();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getBuy <em>Buy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buy</em>' attribute.
	 * @see #getBuy()
	 * @generated
	 */
	void setBuy(float value);

	/**
	 * Returns the value of the '<em><b>Sell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sell</em>' attribute.
	 * @see #setSell(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Sell()
	 * @model
	 * @generated
	 */
	float getSell();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getSell <em>Sell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sell</em>' attribute.
	 * @see #getSell()
	 * @generated
	 */
	void setSell(float value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' attribute.
	 * @see #setLast(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Last()
	 * @model
	 * @generated
	 */
	float getLast();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getLast <em>Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' attribute.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(float value);

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
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(BtcCurrency value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.OrderInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' reference list.
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_History()
	 * @model
	 * @generated
	 */
	EList<OrderInfo> getHistory();

	/**
	 * Returns the value of the '<em><b>Wallets</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.Wallet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wallets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wallets</em>' reference list.
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Wallets()
	 * @model
	 * @generated
	 */
	EList<Wallet> getWallets();

	/**
	 * Returns the value of the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' attribute.
	 * @see #setAverage(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_Average()
	 * @model
	 * @generated
	 */
	float getAverage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getAverage <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' attribute.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(float value);

	/**
	 * Returns the value of the '<em><b>Last Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Local</em>' attribute.
	 * @see #setLastLocal(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_LastLocal()
	 * @model
	 * @generated
	 */
	float getLastLocal();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getLastLocal <em>Last Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Local</em>' attribute.
	 * @see #getLastLocal()
	 * @generated
	 */
	void setLastLocal(float value);

	/**
	 * Returns the value of the '<em><b>Last Orig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Orig</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Orig</em>' attribute.
	 * @see #setLastOrig(float)
	 * @see net.sf.smbt.btc.BtcPackage#getBitcoinMarket_LastOrig()
	 * @model
	 * @generated
	 */
	float getLastOrig();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.BitcoinMarket#getLastOrig <em>Last Orig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Orig</em>' attribute.
	 * @see #getLastOrig()
	 * @generated
	 */
	void setLastOrig(float value);

} // BitcoinMarket
