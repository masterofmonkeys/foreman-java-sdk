package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's Host definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Host  implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;
 	
	private String name;
	
	private Long id;
	
	@JsonProperty("operatingsystem_id")
	private Long operatingSystemId;

	@JsonProperty("hostgroup_id")
	private Long hostGroupId;

	@JsonProperty("host_parameters")
	private List<HostParameterWrapper> hostParameters;
	
	@JsonProperty("installed_at")
	private String installedAt;
	
	@JsonProperty("image_file")
	private String imageFile;
	
	@JsonProperty("sp_ip")
	private String spIp;
	
	@JsonProperty("sp_name")
	private String spName;
	
	@JsonProperty("last_report")
	private String lastReport;

	private String ip;

	private Boolean enabled;
	
	@JsonProperty("puppet_ca_proxy_id")
	private Long puppetcaProxyId;
	
	@JsonProperty("certname")
	private String certName;
	
	@JsonProperty("medium_id")
	private Long mediumId;

	@JsonProperty("model_id")
	private Long modelId;

	private String comment;

	@JsonProperty("sp_mac")
	private String spMac;

	private String uuid;

	private String mac;

	@JsonProperty("use_image")
	private Long useImage;

	@JsonProperty("owner_id")
	private Long ownerId;

	@JsonProperty("environment_id")
	private Long environmentId;	
	
	private Boolean build;
	
	@JsonProperty("subnet_id")
	private Long subnetId;		
	
	@JsonProperty("domain_id")
	private Long domainId;
	
	@JsonProperty("sp_subnet_id")
	private Long spSubnetId;
	
	@JsonProperty("puppet_proxy_id")
	private Long puppetProxyId;
	
	private EnvironmentWrapper environment;
	
	@JsonProperty("ptable_id")
	private Long ptableId;
	
	@JsonProperty("architecture_id")
	private Long architectureId;

	@JsonProperty("image_id")
	private Long imageId;

	@JsonProperty("compute_resource_id")
	private Long computeResourceId;

	private Boolean managed;
	
	private String disk;
	
	@JsonProperty("owner_type")
	private String ownerType;
	
	@JsonProperty("updated_at")
	private String updatedAt;
	
	@JsonProperty("created_at")
	private String createdAt;
	
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
	 * @return the hostGroupId
	 */
	public Long getHostGroupId() {
		return hostGroupId;
	}

	/**
	 * @param hostGroupId the hostGroupId to set
	 */
	public void setHostGroupId(Long hostGroupId) {
		this.hostGroupId = hostGroupId;
	}

	/**
	 * @return the hostParameters
	 */
	public List<HostParameterWrapper> getHostParameters() {
		return hostParameters;
	}

	/**
	 * @param hostParameters the hostParameters to set
	 */
	public void setHostParameters(List<HostParameterWrapper> hostParameters) {
		this.hostParameters = hostParameters;
	}

	/**
	 * @return the installedAt
	 */
	public String getInstalledAt() {
		return installedAt;
	}

	/**
	 * @param installedAt the installedAt to set
	 */
	public void setInstalledAt(String installedAt) {
		this.installedAt = installedAt;
	}

	/**
	 * @return the imageFile
	 */
	public String getImageFile() {
		return imageFile;
	}

	/**
	 * @param imageFile the imageFile to set
	 */
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	/**
	 * @return the spIp
	 */
	public String getSpIp() {
		return spIp;
	}

	/**
	 * @param spIp the spIp to set
	 */
	public void setSpIp(String spIp) {
		this.spIp = spIp;
	}

	/**
	 * @return the spName
	 */
	public String getSpName() {
		return spName;
	}

	/**
	 * @param spName the spName to set
	 */
	public void setSpName(String spName) {
		this.spName = spName;
	}

	/**
	 * @return the lastReport
	 */
	public String getLastReport() {
		return lastReport;
	}

	/**
	 * @param lastReport the lastReport to set
	 */
	public void setLastReport(String lastReport) {
		this.lastReport = lastReport;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the puppetcaProxyId
	 */
	public Long getPuppetcaProxyId() {
		return puppetcaProxyId;
	}

	/**
	 * @param puppetcaProxyId the puppetcaProxyId to set
	 */
	public void setPuppetcaProxyId(Long puppetcaProxyId) {
		this.puppetcaProxyId = puppetcaProxyId;
	}

	/**
	 * @return the certName
	 */
	public String getCertName() {
		return certName;
	}

	/**
	 * @param certName the certName to set
	 */
	public void setCertName(String certName) {
		this.certName = certName;
	}

	/**
	 * @return the mediumId
	 */
	public Long getMediumId() {
		return mediumId;
	}

	/**
	 * @param mediumId the mediumId to set
	 */
	public void setMediumId(Long mediumId) {
		this.mediumId = mediumId;
	}

	/**
	 * @return the modelId
	 */
	public Long getModelId() {
		return modelId;
	}

	/**
	 * @param modelId the modelId to set
	 */
	public void setModelId(Long modelId) {
		this.modelId = modelId;
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
	 * @return the spMac
	 */
	public String getSpMac() {
		return spMac;
	}

	/**
	 * @param spMac the spMac to set
	 */
	public void setSpMac(String spMac) {
		this.spMac = spMac;
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * @param mac the mac to set
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}

	/**
	 * @return the useImage
	 */
	public Long getUseImage() {
		return useImage;
	}

	/**
	 * @param useImage the useImage to set
	 */
	public void setUseImage(Long useImage) {
		this.useImage = useImage;
	}

	/**
	 * @return the ownerId
	 */
	public Long getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
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
	 * @return the build
	 */
	public Boolean getBuild() {
		return build;
	}

	/**
	 * @param build the build to set
	 */
	public void setBuild(Boolean build) {
		this.build = build;
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
	 * @return the spSubnetId
	 */
	public Long getSpSubnetId() {
		return spSubnetId;
	}

	/**
	 * @param spSubnetId the spSubnetId to set
	 */
	public void setSpSubnetId(Long spSubnetId) {
		this.spSubnetId = spSubnetId;
	}

	/**
	 * @return the puppetProxyId
	 */
	public Long getPuppetProxyId() {
		return puppetProxyId;
	}

	/**
	 * @param puppetProxyId the puppetProxyId to set
	 */
	public void setPuppetProxyId(Long puppetProxyId) {
		this.puppetProxyId = puppetProxyId;
	}

	/**
	 * @return the environment
	 */
	public EnvironmentWrapper getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(EnvironmentWrapper environment) {
		this.environment = environment;
	}

	/**
	 * @return the ptableId
	 */
	public Long getPtableId() {
		return ptableId;
	}

	/**
	 * @param ptableId the ptableId to set
	 */
	public void setPtableId(Long ptableId) {
		this.ptableId = ptableId;
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

	/**
	 * @return the imageId
	 */
	public Long getImageId() {
		return imageId;
	}

	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	/**
	 * @return the computeResourceId
	 */
	public Long getComputeResourceId() {
		return computeResourceId;
	}

	/**
	 * @param computeResourceId the computeResourceId to set
	 */
	public void setComputeResourceId(Long computeResourceId) {
		this.computeResourceId = computeResourceId;
	}

	/**
	 * @return the managed
	 */
	public Boolean getManaged() {
		return managed;
	}

	/**
	 * @param managed the managed to set
	 */
	public void setManaged(Boolean managed) {
		this.managed = managed;
	}

	/**
	 * @return the disk
	 */
	public String getDisk() {
		return disk;
	}

	/**
	 * @param disk the disk to set
	 */
	public void setDisk(String disk) {
		this.disk = disk;
	}

	/**
	 * @return the ownerType
	 */
	public String getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
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
