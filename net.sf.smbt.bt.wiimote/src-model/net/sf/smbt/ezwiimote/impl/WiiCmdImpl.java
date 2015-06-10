/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezwiimote.impl;

import net.sf.smbt.ezwiimote.EzwiimotePackage;
import net.sf.smbt.ezwiimote.WiiCmd;

import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCmdImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link net.sf.smbt.ezwiimote.impl.WiiCmdImpl#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiCmdImpl extends CmdImpl implements WiiCmd {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final byte TAG_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected byte tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytes() <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytes()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytes() <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytes()
	 * @generated
	 * @ordered
	 */
	protected byte[] bytes = BYTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzwiimotePackage.Literals.WII_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(byte newTag) {
		byte oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CMD__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBytes() {
		return bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBytes(byte[] newBytes) {
		byte[] oldBytes = bytes;
		bytes = newBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzwiimotePackage.WII_CMD__BYTES, oldBytes, bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzwiimotePackage.WII_CMD__TAG:
				return getTag();
			case EzwiimotePackage.WII_CMD__BYTES:
				return getBytes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzwiimotePackage.WII_CMD__TAG:
				setTag((Byte)newValue);
				return;
			case EzwiimotePackage.WII_CMD__BYTES:
				setBytes((byte[])newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EzwiimotePackage.WII_CMD__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case EzwiimotePackage.WII_CMD__BYTES:
				setBytes(BYTES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EzwiimotePackage.WII_CMD__TAG:
				return tag != TAG_EDEFAULT;
			case EzwiimotePackage.WII_CMD__BYTES:
				return BYTES_EDEFAULT == null ? bytes != null : !BYTES_EDEFAULT.equals(bytes);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tag: ");
		result.append(tag);
		result.append(", bytes: ");
		result.append(bytes);
		result.append(')');
		return result.toString();
	}

} //WiiCmdImpl
