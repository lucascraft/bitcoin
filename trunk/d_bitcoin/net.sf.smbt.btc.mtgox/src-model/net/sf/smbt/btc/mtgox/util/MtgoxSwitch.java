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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage
 * @generated
 */
public class MtgoxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MtgoxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtgoxSwitch() {
		if (modelPackage == null) {
			modelPackage = MtgoxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MtgoxPackage.MT_GOX: {
				MTGox mtGox = (MTGox)theEObject;
				T result = caseMTGox(mtGox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.MT_GOX_CMD: {
				MTGoxCmd mtGoxCmd = (MTGoxCmd)theEObject;
				T result = caseMTGoxCmd(mtGoxCmd);
				if (result == null) result = caseHttpCommCmd(mtGoxCmd);
				if (result == null) result = caseCmd(mtGoxCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.COMPACT_VALUE: {
				CompactValue compactValue = (CompactValue)theEObject;
				T result = caseCompactValue(compactValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.FUNDAMENTALS: {
				Fundamentals fundamentals = (Fundamentals)theEObject;
				T result = caseFundamentals(fundamentals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.FETCH_VALUE: {
				FetchValue fetchValue = (FetchValue)theEObject;
				T result = caseFetchValue(fetchValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.DEPTH_VALUE: {
				DepthValue depthValue = (DepthValue)theEObject;
				T result = caseDepthValue(depthValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.WALLET: {
				Wallet wallet = (Wallet)theEObject;
				T result = caseWallet(wallet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.WALLET_RECORD: {
				WalletRecord walletRecord = (WalletRecord)theEObject;
				T result = caseWalletRecord(walletRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.CURRENCY_WALLET_DATA: {
				CurrencyWalletData currencyWalletData = (CurrencyWalletData)theEObject;
				T result = caseCurrencyWalletData(currencyWalletData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MtgoxPackage.WITHDRAW_INFO: {
				WithdrawInfo withdrawInfo = (WithdrawInfo)theEObject;
				T result = caseWithdrawInfo(withdrawInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Gox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Gox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTGox(MTGox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MT Gox Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MT Gox Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTGoxCmd(MTGoxCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compact Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compact Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompactValue(CompactValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fundamentals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fundamentals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFundamentals(Fundamentals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fetch Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fetch Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFetchValue(FetchValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depth Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depth Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepthValue(DepthValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wallet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wallet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallet(Wallet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wallet Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wallet Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWalletRecord(WalletRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Wallet Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Wallet Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyWalletData(CurrencyWalletData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Withdraw Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Withdraw Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithdrawInfo(WithdrawInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Comm Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Comm Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpCommCmd(HttpCommCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MtgoxSwitch
