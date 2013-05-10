package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostGroupWrapper;

/**
 * List all hostgroups. (url: GET /api/hostgroups).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class ListHostGroups implements ForemanCommand<HostGroupWrapper[]> {
	
	@Override
	public HostGroupWrapper[] execute(WebTarget target) {
		return target.path("hostgroups").request(MediaType.APPLICATION_JSON)
				.get(HostGroupWrapper[].class);
	}


}
