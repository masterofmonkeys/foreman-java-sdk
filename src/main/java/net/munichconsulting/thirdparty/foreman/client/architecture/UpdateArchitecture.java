package net.munichconsulting.thirdparty.foreman.client.architecture;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ArchitectureWrapper;


/**
 * Update an architecture. (url: PUT /api/architectures/:id).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class UpdateArchitecture implements ForemanCommand<ArchitectureWrapper> {
	
	private ArchitectureWrapper wrapper;

	public UpdateArchitecture(ArchitectureWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public ArchitectureWrapper execute(WebTarget target) {
		return target.path("architectures").path(wrapper.getArchitecture().getId().toString()).request(MediaType.APPLICATION_JSON)
				.put(Entity.json(wrapper), ArchitectureWrapper.class);
	}

}
