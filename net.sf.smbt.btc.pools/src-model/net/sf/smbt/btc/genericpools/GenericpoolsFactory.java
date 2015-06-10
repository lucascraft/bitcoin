/**
 */
package net.sf.smbt.btc.genericpools;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage
 * @generated
 */
public interface GenericpoolsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericpoolsFactory eINSTANCE = net.sf.smbt.btc.genericpools.impl.GenericpoolsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pool Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pool Config</em>'.
	 * @generated
	 */
	PoolConfig createPoolConfig();

	/**
	 * Returns a new object of class '<em>Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setting</em>'.
	 * @generated
	 */
	Setting createSetting();

	/**
	 * Returns a new object of class '<em>Pools Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pools Manager</em>'.
	 * @generated
	 */
	PoolsManager createPoolsManager();

	/**
	 * Returns a new object of class '<em>Asic Batch Work</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asic Batch Work</em>'.
	 * @generated
	 */
	AsicBatchWork createAsicBatchWork();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericpoolsPackage getGenericpoolsPackage();

} //GenericpoolsFactory
