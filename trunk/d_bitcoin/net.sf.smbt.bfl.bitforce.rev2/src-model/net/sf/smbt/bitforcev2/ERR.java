/**
 */
package net.sf.smbt.bitforcev2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ERR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getERR()
 * @model
 * @generated
 */
public enum ERR implements Enumerator {
	/**
	 * The '<em><b>QUEUE FULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEUE_FULL_VALUE
	 * @generated
	 * @ordered
	 */
	QUEUE_FULL(0, "QUEUE_FULL", "QUEUE_FULL"),

	/**
	 * The '<em><b>TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEOUT(1, "TIMEOUT", "TIMEOUT"),

	/**
	 * The '<em><b>SIGNATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATURE(2, "SIGNATURE", "SIGNATURE");

	/**
	 * The '<em><b>QUEUE FULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUEUE FULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUEUE_FULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUEUE_FULL_VALUE = 0;

	/**
	 * The '<em><b>TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEOUT_VALUE = 1;

	/**
	 * The '<em><b>SIGNATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNATURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ERR</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ERR[] VALUES_ARRAY =
		new ERR[] {
			QUEUE_FULL,
			TIMEOUT,
			SIGNATURE,
		};

	/**
	 * A public read-only list of all the '<em><b>ERR</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ERR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ERR</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERR get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERR result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERR</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERR getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERR result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERR</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERR get(int value) {
		switch (value) {
			case QUEUE_FULL_VALUE: return QUEUE_FULL;
			case TIMEOUT_VALUE: return TIMEOUT;
			case SIGNATURE_VALUE: return SIGNATURE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ERR(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ERR
