package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostGroupWrapper;

/**
 * Show an hostgroup. (url: GET /api/hostgroups/:id).
 * 
 * @author intuiko
 * @version 1.0.0
 */
public class ShowHostGroup implements ForemanCommand<HostGroupWrapper> {
	
	private String id;
	
	public ShowHostGroup(String id) {
		this.id = id;
	}
	
	@Override
	public HostGroupWrapper execute(WebTarget target) {
		return target.path("hostgroups").path(id).request(MediaType.APPLICATION_JSON)
				.get(HostGroupWrapper.class);
	}


}
