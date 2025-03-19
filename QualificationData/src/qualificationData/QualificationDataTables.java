/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /QualificationData/model/qualificationData.ecore
 * using:
 *   /QualificationData/model/qualificationData.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package qualificationData;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import qualificationData.QualificationDataPackage;
// import qualificationData.QualificationDataTables;

/**
 * QualificationDataTables provides the dispatch tables for the qualificationData for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class QualificationDataTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(QualificationDataPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_qualificationData = IdManager.getNsURIPackageId("http://www.example.org/qualificationData", null, QualificationDataPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AutoQualification = QualificationDataTables.PACKid_http_c_s_s_www_example_org_s_qualificationData.getClassId("AutoQualification", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = QualificationDataTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ManuelleQualification = QualificationDataTables.PACKid_http_c_s_s_www_example_org_s_qualificationData.getClassId("ManuelleQualification", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Mesure = QualificationDataTables.PACKid_http_c_s_s_www_example_org_s_qualificationData.getClassId("Mesure", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Qualification = QualificationDataTables.PACKid_http_c_s_s_www_example_org_s_qualificationData.getClassId("Qualification", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SerieTemporelle = QualificationDataTables.PACKid_http_c_s_s_www_example_org_s_qualificationData.getClassId("SerieTemporelle", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = QualificationDataTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = QualificationDataTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Mesure = TypeId.BAG.getSpecializedId(QualificationDataTables.CLSSid_Mesure);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Mesure = TypeId.ORDERED_SET.getSpecializedId(QualificationDataTables.CLSSid_Mesure);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Qualification = TypeId.SEQUENCE.getSpecializedId(QualificationDataTables.CLSSid_Qualification);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			QualificationDataTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AutoQualification = new EcoreExecutorType(QualificationDataPackage.Literals.AUTO_QUALIFICATION, PACKAGE, 0);
		public static final EcoreExecutorType _ElementQualifiable = new EcoreExecutorType(QualificationDataPackage.Literals.ELEMENT_QUALIFIABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ManuelleQualification = new EcoreExecutorType(QualificationDataPackage.Literals.MANUELLE_QUALIFICATION, PACKAGE, 0);
		public static final EcoreExecutorType _Mesure = new EcoreExecutorType(QualificationDataPackage.Literals.MESURE, PACKAGE, 0);
		public static final EcoreExecutorType _Qualification = new EcoreExecutorType(QualificationDataPackage.Literals.QUALIFICATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _SerieTemporelle = new EcoreExecutorType(QualificationDataPackage.Literals.SERIE_TEMPORELLE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AutoQualification,
			_ElementQualifiable,
			_ManuelleQualification,
			_Mesure,
			_Qualification,
			_SerieTemporelle
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AutoQualification__AutoQualification = new ExecutorFragment(Types._AutoQualification, QualificationDataTables.Types._AutoQualification);
		private static final ExecutorFragment _AutoQualification__OclAny = new ExecutorFragment(Types._AutoQualification, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AutoQualification__OclElement = new ExecutorFragment(Types._AutoQualification, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AutoQualification__Qualification = new ExecutorFragment(Types._AutoQualification, QualificationDataTables.Types._Qualification);

		private static final ExecutorFragment _ElementQualifiable__ElementQualifiable = new ExecutorFragment(Types._ElementQualifiable, QualificationDataTables.Types._ElementQualifiable);
		private static final ExecutorFragment _ElementQualifiable__OclAny = new ExecutorFragment(Types._ElementQualifiable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ElementQualifiable__OclElement = new ExecutorFragment(Types._ElementQualifiable, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ManuelleQualification__ManuelleQualification = new ExecutorFragment(Types._ManuelleQualification, QualificationDataTables.Types._ManuelleQualification);
		private static final ExecutorFragment _ManuelleQualification__OclAny = new ExecutorFragment(Types._ManuelleQualification, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ManuelleQualification__OclElement = new ExecutorFragment(Types._ManuelleQualification, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ManuelleQualification__Qualification = new ExecutorFragment(Types._ManuelleQualification, QualificationDataTables.Types._Qualification);

		private static final ExecutorFragment _Mesure__Mesure = new ExecutorFragment(Types._Mesure, QualificationDataTables.Types._Mesure);
		private static final ExecutorFragment _Mesure__OclAny = new ExecutorFragment(Types._Mesure, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Mesure__OclElement = new ExecutorFragment(Types._Mesure, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Qualification__OclAny = new ExecutorFragment(Types._Qualification, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Qualification__OclElement = new ExecutorFragment(Types._Qualification, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Qualification__Qualification = new ExecutorFragment(Types._Qualification, QualificationDataTables.Types._Qualification);

		private static final ExecutorFragment _SerieTemporelle__ElementQualifiable = new ExecutorFragment(Types._SerieTemporelle, QualificationDataTables.Types._ElementQualifiable);
		private static final ExecutorFragment _SerieTemporelle__OclAny = new ExecutorFragment(Types._SerieTemporelle, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SerieTemporelle__OclElement = new ExecutorFragment(Types._SerieTemporelle, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SerieTemporelle__SerieTemporelle = new ExecutorFragment(Types._SerieTemporelle, QualificationDataTables.Types._SerieTemporelle);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AutoQualification__algo = new EcoreExecutorProperty(QualificationDataPackage.Literals.AUTO_QUALIFICATION__ALGO, Types._AutoQualification, 0);

		public static final ExecutorProperty _ElementQualifiable__id = new EcoreExecutorProperty(QualificationDataPackage.Literals.ELEMENT_QUALIFIABLE__ID, Types._ElementQualifiable, 0);

		public static final ExecutorProperty _ManuelleQualification__commentaire = new EcoreExecutorProperty(QualificationDataPackage.Literals.MANUELLE_QUALIFICATION__COMMENTAIRE, Types._ManuelleQualification, 0);

		public static final ExecutorProperty _Mesure__qualification = new EcoreExecutorProperty(QualificationDataPackage.Literals.MESURE__QUALIFICATION, Types._Mesure, 0);
		public static final ExecutorProperty _Mesure__serie = new EcoreExecutorProperty(QualificationDataPackage.Literals.MESURE__SERIE, Types._Mesure, 1);
		public static final ExecutorProperty _Mesure__timestamp = new EcoreExecutorProperty(QualificationDataPackage.Literals.MESURE__TIMESTAMP, Types._Mesure, 2);
		public static final ExecutorProperty _Mesure__valeur = new EcoreExecutorProperty(QualificationDataPackage.Literals.MESURE__VALEUR, Types._Mesure, 3);
		public static final ExecutorProperty _Mesure__SerieTemporelle__mesure = new ExecutorPropertyWithImplementation("SerieTemporelle", Types._Mesure, 4, new EcoreLibraryOppositeProperty(QualificationDataPackage.Literals.SERIE_TEMPORELLE__MESURE));

		public static final ExecutorProperty _Qualification__qualitycode = new EcoreExecutorProperty(QualificationDataPackage.Literals.QUALIFICATION__QUALITYCODE, Types._Qualification, 0);
		public static final ExecutorProperty _Qualification__Mesure__qualification = new ExecutorPropertyWithImplementation("Mesure", Types._Qualification, 1, new EcoreLibraryOppositeProperty(QualificationDataPackage.Literals.MESURE__QUALIFICATION));

		public static final ExecutorProperty _SerieTemporelle__mesure = new EcoreExecutorProperty(QualificationDataPackage.Literals.SERIE_TEMPORELLE__MESURE, Types._SerieTemporelle, 0);
		public static final ExecutorProperty _SerieTemporelle__Mesure__serie = new ExecutorPropertyWithImplementation("Mesure", Types._SerieTemporelle, 1, new EcoreLibraryOppositeProperty(QualificationDataPackage.Literals.MESURE__SERIE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AutoQualification =
			{
				Fragments._AutoQualification__OclAny /* 0 */,
				Fragments._AutoQualification__OclElement /* 1 */,
				Fragments._AutoQualification__Qualification /* 2 */,
				Fragments._AutoQualification__AutoQualification /* 3 */
			};
		private static final int /*@NonNull*/ [] __AutoQualification = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ElementQualifiable =
			{
				Fragments._ElementQualifiable__OclAny /* 0 */,
				Fragments._ElementQualifiable__OclElement /* 1 */,
				Fragments._ElementQualifiable__ElementQualifiable /* 2 */
			};
		private static final int /*@NonNull*/ [] __ElementQualifiable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ManuelleQualification =
			{
				Fragments._ManuelleQualification__OclAny /* 0 */,
				Fragments._ManuelleQualification__OclElement /* 1 */,
				Fragments._ManuelleQualification__Qualification /* 2 */,
				Fragments._ManuelleQualification__ManuelleQualification /* 3 */
			};
		private static final int /*@NonNull*/ [] __ManuelleQualification = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Mesure =
			{
				Fragments._Mesure__OclAny /* 0 */,
				Fragments._Mesure__OclElement /* 1 */,
				Fragments._Mesure__Mesure /* 2 */
			};
		private static final int /*@NonNull*/ [] __Mesure = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Qualification =
			{
				Fragments._Qualification__OclAny /* 0 */,
				Fragments._Qualification__OclElement /* 1 */,
				Fragments._Qualification__Qualification /* 2 */
			};
		private static final int /*@NonNull*/ [] __Qualification = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SerieTemporelle =
			{
				Fragments._SerieTemporelle__OclAny /* 0 */,
				Fragments._SerieTemporelle__OclElement /* 1 */,
				Fragments._SerieTemporelle__ElementQualifiable /* 2 */,
				Fragments._SerieTemporelle__SerieTemporelle /* 3 */
			};
		private static final int /*@NonNull*/ [] __SerieTemporelle = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AutoQualification.initFragments(_AutoQualification, __AutoQualification);
			Types._ElementQualifiable.initFragments(_ElementQualifiable, __ElementQualifiable);
			Types._ManuelleQualification.initFragments(_ManuelleQualification, __ManuelleQualification);
			Types._Mesure.initFragments(_Mesure, __Mesure);
			Types._Qualification.initFragments(_Qualification, __Qualification);
			Types._SerieTemporelle.initFragments(_SerieTemporelle, __SerieTemporelle);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AutoQualification__AutoQualification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AutoQualification__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AutoQualification__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AutoQualification__Qualification = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ElementQualifiable__ElementQualifiable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ElementQualifiable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ElementQualifiable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ManuelleQualification__ManuelleQualification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ManuelleQualification__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ManuelleQualification__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ManuelleQualification__Qualification = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Mesure__Mesure = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mesure__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mesure__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Qualification__Qualification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Qualification__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Qualification__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SerieTemporelle__SerieTemporelle = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SerieTemporelle__ElementQualifiable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SerieTemporelle__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SerieTemporelle__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AutoQualification__AutoQualification.initOperations(_AutoQualification__AutoQualification);
			Fragments._AutoQualification__OclAny.initOperations(_AutoQualification__OclAny);
			Fragments._AutoQualification__OclElement.initOperations(_AutoQualification__OclElement);
			Fragments._AutoQualification__Qualification.initOperations(_AutoQualification__Qualification);

			Fragments._ElementQualifiable__ElementQualifiable.initOperations(_ElementQualifiable__ElementQualifiable);
			Fragments._ElementQualifiable__OclAny.initOperations(_ElementQualifiable__OclAny);
			Fragments._ElementQualifiable__OclElement.initOperations(_ElementQualifiable__OclElement);

			Fragments._ManuelleQualification__ManuelleQualification.initOperations(_ManuelleQualification__ManuelleQualification);
			Fragments._ManuelleQualification__OclAny.initOperations(_ManuelleQualification__OclAny);
			Fragments._ManuelleQualification__OclElement.initOperations(_ManuelleQualification__OclElement);
			Fragments._ManuelleQualification__Qualification.initOperations(_ManuelleQualification__Qualification);

			Fragments._Mesure__Mesure.initOperations(_Mesure__Mesure);
			Fragments._Mesure__OclAny.initOperations(_Mesure__OclAny);
			Fragments._Mesure__OclElement.initOperations(_Mesure__OclElement);

			Fragments._Qualification__OclAny.initOperations(_Qualification__OclAny);
			Fragments._Qualification__OclElement.initOperations(_Qualification__OclElement);
			Fragments._Qualification__Qualification.initOperations(_Qualification__Qualification);

			Fragments._SerieTemporelle__ElementQualifiable.initOperations(_SerieTemporelle__ElementQualifiable);
			Fragments._SerieTemporelle__OclAny.initOperations(_SerieTemporelle__OclAny);
			Fragments._SerieTemporelle__OclElement.initOperations(_SerieTemporelle__OclElement);
			Fragments._SerieTemporelle__SerieTemporelle.initOperations(_SerieTemporelle__SerieTemporelle);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AutoQualification = {
			QualificationDataTables.Properties._AutoQualification__algo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QualificationDataTables.Properties._Qualification__qualitycode
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ElementQualifiable = {
			QualificationDataTables.Properties._ElementQualifiable__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ManuelleQualification = {
			QualificationDataTables.Properties._ManuelleQualification__commentaire,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QualificationDataTables.Properties._Qualification__qualitycode
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Mesure = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QualificationDataTables.Properties._Mesure__qualification,
			QualificationDataTables.Properties._Mesure__serie,
			QualificationDataTables.Properties._Mesure__timestamp,
			QualificationDataTables.Properties._Mesure__valeur
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Qualification = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QualificationDataTables.Properties._Qualification__qualitycode
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SerieTemporelle = {
			QualificationDataTables.Properties._ElementQualifiable__id,
			QualificationDataTables.Properties._SerieTemporelle__mesure,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AutoQualification__AutoQualification.initProperties(_AutoQualification);
			Fragments._ElementQualifiable__ElementQualifiable.initProperties(_ElementQualifiable);
			Fragments._ManuelleQualification__ManuelleQualification.initProperties(_ManuelleQualification);
			Fragments._Mesure__Mesure.initProperties(_Mesure);
			Fragments._Qualification__Qualification.initProperties(_Qualification);
			Fragments._SerieTemporelle__SerieTemporelle.initProperties(_SerieTemporelle);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QualificationDataTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new QualificationDataTables();
	}

	private QualificationDataTables() {
		super(QualificationDataPackage.eNS_URI);
	}
}
