/**
 */
package net.sf.smbt.trading;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.Trigger#getOrders <em>Orders</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Trigger#getRules <em>Rules</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Trigger#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Trigger#isActivated <em>Activated</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Trigger#isProcessed <em>Processed</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Trigger#getJsonNotifications <em>Json Notifications</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Trigger#getMailNotifications <em>Mail Notifications</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Trigger#getSmsNotification <em>Sms Notification</em>}</li>
 *   <li>{@link net.sf.smbt.trading.Trigger#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.trading.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.trading.TradingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TradingRule> getRules();

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Trigger#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(boolean)
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_Activated()
	 * @model default="true"
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Trigger#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed</em>' attribute.
	 * @see #setProcessed(boolean)
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_Processed()
	 * @model
	 * @generated
	 */
	boolean isProcessed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Trigger#isProcessed <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processed</em>' attribute.
	 * @see #isProcessed()
	 * @generated
	 */
	void setProcessed(boolean value);

	/**
	 * Returns the value of the '<em><b>Json Notifications</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.trading.JsonNotification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Notifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Notifications</em>' containment reference list.
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_JsonNotifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<JsonNotification> getJsonNotifications();

	/**
	 * Returns the value of the '<em><b>Mail Notifications</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.trading.MailNotification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail Notifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail Notifications</em>' containment reference list.
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_MailNotifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<MailNotification> getMailNotifications();

	/**
	 * Returns the value of the '<em><b>Sms Notification</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.trading.SMSNotifcation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sms Notification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sms Notification</em>' containment reference list.
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_SmsNotification()
	 * @model containment="true"
	 * @generated
	 */
	EList<SMSNotifcation> getSmsNotification();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.trading.TradingPackage#getTrigger_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.Trigger#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Trigger
