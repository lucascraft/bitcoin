/**
 */
package net.sf.smbt.btc.mtgox;

import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

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
 * @see net.sf.smbt.btc.mtgox.MtgoxFactory
 * @model kind="package"
 * @generated
 */
public interface MtgoxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mtgox";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mtgox/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mtgox";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MtgoxPackage eINSTANCE = net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl <em>MT Gox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.MTGoxImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getMTGox()
	 * @generated
	 */
	int MT_GOX = 0;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__LOGIN = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__API_KEY = 2;

	/**
	 * The feature id for the '<em><b>Market</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__MARKET = 3;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__CURRENCY = 4;

	/**
	 * The feature id for the '<em><b>Fee Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__FEE_RATE = 5;

	/**
	 * The feature id for the '<em><b>High V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__HIGH_V = 6;

	/**
	 * The feature id for the '<em><b>Low V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__LOW_V = 7;

	/**
	 * The feature id for the '<em><b>Sell V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__SELL_V = 8;

	/**
	 * The feature id for the '<em><b>Buy V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__BUY_V = 9;

	/**
	 * The feature id for the '<em><b>Last V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__LAST_V = 10;

	/**
	 * The feature id for the '<em><b>Volume V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__VOLUME_V = 11;

	/**
	 * The feature id for the '<em><b>Trend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__TREND = 12;

	/**
	 * The feature id for the '<em><b>Fetchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__FETCHS = 13;

	/**
	 * The feature id for the '<em><b>Wallet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__WALLET = 14;

	/**
	 * The feature id for the '<em><b>Sales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__SALES = 15;

	/**
	 * The feature id for the '<em><b>Socketio Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__SOCKETIO_CONNECTED = 16;

	/**
	 * The feature id for the '<em><b>Bids</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__BIDS = 17;

	/**
	 * The feature id for the '<em><b>Asks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX__ASKS = 18;

	/**
	 * The number of structural features of the '<em>MT Gox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.MTGoxCmdImpl <em>MT Gox Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.MTGoxCmdImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getMTGoxCmd()
	 * @generated
	 */
	int MT_GOX_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD__PRIORITY = HttpcmdPackage.HTTP_COMM_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD__STAMP = HttpcmdPackage.HTTP_COMM_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD__PROPERTIES = HttpcmdPackage.HTTP_COMM_CMD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD__METHOD = HttpcmdPackage.HTTP_COMM_CMD__METHOD;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD__COMMAND = HttpcmdPackage.HTTP_COMM_CMD__COMMAND;

	/**
	 * The feature id for the '<em><b>Json Snd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD__JSON_SND = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Json Rcv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD__JSON_RCV = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD__QUERY = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MT Gox Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MT_GOX_CMD_FEATURE_COUNT = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.CompactValueImpl <em>Compact Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.CompactValueImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getCompactValue()
	 * @generated
	 */
	int COMPACT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_VALUE__VALUE_INT = 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_VALUE__DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Display short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_VALUE__DISPLAY_SHORT = 3;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_VALUE__CURRENCY = 4;

	/**
	 * The number of structural features of the '<em>Compact Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_VALUE_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.FundamentalsImpl <em>Fundamentals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.FundamentalsImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getFundamentals()
	 * @generated
	 */
	int FUNDAMENTALS = 3;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTALS__HIGH = 0;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTALS__LOW = 1;

	/**
	 * The feature id for the '<em><b>Buy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTALS__BUY = 2;

	/**
	 * The feature id for the '<em><b>Sell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTALS__SELL = 3;

	/**
	 * The feature id for the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTALS__LAST = 4;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTALS__AVERAGE = 5;

	/**
	 * The number of structural features of the '<em>Fundamentals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNDAMENTALS_FEATURE_COUNT = 6;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl <em>Fetch Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.FetchValueImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getFetchValue()
	 * @generated
	 */
	int FETCH_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__STAMP = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Price Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__PRICE_INT = 3;

	/**
	 * The feature id for the '<em><b>Amount Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__AMOUNT_INT = 4;

	/**
	 * The feature id for the '<em><b>Tid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__TID = 5;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__CURRENCY = 6;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__ITEM = 7;

	/**
	 * The feature id for the '<em><b>Trade Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__TRADE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__PRIMARY = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE__PROPERTIES = 10;

	/**
	 * The number of structural features of the '<em>Fetch Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FETCH_VALUE_FEATURE_COUNT = 11;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl <em>Depth Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.DepthValueImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getDepthValue()
	 * @generated
	 */
	int DEPTH_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Price Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__PRICE_INT = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Amount Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__AMOUNT_INT = 3;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__STAMP = 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__KIND = 5;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__SUM = 6;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__CURRENCY = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__STATUS = 8;

	/**
	 * The feature id for the '<em><b>Last Local Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__LAST_LOCAL_STATUS = 9;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__VOLUME = 10;

	/**
	 * The feature id for the '<em><b>Volume Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE__VOLUME_INT = 11;

	/**
	 * The number of structural features of the '<em>Depth Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_VALUE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.WalletImpl <em>Wallet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.WalletImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getWallet()
	 * @generated
	 */
	int WALLET = 6;

	/**
	 * The feature id for the '<em><b>Bitcoin Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__BITCOIN_ADDR = 0;

	/**
	 * The feature id for the '<em><b>Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__RECORDS = 1;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__ORDERS = 2;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__BALANCE = 3;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__LOGIN = 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__CREATED = 5;

	/**
	 * The feature id for the '<em><b>Last Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__LAST_LOGIN = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__ID = 7;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__INDEX = 8;

	/**
	 * The feature id for the '<em><b>Trade Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__TRADE_FEE = 9;

	/**
	 * The feature id for the '<em><b>Monthly Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__MONTHLY_VOLUME = 10;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__RIGHTS = 11;

	/**
	 * The feature id for the '<em><b>Btc Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__BTC_INFO = 12;

	/**
	 * The feature id for the '<em><b>Eur Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__EUR_INFO = 13;

	/**
	 * The feature id for the '<em><b>Usd Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET__USD_INFO = 14;

	/**
	 * The number of structural features of the '<em>Wallet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl <em>Wallet Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.WalletRecordImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getWalletRecord()
	 * @generated
	 */
	int WALLET_RECORD = 7;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_RECORD__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_RECORD__DATE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_RECORD__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_RECORD__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_RECORD__BALANCE = 4;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_RECORD__INFO = 5;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_RECORD__LINKS = 6;

	/**
	 * The number of structural features of the '<em>Wallet Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALLET_RECORD_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.LinkImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ADDR = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.OrderImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 9;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__OID = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CURRENCY = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ITEM = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__AMOUNT = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRICE = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DATE = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRIORITY = 8;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl <em>Currency Wallet Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getCurrencyWalletData()
	 * @generated
	 */
	int CURRENCY_WALLET_DATA = 10;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_WALLET_DATA__CURRENCY = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_WALLET_DATA__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Max Withdraw Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT = 2;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_WALLET_DATA__ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Monthly Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_WALLET_DATA__MONTHLY_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>Daily Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_WALLET_DATA__DAILY_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_WALLET_DATA__BALANCE = 6;

	/**
	 * The number of structural features of the '<em>Currency Wallet Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_WALLET_DATA_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl <em>Withdraw Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getWithdrawInfo()
	 * @generated
	 */
	int WITHDRAW_INFO = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_INFO__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_INFO__VALUE_INT = 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_INFO__DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Display short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_INFO__DISPLAY_SHORT = 3;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_INFO__CURRENCY = 4;

	/**
	 * The number of structural features of the '<em>Withdraw Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_INFO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.FetchKind <em>Fetch Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.FetchKind
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getFetchKind()
	 * @generated
	 */
	int FETCH_KIND = 12;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.WalletRight <em>Wallet Right</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.WalletRight
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getWalletRight()
	 * @generated
	 */
	int WALLET_RIGHT = 13;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.mtgox.DepthStatus <em>Depth Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.mtgox.DepthStatus
	 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getDepthStatus()
	 * @generated
	 */
	int DEPTH_STATUS = 14;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.MTGox <em>MT Gox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Gox</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox
	 * @generated
	 */
	EClass getMTGox();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGox#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getLogin()
	 * @see #getMTGox()
	 * @generated
	 */
	EAttribute getMTGox_Login();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGox#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getPassword()
	 * @see #getMTGox()
	 * @generated
	 */
	EAttribute getMTGox_Password();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGox#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getApiKey()
	 * @see #getMTGox()
	 * @generated
	 */
	EAttribute getMTGox_ApiKey();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.mtgox.MTGox#getMarket <em>Market</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Market</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getMarket()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_Market();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGox#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getCurrency()
	 * @see #getMTGox()
	 * @generated
	 */
	EAttribute getMTGox_Currency();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGox#getFeeRate <em>Fee Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fee Rate</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getFeeRate()
	 * @see #getMTGox()
	 * @generated
	 */
	EAttribute getMTGox_FeeRate();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.mtgox.MTGox#getHighV <em>High V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High V</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getHighV()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_HighV();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.mtgox.MTGox#getLowV <em>Low V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low V</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getLowV()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_LowV();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.mtgox.MTGox#getSellV <em>Sell V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sell V</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getSellV()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_SellV();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.mtgox.MTGox#getBuyV <em>Buy V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buy V</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getBuyV()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_BuyV();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.mtgox.MTGox#getLastV <em>Last V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last V</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getLastV()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_LastV();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.btc.mtgox.MTGox#getVolumeV <em>Volume V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Volume V</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getVolumeV()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_VolumeV();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.mtgox.MTGox#getTrend <em>Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trend</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getTrend()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_Trend();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.btc.mtgox.MTGox#getFetchs <em>Fetchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fetchs</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getFetchs()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_Fetchs();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.MTGox#getWallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wallet</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getWallet()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_Wallet();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.mtgox.MTGox#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getSales()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_Sales();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGox#isSocketioConnected <em>Socketio Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socketio Connected</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#isSocketioConnected()
	 * @see #getMTGox()
	 * @generated
	 */
	EAttribute getMTGox_SocketioConnected();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.mtgox.MTGox#getBids <em>Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bids</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getBids()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_Bids();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.mtgox.MTGox#getAsks <em>Asks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asks</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGox#getAsks()
	 * @see #getMTGox()
	 * @generated
	 */
	EReference getMTGox_Asks();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.MTGoxCmd <em>MT Gox Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MT Gox Cmd</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGoxCmd
	 * @generated
	 */
	EClass getMTGoxCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGoxCmd#getJsonSnd <em>Json Snd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Snd</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGoxCmd#getJsonSnd()
	 * @see #getMTGoxCmd()
	 * @generated
	 */
	EAttribute getMTGoxCmd_JsonSnd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGoxCmd#getJsonRcv <em>Json Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Rcv</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGoxCmd#getJsonRcv()
	 * @see #getMTGoxCmd()
	 * @generated
	 */
	EAttribute getMTGoxCmd_JsonRcv();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.MTGoxCmd#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see net.sf.smbt.btc.mtgox.MTGoxCmd#getQuery()
	 * @see #getMTGoxCmd()
	 * @generated
	 */
	EAttribute getMTGoxCmd_Query();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.CompactValue <em>Compact Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compact Value</em>'.
	 * @see net.sf.smbt.btc.mtgox.CompactValue
	 * @generated
	 */
	EClass getCompactValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.CompactValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.btc.mtgox.CompactValue#getValue()
	 * @see #getCompactValue()
	 * @generated
	 */
	EAttribute getCompactValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.CompactValue#getValue_int <em>Value int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value int</em>'.
	 * @see net.sf.smbt.btc.mtgox.CompactValue#getValue_int()
	 * @see #getCompactValue()
	 * @generated
	 */
	EAttribute getCompactValue_Value_int();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.CompactValue#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see net.sf.smbt.btc.mtgox.CompactValue#getDisplay()
	 * @see #getCompactValue()
	 * @generated
	 */
	EAttribute getCompactValue_Display();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.CompactValue#getDisplay_short <em>Display short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display short</em>'.
	 * @see net.sf.smbt.btc.mtgox.CompactValue#getDisplay_short()
	 * @see #getCompactValue()
	 * @generated
	 */
	EAttribute getCompactValue_Display_short();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.CompactValue#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.mtgox.CompactValue#getCurrency()
	 * @see #getCompactValue()
	 * @generated
	 */
	EAttribute getCompactValue_Currency();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.Fundamentals <em>Fundamentals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fundamentals</em>'.
	 * @see net.sf.smbt.btc.mtgox.Fundamentals
	 * @generated
	 */
	EClass getFundamentals();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Fundamentals#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see net.sf.smbt.btc.mtgox.Fundamentals#getHigh()
	 * @see #getFundamentals()
	 * @generated
	 */
	EAttribute getFundamentals_High();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Fundamentals#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see net.sf.smbt.btc.mtgox.Fundamentals#getLow()
	 * @see #getFundamentals()
	 * @generated
	 */
	EAttribute getFundamentals_Low();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Fundamentals#getBuy <em>Buy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buy</em>'.
	 * @see net.sf.smbt.btc.mtgox.Fundamentals#getBuy()
	 * @see #getFundamentals()
	 * @generated
	 */
	EAttribute getFundamentals_Buy();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Fundamentals#getSell <em>Sell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sell</em>'.
	 * @see net.sf.smbt.btc.mtgox.Fundamentals#getSell()
	 * @see #getFundamentals()
	 * @generated
	 */
	EAttribute getFundamentals_Sell();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Fundamentals#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last</em>'.
	 * @see net.sf.smbt.btc.mtgox.Fundamentals#getLast()
	 * @see #getFundamentals()
	 * @generated
	 */
	EAttribute getFundamentals_Last();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Fundamentals#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see net.sf.smbt.btc.mtgox.Fundamentals#getAverage()
	 * @see #getFundamentals()
	 * @generated
	 */
	EAttribute getFundamentals_Average();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.FetchValue <em>Fetch Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fetch Value</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue
	 * @generated
	 */
	EClass getFetchValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getStamp <em>Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stamp</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getStamp()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_Stamp();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getPrice()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_Price();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getAmount()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_Amount();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getPriceInt <em>Price Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Int</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getPriceInt()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_PriceInt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getAmountInt <em>Amount Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Int</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getAmountInt()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_AmountInt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getTid <em>Tid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tid</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getTid()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_Tid();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getCurrency()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_Currency();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getItem()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_Item();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getTradeType <em>Trade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Type</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getTradeType()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_TradeType();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getPrimary()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_Primary();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.FetchValue#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchValue#getProperties()
	 * @see #getFetchValue()
	 * @generated
	 */
	EAttribute getFetchValue_Properties();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.DepthValue <em>Depth Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depth Value</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue
	 * @generated
	 */
	EClass getDepthValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getPrice()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_Price();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getPriceInt <em>Price Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Int</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getPriceInt()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_PriceInt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getAmount()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_Amount();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getAmountInt <em>Amount Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Int</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getAmountInt()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_AmountInt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getStamp <em>Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stamp</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getStamp()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_Stamp();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getKind()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getSum()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_Sum();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getCurrency()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_Currency();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getStatus()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getLastLocalStatus <em>Last Local Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Local Status</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getLastLocalStatus()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_LastLocalStatus();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getVolume()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.DepthValue#getVolumeInt <em>Volume Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Int</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthValue#getVolumeInt()
	 * @see #getDepthValue()
	 * @generated
	 */
	EAttribute getDepthValue_VolumeInt();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wallet</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet
	 * @generated
	 */
	EClass getWallet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Wallet#getBitcoinAddr <em>Bitcoin Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bitcoin Addr</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getBitcoinAddr()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_BitcoinAddr();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.mtgox.Wallet#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Records</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getRecords()
	 * @see #getWallet()
	 * @generated
	 */
	EReference getWallet_Records();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.mtgox.Wallet#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orders</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getOrders()
	 * @see #getWallet()
	 * @generated
	 */
	EReference getWallet_Orders();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.Wallet#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Balance</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getBalance()
	 * @see #getWallet()
	 * @generated
	 */
	EReference getWallet_Balance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Wallet#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getLogin()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_Login();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Wallet#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getCreated()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_Created();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Wallet#getLastLogin <em>Last Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Login</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getLastLogin()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_LastLogin();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Wallet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getId()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Wallet#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getIndex()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_Index();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Wallet#getTradeFee <em>Trade Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Fee</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getTradeFee()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_TradeFee();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Wallet#getMonthlyVolume <em>Monthly Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monthly Volume</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getMonthlyVolume()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_MonthlyVolume();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.btc.mtgox.Wallet#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rights</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getRights()
	 * @see #getWallet()
	 * @generated
	 */
	EAttribute getWallet_Rights();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.Wallet#getBtcInfo <em>Btc Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Btc Info</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getBtcInfo()
	 * @see #getWallet()
	 * @generated
	 */
	EReference getWallet_BtcInfo();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.Wallet#getEurInfo <em>Eur Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eur Info</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getEurInfo()
	 * @see #getWallet()
	 * @generated
	 */
	EReference getWallet_EurInfo();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.Wallet#getUsdInfo <em>Usd Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usd Info</em>'.
	 * @see net.sf.smbt.btc.mtgox.Wallet#getUsdInfo()
	 * @see #getWallet()
	 * @generated
	 */
	EReference getWallet_UsdInfo();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.WalletRecord <em>Wallet Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wallet Record</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord
	 * @generated
	 */
	EClass getWalletRecord();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WalletRecord#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord#getIndex()
	 * @see #getWalletRecord()
	 * @generated
	 */
	EAttribute getWalletRecord_Index();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WalletRecord#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord#getDate()
	 * @see #getWalletRecord()
	 * @generated
	 */
	EAttribute getWalletRecord_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WalletRecord#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord#getType()
	 * @see #getWalletRecord()
	 * @generated
	 */
	EAttribute getWalletRecord_Type();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.WalletRecord#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord#getValue()
	 * @see #getWalletRecord()
	 * @generated
	 */
	EReference getWalletRecord_Value();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.WalletRecord#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Balance</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord#getBalance()
	 * @see #getWalletRecord()
	 * @generated
	 */
	EReference getWalletRecord_Balance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WalletRecord#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord#getInfo()
	 * @see #getWalletRecord()
	 * @generated
	 */
	EAttribute getWalletRecord_Info();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.btc.mtgox.WalletRecord#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord#getLinks()
	 * @see #getWalletRecord()
	 * @generated
	 */
	EReference getWalletRecord_Links();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see net.sf.smbt.btc.mtgox.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Link#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.btc.mtgox.Link#getAddr()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Addr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Order#getOid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oid</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getOid()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Oid();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Order#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getCurrency()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Currency();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Order#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getItem()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Item();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Order#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getType()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Type();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.Order#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amount</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getAmount()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Amount();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.Order#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Price();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Order#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getStatus()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Order#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.Order#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see net.sf.smbt.btc.mtgox.Order#getPriority()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Priority();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData <em>Currency Wallet Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Wallet Data</em>'.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData
	 * @generated
	 */
	EClass getCurrencyWalletData();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData#getCurrency()
	 * @see #getCurrencyWalletData()
	 * @generated
	 */
	EAttribute getCurrencyWalletData_Currency();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Balance</em>'.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData#getBalance()
	 * @see #getCurrencyWalletData()
	 * @generated
	 */
	EReference getCurrencyWalletData_Balance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operations</em>'.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData#getOperations()
	 * @see #getCurrencyWalletData()
	 * @generated
	 */
	EAttribute getCurrencyWalletData_Operations();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getMaxWithdrawLimit <em>Max Withdraw Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Withdraw Limit</em>'.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData#getMaxWithdrawLimit()
	 * @see #getCurrencyWalletData()
	 * @generated
	 */
	EReference getCurrencyWalletData_MaxWithdrawLimit();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orders</em>'.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData#getOrders()
	 * @see #getCurrencyWalletData()
	 * @generated
	 */
	EReference getCurrencyWalletData_Orders();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getMonthlyLimit <em>Monthly Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monthly Limit</em>'.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData#getMonthlyLimit()
	 * @see #getCurrencyWalletData()
	 * @generated
	 */
	EReference getCurrencyWalletData_MonthlyLimit();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData#getDailyLimit <em>Daily Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Daily Limit</em>'.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData#getDailyLimit()
	 * @see #getCurrencyWalletData()
	 * @generated
	 */
	EReference getCurrencyWalletData_DailyLimit();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.mtgox.WithdrawInfo <em>Withdraw Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Withdraw Info</em>'.
	 * @see net.sf.smbt.btc.mtgox.WithdrawInfo
	 * @generated
	 */
	EClass getWithdrawInfo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WithdrawInfo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.btc.mtgox.WithdrawInfo#getValue()
	 * @see #getWithdrawInfo()
	 * @generated
	 */
	EAttribute getWithdrawInfo_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WithdrawInfo#getValue_int <em>Value int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value int</em>'.
	 * @see net.sf.smbt.btc.mtgox.WithdrawInfo#getValue_int()
	 * @see #getWithdrawInfo()
	 * @generated
	 */
	EAttribute getWithdrawInfo_Value_int();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WithdrawInfo#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see net.sf.smbt.btc.mtgox.WithdrawInfo#getDisplay()
	 * @see #getWithdrawInfo()
	 * @generated
	 */
	EAttribute getWithdrawInfo_Display();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WithdrawInfo#getDisplay_short <em>Display short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display short</em>'.
	 * @see net.sf.smbt.btc.mtgox.WithdrawInfo#getDisplay_short()
	 * @see #getWithdrawInfo()
	 * @generated
	 */
	EAttribute getWithdrawInfo_Display_short();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.mtgox.WithdrawInfo#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.btc.mtgox.WithdrawInfo#getCurrency()
	 * @see #getWithdrawInfo()
	 * @generated
	 */
	EAttribute getWithdrawInfo_Currency();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.btc.mtgox.FetchKind <em>Fetch Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Kind</em>'.
	 * @see net.sf.smbt.btc.mtgox.FetchKind
	 * @generated
	 */
	EEnum getFetchKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.btc.mtgox.WalletRight <em>Wallet Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wallet Right</em>'.
	 * @see net.sf.smbt.btc.mtgox.WalletRight
	 * @generated
	 */
	EEnum getWalletRight();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.btc.mtgox.DepthStatus <em>Depth Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Depth Status</em>'.
	 * @see net.sf.smbt.btc.mtgox.DepthStatus
	 * @generated
	 */
	EEnum getDepthStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MtgoxFactory getMtgoxFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl <em>MT Gox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.MTGoxImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getMTGox()
		 * @generated
		 */
		EClass MT_GOX = eINSTANCE.getMTGox();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX__LOGIN = eINSTANCE.getMTGox_Login();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX__PASSWORD = eINSTANCE.getMTGox_Password();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX__API_KEY = eINSTANCE.getMTGox_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Market</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__MARKET = eINSTANCE.getMTGox_Market();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX__CURRENCY = eINSTANCE.getMTGox_Currency();

		/**
		 * The meta object literal for the '<em><b>Fee Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX__FEE_RATE = eINSTANCE.getMTGox_FeeRate();

		/**
		 * The meta object literal for the '<em><b>High V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__HIGH_V = eINSTANCE.getMTGox_HighV();

		/**
		 * The meta object literal for the '<em><b>Low V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__LOW_V = eINSTANCE.getMTGox_LowV();

		/**
		 * The meta object literal for the '<em><b>Sell V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__SELL_V = eINSTANCE.getMTGox_SellV();

		/**
		 * The meta object literal for the '<em><b>Buy V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__BUY_V = eINSTANCE.getMTGox_BuyV();

		/**
		 * The meta object literal for the '<em><b>Last V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__LAST_V = eINSTANCE.getMTGox_LastV();

		/**
		 * The meta object literal for the '<em><b>Volume V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__VOLUME_V = eINSTANCE.getMTGox_VolumeV();

		/**
		 * The meta object literal for the '<em><b>Trend</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__TREND = eINSTANCE.getMTGox_Trend();

		/**
		 * The meta object literal for the '<em><b>Fetchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__FETCHS = eINSTANCE.getMTGox_Fetchs();

		/**
		 * The meta object literal for the '<em><b>Wallet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__WALLET = eINSTANCE.getMTGox_Wallet();

		/**
		 * The meta object literal for the '<em><b>Sales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__SALES = eINSTANCE.getMTGox_Sales();

		/**
		 * The meta object literal for the '<em><b>Socketio Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX__SOCKETIO_CONNECTED = eINSTANCE.getMTGox_SocketioConnected();

		/**
		 * The meta object literal for the '<em><b>Bids</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__BIDS = eINSTANCE.getMTGox_Bids();

		/**
		 * The meta object literal for the '<em><b>Asks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MT_GOX__ASKS = eINSTANCE.getMTGox_Asks();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.MTGoxCmdImpl <em>MT Gox Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.MTGoxCmdImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getMTGoxCmd()
		 * @generated
		 */
		EClass MT_GOX_CMD = eINSTANCE.getMTGoxCmd();

		/**
		 * The meta object literal for the '<em><b>Json Snd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX_CMD__JSON_SND = eINSTANCE.getMTGoxCmd_JsonSnd();

		/**
		 * The meta object literal for the '<em><b>Json Rcv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX_CMD__JSON_RCV = eINSTANCE.getMTGoxCmd_JsonRcv();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MT_GOX_CMD__QUERY = eINSTANCE.getMTGoxCmd_Query();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.CompactValueImpl <em>Compact Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.CompactValueImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getCompactValue()
		 * @generated
		 */
		EClass COMPACT_VALUE = eINSTANCE.getCompactValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPACT_VALUE__VALUE = eINSTANCE.getCompactValue_Value();

		/**
		 * The meta object literal for the '<em><b>Value int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPACT_VALUE__VALUE_INT = eINSTANCE.getCompactValue_Value_int();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPACT_VALUE__DISPLAY = eINSTANCE.getCompactValue_Display();

		/**
		 * The meta object literal for the '<em><b>Display short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPACT_VALUE__DISPLAY_SHORT = eINSTANCE.getCompactValue_Display_short();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPACT_VALUE__CURRENCY = eINSTANCE.getCompactValue_Currency();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.FundamentalsImpl <em>Fundamentals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.FundamentalsImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getFundamentals()
		 * @generated
		 */
		EClass FUNDAMENTALS = eINSTANCE.getFundamentals();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDAMENTALS__HIGH = eINSTANCE.getFundamentals_High();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDAMENTALS__LOW = eINSTANCE.getFundamentals_Low();

		/**
		 * The meta object literal for the '<em><b>Buy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDAMENTALS__BUY = eINSTANCE.getFundamentals_Buy();

		/**
		 * The meta object literal for the '<em><b>Sell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDAMENTALS__SELL = eINSTANCE.getFundamentals_Sell();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDAMENTALS__LAST = eINSTANCE.getFundamentals_Last();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNDAMENTALS__AVERAGE = eINSTANCE.getFundamentals_Average();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl <em>Fetch Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.FetchValueImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getFetchValue()
		 * @generated
		 */
		EClass FETCH_VALUE = eINSTANCE.getFetchValue();

		/**
		 * The meta object literal for the '<em><b>Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__STAMP = eINSTANCE.getFetchValue_Stamp();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__PRICE = eINSTANCE.getFetchValue_Price();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__AMOUNT = eINSTANCE.getFetchValue_Amount();

		/**
		 * The meta object literal for the '<em><b>Price Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__PRICE_INT = eINSTANCE.getFetchValue_PriceInt();

		/**
		 * The meta object literal for the '<em><b>Amount Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__AMOUNT_INT = eINSTANCE.getFetchValue_AmountInt();

		/**
		 * The meta object literal for the '<em><b>Tid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__TID = eINSTANCE.getFetchValue_Tid();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__CURRENCY = eINSTANCE.getFetchValue_Currency();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__ITEM = eINSTANCE.getFetchValue_Item();

		/**
		 * The meta object literal for the '<em><b>Trade Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__TRADE_TYPE = eINSTANCE.getFetchValue_TradeType();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__PRIMARY = eINSTANCE.getFetchValue_Primary();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FETCH_VALUE__PROPERTIES = eINSTANCE.getFetchValue_Properties();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl <em>Depth Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.DepthValueImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getDepthValue()
		 * @generated
		 */
		EClass DEPTH_VALUE = eINSTANCE.getDepthValue();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__PRICE = eINSTANCE.getDepthValue_Price();

		/**
		 * The meta object literal for the '<em><b>Price Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__PRICE_INT = eINSTANCE.getDepthValue_PriceInt();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__AMOUNT = eINSTANCE.getDepthValue_Amount();

		/**
		 * The meta object literal for the '<em><b>Amount Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__AMOUNT_INT = eINSTANCE.getDepthValue_AmountInt();

		/**
		 * The meta object literal for the '<em><b>Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__STAMP = eINSTANCE.getDepthValue_Stamp();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__KIND = eINSTANCE.getDepthValue_Kind();

		/**
		 * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__SUM = eINSTANCE.getDepthValue_Sum();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__CURRENCY = eINSTANCE.getDepthValue_Currency();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__STATUS = eINSTANCE.getDepthValue_Status();

		/**
		 * The meta object literal for the '<em><b>Last Local Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__LAST_LOCAL_STATUS = eINSTANCE.getDepthValue_LastLocalStatus();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__VOLUME = eINSTANCE.getDepthValue_Volume();

		/**
		 * The meta object literal for the '<em><b>Volume Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPTH_VALUE__VOLUME_INT = eINSTANCE.getDepthValue_VolumeInt();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.WalletImpl <em>Wallet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.WalletImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getWallet()
		 * @generated
		 */
		EClass WALLET = eINSTANCE.getWallet();

		/**
		 * The meta object literal for the '<em><b>Bitcoin Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__BITCOIN_ADDR = eINSTANCE.getWallet_BitcoinAddr();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET__RECORDS = eINSTANCE.getWallet_Records();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET__ORDERS = eINSTANCE.getWallet_Orders();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET__BALANCE = eINSTANCE.getWallet_Balance();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__LOGIN = eINSTANCE.getWallet_Login();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__CREATED = eINSTANCE.getWallet_Created();

		/**
		 * The meta object literal for the '<em><b>Last Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__LAST_LOGIN = eINSTANCE.getWallet_LastLogin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__ID = eINSTANCE.getWallet_Id();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__INDEX = eINSTANCE.getWallet_Index();

		/**
		 * The meta object literal for the '<em><b>Trade Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__TRADE_FEE = eINSTANCE.getWallet_TradeFee();

		/**
		 * The meta object literal for the '<em><b>Monthly Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__MONTHLY_VOLUME = eINSTANCE.getWallet_MonthlyVolume();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET__RIGHTS = eINSTANCE.getWallet_Rights();

		/**
		 * The meta object literal for the '<em><b>Btc Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET__BTC_INFO = eINSTANCE.getWallet_BtcInfo();

		/**
		 * The meta object literal for the '<em><b>Eur Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET__EUR_INFO = eINSTANCE.getWallet_EurInfo();

		/**
		 * The meta object literal for the '<em><b>Usd Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET__USD_INFO = eINSTANCE.getWallet_UsdInfo();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl <em>Wallet Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.WalletRecordImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getWalletRecord()
		 * @generated
		 */
		EClass WALLET_RECORD = eINSTANCE.getWalletRecord();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET_RECORD__INDEX = eINSTANCE.getWalletRecord_Index();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET_RECORD__DATE = eINSTANCE.getWalletRecord_Date();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET_RECORD__TYPE = eINSTANCE.getWalletRecord_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET_RECORD__VALUE = eINSTANCE.getWalletRecord_Value();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET_RECORD__BALANCE = eINSTANCE.getWalletRecord_Balance();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALLET_RECORD__INFO = eINSTANCE.getWalletRecord_Info();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALLET_RECORD__LINKS = eINSTANCE.getWalletRecord_Links();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.LinkImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ADDR = eINSTANCE.getLink_Addr();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.OrderImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Oid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__OID = eINSTANCE.getOrder_Oid();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__CURRENCY = eINSTANCE.getOrder_Currency();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ITEM = eINSTANCE.getOrder_Item();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TYPE = eINSTANCE.getOrder_Type();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__AMOUNT = eINSTANCE.getOrder_Amount();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PRICE = eINSTANCE.getOrder_Price();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__STATUS = eINSTANCE.getOrder_Status();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__DATE = eINSTANCE.getOrder_Date();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRIORITY = eINSTANCE.getOrder_Priority();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl <em>Currency Wallet Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.CurrencyWalletDataImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getCurrencyWalletData()
		 * @generated
		 */
		EClass CURRENCY_WALLET_DATA = eINSTANCE.getCurrencyWalletData();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_WALLET_DATA__CURRENCY = eINSTANCE.getCurrencyWalletData_Currency();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_WALLET_DATA__BALANCE = eINSTANCE.getCurrencyWalletData_Balance();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_WALLET_DATA__OPERATIONS = eINSTANCE.getCurrencyWalletData_Operations();

		/**
		 * The meta object literal for the '<em><b>Max Withdraw Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT = eINSTANCE.getCurrencyWalletData_MaxWithdrawLimit();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_WALLET_DATA__ORDERS = eINSTANCE.getCurrencyWalletData_Orders();

		/**
		 * The meta object literal for the '<em><b>Monthly Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_WALLET_DATA__MONTHLY_LIMIT = eINSTANCE.getCurrencyWalletData_MonthlyLimit();

		/**
		 * The meta object literal for the '<em><b>Daily Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_WALLET_DATA__DAILY_LIMIT = eINSTANCE.getCurrencyWalletData_DailyLimit();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl <em>Withdraw Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getWithdrawInfo()
		 * @generated
		 */
		EClass WITHDRAW_INFO = eINSTANCE.getWithdrawInfo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHDRAW_INFO__VALUE = eINSTANCE.getWithdrawInfo_Value();

		/**
		 * The meta object literal for the '<em><b>Value int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHDRAW_INFO__VALUE_INT = eINSTANCE.getWithdrawInfo_Value_int();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHDRAW_INFO__DISPLAY = eINSTANCE.getWithdrawInfo_Display();

		/**
		 * The meta object literal for the '<em><b>Display short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHDRAW_INFO__DISPLAY_SHORT = eINSTANCE.getWithdrawInfo_Display_short();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHDRAW_INFO__CURRENCY = eINSTANCE.getWithdrawInfo_Currency();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.FetchKind <em>Fetch Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.FetchKind
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getFetchKind()
		 * @generated
		 */
		EEnum FETCH_KIND = eINSTANCE.getFetchKind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.WalletRight <em>Wallet Right</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.WalletRight
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getWalletRight()
		 * @generated
		 */
		EEnum WALLET_RIGHT = eINSTANCE.getWalletRight();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.mtgox.DepthStatus <em>Depth Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.mtgox.DepthStatus
		 * @see net.sf.smbt.btc.mtgox.impl.MtgoxPackageImpl#getDepthStatus()
		 * @generated
		 */
		EEnum DEPTH_STATUS = eINSTANCE.getDepthStatus();

	}

} //MtgoxPackage
