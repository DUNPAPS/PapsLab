/**
 */
package school.managment.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link school.managment.model.RecordType#getLastName <em>Last Name</em>}</li>
 *   <li>{@link school.managment.model.RecordType#getFirstName <em>First Name</em>}</li>
 *   <li>{@link school.managment.model.RecordType#getAge <em>Age</em>}</li>
 *   <li>{@link school.managment.model.RecordType#getMajor <em>Major</em>}</li>
 *   <li>{@link school.managment.model.RecordType#getGPA <em>GPA</em>}</li>
 *   <li>{@link school.managment.model.RecordType#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see school.managment.model.SchoolPackage#getRecordType()
 * @model extendedMetaData="name='record_._type' kind='elementOnly'"
 * @generated
 */
public interface RecordType extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see school.managment.model.SchoolPackage#getRecordType_LastName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='LastName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link school.managment.model.RecordType#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see school.managment.model.SchoolPackage#getRecordType_FirstName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='FirstName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link school.managment.model.RecordType#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #isSetAge()
	 * @see #unsetAge()
	 * @see #setAge(byte)
	 * @see school.managment.model.SchoolPackage#getRecordType_Age()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte" required="true"
	 *        extendedMetaData="kind='element' name='Age' namespace='##targetNamespace'"
	 * @generated
	 */
	byte getAge();

	/**
	 * Sets the value of the '{@link school.managment.model.RecordType#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #isSetAge()
	 * @see #unsetAge()
	 * @see #getAge()
	 * @generated
	 */
	void setAge(byte value);

	/**
	 * Unsets the value of the '{@link school.managment.model.RecordType#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAge()
	 * @see #getAge()
	 * @see #setAge(byte)
	 * @generated
	 */
	void unsetAge();

	/**
	 * Returns whether the value of the '{@link school.managment.model.RecordType#getAge <em>Age</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Age</em>' attribute is set.
	 * @see #unsetAge()
	 * @see #getAge()
	 * @see #setAge(byte)
	 * @generated
	 */
	boolean isSetAge();

	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(String)
	 * @see school.managment.model.SchoolPackage#getRecordType_Major()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Major' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMajor();

	/**
	 * Sets the value of the '{@link school.managment.model.RecordType#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(String value);

	/**
	 * Returns the value of the '<em><b>GPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPA</em>' attribute.
	 * @see #isSetGPA()
	 * @see #unsetGPA()
	 * @see #setGPA(float)
	 * @see school.managment.model.SchoolPackage#getRecordType_GPA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='GPA' namespace='##targetNamespace'"
	 * @generated
	 */
	float getGPA();

	/**
	 * Sets the value of the '{@link school.managment.model.RecordType#getGPA <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPA</em>' attribute.
	 * @see #isSetGPA()
	 * @see #unsetGPA()
	 * @see #getGPA()
	 * @generated
	 */
	void setGPA(float value);

	/**
	 * Unsets the value of the '{@link school.managment.model.RecordType#getGPA <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGPA()
	 * @see #getGPA()
	 * @see #setGPA(float)
	 * @generated
	 */
	void unsetGPA();

	/**
	 * Returns whether the value of the '{@link school.managment.model.RecordType#getGPA <em>GPA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GPA</em>' attribute is set.
	 * @see #unsetGPA()
	 * @see #getGPA()
	 * @see #setGPA(float)
	 * @generated
	 */
	boolean isSetGPA();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see school.managment.model.SchoolPackage#getRecordType_Year()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Year' namespace='##targetNamespace'"
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link school.managment.model.RecordType#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

} // RecordType
