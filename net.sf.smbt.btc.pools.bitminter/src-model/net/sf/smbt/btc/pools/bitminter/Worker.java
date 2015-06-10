/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Worker#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Worker#getLastWork <em>Last Work</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Worker#getHashRate <em>Hash Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Worker#getAlive <em>Alive</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Worker#getWorks <em>Works</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Worker#getHashRates <em>Hash Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWorker()
 * @model
 * @generated
 */
public interface Worker extends EObject {
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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWorker_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Worker#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Last Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Work</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Work</em>' attribute.
	 * @see #setLastWork(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWorker_LastWork()
	 * @model
	 * @generated
	 */
	long getLastWork();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Worker#getLastWork <em>Last Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Work</em>' attribute.
	 * @see #getLastWork()
	 * @generated
	 */
	void setLastWork(long value);

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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWorker_HashRate()
	 * @model
	 * @generated
	 */
	float getHashRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Worker#getHashRate <em>Hash Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Rate</em>' attribute.
	 * @see #getHashRate()
	 * @generated
	 */
	void setHashRate(float value);

	/**
	 * Returns the value of the '<em><b>Alive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alive</em>' attribute.
	 * @see #setAlive(int)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWorker_Alive()
	 * @model
	 * @generated
	 */
	int getAlive();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Worker#getAlive <em>Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alive</em>' attribute.
	 * @see #getAlive()
	 * @generated
	 */
	void setAlive(int value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.Work}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWorker_Works()
	 * @model containment="true"
	 * @generated
	 */
	EList<Work> getWorks();

	/**
	 * Returns the value of the '<em><b>Hash Rates</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.pools.bitminter.DatedHashRate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Rates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Rates</em>' containment reference list.
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getWorker_HashRates()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatedHashRate> getHashRates();

} // Worker
