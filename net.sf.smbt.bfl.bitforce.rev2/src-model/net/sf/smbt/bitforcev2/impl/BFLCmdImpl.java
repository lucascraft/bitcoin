/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.BFLCmd;
import net.sf.smbt.bitforcev2.BFLCmdKind;
import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BFL Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.BFLCmdImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.BFLCmdImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.BFLCmdImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.BFLCmdImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.BFLCmdImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BFLCmdImpl extends CmdImpl implements BFLCmd {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final BFLCmdKind KIND_EDEFAULT = BFLCmdKind.ZGX;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected BFLCmdKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final byte ADDR_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected byte addr = ADDR_EDEFAULT;
	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final byte HEADER_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected byte header = HEADER_EDEFAULT;
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final byte LENGTH_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected byte length = LENGTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected byte[] data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BFLCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.BFL_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFLCmdKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(BFLCmdKind newKind) {
		BFLCmdKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.BFL_CMD__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(byte newAddr) {
		byte oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.BFL_CMD__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(byte newHeader) {
		byte oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.BFL_CMD__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(byte newLength) {
		byte oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.BFL_CMD__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		byte[] oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.BFL_CMD__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.BFL_CMD__KIND:
				return getKind();
			case Bitforcev2Package.BFL_CMD__ADDR:
				return getAddr();
			case Bitforcev2Package.BFL_CMD__HEADER:
				return getHeader();
			case Bitforcev2Package.BFL_CMD__LENGTH:
				return getLength();
			case Bitforcev2Package.BFL_CMD__DATA:
				return getData();
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
			case Bitforcev2Package.BFL_CMD__KIND:
				setKind((BFLCmdKind)newValue);
				return;
			case Bitforcev2Package.BFL_CMD__ADDR:
				setAddr((Byte)newValue);
				return;
			case Bitforcev2Package.BFL_CMD__HEADER:
				setHeader((Byte)newValue);
				return;
			case Bitforcev2Package.BFL_CMD__LENGTH:
				setLength((Byte)newValue);
				return;
			case Bitforcev2Package.BFL_CMD__DATA:
				setData((byte[])newValue);
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
			case Bitforcev2Package.BFL_CMD__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case Bitforcev2Package.BFL_CMD__ADDR:
				setAddr(ADDR_EDEFAULT);
				return;
			case Bitforcev2Package.BFL_CMD__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case Bitforcev2Package.BFL_CMD__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Bitforcev2Package.BFL_CMD__DATA:
				setData(DATA_EDEFAULT);
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
			case Bitforcev2Package.BFL_CMD__KIND:
				return kind != KIND_EDEFAULT;
			case Bitforcev2Package.BFL_CMD__ADDR:
				return addr != ADDR_EDEFAULT;
			case Bitforcev2Package.BFL_CMD__HEADER:
				return header != HEADER_EDEFAULT;
			case Bitforcev2Package.BFL_CMD__LENGTH:
				return length != LENGTH_EDEFAULT;
			case Bitforcev2Package.BFL_CMD__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", addr: ");
		result.append(addr);
		result.append(", header: ");
		result.append(header);
		result.append(", length: ");
		result.append(length);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //BFLCmdImpl
