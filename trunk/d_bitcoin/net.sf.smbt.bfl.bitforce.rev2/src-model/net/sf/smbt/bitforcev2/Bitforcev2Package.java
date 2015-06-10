/**
 */
package net.sf.smbt.bitforcev2;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see net.sf.smbt.bitforcev2.Bitforcev2Factory
 * @model kind="package"
 * @generated
 */
public interface Bitforcev2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bitforcev2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bitforcev2/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bitforcev2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bitforcev2Package eINSTANCE = net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.BFLCmdImpl <em>BFL Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.BFLCmdImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getBFLCmd()
	 * @generated
	 */
	int BFL_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFL_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFL_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFL_CMD__KIND = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFL_CMD__ADDR = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFL_CMD__HEADER = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFL_CMD__LENGTH = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFL_CMD__DATA = CmdPackage.CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BFL Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFL_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZGXImpl <em>ZGX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZGXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZGX()
	 * @generated
	 */
	int ZGX = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__MAJOR = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX__MINOR = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZGX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZCXImpl <em>ZCX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZCXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZCX()
	 * @generated
	 */
	int ZCX = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__DEVICE = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firmware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__FIRMWARE = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__ENGINES = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jobs Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__JOBS_QUEUE = BFL_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Results Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__RESULTS_QUEUE = BFL_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xlink Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__XLINK_MODE = BFL_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Xlink Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__XLINK_STATUS = BFL_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Devices In Chain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__DEVICES_IN_CHAIN = BFL_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX__STATUS = BFL_CMD_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>ZCX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZMXImpl <em>ZMX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZMXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZMX()
	 * @generated
	 */
	int ZMX = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMX__DATA = BFL_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ZMX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZTXImpl <em>ZTX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZTXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZTX()
	 * @generated
	 */
	int ZTX = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>V3 3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__V3_3 = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>V1 0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__V1_0 = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vcc Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX__VCC_MAIN = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ZTX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZLXImpl <em>ZLX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZLXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZLX()
	 * @generated
	 */
	int ZLX = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Temperature1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__TEMPERATURE1 = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temperature2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX__TEMPERATURE2 = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZLX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZJXImpl <em>ZJX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZJXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZJX()
	 * @generated
	 */
	int ZJX = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX__FIRMWARE_VERSION = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZJX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZJX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZFXImpl <em>ZFX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZFXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZFX()
	 * @generated
	 */
	int ZFX = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Result Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__RESULT_KIND = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nonces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX__NONCES = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZFX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZDXFullRangeJobImpl <em>ZDX Full Range Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZDXFullRangeJobImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZDXFullRangeJob()
	 * @generated
	 */
	int ZDX_FULL_RANGE_JOB = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__DATA_SIZE = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mid State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__MID_STATE = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__BLOCK_STATE = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB__EOB = BFL_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ZDX Full Range Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FULL_RANGE_JOB_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZPXCustomRangeJobImpl <em>ZPX Custom Range Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZPXCustomRangeJobImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZPXCustomRangeJob()
	 * @generated
	 */
	int ZPX_CUSTOM_RANGE_JOB = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__DATA_SIZE = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mid State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__MID_STATE = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__BLOCK_DATA = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nonce Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__NONCE_BEGIN = BFL_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nonce End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__NONCE_END = BFL_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EOB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB__EOB = BFL_CMD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ZPX Custom Range Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_CUSTOM_RANGE_JOB_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZDXImpl <em>ZDX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZDXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZDX()
	 * @generated
	 */
	int ZDX = 15;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZPXImpl <em>ZPX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZPXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZPX()
	 * @generated
	 */
	int ZPX = 16;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZNXImpl <em>ZNX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZNXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZNX()
	 * @generated
	 */
	int ZNX = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__DATA_SIZE = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mid State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__MID_STATE = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__BLOCK_DATA = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX__EOB = BFL_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ZNX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZOXImpl <em>ZOX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZOXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZOX()
	 * @generated
	 */
	int ZOX = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__COUNT = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__LINES = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX__STATUS = BFL_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ZOX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.ZQXImpl <em>ZQX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.ZQXImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZQX()
	 * @generated
	 */
	int ZQX = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZQX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZQX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZQX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZQX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZQX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZQX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZQX__DATA = BFL_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ZQX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZQX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.OKImpl <em>OK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.OKImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getOK()
	 * @generated
	 */
	int OK = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__MSG = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.impl.KOImpl <em>KO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.impl.KOImpl
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getKO()
	 * @generated
	 */
	int KO = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__DATA = BFL_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO__ERROR = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KO_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX__DATA = BFL_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ZDX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX__PRIORITY = BFL_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX__STAMP = BFL_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX__KIND = BFL_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX__ADDR = BFL_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX__HEADER = BFL_CMD__HEADER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX__LENGTH = BFL_CMD__LENGTH;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX__DATA = BFL_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ZPX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZPX_FEATURE_COUNT = BFL_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.BFLCmdKind <em>BFL Cmd Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.BFLCmdKind
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getBFLCmdKind()
	 * @generated
	 */
	int BFL_CMD_KIND = 17;


	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.JobResultsKnd <em>Job Results Knd</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.JobResultsKnd
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getJobResultsKnd()
	 * @generated
	 */
	int JOB_RESULTS_KND = 18;


	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.ERR <em>ERR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.ERR
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getERR()
	 * @generated
	 */
	int ERR = 19;

	/**
	 * The meta object id for the '{@link net.sf.smbt.bitforcev2.MSG <em>MSG</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.bitforcev2.MSG
	 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getMSG()
	 * @generated
	 */
	int MSG = 20;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.BFLCmd <em>BFL Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFL Cmd</em>'.
	 * @see net.sf.smbt.bitforcev2.BFLCmd
	 * @generated
	 */
	EClass getBFLCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.BFLCmd#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.bitforcev2.BFLCmd#getKind()
	 * @see #getBFLCmd()
	 * @generated
	 */
	EAttribute getBFLCmd_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.BFLCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.bitforcev2.BFLCmd#getAddr()
	 * @see #getBFLCmd()
	 * @generated
	 */
	EAttribute getBFLCmd_Addr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.BFLCmd#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see net.sf.smbt.bitforcev2.BFLCmd#getHeader()
	 * @see #getBFLCmd()
	 * @generated
	 */
	EAttribute getBFLCmd_Header();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.BFLCmd#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.smbt.bitforcev2.BFLCmd#getLength()
	 * @see #getBFLCmd()
	 * @generated
	 */
	EAttribute getBFLCmd_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.BFLCmd#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.bitforcev2.BFLCmd#getData()
	 * @see #getBFLCmd()
	 * @generated
	 */
	EAttribute getBFLCmd_Data();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZGX <em>ZGX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZGX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZGX
	 * @generated
	 */
	EClass getZGX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZGX#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see net.sf.smbt.bitforcev2.ZGX#getMajor()
	 * @see #getZGX()
	 * @generated
	 */
	EAttribute getZGX_Major();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZGX#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see net.sf.smbt.bitforcev2.ZGX#getMinor()
	 * @see #getZGX()
	 * @generated
	 */
	EAttribute getZGX_Minor();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZCX <em>ZCX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZCX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX
	 * @generated
	 */
	EClass getZCX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getDevice()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_Device();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getFirmware <em>Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getFirmware()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_Firmware();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engines</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getEngines()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_Engines();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getJobsQueue <em>Jobs Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs Queue</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getJobsQueue()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_JobsQueue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getResultsQueue <em>Results Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results Queue</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getResultsQueue()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_ResultsQueue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getXlinkMode <em>Xlink Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xlink Mode</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getXlinkMode()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_XlinkMode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getXlinkStatus <em>Xlink Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xlink Status</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getXlinkStatus()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_XlinkStatus();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getDevicesInChain <em>Devices In Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Devices In Chain</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getDevicesInChain()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_DevicesInChain();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZCX#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.bitforcev2.ZCX#getStatus()
	 * @see #getZCX()
	 * @generated
	 */
	EAttribute getZCX_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZMX <em>ZMX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZMX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZMX
	 * @generated
	 */
	EClass getZMX();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZTX <em>ZTX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZTX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZTX
	 * @generated
	 */
	EClass getZTX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZTX#getV3_3 <em>V3 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V3 3</em>'.
	 * @see net.sf.smbt.bitforcev2.ZTX#getV3_3()
	 * @see #getZTX()
	 * @generated
	 */
	EAttribute getZTX_V3_3();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZTX#getV1_0 <em>V1 0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V1 0</em>'.
	 * @see net.sf.smbt.bitforcev2.ZTX#getV1_0()
	 * @see #getZTX()
	 * @generated
	 */
	EAttribute getZTX_V1_0();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZTX#getVccMain <em>Vcc Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcc Main</em>'.
	 * @see net.sf.smbt.bitforcev2.ZTX#getVccMain()
	 * @see #getZTX()
	 * @generated
	 */
	EAttribute getZTX_VccMain();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZLX <em>ZLX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZLX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZLX
	 * @generated
	 */
	EClass getZLX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZLX#getTemperature1 <em>Temperature1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature1</em>'.
	 * @see net.sf.smbt.bitforcev2.ZLX#getTemperature1()
	 * @see #getZLX()
	 * @generated
	 */
	EAttribute getZLX_Temperature1();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZLX#getTemperature2 <em>Temperature2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature2</em>'.
	 * @see net.sf.smbt.bitforcev2.ZLX#getTemperature2()
	 * @see #getZLX()
	 * @generated
	 */
	EAttribute getZLX_Temperature2();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZJX <em>ZJX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZJX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZJX
	 * @generated
	 */
	EClass getZJX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZJX#getFirmwareVersion <em>Firmware Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware Version</em>'.
	 * @see net.sf.smbt.bitforcev2.ZJX#getFirmwareVersion()
	 * @see #getZJX()
	 * @generated
	 */
	EAttribute getZJX_FirmwareVersion();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZFX <em>ZFX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZFX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZFX
	 * @generated
	 */
	EClass getZFX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZFX#getResultKind <em>Result Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Kind</em>'.
	 * @see net.sf.smbt.bitforcev2.ZFX#getResultKind()
	 * @see #getZFX()
	 * @generated
	 */
	EAttribute getZFX_ResultKind();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.bitforcev2.ZFX#getNonces <em>Nonces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nonces</em>'.
	 * @see net.sf.smbt.bitforcev2.ZFX#getNonces()
	 * @see #getZFX()
	 * @generated
	 */
	EAttribute getZFX_Nonces();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob <em>ZDX Full Range Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZDX Full Range Job</em>'.
	 * @see net.sf.smbt.bitforcev2.ZDXFullRangeJob
	 * @generated
	 */
	EClass getZDXFullRangeJob();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see net.sf.smbt.bitforcev2.ZDXFullRangeJob#getDataSize()
	 * @see #getZDXFullRangeJob()
	 * @generated
	 */
	EAttribute getZDXFullRangeJob_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getMidState <em>Mid State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid State</em>'.
	 * @see net.sf.smbt.bitforcev2.ZDXFullRangeJob#getMidState()
	 * @see #getZDXFullRangeJob()
	 * @generated
	 */
	EAttribute getZDXFullRangeJob_MidState();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getBlockState <em>Block State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block State</em>'.
	 * @see net.sf.smbt.bitforcev2.ZDXFullRangeJob#getBlockState()
	 * @see #getZDXFullRangeJob()
	 * @generated
	 */
	EAttribute getZDXFullRangeJob_BlockState();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getEOB <em>EOB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EOB</em>'.
	 * @see net.sf.smbt.bitforcev2.ZDXFullRangeJob#getEOB()
	 * @see #getZDXFullRangeJob()
	 * @generated
	 */
	EAttribute getZDXFullRangeJob_EOB();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZPXCustomRangeJob <em>ZPX Custom Range Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZPX Custom Range Job</em>'.
	 * @see net.sf.smbt.bitforcev2.ZPXCustomRangeJob
	 * @generated
	 */
	EClass getZPXCustomRangeJob();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getDataSize()
	 * @see #getZPXCustomRangeJob()
	 * @generated
	 */
	EAttribute getZPXCustomRangeJob_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getMidState <em>Mid State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid State</em>'.
	 * @see net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getMidState()
	 * @see #getZPXCustomRangeJob()
	 * @generated
	 */
	EAttribute getZPXCustomRangeJob_MidState();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getBlockData <em>Block Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Data</em>'.
	 * @see net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getBlockData()
	 * @see #getZPXCustomRangeJob()
	 * @generated
	 */
	EAttribute getZPXCustomRangeJob_BlockData();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getNonceBegin <em>Nonce Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nonce Begin</em>'.
	 * @see net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getNonceBegin()
	 * @see #getZPXCustomRangeJob()
	 * @generated
	 */
	EAttribute getZPXCustomRangeJob_NonceBegin();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getNonceEnd <em>Nonce End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nonce End</em>'.
	 * @see net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getNonceEnd()
	 * @see #getZPXCustomRangeJob()
	 * @generated
	 */
	EAttribute getZPXCustomRangeJob_NonceEnd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getEOB <em>EOB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EOB</em>'.
	 * @see net.sf.smbt.bitforcev2.ZPXCustomRangeJob#getEOB()
	 * @see #getZPXCustomRangeJob()
	 * @generated
	 */
	EAttribute getZPXCustomRangeJob_EOB();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZDX <em>ZDX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZDX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZDX
	 * @generated
	 */
	EClass getZDX();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZPX <em>ZPX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZPX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZPX
	 * @generated
	 */
	EClass getZPX();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZNX <em>ZNX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZNX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZNX
	 * @generated
	 */
	EClass getZNX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZNX#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see net.sf.smbt.bitforcev2.ZNX#getDataSize()
	 * @see #getZNX()
	 * @generated
	 */
	EAttribute getZNX_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZNX#getMidState <em>Mid State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid State</em>'.
	 * @see net.sf.smbt.bitforcev2.ZNX#getMidState()
	 * @see #getZNX()
	 * @generated
	 */
	EAttribute getZNX_MidState();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZNX#getBlockData <em>Block Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Data</em>'.
	 * @see net.sf.smbt.bitforcev2.ZNX#getBlockData()
	 * @see #getZNX()
	 * @generated
	 */
	EAttribute getZNX_BlockData();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZNX#getEOB <em>EOB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EOB</em>'.
	 * @see net.sf.smbt.bitforcev2.ZNX#getEOB()
	 * @see #getZNX()
	 * @generated
	 */
	EAttribute getZNX_EOB();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZOX <em>ZOX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZOX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZOX
	 * @generated
	 */
	EClass getZOX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZOX#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see net.sf.smbt.bitforcev2.ZOX#getCount()
	 * @see #getZOX()
	 * @generated
	 */
	EAttribute getZOX_Count();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.bitforcev2.ZOX#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lines</em>'.
	 * @see net.sf.smbt.bitforcev2.ZOX#getLines()
	 * @see #getZOX()
	 * @generated
	 */
	EAttribute getZOX_Lines();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.ZOX#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.bitforcev2.ZOX#getStatus()
	 * @see #getZOX()
	 * @generated
	 */
	EAttribute getZOX_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.ZQX <em>ZQX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZQX</em>'.
	 * @see net.sf.smbt.bitforcev2.ZQX
	 * @generated
	 */
	EClass getZQX();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.OK <em>OK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OK</em>'.
	 * @see net.sf.smbt.bitforcev2.OK
	 * @generated
	 */
	EClass getOK();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.OK#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see net.sf.smbt.bitforcev2.OK#getMsg()
	 * @see #getOK()
	 * @generated
	 */
	EAttribute getOK_Msg();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.bitforcev2.KO <em>KO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KO</em>'.
	 * @see net.sf.smbt.bitforcev2.KO
	 * @generated
	 */
	EClass getKO();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.bitforcev2.KO#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see net.sf.smbt.bitforcev2.KO#getError()
	 * @see #getKO()
	 * @generated
	 */
	EAttribute getKO_Error();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.bitforcev2.BFLCmdKind <em>BFL Cmd Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BFL Cmd Kind</em>'.
	 * @see net.sf.smbt.bitforcev2.BFLCmdKind
	 * @generated
	 */
	EEnum getBFLCmdKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.bitforcev2.JobResultsKnd <em>Job Results Knd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Results Knd</em>'.
	 * @see net.sf.smbt.bitforcev2.JobResultsKnd
	 * @generated
	 */
	EEnum getJobResultsKnd();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.bitforcev2.ERR <em>ERR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERR</em>'.
	 * @see net.sf.smbt.bitforcev2.ERR
	 * @generated
	 */
	EEnum getERR();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.bitforcev2.MSG <em>MSG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MSG</em>'.
	 * @see net.sf.smbt.bitforcev2.MSG
	 * @generated
	 */
	EEnum getMSG();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bitforcev2Factory getBitforcev2Factory();

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
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.BFLCmdImpl <em>BFL Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.BFLCmdImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getBFLCmd()
		 * @generated
		 */
		EClass BFL_CMD = eINSTANCE.getBFLCmd();
		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFL_CMD__KIND = eINSTANCE.getBFLCmd_Kind();
		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFL_CMD__ADDR = eINSTANCE.getBFLCmd_Addr();
		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFL_CMD__HEADER = eINSTANCE.getBFLCmd_Header();
		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFL_CMD__LENGTH = eINSTANCE.getBFLCmd_Length();
		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFL_CMD__DATA = eINSTANCE.getBFLCmd_Data();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZGXImpl <em>ZGX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZGXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZGX()
		 * @generated
		 */
		EClass ZGX = eINSTANCE.getZGX();
		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZGX__MAJOR = eINSTANCE.getZGX_Major();
		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZGX__MINOR = eINSTANCE.getZGX_Minor();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZCXImpl <em>ZCX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZCXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZCX()
		 * @generated
		 */
		EClass ZCX = eINSTANCE.getZCX();
		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__DEVICE = eINSTANCE.getZCX_Device();
		/**
		 * The meta object literal for the '<em><b>Firmware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__FIRMWARE = eINSTANCE.getZCX_Firmware();
		/**
		 * The meta object literal for the '<em><b>Engines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__ENGINES = eINSTANCE.getZCX_Engines();
		/**
		 * The meta object literal for the '<em><b>Jobs Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__JOBS_QUEUE = eINSTANCE.getZCX_JobsQueue();
		/**
		 * The meta object literal for the '<em><b>Results Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__RESULTS_QUEUE = eINSTANCE.getZCX_ResultsQueue();
		/**
		 * The meta object literal for the '<em><b>Xlink Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__XLINK_MODE = eINSTANCE.getZCX_XlinkMode();
		/**
		 * The meta object literal for the '<em><b>Xlink Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__XLINK_STATUS = eINSTANCE.getZCX_XlinkStatus();
		/**
		 * The meta object literal for the '<em><b>Devices In Chain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__DEVICES_IN_CHAIN = eINSTANCE.getZCX_DevicesInChain();
		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZCX__STATUS = eINSTANCE.getZCX_Status();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZMXImpl <em>ZMX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZMXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZMX()
		 * @generated
		 */
		EClass ZMX = eINSTANCE.getZMX();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZTXImpl <em>ZTX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZTXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZTX()
		 * @generated
		 */
		EClass ZTX = eINSTANCE.getZTX();
		/**
		 * The meta object literal for the '<em><b>V3 3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZTX__V3_3 = eINSTANCE.getZTX_V3_3();
		/**
		 * The meta object literal for the '<em><b>V1 0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZTX__V1_0 = eINSTANCE.getZTX_V1_0();
		/**
		 * The meta object literal for the '<em><b>Vcc Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZTX__VCC_MAIN = eINSTANCE.getZTX_VccMain();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZLXImpl <em>ZLX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZLXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZLX()
		 * @generated
		 */
		EClass ZLX = eINSTANCE.getZLX();
		/**
		 * The meta object literal for the '<em><b>Temperature1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZLX__TEMPERATURE1 = eINSTANCE.getZLX_Temperature1();
		/**
		 * The meta object literal for the '<em><b>Temperature2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZLX__TEMPERATURE2 = eINSTANCE.getZLX_Temperature2();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZJXImpl <em>ZJX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZJXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZJX()
		 * @generated
		 */
		EClass ZJX = eINSTANCE.getZJX();
		/**
		 * The meta object literal for the '<em><b>Firmware Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZJX__FIRMWARE_VERSION = eINSTANCE.getZJX_FirmwareVersion();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZFXImpl <em>ZFX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZFXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZFX()
		 * @generated
		 */
		EClass ZFX = eINSTANCE.getZFX();
		/**
		 * The meta object literal for the '<em><b>Result Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZFX__RESULT_KIND = eINSTANCE.getZFX_ResultKind();
		/**
		 * The meta object literal for the '<em><b>Nonces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZFX__NONCES = eINSTANCE.getZFX_Nonces();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZDXFullRangeJobImpl <em>ZDX Full Range Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZDXFullRangeJobImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZDXFullRangeJob()
		 * @generated
		 */
		EClass ZDX_FULL_RANGE_JOB = eINSTANCE.getZDXFullRangeJob();
		/**
		 * The meta object literal for the '<em><b>Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZDX_FULL_RANGE_JOB__DATA_SIZE = eINSTANCE.getZDXFullRangeJob_DataSize();
		/**
		 * The meta object literal for the '<em><b>Mid State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZDX_FULL_RANGE_JOB__MID_STATE = eINSTANCE.getZDXFullRangeJob_MidState();
		/**
		 * The meta object literal for the '<em><b>Block State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZDX_FULL_RANGE_JOB__BLOCK_STATE = eINSTANCE.getZDXFullRangeJob_BlockState();
		/**
		 * The meta object literal for the '<em><b>EOB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZDX_FULL_RANGE_JOB__EOB = eINSTANCE.getZDXFullRangeJob_EOB();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZPXCustomRangeJobImpl <em>ZPX Custom Range Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZPXCustomRangeJobImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZPXCustomRangeJob()
		 * @generated
		 */
		EClass ZPX_CUSTOM_RANGE_JOB = eINSTANCE.getZPXCustomRangeJob();
		/**
		 * The meta object literal for the '<em><b>Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZPX_CUSTOM_RANGE_JOB__DATA_SIZE = eINSTANCE.getZPXCustomRangeJob_DataSize();
		/**
		 * The meta object literal for the '<em><b>Mid State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZPX_CUSTOM_RANGE_JOB__MID_STATE = eINSTANCE.getZPXCustomRangeJob_MidState();
		/**
		 * The meta object literal for the '<em><b>Block Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZPX_CUSTOM_RANGE_JOB__BLOCK_DATA = eINSTANCE.getZPXCustomRangeJob_BlockData();
		/**
		 * The meta object literal for the '<em><b>Nonce Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZPX_CUSTOM_RANGE_JOB__NONCE_BEGIN = eINSTANCE.getZPXCustomRangeJob_NonceBegin();
		/**
		 * The meta object literal for the '<em><b>Nonce End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZPX_CUSTOM_RANGE_JOB__NONCE_END = eINSTANCE.getZPXCustomRangeJob_NonceEnd();
		/**
		 * The meta object literal for the '<em><b>EOB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZPX_CUSTOM_RANGE_JOB__EOB = eINSTANCE.getZPXCustomRangeJob_EOB();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZDXImpl <em>ZDX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZDXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZDX()
		 * @generated
		 */
		EClass ZDX = eINSTANCE.getZDX();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZPXImpl <em>ZPX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZPXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZPX()
		 * @generated
		 */
		EClass ZPX = eINSTANCE.getZPX();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZNXImpl <em>ZNX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZNXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZNX()
		 * @generated
		 */
		EClass ZNX = eINSTANCE.getZNX();
		/**
		 * The meta object literal for the '<em><b>Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZNX__DATA_SIZE = eINSTANCE.getZNX_DataSize();
		/**
		 * The meta object literal for the '<em><b>Mid State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZNX__MID_STATE = eINSTANCE.getZNX_MidState();
		/**
		 * The meta object literal for the '<em><b>Block Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZNX__BLOCK_DATA = eINSTANCE.getZNX_BlockData();
		/**
		 * The meta object literal for the '<em><b>EOB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZNX__EOB = eINSTANCE.getZNX_EOB();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZOXImpl <em>ZOX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZOXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZOX()
		 * @generated
		 */
		EClass ZOX = eINSTANCE.getZOX();
		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOX__COUNT = eINSTANCE.getZOX_Count();
		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOX__LINES = eINSTANCE.getZOX_Lines();
		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOX__STATUS = eINSTANCE.getZOX_Status();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.ZQXImpl <em>ZQX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.ZQXImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getZQX()
		 * @generated
		 */
		EClass ZQX = eINSTANCE.getZQX();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.OKImpl <em>OK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.OKImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getOK()
		 * @generated
		 */
		EClass OK = eINSTANCE.getOK();
		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OK__MSG = eINSTANCE.getOK_Msg();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.impl.KOImpl <em>KO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.impl.KOImpl
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getKO()
		 * @generated
		 */
		EClass KO = eINSTANCE.getKO();
		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KO__ERROR = eINSTANCE.getKO_Error();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.BFLCmdKind <em>BFL Cmd Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.BFLCmdKind
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getBFLCmdKind()
		 * @generated
		 */
		EEnum BFL_CMD_KIND = eINSTANCE.getBFLCmdKind();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.JobResultsKnd <em>Job Results Knd</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.JobResultsKnd
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getJobResultsKnd()
		 * @generated
		 */
		EEnum JOB_RESULTS_KND = eINSTANCE.getJobResultsKnd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.ERR <em>ERR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.ERR
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getERR()
		 * @generated
		 */
		EEnum ERR = eINSTANCE.getERR();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.bitforcev2.MSG <em>MSG</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.bitforcev2.MSG
		 * @see net.sf.smbt.bitforcev2.impl.Bitforcev2PackageImpl#getMSG()
		 * @generated
		 */
		EEnum MSG = eINSTANCE.getMSG();

	}

} //Bitforcev2Package
