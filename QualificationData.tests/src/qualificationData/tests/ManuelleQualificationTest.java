/**
 */
package qualificationData.tests;

import junit.textui.TestRunner;

import qualificationData.ManuelleQualification;
import qualificationData.QualificationDataFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manuelle Qualification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManuelleQualificationTest extends QualificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManuelleQualificationTest.class);
	}

	/**
	 * Constructs a new Manuelle Qualification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManuelleQualificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Manuelle Qualification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ManuelleQualification getFixture() {
		return (ManuelleQualification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualificationDataFactory.eINSTANCE.createManuelleQualification());
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

} //ManuelleQualificationTest
