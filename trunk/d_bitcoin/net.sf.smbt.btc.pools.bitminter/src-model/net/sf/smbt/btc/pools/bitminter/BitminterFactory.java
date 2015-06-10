/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage
 * @generated
 */
public interface BitminterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BitminterFactory eINSTANCE = net.sf.smbt.btc.pools.bitminter.impl.BitminterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bit Minter Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Minter Cmd</em>'.
	 * @generated
	 */
	BitMinterCmd createBitMinterCmd();

	/**
	 * Returns a new object of class '<em>Bit Minter Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Minter Config</em>'.
	 * @generated
	 */
	BitMinterConfig createBitMinterConfig();

	/**
	 * Returns a new object of class '<em>Pool Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pool Stats</em>'.
	 * @generated
	 */
	PoolStats createPoolStats();

	/**
	 * Returns a new object of class '<em>Pool Round</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pool Round</em>'.
	 * @generated
	 */
	PoolRound createPoolRound();

	/**
	 * Returns a new object of class '<em>Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain</em>'.
	 * @generated
	 */
	Chain createChain();

	/**
	 * Returns a new object of class '<em>User Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Data</em>'.
	 * @generated
	 */
	UserData createUserData();

	/**
	 * Returns a new object of class '<em>Round Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Start</em>'.
	 * @generated
	 */
	RoundStart createRoundStart();

	/**
	 * Returns a new object of class '<em>Shift</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shift</em>'.
	 * @generated
	 */
	Shift createShift();

	/**
	 * Returns a new object of class '<em>Balance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Balance</em>'.
	 * @generated
	 */
	Balance createBalance();

	/**
	 * Returns a new object of class '<em>Worker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Worker</em>'.
	 * @generated
	 */
	Worker createWorker();

	/**
	 * Returns a new object of class '<em>Work</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work</em>'.
	 * @generated
	 */
	Work createWork();

	/**
	 * Returns a new object of class '<em>Dated Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dated Rate</em>'.
	 * @generated
	 */
	DatedRate createDatedRate();

	/**
	 * Returns a new object of class '<em>Dated Hash Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dated Hash Rate</em>'.
	 * @generated
	 */
	DatedHashRate createDatedHashRate();

	/**
	 * Returns a new object of class '<em>User Hash Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Hash Rate</em>'.
	 * @generated
	 */
	UserHashRate createUserHashRate();

	/**
	 * Returns a new object of class '<em>Round Hash Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Hash Rate</em>'.
	 * @generated
	 */
	RoundHashRate createRoundHashRate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BitminterPackage getBitminterPackage();

} //BitminterFactory
