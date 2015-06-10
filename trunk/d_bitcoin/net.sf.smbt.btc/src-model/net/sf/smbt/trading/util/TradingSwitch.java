/**
 */
package net.sf.smbt.trading.util;

import net.sf.smbt.trading.*;
import net.sf.smbt.trading.CompositeRule;
import net.sf.smbt.trading.CustomRule;
import net.sf.smbt.trading.JsonNotification;
import net.sf.smbt.trading.MailNotification;
import net.sf.smbt.trading.Notification;
import net.sf.smbt.trading.Order;
import net.sf.smbt.trading.OrderKindRule;
import net.sf.smbt.trading.PriceRule;
import net.sf.smbt.trading.Robot;
import net.sf.smbt.trading.RuleVisitor;
import net.sf.smbt.trading.SMSNotifcation;
import net.sf.smbt.trading.TimeRule;
import net.sf.smbt.trading.TradeBotsConfig;
import net.sf.smbt.trading.TradingPackage;
import net.sf.smbt.trading.TradingRule;
import net.sf.smbt.trading.Trigger;
import net.sf.smbt.trading.VolumeRule;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.trading.TradingPackage
 * @generated
 */
public class TradingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TradingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingSwitch() {
		if (modelPackage == null) {
			modelPackage = TradingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TradingPackage.ROBOT: {
				Robot robot = (Robot)theEObject;
				T result = caseRobot(robot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.TRADING_RULE: {
				TradingRule tradingRule = (TradingRule)theEObject;
				T result = caseTradingRule(tradingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.PRICE_RULE: {
				PriceRule priceRule = (PriceRule)theEObject;
				T result = casePriceRule(priceRule);
				if (result == null) result = caseTradingRule(priceRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.VOLUME_RULE: {
				VolumeRule volumeRule = (VolumeRule)theEObject;
				T result = caseVolumeRule(volumeRule);
				if (result == null) result = caseTradingRule(volumeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.TIME_RULE: {
				TimeRule timeRule = (TimeRule)theEObject;
				T result = caseTimeRule(timeRule);
				if (result == null) result = caseTradingRule(timeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.COMPOSITE_RULE: {
				CompositeRule compositeRule = (CompositeRule)theEObject;
				T result = caseCompositeRule(compositeRule);
				if (result == null) result = caseTradingRule(compositeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.CUSTOM_RULE: {
				CustomRule customRule = (CustomRule)theEObject;
				T result = caseCustomRule(customRule);
				if (result == null) result = caseTradingRule(customRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.RULE_VISITOR: {
				RuleVisitor ruleVisitor = (RuleVisitor)theEObject;
				T result = caseRuleVisitor(ruleVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.ORDER_KIND_RULE: {
				OrderKindRule orderKindRule = (OrderKindRule)theEObject;
				T result = caseOrderKindRule(orderKindRule);
				if (result == null) result = caseTradingRule(orderKindRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.TRADE_BOTS_CONFIG: {
				TradeBotsConfig tradeBotsConfig = (TradeBotsConfig)theEObject;
				T result = caseTradeBotsConfig(tradeBotsConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.NOTIFICATION: {
				Notification notification = (Notification)theEObject;
				T result = caseNotification(notification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.MAIL_NOTIFICATION: {
				MailNotification mailNotification = (MailNotification)theEObject;
				T result = caseMailNotification(mailNotification);
				if (result == null) result = caseNotification(mailNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.SMS_NOTIFCATION: {
				SMSNotifcation smsNotifcation = (SMSNotifcation)theEObject;
				T result = caseSMSNotifcation(smsNotifcation);
				if (result == null) result = caseNotification(smsNotifcation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TradingPackage.JSON_NOTIFICATION: {
				JsonNotification jsonNotification = (JsonNotification)theEObject;
				T result = caseJsonNotification(jsonNotification);
				if (result == null) result = caseNotification(jsonNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTradingRule(TradingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Price Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Price Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriceRule(PriceRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeRule(VolumeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRule(TimeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeRule(CompositeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomRule(CustomRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleVisitor(RuleVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Kind Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Kind Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderKindRule(OrderKindRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trade Bots Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trade Bots Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTradeBotsConfig(TradeBotsConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotification(Notification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mail Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mail Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMailNotification(MailNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMS Notifcation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMS Notifcation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMSNotifcation(SMSNotifcation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonNotification(JsonNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TradingSwitch
