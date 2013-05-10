package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code Architecture} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */

public class ArchitectureWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("architecture")
	private Architecture architecture;

	/**
	 * @return the architecture
	 */
	public Architecture getArchitecture() {
		return architecture;
	}

	/**
	 * @param architecture the architecture to set
	 */
	public void setArchitecture(Architecture architecture) {
		this.architecture = architecture;
	}
	
	

}
