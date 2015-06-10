/**
 */
package net.sf.smbt.btc.blockchaincmd.impl;

import net.sf.smbt.btc.blockchaincmd.BlockchainCmd;
import net.sf.smbt.btc.blockchaincmd.BlockchaincmdPackage;

import net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blockchain Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.blockchaincmd.impl.BlockchainCmdImpl#getJsonRcv <em>Json Rcv</em>}</li>
 *   <li>{@link net.sf.smbt.btc.blockchaincmd.impl.BlockchainCmdImpl#getJsonSnd <em>Json Snd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockchainCmdImpl extends HttpCommCmdImpl implements BlockchainCmd {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockchainCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchaincmdPackage.Literals.BLOCKCHAIN_CMD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_RCV, oldJsonRcv, jsonRcv));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_SND, oldJsonSnd, jsonSnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_RCV:
				return getJsonRcv();
			case BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_SND:
				return getJsonSnd();
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
			case BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_RCV:
				setJsonRcv((String)newValue);
				return;
			case BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_SND:
				setJsonSnd((String)newValue);
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
			case BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_RCV:
				setJsonRcv(JSON_RCV_EDEFAULT);
				return;
			case BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_SND:
				setJsonSnd(JSON_SND_EDEFAULT);
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
			case BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_RCV:
				return JSON_RCV_EDEFAULT == null ? jsonRcv != null : !JSON_RCV_EDEFAULT.equals(jsonRcv);
			case BlockchaincmdPackage.BLOCKCHAIN_CMD__JSON_SND:
				return JSON_SND_EDEFAULT == null ? jsonSnd != null : !JSON_SND_EDEFAULT.equals(jsonSnd);
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
		result.append(')');
		return result.toString();
	}

} //BlockchainCmdImpl
