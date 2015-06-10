/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Chain#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Chain#getRejected <em>Rejected</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Chain#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Chain#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Chain#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getChain()
 * @model
 * @generated
 */
public interface Chain extends EObject {
	/**
	 * Returns the value of the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted</em>' attribute.
	 * @see #setAccepted(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getChain_Accepted()
	 * @model
	 * @generated
	 */
	long getAccepted();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Chain#getAccepted <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted</em>' attribute.
	 * @see #getAccepted()
	 * @generated
	 */
	void setAccepted(long value);

	/**
	 * Returns the value of the '<em><b>Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejected</em>' attribute.
	 * @see #setRejected(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getChain_Rejected()
	 * @model
	 * @generated
	 */
	long getRejected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Chain#getRejected <em>Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected</em>' attribute.
	 * @see #getRejected()
	 * @generated
	 */
	void setRejected(long value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getChain_Duration()
	 * @model
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Chain#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(float)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getChain_Difficulty()
	 * @model
	 * @generated
	 */
	float getDifficulty();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Chain#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(float value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getChain_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Chain#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Chain
