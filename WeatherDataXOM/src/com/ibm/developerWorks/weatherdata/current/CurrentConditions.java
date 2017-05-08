package com.ibm.developerWorks.weatherdata.current;

import java.util.HashMap;
import java.util.Map;

import com.ibm.developerWorks.weatherdata.Metadata;

public class CurrentConditions {

	private Metadata metadata;
	private Observation observation;
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
	 * @return The observation
	 */
	public Observation getObservation() {
		return observation;
	}

	/**
	 * 
	 * @param observation
	 *            The observation
	 */
	public void setObservation(Observation observation) {
		this.observation = observation;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}