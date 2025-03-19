/**
 */
package qualificationData.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qualificationData.Mesure;
import qualificationData.QualificationDataFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mesure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MesureTest extends TestCase {

	/**
	 * The fixture for this Mesure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mesure fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MesureTest.class);
	}

	/**
	 * Constructs a new Mesure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MesureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mesure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Mesure fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mesure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mesure getFixture() {
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
		setFixture(QualificationDataFactory.eINSTANCE.createMesure());
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

} //MesureTest
