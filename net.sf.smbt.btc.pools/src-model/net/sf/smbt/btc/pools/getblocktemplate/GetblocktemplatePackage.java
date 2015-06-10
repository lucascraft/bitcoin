/**
 */
package net.sf.smbt.btc.pools.getblocktemplate;

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
 * @see net.sf.smbt.btc.pools.getblocktemplate.GetblocktemplateFactory
 * @model kind="package"
 * @generated
 */
public interface GetblocktemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "getblocktemplate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://getblocktemplate/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "getblocktemplate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GetblocktemplatePackage eINSTANCE = net.sf.smbt.btc.pools.getblocktemplate.impl.GetblocktemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.pools.getblocktemplate.impl.GetBlockTemplateCmdImpl <em>Get Block Template Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.pools.getblocktemplate.impl.GetBlockTemplateCmdImpl
	 * @see net.sf.smbt.btc.pools.getblocktemplate.impl.GetblocktemplatePackageImpl#getGetBlockTemplateCmd()
	 * @generated
	 */
	int GET_BLOCK_TEMPLATE_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLOCK_TEMPLATE_CMD__PRIORITY = HttpcmdPackage.HTTP_COMM_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLOCK_TEMPLATE_CMD__STAMP = HttpcmdPackage.HTTP_COMM_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLOCK_TEMPLATE_CMD__PROPERTIES = HttpcmdPackage.HTTP_COMM_CMD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLOCK_TEMPLATE_CMD__METHOD = HttpcmdPackage.HTTP_COMM_CMD__METHOD;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLOCK_TEMPLATE_CMD__COMMAND = HttpcmdPackage.HTTP_COMM_CMD__COMMAND;

	/**
	 * The feature id for the '<em><b>Json Snd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLOCK_TEMPLATE_CMD__JSON_SND = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Json Rcv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLOCK_TEMPLATE_CMD__JSON_RCV = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Block Template Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLOCK_TEMPLATE_CMD_FEATURE_COUNT = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd <em>Get Block Template Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Block Template Cmd</em>'.
	 * @see net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd
	 * @generated
	 */
	EClass getGetBlockTemplateCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd#getJsonSnd <em>Json Snd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Snd</em>'.
	 * @see net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd#getJsonSnd()
	 * @see #getGetBlockTemplateCmd()
	 * @generated
	 */
	EAttribute getGetBlockTemplateCmd_JsonSnd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd#getJsonRcv <em>Json Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Rcv</em>'.
	 * @see net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd#getJsonRcv()
	 * @see #getGetBlockTemplateCmd()
	 * @generated
	 */
	EAttribute getGetBlockTemplateCmd_JsonRcv();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GetblocktemplateFactory getGetblocktemplateFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.btc.pools.getblocktemplate.impl.GetBlockTemplateCmdImpl <em>Get Block Template Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.pools.getblocktemplate.impl.GetBlockTemplateCmdImpl
		 * @see net.sf.smbt.btc.pools.getblocktemplate.impl.GetblocktemplatePackageImpl#getGetBlockTemplateCmd()
		 * @generated
		 */
		EClass GET_BLOCK_TEMPLATE_CMD = eINSTANCE.getGetBlockTemplateCmd();

		/**
		 * The meta object literal for the '<em><b>Json Snd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_BLOCK_TEMPLATE_CMD__JSON_SND = eINSTANCE.getGetBlockTemplateCmd_JsonSnd();

		/**
		 * The meta object literal for the '<em><b>Json Rcv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_BLOCK_TEMPLATE_CMD__JSON_RCV = eINSTANCE.getGetBlockTemplateCmd_JsonRcv();

	}

} //GetblocktemplatePackage
