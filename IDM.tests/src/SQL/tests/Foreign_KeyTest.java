/**
 */
package SQL.tests;

import SQL.Foreign_Key;
import SQL.SQLFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Foreign_KeyTest extends TestCase {

	/**
	 * The fixture for this Foreign Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Foreign_Key fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Foreign_KeyTest.class);
	}

	/**
	 * Constructs a new Foreign Key test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foreign_KeyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Foreign Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Foreign_Key fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Foreign Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Foreign_Key getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SQLFactory.eINSTANCE.createForeign_Key());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //Foreign_KeyTest
