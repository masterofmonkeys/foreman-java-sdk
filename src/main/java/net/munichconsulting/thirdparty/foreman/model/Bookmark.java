package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's Bookmark definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Bookmark implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private String name;

	private String query;

	private Long id;

	@JsonProperty("owner_id")
	private Long ownerId;

	@JsonProperty("public")
	private Boolean internalPublic;

	private String controller;

	@JsonProperty("owner_type")
	private String ownerType;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query
	 *            the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the ownerId
	 */
	public Long getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId
	 *            the ownerId to set
	 */
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * @return the internalPublic
	 */
	public Boolean isInternalPublic() {
		return internalPublic;
	}

	/**
	 * @param internalPublic
	 *            the internalPublic to set
	 */
	public void setInternalPublic(Boolean internalPublic) {
		this.internalPublic = internalPublic;
	}

	/**
	 * @return the controller
	 */
	public String getController() {
		return controller;
	}

	/**
	 * @param controller
	 *            the controller to set
	 */
	public void setController(String controller) {
		this.controller = controller;
	}

	/**
	 * @return the ownerType
	 */
	public String getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType
	 *            the ownerType to set
	 */
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

}
