package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

/**
 * Foreman's CommonParameter definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class CommonParameter implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private String value;
	
	private String name;
	
	private Long id;

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

	
	
}
