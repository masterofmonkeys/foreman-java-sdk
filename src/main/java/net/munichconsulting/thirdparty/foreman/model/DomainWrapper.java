package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code Domain} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */

public class DomainWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("domain")
	private Domain domain;

	/**
	 * @return the domain
	 */
	public Domain getDomain() {
		return domain;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	
	

}
