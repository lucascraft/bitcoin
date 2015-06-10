/**
 */
package net.sf.smbt.btc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.ExchangeRate#getFrom <em>From</em>}</li>
 *   <li>{@link net.sf.smbt.btc.ExchangeRate#getRate <em>Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.ExchangeRate#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.BtcPackage#getExchangeRate()
 * @model
 * @generated
 */
public interface ExchangeRate extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.btc.BtcCurrency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #setFrom(BtcCurrency)
	 * @see net.sf.smbt.btc.BtcPackage#getExchangeRate_From()
	 * @model
	 * @generated
	 */
	BtcCurrency getFrom();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.ExchangeRate#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(BtcCurrency value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see net.sf.smbt.btc.BtcPackage#getExchangeRate_Rate()
	 * @model
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.ExchangeRate#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.btc.BtcCurrency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #setTo(BtcCurrency)
	 * @see net.sf.smbt.btc.BtcPackage#getExchangeRate_To()
	 * @model
	 * @generated
	 */
	BtcCurrency getTo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.ExchangeRate#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getTo()
	 * @generated
	 */
	void setTo(BtcCurrency value);

} // ExchangeRate
