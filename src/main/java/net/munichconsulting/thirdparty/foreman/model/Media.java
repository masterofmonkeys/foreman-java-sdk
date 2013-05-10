package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

/**
 * Foreman's Media definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Media implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private Long id;

	private String media;
	
	private String path;

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
	 * @return the media
	 */
	public String getMedia() {
		return media;
	}

	/**
	 * @param media the media to set
	 */
	public void setMedia(String media) {
		this.media = media;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	
}
