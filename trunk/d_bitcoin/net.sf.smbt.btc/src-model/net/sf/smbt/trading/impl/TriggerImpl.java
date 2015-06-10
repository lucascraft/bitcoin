/**
 */
package net.sf.smbt.trading.impl;

import java.util.Collection;

import net.sf.smbt.trading.JsonNotification;
import net.sf.smbt.trading.MailNotification;
import net.sf.smbt.trading.Order;
import net.sf.smbt.trading.SMSNotifcation;
import net.sf.smbt.trading.TradingPackage;
import net.sf.smbt.trading.TradingRule;
import net.sf.smbt.trading.Trigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#isActivated <em>Activated</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#isProcessed <em>Processed</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#getJsonNotifications <em>Json Notifications</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#getMailNotifications <em>Mail Notifications</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#getSmsNotification <em>Sms Notification</em>}</li>
 *   <li>{@link net.sf.smbt.trading.impl.TriggerImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TradingRule> rules;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean activated = ACTIVATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isProcessed() <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROCESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProcessed() <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessed()
	 * @generated
	 * @ordered
	 */
	protected boolean processed = PROCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJsonNotifications() <em>Json Notifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<JsonNotification> jsonNotifications;

	/**
	 * The cached value of the '{@link #getMailNotifications() <em>Mail Notifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<MailNotification> mailNotifications;

	/**
	 * The cached value of the '{@link #getSmsNotification() <em>Sms Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmsNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<SMSNotifcation> smsNotification;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<Order>(Order.class, this, TradingPackage.TRIGGER__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TradingRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<TradingRule>(TradingRule.class, this, TradingPackage.TRIGGER__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRIGGER__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivated(boolean newActivated) {
		boolean oldActivated = activated;
		activated = newActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRIGGER__ACTIVATED, oldActivated, activated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProcessed() {
		return processed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessed(boolean newProcessed) {
		boolean oldProcessed = processed;
		processed = newProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRIGGER__PROCESSED, oldProcessed, processed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JsonNotification> getJsonNotifications() {
		if (jsonNotifications == null) {
			jsonNotifications = new EObjectContainmentEList<JsonNotification>(JsonNotification.class, this, TradingPackage.TRIGGER__JSON_NOTIFICATIONS);
		}
		return jsonNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MailNotification> getMailNotifications() {
		if (mailNotifications == null) {
			mailNotifications = new EObjectContainmentEList<MailNotification>(MailNotification.class, this, TradingPackage.TRIGGER__MAIL_NOTIFICATIONS);
		}
		return mailNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SMSNotifcation> getSmsNotification() {
		if (smsNotification == null) {
			smsNotification = new EObjectContainmentEList<SMSNotifcation>(SMSNotifcation.class, this, TradingPackage.TRIGGER__SMS_NOTIFICATION);
		}
		return smsNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TradingPackage.TRIGGER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TradingPackage.TRIGGER__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
			case TradingPackage.TRIGGER__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case TradingPackage.TRIGGER__JSON_NOTIFICATIONS:
				return ((InternalEList<?>)getJsonNotifications()).basicRemove(otherEnd, msgs);
			case TradingPackage.TRIGGER__MAIL_NOTIFICATIONS:
				return ((InternalEList<?>)getMailNotifications()).basicRemove(otherEnd, msgs);
			case TradingPackage.TRIGGER__SMS_NOTIFICATION:
				return ((InternalEList<?>)getSmsNotification()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.TRIGGER__ORDERS:
				return getOrders();
			case TradingPackage.TRIGGER__RULES:
				return getRules();
			case TradingPackage.TRIGGER__UUID:
				return getUuid();
			case TradingPackage.TRIGGER__ACTIVATED:
				return isActivated();
			case TradingPackage.TRIGGER__PROCESSED:
				return isProcessed();
			case TradingPackage.TRIGGER__JSON_NOTIFICATIONS:
				return getJsonNotifications();
			case TradingPackage.TRIGGER__MAIL_NOTIFICATIONS:
				return getMailNotifications();
			case TradingPackage.TRIGGER__SMS_NOTIFICATION:
				return getSmsNotification();
			case TradingPackage.TRIGGER__LABEL:
				return getLabel();
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
			case TradingPackage.TRIGGER__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case TradingPackage.TRIGGER__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends TradingRule>)newValue);
				return;
			case TradingPackage.TRIGGER__UUID:
				setUuid((String)newValue);
				return;
			case TradingPackage.TRIGGER__ACTIVATED:
				setActivated((Boolean)newValue);
				return;
			case TradingPackage.TRIGGER__PROCESSED:
				setProcessed((Boolean)newValue);
				return;
			case TradingPackage.TRIGGER__JSON_NOTIFICATIONS:
				getJsonNotifications().clear();
				getJsonNotifications().addAll((Collection<? extends JsonNotification>)newValue);
				return;
			case TradingPackage.TRIGGER__MAIL_NOTIFICATIONS:
				getMailNotifications().clear();
				getMailNotifications().addAll((Collection<? extends MailNotification>)newValue);
				return;
			case TradingPackage.TRIGGER__SMS_NOTIFICATION:
				getSmsNotification().clear();
				getSmsNotification().addAll((Collection<? extends SMSNotifcation>)newValue);
				return;
			case TradingPackage.TRIGGER__LABEL:
				setLabel((String)newValue);
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
			case TradingPackage.TRIGGER__ORDERS:
				getOrders().clear();
				return;
			case TradingPackage.TRIGGER__RULES:
				getRules().clear();
				return;
			case TradingPackage.TRIGGER__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case TradingPackage.TRIGGER__ACTIVATED:
				setActivated(ACTIVATED_EDEFAULT);
				return;
			case TradingPackage.TRIGGER__PROCESSED:
				setProcessed(PROCESSED_EDEFAULT);
				return;
			case TradingPackage.TRIGGER__JSON_NOTIFICATIONS:
				getJsonNotifications().clear();
				return;
			case TradingPackage.TRIGGER__MAIL_NOTIFICATIONS:
				getMailNotifications().clear();
				return;
			case TradingPackage.TRIGGER__SMS_NOTIFICATION:
				getSmsNotification().clear();
				return;
			case TradingPackage.TRIGGER__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case TradingPackage.TRIGGER__ORDERS:
				return orders != null && !orders.isEmpty();
			case TradingPackage.TRIGGER__RULES:
				return rules != null && !rules.isEmpty();
			case TradingPackage.TRIGGER__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case TradingPackage.TRIGGER__ACTIVATED:
				return activated != ACTIVATED_EDEFAULT;
			case TradingPackage.TRIGGER__PROCESSED:
				return processed != PROCESSED_EDEFAULT;
			case TradingPackage.TRIGGER__JSON_NOTIFICATIONS:
				return jsonNotifications != null && !jsonNotifications.isEmpty();
			case TradingPackage.TRIGGER__MAIL_NOTIFICATIONS:
				return mailNotifications != null && !mailNotifications.isEmpty();
			case TradingPackage.TRIGGER__SMS_NOTIFICATION:
				return smsNotification != null && !smsNotification.isEmpty();
			case TradingPackage.TRIGGER__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(", activated: ");
		result.append(activated);
		result.append(", processed: ");
		result.append(processed);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
