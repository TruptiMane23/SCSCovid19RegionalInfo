package com.example.scs.vo;

public class CovidDashboardVo {

	public Integer countryId;
	public String countryName;
	public Integer stateId;
	public String stateName;
	public Integer cityId;
	public String cityName;
	public Integer areaId;
	public String areaName;
	public String pincode;
	public Integer totalCases;
	public Integer activeCases;
	public Integer recoveredCases;
	public Integer deathCases;
	public Integer closedCases;
	public Integer newDailyActive;
	public Integer newDailyRecovered;
	public Integer newDailyDeaths;
	public String createDate;
	public String modifiedDate;

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

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
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

	public Integer getClosedCases() {
		return closedCases;
	}

	public void setClosedCases(Integer closedCases) {
		this.closedCases = closedCases;
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

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "CovidDashboardVo [countryId=" + countryId + ", countryName=" + countryName + ", stateId=" + stateId + ", stateName=" + stateName + ", cityId=" + cityId
				+ ", cityName=" + cityName + ", areaId=" + areaId + ", areaName=" + areaName + ", pincode=" + pincode + ", totalCases=" + totalCases + ", activeCases="
				+ activeCases + ", recoveredCases=" + recoveredCases + ", deathCases=" + deathCases + ", closedCases=" + closedCases + ", newDailyActive="
				+ newDailyActive + ", newDailyRecovered=" + newDailyRecovered + ", newDailyDeaths=" + newDailyDeaths + ", createDate=" + createDate + ", modifiedDate="
				+ modifiedDate + ", getCountryId()=" + getCountryId() + ", getCountryName()=" + getCountryName() + ", getStateId()=" + getStateId() + ", getStateName()="
				+ getStateName() + ", getCityId()=" + getCityId() + ", getCityName()=" + getCityName() + ", getAreaId()=" + getAreaId() + ", getAreaName()="
				+ getAreaName() + ", getPincode()=" + getPincode() + ", getTotalCases()=" + getTotalCases() + ", getActiveCases()=" + getActiveCases()
				+ ", getRecoveredCases()=" + getRecoveredCases() + ", getDeathCases()=" + getDeathCases() + ", getClosedCases()=" + getClosedCases()
				+ ", getNewDailyActive()=" + getNewDailyActive() + ", getNewDailyRecovered()=" + getNewDailyRecovered() + ", getNewDailyDeaths()=" + getNewDailyDeaths()
				+ ", getCreateDate()=" + getCreateDate() + ", getModifiedDate()=" + getModifiedDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
