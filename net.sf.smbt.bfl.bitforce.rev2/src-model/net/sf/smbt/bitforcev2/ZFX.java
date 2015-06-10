/**
 */
package net.sf.smbt.bitforcev2;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZFX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.ZFX#getResultKind <em>Result Kind</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZFX#getNonces <em>Nonces</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZFX()
 * @model
 * @generated
 */
public interface ZFX extends BFLCmd {

	/**
	 * Returns the value of the '<em><b>Result Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.bitforcev2.JobResultsKnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Kind</em>' attribute.
	 * @see net.sf.smbt.bitforcev2.JobResultsKnd
	 * @see #setResultKind(JobResultsKnd)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZFX_ResultKind()
	 * @model
	 * @generated
	 */
	JobResultsKnd getResultKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZFX#getResultKind <em>Result Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Kind</em>' attribute.
	 * @see net.sf.smbt.bitforcev2.JobResultsKnd
	 * @see #getResultKind()
	 * @generated
	 */
	void setResultKind(JobResultsKnd value);

	/**
	 * Returns the value of the '<em><b>Nonces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonces</em>' attribute list.
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZFX_Nonces()
	 * @model
	 * @generated
	 */
	EList<String> getNonces();
} // ZFX
