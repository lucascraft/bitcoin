/**
 */
package net.sf.smbt.btc.mtgox.impl;

import net.sf.smbt.btc.BtcPackage;
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
import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtgoxPackageImpl extends EPackageImpl implements MtgoxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtGoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtGoxCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compactValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fundamentalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fetchValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass walletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass walletRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyWalletDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withdrawInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum walletRightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum depthStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MtgoxPackageImpl() {
		super(eNS_URI, MtgoxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MtgoxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MtgoxPackage init() {
		if (isInited) return (MtgoxPackage)EPackage.Registry.INSTANCE.getEPackage(MtgoxPackage.eNS_URI);

		// Obtain or create and register package
		MtgoxPackageImpl theMtgoxPackage = (MtgoxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MtgoxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MtgoxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BtcPackage.eINSTANCE.eClass();
		HttpcmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMtgoxPackage.createPackageContents();

		// Initialize created meta-data
		theMtgoxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMtgoxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MtgoxPackage.eNS_URI, theMtgoxPackage);
		return theMtgoxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTGox() {
		return mtGoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGox_Login() {
		return (EAttribute)mtGoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGox_Password() {
		return (EAttribute)mtGoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGox_ApiKey() {
		return (EAttribute)mtGoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_Market() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGox_Currency() {
		return (EAttribute)mtGoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGox_FeeRate() {
		return (EAttribute)mtGoxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_HighV() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_LowV() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_SellV() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_BuyV() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_LastV() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_VolumeV() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_Trend() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_Fetchs() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_Wallet() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_Sales() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGox_SocketioConnected() {
		return (EAttribute)mtGoxEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_Bids() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMTGox_Asks() {
		return (EReference)mtGoxEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTGoxCmd() {
		return mtGoxCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGoxCmd_JsonSnd() {
		return (EAttribute)mtGoxCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGoxCmd_JsonRcv() {
		return (EAttribute)mtGoxCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMTGoxCmd_Query() {
		return (EAttribute)mtGoxCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompactValue() {
		return compactValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactValue_Value() {
		return (EAttribute)compactValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactValue_Value_int() {
		return (EAttribute)compactValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactValue_Display() {
		return (EAttribute)compactValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactValue_Display_short() {
		return (EAttribute)compactValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactValue_Currency() {
		return (EAttribute)compactValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFundamentals() {
		return fundamentalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFundamentals_High() {
		return (EAttribute)fundamentalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFundamentals_Low() {
		return (EAttribute)fundamentalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFundamentals_Buy() {
		return (EAttribute)fundamentalsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFundamentals_Sell() {
		return (EAttribute)fundamentalsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFundamentals_Last() {
		return (EAttribute)fundamentalsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFundamentals_Average() {
		return (EAttribute)fundamentalsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFetchValue() {
		return fetchValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_Stamp() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_Price() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_Amount() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_PriceInt() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_AmountInt() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_Tid() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_Currency() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_Item() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_TradeType() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_Primary() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFetchValue_Properties() {
		return (EAttribute)fetchValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepthValue() {
		return depthValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_Price() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_PriceInt() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_Amount() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_AmountInt() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_Stamp() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_Kind() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_Sum() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_Currency() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_Status() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_LastLocalStatus() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_Volume() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepthValue_VolumeInt() {
		return (EAttribute)depthValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallet() {
		return walletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_BitcoinAddr() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallet_Records() {
		return (EReference)walletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallet_Orders() {
		return (EReference)walletEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallet_Balance() {
		return (EReference)walletEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_Login() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_Created() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_LastLogin() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_Id() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_Index() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_TradeFee() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_MonthlyVolume() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallet_Rights() {
		return (EAttribute)walletEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallet_BtcInfo() {
		return (EReference)walletEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallet_EurInfo() {
		return (EReference)walletEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallet_UsdInfo() {
		return (EReference)walletEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWalletRecord() {
		return walletRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWalletRecord_Index() {
		return (EAttribute)walletRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWalletRecord_Date() {
		return (EAttribute)walletRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWalletRecord_Type() {
		return (EAttribute)walletRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWalletRecord_Value() {
		return (EReference)walletRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWalletRecord_Balance() {
		return (EReference)walletRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWalletRecord_Info() {
		return (EAttribute)walletRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWalletRecord_Links() {
		return (EReference)walletRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Addr() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Oid() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Currency() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Item() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Type() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Amount() {
		return (EReference)orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Price() {
		return (EReference)orderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Status() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Date() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Priority() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyWalletData() {
		return currencyWalletDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyWalletData_Currency() {
		return (EAttribute)currencyWalletDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyWalletData_Balance() {
		return (EReference)currencyWalletDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyWalletData_Operations() {
		return (EAttribute)currencyWalletDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyWalletData_MaxWithdrawLimit() {
		return (EReference)currencyWalletDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyWalletData_Orders() {
		return (EReference)currencyWalletDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyWalletData_MonthlyLimit() {
		return (EReference)currencyWalletDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyWalletData_DailyLimit() {
		return (EReference)currencyWalletDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithdrawInfo() {
		return withdrawInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithdrawInfo_Value() {
		return (EAttribute)withdrawInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithdrawInfo_Value_int() {
		return (EAttribute)withdrawInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithdrawInfo_Display() {
		return (EAttribute)withdrawInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithdrawInfo_Display_short() {
		return (EAttribute)withdrawInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithdrawInfo_Currency() {
		return (EAttribute)withdrawInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetchKind() {
		return fetchKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWalletRight() {
		return walletRightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDepthStatus() {
		return depthStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtgoxFactory getMtgoxFactory() {
		return (MtgoxFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mtGoxEClass = createEClass(MT_GOX);
		createEAttribute(mtGoxEClass, MT_GOX__LOGIN);
		createEAttribute(mtGoxEClass, MT_GOX__PASSWORD);
		createEAttribute(mtGoxEClass, MT_GOX__API_KEY);
		createEReference(mtGoxEClass, MT_GOX__MARKET);
		createEAttribute(mtGoxEClass, MT_GOX__CURRENCY);
		createEAttribute(mtGoxEClass, MT_GOX__FEE_RATE);
		createEReference(mtGoxEClass, MT_GOX__HIGH_V);
		createEReference(mtGoxEClass, MT_GOX__LOW_V);
		createEReference(mtGoxEClass, MT_GOX__SELL_V);
		createEReference(mtGoxEClass, MT_GOX__BUY_V);
		createEReference(mtGoxEClass, MT_GOX__LAST_V);
		createEReference(mtGoxEClass, MT_GOX__VOLUME_V);
		createEReference(mtGoxEClass, MT_GOX__TREND);
		createEReference(mtGoxEClass, MT_GOX__FETCHS);
		createEReference(mtGoxEClass, MT_GOX__WALLET);
		createEReference(mtGoxEClass, MT_GOX__SALES);
		createEAttribute(mtGoxEClass, MT_GOX__SOCKETIO_CONNECTED);
		createEReference(mtGoxEClass, MT_GOX__BIDS);
		createEReference(mtGoxEClass, MT_GOX__ASKS);

		mtGoxCmdEClass = createEClass(MT_GOX_CMD);
		createEAttribute(mtGoxCmdEClass, MT_GOX_CMD__JSON_SND);
		createEAttribute(mtGoxCmdEClass, MT_GOX_CMD__JSON_RCV);
		createEAttribute(mtGoxCmdEClass, MT_GOX_CMD__QUERY);

		compactValueEClass = createEClass(COMPACT_VALUE);
		createEAttribute(compactValueEClass, COMPACT_VALUE__VALUE);
		createEAttribute(compactValueEClass, COMPACT_VALUE__VALUE_INT);
		createEAttribute(compactValueEClass, COMPACT_VALUE__DISPLAY);
		createEAttribute(compactValueEClass, COMPACT_VALUE__DISPLAY_SHORT);
		createEAttribute(compactValueEClass, COMPACT_VALUE__CURRENCY);

		fundamentalsEClass = createEClass(FUNDAMENTALS);
		createEAttribute(fundamentalsEClass, FUNDAMENTALS__HIGH);
		createEAttribute(fundamentalsEClass, FUNDAMENTALS__LOW);
		createEAttribute(fundamentalsEClass, FUNDAMENTALS__BUY);
		createEAttribute(fundamentalsEClass, FUNDAMENTALS__SELL);
		createEAttribute(fundamentalsEClass, FUNDAMENTALS__LAST);
		createEAttribute(fundamentalsEClass, FUNDAMENTALS__AVERAGE);

		fetchValueEClass = createEClass(FETCH_VALUE);
		createEAttribute(fetchValueEClass, FETCH_VALUE__STAMP);
		createEAttribute(fetchValueEClass, FETCH_VALUE__PRICE);
		createEAttribute(fetchValueEClass, FETCH_VALUE__AMOUNT);
		createEAttribute(fetchValueEClass, FETCH_VALUE__PRICE_INT);
		createEAttribute(fetchValueEClass, FETCH_VALUE__AMOUNT_INT);
		createEAttribute(fetchValueEClass, FETCH_VALUE__TID);
		createEAttribute(fetchValueEClass, FETCH_VALUE__CURRENCY);
		createEAttribute(fetchValueEClass, FETCH_VALUE__ITEM);
		createEAttribute(fetchValueEClass, FETCH_VALUE__TRADE_TYPE);
		createEAttribute(fetchValueEClass, FETCH_VALUE__PRIMARY);
		createEAttribute(fetchValueEClass, FETCH_VALUE__PROPERTIES);

		depthValueEClass = createEClass(DEPTH_VALUE);
		createEAttribute(depthValueEClass, DEPTH_VALUE__PRICE);
		createEAttribute(depthValueEClass, DEPTH_VALUE__PRICE_INT);
		createEAttribute(depthValueEClass, DEPTH_VALUE__AMOUNT);
		createEAttribute(depthValueEClass, DEPTH_VALUE__AMOUNT_INT);
		createEAttribute(depthValueEClass, DEPTH_VALUE__STAMP);
		createEAttribute(depthValueEClass, DEPTH_VALUE__KIND);
		createEAttribute(depthValueEClass, DEPTH_VALUE__SUM);
		createEAttribute(depthValueEClass, DEPTH_VALUE__CURRENCY);
		createEAttribute(depthValueEClass, DEPTH_VALUE__STATUS);
		createEAttribute(depthValueEClass, DEPTH_VALUE__LAST_LOCAL_STATUS);
		createEAttribute(depthValueEClass, DEPTH_VALUE__VOLUME);
		createEAttribute(depthValueEClass, DEPTH_VALUE__VOLUME_INT);

		walletEClass = createEClass(WALLET);
		createEAttribute(walletEClass, WALLET__BITCOIN_ADDR);
		createEReference(walletEClass, WALLET__RECORDS);
		createEReference(walletEClass, WALLET__ORDERS);
		createEReference(walletEClass, WALLET__BALANCE);
		createEAttribute(walletEClass, WALLET__LOGIN);
		createEAttribute(walletEClass, WALLET__CREATED);
		createEAttribute(walletEClass, WALLET__LAST_LOGIN);
		createEAttribute(walletEClass, WALLET__ID);
		createEAttribute(walletEClass, WALLET__INDEX);
		createEAttribute(walletEClass, WALLET__TRADE_FEE);
		createEAttribute(walletEClass, WALLET__MONTHLY_VOLUME);
		createEAttribute(walletEClass, WALLET__RIGHTS);
		createEReference(walletEClass, WALLET__BTC_INFO);
		createEReference(walletEClass, WALLET__EUR_INFO);
		createEReference(walletEClass, WALLET__USD_INFO);

		walletRecordEClass = createEClass(WALLET_RECORD);
		createEAttribute(walletRecordEClass, WALLET_RECORD__INDEX);
		createEAttribute(walletRecordEClass, WALLET_RECORD__DATE);
		createEAttribute(walletRecordEClass, WALLET_RECORD__TYPE);
		createEReference(walletRecordEClass, WALLET_RECORD__VALUE);
		createEReference(walletRecordEClass, WALLET_RECORD__BALANCE);
		createEAttribute(walletRecordEClass, WALLET_RECORD__INFO);
		createEReference(walletRecordEClass, WALLET_RECORD__LINKS);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__ADDR);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__OID);
		createEAttribute(orderEClass, ORDER__CURRENCY);
		createEAttribute(orderEClass, ORDER__ITEM);
		createEAttribute(orderEClass, ORDER__TYPE);
		createEReference(orderEClass, ORDER__AMOUNT);
		createEReference(orderEClass, ORDER__PRICE);
		createEAttribute(orderEClass, ORDER__STATUS);
		createEAttribute(orderEClass, ORDER__DATE);
		createEAttribute(orderEClass, ORDER__PRIORITY);

		currencyWalletDataEClass = createEClass(CURRENCY_WALLET_DATA);
		createEAttribute(currencyWalletDataEClass, CURRENCY_WALLET_DATA__CURRENCY);
		createEAttribute(currencyWalletDataEClass, CURRENCY_WALLET_DATA__OPERATIONS);
		createEReference(currencyWalletDataEClass, CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT);
		createEReference(currencyWalletDataEClass, CURRENCY_WALLET_DATA__ORDERS);
		createEReference(currencyWalletDataEClass, CURRENCY_WALLET_DATA__MONTHLY_LIMIT);
		createEReference(currencyWalletDataEClass, CURRENCY_WALLET_DATA__DAILY_LIMIT);
		createEReference(currencyWalletDataEClass, CURRENCY_WALLET_DATA__BALANCE);

		withdrawInfoEClass = createEClass(WITHDRAW_INFO);
		createEAttribute(withdrawInfoEClass, WITHDRAW_INFO__VALUE);
		createEAttribute(withdrawInfoEClass, WITHDRAW_INFO__VALUE_INT);
		createEAttribute(withdrawInfoEClass, WITHDRAW_INFO__DISPLAY);
		createEAttribute(withdrawInfoEClass, WITHDRAW_INFO__DISPLAY_SHORT);
		createEAttribute(withdrawInfoEClass, WITHDRAW_INFO__CURRENCY);

		// Create enums
		fetchKindEEnum = createEEnum(FETCH_KIND);
		walletRightEEnum = createEEnum(WALLET_RIGHT);
		depthStatusEEnum = createEEnum(DEPTH_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BtcPackage theBtcPackage = (BtcPackage)EPackage.Registry.INSTANCE.getEPackage(BtcPackage.eNS_URI);
		HttpcmdPackage theHttpcmdPackage = (HttpcmdPackage)EPackage.Registry.INSTANCE.getEPackage(HttpcmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mtGoxCmdEClass.getESuperTypes().add(theHttpcmdPackage.getHttpCommCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(mtGoxEClass, MTGox.class, "MTGox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTGox_Login(), ecorePackage.getEString(), "login", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTGox_Password(), ecorePackage.getEString(), "password", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTGox_ApiKey(), ecorePackage.getEString(), "apiKey", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_Market(), theBtcPackage.getBitcoinMarket(), null, "market", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTGox_Currency(), theBtcPackage.getBtcCurrency(), "currency", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTGox_FeeRate(), ecorePackage.getEFloat(), "feeRate", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_HighV(), this.getCompactValue(), null, "highV", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_LowV(), this.getCompactValue(), null, "lowV", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_SellV(), this.getCompactValue(), null, "sellV", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_BuyV(), this.getCompactValue(), null, "buyV", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_LastV(), this.getCompactValue(), null, "lastV", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_VolumeV(), this.getCompactValue(), null, "volumeV", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_Trend(), this.getFundamentals(), null, "trend", null, 0, -1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_Fetchs(), this.getFetchValue(), null, "fetchs", null, 0, -1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_Wallet(), this.getWallet(), null, "wallet", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_Sales(), this.getDepthValue(), null, "sales", null, 0, -1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTGox_SocketioConnected(), ecorePackage.getEBoolean(), "socketioConnected", null, 0, 1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_Bids(), this.getDepthValue(), null, "bids", null, 0, -1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMTGox_Asks(), this.getDepthValue(), null, "asks", null, 0, -1, MTGox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mtGoxEClass, this.getDepthValue(), "getDepths", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(mtGoxCmdEClass, MTGoxCmd.class, "MTGoxCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMTGoxCmd_JsonSnd(), ecorePackage.getEString(), "jsonSnd", null, 0, 1, MTGoxCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTGoxCmd_JsonRcv(), ecorePackage.getEString(), "jsonRcv", null, 0, 1, MTGoxCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMTGoxCmd_Query(), ecorePackage.getEString(), "query", null, 0, 1, MTGoxCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compactValueEClass, CompactValue.class, "CompactValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompactValue_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, CompactValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompactValue_Value_int(), ecorePackage.getEBigInteger(), "value_int", null, 0, 1, CompactValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompactValue_Display(), ecorePackage.getEString(), "display", null, 0, 1, CompactValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompactValue_Display_short(), ecorePackage.getEString(), "display_short", null, 0, 1, CompactValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompactValue_Currency(), ecorePackage.getEString(), "currency", null, 0, 1, CompactValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fundamentalsEClass, Fundamentals.class, "Fundamentals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFundamentals_High(), ecorePackage.getEFloat(), "high", null, 0, 1, Fundamentals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFundamentals_Low(), ecorePackage.getEFloat(), "low", null, 0, 1, Fundamentals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFundamentals_Buy(), ecorePackage.getEFloat(), "buy", null, 0, 1, Fundamentals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFundamentals_Sell(), ecorePackage.getEFloat(), "sell", null, 0, 1, Fundamentals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFundamentals_Last(), ecorePackage.getEFloat(), "last", null, 0, 1, Fundamentals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFundamentals_Average(), ecorePackage.getEFloat(), "average", null, 0, 1, Fundamentals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fetchValueEClass, FetchValue.class, "FetchValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFetchValue_Stamp(), ecorePackage.getELong(), "stamp", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_Amount(), ecorePackage.getEFloat(), "amount", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_PriceInt(), ecorePackage.getEBigInteger(), "priceInt", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_AmountInt(), ecorePackage.getEBigInteger(), "amountInt", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_Tid(), ecorePackage.getEString(), "tid", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_Currency(), theBtcPackage.getBtcCurrency(), "currency", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_Item(), ecorePackage.getEString(), "item", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_TradeType(), ecorePackage.getEString(), "tradeType", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_Primary(), ecorePackage.getEString(), "primary", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFetchValue_Properties(), ecorePackage.getEString(), "properties", null, 0, 1, FetchValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(depthValueEClass, DepthValue.class, "DepthValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepthValue_Price(), ecorePackage.getEFloat(), "price", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_PriceInt(), ecorePackage.getEBigInteger(), "priceInt", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_Amount(), ecorePackage.getEFloat(), "amount", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_AmountInt(), ecorePackage.getEBigInteger(), "amountInt", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_Stamp(), ecorePackage.getELong(), "stamp", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_Kind(), this.getFetchKind(), "kind", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_Sum(), ecorePackage.getEFloat(), "sum", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_Currency(), theBtcPackage.getBtcCurrency(), "currency", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_Status(), this.getDepthStatus(), "status", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_LastLocalStatus(), ecorePackage.getELong(), "lastLocalStatus", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepthValue_VolumeInt(), ecorePackage.getEBigInteger(), "volumeInt", null, 0, 1, DepthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(walletEClass, Wallet.class, "Wallet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWallet_BitcoinAddr(), ecorePackage.getEString(), "bitcoinAddr", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallet_Records(), this.getWalletRecord(), null, "records", null, 0, -1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallet_Orders(), this.getOrder(), null, "orders", null, 0, -1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallet_Balance(), this.getCompactValue(), null, "balance", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_Login(), ecorePackage.getEString(), "login", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_Created(), ecorePackage.getEString(), "created", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_LastLogin(), ecorePackage.getEString(), "lastLogin", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_Id(), ecorePackage.getEString(), "id", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_TradeFee(), ecorePackage.getEFloat(), "tradeFee", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_MonthlyVolume(), ecorePackage.getEInt(), "monthlyVolume", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallet_Rights(), this.getWalletRight(), "rights", null, 0, -1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallet_BtcInfo(), this.getCurrencyWalletData(), null, "btcInfo", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallet_EurInfo(), this.getCurrencyWalletData(), null, "eurInfo", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallet_UsdInfo(), this.getCurrencyWalletData(), null, "usdInfo", null, 0, 1, Wallet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(walletRecordEClass, WalletRecord.class, "WalletRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWalletRecord_Index(), ecorePackage.getEInt(), "index", null, 0, 1, WalletRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWalletRecord_Date(), ecorePackage.getEDate(), "date", null, 0, 1, WalletRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWalletRecord_Type(), ecorePackage.getEString(), "type", null, 0, 1, WalletRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWalletRecord_Value(), this.getCompactValue(), null, "value", null, 0, 1, WalletRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWalletRecord_Balance(), this.getCompactValue(), null, "balance", null, 0, 1, WalletRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWalletRecord_Info(), ecorePackage.getEString(), "info", null, 0, 1, WalletRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWalletRecord_Links(), this.getLink(), null, "links", null, 0, -1, WalletRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_Oid(), ecorePackage.getEString(), "oid", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Currency(), theBtcPackage.getBtcCurrency(), "currency", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Item(), ecorePackage.getEString(), "item", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Type(), ecorePackage.getEString(), "type", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Amount(), this.getCompactValue(), null, "amount", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Price(), this.getCompactValue(), null, "price", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Status(), ecorePackage.getEString(), "status", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Date(), ecorePackage.getEString(), "date", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Priority(), ecorePackage.getEString(), "priority", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyWalletDataEClass, CurrencyWalletData.class, "CurrencyWalletData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrencyWalletData_Currency(), theBtcPackage.getBtcCurrency(), "currency", null, 0, 1, CurrencyWalletData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyWalletData_Operations(), ecorePackage.getEInt(), "operations", null, 0, 1, CurrencyWalletData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyWalletData_MaxWithdrawLimit(), this.getWithdrawInfo(), null, "maxWithdrawLimit", null, 0, 1, CurrencyWalletData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyWalletData_Orders(), this.getWithdrawInfo(), null, "orders", null, 0, 1, CurrencyWalletData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyWalletData_MonthlyLimit(), this.getWithdrawInfo(), null, "monthlyLimit", null, 0, 1, CurrencyWalletData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyWalletData_DailyLimit(), this.getWithdrawInfo(), null, "dailyLimit", null, 0, 1, CurrencyWalletData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyWalletData_Balance(), this.getWithdrawInfo(), null, "balance", null, 0, 1, CurrencyWalletData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(withdrawInfoEClass, WithdrawInfo.class, "WithdrawInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWithdrawInfo_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, WithdrawInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithdrawInfo_Value_int(), ecorePackage.getEBigInteger(), "value_int", null, 0, 1, WithdrawInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithdrawInfo_Display(), ecorePackage.getEString(), "display", null, 0, 1, WithdrawInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithdrawInfo_Display_short(), ecorePackage.getEString(), "display_short", null, 0, 1, WithdrawInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithdrawInfo_Currency(), theBtcPackage.getBtcCurrency(), "currency", null, 0, 1, WithdrawInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fetchKindEEnum, FetchKind.class, "FetchKind");
		addEEnumLiteral(fetchKindEEnum, FetchKind.ASK);
		addEEnumLiteral(fetchKindEEnum, FetchKind.BID);

		initEEnum(walletRightEEnum, WalletRight.class, "WalletRight");
		addEEnumLiteral(walletRightEEnum, WalletRight.DEPOSIT);
		addEEnumLiteral(walletRightEEnum, WalletRight.GET_INFO);
		addEEnumLiteral(walletRightEEnum, WalletRight.TRADE);
		addEEnumLiteral(walletRightEEnum, WalletRight.MERCHANT);
		addEEnumLiteral(walletRightEEnum, WalletRight.WITHDRAW);

		initEEnum(depthStatusEEnum, DepthStatus.class, "DepthStatus");
		addEEnumLiteral(depthStatusEEnum, DepthStatus.NONE);
		addEEnumLiteral(depthStatusEEnum, DepthStatus.ADD);
		addEEnumLiteral(depthStatusEEnum, DepthStatus.REM);
		addEEnumLiteral(depthStatusEEnum, DepthStatus.UPDATE);

		// Create resource
		createResource(eNS_URI);
	}

} //MtgoxPackageImpl
