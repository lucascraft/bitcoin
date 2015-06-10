/**
 */
package net.sf.smbt.btc.pools.bitminter.impl;

import net.sf.smbt.btc.genericpools.impl.PoolConfigImpl;

import net.sf.smbt.btc.pools.bitminter.BitMinterConfig;
import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.PoolRound;
import net.sf.smbt.btc.pools.bitminter.PoolStats;

import net.sf.smbt.btc.pools.bitminter.UserData;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Minter Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl#getStats <em>Stats</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl#getRound <em>Round</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.bitminter.impl.BitMinterConfigImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitMinterConfigImpl extends PoolConfigImpl implements BitMinterConfig {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected PoolStats stats;

	/**
	 * The cached value of the '{@link #getRound() <em>Round</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRound()
	 * @generated
	 * @ordered
	 */
	protected PoolRound round;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected UserData data;

	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final Object SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Object selection = SELECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitMinterConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BitminterPackage.Literals.BIT_MINTER_CONFIG;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.BIT_MINTER_CONFIG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolStats getStats() {
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStats(PoolStats newStats, NotificationChain msgs) {
		PoolStats oldStats = stats;
		stats = newStats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BitminterPackage.BIT_MINTER_CONFIG__STATS, oldStats, newStats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStats(PoolStats newStats) {
		if (newStats != stats) {
			NotificationChain msgs = null;
			if (stats != null)
				msgs = ((InternalEObject)stats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BitminterPackage.BIT_MINTER_CONFIG__STATS, null, msgs);
			if (newStats != null)
				msgs = ((InternalEObject)newStats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BitminterPackage.BIT_MINTER_CONFIG__STATS, null, msgs);
			msgs = basicSetStats(newStats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.BIT_MINTER_CONFIG__STATS, newStats, newStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolRound getRound() {
		return round;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRound(PoolRound newRound, NotificationChain msgs) {
		PoolRound oldRound = round;
		round = newRound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BitminterPackage.BIT_MINTER_CONFIG__ROUND, oldRound, newRound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRound(PoolRound newRound) {
		if (newRound != round) {
			NotificationChain msgs = null;
			if (round != null)
				msgs = ((InternalEObject)round).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BitminterPackage.BIT_MINTER_CONFIG__ROUND, null, msgs);
			if (newRound != null)
				msgs = ((InternalEObject)newRound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BitminterPackage.BIT_MINTER_CONFIG__ROUND, null, msgs);
			msgs = basicSetRound(newRound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.BIT_MINTER_CONFIG__ROUND, newRound, newRound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(UserData newData, NotificationChain msgs) {
		UserData oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BitminterPackage.BIT_MINTER_CONFIG__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(UserData newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BitminterPackage.BIT_MINTER_CONFIG__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BitminterPackage.BIT_MINTER_CONFIG__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.BIT_MINTER_CONFIG__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Object newSelection) {
		Object oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BitminterPackage.BIT_MINTER_CONFIG__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BitminterPackage.BIT_MINTER_CONFIG__STATS:
				return basicSetStats(null, msgs);
			case BitminterPackage.BIT_MINTER_CONFIG__ROUND:
				return basicSetRound(null, msgs);
			case BitminterPackage.BIT_MINTER_CONFIG__DATA:
				return basicSetData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BitminterPackage.BIT_MINTER_CONFIG__NAME:
				return getName();
			case BitminterPackage.BIT_MINTER_CONFIG__STATS:
				return getStats();
			case BitminterPackage.BIT_MINTER_CONFIG__ROUND:
				return getRound();
			case BitminterPackage.BIT_MINTER_CONFIG__DATA:
				return getData();
			case BitminterPackage.BIT_MINTER_CONFIG__SELECTION:
				return getSelection();
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
			case BitminterPackage.BIT_MINTER_CONFIG__NAME:
				setName((String)newValue);
				return;
			case BitminterPackage.BIT_MINTER_CONFIG__STATS:
				setStats((PoolStats)newValue);
				return;
			case BitminterPackage.BIT_MINTER_CONFIG__ROUND:
				setRound((PoolRound)newValue);
				return;
			case BitminterPackage.BIT_MINTER_CONFIG__DATA:
				setData((UserData)newValue);
				return;
			case BitminterPackage.BIT_MINTER_CONFIG__SELECTION:
				setSelection(newValue);
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
			case BitminterPackage.BIT_MINTER_CONFIG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BitminterPackage.BIT_MINTER_CONFIG__STATS:
				setStats((PoolStats)null);
				return;
			case BitminterPackage.BIT_MINTER_CONFIG__ROUND:
				setRound((PoolRound)null);
				return;
			case BitminterPackage.BIT_MINTER_CONFIG__DATA:
				setData((UserData)null);
				return;
			case BitminterPackage.BIT_MINTER_CONFIG__SELECTION:
				setSelection(SELECTION_EDEFAULT);
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
			case BitminterPackage.BIT_MINTER_CONFIG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BitminterPackage.BIT_MINTER_CONFIG__STATS:
				return stats != null;
			case BitminterPackage.BIT_MINTER_CONFIG__ROUND:
				return round != null;
			case BitminterPackage.BIT_MINTER_CONFIG__DATA:
				return data != null;
			case BitminterPackage.BIT_MINTER_CONFIG__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", selection: ");
		result.append(selection);
		result.append(')');
		return result.toString();
	}

} //BitMinterConfigImpl
