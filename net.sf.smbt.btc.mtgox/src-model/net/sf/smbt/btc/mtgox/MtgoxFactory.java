/**
 */
package net.sf.smbt.btc.mtgox;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage
 * @generated
 */
public interface MtgoxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MtgoxFactory eINSTANCE = net.sf.smbt.btc.mtgox.impl.MtgoxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MT Gox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Gox</em>'.
	 * @generated
	 */
	MTGox createMTGox();

	/**
	 * Returns a new object of class '<em>MT Gox Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MT Gox Cmd</em>'.
	 * @generated
	 */
	MTGoxCmd createMTGoxCmd();

	/**
	 * Returns a new object of class '<em>Compact Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compact Value</em>'.
	 * @generated
	 */
	CompactValue createCompactValue();

	/**
	 * Returns a new object of class '<em>Fundamentals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fundamentals</em>'.
	 * @generated
	 */
	Fundamentals createFundamentals();

	/**
	 * Returns a new object of class '<em>Fetch Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fetch Value</em>'.
	 * @generated
	 */
	FetchValue createFetchValue();

	/**
	 * Returns a new object of class '<em>Depth Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depth Value</em>'.
	 * @generated
	 */
	DepthValue createDepthValue();

	/**
	 * Returns a new object of class '<em>Wallet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wallet</em>'.
	 * @generated
	 */
	Wallet createWallet();

	/**
	 * Returns a new object of class '<em>Wallet Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wallet Record</em>'.
	 * @generated
	 */
	WalletRecord createWalletRecord();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Currency Wallet Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currency Wallet Data</em>'.
	 * @generated
	 */
	CurrencyWalletData createCurrencyWalletData();

	/**
	 * Returns a new object of class '<em>Withdraw Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Withdraw Info</em>'.
	 * @generated
	 */
	WithdrawInfo createWithdrawInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MtgoxPackage getMtgoxPackage();

} //MtgoxFactory
