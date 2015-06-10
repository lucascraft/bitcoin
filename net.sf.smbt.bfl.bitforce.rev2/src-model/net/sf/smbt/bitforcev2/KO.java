/**
 */
package net.sf.smbt.bitforcev2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.KO#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getKO()
 * @model
 * @generated
 */
public interface KO extends BFLCmd {

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.bitforcev2.ERR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see net.sf.smbt.bitforcev2.ERR
	 * @see #setError(ERR)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getKO_Error()
	 * @model
	 * @generated
	 */
	ERR getError();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.KO#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see net.sf.smbt.bitforcev2.ERR
	 * @see #getError()
	 * @generated
	 */
	void setError(ERR value);
} // KO
