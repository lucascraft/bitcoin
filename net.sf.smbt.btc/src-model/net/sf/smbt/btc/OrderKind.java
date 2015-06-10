/**
 */
package net.sf.smbt.btc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.BtcPackage#getOrderKind()
 * @model
 * @generated
 */
public enum OrderKind implements Enumerator {
	/**
	 * The '<em><b>ASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASK_VALUE
	 * @generated
	 * @ordered
	 */
	ASK(0, "ASK", "ASK"),

	/**
	 * The '<em><b>BID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BID_VALUE
	 * @generated
	 * @ordered
	 */
	BID(1, "BID", "BID"), /**
	 * The '<em><b>BOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH(2, "BOTH", "BOTH"), /**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(3, "ANY", "ANY");

	/**
	 * The '<em><b>ASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASK_VALUE = 0;

	/**
	 * The '<em><b>BID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BID_VALUE = 1;

	/**
	 * The '<em><b>BOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_VALUE = 2;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Order Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderKind[] VALUES_ARRAY =
		new OrderKind[] {
			ASK,
			BID,
			BOTH,
			ANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderKind get(int value) {
		switch (value) {
			case ASK_VALUE: return ASK;
			case BID_VALUE: return BID;
			case BOTH_VALUE: return BOTH;
			case ANY_VALUE: return ANY;
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
	private OrderKind(int value, String name, String literal) {
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
	
} //OrderKind
