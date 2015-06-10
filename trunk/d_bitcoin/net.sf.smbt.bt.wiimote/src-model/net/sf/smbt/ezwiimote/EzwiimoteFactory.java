/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage
 * @generated
 */
public interface EzwiimoteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzwiimoteFactory eINSTANCE = net.sf.smbt.ezwiimote.impl.EzwiimoteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wii Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Cmd</em>'.
	 * @generated
	 */
	WiiCmd createWiiCmd();

	/**
	 * Returns a new object of class '<em>Wii Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Evt</em>'.
	 * @generated
	 */
	WiiEvt createWiiEvt();

	/**
	 * Returns a new object of class '<em>Wii Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Req Cmd</em>'.
	 * @generated
	 */
	WiiReqCmd createWiiReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Mote Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Mote Req Cmd</em>'.
	 * @generated
	 */
	WiiMoteReqCmd createWiiMoteReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Raw Byte Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Raw Byte Req Cmd</em>'.
	 * @generated
	 */
	WiiRawByteReqCmd createWiiRawByteReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Read Memory Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Read Memory Req Cmd</em>'.
	 * @generated
	 */
	WiiReadMemoryReqCmd createWiiReadMemoryReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Read Register Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Read Register Req Cmd</em>'.
	 * @generated
	 */
	WiiReadRegisterReqCmd createWiiReadRegisterReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Calibration Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Calibration Req Cmd</em>'.
	 * @generated
	 */
	WiiCalibrationReqCmd createWiiCalibrationReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Player LED Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Player LED Req Cmd</em>'.
	 * @generated
	 */
	WiiPlayerLEDReqCmd createWiiPlayerLEDReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Report Mode Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Report Mode Req Cmd</em>'.
	 * @generated
	 */
	WiiReportModeReqCmd createWiiReportModeReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Rumble Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Rumble Req Cmd</em>'.
	 * @generated
	 */
	WiiRumbleReqCmd createWiiRumbleReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Status Info Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Status Info Req Cmd</em>'.
	 * @generated
	 */
	WiiStatusInfoReqCmd createWiiStatusInfoReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Register Req Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Register Req Cmd</em>'.
	 * @generated
	 */
	WiiRegisterReqCmd createWiiRegisterReqCmd();

	/**
	 * Returns a new object of class '<em>Wii Core Button Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Core Button Evt</em>'.
	 * @generated
	 */
	WiiCoreButtonEvt createWiiCoreButtonEvt();

	/**
	 * Returns a new object of class '<em>Wii Data Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Data Evt</em>'.
	 * @generated
	 */
	WiiDataEvt createWiiDataEvt();

	/**
	 * Returns a new object of class '<em>Wii Ext Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Ext Evt</em>'.
	 * @generated
	 */
	WiiExtEvt createWiiExtEvt();

	/**
	 * Returns a new object of class '<em>Wii IR Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii IR Evt</em>'.
	 * @generated
	 */
	WiiIREvt createWiiIREvt();

	/**
	 * Returns a new object of class '<em>Wii Disconected Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Disconected Evt</em>'.
	 * @generated
	 */
	WiiDisconectedEvt createWiiDisconectedEvt();

	/**
	 * Returns a new object of class '<em>Wiimote Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wiimote Device</em>'.
	 * @generated
	 */
	WiimoteDevice createWiimoteDevice();

	/**
	 * Returns a new object of class '<em>Wii Status Info Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Status Info Report</em>'.
	 * @generated
	 */
	WiiStatusInfoReport createWiiStatusInfoReport();

	/**
	 * Returns a new object of class '<em>Wii Calibration Data Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Calibration Data Report</em>'.
	 * @generated
	 */
	WiiCalibrationDataReport createWiiCalibrationDataReport();

	/**
	 * Returns a new object of class '<em>Wii Accel Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Accel Evt</em>'.
	 * @generated
	 */
	WiiAccelEvt createWiiAccelEvt();

	/**
	 * Returns a new object of class '<em>Wii Write Register Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Write Register Req</em>'.
	 * @generated
	 */
	WiiWriteRegisterReq createWiiWriteRegisterReq();

	/**
	 * Returns a new object of class '<em>Wii Multi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Multi Cmd</em>'.
	 * @generated
	 */
	WiiMultiCmd createWiiMultiCmd();

	/**
	 * Returns a new object of class '<em>Wii Connected Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Connected Evt</em>'.
	 * @generated
	 */
	WiiConnectedEvt createWiiConnectedEvt();

	/**
	 * Returns a new object of class '<em>Wii Left Analog Stick Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Left Analog Stick Event</em>'.
	 * @generated
	 */
	WiiLeftAnalogStickEvent createWiiLeftAnalogStickEvent();

	/**
	 * Returns a new object of class '<em>Wii Right Analog Stick Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Right Analog Stick Event</em>'.
	 * @generated
	 */
	WiiRightAnalogStickEvent createWiiRightAnalogStickEvent();

	/**
	 * Returns a new object of class '<em>Wii Left Analog Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Left Analog Trigger Event</em>'.
	 * @generated
	 */
	WiiLeftAnalogTriggerEvent createWiiLeftAnalogTriggerEvent();

	/**
	 * Returns a new object of class '<em>Wii Right Analog Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Right Analog Trigger Event</em>'.
	 * @generated
	 */
	WiiRightAnalogTriggerEvent createWiiRightAnalogTriggerEvent();

	/**
	 * Returns a new object of class '<em>Wii Analog Stick Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Analog Stick Event</em>'.
	 * @generated
	 */
	WiiAnalogStickEvent createWiiAnalogStickEvent();

	/**
	 * Returns a new object of class '<em>Wii Analog Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Analog Trigger Event</em>'.
	 * @generated
	 */
	WiiAnalogTriggerEvent createWiiAnalogTriggerEvent();

	/**
	 * Returns a new object of class '<em>Wii Nunchuk Button Evt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Nunchuk Button Evt</em>'.
	 * @generated
	 */
	WiiNunchukButtonEvt createWiiNunchukButtonEvt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzwiimotePackage getEzwiimotePackage();

} //EzwiimoteFactory
