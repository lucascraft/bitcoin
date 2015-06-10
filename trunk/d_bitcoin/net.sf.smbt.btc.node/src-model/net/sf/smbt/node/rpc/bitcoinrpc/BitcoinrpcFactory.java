/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage
 * @generated
 */
public interface BitcoinrpcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BitcoinrpcFactory eINSTANCE = net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinrpcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bitcoin Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bitcoin Node</em>'.
	 * @generated
	 */
	BitcoinNode createBitcoinNode();

	/**
	 * Returns a new object of class '<em>Btc Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Btc Info</em>'.
	 * @generated
	 */
	BtcInfo createBtcInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BitcoinrpcPackage getBitcoinrpcPackage();

} //BitcoinrpcFactory
