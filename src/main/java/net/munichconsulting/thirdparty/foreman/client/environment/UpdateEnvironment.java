package net.munichconsulting.thirdparty.foreman.client.environment;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.EnvironmentWrapper;


/**
 * Update an environment. (url: PUT /api/environments/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class UpdateEnvironment implements ForemanCommand<EnvironmentWrapper> {
	
	private EnvironmentWrapper wrapper;

	public UpdateEnvironment(EnvironmentWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public EnvironmentWrapper execute(WebTarget target) {
		return target.path("environments").path(wrapper.getEnvironment().getId().toString()).request(MediaType.APPLICATION_JSON)
				.put(Entity.json(wrapper), EnvironmentWrapper.class);
	}

}
