/**
 */
package net.sf.smbt.btc.impl;

import java.util.Collection;

import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.BtcPackage;
import net.sf.smbt.btc.ExchangeRate;
import net.sf.smbt.btc.Order;
import net.sf.smbt.btc.OrderInfo;
import net.sf.smbt.btc.Wallet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitcoin Market</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getExchangeRates <em>Exchange Rates</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getBroker <em>Broker</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getHigh <em>High</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getLow <em>Low</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getBuy <em>Buy</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getSell <em>Sell</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getLast <em>Last</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getHistory <em>History</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getWallets <em>Wallets</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getLastLocal <em>Last Local</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.BitcoinMarketImpl#getLastOrig <em>Last Orig</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitcoinMarketImpl extends MinimalEObjectImpl.Container implements BitcoinMarket {
	/**
	 * The cached value of the '{@link #getExchangeRates() <em>Exchange Rates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRates()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeRate> exchangeRates;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The default value of the '{@link #getBroker() <em>Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroker()
	 * @generated
	 * @ordered
	 */
	protected static final String BROKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBroker() <em>Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroker()
	 * @generated
	 * @ordered
	 */
	protected String broker = BROKER_EDEFAULT;

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
	 * The cached value of the '{@link #getHistory() <em>History</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderInfo> history;

	/**
	 * The cached value of the '{@link #getWallets() <em>Wallets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallets()
	 * @generated
	 * @ordered
	 */
	protected EList<Wallet> wallets;

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
	 * The default value of the '{@link #getLastLocal() <em>Last Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLocal()
	 * @generated
	 * @ordered
	 */
	protected static final float LAST_LOCAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLastLocal() <em>Last Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLocal()
	 * @generated
	 * @ordered
	 */
	protected float lastLocal = LAST_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastOrig() <em>Last Orig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOrig()
	 * @generated
	 * @ordered
	 */
	protected static final float LAST_ORIG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLastOrig() <em>Last Orig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOrig()
	 * @generated
	 * @ordered
	 */
	protected float lastOrig = LAST_ORIG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitcoinMarketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcPackage.Literals.BITCOIN_MARKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeRate> getExchangeRates() {
		if (exchangeRates == null) {
			exchangeRates = new EObjectContainmentEList<ExchangeRate>(ExchangeRate.class, this, BtcPackage.BITCOIN_MARKET__EXCHANGE_RATES);
		}
		return exchangeRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<Order>(Order.class, this, BtcPackage.BITCOIN_MARKET__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBroker() {
		return broker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBroker(String newBroker) {
		String oldBroker = broker;
		broker = newBroker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__BROKER, oldBroker, broker));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__HIGH, oldHigh, high));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__LOW, oldLow, low));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__VOLUME, oldVolume, volume));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__BUY, oldBuy, buy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__SELL, oldSell, sell));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__LAST, oldLast, last));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderInfo> getHistory() {
		if (history == null) {
			history = new EObjectResolvingEList<OrderInfo>(OrderInfo.class, this, BtcPackage.BITCOIN_MARKET__HISTORY);
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wallet> getWallets() {
		if (wallets == null) {
			wallets = new EObjectResolvingEList<Wallet>(Wallet.class, this, BtcPackage.BITCOIN_MARKET__WALLETS);
		}
		return wallets;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__AVERAGE, oldAverage, average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLastLocal() {
		return lastLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLocal(float newLastLocal) {
		float oldLastLocal = lastLocal;
		lastLocal = newLastLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__LAST_LOCAL, oldLastLocal, lastLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLastOrig() {
		return lastOrig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastOrig(float newLastOrig) {
		float oldLastOrig = lastOrig;
		lastOrig = newLastOrig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.BITCOIN_MARKET__LAST_ORIG, oldLastOrig, lastOrig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtcPackage.BITCOIN_MARKET__EXCHANGE_RATES:
				return ((InternalEList<?>)getExchangeRates()).basicRemove(otherEnd, msgs);
			case BtcPackage.BITCOIN_MARKET__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
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
			case BtcPackage.BITCOIN_MARKET__EXCHANGE_RATES:
				return getExchangeRates();
			case BtcPackage.BITCOIN_MARKET__ORDERS:
				return getOrders();
			case BtcPackage.BITCOIN_MARKET__BROKER:
				return getBroker();
			case BtcPackage.BITCOIN_MARKET__HIGH:
				return getHigh();
			case BtcPackage.BITCOIN_MARKET__LOW:
				return getLow();
			case BtcPackage.BITCOIN_MARKET__VOLUME:
				return getVolume();
			case BtcPackage.BITCOIN_MARKET__BUY:
				return getBuy();
			case BtcPackage.BITCOIN_MARKET__SELL:
				return getSell();
			case BtcPackage.BITCOIN_MARKET__LAST:
				return getLast();
			case BtcPackage.BITCOIN_MARKET__CURRENCY:
				return getCurrency();
			case BtcPackage.BITCOIN_MARKET__HISTORY:
				return getHistory();
			case BtcPackage.BITCOIN_MARKET__WALLETS:
				return getWallets();
			case BtcPackage.BITCOIN_MARKET__AVERAGE:
				return getAverage();
			case BtcPackage.BITCOIN_MARKET__LAST_LOCAL:
				return getLastLocal();
			case BtcPackage.BITCOIN_MARKET__LAST_ORIG:
				return getLastOrig();
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
			case BtcPackage.BITCOIN_MARKET__EXCHANGE_RATES:
				getExchangeRates().clear();
				getExchangeRates().addAll((Collection<? extends ExchangeRate>)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__BROKER:
				setBroker((String)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__HIGH:
				setHigh((Float)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__LOW:
				setLow((Float)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__VOLUME:
				setVolume((Float)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__BUY:
				setBuy((Float)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__SELL:
				setSell((Float)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__LAST:
				setLast((Float)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__CURRENCY:
				setCurrency((BtcCurrency)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends OrderInfo>)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__WALLETS:
				getWallets().clear();
				getWallets().addAll((Collection<? extends Wallet>)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__AVERAGE:
				setAverage((Float)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__LAST_LOCAL:
				setLastLocal((Float)newValue);
				return;
			case BtcPackage.BITCOIN_MARKET__LAST_ORIG:
				setLastOrig((Float)newValue);
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
			case BtcPackage.BITCOIN_MARKET__EXCHANGE_RATES:
				getExchangeRates().clear();
				return;
			case BtcPackage.BITCOIN_MARKET__ORDERS:
				getOrders().clear();
				return;
			case BtcPackage.BITCOIN_MARKET__BROKER:
				setBroker(BROKER_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__HIGH:
				setHigh(HIGH_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__LOW:
				setLow(LOW_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__BUY:
				setBuy(BUY_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__SELL:
				setSell(SELL_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__LAST:
				setLast(LAST_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__HISTORY:
				getHistory().clear();
				return;
			case BtcPackage.BITCOIN_MARKET__WALLETS:
				getWallets().clear();
				return;
			case BtcPackage.BITCOIN_MARKET__AVERAGE:
				setAverage(AVERAGE_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__LAST_LOCAL:
				setLastLocal(LAST_LOCAL_EDEFAULT);
				return;
			case BtcPackage.BITCOIN_MARKET__LAST_ORIG:
				setLastOrig(LAST_ORIG_EDEFAULT);
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
			case BtcPackage.BITCOIN_MARKET__EXCHANGE_RATES:
				return exchangeRates != null && !exchangeRates.isEmpty();
			case BtcPackage.BITCOIN_MARKET__ORDERS:
				return orders != null && !orders.isEmpty();
			case BtcPackage.BITCOIN_MARKET__BROKER:
				return BROKER_EDEFAULT == null ? broker != null : !BROKER_EDEFAULT.equals(broker);
			case BtcPackage.BITCOIN_MARKET__HIGH:
				return high != HIGH_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__LOW:
				return low != LOW_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__BUY:
				return buy != BUY_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__SELL:
				return sell != SELL_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__LAST:
				return last != LAST_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__HISTORY:
				return history != null && !history.isEmpty();
			case BtcPackage.BITCOIN_MARKET__WALLETS:
				return wallets != null && !wallets.isEmpty();
			case BtcPackage.BITCOIN_MARKET__AVERAGE:
				return average != AVERAGE_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__LAST_LOCAL:
				return lastLocal != LAST_LOCAL_EDEFAULT;
			case BtcPackage.BITCOIN_MARKET__LAST_ORIG:
				return lastOrig != LAST_ORIG_EDEFAULT;
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
		result.append(" (broker: ");
		result.append(broker);
		result.append(", high: ");
		result.append(high);
		result.append(", low: ");
		result.append(low);
		result.append(", volume: ");
		result.append(volume);
		result.append(", buy: ");
		result.append(buy);
		result.append(", sell: ");
		result.append(sell);
		result.append(", last: ");
		result.append(last);
		result.append(", currency: ");
		result.append(currency);
		result.append(", average: ");
		result.append(average);
		result.append(", lastLocal: ");
		result.append(lastLocal);
		result.append(", lastOrig: ");
		result.append(lastOrig);
		result.append(')');
		return result.toString();
	}

} //BitcoinMarketImpl
