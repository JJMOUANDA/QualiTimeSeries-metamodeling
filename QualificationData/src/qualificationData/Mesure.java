/**
 */
package qualificationData;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualificationData.Mesure#getSerie <em>Serie</em>}</li>
 *   <li>{@link qualificationData.Mesure#getValeur <em>Valeur</em>}</li>
 *   <li>{@link qualificationData.Mesure#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link qualificationData.Mesure#getQualification <em>Qualification</em>}</li>
 * </ul>
 *
 * @see qualificationData.QualificationDataPackage#getMesure()
 * @model
 * @generated
 */
public interface Mesure extends EObject {
	/**
	 * Returns the value of the '<em><b>Serie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serie</em>' reference.
	 * @see #setSerie(SerieTemporelle)
	 * @see qualificationData.QualificationDataPackage#getMesure_Serie()
	 * @model required="true"
	 * @generated
	 */
	SerieTemporelle getSerie();

	/**
	 * Sets the value of the '{@link qualificationData.Mesure#getSerie <em>Serie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serie</em>' reference.
	 * @see #getSerie()
	 * @generated
	 */
	void setSerie(SerieTemporelle value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(int)
	 * @see qualificationData.QualificationDataPackage#getMesure_Valeur()
	 * @model required="true"
	 * @generated
	 */
	int getValeur();

	/**
	 * Sets the value of the '{@link qualificationData.Mesure#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see qualificationData.QualificationDataPackage#getMesure_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link qualificationData.Mesure#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' containment reference.
	 * @see #setQualification(Qualification)
	 * @see qualificationData.QualificationDataPackage#getMesure_Qualification()
	 * @model containment="true"
	 * @generated
	 */
	Qualification getQualification();

	/**
	 * Sets the value of the '{@link qualificationData.Mesure#getQualification <em>Qualification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' containment reference.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(Qualification value);

} // Mesure
