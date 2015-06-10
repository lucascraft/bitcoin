/**
 */
package net.sf.smbt.btc.pools.bitminter;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Hash Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserHashRate#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserHashRate#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserHashRate()
 * @model
 * @generated
 */
public interface UserHashRate extends EObject {
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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserHashRate_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.UserHashRate#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserHashRate_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.UserHashRate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // UserHashRate
