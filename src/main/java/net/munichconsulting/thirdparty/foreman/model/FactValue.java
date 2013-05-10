package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;


/**
 * Foreman's FactValue definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class FactValue implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("ip_address")
	private String ipAddress;
	
	@JsonProperty("kernel_version")
	private String kernelVersion;

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the kernelVersion
	 */
	public String getKernelVersion() {
		return kernelVersion;
	}

	/**
	 * @param kernelVersion the kernelVersion to set
	 */
	public void setKernelVersion(String kernelVersion) {
		this.kernelVersion = kernelVersion;
	}
	

}
