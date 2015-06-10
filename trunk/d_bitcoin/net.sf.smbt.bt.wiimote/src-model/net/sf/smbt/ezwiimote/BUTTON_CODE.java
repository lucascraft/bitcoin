/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BUTTON CODE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezwiimote.EzwiimotePackage#getBUTTON_CODE()
 * @model
 * @generated
 */
public enum BUTTON_CODE implements Enumerator {
	/**
	 * The '<em><b>BUTTON A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_A_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_A(2048, "BUTTON_A", "BUTTON_A"),

	/**
	 * The '<em><b>BUTTON Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_Y_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_Y(8192, "BUTTON_Y", "BUTTON_Y"),

	/**
	 * The '<em><b>BUTTON ZL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_ZL_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_ZL(32768, "BUTTON_ZL", "BUTTON_ZL"),

	/**
	 * The '<em><b>BUTTON ZR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_ZR_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_ZR(1024, "BUTTON_ZR", "BUTTON_ZR"), /**
	 * The '<em><b>BUTTON HOME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_HOME_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_HOME(32768, "BUTTON_HOME", "BUTTON_HOME"), /**
	 * The '<em><b>BUTTON MINUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_MINUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_MINUS(4096, "BUTTON_MINUS", "BUTTON_MINUS"), /**
	 * The '<em><b>BUTTON PLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_PLUS(16, "BUTTON_PLUS", "BUTTON_PLUS"), /**
	 * The '<em><b>BUTTON LEFT TRIGGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_LEFT_TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_LEFT_TRIGGER(32, "BUTTON_LEFT_TRIGGER", "BUTTON_LEFT_TRIGGER"), /**
	 * The '<em><b>BUTTON RIGHT TRIGGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_RIGHT_TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_RIGHT_TRIGGER(2, "BUTTON_RIGHT_TRIGGER", "BUTTON_RIGHT_TRIGGER"), /**
	 * The '<em><b>BUTTON B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_B_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_B(1024, "BUTTON_B", "BUTTON_B"), /**
	 * The '<em><b>BUTTON X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_X_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_X(2048, "BUTTON_X", "BUTTON_X"),

	/**
	 * The '<em><b>DPAD DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPAD_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DPAD_DOWN(4, "D_PAD_DOWN", "D_PAD_DOWN"),

	/**
	 * The '<em><b>DPAD LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPAD_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	DPAD_LEFT(1, "D_PAD_LEFT", "D_PAD_LEFT"),

	/**
	 * The '<em><b>DPAD RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPAD_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	DPAD_RIGHT(2, "D_PAD_RIGHT", "D_PAD_RIGHT"),

	/**
	 * The '<em><b>DPAD UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPAD_UP_VALUE
	 * @generated
	 * @ordered
	 */
	DPAD_UP(8, "D_PAD_UP", "D_PAD_UP"),

	/**
	 * The '<em><b>NO BUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	NO_BUTTON(0, "NO_BUTTON", "NO_BUTTON"), /**
	 * The '<em><b>BUTTON ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_ONE(512, "BUTTON_ONE", "BUTTON_ONE"), /**
	 * The '<em><b>BUTTON TWO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_TWO_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_TWO(256, "BUTTON_TWO", "BUTTON_TWO");

	/**
	 * The '<em><b>BUTTON A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_A_VALUE = 2048;

	/**
	 * The '<em><b>BUTTON Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_Y
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_Y_VALUE = 8192;

	/**
	 * The '<em><b>BUTTON ZL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON ZL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_ZL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_ZL_VALUE = 32768;

	/**
	 * The '<em><b>BUTTON ZR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON ZR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_ZR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_ZR_VALUE = 1024;

	/**
	 * The '<em><b>BUTTON HOME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON HOME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_HOME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_HOME_VALUE = 32768;

	/**
	 * The '<em><b>BUTTON MINUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON MINUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_MINUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_MINUS_VALUE = 4096;

	/**
	 * The '<em><b>BUTTON PLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON PLUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_PLUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_PLUS_VALUE = 16;

	/**
	 * The '<em><b>BUTTON LEFT TRIGGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON LEFT TRIGGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_LEFT_TRIGGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_LEFT_TRIGGER_VALUE = 32;

	/**
	 * The '<em><b>BUTTON RIGHT TRIGGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON RIGHT TRIGGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_RIGHT_TRIGGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_RIGHT_TRIGGER_VALUE = 2;

	/**
	 * The '<em><b>BUTTON B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_B_VALUE = 1024;

	/**
	 * The '<em><b>BUTTON X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON X</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_X
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_X_VALUE = 2048;

	/**
	 * The '<em><b>DPAD DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPAD DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPAD_DOWN
	 * @model name="D_PAD_DOWN"
	 * @generated
	 * @ordered
	 */
	public static final int DPAD_DOWN_VALUE = 4;

	/**
	 * The '<em><b>DPAD LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPAD LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPAD_LEFT
	 * @model name="D_PAD_LEFT"
	 * @generated
	 * @ordered
	 */
	public static final int DPAD_LEFT_VALUE = 1;

	/**
	 * The '<em><b>DPAD RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPAD RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPAD_RIGHT
	 * @model name="D_PAD_RIGHT"
	 * @generated
	 * @ordered
	 */
	public static final int DPAD_RIGHT_VALUE = 2;

	/**
	 * The '<em><b>DPAD UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPAD UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPAD_UP
	 * @model name="D_PAD_UP"
	 * @generated
	 * @ordered
	 */
	public static final int DPAD_UP_VALUE = 8;

	/**
	 * The '<em><b>NO BUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO BUTTON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_BUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_BUTTON_VALUE = 0;

	/**
	 * The '<em><b>BUTTON ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_ONE_VALUE = 512;

	/**
	 * The '<em><b>BUTTON TWO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON TWO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_TWO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_TWO_VALUE = 256;

	/**
	 * An array of all the '<em><b>BUTTON CODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BUTTON_CODE[] VALUES_ARRAY =
		new BUTTON_CODE[] {
			BUTTON_A,
			BUTTON_Y,
			BUTTON_ZL,
			BUTTON_ZR,
			BUTTON_HOME,
			BUTTON_MINUS,
			BUTTON_PLUS,
			BUTTON_LEFT_TRIGGER,
			BUTTON_RIGHT_TRIGGER,
			BUTTON_B,
			BUTTON_X,
			DPAD_DOWN,
			DPAD_LEFT,
			DPAD_RIGHT,
			DPAD_UP,
			NO_BUTTON,
			BUTTON_ONE,
			BUTTON_TWO,
		};

	/**
	 * A public read-only list of all the '<em><b>BUTTON CODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BUTTON_CODE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BUTTON CODE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BUTTON_CODE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BUTTON_CODE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BUTTON CODE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BUTTON_CODE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BUTTON_CODE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BUTTON CODE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BUTTON_CODE get(int value) {
		switch (value) {
			case BUTTON_A_VALUE: return BUTTON_A;
			case BUTTON_Y_VALUE: return BUTTON_Y;
			case BUTTON_ZL_VALUE: return BUTTON_ZL;
			case BUTTON_ZR_VALUE: return BUTTON_ZR;
			case BUTTON_MINUS_VALUE: return BUTTON_MINUS;
			case BUTTON_PLUS_VALUE: return BUTTON_PLUS;
			case BUTTON_LEFT_TRIGGER_VALUE: return BUTTON_LEFT_TRIGGER;
			case BUTTON_RIGHT_TRIGGER_VALUE: return BUTTON_RIGHT_TRIGGER;
			case DPAD_DOWN_VALUE: return DPAD_DOWN;
			case DPAD_LEFT_VALUE: return DPAD_LEFT;
			case DPAD_UP_VALUE: return DPAD_UP;
			case NO_BUTTON_VALUE: return NO_BUTTON;
			case BUTTON_ONE_VALUE: return BUTTON_ONE;
			case BUTTON_TWO_VALUE: return BUTTON_TWO;
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
	private BUTTON_CODE(int value, String name, String literal) {
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
	
} //BUTTON_CODE
