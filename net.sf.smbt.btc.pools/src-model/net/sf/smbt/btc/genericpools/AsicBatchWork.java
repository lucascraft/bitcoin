/**
 */
package net.sf.smbt.btc.genericpools;

import net.sf.smbt.btc.pools.utils.getwork.miner.WorkState;
import net.sf.smbt.xcp.XCPAddress;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asic Batch Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.btc.genericpools.AsicBatchWork#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.btc.genericpools.AsicBatchWork#getAsicDevicePipe <em>Asic Device Pipe</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getAsicBatchWork()
 * @model
 * @generated
 */
public interface AsicBatchWork extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(WorkState)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getAsicBatchWork_Data()
	 * @model dataType="net.sf.smbt.btc.genericpools.WorkState"
	 * @generated
	 */
	WorkState getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.AsicBatchWork#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(WorkState value);

	/**
	 * Returns the value of the '<em><b>Asic Device Pipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asic Device Pipe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asic Device Pipe</em>' reference.
	 * @see #setAsicDevicePipe(XCPAddress)
	 * @see net.sf.smbt.btc.genericpools.GenericpoolsPackage#getAsicBatchWork_AsicDevicePipe()
	 * @model
	 * @generated
	 */
	XCPAddress getAsicDevicePipe();

	/**
	 * Sets the value of the '{@link net.sf.smbt.btc.genericpools.AsicBatchWork#getAsicDevicePipe <em>Asic Device Pipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asic Device Pipe</em>' reference.
	 * @see #getAsicDevicePipe()
	 * @generated
	 */
	void setAsicDevicePipe(XCPAddress value);

} // AsicBatchWork
