package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code CommonParameter} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */

public class CommonParameterWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("common_parameter")
	private CommonParameter commonParameter;

	/**
	 * @return the commonParameter
	 */
	public CommonParameter getCommonParameter() {
		return commonParameter;
	}

	/**
	 * @param commonParameter the commonParameter to set
	 */
	public void setCommonParameter(CommonParameter commonParameter) {
		this.commonParameter = commonParameter;
	}
	
	

}
