/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Read Memory Req Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd#getOffset <em>Offset</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReadMemoryReqCmd()
 * @model
 * @generated
 */
public interface WiiReadMemoryReqCmd extends WiiMoteReqCmd {

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(byte[])
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReadMemoryReqCmd_Offset()
	 * @model
	 * @generated
	 */
	byte[] getOffset();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(byte[] value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(byte[])
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReadMemoryReqCmd_Size()
	 * @model
	 * @generated
	 */
	byte[] getSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReadMemoryReqCmd#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(byte[] value);
} // WiiReadMemoryReqCmd
