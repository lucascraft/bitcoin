/**
 */
package net.sf.smbt.trading.impl;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.trading.PriceRule;
import net.sf.smbt.trading.TradingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Price Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.impl.PriceRuleImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.PriceRuleImpl#getPercentTolerance <em>Percent Tolerance</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.PriceRuleImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriceRuleImpl extends TradingRuleImpl implements PriceRule {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPercentTolerance() <em>Percent Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENT_TOLERANCE_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getPercentTolerance() <em>Percent Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentTolerance()
	 * @generated
	 * @ordered
	 */
	protected float percentTolerance = PERCENT_TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final BtcCurrency CURRENCY_EDEFAULT = BtcCurrency.EUR;
	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected BtcCurrency currency = CURRENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriceRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.PRICE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.PRICE_RULE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPercentTolerance() {
		return percentTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentTolerance(float newPercentTolerance) {
		float oldPercentTolerance = percentTolerance;
		percentTolerance = newPercentTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.PRICE_RULE__PERCENT_TOLERANCE, oldPercentTolerance, percentTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcCurrency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(BtcCurrency newCurrency) {
		BtcCurrency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.PRICE_RULE__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.PRICE_RULE__PRICE:
				return getPrice();
			case TradingPackage.PRICE_RULE__PERCENT_TOLERANCE:
				return getPercentTolerance();
			case TradingPackage.PRICE_RULE__CURRENCY:
				return getCurrency();
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
			case TradingPackage.PRICE_RULE__PRICE:
				setPrice((Float)newValue);
				return;
			case TradingPackage.PRICE_RULE__PERCENT_TOLERANCE:
				setPercentTolerance((Float)newValue);
				return;
			case TradingPackage.PRICE_RULE__CURRENCY:
				setCurrency((BtcCurrency)newValue);
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
			case TradingPackage.PRICE_RULE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case TradingPackage.PRICE_RULE__PERCENT_TOLERANCE:
				setPercentTolerance(PERCENT_TOLERANCE_EDEFAULT);
				return;
			case TradingPackage.PRICE_RULE__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
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
			case TradingPackage.PRICE_RULE__PRICE:
				return price != PRICE_EDEFAULT;
			case TradingPackage.PRICE_RULE__PERCENT_TOLERANCE:
				return percentTolerance != PERCENT_TOLERANCE_EDEFAULT;
			case TradingPackage.PRICE_RULE__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
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
		result.append(" (price: ");
		result.append(price);
		result.append(", percentTolerance: ");
		result.append(percentTolerance);
		result.append(", currency: ");
		result.append(currency);
		result.append(')');
		return result.toString();
	}
	
} //PriceRuleImpl
