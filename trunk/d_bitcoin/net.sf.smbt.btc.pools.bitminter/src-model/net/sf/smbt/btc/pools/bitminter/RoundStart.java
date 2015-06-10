/**
 */
package net.sf.smbt.btc.pools.bitminter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.RoundStart#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.RoundStart#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getRoundStart()
 * @model
 * @generated
 */
public interface RoundStart extends EObject {
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
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getRoundStart_ChainID()
	 * @model
	 * @generated
	 */
	String getChainID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.RoundStart#getChainID <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain ID</em>' attribute.
	 * @see #getChainID()
	 * @generated
	 */
	void setChainID(String value);

	/**
	 * Returns the value of the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' attribute.
	 * @see #setShift(int)
	 * @see net.sf.smbt.btc.pools.bitminter.BitminterPackage#getRoundStart_Shift()
	 * @model
	 * @generated
	 */
	int getShift();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.pools.bitminter.RoundStart#getShift <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' attribute.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(int value);

} // RoundStart
