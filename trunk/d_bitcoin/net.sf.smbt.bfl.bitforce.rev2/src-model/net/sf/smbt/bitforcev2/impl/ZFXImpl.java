/**
 */
package net.sf.smbt.bitforcev2.impl;

import java.util.Collection;

import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.JobResultsKnd;
import net.sf.smbt.bitforcev2.ZFX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZFX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZFXImpl#getResultKind <em>Result Kind</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZFXImpl#getNonces <em>Nonces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZFXImpl extends BFLCmdImpl implements ZFX {
	/**
	 * The default value of the '{@link #getResultKind() <em>Result Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultKind()
	 * @generated
	 * @ordered
	 */
	protected static final JobResultsKnd RESULT_KIND_EDEFAULT = JobResultsKnd.BUSY;
	/**
	 * The cached value of the '{@link #getResultKind() <em>Result Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultKind()
	 * @generated
	 * @ordered
	 */
	protected JobResultsKnd resultKind = RESULT_KIND_EDEFAULT;
	/**
	 * The cached value of the '{@link #getNonces() <em>Nonces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nonces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.ZFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobResultsKnd getResultKind() {
		return resultKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultKind(JobResultsKnd newResultKind) {
		JobResultsKnd oldResultKind = resultKind;
		resultKind = newResultKind == null ? RESULT_KIND_EDEFAULT : newResultKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZFX__RESULT_KIND, oldResultKind, resultKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNonces() {
		if (nonces == null) {
			nonces = new EDataTypeUniqueEList<String>(String.class, this, Bitforcev2Package.ZFX__NONCES);
		}
		return nonces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.ZFX__RESULT_KIND:
				return getResultKind();
			case Bitforcev2Package.ZFX__NONCES:
				return getNonces();
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
			case Bitforcev2Package.ZFX__RESULT_KIND:
				setResultKind((JobResultsKnd)newValue);
				return;
			case Bitforcev2Package.ZFX__NONCES:
				getNonces().clear();
				getNonces().addAll((Collection<? extends String>)newValue);
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
			case Bitforcev2Package.ZFX__RESULT_KIND:
				setResultKind(RESULT_KIND_EDEFAULT);
				return;
			case Bitforcev2Package.ZFX__NONCES:
				getNonces().clear();
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
			case Bitforcev2Package.ZFX__RESULT_KIND:
				return resultKind != RESULT_KIND_EDEFAULT;
			case Bitforcev2Package.ZFX__NONCES:
				return nonces != null && !nonces.isEmpty();
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
		result.append(" (resultKind: ");
		result.append(resultKind);
		result.append(", nonces: ");
		result.append(nonces);
		result.append(')');
		return result.toString();
	}

} //ZFXImpl
