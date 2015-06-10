/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiRumbleReqCmd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Rumble Req Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiRumbleReqCmdImpl#getLedByte <em>Led Byte</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiRumbleReqCmdImpl#getMillis <em>Millis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiRumbleReqCmdImpl extends WiiMoteReqCmdImpl implements WiiRumbleReqCmd {
	/**
	 * The default value of the '{@link #getLedByte() <em>Led Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLedByte()
	 * @generated
	 * @ordered
	 */
	protected static final byte LED_BYTE_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getLedByte() <em>Led Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLedByte()
	 * @generated
	 * @ordered
	 */
	protected byte ledByte = LED_BYTE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMillis() <em>Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long MILLIS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getMillis() <em>Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMillis()
	 * @generated
	 * @ordered
	 */
	protected long millis = MILLIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiRumbleReqCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_RUMBLE_REQ_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getLedByte() {
		return ledByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLedByte(byte newLedByte) {
		byte oldLedByte = ledByte;
		ledByte = newLedByte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_RUMBLE_REQ_CMD__LED_BYTE, oldLedByte, ledByte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMillis() {
		return millis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMillis(long newMillis) {
		long oldMillis = millis;
		millis = newMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_RUMBLE_REQ_CMD__MILLIS, oldMillis, millis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getStopRumbleBytes(byte ledByte) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD__LED_BYTE:
				return getLedByte();
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD__MILLIS:
				return getMillis();
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
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD__LED_BYTE:
				setLedByte((Byte)newValue);
				return;
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD__MILLIS:
				setMillis((Long)newValue);
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
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD__LED_BYTE:
				setLedByte(LED_BYTE_EDEFAULT);
				return;
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD__MILLIS:
				setMillis(MILLIS_EDEFAULT);
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
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD__LED_BYTE:
				return ledByte != LED_BYTE_EDEFAULT;
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD__MILLIS:
				return millis != MILLIS_EDEFAULT;
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
		result.append(" (ledByte: ");
		result.append(ledByte);
		result.append(", millis: ");
		result.append(millis);
		result.append(')');
		return result.toString();
	}

} //WiiRumbleReqCmdImpl
