/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Balance#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Balance#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBalance()
 * @model
 * @generated
 */
public interface Balance extends EObject {
	/**
	 * Returns the value of the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain ID</em>' attribute.
	 * @see #setChainID(String)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBalance_ChainID()
	 * @model
	 * @generated
	 */
	String getChainID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Balance#getChainID <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain ID</em>' attribute.
	 * @see #getChainID()
	 * @generated
	 */
	void setChainID(String value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(float)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBalance_Balance()
	 * @model
	 * @generated
	 */
	float getBalance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Balance#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(float value);

} // Balance
