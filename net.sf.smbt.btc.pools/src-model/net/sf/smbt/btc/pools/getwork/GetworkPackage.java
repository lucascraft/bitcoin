/**
 */
package net.sf.smbt.btc.pools.getwork;

import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.btc.pools.getwork.GetworkFactory
 * @model kind="package"
 * @generated
 */
public interface GetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "getwork";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://getwork/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "getwork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GetworkPackage eINSTANCE = net.sf.smbt.btc.pools.getwork.impl.GetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.getwork.impl.GetworkCmdImpl <em>Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.getwork.impl.GetworkCmdImpl
	 * @see net.sf.smbt.btc.pools.getwork.impl.GetworkPackageImpl#getGetworkCmd()
	 * @generated
	 */
	int GETWORK_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETWORK_CMD__PRIORITY = HttpcmdPackage.HTTP_COMM_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETWORK_CMD__STAMP = HttpcmdPackage.HTTP_COMM_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETWORK_CMD__PROPERTIES = HttpcmdPackage.HTTP_COMM_CMD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETWORK_CMD__METHOD = HttpcmdPackage.HTTP_COMM_CMD__METHOD;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETWORK_CMD__COMMAND = HttpcmdPackage.HTTP_COMM_CMD__COMMAND;

	/**
	 * The feature id for the '<em><b>Json Snd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETWORK_CMD__JSON_SND = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Json Rcv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETWORK_CMD__JSON_RCV = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETWORK_CMD_FEATURE_COUNT = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.getwork.impl.WorkStateTmpImpl <em>Work State Tmp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.getwork.impl.WorkStateTmpImpl
	 * @see net.sf.smbt.btc.pools.getwork.impl.GetworkPackageImpl#getWorkStateTmp()
	 * @generated
	 */
	int WORK_STATE_TMP = 1;

	/**
	 * The feature id for the '<em><b>Mid States</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATE_TMP__MID_STATES = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATE_TMP__TARGETS = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATE_TMP__DATA = 2;

	/**
	 * The number of structural features of the '<em>Work State Tmp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_STATE_TMP_FEATURE_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.getwork.GetworkCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd</em>'.
	 * @see net.sf.smbt.btc.pools.getwork.GetworkCmd
	 * @generated
	 */
	EClass getGetworkCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.getwork.GetworkCmd#getJsonSnd <em>Json Snd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Snd</em>'.
	 * @see net.sf.smbt.btc.pools.getwork.GetworkCmd#getJsonSnd()
	 * @see #getGetworkCmd()
	 * @generated
	 */
	EAttribute getGetworkCmd_JsonSnd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.getwork.GetworkCmd#getJsonRcv <em>Json Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Rcv</em>'.
	 * @see net.sf.smbt.btc.pools.getwork.GetworkCmd#getJsonRcv()
	 * @see #getGetworkCmd()
	 * @generated
	 */
	EAttribute getGetworkCmd_JsonRcv();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.getwork.WorkStateTmp <em>Work State Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work State Tmp</em>'.
	 * @see net.sf.smbt.btc.pools.getwork.WorkStateTmp
	 * @generated
	 */
	EClass getWorkStateTmp();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.btc.pools.getwork.WorkStateTmp#getMidStates <em>Mid States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mid States</em>'.
	 * @see net.sf.smbt.btc.pools.getwork.WorkStateTmp#getMidStates()
	 * @see #getWorkStateTmp()
	 * @generated
	 */
	EAttribute getWorkStateTmp_MidStates();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.btc.pools.getwork.WorkStateTmp#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Targets</em>'.
	 * @see net.sf.smbt.btc.pools.getwork.WorkStateTmp#getTargets()
	 * @see #getWorkStateTmp()
	 * @generated
	 */
	EAttribute getWorkStateTmp_Targets();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.btc.pools.getwork.WorkStateTmp#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see net.sf.smbt.btc.pools.getwork.WorkStateTmp#getData()
	 * @see #getWorkStateTmp()
	 * @generated
	 */
	EAttribute getWorkStateTmp_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GetworkFactory getGetworkFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.getwork.impl.GetworkCmdImpl <em>Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.getwork.impl.GetworkCmdImpl
		 * @see net.sf.smbt.btc.pools.getwork.impl.GetworkPackageImpl#getGetworkCmd()
		 * @generated
		 */
		EClass GETWORK_CMD = eINSTANCE.getGetworkCmd();
		/**
		 * The meta object literal for the '<em><b>Json Snd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GETWORK_CMD__JSON_SND = eINSTANCE.getGetworkCmd_JsonSnd();
		/**
		 * The meta object literal for the '<em><b>Json Rcv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GETWORK_CMD__JSON_RCV = eINSTANCE.getGetworkCmd_JsonRcv();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.getwork.impl.WorkStateTmpImpl <em>Work State Tmp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.getwork.impl.WorkStateTmpImpl
		 * @see net.sf.smbt.btc.pools.getwork.impl.GetworkPackageImpl#getWorkStateTmp()
		 * @generated
		 */
		EClass WORK_STATE_TMP = eINSTANCE.getWorkStateTmp();
		/**
		 * The meta object literal for the '<em><b>Mid States</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_STATE_TMP__MID_STATES = eINSTANCE.getWorkStateTmp_MidStates();
		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_STATE_TMP__TARGETS = eINSTANCE.getWorkStateTmp_Targets();
		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_STATE_TMP__DATA = eINSTANCE.getWorkStateTmp_Data();

	}

} //GetworkPackage
