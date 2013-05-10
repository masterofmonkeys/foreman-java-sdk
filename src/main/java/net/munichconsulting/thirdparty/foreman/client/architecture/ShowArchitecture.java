package net.munichconsulting.thirdparty.foreman.client.architecture;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.ArchitectureWrapper;

/**
 * Show an architecture. (url: GET /api/architectures/:id).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class ShowArchitecture implements ForemanCommand<ArchitectureWrapper> {
	
	private String id;
	
	public ShowArchitecture(String id) {
		this.id = id;
	}
	
	@Override
	public ArchitectureWrapper execute(WebTarget target) {
		return target.path("architectures").path(id).request(MediaType.APPLICATION_JSON)
				.get(ArchitectureWrapper.class);
	}


}
