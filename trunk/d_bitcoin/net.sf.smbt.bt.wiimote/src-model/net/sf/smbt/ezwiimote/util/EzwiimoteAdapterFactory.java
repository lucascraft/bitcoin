/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.util;

import net.sf.smbt.ezwiimote.*;

import net.sf.xqz.model.cmd.Cmd;

import net.sf.xqz.model.cmd.CompoundCmd;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage
 * @generated
 */
public class EzwiimoteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzwiimotePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzwiimoteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzwiimotePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzwiimoteSwitch<Adapter> modelSwitch =
		new EzwiimoteSwitch<Adapter>() {
			@Override
			public Adapter caseWiiCmd(WiiCmd object) {
				return createWiiCmdAdapter();
			}
			@Override
			public Adapter caseWiiEvt(WiiEvt object) {
				return createWiiEvtAdapter();
			}
			@Override
			public Adapter caseWiiReqCmd(WiiReqCmd object) {
				return createWiiReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiMoteReqCmd(WiiMoteReqCmd object) {
				return createWiiMoteReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiRawByteReqCmd(WiiRawByteReqCmd object) {
				return createWiiRawByteReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiReadMemoryReqCmd(WiiReadMemoryReqCmd object) {
				return createWiiReadMemoryReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiReadRegisterReqCmd(WiiReadRegisterReqCmd object) {
				return createWiiReadRegisterReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiCalibrationReqCmd(WiiCalibrationReqCmd object) {
				return createWiiCalibrationReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiPlayerLEDReqCmd(WiiPlayerLEDReqCmd object) {
				return createWiiPlayerLEDReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiReportModeReqCmd(WiiReportModeReqCmd object) {
				return createWiiReportModeReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiRumbleReqCmd(WiiRumbleReqCmd object) {
				return createWiiRumbleReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiStatusInfoReqCmd(WiiStatusInfoReqCmd object) {
				return createWiiStatusInfoReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiRegisterReqCmd(WiiRegisterReqCmd object) {
				return createWiiRegisterReqCmdAdapter();
			}
			@Override
			public Adapter caseWiiCoreButtonEvt(WiiCoreButtonEvt object) {
				return createWiiCoreButtonEvtAdapter();
			}
			@Override
			public Adapter caseWiiDataEvt(WiiDataEvt object) {
				return createWiiDataEvtAdapter();
			}
			@Override
			public Adapter caseWiiExtEvt(WiiExtEvt object) {
				return createWiiExtEvtAdapter();
			}
			@Override
			public Adapter caseWiiIREvt(WiiIREvt object) {
				return createWiiIREvtAdapter();
			}
			@Override
			public Adapter caseWiiDisconectedEvt(WiiDisconectedEvt object) {
				return createWiiDisconectedEvtAdapter();
			}
			@Override
			public Adapter caseWiimoteDevice(WiimoteDevice object) {
				return createWiimoteDeviceAdapter();
			}
			@Override
			public Adapter caseWiiStatusInfoReport(WiiStatusInfoReport object) {
				return createWiiStatusInfoReportAdapter();
			}
			@Override
			public Adapter caseWiiCalibrationDataReport(WiiCalibrationDataReport object) {
				return createWiiCalibrationDataReportAdapter();
			}
			@Override
			public Adapter caseWiiAccelEvt(WiiAccelEvt object) {
				return createWiiAccelEvtAdapter();
			}
			@Override
			public Adapter caseWiiWriteRegisterReq(WiiWriteRegisterReq object) {
				return createWiiWriteRegisterReqAdapter();
			}
			@Override
			public Adapter caseWiiMultiCmd(WiiMultiCmd object) {
				return createWiiMultiCmdAdapter();
			}
			@Override
			public Adapter caseWiiConnectedEvt(WiiConnectedEvt object) {
				return createWiiConnectedEvtAdapter();
			}
			@Override
			public Adapter caseWiiLeftAnalogStickEvent(WiiLeftAnalogStickEvent object) {
				return createWiiLeftAnalogStickEventAdapter();
			}
			@Override
			public Adapter caseWiiRightAnalogStickEvent(WiiRightAnalogStickEvent object) {
				return createWiiRightAnalogStickEventAdapter();
			}
			@Override
			public Adapter caseWiiLeftAnalogTriggerEvent(WiiLeftAnalogTriggerEvent object) {
				return createWiiLeftAnalogTriggerEventAdapter();
			}
			@Override
			public Adapter caseWiiRightAnalogTriggerEvent(WiiRightAnalogTriggerEvent object) {
				return createWiiRightAnalogTriggerEventAdapter();
			}
			@Override
			public Adapter caseWiiAnalogStickEvent(WiiAnalogStickEvent object) {
				return createWiiAnalogStickEventAdapter();
			}
			@Override
			public Adapter caseWiiAnalogTriggerEvent(WiiAnalogTriggerEvent object) {
				return createWiiAnalogTriggerEventAdapter();
			}
			@Override
			public Adapter caseWiiNunchukButtonEvt(WiiNunchukButtonEvt object) {
				return createWiiNunchukButtonEvtAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseCompoundCmd(CompoundCmd object) {
				return createCompoundCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiCmd <em>Wii Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiCmd
	 * @generated
	 */
	public Adapter createWiiCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiEvt <em>Wii Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiEvt
	 * @generated
	 */
	public Adapter createWiiEvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiReqCmd <em>Wii Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiReqCmd
	 * @generated
	 */
	public Adapter createWiiReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiMoteReqCmd <em>Wii Mote Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiMoteReqCmd
	 * @generated
	 */
	public Adapter createWiiMoteReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiRawByteReqCmd <em>Wii Raw Byte Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiRawByteReqCmd
	 * @generated
	 */
	public Adapter createWiiRawByteReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd <em>Wii Read Memory Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd
	 * @generated
	 */
	public Adapter createWiiReadMemoryReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiReadRegisterReqCmd <em>Wii Read Register Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiReadRegisterReqCmd
	 * @generated
	 */
	public Adapter createWiiReadRegisterReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiCalibrationReqCmd <em>Wii Calibration Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationReqCmd
	 * @generated
	 */
	public Adapter createWiiCalibrationReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd <em>Wii Player LED Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd
	 * @generated
	 */
	public Adapter createWiiPlayerLEDReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd <em>Wii Report Mode Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd
	 * @generated
	 */
	public Adapter createWiiReportModeReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiRumbleReqCmd <em>Wii Rumble Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiRumbleReqCmd
	 * @generated
	 */
	public Adapter createWiiRumbleReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReqCmd <em>Wii Status Info Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReqCmd
	 * @generated
	 */
	public Adapter createWiiStatusInfoReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiRegisterReqCmd <em>Wii Register Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiRegisterReqCmd
	 * @generated
	 */
	public Adapter createWiiRegisterReqCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt <em>Wii Core Button Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt
	 * @generated
	 */
	public Adapter createWiiCoreButtonEvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiDataEvt <em>Wii Data Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiDataEvt
	 * @generated
	 */
	public Adapter createWiiDataEvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiExtEvt <em>Wii Ext Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiExtEvt
	 * @generated
	 */
	public Adapter createWiiExtEvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiIREvt <em>Wii IR Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiIREvt
	 * @generated
	 */
	public Adapter createWiiIREvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiDisconectedEvt <em>Wii Disconected Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiDisconectedEvt
	 * @generated
	 */
	public Adapter createWiiDisconectedEvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiimoteDevice <em>Wiimote Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiimoteDevice
	 * @generated
	 */
	public Adapter createWiimoteDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport <em>Wii Status Info Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReport
	 * @generated
	 */
	public Adapter createWiiStatusInfoReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiCalibrationDataReport <em>Wii Calibration Data Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationDataReport
	 * @generated
	 */
	public Adapter createWiiCalibrationDataReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiAccelEvt <em>Wii Accel Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiAccelEvt
	 * @generated
	 */
	public Adapter createWiiAccelEvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiWriteRegisterReq <em>Wii Write Register Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiWriteRegisterReq
	 * @generated
	 */
	public Adapter createWiiWriteRegisterReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiMultiCmd <em>Wii Multi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiMultiCmd
	 * @generated
	 */
	public Adapter createWiiMultiCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiConnectedEvt <em>Wii Connected Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiConnectedEvt
	 * @generated
	 */
	public Adapter createWiiConnectedEvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiLeftAnalogStickEvent <em>Wii Left Analog Stick Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiLeftAnalogStickEvent
	 * @generated
	 */
	public Adapter createWiiLeftAnalogStickEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiRightAnalogStickEvent <em>Wii Right Analog Stick Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiRightAnalogStickEvent
	 * @generated
	 */
	public Adapter createWiiRightAnalogStickEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiLeftAnalogTriggerEvent <em>Wii Left Analog Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiLeftAnalogTriggerEvent
	 * @generated
	 */
	public Adapter createWiiLeftAnalogTriggerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiRightAnalogTriggerEvent <em>Wii Right Analog Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiRightAnalogTriggerEvent
	 * @generated
	 */
	public Adapter createWiiRightAnalogTriggerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiAnalogStickEvent <em>Wii Analog Stick Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiAnalogStickEvent
	 * @generated
	 */
	public Adapter createWiiAnalogStickEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent <em>Wii Analog Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent
	 * @generated
	 */
	public Adapter createWiiAnalogTriggerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt <em>Wii Nunchuk Button Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezwiimote.WiiNunchukButtonEvt
	 * @generated
	 */
	public Adapter createWiiNunchukButtonEvtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.CompoundCmd <em>Compound Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.CompoundCmd
	 * @generated
	 */
	public Adapter createCompoundCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzwiimoteAdapterFactory
