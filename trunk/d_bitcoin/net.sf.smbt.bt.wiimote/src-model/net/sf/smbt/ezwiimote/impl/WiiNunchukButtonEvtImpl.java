/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiNunchukButtonEvt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Nunchuk Button Evt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiNunchukButtonEvtImpl#getC_BUTTON <em>CBUTTON</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiNunchukButtonEvtImpl#getZ_BUTTON <em>ZBUTTON</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiNunchukButtonEvtImpl#getNO_BUTTON <em>NO BUTTON</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiNunchukButtonEvtImpl extends WiiEvtImpl implements WiiNunchukButtonEvt {
	/**
	 * The default value of the '{@link #getC_BUTTON() <em>CBUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_BUTTON()
	 * @generated
	 * @ordered
	 */
	protected static final int CBUTTON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getC_BUTTON() <em>CBUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_BUTTON()
	 * @generated
	 * @ordered
	 */
	protected int c_BUTTON = CBUTTON_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ_BUTTON() <em>ZBUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ_BUTTON()
	 * @generated
	 * @ordered
	 */
	protected static final int ZBUTTON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZ_BUTTON() <em>ZBUTTON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ_BUTTON()
	 * @generated
	 * @ordered
	 */
	protected int z_BUTTON = ZBUTTON_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiNunchukButtonEvtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_NUNCHUK_BUTTON_EVT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getC_BUTTON() {
		return c_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_BUTTON(int newC_BUTTON) {
		int oldC_BUTTON = c_BUTTON;
		c_BUTTON = newC_BUTTON;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__CBUTTON, oldC_BUTTON, c_BUTTON));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZ_BUTTON() {
		return z_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ_BUTTON(int newZ_BUTTON) {
		int oldZ_BUTTON = z_BUTTON;
		z_BUTTON = newZ_BUTTON;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__ZBUTTON, oldZ_BUTTON, z_BUTTON));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__NO_BUTTON, oldNO_BUTTON, nO_BUTTON));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isZButtonPressed() {
		return getZ_BUTTON() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCButtonPressed() {
		return getC_BUTTON() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__CBUTTON:
				return getC_BUTTON();
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__ZBUTTON:
				return getZ_BUTTON();
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__NO_BUTTON:
				return getNO_BUTTON();
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
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__CBUTTON:
				setC_BUTTON((Integer)newValue);
				return;
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__ZBUTTON:
				setZ_BUTTON((Integer)newValue);
				return;
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__NO_BUTTON:
				setNO_BUTTON((Integer)newValue);
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
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__CBUTTON:
				setC_BUTTON(CBUTTON_EDEFAULT);
				return;
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__ZBUTTON:
				setZ_BUTTON(ZBUTTON_EDEFAULT);
				return;
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__NO_BUTTON:
				setNO_BUTTON(NO_BUTTON_EDEFAULT);
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
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__CBUTTON:
				return c_BUTTON != CBUTTON_EDEFAULT;
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__ZBUTTON:
				return z_BUTTON != ZBUTTON_EDEFAULT;
			case EzwiimotePackage.WII_NUNCHUK_BUTTON_EVT__NO_BUTTON:
				return nO_BUTTON != NO_BUTTON_EDEFAULT;
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
		result.append(" (C_BUTTON: ");
		result.append(c_BUTTON);
		result.append(", Z_BUTTON: ");
		result.append(z_BUTTON);
		result.append(", NO_BUTTON: ");
		result.append(nO_BUTTON);
		result.append(')');
		return result.toString();
	}

} //WiiNunchukButtonEvtImpl
