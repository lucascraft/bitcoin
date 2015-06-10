/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.ZLX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZLXImpl#getTemperature1 <em>Temperature1</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZLXImpl#getTemperature2 <em>Temperature2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZLXImpl extends BFLCmdImpl implements ZLX {
	/**
	 * The default value of the '{@link #getTemperature1() <em>Temperature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature1()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPERATURE1_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTemperature1() <em>Temperature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature1()
	 * @generated
	 * @ordered
	 */
	protected int temperature1 = TEMPERATURE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getTemperature2() <em>Temperature2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature2()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPERATURE2_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTemperature2() <em>Temperature2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature2()
	 * @generated
	 * @ordered
	 */
	protected int temperature2 = TEMPERATURE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.ZLX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTemperature1() {
		return temperature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature1(int newTemperature1) {
		int oldTemperature1 = temperature1;
		temperature1 = newTemperature1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZLX__TEMPERATURE1, oldTemperature1, temperature1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTemperature2() {
		return temperature2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature2(int newTemperature2) {
		int oldTemperature2 = temperature2;
		temperature2 = newTemperature2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZLX__TEMPERATURE2, oldTemperature2, temperature2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.ZLX__TEMPERATURE1:
				return getTemperature1();
			case Bitforcev2Package.ZLX__TEMPERATURE2:
				return getTemperature2();
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
			case Bitforcev2Package.ZLX__TEMPERATURE1:
				setTemperature1((Integer)newValue);
				return;
			case Bitforcev2Package.ZLX__TEMPERATURE2:
				setTemperature2((Integer)newValue);
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
			case Bitforcev2Package.ZLX__TEMPERATURE1:
				setTemperature1(TEMPERATURE1_EDEFAULT);
				return;
			case Bitforcev2Package.ZLX__TEMPERATURE2:
				setTemperature2(TEMPERATURE2_EDEFAULT);
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
			case Bitforcev2Package.ZLX__TEMPERATURE1:
				return temperature1 != TEMPERATURE1_EDEFAULT;
			case Bitforcev2Package.ZLX__TEMPERATURE2:
				return temperature2 != TEMPERATURE2_EDEFAULT;
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
		result.append(" (temperature1: ");
		result.append(temperature1);
		result.append(", temperature2: ");
		result.append(temperature2);
		result.append(')');
		return result.toString();
	}

} //ZLXImpl
