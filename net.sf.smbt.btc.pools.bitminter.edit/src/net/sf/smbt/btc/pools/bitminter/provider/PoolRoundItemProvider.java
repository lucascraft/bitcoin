/**
 */
package net.sf.smbt.btc.pools.bitminter.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.btc.pools.bitminter.BitminterFactory;
import net.sf.smbt.btc.pools.bitminter.BitminterPackage;
import net.sf.smbt.btc.pools.bitminter.PoolRound;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.btc.pools.bitminter.PoolRound} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PoolRoundItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolRoundItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHashRatePropertyDescriptor(object);
			addActiveWorkersPropertyDescriptor(object);
			addActiveUsersPropertyDescriptor(object);
			addShiftAcceptedPropertyDescriptor(object);
			addShiftRejectedPropertyDescriptor(object);
			addShiftDurationPropertyDescriptor(object);
			addShiftScorePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hash Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHashRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoolRound_hashRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoolRound_hashRate_feature", "_UI_PoolRound_type"),
				 BitminterPackage.Literals.POOL_ROUND__HASH_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active Workers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveWorkersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoolRound_activeWorkers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoolRound_activeWorkers_feature", "_UI_PoolRound_type"),
				 BitminterPackage.Literals.POOL_ROUND__ACTIVE_WORKERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active Users feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveUsersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoolRound_activeUsers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoolRound_activeUsers_feature", "_UI_PoolRound_type"),
				 BitminterPackage.Literals.POOL_ROUND__ACTIVE_USERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shift Accepted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShiftAcceptedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoolRound_shiftAccepted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoolRound_shiftAccepted_feature", "_UI_PoolRound_type"),
				 BitminterPackage.Literals.POOL_ROUND__SHIFT_ACCEPTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shift Rejected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShiftRejectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoolRound_shiftRejected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoolRound_shiftRejected_feature", "_UI_PoolRound_type"),
				 BitminterPackage.Literals.POOL_ROUND__SHIFT_REJECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shift Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShiftDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoolRound_shiftDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoolRound_shiftDuration_feature", "_UI_PoolRound_type"),
				 BitminterPackage.Literals.POOL_ROUND__SHIFT_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shift Score feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShiftScorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PoolRound_shiftScore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PoolRound_shiftScore_feature", "_UI_PoolRound_type"),
				 BitminterPackage.Literals.POOL_ROUND__SHIFT_SCORE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BitminterPackage.Literals.POOL_ROUND__CHAINS);
			childrenFeatures.add(BitminterPackage.Literals.POOL_ROUND__ROUND_HASH_RATES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PoolRound.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PoolRound"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PoolRound poolRound = (PoolRound)object;
		return getString("_UI_PoolRound_type") + " " + poolRound.getHashRate();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PoolRound.class)) {
			case BitminterPackage.POOL_ROUND__HASH_RATE:
			case BitminterPackage.POOL_ROUND__ACTIVE_WORKERS:
			case BitminterPackage.POOL_ROUND__ACTIVE_USERS:
			case BitminterPackage.POOL_ROUND__SHIFT_ACCEPTED:
			case BitminterPackage.POOL_ROUND__SHIFT_REJECTED:
			case BitminterPackage.POOL_ROUND__SHIFT_DURATION:
			case BitminterPackage.POOL_ROUND__SHIFT_SCORE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BitminterPackage.POOL_ROUND__CHAINS:
			case BitminterPackage.POOL_ROUND__ROUND_HASH_RATES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BitminterPackage.Literals.POOL_ROUND__CHAINS,
				 BitminterFactory.eINSTANCE.createChain()));

		newChildDescriptors.add
			(createChildParameter
				(BitminterPackage.Literals.POOL_ROUND__ROUND_HASH_RATES,
				 BitminterFactory.eINSTANCE.createRoundHashRate()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BitminterEditPlugin.INSTANCE;
	}

}
