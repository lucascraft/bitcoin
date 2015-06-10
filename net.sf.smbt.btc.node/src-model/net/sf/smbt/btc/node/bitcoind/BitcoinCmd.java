/**
 */
package net.sf.smbt.btc.node.bitcoind;

import net.sf.smbt.comm.httpcmd.HttpCommCmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bitcoin Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getJsonRcv <em>Json Rcv</em>}</li>
 *   <li>{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getJsonSnd <em>Json Snd</em>}</li>
 *   <li>{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getBtcAddr <em>Btc Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.node.bitcoind.BitcoindPackage#getBitcoinCmd()
 * @model
 * @generated
 */
public interface BitcoinCmd extends HttpCommCmd {

	/**
	 * Returns the value of the '<em><b>Json Rcv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Rcv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Rcv</em>' attribute.
	 * @see #setJsonRcv(String)
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoindPackage#getBitcoinCmd_JsonRcv()
	 * @model
	 * @generated
	 */
	String getJsonRcv();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getJsonRcv <em>Json Rcv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Rcv</em>' attribute.
	 * @see #getJsonRcv()
	 * @generated
	 */
	void setJsonRcv(String value);

	/**
	 * Returns the value of the '<em><b>Json Snd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Snd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Snd</em>' attribute.
	 * @see #setJsonSnd(String)
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoindPackage#getBitcoinCmd_JsonSnd()
	 * @model
	 * @generated
	 */
	String getJsonSnd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getJsonSnd <em>Json Snd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Snd</em>' attribute.
	 * @see #getJsonSnd()
	 * @generated
	 */
	void setJsonSnd(String value);

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
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoindPackage#getBitcoinCmd_BtcAddr()
	 * @model
	 * @generated
	 */
	String getBtcAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.node.bitcoind.BitcoinCmd#getBtcAddr <em>Btc Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btc Addr</em>' attribute.
	 * @see #getBtcAddr()
	 * @generated
	 */
	void setBtcAddr(String value);
} // BitcoinCmd
