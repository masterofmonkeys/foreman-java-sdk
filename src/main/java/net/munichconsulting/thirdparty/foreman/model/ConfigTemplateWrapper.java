package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code ConfigTemplate} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */

public class ConfigTemplateWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("config_template")
	private ConfigTemplate configTemplate;

	/**
	 * @return the configTemplate
	 */
	public ConfigTemplate getConfigTemplate() {
		return configTemplate;
	}

	/**
	 * @param configTemplate the configTemplate to set
	 */
	public void setConfigTemplate(ConfigTemplate configTemplate) {
		this.configTemplate = configTemplate;
	}
	
	

}
