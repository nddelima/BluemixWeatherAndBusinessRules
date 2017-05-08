package com.ibm.developerWorks.weatherdata.alert;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Category {

	private String category;
	private Integer category_cd;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 
	 * @param category
	 *            The category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 
	 * @return The category_cd
	 */
	public Integer getCategory_cd() {
		return category_cd;
	}

	/**
	 * 
	 * @param category_cd
	 *            The category_cd
	 */
	public void setCategory_cd(Integer category_cd) {
		this.category_cd = category_cd;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
