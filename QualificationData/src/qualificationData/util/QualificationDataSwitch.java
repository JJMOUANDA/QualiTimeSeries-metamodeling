/**
 */
package qualificationData.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualificationData.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qualificationData.QualificationDataPackage
 * @generated
 */
public class QualificationDataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualificationDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationDataSwitch() {
		if (modelPackage == null) {
			modelPackage = QualificationDataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QualificationDataPackage.ELEMENT_QUALIFIABLE: {
				ElementQualifiable elementQualifiable = (ElementQualifiable)theEObject;
				T result = caseElementQualifiable(elementQualifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualificationDataPackage.SERIE_TEMPORELLE: {
				SerieTemporelle serieTemporelle = (SerieTemporelle)theEObject;
				T result = caseSerieTemporelle(serieTemporelle);
				if (result == null) result = caseElementQualifiable(serieTemporelle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualificationDataPackage.MESURE: {
				Mesure mesure = (Mesure)theEObject;
				T result = caseMesure(mesure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualificationDataPackage.QUALIFICATION: {
				Qualification qualification = (Qualification)theEObject;
				T result = caseQualification(qualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualificationDataPackage.AUTO_QUALIFICATION: {
				AutoQualification autoQualification = (AutoQualification)theEObject;
				T result = caseAutoQualification(autoQualification);
				if (result == null) result = caseQualification(autoQualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualificationDataPackage.MANUELLE_QUALIFICATION: {
				ManuelleQualification manuelleQualification = (ManuelleQualification)theEObject;
				T result = caseManuelleQualification(manuelleQualification);
				if (result == null) result = caseQualification(manuelleQualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Qualifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Qualifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementQualifiable(ElementQualifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serie Temporelle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serie Temporelle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerieTemporelle(SerieTemporelle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMesure(Mesure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualification(Qualification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Qualification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoQualification(AutoQualification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manuelle Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manuelle Qualification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManuelleQualification(ManuelleQualification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QualificationDataSwitch
