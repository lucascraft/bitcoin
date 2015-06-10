/**
 */
package net.sf.smbt.bitforcev2;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFL Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.BFLCmd#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.BFLCmd#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.BFLCmd#getHeader <em>Header</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.BFLCmd#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.BFLCmd#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getBFLCmd()
 * @model
 * @generated
 */
public interface BFLCmd extends Cmd {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.bitforcev2.BFLCmdKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.bitforcev2.BFLCmdKind
	 * @see #setKind(BFLCmdKind)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getBFLCmd_Kind()
	 * @model
	 * @generated
	 */
	BFLCmdKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.BFLCmd#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.bitforcev2.BFLCmdKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BFLCmdKind value);

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(byte)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getBFLCmd_Addr()
	 * @model
	 * @generated
	 */
	byte getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.BFLCmd#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(byte value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(byte)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getBFLCmd_Header()
	 * @model
	 * @generated
	 */
	byte getHeader();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.BFLCmd#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(byte value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(byte)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getBFLCmd_Length()
	 * @model
	 * @generated
	 */
	byte getLength();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.BFLCmd#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(byte value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getBFLCmd_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.BFLCmd#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);
} // BFLCmd
