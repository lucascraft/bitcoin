/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.ZGX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZGX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZGXImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZGXImpl#getMinor <em>Minor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZGXImpl extends BFLCmdImpl implements ZGX {
	/**
	 * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected static final int MAJOR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected int major = MAJOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected static final int MINOR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected int minor = MINOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZGXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.ZGX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMajor() {
		return major;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajor(int newMajor) {
		int oldMajor = major;
		major = newMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZGX__MAJOR, oldMajor, major));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinor() {
		return minor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinor(int newMinor) {
		int oldMinor = minor;
		minor = newMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZGX__MINOR, oldMinor, minor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.ZGX__MAJOR:
				return getMajor();
			case Bitforcev2Package.ZGX__MINOR:
				return getMinor();
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
			case Bitforcev2Package.ZGX__MAJOR:
				setMajor((Integer)newValue);
				return;
			case Bitforcev2Package.ZGX__MINOR:
				setMinor((Integer)newValue);
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
			case Bitforcev2Package.ZGX__MAJOR:
				setMajor(MAJOR_EDEFAULT);
				return;
			case Bitforcev2Package.ZGX__MINOR:
				setMinor(MINOR_EDEFAULT);
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
			case Bitforcev2Package.ZGX__MAJOR:
				return major != MAJOR_EDEFAULT;
			case Bitforcev2Package.ZGX__MINOR:
				return minor != MINOR_EDEFAULT;
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
		result.append(" (major: ");
		result.append(major);
		result.append(", minor: ");
		result.append(minor);
		result.append(')');
		return result.toString();
	}

} //ZGXImpl
