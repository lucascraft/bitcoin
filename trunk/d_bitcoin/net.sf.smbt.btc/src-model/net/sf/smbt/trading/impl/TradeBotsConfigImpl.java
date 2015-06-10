/**
 */
package net.sf.smbt.trading.impl;

import java.util.Collection;

import net.sf.smbt.trading.Robot;
import net.sf.smbt.trading.TradeBotsConfig;
import net.sf.smbt.trading.TradingPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trade Bots Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.impl.TradeBotsConfigImpl#getBots <em>Bots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TradeBotsConfigImpl extends MinimalEObjectImpl.Container implements TradeBotsConfig {
	/**
	 * The cached value of the '{@link #getBots() <em>Bots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBots()
	 * @generated
	 * @ordered
	 */
	protected EList<Robot> bots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradeBotsConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.TRADE_BOTS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Robot> getBots() {
		if (bots == null) {
			bots = new EObjectContainmentEList<Robot>(Robot.class, this, TradingPackage.TRADE_BOTS_CONFIG__BOTS);
		}
		return bots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TradingPackage.TRADE_BOTS_CONFIG__BOTS:
				return ((InternalEList<?>)getBots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.TRADE_BOTS_CONFIG__BOTS:
				return getBots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TradingPackage.TRADE_BOTS_CONFIG__BOTS:
				getBots().clear();
				getBots().addAll((Collection<? extends Robot>)newValue);
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
			case TradingPackage.TRADE_BOTS_CONFIG__BOTS:
				getBots().clear();
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
			case TradingPackage.TRADE_BOTS_CONFIG__BOTS:
				return bots != null && !bots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TradeBotsConfigImpl
