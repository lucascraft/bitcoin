/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserData#getActiveWorkers <em>Active Workers</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserData#getHashRate <em>Hash Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserData#getNow <em>Now</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserData#getRoundStarts <em>Round Starts</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserData#getShift <em>Shift</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserData#getBalances <em>Balances</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserData#getWorkers <em>Workers</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.UserData#getUserHashRates <em>User Hash Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData()
 * @model
 * @generated
 */
public interface UserData extends EObject {
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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData_ActiveWorkers()
	 * @model
	 * @generated
	 */
	int getActiveWorkers();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.UserData#getActiveWorkers <em>Active Workers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Workers</em>' attribute.
	 * @see #getActiveWorkers()
	 * @generated
	 */
	void setActiveWorkers(int value);

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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData_HashRate()
	 * @model
	 * @generated
	 */
	float getHashRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.UserData#getHashRate <em>Hash Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Rate</em>' attribute.
	 * @see #getHashRate()
	 * @generated
	 */
	void setHashRate(float value);

	/**
	 * Returns the value of the '<em><b>Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Now</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Now</em>' attribute.
	 * @see #setNow(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData_Now()
	 * @model
	 * @generated
	 */
	long getNow();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.UserData#getNow <em>Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Now</em>' attribute.
	 * @see #getNow()
	 * @generated
	 */
	void setNow(long value);

	/**
	 * Returns the value of the '<em><b>Round Starts</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.RoundStart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Starts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Starts</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData_RoundStarts()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoundStart> getRoundStarts();

	/**
	 * Returns the value of the '<em><b>Shift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' containment reference.
	 * @see #setShift(Shift)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData_Shift()
	 * @model containment="true"
	 * @generated
	 */
	Shift getShift();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.UserData#getShift <em>Shift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' containment reference.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(Shift value);

	/**
	 * Returns the value of the '<em><b>Balances</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.Balance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balances</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData_Balances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Balance> getBalances();

	/**
	 * Returns the value of the '<em><b>Workers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.Worker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData_Workers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Worker> getWorkers();

	/**
	 * Returns the value of the '<em><b>User Hash Rates</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.UserHashRate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Hash Rates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Hash Rates</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getUserData_UserHashRates()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserHashRate> getUserHashRates();

} // UserData
