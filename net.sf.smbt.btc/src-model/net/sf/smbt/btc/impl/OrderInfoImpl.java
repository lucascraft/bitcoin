/**
 */
package net.sf.smbt.btc.impl;

import java.util.Date;

import net.sf.smbt.btc.BtcPackage;
import net.sf.smbt.btc.OrderInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.impl.OrderInfoImpl#getHigh <em>High</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.OrderInfoImpl#getLow <em>Low</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.OrderInfoImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.OrderInfoImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.OrderInfoImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderInfoImpl extends MinimalEObjectImpl.Container implements OrderInfo {
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
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final long VOLUME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected long volume = VOLUME_EDEFAULT;

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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcPackage.Literals.ORDER_INFO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.ORDER_INFO__HIGH, oldHigh, high));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.ORDER_INFO__LOW, oldLow, low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(long newVolume) {
		long oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.ORDER_INFO__VOLUME, oldVolume, volume));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.ORDER_INFO__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.ORDER_INFO__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtcPackage.ORDER_INFO__HIGH:
				return getHigh();
			case BtcPackage.ORDER_INFO__LOW:
				return getLow();
			case BtcPackage.ORDER_INFO__VOLUME:
				return getVolume();
			case BtcPackage.ORDER_INFO__PRICE:
				return getPrice();
			case BtcPackage.ORDER_INFO__DATE:
				return getDate();
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
			case BtcPackage.ORDER_INFO__HIGH:
				setHigh((Float)newValue);
				return;
			case BtcPackage.ORDER_INFO__LOW:
				setLow((Float)newValue);
				return;
			case BtcPackage.ORDER_INFO__VOLUME:
				setVolume((Long)newValue);
				return;
			case BtcPackage.ORDER_INFO__PRICE:
				setPrice((Float)newValue);
				return;
			case BtcPackage.ORDER_INFO__DATE:
				setDate((Date)newValue);
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
			case BtcPackage.ORDER_INFO__HIGH:
				setHigh(HIGH_EDEFAULT);
				return;
			case BtcPackage.ORDER_INFO__LOW:
				setLow(LOW_EDEFAULT);
				return;
			case BtcPackage.ORDER_INFO__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case BtcPackage.ORDER_INFO__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case BtcPackage.ORDER_INFO__DATE:
				setDate(DATE_EDEFAULT);
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
			case BtcPackage.ORDER_INFO__HIGH:
				return high != HIGH_EDEFAULT;
			case BtcPackage.ORDER_INFO__LOW:
				return low != LOW_EDEFAULT;
			case BtcPackage.ORDER_INFO__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case BtcPackage.ORDER_INFO__PRICE:
				return price != PRICE_EDEFAULT;
			case BtcPackage.ORDER_INFO__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
		result.append(", volume: ");
		result.append(volume);
		result.append(", price: ");
		result.append(price);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //OrderInfoImpl
