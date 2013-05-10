package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code ComputeResource} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */

public class ComputeResourceWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("compute_resource")
	private ComputeResource computeResource;

	/**
	 * @return the computeResource
	 */
	public ComputeResource getComputeResource() {
		return computeResource;
	}

	/**
	 * @param computeResource the computeResource to set
	 */
	public void setComputeResource(ComputeResource computeResource) {
		this.computeResource = computeResource;
	}
	
	

}
