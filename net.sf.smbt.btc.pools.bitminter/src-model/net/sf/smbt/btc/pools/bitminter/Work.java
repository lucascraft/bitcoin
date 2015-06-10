/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Work#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Work#getTotalAccepted <em>Total Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Work#getTotalRejected <em>Total Rejected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Work#getRoundAccepted <em>Round Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Work#getRoundRejected <em>Round Rejected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Work#getCheckPointAccepted <em>Check Point Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Work#getCheckPointRejected <em>Check Point Rejected</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWork()
 * @model
 * @generated
 */
public interface Work extends EObject {
	/**
	 * Returns the value of the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain ID</em>' attribute.
	 * @see #setChainID(String)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWork_ChainID()
	 * @model
	 * @generated
	 */
	String getChainID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Work#getChainID <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain ID</em>' attribute.
	 * @see #getChainID()
	 * @generated
	 */
	void setChainID(String value);

	/**
	 * Returns the value of the '<em><b>Total Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Accepted</em>' attribute.
	 * @see #setTotalAccepted(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWork_TotalAccepted()
	 * @model
	 * @generated
	 */
	long getTotalAccepted();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Work#getTotalAccepted <em>Total Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Accepted</em>' attribute.
	 * @see #getTotalAccepted()
	 * @generated
	 */
	void setTotalAccepted(long value);

	/**
	 * Returns the value of the '<em><b>Total Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Rejected</em>' attribute.
	 * @see #setTotalRejected(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWork_TotalRejected()
	 * @model
	 * @generated
	 */
	long getTotalRejected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Work#getTotalRejected <em>Total Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Rejected</em>' attribute.
	 * @see #getTotalRejected()
	 * @generated
	 */
	void setTotalRejected(long value);

	/**
	 * Returns the value of the '<em><b>Round Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Accepted</em>' attribute.
	 * @see #setRoundAccepted(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWork_RoundAccepted()
	 * @model
	 * @generated
	 */
	long getRoundAccepted();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Work#getRoundAccepted <em>Round Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Accepted</em>' attribute.
	 * @see #getRoundAccepted()
	 * @generated
	 */
	void setRoundAccepted(long value);

	/**
	 * Returns the value of the '<em><b>Round Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Round Rejected</em>' attribute.
	 * @see #setRoundRejected(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWork_RoundRejected()
	 * @model
	 * @generated
	 */
	long getRoundRejected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Work#getRoundRejected <em>Round Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Round Rejected</em>' attribute.
	 * @see #getRoundRejected()
	 * @generated
	 */
	void setRoundRejected(long value);

	/**
	 * Returns the value of the '<em><b>Check Point Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Point Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Point Accepted</em>' attribute.
	 * @see #setCheckPointAccepted(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWork_CheckPointAccepted()
	 * @model
	 * @generated
	 */
	long getCheckPointAccepted();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Work#getCheckPointAccepted <em>Check Point Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Point Accepted</em>' attribute.
	 * @see #getCheckPointAccepted()
	 * @generated
	 */
	void setCheckPointAccepted(long value);

	/**
	 * Returns the value of the '<em><b>Check Point Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Point Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Point Rejected</em>' attribute.
	 * @see #setCheckPointRejected(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWork_CheckPointRejected()
	 * @model
	 * @generated
	 */
	long getCheckPointRejected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Work#getCheckPointRejected <em>Check Point Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Point Rejected</em>' attribute.
	 * @see #getCheckPointRejected()
	 * @generated
	 */
	void setCheckPointRejected(long value);

} // Work
