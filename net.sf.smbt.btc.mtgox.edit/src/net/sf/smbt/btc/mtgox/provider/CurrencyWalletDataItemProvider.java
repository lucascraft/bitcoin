/**
 */
package net.sf.smbt.btc.mtgox.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.btc.BtcCurrency;

import net.sf.smbt.btc.mtgox.CurrencyWalletData;
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
 * This is the item provider adapter for a {@link net.sf.smbt.btc.mtgox.CurrencyWalletData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CurrencyWalletDataItemProvider
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
	public CurrencyWalletDataItemProvider(AdapterFactory adapterFactory) {
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

			addCurrencyPropertyDescriptor(object);
			addOperationsPropertyDescriptor(object);
			addMaxWithdrawLimitPropertyDescriptor(object);
			addOrdersPropertyDescriptor(object);
			addMonthlyLimitPropertyDescriptor(object);
			addDailyLimitPropertyDescriptor(object);
			addBalancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_CurrencyWalletData_currency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CurrencyWalletData_currency_feature", "_UI_CurrencyWalletData_type"),
				 MtgoxPackage.Literals.CURRENCY_WALLET_DATA__CURRENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Balance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBalancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CurrencyWalletData_balance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CurrencyWalletData_balance_feature", "_UI_CurrencyWalletData_type"),
				 MtgoxPackage.Literals.CURRENCY_WALLET_DATA__BALANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CurrencyWalletData_operations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CurrencyWalletData_operations_feature", "_UI_CurrencyWalletData_type"),
				 MtgoxPackage.Literals.CURRENCY_WALLET_DATA__OPERATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Withdraw Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxWithdrawLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CurrencyWalletData_maxWithdrawLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CurrencyWalletData_maxWithdrawLimit_feature", "_UI_CurrencyWalletData_type"),
				 MtgoxPackage.Literals.CURRENCY_WALLET_DATA__MAX_WITHDRAW_LIMIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CurrencyWalletData_orders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CurrencyWalletData_orders_feature", "_UI_CurrencyWalletData_type"),
				 MtgoxPackage.Literals.CURRENCY_WALLET_DATA__ORDERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monthly Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonthlyLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CurrencyWalletData_monthlyLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CurrencyWalletData_monthlyLimit_feature", "_UI_CurrencyWalletData_type"),
				 MtgoxPackage.Literals.CURRENCY_WALLET_DATA__MONTHLY_LIMIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Daily Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDailyLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CurrencyWalletData_dailyLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CurrencyWalletData_dailyLimit_feature", "_UI_CurrencyWalletData_type"),
				 MtgoxPackage.Literals.CURRENCY_WALLET_DATA__DAILY_LIMIT,
				 true,
				 false,
				 true,
				 null,
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
	 * This returns CurrencyWalletData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CurrencyWalletData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BtcCurrency labelValue = ((CurrencyWalletData)object).getCurrency();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CurrencyWalletData_type") :
			getString("_UI_CurrencyWalletData_type") + " " + label;
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

		switch (notification.getFeatureID(CurrencyWalletData.class)) {
			case MtgoxPackage.CURRENCY_WALLET_DATA__CURRENCY:
			case MtgoxPackage.CURRENCY_WALLET_DATA__OPERATIONS:
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
