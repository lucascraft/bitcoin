/**
 */
package net.sf.smbt.bitforcev2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Job Results Knd</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.bitforcev2.Bitforcev2Package#getJobResultsKnd()
 * @model
 * @generated
 */
public enum JobResultsKnd implements Enumerator {
	/**
	 * The '<em><b>BUSY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY(0, "BUSY", "BUSY"),

	/**
	 * The '<em><b>IDLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDLE_VALUE
	 * @generated
	 * @ordered
	 */
	IDLE(1, "IDLE", "IDLE"),

	/**
	 * The '<em><b>NO ONCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ONCE(2, "NO_ONCE", "NO_ONCE"),

	/**
	 * The '<em><b>NONCE FOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONCE_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	NONCE_FOUND(3, "NONCE_FOUND", "NONCE_FOUND");

	/**
	 * The '<em><b>BUSY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_VALUE = 0;

	/**
	 * The '<em><b>IDLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDLE_VALUE = 1;

	/**
	 * The '<em><b>NO ONCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO ONCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ONCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_ONCE_VALUE = 2;

	/**
	 * The '<em><b>NONCE FOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONCE FOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONCE_FOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONCE_FOUND_VALUE = 3;

	/**
	 * An array of all the '<em><b>Job Results Knd</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JobResultsKnd[] VALUES_ARRAY =
		new JobResultsKnd[] {
			BUSY,
			IDLE,
			NO_ONCE,
			NONCE_FOUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Job Results Knd</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JobResultsKnd> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Job Results Knd</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobResultsKnd get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JobResultsKnd result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Job Results Knd</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobResultsKnd getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JobResultsKnd result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Job Results Knd</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobResultsKnd get(int value) {
		switch (value) {
			case BUSY_VALUE: return BUSY;
			case IDLE_VALUE: return IDLE;
			case NO_ONCE_VALUE: return NO_ONCE;
			case NONCE_FOUND_VALUE: return NONCE_FOUND;
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
	private JobResultsKnd(int value, String name, String literal) {
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
	
} //JobResultsKnd
