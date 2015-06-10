/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.ZTX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZTX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZTXImpl#getV3_3 <em>V3 3</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZTXImpl#getV1_0 <em>V1 0</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZTXImpl#getVccMain <em>Vcc Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZTXImpl extends BFLCmdImpl implements ZTX {
	/**
	 * The default value of the '{@link #getV3_3() <em>V3 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV3_3()
	 * @generated
	 * @ordered
	 */
	protected static final String V3_3_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getV3_3() <em>V3 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV3_3()
	 * @generated
	 * @ordered
	 */
	protected String v3_3 = V3_3_EDEFAULT;
	/**
	 * The default value of the '{@link #getV1_0() <em>V1 0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1_0()
	 * @generated
	 * @ordered
	 */
	protected static final String V1_0_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getV1_0() <em>V1 0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1_0()
	 * @generated
	 * @ordered
	 */
	protected String v1_0 = V1_0_EDEFAULT;
	/**
	 * The default value of the '{@link #getVccMain() <em>Vcc Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVccMain()
	 * @generated
	 * @ordered
	 */
	protected static final String VCC_MAIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVccMain() <em>Vcc Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVccMain()
	 * @generated
	 * @ordered
	 */
	protected String vccMain = VCC_MAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZTXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.ZTX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV3_3() {
		return v3_3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV3_3(String newV3_3) {
		String oldV3_3 = v3_3;
		v3_3 = newV3_3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZTX__V3_3, oldV3_3, v3_3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV1_0() {
		return v1_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV1_0(String newV1_0) {
		String oldV1_0 = v1_0;
		v1_0 = newV1_0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZTX__V1_0, oldV1_0, v1_0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVccMain() {
		return vccMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVccMain(String newVccMain) {
		String oldVccMain = vccMain;
		vccMain = newVccMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZTX__VCC_MAIN, oldVccMain, vccMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.ZTX__V3_3:
				return getV3_3();
			case Bitforcev2Package.ZTX__V1_0:
				return getV1_0();
			case Bitforcev2Package.ZTX__VCC_MAIN:
				return getVccMain();
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
			case Bitforcev2Package.ZTX__V3_3:
				setV3_3((String)newValue);
				return;
			case Bitforcev2Package.ZTX__V1_0:
				setV1_0((String)newValue);
				return;
			case Bitforcev2Package.ZTX__VCC_MAIN:
				setVccMain((String)newValue);
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
			case Bitforcev2Package.ZTX__V3_3:
				setV3_3(V3_3_EDEFAULT);
				return;
			case Bitforcev2Package.ZTX__V1_0:
				setV1_0(V1_0_EDEFAULT);
				return;
			case Bitforcev2Package.ZTX__VCC_MAIN:
				setVccMain(VCC_MAIN_EDEFAULT);
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
			case Bitforcev2Package.ZTX__V3_3:
				return V3_3_EDEFAULT == null ? v3_3 != null : !V3_3_EDEFAULT.equals(v3_3);
			case Bitforcev2Package.ZTX__V1_0:
				return V1_0_EDEFAULT == null ? v1_0 != null : !V1_0_EDEFAULT.equals(v1_0);
			case Bitforcev2Package.ZTX__VCC_MAIN:
				return VCC_MAIN_EDEFAULT == null ? vccMain != null : !VCC_MAIN_EDEFAULT.equals(vccMain);
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
		result.append(" (v3_3: ");
		result.append(v3_3);
		result.append(", v1_0: ");
		result.append(v1_0);
		result.append(", vccMain: ");
		result.append(vccMain);
		result.append(')');
		return result.toString();
	}

} //ZTXImpl
