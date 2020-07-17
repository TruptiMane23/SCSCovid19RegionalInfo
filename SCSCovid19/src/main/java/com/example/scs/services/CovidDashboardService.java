package com.example.scs.services;

import java.util.List;
import java.util.Map;

public interface CovidDashboardService {

	Map<String, Integer> getCovidDashboardDetails() throws Exception;

	Map<String, Object> getRegionalCovidDetails(String countryName, String stateName, String cityName) throws Exception;

	List<String> getAll() throws Exception;

	String getAlertMessage(String city) throws Exception;

}