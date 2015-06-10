/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.BFLCmd;
import net.sf.smbt.bitforcev2.BFLCmdKind;
import net.sf.smbt.bitforcev2.Bitforcev2Factory;
import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.JobResultsKnd;
import net.sf.smbt.bitforcev2.ZDXFullRangeJob;
import net.sf.smbt.bitforcev2.ZPXCustomRangeJob;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bitforcev2PackageImpl extends EPackageImpl implements Bitforcev2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bflCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zgxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zcxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zmxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ztxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zjxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zfxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zdxFullRangeJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zpxCustomRangeJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zdxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zpxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass znxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zqxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass okEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass koEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bflCmdKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobResultsKndEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum msgEEnum = null;

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
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bitforcev2PackageImpl() {
		super(eNS_URI, Bitforcev2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bitforcev2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bitforcev2Package init() {
		if (isInited) return (Bitforcev2Package)EPackage.Registry.INSTANCE.getEPackage(Bitforcev2Package.eNS_URI);

		// Obtain or create and register package
		Bitforcev2PackageImpl theBitforcev2Package = (Bitforcev2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bitforcev2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bitforcev2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBitforcev2Package.createPackageContents();

		// Initialize created meta-data
		theBitforcev2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBitforcev2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bitforcev2Package.eNS_URI, theBitforcev2Package);
		return theBitforcev2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBFLCmd() {
		return bflCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBFLCmd_Kind() {
		return (EAttribute)bflCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBFLCmd_Addr() {
		return (EAttribute)bflCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBFLCmd_Header() {
		return (EAttribute)bflCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBFLCmd_Length() {
		return (EAttribute)bflCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBFLCmd_Data() {
		return (EAttribute)bflCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZGX() {
		return zgxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZGX_Major() {
		return (EAttribute)zgxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZGX_Minor() {
		return (EAttribute)zgxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZCX() {
		return zcxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_Device() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_Firmware() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_Engines() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_JobsQueue() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_ResultsQueue() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_XlinkMode() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_XlinkStatus() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_DevicesInChain() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZCX_Status() {
		return (EAttribute)zcxEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZMX() {
		return zmxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZTX() {
		return ztxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZTX_V3_3() {
		return (EAttribute)ztxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZTX_V1_0() {
		return (EAttribute)ztxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZTX_VccMain() {
		return (EAttribute)ztxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZLX() {
		return zlxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZLX_Temperature1() {
		return (EAttribute)zlxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZLX_Temperature2() {
		return (EAttribute)zlxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZJX() {
		return zjxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZJX_FirmwareVersion() {
		return (EAttribute)zjxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZFX() {
		return zfxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZFX_ResultKind() {
		return (EAttribute)zfxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZFX_Nonces() {
		return (EAttribute)zfxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZDXFullRangeJob() {
		return zdxFullRangeJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZDXFullRangeJob_DataSize() {
		return (EAttribute)zdxFullRangeJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZDXFullRangeJob_MidState() {
		return (EAttribute)zdxFullRangeJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZDXFullRangeJob_BlockState() {
		return (EAttribute)zdxFullRangeJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZDXFullRangeJob_EOB() {
		return (EAttribute)zdxFullRangeJobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZPXCustomRangeJob() {
		return zpxCustomRangeJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZPXCustomRangeJob_DataSize() {
		return (EAttribute)zpxCustomRangeJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZPXCustomRangeJob_MidState() {
		return (EAttribute)zpxCustomRangeJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZPXCustomRangeJob_BlockData() {
		return (EAttribute)zpxCustomRangeJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZPXCustomRangeJob_NonceBegin() {
		return (EAttribute)zpxCustomRangeJobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZPXCustomRangeJob_NonceEnd() {
		return (EAttribute)zpxCustomRangeJobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZPXCustomRangeJob_EOB() {
		return (EAttribute)zpxCustomRangeJobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZDX() {
		return zdxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZPX() {
		return zpxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZNX() {
		return znxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZNX_DataSize() {
		return (EAttribute)znxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZNX_MidState() {
		return (EAttribute)znxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZNX_BlockData() {
		return (EAttribute)znxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZNX_EOB() {
		return (EAttribute)znxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZOX() {
		return zoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZOX_Count() {
		return (EAttribute)zoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZOX_Lines() {
		return (EAttribute)zoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZOX_Status() {
		return (EAttribute)zoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZQX() {
		return zqxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOK() {
		return okEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOK_Msg() {
		return (EAttribute)okEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKO() {
		return koEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKO_Error() {
		return (EAttribute)koEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBFLCmdKind() {
		return bflCmdKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJobResultsKnd() {
		return jobResultsKndEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getERR() {
		return errEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMSG() {
		return msgEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bitforcev2Factory getBitforcev2Factory() {
		return (Bitforcev2Factory)getEFactoryInstance();
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
		bflCmdEClass = createEClass(BFL_CMD);
		createEAttribute(bflCmdEClass, BFL_CMD__KIND);
		createEAttribute(bflCmdEClass, BFL_CMD__ADDR);
		createEAttribute(bflCmdEClass, BFL_CMD__HEADER);
		createEAttribute(bflCmdEClass, BFL_CMD__LENGTH);
		createEAttribute(bflCmdEClass, BFL_CMD__DATA);

		zgxEClass = createEClass(ZGX);
		createEAttribute(zgxEClass, ZGX__MAJOR);
		createEAttribute(zgxEClass, ZGX__MINOR);

		zcxEClass = createEClass(ZCX);
		createEAttribute(zcxEClass, ZCX__DEVICE);
		createEAttribute(zcxEClass, ZCX__FIRMWARE);
		createEAttribute(zcxEClass, ZCX__ENGINES);
		createEAttribute(zcxEClass, ZCX__JOBS_QUEUE);
		createEAttribute(zcxEClass, ZCX__RESULTS_QUEUE);
		createEAttribute(zcxEClass, ZCX__XLINK_MODE);
		createEAttribute(zcxEClass, ZCX__XLINK_STATUS);
		createEAttribute(zcxEClass, ZCX__DEVICES_IN_CHAIN);
		createEAttribute(zcxEClass, ZCX__STATUS);

		zmxEClass = createEClass(ZMX);

		ztxEClass = createEClass(ZTX);
		createEAttribute(ztxEClass, ZTX__V3_3);
		createEAttribute(ztxEClass, ZTX__V1_0);
		createEAttribute(ztxEClass, ZTX__VCC_MAIN);

		zlxEClass = createEClass(ZLX);
		createEAttribute(zlxEClass, ZLX__TEMPERATURE1);
		createEAttribute(zlxEClass, ZLX__TEMPERATURE2);

		zjxEClass = createEClass(ZJX);
		createEAttribute(zjxEClass, ZJX__FIRMWARE_VERSION);

		zfxEClass = createEClass(ZFX);
		createEAttribute(zfxEClass, ZFX__RESULT_KIND);
		createEAttribute(zfxEClass, ZFX__NONCES);

		zdxFullRangeJobEClass = createEClass(ZDX_FULL_RANGE_JOB);
		createEAttribute(zdxFullRangeJobEClass, ZDX_FULL_RANGE_JOB__DATA_SIZE);
		createEAttribute(zdxFullRangeJobEClass, ZDX_FULL_RANGE_JOB__MID_STATE);
		createEAttribute(zdxFullRangeJobEClass, ZDX_FULL_RANGE_JOB__BLOCK_STATE);
		createEAttribute(zdxFullRangeJobEClass, ZDX_FULL_RANGE_JOB__EOB);

		zpxCustomRangeJobEClass = createEClass(ZPX_CUSTOM_RANGE_JOB);
		createEAttribute(zpxCustomRangeJobEClass, ZPX_CUSTOM_RANGE_JOB__DATA_SIZE);
		createEAttribute(zpxCustomRangeJobEClass, ZPX_CUSTOM_RANGE_JOB__MID_STATE);
		createEAttribute(zpxCustomRangeJobEClass, ZPX_CUSTOM_RANGE_JOB__BLOCK_DATA);
		createEAttribute(zpxCustomRangeJobEClass, ZPX_CUSTOM_RANGE_JOB__NONCE_BEGIN);
		createEAttribute(zpxCustomRangeJobEClass, ZPX_CUSTOM_RANGE_JOB__NONCE_END);
		createEAttribute(zpxCustomRangeJobEClass, ZPX_CUSTOM_RANGE_JOB__EOB);

		znxEClass = createEClass(ZNX);
		createEAttribute(znxEClass, ZNX__DATA_SIZE);
		createEAttribute(znxEClass, ZNX__MID_STATE);
		createEAttribute(znxEClass, ZNX__BLOCK_DATA);
		createEAttribute(znxEClass, ZNX__EOB);

		zoxEClass = createEClass(ZOX);
		createEAttribute(zoxEClass, ZOX__COUNT);
		createEAttribute(zoxEClass, ZOX__LINES);
		createEAttribute(zoxEClass, ZOX__STATUS);

		zqxEClass = createEClass(ZQX);

		okEClass = createEClass(OK);
		createEAttribute(okEClass, OK__MSG);

		koEClass = createEClass(KO);
		createEAttribute(koEClass, KO__ERROR);

		zdxEClass = createEClass(ZDX);

		zpxEClass = createEClass(ZPX);

		// Create enums
		bflCmdKindEEnum = createEEnum(BFL_CMD_KIND);
		jobResultsKndEEnum = createEEnum(JOB_RESULTS_KND);
		errEEnum = createEEnum(ERR);
		msgEEnum = createEEnum(MSG);
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
		bflCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		zgxEClass.getESuperTypes().add(this.getBFLCmd());
		zcxEClass.getESuperTypes().add(this.getBFLCmd());
		zmxEClass.getESuperTypes().add(this.getBFLCmd());
		ztxEClass.getESuperTypes().add(this.getBFLCmd());
		zlxEClass.getESuperTypes().add(this.getBFLCmd());
		zjxEClass.getESuperTypes().add(this.getBFLCmd());
		zfxEClass.getESuperTypes().add(this.getBFLCmd());
		zdxFullRangeJobEClass.getESuperTypes().add(this.getBFLCmd());
		zpxCustomRangeJobEClass.getESuperTypes().add(this.getBFLCmd());
		znxEClass.getESuperTypes().add(this.getBFLCmd());
		zoxEClass.getESuperTypes().add(this.getBFLCmd());
		zqxEClass.getESuperTypes().add(this.getBFLCmd());
		okEClass.getESuperTypes().add(this.getBFLCmd());
		koEClass.getESuperTypes().add(this.getBFLCmd());
		zdxEClass.getESuperTypes().add(this.getBFLCmd());
		zpxEClass.getESuperTypes().add(this.getBFLCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(bflCmdEClass, BFLCmd.class, "BFLCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBFLCmd_Kind(), this.getBFLCmdKind(), "kind", null, 0, 1, BFLCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBFLCmd_Addr(), ecorePackage.getEByte(), "addr", null, 0, 1, BFLCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBFLCmd_Header(), ecorePackage.getEByte(), "header", null, 0, 1, BFLCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBFLCmd_Length(), ecorePackage.getEByte(), "length", null, 0, 1, BFLCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBFLCmd_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, BFLCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zgxEClass, net.sf.smbt.bitforcev2.ZGX.class, "ZGX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZGX_Major(), ecorePackage.getEInt(), "major", null, 0, 1, net.sf.smbt.bitforcev2.ZGX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZGX_Minor(), ecorePackage.getEInt(), "minor", null, 0, 1, net.sf.smbt.bitforcev2.ZGX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zcxEClass, net.sf.smbt.bitforcev2.ZCX.class, "ZCX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZCX_Device(), ecorePackage.getEString(), "device", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZCX_Firmware(), ecorePackage.getEString(), "firmware", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZCX_Engines(), ecorePackage.getEString(), "engines", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZCX_JobsQueue(), ecorePackage.getEString(), "jobsQueue", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZCX_ResultsQueue(), ecorePackage.getEString(), "resultsQueue", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZCX_XlinkMode(), ecorePackage.getEString(), "xlinkMode", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZCX_XlinkStatus(), ecorePackage.getEString(), "xlinkStatus", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZCX_DevicesInChain(), ecorePackage.getEString(), "devicesInChain", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZCX_Status(), ecorePackage.getEString(), "status", null, 0, 1, net.sf.smbt.bitforcev2.ZCX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zmxEClass, net.sf.smbt.bitforcev2.ZMX.class, "ZMX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ztxEClass, net.sf.smbt.bitforcev2.ZTX.class, "ZTX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZTX_V3_3(), ecorePackage.getEString(), "v3_3", null, 0, 1, net.sf.smbt.bitforcev2.ZTX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZTX_V1_0(), ecorePackage.getEString(), "v1_0", null, 0, 1, net.sf.smbt.bitforcev2.ZTX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZTX_VccMain(), ecorePackage.getEString(), "vccMain", null, 0, 1, net.sf.smbt.bitforcev2.ZTX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlxEClass, net.sf.smbt.bitforcev2.ZLX.class, "ZLX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZLX_Temperature1(), ecorePackage.getEInt(), "temperature1", null, 0, 1, net.sf.smbt.bitforcev2.ZLX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZLX_Temperature2(), ecorePackage.getEInt(), "temperature2", null, 0, 1, net.sf.smbt.bitforcev2.ZLX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zjxEClass, net.sf.smbt.bitforcev2.ZJX.class, "ZJX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZJX_FirmwareVersion(), ecorePackage.getEString(), "firmwareVersion", null, 0, 1, net.sf.smbt.bitforcev2.ZJX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zfxEClass, net.sf.smbt.bitforcev2.ZFX.class, "ZFX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZFX_ResultKind(), this.getJobResultsKnd(), "resultKind", null, 0, 1, net.sf.smbt.bitforcev2.ZFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZFX_Nonces(), ecorePackage.getEString(), "nonces", null, 0, -1, net.sf.smbt.bitforcev2.ZFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zdxFullRangeJobEClass, ZDXFullRangeJob.class, "ZDXFullRangeJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZDXFullRangeJob_DataSize(), ecorePackage.getEByte(), "dataSize", null, 0, 1, ZDXFullRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZDXFullRangeJob_MidState(), ecorePackage.getEByteArray(), "midState", null, 0, 1, ZDXFullRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZDXFullRangeJob_BlockState(), ecorePackage.getEByteArray(), "blockState", null, 0, 1, ZDXFullRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZDXFullRangeJob_EOB(), ecorePackage.getEByte(), "EOB", null, 0, 1, ZDXFullRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zpxCustomRangeJobEClass, ZPXCustomRangeJob.class, "ZPXCustomRangeJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZPXCustomRangeJob_DataSize(), ecorePackage.getEByte(), "dataSize", null, 0, 1, ZPXCustomRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZPXCustomRangeJob_MidState(), ecorePackage.getEByteArray(), "midState", null, 0, 1, ZPXCustomRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZPXCustomRangeJob_BlockData(), ecorePackage.getEByteArray(), "blockData", null, 0, 1, ZPXCustomRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZPXCustomRangeJob_NonceBegin(), ecorePackage.getEByteArray(), "nonceBegin", null, 0, 1, ZPXCustomRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZPXCustomRangeJob_NonceEnd(), ecorePackage.getEByteArray(), "nonceEnd", null, 0, 1, ZPXCustomRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZPXCustomRangeJob_EOB(), ecorePackage.getEByte(), "EOB", null, 0, 1, ZPXCustomRangeJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(znxEClass, net.sf.smbt.bitforcev2.ZNX.class, "ZNX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZNX_DataSize(), ecorePackage.getEByte(), "dataSize", null, 0, 1, net.sf.smbt.bitforcev2.ZNX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZNX_MidState(), ecorePackage.getEByteArray(), "midState", null, 0, 1, net.sf.smbt.bitforcev2.ZNX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZNX_BlockData(), ecorePackage.getEByteArray(), "blockData", null, 0, 1, net.sf.smbt.bitforcev2.ZNX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZNX_EOB(), ecorePackage.getEByte(), "EOB", null, 0, 1, net.sf.smbt.bitforcev2.ZNX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoxEClass, net.sf.smbt.bitforcev2.ZOX.class, "ZOX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZOX_Count(), ecorePackage.getEInt(), "count", null, 0, 1, net.sf.smbt.bitforcev2.ZOX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZOX_Lines(), ecorePackage.getEString(), "lines", null, 0, -1, net.sf.smbt.bitforcev2.ZOX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZOX_Status(), ecorePackage.getEString(), "status", null, 0, 1, net.sf.smbt.bitforcev2.ZOX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zqxEClass, net.sf.smbt.bitforcev2.ZQX.class, "ZQX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(okEClass, net.sf.smbt.bitforcev2.OK.class, "OK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOK_Msg(), this.getMSG(), "msg", null, 0, 1, net.sf.smbt.bitforcev2.OK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(koEClass, net.sf.smbt.bitforcev2.KO.class, "KO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKO_Error(), this.getERR(), "error", null, 0, 1, net.sf.smbt.bitforcev2.KO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zdxEClass, net.sf.smbt.bitforcev2.ZDX.class, "ZDX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zpxEClass, net.sf.smbt.bitforcev2.ZPX.class, "ZPX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(bflCmdKindEEnum, BFLCmdKind.class, "BFLCmdKind");
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZGX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZCX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZMX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZTX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZLX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZJX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZFX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZDX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZPX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZNX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZOX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZQX);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.OK);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.KO);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.NONE);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZDX_FULL_RANGE);
		addEEnumLiteral(bflCmdKindEEnum, BFLCmdKind.ZPX_CUSTOM_RANGE);

		initEEnum(jobResultsKndEEnum, JobResultsKnd.class, "JobResultsKnd");
		addEEnumLiteral(jobResultsKndEEnum, JobResultsKnd.BUSY);
		addEEnumLiteral(jobResultsKndEEnum, JobResultsKnd.IDLE);
		addEEnumLiteral(jobResultsKndEEnum, JobResultsKnd.NO_ONCE);
		addEEnumLiteral(jobResultsKndEEnum, JobResultsKnd.NONCE_FOUND);

		initEEnum(errEEnum, net.sf.smbt.bitforcev2.ERR.class, "ERR");
		addEEnumLiteral(errEEnum, net.sf.smbt.bitforcev2.ERR.QUEUE_FULL);
		addEEnumLiteral(errEEnum, net.sf.smbt.bitforcev2.ERR.TIMEOUT);
		addEEnumLiteral(errEEnum, net.sf.smbt.bitforcev2.ERR.SIGNATURE);

		initEEnum(msgEEnum, net.sf.smbt.bitforcev2.MSG.class, "MSG");
		addEEnumLiteral(msgEEnum, net.sf.smbt.bitforcev2.MSG.QUEUED);

		// Create resource
		createResource(eNS_URI);
	}

} //Bitforcev2PackageImpl
