package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;


/**
 * Foreman's HostGroup/Parameter definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Parameter  implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private Long id;

	private String name;
	
	private String value;

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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
