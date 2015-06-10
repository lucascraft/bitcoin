/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Status Info Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isExtensionControllerConnected <em>Extension Controller Connected</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isSpeakerEnabled <em>Speaker Enabled</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isContinuousReportingEnabled <em>Continuous Reporting Enabled</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#getLedEnabled <em>Led Enabled</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#getBatteryLevel <em>Battery Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiStatusInfoReport()
 * @model
 * @generated
 */
public interface WiiStatusInfoReport extends WiiCmd {
	/**
	 * Returns the value of the '<em><b>Extension Controller Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Controller Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Controller Connected</em>' attribute.
	 * @see #setExtensionControllerConnected(boolean)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiStatusInfoReport_ExtensionControllerConnected()
	 * @model
	 * @generated
	 */
	boolean isExtensionControllerConnected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isExtensionControllerConnected <em>Extension Controller Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Controller Connected</em>' attribute.
	 * @see #isExtensionControllerConnected()
	 * @generated
	 */
	void setExtensionControllerConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Speaker Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speaker Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker Enabled</em>' attribute.
	 * @see #setSpeakerEnabled(boolean)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiStatusInfoReport_SpeakerEnabled()
	 * @model
	 * @generated
	 */
	boolean isSpeakerEnabled();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isSpeakerEnabled <em>Speaker Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker Enabled</em>' attribute.
	 * @see #isSpeakerEnabled()
	 * @generated
	 */
	void setSpeakerEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Continuous Reporting Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuous Reporting Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuous Reporting Enabled</em>' attribute.
	 * @see #setContinuousReportingEnabled(boolean)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiStatusInfoReport_ContinuousReportingEnabled()
	 * @model
	 * @generated
	 */
	boolean isContinuousReportingEnabled();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#isContinuousReportingEnabled <em>Continuous Reporting Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuous Reporting Enabled</em>' attribute.
	 * @see #isContinuousReportingEnabled()
	 * @generated
	 */
	void setContinuousReportingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Led Enabled</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Led Enabled</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Led Enabled</em>' attribute list.
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiStatusInfoReport_LedEnabled()
	 * @model
	 * @generated
	 */
	EList<Boolean> getLedEnabled();

	/**
	 * Returns the value of the '<em><b>Battery Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery Level</em>' attribute.
	 * @see #setBatteryLevel(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiStatusInfoReport_BatteryLevel()
	 * @model
	 * @generated
	 */
	byte getBatteryLevel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiStatusInfoReport#getBatteryLevel <em>Battery Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Level</em>' attribute.
	 * @see #getBatteryLevel()
	 * @generated
	 */
	void setBatteryLevel(byte value);

} // WiiStatusInfoReport
