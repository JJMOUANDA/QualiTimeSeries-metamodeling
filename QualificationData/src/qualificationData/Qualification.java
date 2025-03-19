/**
 */
package qualificationData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualificationData.Qualification#getQualitycode <em>Qualitycode</em>}</li>
 * </ul>
 *
 * @see qualificationData.QualificationDataPackage#getQualification()
 * @model abstract="true"
 * @generated
 */
public interface Qualification extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualitycode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualitycode</em>' attribute.
	 * @see #setQualitycode(int)
	 * @see qualificationData.QualificationDataPackage#getQualification_Qualitycode()
	 * @model required="true"
	 * @generated
	 */
	int getQualitycode();

	/**
	 * Sets the value of the '{@link qualificationData.Qualification#getQualitycode <em>Qualitycode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualitycode</em>' attribute.
	 * @see #getQualitycode()
	 * @generated
	 */
	void setQualitycode(int value);

} // Qualification
