package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;


/**
 * {@code HostParameter} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class HostParameterWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("host_parameter")
	private HostParameter hostParameter;

	/**
	 * @return the hostParameter
	 */
	public HostParameter getHostParameter() {
		return hostParameter;
	}

	/**
	 * @param hostGroup the hostGroup to set
	 */
	public void setHostParameter(HostParameter hostParameter) {
		this.hostParameter = hostParameter;
	}
	
}
