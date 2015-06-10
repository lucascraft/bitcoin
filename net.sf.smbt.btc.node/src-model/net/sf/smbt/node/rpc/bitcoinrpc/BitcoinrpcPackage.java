/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcFactory
 * @model kind="package"
 * @generated
 */
public interface BitcoinrpcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bitcoinrpc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bitcoinrpc/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bitcoinrpc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BitcoinrpcPackage eINSTANCE = net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinrpcPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl <em>Bitcoin Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinrpcPackageImpl#getBitcoinNode()
	 * @generated
	 */
	int BITCOIN_NODE = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_NODE__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_NODE__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_NODE__INFO = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Btc Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_NODE__BTC_ADDR = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inet Addr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_NODE__INET_ADDR = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bitcoin Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITCOIN_NODE_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl <em>Btc Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinrpcPackageImpl#getBtcInfo()
	 * @generated
	 */
	int BTC_INFO = 1;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTC_INFO__BALANCE = 0;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTC_INFO__ERRORS = 1;

	/**
	 * The feature id for the '<em><b>Paytxfee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTC_INFO__PAYTXFEE = 2;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTC_INFO__CONNECTED = 3;

	/**
	 * The feature id for the '<em><b>Testnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTC_INFO__TESTNET = 4;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTC_INFO__DIFFICULTY = 5;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTC_INFO__BLOCKS = 6;

	/**
	 * The number of structural features of the '<em>Btc Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTC_INFO_FEATURE_COUNT = 7;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode <em>Bitcoin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitcoin Node</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode
	 * @generated
	 */
	EClass getBitcoinNode();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getInfo()
	 * @see #getBitcoinNode()
	 * @generated
	 */
	EReference getBitcoinNode_Info();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getBtcAddr <em>Btc Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btc Addr</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getBtcAddr()
	 * @see #getBitcoinNode()
	 * @generated
	 */
	EAttribute getBitcoinNode_BtcAddr();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getInetAddr <em>Inet Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inet Addr</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getInetAddr()
	 * @see #getBitcoinNode()
	 * @generated
	 */
	EReference getBitcoinNode_InetAddr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo <em>Btc Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Btc Info</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo
	 * @generated
	 */
	EClass getBtcInfo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getBalance()
	 * @see #getBtcInfo()
	 * @generated
	 */
	EAttribute getBtcInfo_Balance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getErrors()
	 * @see #getBtcInfo()
	 * @generated
	 */
	EAttribute getBtcInfo_Errors();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getPaytxfee <em>Paytxfee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paytxfee</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getPaytxfee()
	 * @see #getBtcInfo()
	 * @generated
	 */
	EAttribute getBtcInfo_Paytxfee();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getConnected()
	 * @see #getBtcInfo()
	 * @generated
	 */
	EAttribute getBtcInfo_Connected();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#isTestnet <em>Testnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testnet</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#isTestnet()
	 * @see #getBtcInfo()
	 * @generated
	 */
	EAttribute getBtcInfo_Testnet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getDifficulty()
	 * @see #getBtcInfo()
	 * @generated
	 */
	EAttribute getBtcInfo_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocks</em>'.
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getBlocks()
	 * @see #getBtcInfo()
	 * @generated
	 */
	EAttribute getBtcInfo_Blocks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BitcoinrpcFactory getBitcoinrpcFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl <em>Bitcoin Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl
		 * @see net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinrpcPackageImpl#getBitcoinNode()
		 * @generated
		 */
		EClass BITCOIN_NODE = eINSTANCE.getBitcoinNode();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITCOIN_NODE__INFO = eINSTANCE.getBitcoinNode_Info();

		/**
		 * The meta object literal for the '<em><b>Btc Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITCOIN_NODE__BTC_ADDR = eINSTANCE.getBitcoinNode_BtcAddr();

		/**
		 * The meta object literal for the '<em><b>Inet Addr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITCOIN_NODE__INET_ADDR = eINSTANCE.getBitcoinNode_InetAddr();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl <em>Btc Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl
		 * @see net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinrpcPackageImpl#getBtcInfo()
		 * @generated
		 */
		EClass BTC_INFO = eINSTANCE.getBtcInfo();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTC_INFO__BALANCE = eINSTANCE.getBtcInfo_Balance();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTC_INFO__ERRORS = eINSTANCE.getBtcInfo_Errors();

		/**
		 * The meta object literal for the '<em><b>Paytxfee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTC_INFO__PAYTXFEE = eINSTANCE.getBtcInfo_Paytxfee();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTC_INFO__CONNECTED = eINSTANCE.getBtcInfo_Connected();

		/**
		 * The meta object literal for the '<em><b>Testnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTC_INFO__TESTNET = eINSTANCE.getBtcInfo_Testnet();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTC_INFO__DIFFICULTY = eINSTANCE.getBtcInfo_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTC_INFO__BLOCKS = eINSTANCE.getBtcInfo_Blocks();

	}

} //BitcoinrpcPackage
