/**
 */
package qualificationData.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.SequenceValue;

import qualificationData.Mesure;
import qualificationData.Qualification;
import qualificationData.QualificationDataPackage;
import qualificationData.QualificationDataTables;
import qualificationData.SerieTemporelle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serie Temporelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualificationData.impl.SerieTemporelleImpl#getMesure <em>Mesure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SerieTemporelleImpl extends ElementQualifiableImpl implements SerieTemporelle {
	/**
	 * The cached value of the '{@link #getMesure() <em>Mesure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesure()
	 * @generated
	 * @ordered
	 */
	protected EList<Mesure> mesure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerieTemporelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualificationDataPackage.Literals.SERIE_TEMPORELLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mesure> getMesure() {
		if (mesure == null) {
			mesure = new EObjectContainmentEList<Mesure>(Mesure.class, this, QualificationDataPackage.SERIE_TEMPORELLE__MESURE);
		}
		return mesure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean auMoinsUneQualification(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SerieTemporelle::auMoinsUneQualification";
		try {
			/**
			 *
			 * inv auMoinsUneQualification:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.mesure->exists(m | m.qualification <> null)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QualificationDataPackage.Literals.SERIE_TEMPORELLE___AU_MOINS_UNE_QUALIFICATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QualificationDataTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Mesure> mesure = this.getMesure();
				final /*@NonInvalid*/ OrderedSetValue BOXED_mesure = idResolver.createOrderedSetOfAll(QualificationDataTables.ORD_CLSSid_Mesure, mesure);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_m = BOXED_mesure.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Mesure m = (Mesure)ITERATOR_m.next();
					/**
					 * m.qualification <> null
					 */
					final /*@NonInvalid*/ Qualification qualification = m.getQualification();
					final /*@NonInvalid*/ boolean ne = qualification != null;
					//
					if (ne) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (!ne) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, QualificationDataTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean auMoinsUneMesureValide(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SerieTemporelle::auMoinsUneMesureValide";
		try {
			/**
			 *
			 * inv auMoinsUneMesureValide:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.mesure->exists(m | m.valeur >= 0 and
			 *           (
			 *             m.qualification.oclIsKindOf(AutoQualification) implies m.qualification.qualitycode > 1
			 *           ) and
			 *           (
			 *             m.qualification.oclIsKindOf(ManuelleQualification) implies m.qualification.qualitycode > 0
			 *           ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QualificationDataPackage.Literals.SERIE_TEMPORELLE___AU_MOINS_UNE_MESURE_VALIDE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QualificationDataTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Mesure> mesure = this.getMesure();
					final /*@NonInvalid*/ OrderedSetValue BOXED_mesure = idResolver.createOrderedSetOfAll(QualificationDataTables.ORD_CLSSid_Mesure, mesure);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_m = BOXED_mesure.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_m.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.FALSE_VALUE) {
								result = ValueUtil.FALSE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Mesure m = (Mesure)ITERATOR_m.next();
						/**
						 * m.valeur >= 0 and
						 * (
						 *   m.qualification.oclIsKindOf(AutoQualification) implies m.qualification.qualitycode > 1
						 * ) and
						 * (
						 *   m.qualification.oclIsKindOf(ManuelleQualification) implies m.qualification.qualitycode > 0
						 * )
						 */
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ Object CAUGHT_and;
							try {
								final /*@NonInvalid*/ int valeur = m.getValeur();
								final /*@NonInvalid*/ IntegerValue BOXED_valeur = ValueUtil.integerValueOf(valeur);
								final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_valeur, QualificationDataTables.INT_0).booleanValue();
								final /*@Thrown*/ Boolean and;
								if (!ge) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_implies;
									try {
										/*@Caught*/ Object CAUGHT_oclIsKindOf;
										try {
											final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_qualificationData_c_c_AutoQualification_0 = idResolver.getClass(QualificationDataTables.CLSSid_AutoQualification, null);
											final /*@NonInvalid*/ Qualification qualification = m.getQualification();
											final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, qualification, TYP_qualificationData_c_c_AutoQualification_0).booleanValue();
											CAUGHT_oclIsKindOf = oclIsKindOf;
										}
										catch (Exception e) {
											CAUGHT_oclIsKindOf = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean implies;
										if (CAUGHT_oclIsKindOf == ValueUtil.FALSE_VALUE) {
											implies = ValueUtil.TRUE_VALUE;
										}
										else {
											/*@Caught*/ Object CAUGHT_gt;
											try {
												final /*@NonInvalid*/ Qualification qualification_0 = m.getQualification();
												if (qualification_0 == null) {
													throw new InvalidValueException("Null source for \'\'http://www.example.org/qualificationData\'::Qualification::qualitycode\'");
												}
												final /*@Thrown*/ int qualitycode = qualification_0.getQualitycode();
												final /*@Thrown*/ IntegerValue BOXED_qualitycode = ValueUtil.integerValueOf(qualitycode);
												final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_qualitycode, QualificationDataTables.INT_1).booleanValue();
												CAUGHT_gt = gt;
											}
											catch (Exception e) {
												CAUGHT_gt = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
												implies = ValueUtil.TRUE_VALUE;
											}
											else {
												if (CAUGHT_oclIsKindOf instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_oclIsKindOf;
												}
												if (CAUGHT_gt instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_gt;
												}
												implies = ValueUtil.FALSE_VALUE;
											}
										}
										CAUGHT_implies = implies;
									}
									catch (Exception e) {
										CAUGHT_implies = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									}
									else {
										if (CAUGHT_implies instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_implies;
										}
										if (CAUGHT_implies == null) {
											and = null;
										}
										else {
											and = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and = and;
							}
							catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0;
							if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_implies_0;
								try {
									/*@Caught*/ Object CAUGHT_oclIsKindOf_0;
									try {
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_qualificationData_c_c_ManuelleQualification = idResolver.getClass(QualificationDataTables.CLSSid_ManuelleQualification, null);
										final /*@NonInvalid*/ Qualification qualification_1 = m.getQualification();
										final /*@Thrown*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, qualification_1, TYP_qualificationData_c_c_ManuelleQualification).booleanValue();
										CAUGHT_oclIsKindOf_0 = oclIsKindOf_0;
									}
									catch (Exception e) {
										CAUGHT_oclIsKindOf_0 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean implies_0;
									if (CAUGHT_oclIsKindOf_0 == ValueUtil.FALSE_VALUE) {
										implies_0 = ValueUtil.TRUE_VALUE;
									}
									else {
										/*@Caught*/ Object CAUGHT_gt_0;
										try {
											final /*@NonInvalid*/ Qualification qualification_2 = m.getQualification();
											if (qualification_2 == null) {
												throw new InvalidValueException("Null source for \'\'http://www.example.org/qualificationData\'::Qualification::qualitycode\'");
											}
											final /*@Thrown*/ int qualitycode_0 = qualification_2.getQualitycode();
											final /*@Thrown*/ IntegerValue BOXED_qualitycode_0 = ValueUtil.integerValueOf(qualitycode_0);
											final /*@Thrown*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_qualitycode_0, QualificationDataTables.INT_0).booleanValue();
											CAUGHT_gt_0 = gt_0;
										}
										catch (Exception e) {
											CAUGHT_gt_0 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_gt_0 == ValueUtil.TRUE_VALUE) {
											implies_0 = ValueUtil.TRUE_VALUE;
										}
										else {
											if (CAUGHT_oclIsKindOf_0 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_oclIsKindOf_0;
											}
											if (CAUGHT_gt_0 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_gt_0;
											}
											implies_0 = ValueUtil.FALSE_VALUE;
										}
									}
									CAUGHT_implies_0 = implies_0;
								}
								catch (Exception e) {
									CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_implies_0 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_and instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_and;
									}
									if (CAUGHT_implies_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_implies_0;
									}
									if ((CAUGHT_and == null) || (CAUGHT_implies_0 == null)) {
										and_0 = null;
									}
									else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_0 = and_0;
						}
						catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
							result = ValueUtil.TRUE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_and_0 == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.FALSE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_and_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_and_0;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, QualificationDataTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean mesuresPositives(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SerieTemporelle::mesuresPositives";
		try {
			/**
			 *
			 * inv mesuresPositives:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.mesure->select(m | m.valeur < 0)
			 *         ->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QualificationDataPackage.Literals.SERIE_TEMPORELLE___MESURES_POSITIVES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QualificationDataTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Mesure> mesure = this.getMesure();
				final /*@NonInvalid*/ OrderedSetValue BOXED_mesure = idResolver.createOrderedSetOfAll(QualificationDataTables.ORD_CLSSid_Mesure, mesure);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(QualificationDataTables.ORD_CLSSid_Mesure);
				Iterator<Object> ITERATOR_m = BOXED_mesure.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Mesure m = (Mesure)ITERATOR_m.next();
					/**
					 * m.valeur < 0
					 */
					final /*@NonInvalid*/ int valeur = m.getValeur();
					final /*@NonInvalid*/ IntegerValue BOXED_valeur = ValueUtil.integerValueOf(valeur);
					final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_valeur, QualificationDataTables.INT_0).booleanValue();
					//
					if (lt) {
						accumulator.add(m);
					}
				}
				final /*@NonInvalid*/ boolean result = CollectionIsEmptyOperation.INSTANCE.evaluate(select).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, QualificationDataTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean qualityCodeCorrect(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SerieTemporelle::qualityCodeCorrect";
		try {
			/**
			 *
			 * inv qualityCodeCorrect:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.mesure->collect(m | m.qualification)
			 *         ->select(q | q.oclIsKindOf(AutoQualification))
			 *         ->forAll(q | q.qualitycode > 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, QualificationDataPackage.Literals.SERIE_TEMPORELLE___QUALITY_CODE_CORRECT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, QualificationDataTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Mesure> mesure = this.getMesure();
					final /*@NonInvalid*/ OrderedSetValue BOXED_mesure = idResolver.createOrderedSetOfAll(QualificationDataTables.ORD_CLSSid_Mesure, mesure);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(QualificationDataTables.SEQ_CLSSid_Qualification);
					Iterator<Object> ITERATOR_m = BOXED_mesure.iterator();
					/*@Thrown*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR_m.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Mesure m = (Mesure)ITERATOR_m.next();
						/**
						 * m.qualification
						 */
						final /*@NonInvalid*/ Qualification qualification = m.getQualification();
						//
						accumulator.add(qualification);
					}
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(QualificationDataTables.SEQ_CLSSid_Qualification);
					Iterator<Object> ITERATOR_q = collect.iterator();
					/*@Thrown*/ SequenceValue select;
					while (true) {
						if (!ITERATOR_q.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Qualification q = (Qualification)ITERATOR_q.next();
						/**
						 * q.oclIsKindOf(AutoQualification)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_qualificationData_c_c_AutoQualification = idResolver.getClass(QualificationDataTables.CLSSid_AutoQualification, null);
						final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, q, TYP_qualificationData_c_c_AutoQualification).booleanValue();
						//
						if (oclIsKindOf == ValueUtil.TRUE_VALUE) {
							accumulator_0.add(q);
						}
					}
					/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_q_0 = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_q_0.hasNext()) {
							if (accumulator_1 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_1;
							}
							break;
						}
						/*@NonInvalid*/ Qualification q_0 = (Qualification)ITERATOR_q_0.next();
						/**
						 * q.qualitycode > 1
						 */
						/*@Caught*/ Object CAUGHT_gt;
						try {
							if (q_0 == null) {
								throw new InvalidValueException("Null source for \'\'http://www.example.org/qualificationData\'::Qualification::qualitycode\'");
							}
							final /*@Thrown*/ int qualitycode = q_0.getQualitycode();
							final /*@Thrown*/ IntegerValue BOXED_qualitycode = ValueUtil.integerValueOf(qualitycode);
							final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_qualitycode, QualificationDataTables.INT_1).booleanValue();
							CAUGHT_gt = gt;
						}
						catch (Exception e) {
							CAUGHT_gt = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_gt instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator_1 = CAUGHT_gt;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, QualificationDataTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualificationDataPackage.SERIE_TEMPORELLE__MESURE:
				return ((InternalEList<?>)getMesure()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualificationDataPackage.SERIE_TEMPORELLE__MESURE:
				return getMesure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualificationDataPackage.SERIE_TEMPORELLE__MESURE:
				getMesure().clear();
				getMesure().addAll((Collection<? extends Mesure>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QualificationDataPackage.SERIE_TEMPORELLE__MESURE:
				getMesure().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QualificationDataPackage.SERIE_TEMPORELLE__MESURE:
				return mesure != null && !mesure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QualificationDataPackage.SERIE_TEMPORELLE___AU_MOINS_UNE_QUALIFICATION__DIAGNOSTICCHAIN_MAP:
				return auMoinsUneQualification((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case QualificationDataPackage.SERIE_TEMPORELLE___AU_MOINS_UNE_MESURE_VALIDE__DIAGNOSTICCHAIN_MAP:
				return auMoinsUneMesureValide((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case QualificationDataPackage.SERIE_TEMPORELLE___MESURES_POSITIVES__DIAGNOSTICCHAIN_MAP:
				return mesuresPositives((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case QualificationDataPackage.SERIE_TEMPORELLE___QUALITY_CODE_CORRECT__DIAGNOSTICCHAIN_MAP:
				return qualityCodeCorrect((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SerieTemporelleImpl
