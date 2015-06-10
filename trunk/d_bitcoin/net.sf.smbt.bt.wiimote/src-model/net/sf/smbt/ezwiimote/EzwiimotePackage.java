/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezwiimote.EzwiimoteFactory
 * @model kind="package"
 * @generated
 */
public interface EzwiimotePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezwiimote";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezwiimote/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezwiimote";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzwiimotePackage eINSTANCE = net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiCmdImpl <em>Wii Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiCmd()
	 * @generated
	 */
	int WII_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CMD__TAG = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CMD__BYTES = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wii Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiEvtImpl <em>Wii Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiEvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiEvt()
	 * @generated
	 */
	int WII_EVT = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EVT__PRIORITY = WII_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EVT__STAMP = WII_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EVT__TAG = WII_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EVT__BYTES = WII_CMD__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EVT_FEATURE_COUNT = WII_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiReqCmdImpl <em>Wii Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiReqCmd()
	 * @generated
	 */
	int WII_REQ_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REQ_CMD__PRIORITY = WII_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REQ_CMD__STAMP = WII_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REQ_CMD__TAG = WII_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REQ_CMD__BYTES = WII_CMD__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REQ_CMD_FEATURE_COUNT = WII_CMD_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiMoteReqCmdImpl <em>Wii Mote Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiMoteReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiMoteReqCmd()
	 * @generated
	 */
	int WII_MOTE_REQ_CMD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTE_REQ_CMD__PRIORITY = WII_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTE_REQ_CMD__STAMP = WII_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTE_REQ_CMD__TAG = WII_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTE_REQ_CMD__BYTES = WII_REQ_CMD__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Mote Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTE_REQ_CMD_FEATURE_COUNT = WII_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiRawByteReqCmdImpl <em>Wii Raw Byte Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiRawByteReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRawByteReqCmd()
	 * @generated
	 */
	int WII_RAW_BYTE_REQ_CMD = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RAW_BYTE_REQ_CMD__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RAW_BYTE_REQ_CMD__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RAW_BYTE_REQ_CMD__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RAW_BYTE_REQ_CMD__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Raw Byte Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RAW_BYTE_REQ_CMD_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiReadMemoryReqCmdImpl <em>Wii Read Memory Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiReadMemoryReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiReadMemoryReqCmd()
	 * @generated
	 */
	int WII_READ_MEMORY_REQ_CMD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_MEMORY_REQ_CMD__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_MEMORY_REQ_CMD__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_MEMORY_REQ_CMD__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_MEMORY_REQ_CMD__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_MEMORY_REQ_CMD__OFFSET = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_MEMORY_REQ_CMD__SIZE = WII_MOTE_REQ_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wii Read Memory Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_MEMORY_REQ_CMD_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiReadRegisterReqCmdImpl <em>Wii Read Register Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiReadRegisterReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiReadRegisterReqCmd()
	 * @generated
	 */
	int WII_READ_REGISTER_REQ_CMD = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_REGISTER_REQ_CMD__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_REGISTER_REQ_CMD__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_REGISTER_REQ_CMD__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_REGISTER_REQ_CMD__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Read Register Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_READ_REGISTER_REQ_CMD_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationReqCmdImpl <em>Wii Calibration Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiCalibrationReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiCalibrationReqCmd()
	 * @generated
	 */
	int WII_CALIBRATION_REQ_CMD = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_REQ_CMD__PRIORITY = WII_READ_MEMORY_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_REQ_CMD__STAMP = WII_READ_MEMORY_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_REQ_CMD__TAG = WII_READ_MEMORY_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_REQ_CMD__BYTES = WII_READ_MEMORY_REQ_CMD__BYTES;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_REQ_CMD__OFFSET = WII_READ_MEMORY_REQ_CMD__OFFSET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_REQ_CMD__SIZE = WII_READ_MEMORY_REQ_CMD__SIZE;

	/**
	 * The number of structural features of the '<em>Wii Calibration Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_REQ_CMD_FEATURE_COUNT = WII_READ_MEMORY_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiPlayerLEDReqCmdImpl <em>Wii Player LED Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiPlayerLEDReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiPlayerLEDReqCmd()
	 * @generated
	 */
	int WII_PLAYER_LED_REQ_CMD = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_PLAYER_LED_REQ_CMD__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_PLAYER_LED_REQ_CMD__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_PLAYER_LED_REQ_CMD__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_PLAYER_LED_REQ_CMD__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The feature id for the '<em><b>Led Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_PLAYER_LED_REQ_CMD__LED_BYTE = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wii Player LED Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_PLAYER_LED_REQ_CMD_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl <em>Wii Report Mode Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiReportModeReqCmd()
	 * @generated
	 */
	int WII_REPORT_MODE_REQ_CMD = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X20 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X21 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x30</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X30 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X31 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X32 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x33</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X33 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X34 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x35</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X35 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x36</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X36 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x37</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X37 = WII_MOTE_REQ_CMD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x3d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3D = WII_MOTE_REQ_CMD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x3e</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3E = WII_MOTE_REQ_CMD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>DATA REPORT 0x3f</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3F = WII_MOTE_REQ_CMD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__MODE = WII_MOTE_REQ_CMD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Continuous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD__CONTINUOUS = WII_MOTE_REQ_CMD_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Wii Report Mode Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REPORT_MODE_REQ_CMD_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiRumbleReqCmdImpl <em>Wii Rumble Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiRumbleReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRumbleReqCmd()
	 * @generated
	 */
	int WII_RUMBLE_REQ_CMD = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RUMBLE_REQ_CMD__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RUMBLE_REQ_CMD__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RUMBLE_REQ_CMD__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RUMBLE_REQ_CMD__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The feature id for the '<em><b>Led Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RUMBLE_REQ_CMD__LED_BYTE = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RUMBLE_REQ_CMD__MILLIS = WII_MOTE_REQ_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wii Rumble Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RUMBLE_REQ_CMD_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReqCmdImpl <em>Wii Status Info Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiStatusInfoReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiStatusInfoReqCmd()
	 * @generated
	 */
	int WII_STATUS_INFO_REQ_CMD = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REQ_CMD__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REQ_CMD__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REQ_CMD__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REQ_CMD__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Status Info Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REQ_CMD_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiRegisterReqCmdImpl <em>Wii Register Req Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiRegisterReqCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRegisterReqCmd()
	 * @generated
	 */
	int WII_REGISTER_REQ_CMD = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REGISTER_REQ_CMD__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REGISTER_REQ_CMD__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REGISTER_REQ_CMD__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REGISTER_REQ_CMD__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Register Req Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_REGISTER_REQ_CMD_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl <em>Wii Core Button Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiCoreButtonEvt()
	 * @generated
	 */
	int WII_CORE_BUTTON_EVT = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__PRIORITY = WII_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__STAMP = WII_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__TAG = WII_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__BYTES = WII_EVT__BYTES;

	/**
	 * The feature id for the '<em><b>NO BUTTON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__NO_BUTTON = WII_EVT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DPAD LEFT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__DPAD_LEFT = WII_EVT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DPAD RIGHT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__DPAD_RIGHT = WII_EVT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DPAD UP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__DPAD_UP = WII_EVT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>DPAD DOWN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__DPAD_DOWN = WII_EVT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>BUTTON ONE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__BUTTON_ONE = WII_EVT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>BUTTON TWO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__BUTTON_TWO = WII_EVT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>BUTTON A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__BUTTON_A = WII_EVT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>BUTTON B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__BUTTON_B = WII_EVT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>BUTTON PLUS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__BUTTON_PLUS = WII_EVT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>BUTTON MINUS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__BUTTON_MINUS = WII_EVT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>BUTTON HOME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__BUTTON_HOME = WII_EVT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT__MODIFIERS = WII_EVT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Wii Core Button Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CORE_BUTTON_EVT_FEATURE_COUNT = WII_EVT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiDataEvtImpl <em>Wii Data Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiDataEvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiDataEvt()
	 * @generated
	 */
	int WII_DATA_EVT = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DATA_EVT__PRIORITY = WII_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DATA_EVT__STAMP = WII_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DATA_EVT__TAG = WII_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DATA_EVT__BYTES = WII_EVT__BYTES;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DATA_EVT__ADDRESS = WII_EVT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DATA_EVT__PAYLOAD = WII_EVT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DATA_EVT__ERROR = WII_EVT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wii Data Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DATA_EVT_FEATURE_COUNT = WII_EVT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiExtEvtImpl <em>Wii Ext Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiExtEvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiExtEvt()
	 * @generated
	 */
	int WII_EXT_EVT = 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EXT_EVT__PRIORITY = WII_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EXT_EVT__STAMP = WII_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EXT_EVT__TAG = WII_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EXT_EVT__BYTES = WII_EVT__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Ext Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_EXT_EVT_FEATURE_COUNT = WII_EVT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiIREvtImpl <em>Wii IR Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiIREvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiIREvt()
	 * @generated
	 */
	int WII_IR_EVT = 16;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_EVT__PRIORITY = WII_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_EVT__STAMP = WII_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_EVT__TAG = WII_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_EVT__BYTES = WII_EVT__BYTES;

	/**
	 * The number of structural features of the '<em>Wii IR Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_EVT_FEATURE_COUNT = WII_EVT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiDisconectedEvtImpl <em>Wii Disconected Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiDisconectedEvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiDisconectedEvt()
	 * @generated
	 */
	int WII_DISCONECTED_EVT = 17;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DISCONECTED_EVT__PRIORITY = WII_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DISCONECTED_EVT__STAMP = WII_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DISCONECTED_EVT__TAG = WII_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DISCONECTED_EVT__BYTES = WII_EVT__BYTES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DISCONECTED_EVT__EXTENSION = WII_EVT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wii Disconected Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_DISCONECTED_EVT_FEATURE_COUNT = WII_EVT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiimoteDeviceImpl <em>Wiimote Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiimoteDeviceImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiimoteDevice()
	 * @generated
	 */
	int WIIMOTE_DEVICE = 18;

	/**
	 * The feature id for the '<em><b>Info Report</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_DEVICE__INFO_REPORT = 0;

	/**
	 * The feature id for the '<em><b>Calibraton Data Report</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT = 1;

	/**
	 * The feature id for the '<em><b>Btaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_DEVICE__BTADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Wiimote Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_DEVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl <em>Wii Status Info Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiStatusInfoReport()
	 * @generated
	 */
	int WII_STATUS_INFO_REPORT = 19;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__PRIORITY = WII_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__STAMP = WII_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__TAG = WII_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__BYTES = WII_CMD__BYTES;

	/**
	 * The feature id for the '<em><b>Extension Controller Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__EXTENSION_CONTROLLER_CONNECTED = WII_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speaker Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__SPEAKER_ENABLED = WII_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Continuous Reporting Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__CONTINUOUS_REPORTING_ENABLED = WII_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Led Enabled</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__LED_ENABLED = WII_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Battery Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT__BATTERY_LEVEL = WII_CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Wii Status Info Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_STATUS_INFO_REPORT_FEATURE_COUNT = WII_CMD_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl <em>Wii Calibration Data Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiCalibrationDataReport()
	 * @generated
	 */
	int WII_CALIBRATION_DATA_REPORT = 20;

	/**
	 * The feature id for the '<em><b>Zero X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_DATA_REPORT__ZERO_X = 0;

	/**
	 * The feature id for the '<em><b>Zero Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_DATA_REPORT__ZERO_Y = 1;

	/**
	 * The feature id for the '<em><b>Zero Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_DATA_REPORT__ZERO_Z = 2;

	/**
	 * The feature id for the '<em><b>Gravity X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_DATA_REPORT__GRAVITY_X = 3;

	/**
	 * The feature id for the '<em><b>Gravity Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_DATA_REPORT__GRAVITY_Y = 4;

	/**
	 * The feature id for the '<em><b>Gravity Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_DATA_REPORT__GRAVITY_Z = 5;

	/**
	 * The number of structural features of the '<em>Wii Calibration Data Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CALIBRATION_DATA_REPORT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiAccelEvtImpl <em>Wii Accel Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiAccelEvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiAccelEvt()
	 * @generated
	 */
	int WII_ACCEL_EVT = 21;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT__PRIORITY = WII_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT__STAMP = WII_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT__TAG = WII_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT__BYTES = WII_EVT__BYTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT__X = WII_EVT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT__Y = WII_EVT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT__Z = WII_EVT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT__SOURCE = WII_EVT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Wii Accel Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_EVT_FEATURE_COUNT = WII_EVT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiWriteRegisterReqImpl <em>Wii Write Register Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiWriteRegisterReqImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiWriteRegisterReq()
	 * @generated
	 */
	int WII_WRITE_REGISTER_REQ = 22;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_WRITE_REGISTER_REQ__PRIORITY = WII_MOTE_REQ_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_WRITE_REGISTER_REQ__STAMP = WII_MOTE_REQ_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_WRITE_REGISTER_REQ__TAG = WII_MOTE_REQ_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_WRITE_REGISTER_REQ__BYTES = WII_MOTE_REQ_CMD__BYTES;

	/**
	 * The number of structural features of the '<em>Wii Write Register Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_WRITE_REGISTER_REQ_FEATURE_COUNT = WII_MOTE_REQ_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiMultiCmdImpl <em>Wii Multi Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiMultiCmdImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiMultiCmd()
	 * @generated
	 */
	int WII_MULTI_CMD = 23;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MULTI_CMD__PRIORITY = WII_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MULTI_CMD__STAMP = WII_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MULTI_CMD__TAG = WII_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MULTI_CMD__BYTES = WII_CMD__BYTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MULTI_CMD__CHILDREN = WII_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wii Multi Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MULTI_CMD_FEATURE_COUNT = WII_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiConnectedEvtImpl <em>Wii Connected Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiConnectedEvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiConnectedEvt()
	 * @generated
	 */
	int WII_CONNECTED_EVT = 24;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CONNECTED_EVT__PRIORITY = WII_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CONNECTED_EVT__STAMP = WII_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CONNECTED_EVT__TAG = WII_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CONNECTED_EVT__BYTES = WII_EVT__BYTES;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CONNECTED_EVT__EXTENSION = WII_EVT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wii Connected Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_CONNECTED_EVT_FEATURE_COUNT = WII_EVT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiAnalogStickEventImpl <em>Wii Analog Stick Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiAnalogStickEventImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiAnalogStickEvent()
	 * @generated
	 */
	int WII_ANALOG_STICK_EVENT = 29;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_STICK_EVENT__PRIORITY = WII_EXT_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_STICK_EVENT__STAMP = WII_EXT_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_STICK_EVENT__TAG = WII_EXT_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_STICK_EVENT__BYTES = WII_EXT_EVT__BYTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_STICK_EVENT__X = WII_EXT_EVT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_STICK_EVENT__Y = WII_EXT_EVT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wii Analog Stick Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_STICK_EVENT_FEATURE_COUNT = WII_EXT_EVT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiLeftAnalogStickEventImpl <em>Wii Left Analog Stick Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiLeftAnalogStickEventImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiLeftAnalogStickEvent()
	 * @generated
	 */
	int WII_LEFT_ANALOG_STICK_EVENT = 25;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_STICK_EVENT__PRIORITY = WII_ANALOG_STICK_EVENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_STICK_EVENT__STAMP = WII_ANALOG_STICK_EVENT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_STICK_EVENT__TAG = WII_ANALOG_STICK_EVENT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_STICK_EVENT__BYTES = WII_ANALOG_STICK_EVENT__BYTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_STICK_EVENT__X = WII_ANALOG_STICK_EVENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_STICK_EVENT__Y = WII_ANALOG_STICK_EVENT__Y;

	/**
	 * The number of structural features of the '<em>Wii Left Analog Stick Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_STICK_EVENT_FEATURE_COUNT = WII_ANALOG_STICK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiRightAnalogStickEventImpl <em>Wii Right Analog Stick Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiRightAnalogStickEventImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRightAnalogStickEvent()
	 * @generated
	 */
	int WII_RIGHT_ANALOG_STICK_EVENT = 26;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_STICK_EVENT__PRIORITY = WII_ANALOG_STICK_EVENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_STICK_EVENT__STAMP = WII_ANALOG_STICK_EVENT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_STICK_EVENT__TAG = WII_ANALOG_STICK_EVENT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_STICK_EVENT__BYTES = WII_ANALOG_STICK_EVENT__BYTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_STICK_EVENT__X = WII_ANALOG_STICK_EVENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_STICK_EVENT__Y = WII_ANALOG_STICK_EVENT__Y;

	/**
	 * The number of structural features of the '<em>Wii Right Analog Stick Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_STICK_EVENT_FEATURE_COUNT = WII_ANALOG_STICK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiAnalogTriggerEventImpl <em>Wii Analog Trigger Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiAnalogTriggerEventImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiAnalogTriggerEvent()
	 * @generated
	 */
	int WII_ANALOG_TRIGGER_EVENT = 30;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_TRIGGER_EVENT__PRIORITY = WII_EXT_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_TRIGGER_EVENT__STAMP = WII_EXT_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_TRIGGER_EVENT__TAG = WII_EXT_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_TRIGGER_EVENT__BYTES = WII_EXT_EVT__BYTES;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_TRIGGER_EVENT__TRIGGER = WII_EXT_EVT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wii Analog Trigger Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANALOG_TRIGGER_EVENT_FEATURE_COUNT = WII_EXT_EVT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiLeftAnalogTriggerEventImpl <em>Wii Left Analog Trigger Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiLeftAnalogTriggerEventImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiLeftAnalogTriggerEvent()
	 * @generated
	 */
	int WII_LEFT_ANALOG_TRIGGER_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_TRIGGER_EVENT__PRIORITY = WII_ANALOG_TRIGGER_EVENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_TRIGGER_EVENT__STAMP = WII_ANALOG_TRIGGER_EVENT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_TRIGGER_EVENT__TAG = WII_ANALOG_TRIGGER_EVENT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_TRIGGER_EVENT__BYTES = WII_ANALOG_TRIGGER_EVENT__BYTES;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_TRIGGER_EVENT__TRIGGER = WII_ANALOG_TRIGGER_EVENT__TRIGGER;

	/**
	 * The number of structural features of the '<em>Wii Left Analog Trigger Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_LEFT_ANALOG_TRIGGER_EVENT_FEATURE_COUNT = WII_ANALOG_TRIGGER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiRightAnalogTriggerEventImpl <em>Wii Right Analog Trigger Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiRightAnalogTriggerEventImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRightAnalogTriggerEvent()
	 * @generated
	 */
	int WII_RIGHT_ANALOG_TRIGGER_EVENT = 28;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_TRIGGER_EVENT__PRIORITY = WII_ANALOG_TRIGGER_EVENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_TRIGGER_EVENT__STAMP = WII_ANALOG_TRIGGER_EVENT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_TRIGGER_EVENT__TAG = WII_ANALOG_TRIGGER_EVENT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_TRIGGER_EVENT__BYTES = WII_ANALOG_TRIGGER_EVENT__BYTES;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_TRIGGER_EVENT__TRIGGER = WII_ANALOG_TRIGGER_EVENT__TRIGGER;

	/**
	 * The number of structural features of the '<em>Wii Right Analog Trigger Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_RIGHT_ANALOG_TRIGGER_EVENT_FEATURE_COUNT = WII_ANALOG_TRIGGER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.impl.WiiNunchukButtonEvtImpl <em>Wii Nunchuk Button Evt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.impl.WiiNunchukButtonEvtImpl
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiNunchukButtonEvt()
	 * @generated
	 */
	int WII_NUNCHUK_BUTTON_EVT = 31;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_EVT__PRIORITY = WII_EVT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_EVT__STAMP = WII_EVT__STAMP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_EVT__TAG = WII_EVT__TAG;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_EVT__BYTES = WII_EVT__BYTES;

	/**
	 * The feature id for the '<em><b>CBUTTON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_EVT__CBUTTON = WII_EVT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ZBUTTON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_EVT__ZBUTTON = WII_EVT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>NO BUTTON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_EVT__NO_BUTTON = WII_EVT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wii Nunchuk Button Evt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_EVT_FEATURE_COUNT = WII_EVT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.IrCameraMode <em>Ir Camera Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.IrCameraMode
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getIrCameraMode()
	 * @generated
	 */
	int IR_CAMERA_MODE = 32;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezwiimote.BUTTON_CODE <em>BUTTON CODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezwiimote.BUTTON_CODE
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getBUTTON_CODE()
	 * @generated
	 */
	int BUTTON_CODE = 33;

	/**
	 * The meta object id for the '<em>Wii Extension</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiExtension()
	 * @generated
	 */
	int WII_EXTENSION = 34;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiCmd <em>Wii Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCmd
	 * @generated
	 */
	EClass getWiiCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCmd#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCmd#getTag()
	 * @see #getWiiCmd()
	 * @generated
	 */
	EAttribute getWiiCmd_Tag();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCmd#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCmd#getBytes()
	 * @see #getWiiCmd()
	 * @generated
	 */
	EAttribute getWiiCmd_Bytes();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiEvt <em>Wii Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiEvt
	 * @generated
	 */
	EClass getWiiEvt();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiReqCmd <em>Wii Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReqCmd
	 * @generated
	 */
	EClass getWiiReqCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiMoteReqCmd <em>Wii Mote Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Mote Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiMoteReqCmd
	 * @generated
	 */
	EClass getWiiMoteReqCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiRawByteReqCmd <em>Wii Raw Byte Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Raw Byte Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiRawByteReqCmd
	 * @generated
	 */
	EClass getWiiRawByteReqCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd <em>Wii Read Memory Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Read Memory Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd
	 * @generated
	 */
	EClass getWiiReadMemoryReqCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd#getOffset()
	 * @see #getWiiReadMemoryReqCmd()
	 * @generated
	 */
	EAttribute getWiiReadMemoryReqCmd_Offset();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd#getSize()
	 * @see #getWiiReadMemoryReqCmd()
	 * @generated
	 */
	EAttribute getWiiReadMemoryReqCmd_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiReadRegisterReqCmd <em>Wii Read Register Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Read Register Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReadRegisterReqCmd
	 * @generated
	 */
	EClass getWiiReadRegisterReqCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiCalibrationReqCmd <em>Wii Calibration Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Calibration Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationReqCmd
	 * @generated
	 */
	EClass getWiiCalibrationReqCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd <em>Wii Player LED Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Player LED Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd
	 * @generated
	 */
	EClass getWiiPlayerLEDReqCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd#getLedByte <em>Led Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Led Byte</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd#getLedByte()
	 * @see #getWiiPlayerLEDReqCmd()
	 * @generated
	 */
	EAttribute getWiiPlayerLEDReqCmd_LedByte();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd <em>Wii Report Mode Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Report Mode Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd
	 * @generated
	 */
	EClass getWiiReportModeReqCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x20 <em>DATA REPORT 0x20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x20</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x20()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x20();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x21 <em>DATA REPORT 0x21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x21</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x21()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x21();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x30 <em>DATA REPORT 0x30</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x30</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x30()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x30();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x31 <em>DATA REPORT 0x31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x31</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x31()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x31();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x32 <em>DATA REPORT 0x32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x32</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x32()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x32();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x33 <em>DATA REPORT 0x33</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x33</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x33()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x33();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x34 <em>DATA REPORT 0x34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x34</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x34()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x34();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x35 <em>DATA REPORT 0x35</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x35</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x35()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x35();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x36 <em>DATA REPORT 0x36</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x36</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x36()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x36();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x37 <em>DATA REPORT 0x37</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x37</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x37()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x37();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3d <em>DATA REPORT 0x3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x3d</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3d()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x3d();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3e <em>DATA REPORT 0x3e</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x3e</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3e()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x3e();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3f <em>DATA REPORT 0x3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DATA REPORT 0x3f</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3f()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_DATA_REPORT_0x3f();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getMode()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#isContinuous <em>Continuous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continuous</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiReportModeReqCmd#isContinuous()
	 * @see #getWiiReportModeReqCmd()
	 * @generated
	 */
	EAttribute getWiiReportModeReqCmd_Continuous();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiRumbleReqCmd <em>Wii Rumble Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Rumble Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiRumbleReqCmd
	 * @generated
	 */
	EClass getWiiRumbleReqCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiRumbleReqCmd#getLedByte <em>Led Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Led Byte</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiRumbleReqCmd#getLedByte()
	 * @see #getWiiRumbleReqCmd()
	 * @generated
	 */
	EAttribute getWiiRumbleReqCmd_LedByte();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiRumbleReqCmd#getMillis <em>Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Millis</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiRumbleReqCmd#getMillis()
	 * @see #getWiiRumbleReqCmd()
	 * @generated
	 */
	EAttribute getWiiRumbleReqCmd_Millis();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReqCmd <em>Wii Status Info Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Status Info Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReqCmd
	 * @generated
	 */
	EClass getWiiStatusInfoReqCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiRegisterReqCmd <em>Wii Register Req Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Register Req Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiRegisterReqCmd
	 * @generated
	 */
	EClass getWiiRegisterReqCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt <em>Wii Core Button Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Core Button Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt
	 * @generated
	 */
	EClass getWiiCoreButtonEvt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getNO_BUTTON <em>NO BUTTON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NO BUTTON</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getNO_BUTTON()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_NO_BUTTON();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getD_PAD_LEFT <em>DPAD LEFT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DPAD LEFT</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getD_PAD_LEFT()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_D_PAD_LEFT();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getD_PAD_RIGHT <em>DPAD RIGHT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DPAD RIGHT</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getD_PAD_RIGHT()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_D_PAD_RIGHT();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getD_PAD_UP <em>DPAD UP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DPAD UP</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getD_PAD_UP()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_D_PAD_UP();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getD_PAD_DOWN <em>DPAD DOWN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DPAD DOWN</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getD_PAD_DOWN()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_D_PAD_DOWN();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_ONE <em>BUTTON ONE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BUTTON ONE</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_ONE()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_BUTTON_ONE();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_TWO <em>BUTTON TWO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BUTTON TWO</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_TWO()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_BUTTON_TWO();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_A <em>BUTTON A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BUTTON A</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_A()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_BUTTON_A();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_B <em>BUTTON B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BUTTON B</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_B()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_BUTTON_B();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_PLUS <em>BUTTON PLUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BUTTON PLUS</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_PLUS()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_BUTTON_PLUS();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_MINUS <em>BUTTON MINUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BUTTON MINUS</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_MINUS()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_BUTTON_MINUS();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_HOME <em>BUTTON HOME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BUTTON HOME</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getBUTTON_HOME()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_BUTTON_HOME();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifiers</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCoreButtonEvt#getModifiers()
	 * @see #getWiiCoreButtonEvt()
	 * @generated
	 */
	EAttribute getWiiCoreButtonEvt_Modifiers();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiDataEvt <em>Wii Data Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Data Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiDataEvt
	 * @generated
	 */
	EClass getWiiDataEvt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiDataEvt#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiDataEvt#getAddress()
	 * @see #getWiiDataEvt()
	 * @generated
	 */
	EAttribute getWiiDataEvt_Address();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiDataEvt#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiDataEvt#getPayload()
	 * @see #getWiiDataEvt()
	 * @generated
	 */
	EAttribute getWiiDataEvt_Payload();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiDataEvt#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiDataEvt#getError()
	 * @see #getWiiDataEvt()
	 * @generated
	 */
	EAttribute getWiiDataEvt_Error();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiExtEvt <em>Wii Ext Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Ext Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiExtEvt
	 * @generated
	 */
	EClass getWiiExtEvt();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiIREvt <em>Wii IR Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii IR Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiIREvt
	 * @generated
	 */
	EClass getWiiIREvt();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiDisconectedEvt <em>Wii Disconected Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Disconected Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiDisconectedEvt
	 * @generated
	 */
	EClass getWiiDisconectedEvt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiDisconectedEvt#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiDisconectedEvt#getExtension()
	 * @see #getWiiDisconectedEvt()
	 * @generated
	 */
	EAttribute getWiiDisconectedEvt_Extension();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiimoteDevice <em>Wiimote Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiimote Device</em>'.
	 * @see net.sf.smbt.ezwiimote.WiimoteDevice
	 * @generated
	 */
	EClass getWiimoteDevice();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezwiimote.WiimoteDevice#getInfoReport <em>Info Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Report</em>'.
	 * @see net.sf.smbt.ezwiimote.WiimoteDevice#getInfoReport()
	 * @see #getWiimoteDevice()
	 * @generated
	 */
	EReference getWiimoteDevice_InfoReport();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezwiimote.WiimoteDevice#getCalibratonDataReport <em>Calibraton Data Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calibraton Data Report</em>'.
	 * @see net.sf.smbt.ezwiimote.WiimoteDevice#getCalibratonDataReport()
	 * @see #getWiimoteDevice()
	 * @generated
	 */
	EReference getWiimoteDevice_CalibratonDataReport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiimoteDevice#getBtaddress <em>Btaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btaddress</em>'.
	 * @see net.sf.smbt.ezwiimote.WiimoteDevice#getBtaddress()
	 * @see #getWiimoteDevice()
	 * @generated
	 */
	EAttribute getWiimoteDevice_Btaddress();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport <em>Wii Status Info Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Status Info Report</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReport
	 * @generated
	 */
	EClass getWiiStatusInfoReport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isExtensionControllerConnected <em>Extension Controller Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Controller Connected</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReport#isExtensionControllerConnected()
	 * @see #getWiiStatusInfoReport()
	 * @generated
	 */
	EAttribute getWiiStatusInfoReport_ExtensionControllerConnected();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isSpeakerEnabled <em>Speaker Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speaker Enabled</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReport#isSpeakerEnabled()
	 * @see #getWiiStatusInfoReport()
	 * @generated
	 */
	EAttribute getWiiStatusInfoReport_SpeakerEnabled();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isContinuousReportingEnabled <em>Continuous Reporting Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continuous Reporting Enabled</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReport#isContinuousReportingEnabled()
	 * @see #getWiiStatusInfoReport()
	 * @generated
	 */
	EAttribute getWiiStatusInfoReport_ContinuousReportingEnabled();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#getLedEnabled <em>Led Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Led Enabled</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReport#getLedEnabled()
	 * @see #getWiiStatusInfoReport()
	 * @generated
	 */
	EAttribute getWiiStatusInfoReport_LedEnabled();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#getBatteryLevel <em>Battery Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Level</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiStatusInfoReport#getBatteryLevel()
	 * @see #getWiiStatusInfoReport()
	 * @generated
	 */
	EAttribute getWiiStatusInfoReport_BatteryLevel();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiCalibrationDataReport <em>Wii Calibration Data Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Calibration Data Report</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationDataReport
	 * @generated
	 */
	EClass getWiiCalibrationDataReport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getZeroX <em>Zero X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero X</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getZeroX()
	 * @see #getWiiCalibrationDataReport()
	 * @generated
	 */
	EAttribute getWiiCalibrationDataReport_ZeroX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getZeroY <em>Zero Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero Y</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getZeroY()
	 * @see #getWiiCalibrationDataReport()
	 * @generated
	 */
	EAttribute getWiiCalibrationDataReport_ZeroY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getZeroZ <em>Zero Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero Z</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getZeroZ()
	 * @see #getWiiCalibrationDataReport()
	 * @generated
	 */
	EAttribute getWiiCalibrationDataReport_ZeroZ();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getGravityX <em>Gravity X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity X</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getGravityX()
	 * @see #getWiiCalibrationDataReport()
	 * @generated
	 */
	EAttribute getWiiCalibrationDataReport_GravityX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getGravityY <em>Gravity Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity Y</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getGravityY()
	 * @see #getWiiCalibrationDataReport()
	 * @generated
	 */
	EAttribute getWiiCalibrationDataReport_GravityY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getGravityZ <em>Gravity Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity Z</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiCalibrationDataReport#getGravityZ()
	 * @see #getWiiCalibrationDataReport()
	 * @generated
	 */
	EAttribute getWiiCalibrationDataReport_GravityZ();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiAccelEvt <em>Wii Accel Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Accel Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAccelEvt
	 * @generated
	 */
	EClass getWiiAccelEvt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiAccelEvt#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAccelEvt#getX()
	 * @see #getWiiAccelEvt()
	 * @generated
	 */
	EAttribute getWiiAccelEvt_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiAccelEvt#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAccelEvt#getY()
	 * @see #getWiiAccelEvt()
	 * @generated
	 */
	EAttribute getWiiAccelEvt_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiAccelEvt#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAccelEvt#getZ()
	 * @see #getWiiAccelEvt()
	 * @generated
	 */
	EAttribute getWiiAccelEvt_Z();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiAccelEvt#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAccelEvt#getSource()
	 * @see #getWiiAccelEvt()
	 * @generated
	 */
	EAttribute getWiiAccelEvt_Source();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiWriteRegisterReq <em>Wii Write Register Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Write Register Req</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiWriteRegisterReq
	 * @generated
	 */
	EClass getWiiWriteRegisterReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiMultiCmd <em>Wii Multi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Multi Cmd</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiMultiCmd
	 * @generated
	 */
	EClass getWiiMultiCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiConnectedEvt <em>Wii Connected Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Connected Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiConnectedEvt
	 * @generated
	 */
	EClass getWiiConnectedEvt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiConnectedEvt#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiConnectedEvt#getExtension()
	 * @see #getWiiConnectedEvt()
	 * @generated
	 */
	EAttribute getWiiConnectedEvt_Extension();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiLeftAnalogStickEvent <em>Wii Left Analog Stick Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Left Analog Stick Event</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiLeftAnalogStickEvent
	 * @generated
	 */
	EClass getWiiLeftAnalogStickEvent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiRightAnalogStickEvent <em>Wii Right Analog Stick Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Right Analog Stick Event</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiRightAnalogStickEvent
	 * @generated
	 */
	EClass getWiiRightAnalogStickEvent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiLeftAnalogTriggerEvent <em>Wii Left Analog Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Left Analog Trigger Event</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiLeftAnalogTriggerEvent
	 * @generated
	 */
	EClass getWiiLeftAnalogTriggerEvent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiRightAnalogTriggerEvent <em>Wii Right Analog Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Right Analog Trigger Event</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiRightAnalogTriggerEvent
	 * @generated
	 */
	EClass getWiiRightAnalogTriggerEvent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiAnalogStickEvent <em>Wii Analog Stick Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Analog Stick Event</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAnalogStickEvent
	 * @generated
	 */
	EClass getWiiAnalogStickEvent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiAnalogStickEvent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAnalogStickEvent#getX()
	 * @see #getWiiAnalogStickEvent()
	 * @generated
	 */
	EAttribute getWiiAnalogStickEvent_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiAnalogStickEvent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAnalogStickEvent#getY()
	 * @see #getWiiAnalogStickEvent()
	 * @generated
	 */
	EAttribute getWiiAnalogStickEvent_Y();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent <em>Wii Analog Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Analog Trigger Event</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent
	 * @generated
	 */
	EClass getWiiAnalogTriggerEvent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent#getTrigger()
	 * @see #getWiiAnalogTriggerEvent()
	 * @generated
	 */
	EAttribute getWiiAnalogTriggerEvent_Trigger();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt <em>Wii Nunchuk Button Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Nunchuk Button Evt</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiNunchukButtonEvt
	 * @generated
	 */
	EClass getWiiNunchukButtonEvt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getC_BUTTON <em>CBUTTON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CBUTTON</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getC_BUTTON()
	 * @see #getWiiNunchukButtonEvt()
	 * @generated
	 */
	EAttribute getWiiNunchukButtonEvt_C_BUTTON();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getZ_BUTTON <em>ZBUTTON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZBUTTON</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getZ_BUTTON()
	 * @see #getWiiNunchukButtonEvt()
	 * @generated
	 */
	EAttribute getWiiNunchukButtonEvt_Z_BUTTON();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getNO_BUTTON <em>NO BUTTON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NO BUTTON</em>'.
	 * @see net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getNO_BUTTON()
	 * @see #getWiiNunchukButtonEvt()
	 * @generated
	 */
	EAttribute getWiiNunchukButtonEvt_NO_BUTTON();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezwiimote.IrCameraMode <em>Ir Camera Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ir Camera Mode</em>'.
	 * @see net.sf.smbt.ezwiimote.IrCameraMode
	 * @generated
	 */
	EEnum getIrCameraMode();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezwiimote.BUTTON_CODE <em>BUTTON CODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BUTTON CODE</em>'.
	 * @see net.sf.smbt.ezwiimote.BUTTON_CODE
	 * @generated
	 */
	EEnum getBUTTON_CODE();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Wii Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wii Extension</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getWiiExtension();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzwiimoteFactory getEzwiimoteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiCmdImpl <em>Wii Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiCmd()
		 * @generated
		 */
		EClass WII_CMD = eINSTANCE.getWiiCmd();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CMD__TAG = eINSTANCE.getWiiCmd_Tag();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CMD__BYTES = eINSTANCE.getWiiCmd_Bytes();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiEvtImpl <em>Wii Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiEvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiEvt()
		 * @generated
		 */
		EClass WII_EVT = eINSTANCE.getWiiEvt();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiReqCmdImpl <em>Wii Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiReqCmd()
		 * @generated
		 */
		EClass WII_REQ_CMD = eINSTANCE.getWiiReqCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiMoteReqCmdImpl <em>Wii Mote Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiMoteReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiMoteReqCmd()
		 * @generated
		 */
		EClass WII_MOTE_REQ_CMD = eINSTANCE.getWiiMoteReqCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiRawByteReqCmdImpl <em>Wii Raw Byte Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiRawByteReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRawByteReqCmd()
		 * @generated
		 */
		EClass WII_RAW_BYTE_REQ_CMD = eINSTANCE.getWiiRawByteReqCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiReadMemoryReqCmdImpl <em>Wii Read Memory Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiReadMemoryReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiReadMemoryReqCmd()
		 * @generated
		 */
		EClass WII_READ_MEMORY_REQ_CMD = eINSTANCE.getWiiReadMemoryReqCmd();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_READ_MEMORY_REQ_CMD__OFFSET = eINSTANCE.getWiiReadMemoryReqCmd_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_READ_MEMORY_REQ_CMD__SIZE = eINSTANCE.getWiiReadMemoryReqCmd_Size();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiReadRegisterReqCmdImpl <em>Wii Read Register Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiReadRegisterReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiReadRegisterReqCmd()
		 * @generated
		 */
		EClass WII_READ_REGISTER_REQ_CMD = eINSTANCE.getWiiReadRegisterReqCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationReqCmdImpl <em>Wii Calibration Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiCalibrationReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiCalibrationReqCmd()
		 * @generated
		 */
		EClass WII_CALIBRATION_REQ_CMD = eINSTANCE.getWiiCalibrationReqCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiPlayerLEDReqCmdImpl <em>Wii Player LED Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiPlayerLEDReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiPlayerLEDReqCmd()
		 * @generated
		 */
		EClass WII_PLAYER_LED_REQ_CMD = eINSTANCE.getWiiPlayerLEDReqCmd();

		/**
		 * The meta object literal for the '<em><b>Led Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_PLAYER_LED_REQ_CMD__LED_BYTE = eINSTANCE.getWiiPlayerLEDReqCmd_LedByte();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl <em>Wii Report Mode Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiReportModeReqCmd()
		 * @generated
		 */
		EClass WII_REPORT_MODE_REQ_CMD = eINSTANCE.getWiiReportModeReqCmd();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x20</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X20 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x20();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X21 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x21();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x30</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X30 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x30();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X31 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x31();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X32 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x32();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x33</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X33 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x33();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X34 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x34();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x35</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X35 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x35();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x36</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X36 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x36();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x37</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X37 = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x37();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x3d</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3D = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x3d();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x3e</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3E = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x3e();

		/**
		 * The meta object literal for the '<em><b>DATA REPORT 0x3f</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3F = eINSTANCE.getWiiReportModeReqCmd_DATA_REPORT_0x3f();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__MODE = eINSTANCE.getWiiReportModeReqCmd_Mode();

		/**
		 * The meta object literal for the '<em><b>Continuous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_REPORT_MODE_REQ_CMD__CONTINUOUS = eINSTANCE.getWiiReportModeReqCmd_Continuous();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiRumbleReqCmdImpl <em>Wii Rumble Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiRumbleReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRumbleReqCmd()
		 * @generated
		 */
		EClass WII_RUMBLE_REQ_CMD = eINSTANCE.getWiiRumbleReqCmd();

		/**
		 * The meta object literal for the '<em><b>Led Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_RUMBLE_REQ_CMD__LED_BYTE = eINSTANCE.getWiiRumbleReqCmd_LedByte();

		/**
		 * The meta object literal for the '<em><b>Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_RUMBLE_REQ_CMD__MILLIS = eINSTANCE.getWiiRumbleReqCmd_Millis();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReqCmdImpl <em>Wii Status Info Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiStatusInfoReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiStatusInfoReqCmd()
		 * @generated
		 */
		EClass WII_STATUS_INFO_REQ_CMD = eINSTANCE.getWiiStatusInfoReqCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiRegisterReqCmdImpl <em>Wii Register Req Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiRegisterReqCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRegisterReqCmd()
		 * @generated
		 */
		EClass WII_REGISTER_REQ_CMD = eINSTANCE.getWiiRegisterReqCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl <em>Wii Core Button Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiCoreButtonEvt()
		 * @generated
		 */
		EClass WII_CORE_BUTTON_EVT = eINSTANCE.getWiiCoreButtonEvt();

		/**
		 * The meta object literal for the '<em><b>NO BUTTON</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__NO_BUTTON = eINSTANCE.getWiiCoreButtonEvt_NO_BUTTON();

		/**
		 * The meta object literal for the '<em><b>DPAD LEFT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__DPAD_LEFT = eINSTANCE.getWiiCoreButtonEvt_D_PAD_LEFT();

		/**
		 * The meta object literal for the '<em><b>DPAD RIGHT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__DPAD_RIGHT = eINSTANCE.getWiiCoreButtonEvt_D_PAD_RIGHT();

		/**
		 * The meta object literal for the '<em><b>DPAD UP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__DPAD_UP = eINSTANCE.getWiiCoreButtonEvt_D_PAD_UP();

		/**
		 * The meta object literal for the '<em><b>DPAD DOWN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__DPAD_DOWN = eINSTANCE.getWiiCoreButtonEvt_D_PAD_DOWN();

		/**
		 * The meta object literal for the '<em><b>BUTTON ONE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__BUTTON_ONE = eINSTANCE.getWiiCoreButtonEvt_BUTTON_ONE();

		/**
		 * The meta object literal for the '<em><b>BUTTON TWO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__BUTTON_TWO = eINSTANCE.getWiiCoreButtonEvt_BUTTON_TWO();

		/**
		 * The meta object literal for the '<em><b>BUTTON A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__BUTTON_A = eINSTANCE.getWiiCoreButtonEvt_BUTTON_A();

		/**
		 * The meta object literal for the '<em><b>BUTTON B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__BUTTON_B = eINSTANCE.getWiiCoreButtonEvt_BUTTON_B();

		/**
		 * The meta object literal for the '<em><b>BUTTON PLUS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__BUTTON_PLUS = eINSTANCE.getWiiCoreButtonEvt_BUTTON_PLUS();

		/**
		 * The meta object literal for the '<em><b>BUTTON MINUS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__BUTTON_MINUS = eINSTANCE.getWiiCoreButtonEvt_BUTTON_MINUS();

		/**
		 * The meta object literal for the '<em><b>BUTTON HOME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__BUTTON_HOME = eINSTANCE.getWiiCoreButtonEvt_BUTTON_HOME();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CORE_BUTTON_EVT__MODIFIERS = eINSTANCE.getWiiCoreButtonEvt_Modifiers();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiDataEvtImpl <em>Wii Data Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiDataEvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiDataEvt()
		 * @generated
		 */
		EClass WII_DATA_EVT = eINSTANCE.getWiiDataEvt();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_DATA_EVT__ADDRESS = eINSTANCE.getWiiDataEvt_Address();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_DATA_EVT__PAYLOAD = eINSTANCE.getWiiDataEvt_Payload();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_DATA_EVT__ERROR = eINSTANCE.getWiiDataEvt_Error();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiExtEvtImpl <em>Wii Ext Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiExtEvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiExtEvt()
		 * @generated
		 */
		EClass WII_EXT_EVT = eINSTANCE.getWiiExtEvt();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiIREvtImpl <em>Wii IR Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiIREvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiIREvt()
		 * @generated
		 */
		EClass WII_IR_EVT = eINSTANCE.getWiiIREvt();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiDisconectedEvtImpl <em>Wii Disconected Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiDisconectedEvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiDisconectedEvt()
		 * @generated
		 */
		EClass WII_DISCONECTED_EVT = eINSTANCE.getWiiDisconectedEvt();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_DISCONECTED_EVT__EXTENSION = eINSTANCE.getWiiDisconectedEvt_Extension();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiimoteDeviceImpl <em>Wiimote Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiimoteDeviceImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiimoteDevice()
		 * @generated
		 */
		EClass WIIMOTE_DEVICE = eINSTANCE.getWiimoteDevice();

		/**
		 * The meta object literal for the '<em><b>Info Report</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_DEVICE__INFO_REPORT = eINSTANCE.getWiimoteDevice_InfoReport();

		/**
		 * The meta object literal for the '<em><b>Calibraton Data Report</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_DEVICE__CALIBRATON_DATA_REPORT = eINSTANCE.getWiimoteDevice_CalibratonDataReport();

		/**
		 * The meta object literal for the '<em><b>Btaddress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIIMOTE_DEVICE__BTADDRESS = eINSTANCE.getWiimoteDevice_Btaddress();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl <em>Wii Status Info Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiStatusInfoReportImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiStatusInfoReport()
		 * @generated
		 */
		EClass WII_STATUS_INFO_REPORT = eINSTANCE.getWiiStatusInfoReport();

		/**
		 * The meta object literal for the '<em><b>Extension Controller Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_STATUS_INFO_REPORT__EXTENSION_CONTROLLER_CONNECTED = eINSTANCE.getWiiStatusInfoReport_ExtensionControllerConnected();

		/**
		 * The meta object literal for the '<em><b>Speaker Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_STATUS_INFO_REPORT__SPEAKER_ENABLED = eINSTANCE.getWiiStatusInfoReport_SpeakerEnabled();

		/**
		 * The meta object literal for the '<em><b>Continuous Reporting Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_STATUS_INFO_REPORT__CONTINUOUS_REPORTING_ENABLED = eINSTANCE.getWiiStatusInfoReport_ContinuousReportingEnabled();

		/**
		 * The meta object literal for the '<em><b>Led Enabled</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_STATUS_INFO_REPORT__LED_ENABLED = eINSTANCE.getWiiStatusInfoReport_LedEnabled();

		/**
		 * The meta object literal for the '<em><b>Battery Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_STATUS_INFO_REPORT__BATTERY_LEVEL = eINSTANCE.getWiiStatusInfoReport_BatteryLevel();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl <em>Wii Calibration Data Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiCalibrationDataReport()
		 * @generated
		 */
		EClass WII_CALIBRATION_DATA_REPORT = eINSTANCE.getWiiCalibrationDataReport();

		/**
		 * The meta object literal for the '<em><b>Zero X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CALIBRATION_DATA_REPORT__ZERO_X = eINSTANCE.getWiiCalibrationDataReport_ZeroX();

		/**
		 * The meta object literal for the '<em><b>Zero Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CALIBRATION_DATA_REPORT__ZERO_Y = eINSTANCE.getWiiCalibrationDataReport_ZeroY();

		/**
		 * The meta object literal for the '<em><b>Zero Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CALIBRATION_DATA_REPORT__ZERO_Z = eINSTANCE.getWiiCalibrationDataReport_ZeroZ();

		/**
		 * The meta object literal for the '<em><b>Gravity X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CALIBRATION_DATA_REPORT__GRAVITY_X = eINSTANCE.getWiiCalibrationDataReport_GravityX();

		/**
		 * The meta object literal for the '<em><b>Gravity Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CALIBRATION_DATA_REPORT__GRAVITY_Y = eINSTANCE.getWiiCalibrationDataReport_GravityY();

		/**
		 * The meta object literal for the '<em><b>Gravity Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CALIBRATION_DATA_REPORT__GRAVITY_Z = eINSTANCE.getWiiCalibrationDataReport_GravityZ();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiAccelEvtImpl <em>Wii Accel Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiAccelEvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiAccelEvt()
		 * @generated
		 */
		EClass WII_ACCEL_EVT = eINSTANCE.getWiiAccelEvt();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_EVT__X = eINSTANCE.getWiiAccelEvt_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_EVT__Y = eINSTANCE.getWiiAccelEvt_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_EVT__Z = eINSTANCE.getWiiAccelEvt_Z();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_EVT__SOURCE = eINSTANCE.getWiiAccelEvt_Source();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiWriteRegisterReqImpl <em>Wii Write Register Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiWriteRegisterReqImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiWriteRegisterReq()
		 * @generated
		 */
		EClass WII_WRITE_REGISTER_REQ = eINSTANCE.getWiiWriteRegisterReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiMultiCmdImpl <em>Wii Multi Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiMultiCmdImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiMultiCmd()
		 * @generated
		 */
		EClass WII_MULTI_CMD = eINSTANCE.getWiiMultiCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiConnectedEvtImpl <em>Wii Connected Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiConnectedEvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiConnectedEvt()
		 * @generated
		 */
		EClass WII_CONNECTED_EVT = eINSTANCE.getWiiConnectedEvt();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_CONNECTED_EVT__EXTENSION = eINSTANCE.getWiiConnectedEvt_Extension();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiLeftAnalogStickEventImpl <em>Wii Left Analog Stick Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiLeftAnalogStickEventImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiLeftAnalogStickEvent()
		 * @generated
		 */
		EClass WII_LEFT_ANALOG_STICK_EVENT = eINSTANCE.getWiiLeftAnalogStickEvent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiRightAnalogStickEventImpl <em>Wii Right Analog Stick Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiRightAnalogStickEventImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRightAnalogStickEvent()
		 * @generated
		 */
		EClass WII_RIGHT_ANALOG_STICK_EVENT = eINSTANCE.getWiiRightAnalogStickEvent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiLeftAnalogTriggerEventImpl <em>Wii Left Analog Trigger Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiLeftAnalogTriggerEventImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiLeftAnalogTriggerEvent()
		 * @generated
		 */
		EClass WII_LEFT_ANALOG_TRIGGER_EVENT = eINSTANCE.getWiiLeftAnalogTriggerEvent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiRightAnalogTriggerEventImpl <em>Wii Right Analog Trigger Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiRightAnalogTriggerEventImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiRightAnalogTriggerEvent()
		 * @generated
		 */
		EClass WII_RIGHT_ANALOG_TRIGGER_EVENT = eINSTANCE.getWiiRightAnalogTriggerEvent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiAnalogStickEventImpl <em>Wii Analog Stick Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiAnalogStickEventImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiAnalogStickEvent()
		 * @generated
		 */
		EClass WII_ANALOG_STICK_EVENT = eINSTANCE.getWiiAnalogStickEvent();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ANALOG_STICK_EVENT__X = eINSTANCE.getWiiAnalogStickEvent_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ANALOG_STICK_EVENT__Y = eINSTANCE.getWiiAnalogStickEvent_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiAnalogTriggerEventImpl <em>Wii Analog Trigger Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiAnalogTriggerEventImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiAnalogTriggerEvent()
		 * @generated
		 */
		EClass WII_ANALOG_TRIGGER_EVENT = eINSTANCE.getWiiAnalogTriggerEvent();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ANALOG_TRIGGER_EVENT__TRIGGER = eINSTANCE.getWiiAnalogTriggerEvent_Trigger();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.impl.WiiNunchukButtonEvtImpl <em>Wii Nunchuk Button Evt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.impl.WiiNunchukButtonEvtImpl
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiNunchukButtonEvt()
		 * @generated
		 */
		EClass WII_NUNCHUK_BUTTON_EVT = eINSTANCE.getWiiNunchukButtonEvt();

		/**
		 * The meta object literal for the '<em><b>CBUTTON</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_BUTTON_EVT__CBUTTON = eINSTANCE.getWiiNunchukButtonEvt_C_BUTTON();

		/**
		 * The meta object literal for the '<em><b>ZBUTTON</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_BUTTON_EVT__ZBUTTON = eINSTANCE.getWiiNunchukButtonEvt_Z_BUTTON();

		/**
		 * The meta object literal for the '<em><b>NO BUTTON</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_BUTTON_EVT__NO_BUTTON = eINSTANCE.getWiiNunchukButtonEvt_NO_BUTTON();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.IrCameraMode <em>Ir Camera Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.IrCameraMode
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getIrCameraMode()
		 * @generated
		 */
		EEnum IR_CAMERA_MODE = eINSTANCE.getIrCameraMode();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezwiimote.BUTTON_CODE <em>BUTTON CODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezwiimote.BUTTON_CODE
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getBUTTON_CODE()
		 * @generated
		 */
		EEnum BUTTON_CODE = eINSTANCE.getBUTTON_CODE();

		/**
		 * The meta object literal for the '<em>Wii Extension</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see net.sf.smbt.ezwiimote.impl.EzwiimotePackageImpl#getWiiExtension()
		 * @generated
		 */
		EDataType WII_EXTENSION = eINSTANCE.getWiiExtension();

	}

} //EzwiimotePackage
