/**
 */
package net.sf.smbt.btc.mtgox.impl;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.CompactValue;
import net.sf.smbt.btc.mtgox.MtgoxPackage;
import net.sf.smbt.btc.mtgox.Order;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getOid <em>Oid</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getItem <em>Item</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.impl.OrderImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final String OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected String oid = OID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final BtcCurrency CURRENCY_EDEFAULT = BtcCurrency.EUR;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected BtcCurrency currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected String item = ITEM_EDEFAULT;

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
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected CompactValue amount;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected CompactValue price;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtgoxPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOid() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOid(String newOid) {
		String oldOid = oid;
		oid = newOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__OID, oldOid, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcCurrency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(BtcCurrency newCurrency) {
		BtcCurrency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(String newItem) {
		String oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__ITEM, oldItem, item));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getAmount() {
		if (amount != null && amount.eIsProxy()) {
			InternalEObject oldAmount = (InternalEObject)amount;
			amount = (CompactValue)eResolveProxy(oldAmount);
			if (amount != oldAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.ORDER__AMOUNT, oldAmount, amount));
			}
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue basicGetAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(CompactValue newAmount) {
		CompactValue oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue getPrice() {
		if (price != null && price.eIsProxy()) {
			InternalEObject oldPrice = (InternalEObject)price;
			price = (CompactValue)eResolveProxy(oldPrice);
			if (price != oldPrice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MtgoxPackage.ORDER__PRICE, oldPrice, price));
			}
		}
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactValue basicGetPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(CompactValue newPrice) {
		CompactValue oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtgoxPackage.ORDER__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtgoxPackage.ORDER__OID:
				return getOid();
			case MtgoxPackage.ORDER__CURRENCY:
				return getCurrency();
			case MtgoxPackage.ORDER__ITEM:
				return getItem();
			case MtgoxPackage.ORDER__TYPE:
				return getType();
			case MtgoxPackage.ORDER__AMOUNT:
				if (resolve) return getAmount();
				return basicGetAmount();
			case MtgoxPackage.ORDER__PRICE:
				if (resolve) return getPrice();
				return basicGetPrice();
			case MtgoxPackage.ORDER__STATUS:
				return getStatus();
			case MtgoxPackage.ORDER__DATE:
				return getDate();
			case MtgoxPackage.ORDER__PRIORITY:
				return getPriority();
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
			case MtgoxPackage.ORDER__OID:
				setOid((String)newValue);
				return;
			case MtgoxPackage.ORDER__CURRENCY:
				setCurrency((BtcCurrency)newValue);
				return;
			case MtgoxPackage.ORDER__ITEM:
				setItem((String)newValue);
				return;
			case MtgoxPackage.ORDER__TYPE:
				setType((String)newValue);
				return;
			case MtgoxPackage.ORDER__AMOUNT:
				setAmount((CompactValue)newValue);
				return;
			case MtgoxPackage.ORDER__PRICE:
				setPrice((CompactValue)newValue);
				return;
			case MtgoxPackage.ORDER__STATUS:
				setStatus((String)newValue);
				return;
			case MtgoxPackage.ORDER__DATE:
				setDate((String)newValue);
				return;
			case MtgoxPackage.ORDER__PRIORITY:
				setPriority((String)newValue);
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
			case MtgoxPackage.ORDER__OID:
				setOid(OID_EDEFAULT);
				return;
			case MtgoxPackage.ORDER__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case MtgoxPackage.ORDER__ITEM:
				setItem(ITEM_EDEFAULT);
				return;
			case MtgoxPackage.ORDER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MtgoxPackage.ORDER__AMOUNT:
				setAmount((CompactValue)null);
				return;
			case MtgoxPackage.ORDER__PRICE:
				setPrice((CompactValue)null);
				return;
			case MtgoxPackage.ORDER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case MtgoxPackage.ORDER__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case MtgoxPackage.ORDER__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case MtgoxPackage.ORDER__OID:
				return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT.equals(oid);
			case MtgoxPackage.ORDER__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case MtgoxPackage.ORDER__ITEM:
				return ITEM_EDEFAULT == null ? item != null : !ITEM_EDEFAULT.equals(item);
			case MtgoxPackage.ORDER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MtgoxPackage.ORDER__AMOUNT:
				return amount != null;
			case MtgoxPackage.ORDER__PRICE:
				return price != null;
			case MtgoxPackage.ORDER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case MtgoxPackage.ORDER__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case MtgoxPackage.ORDER__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
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
		result.append(" (oid: ");
		result.append(oid);
		result.append(", currency: ");
		result.append(currency);
		result.append(", item: ");
		result.append(item);
		result.append(", type: ");
		result.append(type);
		result.append(", status: ");
		result.append(status);
		result.append(", date: ");
		result.append(date);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
