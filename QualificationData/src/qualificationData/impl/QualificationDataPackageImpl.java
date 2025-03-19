/**
 */
package qualificationData.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualificationData.AutoQualification;
import qualificationData.ElementQualifiable;
import qualificationData.ManuelleQualification;
import qualificationData.Mesure;
import qualificationData.Qualification;
import qualificationData.QualificationDataFactory;
import qualificationData.QualificationDataPackage;
import qualificationData.SerieTemporelle;

import qualificationData.util.QualificationDataValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualificationDataPackageImpl extends EPackageImpl implements QualificationDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementQualifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serieTemporelleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mesureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoQualificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manuelleQualificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qualificationData.QualificationDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualificationDataPackageImpl() {
		super(eNS_URI, QualificationDataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QualificationDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualificationDataPackage init() {
		if (isInited) return (QualificationDataPackage)EPackage.Registry.INSTANCE.getEPackage(QualificationDataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQualificationDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QualificationDataPackageImpl theQualificationDataPackage = registeredQualificationDataPackage instanceof QualificationDataPackageImpl ? (QualificationDataPackageImpl)registeredQualificationDataPackage : new QualificationDataPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theQualificationDataPackage.createPackageContents();

		// Initialize created meta-data
		theQualificationDataPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQualificationDataPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return QualificationDataValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQualificationDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualificationDataPackage.eNS_URI, theQualificationDataPackage);
		return theQualificationDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementQualifiable() {
		return elementQualifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementQualifiable_Id() {
		return (EAttribute)elementQualifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSerieTemporelle() {
		return serieTemporelleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSerieTemporelle_Mesure() {
		return (EReference)serieTemporelleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSerieTemporelle__AuMoinsUneQualification__DiagnosticChain_Map() {
		return serieTemporelleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSerieTemporelle__AuMoinsUneMesureValide__DiagnosticChain_Map() {
		return serieTemporelleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSerieTemporelle__MesuresPositives__DiagnosticChain_Map() {
		return serieTemporelleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSerieTemporelle__QualityCodeCorrect__DiagnosticChain_Map() {
		return serieTemporelleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMesure() {
		return mesureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMesure_Serie() {
		return (EReference)mesureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMesure_Valeur() {
		return (EAttribute)mesureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMesure_Timestamp() {
		return (EAttribute)mesureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMesure_Qualification() {
		return (EReference)mesureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualification() {
		return qualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualification_Qualitycode() {
		return (EAttribute)qualificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutoQualification() {
		return autoQualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutoQualification_Algo() {
		return (EAttribute)autoQualificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManuelleQualification() {
		return manuelleQualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManuelleQualification_Commentaire() {
		return (EAttribute)manuelleQualificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualificationDataFactory getQualificationDataFactory() {
		return (QualificationDataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementQualifiableEClass = createEClass(ELEMENT_QUALIFIABLE);
		createEAttribute(elementQualifiableEClass, ELEMENT_QUALIFIABLE__ID);

		serieTemporelleEClass = createEClass(SERIE_TEMPORELLE);
		createEReference(serieTemporelleEClass, SERIE_TEMPORELLE__MESURE);
		createEOperation(serieTemporelleEClass, SERIE_TEMPORELLE___AU_MOINS_UNE_QUALIFICATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(serieTemporelleEClass, SERIE_TEMPORELLE___AU_MOINS_UNE_MESURE_VALIDE__DIAGNOSTICCHAIN_MAP);
		createEOperation(serieTemporelleEClass, SERIE_TEMPORELLE___MESURES_POSITIVES__DIAGNOSTICCHAIN_MAP);
		createEOperation(serieTemporelleEClass, SERIE_TEMPORELLE___QUALITY_CODE_CORRECT__DIAGNOSTICCHAIN_MAP);

		mesureEClass = createEClass(MESURE);
		createEReference(mesureEClass, MESURE__SERIE);
		createEAttribute(mesureEClass, MESURE__VALEUR);
		createEAttribute(mesureEClass, MESURE__TIMESTAMP);
		createEReference(mesureEClass, MESURE__QUALIFICATION);

		qualificationEClass = createEClass(QUALIFICATION);
		createEAttribute(qualificationEClass, QUALIFICATION__QUALITYCODE);

		autoQualificationEClass = createEClass(AUTO_QUALIFICATION);
		createEAttribute(autoQualificationEClass, AUTO_QUALIFICATION__ALGO);

		manuelleQualificationEClass = createEClass(MANUELLE_QUALIFICATION);
		createEAttribute(manuelleQualificationEClass, MANUELLE_QUALIFICATION__COMMENTAIRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serieTemporelleEClass.getESuperTypes().add(this.getElementQualifiable());
		autoQualificationEClass.getESuperTypes().add(this.getQualification());
		manuelleQualificationEClass.getESuperTypes().add(this.getQualification());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementQualifiableEClass, ElementQualifiable.class, "ElementQualifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementQualifiable_Id(), ecorePackage.getEString(), "id", null, 0, 1, ElementQualifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serieTemporelleEClass, SerieTemporelle.class, "SerieTemporelle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSerieTemporelle_Mesure(), this.getMesure(), null, "mesure", null, 0, -1, SerieTemporelle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSerieTemporelle__AuMoinsUneQualification__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "auMoinsUneQualification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSerieTemporelle__AuMoinsUneMesureValide__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "auMoinsUneMesureValide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSerieTemporelle__MesuresPositives__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mesuresPositives", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSerieTemporelle__QualityCodeCorrect__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "qualityCodeCorrect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mesureEClass, Mesure.class, "Mesure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMesure_Serie(), this.getSerieTemporelle(), null, "serie", null, 1, 1, Mesure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMesure_Valeur(), ecorePackage.getEInt(), "valeur", null, 1, 1, Mesure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMesure_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, Mesure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMesure_Qualification(), this.getQualification(), null, "qualification", null, 0, 1, Mesure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualificationEClass, Qualification.class, "Qualification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualification_Qualitycode(), ecorePackage.getEInt(), "qualitycode", null, 1, 1, Qualification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autoQualificationEClass, AutoQualification.class, "AutoQualification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutoQualification_Algo(), ecorePackage.getEString(), "algo", null, 0, 1, AutoQualification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manuelleQualificationEClass, ManuelleQualification.class, "ManuelleQualification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManuelleQualification_Commentaire(), ecorePackage.getEString(), "commentaire", null, 0, 1, ManuelleQualification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (serieTemporelleEClass,
		   source,
		   new String[] {
			   "constraints", "qualityCodeCorrect"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getSerieTemporelle__AuMoinsUneQualification__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.mesure->exists(m : Mesure | m.qualification <> null)"
		   });
		addAnnotation
		  (getSerieTemporelle__AuMoinsUneMesureValide__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.mesure->exists(m: Mesure |\n        m.valeur >= 0 and (m.qualification.oclIsKindOf(AutoQualification) implies m.qualification.qualitycode > 1) and\n        (m.qualification.oclIsKindOf(ManuelleQualification) implies m.qualification.qualitycode > 0))"
		   });
		addAnnotation
		  (getSerieTemporelle__MesuresPositives__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.mesure->select(m : Mesure | m.valeur < 0)->isEmpty()"
		   });
		addAnnotation
		  (getSerieTemporelle__QualityCodeCorrect__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.mesure->collect(m : Mesure | m.qualification)->select(q : Qualification | q.oclIsKindOf(AutoQualification))->forAll(q : Qualification | q.qualitycode > 1)"
		   });
	}

} //QualificationDataPackageImpl
