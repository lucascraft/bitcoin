/**
 */
package net.sf.smbt.trading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trigger Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.trading.TradingPackage#getTriggerKind()
 * @model
 * @generated
 */
public enum TriggerKind implements Enumerator {
	/**
	 * The '<em><b>CROSS OVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_OVER_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_OVER(0, "CROSS_OVER", "CROSS_OVER"),

	/**
	 * The '<em><b>CROSS UNDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_UNDER_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_UNDER(1, "CROSS_UNDER", "CROSS_UNDER"),

	/**
	 * The '<em><b>SATISFIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATISFIES_VALUE
	 * @generated
	 * @ordered
	 */
	SATISFIES(3, "SATISFIES", "SATISFIES"), /**
	 * The '<em><b>APPROXIMATES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROXIMATES_VALUE
	 * @generated
	 * @ordered
	 */
	APPROXIMATES(2, "APPROXIMATES", "APPROXIMATES"), /**
	 * The '<em><b>EXCLUDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUDES_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUDES(4, "EXCLUDES", "EXCLUDES"), /**
	 * The '<em><b>WAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAS_VALUE
	 * @generated
	 * @ordered
	 */
	WAS(5, "WAS", "WAS"), /**
	 * The '<em><b>WILL BE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WILL_BE_VALUE
	 * @generated
	 * @ordered
	 */
	WILL_BE(6, "WILL_BE", "WILL_BE"), /**
	 * The '<em><b>AS USUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_USUAL_VALUE
	 * @generated
	 * @ordered
	 */
	AS_USUAL(7, "AS_USUAL", "AS_USUAL"), /**
	 * The '<em><b>EXCEPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEPTIONAL(8, "EXCEPTIONAL", "EXCEPTIONAL"), /**
	 * The '<em><b>WTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTF_VALUE
	 * @generated
	 * @ordered
	 */
	WTF(9, "WTF", "WTF"), /**
	 * The '<em><b>FIRST TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_TIME(10, "FIRST_TIME", "FIRST_TIME");

	/**
	 * The '<em><b>CROSS OVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CROSS OVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS_OVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_OVER_VALUE = 0;

	/**
	 * The '<em><b>CROSS UNDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CROSS UNDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS_UNDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_UNDER_VALUE = 1;

	/**
	 * The '<em><b>SATISFIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SATISFIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SATISFIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SATISFIES_VALUE = 3;

	/**
	 * The '<em><b>APPROXIMATES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPROXIMATES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPROXIMATES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPROXIMATES_VALUE = 2;

	/**
	 * The '<em><b>EXCLUDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCLUDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLUDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUDES_VALUE = 4;

	/**
	 * The '<em><b>WAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAS_VALUE = 5;

	/**
	 * The '<em><b>WILL BE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WILL BE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WILL_BE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WILL_BE_VALUE = 6;

	/**
	 * The '<em><b>AS USUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AS USUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AS_USUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AS_USUAL_VALUE = 7;

	/**
	 * The '<em><b>EXCEPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCEPTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEPTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTIONAL_VALUE = 8;

	/**
	 * The '<em><b>WTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WTF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WTF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WTF_VALUE = 9;

	/**
	 * The '<em><b>FIRST TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRST TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRST_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_TIME_VALUE = 10;

	/**
	 * An array of all the '<em><b>Trigger Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggerKind[] VALUES_ARRAY =
		new TriggerKind[] {
			CROSS_OVER,
			CROSS_UNDER,
			SATISFIES,
			APPROXIMATES,
			EXCLUDES,
			WAS,
			WILL_BE,
			AS_USUAL,
			EXCEPTIONAL,
			WTF,
			FIRST_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Trigger Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriggerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trigger Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerKind get(int value) {
		switch (value) {
			case CROSS_OVER_VALUE: return CROSS_OVER;
			case CROSS_UNDER_VALUE: return CROSS_UNDER;
			case SATISFIES_VALUE: return SATISFIES;
			case APPROXIMATES_VALUE: return APPROXIMATES;
			case EXCLUDES_VALUE: return EXCLUDES;
			case WAS_VALUE: return WAS;
			case WILL_BE_VALUE: return WILL_BE;
			case AS_USUAL_VALUE: return AS_USUAL;
			case EXCEPTIONAL_VALUE: return EXCEPTIONAL;
			case WTF_VALUE: return WTF;
			case FIRST_TIME_VALUE: return FIRST_TIME;
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
	private TriggerKind(int value, String name, String literal) {
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
	
} //TriggerKind
