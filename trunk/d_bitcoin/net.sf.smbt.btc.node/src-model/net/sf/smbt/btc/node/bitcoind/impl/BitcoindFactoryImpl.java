/**
 */
package net.sf.smbt.btc.node.bitcoind.impl;

import net.sf.smbt.btc.node.bitcoind.BitcoinCmd;
import net.sf.smbt.btc.node.bitcoind.BitcoindFactory;
import net.sf.smbt.btc.node.bitcoind.BitcoindPackage;
import net.sf.smbt.btc.node.bitcoind.GetInfoCmd;

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
public class BitcoindFactoryImpl extends EFactoryImpl implements BitcoindFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitcoindFactory init() {
		try {
			BitcoindFactory theBitcoindFactory = (BitcoindFactory)EPackage.Registry.INSTANCE.getEFactory("http://bitcoind/1.0"); 
			if (theBitcoindFactory != null) {
				return theBitcoindFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BitcoindFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoindFactoryImpl() {
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
			case BitcoindPackage.BITCOIN_CMD: return createBitcoinCmd();
			case BitcoindPackage.GET_INFO_CMD: return createGetInfoCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoinCmd createBitcoinCmd() {
		BitcoinCmdImpl bitcoinCmd = new BitcoinCmdImpl();
		return bitcoinCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInfoCmd createGetInfoCmd() {
		GetInfoCmdImpl getInfoCmd = new GetInfoCmdImpl();
		return getInfoCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoindPackage getBitcoindPackage() {
		return (BitcoindPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BitcoindPackage getPackage() {
		return BitcoindPackage.eINSTANCE;
	}

} //BitcoindFactoryImpl
