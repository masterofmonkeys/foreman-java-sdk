package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code Environment} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class EnvironmentWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("environment")
	private Environment environment;

	/**
	 * @return the architecture
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
	

}
