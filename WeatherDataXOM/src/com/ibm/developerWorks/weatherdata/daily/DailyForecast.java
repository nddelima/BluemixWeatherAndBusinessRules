package com.ibm.developerWorks.weatherdata.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibm.developerWorks.weatherdata.Metadata;

public class DailyForecast {

	private Metadata metadata;
	private List<Forecast> forecasts = new ArrayList<Forecast>();
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
	public List<Forecast> getForecasts() {
		return forecasts;
	}

	/**
	 * 
	 * @param forecasts
	 *            The forecasts
	 */
	public void setForecasts(List<Forecast> forecasts) {
		this.forecasts = forecasts;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}