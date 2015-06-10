/**
 */
package net.sf.smbt.btc.mtgox.impl;

import java.math.BigInteger;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.btc.mtgox.WithdrawInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Withdraw Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl#getValue_int <em>Value int</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl#getDisplay_short <em>Display short</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WithdrawInfoImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WithdrawInfoImpl extends MinimalEObjectImpl.Container implements WithdrawInfo {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue_int() <em>Value int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_int()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue_int() <em>Value int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_int()
	 * @generated
	 * @ordered
	 */
	protected BigInteger value_int = VALUE_INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected String display = DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay_short() <em>Display short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay_short()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_SHORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay_short() <em>Display short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay_short()
	 * @generated
	 * @ordered
	 */
	protected String display_short = DISPLAY_SHORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final BtcCurrency CURRENCY_EDEFAULT = BtcCurrency.EUR;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected BtcCurrency currency = CURRENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WithdrawInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.WITHDRAW_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WITHDRAW_INFO__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getValue_int() {
		return value_int;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_int(BigInteger newValue_int) {
		BigInteger oldValue_int = value_int;
		value_int = newValue_int;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WITHDRAW_INFO__VALUE_INT, oldValue_int, value_int));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(String newDisplay) {
		String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WITHDRAW_INFO__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay_short() {
		return display_short;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay_short(String newDisplay_short) {
		String oldDisplay_short = display_short;
		display_short = newDisplay_short;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WITHDRAW_INFO__DISPLAY_SHORT, oldDisplay_short, display_short));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcCurrency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(BtcCurrency newCurrency) {
		BtcCurrency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WITHDRAW_INFO__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.WITHDRAW_INFO__VALUE:
				return getValue();
			case MtgoxPackage.WITHDRAW_INFO__VALUE_INT:
				return getValue_int();
			case MtgoxPackage.WITHDRAW_INFO__DISPLAY:
				return getDisplay();
			case MtgoxPackage.WITHDRAW_INFO__DISPLAY_SHORT:
				return getDisplay_short();
			case MtgoxPackage.WITHDRAW_INFO__CURRENCY:
				return getCurrency();
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
			case MtgoxPackage.WITHDRAW_INFO__VALUE:
				setValue((Float)newValue);
				return;
			case MtgoxPackage.WITHDRAW_INFO__VALUE_INT:
				setValue_int((BigInteger)newValue);
				return;
			case MtgoxPackage.WITHDRAW_INFO__DISPLAY:
				setDisplay((String)newValue);
				return;
			case MtgoxPackage.WITHDRAW_INFO__DISPLAY_SHORT:
				setDisplay_short((String)newValue);
				return;
			case MtgoxPackage.WITHDRAW_INFO__CURRENCY:
				setCurrency((BtcCurrency)newValue);
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
			case MtgoxPackage.WITHDRAW_INFO__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MtgoxPackage.WITHDRAW_INFO__VALUE_INT:
				setValue_int(VALUE_INT_EDEFAULT);
				return;
			case MtgoxPackage.WITHDRAW_INFO__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
				return;
			case MtgoxPackage.WITHDRAW_INFO__DISPLAY_SHORT:
				setDisplay_short(DISPLAY_SHORT_EDEFAULT);
				return;
			case MtgoxPackage.WITHDRAW_INFO__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
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
			case MtgoxPackage.WITHDRAW_INFO__VALUE:
				return value != VALUE_EDEFAULT;
			case MtgoxPackage.WITHDRAW_INFO__VALUE_INT:
				return VALUE_INT_EDEFAULT == null ? value_int != null : !VALUE_INT_EDEFAULT.equals(value_int);
			case MtgoxPackage.WITHDRAW_INFO__DISPLAY:
				return DISPLAY_EDEFAULT == null ? display != null : !DISPLAY_EDEFAULT.equals(display);
			case MtgoxPackage.WITHDRAW_INFO__DISPLAY_SHORT:
				return DISPLAY_SHORT_EDEFAULT == null ? display_short != null : !DISPLAY_SHORT_EDEFAULT.equals(display_short);
			case MtgoxPackage.WITHDRAW_INFO__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", value_int: ");
		result.append(value_int);
		result.append(", display: ");
		result.append(display);
		result.append(", display_short: ");
		result.append(display_short);
		result.append(", currency: ");
		result.append(currency);
		result.append(')');
		return result.toString();
	}

} //WithdrawInfoImpl
