/**
 */
package net.sf.smbt.btc.pools.getwork;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.pools.getwork.GetworkPackage
 * @generated
 */
public interface GetworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GetworkFactory eINSTANCE = net.sf.smbt.btc.pools.getwork.impl.GetworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cmd</em>'.
	 * @generated
	 */
	GetworkCmd createGetworkCmd();

	/**
	 * Returns a new object of class '<em>Work State Tmp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work State Tmp</em>'.
	 * @generated
	 */
	WorkStateTmp createWorkStateTmp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GetworkPackage getGetworkPackage();

} //GetworkFactory
