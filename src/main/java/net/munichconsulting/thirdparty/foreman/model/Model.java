package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's Model definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Model implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private Long id;

	private String name;
	
	private String info;

	@JsonProperty("vendor_class")
	private String vendorClass;
	
	@JsonProperty("hardware_model")
	private String hardwareModel;
	
	
	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("updated_at")
	private String updatedAt;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * @return the vendorClass
	 */
	public String getVendorClass() {
		return vendorClass;
	}

	/**
	 * @param vendorClass the vendorClass to set
	 */
	public void setVendorClass(String vendorClass) {
		this.vendorClass = vendorClass;
	}

	/**
	 * @return the hardwareModel
	 */
	public String getHardwareModel() {
		return hardwareModel;
	}

	/**
	 * @param hardwareModel the hardwareModel to set
	 */
	public void setHardwareModel(String hardwareModel) {
		this.hardwareModel = hardwareModel;
	}

	/**
	 * @return the createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	
}
