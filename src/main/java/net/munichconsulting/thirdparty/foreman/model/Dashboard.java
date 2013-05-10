package net.munichconsulting.thirdparty.foreman.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Foreman's Dashboard definition.
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class Dashboard implements Serializable {

	/** Serial version uid. */
	private static final long serialVersionUID = 1000000000001L;

	@JsonProperty("disabled_hosts")
	private Integer disabledHosts;

	@JsonProperty("ok_hosts")
	private Integer okHosts;

	@JsonProperty("good_hosts")
	private Integer goodHosts;

	@JsonProperty("active_hosts_ok")
	private Integer activeHostsOk;

	@JsonProperty("pending_hosts_enabled")
	private Integer pendingHostsEnabled;

	@JsonProperty("active_hosts_ok_enabled")
	private Integer activeHostsOkEnabled;

	@JsonProperty("good_hosts_enabled")
	private Integer goodHostsEnabled;

	@JsonProperty("active_hosts")
	private Integer activeHosts;

	private Integer percentage;

	@JsonProperty("out_of_sync_hosts")
	private Integer outOfSyncHosts;

	@JsonProperty("total_hosts")
	private Integer totalHosts;

	@JsonProperty("bad_hosts")
	private Integer badHosts;

	@JsonProperty("out_of_sync_hosts_enabled")
	private Integer outOfSyncHostsEnabled;

	@JsonProperty("pending_hosts")
	private Integer pendingHosts;

	@JsonProperty("bad_hosts_enabled")
	private Integer badHostsEnabled;

	@JsonProperty("ok_hosts_enabled")
	private Integer okHostsEnabled;

	@JsonProperty("reports_missing")
	private Integer reportsMissing;

	/**
	 * @return the disabledHosts
	 */
	public Integer getDisabledHosts() {
		return disabledHosts;
	}

	/**
	 * @param disabledHosts
	 *            the disabledHosts to set
	 */
	public void setDisabledHosts(Integer disabledHosts) {
		this.disabledHosts = disabledHosts;
	}

	/**
	 * @return the okHosts
	 */
	public Integer getOkHosts() {
		return okHosts;
	}

	/**
	 * @param okHosts
	 *            the okHosts to set
	 */
	public void setOkHosts(Integer okHosts) {
		this.okHosts = okHosts;
	}

	/**
	 * @return the goodHosts
	 */
	public Integer getGoodHosts() {
		return goodHosts;
	}

	/**
	 * @param goodHosts
	 *            the goodHosts to set
	 */
	public void setGoodHosts(Integer goodHosts) {
		this.goodHosts = goodHosts;
	}

	/**
	 * @return the activeHostsOk
	 */
	public Integer getActiveHostsOk() {
		return activeHostsOk;
	}

	/**
	 * @param activeHostsOk
	 *            the activeHostsOk to set
	 */
	public void setActiveHostsOk(Integer activeHostsOk) {
		this.activeHostsOk = activeHostsOk;
	}

	/**
	 * @return the pendingHostsEnabled
	 */
	public Integer getPendingHostsEnabled() {
		return pendingHostsEnabled;
	}

	/**
	 * @param pendingHostsEnabled
	 *            the pendingHostsEnabled to set
	 */
	public void setPendingHostsEnabled(Integer pendingHostsEnabled) {
		this.pendingHostsEnabled = pendingHostsEnabled;
	}

	/**
	 * @return the activeHostsOkEnabled
	 */
	public Integer getActiveHostsOkEnabled() {
		return activeHostsOkEnabled;
	}

	/**
	 * @param activeHostsOkEnabled
	 *            the activeHostsOkEnabled to set
	 */
	public void setActiveHostsOkEnabled(Integer activeHostsOkEnabled) {
		this.activeHostsOkEnabled = activeHostsOkEnabled;
	}

	/**
	 * @return the goodHostsEnabled
	 */
	public Integer getGoodHostsEnabled() {
		return goodHostsEnabled;
	}

	/**
	 * @param goodHostsEnabled
	 *            the goodHostsEnabled to set
	 */
	public void setGoodHostsEnabled(Integer goodHostsEnabled) {
		this.goodHostsEnabled = goodHostsEnabled;
	}

	/**
	 * @return the activeHosts
	 */
	public Integer getActiveHosts() {
		return activeHosts;
	}

	/**
	 * @param activeHosts
	 *            the activeHosts to set
	 */
	public void setActiveHosts(Integer activeHosts) {
		this.activeHosts = activeHosts;
	}

	/**
	 * @return the percentage
	 */
	public Integer getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage
	 *            the percentage to set
	 */
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	/**
	 * @return the outOfSyncHosts
	 */
	public Integer getOutOfSyncHosts() {
		return outOfSyncHosts;
	}

	/**
	 * @param outOfSyncHosts
	 *            the outOfSyncHosts to set
	 */
	public void setOutOfSyncHosts(Integer outOfSyncHosts) {
		this.outOfSyncHosts = outOfSyncHosts;
	}

	/**
	 * @return the totalHosts
	 */
	public Integer getTotalHosts() {
		return totalHosts;
	}

	/**
	 * @param totalHosts
	 *            the totalHosts to set
	 */
	public void setTotalHosts(Integer totalHosts) {
		this.totalHosts = totalHosts;
	}

	/**
	 * @return the badHosts
	 */
	public Integer getBadHosts() {
		return badHosts;
	}

	/**
	 * @param badHosts
	 *            the badHosts to set
	 */
	public void setBadHosts(Integer badHosts) {
		this.badHosts = badHosts;
	}

	/**
	 * @return the outOfSyncHostsEnabled
	 */
	public Integer getOutOfSyncHostsEnabled() {
		return outOfSyncHostsEnabled;
	}

	/**
	 * @param outOfSyncHostsEnabled
	 *            the outOfSyncHostsEnabled to set
	 */
	public void setOutOfSyncHostsEnabled(Integer outOfSyncHostsEnabled) {
		this.outOfSyncHostsEnabled = outOfSyncHostsEnabled;
	}

	/**
	 * @return the pendingHosts
	 */
	public Integer getPendingHosts() {
		return pendingHosts;
	}

	/**
	 * @param pendingHosts
	 *            the pendingHosts to set
	 */
	public void setPendingHosts(Integer pendingHosts) {
		this.pendingHosts = pendingHosts;
	}

	/**
	 * @return the badHostsEnabled
	 */
	public Integer getBadHostsEnabled() {
		return badHostsEnabled;
	}

	/**
	 * @param badHostsEnabled
	 *            the badHostsEnabled to set
	 */
	public void setBadHostsEnabled(Integer badHostsEnabled) {
		this.badHostsEnabled = badHostsEnabled;
	}

	/**
	 * @return the okHostsEnabled
	 */
	public Integer getOkHostsEnabled() {
		return okHostsEnabled;
	}

	/**
	 * @param okHostsEnabled
	 *            the okHostsEnabled to set
	 */
	public void setOkHostsEnabled(Integer okHostsEnabled) {
		this.okHostsEnabled = okHostsEnabled;
	}

	/**
	 * @return the reportsMissing
	 */
	public Integer getReportsMissing() {
		return reportsMissing;
	}

	/**
	 * @param reportsMissing
	 *            the reportsMissing to set
	 */
	public void setReportsMissing(Integer reportsMissing) {
		this.reportsMissing = reportsMissing;
	}


}
