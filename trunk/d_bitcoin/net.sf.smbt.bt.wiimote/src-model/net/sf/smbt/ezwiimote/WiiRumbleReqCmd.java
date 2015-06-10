/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Rumble Req Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiRumbleReqCmd#getLedByte <em>Led Byte</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiRumbleReqCmd#getMillis <em>Millis</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiRumbleReqCmd()
 * @model
 * @generated
 */
public interface WiiRumbleReqCmd extends WiiMoteReqCmd {

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
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiRumbleReqCmd_LedByte()
	 * @model
	 * @generated
	 */
	byte getLedByte();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiRumbleReqCmd#getLedByte <em>Led Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Led Byte</em>' attribute.
	 * @see #getLedByte()
	 * @generated
	 */
	void setLedByte(byte value);

	/**
	 * Returns the value of the '<em><b>Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Millis</em>' attribute.
	 * @see #setMillis(long)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiRumbleReqCmd_Millis()
	 * @model
	 * @generated
	 */
	long getMillis();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiRumbleReqCmd#getMillis <em>Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Millis</em>' attribute.
	 * @see #getMillis()
	 * @generated
	 */
	void setMillis(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] getStopRumbleBytes(byte ledByte);
} // WiiRumbleReqCmd
