package net.munichconsulting.thirdparty.foreman.client.audit;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.AuditWrapper;

/**
 * Show an audit. (url: GET /api/audits/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ShowAudit implements ForemanCommand<AuditWrapper> {
	
	private String id;
	
	public ShowAudit(String id) {
		this.id = id;
	}
	
	@Override
	public AuditWrapper execute(WebTarget target) {
		return target.path("audits").path(id).request(MediaType.APPLICATION_JSON)
				.get(AuditWrapper.class);
	}


}
