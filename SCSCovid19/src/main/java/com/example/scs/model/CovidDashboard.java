package com.example.scs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Z_COVID_DASHBOARD_DETAILS")
public class CovidDashboard implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COVID_DASHBOARD_ID", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer covidDashboardId;

	@Column(name = "COUNTRY_ID")
	public Integer countryId;

	@Column(name = "COUNTRY_NAME")
	public String countryName;

	@Column(name = "STATE_ID")
	public Integer stateId;

	@Column(name = "STATE_NAME")
	public String stateName;

	@Column(name = "CITY_ID")
	public Integer cityId;

	@Column(name = "CITY_NAME")
	public String cityName;

	@Column(name = "TOTAL_CASES")
	public Integer totalCases;

	@Column(name = "ACTIVE_CASES")
	public Integer activeCases;

	@Column(name = "RECOVERED_CASES")
	public Integer recoveredCases;

	@Column(name = "DEATH_CASES")
	public Integer deathCases;

	@Column(name = "NEW_DAILY_ACTIVE")
	public Integer newDailyActive;

	@Column(name = "NEW_DAILY_RECOVERED")
	public Integer newDailyRecovered;

	@Column(name = "NEW_DAILY_DEATHS")
	public Integer newDailyDeaths;

	@Column(name = "ZONE")
	public String zone;

	@Column(name = "CR_DT")
	public String crDate;
	
	@Column(name = "MD_DT")
	public String mdDate;
	
	public Integer getCovidDashboardId() {
		return covidDashboardId;
	}

	public void setCovidDashboardId(Integer covidDashboardId) {
		this.covidDashboardId = covidDashboardId;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
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

	public Integer getRecoveredCases() {
		return recoveredCases;
	}

	public void setRecoveredCases(Integer recoveredCases) {
		this.recoveredCases = recoveredCases;
	}

	public Integer getDeathCases() {
		return deathCases;
	}

	public void setDeathCases(Integer deathCases) {
		this.deathCases = deathCases;
	}

	public Integer getNewDailyActive() {
		return newDailyActive;
	}

	public void setNewDailyActive(Integer newDailyActive) {
		this.newDailyActive = newDailyActive;
	}

	public Integer getNewDailyRecovered() {
		return newDailyRecovered;
	}

	public void setNewDailyRecovered(Integer newDailyRecovered) {
		this.newDailyRecovered = newDailyRecovered;
	}

	public Integer getNewDailyDeaths() {
		return newDailyDeaths;
	}

	public void setNewDailyDeaths(Integer newDailyDeaths) {
		this.newDailyDeaths = newDailyDeaths;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getCrDate() {
		return crDate;
	}

	public void setCrDate(String crDate) {
		this.crDate = crDate;
	}

	public String getMdDate() {
		return mdDate;
	}

	public void setMdDate(String mdDate) {
		this.mdDate = mdDate;
	}

}
