/**
 */
package net.sf.smbt.btc.pools.getblocktemplate.impl;

import net.sf.smbt.btc.pools.getblocktemplate.GetBlockTemplateCmd;
import net.sf.smbt.btc.pools.getblocktemplate.GetblocktemplateFactory;
import net.sf.smbt.btc.pools.getblocktemplate.GetblocktemplatePackage;

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
public class GetblocktemplateFactoryImpl extends EFactoryImpl implements GetblocktemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GetblocktemplateFactory init() {
		try {
			GetblocktemplateFactory theGetblocktemplateFactory = (GetblocktemplateFactory)EPackage.Registry.INSTANCE.getEFactory("http://getblocktemplate/1.0"); 
			if (theGetblocktemplateFactory != null) {
				return theGetblocktemplateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GetblocktemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetblocktemplateFactoryImpl() {
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
			case GetblocktemplatePackage.GET_BLOCK_TEMPLATE_CMD: return createGetBlockTemplateCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetBlockTemplateCmd createGetBlockTemplateCmd() {
		GetBlockTemplateCmdImpl getBlockTemplateCmd = new GetBlockTemplateCmdImpl();
		return getBlockTemplateCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetblocktemplatePackage getGetblocktemplatePackage() {
		return (GetblocktemplatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GetblocktemplatePackage getPackage() {
		return GetblocktemplatePackage.eINSTANCE;
	}

} //GetblocktemplateFactoryImpl
