/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiReportModeReqCmd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Report Mode Req Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x20 <em>DATA REPORT 0x20</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x21 <em>DATA REPORT 0x21</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x30 <em>DATA REPORT 0x30</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x31 <em>DATA REPORT 0x31</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x32 <em>DATA REPORT 0x32</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x33 <em>DATA REPORT 0x33</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x34 <em>DATA REPORT 0x34</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x35 <em>DATA REPORT 0x35</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x36 <em>DATA REPORT 0x36</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x37 <em>DATA REPORT 0x37</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x3d <em>DATA REPORT 0x3d</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x3e <em>DATA REPORT 0x3e</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getDATA_REPORT_0x3f <em>DATA REPORT 0x3f</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiReportModeReqCmdImpl#isContinuous <em>Continuous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiReportModeReqCmdImpl extends WiiMoteReqCmdImpl implements WiiReportModeReqCmd {
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x20() <em>DATA REPORT 0x20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x20()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X20_EDEFAULT = Byte.decode("0x20"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x20() <em>DATA REPORT 0x20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x20()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x20 = DATA_REPORT_0X20_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x21() <em>DATA REPORT 0x21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x21()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X21_EDEFAULT = Byte.decode("0x21"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x21() <em>DATA REPORT 0x21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x21()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x21 = DATA_REPORT_0X21_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x30() <em>DATA REPORT 0x30</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x30()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X30_EDEFAULT = Byte.decode("0x30"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x30() <em>DATA REPORT 0x30</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x30()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x30 = DATA_REPORT_0X30_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x31() <em>DATA REPORT 0x31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x31()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X31_EDEFAULT = Byte.decode("0x31"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x31() <em>DATA REPORT 0x31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x31()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x31 = DATA_REPORT_0X31_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x32() <em>DATA REPORT 0x32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x32()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X32_EDEFAULT = Byte.decode("0x32"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x32() <em>DATA REPORT 0x32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x32()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x32 = DATA_REPORT_0X32_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x33() <em>DATA REPORT 0x33</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x33()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X33_EDEFAULT = Byte.decode("0x33"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x33() <em>DATA REPORT 0x33</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x33()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x33 = DATA_REPORT_0X33_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x34() <em>DATA REPORT 0x34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x34()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X34_EDEFAULT = Byte.decode("0x34"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x34() <em>DATA REPORT 0x34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x34()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x34 = DATA_REPORT_0X34_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x35() <em>DATA REPORT 0x35</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x35()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X35_EDEFAULT = Byte.decode("0x35"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x35() <em>DATA REPORT 0x35</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x35()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x35 = DATA_REPORT_0X35_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x36() <em>DATA REPORT 0x36</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x36()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X36_EDEFAULT = Byte.decode("0x36"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x36() <em>DATA REPORT 0x36</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x36()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x36 = DATA_REPORT_0X36_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x37() <em>DATA REPORT 0x37</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x37()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X37_EDEFAULT = Byte.decode("0x37"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x37() <em>DATA REPORT 0x37</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x37()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x37 = DATA_REPORT_0X37_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x3d() <em>DATA REPORT 0x3d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x3d()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X3D_EDEFAULT = Byte.decode("0x3d"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x3d() <em>DATA REPORT 0x3d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x3d()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x3d = DATA_REPORT_0X3D_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x3e() <em>DATA REPORT 0x3e</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x3e()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X3E_EDEFAULT = Byte.decode("0x3e"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x3e() <em>DATA REPORT 0x3e</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x3e()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x3e = DATA_REPORT_0X3E_EDEFAULT;
	/**
	 * The default value of the '{@link #getDATA_REPORT_0x3f() <em>DATA REPORT 0x3f</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x3f()
	 * @generated NOT
	 * @ordered
	 */
	protected static final byte DATA_REPORT_0X3F_EDEFAULT = Byte.decode("0x3f"); // TODO The default value literal "" is not valid.
	/**
	 * The cached value of the '{@link #getDATA_REPORT_0x3f() <em>DATA REPORT 0x3f</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATA_REPORT_0x3f()
	 * @generated
	 * @ordered
	 */
	protected byte datA_REPORT_0x3f = DATA_REPORT_0X3F_EDEFAULT;
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final byte MODE_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected byte mode = MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #isContinuous() <em>Continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinuous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUOUS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isContinuous() <em>Continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinuous()
	 * @generated
	 * @ordered
	 */
	protected boolean continuous = CONTINUOUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiReportModeReqCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_REPORT_MODE_REQ_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x20() {
		return datA_REPORT_0x20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x20(byte newDATA_REPORT_0x20) {
		byte oldDATA_REPORT_0x20 = datA_REPORT_0x20;
		datA_REPORT_0x20 = newDATA_REPORT_0x20;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X20, oldDATA_REPORT_0x20, datA_REPORT_0x20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x21() {
		return datA_REPORT_0x21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x21(byte newDATA_REPORT_0x21) {
		byte oldDATA_REPORT_0x21 = datA_REPORT_0x21;
		datA_REPORT_0x21 = newDATA_REPORT_0x21;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X21, oldDATA_REPORT_0x21, datA_REPORT_0x21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x30() {
		return datA_REPORT_0x30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x30(byte newDATA_REPORT_0x30) {
		byte oldDATA_REPORT_0x30 = datA_REPORT_0x30;
		datA_REPORT_0x30 = newDATA_REPORT_0x30;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X30, oldDATA_REPORT_0x30, datA_REPORT_0x30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x31() {
		return datA_REPORT_0x31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x31(byte newDATA_REPORT_0x31) {
		byte oldDATA_REPORT_0x31 = datA_REPORT_0x31;
		datA_REPORT_0x31 = newDATA_REPORT_0x31;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X31, oldDATA_REPORT_0x31, datA_REPORT_0x31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x32() {
		return datA_REPORT_0x32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x32(byte newDATA_REPORT_0x32) {
		byte oldDATA_REPORT_0x32 = datA_REPORT_0x32;
		datA_REPORT_0x32 = newDATA_REPORT_0x32;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X32, oldDATA_REPORT_0x32, datA_REPORT_0x32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x33() {
		return datA_REPORT_0x33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x33(byte newDATA_REPORT_0x33) {
		byte oldDATA_REPORT_0x33 = datA_REPORT_0x33;
		datA_REPORT_0x33 = newDATA_REPORT_0x33;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X33, oldDATA_REPORT_0x33, datA_REPORT_0x33));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x34() {
		return datA_REPORT_0x34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x34(byte newDATA_REPORT_0x34) {
		byte oldDATA_REPORT_0x34 = datA_REPORT_0x34;
		datA_REPORT_0x34 = newDATA_REPORT_0x34;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X34, oldDATA_REPORT_0x34, datA_REPORT_0x34));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x35() {
		return datA_REPORT_0x35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x35(byte newDATA_REPORT_0x35) {
		byte oldDATA_REPORT_0x35 = datA_REPORT_0x35;
		datA_REPORT_0x35 = newDATA_REPORT_0x35;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X35, oldDATA_REPORT_0x35, datA_REPORT_0x35));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x36() {
		return datA_REPORT_0x36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x36(byte newDATA_REPORT_0x36) {
		byte oldDATA_REPORT_0x36 = datA_REPORT_0x36;
		datA_REPORT_0x36 = newDATA_REPORT_0x36;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X36, oldDATA_REPORT_0x36, datA_REPORT_0x36));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x37() {
		return datA_REPORT_0x37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x37(byte newDATA_REPORT_0x37) {
		byte oldDATA_REPORT_0x37 = datA_REPORT_0x37;
		datA_REPORT_0x37 = newDATA_REPORT_0x37;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X37, oldDATA_REPORT_0x37, datA_REPORT_0x37));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x3d() {
		return datA_REPORT_0x3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x3d(byte newDATA_REPORT_0x3d) {
		byte oldDATA_REPORT_0x3d = datA_REPORT_0x3d;
		datA_REPORT_0x3d = newDATA_REPORT_0x3d;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3D, oldDATA_REPORT_0x3d, datA_REPORT_0x3d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x3e() {
		return datA_REPORT_0x3e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x3e(byte newDATA_REPORT_0x3e) {
		byte oldDATA_REPORT_0x3e = datA_REPORT_0x3e;
		datA_REPORT_0x3e = newDATA_REPORT_0x3e;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3E, oldDATA_REPORT_0x3e, datA_REPORT_0x3e));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDATA_REPORT_0x3f() {
		return datA_REPORT_0x3f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATA_REPORT_0x3f(byte newDATA_REPORT_0x3f) {
		byte oldDATA_REPORT_0x3f = datA_REPORT_0x3f;
		datA_REPORT_0x3f = newDATA_REPORT_0x3f;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3F, oldDATA_REPORT_0x3f, datA_REPORT_0x3f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(byte newMode) {
		byte oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContinuous() {
		return continuous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuous(boolean newContinuous) {
		boolean oldContinuous = continuous;
		continuous = newContinuous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__CONTINUOUS, oldContinuous, continuous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X20:
				return getDATA_REPORT_0x20();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X21:
				return getDATA_REPORT_0x21();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X30:
				return getDATA_REPORT_0x30();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X31:
				return getDATA_REPORT_0x31();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X32:
				return getDATA_REPORT_0x32();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X33:
				return getDATA_REPORT_0x33();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X34:
				return getDATA_REPORT_0x34();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X35:
				return getDATA_REPORT_0x35();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X36:
				return getDATA_REPORT_0x36();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X37:
				return getDATA_REPORT_0x37();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3D:
				return getDATA_REPORT_0x3d();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3E:
				return getDATA_REPORT_0x3e();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3F:
				return getDATA_REPORT_0x3f();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__MODE:
				return getMode();
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__CONTINUOUS:
				return isContinuous();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X20:
				setDATA_REPORT_0x20((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X21:
				setDATA_REPORT_0x21((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X30:
				setDATA_REPORT_0x30((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X31:
				setDATA_REPORT_0x31((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X32:
				setDATA_REPORT_0x32((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X33:
				setDATA_REPORT_0x33((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X34:
				setDATA_REPORT_0x34((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X35:
				setDATA_REPORT_0x35((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X36:
				setDATA_REPORT_0x36((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X37:
				setDATA_REPORT_0x37((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3D:
				setDATA_REPORT_0x3d((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3E:
				setDATA_REPORT_0x3e((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3F:
				setDATA_REPORT_0x3f((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__MODE:
				setMode((Byte)newValue);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__CONTINUOUS:
				setContinuous((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X20:
				setDATA_REPORT_0x20(DATA_REPORT_0X20_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X21:
				setDATA_REPORT_0x21(DATA_REPORT_0X21_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X30:
				setDATA_REPORT_0x30(DATA_REPORT_0X30_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X31:
				setDATA_REPORT_0x31(DATA_REPORT_0X31_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X32:
				setDATA_REPORT_0x32(DATA_REPORT_0X32_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X33:
				setDATA_REPORT_0x33(DATA_REPORT_0X33_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X34:
				setDATA_REPORT_0x34(DATA_REPORT_0X34_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X35:
				setDATA_REPORT_0x35(DATA_REPORT_0X35_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X36:
				setDATA_REPORT_0x36(DATA_REPORT_0X36_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X37:
				setDATA_REPORT_0x37(DATA_REPORT_0X37_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3D:
				setDATA_REPORT_0x3d(DATA_REPORT_0X3D_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3E:
				setDATA_REPORT_0x3e(DATA_REPORT_0X3E_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3F:
				setDATA_REPORT_0x3f(DATA_REPORT_0X3F_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__CONTINUOUS:
				setContinuous(CONTINUOUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X20:
				return datA_REPORT_0x20 != DATA_REPORT_0X20_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X21:
				return datA_REPORT_0x21 != DATA_REPORT_0X21_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X30:
				return datA_REPORT_0x30 != DATA_REPORT_0X30_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X31:
				return datA_REPORT_0x31 != DATA_REPORT_0X31_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X32:
				return datA_REPORT_0x32 != DATA_REPORT_0X32_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X33:
				return datA_REPORT_0x33 != DATA_REPORT_0X33_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X34:
				return datA_REPORT_0x34 != DATA_REPORT_0X34_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X35:
				return datA_REPORT_0x35 != DATA_REPORT_0X35_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X36:
				return datA_REPORT_0x36 != DATA_REPORT_0X36_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X37:
				return datA_REPORT_0x37 != DATA_REPORT_0X37_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3D:
				return datA_REPORT_0x3d != DATA_REPORT_0X3D_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3E:
				return datA_REPORT_0x3e != DATA_REPORT_0X3E_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__DATA_REPORT_0X3F:
				return datA_REPORT_0x3f != DATA_REPORT_0X3F_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__MODE:
				return mode != MODE_EDEFAULT;
			case EzwiimotePackage.WII_REPORT_MODE_REQ_CMD__CONTINUOUS:
				return continuous != CONTINUOUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DATA_REPORT_0x20: ");
		result.append(datA_REPORT_0x20);
		result.append(", DATA_REPORT_0x21: ");
		result.append(datA_REPORT_0x21);
		result.append(", DATA_REPORT_0x30: ");
		result.append(datA_REPORT_0x30);
		result.append(", DATA_REPORT_0x31: ");
		result.append(datA_REPORT_0x31);
		result.append(", DATA_REPORT_0x32: ");
		result.append(datA_REPORT_0x32);
		result.append(", DATA_REPORT_0x33: ");
		result.append(datA_REPORT_0x33);
		result.append(", DATA_REPORT_0x34: ");
		result.append(datA_REPORT_0x34);
		result.append(", DATA_REPORT_0x35: ");
		result.append(datA_REPORT_0x35);
		result.append(", DATA_REPORT_0x36: ");
		result.append(datA_REPORT_0x36);
		result.append(", DATA_REPORT_0x37: ");
		result.append(datA_REPORT_0x37);
		result.append(", DATA_REPORT_0x3d: ");
		result.append(datA_REPORT_0x3d);
		result.append(", DATA_REPORT_0x3e: ");
		result.append(datA_REPORT_0x3e);
		result.append(", DATA_REPORT_0x3f: ");
		result.append(datA_REPORT_0x3f);
		result.append(", mode: ");
		result.append(mode);
		result.append(", continuous: ");
		result.append(continuous);
		result.append(')');
		return result.toString();
	}

} //WiiReportModeReqCmdImpl
