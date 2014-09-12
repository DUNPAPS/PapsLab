/**
 */
package school.managment.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see school.managment.model.SchoolFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface SchoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/School.Management/model/management.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoolPackage eINSTANCE = school.managment.model.impl.SchoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link school.managment.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.managment.model.impl.DocumentRootImpl
	 * @see school.managment.model.impl.SchoolPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Student Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STUDENT_DATA = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.managment.model.impl.RecordTypeImpl <em>Record Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.managment.model.impl.RecordTypeImpl
	 * @see school.managment.model.impl.SchoolPackageImpl#getRecordType()
	 * @generated
	 */
	int RECORD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__LAST_NAME = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__AGE = 2;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__MAJOR = 3;

	/**
	 * The feature id for the '<em><b>GPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__GPA = 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__YEAR = 5;

	/**
	 * The number of structural features of the '<em>Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.managment.model.impl.StudentDataTypeImpl <em>Student Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.managment.model.impl.StudentDataTypeImpl
	 * @see school.managment.model.impl.SchoolPackageImpl#getStudentDataType()
	 * @generated
	 */
	int STUDENT_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_DATA_TYPE__RECORD = 0;

	/**
	 * The number of structural features of the '<em>Student Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Student Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_DATA_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link school.managment.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see school.managment.model.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link school.managment.model.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see school.managment.model.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link school.managment.model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see school.managment.model.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link school.managment.model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see school.managment.model.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link school.managment.model.DocumentRoot#getStudentData <em>Student Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Student Data</em>'.
	 * @see school.managment.model.DocumentRoot#getStudentData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StudentData();

	/**
	 * Returns the meta object for class '{@link school.managment.model.RecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type</em>'.
	 * @see school.managment.model.RecordType
	 * @generated
	 */
	EClass getRecordType();

	/**
	 * Returns the meta object for the attribute '{@link school.managment.model.RecordType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see school.managment.model.RecordType#getLastName()
	 * @see #getRecordType()
	 * @generated
	 */
	EAttribute getRecordType_LastName();

	/**
	 * Returns the meta object for the attribute '{@link school.managment.model.RecordType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see school.managment.model.RecordType#getFirstName()
	 * @see #getRecordType()
	 * @generated
	 */
	EAttribute getRecordType_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link school.managment.model.RecordType#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see school.managment.model.RecordType#getAge()
	 * @see #getRecordType()
	 * @generated
	 */
	EAttribute getRecordType_Age();

	/**
	 * Returns the meta object for the attribute '{@link school.managment.model.RecordType#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see school.managment.model.RecordType#getMajor()
	 * @see #getRecordType()
	 * @generated
	 */
	EAttribute getRecordType_Major();

	/**
	 * Returns the meta object for the attribute '{@link school.managment.model.RecordType#getGPA <em>GPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GPA</em>'.
	 * @see school.managment.model.RecordType#getGPA()
	 * @see #getRecordType()
	 * @generated
	 */
	EAttribute getRecordType_GPA();

	/**
	 * Returns the meta object for the attribute '{@link school.managment.model.RecordType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see school.managment.model.RecordType#getYear()
	 * @see #getRecordType()
	 * @generated
	 */
	EAttribute getRecordType_Year();

	/**
	 * Returns the meta object for class '{@link school.managment.model.StudentDataType <em>Student Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student Data Type</em>'.
	 * @see school.managment.model.StudentDataType
	 * @generated
	 */
	EClass getStudentDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link school.managment.model.StudentDataType#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see school.managment.model.StudentDataType#getRecord()
	 * @see #getStudentDataType()
	 * @generated
	 */
	EReference getStudentDataType_Record();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchoolFactory getSchoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link school.managment.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.managment.model.impl.DocumentRootImpl
		 * @see school.managment.model.impl.SchoolPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Student Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STUDENT_DATA = eINSTANCE.getDocumentRoot_StudentData();

		/**
		 * The meta object literal for the '{@link school.managment.model.impl.RecordTypeImpl <em>Record Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.managment.model.impl.RecordTypeImpl
		 * @see school.managment.model.impl.SchoolPackageImpl#getRecordType()
		 * @generated
		 */
		EClass RECORD_TYPE = eINSTANCE.getRecordType();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE__LAST_NAME = eINSTANCE.getRecordType_LastName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE__FIRST_NAME = eINSTANCE.getRecordType_FirstName();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE__AGE = eINSTANCE.getRecordType_Age();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE__MAJOR = eINSTANCE.getRecordType_Major();

		/**
		 * The meta object literal for the '<em><b>GPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE__GPA = eINSTANCE.getRecordType_GPA();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE__YEAR = eINSTANCE.getRecordType_Year();

		/**
		 * The meta object literal for the '{@link school.managment.model.impl.StudentDataTypeImpl <em>Student Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.managment.model.impl.StudentDataTypeImpl
		 * @see school.managment.model.impl.SchoolPackageImpl#getStudentDataType()
		 * @generated
		 */
		EClass STUDENT_DATA_TYPE = eINSTANCE.getStudentDataType();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT_DATA_TYPE__RECORD = eINSTANCE.getStudentDataType_Record();

	}

} //SchoolPackage
