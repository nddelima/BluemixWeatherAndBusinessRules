package com.ibm.developerWorks.weatherdata.alert;

import java.util.HashMap;
import java.util.Map;

public class ResponseType {

	private String response_type;
	private Integer response_type_cd;
	private String urgency;
	private Integer urgency_cd;
	private String certainty;
	private Integer certainty_cd;
	private String effective_dt_tm_local;
	private String expire_dt_tm_local;
	private Integer expire_time_gmt;
	private String effective_dt_tm_tz_abbrv;
	private String expire_dt_tm_tz_abbrv;
	private String onset_dt_tm_local;
	private String onset_dt_tm_tz_abbrv;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The response_type
	 */
	public String getResponse_type() {
		return response_type;
	}

	/**
	 * 
	 * @param response_type
	 *            The response_type
	 */
	public void setResponse_type(String response_type) {
		this.response_type = response_type;
	}

	/**
	 * 
	 * @return The response_type_cd
	 */
	public Integer getResponse_type_cd() {
		return response_type_cd;
	}

	/**
	 * 
	 * @param response_type_cd
	 *            The response_type_cd
	 */
	public void setResponse_type_cd(Integer response_type_cd) {
		this.response_type_cd = response_type_cd;
	}

	/**
	 * 
	 * @return The urgency
	 */
	public String getUrgency() {
		return urgency;
	}

	/**
	 * 
	 * @param urgency
	 *            The urgency
	 */
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	/**
	 * 
	 * @return The urgency_cd
	 */
	public Integer getUrgency_cd() {
		return urgency_cd;
	}

	/**
	 * 
	 * @param urgency_cd
	 *            The urgency_cd
	 */
	public void setUrgency_cd(Integer urgency_cd) {
		this.urgency_cd = urgency_cd;
	}

	/**
	 * 
	 * @return The certainty
	 */
	public String getCertainty() {
		return certainty;
	}

	/**
	 * 
	 * @param certainty
	 *            The certainty
	 */
	public void setCertainty(String certainty) {
		this.certainty = certainty;
	}

	/**
	 * 
	 * @return The certainty_cd
	 */
	public Integer getCertainty_cd() {
		return certainty_cd;
	}

	/**
	 * 
	 * @param certainty_cd
	 *            The certainty_cd
	 */
	public void setCertainty_cd(Integer certainty_cd) {
		this.certainty_cd = certainty_cd;
	}

	/**
	 * 
	 * @return The effective_dt_tm_local
	 */
	public String getEffective_dt_tm_local() {
		return effective_dt_tm_local;
	}

	/**
	 * 
	 * @param effective_dt_tm_local
	 *            The effective_dt_tm_local
	 */
	public void setEffective_dt_tm_local(String effective_dt_tm_local) {
		this.effective_dt_tm_local = effective_dt_tm_local;
	}

	/**
	 * 
	 * @return The expire_dt_tm_local
	 */
	public String getExpire_dt_tm_local() {
		return expire_dt_tm_local;
	}

	/**
	 * 
	 * @param expire_dt_tm_local
	 *            The expire_dt_tm_local
	 */
	public void setExpire_dt_tm_local(String expire_dt_tm_local) {
		this.expire_dt_tm_local = expire_dt_tm_local;
	}

	/**
	 * 
	 * @return The expire_time_gmt
	 */
	public Integer getExpire_time_gmt() {
		return expire_time_gmt;
	}

	/**
	 * 
	 * @param expire_time_gmt
	 *            The expire_time_gmt
	 */
	public void setExpire_time_gmt(Integer expire_time_gmt) {
		this.expire_time_gmt = expire_time_gmt;
	}

	/**
	 * 
	 * @return The effective_dt_tm_tz_abbrv
	 */
	public String getEffective_dt_tm_tz_abbrv() {
		return effective_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @param effective_dt_tm_tz_abbrv
	 *            The effective_dt_tm_tz_abbrv
	 */
	public void setEffective_dt_tm_tz_abbrv(String effective_dt_tm_tz_abbrv) {
		this.effective_dt_tm_tz_abbrv = effective_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @return The expire_dt_tm_tz_abbrv
	 */
	public String getExpire_dt_tm_tz_abbrv() {
		return expire_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @param expire_dt_tm_tz_abbrv
	 *            The expire_dt_tm_tz_abbrv
	 */
	public void setExpire_dt_tm_tz_abbrv(String expire_dt_tm_tz_abbrv) {
		this.expire_dt_tm_tz_abbrv = expire_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @return The onset_dt_tm_local
	 */
	public String getOnset_dt_tm_local() {
		return onset_dt_tm_local;
	}

	/**
	 * 
	 * @param onset_dt_tm_local
	 *            The onset_dt_tm_local
	 */
	public void setOnset_dt_tm_local(String onset_dt_tm_local) {
		this.onset_dt_tm_local = onset_dt_tm_local;
	}

	/**
	 * 
	 * @return The onset_dt_tm_tz_abbrv
	 */
	public String getOnset_dt_tm_tz_abbrv() {
		return onset_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @param onset_dt_tm_tz_abbrv
	 *            The onset_dt_tm_tz_abbrv
	 */
	public void setOnset_dt_tm_tz_abbrv(String onset_dt_tm_tz_abbrv) {
		this.onset_dt_tm_tz_abbrv = onset_dt_tm_tz_abbrv;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
