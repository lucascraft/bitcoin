/**
 */
package net.sf.smbt.btc.impl;

import net.sf.smbt.btc.BitCoinNode;
import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.BtcFactory;
import net.sf.smbt.btc.BtcPackage;
import net.sf.smbt.btc.ExchangeRate;
import net.sf.smbt.btc.Order;
import net.sf.smbt.btc.OrderInfo;
import net.sf.smbt.btc.OrderKind;
import net.sf.smbt.btc.Wallet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtcPackageImpl extends EPackageImpl implements BtcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitcoinMarketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass walletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitCoinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum btcCurrencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.btc.BtcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BtcPackageImpl() {
		super(eNS_URI, BtcFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BtcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BtcPackage init() {
		if (isInited) return (BtcPackage)EPackage.Registry.INSTANCE.getEPackage(BtcPackage.eNS_URI);

		// Obtain or create and register package
		BtcPackageImpl theBtcPackage = (BtcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BtcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BtcPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBtcPackage.createPackageContents();

		// Initialize created meta-data
		theBtcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BtcPackage.eNS_URI, theBtcPackage);
		return theBtcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitcoinMarket() {
		return bitcoinMarketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitcoinMarket_ExchangeRates() {
		return (EReference)bitcoinMarketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitcoinMarket_Orders() {
		return (EReference)bitcoinMarketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_Broker() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_High() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_Low() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_Volume() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_Buy() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_Sell() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_Last() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_Currency() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitcoinMarket_History() {
		return (EReference)bitcoinMarketEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitcoinMarket_Wallets() {
		return (EReference)bitcoinMarketEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_Average() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_LastLocal() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitcoinMarket_LastOrig() {
		return (EAttribute)bitcoinMarketEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeRate() {
		return exchangeRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeRate_From() {
		return (EAttribute)exchangeRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeRate_Rate() {
		return (EAttribute)exchangeRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeRate_To() {
		return (EAttribute)exchangeRateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Price() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Volume() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Kind() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderInfo() {
		return orderInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderInfo_High() {
		return (EAttribute)orderInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderInfo_Low() {
		return (EAttribute)orderInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderInfo_Volume() {
		return (EAttribute)orderInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderInfo_Price() {
		return (EAttribute)orderInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderInfo_Date() {
		return (EAttribute)orderInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallet() {
		return walletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_Balance() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_Currency() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_Key() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitCoinNode() {
		return bitCoinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitCoinNode_Id() {
		return (EAttribute)bitCoinNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBtcCurrency() {
		return btcCurrencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderKind() {
		return orderKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcFactory getBtcFactory() {
		return (BtcFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bitcoinMarketEClass = createEClass(BITCOIN_MARKET);
		createEReference(bitcoinMarketEClass, BITCOIN_MARKET__EXCHANGE_RATES);
		createEReference(bitcoinMarketEClass, BITCOIN_MARKET__ORDERS);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__BROKER);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__HIGH);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__LOW);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__VOLUME);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__BUY);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__SELL);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__LAST);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__CURRENCY);
		createEReference(bitcoinMarketEClass, BITCOIN_MARKET__HISTORY);
		createEReference(bitcoinMarketEClass, BITCOIN_MARKET__WALLETS);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__AVERAGE);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__LAST_LOCAL);
		createEAttribute(bitcoinMarketEClass, BITCOIN_MARKET__LAST_ORIG);

		exchangeRateEClass = createEClass(EXCHANGE_RATE);
		createEAttribute(exchangeRateEClass, EXCHANGE_RATE__FROM);
		createEAttribute(exchangeRateEClass, EXCHANGE_RATE__RATE);
		createEAttribute(exchangeRateEClass, EXCHANGE_RATE__TO);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__PRICE);
		createEAttribute(orderEClass, ORDER__VOLUME);
		createEAttribute(orderEClass, ORDER__KIND);

		orderInfoEClass = createEClass(ORDER_INFO);
		createEAttribute(orderInfoEClass, ORDER_INFO__HIGH);
		createEAttribute(orderInfoEClass, ORDER_INFO__LOW);
		createEAttribute(orderInfoEClass, ORDER_INFO__VOLUME);
		createEAttribute(orderInfoEClass, ORDER_INFO__PRICE);
		createEAttribute(orderInfoEClass, ORDER_INFO__DATE);

		walletEClass = createEClass(WALLET);
		createEAttribute(walletEClass, WALLET__BALANCE);
		createEAttribute(walletEClass, WALLET__CURRENCY);
		createEAttribute(walletEClass, WALLET__KEY);

		bitCoinNodeEClass = createEClass(BIT_COIN_NODE);
		createEAttribute(bitCoinNodeEClass, BIT_COIN_NODE__ID);

		// Create enums
		btcCurrencyEEnum = createEEnum(BTC_CURRENCY);
		orderKindEEnum = createEEnum(ORDER_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(bitcoinMarketEClass, BitcoinMarket.class, "BitcoinMarket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBitcoinMarket_ExchangeRates(), this.getExchangeRate(), null, "exchangeRates", null, 0, -1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBitcoinMarket_Orders(), this.getOrder(), null, "orders", null, 0, -1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_Broker(), ecorePackage.getEString(), "broker", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_High(), ecorePackage.getEFloat(), "high", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_Low(), ecorePackage.getEFloat(), "low", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_Buy(), ecorePackage.getEFloat(), "buy", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_Sell(), ecorePackage.getEFloat(), "sell", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_Last(), ecorePackage.getEFloat(), "last", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_Currency(), this.getBtcCurrency(), "currency", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBitcoinMarket_History(), this.getOrderInfo(), null, "history", null, 0, -1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBitcoinMarket_Wallets(), this.getWallet(), null, "wallets", null, 0, -1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_Average(), ecorePackage.getEFloat(), "average", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_LastLocal(), ecorePackage.getEFloat(), "lastLocal", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitcoinMarket_LastOrig(), ecorePackage.getEFloat(), "lastOrig", null, 0, 1, BitcoinMarket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeRateEClass, ExchangeRate.class, "ExchangeRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExchangeRate_From(), this.getBtcCurrency(), "from", null, 0, 1, ExchangeRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeRate_Rate(), ecorePackage.getEFloat(), "rate", null, 0, 1, ExchangeRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeRate_To(), this.getBtcCurrency(), "to", null, 0, 1, ExchangeRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Kind(), this.getOrderKind(), "kind", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderInfoEClass, OrderInfo.class, "OrderInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderInfo_High(), ecorePackage.getEFloat(), "high", null, 0, 1, OrderInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderInfo_Low(), ecorePackage.getEFloat(), "low", null, 0, 1, OrderInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderInfo_Volume(), ecorePackage.getELong(), "volume", null, 0, 1, OrderInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderInfo_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, OrderInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderInfo_Date(), ecorePackage.getEDate(), "date", null, 0, 1, OrderInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(walletEClass, Wallet.class, "Wallet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWallet_Balance(), ecorePackage.getEFloat(), "balance", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_Currency(), this.getBtcCurrency(), "currency", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_Key(), ecorePackage.getEString(), "key", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitCoinNodeEClass, BitCoinNode.class, "BitCoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitCoinNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, BitCoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(btcCurrencyEEnum, BtcCurrency.class, "BtcCurrency");
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.EUR);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.USD);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.BTC);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.GBP);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.JPY);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.AUD);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.CAD);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.CHF);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.CNY);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.HKD);
		addEEnumLiteral(btcCurrencyEEnum, BtcCurrency.PLN);

		initEEnum(orderKindEEnum, OrderKind.class, "OrderKind");
		addEEnumLiteral(orderKindEEnum, OrderKind.ASK);
		addEEnumLiteral(orderKindEEnum, OrderKind.BID);
		addEEnumLiteral(orderKindEEnum, OrderKind.BOTH);
		addEEnumLiteral(orderKindEEnum, OrderKind.ANY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// symbol
		createSymbolAnnotations();
	}

	/**
	 * Initializes the annotations for <b>symbol</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSymbolAnnotations() {
		String source = "symbol";		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UTF-16", "U+20AC"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UTF-16", "U+FE69"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UTF-16", "U+00A3"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UTF-16", "U+00A5"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "UTF-16", "U+FE69"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "UTF-16", "U+FE69"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "UTF-16", "U+20A3"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "UTF-16", "U+00A5"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "UTF-16", "U+FE69"
		   });		
		addAnnotation
		  (btcCurrencyEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "UTF-16", "U+FE69"
		   });
	}

} //BtcPackageImpl
