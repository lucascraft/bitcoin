/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc.impl;

import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage;
import net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Btc Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl#getPaytxfee <em>Paytxfee</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl#getConnected <em>Connected</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl#isTestnet <em>Testnet</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BtcInfoImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BtcInfoImpl extends MinimalEObjectImpl.Container implements BtcInfo {
	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double BALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected double balance = BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrors() <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected static final String ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected String errors = ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaytxfee() <em>Paytxfee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaytxfee()
	 * @generated
	 * @ordered
	 */
	protected static final float PAYTXFEE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPaytxfee() <em>Paytxfee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaytxfee()
	 * @generated
	 * @ordered
	 */
	protected float paytxfee = PAYTXFEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnected()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnected()
	 * @generated
	 * @ordered
	 */
	protected int connected = CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestnet() <em>Testnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestnet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TESTNET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTestnet() <em>Testnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestnet()
	 * @generated
	 * @ordered
	 */
	protected boolean testnet = TESTNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final double DIFFICULTY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected double difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocks() <em>Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final long BLOCKS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected long blocks = BLOCKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BtcInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitcoinrpcPackage.Literals.BTC_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(double newBalance) {
		double oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BTC_INFO__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrors() {
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrors(String newErrors) {
		String oldErrors = errors;
		errors = newErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BTC_INFO__ERRORS, oldErrors, errors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPaytxfee() {
		return paytxfee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaytxfee(float newPaytxfee) {
		float oldPaytxfee = paytxfee;
		paytxfee = newPaytxfee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BTC_INFO__PAYTXFEE, oldPaytxfee, paytxfee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(int newConnected) {
		int oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BTC_INFO__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTestnet() {
		return testnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestnet(boolean newTestnet) {
		boolean oldTestnet = testnet;
		testnet = newTestnet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BTC_INFO__TESTNET, oldTestnet, testnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifficulty(double newDifficulty) {
		double oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BTC_INFO__DIFFICULTY, oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBlocks() {
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocks(long newBlocks) {
		long oldBlocks = blocks;
		blocks = newBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BTC_INFO__BLOCKS, oldBlocks, blocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitcoinrpcPackage.BTC_INFO__BALANCE:
				return getBalance();
			case BitcoinrpcPackage.BTC_INFO__ERRORS:
				return getErrors();
			case BitcoinrpcPackage.BTC_INFO__PAYTXFEE:
				return getPaytxfee();
			case BitcoinrpcPackage.BTC_INFO__CONNECTED:
				return getConnected();
			case BitcoinrpcPackage.BTC_INFO__TESTNET:
				return isTestnet();
			case BitcoinrpcPackage.BTC_INFO__DIFFICULTY:
				return getDifficulty();
			case BitcoinrpcPackage.BTC_INFO__BLOCKS:
				return getBlocks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BitcoinrpcPackage.BTC_INFO__BALANCE:
				setBalance((Double)newValue);
				return;
			case BitcoinrpcPackage.BTC_INFO__ERRORS:
				setErrors((String)newValue);
				return;
			case BitcoinrpcPackage.BTC_INFO__PAYTXFEE:
				setPaytxfee((Float)newValue);
				return;
			case BitcoinrpcPackage.BTC_INFO__CONNECTED:
				setConnected((Integer)newValue);
				return;
			case BitcoinrpcPackage.BTC_INFO__TESTNET:
				setTestnet((Boolean)newValue);
				return;
			case BitcoinrpcPackage.BTC_INFO__DIFFICULTY:
				setDifficulty((Double)newValue);
				return;
			case BitcoinrpcPackage.BTC_INFO__BLOCKS:
				setBlocks((Long)newValue);
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
			case BitcoinrpcPackage.BTC_INFO__BALANCE:
				setBalance(BALANCE_EDEFAULT);
				return;
			case BitcoinrpcPackage.BTC_INFO__ERRORS:
				setErrors(ERRORS_EDEFAULT);
				return;
			case BitcoinrpcPackage.BTC_INFO__PAYTXFEE:
				setPaytxfee(PAYTXFEE_EDEFAULT);
				return;
			case BitcoinrpcPackage.BTC_INFO__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case BitcoinrpcPackage.BTC_INFO__TESTNET:
				setTestnet(TESTNET_EDEFAULT);
				return;
			case BitcoinrpcPackage.BTC_INFO__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case BitcoinrpcPackage.BTC_INFO__BLOCKS:
				setBlocks(BLOCKS_EDEFAULT);
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
			case BitcoinrpcPackage.BTC_INFO__BALANCE:
				return balance != BALANCE_EDEFAULT;
			case BitcoinrpcPackage.BTC_INFO__ERRORS:
				return ERRORS_EDEFAULT == null ? errors != null : !ERRORS_EDEFAULT.equals(errors);
			case BitcoinrpcPackage.BTC_INFO__PAYTXFEE:
				return paytxfee != PAYTXFEE_EDEFAULT;
			case BitcoinrpcPackage.BTC_INFO__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case BitcoinrpcPackage.BTC_INFO__TESTNET:
				return testnet != TESTNET_EDEFAULT;
			case BitcoinrpcPackage.BTC_INFO__DIFFICULTY:
				return difficulty != DIFFICULTY_EDEFAULT;
			case BitcoinrpcPackage.BTC_INFO__BLOCKS:
				return blocks != BLOCKS_EDEFAULT;
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
		result.append(" (balance: ");
		result.append(balance);
		result.append(", errors: ");
		result.append(errors);
		result.append(", paytxfee: ");
		result.append(paytxfee);
		result.append(", connected: ");
		result.append(connected);
		result.append(", testnet: ");
		result.append(testnet);
		result.append(", difficulty: ");
		result.append(difficulty);
		result.append(", blocks: ");
		result.append(blocks);
		result.append(')');
		return result.toString();
	}

} //BtcInfoImpl
