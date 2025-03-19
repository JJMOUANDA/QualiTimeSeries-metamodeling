/**
 */
package qualificationData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Qualification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualificationData.AutoQualification#getAlgo <em>Algo</em>}</li>
 * </ul>
 *
 * @see qualificationData.QualificationDataPackage#getAutoQualification()
 * @model
 * @generated
 */
public interface AutoQualification extends Qualification {
	/**
	 * Returns the value of the '<em><b>Algo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo</em>' attribute.
	 * @see #setAlgo(String)
	 * @see qualificationData.QualificationDataPackage#getAutoQualification_Algo()
	 * @model
	 * @generated
	 */
	String getAlgo();

	/**
	 * Sets the value of the '{@link qualificationData.AutoQualification#getAlgo <em>Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo</em>' attribute.
	 * @see #getAlgo()
	 * @generated
	 */
	void setAlgo(String value);

} // AutoQualification
