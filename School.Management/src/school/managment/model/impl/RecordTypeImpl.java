/**
 */
package school.managment.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import school.managment.model.RecordType;
import school.managment.model.SchoolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link school.managment.model.impl.RecordTypeImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link school.managment.model.impl.RecordTypeImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link school.managment.model.impl.RecordTypeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link school.managment.model.impl.RecordTypeImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link school.managment.model.impl.RecordTypeImpl#getGPA <em>GPA</em>}</li>
 *   <li>{@link school.managment.model.impl.RecordTypeImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordTypeImpl extends MinimalEObjectImpl.Container implements RecordType {
	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final byte AGE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected byte age = AGE_EDEFAULT;

	/**
	 * This is true if the Age attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ageESet;

	/**
	 * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected static final String MAJOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected String major = MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGPA() <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPA()
	 * @generated
	 * @ordered
	 */
	protected static final float GPA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGPA() <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPA()
	 * @generated
	 * @ordered
	 */
	protected float gPA = GPA_EDEFAULT;

	/**
	 * This is true if the GPA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gPAESet;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.RECORD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.RECORD_TYPE__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.RECORD_TYPE__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(byte newAge) {
		byte oldAge = age;
		age = newAge;
		boolean oldAgeESet = ageESet;
		ageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.RECORD_TYPE__AGE, oldAge, age, !oldAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAge() {
		byte oldAge = age;
		boolean oldAgeESet = ageESet;
		age = AGE_EDEFAULT;
		ageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchoolPackage.RECORD_TYPE__AGE, oldAge, AGE_EDEFAULT, oldAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAge() {
		return ageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajor(String newMajor) {
		String oldMajor = major;
		major = newMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.RECORD_TYPE__MAJOR, oldMajor, major));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGPA() {
		return gPA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPA(float newGPA) {
		float oldGPA = gPA;
		gPA = newGPA;
		boolean oldGPAESet = gPAESet;
		gPAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.RECORD_TYPE__GPA, oldGPA, gPA, !oldGPAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGPA() {
		float oldGPA = gPA;
		boolean oldGPAESet = gPAESet;
		gPA = GPA_EDEFAULT;
		gPAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchoolPackage.RECORD_TYPE__GPA, oldGPA, GPA_EDEFAULT, oldGPAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGPA() {
		return gPAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.RECORD_TYPE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchoolPackage.RECORD_TYPE__LAST_NAME:
				return getLastName();
			case SchoolPackage.RECORD_TYPE__FIRST_NAME:
				return getFirstName();
			case SchoolPackage.RECORD_TYPE__AGE:
				return getAge();
			case SchoolPackage.RECORD_TYPE__MAJOR:
				return getMajor();
			case SchoolPackage.RECORD_TYPE__GPA:
				return getGPA();
			case SchoolPackage.RECORD_TYPE__YEAR:
				return getYear();
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
			case SchoolPackage.RECORD_TYPE__LAST_NAME:
				setLastName((String)newValue);
				return;
			case SchoolPackage.RECORD_TYPE__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case SchoolPackage.RECORD_TYPE__AGE:
				setAge((Byte)newValue);
				return;
			case SchoolPackage.RECORD_TYPE__MAJOR:
				setMajor((String)newValue);
				return;
			case SchoolPackage.RECORD_TYPE__GPA:
				setGPA((Float)newValue);
				return;
			case SchoolPackage.RECORD_TYPE__YEAR:
				setYear((String)newValue);
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
			case SchoolPackage.RECORD_TYPE__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case SchoolPackage.RECORD_TYPE__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case SchoolPackage.RECORD_TYPE__AGE:
				unsetAge();
				return;
			case SchoolPackage.RECORD_TYPE__MAJOR:
				setMajor(MAJOR_EDEFAULT);
				return;
			case SchoolPackage.RECORD_TYPE__GPA:
				unsetGPA();
				return;
			case SchoolPackage.RECORD_TYPE__YEAR:
				setYear(YEAR_EDEFAULT);
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
			case SchoolPackage.RECORD_TYPE__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case SchoolPackage.RECORD_TYPE__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case SchoolPackage.RECORD_TYPE__AGE:
				return isSetAge();
			case SchoolPackage.RECORD_TYPE__MAJOR:
				return MAJOR_EDEFAULT == null ? major != null : !MAJOR_EDEFAULT.equals(major);
			case SchoolPackage.RECORD_TYPE__GPA:
				return isSetGPA();
			case SchoolPackage.RECORD_TYPE__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lastName: ");
		result.append(lastName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", age: ");
		if (ageESet) result.append(age); else result.append("<unset>");
		result.append(", major: ");
		result.append(major);
		result.append(", gPA: ");
		if (gPAESet) result.append(gPA); else result.append("<unset>");
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //RecordTypeImpl
