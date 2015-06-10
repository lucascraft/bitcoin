/**
 */
package net.sf.smbt.btc.pools.getwork.impl;

import net.sf.smbt.btc.pools.getwork.GetworkCmd;
import net.sf.smbt.btc.pools.getwork.GetworkFactory;
import net.sf.smbt.btc.pools.getwork.GetworkPackage;
import net.sf.smbt.btc.pools.getwork.WorkStateTmp;
import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GetworkPackageImpl extends EPackageImpl implements GetworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getworkCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workStateTmpEClass = null;

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
	 * @see net.sf.smbt.btc.pools.getwork.GetworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GetworkPackageImpl() {
		super(eNS_URI, GetworkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GetworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GetworkPackage init() {
		if (isInited) return (GetworkPackage)EPackage.Registry.INSTANCE.getEPackage(GetworkPackage.eNS_URI);

		// Obtain or create and register package
		GetworkPackageImpl theGetworkPackage = (GetworkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GetworkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GetworkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HttpcmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGetworkPackage.createPackageContents();

		// Initialize created meta-data
		theGetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGetworkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GetworkPackage.eNS_URI, theGetworkPackage);
		return theGetworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetworkCmd() {
		return getworkCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetworkCmd_JsonSnd() {
		return (EAttribute)getworkCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetworkCmd_JsonRcv() {
		return (EAttribute)getworkCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkStateTmp() {
		return workStateTmpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkStateTmp_MidStates() {
		return (EAttribute)workStateTmpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkStateTmp_Targets() {
		return (EAttribute)workStateTmpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkStateTmp_Data() {
		return (EAttribute)workStateTmpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetworkFactory getGetworkFactory() {
		return (GetworkFactory)getEFactoryInstance();
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
		getworkCmdEClass = createEClass(GETWORK_CMD);
		createEAttribute(getworkCmdEClass, GETWORK_CMD__JSON_SND);
		createEAttribute(getworkCmdEClass, GETWORK_CMD__JSON_RCV);

		workStateTmpEClass = createEClass(WORK_STATE_TMP);
		createEAttribute(workStateTmpEClass, WORK_STATE_TMP__MID_STATES);
		createEAttribute(workStateTmpEClass, WORK_STATE_TMP__TARGETS);
		createEAttribute(workStateTmpEClass, WORK_STATE_TMP__DATA);
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
		HttpcmdPackage theHttpcmdPackage = (HttpcmdPackage)EPackage.Registry.INSTANCE.getEPackage(HttpcmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		getworkCmdEClass.getESuperTypes().add(theHttpcmdPackage.getHttpCommCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(getworkCmdEClass, GetworkCmd.class, "GetworkCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetworkCmd_JsonSnd(), ecorePackage.getEString(), "jsonSnd", null, 0, 1, GetworkCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetworkCmd_JsonRcv(), ecorePackage.getEString(), "jsonRcv", null, 0, 1, GetworkCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workStateTmpEClass, WorkStateTmp.class, "WorkStateTmp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkStateTmp_MidStates(), ecorePackage.getEInt(), "midStates", null, 0, -1, WorkStateTmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkStateTmp_Targets(), ecorePackage.getELong(), "targets", null, 0, -1, WorkStateTmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkStateTmp_Data(), ecorePackage.getEInt(), "data", null, 0, -1, WorkStateTmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GetworkPackageImpl
