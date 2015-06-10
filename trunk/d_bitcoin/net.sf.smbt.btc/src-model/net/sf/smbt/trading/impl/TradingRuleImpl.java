/**
 */
package net.sf.smbt.trading.impl;

import net.sf.smbt.btc.notifications.IRuleEvalDelegate;
import net.sf.smbt.trading.RuleVisitor;
import net.sf.smbt.trading.TradingPackage;
import net.sf.smbt.trading.TradingRule;
import net.sf.smbt.trading.TriggerKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.impl.TradingRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TradingRuleImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TradingRuleImpl#getCompliance <em>Compliance</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TradingRuleImpl#getEvalDelegate <em>Eval Delegate</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TradingRuleImpl#getCtx <em>Ctx</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TradingRuleImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TradingRuleImpl extends MinimalEObjectImpl.Container implements TradingRule {
	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerKind TRIGGER_EDEFAULT = TriggerKind.SATISFIES;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected TriggerKind trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected float ratio = RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompliance() <em>Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance()
	 * @generated
	 * @ordered
	 */
	protected static final float COMPLIANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCompliance() <em>Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance()
	 * @generated
	 * @ordered
	 */
	protected float compliance = COMPLIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvalDelegate() <em>Eval Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvalDelegate()
	 * @generated
	 * @ordered
	 */
	protected static final IRuleEvalDelegate EVAL_DELEGATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvalDelegate() <em>Eval Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvalDelegate()
	 * @generated
	 * @ordered
	 */
	protected IRuleEvalDelegate evalDelegate = EVAL_DELEGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCtx() <em>Ctx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtx()
	 * @generated
	 * @ordered
	 */
	protected static final Object CTX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCtx() <em>Ctx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtx()
	 * @generated
	 * @ordered
	 */
	protected Object ctx = CTX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.TRADING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerKind getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(TriggerKind newTrigger) {
		TriggerKind oldTrigger = trigger;
		trigger = newTrigger == null ? TRIGGER_EDEFAULT : newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRADING_RULE__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatio() {
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatio(float newRatio) {
		float oldRatio = ratio;
		ratio = newRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRADING_RULE__RATIO, oldRatio, ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCompliance() {
		return compliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompliance(float newCompliance) {
		float oldCompliance = compliance;
		compliance = newCompliance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRADING_RULE__COMPLIANCE, oldCompliance, compliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRuleEvalDelegate getEvalDelegate() {
		return evalDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvalDelegate(IRuleEvalDelegate newEvalDelegate) {
		IRuleEvalDelegate oldEvalDelegate = evalDelegate;
		evalDelegate = newEvalDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRADING_RULE__EVAL_DELEGATE, oldEvalDelegate, evalDelegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCtx() {
		return ctx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtx(Object newCtx) {
		Object oldCtx = ctx;
		ctx = newCtx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRADING_RULE__CTX, oldCtx, ctx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRADING_RULE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EObject> compute(Object ctx) {
		if (getEvalDelegate() != null) {
			return new BasicEList<EObject>(getEvalDelegate().eval(this, ctx));
		} 
		throw new RuntimeException("No Evaluator Delegate Found.");
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(RuleVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.TRADING_RULE__TRIGGER:
				return getTrigger();
			case TradingPackage.TRADING_RULE__RATIO:
				return getRatio();
			case TradingPackage.TRADING_RULE__COMPLIANCE:
				return getCompliance();
			case TradingPackage.TRADING_RULE__EVAL_DELEGATE:
				return getEvalDelegate();
			case TradingPackage.TRADING_RULE__CTX:
				return getCtx();
			case TradingPackage.TRADING_RULE__LABEL:
				return getLabel();
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
			case TradingPackage.TRADING_RULE__TRIGGER:
				setTrigger((TriggerKind)newValue);
				return;
			case TradingPackage.TRADING_RULE__RATIO:
				setRatio((Float)newValue);
				return;
			case TradingPackage.TRADING_RULE__COMPLIANCE:
				setCompliance((Float)newValue);
				return;
			case TradingPackage.TRADING_RULE__EVAL_DELEGATE:
				setEvalDelegate((IRuleEvalDelegate)newValue);
				return;
			case TradingPackage.TRADING_RULE__CTX:
				setCtx(newValue);
				return;
			case TradingPackage.TRADING_RULE__LABEL:
				setLabel((String)newValue);
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
			case TradingPackage.TRADING_RULE__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case TradingPackage.TRADING_RULE__RATIO:
				setRatio(RATIO_EDEFAULT);
				return;
			case TradingPackage.TRADING_RULE__COMPLIANCE:
				setCompliance(COMPLIANCE_EDEFAULT);
				return;
			case TradingPackage.TRADING_RULE__EVAL_DELEGATE:
				setEvalDelegate(EVAL_DELEGATE_EDEFAULT);
				return;
			case TradingPackage.TRADING_RULE__CTX:
				setCtx(CTX_EDEFAULT);
				return;
			case TradingPackage.TRADING_RULE__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case TradingPackage.TRADING_RULE__TRIGGER:
				return trigger != TRIGGER_EDEFAULT;
			case TradingPackage.TRADING_RULE__RATIO:
				return ratio != RATIO_EDEFAULT;
			case TradingPackage.TRADING_RULE__COMPLIANCE:
				return compliance != COMPLIANCE_EDEFAULT;
			case TradingPackage.TRADING_RULE__EVAL_DELEGATE:
				return EVAL_DELEGATE_EDEFAULT == null ? evalDelegate != null : !EVAL_DELEGATE_EDEFAULT.equals(evalDelegate);
			case TradingPackage.TRADING_RULE__CTX:
				return CTX_EDEFAULT == null ? ctx != null : !CTX_EDEFAULT.equals(ctx);
			case TradingPackage.TRADING_RULE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (trigger: ");
		result.append(trigger);
		result.append(", ratio: ");
		result.append(ratio);
		result.append(", compliance: ");
		result.append(compliance);
		result.append(", evalDelegate: ");
		result.append(evalDelegate);
		result.append(", ctx: ");
		result.append(ctx);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //TradingRuleImpl
