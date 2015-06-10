/**
 */
package net.sf.smbt.btc.node.bitcoind;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Info Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.node.bitcoind.GetInfoCmd#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.node.bitcoind.BitcoindPackage#getGetInfoCmd()
 * @model
 * @generated
 */
public interface GetInfoCmd extends BitcoinCmd {
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
	 * @see net.sf.smbt.btc.node.bitcoind.BitcoindPackage#getGetInfoCmd_Balance()
	 * @model
	 * @generated
	 */
	double getBalance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.node.bitcoind.GetInfoCmd#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(double value);

} // GetInfoCmd
