/**
 */
package net.sf.smbt.trading;

import java.math.BigInteger;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.OrderKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.Order#getPrice_int <em>Price int</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Order#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Order#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Order#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Order#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Order#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Price int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price int</em>' attribute.
	 * @see #setPrice_int(BigInteger)
	 * @see net.sf.smbt.trading.TradingPackage#getOrder_Price_int()
	 * @model
	 * @generated
	 */
	BigInteger getPrice_int();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Order#getPrice_int <em>Price int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price int</em>' attribute.
	 * @see #getPrice_int()
	 * @generated
	 */
	void setPrice_int(BigInteger value);

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
	 * @see net.sf.smbt.trading.TradingPackage#getOrder_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Order#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(BtcCurrency value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(float)
	 * @see net.sf.smbt.trading.TradingPackage#getOrder_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Order#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(long)
	 * @see net.sf.smbt.trading.TradingPackage#getOrder_Date()
	 * @model
	 * @generated
	 */
	long getDate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Order#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(long value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.btc.OrderKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.btc.OrderKind
	 * @see #setKind(OrderKind)
	 * @see net.sf.smbt.trading.TradingPackage#getOrder_Kind()
	 * @model
	 * @generated
	 */
	OrderKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Order#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.btc.OrderKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(OrderKind value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see net.sf.smbt.trading.TradingPackage#getOrder_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Order#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // Order
