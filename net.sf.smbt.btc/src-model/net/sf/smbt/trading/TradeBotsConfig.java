/**
 */
package net.sf.smbt.trading;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trade Bots Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.TradeBotsConfig#getBots <em>Bots</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getTradeBotsConfig()
 * @model
 * @generated
 */
public interface TradeBotsConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Bots</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.trading.Robot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bots</em>' containment reference list.
	 * @see net.sf.smbt.trading.TradingPackage#getTradeBotsConfig_Bots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Robot> getBots();

} // TradeBotsConfig
