/**
 */
package qualificationData.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualificationData.AutoQualification;
import qualificationData.QualificationDataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Qualification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualificationData.impl.AutoQualificationImpl#getAlgo <em>Algo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoQualificationImpl extends QualificationImpl implements AutoQualification {
	/**
	 * The default value of the '{@link #getAlgo() <em>Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgo()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgo() <em>Algo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgo()
	 * @generated
	 * @ordered
	 */
	protected String algo = ALGO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoQualificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualificationDataPackage.Literals.AUTO_QUALIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgo() {
		return algo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgo(String newAlgo) {
		String oldAlgo = algo;
		algo = newAlgo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualificationDataPackage.AUTO_QUALIFICATION__ALGO, oldAlgo, algo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualificationDataPackage.AUTO_QUALIFICATION__ALGO:
				return getAlgo();
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
			case QualificationDataPackage.AUTO_QUALIFICATION__ALGO:
				setAlgo((String)newValue);
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
			case QualificationDataPackage.AUTO_QUALIFICATION__ALGO:
				setAlgo(ALGO_EDEFAULT);
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
			case QualificationDataPackage.AUTO_QUALIFICATION__ALGO:
				return ALGO_EDEFAULT == null ? algo != null : !ALGO_EDEFAULT.equals(algo);
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
		result.append(" (algo: ");
		result.append(algo);
		result.append(')');
		return result.toString();
	}

} //AutoQualificationImpl
