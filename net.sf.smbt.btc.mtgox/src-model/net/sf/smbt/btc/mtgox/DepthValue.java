/**
 */
package net.sf.smbt.btc.mtgox;

import java.math.BigInteger;

import net.sf.smbt.btc.BtcCurrency;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depth Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getPriceInt <em>Price Int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getAmountInt <em>Amount Int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getStamp <em>Stamp</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getSum <em>Sum</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getLastLocalStatus <em>Last Local Status</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.DepthValue#getVolumeInt <em>Volume Int</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue()
 * @model
 * @generated
 */
public interface DepthValue extends EObject {
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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_PriceInt()
	 * @model
	 * @generated
	 */
	BigInteger getPriceInt();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getPriceInt <em>Price Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Int</em>' attribute.
	 * @see #getPriceInt()
	 * @generated
	 */
	void setPriceInt(BigInteger value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_AmountInt()
	 * @model
	 * @generated
	 */
	BigInteger getAmountInt();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getAmountInt <em>Amount Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Int</em>' attribute.
	 * @see #getAmountInt()
	 * @generated
	 */
	void setAmountInt(BigInteger value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_Stamp()
	 * @model
	 * @generated
	 */
	long getStamp();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getStamp <em>Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stamp</em>' attribute.
	 * @see #getStamp()
	 * @generated
	 */
	void setStamp(long value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.btc.mtgox.FetchKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.btc.mtgox.FetchKind
	 * @see #setKind(FetchKind)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_Kind()
	 * @model
	 * @generated
	 */
	FetchKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.btc.mtgox.FetchKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FetchKind value);

	/**
	 * Returns the value of the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum</em>' attribute.
	 * @see #setSum(float)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_Sum()
	 * @model
	 * @generated
	 */
	float getSum();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getSum <em>Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sum</em>' attribute.
	 * @see #getSum()
	 * @generated
	 */
	void setSum(float value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_Currency()
	 * @model
	 * @generated
	 */
	BtcCurrency getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see net.sf.smbt.btc.BtcCurrency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(BtcCurrency value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.btc.mtgox.DepthStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.btc.mtgox.DepthStatus
	 * @see #setStatus(DepthStatus)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_Status()
	 * @model
	 * @generated
	 */
	DepthStatus getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.btc.mtgox.DepthStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DepthStatus value);

	/**
	 * Returns the value of the '<em><b>Last Local Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Local Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Local Status</em>' attribute.
	 * @see #setLastLocalStatus(long)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_LastLocalStatus()
	 * @model
	 * @generated
	 */
	long getLastLocalStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getLastLocalStatus <em>Last Local Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Local Status</em>' attribute.
	 * @see #getLastLocalStatus()
	 * @generated
	 */
	void setLastLocalStatus(long value);

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
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Volume Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Int</em>' attribute.
	 * @see #setVolumeInt(BigInteger)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getDepthValue_VolumeInt()
	 * @model
	 * @generated
	 */
	BigInteger getVolumeInt();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.DepthValue#getVolumeInt <em>Volume Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Int</em>' attribute.
	 * @see #getVolumeInt()
	 * @generated
	 */
	void setVolumeInt(BigInteger value);

} // DepthValue
