/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc.util;

import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage;
import net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo;
import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage
 * @generated
 */
public class BitcoinrpcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BitcoinrpcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoinrpcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BitcoinrpcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitcoinrpcSwitch<Adapter> modelSwitch =
		new BitcoinrpcSwitch<Adapter>() {
			@Override
			public Adapter caseBitcoinNode(BitcoinNode object) {
				return createBitcoinNodeAdapter();
			}
			@Override
			public Adapter caseBtcInfo(BtcInfo object) {
				return createBtcInfoAdapter();
			}
			@Override
			public Adapter caseIConnectedUnit(IConnectedUnit object) {
				return createIConnectedUnitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode <em>Bitcoin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode
	 * @generated
	 */
	public Adapter createBitcoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo <em>Btc Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo
	 * @generated
	 */
	public Adapter createBtcInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @generated
	 */
	public Adapter createIConnectedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BitcoinrpcAdapterFactory
