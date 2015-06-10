/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import java.util.Collection;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiStatusInfoReport;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Status Info Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl#isExtensionControllerConnected <em>Extension Controller Connected</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl#isSpeakerEnabled <em>Speaker Enabled</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl#isContinuousReportingEnabled <em>Continuous Reporting Enabled</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl#getLedEnabled <em>Led Enabled</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl#getBatteryLevel <em>Battery Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiStatusInfoReportImpl extends WiiCmdImpl implements WiiStatusInfoReport {
	/**
	 * The default value of the '{@link #isExtensionControllerConnected() <em>Extension Controller Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtensionControllerConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENSION_CONTROLLER_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtensionControllerConnected() <em>Extension Controller Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtensionControllerConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean extensionControllerConnected = EXTENSION_CONTROLLER_CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSpeakerEnabled() <em>Speaker Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpeakerEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPEAKER_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpeakerEnabled() <em>Speaker Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpeakerEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean speakerEnabled = SPEAKER_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isContinuousReportingEnabled() <em>Continuous Reporting Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinuousReportingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUOUS_REPORTING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinuousReportingEnabled() <em>Continuous Reporting Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinuousReportingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean continuousReportingEnabled = CONTINUOUS_REPORTING_ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLedEnabled() <em>Led Enabled</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLedEnabled()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> ledEnabled;

	/**
	 * The default value of the '{@link #getBatteryLevel() <em>Battery Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryLevel()
	 * @generated
	 * @ordered
	 */
	protected static final byte BATTERY_LEVEL_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getBatteryLevel() <em>Battery Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryLevel()
	 * @generated
	 * @ordered
	 */
	protected byte batteryLevel = BATTERY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiStatusInfoReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_STATUS_INFO_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtensionControllerConnected() {
		return extensionControllerConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionControllerConnected(boolean newExtensionControllerConnected) {
		boolean oldExtensionControllerConnected = extensionControllerConnected;
		extensionControllerConnected = newExtensionControllerConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_STATUS_INFO_REPORT__EXTENSION_CONTROLLER_CONNECTED, oldExtensionControllerConnected, extensionControllerConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpeakerEnabled() {
		return speakerEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeakerEnabled(boolean newSpeakerEnabled) {
		boolean oldSpeakerEnabled = speakerEnabled;
		speakerEnabled = newSpeakerEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_STATUS_INFO_REPORT__SPEAKER_ENABLED, oldSpeakerEnabled, speakerEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContinuousReportingEnabled() {
		return continuousReportingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuousReportingEnabled(boolean newContinuousReportingEnabled) {
		boolean oldContinuousReportingEnabled = continuousReportingEnabled;
		continuousReportingEnabled = newContinuousReportingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_STATUS_INFO_REPORT__CONTINUOUS_REPORTING_ENABLED, oldContinuousReportingEnabled, continuousReportingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getLedEnabled() {
		if (ledEnabled == null) {
			ledEnabled = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, EzwiimotePackage.WII_STATUS_INFO_REPORT__LED_ENABLED);
		}
		return ledEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getBatteryLevel() {
		return batteryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatteryLevel(byte newBatteryLevel) {
		byte oldBatteryLevel = batteryLevel;
		batteryLevel = newBatteryLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_STATUS_INFO_REPORT__BATTERY_LEVEL, oldBatteryLevel, batteryLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__EXTENSION_CONTROLLER_CONNECTED:
				return isExtensionControllerConnected();
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__SPEAKER_ENABLED:
				return isSpeakerEnabled();
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__CONTINUOUS_REPORTING_ENABLED:
				return isContinuousReportingEnabled();
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__LED_ENABLED:
				return getLedEnabled();
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__BATTERY_LEVEL:
				return getBatteryLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__EXTENSION_CONTROLLER_CONNECTED:
				setExtensionControllerConnected((Boolean)newValue);
				return;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__SPEAKER_ENABLED:
				setSpeakerEnabled((Boolean)newValue);
				return;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__CONTINUOUS_REPORTING_ENABLED:
				setContinuousReportingEnabled((Boolean)newValue);
				return;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__LED_ENABLED:
				getLedEnabled().clear();
				getLedEnabled().addAll((Collection<? extends Boolean>)newValue);
				return;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__BATTERY_LEVEL:
				setBatteryLevel((Byte)newValue);
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
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__EXTENSION_CONTROLLER_CONNECTED:
				setExtensionControllerConnected(EXTENSION_CONTROLLER_CONNECTED_EDEFAULT);
				return;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__SPEAKER_ENABLED:
				setSpeakerEnabled(SPEAKER_ENABLED_EDEFAULT);
				return;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__CONTINUOUS_REPORTING_ENABLED:
				setContinuousReportingEnabled(CONTINUOUS_REPORTING_ENABLED_EDEFAULT);
				return;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__LED_ENABLED:
				getLedEnabled().clear();
				return;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__BATTERY_LEVEL:
				setBatteryLevel(BATTERY_LEVEL_EDEFAULT);
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
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__EXTENSION_CONTROLLER_CONNECTED:
				return extensionControllerConnected != EXTENSION_CONTROLLER_CONNECTED_EDEFAULT;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__SPEAKER_ENABLED:
				return speakerEnabled != SPEAKER_ENABLED_EDEFAULT;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__CONTINUOUS_REPORTING_ENABLED:
				return continuousReportingEnabled != CONTINUOUS_REPORTING_ENABLED_EDEFAULT;
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__LED_ENABLED:
				return ledEnabled != null && !ledEnabled.isEmpty();
			case EzwiimotePackage.WII_STATUS_INFO_REPORT__BATTERY_LEVEL:
				return batteryLevel != BATTERY_LEVEL_EDEFAULT;
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
		result.append(" (extensionControllerConnected: ");
		result.append(extensionControllerConnected);
		result.append(", speakerEnabled: ");
		result.append(speakerEnabled);
		result.append(", continuousReportingEnabled: ");
		result.append(continuousReportingEnabled);
		result.append(", ledEnabled: ");
		result.append(ledEnabled);
		result.append(", batteryLevel: ");
		result.append(batteryLevel);
		result.append(')');
		return result.toString();
	}

} //WiiStatusInfoReportImpl
