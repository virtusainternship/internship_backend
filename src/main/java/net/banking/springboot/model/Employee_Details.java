package net.banking.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_details")
public class Employee_Details {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name")
    private String Name;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name= "nationality")
    private String nationality;
    @Column(name= "sex")
    private String sex;
    @Column(name= "maritial_status")
    private String maritalStatus;
    @Column(name= "date_of_birth")
    private Date dob;
    @Column(name= "emailid")
    private String email;
    @Column(name= "house_no")
    private String HouseNo;
    @Column(name= "city")
    private String City;
    @Column(name= "state")
    private String State;
    @Column(name= "country")
    private String Country;
    @Column(name= "pin_code")
    private int Pincode;
    @Column(name= "panno")
    private String PANNo;
    @Column(name= "passport_no")
    private String PassportNo;
    @Column(name= "gap_reason")
    private String GapInformation;
    
    @Column(name="course")
    private String Course;
    @Column(name="program")
    private String Program;
    @Column(name="college")
    private String CollegeNameandAddress;
    @Column(name="university")
    private String UniversityNameandAddress;
    @Column(name="percentage")
    private String Percentage;
    @Column(name="x")
    private String XCourse;
    @Column(name="xprogram")
    private String XProgram;
    @Column(name="school_address")
    private String XCollegeNameandAddress;
    @Column(name="xpercentage")
    private String XPercentage;
  
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name =Name;
	}
		@Column(name = "mobile_number")
	private int MobileNumber;

	public int getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.MobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public String getPANNo() {
		return PANNo;
	}

	public void setPANNo(String pANNo) {
		PANNo = pANNo;
	}

	public String getPassportNo() {
		return PassportNo;
	}

	public void setPassportNo(String passportNo) {
		PassportNo = passportNo;
	}

	public String getGapInformation() {
		return GapInformation;
	}

	public void setGapInformation(String gapInformation) {
		GapInformation = gapInformation;
	}

	public String getXPercentage() {
		return XPercentage;
	}

	public void setXPercentage(String xPercentage) {
		XPercentage = xPercentage;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		Program = program;
	}

	public String getCollegeNameandAddress() {
		return CollegeNameandAddress;
	}

	public void setCollegeNameandAddress(String collegeNameandAddress) {
		CollegeNameandAddress = collegeNameandAddress;
	}

	public String getUniversityNameandAddress() {
		return UniversityNameandAddress;
	}

	public void setUniversityNameandAddress(String universityNameandAddress) {
		UniversityNameandAddress = universityNameandAddress;
	}

	public String getPercentage() {
		return Percentage;
	}

	public void setPercentage(String percentage) {
		Percentage = percentage;
	}

	public String getXCourse() {
		return XCourse;
	}

	public void setXCourse(String xCourse) {
		XCourse = xCourse;
	}

	public String getXProgram() {
		return XProgram;
	}

	public void setXProgram(String xProgram) {
		XProgram = xProgram;
	}

	public String getXCollegeNameandAddress() {
		return XCollegeNameandAddress;
	}

	public void setXCollegeNameandAddress(String xCollegeNameandAddress) {
		XCollegeNameandAddress = xCollegeNameandAddress;
	}

}
