/**
 */
package net.sf.smbt.bitforcev2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZJX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.ZJX#getFirmwareVersion <em>Firmware Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZJX()
 * @model
 * @generated
 */
public interface ZJX extends BFLCmd {

	/**
	 * Returns the value of the '<em><b>Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmware Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware Version</em>' attribute.
	 * @see #setFirmwareVersion(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZJX_FirmwareVersion()
	 * @model
	 * @generated
	 */
	String getFirmwareVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZJX#getFirmwareVersion <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware Version</em>' attribute.
	 * @see #getFirmwareVersion()
	 * @generated
	 */
	void setFirmwareVersion(String value);
} // ZJX
