/**
 */
package net.sf.smbt.btc.node.bitcoind;

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
 * @see net.sf.smbt.btc.node.bitcoind.BitcoindFactory
 * @model kind="package"
 * @generated
 */
public interface BitcoindPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bitcoind";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bitcoind/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bitcoind";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BitcoindPackage eINSTANCE = net.sf.smbt.btc.node.bitcoind.impl.BitcoindPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.node.bitcoind.impl.BitcoinCmdImpl <em>Bitcoin Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.node.bitcoind.impl.BitcoinCmdImpl
	 * @see net.sf.smbt.btc.node.bitcoind.impl.BitcoindPackageImpl#getBitcoinCmd()
	 * @generated
	 */
	int BITCOIN_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD__PRIORITY = HttpcmdPackage.HTTP_COMM_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD__STAMP = HttpcmdPackage.HTTP_COMM_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD__PROPERTIES = HttpcmdPackage.HTTP_COMM_CMD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD__METHOD = HttpcmdPackage.HTTP_COMM_CMD__METHOD;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD__COMMAND = HttpcmdPackage.HTTP_COMM_CMD__COMMAND;

	/**
	 * The feature id for the '<em><b>Json Rcv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD__JSON_RCV = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Json Snd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD__JSON_SND = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Btc Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD__BTC_ADDR = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bitcoin Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_CMD_FEATURE_COUNT = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btc.node.bitcoind.impl.GetInfoCmdImpl <em>Get Info Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.node.bitcoind.impl.GetInfoCmdImpl
	 * @see net.sf.smbt.btc.node.bitcoind.impl.BitcoindPackageImpl#getGetInfoCmd()
	 * @generated
	 */
	int GET_INFO_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__PRIORITY = BITCOIN_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__STAMP = BITCOIN_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__PROPERTIES = BITCOIN_CMD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__METHOD = BITCOIN_CMD__METHOD;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__COMMAND = BITCOIN_CMD__COMMAND;

	/**
	 * The feature id for the '<em><b>Json Rcv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__JSON_RCV = BITCOIN_CMD__JSON_RCV;

	/**
	 * The feature id for the '<em><b>Json Snd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__JSON_SND = BITCOIN_CMD__JSON_SND;

	/**
	 * The feature id for the '<em><b>Btc Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__BTC_ADDR = BITCOIN_CMD__BTC_ADDR;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD__BALANCE = BITCOIN_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Info Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFO_CMD_FEATURE_COUNT = BITCOIN_CMD_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd <em>Bitcoin Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitcoin Cmd</em>'.
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoinCmd
	 * @generated
	 */
	EClass getBitcoinCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getJsonRcv <em>Json Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Rcv</em>'.
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getJsonRcv()
	 * @see #getBitcoinCmd()
	 * @generated
	 */
	EAttribute getBitcoinCmd_JsonRcv();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getJsonSnd <em>Json Snd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Snd</em>'.
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getJsonSnd()
	 * @see #getBitcoinCmd()
	 * @generated
	 */
	EAttribute getBitcoinCmd_JsonSnd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getBtcAddr <em>Btc Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btc Addr</em>'.
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getBtcAddr()
	 * @see #getBitcoinCmd()
	 * @generated
	 */
	EAttribute getBitcoinCmd_BtcAddr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btc.node.bitcoind.GetInfoCmd <em>Get Info Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Info Cmd</em>'.
	 * @see net.sf.smbt.btc.node.bitcoind.GetInfoCmd
	 * @generated
	 */
	EClass getGetInfoCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.btc.node.bitcoind.GetInfoCmd#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see net.sf.smbt.btc.node.bitcoind.GetInfoCmd#getBalance()
	 * @see #getGetInfoCmd()
	 * @generated
	 */
	EAttribute getGetInfoCmd_Balance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BitcoindFactory getBitcoindFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.btc.node.bitcoind.impl.BitcoinCmdImpl <em>Bitcoin Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.node.bitcoind.impl.BitcoinCmdImpl
		 * @see net.sf.smbt.btc.node.bitcoind.impl.BitcoindPackageImpl#getBitcoinCmd()
		 * @generated
		 */
		EClass BITCOIN_CMD = eINSTANCE.getBitcoinCmd();
		/**
		 * The meta object literal for the '<em><b>Json Rcv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_CMD__JSON_RCV = eINSTANCE.getBitcoinCmd_JsonRcv();
		/**
		 * The meta object literal for the '<em><b>Json Snd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_CMD__JSON_SND = eINSTANCE.getBitcoinCmd_JsonSnd();
		/**
		 * The meta object literal for the '<em><b>Btc Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_CMD__BTC_ADDR = eINSTANCE.getBitcoinCmd_BtcAddr();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.btc.node.bitcoind.impl.GetInfoCmdImpl <em>Get Info Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.node.bitcoind.impl.GetInfoCmdImpl
		 * @see net.sf.smbt.btc.node.bitcoind.impl.BitcoindPackageImpl#getGetInfoCmd()
		 * @generated
		 */
		EClass GET_INFO_CMD = eINSTANCE.getGetInfoCmd();
		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_INFO_CMD__BALANCE = eINSTANCE.getGetInfoCmd_Balance();

	}

} //BitcoindPackage
