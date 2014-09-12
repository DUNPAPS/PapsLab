/**
 */
package school.managment.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.managment.model.StudentDataType#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.managment.model.SchoolPackage#getStudentDataType()
 * @model extendedMetaData="name='student-data_._type' kind='elementOnly'"
 * @generated
 */
public interface StudentDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference list.
	 * The list contents are of type {@link school.managment.model.RecordType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference list.
	 * @see school.managment.model.SchoolPackage#getStudentDataType_Record()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='record' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RecordType> getRecord();

} // StudentDataType
