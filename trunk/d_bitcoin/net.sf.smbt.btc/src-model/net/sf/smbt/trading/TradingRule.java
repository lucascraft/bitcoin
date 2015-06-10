/**
 */
package net.sf.smbt.trading;

import net.sf.smbt.btc.notifications.IRuleEvalDelegate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.trading.TradingRule#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.trading.TradingRule#getRatio <em>Ratio</em>}</li>
 *   <li>{@link net.sf.smbt.trading.TradingRule#getCompliance <em>Compliance</em>}</li>
 *   <li>{@link net.sf.smbt.trading.TradingRule#getEvalDelegate <em>Eval Delegate</em>}</li>
 *   <li>{@link net.sf.smbt.trading.TradingRule#getCtx <em>Ctx</em>}</li>
 *   <li>{@link net.sf.smbt.trading.TradingRule#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.trading.TradingPackage#getTradingRule()
 * @model
 * @generated
 */
public interface TradingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The default value is <code>"SATISFIES"</code>.
	 * The literals are from the enumeration {@link net.sf.smbt.trading.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see net.sf.smbt.trading.TriggerKind
	 * @see #setTrigger(TriggerKind)
	 * @see net.sf.smbt.trading.TradingPackage#getTradingRule_Trigger()
	 * @model default="SATISFIES"
	 * @generated
	 */
	TriggerKind getTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.TradingRule#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see net.sf.smbt.trading.TriggerKind
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(TriggerKind value);

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #setRatio(float)
	 * @see net.sf.smbt.trading.TradingPackage#getTradingRule_Ratio()
	 * @model
	 * @generated
	 */
	float getRatio();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.TradingRule#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(float value);

	/**
	 * Returns the value of the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance</em>' attribute.
	 * @see #setCompliance(float)
	 * @see net.sf.smbt.trading.TradingPackage#getTradingRule_Compliance()
	 * @model
	 * @generated
	 */
	float getCompliance();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.TradingRule#getCompliance <em>Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance</em>' attribute.
	 * @see #getCompliance()
	 * @generated
	 */
	void setCompliance(float value);

	/**
	 * Returns the value of the '<em><b>Eval Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eval Delegate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eval Delegate</em>' attribute.
	 * @see #setEvalDelegate(IRuleEvalDelegate)
	 * @see net.sf.smbt.trading.TradingPackage#getTradingRule_EvalDelegate()
	 * @model dataType="net.sf.smbt.trading.IRuleEvalDelegate"
	 * @generated
	 */
	IRuleEvalDelegate getEvalDelegate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.TradingRule#getEvalDelegate <em>Eval Delegate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eval Delegate</em>' attribute.
	 * @see #getEvalDelegate()
	 * @generated
	 */
	void setEvalDelegate(IRuleEvalDelegate value);

	/**
	 * Returns the value of the '<em><b>Ctx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx</em>' attribute.
	 * @see #setCtx(Object)
	 * @see net.sf.smbt.trading.TradingPackage#getTradingRule_Ctx()
	 * @model
	 * @generated
	 */
	Object getCtx();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.TradingRule#getCtx <em>Ctx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx</em>' attribute.
	 * @see #getCtx()
	 * @generated
	 */
	void setCtx(Object value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.trading.TradingPackage#getTradingRule_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.trading.TradingRule#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EObject> compute(Object ctx);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(RuleVisitor visitor);

} // TradingRule
