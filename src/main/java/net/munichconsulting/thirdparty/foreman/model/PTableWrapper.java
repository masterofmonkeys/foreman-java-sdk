package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@code PTable} container.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class PTableWrapper implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("ptable")
	private PTable pTable;

	/**
	 * @return the pTable
	 */
	public PTable getPTable() {
		return pTable;
	}

	/**
	 * @param pTable the pTable to set
	 */
	public void setPTable(PTable pTable) {
		this.pTable = pTable;
	}
	
}
