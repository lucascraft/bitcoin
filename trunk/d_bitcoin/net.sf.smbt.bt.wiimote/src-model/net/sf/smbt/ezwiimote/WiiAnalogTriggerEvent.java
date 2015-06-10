/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Analog Trigger Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiAnalogTriggerEvent()
 * @model
 * @generated
 */
public interface WiiAnalogTriggerEvent extends WiiExtEvt {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(int)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiAnalogTriggerEvent_Trigger()
	 * @model
	 * @generated
	 */
	int getTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiAnalogTriggerEvent#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(int value);

} // WiiAnalogTriggerEvent
