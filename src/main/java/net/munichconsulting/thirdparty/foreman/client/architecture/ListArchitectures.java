package net.munichconsulting.thirdparty.foreman.client.architecture;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ArchitectureWrapper;

/**
 * List all architectures. (url: GET /api/architectures).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ListArchitectures implements ForemanCommand<ArchitectureWrapper[]> {
	
	@Override
	public ArchitectureWrapper[] execute(WebTarget target) {
		return target.path("architectures").request(MediaType.APPLICATION_JSON)
				.get(ArchitectureWrapper[].class);
	}


}
