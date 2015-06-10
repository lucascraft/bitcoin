/**
 */
package net.sf.smbt.bitforcev2;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZOX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.ZOX#getCount <em>Count</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZOX#getLines <em>Lines</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZOX#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZOX()
 * @model
 * @generated
 */
public interface ZOX extends BFLCmd {

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZOX_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZOX#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute list.
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZOX_Lines()
	 * @model
	 * @generated
	 */
	EList<String> getLines();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZOX_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZOX#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);
} // ZOX
