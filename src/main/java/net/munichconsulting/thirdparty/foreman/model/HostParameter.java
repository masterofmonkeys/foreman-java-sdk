package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

/**
 * Foreman's HostParameter definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class HostParameter implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private String name;
	
	private Long id;

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
