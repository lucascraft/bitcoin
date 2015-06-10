/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Data Evt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiDataEvt#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiDataEvt#getPayload <em>Payload</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiDataEvt#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiDataEvt()
 * @model
 * @generated
 */
public interface WiiDataEvt extends WiiEvt {

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(byte[])
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiDataEvt_Address()
	 * @model
	 * @generated
	 */
	byte[] getAddress();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiDataEvt#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(byte[] value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' attribute.
	 * @see #setPayload(byte[])
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiDataEvt_Payload()
	 * @model
	 * @generated
	 */
	byte[] getPayload();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiDataEvt#getPayload <em>Payload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' attribute.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(byte[] value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(int)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiDataEvt_Error()
	 * @model
	 * @generated
	 */
	int getError();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiDataEvt#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(int value);
} // WiiDataEvt
