/**
 */
package net.sf.smbt.btc.mtgox;

import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.BtcCurrency;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Gox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getLogin <em>Login</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getPassword <em>Password</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getMarket <em>Market</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getFeeRate <em>Fee Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getHighV <em>High V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getLowV <em>Low V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getSellV <em>Sell V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getBuyV <em>Buy V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getLastV <em>Last V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getVolumeV <em>Volume V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getTrend <em>Trend</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getFetchs <em>Fetchs</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getWallet <em>Wallet</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getSales <em>Sales</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#isSocketioConnected <em>Socketio Connected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getBids <em>Bids</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.MTGox#getAsks <em>Asks</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox()
 * @model
 * @generated
 */
public interface MTGox extends EObject {
	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Login()
	 * @model
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_ApiKey()
	 * @model
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Market</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market</em>' containment reference.
	 * @see #setMarket(BitcoinMarket)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Market()
	 * @model containment="true"
	 * @generated
	 */
	BitcoinMarket getMarket();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getMarket <em>Market</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market</em>' containment reference.
	 * @see #getMarket()
	 * @generated
	 */
	void setMarket(BitcoinMarket value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(BtcCurrency value);

	/**
	 * Returns the value of the '<em><b>Fee Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fee Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fee Rate</em>' attribute.
	 * @see #setFeeRate(float)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_FeeRate()
	 * @model
	 * @generated
	 */
	float getFeeRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getFeeRate <em>Fee Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fee Rate</em>' attribute.
	 * @see #getFeeRate()
	 * @generated
	 */
	void setFeeRate(float value);

	/**
	 * Returns the value of the '<em><b>High V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High V</em>' containment reference.
	 * @see #setHighV(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_HighV()
	 * @model containment="true"
	 * @generated
	 */
	CompactValue getHighV();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getHighV <em>High V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High V</em>' containment reference.
	 * @see #getHighV()
	 * @generated
	 */
	void setHighV(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Low V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low V</em>' containment reference.
	 * @see #setLowV(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_LowV()
	 * @model containment="true"
	 * @generated
	 */
	CompactValue getLowV();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getLowV <em>Low V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low V</em>' containment reference.
	 * @see #getLowV()
	 * @generated
	 */
	void setLowV(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Sell V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sell V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sell V</em>' containment reference.
	 * @see #setSellV(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_SellV()
	 * @model containment="true"
	 * @generated
	 */
	CompactValue getSellV();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getSellV <em>Sell V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sell V</em>' containment reference.
	 * @see #getSellV()
	 * @generated
	 */
	void setSellV(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Buy V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buy V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buy V</em>' containment reference.
	 * @see #setBuyV(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_BuyV()
	 * @model containment="true"
	 * @generated
	 */
	CompactValue getBuyV();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getBuyV <em>Buy V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buy V</em>' containment reference.
	 * @see #getBuyV()
	 * @generated
	 */
	void setBuyV(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Last V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last V</em>' containment reference.
	 * @see #setLastV(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_LastV()
	 * @model containment="true"
	 * @generated
	 */
	CompactValue getLastV();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getLastV <em>Last V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last V</em>' containment reference.
	 * @see #getLastV()
	 * @generated
	 */
	void setLastV(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Volume V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume V</em>' containment reference.
	 * @see #setVolumeV(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_VolumeV()
	 * @model containment="true"
	 * @generated
	 */
	CompactValue getVolumeV();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getVolumeV <em>Volume V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume V</em>' containment reference.
	 * @see #getVolumeV()
	 * @generated
	 */
	void setVolumeV(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Trend</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.Fundamentals}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trend</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trend</em>' reference list.
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Trend()
	 * @model
	 * @generated
	 */
	EList<Fundamentals> getTrend();

	/**
	 * Returns the value of the '<em><b>Fetchs</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.FetchValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetchs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetchs</em>' containment reference list.
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Fetchs()
	 * @model containment="true"
	 * @generated
	 */
	EList<FetchValue> getFetchs();

	/**
	 * Returns the value of the '<em><b>Wallet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wallet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wallet</em>' reference.
	 * @see #setWallet(Wallet)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Wallet()
	 * @model
	 * @generated
	 */
	Wallet getWallet();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#getWallet <em>Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wallet</em>' reference.
	 * @see #getWallet()
	 * @generated
	 */
	void setWallet(Wallet value);

	/**
	 * Returns the value of the '<em><b>Sales</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.DepthValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' reference list.
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Sales()
	 * @model
	 * @generated
	 */
	EList<DepthValue> getSales();

	/**
	 * Returns the value of the '<em><b>Socketio Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Socketio Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socketio Connected</em>' attribute.
	 * @see #setSocketioConnected(boolean)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_SocketioConnected()
	 * @model
	 * @generated
	 */
	boolean isSocketioConnected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.MTGox#isSocketioConnected <em>Socketio Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socketio Connected</em>' attribute.
	 * @see #isSocketioConnected()
	 * @generated
	 */
	void setSocketioConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Bids</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.DepthValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bids</em>' reference list.
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Bids()
	 * @model
	 * @generated
	 */
	EList<DepthValue> getBids();

	/**
	 * Returns the value of the '<em><b>Asks</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.DepthValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asks</em>' reference list.
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getMTGox_Asks()
	 * @model
	 * @generated
	 */
	EList<DepthValue> getAsks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DepthValue> getDepths();

} // MTGox
