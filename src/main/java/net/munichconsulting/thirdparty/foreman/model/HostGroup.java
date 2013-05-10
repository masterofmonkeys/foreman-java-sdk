package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's HostGroup definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class HostGroup  implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	public HostGroup() {} 
	
	public HostGroup(HostGroup template) {
		
		this.operatingSystemId = template.getOperatingSystemId();
		this.subnetId = template.getSubnetId();
		this.ancestry = template.getAncestry();
		this.environmentId = template.getEnvironmentId();
		this.domainId = template.getDomainId();
		this.architectureId = template.getArchitectureId();
	//	this.parameters = template.getParameters();
	}
	
	private String name;
	
	private String label;
	
	private Long id;
	
	@JsonProperty("operatingsystem_id")
	private Long operatingSystemId;
	
	private String ancestry;
	
	@JsonProperty("environment_id")
	private Long environmentId;
	
	private Map<String, String> parameters;
	
	@JsonProperty("subnet_id")
	private Long subnetId;
	
	@JsonProperty("domain_id")
	private Long domainId;
	
	@JsonProperty("puppetclass_ids")
	private List<Long> puppetClassIds;

	@JsonProperty("architecture_id")
	private Long architectureId;
	
	
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
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
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
	 * @return the operatingSystemId
	 */
	public Long getOperatingSystemId() {
		return operatingSystemId;
	}

	/**
	 * @param operatingSystemId the operatingSystemId to set
	 */
	public void setOperatingSystemId(Long operatingSystemId) {
		this.operatingSystemId = operatingSystemId;
	}

	/**
	 * @return the ancestry
	 */
	public String getAncestry() {
		return ancestry;
	}

	/**
	 * @param ancestry the ancestry to set
	 */
	public void setAncestry(String ancestry) {
		this.ancestry = ancestry;
	}

	/**
	 * @return the environmentId
	 */
	public Long getEnvironmentId() {
		return environmentId;
	}

	/**
	 * @param environmentId the environmentId to set
	 */
	public void setEnvironmentId(Long environmentId) {
		this.environmentId = environmentId;
	}

	/**
	 * @return the parameters
	 */
	public Map<String, String> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return the subnetId
	 */
	public Long getSubnetId() {
		return subnetId;
	}

	/**
	 * @param subnetId the subnetId to set
	 */
	public void setSubnetId(Long subnetId) {
		this.subnetId = subnetId;
	}

	/**
	 * @return the domainId
	 */
	public Long getDomainId() {
		return domainId;
	}

	/**
	 * @param domainId the domainId to set
	 */
	public void setDomainId(Long domainId) {
		this.domainId = domainId;
	}

	/**
	 * @return the puppetClassIds
	 */
	public List<Long> getPuppetClassIds() {
		return puppetClassIds;
	}

	/**
	 * @param puppetClassIds the puppetClassIds to set
	 */
	public void setPuppetClassIds(List<Long> puppetClassIds) {
		this.puppetClassIds = puppetClassIds;
	}

	/**
	 * @return the architectureId
	 */
	public Long getArchitectureId() {
		return architectureId;
	}

	/**
	 * @param architectureId the architectureId to set
	 */
	public void setArchitectureId(Long architectureId) {
		this.architectureId = architectureId;
	}
	

}
