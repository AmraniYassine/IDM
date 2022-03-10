/**
 */
package SQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SQL.Foreign_Key#getName <em>Name</em>}</li>
 *   <li>{@link SQL.Foreign_Key#getTable <em>Table</em>}</li>
 *   <li>{@link SQL.Foreign_Key#getPrimary_key <em>Primary key</em>}</li>
 * </ul>
 *
 * @see SQL.SQLPackage#getForeign_Key()
 * @model
 * @generated
 */
public interface Foreign_Key extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SQL.SQLPackage#getForeign_Key_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SQL.Foreign_Key#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see SQL.SQLPackage#getForeign_Key_Table()
	 * @model
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link SQL.Foreign_Key#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Primary key</b></em>' containment reference list.
	 * The list contents are of type {@link SQL.Primary_key}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary key</em>' containment reference list.
	 * @see SQL.SQLPackage#getForeign_Key_Primary_key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Primary_key> getPrimary_key();

} // Foreign_Key
