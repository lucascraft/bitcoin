/**
 */
package net.sf.smbt.trading;

import net.sf.smbt.btc.notifications.ICustomRuleProcessor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.CustomRule#getRuleProcessor <em>Rule Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getCustomRule()
 * @model
 * @generated
 */
public interface CustomRule extends TradingRule {
	/**
	 * Returns the value of the '<em><b>Rule Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Processor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Processor</em>' attribute.
	 * @see #setRuleProcessor(ICustomRuleProcessor)
	 * @see net.sf.smbt.trading.TradingPackage#getCustomRule_RuleProcessor()
	 * @model dataType="net.sf.smbt.trading.ICustomRuleProcessor"
	 * @generated
	 */
	ICustomRuleProcessor getRuleProcessor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.CustomRule#getRuleProcessor <em>Rule Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Processor</em>' attribute.
	 * @see #getRuleProcessor()
	 * @generated
	 */
	void setRuleProcessor(ICustomRuleProcessor value);

} // CustomRule
