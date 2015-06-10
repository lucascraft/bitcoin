/**
 */
package net.sf.smbt.btc.genericpools;

import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getUrl <em>Url</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getUser <em>User</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getPwd <em>Pwd</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getWorker <em>Worker</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getSettings <em>Settings</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getPool <em>Pool</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.PoolConfig#getLastAddress <em>Last Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig()
 * @model
 * @generated
 */
public interface PoolConfig extends IConnectedUnit {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.PoolConfig#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.PoolConfig#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwd</em>' attribute.
	 * @see #setPwd(String)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_Pwd()
	 * @model
	 * @generated
	 */
	String getPwd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.PoolConfig#getPwd <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwd</em>' attribute.
	 * @see #getPwd()
	 * @generated
	 */
	void setPwd(String value);

	/**
	 * Returns the value of the '<em><b>Worker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker</em>' attribute.
	 * @see #setWorker(String)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_Worker()
	 * @model
	 * @generated
	 */
	String getWorker();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.PoolConfig#getWorker <em>Worker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker</em>' attribute.
	 * @see #getWorker()
	 * @generated
	 */
	void setWorker(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.PoolConfig#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.genericpools.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getSettings();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_Port()
	 * @model
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.PoolConfig#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' attribute.
	 * @see #setPool(String)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_Pool()
	 * @model
	 * @generated
	 */
	String getPool();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.PoolConfig#getPool <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool</em>' attribute.
	 * @see #getPool()
	 * @generated
	 */
	void setPool(String value);

	/**
	 * Returns the value of the '<em><b>Last Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Address</em>' containment reference.
	 * @see #setLastAddress(XCPAddress)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getPoolConfig_LastAddress()
	 * @model containment="true"
	 * @generated
	 */
	XCPAddress getLastAddress();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.PoolConfig#getLastAddress <em>Last Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Address</em>' containment reference.
	 * @see #getLastAddress()
	 * @generated
	 */
	void setLastAddress(XCPAddress value);

} // PoolConfig
