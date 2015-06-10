/**
 */
package net.sf.smbt.btc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wallet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.Wallet#getBalance <em>Balance</em>}</li>
 *   <li>{@link net.sf.smbt.btc.Wallet#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.Wallet#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.BtcPackage#getWallet()
 * @model
 * @generated
 */
public interface Wallet extends EObject {
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
	 * @see net.sf.smbt.btc.BtcPackage#getWallet_Balance()
	 * @model
	 * @generated
	 */
	float getBalance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.Wallet#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(float value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.btc.BtcCurrency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #setCurrency(BtcCurrency)
	 * @see net.sf.smbt.btc.BtcPackage#getWallet_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.Wallet#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(BtcCurrency value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see net.sf.smbt.btc.BtcPackage#getWallet_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.Wallet#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // Wallet
