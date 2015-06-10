/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc;

import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.IConnectedUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bitcoin Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getInfo <em>Info</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getBtcAddr <em>Btc Addr</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getInetAddr <em>Inet Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBitcoinNode()
 * @model
 * @generated
 */
public interface BitcoinNode extends IConnectedUnit {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' reference.
	 * @see #setInfo(BtcInfo)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBitcoinNode_Info()
	 * @model
	 * @generated
	 */
	BtcInfo getInfo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getInfo <em>Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(BtcInfo value);

	/**
	 * Returns the value of the '<em><b>Btc Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btc Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btc Addr</em>' attribute.
	 * @see #setBtcAddr(String)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBitcoinNode_BtcAddr()
	 * @model
	 * @generated
	 */
	String getBtcAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getBtcAddr <em>Btc Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btc Addr</em>' attribute.
	 * @see #getBtcAddr()
	 * @generated
	 */
	void setBtcAddr(String value);

	/**
	 * Returns the value of the '<em><b>Inet Addr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inet Addr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inet Addr</em>' reference.
	 * @see #setInetAddr(XCPAddress)
	 * @see net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage#getBitcoinNode_InetAddr()
	 * @model
	 * @generated
	 */
	XCPAddress getInetAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode#getInetAddr <em>Inet Addr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inet Addr</em>' reference.
	 * @see #getInetAddr()
	 * @generated
	 */
	void setInetAddr(XCPAddress value);

} // BitcoinNode
