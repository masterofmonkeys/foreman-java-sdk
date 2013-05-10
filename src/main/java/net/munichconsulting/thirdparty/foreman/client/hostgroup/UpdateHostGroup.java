package net.munichconsulting.thirdparty.foreman.client.hostgroup;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import net.munichconsulting.thirdparty.foreman.client.ForemanCommand;
import net.munichconsulting.thirdparty.foreman.model.HostGroupWrapper;


/**
 * Update an hostgroup. (url: PUT /api/hostgroups/:id).
 * 
 * @author  (mc) munich consulting.
 * @version 1.0.0
 */
public class UpdateHostGroup implements ForemanCommand<HostGroupWrapper> {
	
	private HostGroupWrapper wrapper;

	public UpdateHostGroup(HostGroupWrapper wrapper) {
		this.wrapper = wrapper;
	}	
	
	@Override
	public HostGroupWrapper execute(WebTarget target) {
		return target.path("hostgroups").path(wrapper.getHostGroup().getId().toString()).request(MediaType.APPLICATION_JSON)
				.put(Entity.json(wrapper), HostGroupWrapper.class);
	}

}
