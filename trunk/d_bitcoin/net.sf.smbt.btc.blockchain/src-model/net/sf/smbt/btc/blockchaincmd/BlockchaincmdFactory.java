/**
 */
package net.sf.smbt.btc.blockchaincmd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.blockchaincmd.BlockchaincmdPackage
 * @generated
 */
public interface BlockchaincmdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockchaincmdFactory eINSTANCE = net.sf.smbt.btc.blockchaincmd.impl.BlockchaincmdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Blockchain Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blockchain Cmd</em>'.
	 * @generated
	 */
	BlockchainCmd createBlockchainCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BlockchaincmdPackage getBlockchaincmdPackage();

} //BlockchaincmdFactory
