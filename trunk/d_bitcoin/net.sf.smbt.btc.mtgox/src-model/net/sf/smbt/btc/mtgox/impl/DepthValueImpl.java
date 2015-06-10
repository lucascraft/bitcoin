/**
 */
package net.sf.smbt.btc.mtgox.impl;

import java.math.BigInteger;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.DepthStatus;
import net.sf.smbt.btc.mtgox.DepthValue;
import net.sf.smbt.btc.mtgox.FetchKind;
import net.sf.smbt.btc.mtgox.MtgoxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depth Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getPriceInt <em>Price Int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getAmountInt <em>Amount Int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getStamp <em>Stamp</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getLastLocalStatus <em>Last Local Status</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.DepthValueImpl#getVolumeInt <em>Volume Int</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DepthValueImpl extends MinimalEObjectImpl.Container implements DepthValue {
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
	 * The default value of the '{@link #getPriceInt() <em>Price Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceInt()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRICE_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriceInt() <em>Price Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceInt()
	 * @generated
	 * @ordered
	 */
	protected BigInteger priceInt = PRICE_INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountInt() <em>Amount Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountInt()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AMOUNT_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmountInt() <em>Amount Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountInt()
	 * @generated
	 * @ordered
	 */
	protected BigInteger amountInt = AMOUNT_INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStamp() <em>Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStamp()
	 * @generated
	 * @ordered
	 */
	protected static final long STAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStamp() <em>Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStamp()
	 * @generated
	 * @ordered
	 */
	protected long stamp = STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final FetchKind KIND_EDEFAULT = FetchKind.ASK;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected FetchKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSum() <em>Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSum()
	 * @generated
	 * @ordered
	 */
	protected static final float SUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSum() <em>Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSum()
	 * @generated
	 * @ordered
	 */
	protected float sum = SUM_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final DepthStatus STATUS_EDEFAULT = DepthStatus.NONE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DepthStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLocalStatus() <em>Last Local Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLocalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_LOCAL_STATUS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLastLocalStatus() <em>Last Local Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLocalStatus()
	 * @generated
	 * @ordered
	 */
	protected long lastLocalStatus = LAST_LOCAL_STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getVolumeInt() <em>Volume Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeInt()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VOLUME_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumeInt() <em>Volume Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeInt()
	 * @generated
	 * @ordered
	 */
	protected BigInteger volumeInt = VOLUME_INT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepthValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.DEPTH_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPriceInt() {
		return priceInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriceInt(BigInteger newPriceInt) {
		BigInteger oldPriceInt = priceInt;
		priceInt = newPriceInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__PRICE_INT, oldPriceInt, priceInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAmountInt() {
		return amountInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountInt(BigInteger newAmountInt) {
		BigInteger oldAmountInt = amountInt;
		amountInt = newAmountInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__AMOUNT_INT, oldAmountInt, amountInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStamp() {
		return stamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStamp(long newStamp) {
		long oldStamp = stamp;
		stamp = newStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__STAMP, oldStamp, stamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(FetchKind newKind) {
		FetchKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSum() {
		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSum(float newSum) {
		float oldSum = sum;
		sum = newSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__SUM, oldSum, sum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepthStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DepthStatus newStatus) {
		DepthStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastLocalStatus() {
		return lastLocalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLocalStatus(long newLastLocalStatus) {
		long oldLastLocalStatus = lastLocalStatus;
		lastLocalStatus = newLastLocalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__LAST_LOCAL_STATUS, oldLastLocalStatus, lastLocalStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVolumeInt() {
		return volumeInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeInt(BigInteger newVolumeInt) {
		BigInteger oldVolumeInt = volumeInt;
		volumeInt = newVolumeInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.DEPTH_VALUE__VOLUME_INT, oldVolumeInt, volumeInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.DEPTH_VALUE__PRICE:
				return getPrice();
			case MtgoxPackage.DEPTH_VALUE__PRICE_INT:
				return getPriceInt();
			case MtgoxPackage.DEPTH_VALUE__AMOUNT:
				return getAmount();
			case MtgoxPackage.DEPTH_VALUE__AMOUNT_INT:
				return getAmountInt();
			case MtgoxPackage.DEPTH_VALUE__STAMP:
				return getStamp();
			case MtgoxPackage.DEPTH_VALUE__KIND:
				return getKind();
			case MtgoxPackage.DEPTH_VALUE__SUM:
				return getSum();
			case MtgoxPackage.DEPTH_VALUE__CURRENCY:
				return getCurrency();
			case MtgoxPackage.DEPTH_VALUE__STATUS:
				return getStatus();
			case MtgoxPackage.DEPTH_VALUE__LAST_LOCAL_STATUS:
				return getLastLocalStatus();
			case MtgoxPackage.DEPTH_VALUE__VOLUME:
				return getVolume();
			case MtgoxPackage.DEPTH_VALUE__VOLUME_INT:
				return getVolumeInt();
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
			case MtgoxPackage.DEPTH_VALUE__PRICE:
				setPrice((Float)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__PRICE_INT:
				setPriceInt((BigInteger)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__AMOUNT:
				setAmount((Float)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__AMOUNT_INT:
				setAmountInt((BigInteger)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__STAMP:
				setStamp((Long)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__KIND:
				setKind((FetchKind)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__SUM:
				setSum((Float)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__CURRENCY:
				setCurrency((BtcCurrency)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__STATUS:
				setStatus((DepthStatus)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__LAST_LOCAL_STATUS:
				setLastLocalStatus((Long)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__VOLUME:
				setVolume((Float)newValue);
				return;
			case MtgoxPackage.DEPTH_VALUE__VOLUME_INT:
				setVolumeInt((BigInteger)newValue);
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
			case MtgoxPackage.DEPTH_VALUE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__PRICE_INT:
				setPriceInt(PRICE_INT_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__AMOUNT_INT:
				setAmountInt(AMOUNT_INT_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__STAMP:
				setStamp(STAMP_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__SUM:
				setSum(SUM_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__LAST_LOCAL_STATUS:
				setLastLocalStatus(LAST_LOCAL_STATUS_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case MtgoxPackage.DEPTH_VALUE__VOLUME_INT:
				setVolumeInt(VOLUME_INT_EDEFAULT);
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
			case MtgoxPackage.DEPTH_VALUE__PRICE:
				return price != PRICE_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__PRICE_INT:
				return PRICE_INT_EDEFAULT == null ? priceInt != null : !PRICE_INT_EDEFAULT.equals(priceInt);
			case MtgoxPackage.DEPTH_VALUE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__AMOUNT_INT:
				return AMOUNT_INT_EDEFAULT == null ? amountInt != null : !AMOUNT_INT_EDEFAULT.equals(amountInt);
			case MtgoxPackage.DEPTH_VALUE__STAMP:
				return stamp != STAMP_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__KIND:
				return kind != KIND_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__SUM:
				return sum != SUM_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__STATUS:
				return status != STATUS_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__LAST_LOCAL_STATUS:
				return lastLocalStatus != LAST_LOCAL_STATUS_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case MtgoxPackage.DEPTH_VALUE__VOLUME_INT:
				return VOLUME_INT_EDEFAULT == null ? volumeInt != null : !VOLUME_INT_EDEFAULT.equals(volumeInt);
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
		result.append(", priceInt: ");
		result.append(priceInt);
		result.append(", amount: ");
		result.append(amount);
		result.append(", amountInt: ");
		result.append(amountInt);
		result.append(", stamp: ");
		result.append(stamp);
		result.append(", kind: ");
		result.append(kind);
		result.append(", sum: ");
		result.append(sum);
		result.append(", currency: ");
		result.append(currency);
		result.append(", status: ");
		result.append(status);
		result.append(", lastLocalStatus: ");
		result.append(lastLocalStatus);
		result.append(", volume: ");
		result.append(volume);
		result.append(", volumeInt: ");
		result.append(volumeInt);
		result.append(')');
		return result.toString();
	}

} //DepthValueImpl
