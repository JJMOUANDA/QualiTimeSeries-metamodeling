/**
 */
package qualificationData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manuelle Qualification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualificationData.ManuelleQualification#getCommentaire <em>Commentaire</em>}</li>
 * </ul>
 *
 * @see qualificationData.QualificationDataPackage#getManuelleQualification()
 * @model
 * @generated
 */
public interface ManuelleQualification extends Qualification {
	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see qualificationData.QualificationDataPackage#getManuelleQualification_Commentaire()
	 * @model
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link qualificationData.ManuelleQualification#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

} // ManuelleQualification
