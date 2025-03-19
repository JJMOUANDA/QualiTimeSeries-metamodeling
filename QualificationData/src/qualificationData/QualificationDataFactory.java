/**
 */
package qualificationData;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualificationData.QualificationDataPackage
 * @generated
 */
public interface QualificationDataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualificationDataFactory eINSTANCE = qualificationData.impl.QualificationDataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Serie Temporelle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serie Temporelle</em>'.
	 * @generated
	 */
	SerieTemporelle createSerieTemporelle();

	/**
	 * Returns a new object of class '<em>Mesure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesure</em>'.
	 * @generated
	 */
	Mesure createMesure();

	/**
	 * Returns a new object of class '<em>Auto Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Qualification</em>'.
	 * @generated
	 */
	AutoQualification createAutoQualification();

	/**
	 * Returns a new object of class '<em>Manuelle Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manuelle Qualification</em>'.
	 * @generated
	 */
	ManuelleQualification createManuelleQualification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QualificationDataPackage getQualificationDataPackage();

} //QualificationDataFactory
