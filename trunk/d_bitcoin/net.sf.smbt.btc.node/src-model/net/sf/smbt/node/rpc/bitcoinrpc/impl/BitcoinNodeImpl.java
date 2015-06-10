/**
 */
package net.sf.smbt.node.rpc.bitcoinrpc.impl;

import java.util.Collection;
import java.util.List;

import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinNode;
import net.sf.smbt.node.rpc.bitcoinrpc.BitcoinrpcPackage;
import net.sf.smbt.node.rpc.bitcoinrpc.BtcInfo;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitcoin Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl#getBtcAddr <em>Btc Addr</em>}</li>
 *   <li>{@link net.sf.smbt.node.rpc.bitcoinrpc.impl.BitcoinNodeImpl#getInetAddr <em>Inet Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitcoinNodeImpl extends MinimalEObjectImpl.Container implements BitcoinNode {
	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdPipe> engines;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected CmdPipe default_;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected BtcInfo info;

	/**
	 * The default value of the '{@link #getBtcAddr() <em>Btc Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtcAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String BTC_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtcAddr() <em>Btc Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtcAddr()
	 * @generated
	 * @ordered
	 */
	protected String btcAddr = BTC_ADDR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInetAddr() <em>Inet Addr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInetAddr()
	 * @generated
	 * @ordered
	 */
	protected XCPAddress inetAddr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitcoinNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitcoinrpcPackage.Literals.BITCOIN_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CmdPipe> getEngines() {
		if (engines == null) {
			engines = new EObjectResolvingEList<CmdPipe>(CmdPipe.class, this, BitcoinrpcPackage.BITCOIN_NODE__ENGINES);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (CmdPipe)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BitcoinrpcPackage.BITCOIN_NODE__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		CmdPipe oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BITCOIN_NODE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcInfo getInfo() {
		if (info != null && info.eIsProxy()) {
			InternalEObject oldInfo = (InternalEObject)info;
			info = (BtcInfo)eResolveProxy(oldInfo);
			if (info != oldInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BitcoinrpcPackage.BITCOIN_NODE__INFO, oldInfo, info));
			}
		}
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcInfo basicGetInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(BtcInfo newInfo) {
		BtcInfo oldInfo = info;
		info = newInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BITCOIN_NODE__INFO, oldInfo, info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBtcAddr() {
		return btcAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtcAddr(String newBtcAddr) {
		String oldBtcAddr = btcAddr;
		btcAddr = newBtcAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BITCOIN_NODE__BTC_ADDR, oldBtcAddr, btcAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress getInetAddr() {
		if (inetAddr != null && inetAddr.eIsProxy()) {
			InternalEObject oldInetAddr = (InternalEObject)inetAddr;
			inetAddr = (XCPAddress)eResolveProxy(oldInetAddr);
			if (inetAddr != oldInetAddr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BitcoinrpcPackage.BITCOIN_NODE__INET_ADDR, oldInetAddr, inetAddr));
			}
		}
		return inetAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress basicGetInetAddr() {
		return inetAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInetAddr(XCPAddress newInetAddr) {
		XCPAddress oldInetAddr = inetAddr;
		inetAddr = newInetAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitcoinrpcPackage.BITCOIN_NODE__INET_ADDR, oldInetAddr, inetAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitcoinrpcPackage.BITCOIN_NODE__ENGINES:
				return getEngines();
			case BitcoinrpcPackage.BITCOIN_NODE__DEFAULT:
				return getDefault();
			case BitcoinrpcPackage.BITCOIN_NODE__INFO:
				if (resolve) return getInfo();
				return basicGetInfo();
			case BitcoinrpcPackage.BITCOIN_NODE__BTC_ADDR:
				return getBtcAddr();
			case BitcoinrpcPackage.BITCOIN_NODE__INET_ADDR:
				if (resolve) return getInetAddr();
				return basicGetInetAddr();
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
			case BitcoinrpcPackage.BITCOIN_NODE__ENGINES:
				getEngines().clear();
				getEngines().addAll((Collection<? extends CmdPipe>)newValue);
				return;
			case BitcoinrpcPackage.BITCOIN_NODE__DEFAULT:
				setDefault((CmdPipe)newValue);
				return;
			case BitcoinrpcPackage.BITCOIN_NODE__INFO:
				setInfo((BtcInfo)newValue);
				return;
			case BitcoinrpcPackage.BITCOIN_NODE__BTC_ADDR:
				setBtcAddr((String)newValue);
				return;
			case BitcoinrpcPackage.BITCOIN_NODE__INET_ADDR:
				setInetAddr((XCPAddress)newValue);
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
			case BitcoinrpcPackage.BITCOIN_NODE__ENGINES:
				getEngines().clear();
				return;
			case BitcoinrpcPackage.BITCOIN_NODE__DEFAULT:
				setDefault((CmdPipe)null);
				return;
			case BitcoinrpcPackage.BITCOIN_NODE__INFO:
				setInfo((BtcInfo)null);
				return;
			case BitcoinrpcPackage.BITCOIN_NODE__BTC_ADDR:
				setBtcAddr(BTC_ADDR_EDEFAULT);
				return;
			case BitcoinrpcPackage.BITCOIN_NODE__INET_ADDR:
				setInetAddr((XCPAddress)null);
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
			case BitcoinrpcPackage.BITCOIN_NODE__ENGINES:
				return engines != null && !engines.isEmpty();
			case BitcoinrpcPackage.BITCOIN_NODE__DEFAULT:
				return default_ != null;
			case BitcoinrpcPackage.BITCOIN_NODE__INFO:
				return info != null;
			case BitcoinrpcPackage.BITCOIN_NODE__BTC_ADDR:
				return BTC_ADDR_EDEFAULT == null ? btcAddr != null : !BTC_ADDR_EDEFAULT.equals(btcAddr);
			case BitcoinrpcPackage.BITCOIN_NODE__INET_ADDR:
				return inetAddr != null;
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
		result.append(" (btcAddr: ");
		result.append(btcAddr);
		result.append(')');
		return result.toString();
	}

} //BitcoinNodeImpl
