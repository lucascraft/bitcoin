/**
 */
package net.sf.smbt.bitforcev2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZGX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.ZGX#getMajor <em>Major</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZGX#getMinor <em>Minor</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZGX()
 * @model
 * @generated
 */
public interface ZGX extends BFLCmd {

	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(int)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZGX_Major()
	 * @model
	 * @generated
	 */
	int getMajor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZGX#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(int value);

	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #setMinor(int)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZGX_Minor()
	 * @model
	 * @generated
	 */
	int getMinor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZGX#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor</em>' attribute.
	 * @see #getMinor()
	 * @generated
	 */
	void setMinor(int value);
} // ZGX
