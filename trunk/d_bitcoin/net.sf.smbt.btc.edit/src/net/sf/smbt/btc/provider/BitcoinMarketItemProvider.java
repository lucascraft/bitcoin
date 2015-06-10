/**
 */
package net.sf.smbt.btc.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.BtcFactory;
import net.sf.smbt.btc.BtcPackage;

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
 * This is the item provider adapter for a {@link net.sf.smbt.btc.BitcoinMarket} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BitcoinMarketItemProvider
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
	public BitcoinMarketItemProvider(AdapterFactory adapterFactory) {
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

			addBrokerPropertyDescriptor(object);
			addHighPropertyDescriptor(object);
			addLowPropertyDescriptor(object);
			addVolumePropertyDescriptor(object);
			addBuyPropertyDescriptor(object);
			addSellPropertyDescriptor(object);
			addLastPropertyDescriptor(object);
			addCurrencyPropertyDescriptor(object);
			addHistoryPropertyDescriptor(object);
			addWalletsPropertyDescriptor(object);
			addAveragePropertyDescriptor(object);
			addLastLocalPropertyDescriptor(object);
			addLastOrigPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Broker feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrokerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_broker_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_broker_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__BROKER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the High feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHighPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_high_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_high_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__HIGH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_low_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_low_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__LOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_volume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_volume_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__VOLUME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Buy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_buy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_buy_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__BUY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSellPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_sell_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_sell_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__SELL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_last_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_last_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__LAST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Currency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_currency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_currency_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__CURRENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the History feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_history_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_history_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__HISTORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wallets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWalletsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_wallets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_wallets_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__WALLETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Average feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAveragePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_average_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_average_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__AVERAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Local feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastLocalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_lastLocal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_lastLocal_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__LAST_LOCAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Orig feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastOrigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BitcoinMarket_lastOrig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BitcoinMarket_lastOrig_feature", "_UI_BitcoinMarket_type"),
				 BtcPackage.Literals.BITCOIN_MARKET__LAST_ORIG,
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
			childrenFeatures.add(BtcPackage.Literals.BITCOIN_MARKET__EXCHANGE_RATES);
			childrenFeatures.add(BtcPackage.Literals.BITCOIN_MARKET__ORDERS);
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
	 * This returns BitcoinMarket.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BitcoinMarket"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BitcoinMarket)object).getBroker();
		return label == null || label.length() == 0 ?
			getString("_UI_BitcoinMarket_type") :
			getString("_UI_BitcoinMarket_type") + " " + label;
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

		switch (notification.getFeatureID(BitcoinMarket.class)) {
			case BtcPackage.BITCOIN_MARKET__BROKER:
			case BtcPackage.BITCOIN_MARKET__HIGH:
			case BtcPackage.BITCOIN_MARKET__LOW:
			case BtcPackage.BITCOIN_MARKET__VOLUME:
			case BtcPackage.BITCOIN_MARKET__BUY:
			case BtcPackage.BITCOIN_MARKET__SELL:
			case BtcPackage.BITCOIN_MARKET__LAST:
			case BtcPackage.BITCOIN_MARKET__CURRENCY:
			case BtcPackage.BITCOIN_MARKET__AVERAGE:
			case BtcPackage.BITCOIN_MARKET__LAST_LOCAL:
			case BtcPackage.BITCOIN_MARKET__LAST_ORIG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BtcPackage.BITCOIN_MARKET__EXCHANGE_RATES:
			case BtcPackage.BITCOIN_MARKET__ORDERS:
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
				(BtcPackage.Literals.BITCOIN_MARKET__EXCHANGE_RATES,
				 BtcFactory.eINSTANCE.createExchangeRate()));

		newChildDescriptors.add
			(createChildParameter
				(BtcPackage.Literals.BITCOIN_MARKET__ORDERS,
				 BtcFactory.eINSTANCE.createOrder()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BtcEditPlugin.INSTANCE;
	}

}
