/**
 */
package school.managment.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import school.managment.model.RecordType;
import school.managment.model.SchoolPackage;
import school.managment.model.StudentDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.managment.model.impl.StudentDataTypeImpl#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudentDataTypeImpl extends MinimalEObjectImpl.Container implements StudentDataType {
	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordType> record;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.STUDENT_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordType> getRecord() {
		if (record == null) {
			record = new EObjectContainmentEList<RecordType>(RecordType.class, this, SchoolPackage.STUDENT_DATA_TYPE__RECORD);
		}
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.STUDENT_DATA_TYPE__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
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
			case SchoolPackage.STUDENT_DATA_TYPE__RECORD:
				return getRecord();
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
			case SchoolPackage.STUDENT_DATA_TYPE__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends RecordType>)newValue);
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
			case SchoolPackage.STUDENT_DATA_TYPE__RECORD:
				getRecord().clear();
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
			case SchoolPackage.STUDENT_DATA_TYPE__RECORD:
				return record != null && !record.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudentDataTypeImpl
