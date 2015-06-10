/**
 */
package net.sf.smbt.trading;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.CompositeRule#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getCompositeRule()
 * @model
 * @generated
 */
public interface CompositeRule extends TradingRule {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.trading.TradingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see net.sf.smbt.trading.TradingPackage#getCompositeRule_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<TradingRule> getChildren();

} // CompositeRule
