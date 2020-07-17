package com.example.scs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Z_WORLD_COUNT_DETAILS")
public class WorldCountDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "WORLD_ID", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer worldId;

	@Column(name = "TOTAL_CASES")
	public Integer totalCases;

	@Column(name = "ACTIVE_CASES")
	public Integer activeCases;

	@Column(name = "RECOVERED_CASES")
	public Integer recoveredCases;

	@Column(name = "DEATH_CASES")
	public Integer deathCases;

	@Column(name = "CR_DT")
	public String crDate;
	
	@Column(name = "MD_DT")
	public String mdDate;
	
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
