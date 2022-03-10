/**
 */
package NoSQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NoSQL.Value#getCoupleVal <em>Couple Val</em>}</li>
 * </ul>
 *
 * @see NoSQL.NoSQLPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Couple Val</b></em>' reference list.
	 * The list contents are of type {@link NoSQL.Couple}.
	 * It is bidirectional and its opposite is '{@link NoSQL.Couple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couple Val</em>' reference list.
	 * @see NoSQL.NoSQLPackage#getValue_CoupleVal()
	 * @see NoSQL.Couple#getValue
	 * @model opposite="value" required="true"
	 * @generated
	 */
	EList<Couple> getCoupleVal();

} // Value
