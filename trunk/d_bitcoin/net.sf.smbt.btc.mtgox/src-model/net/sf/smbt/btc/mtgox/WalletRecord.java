/**
 */
package net.sf.smbt.btc.mtgox;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wallet Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.WalletRecord#getIndex <em>Index</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.WalletRecord#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.WalletRecord#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.WalletRecord#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.WalletRecord#getBalance <em>Balance</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.WalletRecord#getInfo <em>Info</em>}</li>
 *   <li>{@link net.sf.smbt.btc.mtgox.WalletRecord#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRecord()
 * @model
 * @generated
 */
public interface WalletRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRecord_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.WalletRecord#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRecord_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.WalletRecord#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRecord_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.WalletRecord#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRecord_Value()
	 * @model
	 * @generated
	 */
	CompactValue getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.WalletRecord#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' reference.
	 * @see #setBalance(CompactValue)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRecord_Balance()
	 * @model
	 * @generated
	 */
	CompactValue getBalance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.WalletRecord#getBalance <em>Balance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' reference.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(CompactValue value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' attribute.
	 * @see #setInfo(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRecord_Info()
	 * @model
	 * @generated
	 */
	String getInfo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.WalletRecord#getInfo <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' attribute.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.btc.mtgox.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRecord_Links()
	 * @model
	 * @generated
	 */
	EList<Link> getLinks();

} // WalletRecord
