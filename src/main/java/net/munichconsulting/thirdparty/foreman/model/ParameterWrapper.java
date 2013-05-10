package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

/**
 * {@code Parameter} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class ParameterWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private Parameter parameter;

	/**
	 * @return the parameter
	 */
	public Parameter getParameter() {
		return parameter;
	}

	/**
	 * @param parameter the parameter to set
	 */
	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}
	
}
