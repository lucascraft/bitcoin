/**
 */
package net.sf.smbt.trading;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.Robot#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Robot#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Robot#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see net.sf.smbt.trading.TradingPackage#getRobot_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Robot#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.trading.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see net.sf.smbt.trading.TradingPackage#getRobot_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.trading.TradingPackage#getRobot_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Robot#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Robot
