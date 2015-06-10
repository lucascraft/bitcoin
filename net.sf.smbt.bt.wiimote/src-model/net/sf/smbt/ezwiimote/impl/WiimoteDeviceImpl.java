/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiCalibrationDataReport;
import net.sf.smbt.ezwiimote.WiiStatusInfoReport;
import net.sf.smbt.ezwiimote.WiimoteDevice;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wiimote Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiimoteDeviceImpl#getInfoReport <em>Info Report</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiimoteDeviceImpl#getCalibratonDataReport <em>Calibraton Data Report</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiimoteDeviceImpl#getBtaddress <em>Btaddress</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiimoteDeviceImpl extends MinimalEObjectImpl.Container implements WiimoteDevice {
	/**
	 * The cached value of the '{@link #getInfoReport() <em>Info Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoReport()
	 * @generated
	 * @ordered
	 */
	protected WiiStatusInfoReport infoReport;

	/**
	 * The cached value of the '{@link #getCalibratonDataReport() <em>Calibraton Data Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibratonDataReport()
	 * @generated
	 * @ordered
	 */
	protected WiiCalibrationDataReport calibratonDataReport;

	/**
	 * The default value of the '{@link #getBtaddress() <em>Btaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtaddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BTADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtaddress() <em>Btaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtaddress()
	 * @generated
	 * @ordered
	 */
	protected String btaddress = BTADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiimoteDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WIIMOTE_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiStatusInfoReport getInfoReport() {
		if (infoReport != null && infoReport.eIsProxy()) {
			InternalEObject oldInfoReport = (InternalEObject)infoReport;
			infoReport = (WiiStatusInfoReport)eResolveProxy(oldInfoReport);
			if (infoReport != oldInfoReport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzwiimotePackage.WIIMOTE_DEVICE__INFO_REPORT, oldInfoReport, infoReport));
			}
		}
		return infoReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiStatusInfoReport basicGetInfoReport() {
		return infoReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoReport(WiiStatusInfoReport newInfoReport) {
		WiiStatusInfoReport oldInfoReport = infoReport;
		infoReport = newInfoReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WIIMOTE_DEVICE__INFO_REPORT, oldInfoReport, infoReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiCalibrationDataReport getCalibratonDataReport() {
		if (calibratonDataReport != null && calibratonDataReport.eIsProxy()) {
			InternalEObject oldCalibratonDataReport = (InternalEObject)calibratonDataReport;
			calibratonDataReport = (WiiCalibrationDataReport)eResolveProxy(oldCalibratonDataReport);
			if (calibratonDataReport != oldCalibratonDataReport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzwiimotePackage.WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT, oldCalibratonDataReport, calibratonDataReport));
			}
		}
		return calibratonDataReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiCalibrationDataReport basicGetCalibratonDataReport() {
		return calibratonDataReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalibratonDataReport(WiiCalibrationDataReport newCalibratonDataReport) {
		WiiCalibrationDataReport oldCalibratonDataReport = calibratonDataReport;
		calibratonDataReport = newCalibratonDataReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT, oldCalibratonDataReport, calibratonDataReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtaddress() {
		return btaddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtaddress(String newBtaddress) {
		String oldBtaddress = btaddress;
		btaddress = newBtaddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WIIMOTE_DEVICE__BTADDRESS, oldBtaddress, btaddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WIIMOTE_DEVICE__INFO_REPORT:
				if (resolve) return getInfoReport();
				return basicGetInfoReport();
			case EzwiimotePackage.WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT:
				if (resolve) return getCalibratonDataReport();
				return basicGetCalibratonDataReport();
			case EzwiimotePackage.WIIMOTE_DEVICE__BTADDRESS:
				return getBtaddress();
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
			case EzwiimotePackage.WIIMOTE_DEVICE__INFO_REPORT:
				setInfoReport((WiiStatusInfoReport)newValue);
				return;
			case EzwiimotePackage.WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT:
				setCalibratonDataReport((WiiCalibrationDataReport)newValue);
				return;
			case EzwiimotePackage.WIIMOTE_DEVICE__BTADDRESS:
				setBtaddress((String)newValue);
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
			case EzwiimotePackage.WIIMOTE_DEVICE__INFO_REPORT:
				setInfoReport((WiiStatusInfoReport)null);
				return;
			case EzwiimotePackage.WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT:
				setCalibratonDataReport((WiiCalibrationDataReport)null);
				return;
			case EzwiimotePackage.WIIMOTE_DEVICE__BTADDRESS:
				setBtaddress(BTADDRESS_EDEFAULT);
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
			case EzwiimotePackage.WIIMOTE_DEVICE__INFO_REPORT:
				return infoReport != null;
			case EzwiimotePackage.WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT:
				return calibratonDataReport != null;
			case EzwiimotePackage.WIIMOTE_DEVICE__BTADDRESS:
				return BTADDRESS_EDEFAULT == null ? btaddress != null : !BTADDRESS_EDEFAULT.equals(btaddress);
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
		result.append(" (btaddress: ");
		result.append(btaddress);
		result.append(')');
		return result.toString();
	}

} //WiimoteDeviceImpl
