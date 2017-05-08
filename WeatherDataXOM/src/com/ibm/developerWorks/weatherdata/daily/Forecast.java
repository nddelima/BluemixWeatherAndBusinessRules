package com.ibm.developerWorks.weatherdata.daily;

import java.util.HashMap;
import java.util.Map;

public class Forecast {
	private String _class;
	private Integer expire_time_gmt;
	private Integer fcst_valid;
	private String fcst_valid_local;
	private Integer num;
	private Integer max_temp;
	private Integer min_temp;
	private String blurb;
	private String blurb_author;
	private String dow;
	private String lunar_phase_code;
	private String lunar_phase;
	private Integer lunar_phase_day;
	private String sunrise;
	private String sunset;
	private String qualifier_code;
	private String qualifier;
	private String narrative;
	private Integer qpf;
	private Integer torcon;
	private Integer stormcon;
	private String moonrise;
	private String moonset;
	private Integer snow_qpf;
	private String snow_range;
	private String snow_phrase;
	private String snow_code;
	private Daily day;
	private Daily night;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	*
	* @return
	* The _class
	*/
	public String getClass_() {
	return _class;
	}

	/**
	*
	* @param _class
	* The class
	*/
	public void setClass_(String _class) {
	this._class = _class;
	}

	/**
	*
	* @return
	* The expire_time_gmt
	*/
	public Integer getExpire_time_gmt() {
	return expire_time_gmt;
	}

	/**
	*
	* @param expire_time_gmt
	* The expire_time_gmt
	*/
	public void setExpire_time_gmt(Integer expire_time_gmt) {
	this.expire_time_gmt = expire_time_gmt;
	}

	/**
	*
	* @return
	* The fcst_valid
	*/
	public Integer getfcst_valid() {
	return fcst_valid;
	}

	/**
	*
	* @param fcst_valid
	* The fcst_valid
	*/
	public void setfcst_valid(Integer fcst_valid) {
	this.fcst_valid = fcst_valid;
	}

	/**
	*
	* @return
	* The fcst_valid_local
	*/
	public String getfcst_valid_local() {
	return fcst_valid_local;
	}

	/**
	*
	* @param fcst_valid_local
	* The fcst_valid_local
	*/
	public void setfcst_valid_local(String fcst_valid_local) {
	this.fcst_valid_local = fcst_valid_local;
	}

	/**
	*
	* @return
	* The num
	*/
	public Integer getNum() {
	return num;
	}

	/**
	*
	* @param num
	* The num
	*/
	public void setNum(Integer num) {
	this.num = num;
	}

	/**
	*
	* @return
	* The max_temp
	*/
	public Integer getMax_temp() {
	return max_temp;
	}

	/**
	*
	* @param max_temp
	* The max_temp
	*/
	public void setMax_temp(Integer max_temp) {
	this.max_temp = max_temp;
	}

	/**
	*
	* @return
	* The min_temp
	*/
	public Integer getMin_temp() {
	return min_temp;
	}

	/**
	*
	* @param min_temp
	* The min_temp
	*/
	public void setMin_temp(Integer min_temp) {
	this.min_temp = min_temp;
	}

	/**
	*
	* @return
	* The blurb
	*/
	public String getBlurb() {
	return blurb;
	}

	/**
	*
	* @param blurb
	* The blurb
	*/
	public void setBlurb(String blurb) {
	this.blurb = blurb;
	}

	/**
	*
	* @return
	* The blurb_author
	*/
	public String getBlurb_author() {
	return blurb_author;
	}

	/**
	*
	* @param blurb_author
	* The blurb_author
	*/
	public void setBlurb_author(String blurb_author) {
	this.blurb_author = blurb_author;
	}

	/**
	*
	* @return
	* The dow
	*/
	public String getDow() {
	return dow;
	}

	/**
	*
	* @param dow
	* The dow
	*/
	public void setDow(String dow) {
	this.dow = dow;
	}

	/**
	*
	* @return
	* The lunar_phase_code
	*/
	public String getLunar_phase_code() {
	return lunar_phase_code;
	}

	/**
	*
	* @param lunar_phase_code
	* The lunar_phase_code
	*/
	public void setLunar_phase_code(String lunar_phase_code) {
	this.lunar_phase_code = lunar_phase_code;
	}

	/**
	*
	* @return
	* The lunar_phase
	*/
	public String getLunar_phase() {
	return lunar_phase;
	}

	/**
	*
	* @param lunar_phase
	* The lunar_phase
	*/
	public void setLunar_phase(String lunar_phase) {
	this.lunar_phase = lunar_phase;
	}

	/**
	*
	* @return
	* The lunar_phase_day
	*/
	public Integer getLunar_phase_day() {
	return lunar_phase_day;
	}

	/**
	*
	* @param lunar_phase_day
	* The lunar_phase_day
	*/
	public void setLunar_phase_day(Integer lunar_phase_day) {
	this.lunar_phase_day = lunar_phase_day;
	}

	/**
	*
	* @return
	* The sunrise
	*/
	public String getSunrise() {
	return sunrise;
	}

	/**
	*
	* @param sunrise
	* The sunrise
	*/
	public void setSunrise(String sunrise) {
	this.sunrise = sunrise;
	}

	/**
	*
	* @return
	* The sunset
	*/
	public String getSunset() {
	return sunset;
	}

	/**
	*
	* @param sunset
	* The sunset
	*/
	public void setSunset(String sunset) {
	this.sunset = sunset;
	}

	/**
	*
	* @return
	* The qualifier_code
	*/
	public String getQualifier_code() {
	return qualifier_code;
	}

	/**
	*
	* @param qualifier_code
	* The qualifier_code
	*/
	public void setQualifier_code(String qualifier_code) {
	this.qualifier_code = qualifier_code;
	}

	/**
	*
	* @return
	* The qualifier
	*/
	public String getQualifier() {
	return qualifier;
	}

	/**
	*
	* @param qualifier
	* The qualifier
	*/
	public void setQualifier(String qualifier) {
	this.qualifier = qualifier;
	}

	/**
	*
	* @return
	* The narrative
	*/
	public String getNarrative() {
	return narrative;
	}

	/**
	*
	* @param narrative
	* The narrative
	*/
	public void setNarrative(String narrative) {
	this.narrative = narrative;
	}

	/**
	*
	* @return
	* The qpf
	*/
	public Integer getQpf() {
	return qpf;
	}

	/**
	*
	* @param qpf
	* The qpf
	*/
	public void setQpf(Integer qpf) {
	this.qpf = qpf;
	}

	/**
	*
	* @return
	* The torcon
	*/
	public Integer getTorcon() {
	return torcon;
	}

	/**
	*
	* @param torcon
	* The torcon
	*/
	public void setTorcon(Integer torcon) {
	this.torcon = torcon;
	}

	/**
	*
	* @return
	* The stormcon
	*/
	public Integer getStormcon() {
	return stormcon;
	}

	/**
	*
	* @param stormcon
	* The stormcon
	*/
	public void setStormcon(Integer stormcon) {
	this.stormcon = stormcon;
	}

	/**
	*
	* @return
	* The moonrise
	*/
	public String getMoonrise() {
	return moonrise;
	}

	/**
	*
	* @param moonrise
	* The moonrise
	*/
	public void setMoonrise(String moonrise) {
	this.moonrise = moonrise;
	}

	/**
	*
	* @return
	* The moonset
	*/
	public String getMoonset() {
	return moonset;
	}

	/**
	*
	* @param moonset
	* The moonset
	*/
	public void setMoonset(String moonset) {
	this.moonset = moonset;
	}

	/**
	*
	* @return
	* The snow_qpf
	*/
	public Integer getSnow_qpf() {
	return snow_qpf;
	}

	/**
	*
	* @param snow_qpf
	* The snow_qpf
	*/
	public void setSnow_qpf(Integer snow_qpf) {
	this.snow_qpf = snow_qpf;
	}

	/**
	*
	* @return
	* The snow_range
	*/
	public String getSnow_range() {
	return snow_range;
	}

	/**
	*
	* @param snow_range
	* The snow_range
	*/
	public void setSnow_range(String snow_range) {
	this.snow_range = snow_range;
	}

	/**
	*
	* @return
	* The snow_phrase
	*/
	public String getSnow_phrase() {
	return snow_phrase;
	}

	/**
	*
	* @param snow_phrase
	* The snow_phrase
	*/
	public void setSnow_phrase(String snow_phrase) {
	this.snow_phrase = snow_phrase;
	}

	/**
	*
	* @return
	* The snow_code
	*/
	public String getSnow_code() {
	return snow_code;
	}

	/**
	*
	* @param snow_code
	* The snow_code
	*/
	public void setSnow_code(String snow_code) {
	this.snow_code = snow_code;
	}

	/**
	*
	* @return
	* The day
	*/
	public Daily getDay() {
	return day;
	}

	/**
	*
	* @param day
	* The day
	*/
	public void setDay(Daily day) {
	this.day = day;
	}

	/**
	*
	* @return
	* The night
	*/
	public Daily getNight() {
	return night;
	}

	/**
	*
	* @param night
	* The night
	*/
	public void setNight(Daily night) {
	this.night = night;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
}
