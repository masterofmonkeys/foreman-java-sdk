package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's Audit definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Audit implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("auditable_name")
	private String auditableName;
	
	@JsonProperty("user_id")
	private String userId;
	
	@JsonProperty("associated_id")
	private Long associatedId;
	
	@JsonProperty("associated_name")
	private String associatedName;

	private Long id;

	private String comment;
	
	@JsonProperty("auditable_id")
	private Long auditableId;
	
	@JsonProperty("auditable_type")
	private String auditableType;

	@JsonProperty("associated_type")
	private String associatedType;
	
	@JsonProperty("remote_address")
	private String remoteAddress;
	
	
	private String action;
	
	@JsonProperty("audited_changes")
	private AuditedChanges auditedChanges;

	@JsonProperty("user_type")
	private String userType;
	
	private Long version;
	
	@JsonProperty("created_at")
	private String createdAt;

	/**
	 * Foreman's AuditChanges definition.
	 * @version 1.0.0
	 */
	public static class AuditedChanges {
		
		@JsonProperty("architecture_id")
		private List<Long> architectureId;

		/**
		 * @return the architectureId
		 */
		public List<Long> getArchitectureId() {
			return architectureId;
		}

		/**
		 * @param architectureId the architectureId to set
		 */
		public void setArchitectureId(List<Long> architectureId) {
			this.architectureId = architectureId;
		}
	}

	/**
	 * @return the auditableName
	 */
	public String getAuditableName() {
		return auditableName;
	}

	/**
	 * @param auditableName the auditableName to set
	 */
	public void setAuditableName(String auditableName) {
		this.auditableName = auditableName;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the associatedId
	 */
	public Long getAssociatedId() {
		return associatedId;
	}

	/**
	 * @param associatedId the associatedId to set
	 */
	public void setAssociatedId(Long associatedId) {
		this.associatedId = associatedId;
	}

	/**
	 * @return the associatedName
	 */
	public String getAssociatedName() {
		return associatedName;
	}

	/**
	 * @param associatedName the associatedName to set
	 */
	public void setAssociatedName(String associatedName) {
		this.associatedName = associatedName;
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
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the auditableId
	 */
	public Long getAuditableId() {
		return auditableId;
	}

	/**
	 * @param auditableId the auditableId to set
	 */
	public void setAuditableId(Long auditableId) {
		this.auditableId = auditableId;
	}

	/**
	 * @return the auditableType
	 */
	public String getAuditableType() {
		return auditableType;
	}

	/**
	 * @param auditableType the auditableType to set
	 */
	public void setAuditableType(String auditableType) {
		this.auditableType = auditableType;
	}

	/**
	 * @return the associatedType
	 */
	public String getAssociatedType() {
		return associatedType;
	}

	/**
	 * @param associatedType the associatedType to set
	 */
	public void setAssociatedType(String associatedType) {
		this.associatedType = associatedType;
	}

	/**
	 * @return the remoteAddress
	 */
	public String getRemoteAddress() {
		return remoteAddress;
	}

	/**
	 * @param remoteAddress the remoteAddress to set
	 */
	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the auditedChanges
	 */
	public AuditedChanges getAuditedChanges() {
		return auditedChanges;
	}

	/**
	 * @param auditedChanges the auditedChanges to set
	 */
	public void setAuditedChanges(AuditedChanges auditedChanges) {
		this.auditedChanges = auditedChanges;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Long version) {
		this.version = version;
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

	

}
