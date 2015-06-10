/**
 */
package net.sf.smbt.btc.blockchaincmd.impl;

import net.sf.smbt.btc.blockchaincmd.*;

import org.eclipse.emf.ecore.EClass;
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
public class BlockchaincmdFactoryImpl extends EFactoryImpl implements BlockchaincmdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockchaincmdFactory init() {
		try {
			BlockchaincmdFactory theBlockchaincmdFactory = (BlockchaincmdFactory)EPackage.Registry.INSTANCE.getEFactory("http://blockchaincmd/1.0"); 
			if (theBlockchaincmdFactory != null) {
				return theBlockchaincmdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockchaincmdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchaincmdFactoryImpl() {
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
			case BlockchaincmdPackage.BLOCKCHAIN_CMD: return createBlockchainCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainCmd createBlockchainCmd() {
		BlockchainCmdImpl blockchainCmd = new BlockchainCmdImpl();
		return blockchainCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchaincmdPackage getBlockchaincmdPackage() {
		return (BlockchaincmdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlockchaincmdPackage getPackage() {
		return BlockchaincmdPackage.eINSTANCE;
	}

} //BlockchaincmdFactoryImpl
