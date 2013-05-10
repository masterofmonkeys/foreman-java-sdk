package net.munichconsulting.thirdparty.foreman.client.architecture;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ArchitectureWrapper;


/**
 * Delete an host. (url: DELETE /api/architectures/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class DeleteArchitecture implements ForemanCommand<ArchitectureWrapper> {
	
	private String id;
	
	public DeleteArchitecture(String id) {
		this.id = id;
	}
	
	@Override
	public ArchitectureWrapper execute(WebTarget target) {
		return target.path("architectures").path(id).request(MediaType.APPLICATION_JSON)
				.delete(ArchitectureWrapper.class);
	}

}
