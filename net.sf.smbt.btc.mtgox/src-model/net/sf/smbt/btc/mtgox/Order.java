/**
 */
package net.sf.smbt.btc.mtgox;

import net.sf.smbt.btc.BtcCurrency;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getOid <em>Oid</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getItem <em>Item</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.Order#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Oid()
	 * @model
	 * @generated
	 */
	String getOid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(String value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(BtcCurrency value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' attribute.
	 * @see #setItem(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Item()
	 * @model
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' reference.
	 * @see #setAmount(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Amount()
	 * @model
	 * @generated
	 */
	CompactValue getAmount();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getAmount <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' reference.
	 * @see #setPrice(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Price()
	 * @model
	 * @generated
	 */
	CompactValue getPrice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getPrice <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getOrder_Priority()
	 * @model
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Order#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

} // Order
