/**
 */
package net.sf.smbt.trading.impl;

import net.sf.smbt.btc.BtcPackage;
import net.sf.smbt.btc.notifications.ICustomRuleProcessor;
import net.sf.smbt.btc.notifications.IRuleEvalDelegate;
import net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate;
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
import net.sf.smbt.trading.TradingFactory;
import net.sf.smbt.trading.TradingPackage;
import net.sf.smbt.trading.TradingRule;
import net.sf.smbt.trading.Trigger;
import net.sf.smbt.trading.TriggerKind;
import net.sf.smbt.trading.VolumeRule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TradingPackageImpl extends EPackageImpl implements TradingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priceRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderKindRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradeBotsConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mailNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smsNotifcationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iTradeRuleVisitorDelegateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iRuleEvalDelegateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iCustomRuleProcessorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.trading.TradingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TradingPackageImpl() {
		super(eNS_URI, TradingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TradingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TradingPackage init() {
		if (isInited) return (TradingPackage)EPackage.Registry.INSTANCE.getEPackage(TradingPackage.eNS_URI);

		// Obtain or create and register package
		TradingPackageImpl theTradingPackage = (TradingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TradingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TradingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BtcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTradingPackage.createPackageContents();

		// Initialize created meta-data
		theTradingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTradingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TradingPackage.eNS_URI, theTradingPackage);
		return theTradingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobot_Uuid() {
		return (EAttribute)robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Triggers() {
		return (EReference)robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobot_Label() {
		return (EAttribute)robotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Price_int() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Currency() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Volume() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Date() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Kind() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Message() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTradingRule() {
		return tradingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradingRule_Trigger() {
		return (EAttribute)tradingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradingRule_Ratio() {
		return (EAttribute)tradingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradingRule_Compliance() {
		return (EAttribute)tradingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradingRule_EvalDelegate() {
		return (EAttribute)tradingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradingRule_Ctx() {
		return (EAttribute)tradingRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradingRule_Label() {
		return (EAttribute)tradingRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriceRule() {
		return priceRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriceRule_Price() {
		return (EAttribute)priceRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriceRule_PercentTolerance() {
		return (EAttribute)priceRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriceRule_Currency() {
		return (EAttribute)priceRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumeRule() {
		return volumeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeRule_Volume() {
		return (EAttribute)volumeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeRule_Tolerance() {
		return (EAttribute)volumeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRule() {
		return timeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRule_Date() {
		return (EAttribute)timeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRule_Tolerance() {
		return (EAttribute)timeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeRule() {
		return compositeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRule_Children() {
		return (EReference)compositeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomRule() {
		return customRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRule_RuleProcessor() {
		return (EAttribute)customRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleVisitor() {
		return ruleVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVisitor_Delegate() {
		return (EAttribute)ruleVisitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Orders() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Rules() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Uuid() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Activated() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Processed() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_JsonNotifications() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_MailNotifications() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_SmsNotification() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Label() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderKindRule() {
		return orderKindRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderKindRule_Kind() {
		return (EAttribute)orderKindRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTradeBotsConfig() {
		return tradeBotsConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeBotsConfig_Bots() {
		return (EReference)tradeBotsConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotification_Target() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMailNotification() {
		return mailNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMSNotifcation() {
		return smsNotifcationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonNotification() {
		return jsonNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerKind() {
		return triggerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getITradeRuleVisitorDelegate() {
		return iTradeRuleVisitorDelegateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIRuleEvalDelegate() {
		return iRuleEvalDelegateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getICustomRuleProcessor() {
		return iCustomRuleProcessorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingFactory getTradingFactory() {
		return (TradingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		robotEClass = createEClass(ROBOT);
		createEAttribute(robotEClass, ROBOT__UUID);
		createEReference(robotEClass, ROBOT__TRIGGERS);
		createEAttribute(robotEClass, ROBOT__LABEL);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__PRICE_INT);
		createEAttribute(orderEClass, ORDER__CURRENCY);
		createEAttribute(orderEClass, ORDER__VOLUME);
		createEAttribute(orderEClass, ORDER__DATE);
		createEAttribute(orderEClass, ORDER__KIND);
		createEAttribute(orderEClass, ORDER__MESSAGE);

		tradingRuleEClass = createEClass(TRADING_RULE);
		createEAttribute(tradingRuleEClass, TRADING_RULE__TRIGGER);
		createEAttribute(tradingRuleEClass, TRADING_RULE__RATIO);
		createEAttribute(tradingRuleEClass, TRADING_RULE__COMPLIANCE);
		createEAttribute(tradingRuleEClass, TRADING_RULE__EVAL_DELEGATE);
		createEAttribute(tradingRuleEClass, TRADING_RULE__CTX);
		createEAttribute(tradingRuleEClass, TRADING_RULE__LABEL);

		priceRuleEClass = createEClass(PRICE_RULE);
		createEAttribute(priceRuleEClass, PRICE_RULE__PRICE);
		createEAttribute(priceRuleEClass, PRICE_RULE__PERCENT_TOLERANCE);
		createEAttribute(priceRuleEClass, PRICE_RULE__CURRENCY);

		volumeRuleEClass = createEClass(VOLUME_RULE);
		createEAttribute(volumeRuleEClass, VOLUME_RULE__VOLUME);
		createEAttribute(volumeRuleEClass, VOLUME_RULE__TOLERANCE);

		timeRuleEClass = createEClass(TIME_RULE);
		createEAttribute(timeRuleEClass, TIME_RULE__DATE);
		createEAttribute(timeRuleEClass, TIME_RULE__TOLERANCE);

		compositeRuleEClass = createEClass(COMPOSITE_RULE);
		createEReference(compositeRuleEClass, COMPOSITE_RULE__CHILDREN);

		customRuleEClass = createEClass(CUSTOM_RULE);
		createEAttribute(customRuleEClass, CUSTOM_RULE__RULE_PROCESSOR);

		ruleVisitorEClass = createEClass(RULE_VISITOR);
		createEAttribute(ruleVisitorEClass, RULE_VISITOR__DELEGATE);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__ORDERS);
		createEReference(triggerEClass, TRIGGER__RULES);
		createEAttribute(triggerEClass, TRIGGER__UUID);
		createEAttribute(triggerEClass, TRIGGER__ACTIVATED);
		createEAttribute(triggerEClass, TRIGGER__PROCESSED);
		createEReference(triggerEClass, TRIGGER__JSON_NOTIFICATIONS);
		createEReference(triggerEClass, TRIGGER__MAIL_NOTIFICATIONS);
		createEReference(triggerEClass, TRIGGER__SMS_NOTIFICATION);
		createEAttribute(triggerEClass, TRIGGER__LABEL);

		orderKindRuleEClass = createEClass(ORDER_KIND_RULE);
		createEAttribute(orderKindRuleEClass, ORDER_KIND_RULE__KIND);

		tradeBotsConfigEClass = createEClass(TRADE_BOTS_CONFIG);
		createEReference(tradeBotsConfigEClass, TRADE_BOTS_CONFIG__BOTS);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__TARGET);

		mailNotificationEClass = createEClass(MAIL_NOTIFICATION);

		smsNotifcationEClass = createEClass(SMS_NOTIFCATION);

		jsonNotificationEClass = createEClass(JSON_NOTIFICATION);

		// Create enums
		triggerKindEEnum = createEEnum(TRIGGER_KIND);

		// Create data types
		iTradeRuleVisitorDelegateEDataType = createEDataType(ITRADE_RULE_VISITOR_DELEGATE);
		iRuleEvalDelegateEDataType = createEDataType(IRULE_EVAL_DELEGATE);
		iCustomRuleProcessorEDataType = createEDataType(ICUSTOM_RULE_PROCESSOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BtcPackage theBtcPackage = (BtcPackage)EPackage.Registry.INSTANCE.getEPackage(BtcPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		priceRuleEClass.getESuperTypes().add(this.getTradingRule());
		volumeRuleEClass.getESuperTypes().add(this.getTradingRule());
		timeRuleEClass.getESuperTypes().add(this.getTradingRule());
		compositeRuleEClass.getESuperTypes().add(this.getTradingRule());
		customRuleEClass.getESuperTypes().add(this.getTradingRule());
		orderKindRuleEClass.getESuperTypes().add(this.getTradingRule());
		mailNotificationEClass.getESuperTypes().add(this.getNotification());
		smsNotifcationEClass.getESuperTypes().add(this.getNotification());
		jsonNotificationEClass.getESuperTypes().add(this.getNotification());

		// Initialize classes and features; add operations and parameters
		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobot_Uuid(), ecorePackage.getEString(), "uuid", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_Label(), ecorePackage.getEString(), "label", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_Price_int(), ecorePackage.getEBigInteger(), "price_int", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Currency(), theBtcPackage.getBtcCurrency(), "currency", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Date(), ecorePackage.getELong(), "date", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Kind(), theBtcPackage.getOrderKind(), "kind", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Message(), ecorePackage.getEString(), "message", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradingRuleEClass, TradingRule.class, "TradingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTradingRule_Trigger(), this.getTriggerKind(), "trigger", "SATISFIES", 0, 1, TradingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingRule_Ratio(), ecorePackage.getEFloat(), "ratio", null, 0, 1, TradingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingRule_Compliance(), ecorePackage.getEFloat(), "compliance", null, 0, 1, TradingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingRule_EvalDelegate(), this.getIRuleEvalDelegate(), "evalDelegate", null, 0, 1, TradingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingRule_Ctx(), ecorePackage.getEJavaObject(), "ctx", null, 0, 1, TradingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingRule_Label(), ecorePackage.getEString(), "label", null, 0, 1, TradingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(tradingRuleEClass, ecorePackage.getEObject(), "compute", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tradingRuleEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRuleVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(priceRuleEClass, PriceRule.class, "PriceRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriceRule_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, PriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPriceRule_PercentTolerance(), ecorePackage.getEFloat(), "percentTolerance", null, 0, 1, PriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPriceRule_Currency(), theBtcPackage.getBtcCurrency(), "currency", null, 0, 1, PriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeRuleEClass, VolumeRule.class, "VolumeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumeRule_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, VolumeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeRule_Tolerance(), ecorePackage.getEFloat(), "tolerance", null, 0, 1, VolumeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRuleEClass, TimeRule.class, "TimeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRule_Date(), ecorePackage.getELong(), "date", null, 0, 1, TimeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRule_Tolerance(), ecorePackage.getEFloat(), "tolerance", null, 0, 1, TimeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeRuleEClass, CompositeRule.class, "CompositeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeRule_Children(), this.getTradingRule(), null, "children", null, 0, -1, CompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customRuleEClass, CustomRule.class, "CustomRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomRule_RuleProcessor(), this.getICustomRuleProcessor(), "ruleProcessor", null, 0, 1, CustomRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleVisitorEClass, RuleVisitor.class, "RuleVisitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleVisitor_Delegate(), this.getITradeRuleVisitorDelegate(), "delegate", null, 0, 1, RuleVisitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ruleVisitorEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTradingRule(), "rule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Orders(), this.getOrder(), null, "orders", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Rules(), this.getTradingRule(), null, "rules", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Uuid(), ecorePackage.getEString(), "uuid", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Activated(), ecorePackage.getEBoolean(), "activated", "true", 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Processed(), ecorePackage.getEBoolean(), "processed", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_JsonNotifications(), this.getJsonNotification(), null, "jsonNotifications", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_MailNotifications(), this.getMailNotification(), null, "mailNotifications", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_SmsNotification(), this.getSMSNotifcation(), null, "smsNotification", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Label(), ecorePackage.getEString(), "label", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderKindRuleEClass, OrderKindRule.class, "OrderKindRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderKindRule_Kind(), theBtcPackage.getOrderKind(), "kind", null, 0, 1, OrderKindRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradeBotsConfigEClass, TradeBotsConfig.class, "TradeBotsConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTradeBotsConfig_Bots(), this.getRobot(), null, "bots", null, 0, -1, TradeBotsConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Target(), ecorePackage.getEString(), "target", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mailNotificationEClass, MailNotification.class, "MailNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smsNotifcationEClass, SMSNotifcation.class, "SMSNotifcation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonNotificationEClass, JsonNotification.class, "JsonNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(triggerKindEEnum, TriggerKind.class, "TriggerKind");
		addEEnumLiteral(triggerKindEEnum, TriggerKind.CROSS_OVER);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.CROSS_UNDER);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.SATISFIES);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.APPROXIMATES);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.EXCLUDES);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.WAS);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.WILL_BE);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.AS_USUAL);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.EXCEPTIONAL);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.WTF);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.FIRST_TIME);

		// Initialize data types
		initEDataType(iTradeRuleVisitorDelegateEDataType, ITradeRuleVisitorDelegate.class, "ITradeRuleVisitorDelegate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iRuleEvalDelegateEDataType, IRuleEvalDelegate.class, "IRuleEvalDelegate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iCustomRuleProcessorEDataType, ICustomRuleProcessor.class, "ICustomRuleProcessor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TradingPackageImpl
