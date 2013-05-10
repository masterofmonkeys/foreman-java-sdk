package net.munichconsulting.thirdparty.foreman.client.audit;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.AuditWrapper;

/**
 * Show an audit for a given host. (url: GET /api/hosts/:id/audits).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class ShowAuditForHost implements ForemanCommand<AuditWrapper> {

	private String id;

	public ShowAuditForHost(String id) {
		this.id = id;
	}

	@Override
	public AuditWrapper execute(WebTarget target) {
		return target.path("hosts").path(id).path("audits")
				.request(MediaType.APPLICATION_JSON).get(AuditWrapper.class);
	}

}
