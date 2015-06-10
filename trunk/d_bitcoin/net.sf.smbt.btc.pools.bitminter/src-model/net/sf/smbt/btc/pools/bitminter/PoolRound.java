/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool Round</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getChains <em>Chains</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getHashRate <em>Hash Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getActiveWorkers <em>Active Workers</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getActiveUsers <em>Active Users</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftAccepted <em>Shift Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftRejected <em>Shift Rejected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftDuration <em>Shift Duration</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftScore <em>Shift Score</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getRoundHashRates <em>Round Hash Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound()
 * @model
 * @generated
 */
public interface PoolRound extends EObject {
	/**
	 * Returns the value of the '<em><b>Chains</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.Chain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chains</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_Chains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chain> getChains();

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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_HashRate()
	 * @model
	 * @generated
	 */
	float getHashRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getHashRate <em>Hash Rate</em>}' attribute.
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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_ActiveWorkers()
	 * @model
	 * @generated
	 */
	int getActiveWorkers();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getActiveWorkers <em>Active Workers</em>}' attribute.
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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_ActiveUsers()
	 * @model
	 * @generated
	 */
	int getActiveUsers();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getActiveUsers <em>Active Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Users</em>' attribute.
	 * @see #getActiveUsers()
	 * @generated
	 */
	void setActiveUsers(int value);

	/**
	 * Returns the value of the '<em><b>Shift Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Accepted</em>' attribute.
	 * @see #setShiftAccepted(int)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_ShiftAccepted()
	 * @model
	 * @generated
	 */
	int getShiftAccepted();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftAccepted <em>Shift Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Accepted</em>' attribute.
	 * @see #getShiftAccepted()
	 * @generated
	 */
	void setShiftAccepted(int value);

	/**
	 * Returns the value of the '<em><b>Shift Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Rejected</em>' attribute.
	 * @see #setShiftRejected(int)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_ShiftRejected()
	 * @model
	 * @generated
	 */
	int getShiftRejected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftRejected <em>Shift Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Rejected</em>' attribute.
	 * @see #getShiftRejected()
	 * @generated
	 */
	void setShiftRejected(int value);

	/**
	 * Returns the value of the '<em><b>Shift Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Duration</em>' attribute.
	 * @see #setShiftDuration(int)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_ShiftDuration()
	 * @model
	 * @generated
	 */
	int getShiftDuration();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftDuration <em>Shift Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Duration</em>' attribute.
	 * @see #getShiftDuration()
	 * @generated
	 */
	void setShiftDuration(int value);

	/**
	 * Returns the value of the '<em><b>Shift Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Score</em>' attribute.
	 * @see #setShiftScore(float)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_ShiftScore()
	 * @model
	 * @generated
	 */
	float getShiftScore();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.PoolRound#getShiftScore <em>Shift Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift Score</em>' attribute.
	 * @see #getShiftScore()
	 * @generated
	 */
	void setShiftScore(float value);

	/**
	 * Returns the value of the '<em><b>Round Hash Rates</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.RoundHashRate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Hash Rates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Hash Rates</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getPoolRound_RoundHashRates()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoundHashRate> getRoundHashRates();

} // PoolRound
