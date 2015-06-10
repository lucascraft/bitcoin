/**
 */
package net.sf.smbt.trading.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.trading.TradingFactory;
import net.sf.smbt.trading.TradingPackage;
import net.sf.smbt.trading.Trigger;

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
 * This is the item provider adapter for a {@link net.sf.smbt.trading.Trigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggerItemProvider
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
	public TriggerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			//addUuidPropertyDescriptor(object);
			//addActivatedPropertyDescriptor(object);
			//addProcessedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_uuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_uuid_feature", "_UI_Trigger_type"),
				 TradingPackage.Literals.TRIGGER__UUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_activated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_activated_feature", "_UI_Trigger_type"),
				 TradingPackage.Literals.TRIGGER__ACTIVATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_processed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_processed_feature", "_UI_Trigger_type"),
				 TradingPackage.Literals.TRIGGER__PROCESSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Trigger_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Trigger_label_feature", "_UI_Trigger_type"),
				 TradingPackage.Literals.TRIGGER__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(TradingPackage.Literals.TRIGGER__ORDERS);
			childrenFeatures.add(TradingPackage.Literals.TRIGGER__RULES);
			childrenFeatures.add(TradingPackage.Literals.TRIGGER__JSON_NOTIFICATIONS);
			childrenFeatures.add(TradingPackage.Literals.TRIGGER__MAIL_NOTIFICATIONS);
			childrenFeatures.add(TradingPackage.Literals.TRIGGER__SMS_NOTIFICATION);
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
	 * This returns Trigger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Trigger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Trigger t = (Trigger) object;
		if (
			(!t.getOrders().isEmpty() 				&& !t.getRules().isEmpty()) || 
			(!t.getJsonNotifications().isEmpty() 	&& !t.getRules().isEmpty()) || 
			(!t.getMailNotifications().isEmpty() 	&& !t.getRules().isEmpty()) || 
			(!t.getSmsNotification().isEmpty() 		&& !t.getRules().isEmpty())
		) {
			return t.getOrders().size() + " orders & " + t.getRules().size() + " rules & " + (t.getJsonNotifications().size()+t.getMailNotifications().size()+t.getSmsNotification().size()) + " notifications";
		}
		return " : " + "incomplete";
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Trigger.class)) {
			case TradingPackage.TRIGGER__UUID:
			case TradingPackage.TRIGGER__ACTIVATED:
			case TradingPackage.TRIGGER__PROCESSED:
			case TradingPackage.TRIGGER__LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TradingPackage.TRIGGER__ORDERS:
			case TradingPackage.TRIGGER__RULES:
			case TradingPackage.TRIGGER__JSON_NOTIFICATIONS:
			case TradingPackage.TRIGGER__MAIL_NOTIFICATIONS:
			case TradingPackage.TRIGGER__SMS_NOTIFICATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__ORDERS,
				 TradingFactory.eINSTANCE.createOrder()));

/*
		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__RULES,
				 TradingFactory.eINSTANCE.createTradingRule()));
*/
		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__RULES,
				 TradingFactory.eINSTANCE.createPriceRule()));

		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__RULES,
				 TradingFactory.eINSTANCE.createVolumeRule()));
/*
		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__RULES,
				 TradingFactory.eINSTANCE.createTimeRule()));
		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__RULES,
				 TradingFactory.eINSTANCE.createCompositeRule()));

		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__RULES,
				 TradingFactory.eINSTANCE.createCustomRule()));
		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__RULES,
				 TradingFactory.eINSTANCE.createOrderKindRule()));
 */	

		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__JSON_NOTIFICATIONS,
				 TradingFactory.eINSTANCE.createJsonNotification()));

		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__MAIL_NOTIFICATIONS,
				 TradingFactory.eINSTANCE.createMailNotification()));
/*
		newChildDescriptors.add
			(createChildParameter
				(TradingPackage.Literals.TRIGGER__SMS_NOTIFICATION,
				 TradingFactory.eINSTANCE.createSMSNotifcation()));
*/
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TradingEditPlugin.INSTANCE;
	}

}
