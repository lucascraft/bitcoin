/**
 */
package net.sf.smbt.btc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.BtcFactory
 * @model kind="package"
 * @generated
 */
public interface BtcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "btc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://btc/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "btc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtcPackage eINSTANCE = net.sf.smbt.btc.impl.BtcPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.impl.BitcoinMarketImpl <em>Bitcoin Market</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.impl.BitcoinMarketImpl
	 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getBitcoinMarket()
	 * @generated
	 */
	int BITCOIN_MARKET = 0;

	/**
	 * The feature id for the '<em><b>Exchange Rates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__EXCHANGE_RATES = 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__ORDERS = 1;

	/**
	 * The feature id for the '<em><b>Broker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__BROKER = 2;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__HIGH = 3;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__LOW = 4;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__VOLUME = 5;

	/**
	 * The feature id for the '<em><b>Buy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__BUY = 6;

	/**
	 * The feature id for the '<em><b>Sell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__SELL = 7;

	/**
	 * The feature id for the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__LAST = 8;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__CURRENCY = 9;

	/**
	 * The feature id for the '<em><b>History</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__HISTORY = 10;

	/**
	 * The feature id for the '<em><b>Wallets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__WALLETS = 11;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__AVERAGE = 12;

	/**
	 * The feature id for the '<em><b>Last Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__LAST_LOCAL = 13;

	/**
	 * The feature id for the '<em><b>Last Orig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET__LAST_ORIG = 14;

	/**
	 * The number of structural features of the '<em>Bitcoin Market</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_MARKET_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.impl.ExchangeRateImpl <em>Exchange Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.impl.ExchangeRateImpl
	 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getExchangeRate()
	 * @generated
	 */
	int EXCHANGE_RATE = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_RATE__FROM = 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_RATE__RATE = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_RATE__TO = 2;

	/**
	 * The number of structural features of the '<em>Exchange Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_RATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.impl.OrderImpl
	 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__VOLUME = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__KIND = 2;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.impl.OrderInfoImpl <em>Order Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.impl.OrderInfoImpl
	 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getOrderInfo()
	 * @generated
	 */
	int ORDER_INFO = 3;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INFO__HIGH = 0;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INFO__LOW = 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INFO__VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INFO__PRICE = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INFO__DATE = 4;

	/**
	 * The number of structural features of the '<em>Order Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INFO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.impl.WalletImpl <em>Wallet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.impl.WalletImpl
	 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getWallet()
	 * @generated
	 */
	int WALLET = 4;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__BALANCE = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__CURRENCY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__KEY = 2;

	/**
	 * The number of structural features of the '<em>Wallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.impl.BitCoinNodeImpl <em>Bit Coin Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.impl.BitCoinNodeImpl
	 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getBitCoinNode()
	 * @generated
	 */
	int BIT_COIN_NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_COIN_NODE__ID = 0;

	/**
	 * The number of structural features of the '<em>Bit Coin Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_COIN_NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.BtcCurrency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getBtcCurrency()
	 * @generated
	 */
	int BTC_CURRENCY = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.OrderKind <em>Order Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.OrderKind
	 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getOrderKind()
	 * @generated
	 */
	int ORDER_KIND = 7;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.BitcoinMarket <em>Bitcoin Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitcoin Market</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket
	 * @generated
	 */
	EClass getBitcoinMarket();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.BitcoinMarket#getExchangeRates <em>Exchange Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Rates</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getExchangeRates()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EReference getBitcoinMarket_ExchangeRates();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.BitcoinMarket#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getOrders()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EReference getBitcoinMarket_Orders();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getBroker <em>Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Broker</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getBroker()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_Broker();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getHigh()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_High();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getLow()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_Low();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getVolume()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getBuy <em>Buy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buy</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getBuy()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_Buy();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getSell <em>Sell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sell</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getSell()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_Sell();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getLast()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_Last();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getCurrency()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_Currency();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.BitcoinMarket#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>History</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getHistory()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EReference getBitcoinMarket_History();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.BitcoinMarket#getWallets <em>Wallets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wallets</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getWallets()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EReference getBitcoinMarket_Wallets();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getAverage()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_Average();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getLastLocal <em>Last Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Local</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getLastLocal()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_LastLocal();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitcoinMarket#getLastOrig <em>Last Orig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Orig</em>'.
	 * @see net.sf.smbt.btc.BitcoinMarket#getLastOrig()
	 * @see #getBitcoinMarket()
	 * @generated
	 */
	EAttribute getBitcoinMarket_LastOrig();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.ExchangeRate <em>Exchange Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Rate</em>'.
	 * @see net.sf.smbt.btc.ExchangeRate
	 * @generated
	 */
	EClass getExchangeRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.ExchangeRate#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see net.sf.smbt.btc.ExchangeRate#getFrom()
	 * @see #getExchangeRate()
	 * @generated
	 */
	EAttribute getExchangeRate_From();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.ExchangeRate#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see net.sf.smbt.btc.ExchangeRate#getRate()
	 * @see #getExchangeRate()
	 * @generated
	 */
	EAttribute getExchangeRate_Rate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.ExchangeRate#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see net.sf.smbt.btc.ExchangeRate#getTo()
	 * @see #getExchangeRate()
	 * @generated
	 */
	EAttribute getExchangeRate_To();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see net.sf.smbt.btc.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.Order#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see net.sf.smbt.btc.Order#getPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Price();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.Order#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.btc.Order#getVolume()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.Order#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.btc.Order#getKind()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.OrderInfo <em>Order Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Info</em>'.
	 * @see net.sf.smbt.btc.OrderInfo
	 * @generated
	 */
	EClass getOrderInfo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.OrderInfo#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see net.sf.smbt.btc.OrderInfo#getHigh()
	 * @see #getOrderInfo()
	 * @generated
	 */
	EAttribute getOrderInfo_High();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.OrderInfo#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see net.sf.smbt.btc.OrderInfo#getLow()
	 * @see #getOrderInfo()
	 * @generated
	 */
	EAttribute getOrderInfo_Low();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.OrderInfo#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.btc.OrderInfo#getVolume()
	 * @see #getOrderInfo()
	 * @generated
	 */
	EAttribute getOrderInfo_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.OrderInfo#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see net.sf.smbt.btc.OrderInfo#getPrice()
	 * @see #getOrderInfo()
	 * @generated
	 */
	EAttribute getOrderInfo_Price();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.OrderInfo#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.btc.OrderInfo#getDate()
	 * @see #getOrderInfo()
	 * @generated
	 */
	EAttribute getOrderInfo_Date();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wallet</em>'.
	 * @see net.sf.smbt.btc.Wallet
	 * @generated
	 */
	EClass getWallet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.Wallet#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see net.sf.smbt.btc.Wallet#getBalance()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_Balance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.Wallet#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.Wallet#getCurrency()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_Currency();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.Wallet#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.sf.smbt.btc.Wallet#getKey()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_Key();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.BitCoinNode <em>Bit Coin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Coin Node</em>'.
	 * @see net.sf.smbt.btc.BitCoinNode
	 * @generated
	 */
	EClass getBitCoinNode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.BitCoinNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.btc.BitCoinNode#getId()
	 * @see #getBitCoinNode()
	 * @generated
	 */
	EAttribute getBitCoinNode_Id();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.btc.BtcCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @generated
	 */
	EEnum getBtcCurrency();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.btc.OrderKind <em>Order Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Kind</em>'.
	 * @see net.sf.smbt.btc.OrderKind
	 * @generated
	 */
	EEnum getOrderKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BtcFactory getBtcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.impl.BitcoinMarketImpl <em>Bitcoin Market</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.impl.BitcoinMarketImpl
		 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getBitcoinMarket()
		 * @generated
		 */
		EClass BITCOIN_MARKET = eINSTANCE.getBitcoinMarket();

		/**
		 * The meta object literal for the '<em><b>Exchange Rates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITCOIN_MARKET__EXCHANGE_RATES = eINSTANCE.getBitcoinMarket_ExchangeRates();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITCOIN_MARKET__ORDERS = eINSTANCE.getBitcoinMarket_Orders();

		/**
		 * The meta object literal for the '<em><b>Broker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__BROKER = eINSTANCE.getBitcoinMarket_Broker();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__HIGH = eINSTANCE.getBitcoinMarket_High();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__LOW = eINSTANCE.getBitcoinMarket_Low();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__VOLUME = eINSTANCE.getBitcoinMarket_Volume();

		/**
		 * The meta object literal for the '<em><b>Buy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__BUY = eINSTANCE.getBitcoinMarket_Buy();

		/**
		 * The meta object literal for the '<em><b>Sell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__SELL = eINSTANCE.getBitcoinMarket_Sell();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__LAST = eINSTANCE.getBitcoinMarket_Last();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__CURRENCY = eINSTANCE.getBitcoinMarket_Currency();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITCOIN_MARKET__HISTORY = eINSTANCE.getBitcoinMarket_History();

		/**
		 * The meta object literal for the '<em><b>Wallets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITCOIN_MARKET__WALLETS = eINSTANCE.getBitcoinMarket_Wallets();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__AVERAGE = eINSTANCE.getBitcoinMarket_Average();

		/**
		 * The meta object literal for the '<em><b>Last Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__LAST_LOCAL = eINSTANCE.getBitcoinMarket_LastLocal();

		/**
		 * The meta object literal for the '<em><b>Last Orig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_MARKET__LAST_ORIG = eINSTANCE.getBitcoinMarket_LastOrig();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.impl.ExchangeRateImpl <em>Exchange Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.impl.ExchangeRateImpl
		 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getExchangeRate()
		 * @generated
		 */
		EClass EXCHANGE_RATE = eINSTANCE.getExchangeRate();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_RATE__FROM = eINSTANCE.getExchangeRate_From();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_RATE__RATE = eINSTANCE.getExchangeRate_Rate();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_RATE__TO = eINSTANCE.getExchangeRate_To();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.impl.OrderImpl
		 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRICE = eINSTANCE.getOrder_Price();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__VOLUME = eINSTANCE.getOrder_Volume();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__KIND = eINSTANCE.getOrder_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.impl.OrderInfoImpl <em>Order Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.impl.OrderInfoImpl
		 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getOrderInfo()
		 * @generated
		 */
		EClass ORDER_INFO = eINSTANCE.getOrderInfo();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_INFO__HIGH = eINSTANCE.getOrderInfo_High();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_INFO__LOW = eINSTANCE.getOrderInfo_Low();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_INFO__VOLUME = eINSTANCE.getOrderInfo_Volume();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_INFO__PRICE = eINSTANCE.getOrderInfo_Price();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_INFO__DATE = eINSTANCE.getOrderInfo_Date();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.impl.WalletImpl <em>Wallet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.impl.WalletImpl
		 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getWallet()
		 * @generated
		 */
		EClass WALLET = eINSTANCE.getWallet();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__BALANCE = eINSTANCE.getWallet_Balance();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__CURRENCY = eINSTANCE.getWallet_Currency();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__KEY = eINSTANCE.getWallet_Key();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.impl.BitCoinNodeImpl <em>Bit Coin Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.impl.BitCoinNodeImpl
		 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getBitCoinNode()
		 * @generated
		 */
		EClass BIT_COIN_NODE = eINSTANCE.getBitCoinNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT_COIN_NODE__ID = eINSTANCE.getBitCoinNode_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.BtcCurrency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.BtcCurrency
		 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getBtcCurrency()
		 * @generated
		 */
		EEnum BTC_CURRENCY = eINSTANCE.getBtcCurrency();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.OrderKind <em>Order Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.OrderKind
		 * @see net.sf.smbt.btc.impl.BtcPackageImpl#getOrderKind()
		 * @generated
		 */
		EEnum ORDER_KIND = eINSTANCE.getOrderKind();

	}

} //BtcPackage
