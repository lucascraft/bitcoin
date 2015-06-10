/**
 */
package net.sf.smbt.trading.impl;

import java.util.UUID;

import net.sf.smbt.btc.notifications.ICustomRuleProcessor;
import net.sf.smbt.btc.notifications.IRuleEvalDelegate;
import net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate;
import net.sf.smbt.trading.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TradingFactoryImpl extends EFactoryImpl implements TradingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TradingFactory init() {
		try {
			TradingFactory theTradingFactory = (TradingFactory)EPackage.Registry.INSTANCE.getEFactory("http://trading/1.0"); 
			if (theTradingFactory != null) {
				return theTradingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TradingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TradingPackage.ROBOT: return createRobot();
			case TradingPackage.ORDER: return createOrder();
			case TradingPackage.TRADING_RULE: return createTradingRule();
			case TradingPackage.PRICE_RULE: return createPriceRule();
			case TradingPackage.VOLUME_RULE: return createVolumeRule();
			case TradingPackage.TIME_RULE: return createTimeRule();
			case TradingPackage.COMPOSITE_RULE: return createCompositeRule();
			case TradingPackage.CUSTOM_RULE: return createCustomRule();
			case TradingPackage.RULE_VISITOR: return createRuleVisitor();
			case TradingPackage.TRIGGER: return createTrigger();
			case TradingPackage.ORDER_KIND_RULE: return createOrderKindRule();
			case TradingPackage.TRADE_BOTS_CONFIG: return createTradeBotsConfig();
			case TradingPackage.NOTIFICATION: return createNotification();
			case TradingPackage.MAIL_NOTIFICATION: return createMailNotification();
			case TradingPackage.SMS_NOTIFCATION: return createSMSNotifcation();
			case TradingPackage.JSON_NOTIFICATION: return createJsonNotification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TradingPackage.TRIGGER_KIND:
				return createTriggerKindFromString(eDataType, initialValue);
			case TradingPackage.ITRADE_RULE_VISITOR_DELEGATE:
				return createITradeRuleVisitorDelegateFromString(eDataType, initialValue);
			case TradingPackage.IRULE_EVAL_DELEGATE:
				return createIRuleEvalDelegateFromString(eDataType, initialValue);
			case TradingPackage.ICUSTOM_RULE_PROCESSOR:
				return createICustomRuleProcessorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TradingPackage.TRIGGER_KIND:
				return convertTriggerKindToString(eDataType, instanceValue);
			case TradingPackage.ITRADE_RULE_VISITOR_DELEGATE:
				return convertITradeRuleVisitorDelegateToString(eDataType, instanceValue);
			case TradingPackage.IRULE_EVAL_DELEGATE:
				return convertIRuleEvalDelegateToString(eDataType, instanceValue);
			case TradingPackage.ICUSTOM_RULE_PROCESSOR:
				return convertICustomRuleProcessorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		robot.setUuid(UUID.randomUUID().toString());
		robot.setLabel("Generic Trade Robot");
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingRule createTradingRule() {
		TradingRuleImpl tradingRule = new TradingRuleImpl();
		return tradingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceRule createPriceRule() {
		PriceRuleImpl priceRule = new PriceRuleImpl();
		return priceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeRule createVolumeRule() {
		VolumeRuleImpl volumeRule = new VolumeRuleImpl();
		return volumeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRule createTimeRule() {
		TimeRuleImpl timeRule = new TimeRuleImpl();
		return timeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeRule createCompositeRule() {
		CompositeRuleImpl compositeRule = new CompositeRuleImpl();
		return compositeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRule createCustomRule() {
		CustomRuleImpl customRule = new CustomRuleImpl();
		return customRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVisitor createRuleVisitor() {
		RuleVisitorImpl ruleVisitor = new RuleVisitorImpl();
		return ruleVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderKindRule createOrderKindRule() {
		OrderKindRuleImpl orderKindRule = new OrderKindRuleImpl();
		return orderKindRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradeBotsConfig createTradeBotsConfig() {
		TradeBotsConfigImpl tradeBotsConfig = new TradeBotsConfigImpl();
		return tradeBotsConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailNotification createMailNotification() {
		MailNotificationImpl mailNotification = new MailNotificationImpl();
		return mailNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMSNotifcation createSMSNotifcation() {
		SMSNotifcationImpl smsNotifcation = new SMSNotifcationImpl();
		return smsNotifcation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonNotification createJsonNotification() {
		JsonNotificationImpl jsonNotification = new JsonNotificationImpl();
		return jsonNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerKind createTriggerKindFromString(EDataType eDataType, String initialValue) {
		TriggerKind result = TriggerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITradeRuleVisitorDelegate createITradeRuleVisitorDelegateFromString(EDataType eDataType, String initialValue) {
		return (ITradeRuleVisitorDelegate)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertITradeRuleVisitorDelegateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRuleEvalDelegate createIRuleEvalDelegateFromString(EDataType eDataType, String initialValue) {
		return (IRuleEvalDelegate)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIRuleEvalDelegateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICustomRuleProcessor createICustomRuleProcessorFromString(EDataType eDataType, String initialValue) {
		return (ICustomRuleProcessor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertICustomRuleProcessorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingPackage getTradingPackage() {
		return (TradingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TradingPackage getPackage() {
		return TradingPackage.eINSTANCE;
	}

} //TradingFactoryImpl
