/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiAccelEvt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Accel Evt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiAccelEvtImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiAccelEvtImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiAccelEvtImpl#getZ <em>Z</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiAccelEvtImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiAccelEvtImpl extends WiiEvtImpl implements WiiAccelEvt {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final int Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected int z = Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final Object SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Object source = SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiAccelEvtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_ACCEL_EVT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_ACCEL_EVT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_ACCEL_EVT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(int newZ) {
		int oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_ACCEL_EVT__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Object newSource) {
		Object oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_ACCEL_EVT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_ACCEL_EVT__X:
				return getX();
			case EzwiimotePackage.WII_ACCEL_EVT__Y:
				return getY();
			case EzwiimotePackage.WII_ACCEL_EVT__Z:
				return getZ();
			case EzwiimotePackage.WII_ACCEL_EVT__SOURCE:
				return getSource();
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
			case EzwiimotePackage.WII_ACCEL_EVT__X:
				setX((Integer)newValue);
				return;
			case EzwiimotePackage.WII_ACCEL_EVT__Y:
				setY((Integer)newValue);
				return;
			case EzwiimotePackage.WII_ACCEL_EVT__Z:
				setZ((Integer)newValue);
				return;
			case EzwiimotePackage.WII_ACCEL_EVT__SOURCE:
				setSource(newValue);
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
			case EzwiimotePackage.WII_ACCEL_EVT__X:
				setX(X_EDEFAULT);
				return;
			case EzwiimotePackage.WII_ACCEL_EVT__Y:
				setY(Y_EDEFAULT);
				return;
			case EzwiimotePackage.WII_ACCEL_EVT__Z:
				setZ(Z_EDEFAULT);
				return;
			case EzwiimotePackage.WII_ACCEL_EVT__SOURCE:
				setSource(SOURCE_EDEFAULT);
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
			case EzwiimotePackage.WII_ACCEL_EVT__X:
				return x != X_EDEFAULT;
			case EzwiimotePackage.WII_ACCEL_EVT__Y:
				return y != Y_EDEFAULT;
			case EzwiimotePackage.WII_ACCEL_EVT__Z:
				return z != Z_EDEFAULT;
			case EzwiimotePackage.WII_ACCEL_EVT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //WiiAccelEvtImpl
