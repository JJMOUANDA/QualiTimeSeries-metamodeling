/**
 */
package qualificationData.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import qualificationData.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qualificationData.QualificationDataPackage
 * @generated
 */
public class QualificationDataValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QualificationDataValidator INSTANCE = new QualificationDataValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qualificationData";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins Une Qualification' of 'Serie Temporelle'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERIE_TEMPORELLE__AU_MOINS_UNE_QUALIFICATION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins Une Mesure Valide' of 'Serie Temporelle'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERIE_TEMPORELLE__AU_MOINS_UNE_MESURE_VALIDE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mesures Positives' of 'Serie Temporelle'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERIE_TEMPORELLE__MESURES_POSITIVES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Quality Code Correct' of 'Serie Temporelle'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERIE_TEMPORELLE__QUALITY_CODE_CORRECT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationDataValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QualificationDataPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QualificationDataPackage.ELEMENT_QUALIFIABLE:
				return validateElementQualifiable((ElementQualifiable)value, diagnostics, context);
			case QualificationDataPackage.SERIE_TEMPORELLE:
				return validateSerieTemporelle((SerieTemporelle)value, diagnostics, context);
			case QualificationDataPackage.MESURE:
				return validateMesure((Mesure)value, diagnostics, context);
			case QualificationDataPackage.QUALIFICATION:
				return validateQualification((Qualification)value, diagnostics, context);
			case QualificationDataPackage.AUTO_QUALIFICATION:
				return validateAutoQualification((AutoQualification)value, diagnostics, context);
			case QualificationDataPackage.MANUELLE_QUALIFICATION:
				return validateManuelleQualification((ManuelleQualification)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementQualifiable(ElementQualifiable elementQualifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementQualifiable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerieTemporelle(SerieTemporelle serieTemporelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serieTemporelle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validateSerieTemporelle_qualityCodeCorrect(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validateSerieTemporelle_auMoinsUneQualification(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validateSerieTemporelle_auMoinsUneMesureValide(serieTemporelle, diagnostics, context);
		if (result || diagnostics != null) result &= validateSerieTemporelle_mesuresPositives(serieTemporelle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the qualityCodeCorrect constraint of '<em>Serie Temporelle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerieTemporelle_qualityCodeCorrect(SerieTemporelle serieTemporelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serieTemporelle.qualityCodeCorrect(diagnostics, context);
	}

	/**
	 * Validates the auMoinsUneQualification constraint of '<em>Serie Temporelle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerieTemporelle_auMoinsUneQualification(SerieTemporelle serieTemporelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serieTemporelle.auMoinsUneQualification(diagnostics, context);
	}

	/**
	 * Validates the auMoinsUneMesureValide constraint of '<em>Serie Temporelle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerieTemporelle_auMoinsUneMesureValide(SerieTemporelle serieTemporelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serieTemporelle.auMoinsUneMesureValide(diagnostics, context);
	}

	/**
	 * Validates the mesuresPositives constraint of '<em>Serie Temporelle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerieTemporelle_mesuresPositives(SerieTemporelle serieTemporelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serieTemporelle.mesuresPositives(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMesure(Mesure mesure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mesure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualification(Qualification qualification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutoQualification(AutoQualification autoQualification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(autoQualification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManuelleQualification(ManuelleQualification manuelleQualification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manuelleQualification, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QualificationDataValidator
