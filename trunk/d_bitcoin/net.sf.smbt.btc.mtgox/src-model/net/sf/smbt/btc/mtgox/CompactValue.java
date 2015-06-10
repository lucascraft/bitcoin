/**
 */
package net.sf.smbt.btc.mtgox;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compact Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.CompactValue#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CompactValue#getValue_int <em>Value int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CompactValue#getDisplay <em>Display</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CompactValue#getDisplay_short <em>Display short</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.CompactValue#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCompactValue()
 * @model
 * @generated
 */
public interface CompactValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCompactValue_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CompactValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Value int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value int</em>' attribute.
	 * @see #setValue_int(BigInteger)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCompactValue_Value_int()
	 * @model
	 * @generated
	 */
	BigInteger getValue_int();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CompactValue#getValue_int <em>Value int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value int</em>' attribute.
	 * @see #getValue_int()
	 * @generated
	 */
	void setValue_int(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see #setDisplay(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCompactValue_Display()
	 * @model
	 * @generated
	 */
	String getDisplay();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CompactValue#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Display short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display short</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display short</em>' attribute.
	 * @see #setDisplay_short(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCompactValue_Display_short()
	 * @model
	 * @generated
	 */
	String getDisplay_short();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CompactValue#getDisplay_short <em>Display short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display short</em>' attribute.
	 * @see #getDisplay_short()
	 * @generated
	 */
	void setDisplay_short(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getCompactValue_Currency()
	 * @model
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.CompactValue#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

} // CompactValue
