/**
 */
package net.sf.smbt.bitforcev2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZDX Full Range Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getMidState <em>Mid State</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getBlockState <em>Block State</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getEOB <em>EOB</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZDXFullRangeJob()
 * @model
 * @generated
 */
public interface ZDXFullRangeJob extends BFLCmd {
	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #setDataSize(byte)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZDXFullRangeJob_DataSize()
	 * @model
	 * @generated
	 */
	byte getDataSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' attribute.
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(byte value);

	/**
	 * Returns the value of the '<em><b>Mid State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mid State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mid State</em>' attribute.
	 * @see #setMidState(byte[])
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZDXFullRangeJob_MidState()
	 * @model
	 * @generated
	 */
	byte[] getMidState();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getMidState <em>Mid State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mid State</em>' attribute.
	 * @see #getMidState()
	 * @generated
	 */
	void setMidState(byte[] value);

	/**
	 * Returns the value of the '<em><b>Block State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block State</em>' attribute.
	 * @see #setBlockState(byte[])
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZDXFullRangeJob_BlockState()
	 * @model
	 * @generated
	 */
	byte[] getBlockState();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getBlockState <em>Block State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block State</em>' attribute.
	 * @see #getBlockState()
	 * @generated
	 */
	void setBlockState(byte[] value);

	/**
	 * Returns the value of the '<em><b>EOB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOB</em>' attribute.
	 * @see #setEOB(byte)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZDXFullRangeJob_EOB()
	 * @model
	 * @generated
	 */
	byte getEOB();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZDXFullRangeJob#getEOB <em>EOB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOB</em>' attribute.
	 * @see #getEOB()
	 * @generated
	 */
	void setEOB(byte value);

} // ZDXFullRangeJob
