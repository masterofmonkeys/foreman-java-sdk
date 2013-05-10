package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's AuthSourceLdap definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class AuthSourceLdap implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	private String name;
	
	@JsonProperty("attr_lastname")
	private String attrLastname;

	private Long port;
	
	@JsonProperty("attr_firstname")
	private String attrFirstname;
	
	@JsonProperty("attr_login")
	private String attrLogin;

	private Boolean tls;

	private Long id;
	
	@JsonProperty("updated_at")
	private String updatedAt;

	private String host;
	
	@JsonProperty("base_dn")
	private String baseDn;
	
	@JsonProperty("attr_mail")
	private String attrMail;

	private String account;
	
	private String type;
	
	@JsonProperty("created_at")
	private String createdAt;
	
	@JsonProperty("onthefly_register")
	private Boolean ontheflyRegister;

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
	 * @return the attrLastname
	 */
	public String getAttrLastname() {
		return attrLastname;
	}
	/**
	 * @param attrLastname the attrLastname to set
	 */
	public void setAttrLastname(String attrLastname) {
		this.attrLastname = attrLastname;
	}
	/**
	 * @return the port
	 */
	public Long getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(Long port) {
		this.port = port;
	}
	/**
	 * @return the attrFirstname
	 */
	public String getAttrFirstname() {
		return attrFirstname;
	}
	/**
	 * @param attrFirstname the attrFirstname to set
	 */
	public void setAttrFirstname(String attrFirstname) {
		this.attrFirstname = attrFirstname;
	}
	/**
	 * @return the attrLogin
	 */
	public String getAttrLogin() {
		return attrLogin;
	}
	/**
	 * @param attrLogin the attrLogin to set
	 */
	public void setAttrLogin(String attrLogin) {
		this.attrLogin = attrLogin;
	}
	/**
	 * @return the tls
	 */
	public Boolean isTls() {
		return tls;
	}
	/**
	 * @param tls the tls to set
	 */
	public void setTls(Boolean tls) {
		this.tls = tls;
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
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * @return the baseDn
	 */
	public String getBaseDn() {
		return baseDn;
	}
	/**
	 * @param baseDn the baseDn to set
	 */
	public void setBaseDn(String baseDn) {
		this.baseDn = baseDn;
	}
	/**
	 * @return the attrMail
	 */
	public String getAttrMail() {
		return attrMail;
	}
	/**
	 * @param attrMail the attrMail to set
	 */
	public void setAttrMail(String attrMail) {
		this.attrMail = attrMail;
	}
	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	/**
	 * @return the ontheflyRegister
	 */
	public Boolean isOntheflyRegister() {
		return ontheflyRegister;
	}
	/**
	 * @param ontheflyRegister the ontheflyRegister to set
	 */
	public void setOntheflyRegister(Boolean ontheflyRegister) {
		this.ontheflyRegister = ontheflyRegister;
	}



}
