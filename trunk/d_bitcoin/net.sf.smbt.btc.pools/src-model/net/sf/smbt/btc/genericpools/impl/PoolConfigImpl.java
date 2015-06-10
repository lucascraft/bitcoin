/**
 */
package net.sf.smbt.btc.genericpools.impl;

import java.util.Collection;
import java.util.List;

import net.sf.smbt.btc.genericpools.GenericpoolsPackage;
import net.sf.smbt.btc.genericpools.PoolConfig;
import net.sf.smbt.btc.genericpools.Setting;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.CmdPipe;

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
 * An implementation of the model object '<em><b>Pool Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getUser <em>User</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getPwd <em>Pwd</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getWorker <em>Worker</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getPool <em>Pool</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.PoolConfigImpl#getLastAddress <em>Last Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PoolConfigImpl extends MinimalEObjectImpl.Container implements PoolConfig {
	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdPipe> engines;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected CmdPipe default_;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String PWD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected String pwd = PWD_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorker() <em>Worker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorker()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorker() <em>Worker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorker()
	 * @generated
	 * @ordered
	 */
	protected String worker = WORKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<Setting> settings;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPool() <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected static final String POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected String pool = POOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastAddress() <em>Last Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAddress()
	 * @generated
	 * @ordered
	 */
	protected XCPAddress lastAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericpoolsPackage.Literals.POOL_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CmdPipe> getEngines() {
		if (engines == null) {
			engines = new EObjectResolvingEList<CmdPipe>(CmdPipe.class, this, GenericpoolsPackage.POOL_CONFIG__ENGINES);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (CmdPipe)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericpoolsPackage.POOL_CONFIG__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		CmdPipe oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwd(String newPwd) {
		String oldPwd = pwd;
		pwd = newPwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__PWD, oldPwd, pwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorker() {
		return worker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorker(String newWorker) {
		String oldWorker = worker;
		worker = newWorker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__WORKER, oldWorker, worker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setting> getSettings() {
		if (settings == null) {
			settings = new EObjectContainmentEList<Setting>(Setting.class, this, GenericpoolsPackage.POOL_CONFIG__SETTINGS);
		}
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPool() {
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPool(String newPool) {
		String oldPool = pool;
		pool = newPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__POOL, oldPool, pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress getLastAddress() {
		return lastAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastAddress(XCPAddress newLastAddress, NotificationChain msgs) {
		XCPAddress oldLastAddress = lastAddress;
		lastAddress = newLastAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS, oldLastAddress, newLastAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAddress(XCPAddress newLastAddress) {
		if (newLastAddress != lastAddress) {
			NotificationChain msgs = null;
			if (lastAddress != null)
				msgs = ((InternalEObject)lastAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS, null, msgs);
			if (newLastAddress != null)
				msgs = ((InternalEObject)newLastAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS, null, msgs);
			msgs = basicSetLastAddress(newLastAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS, newLastAddress, newLastAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericpoolsPackage.POOL_CONFIG__SETTINGS:
				return ((InternalEList<?>)getSettings()).basicRemove(otherEnd, msgs);
			case GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS:
				return basicSetLastAddress(null, msgs);
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
			case GenericpoolsPackage.POOL_CONFIG__ENGINES:
				return getEngines();
			case GenericpoolsPackage.POOL_CONFIG__DEFAULT:
				return getDefault();
			case GenericpoolsPackage.POOL_CONFIG__URL:
				return getUrl();
			case GenericpoolsPackage.POOL_CONFIG__USER:
				return getUser();
			case GenericpoolsPackage.POOL_CONFIG__PWD:
				return getPwd();
			case GenericpoolsPackage.POOL_CONFIG__WORKER:
				return getWorker();
			case GenericpoolsPackage.POOL_CONFIG__KEY:
				return getKey();
			case GenericpoolsPackage.POOL_CONFIG__SETTINGS:
				return getSettings();
			case GenericpoolsPackage.POOL_CONFIG__PORT:
				return getPort();
			case GenericpoolsPackage.POOL_CONFIG__POOL:
				return getPool();
			case GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS:
				return getLastAddress();
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
			case GenericpoolsPackage.POOL_CONFIG__ENGINES:
				getEngines().clear();
				getEngines().addAll((Collection<? extends CmdPipe>)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__DEFAULT:
				setDefault((CmdPipe)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__USER:
				setUser((String)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__PWD:
				setPwd((String)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__WORKER:
				setWorker((String)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__KEY:
				setKey((String)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__SETTINGS:
				getSettings().clear();
				getSettings().addAll((Collection<? extends Setting>)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__PORT:
				setPort((String)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__POOL:
				setPool((String)newValue);
				return;
			case GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS:
				setLastAddress((XCPAddress)newValue);
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
			case GenericpoolsPackage.POOL_CONFIG__ENGINES:
				getEngines().clear();
				return;
			case GenericpoolsPackage.POOL_CONFIG__DEFAULT:
				setDefault((CmdPipe)null);
				return;
			case GenericpoolsPackage.POOL_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GenericpoolsPackage.POOL_CONFIG__USER:
				setUser(USER_EDEFAULT);
				return;
			case GenericpoolsPackage.POOL_CONFIG__PWD:
				setPwd(PWD_EDEFAULT);
				return;
			case GenericpoolsPackage.POOL_CONFIG__WORKER:
				setWorker(WORKER_EDEFAULT);
				return;
			case GenericpoolsPackage.POOL_CONFIG__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GenericpoolsPackage.POOL_CONFIG__SETTINGS:
				getSettings().clear();
				return;
			case GenericpoolsPackage.POOL_CONFIG__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case GenericpoolsPackage.POOL_CONFIG__POOL:
				setPool(POOL_EDEFAULT);
				return;
			case GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS:
				setLastAddress((XCPAddress)null);
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
			case GenericpoolsPackage.POOL_CONFIG__ENGINES:
				return engines != null && !engines.isEmpty();
			case GenericpoolsPackage.POOL_CONFIG__DEFAULT:
				return default_ != null;
			case GenericpoolsPackage.POOL_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GenericpoolsPackage.POOL_CONFIG__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case GenericpoolsPackage.POOL_CONFIG__PWD:
				return PWD_EDEFAULT == null ? pwd != null : !PWD_EDEFAULT.equals(pwd);
			case GenericpoolsPackage.POOL_CONFIG__WORKER:
				return WORKER_EDEFAULT == null ? worker != null : !WORKER_EDEFAULT.equals(worker);
			case GenericpoolsPackage.POOL_CONFIG__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case GenericpoolsPackage.POOL_CONFIG__SETTINGS:
				return settings != null && !settings.isEmpty();
			case GenericpoolsPackage.POOL_CONFIG__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case GenericpoolsPackage.POOL_CONFIG__POOL:
				return POOL_EDEFAULT == null ? pool != null : !POOL_EDEFAULT.equals(pool);
			case GenericpoolsPackage.POOL_CONFIG__LAST_ADDRESS:
				return lastAddress != null;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", user: ");
		result.append(user);
		result.append(", pwd: ");
		result.append(pwd);
		result.append(", worker: ");
		result.append(worker);
		result.append(", key: ");
		result.append(key);
		result.append(", port: ");
		result.append(port);
		result.append(", pool: ");
		result.append(pool);
		result.append(')');
		return result.toString();
	}

} //PoolConfigImpl
