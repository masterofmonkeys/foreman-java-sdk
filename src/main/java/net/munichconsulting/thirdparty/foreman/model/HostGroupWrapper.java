package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code HostGroup} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class HostGroupWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("hostgroup")
	private HostGroup hostGroup;

	/**
	 * @return the hostGroup
	 */
	public HostGroup getHostGroup() {
		return hostGroup;
	}

	/**
	 * @param hostGroup the hostGroup to set
	 */
	public void setHostGroup(HostGroup hostGroup) {
		this.hostGroup = hostGroup;
	}
	
}
