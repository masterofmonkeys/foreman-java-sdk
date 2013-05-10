package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's PuppetClass definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class PuppetClass implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;
	
	private String name;
	
	private Long id;
	
	@JsonProperty("lookup_keys")
	private List<LookupKey> lookupKeys;

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
	 * @return the lookupKeys
	 */
	public List<LookupKey> getLookupKeys() {
		return lookupKeys;
	}

	/**
	 * @param lookupKeys the lookupKeys to set
	 */
	public void setLookupKeys(List<LookupKey> lookupKeys) {
		this.lookupKeys = lookupKeys;
	}

}
