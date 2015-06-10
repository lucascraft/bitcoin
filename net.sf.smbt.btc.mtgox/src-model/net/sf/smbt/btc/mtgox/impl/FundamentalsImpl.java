/**
 */
package net.sf.smbt.btc.mtgox.impl;

import net.sf.smbt.btc.mtgox.Fundamentals;
import net.sf.smbt.btc.mtgox.MtgoxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fundamentals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FundamentalsImpl#getHigh <em>High</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FundamentalsImpl#getLow <em>Low</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FundamentalsImpl#getBuy <em>Buy</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FundamentalsImpl#getSell <em>Sell</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FundamentalsImpl#getLast <em>Last</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FundamentalsImpl#getAverage <em>Average</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FundamentalsImpl extends MinimalEObjectImpl.Container implements Fundamentals {
	/**
	 * The default value of the '{@link #getHigh() <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected float high = HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLow() <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected float low = LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuy() <em>Buy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuy()
	 * @generated
	 * @ordered
	 */
	protected static final float BUY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBuy() <em>Buy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuy()
	 * @generated
	 * @ordered
	 */
	protected float buy = BUY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSell() <em>Sell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSell()
	 * @generated
	 * @ordered
	 */
	protected static final float SELL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSell() <em>Sell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSell()
	 * @generated
	 * @ordered
	 */
	protected float sell = SELL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast() <em>Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected static final float LAST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLast() <em>Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected float last = LAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected static final float AVERAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected float average = AVERAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FundamentalsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.FUNDAMENTALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(float newHigh) {
		float oldHigh = high;
		high = newHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FUNDAMENTALS__HIGH, oldHigh, high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(float newLow) {
		float oldLow = low;
		low = newLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FUNDAMENTALS__LOW, oldLow, low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBuy() {
		return buy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuy(float newBuy) {
		float oldBuy = buy;
		buy = newBuy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FUNDAMENTALS__BUY, oldBuy, buy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSell() {
		return sell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSell(float newSell) {
		float oldSell = sell;
		sell = newSell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FUNDAMENTALS__SELL, oldSell, sell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLast() {
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast(float newLast) {
		float oldLast = last;
		last = newLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FUNDAMENTALS__LAST, oldLast, last));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAverage() {
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverage(float newAverage) {
		float oldAverage = average;
		average = newAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FUNDAMENTALS__AVERAGE, oldAverage, average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.FUNDAMENTALS__HIGH:
				return getHigh();
			case MtgoxPackage.FUNDAMENTALS__LOW:
				return getLow();
			case MtgoxPackage.FUNDAMENTALS__BUY:
				return getBuy();
			case MtgoxPackage.FUNDAMENTALS__SELL:
				return getSell();
			case MtgoxPackage.FUNDAMENTALS__LAST:
				return getLast();
			case MtgoxPackage.FUNDAMENTALS__AVERAGE:
				return getAverage();
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
			case MtgoxPackage.FUNDAMENTALS__HIGH:
				setHigh((Float)newValue);
				return;
			case MtgoxPackage.FUNDAMENTALS__LOW:
				setLow((Float)newValue);
				return;
			case MtgoxPackage.FUNDAMENTALS__BUY:
				setBuy((Float)newValue);
				return;
			case MtgoxPackage.FUNDAMENTALS__SELL:
				setSell((Float)newValue);
				return;
			case MtgoxPackage.FUNDAMENTALS__LAST:
				setLast((Float)newValue);
				return;
			case MtgoxPackage.FUNDAMENTALS__AVERAGE:
				setAverage((Float)newValue);
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
			case MtgoxPackage.FUNDAMENTALS__HIGH:
				setHigh(HIGH_EDEFAULT);
				return;
			case MtgoxPackage.FUNDAMENTALS__LOW:
				setLow(LOW_EDEFAULT);
				return;
			case MtgoxPackage.FUNDAMENTALS__BUY:
				setBuy(BUY_EDEFAULT);
				return;
			case MtgoxPackage.FUNDAMENTALS__SELL:
				setSell(SELL_EDEFAULT);
				return;
			case MtgoxPackage.FUNDAMENTALS__LAST:
				setLast(LAST_EDEFAULT);
				return;
			case MtgoxPackage.FUNDAMENTALS__AVERAGE:
				setAverage(AVERAGE_EDEFAULT);
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
			case MtgoxPackage.FUNDAMENTALS__HIGH:
				return high != HIGH_EDEFAULT;
			case MtgoxPackage.FUNDAMENTALS__LOW:
				return low != LOW_EDEFAULT;
			case MtgoxPackage.FUNDAMENTALS__BUY:
				return buy != BUY_EDEFAULT;
			case MtgoxPackage.FUNDAMENTALS__SELL:
				return sell != SELL_EDEFAULT;
			case MtgoxPackage.FUNDAMENTALS__LAST:
				return last != LAST_EDEFAULT;
			case MtgoxPackage.FUNDAMENTALS__AVERAGE:
				return average != AVERAGE_EDEFAULT;
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
		result.append(" (high: ");
		result.append(high);
		result.append(", low: ");
		result.append(low);
		result.append(", buy: ");
		result.append(buy);
		result.append(", sell: ");
		result.append(sell);
		result.append(", last: ");
		result.append(last);
		result.append(", average: ");
		result.append(average);
		result.append(')');
		return result.toString();
	}

} //FundamentalsImpl
