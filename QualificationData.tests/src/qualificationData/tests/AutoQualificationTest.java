/**
 */
package qualificationData.tests;

import junit.textui.TestRunner;

import qualificationData.AutoQualification;
import qualificationData.QualificationDataFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Auto Qualification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutoQualificationTest extends QualificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AutoQualificationTest.class);
	}

	/**
	 * Constructs a new Auto Qualification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoQualificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Auto Qualification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AutoQualification getFixture() {
		return (AutoQualification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualificationDataFactory.eINSTANCE.createAutoQualification());
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

} //AutoQualificationTest
