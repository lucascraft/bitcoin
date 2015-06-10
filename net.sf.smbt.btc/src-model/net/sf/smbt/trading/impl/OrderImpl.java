/**
 */
package net.sf.smbt.trading.impl;

import java.math.BigInteger;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.OrderKind;
import net.sf.smbt.trading.Order;
import net.sf.smbt.trading.TradingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.impl.OrderImpl#getPrice_int <em>Price int</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.OrderImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.OrderImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.OrderImpl#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.OrderImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.OrderImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getPrice_int() <em>Price int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice_int()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRICE_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrice_int() <em>Price int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice_int()
	 * @generated
	 * @ordered
	 */
	protected BigInteger price_int = PRICE_INT_EDEFAULT;

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
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLUME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected float volume = VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final long DATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected long date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final OrderKind KIND_EDEFAULT = OrderKind.ASK;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected OrderKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPrice_int() {
		return price_int;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice_int(BigInteger newPrice_int) {
		BigInteger oldPrice_int = price_int;
		price_int = newPrice_int;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.ORDER__PRICE_INT, oldPrice_int, price_int));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.ORDER__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(float newVolume) {
		float oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.ORDER__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(long newDate) {
		long oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.ORDER__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(OrderKind newKind) {
		OrderKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.ORDER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.ORDER__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.ORDER__PRICE_INT:
				return getPrice_int();
			case TradingPackage.ORDER__CURRENCY:
				return getCurrency();
			case TradingPackage.ORDER__VOLUME:
				return getVolume();
			case TradingPackage.ORDER__DATE:
				return getDate();
			case TradingPackage.ORDER__KIND:
				return getKind();
			case TradingPackage.ORDER__MESSAGE:
				return getMessage();
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
			case TradingPackage.ORDER__PRICE_INT:
				setPrice_int((BigInteger)newValue);
				return;
			case TradingPackage.ORDER__CURRENCY:
				setCurrency((BtcCurrency)newValue);
				return;
			case TradingPackage.ORDER__VOLUME:
				setVolume((Float)newValue);
				return;
			case TradingPackage.ORDER__DATE:
				setDate((Long)newValue);
				return;
			case TradingPackage.ORDER__KIND:
				setKind((OrderKind)newValue);
				return;
			case TradingPackage.ORDER__MESSAGE:
				setMessage((String)newValue);
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
			case TradingPackage.ORDER__PRICE_INT:
				setPrice_int(PRICE_INT_EDEFAULT);
				return;
			case TradingPackage.ORDER__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case TradingPackage.ORDER__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case TradingPackage.ORDER__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TradingPackage.ORDER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case TradingPackage.ORDER__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case TradingPackage.ORDER__PRICE_INT:
				return PRICE_INT_EDEFAULT == null ? price_int != null : !PRICE_INT_EDEFAULT.equals(price_int);
			case TradingPackage.ORDER__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case TradingPackage.ORDER__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case TradingPackage.ORDER__DATE:
				return date != DATE_EDEFAULT;
			case TradingPackage.ORDER__KIND:
				return kind != KIND_EDEFAULT;
			case TradingPackage.ORDER__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
		result.append(" (price_int: ");
		result.append(price_int);
		result.append(", currency: ");
		result.append(currency);
		result.append(", volume: ");
		result.append(volume);
		result.append(", date: ");
		result.append(date);
		result.append(", kind: ");
		result.append(kind);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
