/**
 */
package net.sf.smbt.trading;

import net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.RuleVisitor#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getRuleVisitor()
 * @model
 * @generated
 */
public interface RuleVisitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' attribute.
	 * @see #setDelegate(ITradeRuleVisitorDelegate)
	 * @see net.sf.smbt.trading.TradingPackage#getRuleVisitor_Delegate()
	 * @model dataType="net.sf.smbt.trading.ITradeRuleVisitorDelegate"
	 * @generated
	 */
	ITradeRuleVisitorDelegate getDelegate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.RuleVisitor#getDelegate <em>Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' attribute.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(ITradeRuleVisitorDelegate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean eval(TradingRule rule);

} // RuleVisitor
