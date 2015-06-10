/**
 */
package net.sf.smbt.btc.mtgox.impl;

import java.math.BigInteger;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.FetchValue;
import net.sf.smbt.btc.mtgox.MtgoxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetch Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getStamp <em>Stamp</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getPriceInt <em>Price Int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getAmountInt <em>Amount Int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getTid <em>Tid</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getItem <em>Item</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getTradeType <em>Trade Type</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.FetchValueImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetchValueImpl extends MinimalEObjectImpl.Container implements FetchValue {
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
	 * The default value of the '{@link #getTid() <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTid()
	 * @generated
	 * @ordered
	 */
	protected static final String TID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTid() <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTid()
	 * @generated
	 * @ordered
	 */
	protected String tid = TID_EDEFAULT;

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
	 * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected String item = ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTradeType() <em>Trade Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRADE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTradeType() <em>Trade Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeType()
	 * @generated
	 * @ordered
	 */
	protected String tradeType = TRADE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected String primary = PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected String properties = PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FetchValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.FETCH_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__STAMP, oldStamp, stamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__PRICE, oldPrice, price));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__PRICE_INT, oldPriceInt, priceInt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__AMOUNT_INT, oldAmountInt, amountInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTid() {
		return tid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTid(String newTid) {
		String oldTid = tid;
		tid = newTid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__TID, oldTid, tid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(String newItem) {
		String oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTradeType() {
		return tradeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradeType(String newTradeType) {
		String oldTradeType = tradeType;
		tradeType = newTradeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__TRADE_TYPE, oldTradeType, tradeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimary() {
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(String newPrimary) {
		String oldPrimary = primary;
		primary = newPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__PRIMARY, oldPrimary, primary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(String newProperties) {
		String oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.FETCH_VALUE__PROPERTIES, oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.FETCH_VALUE__STAMP:
				return getStamp();
			case MtgoxPackage.FETCH_VALUE__PRICE:
				return getPrice();
			case MtgoxPackage.FETCH_VALUE__AMOUNT:
				return getAmount();
			case MtgoxPackage.FETCH_VALUE__PRICE_INT:
				return getPriceInt();
			case MtgoxPackage.FETCH_VALUE__AMOUNT_INT:
				return getAmountInt();
			case MtgoxPackage.FETCH_VALUE__TID:
				return getTid();
			case MtgoxPackage.FETCH_VALUE__CURRENCY:
				return getCurrency();
			case MtgoxPackage.FETCH_VALUE__ITEM:
				return getItem();
			case MtgoxPackage.FETCH_VALUE__TRADE_TYPE:
				return getTradeType();
			case MtgoxPackage.FETCH_VALUE__PRIMARY:
				return getPrimary();
			case MtgoxPackage.FETCH_VALUE__PROPERTIES:
				return getProperties();
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
			case MtgoxPackage.FETCH_VALUE__STAMP:
				setStamp((Long)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__PRICE:
				setPrice((Float)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__AMOUNT:
				setAmount((Float)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__PRICE_INT:
				setPriceInt((BigInteger)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__AMOUNT_INT:
				setAmountInt((BigInteger)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__TID:
				setTid((String)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__CURRENCY:
				setCurrency((BtcCurrency)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__ITEM:
				setItem((String)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__TRADE_TYPE:
				setTradeType((String)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__PRIMARY:
				setPrimary((String)newValue);
				return;
			case MtgoxPackage.FETCH_VALUE__PROPERTIES:
				setProperties((String)newValue);
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
			case MtgoxPackage.FETCH_VALUE__STAMP:
				setStamp(STAMP_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__PRICE_INT:
				setPriceInt(PRICE_INT_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__AMOUNT_INT:
				setAmountInt(AMOUNT_INT_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__TID:
				setTid(TID_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__ITEM:
				setItem(ITEM_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__TRADE_TYPE:
				setTradeType(TRADE_TYPE_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__PRIMARY:
				setPrimary(PRIMARY_EDEFAULT);
				return;
			case MtgoxPackage.FETCH_VALUE__PROPERTIES:
				setProperties(PROPERTIES_EDEFAULT);
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
			case MtgoxPackage.FETCH_VALUE__STAMP:
				return stamp != STAMP_EDEFAULT;
			case MtgoxPackage.FETCH_VALUE__PRICE:
				return price != PRICE_EDEFAULT;
			case MtgoxPackage.FETCH_VALUE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case MtgoxPackage.FETCH_VALUE__PRICE_INT:
				return PRICE_INT_EDEFAULT == null ? priceInt != null : !PRICE_INT_EDEFAULT.equals(priceInt);
			case MtgoxPackage.FETCH_VALUE__AMOUNT_INT:
				return AMOUNT_INT_EDEFAULT == null ? amountInt != null : !AMOUNT_INT_EDEFAULT.equals(amountInt);
			case MtgoxPackage.FETCH_VALUE__TID:
				return TID_EDEFAULT == null ? tid != null : !TID_EDEFAULT.equals(tid);
			case MtgoxPackage.FETCH_VALUE__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case MtgoxPackage.FETCH_VALUE__ITEM:
				return ITEM_EDEFAULT == null ? item != null : !ITEM_EDEFAULT.equals(item);
			case MtgoxPackage.FETCH_VALUE__TRADE_TYPE:
				return TRADE_TYPE_EDEFAULT == null ? tradeType != null : !TRADE_TYPE_EDEFAULT.equals(tradeType);
			case MtgoxPackage.FETCH_VALUE__PRIMARY:
				return PRIMARY_EDEFAULT == null ? primary != null : !PRIMARY_EDEFAULT.equals(primary);
			case MtgoxPackage.FETCH_VALUE__PROPERTIES:
				return PROPERTIES_EDEFAULT == null ? properties != null : !PROPERTIES_EDEFAULT.equals(properties);
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
		result.append(" (stamp: ");
		result.append(stamp);
		result.append(", price: ");
		result.append(price);
		result.append(", amount: ");
		result.append(amount);
		result.append(", priceInt: ");
		result.append(priceInt);
		result.append(", amountInt: ");
		result.append(amountInt);
		result.append(", tid: ");
		result.append(tid);
		result.append(", currency: ");
		result.append(currency);
		result.append(", item: ");
		result.append(item);
		result.append(", tradeType: ");
		result.append(tradeType);
		result.append(", primary: ");
		result.append(primary);
		result.append(", properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}

} //FetchValueImpl
