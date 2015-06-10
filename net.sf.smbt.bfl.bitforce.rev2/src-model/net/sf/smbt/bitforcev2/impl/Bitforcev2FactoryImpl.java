/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.BFLCmd;
import net.sf.smbt.bitforcev2.BFLCmdKind;
import net.sf.smbt.bitforcev2.Bitforcev2Factory;
import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.ERR;
import net.sf.smbt.bitforcev2.JobResultsKnd;
import net.sf.smbt.bitforcev2.KO;
import net.sf.smbt.bitforcev2.MSG;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bitforcev2FactoryImpl extends EFactoryImpl implements Bitforcev2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bitforcev2Factory init() {
		try {
			Bitforcev2Factory theBitforcev2Factory = (Bitforcev2Factory)EPackage.Registry.INSTANCE.getEFactory("http://bitforcev2/1.0"); 
			if (theBitforcev2Factory != null) {
				return theBitforcev2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bitforcev2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bitforcev2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Bitforcev2Package.BFL_CMD: return createBFLCmd();
			case Bitforcev2Package.ZGX: return createZGX();
			case Bitforcev2Package.ZCX: return createZCX();
			case Bitforcev2Package.ZMX: return createZMX();
			case Bitforcev2Package.ZTX: return createZTX();
			case Bitforcev2Package.ZLX: return createZLX();
			case Bitforcev2Package.ZJX: return createZJX();
			case Bitforcev2Package.ZFX: return createZFX();
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB: return createZDXFullRangeJob();
			case Bitforcev2Package.ZPX_CUSTOM_RANGE_JOB: return createZPXCustomRangeJob();
			case Bitforcev2Package.ZNX: return createZNX();
			case Bitforcev2Package.ZOX: return createZOX();
			case Bitforcev2Package.ZQX: return createZQX();
			case Bitforcev2Package.OK: return createOK();
			case Bitforcev2Package.KO: return createKO();
			case Bitforcev2Package.ZDX: return createZDX();
			case Bitforcev2Package.ZPX: return createZPX();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Bitforcev2Package.BFL_CMD_KIND:
				return createBFLCmdKindFromString(eDataType, initialValue);
			case Bitforcev2Package.JOB_RESULTS_KND:
				return createJobResultsKndFromString(eDataType, initialValue);
			case Bitforcev2Package.ERR:
				return createERRFromString(eDataType, initialValue);
			case Bitforcev2Package.MSG:
				return createMSGFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Bitforcev2Package.BFL_CMD_KIND:
				return convertBFLCmdKindToString(eDataType, instanceValue);
			case Bitforcev2Package.JOB_RESULTS_KND:
				return convertJobResultsKndToString(eDataType, instanceValue);
			case Bitforcev2Package.ERR:
				return convertERRToString(eDataType, instanceValue);
			case Bitforcev2Package.MSG:
				return convertMSGToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFLCmd createBFLCmd() {
		BFLCmdImpl bflCmd = new BFLCmdImpl();
		return bflCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZGX createZGX() {
		ZGXImpl zgx = new ZGXImpl();
		return zgx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZCX createZCX() {
		ZCXImpl zcx = new ZCXImpl();
		return zcx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZMX createZMX() {
		ZMXImpl zmx = new ZMXImpl();
		return zmx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZTX createZTX() {
		ZTXImpl ztx = new ZTXImpl();
		return ztx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZLX createZLX() {
		ZLXImpl zlx = new ZLXImpl();
		return zlx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZJX createZJX() {
		ZJXImpl zjx = new ZJXImpl();
		return zjx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZFX createZFX() {
		ZFXImpl zfx = new ZFXImpl();
		return zfx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZDXFullRangeJob createZDXFullRangeJob() {
		ZDXFullRangeJobImpl zdxFullRangeJob = new ZDXFullRangeJobImpl();
		return zdxFullRangeJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZPXCustomRangeJob createZPXCustomRangeJob() {
		ZPXCustomRangeJobImpl zpxCustomRangeJob = new ZPXCustomRangeJobImpl();
		return zpxCustomRangeJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZDX createZDX() {
		ZDXImpl zdx = new ZDXImpl();
		return zdx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZPX createZPX() {
		ZPXImpl zpx = new ZPXImpl();
		return zpx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZNX createZNX() {
		ZNXImpl znx = new ZNXImpl();
		return znx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZOX createZOX() {
		ZOXImpl zox = new ZOXImpl();
		return zox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZQX createZQX() {
		ZQXImpl zqx = new ZQXImpl();
		return zqx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OK createOK() {
		OKImpl ok = new OKImpl();
		return ok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KO createKO() {
		KOImpl ko = new KOImpl();
		return ko;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFLCmdKind createBFLCmdKindFromString(EDataType eDataType, String initialValue) {
		BFLCmdKind result = BFLCmdKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBFLCmdKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobResultsKnd createJobResultsKndFromString(EDataType eDataType, String initialValue) {
		JobResultsKnd result = JobResultsKnd.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobResultsKndToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERR createERRFromString(EDataType eDataType, String initialValue) {
		ERR result = ERR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERRToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSG createMSGFromString(EDataType eDataType, String initialValue) {
		MSG result = MSG.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMSGToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bitforcev2Package getBitforcev2Package() {
		return (Bitforcev2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bitforcev2Package getPackage() {
		return Bitforcev2Package.eINSTANCE;
	}

} //Bitforcev2FactoryImpl
