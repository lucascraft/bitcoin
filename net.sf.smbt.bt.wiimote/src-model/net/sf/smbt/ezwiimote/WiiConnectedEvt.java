/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Connected Evt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiConnectedEvt#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiConnectedEvt()
 * @model
 * @generated
 */
public interface WiiConnectedEvt extends WiiEvt {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(Object)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiConnectedEvt_Extension()
	 * @model dataType="net.sf.smbt.ezwiimote.WiiExtension"
	 * @generated
	 */
	Object getExtension();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiConnectedEvt#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Object value);

} // WiiConnectedEvt
