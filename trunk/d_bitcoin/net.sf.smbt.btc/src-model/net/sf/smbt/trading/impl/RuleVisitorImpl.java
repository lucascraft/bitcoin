/**
 */
package net.sf.smbt.trading.impl;

import net.sf.smbt.btc.notifications.ITradeRuleVisitorDelegate;
import net.sf.smbt.trading.RuleVisitor;
import net.sf.smbt.trading.TradingPackage;
import net.sf.smbt.trading.TradingRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.impl.RuleVisitorImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleVisitorImpl extends MinimalEObjectImpl.Container implements RuleVisitor {
	/**
	 * The default value of the '{@link #getDelegate() <em>Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected static final ITradeRuleVisitorDelegate DELEGATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected ITradeRuleVisitorDelegate delegate = DELEGATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.RULE_VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITradeRuleVisitorDelegate getDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(ITradeRuleVisitorDelegate newDelegate) {
		ITradeRuleVisitorDelegate oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.RULE_VISITOR__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean eval(TradingRule rule) {
		if (delegate != null) {
			return delegate.visit(rule);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.RULE_VISITOR__DELEGATE:
				return getDelegate();
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
			case TradingPackage.RULE_VISITOR__DELEGATE:
				setDelegate((ITradeRuleVisitorDelegate)newValue);
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
			case TradingPackage.RULE_VISITOR__DELEGATE:
				setDelegate(DELEGATE_EDEFAULT);
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
			case TradingPackage.RULE_VISITOR__DELEGATE:
				return DELEGATE_EDEFAULT == null ? delegate != null : !DELEGATE_EDEFAULT.equals(delegate);
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
		result.append(" (delegate: ");
		result.append(delegate);
		result.append(')');
		return result.toString();
	}

} //RuleVisitorImpl
