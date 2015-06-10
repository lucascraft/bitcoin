/**
 */
package net.sf.smbt.btc.mtgox;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.mtgox.Link#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(String)
	 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getLink_Addr()
	 * @model
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.mtgox.Link#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);

} // Link
