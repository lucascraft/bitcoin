/**
 */
package net.sf.smbt.bitforcev2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZCX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getDevice <em>Device</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getFirmware <em>Firmware</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getJobsQueue <em>Jobs Queue</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getResultsQueue <em>Results Queue</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getXlinkMode <em>Xlink Mode</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getXlinkStatus <em>Xlink Status</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getDevicesInChain <em>Devices In Chain</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZCX#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX()
 * @model
 * @generated
 */
public interface ZCX extends BFLCmd {

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_Device()
	 * @model
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

	/**
	 * Returns the value of the '<em><b>Firmware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmware</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware</em>' attribute.
	 * @see #setFirmware(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_Firmware()
	 * @model
	 * @generated
	 */
	String getFirmware();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getFirmware <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware</em>' attribute.
	 * @see #getFirmware()
	 * @generated
	 */
	void setFirmware(String value);

	/**
	 * Returns the value of the '<em><b>Engines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engines</em>' attribute.
	 * @see #setEngines(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_Engines()
	 * @model
	 * @generated
	 */
	String getEngines();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getEngines <em>Engines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engines</em>' attribute.
	 * @see #getEngines()
	 * @generated
	 */
	void setEngines(String value);

	/**
	 * Returns the value of the '<em><b>Jobs Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs Queue</em>' attribute.
	 * @see #setJobsQueue(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_JobsQueue()
	 * @model
	 * @generated
	 */
	String getJobsQueue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getJobsQueue <em>Jobs Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobs Queue</em>' attribute.
	 * @see #getJobsQueue()
	 * @generated
	 */
	void setJobsQueue(String value);

	/**
	 * Returns the value of the '<em><b>Results Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Queue</em>' attribute.
	 * @see #setResultsQueue(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_ResultsQueue()
	 * @model
	 * @generated
	 */
	String getResultsQueue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getResultsQueue <em>Results Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Queue</em>' attribute.
	 * @see #getResultsQueue()
	 * @generated
	 */
	void setResultsQueue(String value);

	/**
	 * Returns the value of the '<em><b>Xlink Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xlink Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xlink Mode</em>' attribute.
	 * @see #setXlinkMode(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_XlinkMode()
	 * @model
	 * @generated
	 */
	String getXlinkMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getXlinkMode <em>Xlink Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xlink Mode</em>' attribute.
	 * @see #getXlinkMode()
	 * @generated
	 */
	void setXlinkMode(String value);

	/**
	 * Returns the value of the '<em><b>Xlink Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xlink Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xlink Status</em>' attribute.
	 * @see #setXlinkStatus(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_XlinkStatus()
	 * @model
	 * @generated
	 */
	String getXlinkStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getXlinkStatus <em>Xlink Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xlink Status</em>' attribute.
	 * @see #getXlinkStatus()
	 * @generated
	 */
	void setXlinkStatus(String value);

	/**
	 * Returns the value of the '<em><b>Devices In Chain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices In Chain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices In Chain</em>' attribute.
	 * @see #setDevicesInChain(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_DevicesInChain()
	 * @model
	 * @generated
	 */
	String getDevicesInChain();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getDevicesInChain <em>Devices In Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devices In Chain</em>' attribute.
	 * @see #getDevicesInChain()
	 * @generated
	 */
	void setDevicesInChain(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZCX_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZCX#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);
} // ZCX
