/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.ZCX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZCX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getFirmware <em>Firmware</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getJobsQueue <em>Jobs Queue</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getResultsQueue <em>Results Queue</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getXlinkMode <em>Xlink Mode</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getXlinkStatus <em>Xlink Status</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getDevicesInChain <em>Devices In Chain</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZCXImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZCXImpl extends BFLCmdImpl implements ZCX {
	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected String device = DEVICE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFirmware() <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmware()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRMWARE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFirmware() <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmware()
	 * @generated
	 * @ordered
	 */
	protected String firmware = FIRMWARE_EDEFAULT;
	/**
	 * The default value of the '{@link #getEngines() <em>Engines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected String engines = ENGINES_EDEFAULT;
	/**
	 * The default value of the '{@link #getJobsQueue() <em>Jobs Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobsQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String JOBS_QUEUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJobsQueue() <em>Jobs Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobsQueue()
	 * @generated
	 * @ordered
	 */
	protected String jobsQueue = JOBS_QUEUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getResultsQueue() <em>Results Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULTS_QUEUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResultsQueue() <em>Results Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsQueue()
	 * @generated
	 * @ordered
	 */
	protected String resultsQueue = RESULTS_QUEUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getXlinkMode() <em>Xlink Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlinkMode()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_MODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getXlinkMode() <em>Xlink Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlinkMode()
	 * @generated
	 * @ordered
	 */
	protected String xlinkMode = XLINK_MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getXlinkStatus() <em>Xlink Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlinkStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_STATUS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getXlinkStatus() <em>Xlink Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlinkStatus()
	 * @generated
	 * @ordered
	 */
	protected String xlinkStatus = XLINK_STATUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDevicesInChain() <em>Devices In Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicesInChain()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICES_IN_CHAIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDevicesInChain() <em>Devices In Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicesInChain()
	 * @generated
	 * @ordered
	 */
	protected String devicesInChain = DEVICES_IN_CHAIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZCXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.ZCX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(String newDevice) {
		String oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirmware() {
		return firmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmware(String newFirmware) {
		String oldFirmware = firmware;
		firmware = newFirmware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__FIRMWARE, oldFirmware, firmware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngines() {
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngines(String newEngines) {
		String oldEngines = engines;
		engines = newEngines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__ENGINES, oldEngines, engines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobsQueue() {
		return jobsQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobsQueue(String newJobsQueue) {
		String oldJobsQueue = jobsQueue;
		jobsQueue = newJobsQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__JOBS_QUEUE, oldJobsQueue, jobsQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultsQueue() {
		return resultsQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultsQueue(String newResultsQueue) {
		String oldResultsQueue = resultsQueue;
		resultsQueue = newResultsQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__RESULTS_QUEUE, oldResultsQueue, resultsQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlinkMode() {
		return xlinkMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlinkMode(String newXlinkMode) {
		String oldXlinkMode = xlinkMode;
		xlinkMode = newXlinkMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__XLINK_MODE, oldXlinkMode, xlinkMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlinkStatus() {
		return xlinkStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlinkStatus(String newXlinkStatus) {
		String oldXlinkStatus = xlinkStatus;
		xlinkStatus = newXlinkStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__XLINK_STATUS, oldXlinkStatus, xlinkStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevicesInChain() {
		return devicesInChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevicesInChain(String newDevicesInChain) {
		String oldDevicesInChain = devicesInChain;
		devicesInChain = newDevicesInChain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__DEVICES_IN_CHAIN, oldDevicesInChain, devicesInChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZCX__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.ZCX__DEVICE:
				return getDevice();
			case Bitforcev2Package.ZCX__FIRMWARE:
				return getFirmware();
			case Bitforcev2Package.ZCX__ENGINES:
				return getEngines();
			case Bitforcev2Package.ZCX__JOBS_QUEUE:
				return getJobsQueue();
			case Bitforcev2Package.ZCX__RESULTS_QUEUE:
				return getResultsQueue();
			case Bitforcev2Package.ZCX__XLINK_MODE:
				return getXlinkMode();
			case Bitforcev2Package.ZCX__XLINK_STATUS:
				return getXlinkStatus();
			case Bitforcev2Package.ZCX__DEVICES_IN_CHAIN:
				return getDevicesInChain();
			case Bitforcev2Package.ZCX__STATUS:
				return getStatus();
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
			case Bitforcev2Package.ZCX__DEVICE:
				setDevice((String)newValue);
				return;
			case Bitforcev2Package.ZCX__FIRMWARE:
				setFirmware((String)newValue);
				return;
			case Bitforcev2Package.ZCX__ENGINES:
				setEngines((String)newValue);
				return;
			case Bitforcev2Package.ZCX__JOBS_QUEUE:
				setJobsQueue((String)newValue);
				return;
			case Bitforcev2Package.ZCX__RESULTS_QUEUE:
				setResultsQueue((String)newValue);
				return;
			case Bitforcev2Package.ZCX__XLINK_MODE:
				setXlinkMode((String)newValue);
				return;
			case Bitforcev2Package.ZCX__XLINK_STATUS:
				setXlinkStatus((String)newValue);
				return;
			case Bitforcev2Package.ZCX__DEVICES_IN_CHAIN:
				setDevicesInChain((String)newValue);
				return;
			case Bitforcev2Package.ZCX__STATUS:
				setStatus((String)newValue);
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
			case Bitforcev2Package.ZCX__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case Bitforcev2Package.ZCX__FIRMWARE:
				setFirmware(FIRMWARE_EDEFAULT);
				return;
			case Bitforcev2Package.ZCX__ENGINES:
				setEngines(ENGINES_EDEFAULT);
				return;
			case Bitforcev2Package.ZCX__JOBS_QUEUE:
				setJobsQueue(JOBS_QUEUE_EDEFAULT);
				return;
			case Bitforcev2Package.ZCX__RESULTS_QUEUE:
				setResultsQueue(RESULTS_QUEUE_EDEFAULT);
				return;
			case Bitforcev2Package.ZCX__XLINK_MODE:
				setXlinkMode(XLINK_MODE_EDEFAULT);
				return;
			case Bitforcev2Package.ZCX__XLINK_STATUS:
				setXlinkStatus(XLINK_STATUS_EDEFAULT);
				return;
			case Bitforcev2Package.ZCX__DEVICES_IN_CHAIN:
				setDevicesInChain(DEVICES_IN_CHAIN_EDEFAULT);
				return;
			case Bitforcev2Package.ZCX__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case Bitforcev2Package.ZCX__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case Bitforcev2Package.ZCX__FIRMWARE:
				return FIRMWARE_EDEFAULT == null ? firmware != null : !FIRMWARE_EDEFAULT.equals(firmware);
			case Bitforcev2Package.ZCX__ENGINES:
				return ENGINES_EDEFAULT == null ? engines != null : !ENGINES_EDEFAULT.equals(engines);
			case Bitforcev2Package.ZCX__JOBS_QUEUE:
				return JOBS_QUEUE_EDEFAULT == null ? jobsQueue != null : !JOBS_QUEUE_EDEFAULT.equals(jobsQueue);
			case Bitforcev2Package.ZCX__RESULTS_QUEUE:
				return RESULTS_QUEUE_EDEFAULT == null ? resultsQueue != null : !RESULTS_QUEUE_EDEFAULT.equals(resultsQueue);
			case Bitforcev2Package.ZCX__XLINK_MODE:
				return XLINK_MODE_EDEFAULT == null ? xlinkMode != null : !XLINK_MODE_EDEFAULT.equals(xlinkMode);
			case Bitforcev2Package.ZCX__XLINK_STATUS:
				return XLINK_STATUS_EDEFAULT == null ? xlinkStatus != null : !XLINK_STATUS_EDEFAULT.equals(xlinkStatus);
			case Bitforcev2Package.ZCX__DEVICES_IN_CHAIN:
				return DEVICES_IN_CHAIN_EDEFAULT == null ? devicesInChain != null : !DEVICES_IN_CHAIN_EDEFAULT.equals(devicesInChain);
			case Bitforcev2Package.ZCX__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (device: ");
		result.append(device);
		result.append(", firmware: ");
		result.append(firmware);
		result.append(", engines: ");
		result.append(engines);
		result.append(", jobsQueue: ");
		result.append(jobsQueue);
		result.append(", resultsQueue: ");
		result.append(resultsQueue);
		result.append(", xlinkMode: ");
		result.append(xlinkMode);
		result.append(", xlinkStatus: ");
		result.append(xlinkStatus);
		result.append(", devicesInChain: ");
		result.append(devicesInChain);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ZCXImpl
