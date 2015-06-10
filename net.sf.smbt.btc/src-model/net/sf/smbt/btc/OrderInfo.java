/**
 */
package net.sf.smbt.btc;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.OrderInfo#getHigh <em>High</em>}</li>
 *   <li>{@link net.sf.smbt.btc.OrderInfo#getLow <em>Low</em>}</li>
 *   <li>{@link net.sf.smbt.btc.OrderInfo#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.OrderInfo#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.OrderInfo#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.BtcPackage#getOrderInfo()
 * @model
 * @generated
 */
public interface OrderInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #setHigh(float)
	 * @see net.sf.smbt.btc.BtcPackage#getOrderInfo_High()
	 * @model
	 * @generated
	 */
	float getHigh();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.OrderInfo#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(float value);

	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #setLow(float)
	 * @see net.sf.smbt.btc.BtcPackage#getOrderInfo_Low()
	 * @model
	 * @generated
	 */
	float getLow();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.OrderInfo#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(float value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(long)
	 * @see net.sf.smbt.btc.BtcPackage#getOrderInfo_Volume()
	 * @model
	 * @generated
	 */
	long getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.OrderInfo#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(long value);

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
	 * @see net.sf.smbt.btc.BtcPackage#getOrderInfo_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.OrderInfo#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see net.sf.smbt.btc.BtcPackage#getOrderInfo_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.OrderInfo#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // OrderInfo
