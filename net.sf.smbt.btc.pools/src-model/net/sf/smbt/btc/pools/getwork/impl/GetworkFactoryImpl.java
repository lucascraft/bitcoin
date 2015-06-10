/**
 */
package net.sf.smbt.btc.pools.getwork.impl;

import net.sf.smbt.btc.pools.getwork.GetworkCmd;
import net.sf.smbt.btc.pools.getwork.GetworkFactory;
import net.sf.smbt.btc.pools.getwork.GetworkPackage;
import net.sf.smbt.btc.pools.getwork.WorkStateTmp;

import org.eclipse.emf.ecore.EClass;
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
public class GetworkFactoryImpl extends EFactoryImpl implements GetworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GetworkFactory init() {
		try {
			GetworkFactory theGetworkFactory = (GetworkFactory)EPackage.Registry.INSTANCE.getEFactory("http://getwork/1.0"); 
			if (theGetworkFactory != null) {
				return theGetworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GetworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetworkFactoryImpl() {
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
			case GetworkPackage.GETWORK_CMD: return createGetworkCmd();
			case GetworkPackage.WORK_STATE_TMP: return createWorkStateTmp();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetworkCmd createGetworkCmd() {
		GetworkCmdImpl getworkCmd = new GetworkCmdImpl();
		return getworkCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkStateTmp createWorkStateTmp() {
		WorkStateTmpImpl workStateTmp = new WorkStateTmpImpl();
		return workStateTmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetworkPackage getGetworkPackage() {
		return (GetworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GetworkPackage getPackage() {
		return GetworkPackage.eINSTANCE;
	}

} //GetworkFactoryImpl
