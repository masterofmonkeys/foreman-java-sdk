package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's Image definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Image implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private String name;
	
	private Long id;
	
	private String uuid;	
	
	private String username;	
	
	@JsonProperty("operatingsystem_id")
	private Long operatingSystemId;

	@JsonProperty("architecture_id")
	private Long architectureId;

	@JsonProperty("compute_resource_id")
	private Long computeResourceId;
	
	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("updated_at")
	private String updatedAt;

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
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the operatingSystemId
	 */
	public Long getOperatingSystemId() {
		return operatingSystemId;
	}

	/**
	 * @param operatingSystemId the operatingSystemId to set
	 */
	public void setOperatingSystemId(Long operatingSystemId) {
		this.operatingSystemId = operatingSystemId;
	}

	/**
	 * @return the architectureId
	 */
	public Long getArchitectureId() {
		return architectureId;
	}

	/**
	 * @param architectureId the architectureId to set
	 */
	public void setArchitectureId(Long architectureId) {
		this.architectureId = architectureId;
	}

	/**
	 * @return the computeResourceId
	 */
	public Long getComputeResourceId() {
		return computeResourceId;
	}

	/**
	 * @param computeResourceId the computeResourceId to set
	 */
	public void setComputeResourceId(Long computeResourceId) {
		this.computeResourceId = computeResourceId;
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
