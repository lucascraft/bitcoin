/**
 */
package net.sf.smbt.btc.mtgox.util;

import net.sf.smbt.btc.mtgox.CompactValue;
import net.sf.smbt.btc.mtgox.CurrencyWalletData;
import net.sf.smbt.btc.mtgox.DepthValue;
import net.sf.smbt.btc.mtgox.FetchValue;
import net.sf.smbt.btc.mtgox.Fundamentals;
import net.sf.smbt.btc.mtgox.Link;
import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.btc.mtgox.MTGoxCmd;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.btc.mtgox.Order;
import net.sf.smbt.btc.mtgox.Wallet;
import net.sf.smbt.btc.mtgox.WalletRecord;
import net.sf.smbt.btc.mtgox.WithdrawInfo;
import net.sf.smbt.comm.httpcmd.HttpCommCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage
 * @generated
 */
public class MtgoxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MtgoxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtgoxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MtgoxPackage.eINSTANCE;
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
	protected MtgoxSwitch<Adapter> modelSwitch =
		new MtgoxSwitch<Adapter>() {
			@Override
			public Adapter caseMTGox(MTGox object) {
				return createMTGoxAdapter();
			}
			@Override
			public Adapter caseMTGoxCmd(MTGoxCmd object) {
				return createMTGoxCmdAdapter();
			}
			@Override
			public Adapter caseCompactValue(CompactValue object) {
				return createCompactValueAdapter();
			}
			@Override
			public Adapter caseFundamentals(Fundamentals object) {
				return createFundamentalsAdapter();
			}
			@Override
			public Adapter caseFetchValue(FetchValue object) {
				return createFetchValueAdapter();
			}
			@Override
			public Adapter caseDepthValue(DepthValue object) {
				return createDepthValueAdapter();
			}
			@Override
			public Adapter caseWallet(Wallet object) {
				return createWalletAdapter();
			}
			@Override
			public Adapter caseWalletRecord(WalletRecord object) {
				return createWalletRecordAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseCurrencyWalletData(CurrencyWalletData object) {
				return createCurrencyWalletDataAdapter();
			}
			@Override
			public Adapter caseWithdrawInfo(WithdrawInfo object) {
				return createWithdrawInfoAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseHttpCommCmd(HttpCommCmd object) {
				return createHttpCommCmdAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.MTGox <em>MT Gox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.MTGox
	 * @generated
	 */
	public Adapter createMTGoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.MTGoxCmd <em>MT Gox Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.MTGoxCmd
	 * @generated
	 */
	public Adapter createMTGoxCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.CompactValue <em>Compact Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.CompactValue
	 * @generated
	 */
	public Adapter createCompactValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.Fundamentals <em>Fundamentals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.Fundamentals
	 * @generated
	 */
	public Adapter createFundamentalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.FetchValue <em>Fetch Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.FetchValue
	 * @generated
	 */
	public Adapter createFetchValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.DepthValue <em>Depth Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.DepthValue
	 * @generated
	 */
	public Adapter createDepthValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.Wallet <em>Wallet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.Wallet
	 * @generated
	 */
	public Adapter createWalletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.WalletRecord <em>Wallet Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.WalletRecord
	 * @generated
	 */
	public Adapter createWalletRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.CurrencyWalletData <em>Currency Wallet Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.CurrencyWalletData
	 * @generated
	 */
	public Adapter createCurrencyWalletDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btc.mtgox.WithdrawInfo <em>Withdraw Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btc.mtgox.WithdrawInfo
	 * @generated
	 */
	public Adapter createWithdrawInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.httpcmd.HttpCommCmd <em>Http Comm Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.httpcmd.HttpCommCmd
	 * @generated
	 */
	public Adapter createHttpCommCmdAdapter() {
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

} //MtgoxAdapterFactory
