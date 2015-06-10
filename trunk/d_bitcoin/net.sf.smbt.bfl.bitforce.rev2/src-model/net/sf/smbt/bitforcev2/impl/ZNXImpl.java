/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.ZNX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZNX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZNXImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZNXImpl#getMidState <em>Mid State</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZNXImpl#getBlockData <em>Block Data</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZNXImpl#getEOB <em>EOB</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZNXImpl extends BFLCmdImpl implements ZNX {
	/**
	 * The default value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final byte DATA_SIZE_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected byte dataSize = DATA_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMidState() <em>Mid State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidState()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] MID_STATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMidState() <em>Mid State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidState()
	 * @generated
	 * @ordered
	 */
	protected byte[] midState = MID_STATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getBlockData() <em>Block Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BLOCK_DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBlockData() <em>Block Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockData()
	 * @generated
	 * @ordered
	 */
	protected byte[] blockData = BLOCK_DATA_EDEFAULT;
	/**
	 * The default value of the '{@link #getEOB() <em>EOB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOB()
	 * @generated
	 * @ordered
	 */
	protected static final byte EOB_EDEFAULT = 0x00;
	/**
	 * The cached value of the '{@link #getEOB() <em>EOB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOB()
	 * @generated
	 * @ordered
	 */
	protected byte eob = EOB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZNXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.ZNX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDataSize() {
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSize(byte newDataSize) {
		byte oldDataSize = dataSize;
		dataSize = newDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZNX__DATA_SIZE, oldDataSize, dataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMidState() {
		return midState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidState(byte[] newMidState) {
		byte[] oldMidState = midState;
		midState = newMidState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZNX__MID_STATE, oldMidState, midState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBlockData() {
		return blockData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockData(byte[] newBlockData) {
		byte[] oldBlockData = blockData;
		blockData = newBlockData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZNX__BLOCK_DATA, oldBlockData, blockData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getEOB() {
		return eob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOB(byte newEOB) {
		byte oldEOB = eob;
		eob = newEOB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZNX__EOB, oldEOB, eob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.ZNX__DATA_SIZE:
				return getDataSize();
			case Bitforcev2Package.ZNX__MID_STATE:
				return getMidState();
			case Bitforcev2Package.ZNX__BLOCK_DATA:
				return getBlockData();
			case Bitforcev2Package.ZNX__EOB:
				return getEOB();
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
			case Bitforcev2Package.ZNX__DATA_SIZE:
				setDataSize((Byte)newValue);
				return;
			case Bitforcev2Package.ZNX__MID_STATE:
				setMidState((byte[])newValue);
				return;
			case Bitforcev2Package.ZNX__BLOCK_DATA:
				setBlockData((byte[])newValue);
				return;
			case Bitforcev2Package.ZNX__EOB:
				setEOB((Byte)newValue);
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
			case Bitforcev2Package.ZNX__DATA_SIZE:
				setDataSize(DATA_SIZE_EDEFAULT);
				return;
			case Bitforcev2Package.ZNX__MID_STATE:
				setMidState(MID_STATE_EDEFAULT);
				return;
			case Bitforcev2Package.ZNX__BLOCK_DATA:
				setBlockData(BLOCK_DATA_EDEFAULT);
				return;
			case Bitforcev2Package.ZNX__EOB:
				setEOB(EOB_EDEFAULT);
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
			case Bitforcev2Package.ZNX__DATA_SIZE:
				return dataSize != DATA_SIZE_EDEFAULT;
			case Bitforcev2Package.ZNX__MID_STATE:
				return MID_STATE_EDEFAULT == null ? midState != null : !MID_STATE_EDEFAULT.equals(midState);
			case Bitforcev2Package.ZNX__BLOCK_DATA:
				return BLOCK_DATA_EDEFAULT == null ? blockData != null : !BLOCK_DATA_EDEFAULT.equals(blockData);
			case Bitforcev2Package.ZNX__EOB:
				return eob != EOB_EDEFAULT;
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
		result.append(" (dataSize: ");
		result.append(dataSize);
		result.append(", midState: ");
		result.append(midState);
		result.append(", blockData: ");
		result.append(blockData);
		result.append(", EOB: ");
		result.append(eob);
		result.append(')');
		return result.toString();
	}

} //ZNXImpl
