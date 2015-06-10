/**
 */
package net.sf.smbt.bitforcev2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.ZLX#getTemperature1 <em>Temperature1</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.ZLX#getTemperature2 <em>Temperature2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZLX()
 * @model
 * @generated
 */
public interface ZLX extends BFLCmd {

	/**
	 * Returns the value of the '<em><b>Temperature1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature1</em>' attribute.
	 * @see #setTemperature1(int)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZLX_Temperature1()
	 * @model
	 * @generated
	 */
	int getTemperature1();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZLX#getTemperature1 <em>Temperature1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature1</em>' attribute.
	 * @see #getTemperature1()
	 * @generated
	 */
	void setTemperature1(int value);

	/**
	 * Returns the value of the '<em><b>Temperature2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature2</em>' attribute.
	 * @see #setTemperature2(int)
	 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getZLX_Temperature2()
	 * @model
	 * @generated
	 */
	int getTemperature2();

	/**
	 * Sets the value of the '{@link net.sf.smbt.bitforcev2.ZLX#getTemperature2 <em>Temperature2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature2</em>' attribute.
	 * @see #getTemperature2()
	 * @generated
	 */
	void setTemperature2(int value);
} // ZLX
