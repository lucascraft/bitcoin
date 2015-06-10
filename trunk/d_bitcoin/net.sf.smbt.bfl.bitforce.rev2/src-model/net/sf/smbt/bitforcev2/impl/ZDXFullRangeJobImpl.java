/**
 */
package net.sf.smbt.bitforcev2.impl;

import net.sf.smbt.bitforcev2.Bitforcev2Package;
import net.sf.smbt.bitforcev2.ZDXFullRangeJob;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZDX Full Range Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZDXFullRangeJobImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZDXFullRangeJobImpl#getMidState <em>Mid State</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZDXFullRangeJobImpl#getBlockState <em>Block State</em>}</li>
 *   <li>{@link net.sf.smbt.bitforcev2.impl.ZDXFullRangeJobImpl#getEOB <em>EOB</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZDXFullRangeJobImpl extends BFLCmdImpl implements ZDXFullRangeJob {
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
	 * The default value of the '{@link #getBlockState() <em>Block State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockState()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BLOCK_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockState() <em>Block State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockState()
	 * @generated
	 * @ordered
	 */
	protected byte[] blockState = BLOCK_STATE_EDEFAULT;

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
	protected ZDXFullRangeJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bitforcev2Package.Literals.ZDX_FULL_RANGE_JOB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZDX_FULL_RANGE_JOB__DATA_SIZE, oldDataSize, dataSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZDX_FULL_RANGE_JOB__MID_STATE, oldMidState, midState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBlockState() {
		return blockState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockState(byte[] newBlockState) {
		byte[] oldBlockState = blockState;
		blockState = newBlockState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZDX_FULL_RANGE_JOB__BLOCK_STATE, oldBlockState, blockState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Bitforcev2Package.ZDX_FULL_RANGE_JOB__EOB, oldEOB, eob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__DATA_SIZE:
				return getDataSize();
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__MID_STATE:
				return getMidState();
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__BLOCK_STATE:
				return getBlockState();
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__EOB:
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
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__DATA_SIZE:
				setDataSize((Byte)newValue);
				return;
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__MID_STATE:
				setMidState((byte[])newValue);
				return;
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__BLOCK_STATE:
				setBlockState((byte[])newValue);
				return;
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__EOB:
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
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__DATA_SIZE:
				setDataSize(DATA_SIZE_EDEFAULT);
				return;
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__MID_STATE:
				setMidState(MID_STATE_EDEFAULT);
				return;
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__BLOCK_STATE:
				setBlockState(BLOCK_STATE_EDEFAULT);
				return;
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__EOB:
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
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__DATA_SIZE:
				return dataSize != DATA_SIZE_EDEFAULT;
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__MID_STATE:
				return MID_STATE_EDEFAULT == null ? midState != null : !MID_STATE_EDEFAULT.equals(midState);
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__BLOCK_STATE:
				return BLOCK_STATE_EDEFAULT == null ? blockState != null : !BLOCK_STATE_EDEFAULT.equals(blockState);
			case Bitforcev2Package.ZDX_FULL_RANGE_JOB__EOB:
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
		result.append(", blockState: ");
		result.append(blockState);
		result.append(", EOB: ");
		result.append(eob);
		result.append(')');
		return result.toString();
	}

} //ZDXFullRangeJobImpl
