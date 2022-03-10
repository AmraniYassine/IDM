/**
 */
package SQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SQL.Row#getPrimary_key <em>Primary key</em>}</li>
 *   <li>{@link SQL.Row#getForeign_key <em>Foreign key</em>}</li>
 *   <li>{@link SQL.Row#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see SQL.SQLPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Primary key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary key</em>' reference.
	 * @see #setPrimary_key(Primary_key)
	 * @see SQL.SQLPackage#getRow_Primary_key()
	 * @model
	 * @generated
	 */
	Primary_key getPrimary_key();

	/**
	 * Sets the value of the '{@link SQL.Row#getPrimary_key <em>Primary key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary key</em>' reference.
	 * @see #getPrimary_key()
	 * @generated
	 */
	void setPrimary_key(Primary_key value);

	/**
	 * Returns the value of the '<em><b>Foreign key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign key</em>' reference.
	 * @see #setForeign_key(Foreign_Key)
	 * @see SQL.SQLPackage#getRow_Foreign_key()
	 * @model
	 * @generated
	 */
	Foreign_Key getForeign_key();

	/**
	 * Sets the value of the '{@link SQL.Row#getForeign_key <em>Foreign key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign key</em>' reference.
	 * @see #getForeign_key()
	 * @generated
	 */
	void setForeign_key(Foreign_Key value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link SQL.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see SQL.SQLPackage#getRow_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumn();

} // Row
