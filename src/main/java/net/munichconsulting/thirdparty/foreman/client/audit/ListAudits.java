package net.munichconsulting.thirdparty.foreman.client.audit;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.AuditWrapper;

/**
 * List all audits. (url: GET /api/audits).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ListAudits implements ForemanCommand<AuditWrapper[]> {
	
	@Override
	public AuditWrapper[] execute(WebTarget target) {
		return target.path("audits").request(MediaType.APPLICATION_JSON)
				.get(AuditWrapper[].class);
	}

}
