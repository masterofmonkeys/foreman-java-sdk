package net.munichconsulting.thirdparty.foreman.client.host;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostWrapper;

/**
 * Show an host. (url: GET /api/hosts/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ShowHost implements ForemanCommand<HostWrapper> {
	
	private String id;
	
	public ShowHost(String id) {
		this.id = id;
	}
	
	@Override
	public HostWrapper execute(WebTarget target) {
		return target.path("hosts").path(id).request(MediaType.APPLICATION_JSON)
				.get(HostWrapper.class);
	}


}
