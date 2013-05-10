package net.munichconsulting.thirdparty.foreman.client.environment;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.EnvironmentWrapper;

/**
 * Creates an environment. (url: POST /api/environments).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class CreateEnvironment implements ForemanCommand<EnvironmentWrapper> {
	
	private EnvironmentWrapper wrapper;

	public CreateEnvironment(EnvironmentWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public EnvironmentWrapper execute(WebTarget target) {
		return target.path("environments").request(MediaType.APPLICATION_JSON)
				.post(Entity.json(wrapper), EnvironmentWrapper.class);
	}

}
