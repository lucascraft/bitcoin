/**
 */
package net.sf.smbt.btc.node.bitcoind;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.node.bitcoind.BitcoindPackage
 * @generated
 */
public interface BitcoindFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BitcoindFactory eINSTANCE = net.sf.smbt.btc.node.bitcoind.impl.BitcoindFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bitcoin Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bitcoin Cmd</em>'.
	 * @generated
	 */
	BitcoinCmd createBitcoinCmd();

	/**
	 * Returns a new object of class '<em>Get Info Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Info Cmd</em>'.
	 * @generated
	 */
	GetInfoCmd createGetInfoCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BitcoindPackage getBitcoindPackage();

} //BitcoindFactory
