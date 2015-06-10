/**
 */
package net.sf.smbt.btc.pools.getblocktemplate.impl;

import net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd;
import net.sf.smbt.btc.pools.getblocktemplate.GetblocktemplatePackage;
import net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Block Template Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.getblocktemplate.impl.GetBlockTemplateCmdImpl#getJsonSnd <em>Json Snd</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.getblocktemplate.impl.GetBlockTemplateCmdImpl#getJsonRcv <em>Json Rcv</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetBlockTemplateCmdImpl extends HttpCommCmdImpl implements GetBlockTemplateCmd {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetBlockTemplateCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GetblocktemplatePackage.Literals.GET_BLOCK_TEMPLATE_CMD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_SND, oldJsonSnd, jsonSnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_RCV, oldJsonRcv, jsonRcv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_SND:
				return getJsonSnd();
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_RCV:
				return getJsonRcv();
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
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_SND:
				setJsonSnd((String)newValue);
				return;
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_RCV:
				setJsonRcv((String)newValue);
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
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_SND:
				setJsonSnd(JSON_SND_EDEFAULT);
				return;
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_RCV:
				setJsonRcv(JSON_RCV_EDEFAULT);
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
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_SND:
				return JSON_SND_EDEFAULT == null ? jsonSnd != null : !JSON_SND_EDEFAULT.equals(jsonSnd);
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD__JSON_RCV:
				return JSON_RCV_EDEFAULT == null ? jsonRcv != null : !JSON_RCV_EDEFAULT.equals(jsonRcv);
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
		result.append(" (jsonSnd: ");
		result.append(jsonSnd);
		result.append(", jsonRcv: ");
		result.append(jsonRcv);
		result.append(')');
		return result.toString();
	}

} //GetBlockTemplateCmdImpl
