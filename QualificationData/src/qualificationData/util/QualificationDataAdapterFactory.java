/**
 */
package qualificationData.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qualificationData.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qualificationData.QualificationDataPackage
 * @generated
 */
public class QualificationDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualificationDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QualificationDataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualificationDataSwitch<Adapter> modelSwitch =
		new QualificationDataSwitch<Adapter>() {
			@Override
			public Adapter caseElementQualifiable(ElementQualifiable object) {
				return createElementQualifiableAdapter();
			}
			@Override
			public Adapter caseSerieTemporelle(SerieTemporelle object) {
				return createSerieTemporelleAdapter();
			}
			@Override
			public Adapter caseMesure(Mesure object) {
				return createMesureAdapter();
			}
			@Override
			public Adapter caseQualification(Qualification object) {
				return createQualificationAdapter();
			}
			@Override
			public Adapter caseAutoQualification(AutoQualification object) {
				return createAutoQualificationAdapter();
			}
			@Override
			public Adapter caseManuelleQualification(ManuelleQualification object) {
				return createManuelleQualificationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link qualificationData.ElementQualifiable <em>Element Qualifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualificationData.ElementQualifiable
	 * @generated
	 */
	public Adapter createElementQualifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualificationData.SerieTemporelle <em>Serie Temporelle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualificationData.SerieTemporelle
	 * @generated
	 */
	public Adapter createSerieTemporelleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualificationData.Mesure <em>Mesure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualificationData.Mesure
	 * @generated
	 */
	public Adapter createMesureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualificationData.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualificationData.Qualification
	 * @generated
	 */
	public Adapter createQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualificationData.AutoQualification <em>Auto Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualificationData.AutoQualification
	 * @generated
	 */
	public Adapter createAutoQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualificationData.ManuelleQualification <em>Manuelle Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualificationData.ManuelleQualification
	 * @generated
	 */
	public Adapter createManuelleQualificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QualificationDataAdapterFactory
