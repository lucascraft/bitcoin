/**
 */
package net.sf.smbt.trading;

import net.sf.smbt.btc.OrderKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Kind Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.OrderKindRule#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getOrderKindRule()
 * @model
 * @generated
 */
public interface OrderKindRule extends TradingRule {
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
	 * @see net.sf.smbt.trading.TradingPackage#getOrderKindRule_Kind()
	 * @model
	 * @generated
	 */
	OrderKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.OrderKindRule#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.btc.OrderKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(OrderKind value);

} // OrderKindRule
