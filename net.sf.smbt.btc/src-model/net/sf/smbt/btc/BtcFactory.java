/**
 */
package net.sf.smbt.btc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.BtcPackage
 * @generated
 */
public interface BtcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtcFactory eINSTANCE = net.sf.smbt.btc.impl.BtcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bitcoin Market</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bitcoin Market</em>'.
	 * @generated
	 */
	BitcoinMarket createBitcoinMarket();

	/**
	 * Returns a new object of class '<em>Exchange Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Rate</em>'.
	 * @generated
	 */
	ExchangeRate createExchangeRate();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Order Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Info</em>'.
	 * @generated
	 */
	OrderInfo createOrderInfo();

	/**
	 * Returns a new object of class '<em>Wallet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wallet</em>'.
	 * @generated
	 */
	Wallet createWallet();

	/**
	 * Returns a new object of class '<em>Bit Coin Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Coin Node</em>'.
	 * @generated
	 */
	BitCoinNode createBitCoinNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtcPackage getBtcPackage();

} //BtcFactory
