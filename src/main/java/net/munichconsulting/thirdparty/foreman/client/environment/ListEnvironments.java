package net.munichconsulting.thirdparty.foreman.client.environment;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.EnvironmentWrapper;

/**
 * List all environments. (url: GET /api/environments).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ListEnvironments implements ForemanCommand<EnvironmentWrapper[]> {
	
	@Override
	public EnvironmentWrapper[] execute(WebTarget target) {
		return target.path("environments").request(MediaType.APPLICATION_JSON)
				.get(EnvironmentWrapper[].class);
	}


}
