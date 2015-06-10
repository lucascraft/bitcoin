/**
 */
package net.sf.smbt.trading;

import net.sf.smbt.btc.BtcCurrency;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.PriceRule#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.trading.PriceRule#getPercentTolerance <em>Percent Tolerance</em>}</li>
 *   <li>{@link net.sf.smbt.trading.PriceRule#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getPriceRule()
 * @model
 * @generated
 */
public interface PriceRule extends TradingRule {

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see net.sf.smbt.trading.TradingPackage#getPriceRule_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.PriceRule#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Percent Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Tolerance</em>' attribute.
	 * @see #setPercentTolerance(float)
	 * @see net.sf.smbt.trading.TradingPackage#getPriceRule_PercentTolerance()
	 * @model
	 * @generated
	 */
	float getPercentTolerance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.PriceRule#getPercentTolerance <em>Percent Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Tolerance</em>' attribute.
	 * @see #getPercentTolerance()
	 * @generated
	 */
	void setPercentTolerance(float value);

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
	 * @see net.sf.smbt.trading.TradingPackage#getPriceRule_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.PriceRule#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(BtcCurrency value);
} // PriceRule
