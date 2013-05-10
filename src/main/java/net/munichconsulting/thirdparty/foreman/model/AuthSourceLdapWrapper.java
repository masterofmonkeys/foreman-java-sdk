package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code AuthSourceLdap} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class AuthSourceLdapWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("auth_source_ldap")
	private AuthSourceLdap authSourceLdap;

	/**
	 * @return the authSourceLdap
	 */
	public AuthSourceLdap getAuthSourceLdap() {
		return authSourceLdap;
	}

	/**
	 * @param authSourceLdap the authSourceLdap to set
	 */
	public void setAuthSourceLdap(AuthSourceLdap authSourceLdap) {
		this.authSourceLdap = authSourceLdap;
	}
	
	

}
