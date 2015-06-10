/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiCalibrationDataReport;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Calibration Data Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl#getZeroX <em>Zero X</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl#getZeroY <em>Zero Y</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl#getZeroZ <em>Zero Z</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl#getGravityX <em>Gravity X</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl#getGravityY <em>Gravity Y</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCalibrationDataReportImpl#getGravityZ <em>Gravity Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiCalibrationDataReportImpl extends MinimalEObjectImpl.Container implements WiiCalibrationDataReport {
	/**
	 * The default value of the '{@link #getZeroX() <em>Zero X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroX()
	 * @generated
	 * @ordered
	 */
	protected static final int ZERO_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZeroX() <em>Zero X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroX()
	 * @generated
	 * @ordered
	 */
	protected int zeroX = ZERO_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeroY() <em>Zero Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroY()
	 * @generated
	 * @ordered
	 */
	protected static final int ZERO_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZeroY() <em>Zero Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroY()
	 * @generated
	 * @ordered
	 */
	protected int zeroY = ZERO_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeroZ() <em>Zero Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroZ()
	 * @generated
	 * @ordered
	 */
	protected static final int ZERO_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZeroZ() <em>Zero Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroZ()
	 * @generated
	 * @ordered
	 */
	protected int zeroZ = ZERO_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getGravityX() <em>Gravity X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravityX()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAVITY_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGravityX() <em>Gravity X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravityX()
	 * @generated
	 * @ordered
	 */
	protected int gravityX = GRAVITY_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getGravityY() <em>Gravity Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravityY()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAVITY_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGravityY() <em>Gravity Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravityY()
	 * @generated
	 * @ordered
	 */
	protected int gravityY = GRAVITY_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getGravityZ() <em>Gravity Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravityZ()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAVITY_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGravityZ() <em>Gravity Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravityZ()
	 * @generated
	 * @ordered
	 */
	protected int gravityZ = GRAVITY_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiCalibrationDataReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_CALIBRATION_DATA_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZeroX() {
		return zeroX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroX(int newZeroX) {
		int oldZeroX = zeroX;
		zeroX = newZeroX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_X, oldZeroX, zeroX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZeroY() {
		return zeroY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroY(int newZeroY) {
		int oldZeroY = zeroY;
		zeroY = newZeroY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Y, oldZeroY, zeroY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZeroZ() {
		return zeroZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroZ(int newZeroZ) {
		int oldZeroZ = zeroZ;
		zeroZ = newZeroZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Z, oldZeroZ, zeroZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGravityX() {
		return gravityX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGravityX(int newGravityX) {
		int oldGravityX = gravityX;
		gravityX = newGravityX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_X, oldGravityX, gravityX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGravityY() {
		return gravityY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGravityY(int newGravityY) {
		int oldGravityY = gravityY;
		gravityY = newGravityY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Y, oldGravityY, gravityY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGravityZ() {
		return gravityZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGravityZ(int newGravityZ) {
		int oldGravityZ = gravityZ;
		gravityZ = newGravityZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Z, oldGravityZ, gravityZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_X:
				return getZeroX();
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Y:
				return getZeroY();
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Z:
				return getZeroZ();
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_X:
				return getGravityX();
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Y:
				return getGravityY();
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Z:
				return getGravityZ();
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
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_X:
				setZeroX((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Y:
				setZeroY((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Z:
				setZeroZ((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_X:
				setGravityX((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Y:
				setGravityY((Integer)newValue);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Z:
				setGravityZ((Integer)newValue);
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
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_X:
				setZeroX(ZERO_X_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Y:
				setZeroY(ZERO_Y_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Z:
				setZeroZ(ZERO_Z_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_X:
				setGravityX(GRAVITY_X_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Y:
				setGravityY(GRAVITY_Y_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Z:
				setGravityZ(GRAVITY_Z_EDEFAULT);
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
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_X:
				return zeroX != ZERO_X_EDEFAULT;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Y:
				return zeroY != ZERO_Y_EDEFAULT;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__ZERO_Z:
				return zeroZ != ZERO_Z_EDEFAULT;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_X:
				return gravityX != GRAVITY_X_EDEFAULT;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Y:
				return gravityY != GRAVITY_Y_EDEFAULT;
			case EzwiimotePackage.WII_CALIBRATION_DATA_REPORT__GRAVITY_Z:
				return gravityZ != GRAVITY_Z_EDEFAULT;
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
		result.append(" (zeroX: ");
		result.append(zeroX);
		result.append(", zeroY: ");
		result.append(zeroY);
		result.append(", zeroZ: ");
		result.append(zeroZ);
		result.append(", gravityX: ");
		result.append(gravityX);
		result.append(", gravityY: ");
		result.append(gravityY);
		result.append(", gravityZ: ");
		result.append(gravityZ);
		result.append(')');
		return result.toString();
	}

} //WiiCalibrationDataReportImpl
