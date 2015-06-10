/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimoteFactory;
import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.IrCameraMode;
import net.sf.smbt.ezwiimote.WiiAccelEvt;
import net.sf.smbt.ezwiimote.WiiAnalogStickEvent;
import net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent;
import net.sf.smbt.ezwiimote.WiiCalibrationDataReport;
import net.sf.smbt.ezwiimote.WiiCalibrationReqCmd;
import net.sf.smbt.ezwiimote.WiiCmd;
import net.sf.smbt.ezwiimote.WiiConnectedEvt;
import net.sf.smbt.ezwiimote.WiiCoreButtonEvt;
import net.sf.smbt.ezwiimote.WiiDataEvt;
import net.sf.smbt.ezwiimote.WiiDisconectedEvt;
import net.sf.smbt.ezwiimote.WiiEvt;
import net.sf.smbt.ezwiimote.WiiExtEvt;
import net.sf.smbt.ezwiimote.WiiIREvt;
import net.sf.smbt.ezwiimote.WiiLeftAnalogStickEvent;
import net.sf.smbt.ezwiimote.WiiLeftAnalogTriggerEvent;
import net.sf.smbt.ezwiimote.WiiMoteReqCmd;
import net.sf.smbt.ezwiimote.WiiMultiCmd;
import net.sf.smbt.ezwiimote.WiiNunchukButtonEvt;
import net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd;
import net.sf.smbt.ezwiimote.WiiRawByteReqCmd;
import net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd;
import net.sf.smbt.ezwiimote.WiiReadRegisterReqCmd;
import net.sf.smbt.ezwiimote.WiiRegisterReqCmd;
import net.sf.smbt.ezwiimote.WiiReportModeReqCmd;
import net.sf.smbt.ezwiimote.WiiReqCmd;
import net.sf.smbt.ezwiimote.WiiRightAnalogStickEvent;
import net.sf.smbt.ezwiimote.WiiRightAnalogTriggerEvent;
import net.sf.smbt.ezwiimote.WiiRumbleReqCmd;
import net.sf.smbt.ezwiimote.WiiStatusInfoReport;
import net.sf.smbt.ezwiimote.WiiStatusInfoReqCmd;
import net.sf.smbt.ezwiimote.WiiWriteRegisterReq;
import net.sf.smbt.ezwiimote.WiimoteDevice;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzwiimotePackageImpl extends EPackageImpl implements EzwiimotePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiEvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiMoteReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiRawByteReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiReadMemoryReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiReadRegisterReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiCalibrationReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiPlayerLEDReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiReportModeReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiRumbleReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiStatusInfoReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiRegisterReqCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiCoreButtonEvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiDataEvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiExtEvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiIREvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiDisconectedEvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiimoteDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiStatusInfoReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiCalibrationDataReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiAccelEvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiWriteRegisterReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiMultiCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiConnectedEvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiLeftAnalogStickEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiRightAnalogStickEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiLeftAnalogTriggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiRightAnalogTriggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiAnalogStickEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiAnalogTriggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiNunchukButtonEvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum irCameraModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buttoN_CODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wiiExtensionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzwiimotePackageImpl() {
		super(eNS_URI, EzwiimoteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzwiimotePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzwiimotePackage init() {
		if (isInited) return (EzwiimotePackage)EPackage.Registry.INSTANCE.getEPackage(EzwiimotePackage.eNS_URI);

		// Obtain or create and register package
		EzwiimotePackageImpl theEzwiimotePackage = (EzwiimotePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzwiimotePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzwiimotePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzwiimotePackage.createPackageContents();

		// Initialize created meta-data
		theEzwiimotePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzwiimotePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzwiimotePackage.eNS_URI, theEzwiimotePackage);
		return theEzwiimotePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiCmd() {
		return wiiCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCmd_Tag() {
		return (EAttribute)wiiCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCmd_Bytes() {
		return (EAttribute)wiiCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiEvt() {
		return wiiEvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiReqCmd() {
		return wiiReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiMoteReqCmd() {
		return wiiMoteReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiRawByteReqCmd() {
		return wiiRawByteReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiReadMemoryReqCmd() {
		return wiiReadMemoryReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReadMemoryReqCmd_Offset() {
		return (EAttribute)wiiReadMemoryReqCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReadMemoryReqCmd_Size() {
		return (EAttribute)wiiReadMemoryReqCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiReadRegisterReqCmd() {
		return wiiReadRegisterReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiCalibrationReqCmd() {
		return wiiCalibrationReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiPlayerLEDReqCmd() {
		return wiiPlayerLEDReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiPlayerLEDReqCmd_LedByte() {
		return (EAttribute)wiiPlayerLEDReqCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiReportModeReqCmd() {
		return wiiReportModeReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x20() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x21() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x30() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x31() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x32() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x33() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x34() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x35() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x36() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x37() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x3d() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x3e() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x3f() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_Mode() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiReportModeReqCmd_Continuous() {
		return (EAttribute)wiiReportModeReqCmdEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiRumbleReqCmd() {
		return wiiRumbleReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiRumbleReqCmd_LedByte() {
		return (EAttribute)wiiRumbleReqCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiRumbleReqCmd_Millis() {
		return (EAttribute)wiiRumbleReqCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiStatusInfoReqCmd() {
		return wiiStatusInfoReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiRegisterReqCmd() {
		return wiiRegisterReqCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiCoreButtonEvt() {
		return wiiCoreButtonEvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_NO_BUTTON() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_D_PAD_LEFT() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_D_PAD_RIGHT() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_D_PAD_UP() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_D_PAD_DOWN() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_BUTTON_ONE() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_BUTTON_TWO() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_BUTTON_A() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_BUTTON_B() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_BUTTON_PLUS() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_BUTTON_MINUS() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_BUTTON_HOME() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCoreButtonEvt_Modifiers() {
		return (EAttribute)wiiCoreButtonEvtEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiDataEvt() {
		return wiiDataEvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiDataEvt_Address() {
		return (EAttribute)wiiDataEvtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiDataEvt_Payload() {
		return (EAttribute)wiiDataEvtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiDataEvt_Error() {
		return (EAttribute)wiiDataEvtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiExtEvt() {
		return wiiExtEvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiIREvt() {
		return wiiIREvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiDisconectedEvt() {
		return wiiDisconectedEvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiDisconectedEvt_Extension() {
		return (EAttribute)wiiDisconectedEvtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiimoteDevice() {
		return wiimoteDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteDevice_InfoReport() {
		return (EReference)wiimoteDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteDevice_CalibratonDataReport() {
		return (EReference)wiimoteDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiimoteDevice_Btaddress() {
		return (EAttribute)wiimoteDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiStatusInfoReport() {
		return wiiStatusInfoReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiStatusInfoReport_ExtensionControllerConnected() {
		return (EAttribute)wiiStatusInfoReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiStatusInfoReport_SpeakerEnabled() {
		return (EAttribute)wiiStatusInfoReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiStatusInfoReport_ContinuousReportingEnabled() {
		return (EAttribute)wiiStatusInfoReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiStatusInfoReport_LedEnabled() {
		return (EAttribute)wiiStatusInfoReportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiStatusInfoReport_BatteryLevel() {
		return (EAttribute)wiiStatusInfoReportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiCalibrationDataReport() {
		return wiiCalibrationDataReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCalibrationDataReport_ZeroX() {
		return (EAttribute)wiiCalibrationDataReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCalibrationDataReport_ZeroY() {
		return (EAttribute)wiiCalibrationDataReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCalibrationDataReport_ZeroZ() {
		return (EAttribute)wiiCalibrationDataReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCalibrationDataReport_GravityX() {
		return (EAttribute)wiiCalibrationDataReportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCalibrationDataReport_GravityY() {
		return (EAttribute)wiiCalibrationDataReportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiCalibrationDataReport_GravityZ() {
		return (EAttribute)wiiCalibrationDataReportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiAccelEvt() {
		return wiiAccelEvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelEvt_X() {
		return (EAttribute)wiiAccelEvtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelEvt_Y() {
		return (EAttribute)wiiAccelEvtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelEvt_Z() {
		return (EAttribute)wiiAccelEvtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelEvt_Source() {
		return (EAttribute)wiiAccelEvtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiWriteRegisterReq() {
		return wiiWriteRegisterReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiMultiCmd() {
		return wiiMultiCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiConnectedEvt() {
		return wiiConnectedEvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiConnectedEvt_Extension() {
		return (EAttribute)wiiConnectedEvtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiLeftAnalogStickEvent() {
		return wiiLeftAnalogStickEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiRightAnalogStickEvent() {
		return wiiRightAnalogStickEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiLeftAnalogTriggerEvent() {
		return wiiLeftAnalogTriggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiRightAnalogTriggerEvent() {
		return wiiRightAnalogTriggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiAnalogStickEvent() {
		return wiiAnalogStickEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAnalogStickEvent_X() {
		return (EAttribute)wiiAnalogStickEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAnalogStickEvent_Y() {
		return (EAttribute)wiiAnalogStickEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiAnalogTriggerEvent() {
		return wiiAnalogTriggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAnalogTriggerEvent_Trigger() {
		return (EAttribute)wiiAnalogTriggerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiNunchukButtonEvt() {
		return wiiNunchukButtonEvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukButtonEvt_C_BUTTON() {
		return (EAttribute)wiiNunchukButtonEvtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukButtonEvt_Z_BUTTON() {
		return (EAttribute)wiiNunchukButtonEvtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukButtonEvt_NO_BUTTON() {
		return (EAttribute)wiiNunchukButtonEvtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIrCameraMode() {
		return irCameraModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBUTTON_CODE() {
		return buttoN_CODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWiiExtension() {
		return wiiExtensionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzwiimoteFactory getEzwiimoteFactory() {
		return (EzwiimoteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wiiCmdEClass = createEClass(WII_CMD);
		createEAttribute(wiiCmdEClass, WII_CMD__TAG);
		createEAttribute(wiiCmdEClass, WII_CMD__BYTES);

		wiiEvtEClass = createEClass(WII_EVT);

		wiiReqCmdEClass = createEClass(WII_REQ_CMD);

		wiiMoteReqCmdEClass = createEClass(WII_MOTE_REQ_CMD);

		wiiRawByteReqCmdEClass = createEClass(WII_RAW_BYTE_REQ_CMD);

		wiiReadMemoryReqCmdEClass = createEClass(WII_READ_MEMORY_REQ_CMD);
		createEAttribute(wiiReadMemoryReqCmdEClass, WII_READ_MEMORY_REQ_CMD__OFFSET);
		createEAttribute(wiiReadMemoryReqCmdEClass, WII_READ_MEMORY_REQ_CMD__SIZE);

		wiiReadRegisterReqCmdEClass = createEClass(WII_READ_REGISTER_REQ_CMD);

		wiiCalibrationReqCmdEClass = createEClass(WII_CALIBRATION_REQ_CMD);

		wiiPlayerLEDReqCmdEClass = createEClass(WII_PLAYER_LED_REQ_CMD);
		createEAttribute(wiiPlayerLEDReqCmdEClass, WII_PLAYER_LED_REQ_CMD__LED_BYTE);

		wiiReportModeReqCmdEClass = createEClass(WII_REPORT_MODE_REQ_CMD);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X20);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X21);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X30);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X31);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X32);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X33);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X34);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X35);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X36);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X37);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3D);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3E);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3F);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__MODE);
		createEAttribute(wiiReportModeReqCmdEClass, WII_REPORT_MODE_REQ_CMD__CONTINUOUS);

		wiiRumbleReqCmdEClass = createEClass(WII_RUMBLE_REQ_CMD);
		createEAttribute(wiiRumbleReqCmdEClass, WII_RUMBLE_REQ_CMD__LED_BYTE);
		createEAttribute(wiiRumbleReqCmdEClass, WII_RUMBLE_REQ_CMD__MILLIS);

		wiiStatusInfoReqCmdEClass = createEClass(WII_STATUS_INFO_REQ_CMD);

		wiiRegisterReqCmdEClass = createEClass(WII_REGISTER_REQ_CMD);

		wiiCoreButtonEvtEClass = createEClass(WII_CORE_BUTTON_EVT);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__NO_BUTTON);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__DPAD_LEFT);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__DPAD_RIGHT);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__DPAD_UP);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__DPAD_DOWN);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__BUTTON_ONE);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__BUTTON_TWO);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__BUTTON_A);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__BUTTON_B);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__BUTTON_PLUS);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__BUTTON_MINUS);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__BUTTON_HOME);
		createEAttribute(wiiCoreButtonEvtEClass, WII_CORE_BUTTON_EVT__MODIFIERS);

		wiiDataEvtEClass = createEClass(WII_DATA_EVT);
		createEAttribute(wiiDataEvtEClass, WII_DATA_EVT__ADDRESS);
		createEAttribute(wiiDataEvtEClass, WII_DATA_EVT__PAYLOAD);
		createEAttribute(wiiDataEvtEClass, WII_DATA_EVT__ERROR);

		wiiExtEvtEClass = createEClass(WII_EXT_EVT);

		wiiIREvtEClass = createEClass(WII_IR_EVT);

		wiiDisconectedEvtEClass = createEClass(WII_DISCONECTED_EVT);
		createEAttribute(wiiDisconectedEvtEClass, WII_DISCONECTED_EVT__EXTENSION);

		wiimoteDeviceEClass = createEClass(WIIMOTE_DEVICE);
		createEReference(wiimoteDeviceEClass, WIIMOTE_DEVICE__INFO_REPORT);
		createEReference(wiimoteDeviceEClass, WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT);
		createEAttribute(wiimoteDeviceEClass, WIIMOTE_DEVICE__BTADDRESS);

		wiiStatusInfoReportEClass = createEClass(WII_STATUS_INFO_REPORT);
		createEAttribute(wiiStatusInfoReportEClass, WII_STATUS_INFO_REPORT__EXTENSION_CONTROLLER_CONNECTED);
		createEAttribute(wiiStatusInfoReportEClass, WII_STATUS_INFO_REPORT__SPEAKER_ENABLED);
		createEAttribute(wiiStatusInfoReportEClass, WII_STATUS_INFO_REPORT__CONTINUOUS_REPORTING_ENABLED);
		createEAttribute(wiiStatusInfoReportEClass, WII_STATUS_INFO_REPORT__LED_ENABLED);
		createEAttribute(wiiStatusInfoReportEClass, WII_STATUS_INFO_REPORT__BATTERY_LEVEL);

		wiiCalibrationDataReportEClass = createEClass(WII_CALIBRATION_DATA_REPORT);
		createEAttribute(wiiCalibrationDataReportEClass, WII_CALIBRATION_DATA_REPORT__ZERO_X);
		createEAttribute(wiiCalibrationDataReportEClass, WII_CALIBRATION_DATA_REPORT__ZERO_Y);
		createEAttribute(wiiCalibrationDataReportEClass, WII_CALIBRATION_DATA_REPORT__ZERO_Z);
		createEAttribute(wiiCalibrationDataReportEClass, WII_CALIBRATION_DATA_REPORT__GRAVITY_X);
		createEAttribute(wiiCalibrationDataReportEClass, WII_CALIBRATION_DATA_REPORT__GRAVITY_Y);
		createEAttribute(wiiCalibrationDataReportEClass, WII_CALIBRATION_DATA_REPORT__GRAVITY_Z);

		wiiAccelEvtEClass = createEClass(WII_ACCEL_EVT);
		createEAttribute(wiiAccelEvtEClass, WII_ACCEL_EVT__X);
		createEAttribute(wiiAccelEvtEClass, WII_ACCEL_EVT__Y);
		createEAttribute(wiiAccelEvtEClass, WII_ACCEL_EVT__Z);
		createEAttribute(wiiAccelEvtEClass, WII_ACCEL_EVT__SOURCE);

		wiiWriteRegisterReqEClass = createEClass(WII_WRITE_REGISTER_REQ);

		wiiMultiCmdEClass = createEClass(WII_MULTI_CMD);

		wiiConnectedEvtEClass = createEClass(WII_CONNECTED_EVT);
		createEAttribute(wiiConnectedEvtEClass, WII_CONNECTED_EVT__EXTENSION);

		wiiLeftAnalogStickEventEClass = createEClass(WII_LEFT_ANALOG_STICK_EVENT);

		wiiRightAnalogStickEventEClass = createEClass(WII_RIGHT_ANALOG_STICK_EVENT);

		wiiLeftAnalogTriggerEventEClass = createEClass(WII_LEFT_ANALOG_TRIGGER_EVENT);

		wiiRightAnalogTriggerEventEClass = createEClass(WII_RIGHT_ANALOG_TRIGGER_EVENT);

		wiiAnalogStickEventEClass = createEClass(WII_ANALOG_STICK_EVENT);
		createEAttribute(wiiAnalogStickEventEClass, WII_ANALOG_STICK_EVENT__X);
		createEAttribute(wiiAnalogStickEventEClass, WII_ANALOG_STICK_EVENT__Y);

		wiiAnalogTriggerEventEClass = createEClass(WII_ANALOG_TRIGGER_EVENT);
		createEAttribute(wiiAnalogTriggerEventEClass, WII_ANALOG_TRIGGER_EVENT__TRIGGER);

		wiiNunchukButtonEvtEClass = createEClass(WII_NUNCHUK_BUTTON_EVT);
		createEAttribute(wiiNunchukButtonEvtEClass, WII_NUNCHUK_BUTTON_EVT__CBUTTON);
		createEAttribute(wiiNunchukButtonEvtEClass, WII_NUNCHUK_BUTTON_EVT__ZBUTTON);
		createEAttribute(wiiNunchukButtonEvtEClass, WII_NUNCHUK_BUTTON_EVT__NO_BUTTON);

		// Create enums
		irCameraModeEEnum = createEEnum(IR_CAMERA_MODE);
		buttoN_CODEEEnum = createEEnum(BUTTON_CODE);

		// Create data types
		wiiExtensionEDataType = createEDataType(WII_EXTENSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wiiCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		wiiEvtEClass.getESuperTypes().add(this.getWiiCmd());
		wiiReqCmdEClass.getESuperTypes().add(this.getWiiCmd());
		wiiMoteReqCmdEClass.getESuperTypes().add(this.getWiiReqCmd());
		wiiRawByteReqCmdEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiReadMemoryReqCmdEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiReadRegisterReqCmdEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiCalibrationReqCmdEClass.getESuperTypes().add(this.getWiiReadMemoryReqCmd());
		wiiPlayerLEDReqCmdEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiReportModeReqCmdEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiRumbleReqCmdEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiStatusInfoReqCmdEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiRegisterReqCmdEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiCoreButtonEvtEClass.getESuperTypes().add(this.getWiiEvt());
		wiiDataEvtEClass.getESuperTypes().add(this.getWiiEvt());
		wiiExtEvtEClass.getESuperTypes().add(this.getWiiEvt());
		wiiIREvtEClass.getESuperTypes().add(this.getWiiEvt());
		wiiDisconectedEvtEClass.getESuperTypes().add(this.getWiiEvt());
		wiiStatusInfoReportEClass.getESuperTypes().add(this.getWiiCmd());
		wiiAccelEvtEClass.getESuperTypes().add(this.getWiiEvt());
		wiiWriteRegisterReqEClass.getESuperTypes().add(this.getWiiMoteReqCmd());
		wiiMultiCmdEClass.getESuperTypes().add(this.getWiiCmd());
		wiiMultiCmdEClass.getESuperTypes().add(theCmdPackage.getCompoundCmd());
		wiiConnectedEvtEClass.getESuperTypes().add(this.getWiiEvt());
		wiiLeftAnalogStickEventEClass.getESuperTypes().add(this.getWiiAnalogStickEvent());
		wiiRightAnalogStickEventEClass.getESuperTypes().add(this.getWiiAnalogStickEvent());
		wiiLeftAnalogTriggerEventEClass.getESuperTypes().add(this.getWiiAnalogTriggerEvent());
		wiiRightAnalogTriggerEventEClass.getESuperTypes().add(this.getWiiAnalogTriggerEvent());
		wiiAnalogStickEventEClass.getESuperTypes().add(this.getWiiExtEvt());
		wiiAnalogTriggerEventEClass.getESuperTypes().add(this.getWiiExtEvt());
		wiiNunchukButtonEvtEClass.getESuperTypes().add(this.getWiiEvt());

		// Initialize classes and features; add operations and parameters
		initEClass(wiiCmdEClass, WiiCmd.class, "WiiCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiCmd_Tag(), ecorePackage.getEByte(), "tag", null, 0, 1, WiiCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCmd_Bytes(), ecorePackage.getEByteArray(), "bytes", null, 0, 1, WiiCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiEvtEClass, WiiEvt.class, "WiiEvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiReqCmdEClass, WiiReqCmd.class, "WiiReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiMoteReqCmdEClass, WiiMoteReqCmd.class, "WiiMoteReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiRawByteReqCmdEClass, WiiRawByteReqCmd.class, "WiiRawByteReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiReadMemoryReqCmdEClass, WiiReadMemoryReqCmd.class, "WiiReadMemoryReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiReadMemoryReqCmd_Offset(), ecorePackage.getEByteArray(), "offset", null, 0, 1, WiiReadMemoryReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReadMemoryReqCmd_Size(), ecorePackage.getEByteArray(), "size", null, 0, 1, WiiReadMemoryReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiReadRegisterReqCmdEClass, WiiReadRegisterReqCmd.class, "WiiReadRegisterReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiCalibrationReqCmdEClass, WiiCalibrationReqCmd.class, "WiiCalibrationReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiPlayerLEDReqCmdEClass, WiiPlayerLEDReqCmd.class, "WiiPlayerLEDReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiPlayerLEDReqCmd_LedByte(), ecorePackage.getEByte(), "ledByte", null, 0, 1, WiiPlayerLEDReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiReportModeReqCmdEClass, WiiReportModeReqCmd.class, "WiiReportModeReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x20(), ecorePackage.getEByte(), "DATA_REPORT_0x20", "\'0x20\'", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x21(), ecorePackage.getEByte(), "DATA_REPORT_0x21", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x30(), ecorePackage.getEByte(), "DATA_REPORT_0x30", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x31(), ecorePackage.getEByte(), "DATA_REPORT_0x31", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x32(), ecorePackage.getEByte(), "DATA_REPORT_0x32", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x33(), ecorePackage.getEByte(), "DATA_REPORT_0x33", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x34(), ecorePackage.getEByte(), "DATA_REPORT_0x34", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x35(), ecorePackage.getEByte(), "DATA_REPORT_0x35", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x36(), ecorePackage.getEByte(), "DATA_REPORT_0x36", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x37(), ecorePackage.getEByte(), "DATA_REPORT_0x37", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x3d(), ecorePackage.getEByte(), "DATA_REPORT_0x3d", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x3e(), ecorePackage.getEByte(), "DATA_REPORT_0x3e", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_DATA_REPORT_0x3f(), ecorePackage.getEByte(), "DATA_REPORT_0x3f", "", 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_Mode(), ecorePackage.getEByte(), "mode", null, 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiReportModeReqCmd_Continuous(), ecorePackage.getEBoolean(), "continuous", null, 0, 1, WiiReportModeReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiRumbleReqCmdEClass, WiiRumbleReqCmd.class, "WiiRumbleReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiRumbleReqCmd_LedByte(), ecorePackage.getEByte(), "ledByte", null, 0, 1, WiiRumbleReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiRumbleReqCmd_Millis(), ecorePackage.getELong(), "millis", null, 0, 1, WiiRumbleReqCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(wiiRumbleReqCmdEClass, ecorePackage.getEByteArray(), "getStopRumbleBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "ledByte", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(wiiStatusInfoReqCmdEClass, WiiStatusInfoReqCmd.class, "WiiStatusInfoReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiRegisterReqCmdEClass, WiiRegisterReqCmd.class, "WiiRegisterReqCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiCoreButtonEvtEClass, WiiCoreButtonEvt.class, "WiiCoreButtonEvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiCoreButtonEvt_NO_BUTTON(), ecorePackage.getEInt(), "NO_BUTTON", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_D_PAD_LEFT(), ecorePackage.getEInt(), "D_PAD_LEFT", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_D_PAD_RIGHT(), ecorePackage.getEInt(), "D_PAD_RIGHT", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_D_PAD_UP(), ecorePackage.getEInt(), "D_PAD_UP", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_D_PAD_DOWN(), ecorePackage.getEInt(), "D_PAD_DOWN", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_BUTTON_ONE(), ecorePackage.getEInt(), "BUTTON_ONE", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_BUTTON_TWO(), ecorePackage.getEInt(), "BUTTON_TWO", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_BUTTON_A(), ecorePackage.getEInt(), "BUTTON_A", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_BUTTON_B(), ecorePackage.getEInt(), "BUTTON_B", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_BUTTON_PLUS(), ecorePackage.getEInt(), "BUTTON_PLUS", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_BUTTON_MINUS(), ecorePackage.getEInt(), "BUTTON_MINUS", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_BUTTON_HOME(), ecorePackage.getEInt(), "BUTTON_HOME", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCoreButtonEvt_Modifiers(), ecorePackage.getEInt(), "modifiers", null, 0, 1, WiiCoreButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonAPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonBPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonHomePressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonPadUpPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonPadDownPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonPadLeftPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonPadRightPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonMinusPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonPlusPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonNoPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonOnePressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiCoreButtonEvtEClass, ecorePackage.getEBoolean(), "isButtonTwoPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(wiiDataEvtEClass, WiiDataEvt.class, "WiiDataEvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiDataEvt_Address(), ecorePackage.getEByteArray(), "address", null, 0, 1, WiiDataEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiDataEvt_Payload(), ecorePackage.getEByteArray(), "payload", null, 0, 1, WiiDataEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiDataEvt_Error(), ecorePackage.getEInt(), "error", null, 0, 1, WiiDataEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiExtEvtEClass, WiiExtEvt.class, "WiiExtEvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiIREvtEClass, WiiIREvt.class, "WiiIREvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiDisconectedEvtEClass, WiiDisconectedEvt.class, "WiiDisconectedEvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiDisconectedEvt_Extension(), this.getWiiExtension(), "extension", null, 0, 1, WiiDisconectedEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiimoteDeviceEClass, WiimoteDevice.class, "WiimoteDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWiimoteDevice_InfoReport(), this.getWiiStatusInfoReport(), null, "infoReport", null, 0, 1, WiimoteDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteDevice_CalibratonDataReport(), this.getWiiCalibrationDataReport(), null, "calibratonDataReport", null, 0, 1, WiimoteDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiimoteDevice_Btaddress(), ecorePackage.getEString(), "btaddress", null, 0, 1, WiimoteDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiStatusInfoReportEClass, WiiStatusInfoReport.class, "WiiStatusInfoReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiStatusInfoReport_ExtensionControllerConnected(), ecorePackage.getEBoolean(), "extensionControllerConnected", null, 0, 1, WiiStatusInfoReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiStatusInfoReport_SpeakerEnabled(), ecorePackage.getEBoolean(), "speakerEnabled", null, 0, 1, WiiStatusInfoReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiStatusInfoReport_ContinuousReportingEnabled(), ecorePackage.getEBoolean(), "continuousReportingEnabled", null, 0, 1, WiiStatusInfoReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiStatusInfoReport_LedEnabled(), ecorePackage.getEBoolean(), "ledEnabled", null, 0, -1, WiiStatusInfoReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiStatusInfoReport_BatteryLevel(), ecorePackage.getEByte(), "batteryLevel", null, 0, 1, WiiStatusInfoReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiCalibrationDataReportEClass, WiiCalibrationDataReport.class, "WiiCalibrationDataReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiCalibrationDataReport_ZeroX(), ecorePackage.getEInt(), "zeroX", null, 0, 1, WiiCalibrationDataReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCalibrationDataReport_ZeroY(), ecorePackage.getEInt(), "zeroY", null, 0, 1, WiiCalibrationDataReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCalibrationDataReport_ZeroZ(), ecorePackage.getEInt(), "zeroZ", null, 0, 1, WiiCalibrationDataReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCalibrationDataReport_GravityX(), ecorePackage.getEInt(), "gravityX", null, 0, 1, WiiCalibrationDataReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCalibrationDataReport_GravityY(), ecorePackage.getEInt(), "gravityY", null, 0, 1, WiiCalibrationDataReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiCalibrationDataReport_GravityZ(), ecorePackage.getEInt(), "gravityZ", null, 0, 1, WiiCalibrationDataReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiAccelEvtEClass, WiiAccelEvt.class, "WiiAccelEvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiAccelEvt_X(), ecorePackage.getEInt(), "x", null, 0, 1, WiiAccelEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAccelEvt_Y(), ecorePackage.getEInt(), "y", null, 0, 1, WiiAccelEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAccelEvt_Z(), ecorePackage.getEInt(), "z", null, 0, 1, WiiAccelEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAccelEvt_Source(), ecorePackage.getEJavaObject(), "source", null, 0, 1, WiiAccelEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiWriteRegisterReqEClass, WiiWriteRegisterReq.class, "WiiWriteRegisterReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiMultiCmdEClass, WiiMultiCmd.class, "WiiMultiCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiConnectedEvtEClass, WiiConnectedEvt.class, "WiiConnectedEvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiConnectedEvt_Extension(), this.getWiiExtension(), "extension", null, 0, 1, WiiConnectedEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiLeftAnalogStickEventEClass, WiiLeftAnalogStickEvent.class, "WiiLeftAnalogStickEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiRightAnalogStickEventEClass, WiiRightAnalogStickEvent.class, "WiiRightAnalogStickEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiLeftAnalogTriggerEventEClass, WiiLeftAnalogTriggerEvent.class, "WiiLeftAnalogTriggerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiRightAnalogTriggerEventEClass, WiiRightAnalogTriggerEvent.class, "WiiRightAnalogTriggerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wiiAnalogStickEventEClass, WiiAnalogStickEvent.class, "WiiAnalogStickEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiAnalogStickEvent_X(), ecorePackage.getEInt(), "x", null, 0, 1, WiiAnalogStickEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAnalogStickEvent_Y(), ecorePackage.getEInt(), "y", null, 0, 1, WiiAnalogStickEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiAnalogTriggerEventEClass, WiiAnalogTriggerEvent.class, "WiiAnalogTriggerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiAnalogTriggerEvent_Trigger(), ecorePackage.getEInt(), "trigger", null, 0, 1, WiiAnalogTriggerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiNunchukButtonEvtEClass, WiiNunchukButtonEvt.class, "WiiNunchukButtonEvt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiNunchukButtonEvt_C_BUTTON(), ecorePackage.getEInt(), "C_BUTTON", null, 0, 1, WiiNunchukButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukButtonEvt_Z_BUTTON(), ecorePackage.getEInt(), "Z_BUTTON", null, 0, 1, WiiNunchukButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukButtonEvt_NO_BUTTON(), ecorePackage.getEInt(), "NO_BUTTON", null, 0, 1, WiiNunchukButtonEvt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(wiiNunchukButtonEvtEClass, ecorePackage.getEBoolean(), "isZButtonPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wiiNunchukButtonEvtEClass, ecorePackage.getEBoolean(), "isCButtonPressed", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(irCameraModeEEnum, IrCameraMode.class, "IrCameraMode");
		addEEnumLiteral(irCameraModeEEnum, IrCameraMode.BASIC);
		addEEnumLiteral(irCameraModeEEnum, IrCameraMode.EXTENDED);
		addEEnumLiteral(irCameraModeEEnum, IrCameraMode.FULL);

		initEEnum(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.class, "BUTTON_CODE");
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_A);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_Y);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_ZL);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_ZR);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_HOME);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_MINUS);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_PLUS);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_LEFT_TRIGGER);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_RIGHT_TRIGGER);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_B);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_X);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.DPAD_DOWN);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.DPAD_LEFT);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.DPAD_RIGHT);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.DPAD_UP);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.NO_BUTTON);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_ONE);
		addEEnumLiteral(buttoN_CODEEEnum, net.sf.smbt.ezwiimote.BUTTON_CODE.BUTTON_TWO);

		// Initialize data types
		initEDataType(wiiExtensionEDataType, Object.class, "WiiExtension", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzwiimotePackageImpl
