/**
 */
package net.sf.smbt.btc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.Order#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.Order#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.Order#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.BtcPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
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
	 * @see net.sf.smbt.btc.BtcPackage#getOrder_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.Order#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

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
	 * @see net.sf.smbt.btc.BtcPackage#getOrder_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.Order#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

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
	 * @see net.sf.smbt.btc.BtcPackage#getOrder_Kind()
	 * @model
	 * @generated
	 */
	OrderKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.Order#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.btc.OrderKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(OrderKind value);

} // Order
