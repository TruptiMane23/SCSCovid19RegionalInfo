package com.example.scs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Z_USER_REGISTRATION_DETAILS")
public class UserRegistration implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_REGISTRATION_ID", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer userRegistrationId;

	@Column(name = "USER_ID")
	public Integer userId;
	
	@Column(name = "FIRST_NAME")
	public String firstName;

	@Column(name = "LAST_NAME")
	public String lastName;

	@Column(name = "EMAIL_ID")
	public String emailId;

	@Column(name = "MOBILE_NO")
	public String mobileNo;

	@Column(name = "USERNAME")
	public String username;

	@Column(name = "PASSWORD")
	public String password;
	
	@Column(name = "COUNTRY")
	public String country;
	
	@Column(name = "STATE")
	public String state;
	
	@Column(name = "CITY")
	public String city;
	
//	@Column(name = "AREA")
//	public String area;
//	
//	@Column(name = "PINCODE")
//	public String pincode;
//	
//	@Column(name = "ADDRESS")
//	public String address;
	
	public Integer getUserRegistrationId() {
		return userRegistrationId;
	}

	public void setUserRegistrationId(Integer userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

//	public String getArea() {
//		return area;
//	}
//
//	public void setArea(String area) {
//		this.area = area;
//	}
//
//	public String getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}	
}
