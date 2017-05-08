package com.ibm.developerWorks.weatherdata.alert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibm.developerWorks.weatherdata.Metadata;

public class AlertNotification {

	private Metadata metadata;
	private List<Alert> alerts = new ArrayList<Alert>();
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
	 * @return The alerts
	 */
	public List<Alert> getAlerts() {
		return alerts;
	}

	/**
	 * 
	 * @param alerts
	 *            The alerts
	 */
	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
