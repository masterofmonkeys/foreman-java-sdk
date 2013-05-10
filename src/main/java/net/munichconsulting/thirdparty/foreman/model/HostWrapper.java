package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code Host} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class HostWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("host")
	private Host host;

	/**
	 * @return the host
	 */
	public Host getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(Host host) {
		this.host = host;
	}
	
}
