/**
 */
package net.sf.smbt.btc.mtgox.impl;

import java.util.Collection;

import net.sf.smbt.btc.mtgox.CompactValue;
import net.sf.smbt.btc.mtgox.CurrencyWalletData;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.btc.mtgox.Order;
import net.sf.smbt.btc.mtgox.Wallet;
import net.sf.smbt.btc.mtgox.WalletRecord;
import net.sf.smbt.btc.mtgox.WalletRight;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wallet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getBitcoinAddr <em>Bitcoin Addr</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getLastLogin <em>Last Login</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getTradeFee <em>Trade Fee</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getMonthlyVolume <em>Monthly Volume</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getBtcInfo <em>Btc Info</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getEurInfo <em>Eur Info</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletImpl#getUsdInfo <em>Usd Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WalletImpl extends MinimalEObjectImpl.Container implements Wallet {
	/**
	 * The default value of the '{@link #getBitcoinAddr() <em>Bitcoin Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitcoinAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String BITCOIN_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitcoinAddr() <em>Bitcoin Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitcoinAddr()
	 * @generated
	 * @ordered
	 */
	protected String bitcoinAddr = BITCOIN_ADDR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<WalletRecord> records;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected CompactValue balance;

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
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected String created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLogin() <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLogin() <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastLogin = LAST_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTradeFee() <em>Trade Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeFee()
	 * @generated
	 * @ordered
	 */
	protected static final float TRADE_FEE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTradeFee() <em>Trade Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeFee()
	 * @generated
	 * @ordered
	 */
	protected float tradeFee = TRADE_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthlyVolume() <em>Monthly Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthlyVolume()
	 * @generated
	 * @ordered
	 */
	protected static final int MONTHLY_VOLUME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonthlyVolume() <em>Monthly Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthlyVolume()
	 * @generated
	 * @ordered
	 */
	protected int monthlyVolume = MONTHLY_VOLUME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected EList<WalletRight> rights;

	/**
	 * The cached value of the '{@link #getBtcInfo() <em>Btc Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtcInfo()
	 * @generated
	 * @ordered
	 */
	protected CurrencyWalletData btcInfo;

	/**
	 * The cached value of the '{@link #getEurInfo() <em>Eur Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEurInfo()
	 * @generated
	 * @ordered
	 */
	protected CurrencyWalletData eurInfo;

	/**
	 * The cached value of the '{@link #getUsdInfo() <em>Usd Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsdInfo()
	 * @generated
	 * @ordered
	 */
	protected CurrencyWalletData usdInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WalletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.WALLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBitcoinAddr() {
		return bitcoinAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitcoinAddr(String newBitcoinAddr) {
		String oldBitcoinAddr = bitcoinAddr;
		bitcoinAddr = newBitcoinAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__BITCOIN_ADDR, oldBitcoinAddr, bitcoinAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WalletRecord> getRecords() {
		if (records == null) {
			records = new EObjectResolvingEList<WalletRecord>(WalletRecord.class, this, MtgoxPackage.WALLET__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectResolvingEList<Order>(Order.class, this, MtgoxPackage.WALLET__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getBalance() {
		if (balance != null && balance.eIsProxy()) {
			InternalEObject oldBalance = (InternalEObject)balance;
			balance = (CompactValue)eResolveProxy(oldBalance);
			if (balance != oldBalance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.WALLET__BALANCE, oldBalance, balance));
			}
		}
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue basicGetBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(CompactValue newBalance) {
		CompactValue oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__BALANCE, oldBalance, balance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(String newCreated) {
		String oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastLogin() {
		return lastLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastLogin(String newLastLogin) {
		String oldLastLogin = lastLogin;
		lastLogin = newLastLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__LAST_LOGIN, oldLastLogin, lastLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTradeFee() {
		return tradeFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradeFee(float newTradeFee) {
		float oldTradeFee = tradeFee;
		tradeFee = newTradeFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__TRADE_FEE, oldTradeFee, tradeFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonthlyVolume() {
		return monthlyVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthlyVolume(int newMonthlyVolume) {
		int oldMonthlyVolume = monthlyVolume;
		monthlyVolume = newMonthlyVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__MONTHLY_VOLUME, oldMonthlyVolume, monthlyVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WalletRight> getRights() {
		if (rights == null) {
			rights = new EDataTypeUniqueEList<WalletRight>(WalletRight.class, this, MtgoxPackage.WALLET__RIGHTS);
		}
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyWalletData getBtcInfo() {
		if (btcInfo != null && btcInfo.eIsProxy()) {
			InternalEObject oldBtcInfo = (InternalEObject)btcInfo;
			btcInfo = (CurrencyWalletData)eResolveProxy(oldBtcInfo);
			if (btcInfo != oldBtcInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.WALLET__BTC_INFO, oldBtcInfo, btcInfo));
			}
		}
		return btcInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyWalletData basicGetBtcInfo() {
		return btcInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtcInfo(CurrencyWalletData newBtcInfo) {
		CurrencyWalletData oldBtcInfo = btcInfo;
		btcInfo = newBtcInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__BTC_INFO, oldBtcInfo, btcInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyWalletData getEurInfo() {
		if (eurInfo != null && eurInfo.eIsProxy()) {
			InternalEObject oldEurInfo = (InternalEObject)eurInfo;
			eurInfo = (CurrencyWalletData)eResolveProxy(oldEurInfo);
			if (eurInfo != oldEurInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.WALLET__EUR_INFO, oldEurInfo, eurInfo));
			}
		}
		return eurInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyWalletData basicGetEurInfo() {
		return eurInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEurInfo(CurrencyWalletData newEurInfo) {
		CurrencyWalletData oldEurInfo = eurInfo;
		eurInfo = newEurInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__EUR_INFO, oldEurInfo, eurInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyWalletData getUsdInfo() {
		if (usdInfo != null && usdInfo.eIsProxy()) {
			InternalEObject oldUsdInfo = (InternalEObject)usdInfo;
			usdInfo = (CurrencyWalletData)eResolveProxy(oldUsdInfo);
			if (usdInfo != oldUsdInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.WALLET__USD_INFO, oldUsdInfo, usdInfo));
			}
		}
		return usdInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyWalletData basicGetUsdInfo() {
		return usdInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsdInfo(CurrencyWalletData newUsdInfo) {
		CurrencyWalletData oldUsdInfo = usdInfo;
		usdInfo = newUsdInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET__USD_INFO, oldUsdInfo, usdInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.WALLET__BITCOIN_ADDR:
				return getBitcoinAddr();
			case MtgoxPackage.WALLET__RECORDS:
				return getRecords();
			case MtgoxPackage.WALLET__ORDERS:
				return getOrders();
			case MtgoxPackage.WALLET__BALANCE:
				if (resolve) return getBalance();
				return basicGetBalance();
			case MtgoxPackage.WALLET__LOGIN:
				return getLogin();
			case MtgoxPackage.WALLET__CREATED:
				return getCreated();
			case MtgoxPackage.WALLET__LAST_LOGIN:
				return getLastLogin();
			case MtgoxPackage.WALLET__ID:
				return getId();
			case MtgoxPackage.WALLET__INDEX:
				return getIndex();
			case MtgoxPackage.WALLET__TRADE_FEE:
				return getTradeFee();
			case MtgoxPackage.WALLET__MONTHLY_VOLUME:
				return getMonthlyVolume();
			case MtgoxPackage.WALLET__RIGHTS:
				return getRights();
			case MtgoxPackage.WALLET__BTC_INFO:
				if (resolve) return getBtcInfo();
				return basicGetBtcInfo();
			case MtgoxPackage.WALLET__EUR_INFO:
				if (resolve) return getEurInfo();
				return basicGetEurInfo();
			case MtgoxPackage.WALLET__USD_INFO:
				if (resolve) return getUsdInfo();
				return basicGetUsdInfo();
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
			case MtgoxPackage.WALLET__BITCOIN_ADDR:
				setBitcoinAddr((String)newValue);
				return;
			case MtgoxPackage.WALLET__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends WalletRecord>)newValue);
				return;
			case MtgoxPackage.WALLET__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case MtgoxPackage.WALLET__BALANCE:
				setBalance((CompactValue)newValue);
				return;
			case MtgoxPackage.WALLET__LOGIN:
				setLogin((String)newValue);
				return;
			case MtgoxPackage.WALLET__CREATED:
				setCreated((String)newValue);
				return;
			case MtgoxPackage.WALLET__LAST_LOGIN:
				setLastLogin((String)newValue);
				return;
			case MtgoxPackage.WALLET__ID:
				setId((String)newValue);
				return;
			case MtgoxPackage.WALLET__INDEX:
				setIndex((Integer)newValue);
				return;
			case MtgoxPackage.WALLET__TRADE_FEE:
				setTradeFee((Float)newValue);
				return;
			case MtgoxPackage.WALLET__MONTHLY_VOLUME:
				setMonthlyVolume((Integer)newValue);
				return;
			case MtgoxPackage.WALLET__RIGHTS:
				getRights().clear();
				getRights().addAll((Collection<? extends WalletRight>)newValue);
				return;
			case MtgoxPackage.WALLET__BTC_INFO:
				setBtcInfo((CurrencyWalletData)newValue);
				return;
			case MtgoxPackage.WALLET__EUR_INFO:
				setEurInfo((CurrencyWalletData)newValue);
				return;
			case MtgoxPackage.WALLET__USD_INFO:
				setUsdInfo((CurrencyWalletData)newValue);
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
			case MtgoxPackage.WALLET__BITCOIN_ADDR:
				setBitcoinAddr(BITCOIN_ADDR_EDEFAULT);
				return;
			case MtgoxPackage.WALLET__RECORDS:
				getRecords().clear();
				return;
			case MtgoxPackage.WALLET__ORDERS:
				getOrders().clear();
				return;
			case MtgoxPackage.WALLET__BALANCE:
				setBalance((CompactValue)null);
				return;
			case MtgoxPackage.WALLET__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case MtgoxPackage.WALLET__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case MtgoxPackage.WALLET__LAST_LOGIN:
				setLastLogin(LAST_LOGIN_EDEFAULT);
				return;
			case MtgoxPackage.WALLET__ID:
				setId(ID_EDEFAULT);
				return;
			case MtgoxPackage.WALLET__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case MtgoxPackage.WALLET__TRADE_FEE:
				setTradeFee(TRADE_FEE_EDEFAULT);
				return;
			case MtgoxPackage.WALLET__MONTHLY_VOLUME:
				setMonthlyVolume(MONTHLY_VOLUME_EDEFAULT);
				return;
			case MtgoxPackage.WALLET__RIGHTS:
				getRights().clear();
				return;
			case MtgoxPackage.WALLET__BTC_INFO:
				setBtcInfo((CurrencyWalletData)null);
				return;
			case MtgoxPackage.WALLET__EUR_INFO:
				setEurInfo((CurrencyWalletData)null);
				return;
			case MtgoxPackage.WALLET__USD_INFO:
				setUsdInfo((CurrencyWalletData)null);
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
			case MtgoxPackage.WALLET__BITCOIN_ADDR:
				return BITCOIN_ADDR_EDEFAULT == null ? bitcoinAddr != null : !BITCOIN_ADDR_EDEFAULT.equals(bitcoinAddr);
			case MtgoxPackage.WALLET__RECORDS:
				return records != null && !records.isEmpty();
			case MtgoxPackage.WALLET__ORDERS:
				return orders != null && !orders.isEmpty();
			case MtgoxPackage.WALLET__BALANCE:
				return balance != null;
			case MtgoxPackage.WALLET__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case MtgoxPackage.WALLET__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case MtgoxPackage.WALLET__LAST_LOGIN:
				return LAST_LOGIN_EDEFAULT == null ? lastLogin != null : !LAST_LOGIN_EDEFAULT.equals(lastLogin);
			case MtgoxPackage.WALLET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MtgoxPackage.WALLET__INDEX:
				return index != INDEX_EDEFAULT;
			case MtgoxPackage.WALLET__TRADE_FEE:
				return tradeFee != TRADE_FEE_EDEFAULT;
			case MtgoxPackage.WALLET__MONTHLY_VOLUME:
				return monthlyVolume != MONTHLY_VOLUME_EDEFAULT;
			case MtgoxPackage.WALLET__RIGHTS:
				return rights != null && !rights.isEmpty();
			case MtgoxPackage.WALLET__BTC_INFO:
				return btcInfo != null;
			case MtgoxPackage.WALLET__EUR_INFO:
				return eurInfo != null;
			case MtgoxPackage.WALLET__USD_INFO:
				return usdInfo != null;
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
		result.append(" (bitcoinAddr: ");
		result.append(bitcoinAddr);
		result.append(", login: ");
		result.append(login);
		result.append(", created: ");
		result.append(created);
		result.append(", lastLogin: ");
		result.append(lastLogin);
		result.append(", id: ");
		result.append(id);
		result.append(", index: ");
		result.append(index);
		result.append(", tradeFee: ");
		result.append(tradeFee);
		result.append(", monthlyVolume: ");
		result.append(monthlyVolume);
		result.append(", rights: ");
		result.append(rights);
		result.append(')');
		return result.toString();
	}

} //WalletImpl
