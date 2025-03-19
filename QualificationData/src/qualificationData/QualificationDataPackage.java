/**
 */
package qualificationData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see qualificationData.QualificationDataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface QualificationDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qualificationData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/qualificationData";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qualificationData";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualificationDataPackage eINSTANCE = qualificationData.impl.QualificationDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualificationData.impl.ElementQualifiableImpl <em>Element Qualifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualificationData.impl.ElementQualifiableImpl
	 * @see qualificationData.impl.QualificationDataPackageImpl#getElementQualifiable()
	 * @generated
	 */
	int ELEMENT_QUALIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_QUALIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Element Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_QUALIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Qualifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_QUALIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualificationData.impl.SerieTemporelleImpl <em>Serie Temporelle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualificationData.impl.SerieTemporelleImpl
	 * @see qualificationData.impl.QualificationDataPackageImpl#getSerieTemporelle()
	 * @generated
	 */
	int SERIE_TEMPORELLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_TEMPORELLE__ID = ELEMENT_QUALIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Mesure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_TEMPORELLE__MESURE = ELEMENT_QUALIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Serie Temporelle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_TEMPORELLE_FEATURE_COUNT = ELEMENT_QUALIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Au Moins Une Qualification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_TEMPORELLE___AU_MOINS_UNE_QUALIFICATION__DIAGNOSTICCHAIN_MAP = ELEMENT_QUALIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Au Moins Une Mesure Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_TEMPORELLE___AU_MOINS_UNE_MESURE_VALIDE__DIAGNOSTICCHAIN_MAP = ELEMENT_QUALIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Mesures Positives</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_TEMPORELLE___MESURES_POSITIVES__DIAGNOSTICCHAIN_MAP = ELEMENT_QUALIFIABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Quality Code Correct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_TEMPORELLE___QUALITY_CODE_CORRECT__DIAGNOSTICCHAIN_MAP = ELEMENT_QUALIFIABLE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Serie Temporelle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_TEMPORELLE_OPERATION_COUNT = ELEMENT_QUALIFIABLE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link qualificationData.impl.MesureImpl <em>Mesure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualificationData.impl.MesureImpl
	 * @see qualificationData.impl.QualificationDataPackageImpl#getMesure()
	 * @generated
	 */
	int MESURE = 2;

	/**
	 * The feature id for the '<em><b>Serie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESURE__SERIE = 0;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESURE__VALEUR = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESURE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESURE__QUALIFICATION = 3;

	/**
	 * The number of structural features of the '<em>Mesure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mesure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualificationData.impl.QualificationImpl <em>Qualification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualificationData.impl.QualificationImpl
	 * @see qualificationData.impl.QualificationDataPackageImpl#getQualification()
	 * @generated
	 */
	int QUALIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Qualitycode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION__QUALITYCODE = 0;

	/**
	 * The number of structural features of the '<em>Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualificationData.impl.AutoQualificationImpl <em>Auto Qualification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualificationData.impl.AutoQualificationImpl
	 * @see qualificationData.impl.QualificationDataPackageImpl#getAutoQualification()
	 * @generated
	 */
	int AUTO_QUALIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Qualitycode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_QUALIFICATION__QUALITYCODE = QUALIFICATION__QUALITYCODE;

	/**
	 * The feature id for the '<em><b>Algo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_QUALIFICATION__ALGO = QUALIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auto Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_QUALIFICATION_FEATURE_COUNT = QUALIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auto Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_QUALIFICATION_OPERATION_COUNT = QUALIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualificationData.impl.ManuelleQualificationImpl <em>Manuelle Qualification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualificationData.impl.ManuelleQualificationImpl
	 * @see qualificationData.impl.QualificationDataPackageImpl#getManuelleQualification()
	 * @generated
	 */
	int MANUELLE_QUALIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Qualitycode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUELLE_QUALIFICATION__QUALITYCODE = QUALIFICATION__QUALITYCODE;

	/**
	 * The feature id for the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUELLE_QUALIFICATION__COMMENTAIRE = QUALIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manuelle Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUELLE_QUALIFICATION_FEATURE_COUNT = QUALIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manuelle Qualification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUELLE_QUALIFICATION_OPERATION_COUNT = QUALIFICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link qualificationData.ElementQualifiable <em>Element Qualifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Qualifiable</em>'.
	 * @see qualificationData.ElementQualifiable
	 * @generated
	 */
	EClass getElementQualifiable();

	/**
	 * Returns the meta object for the attribute '{@link qualificationData.ElementQualifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see qualificationData.ElementQualifiable#getId()
	 * @see #getElementQualifiable()
	 * @generated
	 */
	EAttribute getElementQualifiable_Id();

	/**
	 * Returns the meta object for class '{@link qualificationData.SerieTemporelle <em>Serie Temporelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serie Temporelle</em>'.
	 * @see qualificationData.SerieTemporelle
	 * @generated
	 */
	EClass getSerieTemporelle();

	/**
	 * Returns the meta object for the containment reference list '{@link qualificationData.SerieTemporelle#getMesure <em>Mesure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mesure</em>'.
	 * @see qualificationData.SerieTemporelle#getMesure()
	 * @see #getSerieTemporelle()
	 * @generated
	 */
	EReference getSerieTemporelle_Mesure();

	/**
	 * Returns the meta object for the '{@link qualificationData.SerieTemporelle#auMoinsUneQualification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Au Moins Une Qualification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Au Moins Une Qualification</em>' operation.
	 * @see qualificationData.SerieTemporelle#auMoinsUneQualification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSerieTemporelle__AuMoinsUneQualification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qualificationData.SerieTemporelle#auMoinsUneMesureValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Au Moins Une Mesure Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Au Moins Une Mesure Valide</em>' operation.
	 * @see qualificationData.SerieTemporelle#auMoinsUneMesureValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSerieTemporelle__AuMoinsUneMesureValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qualificationData.SerieTemporelle#mesuresPositives(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mesures Positives</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mesures Positives</em>' operation.
	 * @see qualificationData.SerieTemporelle#mesuresPositives(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSerieTemporelle__MesuresPositives__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link qualificationData.SerieTemporelle#qualityCodeCorrect(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Quality Code Correct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quality Code Correct</em>' operation.
	 * @see qualificationData.SerieTemporelle#qualityCodeCorrect(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSerieTemporelle__QualityCodeCorrect__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link qualificationData.Mesure <em>Mesure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesure</em>'.
	 * @see qualificationData.Mesure
	 * @generated
	 */
	EClass getMesure();

	/**
	 * Returns the meta object for the reference '{@link qualificationData.Mesure#getSerie <em>Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serie</em>'.
	 * @see qualificationData.Mesure#getSerie()
	 * @see #getMesure()
	 * @generated
	 */
	EReference getMesure_Serie();

	/**
	 * Returns the meta object for the attribute '{@link qualificationData.Mesure#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see qualificationData.Mesure#getValeur()
	 * @see #getMesure()
	 * @generated
	 */
	EAttribute getMesure_Valeur();

	/**
	 * Returns the meta object for the attribute '{@link qualificationData.Mesure#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see qualificationData.Mesure#getTimestamp()
	 * @see #getMesure()
	 * @generated
	 */
	EAttribute getMesure_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link qualificationData.Mesure#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualification</em>'.
	 * @see qualificationData.Mesure#getQualification()
	 * @see #getMesure()
	 * @generated
	 */
	EReference getMesure_Qualification();

	/**
	 * Returns the meta object for class '{@link qualificationData.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification</em>'.
	 * @see qualificationData.Qualification
	 * @generated
	 */
	EClass getQualification();

	/**
	 * Returns the meta object for the attribute '{@link qualificationData.Qualification#getQualitycode <em>Qualitycode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualitycode</em>'.
	 * @see qualificationData.Qualification#getQualitycode()
	 * @see #getQualification()
	 * @generated
	 */
	EAttribute getQualification_Qualitycode();

	/**
	 * Returns the meta object for class '{@link qualificationData.AutoQualification <em>Auto Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Qualification</em>'.
	 * @see qualificationData.AutoQualification
	 * @generated
	 */
	EClass getAutoQualification();

	/**
	 * Returns the meta object for the attribute '{@link qualificationData.AutoQualification#getAlgo <em>Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algo</em>'.
	 * @see qualificationData.AutoQualification#getAlgo()
	 * @see #getAutoQualification()
	 * @generated
	 */
	EAttribute getAutoQualification_Algo();

	/**
	 * Returns the meta object for class '{@link qualificationData.ManuelleQualification <em>Manuelle Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manuelle Qualification</em>'.
	 * @see qualificationData.ManuelleQualification
	 * @generated
	 */
	EClass getManuelleQualification();

	/**
	 * Returns the meta object for the attribute '{@link qualificationData.ManuelleQualification#getCommentaire <em>Commentaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commentaire</em>'.
	 * @see qualificationData.ManuelleQualification#getCommentaire()
	 * @see #getManuelleQualification()
	 * @generated
	 */
	EAttribute getManuelleQualification_Commentaire();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualificationDataFactory getQualificationDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link qualificationData.impl.ElementQualifiableImpl <em>Element Qualifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualificationData.impl.ElementQualifiableImpl
		 * @see qualificationData.impl.QualificationDataPackageImpl#getElementQualifiable()
		 * @generated
		 */
		EClass ELEMENT_QUALIFIABLE = eINSTANCE.getElementQualifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_QUALIFIABLE__ID = eINSTANCE.getElementQualifiable_Id();

		/**
		 * The meta object literal for the '{@link qualificationData.impl.SerieTemporelleImpl <em>Serie Temporelle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualificationData.impl.SerieTemporelleImpl
		 * @see qualificationData.impl.QualificationDataPackageImpl#getSerieTemporelle()
		 * @generated
		 */
		EClass SERIE_TEMPORELLE = eINSTANCE.getSerieTemporelle();

		/**
		 * The meta object literal for the '<em><b>Mesure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIE_TEMPORELLE__MESURE = eINSTANCE.getSerieTemporelle_Mesure();

		/**
		 * The meta object literal for the '<em><b>Au Moins Une Qualification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERIE_TEMPORELLE___AU_MOINS_UNE_QUALIFICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSerieTemporelle__AuMoinsUneQualification__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Au Moins Une Mesure Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERIE_TEMPORELLE___AU_MOINS_UNE_MESURE_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSerieTemporelle__AuMoinsUneMesureValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Mesures Positives</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERIE_TEMPORELLE___MESURES_POSITIVES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSerieTemporelle__MesuresPositives__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Quality Code Correct</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERIE_TEMPORELLE___QUALITY_CODE_CORRECT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSerieTemporelle__QualityCodeCorrect__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link qualificationData.impl.MesureImpl <em>Mesure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualificationData.impl.MesureImpl
		 * @see qualificationData.impl.QualificationDataPackageImpl#getMesure()
		 * @generated
		 */
		EClass MESURE = eINSTANCE.getMesure();

		/**
		 * The meta object literal for the '<em><b>Serie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESURE__SERIE = eINSTANCE.getMesure_Serie();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESURE__VALEUR = eINSTANCE.getMesure_Valeur();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESURE__TIMESTAMP = eINSTANCE.getMesure_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESURE__QUALIFICATION = eINSTANCE.getMesure_Qualification();

		/**
		 * The meta object literal for the '{@link qualificationData.impl.QualificationImpl <em>Qualification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualificationData.impl.QualificationImpl
		 * @see qualificationData.impl.QualificationDataPackageImpl#getQualification()
		 * @generated
		 */
		EClass QUALIFICATION = eINSTANCE.getQualification();

		/**
		 * The meta object literal for the '<em><b>Qualitycode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFICATION__QUALITYCODE = eINSTANCE.getQualification_Qualitycode();

		/**
		 * The meta object literal for the '{@link qualificationData.impl.AutoQualificationImpl <em>Auto Qualification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualificationData.impl.AutoQualificationImpl
		 * @see qualificationData.impl.QualificationDataPackageImpl#getAutoQualification()
		 * @generated
		 */
		EClass AUTO_QUALIFICATION = eINSTANCE.getAutoQualification();

		/**
		 * The meta object literal for the '<em><b>Algo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_QUALIFICATION__ALGO = eINSTANCE.getAutoQualification_Algo();

		/**
		 * The meta object literal for the '{@link qualificationData.impl.ManuelleQualificationImpl <em>Manuelle Qualification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualificationData.impl.ManuelleQualificationImpl
		 * @see qualificationData.impl.QualificationDataPackageImpl#getManuelleQualification()
		 * @generated
		 */
		EClass MANUELLE_QUALIFICATION = eINSTANCE.getManuelleQualification();

		/**
		 * The meta object literal for the '<em><b>Commentaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUELLE_QUALIFICATION__COMMENTAIRE = eINSTANCE.getManuelleQualification_Commentaire();

	}

} //QualificationDataPackage
