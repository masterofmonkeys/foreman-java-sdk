package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's LookupKey definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class LookupKey implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private Long id;

	private String description;
	
	private String key;
	
	@JsonProperty("default_value")
	private String defaultValue;
	
	private Boolean override;
	
	@JsonProperty("is_param")
	private Boolean param;
	
	private Boolean required;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the defaultValue
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * @param defaultValue the defaultValue to set
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * @return the override
	 */
	public Boolean getOverride() {
		return override;
	}

	/**
	 * @param override the override to set
	 */
	public void setOverride(Boolean override) {
		this.override = override;
	}

	/**
	 * @return the param
	 */
	public Boolean getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(Boolean param) {
		this.param = param;
	}

	/**
	 * @return the required
	 */
	public Boolean getRequired() {
		return required;
	}

	/**
	 * @param required the required to set
	 */
	public void setRequired(Boolean required) {
		this.required = required;
	}

}
