/**
 */
package net.sf.smbt.btc.mtgox.impl;

import net.sf.smbt.btc.mtgox.*;
import net.sf.smbt.btc.mtgox.CompactValue;
import net.sf.smbt.btc.mtgox.CurrencyWalletData;
import net.sf.smbt.btc.mtgox.DepthStatus;
import net.sf.smbt.btc.mtgox.DepthValue;
import net.sf.smbt.btc.mtgox.FetchKind;
import net.sf.smbt.btc.mtgox.FetchValue;
import net.sf.smbt.btc.mtgox.Fundamentals;
import net.sf.smbt.btc.mtgox.Link;
import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.btc.mtgox.MTGoxCmd;
import net.sf.smbt.btc.mtgox.MtgoxFactory;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.btc.mtgox.Order;
import net.sf.smbt.btc.mtgox.Wallet;
import net.sf.smbt.btc.mtgox.WalletRecord;
import net.sf.smbt.btc.mtgox.WalletRight;
import net.sf.smbt.btc.mtgox.WithdrawInfo;

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
public class MtgoxFactoryImpl extends EFactoryImpl implements MtgoxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MtgoxFactory init() {
		try {
			MtgoxFactory theMtgoxFactory = (MtgoxFactory)EPackage.Registry.INSTANCE.getEFactory("http://mtgox/1.0"); 
			if (theMtgoxFactory != null) {
				return theMtgoxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MtgoxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtgoxFactoryImpl() {
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
			case MtgoxPackage.MT_GOX: return createMTGox();
			case MtgoxPackage.MT_GOX_CMD: return createMTGoxCmd();
			case MtgoxPackage.COMPACT_VALUE: return createCompactValue();
			case MtgoxPackage.FUNDAMENTALS: return createFundamentals();
			case MtgoxPackage.FETCH_VALUE: return createFetchValue();
			case MtgoxPackage.DEPTH_VALUE: return createDepthValue();
			case MtgoxPackage.WALLET: return createWallet();
			case MtgoxPackage.WALLET_RECORD: return createWalletRecord();
			case MtgoxPackage.LINK: return createLink();
			case MtgoxPackage.ORDER: return createOrder();
			case MtgoxPackage.CURRENCY_WALLET_DATA: return createCurrencyWalletData();
			case MtgoxPackage.WITHDRAW_INFO: return createWithdrawInfo();
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
			case MtgoxPackage.FETCH_KIND:
				return createFetchKindFromString(eDataType, initialValue);
			case MtgoxPackage.WALLET_RIGHT:
				return createWalletRightFromString(eDataType, initialValue);
			case MtgoxPackage.DEPTH_STATUS:
				return createDepthStatusFromString(eDataType, initialValue);
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
			case MtgoxPackage.FETCH_KIND:
				return convertFetchKindToString(eDataType, instanceValue);
			case MtgoxPackage.WALLET_RIGHT:
				return convertWalletRightToString(eDataType, instanceValue);
			case MtgoxPackage.DEPTH_STATUS:
				return convertDepthStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTGox createMTGox() {
		MTGoxImpl mtGox = new MTGoxImpl();
		return mtGox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTGoxCmd createMTGoxCmd() {
		MTGoxCmdImpl mtGoxCmd = new MTGoxCmdImpl();
		return mtGoxCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue createCompactValue() {
		CompactValueImpl compactValue = new CompactValueImpl();
		return compactValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fundamentals createFundamentals() {
		FundamentalsImpl fundamentals = new FundamentalsImpl();
		return fundamentals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchValue createFetchValue() {
		FetchValueImpl fetchValue = new FetchValueImpl();
		return fetchValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepthValue createDepthValue() {
		DepthValueImpl depthValue = new DepthValueImpl();
		return depthValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wallet createWallet() {
		WalletImpl wallet = new WalletImpl();
		return wallet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WalletRecord createWalletRecord() {
		WalletRecordImpl walletRecord = new WalletRecordImpl();
		return walletRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyWalletData createCurrencyWalletData() {
		CurrencyWalletDataImpl currencyWalletData = new CurrencyWalletDataImpl();
		return currencyWalletData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithdrawInfo createWithdrawInfo() {
		WithdrawInfoImpl withdrawInfo = new WithdrawInfoImpl();
		return withdrawInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchKind createFetchKindFromString(EDataType eDataType, String initialValue) {
		FetchKind result = FetchKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WalletRight createWalletRightFromString(EDataType eDataType, String initialValue) {
		WalletRight result = WalletRight.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWalletRightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepthStatus createDepthStatusFromString(EDataType eDataType, String initialValue) {
		DepthStatus result = DepthStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDepthStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtgoxPackage getMtgoxPackage() {
		return (MtgoxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MtgoxPackage getPackage() {
		return MtgoxPackage.eINSTANCE;
	}

} //MtgoxFactoryImpl
