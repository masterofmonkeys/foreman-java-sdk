package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's Architecture definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Architecture implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private String name;
	
	private Long id;
	
	@JsonProperty("updated_at")
	private String updatedAt;
	
	@JsonProperty("operatingsystem_ids")
	private List<Long> operatingsystemIds;
	
	@JsonProperty("created_at")
	private String createdAt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Long> getOperatingsystemIds() {
		return operatingsystemIds;
	}

	public void setOperatingsystemIds(List<Long> operatingsystemIds) {
		this.operatingsystemIds = operatingsystemIds;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(final String createdAt) {
		this.createdAt = createdAt;
	}

	
}
