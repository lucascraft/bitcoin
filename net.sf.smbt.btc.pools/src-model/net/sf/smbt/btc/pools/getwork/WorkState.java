/**
 */
package net.sf.smbt.btc.pools.getwork;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.pools.getwork.WorkState#getMidStates <em>Mid States</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.getwork.WorkState#getTargets <em>Targets</em>}</li>
 *   <li>{@link net.sf.smbt.btc.pools.getwork.WorkState#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.pools.getwork.GetworkPackage#getWorkState()
 * @model
 * @generated
 */
public interface WorkState extends EObject {
	/**
	 * Returns the value of the '<em><b>Mid States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mid States</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mid States</em>' attribute list.
	 * @see net.sf.smbt.btc.pools.getwork.GetworkPackage#getWorkState_MidStates()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getMidStates();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' attribute list.
	 * @see net.sf.smbt.btc.pools.getwork.GetworkPackage#getWorkState_Targets()
	 * @model unique="false"
	 * @generated
	 */
	EList<Long> getTargets();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see net.sf.smbt.btc.pools.getwork.GetworkPackage#getWorkState_Data()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getData();

} // WorkState
