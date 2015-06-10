/**
 */
package net.sf.smbt.btc.mtgox;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Wallet Right</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btc.mtgox.MtgoxPackage#getWalletRight()
 * @model
 * @generated
 */
public enum WalletRight implements Enumerator {
	/**
	 * The '<em><b>DEPOSIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPOSIT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPOSIT(0, "DEPOSIT", "DEPOSIT"),

	/**
	 * The '<em><b>GET INFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	GET_INFO(1, "GET_INFO", "GET_INFO"),

	/**
	 * The '<em><b>TRADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRADE_VALUE
	 * @generated
	 * @ordered
	 */
	TRADE(2, "TRADE", "TRADE"),

	/**
	 * The '<em><b>MERCHANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERCHANT_VALUE
	 * @generated
	 * @ordered
	 */
	MERCHANT(3, "MERCHANT", "MERCHANT"),

	/**
	 * The '<em><b>WITHDRAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAW_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAW(4, "WITHDRAW", "WITHDRAW");

	/**
	 * The '<em><b>DEPOSIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPOSIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPOSIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPOSIT_VALUE = 0;

	/**
	 * The '<em><b>GET INFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET INFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_INFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_INFO_VALUE = 1;

	/**
	 * The '<em><b>TRADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRADE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRADE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRADE_VALUE = 2;

	/**
	 * The '<em><b>MERCHANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MERCHANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MERCHANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_VALUE = 3;

	/**
	 * The '<em><b>WITHDRAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WITHDRAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WITHDRAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAW_VALUE = 4;

	/**
	 * An array of all the '<em><b>Wallet Right</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WalletRight[] VALUES_ARRAY =
		new WalletRight[] {
			DEPOSIT,
			GET_INFO,
			TRADE,
			MERCHANT,
			WITHDRAW,
		};

	/**
	 * A public read-only list of all the '<em><b>Wallet Right</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WalletRight> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wallet Right</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WalletRight get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WalletRight result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wallet Right</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WalletRight getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WalletRight result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wallet Right</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WalletRight get(int value) {
		switch (value) {
			case DEPOSIT_VALUE: return DEPOSIT;
			case GET_INFO_VALUE: return GET_INFO;
			case TRADE_VALUE: return TRADE;
			case MERCHANT_VALUE: return MERCHANT;
			case WITHDRAW_VALUE: return WITHDRAW;
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
	private WalletRight(int value, String name, String literal) {
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
	
} //WalletRight
