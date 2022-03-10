/**
 */
package NoSQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Couple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NoSQL.Couple#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link NoSQL.Couple#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see NoSQL.NoSQLPackage#getCouple()
 * @model
 * @generated
 */
public interface Couple extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribut</em>' attribute.
	 * @see #setAttribut(String)
	 * @see NoSQL.NoSQLPackage#getCouple_Attribut()
	 * @model
	 * @generated
	 */
	String getAttribut();

	/**
	 * Sets the value of the '{@link NoSQL.Couple#getAttribut <em>Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribut</em>' attribute.
	 * @see #getAttribut()
	 * @generated
	 */
	void setAttribut(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NoSQL.Value#getCoupleVal <em>Couple Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see NoSQL.NoSQLPackage#getCouple_Value()
	 * @see NoSQL.Value#getCoupleVal
	 * @model opposite="CoupleVal" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link NoSQL.Couple#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Couple
