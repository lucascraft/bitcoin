/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Shift#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Shift#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Shift#getUser_score <em>User score</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.Shift#getTotal_score <em>Total score</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getShift()
 * @model
 * @generated
 */
public interface Shift extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(long)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getShift_Start()
	 * @model
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Shift#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Returns the value of the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted</em>' attribute.
	 * @see #setAccepted(int)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getShift_Accepted()
	 * @model
	 * @generated
	 */
	int getAccepted();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Shift#getAccepted <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted</em>' attribute.
	 * @see #getAccepted()
	 * @generated
	 */
	void setAccepted(int value);

	/**
	 * Returns the value of the '<em><b>User score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User score</em>' attribute.
	 * @see #setUser_score(float)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getShift_User_score()
	 * @model
	 * @generated
	 */
	float getUser_score();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Shift#getUser_score <em>User score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User score</em>' attribute.
	 * @see #getUser_score()
	 * @generated
	 */
	void setUser_score(float value);

	/**
	 * Returns the value of the '<em><b>Total score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total score</em>' attribute.
	 * @see #setTotal_score(float)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getShift_Total_score()
	 * @model
	 * @generated
	 */
	float getTotal_score();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.Shift#getTotal_score <em>Total score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total score</em>' attribute.
	 * @see #getTotal_score()
	 * @generated
	 */
	void setTotal_score(float value);

} // Shift
