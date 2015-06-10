/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.util;

import java.util.List;

import net.sf.smbt.ezwiimote.*;

import net.sf.xqz.model.cmd.Cmd;

import net.sf.xqz.model.cmd.CompoundCmd;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage
 * @generated
 */
public class EzwiimoteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzwiimotePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzwiimoteSwitch() {
		if (modelPackage == null) {
			modelPackage = EzwiimotePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzwiimotePackage.WII_CMD: {
				WiiCmd wiiCmd = (WiiCmd)theEObject;
				T result = caseWiiCmd(wiiCmd);
				if (result == null) result = caseCmd(wiiCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_EVT: {
				WiiEvt wiiEvt = (WiiEvt)theEObject;
				T result = caseWiiEvt(wiiEvt);
				if (result == null) result = caseWiiCmd(wiiEvt);
				if (result == null) result = caseCmd(wiiEvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_REQ_CMD: {
				WiiReqCmd wiiReqCmd = (WiiReqCmd)theEObject;
				T result = caseWiiReqCmd(wiiReqCmd);
				if (result == null) result = caseWiiCmd(wiiReqCmd);
				if (result == null) result = caseCmd(wiiReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_MOTE_REQ_CMD: {
				WiiMoteReqCmd wiiMoteReqCmd = (WiiMoteReqCmd)theEObject;
				T result = caseWiiMoteReqCmd(wiiMoteReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiMoteReqCmd);
				if (result == null) result = caseWiiCmd(wiiMoteReqCmd);
				if (result == null) result = caseCmd(wiiMoteReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_RAW_BYTE_REQ_CMD: {
				WiiRawByteReqCmd wiiRawByteReqCmd = (WiiRawByteReqCmd)theEObject;
				T result = caseWiiRawByteReqCmd(wiiRawByteReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiRawByteReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiRawByteReqCmd);
				if (result == null) result = caseWiiCmd(wiiRawByteReqCmd);
				if (result == null) result = caseCmd(wiiRawByteReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_READ_MEMORY_REQ_CMD: {
				WiiReadMemoryReqCmd wiiReadMemoryReqCmd = (WiiReadMemoryReqCmd)theEObject;
				T result = caseWiiReadMemoryReqCmd(wiiReadMemoryReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiReadMemoryReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiReadMemoryReqCmd);
				if (result == null) result = caseWiiCmd(wiiReadMemoryReqCmd);
				if (result == null) result = caseCmd(wiiReadMemoryReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_READ_REGISTER_REQ_CMD: {
				WiiReadRegisterReqCmd wiiReadRegisterReqCmd = (WiiReadRegisterReqCmd)theEObject;
				T result = caseWiiReadRegisterReqCmd(wiiReadRegisterReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiReadRegisterReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiReadRegisterReqCmd);
				if (result == null) result = caseWiiCmd(wiiReadRegisterReqCmd);
				if (result == null) result = caseCmd(wiiReadRegisterReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_CALIBRATION_REQ_CMD: {
				WiiCalibrationReqCmd wiiCalibrationReqCmd = (WiiCalibrationReqCmd)theEObject;
				T result = caseWiiCalibrationReqCmd(wiiCalibrationReqCmd);
				if (result == null) result = caseWiiReadMemoryReqCmd(wiiCalibrationReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiCalibrationReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiCalibrationReqCmd);
				if (result == null) result = caseWiiCmd(wiiCalibrationReqCmd);
				if (result == null) result = caseCmd(wiiCalibrationReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_PLAYER_LED_REQ_CMD: {
				WiiPlayerLEDReqCmd wiiPlayerLEDReqCmd = (WiiPlayerLEDReqCmd)theEObject;
				T result = caseWiiPlayerLEDReqCmd(wiiPlayerLEDReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiPlayerLEDReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiPlayerLEDReqCmd);
				if (result == null) result = caseWiiCmd(wiiPlayerLEDReqCmd);
				if (result == null) result = caseCmd(wiiPlayerLEDReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD: {
				WiiReportModeReqCmd wiiReportModeReqCmd = (WiiReportModeReqCmd)theEObject;
				T result = caseWiiReportModeReqCmd(wiiReportModeReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiReportModeReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiReportModeReqCmd);
				if (result == null) result = caseWiiCmd(wiiReportModeReqCmd);
				if (result == null) result = caseCmd(wiiReportModeReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_RUMBLE_REQ_CMD: {
				WiiRumbleReqCmd wiiRumbleReqCmd = (WiiRumbleReqCmd)theEObject;
				T result = caseWiiRumbleReqCmd(wiiRumbleReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiRumbleReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiRumbleReqCmd);
				if (result == null) result = caseWiiCmd(wiiRumbleReqCmd);
				if (result == null) result = caseCmd(wiiRumbleReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_STATUS_INFO_REQ_CMD: {
				WiiStatusInfoReqCmd wiiStatusInfoReqCmd = (WiiStatusInfoReqCmd)theEObject;
				T result = caseWiiStatusInfoReqCmd(wiiStatusInfoReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiStatusInfoReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiStatusInfoReqCmd);
				if (result == null) result = caseWiiCmd(wiiStatusInfoReqCmd);
				if (result == null) result = caseCmd(wiiStatusInfoReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_REGISTER_REQ_CMD: {
				WiiRegisterReqCmd wiiRegisterReqCmd = (WiiRegisterReqCmd)theEObject;
				T result = caseWiiRegisterReqCmd(wiiRegisterReqCmd);
				if (result == null) result = caseWiiMoteReqCmd(wiiRegisterReqCmd);
				if (result == null) result = caseWiiReqCmd(wiiRegisterReqCmd);
				if (result == null) result = caseWiiCmd(wiiRegisterReqCmd);
				if (result == null) result = caseCmd(wiiRegisterReqCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_CORE_BUTTON_EVT: {
				WiiCoreButtonEvt wiiCoreButtonEvt = (WiiCoreButtonEvt)theEObject;
				T result = caseWiiCoreButtonEvt(wiiCoreButtonEvt);
				if (result == null) result = caseWiiEvt(wiiCoreButtonEvt);
				if (result == null) result = caseWiiCmd(wiiCoreButtonEvt);
				if (result == null) result = caseCmd(wiiCoreButtonEvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_DATA_EVT: {
				WiiDataEvt wiiDataEvt = (WiiDataEvt)theEObject;
				T result = caseWiiDataEvt(wiiDataEvt);
				if (result == null) result = caseWiiEvt(wiiDataEvt);
				if (result == null) result = caseWiiCmd(wiiDataEvt);
				if (result == null) result = caseCmd(wiiDataEvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_EXT_EVT: {
				WiiExtEvt wiiExtEvt = (WiiExtEvt)theEObject;
				T result = caseWiiExtEvt(wiiExtEvt);
				if (result == null) result = caseWiiEvt(wiiExtEvt);
				if (result == null) result = caseWiiCmd(wiiExtEvt);
				if (result == null) result = caseCmd(wiiExtEvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_IR_EVT: {
				WiiIREvt wiiIREvt = (WiiIREvt)theEObject;
				T result = caseWiiIREvt(wiiIREvt);
				if (result == null) result = caseWiiEvt(wiiIREvt);
				if (result == null) result = caseWiiCmd(wiiIREvt);
				if (result == null) result = caseCmd(wiiIREvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_DISCONECTED_EVT: {
				WiiDisconectedEvt wiiDisconectedEvt = (WiiDisconectedEvt)theEObject;
				T result = caseWiiDisconectedEvt(wiiDisconectedEvt);
				if (result == null) result = caseWiiEvt(wiiDisconectedEvt);
				if (result == null) result = caseWiiCmd(wiiDisconectedEvt);
				if (result == null) result = caseCmd(wiiDisconectedEvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WIIMOTE_DEVICE: {
				WiimoteDevice wiimoteDevice = (WiimoteDevice)theEObject;
				T result = caseWiimoteDevice(wiimoteDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_STATUS_INFO_REPORT: {
				WiiStatusInfoReport wiiStatusInfoReport = (WiiStatusInfoReport)theEObject;
				T result = caseWiiStatusInfoReport(wiiStatusInfoReport);
				if (result == null) result = caseWiiCmd(wiiStatusInfoReport);
				if (result == null) result = caseCmd(wiiStatusInfoReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT: {
				WiiCalibrationDataReport wiiCalibrationDataReport = (WiiCalibrationDataReport)theEObject;
				T result = caseWiiCalibrationDataReport(wiiCalibrationDataReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_ACCEL_EVT: {
				WiiAccelEvt wiiAccelEvt = (WiiAccelEvt)theEObject;
				T result = caseWiiAccelEvt(wiiAccelEvt);
				if (result == null) result = caseWiiEvt(wiiAccelEvt);
				if (result == null) result = caseWiiCmd(wiiAccelEvt);
				if (result == null) result = caseCmd(wiiAccelEvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_WRITE_REGISTER_REQ: {
				WiiWriteRegisterReq wiiWriteRegisterReq = (WiiWriteRegisterReq)theEObject;
				T result = caseWiiWriteRegisterReq(wiiWriteRegisterReq);
				if (result == null) result = caseWiiMoteReqCmd(wiiWriteRegisterReq);
				if (result == null) result = caseWiiReqCmd(wiiWriteRegisterReq);
				if (result == null) result = caseWiiCmd(wiiWriteRegisterReq);
				if (result == null) result = caseCmd(wiiWriteRegisterReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_MULTI_CMD: {
				WiiMultiCmd wiiMultiCmd = (WiiMultiCmd)theEObject;
				T result = caseWiiMultiCmd(wiiMultiCmd);
				if (result == null) result = caseWiiCmd(wiiMultiCmd);
				if (result == null) result = caseCompoundCmd(wiiMultiCmd);
				if (result == null) result = caseCmd(wiiMultiCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_CONNECTED_EVT: {
				WiiConnectedEvt wiiConnectedEvt = (WiiConnectedEvt)theEObject;
				T result = caseWiiConnectedEvt(wiiConnectedEvt);
				if (result == null) result = caseWiiEvt(wiiConnectedEvt);
				if (result == null) result = caseWiiCmd(wiiConnectedEvt);
				if (result == null) result = caseCmd(wiiConnectedEvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_LEFT_ANALOG_STICK_EVENT: {
				WiiLeftAnalogStickEvent wiiLeftAnalogStickEvent = (WiiLeftAnalogStickEvent)theEObject;
				T result = caseWiiLeftAnalogStickEvent(wiiLeftAnalogStickEvent);
				if (result == null) result = caseWiiAnalogStickEvent(wiiLeftAnalogStickEvent);
				if (result == null) result = caseWiiExtEvt(wiiLeftAnalogStickEvent);
				if (result == null) result = caseWiiEvt(wiiLeftAnalogStickEvent);
				if (result == null) result = caseWiiCmd(wiiLeftAnalogStickEvent);
				if (result == null) result = caseCmd(wiiLeftAnalogStickEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_RIGHT_ANALOG_STICK_EVENT: {
				WiiRightAnalogStickEvent wiiRightAnalogStickEvent = (WiiRightAnalogStickEvent)theEObject;
				T result = caseWiiRightAnalogStickEvent(wiiRightAnalogStickEvent);
				if (result == null) result = caseWiiAnalogStickEvent(wiiRightAnalogStickEvent);
				if (result == null) result = caseWiiExtEvt(wiiRightAnalogStickEvent);
				if (result == null) result = caseWiiEvt(wiiRightAnalogStickEvent);
				if (result == null) result = caseWiiCmd(wiiRightAnalogStickEvent);
				if (result == null) result = caseCmd(wiiRightAnalogStickEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_LEFT_ANALOG_TRIGGER_EVENT: {
				WiiLeftAnalogTriggerEvent wiiLeftAnalogTriggerEvent = (WiiLeftAnalogTriggerEvent)theEObject;
				T result = caseWiiLeftAnalogTriggerEvent(wiiLeftAnalogTriggerEvent);
				if (result == null) result = caseWiiAnalogTriggerEvent(wiiLeftAnalogTriggerEvent);
				if (result == null) result = caseWiiExtEvt(wiiLeftAnalogTriggerEvent);
				if (result == null) result = caseWiiEvt(wiiLeftAnalogTriggerEvent);
				if (result == null) result = caseWiiCmd(wiiLeftAnalogTriggerEvent);
				if (result == null) result = caseCmd(wiiLeftAnalogTriggerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_RIGHT_ANALOG_TRIGGER_EVENT: {
				WiiRightAnalogTriggerEvent wiiRightAnalogTriggerEvent = (WiiRightAnalogTriggerEvent)theEObject;
				T result = caseWiiRightAnalogTriggerEvent(wiiRightAnalogTriggerEvent);
				if (result == null) result = caseWiiAnalogTriggerEvent(wiiRightAnalogTriggerEvent);
				if (result == null) result = caseWiiExtEvt(wiiRightAnalogTriggerEvent);
				if (result == null) result = caseWiiEvt(wiiRightAnalogTriggerEvent);
				if (result == null) result = caseWiiCmd(wiiRightAnalogTriggerEvent);
				if (result == null) result = caseCmd(wiiRightAnalogTriggerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_ANALOG_STICK_EVENT: {
				WiiAnalogStickEvent wiiAnalogStickEvent = (WiiAnalogStickEvent)theEObject;
				T result = caseWiiAnalogStickEvent(wiiAnalogStickEvent);
				if (result == null) result = caseWiiExtEvt(wiiAnalogStickEvent);
				if (result == null) result = caseWiiEvt(wiiAnalogStickEvent);
				if (result == null) result = caseWiiCmd(wiiAnalogStickEvent);
				if (result == null) result = caseCmd(wiiAnalogStickEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_ANALOG_TRIGGER_EVENT: {
				WiiAnalogTriggerEvent wiiAnalogTriggerEvent = (WiiAnalogTriggerEvent)theEObject;
				T result = caseWiiAnalogTriggerEvent(wiiAnalogTriggerEvent);
				if (result == null) result = caseWiiExtEvt(wiiAnalogTriggerEvent);
				if (result == null) result = caseWiiEvt(wiiAnalogTriggerEvent);
				if (result == null) result = caseWiiCmd(wiiAnalogTriggerEvent);
				if (result == null) result = caseCmd(wiiAnalogTriggerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT: {
				WiiNunchukButtonEvt wiiNunchukButtonEvt = (WiiNunchukButtonEvt)theEObject;
				T result = caseWiiNunchukButtonEvt(wiiNunchukButtonEvt);
				if (result == null) result = caseWiiEvt(wiiNunchukButtonEvt);
				if (result == null) result = caseWiiCmd(wiiNunchukButtonEvt);
				if (result == null) result = caseCmd(wiiNunchukButtonEvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiCmd(WiiCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiEvt(WiiEvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiReqCmd(WiiReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Mote Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Mote Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiMoteReqCmd(WiiMoteReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Raw Byte Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Raw Byte Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiRawByteReqCmd(WiiRawByteReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Read Memory Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Read Memory Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiReadMemoryReqCmd(WiiReadMemoryReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Read Register Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Read Register Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiReadRegisterReqCmd(WiiReadRegisterReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Calibration Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Calibration Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiCalibrationReqCmd(WiiCalibrationReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Player LED Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Player LED Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiPlayerLEDReqCmd(WiiPlayerLEDReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Report Mode Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Report Mode Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiReportModeReqCmd(WiiReportModeReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Rumble Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Rumble Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiRumbleReqCmd(WiiRumbleReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Status Info Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Status Info Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiStatusInfoReqCmd(WiiStatusInfoReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Register Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Register Req Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiRegisterReqCmd(WiiRegisterReqCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Core Button Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Core Button Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiCoreButtonEvt(WiiCoreButtonEvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Data Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Data Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiDataEvt(WiiDataEvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Ext Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Ext Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiExtEvt(WiiExtEvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii IR Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii IR Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiIREvt(WiiIREvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Disconected Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Disconected Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiDisconectedEvt(WiiDisconectedEvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wiimote Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wiimote Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiimoteDevice(WiimoteDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Status Info Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Status Info Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiStatusInfoReport(WiiStatusInfoReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Calibration Data Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Calibration Data Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiCalibrationDataReport(WiiCalibrationDataReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Accel Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Accel Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiAccelEvt(WiiAccelEvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Write Register Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Write Register Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiWriteRegisterReq(WiiWriteRegisterReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Multi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Multi Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiMultiCmd(WiiMultiCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Connected Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Connected Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiConnectedEvt(WiiConnectedEvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Left Analog Stick Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Left Analog Stick Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiLeftAnalogStickEvent(WiiLeftAnalogStickEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Right Analog Stick Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Right Analog Stick Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiRightAnalogStickEvent(WiiRightAnalogStickEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Left Analog Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Left Analog Trigger Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiLeftAnalogTriggerEvent(WiiLeftAnalogTriggerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Right Analog Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Right Analog Trigger Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiRightAnalogTriggerEvent(WiiRightAnalogTriggerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Analog Stick Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Analog Stick Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiAnalogStickEvent(WiiAnalogStickEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Analog Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Analog Trigger Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiAnalogTriggerEvent(WiiAnalogTriggerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Nunchuk Button Evt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Nunchuk Button Evt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiNunchukButtonEvt(WiiNunchukButtonEvt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundCmd(CompoundCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzwiimoteSwitch
