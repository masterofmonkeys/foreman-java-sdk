package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code TemplateKind} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class TemplateKindWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("template_kind")
	private TemplateKind templateKind;

	/**
	 * @return the templateKind
	 */
	public TemplateKind getTemplateKind() {
		return templateKind;
	}

	/**
	 * @param templateKind the templateKind to set
	 */
	public void setTemplateKind(TemplateKind templateKind) {
		this.templateKind = templateKind;
	}
	
}
