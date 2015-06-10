/**
 */
package net.sf.smbt.btc.genericpools.impl;

import net.sf.smbt.btc.genericpools.AsicBatchWork;
import net.sf.smbt.btc.genericpools.GenericpoolsPackage;
import net.sf.smbt.btc.pools.utils.getwork.miner.WorkState;
import net.sf.smbt.xcp.XCPAddress;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asic Batch Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.AsicBatchWorkImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.impl.AsicBatchWorkImpl#getAsicDevicePipe <em>Asic Device Pipe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsicBatchWorkImpl extends MinimalEObjectImpl.Container implements AsicBatchWork {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final WorkState DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected WorkState data = DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsicDevicePipe() <em>Asic Device Pipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsicDevicePipe()
	 * @generated
	 * @ordered
	 */
	protected XCPAddress asicDevicePipe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsicBatchWorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericpoolsPackage.Literals.ASIC_BATCH_WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkState getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(WorkState newData) {
		WorkState oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.ASIC_BATCH_WORK__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress getAsicDevicePipe() {
		if (asicDevicePipe != null && asicDevicePipe.eIsProxy()) {
			InternalEObject oldAsicDevicePipe = (InternalEObject)asicDevicePipe;
			asicDevicePipe = (XCPAddress)eResolveProxy(oldAsicDevicePipe);
			if (asicDevicePipe != oldAsicDevicePipe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericpoolsPackage.ASIC_BATCH_WORK__ASIC_DEVICE_PIPE, oldAsicDevicePipe, asicDevicePipe));
			}
		}
		return asicDevicePipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress basicGetAsicDevicePipe() {
		return asicDevicePipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsicDevicePipe(XCPAddress newAsicDevicePipe) {
		XCPAddress oldAsicDevicePipe = asicDevicePipe;
		asicDevicePipe = newAsicDevicePipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericpoolsPackage.ASIC_BATCH_WORK__ASIC_DEVICE_PIPE, oldAsicDevicePipe, asicDevicePipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericpoolsPackage.ASIC_BATCH_WORK__DATA:
				return getData();
			case GenericpoolsPackage.ASIC_BATCH_WORK__ASIC_DEVICE_PIPE:
				if (resolve) return getAsicDevicePipe();
				return basicGetAsicDevicePipe();
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
			case GenericpoolsPackage.ASIC_BATCH_WORK__DATA:
				setData((WorkState)newValue);
				return;
			case GenericpoolsPackage.ASIC_BATCH_WORK__ASIC_DEVICE_PIPE:
				setAsicDevicePipe((XCPAddress)newValue);
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
			case GenericpoolsPackage.ASIC_BATCH_WORK__DATA:
				setData(DATA_EDEFAULT);
				return;
			case GenericpoolsPackage.ASIC_BATCH_WORK__ASIC_DEVICE_PIPE:
				setAsicDevicePipe((XCPAddress)null);
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
			case GenericpoolsPackage.ASIC_BATCH_WORK__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case GenericpoolsPackage.ASIC_BATCH_WORK__ASIC_DEVICE_PIPE:
				return asicDevicePipe != null;
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
		result.append(" (data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //AsicBatchWorkImpl
