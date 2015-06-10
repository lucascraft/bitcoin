/**
 */
package net.sf.smbt.btc.pools.bitminter;

import net.sf.smbt.btc.genericpools.PoolConfig;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Minter Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getStats <em>Stats</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getRound <em>Round</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBitMinterConfig()
 * @model
 * @generated
 */
public interface BitMinterConfig extends PoolConfig {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBitMinterConfig_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference.
	 * @see #setStats(PoolStats)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBitMinterConfig_Stats()
	 * @model containment="true"
	 * @generated
	 */
	PoolStats getStats();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getStats <em>Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stats</em>' containment reference.
	 * @see #getStats()
	 * @generated
	 */
	void setStats(PoolStats value);

	/**
	 * Returns the value of the '<em><b>Round</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round</em>' containment reference.
	 * @see #setRound(PoolRound)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBitMinterConfig_Round()
	 * @model containment="true"
	 * @generated
	 */
	PoolRound getRound();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getRound <em>Round</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round</em>' containment reference.
	 * @see #getRound()
	 * @generated
	 */
	void setRound(PoolRound value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(UserData)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBitMinterConfig_Data()
	 * @model containment="true"
	 * @generated
	 */
	UserData getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(UserData value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(Object)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getBitMinterConfig_Selection()
	 * @model
	 * @generated
	 */
	Object getSelection();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.BitMinterConfig#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Object value);

} // BitMinterConfig
