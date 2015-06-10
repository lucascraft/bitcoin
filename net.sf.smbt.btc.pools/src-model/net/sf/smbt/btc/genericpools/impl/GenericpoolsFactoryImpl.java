/**
 */
package net.sf.smbt.btc.genericpools.impl;

import net.sf.smbt.btc.genericpools.AsicBatchWork;
import net.sf.smbt.btc.genericpools.GenericpoolsFactory;
import net.sf.smbt.btc.genericpools.GenericpoolsPackage;
import net.sf.smbt.btc.genericpools.PoolConfig;
import net.sf.smbt.btc.genericpools.PoolsManager;
import net.sf.smbt.btc.genericpools.Setting;
import net.sf.smbt.btc.pools.utils.getwork.miner.WorkState;

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
public class GenericpoolsFactoryImpl extends EFactoryImpl implements GenericpoolsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericpoolsFactory init() {
		try {
			GenericpoolsFactory theGenericpoolsFactory = (GenericpoolsFactory)EPackage.Registry.INSTANCE.getEFactory("http://genericpools/1.0"); 
			if (theGenericpoolsFactory != null) {
				return theGenericpoolsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericpoolsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericpoolsFactoryImpl() {
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
			case GenericpoolsPackage.POOL_CONFIG: return createPoolConfig();
			case GenericpoolsPackage.SETTING: return createSetting();
			case GenericpoolsPackage.POOLS_MANAGER: return createPoolsManager();
			case GenericpoolsPackage.ASIC_BATCH_WORK: return createAsicBatchWork();
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
			case GenericpoolsPackage.WORK_STATE:
				return createWorkStateFromString(eDataType, initialValue);
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
			case GenericpoolsPackage.WORK_STATE:
				return convertWorkStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolConfig createPoolConfig() {
		PoolConfigImpl poolConfig = new PoolConfigImpl();
		return poolConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setting createSetting() {
		SettingImpl setting = new SettingImpl();
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolsManager createPoolsManager() {
		PoolsManagerImpl poolsManager = new PoolsManagerImpl();
		return poolsManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsicBatchWork createAsicBatchWork() {
		AsicBatchWorkImpl asicBatchWork = new AsicBatchWorkImpl();
		return asicBatchWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkState createWorkStateFromString(EDataType eDataType, String initialValue) {
		return (WorkState)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkStateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericpoolsPackage getGenericpoolsPackage() {
		return (GenericpoolsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericpoolsPackage getPackage() {
		return GenericpoolsPackage.eINSTANCE;
	}

} //GenericpoolsFactoryImpl
