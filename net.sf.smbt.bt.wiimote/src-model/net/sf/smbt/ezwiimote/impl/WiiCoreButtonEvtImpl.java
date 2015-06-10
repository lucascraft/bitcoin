/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.BUTTON_CODE;
import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiCoreButtonEvt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Core Button Evt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getNO_BUTTON <em>NO BUTTON</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getD_PAD_LEFT <em>DPAD LEFT</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getD_PAD_RIGHT <em>DPAD RIGHT</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getD_PAD_UP <em>DPAD UP</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getD_PAD_DOWN <em>DPAD DOWN</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getBUTTON_ONE <em>BUTTON ONE</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getBUTTON_TWO <em>BUTTON TWO</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getBUTTON_A <em>BUTTON A</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getBUTTON_B <em>BUTTON B</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getBUTTON_PLUS <em>BUTTON PLUS</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getBUTTON_MINUS <em>BUTTON MINUS</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getBUTTON_HOME <em>BUTTON HOME</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCoreButtonEvtImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiCoreButtonEvtImpl extends WiiEvtImpl implements WiiCoreButtonEvt {
	/**
	 * The default value of the '{@link #getNO_BUTTON() <em>NO BUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNO_BUTTON()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_BUTTON_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNO_BUTTON() <em>NO BUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNO_BUTTON()
	 * @generated
	 * @ordered
	 */
	protected int nO_BUTTON = NO_BUTTON_EDEFAULT;
	/**
	 * The default value of the '{@link #getD_PAD_LEFT() <em>DPAD LEFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_PAD_LEFT()
	 * @generated
	 * @ordered
	 */
	protected static final int DPAD_LEFT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getD_PAD_LEFT() <em>DPAD LEFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_PAD_LEFT()
	 * @generated
	 * @ordered
	 */
	protected int d_PAD_LEFT = DPAD_LEFT_EDEFAULT;
	/**
	 * The default value of the '{@link #getD_PAD_RIGHT() <em>DPAD RIGHT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_PAD_RIGHT()
	 * @generated
	 * @ordered
	 */
	protected static final int DPAD_RIGHT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getD_PAD_RIGHT() <em>DPAD RIGHT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_PAD_RIGHT()
	 * @generated
	 * @ordered
	 */
	protected int d_PAD_RIGHT = DPAD_RIGHT_EDEFAULT;
	/**
	 * The default value of the '{@link #getD_PAD_UP() <em>DPAD UP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_PAD_UP()
	 * @generated
	 * @ordered
	 */
	protected static final int DPAD_UP_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getD_PAD_UP() <em>DPAD UP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_PAD_UP()
	 * @generated
	 * @ordered
	 */
	protected int d_PAD_UP = DPAD_UP_EDEFAULT;
	/**
	 * The default value of the '{@link #getD_PAD_DOWN() <em>DPAD DOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_PAD_DOWN()
	 * @generated
	 * @ordered
	 */
	protected static final int DPAD_DOWN_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getD_PAD_DOWN() <em>DPAD DOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_PAD_DOWN()
	 * @generated
	 * @ordered
	 */
	protected int d_PAD_DOWN = DPAD_DOWN_EDEFAULT;
	/**
	 * The default value of the '{@link #getBUTTON_ONE() <em>BUTTON ONE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_ONE()
	 * @generated
	 * @ordered
	 */
	protected static final int BUTTON_ONE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBUTTON_ONE() <em>BUTTON ONE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_ONE()
	 * @generated
	 * @ordered
	 */
	protected int buttoN_ONE = BUTTON_ONE_EDEFAULT;
	/**
	 * The default value of the '{@link #getBUTTON_TWO() <em>BUTTON TWO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_TWO()
	 * @generated
	 * @ordered
	 */
	protected static final int BUTTON_TWO_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBUTTON_TWO() <em>BUTTON TWO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_TWO()
	 * @generated
	 * @ordered
	 */
	protected int buttoN_TWO = BUTTON_TWO_EDEFAULT;
	/**
	 * The default value of the '{@link #getBUTTON_A() <em>BUTTON A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_A()
	 * @generated
	 * @ordered
	 */
	protected static final int BUTTON_A_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBUTTON_A() <em>BUTTON A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_A()
	 * @generated
	 * @ordered
	 */
	protected int buttoN_A = BUTTON_A_EDEFAULT;
	/**
	 * The default value of the '{@link #getBUTTON_B() <em>BUTTON B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_B()
	 * @generated
	 * @ordered
	 */
	protected static final int BUTTON_B_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBUTTON_B() <em>BUTTON B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_B()
	 * @generated
	 * @ordered
	 */
	protected int buttoN_B = BUTTON_B_EDEFAULT;
	/**
	 * The default value of the '{@link #getBUTTON_PLUS() <em>BUTTON PLUS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_PLUS()
	 * @generated
	 * @ordered
	 */
	protected static final int BUTTON_PLUS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBUTTON_PLUS() <em>BUTTON PLUS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_PLUS()
	 * @generated
	 * @ordered
	 */
	protected int buttoN_PLUS = BUTTON_PLUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getBUTTON_MINUS() <em>BUTTON MINUS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_MINUS()
	 * @generated
	 * @ordered
	 */
	protected static final int BUTTON_MINUS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBUTTON_MINUS() <em>BUTTON MINUS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_MINUS()
	 * @generated
	 * @ordered
	 */
	protected int buttoN_MINUS = BUTTON_MINUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getBUTTON_HOME() <em>BUTTON HOME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_HOME()
	 * @generated
	 * @ordered
	 */
	protected static final int BUTTON_HOME_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBUTTON_HOME() <em>BUTTON HOME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUTTON_HOME()
	 * @generated
	 * @ordered
	 */
	protected int buttoN_HOME = BUTTON_HOME_EDEFAULT;
	/**
	 * The default value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int MODIFIERS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected int modifiers = MODIFIERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiCoreButtonEvtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_CORE_BUTTON_EVT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNO_BUTTON() {
		return nO_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNO_BUTTON(int newNO_BUTTON) {
		int oldNO_BUTTON = nO_BUTTON;
		nO_BUTTON = newNO_BUTTON;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__NO_BUTTON, oldNO_BUTTON, nO_BUTTON));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD_PAD_LEFT() {
		return d_PAD_LEFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_PAD_LEFT(int newD_PAD_LEFT) {
		int oldD_PAD_LEFT = d_PAD_LEFT;
		d_PAD_LEFT = newD_PAD_LEFT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_LEFT, oldD_PAD_LEFT, d_PAD_LEFT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD_PAD_RIGHT() {
		return d_PAD_RIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_PAD_RIGHT(int newD_PAD_RIGHT) {
		int oldD_PAD_RIGHT = d_PAD_RIGHT;
		d_PAD_RIGHT = newD_PAD_RIGHT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_RIGHT, oldD_PAD_RIGHT, d_PAD_RIGHT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD_PAD_UP() {
		return d_PAD_UP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_PAD_UP(int newD_PAD_UP) {
		int oldD_PAD_UP = d_PAD_UP;
		d_PAD_UP = newD_PAD_UP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_UP, oldD_PAD_UP, d_PAD_UP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD_PAD_DOWN() {
		return d_PAD_DOWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_PAD_DOWN(int newD_PAD_DOWN) {
		int oldD_PAD_DOWN = d_PAD_DOWN;
		d_PAD_DOWN = newD_PAD_DOWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_DOWN, oldD_PAD_DOWN, d_PAD_DOWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBUTTON_ONE() {
		return buttoN_ONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBUTTON_ONE(int newBUTTON_ONE) {
		int oldBUTTON_ONE = buttoN_ONE;
		buttoN_ONE = newBUTTON_ONE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_ONE, oldBUTTON_ONE, buttoN_ONE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBUTTON_TWO() {
		return buttoN_TWO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBUTTON_TWO(int newBUTTON_TWO) {
		int oldBUTTON_TWO = buttoN_TWO;
		buttoN_TWO = newBUTTON_TWO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_TWO, oldBUTTON_TWO, buttoN_TWO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBUTTON_A() {
		return buttoN_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBUTTON_A(int newBUTTON_A) {
		int oldBUTTON_A = buttoN_A;
		buttoN_A = newBUTTON_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_A, oldBUTTON_A, buttoN_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBUTTON_B() {
		return buttoN_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBUTTON_B(int newBUTTON_B) {
		int oldBUTTON_B = buttoN_B;
		buttoN_B = newBUTTON_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_B, oldBUTTON_B, buttoN_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBUTTON_PLUS() {
		return buttoN_PLUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBUTTON_PLUS(int newBUTTON_PLUS) {
		int oldBUTTON_PLUS = buttoN_PLUS;
		buttoN_PLUS = newBUTTON_PLUS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_PLUS, oldBUTTON_PLUS, buttoN_PLUS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBUTTON_MINUS() {
		return buttoN_MINUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBUTTON_MINUS(int newBUTTON_MINUS) {
		int oldBUTTON_MINUS = buttoN_MINUS;
		buttoN_MINUS = newBUTTON_MINUS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_MINUS, oldBUTTON_MINUS, buttoN_MINUS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBUTTON_HOME() {
		return buttoN_HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBUTTON_HOME(int newBUTTON_HOME) {
		int oldBUTTON_HOME = buttoN_HOME;
		buttoN_HOME = newBUTTON_HOME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_HOME, oldBUTTON_HOME, buttoN_HOME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getModifiers() {
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiers(int newModifiers) {
		int oldModifiers = modifiers;
		modifiers = newModifiers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CORE_BUTTON_EVT__MODIFIERS, oldModifiers, modifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonAPressed() {
		return (getModifiers() & BUTTON_CODE.BUTTON_A_VALUE) == BUTTON_CODE.BUTTON_A_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonBPressed() {
		return  (getModifiers() & BUTTON_CODE.BUTTON_B_VALUE) == BUTTON_CODE.BUTTON_B_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonHomePressed() {
		return  (getModifiers() & BUTTON_CODE.BUTTON_HOME_VALUE) == BUTTON_CODE.BUTTON_HOME_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonPadUpPressed() {
		return  (getModifiers() & BUTTON_CODE.DPAD_UP_VALUE) == BUTTON_CODE.DPAD_UP_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonPadDownPressed() {
		return  (getModifiers() & BUTTON_CODE.DPAD_DOWN_VALUE) == BUTTON_CODE.DPAD_DOWN_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonPadLeftPressed() {
		return  (getModifiers() & BUTTON_CODE.DPAD_LEFT_VALUE) == BUTTON_CODE.DPAD_LEFT_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonPadRightPressed() {
		return  (getModifiers() & BUTTON_CODE.DPAD_RIGHT_VALUE) == BUTTON_CODE.DPAD_RIGHT_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonMinusPressed() {
		return  (getModifiers() & BUTTON_CODE.BUTTON_MINUS_VALUE) == BUTTON_CODE.BUTTON_MINUS_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonPlusPressed() {
		return  (getModifiers() & BUTTON_CODE.BUTTON_PLUS_VALUE) == BUTTON_CODE.BUTTON_PLUS_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonNoPressed() {
		return  (getModifiers() & BUTTON_CODE.NO_BUTTON_VALUE) == BUTTON_CODE.NO_BUTTON_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonOnePressed() {
		return  (getModifiers() & BUTTON_CODE.BUTTON_X_VALUE) == BUTTON_CODE.BUTTON_X_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isButtonTwoPressed() {
		return  (getModifiers() & BUTTON_CODE.BUTTON_Y_VALUE) == BUTTON_CODE.BUTTON_Y_VALUE; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__NO_BUTTON:
				return getNO_BUTTON();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_LEFT:
				return getD_PAD_LEFT();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_RIGHT:
				return getD_PAD_RIGHT();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_UP:
				return getD_PAD_UP();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_DOWN:
				return getD_PAD_DOWN();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_ONE:
				return getBUTTON_ONE();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_TWO:
				return getBUTTON_TWO();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_A:
				return getBUTTON_A();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_B:
				return getBUTTON_B();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_PLUS:
				return getBUTTON_PLUS();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_MINUS:
				return getBUTTON_MINUS();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_HOME:
				return getBUTTON_HOME();
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__MODIFIERS:
				return getModifiers();
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
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__NO_BUTTON:
				setNO_BUTTON((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_LEFT:
				setD_PAD_LEFT((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_RIGHT:
				setD_PAD_RIGHT((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_UP:
				setD_PAD_UP((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_DOWN:
				setD_PAD_DOWN((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_ONE:
				setBUTTON_ONE((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_TWO:
				setBUTTON_TWO((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_A:
				setBUTTON_A((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_B:
				setBUTTON_B((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_PLUS:
				setBUTTON_PLUS((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_MINUS:
				setBUTTON_MINUS((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_HOME:
				setBUTTON_HOME((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__MODIFIERS:
				setModifiers((Integer)newValue);
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
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__NO_BUTTON:
				setNO_BUTTON(NO_BUTTON_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_LEFT:
				setD_PAD_LEFT(DPAD_LEFT_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_RIGHT:
				setD_PAD_RIGHT(DPAD_RIGHT_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_UP:
				setD_PAD_UP(DPAD_UP_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_DOWN:
				setD_PAD_DOWN(DPAD_DOWN_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_ONE:
				setBUTTON_ONE(BUTTON_ONE_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_TWO:
				setBUTTON_TWO(BUTTON_TWO_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_A:
				setBUTTON_A(BUTTON_A_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_B:
				setBUTTON_B(BUTTON_B_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_PLUS:
				setBUTTON_PLUS(BUTTON_PLUS_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_MINUS:
				setBUTTON_MINUS(BUTTON_MINUS_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_HOME:
				setBUTTON_HOME(BUTTON_HOME_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__MODIFIERS:
				setModifiers(MODIFIERS_EDEFAULT);
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
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__NO_BUTTON:
				return nO_BUTTON != NO_BUTTON_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_LEFT:
				return d_PAD_LEFT != DPAD_LEFT_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_RIGHT:
				return d_PAD_RIGHT != DPAD_RIGHT_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_UP:
				return d_PAD_UP != DPAD_UP_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__DPAD_DOWN:
				return d_PAD_DOWN != DPAD_DOWN_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_ONE:
				return buttoN_ONE != BUTTON_ONE_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_TWO:
				return buttoN_TWO != BUTTON_TWO_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_A:
				return buttoN_A != BUTTON_A_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_B:
				return buttoN_B != BUTTON_B_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_PLUS:
				return buttoN_PLUS != BUTTON_PLUS_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_MINUS:
				return buttoN_MINUS != BUTTON_MINUS_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__BUTTON_HOME:
				return buttoN_HOME != BUTTON_HOME_EDEFAULT;
			case EzwiimotePackage.WII_CORE_BUTTON_EVT__MODIFIERS:
				return modifiers != MODIFIERS_EDEFAULT;
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
		result.append(" (NO_BUTTON: ");
		result.append(nO_BUTTON);
		result.append(", D_PAD_LEFT: ");
		result.append(d_PAD_LEFT);
		result.append(", D_PAD_RIGHT: ");
		result.append(d_PAD_RIGHT);
		result.append(", D_PAD_UP: ");
		result.append(d_PAD_UP);
		result.append(", D_PAD_DOWN: ");
		result.append(d_PAD_DOWN);
		result.append(", BUTTON_ONE: ");
		result.append(buttoN_ONE);
		result.append(", BUTTON_TWO: ");
		result.append(buttoN_TWO);
		result.append(", BUTTON_A: ");
		result.append(buttoN_A);
		result.append(", BUTTON_B: ");
		result.append(buttoN_B);
		result.append(", BUTTON_PLUS: ");
		result.append(buttoN_PLUS);
		result.append(", BUTTON_MINUS: ");
		result.append(buttoN_MINUS);
		result.append(", BUTTON_HOME: ");
		result.append(buttoN_HOME);
		result.append(", modifiers: ");
		result.append(modifiers);
		result.append(')');
		return result.toString();
	}

} //WiiCoreButtonEvtImpl
