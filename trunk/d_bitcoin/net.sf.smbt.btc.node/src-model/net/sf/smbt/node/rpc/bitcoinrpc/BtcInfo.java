/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Btc Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getBalance <em>Balance</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getErrors <em>Errors</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getPaytxfee <em>Paytxfee</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getConnected <em>Connected</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#isTestnet <em>Testnet</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBtcInfo()
 * @model
 * @generated
 */
public interface BtcInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(double)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBtcInfo_Balance()
	 * @model
	 * @generated
	 */
	double getBalance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(double value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' attribute.
	 * @see #setErrors(String)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBtcInfo_Errors()
	 * @model
	 * @generated
	 */
	String getErrors();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getErrors <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors</em>' attribute.
	 * @see #getErrors()
	 * @generated
	 */
	void setErrors(String value);

	/**
	 * Returns the value of the '<em><b>Paytxfee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paytxfee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paytxfee</em>' attribute.
	 * @see #setPaytxfee(float)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBtcInfo_Paytxfee()
	 * @model
	 * @generated
	 */
	float getPaytxfee();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getPaytxfee <em>Paytxfee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paytxfee</em>' attribute.
	 * @see #getPaytxfee()
	 * @generated
	 */
	void setPaytxfee(float value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(int)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBtcInfo_Connected()
	 * @model
	 * @generated
	 */
	int getConnected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #getConnected()
	 * @generated
	 */
	void setConnected(int value);

	/**
	 * Returns the value of the '<em><b>Testnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testnet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testnet</em>' attribute.
	 * @see #setTestnet(boolean)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBtcInfo_Testnet()
	 * @model
	 * @generated
	 */
	boolean isTestnet();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#isTestnet <em>Testnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testnet</em>' attribute.
	 * @see #isTestnet()
	 * @generated
	 */
	void setTestnet(boolean value);

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(double)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBtcInfo_Difficulty()
	 * @model
	 * @generated
	 */
	double getDifficulty();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(double value);

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' attribute.
	 * @see #setBlocks(long)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBtcInfo_Blocks()
	 * @model
	 * @generated
	 */
	long getBlocks();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo#getBlocks <em>Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocks</em>' attribute.
	 * @see #getBlocks()
	 * @generated
	 */
	void setBlocks(long value);

} // BtcInfo
