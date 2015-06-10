/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Nunchuk Button Evt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getC_BUTTON <em>CBUTTON</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getZ_BUTTON <em>ZBUTTON</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getNO_BUTTON <em>NO BUTTON</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiNunchukButtonEvt()
 * @model
 * @generated
 */
public interface WiiNunchukButtonEvt extends WiiEvt {
	/**
	 * Returns the value of the '<em><b>CBUTTON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CBUTTON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CBUTTON</em>' attribute.
	 * @see #setC_BUTTON(int)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiNunchukButtonEvt_C_BUTTON()
	 * @model
	 * @generated
	 */
	int getC_BUTTON();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getC_BUTTON <em>CBUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CBUTTON</em>' attribute.
	 * @see #getC_BUTTON()
	 * @generated
	 */
	void setC_BUTTON(int value);

	/**
	 * Returns the value of the '<em><b>ZBUTTON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZBUTTON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZBUTTON</em>' attribute.
	 * @see #setZ_BUTTON(int)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiNunchukButtonEvt_Z_BUTTON()
	 * @model
	 * @generated
	 */
	int getZ_BUTTON();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getZ_BUTTON <em>ZBUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBUTTON</em>' attribute.
	 * @see #getZ_BUTTON()
	 * @generated
	 */
	void setZ_BUTTON(int value);

	/**
	 * Returns the value of the '<em><b>NO BUTTON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NO BUTTON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NO BUTTON</em>' attribute.
	 * @see #setNO_BUTTON(int)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiNunchukButtonEvt_NO_BUTTON()
	 * @model
	 * @generated
	 */
	int getNO_BUTTON();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiNunchukButtonEvt#getNO_BUTTON <em>NO BUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NO BUTTON</em>' attribute.
	 * @see #getNO_BUTTON()
	 * @generated
	 */
	void setNO_BUTTON(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isZButtonPressed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isCButtonPressed();

} // WiiNunchukButtonEvt
