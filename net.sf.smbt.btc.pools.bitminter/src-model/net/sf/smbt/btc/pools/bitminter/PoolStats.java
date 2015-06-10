/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getHashRate <em>Hash Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getActiveWorkers <em>Active Workers</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getActiveUsers <em>Active Users</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getDatedRates <em>Dated Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolStats()
 * @model
 * @generated
 */
public interface PoolStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Hash Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Rate</em>' attribute.
	 * @see #setHashRate(float)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolStats_HashRate()
	 * @model
	 * @generated
	 */
	float getHashRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getHashRate <em>Hash Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Rate</em>' attribute.
	 * @see #getHashRate()
	 * @generated
	 */
	void setHashRate(float value);

	/**
	 * Returns the value of the '<em><b>Active Workers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Workers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Workers</em>' attribute.
	 * @see #setActiveWorkers(int)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolStats_ActiveWorkers()
	 * @model
	 * @generated
	 */
	int getActiveWorkers();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getActiveWorkers <em>Active Workers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Workers</em>' attribute.
	 * @see #getActiveWorkers()
	 * @generated
	 */
	void setActiveWorkers(int value);

	/**
	 * Returns the value of the '<em><b>Active Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Users</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Users</em>' attribute.
	 * @see #setActiveUsers(int)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolStats_ActiveUsers()
	 * @model
	 * @generated
	 */
	int getActiveUsers();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolStats#getActiveUsers <em>Active Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Users</em>' attribute.
	 * @see #getActiveUsers()
	 * @generated
	 */
	void setActiveUsers(int value);

	/**
	 * Returns the value of the '<em><b>Dated Rates</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.DatedRate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dated Rates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dated Rates</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolStats_DatedRates()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatedRate> getDatedRates();

} // PoolStats
