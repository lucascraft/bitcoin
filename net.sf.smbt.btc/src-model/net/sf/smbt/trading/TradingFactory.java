/**
 */
package net.sf.smbt.trading;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.trading.TradingPackage
 * @generated
 */
public interface TradingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TradingFactory eINSTANCE = net.sf.smbt.trading.impl.TradingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	TradingRule createTradingRule();

	/**
	 * Returns a new object of class '<em>Price Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price Rule</em>'.
	 * @generated
	 */
	PriceRule createPriceRule();

	/**
	 * Returns a new object of class '<em>Volume Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Rule</em>'.
	 * @generated
	 */
	VolumeRule createVolumeRule();

	/**
	 * Returns a new object of class '<em>Time Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Rule</em>'.
	 * @generated
	 */
	TimeRule createTimeRule();

	/**
	 * Returns a new object of class '<em>Composite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Rule</em>'.
	 * @generated
	 */
	CompositeRule createCompositeRule();

	/**
	 * Returns a new object of class '<em>Custom Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Rule</em>'.
	 * @generated
	 */
	CustomRule createCustomRule();

	/**
	 * Returns a new object of class '<em>Rule Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Visitor</em>'.
	 * @generated
	 */
	RuleVisitor createRuleVisitor();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Order Kind Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Kind Rule</em>'.
	 * @generated
	 */
	OrderKindRule createOrderKindRule();

	/**
	 * Returns a new object of class '<em>Trade Bots Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trade Bots Config</em>'.
	 * @generated
	 */
	TradeBotsConfig createTradeBotsConfig();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns a new object of class '<em>Mail Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mail Notification</em>'.
	 * @generated
	 */
	MailNotification createMailNotification();

	/**
	 * Returns a new object of class '<em>SMS Notifcation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SMS Notifcation</em>'.
	 * @generated
	 */
	SMSNotifcation createSMSNotifcation();

	/**
	 * Returns a new object of class '<em>Json Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Notification</em>'.
	 * @generated
	 */
	JsonNotification createJsonNotification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TradingPackage getTradingPackage();

} //TradingFactory
