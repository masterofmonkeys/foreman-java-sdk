package net.munichconsulting.thirdparty.foreman.client.host;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostWrapper;

/**
 * List all hostgroups. (url: GET /api/hosts).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ListHosts implements ForemanCommand<HostWrapper[]> {
	
	@Override
	public HostWrapper[] execute(WebTarget target) {
		return target.path("hosts").request(MediaType.APPLICATION_JSON)
				.get(HostWrapper[].class);
	}


}
