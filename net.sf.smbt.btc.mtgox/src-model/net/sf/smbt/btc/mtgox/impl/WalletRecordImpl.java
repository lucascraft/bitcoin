/**
 */
package net.sf.smbt.btc.mtgox.impl;

import java.util.Collection;
import java.util.Date;

import net.sf.smbt.btc.mtgox.CompactValue;
import net.sf.smbt.btc.mtgox.Link;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.btc.mtgox.WalletRecord;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wallet Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.WalletRecordImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WalletRecordImpl extends MinimalEObjectImpl.Container implements WalletRecord {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CompactValue value;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected CompactValue balance;

	/**
	 * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected String info = INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WalletRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.WALLET_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET_RECORD__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET_RECORD__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET_RECORD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (CompactValue)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.WALLET_RECORD__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(CompactValue newValue) {
		CompactValue oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET_RECORD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getBalance() {
		if (balance != null && balance.eIsProxy()) {
			InternalEObject oldBalance = (InternalEObject)balance;
			balance = (CompactValue)eResolveProxy(oldBalance);
			if (balance != oldBalance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.WALLET_RECORD__BALANCE, oldBalance, balance));
			}
		}
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue basicGetBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(CompactValue newBalance) {
		CompactValue oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET_RECORD__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(String newInfo) {
		String oldInfo = info;
		info = newInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.WALLET_RECORD__INFO, oldInfo, info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Link>(Link.class, this, MtgoxPackage.WALLET_RECORD__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.WALLET_RECORD__INDEX:
				return getIndex();
			case MtgoxPackage.WALLET_RECORD__DATE:
				return getDate();
			case MtgoxPackage.WALLET_RECORD__TYPE:
				return getType();
			case MtgoxPackage.WALLET_RECORD__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case MtgoxPackage.WALLET_RECORD__BALANCE:
				if (resolve) return getBalance();
				return basicGetBalance();
			case MtgoxPackage.WALLET_RECORD__INFO:
				return getInfo();
			case MtgoxPackage.WALLET_RECORD__LINKS:
				return getLinks();
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
			case MtgoxPackage.WALLET_RECORD__INDEX:
				setIndex((Integer)newValue);
				return;
			case MtgoxPackage.WALLET_RECORD__DATE:
				setDate((Date)newValue);
				return;
			case MtgoxPackage.WALLET_RECORD__TYPE:
				setType((String)newValue);
				return;
			case MtgoxPackage.WALLET_RECORD__VALUE:
				setValue((CompactValue)newValue);
				return;
			case MtgoxPackage.WALLET_RECORD__BALANCE:
				setBalance((CompactValue)newValue);
				return;
			case MtgoxPackage.WALLET_RECORD__INFO:
				setInfo((String)newValue);
				return;
			case MtgoxPackage.WALLET_RECORD__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
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
			case MtgoxPackage.WALLET_RECORD__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case MtgoxPackage.WALLET_RECORD__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case MtgoxPackage.WALLET_RECORD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MtgoxPackage.WALLET_RECORD__VALUE:
				setValue((CompactValue)null);
				return;
			case MtgoxPackage.WALLET_RECORD__BALANCE:
				setBalance((CompactValue)null);
				return;
			case MtgoxPackage.WALLET_RECORD__INFO:
				setInfo(INFO_EDEFAULT);
				return;
			case MtgoxPackage.WALLET_RECORD__LINKS:
				getLinks().clear();
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
			case MtgoxPackage.WALLET_RECORD__INDEX:
				return index != INDEX_EDEFAULT;
			case MtgoxPackage.WALLET_RECORD__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case MtgoxPackage.WALLET_RECORD__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MtgoxPackage.WALLET_RECORD__VALUE:
				return value != null;
			case MtgoxPackage.WALLET_RECORD__BALANCE:
				return balance != null;
			case MtgoxPackage.WALLET_RECORD__INFO:
				return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
			case MtgoxPackage.WALLET_RECORD__LINKS:
				return links != null && !links.isEmpty();
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
		result.append(" (index: ");
		result.append(index);
		result.append(", date: ");
		result.append(date);
		result.append(", type: ");
		result.append(type);
		result.append(", info: ");
		result.append(info);
		result.append(')');
		return result.toString();
	}

} //WalletRecordImpl
