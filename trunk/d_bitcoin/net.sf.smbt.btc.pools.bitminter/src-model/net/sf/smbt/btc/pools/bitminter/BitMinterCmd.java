/**
 */
package net.sf.smbt.btc.pools.bitminter;

import net.sf.smbt.comm.httpcmd.HttpCommCmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Minter Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.BitMinterCmd#getJson <em>Json</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBitMinterCmd()
 * @model
 * @generated
 */
public interface BitMinterCmd extends HttpCommCmd {
	/**
	 * Returns the value of the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json</em>' attribute.
	 * @see #setJson(String)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBitMinterCmd_Json()
	 * @model
	 * @generated
	 */
	String getJson();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.BitMinterCmd#getJson <em>Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json</em>' attribute.
	 * @see #getJson()
	 * @generated
	 */
	void setJson(String value);

} // BitMinterCmd
