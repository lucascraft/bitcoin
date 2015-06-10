/**
 */
package net.sf.smbt.btc.node.bitcoind.impl;

import net.sf.smbt.btc.node.bitcoind.BitcoinCmd;
import net.sf.smbt.btc.node.bitcoind.BitcoindPackage;
import net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitcoin Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.node.bitcoind.impl.BitcoinCmdImpl#getJsonRcv <em>Json Rcv</em>}</li>
 *   <li>{@link net.sf.smbt.btc.node.bitcoind.impl.BitcoinCmdImpl#getJsonSnd <em>Json Snd</em>}</li>
 *   <li>{@link net.sf.smbt.btc.node.bitcoind.impl.BitcoinCmdImpl#getBtcAddr <em>Btc Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitcoinCmdImpl extends HttpCommCmdImpl implements BitcoinCmd {
	/**
	 * The default value of the '{@link #getJsonRcv() <em>Json Rcv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonRcv()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_RCV_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJsonRcv() <em>Json Rcv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonRcv()
	 * @generated
	 * @ordered
	 */
	protected String jsonRcv = JSON_RCV_EDEFAULT;
	/**
	 * The default value of the '{@link #getJsonSnd() <em>Json Snd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonSnd()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_SND_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJsonSnd() <em>Json Snd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonSnd()
	 * @generated
	 * @ordered
	 */
	protected String jsonSnd = JSON_SND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBtcAddr() <em>Btc Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtcAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String BTC_ADDR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBtcAddr() <em>Btc Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtcAddr()
	 * @generated
	 * @ordered
	 */
	protected String btcAddr = BTC_ADDR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitcoinCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitcoindPackage.Literals.BITCOIN_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJsonRcv() {
		return jsonRcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonRcv(String newJsonRcv) {
		String oldJsonRcv = jsonRcv;
		jsonRcv = newJsonRcv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoindPackage.BITCOIN_CMD__JSON_RCV, oldJsonRcv, jsonRcv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJsonSnd() {
		return jsonSnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonSnd(String newJsonSnd) {
		String oldJsonSnd = jsonSnd;
		jsonSnd = newJsonSnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoindPackage.BITCOIN_CMD__JSON_SND, oldJsonSnd, jsonSnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtcAddr() {
		return btcAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtcAddr(String newBtcAddr) {
		String oldBtcAddr = btcAddr;
		btcAddr = newBtcAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoindPackage.BITCOIN_CMD__BTC_ADDR, oldBtcAddr, btcAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitcoindPackage.BITCOIN_CMD__JSON_RCV:
				return getJsonRcv();
			case BitcoindPackage.BITCOIN_CMD__JSON_SND:
				return getJsonSnd();
			case BitcoindPackage.BITCOIN_CMD__BTC_ADDR:
				return getBtcAddr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BitcoindPackage.BITCOIN_CMD__JSON_RCV:
				setJsonRcv((String)newValue);
				return;
			case BitcoindPackage.BITCOIN_CMD__JSON_SND:
				setJsonSnd((String)newValue);
				return;
			case BitcoindPackage.BITCOIN_CMD__BTC_ADDR:
				setBtcAddr((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BitcoindPackage.BITCOIN_CMD__JSON_RCV:
				setJsonRcv(JSON_RCV_EDEFAULT);
				return;
			case BitcoindPackage.BITCOIN_CMD__JSON_SND:
				setJsonSnd(JSON_SND_EDEFAULT);
				return;
			case BitcoindPackage.BITCOIN_CMD__BTC_ADDR:
				setBtcAddr(BTC_ADDR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BitcoindPackage.BITCOIN_CMD__JSON_RCV:
				return JSON_RCV_EDEFAULT == null ? jsonRcv != null : !JSON_RCV_EDEFAULT.equals(jsonRcv);
			case BitcoindPackage.BITCOIN_CMD__JSON_SND:
				return JSON_SND_EDEFAULT == null ? jsonSnd != null : !JSON_SND_EDEFAULT.equals(jsonSnd);
			case BitcoindPackage.BITCOIN_CMD__BTC_ADDR:
				return BTC_ADDR_EDEFAULT == null ? btcAddr != null : !BTC_ADDR_EDEFAULT.equals(btcAddr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (jsonRcv: ");
		result.append(jsonRcv);
		result.append(", jsonSnd: ");
		result.append(jsonSnd);
		result.append(", btcAddr: ");
		result.append(btcAddr);
		result.append(')');
		return result.toString();
	}

} //BitcoinCmdImpl
