/**
 */
package net.sf.smbt.btc.mtgox.impl;

import net.sf.smbt.btc.mtgox.MTGoxCmd;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Gox Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxCmdImpl#getJsonSnd <em>Json Snd</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxCmdImpl#getJsonRcv <em>Json Rcv</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxCmdImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MTGoxCmdImpl extends HttpCommCmdImpl implements MTGoxCmd {
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
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTGoxCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.MT_GOX_CMD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX_CMD__JSON_SND, oldJsonSnd, jsonSnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX_CMD__JSON_RCV, oldJsonRcv, jsonRcv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX_CMD__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.MT_GOX_CMD__JSON_SND:
				return getJsonSnd();
			case MtgoxPackage.MT_GOX_CMD__JSON_RCV:
				return getJsonRcv();
			case MtgoxPackage.MT_GOX_CMD__QUERY:
				return getQuery();
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
			case MtgoxPackage.MT_GOX_CMD__JSON_SND:
				setJsonSnd((String)newValue);
				return;
			case MtgoxPackage.MT_GOX_CMD__JSON_RCV:
				setJsonRcv((String)newValue);
				return;
			case MtgoxPackage.MT_GOX_CMD__QUERY:
				setQuery((String)newValue);
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
			case MtgoxPackage.MT_GOX_CMD__JSON_SND:
				setJsonSnd(JSON_SND_EDEFAULT);
				return;
			case MtgoxPackage.MT_GOX_CMD__JSON_RCV:
				setJsonRcv(JSON_RCV_EDEFAULT);
				return;
			case MtgoxPackage.MT_GOX_CMD__QUERY:
				setQuery(QUERY_EDEFAULT);
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
			case MtgoxPackage.MT_GOX_CMD__JSON_SND:
				return JSON_SND_EDEFAULT == null ? jsonSnd != null : !JSON_SND_EDEFAULT.equals(jsonSnd);
			case MtgoxPackage.MT_GOX_CMD__JSON_RCV:
				return JSON_RCV_EDEFAULT == null ? jsonRcv != null : !JSON_RCV_EDEFAULT.equals(jsonRcv);
			case MtgoxPackage.MT_GOX_CMD__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
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
		result.append(", query: ");
		result.append(query);
		result.append(')');
		return result.toString();
	}

} //MTGoxCmdImpl
