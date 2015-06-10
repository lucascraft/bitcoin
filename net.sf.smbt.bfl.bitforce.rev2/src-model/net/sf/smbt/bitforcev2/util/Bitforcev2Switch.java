/**
 */
package net.sf.smbt.bitforcev2.util;

import net.sf.smbt.bitforcev2.BFLCmd;
import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.KO;
import net.sf.smbt.bitforcev2.OK;
import net.sf.smbt.bitforcev2.ZCX;
import net.sf.smbt.bitforcev2.ZDX;
import net.sf.smbt.bitforcev2.ZDXFullRangeJob;
import net.sf.smbt.bitforcev2.ZFX;
import net.sf.smbt.bitforcev2.ZGX;
import net.sf.smbt.bitforcev2.ZJX;
import net.sf.smbt.bitforcev2.ZLX;
import net.sf.smbt.bitforcev2.ZMX;
import net.sf.smbt.bitforcev2.ZNX;
import net.sf.smbt.bitforcev2.ZOX;
import net.sf.smbt.bitforcev2.ZPX;
import net.sf.smbt.bitforcev2.ZPXCustomRangeJob;
import net.sf.smbt.bitforcev2.ZQX;
import net.sf.smbt.bitforcev2.ZTX;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package
 * @generated
 */
public class Bitforcev2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bitforcev2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bitforcev2Switch() {
		if (modelPackage == null) {
			modelPackage = Bitforcev2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Bitforcev2Package.BFL_CMD: {
				BFLCmd bflCmd = (BFLCmd)theEObject;
				T result = caseBFLCmd(bflCmd);
				if (result == null) result = caseCmd(bflCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZGX: {
				ZGX zgx = (ZGX)theEObject;
				T result = caseZGX(zgx);
				if (result == null) result = caseBFLCmd(zgx);
				if (result == null) result = caseCmd(zgx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZCX: {
				ZCX zcx = (ZCX)theEObject;
				T result = caseZCX(zcx);
				if (result == null) result = caseBFLCmd(zcx);
				if (result == null) result = caseCmd(zcx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZMX: {
				ZMX zmx = (ZMX)theEObject;
				T result = caseZMX(zmx);
				if (result == null) result = caseBFLCmd(zmx);
				if (result == null) result = caseCmd(zmx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZTX: {
				ZTX ztx = (ZTX)theEObject;
				T result = caseZTX(ztx);
				if (result == null) result = caseBFLCmd(ztx);
				if (result == null) result = caseCmd(ztx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZLX: {
				ZLX zlx = (ZLX)theEObject;
				T result = caseZLX(zlx);
				if (result == null) result = caseBFLCmd(zlx);
				if (result == null) result = caseCmd(zlx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZJX: {
				ZJX zjx = (ZJX)theEObject;
				T result = caseZJX(zjx);
				if (result == null) result = caseBFLCmd(zjx);
				if (result == null) result = caseCmd(zjx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZFX: {
				ZFX zfx = (ZFX)theEObject;
				T result = caseZFX(zfx);
				if (result == null) result = caseBFLCmd(zfx);
				if (result == null) result = caseCmd(zfx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB: {
				ZDXFullRangeJob zdxFullRangeJob = (ZDXFullRangeJob)theEObject;
				T result = caseZDXFullRangeJob(zdxFullRangeJob);
				if (result == null) result = caseBFLCmd(zdxFullRangeJob);
				if (result == null) result = caseCmd(zdxFullRangeJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZPX_CUSTOM_RANGE_JOB: {
				ZPXCustomRangeJob zpxCustomRangeJob = (ZPXCustomRangeJob)theEObject;
				T result = caseZPXCustomRangeJob(zpxCustomRangeJob);
				if (result == null) result = caseBFLCmd(zpxCustomRangeJob);
				if (result == null) result = caseCmd(zpxCustomRangeJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZNX: {
				ZNX znx = (ZNX)theEObject;
				T result = caseZNX(znx);
				if (result == null) result = caseBFLCmd(znx);
				if (result == null) result = caseCmd(znx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZOX: {
				ZOX zox = (ZOX)theEObject;
				T result = caseZOX(zox);
				if (result == null) result = caseBFLCmd(zox);
				if (result == null) result = caseCmd(zox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZQX: {
				ZQX zqx = (ZQX)theEObject;
				T result = caseZQX(zqx);
				if (result == null) result = caseBFLCmd(zqx);
				if (result == null) result = caseCmd(zqx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.OK: {
				OK ok = (OK)theEObject;
				T result = caseOK(ok);
				if (result == null) result = caseBFLCmd(ok);
				if (result == null) result = caseCmd(ok);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.KO: {
				KO ko = (KO)theEObject;
				T result = caseKO(ko);
				if (result == null) result = caseBFLCmd(ko);
				if (result == null) result = caseCmd(ko);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZDX: {
				ZDX zdx = (ZDX)theEObject;
				T result = caseZDX(zdx);
				if (result == null) result = caseBFLCmd(zdx);
				if (result == null) result = caseCmd(zdx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Bitforcev2Package.ZPX: {
				ZPX zpx = (ZPX)theEObject;
				T result = caseZPX(zpx);
				if (result == null) result = caseBFLCmd(zpx);
				if (result == null) result = caseCmd(zpx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFL Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFL Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFLCmd(BFLCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZGX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZGX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZGX(ZGX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZCX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZCX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZCX(ZCX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZMX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZMX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZMX(ZMX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZTX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZTX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZTX(ZTX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZLX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZLX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZLX(ZLX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZJX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZJX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZJX(ZJX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZFX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZFX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZFX(ZFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZDX Full Range Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZDX Full Range Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZDXFullRangeJob(ZDXFullRangeJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZPX Custom Range Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZPX Custom Range Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZPXCustomRangeJob(ZPXCustomRangeJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZDX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZDX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZDX(ZDX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZPX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZPX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZPX(ZPX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZNX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZNX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZNX(ZNX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZOX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZOX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZOX(ZOX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZQX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZQX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZQX(ZQX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOK(OK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKO(KO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Bitforcev2Switch
