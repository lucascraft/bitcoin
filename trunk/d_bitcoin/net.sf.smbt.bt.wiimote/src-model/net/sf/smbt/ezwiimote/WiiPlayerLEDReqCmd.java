/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Player LED Req Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd#getLedByte <em>Led Byte</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiPlayerLEDReqCmd()
 * @model
 * @generated
 */
public interface WiiPlayerLEDReqCmd extends WiiMoteReqCmd {

	/**
	 * Returns the value of the '<em><b>Led Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Led Byte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Led Byte</em>' attribute.
	 * @see #setLedByte(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiPlayerLEDReqCmd_LedByte()
	 * @model
	 * @generated
	 */
	byte getLedByte();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiPlayerLEDReqCmd#getLedByte <em>Led Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Led Byte</em>' attribute.
	 * @see #getLedByte()
	 * @generated
	 */
	void setLedByte(byte value);
} // WiiPlayerLEDReqCmd
