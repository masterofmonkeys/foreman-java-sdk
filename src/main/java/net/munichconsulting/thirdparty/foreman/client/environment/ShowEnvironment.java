package net.munichconsulting.thirdparty.foreman.client.environment;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.EnvironmentWrapper;

/**
 * Show an environment. (url: GET /api/environments/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ShowEnvironment implements ForemanCommand<EnvironmentWrapper> {
	
	private String id;
	
	public ShowEnvironment(String id) {
		this.id = id;
	}
	
	@Override
	public EnvironmentWrapper execute(WebTarget target) {
		return target.path("environments").path(id).request(MediaType.APPLICATION_JSON)
				.get(EnvironmentWrapper.class);
	}


}
