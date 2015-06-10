/**
 */
package net.sf.smbt.trading.impl;

import net.sf.smbt.btc.notifications.ICustomRuleProcessor;
import net.sf.smbt.trading.CustomRule;
import net.sf.smbt.trading.TradingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.impl.CustomRuleImpl#getRuleProcessor <em>Rule Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomRuleImpl extends TradingRuleImpl implements CustomRule {
	/**
	 * The default value of the '{@link #getRuleProcessor() <em>Rule Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final ICustomRuleProcessor RULE_PROCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleProcessor() <em>Rule Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleProcessor()
	 * @generated
	 * @ordered
	 */
	protected ICustomRuleProcessor ruleProcessor = RULE_PROCESSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.CUSTOM_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomRuleProcessor getRuleProcessor() {
		return ruleProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleProcessor(ICustomRuleProcessor newRuleProcessor) {
		ICustomRuleProcessor oldRuleProcessor = ruleProcessor;
		ruleProcessor = newRuleProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.CUSTOM_RULE__RULE_PROCESSOR, oldRuleProcessor, ruleProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.CUSTOM_RULE__RULE_PROCESSOR:
				return getRuleProcessor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TradingPackage.CUSTOM_RULE__RULE_PROCESSOR:
				setRuleProcessor((ICustomRuleProcessor)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TradingPackage.CUSTOM_RULE__RULE_PROCESSOR:
				setRuleProcessor(RULE_PROCESSOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TradingPackage.CUSTOM_RULE__RULE_PROCESSOR:
				return RULE_PROCESSOR_EDEFAULT == null ? ruleProcessor != null : !RULE_PROCESSOR_EDEFAULT.equals(ruleProcessor);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ruleProcessor: ");
		result.append(ruleProcessor);
		result.append(')');
		return result.toString();
	}

} //CustomRuleImpl
