/**
 */
package net.sf.smbt.trading;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.VolumeRule#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.trading.VolumeRule#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getVolumeRule()
 * @model
 * @generated
 */
public interface VolumeRule extends TradingRule {

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(float)
	 * @see net.sf.smbt.trading.TradingPackage#getVolumeRule_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.VolumeRule#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

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
	 * @see net.sf.smbt.trading.TradingPackage#getVolumeRule_Tolerance()
	 * @model
	 * @generated
	 */
	float getTolerance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.VolumeRule#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(float value);
} // VolumeRule
