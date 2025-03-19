/**
 */
package qualificationData.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qualificationData.Qualification;
import qualificationData.QualificationDataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualificationData.impl.QualificationImpl#getQualitycode <em>Qualitycode</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QualificationImpl extends MinimalEObjectImpl.Container implements Qualification {
	/**
	 * The default value of the '{@link #getQualitycode() <em>Qualitycode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitycode()
	 * @generated
	 * @ordered
	 */
	protected static final int QUALITYCODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQualitycode() <em>Qualitycode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitycode()
	 * @generated
	 * @ordered
	 */
	protected int qualitycode = QUALITYCODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualificationDataPackage.Literals.QUALIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQualitycode() {
		return qualitycode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualitycode(int newQualitycode) {
		int oldQualitycode = qualitycode;
		qualitycode = newQualitycode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualificationDataPackage.QUALIFICATION__QUALITYCODE, oldQualitycode, qualitycode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualificationDataPackage.QUALIFICATION__QUALITYCODE:
				return getQualitycode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualificationDataPackage.QUALIFICATION__QUALITYCODE:
				setQualitycode((Integer)newValue);
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
			case QualificationDataPackage.QUALIFICATION__QUALITYCODE:
				setQualitycode(QUALITYCODE_EDEFAULT);
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
			case QualificationDataPackage.QUALIFICATION__QUALITYCODE:
				return qualitycode != QUALITYCODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (qualitycode: ");
		result.append(qualitycode);
		result.append(')');
		return result.toString();
	}

} //QualificationImpl
