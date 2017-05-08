package com.ibm.developerWorks.weatherdata;

import java.util.HashMap;
import java.util.Map;

public class Metadata {
	private String version;
	private String transaction_id;
	private Integer expire_time_gmt;
	private String location_id;
	private String countrycode;
	private Integer latitude;
	private Integer longitude;
	private String language;
	private String units;
	private String status_code;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	*
	* @return
	* The version
	*/
	public String getVersion() {
	return version;
	}

	/**
	*
	* @param version
	* The version
	*/
	public void setVersion(String version) {
	this.version = version;
	}

	/**
	*
	* @return
	* The transactionId
	*/
	public String getTransaction_id() {
	return transaction_id;
	}

	/**
	*
	* @param transactionId
	* The transaction_id
	*/
	public void setTransaction_id(String transactionId) {
	this.transaction_id = transactionId;
	}

	/**
	*
	* @return
	* The expireTimeGmt
	*/
	public Integer getExpire_time_gmt() {
	return expire_time_gmt;
	}

	/**
	*
	* @param expireTimeGmt
	* The expire_time_gmt
	*/
	public void setExpire_time_gmt(Integer expireTimeGmt) {
	this.expire_time_gmt = expireTimeGmt;
	}

	/**
	*
	* @return
	* The location_id
	*/
	public String getLocation_id() {
	return location_id;
	}

	/**
	*
	* @param location_id
	* The location_id
	*/
	public void setLocation_id(String location_id) {
	this.location_id = location_id;
	}

	/**
	*
	* @return
	* The countrycode
	*/
	public String getCountrycode() {
	return countrycode;
	}

	/**
	*
	* @param countrycode
	* The countrycode
	*/
	public void setCountrycode(String countrycode) {
	this.countrycode = countrycode;
	}

	/**
	*
	* @return
	* The latitude
	*/
	public Integer getLatitude() {
	return latitude;
	}

	/**
	*
	* @param latitude
	* The latitude
	*/
	public void setLatitude(Integer latitude) {
	this.latitude = latitude;
	}

	/**
	*
	* @return
	* The longitude
	*/
	public Integer getLongitude() {
	return longitude;
	}

	/**
	*
	* @param longitude
	* The longitude
	*/
	public void setLongitude(Integer longitude) {
	this.longitude = longitude;
	}

	/**
	*
	* @return
	* The language
	*/
	public String getLanguage() {
	return language;
	}

	/**
	*
	* @param language
	* The language
	*/
	public void setLanguage(String language) {
	this.language = language;
	}

	/**
	*
	* @return
	* The units
	*/
	public String getUnits() {
	return units;
	}

	/**
	*
	* @param units
	* The units
	*/
	public void setUnits(String units) {
	this.units = units;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	public String getStatus_code() {
		return status_code;
	}

	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

}
