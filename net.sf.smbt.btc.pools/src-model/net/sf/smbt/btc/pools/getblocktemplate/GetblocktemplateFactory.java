/**
 */
package net.sf.smbt.btc.pools.getblocktemplate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.pools.getblocktemplate.GetblocktemplatePackage
 * @generated
 */
public interface GetblocktemplateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GetblocktemplateFactory eINSTANCE = net.sf.smbt.btc.pools.getblocktemplate.impl.GetblocktemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Get Block Template Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Block Template Cmd</em>'.
	 * @generated
	 */
	GetBlockTemplateCmd createGetBlockTemplateCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GetblocktemplatePackage getGetblocktemplatePackage();

} //GetblocktemplateFactory
