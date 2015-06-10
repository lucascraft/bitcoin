/**
 */
package net.sf.smbt.btc.mtgox.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.btc.mtgox.FetchValue;
import net.sf.smbt.btc.mtgox.MtgoxPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
 * This is the item provider adapter for a {@link net.sf.smbt.btc.mtgox.FetchValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FetchValueItemProvider
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
	public FetchValueItemProvider(AdapterFactory adapterFactory) {
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

			addStampPropertyDescriptor(object);
			addPricePropertyDescriptor(object);
			addAmountPropertyDescriptor(object);
			addPriceIntPropertyDescriptor(object);
			addAmountIntPropertyDescriptor(object);
			addTidPropertyDescriptor(object);
			addCurrencyPropertyDescriptor(object);
			addItemPropertyDescriptor(object);
			addTradeTypePropertyDescriptor(object);
			addPrimaryPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Stamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_stamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_stamp_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__STAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_price_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_price_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__PRICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_amount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_amount_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__AMOUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Price Int feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriceIntPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_priceInt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_priceInt_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__PRICE_INT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount Int feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountIntPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_amountInt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_amountInt_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__AMOUNT_INT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_tid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_tid_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__TID,
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
				 getString("_UI_FetchValue_currency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_currency_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__CURRENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_item_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_item_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__ITEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trade Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTradeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_tradeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_tradeType_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__TRADE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_primary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_primary_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__PRIMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FetchValue_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FetchValue_properties_feature", "_UI_FetchValue_type"),
				 MtgoxPackage.Literals.FETCH_VALUE__PROPERTIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
	 * This returns FetchValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FetchValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		FetchValue fetchValue = (FetchValue)object;
		return getString("_UI_FetchValue_type") + " " + fetchValue.getStamp();
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

		switch (notification.getFeatureID(FetchValue.class)) {
			case MtgoxPackage.FETCH_VALUE__STAMP:
			case MtgoxPackage.FETCH_VALUE__PRICE:
			case MtgoxPackage.FETCH_VALUE__AMOUNT:
			case MtgoxPackage.FETCH_VALUE__PRICE_INT:
			case MtgoxPackage.FETCH_VALUE__AMOUNT_INT:
			case MtgoxPackage.FETCH_VALUE__TID:
			case MtgoxPackage.FETCH_VALUE__CURRENCY:
			case MtgoxPackage.FETCH_VALUE__ITEM:
			case MtgoxPackage.FETCH_VALUE__TRADE_TYPE:
			case MtgoxPackage.FETCH_VALUE__PRIMARY:
			case MtgoxPackage.FETCH_VALUE__PROPERTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
