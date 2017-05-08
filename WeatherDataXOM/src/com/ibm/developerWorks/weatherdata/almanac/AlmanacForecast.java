package com.ibm.developerWorks.weatherdata.almanac;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibm.developerWorks.weatherdata.Metadata;

public class AlmanacForecast {

	private Metadata metadata;
	private List<Almanac> almanac_summaries = new ArrayList<Almanac>();;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * 
	 * @param metadata
	 *            The metadata
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * 
	 * @return The forecasts
	 */
	public List<Almanac> getAlmanac_summaries() {
		return almanac_summaries;
	}

	/**
	 * 
	 * @param forecasts
	 *            The forecasts
	 */
	public void setAlmanac_summaries(List<Almanac>  almanac) {
		this.almanac_summaries = almanac;
	}


	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}