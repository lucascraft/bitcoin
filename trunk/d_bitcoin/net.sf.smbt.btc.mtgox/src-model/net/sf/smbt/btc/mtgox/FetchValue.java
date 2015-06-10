/**
 */
package net.sf.smbt.btc.mtgox;

import java.math.BigInteger;

import net.sf.smbt.btc.BtcCurrency;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getStamp <em>Stamp</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getPriceInt <em>Price Int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getAmountInt <em>Amount Int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getTid <em>Tid</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getItem <em>Item</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getTradeType <em>Trade Type</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getPrimary <em>Primary</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.FetchValue#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue()
 * @model
 * @generated
 */
public interface FetchValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stamp</em>' attribute.
	 * @see #setStamp(long)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_Stamp()
	 * @model
	 * @generated
	 */
	long getStamp();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getStamp <em>Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stamp</em>' attribute.
	 * @see #getStamp()
	 * @generated
	 */
	void setStamp(long value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Price Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Int</em>' attribute.
	 * @see #setPriceInt(BigInteger)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_PriceInt()
	 * @model
	 * @generated
	 */
	BigInteger getPriceInt();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getPriceInt <em>Price Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Int</em>' attribute.
	 * @see #getPriceInt()
	 * @generated
	 */
	void setPriceInt(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Amount Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Int</em>' attribute.
	 * @see #setAmountInt(BigInteger)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_AmountInt()
	 * @model
	 * @generated
	 */
	BigInteger getAmountInt();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getAmountInt <em>Amount Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Int</em>' attribute.
	 * @see #getAmountInt()
	 * @generated
	 */
	void setAmountInt(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Tid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tid</em>' attribute.
	 * @see #setTid(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_Tid()
	 * @model
	 * @generated
	 */
	String getTid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getTid <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tid</em>' attribute.
	 * @see #getTid()
	 * @generated
	 */
	void setTid(String value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getCurrency <em>Currency</em>}' attribute.
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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_Item()
	 * @model
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

	/**
	 * Returns the value of the '<em><b>Trade Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trade Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trade Type</em>' attribute.
	 * @see #setTradeType(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_TradeType()
	 * @model
	 * @generated
	 */
	String getTradeType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getTradeType <em>Trade Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Type</em>' attribute.
	 * @see #getTradeType()
	 * @generated
	 */
	void setTradeType(String value);

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' attribute.
	 * @see #setPrimary(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_Primary()
	 * @model
	 * @generated
	 */
	String getPrimary();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getPrimary <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' attribute.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see #setProperties(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getFetchValue_Properties()
	 * @model
	 * @generated
	 */
	String getProperties();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.FetchValue#getProperties <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' attribute.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(String value);

} // FetchValue
