/**
 */
package net.sf.smbt.bitforcev2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZNX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.ZNX#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZNX#getMidState <em>Mid State</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZNX#getBlockData <em>Block Data</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZNX#getEOB <em>EOB</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZNX()
 * @model
 * @generated
 */
public interface ZNX extends BFLCmd {

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
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZNX_DataSize()
	 * @model
	 * @generated
	 */
	byte getDataSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZNX#getDataSize <em>Data Size</em>}' attribute.
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
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZNX_MidState()
	 * @model
	 * @generated
	 */
	byte[] getMidState();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZNX#getMidState <em>Mid State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mid State</em>' attribute.
	 * @see #getMidState()
	 * @generated
	 */
	void setMidState(byte[] value);

	/**
	 * Returns the value of the '<em><b>Block Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Data</em>' attribute.
	 * @see #setBlockData(byte[])
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZNX_BlockData()
	 * @model
	 * @generated
	 */
	byte[] getBlockData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZNX#getBlockData <em>Block Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Data</em>' attribute.
	 * @see #getBlockData()
	 * @generated
	 */
	void setBlockData(byte[] value);

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
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZNX_EOB()
	 * @model
	 * @generated
	 */
	byte getEOB();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZNX#getEOB <em>EOB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOB</em>' attribute.
	 * @see #getEOB()
	 * @generated
	 */
	void setEOB(byte value);
} // ZNX
