package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code LookupKey} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class LookupKeyWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("lookup_key")
	private LookupKey key;

	/**
	 * @return the key
	 */
	public LookupKey getLookupKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setLookupKey(LookupKey key) {
		this.key = key;
	}
	
}
