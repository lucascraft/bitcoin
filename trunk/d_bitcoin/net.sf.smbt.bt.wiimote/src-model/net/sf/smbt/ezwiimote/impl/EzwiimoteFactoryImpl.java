/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzwiimoteFactoryImpl extends EFactoryImpl implements EzwiimoteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzwiimoteFactory init() {
		try {
			EzwiimoteFactory theEzwiimoteFactory = (EzwiimoteFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezwiimote/1.0"); 
			if (theEzwiimoteFactory != null) {
				return theEzwiimoteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzwiimoteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzwiimoteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzwiimotePackage.WII_CMD: return createWiiCmd();
			case EzwiimotePackage.WII_EVT: return createWiiEvt();
			case EzwiimotePackage.WII_REQ_CMD: return createWiiReqCmd();
			case EzwiimotePackage.WII_MOTE_REQ_CMD: return createWiiMoteReqCmd();
			case EzwiimotePackage.WII_RAW_BYTE_REQ_CMD: return createWiiRawByteReqCmd();
			case EzwiimotePackage.WII_READ_MEMORY_REQ_CMD: return createWiiReadMemoryReqCmd();
			case EzwiimotePackage.WII_READ_REGISTER_REQ_CMD: return createWiiReadRegisterReqCmd();
			case EzwiimotePackage.WII_CALIBRATION_REQ_CMD: return createWiiCalibrationReqCmd();
			case EzwiimotePackage.WII_PLAYER_LED_REQ_CMD: return createWiiPlayerLEDReqCmd();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD: return createWiiReportModeReqCmd();
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD: return createWiiRumbleReqCmd();
			case EzwiimotePackage.WII_STATUS_INFO_REQ_CMD: return createWiiStatusInfoReqCmd();
			case EzwiimotePackage.WII_REGISTER_REQ_CMD: return createWiiRegisterReqCmd();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT: return createWiiCoreButtonEvt();
			case EzwiimotePackage.WII_DATA_EVT: return createWiiDataEvt();
			case EzwiimotePackage.WII_EXT_EVT: return createWiiExtEvt();
			case EzwiimotePackage.WII_IR_EVT: return createWiiIREvt();
			case EzwiimotePackage.WII_DISCONECTED_EVT: return createWiiDisconectedEvt();
			case EzwiimotePackage.WIIMOTE_DEVICE: return createWiimoteDevice();
			case EzwiimotePackage.WII_STATUS_INFO_REPORT: return createWiiStatusInfoReport();
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT: return createWiiCalibrationDataReport();
			case EzwiimotePackage.WII_ACCEL_EVT: return createWiiAccelEvt();
			case EzwiimotePackage.WII_WRITE_REGISTER_REQ: return createWiiWriteRegisterReq();
			case EzwiimotePackage.WII_MULTI_CMD: return createWiiMultiCmd();
			case EzwiimotePackage.WII_CONNECTED_EVT: return createWiiConnectedEvt();
			case EzwiimotePackage.WII_LEFT_ANALOG_STICK_EVENT: return createWiiLeftAnalogStickEvent();
			case EzwiimotePackage.WII_RIGHT_ANALOG_STICK_EVENT: return createWiiRightAnalogStickEvent();
			case EzwiimotePackage.WII_LEFT_ANALOG_TRIGGER_EVENT: return createWiiLeftAnalogTriggerEvent();
			case EzwiimotePackage.WII_RIGHT_ANALOG_TRIGGER_EVENT: return createWiiRightAnalogTriggerEvent();
			case EzwiimotePackage.WII_ANALOG_STICK_EVENT: return createWiiAnalogStickEvent();
			case EzwiimotePackage.WII_ANALOG_TRIGGER_EVENT: return createWiiAnalogTriggerEvent();
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT: return createWiiNunchukButtonEvt();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzwiimotePackage.IR_CAMERA_MODE:
				return createIrCameraModeFromString(eDataType, initialValue);
			case EzwiimotePackage.BUTTON_CODE:
				return createBUTTON_CODEFromString(eDataType, initialValue);
			case EzwiimotePackage.WII_EXTENSION:
				return createWiiExtensionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzwiimotePackage.IR_CAMERA_MODE:
				return convertIrCameraModeToString(eDataType, instanceValue);
			case EzwiimotePackage.BUTTON_CODE:
				return convertBUTTON_CODEToString(eDataType, instanceValue);
			case EzwiimotePackage.WII_EXTENSION:
				return convertWiiExtensionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiCmd createWiiCmd() {
		WiiCmdImpl wiiCmd = new WiiCmdImpl();
		return wiiCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiEvt createWiiEvt() {
		WiiEvtImpl wiiEvt = new WiiEvtImpl();
		return wiiEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiReqCmd createWiiReqCmd() {
		WiiReqCmdImpl wiiReqCmd = new WiiReqCmdImpl();
		return wiiReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiMoteReqCmd createWiiMoteReqCmd() {
		WiiMoteReqCmdImpl wiiMoteReqCmd = new WiiMoteReqCmdImpl();
		return wiiMoteReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiRawByteReqCmd createWiiRawByteReqCmd() {
		WiiRawByteReqCmdImpl wiiRawByteReqCmd = new WiiRawByteReqCmdImpl();
		return wiiRawByteReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiReadMemoryReqCmd createWiiReadMemoryReqCmd() {
		WiiReadMemoryReqCmdImpl wiiReadMemoryReqCmd = new WiiReadMemoryReqCmdImpl();
		return wiiReadMemoryReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiReadRegisterReqCmd createWiiReadRegisterReqCmd() {
		WiiReadRegisterReqCmdImpl wiiReadRegisterReqCmd = new WiiReadRegisterReqCmdImpl();
		return wiiReadRegisterReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiCalibrationReqCmd createWiiCalibrationReqCmd() {
		WiiCalibrationReqCmdImpl wiiCalibrationReqCmd = new WiiCalibrationReqCmdImpl();
		return wiiCalibrationReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiPlayerLEDReqCmd createWiiPlayerLEDReqCmd() {
		WiiPlayerLEDReqCmdImpl wiiPlayerLEDReqCmd = new WiiPlayerLEDReqCmdImpl();
		return wiiPlayerLEDReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiReportModeReqCmd createWiiReportModeReqCmd() {
		WiiReportModeReqCmdImpl wiiReportModeReqCmd = new WiiReportModeReqCmdImpl();
		return wiiReportModeReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiRumbleReqCmd createWiiRumbleReqCmd() {
		WiiRumbleReqCmdImpl wiiRumbleReqCmd = new WiiRumbleReqCmdImpl();
		return wiiRumbleReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiStatusInfoReqCmd createWiiStatusInfoReqCmd() {
		WiiStatusInfoReqCmdImpl wiiStatusInfoReqCmd = new WiiStatusInfoReqCmdImpl();
		return wiiStatusInfoReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiRegisterReqCmd createWiiRegisterReqCmd() {
		WiiRegisterReqCmdImpl wiiRegisterReqCmd = new WiiRegisterReqCmdImpl();
		return wiiRegisterReqCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiCoreButtonEvt createWiiCoreButtonEvt() {
		WiiCoreButtonEvtImpl wiiCoreButtonEvt = new WiiCoreButtonEvtImpl();
		return wiiCoreButtonEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiDataEvt createWiiDataEvt() {
		WiiDataEvtImpl wiiDataEvt = new WiiDataEvtImpl();
		return wiiDataEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiExtEvt createWiiExtEvt() {
		WiiExtEvtImpl wiiExtEvt = new WiiExtEvtImpl();
		return wiiExtEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiIREvt createWiiIREvt() {
		WiiIREvtImpl wiiIREvt = new WiiIREvtImpl();
		return wiiIREvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiDisconectedEvt createWiiDisconectedEvt() {
		WiiDisconectedEvtImpl wiiDisconectedEvt = new WiiDisconectedEvtImpl();
		return wiiDisconectedEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteDevice createWiimoteDevice() {
		WiimoteDeviceImpl wiimoteDevice = new WiimoteDeviceImpl();
		return wiimoteDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiStatusInfoReport createWiiStatusInfoReport() {
		WiiStatusInfoReportImpl wiiStatusInfoReport = new WiiStatusInfoReportImpl();
		return wiiStatusInfoReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiCalibrationDataReport createWiiCalibrationDataReport() {
		WiiCalibrationDataReportImpl wiiCalibrationDataReport = new WiiCalibrationDataReportImpl();
		return wiiCalibrationDataReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAccelEvt createWiiAccelEvt() {
		WiiAccelEvtImpl wiiAccelEvt = new WiiAccelEvtImpl();
		return wiiAccelEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiWriteRegisterReq createWiiWriteRegisterReq() {
		WiiWriteRegisterReqImpl wiiWriteRegisterReq = new WiiWriteRegisterReqImpl();
		return wiiWriteRegisterReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiMultiCmd createWiiMultiCmd() {
		WiiMultiCmdImpl wiiMultiCmd = new WiiMultiCmdImpl();
		return wiiMultiCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiConnectedEvt createWiiConnectedEvt() {
		WiiConnectedEvtImpl wiiConnectedEvt = new WiiConnectedEvtImpl();
		return wiiConnectedEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiLeftAnalogStickEvent createWiiLeftAnalogStickEvent() {
		WiiLeftAnalogStickEventImpl wiiLeftAnalogStickEvent = new WiiLeftAnalogStickEventImpl();
		return wiiLeftAnalogStickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiRightAnalogStickEvent createWiiRightAnalogStickEvent() {
		WiiRightAnalogStickEventImpl wiiRightAnalogStickEvent = new WiiRightAnalogStickEventImpl();
		return wiiRightAnalogStickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiLeftAnalogTriggerEvent createWiiLeftAnalogTriggerEvent() {
		WiiLeftAnalogTriggerEventImpl wiiLeftAnalogTriggerEvent = new WiiLeftAnalogTriggerEventImpl();
		return wiiLeftAnalogTriggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiRightAnalogTriggerEvent createWiiRightAnalogTriggerEvent() {
		WiiRightAnalogTriggerEventImpl wiiRightAnalogTriggerEvent = new WiiRightAnalogTriggerEventImpl();
		return wiiRightAnalogTriggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAnalogStickEvent createWiiAnalogStickEvent() {
		WiiAnalogStickEventImpl wiiAnalogStickEvent = new WiiAnalogStickEventImpl();
		return wiiAnalogStickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAnalogTriggerEvent createWiiAnalogTriggerEvent() {
		WiiAnalogTriggerEventImpl wiiAnalogTriggerEvent = new WiiAnalogTriggerEventImpl();
		return wiiAnalogTriggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiNunchukButtonEvt createWiiNunchukButtonEvt() {
		WiiNunchukButtonEvtImpl wiiNunchukButtonEvt = new WiiNunchukButtonEvtImpl();
		return wiiNunchukButtonEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrCameraMode createIrCameraModeFromString(EDataType eDataType, String initialValue) {
		IrCameraMode result = IrCameraMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIrCameraModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUTTON_CODE createBUTTON_CODEFromString(EDataType eDataType, String initialValue) {
		BUTTON_CODE result = BUTTON_CODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBUTTON_CODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createWiiExtensionFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWiiExtensionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzwiimotePackage getEzwiimotePackage() {
		return (EzwiimotePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzwiimotePackage getPackage() {
		return EzwiimotePackage.eINSTANCE;
	}

} //EzwiimoteFactoryImpl
