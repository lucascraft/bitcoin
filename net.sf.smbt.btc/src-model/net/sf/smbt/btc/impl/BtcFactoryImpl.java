/**
 */
package net.sf.smbt.btc.impl;

import net.sf.smbt.btc.*;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtcFactoryImpl extends EFactoryImpl implements BtcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtcFactory init() {
		try {
			BtcFactory theBtcFactory = (BtcFactory)EPackage.Registry.INSTANCE.getEFactory("http://btc/1.0"); 
			if (theBtcFactory != null) {
				return theBtcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BtcPackage.BITCOIN_MARKET: return createBitcoinMarket();
			case BtcPackage.EXCHANGE_RATE: return createExchangeRate();
			case BtcPackage.ORDER: return createOrder();
			case BtcPackage.ORDER_INFO: return createOrderInfo();
			case BtcPackage.WALLET: return createWallet();
			case BtcPackage.BIT_COIN_NODE: return createBitCoinNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BtcPackage.BTC_CURRENCY:
				return createBtcCurrencyFromString(eDataType, initialValue);
			case BtcPackage.ORDER_KIND:
				return createOrderKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BtcPackage.BTC_CURRENCY:
				return convertBtcCurrencyToString(eDataType, instanceValue);
			case BtcPackage.ORDER_KIND:
				return convertOrderKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoinMarket createBitcoinMarket() {
		BitcoinMarketImpl bitcoinMarket = new BitcoinMarketImpl();
		return bitcoinMarket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeRate createExchangeRate() {
		ExchangeRateImpl exchangeRate = new ExchangeRateImpl();
		return exchangeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderInfo createOrderInfo() {
		OrderInfoImpl orderInfo = new OrderInfoImpl();
		return orderInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet createWallet() {
		WalletImpl wallet = new WalletImpl();
		return wallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitCoinNode createBitCoinNode() {
		BitCoinNodeImpl bitCoinNode = new BitCoinNodeImpl();
		return bitCoinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcCurrency createBtcCurrencyFromString(EDataType eDataType, String initialValue) {
		BtcCurrency result = BtcCurrency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBtcCurrencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderKind createOrderKindFromString(EDataType eDataType, String initialValue) {
		OrderKind result = OrderKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcPackage getBtcPackage() {
		return (BtcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BtcPackage getPackage() {
		return BtcPackage.eINSTANCE;
	}

} //BtcFactoryImpl
