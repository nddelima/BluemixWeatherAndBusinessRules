package com.ibm.developerWorks.weatherdata.current;

import java.util.HashMap;
import java.util.Map;

public class Observation {

	private String key;
	private String _class;
	private Integer expire_time_gmt;
	private String obs_id;
	private String obs_name;
	private Integer valid_time_gmt;
	private Integer wx_icon;
	private Integer icon_extd;
	private Integer temp;
	private String wx_phrase;
	private String pressure_desc;
	private Integer pressure_tend;
	private String wdir_cardinal;
	private String day_ind;
	private Integer max_temp;
	private Integer min_temp;
	private Integer dewPt;
	private Integer rh;
	private Integer feels_like;
	private Integer heat_index;
	private Integer wc;
	private String qualifier;
	private String qualifier_svrty;
	private String blunt_phrase;
	private String terse_phrase;
	private Integer pressure;
	private String clds;
	private Integer vis;
	private Integer wspd;
	private Integer gust;
	private Integer wdir;
	private Integer precip_total;
	private Integer precip_hrly;
	private Integer snow_hrly;
	private Integer uv_index;
	private String uv_desc;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The obs_id
	 */
	public String getObs_id() {
		return obs_id;
	}

	/**
	 * 
	 * @param obs_id
	 *            The obs_id
	 */
	public void setObs_id(String obs_id) {
		this.obs_id = obs_id;
	}

	/**
	 * 
	 * @return The obs_name
	 */
	public String getObs_name() {
		return obs_name;
	}

	/**
	 * 
	 * @param obs_name
	 *            The obs_name
	 */
	public void setObs_name(String obs_name) {
		this.obs_name = obs_name;
	}

	/**
	 * 
	 * @return The valid_time_gmt
	 */
	public Integer getValid_time_gmt() {
		return valid_time_gmt;
	}

	/**
	 * 
	 * @param valid_time_gmt
	 *            The valid_time_gmt
	 */
	public void setValid_time_gmt(Integer valid_time_gmt) {
		this.valid_time_gmt = valid_time_gmt;
	}

	/**
	 * 
	 * @return The wx_icon
	 */
	public Integer getWx_icon() {
		return wx_icon;
	}

	/**
	 * 
	 * @param wx_icon
	 *            The wx_icon
	 */
	public void setWx_icon(Integer wx_icon) {
		this.wx_icon = wx_icon;
	}

	/**
	 * 
	 * @return The icon_extd
	 */
	public Integer getIcon_extd() {
		return icon_extd;
	}

	/**
	 * 
	 * @param icon_extd
	 *            The icon_extd
	 */
	public void setIcon_extd(Integer icon_extd) {
		this.icon_extd = icon_extd;
	}

	/**
	 * 
	 * @return The temp
	 */
	public Integer getTemp() {
		return temp;
	}

	/**
	 * 
	 * @param temp
	 *            The temp
	 */
	public void setTemp(Integer temp) {
		this.temp = temp;
	}

	/**
	 * 
	 * @return The wx_phrase
	 */
	public String getWx_phrase() {
		return wx_phrase;
	}

	/**
	 * 
	 * @param wx_phrase
	 *            The wx_phrase
	 */
	public void setWx_phrase(String wx_phrase) {
		this.wx_phrase = wx_phrase;
	}

	/**
	 * 
	 * @return The pressure_desc
	 */
	public String getPressure_desc() {
		return pressure_desc;
	}

	/**
	 * 
	 * @param pressure_desc
	 *            The pressure_desc
	 */
	public void setPressure_desc(String pressure_desc) {
		this.pressure_desc = pressure_desc;
	}

	/**
	 * 
	 * @return The pressure_tend
	 */
	public Integer getPressure_tend() {
		return pressure_tend;
	}

	/**
	 * 
	 * @param pressure_tend
	 *            The pressure_tend
	 */
	public void setPressure_tend(Integer pressure_tend) {
		this.pressure_tend = pressure_tend;
	}

	/**
	 * 
	 * @return The wdir_cardinal
	 */
	public String getWdir_cardinal() {
		return wdir_cardinal;
	}

	/**
	 * 
	 * @param wdir_cardinal
	 *            The wdir_cardinal
	 */
	public void setWdir_cardinal(String wdir_cardinal) {
		this.wdir_cardinal = wdir_cardinal;
	}

	/**
	 * 
	 * @return The day_ind
	 */
	public String getDay_ind() {
		return day_ind;
	}

	/**
	 * 
	 * @param day_ind
	 *            The day_ind
	 */
	public void setDay_ind(String day_ind) {
		this.day_ind = day_ind;
	}

	/**
	 * 
	 * @return The max_temp
	 */
	public Integer getMax_temp() {
		return max_temp;
	}

	/**
	 * 
	 * @param max_temp
	 *            The max_temp
	 */
	public void setMax_temp(Integer max_temp) {
		this.max_temp = max_temp;
	}

	/**
	 * 
	 * @return The min_temp
	 */
	public Integer getMin_temp() {
		return min_temp;
	}

	/**
	 * 
	 * @param min_temp
	 *            The min_temp
	 */
	public void setMin_temp(Integer min_temp) {
		this.min_temp = min_temp;
	}

	/**
	 * 
	 * @return The dewpt
	 */
	public Integer getDewPt() {
		return dewPt;
	}

	/**
	 * 
	 * @param dewpt
	 *            The dewpt
	 */
	public void setDewPt(Integer dewpt) {
		this.dewPt = dewpt;
	}

	/**
	 * 
	 * @return The rh
	 */
	public Integer getRh() {
		return rh;
	}

	/**
	 * 
	 * @param rh
	 *            The rh
	 */
	public void setRh(Integer rh) {
		this.rh = rh;
	}

	/**
	 * 
	 * @return The feels_like
	 */
	public Integer getFeels_like() {
		return feels_like;
	}

	/**
	 * 
	 * @param feels_like
	 *            The feels_like
	 */
	public void setFeels_like(Integer feels_like) {
		this.feels_like = feels_like;
	}

	/**
	 * 
	 * @return The heat_index
	 */
	public Integer getHeat_index() {
		return heat_index;
	}

	/**
	 * 
	 * @param heat_index
	 *            The heat_index
	 */
	public void setHeat_index(Integer heat_index) {
		this.heat_index = heat_index;
	}

	/**
	 * 
	 * @return The wc
	 */
	public Integer getWc() {
		return wc;
	}

	/**
	 * 
	 * @param wc
	 *            The wc
	 */
	public void setWc(Integer wc) {
		this.wc = wc;
	}

	/**
	 * 
	 * @return The qualifier
	 */
	public String getQualifier() {
		return qualifier;
	}

	/**
	 * 
	 * @param qualifier
	 *            The qualifier
	 */
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	/**
	 * 
	 * @return The qualifier_svrty
	 */
	public String getQualifier_svrty() {
		return qualifier_svrty;
	}

	/**
	 * 
	 * @param qualifier_svrty
	 *            The qualifier_svrty
	 */
	public void setQualifier_svrty(String qualifier_svrty) {
		this.qualifier_svrty = qualifier_svrty;
	}

	/**
	 * 
	 * @return The blunt_phrase
	 */
	public String getBlunt_phrase() {
		return blunt_phrase;
	}

	/**
	 * 
	 * @param blunt_phrase
	 *            The blunt_phrase
	 */
	public void setBlunt_phrase(String blunt_phrase) {
		this.blunt_phrase = blunt_phrase;
	}

	/**
	 * 
	 * @return The terse_phrase
	 */
	public String getTerse_phrase() {
		return terse_phrase;
	}

	/**
	 * 
	 * @param terse_phrase
	 *            The terse_phrase
	 */
	public void setTerse_phrase(String terse_phrase) {
		this.terse_phrase = terse_phrase;
	}

	/**
	 * 
	 * @return The pressure
	 */
	public Integer getPressure() {
		return pressure;
	}

	/**
	 * 
	 * @param pressure
	 *            The pressure
	 */
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	/**
	 * 
	 * @return The clds
	 */
	public String getClds() {
		return clds;
	}

	/**
	 * 
	 * @param clds
	 *            The clds
	 */
	public void setClds(String clds) {
		this.clds = clds;
	}

	/**
	 * 
	 * @return The vis
	 */
	public Integer getVis() {
		return vis;
	}

	/**
	 * 
	 * @param vis
	 *            The vis
	 */
	public void setVis(Integer vis) {
		this.vis = vis;
	}

	/**
	 * 
	 * @return The wspd
	 */
	public Integer getWspd() {
		return wspd;
	}

	/**
	 * 
	 * @param wspd
	 *            The wspd
	 */
	public void setWspd(Integer wspd) {
		this.wspd = wspd;
	}

	/**
	 * 
	 * @return The gust
	 */
	public Integer getGust() {
		return gust;
	}

	/**
	 * 
	 * @param gust
	 *            The gust
	 */
	public void setGust(Integer gust) {
		this.gust = gust;
	}

	/**
	 * 
	 * @return The wdir
	 */
	public Integer getWdir() {
		return wdir;
	}

	/**
	 * 
	 * @param wdir
	 *            The wdir
	 */
	public void setWdir(Integer wdir) {
		this.wdir = wdir;
	}

	/**
	 * 
	 * @return The precip_total
	 */
	public Integer getPrecip_total() {
		return precip_total;
	}

	/**
	 * 
	 * @param precip_total
	 *            The precip_total
	 */
	public void setPrecip_total(Integer precip_total) {
		this.precip_total = precip_total;
	}

	/**
	 * 
	 * @return The precip_hrly
	 */
	public Integer getPrecip_hrly() {
		return precip_hrly;
	}

	/**
	 * 
	 * @param precip_hrly
	 *            The precip_hrly
	 */
	public void setPrecip_hrly(Integer precip_hrly) {
		this.precip_hrly = precip_hrly;
	}

	/**
	 * 
	 * @return The snow_hrly
	 */
	public Integer getSnow_hrly() {
		return snow_hrly;
	}

	/**
	 * 
	 * @param snow_hrly
	 *            The snow_hrly
	 */
	public void setSnow_hrly(Integer snow_hrly) {
		this.snow_hrly = snow_hrly;
	}

	/**
	 * 
	 * @return The uv_index
	 */
	public Integer getUv_index() {
		return uv_index;
	}

	/**
	 * 
	 * @param uv_index
	 *            The uv_index
	 */
	public void setUv_index(Integer uv_index) {
		this.uv_index = uv_index;
	}

	/**
	 * 
	 * @return The uv_desc
	 */
	public String getUv_desc() {
		return uv_desc;
	}

	/**
	 * 
	 * @param uv_desc
	 *            The uv_desc
	 */
	public void setUv_desc(String uv_desc) {
		this.uv_desc = uv_desc;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}