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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package
 * @generated
 */
public class Bitforcev2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bitforcev2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bitforcev2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Bitforcev2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bitforcev2Switch<Adapter> modelSwitch =
		new Bitforcev2Switch<Adapter>() {
			@Override
			public Adapter caseBFLCmd(BFLCmd object) {
				return createBFLCmdAdapter();
			}
			@Override
			public Adapter caseZGX(ZGX object) {
				return createZGXAdapter();
			}
			@Override
			public Adapter caseZCX(ZCX object) {
				return createZCXAdapter();
			}
			@Override
			public Adapter caseZMX(ZMX object) {
				return createZMXAdapter();
			}
			@Override
			public Adapter caseZTX(ZTX object) {
				return createZTXAdapter();
			}
			@Override
			public Adapter caseZLX(ZLX object) {
				return createZLXAdapter();
			}
			@Override
			public Adapter caseZJX(ZJX object) {
				return createZJXAdapter();
			}
			@Override
			public Adapter caseZFX(ZFX object) {
				return createZFXAdapter();
			}
			@Override
			public Adapter caseZDXFullRangeJob(ZDXFullRangeJob object) {
				return createZDXFullRangeJobAdapter();
			}
			@Override
			public Adapter caseZPXCustomRangeJob(ZPXCustomRangeJob object) {
				return createZPXCustomRangeJobAdapter();
			}
			@Override
			public Adapter caseZNX(ZNX object) {
				return createZNXAdapter();
			}
			@Override
			public Adapter caseZOX(ZOX object) {
				return createZOXAdapter();
			}
			@Override
			public Adapter caseZQX(ZQX object) {
				return createZQXAdapter();
			}
			@Override
			public Adapter caseOK(OK object) {
				return createOKAdapter();
			}
			@Override
			public Adapter caseKO(KO object) {
				return createKOAdapter();
			}
			@Override
			public Adapter caseZDX(ZDX object) {
				return createZDXAdapter();
			}
			@Override
			public Adapter caseZPX(ZPX object) {
				return createZPXAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.BFLCmd <em>BFL Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.BFLCmd
	 * @generated
	 */
	public Adapter createBFLCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZGX <em>ZGX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZGX
	 * @generated
	 */
	public Adapter createZGXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZCX <em>ZCX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZCX
	 * @generated
	 */
	public Adapter createZCXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZMX <em>ZMX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZMX
	 * @generated
	 */
	public Adapter createZMXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZTX <em>ZTX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZTX
	 * @generated
	 */
	public Adapter createZTXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZLX <em>ZLX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZLX
	 * @generated
	 */
	public Adapter createZLXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZJX <em>ZJX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZJX
	 * @generated
	 */
	public Adapter createZJXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZFX <em>ZFX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZFX
	 * @generated
	 */
	public Adapter createZFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob <em>ZDX Full Range Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZDXFullRangeJob
	 * @generated
	 */
	public Adapter createZDXFullRangeJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZPXCustomRangeJob <em>ZPX Custom Range Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZPXCustomRangeJob
	 * @generated
	 */
	public Adapter createZPXCustomRangeJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZDX <em>ZDX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZDX
	 * @generated
	 */
	public Adapter createZDXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZPX <em>ZPX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZPX
	 * @generated
	 */
	public Adapter createZPXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZNX <em>ZNX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZNX
	 * @generated
	 */
	public Adapter createZNXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZOX <em>ZOX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZOX
	 * @generated
	 */
	public Adapter createZOXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.ZQX <em>ZQX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.ZQX
	 * @generated
	 */
	public Adapter createZQXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.OK <em>OK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.OK
	 * @generated
	 */
	public Adapter createOKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.bitforcev2.KO <em>KO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.bitforcev2.KO
	 * @generated
	 */
	public Adapter createKOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Bitforcev2AdapterFactory
