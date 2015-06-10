/**
 */
package net.sf.smbt.btc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Currency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.BtcPackage#getBtcCurrency()
 * @model
 * @generated
 */
public enum BtcCurrency implements Enumerator {
	/**
	 * The '<em><b>EUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUR_VALUE
	 * @generated
	 * @ordered
	 */
	EUR(0, "EUR", "EUR"),

	/**
	 * The '<em><b>USD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USD_VALUE
	 * @generated
	 * @ordered
	 */
	USD(1, "USD", "USD"),

	/**
	 * The '<em><b>BTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTC_VALUE
	 * @generated
	 * @ordered
	 */
	BTC(2, "BTC", "BTC"),

	/**
	 * The '<em><b>GBP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBP_VALUE
	 * @generated
	 * @ordered
	 */
	GBP(3, "GBP", "GBP"),

	/**
	 * The '<em><b>JPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPY_VALUE
	 * @generated
	 * @ordered
	 */
	JPY(4, "JPY", "JPY"),

	/**
	 * The '<em><b>AUD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUD_VALUE
	 * @generated
	 * @ordered
	 */
	AUD(5, "AUD", "AUD"),

	/**
	 * The '<em><b>CAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAD_VALUE
	 * @generated
	 * @ordered
	 */
	CAD(6, "CAD", "CAD"),

	/**
	 * The '<em><b>CHF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHF_VALUE
	 * @generated
	 * @ordered
	 */
	CHF(7, "CHF", "CHF"),

	/**
	 * The '<em><b>CNY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNY_VALUE
	 * @generated
	 * @ordered
	 */
	CNY(8, "CNY", "CNY"),

	/**
	 * The '<em><b>HKD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HKD_VALUE
	 * @generated
	 * @ordered
	 */
	HKD(9, "HKD", "HKD"),

	/**
	 * The '<em><b>PLN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLN_VALUE
	 * @generated
	 * @ordered
	 */
	PLN(10, "PLN", "PLN");

	/**
	 * The '<em><b>EUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUR
	 * @model annotation="symbol UTF-16='U+20AC'"
	 * @generated
	 * @ordered
	 */
	public static final int EUR_VALUE = 0;

	/**
	 * The '<em><b>USD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USD
	 * @model annotation="symbol UTF-16='U+FE69'"
	 * @generated
	 * @ordered
	 */
	public static final int USD_VALUE = 1;

	/**
	 * The '<em><b>BTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BTC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BTC_VALUE = 2;

	/**
	 * The '<em><b>GBP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GBP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GBP
	 * @model annotation="symbol UTF-16='U+00A3'"
	 * @generated
	 * @ordered
	 */
	public static final int GBP_VALUE = 3;

	/**
	 * The '<em><b>JPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPY
	 * @model annotation="symbol UTF-16='U+00A5'"
	 * @generated
	 * @ordered
	 */
	public static final int JPY_VALUE = 4;

	/**
	 * The '<em><b>AUD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUD
	 * @model annotation="symbol UTF-16='U+FE69'"
	 * @generated
	 * @ordered
	 */
	public static final int AUD_VALUE = 5;

	/**
	 * The '<em><b>CAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAD
	 * @model annotation="symbol UTF-16='U+FE69'"
	 * @generated
	 * @ordered
	 */
	public static final int CAD_VALUE = 6;

	/**
	 * The '<em><b>CHF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHF
	 * @model annotation="symbol UTF-16='U+20A3'"
	 * @generated
	 * @ordered
	 */
	public static final int CHF_VALUE = 7;

	/**
	 * The '<em><b>CNY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CNY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CNY
	 * @model annotation="symbol UTF-16='U+00A5'"
	 * @generated
	 * @ordered
	 */
	public static final int CNY_VALUE = 8;

	/**
	 * The '<em><b>HKD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HKD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HKD
	 * @model annotation="symbol UTF-16='U+FE69'"
	 * @generated
	 * @ordered
	 */
	public static final int HKD_VALUE = 9;

	/**
	 * The '<em><b>PLN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLN
	 * @model annotation="symbol UTF-16='U+FE69'"
	 * @generated
	 * @ordered
	 */
	public static final int PLN_VALUE = 10;

	/**
	 * An array of all the '<em><b>Currency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BtcCurrency[] VALUES_ARRAY =
		new BtcCurrency[] {
			EUR,
			USD,
			BTC,
			GBP,
			JPY,
			AUD,
			CAD,
			CHF,
			CNY,
			HKD,
			PLN,
		};

	/**
	 * A public read-only list of all the '<em><b>Currency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BtcCurrency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtcCurrency get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BtcCurrency result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtcCurrency getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BtcCurrency result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtcCurrency get(int value) {
		switch (value) {
			case EUR_VALUE: return EUR;
			case USD_VALUE: return USD;
			case BTC_VALUE: return BTC;
			case GBP_VALUE: return GBP;
			case JPY_VALUE: return JPY;
			case AUD_VALUE: return AUD;
			case CAD_VALUE: return CAD;
			case CHF_VALUE: return CHF;
			case CNY_VALUE: return CNY;
			case HKD_VALUE: return HKD;
			case PLN_VALUE: return PLN;
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
	private BtcCurrency(int value, String name, String literal) {
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
	
} //BtcCurrency
