/**
 */
package net.sf.smbt.btc.impl;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.BtcPackage;
import net.sf.smbt.btc.ExchangeRate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.impl.ExchangeRateImpl#getFrom <em>From</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.ExchangeRateImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link net.sf.smbt.btc.impl.ExchangeRateImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExchangeRateImpl extends MinimalEObjectImpl.Container implements ExchangeRate {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final BtcCurrency FROM_EDEFAULT = BtcCurrency.EUR;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected BtcCurrency from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final float RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected float rate = RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final BtcCurrency TO_EDEFAULT = BtcCurrency.EUR;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected BtcCurrency to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcPackage.Literals.EXCHANGE_RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcCurrency getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(BtcCurrency newFrom) {
		BtcCurrency oldFrom = from;
		from = newFrom == null ? FROM_EDEFAULT : newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.EXCHANGE_RATE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(float newRate) {
		float oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.EXCHANGE_RATE__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcCurrency getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(BtcCurrency newTo) {
		BtcCurrency oldTo = to;
		to = newTo == null ? TO_EDEFAULT : newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcPackage.EXCHANGE_RATE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtcPackage.EXCHANGE_RATE__FROM:
				return getFrom();
			case BtcPackage.EXCHANGE_RATE__RATE:
				return getRate();
			case BtcPackage.EXCHANGE_RATE__TO:
				return getTo();
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
			case BtcPackage.EXCHANGE_RATE__FROM:
				setFrom((BtcCurrency)newValue);
				return;
			case BtcPackage.EXCHANGE_RATE__RATE:
				setRate((Float)newValue);
				return;
			case BtcPackage.EXCHANGE_RATE__TO:
				setTo((BtcCurrency)newValue);
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
			case BtcPackage.EXCHANGE_RATE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case BtcPackage.EXCHANGE_RATE__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case BtcPackage.EXCHANGE_RATE__TO:
				setTo(TO_EDEFAULT);
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
			case BtcPackage.EXCHANGE_RATE__FROM:
				return from != FROM_EDEFAULT;
			case BtcPackage.EXCHANGE_RATE__RATE:
				return rate != RATE_EDEFAULT;
			case BtcPackage.EXCHANGE_RATE__TO:
				return to != TO_EDEFAULT;
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
		result.append(" (from: ");
		result.append(from);
		result.append(", rate: ");
		result.append(rate);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //ExchangeRateImpl
