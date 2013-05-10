package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's ConfigTemplate definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class ConfigTemplate implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("name")
	private String name;

	@JsonProperty("audit_comment")
	private String auditComment;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("template")
	private String template;

	@JsonProperty("snippet")
	private String snippet;

	@JsonProperty("template_kind")
	private TemplateKind templateKind;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the auditComment
	 */
	public String getAuditComment() {
		return auditComment;
	}

	/**
	 * @param auditComment
	 *            the auditComment to set
	 */
	public void setAuditComment(String auditComment) {
		this.auditComment = auditComment;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the template
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *            the template to set
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * @return the snippet
	 */
	public String getSnippet() {
		return snippet;
	}

	/**
	 * @param snippet
	 *            the snippet to set
	 */
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	/**
	 * @return the templateKind
	 */
	public TemplateKind getTemplateKind() {
		return templateKind;
	}

	/**
	 * @param templateKind
	 *            the templateKind to set
	 */
	public void setTemplateKind(TemplateKind templateKind) {
		this.templateKind = templateKind;
	}

}
