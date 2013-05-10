package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's Domain definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Domain implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;
	
	private String name;
	
	private Long id;
	
	@JsonProperty("dns_id")
	private Long dnsId;
	
	@JsonProperty("fullname")
	private String fullName;
	
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
	 * @return the dnsId
	 */
	public Long getDnsId() {
		return dnsId;
	}

	/**
	 * @param dnsId the dnsId to set
	 */
	public void setDnsId(Long dnsId) {
		this.dnsId = dnsId;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
