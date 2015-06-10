/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiimote Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiimoteDevice#getInfoReport <em>Info Report</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiimoteDevice#getCalibratonDataReport <em>Calibraton Data Report</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiimoteDevice#getBtaddress <em>Btaddress</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiimoteDevice()
 * @model
 * @generated
 */
public interface WiimoteDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Info Report</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Report</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Report</em>' reference.
	 * @see #setInfoReport(WiiStatusInfoReport)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiimoteDevice_InfoReport()
	 * @model
	 * @generated
	 */
	WiiStatusInfoReport getInfoReport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiimoteDevice#getInfoReport <em>Info Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Report</em>' reference.
	 * @see #getInfoReport()
	 * @generated
	 */
	void setInfoReport(WiiStatusInfoReport value);

	/**
	 * Returns the value of the '<em><b>Calibraton Data Report</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibraton Data Report</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibraton Data Report</em>' reference.
	 * @see #setCalibratonDataReport(WiiCalibrationDataReport)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiimoteDevice_CalibratonDataReport()
	 * @model
	 * @generated
	 */
	WiiCalibrationDataReport getCalibratonDataReport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiimoteDevice#getCalibratonDataReport <em>Calibraton Data Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibraton Data Report</em>' reference.
	 * @see #getCalibratonDataReport()
	 * @generated
	 */
	void setCalibratonDataReport(WiiCalibrationDataReport value);

	/**
	 * Returns the value of the '<em><b>Btaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btaddress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btaddress</em>' attribute.
	 * @see #setBtaddress(String)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiimoteDevice_Btaddress()
	 * @model
	 * @generated
	 */
	String getBtaddress();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiimoteDevice#getBtaddress <em>Btaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btaddress</em>' attribute.
	 * @see #getBtaddress()
	 * @generated
	 */
	void setBtaddress(String value);

} // WiimoteDevice
