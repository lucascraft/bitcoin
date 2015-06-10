/**
 */
package net.sf.smbt.trading;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.TimeRule#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.trading.TimeRule#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getTimeRule()
 * @model
 * @generated
 */
public interface TimeRule extends TradingRule {

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(long)
	 * @see net.sf.smbt.trading.TradingPackage#getTimeRule_Date()
	 * @model
	 * @generated
	 */
	long getDate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.TimeRule#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(long value);

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' attribute.
	 * @see #setTolerance(float)
	 * @see net.sf.smbt.trading.TradingPackage#getTimeRule_Tolerance()
	 * @model
	 * @generated
	 */
	float getTolerance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.TimeRule#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(float value);
} // TimeRule
