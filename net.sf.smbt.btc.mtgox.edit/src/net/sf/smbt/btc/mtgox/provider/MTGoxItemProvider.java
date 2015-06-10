/**
 */
package net.sf.smbt.btc.mtgox.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.btc.BtcFactory;
import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.btc.mtgox.MtgoxFactory;
import net.sf.smbt.btc.mtgox.MtgoxPackage;

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
 * This is the item provider adapter for a {@link net.sf.smbt.btc.mtgox.MTGox} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MTGoxItemProvider
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
	public MTGoxItemProvider(AdapterFactory adapterFactory) {
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

			addLoginPropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addApiKeyPropertyDescriptor(object);
			addCurrencyPropertyDescriptor(object);
			addFeeRatePropertyDescriptor(object);
			addTrendPropertyDescriptor(object);
			addWalletPropertyDescriptor(object);
			addSalesPropertyDescriptor(object);
			addSocketioConnectedPropertyDescriptor(object);
			addBidsPropertyDescriptor(object);
			addAsksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Login feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_login_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_login_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__LOGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_password_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Api Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_apiKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_apiKey_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__API_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_MTGox_currency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_currency_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__CURRENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fee Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeeRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_feeRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_feeRate_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__FEE_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trend feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_trend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_trend_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__TREND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wallet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWalletPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_wallet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_wallet_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__WALLET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sales feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSalesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_sales_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_sales_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__SALES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Socketio Connected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSocketioConnectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_socketioConnected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_socketioConnected_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__SOCKETIO_CONNECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bids feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBidsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_bids_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_bids_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__BIDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Asks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MTGox_asks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MTGox_asks_feature", "_UI_MTGox_type"),
				 MtgoxPackage.Literals.MT_GOX__ASKS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(MtgoxPackage.Literals.MT_GOX__MARKET);
			childrenFeatures.add(MtgoxPackage.Literals.MT_GOX__HIGH_V);
			childrenFeatures.add(MtgoxPackage.Literals.MT_GOX__LOW_V);
			childrenFeatures.add(MtgoxPackage.Literals.MT_GOX__SELL_V);
			childrenFeatures.add(MtgoxPackage.Literals.MT_GOX__BUY_V);
			childrenFeatures.add(MtgoxPackage.Literals.MT_GOX__LAST_V);
			childrenFeatures.add(MtgoxPackage.Literals.MT_GOX__VOLUME_V);
			childrenFeatures.add(MtgoxPackage.Literals.MT_GOX__FETCHS);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * This returns MTGox.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MTGox"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MTGox)object).getLogin();
		return label == null || label.length() == 0 ?
			getString("_UI_MTGox_type") :
			getString("_UI_MTGox_type") + " " + label;
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

		switch (notification.getFeatureID(MTGox.class)) {
			case MtgoxPackage.MT_GOX__LOGIN:
			case MtgoxPackage.MT_GOX__PASSWORD:
			case MtgoxPackage.MT_GOX__API_KEY:
			case MtgoxPackage.MT_GOX__CURRENCY:
			case MtgoxPackage.MT_GOX__FEE_RATE:
			case MtgoxPackage.MT_GOX__SOCKETIO_CONNECTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MtgoxPackage.MT_GOX__MARKET:
			case MtgoxPackage.MT_GOX__HIGH_V:
			case MtgoxPackage.MT_GOX__LOW_V:
			case MtgoxPackage.MT_GOX__SELL_V:
			case MtgoxPackage.MT_GOX__BUY_V:
			case MtgoxPackage.MT_GOX__LAST_V:
			case MtgoxPackage.MT_GOX__VOLUME_V:
			case MtgoxPackage.MT_GOX__FETCHS:
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
				(MtgoxPackage.Literals.MT_GOX__MARKET,
				 BtcFactory.eINSTANCE.createBitcoinMarket()));

		newChildDescriptors.add
			(createChildParameter
				(MtgoxPackage.Literals.MT_GOX__HIGH_V,
				 MtgoxFactory.eINSTANCE.createCompactValue()));

		newChildDescriptors.add
			(createChildParameter
				(MtgoxPackage.Literals.MT_GOX__LOW_V,
				 MtgoxFactory.eINSTANCE.createCompactValue()));

		newChildDescriptors.add
			(createChildParameter
				(MtgoxPackage.Literals.MT_GOX__SELL_V,
				 MtgoxFactory.eINSTANCE.createCompactValue()));

		newChildDescriptors.add
			(createChildParameter
				(MtgoxPackage.Literals.MT_GOX__BUY_V,
				 MtgoxFactory.eINSTANCE.createCompactValue()));

		newChildDescriptors.add
			(createChildParameter
				(MtgoxPackage.Literals.MT_GOX__LAST_V,
				 MtgoxFactory.eINSTANCE.createCompactValue()));

		newChildDescriptors.add
			(createChildParameter
				(MtgoxPackage.Literals.MT_GOX__VOLUME_V,
				 MtgoxFactory.eINSTANCE.createCompactValue()));

		newChildDescriptors.add
			(createChildParameter
				(MtgoxPackage.Literals.MT_GOX__FETCHS,
				 MtgoxFactory.eINSTANCE.createFetchValue()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MtgoxPackage.Literals.MT_GOX__HIGH_V ||
			childFeature == MtgoxPackage.Literals.MT_GOX__LOW_V ||
			childFeature == MtgoxPackage.Literals.MT_GOX__SELL_V ||
			childFeature == MtgoxPackage.Literals.MT_GOX__BUY_V ||
			childFeature == MtgoxPackage.Literals.MT_GOX__LAST_V ||
			childFeature == MtgoxPackage.Literals.MT_GOX__VOLUME_V;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MtgoxEditPlugin.INSTANCE;
	}

}
