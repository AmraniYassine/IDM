/**
 */
package NoSQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NoSQL.Document#getName <em>Name</em>}</li>
 *   <li>{@link NoSQL.Document#getCouple <em>Couple</em>}</li>
 * </ul>
 *
 * @see NoSQL.NoSQLPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends Value {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see NoSQL.NoSQLPackage#getDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link NoSQL.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Couple</b></em>' containment reference list.
	 * The list contents are of type {@link NoSQL.Couple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couple</em>' containment reference list.
	 * @see NoSQL.NoSQLPackage#getDocument_Couple()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Couple> getCouple();

} // Document
