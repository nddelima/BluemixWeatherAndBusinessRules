package com.ibm.developerWorks.weatherdata.daily;

import java.util.HashMap;
import java.util.Map;

public class Daily {
	//private String _class;
	private Integer expire_time_gmt;
	private Integer fcst_valid;
	private String fcst_valid_local;
	private String day_ind;
	private Integer thunder_enum;
	private String thunder_enum_phrase;
	private String daypart_name;
	private String long_daypart_name;
	private String alt_daypart_name;
	private Integer num;
	private Integer temp;
	private String temp_phrase;
	private Integer hi;
	private Integer wc;
	private Integer pop;
	private String pop_phrase;
	private Integer icon_extd;
	private Integer icon_code;
	private String wxman;
	private String phrase_32char;
	private String phrase_22char;
	private String phrase_12char;
	private String subphrase_pt1;
	private String subphrase_pt2;
	private String subphrase_pt3;
	private String precip_type;
	private Integer rh;
	private Integer wspd;
	private Integer wdir;
	private String wdir_cardinal;
	private String wind_phrase;
	private Integer clds;
	private String shortcast;
	private String narrative;
	private Integer qpf;
	private String accumulation_phrase;
	private Integer snow_qpf;
	private Integer snow_range;
	private String snow_phrase;
	private String snow_code;
	private String vocal_key;
	private String qualifier;
	private String qualifier_code;
	private Integer uv_index_raw;
	private Integer uv_index;
	private String uv_desc;
	private Integer uv_warning;
	private Integer golf_index;
	private String golf_category;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	*
	* @return
	* The _class
	
	public String getClass_() {
	return _class;
	}
    */
	/**
	*
	* @param _class
	* The class
	
	public void setClass_(String _class) {
	this._class = _class;
	}
    */
	
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
	public Integer getFcst_valid() {
	return fcst_valid;
	}

	/**
	*
	* @param fcst_valid
	* The fcst_valid
	*/
	public void setFcst_valid(Integer fcst_valid) {
	this.fcst_valid = fcst_valid;
	}

	/**
	*
	* @return
	* The fcst_valid_local
	*/
	public String getFcst_valid_local() {
	return fcst_valid_local;
	}

	/**
	*
	* @param fcst_valid_local
	* The fcst_valid_local
	*/
	public void setFcst_valid_local(String fcst_valid_local) {
	this.fcst_valid_local = fcst_valid_local;
	}

	/**
	*
	* @return
	* The day_ind
	*/
	public String getDay_ind() {
	return day_ind;
	}

	/**
	*
	* @param day_ind
	* The day_ind
	*/
	public void setDay_ind(String day_ind) {
	this.day_ind = day_ind;
	}

	/**
	*
	* @return
	* The thunder_enum
	*/
	public Integer getThunder_enum() {
	return thunder_enum;
	}

	/**
	*
	* @param thunder_enum
	* The thunder_enum
	*/
	public void setThunder_enum(Integer thunder_enum) {
	this.thunder_enum = thunder_enum;
	}

	/**
	*
	* @return
	* The thunder_enum_phrase
	*/
	public String getThunder_enum_phrase() {
	return thunder_enum_phrase;
	}

	/**
	*
	* @param thunder_enum_phrase
	* The thunder_enum_phrase
	*/
	public void setThunder_enum_phrase(String thunder_enum_phrase) {
	this.thunder_enum_phrase = thunder_enum_phrase;
	}

	/**
	*
	* @return
	* The daypart_name
	*/
	public String getDaypart_name() {
	return daypart_name;
	}

	/**
	*
	* @param daypart_name
	* The daypart_name
	*/
	public void setDaypart_name(String daypart_name) {
	this.daypart_name = daypart_name;
	}

	/**
	*
	* @return
	* The long_daypart_name
	*/
	public String getLong_daypart_name() {
	return long_daypart_name;
	}

	/**
	*
	* @param long_daypart_name
	* The long_daypart_name
	*/
	public void setLong_daypart_name(String long_daypart_name) {
	this.long_daypart_name = long_daypart_name;
	}

	/**
	*
	* @return
	* The alt_daypart_name
	*/
	public String getAlt_daypart_name() {
	return alt_daypart_name;
	}

	/**
	*
	* @param alt_daypart_name
	* The alt_ daypart_name
	*/
	public void setAlt_daypart_name(String alt_daypart_name) {
	this.alt_daypart_name = alt_daypart_name;
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
	* The temp
	*/
	public Integer getTemp() {
	return temp;
	}

	/**
	*
	* @param temp
	* The temp
	*/
	public void setTemp(Integer temp) {
	this.temp = temp;
	}

	/**
	*
	* @return
	* The temp_phrase
	*/
	public String getTemp_phrase() {
	return temp_phrase;
	}

	/**
	*
	* @param temp_phrase
	* The temp_phrase
	*/
	public void setTemp_phrase(String temp_phrase) {
	this.temp_phrase = temp_phrase;
	}

	/**
	*
	* @return
	* The hi
	*/
	public Integer getHi() {
	return hi;
	}

	/**
	*
	* @param hi
	* The hi
	*/
	public void setHi(Integer hi) {
	this.hi = hi;
	}

	/**
	*
	* @return
	* The wc
	*/
	public Integer getWc() {
	return wc;
	}

	/**
	*
	* @param wc
	* The wc
	*/
	public void setWc(Integer wc) {
	this.wc = wc;
	}

	/**
	*
	* @return
	* The pop
	*/
	public Integer getPop() {
	return pop;
	}

	/**
	*
	* @param pop
	* The pop
	*/
	public void setPop(Integer pop) {
	this.pop = pop;
	}

	/**
	*
	* @return
	* The pop_phrase
	*/
	public String getPop_phrase() {
	return pop_phrase;
	}

	/**
	*
	* @param pop_phrase
	* The pop_phrase
	*/
	public void setPop_phrase(String pop_phrase) {
	this.pop_phrase = pop_phrase;
	}

	/**
	*
	* @return
	* The icon_extd
	*/
	public Integer getIcon_extd() {
	return icon_extd;
	}

	/**
	*
	* @param icon_extd
	* The icon_extd
	*/
	public void setIcon_extd(Integer icon_extd) {
	this.icon_extd = icon_extd;
	}

	/**
	*
	* @return
	* The icon_code
	*/
	public Integer getIcon_code() {
	return icon_code;
	}

	/**
	*
	* @param icon_code
	* The icon_code
	*/
	public void setIcon_code(Integer icon_code) {
	this.icon_code = icon_code;
	}

	/**
	*
	* @return
	* The wxman
	*/
	public String getWxman() {
	return wxman;
	}

	/**
	*
	* @param wxman
	* The wxman
	*/
	public void setWxman(String wxman) {
	this.wxman = wxman;
	}

	/**
	*
	* @return
	* The phrase_32char
	*/
	public String getPhrase_32char() {
	return phrase_32char;
	}

	/**
	*
	* @param phrase_32char
	* The phrase_32char
	*/
	public void setPhrase_32char(String phrase_32char) {
	this.phrase_32char = phrase_32char;
	}

	/**
	*
	* @return
	* The phrase_22char
	*/
	public String getPhrase_22char() {
	return phrase_22char;
	}

	/**
	*
	* @param phrase_22char
	* The phrase_22char
	*/
	public void setPhrase_22char(String phrase_22char) {
	this.phrase_22char = phrase_22char;
	}

	/**
	*
	* @return
	* The phrase_12char
	*/
	public String getPhrase_12char() {
	return phrase_12char;
	}

	/**
	*
	* @param phrase_12char
	* The phrase_12char
	*/
	public void setPhrase_12char(String phrase_12char) {
	this.phrase_12char = phrase_12char;
	}

	/**
	*
	* @return
	* The subphrase_pt1
	*/
	public String getSubphrase_pt1() {
	return subphrase_pt1;
	}

	/**
	*
	* @param subphrase_pt1
	* The subphrase_pt1
	*/
	public void setSubphrase_pt1(String subphrase_pt1) {
	this.subphrase_pt1 = subphrase_pt1;
	}

	/**
	*
	* @return
	* The subphrase_pt2
	*/
	public String getSubphrase_pt2() {
	return subphrase_pt2;
	}

	/**
	*
	* @param subphrase_pt2
	* The subphrase_pt2
	*/
	public void setSubphrase_pt2(String subphrase_pt2) {
	this.subphrase_pt2 = subphrase_pt2;
	}

	/**
	*
	* @return
	* The subphrase_pt3
	*/
	public String getSubphrase_pt3() {
	return subphrase_pt3;
	}

	/**
	*
	* @param subphrase_pt3
	* The subphrase_pt3
	*/
	public void setSubphrase_pt3(String subphrase_pt3) {
	this.subphrase_pt3 = subphrase_pt3;
	}

	/**
	*
	* @return
	* The precip_type
	*/
	public String getPrecip_type() {
	return precip_type;
	}

	/**
	*
	* @param precip_type
	* The precip_type
	*/
	public void setPrecip_type(String precip_type) {
	this.precip_type = precip_type;
	}

	/**
	*
	* @return
	* The rh
	*/
	public Integer getRh() {
	return rh;
	}

	/**
	*
	* @param rh
	* The rh
	*/
	public void setRh(Integer rh) {
	this.rh = rh;
	}

	/**
	*
	* @return
	* The wspd
	*/
	public Integer getWspd() {
	return wspd;
	}

	/**
	*
	* @param wspd
	* The wspd
	*/
	public void setWspd(Integer wspd) {
	this.wspd = wspd;
	}

	/**
	*
	* @return
	* The wdir
	*/
	public Integer getWdir() {
	return wdir;
	}

	/**
	*
	* @param wdir
	* The wdir
	*/
	public void setWdir(Integer wdir) {
	this.wdir = wdir;
	}

	/**
	*
	* @return
	* The wdir_cardinal
	*/
	public String getWdir_cardinal() {
	return wdir_cardinal;
	}

	/**
	*
	* @param wdir_cardinal
	* The wdir_cardinal
	*/
	public void setWdir_cardinal(String wdir_cardinal) {
	this.wdir_cardinal = wdir_cardinal;
	}

	/**
	*
	* @return
	* The wind_phrase
	*/
	public String getWind_phrase() {
	return wind_phrase;
	}

	/**
	*
	* @param wind_phrase
	* The wind_phrase
	*/
	public void setWind_phrase(String wind_phrase) {
	this.wind_phrase = wind_phrase;
	}

	/**
	*
	* @return
	* The clds
	*/
	public Integer getClds() {
	return clds;
	}

	/**
	*
	* @param clds
	* The clds
	*/
	public void setClds(Integer clds) {
	this.clds = clds;
	}

	/**
	*
	* @return
	* The shortcast
	*/
	public String getShortcast() {
	return shortcast;
	}

	/**
	*
	* @param shortcast
	* The shortcast
	*/
	public void setShortcast(String shortcast) {
	this.shortcast = shortcast;
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
	* The accumulation_phrase
	*/
	public String getAccumulation_phrase() {
	return accumulation_phrase;
	}

	/**
	*
	* @param accumulation_phrase
	* The accumulation_phrase
	*/
	public void setAccumulation_phrase(String accumulation_phrase) {
	this.accumulation_phrase = accumulation_phrase;
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
	public Integer getSnow_range() {
	return snow_range;
	}

	/**
	*
	* @param snow_range
	* The snow_range
	*/
	public void setSnow_range(Integer snow_range) {
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
	* The vocal_key
	*/
	public String getVocal_key() {
	return vocal_key;
	}

	/**
	*
	* @param vocal_key
	* The vocal_key
	*/
	public void setVocal_key(String vocal_key) {
	this.vocal_key = vocal_key;
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
	* The uv_index_raw
	*/
	public Integer getUv_index_raw() {
	return uv_index_raw;
	}

	/**
	*
	* @param uv_index_raw
	* The uv_index_raw
	*/
	public void setUv_index_raw(Integer uv_index_raw) {
	this.uv_index_raw = uv_index_raw;
	}

	/**
	*
	* @return
	* The uv_index
	*/
	public Integer getUv_index() {
	return uv_index;
	}

	/**
	*
	* @param uv_index
	* The uv_index
	*/
	public void setUv_index(Integer uv_index) {
	this.uv_index = uv_index;
	}

	/**
	*
	* @return
	* The uv_desc
	*/
	public String getUv_desc() {
	return uv_desc;
	}

	/**
	*
	* @param uv_desc
	* The uv_desc
	*/
	public void setUv_desc(String uv_desc) {
	this.uv_desc = uv_desc;
	}

	/**
	*
	* @return
	* The uv_warning
	*/
	public Integer getUv_warning() {
	return uv_warning;
	}

	/**
	*
	* @param uv_warning
	* The uv_warning
	*/
	public void setUv_warning(Integer uv_warning) {
	this.uv_warning = uv_warning;
	}

	/**
	*
	* @return
	* The golf_index
	*/
	public Integer getGolf_index() {
	return golf_index;
	}

	/**
	*
	* @param golf_index
	* The golf_index
	*/
	public void setGolf_index(Integer golf_index) {
	this.golf_index = golf_index;
	}

	/**
	*
	* @return
	* The golf_category
	*/
	public String getGolf_category() {
	return golf_category;
	}

	/**
	*
	* @param golf_category
	* The golf_category
	*/
	public void setGolf_category(String golf_category) {
	this.golf_category = golf_category;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}
