package com.ibm.developerWorks.weatherdata.almanac;

import java.util.HashMap;
import java.util.Map;

public class Almanac {

	private String interval;
	private String _class;
	private String station_id;
	private String station_name;
	private String station;
	private String almanac_dt;
	private Integer avg_hi;
	private Integer avg_lo;
	private Integer record_hi;
	private Integer record_hi_yr;
	private Integer record_lo;
	private Integer record_lo_yr;
	private Integer mean_temp;
	private Integer avg_precip;
	private Integer avg_snow;
	private Integer record_period;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The interval
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * 
	 * @param interval
	 *            The interval
	 */
	public void setInterval(String interval) {
		this.interval = interval;
	}

	/**
	 * 
	 * @return The _class
	 */
	public String getClass_() {
		return _class;
	}

	/**
	 * 
	 * @param _class
	 *            The class
	 */
	public void setClass_(String _class) {
		this._class = _class;
	}

	/**
	 * 
	 * @return The station_id
	 */
	public String getStation_id() {
		return station_id;
	}

	/**
	 * 
	 * @param station_id
	 *            The station_id
	 */
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}

	/**
	 * 
	 * @return The station_name
	 */
	public String getStation_name() {
		return station_name;
	}

	/**
	 * 
	 * @param station_name
	 *            The station_name
	 */
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}

	/**
	 * 
	 * @return The station
	 */
	public String getStation() {
		return station;
	}

	/**
	 * 
	 * @param station
	 *            The station
	 */
	public void setStation(String station) {
		this.station = station;
	}

	/**
	 * 
	 * @return The almanac_dt
	 */
	public String getAlmanac_dt() {
		return almanac_dt;
	}

	/**
	 * 
	 * @param almanac_dt
	 *            The almanac_dt
	 */
	public void setAlmanac_dt(String almanac_dt) {
		this.almanac_dt = almanac_dt;
	}

	/**
	 * 
	 * @return The avg_hi
	 */
	public Integer getAvg_hi() {
		return avg_hi;
	}

	/**
	 * 
	 * @param avg_hi
	 *            The avg_hi
	 */
	public void setAvg_hi(Integer avg_hi) {
		this.avg_hi = avg_hi;
	}

	/**
	 * 
	 * @return The avg_lo
	 */
	public Integer getAvg_lo() {
		return avg_lo;
	}

	/**
	 * 
	 * @param avg_lo
	 *            The avg_lo
	 */
	public void setAvg_lo(Integer avg_lo) {
		this.avg_lo = avg_lo;
	}

	/**
	 * 
	 * @return The record_hi
	 */
	public Integer getRecord_hi() {
		return record_hi;
	}

	/**
	 * 
	 * @param record_hi
	 *            The record_hi
	 */
	public void setRecord_hi(Integer record_hi) {
		this.record_hi = record_hi;
	}

	/**
	 * 
	 * @return The record_hi_yr
	 */
	public Integer getRecord_hi_yr() {
		return record_hi_yr;
	}

	/**
	 * 
	 * @param record_hi_yr
	 *            The record_hi_yr
	 */
	public void setRecord_hi_yr(Integer record_hi_yr) {
		this.record_hi_yr = record_hi_yr;
	}

	/**
	 * 
	 * @return The record_lo
	 */
	public Integer getRecord_lo() {
		return record_lo;
	}

	/**
	 * 
	 * @param record_lo
	 *            The record_lo
	 */
	public void setRecord_lo(Integer record_lo) {
		this.record_lo = record_lo;
	}

	/**
	 * 
	 * @return The record_lo_yr
	 */
	public Integer getRecord_lo_yr() {
		return record_lo_yr;
	}

	/**
	 * 
	 * @param record_lo_yr
	 *            The record_lo_yr
	 */
	public void setRecord_lo_yr(Integer record_lo_yr) {
		this.record_lo_yr = record_lo_yr;
	}

	/**
	 * 
	 * @return The mean_temp
	 */
	public Integer getMean_temp() {
		return mean_temp;
	}

	/**
	 * 
	 * @param mean_temp
	 *            The mean_temp
	 */
	public void setMean_temp(Integer mean_temp) {
		this.mean_temp = mean_temp;
	}

	/**
	 * 
	 * @return The avg_precip
	 */
	public Integer getAvg_precip() {
		return avg_precip;
	}

	/**
	 * 
	 * @param avg_precip
	 *            The avg_precip
	 */
	public void setAvg_precip(Integer avg_precip) {
		this.avg_precip = avg_precip;
	}

	/**
	 * 
	 * @return The avg_snow
	 */
	public Integer getAvg_snow() {
		return avg_snow;
	}

	/**
	 * 
	 * @param avg_snow
	 *            The avg_snow
	 */
	public void setAvg_snow(Integer avg_snow) {
		this.avg_snow = avg_snow;
	}

	/**
	 * 
	 * @return The record_period
	 */
	public Integer getRecord_period() {
		return record_period;
	}

	/**
	 * 
	 * @param record_period
	 *            The record_period
	 */
	public void setRecord_period(Integer record_period) {
		this.record_period = record_period;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
