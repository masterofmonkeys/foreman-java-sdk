package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code PuppetClass} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class PuppetClassWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("puppetclass")
	private PuppetClass puppetClass;

	/**
	 * @return the puppetClass
	 */
	public PuppetClass getPuppetClass() {
		return puppetClass;
	}

	/**
	 * @param puppetClass the puppetClass to set
	 */
	public void setPuppetClass(PuppetClass puppetClass) {
		this.puppetClass = puppetClass;
	}
	
}
