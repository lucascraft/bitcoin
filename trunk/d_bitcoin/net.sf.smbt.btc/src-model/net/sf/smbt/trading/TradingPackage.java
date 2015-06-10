/**
 */
package net.sf.smbt.trading;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.trading.TradingFactory
 * @model kind="package"
 * @generated
 */
public interface TradingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trading";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://trading/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	String eNS_PREFIX = "bots";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TradingPackage eINSTANCE = net.sf.smbt.trading.impl.TradingPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.RobotImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__UUID = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__TRIGGERS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.OrderImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 1;

	/**
	 * The feature id for the '<em><b>Price int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRICE_INT = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CURRENCY = 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DATE = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__KIND = 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__MESSAGE = 5;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.TradingRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.TradingRuleImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTradingRule()
	 * @generated
	 */
	int TRADING_RULE = 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_RULE__TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_RULE__RATIO = 1;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_RULE__COMPLIANCE = 2;

	/**
	 * The feature id for the '<em><b>Eval Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_RULE__EVAL_DELEGATE = 3;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_RULE__CTX = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_RULE__LABEL = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_RULE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.PriceRuleImpl <em>Price Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.PriceRuleImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getPriceRule()
	 * @generated
	 */
	int PRICE_RULE = 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__TRIGGER = TRADING_RULE__TRIGGER;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__RATIO = TRADING_RULE__RATIO;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__COMPLIANCE = TRADING_RULE__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Eval Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__EVAL_DELEGATE = TRADING_RULE__EVAL_DELEGATE;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__CTX = TRADING_RULE__CTX;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__LABEL = TRADING_RULE__LABEL;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__PRICE = TRADING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Percent Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__PERCENT_TOLERANCE = TRADING_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE__CURRENCY = TRADING_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Price Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_RULE_FEATURE_COUNT = TRADING_RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.VolumeRuleImpl <em>Volume Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.VolumeRuleImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getVolumeRule()
	 * @generated
	 */
	int VOLUME_RULE = 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE__TRIGGER = TRADING_RULE__TRIGGER;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE__RATIO = TRADING_RULE__RATIO;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE__COMPLIANCE = TRADING_RULE__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Eval Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE__EVAL_DELEGATE = TRADING_RULE__EVAL_DELEGATE;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE__CTX = TRADING_RULE__CTX;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE__LABEL = TRADING_RULE__LABEL;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE__VOLUME = TRADING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE__TOLERANCE = TRADING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Volume Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_RULE_FEATURE_COUNT = TRADING_RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.TimeRuleImpl <em>Time Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.TimeRuleImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTimeRule()
	 * @generated
	 */
	int TIME_RULE = 5;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE__TRIGGER = TRADING_RULE__TRIGGER;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE__RATIO = TRADING_RULE__RATIO;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE__COMPLIANCE = TRADING_RULE__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Eval Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE__EVAL_DELEGATE = TRADING_RULE__EVAL_DELEGATE;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE__CTX = TRADING_RULE__CTX;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE__LABEL = TRADING_RULE__LABEL;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE__DATE = TRADING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE__TOLERANCE = TRADING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RULE_FEATURE_COUNT = TRADING_RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.CompositeRuleImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getCompositeRule()
	 * @generated
	 */
	int COMPOSITE_RULE = 6;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__TRIGGER = TRADING_RULE__TRIGGER;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__RATIO = TRADING_RULE__RATIO;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__COMPLIANCE = TRADING_RULE__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Eval Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__EVAL_DELEGATE = TRADING_RULE__EVAL_DELEGATE;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__CTX = TRADING_RULE__CTX;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__LABEL = TRADING_RULE__LABEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__CHILDREN = TRADING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE_FEATURE_COUNT = TRADING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.CustomRuleImpl <em>Custom Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.CustomRuleImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getCustomRule()
	 * @generated
	 */
	int CUSTOM_RULE = 7;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RULE__TRIGGER = TRADING_RULE__TRIGGER;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RULE__RATIO = TRADING_RULE__RATIO;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RULE__COMPLIANCE = TRADING_RULE__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Eval Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RULE__EVAL_DELEGATE = TRADING_RULE__EVAL_DELEGATE;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RULE__CTX = TRADING_RULE__CTX;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RULE__LABEL = TRADING_RULE__LABEL;

	/**
	 * The feature id for the '<em><b>Rule Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RULE__RULE_PROCESSOR = TRADING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RULE_FEATURE_COUNT = TRADING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.RuleVisitorImpl <em>Rule Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.RuleVisitorImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getRuleVisitor()
	 * @generated
	 */
	int RULE_VISITOR = 8;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VISITOR__DELEGATE = 0;

	/**
	 * The number of structural features of the '<em>Rule Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VISITOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.TriggerImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 9;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ORDERS = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__RULES = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__UUID = 2;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTIVATED = 3;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PROCESSED = 4;

	/**
	 * The feature id for the '<em><b>Json Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__JSON_NOTIFICATIONS = 5;

	/**
	 * The feature id for the '<em><b>Mail Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__MAIL_NOTIFICATIONS = 6;

	/**
	 * The feature id for the '<em><b>Sms Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__SMS_NOTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__LABEL = 8;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.OrderKindRuleImpl <em>Order Kind Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.OrderKindRuleImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getOrderKindRule()
	 * @generated
	 */
	int ORDER_KIND_RULE = 10;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_KIND_RULE__TRIGGER = TRADING_RULE__TRIGGER;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_KIND_RULE__RATIO = TRADING_RULE__RATIO;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_KIND_RULE__COMPLIANCE = TRADING_RULE__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Eval Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_KIND_RULE__EVAL_DELEGATE = TRADING_RULE__EVAL_DELEGATE;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_KIND_RULE__CTX = TRADING_RULE__CTX;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_KIND_RULE__LABEL = TRADING_RULE__LABEL;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_KIND_RULE__KIND = TRADING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order Kind Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_KIND_RULE_FEATURE_COUNT = TRADING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.TradeBotsConfigImpl <em>Trade Bots Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.TradeBotsConfigImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTradeBotsConfig()
	 * @generated
	 */
	int TRADE_BOTS_CONFIG = 11;

	/**
	 * The feature id for the '<em><b>Bots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_BOTS_CONFIG__BOTS = 0;

	/**
	 * The number of structural features of the '<em>Trade Bots Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_BOTS_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.NotificationImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.MailNotificationImpl <em>Mail Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.MailNotificationImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getMailNotification()
	 * @generated
	 */
	int MAIL_NOTIFICATION = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_NOTIFICATION__TARGET = NOTIFICATION__TARGET;

	/**
	 * The number of structural features of the '<em>Mail Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_NOTIFICATION_FEATURE_COUNT = NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.SMSNotifcationImpl <em>SMS Notifcation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.SMSNotifcationImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getSMSNotifcation()
	 * @generated
	 */
	int SMS_NOTIFCATION = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS_NOTIFCATION__TARGET = NOTIFICATION__TARGET;

	/**
	 * The number of structural features of the '<em>SMS Notifcation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMS_NOTIFCATION_FEATURE_COUNT = NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.impl.JsonNotificationImpl <em>Json Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.impl.JsonNotificationImpl
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getJsonNotification()
	 * @generated
	 */
	int JSON_NOTIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NOTIFICATION__TARGET = NOTIFICATION__TARGET;

	/**
	 * The number of structural features of the '<em>Json Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NOTIFICATION_FEATURE_COUNT = NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.trading.TriggerKind <em>Trigger Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.trading.TriggerKind
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTriggerKind()
	 * @generated
	 */
	int TRIGGER_KIND = 16;


	/**
	 * The meta object id for the '<em>ITrade Rule Visitor Delegate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getITradeRuleVisitorDelegate()
	 * @generated
	 */
	int ITRADE_RULE_VISITOR_DELEGATE = 17;


	/**
	 * The meta object id for the '<em>IRule Eval Delegate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.notifications.IRuleEvalDelegate
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getIRuleEvalDelegate()
	 * @generated
	 */
	int IRULE_EVAL_DELEGATE = 18;


	/**
	 * The meta object id for the '<em>ICustom Rule Processor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btc.notifications.ICustomRuleProcessor
	 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getICustomRuleProcessor()
	 * @generated
	 */
	int ICUSTOM_RULE_PROCESSOR = 19;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see net.sf.smbt.trading.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Robot#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see net.sf.smbt.trading.Robot#getUuid()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Uuid();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.trading.Robot#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see net.sf.smbt.trading.Robot#getTriggers()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Triggers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Robot#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.trading.Robot#getLabel()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see net.sf.smbt.trading.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Order#getPrice_int <em>Price int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price int</em>'.
	 * @see net.sf.smbt.trading.Order#getPrice_int()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Price_int();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Order#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.trading.Order#getCurrency()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Currency();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Order#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.trading.Order#getVolume()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Order#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.trading.Order#getDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Order#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.trading.Order#getKind()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Order#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see net.sf.smbt.trading.Order#getMessage()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Message();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.TradingRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see net.sf.smbt.trading.TradingRule
	 * @generated
	 */
	EClass getTradingRule();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.TradingRule#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see net.sf.smbt.trading.TradingRule#getTrigger()
	 * @see #getTradingRule()
	 * @generated
	 */
	EAttribute getTradingRule_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.TradingRule#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see net.sf.smbt.trading.TradingRule#getRatio()
	 * @see #getTradingRule()
	 * @generated
	 */
	EAttribute getTradingRule_Ratio();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.TradingRule#getCompliance <em>Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance</em>'.
	 * @see net.sf.smbt.trading.TradingRule#getCompliance()
	 * @see #getTradingRule()
	 * @generated
	 */
	EAttribute getTradingRule_Compliance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.TradingRule#getEvalDelegate <em>Eval Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eval Delegate</em>'.
	 * @see net.sf.smbt.trading.TradingRule#getEvalDelegate()
	 * @see #getTradingRule()
	 * @generated
	 */
	EAttribute getTradingRule_EvalDelegate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.TradingRule#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctx</em>'.
	 * @see net.sf.smbt.trading.TradingRule#getCtx()
	 * @see #getTradingRule()
	 * @generated
	 */
	EAttribute getTradingRule_Ctx();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.TradingRule#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.trading.TradingRule#getLabel()
	 * @see #getTradingRule()
	 * @generated
	 */
	EAttribute getTradingRule_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.PriceRule <em>Price Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price Rule</em>'.
	 * @see net.sf.smbt.trading.PriceRule
	 * @generated
	 */
	EClass getPriceRule();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.PriceRule#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see net.sf.smbt.trading.PriceRule#getPrice()
	 * @see #getPriceRule()
	 * @generated
	 */
	EAttribute getPriceRule_Price();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.PriceRule#getPercentTolerance <em>Percent Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Tolerance</em>'.
	 * @see net.sf.smbt.trading.PriceRule#getPercentTolerance()
	 * @see #getPriceRule()
	 * @generated
	 */
	EAttribute getPriceRule_PercentTolerance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.PriceRule#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see net.sf.smbt.trading.PriceRule#getCurrency()
	 * @see #getPriceRule()
	 * @generated
	 */
	EAttribute getPriceRule_Currency();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.VolumeRule <em>Volume Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Rule</em>'.
	 * @see net.sf.smbt.trading.VolumeRule
	 * @generated
	 */
	EClass getVolumeRule();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.VolumeRule#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.trading.VolumeRule#getVolume()
	 * @see #getVolumeRule()
	 * @generated
	 */
	EAttribute getVolumeRule_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.VolumeRule#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see net.sf.smbt.trading.VolumeRule#getTolerance()
	 * @see #getVolumeRule()
	 * @generated
	 */
	EAttribute getVolumeRule_Tolerance();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.TimeRule <em>Time Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Rule</em>'.
	 * @see net.sf.smbt.trading.TimeRule
	 * @generated
	 */
	EClass getTimeRule();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.TimeRule#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.trading.TimeRule#getDate()
	 * @see #getTimeRule()
	 * @generated
	 */
	EAttribute getTimeRule_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.TimeRule#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see net.sf.smbt.trading.TimeRule#getTolerance()
	 * @see #getTimeRule()
	 * @generated
	 */
	EAttribute getTimeRule_Tolerance();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.CompositeRule <em>Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Rule</em>'.
	 * @see net.sf.smbt.trading.CompositeRule
	 * @generated
	 */
	EClass getCompositeRule();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.trading.CompositeRule#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.trading.CompositeRule#getChildren()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EReference getCompositeRule_Children();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.CustomRule <em>Custom Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Rule</em>'.
	 * @see net.sf.smbt.trading.CustomRule
	 * @generated
	 */
	EClass getCustomRule();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.CustomRule#getRuleProcessor <em>Rule Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Processor</em>'.
	 * @see net.sf.smbt.trading.CustomRule#getRuleProcessor()
	 * @see #getCustomRule()
	 * @generated
	 */
	EAttribute getCustomRule_RuleProcessor();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.RuleVisitor <em>Rule Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Visitor</em>'.
	 * @see net.sf.smbt.trading.RuleVisitor
	 * @generated
	 */
	EClass getRuleVisitor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.RuleVisitor#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate</em>'.
	 * @see net.sf.smbt.trading.RuleVisitor#getDelegate()
	 * @see #getRuleVisitor()
	 * @generated
	 */
	EAttribute getRuleVisitor_Delegate();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see net.sf.smbt.trading.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.trading.Trigger#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see net.sf.smbt.trading.Trigger#getOrders()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.trading.Trigger#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see net.sf.smbt.trading.Trigger#getRules()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Rules();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Trigger#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see net.sf.smbt.trading.Trigger#getUuid()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Trigger#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see net.sf.smbt.trading.Trigger#isActivated()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Activated();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Trigger#isProcessed <em>Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processed</em>'.
	 * @see net.sf.smbt.trading.Trigger#isProcessed()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Processed();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.trading.Trigger#getJsonNotifications <em>Json Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Json Notifications</em>'.
	 * @see net.sf.smbt.trading.Trigger#getJsonNotifications()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_JsonNotifications();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.trading.Trigger#getMailNotifications <em>Mail Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mail Notifications</em>'.
	 * @see net.sf.smbt.trading.Trigger#getMailNotifications()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_MailNotifications();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.trading.Trigger#getSmsNotification <em>Sms Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sms Notification</em>'.
	 * @see net.sf.smbt.trading.Trigger#getSmsNotification()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_SmsNotification();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Trigger#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.trading.Trigger#getLabel()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.OrderKindRule <em>Order Kind Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Kind Rule</em>'.
	 * @see net.sf.smbt.trading.OrderKindRule
	 * @generated
	 */
	EClass getOrderKindRule();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.OrderKindRule#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.trading.OrderKindRule#getKind()
	 * @see #getOrderKindRule()
	 * @generated
	 */
	EAttribute getOrderKindRule_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.TradeBotsConfig <em>Trade Bots Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade Bots Config</em>'.
	 * @see net.sf.smbt.trading.TradeBotsConfig
	 * @generated
	 */
	EClass getTradeBotsConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.trading.TradeBotsConfig#getBots <em>Bots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bots</em>'.
	 * @see net.sf.smbt.trading.TradeBotsConfig#getBots()
	 * @see #getTradeBotsConfig()
	 * @generated
	 */
	EReference getTradeBotsConfig_Bots();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see net.sf.smbt.trading.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.trading.Notification#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see net.sf.smbt.trading.Notification#getTarget()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.MailNotification <em>Mail Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Notification</em>'.
	 * @see net.sf.smbt.trading.MailNotification
	 * @generated
	 */
	EClass getMailNotification();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.SMSNotifcation <em>SMS Notifcation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMS Notifcation</em>'.
	 * @see net.sf.smbt.trading.SMSNotifcation
	 * @generated
	 */
	EClass getSMSNotifcation();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.trading.JsonNotification <em>Json Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Notification</em>'.
	 * @see net.sf.smbt.trading.JsonNotification
	 * @generated
	 */
	EClass getJsonNotification();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.trading.TriggerKind <em>Trigger Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Kind</em>'.
	 * @see net.sf.smbt.trading.TriggerKind
	 * @generated
	 */
	EEnum getTriggerKind();

	/**
	 * Returns the meta object for data type '{@link net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate <em>ITrade Rule Visitor Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ITrade Rule Visitor Delegate</em>'.
	 * @see net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate
	 * @model instanceClass="net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate"
	 * @generated
	 */
	EDataType getITradeRuleVisitorDelegate();

	/**
	 * Returns the meta object for data type '{@link net.sf.smbt.btc.notifications.IRuleEvalDelegate <em>IRule Eval Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IRule Eval Delegate</em>'.
	 * @see net.sf.smbt.btc.notifications.IRuleEvalDelegate
	 * @model instanceClass="net.sf.smbt.btc.notifications.IRuleEvalDelegate"
	 * @generated
	 */
	EDataType getIRuleEvalDelegate();

	/**
	 * Returns the meta object for data type '{@link net.sf.smbt.btc.notifications.ICustomRuleProcessor <em>ICustom Rule Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ICustom Rule Processor</em>'.
	 * @see net.sf.smbt.btc.notifications.ICustomRuleProcessor
	 * @model instanceClass="net.sf.smbt.btc.notifications.ICustomRuleProcessor"
	 * @generated
	 */
	EDataType getICustomRuleProcessor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TradingFactory getTradingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.RobotImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__UUID = eINSTANCE.getRobot_Uuid();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__TRIGGERS = eINSTANCE.getRobot_Triggers();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__LABEL = eINSTANCE.getRobot_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.OrderImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Price int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRICE_INT = eINSTANCE.getOrder_Price_int();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__CURRENCY = eINSTANCE.getOrder_Currency();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__VOLUME = eINSTANCE.getOrder_Volume();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__DATE = eINSTANCE.getOrder_Date();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__KIND = eINSTANCE.getOrder_Kind();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__MESSAGE = eINSTANCE.getOrder_Message();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.TradingRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.TradingRuleImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTradingRule()
		 * @generated
		 */
		EClass TRADING_RULE = eINSTANCE.getTradingRule();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_RULE__TRIGGER = eINSTANCE.getTradingRule_Trigger();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_RULE__RATIO = eINSTANCE.getTradingRule_Ratio();

		/**
		 * The meta object literal for the '<em><b>Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_RULE__COMPLIANCE = eINSTANCE.getTradingRule_Compliance();

		/**
		 * The meta object literal for the '<em><b>Eval Delegate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_RULE__EVAL_DELEGATE = eINSTANCE.getTradingRule_EvalDelegate();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_RULE__CTX = eINSTANCE.getTradingRule_Ctx();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_RULE__LABEL = eINSTANCE.getTradingRule_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.PriceRuleImpl <em>Price Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.PriceRuleImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getPriceRule()
		 * @generated
		 */
		EClass PRICE_RULE = eINSTANCE.getPriceRule();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_RULE__PRICE = eINSTANCE.getPriceRule_Price();

		/**
		 * The meta object literal for the '<em><b>Percent Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_RULE__PERCENT_TOLERANCE = eINSTANCE.getPriceRule_PercentTolerance();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_RULE__CURRENCY = eINSTANCE.getPriceRule_Currency();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.VolumeRuleImpl <em>Volume Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.VolumeRuleImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getVolumeRule()
		 * @generated
		 */
		EClass VOLUME_RULE = eINSTANCE.getVolumeRule();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_RULE__VOLUME = eINSTANCE.getVolumeRule_Volume();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_RULE__TOLERANCE = eINSTANCE.getVolumeRule_Tolerance();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.TimeRuleImpl <em>Time Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.TimeRuleImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTimeRule()
		 * @generated
		 */
		EClass TIME_RULE = eINSTANCE.getTimeRule();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RULE__DATE = eINSTANCE.getTimeRule_Date();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RULE__TOLERANCE = eINSTANCE.getTimeRule_Tolerance();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.CompositeRuleImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getCompositeRule()
		 * @generated
		 */
		EClass COMPOSITE_RULE = eINSTANCE.getCompositeRule();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_RULE__CHILDREN = eINSTANCE.getCompositeRule_Children();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.CustomRuleImpl <em>Custom Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.CustomRuleImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getCustomRule()
		 * @generated
		 */
		EClass CUSTOM_RULE = eINSTANCE.getCustomRule();

		/**
		 * The meta object literal for the '<em><b>Rule Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RULE__RULE_PROCESSOR = eINSTANCE.getCustomRule_RuleProcessor();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.RuleVisitorImpl <em>Rule Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.RuleVisitorImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getRuleVisitor()
		 * @generated
		 */
		EClass RULE_VISITOR = eINSTANCE.getRuleVisitor();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VISITOR__DELEGATE = eINSTANCE.getRuleVisitor_Delegate();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.TriggerImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__ORDERS = eINSTANCE.getTrigger_Orders();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__RULES = eINSTANCE.getTrigger_Rules();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__UUID = eINSTANCE.getTrigger_Uuid();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ACTIVATED = eINSTANCE.getTrigger_Activated();

		/**
		 * The meta object literal for the '<em><b>Processed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__PROCESSED = eINSTANCE.getTrigger_Processed();

		/**
		 * The meta object literal for the '<em><b>Json Notifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__JSON_NOTIFICATIONS = eINSTANCE.getTrigger_JsonNotifications();

		/**
		 * The meta object literal for the '<em><b>Mail Notifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__MAIL_NOTIFICATIONS = eINSTANCE.getTrigger_MailNotifications();

		/**
		 * The meta object literal for the '<em><b>Sms Notification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__SMS_NOTIFICATION = eINSTANCE.getTrigger_SmsNotification();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__LABEL = eINSTANCE.getTrigger_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.OrderKindRuleImpl <em>Order Kind Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.OrderKindRuleImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getOrderKindRule()
		 * @generated
		 */
		EClass ORDER_KIND_RULE = eINSTANCE.getOrderKindRule();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_KIND_RULE__KIND = eINSTANCE.getOrderKindRule_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.TradeBotsConfigImpl <em>Trade Bots Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.TradeBotsConfigImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTradeBotsConfig()
		 * @generated
		 */
		EClass TRADE_BOTS_CONFIG = eINSTANCE.getTradeBotsConfig();

		/**
		 * The meta object literal for the '<em><b>Bots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_BOTS_CONFIG__BOTS = eINSTANCE.getTradeBotsConfig_Bots();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.NotificationImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__TARGET = eINSTANCE.getNotification_Target();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.MailNotificationImpl <em>Mail Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.MailNotificationImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getMailNotification()
		 * @generated
		 */
		EClass MAIL_NOTIFICATION = eINSTANCE.getMailNotification();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.SMSNotifcationImpl <em>SMS Notifcation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.SMSNotifcationImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getSMSNotifcation()
		 * @generated
		 */
		EClass SMS_NOTIFCATION = eINSTANCE.getSMSNotifcation();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.impl.JsonNotificationImpl <em>Json Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.impl.JsonNotificationImpl
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getJsonNotification()
		 * @generated
		 */
		EClass JSON_NOTIFICATION = eINSTANCE.getJsonNotification();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.trading.TriggerKind <em>Trigger Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.trading.TriggerKind
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getTriggerKind()
		 * @generated
		 */
		EEnum TRIGGER_KIND = eINSTANCE.getTriggerKind();

		/**
		 * The meta object literal for the '<em>ITrade Rule Visitor Delegate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getITradeRuleVisitorDelegate()
		 * @generated
		 */
		EDataType ITRADE_RULE_VISITOR_DELEGATE = eINSTANCE.getITradeRuleVisitorDelegate();

		/**
		 * The meta object literal for the '<em>IRule Eval Delegate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.notifications.IRuleEvalDelegate
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getIRuleEvalDelegate()
		 * @generated
		 */
		EDataType IRULE_EVAL_DELEGATE = eINSTANCE.getIRuleEvalDelegate();

		/**
		 * The meta object literal for the '<em>ICustom Rule Processor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btc.notifications.ICustomRuleProcessor
		 * @see net.sf.smbt.trading.impl.TradingPackageImpl#getICustomRuleProcessor()
		 * @generated
		 */
		EDataType ICUSTOM_RULE_PROCESSOR = eINSTANCE.getICustomRuleProcessor();

	}

} //TradingPackage
