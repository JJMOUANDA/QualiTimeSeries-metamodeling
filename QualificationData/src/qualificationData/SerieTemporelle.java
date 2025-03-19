/**
 */
package qualificationData;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serie Temporelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualificationData.SerieTemporelle#getMesure <em>Mesure</em>}</li>
 * </ul>
 *
 * @see qualificationData.QualificationDataPackage#getSerieTemporelle()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='qualityCodeCorrect'"
 * @generated
 */
public interface SerieTemporelle extends ElementQualifiable {
	/**
	 * Returns the value of the '<em><b>Mesure</b></em>' containment reference list.
	 * The list contents are of type {@link qualificationData.Mesure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesure</em>' containment reference list.
	 * @see qualificationData.QualificationDataPackage#getSerieTemporelle_Mesure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mesure> getMesure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.mesure-&gt;exists(m : Mesure | m.qualification &lt;&gt; null)'"
	 * @generated
	 */
	boolean auMoinsUneQualification(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.mesure-&gt;exists(m: Mesure |\n        m.valeur &gt;= 0 and (m.qualification.oclIsKindOf(AutoQualification) implies m.qualification.qualitycode &gt; 1) and\n        (m.qualification.oclIsKindOf(ManuelleQualification) implies m.qualification.qualitycode &gt; 0))'"
	 * @generated
	 */
	boolean auMoinsUneMesureValide(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.mesure-&gt;select(m : Mesure | m.valeur &lt; 0)-&gt;isEmpty()'"
	 * @generated
	 */
	boolean mesuresPositives(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.mesure-&gt;collect(m : Mesure | m.qualification)-&gt;select(q : Qualification | q.oclIsKindOf(AutoQualification))-&gt;forAll(q : Qualification | q.qualitycode &gt; 1)'"
	 * @generated
	 */
	boolean qualityCodeCorrect(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SerieTemporelle
