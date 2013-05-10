package net.munichconsulting.thirdparty.foreman.client.environment;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.EnvironmentWrapper;


/**
 * Delete an environment. (url: DELETE /api/environments/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class DeleteEnvironment implements ForemanCommand<EnvironmentWrapper> {
	
	private String id;
	
	public DeleteEnvironment(String id) {
		this.id = id;
	}
	
	@Override
	public EnvironmentWrapper execute(WebTarget target) {
		return target.path("environment").path(id).request(MediaType.APPLICATION_JSON)
				.delete(EnvironmentWrapper.class);
	}

}
