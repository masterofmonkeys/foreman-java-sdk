package net.munichconsulting.thirdparty.foreman.client.dashboard;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.Dashboard;

/**
 * Get dashboard results. (url: GET /api/dashboard).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class GetDashboard implements ForemanCommand<Dashboard> {
	
	@Override
	public Dashboard execute(WebTarget target) {
		return target.path("dashboard").request(MediaType.APPLICATION_JSON)
				.get(Dashboard.class);
	}

}
