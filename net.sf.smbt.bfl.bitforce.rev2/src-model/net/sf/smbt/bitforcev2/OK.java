/**
 */
package net.sf.smbt.bitforcev2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.OK#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getOK()
 * @model
 * @generated
 */
public interface OK extends BFLCmd {

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.bitforcev2.MSG}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see net.sf.smbt.bitforcev2.MSG
	 * @see #setMsg(MSG)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getOK_Msg()
	 * @model
	 * @generated
	 */
	MSG getMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.OK#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see net.sf.smbt.bitforcev2.MSG
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(MSG value);
} // OK
