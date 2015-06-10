/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc.impl;

import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcFactory;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage;
import net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo;

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
public class BitcoinrpcFactoryImpl extends EFactoryImpl implements BitcoinrpcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitcoinrpcFactory init() {
		try {
			BitcoinrpcFactory theBitcoinrpcFactory = (BitcoinrpcFactory)EPackage.Registry.INSTANCE.getEFactory("http://bitcoinrpc/1.0"); 
			if (theBitcoinrpcFactory != null) {
				return theBitcoinrpcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BitcoinrpcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoinrpcFactoryImpl() {
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
			case BitcoinrpcPackage.BITCOIN_NODE: return createBitcoinNode();
			case BitcoinrpcPackage.BTC_INFO: return createBtcInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoinNode createBitcoinNode() {
		BitcoinNodeImpl bitcoinNode = new BitcoinNodeImpl();
		return bitcoinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcInfo createBtcInfo() {
		BtcInfoImpl btcInfo = new BtcInfoImpl();
		return btcInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoinrpcPackage getBitcoinrpcPackage() {
		return (BitcoinrpcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BitcoinrpcPackage getPackage() {
		return BitcoinrpcPackage.eINSTANCE;
	}

} //BitcoinrpcFactoryImpl
