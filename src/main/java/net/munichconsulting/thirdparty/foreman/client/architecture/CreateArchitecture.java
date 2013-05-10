package net.munichconsulting.thirdparty.foreman.client.architecture;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ArchitectureWrapper;

/**
 * Creates an architecture. (url: POST /api/architectures).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class CreateArchitecture implements ForemanCommand<ArchitectureWrapper> {
	
	private ArchitectureWrapper wrapper;

	public CreateArchitecture(ArchitectureWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public ArchitectureWrapper execute(WebTarget target) {
		return target.path("architectures").request(MediaType.APPLICATION_JSON)
				.post(Entity.json(wrapper), ArchitectureWrapper.class);
	}

}
