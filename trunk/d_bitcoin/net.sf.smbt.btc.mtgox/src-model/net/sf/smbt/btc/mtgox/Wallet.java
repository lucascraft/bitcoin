/**
 */
package net.sf.smbt.btc.mtgox;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wallet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getBitcoinAddr <em>Bitcoin Addr</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getRecords <em>Records</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getOrders <em>Orders</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getBalance <em>Balance</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getLogin <em>Login</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getCreated <em>Created</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getLastLogin <em>Last Login</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getIndex <em>Index</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getTradeFee <em>Trade Fee</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getMonthlyVolume <em>Monthly Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getRights <em>Rights</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getBtcInfo <em>Btc Info</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getEurInfo <em>Eur Info</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Wallet#getUsdInfo <em>Usd Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet()
 * @model
 * @generated
 */
public interface Wallet extends EObject {
	/**
	 * Returns the value of the '<em><b>Bitcoin Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bitcoin Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bitcoin Addr</em>' attribute.
	 * @see #setBitcoinAddr(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_BitcoinAddr()
	 * @model
	 * @generated
	 */
	String getBitcoinAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getBitcoinAddr <em>Bitcoin Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bitcoin Addr</em>' attribute.
	 * @see #getBitcoinAddr()
	 * @generated
	 */
	void setBitcoinAddr(String value);

	/**
	 * Returns the value of the '<em><b>Records</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.WalletRecord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' reference list.
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_Records()
	 * @model
	 * @generated
	 */
	EList<WalletRecord> getRecords();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' reference list.
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_Orders()
	 * @model
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' reference.
	 * @see #setBalance(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_Balance()
	 * @model
	 * @generated
	 */
	CompactValue getBalance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getBalance <em>Balance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' reference.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(CompactValue value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_Login()
	 * @model
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_Created()
	 * @model
	 * @generated
	 */
	String getCreated();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(String value);

	/**
	 * Returns the value of the '<em><b>Last Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Login</em>' attribute.
	 * @see #setLastLogin(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_LastLogin()
	 * @model
	 * @generated
	 */
	String getLastLogin();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getLastLogin <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Login</em>' attribute.
	 * @see #getLastLogin()
	 * @generated
	 */
	void setLastLogin(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Trade Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trade Fee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trade Fee</em>' attribute.
	 * @see #setTradeFee(float)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_TradeFee()
	 * @model
	 * @generated
	 */
	float getTradeFee();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getTradeFee <em>Trade Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Fee</em>' attribute.
	 * @see #getTradeFee()
	 * @generated
	 */
	void setTradeFee(float value);

	/**
	 * Returns the value of the '<em><b>Monthly Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monthly Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monthly Volume</em>' attribute.
	 * @see #setMonthlyVolume(int)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_MonthlyVolume()
	 * @model
	 * @generated
	 */
	int getMonthlyVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getMonthlyVolume <em>Monthly Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monthly Volume</em>' attribute.
	 * @see #getMonthlyVolume()
	 * @generated
	 */
	void setMonthlyVolume(int value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' attribute list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.WalletRight}.
	 * The literals are from the enumeration {@link net.sf.smbt.btc.mtgox.WalletRight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' attribute list.
	 * @see net.sf.smbt.btc.mtgox.WalletRight
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_Rights()
	 * @model
	 * @generated
	 */
	EList<WalletRight> getRights();

	/**
	 * Returns the value of the '<em><b>Btc Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btc Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btc Info</em>' reference.
	 * @see #setBtcInfo(CurrencyWalletData)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_BtcInfo()
	 * @model
	 * @generated
	 */
	CurrencyWalletData getBtcInfo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getBtcInfo <em>Btc Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btc Info</em>' reference.
	 * @see #getBtcInfo()
	 * @generated
	 */
	void setBtcInfo(CurrencyWalletData value);

	/**
	 * Returns the value of the '<em><b>Eur Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eur Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eur Info</em>' reference.
	 * @see #setEurInfo(CurrencyWalletData)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_EurInfo()
	 * @model
	 * @generated
	 */
	CurrencyWalletData getEurInfo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getEurInfo <em>Eur Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eur Info</em>' reference.
	 * @see #getEurInfo()
	 * @generated
	 */
	void setEurInfo(CurrencyWalletData value);

	/**
	 * Returns the value of the '<em><b>Usd Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usd Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usd Info</em>' reference.
	 * @see #setUsdInfo(CurrencyWalletData)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWallet_UsdInfo()
	 * @model
	 * @generated
	 */
	CurrencyWalletData getUsdInfo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Wallet#getUsdInfo <em>Usd Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usd Info</em>' reference.
	 * @see #getUsdInfo()
	 * @generated
	 */
	void setUsdInfo(CurrencyWalletData value);

} // Wallet
