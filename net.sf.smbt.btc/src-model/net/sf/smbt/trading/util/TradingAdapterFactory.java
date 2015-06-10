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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.trading.TradingPackage
 * @generated
 */
public class TradingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TradingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TradingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradingSwitch<Adapter> modelSwitch =
		new TradingSwitch<Adapter>() {
			@Override
			public Adapter caseRobot(Robot object) {
				return createRobotAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseTradingRule(TradingRule object) {
				return createTradingRuleAdapter();
			}
			@Override
			public Adapter casePriceRule(PriceRule object) {
				return createPriceRuleAdapter();
			}
			@Override
			public Adapter caseVolumeRule(VolumeRule object) {
				return createVolumeRuleAdapter();
			}
			@Override
			public Adapter caseTimeRule(TimeRule object) {
				return createTimeRuleAdapter();
			}
			@Override
			public Adapter caseCompositeRule(CompositeRule object) {
				return createCompositeRuleAdapter();
			}
			@Override
			public Adapter caseCustomRule(CustomRule object) {
				return createCustomRuleAdapter();
			}
			@Override
			public Adapter caseRuleVisitor(RuleVisitor object) {
				return createRuleVisitorAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseOrderKindRule(OrderKindRule object) {
				return createOrderKindRuleAdapter();
			}
			@Override
			public Adapter caseTradeBotsConfig(TradeBotsConfig object) {
				return createTradeBotsConfigAdapter();
			}
			@Override
			public Adapter caseNotification(Notification object) {
				return createNotificationAdapter();
			}
			@Override
			public Adapter caseMailNotification(MailNotification object) {
				return createMailNotificationAdapter();
			}
			@Override
			public Adapter caseSMSNotifcation(SMSNotifcation object) {
				return createSMSNotifcationAdapter();
			}
			@Override
			public Adapter caseJsonNotification(JsonNotification object) {
				return createJsonNotificationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.TradingRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.TradingRule
	 * @generated
	 */
	public Adapter createTradingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.PriceRule <em>Price Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.PriceRule
	 * @generated
	 */
	public Adapter createPriceRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.VolumeRule <em>Volume Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.VolumeRule
	 * @generated
	 */
	public Adapter createVolumeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.TimeRule <em>Time Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.TimeRule
	 * @generated
	 */
	public Adapter createTimeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.CompositeRule <em>Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.CompositeRule
	 * @generated
	 */
	public Adapter createCompositeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.CustomRule <em>Custom Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.CustomRule
	 * @generated
	 */
	public Adapter createCustomRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.RuleVisitor <em>Rule Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.RuleVisitor
	 * @generated
	 */
	public Adapter createRuleVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.OrderKindRule <em>Order Kind Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.OrderKindRule
	 * @generated
	 */
	public Adapter createOrderKindRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.TradeBotsConfig <em>Trade Bots Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.TradeBotsConfig
	 * @generated
	 */
	public Adapter createTradeBotsConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.Notification
	 * @generated
	 */
	public Adapter createNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.MailNotification <em>Mail Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.MailNotification
	 * @generated
	 */
	public Adapter createMailNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.SMSNotifcation <em>SMS Notifcation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.SMSNotifcation
	 * @generated
	 */
	public Adapter createSMSNotifcationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.trading.JsonNotification <em>Json Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.trading.JsonNotification
	 * @generated
	 */
	public Adapter createJsonNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TradingAdapterFactory
