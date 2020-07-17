package com.example.scs.util;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CovidSession {

	public Integer userId;
	public String password;
	public String firstName;
	public String covidCountryDropdown;
	public Integer totalCases;
	public Integer activeCases;
	public Integer recovered;
	public Integer death;
	public List<String> covidDashboardData;
	public String alertMsg;
	public String emailId;
	public String mobileNo;
	public String modifiedDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCovidCountryDropdown() {
		return covidCountryDropdown;
	}

	public void setCovidCountryDropdown(String covidCountryDropdown) {
		this.covidCountryDropdown = covidCountryDropdown;
	}

	public Integer getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(Integer totalCases) {
		this.totalCases = totalCases;
	}

	public Integer getActiveCases() {
		return activeCases;
	}

	public void setActiveCases(Integer activeCases) {
		this.activeCases = activeCases;
	}

	public Integer getRecovered() {
		return recovered;
	}

	public void setRecovered(Integer recovered) {
		this.recovered = recovered;
	}

	public Integer getDeath() {
		return death;
	}

	public void setDeath(Integer death) {
		this.death = death;
	}

	public List<String> getCovidDashboardData() {
		return covidDashboardData;
	}

	public void setCovidDashboardData(List<String> covidDashboardData) {
		this.covidDashboardData = covidDashboardData;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAlertMsg() {
		return alertMsg;
	}

	public void setAlertMsg(String alertMsg) {
		this.alertMsg = alertMsg;
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

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
