/**
 */
package net.sf.smbt.btc.pools.getwork.impl;

import java.util.Collection;

import net.sf.smbt.btc.pools.getwork.GetworkPackage;
import net.sf.smbt.btc.pools.getwork.WorkStateTmp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work State Tmp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.getwork.impl.WorkStateTmpImpl#getMidStates <em>Mid States</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.getwork.impl.WorkStateTmpImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.getwork.impl.WorkStateTmpImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkStateTmpImpl extends MinimalEObjectImpl.Container implements WorkStateTmp {
	/**
	 * The cached value of the '{@link #getMidStates() <em>Mid States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> midStates;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> targets;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkStateTmpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GetworkPackage.Literals.WORK_STATE_TMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMidStates() {
		if (midStates == null) {
			midStates = new EDataTypeEList<Integer>(Integer.class, this, GetworkPackage.WORK_STATE_TMP__MID_STATES);
		}
		return midStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getTargets() {
		if (targets == null) {
			targets = new EDataTypeEList<Long>(Long.class, this, GetworkPackage.WORK_STATE_TMP__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getData() {
		if (data == null) {
			data = new EDataTypeEList<Integer>(Integer.class, this, GetworkPackage.WORK_STATE_TMP__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GetworkPackage.WORK_STATE_TMP__MID_STATES:
				return getMidStates();
			case GetworkPackage.WORK_STATE_TMP__TARGETS:
				return getTargets();
			case GetworkPackage.WORK_STATE_TMP__DATA:
				return getData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GetworkPackage.WORK_STATE_TMP__MID_STATES:
				getMidStates().clear();
				getMidStates().addAll((Collection<? extends Integer>)newValue);
				return;
			case GetworkPackage.WORK_STATE_TMP__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Long>)newValue);
				return;
			case GetworkPackage.WORK_STATE_TMP__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Integer>)newValue);
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
			case GetworkPackage.WORK_STATE_TMP__MID_STATES:
				getMidStates().clear();
				return;
			case GetworkPackage.WORK_STATE_TMP__TARGETS:
				getTargets().clear();
				return;
			case GetworkPackage.WORK_STATE_TMP__DATA:
				getData().clear();
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
			case GetworkPackage.WORK_STATE_TMP__MID_STATES:
				return midStates != null && !midStates.isEmpty();
			case GetworkPackage.WORK_STATE_TMP__TARGETS:
				return targets != null && !targets.isEmpty();
			case GetworkPackage.WORK_STATE_TMP__DATA:
				return data != null && !data.isEmpty();
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
		result.append(" (midStates: ");
		result.append(midStates);
		result.append(", targets: ");
		result.append(targets);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //WorkStateTmpImpl
