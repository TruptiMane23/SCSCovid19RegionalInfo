package com.example.scs.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scs.model.WorldCountDetails;

@Repository
public interface WorldDetailsDao extends JpaRepository<WorldCountDetails, Integer> {

	@Modifying
	@Transactional
	@Query("update WorldCountDetails covid set covid.totalCases =:totalCases, covid.recoveredCases = :recoveredCases, covid.deathCases = :deathCases, covid.activeCases = :activeCases, "
			+ "covid.mdDate = :mdDate where covid.worldId = :Id")
	int updateWorldCount(@Param("Id") int Id, @Param("totalCases") int totalCases, @Param("recoveredCases") int recoveredCases, @Param("deathCases") int deathCases, 
			@Param("activeCases") int activeCases, @Param("mdDate") String mdDate);
}
