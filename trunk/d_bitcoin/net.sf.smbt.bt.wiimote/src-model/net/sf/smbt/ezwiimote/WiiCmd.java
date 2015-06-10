/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiCmd#getTag <em>Tag</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiCmd#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiCmd()
 * @model
 * @generated
 */
public interface WiiCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiCmd_Tag()
	 * @model
	 * @generated
	 */
	byte getTag();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiCmd#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(byte value);

	/**
	 * Returns the value of the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bytes</em>' attribute.
	 * @see #setBytes(byte[])
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiCmd_Bytes()
	 * @model
	 * @generated
	 */
	byte[] getBytes();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiCmd#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes</em>' attribute.
	 * @see #getBytes()
	 * @generated
	 */
	void setBytes(byte[] value);

} // WiiCmd
