/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Report Mode Req Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x20 <em>DATA REPORT 0x20</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x21 <em>DATA REPORT 0x21</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x30 <em>DATA REPORT 0x30</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x31 <em>DATA REPORT 0x31</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x32 <em>DATA REPORT 0x32</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x33 <em>DATA REPORT 0x33</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x34 <em>DATA REPORT 0x34</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x35 <em>DATA REPORT 0x35</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x36 <em>DATA REPORT 0x36</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x37 <em>DATA REPORT 0x37</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3d <em>DATA REPORT 0x3d</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3e <em>DATA REPORT 0x3e</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3f <em>DATA REPORT 0x3f</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#isContinuous <em>Continuous</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd()
 * @model
 * @generated
 */
public interface WiiReportModeReqCmd extends WiiMoteReqCmd {

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x20</b></em>' attribute.
	 * The default value is <code>"\'0x20\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x20</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x20</em>' attribute.
	 * @see #setDATA_REPORT_0x20(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x20()
	 * @model default="\'0x20\'"
	 * @generated
	 */
	byte getDATA_REPORT_0x20();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x20 <em>DATA REPORT 0x20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x20</em>' attribute.
	 * @see #getDATA_REPORT_0x20()
	 * @generated
	 */
	void setDATA_REPORT_0x20(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x21</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x21</em>' attribute.
	 * @see #setDATA_REPORT_0x21(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x21()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x21();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x21 <em>DATA REPORT 0x21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x21</em>' attribute.
	 * @see #getDATA_REPORT_0x21()
	 * @generated
	 */
	void setDATA_REPORT_0x21(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x30</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x30</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x30</em>' attribute.
	 * @see #setDATA_REPORT_0x30(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x30()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x30();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x30 <em>DATA REPORT 0x30</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x30</em>' attribute.
	 * @see #getDATA_REPORT_0x30()
	 * @generated
	 */
	void setDATA_REPORT_0x30(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x31</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x31</em>' attribute.
	 * @see #setDATA_REPORT_0x31(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x31()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x31();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x31 <em>DATA REPORT 0x31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x31</em>' attribute.
	 * @see #getDATA_REPORT_0x31()
	 * @generated
	 */
	void setDATA_REPORT_0x31(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x32</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x32</em>' attribute.
	 * @see #setDATA_REPORT_0x32(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x32()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x32();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x32 <em>DATA REPORT 0x32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x32</em>' attribute.
	 * @see #getDATA_REPORT_0x32()
	 * @generated
	 */
	void setDATA_REPORT_0x32(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x33</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x33</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x33</em>' attribute.
	 * @see #setDATA_REPORT_0x33(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x33()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x33();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x33 <em>DATA REPORT 0x33</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x33</em>' attribute.
	 * @see #getDATA_REPORT_0x33()
	 * @generated
	 */
	void setDATA_REPORT_0x33(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x34</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x34</em>' attribute.
	 * @see #setDATA_REPORT_0x34(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x34()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x34();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x34 <em>DATA REPORT 0x34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x34</em>' attribute.
	 * @see #getDATA_REPORT_0x34()
	 * @generated
	 */
	void setDATA_REPORT_0x34(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x35</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x35</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x35</em>' attribute.
	 * @see #setDATA_REPORT_0x35(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x35()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x35();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x35 <em>DATA REPORT 0x35</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x35</em>' attribute.
	 * @see #getDATA_REPORT_0x35()
	 * @generated
	 */
	void setDATA_REPORT_0x35(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x36</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x36</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x36</em>' attribute.
	 * @see #setDATA_REPORT_0x36(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x36()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x36();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x36 <em>DATA REPORT 0x36</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x36</em>' attribute.
	 * @see #getDATA_REPORT_0x36()
	 * @generated
	 */
	void setDATA_REPORT_0x36(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x37</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x37</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x37</em>' attribute.
	 * @see #setDATA_REPORT_0x37(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x37()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x37();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x37 <em>DATA REPORT 0x37</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x37</em>' attribute.
	 * @see #getDATA_REPORT_0x37()
	 * @generated
	 */
	void setDATA_REPORT_0x37(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x3d</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x3d</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x3d</em>' attribute.
	 * @see #setDATA_REPORT_0x3d(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x3d()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x3d();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3d <em>DATA REPORT 0x3d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x3d</em>' attribute.
	 * @see #getDATA_REPORT_0x3d()
	 * @generated
	 */
	void setDATA_REPORT_0x3d(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x3e</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x3e</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x3e</em>' attribute.
	 * @see #setDATA_REPORT_0x3e(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x3e()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x3e();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3e <em>DATA REPORT 0x3e</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x3e</em>' attribute.
	 * @see #getDATA_REPORT_0x3e()
	 * @generated
	 */
	void setDATA_REPORT_0x3e(byte value);

	/**
	 * Returns the value of the '<em><b>DATA REPORT 0x3f</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATA REPORT 0x3f</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATA REPORT 0x3f</em>' attribute.
	 * @see #setDATA_REPORT_0x3f(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_DATA_REPORT_0x3f()
	 * @model default=""
	 * @generated
	 */
	byte getDATA_REPORT_0x3f();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getDATA_REPORT_0x3f <em>DATA REPORT 0x3f</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATA REPORT 0x3f</em>' attribute.
	 * @see #getDATA_REPORT_0x3f()
	 * @generated
	 */
	void setDATA_REPORT_0x3f(byte value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(byte)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_Mode()
	 * @model
	 * @generated
	 */
	byte getMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(byte value);

	/**
	 * Returns the value of the '<em><b>Continuous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuous</em>' attribute.
	 * @see #setContinuous(boolean)
	 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getWiiReportModeReqCmd_Continuous()
	 * @model
	 * @generated
	 */
	boolean isContinuous();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezwiimote.WiiReportModeReqCmd#isContinuous <em>Continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuous</em>' attribute.
	 * @see #isContinuous()
	 * @generated
	 */
	void setContinuous(boolean value);
} // WiiReportModeReqCmd
