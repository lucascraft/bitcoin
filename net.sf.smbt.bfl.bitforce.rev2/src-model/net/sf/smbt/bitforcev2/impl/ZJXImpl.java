/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.ZJX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZJX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZJXImpl#getFirmwareVersion <em>Firmware Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZJXImpl extends BFLCmdImpl implements ZJX {
	/**
	 * The default value of the '{@link #getFirmwareVersion() <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRMWARE_VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFirmwareVersion() <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected String firmwareVersion = FIRMWARE_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZJXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.ZJX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmwareVersion(String newFirmwareVersion) {
		String oldFirmwareVersion = firmwareVersion;
		firmwareVersion = newFirmwareVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZJX__FIRMWARE_VERSION, oldFirmwareVersion, firmwareVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.ZJX__FIRMWARE_VERSION:
				return getFirmwareVersion();
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
			case Bitforcev2Package.ZJX__FIRMWARE_VERSION:
				setFirmwareVersion((String)newValue);
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
			case Bitforcev2Package.ZJX__FIRMWARE_VERSION:
				setFirmwareVersion(FIRMWARE_VERSION_EDEFAULT);
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
			case Bitforcev2Package.ZJX__FIRMWARE_VERSION:
				return FIRMWARE_VERSION_EDEFAULT == null ? firmwareVersion != null : !FIRMWARE_VERSION_EDEFAULT.equals(firmwareVersion);
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
		result.append(" (firmwareVersion: ");
		result.append(firmwareVersion);
		result.append(')');
		return result.toString();
	}

} //ZJXImpl
