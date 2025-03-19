/**
 */
package qualificationData.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualificationData.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualificationDataFactoryImpl extends EFactoryImpl implements QualificationDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualificationDataFactory init() {
		try {
			QualificationDataFactory theQualificationDataFactory = (QualificationDataFactory)EPackage.Registry.INSTANCE.getEFactory(QualificationDataPackage.eNS_URI);
			if (theQualificationDataFactory != null) {
				return theQualificationDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualificationDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QualificationDataPackage.SERIE_TEMPORELLE: return createSerieTemporelle();
			case QualificationDataPackage.MESURE: return createMesure();
			case QualificationDataPackage.AUTO_QUALIFICATION: return createAutoQualification();
			case QualificationDataPackage.MANUELLE_QUALIFICATION: return createManuelleQualification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SerieTemporelle createSerieTemporelle() {
		SerieTemporelleImpl serieTemporelle = new SerieTemporelleImpl();
		return serieTemporelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mesure createMesure() {
		MesureImpl mesure = new MesureImpl();
		return mesure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutoQualification createAutoQualification() {
		AutoQualificationImpl autoQualification = new AutoQualificationImpl();
		return autoQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManuelleQualification createManuelleQualification() {
		ManuelleQualificationImpl manuelleQualification = new ManuelleQualificationImpl();
		return manuelleQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualificationDataPackage getQualificationDataPackage() {
		return (QualificationDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualificationDataPackage getPackage() {
		return QualificationDataPackage.eINSTANCE;
	}

} //QualificationDataFactoryImpl
