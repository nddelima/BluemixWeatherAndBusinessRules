package com.ibm.developerWorks.weatherdata.alert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alert {

	private String _class;
	private String key;
	private Integer msg_type_cd;
	private String msg_type;
	private String pil;
	private String phenomena;
	private String significance;
	private String etn;
	private String office_cd;
	private String event_desc;
	private Integer severity_cd;
	private String severity;
	private String area_type;
	private String area_id;
	private String area_name;
	private String cntry_cd;
	private String cntry_name;
	private String headline_text;
	private String detail_key;
	private String source;
	private String issue_dt_tm_local;
	private String issue_dt_tm_tz_abbrv;
	private String identifier;
	private String proc_dt_tm_local;
	private String proc_dt_tm_tz_abbrv;
	private String office_name;
	private String office_st_cd;
	private String office_cntry_cd;
	private Double lat;
	private Double lon;
	private String st_cd;
	private String st_name;
	private List<Category> category_item = new ArrayList<Category>();
	private List<ResponseType> response_type_item = new ArrayList<ResponseType>();
	private Flood flood_item;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 
	 * @param key
	 *            The key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 
	 * @return The msg_type_cd
	 */
	public Integer getMsg_type_cd() {
		return msg_type_cd;
	}

	/**
	 * 
	 * @param msg_type_cd
	 *            The msg_type_cd
	 */
	public void setMsg_type_cd(Integer msg_type_cd) {
		this.msg_type_cd = msg_type_cd;
	}

	/**
	 * 
	 * @return The msg_type
	 */
	public String getMsg_type() {
		return msg_type;
	}

	/**
	 * 
	 * @param msg_type
	 *            The msg_type
	 */
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}

	/**
	 * 
	 * @return The pil
	 */
	public String getPil() {
		return pil;
	}

	/**
	 * 
	 * @param pil
	 *            The pil
	 */
	public void setPil(String pil) {
		this.pil = pil;
	}

	/**
	 * 
	 * @return The phenomena
	 */
	public String getPhenomena() {
		return phenomena;
	}

	/**
	 * 
	 * @param phenomena
	 *            The phenomena
	 */
	public void setPhenomena(String phenomena) {
		this.phenomena = phenomena;
	}

	/**
	 * 
	 * @return The significance
	 */
	public String getSignificance() {
		return significance;
	}

	/**
	 * 
	 * @param significance
	 *            The significance
	 */
	public void setSignificance(String significance) {
		this.significance = significance;
	}

	/**
	 * 
	 * @return The etn
	 */
	public String getEtn() {
		return etn;
	}

	/**
	 * 
	 * @param etn
	 *            The etn
	 */
	public void setEtn(String etn) {
		this.etn = etn;
	}

	/**
	 * 
	 * @return The office_cd
	 */
	public String getOffice_cd() {
		return office_cd;
	}

	/**
	 * 
	 * @param office_cd
	 *            The office_cd
	 */
	public void setOffice_cd(String office_cd) {
		this.office_cd = office_cd;
	}

	/**
	 * 
	 * @return The event_desc
	 */
	public String getEvent_desc() {
		return event_desc;
	}

	/**
	 * 
	 * @param event_desc
	 *            The event_desc
	 */
	public void setEvent_desc(String event_desc) {
		this.event_desc = event_desc;
	}

	/**
	 * 
	 * @return The severity_cd
	 */
	public Integer getSeverity_cd() {
		return severity_cd;
	}

	/**
	 * 
	 * @param severity_cd
	 *            The severity_cd
	 */
	public void setSeverity_cd(Integer severity_cd) {
		this.severity_cd = severity_cd;
	}

	/**
	 * 
	 * @return The severity
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * 
	 * @param severity
	 *            The severity
	 */
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	/**
	 * 
	 * @return The area_type
	 */
	public String getArea_type() {
		return area_type;
	}

	/**
	 * 
	 * @param area_type
	 *            The area_type
	 */
	public void setArea_type(String area_type) {
		this.area_type = area_type;
	}

	/**
	 * 
	 * @return The area_id
	 */
	public String getArea_id() {
		return area_id;
	}

	/**
	 * 
	 * @param area_id
	 *            The area_id
	 */
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}

	/**
	 * 
	 * @return The area_name
	 */
	public String getArea_name() {
		return area_name;
	}

	/**
	 * 
	 * @param area_name
	 *            The area_name
	 */
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	/**
	 * 
	 * @return The cntry_cd
	 */
	public String getCntry_cd() {
		return cntry_cd;
	}

	/**
	 * 
	 * @param cntry_cd
	 *            The cntry_cd
	 */
	public void setCntry_cd(String cntry_cd) {
		this.cntry_cd = cntry_cd;
	}

	/**
	 * 
	 * @return The cntry_name
	 */
	public String getCntry_name() {
		return cntry_name;
	}

	/**
	 * 
	 * @param cntry_name
	 *            The cntry_name
	 */
	public void setCntry_name(String cntry_name) {
		this.cntry_name = cntry_name;
	}

	/**
	 * 
	 * @return The headline_text
	 */
	public String getHeadline_text() {
		return headline_text;
	}

	/**
	 * 
	 * @param headline_text
	 *            The headline_text
	 */
	public void setHeadline_text(String headline_text) {
		this.headline_text = headline_text;
	}

	/**
	 * 
	 * @return The detail_key
	 */
	public String getDetail_key() {
		return detail_key;
	}

	/**
	 * 
	 * @param detail_key
	 *            The detail_key
	 */
	public void setDetail_key(String detail_key) {
		this.detail_key = detail_key;
	}

	/**
	 * 
	 * @return The source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * 
	 * @param source
	 *            The source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * 
	 * @return The issue_dt_tm_local
	 */
	public String getIssue_dt_tm_local() {
		return issue_dt_tm_local;
	}

	/**
	 * 
	 * @param issue_dt_tm_local
	 *            The issue_dt_tm_local
	 */
	public void setIssue_dt_tm_local(String issue_dt_tm_local) {
		this.issue_dt_tm_local = issue_dt_tm_local;
	}

	/**
	 * 
	 * @return The issue_dt_tm_tz_abbrv
	 */
	public String getIssue_dt_tm_tz_abbrv() {
		return issue_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @param issue_dt_tm_tz_abbrv
	 *            The issue_dt_tm_tz_abbrv
	 */
	public void setIssue_dt_tm_tz_abbrv(String issue_dt_tm_tz_abbrv) {
		this.issue_dt_tm_tz_abbrv = issue_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @return The identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * 
	 * @param identifier
	 *            The identifier
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * 
	 * @return The proc_dt_tm_local
	 */
	public String getProc_dt_tm_local() {
		return proc_dt_tm_local;
	}

	/**
	 * 
	 * @param proc_dt_tm_local
	 *            The proc_dt_tm_local
	 */
	public void setProc_dt_tm_local(String proc_dt_tm_local) {
		this.proc_dt_tm_local = proc_dt_tm_local;
	}

	/**
	 * 
	 * @return The proc_dt_tm_tz_abbrv
	 */
	public String getProc_dt_tm_tz_abbrv() {
		return proc_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @param proc_dt_tm_tz_abbrv
	 *            The proc_dt_tm_tz_abbrv
	 */
	public void setProc_dt_tm_tz_abbrv(String proc_dt_tm_tz_abbrv) {
		this.proc_dt_tm_tz_abbrv = proc_dt_tm_tz_abbrv;
	}

	/**
	 * 
	 * @return The office_name
	 */
	public String getOffice_name() {
		return office_name;
	}

	/**
	 * 
	 * @param office_name
	 *            The office_name
	 */
	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}

	/**
	 * 
	 * @return The office_st_cd
	 */
	public String getOffice_st_cd() {
		return office_st_cd;
	}

	/**
	 * 
	 * @param office_st_cd
	 *            The office_st_cd
	 */
	public void setOffice_st_cd(String office_st_cd) {
		this.office_st_cd = office_st_cd;
	}

	/**
	 * 
	 * @return The office_cntry_cd
	 */
	public String getOffice_cntry_cd() {
		return office_cntry_cd;
	}

	/**
	 * 
	 * @param office_cntry_cd
	 *            The office_cntry_cd
	 */
	public void setOffice_cntry_cd(String office_cntry_cd) {
		this.office_cntry_cd = office_cntry_cd;
	}

	/**
	 * 
	 * @return The lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * 
	 * @param lat
	 *            The lat
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}

	/**
	 * 
	 * @return The lon
	 */
	public Double getLon() {
		return lon;
	}

	/**
	 * 
	 * @param lon
	 *            The lon
	 */
	public void setLon(Double lon) {
		this.lon = lon;
	}

	/**
	 * 
	 * @return The st_cd
	 */
	public String getSt_cd() {
		return st_cd;
	}

	/**
	 * 
	 * @param st_cd
	 *            The st_cd
	 */
	public void setSt_cd(String st_cd) {
		this.st_cd = st_cd;
	}

	/**
	 * 
	 * @return The st_name
	 */
	public String getSt_name() {
		return st_name;
	}

	/**
	 * 
	 * @param st_name
	 *            The st_name
	 */
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	/**
	 * 
	 * @return The category_item
	 */
	public List<Category> getcategory_item() {
		return category_item;
	}

	/**
	 * 
	 * @param category_item
	 *            The category_item
	 */
	public void setcategory_item(List<Category> category_item) {
		this.category_item = category_item;
	}

	/**
	 * 
	 * @return The response_type_item
	 */
	public List<ResponseType> getResponse_type_item() {
		return response_type_item;
	}

	/**
	 * 
	 * @param response_type_item
	 *            The response_types
	 */
	public void setResponse_type_item(List<ResponseType> response_type_item) {
		this.response_type_item = response_type_item;
	}

	/**
	 * 
	 * @return The flood_item
	 */
	public Flood getFlood_item() {
		return flood_item;
	}

	/**
	 * 
	 * @param flood_item
	 *            The flood_item
	 */
	public void setFlood_item(Flood flood_item) {
		this.flood_item = flood_item;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
