package net.munichconsulting.thirdparty.foreman.client.host;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostWrapper;

/**
 * Creates an host. (url: POST /api/hosts).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class CreateHost implements ForemanCommand<HostWrapper> {
	
	private HostWrapper wrapper;

	public CreateHost(HostWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public HostWrapper execute(WebTarget target) {
		return target.path("hosts").request(MediaType.APPLICATION_JSON)
				.post(Entity.json(wrapper), HostWrapper.class);
	}

}
