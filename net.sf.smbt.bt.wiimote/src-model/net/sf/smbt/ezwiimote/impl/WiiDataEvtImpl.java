/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiDataEvt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Data Evt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiDataEvtImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiDataEvtImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiDataEvtImpl#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiDataEvtImpl extends WiiEvtImpl implements WiiDataEvt {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] ADDRESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected byte[] address = ADDRESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPayload() <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PAYLOAD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected byte[] payload = PAYLOAD_EDEFAULT;
	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final int ERROR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected int error = ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiDataEvtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_DATA_EVT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(byte[] newAddress) {
		byte[] oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_DATA_EVT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPayload() {
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayload(byte[] newPayload) {
		byte[] oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_DATA_EVT__PAYLOAD, oldPayload, payload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(int newError) {
		int oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_DATA_EVT__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_DATA_EVT__ADDRESS:
				return getAddress();
			case EzwiimotePackage.WII_DATA_EVT__PAYLOAD:
				return getPayload();
			case EzwiimotePackage.WII_DATA_EVT__ERROR:
				return getError();
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
			case EzwiimotePackage.WII_DATA_EVT__ADDRESS:
				setAddress((byte[])newValue);
				return;
			case EzwiimotePackage.WII_DATA_EVT__PAYLOAD:
				setPayload((byte[])newValue);
				return;
			case EzwiimotePackage.WII_DATA_EVT__ERROR:
				setError((Integer)newValue);
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
			case EzwiimotePackage.WII_DATA_EVT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case EzwiimotePackage.WII_DATA_EVT__PAYLOAD:
				setPayload(PAYLOAD_EDEFAULT);
				return;
			case EzwiimotePackage.WII_DATA_EVT__ERROR:
				setError(ERROR_EDEFAULT);
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
			case EzwiimotePackage.WII_DATA_EVT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case EzwiimotePackage.WII_DATA_EVT__PAYLOAD:
				return PAYLOAD_EDEFAULT == null ? payload != null : !PAYLOAD_EDEFAULT.equals(payload);
			case EzwiimotePackage.WII_DATA_EVT__ERROR:
				return error != ERROR_EDEFAULT;
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
		result.append(" (address: ");
		result.append(address);
		result.append(", payload: ");
		result.append(payload);
		result.append(", error: ");
		result.append(error);
		result.append(')');
		return result.toString();
	}

} //WiiDataEvtImpl
