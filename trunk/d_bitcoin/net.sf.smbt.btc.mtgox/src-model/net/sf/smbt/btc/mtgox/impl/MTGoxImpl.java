/**
 */
package net.sf.smbt.btc.mtgox.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.CompactValue;
import net.sf.smbt.btc.mtgox.DepthValue;
import net.sf.smbt.btc.mtgox.FetchValue;
import net.sf.smbt.btc.mtgox.Fundamentals;
import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.btc.mtgox.Wallet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
 * An implementation of the model object '<em><b>MT Gox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getMarket <em>Market</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getFeeRate <em>Fee Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getHighV <em>High V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getLowV <em>Low V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getSellV <em>Sell V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getBuyV <em>Buy V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getLastV <em>Last V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getVolumeV <em>Volume V</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getTrend <em>Trend</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getFetchs <em>Fetchs</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getWallet <em>Wallet</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getSales <em>Sales</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#isSocketioConnected <em>Socketio Connected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getBids <em>Bids</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.MTGoxImpl#getAsks <em>Asks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MTGoxImpl extends MinimalEObjectImpl.Container implements MTGox {
	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected String apiKey = API_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarket() <em>Market</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarket()
	 * @generated
	 * @ordered
	 */
	protected BitcoinMarket market;

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
	 * The default value of the '{@link #getFeeRate() <em>Fee Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeeRate()
	 * @generated
	 * @ordered
	 */
	protected static final float FEE_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeeRate() <em>Fee Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeeRate()
	 * @generated
	 * @ordered
	 */
	protected float feeRate = FEE_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHighV() <em>High V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighV()
	 * @generated
	 * @ordered
	 */
	protected CompactValue highV;

	/**
	 * The cached value of the '{@link #getLowV() <em>Low V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowV()
	 * @generated
	 * @ordered
	 */
	protected CompactValue lowV;

	/**
	 * The cached value of the '{@link #getSellV() <em>Sell V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellV()
	 * @generated
	 * @ordered
	 */
	protected CompactValue sellV;

	/**
	 * The cached value of the '{@link #getBuyV() <em>Buy V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyV()
	 * @generated
	 * @ordered
	 */
	protected CompactValue buyV;

	/**
	 * The cached value of the '{@link #getLastV() <em>Last V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastV()
	 * @generated
	 * @ordered
	 */
	protected CompactValue lastV;

	/**
	 * The cached value of the '{@link #getVolumeV() <em>Volume V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeV()
	 * @generated
	 * @ordered
	 */
	protected CompactValue volumeV;

	/**
	 * The cached value of the '{@link #getTrend() <em>Trend</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrend()
	 * @generated
	 * @ordered
	 */
	protected EList<Fundamentals> trend;

	/**
	 * The cached value of the '{@link #getFetchs() <em>Fetchs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchs()
	 * @generated
	 * @ordered
	 */
	protected EList<FetchValue> fetchs;

	/**
	 * The cached value of the '{@link #getWallet() <em>Wallet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallet()
	 * @generated
	 * @ordered
	 */
	protected Wallet wallet;

	/**
	 * The cached value of the '{@link #getSales() <em>Sales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales()
	 * @generated
	 * @ordered
	 */
	protected EList<DepthValue> sales;

	/**
	 * The default value of the '{@link #isSocketioConnected() <em>Socketio Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSocketioConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOCKETIO_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSocketioConnected() <em>Socketio Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSocketioConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean socketioConnected = SOCKETIO_CONNECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBids() <em>Bids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBids()
	 * @generated
	 * @ordered
	 */
	protected EList<DepthValue> bids;

	/**
	 * The cached value of the '{@link #getAsks() <em>Asks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsks()
	 * @generated
	 * @ordered
	 */
	protected EList<DepthValue> asks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTGoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.MT_GOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiKey(String newApiKey) {
		String oldApiKey = apiKey;
		apiKey = newApiKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__API_KEY, oldApiKey, apiKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitcoinMarket getMarket() {
		return market;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarket(BitcoinMarket newMarket, NotificationChain msgs) {
		BitcoinMarket oldMarket = market;
		market = newMarket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__MARKET, oldMarket, newMarket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarket(BitcoinMarket newMarket) {
		if (newMarket != market) {
			NotificationChain msgs = null;
			if (market != null)
				msgs = ((InternalEObject)market).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__MARKET, null, msgs);
			if (newMarket != null)
				msgs = ((InternalEObject)newMarket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__MARKET, null, msgs);
			msgs = basicSetMarket(newMarket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__MARKET, newMarket, newMarket));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFeeRate() {
		return feeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeeRate(float newFeeRate) {
		float oldFeeRate = feeRate;
		feeRate = newFeeRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__FEE_RATE, oldFeeRate, feeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getHighV() {
		return highV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHighV(CompactValue newHighV, NotificationChain msgs) {
		CompactValue oldHighV = highV;
		highV = newHighV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__HIGH_V, oldHighV, newHighV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighV(CompactValue newHighV) {
		if (newHighV != highV) {
			NotificationChain msgs = null;
			if (highV != null)
				msgs = ((InternalEObject)highV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__HIGH_V, null, msgs);
			if (newHighV != null)
				msgs = ((InternalEObject)newHighV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__HIGH_V, null, msgs);
			msgs = basicSetHighV(newHighV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__HIGH_V, newHighV, newHighV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getLowV() {
		return lowV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowV(CompactValue newLowV, NotificationChain msgs) {
		CompactValue oldLowV = lowV;
		lowV = newLowV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__LOW_V, oldLowV, newLowV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowV(CompactValue newLowV) {
		if (newLowV != lowV) {
			NotificationChain msgs = null;
			if (lowV != null)
				msgs = ((InternalEObject)lowV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__LOW_V, null, msgs);
			if (newLowV != null)
				msgs = ((InternalEObject)newLowV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__LOW_V, null, msgs);
			msgs = basicSetLowV(newLowV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__LOW_V, newLowV, newLowV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getSellV() {
		return sellV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSellV(CompactValue newSellV, NotificationChain msgs) {
		CompactValue oldSellV = sellV;
		sellV = newSellV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__SELL_V, oldSellV, newSellV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSellV(CompactValue newSellV) {
		if (newSellV != sellV) {
			NotificationChain msgs = null;
			if (sellV != null)
				msgs = ((InternalEObject)sellV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__SELL_V, null, msgs);
			if (newSellV != null)
				msgs = ((InternalEObject)newSellV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__SELL_V, null, msgs);
			msgs = basicSetSellV(newSellV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__SELL_V, newSellV, newSellV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getBuyV() {
		return buyV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuyV(CompactValue newBuyV, NotificationChain msgs) {
		CompactValue oldBuyV = buyV;
		buyV = newBuyV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__BUY_V, oldBuyV, newBuyV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuyV(CompactValue newBuyV) {
		if (newBuyV != buyV) {
			NotificationChain msgs = null;
			if (buyV != null)
				msgs = ((InternalEObject)buyV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__BUY_V, null, msgs);
			if (newBuyV != null)
				msgs = ((InternalEObject)newBuyV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__BUY_V, null, msgs);
			msgs = basicSetBuyV(newBuyV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__BUY_V, newBuyV, newBuyV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getLastV() {
		return lastV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastV(CompactValue newLastV, NotificationChain msgs) {
		CompactValue oldLastV = lastV;
		lastV = newLastV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__LAST_V, oldLastV, newLastV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastV(CompactValue newLastV) {
		if (newLastV != lastV) {
			NotificationChain msgs = null;
			if (lastV != null)
				msgs = ((InternalEObject)lastV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__LAST_V, null, msgs);
			if (newLastV != null)
				msgs = ((InternalEObject)newLastV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__LAST_V, null, msgs);
			msgs = basicSetLastV(newLastV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__LAST_V, newLastV, newLastV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getVolumeV() {
		return volumeV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumeV(CompactValue newVolumeV, NotificationChain msgs) {
		CompactValue oldVolumeV = volumeV;
		volumeV = newVolumeV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__VOLUME_V, oldVolumeV, newVolumeV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeV(CompactValue newVolumeV) {
		if (newVolumeV != volumeV) {
			NotificationChain msgs = null;
			if (volumeV != null)
				msgs = ((InternalEObject)volumeV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__VOLUME_V, null, msgs);
			if (newVolumeV != null)
				msgs = ((InternalEObject)newVolumeV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MtgoxPackage.MT_GOX__VOLUME_V, null, msgs);
			msgs = basicSetVolumeV(newVolumeV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__VOLUME_V, newVolumeV, newVolumeV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fundamentals> getTrend() {
		if (trend == null) {
			trend = new EObjectResolvingEList<Fundamentals>(Fundamentals.class, this, MtgoxPackage.MT_GOX__TREND);
		}
		return trend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FetchValue> getFetchs() {
		if (fetchs == null) {
			fetchs = new EObjectContainmentEList<FetchValue>(FetchValue.class, this, MtgoxPackage.MT_GOX__FETCHS);
		}
		return fetchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet getWallet() {
		if (wallet != null && wallet.eIsProxy()) {
			InternalEObject oldWallet = (InternalEObject)wallet;
			wallet = (Wallet)eResolveProxy(oldWallet);
			if (wallet != oldWallet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.MT_GOX__WALLET, oldWallet, wallet));
			}
		}
		return wallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet basicGetWallet() {
		return wallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallet(Wallet newWallet) {
		Wallet oldWallet = wallet;
		wallet = newWallet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__WALLET, oldWallet, wallet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DepthValue> getSales() {
		if (sales == null) {
			sales = new EObjectResolvingEList<DepthValue>(DepthValue.class, this, MtgoxPackage.MT_GOX__SALES);
		}
		return sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSocketioConnected() {
		return socketioConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocketioConnected(boolean newSocketioConnected) {
		boolean oldSocketioConnected = socketioConnected;
		socketioConnected = newSocketioConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.MT_GOX__SOCKETIO_CONNECTED, oldSocketioConnected, socketioConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DepthValue> getBids() {
		if (bids == null) {
			bids = new EObjectResolvingEList<DepthValue>(DepthValue.class, this, MtgoxPackage.MT_GOX__BIDS);
		}
		return bids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DepthValue> getAsks() {
		if (asks == null) {
			asks = new EObjectResolvingEList<DepthValue>(DepthValue.class, this, MtgoxPackage.MT_GOX__ASKS);
		}
		return asks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DepthValue> getDepths() {
		List<DepthValue> lst = new ArrayList<DepthValue>();
		lst.addAll(getAsks());
		lst.addAll(getBids());
		return new BasicEList<DepthValue>(lst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MtgoxPackage.MT_GOX__MARKET:
				return basicSetMarket(null, msgs);
			case MtgoxPackage.MT_GOX__HIGH_V:
				return basicSetHighV(null, msgs);
			case MtgoxPackage.MT_GOX__LOW_V:
				return basicSetLowV(null, msgs);
			case MtgoxPackage.MT_GOX__SELL_V:
				return basicSetSellV(null, msgs);
			case MtgoxPackage.MT_GOX__BUY_V:
				return basicSetBuyV(null, msgs);
			case MtgoxPackage.MT_GOX__LAST_V:
				return basicSetLastV(null, msgs);
			case MtgoxPackage.MT_GOX__VOLUME_V:
				return basicSetVolumeV(null, msgs);
			case MtgoxPackage.MT_GOX__FETCHS:
				return ((InternalEList<?>)getFetchs()).basicRemove(otherEnd, msgs);
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
			case MtgoxPackage.MT_GOX__LOGIN:
				return getLogin();
			case MtgoxPackage.MT_GOX__PASSWORD:
				return getPassword();
			case MtgoxPackage.MT_GOX__API_KEY:
				return getApiKey();
			case MtgoxPackage.MT_GOX__MARKET:
				return getMarket();
			case MtgoxPackage.MT_GOX__CURRENCY:
				return getCurrency();
			case MtgoxPackage.MT_GOX__FEE_RATE:
				return getFeeRate();
			case MtgoxPackage.MT_GOX__HIGH_V:
				return getHighV();
			case MtgoxPackage.MT_GOX__LOW_V:
				return getLowV();
			case MtgoxPackage.MT_GOX__SELL_V:
				return getSellV();
			case MtgoxPackage.MT_GOX__BUY_V:
				return getBuyV();
			case MtgoxPackage.MT_GOX__LAST_V:
				return getLastV();
			case MtgoxPackage.MT_GOX__VOLUME_V:
				return getVolumeV();
			case MtgoxPackage.MT_GOX__TREND:
				return getTrend();
			case MtgoxPackage.MT_GOX__FETCHS:
				return getFetchs();
			case MtgoxPackage.MT_GOX__WALLET:
				if (resolve) return getWallet();
				return basicGetWallet();
			case MtgoxPackage.MT_GOX__SALES:
				return getSales();
			case MtgoxPackage.MT_GOX__SOCKETIO_CONNECTED:
				return isSocketioConnected();
			case MtgoxPackage.MT_GOX__BIDS:
				return getBids();
			case MtgoxPackage.MT_GOX__ASKS:
				return getAsks();
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
			case MtgoxPackage.MT_GOX__LOGIN:
				setLogin((String)newValue);
				return;
			case MtgoxPackage.MT_GOX__PASSWORD:
				setPassword((String)newValue);
				return;
			case MtgoxPackage.MT_GOX__API_KEY:
				setApiKey((String)newValue);
				return;
			case MtgoxPackage.MT_GOX__MARKET:
				setMarket((BitcoinMarket)newValue);
				return;
			case MtgoxPackage.MT_GOX__CURRENCY:
				setCurrency((BtcCurrency)newValue);
				return;
			case MtgoxPackage.MT_GOX__FEE_RATE:
				setFeeRate((Float)newValue);
				return;
			case MtgoxPackage.MT_GOX__HIGH_V:
				setHighV((CompactValue)newValue);
				return;
			case MtgoxPackage.MT_GOX__LOW_V:
				setLowV((CompactValue)newValue);
				return;
			case MtgoxPackage.MT_GOX__SELL_V:
				setSellV((CompactValue)newValue);
				return;
			case MtgoxPackage.MT_GOX__BUY_V:
				setBuyV((CompactValue)newValue);
				return;
			case MtgoxPackage.MT_GOX__LAST_V:
				setLastV((CompactValue)newValue);
				return;
			case MtgoxPackage.MT_GOX__VOLUME_V:
				setVolumeV((CompactValue)newValue);
				return;
			case MtgoxPackage.MT_GOX__TREND:
				getTrend().clear();
				getTrend().addAll((Collection<? extends Fundamentals>)newValue);
				return;
			case MtgoxPackage.MT_GOX__FETCHS:
				getFetchs().clear();
				getFetchs().addAll((Collection<? extends FetchValue>)newValue);
				return;
			case MtgoxPackage.MT_GOX__WALLET:
				setWallet((Wallet)newValue);
				return;
			case MtgoxPackage.MT_GOX__SALES:
				getSales().clear();
				getSales().addAll((Collection<? extends DepthValue>)newValue);
				return;
			case MtgoxPackage.MT_GOX__SOCKETIO_CONNECTED:
				setSocketioConnected((Boolean)newValue);
				return;
			case MtgoxPackage.MT_GOX__BIDS:
				getBids().clear();
				getBids().addAll((Collection<? extends DepthValue>)newValue);
				return;
			case MtgoxPackage.MT_GOX__ASKS:
				getAsks().clear();
				getAsks().addAll((Collection<? extends DepthValue>)newValue);
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
			case MtgoxPackage.MT_GOX__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case MtgoxPackage.MT_GOX__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case MtgoxPackage.MT_GOX__API_KEY:
				setApiKey(API_KEY_EDEFAULT);
				return;
			case MtgoxPackage.MT_GOX__MARKET:
				setMarket((BitcoinMarket)null);
				return;
			case MtgoxPackage.MT_GOX__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case MtgoxPackage.MT_GOX__FEE_RATE:
				setFeeRate(FEE_RATE_EDEFAULT);
				return;
			case MtgoxPackage.MT_GOX__HIGH_V:
				setHighV((CompactValue)null);
				return;
			case MtgoxPackage.MT_GOX__LOW_V:
				setLowV((CompactValue)null);
				return;
			case MtgoxPackage.MT_GOX__SELL_V:
				setSellV((CompactValue)null);
				return;
			case MtgoxPackage.MT_GOX__BUY_V:
				setBuyV((CompactValue)null);
				return;
			case MtgoxPackage.MT_GOX__LAST_V:
				setLastV((CompactValue)null);
				return;
			case MtgoxPackage.MT_GOX__VOLUME_V:
				setVolumeV((CompactValue)null);
				return;
			case MtgoxPackage.MT_GOX__TREND:
				getTrend().clear();
				return;
			case MtgoxPackage.MT_GOX__FETCHS:
				getFetchs().clear();
				return;
			case MtgoxPackage.MT_GOX__WALLET:
				setWallet((Wallet)null);
				return;
			case MtgoxPackage.MT_GOX__SALES:
				getSales().clear();
				return;
			case MtgoxPackage.MT_GOX__SOCKETIO_CONNECTED:
				setSocketioConnected(SOCKETIO_CONNECTED_EDEFAULT);
				return;
			case MtgoxPackage.MT_GOX__BIDS:
				getBids().clear();
				return;
			case MtgoxPackage.MT_GOX__ASKS:
				getAsks().clear();
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
			case MtgoxPackage.MT_GOX__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case MtgoxPackage.MT_GOX__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case MtgoxPackage.MT_GOX__API_KEY:
				return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
			case MtgoxPackage.MT_GOX__MARKET:
				return market != null;
			case MtgoxPackage.MT_GOX__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case MtgoxPackage.MT_GOX__FEE_RATE:
				return feeRate != FEE_RATE_EDEFAULT;
			case MtgoxPackage.MT_GOX__HIGH_V:
				return highV != null;
			case MtgoxPackage.MT_GOX__LOW_V:
				return lowV != null;
			case MtgoxPackage.MT_GOX__SELL_V:
				return sellV != null;
			case MtgoxPackage.MT_GOX__BUY_V:
				return buyV != null;
			case MtgoxPackage.MT_GOX__LAST_V:
				return lastV != null;
			case MtgoxPackage.MT_GOX__VOLUME_V:
				return volumeV != null;
			case MtgoxPackage.MT_GOX__TREND:
				return trend != null && !trend.isEmpty();
			case MtgoxPackage.MT_GOX__FETCHS:
				return fetchs != null && !fetchs.isEmpty();
			case MtgoxPackage.MT_GOX__WALLET:
				return wallet != null;
			case MtgoxPackage.MT_GOX__SALES:
				return sales != null && !sales.isEmpty();
			case MtgoxPackage.MT_GOX__SOCKETIO_CONNECTED:
				return socketioConnected != SOCKETIO_CONNECTED_EDEFAULT;
			case MtgoxPackage.MT_GOX__BIDS:
				return bids != null && !bids.isEmpty();
			case MtgoxPackage.MT_GOX__ASKS:
				return asks != null && !asks.isEmpty();
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
		result.append(" (login: ");
		result.append(login);
		result.append(", password: ");
		result.append(password);
		result.append(", apiKey: ");
		result.append(apiKey);
		result.append(", currency: ");
		result.append(currency);
		result.append(", feeRate: ");
		result.append(feeRate);
		result.append(", socketioConnected: ");
		result.append(socketioConnected);
		result.append(')');
		return result.toString();
	}

} //MTGoxImpl
