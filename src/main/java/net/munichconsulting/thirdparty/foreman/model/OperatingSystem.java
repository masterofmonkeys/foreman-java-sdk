package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's OperatingSystem definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class OperatingSystem implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;
	
	private String name;
	
	private Long id;
	
	private String minor;
	
	private String family;
	
	@JsonProperty("ptables")
	private List<PTableWrapper> ptables;
	
	@JsonProperty("architectures")
	private List<ArchitectureWrapper> architectures;

	@JsonProperty("config_templates")
	private List<ConfigTemplateWrapper> configTemplates;

	@JsonProperty("release_name")
	private String releaseName;
	
	private String major;
	

	@JsonProperty("media")
	private List<MediaWrapper> media;


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
	 * @return the minor
	 */
	public String getMinor() {
		return minor;
	}


	/**
	 * @param minor the minor to set
	 */
	public void setMinor(String minor) {
		this.minor = minor;
	}


	/**
	 * @return the family
	 */
	public String getFamily() {
		return family;
	}


	/**
	 * @param family the family to set
	 */
	public void setFamily(String family) {
		this.family = family;
	}


	/**
	 * @return the ptables
	 */
	public List<PTableWrapper> getPtables() {
		return ptables;
	}


	/**
	 * @param ptables the ptables to set
	 */
	public void setPtables(List<PTableWrapper> ptables) {
		this.ptables = ptables;
	}


	/**
	 * @return the architectures
	 */
	public List<ArchitectureWrapper> getArchitectures() {
		return architectures;
	}


	/**
	 * @param architectures the architectures to set
	 */
	public void setArchitectures(List<ArchitectureWrapper> architectures) {
		this.architectures = architectures;
	}


	/**
	 * @return the configTemplates
	 */
	public List<ConfigTemplateWrapper> getConfigTemplates() {
		return configTemplates;
	}


	/**
	 * @param configTemplates the configTemplates to set
	 */
	public void setConfigTemplates(List<ConfigTemplateWrapper> configTemplates) {
		this.configTemplates = configTemplates;
	}


	/**
	 * @return the releaseName
	 */
	public String getReleaseName() {
		return releaseName;
	}


	/**
	 * @param releaseName the releaseName to set
	 */
	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}


	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}


	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}


	/**
	 * @return the media
	 */
	public List<MediaWrapper> getMedia() {
		return media;
	}


	/**
	 * @param media the media to set
	 */
	public void setMedia(List<MediaWrapper> media) {
		this.media = media;
	}
	
	
	
}
