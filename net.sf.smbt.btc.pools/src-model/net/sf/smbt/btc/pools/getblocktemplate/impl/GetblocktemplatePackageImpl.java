/**
 */
package net.sf.smbt.btc.pools.getblocktemplate.impl;

import net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd;
import net.sf.smbt.btc.pools.getblocktemplate.GetblocktemplateFactory;
import net.sf.smbt.btc.pools.getblocktemplate.GetblocktemplatePackage;
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
public class GetblocktemplatePackageImpl extends EPackageImpl implements GetblocktemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getBlockTemplateCmdEClass = null;

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
	 * @see net.sf.smbt.btc.pools.getblocktemplate.GetblocktemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GetblocktemplatePackageImpl() {
		super(eNS_URI, GetblocktemplateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GetblocktemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GetblocktemplatePackage init() {
		if (isInited) return (GetblocktemplatePackage)EPackage.Registry.INSTANCE.getEPackage(GetblocktemplatePackage.eNS_URI);

		// Obtain or create and register package
		GetblocktemplatePackageImpl theGetblocktemplatePackage = (GetblocktemplatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GetblocktemplatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GetblocktemplatePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HttpcmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGetblocktemplatePackage.createPackageContents();

		// Initialize created meta-data
		theGetblocktemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGetblocktemplatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GetblocktemplatePackage.eNS_URI, theGetblocktemplatePackage);
		return theGetblocktemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetBlockTemplateCmd() {
		return getBlockTemplateCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetBlockTemplateCmd_JsonSnd() {
		return (EAttribute)getBlockTemplateCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetBlockTemplateCmd_JsonRcv() {
		return (EAttribute)getBlockTemplateCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetblocktemplateFactory getGetblocktemplateFactory() {
		return (GetblocktemplateFactory)getEFactoryInstance();
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
		getBlockTemplateCmdEClass = createEClass(GET_BLOCK_TEMPLATE_CMD);
		createEAttribute(getBlockTemplateCmdEClass, GET_BLOCK_TEMPLATE_CMD__JSON_SND);
		createEAttribute(getBlockTemplateCmdEClass, GET_BLOCK_TEMPLATE_CMD__JSON_RCV);
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
		getBlockTemplateCmdEClass.getESuperTypes().add(theHttpcmdPackage.getHttpCommCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(getBlockTemplateCmdEClass, GetBlockTemplateCmd.class, "GetBlockTemplateCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetBlockTemplateCmd_JsonSnd(), ecorePackage.getEString(), "jsonSnd", null, 0, 1, GetBlockTemplateCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetBlockTemplateCmd_JsonRcv(), ecorePackage.getEString(), "jsonRcv", null, 0, 1, GetBlockTemplateCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GetblocktemplatePackageImpl
